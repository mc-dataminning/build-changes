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

public class gmg {
   public static final alz a = alz.b("textures/atlas/shulker_boxes.png");
   public static final alz b = alz.b("textures/atlas/beds.png");
   public static final alz c = alz.b("textures/atlas/banner_patterns.png");
   public static final alz d = alz.b("textures/atlas/shield_patterns.png");
   public static final alz e = alz.b("textures/atlas/signs.png");
   public static final alz f = alz.b("textures/atlas/chest.png");
   public static final alz g = alz.b("textures/atlas/armor_trims.png");
   public static final alz h = alz.b("textures/atlas/decorated_pot.png");
   private static final glv C = glv.g(a);
   private static final glv D = glv.d(b);
   private static final glv E = glv.n(c);
   private static final glv F = glv.n(d);
   private static final glv G = glv.g(e);
   private static final glv H = glv.f(f);
   private static final glv I = glv.a(g);
   private static final glv J = glv.b(g);
   private static final glv K = glv.d(hbk.d);
   private static final glv L = glv.f(hbk.d);
   private static final glv M = glv.i(hbk.d);
   public static final hdu i = new hdu(a, alz.b("entity/shulker/shulker"));
   public static final List<hdu> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new hdu(a, alz.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dzh, hdu> k = dzh.a().collect(Collectors.toMap(Function.identity(), gmg::c));
   public static final Map<dzh, hdu> l = dzh.a().collect(Collectors.toMap(Function.identity(), gmg::d));
   public static final hdu m = new hdu(c, alz.b("entity/banner/base"));
   public static final hdu n = new hdu(d, alz.b("entity/shield/base"));
   private static final Map<alz, hdu> N = new HashMap<>();
   private static final Map<alz, hdu> O = new HashMap<>();
   public static final Map<aly<dvp>, hdu> o = ma.ak.c().collect(Collectors.toMap(jq.c::h, $$0 -> a($$0.a().a())));
   public static final hdu p = a(alz.b("decorated_pot_base"));
   public static final hdu q = a(alz.b("decorated_pot_side"));
   public static final hdu[] r = Arrays.stream(cwm.values())
      .sorted(Comparator.comparingInt(cwm::a))
      .map($$0 -> new hdu(b, alz.b("entity/bed/" + $$0.b())))
      .toArray(hdu[]::new);
   public static final hdu s = a("trapped");
   public static final hdu t = a("trapped_left");
   public static final hdu u = a("trapped_right");
   public static final hdu v = a("christmas");
   public static final hdu w = a("christmas_left");
   public static final hdu x = a("christmas_right");
   public static final hdu y = a("normal");
   public static final hdu z = a("normal_left");
   public static final hdu A = a("normal_right");
   public static final hdu B = a("ender");

   public static glv a() {
      return E;
   }

   public static glv b() {
      return F;
   }

   public static glv c() {
      return D;
   }

   public static glv d() {
      return C;
   }

   public static glv e() {
      return G;
   }

   public static glv f() {
      return G;
   }

   public static glv g() {
      return H;
   }

   public static glv a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static glv h() {
      return K;
   }

   public static glv i() {
      return L;
   }

   public static glv j() {
      return M;
   }

   private static hdu c(dzh $$0) {
      return new hdu(e, alz.b("entity/signs/" + $$0.b()));
   }

   private static hdu d(dzh $$0) {
      return new hdu(e, alz.b("entity/signs/hanging/" + $$0.b()));
   }

   public static hdu a(dzh $$0) {
      return k.get($$0);
   }

   public static hdu b(dzh $$0) {
      return l.get($$0);
   }

   public static hdu a(jq<dun> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alz $$1 = $$0x.f("entity/banner/");
         return new hdu(c, $$1);
      });
   }

   public static hdu b(jq<dun> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         alz $$1 = $$0x.f("entity/shield/");
         return new hdu(d, $$1);
      });
   }

   private static hdu a(String $$0) {
      return new hdu(f, alz.b("entity/chest/" + $$0));
   }

   private static hdu a(alz $$0) {
      return new hdu(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hdu a(@Nullable aly<dvp> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hdu a(dux $$0, dyn $$1, boolean $$2) {
      if ($$0 instanceof dvu) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dwt ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static hdu a(dyn $$0, hdu $$1, hdu $$2, hdu $$3) {
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
