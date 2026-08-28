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

public class gjs {
   public static final all a = all.b("textures/atlas/shulker_boxes.png");
   public static final all b = all.b("textures/atlas/beds.png");
   public static final all c = all.b("textures/atlas/banner_patterns.png");
   public static final all d = all.b("textures/atlas/shield_patterns.png");
   public static final all e = all.b("textures/atlas/signs.png");
   public static final all f = all.b("textures/atlas/chest.png");
   public static final all g = all.b("textures/atlas/armor_trims.png");
   public static final all h = all.b("textures/atlas/decorated_pot.png");
   private static final gjh C = gjh.f(a);
   private static final gjh D = gjh.c(b);
   private static final gjh E = gjh.m(c);
   private static final gjh F = gjh.m(d);
   private static final gjh G = gjh.f(e);
   private static final gjh H = gjh.e(f);
   private static final gjh I = gjh.a(g);
   private static final gjh J = gjh.b(g);
   private static final gjh K = gjh.c(gys.d);
   private static final gjh L = gjh.e(gys.d);
   private static final gjh M = gjh.h(gys.d);
   public static final hbc i = new hbc(a, all.b("entity/shulker/shulker"));
   public static final List<hbc> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new hbc(a, all.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dxa, hbc> k = dxa.a().collect(Collectors.toMap(Function.identity(), gjs::c));
   public static final Map<dxa, hbc> l = dxa.a().collect(Collectors.toMap(Function.identity(), gjs::d));
   public static final hbc m = new hbc(c, all.b("entity/banner/base"));
   public static final hbc n = new hbc(d, all.b("entity/shield/base"));
   private static final Map<all, hbc> N = new HashMap<>();
   private static final Map<all, hbc> O = new HashMap<>();
   public static final Map<alk<dti>, hbc> o = lz.ak.c().collect(Collectors.toMap(jq.c::h, $$0 -> a($$0.a().a())));
   public static final hbc p = a(all.b("decorated_pot_base"));
   public static final hbc q = a(all.b("decorated_pot_side"));
   public static final hbc[] r = Arrays.stream(cvc.values())
      .sorted(Comparator.comparingInt(cvc::a))
      .map($$0 -> new hbc(b, all.b("entity/bed/" + $$0.b())))
      .toArray(hbc[]::new);
   public static final hbc s = a("trapped");
   public static final hbc t = a("trapped_left");
   public static final hbc u = a("trapped_right");
   public static final hbc v = a("christmas");
   public static final hbc w = a("christmas_left");
   public static final hbc x = a("christmas_right");
   public static final hbc y = a("normal");
   public static final hbc z = a("normal_left");
   public static final hbc A = a("normal_right");
   public static final hbc B = a("ender");

   public static gjh a() {
      return E;
   }

   public static gjh b() {
      return F;
   }

   public static gjh c() {
      return D;
   }

   public static gjh d() {
      return C;
   }

   public static gjh e() {
      return G;
   }

   public static gjh f() {
      return G;
   }

   public static gjh g() {
      return H;
   }

   public static gjh a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static gjh h() {
      return K;
   }

   public static gjh i() {
      return L;
   }

   public static gjh j() {
      return M;
   }

   private static hbc c(dxa $$0) {
      return new hbc(e, all.b("entity/signs/" + $$0.b()));
   }

   private static hbc d(dxa $$0) {
      return new hbc(e, all.b("entity/signs/hanging/" + $$0.b()));
   }

   public static hbc a(dxa $$0) {
      return k.get($$0);
   }

   public static hbc b(dxa $$0) {
      return l.get($$0);
   }

   public static hbc a(jq<dsh> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         all $$1 = $$0x.f("entity/banner/");
         return new hbc(c, $$1);
      });
   }

   public static hbc b(jq<dsh> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         all $$1 = $$0x.f("entity/shield/");
         return new hbc(d, $$1);
      });
   }

   private static hbc a(String $$0) {
      return new hbc(f, all.b("entity/chest/" + $$0));
   }

   private static hbc a(all $$0) {
      return new hbc(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hbc a(@Nullable alk<dti> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hbc a(dsr $$0, dwg $$1, boolean $$2) {
      if ($$0 instanceof dtn) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dum ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static hbc a(dwg $$0, hbc $$1, hbc $$2, hbc $$3) {
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
