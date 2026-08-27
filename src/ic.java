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

public class ic {
   private static final Map<Class<?>, ib<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends ib.a<A>> ib<A, T> a(jn<ib<?, ?>> $$0, String $$1, Class<? extends A> $$2, ib<A, T> $$3) {
      a.put($$2, $$3);
      return jn.a($$0, $$1, $$3);
   }

   public static ib<?, ?> a(jn<ib<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, ie.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new ii());
      a($$0, "brigadier:double", DoubleArgumentType.class, new ih());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new ij());
      a($$0, "brigadier:long", LongArgumentType.class, new ik());
      a($$0, "brigadier:string", StringArgumentType.class, new il());
      a($$0, "entity", eu.class, new eu.a());
      a($$0, "game_profile", ew.class, ie.a(ew::a));
      a($$0, "block_pos", gd.class, ie.a(gd::a));
      a($$0, "column_pos", ge.class, ie.a(ge::a));
      a($$0, "vec3", gk.class, ie.a(gk::a));
      a($$0, "vec2", gj.class, ie.a(gj::a));
      a($$0, "block_state", ga.class, ie.a(ga::a));
      a($$0, "block_predicate", fz.class, ie.a(fz::a));
      a($$0, "item_stack", gq.class, ie.a(gq::a));
      a($$0, "item_predicate", gt.class, ie.a(gt::a));
      a($$0, "color", ep.class, ie.a(ep::a));
      a($$0, "component", eq.class, ie.a(eq::a));
      a($$0, "style", fs.class, ie.a(fs::a));
      a($$0, "message", ey.class, ie.a(ey::a));
      a($$0, "nbt_compound_tag", er.class, ie.a(er::a));
      a($$0, "nbt_tag", fa.class, ie.a(fa::a));
      a($$0, "nbt_path", ez.class, ie.a(ez::a));
      a($$0, "objective", fb.class, ie.a(fb::a));
      a($$0, "objective_criteria", fc.class, ie.a(fc::a));
      a($$0, "operation", fd.class, ie.a(fd::a));
      a($$0, "particle", fe.class, ie.a(fe::a));
      a($$0, "angle", en.class, ie.a(en::a));
      a($$0, "rotation", gh.class, ie.a(gh::a));
      a($$0, "scoreboard_slot", fn.class, ie.a(fn::a));
      a($$0, "score_holder", fm.class, new fm.a());
      a($$0, "swizzle", gi.class, ie.a(gi::a));
      a($$0, "team", ft.class, ie.a(ft::a));
      a($$0, "item_slot", fp.class, ie.a(fp::a));
      a($$0, "item_slots", fq.class, ie.a(fq::a));
      a($$0, "resource_location", fi.class, ie.a(fi::a));
      a($$0, "function", gp.class, ie.a(gp::a));
      a($$0, "entity_anchor", et.class, ie.a(et::a));
      a($$0, "int_range", ff.b.class, ie.a(ff::a));
      a($$0, "float_range", ff.a.class, ie.a(ff::b));
      a($$0, "dimension", es.class, ie.a(es::a));
      a($$0, "gamemode", ev.class, ie.a(ev::a));
      a($$0, "time", fw.class, new fw.a());
      a($$0, "resource_or_tag", b(fk.class), new fk.a());
      a($$0, "resource_or_tag_key", b(fl.class), new fl.a());
      a($$0, "resource", b(fg.class), new fg.a());
      a($$0, "resource_key", b(fh.class), new fh.a());
      a($$0, "template_mirror", fu.class, ie.a(fu::a));
      a($$0, "template_rotation", fv.class, ie.a(fv::a));
      a($$0, "heightmap", ex.class, ie.a(ex::a));
      a($$0, "loot_table", fj.c.class, ie.a(fj::a));
      a($$0, "loot_predicate", fj.b.class, ie.a(fj::c));
      a($$0, "loot_modifier", fj.a.class, ie.a(fj::b));
      if (ab.aX) {
         a($$0, "test_argument", ub.class, ie.a(ub::a));
         a($$0, "test_class", tx.class, ie.a(tx::a));
      }

      return a($$0, "uuid", fx.class, ie.a(fx::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> ib<A, ?> a(A $$0) {
      ib<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (ib<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> ib.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
