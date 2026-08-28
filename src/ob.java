import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ob {
   private final Map<oc, akk> a = Maps.newHashMap();
   private final Set<oc> b = Sets.newHashSet();

   public ob a(oc $$0, akk $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public ob b(oc $$0, akk $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<oc> a() {
      return this.b.stream();
   }

   public ob a(oc $$0, oc $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public ob b(oc $$0, oc $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public akk a(oc $$0) {
      for (oc $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         akk $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public ob c(oc $$0, akk $$1) {
      ob $$2 = new ob();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static ob a(dfi $$0) {
      akk $$1 = G($$0);
      return b($$1);
   }

   public static ob b(dfi $$0) {
      akk $$1 = G($$0);
      return a($$1);
   }

   public static ob a(akk $$0) {
      return new ob().a(oc.b, $$0);
   }

   public static ob b(akk $$0) {
      return new ob().a(oc.a, $$0);
   }

   public static ob c(dfi $$0) {
      return d(oc.p, G($$0));
   }

   public static ob c(akk $$0) {
      return d(oc.p, $$0);
   }

   public static ob d(dfi $$0) {
      return d(oc.q, G($$0));
   }

   public static ob d(akk $$0) {
      return d(oc.q, $$0);
   }

   public static ob e(dfi $$0) {
      return d(oc.s, G($$0));
   }

   public static ob e(akk $$0) {
      return d(oc.s, $$0);
   }

   public static ob f(dfi $$0) {
      return d(oc.t, G($$0));
   }

   public static ob g(dfi $$0) {
      return new ob().a(oc.P, G($$0)).a(oc.y, a($$0, "_stem"));
   }

   public static ob f(akk $$0) {
      return d(oc.t, $$0);
   }

   public static ob h(dfi $$0) {
      return d(oc.y, G($$0));
   }

   public static ob a(dfi $$0, dfi $$1) {
      return new ob().a(oc.y, G($$0)).a(oc.z, G($$1));
   }

   public static ob i(dfi $$0) {
      return d(oc.u, G($$0));
   }

   public static ob j(dfi $$0) {
      return d(oc.x, G($$0));
   }

   public static ob g(akk $$0) {
      return d(oc.A, $$0);
   }

   public static ob b(dfi $$0, dfi $$1) {
      return new ob().a(oc.v, G($$0)).a(oc.w, a($$1, "_top"));
   }

   public static ob d(oc $$0, akk $$1) {
      return new ob().a($$0, $$1);
   }

   public static ob k(dfi $$0) {
      return new ob().a(oc.i, a($$0, "_side")).a(oc.d, a($$0, "_top"));
   }

   public static ob l(dfi $$0) {
      return new ob().a(oc.i, a($$0, "_side")).a(oc.f, a($$0, "_top"));
   }

   public static ob m(dfi $$0) {
      return new ob().a(oc.q, a($$0, "_plant")).a(oc.i, a($$0, "_side")).a(oc.f, a($$0, "_top"));
   }

   public static ob n(dfi $$0) {
      return new ob().a(oc.i, G($$0)).a(oc.d, a($$0, "_top")).a(oc.c, G($$0));
   }

   public static ob a(akk $$0, akk $$1) {
      return new ob().a(oc.i, $$0).a(oc.d, $$1);
   }

   public static ob o(dfi $$0) {
      return new ob().a(oc.b, G($$0)).a(oc.i, a($$0, "_side")).a(oc.f, a($$0, "_top"));
   }

   public static ob p(dfi $$0) {
      return new ob().a(oc.b, G($$0)).a(oc.c, a($$0, "_particle"));
   }

   public static ob q(dfi $$0) {
      return new ob().a(oc.i, a($$0, "_side")).a(oc.f, a($$0, "_top")).a(oc.e, a($$0, "_bottom"));
   }

   public static ob r(dfi $$0) {
      akk $$1 = G($$0);
      return new ob().a(oc.r, $$1).a(oc.i, $$1).a(oc.f, a($$0, "_top")).a(oc.e, a($$0, "_bottom"));
   }

   public static ob s(dfi $$0) {
      akk $$1 = G($$0);
      return new ob().a(oc.b, $$1).a(oc.r, $$1).a(oc.i, $$1).a(oc.d, a($$0, "_top"));
   }

   public static ob b(akk $$0, akk $$1) {
      return new ob().a(oc.f, $$0).a(oc.e, $$1);
   }

   public static ob t(dfi $$0) {
      return new ob().a(oc.f, a($$0, "_top")).a(oc.e, a($$0, "_bottom"));
   }

   public static ob u(dfi $$0) {
      return new ob().a(oc.c, G($$0));
   }

   public static ob h(akk $$0) {
      return new ob().a(oc.c, $$0);
   }

   public static ob v(dfi $$0) {
      return new ob().a(oc.C, a($$0, "_0"));
   }

   public static ob w(dfi $$0) {
      return new ob().a(oc.C, a($$0, "_1"));
   }

   public static ob x(dfi $$0) {
      return new ob().a(oc.D, G($$0));
   }

   public static ob y(dfi $$0) {
      return new ob().a(oc.G, G($$0));
   }

   public static ob i(akk $$0) {
      return new ob().a(oc.G, $$0);
   }

   public static ob a(dfi $$0, String $$1, String $$2) {
      return new ob().a(oc.i, a($$0, $$1)).a(oc.f, a($$0, $$2)).a(oc.e, a($$0, "_bottom"));
   }

   public static ob a(dfi $$0, String $$1, String $$2, String $$3, String $$4) {
      return new ob().a(oc.g, a($$0, $$1)).a(oc.i, a($$0, $$2)).a(oc.f, a($$0, $$3)).a(oc.e, a($$0, $$4));
   }

   public static ob a(cty $$0) {
      return new ob().a(oc.c, c($$0));
   }

   public static ob z(dfi $$0) {
      return new ob().a(oc.i, a($$0, "_side")).a(oc.g, a($$0, "_front")).a(oc.h, a($$0, "_back"));
   }

   public static ob A(dfi $$0) {
      return new ob().a(oc.i, a($$0, "_side")).a(oc.g, a($$0, "_front")).a(oc.f, a($$0, "_top")).a(oc.e, a($$0, "_bottom"));
   }

   public static ob B(dfi $$0) {
      return new ob().a(oc.i, a($$0, "_side")).a(oc.g, a($$0, "_front")).a(oc.f, a($$0, "_top"));
   }

   public static ob C(dfi $$0) {
      return new ob().a(oc.i, a($$0, "_side")).a(oc.g, a($$0, "_front")).a(oc.d, a($$0, "_end"));
   }

   public static ob D(dfi $$0) {
      return new ob().a(oc.f, a($$0, "_top"));
   }

   public static ob c(dfi $$0, dfi $$1) {
      return new ob()
         .a(oc.c, a($$0, "_front"))
         .a(oc.o, G($$1))
         .a(oc.n, a($$0, "_top"))
         .a(oc.j, a($$0, "_front"))
         .a(oc.l, a($$0, "_side"))
         .a(oc.k, a($$0, "_side"))
         .a(oc.m, a($$0, "_front"));
   }

   public static ob d(dfi $$0, dfi $$1) {
      return new ob()
         .a(oc.c, a($$0, "_front"))
         .a(oc.o, G($$1))
         .a(oc.n, a($$0, "_top"))
         .a(oc.j, a($$0, "_front"))
         .a(oc.k, a($$0, "_front"))
         .a(oc.l, a($$0, "_side"))
         .a(oc.m, a($$0, "_side"));
   }

   public static ob a(String $$0) {
      return new ob()
         .a(oc.c, a(dfk.mg, $$0 + "_north"))
         .a(oc.e, a(dfk.mg, $$0 + "_bottom"))
         .a(oc.f, a(dfk.mg, $$0 + "_top"))
         .a(oc.j, a(dfk.mg, $$0 + "_north"))
         .a(oc.k, a(dfk.mg, $$0 + "_south"))
         .a(oc.l, a(dfk.mg, $$0 + "_east"))
         .a(oc.m, a(dfk.mg, $$0 + "_west"));
   }

   public static ob E(dfi $$0) {
      return new ob().a(oc.K, a($$0, "_log_lit")).a(oc.C, a($$0, "_fire"));
   }

   public static ob a(dfi $$0, boolean $$1) {
      return new ob()
         .a(oc.c, a(dfk.eg, "_side"))
         .a(oc.e, a(dfk.eg, "_bottom"))
         .a(oc.f, a(dfk.eg, "_top"))
         .a(oc.i, a(dfk.eg, "_side"))
         .a(oc.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static ob j(akk $$0) {
      return new ob()
         .a(oc.c, a(dfk.ft, "_side"))
         .a(oc.i, a(dfk.ft, "_side"))
         .a(oc.f, a(dfk.ft, "_top"))
         .a(oc.e, a(dfk.ft, "_bottom"))
         .a(oc.M, a(dfk.ft, "_inner"))
         .a(oc.N, $$0);
   }

   public static ob a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new ob()
         .a(oc.c, a(dfk.qV, "_bottom"))
         .a(oc.i, a(dfk.qV, "_side"))
         .a(oc.f, a(dfk.qV, "_top"))
         .a(oc.O, a(dfk.qV, $$1 + "_inner_top"))
         .a(oc.e, a(dfk.qV, "_bottom"));
   }

   public static ob b(cty $$0) {
      return new ob().a(oc.H, c($$0));
   }

   public static ob F(dfi $$0) {
      return new ob().a(oc.H, G($$0));
   }

   public static ob k(akk $$0) {
      return new ob().a(oc.H, $$0);
   }

   public static ob c(akk $$0, akk $$1) {
      return new ob().a(oc.H, $$0).a(oc.I, $$1);
   }

   public static ob a(akk $$0, akk $$1, akk $$2) {
      return new ob().a(oc.H, $$0).a(oc.I, $$1).a(oc.J, $$2);
   }

   public static akk G(dfi $$0) {
      akk $$1 = lq.e.b($$0);
      return $$1.d("block/");
   }

   public static akk a(dfi $$0, String $$1) {
      akk $$2 = lq.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akk c(cty $$0) {
      akk $$1 = lq.g.b($$0);
      return $$1.d("item/");
   }

   public static akk a(cty $$0, String $$1) {
      akk $$2 = lq.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
