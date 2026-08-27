import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIntPair;
import java.util.List;
import java.util.function.UnaryOperator;

public class ke {
   public static final kd<cxf> a = a("custom_data", $$0 -> $$0.a(cxf.b));
   public static final kd<Integer> b = a("max_stack_size", $$0 -> $$0.a(axu.a(1, 99)).a(za.g));
   public static final kd<Integer> c = a("max_damage", $$0 -> $$0.a(axu.j).a(za.g));
   public static final kd<Integer> d = a("damage", $$0 -> $$0.a(axu.i).a(za.g));
   public static final kd<cxy> e = a("unbreakable", $$0 -> $$0.a(cxy.a).a(cxy.b));
   public static final kd<xe> f = a("custom_name", $$0 -> $$0.a(xg.g).a(xg.b));
   public static final kd<cxn> g = a("lore", $$0 -> $$0.a(cxn.c).a(cxn.d));
   public static final kd<cvj> h = a("rarity", $$0 -> $$0.a(cvj.f).a(cvj.h));
   public static final kd<dai> i = a("enchantments", $$0 -> $$0.a(dai.c).a(dai.d));
   public static final kd<crq> j = a("can_place_on", $$0 -> $$0.a(crq.a).a(crq.b));
   public static final kd<crq> k = a("can_break", $$0 -> $$0.a(crq.a).a(crq.b));
   public static final kd<cxl> l = a("attribute_modifiers", $$0 -> $$0.a(cxl.b).a(cxl.c));
   public static final kd<cxg> m = a("custom_model_data", $$0 -> $$0.a(cxg.b).a(cxg.c));
   public static final kd<azo> n = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(azo.a)).a(zc.a(azo.a)));
   public static final kd<azo> o = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(azo.a)).a(zc.a(azo.a)));
   public static final kd<Integer> p = a("repair_cost", $$0 -> $$0.a(axu.i).a(za.g));
   public static final kd<azo> q = a("creative_slot_lock", $$0 -> $$0.a(zc.a(azo.a)));
   public static final kd<Boolean> r = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(za.b));
   public static final kd<azo> s = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(azo.a)));
   public static final kd<cov> t = a("food", $$0 -> $$0.a(cov.a).a(cov.b));
   public static final kd<azo> u = a("fire_resistant", $$0 -> $$0.a(Codec.unit(azo.a)).a(zc.a(azo.a)));
   public static final kd<cxw> v = a("tool", $$0 -> $$0.a(cxw.a).a(cxw.b));
   public static final kd<dai> w = a("stored_enchantments", $$0 -> $$0.a(dai.c).a(dai.d));
   public static final kd<cxi> x = a("dyed_color", $$0 -> $$0.a(cxi.a).a(cxi.b));
   public static final kd<cxq> y = a("map_color", $$0 -> $$0.a(cxq.a).a(cxq.b));
   public static final kd<eqr> z = a("map_id", $$0 -> $$0.a(eqr.a).a(eqr.b));
   public static final kd<cxp> A = a("map_decorations", $$0 -> $$0.a(cxp.b));
   public static final kd<cxr> B = a("map_post_processing", $$0 -> $$0.a(cxr.d));
   public static final kd<cxe> C = a("charged_projectiles", $$0 -> $$0.a(cxe.b).a(cxe.c));
   public static final kd<cxd> D = a("bundle_contents", $$0 -> $$0.a(cxd.c).a(cxd.d));
   public static final kd<cwr> E = a("potion_contents", $$0 -> $$0.a(cwr.c).a(cwr.d));
   public static final kd<cxv> F = a("suspicious_stew_effects", $$0 -> $$0.a(cxv.b).a(cxv.c));
   public static final kd<cxz> G = a("writable_book_content", $$0 -> $$0.a(cxz.d).a(cxz.e));
   public static final kd<cya> H = a("written_book_content", $$0 -> $$0.a(cya.j).a(cya.k));
   public static final kd<cwu> I = a("trim", $$0 -> $$0.a(cwu.a).a(cwu.b));
   public static final kd<cxh> J = a("debug_stick_state", $$0 -> $$0.a(cxh.b));
   public static final kd<cxf> K = a("entity_data", $$0 -> $$0.a(cxf.c).a(cxf.d));
   public static final kd<dqy.a> L = a("fletching", $$0 -> $$0.a(dqy.a.a).a(dqy.a.b));
   public static final kd<dqy.b> M = a("resin", $$0 -> $$0.a(dqy.b.a).a(dqy.b.b));
   public static final kd<cxf> N = a("bucket_entity_data", $$0 -> $$0.a(cxf.b).a(cxf.d));
   public static final kd<cxf> O = a("block_entity_data", $$0 -> $$0.a(cxf.c).a(cxf.d));
   public static final kd<ja<ctz>> P = a("instrument", $$0 -> $$0.a(ctz.c).a(ctz.d));
   public static final kd<List<akt>> Q = a("recipes", $$0 -> $$0.a(akt.a.listOf()));
   public static final kd<cxo> R = a("lodestone_tracker", $$0 -> $$0.a(cxo.a).a(cxo.b));
   public static final kd<cxj> S = a("firework_explosion", $$0 -> $$0.a(cxj.c).a(cxj.d));
   public static final kd<cxk> T = a("fireworks", $$0 -> $$0.a(cxk.b).a(cxk.c));
   public static final kd<cxs> U = a("profile", $$0 -> $$0.a(cxs.a).a(cxs.b));
   public static final kd<akt> V = a("note_block_sound", $$0 -> $$0.a(akt.a).a(akt.b));
   public static final kd<dps> W = a("banner_patterns", $$0 -> $$0.a(dps.b).a(dps.c));
   public static final kd<csy> X = a("base_color", $$0 -> $$0.a(csy.q).a(csy.r));
   public static final kd<drj> Y = a("pot_decorations", $$0 -> $$0.a(drj.b).a(drj.c));
   public static final kd<cxm> Z = a("container", $$0 -> $$0.a(cxm.b).a(cxm.c));
   public static final kd<cxb> aa = a("block_state", $$0 -> $$0.a(cxb.b).a(cxb.c));
   public static final kd<List<dpy.c>> ab = a("bees", $$0 -> $$0.a(dpy.c.b).a(dpy.c.c.a(za.a())));
   public static final kd<bqd> ac = a("lock", $$0 -> $$0.a(bqd.b));
   public static final kd<cxt> ad = a("container_loot", $$0 -> $$0.a(cxt.a));
   public static final kd<cyb> ae = a("xp", $$0 -> $$0.a(cyb.b).a(cyb.c));
   public static final kd<cxu> af = a("snek", $$0 -> $$0.a(cxu.b).a(cxu.c));
   public static final kd<Boolean> ag = a("hovered", $$0 -> $$0.a(Codec.BOOL).a(za.b));
   public static final kd<Integer> ah = a("clicks", $$0 -> $$0.a(Codec.INT).a(za.f));
   public static final kd<Integer> ai = a("views", $$0 -> $$0.a(Codec.INT).a(za.f));
   public static final kd<Integer> aj = a("undercover_id", $$0 -> $$0.a(Codec.INT).a(za.f));
   public static final kd<Int2IntMap> ak = a("contacts_messages", $$0 -> $$0.a(axu.a()).a(za.b(axu.a())));
   public static final kd<IntIntPair> al = a("secret_message", $$0 -> $$0.a(axu.b()).a(za.b(axu.b())));
   public static final kd<dri> am = a("lubrication", $$0 -> $$0.a(dri.a).a(dri.b));
   public static final kd<Boolean> an = a("explicit_foil", $$0 -> $$0.a(Codec.BOOL).a(za.b));
   public static final kd<drd> ao = a("heat", $$0 -> $$0.a(drd.a).a(drd.b));
   public static final kd<drk> ap = a("potato_bane", $$0 -> $$0.a(drk.a).a(drk.b));
   public static final ka aq = ka.a().a(b, 64).a(g, cxn.a).a(i, dai.a).a(p, 0).a(l, cxl.a).a(h, cvj.a).a();

   public static kd<?> a(jn<kd<?>> $$0) {
      return a;
   }

   private static <T> kd<T> a(String $$0, UnaryOperator<kd.a<T>> $$1) {
      return jn.a(lh.as, $$0, $$1.apply(kd.a()).a());
   }
}
