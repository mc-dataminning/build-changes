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

public class is {
   private static final Map<Class<?>, ir<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends ir.a<A>> ir<A, T> a(kc<ir<?, ?>> $$0, String $$1, Class<? extends A> $$2, ir<A, T> $$3) {
      a.put($$2, $$3);
      return kc.a($$0, $$1, $$3);
   }

   public static ir<?, ?> a(kc<ir<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, iu.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new ix());
      a($$0, "brigadier:double", DoubleArgumentType.class, new iw());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new iy());
      a($$0, "brigadier:long", LongArgumentType.class, new iz());
      a($$0, "brigadier:string", StringArgumentType.class, new ja());
      a($$0, "entity", fi.class, new fi.a());
      a($$0, "game_profile", fk.class, iu.a(fk::a));
      a($$0, "block_pos", gr.class, iu.a(gr::a));
      a($$0, "column_pos", gs.class, iu.a(gs::a));
      a($$0, "vec3", gy.class, iu.a(gy::a));
      a($$0, "vec2", gx.class, iu.a(gx::a));
      a($$0, "block_state", go.class, iu.a(go::a));
      a($$0, "block_predicate", gn.class, iu.a(gn::a));
      a($$0, "item_stack", he.class, iu.a(he::a));
      a($$0, "item_predicate", hh.class, iu.a(hh::a));
      a($$0, "color", fd.class, iu.a(fd::a));
      a($$0, "component", fe.class, iu.a(fe::a));
      a($$0, "style", gg.class, iu.a(gg::a));
      a($$0, "message", fm.class, iu.a(fm::a));
      a($$0, "nbt_compound_tag", ff.class, iu.a(ff::a));
      a($$0, "nbt_tag", fo.class, iu.a(fo::a));
      a($$0, "nbt_path", fn.class, iu.a(fn::a));
      a($$0, "objective", fp.class, iu.a(fp::a));
      a($$0, "objective_criteria", fq.class, iu.a(fq::a));
      a($$0, "operation", fr.class, iu.a(fr::a));
      a($$0, "particle", fs.class, iu.a(fs::a));
      a($$0, "angle", fb.class, iu.a(fb::a));
      a($$0, "rotation", gv.class, iu.a(gv::a));
      a($$0, "scoreboard_slot", gb.class, iu.a(gb::a));
      a($$0, "score_holder", ga.class, new ga.a());
      a($$0, "swizzle", gw.class, iu.a(gw::a));
      a($$0, "team", gh.class, iu.a(gh::a));
      a($$0, "item_slot", gd.class, iu.a(gd::a));
      a($$0, "item_slots", ge.class, iu.a(ge::a));
      a($$0, "resource_location", fw.class, iu.a(fw::a));
      a($$0, "function", hd.class, iu.a(hd::a));
      a($$0, "entity_anchor", fh.class, iu.a(fh::a));
      a($$0, "int_range", ft.b.class, iu.a(ft::a));
      a($$0, "float_range", ft.a.class, iu.a(ft::b));
      a($$0, "dimension", fg.class, iu.a(fg::a));
      a($$0, "gamemode", fj.class, iu.a(fj::a));
      a($$0, "time", gk.class, new gk.a());
      a($$0, "resource_or_tag", b(fy.class), new fy.a());
      a($$0, "resource_or_tag_key", b(fz.class), new fz.a());
      a($$0, "resource", b(fu.class), new fu.a());
      a($$0, "resource_key", b(fv.class), new fv.a());
      a($$0, "template_mirror", gi.class, iu.a(gi::a));
      a($$0, "template_rotation", gj.class, iu.a(gj::a));
      a($$0, "heightmap", fl.class, iu.a(fl::a));
      a($$0, "loot_table", fx.c.class, iu.a(fx::a));
      a($$0, "loot_predicate", fx.b.class, iu.a(fx::c));
      a($$0, "loot_modifier", fx.a.class, iu.a(fx::b));
      if (ab.aW) {
         a($$0, "test_argument", tz.class, iu.a(tz::a));
         a($$0, "test_class", tv.class, iu.a(tv::a));
      }

      return a($$0, "uuid", gl.class, iu.a(gl::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> ir<A, ?> a(A $$0) {
      ir<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (ir<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> ir.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
