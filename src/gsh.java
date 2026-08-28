import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gsh {
   public static final alr a = alr.b("textures/atlas/shulker_boxes.png");
   public static final alr b = alr.b("textures/atlas/beds.png");
   public static final alr c = alr.b("textures/atlas/banner_patterns.png");
   public static final alr d = alr.b("textures/atlas/shield_patterns.png");
   public static final alr e = alr.b("textures/atlas/signs.png");
   public static final alr f = alr.b("textures/atlas/chest.png");
   public static final alr g = alr.b("textures/atlas/armor_trims.png");
   public static final alr h = alr.b("textures/atlas/decorated_pot.png");
   private static final gry L = gry.g(a);
   private static final gry M = gry.d(b);
   private static final gry N = gry.n(c);
   private static final gry O = gry.n(d);
   private static final gry P = gry.g(e);
   private static final gry Q = gry.f(f);
   private static final gry R = gry.a(g);
   private static final gry S = gry.b(g);
   private static final gry T = gry.d(hkp.c);
   private static final gry U = gry.f(hkp.c);
   private static final gry V = gry.i(hkp.c);
   public static final grm i = new grm(hkp.c, "item");
   public static final grm j = new grm(hkp.c, "block");
   public static final grm k = new grm(c, "entity/banner");
   public static final grm l = new grm(d, "entity/shield");
   public static final grm m = new grm(f, "entity/chest");
   public static final grm n = new grm(h, "entity/decorated_pot");
   public static final grm o = new grm(b, "entity/bed");
   public static final grm p = new grm(a, "entity/shulker");
   public static final grm q = new grm(e, "entity/signs");
   public static final grm r = new grm(e, "entity/signs/hanging");
   public static final hmx s = p.a("shulker");
   public static final List<hmx> t = Arrays.stream(czi.values()).sorted(Comparator.comparingInt(czi::a)).map(gsh::f).collect(ImmutableList.toImmutableList());
   public static final Map<ede, hmx> u = ede.a().collect(Collectors.toMap(Function.identity(), gsh::c));
   public static final Map<ede, hmx> v = ede.a().collect(Collectors.toMap(Function.identity(), gsh::d));
   public static final hmx w = k.a("base");
   public static final hmx x = l.a("base");
   private static final Map<alr, hmx> W = new HashMap<>();
   private static final Map<alr, hmx> X = new HashMap<>();
   public static final Map<alq<dzh>, hmx> y = mh.ai.c().collect(Collectors.toMap(jg.c::h, $$0 -> n.a($$0.a().a())));
   public static final hmx z = n.a("decorated_pot_base");
   public static final hmx A = n.a("decorated_pot_side");
   private static final hmx[] Y = Arrays.stream(czi.values()).sorted(Comparator.comparingInt(czi::a)).map(gsh::c).toArray(hmx[]::new);
   public static final hmx B = m.a("trapped");
   public static final hmx C = m.a("trapped_left");
   public static final hmx D = m.a("trapped_right");
   public static final hmx E = m.a("christmas");
   public static final hmx F = m.a("christmas_left");
   public static final hmx G = m.a("christmas_right");
   public static final hmx H = m.a("normal");
   public static final hmx I = m.a("normal_left");
   public static final hmx J = m.a("normal_right");
   public static final hmx K = m.a("ender");

   public static gry a() {
      return N;
   }

   public static gry b() {
      return O;
   }

   public static gry c() {
      return M;
   }

   public static gry d() {
      return L;
   }

   public static gry e() {
      return P;
   }

   public static gry f() {
      return P;
   }

   public static gry g() {
      return Q;
   }

   public static gry a(boolean $$0) {
      return $$0 ? S : R;
   }

   public static gry h() {
      return T;
   }

   public static gry i() {
      return U;
   }

   public static gry j() {
      return V;
   }

   public static hmx a(czi $$0) {
      return Y[$$0.a()];
   }

   public static alr b(czi $$0) {
      return alr.b($$0.b());
   }

   public static hmx c(czi $$0) {
      return o.a(b($$0));
   }

   public static hmx d(czi $$0) {
      return t.get($$0.a());
   }

   public static alr e(czi $$0) {
      return alr.b("shulker_" + $$0.b());
   }

   public static hmx f(czi $$0) {
      return p.a(e($$0));
   }

   private static hmx c(ede $$0) {
      return q.a($$0.b());
   }

   private static hmx d(ede $$0) {
      return r.a($$0.b());
   }

   public static hmx a(ede $$0) {
      return u.get($$0);
   }

   public static hmx b(ede $$0) {
      return v.get($$0);
   }

   public static hmx a(jg<dyd> $$0) {
      return W.computeIfAbsent($$0.a().a(), k::a);
   }

   public static hmx b(jg<dyd> $$0) {
      return X.computeIfAbsent($$0.a().a(), l::a);
   }

   @Nullable
   public static hmx a(@Nullable alq<dzh> $$0) {
      return $$0 == null ? null : y.get($$0);
   }

   public static hmx a(dyo $$0, eci $$1, boolean $$2) {
      if ($$0 instanceof dzm) {
         return K;
      } else if ($$2) {
         return a($$1, E, F, G);
      } else {
         return $$0 instanceof ean ? a($$1, B, C, D) : a($$1, H, I, J);
      }
   }

   private static hmx a(eci $$0, hmx $$1, hmx $$2, hmx $$3) {
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
