import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class kv {
   static final ayg a = new ayg(512);
   public static final ku<czo> b = a("custom_data", $$0 -> $$0.a(czo.b));
   public static final ku<Integer> c = a("max_stack_size", $$0 -> $$0.a(ayi.a(1, 99)).a(yl.h));
   public static final ku<Integer> d = a("max_damage", $$0 -> $$0.a(ayi.m).a(yl.h));
   public static final ku<Integer> e = a("damage", $$0 -> $$0.a(ayi.l).a(yl.h));
   public static final ku<daj> f = a("unbreakable", $$0 -> $$0.a(daj.a).a(daj.b));
   public static final ku<wp> g = a("custom_name", $$0 -> $$0.a(wr.a).a(wr.b).a());
   public static final ku<wp> h = a("item_name", $$0 -> $$0.a(wr.a).a(wr.b).a());
   public static final ku<aku> i = a("item_model", $$0 -> $$0.a(aku.a).a(aku.b).a());
   public static final ku<czy> j = a("lore", $$0 -> $$0.a(czy.c).a(czy.d).a());
   public static final ku<cyd> k = a("rarity", $$0 -> $$0.a(cyd.e).a(cyd.g));
   public static final ku<ddx> l = a("enchantments", $$0 -> $$0.a(ddx.b).a(ddx.c).a());
   public static final ku<cvf> m = a("can_place_on", $$0 -> $$0.a(cvf.a).a(cvf.b).a());
   public static final ku<cvf> n = a("can_break", $$0 -> $$0.a(cvf.a).a(cvf.b).a());
   public static final ku<czw> o = a("attribute_modifiers", $$0 -> $$0.a(czw.b).a(czw.c).a());
   public static final ku<czp> p = a("custom_model_data", $$0 -> $$0.a(czp.b).a(czp.c));
   public static final ku<baf> q = a("hide_additional_tooltip", $$0 -> $$0.a(baf.b).a(baf.c));
   public static final ku<baf> r = a("hide_tooltip", $$0 -> $$0.a(Codec.unit(baf.a)).a(baf.c));
   public static final ku<Integer> s = a("repair_cost", $$0 -> $$0.a(ayi.l).a(yl.h));
   public static final ku<baf> t = a("creative_slot_lock", $$0 -> $$0.a(baf.c));
   public static final ku<Boolean> u = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yl.b));
   public static final ku<baf> v = a("intangible_projectile", $$0 -> $$0.a(baf.b));
   public static final ku<cst> w = a("food", $$0 -> $$0.a(cst.a).a(cst.b).a());
   public static final ku<czl> x = a("consumable", $$0 -> $$0.a(czl.b).a(czl.c).a());
   public static final ku<dal> y = a("use_remainder", $$0 -> $$0.a(dal.a).a(dal.b).a());
   public static final ku<dak> z = a("use_cooldown", $$0 -> $$0.a(dak.a).a(dak.b).a());
   public static final ku<czq> A = a("damage_resistant", $$0 -> $$0.a(czq.a).a(czq.b).a());
   public static final ku<dah> B = a("tool", $$0 -> $$0.a(dah.a).a(dah.b).a());
   public static final ku<dam> C = a("weapon", $$0 -> $$0.a(dam.a).a(dam.b).a());
   public static final ku<ddp> D = a("enchantable", $$0 -> $$0.a(ddp.a).a(ddp.b).a());
   public static final ku<dfm> E = a("equippable", $$0 -> $$0.a(dfm.a).a(dfm.b).a());
   public static final ku<ddz> F = a("repairable", $$0 -> $$0.a(ddz.a).a(ddz.b).a());
   public static final ku<baf> G = a("glider", $$0 -> $$0.a(baf.b).a(baf.c));
   public static final ku<aku> H = a("tooltip_style", $$0 -> $$0.a(aku.a).a(aku.b).a());
   public static final ku<czr> I = a("death_protection", $$0 -> $$0.a(czr.a).a(czr.b).a());
   public static final ku<ddx> J = a("stored_enchantments", $$0 -> $$0.a(ddx.b).a(ddx.c).a());
   public static final ku<czt> K = a("dyed_color", $$0 -> $$0.a(czt.a).a(czt.b));
   public static final ku<dab> L = a("map_color", $$0 -> $$0.a(dab.a).a(dab.b));
   public static final ku<evo> M = a("map_id", $$0 -> $$0.a(evo.a).a(evo.b));
   public static final ku<daa> N = a("map_decorations", $$0 -> $$0.a(daa.b).a());
   public static final ku<dac> O = a("map_post_processing", $$0 -> $$0.a(dac.d));
   public static final ku<czk> P = a("charged_projectiles", $$0 -> $$0.a(czk.b).a(czk.c).a());
   public static final ku<czj> Q = a("bundle_contents", $$0 -> $$0.a(czj.b).a(czj.c).a());
   public static final ku<cze> R = a("potion_contents", $$0 -> $$0.a(cze.c).a(cze.d).a());
   public static final ku<Float> S = a("potion_duration_scale", $$0 -> $$0.a(ayi.n).a(yl.l).a());
   public static final ku<dag> T = a("suspicious_stew_effects", $$0 -> $$0.a(dag.c).a(dag.d).a());
   public static final ku<dan> U = a("writable_book_content", $$0 -> $$0.a(dan.e).a(dan.f).a());
   public static final ku<dao> V = a("written_book_content", $$0 -> $$0.a(dao.i).a(dao.j).a());
   public static final ku<dfo> W = a("trim", $$0 -> $$0.a(dfo.a).a(dfo.b).a());
   public static final ku<czs> X = a("debug_stick_state", $$0 -> $$0.a(czs.b).a());
   public static final ku<czo> Y = a("entity_data", $$0 -> $$0.a(czo.c).a(czo.d));
   public static final ku<czo> Z = a("bucket_entity_data", $$0 -> $$0.a(czo.b).a(czo.d));
   public static final ku<czo> aa = a("block_entity_data", $$0 -> $$0.a(czo.c).a(czo.d));
   public static final ku<jr<cxa>> ab = a("instrument", $$0 -> $$0.a(cxa.c).a(cxa.d).a());
   public static final ku<dad> ac = a("ominous_bottle_amplifier", $$0 -> $$0.a(dad.d).a(dad.e));
   public static final ku<cxm> ad = a("jukebox_playable", $$0 -> $$0.a(cxm.a).a(cxm.b));
   public static final ku<List<akt<dbv<?>>>> ae = a("recipes", $$0 -> $$0.a(akt.a(mc.bm).listOf()).a());
   public static final ku<czz> af = a("lodestone_tracker", $$0 -> $$0.a(czz.a).a(czz.b).a());
   public static final ku<czu> ag = a("firework_explosion", $$0 -> $$0.a(czu.c).a(czu.d).a());
   public static final ku<czv> ah = a("fireworks", $$0 -> $$0.a(czv.b).a(czv.c).a());
   public static final ku<dae> ai = a("profile", $$0 -> $$0.a(dae.a).a(dae.b).a());
   public static final ku<aku> aj = a("note_block_sound", $$0 -> $$0.a(aku.a).a(aku.b));
   public static final ku<duj> ak = a("banner_patterns", $$0 -> $$0.a(duj.b).a(duj.c).a());
   public static final ku<cwe> al = a("base_color", $$0 -> $$0.a(cwe.q).a(cwe.r));
   public static final ku<dvz> am = a("pot_decorations", $$0 -> $$0.a(dvz.b).a(dvz.c).a());
   public static final ku<czx> an = a("container", $$0 -> $$0.a(czx.b).a(czx.c).a());
   public static final ku<czh> ao = a("block_state", $$0 -> $$0.a(czh.b).a(czh.c).a());
   public static final ku<List<dup.c>> ap = a("bees", $$0 -> $$0.a(dup.c.b).a(dup.c.c.a(yl.a())).a());
   public static final ku<bsz> aq = a("lock", $$0 -> $$0.a(bsz.b));
   public static final ku<daf> ar = a("container_loot", $$0 -> $$0.a(daf.a));
   public static final kr as = kr.a().a(c, 64).a(j, czy.a).a(l, ddx.a).a(s, 0).a(o, czw.a).a(k, cyd.a).a();

   public static ku<?> a(ke<ku<?>> $$0) {
      return b;
   }

   private static <T> ku<T> a(String $$0, UnaryOperator<ku.a<T>> $$1) {
      return ke.a(mb.ao, $$0, $$1.apply(ku.a()).b());
   }
}
