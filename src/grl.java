import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class grl {
   public static final alg a = alg.b("textures/atlas/shulker_boxes.png");
   public static final alg b = alg.b("textures/atlas/beds.png");
   public static final alg c = alg.b("textures/atlas/banner_patterns.png");
   public static final alg d = alg.b("textures/atlas/shield_patterns.png");
   public static final alg e = alg.b("textures/atlas/signs.png");
   public static final alg f = alg.b("textures/atlas/chest.png");
   public static final alg g = alg.b("textures/atlas/armor_trims.png");
   public static final alg h = alg.b("textures/atlas/decorated_pot.png");
   private static final grc L = grc.g(a);
   private static final grc M = grc.d(b);
   private static final grc N = grc.n(c);
   private static final grc O = grc.n(d);
   private static final grc P = grc.g(e);
   private static final grc Q = grc.f(f);
   private static final grc R = grc.a(g);
   private static final grc S = grc.b(g);
   private static final grc T = grc.d(hjp.c);
   private static final grc U = grc.f(hjp.c);
   private static final grc V = grc.i(hjp.c);
   public static final gqq i = new gqq(hjp.c, "item");
   public static final gqq j = new gqq(hjp.c, "block");
   public static final gqq k = new gqq(c, "entity/banner");
   public static final gqq l = new gqq(d, "entity/shield");
   public static final gqq m = new gqq(f, "entity/chest");
   public static final gqq n = new gqq(h, "entity/decorated_pot");
   public static final gqq o = new gqq(b, "entity/bed");
   public static final gqq p = new gqq(a, "entity/shulker");
   public static final gqq q = new gqq(e, "entity/signs");
   public static final gqq r = new gqq(e, "entity/signs/hanging");
   public static final hlx s = p.a("shulker");
   public static final List<hlx> t = Arrays.stream(cyl.values()).sorted(Comparator.comparingInt(cyl::a)).map(grl::f).collect(ImmutableList.toImmutableList());
   public static final Map<ech, hlx> u = ech.a().collect(Collectors.toMap(Function.identity(), grl::c));
   public static final Map<ech, hlx> v = ech.a().collect(Collectors.toMap(Function.identity(), grl::d));
   public static final hlx w = k.a("base");
   public static final hlx x = l.a("base");
   private static final Map<alg, hlx> W = new HashMap<>();
   private static final Map<alg, hlx> X = new HashMap<>();
   public static final Map<alf<dyk>, hlx> y = mg.ai.c().collect(Collectors.toMap(jf.c::h, $$0 -> n.a($$0.a().a())));
   public static final hlx z = n.a("decorated_pot_base");
   public static final hlx A = n.a("decorated_pot_side");
   private static final hlx[] Y = Arrays.stream(cyl.values()).sorted(Comparator.comparingInt(cyl::a)).map(grl::c).toArray(hlx[]::new);
   public static final hlx B = m.a("trapped");
   public static final hlx C = m.a("trapped_left");
   public static final hlx D = m.a("trapped_right");
   public static final hlx E = m.a("christmas");
   public static final hlx F = m.a("christmas_left");
   public static final hlx G = m.a("christmas_right");
   public static final hlx H = m.a("normal");
   public static final hlx I = m.a("normal_left");
   public static final hlx J = m.a("normal_right");
   public static final hlx K = m.a("ender");

   public static grc a() {
      return N;
   }

   public static grc b() {
      return O;
   }

   public static grc c() {
      return M;
   }

   public static grc d() {
      return L;
   }

   public static grc e() {
      return P;
   }

   public static grc f() {
      return P;
   }

   public static grc g() {
      return Q;
   }

   public static grc a(boolean $$0) {
      return $$0 ? S : R;
   }

   public static grc h() {
      return T;
   }

   public static grc i() {
      return U;
   }

   public static grc j() {
      return V;
   }

   public static hlx a(cyl $$0) {
      return Y[$$0.a()];
   }

   public static alg b(cyl $$0) {
      return alg.b($$0.b());
   }

   public static hlx c(cyl $$0) {
      return o.a(b($$0));
   }

   public static hlx d(cyl $$0) {
      return t.get($$0.a());
   }

   public static alg e(cyl $$0) {
      return alg.b("shulker_" + $$0.b());
   }

   public static hlx f(cyl $$0) {
      return p.a(e($$0));
   }

   private static hlx c(ech $$0) {
      return q.a($$0.b());
   }

   private static hlx d(ech $$0) {
      return r.a($$0.b());
   }

   public static hlx a(ech $$0) {
      return u.get($$0);
   }

   public static hlx b(ech $$0) {
      return v.get($$0);
   }

   public static hlx a(jf<dxg> $$0) {
      return W.computeIfAbsent($$0.a().a(), k::a);
   }

   public static hlx b(jf<dxg> $$0) {
      return X.computeIfAbsent($$0.a().a(), l::a);
   }

   @Nullable
   public static hlx a(@Nullable alf<dyk> $$0) {
      return $$0 == null ? null : y.get($$0);
   }

   public static hlx a(dxr $$0, ebl $$1, boolean $$2) {
      if ($$0 instanceof dyp) {
         return K;
      } else if ($$2) {
         return a($$1, E, F, G);
      } else {
         return $$0 instanceof dzq ? a($$1, B, C, D) : a($$1, H, I, J);
      }
   }

   private static hlx a(ebl $$0, hlx $$1, hlx $$2, hlx $$3) {
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
