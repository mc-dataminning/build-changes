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

public class gax {
   public static final ajv a = new ajv("textures/atlas/shulker_boxes.png");
   public static final ajv b = new ajv("textures/atlas/beds.png");
   public static final ajv c = new ajv("textures/atlas/banner_patterns.png");
   public static final ajv d = new ajv("textures/atlas/shield_patterns.png");
   public static final ajv e = new ajv("textures/atlas/signs.png");
   public static final ajv f = new ajv("textures/atlas/chest.png");
   public static final ajv g = new ajv("textures/atlas/armor_trims.png");
   public static final ajv h = new ajv("textures/atlas/decorated_pot.png");
   private static final gaq A = gaq.e(a);
   private static final gaq B = gaq.c(b);
   private static final gaq C = gaq.m(c);
   private static final gaq D = gaq.m(d);
   private static final gaq E = gaq.e(e);
   private static final gaq F = gaq.d(f);
   private static final gaq G = gaq.a(g);
   private static final gaq H = gaq.b(g);
   private static final gaq I = gaq.c(glr.e);
   private static final gaq J = gaq.d(glr.e);
   private static final gaq K = gaq.g(glr.e);
   private static final gaq L = gaq.h(glr.e);
   public static final gnv i = new gnv(a, new ajv("entity/shulker/shulker"));
   public static final List<gnv> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gnv(a, new ajv("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dqv, gnv> k = dqv.a().collect(Collectors.toMap(Function.identity(), gax::c));
   public static final Map<dqv, gnv> l = dqv.a().collect(Collectors.toMap(Function.identity(), gax::d));
   public static final gnv m = new gnv(c, new ajv("entity/banner/base"));
   public static final gnv n = new gnv(d, new ajv("entity/shield/base"));
   private static final Map<ajv, gnv> M = new HashMap<>();
   private static final Map<ajv, gnv> N = new HashMap<>();
   public static final Map<aju<String>, gnv> o = kt.an.f().stream().collect(Collectors.toMap(Function.identity(), gax::b));
   public static final gnv[] p = Arrays.stream(cql.values())
      .sorted(Comparator.comparingInt(cql::a))
      .map($$0 -> new gnv(b, new ajv("entity/bed/" + $$0.b())))
      .toArray(gnv[]::new);
   public static final gnv q = a("trapped");
   public static final gnv r = a("trapped_left");
   public static final gnv s = a("trapped_right");
   public static final gnv t = a("christmas");
   public static final gnv u = a("christmas_left");
   public static final gnv v = a("christmas_right");
   public static final gnv w = a("normal");
   public static final gnv x = a("normal_left");
   public static final gnv y = a("normal_right");
   public static final gnv z = a("ender");

   public static gaq a() {
      return C;
   }

   public static gaq b() {
      return D;
   }

   public static gaq c() {
      return B;
   }

   public static gaq d() {
      return A;
   }

   public static gaq e() {
      return E;
   }

   public static gaq f() {
      return E;
   }

   public static gaq g() {
      return F;
   }

   public static gaq a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gaq h() {
      return I;
   }

   public static gaq i() {
      return J;
   }

   public static gaq j() {
      return K;
   }

   public static gaq k() {
      return L;
   }

   private static gnv c(dqv $$0) {
      return new gnv(e, new ajv("entity/signs/" + $$0.b()));
   }

   private static gnv d(dqv $$0) {
      return new gnv(e, new ajv("entity/signs/hanging/" + $$0.b()));
   }

   public static gnv a(dqv $$0) {
      return k.get($$0);
   }

   public static gnv b(dqv $$0) {
      return l.get($$0);
   }

   public static gnv a(in<dme> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         ajv $$1 = $$0x.d("entity/banner/");
         return new gnv(c, $$1);
      });
   }

   public static gnv b(in<dme> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         ajv $$1 = $$0x.d("entity/shield/");
         return new gnv(d, $$1);
      });
   }

   private static gnv a(String $$0) {
      return new gnv(f, new ajv("entity/chest/" + $$0));
   }

   private static gnv b(aju<String> $$0) {
      return new gnv(h, dnf.a($$0));
   }

   @Nullable
   public static gnv a(@Nullable aju<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gnv a(dmo $$0, dqa $$1, boolean $$2) {
      if ($$0 instanceof dnj) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof doh ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gnv a(dqa $$0, gnv $$1, gnv $$2, gnv $$3) {
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
