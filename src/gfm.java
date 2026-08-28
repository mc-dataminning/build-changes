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

public class gfm {
   public static final akr a = akr.b("textures/atlas/shulker_boxes.png");
   public static final akr b = akr.b("textures/atlas/beds.png");
   public static final akr c = akr.b("textures/atlas/banner_patterns.png");
   public static final akr d = akr.b("textures/atlas/shield_patterns.png");
   public static final akr e = akr.b("textures/atlas/signs.png");
   public static final akr f = akr.b("textures/atlas/chest.png");
   public static final akr g = akr.b("textures/atlas/armor_trims.png");
   public static final akr h = akr.b("textures/atlas/decorated_pot.png");
   private static final gff C = gff.e(a);
   private static final gff D = gff.c(b);
   private static final gff E = gff.m(c);
   private static final gff F = gff.m(d);
   private static final gff G = gff.e(e);
   private static final gff H = gff.d(f);
   private static final gff I = gff.a(g);
   private static final gff J = gff.b(g);
   private static final gff K = gff.c(gqi.e);
   private static final gff L = gff.d(gqi.e);
   private static final gff M = gff.g(gqi.e);
   private static final gff N = gff.h(gqi.e);
   public static final gso i = new gso(a, akr.b("entity/shulker/shulker"));
   public static final List<gso> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gso(a, akr.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dup, gso> k = dup.a().collect(Collectors.toMap(Function.identity(), gfm::c));
   public static final Map<dup, gso> l = dup.a().collect(Collectors.toMap(Function.identity(), gfm::d));
   public static final gso m = new gso(c, akr.b("entity/banner/base"));
   public static final gso n = new gso(d, akr.b("entity/shield/base"));
   private static final Map<akr, gso> O = new HashMap<>();
   private static final Map<akr, gso> P = new HashMap<>();
   public static final Map<akq<dqy>, gso> o = lt.al.i().collect(Collectors.toMap(jm.c::h, $$0 -> a($$0.a().a())));
   public static final gso p = a(akr.b("decorated_pot_base"));
   public static final gso q = a(akr.b("decorated_pot_side"));
   public static final gso[] r = Arrays.stream(cti.values())
      .sorted(Comparator.comparingInt(cti::a))
      .map($$0 -> new gso(b, akr.b("entity/bed/" + $$0.b())))
      .toArray(gso[]::new);
   public static final gso s = a("trapped");
   public static final gso t = a("trapped_left");
   public static final gso u = a("trapped_right");
   public static final gso v = a("christmas");
   public static final gso w = a("christmas_left");
   public static final gso x = a("christmas_right");
   public static final gso y = a("normal");
   public static final gso z = a("normal_left");
   public static final gso A = a("normal_right");
   public static final gso B = a("ender");

   public static gff a() {
      return E;
   }

   public static gff b() {
      return F;
   }

   public static gff c() {
      return D;
   }

   public static gff d() {
      return C;
   }

   public static gff e() {
      return G;
   }

   public static gff f() {
      return G;
   }

   public static gff g() {
      return H;
   }

   public static gff a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static gff h() {
      return K;
   }

   public static gff i() {
      return L;
   }

   public static gff j() {
      return M;
   }

   public static gff k() {
      return N;
   }

   private static gso c(dup $$0) {
      return new gso(e, akr.b("entity/signs/" + $$0.b()));
   }

   private static gso d(dup $$0) {
      return new gso(e, akr.b("entity/signs/hanging/" + $$0.b()));
   }

   public static gso a(dup $$0) {
      return k.get($$0);
   }

   public static gso b(dup $$0) {
      return l.get($$0);
   }

   public static gso a(jm<dpx> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         akr $$1 = $$0x.f("entity/banner/");
         return new gso(c, $$1);
      });
   }

   public static gso b(jm<dpx> $$0) {
      return P.computeIfAbsent($$0.a().a(), $$0x -> {
         akr $$1 = $$0x.f("entity/shield/");
         return new gso(d, $$1);
      });
   }

   private static gso a(String $$0) {
      return new gso(f, akr.b("entity/chest/" + $$0));
   }

   private static gso a(akr $$0) {
      return new gso(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static gso a(@Nullable akq<dqy> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gso a(dqh $$0, dtu $$1, boolean $$2) {
      if ($$0 instanceof drd) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dsb ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static gso a(dtu $$0, gso $$1, gso $$2, gso $$3) {
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
