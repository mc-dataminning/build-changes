import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gsu {
   public static final ali a = ali.b("textures/atlas/shulker_boxes.png");
   public static final ali b = ali.b("textures/atlas/beds.png");
   public static final ali c = ali.b("textures/atlas/banner_patterns.png");
   public static final ali d = ali.b("textures/atlas/shield_patterns.png");
   public static final ali e = ali.b("textures/atlas/signs.png");
   public static final ali f = ali.b("textures/atlas/chest.png");
   public static final ali g = ali.b("textures/atlas/armor_trims.png");
   public static final ali h = ali.b("textures/atlas/decorated_pot.png");
   private static final gsl L = gsl.g(a);
   private static final gsl M = gsl.d(b);
   private static final gsl N = gsl.n(c);
   private static final gsl O = gsl.n(d);
   private static final gsl P = gsl.g(e);
   private static final gsl Q = gsl.f(f);
   private static final gsl R = gsl.a(g);
   private static final gsl S = gsl.b(g);
   private static final gsl T = gsl.d(hkz.c);
   private static final gsl U = gsl.f(hkz.c);
   private static final gsl V = gsl.i(hkz.c);
   public static final grz i = new grz(hkz.c, "item");
   public static final grz j = new grz(hkz.c, "block");
   public static final grz k = new grz(c, "entity/banner");
   public static final grz l = new grz(d, "entity/shield");
   public static final grz m = new grz(f, "entity/chest");
   public static final grz n = new grz(h, "entity/decorated_pot");
   public static final grz o = new grz(b, "entity/bed");
   public static final grz p = new grz(a, "entity/shulker");
   public static final grz q = new grz(e, "entity/signs");
   public static final grz r = new grz(e, "entity/signs/hanging");
   public static final hnh s = p.a("shulker");
   public static final List<hnh> t = Arrays.stream(cyw.values()).sorted(Comparator.comparingInt(cyw::a)).map(gsu::f).collect(ImmutableList.toImmutableList());
   public static final Map<ecs, hnh> u = ecs.a().collect(Collectors.toMap(Function.identity(), gsu::c));
   public static final Map<ecs, hnh> v = ecs.a().collect(Collectors.toMap(Function.identity(), gsu::d));
   public static final hnh w = k.a("base");
   public static final hnh x = l.a("base");
   private static final Map<ali, hnh> W = new HashMap<>();
   private static final Map<ali, hnh> X = new HashMap<>();
   public static final Map<alh<dyv>, hnh> y = mg.ai.c().collect(Collectors.toMap(jf.c::h, $$0 -> n.a($$0.a().a())));
   public static final hnh z = n.a("decorated_pot_base");
   public static final hnh A = n.a("decorated_pot_side");
   private static final hnh[] Y = Arrays.stream(cyw.values()).sorted(Comparator.comparingInt(cyw::a)).map(gsu::c).toArray(hnh[]::new);
   public static final hnh B = m.a("trapped");
   public static final hnh C = m.a("trapped_left");
   public static final hnh D = m.a("trapped_right");
   public static final hnh E = m.a("christmas");
   public static final hnh F = m.a("christmas_left");
   public static final hnh G = m.a("christmas_right");
   public static final hnh H = m.a("normal");
   public static final hnh I = m.a("normal_left");
   public static final hnh J = m.a("normal_right");
   public static final hnh K = m.a("ender");

   public static gsl a() {
      return N;
   }

   public static gsl b() {
      return O;
   }

   public static gsl c() {
      return M;
   }

   public static gsl d() {
      return L;
   }

   public static gsl e() {
      return P;
   }

   public static gsl f() {
      return P;
   }

   public static gsl g() {
      return Q;
   }

   public static gsl a(boolean $$0) {
      return $$0 ? S : R;
   }

   public static gsl h() {
      return T;
   }

   public static gsl i() {
      return U;
   }

   public static gsl j() {
      return V;
   }

   public static hnh a(cyw $$0) {
      return Y[$$0.a()];
   }

   public static ali b(cyw $$0) {
      return ali.b($$0.b());
   }

   public static hnh c(cyw $$0) {
      return o.a(b($$0));
   }

   public static hnh d(cyw $$0) {
      return t.get($$0.a());
   }

   public static ali e(cyw $$0) {
      return ali.b("shulker_" + $$0.b());
   }

   public static hnh f(cyw $$0) {
      return p.a(e($$0));
   }

   private static hnh c(ecs $$0) {
      return q.a($$0.b());
   }

   private static hnh d(ecs $$0) {
      return r.a($$0.b());
   }

   public static hnh a(ecs $$0) {
      return u.get($$0);
   }

   public static hnh b(ecs $$0) {
      return v.get($$0);
   }

   public static hnh a(jf<dxr> $$0) {
      return W.computeIfAbsent($$0.a().a(), k::a);
   }

   public static hnh b(jf<dxr> $$0) {
      return X.computeIfAbsent($$0.a().a(), l::a);
   }

   @Nullable
   public static hnh a(@Nullable alh<dyv> $$0) {
      return $$0 == null ? null : y.get($$0);
   }

   public static hnh a(dyc $$0, ebw $$1, boolean $$2) {
      if ($$0 instanceof dza) {
         return K;
      } else if ($$2) {
         return a($$1, E, F, G);
      } else {
         return $$0 instanceof eab ? a($$1, B, C, D) : a($$1, H, I, J);
      }
   }

   private static hnh a(ebw $$0, hnh $$1, hnh $$2, hnh $$3) {
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
