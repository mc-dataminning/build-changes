import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class ku {
   static final ayt a = new ayt(512);
   public static final kt<cyv> b = a("custom_data", $$0 -> $$0.a(cyv.b));
   public static final kt<Integer> c = a("max_stack_size", $$0 -> $$0.a(ayv.a(1, 99)).a(zf.h));
   public static final kt<Integer> d = a("max_damage", $$0 -> $$0.a(ayv.m).a(zf.h));
   public static final kt<Integer> e = a("damage", $$0 -> $$0.a(ayv.l).a(zf.h));
   public static final kt<czq> f = a("unbreakable", $$0 -> $$0.a(czq.a).a(czq.b));
   public static final kt<xj> g = a("custom_name", $$0 -> $$0.a(xl.g).a(xl.b).a());
   public static final kt<xj> h = a("item_name", $$0 -> $$0.a(xl.g).a(xl.b).a());
   public static final kt<alj> i = a("item_model", $$0 -> $$0.a(alj.a).a(alj.b).a());
   public static final kt<czf> j = a("lore", $$0 -> $$0.a(czf.c).a(czf.d).a());
   public static final kt<cxj> k = a("rarity", $$0 -> $$0.a(cxj.e).a(cxj.g));
   public static final kt<dcj> l = a("enchantments", $$0 -> $$0.a(dcj.b).a(dcj.c).a());
   public static final kt<cui> m = a("can_place_on", $$0 -> $$0.a(cui.a).a(cui.b).a());
   public static final kt<cui> n = a("can_break", $$0 -> $$0.a(cui.a).a(cui.b).a());
   public static final kt<czd> o = a("attribute_modifiers", $$0 -> $$0.a(czd.b).a(czd.c).a());
   public static final kt<cyw> p = a("custom_model_data", $$0 -> $$0.a(cyw.b).a(cyw.c));
   public static final kt<bas> q = a("hide_additional_tooltip", $$0 -> $$0.a(bas.b).a(zh.a(bas.a)));
   public static final kt<bas> r = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(bas.a)).a(zh.a(bas.a)));
   public static final kt<Integer> s = a("repair_cost", $$0 -> $$0.a(ayv.l).a(zf.h));
   public static final kt<bas> t = a("creative_slot_lock", $$0 -> $$0.a(zh.a(bas.a)));
   public static final kt<Boolean> u = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(zf.b));
   public static final kt<bas> v = a("intangible_projectile", $$0 -> $$0.a(bas.b));
   public static final kt<crw> w = a("food", $$0 -> $$0.a(crw.a).a(crw.b).a());
   public static final kt<cys> x = a("consumable", $$0 -> $$0.a(cys.b).a(cys.c).a());
   public static final kt<czs> y = a("use_remainder", $$0 -> $$0.a(czs.a).a(czs.b).a());
   public static final kt<czr> z = a("use_cooldown", $$0 -> $$0.a(czr.a).a(czr.b).a());
   public static final kt<cyx> A = a("damage_resistant", $$0 -> $$0.a(cyx.a).a(cyx.b).a());
   public static final kt<czo> B = a("tool", $$0 -> $$0.a(czo.a).a(czo.b).a());
   public static final kt<dcb> C = a("enchantable", $$0 -> $$0.a(dcb.a).a(dcb.b).a());
   public static final kt<ddy> D = a("equippable", $$0 -> $$0.a(ddy.a).a(ddy.b).a());
   public static final kt<dcl> E = a("repairable", $$0 -> $$0.a(dcl.a).a(dcl.b).a());
   public static final kt<bas> F = a("glider", $$0 -> $$0.a(bas.b).a(zh.a(bas.a)));
   public static final kt<alj> G = a("tooltip_style", $$0 -> $$0.a(alj.a).a(alj.b).a());
   public static final kt<cyy> H = a("death_protection", $$0 -> $$0.a(cyy.a).a(cyy.b).a());
   public static final kt<dcj> I = a("stored_enchantments", $$0 -> $$0.a(dcj.b).a(dcj.c).a());
   public static final kt<cza> J = a("dyed_color", $$0 -> $$0.a(cza.a).a(cza.b));
   public static final kt<czi> K = a("map_color", $$0 -> $$0.a(czi.a).a(czi.b));
   public static final kt<etn> L = a("map_id", $$0 -> $$0.a(etn.a).a(etn.b));
   public static final kt<czh> M = a("map_decorations", $$0 -> $$0.a(czh.b).a());
   public static final kt<czj> N = a("map_post_processing", $$0 -> $$0.a(czj.d));
   public static final kt<cyr> O = a("charged_projectiles", $$0 -> $$0.a(cyr.b).a(cyr.c).a());
   public static final kt<cyq> P = a("bundle_contents", $$0 -> $$0.a(cyq.b).a(cyq.c).a());
   public static final kt<cyl> Q = a("potion_contents", $$0 -> $$0.a(cyl.b).a(cyl.c).a());
   public static final kt<czn> R = a("suspicious_stew_effects", $$0 -> $$0.a(czn.c).a(czn.d).a());
   public static final kt<czt> S = a("writable_book_content", $$0 -> $$0.a(czt.e).a(czt.f).a());
   public static final kt<czu> T = a("written_book_content", $$0 -> $$0.a(czu.i).a(czu.j).a());
   public static final kt<dea> U = a("trim", $$0 -> $$0.a(dea.a).a(dea.b).a());
   public static final kt<cyz> V = a("debug_stick_state", $$0 -> $$0.a(cyz.b).a());
   public static final kt<cyv> W = a("entity_data", $$0 -> $$0.a(cyv.c).a(cyv.d));
   public static final kt<cyv> X = a("bucket_entity_data", $$0 -> $$0.a(cyv.b).a(cyv.d));
   public static final kt<cyv> Y = a("block_entity_data", $$0 -> $$0.a(cyv.c).a(cyv.d));
   public static final kt<jq<cwf>> Z = a("instrument", $$0 -> $$0.a(cwf.c).a(cwf.d).a());
   public static final kt<czk> aa = a("ominous_bottle_amplifier", $$0 -> $$0.a(czk.d).a(czk.e));
   public static final kt<cwr> ab = a("jukebox_playable", $$0 -> $$0.a(cwr.a).a(cwr.b));
   public static final kt<List<alj>> ac = a("recipes", $$0 -> $$0.a(alj.a.listOf()).a());
   public static final kt<czg> ad = a("lodestone_tracker", $$0 -> $$0.a(czg.a).a(czg.b).a());
   public static final kt<czb> ae = a("firework_explosion", $$0 -> $$0.a(czb.c).a(czb.d).a());
   public static final kt<czc> af = a("fireworks", $$0 -> $$0.a(czc.b).a(czc.c).a());
   public static final kt<czl> ag = a("profile", $$0 -> $$0.a(czl.a).a(czl.b).a());
   public static final kt<alj> ah = a("note_block_sound", $$0 -> $$0.a(alj.a).a(alj.b));
   public static final kt<dsp> ai = a("banner_patterns", $$0 -> $$0.a(dsp.b).a(dsp.c).a());
   public static final kt<cvj> aj = a("base_color", $$0 -> $$0.a(cvj.q).a(cvj.r));
   public static final kt<due> ak = a("pot_decorations", $$0 -> $$0.a(due.b).a(due.c).a());
   public static final kt<cze> al = a("container", $$0 -> $$0.a(cze.b).a(cze.c).a());
   public static final kt<cyo> am = a("block_state", $$0 -> $$0.a(cyo.b).a(cyo.c).a());
   public static final kt<List<dsv.c>> an = a("bees", $$0 -> $$0.a(dsv.c.b).a(dsv.c.c.a(zf.a())).a());
   public static final kt<bsl> ao = a("lock", $$0 -> $$0.a(bsl.b));
   public static final kt<czm> ap = a("container_loot", $$0 -> $$0.a(czm.a));
   public static final kq aq = kq.a().a(c, 64).a(j, czf.a).a(l, dcj.a).a(s, 0).a(o, czd.a).a(k, cxj.a).a();

   public static kt<?> a(kd<kt<?>> $$0) {
      return b;
   }

   private static <T> kt<T> a(String $$0, UnaryOperator<kt.a<T>> $$1) {
      return kd.a(lz.ao, $$0, $$1.apply(kt.a()).b());
   }
}
