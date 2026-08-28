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

public class gmb {
   public static final alp a = alp.b("textures/atlas/shulker_boxes.png");
   public static final alp b = alp.b("textures/atlas/beds.png");
   public static final alp c = alp.b("textures/atlas/banner_patterns.png");
   public static final alp d = alp.b("textures/atlas/shield_patterns.png");
   public static final alp e = alp.b("textures/atlas/signs.png");
   public static final alp f = alp.b("textures/atlas/chest.png");
   public static final alp g = alp.b("textures/atlas/armor_trims.png");
   public static final alp h = alp.b("textures/atlas/decorated_pot.png");
   private static final glq C = glq.g(a);
   private static final glq D = glq.d(b);
   private static final glq E = glq.n(c);
   private static final glq F = glq.n(d);
   private static final glq G = glq.g(e);
   private static final glq H = glq.f(f);
   private static final glq I = glq.a(g);
   private static final glq J = glq.b(g);
   private static final glq K = glq.d(hbf.d);
   private static final glq L = glq.f(hbf.d);
   private static final glq M = glq.i(hbf.d);
   public static final hdp i = new hdp(a, alp.b("entity/shulker/shulker"));
   public static final List<hdp> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new hdp(a, alp.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dza, hdp> k = dza.a().collect(Collectors.toMap(Function.identity(), gmb::c));
   public static final Map<dza, hdp> l = dza.a().collect(Collectors.toMap(Function.identity(), gmb::d));
   public static final hdp m = new hdp(c, alp.b("entity/banner/base"));
   public static final hdp n = new hdp(d, alp.b("entity/shield/base"));
   private static final Map<alp, hdp> N = new HashMap<>();
   private static final Map<alp, hdp> O = new HashMap<>();
   public static final Map<alo<dvi>, hdp> o = ma.ak.c().collect(Collectors.toMap(jq.c::h, $$0 -> a($$0.a().a())));
   public static final hdp p = a(alp.b("decorated_pot_base"));
   public static final hdp q = a(alp.b("decorated_pot_side"));
   public static final hdp[] r = Arrays.stream(cwd.values())
      .sorted(Comparator.comparingInt(cwd::a))
      .map($$0 -> new hdp(b, alp.b("entity/bed/" + $$0.b())))
      .toArray(hdp[]::new);
   public static final hdp s = a("trapped");
   public static final hdp t = a("trapped_left");
   public static final hdp u = a("trapped_right");
   public static final hdp v = a("christmas");
   public static final hdp w = a("christmas_left");
   public static final hdp x = a("christmas_right");
   public static final hdp y = a("normal");
   public static final hdp z = a("normal_left");
   public static final hdp A = a("normal_right");
   public static final hdp B = a("ender");

   public static glq a() {
      return E;
   }

   public static glq b() {
      return F;
   }

   public static glq c() {
      return D;
   }

   public static glq d() {
      return C;
   }

   public static glq e() {
      return G;
   }

   public static glq f() {
      return G;
   }

   public static glq g() {
      return H;
   }

   public static glq a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static glq h() {
      return K;
   }

   public static glq i() {
      return L;
   }

   public static glq j() {
      return M;
   }

   private static hdp c(dza $$0) {
      return new hdp(e, alp.b("entity/signs/" + $$0.b()));
   }

   private static hdp d(dza $$0) {
      return new hdp(e, alp.b("entity/signs/hanging/" + $$0.b()));
   }

   public static hdp a(dza $$0) {
      return k.get($$0);
   }

   public static hdp b(dza $$0) {
      return l.get($$0);
   }

   public static hdp a(jq<dug> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alp $$1 = $$0x.f("entity/banner/");
         return new hdp(c, $$1);
      });
   }

   public static hdp b(jq<dug> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         alp $$1 = $$0x.f("entity/shield/");
         return new hdp(d, $$1);
      });
   }

   private static hdp a(String $$0) {
      return new hdp(f, alp.b("entity/chest/" + $$0));
   }

   private static hdp a(alp $$0) {
      return new hdp(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hdp a(@Nullable alo<dvi> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hdp a(duq $$0, dyg $$1, boolean $$2) {
      if ($$0 instanceof dvn) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dwm ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static hdp a(dyg $$0, hdp $$1, hdp $$2, hdp $$3) {
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
