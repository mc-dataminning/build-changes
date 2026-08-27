import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class li {
   private final Map<lj, aep> a = Maps.newHashMap();
   private final Set<lj> b = Sets.newHashSet();

   public li a(lj $$0, aep $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public li b(lj $$0, aep $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<lj> a() {
      return this.b.stream();
   }

   public li a(lj $$0, lj $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public li b(lj $$0, lj $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public aep a(lj $$0) {
      for (lj $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         aep $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public li c(lj $$0, aep $$1) {
      li $$2 = new li();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static li a(csk $$0) {
      aep $$1 = G($$0);
      return b($$1);
   }

   public static li b(csk $$0) {
      aep $$1 = G($$0);
      return a($$1);
   }

   public static li a(aep $$0) {
      return new li().a(lj.b, $$0);
   }

   public static li b(aep $$0) {
      return new li().a(lj.a, $$0);
   }

   public static li c(csk $$0) {
      return d(lj.p, G($$0));
   }

   public static li c(aep $$0) {
      return d(lj.p, $$0);
   }

   public static li d(csk $$0) {
      return d(lj.q, G($$0));
   }

   public static li d(aep $$0) {
      return d(lj.q, $$0);
   }

   public static li e(csk $$0) {
      return d(lj.s, G($$0));
   }

   public static li e(aep $$0) {
      return d(lj.s, $$0);
   }

   public static li f(csk $$0) {
      return d(lj.t, G($$0));
   }

   public static li g(csk $$0) {
      return new li().a(lj.P, G($$0)).a(lj.y, a($$0, "_stem"));
   }

   public static li f(aep $$0) {
      return d(lj.t, $$0);
   }

   public static li h(csk $$0) {
      return d(lj.y, G($$0));
   }

   public static li a(csk $$0, csk $$1) {
      return new li().a(lj.y, G($$0)).a(lj.z, G($$1));
   }

   public static li i(csk $$0) {
      return d(lj.u, G($$0));
   }

   public static li j(csk $$0) {
      return d(lj.x, G($$0));
   }

   public static li g(aep $$0) {
      return d(lj.A, $$0);
   }

   public static li b(csk $$0, csk $$1) {
      return new li().a(lj.v, G($$0)).a(lj.w, a($$1, "_top"));
   }

   public static li d(lj $$0, aep $$1) {
      return new li().a($$0, $$1);
   }

   public static li k(csk $$0) {
      return new li().a(lj.i, a($$0, "_side")).a(lj.d, a($$0, "_top"));
   }

   public static li l(csk $$0) {
      return new li().a(lj.i, a($$0, "_side")).a(lj.f, a($$0, "_top"));
   }

   public static li m(csk $$0) {
      return new li().a(lj.q, a($$0, "_plant")).a(lj.i, a($$0, "_side")).a(lj.f, a($$0, "_top"));
   }

   public static li n(csk $$0) {
      return new li().a(lj.i, G($$0)).a(lj.d, a($$0, "_top")).a(lj.c, G($$0));
   }

   public static li a(aep $$0, aep $$1) {
      return new li().a(lj.i, $$0).a(lj.d, $$1);
   }

   public static li o(csk $$0) {
      return new li().a(lj.b, G($$0)).a(lj.i, a($$0, "_side")).a(lj.f, a($$0, "_top"));
   }

   public static li p(csk $$0) {
      return new li().a(lj.b, G($$0)).a(lj.c, a($$0, "_particle"));
   }

   public static li q(csk $$0) {
      return new li().a(lj.i, a($$0, "_side")).a(lj.f, a($$0, "_top")).a(lj.e, a($$0, "_bottom"));
   }

   public static li r(csk $$0) {
      aep $$1 = G($$0);
      return new li().a(lj.r, $$1).a(lj.i, $$1).a(lj.f, a($$0, "_top")).a(lj.e, a($$0, "_bottom"));
   }

   public static li s(csk $$0) {
      aep $$1 = G($$0);
      return new li().a(lj.b, $$1).a(lj.r, $$1).a(lj.i, $$1).a(lj.d, a($$0, "_top"));
   }

   public static li b(aep $$0, aep $$1) {
      return new li().a(lj.f, $$0).a(lj.e, $$1);
   }

   public static li t(csk $$0) {
      return new li().a(lj.f, a($$0, "_top")).a(lj.e, a($$0, "_bottom"));
   }

   public static li u(csk $$0) {
      return new li().a(lj.c, G($$0));
   }

   public static li h(aep $$0) {
      return new li().a(lj.c, $$0);
   }

   public static li v(csk $$0) {
      return new li().a(lj.C, a($$0, "_0"));
   }

   public static li w(csk $$0) {
      return new li().a(lj.C, a($$0, "_1"));
   }

   public static li x(csk $$0) {
      return new li().a(lj.D, G($$0));
   }

   public static li y(csk $$0) {
      return new li().a(lj.G, G($$0));
   }

   public static li i(aep $$0) {
      return new li().a(lj.G, $$0);
   }

   public static li a(cir $$0) {
      return new li().a(lj.c, c($$0));
   }

   public static li z(csk $$0) {
      return new li().a(lj.i, a($$0, "_side")).a(lj.g, a($$0, "_front")).a(lj.h, a($$0, "_back"));
   }

   public static li A(csk $$0) {
      return new li().a(lj.i, a($$0, "_side")).a(lj.g, a($$0, "_front")).a(lj.f, a($$0, "_top")).a(lj.e, a($$0, "_bottom"));
   }

   public static li B(csk $$0) {
      return new li().a(lj.i, a($$0, "_side")).a(lj.g, a($$0, "_front")).a(lj.f, a($$0, "_top"));
   }

   public static li C(csk $$0) {
      return new li().a(lj.i, a($$0, "_side")).a(lj.g, a($$0, "_front")).a(lj.d, a($$0, "_end"));
   }

   public static li D(csk $$0) {
      return new li().a(lj.f, a($$0, "_top"));
   }

   public static li c(csk $$0, csk $$1) {
      return new li()
         .a(lj.c, a($$0, "_front"))
         .a(lj.o, G($$1))
         .a(lj.n, a($$0, "_top"))
         .a(lj.j, a($$0, "_front"))
         .a(lj.l, a($$0, "_side"))
         .a(lj.k, a($$0, "_side"))
         .a(lj.m, a($$0, "_front"));
   }

   public static li d(csk $$0, csk $$1) {
      return new li()
         .a(lj.c, a($$0, "_front"))
         .a(lj.o, G($$1))
         .a(lj.n, a($$0, "_top"))
         .a(lj.j, a($$0, "_front"))
         .a(lj.k, a($$0, "_front"))
         .a(lj.l, a($$0, "_side"))
         .a(lj.m, a($$0, "_side"));
   }

   public static li a(String $$0) {
      return new li()
         .a(lj.c, a(csl.mg, $$0 + "_north"))
         .a(lj.e, a(csl.mg, $$0 + "_bottom"))
         .a(lj.f, a(csl.mg, $$0 + "_top"))
         .a(lj.j, a(csl.mg, $$0 + "_north"))
         .a(lj.k, a(csl.mg, $$0 + "_south"))
         .a(lj.l, a(csl.mg, $$0 + "_east"))
         .a(lj.m, a(csl.mg, $$0 + "_west"));
   }

   public static li E(csk $$0) {
      return new li().a(lj.K, a($$0, "_log_lit")).a(lj.C, a($$0, "_fire"));
   }

   public static li a(csk $$0, boolean $$1) {
      return new li()
         .a(lj.c, a(csl.eh, "_side"))
         .a(lj.e, a(csl.eh, "_bottom"))
         .a(lj.f, a(csl.eh, "_top"))
         .a(lj.i, a(csl.eh, "_side"))
         .a(lj.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static li j(aep $$0) {
      return new li()
         .a(lj.c, a(csl.ft, "_side"))
         .a(lj.i, a(csl.ft, "_side"))
         .a(lj.f, a(csl.ft, "_top"))
         .a(lj.e, a(csl.ft, "_bottom"))
         .a(lj.M, a(csl.ft, "_inner"))
         .a(lj.N, $$0);
   }

   public static li a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new li()
         .a(lj.c, a(csl.qI, "_bottom"))
         .a(lj.i, a(csl.qI, "_side"))
         .a(lj.f, a(csl.qI, "_top"))
         .a(lj.O, a(csl.qI, $$1 + "_inner_top"))
         .a(lj.e, a(csl.qI, "_bottom"));
   }

   public static li b(cir $$0) {
      return new li().a(lj.H, c($$0));
   }

   public static li F(csk $$0) {
      return new li().a(lj.H, G($$0));
   }

   public static li k(aep $$0) {
      return new li().a(lj.H, $$0);
   }

   public static li c(aep $$0, aep $$1) {
      return new li().a(lj.H, $$0).a(lj.I, $$1);
   }

   public static li a(aep $$0, aep $$1, aep $$2) {
      return new li().a(lj.H, $$0).a(lj.I, $$1).a(lj.J, $$2);
   }

   public static aep G(csk $$0) {
      aep $$1 = jc.f.b($$0);
      return $$1.d("block/");
   }

   public static aep a(csk $$0, String $$1) {
      aep $$2 = jc.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aep c(cir $$0) {
      aep $$1 = jc.i.b($$0);
      return $$1.d("item/");
   }

   public static aep a(cir $$0, String $$1) {
      aep $$2 = jc.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
