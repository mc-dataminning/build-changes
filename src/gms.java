import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gms {
   public static final akv a = akv.b("textures/atlas/shulker_boxes.png");
   public static final akv b = akv.b("textures/atlas/beds.png");
   public static final akv c = akv.b("textures/atlas/banner_patterns.png");
   public static final akv d = akv.b("textures/atlas/shield_patterns.png");
   public static final akv e = akv.b("textures/atlas/signs.png");
   public static final akv f = akv.b("textures/atlas/chest.png");
   public static final akv g = akv.b("textures/atlas/armor_trims.png");
   public static final akv h = akv.b("textures/atlas/decorated_pot.png");
   private static final gmh B = gmh.g(a);
   private static final gmh C = gmh.d(b);
   private static final gmh D = gmh.n(c);
   private static final gmh E = gmh.n(d);
   private static final gmh F = gmh.g(e);
   private static final gmh G = gmh.f(f);
   private static final gmh H = gmh.a(g);
   private static final gmh I = gmh.b(g);
   private static final gmh J = gmh.d(heq.d);
   private static final gmh K = gmh.f(heq.d);
   private static final gmh L = gmh.i(heq.d);
   public static final hgy i = b(akv.b("shulker"));
   public static final List<hgy> j = Arrays.stream(cvl.values()).sorted(Comparator.comparingInt(cvl::a)).map(gms::f).collect(ImmutableList.toImmutableList());
   public static final Map<dyi, hgy> k = dyi.a().collect(Collectors.toMap(Function.identity(), gms::c));
   public static final Map<dyi, hgy> l = dyi.a().collect(Collectors.toMap(Function.identity(), gms::d));
   public static final hgy m = new hgy(c, akv.b("entity/banner/base"));
   public static final hgy n = new hgy(d, akv.b("entity/shield/base"));
   private static final Map<akv, hgy> M = new HashMap<>();
   private static final Map<akv, hgy> N = new HashMap<>();
   public static final Map<aku<duq>, hgy> o = mb.ak.c().collect(Collectors.toMap(jr.c::h, $$0 -> f($$0.a().a())));
   public static final hgy p = f(akv.b("decorated_pot_base"));
   public static final hgy q = f(akv.b("decorated_pot_side"));
   private static final hgy[] O = Arrays.stream(cvl.values()).sorted(Comparator.comparingInt(cvl::a)).map(gms::c).toArray(hgy[]::new);
   public static final hgy r = a("trapped");
   public static final hgy s = a("trapped_left");
   public static final hgy t = a("trapped_right");
   public static final hgy u = a("christmas");
   public static final hgy v = a("christmas_left");
   public static final hgy w = a("christmas_right");
   public static final hgy x = a("normal");
   public static final hgy y = a("normal_left");
   public static final hgy z = a("normal_right");
   public static final hgy A = a("ender");

   public static gmh a() {
      return D;
   }

   public static gmh b() {
      return E;
   }

   public static gmh c() {
      return C;
   }

   public static gmh d() {
      return B;
   }

   public static gmh e() {
      return F;
   }

   public static gmh f() {
      return F;
   }

   public static gmh g() {
      return G;
   }

   public static gmh a(boolean $$0) {
      return $$0 ? I : H;
   }

   public static gmh h() {
      return J;
   }

   public static gmh i() {
      return K;
   }

   public static gmh j() {
      return L;
   }

   public static hgy a(cvl $$0) {
      return O[$$0.a()];
   }

   public static akv b(cvl $$0) {
      return akv.b($$0.b());
   }

   public static hgy c(cvl $$0) {
      return a(b($$0));
   }

   public static hgy a(akv $$0) {
      return new hgy(b, $$0.f("entity/bed/"));
   }

   public static hgy d(cvl $$0) {
      return j.get($$0.a());
   }

   public static akv e(cvl $$0) {
      return akv.b("shulker_" + $$0.b());
   }

   public static hgy f(cvl $$0) {
      return b(e($$0));
   }

   public static hgy b(akv $$0) {
      return new hgy(a, $$0.f("entity/shulker/"));
   }

   private static hgy c(dyi $$0) {
      return c(akv.b($$0.b()));
   }

   public static hgy c(akv $$0) {
      return new hgy(e, $$0.f("entity/signs/"));
   }

   private static hgy d(dyi $$0) {
      return d(akv.b($$0.b()));
   }

   public static hgy d(akv $$0) {
      return new hgy(e, $$0.f("entity/signs/hanging/"));
   }

   public static hgy a(dyi $$0) {
      return k.get($$0);
   }

   public static hgy b(dyi $$0) {
      return l.get($$0);
   }

   public static hgy a(jr<dto> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         akv $$1 = $$0x.f("entity/banner/");
         return new hgy(c, $$1);
      });
   }

   public static hgy b(jr<dto> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         akv $$1 = $$0x.f("entity/shield/");
         return new hgy(d, $$1);
      });
   }

   private static hgy a(String $$0) {
      return new hgy(f, akv.b("entity/chest/" + $$0));
   }

   public static hgy e(akv $$0) {
      return new hgy(f, $$0.f("entity/chest/"));
   }

   private static hgy f(akv $$0) {
      return new hgy(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hgy a(@Nullable aku<duq> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hgy a(dty $$0, dxo $$1, boolean $$2) {
      if ($$0 instanceof duv) {
         return A;
      } else if ($$2) {
         return a($$1, u, v, w);
      } else {
         return $$0 instanceof dvu ? a($$1, r, s, t) : a($$1, x, y, z);
      }
   }

   private static hgy a(dxo $$0, hgy $$1, hgy $$2, hgy $$3) {
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
