import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class km {
   static final aye a = new aye(512);
   public static final kl<cxd> b = a("custom_data", $$0 -> $$0.a(cxd.b));
   public static final kl<Integer> c = a("max_stack_size", $$0 -> $$0.a(ayg.a(1, 99)).a(zk.g));
   public static final kl<Integer> d = a("max_damage", $$0 -> $$0.a(ayg.l).a(zk.g));
   public static final kl<Integer> e = a("damage", $$0 -> $$0.a(ayg.k).a(zk.g));
   public static final kl<cxv> f = a("unbreakable", $$0 -> $$0.a(cxv.a).a(cxv.b));
   public static final kl<xo> g = a("custom_name", $$0 -> $$0.a(xq.g).a(xq.b).a());
   public static final kl<xo> h = a("item_name", $$0 -> $$0.a(xq.g).a(xq.b).a());
   public static final kl<cxl> i = a("lore", $$0 -> $$0.a(cxl.c).a(cxl.d).a());
   public static final kl<cvi> j = a("rarity", $$0 -> $$0.a(cvi.e).a(cvi.g));
   public static final kl<dae> k = a("enchantments", $$0 -> $$0.a(dae.c).a(dae.d).a());
   public static final kl<csa> l = a("can_place_on", $$0 -> $$0.a(csa.a).a(csa.b).a());
   public static final kl<csa> m = a("can_break", $$0 -> $$0.a(csa.a).a(csa.b).a());
   public static final kl<cxj> n = a("attribute_modifiers", $$0 -> $$0.a(cxj.b).a(cxj.c).a());
   public static final kl<cxe> o = a("custom_model_data", $$0 -> $$0.a(cxe.b).a(cxe.c));
   public static final kl<bab> p = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(bab.a)).a(zm.a(bab.a)));
   public static final kl<bab> q = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(bab.a)).a(zm.a(bab.a)));
   public static final kl<Integer> r = a("repair_cost", $$0 -> $$0.a(ayg.k).a(zk.g));
   public static final kl<bab> s = a("creative_slot_lock", $$0 -> $$0.a(zm.a(bab.a)));
   public static final kl<Boolean> t = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(zk.b));
   public static final kl<bab> u = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(bab.a)));
   public static final kl<cpq> v = a("food", $$0 -> $$0.a(cpq.a).a(cpq.b).a());
   public static final kl<bab> w = a("fire_resistant", $$0 -> $$0.a(Codec.unit(bab.a)).a(zm.a(bab.a)));
   public static final kl<cxt> x = a("tool", $$0 -> $$0.a(cxt.a).a(cxt.b).a());
   public static final kl<dae> y = a("stored_enchantments", $$0 -> $$0.a(dae.c).a(dae.d).a());
   public static final kl<cxg> z = a("dyed_color", $$0 -> $$0.a(cxg.a).a(cxg.b));
   public static final kl<cxo> A = a("map_color", $$0 -> $$0.a(cxo.a).a(cxo.b));
   public static final kl<eph> B = a("map_id", $$0 -> $$0.a(eph.a).a(eph.b));
   public static final kl<cxn> C = a("map_decorations", $$0 -> $$0.a(cxn.b).a());
   public static final kl<cxp> D = a("map_post_processing", $$0 -> $$0.a(cxp.d));
   public static final kl<cxc> E = a("charged_projectiles", $$0 -> $$0.a(cxc.b).a(cxc.c).a());
   public static final kl<cxb> F = a("bundle_contents", $$0 -> $$0.a(cxb.b).a(cxb.c).a());
   public static final kl<cwp> G = a("potion_contents", $$0 -> $$0.a(cwp.b).a(cwp.c).a());
   public static final kl<cxs> H = a("suspicious_stew_effects", $$0 -> $$0.a(cxs.b).a(cxs.c).a());
   public static final kl<cxw> I = a("writable_book_content", $$0 -> $$0.a(cxw.e).a(cxw.f).a());
   public static final kl<cxx> J = a("written_book_content", $$0 -> $$0.a(cxx.i).a(cxx.j).a());
   public static final kl<cws> K = a("trim", $$0 -> $$0.a(cws.a).a(cws.b).a());
   public static final kl<cxf> L = a("debug_stick_state", $$0 -> $$0.a(cxf.b).a());
   public static final kl<cxd> M = a("entity_data", $$0 -> $$0.a(cxd.c).a(cxd.d));
   public static final kl<cxd> N = a("bucket_entity_data", $$0 -> $$0.a(cxd.b).a(cxd.d));
   public static final kl<cxd> O = a("block_entity_data", $$0 -> $$0.a(cxd.c).a(cxd.d));
   public static final kl<ji<cug>> P = a("instrument", $$0 -> $$0.a(cug.c).a(cug.d).a());
   public static final kl<Integer> Q = a("ominous_bottle_amplifier", $$0 -> $$0.a(ayg.a(0, 4)).a(zk.g));
   public static final kl<List<ale>> R = a("recipes", $$0 -> $$0.a(ale.a.listOf()).a());
   public static final kl<cxm> S = a("lodestone_tracker", $$0 -> $$0.a(cxm.a).a(cxm.b).a());
   public static final kl<cxh> T = a("firework_explosion", $$0 -> $$0.a(cxh.c).a(cxh.d).a());
   public static final kl<cxi> U = a("fireworks", $$0 -> $$0.a(cxi.b).a(cxi.c).a());
   public static final kl<cxq> V = a("profile", $$0 -> $$0.a(cxq.a).a(cxq.b).a());
   public static final kl<ale> W = a("note_block_sound", $$0 -> $$0.a(ale.a).a(ale.b));
   public static final kl<dox> X = a("banner_patterns", $$0 -> $$0.a(dox.b).a(dox.c).a());
   public static final kl<cth> Y = a("base_color", $$0 -> $$0.a(cth.q).a(cth.r));
   public static final kl<dqk> Z = a("pot_decorations", $$0 -> $$0.a(dqk.b).a(dqk.c).a());
   public static final kl<cxk> aa = a("container", $$0 -> $$0.a(cxk.b).a(cxk.c).a());
   public static final kl<cwz> ab = a("block_state", $$0 -> $$0.a(cwz.b).a(cwz.c).a());
   public static final kl<List<dpd.c>> ac = a("bees", $$0 -> $$0.a(dpd.c.b).a(dpd.c.c.a(zk.a())).a());
   public static final kl<bqw> ad = a("lock", $$0 -> $$0.a(bqw.b));
   public static final kl<cxr> ae = a("container_loot", $$0 -> $$0.a(cxr.a));
   public static final ki af = ki.a().a(c, 64).a(i, cxl.a).a(k, dae.a).a(r, 0).a(n, cxj.a).a(j, cvi.a).a();

   public static kl<?> a(jv<kl<?>> $$0) {
      return b;
   }

   private static <T> kl<T> a(String $$0, UnaryOperator<kl.a<T>> $$1) {
      return jv.a(lp.as, $$0, $$1.apply(kl.a()).b());
   }
}
