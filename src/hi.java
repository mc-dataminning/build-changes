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

public class hi {
   private static final Map<Class<?>, hh<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends hh.a<A>> hh<A, T> a(ir<hh<?, ?>> $$0, String $$1, Class<? extends A> $$2, hh<A, T> $$3) {
      a.put($$2, $$3);
      return ir.a($$0, $$1, $$3);
   }

   public static hh<?, ?> a(ir<hh<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, hk.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new hn());
      a($$0, "brigadier:double", DoubleArgumentType.class, new hm());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new ho());
      a($$0, "brigadier:long", LongArgumentType.class, new hp());
      a($$0, "brigadier:string", StringArgumentType.class, new hq());
      a($$0, "entity", ee.class, new ee.a());
      a($$0, "game_profile", eg.class, hk.a(eg::a));
      a($$0, "block_pos", fk.class, hk.a(fk::a));
      a($$0, "column_pos", fl.class, hk.a(fl::a));
      a($$0, "vec3", fr.class, hk.a(fr::a));
      a($$0, "vec2", fq.class, hk.a(fq::a));
      a($$0, "block_state", fh.class, hk.a(fh::a));
      a($$0, "block_predicate", fg.class, hk.a(fg::a));
      a($$0, "item_stack", fw.class, hk.a(fw::a));
      a($$0, "item_predicate", fz.class, hk.a(fz::a));
      a($$0, "color", dz.class, hk.a(dz::a));
      a($$0, "component", ea.class, hk.a(ea::a));
      a($$0, "message", ei.class, hk.a(ei::a));
      a($$0, "nbt_compound_tag", eb.class, hk.a(eb::a));
      a($$0, "nbt_tag", ek.class, hk.a(ek::a));
      a($$0, "nbt_path", ej.class, hk.a(ej::a));
      a($$0, "objective", el.class, hk.a(el::a));
      a($$0, "objective_criteria", em.class, hk.a(em::a));
      a($$0, "operation", en.class, hk.a(en::a));
      a($$0, "particle", eo.class, hk.a(eo::a));
      a($$0, "angle", dx.class, hk.a(dx::a));
      a($$0, "rotation", fo.class, hk.a(fo::a));
      a($$0, "scoreboard_slot", ew.class, hk.a(ew::a));
      a($$0, "score_holder", ev.class, new ev.a());
      a($$0, "swizzle", fp.class, hk.a(fp::a));
      a($$0, "team", fa.class, hk.a(fa::a));
      a($$0, "item_slot", ey.class, hk.a(ey::a));
      a($$0, "resource_location", es.class, hk.a(es::a));
      a($$0, "function", fv.class, hk.a(fv::a));
      a($$0, "entity_anchor", ed.class, hk.a(ed::a));
      a($$0, "int_range", ep.b.class, hk.a(ep::a));
      a($$0, "float_range", ep.a.class, hk.a(ep::b));
      a($$0, "dimension", ec.class, hk.a(ec::a));
      a($$0, "gamemode", ef.class, hk.a(ef::a));
      a($$0, "time", fd.class, new fd.a());
      a($$0, "resource_or_tag", b(et.class), new et.a());
      a($$0, "resource_or_tag_key", b(eu.class), new eu.a());
      a($$0, "resource", b(eq.class), new eq.a());
      a($$0, "resource_key", b(er.class), new er.a());
      a($$0, "template_mirror", fb.class, hk.a(fb::a));
      a($$0, "template_rotation", fc.class, hk.a(fc::a));
      a($$0, "heightmap", eh.class, hk.a(eh::a));
      if (aa.aW) {
         a($$0, "test_argument", sb.class, hk.a(sb::a));
         a($$0, "test_class", ry.class, hk.a(ry::a));
      }

      return a($$0, "uuid", fe.class, hk.a(fe::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> hh<A, ?> a(A $$0) {
      hh<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (hh<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> hh.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
