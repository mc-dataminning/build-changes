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

public class fwb {
   public static final aiy a = new aiy("textures/atlas/shulker_boxes.png");
   public static final aiy b = new aiy("textures/atlas/beds.png");
   public static final aiy c = new aiy("textures/atlas/banner_patterns.png");
   public static final aiy d = new aiy("textures/atlas/shield_patterns.png");
   public static final aiy e = new aiy("textures/atlas/signs.png");
   public static final aiy f = new aiy("textures/atlas/chest.png");
   public static final aiy g = new aiy("textures/atlas/armor_trims.png");
   public static final aiy h = new aiy("textures/atlas/decorated_pot.png");
   private static final fvu A = fvu.e(a);
   private static final fvu B = fvu.c(b);
   private static final fvu C = fvu.m(c);
   private static final fvu D = fvu.m(d);
   private static final fvu E = fvu.e(e);
   private static final fvu F = fvu.d(f);
   private static final fvu G = fvu.a(g);
   private static final fvu H = fvu.b(g);
   private static final fvu I = fvu.c(ggt.e);
   private static final fvu J = fvu.d(ggt.e);
   private static final fvu K = fvu.g(ggt.e);
   private static final fvu L = fvu.h(ggt.e);
   public static final gix i = new gix(a, new aiy("entity/shulker/shulker"));
   public static final List<gix> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gix(a, new aiy("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dms, gix> k = dms.a().collect(Collectors.toMap(Function.identity(), fwb::c));
   public static final Map<dms, gix> l = dms.a().collect(Collectors.toMap(Function.identity(), fwb::d));
   public static final Map<aix<dik>, gix> m = kf.am.f().stream().collect(Collectors.toMap(Function.identity(), fwb::d));
   public static final Map<aix<dik>, gix> n = kf.am.f().stream().collect(Collectors.toMap(Function.identity(), fwb::e));
   public static final Map<aix<String>, gix> o = kf.ao.f().stream().collect(Collectors.toMap(Function.identity(), fwb::f));
   public static final gix[] p = Arrays.stream(cnn.values())
      .sorted(Comparator.comparingInt(cnn::a))
      .map($$0 -> new gix(b, new aiy("entity/bed/" + $$0.b())))
      .toArray(gix[]::new);
   public static final gix q = a("trapped");
   public static final gix r = a("trapped_left");
   public static final gix s = a("trapped_right");
   public static final gix t = a("christmas");
   public static final gix u = a("christmas_left");
   public static final gix v = a("christmas_right");
   public static final gix w = a("normal");
   public static final gix x = a("normal_left");
   public static final gix y = a("normal_right");
   public static final gix z = a("ender");

   public static fvu a() {
      return C;
   }

   public static fvu b() {
      return D;
   }

   public static fvu c() {
      return B;
   }

   public static fvu d() {
      return A;
   }

   public static fvu e() {
      return E;
   }

   public static fvu f() {
      return E;
   }

   public static fvu g() {
      return F;
   }

   public static fvu a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static fvu h() {
      return I;
   }

   public static fvu i() {
      return J;
   }

   public static fvu j() {
      return K;
   }

   public static fvu k() {
      return L;
   }

   public static void a(Consumer<gix> $$0) {
      $$0.accept(i);
      j.forEach($$0);
      m.values().forEach($$0);
      n.values().forEach($$0);
      k.values().forEach($$0);
      l.values().forEach($$0);

      for (gix $$1 : p) {
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

   private static gix c(dms $$0) {
      return new gix(e, new aiy("entity/signs/" + $$0.b()));
   }

   private static gix d(dms $$0) {
      return new gix(e, new aiy("entity/signs/hanging/" + $$0.b()));
   }

   public static gix a(dms $$0) {
      return k.get($$0);
   }

   public static gix b(dms $$0) {
      return l.get($$0);
   }

   private static gix d(aix<dik> $$0) {
      return new gix(c, dik.a($$0, true));
   }

   public static gix a(aix<dik> $$0) {
      return m.get($$0);
   }

   private static gix e(aix<dik> $$0) {
      return new gix(d, dik.a($$0, false));
   }

   public static gix b(aix<dik> $$0) {
      return n.get($$0);
   }

   private static gix a(String $$0) {
      return new gix(f, new aiy("entity/chest/" + $$0));
   }

   private static gix f(aix<String> $$0) {
      return new gix(h, djk.a($$0));
   }

   @Nullable
   public static gix c(@Nullable aix<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gix a(dit $$0, dlx $$1, boolean $$2) {
      if ($$0 instanceof djo) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dkl ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gix a(dlx $$0, gix $$1, gix $$2, gix $$3) {
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
