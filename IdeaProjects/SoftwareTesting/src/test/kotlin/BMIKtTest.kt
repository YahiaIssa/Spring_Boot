import com.google.common.truth.Truth.assertThat
import org.example.IllegalHeightInput
import org.example.IllegalWeightInput
import org.example.calculateBodyMassIndex
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.Test

class BMIKtTest {

    @Test
    fun `should throw IllegalWeightInput when weight is Zero`(){
        val height = 1.75
        val weight = 0.0
        assertThrows<IllegalWeightInput>{
            calculateBodyMassIndex(weight, height)
        }
    }

    @Test
    fun `should throw IllegalWeightInput when weight is negative`(){
        val height = 1.75
        val weight = -40.0
        assertThrows<IllegalWeightInput>{
            calculateBodyMassIndex(weight, height)
        }
    }

    @Test
    fun `should throw IllegalWeightInput when height is Zero`(){
        val height = 0.0
        val weight = 50.5
        assertThrows<IllegalWeightInput>{
            calculateBodyMassIndex(weight, height)
        }
    }

    @Test
    fun `should throw IllegalHeightInput when height is negative`(){
        val height = -55.0
        val weight = 55.5
        assertThrows<IllegalHeightInput>{
            calculateBodyMassIndex(weight, height)
        }
    }

    @Test
    fun `should return correct value for under weight when input are correct`(){
        val height = 1.75
        val weight = 50.0
        val bmiResult = calculateBodyMassIndex(weight, height)
        assertThat(bmiResult).isWithin(0.01).of(16.32) // صححت الرقم بناءً على معادلة BMI
    }

    @ParameterizedTest
    @CsvSource(
        "1.75,80.0,26.12",
        "1.75,65.0,21.22",
        "1.75,50.0,16.32"
    )
    fun `should return correct value for every input when input are correct`(
        height: Double,
        weight: Double,
        expectedBmi: Double
    ){
        val bmi = calculateBodyMassIndex(weight, height)
        // إضافة .of(expectedBmi) كانت مفقودة
        assertThat(bmi).isWithin(0.01).of(expectedBmi)
    }

    companion object {
        private const val BMI_TOLERANCE = 0.01
    }
}