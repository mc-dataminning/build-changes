import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class kq {
   static final axu a = new axu(512);
   public static final kp<cxh> b = a("custom_data", $$0 -> $$0.a(cxh.b));
   public static final kp<Integer> c = a("max_stack_size", $$0 -> $$0.a(axw.a(1, 99)).a(yv.g));
   public static final kp<Integer> d = a("max_damage", $$0 -> $$0.a(axw.l).a(yv.g));
   public static final kp<Integer> e = a("damage", $$0 -> $$0.a(axw.k).a(yv.g));
   public static final kp<cxz> f = a("unbreakable", $$0 -> $$0.a(cxz.a).a(cxz.b));
   public static final kp<wz> g = a("custom_name", $$0 -> $$0.a(xb.g).a(xb.b).a());
   public static final kp<wz> h = a("item_name", $$0 -> $$0.a(xb.g).a(xb.b).a());
   public static final kp<cxp> i = a("lore", $$0 -> $$0.a(cxp.c).a(cxp.d).a());
   public static final kp<cvo> j = a("rarity", $$0 -> $$0.a(cvo.e).a(cvo.g));
   public static final kp<dai> k = a("enchantments", $$0 -> $$0.a(dai.b).a(dai.c).a());
   public static final kp<csc> l = a("can_place_on", $$0 -> $$0.a(csc.a).a(csc.b).a());
   public static final kp<csc> m = a("can_break", $$0 -> $$0.a(csc.a).a(csc.b).a());
   public static final kp<cxn> n = a("attribute_modifiers", $$0 -> $$0.a(cxn.b).a(cxn.c).a());
   public static final kp<cxi> o = a("custom_model_data", $$0 -> $$0.a(cxi.b).a(cxi.c));
   public static final kp<azs> p = a("hide_additional_tooltip", $$0 -> $$0.a(azs.b).a(yx.a(azs.a)));
   public static final kp<azs> q = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(azs.a)).a(yx.a(azs.a)));
   public static final kp<Integer> r = a("repair_cost", $$0 -> $$0.a(axw.k).a(yv.g));
   public static final kp<azs> s = a("creative_slot_lock", $$0 -> $$0.a(yx.a(azs.a)));
   public static final kp<Boolean> t = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yv.b));
   public static final kp<azs> u = a("intangible_projectile", $$0 -> $$0.a(azs.b));
   public static final kp<cpr> v = a("food", $$0 -> $$0.a(cpr.a).a(cpr.b).a());
   public static final kp<azs> w = a("fire_resistant", $$0 -> $$0.a(azs.b).a(yx.a(azs.a)));
   public static final kp<cxx> x = a("tool", $$0 -> $$0.a(cxx.a).a(cxx.b).a());
   public static final kp<dai> y = a("stored_enchantments", $$0 -> $$0.a(dai.b).a(dai.c).a());
   public static final kp<cxk> z = a("dyed_color", $$0 -> $$0.a(cxk.a).a(cxk.b));
   public static final kp<cxs> A = a("map_color", $$0 -> $$0.a(cxs.a).a(cxs.b));
   public static final kp<eqr> B = a("map_id", $$0 -> $$0.a(eqr.a).a(eqr.b));
   public static final kp<cxr> C = a("map_decorations", $$0 -> $$0.a(cxr.b).a());
   public static final kp<cxt> D = a("map_post_processing", $$0 -> $$0.a(cxt.d));
   public static final kp<cxg> E = a("charged_projectiles", $$0 -> $$0.a(cxg.b).a(cxg.c).a());
   public static final kp<cxf> F = a("bundle_contents", $$0 -> $$0.a(cxf.b).a(cxf.c).a());
   public static final kp<cwu> G = a("potion_contents", $$0 -> $$0.a(cwu.b).a(cwu.c).a());
   public static final kp<cxw> H = a("suspicious_stew_effects", $$0 -> $$0.a(cxw.b).a(cxw.c).a());
   public static final kp<cya> I = a("writable_book_content", $$0 -> $$0.a(cya.e).a(cya.f).a());
   public static final kp<cyb> J = a("written_book_content", $$0 -> $$0.a(cyb.i).a(cyb.j).a());
   public static final kp<cwx> K = a("trim", $$0 -> $$0.a(cwx.a).a(cwx.b).a());
   public static final kp<cxj> L = a("debug_stick_state", $$0 -> $$0.a(cxj.b).a());
   public static final kp<cxh> M = a("entity_data", $$0 -> $$0.a(cxh.c).a(cxh.d));
   public static final kp<cxh> N = a("bucket_entity_data", $$0 -> $$0.a(cxh.b).a(cxh.d));
   public static final kp<cxh> O = a("block_entity_data", $$0 -> $$0.a(cxh.c).a(cxh.d));
   public static final kp<jm<cui>> P = a("instrument", $$0 -> $$0.a(cui.c).a(cui.d).a());
   public static final kp<Integer> Q = a("ominous_bottle_amplifier", $$0 -> $$0.a(axw.a(0, 4)).a(yv.g));
   public static final kp<cuu> R = a("jukebox_playable", $$0 -> $$0.a(cuu.a).a(cuu.b));
   public static final kp<List<akr>> S = a("recipes", $$0 -> $$0.a(akr.a.listOf()).a());
   public static final kp<cxq> T = a("lodestone_tracker", $$0 -> $$0.a(cxq.a).a(cxq.b).a());
   public static final kp<cxl> U = a("firework_explosion", $$0 -> $$0.a(cxl.c).a(cxl.d).a());
   public static final kp<cxm> V = a("fireworks", $$0 -> $$0.a(cxm.b).a(cxm.c).a());
   public static final kp<cxu> W = a("profile", $$0 -> $$0.a(cxu.a).a(cxu.b).a());
   public static final kp<akr> X = a("note_block_sound", $$0 -> $$0.a(akr.a).a(akr.b));
   public static final kp<dpy> Y = a("banner_patterns", $$0 -> $$0.a(dpy.b).a(dpy.c).a());
   public static final kp<cti> Z = a("base_color", $$0 -> $$0.a(cti.q).a(cti.r));
   public static final kp<drm> aa = a("pot_decorations", $$0 -> $$0.a(drm.b).a(drm.c).a());
   public static final kp<cxo> ab = a("container", $$0 -> $$0.a(cxo.b).a(cxo.c).a());
   public static final kp<cxd> ac = a("block_state", $$0 -> $$0.a(cxd.b).a(cxd.c).a());
   public static final kp<List<dqe.c>> ad = a("bees", $$0 -> $$0.a(dqe.c.b).a(dqe.c.c.a(yv.a())).a());
   public static final kp<bqu> ae = a("lock", $$0 -> $$0.a(bqu.b));
   public static final kp<cxv> af = a("container_loot", $$0 -> $$0.a(cxv.a));
   public static final km ag = km.a().a(c, 64).a(i, cxp.a).a(k, dai.a).a(r, 0).a(n, cxn.a).a(j, cvo.a).a();

   public static kp<?> a(jz<kp<?>> $$0) {
      return b;
   }

   private static <T> kp<T> a(String $$0, UnaryOperator<kp.a<T>> $$1) {
      return jz.a(lt.aq, $$0, $$1.apply(kp.a()).b());
   }
}
