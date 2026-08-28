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

public class it {
   private static final Map<Class<?>, is<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends is.a<A>> is<A, T> a(kd<is<?, ?>> $$0, String $$1, Class<? extends A> $$2, is<A, T> $$3) {
      a.put($$2, $$3);
      return kd.a($$0, $$1, $$3);
   }

   public static is<?, ?> a(kd<is<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, iv.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new iy());
      a($$0, "brigadier:double", DoubleArgumentType.class, new ix());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new iz());
      a($$0, "brigadier:long", LongArgumentType.class, new ja());
      a($$0, "brigadier:string", StringArgumentType.class, new jb());
      a($$0, "entity", fj.class, new fj.a());
      a($$0, "game_profile", fl.class, iv.a(fl::a));
      a($$0, "block_pos", gs.class, iv.a(gs::a));
      a($$0, "column_pos", gt.class, iv.a(gt::a));
      a($$0, "vec3", gz.class, iv.a(gz::a));
      a($$0, "vec2", gy.class, iv.a(gy::a));
      a($$0, "block_state", gp.class, iv.a(gp::a));
      a($$0, "block_predicate", go.class, iv.a(go::a));
      a($$0, "item_stack", hf.class, iv.a(hf::a));
      a($$0, "item_predicate", hi.class, iv.a(hi::a));
      a($$0, "color", fe.class, iv.a(fe::a));
      a($$0, "component", ff.class, iv.a(ff::a));
      a($$0, "style", gh.class, iv.a(gh::a));
      a($$0, "message", fn.class, iv.a(fn::a));
      a($$0, "nbt_compound_tag", fg.class, iv.a(fg::a));
      a($$0, "nbt_tag", fp.class, iv.a(fp::a));
      a($$0, "nbt_path", fo.class, iv.a(fo::a));
      a($$0, "objective", fq.class, iv.a(fq::a));
      a($$0, "objective_criteria", fr.class, iv.a(fr::a));
      a($$0, "operation", fs.class, iv.a(fs::a));
      a($$0, "particle", ft.class, iv.a(ft::a));
      a($$0, "angle", fc.class, iv.a(fc::a));
      a($$0, "rotation", gw.class, iv.a(gw::a));
      a($$0, "scoreboard_slot", gc.class, iv.a(gc::a));
      a($$0, "score_holder", gb.class, new gb.a());
      a($$0, "swizzle", gx.class, iv.a(gx::a));
      a($$0, "team", gi.class, iv.a(gi::a));
      a($$0, "item_slot", ge.class, iv.a(ge::a));
      a($$0, "item_slots", gf.class, iv.a(gf::a));
      a($$0, "resource_location", fx.class, iv.a(fx::a));
      a($$0, "function", he.class, iv.a(he::a));
      a($$0, "entity_anchor", fi.class, iv.a(fi::a));
      a($$0, "int_range", fu.b.class, iv.a(fu::a));
      a($$0, "float_range", fu.a.class, iv.a(fu::b));
      a($$0, "dimension", fh.class, iv.a(fh::a));
      a($$0, "gamemode", fk.class, iv.a(fk::a));
      a($$0, "time", gl.class, new gl.a());
      a($$0, "resource_or_tag", b(fz.class), new fz.a());
      a($$0, "resource_or_tag_key", b(ga.class), new ga.a());
      a($$0, "resource", b(fv.class), new fv.a());
      a($$0, "resource_key", b(fw.class), new fw.a());
      a($$0, "template_mirror", gj.class, iv.a(gj::a));
      a($$0, "template_rotation", gk.class, iv.a(gk::a));
      a($$0, "heightmap", fm.class, iv.a(fm::a));
      a($$0, "loot_table", fy.c.class, iv.a(fy::a));
      a($$0, "loot_predicate", fy.b.class, iv.a(fy::c));
      a($$0, "loot_modifier", fy.a.class, iv.a(fy::b));
      if (ab.aU) {
         a($$0, "test_argument", ub.class, iv.a(ub::a));
         a($$0, "test_class", tx.class, iv.a(tx::a));
      }

      return a($$0, "uuid", gm.class, iv.a(gm::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> is<A, ?> a(A $$0) {
      is<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (is<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> is.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
