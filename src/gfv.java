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

public class gfv {
   public static final akt a = new akt("textures/atlas/shulker_boxes.png");
   public static final akt b = new akt("textures/atlas/beds.png");
   public static final akt c = new akt("textures/atlas/banner_patterns.png");
   public static final akt d = new akt("textures/atlas/shield_patterns.png");
   public static final akt e = new akt("textures/atlas/signs.png");
   public static final akt f = new akt("textures/atlas/chest.png");
   public static final akt g = new akt("textures/atlas/armor_trims.png");
   public static final akt h = new akt("textures/atlas/decorated_pot.png");
   private static final gfo A = gfo.e(a);
   private static final gfo B = gfo.c(b);
   private static final gfo C = gfo.m(c);
   private static final gfo D = gfo.m(d);
   private static final gfo E = gfo.e(e);
   private static final gfo F = gfo.d(f);
   private static final gfo G = gfo.a(g);
   private static final gfo H = gfo.b(g);
   private static final gfo I = gfo.c(gqx.e);
   private static final gfo J = gfo.d(gqx.e);
   private static final gfo K = gfo.g(gqx.e);
   private static final gfo L = gfo.h(gqx.e);
   public static final gtc i = new gtc(a, new akt("entity/shulker/shulker"));
   public static final List<gtc> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gtc(a, new akt("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dup, gtc> k = dup.a().collect(Collectors.toMap(Function.identity(), gfv::c));
   public static final Map<dup, gtc> l = dup.a().collect(Collectors.toMap(Function.identity(), gfv::d));
   public static final gtc m = new gtc(c, new akt("entity/banner/base"));
   public static final gtc n = new gtc(d, new akt("entity/shield/base"));
   private static final Map<akt, gtc> M = new HashMap<>();
   private static final Map<akt, gtc> N = new HashMap<>();
   public static final Map<aks<String>, gtc> o = lh.an.f().stream().collect(Collectors.toMap(Function.identity(), gfv::b));
   public static final gtc[] p = Arrays.stream(csy.values())
      .sorted(Comparator.comparingInt(csy::a))
      .map($$0 -> new gtc(b, new akt("entity/bed/" + $$0.b())))
      .toArray(gtc[]::new);
   public static final gtc q = a("trapped");
   public static final gtc r = a("trapped_left");
   public static final gtc s = a("trapped_right");
   public static final gtc t = a("christmas");
   public static final gtc u = a("christmas_left");
   public static final gtc v = a("christmas_right");
   public static final gtc w = a("normal");
   public static final gtc x = a("normal_left");
   public static final gtc y = a("normal_right");
   public static final gtc z = a("ender");

   public static gfo a() {
      return C;
   }

   public static gfo b() {
      return D;
   }

   public static gfo c() {
      return B;
   }

   public static gfo d() {
      return A;
   }

   public static gfo e() {
      return E;
   }

   public static gfo f() {
      return E;
   }

   public static gfo g() {
      return F;
   }

   public static gfo a(boolean $$0) {
      return $$0 ? H : G;
   }

   public static gfo h() {
      return I;
   }

   public static gfo i() {
      return J;
   }

   public static gfo j() {
      return K;
   }

   public static gfo k() {
      return L;
   }

   private static gtc c(dup $$0) {
      return new gtc(e, new akt("entity/signs/" + $$0.b()));
   }

   private static gtc d(dup $$0) {
      return new gtc(e, new akt("entity/signs/hanging/" + $$0.b()));
   }

   public static gtc a(dup $$0) {
      return k.get($$0);
   }

   public static gtc b(dup $$0) {
      return l.get($$0);
   }

   public static gtc a(ja<dpr> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         akt $$1 = $$0x.d("entity/banner/");
         return new gtc(c, $$1);
      });
   }

   public static gtc b(ja<dpr> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         akt $$1 = $$0x.d("entity/shield/");
         return new gtc(d, $$1);
      });
   }

   private static gtc a(String $$0) {
      return new gtc(f, new akt("entity/chest/" + $$0));
   }

   private static gtc b(aks<String> $$0) {
      return new gtc(h, dqt.a($$0));
   }

   @Nullable
   public static gtc a(@Nullable aks<String> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gtc a(dqc $$0, dtu $$1, boolean $$2) {
      if ($$0 instanceof dqx) {
         return z;
      } else if ($$2) {
         return a($$1, t, u, v);
      } else {
         return $$0 instanceof dsa ? a($$1, q, r, s) : a($$1, w, x, y);
      }
   }

   private static gtc a(dtu $$0, gtc $$1, gtc $$2, gtc $$3) {
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
