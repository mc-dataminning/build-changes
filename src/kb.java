import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class kb {
   public static final ka<cwd> a = a("custom_data", $$0 -> $$0.a(cwd.b));
   public static final ka<Integer> b = a("max_stack_size", $$0 -> $$0.a(axm.a(1, 99)).a(yt.f));
   public static final ka<Integer> c = a("max_damage", $$0 -> $$0.a(axm.j).a(yt.f));
   public static final ka<Integer> d = a("damage", $$0 -> $$0.a(axm.i).a(yt.f));
   public static final ka<cwv> e = a("unbreakable", $$0 -> $$0.a(cwv.a).a(cwv.b));
   public static final ka<wx> f = a("custom_name", $$0 -> $$0.a(wz.g).a(wz.b));
   public static final ka<wx> g = a("item_name", $$0 -> $$0.a(wz.g).a(wz.b));
   public static final ka<cwl> h = a("lore", $$0 -> $$0.a(cwl.c).a(cwl.d));
   public static final ka<cui> i = a("rarity", $$0 -> $$0.a(cui.e).a(cui.g));
   public static final ka<cze> j = a("enchantments", $$0 -> $$0.a(cze.c).a(cze.d));
   public static final ka<cra> k = a("can_place_on", $$0 -> $$0.a(cra.a).a(cra.b));
   public static final ka<cra> l = a("can_break", $$0 -> $$0.a(cra.a).a(cra.b));
   public static final ka<cwj> m = a("attribute_modifiers", $$0 -> $$0.a(cwj.b).a(cwj.c));
   public static final ka<cwe> n = a("custom_model_data", $$0 -> $$0.a(cwe.b).a(cwe.c));
   public static final ka<azf> o = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(azf.a)).a(yv.a(azf.a)));
   public static final ka<azf> p = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(azf.a)).a(yv.a(azf.a)));
   public static final ka<Integer> q = a("repair_cost", $$0 -> $$0.a(axm.i).a(yt.f));
   public static final ka<azf> r = a("creative_slot_lock", $$0 -> $$0.a(yv.a(azf.a)));
   public static final ka<Boolean> s = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yt.b));
   public static final ka<azf> t = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(azf.a)));
   public static final ka<coq> u = a("food", $$0 -> $$0.a(coq.a).a(coq.b));
   public static final ka<azf> v = a("fire_resistant", $$0 -> $$0.a(Codec.unit(azf.a)).a(yv.a(azf.a)));
   public static final ka<cwt> w = a("tool", $$0 -> $$0.a(cwt.a).a(cwt.b));
   public static final ka<cze> x = a("stored_enchantments", $$0 -> $$0.a(cze.c).a(cze.d));
   public static final ka<cwg> y = a("dyed_color", $$0 -> $$0.a(cwg.a).a(cwg.b));
   public static final ka<cwo> z = a("map_color", $$0 -> $$0.a(cwo.a).a(cwo.b));
   public static final ka<eoh> A = a("map_id", $$0 -> $$0.a(eoh.a).a(eoh.b));
   public static final ka<cwn> B = a("map_decorations", $$0 -> $$0.a(cwn.b));
   public static final ka<cwp> C = a("map_post_processing", $$0 -> $$0.a(cwp.d));
   public static final ka<cwc> D = a("charged_projectiles", $$0 -> $$0.a(cwc.b).a(cwc.c));
   public static final ka<cwb> E = a("bundle_contents", $$0 -> $$0.a(cwb.c).a(cwb.d));
   public static final ka<cvp> F = a("potion_contents", $$0 -> $$0.a(cvp.b).a(cvp.c));
   public static final ka<cws> G = a("suspicious_stew_effects", $$0 -> $$0.a(cws.b).a(cws.c));
   public static final ka<cww> H = a("writable_book_content", $$0 -> $$0.a(cww.d).a(cww.e));
   public static final ka<cwx> I = a("written_book_content", $$0 -> $$0.a(cwx.j).a(cwx.k));
   public static final ka<cvs> J = a("trim", $$0 -> $$0.a(cvs.a).a(cvs.b));
   public static final ka<cwf> K = a("debug_stick_state", $$0 -> $$0.a(cwf.b));
   public static final ka<cwd> L = a("entity_data", $$0 -> $$0.a(cwd.c).a(cwd.d));
   public static final ka<cwd> M = a("bucket_entity_data", $$0 -> $$0.a(cwd.b).a(cwd.d));
   public static final ka<cwd> N = a("block_entity_data", $$0 -> $$0.a(cwd.c).a(cwd.d));
   public static final ka<ix<ctg>> O = a("instrument", $$0 -> $$0.a(ctg.c).a(ctg.d));
   public static final ka<Integer> P = a("ominous_bottle_amplifier", $$0 -> $$0.a(axm.a(0, 4)).a(yt.f));
   public static final ka<List<akm>> Q = a("recipes", $$0 -> $$0.a(akm.a.listOf()));
   public static final ka<cwm> R = a("lodestone_tracker", $$0 -> $$0.a(cwm.a).a(cwm.b));
   public static final ka<cwh> S = a("firework_explosion", $$0 -> $$0.a(cwh.c).a(cwh.d));
   public static final ka<cwi> T = a("fireworks", $$0 -> $$0.a(cwi.b).a(cwi.c));
   public static final ka<cwq> U = a("profile", $$0 -> $$0.a(cwq.a).a(cwq.b));
   public static final ka<akm> V = a("note_block_sound", $$0 -> $$0.a(akm.a).a(akm.b));
   public static final ka<dnx> W = a("banner_patterns", $$0 -> $$0.a(dnx.b).a(dnx.c));
   public static final ka<csh> X = a("base_color", $$0 -> $$0.a(csh.q).a(csh.r));
   public static final ka<dpk> Y = a("pot_decorations", $$0 -> $$0.a(dpk.b).a(dpk.c));
   public static final ka<cwk> Z = a("container", $$0 -> $$0.a(cwk.b).a(cwk.c));
   public static final ka<cvz> aa = a("block_state", $$0 -> $$0.a(cvz.b).a(cvz.c));
   public static final ka<List<dod.c>> ab = a("bees", $$0 -> $$0.a(dod.c.b).a(dod.c.c.a(yt.a())));
   public static final ka<bpx> ac = a("lock", $$0 -> $$0.a(bpx.b));
   public static final ka<cwr> ad = a("container_loot", $$0 -> $$0.a(cwr.a));
   public static final jx ae = jx.a().a(b, 64).a(h, cwl.a).a(j, cze.a).a(q, 0).a(m, cwj.a).a(i, cui.a).a();

   public static ka<?> a(jk<ka<?>> $$0) {
      return a;
   }

   private static <T> ka<T> a(String $$0, UnaryOperator<ka.a<T>> $$1) {
      return jk.a(le.as, $$0, $$1.apply(ka.a()).a());
   }
}
