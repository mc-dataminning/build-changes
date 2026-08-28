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

public class glz {
   public static final alz a = alz.b("textures/atlas/shulker_boxes.png");
   public static final alz b = alz.b("textures/atlas/beds.png");
   public static final alz c = alz.b("textures/atlas/banner_patterns.png");
   public static final alz d = alz.b("textures/atlas/shield_patterns.png");
   public static final alz e = alz.b("textures/atlas/signs.png");
   public static final alz f = alz.b("textures/atlas/chest.png");
   public static final alz g = alz.b("textures/atlas/armor_trims.png");
   public static final alz h = alz.b("textures/atlas/decorated_pot.png");
   private static final glo C = glo.f(a);
   private static final glo D = glo.c(b);
   private static final glo E = glo.m(c);
   private static final glo F = glo.m(d);
   private static final glo G = glo.f(e);
   private static final glo H = glo.e(f);
   private static final glo I = glo.a(g);
   private static final glo J = glo.b(g);
   private static final glo K = glo.c(hbd.d);
   private static final glo L = glo.e(hbd.d);
   private static final glo M = glo.h(hbd.d);
   public static final hdn i = new hdn(a, alz.b("entity/shulker/shulker"));
   public static final List<hdn> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new hdn(a, alz.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dyz, hdn> k = dyz.a().collect(Collectors.toMap(Function.identity(), glz::c));
   public static final Map<dyz, hdn> l = dyz.a().collect(Collectors.toMap(Function.identity(), glz::d));
   public static final hdn m = new hdn(c, alz.b("entity/banner/base"));
   public static final hdn n = new hdn(d, alz.b("entity/shield/base"));
   private static final Map<alz, hdn> N = new HashMap<>();
   private static final Map<alz, hdn> O = new HashMap<>();
   public static final Map<aly<dvh>, hdn> o = ma.ak.c().collect(Collectors.toMap(jq.c::h, $$0 -> a($$0.a().a())));
   public static final hdn p = a(alz.b("decorated_pot_base"));
   public static final hdn q = a(alz.b("decorated_pot_side"));
   public static final hdn[] r = Arrays.stream(cwh.values())
      .sorted(Comparator.comparingInt(cwh::a))
      .map($$0 -> new hdn(b, alz.b("entity/bed/" + $$0.b())))
      .toArray(hdn[]::new);
   public static final hdn s = a("trapped");
   public static final hdn t = a("trapped_left");
   public static final hdn u = a("trapped_right");
   public static final hdn v = a("christmas");
   public static final hdn w = a("christmas_left");
   public static final hdn x = a("christmas_right");
   public static final hdn y = a("normal");
   public static final hdn z = a("normal_left");
   public static final hdn A = a("normal_right");
   public static final hdn B = a("ender");

   public static glo a() {
      return E;
   }

   public static glo b() {
      return F;
   }

   public static glo c() {
      return D;
   }

   public static glo d() {
      return C;
   }

   public static glo e() {
      return G;
   }

   public static glo f() {
      return G;
   }

   public static glo g() {
      return H;
   }

   public static glo a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static glo h() {
      return K;
   }

   public static glo i() {
      return L;
   }

   public static glo j() {
      return M;
   }

   private static hdn c(dyz $$0) {
      return new hdn(e, alz.b("entity/signs/" + $$0.b()));
   }

   private static hdn d(dyz $$0) {
      return new hdn(e, alz.b("entity/signs/hanging/" + $$0.b()));
   }

   public static hdn a(dyz $$0) {
      return k.get($$0);
   }

   public static hdn b(dyz $$0) {
      return l.get($$0);
   }

   public static hdn a(jq<duf> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alz $$1 = $$0x.f("entity/banner/");
         return new hdn(c, $$1);
      });
   }

   public static hdn b(jq<duf> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         alz $$1 = $$0x.f("entity/shield/");
         return new hdn(d, $$1);
      });
   }

   private static hdn a(String $$0) {
      return new hdn(f, alz.b("entity/chest/" + $$0));
   }

   private static hdn a(alz $$0) {
      return new hdn(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hdn a(@Nullable aly<dvh> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hdn a(dup $$0, dyf $$1, boolean $$2) {
      if ($$0 instanceof dvm) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dwl ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static hdn a(dyf $$0, hdn $$1, hdn $$2, hdn $$3) {
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
