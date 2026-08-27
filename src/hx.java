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

public class hx {
   private static final Map<Class<?>, hw<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends hw.a<A>> hw<A, T> a(ji<hw<?, ?>> $$0, String $$1, Class<? extends A> $$2, hw<A, T> $$3) {
      a.put($$2, $$3);
      return ji.a($$0, $$1, $$3);
   }

   public static hw<?, ?> a(ji<hw<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, hz.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new ic());
      a($$0, "brigadier:double", DoubleArgumentType.class, new ib());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new id());
      a($$0, "brigadier:long", LongArgumentType.class, new ie());
      a($$0, "brigadier:string", StringArgumentType.class, new ig());
      a($$0, "entity", ep.class, new ep.a());
      a($$0, "game_profile", er.class, hz.a(er::a));
      a($$0, "block_pos", fx.class, hz.a(fx::a));
      a($$0, "column_pos", fy.class, hz.a(fy::a));
      a($$0, "vec3", ge.class, hz.a(ge::a));
      a($$0, "vec2", gd.class, hz.a(gd::a));
      a($$0, "block_state", fu.class, hz.a(fu::a));
      a($$0, "block_predicate", ft.class, hz.a(ft::a));
      a($$0, "item_stack", gj.class, hz.a(gj::a));
      a($$0, "item_predicate", gm.class, hz.a(gm::a));
      a($$0, "color", ek.class, hz.a(ek::a));
      a($$0, "component", el.class, hz.a(el::a));
      a($$0, "style", fm.class, hz.a(fm::a));
      a($$0, "message", et.class, hz.a(et::a));
      a($$0, "nbt_compound_tag", em.class, hz.a(em::a));
      a($$0, "nbt_tag", ev.class, hz.a(ev::a));
      a($$0, "nbt_path", eu.class, hz.a(eu::a));
      a($$0, "objective", ew.class, hz.a(ew::a));
      a($$0, "objective_criteria", ex.class, hz.a(ex::a));
      a($$0, "operation", ey.class, hz.a(ey::a));
      a($$0, "particle", ez.class, hz.a(ez::a));
      a($$0, "angle", ei.class, hz.a(ei::a));
      a($$0, "rotation", gb.class, hz.a(gb::a));
      a($$0, "scoreboard_slot", fh.class, hz.a(fh::a));
      a($$0, "score_holder", fg.class, new fg.a());
      a($$0, "swizzle", gc.class, hz.a(gc::a));
      a($$0, "team", fn.class, hz.a(fn::a));
      a($$0, "item_slot", fj.class, hz.a(fj::a));
      a($$0, "item_slots", fk.class, hz.a(fk::a));
      a($$0, "resource_location", fd.class, hz.a(fd::a));
      a($$0, "function", gi.class, hz.a(gi::a));
      a($$0, "entity_anchor", eo.class, hz.a(eo::a));
      a($$0, "int_range", fa.b.class, hz.a(fa::a));
      a($$0, "float_range", fa.a.class, hz.a(fa::b));
      a($$0, "dimension", en.class, hz.a(en::a));
      a($$0, "gamemode", eq.class, hz.a(eq::a));
      a($$0, "time", fq.class, new fq.a());
      a($$0, "resource_or_tag", b(fe.class), new fe.a());
      a($$0, "resource_or_tag_key", b(ff.class), new ff.a());
      a($$0, "resource", b(fb.class), new fb.a());
      a($$0, "resource_key", b(fc.class), new fc.a());
      a($$0, "template_mirror", fo.class, hz.a(fo::a));
      a($$0, "template_rotation", fp.class, hz.a(fp::a));
      a($$0, "heightmap", es.class, hz.a(es::a));
      if (aa.aX) {
         a($$0, "test_argument", tp.class, hz.a(tp::a));
         a($$0, "test_class", tl.class, hz.a(tl::a));
      }

      return a($$0, "uuid", fr.class, hz.a(fr::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> hw<A, ?> a(A $$0) {
      hw<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (hw<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> hw.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
