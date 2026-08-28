import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class km {
   static final ayf a = new ayf(512);
   public static final kl<cxg> b = a("custom_data", $$0 -> $$0.a(cxg.b));
   public static final kl<Integer> c = a("max_stack_size", $$0 -> $$0.a(ayh.a(1, 99)).a(zl.g));
   public static final kl<Integer> d = a("max_damage", $$0 -> $$0.a(ayh.l).a(zl.g));
   public static final kl<Integer> e = a("damage", $$0 -> $$0.a(ayh.k).a(zl.g));
   public static final kl<cxy> f = a("unbreakable", $$0 -> $$0.a(cxy.a).a(cxy.b));
   public static final kl<xp> g = a("custom_name", $$0 -> $$0.a(xr.g).a(xr.b).a());
   public static final kl<xp> h = a("item_name", $$0 -> $$0.a(xr.g).a(xr.b).a());
   public static final kl<cxo> i = a("lore", $$0 -> $$0.a(cxo.c).a(cxo.d).a());
   public static final kl<cvl> j = a("rarity", $$0 -> $$0.a(cvl.e).a(cvl.g));
   public static final kl<dah> k = a("enchantments", $$0 -> $$0.a(dah.c).a(dah.d).a());
   public static final kl<csd> l = a("can_place_on", $$0 -> $$0.a(csd.a).a(csd.b).a());
   public static final kl<csd> m = a("can_break", $$0 -> $$0.a(csd.a).a(csd.b).a());
   public static final kl<cxm> n = a("attribute_modifiers", $$0 -> $$0.a(cxm.b).a(cxm.c).a());
   public static final kl<cxh> o = a("custom_model_data", $$0 -> $$0.a(cxh.b).a(cxh.c));
   public static final kl<bac> p = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(bac.a)).a(zn.a(bac.a)));
   public static final kl<bac> q = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(bac.a)).a(zn.a(bac.a)));
   public static final kl<Integer> r = a("repair_cost", $$0 -> $$0.a(ayh.k).a(zl.g));
   public static final kl<bac> s = a("creative_slot_lock", $$0 -> $$0.a(zn.a(bac.a)));
   public static final kl<Boolean> t = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(zl.b));
   public static final kl<bac> u = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(bac.a)));
   public static final kl<cpt> v = a("food", $$0 -> $$0.a(cpt.a).a(cpt.b).a());
   public static final kl<bac> w = a("fire_resistant", $$0 -> $$0.a(Codec.unit(bac.a)).a(zn.a(bac.a)));
   public static final kl<cxw> x = a("tool", $$0 -> $$0.a(cxw.a).a(cxw.b).a());
   public static final kl<dah> y = a("stored_enchantments", $$0 -> $$0.a(dah.c).a(dah.d).a());
   public static final kl<cxj> z = a("dyed_color", $$0 -> $$0.a(cxj.a).a(cxj.b));
   public static final kl<cxr> A = a("map_color", $$0 -> $$0.a(cxr.a).a(cxr.b));
   public static final kl<epk> B = a("map_id", $$0 -> $$0.a(epk.a).a(epk.b));
   public static final kl<cxq> C = a("map_decorations", $$0 -> $$0.a(cxq.b).a());
   public static final kl<cxs> D = a("map_post_processing", $$0 -> $$0.a(cxs.d));
   public static final kl<cxf> E = a("charged_projectiles", $$0 -> $$0.a(cxf.b).a(cxf.c).a());
   public static final kl<cxe> F = a("bundle_contents", $$0 -> $$0.a(cxe.b).a(cxe.c).a());
   public static final kl<cws> G = a("potion_contents", $$0 -> $$0.a(cws.b).a(cws.c).a());
   public static final kl<cxv> H = a("suspicious_stew_effects", $$0 -> $$0.a(cxv.b).a(cxv.c).a());
   public static final kl<cxz> I = a("writable_book_content", $$0 -> $$0.a(cxz.e).a(cxz.f).a());
   public static final kl<cya> J = a("written_book_content", $$0 -> $$0.a(cya.i).a(cya.j).a());
   public static final kl<cwv> K = a("trim", $$0 -> $$0.a(cwv.a).a(cwv.b).a());
   public static final kl<cxi> L = a("debug_stick_state", $$0 -> $$0.a(cxi.b).a());
   public static final kl<cxg> M = a("entity_data", $$0 -> $$0.a(cxg.c).a(cxg.d));
   public static final kl<cxg> N = a("bucket_entity_data", $$0 -> $$0.a(cxg.b).a(cxg.d));
   public static final kl<cxg> O = a("block_entity_data", $$0 -> $$0.a(cxg.c).a(cxg.d));
   public static final kl<ji<cuj>> P = a("instrument", $$0 -> $$0.a(cuj.c).a(cuj.d).a());
   public static final kl<Integer> Q = a("ominous_bottle_amplifier", $$0 -> $$0.a(ayh.a(0, 4)).a(zl.g));
   public static final kl<List<alf>> R = a("recipes", $$0 -> $$0.a(alf.a.listOf()).a());
   public static final kl<cxp> S = a("lodestone_tracker", $$0 -> $$0.a(cxp.a).a(cxp.b).a());
   public static final kl<cxk> T = a("firework_explosion", $$0 -> $$0.a(cxk.c).a(cxk.d).a());
   public static final kl<cxl> U = a("fireworks", $$0 -> $$0.a(cxl.b).a(cxl.c).a());
   public static final kl<cxt> V = a("profile", $$0 -> $$0.a(cxt.a).a(cxt.b).a());
   public static final kl<alf> W = a("note_block_sound", $$0 -> $$0.a(alf.a).a(alf.b));
   public static final kl<dpa> X = a("banner_patterns", $$0 -> $$0.a(dpa.b).a(dpa.c).a());
   public static final kl<ctk> Y = a("base_color", $$0 -> $$0.a(ctk.q).a(ctk.r));
   public static final kl<dqn> Z = a("pot_decorations", $$0 -> $$0.a(dqn.b).a(dqn.c).a());
   public static final kl<cxn> aa = a("container", $$0 -> $$0.a(cxn.b).a(cxn.c).a());
   public static final kl<cxc> ab = a("block_state", $$0 -> $$0.a(cxc.b).a(cxc.c).a());
   public static final kl<List<dpg.c>> ac = a("bees", $$0 -> $$0.a(dpg.c.b).a(dpg.c.c.a(zl.a())).a());
   public static final kl<bqz> ad = a("lock", $$0 -> $$0.a(bqz.b));
   public static final kl<cxu> ae = a("container_loot", $$0 -> $$0.a(cxu.a));
   public static final ki af = ki.a().a(c, 64).a(i, cxo.a).a(k, dah.a).a(r, 0).a(n, cxm.a).a(j, cvl.a).a();

   public static kl<?> a(jv<kl<?>> $$0) {
      return b;
   }

   private static <T> kl<T> a(String $$0, UnaryOperator<kl.a<T>> $$1) {
      return jv.a(lp.as, $$0, $$1.apply(kl.a()).b());
   }
}
