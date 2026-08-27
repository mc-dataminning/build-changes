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

public class gcd {
   public static final akh a = new akh("textures/atlas/shulker_boxes.png");
   public static final akh b = new akh("textures/atlas/beds.png");
   public static final akh c = new akh("textures/atlas/banner_patterns.png");
   public static final akh d = new akh("textures/atlas/shield_patterns.png");
   public static final akh e = new akh("textures/atlas/signs.png");
   public static final akh f = new akh("textures/atlas/chest.png");
   public static final akh g = new akh("textures/atlas/armor_trims.png");
   public static final akh h = new akh("textures/atlas/decorated_pot.png");
   private static final gbw A = gbw.e(a);
   private static final gbw B = gbw.c(b);
   private static final gbw C = gbw.m(c);
   private static final gbw D = gbw.m(d);
   private static final gbw E = gbw.e(e);
   private static final gbw F = gbw.d(f);
   private static final gbw G = gbw.a(g);
   private static final gbw H = gbw.b(g);
   private static final gbw I = gbw.c(gmx.e);
   private static final gbw J = gbw.d(gmx.e);
   private static final gbw K = gbw.g(gmx.e);
   private static final gbw L = gbw.h(gmx.e);
   public static final gpc i = new gpc(a, new akh("entity/shulker/shulker"));
   public static final List<gpc> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gpc(a, new akh("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dru, gpc> k = dru.a().collect(Collectors.toMap(Function.identity(), gcd::c));
   public static final Map<dru, gpc> l = dru.a().collect(Collectors.toMap(Function.identity(), gcd::d));
   public static final gpc m = new gpc(c, new akh("entity/banner/base"));
   public static final gpc n = new gpc(d, new akh("entity/shield/base"));
   private static final Map<akh, gpc> M = new HashMap<>();
   private static final Map<akh, gpc> N = new HashMap<>();
   public static final Map<akg<String>, gpc> o = ld.an.f().stream().collect(Collectors.toMap(Function.identity(), gcd::b));
   public static final gpc[] p = Arrays.stream(crs.values())
      .sorted(Comparator.comparingInt(crs::a))
      .map($$0 -> new gpc(b, new akh("entity/bed/" + $$0.b())))
      .toArray(gpc[]::new);
   public static final gpc q = a("trapped");
   public static final gpc r = a("trapped_left");
   public static final gpc s = a("trapped_right");
   public static final gpc t = a("christmas");
   public static final gpc u = a("christmas_left");
   public static final gpc v = a("christmas_right");
   public static final gpc w = a("normal");
   public static final gpc x = a("normal_left");
   public static final gpc y = a("normal_right");
   public static final gpc z = a("ender");

   public static gbw a() {
      return C;
   }

   public static gbw b() {
      return D;
   }

   public static gbw c() {
      return B;
   }

   public static gbw d() {
      return A;
   }

   public static gbw e() {
      return E;
   }

   public static gbw f() {
      return E;
   }

   public static gbw g() {
      return F;
   }

   public static gbw a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gbw h() {
      return I;
   }

   public static gbw i() {
      return J;
   }

   public static gbw j() {
      return K;
   }

   public static gbw k() {
      return L;
   }

   private static gpc c(dru $$0) {
      return new gpc(e, new akh("entity/signs/" + $$0.b()));
   }

   private static gpc d(dru $$0) {
      return new gpc(e, new akh("entity/signs/hanging/" + $$0.b()));
   }

   public static gpc a(dru $$0) {
      return k.get($$0);
   }

   public static gpc b(dru $$0) {
      return l.get($$0);
   }

   public static gpc a(iw<dnc> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         akh $$1 = $$0x.d("entity/banner/");
         return new gpc(c, $$1);
      });
   }

   public static gpc b(iw<dnc> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         akh $$1 = $$0x.d("entity/shield/");
         return new gpc(d, $$1);
      });
   }

   private static gpc a(String $$0) {
      return new gpc(f, new akh("entity/chest/" + $$0));
   }

   private static gpc b(akg<String> $$0) {
      return new gpc(h, dod.a($$0));
   }

   @Nullable
   public static gpc a(@Nullable akg<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gpc a(dnm $$0, dqz $$1, boolean $$2) {
      if ($$0 instanceof doh) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dpf ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gpc a(dqz $$0, gpc $$1, gpc $$2, gpc $$3) {
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
