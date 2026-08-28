import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class oi {
   private final Map<oj, ale> a = Maps.newHashMap();
   private final Set<oj> b = Sets.newHashSet();

   public oi a(oj $$0, ale $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public oi b(oj $$0, ale $$1) {
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

   public ale a(oj $$0) {
      for (oj $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ale $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public oi c(oj $$0, ale $$1) {
      oi $$2 = new oi();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static oi a(dey $$0) {
      ale $$1 = G($$0);
      return b($$1);
   }

   public static oi b(dey $$0) {
      ale $$1 = G($$0);
      return a($$1);
   }

   public static oi a(ale $$0) {
      return new oi().a(oj.b, $$0);
   }

   public static oi b(ale $$0) {
      return new oi().a(oj.a, $$0);
   }

   public static oi c(dey $$0) {
      return d(oj.p, G($$0));
   }

   public static oi c(ale $$0) {
      return d(oj.p, $$0);
   }

   public static oi d(dey $$0) {
      return d(oj.q, G($$0));
   }

   public static oi d(ale $$0) {
      return d(oj.q, $$0);
   }

   public static oi e(dey $$0) {
      return d(oj.s, G($$0));
   }

   public static oi e(ale $$0) {
      return d(oj.s, $$0);
   }

   public static oi f(dey $$0) {
      return d(oj.t, G($$0));
   }

   public static oi g(dey $$0) {
      return new oi().a(oj.P, G($$0)).a(oj.y, a($$0, "_stem"));
   }

   public static oi f(ale $$0) {
      return d(oj.t, $$0);
   }

   public static oi h(dey $$0) {
      return d(oj.y, G($$0));
   }

   public static oi a(dey $$0, dey $$1) {
      return new oi().a(oj.y, G($$0)).a(oj.z, G($$1));
   }

   public static oi i(dey $$0) {
      return d(oj.u, G($$0));
   }

   public static oi j(dey $$0) {
      return d(oj.x, G($$0));
   }

   public static oi g(ale $$0) {
      return d(oj.A, $$0);
   }

   public static oi b(dey $$0, dey $$1) {
      return new oi().a(oj.v, G($$0)).a(oj.w, a($$1, "_top"));
   }

   public static oi d(oj $$0, ale $$1) {
      return new oi().a($$0, $$1);
   }

   public static oi k(dey $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.d, a($$0, "_top"));
   }

   public static oi l(dey $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top"));
   }

   public static oi m(dey $$0) {
      return new oi().a(oj.q, a($$0, "_plant")).a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top"));
   }

   public static oi n(dey $$0) {
      return new oi().a(oj.i, G($$0)).a(oj.d, a($$0, "_top")).a(oj.c, G($$0));
   }

   public static oi a(ale $$0, ale $$1) {
      return new oi().a(oj.i, $$0).a(oj.d, $$1);
   }

   public static oi o(dey $$0) {
      return new oi().a(oj.b, G($$0)).a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top"));
   }

   public static oi p(dey $$0) {
      return new oi().a(oj.b, G($$0)).a(oj.c, a($$0, "_particle"));
   }

   public static oi q(dey $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi r(dey $$0) {
      ale $$1 = G($$0);
      return new oi().a(oj.r, $$1).a(oj.i, $$1).a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi s(dey $$0) {
      ale $$1 = G($$0);
      return new oi().a(oj.b, $$1).a(oj.r, $$1).a(oj.i, $$1).a(oj.d, a($$0, "_top"));
   }

   public static oi b(ale $$0, ale $$1) {
      return new oi().a(oj.f, $$0).a(oj.e, $$1);
   }

   public static oi t(dey $$0) {
      return new oi().a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi u(dey $$0) {
      return new oi().a(oj.c, G($$0));
   }

   public static oi h(ale $$0) {
      return new oi().a(oj.c, $$0);
   }

   public static oi v(dey $$0) {
      return new oi().a(oj.C, a($$0, "_0"));
   }

   public static oi w(dey $$0) {
      return new oi().a(oj.C, a($$0, "_1"));
   }

   public static oi x(dey $$0) {
      return new oi().a(oj.D, G($$0));
   }

   public static oi y(dey $$0) {
      return new oi().a(oj.G, G($$0));
   }

   public static oi i(ale $$0) {
      return new oi().a(oj.G, $$0);
   }

   public static oi a(dey $$0, String $$1, String $$2) {
      return new oi().a(oj.i, a($$0, $$1)).a(oj.f, a($$0, $$2)).a(oj.e, a($$0, "_bottom"));
   }

   public static oi a(dey $$0, String $$1, String $$2, String $$3, String $$4) {
      return new oi().a(oj.g, a($$0, $$1)).a(oj.i, a($$0, $$2)).a(oj.f, a($$0, $$3)).a(oj.e, a($$0, $$4));
   }

   public static oi a(cuj $$0) {
      return new oi().a(oj.c, c($$0));
   }

   public static oi z(dey $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.h, a($$0, "_back"));
   }

   public static oi A(dey $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.f, a($$0, "_top")).a(oj.e, a($$0, "_bottom"));
   }

   public static oi B(dey $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.f, a($$0, "_top"));
   }

   public static oi C(dey $$0) {
      return new oi().a(oj.i, a($$0, "_side")).a(oj.g, a($$0, "_front")).a(oj.d, a($$0, "_end"));
   }

   public static oi D(dey $$0) {
      return new oi().a(oj.f, a($$0, "_top"));
   }

   public static oi c(dey $$0, dey $$1) {
      return new oi()
         .a(oj.c, a($$0, "_front"))
         .a(oj.o, G($$1))
         .a(oj.n, a($$0, "_top"))
         .a(oj.j, a($$0, "_front"))
         .a(oj.l, a($$0, "_side"))
         .a(oj.k, a($$0, "_side"))
         .a(oj.m, a($$0, "_front"));
   }

   public static oi d(dey $$0, dey $$1) {
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
         .a(oj.c, a(dfa.mg, $$0 + "_north"))
         .a(oj.e, a(dfa.mg, $$0 + "_bottom"))
         .a(oj.f, a(dfa.mg, $$0 + "_top"))
         .a(oj.j, a(dfa.mg, $$0 + "_north"))
         .a(oj.k, a(dfa.mg, $$0 + "_south"))
         .a(oj.l, a(dfa.mg, $$0 + "_east"))
         .a(oj.m, a(dfa.mg, $$0 + "_west"));
   }

   public static oi E(dey $$0) {
      return new oi().a(oj.K, a($$0, "_log_lit")).a(oj.C, a($$0, "_fire"));
   }

   public static oi a(dey $$0, boolean $$1) {
      return new oi()
         .a(oj.c, a(dfa.eg, "_side"))
         .a(oj.e, a(dfa.eg, "_bottom"))
         .a(oj.f, a(dfa.eg, "_top"))
         .a(oj.i, a(dfa.eg, "_side"))
         .a(oj.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static oi j(ale $$0) {
      return new oi()
         .a(oj.c, a(dfa.ft, "_side"))
         .a(oj.i, a(dfa.ft, "_side"))
         .a(oj.f, a(dfa.ft, "_top"))
         .a(oj.e, a(dfa.ft, "_bottom"))
         .a(oj.M, a(dfa.ft, "_inner"))
         .a(oj.N, $$0);
   }

   public static oi a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new oi()
         .a(oj.c, a(dfa.qV, "_bottom"))
         .a(oj.i, a(dfa.qV, "_side"))
         .a(oj.f, a(dfa.qV, "_top"))
         .a(oj.O, a(dfa.qV, $$1 + "_inner_top"))
         .a(oj.e, a(dfa.qV, "_bottom"));
   }

   public static oi b(cuj $$0) {
      return new oi().a(oj.H, c($$0));
   }

   public static oi F(dey $$0) {
      return new oi().a(oj.H, G($$0));
   }

   public static oi k(ale $$0) {
      return new oi().a(oj.H, $$0);
   }

   public static oi c(ale $$0, ale $$1) {
      return new oi().a(oj.H, $$0).a(oj.I, $$1);
   }

   public static oi a(ale $$0, ale $$1, ale $$2) {
      return new oi().a(oj.H, $$0).a(oj.I, $$1).a(oj.J, $$2);
   }

   public static ale G(dey $$0) {
      ale $$1 = lp.e.b($$0);
      return $$1.d("block/");
   }

   public static ale a(dey $$0, String $$1) {
      ale $$2 = lp.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ale c(cuj $$0) {
      ale $$1 = lp.h.b($$0);
      return $$1.d("item/");
   }

   public static ale a(cuj $$0, String $$1) {
      ale $$2 = lp.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
