import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class kv {
   static final ayf a = new ayf(512);
   public static final ku<cyw> b = a("custom_data", $$0 -> $$0.a(cyw.b));
   public static final ku<Integer> c = a("max_stack_size", $$0 -> $$0.a(ayh.a(1, 99)).a(yk.h));
   public static final ku<Integer> d = a("max_damage", $$0 -> $$0.a(ayh.m).a(yk.h));
   public static final ku<Integer> e = a("damage", $$0 -> $$0.a(ayh.l).a(yk.h));
   public static final ku<czr> f = a("unbreakable", $$0 -> $$0.a(czr.a).a(czr.b));
   public static final ku<wo> g = a("custom_name", $$0 -> $$0.a(wq.g).a(wq.b).a());
   public static final ku<wo> h = a("item_name", $$0 -> $$0.a(wq.g).a(wq.b).a());
   public static final ku<aku> i = a("item_model", $$0 -> $$0.a(aku.a).a(aku.b).a());
   public static final ku<czg> j = a("lore", $$0 -> $$0.a(czg.c).a(czg.d).a());
   public static final ku<cxk> k = a("rarity", $$0 -> $$0.a(cxk.e).a(cxk.g));
   public static final ku<ddd> l = a("enchantments", $$0 -> $$0.a(ddd.b).a(ddd.c).a());
   public static final ku<cuj> m = a("can_place_on", $$0 -> $$0.a(cuj.a).a(cuj.b).a());
   public static final ku<cuj> n = a("can_break", $$0 -> $$0.a(cuj.a).a(cuj.b).a());
   public static final ku<cze> o = a("attribute_modifiers", $$0 -> $$0.a(cze.b).a(cze.c).a());
   public static final ku<cyx> p = a("custom_model_data", $$0 -> $$0.a(cyx.b).a(cyx.c));
   public static final ku<bae> q = a("hide_additional_tooltip", $$0 -> $$0.a(bae.b).a(ym.a(bae.a)));
   public static final ku<bae> r = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(bae.a)).a(ym.a(bae.a)));
   public static final ku<Integer> s = a("repair_cost", $$0 -> $$0.a(ayh.l).a(yk.h));
   public static final ku<bae> t = a("creative_slot_lock", $$0 -> $$0.a(ym.a(bae.a)));
   public static final ku<Boolean> u = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yk.b));
   public static final ku<bae> v = a("intangible_projectile", $$0 -> $$0.a(bae.b));
   public static final ku<crx> w = a("food", $$0 -> $$0.a(crx.a).a(crx.b).a());
   public static final ku<cyt> x = a("consumable", $$0 -> $$0.a(cyt.b).a(cyt.c).a());
   public static final ku<czt> y = a("use_remainder", $$0 -> $$0.a(czt.a).a(czt.b).a());
   public static final ku<czs> z = a("use_cooldown", $$0 -> $$0.a(czs.a).a(czs.b).a());
   public static final ku<cyy> A = a("damage_resistant", $$0 -> $$0.a(cyy.a).a(cyy.b).a());
   public static final ku<czp> B = a("tool", $$0 -> $$0.a(czp.a).a(czp.b).a());
   public static final ku<dcv> C = a("enchantable", $$0 -> $$0.a(dcv.a).a(dcv.b).a());
   public static final ku<des> D = a("equippable", $$0 -> $$0.a(des.a).a(des.b).a());
   public static final ku<ddf> E = a("repairable", $$0 -> $$0.a(ddf.a).a(ddf.b).a());
   public static final ku<bae> F = a("glider", $$0 -> $$0.a(bae.b).a(ym.a(bae.a)));
   public static final ku<aku> G = a("tooltip_style", $$0 -> $$0.a(aku.a).a(aku.b).a());
   public static final ku<cyz> H = a("death_protection", $$0 -> $$0.a(cyz.a).a(cyz.b).a());
   public static final ku<ddd> I = a("stored_enchantments", $$0 -> $$0.a(ddd.b).a(ddd.c).a());
   public static final ku<czb> J = a("dyed_color", $$0 -> $$0.a(czb.a).a(czb.b));
   public static final ku<czj> K = a("map_color", $$0 -> $$0.a(czj.a).a(czj.b));
   public static final ku<eup> L = a("map_id", $$0 -> $$0.a(eup.a).a(eup.b));
   public static final ku<czi> M = a("map_decorations", $$0 -> $$0.a(czi.b).a());
   public static final ku<czk> N = a("map_post_processing", $$0 -> $$0.a(czk.d));
   public static final ku<cys> O = a("charged_projectiles", $$0 -> $$0.a(cys.b).a(cys.c).a());
   public static final ku<cyr> P = a("bundle_contents", $$0 -> $$0.a(cyr.b).a(cyr.c).a());
   public static final ku<cym> Q = a("potion_contents", $$0 -> $$0.a(cym.c).a(cym.d).a());
   public static final ku<czo> R = a("suspicious_stew_effects", $$0 -> $$0.a(czo.c).a(czo.d).a());
   public static final ku<czu> S = a("writable_book_content", $$0 -> $$0.a(czu.e).a(czu.f).a());
   public static final ku<czv> T = a("written_book_content", $$0 -> $$0.a(czv.i).a(czv.j).a());
   public static final ku<deu> U = a("trim", $$0 -> $$0.a(deu.a).a(deu.b).a());
   public static final ku<cza> V = a("debug_stick_state", $$0 -> $$0.a(cza.b).a());
   public static final ku<cyw> W = a("entity_data", $$0 -> $$0.a(cyw.c).a(cyw.d));
   public static final ku<cyw> X = a("bucket_entity_data", $$0 -> $$0.a(cyw.b).a(cyw.d));
   public static final ku<cyw> Y = a("block_entity_data", $$0 -> $$0.a(cyw.c).a(cyw.d));
   public static final ku<jr<cwg>> Z = a("instrument", $$0 -> $$0.a(cwg.c).a(cwg.d).a());
   public static final ku<czl> aa = a("ominous_bottle_amplifier", $$0 -> $$0.a(czl.d).a(czl.e));
   public static final ku<cws> ab = a("jukebox_playable", $$0 -> $$0.a(cws.a).a(cws.b));
   public static final ku<List<akt<dbc<?>>>> ac = a("recipes", $$0 -> $$0.a(akt.a(mc.bk).listOf()).a());
   public static final ku<czh> ad = a("lodestone_tracker", $$0 -> $$0.a(czh.a).a(czh.b).a());
   public static final ku<czc> ae = a("firework_explosion", $$0 -> $$0.a(czc.c).a(czc.d).a());
   public static final ku<czd> af = a("fireworks", $$0 -> $$0.a(czd.b).a(czd.c).a());
   public static final ku<czm> ag = a("profile", $$0 -> $$0.a(czm.a).a(czm.b).a());
   public static final ku<aku> ah = a("note_block_sound", $$0 -> $$0.a(aku.a).a(aku.b));
   public static final ku<dto> ai = a("banner_patterns", $$0 -> $$0.a(dto.b).a(dto.c).a());
   public static final ku<cvk> aj = a("base_color", $$0 -> $$0.a(cvk.q).a(cvk.r));
   public static final ku<dve> ak = a("pot_decorations", $$0 -> $$0.a(dve.b).a(dve.c).a());
   public static final ku<czf> al = a("container", $$0 -> $$0.a(czf.b).a(czf.c).a());
   public static final ku<cyp> am = a("block_state", $$0 -> $$0.a(cyp.b).a(cyp.c).a());
   public static final ku<List<dtu.c>> an = a("bees", $$0 -> $$0.a(dtu.c.b).a(dtu.c.c.a(yk.a())).a());
   public static final ku<bsj> ao = a("lock", $$0 -> $$0.a(bsj.b));
   public static final ku<czn> ap = a("container_loot", $$0 -> $$0.a(czn.a));
   public static final kr aq = kr.a().a(c, 64).a(j, czg.a).a(l, ddd.a).a(s, 0).a(o, cze.a).a(k, cxk.a).a();

   public static ku<?> a(ke<ku<?>> $$0) {
      return b;
   }

   private static <T> ku<T> a(String $$0, UnaryOperator<ku.a<T>> $$1) {
      return ke.a(mb.ao, $$0, $$1.apply(ku.a()).b());
   }
}
