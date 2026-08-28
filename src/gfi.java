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

public class gfi {
   public static final akq a = akq.b("textures/atlas/shulker_boxes.png");
   public static final akq b = akq.b("textures/atlas/beds.png");
   public static final akq c = akq.b("textures/atlas/banner_patterns.png");
   public static final akq d = akq.b("textures/atlas/shield_patterns.png");
   public static final akq e = akq.b("textures/atlas/signs.png");
   public static final akq f = akq.b("textures/atlas/chest.png");
   public static final akq g = akq.b("textures/atlas/armor_trims.png");
   public static final akq h = akq.b("textures/atlas/decorated_pot.png");
   private static final gfb C = gfb.e(a);
   private static final gfb D = gfb.c(b);
   private static final gfb E = gfb.m(c);
   private static final gfb F = gfb.m(d);
   private static final gfb G = gfb.e(e);
   private static final gfb H = gfb.d(f);
   private static final gfb I = gfb.a(g);
   private static final gfb J = gfb.b(g);
   private static final gfb K = gfb.c(gqe.e);
   private static final gfb L = gfb.d(gqe.e);
   private static final gfb M = gfb.g(gqe.e);
   private static final gfb N = gfb.h(gqe.e);
   public static final gsj i = new gsj(a, akq.b("entity/shulker/shulker"));
   public static final List<gsj> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gsj(a, akq.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dun, gsj> k = dun.a().collect(Collectors.toMap(Function.identity(), gfi::c));
   public static final Map<dun, gsj> l = dun.a().collect(Collectors.toMap(Function.identity(), gfi::d));
   public static final gsj m = new gsj(c, akq.b("entity/banner/base"));
   public static final gsj n = new gsj(d, akq.b("entity/shield/base"));
   private static final Map<akq, gsj> O = new HashMap<>();
   private static final Map<akq, gsj> P = new HashMap<>();
   public static final Map<akp<dqw>, gsj> o = lt.al.i().collect(Collectors.toMap(jm.c::h, $$0 -> a($$0.a().a())));
   public static final gsj p = a(akq.b("decorated_pot_base"));
   public static final gsj q = a(akq.b("decorated_pot_side"));
   public static final gsj[] r = Arrays.stream(ctg.values())
      .sorted(Comparator.comparingInt(ctg::a))
      .map($$0 -> new gsj(b, akq.b("entity/bed/" + $$0.b())))
      .toArray(gsj[]::new);
   public static final gsj s = a("trapped");
   public static final gsj t = a("trapped_left");
   public static final gsj u = a("trapped_right");
   public static final gsj v = a("christmas");
   public static final gsj w = a("christmas_left");
   public static final gsj x = a("christmas_right");
   public static final gsj y = a("normal");
   public static final gsj z = a("normal_left");
   public static final gsj A = a("normal_right");
   public static final gsj B = a("ender");

   public static gfb a() {
      return E;
   }

   public static gfb b() {
      return F;
   }

   public static gfb c() {
      return D;
   }

   public static gfb d() {
      return C;
   }

   public static gfb e() {
      return G;
   }

   public static gfb f() {
      return G;
   }

   public static gfb g() {
      return H;
   }

   public static gfb a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static gfb h() {
      return K;
   }

   public static gfb i() {
      return L;
   }

   public static gfb j() {
      return M;
   }

   public static gfb k() {
      return N;
   }

   private static gsj c(dun $$0) {
      return new gsj(e, akq.b("entity/signs/" + $$0.b()));
   }

   private static gsj d(dun $$0) {
      return new gsj(e, akq.b("entity/signs/hanging/" + $$0.b()));
   }

   public static gsj a(dun $$0) {
      return k.get($$0);
   }

   public static gsj b(dun $$0) {
      return l.get($$0);
   }

   public static gsj a(jm<dpv> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         akq $$1 = $$0x.f("entity/banner/");
         return new gsj(c, $$1);
      });
   }

   public static gsj b(jm<dpv> $$0) {
      return P.computeIfAbsent($$0.a().a(), $$0x -> {
         akq $$1 = $$0x.f("entity/shield/");
         return new gsj(d, $$1);
      });
   }

   private static gsj a(String $$0) {
      return new gsj(f, akq.b("entity/chest/" + $$0));
   }

   private static gsj a(akq $$0) {
      return new gsj(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static gsj a(@Nullable akp<dqw> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gsj a(dqf $$0, dts $$1, boolean $$2) {
      if ($$0 instanceof drb) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof drz ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static gsj a(dts $$0, gsj $$1, gsj $$2, gsj $$3) {
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
