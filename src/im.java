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

public class im {
   private static final Map<Class<?>, il<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends il.a<A>> il<A, T> a(jw<il<?, ?>> $$0, String $$1, Class<? extends A> $$2, il<A, T> $$3) {
      a.put($$2, $$3);
      return jw.a($$0, $$1, $$3);
   }

   public static il<?, ?> a(jw<il<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, io.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new ir());
      a($$0, "brigadier:double", DoubleArgumentType.class, new iq());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new is());
      a($$0, "brigadier:long", LongArgumentType.class, new it());
      a($$0, "brigadier:string", StringArgumentType.class, new iu());
      a($$0, "entity", fd.class, new fd.a());
      a($$0, "game_profile", ff.class, io.a(ff::a));
      a($$0, "block_pos", gm.class, io.a(gm::a));
      a($$0, "column_pos", gn.class, io.a(gn::a));
      a($$0, "vec3", gt.class, io.a(gt::a));
      a($$0, "vec2", gs.class, io.a(gs::a));
      a($$0, "block_state", gj.class, io.a(gj::a));
      a($$0, "block_predicate", gi.class, io.a(gi::a));
      a($$0, "item_stack", gz.class, io.a(gz::a));
      a($$0, "item_predicate", hc.class, io.a(hc::a));
      a($$0, "color", ey.class, io.a(ey::a));
      a($$0, "component", ez.class, io.a(ez::a));
      a($$0, "style", gb.class, io.a(gb::a));
      a($$0, "message", fh.class, io.a(fh::a));
      a($$0, "nbt_compound_tag", fa.class, io.a(fa::a));
      a($$0, "nbt_tag", fj.class, io.a(fj::a));
      a($$0, "nbt_path", fi.class, io.a(fi::a));
      a($$0, "objective", fk.class, io.a(fk::a));
      a($$0, "objective_criteria", fl.class, io.a(fl::a));
      a($$0, "operation", fm.class, io.a(fm::a));
      a($$0, "particle", fn.class, io.a(fn::a));
      a($$0, "angle", ew.class, io.a(ew::a));
      a($$0, "rotation", gq.class, io.a(gq::a));
      a($$0, "scoreboard_slot", fw.class, io.a(fw::a));
      a($$0, "score_holder", fv.class, new fv.a());
      a($$0, "swizzle", gr.class, io.a(gr::a));
      a($$0, "team", gc.class, io.a(gc::a));
      a($$0, "item_slot", fy.class, io.a(fy::a));
      a($$0, "item_slots", fz.class, io.a(fz::a));
      a($$0, "resource_location", fr.class, io.a(fr::a));
      a($$0, "function", gy.class, io.a(gy::a));
      a($$0, "entity_anchor", fc.class, io.a(fc::a));
      a($$0, "int_range", fo.b.class, io.a(fo::a));
      a($$0, "float_range", fo.a.class, io.a(fo::b));
      a($$0, "dimension", fb.class, io.a(fb::a));
      a($$0, "gamemode", fe.class, io.a(fe::a));
      a($$0, "time", gf.class, new gf.a());
      a($$0, "resource_or_tag", b(ft.class), new ft.a());
      a($$0, "resource_or_tag_key", b(fu.class), new fu.a());
      a($$0, "resource", b(fp.class), new fp.a());
      a($$0, "resource_key", b(fq.class), new fq.a());
      a($$0, "template_mirror", gd.class, io.a(gd::a));
      a($$0, "template_rotation", ge.class, io.a(ge::a));
      a($$0, "heightmap", fg.class, io.a(fg::a));
      a($$0, "loot_table", fs.c.class, io.a(fs::a));
      a($$0, "loot_predicate", fs.b.class, io.a(fs::c));
      a($$0, "loot_modifier", fs.a.class, io.a(fs::b));
      if (aa.aU) {
         a($$0, "test_argument", to.class, io.a(to::a));
         a($$0, "test_class", tk.class, io.a(tk::a));
      }

      return a($$0, "uuid", gg.class, io.a(gg::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> il<A, ?> a(A $$0) {
      il<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (il<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> il.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
