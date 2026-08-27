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

public class fxf {
   public static final ajc a = new ajc("textures/atlas/shulker_boxes.png");
   public static final ajc b = new ajc("textures/atlas/beds.png");
   public static final ajc c = new ajc("textures/atlas/banner_patterns.png");
   public static final ajc d = new ajc("textures/atlas/shield_patterns.png");
   public static final ajc e = new ajc("textures/atlas/signs.png");
   public static final ajc f = new ajc("textures/atlas/chest.png");
   public static final ajc g = new ajc("textures/atlas/armor_trims.png");
   public static final ajc h = new ajc("textures/atlas/decorated_pot.png");
   private static final fwy A = fwy.e(a);
   private static final fwy B = fwy.c(b);
   private static final fwy C = fwy.m(c);
   private static final fwy D = fwy.m(d);
   private static final fwy E = fwy.e(e);
   private static final fwy F = fwy.d(f);
   private static final fwy G = fwy.a(g);
   private static final fwy H = fwy.b(g);
   private static final fwy I = fwy.c(ghy.e);
   private static final fwy J = fwy.d(ghy.e);
   private static final fwy K = fwy.g(ghy.e);
   private static final fwy L = fwy.h(ghy.e);
   public static final gkc i = new gkc(a, new ajc("entity/shulker/shulker"));
   public static final List<gkc> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gkc(a, new ajc("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dnr, gkc> k = dnr.a().collect(Collectors.toMap(Function.identity(), fxf::c));
   public static final Map<dnr, gkc> l = dnr.a().collect(Collectors.toMap(Function.identity(), fxf::d));
   public static final Map<ajb<djc>, gkc> m = kh.am.f().stream().collect(Collectors.toMap(Function.identity(), fxf::d));
   public static final Map<ajb<djc>, gkc> n = kh.am.f().stream().collect(Collectors.toMap(Function.identity(), fxf::e));
   public static final Map<ajb<String>, gkc> o = kh.ao.f().stream().collect(Collectors.toMap(Function.identity(), fxf::f));
   public static final gkc[] p = Arrays.stream(cog.values())
      .sorted(Comparator.comparingInt(cog::a))
      .map($$0 -> new gkc(b, new ajc("entity/bed/" + $$0.b())))
      .toArray(gkc[]::new);
   public static final gkc q = a("trapped");
   public static final gkc r = a("trapped_left");
   public static final gkc s = a("trapped_right");
   public static final gkc t = a("christmas");
   public static final gkc u = a("christmas_left");
   public static final gkc v = a("christmas_right");
   public static final gkc w = a("normal");
   public static final gkc x = a("normal_left");
   public static final gkc y = a("normal_right");
   public static final gkc z = a("ender");

   public static fwy a() {
      return C;
   }

   public static fwy b() {
      return D;
   }

   public static fwy c() {
      return B;
   }

   public static fwy d() {
      return A;
   }

   public static fwy e() {
      return E;
   }

   public static fwy f() {
      return E;
   }

   public static fwy g() {
      return F;
   }

   public static fwy a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fwy h() {
      return I;
   }

   public static fwy i() {
      return J;
   }

   public static fwy j() {
      return K;
   }

   public static fwy k() {
      return L;
   }

   public static void a(Consumer<gkc> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gkc $$1 : p) {
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

   private static gkc c(dnr $$0) {
      return new gkc(e, new ajc("entity/signs/" + $$0.b()));
   }

   private static gkc d(dnr $$0) {
      return new gkc(e, new ajc("entity/signs/hanging/" + $$0.b()));
   }

   public static gkc a(dnr $$0) {
      return k.get($$0);
   }

   public static gkc b(dnr $$0) {
      return l.get($$0);
   }

   private static gkc d(ajb<djc> $$0) {
      return new gkc(c, djc.a($$0, true));
   }

   public static gkc a(ajb<djc> $$0) {
      return m.get($$0);
   }

   private static gkc e(ajb<djc> $$0) {
      return new gkc(d, djc.a($$0, false));
   }

   public static gkc b(ajb<djc> $$0) {
      return n.get($$0);
   }

   private static gkc a(String $$0) {
      return new gkc(f, new ajc("entity/chest/" + $$0));
   }

   private static gkc f(ajb<String> $$0) {
      return new gkc(h, dkc.a($$0));
   }

   @Nullable
   public static gkc c(@Nullable ajb<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gkc a(djl $$0, dmw $$1, boolean $$2) {
      if ($$0 instanceof dkg) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dld ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gkc a(dmw $$0, gkc $$1, gkc $$2, gkc $$3) {
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
