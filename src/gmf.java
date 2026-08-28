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

public class gmf {
   public static final alz a = alz.b("textures/atlas/shulker_boxes.png");
   public static final alz b = alz.b("textures/atlas/beds.png");
   public static final alz c = alz.b("textures/atlas/banner_patterns.png");
   public static final alz d = alz.b("textures/atlas/shield_patterns.png");
   public static final alz e = alz.b("textures/atlas/signs.png");
   public static final alz f = alz.b("textures/atlas/chest.png");
   public static final alz g = alz.b("textures/atlas/armor_trims.png");
   public static final alz h = alz.b("textures/atlas/decorated_pot.png");
   private static final glu C = glu.g(a);
   private static final glu D = glu.d(b);
   private static final glu E = glu.n(c);
   private static final glu F = glu.n(d);
   private static final glu G = glu.g(e);
   private static final glu H = glu.f(f);
   private static final glu I = glu.a(g);
   private static final glu J = glu.b(g);
   private static final glu K = glu.d(hbj.d);
   private static final glu L = glu.f(hbj.d);
   private static final glu M = glu.i(hbj.d);
   public static final hdt i = new hdt(a, alz.b("entity/shulker/shulker"));
   public static final List<hdt> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new hdt(a, alz.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dzg, hdt> k = dzg.a().collect(Collectors.toMap(Function.identity(), gmf::c));
   public static final Map<dzg, hdt> l = dzg.a().collect(Collectors.toMap(Function.identity(), gmf::d));
   public static final hdt m = new hdt(c, alz.b("entity/banner/base"));
   public static final hdt n = new hdt(d, alz.b("entity/shield/base"));
   private static final Map<alz, hdt> N = new HashMap<>();
   private static final Map<alz, hdt> O = new HashMap<>();
   public static final Map<aly<dvo>, hdt> o = ma.ak.c().collect(Collectors.toMap(jq.c::h, $$0 -> a($$0.a().a())));
   public static final hdt p = a(alz.b("decorated_pot_base"));
   public static final hdt q = a(alz.b("decorated_pot_side"));
   public static final hdt[] r = Arrays.stream(cwl.values())
      .sorted(Comparator.comparingInt(cwl::a))
      .map($$0 -> new hdt(b, alz.b("entity/bed/" + $$0.b())))
      .toArray(hdt[]::new);
   public static final hdt s = a("trapped");
   public static final hdt t = a("trapped_left");
   public static final hdt u = a("trapped_right");
   public static final hdt v = a("christmas");
   public static final hdt w = a("christmas_left");
   public static final hdt x = a("christmas_right");
   public static final hdt y = a("normal");
   public static final hdt z = a("normal_left");
   public static final hdt A = a("normal_right");
   public static final hdt B = a("ender");

   public static glu a() {
      return E;
   }

   public static glu b() {
      return F;
   }

   public static glu c() {
      return D;
   }

   public static glu d() {
      return C;
   }

   public static glu e() {
      return G;
   }

   public static glu f() {
      return G;
   }

   public static glu g() {
      return H;
   }

   public static glu a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static glu h() {
      return K;
   }

   public static glu i() {
      return L;
   }

   public static glu j() {
      return M;
   }

   private static hdt c(dzg $$0) {
      return new hdt(e, alz.b("entity/signs/" + $$0.b()));
   }

   private static hdt d(dzg $$0) {
      return new hdt(e, alz.b("entity/signs/hanging/" + $$0.b()));
   }

   public static hdt a(dzg $$0) {
      return k.get($$0);
   }

   public static hdt b(dzg $$0) {
      return l.get($$0);
   }

   public static hdt a(jq<dum> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alz $$1 = $$0x.f("entity/banner/");
         return new hdt(c, $$1);
      });
   }

   public static hdt b(jq<dum> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         alz $$1 = $$0x.f("entity/shield/");
         return new hdt(d, $$1);
      });
   }

   private static hdt a(String $$0) {
      return new hdt(f, alz.b("entity/chest/" + $$0));
   }

   private static hdt a(alz $$0) {
      return new hdt(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hdt a(@Nullable aly<dvo> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hdt a(duw $$0, dym $$1, boolean $$2) {
      if ($$0 instanceof dvt) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dws ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static hdt a(dym $$0, hdt $$1, hdt $$2, hdt $$3) {
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
