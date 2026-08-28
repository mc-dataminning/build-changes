import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class ks {
   static final aym a = new aym(512);
   public static final kr<cyh> b = a("custom_data", $$0 -> $$0.a(cyh.b));
   public static final kr<Integer> c = a("max_stack_size", $$0 -> $$0.a(ayo.a(1, 99)).a(za.h));
   public static final kr<Integer> d = a("max_damage", $$0 -> $$0.a(ayo.l).a(za.h));
   public static final kr<Integer> e = a("damage", $$0 -> $$0.a(ayo.k).a(za.h));
   public static final kr<cza> f = a("unbreakable", $$0 -> $$0.a(cza.a).a(cza.b));
   public static final kr<xe> g = a("custom_name", $$0 -> $$0.a(xg.g).a(xg.b).a());
   public static final kr<xe> h = a("item_name", $$0 -> $$0.a(xg.g).a(xg.b).a());
   public static final kr<cyp> i = a("lore", $$0 -> $$0.a(cyp.c).a(cyp.d).a());
   public static final kr<cwp> j = a("rarity", $$0 -> $$0.a(cwp.e).a(cwp.g));
   public static final kr<dbt> k = a("enchantments", $$0 -> $$0.a(dbt.b).a(dbt.c).a());
   public static final kr<cti> l = a("can_place_on", $$0 -> $$0.a(cti.a).a(cti.b).a());
   public static final kr<cti> m = a("can_break", $$0 -> $$0.a(cti.a).a(cti.b).a());
   public static final kr<cyn> n = a("attribute_modifiers", $$0 -> $$0.a(cyn.b).a(cyn.c).a());
   public static final kr<cyi> o = a("custom_model_data", $$0 -> $$0.a(cyi.b).a(cyi.c));
   public static final kr<bak> p = a("hide_additional_tooltip", $$0 -> $$0.a(bak.b).a(zc.a(bak.a)));
   public static final kr<bak> q = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(bak.a)).a(zc.a(bak.a)));
   public static final kr<Integer> r = a("repair_cost", $$0 -> $$0.a(ayo.k).a(za.h));
   public static final kr<bak> s = a("creative_slot_lock", $$0 -> $$0.a(zc.a(bak.a)));
   public static final kr<Boolean> t = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(za.b));
   public static final kr<bak> u = a("intangible_projectile", $$0 -> $$0.a(bak.b));
   public static final kr<cqw> v = a("food", $$0 -> $$0.a(cqw.a).a(cqw.b).a());
   public static final kr<cye> w = a("consumable", $$0 -> $$0.a(cye.b).a(cye.c).a());
   public static final kr<czc> x = a("use_remainder", $$0 -> $$0.a(czc.a).a(czc.b).a());
   public static final kr<czb> y = a("use_cooldown", $$0 -> $$0.a(czb.a).a(czb.b).a());
   public static final kr<bak> z = a("fire_resistant", $$0 -> $$0.a(bak.b).a(zc.a(bak.a)));
   public static final kr<cyy> A = a("tool", $$0 -> $$0.a(cyy.a).a(cyy.b).a());
   public static final kr<dbl> B = a("enchantable", $$0 -> $$0.a(dbl.a).a(dbl.b).a());
   public static final kr<dbv> C = a("repairable", $$0 -> $$0.a(dbv.a).a(dbv.b).a());
   public static final kr<dbt> D = a("stored_enchantments", $$0 -> $$0.a(dbt.b).a(dbt.c).a());
   public static final kr<cyk> E = a("dyed_color", $$0 -> $$0.a(cyk.a).a(cyk.b));
   public static final kr<cys> F = a("map_color", $$0 -> $$0.a(cys.a).a(cys.b));
   public static final kr<esl> G = a("map_id", $$0 -> $$0.a(esl.a).a(esl.b));
   public static final kr<cyr> H = a("map_decorations", $$0 -> $$0.a(cyr.b).a());
   public static final kr<cyt> I = a("map_post_processing", $$0 -> $$0.a(cyt.d));
   public static final kr<cyd> J = a("charged_projectiles", $$0 -> $$0.a(cyd.b).a(cyd.c).a());
   public static final kr<cyc> K = a("bundle_contents", $$0 -> $$0.a(cyc.b).a(cyc.c).a());
   public static final kr<cxr> L = a("potion_contents", $$0 -> $$0.a(cxr.b).a(cxr.c).a());
   public static final kr<cyx> M = a("suspicious_stew_effects", $$0 -> $$0.a(cyx.c).a(cyx.d).a());
   public static final kr<czd> N = a("writable_book_content", $$0 -> $$0.a(czd.e).a(czd.f).a());
   public static final kr<cze> O = a("written_book_content", $$0 -> $$0.a(cze.i).a(cze.j).a());
   public static final kr<cxu> P = a("trim", $$0 -> $$0.a(cxu.a).a(cxu.b).a());
   public static final kr<cyj> Q = a("debug_stick_state", $$0 -> $$0.a(cyj.b).a());
   public static final kr<cyh> R = a("entity_data", $$0 -> $$0.a(cyh.c).a(cyh.d));
   public static final kr<cyh> S = a("bucket_entity_data", $$0 -> $$0.a(cyh.b).a(cyh.d));
   public static final kr<cyh> T = a("block_entity_data", $$0 -> $$0.a(cyh.c).a(cyh.d));
   public static final kr<jo<cvk>> U = a("instrument", $$0 -> $$0.a(cvk.c).a(cvk.d).a());
   public static final kr<cyu> V = a("ominous_bottle_amplifier", $$0 -> $$0.a(cyu.d).a(cyu.e));
   public static final kr<cvx> W = a("jukebox_playable", $$0 -> $$0.a(cvx.a).a(cvx.b));
   public static final kr<List<ale>> X = a("recipes", $$0 -> $$0.a(ale.a.listOf()).a());
   public static final kr<cyq> Y = a("lodestone_tracker", $$0 -> $$0.a(cyq.a).a(cyq.b).a());
   public static final kr<cyl> Z = a("firework_explosion", $$0 -> $$0.a(cyl.c).a(cyl.d).a());
   public static final kr<cym> aa = a("fireworks", $$0 -> $$0.a(cym.b).a(cym.c).a());
   public static final kr<cyv> ab = a("profile", $$0 -> $$0.a(cyv.a).a(cyv.b).a());
   public static final kr<ale> ac = a("note_block_sound", $$0 -> $$0.a(ale.a).a(ale.b));
   public static final kr<drm> ad = a("banner_patterns", $$0 -> $$0.a(drm.b).a(drm.c).a());
   public static final kr<cum> ae = a("base_color", $$0 -> $$0.a(cum.q).a(cum.r));
   public static final kr<dtb> af = a("pot_decorations", $$0 -> $$0.a(dtb.b).a(dtb.c).a());
   public static final kr<cyo> ag = a("container", $$0 -> $$0.a(cyo.b).a(cyo.c).a());
   public static final kr<cya> ah = a("block_state", $$0 -> $$0.a(cya.b).a(cya.c).a());
   public static final kr<List<drs.c>> ai = a("bees", $$0 -> $$0.a(drs.c.b).a(drs.c.c.a(za.a())).a());
   public static final kr<brt> aj = a("lock", $$0 -> $$0.a(brt.b));
   public static final kr<cyw> ak = a("container_loot", $$0 -> $$0.a(cyw.a));
   public static final ko al = ko.a().a(c, 64).a(i, cyp.a).a(k, dbt.a).a(r, 0).a(n, cyn.a).a(j, cwp.a).a();

   public static kr<?> a(kb<kr<?>> $$0) {
      return b;
   }

   private static <T> kr<T> a(String $$0, UnaryOperator<kr.a<T>> $$1) {
      return kb.a(lv.ap, $$0, $$1.apply(kr.a()).b());
   }
}
