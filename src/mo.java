import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class mo {
   private final Map<mp, ahd> a = Maps.newHashMap();
   private final Set<mp> b = Sets.newHashSet();

   public mo a(mp $$0, ahd $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public mo b(mp $$0, ahd $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<mp> a() {
      return this.b.stream();
   }

   public mo a(mp $$0, mp $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public mo b(mp $$0, mp $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ahd a(mp $$0) {
      for (mp $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ahd $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public mo c(mp $$0, ahd $$1) {
      mo $$2 = new mo();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static mo a(cwj $$0) {
      ahd $$1 = G($$0);
      return b($$1);
   }

   public static mo b(cwj $$0) {
      ahd $$1 = G($$0);
      return a($$1);
   }

   public static mo a(ahd $$0) {
      return new mo().a(mp.b, $$0);
   }

   public static mo b(ahd $$0) {
      return new mo().a(mp.a, $$0);
   }

   public static mo c(cwj $$0) {
      return d(mp.p, G($$0));
   }

   public static mo c(ahd $$0) {
      return d(mp.p, $$0);
   }

   public static mo d(cwj $$0) {
      return d(mp.q, G($$0));
   }

   public static mo d(ahd $$0) {
      return d(mp.q, $$0);
   }

   public static mo e(cwj $$0) {
      return d(mp.s, G($$0));
   }

   public static mo e(ahd $$0) {
      return d(mp.s, $$0);
   }

   public static mo f(cwj $$0) {
      return d(mp.t, G($$0));
   }

   public static mo g(cwj $$0) {
      return new mo().a(mp.P, G($$0)).a(mp.y, a($$0, "_stem"));
   }

   public static mo f(ahd $$0) {
      return d(mp.t, $$0);
   }

   public static mo h(cwj $$0) {
      return d(mp.y, G($$0));
   }

   public static mo a(cwj $$0, cwj $$1) {
      return new mo().a(mp.y, G($$0)).a(mp.z, G($$1));
   }

   public static mo i(cwj $$0) {
      return d(mp.u, G($$0));
   }

   public static mo j(cwj $$0) {
      return d(mp.x, G($$0));
   }

   public static mo g(ahd $$0) {
      return d(mp.A, $$0);
   }

   public static mo b(cwj $$0, cwj $$1) {
      return new mo().a(mp.v, G($$0)).a(mp.w, a($$1, "_top"));
   }

   public static mo d(mp $$0, ahd $$1) {
      return new mo().a($$0, $$1);
   }

   public static mo k(cwj $$0) {
      return new mo().a(mp.i, a($$0, "_side")).a(mp.d, a($$0, "_top"));
   }

   public static mo l(cwj $$0) {
      return new mo().a(mp.i, a($$0, "_side")).a(mp.f, a($$0, "_top"));
   }

   public static mo m(cwj $$0) {
      return new mo().a(mp.q, a($$0, "_plant")).a(mp.i, a($$0, "_side")).a(mp.f, a($$0, "_top"));
   }

   public static mo n(cwj $$0) {
      return new mo().a(mp.i, G($$0)).a(mp.d, a($$0, "_top")).a(mp.c, G($$0));
   }

   public static mo a(ahd $$0, ahd $$1) {
      return new mo().a(mp.i, $$0).a(mp.d, $$1);
   }

   public static mo o(cwj $$0) {
      return new mo().a(mp.b, G($$0)).a(mp.i, a($$0, "_side")).a(mp.f, a($$0, "_top"));
   }

   public static mo p(cwj $$0) {
      return new mo().a(mp.b, G($$0)).a(mp.c, a($$0, "_particle"));
   }

   public static mo q(cwj $$0) {
      return new mo().a(mp.i, a($$0, "_side")).a(mp.f, a($$0, "_top")).a(mp.e, a($$0, "_bottom"));
   }

   public static mo r(cwj $$0) {
      ahd $$1 = G($$0);
      return new mo().a(mp.r, $$1).a(mp.i, $$1).a(mp.f, a($$0, "_top")).a(mp.e, a($$0, "_bottom"));
   }

   public static mo s(cwj $$0) {
      ahd $$1 = G($$0);
      return new mo().a(mp.b, $$1).a(mp.r, $$1).a(mp.i, $$1).a(mp.d, a($$0, "_top"));
   }

   public static mo b(ahd $$0, ahd $$1) {
      return new mo().a(mp.f, $$0).a(mp.e, $$1);
   }

   public static mo t(cwj $$0) {
      return new mo().a(mp.f, a($$0, "_top")).a(mp.e, a($$0, "_bottom"));
   }

   public static mo u(cwj $$0) {
      return new mo().a(mp.c, G($$0));
   }

   public static mo h(ahd $$0) {
      return new mo().a(mp.c, $$0);
   }

   public static mo v(cwj $$0) {
      return new mo().a(mp.C, a($$0, "_0"));
   }

   public static mo w(cwj $$0) {
      return new mo().a(mp.C, a($$0, "_1"));
   }

   public static mo x(cwj $$0) {
      return new mo().a(mp.D, G($$0));
   }

   public static mo y(cwj $$0) {
      return new mo().a(mp.G, G($$0));
   }

   public static mo i(ahd $$0) {
      return new mo().a(mp.G, $$0);
   }

   public static mo a(cwj $$0, String $$1, String $$2) {
      return new mo().a(mp.i, a($$0, $$1)).a(mp.f, a($$0, $$2)).a(mp.e, a($$0, "_bottom"));
   }

   public static mo a(cmm $$0) {
      return new mo().a(mp.c, c($$0));
   }

   public static mo z(cwj $$0) {
      return new mo().a(mp.i, a($$0, "_side")).a(mp.g, a($$0, "_front")).a(mp.h, a($$0, "_back"));
   }

   public static mo A(cwj $$0) {
      return new mo().a(mp.i, a($$0, "_side")).a(mp.g, a($$0, "_front")).a(mp.f, a($$0, "_top")).a(mp.e, a($$0, "_bottom"));
   }

   public static mo B(cwj $$0) {
      return new mo().a(mp.i, a($$0, "_side")).a(mp.g, a($$0, "_front")).a(mp.f, a($$0, "_top"));
   }

   public static mo C(cwj $$0) {
      return new mo().a(mp.i, a($$0, "_side")).a(mp.g, a($$0, "_front")).a(mp.d, a($$0, "_end"));
   }

   public static mo D(cwj $$0) {
      return new mo().a(mp.f, a($$0, "_top"));
   }

   public static mo c(cwj $$0, cwj $$1) {
      return new mo()
         .a(mp.c, a($$0, "_front"))
         .a(mp.o, G($$1))
         .a(mp.n, a($$0, "_top"))
         .a(mp.j, a($$0, "_front"))
         .a(mp.l, a($$0, "_side"))
         .a(mp.k, a($$0, "_side"))
         .a(mp.m, a($$0, "_front"));
   }

   public static mo d(cwj $$0, cwj $$1) {
      return new mo()
         .a(mp.c, a($$0, "_front"))
         .a(mp.o, G($$1))
         .a(mp.n, a($$0, "_top"))
         .a(mp.j, a($$0, "_front"))
         .a(mp.k, a($$0, "_front"))
         .a(mp.l, a($$0, "_side"))
         .a(mp.m, a($$0, "_side"));
   }

   public static mo a(String $$0) {
      return new mo()
         .a(mp.c, a(cwl.mg, $$0 + "_north"))
         .a(mp.e, a(cwl.mg, $$0 + "_bottom"))
         .a(mp.f, a(cwl.mg, $$0 + "_top"))
         .a(mp.j, a(cwl.mg, $$0 + "_north"))
         .a(mp.k, a(cwl.mg, $$0 + "_south"))
         .a(mp.l, a(cwl.mg, $$0 + "_east"))
         .a(mp.m, a(cwl.mg, $$0 + "_west"));
   }

   public static mo E(cwj $$0) {
      return new mo().a(mp.K, a($$0, "_log_lit")).a(mp.C, a($$0, "_fire"));
   }

   public static mo a(cwj $$0, boolean $$1) {
      return new mo()
         .a(mp.c, a(cwl.eg, "_side"))
         .a(mp.e, a(cwl.eg, "_bottom"))
         .a(mp.f, a(cwl.eg, "_top"))
         .a(mp.i, a(cwl.eg, "_side"))
         .a(mp.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static mo j(ahd $$0) {
      return new mo()
         .a(mp.c, a(cwl.ft, "_side"))
         .a(mp.i, a(cwl.ft, "_side"))
         .a(mp.f, a(cwl.ft, "_top"))
         .a(mp.e, a(cwl.ft, "_bottom"))
         .a(mp.M, a(cwl.ft, "_inner"))
         .a(mp.N, $$0);
   }

   public static mo a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new mo()
         .a(mp.c, a(cwl.qV, "_bottom"))
         .a(mp.i, a(cwl.qV, "_side"))
         .a(mp.f, a(cwl.qV, "_top"))
         .a(mp.O, a(cwl.qV, $$1 + "_inner_top"))
         .a(mp.e, a(cwl.qV, "_bottom"));
   }

   public static mo b(cmm $$0) {
      return new mo().a(mp.H, c($$0));
   }

   public static mo F(cwj $$0) {
      return new mo().a(mp.H, G($$0));
   }

   public static mo k(ahd $$0) {
      return new mo().a(mp.H, $$0);
   }

   public static mo c(ahd $$0, ahd $$1) {
      return new mo().a(mp.H, $$0).a(mp.I, $$1);
   }

   public static mo a(ahd $$0, ahd $$1, ahd $$2) {
      return new mo().a(mp.H, $$0).a(mp.I, $$1).a(mp.J, $$2);
   }

   public static ahd G(cwj $$0) {
      ahd $$1 = kd.e.b($$0);
      return $$1.d("block/");
   }

   public static ahd a(cwj $$0, String $$1) {
      ahd $$2 = kd.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ahd c(cmm $$0) {
      ahd $$1 = kd.h.b($$0);
      return $$1.d("item/");
   }

   public static ahd a(cmm $$0, String $$1) {
      ahd $$2 = kd.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
