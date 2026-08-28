import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gns {
   public static final aku a = aku.b("textures/atlas/shulker_boxes.png");
   public static final aku b = aku.b("textures/atlas/beds.png");
   public static final aku c = aku.b("textures/atlas/banner_patterns.png");
   public static final aku d = aku.b("textures/atlas/shield_patterns.png");
   public static final aku e = aku.b("textures/atlas/signs.png");
   public static final aku f = aku.b("textures/atlas/chest.png");
   public static final aku g = aku.b("textures/atlas/armor_trims.png");
   public static final aku h = aku.b("textures/atlas/decorated_pot.png");
   private static final gnh B = gnh.g(a);
   private static final gnh C = gnh.d(b);
   private static final gnh D = gnh.n(c);
   private static final gnh E = gnh.n(d);
   private static final gnh F = gnh.g(e);
   private static final gnh G = gnh.f(f);
   private static final gnh H = gnh.a(g);
   private static final gnh I = gnh.b(g);
   private static final gnh J = gnh.d(hfq.d);
   private static final gnh K = gnh.f(hfq.d);
   private static final gnh L = gnh.i(hfq.d);
   public static final hhy i = b(aku.b("shulker"));
   public static final List<hhy> j = Arrays.stream(cwe.values()).sorted(Comparator.comparingInt(cwe::a)).map(gns::f).collect(ImmutableList.toImmutableList());
   public static final Map<dzd, hhy> k = dzd.a().collect(Collectors.toMap(Function.identity(), gns::c));
   public static final Map<dzd, hhy> l = dzd.a().collect(Collectors.toMap(Function.identity(), gns::d));
   public static final hhy m = new hhy(c, aku.b("entity/banner/base"));
   public static final hhy n = new hhy(d, aku.b("entity/shield/base"));
   private static final Map<aku, hhy> M = new HashMap<>();
   private static final Map<aku, hhy> N = new HashMap<>();
   public static final Map<akt<dvk>, hhy> o = mb.ak.c().collect(Collectors.toMap(jr.c::h, $$0 -> f($$0.a().a())));
   public static final hhy p = f(aku.b("decorated_pot_base"));
   public static final hhy q = f(aku.b("decorated_pot_side"));
   private static final hhy[] O = Arrays.stream(cwe.values()).sorted(Comparator.comparingInt(cwe::a)).map(gns::c).toArray(hhy[]::new);
   public static final hhy r = a("trapped");
   public static final hhy s = a("trapped_left");
   public static final hhy t = a("trapped_right");
   public static final hhy u = a("christmas");
   public static final hhy v = a("christmas_left");
   public static final hhy w = a("christmas_right");
   public static final hhy x = a("normal");
   public static final hhy y = a("normal_left");
   public static final hhy z = a("normal_right");
   public static final hhy A = a("ender");

   public static gnh a() {
      return D;
   }

   public static gnh b() {
      return E;
   }

   public static gnh c() {
      return C;
   }

   public static gnh d() {
      return B;
   }

   public static gnh e() {
      return F;
   }

   public static gnh f() {
      return F;
   }

   public static gnh g() {
      return G;
   }

   public static gnh a(boolean $$0) {
      return $$0 ? I : H;
   }

   public static gnh h() {
      return J;
   }

   public static gnh i() {
      return K;
   }

   public static gnh j() {
      return L;
   }

   public static hhy a(cwe $$0) {
      return O[$$0.a()];
   }

   public static aku b(cwe $$0) {
      return aku.b($$0.b());
   }

   public static hhy c(cwe $$0) {
      return a(b($$0));
   }

   public static hhy a(aku $$0) {
      return new hhy(b, $$0.f("entity/bed/"));
   }

   public static hhy d(cwe $$0) {
      return j.get($$0.a());
   }

   public static aku e(cwe $$0) {
      return aku.b("shulker_" + $$0.b());
   }

   public static hhy f(cwe $$0) {
      return b(e($$0));
   }

   public static hhy b(aku $$0) {
      return new hhy(a, $$0.f("entity/shulker/"));
   }

   private static hhy c(dzd $$0) {
      return c(aku.b($$0.b()));
   }

   public static hhy c(aku $$0) {
      return new hhy(e, $$0.f("entity/signs/"));
   }

   private static hhy d(dzd $$0) {
      return d(aku.b($$0.b()));
   }

   public static hhy d(aku $$0) {
      return new hhy(e, $$0.f("entity/signs/hanging/"));
   }

   public static hhy a(dzd $$0) {
      return k.get($$0);
   }

   public static hhy b(dzd $$0) {
      return l.get($$0);
   }

   public static hhy a(jr<dui> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         aku $$1 = $$0x.f("entity/banner/");
         return new hhy(c, $$1);
      });
   }

   public static hhy b(jr<dui> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         aku $$1 = $$0x.f("entity/shield/");
         return new hhy(d, $$1);
      });
   }

   private static hhy a(String $$0) {
      return new hhy(f, aku.b("entity/chest/" + $$0));
   }

   public static hhy e(aku $$0) {
      return new hhy(f, $$0.f("entity/chest/"));
   }

   private static hhy f(aku $$0) {
      return new hhy(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hhy a(@Nullable akt<dvk> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hhy a(dus $$0, dyi $$1, boolean $$2) {
      if ($$0 instanceof dvp) {
         return A;
      } else if ($$2) {
         return a($$1, u, v, w);
      } else {
         return $$0 instanceof dwo ? a($$1, r, s, t) : a($$1, x, y, z);
      }
   }

   private static hhy a(dyi $$0, hhy $$1, hhy $$2, hhy $$3) {
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
