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

public class iv {
   private static final Map<Class<?>, iu<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends iu.a<A>> iu<A, T> a(kf<iu<?, ?>> $$0, String $$1, Class<? extends A> $$2, iu<A, T> $$3) {
      a.put($$2, $$3);
      return kf.a($$0, $$1, $$3);
   }

   public static iu<?, ?> a(kf<iu<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, ix.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new ja());
      a($$0, "brigadier:double", DoubleArgumentType.class, new iz());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new jb());
      a($$0, "brigadier:long", LongArgumentType.class, new jc());
      a($$0, "brigadier:string", StringArgumentType.class, new jd());
      a($$0, "entity", fk.class, new fk.a());
      a($$0, "game_profile", fm.class, ix.a(fm::a));
      a($$0, "block_pos", gu.class, ix.a(gu::a));
      a($$0, "column_pos", gv.class, ix.a(gv::a));
      a($$0, "vec3", hb.class, ix.a(hb::a));
      a($$0, "vec2", ha.class, ix.a(ha::a));
      a($$0, "block_state", gr.class, ix.a(gr::a));
      a($$0, "block_predicate", gq.class, ix.a(gq::a));
      a($$0, "item_stack", hh.class, ix.a(hh::a));
      a($$0, "item_predicate", hk.class, ix.a(hk::a));
      a($$0, "color", ff.class, ix.a(ff::a));
      a($$0, "component", fg.class, ix.a(fg::a));
      a($$0, "style", gj.class, ix.a(gj::a));
      a($$0, "message", fo.class, ix.a(fo::a));
      a($$0, "nbt_compound_tag", fh.class, ix.a(fh::a));
      a($$0, "nbt_tag", fq.class, ix.a(fq::a));
      a($$0, "nbt_path", fp.class, ix.a(fp::a));
      a($$0, "objective", fr.class, ix.a(fr::a));
      a($$0, "objective_criteria", fs.class, ix.a(fs::a));
      a($$0, "operation", ft.class, ix.a(ft::a));
      a($$0, "particle", fu.class, ix.a(fu::a));
      a($$0, "angle", fd.class, ix.a(fd::a));
      a($$0, "rotation", gy.class, ix.a(gy::a));
      a($$0, "scoreboard_slot", ge.class, ix.a(ge::a));
      a($$0, "score_holder", gd.class, new gd.a());
      a($$0, "swizzle", gz.class, ix.a(gz::a));
      a($$0, "team", gk.class, ix.a(gk::a));
      a($$0, "item_slot", gg.class, ix.a(gg::a));
      a($$0, "item_slots", gh.class, ix.a(gh::a));
      a($$0, "resource_location", fy.class, ix.a(fy::a));
      a($$0, "function", hg.class, ix.a(hg::a));
      a($$0, "entity_anchor", fj.class, ix.a(fj::a));
      a($$0, "int_range", fv.b.class, ix.a(fv::a));
      a($$0, "float_range", fv.a.class, ix.a(fv::b));
      a($$0, "dimension", fi.class, ix.a(fi::a));
      a($$0, "gamemode", fl.class, ix.a(fl::a));
      a($$0, "time", gn.class, new gn.a());
      a($$0, "resource_or_tag", b(ga.class), new ga.a());
      a($$0, "resource_or_tag_key", b(gb.class), new gb.a());
      a($$0, "resource", b(fw.class), new fw.a());
      a($$0, "resource_key", b(fx.class), new fx.a());
      a($$0, "resource_selector", b(gc.class), new gc.a());
      a($$0, "template_mirror", gl.class, ix.a(gl::a));
      a($$0, "template_rotation", gm.class, ix.a(gm::a));
      a($$0, "heightmap", fn.class, ix.a(fn::a));
      a($$0, "loot_table", fz.c.class, ix.a(fz::a));
      a($$0, "loot_predicate", fz.b.class, ix.a(fz::c));
      a($$0, "loot_modifier", fz.a.class, ix.a(fz::b));
      return a($$0, "uuid", go.class, ix.a(go::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> iu<A, ?> a(A $$0) {
      iu<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (iu<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> iu.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
