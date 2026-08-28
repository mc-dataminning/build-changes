import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class kv {
   static final ayg a = new ayg(512);
   public static final ku<cyy> b = a("custom_data", $$0 -> $$0.a(cyy.b));
   public static final ku<Integer> c = a("max_stack_size", $$0 -> $$0.a(ayi.a(1, 99)).a(yl.h));
   public static final ku<Integer> d = a("max_damage", $$0 -> $$0.a(ayi.m).a(yl.h));
   public static final ku<Integer> e = a("damage", $$0 -> $$0.a(ayi.l).a(yl.h));
   public static final ku<czt> f = a("unbreakable", $$0 -> $$0.a(czt.a).a(czt.b));
   public static final ku<wp> g = a("custom_name", $$0 -> $$0.a(wr.g).a(wr.b).a());
   public static final ku<wp> h = a("item_name", $$0 -> $$0.a(wr.g).a(wr.b).a());
   public static final ku<akv> i = a("item_model", $$0 -> $$0.a(akv.a).a(akv.b).a());
   public static final ku<czi> j = a("lore", $$0 -> $$0.a(czi.c).a(czi.d).a());
   public static final ku<cxm> k = a("rarity", $$0 -> $$0.a(cxm.e).a(cxm.g));
   public static final ku<ddf> l = a("enchantments", $$0 -> $$0.a(ddf.b).a(ddf.c).a());
   public static final ku<cul> m = a("can_place_on", $$0 -> $$0.a(cul.a).a(cul.b).a());
   public static final ku<cul> n = a("can_break", $$0 -> $$0.a(cul.a).a(cul.b).a());
   public static final ku<czg> o = a("attribute_modifiers", $$0 -> $$0.a(czg.b).a(czg.c).a());
   public static final ku<cyz> p = a("custom_model_data", $$0 -> $$0.a(cyz.b).a(cyz.c));
   public static final ku<baf> q = a("hide_additional_tooltip", $$0 -> $$0.a(baf.b).a(yn.a(baf.a)));
   public static final ku<baf> r = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(baf.a)).a(yn.a(baf.a)));
   public static final ku<Integer> s = a("repair_cost", $$0 -> $$0.a(ayi.l).a(yl.h));
   public static final ku<baf> t = a("creative_slot_lock", $$0 -> $$0.a(yn.a(baf.a)));
   public static final ku<Boolean> u = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yl.b));
   public static final ku<baf> v = a("intangible_projectile", $$0 -> $$0.a(baf.b));
   public static final ku<crz> w = a("food", $$0 -> $$0.a(crz.a).a(crz.b).a());
   public static final ku<cyv> x = a("consumable", $$0 -> $$0.a(cyv.b).a(cyv.c).a());
   public static final ku<czv> y = a("use_remainder", $$0 -> $$0.a(czv.a).a(czv.b).a());
   public static final ku<czu> z = a("use_cooldown", $$0 -> $$0.a(czu.a).a(czu.b).a());
   public static final ku<cza> A = a("damage_resistant", $$0 -> $$0.a(cza.a).a(cza.b).a());
   public static final ku<czr> B = a("tool", $$0 -> $$0.a(czr.a).a(czr.b).a());
   public static final ku<dcx> C = a("enchantable", $$0 -> $$0.a(dcx.a).a(dcx.b).a());
   public static final ku<deu> D = a("equippable", $$0 -> $$0.a(deu.a).a(deu.b).a());
   public static final ku<ddh> E = a("repairable", $$0 -> $$0.a(ddh.a).a(ddh.b).a());
   public static final ku<baf> F = a("glider", $$0 -> $$0.a(baf.b).a(yn.a(baf.a)));
   public static final ku<akv> G = a("tooltip_style", $$0 -> $$0.a(akv.a).a(akv.b).a());
   public static final ku<czb> H = a("death_protection", $$0 -> $$0.a(czb.a).a(czb.b).a());
   public static final ku<ddf> I = a("stored_enchantments", $$0 -> $$0.a(ddf.b).a(ddf.c).a());
   public static final ku<czd> J = a("dyed_color", $$0 -> $$0.a(czd.a).a(czd.b));
   public static final ku<czl> K = a("map_color", $$0 -> $$0.a(czl.a).a(czl.b));
   public static final ku<eur> L = a("map_id", $$0 -> $$0.a(eur.a).a(eur.b));
   public static final ku<czk> M = a("map_decorations", $$0 -> $$0.a(czk.b).a());
   public static final ku<czm> N = a("map_post_processing", $$0 -> $$0.a(czm.d));
   public static final ku<cyu> O = a("charged_projectiles", $$0 -> $$0.a(cyu.b).a(cyu.c).a());
   public static final ku<cyt> P = a("bundle_contents", $$0 -> $$0.a(cyt.b).a(cyt.c).a());
   public static final ku<cyo> Q = a("potion_contents", $$0 -> $$0.a(cyo.c).a(cyo.d).a());
   public static final ku<czq> R = a("suspicious_stew_effects", $$0 -> $$0.a(czq.c).a(czq.d).a());
   public static final ku<czw> S = a("writable_book_content", $$0 -> $$0.a(czw.e).a(czw.f).a());
   public static final ku<czx> T = a("written_book_content", $$0 -> $$0.a(czx.i).a(czx.j).a());
   public static final ku<dew> U = a("trim", $$0 -> $$0.a(dew.a).a(dew.b).a());
   public static final ku<czc> V = a("debug_stick_state", $$0 -> $$0.a(czc.b).a());
   public static final ku<cyy> W = a("entity_data", $$0 -> $$0.a(cyy.c).a(cyy.d));
   public static final ku<cyy> X = a("bucket_entity_data", $$0 -> $$0.a(cyy.b).a(cyy.d));
   public static final ku<cyy> Y = a("block_entity_data", $$0 -> $$0.a(cyy.c).a(cyy.d));
   public static final ku<jr<cwi>> Z = a("instrument", $$0 -> $$0.a(cwi.c).a(cwi.d).a());
   public static final ku<czn> aa = a("ominous_bottle_amplifier", $$0 -> $$0.a(czn.d).a(czn.e));
   public static final ku<cwu> ab = a("jukebox_playable", $$0 -> $$0.a(cwu.a).a(cwu.b));
   public static final ku<List<aku<dbe<?>>>> ac = a("recipes", $$0 -> $$0.a(aku.a(mc.bk).listOf()).a());
   public static final ku<czj> ad = a("lodestone_tracker", $$0 -> $$0.a(czj.a).a(czj.b).a());
   public static final ku<cze> ae = a("firework_explosion", $$0 -> $$0.a(cze.c).a(cze.d).a());
   public static final ku<czf> af = a("fireworks", $$0 -> $$0.a(czf.b).a(czf.c).a());
   public static final ku<czo> ag = a("profile", $$0 -> $$0.a(czo.a).a(czo.b).a());
   public static final ku<akv> ah = a("note_block_sound", $$0 -> $$0.a(akv.a).a(akv.b));
   public static final ku<dtq> ai = a("banner_patterns", $$0 -> $$0.a(dtq.b).a(dtq.c).a());
   public static final ku<cvm> aj = a("base_color", $$0 -> $$0.a(cvm.q).a(cvm.r));
   public static final ku<dvg> ak = a("pot_decorations", $$0 -> $$0.a(dvg.b).a(dvg.c).a());
   public static final ku<czh> al = a("container", $$0 -> $$0.a(czh.b).a(czh.c).a());
   public static final ku<cyr> am = a("block_state", $$0 -> $$0.a(cyr.b).a(cyr.c).a());
   public static final ku<List<dtw.c>> an = a("bees", $$0 -> $$0.a(dtw.c.b).a(dtw.c.c.a(yl.a())).a());
   public static final ku<bsl> ao = a("lock", $$0 -> $$0.a(bsl.b));
   public static final ku<czp> ap = a("container_loot", $$0 -> $$0.a(czp.a));
   public static final kr aq = kr.a().a(c, 64).a(j, czi.a).a(l, ddf.a).a(s, 0).a(o, czg.a).a(k, cxm.a).a();

   public static ku<?> a(ke<ku<?>> $$0) {
      return b;
   }

   private static <T> ku<T> a(String $$0, UnaryOperator<ku.a<T>> $$1) {
      return ke.a(mb.ao, $$0, $$1.apply(ku.a()).b());
   }
}
