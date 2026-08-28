import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class km {
   public static final kl<cxc> a = a("custom_data", $$0 -> $$0.a(cxc.b));
   public static final kl<Integer> b = a("max_stack_size", $$0 -> $$0.a(ayf.a(1, 99)).a(zk.g));
   public static final kl<Integer> c = a("max_damage", $$0 -> $$0.a(ayf.l).a(zk.g));
   public static final kl<Integer> d = a("damage", $$0 -> $$0.a(ayf.k).a(zk.g));
   public static final kl<cxu> e = a("unbreakable", $$0 -> $$0.a(cxu.a).a(cxu.b));
   public static final kl<xo> f = a("custom_name", $$0 -> $$0.a(xq.g).a(xq.b));
   public static final kl<xo> g = a("item_name", $$0 -> $$0.a(xq.g).a(xq.b));
   public static final kl<cxk> h = a("lore", $$0 -> $$0.a(cxk.c).a(cxk.d));
   public static final kl<cvh> i = a("rarity", $$0 -> $$0.a(cvh.e).a(cvh.g));
   public static final kl<dad> j = a("enchantments", $$0 -> $$0.a(dad.c).a(dad.d));
   public static final kl<crz> k = a("can_place_on", $$0 -> $$0.a(crz.a).a(crz.b));
   public static final kl<crz> l = a("can_break", $$0 -> $$0.a(crz.a).a(crz.b));
   public static final kl<cxi> m = a("attribute_modifiers", $$0 -> $$0.a(cxi.b).a(cxi.c));
   public static final kl<cxd> n = a("custom_model_data", $$0 -> $$0.a(cxd.b).a(cxd.c));
   public static final kl<baa> o = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(baa.a)).a(zm.a(baa.a)));
   public static final kl<baa> p = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(baa.a)).a(zm.a(baa.a)));
   public static final kl<Integer> q = a("repair_cost", $$0 -> $$0.a(ayf.k).a(zk.g));
   public static final kl<baa> r = a("creative_slot_lock", $$0 -> $$0.a(zm.a(baa.a)));
   public static final kl<Boolean> s = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(zk.b));
   public static final kl<baa> t = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(baa.a)));
   public static final kl<cpp> u = a("food", $$0 -> $$0.a(cpp.a).a(cpp.b));
   public static final kl<baa> v = a("fire_resistant", $$0 -> $$0.a(Codec.unit(baa.a)).a(zm.a(baa.a)));
   public static final kl<cxs> w = a("tool", $$0 -> $$0.a(cxs.a).a(cxs.b));
   public static final kl<dad> x = a("stored_enchantments", $$0 -> $$0.a(dad.c).a(dad.d));
   public static final kl<cxf> y = a("dyed_color", $$0 -> $$0.a(cxf.a).a(cxf.b));
   public static final kl<cxn> z = a("map_color", $$0 -> $$0.a(cxn.a).a(cxn.b));
   public static final kl<epg> A = a("map_id", $$0 -> $$0.a(epg.a).a(epg.b));
   public static final kl<cxm> B = a("map_decorations", $$0 -> $$0.a(cxm.b));
   public static final kl<cxo> C = a("map_post_processing", $$0 -> $$0.a(cxo.d));
   public static final kl<cxb> D = a("charged_projectiles", $$0 -> $$0.a(cxb.b).a(cxb.c));
   public static final kl<cxa> E = a("bundle_contents", $$0 -> $$0.a(cxa.b).a(cxa.c));
   public static final kl<cwo> F = a("potion_contents", $$0 -> $$0.a(cwo.b).a(cwo.c));
   public static final kl<cxr> G = a("suspicious_stew_effects", $$0 -> $$0.a(cxr.b).a(cxr.c));
   public static final kl<cxv> H = a("writable_book_content", $$0 -> $$0.a(cxv.e).a(cxv.f));
   public static final kl<cxw> I = a("written_book_content", $$0 -> $$0.a(cxw.i).a(cxw.j));
   public static final kl<cwr> J = a("trim", $$0 -> $$0.a(cwr.a).a(cwr.b));
   public static final kl<cxe> K = a("debug_stick_state", $$0 -> $$0.a(cxe.b));
   public static final kl<cxc> L = a("entity_data", $$0 -> $$0.a(cxc.c).a(cxc.d));
   public static final kl<cxc> M = a("bucket_entity_data", $$0 -> $$0.a(cxc.b).a(cxc.d));
   public static final kl<cxc> N = a("block_entity_data", $$0 -> $$0.a(cxc.c).a(cxc.d));
   public static final kl<ji<cuf>> O = a("instrument", $$0 -> $$0.a(cuf.c).a(cuf.d));
   public static final kl<Integer> P = a("ominous_bottle_amplifier", $$0 -> $$0.a(ayf.a(0, 4)).a(zk.g));
   public static final kl<List<ale>> Q = a("recipes", $$0 -> $$0.a(ale.a.listOf()));
   public static final kl<cxl> R = a("lodestone_tracker", $$0 -> $$0.a(cxl.a).a(cxl.b));
   public static final kl<cxg> S = a("firework_explosion", $$0 -> $$0.a(cxg.c).a(cxg.d));
   public static final kl<cxh> T = a("fireworks", $$0 -> $$0.a(cxh.b).a(cxh.c));
   public static final kl<cxp> U = a("profile", $$0 -> $$0.a(cxp.a).a(cxp.b));
   public static final kl<ale> V = a("note_block_sound", $$0 -> $$0.a(ale.a).a(ale.b));
   public static final kl<dow> W = a("banner_patterns", $$0 -> $$0.a(dow.b).a(dow.c));
   public static final kl<ctg> X = a("base_color", $$0 -> $$0.a(ctg.q).a(ctg.r));
   public static final kl<dqj> Y = a("pot_decorations", $$0 -> $$0.a(dqj.b).a(dqj.c));
   public static final kl<cxj> Z = a("container", $$0 -> $$0.a(cxj.b).a(cxj.c));
   public static final kl<cwy> aa = a("block_state", $$0 -> $$0.a(cwy.b).a(cwy.c));
   public static final kl<List<dpc.c>> ab = a("bees", $$0 -> $$0.a(dpc.c.b).a(dpc.c.c.a(zk.a())));
   public static final kl<bqv> ac = a("lock", $$0 -> $$0.a(bqv.b));
   public static final kl<cxq> ad = a("container_loot", $$0 -> $$0.a(cxq.a));
   public static final ki ae = ki.a().a(b, 64).a(h, cxk.a).a(j, dad.a).a(q, 0).a(m, cxi.a).a(i, cvh.a).a();

   public static kl<?> a(jv<kl<?>> $$0) {
      return a;
   }

   private static <T> kl<T> a(String $$0, UnaryOperator<kl.a<T>> $$1) {
      return jv.a(lp.as, $$0, $$1.apply(kl.a()).a());
   }
}
