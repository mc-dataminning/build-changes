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

public class gfo {
   public static final akr a = akr.b("textures/atlas/shulker_boxes.png");
   public static final akr b = akr.b("textures/atlas/beds.png");
   public static final akr c = akr.b("textures/atlas/banner_patterns.png");
   public static final akr d = akr.b("textures/atlas/shield_patterns.png");
   public static final akr e = akr.b("textures/atlas/signs.png");
   public static final akr f = akr.b("textures/atlas/chest.png");
   public static final akr g = akr.b("textures/atlas/armor_trims.png");
   public static final akr h = akr.b("textures/atlas/decorated_pot.png");
   private static final gfh C = gfh.e(a);
   private static final gfh D = gfh.c(b);
   private static final gfh E = gfh.m(c);
   private static final gfh F = gfh.m(d);
   private static final gfh G = gfh.e(e);
   private static final gfh H = gfh.d(f);
   private static final gfh I = gfh.a(g);
   private static final gfh J = gfh.b(g);
   private static final gfh K = gfh.c(gqk.e);
   private static final gfh L = gfh.d(gqk.e);
   private static final gfh M = gfh.g(gqk.e);
   private static final gfh N = gfh.h(gqk.e);
   public static final gsq i = new gsq(a, akr.b("entity/shulker/shulker"));
   public static final List<gsq> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gsq(a, akr.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dup, gsq> k = dup.a().collect(Collectors.toMap(Function.identity(), gfo::c));
   public static final Map<dup, gsq> l = dup.a().collect(Collectors.toMap(Function.identity(), gfo::d));
   public static final gsq m = new gsq(c, akr.b("entity/banner/base"));
   public static final gsq n = new gsq(d, akr.b("entity/shield/base"));
   private static final Map<akr, gsq> O = new HashMap<>();
   private static final Map<akr, gsq> P = new HashMap<>();
   public static final Map<akq<dqy>, gsq> o = lt.al.i().collect(Collectors.toMap(jm.c::h, $$0 -> a($$0.a().a())));
   public static final gsq p = a(akr.b("decorated_pot_base"));
   public static final gsq q = a(akr.b("decorated_pot_side"));
   public static final gsq[] r = Arrays.stream(cti.values())
      .sorted(Comparator.comparingInt(cti::a))
      .map($$0 -> new gsq(b, akr.b("entity/bed/" + $$0.b())))
      .toArray(gsq[]::new);
   public static final gsq s = a("trapped");
   public static final gsq t = a("trapped_left");
   public static final gsq u = a("trapped_right");
   public static final gsq v = a("christmas");
   public static final gsq w = a("christmas_left");
   public static final gsq x = a("christmas_right");
   public static final gsq y = a("normal");
   public static final gsq z = a("normal_left");
   public static final gsq A = a("normal_right");
   public static final gsq B = a("ender");

   public static gfh a() {
      return E;
   }

   public static gfh b() {
      return F;
   }

   public static gfh c() {
      return D;
   }

   public static gfh d() {
      return C;
   }

   public static gfh e() {
      return G;
   }

   public static gfh f() {
      return G;
   }

   public static gfh g() {
      return H;
   }

   public static gfh a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static gfh h() {
      return K;
   }

   public static gfh i() {
      return L;
   }

   public static gfh j() {
      return M;
   }

   public static gfh k() {
      return N;
   }

   private static gsq c(dup $$0) {
      return new gsq(e, akr.b("entity/signs/" + $$0.b()));
   }

   private static gsq d(dup $$0) {
      return new gsq(e, akr.b("entity/signs/hanging/" + $$0.b()));
   }

   public static gsq a(dup $$0) {
      return k.get($$0);
   }

   public static gsq b(dup $$0) {
      return l.get($$0);
   }

   public static gsq a(jm<dpx> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         akr $$1 = $$0x.f("entity/banner/");
         return new gsq(c, $$1);
      });
   }

   public static gsq b(jm<dpx> $$0) {
      return P.computeIfAbsent($$0.a().a(), $$0x -> {
         akr $$1 = $$0x.f("entity/shield/");
         return new gsq(d, $$1);
      });
   }

   private static gsq a(String $$0) {
      return new gsq(f, akr.b("entity/chest/" + $$0));
   }

   private static gsq a(akr $$0) {
      return new gsq(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static gsq a(@Nullable akq<dqy> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gsq a(dqh $$0, dtu $$1, boolean $$2) {
      if ($$0 instanceof drd) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dsb ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static gsq a(dtu $$0, gsq $$1, gsq $$2, gsq $$3) {
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
