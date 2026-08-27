import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class mq {
   private final Map<mr, ahg> a = Maps.newHashMap();
   private final Set<mr> b = Sets.newHashSet();

   public mq a(mr $$0, ahg $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public mq b(mr $$0, ahg $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<mr> a() {
      return this.b.stream();
   }

   public mq a(mr $$0, mr $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public mq b(mr $$0, mr $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ahg a(mr $$0) {
      for (mr $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ahg $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public mq c(mr $$0, ahg $$1) {
      mq $$2 = new mq();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static mq a(cwp $$0) {
      ahg $$1 = G($$0);
      return b($$1);
   }

   public static mq b(cwp $$0) {
      ahg $$1 = G($$0);
      return a($$1);
   }

   public static mq a(ahg $$0) {
      return new mq().a(mr.b, $$0);
   }

   public static mq b(ahg $$0) {
      return new mq().a(mr.a, $$0);
   }

   public static mq c(cwp $$0) {
      return d(mr.p, G($$0));
   }

   public static mq c(ahg $$0) {
      return d(mr.p, $$0);
   }

   public static mq d(cwp $$0) {
      return d(mr.q, G($$0));
   }

   public static mq d(ahg $$0) {
      return d(mr.q, $$0);
   }

   public static mq e(cwp $$0) {
      return d(mr.s, G($$0));
   }

   public static mq e(ahg $$0) {
      return d(mr.s, $$0);
   }

   public static mq f(cwp $$0) {
      return d(mr.t, G($$0));
   }

   public static mq g(cwp $$0) {
      return new mq().a(mr.P, G($$0)).a(mr.y, a($$0, "_stem"));
   }

   public static mq f(ahg $$0) {
      return d(mr.t, $$0);
   }

   public static mq h(cwp $$0) {
      return d(mr.y, G($$0));
   }

   public static mq a(cwp $$0, cwp $$1) {
      return new mq().a(mr.y, G($$0)).a(mr.z, G($$1));
   }

   public static mq i(cwp $$0) {
      return d(mr.u, G($$0));
   }

   public static mq j(cwp $$0) {
      return d(mr.x, G($$0));
   }

   public static mq g(ahg $$0) {
      return d(mr.A, $$0);
   }

   public static mq b(cwp $$0, cwp $$1) {
      return new mq().a(mr.v, G($$0)).a(mr.w, a($$1, "_top"));
   }

   public static mq d(mr $$0, ahg $$1) {
      return new mq().a($$0, $$1);
   }

   public static mq k(cwp $$0) {
      return new mq().a(mr.i, a($$0, "_side")).a(mr.d, a($$0, "_top"));
   }

   public static mq l(cwp $$0) {
      return new mq().a(mr.i, a($$0, "_side")).a(mr.f, a($$0, "_top"));
   }

   public static mq m(cwp $$0) {
      return new mq().a(mr.q, a($$0, "_plant")).a(mr.i, a($$0, "_side")).a(mr.f, a($$0, "_top"));
   }

   public static mq n(cwp $$0) {
      return new mq().a(mr.i, G($$0)).a(mr.d, a($$0, "_top")).a(mr.c, G($$0));
   }

   public static mq a(ahg $$0, ahg $$1) {
      return new mq().a(mr.i, $$0).a(mr.d, $$1);
   }

   public static mq o(cwp $$0) {
      return new mq().a(mr.b, G($$0)).a(mr.i, a($$0, "_side")).a(mr.f, a($$0, "_top"));
   }

   public static mq p(cwp $$0) {
      return new mq().a(mr.b, G($$0)).a(mr.c, a($$0, "_particle"));
   }

   public static mq q(cwp $$0) {
      return new mq().a(mr.i, a($$0, "_side")).a(mr.f, a($$0, "_top")).a(mr.e, a($$0, "_bottom"));
   }

   public static mq r(cwp $$0) {
      ahg $$1 = G($$0);
      return new mq().a(mr.r, $$1).a(mr.i, $$1).a(mr.f, a($$0, "_top")).a(mr.e, a($$0, "_bottom"));
   }

   public static mq s(cwp $$0) {
      ahg $$1 = G($$0);
      return new mq().a(mr.b, $$1).a(mr.r, $$1).a(mr.i, $$1).a(mr.d, a($$0, "_top"));
   }

   public static mq b(ahg $$0, ahg $$1) {
      return new mq().a(mr.f, $$0).a(mr.e, $$1);
   }

   public static mq t(cwp $$0) {
      return new mq().a(mr.f, a($$0, "_top")).a(mr.e, a($$0, "_bottom"));
   }

   public static mq u(cwp $$0) {
      return new mq().a(mr.c, G($$0));
   }

   public static mq h(ahg $$0) {
      return new mq().a(mr.c, $$0);
   }

   public static mq v(cwp $$0) {
      return new mq().a(mr.C, a($$0, "_0"));
   }

   public static mq w(cwp $$0) {
      return new mq().a(mr.C, a($$0, "_1"));
   }

   public static mq x(cwp $$0) {
      return new mq().a(mr.D, G($$0));
   }

   public static mq y(cwp $$0) {
      return new mq().a(mr.G, G($$0));
   }

   public static mq i(ahg $$0) {
      return new mq().a(mr.G, $$0);
   }

   public static mq a(cwp $$0, String $$1, String $$2) {
      return new mq().a(mr.i, a($$0, $$1)).a(mr.f, a($$0, $$2)).a(mr.e, a($$0, "_bottom"));
   }

   public static mq a(cms $$0) {
      return new mq().a(mr.c, c($$0));
   }

   public static mq z(cwp $$0) {
      return new mq().a(mr.i, a($$0, "_side")).a(mr.g, a($$0, "_front")).a(mr.h, a($$0, "_back"));
   }

   public static mq A(cwp $$0) {
      return new mq().a(mr.i, a($$0, "_side")).a(mr.g, a($$0, "_front")).a(mr.f, a($$0, "_top")).a(mr.e, a($$0, "_bottom"));
   }

   public static mq B(cwp $$0) {
      return new mq().a(mr.i, a($$0, "_side")).a(mr.g, a($$0, "_front")).a(mr.f, a($$0, "_top"));
   }

   public static mq C(cwp $$0) {
      return new mq().a(mr.i, a($$0, "_side")).a(mr.g, a($$0, "_front")).a(mr.d, a($$0, "_end"));
   }

   public static mq D(cwp $$0) {
      return new mq().a(mr.f, a($$0, "_top"));
   }

   public static mq c(cwp $$0, cwp $$1) {
      return new mq()
         .a(mr.c, a($$0, "_front"))
         .a(mr.o, G($$1))
         .a(mr.n, a($$0, "_top"))
         .a(mr.j, a($$0, "_front"))
         .a(mr.l, a($$0, "_side"))
         .a(mr.k, a($$0, "_side"))
         .a(mr.m, a($$0, "_front"));
   }

   public static mq d(cwp $$0, cwp $$1) {
      return new mq()
         .a(mr.c, a($$0, "_front"))
         .a(mr.o, G($$1))
         .a(mr.n, a($$0, "_top"))
         .a(mr.j, a($$0, "_front"))
         .a(mr.k, a($$0, "_front"))
         .a(mr.l, a($$0, "_side"))
         .a(mr.m, a($$0, "_side"));
   }

   public static mq a(String $$0) {
      return new mq()
         .a(mr.c, a(cwr.mg, $$0 + "_north"))
         .a(mr.e, a(cwr.mg, $$0 + "_bottom"))
         .a(mr.f, a(cwr.mg, $$0 + "_top"))
         .a(mr.j, a(cwr.mg, $$0 + "_north"))
         .a(mr.k, a(cwr.mg, $$0 + "_south"))
         .a(mr.l, a(cwr.mg, $$0 + "_east"))
         .a(mr.m, a(cwr.mg, $$0 + "_west"));
   }

   public static mq E(cwp $$0) {
      return new mq().a(mr.K, a($$0, "_log_lit")).a(mr.C, a($$0, "_fire"));
   }

   public static mq a(cwp $$0, boolean $$1) {
      return new mq()
         .a(mr.c, a(cwr.eg, "_side"))
         .a(mr.e, a(cwr.eg, "_bottom"))
         .a(mr.f, a(cwr.eg, "_top"))
         .a(mr.i, a(cwr.eg, "_side"))
         .a(mr.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static mq j(ahg $$0) {
      return new mq()
         .a(mr.c, a(cwr.ft, "_side"))
         .a(mr.i, a(cwr.ft, "_side"))
         .a(mr.f, a(cwr.ft, "_top"))
         .a(mr.e, a(cwr.ft, "_bottom"))
         .a(mr.M, a(cwr.ft, "_inner"))
         .a(mr.N, $$0);
   }

   public static mq a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new mq()
         .a(mr.c, a(cwr.qV, "_bottom"))
         .a(mr.i, a(cwr.qV, "_side"))
         .a(mr.f, a(cwr.qV, "_top"))
         .a(mr.O, a(cwr.qV, $$1 + "_inner_top"))
         .a(mr.e, a(cwr.qV, "_bottom"));
   }

   public static mq b(cms $$0) {
      return new mq().a(mr.H, c($$0));
   }

   public static mq F(cwp $$0) {
      return new mq().a(mr.H, G($$0));
   }

   public static mq k(ahg $$0) {
      return new mq().a(mr.H, $$0);
   }

   public static mq c(ahg $$0, ahg $$1) {
      return new mq().a(mr.H, $$0).a(mr.I, $$1);
   }

   public static mq a(ahg $$0, ahg $$1, ahg $$2) {
      return new mq().a(mr.H, $$0).a(mr.I, $$1).a(mr.J, $$2);
   }

   public static ahg G(cwp $$0) {
      ahg $$1 = kd.e.b($$0);
      return $$1.d("block/");
   }

   public static ahg a(cwp $$0, String $$1) {
      ahg $$2 = kd.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ahg c(cms $$0) {
      ahg $$1 = kd.h.b($$0);
      return $$1.d("item/");
   }

   public static ahg a(cms $$0, String $$1) {
      ahg $$2 = kd.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
