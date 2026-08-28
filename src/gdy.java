import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gdy {
   public static final alb a = new alb("textures/atlas/shulker_boxes.png");
   public static final alb b = new alb("textures/atlas/beds.png");
   public static final alb c = new alb("textures/atlas/banner_patterns.png");
   public static final alb d = new alb("textures/atlas/shield_patterns.png");
   public static final alb e = new alb("textures/atlas/signs.png");
   public static final alb f = new alb("textures/atlas/chest.png");
   public static final alb g = new alb("textures/atlas/armor_trims.png");
   public static final alb h = new alb("textures/atlas/decorated_pot.png");
   private static final gdr A = gdr.e(a);
   private static final gdr B = gdr.c(b);
   private static final gdr C = gdr.m(c);
   private static final gdr D = gdr.m(d);
   private static final gdr E = gdr.e(e);
   private static final gdr F = gdr.d(f);
   private static final gdr G = gdr.a(g);
   private static final gdr H = gdr.b(g);
   private static final gdr I = gdr.c(got.e);
   private static final gdr J = gdr.d(got.e);
   private static final gdr K = gdr.g(got.e);
   private static final gdr L = gdr.h(got.e);
   public static final gqy i = new gqy(a, new alb("entity/shulker/shulker"));
   public static final List<gqy> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gqy(a, new alb("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dtk, gqy> k = dtk.a().collect(Collectors.toMap(Function.identity(), gdy::c));
   public static final Map<dtk, gqy> l = dtk.a().collect(Collectors.toMap(Function.identity(), gdy::d));
   public static final gqy m = new gqy(c, new alb("entity/banner/base"));
   public static final gqy n = new gqy(d, new alb("entity/shield/base"));
   private static final Map<alb, gqy> M = new HashMap<>();
   private static final Map<alb, gqy> N = new HashMap<>();
   public static final Map<ala<String>, gqy> o = lp.an.f().stream().collect(Collectors.toMap(Function.identity(), gdy::b));
   public static final gqy[] p = Arrays.stream(ctd.values())
      .sorted(Comparator.comparingInt(ctd::a))
      .map($$0 -> new gqy(b, new alb("entity/bed/" + $$0.b())))
      .toArray(gqy[]::new);
   public static final gqy q = a("trapped");
   public static final gqy r = a("trapped_left");
   public static final gqy s = a("trapped_right");
   public static final gqy t = a("christmas");
   public static final gqy u = a("christmas_left");
   public static final gqy v = a("christmas_right");
   public static final gqy w = a("normal");
   public static final gqy x = a("normal_left");
   public static final gqy y = a("normal_right");
   public static final gqy z = a("ender");

   public static gdr a() {
      return C;
   }

   public static gdr b() {
      return D;
   }

   public static gdr c() {
      return B;
   }

   public static gdr d() {
      return A;
   }

   public static gdr e() {
      return E;
   }

   public static gdr f() {
      return E;
   }

   public static gdr g() {
      return F;
   }

   public static gdr a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gdr h() {
      return I;
   }

   public static gdr i() {
      return J;
   }

   public static gdr j() {
      return K;
   }

   public static gdr k() {
      return L;
   }

   private static gqy c(dtk $$0) {
      return new gqy(e, new alb("entity/signs/" + $$0.b()));
   }

   private static gqy d(dtk $$0) {
      return new gqy(e, new alb("entity/signs/hanging/" + $$0.b()));
   }

   public static gqy a(dtk $$0) {
      return k.get($$0);
   }

   public static gqy b(dtk $$0) {
      return l.get($$0);
   }

   public static gqy a(ji<dos> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         alb $$1 = $$0x.d("entity/banner/");
         return new gqy(c, $$1);
      });
   }

   public static gqy b(ji<dos> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alb $$1 = $$0x.d("entity/shield/");
         return new gqy(d, $$1);
      });
   }

   private static gqy a(String $$0) {
      return new gqy(f, new alb("entity/chest/" + $$0));
   }

   private static gqy b(ala<String> $$0) {
      return new gqy(h, dpt.a($$0));
   }

   @Nullable
   public static gqy a(@Nullable ala<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gqy a(dpc $$0, dsp $$1, boolean $$2) {
      if ($$0 instanceof dpx) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dqv ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gqy a(dsp $$0, gqy $$1, gqy $$2, gqy $$3) {
      switch ($$0) {
         case b:
            return $$2;
         case c:
            return $$3;
         case a:
         default:
            return $$1;
      }
   }
}
