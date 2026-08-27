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

public class gcz {
   public static final akm a = new akm("textures/atlas/shulker_boxes.png");
   public static final akm b = new akm("textures/atlas/beds.png");
   public static final akm c = new akm("textures/atlas/banner_patterns.png");
   public static final akm d = new akm("textures/atlas/shield_patterns.png");
   public static final akm e = new akm("textures/atlas/signs.png");
   public static final akm f = new akm("textures/atlas/chest.png");
   public static final akm g = new akm("textures/atlas/armor_trims.png");
   public static final akm h = new akm("textures/atlas/decorated_pot.png");
   private static final gcs A = gcs.e(a);
   private static final gcs B = gcs.c(b);
   private static final gcs C = gcs.m(c);
   private static final gcs D = gcs.m(d);
   private static final gcs E = gcs.e(e);
   private static final gcs F = gcs.d(f);
   private static final gcs G = gcs.a(g);
   private static final gcs H = gcs.b(g);
   private static final gcs I = gcs.c(gnu.e);
   private static final gcs J = gcs.d(gnu.e);
   private static final gcs K = gcs.g(gnu.e);
   private static final gcs L = gcs.h(gnu.e);
   public static final gpz i = new gpz(a, new akm("entity/shulker/shulker"));
   public static final List<gpz> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gpz(a, new akm("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dso, gpz> k = dso.a().collect(Collectors.toMap(Function.identity(), gcz::c));
   public static final Map<dso, gpz> l = dso.a().collect(Collectors.toMap(Function.identity(), gcz::d));
   public static final gpz m = new gpz(c, new akm("entity/banner/base"));
   public static final gpz n = new gpz(d, new akm("entity/shield/base"));
   private static final Map<akm, gpz> M = new HashMap<>();
   private static final Map<akm, gpz> N = new HashMap<>();
   public static final Map<akl<String>, gpz> o = le.an.f().stream().collect(Collectors.toMap(Function.identity(), gcz::b));
   public static final gpz[] p = Arrays.stream(csh.values())
      .sorted(Comparator.comparingInt(csh::a))
      .map($$0 -> new gpz(b, new akm("entity/bed/" + $$0.b())))
      .toArray(gpz[]::new);
   public static final gpz q = a("trapped");
   public static final gpz r = a("trapped_left");
   public static final gpz s = a("trapped_right");
   public static final gpz t = a("christmas");
   public static final gpz u = a("christmas_left");
   public static final gpz v = a("christmas_right");
   public static final gpz w = a("normal");
   public static final gpz x = a("normal_left");
   public static final gpz y = a("normal_right");
   public static final gpz z = a("ender");

   public static gcs a() {
      return C;
   }

   public static gcs b() {
      return D;
   }

   public static gcs c() {
      return B;
   }

   public static gcs d() {
      return A;
   }

   public static gcs e() {
      return E;
   }

   public static gcs f() {
      return E;
   }

   public static gcs g() {
      return F;
   }

   public static gcs a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gcs h() {
      return I;
   }

   public static gcs i() {
      return J;
   }

   public static gcs j() {
      return K;
   }

   public static gcs k() {
      return L;
   }

   private static gpz c(dso $$0) {
      return new gpz(e, new akm("entity/signs/" + $$0.b()));
   }

   private static gpz d(dso $$0) {
      return new gpz(e, new akm("entity/signs/hanging/" + $$0.b()));
   }

   public static gpz a(dso $$0) {
      return k.get($$0);
   }

   public static gpz b(dso $$0) {
      return l.get($$0);
   }

   public static gpz a(ix<dnw> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         akm $$1 = $$0x.d("entity/banner/");
         return new gpz(c, $$1);
      });
   }

   public static gpz b(ix<dnw> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         akm $$1 = $$0x.d("entity/shield/");
         return new gpz(d, $$1);
      });
   }

   private static gpz a(String $$0) {
      return new gpz(f, new akm("entity/chest/" + $$0));
   }

   private static gpz b(akl<String> $$0) {
      return new gpz(h, dox.a($$0));
   }

   @Nullable
   public static gpz a(@Nullable akl<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gpz a(dog $$0, drt $$1, boolean $$2) {
      if ($$0 instanceof dpb) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dpz ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gpz a(drt $$0, gpz $$1, gpz $$2, gpz $$3) {
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
