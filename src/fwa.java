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

public class fwa {
   public static final aiy a = new aiy("textures/atlas/shulker_boxes.png");
   public static final aiy b = new aiy("textures/atlas/beds.png");
   public static final aiy c = new aiy("textures/atlas/banner_patterns.png");
   public static final aiy d = new aiy("textures/atlas/shield_patterns.png");
   public static final aiy e = new aiy("textures/atlas/signs.png");
   public static final aiy f = new aiy("textures/atlas/chest.png");
   public static final aiy g = new aiy("textures/atlas/armor_trims.png");
   public static final aiy h = new aiy("textures/atlas/decorated_pot.png");
   private static final fvt A = fvt.e(a);
   private static final fvt B = fvt.c(b);
   private static final fvt C = fvt.m(c);
   private static final fvt D = fvt.m(d);
   private static final fvt E = fvt.e(e);
   private static final fvt F = fvt.d(f);
   private static final fvt G = fvt.a(g);
   private static final fvt H = fvt.b(g);
   private static final fvt I = fvt.c(ggs.e);
   private static final fvt J = fvt.d(ggs.e);
   private static final fvt K = fvt.g(ggs.e);
   private static final fvt L = fvt.h(ggs.e);
   public static final giw i = new giw(a, new aiy("entity/shulker/shulker"));
   public static final List<giw> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new giw(a, new aiy("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dms, giw> k = dms.a().collect(Collectors.toMap(Function.identity(), fwa::c));
   public static final Map<dms, giw> l = dms.a().collect(Collectors.toMap(Function.identity(), fwa::d));
   public static final Map<aix<dik>, giw> m = kf.am.f().stream().collect(Collectors.toMap(Function.identity(), fwa::d));
   public static final Map<aix<dik>, giw> n = kf.am.f().stream().collect(Collectors.toMap(Function.identity(), fwa::e));
   public static final Map<aix<String>, giw> o = kf.ao.f().stream().collect(Collectors.toMap(Function.identity(), fwa::f));
   public static final giw[] p = Arrays.stream(cnn.values())
      .sorted(Comparator.comparingInt(cnn::a))
      .map($$0 -> new giw(b, new aiy("entity/bed/" + $$0.b())))
      .toArray(giw[]::new);
   public static final giw q = a("trapped");
   public static final giw r = a("trapped_left");
   public static final giw s = a("trapped_right");
   public static final giw t = a("christmas");
   public static final giw u = a("christmas_left");
   public static final giw v = a("christmas_right");
   public static final giw w = a("normal");
   public static final giw x = a("normal_left");
   public static final giw y = a("normal_right");
   public static final giw z = a("ender");

   public static fvt a() {
      return C;
   }

   public static fvt b() {
      return D;
   }

   public static fvt c() {
      return B;
   }

   public static fvt d() {
      return A;
   }

   public static fvt e() {
      return E;
   }

   public static fvt f() {
      return E;
   }

   public static fvt g() {
      return F;
   }

   public static fvt a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fvt h() {
      return I;
   }

   public static fvt i() {
      return J;
   }

   public static fvt j() {
      return K;
   }

   public static fvt k() {
      return L;
   }

   public static void a(Consumer<giw> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (giw $$1 : p) {
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

   private static giw c(dms $$0) {
      return new giw(e, new aiy("entity/signs/" + $$0.b()));
   }

   private static giw d(dms $$0) {
      return new giw(e, new aiy("entity/signs/hanging/" + $$0.b()));
   }

   public static giw a(dms $$0) {
      return k.get($$0);
   }

   public static giw b(dms $$0) {
      return l.get($$0);
   }

   private static giw d(aix<dik> $$0) {
      return new giw(c, dik.a($$0, true));
   }

   public static giw a(aix<dik> $$0) {
      return m.get($$0);
   }

   private static giw e(aix<dik> $$0) {
      return new giw(d, dik.a($$0, false));
   }

   public static giw b(aix<dik> $$0) {
      return n.get($$0);
   }

   private static giw a(String $$0) {
      return new giw(f, new aiy("entity/chest/" + $$0));
   }

   private static giw f(aix<String> $$0) {
      return new giw(h, djk.a($$0));
   }

   @Nullable
   public static giw c(@Nullable aix<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static giw a(dit $$0, dlx $$1, boolean $$2) {
      if ($$0 instanceof djo) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dkl ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static giw a(dlx $$0, giw $$1, giw $$2, giw $$3) {
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
