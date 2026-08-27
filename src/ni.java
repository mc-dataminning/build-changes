import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ni {
   private final Map<nj, ajt> a = Maps.newHashMap();
   private final Set<nj> b = Sets.newHashSet();

   public ni a(nj $$0, ajt $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public ni b(nj $$0, ajt $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<nj> a() {
      return this.b.stream();
   }

   public ni a(nj $$0, nj $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public ni b(nj $$0, nj $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ajt a(nj $$0) {
      for (nj $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ajt $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public ni c(nj $$0, ajt $$1) {
      ni $$2 = new ni();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static ni a(dby $$0) {
      ajt $$1 = G($$0);
      return b($$1);
   }

   public static ni b(dby $$0) {
      ajt $$1 = G($$0);
      return a($$1);
   }

   public static ni a(ajt $$0) {
      return new ni().a(nj.b, $$0);
   }

   public static ni b(ajt $$0) {
      return new ni().a(nj.a, $$0);
   }

   public static ni c(dby $$0) {
      return d(nj.p, G($$0));
   }

   public static ni c(ajt $$0) {
      return d(nj.p, $$0);
   }

   public static ni d(dby $$0) {
      return d(nj.q, G($$0));
   }

   public static ni d(ajt $$0) {
      return d(nj.q, $$0);
   }

   public static ni e(dby $$0) {
      return d(nj.s, G($$0));
   }

   public static ni e(ajt $$0) {
      return d(nj.s, $$0);
   }

   public static ni f(dby $$0) {
      return d(nj.t, G($$0));
   }

   public static ni g(dby $$0) {
      return new ni().a(nj.P, G($$0)).a(nj.y, a($$0, "_stem"));
   }

   public static ni f(ajt $$0) {
      return d(nj.t, $$0);
   }

   public static ni h(dby $$0) {
      return d(nj.y, G($$0));
   }

   public static ni a(dby $$0, dby $$1) {
      return new ni().a(nj.y, G($$0)).a(nj.z, G($$1));
   }

   public static ni i(dby $$0) {
      return d(nj.u, G($$0));
   }

   public static ni j(dby $$0) {
      return d(nj.x, G($$0));
   }

   public static ni g(ajt $$0) {
      return d(nj.A, $$0);
   }

   public static ni b(dby $$0, dby $$1) {
      return new ni().a(nj.v, G($$0)).a(nj.w, a($$1, "_top"));
   }

   public static ni d(nj $$0, ajt $$1) {
      return new ni().a($$0, $$1);
   }

   public static ni k(dby $$0) {
      return new ni().a(nj.i, a($$0, "_side")).a(nj.d, a($$0, "_top"));
   }

   public static ni l(dby $$0) {
      return new ni().a(nj.i, a($$0, "_side")).a(nj.f, a($$0, "_top"));
   }

   public static ni m(dby $$0) {
      return new ni().a(nj.q, a($$0, "_plant")).a(nj.i, a($$0, "_side")).a(nj.f, a($$0, "_top"));
   }

   public static ni n(dby $$0) {
      return new ni().a(nj.i, G($$0)).a(nj.d, a($$0, "_top")).a(nj.c, G($$0));
   }

   public static ni a(ajt $$0, ajt $$1) {
      return new ni().a(nj.i, $$0).a(nj.d, $$1);
   }

   public static ni o(dby $$0) {
      return new ni().a(nj.b, G($$0)).a(nj.i, a($$0, "_side")).a(nj.f, a($$0, "_top"));
   }

   public static ni p(dby $$0) {
      return new ni().a(nj.b, G($$0)).a(nj.c, a($$0, "_particle"));
   }

   public static ni q(dby $$0) {
      return new ni().a(nj.i, a($$0, "_side")).a(nj.f, a($$0, "_top")).a(nj.e, a($$0, "_bottom"));
   }

   public static ni r(dby $$0) {
      ajt $$1 = G($$0);
      return new ni().a(nj.r, $$1).a(nj.i, $$1).a(nj.f, a($$0, "_top")).a(nj.e, a($$0, "_bottom"));
   }

   public static ni s(dby $$0) {
      ajt $$1 = G($$0);
      return new ni().a(nj.b, $$1).a(nj.r, $$1).a(nj.i, $$1).a(nj.d, a($$0, "_top"));
   }

   public static ni b(ajt $$0, ajt $$1) {
      return new ni().a(nj.f, $$0).a(nj.e, $$1);
   }

   public static ni t(dby $$0) {
      return new ni().a(nj.f, a($$0, "_top")).a(nj.e, a($$0, "_bottom"));
   }

   public static ni u(dby $$0) {
      return new ni().a(nj.c, G($$0));
   }

   public static ni h(ajt $$0) {
      return new ni().a(nj.c, $$0);
   }

   public static ni v(dby $$0) {
      return new ni().a(nj.C, a($$0, "_0"));
   }

   public static ni w(dby $$0) {
      return new ni().a(nj.C, a($$0, "_1"));
   }

   public static ni x(dby $$0) {
      return new ni().a(nj.D, G($$0));
   }

   public static ni y(dby $$0) {
      return new ni().a(nj.G, G($$0));
   }

   public static ni i(ajt $$0) {
      return new ni().a(nj.G, $$0);
   }

   public static ni a(dby $$0, String $$1, String $$2) {
      return new ni().a(nj.i, a($$0, $$1)).a(nj.f, a($$0, $$2)).a(nj.e, a($$0, "_bottom"));
   }

   public static ni a(dby $$0, String $$1, String $$2, String $$3, String $$4) {
      return new ni().a(nj.g, a($$0, $$1)).a(nj.i, a($$0, $$2)).a(nj.f, a($$0, $$3)).a(nj.e, a($$0, $$4));
   }

   public static ni a(cre $$0) {
      return new ni().a(nj.c, c($$0));
   }

   public static ni z(dby $$0) {
      return new ni().a(nj.i, a($$0, "_side")).a(nj.g, a($$0, "_front")).a(nj.h, a($$0, "_back"));
   }

   public static ni A(dby $$0) {
      return new ni().a(nj.i, a($$0, "_side")).a(nj.g, a($$0, "_front")).a(nj.f, a($$0, "_top")).a(nj.e, a($$0, "_bottom"));
   }

   public static ni B(dby $$0) {
      return new ni().a(nj.i, a($$0, "_side")).a(nj.g, a($$0, "_front")).a(nj.f, a($$0, "_top"));
   }

   public static ni C(dby $$0) {
      return new ni().a(nj.i, a($$0, "_side")).a(nj.g, a($$0, "_front")).a(nj.d, a($$0, "_end"));
   }

   public static ni D(dby $$0) {
      return new ni().a(nj.f, a($$0, "_top"));
   }

   public static ni c(dby $$0, dby $$1) {
      return new ni()
         .a(nj.c, a($$0, "_front"))
         .a(nj.o, G($$1))
         .a(nj.n, a($$0, "_top"))
         .a(nj.j, a($$0, "_front"))
         .a(nj.l, a($$0, "_side"))
         .a(nj.k, a($$0, "_side"))
         .a(nj.m, a($$0, "_front"));
   }

   public static ni d(dby $$0, dby $$1) {
      return new ni()
         .a(nj.c, a($$0, "_front"))
         .a(nj.o, G($$1))
         .a(nj.n, a($$0, "_top"))
         .a(nj.j, a($$0, "_front"))
         .a(nj.k, a($$0, "_front"))
         .a(nj.l, a($$0, "_side"))
         .a(nj.m, a($$0, "_side"));
   }

   public static ni a(String $$0) {
      return new ni()
         .a(nj.c, a(dca.mg, $$0 + "_north"))
         .a(nj.e, a(dca.mg, $$0 + "_bottom"))
         .a(nj.f, a(dca.mg, $$0 + "_top"))
         .a(nj.j, a(dca.mg, $$0 + "_north"))
         .a(nj.k, a(dca.mg, $$0 + "_south"))
         .a(nj.l, a(dca.mg, $$0 + "_east"))
         .a(nj.m, a(dca.mg, $$0 + "_west"));
   }

   public static ni E(dby $$0) {
      return new ni().a(nj.K, a($$0, "_log_lit")).a(nj.C, a($$0, "_fire"));
   }

   public static ni a(dby $$0, boolean $$1) {
      return new ni()
         .a(nj.c, a(dca.eg, "_side"))
         .a(nj.e, a(dca.eg, "_bottom"))
         .a(nj.f, a(dca.eg, "_top"))
         .a(nj.i, a(dca.eg, "_side"))
         .a(nj.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static ni j(ajt $$0) {
      return new ni()
         .a(nj.c, a(dca.ft, "_side"))
         .a(nj.i, a(dca.ft, "_side"))
         .a(nj.f, a(dca.ft, "_top"))
         .a(nj.e, a(dca.ft, "_bottom"))
         .a(nj.M, a(dca.ft, "_inner"))
         .a(nj.N, $$0);
   }

   public static ni a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new ni()
         .a(nj.c, a(dca.qV, "_bottom"))
         .a(nj.i, a(dca.qV, "_side"))
         .a(nj.f, a(dca.qV, "_top"))
         .a(nj.O, a(dca.qV, $$1 + "_inner_top"))
         .a(nj.e, a(dca.qV, "_bottom"));
   }

   public static ni b(cre $$0) {
      return new ni().a(nj.H, c($$0));
   }

   public static ni F(dby $$0) {
      return new ni().a(nj.H, G($$0));
   }

   public static ni k(ajt $$0) {
      return new ni().a(nj.H, $$0);
   }

   public static ni c(ajt $$0, ajt $$1) {
      return new ni().a(nj.H, $$0).a(nj.I, $$1);
   }

   public static ni a(ajt $$0, ajt $$1, ajt $$2) {
      return new ni().a(nj.H, $$0).a(nj.I, $$1).a(nj.J, $$2);
   }

   public static ajt G(dby $$0) {
      ajt $$1 = kr.e.b($$0);
      return $$1.d("block/");
   }

   public static ajt a(dby $$0, String $$1) {
      ajt $$2 = kr.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ajt c(cre $$0) {
      ajt $$1 = kr.h.b($$0);
      return $$1.d("item/");
   }

   public static ajt a(cre $$0, String $$1) {
      ajt $$2 = kr.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
