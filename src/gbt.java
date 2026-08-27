import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gbt {
   public static final akf a = new akf("textures/atlas/shulker_boxes.png");
   public static final akf b = new akf("textures/atlas/beds.png");
   public static final akf c = new akf("textures/atlas/banner_patterns.png");
   public static final akf d = new akf("textures/atlas/shield_patterns.png");
   public static final akf e = new akf("textures/atlas/signs.png");
   public static final akf f = new akf("textures/atlas/chest.png");
   public static final akf g = new akf("textures/atlas/armor_trims.png");
   public static final akf h = new akf("textures/atlas/decorated_pot.png");
   private static final gbm A = gbm.e(a);
   private static final gbm B = gbm.c(b);
   private static final gbm C = gbm.m(c);
   private static final gbm D = gbm.m(d);
   private static final gbm E = gbm.e(e);
   private static final gbm F = gbm.d(f);
   private static final gbm G = gbm.a(g);
   private static final gbm H = gbm.b(g);
   private static final gbm I = gbm.c(gmn.e);
   private static final gbm J = gbm.d(gmn.e);
   private static final gbm K = gbm.g(gmn.e);
   private static final gbm L = gbm.h(gmn.e);
   public static final gor i = new gor(a, new akf("entity/shulker/shulker"));
   public static final List<gor> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gor(a, new akf("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<drl, gor> k = drl.a().collect(Collectors.toMap(Function.identity(), gbt::c));
   public static final Map<drl, gor> l = drl.a().collect(Collectors.toMap(Function.identity(), gbt::d));
   public static final gor m = new gor(c, new akf("entity/banner/base"));
   public static final gor n = new gor(d, new akf("entity/shield/base"));
   private static final Map<akf, gor> M = new HashMap<>();
   private static final Map<akf, gor> N = new HashMap<>();
   public static final Map<ake<String>, gor> o = lc.an.f().stream().collect(Collectors.toMap(Function.identity(), gbt::b));
   public static final gor[] p = Arrays.stream(cqw.values())
      .sorted(Comparator.comparingInt(cqw::a))
      .map($$0 -> new gor(b, new akf("entity/bed/" + $$0.b())))
      .toArray(gor[]::new);
   public static final gor q = a("trapped");
   public static final gor r = a("trapped_left");
   public static final gor s = a("trapped_right");
   public static final gor t = a("christmas");
   public static final gor u = a("christmas_left");
   public static final gor v = a("christmas_right");
   public static final gor w = a("normal");
   public static final gor x = a("normal_left");
   public static final gor y = a("normal_right");
   public static final gor z = a("ender");

   public static gbm a() {
      return C;
   }

   public static gbm b() {
      return D;
   }

   public static gbm c() {
      return B;
   }

   public static gbm d() {
      return A;
   }

   public static gbm e() {
      return E;
   }

   public static gbm f() {
      return E;
   }

   public static gbm g() {
      return F;
   }

   public static gbm a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gbm h() {
      return I;
   }

   public static gbm i() {
      return J;
   }

   public static gbm j() {
      return K;
   }

   public static gbm k() {
      return L;
   }

   private static gor c(drl $$0) {
      return new gor(e, new akf("entity/signs/" + $$0.b()));
   }

   private static gor d(drl $$0) {
      return new gor(e, new akf("entity/signs/hanging/" + $$0.b()));
   }

   public static gor a(drl $$0) {
      return k.get($$0);
   }

   public static gor b(drl $$0) {
      return l.get($$0);
   }

   public static gor a(iv<dmt> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         akf $$1 = $$0x.d("entity/banner/");
         return new gor(c, $$1);
      });
   }

   public static gor b(iv<dmt> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         akf $$1 = $$0x.d("entity/shield/");
         return new gor(d, $$1);
      });
   }

   private static gor a(String $$0) {
      return new gor(f, new akf("entity/chest/" + $$0));
   }

   private static gor b(ake<String> $$0) {
      return new gor(h, dnu.a($$0));
   }

   @Nullable
   public static gor a(@Nullable ake<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gor a(dnd $$0, dqq $$1, boolean $$2) {
      if ($$0 instanceof dny) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dow ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gor a(dqq $$0, gor $$1, gor $$2, gor $$3) {
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
