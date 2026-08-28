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

public class ih {
   private static final Map<Class<?>, ig<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends ig.a<A>> ig<A, T> a(js<ig<?, ?>> $$0, String $$1, Class<? extends A> $$2, ig<A, T> $$3) {
      a.put($$2, $$3);
      return js.a($$0, $$1, $$3);
   }

   public static ig<?, ?> a(js<ig<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, ij.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new im());
      a($$0, "brigadier:double", DoubleArgumentType.class, new il());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new in());
      a($$0, "brigadier:long", LongArgumentType.class, new io());
      a($$0, "brigadier:string", StringArgumentType.class, new ip());
      a($$0, "entity", ew.class, new ew.a());
      a($$0, "game_profile", ey.class, ij.a(ey::a));
      a($$0, "block_pos", gg.class, ij.a(gg::a));
      a($$0, "column_pos", gh.class, ij.a(gh::a));
      a($$0, "vec3", gn.class, ij.a(gn::a));
      a($$0, "vec2", gm.class, ij.a(gm::a));
      a($$0, "block_state", gd.class, ij.a(gd::a));
      a($$0, "block_predicate", gc.class, ij.a(gc::a));
      a($$0, "item_stack", gt.class, ij.a(gt::a));
      a($$0, "item_predicate", gw.class, ij.a(gw::a));
      a($$0, "color", er.class, ij.a(er::a));
      a($$0, "component", es.class, ij.a(es::a));
      a($$0, "style", fv.class, ij.a(fv::a));
      a($$0, "message", fa.class, ij.a(fa::a));
      a($$0, "nbt_compound_tag", et.class, ij.a(et::a));
      a($$0, "nbt_tag", fc.class, ij.a(fc::a));
      a($$0, "nbt_path", fb.class, ij.a(fb::a));
      a($$0, "objective", fd.class, ij.a(fd::a));
      a($$0, "objective_criteria", fe.class, ij.a(fe::a));
      a($$0, "operation", ff.class, ij.a(ff::a));
      a($$0, "particle", fg.class, ij.a(fg::a));
      a($$0, "angle", ep.class, ij.a(ep::a));
      a($$0, "rotation", gk.class, ij.a(gk::a));
      a($$0, "scoreboard_slot", fq.class, ij.a(fq::a));
      a($$0, "score_holder", fp.class, new fp.a());
      a($$0, "swizzle", gl.class, ij.a(gl::a));
      a($$0, "team", fw.class, ij.a(fw::a));
      a($$0, "item_slot", fs.class, ij.a(fs::a));
      a($$0, "item_slots", ft.class, ij.a(ft::a));
      a($$0, "resource_location", fk.class, ij.a(fk::a));
      a($$0, "function", gs.class, ij.a(gs::a));
      a($$0, "entity_anchor", ev.class, ij.a(ev::a));
      a($$0, "int_range", fh.b.class, ij.a(fh::a));
      a($$0, "float_range", fh.a.class, ij.a(fh::b));
      a($$0, "dimension", eu.class, ij.a(eu::a));
      a($$0, "gamemode", ex.class, ij.a(ex::a));
      a($$0, "time", fz.class, new fz.a());
      a($$0, "resource_or_tag", b(fm.class), new fm.a());
      a($$0, "resource_or_tag_key", b(fn.class), new fn.a());
      a($$0, "resource", b(fi.class), new fi.a());
      a($$0, "resource_key", b(fj.class), new fj.a());
      a($$0, "resource_selector", b(fo.class), new fo.a());
      a($$0, "template_mirror", fx.class, ij.a(fx::a));
      a($$0, "template_rotation", fy.class, ij.a(fy::a));
      a($$0, "heightmap", ez.class, ij.a(ez::a));
      a($$0, "loot_table", fl.c.class, ij.a(fl::a));
      a($$0, "loot_predicate", fl.b.class, ij.a(fl::c));
      a($$0, "loot_modifier", fl.a.class, ij.a(fl::b));
      return a($$0, "uuid", ga.class, ij.a(ga::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> ig<A, ?> a(A $$0) {
      ig<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (ig<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> ig.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
