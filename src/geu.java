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

public class geu {
   public static final akk a = new akk("textures/atlas/shulker_boxes.png");
   public static final akk b = new akk("textures/atlas/beds.png");
   public static final akk c = new akk("textures/atlas/banner_patterns.png");
   public static final akk d = new akk("textures/atlas/shield_patterns.png");
   public static final akk e = new akk("textures/atlas/signs.png");
   public static final akk f = new akk("textures/atlas/chest.png");
   public static final akk g = new akk("textures/atlas/armor_trims.png");
   public static final akk h = new akk("textures/atlas/decorated_pot.png");
   private static final gen C = gen.e(a);
   private static final gen D = gen.c(b);
   private static final gen E = gen.m(c);
   private static final gen F = gen.m(d);
   private static final gen G = gen.e(e);
   private static final gen H = gen.d(f);
   private static final gen I = gen.a(g);
   private static final gen J = gen.b(g);
   private static final gen K = gen.c(gpp.e);
   private static final gen L = gen.d(gpp.e);
   private static final gen M = gen.g(gpp.e);
   private static final gen N = gen.h(gpp.e);
   public static final gru i = new gru(a, new akk("entity/shulker/shulker"));
   public static final List<gru> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gru(a, new akk("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dty, gru> k = dty.a().collect(Collectors.toMap(Function.identity(), geu::c));
   public static final Map<dty, gru> l = dty.a().collect(Collectors.toMap(Function.identity(), geu::d));
   public static final gru m = new gru(c, new akk("entity/banner/base"));
   public static final gru n = new gru(d, new akk("entity/shield/base"));
   private static final Map<akk, gru> O = new HashMap<>();
   private static final Map<akk, gru> P = new HashMap<>();
   public static final Map<akj<dqh>, gru> o = lq.al.i().collect(Collectors.toMap(jj.c::h, $$0 -> a($$0.a().a())));
   public static final gru p = a(new akk("decorated_pot_base"));
   public static final gru q = a(new akk("decorated_pot_side"));
   public static final gru[] r = Arrays.stream(csw.values())
      .sorted(Comparator.comparingInt(csw::a))
      .map($$0 -> new gru(b, new akk("entity/bed/" + $$0.b())))
      .toArray(gru[]::new);
   public static final gru s = a("trapped");
   public static final gru t = a("trapped_left");
   public static final gru u = a("trapped_right");
   public static final gru v = a("christmas");
   public static final gru w = a("christmas_left");
   public static final gru x = a("christmas_right");
   public static final gru y = a("normal");
   public static final gru z = a("normal_left");
   public static final gru A = a("normal_right");
   public static final gru B = a("ender");

   public static gen a() {
      return E;
   }

   public static gen b() {
      return F;
   }

   public static gen c() {
      return D;
   }

   public static gen d() {
      return C;
   }

   public static gen e() {
      return G;
   }

   public static gen f() {
      return G;
   }

   public static gen g() {
      return H;
   }

   public static gen a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static gen h() {
      return K;
   }

   public static gen i() {
      return L;
   }

   public static gen j() {
      return M;
   }

   public static gen k() {
      return N;
   }

   private static gru c(dty $$0) {
      return new gru(e, new akk("entity/signs/" + $$0.b()));
   }

   private static gru d(dty $$0) {
      return new gru(e, new akk("entity/signs/hanging/" + $$0.b()));
   }

   public static gru a(dty $$0) {
      return k.get($$0);
   }

   public static gru b(dty $$0) {
      return l.get($$0);
   }

   public static gru a(jj<dpg> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         akk $$1 = $$0x.d("entity/banner/");
         return new gru(c, $$1);
      });
   }

   public static gru b(jj<dpg> $$0) {
      return P.computeIfAbsent($$0.a().a(), $$0x -> {
         akk $$1 = $$0x.d("entity/shield/");
         return new gru(d, $$1);
      });
   }

   private static gru a(String $$0) {
      return new gru(f, new akk("entity/chest/" + $$0));
   }

   private static gru a(akk $$0) {
      return new gru(h, $$0.d("entity/decorated_pot/"));
   }

   @Nullable
   public static gru a(@Nullable akj<dqh> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gru a(dpq $$0, dtd $$1, boolean $$2) {
      if ($$0 instanceof dqm) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof drk ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static gru a(dtd $$0, gru $$1, gru $$2, gru $$3) {
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
