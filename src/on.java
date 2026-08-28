import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class on {
   private final Map<oo, ali> a = Maps.newHashMap();
   private final Set<oo> b = Sets.newHashSet();

   public on a(oo $$0, ali $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public on b(oo $$0, ali $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<oo> a() {
      return this.b.stream();
   }

   public on a(oo $$0, oo $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public on b(oo $$0, oo $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ali a(oo $$0) {
      for (oo $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ali $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public on c(oo $$0, ali $$1) {
      on $$2 = new on();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static on a(die $$0) {
      ali $$1 = G($$0);
      return b($$1);
   }

   public static on b(die $$0) {
      ali $$1 = G($$0);
      return a($$1);
   }

   public static on a(ali $$0) {
      return new on().a(oo.b, $$0);
   }

   public static on b(ali $$0) {
      return new on().a(oo.a, $$0);
   }

   public static on c(die $$0) {
      return d(oo.p, G($$0));
   }

   public static on c(ali $$0) {
      return d(oo.p, $$0);
   }

   public static on d(die $$0) {
      return d(oo.q, G($$0));
   }

   public static on d(ali $$0) {
      return d(oo.q, $$0);
   }

   public static on e(die $$0) {
      return d(oo.s, G($$0));
   }

   public static on e(ali $$0) {
      return d(oo.s, $$0);
   }

   public static on f(die $$0) {
      return d(oo.t, G($$0));
   }

   public static on g(die $$0) {
      return new on().a(oo.P, G($$0)).a(oo.y, a($$0, "_stem"));
   }

   public static on f(ali $$0) {
      return d(oo.t, $$0);
   }

   public static on h(die $$0) {
      return d(oo.y, G($$0));
   }

   public static on a(die $$0, die $$1) {
      return new on().a(oo.y, G($$0)).a(oo.z, G($$1));
   }

   public static on i(die $$0) {
      return d(oo.u, G($$0));
   }

   public static on j(die $$0) {
      return d(oo.x, G($$0));
   }

   public static on g(ali $$0) {
      return d(oo.A, $$0);
   }

   public static on b(die $$0, die $$1) {
      return new on().a(oo.v, G($$0)).a(oo.w, a($$1, "_top"));
   }

   public static on d(oo $$0, ali $$1) {
      return new on().a($$0, $$1);
   }

   public static on k(die $$0) {
      return new on().a(oo.i, a($$0, "_side")).a(oo.d, a($$0, "_top"));
   }

   public static on l(die $$0) {
      return new on().a(oo.i, a($$0, "_side")).a(oo.f, a($$0, "_top"));
   }

   public static on m(die $$0) {
      return new on().a(oo.q, a($$0, "_plant")).a(oo.i, a($$0, "_side")).a(oo.f, a($$0, "_top"));
   }

   public static on n(die $$0) {
      return new on().a(oo.i, G($$0)).a(oo.d, a($$0, "_top")).a(oo.c, G($$0));
   }

   public static on a(ali $$0, ali $$1) {
      return new on().a(oo.i, $$0).a(oo.d, $$1);
   }

   public static on o(die $$0) {
      return new on().a(oo.b, G($$0)).a(oo.i, a($$0, "_side")).a(oo.f, a($$0, "_top"));
   }

   public static on p(die $$0) {
      return new on().a(oo.b, G($$0)).a(oo.c, a($$0, "_particle"));
   }

   public static on q(die $$0) {
      return new on().a(oo.i, a($$0, "_side")).a(oo.f, a($$0, "_top")).a(oo.e, a($$0, "_bottom"));
   }

   public static on r(die $$0) {
      ali $$1 = G($$0);
      return new on().a(oo.r, $$1).a(oo.i, $$1).a(oo.f, a($$0, "_top")).a(oo.e, a($$0, "_bottom"));
   }

   public static on s(die $$0) {
      ali $$1 = G($$0);
      return new on().a(oo.b, $$1).a(oo.r, $$1).a(oo.i, $$1).a(oo.d, a($$0, "_top"));
   }

   public static on b(ali $$0, ali $$1) {
      return new on().a(oo.f, $$0).a(oo.e, $$1);
   }

   public static on t(die $$0) {
      return new on().a(oo.f, a($$0, "_top")).a(oo.e, a($$0, "_bottom"));
   }

   public static on u(die $$0) {
      return new on().a(oo.c, G($$0));
   }

   public static on h(ali $$0) {
      return new on().a(oo.c, $$0);
   }

   public static on v(die $$0) {
      return new on().a(oo.C, a($$0, "_0"));
   }

   public static on w(die $$0) {
      return new on().a(oo.C, a($$0, "_1"));
   }

   public static on x(die $$0) {
      return new on().a(oo.D, G($$0));
   }

   public static on y(die $$0) {
      return new on().a(oo.G, G($$0));
   }

   public static on i(ali $$0) {
      return new on().a(oo.G, $$0);
   }

   public static on a(die $$0, String $$1, String $$2) {
      return new on().a(oo.i, a($$0, $$1)).a(oo.f, a($$0, $$2)).a(oo.e, a($$0, "_bottom"));
   }

   public static on a(die $$0, String $$1, String $$2, String $$3, String $$4) {
      return new on().a(oo.g, a($$0, $$1)).a(oo.i, a($$0, $$2)).a(oo.f, a($$0, $$3)).a(oo.e, a($$0, $$4));
   }

   public static on a(cvx $$0) {
      return new on().a(oo.c, c($$0));
   }

   public static on z(die $$0) {
      return new on().a(oo.i, a($$0, "_side")).a(oo.g, a($$0, "_front")).a(oo.h, a($$0, "_back"));
   }

   public static on A(die $$0) {
      return new on().a(oo.i, a($$0, "_side")).a(oo.g, a($$0, "_front")).a(oo.f, a($$0, "_top")).a(oo.e, a($$0, "_bottom"));
   }

   public static on B(die $$0) {
      return new on().a(oo.i, a($$0, "_side")).a(oo.g, a($$0, "_front")).a(oo.f, a($$0, "_top"));
   }

   public static on C(die $$0) {
      return new on().a(oo.i, a($$0, "_side")).a(oo.g, a($$0, "_front")).a(oo.d, a($$0, "_end"));
   }

   public static on D(die $$0) {
      return new on().a(oo.f, a($$0, "_top"));
   }

   public static on c(die $$0, die $$1) {
      return new on()
         .a(oo.c, a($$0, "_front"))
         .a(oo.o, G($$1))
         .a(oo.n, a($$0, "_top"))
         .a(oo.j, a($$0, "_front"))
         .a(oo.l, a($$0, "_side"))
         .a(oo.k, a($$0, "_side"))
         .a(oo.m, a($$0, "_front"));
   }

   public static on d(die $$0, die $$1) {
      return new on()
         .a(oo.c, a($$0, "_front"))
         .a(oo.o, G($$1))
         .a(oo.n, a($$0, "_top"))
         .a(oo.j, a($$0, "_front"))
         .a(oo.k, a($$0, "_front"))
         .a(oo.l, a($$0, "_side"))
         .a(oo.m, a($$0, "_side"));
   }

   public static on a(String $$0) {
      return new on()
         .a(oo.c, a(dig.mg, $$0 + "_north"))
         .a(oo.e, a(dig.mg, $$0 + "_bottom"))
         .a(oo.f, a(dig.mg, $$0 + "_top"))
         .a(oo.j, a(dig.mg, $$0 + "_north"))
         .a(oo.k, a(dig.mg, $$0 + "_south"))
         .a(oo.l, a(dig.mg, $$0 + "_east"))
         .a(oo.m, a(dig.mg, $$0 + "_west"));
   }

   public static on E(die $$0) {
      return new on().a(oo.K, a($$0, "_log_lit")).a(oo.C, a($$0, "_fire"));
   }

   public static on a(die $$0, boolean $$1) {
      return new on()
         .a(oo.c, a(dig.eg, "_side"))
         .a(oo.e, a(dig.eg, "_bottom"))
         .a(oo.f, a(dig.eg, "_top"))
         .a(oo.i, a(dig.eg, "_side"))
         .a(oo.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static on j(ali $$0) {
      return new on()
         .a(oo.c, a(dig.ft, "_side"))
         .a(oo.i, a(dig.ft, "_side"))
         .a(oo.f, a(dig.ft, "_top"))
         .a(oo.e, a(dig.ft, "_bottom"))
         .a(oo.M, a(dig.ft, "_inner"))
         .a(oo.N, $$0);
   }

   public static on a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new on()
         .a(oo.c, a(dig.qV, "_bottom"))
         .a(oo.i, a(dig.qV, "_side"))
         .a(oo.f, a(dig.qV, "_top"))
         .a(oo.O, a(dig.qV, $$1 + "_inner_top"))
         .a(oo.e, a(dig.qV, "_bottom"));
   }

   public static on b(cvx $$0) {
      return new on().a(oo.H, c($$0));
   }

   public static on F(die $$0) {
      return new on().a(oo.H, G($$0));
   }

   public static on k(ali $$0) {
      return new on().a(oo.H, $$0);
   }

   public static on c(ali $$0, ali $$1) {
      return new on().a(oo.H, $$0).a(oo.I, $$1);
   }

   public static on a(ali $$0, ali $$1, ali $$2) {
      return new on().a(oo.H, $$0).a(oo.I, $$1).a(oo.J, $$2);
   }

   public static ali G(die $$0) {
      ali $$1 = ly.e.b($$0);
      return $$1.f("block/");
   }

   public static ali a(die $$0, String $$1) {
      ali $$2 = ly.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ali c(cvx $$0) {
      ali $$1 = ly.g.b($$0);
      return $$1.f("item/");
   }

   public static ali a(cvx $$0, String $$1) {
      ali $$2 = ly.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
