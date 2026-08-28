import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Locale;
import java.util.Map;

public class iq {
   private static final Map<Class<?>, ip<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends ip.a<A>> ip<A, T> a(ka<ip<?, ?>> $$0, String $$1, Class<? extends A> $$2, ip<A, T> $$3) {
      a.put($$2, $$3);
      return ka.a($$0, $$1, $$3);
   }

   public static ip<?, ?> a(ka<ip<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, is.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new iv());
      a($$0, "brigadier:double", DoubleArgumentType.class, new iu());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new iw());
      a($$0, "brigadier:long", LongArgumentType.class, new ix());
      a($$0, "brigadier:string", StringArgumentType.class, new iy());
      a($$0, "entity", fg.class, new fg.a());
      a($$0, "game_profile", fi.class, is.a(fi::a));
      a($$0, "block_pos", gp.class, is.a(gp::a));
      a($$0, "column_pos", gq.class, is.a(gq::a));
      a($$0, "vec3", gw.class, is.a(gw::a));
      a($$0, "vec2", gv.class, is.a(gv::a));
      a($$0, "block_state", gm.class, is.a(gm::a));
      a($$0, "block_predicate", gl.class, is.a(gl::a));
      a($$0, "item_stack", hc.class, is.a(hc::a));
      a($$0, "item_predicate", hf.class, is.a(hf::a));
      a($$0, "color", fb.class, is.a(fb::a));
      a($$0, "component", fc.class, is.a(fc::a));
      a($$0, "style", ge.class, is.a(ge::a));
      a($$0, "message", fk.class, is.a(fk::a));
      a($$0, "nbt_compound_tag", fd.class, is.a(fd::a));
      a($$0, "nbt_tag", fm.class, is.a(fm::a));
      a($$0, "nbt_path", fl.class, is.a(fl::a));
      a($$0, "objective", fn.class, is.a(fn::a));
      a($$0, "objective_criteria", fo.class, is.a(fo::a));
      a($$0, "operation", fp.class, is.a(fp::a));
      a($$0, "particle", fq.class, is.a(fq::a));
      a($$0, "angle", ez.class, is.a(ez::a));
      a($$0, "rotation", gt.class, is.a(gt::a));
      a($$0, "scoreboard_slot", fz.class, is.a(fz::a));
      a($$0, "score_holder", fy.class, new fy.a());
      a($$0, "swizzle", gu.class, is.a(gu::a));
      a($$0, "team", gf.class, is.a(gf::a));
      a($$0, "item_slot", gb.class, is.a(gb::a));
      a($$0, "item_slots", gc.class, is.a(gc::a));
      a($$0, "resource_location", fu.class, is.a(fu::a));
      a($$0, "function", hb.class, is.a(hb::a));
      a($$0, "entity_anchor", ff.class, is.a(ff::a));
      a($$0, "int_range", fr.b.class, is.a(fr::a));
      a($$0, "float_range", fr.a.class, is.a(fr::b));
      a($$0, "dimension", fe.class, is.a(fe::a));
      a($$0, "gamemode", fh.class, is.a(fh::a));
      a($$0, "time", gi.class, new gi.a());
      a($$0, "resource_or_tag", b(fw.class), new fw.a());
      a($$0, "resource_or_tag_key", b(fx.class), new fx.a());
      a($$0, "resource", b(fs.class), new fs.a());
      a($$0, "resource_key", b(ft.class), new ft.a());
      a($$0, "template_mirror", gg.class, is.a(gg::a));
      a($$0, "template_rotation", gh.class, is.a(gh::a));
      a($$0, "heightmap", fj.class, is.a(fj::a));
      a($$0, "loot_table", fv.c.class, is.a(fv::a));
      a($$0, "loot_predicate", fv.b.class, is.a(fv::c));
      a($$0, "loot_modifier", fv.a.class, is.a(fv::b));
      if (ab.aW) {
         a($$0, "test_argument", tv.class, is.a(tv::a));
         a($$0, "test_class", tr.class, is.a(tr::a));
      }

      return a($$0, "uuid", gj.class, is.a(gj::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> ip<A, ?> a(A $$0) {
      ip<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (ip<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> ip.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
