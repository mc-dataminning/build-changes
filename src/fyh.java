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

public class fyh {
   public static final ajh a = new ajh("textures/atlas/shulker_boxes.png");
   public static final ajh b = new ajh("textures/atlas/beds.png");
   public static final ajh c = new ajh("textures/atlas/banner_patterns.png");
   public static final ajh d = new ajh("textures/atlas/shield_patterns.png");
   public static final ajh e = new ajh("textures/atlas/signs.png");
   public static final ajh f = new ajh("textures/atlas/chest.png");
   public static final ajh g = new ajh("textures/atlas/armor_trims.png");
   public static final ajh h = new ajh("textures/atlas/decorated_pot.png");
   private static final fya A = fya.e(a);
   private static final fya B = fya.c(b);
   private static final fya C = fya.m(c);
   private static final fya D = fya.m(d);
   private static final fya E = fya.e(e);
   private static final fya F = fya.d(f);
   private static final fya G = fya.a(g);
   private static final fya H = fya.b(g);
   private static final fya I = fya.c(gjb.e);
   private static final fya J = fya.d(gjb.e);
   private static final fya K = fya.g(gjb.e);
   private static final fya L = fya.h(gjb.e);
   public static final glf i = new glf(a, new ajh("entity/shulker/shulker"));
   public static final List<glf> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new glf(a, new ajh("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<doo, glf> k = doo.a().collect(Collectors.toMap(Function.identity(), fyh::c));
   public static final Map<doo, glf> l = doo.a().collect(Collectors.toMap(Function.identity(), fyh::d));
   public static final Map<ajg<djz>, glf> m = ki.am.f().stream().collect(Collectors.toMap(Function.identity(), fyh::d));
   public static final Map<ajg<djz>, glf> n = ki.am.f().stream().collect(Collectors.toMap(Function.identity(), fyh::e));
   public static final Map<ajg<String>, glf> o = ki.ao.f().stream().collect(Collectors.toMap(Function.identity(), fyh::f));
   public static final glf[] p = Arrays.stream(cpd.values())
      .sorted(Comparator.comparingInt(cpd::a))
      .map($$0 -> new glf(b, new ajh("entity/bed/" + $$0.b())))
      .toArray(glf[]::new);
   public static final glf q = a("trapped");
   public static final glf r = a("trapped_left");
   public static final glf s = a("trapped_right");
   public static final glf t = a("christmas");
   public static final glf u = a("christmas_left");
   public static final glf v = a("christmas_right");
   public static final glf w = a("normal");
   public static final glf x = a("normal_left");
   public static final glf y = a("normal_right");
   public static final glf z = a("ender");

   public static fya a() {
      return C;
   }

   public static fya b() {
      return D;
   }

   public static fya c() {
      return B;
   }

   public static fya d() {
      return A;
   }

   public static fya e() {
      return E;
   }

   public static fya f() {
      return E;
   }

   public static fya g() {
      return F;
   }

   public static fya a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fya h() {
      return I;
   }

   public static fya i() {
      return J;
   }

   public static fya j() {
      return K;
   }

   public static fya k() {
      return L;
   }

   public static void a(Consumer<glf> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (glf $$1 : p) {
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

   private static glf c(doo $$0) {
      return new glf(e, new ajh("entity/signs/" + $$0.b()));
   }

   private static glf d(doo $$0) {
      return new glf(e, new ajh("entity/signs/hanging/" + $$0.b()));
   }

   public static glf a(doo $$0) {
      return k.get($$0);
   }

   public static glf b(doo $$0) {
      return l.get($$0);
   }

   private static glf d(ajg<djz> $$0) {
      return new glf(c, djz.a($$0, true));
   }

   public static glf a(ajg<djz> $$0) {
      return m.get($$0);
   }

   private static glf e(ajg<djz> $$0) {
      return new glf(d, djz.a($$0, false));
   }

   public static glf b(ajg<djz> $$0) {
      return n.get($$0);
   }

   private static glf a(String $$0) {
      return new glf(f, new ajh("entity/chest/" + $$0));
   }

   private static glf f(ajg<String> $$0) {
      return new glf(h, dkz.a($$0));
   }

   @Nullable
   public static glf c(@Nullable ajg<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static glf a(dki $$0, dnt $$1, boolean $$2) {
      if ($$0 instanceof dld) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dma ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static glf a(dnt $$0, glf $$1, glf $$2, glf $$3) {
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
