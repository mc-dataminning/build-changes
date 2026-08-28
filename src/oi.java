import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class oi {
   private final Map<oj, alb> a = Maps.newHashMap();
   private final Set<oj> b = Sets.newHashSet();

   public oi a(oj $$0, alb $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public oi b(oj $$0, alb $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<oj> a() {
      return this.b.stream();
   }

   public oi a(oj $$0, oj $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public oi b(oj $$0, oj $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alb a(oj $$0) {
      for (oj $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alb $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public oi c(oj $$0, alb $$1) {
      oi $$2 = new oi();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static oi a(deu $$0) {
      alb $$1 = G($$0);
      return b($$1);
   }

   public static oi b(deu $$0) {
      alb $$1 = G($$0);
      return a($$1);
   }

   public static oi a(alb $$0) {
      return new oi().a(oj.b, $$0);
   }

   public static oi b(alb $$0) {
      return new oi().a(oj.a, $$0);
   }

   public static oi c(deu $$0) {
      return d(oj.p, G($$0));
   }

   public static oi c(alb $$0) {
      return d(oj.p, $$0);
   }

   public static oi d(deu $$0) {
      return d(oj.q, G($$0));
   }

   public static oi d(alb $$0) {
      return d(oj.q, $$0);
   }

   public static oi e(deu $$0) {
      return d(oj.s, G($$0));
   }

   public static oi e(alb $$0) {
      return d(oj.s, $$0);
   }

   public static oi f(deu $$0) {
      return d(oj.t, G($$0));
   }

   public static oi g(deu $$0) {
      return new oi().a(oj.P, G($$0)).a(oj.y, a($$0, "_stem"));
   }

   public static oi f(alb $$0) {
      return d(oj.t, $$0);
   }

   public static oi h(deu $$0) {
      return d(oj.y, G($$0));
   }

   public static oi a(deu $$0, deu $$1) {
      return new oi().a(oj.y, G($$0)).a(oj.z, G($$1));
   }

   public static oi i(deu $$0) {
      return d(oj.u, G($$0));
   }

   public static oi j(deu $$0) {
      return d(oj.x, G($$0));
   }

   public static oi g(alb $$0) {
      return d(oj.A, $$0);
   }

   public static oi b(deu $$0, deu $$1) {
      return new oi().a(oj.v, G($$0)).a(oj.w, a($$1, "_top"));
   }

   public static oi d(oj $$0, alb $$1) {
      return new oi().a($$0, $$1);
   }

   public static oi k(deu $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.d, a($$0, "_top"));
   }

   public static oi l(deu $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top"));
   }

   public static oi m(deu $$0) {
      return new oi().a(oj.q, a($$0, "_plant")).a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top"));
   }

   public static oi n(deu $$0) {
      return new oi().a(oj.i, G($$0)).a(oj.d, a($$0, "_top")).a(oj.c, G($$0));
   }

   public static oi a(alb $$0, alb $$1) {
      return new oi().a(oj.i, $$0).a(oj.d, $$1);
   }

   public static oi o(deu $$0) {
      return new oi().a(oj.b, G($$0)).a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top"));
   }

   public static oi p(deu $$0) {
      return new oi().a(oj.b, G($$0)).a(oj.c, a($$0, "_particle"));
   }

   public static oi q(deu $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi r(deu $$0) {
      alb $$1 = G($$0);
      return new oi().a(oj.r, $$1).a(oj.i, $$1).a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi s(deu $$0) {
      alb $$1 = G($$0);
      return new oi().a(oj.b, $$1).a(oj.r, $$1).a(oj.i, $$1).a(oj.d, a($$0, "_top"));
   }

   public static oi b(alb $$0, alb $$1) {
      return new oi().a(oj.f, $$0).a(oj.e, $$1);
   }

   public static oi t(deu $$0) {
      return new oi().a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi u(deu $$0) {
      return new oi().a(oj.c, G($$0));
   }

   public static oi h(alb $$0) {
      return new oi().a(oj.c, $$0);
   }

   public static oi v(deu $$0) {
      return new oi().a(oj.C, a($$0, "_0"));
   }

   public static oi w(deu $$0) {
      return new oi().a(oj.C, a($$0, "_1"));
   }

   public static oi x(deu $$0) {
      return new oi().a(oj.D, G($$0));
   }

   public static oi y(deu $$0) {
      return new oi().a(oj.G, G($$0));
   }

   public static oi i(alb $$0) {
      return new oi().a(oj.G, $$0);
   }

   public static oi a(deu $$0, String $$1, String $$2) {
      return new oi().a(oj.i, a($$0, $$1)).a(oj.f, a($$0, $$2)).a(oj.e, a($$0, "_bottom"));
   }

   public static oi a(deu $$0, String $$1, String $$2, String $$3, String $$4) {
      return new oi().a(oj.g, a($$0, $$1)).a(oj.i, a($$0, $$2)).a(oj.f, a($$0, $$3)).a(oj.e, a($$0, $$4));
   }

   public static oi a(cuf $$0) {
      return new oi().a(oj.c, c($$0));
   }

   public static oi z(deu $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.h, a($$0, "_back"));
   }

   public static oi A(deu $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi B(deu $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.f, a($$0, "_top"));
   }

   public static oi C(deu $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.d, a($$0, "_end"));
   }

   public static oi D(deu $$0) {
      return new oi().a(oj.f, a($$0, "_top"));
   }

   public static oi c(deu $$0, deu $$1) {
      return new oi()
         .a(oj.c, a($$0, "_front"))
         .a(oj.o, G($$1))
         .a(oj.n, a($$0, "_top"))
         .a(oj.j, a($$0, "_front"))
         .a(oj.l, a($$0, "_side"))
         .a(oj.k, a($$0, "_side"))
         .a(oj.m, a($$0, "_front"));
   }

   public static oi d(deu $$0, deu $$1) {
      return new oi()
         .a(oj.c, a($$0, "_front"))
         .a(oj.o, G($$1))
         .a(oj.n, a($$0, "_top"))
         .a(oj.j, a($$0, "_front"))
         .a(oj.k, a($$0, "_front"))
         .a(oj.l, a($$0, "_side"))
         .a(oj.m, a($$0, "_side"));
   }

   public static oi a(String $$0) {
      return new oi()
         .a(oj.c, a(dew.mg, $$0 + "_north"))
         .a(oj.e, a(dew.mg, $$0 + "_bottom"))
         .a(oj.f, a(dew.mg, $$0 + "_top"))
         .a(oj.j, a(dew.mg, $$0 + "_north"))
         .a(oj.k, a(dew.mg, $$0 + "_south"))
         .a(oj.l, a(dew.mg, $$0 + "_east"))
         .a(oj.m, a(dew.mg, $$0 + "_west"));
   }

   public static oi E(deu $$0) {
      return new oi().a(oj.K, a($$0, "_log_lit")).a(oj.C, a($$0, "_fire"));
   }

   public static oi a(deu $$0, boolean $$1) {
      return new oi()
         .a(oj.c, a(dew.eg, "_side"))
         .a(oj.e, a(dew.eg, "_bottom"))
         .a(oj.f, a(dew.eg, "_top"))
         .a(oj.i, a(dew.eg, "_side"))
         .a(oj.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static oi j(alb $$0) {
      return new oi()
         .a(oj.c, a(dew.ft, "_side"))
         .a(oj.i, a(dew.ft, "_side"))
         .a(oj.f, a(dew.ft, "_top"))
         .a(oj.e, a(dew.ft, "_bottom"))
         .a(oj.M, a(dew.ft, "_inner"))
         .a(oj.N, $$0);
   }

   public static oi a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new oi()
         .a(oj.c, a(dew.qV, "_bottom"))
         .a(oj.i, a(dew.qV, "_side"))
         .a(oj.f, a(dew.qV, "_top"))
         .a(oj.O, a(dew.qV, $$1 + "_inner_top"))
         .a(oj.e, a(dew.qV, "_bottom"));
   }

   public static oi b(cuf $$0) {
      return new oi().a(oj.H, c($$0));
   }

   public static oi F(deu $$0) {
      return new oi().a(oj.H, G($$0));
   }

   public static oi k(alb $$0) {
      return new oi().a(oj.H, $$0);
   }

   public static oi c(alb $$0, alb $$1) {
      return new oi().a(oj.H, $$0).a(oj.I, $$1);
   }

   public static oi a(alb $$0, alb $$1, alb $$2) {
      return new oi().a(oj.H, $$0).a(oj.I, $$1).a(oj.J, $$2);
   }

   public static alb G(deu $$0) {
      alb $$1 = lp.e.b($$0);
      return $$1.d("block/");
   }

   public static alb a(deu $$0, String $$1) {
      alb $$2 = lp.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alb c(cuf $$0) {
      alb $$1 = lp.h.b($$0);
      return $$1.d("item/");
   }

   public static alb a(cuf $$0, String $$1) {
      alb $$2 = lp.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
