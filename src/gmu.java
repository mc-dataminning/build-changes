import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gmu {
   public static final akv a = akv.b("textures/atlas/shulker_boxes.png");
   public static final akv b = akv.b("textures/atlas/beds.png");
   public static final akv c = akv.b("textures/atlas/banner_patterns.png");
   public static final akv d = akv.b("textures/atlas/shield_patterns.png");
   public static final akv e = akv.b("textures/atlas/signs.png");
   public static final akv f = akv.b("textures/atlas/chest.png");
   public static final akv g = akv.b("textures/atlas/armor_trims.png");
   public static final akv h = akv.b("textures/atlas/decorated_pot.png");
   private static final gmj B = gmj.g(a);
   private static final gmj C = gmj.d(b);
   private static final gmj D = gmj.n(c);
   private static final gmj E = gmj.n(d);
   private static final gmj F = gmj.g(e);
   private static final gmj G = gmj.f(f);
   private static final gmj H = gmj.a(g);
   private static final gmj I = gmj.b(g);
   private static final gmj J = gmj.d(hes.d);
   private static final gmj K = gmj.f(hes.d);
   private static final gmj L = gmj.i(hes.d);
   public static final hha i = b(akv.b("shulker"));
   public static final List<hha> j = Arrays.stream(cvn.values()).sorted(Comparator.comparingInt(cvn::a)).map(gmu::f).collect(ImmutableList.toImmutableList());
   public static final Map<dyk, hha> k = dyk.a().collect(Collectors.toMap(Function.identity(), gmu::c));
   public static final Map<dyk, hha> l = dyk.a().collect(Collectors.toMap(Function.identity(), gmu::d));
   public static final hha m = new hha(c, akv.b("entity/banner/base"));
   public static final hha n = new hha(d, akv.b("entity/shield/base"));
   private static final Map<akv, hha> M = new HashMap<>();
   private static final Map<akv, hha> N = new HashMap<>();
   public static final Map<aku<dus>, hha> o = mb.ak.c().collect(Collectors.toMap(jr.c::h, $$0 -> f($$0.a().a())));
   public static final hha p = f(akv.b("decorated_pot_base"));
   public static final hha q = f(akv.b("decorated_pot_side"));
   private static final hha[] O = Arrays.stream(cvn.values()).sorted(Comparator.comparingInt(cvn::a)).map(gmu::c).toArray(hha[]::new);
   public static final hha r = a("trapped");
   public static final hha s = a("trapped_left");
   public static final hha t = a("trapped_right");
   public static final hha u = a("christmas");
   public static final hha v = a("christmas_left");
   public static final hha w = a("christmas_right");
   public static final hha x = a("normal");
   public static final hha y = a("normal_left");
   public static final hha z = a("normal_right");
   public static final hha A = a("ender");

   public static gmj a() {
      return D;
   }

   public static gmj b() {
      return E;
   }

   public static gmj c() {
      return C;
   }

   public static gmj d() {
      return B;
   }

   public static gmj e() {
      return F;
   }

   public static gmj f() {
      return F;
   }

   public static gmj g() {
      return G;
   }

   public static gmj a(boolean $$0) {
      return $$0 ? I : H;
   }

   public static gmj h() {
      return J;
   }

   public static gmj i() {
      return K;
   }

   public static gmj j() {
      return L;
   }

   public static hha a(cvn $$0) {
      return O[$$0.a()];
   }

   public static akv b(cvn $$0) {
      return akv.b($$0.b());
   }

   public static hha c(cvn $$0) {
      return a(b($$0));
   }

   public static hha a(akv $$0) {
      return new hha(b, $$0.f("entity/bed/"));
   }

   public static hha d(cvn $$0) {
      return j.get($$0.a());
   }

   public static akv e(cvn $$0) {
      return akv.b("shulker_" + $$0.b());
   }

   public static hha f(cvn $$0) {
      return b(e($$0));
   }

   public static hha b(akv $$0) {
      return new hha(a, $$0.f("entity/shulker/"));
   }

   private static hha c(dyk $$0) {
      return c(akv.b($$0.b()));
   }

   public static hha c(akv $$0) {
      return new hha(e, $$0.f("entity/signs/"));
   }

   private static hha d(dyk $$0) {
      return d(akv.b($$0.b()));
   }

   public static hha d(akv $$0) {
      return new hha(e, $$0.f("entity/signs/hanging/"));
   }

   public static hha a(dyk $$0) {
      return k.get($$0);
   }

   public static hha b(dyk $$0) {
      return l.get($$0);
   }

   public static hha a(jr<dtq> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         akv $$1 = $$0x.f("entity/banner/");
         return new hha(c, $$1);
      });
   }

   public static hha b(jr<dtq> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         akv $$1 = $$0x.f("entity/shield/");
         return new hha(d, $$1);
      });
   }

   private static hha a(String $$0) {
      return new hha(f, akv.b("entity/chest/" + $$0));
   }

   public static hha e(akv $$0) {
      return new hha(f, $$0.f("entity/chest/"));
   }

   private static hha f(akv $$0) {
      return new hha(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hha a(@Nullable aku<dus> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hha a(dua $$0, dxq $$1, boolean $$2) {
      if ($$0 instanceof dux) {
         return A;
      } else if ($$2) {
         return a($$1, u, v, w);
      } else {
         return $$0 instanceof dvw ? a($$1, r, s, t) : a($$1, x, y, z);
      }
   }

   private static hha a(dxq $$0, hha $$1, hha $$2, hha $$3) {
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
