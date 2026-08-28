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

public class gee {
   public static final alf a = new alf("textures/atlas/shulker_boxes.png");
   public static final alf b = new alf("textures/atlas/beds.png");
   public static final alf c = new alf("textures/atlas/banner_patterns.png");
   public static final alf d = new alf("textures/atlas/shield_patterns.png");
   public static final alf e = new alf("textures/atlas/signs.png");
   public static final alf f = new alf("textures/atlas/chest.png");
   public static final alf g = new alf("textures/atlas/armor_trims.png");
   public static final alf h = new alf("textures/atlas/decorated_pot.png");
   private static final gdx A = gdx.e(a);
   private static final gdx B = gdx.c(b);
   private static final gdx C = gdx.m(c);
   private static final gdx D = gdx.m(d);
   private static final gdx E = gdx.e(e);
   private static final gdx F = gdx.d(f);
   private static final gdx G = gdx.a(g);
   private static final gdx H = gdx.b(g);
   private static final gdx I = gdx.c(goz.e);
   private static final gdx J = gdx.d(goz.e);
   private static final gdx K = gdx.g(goz.e);
   private static final gdx L = gdx.h(goz.e);
   public static final gre i = new gre(a, new alf("entity/shulker/shulker"));
   public static final List<gre> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gre(a, new alf("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dtq, gre> k = dtq.a().collect(Collectors.toMap(Function.identity(), gee::c));
   public static final Map<dtq, gre> l = dtq.a().collect(Collectors.toMap(Function.identity(), gee::d));
   public static final gre m = new gre(c, new alf("entity/banner/base"));
   public static final gre n = new gre(d, new alf("entity/shield/base"));
   private static final Map<alf, gre> M = new HashMap<>();
   private static final Map<alf, gre> N = new HashMap<>();
   public static final Map<ale<String>, gre> o = lp.an.f().stream().collect(Collectors.toMap(Function.identity(), gee::b));
   public static final gre[] p = Arrays.stream(ctj.values())
      .sorted(Comparator.comparingInt(ctj::a))
      .map($$0 -> new gre(b, new alf("entity/bed/" + $$0.b())))
      .toArray(gre[]::new);
   public static final gre q = a("trapped");
   public static final gre r = a("trapped_left");
   public static final gre s = a("trapped_right");
   public static final gre t = a("christmas");
   public static final gre u = a("christmas_left");
   public static final gre v = a("christmas_right");
   public static final gre w = a("normal");
   public static final gre x = a("normal_left");
   public static final gre y = a("normal_right");
   public static final gre z = a("ender");

   public static gdx a() {
      return C;
   }

   public static gdx b() {
      return D;
   }

   public static gdx c() {
      return B;
   }

   public static gdx d() {
      return A;
   }

   public static gdx e() {
      return E;
   }

   public static gdx f() {
      return E;
   }

   public static gdx g() {
      return F;
   }

   public static gdx a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gdx h() {
      return I;
   }

   public static gdx i() {
      return J;
   }

   public static gdx j() {
      return K;
   }

   public static gdx k() {
      return L;
   }

   private static gre c(dtq $$0) {
      return new gre(e, new alf("entity/signs/" + $$0.b()));
   }

   private static gre d(dtq $$0) {
      return new gre(e, new alf("entity/signs/hanging/" + $$0.b()));
   }

   public static gre a(dtq $$0) {
      return k.get($$0);
   }

   public static gre b(dtq $$0) {
      return l.get($$0);
   }

   public static gre a(ji<doy> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         alf $$1 = $$0x.d("entity/banner/");
         return new gre(c, $$1);
      });
   }

   public static gre b(ji<doy> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alf $$1 = $$0x.d("entity/shield/");
         return new gre(d, $$1);
      });
   }

   private static gre a(String $$0) {
      return new gre(f, new alf("entity/chest/" + $$0));
   }

   private static gre b(ale<String> $$0) {
      return new gre(h, dpz.a($$0));
   }

   @Nullable
   public static gre a(@Nullable ale<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gre a(dpi $$0, dsv $$1, boolean $$2) {
      if ($$0 instanceof dqd) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof drb ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gre a(dsv $$0, gre $$1, gre $$2, gre $$3) {
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
