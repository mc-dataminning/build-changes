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

public class gkb {
   public static final alj a = alj.b("textures/atlas/shulker_boxes.png");
   public static final alj b = alj.b("textures/atlas/beds.png");
   public static final alj c = alj.b("textures/atlas/banner_patterns.png");
   public static final alj d = alj.b("textures/atlas/shield_patterns.png");
   public static final alj e = alj.b("textures/atlas/signs.png");
   public static final alj f = alj.b("textures/atlas/chest.png");
   public static final alj g = alj.b("textures/atlas/armor_trims.png");
   public static final alj h = alj.b("textures/atlas/decorated_pot.png");
   private static final gjq C = gjq.f(a);
   private static final gjq D = gjq.c(b);
   private static final gjq E = gjq.m(c);
   private static final gjq F = gjq.m(d);
   private static final gjq G = gjq.f(e);
   private static final gjq H = gjq.e(f);
   private static final gjq I = gjq.a(g);
   private static final gjq J = gjq.b(g);
   private static final gjq K = gjq.c(gzd.d);
   private static final gjq L = gjq.e(gzd.d);
   private static final gjq M = gjq.h(gzd.d);
   public static final hbn i = new hbn(a, alj.b("entity/shulker/shulker"));
   public static final List<hbn> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new hbn(a, alj.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dxh, hbn> k = dxh.a().collect(Collectors.toMap(Function.identity(), gkb::c));
   public static final Map<dxh, hbn> l = dxh.a().collect(Collectors.toMap(Function.identity(), gkb::d));
   public static final hbn m = new hbn(c, alj.b("entity/banner/base"));
   public static final hbn n = new hbn(d, alj.b("entity/shield/base"));
   private static final Map<alj, hbn> N = new HashMap<>();
   private static final Map<alj, hbn> O = new HashMap<>();
   public static final Map<ali<dtp>, hbn> o = lz.ak.c().collect(Collectors.toMap(jq.c::h, $$0 -> a($$0.a().a())));
   public static final hbn p = a(alj.b("decorated_pot_base"));
   public static final hbn q = a(alj.b("decorated_pot_side"));
   public static final hbn[] r = Arrays.stream(cvj.values())
      .sorted(Comparator.comparingInt(cvj::a))
      .map($$0 -> new hbn(b, alj.b("entity/bed/" + $$0.b())))
      .toArray(hbn[]::new);
   public static final hbn s = a("trapped");
   public static final hbn t = a("trapped_left");
   public static final hbn u = a("trapped_right");
   public static final hbn v = a("christmas");
   public static final hbn w = a("christmas_left");
   public static final hbn x = a("christmas_right");
   public static final hbn y = a("normal");
   public static final hbn z = a("normal_left");
   public static final hbn A = a("normal_right");
   public static final hbn B = a("ender");

   public static gjq a() {
      return E;
   }

   public static gjq b() {
      return F;
   }

   public static gjq c() {
      return D;
   }

   public static gjq d() {
      return C;
   }

   public static gjq e() {
      return G;
   }

   public static gjq f() {
      return G;
   }

   public static gjq g() {
      return H;
   }

   public static gjq a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static gjq h() {
      return K;
   }

   public static gjq i() {
      return L;
   }

   public static gjq j() {
      return M;
   }

   private static hbn c(dxh $$0) {
      return new hbn(e, alj.b("entity/signs/" + $$0.b()));
   }

   private static hbn d(dxh $$0) {
      return new hbn(e, alj.b("entity/signs/hanging/" + $$0.b()));
   }

   public static hbn a(dxh $$0) {
      return k.get($$0);
   }

   public static hbn b(dxh $$0) {
      return l.get($$0);
   }

   public static hbn a(jq<dso> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alj $$1 = $$0x.f("entity/banner/");
         return new hbn(c, $$1);
      });
   }

   public static hbn b(jq<dso> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         alj $$1 = $$0x.f("entity/shield/");
         return new hbn(d, $$1);
      });
   }

   private static hbn a(String $$0) {
      return new hbn(f, alj.b("entity/chest/" + $$0));
   }

   private static hbn a(alj $$0) {
      return new hbn(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hbn a(@Nullable ali<dtp> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hbn a(dsy $$0, dwn $$1, boolean $$2) {
      if ($$0 instanceof dtu) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dut ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static hbn a(dwn $$0, hbn $$1, hbn $$2, hbn $$3) {
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
