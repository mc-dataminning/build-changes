import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class jp {
   public static final jo<ctt> a = a("custom_data", $$0 -> $$0.a(ctt.b));
   public static final jo<Integer> b = a("damage", $$0 -> $$0.a(aws.i).a(yc.f));
   public static final jo<cuk> c = a("unbreakable", $$0 -> $$0.a(cuk.a).a(cuk.b));
   public static final jo<wg> d = a("custom_name", $$0 -> $$0.a(wi.g).a(wi.b));
   public static final jo<cub> e = a("lore", $$0 -> $$0.a(cub.b).a(cub.c));
   public static final jo<cwx> f = a("enchantments", $$0 -> $$0.a(cwx.b).a(cwx.c));
   public static final jo<cov> g = a("can_place_on", $$0 -> $$0.a(cov.a).a(cov.b));
   public static final jo<cov> h = a("can_break", $$0 -> $$0.a(cov.a).a(cov.b));
   public static final jo<ctz> i = a("attribute_modifiers", $$0 -> $$0.a(ctz.b).a(ctz.c));
   public static final jo<ctu> j = a("custom_model_data", $$0 -> $$0.a(ctu.b).a(ctu.c));
   public static final jo<aym> k = a("hide_additional_tooltip", $$0 -> $$0.a(Codec.unit(aym.a)).a(ye.a(aym.a)));
   public static final jo<Integer> l = a("repair_cost", $$0 -> $$0.a(aws.i).a(yc.f));
   public static final jo<aym> m = a("creative_slot_lock", $$0 -> $$0.a(ye.a(aym.a)));
   public static final jo<Boolean> n = a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(yc.b));
   public static final jo<aym> o = a("intangible_projectile", $$0 -> $$0.a(Codec.unit(aym.a)));
   public static final jo<cwx> p = a("stored_enchantments", $$0 -> $$0.a(cwx.b).a(cwx.c));
   public static final jo<ctw> q = a("dyed_color", $$0 -> $$0.a(ctw.a).a(ctw.b));
   public static final jo<cue> r = a("map_color", $$0 -> $$0.a(cue.a).a(cue.b));
   public static final jo<emd> s = a("map_id", $$0 -> $$0.a(emd.a).a(emd.b));
   public static final jo<cud> t = a("map_decorations", $$0 -> $$0.a(cud.b));
   public static final jo<cuf> u = a("map_post_processing", $$0 -> $$0.a(cuf.d));
   public static final jo<cts> v = a("charged_projectiles", $$0 -> $$0.a(cts.b).a(cts.c));
   public static final jo<ctr> w = a("bundle_contents", $$0 -> $$0.a(ctr.c).a(ctr.d));
   public static final jo<cth> x = a("potion_contents", $$0 -> $$0.a(cth.b).a(cth.c));
   public static final jo<cui> y = a("suspicious_stew_effects", $$0 -> $$0.a(cui.b).a(cui.c));
   public static final jo<cul> z = a("writable_book_content", $$0 -> $$0.a(cul.c).a(cul.d));
   public static final jo<cum> A = a("written_book_content", $$0 -> $$0.a(cum.g).a(cum.h));
   public static final jo<ctk> B = a("trim", $$0 -> $$0.a(ctk.a).a(ctk.b));
   public static final jo<ctv> C = a("debug_stick_state", $$0 -> $$0.a(ctv.b));
   public static final jo<ctt> D = a("entity_data", $$0 -> $$0.a(ctt.c).a(ctt.d));
   public static final jo<ctt> E = a("bucket_entity_data", $$0 -> $$0.a(ctt.b).a(ctt.d));
   public static final jo<ctt> F = a("block_entity_data", $$0 -> $$0.a(ctt.c).a(ctt.d));
   public static final jo<il<crb>> G = a("instrument", $$0 -> $$0.a(crb.c).a(crb.d));
   public static final jo<List<ajt>> H = a("recipes", $$0 -> $$0.a(ajt.a.listOf()));
   public static final jo<cuc> I = a("lodestone_target", $$0 -> $$0.a(cuc.a).a(cuc.b));
   public static final jo<ctx> J = a("firework_explosion", $$0 -> $$0.a(ctx.b).a(ctx.c));
   public static final jo<cty> K = a("fireworks", $$0 -> $$0.a(cty.a).a(cty.b));
   public static final jo<cug> L = a("profile", $$0 -> $$0.a(cug.a).a(cug.b));
   public static final jo<ajt> M = a("note_block_sound", $$0 -> $$0.a(ajt.a).a(ajt.b));
   public static final jo<dlw> N = a("banner_patterns", $$0 -> $$0.a(dlw.b).a(dlw.c));
   public static final jo<cqc> O = a("base_color", $$0 -> $$0.a(cqc.q).a(cqc.r));
   public static final jo<dnj> P = a("pot_decorations", $$0 -> $$0.a(dnj.b).a(dnj.c));
   public static final jo<cua> Q = a("container", $$0 -> $$0.a(cua.b).a(cua.c));
   public static final jo<ctq> R = a("block_state", $$0 -> $$0.a(ctq.b).a(ctq.c));
   public static final jo<List<dmc.c>> S = a("bees", $$0 -> $$0.a(dmc.c.b).a(dmc.c.c.a(yc.a())));
   public static final jo<bod> T = a("lock", $$0 -> $$0.a(bod.b));
   public static final jo<cuh> U = a("container_loot", $$0 -> $$0.a(cuh.a));
   public static final jl V = jl.a().a(e, cub.a).a(f, cwx.a).a(l, 0).a(i, ctz.a).a();

   public static jo<?> a(iy<jo<?>> $$0) {
      return a;
   }

   private static <T> jo<T> a(String $$0, UnaryOperator<jo.a<T>> $$1) {
      return iy.a(kr.at, $$0, $$1.apply(jo.a()).a());
   }
}
