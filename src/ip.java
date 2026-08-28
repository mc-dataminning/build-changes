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

public class ip {
   private static final Map<Class<?>, io<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends io.a<A>> io<A, T> a(jz<io<?, ?>> $$0, String $$1, Class<? extends A> $$2, io<A, T> $$3) {
      a.put($$2, $$3);
      return jz.a($$0, $$1, $$3);
   }

   public static io<?, ?> a(jz<io<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, ir.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new iu());
      a($$0, "brigadier:double", DoubleArgumentType.class, new it());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new iv());
      a($$0, "brigadier:long", LongArgumentType.class, new iw());
      a($$0, "brigadier:string", StringArgumentType.class, new ix());
      a($$0, "entity", fg.class, new fg.a());
      a($$0, "game_profile", fi.class, ir.a(fi::a));
      a($$0, "block_pos", gp.class, ir.a(gp::a));
      a($$0, "column_pos", gq.class, ir.a(gq::a));
      a($$0, "vec3", gw.class, ir.a(gw::a));
      a($$0, "vec2", gv.class, ir.a(gv::a));
      a($$0, "block_state", gm.class, ir.a(gm::a));
      a($$0, "block_predicate", gl.class, ir.a(gl::a));
      a($$0, "item_stack", hc.class, ir.a(hc::a));
      a($$0, "item_predicate", hf.class, ir.a(hf::a));
      a($$0, "color", fb.class, ir.a(fb::a));
      a($$0, "component", fc.class, ir.a(fc::a));
      a($$0, "style", ge.class, ir.a(ge::a));
      a($$0, "message", fk.class, ir.a(fk::a));
      a($$0, "nbt_compound_tag", fd.class, ir.a(fd::a));
      a($$0, "nbt_tag", fm.class, ir.a(fm::a));
      a($$0, "nbt_path", fl.class, ir.a(fl::a));
      a($$0, "objective", fn.class, ir.a(fn::a));
      a($$0, "objective_criteria", fo.class, ir.a(fo::a));
      a($$0, "operation", fp.class, ir.a(fp::a));
      a($$0, "particle", fq.class, ir.a(fq::a));
      a($$0, "angle", ez.class, ir.a(ez::a));
      a($$0, "rotation", gt.class, ir.a(gt::a));
      a($$0, "scoreboard_slot", fz.class, ir.a(fz::a));
      a($$0, "score_holder", fy.class, new fy.a());
      a($$0, "swizzle", gu.class, ir.a(gu::a));
      a($$0, "team", gf.class, ir.a(gf::a));
      a($$0, "item_slot", gb.class, ir.a(gb::a));
      a($$0, "item_slots", gc.class, ir.a(gc::a));
      a($$0, "resource_location", fu.class, ir.a(fu::a));
      a($$0, "function", hb.class, ir.a(hb::a));
      a($$0, "entity_anchor", ff.class, ir.a(ff::a));
      a($$0, "int_range", fr.b.class, ir.a(fr::a));
      a($$0, "float_range", fr.a.class, ir.a(fr::b));
      a($$0, "dimension", fe.class, ir.a(fe::a));
      a($$0, "gamemode", fh.class, ir.a(fh::a));
      a($$0, "time", gi.class, new gi.a());
      a($$0, "resource_or_tag", b(fw.class), new fw.a());
      a($$0, "resource_or_tag_key", b(fx.class), new fx.a());
      a($$0, "resource", b(fs.class), new fs.a());
      a($$0, "resource_key", b(ft.class), new ft.a());
      a($$0, "template_mirror", gg.class, ir.a(gg::a));
      a($$0, "template_rotation", gh.class, ir.a(gh::a));
      a($$0, "heightmap", fj.class, ir.a(fj::a));
      a($$0, "loot_table", fv.c.class, ir.a(fv::a));
      a($$0, "loot_predicate", fv.b.class, ir.a(fv::c));
      a($$0, "loot_modifier", fv.a.class, ir.a(fv::b));
      if (ab.aU) {
         a($$0, "test_argument", ts.class, ir.a(ts::a));
         a($$0, "test_class", to.class, ir.a(to::a));
      }

      return a($$0, "uuid", gj.class, ir.a(gj::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> io<A, ?> a(A $$0) {
      io<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (io<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> io.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
