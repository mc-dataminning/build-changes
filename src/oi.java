import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class oi {
   private final Map<oj, alc> a = Maps.newHashMap();
   private final Set<oj> b = Sets.newHashSet();

   public oi a(oj $$0, alc $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public oi b(oj $$0, alc $$1) {
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

   public alc a(oj $$0) {
      for (oj $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alc $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public oi c(oj $$0, alc $$1) {
      oi $$2 = new oi();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static oi a(dhj $$0) {
      alc $$1 = G($$0);
      return b($$1);
   }

   public static oi b(dhj $$0) {
      alc $$1 = G($$0);
      return a($$1);
   }

   public static oi a(alc $$0) {
      return new oi().a(oj.b, $$0);
   }

   public static oi b(alc $$0) {
      return new oi().a(oj.a, $$0);
   }

   public static oi c(dhj $$0) {
      return d(oj.p, G($$0));
   }

   public static oi c(alc $$0) {
      return d(oj.p, $$0);
   }

   public static oi d(dhj $$0) {
      return d(oj.q, G($$0));
   }

   public static oi d(alc $$0) {
      return d(oj.q, $$0);
   }

   public static oi e(dhj $$0) {
      return d(oj.s, G($$0));
   }

   public static oi e(alc $$0) {
      return d(oj.s, $$0);
   }

   public static oi f(dhj $$0) {
      return d(oj.t, G($$0));
   }

   public static oi g(dhj $$0) {
      return new oi().a(oj.P, G($$0)).a(oj.y, a($$0, "_stem"));
   }

   public static oi f(alc $$0) {
      return d(oj.t, $$0);
   }

   public static oi h(dhj $$0) {
      return d(oj.y, G($$0));
   }

   public static oi a(dhj $$0, dhj $$1) {
      return new oi().a(oj.y, G($$0)).a(oj.z, G($$1));
   }

   public static oi i(dhj $$0) {
      return d(oj.u, G($$0));
   }

   public static oi j(dhj $$0) {
      return d(oj.x, G($$0));
   }

   public static oi g(alc $$0) {
      return d(oj.A, $$0);
   }

   public static oi b(dhj $$0, dhj $$1) {
      return new oi().a(oj.v, G($$0)).a(oj.w, a($$1, "_top"));
   }

   public static oi d(oj $$0, alc $$1) {
      return new oi().a($$0, $$1);
   }

   public static oi k(dhj $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.d, a($$0, "_top"));
   }

   public static oi l(dhj $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top"));
   }

   public static oi m(dhj $$0) {
      return new oi().a(oj.q, a($$0, "_plant")).a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top"));
   }

   public static oi n(dhj $$0) {
      return new oi().a(oj.i, G($$0)).a(oj.d, a($$0, "_top")).a(oj.c, G($$0));
   }

   public static oi a(alc $$0, alc $$1) {
      return new oi().a(oj.i, $$0).a(oj.d, $$1);
   }

   public static oi o(dhj $$0) {
      return new oi().a(oj.b, G($$0)).a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top"));
   }

   public static oi p(dhj $$0) {
      return new oi().a(oj.b, G($$0)).a(oj.c, a($$0, "_particle"));
   }

   public static oi q(dhj $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi r(dhj $$0) {
      alc $$1 = G($$0);
      return new oi().a(oj.r, $$1).a(oj.i, $$1).a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi s(dhj $$0) {
      alc $$1 = G($$0);
      return new oi().a(oj.b, $$1).a(oj.r, $$1).a(oj.i, $$1).a(oj.d, a($$0, "_top"));
   }

   public static oi b(alc $$0, alc $$1) {
      return new oi().a(oj.f, $$0).a(oj.e, $$1);
   }

   public static oi t(dhj $$0) {
      return new oi().a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi u(dhj $$0) {
      return new oi().a(oj.c, G($$0));
   }

   public static oi h(alc $$0) {
      return new oi().a(oj.c, $$0);
   }

   public static oi v(dhj $$0) {
      return new oi().a(oj.C, a($$0, "_0"));
   }

   public static oi w(dhj $$0) {
      return new oi().a(oj.C, a($$0, "_1"));
   }

   public static oi x(dhj $$0) {
      return new oi().a(oj.D, G($$0));
   }

   public static oi y(dhj $$0) {
      return new oi().a(oj.G, G($$0));
   }

   public static oi i(alc $$0) {
      return new oi().a(oj.G, $$0);
   }

   public static oi a(dhj $$0, String $$1, String $$2) {
      return new oi().a(oj.i, a($$0, $$1)).a(oj.f, a($$0, $$2)).a(oj.e, a($$0, "_bottom"));
   }

   public static oi a(dhj $$0, String $$1, String $$2, String $$3, String $$4) {
      return new oi().a(oj.g, a($$0, $$1)).a(oj.i, a($$0, $$2)).a(oj.f, a($$0, $$3)).a(oj.e, a($$0, $$4));
   }

   public static oi a(cvk $$0) {
      return new oi().a(oj.c, c($$0));
   }

   public static oi z(dhj $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.h, a($$0, "_back"));
   }

   public static oi A(dhj $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi B(dhj $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.f, a($$0, "_top"));
   }

   public static oi C(dhj $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.d, a($$0, "_end"));
   }

   public static oi D(dhj $$0) {
      return new oi().a(oj.f, a($$0, "_top"));
   }

   public static oi c(dhj $$0, dhj $$1) {
      return new oi()
         .a(oj.c, a($$0, "_front"))
         .a(oj.o, G($$1))
         .a(oj.n, a($$0, "_top"))
         .a(oj.j, a($$0, "_front"))
         .a(oj.l, a($$0, "_side"))
         .a(oj.k, a($$0, "_side"))
         .a(oj.m, a($$0, "_front"));
   }

   public static oi d(dhj $$0, dhj $$1) {
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
         .a(oj.c, a(dhl.mg, $$0 + "_north"))
         .a(oj.e, a(dhl.mg, $$0 + "_bottom"))
         .a(oj.f, a(dhl.mg, $$0 + "_top"))
         .a(oj.j, a(dhl.mg, $$0 + "_north"))
         .a(oj.k, a(dhl.mg, $$0 + "_south"))
         .a(oj.l, a(dhl.mg, $$0 + "_east"))
         .a(oj.m, a(dhl.mg, $$0 + "_west"));
   }

   public static oi E(dhj $$0) {
      return new oi().a(oj.K, a($$0, "_log_lit")).a(oj.C, a($$0, "_fire"));
   }

   public static oi a(dhj $$0, boolean $$1) {
      return new oi()
         .a(oj.c, a(dhl.eg, "_side"))
         .a(oj.e, a(dhl.eg, "_bottom"))
         .a(oj.f, a(dhl.eg, "_top"))
         .a(oj.i, a(dhl.eg, "_side"))
         .a(oj.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static oi j(alc $$0) {
      return new oi()
         .a(oj.c, a(dhl.ft, "_side"))
         .a(oj.i, a(dhl.ft, "_side"))
         .a(oj.f, a(dhl.ft, "_top"))
         .a(oj.e, a(dhl.ft, "_bottom"))
         .a(oj.M, a(dhl.ft, "_inner"))
         .a(oj.N, $$0);
   }

   public static oi a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new oi()
         .a(oj.c, a(dhl.qV, "_bottom"))
         .a(oj.i, a(dhl.qV, "_side"))
         .a(oj.f, a(dhl.qV, "_top"))
         .a(oj.O, a(dhl.qV, $$1 + "_inner_top"))
         .a(oj.e, a(dhl.qV, "_bottom"));
   }

   public static oi b(cvk $$0) {
      return new oi().a(oj.H, c($$0));
   }

   public static oi F(dhj $$0) {
      return new oi().a(oj.H, G($$0));
   }

   public static oi k(alc $$0) {
      return new oi().a(oj.H, $$0);
   }

   public static oi c(alc $$0, alc $$1) {
      return new oi().a(oj.H, $$0).a(oj.I, $$1);
   }

   public static oi a(alc $$0, alc $$1, alc $$2) {
      return new oi().a(oj.H, $$0).a(oj.I, $$1).a(oj.J, $$2);
   }

   public static alc G(dhj $$0) {
      alc $$1 = lu.e.b($$0);
      return $$1.f("block/");
   }

   public static alc a(dhj $$0, String $$1) {
      alc $$2 = lu.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alc c(cvk $$0) {
      alc $$1 = lu.g.b($$0);
      return $$1.f("item/");
   }

   public static alc a(cvk $$0, String $$1) {
      alc $$2 = lu.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
