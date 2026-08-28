import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gsw {
   public static final alk a = alk.b("textures/atlas/shulker_boxes.png");
   public static final alk b = alk.b("textures/atlas/beds.png");
   public static final alk c = alk.b("textures/atlas/banner_patterns.png");
   public static final alk d = alk.b("textures/atlas/shield_patterns.png");
   public static final alk e = alk.b("textures/atlas/signs.png");
   public static final alk f = alk.b("textures/atlas/chest.png");
   public static final alk g = alk.b("textures/atlas/armor_trims.png");
   public static final alk h = alk.b("textures/atlas/decorated_pot.png");
   private static final gsn L = gsn.g(a);
   private static final gsn M = gsn.d(b);
   private static final gsn N = gsn.n(c);
   private static final gsn O = gsn.n(d);
   private static final gsn P = gsn.g(e);
   private static final gsn Q = gsn.f(f);
   private static final gsn R = gsn.a(g);
   private static final gsn S = gsn.b(g);
   private static final gsn T = gsn.d(hlb.c);
   private static final gsn U = gsn.f(hlb.c);
   private static final gsn V = gsn.i(hlb.c);
   public static final gsb i = new gsb(hlb.c, "item");
   public static final gsb j = new gsb(hlb.c, "block");
   public static final gsb k = new gsb(c, "entity/banner");
   public static final gsb l = new gsb(d, "entity/shield");
   public static final gsb m = new gsb(f, "entity/chest");
   public static final gsb n = new gsb(h, "entity/decorated_pot");
   public static final gsb o = new gsb(b, "entity/bed");
   public static final gsb p = new gsb(a, "entity/shulker");
   public static final gsb q = new gsb(e, "entity/signs");
   public static final gsb r = new gsb(e, "entity/signs/hanging");
   public static final hnj s = p.a("shulker");
   public static final List<hnj> t = Arrays.stream(cyy.values()).sorted(Comparator.comparingInt(cyy::a)).map(gsw::f).collect(ImmutableList.toImmutableList());
   public static final Map<ecu, hnj> u = ecu.a().collect(Collectors.toMap(Function.identity(), gsw::c));
   public static final Map<ecu, hnj> v = ecu.a().collect(Collectors.toMap(Function.identity(), gsw::d));
   public static final hnj w = k.a("base");
   public static final hnj x = l.a("base");
   private static final Map<alk, hnj> W = new HashMap<>();
   private static final Map<alk, hnj> X = new HashMap<>();
   public static final Map<alj<dyx>, hnj> y = mh.ai.c().collect(Collectors.toMap(jg.c::h, $$0 -> n.a($$0.a().a())));
   public static final hnj z = n.a("decorated_pot_base");
   public static final hnj A = n.a("decorated_pot_side");
   private static final hnj[] Y = Arrays.stream(cyy.values()).sorted(Comparator.comparingInt(cyy::a)).map(gsw::c).toArray(hnj[]::new);
   public static final hnj B = m.a("trapped");
   public static final hnj C = m.a("trapped_left");
   public static final hnj D = m.a("trapped_right");
   public static final hnj E = m.a("christmas");
   public static final hnj F = m.a("christmas_left");
   public static final hnj G = m.a("christmas_right");
   public static final hnj H = m.a("normal");
   public static final hnj I = m.a("normal_left");
   public static final hnj J = m.a("normal_right");
   public static final hnj K = m.a("ender");

   public static gsn a() {
      return N;
   }

   public static gsn b() {
      return O;
   }

   public static gsn c() {
      return M;
   }

   public static gsn d() {
      return L;
   }

   public static gsn e() {
      return P;
   }

   public static gsn f() {
      return P;
   }

   public static gsn g() {
      return Q;
   }

   public static gsn a(boolean $$0) {
      return $$0 ? S : R;
   }

   public static gsn h() {
      return T;
   }

   public static gsn i() {
      return U;
   }

   public static gsn j() {
      return V;
   }

   public static hnj a(cyy $$0) {
      return Y[$$0.a()];
   }

   public static alk b(cyy $$0) {
      return alk.b($$0.b());
   }

   public static hnj c(cyy $$0) {
      return o.a(b($$0));
   }

   public static hnj d(cyy $$0) {
      return t.get($$0.a());
   }

   public static alk e(cyy $$0) {
      return alk.b("shulker_" + $$0.b());
   }

   public static hnj f(cyy $$0) {
      return p.a(e($$0));
   }

   private static hnj c(ecu $$0) {
      return q.a($$0.b());
   }

   private static hnj d(ecu $$0) {
      return r.a($$0.b());
   }

   public static hnj a(ecu $$0) {
      return u.get($$0);
   }

   public static hnj b(ecu $$0) {
      return v.get($$0);
   }

   public static hnj a(jg<dxt> $$0) {
      return W.computeIfAbsent($$0.a().a(), k::a);
   }

   public static hnj b(jg<dxt> $$0) {
      return X.computeIfAbsent($$0.a().a(), l::a);
   }

   @Nullable
   public static hnj a(@Nullable alj<dyx> $$0) {
      return $$0 == null ? null : y.get($$0);
   }

   public static hnj a(dye $$0, eby $$1, boolean $$2) {
      if ($$0 instanceof dzc) {
         return K;
      } else if ($$2) {
         return a($$1, E, F, G);
      } else {
         return $$0 instanceof ead ? a($$1, B, C, D) : a($$1, H, I, J);
      }
   }

   private static hnj a(eby $$0, hnj $$1, hnj $$2, hnj $$3) {
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
