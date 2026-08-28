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

public class il {
   private static final Map<Class<?>, ik<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends ik.a<A>> ik<A, T> a(jv<ik<?, ?>> $$0, String $$1, Class<? extends A> $$2, ik<A, T> $$3) {
      a.put($$2, $$3);
      return jv.a($$0, $$1, $$3);
   }

   public static ik<?, ?> a(jv<ik<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, in.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new iq());
      a($$0, "brigadier:double", DoubleArgumentType.class, new ip());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new ir());
      a($$0, "brigadier:long", LongArgumentType.class, new is());
      a($$0, "brigadier:string", StringArgumentType.class, new it());
      a($$0, "entity", fc.class, new fc.a());
      a($$0, "game_profile", fe.class, in.a(fe::a));
      a($$0, "block_pos", gl.class, in.a(gl::a));
      a($$0, "column_pos", gm.class, in.a(gm::a));
      a($$0, "vec3", gs.class, in.a(gs::a));
      a($$0, "vec2", gr.class, in.a(gr::a));
      a($$0, "block_state", gi.class, in.a(gi::a));
      a($$0, "block_predicate", gh.class, in.a(gh::a));
      a($$0, "item_stack", gy.class, in.a(gy::a));
      a($$0, "item_predicate", hb.class, in.a(hb::a));
      a($$0, "color", ex.class, in.a(ex::a));
      a($$0, "component", ey.class, in.a(ey::a));
      a($$0, "style", ga.class, in.a(ga::a));
      a($$0, "message", fg.class, in.a(fg::a));
      a($$0, "nbt_compound_tag", ez.class, in.a(ez::a));
      a($$0, "nbt_tag", fi.class, in.a(fi::a));
      a($$0, "nbt_path", fh.class, in.a(fh::a));
      a($$0, "objective", fj.class, in.a(fj::a));
      a($$0, "objective_criteria", fk.class, in.a(fk::a));
      a($$0, "operation", fl.class, in.a(fl::a));
      a($$0, "particle", fm.class, in.a(fm::a));
      a($$0, "angle", ev.class, in.a(ev::a));
      a($$0, "rotation", gp.class, in.a(gp::a));
      a($$0, "scoreboard_slot", fv.class, in.a(fv::a));
      a($$0, "score_holder", fu.class, new fu.a());
      a($$0, "swizzle", gq.class, in.a(gq::a));
      a($$0, "team", gb.class, in.a(gb::a));
      a($$0, "item_slot", fx.class, in.a(fx::a));
      a($$0, "item_slots", fy.class, in.a(fy::a));
      a($$0, "resource_location", fq.class, in.a(fq::a));
      a($$0, "function", gx.class, in.a(gx::a));
      a($$0, "entity_anchor", fb.class, in.a(fb::a));
      a($$0, "int_range", fn.b.class, in.a(fn::a));
      a($$0, "float_range", fn.a.class, in.a(fn::b));
      a($$0, "dimension", fa.class, in.a(fa::a));
      a($$0, "gamemode", fd.class, in.a(fd::a));
      a($$0, "time", ge.class, new ge.a());
      a($$0, "resource_or_tag", b(fs.class), new fs.a());
      a($$0, "resource_or_tag_key", b(ft.class), new ft.a());
      a($$0, "resource", b(fo.class), new fo.a());
      a($$0, "resource_key", b(fp.class), new fp.a());
      a($$0, "template_mirror", gc.class, in.a(gc::a));
      a($$0, "template_rotation", gd.class, in.a(gd::a));
      a($$0, "heightmap", ff.class, in.a(ff::a));
      a($$0, "loot_table", fr.c.class, in.a(fr::a));
      a($$0, "loot_predicate", fr.b.class, in.a(fr::c));
      a($$0, "loot_modifier", fr.a.class, in.a(fr::b));
      if (aa.aX) {
         a($$0, "test_argument", uj.class, in.a(uj::a));
         a($$0, "test_class", uf.class, in.a(uf::a));
      }

      return a($$0, "uuid", gf.class, in.a(gf::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> ik<A, ?> a(A $$0) {
      ik<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (ik<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> ik.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
