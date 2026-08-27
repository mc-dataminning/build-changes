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

   private static <A extends ArgumentType<?>, T extends hj.a<A>> hj<A, T> a(it<hj<?, ?>> $$0, String $$1, Class<? extends A> $$2, hj<A, T> $$3) {
      a.put($$2, $$3);
      return it.a($$0, $$1, $$3);
   }

   public static hj<?, ?> a(it<hj<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, hm.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new hp());
      a($$0, "brigadier:double", DoubleArgumentType.class, new ho());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new hq());
      a($$0, "brigadier:long", LongArgumentType.class, new hr());
      a($$0, "brigadier:string", StringArgumentType.class, new hs());
      a($$0, "entity", ef.class, new ef.a());
      a($$0, "game_profile", eh.class, hm.a(eh::a));
      a($$0, "block_pos", fm.class, hm.a(fm::a));
      a($$0, "column_pos", fn.class, hm.a(fn::a));
      a($$0, "vec3", ft.class, hm.a(ft::a));
      a($$0, "vec2", fs.class, hm.a(fs::a));
      a($$0, "block_state", fj.class, hm.a(fj::a));
      a($$0, "block_predicate", fi.class, hm.a(fi::a));
      a($$0, "item_stack", fy.class, hm.a(fy::a));
      a($$0, "item_predicate", gb.class, hm.a(gb::a));
      a($$0, "color", ea.class, hm.a(ea::a));
      a($$0, "component", eb.class, hm.a(eb::a));
      a($$0, "style", fb.class, hm.a(fb::a));
      a($$0, "message", ej.class, hm.a(ej::a));
      a($$0, "nbt_compound_tag", ec.class, hm.a(ec::a));
      a($$0, "nbt_tag", el.class, hm.a(el::a));
      a($$0, "nbt_path", ek.class, hm.a(ek::a));
      a($$0, "objective", em.class, hm.a(em::a));
      a($$0, "objective_criteria", en.class, hm.a(en::a));
      a($$0, "operation", eo.class, hm.a(eo::a));
      a($$0, "particle", ep.class, hm.a(ep::a));
      a($$0, "angle", dy.class, hm.a(dy::a));
      a($$0, "rotation", fq.class, hm.a(fq::a));
      a($$0, "scoreboard_slot", ex.class, hm.a(ex::a));
      a($$0, "score_holder", ew.class, new ew.a());
      a($$0, "swizzle", fr.class, hm.a(fr::a));
      a($$0, "team", fc.class, hm.a(fc::a));
      a($$0, "item_slot", ez.class, hm.a(ez::a));
      a($$0, "resource_location", et.class, hm.a(et::a));
      a($$0, "function", fx.class, hm.a(fx::a));
      a($$0, "entity_anchor", ee.class, hm.a(ee::a));
      a($$0, "int_range", eq.b.class, hm.a(eq::a));
      a($$0, "float_range", eq.a.class, hm.a(eq::b));
      a($$0, "dimension", ed.class, hm.a(ed::a));
      a($$0, "gamemode", eg.class, hm.a(eg::a));
      a($$0, "time", ff.class, new ff.a());
      a($$0, "resource_or_tag", b(eu.class), new eu.a());
      a($$0, "resource_or_tag_key", b(ev.class), new ev.a());
      a($$0, "resource", b(er.class), new er.a());
      a($$0, "resource_key", b(es.class), new es.a());
      a($$0, "template_mirror", fd.class, hm.a(fd::a));
      a($$0, "template_rotation", fe.class, hm.a(fe::a));
      a($$0, "heightmap", ei.class, hm.a(ei::a));
      if (aa.aW) {
         a($$0, "test_argument", sf.class, hm.a(sf::a));
         a($$0, "test_class", sc.class, hm.a(sc::a));
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
