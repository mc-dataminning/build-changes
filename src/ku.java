import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class ku {
   static final azl a = new azl(512);
   public static final kt<czt> b = a("custom_data", $$0 -> $$0.a(czt.b));
   public static final kt<Integer> c = a("max_stack_size", $$0 -> $$0.a(azn.a(1, 99)).a(zr.h));
   public static final kt<Integer> d = a("max_damage", $$0 -> $$0.a(azn.m).a(zr.h));
   public static final kt<Integer> e = a("damage", $$0 -> $$0.a(azn.l).a(zr.h));
   public static final kt<dao> f = a("unbreakable", $$0 -> $$0.a(dao.a).a(dao.b));
   public static final kt<xv> g = a("custom_name", $$0 -> $$0.a(xx.g).a(xx.b).a());
   public static final kt<xv> h = a("item_name", $$0 -> $$0.a(xx.g).a(xx.b).a());
   public static final kt<alz> i = a("item_model", $$0 -> $$0.a(alz.a).a(alz.b).a());
   public static final kt<dad> j = a("lore", $$0 -> $$0.a(dad.c).a(dad.d).a());
   public static final kt<cyh> k = a("rarity", $$0 -> $$0.a(cyh.e).a(cyh.g));
   public static final kt<ddx> l = a("enchantments", $$0 -> $$0.a(ddx.b).a(ddx.c).a());
   public static final kt<cvg> m = a("can_place_on", $$0 -> $$0.a(cvg.a).a(cvg.b).a());
   public static final kt<cvg> n = a("can_break", $$0 -> $$0.a(cvg.a).a(cvg.b).a());
   public static final kt<dab> o = a("attribute_modifiers", $$0 -> $$0.a(dab.b).a(dab.c).a());
   public static final kt<czu> p = a("custom_model_data", $$0 -> $$0.a(czu.b).a(czu.c));
   public static final kt<bbk> q = a("hide_additional_tooltip", $$0 -> $$0.a(bbk.b).a(zt.a(bbk.a)));
   public static final kt<bbk> r = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(bbk.a)).a(zt.a(bbk.a)));
   public static final kt<Integer> s = a("repair_cost", $$0 -> $$0.a(azn.l).a(zr.h));
   public static final kt<bbk> t = a("creative_slot_lock", $$0 -> $$0.a(zt.a(bbk.a)));
   public static final kt<Boolean> u = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(zr.b));
   public static final kt<bbk> v = a("intangible_projectile", $$0 -> $$0.a(bbk.b));
   public static final kt<csu> w = a("food", $$0 -> $$0.a(csu.a).a(csu.b).a());
   public static final kt<czq> x = a("consumable", $$0 -> $$0.a(czq.b).a(czq.c).a());
   public static final kt<daq> y = a("use_remainder", $$0 -> $$0.a(daq.a).a(daq.b).a());
   public static final kt<dap> z = a("use_cooldown", $$0 -> $$0.a(dap.a).a(dap.b).a());
   public static final kt<czv> A = a("damage_resistant", $$0 -> $$0.a(czv.a).a(czv.b).a());
   public static final kt<dam> B = a("tool", $$0 -> $$0.a(dam.a).a(dam.b).a());
   public static final kt<ddp> C = a("enchantable", $$0 -> $$0.a(ddp.a).a(ddp.b).a());
   public static final kt<dfm> D = a("equippable", $$0 -> $$0.a(dfm.a).a(dfm.b).a());
   public static final kt<ddz> E = a("repairable", $$0 -> $$0.a(ddz.a).a(ddz.b).a());
   public static final kt<bbk> F = a("glider", $$0 -> $$0.a(bbk.b).a(zt.a(bbk.a)));
   public static final kt<alz> G = a("tooltip_style", $$0 -> $$0.a(alz.a).a(alz.b).a());
   public static final kt<czw> H = a("death_protection", $$0 -> $$0.a(czw.a).a(czw.b).a());
   public static final kt<ddx> I = a("stored_enchantments", $$0 -> $$0.a(ddx.b).a(ddx.c).a());
   public static final kt<czy> J = a("dyed_color", $$0 -> $$0.a(czy.a).a(czy.b));
   public static final kt<dag> K = a("map_color", $$0 -> $$0.a(dag.a).a(dag.b));
   public static final kt<evh> L = a("map_id", $$0 -> $$0.a(evh.a).a(evh.b));
   public static final kt<daf> M = a("map_decorations", $$0 -> $$0.a(daf.b).a());
   public static final kt<dah> N = a("map_post_processing", $$0 -> $$0.a(dah.d));
   public static final kt<czp> O = a("charged_projectiles", $$0 -> $$0.a(czp.b).a(czp.c).a());
   public static final kt<czo> P = a("bundle_contents", $$0 -> $$0.a(czo.b).a(czo.c).a());
   public static final kt<czj> Q = a("potion_contents", $$0 -> $$0.a(czj.b).a(czj.c).a());
   public static final kt<dal> R = a("suspicious_stew_effects", $$0 -> $$0.a(dal.c).a(dal.d).a());
   public static final kt<dar> S = a("writable_book_content", $$0 -> $$0.a(dar.e).a(dar.f).a());
   public static final kt<das> T = a("written_book_content", $$0 -> $$0.a(das.i).a(das.j).a());
   public static final kt<dfo> U = a("trim", $$0 -> $$0.a(dfo.a).a(dfo.b).a());
   public static final kt<czx> V = a("debug_stick_state", $$0 -> $$0.a(czx.b).a());
   public static final kt<czt> W = a("entity_data", $$0 -> $$0.a(czt.c).a(czt.d));
   public static final kt<czt> X = a("bucket_entity_data", $$0 -> $$0.a(czt.b).a(czt.d));
   public static final kt<czt> Y = a("block_entity_data", $$0 -> $$0.a(czt.c).a(czt.d));
   public static final kt<jq<cxd>> Z = a("instrument", $$0 -> $$0.a(cxd.c).a(cxd.d).a());
   public static final kt<dai> aa = a("ominous_bottle_amplifier", $$0 -> $$0.a(dai.d).a(dai.e));
   public static final kt<cxp> ab = a("jukebox_playable", $$0 -> $$0.a(cxp.a).a(cxp.b));
   public static final kt<List<aly<dbz<?>>>> ac = a("recipes", $$0 -> $$0.a(aly.a(mb.bj).listOf()).a());
   public static final kt<dae> ad = a("lodestone_tracker", $$0 -> $$0.a(dae.a).a(dae.b).a());
   public static final kt<czz> ae = a("firework_explosion", $$0 -> $$0.a(czz.c).a(czz.d).a());
   public static final kt<daa> af = a("fireworks", $$0 -> $$0.a(daa.b).a(daa.c).a());
   public static final kt<daj> ag = a("profile", $$0 -> $$0.a(daj.a).a(daj.b).a());
   public static final kt<alz> ah = a("note_block_sound", $$0 -> $$0.a(alz.a).a(alz.b));
   public static final kt<dug> ai = a("banner_patterns", $$0 -> $$0.a(dug.b).a(dug.c).a());
   public static final kt<cwh> aj = a("base_color", $$0 -> $$0.a(cwh.q).a(cwh.r));
   public static final kt<dvw> ak = a("pot_decorations", $$0 -> $$0.a(dvw.b).a(dvw.c).a());
   public static final kt<dac> al = a("container", $$0 -> $$0.a(dac.b).a(dac.c).a());
   public static final kt<czm> am = a("block_state", $$0 -> $$0.a(czm.b).a(czm.c).a());
   public static final kt<List<dum.c>> an = a("bees", $$0 -> $$0.a(dum.c.b).a(dum.c.c.a(zr.a())).a());
   public static final kt<btf> ao = a("lock", $$0 -> $$0.a(btf.b));
   public static final kt<dak> ap = a("container_loot", $$0 -> $$0.a(dak.a));
   public static final kq aq = kq.a().a(c, 64).a(j, dad.a).a(l, ddx.a).a(s, 0).a(o, dab.a).a(k, cyh.a).a();

   public static kt<?> a(kd<kt<?>> $$0) {
      return b;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(ma.ao, $$0, $$1.apply(kt.a()).b());
   }
}
