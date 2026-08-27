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

public class ho {
   private static final Map<Class<?>, hn<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends hn.a<A>> hn<A, T> a(ix<hn<?, ?>> $$0, String $$1, Class<? extends A> $$2, hn<A, T> $$3) {
      a.put($$2, $$3);
      return ix.a($$0, $$1, $$3);
   }

   public static hn<?, ?> a(ix<hn<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, hq.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new ht());
      a($$0, "brigadier:double", DoubleArgumentType.class, new hs());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new hu());
      a($$0, "brigadier:long", LongArgumentType.class, new hv());
      a($$0, "brigadier:string", StringArgumentType.class, new hw());
      a($$0, "entity", eh.class, new eh.a());
      a($$0, "game_profile", ej.class, hq.a(ej::a));
      a($$0, "block_pos", fo.class, hq.a(fo::a));
      a($$0, "column_pos", fp.class, hq.a(fp::a));
      a($$0, "vec3", fv.class, hq.a(fv::a));
      a($$0, "vec2", fu.class, hq.a(fu::a));
      a($$0, "block_state", fl.class, hq.a(fl::a));
      a($$0, "block_predicate", fk.class, hq.a(fk::a));
      a($$0, "item_stack", ga.class, hq.a(ga::a));
      a($$0, "item_predicate", gd.class, hq.a(gd::a));
      a($$0, "color", ec.class, hq.a(ec::a));
      a($$0, "component", ed.class, hq.a(ed::a));
      a($$0, "style", fd.class, hq.a(fd::a));
      a($$0, "message", el.class, hq.a(el::a));
      a($$0, "nbt_compound_tag", ee.class, hq.a(ee::a));
      a($$0, "nbt_tag", en.class, hq.a(en::a));
      a($$0, "nbt_path", em.class, hq.a(em::a));
      a($$0, "objective", eo.class, hq.a(eo::a));
      a($$0, "objective_criteria", ep.class, hq.a(ep::a));
      a($$0, "operation", eq.class, hq.a(eq::a));
      a($$0, "particle", er.class, hq.a(er::a));
      a($$0, "angle", ea.class, hq.a(ea::a));
      a($$0, "rotation", fs.class, hq.a(fs::a));
      a($$0, "scoreboard_slot", ez.class, hq.a(ez::a));
      a($$0, "score_holder", ey.class, new ey.a());
      a($$0, "swizzle", ft.class, hq.a(ft::a));
      a($$0, "team", fe.class, hq.a(fe::a));
      a($$0, "item_slot", fb.class, hq.a(fb::a));
      a($$0, "resource_location", ev.class, hq.a(ev::a));
      a($$0, "function", fz.class, hq.a(fz::a));
      a($$0, "entity_anchor", eg.class, hq.a(eg::a));
      a($$0, "int_range", es.b.class, hq.a(es::a));
      a($$0, "float_range", es.a.class, hq.a(es::b));
      a($$0, "dimension", ef.class, hq.a(ef::a));
      a($$0, "gamemode", ei.class, hq.a(ei::a));
      a($$0, "time", fh.class, new fh.a());
      a($$0, "resource_or_tag", b(ew.class), new ew.a());
      a($$0, "resource_or_tag_key", b(ex.class), new ex.a());
      a($$0, "resource", b(et.class), new et.a());
      a($$0, "resource_key", b(eu.class), new eu.a());
      a($$0, "template_mirror", ff.class, hq.a(ff::a));
      a($$0, "template_rotation", fg.class, hq.a(fg::a));
      a($$0, "heightmap", ek.class, hq.a(ek::a));
      if (aa.aV) {
         a($$0, "test_argument", sp.class, hq.a(sp::a));
         a($$0, "test_class", sl.class, hq.a(sl::a));
      }

      return a($$0, "uuid", fi.class, hq.a(fi::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> hn<A, ?> a(A $$0) {
      hn<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (hn<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> hn.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
