import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class kn {
   static final axm a = new axm(512);
   public static final km<cwq> b = a("custom_data", $$0 -> $$0.a(cwq.b));
   public static final km<Integer> c = a("max_stack_size", $$0 -> $$0.a(axo.a(1, 99)).a(yq.g));
   public static final km<Integer> d = a("max_damage", $$0 -> $$0.a(axo.l).a(yq.g));
   public static final km<Integer> e = a("damage", $$0 -> $$0.a(axo.k).a(yq.g));
   public static final km<cxi> f = a("unbreakable", $$0 -> $$0.a(cxi.a).a(cxi.b));
   public static final km<wu> g = a("custom_name", $$0 -> $$0.a(ww.g).a(ww.b).a());
   public static final km<wu> h = a("item_name", $$0 -> $$0.a(ww.g).a(ww.b).a());
   public static final km<cwy> i = a("lore", $$0 -> $$0.a(cwy.c).a(cwy.d).a());
   public static final km<cuw> j = a("rarity", $$0 -> $$0.a(cuw.e).a(cuw.g));
   public static final km<czr> k = a("enchantments", $$0 -> $$0.a(czr.c).a(czr.d).a());
   public static final km<crp> l = a("can_place_on", $$0 -> $$0.a(crp.a).a(crp.b).a());
   public static final km<crp> m = a("can_break", $$0 -> $$0.a(crp.a).a(crp.b).a());
   public static final km<cww> n = a("attribute_modifiers", $$0 -> $$0.a(cww.b).a(cww.c).a());
   public static final km<cwr> o = a("custom_model_data", $$0 -> $$0.a(cwr.b).a(cwr.c));
   public static final km<azk> p = a("hide_additional_tooltip", $$0 -> $$0.a(azk.b).a(ys.a(azk.a)));
   public static final km<azk> q = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(azk.a)).a(ys.a(azk.a)));
   public static final km<Integer> r = a("repair_cost", $$0 -> $$0.a(axo.k).a(yq.g));
   public static final km<azk> s = a("creative_slot_lock", $$0 -> $$0.a(ys.a(azk.a)));
   public static final km<Boolean> t = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yq.b));
   public static final km<azk> u = a("intangible_projectile", $$0 -> $$0.a(azk.b));
   public static final km<cpe> v = a("food", $$0 -> $$0.a(cpe.a).a(cpe.b).a());
   public static final km<azk> w = a("fire_resistant", $$0 -> $$0.a(azk.b).a(ys.a(azk.a)));
   public static final km<cxg> x = a("tool", $$0 -> $$0.a(cxg.a).a(cxg.b).a());
   public static final km<czr> y = a("stored_enchantments", $$0 -> $$0.a(czr.c).a(czr.d).a());
   public static final km<cwt> z = a("dyed_color", $$0 -> $$0.a(cwt.a).a(cwt.b));
   public static final km<cxb> A = a("map_color", $$0 -> $$0.a(cxb.a).a(cxb.b));
   public static final km<epu> B = a("map_id", $$0 -> $$0.a(epu.a).a(epu.b));
   public static final km<cxa> C = a("map_decorations", $$0 -> $$0.a(cxa.b).a());
   public static final km<cxc> D = a("map_post_processing", $$0 -> $$0.a(cxc.d));
   public static final km<cwp> E = a("charged_projectiles", $$0 -> $$0.a(cwp.b).a(cwp.c).a());
   public static final km<cwo> F = a("bundle_contents", $$0 -> $$0.a(cwo.b).a(cwo.c).a());
   public static final km<cwd> G = a("potion_contents", $$0 -> $$0.a(cwd.b).a(cwd.c).a());
   public static final km<cxf> H = a("suspicious_stew_effects", $$0 -> $$0.a(cxf.b).a(cxf.c).a());
   public static final km<cxj> I = a("writable_book_content", $$0 -> $$0.a(cxj.e).a(cxj.f).a());
   public static final km<cxk> J = a("written_book_content", $$0 -> $$0.a(cxk.i).a(cxk.j).a());
   public static final km<cwg> K = a("trim", $$0 -> $$0.a(cwg.a).a(cwg.b).a());
   public static final km<cws> L = a("debug_stick_state", $$0 -> $$0.a(cws.b).a());
   public static final km<cwq> M = a("entity_data", $$0 -> $$0.a(cwq.c).a(cwq.d));
   public static final km<cwq> N = a("bucket_entity_data", $$0 -> $$0.a(cwq.b).a(cwq.d));
   public static final km<cwq> O = a("block_entity_data", $$0 -> $$0.a(cwq.c).a(cwq.d));
   public static final km<jj<ctu>> P = a("instrument", $$0 -> $$0.a(ctu.c).a(ctu.d).a());
   public static final km<Integer> Q = a("ominous_bottle_amplifier", $$0 -> $$0.a(axo.a(0, 4)).a(yq.g));
   public static final km<List<akk>> R = a("recipes", $$0 -> $$0.a(akk.a.listOf()).a());
   public static final km<cwz> S = a("lodestone_tracker", $$0 -> $$0.a(cwz.a).a(cwz.b).a());
   public static final km<cwu> T = a("firework_explosion", $$0 -> $$0.a(cwu.c).a(cwu.d).a());
   public static final km<cwv> U = a("fireworks", $$0 -> $$0.a(cwv.b).a(cwv.c).a());
   public static final km<cxd> V = a("profile", $$0 -> $$0.a(cxd.a).a(cxd.b).a());
   public static final km<akk> W = a("note_block_sound", $$0 -> $$0.a(akk.a).a(akk.b));
   public static final km<dpg> X = a("banner_patterns", $$0 -> $$0.a(dpg.b).a(dpg.c).a());
   public static final km<csv> Y = a("base_color", $$0 -> $$0.a(csv.q).a(csv.r));
   public static final km<dqu> Z = a("pot_decorations", $$0 -> $$0.a(dqu.b).a(dqu.c).a());
   public static final km<cwx> aa = a("container", $$0 -> $$0.a(cwx.b).a(cwx.c).a());
   public static final km<cwm> ab = a("block_state", $$0 -> $$0.a(cwm.b).a(cwm.c).a());
   public static final km<List<dpm.c>> ac = a("bees", $$0 -> $$0.a(dpm.c.b).a(dpm.c.c.a(yq.a())).a());
   public static final km<bqj> ad = a("lock", $$0 -> $$0.a(bqj.b));
   public static final km<cxe> ae = a("container_loot", $$0 -> $$0.a(cxe.a));
   public static final kj af = kj.a().a(c, 64).a(i, cwy.a).a(k, czr.a).a(r, 0).a(n, cww.a).a(j, cuw.a).a();

   public static km<?> a(jw<km<?>> $$0) {
      return b;
   }

   private static <T> km<T> a(String $$0, UnaryOperator<km.a<T>> $$1) {
      return jw.a(lq.aq, $$0, $$1.apply(km.a()).b());
   }
}
