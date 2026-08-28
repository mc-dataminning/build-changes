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

public class gec {
   public static final ale a = new ale("textures/atlas/shulker_boxes.png");
   public static final ale b = new ale("textures/atlas/beds.png");
   public static final ale c = new ale("textures/atlas/banner_patterns.png");
   public static final ale d = new ale("textures/atlas/shield_patterns.png");
   public static final ale e = new ale("textures/atlas/signs.png");
   public static final ale f = new ale("textures/atlas/chest.png");
   public static final ale g = new ale("textures/atlas/armor_trims.png");
   public static final ale h = new ale("textures/atlas/decorated_pot.png");
   private static final gdv A = gdv.e(a);
   private static final gdv B = gdv.c(b);
   private static final gdv C = gdv.m(c);
   private static final gdv D = gdv.m(d);
   private static final gdv E = gdv.e(e);
   private static final gdv F = gdv.d(f);
   private static final gdv G = gdv.a(g);
   private static final gdv H = gdv.b(g);
   private static final gdv I = gdv.c(gox.e);
   private static final gdv J = gdv.d(gox.e);
   private static final gdv K = gdv.g(gox.e);
   private static final gdv L = gdv.h(gox.e);
   public static final grc i = new grc(a, new ale("entity/shulker/shulker"));
   public static final List<grc> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new grc(a, new ale("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dto, grc> k = dto.a().collect(Collectors.toMap(Function.identity(), gec::c));
   public static final Map<dto, grc> l = dto.a().collect(Collectors.toMap(Function.identity(), gec::d));
   public static final grc m = new grc(c, new ale("entity/banner/base"));
   public static final grc n = new grc(d, new ale("entity/shield/base"));
   private static final Map<ale, grc> M = new HashMap<>();
   private static final Map<ale, grc> N = new HashMap<>();
   public static final Map<ald<String>, grc> o = lp.an.f().stream().collect(Collectors.toMap(Function.identity(), gec::b));
   public static final grc[] p = Arrays.stream(cth.values())
      .sorted(Comparator.comparingInt(cth::a))
      .map($$0 -> new grc(b, new ale("entity/bed/" + $$0.b())))
      .toArray(grc[]::new);
   public static final grc q = a("trapped");
   public static final grc r = a("trapped_left");
   public static final grc s = a("trapped_right");
   public static final grc t = a("christmas");
   public static final grc u = a("christmas_left");
   public static final grc v = a("christmas_right");
   public static final grc w = a("normal");
   public static final grc x = a("normal_left");
   public static final grc y = a("normal_right");
   public static final grc z = a("ender");

   public static gdv a() {
      return C;
   }

   public static gdv b() {
      return D;
   }

   public static gdv c() {
      return B;
   }

   public static gdv d() {
      return A;
   }

   public static gdv e() {
      return E;
   }

   public static gdv f() {
      return E;
   }

   public static gdv g() {
      return F;
   }

   public static gdv a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gdv h() {
      return I;
   }

   public static gdv i() {
      return J;
   }

   public static gdv j() {
      return K;
   }

   public static gdv k() {
      return L;
   }

   private static grc c(dto $$0) {
      return new grc(e, new ale("entity/signs/" + $$0.b()));
   }

   private static grc d(dto $$0) {
      return new grc(e, new ale("entity/signs/hanging/" + $$0.b()));
   }

   public static grc a(dto $$0) {
      return k.get($$0);
   }

   public static grc b(dto $$0) {
      return l.get($$0);
   }

   public static grc a(ji<dow> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         ale $$1 = $$0x.d("entity/banner/");
         return new grc(c, $$1);
      });
   }

   public static grc b(ji<dow> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         ale $$1 = $$0x.d("entity/shield/");
         return new grc(d, $$1);
      });
   }

   private static grc a(String $$0) {
      return new grc(f, new ale("entity/chest/" + $$0));
   }

   private static grc b(ald<String> $$0) {
      return new grc(h, dpx.a($$0));
   }

   @Nullable
   public static grc a(@Nullable ald<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static grc a(dpg $$0, dst $$1, boolean $$2) {
      if ($$0 instanceof dqb) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dqz ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static grc a(dst $$0, grc $$1, grc $$2, grc $$3) {
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
