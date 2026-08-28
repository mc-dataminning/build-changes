import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gqv {
   public static final alg a = alg.b("textures/atlas/shulker_boxes.png");
   public static final alg b = alg.b("textures/atlas/beds.png");
   public static final alg c = alg.b("textures/atlas/banner_patterns.png");
   public static final alg d = alg.b("textures/atlas/shield_patterns.png");
   public static final alg e = alg.b("textures/atlas/signs.png");
   public static final alg f = alg.b("textures/atlas/chest.png");
   public static final alg g = alg.b("textures/atlas/armor_trims.png");
   public static final alg h = alg.b("textures/atlas/decorated_pot.png");
   private static final gqk L = gqk.g(a);
   private static final gqk M = gqk.d(b);
   private static final gqk N = gqk.n(c);
   private static final gqk O = gqk.n(d);
   private static final gqk P = gqk.g(e);
   private static final gqk Q = gqk.f(f);
   private static final gqk R = gqk.a(g);
   private static final gqk S = gqk.b(g);
   private static final gqk T = gqk.d(hiw.d);
   private static final gqk U = gqk.f(hiw.d);
   private static final gqk V = gqk.i(hiw.d);
   public static final gpz i = new gpz(hiw.d, "item");
   public static final gpz j = new gpz(hiw.d, "block");
   public static final gpz k = new gpz(c, "entity/banner");
   public static final gpz l = new gpz(d, "entity/shield");
   public static final gpz m = new gpz(f, "entity/chest");
   public static final gpz n = new gpz(h, "entity/decorated_pot");
   public static final gpz o = new gpz(b, "entity/bed");
   public static final gpz p = new gpz(a, "entity/shulker");
   public static final gpz q = new gpz(e, "entity/signs");
   public static final gpz r = new gpz(e, "entity/signs/hanging");
   public static final hle s = p.a("shulker");
   public static final List<hle> t = Arrays.stream(cyb.values()).sorted(Comparator.comparingInt(cyb::a)).map(gqv::f).collect(ImmutableList.toImmutableList());
   public static final Map<ebv, hle> u = ebv.a().collect(Collectors.toMap(Function.identity(), gqv::c));
   public static final Map<ebv, hle> v = ebv.a().collect(Collectors.toMap(Function.identity(), gqv::d));
   public static final hle w = k.a("base");
   public static final hle x = l.a("base");
   private static final Map<alg, hle> W = new HashMap<>();
   private static final Map<alg, hle> X = new HashMap<>();
   public static final Map<alf<dxy>, hle> y = mf.ai.c().collect(Collectors.toMap(je.c::h, $$0 -> n.a($$0.a().a())));
   public static final hle z = n.a("decorated_pot_base");
   public static final hle A = n.a("decorated_pot_side");
   private static final hle[] Y = Arrays.stream(cyb.values()).sorted(Comparator.comparingInt(cyb::a)).map(gqv::c).toArray(hle[]::new);
   public static final hle B = m.a("trapped");
   public static final hle C = m.a("trapped_left");
   public static final hle D = m.a("trapped_right");
   public static final hle E = m.a("christmas");
   public static final hle F = m.a("christmas_left");
   public static final hle G = m.a("christmas_right");
   public static final hle H = m.a("normal");
   public static final hle I = m.a("normal_left");
   public static final hle J = m.a("normal_right");
   public static final hle K = m.a("ender");

   public static gqk a() {
      return N;
   }

   public static gqk b() {
      return O;
   }

   public static gqk c() {
      return M;
   }

   public static gqk d() {
      return L;
   }

   public static gqk e() {
      return P;
   }

   public static gqk f() {
      return P;
   }

   public static gqk g() {
      return Q;
   }

   public static gqk a(boolean $$0) {
      return $$0 ? S : R;
   }

   public static gqk h() {
      return T;
   }

   public static gqk i() {
      return U;
   }

   public static gqk j() {
      return V;
   }

   public static hle a(cyb $$0) {
      return Y[$$0.a()];
   }

   public static alg b(cyb $$0) {
      return alg.b($$0.b());
   }

   public static hle c(cyb $$0) {
      return o.a(b($$0));
   }

   public static hle d(cyb $$0) {
      return t.get($$0.a());
   }

   public static alg e(cyb $$0) {
      return alg.b("shulker_" + $$0.b());
   }

   public static hle f(cyb $$0) {
      return p.a(e($$0));
   }

   private static hle c(ebv $$0) {
      return q.a($$0.b());
   }

   private static hle d(ebv $$0) {
      return r.a($$0.b());
   }

   public static hle a(ebv $$0) {
      return u.get($$0);
   }

   public static hle b(ebv $$0) {
      return v.get($$0);
   }

   public static hle a(je<dwu> $$0) {
      return W.computeIfAbsent($$0.a().a(), k::a);
   }

   public static hle b(je<dwu> $$0) {
      return X.computeIfAbsent($$0.a().a(), l::a);
   }

   @Nullable
   public static hle a(@Nullable alf<dxy> $$0) {
      return $$0 == null ? null : y.get($$0);
   }

   public static hle a(dxf $$0, eaz $$1, boolean $$2) {
      if ($$0 instanceof dyd) {
         return K;
      } else if ($$2) {
         return a($$1, E, F, G);
      } else {
         return $$0 instanceof dze ? a($$1, B, C, D) : a($$1, H, I, J);
      }
   }

   private static hle a(eaz $$0, hle $$1, hle $$2, hle $$3) {
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
