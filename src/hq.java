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

public class hq {
   private static final Map<Class<?>, hp<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends hp.a<A>> hp<A, T> a(ja<hp<?, ?>> $$0, String $$1, Class<? extends A> $$2, hp<A, T> $$3) {
      a.put($$2, $$3);
      return ja.a($$0, $$1, $$3);
   }

   public static hp<?, ?> a(ja<hp<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, hs.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new hv());
      a($$0, "brigadier:double", DoubleArgumentType.class, new hu());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new hw());
      a($$0, "brigadier:long", LongArgumentType.class, new hx());
      a($$0, "brigadier:string", StringArgumentType.class, new hy());
      a($$0, "entity", ei.class, new ei.a());
      a($$0, "game_profile", ek.class, hs.a(ek::a));
      a($$0, "block_pos", fq.class, hs.a(fq::a));
      a($$0, "column_pos", fr.class, hs.a(fr::a));
      a($$0, "vec3", fx.class, hs.a(fx::a));
      a($$0, "vec2", fw.class, hs.a(fw::a));
      a($$0, "block_state", fn.class, hs.a(fn::a));
      a($$0, "block_predicate", fm.class, hs.a(fm::a));
      a($$0, "item_stack", gc.class, hs.a(gc::a));
      a($$0, "item_predicate", gf.class, hs.a(gf::a));
      a($$0, "color", ed.class, hs.a(ed::a));
      a($$0, "component", ee.class, hs.a(ee::a));
      a($$0, "style", ff.class, hs.a(ff::a));
      a($$0, "message", em.class, hs.a(em::a));
      a($$0, "nbt_compound_tag", ef.class, hs.a(ef::a));
      a($$0, "nbt_tag", eo.class, hs.a(eo::a));
      a($$0, "nbt_path", en.class, hs.a(en::a));
      a($$0, "objective", ep.class, hs.a(ep::a));
      a($$0, "objective_criteria", eq.class, hs.a(eq::a));
      a($$0, "operation", er.class, hs.a(er::a));
      a($$0, "particle", es.class, hs.a(es::a));
      a($$0, "angle", eb.class, hs.a(eb::a));
      a($$0, "rotation", fu.class, hs.a(fu::a));
      a($$0, "scoreboard_slot", fa.class, hs.a(fa::a));
      a($$0, "score_holder", ez.class, new ez.a());
      a($$0, "swizzle", fv.class, hs.a(fv::a));
      a($$0, "team", fg.class, hs.a(fg::a));
      a($$0, "item_slot", fc.class, hs.a(fc::a));
      a($$0, "item_slots", fd.class, hs.a(fd::a));
      a($$0, "resource_location", ew.class, hs.a(ew::a));
      a($$0, "function", gb.class, hs.a(gb::a));
      a($$0, "entity_anchor", eh.class, hs.a(eh::a));
      a($$0, "int_range", et.b.class, hs.a(et::a));
      a($$0, "float_range", et.a.class, hs.a(et::b));
      a($$0, "dimension", eg.class, hs.a(eg::a));
      a($$0, "gamemode", ej.class, hs.a(ej::a));
      a($$0, "time", fj.class, new fj.a());
      a($$0, "resource_or_tag", b(ex.class), new ex.a());
      a($$0, "resource_or_tag_key", b(ey.class), new ey.a());
      a($$0, "resource", b(eu.class), new eu.a());
      a($$0, "resource_key", b(ev.class), new ev.a());
      a($$0, "template_mirror", fh.class, hs.a(fh::a));
      a($$0, "template_rotation", fi.class, hs.a(fi::a));
      a($$0, "heightmap", el.class, hs.a(el::a));
      if (aa.aW) {
         a($$0, "test_argument", tf.class, hs.a(tf::a));
         a($$0, "test_class", tb.class, hs.a(tb::a));
      }

      return a($$0, "uuid", fk.class, hs.a(fk::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> hp<A, ?> a(A $$0) {
      hp<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (hp<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> hp.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
