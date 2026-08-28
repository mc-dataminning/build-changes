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

public class ir {
   private static final Map<Class<?>, iq<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends iq.a<A>> iq<A, T> a(kb<iq<?, ?>> $$0, String $$1, Class<? extends A> $$2, iq<A, T> $$3) {
      a.put($$2, $$3);
      return kb.a($$0, $$1, $$3);
   }

   public static iq<?, ?> a(kb<iq<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, it.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new iw());
      a($$0, "brigadier:double", DoubleArgumentType.class, new iv());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new ix());
      a($$0, "brigadier:long", LongArgumentType.class, new iy());
      a($$0, "brigadier:string", StringArgumentType.class, new iz());
      a($$0, "entity", fh.class, new fh.a());
      a($$0, "game_profile", fj.class, it.a(fj::a));
      a($$0, "block_pos", gq.class, it.a(gq::a));
      a($$0, "column_pos", gr.class, it.a(gr::a));
      a($$0, "vec3", gx.class, it.a(gx::a));
      a($$0, "vec2", gw.class, it.a(gw::a));
      a($$0, "block_state", gn.class, it.a(gn::a));
      a($$0, "block_predicate", gm.class, it.a(gm::a));
      a($$0, "item_stack", hd.class, it.a(hd::a));
      a($$0, "item_predicate", hg.class, it.a(hg::a));
      a($$0, "color", fc.class, it.a(fc::a));
      a($$0, "component", fd.class, it.a(fd::a));
      a($$0, "style", gf.class, it.a(gf::a));
      a($$0, "message", fl.class, it.a(fl::a));
      a($$0, "nbt_compound_tag", fe.class, it.a(fe::a));
      a($$0, "nbt_tag", fn.class, it.a(fn::a));
      a($$0, "nbt_path", fm.class, it.a(fm::a));
      a($$0, "objective", fo.class, it.a(fo::a));
      a($$0, "objective_criteria", fp.class, it.a(fp::a));
      a($$0, "operation", fq.class, it.a(fq::a));
      a($$0, "particle", fr.class, it.a(fr::a));
      a($$0, "angle", fa.class, it.a(fa::a));
      a($$0, "rotation", gu.class, it.a(gu::a));
      a($$0, "scoreboard_slot", ga.class, it.a(ga::a));
      a($$0, "score_holder", fz.class, new fz.a());
      a($$0, "swizzle", gv.class, it.a(gv::a));
      a($$0, "team", gg.class, it.a(gg::a));
      a($$0, "item_slot", gc.class, it.a(gc::a));
      a($$0, "item_slots", gd.class, it.a(gd::a));
      a($$0, "resource_location", fv.class, it.a(fv::a));
      a($$0, "function", hc.class, it.a(hc::a));
      a($$0, "entity_anchor", fg.class, it.a(fg::a));
      a($$0, "int_range", fs.b.class, it.a(fs::a));
      a($$0, "float_range", fs.a.class, it.a(fs::b));
      a($$0, "dimension", ff.class, it.a(ff::a));
      a($$0, "gamemode", fi.class, it.a(fi::a));
      a($$0, "time", gj.class, new gj.a());
      a($$0, "resource_or_tag", b(fx.class), new fx.a());
      a($$0, "resource_or_tag_key", b(fy.class), new fy.a());
      a($$0, "resource", b(ft.class), new ft.a());
      a($$0, "resource_key", b(fu.class), new fu.a());
      a($$0, "template_mirror", gh.class, it.a(gh::a));
      a($$0, "template_rotation", gi.class, it.a(gi::a));
      a($$0, "heightmap", fk.class, it.a(fk::a));
      a($$0, "loot_table", fw.c.class, it.a(fw::a));
      a($$0, "loot_predicate", fw.b.class, it.a(fw::c));
      a($$0, "loot_modifier", fw.a.class, it.a(fw::b));
      if (ab.aW) {
         a($$0, "test_argument", tw.class, it.a(tw::a));
         a($$0, "test_class", ts.class, it.a(ts::a));
      }

      return a($$0, "uuid", gk.class, it.a(gk::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> iq<A, ?> a(A $$0) {
      iq<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (iq<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> iq.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
