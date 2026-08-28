import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class got {
   public static final ald a = ald.b("textures/atlas/shulker_boxes.png");
   public static final ald b = ald.b("textures/atlas/beds.png");
   public static final ald c = ald.b("textures/atlas/banner_patterns.png");
   public static final ald d = ald.b("textures/atlas/shield_patterns.png");
   public static final ald e = ald.b("textures/atlas/signs.png");
   public static final ald f = ald.b("textures/atlas/chest.png");
   public static final ald g = ald.b("textures/atlas/armor_trims.png");
   public static final ald h = ald.b("textures/atlas/decorated_pot.png");
   private static final goi B = goi.g(a);
   private static final goi C = goi.d(b);
   private static final goi D = goi.n(c);
   private static final goi E = goi.n(d);
   private static final goi F = goi.g(e);
   private static final goi G = goi.f(f);
   private static final goi H = goi.a(g);
   private static final goi I = goi.b(g);
   private static final goi J = goi.d(hgr.d);
   private static final goi K = goi.f(hgr.d);
   private static final goi L = goi.i(hgr.d);
   public static final hiz i = b(ald.b("shulker"));
   public static final List<hiz> j = Arrays.stream(cwv.values()).sorted(Comparator.comparingInt(cwv::a)).map(got::f).collect(ImmutableList.toImmutableList());
   public static final Map<eaa, hiz> k = eaa.a().collect(Collectors.toMap(Function.identity(), got::c));
   public static final Map<eaa, hiz> l = eaa.a().collect(Collectors.toMap(Function.identity(), got::d));
   public static final hiz m = new hiz(c, ald.b("entity/banner/base"));
   public static final hiz n = new hiz(d, ald.b("entity/shield/base"));
   private static final Map<ald, hiz> M = new HashMap<>();
   private static final Map<ald, hiz> N = new HashMap<>();
   public static final Map<alc<dwe>, hiz> o = md.ak.c().collect(Collectors.toMap(js.c::h, $$0 -> f($$0.a().a())));
   public static final hiz p = f(ald.b("decorated_pot_base"));
   public static final hiz q = f(ald.b("decorated_pot_side"));
   private static final hiz[] O = Arrays.stream(cwv.values()).sorted(Comparator.comparingInt(cwv::a)).map(got::c).toArray(hiz[]::new);
   public static final hiz r = a("trapped");
   public static final hiz s = a("trapped_left");
   public static final hiz t = a("trapped_right");
   public static final hiz u = a("christmas");
   public static final hiz v = a("christmas_left");
   public static final hiz w = a("christmas_right");
   public static final hiz x = a("normal");
   public static final hiz y = a("normal_left");
   public static final hiz z = a("normal_right");
   public static final hiz A = a("ender");

   public static goi a() {
      return D;
   }

   public static goi b() {
      return E;
   }

   public static goi c() {
      return C;
   }

   public static goi d() {
      return B;
   }

   public static goi e() {
      return F;
   }

   public static goi f() {
      return F;
   }

   public static goi g() {
      return G;
   }

   public static goi a(boolean $$0) {
      return $$0 ? I : H;
   }

   public static goi h() {
      return J;
   }

   public static goi i() {
      return K;
   }

   public static goi j() {
      return L;
   }

   public static hiz a(cwv $$0) {
      return O[$$0.a()];
   }

   public static ald b(cwv $$0) {
      return ald.b($$0.b());
   }

   public static hiz c(cwv $$0) {
      return a(b($$0));
   }

   public static hiz a(ald $$0) {
      return new hiz(b, $$0.f("entity/bed/"));
   }

   public static hiz d(cwv $$0) {
      return j.get($$0.a());
   }

   public static ald e(cwv $$0) {
      return ald.b("shulker_" + $$0.b());
   }

   public static hiz f(cwv $$0) {
      return b(e($$0));
   }

   public static hiz b(ald $$0) {
      return new hiz(a, $$0.f("entity/shulker/"));
   }

   private static hiz c(eaa $$0) {
      return c(ald.b($$0.b()));
   }

   public static hiz c(ald $$0) {
      return new hiz(e, $$0.f("entity/signs/"));
   }

   private static hiz d(eaa $$0) {
      return d(ald.b($$0.b()));
   }

   public static hiz d(ald $$0) {
      return new hiz(e, $$0.f("entity/signs/hanging/"));
   }

   public static hiz a(eaa $$0) {
      return k.get($$0);
   }

   public static hiz b(eaa $$0) {
      return l.get($$0);
   }

   public static hiz a(js<dva> $$0) {
      return M.computeIfAbsent($$0.a().a(), $$0x -> {
         ald $$1 = $$0x.f("entity/banner/");
         return new hiz(c, $$1);
      });
   }

   public static hiz b(js<dva> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         ald $$1 = $$0x.f("entity/shield/");
         return new hiz(d, $$1);
      });
   }

   private static hiz a(String $$0) {
      return new hiz(f, ald.b("entity/chest/" + $$0));
   }

   public static hiz e(ald $$0) {
      return new hiz(f, $$0.f("entity/chest/"));
   }

   private static hiz f(ald $$0) {
      return new hiz(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static hiz a(@Nullable alc<dwe> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static hiz a(dvl $$0, dze $$1, boolean $$2) {
      if ($$0 instanceof dwj) {
         return A;
      } else if ($$2) {
         return a($$1, u, v, w);
      } else {
         return $$0 instanceof dxk ? a($$1, r, s, t) : a($$1, x, y, z);
      }
   }

   private static hiz a(dze $$0, hiz $$1, hiz $$2, hiz $$3) {
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
