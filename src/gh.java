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

public class gh {
   private static final Map<Class<?>, gg<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends gg.a<A>> gg<A, T> a(hr<gg<?, ?>> $$0, String $$1, Class<? extends A> $$2, gg<A, T> $$3) {
      a.put($$2, $$3);
      return hr.a($$0, $$1, $$3);
   }

   public static gg<?, ?> a(hr<gg<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, gj.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new gm());
      a($$0, "brigadier:double", DoubleArgumentType.class, new gl());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new gn());
      a($$0, "brigadier:long", LongArgumentType.class, new go());
      a($$0, "brigadier:string", StringArgumentType.class, new gp());
      a($$0, "entity", ec.class, new ec.a());
      a($$0, "game_profile", ee.class, gj.a(ee::a));
      a($$0, "block_pos", fi.class, gj.a(fi::a));
      a($$0, "column_pos", fj.class, gj.a(fj::a));
      a($$0, "vec3", fp.class, gj.a(fp::a));
      a($$0, "vec2", fo.class, gj.a(fo::a));
      a($$0, "block_state", ff.class, gj.a(ff::a));
      a($$0, "block_predicate", fe.class, gj.a(fe::a));
      a($$0, "item_stack", fu.class, gj.a(fu::a));
      a($$0, "item_predicate", fx.class, gj.a(fx::a));
      a($$0, "color", dx.class, gj.a(dx::a));
      a($$0, "component", dy.class, gj.a(dy::a));
      a($$0, "message", eg.class, gj.a(eg::a));
      a($$0, "nbt_compound_tag", dz.class, gj.a(dz::a));
      a($$0, "nbt_tag", ei.class, gj.a(ei::a));
      a($$0, "nbt_path", eh.class, gj.a(eh::a));
      a($$0, "objective", ej.class, gj.a(ej::a));
      a($$0, "objective_criteria", ek.class, gj.a(ek::a));
      a($$0, "operation", el.class, gj.a(el::a));
      a($$0, "particle", em.class, gj.a(em::a));
      a($$0, "angle", dv.class, gj.a(dv::a));
      a($$0, "rotation", fm.class, gj.a(fm::a));
      a($$0, "scoreboard_slot", eu.class, gj.a(eu::a));
      a($$0, "score_holder", et.class, new et.a());
      a($$0, "swizzle", fn.class, gj.a(fn::a));
      a($$0, "team", ey.class, gj.a(ey::a));
      a($$0, "item_slot", ew.class, gj.a(ew::a));
      a($$0, "resource_location", eq.class, gj.a(eq::a));
      a($$0, "function", ft.class, gj.a(ft::a));
      a($$0, "entity_anchor", eb.class, gj.a(eb::a));
      a($$0, "int_range", en.b.class, gj.a(en::a));
      a($$0, "float_range", en.a.class, gj.a(en::b));
      a($$0, "dimension", ea.class, gj.a(ea::a));
      a($$0, "gamemode", ed.class, gj.a(ed::a));
      a($$0, "time", fb.class, new fb.a());
      a($$0, "resource_or_tag", b(er.class), new er.a());
      a($$0, "resource_or_tag_key", b(es.class), new es.a());
      a($$0, "resource", b(eo.class), new eo.a());
      a($$0, "resource_key", b(ep.class), new ep.a());
      a($$0, "template_mirror", ez.class, gj.a(ez::a));
      a($$0, "template_rotation", fa.class, gj.a(fa::a));
      a($$0, "heightmap", ef.class, gj.a(ef::a));
      if (aa.aS) {
         a($$0, "test_argument", qj.class, gj.a(qj::a));
         a($$0, "test_class", qg.class, gj.a(qg::a));
      }

      return a($$0, "uuid", fc.class, gj.a(fc::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> gg<A, ?> a(A $$0) {
      gg<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (gg<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> gg.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
