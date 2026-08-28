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

public class gef {
   public static final alf a = new alf("textures/atlas/shulker_boxes.png");
   public static final alf b = new alf("textures/atlas/beds.png");
   public static final alf c = new alf("textures/atlas/banner_patterns.png");
   public static final alf d = new alf("textures/atlas/shield_patterns.png");
   public static final alf e = new alf("textures/atlas/signs.png");
   public static final alf f = new alf("textures/atlas/chest.png");
   public static final alf g = new alf("textures/atlas/armor_trims.png");
   public static final alf h = new alf("textures/atlas/decorated_pot.png");
   private static final gdy A = gdy.e(a);
   private static final gdy B = gdy.c(b);
   private static final gdy C = gdy.m(c);
   private static final gdy D = gdy.m(d);
   private static final gdy E = gdy.e(e);
   private static final gdy F = gdy.d(f);
   private static final gdy G = gdy.a(g);
   private static final gdy H = gdy.b(g);
   private static final gdy I = gdy.c(gpa.e);
   private static final gdy J = gdy.d(gpa.e);
   private static final gdy K = gdy.g(gpa.e);
   private static final gdy L = gdy.h(gpa.e);
   public static final grf i = new grf(a, new alf("entity/shulker/shulker"));
   public static final List<grf> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new grf(a, new alf("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dtr, grf> k = dtr.a().collect(Collectors.toMap(Function.identity(), gef::c));
   public static final Map<dtr, grf> l = dtr.a().collect(Collectors.toMap(Function.identity(), gef::d));
   public static final grf m = new grf(c, new alf("entity/banner/base"));
   public static final grf n = new grf(d, new alf("entity/shield/base"));
   private static final Map<alf, grf> M = new HashMap<>();
   private static final Map<alf, grf> N = new HashMap<>();
   public static final Map<ale<String>, grf> o = lp.an.f().stream().collect(Collectors.toMap(Function.identity(), gef::b));
   public static final grf[] p = Arrays.stream(ctk.values())
      .sorted(Comparator.comparingInt(ctk::a))
      .map($$0 -> new grf(b, new alf("entity/bed/" + $$0.b())))
      .toArray(grf[]::new);
   public static final grf q = a("trapped");
   public static final grf r = a("trapped_left");
   public static final grf s = a("trapped_right");
   public static final grf t = a("christmas");
   public static final grf u = a("christmas_left");
   public static final grf v = a("christmas_right");
   public static final grf w = a("normal");
   public static final grf x = a("normal_left");
   public static final grf y = a("normal_right");
   public static final grf z = a("ender");

   public static gdy a() {
      return C;
   }

   public static gdy b() {
      return D;
   }

   public static gdy c() {
      return B;
   }

   public static gdy d() {
      return A;
   }

   public static gdy e() {
      return E;
   }

   public static gdy f() {
      return E;
   }

   public static gdy g() {
      return F;
   }

   public static gdy a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gdy h() {
      return I;
   }

   public static gdy i() {
      return J;
   }

   public static gdy j() {
      return K;
   }

   public static gdy k() {
      return L;
   }

   private static grf c(dtr $$0) {
      return new grf(e, new alf("entity/signs/" + $$0.b()));
   }

   private static grf d(dtr $$0) {
      return new grf(e, new alf("entity/signs/hanging/" + $$0.b()));
   }

   public static grf a(dtr $$0) {
      return k.get($$0);
   }

   public static grf b(dtr $$0) {
      return l.get($$0);
   }

   public static grf a(ji<doz> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         alf $$1 = $$0x.d("entity/banner/");
         return new grf(c, $$1);
      });
   }

   public static grf b(ji<doz> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alf $$1 = $$0x.d("entity/shield/");
         return new grf(d, $$1);
      });
   }

   private static grf a(String $$0) {
      return new grf(f, new alf("entity/chest/" + $$0));
   }

   private static grf b(ale<String> $$0) {
      return new grf(h, dqa.a($$0));
   }

   @Nullable
   public static grf a(@Nullable ale<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static grf a(dpj $$0, dsw $$1, boolean $$2) {
      if ($$0 instanceof dqe) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof drc ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static grf a(dsw $$0, grf $$1, grf $$2, grf $$3) {
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
