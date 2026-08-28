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

public class gig {
   public static final ale a = ale.b("textures/atlas/shulker_boxes.png");
   public static final ale b = ale.b("textures/atlas/beds.png");
   public static final ale c = ale.b("textures/atlas/banner_patterns.png");
   public static final ale d = ale.b("textures/atlas/shield_patterns.png");
   public static final ale e = ale.b("textures/atlas/signs.png");
   public static final ale f = ale.b("textures/atlas/chest.png");
   public static final ale g = ale.b("textures/atlas/armor_trims.png");
   public static final ale h = ale.b("textures/atlas/decorated_pot.png");
   private static final ghv C = ghv.f(a);
   private static final ghv D = ghv.c(b);
   private static final ghv E = ghv.m(c);
   private static final ghv F = ghv.m(d);
   private static final ghv G = ghv.f(e);
   private static final ghv H = ghv.e(f);
   private static final ghv I = ghv.a(g);
   private static final ghv J = ghv.b(g);
   private static final ghv K = ghv.c(gxf.d);
   private static final ghv L = ghv.e(gxf.d);
   private static final ghv M = ghv.h(gxf.d);
   public static final gzm i = new gzm(a, ale.b("entity/shulker/shulker"));
   public static final List<gzm> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gzm(a, ale.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dwf, gzm> k = dwf.a().collect(Collectors.toMap(Function.identity(), gig::c));
   public static final Map<dwf, gzm> l = dwf.a().collect(Collectors.toMap(Function.identity(), gig::d));
   public static final gzm m = new gzm(c, ale.b("entity/banner/base"));
   public static final gzm n = new gzm(d, ale.b("entity/shield/base"));
   private static final Map<ale, gzm> N = new HashMap<>();
   private static final Map<ale, gzm> O = new HashMap<>();
   public static final Map<ald<dsm>, gzm> o = lv.ak.c().collect(Collectors.toMap(jo.c::h, $$0 -> a($$0.a().a())));
   public static final gzm p = a(ale.b("decorated_pot_base"));
   public static final gzm q = a(ale.b("decorated_pot_side"));
   public static final gzm[] r = Arrays.stream(cum.values())
      .sorted(Comparator.comparingInt(cum::a))
      .map($$0 -> new gzm(b, ale.b("entity/bed/" + $$0.b())))
      .toArray(gzm[]::new);
   public static final gzm s = a("trapped");
   public static final gzm t = a("trapped_left");
   public static final gzm u = a("trapped_right");
   public static final gzm v = a("christmas");
   public static final gzm w = a("christmas_left");
   public static final gzm x = a("christmas_right");
   public static final gzm y = a("normal");
   public static final gzm z = a("normal_left");
   public static final gzm A = a("normal_right");
   public static final gzm B = a("ender");

   public static ghv a() {
      return E;
   }

   public static ghv b() {
      return F;
   }

   public static ghv c() {
      return D;
   }

   public static ghv d() {
      return C;
   }

   public static ghv e() {
      return G;
   }

   public static ghv f() {
      return G;
   }

   public static ghv g() {
      return H;
   }

   public static ghv a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static ghv h() {
      return K;
   }

   public static ghv i() {
      return L;
   }

   public static ghv j() {
      return M;
   }

   private static gzm c(dwf $$0) {
      return new gzm(e, ale.b("entity/signs/" + $$0.b()));
   }

   private static gzm d(dwf $$0) {
      return new gzm(e, ale.b("entity/signs/hanging/" + $$0.b()));
   }

   public static gzm a(dwf $$0) {
      return k.get($$0);
   }

   public static gzm b(dwf $$0) {
      return l.get($$0);
   }

   public static gzm a(jo<drl> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         ale $$1 = $$0x.f("entity/banner/");
         return new gzm(c, $$1);
      });
   }

   public static gzm b(jo<drl> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         ale $$1 = $$0x.f("entity/shield/");
         return new gzm(d, $$1);
      });
   }

   private static gzm a(String $$0) {
      return new gzm(f, ale.b("entity/chest/" + $$0));
   }

   private static gzm a(ale $$0) {
      return new gzm(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static gzm a(@Nullable ald<dsm> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gzm a(drv $$0, dvk $$1, boolean $$2) {
      if ($$0 instanceof dsr) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dtq ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static gzm a(dvk $$0, gzm $$1, gzm $$2, gzm $$3) {
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
