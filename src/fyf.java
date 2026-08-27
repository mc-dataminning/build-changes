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

public class fyf {
   public static final ajh a = new ajh("textures/atlas/shulker_boxes.png");
   public static final ajh b = new ajh("textures/atlas/beds.png");
   public static final ajh c = new ajh("textures/atlas/banner_patterns.png");
   public static final ajh d = new ajh("textures/atlas/shield_patterns.png");
   public static final ajh e = new ajh("textures/atlas/signs.png");
   public static final ajh f = new ajh("textures/atlas/chest.png");
   public static final ajh g = new ajh("textures/atlas/armor_trims.png");
   public static final ajh h = new ajh("textures/atlas/decorated_pot.png");
   private static final fxy A = fxy.e(a);
   private static final fxy B = fxy.c(b);
   private static final fxy C = fxy.m(c);
   private static final fxy D = fxy.m(d);
   private static final fxy E = fxy.e(e);
   private static final fxy F = fxy.d(f);
   private static final fxy G = fxy.a(g);
   private static final fxy H = fxy.b(g);
   private static final fxy I = fxy.c(giy.e);
   private static final fxy J = fxy.d(giy.e);
   private static final fxy K = fxy.g(giy.e);
   private static final fxy L = fxy.h(giy.e);
   public static final glc i = new glc(a, new ajh("entity/shulker/shulker"));
   public static final List<glc> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new glc(a, new ajh("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dom, glc> k = dom.a().collect(Collectors.toMap(Function.identity(), fyf::c));
   public static final Map<dom, glc> l = dom.a().collect(Collectors.toMap(Function.identity(), fyf::d));
   public static final Map<ajg<djx>, glc> m = ki.am.f().stream().collect(Collectors.toMap(Function.identity(), fyf::d));
   public static final Map<ajg<djx>, glc> n = ki.am.f().stream().collect(Collectors.toMap(Function.identity(), fyf::e));
   public static final Map<ajg<String>, glc> o = ki.ao.f().stream().collect(Collectors.toMap(Function.identity(), fyf::f));
   public static final glc[] p = Arrays.stream(cpb.values())
      .sorted(Comparator.comparingInt(cpb::a))
      .map($$0 -> new glc(b, new ajh("entity/bed/" + $$0.b())))
      .toArray(glc[]::new);
   public static final glc q = a("trapped");
   public static final glc r = a("trapped_left");
   public static final glc s = a("trapped_right");
   public static final glc t = a("christmas");
   public static final glc u = a("christmas_left");
   public static final glc v = a("christmas_right");
   public static final glc w = a("normal");
   public static final glc x = a("normal_left");
   public static final glc y = a("normal_right");
   public static final glc z = a("ender");

   public static fxy a() {
      return C;
   }

   public static fxy b() {
      return D;
   }

   public static fxy c() {
      return B;
   }

   public static fxy d() {
      return A;
   }

   public static fxy e() {
      return E;
   }

   public static fxy f() {
      return E;
   }

   public static fxy g() {
      return F;
   }

   public static fxy a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fxy h() {
      return I;
   }

   public static fxy i() {
      return J;
   }

   public static fxy j() {
      return K;
   }

   public static fxy k() {
      return L;
   }

   public static void a(Consumer<glc> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (glc $$1 : p) {
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

   private static glc c(dom $$0) {
      return new glc(e, new ajh("entity/signs/" + $$0.b()));
   }

   private static glc d(dom $$0) {
      return new glc(e, new ajh("entity/signs/hanging/" + $$0.b()));
   }

   public static glc a(dom $$0) {
      return k.get($$0);
   }

   public static glc b(dom $$0) {
      return l.get($$0);
   }

   private static glc d(ajg<djx> $$0) {
      return new glc(c, djx.a($$0, true));
   }

   public static glc a(ajg<djx> $$0) {
      return m.get($$0);
   }

   private static glc e(ajg<djx> $$0) {
      return new glc(d, djx.a($$0, false));
   }

   public static glc b(ajg<djx> $$0) {
      return n.get($$0);
   }

   private static glc a(String $$0) {
      return new glc(f, new ajh("entity/chest/" + $$0));
   }

   private static glc f(ajg<String> $$0) {
      return new glc(h, dkx.a($$0));
   }

   @Nullable
   public static glc c(@Nullable ajg<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static glc a(dkg $$0, dnr $$1, boolean $$2) {
      if ($$0 instanceof dlb) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dly ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static glc a(dnr $$0, glc $$1, glc $$2, glc $$3) {
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
