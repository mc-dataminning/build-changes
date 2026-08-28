import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class ku {
   static final azb a = new azb(512);
   public static final kt<czp> b = a("custom_data", $$0 -> $$0.a(czp.b));
   public static final kt<Integer> c = a("max_stack_size", $$0 -> $$0.a(azd.a(1, 99)).a(zg.h));
   public static final kt<Integer> d = a("max_damage", $$0 -> $$0.a(azd.m).a(zg.h));
   public static final kt<Integer> e = a("damage", $$0 -> $$0.a(azd.l).a(zg.h));
   public static final kt<dak> f = a("unbreakable", $$0 -> $$0.a(dak.a).a(dak.b));
   public static final kt<xk> g = a("custom_name", $$0 -> $$0.a(xm.g).a(xm.b).a());
   public static final kt<xk> h = a("item_name", $$0 -> $$0.a(xm.g).a(xm.b).a());
   public static final kt<alp> i = a("item_model", $$0 -> $$0.a(alp.a).a(alp.b).a());
   public static final kt<czz> j = a("lore", $$0 -> $$0.a(czz.c).a(czz.d).a());
   public static final kt<cyd> k = a("rarity", $$0 -> $$0.a(cyd.e).a(cyd.g));
   public static final kt<ddw> l = a("enchantments", $$0 -> $$0.a(ddw.b).a(ddw.c).a());
   public static final kt<cvc> m = a("can_place_on", $$0 -> $$0.a(cvc.a).a(cvc.b).a());
   public static final kt<cvc> n = a("can_break", $$0 -> $$0.a(cvc.a).a(cvc.b).a());
   public static final kt<czx> o = a("attribute_modifiers", $$0 -> $$0.a(czx.b).a(czx.c).a());
   public static final kt<czq> p = a("custom_model_data", $$0 -> $$0.a(czq.b).a(czq.c));
   public static final kt<bba> q = a("hide_additional_tooltip", $$0 -> $$0.a(bba.b).a(zi.a(bba.a)));
   public static final kt<bba> r = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(bba.a)).a(zi.a(bba.a)));
   public static final kt<Integer> s = a("repair_cost", $$0 -> $$0.a(azd.l).a(zg.h));
   public static final kt<bba> t = a("creative_slot_lock", $$0 -> $$0.a(zi.a(bba.a)));
   public static final kt<Boolean> u = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(zg.b));
   public static final kt<bba> v = a("intangible_projectile", $$0 -> $$0.a(bba.b));
   public static final kt<csq> w = a("food", $$0 -> $$0.a(csq.a).a(csq.b).a());
   public static final kt<czm> x = a("consumable", $$0 -> $$0.a(czm.b).a(czm.c).a());
   public static final kt<dam> y = a("use_remainder", $$0 -> $$0.a(dam.a).a(dam.b).a());
   public static final kt<dal> z = a("use_cooldown", $$0 -> $$0.a(dal.a).a(dal.b).a());
   public static final kt<czr> A = a("damage_resistant", $$0 -> $$0.a(czr.a).a(czr.b).a());
   public static final kt<dai> B = a("tool", $$0 -> $$0.a(dai.a).a(dai.b).a());
   public static final kt<ddo> C = a("enchantable", $$0 -> $$0.a(ddo.a).a(ddo.b).a());
   public static final kt<dfl> D = a("equippable", $$0 -> $$0.a(dfl.a).a(dfl.b).a());
   public static final kt<ddy> E = a("repairable", $$0 -> $$0.a(ddy.a).a(ddy.b).a());
   public static final kt<bba> F = a("glider", $$0 -> $$0.a(bba.b).a(zi.a(bba.a)));
   public static final kt<alp> G = a("tooltip_style", $$0 -> $$0.a(alp.a).a(alp.b).a());
   public static final kt<czs> H = a("death_protection", $$0 -> $$0.a(czs.a).a(czs.b).a());
   public static final kt<ddw> I = a("stored_enchantments", $$0 -> $$0.a(ddw.b).a(ddw.c).a());
   public static final kt<czu> J = a("dyed_color", $$0 -> $$0.a(czu.a).a(czu.b));
   public static final kt<dac> K = a("map_color", $$0 -> $$0.a(dac.a).a(dac.b));
   public static final kt<evi> L = a("map_id", $$0 -> $$0.a(evi.a).a(evi.b));
   public static final kt<dab> M = a("map_decorations", $$0 -> $$0.a(dab.b).a());
   public static final kt<dad> N = a("map_post_processing", $$0 -> $$0.a(dad.d));
   public static final kt<czl> O = a("charged_projectiles", $$0 -> $$0.a(czl.b).a(czl.c).a());
   public static final kt<czk> P = a("bundle_contents", $$0 -> $$0.a(czk.b).a(czk.c).a());
   public static final kt<czf> Q = a("potion_contents", $$0 -> $$0.a(czf.b).a(czf.c).a());
   public static final kt<dah> R = a("suspicious_stew_effects", $$0 -> $$0.a(dah.c).a(dah.d).a());
   public static final kt<dan> S = a("writable_book_content", $$0 -> $$0.a(dan.e).a(dan.f).a());
   public static final kt<dao> T = a("written_book_content", $$0 -> $$0.a(dao.i).a(dao.j).a());
   public static final kt<dfn> U = a("trim", $$0 -> $$0.a(dfn.a).a(dfn.b).a());
   public static final kt<czt> V = a("debug_stick_state", $$0 -> $$0.a(czt.b).a());
   public static final kt<czp> W = a("entity_data", $$0 -> $$0.a(czp.c).a(czp.d));
   public static final kt<czp> X = a("bucket_entity_data", $$0 -> $$0.a(czp.b).a(czp.d));
   public static final kt<czp> Y = a("block_entity_data", $$0 -> $$0.a(czp.c).a(czp.d));
   public static final kt<jq<cwz>> Z = a("instrument", $$0 -> $$0.a(cwz.c).a(cwz.d).a());
   public static final kt<dae> aa = a("ominous_bottle_amplifier", $$0 -> $$0.a(dae.d).a(dae.e));
   public static final kt<cxl> ab = a("jukebox_playable", $$0 -> $$0.a(cxl.a).a(cxl.b));
   public static final kt<List<alo<dbv<?>>>> ac = a("recipes", $$0 -> $$0.a(alo.a(mb.bk).listOf()).a());
   public static final kt<daa> ad = a("lodestone_tracker", $$0 -> $$0.a(daa.a).a(daa.b).a());
   public static final kt<czv> ae = a("firework_explosion", $$0 -> $$0.a(czv.c).a(czv.d).a());
   public static final kt<czw> af = a("fireworks", $$0 -> $$0.a(czw.b).a(czw.c).a());
   public static final kt<daf> ag = a("profile", $$0 -> $$0.a(daf.a).a(daf.b).a());
   public static final kt<alp> ah = a("note_block_sound", $$0 -> $$0.a(alp.a).a(alp.b));
   public static final kt<duh> ai = a("banner_patterns", $$0 -> $$0.a(duh.b).a(duh.c).a());
   public static final kt<cwd> aj = a("base_color", $$0 -> $$0.a(cwd.q).a(cwd.r));
   public static final kt<dvx> ak = a("pot_decorations", $$0 -> $$0.a(dvx.b).a(dvx.c).a());
   public static final kt<czy> al = a("container", $$0 -> $$0.a(czy.b).a(czy.c).a());
   public static final kt<czi> am = a("block_state", $$0 -> $$0.a(czi.b).a(czi.c).a());
   public static final kt<List<dun.c>> an = a("bees", $$0 -> $$0.a(dun.c.b).a(dun.c.c.a(zg.a())).a());
   public static final kt<btb> ao = a("lock", $$0 -> $$0.a(btb.b));
   public static final kt<dag> ap = a("container_loot", $$0 -> $$0.a(dag.a));
   public static final kq aq = kq.a().a(c, 64).a(j, czz.a).a(l, ddw.a).a(s, 0).a(o, czx.a).a(k, cyd.a).a();

   public static kt<?> a(kd<kt<?>> $$0) {
      return b;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(ma.ao, $$0, $$1.apply(kt.a()).b());
   }
}
