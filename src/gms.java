import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gms {
   public static final aku a = aku.b("textures/atlas/shulker_boxes.png");
   public static final aku b = aku.b("textures/atlas/beds.png");
   public static final aku c = aku.b("textures/atlas/banner_patterns.png");
   public static final aku d = aku.b("textures/atlas/shield_patterns.png");
   public static final aku e = aku.b("textures/atlas/signs.png");
   public static final aku f = aku.b("textures/atlas/chest.png");
   public static final aku g = aku.b("textures/atlas/armor_trims.png");
   public static final aku h = aku.b("textures/atlas/decorated_pot.png");
   private static final gmh B = gmh.g(a);
   private static final gmh C = gmh.d(b);
   private static final gmh D = gmh.n(c);
   private static final gmh E = gmh.n(d);
   private static final gmh F = gmh.g(e);
   private static final gmh G = gmh.f(f);
   private static final gmh H = gmh.a(g);
   private static final gmh I = gmh.b(g);
   private static final gmh J = gmh.d(hei.d);
   private static final gmh K = gmh.f(hei.d);
   private static final gmh L = gmh.i(hei.d);
   public static final hgs i = b(aku.b("shulker"));
   public static final List<hgs> j = Arrays.stream(cvm.values()).sorted(Comparator.comparingInt(cvm::a)).map(gms::f).collect(ImmutableList.toImmutableList());
   public static final Map<dyj, hgs> k = dyj.a().collect(Collectors.toMap(Function.identity(), gms::c));
   public static final Map<dyj, hgs> l = dyj.a().collect(Collectors.toMap(Function.identity(), gms::d));
   public static final hgs m = new hgs(c, aku.b("entity/banner/base"));
   public static final hgs n = new hgs(d, aku.b("entity/shield/base"));
   private static final Map<aku, hgs> M = new HashMap<>();
   private static final Map<aku, hgs> N = new HashMap<>();
   public static final Map<akt<dur>, hgs> o = mb.ak.c().collect(Collectors.toMap(jr.c::h, $$0 -> d($$0.a().a())));
   public static final hgs p = d(aku.b("decorated_pot_base"));
   public static final hgs q = d(aku.b("decorated_pot_side"));
   private static final hgs[] O = Arrays.stream(cvm.values()).sorted(Comparator.comparingInt(cvm::a)).map(gms::c).toArray(hgs[]::new);
   public static final hgs r = a("trapped");
   public static final hgs s = a("trapped_left");
   public static final hgs t = a("trapped_right");
   public static final hgs u = a("christmas");
   public static final hgs v = a("christmas_left");
   public static final hgs w = a("christmas_right");
   public static final hgs x = a("normal");
   public static final hgs y = a("normal_left");
   public static final hgs z = a("normal_right");
   public static final hgs A = a("ender");

   public static gmh a() {
      return D;
   }

   public static gmh b() {
      return E;
   }

   public static gmh c() {
      return C;
   }

   public static gmh d() {
      return B;
   }

   public static gmh e() {
      return F;
   }

   public static gmh f() {
      return F;
   }

   public static gmh g() {
      return G;
   }

   public static gmh a(boolean $$0) {
      return $$0 ? I : H;
   }

   public static gmh h() {
      return J;
   }

   public static gmh i() {
      return K;
   }

   public static gmh j() {
      return L;
   }

   public static hgs a(cvm $$0) {
      return O[$$0.a()];
   }

   public static aku b(cvm $$0) {
      return aku.b($$0.b());
   }

   public static hgs c(cvm $$0) {
      return a(b($$0));
   }

   public static hgs a(aku $$0) {
      return new hgs(b, $$0.f("entity/bed/"));
   }

   public static hgs d(cvm $$0) {
      return j.get($$0.a());
   }

   public static aku e(cvm $$0) {
      return aku.b("shulker_" + $$0.b());
   }

   public static hgs f(cvm $$0) {
      return b(e($$0));
   }

   public static hgs b(aku $$0) {
      return new hgs(a, $$0.f("entity/shulker/"));
   }

   private static hgs c(dyj $$0) {
      return new hgs(e, aku.b("entity/signs/" + $$0.b()));
   }

   private static hgs d(dyj $$0) {
      return new hgs(e, aku.b("entity/signs/hanging/" + $$0.b()));
   }

   public static hgs a(dyj $$0) {
      return k.get($$0);
   }

   public static hgs b(dyj $$0) {
      return l.get($$0);
   }

   public static hgs a(jr<dtp> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         aku $$1 = $$0x.f("entity/banner/");
         return new hgs(c, $$1);
      });
   }

   public static hgs b(jr<dtp> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         aku $$1 = $$0x.f("entity/shield/");
         return new hgs(d, $$1);
      });
   }

   private static hgs a(String $$0) {
      return new hgs(f, aku.b("entity/chest/" + $$0));
   }

   public static hgs c(aku $$0) {
      return new hgs(f, $$0.f("entity/chest/"));
   }

   private static hgs d(aku $$0) {
      return new hgs(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hgs a(@Nullable akt<dur> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hgs a(dtz $$0, dxp $$1, boolean $$2) {
      if ($$0 instanceof duw) {
         return A;
      } else if ($$2) {
         return a($$1, u, v, w);
      } else {
         return $$0 instanceof dvv ? a($$1, r, s, t) : a($$1, x, y, z);
      }
   }

   private static hgs a(dxp $$0, hgs $$1, hgs $$2, hgs $$3) {
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
