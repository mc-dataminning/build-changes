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

public class iu {
   private static final Map<Class<?>, it<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends it.a<A>> it<A, T> a(ke<it<?, ?>> $$0, String $$1, Class<? extends A> $$2, it<A, T> $$3) {
      a.put($$2, $$3);
      return ke.a($$0, $$1, $$3);
   }

   public static it<?, ?> a(ke<it<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, iw.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new iz());
      a($$0, "brigadier:double", DoubleArgumentType.class, new iy());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new ja());
      a($$0, "brigadier:long", LongArgumentType.class, new jb());
      a($$0, "brigadier:string", StringArgumentType.class, new jc());
      a($$0, "entity", fk.class, new fk.a());
      a($$0, "game_profile", fm.class, iw.a(fm::a));
      a($$0, "block_pos", gt.class, iw.a(gt::a));
      a($$0, "column_pos", gu.class, iw.a(gu::a));
      a($$0, "vec3", ha.class, iw.a(ha::a));
      a($$0, "vec2", gz.class, iw.a(gz::a));
      a($$0, "block_state", gq.class, iw.a(gq::a));
      a($$0, "block_predicate", gp.class, iw.a(gp::a));
      a($$0, "item_stack", hg.class, iw.a(hg::a));
      a($$0, "item_predicate", hj.class, iw.a(hj::a));
      a($$0, "color", ff.class, iw.a(ff::a));
      a($$0, "component", fg.class, iw.a(fg::a));
      a($$0, "style", gi.class, iw.a(gi::a));
      a($$0, "message", fo.class, iw.a(fo::a));
      a($$0, "nbt_compound_tag", fh.class, iw.a(fh::a));
      a($$0, "nbt_tag", fq.class, iw.a(fq::a));
      a($$0, "nbt_path", fp.class, iw.a(fp::a));
      a($$0, "objective", fr.class, iw.a(fr::a));
      a($$0, "objective_criteria", fs.class, iw.a(fs::a));
      a($$0, "operation", ft.class, iw.a(ft::a));
      a($$0, "particle", fu.class, iw.a(fu::a));
      a($$0, "angle", fd.class, iw.a(fd::a));
      a($$0, "rotation", gx.class, iw.a(gx::a));
      a($$0, "scoreboard_slot", gd.class, iw.a(gd::a));
      a($$0, "score_holder", gc.class, new gc.a());
      a($$0, "swizzle", gy.class, iw.a(gy::a));
      a($$0, "team", gj.class, iw.a(gj::a));
      a($$0, "item_slot", gf.class, iw.a(gf::a));
      a($$0, "item_slots", gg.class, iw.a(gg::a));
      a($$0, "resource_location", fy.class, iw.a(fy::a));
      a($$0, "function", hf.class, iw.a(hf::a));
      a($$0, "entity_anchor", fj.class, iw.a(fj::a));
      a($$0, "int_range", fv.b.class, iw.a(fv::a));
      a($$0, "float_range", fv.a.class, iw.a(fv::b));
      a($$0, "dimension", fi.class, iw.a(fi::a));
      a($$0, "gamemode", fl.class, iw.a(fl::a));
      a($$0, "time", gm.class, new gm.a());
      a($$0, "resource_or_tag", b(ga.class), new ga.a());
      a($$0, "resource_or_tag_key", b(gb.class), new gb.a());
      a($$0, "resource", b(fw.class), new fw.a());
      a($$0, "resource_key", b(fx.class), new fx.a());
      a($$0, "template_mirror", gk.class, iw.a(gk::a));
      a($$0, "template_rotation", gl.class, iw.a(gl::a));
      a($$0, "heightmap", fn.class, iw.a(fn::a));
      a($$0, "loot_table", fz.c.class, iw.a(fz::a));
      a($$0, "loot_predicate", fz.b.class, iw.a(fz::c));
      a($$0, "loot_modifier", fz.a.class, iw.a(fz::b));
      if (ab.aU) {
         a($$0, "test_argument", tg.class, iw.a(tg::a));
         a($$0, "test_class", tc.class, iw.a(tc::a));
      }

      return a($$0, "uuid", gn.class, iw.a(gn::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> it<A, ?> a(A $$0) {
      it<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (it<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> it.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
