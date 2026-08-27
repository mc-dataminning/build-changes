import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class jz {
   public static final jy<cuq> a = a("custom_data", $$0 -> $$0.a(cuq.b));
   public static final jy<Integer> b = a("damage", $$0 -> $$0.a(axe.i).a(yo.f));
   public static final jy<cvh> c = a("unbreakable", $$0 -> $$0.a(cvh.a).a(cvh.b));
   public static final jy<ws> d = a("custom_name", $$0 -> $$0.a(wu.g).a(wu.b));
   public static final jy<cuy> e = a("lore", $$0 -> $$0.a(cuy.b).a(cuy.c));
   public static final jy<cxu> f = a("enchantments", $$0 -> $$0.a(cxu.b).a(cxu.c));
   public static final jy<cpp> g = a("can_place_on", $$0 -> $$0.a(cpp.a).a(cpp.b));
   public static final jy<cpp> h = a("can_break", $$0 -> $$0.a(cpp.a).a(cpp.b));
   public static final jy<cuw> i = a("attribute_modifiers", $$0 -> $$0.a(cuw.b).a(cuw.c));
   public static final jy<cur> j = a("custom_model_data", $$0 -> $$0.a(cur.b).a(cur.c));
   public static final jy<ayy> k = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(ayy.a)).a(yq.a(ayy.a)));
   public static final jy<Integer> l = a("repair_cost", $$0 -> $$0.a(axe.i).a(yo.f));
   public static final jy<ayy> m = a("creative_slot_lock", $$0 -> $$0.a(yq.a(ayy.a)));
   public static final jy<Boolean> n = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yo.b));
   public static final jy<ayy> o = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(ayy.a)));
   public static final jy<cxu> p = a("stored_enchantments", $$0 -> $$0.a(cxu.b).a(cxu.c));
   public static final jy<cut> q = a("dyed_color", $$0 -> $$0.a(cut.a).a(cut.b));
   public static final jy<cvb> r = a("map_color", $$0 -> $$0.a(cvb.a).a(cvb.b));
   public static final jy<enc> s = a("map_id", $$0 -> $$0.a(enc.a).a(enc.b));
   public static final jy<cva> t = a("map_decorations", $$0 -> $$0.a(cva.b));
   public static final jy<cvc> u = a("map_post_processing", $$0 -> $$0.a(cvc.d));
   public static final jy<cup> v = a("charged_projectiles", $$0 -> $$0.a(cup.b).a(cup.c));
   public static final jy<cuo> w = a("bundle_contents", $$0 -> $$0.a(cuo.c).a(cuo.d));
   public static final jy<cuc> x = a("potion_contents", $$0 -> $$0.a(cuc.c).a(cuc.d));
   public static final jy<cvf> y = a("suspicious_stew_effects", $$0 -> $$0.a(cvf.b).a(cvf.c));
   public static final jy<cvi> z = a("writable_book_content", $$0 -> $$0.a(cvi.d).a(cvi.e));
   public static final jy<cvj> A = a("written_book_content", $$0 -> $$0.a(cvj.i).a(cvj.j));
   public static final jy<cuf> B = a("trim", $$0 -> $$0.a(cuf.a).a(cuf.b));
   public static final jy<cus> C = a("debug_stick_state", $$0 -> $$0.a(cus.b));
   public static final jy<cuq> D = a("entity_data", $$0 -> $$0.a(cuq.c).a(cuq.d));
   public static final jy<cuq> E = a("bucket_entity_data", $$0 -> $$0.a(cuq.b).a(cuq.d));
   public static final jy<cuq> F = a("block_entity_data", $$0 -> $$0.a(cuq.c).a(cuq.d));
   public static final jy<iv<crv>> G = a("instrument", $$0 -> $$0.a(crv.c).a(crv.d));
   public static final jy<List<akf>> H = a("recipes", $$0 -> $$0.a(akf.a.listOf()));
   public static final jy<cuz> I = a("lodestone_tracker", $$0 -> $$0.a(cuz.a).a(cuz.b));
   public static final jy<cuu> J = a("firework_explosion", $$0 -> $$0.a(cuu.c).a(cuu.d));
   public static final jy<cuv> K = a("fireworks", $$0 -> $$0.a(cuv.b).a(cuv.c));
   public static final jy<cvd> L = a("profile", $$0 -> $$0.a(cvd.a).a(cvd.b));
   public static final jy<akf> M = a("note_block_sound", $$0 -> $$0.a(akf.a).a(akf.b));
   public static final jy<dmu> N = a("banner_patterns", $$0 -> $$0.a(dmu.b).a(dmu.c));
   public static final jy<cqw> O = a("base_color", $$0 -> $$0.a(cqw.q).a(cqw.r));
   public static final jy<doh> P = a("pot_decorations", $$0 -> $$0.a(doh.b).a(doh.c));
   public static final jy<cux> Q = a("container", $$0 -> $$0.a(cux.b).a(cux.c));
   public static final jy<cum> R = a("block_state", $$0 -> $$0.a(cum.b).a(cum.c));
   public static final jy<List<dna.c>> S = a("bees", $$0 -> $$0.a(dna.c.b).a(dna.c.c.a(yo.a())));
   public static final jy<bot> T = a("lock", $$0 -> $$0.a(bot.b));
   public static final jy<cve> U = a("container_loot", $$0 -> $$0.a(cve.a));
   public static final jv V = jv.a().a(e, cuy.a).a(f, cxu.a).a(l, 0).a(i, cuw.a).a();

   public static jy<?> a(ji<jy<?>> $$0) {
      return a;
   }

   private static <T> jy<T> a(String $$0, UnaryOperator<jy.a<T>> $$1) {
      return ji.a(lc.as, $$0, $$1.apply(jy.a()).a());
   }
}
