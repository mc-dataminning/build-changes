import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class km {
   static final ayf a = new ayf(512);
   public static final kl<cxe> b = a("custom_data", $$0 -> $$0.a(cxe.b));
   public static final kl<Integer> c = a("max_stack_size", $$0 -> $$0.a(ayh.a(1, 99)).a(zl.g));
   public static final kl<Integer> d = a("max_damage", $$0 -> $$0.a(ayh.l).a(zl.g));
   public static final kl<Integer> e = a("damage", $$0 -> $$0.a(ayh.k).a(zl.g));
   public static final kl<cxw> f = a("unbreakable", $$0 -> $$0.a(cxw.a).a(cxw.b));
   public static final kl<xp> g = a("custom_name", $$0 -> $$0.a(xr.g).a(xr.b).a());
   public static final kl<xp> h = a("item_name", $$0 -> $$0.a(xr.g).a(xr.b).a());
   public static final kl<cxm> i = a("lore", $$0 -> $$0.a(cxm.c).a(cxm.d).a());
   public static final kl<cvj> j = a("rarity", $$0 -> $$0.a(cvj.e).a(cvj.g));
   public static final kl<daf> k = a("enchantments", $$0 -> $$0.a(daf.c).a(daf.d).a());
   public static final kl<csb> l = a("can_place_on", $$0 -> $$0.a(csb.a).a(csb.b).a());
   public static final kl<csb> m = a("can_break", $$0 -> $$0.a(csb.a).a(csb.b).a());
   public static final kl<cxk> n = a("attribute_modifiers", $$0 -> $$0.a(cxk.b).a(cxk.c).a());
   public static final kl<cxf> o = a("custom_model_data", $$0 -> $$0.a(cxf.b).a(cxf.c));
   public static final kl<bac> p = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(bac.a)).a(zn.a(bac.a)));
   public static final kl<bac> q = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(bac.a)).a(zn.a(bac.a)));
   public static final kl<Integer> r = a("repair_cost", $$0 -> $$0.a(ayh.k).a(zl.g));
   public static final kl<bac> s = a("creative_slot_lock", $$0 -> $$0.a(zn.a(bac.a)));
   public static final kl<Boolean> t = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(zl.b));
   public static final kl<bac> u = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(bac.a)));
   public static final kl<cpr> v = a("food", $$0 -> $$0.a(cpr.a).a(cpr.b).a());
   public static final kl<bac> w = a("fire_resistant", $$0 -> $$0.a(Codec.unit(bac.a)).a(zn.a(bac.a)));
   public static final kl<cxu> x = a("tool", $$0 -> $$0.a(cxu.a).a(cxu.b).a());
   public static final kl<daf> y = a("stored_enchantments", $$0 -> $$0.a(daf.c).a(daf.d).a());
   public static final kl<cxh> z = a("dyed_color", $$0 -> $$0.a(cxh.a).a(cxh.b));
   public static final kl<cxp> A = a("map_color", $$0 -> $$0.a(cxp.a).a(cxp.b));
   public static final kl<epi> B = a("map_id", $$0 -> $$0.a(epi.a).a(epi.b));
   public static final kl<cxo> C = a("map_decorations", $$0 -> $$0.a(cxo.b).a());
   public static final kl<cxq> D = a("map_post_processing", $$0 -> $$0.a(cxq.d));
   public static final kl<cxd> E = a("charged_projectiles", $$0 -> $$0.a(cxd.b).a(cxd.c).a());
   public static final kl<cxc> F = a("bundle_contents", $$0 -> $$0.a(cxc.b).a(cxc.c).a());
   public static final kl<cwq> G = a("potion_contents", $$0 -> $$0.a(cwq.b).a(cwq.c).a());
   public static final kl<cxt> H = a("suspicious_stew_effects", $$0 -> $$0.a(cxt.b).a(cxt.c).a());
   public static final kl<cxx> I = a("writable_book_content", $$0 -> $$0.a(cxx.e).a(cxx.f).a());
   public static final kl<cxy> J = a("written_book_content", $$0 -> $$0.a(cxy.i).a(cxy.j).a());
   public static final kl<cwt> K = a("trim", $$0 -> $$0.a(cwt.a).a(cwt.b).a());
   public static final kl<cxg> L = a("debug_stick_state", $$0 -> $$0.a(cxg.b).a());
   public static final kl<cxe> M = a("entity_data", $$0 -> $$0.a(cxe.c).a(cxe.d));
   public static final kl<cxe> N = a("bucket_entity_data", $$0 -> $$0.a(cxe.b).a(cxe.d));
   public static final kl<cxe> O = a("block_entity_data", $$0 -> $$0.a(cxe.c).a(cxe.d));
   public static final kl<ji<cuh>> P = a("instrument", $$0 -> $$0.a(cuh.c).a(cuh.d).a());
   public static final kl<Integer> Q = a("ominous_bottle_amplifier", $$0 -> $$0.a(ayh.a(0, 4)).a(zl.g));
   public static final kl<List<alf>> R = a("recipes", $$0 -> $$0.a(alf.a.listOf()).a());
   public static final kl<cxn> S = a("lodestone_tracker", $$0 -> $$0.a(cxn.a).a(cxn.b).a());
   public static final kl<cxi> T = a("firework_explosion", $$0 -> $$0.a(cxi.c).a(cxi.d).a());
   public static final kl<cxj> U = a("fireworks", $$0 -> $$0.a(cxj.b).a(cxj.c).a());
   public static final kl<cxr> V = a("profile", $$0 -> $$0.a(cxr.a).a(cxr.b).a());
   public static final kl<alf> W = a("note_block_sound", $$0 -> $$0.a(alf.a).a(alf.b));
   public static final kl<doy> X = a("banner_patterns", $$0 -> $$0.a(doy.b).a(doy.c).a());
   public static final kl<cti> Y = a("base_color", $$0 -> $$0.a(cti.q).a(cti.r));
   public static final kl<dql> Z = a("pot_decorations", $$0 -> $$0.a(dql.b).a(dql.c).a());
   public static final kl<cxl> aa = a("container", $$0 -> $$0.a(cxl.b).a(cxl.c).a());
   public static final kl<cxa> ab = a("block_state", $$0 -> $$0.a(cxa.b).a(cxa.c).a());
   public static final kl<List<dpe.c>> ac = a("bees", $$0 -> $$0.a(dpe.c.b).a(dpe.c.c.a(zl.a())).a());
   public static final kl<bqx> ad = a("lock", $$0 -> $$0.a(bqx.b));
   public static final kl<cxs> ae = a("container_loot", $$0 -> $$0.a(cxs.a));
   public static final ki af = ki.a().a(c, 64).a(i, cxm.a).a(k, daf.a).a(r, 0).a(n, cxk.a).a(j, cvj.a).a();

   public static kl<?> a(jv<kl<?>> $$0) {
      return b;
   }

   private static <T> kl<T> a(String $$0, UnaryOperator<kl.a<T>> $$1) {
      return jv.a(lp.as, $$0, $$1.apply(kl.a()).b());
   }
}
