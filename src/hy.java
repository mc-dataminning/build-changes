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

public class hy {
   private static final Map<Class<?>, hx<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends hx.a<A>> hx<A, T> a(jj<hx<?, ?>> $$0, String $$1, Class<? extends A> $$2, hx<A, T> $$3) {
      a.put($$2, $$3);
      return jj.a($$0, $$1, $$3);
   }

   public static hx<?, ?> a(jj<hx<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, ia.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new id());
      a($$0, "brigadier:double", DoubleArgumentType.class, new ic());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new ie());
      a($$0, "brigadier:long", LongArgumentType.class, new ig());
      a($$0, "brigadier:string", StringArgumentType.class, new ih());
      a($$0, "entity", eq.class, new eq.a());
      a($$0, "game_profile", es.class, ia.a(es::a));
      a($$0, "block_pos", fz.class, ia.a(fz::a));
      a($$0, "column_pos", ga.class, ia.a(ga::a));
      a($$0, "vec3", gg.class, ia.a(gg::a));
      a($$0, "vec2", gf.class, ia.a(gf::a));
      a($$0, "block_state", fw.class, ia.a(fw::a));
      a($$0, "block_predicate", fv.class, ia.a(fv::a));
      a($$0, "item_stack", gm.class, ia.a(gm::a));
      a($$0, "item_predicate", gp.class, ia.a(gp::a));
      a($$0, "color", el.class, ia.a(el::a));
      a($$0, "component", em.class, ia.a(em::a));
      a($$0, "style", fo.class, ia.a(fo::a));
      a($$0, "message", eu.class, ia.a(eu::a));
      a($$0, "nbt_compound_tag", en.class, ia.a(en::a));
      a($$0, "nbt_tag", ew.class, ia.a(ew::a));
      a($$0, "nbt_path", ev.class, ia.a(ev::a));
      a($$0, "objective", ex.class, ia.a(ex::a));
      a($$0, "objective_criteria", ey.class, ia.a(ey::a));
      a($$0, "operation", ez.class, ia.a(ez::a));
      a($$0, "particle", fa.class, ia.a(fa::a));
      a($$0, "angle", ej.class, ia.a(ej::a));
      a($$0, "rotation", gd.class, ia.a(gd::a));
      a($$0, "scoreboard_slot", fj.class, ia.a(fj::a));
      a($$0, "score_holder", fi.class, new fi.a());
      a($$0, "swizzle", ge.class, ia.a(ge::a));
      a($$0, "team", fp.class, ia.a(fp::a));
      a($$0, "item_slot", fl.class, ia.a(fl::a));
      a($$0, "item_slots", fm.class, ia.a(fm::a));
      a($$0, "resource_location", fe.class, ia.a(fe::a));
      a($$0, "function", gl.class, ia.a(gl::a));
      a($$0, "entity_anchor", ep.class, ia.a(ep::a));
      a($$0, "int_range", fb.b.class, ia.a(fb::a));
      a($$0, "float_range", fb.a.class, ia.a(fb::b));
      a($$0, "dimension", eo.class, ia.a(eo::a));
      a($$0, "gamemode", er.class, ia.a(er::a));
      a($$0, "time", fs.class, new fs.a());
      a($$0, "resource_or_tag", b(fg.class), new fg.a());
      a($$0, "resource_or_tag_key", b(fh.class), new fh.a());
      a($$0, "resource", b(fc.class), new fc.a());
      a($$0, "resource_key", b(fd.class), new fd.a());
      a($$0, "template_mirror", fq.class, ia.a(fq::a));
      a($$0, "template_rotation", fr.class, ia.a(fr::a));
      a($$0, "heightmap", et.class, ia.a(et::a));
      a($$0, "loot_table", ff.c.class, ia.a(ff::a));
      a($$0, "loot_predicate", ff.b.class, ia.a(ff::c));
      a($$0, "loot_modifier", ff.a.class, ia.a(ff::b));
      if (aa.aX) {
         a($$0, "test_argument", tr.class, ia.a(tr::a));
         a($$0, "test_class", tn.class, ia.a(tn::a));
      }

      return a($$0, "uuid", ft.class, ia.a(ft::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> hx<A, ?> a(A $$0) {
      hx<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (hx<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> hx.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
