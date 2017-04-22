package cosc442.welsh.project5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JamesBondTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testbondRegex_1{
	assertFalse(bondRegex("("));
	}
	@Test
	public void testbondRegex_2{
	assertFalse(bondRegex("(("));
	}
	@Test
	public void testbondRegex_3{
	assertFalse(bondRegex("((("));
	}
	@Test
	public void testbondRegex_4{
	assertFalse(bondRegex("(()"));
	}
	@Test
	public void testbondRegex_5{
	assertTrue(bondRegex("((007)"));
	}
	@Test
	public void testbondRegex_6{
	assertFalse(bondRegex("((07)"));
	}
	@Test
	public void testbondRegex_7{
	assertFalse(bondRegex("((7)"));
	}
	@Test
	public void testbondRegex_8{
	assertFalse(bondRegex("()"));
	}
	@Test
	public void testbondRegex_9{
	assertFalse(bondRegex("()("));
	}
	@Test
	public void testbondRegex_10{
	assertFalse(bondRegex("())"));
	}
	@Test
	public void testbondRegex_11{
	assertTrue(bondRegex("()007)"));
	}
	@Test
	public void testbondRegex_12{
	assertFalse(bondRegex("()07)"));
	}
	@Test
	public void testbondRegex_13{
	assertFalse(bondRegex("()7)"));
	}
	@Test
	public void testbondRegex_14{
	assertFalse(bondRegex("(0("));
	}
	@Test
	public void testbondRegex_15{
	assertFalse(bondRegex("(0(("));
	}
	@Test
	public void testbondRegex_16{
	assertFalse(bondRegex("(0()"));
	}
	@Test
	public void testbondRegex_17{
	assertTrue(bondRegex("(0(007)"));
	}
	@Test
	public void testbondRegex_18{
	assertFalse(bondRegex("(0(07)"));
	}
	@Test
	public void testbondRegex_19{
	assertFalse(bondRegex("(0(7)"));
	}
	@Test
	public void testbondRegex_20{
	assertFalse(bondRegex("(0)"));
	}
	@Test
	public void testbondRegex_21{
	assertFalse(bondRegex("(0)("));
	}
	@Test
	public void testbondRegex_22{
	assertFalse(bondRegex("(0))"));
	}
	@Test
	public void testbondRegex_23{
	assertTrue(bondRegex("(0)007)"));
	}
	@Test
	public void testbondRegex_24{
	assertFalse(bondRegex("(0)07)"));
	}
	@Test
	public void testbondRegex_25{
	assertFalse(bondRegex("(0)7)"));
	}
	@Test
	public void testbondRegex_26{
	assertFalse(bondRegex("(00("));
	}
	@Test
	public void testbondRegex_27{
	assertFalse(bondRegex("(00(("));
	}
	@Test
	public void testbondRegex_28{
	assertFalse(bondRegex("(00()"));
	}
	@Test
	public void testbondRegex_29{
	assertTrue(bondRegex("(00(007)"));
	}
	@Test
	public void testbondRegex_30{
	assertFalse(bondRegex("(00(07)"));
	}
	@Test
	public void testbondRegex_31{
	assertFalse(bondRegex("(00(7)"));
	}
	@Test
	public void testbondRegex_32{
	assertFalse(bondRegex("(00)"));
	}
	@Test
	public void testbondRegex_33{
	assertFalse(bondRegex("(00)("));
	}
	@Test
	public void testbondRegex_34{
	assertFalse(bondRegex("(00))"));
	}
	@Test
	public void testbondRegex_35{
	assertTrue(bondRegex("(00)007)"));
	}
	@Test
	public void testbondRegex_36{
	assertFalse(bondRegex("(00)07)"));
	}
	@Test
	public void testbondRegex_37{
	assertFalse(bondRegex("(00)7)"));
	}
	@Test
	public void testbondRegex_38{
	assertFalse(bondRegex("(000("));
	}
	@Test
	public void testbondRegex_39{
	assertFalse(bondRegex("(000)"));
	}
	@Test
	public void testbondRegex_40{
	assertTrue(bondRegex("(000007)"));
	}
	@Test
	public void testbondRegex_41{
	assertTrue(bondRegex("(00007)"));
	}
	@Test
	public void testbondRegex_42{
	assertTrue(bondRegex("(0007)"));
	}
	@Test
	public void testbondRegex_43{
	assertFalse(bondRegex("(001("));
	}
	@Test
	public void testbondRegex_44{
	assertFalse(bondRegex("(001)"));
	}
	@Test
	public void testbondRegex_45{
	assertTrue(bondRegex("(001007)"));
	}
	@Test
	public void testbondRegex_46{
	assertFalse(bondRegex("(00107)"));
	}
	@Test
	public void testbondRegex_47{
	assertFalse(bondRegex("(0017)"));
	}
	@Test
	public void testbondRegex_48{
	assertFalse(bondRegex("(002("));
	}
	@Test
	public void testbondRegex_49{
	assertFalse(bondRegex("(002)"));
	}
	@Test
	public void testbondRegex_50{
	assertTrue(bondRegex("(002007)"));
	}
	@Test
	public void testbondRegex_51{
	assertFalse(bondRegex("(00207)"));
	}
	@Test
	public void testbondRegex_52{
	assertFalse(bondRegex("(0027)"));
	}
	@Test
	public void testbondRegex_53{
	assertFalse(bondRegex("(003("));
	}
	@Test
	public void testbondRegex_54{
	assertFalse(bondRegex("(003)"));
	}
	@Test
	public void testbondRegex_55{
	assertTrue(bondRegex("(003007)"));
	}
	@Test
	public void testbondRegex_56{
	assertFalse(bondRegex("(00307)"));
	}
	@Test
	public void testbondRegex_57{
	assertFalse(bondRegex("(0037)"));
	}
	@Test
	public void testbondRegex_58{
	assertFalse(bondRegex("(004("));
	}
	@Test
	public void testbondRegex_59{
	assertFalse(bondRegex("(004)"));
	}
	@Test
	public void testbondRegex_60{
	assertTrue(bondRegex("(004007)"));
	}
	@Test
	public void testbondRegex_61{
	assertFalse(bondRegex("(00407)"));
	}
	@Test
	public void testbondRegex_62{
	assertFalse(bondRegex("(0047)"));
	}
	@Test
	public void testbondRegex_63{
	assertFalse(bondRegex("(005("));
	}
	@Test
	public void testbondRegex_64{
	assertFalse(bondRegex("(005)"));
	}
	@Test
	public void testbondRegex_65{
	assertTrue(bondRegex("(005007)"));
	}
	@Test
	public void testbondRegex_66{
	assertFalse(bondRegex("(00507)"));
	}
	@Test
	public void testbondRegex_67{
	assertFalse(bondRegex("(0057)"));
	}
	@Test
	public void testbondRegex_68{
	assertFalse(bondRegex("(006("));
	}
	@Test
	public void testbondRegex_69{
	assertFalse(bondRegex("(006)"));
	}
	@Test
	public void testbondRegex_70{
	assertTrue(bondRegex("(006007)"));
	}
	@Test
	public void testbondRegex_71{
	assertFalse(bondRegex("(00607)"));
	}
	@Test
	public void testbondRegex_72{
	assertFalse(bondRegex("(0067)"));
	}
	@Test
	public void testbondRegex_73{
	assertFalse(bondRegex("(007("));
	}
	@Test
	public void testbondRegex_74{
	assertFalse(bondRegex("(007(("));
	}
	@Test
	public void testbondRegex_75{
	assertTrue(bondRegex("(007()"));
	}
	@Test
	public void testbondRegex_76{
	assertTrue(bondRegex("(007(007)"));
	}
	@Test
	public void testbondRegex_77{
	assertTrue(bondRegex("(007(07)"));
	}
	@Test
	public void testbondRegex_78{
	assertTrue(bondRegex("(007(7)"));
	}
	@Test
	public void testbondRegex_79{
	assertTrue(bondRegex("(007)"));
	}
	@Test
	public void testbondRegex_80{
	assertTrue(bondRegex("(007)("));
	}
	@Test
	public void testbondRegex_81{
	assertTrue(bondRegex("(007)(("));
	}
	@Test
	public void testbondRegex_82{
	assertTrue(bondRegex("(007)()"));
	}
	@Test
	public void testbondRegex_83{
	assertTrue(bondRegex("(007)(007)"));
	}
	@Test
	public void testbondRegex_84{
	assertTrue(bondRegex("(007)(07)"));
	}
	@Test
	public void testbondRegex_85{
	assertTrue(bondRegex("(007)(7)"));
	}
	@Test
	public void testbondRegex_86{
	assertTrue(bondRegex("(007))"));
	}
	@Test
	public void testbondRegex_87{
	assertTrue(bondRegex("(007))("));
	}
	@Test
	public void testbondRegex_88{
	assertTrue(bondRegex("(007)))"));
	}
	@Test
	public void testbondRegex_89{
	assertTrue(bondRegex("(007))007)"));
	}
	@Test
	public void testbondRegex_90{
	assertTrue(bondRegex("(007))07)"));
	}
	@Test
	public void testbondRegex_91{
	assertTrue(bondRegex("(007))7)"));
	}
	@Test
	public void testbondRegex_92{
	assertTrue(bondRegex("(007)0("));
	}
	@Test
	public void testbondRegex_93{
	assertTrue(bondRegex("(007)0)"));
	}
	@Test
	public void testbondRegex_94{
	assertTrue(bondRegex("(007)0007)"));
	}
	@Test
	public void testbondRegex_95{
	assertTrue(bondRegex("(007)007)"));
	}
	@Test
	public void testbondRegex_96{
	assertTrue(bondRegex("(007)07)"));
	}
	@Test
	public void testbondRegex_97{
	assertTrue(bondRegex("(007)1("));
	}
	@Test
	public void testbondRegex_98{
	assertTrue(bondRegex("(007)1)"));
	}
	@Test
	public void testbondRegex_99{
	assertTrue(bondRegex("(007)1007)"));
	}
	@Test
	public void testbondRegex_100{
	assertTrue(bondRegex("(007)107)"));
	}
	@Test
	public void testbondRegex_101{
	assertTrue(bondRegex("(007)17)"));
	}
	@Test
	public void testbondRegex_102{
	assertTrue(bondRegex("(007)2("));
	}
	@Test
	public void testbondRegex_103{
	assertTrue(bondRegex("(007)2)"));
	}
	@Test
	public void testbondRegex_104{
	assertTrue(bondRegex("(007)2007)"));
	}
	@Test
	public void testbondRegex_105{
	assertTrue(bondRegex("(007)207)"));
	}
	@Test
	public void testbondRegex_106{
	assertTrue(bondRegex("(007)27)"));
	}
	@Test
	public void testbondRegex_107{
	assertTrue(bondRegex("(007)3("));
	}
	@Test
	public void testbondRegex_108{
	assertTrue(bondRegex("(007)3)"));
	}
	@Test
	public void testbondRegex_109{
	assertTrue(bondRegex("(007)3007)"));
	}
	@Test
	public void testbondRegex_110{
	assertTrue(bondRegex("(007)307)"));
	}
	@Test
	public void testbondRegex_111{
	assertTrue(bondRegex("(007)37)"));
	}
	@Test
	public void testbondRegex_112{
	assertTrue(bondRegex("(007)4("));
	}
	@Test
	public void testbondRegex_113{
	assertTrue(bondRegex("(007)4)"));
	}
	@Test
	public void testbondRegex_114{
	assertTrue(bondRegex("(007)4007)"));
	}
	@Test
	public void testbondRegex_115{
	assertTrue(bondRegex("(007)407)"));
	}
	@Test
	public void testbondRegex_116{
	assertTrue(bondRegex("(007)47)"));
	}
	@Test
	public void testbondRegex_117{
	assertTrue(bondRegex("(007)5("));
	}
	@Test
	public void testbondRegex_118{
	assertTrue(bondRegex("(007)5)"));
	}
	@Test
	public void testbondRegex_119{
	assertTrue(bondRegex("(007)5007)"));
	}
	@Test
	public void testbondRegex_120{
	assertTrue(bondRegex("(007)507)"));
	}
	@Test
	public void testbondRegex_121{
	assertTrue(bondRegex("(007)57)"));
	}
	@Test
	public void testbondRegex_122{
	assertTrue(bondRegex("(007)6("));
	}
	@Test
	public void testbondRegex_123{
	assertTrue(bondRegex("(007)6)"));
	}
	@Test
	public void testbondRegex_124{
	assertTrue(bondRegex("(007)6007)"));
	}
	@Test
	public void testbondRegex_125{
	assertTrue(bondRegex("(007)607)"));
	}
	@Test
	public void testbondRegex_126{
	assertTrue(bondRegex("(007)67)"));
	}
	@Test
	public void testbondRegex_127{
	assertTrue(bondRegex("(007)7("));
	}
	@Test
	public void testbondRegex_128{
	assertTrue(bondRegex("(007)7)"));
	}
	@Test
	public void testbondRegex_129{
	assertTrue(bondRegex("(007)7007)"));
	}
	@Test
	public void testbondRegex_130{
	assertTrue(bondRegex("(007)707)"));
	}
	@Test
	public void testbondRegex_131{
	assertTrue(bondRegex("(007)77)"));
	}
	@Test
	public void testbondRegex_132{
	assertTrue(bondRegex("(007)8("));
	}
	@Test
	public void testbondRegex_133{
	assertTrue(bondRegex("(007)8)"));
	}
	@Test
	public void testbondRegex_134{
	assertTrue(bondRegex("(007)8007)"));
	}
	@Test
	public void testbondRegex_135{
	assertTrue(bondRegex("(007)807)"));
	}
	@Test
	public void testbondRegex_136{
	assertTrue(bondRegex("(007)87)"));
	}
	@Test
	public void testbondRegex_137{
	assertTrue(bondRegex("(007)9("));
	}
	@Test
	public void testbondRegex_138{
	assertTrue(bondRegex("(007)9)"));
	}
	@Test
	public void testbondRegex_139{
	assertTrue(bondRegex("(007)9007)"));
	}
	@Test
	public void testbondRegex_140{
	assertTrue(bondRegex("(007)907)"));
	}
	@Test
	public void testbondRegex_141{
	assertTrue(bondRegex("(007)97)"));
	}
	@Test
	public void testbondRegex_142{
	assertFalse(bondRegex("(0070("));
	}
	@Test
	public void testbondRegex_143{
	assertTrue(bondRegex("(0070)"));
	}
	@Test
	public void testbondRegex_144{
	assertTrue(bondRegex("(0070007)"));
	}
	@Test
	public void testbondRegex_145{
	assertTrue(bondRegex("(007007)"));
	}
	@Test
	public void testbondRegex_146{
	assertTrue(bondRegex("(00707)"));
	}
	@Test
	public void testbondRegex_147{
	assertFalse(bondRegex("(0071("));
	}
	@Test
	public void testbondRegex_148{
	assertTrue(bondRegex("(0071)"));
	}
	@Test
	public void testbondRegex_149{
	assertTrue(bondRegex("(0071007)"));
	}
	@Test
	public void testbondRegex_150{
	assertTrue(bondRegex("(007107)"));
	}
	@Test
	public void testbondRegex_151{
	assertTrue(bondRegex("(00717)"));
	}
	@Test
	public void testbondRegex_152{
	assertFalse(bondRegex("(0072("));
	}
	@Test
	public void testbondRegex_153{
	assertTrue(bondRegex("(0072)"));
	}
	@Test
	public void testbondRegex_154{
	assertTrue(bondRegex("(0072007)"));
	}
	@Test
	public void testbondRegex_155{
	assertTrue(bondRegex("(007207)"));
	}
	@Test
	public void testbondRegex_156{
	assertTrue(bondRegex("(00727)"));
	}
	@Test
	public void testbondRegex_157{
	assertFalse(bondRegex("(0073("));
	}
	@Test
	public void testbondRegex_158{
	assertTrue(bondRegex("(0073)"));
	}
	@Test
	public void testbondRegex_159{
	assertTrue(bondRegex("(0073007)"));
	}
	@Test
	public void testbondRegex_160{
	assertTrue(bondRegex("(007307)"));
	}
	@Test
	public void testbondRegex_161{
	assertTrue(bondRegex("(00737)"));
	}
	@Test
	public void testbondRegex_162{
	assertFalse(bondRegex("(0074("));
	}
	@Test
	public void testbondRegex_163{
	assertTrue(bondRegex("(0074)"));
	}
	@Test
	public void testbondRegex_164{
	assertTrue(bondRegex("(0074007)"));
	}
	@Test
	public void testbondRegex_165{
	assertTrue(bondRegex("(007407)"));
	}
	@Test
	public void testbondRegex_166{
	assertTrue(bondRegex("(00747)"));
	}
	@Test
	public void testbondRegex_167{
	assertFalse(bondRegex("(0075("));
	}
	@Test
	public void testbondRegex_168{
	assertTrue(bondRegex("(0075)"));
	}
	@Test
	public void testbondRegex_169{
	assertTrue(bondRegex("(0075007)"));
	}
	@Test
	public void testbondRegex_170{
	assertTrue(bondRegex("(007507)"));
	}
	@Test
	public void testbondRegex_171{
	assertTrue(bondRegex("(00757)"));
	}
	@Test
	public void testbondRegex_172{
	assertFalse(bondRegex("(0076("));
	}
	@Test
	public void testbondRegex_173{
	assertTrue(bondRegex("(0076)"));
	}
	@Test
	public void testbondRegex_174{
	assertTrue(bondRegex("(0076007)"));
	}
	@Test
	public void testbondRegex_175{
	assertTrue(bondRegex("(007607)"));
	}
	@Test
	public void testbondRegex_176{
	assertTrue(bondRegex("(00767)"));
	}
	@Test
	public void testbondRegex_177{
	assertFalse(bondRegex("(0077("));
	}
	@Test
	public void testbondRegex_178{
	assertTrue(bondRegex("(0077)"));
	}
	@Test
	public void testbondRegex_179{
	assertTrue(bondRegex("(0077007)"));
	}
	@Test
	public void testbondRegex_180{
	assertTrue(bondRegex("(007707)"));
	}
	@Test
	public void testbondRegex_181{
	assertTrue(bondRegex("(00777)"));
	}
	@Test
	public void testbondRegex_182{
	assertFalse(bondRegex("(0078("));
	}
	@Test
	public void testbondRegex_183{
	assertTrue(bondRegex("(0078)"));
	}
	@Test
	public void testbondRegex_184{
	assertTrue(bondRegex("(0078007)"));
	}
	@Test
	public void testbondRegex_185{
	assertTrue(bondRegex("(007807)"));
	}
	@Test
	public void testbondRegex_186{
	assertTrue(bondRegex("(00787)"));
	}
	@Test
	public void testbondRegex_187{
	assertFalse(bondRegex("(0079("));
	}
	@Test
	public void testbondRegex_188{
	assertTrue(bondRegex("(0079)"));
	}
	@Test
	public void testbondRegex_189{
	assertTrue(bondRegex("(0079007)"));
	}
	@Test
	public void testbondRegex_190{
	assertTrue(bondRegex("(007907)"));
	}
	@Test
	public void testbondRegex_191{
	assertTrue(bondRegex("(00797)"));
	}
	@Test
	public void testbondRegex_192{
	assertFalse(bondRegex("(008("));
	}
	@Test
	public void testbondRegex_193{
	assertFalse(bondRegex("(008)"));
	}
	@Test
	public void testbondRegex_194{
	assertTrue(bondRegex("(008007)"));
	}
	@Test
	public void testbondRegex_195{
	assertFalse(bondRegex("(00807)"));
	}
	@Test
	public void testbondRegex_196{
	assertFalse(bondRegex("(0087)"));
	}
	@Test
	public void testbondRegex_197{
	assertFalse(bondRegex("(009("));
	}
	@Test
	public void testbondRegex_198{
	assertFalse(bondRegex("(009)"));
	}
	@Test
	public void testbondRegex_199{
	assertTrue(bondRegex("(009007)"));
	}
	@Test
	public void testbondRegex_200{
	assertFalse(bondRegex("(00907)"));
	}
	@Test
	public void testbondRegex_201{
	assertFalse(bondRegex("(0097)"));
	}
	@Test
	public void testbondRegex_202{
	assertFalse(bondRegex("(01("));
	}
	@Test
	public void testbondRegex_203{
	assertFalse(bondRegex("(01)"));
	}
	@Test
	public void testbondRegex_204{
	assertTrue(bondRegex("(01007)"));
	}
	@Test
	public void testbondRegex_205{
	assertFalse(bondRegex("(0107)"));
	}
	@Test
	public void testbondRegex_206{
	assertFalse(bondRegex("(017)"));
	}
	@Test
	public void testbondRegex_207{
	assertFalse(bondRegex("(02("));
	}
	@Test
	public void testbondRegex_208{
	assertFalse(bondRegex("(02)"));
	}
	@Test
	public void testbondRegex_209{
	assertTrue(bondRegex("(02007)"));
	}
	@Test
	public void testbondRegex_210{
	assertFalse(bondRegex("(0207)"));
	}
	@Test
	public void testbondRegex_211{
	assertFalse(bondRegex("(027)"));
	}
	@Test
	public void testbondRegex_212{
	assertFalse(bondRegex("(03("));
	}
	@Test
	public void testbondRegex_213{
	assertFalse(bondRegex("(03)"));
	}
	@Test
	public void testbondRegex_214{
	assertTrue(bondRegex("(03007)"));
	}
	@Test
	public void testbondRegex_215{
	assertFalse(bondRegex("(0307)"));
	}
	@Test
	public void testbondRegex_216{
	assertFalse(bondRegex("(037)"));
	}
	@Test
	public void testbondRegex_217{
	assertFalse(bondRegex("(04("));
	}
	@Test
	public void testbondRegex_218{
	assertFalse(bondRegex("(04)"));
	}
	@Test
	public void testbondRegex_219{
	assertTrue(bondRegex("(04007)"));
	}
	@Test
	public void testbondRegex_220{
	assertFalse(bondRegex("(0407)"));
	}
	@Test
	public void testbondRegex_221{
	assertFalse(bondRegex("(047)"));
	}
	@Test
	public void testbondRegex_222{
	assertFalse(bondRegex("(05("));
	}
	@Test
	public void testbondRegex_223{
	assertFalse(bondRegex("(05)"));
	}
	@Test
	public void testbondRegex_224{
	assertTrue(bondRegex("(05007)"));
	}
	@Test
	public void testbondRegex_225{
	assertFalse(bondRegex("(0507)"));
	}
	@Test
	public void testbondRegex_226{
	assertFalse(bondRegex("(057)"));
	}
	@Test
	public void testbondRegex_227{
	assertFalse(bondRegex("(06("));
	}
	@Test
	public void testbondRegex_228{
	assertFalse(bondRegex("(06)"));
	}
	@Test
	public void testbondRegex_229{
	assertTrue(bondRegex("(06007)"));
	}
	@Test
	public void testbondRegex_230{
	assertFalse(bondRegex("(0607)"));
	}
	@Test
	public void testbondRegex_231{
	assertFalse(bondRegex("(067)"));
	}
	@Test
	public void testbondRegex_232{
	assertFalse(bondRegex("(07("));
	}
	@Test
	public void testbondRegex_233{
	assertFalse(bondRegex("(07)"));
	}
	@Test
	public void testbondRegex_234{
	assertTrue(bondRegex("(07007)"));
	}
	@Test
	public void testbondRegex_235{
	assertFalse(bondRegex("(0707)"));
	}
	@Test
	public void testbondRegex_236{
	assertFalse(bondRegex("(077)"));
	}
	@Test
	public void testbondRegex_237{
	assertFalse(bondRegex("(08("));
	}
	@Test
	public void testbondRegex_238{
	assertFalse(bondRegex("(08)"));
	}
	@Test
	public void testbondRegex_239{
	assertTrue(bondRegex("(08007)"));
	}
	@Test
	public void testbondRegex_240{
	assertFalse(bondRegex("(0807)"));
	}
	@Test
	public void testbondRegex_241{
	assertFalse(bondRegex("(087)"));
	}
	@Test
	public void testbondRegex_242{
	assertFalse(bondRegex("(09("));
	}
	@Test
	public void testbondRegex_243{
	assertFalse(bondRegex("(09)"));
	}
	@Test
	public void testbondRegex_244{
	assertTrue(bondRegex("(09007)"));
	}
	@Test
	public void testbondRegex_245{
	assertFalse(bondRegex("(0907)"));
	}
	@Test
	public void testbondRegex_246{
	assertFalse(bondRegex("(097)"));
	}
	@Test
	public void testbondRegex_247{
	assertFalse(bondRegex("(1("));
	}
	@Test
	public void testbondRegex_248{
	assertFalse(bondRegex("(1)"));
	}
	@Test
	public void testbondRegex_249{
	assertTrue(bondRegex("(1007)"));
	}
	@Test
	public void testbondRegex_250{
	assertFalse(bondRegex("(107)"));
	}
	@Test
	public void testbondRegex_251{
	assertFalse(bondRegex("(17)"));
	}
	@Test
	public void testbondRegex_252{
	assertFalse(bondRegex("(2("));
	}
	@Test
	public void testbondRegex_253{
	assertFalse(bondRegex("(2)"));
	}
	@Test
	public void testbondRegex_254{
	assertTrue(bondRegex("(2007)"));
	}
	@Test
	public void testbondRegex_255{
	assertFalse(bondRegex("(207)"));
	}
	@Test
	public void testbondRegex_256{
	assertFalse(bondRegex("(27)"));
	}
	@Test
	public void testbondRegex_257{
	assertFalse(bondRegex("(3("));
	}
	@Test
	public void testbondRegex_258{
	assertFalse(bondRegex("(3)"));
	}
	@Test
	public void testbondRegex_259{
	assertTrue(bondRegex("(3007)"));
	}
	@Test
	public void testbondRegex_260{
	assertFalse(bondRegex("(307)"));
	}
	@Test
	public void testbondRegex_261{
	assertFalse(bondRegex("(37)"));
	}
	@Test
	public void testbondRegex_262{
	assertFalse(bondRegex("(4("));
	}
	@Test
	public void testbondRegex_263{
	assertFalse(bondRegex("(4)"));
	}
	@Test
	public void testbondRegex_264{
	assertTrue(bondRegex("(4007)"));
	}
	@Test
	public void testbondRegex_265{
	assertFalse(bondRegex("(407)"));
	}
	@Test
	public void testbondRegex_266{
	assertFalse(bondRegex("(47)"));
	}
	@Test
	public void testbondRegex_267{
	assertFalse(bondRegex("(5("));
	}
	@Test
	public void testbondRegex_268{
	assertFalse(bondRegex("(5)"));
	}
	@Test
	public void testbondRegex_269{
	assertTrue(bondRegex("(5007)"));
	}
	@Test
	public void testbondRegex_270{
	assertFalse(bondRegex("(507)"));
	}
	@Test
	public void testbondRegex_271{
	assertFalse(bondRegex("(57)"));
	}
	@Test
	public void testbondRegex_272{
	assertFalse(bondRegex("(6("));
	}
	@Test
	public void testbondRegex_273{
	assertFalse(bondRegex("(6)"));
	}
	@Test
	public void testbondRegex_274{
	assertTrue(bondRegex("(6007)"));
	}
	@Test
	public void testbondRegex_275{
	assertFalse(bondRegex("(607)"));
	}
	@Test
	public void testbondRegex_276{
	assertFalse(bondRegex("(67)"));
	}
	@Test
	public void testbondRegex_277{
	assertFalse(bondRegex("(7("));
	}
	@Test
	public void testbondRegex_278{
	assertFalse(bondRegex("(7)"));
	}
	@Test
	public void testbondRegex_279{
	assertTrue(bondRegex("(7007)"));
	}
	@Test
	public void testbondRegex_280{
	assertFalse(bondRegex("(707)"));
	}
	@Test
	public void testbondRegex_281{
	assertFalse(bondRegex("(77)"));
	}
	@Test
	public void testbondRegex_282{
	assertFalse(bondRegex("(8("));
	}
	@Test
	public void testbondRegex_283{
	assertFalse(bondRegex("(8)"));
	}
	@Test
	public void testbondRegex_284{
	assertTrue(bondRegex("(8007)"));
	}
	@Test
	public void testbondRegex_285{
	assertFalse(bondRegex("(807)"));
	}
	@Test
	public void testbondRegex_286{
	assertFalse(bondRegex("(87)"));
	}
	@Test
	public void testbondRegex_287{
	assertFalse(bondRegex("(9("));
	}
	@Test
	public void testbondRegex_288{
	assertFalse(bondRegex("(9)"));
	}
	@Test
	public void testbondRegex_289{
	assertTrue(bondRegex("(9007)"));
	}
	@Test
	public void testbondRegex_290{
	assertFalse(bondRegex("(907)"));
	}
	@Test
	public void testbondRegex_291{
	assertFalse(bondRegex("(97)"));
	}
	@Test
	public void testbondRegex_292{
	assertFalse(bondRegex(")"));
	}
	@Test
	public void testbondRegex_293{
	assertFalse(bondRegex(")("));
	}
	@Test
	public void testbondRegex_294{
	assertFalse(bondRegex("))"));
	}
	@Test
	public void testbondRegex_295{
	assertFalse(bondRegex(")007)"));
	}
	@Test
	public void testbondRegex_296{
	assertFalse(bondRegex(")07)"));
	}
	@Test
	public void testbondRegex_297{
	assertFalse(bondRegex(")7)"));
	}
	@Test
	public void testbondRegex_298{
	assertFalse(bondRegex("0("));
	}
	@Test
	public void testbondRegex_299{
	assertFalse(bondRegex("0)"));
	}
	@Test
	public void testbondRegex_300{
	assertFalse(bondRegex("0007)"));
	}
	@Test
	public void testbondRegex_301{
	assertFalse(bondRegex("007)"));
	}
	@Test
	public void testbondRegex_302{
	assertFalse(bondRegex("07)"));
	}
	@Test
	public void testbondRegex_303{
	assertFalse(bondRegex("1("));
	}
	@Test
	public void testbondRegex_304{
	assertFalse(bondRegex("1)"));
	}
	@Test
	public void testbondRegex_305{
	assertFalse(bondRegex("1007)"));
	}
	@Test
	public void testbondRegex_306{
	assertFalse(bondRegex("107)"));
	}
	@Test
	public void testbondRegex_307{
	assertFalse(bondRegex("17)"));
	}
	@Test
	public void testbondRegex_308{
	assertFalse(bondRegex("2("));
	}
	@Test
	public void testbondRegex_309{
	assertFalse(bondRegex("2)"));
	}
	@Test
	public void testbondRegex_310{
	assertFalse(bondRegex("2007)"));
	}
	@Test
	public void testbondRegex_311{
	assertFalse(bondRegex("207)"));
	}
	@Test
	public void testbondRegex_312{
	assertFalse(bondRegex("27)"));
	}
	@Test
	public void testbondRegex_313{
	assertFalse(bondRegex("3("));
	}
	@Test
	public void testbondRegex_314{
	assertFalse(bondRegex("3)"));
	}
	@Test
	public void testbondRegex_315{
	assertFalse(bondRegex("3007)"));
	}
	@Test
	public void testbondRegex_316{
	assertFalse(bondRegex("307)"));
	}
	@Test
	public void testbondRegex_317{
	assertFalse(bondRegex("37)"));
	}
	@Test
	public void testbondRegex_318{
	assertFalse(bondRegex("4("));
	}
	@Test
	public void testbondRegex_319{
	assertFalse(bondRegex("4)"));
	}
	@Test
	public void testbondRegex_320{
	assertFalse(bondRegex("4007)"));
	}
	@Test
	public void testbondRegex_321{
	assertFalse(bondRegex("407)"));
	}
	@Test
	public void testbondRegex_322{
	assertFalse(bondRegex("47)"));
	}
	@Test
	public void testbondRegex_323{
	assertFalse(bondRegex("5("));
	}
	@Test
	public void testbondRegex_324{
	assertFalse(bondRegex("5)"));
	}
	@Test
	public void testbondRegex_325{
	assertFalse(bondRegex("5007)"));
	}
	@Test
	public void testbondRegex_326{
	assertFalse(bondRegex("507)"));
	}
	@Test
	public void testbondRegex_327{
	assertFalse(bondRegex("57)"));
	}
	@Test
	public void testbondRegex_328{
	assertFalse(bondRegex("6("));
	}
	@Test
	public void testbondRegex_329{
	assertFalse(bondRegex("6)"));
	}
	@Test
	public void testbondRegex_330{
	assertFalse(bondRegex("6007)"));
	}
	@Test
	public void testbondRegex_331{
	assertFalse(bondRegex("607)"));
	}
	@Test
	public void testbondRegex_332{
	assertFalse(bondRegex("67)"));
	}
	@Test
	public void testbondRegex_333{
	assertFalse(bondRegex("7("));
	}
	@Test
	public void testbondRegex_334{
	assertFalse(bondRegex("7)"));
	}
	@Test
	public void testbondRegex_335{
	assertFalse(bondRegex("7007)"));
	}
	@Test
	public void testbondRegex_336{
	assertFalse(bondRegex("707)"));
	}
	@Test
	public void testbondRegex_337{
	assertFalse(bondRegex("77)"));
	}
	@Test
	public void testbondRegex_338{
	assertFalse(bondRegex("8("));
	}
	@Test
	public void testbondRegex_339{
	assertFalse(bondRegex("8)"));
	}
	@Test
	public void testbondRegex_340{
	assertFalse(bondRegex("8007)"));
	}
	@Test
	public void testbondRegex_341{
	assertFalse(bondRegex("807)"));
	}
	@Test
	public void testbondRegex_342{
	assertFalse(bondRegex("87)"));
	}
	@Test
	public void testbondRegex_343{
	assertFalse(bondRegex("9("));
	}
	@Test
	public void testbondRegex_344{
	assertFalse(bondRegex("9)"));
	}
	@Test
	public void testbondRegex_345{
	assertFalse(bondRegex("9007)"));
	}
	@Test
	public void testbondRegex_346{
	assertFalse(bondRegex("907)"));
	}
	@Test
	public void testbondRegex_347{
	assertFalse(bondRegex("97)"));
	}


}
