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

public class hg {
   private static final Map<Class<?>, hf<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends hf.a<A>> hf<A, T> a(io<hf<?, ?>> $$0, String $$1, Class<? extends A> $$2, hf<A, T> $$3) {
      a.put($$2, $$3);
      return io.a($$0, $$1, $$3);
   }

   public static hf<?, ?> a(io<hf<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, hi.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new hl());
      a($$0, "brigadier:double", DoubleArgumentType.class, new hk());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new hm());
      a($$0, "brigadier:long", LongArgumentType.class, new hn());
      a($$0, "brigadier:string", StringArgumentType.class, new ho());
      a($$0, "entity", eg.class, new eg.a());
      a($$0, "game_profile", ei.class, hi.a(ei::a));
      a($$0, "block_pos", fm.class, hi.a(fm::a));
      a($$0, "column_pos", fn.class, hi.a(fn::a));
      a($$0, "vec3", ft.class, hi.a(ft::a));
      a($$0, "vec2", fs.class, hi.a(fs::a));
      a($$0, "block_state", fj.class, hi.a(fj::a));
      a($$0, "block_predicate", fi.class, hi.a(fi::a));
      a($$0, "item_stack", fy.class, hi.a(fy::a));
      a($$0, "item_predicate", gb.class, hi.a(gb::a));
      a($$0, "color", eb.class, hi.a(eb::a));
      a($$0, "component", ec.class, hi.a(ec::a));
      a($$0, "message", ek.class, hi.a(ek::a));
      a($$0, "nbt_compound_tag", ed.class, hi.a(ed::a));
      a($$0, "nbt_tag", em.class, hi.a(em::a));
      a($$0, "nbt_path", el.class, hi.a(el::a));
      a($$0, "objective", en.class, hi.a(en::a));
      a($$0, "objective_criteria", eo.class, hi.a(eo::a));
      a($$0, "operation", ep.class, hi.a(ep::a));
      a($$0, "particle", eq.class, hi.a(eq::a));
      a($$0, "angle", dz.class, hi.a(dz::a));
      a($$0, "rotation", fq.class, hi.a(fq::a));
      a($$0, "scoreboard_slot", ey.class, hi.a(ey::a));
      a($$0, "score_holder", ex.class, new ex.a());
      a($$0, "swizzle", fr.class, hi.a(fr::a));
      a($$0, "team", fc.class, hi.a(fc::a));
      a($$0, "item_slot", fa.class, hi.a(fa::a));
      a($$0, "resource_location", eu.class, hi.a(eu::a));
      a($$0, "function", fx.class, hi.a(fx::a));
      a($$0, "entity_anchor", ef.class, hi.a(ef::a));
      a($$0, "int_range", er.b.class, hi.a(er::a));
      a($$0, "float_range", er.a.class, hi.a(er::b));
      a($$0, "dimension", ee.class, hi.a(ee::a));
      a($$0, "gamemode", eh.class, hi.a(eh::a));
      a($$0, "time", ff.class, new ff.a());
      a($$0, "resource_or_tag", b(ev.class), new ev.a());
      a($$0, "resource_or_tag_key", b(ew.class), new ew.a());
      a($$0, "resource", b(es.class), new es.a());
      a($$0, "resource_key", b(et.class), new et.a());
      a($$0, "template_mirror", fd.class, hi.a(fd::a));
      a($$0, "template_rotation", fe.class, hi.a(fe::a));
      a($$0, "heightmap", ej.class, hi.a(ej::a));
      if (aa.aT) {
         a($$0, "test_argument", rr.class, hi.a(rr::a));
         a($$0, "test_class", ro.class, hi.a(ro::a));
      }

      return a($$0, "uuid", fg.class, hi.a(fg::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> hf<A, ?> a(A $$0) {
      hf<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (hf<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> hf.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
