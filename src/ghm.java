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

public class ghm {
   public static final alb a = alb.b("textures/atlas/shulker_boxes.png");
   public static final alb b = alb.b("textures/atlas/beds.png");
   public static final alb c = alb.b("textures/atlas/banner_patterns.png");
   public static final alb d = alb.b("textures/atlas/shield_patterns.png");
   public static final alb e = alb.b("textures/atlas/signs.png");
   public static final alb f = alb.b("textures/atlas/chest.png");
   public static final alb g = alb.b("textures/atlas/armor_trims.png");
   public static final alb h = alb.b("textures/atlas/decorated_pot.png");
   private static final ghe C = ghe.f(a);
   private static final ghe D = ghe.c(b);
   private static final ghe E = ghe.n(c);
   private static final ghe F = ghe.n(d);
   private static final ghe G = ghe.f(e);
   private static final ghe H = ghe.e(f);
   private static final ghe I = ghe.a(g);
   private static final ghe J = ghe.b(g);
   private static final ghe K = ghe.c(gwj.d);
   private static final ghe L = ghe.e(gwj.d);
   private static final ghe M = ghe.h(gwj.d);
   private static final ghe N = ghe.i(gwj.d);
   public static final gyq i = new gyq(a, alb.b("entity/shulker/shulker"));
   public static final List<gyq> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gyq(a, alb.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dvn, gyq> k = dvn.a().collect(Collectors.toMap(Function.identity(), ghm::c));
   public static final Map<dvn, gyq> l = dvn.a().collect(Collectors.toMap(Function.identity(), ghm::d));
   public static final gyq m = new gyq(c, alb.b("entity/banner/base"));
   public static final gyq n = new gyq(d, alb.b("entity/shield/base"));
   private static final Map<alb, gyq> O = new HashMap<>();
   private static final Map<alb, gyq> P = new HashMap<>();
   public static final Map<ala<drv>, gyq> o = lu.ak.i().collect(Collectors.toMap(jn.c::h, $$0 -> a($$0.a().a())));
   public static final gyq p = a(alb.b("decorated_pot_base"));
   public static final gyq q = a(alb.b("decorated_pot_side"));
   public static final gyq[] r = Arrays.stream(cue.values())
      .sorted(Comparator.comparingInt(cue::a))
      .map($$0 -> new gyq(b, alb.b("entity/bed/" + $$0.b())))
      .toArray(gyq[]::new);
   public static final gyq s = a("trapped");
   public static final gyq t = a("trapped_left");
   public static final gyq u = a("trapped_right");
   public static final gyq v = a("christmas");
   public static final gyq w = a("christmas_left");
   public static final gyq x = a("christmas_right");
   public static final gyq y = a("normal");
   public static final gyq z = a("normal_left");
   public static final gyq A = a("normal_right");
   public static final gyq B = a("ender");

   public static ghe a() {
      return E;
   }

   public static ghe b() {
      return F;
   }

   public static ghe c() {
      return D;
   }

   public static ghe d() {
      return C;
   }

   public static ghe e() {
      return G;
   }

   public static ghe f() {
      return G;
   }

   public static ghe g() {
      return H;
   }

   public static ghe a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static ghe h() {
      return K;
   }

   public static ghe i() {
      return L;
   }

   public static ghe j() {
      return M;
   }

   public static ghe k() {
      return N;
   }

   private static gyq c(dvn $$0) {
      return new gyq(e, alb.b("entity/signs/" + $$0.b()));
   }

   private static gyq d(dvn $$0) {
      return new gyq(e, alb.b("entity/signs/hanging/" + $$0.b()));
   }

   public static gyq a(dvn $$0) {
      return k.get($$0);
   }

   public static gyq b(dvn $$0) {
      return l.get($$0);
   }

   public static gyq a(jn<dqu> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         alb $$1 = $$0x.f("entity/banner/");
         return new gyq(c, $$1);
      });
   }

   public static gyq b(jn<dqu> $$0) {
      return P.computeIfAbsent($$0.a().a(), $$0x -> {
         alb $$1 = $$0x.f("entity/shield/");
         return new gyq(d, $$1);
      });
   }

   private static gyq a(String $$0) {
      return new gyq(f, alb.b("entity/chest/" + $$0));
   }

   private static gyq a(alb $$0) {
      return new gyq(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static gyq a(@Nullable ala<drv> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gyq a(dre $$0, dus $$1, boolean $$2) {
      if ($$0 instanceof dsa) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dsz ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static gyq a(dus $$0, gyq $$1, gyq $$2, gyq $$3) {
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
