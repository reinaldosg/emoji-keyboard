package br.com.edsilfer.emojilibrary.model

import android.util.SparseIntArray
import br.com.edsilfer.emojilibrary.R
import br.com.edsilfer.emojilibrary.model.Emoji.Companion.from

object People {
    @JvmField
    val DATA = arrayOf(
            from(0x1f604),
            from(0x1f603),
            from(0x1f600),
            from(0x1f60a),
            from(0x263a.toChar()),
            from(0x1f609),
            from(0x1f60d),
            from(0x1f618),
            from(0x1f61a),
            from(0x1f617),
            from(0x1f619),
            from(0x1f61c),
            from(0x1f61d),
            from(0x1f61b),
            from(0x1f633),
            from(0x1f601),
            from(0x1f614),
            from(0x1f60c),
            from(0x1f612),
            from(0x1f61e),
            from(0x1f623),
            from(0x1f622),
            from(0x1f602),
            from(0x1f62d),
            from(0x1f62a),
            from(0x1f625),
            from(0x1f630),
            from(0x1f605),
            from(0x1f613),
            from(0x1f629),
            from(0x1f62b),
            from(0x1f628),
            from(0x1f631),
            from(0x1f620),
            from(0x1f621),
            from(0x1f624),
            from(0x1f616),
            from(0x1f606),
            from(0x1f60b),
            from(0x1f637),
            from(0x1f60e),
            from(0x1f634),
            from(0x1f635),
            from(0x1f632),
            from(0x1f61f),
            from(0x1f626),
            from(0x1f627),
            from(0x1f608),
            from(0x1f47f),
            from(0x1f62e),
            from(0x1f62c),
            from(0x1f610),
            from(0x1f615),
            from(0x1f62f),
            from(0x1f636),
            from(0x1f607),
            from(0x1f60f),
            from(0x1f611),
            from(0x1f472),
            from(0x1f473),
            from(0x1f46e),
            from(0x1f477),
            from(0x1f482),
            from(0x1f476),
            from(0x1f466),
            from(0x1f467),
            from(0x1f468),
            from(0x1f469),
            from(0x1f474),
            from(0x1f475),
            from(0x1f471),
            from(0x1f47c),
            from(0x1f478),
            from(0x1f63a),
            from(0x1f638),
            from(0x1f63b),
            from(0x1f63d),
            from(0x1f63c),
            from(0x1f640),
            from(0x1f63f),
            from(0x1f639),
            from(0x1f63e),
            from(0x1f479),
            from(0x1f47a),
            from(0x1f648),
            from(0x1f649),
            from(0x1f64a),
            from(0x1f480),
            from(0x1f47d),
            from(0x1f4a9),
            from(0x1f525),
            from(0x2728.toChar()),
            from(0x1f31f),
            from(0x1f4ab),
            from(0x1f4a5),
            from(0x1f4a2),
            from(0x1f4a6),
            from(0x1f4a7),
            from(0x1f4a4),
            from(0x1f4a8),
            from(0x1f442),
            from(0x1f440),
            from(0x1f443),
            from(0x1f445),
            from(0x1f444),
            from(0x1f44d),
            from(0x1f44e),
            from(0x1f44c),
            from(0x1f44a),
            from(0x270a.toChar()),
            from(0x270c.toChar()),
            from(0x1f44b),
            from(0x270b.toChar()),
            from(0x1f450),
            from(0x1f446),
            from(0x1f447),
            from(0x1f449),
            from(0x1f448),
            from(0x1f64c),
            from(0x1f64f),
            from(0x261d.toChar()),
            from(0x1f44f),
            from(0x1f4aa),
            from(0x1f6b6),
            from(0x1f3c3),
            from(0x1f483),
            from(0x1f46b),
            from(0x1f46a),
            from(0x1f46c),
            from(0x1f46d),
            from(0x1f48f),
            from(0x1f491),
            from(0x1f46f),
            from(0x1f646),
            from(0x1f645),
            from(0x1f481),
            from(0x1f64b),
            from(0x1f486),
            from(0x1f487),
            from(0x1f485),
            from(0x1f470),
            from(0x1f64e),
            from(0x1f64d),
            from(0x1f647),
            from(0x1f3a9),
            from(0x1f451),
            from(0x1f452),
            from(0x1f45f),
            from(0x1f45e),
            from(0x1f461),
            from(0x1f460),
            from(0x1f462),
            from(0x1f455),
            from(0x1f454),
            from(0x1f45a),
            from(0x1f457),
            from(0x1f3bd),
            from(0x1f456),
            from(0x1f458),
            from(0x1f459),
            from(0x1f4bc),
            from(0x1f45c),
            from(0x1f45d),
            from(0x1f45b),
            from(0x1f453),
            from(0x1f380),
            from(0x1f302),
            from(0x1f484),
            from(0x1f49b),
            from(0x1f499),
            from(0x1f49c),
            from(0x1f49a),
            from(0x2764.toChar()),
            from(0x1f494),
            from(0x1f497),
            from(0x1f493),
            from(0x1f495),
            from(0x1f496),
            from(0x1f49e),
            from(0x1f498),
            from(0x1f48c),
            from(0x1f48b),
            from(0x1f48d),
            from(0x1f48e),
            from(0x1f464),
            from(0x1f465),
            from(0x1f4ac),
            from(0x1f463),
            from(0x1f4ad))

    fun bindEmojis(map: SparseIntArray) {
        map.put(0x1f604, R.drawable.emoji_1f604)
        map.put(0x1f603, R.drawable.emoji_1f603)
        map.put(0x1f600, R.drawable.emoji_1f600)
        map.put(0x1f60a, R.drawable.emoji_1f60a)
        map.put(0x263a, R.drawable.emoji_263a)
        map.put(0x1f609, R.drawable.emoji_1f609)
        map.put(0x1f60d, R.drawable.emoji_1f60d)
        map.put(0x1f618, R.drawable.emoji_1f618)
        map.put(0x1f61a, R.drawable.emoji_1f61a)
        map.put(0x1f617, R.drawable.emoji_1f617)
        map.put(0x1f619, R.drawable.emoji_1f619)
        map.put(0x1f61c, R.drawable.emoji_1f61c)
        map.put(0x1f61d, R.drawable.emoji_1f61d)
        map.put(0x1f61b, R.drawable.emoji_1f61b)
        map.put(0x1f633, R.drawable.emoji_1f633)
        map.put(0x1f601, R.drawable.emoji_1f601)
        map.put(0x1f614, R.drawable.emoji_1f614)
        map.put(0x1f60c, R.drawable.emoji_1f60c)
        map.put(0x1f612, R.drawable.emoji_1f612)
        map.put(0x1f61e, R.drawable.emoji_1f61e)
        map.put(0x1f623, R.drawable.emoji_1f623)
        map.put(0x1f622, R.drawable.emoji_1f622)
        map.put(0x1f602, R.drawable.emoji_1f602)
        map.put(0x1f62d, R.drawable.emoji_1f62d)
        map.put(0x1f62a, R.drawable.emoji_1f62a)
        map.put(0x1f625, R.drawable.emoji_1f625)
        map.put(0x1f630, R.drawable.emoji_1f630)
        map.put(0x1f605, R.drawable.emoji_1f605)
        map.put(0x1f613, R.drawable.emoji_1f613)
        map.put(0x1f629, R.drawable.emoji_1f629)
        map.put(0x1f62b, R.drawable.emoji_1f62b)
        map.put(0x1f628, R.drawable.emoji_1f628)
        map.put(0x1f631, R.drawable.emoji_1f631)
        map.put(0x1f620, R.drawable.emoji_1f620)
        map.put(0x1f621, R.drawable.emoji_1f621)
        map.put(0x1f624, R.drawable.emoji_1f624)
        map.put(0x1f616, R.drawable.emoji_1f616)
        map.put(0x1f606, R.drawable.emoji_1f606)
        map.put(0x1f60b, R.drawable.emoji_1f60b)
        map.put(0x1f637, R.drawable.emoji_1f637)
        map.put(0x1f60e, R.drawable.emoji_1f60e)
        map.put(0x1f634, R.drawable.emoji_1f634)
        map.put(0x1f635, R.drawable.emoji_1f635)
        map.put(0x1f632, R.drawable.emoji_1f632)
        map.put(0x1f61f, R.drawable.emoji_1f61f)
        map.put(0x1f626, R.drawable.emoji_1f626)
        map.put(0x1f627, R.drawable.emoji_1f627)
        map.put(0x1f608, R.drawable.emoji_1f608)
        map.put(0x1f47f, R.drawable.emoji_1f47f)
        map.put(0x1f62e, R.drawable.emoji_1f62e)
        map.put(0x1f62c, R.drawable.emoji_1f62c)
        map.put(0x1f610, R.drawable.emoji_1f610)
        map.put(0x1f615, R.drawable.emoji_1f615)
        map.put(0x1f62f, R.drawable.emoji_1f62f)
        map.put(0x1f636, R.drawable.emoji_1f636)
        map.put(0x1f607, R.drawable.emoji_1f607)
        map.put(0x1f60f, R.drawable.emoji_1f60f)
        map.put(0x1f611, R.drawable.emoji_1f611)
        map.put(0x1f472, R.drawable.emoji_1f472)
        map.put(0x1f473, R.drawable.emoji_1f473)
        map.put(0x1f46e, R.drawable.emoji_1f46e)
        map.put(0x1f477, R.drawable.emoji_1f477)
        map.put(0x1f482, R.drawable.emoji_1f482)
        map.put(0x1f476, R.drawable.emoji_1f476)
        map.put(0x1f466, R.drawable.emoji_1f466)
        map.put(0x1f467, R.drawable.emoji_1f467)
        map.put(0x1f468, R.drawable.emoji_1f468)
        map.put(0x1f469, R.drawable.emoji_1f469)
        map.put(0x1f474, R.drawable.emoji_1f474)
        map.put(0x1f475, R.drawable.emoji_1f475)
        map.put(0x1f471, R.drawable.emoji_1f471)
        map.put(0x1f47c, R.drawable.emoji_1f47c)
        map.put(0x1f478, R.drawable.emoji_1f478)
        map.put(0x1f63a, R.drawable.emoji_1f63a)
        map.put(0x1f638, R.drawable.emoji_1f638)
        map.put(0x1f63b, R.drawable.emoji_1f63b)
        map.put(0x1f63d, R.drawable.emoji_1f63d)
        map.put(0x1f63c, R.drawable.emoji_1f63c)
        map.put(0x1f640, R.drawable.emoji_1f640)
        map.put(0x1f63f, R.drawable.emoji_1f63f)
        map.put(0x1f639, R.drawable.emoji_1f639)
        map.put(0x1f63e, R.drawable.emoji_1f63e)
        map.put(0x1f479, R.drawable.emoji_1f479)
        map.put(0x1f47a, R.drawable.emoji_1f47a)
        map.put(0x1f648, R.drawable.emoji_1f648)
        map.put(0x1f649, R.drawable.emoji_1f649)
        map.put(0x1f64a, R.drawable.emoji_1f64a)
        map.put(0x1f480, R.drawable.emoji_1f480)
        map.put(0x1f47d, R.drawable.emoji_1f47d)
        map.put(0x1f4a9, R.drawable.emoji_1f4a9)
        map.put(0x1f525, R.drawable.emoji_1f525)
        map.put(0x2728, R.drawable.emoji_2728)
        map.put(0x1f31f, R.drawable.emoji_1f31f)
        map.put(0x1f4ab, R.drawable.emoji_1f4ab)
        map.put(0x1f4a5, R.drawable.emoji_1f4a5)
        map.put(0x1f4a2, R.drawable.emoji_1f4a2)
        map.put(0x1f4a6, R.drawable.emoji_1f4a6)
        map.put(0x1f4a7, R.drawable.emoji_1f4a7)
        map.put(0x1f4a4, R.drawable.emoji_1f4a4)
        map.put(0x1f4a8, R.drawable.emoji_1f4a8)
        map.put(0x1f442, R.drawable.emoji_1f442)
        map.put(0x1f440, R.drawable.emoji_1f440)
        map.put(0x1f443, R.drawable.emoji_1f443)
        map.put(0x1f445, R.drawable.emoji_1f445)
        map.put(0x1f444, R.drawable.emoji_1f444)
        map.put(0x1f44d, R.drawable.emoji_1f44d)
        map.put(0x1f44e, R.drawable.emoji_1f44e)
        map.put(0x1f44c, R.drawable.emoji_1f44c)
        map.put(0x1f44a, R.drawable.emoji_1f44a)
        map.put(0x270a, R.drawable.emoji_270a)
        map.put(0x270c, R.drawable.emoji_270c)
        map.put(0x1f44b, R.drawable.emoji_1f44b)
        map.put(0x270b, R.drawable.emoji_270b)
        map.put(0x1f450, R.drawable.emoji_1f450)
        map.put(0x1f446, R.drawable.emoji_1f446)
        map.put(0x1f447, R.drawable.emoji_1f447)
        map.put(0x1f449, R.drawable.emoji_1f449)
        map.put(0x1f448, R.drawable.emoji_1f448)
        map.put(0x1f64c, R.drawable.emoji_1f64c)
        map.put(0x1f64f, R.drawable.emoji_1f64f)
        map.put(0x261d, R.drawable.emoji_261d)
        map.put(0x1f44f, R.drawable.emoji_1f44f)
        map.put(0x1f4aa, R.drawable.emoji_1f4aa)
        map.put(0x1f6b6, R.drawable.emoji_1f6b6)
        map.put(0x1f3c3, R.drawable.emoji_1f3c3)
        map.put(0x1f483, R.drawable.emoji_1f483)
        map.put(0x1f46b, R.drawable.emoji_1f46b)
        map.put(0x1f46a, R.drawable.emoji_1f46a)
        map.put(0x1f46c, R.drawable.emoji_1f46c)
        map.put(0x1f46d, R.drawable.emoji_1f46d)
        map.put(0x1f48f, R.drawable.emoji_1f48f)
        map.put(0x1f491, R.drawable.emoji_1f491)
        map.put(0x1f46f, R.drawable.emoji_1f46f)
        map.put(0x1f646, R.drawable.emoji_1f646)
        map.put(0x1f645, R.drawable.emoji_1f645)
        map.put(0x1f481, R.drawable.emoji_1f481)
        map.put(0x1f64b, R.drawable.emoji_1f64b)
        map.put(0x1f486, R.drawable.emoji_1f486)
        map.put(0x1f487, R.drawable.emoji_1f487)
        map.put(0x1f485, R.drawable.emoji_1f485)
        map.put(0x1f470, R.drawable.emoji_1f470)
        map.put(0x1f64e, R.drawable.emoji_1f64e)
        map.put(0x1f64d, R.drawable.emoji_1f64d)
        map.put(0x1f647, R.drawable.emoji_1f647)
        map.put(0x1f3a9, R.drawable.emoji_1f3a9)
        map.put(0x1f451, R.drawable.emoji_1f451)
        map.put(0x1f452, R.drawable.emoji_1f452)
        map.put(0x1f45f, R.drawable.emoji_1f45f)
        map.put(0x1f45e, R.drawable.emoji_1f45e)
        map.put(0x1f461, R.drawable.emoji_1f461)
        map.put(0x1f460, R.drawable.emoji_1f460)
        map.put(0x1f462, R.drawable.emoji_1f462)
        map.put(0x1f455, R.drawable.emoji_1f455)
        map.put(0x1f454, R.drawable.emoji_1f454)
        map.put(0x1f45a, R.drawable.emoji_1f45a)
        map.put(0x1f457, R.drawable.emoji_1f457)
        map.put(0x1f3bd, R.drawable.emoji_1f3bd)
        map.put(0x1f456, R.drawable.emoji_1f456)
        map.put(0x1f458, R.drawable.emoji_1f458)
        map.put(0x1f459, R.drawable.emoji_1f459)
        map.put(0x1f4bc, R.drawable.emoji_1f4bc)
        map.put(0x1f45c, R.drawable.emoji_1f45c)
        map.put(0x1f45d, R.drawable.emoji_1f45d)
        map.put(0x1f45b, R.drawable.emoji_1f45b)
        map.put(0x1f453, R.drawable.emoji_1f453)
        map.put(0x1f380, R.drawable.emoji_1f380)
        map.put(0x1f302, R.drawable.emoji_1f302)
        map.put(0x1f484, R.drawable.emoji_1f484)
        map.put(0x1f49b, R.drawable.emoji_1f49b)
        map.put(0x1f499, R.drawable.emoji_1f499)
        map.put(0x1f49c, R.drawable.emoji_1f49c)
        map.put(0x1f49a, R.drawable.emoji_1f49a)
        map.put(0x2764, R.drawable.emoji_2764)
        map.put(0x1f494, R.drawable.emoji_1f494)
        map.put(0x1f497, R.drawable.emoji_1f497)
        map.put(0x1f493, R.drawable.emoji_1f493)
        map.put(0x1f495, R.drawable.emoji_1f495)
        map.put(0x1f496, R.drawable.emoji_1f496)
        map.put(0x1f49e, R.drawable.emoji_1f49e)
        map.put(0x1f498, R.drawable.emoji_1f498)
        map.put(0x1f48c, R.drawable.emoji_1f48c)
        map.put(0x1f48b, R.drawable.emoji_1f48b)
        map.put(0x1f48d, R.drawable.emoji_1f48d)
        map.put(0x1f48e, R.drawable.emoji_1f48e)
        map.put(0x1f464, R.drawable.emoji_1f464)
        map.put(0x1f465, R.drawable.emoji_1f465)
        map.put(0x1f4ac, R.drawable.emoji_1f4ac)
        map.put(0x1f463, R.drawable.emoji_1f463)
        map.put(0x1f4ad, R.drawable.emoji_1f4ad)
        map.put(0x1f595, R.drawable.emoji_1f595)
        map.put(0x1f918, R.drawable.emoji_1f918)
        map.put(0x1f590, R.drawable.emoji_1f590)
        map.put(0x270d, R.drawable.emoji_270d)
        map.put(0x1f441, R.drawable.emoji_1f441)
        map.put(0x1f642, R.drawable.emoji_1f642)
        map.put(0x1f917, R.drawable.emoji_1f917)
        map.put(0x1f914, R.drawable.emoji_1f914)
        map.put(0x1f644, R.drawable.emoji_1f644)
        map.put(0x1f910, R.drawable.emoji_1f910)
        map.put(0x1f913, R.drawable.emoji_1f913)
        map.put(0x2639, R.drawable.emoji_2639)
        map.put(0x1f641, R.drawable.emoji_1f641)
        map.put(0x1f643, R.drawable.emoji_1f643)
        map.put(0x1f912, R.drawable.emoji_1f912)
        map.put(0x1f915, R.drawable.emoji_1f915)
        map.put(0x1f911, R.drawable.emoji_1f911)
    }

    fun bindSoftBankEmojis(map: SparseIntArray) {
        map.put(0xe001, R.drawable.emoji_1f466)
        map.put(0xe002, R.drawable.emoji_1f467)
        map.put(0xe003, R.drawable.emoji_1f48b)
        map.put(0xe004, R.drawable.emoji_1f468)
        map.put(0xe00d, R.drawable.emoji_1f44a)
        map.put(0xe00e, R.drawable.emoji_1f44d)
        map.put(0xe00f, R.drawable.emoji_261d)
        map.put(0xe010, R.drawable.emoji_270a)
        map.put(0xe011, R.drawable.emoji_270c)
        map.put(0xe012, R.drawable.emoji_1f64b)
        map.put(0xe022, R.drawable.emoji_2764)
        map.put(0xe023, R.drawable.emoji_1f494)
        map.put(0xe04e, R.drawable.emoji_1f47c)
        map.put(0xe056, R.drawable.emoji_1f60a)
        map.put(0xe057, R.drawable.emoji_1f603)
        map.put(0xe058, R.drawable.emoji_1f61e)
        map.put(0xe059, R.drawable.emoji_1f620)
        map.put(0xe05a, R.drawable.emoji_1f4a9)
        map.put(0xe105, R.drawable.emoji_1f61c)
        map.put(0xe106, R.drawable.emoji_1f60d)
        map.put(0xe107, R.drawable.emoji_1f631)
        map.put(0xe108, R.drawable.emoji_1f613)
        map.put(0xe109, R.drawable.emoji_1f435)
        map.put(0xe11a, R.drawable.emoji_1f47f)
        map.put(0xe11b, R.drawable.emoji_1f47b)
        map.put(0xe11c, R.drawable.emoji_1f480)
        map.put(0xe14c, R.drawable.emoji_1f4aa)
        map.put(0xe22e, R.drawable.emoji_1f446)
        map.put(0xe22f, R.drawable.emoji_1f447)
        map.put(0xe230, R.drawable.emoji_1f448)
        map.put(0xe231, R.drawable.emoji_1f449)
        map.put(0xe327, R.drawable.emoji_1f493)
        map.put(0xe328, R.drawable.emoji_1f48c)
        map.put(0xe329, R.drawable.emoji_1f498)
        map.put(0xe32a, R.drawable.emoji_1f499)
        map.put(0xe32b, R.drawable.emoji_1f49a)
        map.put(0xe32c, R.drawable.emoji_1f49b)
        map.put(0xe32d, R.drawable.emoji_1f49c)
        map.put(0xe32e, R.drawable.emoji_2728)
        map.put(0xe32f, R.drawable.emoji_2b50)
        map.put(0xe330, R.drawable.emoji_1f4a8)
        map.put(0xe331, R.drawable.emoji_1f4a6)
        map.put(0xe401, R.drawable.emoji_1f625)
        map.put(0xe402, R.drawable.emoji_1f60f)
        map.put(0xe403, R.drawable.emoji_1f614)
        map.put(0xe404, R.drawable.emoji_1f601)
        map.put(0xe405, R.drawable.emoji_1f609)
        map.put(0xe406, R.drawable.emoji_1f623)
        map.put(0xe407, R.drawable.emoji_1f616)
        map.put(0xe408, R.drawable.emoji_1f62a)
        map.put(0xe409, R.drawable.emoji_1f445)
        map.put(0xe40a, R.drawable.emoji_1f606)
        map.put(0xe40b, R.drawable.emoji_1f628)
        map.put(0xe40c, R.drawable.emoji_1f637)
        map.put(0xe40d, R.drawable.emoji_1f633)
        map.put(0xe40e, R.drawable.emoji_1f612)
        map.put(0xe40f, R.drawable.emoji_1f630)
        map.put(0xe410, R.drawable.emoji_1f632)
        map.put(0xe411, R.drawable.emoji_1f62d)
        map.put(0xe412, R.drawable.emoji_1f602)
        map.put(0xe413, R.drawable.emoji_1f622)
        map.put(0xe414, R.drawable.emoji_263a)
        map.put(0xe415, R.drawable.emoji_1f605)
        map.put(0xe416, R.drawable.emoji_1f621)
        map.put(0xe417, R.drawable.emoji_1f61a)
        map.put(0xe418, R.drawable.emoji_1f618)
        map.put(0xe419, R.drawable.emoji_1f440)
        map.put(0xe41a, R.drawable.emoji_1f443)
        map.put(0xe41b, R.drawable.emoji_1f442)
        map.put(0xe41c, R.drawable.emoji_1f444)
        map.put(0xe41d, R.drawable.emoji_1f64f)
        map.put(0xe41e, R.drawable.emoji_1f44b)
        map.put(0xe41f, R.drawable.emoji_1f44f)
        map.put(0xe420, R.drawable.emoji_1f44c)
        map.put(0xe421, R.drawable.emoji_1f44e)
        map.put(0xe422, R.drawable.emoji_1f450)
        map.put(0xe423, R.drawable.emoji_1f645)
        map.put(0xe424, R.drawable.emoji_1f646)
        map.put(0xe425, R.drawable.emoji_1f491)
        map.put(0xe426, R.drawable.emoji_1f647)
        map.put(0xe427, R.drawable.emoji_1f64c)
        map.put(0xe428, R.drawable.emoji_1f46b)
        map.put(0xe429, R.drawable.emoji_1f46f)
        map.put(0xe515, R.drawable.emoji_1f471)
        map.put(0xe516, R.drawable.emoji_1f472)
        map.put(0xe517, R.drawable.emoji_1f473)
        map.put(0xe518, R.drawable.emoji_1f474)
        map.put(0xe519, R.drawable.emoji_1f475)
        map.put(0xe51a, R.drawable.emoji_1f476)
        map.put(0xe51b, R.drawable.emoji_1f477)
        map.put(0xe51c, R.drawable.emoji_1f478)
        map.put(0xe51d, R.drawable.emoji_1f5fd)
        map.put(0xe51e, R.drawable.emoji_1f482)
        map.put(0xe51f, R.drawable.emoji_1f483)
        map.put(0xe437, R.drawable.emoji_1f49d)
        map.put(0xe438, R.drawable.emoji_1f38e)
        map.put(0xe439, R.drawable.emoji_1f393)
    }
}
