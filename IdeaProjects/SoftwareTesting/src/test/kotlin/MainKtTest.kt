import com.google.common.truth.Truth.assertThat
import org.example.divide
import org.example.evenOrNull
import org.junit.Ignore
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertNull

class MainKtTest {

//    @Test
//    fun `should return true when list has the same number in different sign`() {
//        // Given
//        val input = listOf(1, 2, -2, 3, 4)
//
//        // When
//        val result = hasDuplicatesIgnoreSign(input)
//
//        // Then
//        assertThat(result).isTrue()
//    }
//
//    @Disabled("This test should not run this test")
//    fun `should return false when list has no duplicate`() {
//        // Given
//        val input = listOf(-1, 2, 3, 4, 5)
//
//        // When
//        val result = hasDuplicatesIgnoreSign(input)
//
//        // Then
//        assertThat(result).isFalse()
//    }
//
//    @Test
//    fun `should return true when list has large numbers duplicated`() {
//        // Given
//        val input = listOf(10, -10, 20, -20, 30)
//
//        // When
//        val result = hasDuplicatesIgnoreSign(input)
//    }
    @Test
    fun `should return null when number is not Even`() {
        //Given
        val oddNumber=5
        // when
        val result = evenOrNull(oddNumber)
        //Then
        assertNull(result)
    }
    @Test
    fun `should throw arthmetic exception when seconde number is zero`() {
        val firstNumber=3
        val secondNumber=0
        assertThrows<ArithmeticException> {
            divide(firstNumber, secondNumber)
        }
    }
}