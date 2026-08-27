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

public class hk {
   private static final Map<Class<?>, hj<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends hj.a<A>> hj<A, T> a(is<hj<?, ?>> $$0, String $$1, Class<? extends A> $$2, hj<A, T> $$3) {
      a.put($$2, $$3);
      return is.a($$0, $$1, $$3);
   }

   public static hj<?, ?> a(is<hj<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, hm.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new hp());
      a($$0, "brigadier:double", DoubleArgumentType.class, new ho());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new hq());
      a($$0, "brigadier:long", LongArgumentType.class, new hr());
      a($$0, "brigadier:string", StringArgumentType.class, new hs());
      a($$0, "entity", eg.class, new eg.a());
      a($$0, "game_profile", ei.class, hm.a(ei::a));
      a($$0, "block_pos", fm.class, hm.a(fm::a));
      a($$0, "column_pos", fn.class, hm.a(fn::a));
      a($$0, "vec3", ft.class, hm.a(ft::a));
      a($$0, "vec2", fs.class, hm.a(fs::a));
      a($$0, "block_state", fj.class, hm.a(fj::a));
      a($$0, "block_predicate", fi.class, hm.a(fi::a));
      a($$0, "item_stack", fy.class, hm.a(fy::a));
      a($$0, "item_predicate", gb.class, hm.a(gb::a));
      a($$0, "color", eb.class, hm.a(eb::a));
      a($$0, "component", ec.class, hm.a(ec::a));
      a($$0, "message", ek.class, hm.a(ek::a));
      a($$0, "nbt_compound_tag", ed.class, hm.a(ed::a));
      a($$0, "nbt_tag", em.class, hm.a(em::a));
      a($$0, "nbt_path", el.class, hm.a(el::a));
      a($$0, "objective", en.class, hm.a(en::a));
      a($$0, "objective_criteria", eo.class, hm.a(eo::a));
      a($$0, "operation", ep.class, hm.a(ep::a));
      a($$0, "particle", eq.class, hm.a(eq::a));
      a($$0, "angle", dz.class, hm.a(dz::a));
      a($$0, "rotation", fq.class, hm.a(fq::a));
      a($$0, "scoreboard_slot", ey.class, hm.a(ey::a));
      a($$0, "score_holder", ex.class, new ex.a());
      a($$0, "swizzle", fr.class, hm.a(fr::a));
      a($$0, "team", fc.class, hm.a(fc::a));
      a($$0, "item_slot", fa.class, hm.a(fa::a));
      a($$0, "resource_location", eu.class, hm.a(eu::a));
      a($$0, "function", fx.class, hm.a(fx::a));
      a($$0, "entity_anchor", ef.class, hm.a(ef::a));
      a($$0, "int_range", er.b.class, hm.a(er::a));
      a($$0, "float_range", er.a.class, hm.a(er::b));
      a($$0, "dimension", ee.class, hm.a(ee::a));
      a($$0, "gamemode", eh.class, hm.a(eh::a));
      a($$0, "time", ff.class, new ff.a());
      a($$0, "resource_or_tag", b(ev.class), new ev.a());
      a($$0, "resource_or_tag_key", b(ew.class), new ew.a());
      a($$0, "resource", b(es.class), new es.a());
      a($$0, "resource_key", b(et.class), new et.a());
      a($$0, "template_mirror", fd.class, hm.a(fd::a));
      a($$0, "template_rotation", fe.class, hm.a(fe::a));
      a($$0, "heightmap", ej.class, hm.a(ej::a));
      if (aa.aT) {
         a($$0, "test_argument", rv.class, hm.a(rv::a));
         a($$0, "test_class", rs.class, hm.a(rs::a));
      }

      return a($$0, "uuid", fg.class, hm.a(fg::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> hj<A, ?> a(A $$0) {
      hj<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (hj<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> hj.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
