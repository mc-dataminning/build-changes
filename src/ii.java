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

public class ii {
   private static final Map<Class<?>, ih<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends ih.a<A>> ih<A, T> a(jt<ih<?, ?>> $$0, String $$1, Class<? extends A> $$2, ih<A, T> $$3) {
      a.put($$2, $$3);
      return jt.a($$0, $$1, $$3);
   }

   public static ih<?, ?> a(jt<ih<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, ik.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new in());
      a($$0, "brigadier:double", DoubleArgumentType.class, new im());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new io());
      a($$0, "brigadier:long", LongArgumentType.class, new ip());
      a($$0, "brigadier:string", StringArgumentType.class, new iq());
      a($$0, "entity", ex.class, new ex.a());
      a($$0, "game_profile", ez.class, ik.a(ez::a));
      a($$0, "block_pos", gh.class, ik.a(gh::a));
      a($$0, "column_pos", gi.class, ik.a(gi::a));
      a($$0, "vec3", go.class, ik.a(go::a));
      a($$0, "vec2", gn.class, ik.a(gn::a));
      a($$0, "block_state", ge.class, ik.a(ge::a));
      a($$0, "block_predicate", gd.class, ik.a(gd::a));
      a($$0, "item_stack", gu.class, ik.a(gu::a));
      a($$0, "item_predicate", gx.class, ik.a(gx::a));
      a($$0, "color", es.class, ik.a(es::a));
      a($$0, "component", et.class, ik.a(et::a));
      a($$0, "style", fw.class, ik.a(fw::a));
      a($$0, "message", fb.class, ik.a(fb::a));
      a($$0, "nbt_compound_tag", eu.class, ik.a(eu::a));
      a($$0, "nbt_tag", fd.class, ik.a(fd::a));
      a($$0, "nbt_path", fc.class, ik.a(fc::a));
      a($$0, "objective", fe.class, ik.a(fe::a));
      a($$0, "objective_criteria", ff.class, ik.a(ff::a));
      a($$0, "operation", fg.class, ik.a(fg::a));
      a($$0, "particle", fh.class, ik.a(fh::a));
      a($$0, "angle", eq.class, ik.a(eq::a));
      a($$0, "rotation", gl.class, ik.a(gl::a));
      a($$0, "scoreboard_slot", fr.class, ik.a(fr::a));
      a($$0, "score_holder", fq.class, new fq.a());
      a($$0, "swizzle", gm.class, ik.a(gm::a));
      a($$0, "team", fx.class, ik.a(fx::a));
      a($$0, "item_slot", ft.class, ik.a(ft::a));
      a($$0, "item_slots", fu.class, ik.a(fu::a));
      a($$0, "resource_location", fl.class, ik.a(fl::a));
      a($$0, "function", gt.class, ik.a(gt::a));
      a($$0, "entity_anchor", ew.class, ik.a(ew::a));
      a($$0, "int_range", fi.b.class, ik.a(fi::a));
      a($$0, "float_range", fi.a.class, ik.a(fi::b));
      a($$0, "dimension", ev.class, ik.a(ev::a));
      a($$0, "gamemode", ey.class, ik.a(ey::a));
      a($$0, "time", ga.class, new ga.a());
      a($$0, "resource_or_tag", b(fn.class), new fn.a());
      a($$0, "resource_or_tag_key", b(fo.class), new fo.a());
      a($$0, "resource", b(fj.class), new fj.a());
      a($$0, "resource_key", b(fk.class), new fk.a());
      a($$0, "resource_selector", b(fp.class), new fp.a());
      a($$0, "template_mirror", fy.class, ik.a(fy::a));
      a($$0, "template_rotation", fz.class, ik.a(fz::a));
      a($$0, "heightmap", fa.class, ik.a(fa::a));
      a($$0, "loot_table", fm.c.class, ik.a(fm::a));
      a($$0, "loot_predicate", fm.b.class, ik.a(fm::c));
      a($$0, "loot_modifier", fm.a.class, ik.a(fm::b));
      return a($$0, "uuid", gb.class, ik.a(gb::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> ih<A, ?> a(A $$0) {
      ih<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (ih<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> ih.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
