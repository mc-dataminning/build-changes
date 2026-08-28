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

public class ig {
   private static final Map<Class<?>, ie<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends ie.a<A>> ie<A, T> a(jr<ie<?, ?>> $$0, String $$1, Class<? extends A> $$2, ie<A, T> $$3) {
      a.put($$2, $$3);
      return jr.a($$0, $$1, $$3);
   }

   public static ie<?, ?> a(jr<ie<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, ii.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new il());
      a($$0, "brigadier:double", DoubleArgumentType.class, new ik());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new im());
      a($$0, "brigadier:long", LongArgumentType.class, new in());
      a($$0, "brigadier:string", StringArgumentType.class, new io());
      a($$0, "entity", ev.class, new ev.a());
      a($$0, "game_profile", ex.class, ii.a(ex::a));
      a($$0, "block_pos", gf.class, ii.a(gf::a));
      a($$0, "column_pos", gg.class, ii.a(gg::a));
      a($$0, "vec3", gm.class, ii.a(gm::a));
      a($$0, "vec2", gl.class, ii.a(gl::a));
      a($$0, "block_state", gc.class, ii.a(gc::a));
      a($$0, "block_predicate", gb.class, ii.a(gb::a));
      a($$0, "item_stack", gs.class, ii.a(gs::a));
      a($$0, "item_predicate", gv.class, ii.a(gv::a));
      a($$0, "color", eq.class, ii.a(eq::a));
      a($$0, "component", er.class, ii.a(er::a));
      a($$0, "style", fu.class, ii.a(fu::a));
      a($$0, "message", ez.class, ii.a(ez::a));
      a($$0, "nbt_compound_tag", es.class, ii.a(es::a));
      a($$0, "nbt_tag", fb.class, ii.a(fb::a));
      a($$0, "nbt_path", fa.class, ii.a(fa::a));
      a($$0, "objective", fc.class, ii.a(fc::a));
      a($$0, "objective_criteria", fd.class, ii.a(fd::a));
      a($$0, "operation", fe.class, ii.a(fe::a));
      a($$0, "particle", ff.class, ii.a(ff::a));
      a($$0, "angle", eo.class, ii.a(eo::a));
      a($$0, "rotation", gj.class, ii.a(gj::a));
      a($$0, "scoreboard_slot", fp.class, ii.a(fp::a));
      a($$0, "score_holder", fo.class, new fo.a());
      a($$0, "swizzle", gk.class, ii.a(gk::a));
      a($$0, "team", fv.class, ii.a(fv::a));
      a($$0, "item_slot", fr.class, ii.a(fr::a));
      a($$0, "item_slots", fs.class, ii.a(fs::a));
      a($$0, "resource_location", fj.class, ii.a(fj::a));
      a($$0, "function", gr.class, ii.a(gr::a));
      a($$0, "entity_anchor", eu.class, ii.a(eu::a));
      a($$0, "int_range", fg.b.class, ii.a(fg::a));
      a($$0, "float_range", fg.a.class, ii.a(fg::b));
      a($$0, "dimension", et.class, ii.a(et::a));
      a($$0, "gamemode", ew.class, ii.a(ew::a));
      a($$0, "time", fy.class, new fy.a());
      a($$0, "resource_or_tag", b(fl.class), new fl.a());
      a($$0, "resource_or_tag_key", b(fm.class), new fm.a());
      a($$0, "resource", b(fh.class), new fh.a());
      a($$0, "resource_key", b(fi.class), new fi.a());
      a($$0, "resource_selector", b(fn.class), new fn.a());
      a($$0, "template_mirror", fw.class, ii.a(fw::a));
      a($$0, "template_rotation", fx.class, ii.a(fx::a));
      a($$0, "heightmap", ey.class, ii.a(ey::a));
      a($$0, "loot_table", fk.c.class, ii.a(fk::a));
      a($$0, "loot_predicate", fk.b.class, ii.a(fk::c));
      a($$0, "loot_modifier", fk.a.class, ii.a(fk::b));
      return a($$0, "uuid", fz.class, ii.a(fz::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> ie<A, ?> a(A $$0) {
      ie<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (ie<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> ie.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
