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

public class gme {
   public static final alz a = alz.b("textures/atlas/shulker_boxes.png");
   public static final alz b = alz.b("textures/atlas/beds.png");
   public static final alz c = alz.b("textures/atlas/banner_patterns.png");
   public static final alz d = alz.b("textures/atlas/shield_patterns.png");
   public static final alz e = alz.b("textures/atlas/signs.png");
   public static final alz f = alz.b("textures/atlas/chest.png");
   public static final alz g = alz.b("textures/atlas/armor_trims.png");
   public static final alz h = alz.b("textures/atlas/decorated_pot.png");
   private static final glt C = glt.f(a);
   private static final glt D = glt.c(b);
   private static final glt E = glt.m(c);
   private static final glt F = glt.m(d);
   private static final glt G = glt.f(e);
   private static final glt H = glt.e(f);
   private static final glt I = glt.a(g);
   private static final glt J = glt.b(g);
   private static final glt K = glt.c(hbi.d);
   private static final glt L = glt.e(hbi.d);
   private static final glt M = glt.h(hbi.d);
   public static final hds i = new hds(a, alz.b("entity/shulker/shulker"));
   public static final List<hds> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new hds(a, alz.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dzg, hds> k = dzg.a().collect(Collectors.toMap(Function.identity(), gme::c));
   public static final Map<dzg, hds> l = dzg.a().collect(Collectors.toMap(Function.identity(), gme::d));
   public static final hds m = new hds(c, alz.b("entity/banner/base"));
   public static final hds n = new hds(d, alz.b("entity/shield/base"));
   private static final Map<alz, hds> N = new HashMap<>();
   private static final Map<alz, hds> O = new HashMap<>();
   public static final Map<aly<dvo>, hds> o = ma.ak.c().collect(Collectors.toMap(jq.c::h, $$0 -> a($$0.a().a())));
   public static final hds p = a(alz.b("decorated_pot_base"));
   public static final hds q = a(alz.b("decorated_pot_side"));
   public static final hds[] r = Arrays.stream(cwl.values())
      .sorted(Comparator.comparingInt(cwl::a))
      .map($$0 -> new hds(b, alz.b("entity/bed/" + $$0.b())))
      .toArray(hds[]::new);
   public static final hds s = a("trapped");
   public static final hds t = a("trapped_left");
   public static final hds u = a("trapped_right");
   public static final hds v = a("christmas");
   public static final hds w = a("christmas_left");
   public static final hds x = a("christmas_right");
   public static final hds y = a("normal");
   public static final hds z = a("normal_left");
   public static final hds A = a("normal_right");
   public static final hds B = a("ender");

   public static glt a() {
      return E;
   }

   public static glt b() {
      return F;
   }

   public static glt c() {
      return D;
   }

   public static glt d() {
      return C;
   }

   public static glt e() {
      return G;
   }

   public static glt f() {
      return G;
   }

   public static glt g() {
      return H;
   }

   public static glt a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static glt h() {
      return K;
   }

   public static glt i() {
      return L;
   }

   public static glt j() {
      return M;
   }

   private static hds c(dzg $$0) {
      return new hds(e, alz.b("entity/signs/" + $$0.b()));
   }

   private static hds d(dzg $$0) {
      return new hds(e, alz.b("entity/signs/hanging/" + $$0.b()));
   }

   public static hds a(dzg $$0) {
      return k.get($$0);
   }

   public static hds b(dzg $$0) {
      return l.get($$0);
   }

   public static hds a(jq<dum> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alz $$1 = $$0x.f("entity/banner/");
         return new hds(c, $$1);
      });
   }

   public static hds b(jq<dum> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         alz $$1 = $$0x.f("entity/shield/");
         return new hds(d, $$1);
      });
   }

   private static hds a(String $$0) {
      return new hds(f, alz.b("entity/chest/" + $$0));
   }

   private static hds a(alz $$0) {
      return new hds(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hds a(@Nullable aly<dvo> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hds a(duw $$0, dym $$1, boolean $$2) {
      if ($$0 instanceof dvt) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dws ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static hds a(dym $$0, hds $$1, hds $$2, hds $$3) {
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
