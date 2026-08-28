import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class ku {
   static final azl a = new azl(512);
   public static final kt<czx> b = a("custom_data", $$0 -> $$0.a(czx.b));
   public static final kt<Integer> c = a("max_stack_size", $$0 -> $$0.a(azn.a(1, 99)).a(zr.h));
   public static final kt<Integer> d = a("max_damage", $$0 -> $$0.a(azn.m).a(zr.h));
   public static final kt<Integer> e = a("damage", $$0 -> $$0.a(azn.l).a(zr.h));
   public static final kt<das> f = a("unbreakable", $$0 -> $$0.a(das.a).a(das.b));
   public static final kt<xv> g = a("custom_name", $$0 -> $$0.a(xx.g).a(xx.b).a());
   public static final kt<xv> h = a("item_name", $$0 -> $$0.a(xx.g).a(xx.b).a());
   public static final kt<alz> i = a("item_model", $$0 -> $$0.a(alz.a).a(alz.b).a());
   public static final kt<dah> j = a("lore", $$0 -> $$0.a(dah.c).a(dah.d).a());
   public static final kt<cyl> k = a("rarity", $$0 -> $$0.a(cyl.e).a(cyl.g));
   public static final kt<dee> l = a("enchantments", $$0 -> $$0.a(dee.b).a(dee.c).a());
   public static final kt<cvk> m = a("can_place_on", $$0 -> $$0.a(cvk.a).a(cvk.b).a());
   public static final kt<cvk> n = a("can_break", $$0 -> $$0.a(cvk.a).a(cvk.b).a());
   public static final kt<daf> o = a("attribute_modifiers", $$0 -> $$0.a(daf.b).a(daf.c).a());
   public static final kt<czy> p = a("custom_model_data", $$0 -> $$0.a(czy.b).a(czy.c));
   public static final kt<bbk> q = a("hide_additional_tooltip", $$0 -> $$0.a(bbk.b).a(zt.a(bbk.a)));
   public static final kt<bbk> r = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(bbk.a)).a(zt.a(bbk.a)));
   public static final kt<Integer> s = a("repair_cost", $$0 -> $$0.a(azn.l).a(zr.h));
   public static final kt<bbk> t = a("creative_slot_lock", $$0 -> $$0.a(zt.a(bbk.a)));
   public static final kt<Boolean> u = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(zr.b));
   public static final kt<bbk> v = a("intangible_projectile", $$0 -> $$0.a(bbk.b));
   public static final kt<csy> w = a("food", $$0 -> $$0.a(csy.a).a(csy.b).a());
   public static final kt<czu> x = a("consumable", $$0 -> $$0.a(czu.b).a(czu.c).a());
   public static final kt<dau> y = a("use_remainder", $$0 -> $$0.a(dau.a).a(dau.b).a());
   public static final kt<dat> z = a("use_cooldown", $$0 -> $$0.a(dat.a).a(dat.b).a());
   public static final kt<czz> A = a("damage_resistant", $$0 -> $$0.a(czz.a).a(czz.b).a());
   public static final kt<daq> B = a("tool", $$0 -> $$0.a(daq.a).a(daq.b).a());
   public static final kt<ddw> C = a("enchantable", $$0 -> $$0.a(ddw.a).a(ddw.b).a());
   public static final kt<dft> D = a("equippable", $$0 -> $$0.a(dft.a).a(dft.b).a());
   public static final kt<deg> E = a("repairable", $$0 -> $$0.a(deg.a).a(deg.b).a());
   public static final kt<bbk> F = a("glider", $$0 -> $$0.a(bbk.b).a(zt.a(bbk.a)));
   public static final kt<alz> G = a("tooltip_style", $$0 -> $$0.a(alz.a).a(alz.b).a());
   public static final kt<daa> H = a("death_protection", $$0 -> $$0.a(daa.a).a(daa.b).a());
   public static final kt<dee> I = a("stored_enchantments", $$0 -> $$0.a(dee.b).a(dee.c).a());
   public static final kt<dac> J = a("dyed_color", $$0 -> $$0.a(dac.a).a(dac.b));
   public static final kt<dak> K = a("map_color", $$0 -> $$0.a(dak.a).a(dak.b));
   public static final kt<evo> L = a("map_id", $$0 -> $$0.a(evo.a).a(evo.b));
   public static final kt<daj> M = a("map_decorations", $$0 -> $$0.a(daj.b).a());
   public static final kt<dal> N = a("map_post_processing", $$0 -> $$0.a(dal.d));
   public static final kt<czt> O = a("charged_projectiles", $$0 -> $$0.a(czt.b).a(czt.c).a());
   public static final kt<czs> P = a("bundle_contents", $$0 -> $$0.a(czs.b).a(czs.c).a());
   public static final kt<czn> Q = a("potion_contents", $$0 -> $$0.a(czn.b).a(czn.c).a());
   public static final kt<dap> R = a("suspicious_stew_effects", $$0 -> $$0.a(dap.c).a(dap.d).a());
   public static final kt<dav> S = a("writable_book_content", $$0 -> $$0.a(dav.e).a(dav.f).a());
   public static final kt<daw> T = a("written_book_content", $$0 -> $$0.a(daw.i).a(daw.j).a());
   public static final kt<dfv> U = a("trim", $$0 -> $$0.a(dfv.a).a(dfv.b).a());
   public static final kt<dab> V = a("debug_stick_state", $$0 -> $$0.a(dab.b).a());
   public static final kt<czx> W = a("entity_data", $$0 -> $$0.a(czx.c).a(czx.d));
   public static final kt<czx> X = a("bucket_entity_data", $$0 -> $$0.a(czx.b).a(czx.d));
   public static final kt<czx> Y = a("block_entity_data", $$0 -> $$0.a(czx.c).a(czx.d));
   public static final kt<jq<cxh>> Z = a("instrument", $$0 -> $$0.a(cxh.c).a(cxh.d).a());
   public static final kt<dam> aa = a("ominous_bottle_amplifier", $$0 -> $$0.a(dam.d).a(dam.e));
   public static final kt<cxt> ab = a("jukebox_playable", $$0 -> $$0.a(cxt.a).a(cxt.b));
   public static final kt<List<aly<dcd<?>>>> ac = a("recipes", $$0 -> $$0.a(aly.a(mb.bk).listOf()).a());
   public static final kt<dai> ad = a("lodestone_tracker", $$0 -> $$0.a(dai.a).a(dai.b).a());
   public static final kt<dad> ae = a("firework_explosion", $$0 -> $$0.a(dad.c).a(dad.d).a());
   public static final kt<dae> af = a("fireworks", $$0 -> $$0.a(dae.b).a(dae.c).a());
   public static final kt<dan> ag = a("profile", $$0 -> $$0.a(dan.a).a(dan.b).a());
   public static final kt<alz> ah = a("note_block_sound", $$0 -> $$0.a(alz.a).a(alz.b));
   public static final kt<dun> ai = a("banner_patterns", $$0 -> $$0.a(dun.b).a(dun.c).a());
   public static final kt<cwl> aj = a("base_color", $$0 -> $$0.a(cwl.q).a(cwl.r));
   public static final kt<dwd> ak = a("pot_decorations", $$0 -> $$0.a(dwd.b).a(dwd.c).a());
   public static final kt<dag> al = a("container", $$0 -> $$0.a(dag.b).a(dag.c).a());
   public static final kt<czq> am = a("block_state", $$0 -> $$0.a(czq.b).a(czq.c).a());
   public static final kt<List<dut.c>> an = a("bees", $$0 -> $$0.a(dut.c.b).a(dut.c.c.a(zr.a())).a());
   public static final kt<btj> ao = a("lock", $$0 -> $$0.a(btj.b));
   public static final kt<dao> ap = a("container_loot", $$0 -> $$0.a(dao.a));
   public static final kq aq = kq.a().a(c, 64).a(j, dah.a).a(l, dee.a).a(s, 0).a(o, daf.a).a(k, cyl.a).a();

   public static kt<?> a(kd<kt<?>> $$0) {
      return b;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(ma.ao, $$0, $$1.apply(kt.a()).b());
   }
}
