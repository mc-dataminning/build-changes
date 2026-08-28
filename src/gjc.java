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

public class gjc {
   public static final ali a = ali.b("textures/atlas/shulker_boxes.png");
   public static final ali b = ali.b("textures/atlas/beds.png");
   public static final ali c = ali.b("textures/atlas/banner_patterns.png");
   public static final ali d = ali.b("textures/atlas/shield_patterns.png");
   public static final ali e = ali.b("textures/atlas/signs.png");
   public static final ali f = ali.b("textures/atlas/chest.png");
   public static final ali g = ali.b("textures/atlas/armor_trims.png");
   public static final ali h = ali.b("textures/atlas/decorated_pot.png");
   private static final gir C = gir.f(a);
   private static final gir D = gir.c(b);
   private static final gir E = gir.m(c);
   private static final gir F = gir.m(d);
   private static final gir G = gir.f(e);
   private static final gir H = gir.e(f);
   private static final gir I = gir.a(g);
   private static final gir J = gir.b(g);
   private static final gir K = gir.c(gyc.d);
   private static final gir L = gir.e(gyc.d);
   private static final gir M = gir.h(gyc.d);
   public static final ham i = new ham(a, ali.b("entity/shulker/shulker"));
   public static final List<ham> j = Stream.of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .map($$0 -> new ham(a, ali.b("entity/shulker/shulker_" + $$0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<dww, ham> k = dww.a().collect(Collectors.toMap(Function.identity(), gjc::c));
   public static final Map<dww, ham> l = dww.a().collect(Collectors.toMap(Function.identity(), gjc::d));
   public static final ham m = new ham(c, ali.b("entity/banner/base"));
   public static final ham n = new ham(d, ali.b("entity/shield/base"));
   private static final Map<ali, ham> N = new HashMap<>();
   private static final Map<ali, ham> O = new HashMap<>();
   public static final Map<alh<dtd>, ham> o = ly.ak.c().collect(Collectors.toMap(jq.c::h, $$0 -> a($$0.a().a())));
   public static final ham p = a(ali.b("decorated_pot_base"));
   public static final ham q = a(ali.b("decorated_pot_side"));
   public static final ham[] r = Arrays.stream(cuy.values())
      .sorted(Comparator.comparingInt(cuy::a))
      .map($$0 -> new ham(b, ali.b("entity/bed/" + $$0.b())))
      .toArray(ham[]::new);
   public static final ham s = a("trapped");
   public static final ham t = a("trapped_left");
   public static final ham u = a("trapped_right");
   public static final ham v = a("christmas");
   public static final ham w = a("christmas_left");
   public static final ham x = a("christmas_right");
   public static final ham y = a("normal");
   public static final ham z = a("normal_left");
   public static final ham A = a("normal_right");
   public static final ham B = a("ender");

   public static gir a() {
      return E;
   }

   public static gir b() {
      return F;
   }

   public static gir c() {
      return D;
   }

   public static gir d() {
      return C;
   }

   public static gir e() {
      return G;
   }

   public static gir f() {
      return G;
   }

   public static gir g() {
      return H;
   }

   public static gir a(boolean $$0) {
      return $$0 ? J : I;
   }

   public static gir h() {
      return K;
   }

   public static gir i() {
      return L;
   }

   public static gir j() {
      return M;
   }

   private static ham c(dww $$0) {
      return new ham(e, ali.b("entity/signs/" + $$0.b()));
   }

   private static ham d(dww $$0) {
      return new ham(e, ali.b("entity/signs/hanging/" + $$0.b()));
   }

   public static ham a(dww $$0) {
      return k.get($$0);
   }

   public static ham b(dww $$0) {
      return l.get($$0);
   }

   public static ham a(jq<dsc> $$0) {
      return N.computeIfAbsent($$0.a().a(), $$0x -> {
         ali $$1 = $$0x.f("entity/banner/");
         return new ham(c, $$1);
      });
   }

   public static ham b(jq<dsc> $$0) {
      return O.computeIfAbsent($$0.a().a(), $$0x -> {
         ali $$1 = $$0x.f("entity/shield/");
         return new ham(d, $$1);
      });
   }

   private static ham a(String $$0) {
      return new ham(f, ali.b("entity/chest/" + $$0));
   }

   private static ham a(ali $$0) {
      return new ham(h, $$0.f("entity/decorated_pot/"));
   }

   @Nullable
   public static ham a(@Nullable alh<dtd> $$0) {
      return $$0 == null ? null : o.get($$0);
   }

   public static ham a(dsm $$0, dwb $$1, boolean $$2) {
      if ($$0 instanceof dti) {
         return B;
      } else if ($$2) {
         return a($$1, v, w, x);
      } else {
         return $$0 instanceof duh ? a($$1, s, t, u) : a($$1, y, z, A);
      }
   }

   private static ham a(dwb $$0, ham $$1, ham $$2, ham $$3) {
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
