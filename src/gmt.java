import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gmt {
   public static final akv a = akv.b("textures/atlas/shulker_boxes.png");
   public static final akv b = akv.b("textures/atlas/beds.png");
   public static final akv c = akv.b("textures/atlas/banner_patterns.png");
   public static final akv d = akv.b("textures/atlas/shield_patterns.png");
   public static final akv e = akv.b("textures/atlas/signs.png");
   public static final akv f = akv.b("textures/atlas/chest.png");
   public static final akv g = akv.b("textures/atlas/armor_trims.png");
   public static final akv h = akv.b("textures/atlas/decorated_pot.png");
   private static final gmi B = gmi.g(a);
   private static final gmi C = gmi.d(b);
   private static final gmi D = gmi.n(c);
   private static final gmi E = gmi.n(d);
   private static final gmi F = gmi.g(e);
   private static final gmi G = gmi.f(f);
   private static final gmi H = gmi.a(g);
   private static final gmi I = gmi.b(g);
   private static final gmi J = gmi.d(her.d);
   private static final gmi K = gmi.f(her.d);
   private static final gmi L = gmi.i(her.d);
   public static final hgz i = b(akv.b("shulker"));
   public static final List<hgz> j = Arrays.stream(cvm.values()).sorted(Comparator.comparingInt(cvm::a)).map(gmt::f).collect(ImmutableList.toImmutableList());
   public static final Map<dyj, hgz> k = dyj.a().collect(Collectors.toMap(Function.identity(), gmt::c));
   public static final Map<dyj, hgz> l = dyj.a().collect(Collectors.toMap(Function.identity(), gmt::d));
   public static final hgz m = new hgz(c, akv.b("entity/banner/base"));
   public static final hgz n = new hgz(d, akv.b("entity/shield/base"));
   private static final Map<akv, hgz> M = new HashMap<>();
   private static final Map<akv, hgz> N = new HashMap<>();
   public static final Map<aku<dur>, hgz> o = mb.ak.c().collect(Collectors.toMap(jr.c::h, $$0 -> f($$0.a().a())));
   public static final hgz p = f(akv.b("decorated_pot_base"));
   public static final hgz q = f(akv.b("decorated_pot_side"));
   private static final hgz[] O = Arrays.stream(cvm.values()).sorted(Comparator.comparingInt(cvm::a)).map(gmt::c).toArray(hgz[]::new);
   public static final hgz r = a("trapped");
   public static final hgz s = a("trapped_left");
   public static final hgz t = a("trapped_right");
   public static final hgz u = a("christmas");
   public static final hgz v = a("christmas_left");
   public static final hgz w = a("christmas_right");
   public static final hgz x = a("normal");
   public static final hgz y = a("normal_left");
   public static final hgz z = a("normal_right");
   public static final hgz A = a("ender");

   public static gmi a() {
      return D;
   }

   public static gmi b() {
      return E;
   }

   public static gmi c() {
      return C;
   }

   public static gmi d() {
      return B;
   }

   public static gmi e() {
      return F;
   }

   public static gmi f() {
      return F;
   }

   public static gmi g() {
      return G;
   }

   public static gmi a(boolean $$0) {
      return $$0 ? I : H;
   }

   public static gmi h() {
      return J;
   }

   public static gmi i() {
      return K;
   }

   public static gmi j() {
      return L;
   }

   public static hgz a(cvm $$0) {
      return O[$$0.a()];
   }

   public static akv b(cvm $$0) {
      return akv.b($$0.b());
   }

   public static hgz c(cvm $$0) {
      return a(b($$0));
   }

   public static hgz a(akv $$0) {
      return new hgz(b, $$0.f("entity/bed/"));
   }

   public static hgz d(cvm $$0) {
      return j.get($$0.a());
   }

   public static akv e(cvm $$0) {
      return akv.b("shulker_" + $$0.b());
   }

   public static hgz f(cvm $$0) {
      return b(e($$0));
   }

   public static hgz b(akv $$0) {
      return new hgz(a, $$0.f("entity/shulker/"));
   }

   private static hgz c(dyj $$0) {
      return c(akv.b($$0.b()));
   }

   public static hgz c(akv $$0) {
      return new hgz(e, $$0.f("entity/signs/"));
   }

   private static hgz d(dyj $$0) {
      return d(akv.b($$0.b()));
   }

   public static hgz d(akv $$0) {
      return new hgz(e, $$0.f("entity/signs/hanging/"));
   }

   public static hgz a(dyj $$0) {
      return k.get($$0);
   }

   public static hgz b(dyj $$0) {
      return l.get($$0);
   }

   public static hgz a(jr<dtp> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         akv $$1 = $$0x.f("entity/banner/");
         return new hgz(c, $$1);
      });
   }

   public static hgz b(jr<dtp> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         akv $$1 = $$0x.f("entity/shield/");
         return new hgz(d, $$1);
      });
   }

   private static hgz a(String $$0) {
      return new hgz(f, akv.b("entity/chest/" + $$0));
   }

   public static hgz e(akv $$0) {
      return new hgz(f, $$0.f("entity/chest/"));
   }

   private static hgz f(akv $$0) {
      return new hgz(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hgz a(@Nullable aku<dur> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hgz a(dtz $$0, dxp $$1, boolean $$2) {
      if ($$0 instanceof duw) {
         return A;
      } else if ($$2) {
         return a($$1, u, v, w);
      } else {
         return $$0 instanceof dvv ? a($$1, r, s, t) : a($$1, x, y, z);
      }
   }

   private static hgz a(dxp $$0, hgz $$1, hgz $$2, hgz $$3) {
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
