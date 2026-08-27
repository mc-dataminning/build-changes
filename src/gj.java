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

public class gj {
   private static final Map<Class<?>, gi<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends gi.a<A>> gi<A, T> a(ht<gi<?, ?>> $$0, String $$1, Class<? extends A> $$2, gi<A, T> $$3) {
      a.put($$2, $$3);
      return ht.a($$0, $$1, $$3);
   }

   public static gi<?, ?> a(ht<gi<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, gl.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new go());
      a($$0, "brigadier:double", DoubleArgumentType.class, new gn());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new gp());
      a($$0, "brigadier:long", LongArgumentType.class, new gq());
      a($$0, "brigadier:string", StringArgumentType.class, new gr());
      a($$0, "entity", ee.class, new ee.a());
      a($$0, "game_profile", eg.class, gl.a(eg::a));
      a($$0, "block_pos", fk.class, gl.a(fk::a));
      a($$0, "column_pos", fl.class, gl.a(fl::a));
      a($$0, "vec3", fr.class, gl.a(fr::a));
      a($$0, "vec2", fq.class, gl.a(fq::a));
      a($$0, "block_state", fh.class, gl.a(fh::a));
      a($$0, "block_predicate", fg.class, gl.a(fg::a));
      a($$0, "item_stack", fw.class, gl.a(fw::a));
      a($$0, "item_predicate", fz.class, gl.a(fz::a));
      a($$0, "color", dz.class, gl.a(dz::a));
      a($$0, "component", ea.class, gl.a(ea::a));
      a($$0, "message", ei.class, gl.a(ei::a));
      a($$0, "nbt_compound_tag", eb.class, gl.a(eb::a));
      a($$0, "nbt_tag", ek.class, gl.a(ek::a));
      a($$0, "nbt_path", ej.class, gl.a(ej::a));
      a($$0, "objective", el.class, gl.a(el::a));
      a($$0, "objective_criteria", em.class, gl.a(em::a));
      a($$0, "operation", en.class, gl.a(en::a));
      a($$0, "particle", eo.class, gl.a(eo::a));
      a($$0, "angle", dx.class, gl.a(dx::a));
      a($$0, "rotation", fo.class, gl.a(fo::a));
      a($$0, "scoreboard_slot", ew.class, gl.a(ew::a));
      a($$0, "score_holder", ev.class, new ev.a());
      a($$0, "swizzle", fp.class, gl.a(fp::a));
      a($$0, "team", fa.class, gl.a(fa::a));
      a($$0, "item_slot", ey.class, gl.a(ey::a));
      a($$0, "resource_location", es.class, gl.a(es::a));
      a($$0, "function", fv.class, gl.a(fv::a));
      a($$0, "entity_anchor", ed.class, gl.a(ed::a));
      a($$0, "int_range", ep.b.class, gl.a(ep::a));
      a($$0, "float_range", ep.a.class, gl.a(ep::b));
      a($$0, "dimension", ec.class, gl.a(ec::a));
      a($$0, "gamemode", ef.class, gl.a(ef::a));
      a($$0, "time", fd.class, new fd.a());
      a($$0, "resource_or_tag", b(et.class), new et.a());
      a($$0, "resource_or_tag_key", b(eu.class), new eu.a());
      a($$0, "resource", b(eq.class), new eq.a());
      a($$0, "resource_key", b(er.class), new er.a());
      a($$0, "template_mirror", fb.class, gl.a(fb::a));
      a($$0, "template_rotation", fc.class, gl.a(fc::a));
      a($$0, "heightmap", eh.class, gl.a(eh::a));
      if (aa.aT) {
         a($$0, "test_argument", qp.class, gl.a(qp::a));
         a($$0, "test_class", qm.class, gl.a(qm::a));
      }

      return a($$0, "uuid", fe.class, gl.a(fe::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> gi<A, ?> a(A $$0) {
      gi<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (gi<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> gi.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
