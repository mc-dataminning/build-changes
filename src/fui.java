import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fui {
   public static final ahh a = new ahh("textures/atlas/shulker_boxes.png");
   public static final ahh b = new ahh("textures/atlas/beds.png");
   public static final ahh c = new ahh("textures/atlas/banner_patterns.png");
   public static final ahh d = new ahh("textures/atlas/shield_patterns.png");
   public static final ahh e = new ahh("textures/atlas/signs.png");
   public static final ahh f = new ahh("textures/atlas/chest.png");
   public static final ahh g = new ahh("textures/atlas/armor_trims.png");
   public static final ahh h = new ahh("textures/atlas/decorated_pot.png");
   private static final fub A = fub.e(a);
   private static final fub B = fub.c(b);
   private static final fub C = fub.m(c);
   private static final fub D = fub.m(d);
   private static final fub E = fub.e(e);
   private static final fub F = fub.d(f);
   private static final fub G = fub.a(g);
   private static final fub H = fub.b(g);
   private static final fub I = fub.c(gfa.e);
   private static final fub J = fub.d(gfa.e);
   private static final fub K = fub.g(gfa.e);
   private static final fub L = fub.h(gfa.e);
   public static final ghe i = new ghe(a, new ahh("entity/shulker/shulker"));
   public static final List<ghe> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new ghe(a, new ahh("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dlc, ghe> k = dlc.a().collect(Collectors.toMap(Function.identity(), fui::c));
   public static final Map<dlc, ghe> l = dlc.a().collect(Collectors.toMap(Function.identity(), fui::d));
   public static final Map<ahg<dgu>, ghe> m = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), fui::d));
   public static final Map<ahg<dgu>, ghe> n = kd.am.f().stream().collect(Collectors.toMap(Function.identity(), fui::e));
   public static final Map<ahg<String>, ghe> o = kd.ao.f().stream().collect(Collectors.toMap(Function.identity(), fui::f));
   public static final ghe[] p = Arrays.stream(clv.values())
      .sorted(Comparator.comparingInt(clv::a))
      .map($$0 -> new ghe(b, new ahh("entity/bed/" + $$0.b())))
      .toArray(ghe[]::new);
   public static final ghe q = a("trapped");
   public static final ghe r = a("trapped_left");
   public static final ghe s = a("trapped_right");
   public static final ghe t = a("christmas");
   public static final ghe u = a("christmas_left");
   public static final ghe v = a("christmas_right");
   public static final ghe w = a("normal");
   public static final ghe x = a("normal_left");
   public static final ghe y = a("normal_right");
   public static final ghe z = a("ender");

   public static fub a() {
      return C;
   }

   public static fub b() {
      return D;
   }

   public static fub c() {
      return B;
   }

   public static fub d() {
      return A;
   }

   public static fub e() {
      return E;
   }

   public static fub f() {
      return E;
   }

   public static fub g() {
      return F;
   }

   public static fub a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fub h() {
      return I;
   }

   public static fub i() {
      return J;
   }

   public static fub j() {
      return K;
   }

   public static fub k() {
      return L;
   }

   public static void a(Consumer<ghe> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (ghe $$1 : p) {
         $$0.accept($$1);
      }

      $$0.accept(q);
      $$0.accept(r);
      $$0.accept(s);
      $$0.accept(t);
      $$0.accept(u);
      $$0.accept(v);
      $$0.accept(w);
      $$0.accept(x);
      $$0.accept(y);
      $$0.accept(z);
   }

   private static ghe c(dlc $$0) {
      return new ghe(e, new ahh("entity/signs/" + $$0.b()));
   }

   private static ghe d(dlc $$0) {
      return new ghe(e, new ahh("entity/signs/hanging/" + $$0.b()));
   }

   public static ghe a(dlc $$0) {
      return k.get($$0);
   }

   public static ghe b(dlc $$0) {
      return l.get($$0);
   }

   private static ghe d(ahg<dgu> $$0) {
      return new ghe(c, dgu.a($$0, true));
   }

   public static ghe a(ahg<dgu> $$0) {
      return m.get($$0);
   }

   private static ghe e(ahg<dgu> $$0) {
      return new ghe(d, dgu.a($$0, false));
   }

   public static ghe b(ahg<dgu> $$0) {
      return n.get($$0);
   }

   private static ghe a(String $$0) {
      return new ghe(f, new ahh("entity/chest/" + $$0));
   }

   private static ghe f(ahg<String> $$0) {
      return new ghe(h, dhu.a($$0));
   }

   @Nullable
   public static ghe c(@Nullable ahg<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static ghe a(dhd $$0, dkh $$1, boolean $$2) {
      if ($$0 instanceof dhy) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof div ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static ghe a(dkh $$0, ghe $$1, ghe $$2, ghe $$3) {
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
