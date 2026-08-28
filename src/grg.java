import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class grg {
   public static final alg a = alg.b("textures/atlas/shulker_boxes.png");
   public static final alg b = alg.b("textures/atlas/beds.png");
   public static final alg c = alg.b("textures/atlas/banner_patterns.png");
   public static final alg d = alg.b("textures/atlas/shield_patterns.png");
   public static final alg e = alg.b("textures/atlas/signs.png");
   public static final alg f = alg.b("textures/atlas/chest.png");
   public static final alg g = alg.b("textures/atlas/armor_trims.png");
   public static final alg h = alg.b("textures/atlas/decorated_pot.png");
   private static final gqx L = gqx.g(a);
   private static final gqx M = gqx.d(b);
   private static final gqx N = gqx.n(c);
   private static final gqx O = gqx.n(d);
   private static final gqx P = gqx.g(e);
   private static final gqx Q = gqx.f(f);
   private static final gqx R = gqx.a(g);
   private static final gqx S = gqx.b(g);
   private static final gqx T = gqx.d(hjj.c);
   private static final gqx U = gqx.f(hjj.c);
   private static final gqx V = gqx.i(hjj.c);
   public static final gql i = new gql(hjj.c, "item");
   public static final gql j = new gql(hjj.c, "block");
   public static final gql k = new gql(c, "entity/banner");
   public static final gql l = new gql(d, "entity/shield");
   public static final gql m = new gql(f, "entity/chest");
   public static final gql n = new gql(h, "entity/decorated_pot");
   public static final gql o = new gql(b, "entity/bed");
   public static final gql p = new gql(a, "entity/shulker");
   public static final gql q = new gql(e, "entity/signs");
   public static final gql r = new gql(e, "entity/signs/hanging");
   public static final hlq s = p.a("shulker");
   public static final List<hlq> t = Arrays.stream(cyi.values()).sorted(Comparator.comparingInt(cyi::a)).map(grg::f).collect(ImmutableList.toImmutableList());
   public static final Map<ecc, hlq> u = ecc.a().collect(Collectors.toMap(Function.identity(), grg::c));
   public static final Map<ecc, hlq> v = ecc.a().collect(Collectors.toMap(Function.identity(), grg::d));
   public static final hlq w = k.a("base");
   public static final hlq x = l.a("base");
   private static final Map<alg, hlq> W = new HashMap<>();
   private static final Map<alg, hlq> X = new HashMap<>();
   public static final Map<alf<dyf>, hlq> y = mg.ai.c().collect(Collectors.toMap(jf.c::h, $$0 -> n.a($$0.a().a())));
   public static final hlq z = n.a("decorated_pot_base");
   public static final hlq A = n.a("decorated_pot_side");
   private static final hlq[] Y = Arrays.stream(cyi.values()).sorted(Comparator.comparingInt(cyi::a)).map(grg::c).toArray(hlq[]::new);
   public static final hlq B = m.a("trapped");
   public static final hlq C = m.a("trapped_left");
   public static final hlq D = m.a("trapped_right");
   public static final hlq E = m.a("christmas");
   public static final hlq F = m.a("christmas_left");
   public static final hlq G = m.a("christmas_right");
   public static final hlq H = m.a("normal");
   public static final hlq I = m.a("normal_left");
   public static final hlq J = m.a("normal_right");
   public static final hlq K = m.a("ender");

   public static gqx a() {
      return N;
   }

   public static gqx b() {
      return O;
   }

   public static gqx c() {
      return M;
   }

   public static gqx d() {
      return L;
   }

   public static gqx e() {
      return P;
   }

   public static gqx f() {
      return P;
   }

   public static gqx g() {
      return Q;
   }

   public static gqx a(boolean $$0) {
      return $$0 ? S : R;
   }

   public static gqx h() {
      return T;
   }

   public static gqx i() {
      return U;
   }

   public static gqx j() {
      return V;
   }

   public static hlq a(cyi $$0) {
      return Y[$$0.a()];
   }

   public static alg b(cyi $$0) {
      return alg.b($$0.b());
   }

   public static hlq c(cyi $$0) {
      return o.a(b($$0));
   }

   public static hlq d(cyi $$0) {
      return t.get($$0.a());
   }

   public static alg e(cyi $$0) {
      return alg.b("shulker_" + $$0.b());
   }

   public static hlq f(cyi $$0) {
      return p.a(e($$0));
   }

   private static hlq c(ecc $$0) {
      return q.a($$0.b());
   }

   private static hlq d(ecc $$0) {
      return r.a($$0.b());
   }

   public static hlq a(ecc $$0) {
      return u.get($$0);
   }

   public static hlq b(ecc $$0) {
      return v.get($$0);
   }

   public static hlq a(jf<dxb> $$0) {
      return W.computeIfAbsent($$0.a().a(), k::a);
   }

   public static hlq b(jf<dxb> $$0) {
      return X.computeIfAbsent($$0.a().a(), l::a);
   }

   @Nullable
   public static hlq a(@Nullable alf<dyf> $$0) {
      return $$0 == null ? null : y.get($$0);
   }

   public static hlq a(dxm $$0, ebg $$1, boolean $$2) {
      if ($$0 instanceof dyk) {
         return K;
      } else if ($$2) {
         return a($$1, E, F, G);
      } else {
         return $$0 instanceof dzl ? a($$1, B, C, D) : a($$1, H, I, J);
      }
   }

   private static hlq a(ebg $$0, hlq $$1, hlq $$2, hlq $$3) {
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
