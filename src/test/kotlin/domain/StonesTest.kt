package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StonesTest {

    @Test
    fun `스톤들의 정보를 담고 있다`() {
        val stonePosition = StonePosition.from(1, 1)!!
        val stoneType = StoneType.BLACK
        val stones = TestStones(
            Stone(stonePosition, stoneType),
        )
        assertThat(stones.values[0].position).isEqualTo(stonePosition)
        assertThat(stones.values[0].type).isEqualTo(stoneType)
    }

    class TestStones(vararg stones: Stone) : Stones(*stones)
}
