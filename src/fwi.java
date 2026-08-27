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

public class fwi {
   public static final aiy a = new aiy("textures/atlas/shulker_boxes.png");
   public static final aiy b = new aiy("textures/atlas/beds.png");
   public static final aiy c = new aiy("textures/atlas/banner_patterns.png");
   public static final aiy d = new aiy("textures/atlas/shield_patterns.png");
   public static final aiy e = new aiy("textures/atlas/signs.png");
   public static final aiy f = new aiy("textures/atlas/chest.png");
   public static final aiy g = new aiy("textures/atlas/armor_trims.png");
   public static final aiy h = new aiy("textures/atlas/decorated_pot.png");
   private static final fwb A = fwb.e(a);
   private static final fwb B = fwb.c(b);
   private static final fwb C = fwb.m(c);
   private static final fwb D = fwb.m(d);
   private static final fwb E = fwb.e(e);
   private static final fwb F = fwb.d(f);
   private static final fwb G = fwb.a(g);
   private static final fwb H = fwb.b(g);
   private static final fwb I = fwb.c(gha.e);
   private static final fwb J = fwb.d(gha.e);
   private static final fwb K = fwb.g(gha.e);
   private static final fwb L = fwb.h(gha.e);
   public static final gje i = new gje(a, new aiy("entity/shulker/shulker"));
   public static final List<gje> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gje(a, new aiy("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dmw, gje> k = dmw.a().collect(Collectors.toMap(Function.identity(), fwi::c));
   public static final Map<dmw, gje> l = dmw.a().collect(Collectors.toMap(Function.identity(), fwi::d));
   public static final Map<aix<dio>, gje> m = kf.am.f().stream().collect(Collectors.toMap(Function.identity(), fwi::d));
   public static final Map<aix<dio>, gje> n = kf.am.f().stream().collect(Collectors.toMap(Function.identity(), fwi::e));
   public static final Map<aix<String>, gje> o = kf.ao.f().stream().collect(Collectors.toMap(Function.identity(), fwi::f));
   public static final gje[] p = Arrays.stream(cnr.values())
      .sorted(Comparator.comparingInt(cnr::a))
      .map($$0 -> new gje(b, new aiy("entity/bed/" + $$0.b())))
      .toArray(gje[]::new);
   public static final gje q = a("trapped");
   public static final gje r = a("trapped_left");
   public static final gje s = a("trapped_right");
   public static final gje t = a("christmas");
   public static final gje u = a("christmas_left");
   public static final gje v = a("christmas_right");
   public static final gje w = a("normal");
   public static final gje x = a("normal_left");
   public static final gje y = a("normal_right");
   public static final gje z = a("ender");

   public static fwb a() {
      return C;
   }

   public static fwb b() {
      return D;
   }

   public static fwb c() {
      return B;
   }

   public static fwb d() {
      return A;
   }

   public static fwb e() {
      return E;
   }

   public static fwb f() {
      return E;
   }

   public static fwb g() {
      return F;
   }

   public static fwb a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fwb h() {
      return I;
   }

   public static fwb i() {
      return J;
   }

   public static fwb j() {
      return K;
   }

   public static fwb k() {
      return L;
   }

   public static void a(Consumer<gje> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gje $$1 : p) {
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

   private static gje c(dmw $$0) {
      return new gje(e, new aiy("entity/signs/" + $$0.b()));
   }

   private static gje d(dmw $$0) {
      return new gje(e, new aiy("entity/signs/hanging/" + $$0.b()));
   }

   public static gje a(dmw $$0) {
      return k.get($$0);
   }

   public static gje b(dmw $$0) {
      return l.get($$0);
   }

   private static gje d(aix<dio> $$0) {
      return new gje(c, dio.a($$0, true));
   }

   public static gje a(aix<dio> $$0) {
      return m.get($$0);
   }

   private static gje e(aix<dio> $$0) {
      return new gje(d, dio.a($$0, false));
   }

   public static gje b(aix<dio> $$0) {
      return n.get($$0);
   }

   private static gje a(String $$0) {
      return new gje(f, new aiy("entity/chest/" + $$0));
   }

   private static gje f(aix<String> $$0) {
      return new gje(h, djo.a($$0));
   }

   @Nullable
   public static gje c(@Nullable aix<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gje a(dix $$0, dmb $$1, boolean $$2) {
      if ($$0 instanceof djs) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dkp ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gje a(dmb $$0, gje $$1, gje $$2, gje $$3) {
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
