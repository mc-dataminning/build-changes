import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gqn {
   public static final alg a = alg.b("textures/atlas/shulker_boxes.png");
   public static final alg b = alg.b("textures/atlas/beds.png");
   public static final alg c = alg.b("textures/atlas/banner_patterns.png");
   public static final alg d = alg.b("textures/atlas/shield_patterns.png");
   public static final alg e = alg.b("textures/atlas/signs.png");
   public static final alg f = alg.b("textures/atlas/chest.png");
   public static final alg g = alg.b("textures/atlas/armor_trims.png");
   public static final alg h = alg.b("textures/atlas/decorated_pot.png");
   private static final gqc L = gqc.g(a);
   private static final gqc M = gqc.d(b);
   private static final gqc N = gqc.n(c);
   private static final gqc O = gqc.n(d);
   private static final gqc P = gqc.g(e);
   private static final gqc Q = gqc.f(f);
   private static final gqc R = gqc.a(g);
   private static final gqc S = gqc.b(g);
   private static final gqc T = gqc.d(hio.d);
   private static final gqc U = gqc.f(hio.d);
   private static final gqc V = gqc.i(hio.d);
   public static final gpr i = new gpr(hio.d, "item");
   public static final gpr j = new gpr(hio.d, "block");
   public static final gpr k = new gpr(c, "entity/banner");
   public static final gpr l = new gpr(d, "entity/shield");
   public static final gpr m = new gpr(f, "entity/chest");
   public static final gpr n = new gpr(h, "entity/decorated_pot");
   public static final gpr o = new gpr(b, "entity/bed");
   public static final gpr p = new gpr(a, "entity/shulker");
   public static final gpr q = new gpr(e, "entity/signs");
   public static final gpr r = new gpr(e, "entity/signs/hanging");
   public static final hkw s = p.a("shulker");
   public static final List<hkw> t = Arrays.stream(cxw.values()).sorted(Comparator.comparingInt(cxw::a)).map(gqn::f).collect(ImmutableList.toImmutableList());
   public static final Map<ebn, hkw> u = ebn.a().collect(Collectors.toMap(Function.identity(), gqn::c));
   public static final Map<ebn, hkw> v = ebn.a().collect(Collectors.toMap(Function.identity(), gqn::d));
   public static final hkw w = k.a("base");
   public static final hkw x = l.a("base");
   private static final Map<alg, hkw> W = new HashMap<>();
   private static final Map<alg, hkw> X = new HashMap<>();
   public static final Map<alf<dxq>, hkw> y = mf.ai.c().collect(Collectors.toMap(je.c::h, $$0 -> n.a($$0.a().a())));
   public static final hkw z = n.a("decorated_pot_base");
   public static final hkw A = n.a("decorated_pot_side");
   private static final hkw[] Y = Arrays.stream(cxw.values()).sorted(Comparator.comparingInt(cxw::a)).map(gqn::c).toArray(hkw[]::new);
   public static final hkw B = m.a("trapped");
   public static final hkw C = m.a("trapped_left");
   public static final hkw D = m.a("trapped_right");
   public static final hkw E = m.a("christmas");
   public static final hkw F = m.a("christmas_left");
   public static final hkw G = m.a("christmas_right");
   public static final hkw H = m.a("normal");
   public static final hkw I = m.a("normal_left");
   public static final hkw J = m.a("normal_right");
   public static final hkw K = m.a("ender");

   public static gqc a() {
      return N;
   }

   public static gqc b() {
      return O;
   }

   public static gqc c() {
      return M;
   }

   public static gqc d() {
      return L;
   }

   public static gqc e() {
      return P;
   }

   public static gqc f() {
      return P;
   }

   public static gqc g() {
      return Q;
   }

   public static gqc a(boolean $$0) {
      return $$0 ? S : R;
   }

   public static gqc h() {
      return T;
   }

   public static gqc i() {
      return U;
   }

   public static gqc j() {
      return V;
   }

   public static hkw a(cxw $$0) {
      return Y[$$0.a()];
   }

   public static alg b(cxw $$0) {
      return alg.b($$0.b());
   }

   public static hkw c(cxw $$0) {
      return o.a(b($$0));
   }

   public static hkw d(cxw $$0) {
      return t.get($$0.a());
   }

   public static alg e(cxw $$0) {
      return alg.b("shulker_" + $$0.b());
   }

   public static hkw f(cxw $$0) {
      return p.a(e($$0));
   }

   private static hkw c(ebn $$0) {
      return q.a($$0.b());
   }

   private static hkw d(ebn $$0) {
      return r.a($$0.b());
   }

   public static hkw a(ebn $$0) {
      return u.get($$0);
   }

   public static hkw b(ebn $$0) {
      return v.get($$0);
   }

   public static hkw a(je<dwm> $$0) {
      return W.computeIfAbsent($$0.a().a(), k::a);
   }

   public static hkw b(je<dwm> $$0) {
      return X.computeIfAbsent($$0.a().a(), l::a);
   }

   @Nullable
   public static hkw a(@Nullable alf<dxq> $$0) {
      return $$0 == null ? null : y.get($$0);
   }

   public static hkw a(dwx $$0, ear $$1, boolean $$2) {
      if ($$0 instanceof dxv) {
         return K;
      } else if ($$2) {
         return a($$1, E, F, G);
      } else {
         return $$0 instanceof dyw ? a($$1, B, C, D) : a($$1, H, I, J);
      }
   }

   private static hkw a(ear $$0, hkw $$1, hkw $$2, hkw $$3) {
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
