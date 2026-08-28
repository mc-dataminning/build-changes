import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gmq {
   public static final aku a = aku.b("textures/atlas/shulker_boxes.png");
   public static final aku b = aku.b("textures/atlas/beds.png");
   public static final aku c = aku.b("textures/atlas/banner_patterns.png");
   public static final aku d = aku.b("textures/atlas/shield_patterns.png");
   public static final aku e = aku.b("textures/atlas/signs.png");
   public static final aku f = aku.b("textures/atlas/chest.png");
   public static final aku g = aku.b("textures/atlas/armor_trims.png");
   public static final aku h = aku.b("textures/atlas/decorated_pot.png");
   private static final gmf B = gmf.g(a);
   private static final gmf C = gmf.d(b);
   private static final gmf D = gmf.n(c);
   private static final gmf E = gmf.n(d);
   private static final gmf F = gmf.g(e);
   private static final gmf G = gmf.f(f);
   private static final gmf H = gmf.a(g);
   private static final gmf I = gmf.b(g);
   private static final gmf J = gmf.d(hel.d);
   private static final gmf K = gmf.f(hel.d);
   private static final gmf L = gmf.i(hel.d);
   public static final hgt i = b(aku.b("shulker"));
   public static final List<hgt> j = Arrays.stream(cvk.values()).sorted(Comparator.comparingInt(cvk::a)).map(gmq::f).collect(ImmutableList.toImmutableList());
   public static final Map<dyh, hgt> k = dyh.a().collect(Collectors.toMap(Function.identity(), gmq::c));
   public static final Map<dyh, hgt> l = dyh.a().collect(Collectors.toMap(Function.identity(), gmq::d));
   public static final hgt m = new hgt(c, aku.b("entity/banner/base"));
   public static final hgt n = new hgt(d, aku.b("entity/shield/base"));
   private static final Map<aku, hgt> M = new HashMap<>();
   private static final Map<aku, hgt> N = new HashMap<>();
   public static final Map<akt<dup>, hgt> o = mb.ak.c().collect(Collectors.toMap(jr.c::h, $$0 -> f($$0.a().a())));
   public static final hgt p = f(aku.b("decorated_pot_base"));
   public static final hgt q = f(aku.b("decorated_pot_side"));
   private static final hgt[] O = Arrays.stream(cvk.values()).sorted(Comparator.comparingInt(cvk::a)).map(gmq::c).toArray(hgt[]::new);
   public static final hgt r = a("trapped");
   public static final hgt s = a("trapped_left");
   public static final hgt t = a("trapped_right");
   public static final hgt u = a("christmas");
   public static final hgt v = a("christmas_left");
   public static final hgt w = a("christmas_right");
   public static final hgt x = a("normal");
   public static final hgt y = a("normal_left");
   public static final hgt z = a("normal_right");
   public static final hgt A = a("ender");

   public static gmf a() {
      return D;
   }

   public static gmf b() {
      return E;
   }

   public static gmf c() {
      return C;
   }

   public static gmf d() {
      return B;
   }

   public static gmf e() {
      return F;
   }

   public static gmf f() {
      return F;
   }

   public static gmf g() {
      return G;
   }

   public static gmf a(boolean $$0) {
      return $$0 ? I : H;
   }

   public static gmf h() {
      return J;
   }

   public static gmf i() {
      return K;
   }

   public static gmf j() {
      return L;
   }

   public static hgt a(cvk $$0) {
      return O[$$0.a()];
   }

   public static aku b(cvk $$0) {
      return aku.b($$0.b());
   }

   public static hgt c(cvk $$0) {
      return a(b($$0));
   }

   public static hgt a(aku $$0) {
      return new hgt(b, $$0.f("entity/bed/"));
   }

   public static hgt d(cvk $$0) {
      return j.get($$0.a());
   }

   public static aku e(cvk $$0) {
      return aku.b("shulker_" + $$0.b());
   }

   public static hgt f(cvk $$0) {
      return b(e($$0));
   }

   public static hgt b(aku $$0) {
      return new hgt(a, $$0.f("entity/shulker/"));
   }

   private static hgt c(dyh $$0) {
      return c(aku.b($$0.b()));
   }

   public static hgt c(aku $$0) {
      return new hgt(e, $$0.f("entity/signs/"));
   }

   private static hgt d(dyh $$0) {
      return d(aku.b($$0.b()));
   }

   public static hgt d(aku $$0) {
      return new hgt(e, $$0.f("entity/signs/hanging/"));
   }

   public static hgt a(dyh $$0) {
      return k.get($$0);
   }

   public static hgt b(dyh $$0) {
      return l.get($$0);
   }

   public static hgt a(jr<dtn> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         aku $$1 = $$0x.f("entity/banner/");
         return new hgt(c, $$1);
      });
   }

   public static hgt b(jr<dtn> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         aku $$1 = $$0x.f("entity/shield/");
         return new hgt(d, $$1);
      });
   }

   private static hgt a(String $$0) {
      return new hgt(f, aku.b("entity/chest/" + $$0));
   }

   public static hgt e(aku $$0) {
      return new hgt(f, $$0.f("entity/chest/"));
   }

   private static hgt f(aku $$0) {
      return new hgt(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hgt a(@Nullable akt<dup> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hgt a(dtx $$0, dxn $$1, boolean $$2) {
      if ($$0 instanceof duu) {
         return A;
      } else if ($$2) {
         return a($$1, u, v, w);
      } else {
         return $$0 instanceof dvt ? a($$1, r, s, t) : a($$1, x, y, z);
      }
   }

   private static hgt a(dxn $$0, hgt $$1, hgt $$2, hgt $$3) {
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
