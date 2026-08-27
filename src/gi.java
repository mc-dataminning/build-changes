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

public class gi {
   private static final Map<Class<?>, gh<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends gh.a<A>> gh<A, T> a(hs<gh<?, ?>> $$0, String $$1, Class<? extends A> $$2, gh<A, T> $$3) {
      a.put($$2, $$3);
      return hs.a($$0, $$1, $$3);
   }

   public static gh<?, ?> a(hs<gh<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, gk.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new gn());
      a($$0, "brigadier:double", DoubleArgumentType.class, new gm());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new go());
      a($$0, "brigadier:long", LongArgumentType.class, new gp());
      a($$0, "brigadier:string", StringArgumentType.class, new gq());
      a($$0, "entity", ed.class, new ed.a());
      a($$0, "game_profile", ef.class, gk.a(ef::a));
      a($$0, "block_pos", fj.class, gk.a(fj::a));
      a($$0, "column_pos", fk.class, gk.a(fk::a));
      a($$0, "vec3", fq.class, gk.a(fq::a));
      a($$0, "vec2", fp.class, gk.a(fp::a));
      a($$0, "block_state", fg.class, gk.a(fg::a));
      a($$0, "block_predicate", ff.class, gk.a(ff::a));
      a($$0, "item_stack", fv.class, gk.a(fv::a));
      a($$0, "item_predicate", fy.class, gk.a(fy::a));
      a($$0, "color", dy.class, gk.a(dy::a));
      a($$0, "component", dz.class, gk.a(dz::a));
      a($$0, "message", eh.class, gk.a(eh::a));
      a($$0, "nbt_compound_tag", ea.class, gk.a(ea::a));
      a($$0, "nbt_tag", ej.class, gk.a(ej::a));
      a($$0, "nbt_path", ei.class, gk.a(ei::a));
      a($$0, "objective", ek.class, gk.a(ek::a));
      a($$0, "objective_criteria", el.class, gk.a(el::a));
      a($$0, "operation", em.class, gk.a(em::a));
      a($$0, "particle", en.class, gk.a(en::a));
      a($$0, "angle", dw.class, gk.a(dw::a));
      a($$0, "rotation", fn.class, gk.a(fn::a));
      a($$0, "scoreboard_slot", ev.class, gk.a(ev::a));
      a($$0, "score_holder", eu.class, new eu.a());
      a($$0, "swizzle", fo.class, gk.a(fo::a));
      a($$0, "team", ez.class, gk.a(ez::a));
      a($$0, "item_slot", ex.class, gk.a(ex::a));
      a($$0, "resource_location", er.class, gk.a(er::a));
      a($$0, "function", fu.class, gk.a(fu::a));
      a($$0, "entity_anchor", ec.class, gk.a(ec::a));
      a($$0, "int_range", eo.b.class, gk.a(eo::a));
      a($$0, "float_range", eo.a.class, gk.a(eo::b));
      a($$0, "dimension", eb.class, gk.a(eb::a));
      a($$0, "gamemode", ee.class, gk.a(ee::a));
      a($$0, "time", fc.class, new fc.a());
      a($$0, "resource_or_tag", b(es.class), new es.a());
      a($$0, "resource_or_tag_key", b(et.class), new et.a());
      a($$0, "resource", b(ep.class), new ep.a());
      a($$0, "resource_key", b(eq.class), new eq.a());
      a($$0, "template_mirror", fa.class, gk.a(fa::a));
      a($$0, "template_rotation", fb.class, gk.a(fb::a));
      a($$0, "heightmap", eg.class, gk.a(eg::a));
      if (aa.aS) {
         a($$0, "test_argument", qk.class, gk.a(qk::a));
         a($$0, "test_class", qh.class, gk.a(qh::a));
      }

      return a($$0, "uuid", fd.class, gk.a(fd::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> gh<A, ?> a(A $$0) {
      gh<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (gh<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> gh.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
