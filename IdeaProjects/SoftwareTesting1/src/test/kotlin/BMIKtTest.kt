import com.google.common.truth.Truth.assertThat
import org.example.IllegalHeightInput
import org.example.IllegalWeightInput
import org.example.calculateBodyMassIndex
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import kotlin.test.Test

class BMIKtTest {
@Test
fun `should throw IllegalWeightInput when weight is Zero`(){
    //Gevin
    val height= 1.75
    val weight= 0.0

    assertThrows<IllegalWeightInput>{
        calculateBodyMassIndex(weight,height)
    }
}

    @Test
    fun `should throw IllegalWeightInput when weight is negative`(){
        //Gevin
        val height= 1.75
        val weight= -40.0

        assertThrows<IllegalWeightInput>{
            calculateBodyMassIndex(weight,height)
        }
    }

    @Test
    fun `should throw IllegalWeightInput when height is Zero`(){
        //Gevin
        val height= 0.0
        val weight= 50.5

        assertThrows<IllegalWeightInput>{
            calculateBodyMassIndex(weight,height)
        }
    }

    @Test
    fun `should throw IllegalWeightInput when height is negative`(){
        //Gevin
        val height= -55.0
        val weight= 55.5

        assertThrows< IllegalHeightInput>{
            calculateBodyMassIndex(weight,height)
        }
    }
    @Test
    fun `should return correct value for under weight when input are correct`(){
        //Gevin
        val height= 1.75
        val weight= 50.0

        val bmiresult = calculateBodyMassIndex(weight,height)
        assertThat(bmiresult).isWithin(0.01).of(16.23)
    }
    @Test
    fun `should return correct value for under normal when input are correct`(){
        //Gevin
        val height= 1.75
        val weight= 65.0

        val bmiresult = calculateBodyMassIndex(weight,height)
        assertThat(bmiresult).isWithin(0.01).of(21.22)
    }
    @Test
    fun `should return correct value for under over weight when input are correct`(){
        //Gevin
        val height= 1.75
        val weight= 80.0

        val bmiresult = calculateBodyMassIndex(weight,height)
        assertThat(bmiresult).isWithin(0.01).of(26.12)
    }

}