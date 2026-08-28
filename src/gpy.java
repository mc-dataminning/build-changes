import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gpy {
   public static final ale a = ale.b("textures/atlas/shulker_boxes.png");
   public static final ale b = ale.b("textures/atlas/beds.png");
   public static final ale c = ale.b("textures/atlas/banner_patterns.png");
   public static final ale d = ale.b("textures/atlas/shield_patterns.png");
   public static final ale e = ale.b("textures/atlas/signs.png");
   public static final ale f = ale.b("textures/atlas/chest.png");
   public static final ale g = ale.b("textures/atlas/armor_trims.png");
   public static final ale h = ale.b("textures/atlas/decorated_pot.png");
   private static final gpn L = gpn.g(a);
   private static final gpn M = gpn.d(b);
   private static final gpn N = gpn.n(c);
   private static final gpn O = gpn.n(d);
   private static final gpn P = gpn.g(e);
   private static final gpn Q = gpn.f(f);
   private static final gpn R = gpn.a(g);
   private static final gpn S = gpn.b(g);
   private static final gpn T = gpn.d(hhy.d);
   private static final gpn U = gpn.f(hhy.d);
   private static final gpn V = gpn.i(hhy.d);
   public static final gpc i = new gpc(hhy.d, "item");
   public static final gpc j = new gpc(hhy.d, "block");
   public static final gpc k = new gpc(c, "entity/banner");
   public static final gpc l = new gpc(d, "entity/shield");
   public static final gpc m = new gpc(f, "entity/chest");
   public static final gpc n = new gpc(h, "entity/decorated_pot");
   public static final gpc o = new gpc(b, "entity/bed");
   public static final gpc p = new gpc(a, "entity/shulker");
   public static final gpc q = new gpc(e, "entity/signs");
   public static final gpc r = new gpc(e, "entity/signs/hanging");
   public static final hkg s = p.a("shulker");
   public static final List<hkg> t = Arrays.stream(cxq.values()).sorted(Comparator.comparingInt(cxq::a)).map(gpy::f).collect(ImmutableList.toImmutableList());
   public static final Map<ebc, hkg> u = ebc.a().collect(Collectors.toMap(Function.identity(), gpy::c));
   public static final Map<ebc, hkg> v = ebc.a().collect(Collectors.toMap(Function.identity(), gpy::d));
   public static final hkg w = k.a("base");
   public static final hkg x = l.a("base");
   private static final Map<ale, hkg> W = new HashMap<>();
   private static final Map<ale, hkg> X = new HashMap<>();
   public static final Map<ald<dxg>, hkg> y = mf.ai.c().collect(Collectors.toMap(je.c::h, $$0 -> n.a($$0.a().a())));
   public static final hkg z = n.a("decorated_pot_base");
   public static final hkg A = n.a("decorated_pot_side");
   private static final hkg[] Y = Arrays.stream(cxq.values()).sorted(Comparator.comparingInt(cxq::a)).map(gpy::c).toArray(hkg[]::new);
   public static final hkg B = m.a("trapped");
   public static final hkg C = m.a("trapped_left");
   public static final hkg D = m.a("trapped_right");
   public static final hkg E = m.a("christmas");
   public static final hkg F = m.a("christmas_left");
   public static final hkg G = m.a("christmas_right");
   public static final hkg H = m.a("normal");
   public static final hkg I = m.a("normal_left");
   public static final hkg J = m.a("normal_right");
   public static final hkg K = m.a("ender");

   public static gpn a() {
      return N;
   }

   public static gpn b() {
      return O;
   }

   public static gpn c() {
      return M;
   }

   public static gpn d() {
      return L;
   }

   public static gpn e() {
      return P;
   }

   public static gpn f() {
      return P;
   }

   public static gpn g() {
      return Q;
   }

   public static gpn a(boolean $$0) {
      return $$0 ? S : R;
   }

   public static gpn h() {
      return T;
   }

   public static gpn i() {
      return U;
   }

   public static gpn j() {
      return V;
   }

   public static hkg a(cxq $$0) {
      return Y[$$0.a()];
   }

   public static ale b(cxq $$0) {
      return ale.b($$0.b());
   }

   public static hkg c(cxq $$0) {
      return o.a(b($$0));
   }

   public static hkg d(cxq $$0) {
      return t.get($$0.a());
   }

   public static ale e(cxq $$0) {
      return ale.b("shulker_" + $$0.b());
   }

   public static hkg f(cxq $$0) {
      return p.a(e($$0));
   }

   private static hkg c(ebc $$0) {
      return q.a($$0.b());
   }

   private static hkg d(ebc $$0) {
      return r.a($$0.b());
   }

   public static hkg a(ebc $$0) {
      return u.get($$0);
   }

   public static hkg b(ebc $$0) {
      return v.get($$0);
   }

   public static hkg a(je<dwc> $$0) {
      return W.computeIfAbsent($$0.a().a(), k::a);
   }

   public static hkg b(je<dwc> $$0) {
      return X.computeIfAbsent($$0.a().a(), l::a);
   }

   @Nullable
   public static hkg a(@Nullable ald<dxg> $$0) {
      return $$0 == null ? null : y.get($$0);
   }

   public static hkg a(dwn $$0, eag $$1, boolean $$2) {
      if ($$0 instanceof dxl) {
         return K;
      } else if ($$2) {
         return a($$1, E, F, G);
      } else {
         return $$0 instanceof dym ? a($$1, B, C, D) : a($$1, H, I, J);
      }
   }

   private static hkg a(eag $$0, hkg $$1, hkg $$2, hkg $$3) {
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
