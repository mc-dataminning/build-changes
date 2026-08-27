import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class kb {
   public static final ka<cwf> a = a("custom_data", $$0 -> $$0.a(cwf.b));
   public static final ka<Integer> b = a("max_stack_size", $$0 -> $$0.a(axn.a(1, 99)).a(yt.f));
   public static final ka<Integer> c = a("max_damage", $$0 -> $$0.a(axn.j).a(yt.f));
   public static final ka<Integer> d = a("damage", $$0 -> $$0.a(axn.i).a(yt.f));
   public static final ka<cwx> e = a("unbreakable", $$0 -> $$0.a(cwx.a).a(cwx.b));
   public static final ka<wx> f = a("custom_name", $$0 -> $$0.a(wz.g).a(wz.b));
   public static final ka<wx> g = a("item_name", $$0 -> $$0.a(wz.g).a(wz.b));
   public static final ka<cwn> h = a("lore", $$0 -> $$0.a(cwn.c).a(cwn.d));
   public static final ka<cuk> i = a("rarity", $$0 -> $$0.a(cuk.e).a(cuk.g));
   public static final ka<czg> j = a("enchantments", $$0 -> $$0.a(czg.c).a(czg.d));
   public static final ka<crc> k = a("can_place_on", $$0 -> $$0.a(crc.a).a(crc.b));
   public static final ka<crc> l = a("can_break", $$0 -> $$0.a(crc.a).a(crc.b));
   public static final ka<cwl> m = a("attribute_modifiers", $$0 -> $$0.a(cwl.b).a(cwl.c));
   public static final ka<cwg> n = a("custom_model_data", $$0 -> $$0.a(cwg.b).a(cwg.c));
   public static final ka<azh> o = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(azh.a)).a(yv.a(azh.a)));
   public static final ka<azh> p = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(azh.a)).a(yv.a(azh.a)));
   public static final ka<Integer> q = a("repair_cost", $$0 -> $$0.a(axn.i).a(yt.f));
   public static final ka<azh> r = a("creative_slot_lock", $$0 -> $$0.a(yv.a(azh.a)));
   public static final ka<Boolean> s = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yt.b));
   public static final ka<azh> t = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(azh.a)));
   public static final ka<cos> u = a("food", $$0 -> $$0.a(cos.a).a(cos.b));
   public static final ka<azh> v = a("fire_resistant", $$0 -> $$0.a(Codec.unit(azh.a)).a(yv.a(azh.a)));
   public static final ka<cwv> w = a("tool", $$0 -> $$0.a(cwv.a).a(cwv.b));
   public static final ka<czg> x = a("stored_enchantments", $$0 -> $$0.a(czg.c).a(czg.d));
   public static final ka<cwi> y = a("dyed_color", $$0 -> $$0.a(cwi.a).a(cwi.b));
   public static final ka<cwq> z = a("map_color", $$0 -> $$0.a(cwq.a).a(cwq.b));
   public static final ka<eoj> A = a("map_id", $$0 -> $$0.a(eoj.a).a(eoj.b));
   public static final ka<cwp> B = a("map_decorations", $$0 -> $$0.a(cwp.b));
   public static final ka<cwr> C = a("map_post_processing", $$0 -> $$0.a(cwr.d));
   public static final ka<cwe> D = a("charged_projectiles", $$0 -> $$0.a(cwe.b).a(cwe.c));
   public static final ka<cwd> E = a("bundle_contents", $$0 -> $$0.a(cwd.b).a(cwd.c));
   public static final ka<cvr> F = a("potion_contents", $$0 -> $$0.a(cvr.b).a(cvr.c));
   public static final ka<cwu> G = a("suspicious_stew_effects", $$0 -> $$0.a(cwu.b).a(cwu.c));
   public static final ka<cwy> H = a("writable_book_content", $$0 -> $$0.a(cwy.d).a(cwy.e));
   public static final ka<cwz> I = a("written_book_content", $$0 -> $$0.a(cwz.j).a(cwz.k));
   public static final ka<cvu> J = a("trim", $$0 -> $$0.a(cvu.a).a(cvu.b));
   public static final ka<cwh> K = a("debug_stick_state", $$0 -> $$0.a(cwh.b));
   public static final ka<cwf> L = a("entity_data", $$0 -> $$0.a(cwf.c).a(cwf.d));
   public static final ka<cwf> M = a("bucket_entity_data", $$0 -> $$0.a(cwf.b).a(cwf.d));
   public static final ka<cwf> N = a("block_entity_data", $$0 -> $$0.a(cwf.c).a(cwf.d));
   public static final ka<ix<cti>> O = a("instrument", $$0 -> $$0.a(cti.c).a(cti.d));
   public static final ka<Integer> P = a("ominous_bottle_amplifier", $$0 -> $$0.a(axn.a(0, 4)).a(yt.f));
   public static final ka<List<akn>> Q = a("recipes", $$0 -> $$0.a(akn.a.listOf()));
   public static final ka<cwo> R = a("lodestone_tracker", $$0 -> $$0.a(cwo.a).a(cwo.b));
   public static final ka<cwj> S = a("firework_explosion", $$0 -> $$0.a(cwj.c).a(cwj.d));
   public static final ka<cwk> T = a("fireworks", $$0 -> $$0.a(cwk.b).a(cwk.c));
   public static final ka<cws> U = a("profile", $$0 -> $$0.a(cws.a).a(cws.b));
   public static final ka<akn> V = a("note_block_sound", $$0 -> $$0.a(akn.a).a(akn.b));
   public static final ka<dnz> W = a("banner_patterns", $$0 -> $$0.a(dnz.b).a(dnz.c));
   public static final ka<csj> X = a("base_color", $$0 -> $$0.a(csj.q).a(csj.r));
   public static final ka<dpm> Y = a("pot_decorations", $$0 -> $$0.a(dpm.b).a(dpm.c));
   public static final ka<cwm> Z = a("container", $$0 -> $$0.a(cwm.b).a(cwm.c));
   public static final ka<cwb> aa = a("block_state", $$0 -> $$0.a(cwb.b).a(cwb.c));
   public static final ka<List<dof.c>> ab = a("bees", $$0 -> $$0.a(dof.c.b).a(dof.c.c.a(yt.a())));
   public static final ka<bpz> ac = a("lock", $$0 -> $$0.a(bpz.b));
   public static final ka<cwt> ad = a("container_loot", $$0 -> $$0.a(cwt.a));
   public static final jx ae = jx.a().a(b, 64).a(h, cwn.a).a(j, czg.a).a(q, 0).a(m, cwl.a).a(i, cuk.a).a();

   public static ka<?> a(jk<ka<?>> $$0) {
      return a;
   }

   private static <T> ka<T> a(String $$0, UnaryOperator<ka.a<T>> $$1) {
      return jk.a(le.as, $$0, $$1.apply(ka.a()).a());
   }
}
