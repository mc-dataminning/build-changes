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

public class gib {
   public static final alc a = alc.b("textures/atlas/shulker_boxes.png");
   public static final alc b = alc.b("textures/atlas/beds.png");
   public static final alc c = alc.b("textures/atlas/banner_patterns.png");
   public static final alc d = alc.b("textures/atlas/shield_patterns.png");
   public static final alc e = alc.b("textures/atlas/signs.png");
   public static final alc f = alc.b("textures/atlas/chest.png");
   public static final alc g = alc.b("textures/atlas/armor_trims.png");
   public static final alc h = alc.b("textures/atlas/decorated_pot.png");
   private static final ghq C = ghq.f(a);
   private static final ghq D = ghq.c(b);
   private static final ghq E = ghq.m(c);
   private static final ghq F = ghq.m(d);
   private static final ghq G = ghq.f(e);
   private static final ghq H = ghq.e(f);
   private static final ghq I = ghq.a(g);
   private static final ghq J = ghq.b(g);
   private static final ghq K = ghq.c(gxa.d);
   private static final ghq L = ghq.e(gxa.d);
   private static final ghq M = ghq.h(gxa.d);
   public static final gzh i = new gzh(a, alc.b("entity/shulker/shulker"));
   public static final List<gzh> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new gzh(a, alc.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dwb, gzh> k = dwb.a().collect(Collectors.toMap(Function.identity(), gib::c));
   public static final Map<dwb, gzh> l = dwb.a().collect(Collectors.toMap(Function.identity(), gib::d));
   public static final gzh m = new gzh(c, alc.b("entity/banner/base"));
   public static final gzh n = new gzh(d, alc.b("entity/shield/base"));
   private static final Map<alc, gzh> N = new HashMap<>();
   private static final Map<alc, gzh> O = new HashMap<>();
   public static final Map<alb<dsj>, gzh> o = lu.ak.i().collect(Collectors.toMap(jn.c::h, $$0 -> a($$0.a().a())));
   public static final gzh p = a(alc.b("decorated_pot_base"));
   public static final gzh q = a(alc.b("decorated_pot_side"));
   public static final gzh[] r = Arrays.stream(cuj.values())
      .sorted(Comparator.comparingInt(cuj::a))
      .map($$0 -> new gzh(b, alc.b("entity/bed/" + $$0.b())))
      .toArray(gzh[]::new);
   public static final gzh s = a("trapped");
   public static final gzh t = a("trapped_left");
   public static final gzh u = a("trapped_right");
   public static final gzh v = a("christmas");
   public static final gzh w = a("christmas_left");
   public static final gzh x = a("christmas_right");
   public static final gzh y = a("normal");
   public static final gzh z = a("normal_left");
   public static final gzh A = a("normal_right");
   public static final gzh B = a("ender");

   public static ghq a() {
      return E;
   }

   public static ghq b() {
      return F;
   }

   public static ghq c() {
      return D;
   }

   public static ghq d() {
      return C;
   }

   public static ghq e() {
      return G;
   }

   public static ghq f() {
      return G;
   }

   public static ghq g() {
      return H;
   }

   public static ghq a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static ghq h() {
      return K;
   }

   public static ghq i() {
      return L;
   }

   public static ghq j() {
      return M;
   }

   private static gzh c(dwb $$0) {
      return new gzh(e, alc.b("entity/signs/" + $$0.b()));
   }

   private static gzh d(dwb $$0) {
      return new gzh(e, alc.b("entity/signs/hanging/" + $$0.b()));
   }

   public static gzh a(dwb $$0) {
      return k.get($$0);
   }

   public static gzh b(dwb $$0) {
      return l.get($$0);
   }

   public static gzh a(jn<dri> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         alc $$1 = $$0x.f("entity/banner/");
         return new gzh(c, $$1);
      });
   }

   public static gzh b(jn<dri> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         alc $$1 = $$0x.f("entity/shield/");
         return new gzh(d, $$1);
      });
   }

   private static gzh a(String $$0) {
      return new gzh(f, alc.b("entity/chest/" + $$0));
   }

   private static gzh a(alc $$0) {
      return new gzh(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static gzh a(@Nullable alb<dsj> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static gzh a(drs $$0, dvg $$1, boolean $$2) {
      if ($$0 instanceof dso) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof dtn ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static gzh a(dvg $$0, gzh $$1, gzh $$2, gzh $$3) {
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
