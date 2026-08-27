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

public class hm {
   private static final Map<Class<?>, hl<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends hl.a<A>> hl<A, T> a(iv<hl<?, ?>> $$0, String $$1, Class<? extends A> $$2, hl<A, T> $$3) {
      a.put($$2, $$3);
      return iv.a($$0, $$1, $$3);
   }

   public static hl<?, ?> a(iv<hl<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, ho.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new hr());
      a($$0, "brigadier:double", DoubleArgumentType.class, new hq());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new hs());
      a($$0, "brigadier:long", LongArgumentType.class, new ht());
      a($$0, "brigadier:string", StringArgumentType.class, new hu());
      a($$0, "entity", eh.class, new eh.a());
      a($$0, "game_profile", ej.class, ho.a(ej::a));
      a($$0, "block_pos", fo.class, ho.a(fo::a));
      a($$0, "column_pos", fp.class, ho.a(fp::a));
      a($$0, "vec3", fv.class, ho.a(fv::a));
      a($$0, "vec2", fu.class, ho.a(fu::a));
      a($$0, "block_state", fl.class, ho.a(fl::a));
      a($$0, "block_predicate", fk.class, ho.a(fk::a));
      a($$0, "item_stack", ga.class, ho.a(ga::a));
      a($$0, "item_predicate", gd.class, ho.a(gd::a));
      a($$0, "color", ec.class, ho.a(ec::a));
      a($$0, "component", ed.class, ho.a(ed::a));
      a($$0, "style", fd.class, ho.a(fd::a));
      a($$0, "message", el.class, ho.a(el::a));
      a($$0, "nbt_compound_tag", ee.class, ho.a(ee::a));
      a($$0, "nbt_tag", en.class, ho.a(en::a));
      a($$0, "nbt_path", em.class, ho.a(em::a));
      a($$0, "objective", eo.class, ho.a(eo::a));
      a($$0, "objective_criteria", ep.class, ho.a(ep::a));
      a($$0, "operation", eq.class, ho.a(eq::a));
      a($$0, "particle", er.class, ho.a(er::a));
      a($$0, "angle", ea.class, ho.a(ea::a));
      a($$0, "rotation", fs.class, ho.a(fs::a));
      a($$0, "scoreboard_slot", ez.class, ho.a(ez::a));
      a($$0, "score_holder", ey.class, new ey.a());
      a($$0, "swizzle", ft.class, ho.a(ft::a));
      a($$0, "team", fe.class, ho.a(fe::a));
      a($$0, "item_slot", fb.class, ho.a(fb::a));
      a($$0, "resource_location", ev.class, ho.a(ev::a));
      a($$0, "function", fz.class, ho.a(fz::a));
      a($$0, "entity_anchor", eg.class, ho.a(eg::a));
      a($$0, "int_range", es.b.class, ho.a(es::a));
      a($$0, "float_range", es.a.class, ho.a(es::b));
      a($$0, "dimension", ef.class, ho.a(ef::a));
      a($$0, "gamemode", ei.class, ho.a(ei::a));
      a($$0, "time", fh.class, new fh.a());
      a($$0, "resource_or_tag", b(ew.class), new ew.a());
      a($$0, "resource_or_tag_key", b(ex.class), new ex.a());
      a($$0, "resource", b(et.class), new et.a());
      a($$0, "resource_key", b(eu.class), new eu.a());
      a($$0, "template_mirror", ff.class, ho.a(ff::a));
      a($$0, "template_rotation", fg.class, ho.a(fg::a));
      a($$0, "heightmap", ek.class, ho.a(ek::a));
      if (aa.aU) {
         a($$0, "test_argument", sn.class, ho.a(sn::a));
         a($$0, "test_class", sj.class, ho.a(sj::a));
      }

      return a($$0, "uuid", fi.class, ho.a(fi::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> hl<A, ?> a(A $$0) {
      hl<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (hl<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> hl.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
