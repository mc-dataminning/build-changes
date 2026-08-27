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

public class hz {
   private static final Map<Class<?>, hy<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends hy.a<A>> hy<A, T> a(jk<hy<?, ?>> $$0, String $$1, Class<? extends A> $$2, hy<A, T> $$3) {
      a.put($$2, $$3);
      return jk.a($$0, $$1, $$3);
   }

   public static hy<?, ?> a(jk<hy<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, ib.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new ie());
      a($$0, "brigadier:double", DoubleArgumentType.class, new id());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new ig());
      a($$0, "brigadier:long", LongArgumentType.class, new ih());
      a($$0, "brigadier:string", StringArgumentType.class, new ii());
      a($$0, "entity", er.class, new er.a());
      a($$0, "game_profile", et.class, ib.a(et::a));
      a($$0, "block_pos", ga.class, ib.a(ga::a));
      a($$0, "column_pos", gb.class, ib.a(gb::a));
      a($$0, "vec3", gh.class, ib.a(gh::a));
      a($$0, "vec2", gg.class, ib.a(gg::a));
      a($$0, "block_state", fx.class, ib.a(fx::a));
      a($$0, "block_predicate", fw.class, ib.a(fw::a));
      a($$0, "item_stack", gn.class, ib.a(gn::a));
      a($$0, "item_predicate", gq.class, ib.a(gq::a));
      a($$0, "color", em.class, ib.a(em::a));
      a($$0, "component", en.class, ib.a(en::a));
      a($$0, "style", fp.class, ib.a(fp::a));
      a($$0, "message", ev.class, ib.a(ev::a));
      a($$0, "nbt_compound_tag", eo.class, ib.a(eo::a));
      a($$0, "nbt_tag", ex.class, ib.a(ex::a));
      a($$0, "nbt_path", ew.class, ib.a(ew::a));
      a($$0, "objective", ey.class, ib.a(ey::a));
      a($$0, "objective_criteria", ez.class, ib.a(ez::a));
      a($$0, "operation", fa.class, ib.a(fa::a));
      a($$0, "particle", fb.class, ib.a(fb::a));
      a($$0, "angle", ek.class, ib.a(ek::a));
      a($$0, "rotation", ge.class, ib.a(ge::a));
      a($$0, "scoreboard_slot", fk.class, ib.a(fk::a));
      a($$0, "score_holder", fj.class, new fj.a());
      a($$0, "swizzle", gf.class, ib.a(gf::a));
      a($$0, "team", fq.class, ib.a(fq::a));
      a($$0, "item_slot", fm.class, ib.a(fm::a));
      a($$0, "item_slots", fn.class, ib.a(fn::a));
      a($$0, "resource_location", ff.class, ib.a(ff::a));
      a($$0, "function", gm.class, ib.a(gm::a));
      a($$0, "entity_anchor", eq.class, ib.a(eq::a));
      a($$0, "int_range", fc.b.class, ib.a(fc::a));
      a($$0, "float_range", fc.a.class, ib.a(fc::b));
      a($$0, "dimension", ep.class, ib.a(ep::a));
      a($$0, "gamemode", es.class, ib.a(es::a));
      a($$0, "time", ft.class, new ft.a());
      a($$0, "resource_or_tag", b(fh.class), new fh.a());
      a($$0, "resource_or_tag_key", b(fi.class), new fi.a());
      a($$0, "resource", b(fd.class), new fd.a());
      a($$0, "resource_key", b(fe.class), new fe.a());
      a($$0, "template_mirror", fr.class, ib.a(fr::a));
      a($$0, "template_rotation", fs.class, ib.a(fs::a));
      a($$0, "heightmap", eu.class, ib.a(eu::a));
      a($$0, "loot_table", fg.c.class, ib.a(fg::a));
      a($$0, "loot_predicate", fg.b.class, ib.a(fg::c));
      a($$0, "loot_modifier", fg.a.class, ib.a(fg::b));
      if (aa.aX) {
         a($$0, "test_argument", tu.class, ib.a(tu::a));
         a($$0, "test_class", tq.class, ib.a(tq::a));
      }

      return a($$0, "uuid", fu.class, ib.a(fu::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> hy<A, ?> a(A $$0) {
      hy<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (hy<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> hy.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
