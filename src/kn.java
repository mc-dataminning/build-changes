import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class kn {
   static final axm a = new axm(512);
   public static final km<cwr> b = a("custom_data", $$0 -> $$0.a(cwr.b));
   public static final km<Integer> c = a("max_stack_size", $$0 -> $$0.a(axo.a(1, 99)).a(yq.g));
   public static final km<Integer> d = a("max_damage", $$0 -> $$0.a(axo.l).a(yq.g));
   public static final km<Integer> e = a("damage", $$0 -> $$0.a(axo.k).a(yq.g));
   public static final km<cxj> f = a("unbreakable", $$0 -> $$0.a(cxj.a).a(cxj.b));
   public static final km<wu> g = a("custom_name", $$0 -> $$0.a(ww.g).a(ww.b).a());
   public static final km<wu> h = a("item_name", $$0 -> $$0.a(ww.g).a(ww.b).a());
   public static final km<cwz> i = a("lore", $$0 -> $$0.a(cwz.c).a(cwz.d).a());
   public static final km<cux> j = a("rarity", $$0 -> $$0.a(cux.e).a(cux.g));
   public static final km<czs> k = a("enchantments", $$0 -> $$0.a(czs.b).a(czs.c).a());
   public static final km<crq> l = a("can_place_on", $$0 -> $$0.a(crq.a).a(crq.b).a());
   public static final km<crq> m = a("can_break", $$0 -> $$0.a(crq.a).a(crq.b).a());
   public static final km<cwx> n = a("attribute_modifiers", $$0 -> $$0.a(cwx.b).a(cwx.c).a());
   public static final km<cws> o = a("custom_model_data", $$0 -> $$0.a(cws.b).a(cws.c));
   public static final km<azk> p = a("hide_additional_tooltip", $$0 -> $$0.a(azk.b).a(ys.a(azk.a)));
   public static final km<azk> q = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(azk.a)).a(ys.a(azk.a)));
   public static final km<Integer> r = a("repair_cost", $$0 -> $$0.a(axo.k).a(yq.g));
   public static final km<azk> s = a("creative_slot_lock", $$0 -> $$0.a(ys.a(azk.a)));
   public static final km<Boolean> t = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yq.b));
   public static final km<azk> u = a("intangible_projectile", $$0 -> $$0.a(azk.b));
   public static final km<cpf> v = a("food", $$0 -> $$0.a(cpf.a).a(cpf.b).a());
   public static final km<azk> w = a("fire_resistant", $$0 -> $$0.a(azk.b).a(ys.a(azk.a)));
   public static final km<cxh> x = a("tool", $$0 -> $$0.a(cxh.a).a(cxh.b).a());
   public static final km<czs> y = a("stored_enchantments", $$0 -> $$0.a(czs.b).a(czs.c).a());
   public static final km<cwu> z = a("dyed_color", $$0 -> $$0.a(cwu.a).a(cwu.b));
   public static final km<cxc> A = a("map_color", $$0 -> $$0.a(cxc.a).a(cxc.b));
   public static final km<epw> B = a("map_id", $$0 -> $$0.a(epw.a).a(epw.b));
   public static final km<cxb> C = a("map_decorations", $$0 -> $$0.a(cxb.b).a());
   public static final km<cxd> D = a("map_post_processing", $$0 -> $$0.a(cxd.d));
   public static final km<cwq> E = a("charged_projectiles", $$0 -> $$0.a(cwq.b).a(cwq.c).a());
   public static final km<cwp> F = a("bundle_contents", $$0 -> $$0.a(cwp.b).a(cwp.c).a());
   public static final km<cwe> G = a("potion_contents", $$0 -> $$0.a(cwe.b).a(cwe.c).a());
   public static final km<cxg> H = a("suspicious_stew_effects", $$0 -> $$0.a(cxg.b).a(cxg.c).a());
   public static final km<cxk> I = a("writable_book_content", $$0 -> $$0.a(cxk.e).a(cxk.f).a());
   public static final km<cxl> J = a("written_book_content", $$0 -> $$0.a(cxl.i).a(cxl.j).a());
   public static final km<cwh> K = a("trim", $$0 -> $$0.a(cwh.a).a(cwh.b).a());
   public static final km<cwt> L = a("debug_stick_state", $$0 -> $$0.a(cwt.b).a());
   public static final km<cwr> M = a("entity_data", $$0 -> $$0.a(cwr.c).a(cwr.d));
   public static final km<cwr> N = a("bucket_entity_data", $$0 -> $$0.a(cwr.b).a(cwr.d));
   public static final km<cwr> O = a("block_entity_data", $$0 -> $$0.a(cwr.c).a(cwr.d));
   public static final km<jj<ctv>> P = a("instrument", $$0 -> $$0.a(ctv.c).a(ctv.d).a());
   public static final km<Integer> Q = a("ominous_bottle_amplifier", $$0 -> $$0.a(axo.a(0, 4)).a(yq.g));
   public static final km<List<akk>> R = a("recipes", $$0 -> $$0.a(akk.a.listOf()).a());
   public static final km<cxa> S = a("lodestone_tracker", $$0 -> $$0.a(cxa.a).a(cxa.b).a());
   public static final km<cwv> T = a("firework_explosion", $$0 -> $$0.a(cwv.c).a(cwv.d).a());
   public static final km<cww> U = a("fireworks", $$0 -> $$0.a(cww.b).a(cww.c).a());
   public static final km<cxe> V = a("profile", $$0 -> $$0.a(cxe.a).a(cxe.b).a());
   public static final km<akk> W = a("note_block_sound", $$0 -> $$0.a(akk.a).a(akk.b));
   public static final km<dph> X = a("banner_patterns", $$0 -> $$0.a(dph.b).a(dph.c).a());
   public static final km<csw> Y = a("base_color", $$0 -> $$0.a(csw.q).a(csw.r));
   public static final km<dqv> Z = a("pot_decorations", $$0 -> $$0.a(dqv.b).a(dqv.c).a());
   public static final km<cwy> aa = a("container", $$0 -> $$0.a(cwy.b).a(cwy.c).a());
   public static final km<cwn> ab = a("block_state", $$0 -> $$0.a(cwn.b).a(cwn.c).a());
   public static final km<List<dpn.c>> ac = a("bees", $$0 -> $$0.a(dpn.c.b).a(dpn.c.c.a(yq.a())).a());
   public static final km<bqk> ad = a("lock", $$0 -> $$0.a(bqk.b));
   public static final km<cxf> ae = a("container_loot", $$0 -> $$0.a(cxf.a));
   public static final kj af = kj.a().a(c, 64).a(i, cwz.a).a(k, czs.a).a(r, 0).a(n, cwx.a).a(j, cux.a).a();

   public static km<?> a(jw<km<?>> $$0) {
      return b;
   }

   private static <T> km<T> a(String $$0, UnaryOperator<km.a<T>> $$1) {
      return jw.a(lq.aq, $$0, $$1.apply(km.a()).b());
   }
}
