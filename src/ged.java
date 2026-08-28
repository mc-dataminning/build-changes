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

public class ged {
   public static final alf a = new alf("textures/atlas/shulker_boxes.png");
   public static final alf b = new alf("textures/atlas/beds.png");
   public static final alf c = new alf("textures/atlas/banner_patterns.png");
   public static final alf d = new alf("textures/atlas/shield_patterns.png");
   public static final alf e = new alf("textures/atlas/signs.png");
   public static final alf f = new alf("textures/atlas/chest.png");
   public static final alf g = new alf("textures/atlas/armor_trims.png");
   public static final alf h = new alf("textures/atlas/decorated_pot.png");
   private static final gdw A = gdw.e(a);
   private static final gdw B = gdw.c(b);
   private static final gdw C = gdw.m(c);
   private static final gdw D = gdw.m(d);
   private static final gdw E = gdw.e(e);
   private static final gdw F = gdw.d(f);
   private static final gdw G = gdw.a(g);
   private static final gdw H = gdw.b(g);
   private static final gdw I = gdw.c(goy.e);
   private static final gdw J = gdw.d(goy.e);
   private static final gdw K = gdw.g(goy.e);
   private static final gdw L = gdw.h(goy.e);
   public static final grd i = new grd(a, new alf("entity/shulker/shulker"));
   public static final List<grd> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new grd(a, new alf("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dtp, grd> k = dtp.a().collect(Collectors.toMap(Function.identity(), ged::c));
   public static final Map<dtp, grd> l = dtp.a().collect(Collectors.toMap(Function.identity(), ged::d));
   public static final grd m = new grd(c, new alf("entity/banner/base"));
   public static final grd n = new grd(d, new alf("entity/shield/base"));
   private static final Map<alf, grd> M = new HashMap<>();
   private static final Map<alf, grd> N = new HashMap<>();
   public static final Map<ale<String>, grd> o = lp.an.f().stream().collect(Collectors.toMap(Function.identity(), ged::b));
   public static final grd[] p = Arrays.stream(cti.values())
      .sorted(Comparator.comparingInt(cti::a))
      .map($$0 -> new grd(b, new alf("entity/bed/" + $$0.b())))
      .toArray(grd[]::new);
   public static final grd q = a("trapped");
   public static final grd r = a("trapped_left");
   public static final grd s = a("trapped_right");
   public static final grd t = a("christmas");
   public static final grd u = a("christmas_left");
   public static final grd v = a("christmas_right");
   public static final grd w = a("normal");
   public static final grd x = a("normal_left");
   public static final grd y = a("normal_right");
   public static final grd z = a("ender");

   public static gdw a() {
      return C;
   }

   public static gdw b() {
      return D;
   }

   public static gdw c() {
      return B;
   }

   public static gdw d() {
      return A;
   }

   public static gdw e() {
      return E;
   }

   public static gdw f() {
      return E;
   }

   public static gdw g() {
      return F;
   }

   public static gdw a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gdw h() {
      return I;
   }

   public static gdw i() {
      return J;
   }

   public static gdw j() {
      return K;
   }

   public static gdw k() {
      return L;
   }

   private static grd c(dtp $$0) {
      return new grd(e, new alf("entity/signs/" + $$0.b()));
   }

   private static grd d(dtp $$0) {
      return new grd(e, new alf("entity/signs/hanging/" + $$0.b()));
   }

   public static grd a(dtp $$0) {
      return k.get($$0);
   }

   public static grd b(dtp $$0) {
      return l.get($$0);
   }

   public static grd a(ji<dox> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         alf $$1 = $$0x.d("entity/banner/");
         return new grd(c, $$1);
      });
   }

   public static grd b(ji<dox> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alf $$1 = $$0x.d("entity/shield/");
         return new grd(d, $$1);
      });
   }

   private static grd a(String $$0) {
      return new grd(f, new alf("entity/chest/" + $$0));
   }

   private static grd b(ale<String> $$0) {
      return new grd(h, dpy.a($$0));
   }

   @Nullable
   public static grd a(@Nullable ale<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static grd a(dph $$0, dsu $$1, boolean $$2) {
      if ($$0 instanceof dqc) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dra ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static grd a(dsu $$0, grd $$1, grd $$2, grd $$3) {
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
