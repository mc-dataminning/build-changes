import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class km {
   public static final kl<cwz> a = a("custom_data", $$0 -> $$0.a(cwz.b));
   public static final kl<Integer> b = a("max_stack_size", $$0 -> $$0.a(ayc.a(1, 99)).a(zh.g));
   public static final kl<Integer> c = a("max_damage", $$0 -> $$0.a(ayc.l).a(zh.g));
   public static final kl<Integer> d = a("damage", $$0 -> $$0.a(ayc.k).a(zh.g));
   public static final kl<cxr> e = a("unbreakable", $$0 -> $$0.a(cxr.a).a(cxr.b));
   public static final kl<xl> f = a("custom_name", $$0 -> $$0.a(xn.g).a(xn.b));
   public static final kl<xl> g = a("item_name", $$0 -> $$0.a(xn.g).a(xn.b));
   public static final kl<cxh> h = a("lore", $$0 -> $$0.a(cxh.c).a(cxh.d));
   public static final kl<cve> i = a("rarity", $$0 -> $$0.a(cve.e).a(cve.g));
   public static final kl<daa> j = a("enchantments", $$0 -> $$0.a(daa.c).a(daa.d));
   public static final kl<crw> k = a("can_place_on", $$0 -> $$0.a(crw.a).a(crw.b));
   public static final kl<crw> l = a("can_break", $$0 -> $$0.a(crw.a).a(crw.b));
   public static final kl<cxf> m = a("attribute_modifiers", $$0 -> $$0.a(cxf.b).a(cxf.c));
   public static final kl<cxa> n = a("custom_model_data", $$0 -> $$0.a(cxa.b).a(cxa.c));
   public static final kl<azx> o = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(azx.a)).a(zj.a(azx.a)));
   public static final kl<azx> p = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(azx.a)).a(zj.a(azx.a)));
   public static final kl<Integer> q = a("repair_cost", $$0 -> $$0.a(ayc.k).a(zh.g));
   public static final kl<azx> r = a("creative_slot_lock", $$0 -> $$0.a(zj.a(azx.a)));
   public static final kl<Boolean> s = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(zh.b));
   public static final kl<azx> t = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(azx.a)));
   public static final kl<cpm> u = a("food", $$0 -> $$0.a(cpm.a).a(cpm.b));
   public static final kl<azx> v = a("fire_resistant", $$0 -> $$0.a(Codec.unit(azx.a)).a(zj.a(azx.a)));
   public static final kl<cxp> w = a("tool", $$0 -> $$0.a(cxp.a).a(cxp.b));
   public static final kl<daa> x = a("stored_enchantments", $$0 -> $$0.a(daa.c).a(daa.d));
   public static final kl<cxc> y = a("dyed_color", $$0 -> $$0.a(cxc.a).a(cxc.b));
   public static final kl<cxk> z = a("map_color", $$0 -> $$0.a(cxk.a).a(cxk.b));
   public static final kl<epd> A = a("map_id", $$0 -> $$0.a(epd.a).a(epd.b));
   public static final kl<cxj> B = a("map_decorations", $$0 -> $$0.a(cxj.b));
   public static final kl<cxl> C = a("map_post_processing", $$0 -> $$0.a(cxl.d));
   public static final kl<cwy> D = a("charged_projectiles", $$0 -> $$0.a(cwy.b).a(cwy.c));
   public static final kl<cwx> E = a("bundle_contents", $$0 -> $$0.a(cwx.b).a(cwx.c));
   public static final kl<cwl> F = a("potion_contents", $$0 -> $$0.a(cwl.b).a(cwl.c));
   public static final kl<cxo> G = a("suspicious_stew_effects", $$0 -> $$0.a(cxo.b).a(cxo.c));
   public static final kl<cxs> H = a("writable_book_content", $$0 -> $$0.a(cxs.e).a(cxs.f));
   public static final kl<cxt> I = a("written_book_content", $$0 -> $$0.a(cxt.i).a(cxt.j));
   public static final kl<cwo> J = a("trim", $$0 -> $$0.a(cwo.a).a(cwo.b));
   public static final kl<cxb> K = a("debug_stick_state", $$0 -> $$0.a(cxb.b));
   public static final kl<cwz> L = a("entity_data", $$0 -> $$0.a(cwz.c).a(cwz.d));
   public static final kl<cwz> M = a("bucket_entity_data", $$0 -> $$0.a(cwz.b).a(cwz.d));
   public static final kl<cwz> N = a("block_entity_data", $$0 -> $$0.a(cwz.c).a(cwz.d));
   public static final kl<ji<cuc>> O = a("instrument", $$0 -> $$0.a(cuc.c).a(cuc.d));
   public static final kl<Integer> P = a("ominous_bottle_amplifier", $$0 -> $$0.a(ayc.a(0, 4)).a(zh.g));
   public static final kl<List<alb>> Q = a("recipes", $$0 -> $$0.a(alb.a.listOf()));
   public static final kl<cxi> R = a("lodestone_tracker", $$0 -> $$0.a(cxi.a).a(cxi.b));
   public static final kl<cxd> S = a("firework_explosion", $$0 -> $$0.a(cxd.c).a(cxd.d));
   public static final kl<cxe> T = a("fireworks", $$0 -> $$0.a(cxe.b).a(cxe.c));
   public static final kl<cxm> U = a("profile", $$0 -> $$0.a(cxm.a).a(cxm.b));
   public static final kl<alb> V = a("note_block_sound", $$0 -> $$0.a(alb.a).a(alb.b));
   public static final kl<dot> W = a("banner_patterns", $$0 -> $$0.a(dot.b).a(dot.c));
   public static final kl<ctd> X = a("base_color", $$0 -> $$0.a(ctd.q).a(ctd.r));
   public static final kl<dqg> Y = a("pot_decorations", $$0 -> $$0.a(dqg.b).a(dqg.c));
   public static final kl<cxg> Z = a("container", $$0 -> $$0.a(cxg.b).a(cxg.c));
   public static final kl<cwv> aa = a("block_state", $$0 -> $$0.a(cwv.b).a(cwv.c));
   public static final kl<List<doz.c>> ab = a("bees", $$0 -> $$0.a(doz.c.b).a(doz.c.c.a(zh.a())));
   public static final kl<bqs> ac = a("lock", $$0 -> $$0.a(bqs.b));
   public static final kl<cxn> ad = a("container_loot", $$0 -> $$0.a(cxn.a));
   public static final ki ae = ki.a().a(b, 64).a(h, cxh.a).a(j, daa.a).a(q, 0).a(m, cxf.a).a(i, cve.a).a();

   public static kl<?> a(jv<kl<?>> $$0) {
      return a;
   }

   private static <T> kl<T> a(String $$0, UnaryOperator<kl.a<T>> $$1) {
      return jv.a(lp.as, $$0, $$1.apply(kl.a()).a());
   }
}
