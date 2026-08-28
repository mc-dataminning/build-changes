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

public class geb {
   public static final ale a = new ale("textures/atlas/shulker_boxes.png");
   public static final ale b = new ale("textures/atlas/beds.png");
   public static final ale c = new ale("textures/atlas/banner_patterns.png");
   public static final ale d = new ale("textures/atlas/shield_patterns.png");
   public static final ale e = new ale("textures/atlas/signs.png");
   public static final ale f = new ale("textures/atlas/chest.png");
   public static final ale g = new ale("textures/atlas/armor_trims.png");
   public static final ale h = new ale("textures/atlas/decorated_pot.png");
   private static final gdu A = gdu.e(a);
   private static final gdu B = gdu.c(b);
   private static final gdu C = gdu.m(c);
   private static final gdu D = gdu.m(d);
   private static final gdu E = gdu.e(e);
   private static final gdu F = gdu.d(f);
   private static final gdu G = gdu.a(g);
   private static final gdu H = gdu.b(g);
   private static final gdu I = gdu.c(gow.e);
   private static final gdu J = gdu.d(gow.e);
   private static final gdu K = gdu.g(gow.e);
   private static final gdu L = gdu.h(gow.e);
   public static final grb i = new grb(a, new ale("entity/shulker/shulker"));
   public static final List<grb> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new grb(a, new ale("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dtn, grb> k = dtn.a().collect(Collectors.toMap(Function.identity(), geb::c));
   public static final Map<dtn, grb> l = dtn.a().collect(Collectors.toMap(Function.identity(), geb::d));
   public static final grb m = new grb(c, new ale("entity/banner/base"));
   public static final grb n = new grb(d, new ale("entity/shield/base"));
   private static final Map<ale, grb> M = new HashMap<>();
   private static final Map<ale, grb> N = new HashMap<>();
   public static final Map<ald<String>, grb> o = lp.an.f().stream().collect(Collectors.toMap(Function.identity(), geb::b));
   public static final grb[] p = Arrays.stream(ctg.values())
      .sorted(Comparator.comparingInt(ctg::a))
      .map($$0 -> new grb(b, new ale("entity/bed/" + $$0.b())))
      .toArray(grb[]::new);
   public static final grb q = a("trapped");
   public static final grb r = a("trapped_left");
   public static final grb s = a("trapped_right");
   public static final grb t = a("christmas");
   public static final grb u = a("christmas_left");
   public static final grb v = a("christmas_right");
   public static final grb w = a("normal");
   public static final grb x = a("normal_left");
   public static final grb y = a("normal_right");
   public static final grb z = a("ender");

   public static gdu a() {
      return C;
   }

   public static gdu b() {
      return D;
   }

   public static gdu c() {
      return B;
   }

   public static gdu d() {
      return A;
   }

   public static gdu e() {
      return E;
   }

   public static gdu f() {
      return E;
   }

   public static gdu g() {
      return F;
   }

   public static gdu a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gdu h() {
      return I;
   }

   public static gdu i() {
      return J;
   }

   public static gdu j() {
      return K;
   }

   public static gdu k() {
      return L;
   }

   private static grb c(dtn $$0) {
      return new grb(e, new ale("entity/signs/" + $$0.b()));
   }

   private static grb d(dtn $$0) {
      return new grb(e, new ale("entity/signs/hanging/" + $$0.b()));
   }

   public static grb a(dtn $$0) {
      return k.get($$0);
   }

   public static grb b(dtn $$0) {
      return l.get($$0);
   }

   public static grb a(ji<dov> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         ale $$1 = $$0x.d("entity/banner/");
         return new grb(c, $$1);
      });
   }

   public static grb b(ji<dov> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         ale $$1 = $$0x.d("entity/shield/");
         return new grb(d, $$1);
      });
   }

   private static grb a(String $$0) {
      return new grb(f, new ale("entity/chest/" + $$0));
   }

   private static grb b(ald<String> $$0) {
      return new grb(h, dpw.a($$0));
   }

   @Nullable
   public static grb a(@Nullable ald<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static grb a(dpf $$0, dss $$1, boolean $$2) {
      if ($$0 instanceof dqa) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dqy ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static grb a(dss $$0, grb $$1, grb $$2, grb $$3) {
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
