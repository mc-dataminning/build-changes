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

public class gem {
   public static final akk a = new akk("textures/atlas/shulker_boxes.png");
   public static final akk b = new akk("textures/atlas/beds.png");
   public static final akk c = new akk("textures/atlas/banner_patterns.png");
   public static final akk d = new akk("textures/atlas/shield_patterns.png");
   public static final akk e = new akk("textures/atlas/signs.png");
   public static final akk f = new akk("textures/atlas/chest.png");
   public static final akk g = new akk("textures/atlas/armor_trims.png");
   public static final akk h = new akk("textures/atlas/decorated_pot.png");
   private static final gef A = gef.e(a);
   private static final gef B = gef.c(b);
   private static final gef C = gef.m(c);
   private static final gef D = gef.m(d);
   private static final gef E = gef.e(e);
   private static final gef F = gef.d(f);
   private static final gef G = gef.a(g);
   private static final gef H = gef.b(g);
   private static final gef I = gef.c(gph.e);
   private static final gef J = gef.d(gph.e);
   private static final gef K = gef.g(gph.e);
   private static final gef L = gef.h(gph.e);
   public static final grm i = new grm(a, new akk("entity/shulker/shulker"));
   public static final List<grm> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new grm(a, new akk("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dtu, grm> k = dtu.a().collect(Collectors.toMap(Function.identity(), gem::c));
   public static final Map<dtu, grm> l = dtu.a().collect(Collectors.toMap(Function.identity(), gem::d));
   public static final grm m = new grm(c, new akk("entity/banner/base"));
   public static final grm n = new grm(d, new akk("entity/shield/base"));
   private static final Map<akk, grm> M = new HashMap<>();
   private static final Map<akk, grm> N = new HashMap<>();
   public static final Map<akj<String>, grm> o = lq.al.g().stream().collect(Collectors.toMap(Function.identity(), gem::b));
   public static final grm[] p = Arrays.stream(cst.values())
      .sorted(Comparator.comparingInt(cst::a))
      .map($$0 -> new grm(b, new akk("entity/bed/" + $$0.b())))
      .toArray(grm[]::new);
   public static final grm q = a("trapped");
   public static final grm r = a("trapped_left");
   public static final grm s = a("trapped_right");
   public static final grm t = a("christmas");
   public static final grm u = a("christmas_left");
   public static final grm v = a("christmas_right");
   public static final grm w = a("normal");
   public static final grm x = a("normal_left");
   public static final grm y = a("normal_right");
   public static final grm z = a("ender");

   public static gef a() {
      return C;
   }

   public static gef b() {
      return D;
   }

   public static gef c() {
      return B;
   }

   public static gef d() {
      return A;
   }

   public static gef e() {
      return E;
   }

   public static gef f() {
      return E;
   }

   public static gef g() {
      return F;
   }

   public static gef a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gef h() {
      return I;
   }

   public static gef i() {
      return J;
   }

   public static gef j() {
      return K;
   }

   public static gef k() {
      return L;
   }

   private static grm c(dtu $$0) {
      return new grm(e, new akk("entity/signs/" + $$0.b()));
   }

   private static grm d(dtu $$0) {
      return new grm(e, new akk("entity/signs/hanging/" + $$0.b()));
   }

   public static grm a(dtu $$0) {
      return k.get($$0);
   }

   public static grm b(dtu $$0) {
      return l.get($$0);
   }

   public static grm a(jj<dpd> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         akk $$1 = $$0x.d("entity/banner/");
         return new grm(c, $$1);
      });
   }

   public static grm b(jj<dpd> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         akk $$1 = $$0x.d("entity/shield/");
         return new grm(d, $$1);
      });
   }

   private static grm a(String $$0) {
      return new grm(f, new akk("entity/chest/" + $$0));
   }

   private static grm b(akj<String> $$0) {
      return new grm(h, dqe.a($$0));
   }

   @Nullable
   public static grm a(@Nullable akj<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static grm a(dpn $$0, dsz $$1, boolean $$2) {
      if ($$0 instanceof dqi) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof drg ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static grm a(dsz $$0, grm $$1, grm $$2, grm $$3) {
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
