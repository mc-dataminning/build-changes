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

public class gir {
   public static final alh a = alh.b("textures/atlas/shulker_boxes.png");
   public static final alh b = alh.b("textures/atlas/beds.png");
   public static final alh c = alh.b("textures/atlas/banner_patterns.png");
   public static final alh d = alh.b("textures/atlas/shield_patterns.png");
   public static final alh e = alh.b("textures/atlas/signs.png");
   public static final alh f = alh.b("textures/atlas/chest.png");
   public static final alh g = alh.b("textures/atlas/armor_trims.png");
   public static final alh h = alh.b("textures/atlas/decorated_pot.png");
   private static final gig C = gig.f(a);
   private static final gig D = gig.c(b);
   private static final gig E = gig.m(c);
   private static final gig F = gig.m(d);
   private static final gig G = gig.f(e);
   private static final gig H = gig.e(f);
   private static final gig I = gig.a(g);
   private static final gig J = gig.b(g);
   private static final gig K = gig.c(gxr.d);
   private static final gig L = gig.e(gxr.d);
   private static final gig M = gig.h(gxr.d);
   public static final hab i = new hab(a, alh.b("entity/shulker/shulker"));
   public static final List<hab> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new hab(a, alh.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dwq, hab> k = dwq.a().collect(Collectors.toMap(Function.identity(), gir::c));
   public static final Map<dwq, hab> l = dwq.a().collect(Collectors.toMap(Function.identity(), gir::d));
   public static final hab m = new hab(c, alh.b("entity/banner/base"));
   public static final hab n = new hab(d, alh.b("entity/shield/base"));
   private static final Map<alh, hab> N = new HashMap<>();
   private static final Map<alh, hab> O = new HashMap<>();
   public static final Map<alg<dsx>, hab> o = lx.ak.c().collect(Collectors.toMap(jp.c::h, $$0 -> a($$0.a().a())));
   public static final hab p = a(alh.b("decorated_pot_base"));
   public static final hab q = a(alh.b("decorated_pot_side"));
   public static final hab[] r = Arrays.stream(cuu.values())
      .sorted(Comparator.comparingInt(cuu::a))
      .map($$0 -> new hab(b, alh.b("entity/bed/" + $$0.b())))
      .toArray(hab[]::new);
   public static final hab s = a("trapped");
   public static final hab t = a("trapped_left");
   public static final hab u = a("trapped_right");
   public static final hab v = a("christmas");
   public static final hab w = a("christmas_left");
   public static final hab x = a("christmas_right");
   public static final hab y = a("normal");
   public static final hab z = a("normal_left");
   public static final hab A = a("normal_right");
   public static final hab B = a("ender");

   public static gig a() {
      return E;
   }

   public static gig b() {
      return F;
   }

   public static gig c() {
      return D;
   }

   public static gig d() {
      return C;
   }

   public static gig e() {
      return G;
   }

   public static gig f() {
      return G;
   }

   public static gig g() {
      return H;
   }

   public static gig a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static gig h() {
      return K;
   }

   public static gig i() {
      return L;
   }

   public static gig j() {
      return M;
   }

   private static hab c(dwq $$0) {
      return new hab(e, alh.b("entity/signs/" + $$0.b()));
   }

   private static hab d(dwq $$0) {
      return new hab(e, alh.b("entity/signs/hanging/" + $$0.b()));
   }

   public static hab a(dwq $$0) {
      return k.get($$0);
   }

   public static hab b(dwq $$0) {
      return l.get($$0);
   }

   public static hab a(jp<drw> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alh $$1 = $$0x.f("entity/banner/");
         return new hab(c, $$1);
      });
   }

   public static hab b(jp<drw> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         alh $$1 = $$0x.f("entity/shield/");
         return new hab(d, $$1);
      });
   }

   private static hab a(String $$0) {
      return new hab(f, alh.b("entity/chest/" + $$0));
   }

   private static hab a(alh $$0) {
      return new hab(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hab a(@Nullable alg<dsx> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hab a(dsg $$0, dvv $$1, boolean $$2) {
      if ($$0 instanceof dtc) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dub ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static hab a(dvv $$0, hab $$1, hab $$2, hab $$3) {
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
