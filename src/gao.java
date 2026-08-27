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

public class gao {
   public static final ajt a = new ajt("textures/atlas/shulker_boxes.png");
   public static final ajt b = new ajt("textures/atlas/beds.png");
   public static final ajt c = new ajt("textures/atlas/banner_patterns.png");
   public static final ajt d = new ajt("textures/atlas/shield_patterns.png");
   public static final ajt e = new ajt("textures/atlas/signs.png");
   public static final ajt f = new ajt("textures/atlas/chest.png");
   public static final ajt g = new ajt("textures/atlas/armor_trims.png");
   public static final ajt h = new ajt("textures/atlas/decorated_pot.png");
   private static final gah A = gah.e(a);
   private static final gah B = gah.c(b);
   private static final gah C = gah.m(c);
   private static final gah D = gah.m(d);
   private static final gah E = gah.e(e);
   private static final gah F = gah.d(f);
   private static final gah G = gah.a(g);
   private static final gah H = gah.b(g);
   private static final gah I = gah.c(gli.e);
   private static final gah J = gah.d(gli.e);
   private static final gah K = gah.g(gli.e);
   private static final gah L = gah.h(gli.e);
   public static final gnm i = new gnm(a, new ajt("entity/shulker/shulker"));
   public static final List<gnm> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gnm(a, new ajt("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dqm, gnm> k = dqm.a().collect(Collectors.toMap(Function.identity(), gao::c));
   public static final Map<dqm, gnm> l = dqm.a().collect(Collectors.toMap(Function.identity(), gao::d));
   public static final Map<ajs<dlv>, gnm> m = kr.am.f().stream().collect(Collectors.toMap(Function.identity(), gao::d));
   public static final Map<ajs<dlv>, gnm> n = kr.am.f().stream().collect(Collectors.toMap(Function.identity(), gao::e));
   public static final Map<ajs<String>, gnm> o = kr.ao.f().stream().collect(Collectors.toMap(Function.identity(), gao::f));
   public static final gnm[] p = Arrays.stream(cqc.values())
      .sorted(Comparator.comparingInt(cqc::a))
      .map($$0 -> new gnm(b, new ajt("entity/bed/" + $$0.b())))
      .toArray(gnm[]::new);
   public static final gnm q = a("trapped");
   public static final gnm r = a("trapped_left");
   public static final gnm s = a("trapped_right");
   public static final gnm t = a("christmas");
   public static final gnm u = a("christmas_left");
   public static final gnm v = a("christmas_right");
   public static final gnm w = a("normal");
   public static final gnm x = a("normal_left");
   public static final gnm y = a("normal_right");
   public static final gnm z = a("ender");

   public static gah a() {
      return C;
   }

   public static gah b() {
      return D;
   }

   public static gah c() {
      return B;
   }

   public static gah d() {
      return A;
   }

   public static gah e() {
      return E;
   }

   public static gah f() {
      return E;
   }

   public static gah g() {
      return F;
   }

   public static gah a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gah h() {
      return I;
   }

   public static gah i() {
      return J;
   }

   public static gah j() {
      return K;
   }

   public static gah k() {
      return L;
   }

   public static void a(Consumer<gnm> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gnm $$1 : p) {
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

   private static gnm c(dqm $$0) {
      return new gnm(e, new ajt("entity/signs/" + $$0.b()));
   }

   private static gnm d(dqm $$0) {
      return new gnm(e, new ajt("entity/signs/hanging/" + $$0.b()));
   }

   public static gnm a(dqm $$0) {
      return k.get($$0);
   }

   public static gnm b(dqm $$0) {
      return l.get($$0);
   }

   private static gnm d(ajs<dlv> $$0) {
      return new gnm(c, dlv.a($$0, true));
   }

   public static gnm a(ajs<dlv> $$0) {
      return m.get($$0);
   }

   private static gnm e(ajs<dlv> $$0) {
      return new gnm(d, dlv.a($$0, false));
   }

   public static gnm b(ajs<dlv> $$0) {
      return n.get($$0);
   }

   private static gnm a(String $$0) {
      return new gnm(f, new ajt("entity/chest/" + $$0));
   }

   private static gnm f(ajs<String> $$0) {
      return new gnm(h, dmw.a($$0));
   }

   @Nullable
   public static gnm c(@Nullable ajs<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gnm a(dmf $$0, dpr $$1, boolean $$2) {
      if ($$0 instanceof dna) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dny ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gnm a(dpr $$0, gnm $$1, gnm $$2, gnm $$3) {
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
