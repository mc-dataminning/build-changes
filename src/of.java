import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class of {
   private final Map<og, akr> a = Maps.newHashMap();
   private final Set<og> b = Sets.newHashSet();

   public of a(og $$0, akr $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public of b(og $$0, akr $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<og> a() {
      return this.b.stream();
   }

   public of a(og $$0, og $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public of b(og $$0, og $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public akr a(og $$0) {
      for (og $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         akr $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public of c(og $$0, akr $$1) {
      of $$2 = new of();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static of a(dfy $$0) {
      akr $$1 = G($$0);
      return b($$1);
   }

   public static of b(dfy $$0) {
      akr $$1 = G($$0);
      return a($$1);
   }

   public static of a(akr $$0) {
      return new of().a(og.b, $$0);
   }

   public static of b(akr $$0) {
      return new of().a(og.a, $$0);
   }

   public static of c(dfy $$0) {
      return d(og.p, G($$0));
   }

   public static of c(akr $$0) {
      return d(og.p, $$0);
   }

   public static of d(dfy $$0) {
      return d(og.q, G($$0));
   }

   public static of d(akr $$0) {
      return d(og.q, $$0);
   }

   public static of e(dfy $$0) {
      return d(og.s, G($$0));
   }

   public static of e(akr $$0) {
      return d(og.s, $$0);
   }

   public static of f(dfy $$0) {
      return d(og.t, G($$0));
   }

   public static of g(dfy $$0) {
      return new of().a(og.P, G($$0)).a(og.y, a($$0, "_stem"));
   }

   public static of f(akr $$0) {
      return d(og.t, $$0);
   }

   public static of h(dfy $$0) {
      return d(og.y, G($$0));
   }

   public static of a(dfy $$0, dfy $$1) {
      return new of().a(og.y, G($$0)).a(og.z, G($$1));
   }

   public static of i(dfy $$0) {
      return d(og.u, G($$0));
   }

   public static of j(dfy $$0) {
      return d(og.x, G($$0));
   }

   public static of g(akr $$0) {
      return d(og.A, $$0);
   }

   public static of b(dfy $$0, dfy $$1) {
      return new of().a(og.v, G($$0)).a(og.w, a($$1, "_top"));
   }

   public static of d(og $$0, akr $$1) {
      return new of().a($$0, $$1);
   }

   public static of k(dfy $$0) {
      return new of().a(og.i, a($$0, "_side")).a(og.d, a($$0, "_top"));
   }

   public static of l(dfy $$0) {
      return new of().a(og.i, a($$0, "_side")).a(og.f, a($$0, "_top"));
   }

   public static of m(dfy $$0) {
      return new of().a(og.q, a($$0, "_plant")).a(og.i, a($$0, "_side")).a(og.f, a($$0, "_top"));
   }

   public static of n(dfy $$0) {
      return new of().a(og.i, G($$0)).a(og.d, a($$0, "_top")).a(og.c, G($$0));
   }

   public static of a(akr $$0, akr $$1) {
      return new of().a(og.i, $$0).a(og.d, $$1);
   }

   public static of o(dfy $$0) {
      return new of().a(og.b, G($$0)).a(og.i, a($$0, "_side")).a(og.f, a($$0, "_top"));
   }

   public static of p(dfy $$0) {
      return new of().a(og.b, G($$0)).a(og.c, a($$0, "_particle"));
   }

   public static of q(dfy $$0) {
      return new of().a(og.i, a($$0, "_side")).a(og.f, a($$0, "_top")).a(og.e, a($$0, "_bottom"));
   }

   public static of r(dfy $$0) {
      akr $$1 = G($$0);
      return new of().a(og.r, $$1).a(og.i, $$1).a(og.f, a($$0, "_top")).a(og.e, a($$0, "_bottom"));
   }

   public static of s(dfy $$0) {
      akr $$1 = G($$0);
      return new of().a(og.b, $$1).a(og.r, $$1).a(og.i, $$1).a(og.d, a($$0, "_top"));
   }

   public static of b(akr $$0, akr $$1) {
      return new of().a(og.f, $$0).a(og.e, $$1);
   }

   public static of t(dfy $$0) {
      return new of().a(og.f, a($$0, "_top")).a(og.e, a($$0, "_bottom"));
   }

   public static of u(dfy $$0) {
      return new of().a(og.c, G($$0));
   }

   public static of h(akr $$0) {
      return new of().a(og.c, $$0);
   }

   public static of v(dfy $$0) {
      return new of().a(og.C, a($$0, "_0"));
   }

   public static of w(dfy $$0) {
      return new of().a(og.C, a($$0, "_1"));
   }

   public static of x(dfy $$0) {
      return new of().a(og.D, G($$0));
   }

   public static of y(dfy $$0) {
      return new of().a(og.G, G($$0));
   }

   public static of i(akr $$0) {
      return new of().a(og.G, $$0);
   }

   public static of a(dfy $$0, String $$1, String $$2) {
      return new of().a(og.i, a($$0, $$1)).a(og.f, a($$0, $$2)).a(og.e, a($$0, "_bottom"));
   }

   public static of a(dfy $$0, String $$1, String $$2, String $$3, String $$4) {
      return new of().a(og.g, a($$0, $$1)).a(og.i, a($$0, $$2)).a(og.f, a($$0, $$3)).a(og.e, a($$0, $$4));
   }

   public static of a(cul $$0) {
      return new of().a(og.c, c($$0));
   }

   public static of z(dfy $$0) {
      return new of().a(og.i, a($$0, "_side")).a(og.g, a($$0, "_front")).a(og.h, a($$0, "_back"));
   }

   public static of A(dfy $$0) {
      return new of().a(og.i, a($$0, "_side")).a(og.g, a($$0, "_front")).a(og.f, a($$0, "_top")).a(og.e, a($$0, "_bottom"));
   }

   public static of B(dfy $$0) {
      return new of().a(og.i, a($$0, "_side")).a(og.g, a($$0, "_front")).a(og.f, a($$0, "_top"));
   }

   public static of C(dfy $$0) {
      return new of().a(og.i, a($$0, "_side")).a(og.g, a($$0, "_front")).a(og.d, a($$0, "_end"));
   }

   public static of D(dfy $$0) {
      return new of().a(og.f, a($$0, "_top"));
   }

   public static of c(dfy $$0, dfy $$1) {
      return new of()
         .a(og.c, a($$0, "_front"))
         .a(og.o, G($$1))
         .a(og.n, a($$0, "_top"))
         .a(og.j, a($$0, "_front"))
         .a(og.l, a($$0, "_side"))
         .a(og.k, a($$0, "_side"))
         .a(og.m, a($$0, "_front"));
   }

   public static of d(dfy $$0, dfy $$1) {
      return new of()
         .a(og.c, a($$0, "_front"))
         .a(og.o, G($$1))
         .a(og.n, a($$0, "_top"))
         .a(og.j, a($$0, "_front"))
         .a(og.k, a($$0, "_front"))
         .a(og.l, a($$0, "_side"))
         .a(og.m, a($$0, "_side"));
   }

   public static of a(String $$0) {
      return new of()
         .a(og.c, a(dga.mg, $$0 + "_north"))
         .a(og.e, a(dga.mg, $$0 + "_bottom"))
         .a(og.f, a(dga.mg, $$0 + "_top"))
         .a(og.j, a(dga.mg, $$0 + "_north"))
         .a(og.k, a(dga.mg, $$0 + "_south"))
         .a(og.l, a(dga.mg, $$0 + "_east"))
         .a(og.m, a(dga.mg, $$0 + "_west"));
   }

   public static of E(dfy $$0) {
      return new of().a(og.K, a($$0, "_log_lit")).a(og.C, a($$0, "_fire"));
   }

   public static of a(dfy $$0, boolean $$1) {
      return new of()
         .a(og.c, a(dga.eg, "_side"))
         .a(og.e, a(dga.eg, "_bottom"))
         .a(og.f, a(dga.eg, "_top"))
         .a(og.i, a(dga.eg, "_side"))
         .a(og.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static of j(akr $$0) {
      return new of()
         .a(og.c, a(dga.ft, "_side"))
         .a(og.i, a(dga.ft, "_side"))
         .a(og.f, a(dga.ft, "_top"))
         .a(og.e, a(dga.ft, "_bottom"))
         .a(og.M, a(dga.ft, "_inner"))
         .a(og.N, $$0);
   }

   public static of a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new of()
         .a(og.c, a(dga.qV, "_bottom"))
         .a(og.i, a(dga.qV, "_side"))
         .a(og.f, a(dga.qV, "_top"))
         .a(og.O, a(dga.qV, $$1 + "_inner_top"))
         .a(og.e, a(dga.qV, "_bottom"));
   }

   public static of b(cul $$0) {
      return new of().a(og.H, c($$0));
   }

   public static of F(dfy $$0) {
      return new of().a(og.H, G($$0));
   }

   public static of k(akr $$0) {
      return new of().a(og.H, $$0);
   }

   public static of c(akr $$0, akr $$1) {
      return new of().a(og.H, $$0).a(og.I, $$1);
   }

   public static of a(akr $$0, akr $$1, akr $$2) {
      return new of().a(og.H, $$0).a(og.I, $$1).a(og.J, $$2);
   }

   public static akr G(dfy $$0) {
      akr $$1 = lt.e.b($$0);
      return $$1.f("block/");
   }

   public static akr a(dfy $$0, String $$1) {
      akr $$2 = lt.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akr c(cul $$0) {
      akr $$1 = lt.g.b($$0);
      return $$1.f("item/");
   }

   public static akr a(cul $$0, String $$1) {
      akr $$2 = lt.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
