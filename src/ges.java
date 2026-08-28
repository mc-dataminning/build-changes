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

public class ges {
   public static final akk a = new akk("textures/atlas/shulker_boxes.png");
   public static final akk b = new akk("textures/atlas/beds.png");
   public static final akk c = new akk("textures/atlas/banner_patterns.png");
   public static final akk d = new akk("textures/atlas/shield_patterns.png");
   public static final akk e = new akk("textures/atlas/signs.png");
   public static final akk f = new akk("textures/atlas/chest.png");
   public static final akk g = new akk("textures/atlas/armor_trims.png");
   public static final akk h = new akk("textures/atlas/decorated_pot.png");
   private static final gel C = gel.e(a);
   private static final gel D = gel.c(b);
   private static final gel E = gel.m(c);
   private static final gel F = gel.m(d);
   private static final gel G = gel.e(e);
   private static final gel H = gel.d(f);
   private static final gel I = gel.a(g);
   private static final gel J = gel.b(g);
   private static final gel K = gel.c(gpn.e);
   private static final gel L = gel.d(gpn.e);
   private static final gel M = gel.g(gpn.e);
   private static final gel N = gel.h(gpn.e);
   public static final grs i = new grs(a, new akk("entity/shulker/shulker"));
   public static final List<grs> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new grs(a, new akk("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dtx, grs> k = dtx.a().collect(Collectors.toMap(Function.identity(), ges::c));
   public static final Map<dtx, grs> l = dtx.a().collect(Collectors.toMap(Function.identity(), ges::d));
   public static final grs m = new grs(c, new akk("entity/banner/base"));
   public static final grs n = new grs(d, new akk("entity/shield/base"));
   private static final Map<akk, grs> O = new HashMap<>();
   private static final Map<akk, grs> P = new HashMap<>();
   public static final Map<akj<dqg>, grs> o = lq.al.i().collect(Collectors.toMap(jj.c::h, $$0 -> a($$0.a().a())));
   public static final grs p = a(new akk("decorated_pot_base"));
   public static final grs q = a(new akk("decorated_pot_side"));
   public static final grs[] r = Arrays.stream(csv.values())
      .sorted(Comparator.comparingInt(csv::a))
      .map($$0 -> new grs(b, new akk("entity/bed/" + $$0.b())))
      .toArray(grs[]::new);
   public static final grs s = a("trapped");
   public static final grs t = a("trapped_left");
   public static final grs u = a("trapped_right");
   public static final grs v = a("christmas");
   public static final grs w = a("christmas_left");
   public static final grs x = a("christmas_right");
   public static final grs y = a("normal");
   public static final grs z = a("normal_left");
   public static final grs A = a("normal_right");
   public static final grs B = a("ender");

   public static gel a() {
      return E;
   }

   public static gel b() {
      return F;
   }

   public static gel c() {
      return D;
   }

   public static gel d() {
      return C;
   }

   public static gel e() {
      return G;
   }

   public static gel f() {
      return G;
   }

   public static gel g() {
      return H;
   }

   public static gel a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static gel h() {
      return K;
   }

   public static gel i() {
      return L;
   }

   public static gel j() {
      return M;
   }

   public static gel k() {
      return N;
   }

   private static grs c(dtx $$0) {
      return new grs(e, new akk("entity/signs/" + $$0.b()));
   }

   private static grs d(dtx $$0) {
      return new grs(e, new akk("entity/signs/hanging/" + $$0.b()));
   }

   public static grs a(dtx $$0) {
      return k.get($$0);
   }

   public static grs b(dtx $$0) {
      return l.get($$0);
   }

   public static grs a(jj<dpf> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         akk $$1 = $$0x.d("entity/banner/");
         return new grs(c, $$1);
      });
   }

   public static grs b(jj<dpf> $$0) {
      return P.computeIfAbsent($$0.a().a(), $$0x -> {
         akk $$1 = $$0x.d("entity/shield/");
         return new grs(d, $$1);
      });
   }

   private static grs a(String $$0) {
      return new grs(f, new akk("entity/chest/" + $$0));
   }

   private static grs a(akk $$0) {
      return new grs(h, $$0.d("entity/decorated_pot/"));
   }

   @Nullable
   public static grs a(@Nullable akj<dqg> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static grs a(dpp $$0, dtc $$1, boolean $$2) {
      if ($$0 instanceof dql) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof drj ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static grs a(dtc $$0, grs $$1, grs $$2, grs $$3) {
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
