import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class op {
   private final Map<oq, alp> a = Maps.newHashMap();
   private final Set<oq> b = Sets.newHashSet();

   public op a(oq $$0, alp $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public op b(oq $$0, alp $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<oq> a() {
      return this.b.stream();
   }

   public op a(oq $$0, oq $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public op b(oq $$0, oq $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alp a(oq $$0) {
      for (oq $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alp $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public op c(oq $$0, alp $$1) {
      op $$2 = new op();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static op a(dkd $$0) {
      alp $$1 = J($$0);
      return b($$1);
   }

   public static op b(dkd $$0) {
      alp $$1 = J($$0);
      return a($$1);
   }

   public static op a(alp $$0) {
      return new op().a(oq.b, $$0);
   }

   public static op b(alp $$0) {
      return new op().a(oq.a, $$0);
   }

   public static op c(dkd $$0) {
      return d(oq.p, J($$0));
   }

   public static op d(dkd $$0) {
      return d(oq.i, J($$0));
   }

   public static op e(dkd $$0) {
      return new op().a(oq.p, J($$0)).a(oq.q, a($$0, "_emissive"));
   }

   public static op c(alp $$0) {
      return d(oq.p, $$0);
   }

   public static op f(dkd $$0) {
      return d(oq.r, J($$0));
   }

   public static op g(dkd $$0) {
      return new op().a(oq.r, J($$0)).a(oq.q, a($$0, "_emissive"));
   }

   public static op d(alp $$0) {
      return d(oq.r, $$0);
   }

   public static op h(dkd $$0) {
      return d(oq.t, J($$0));
   }

   public static op e(alp $$0) {
      return d(oq.t, $$0);
   }

   public static op i(dkd $$0) {
      return d(oq.u, J($$0));
   }

   public static op j(dkd $$0) {
      return new op().a(oq.Q, J($$0)).a(oq.z, a($$0, "_stem"));
   }

   public static op f(alp $$0) {
      return d(oq.u, $$0);
   }

   public static op k(dkd $$0) {
      return d(oq.z, J($$0));
   }

   public static op a(dkd $$0, dkd $$1) {
      return new op().a(oq.z, J($$0)).a(oq.A, J($$1));
   }

   public static op l(dkd $$0) {
      return d(oq.v, J($$0));
   }

   public static op m(dkd $$0) {
      return d(oq.y, J($$0));
   }

   public static op g(alp $$0) {
      return d(oq.B, $$0);
   }

   public static op b(dkd $$0, dkd $$1) {
      return new op().a(oq.w, J($$0)).a(oq.x, a($$1, "_top"));
   }

   public static op d(oq $$0, alp $$1) {
      return new op().a($$0, $$1);
   }

   public static op n(dkd $$0) {
      return new op().a(oq.i, a($$0, "_side")).a(oq.d, a($$0, "_top"));
   }

   public static op o(dkd $$0) {
      return new op().a(oq.i, a($$0, "_side")).a(oq.f, a($$0, "_top"));
   }

   public static op p(dkd $$0) {
      return new op().a(oq.r, a($$0, "_plant")).a(oq.i, a($$0, "_side")).a(oq.f, a($$0, "_top"));
   }

   public static op q(dkd $$0) {
      return new op().a(oq.i, J($$0)).a(oq.d, a($$0, "_top")).a(oq.c, J($$0));
   }

   public static op a(alp $$0, alp $$1) {
      return new op().a(oq.i, $$0).a(oq.d, $$1);
   }

   public static op r(dkd $$0) {
      return new op().a(oq.b, J($$0)).a(oq.i, a($$0, "_side")).a(oq.f, a($$0, "_top"));
   }

   public static op s(dkd $$0) {
      return new op().a(oq.b, J($$0)).a(oq.c, a($$0, "_particle"));
   }

   public static op t(dkd $$0) {
      return new op().a(oq.i, a($$0, "_side")).a(oq.f, a($$0, "_top")).a(oq.e, a($$0, "_bottom"));
   }

   public static op u(dkd $$0) {
      alp $$1 = J($$0);
      return new op().a(oq.s, $$1).a(oq.i, $$1).a(oq.f, a($$0, "_top")).a(oq.e, a($$0, "_bottom"));
   }

   public static op v(dkd $$0) {
      alp $$1 = J($$0);
      return new op().a(oq.b, $$1).a(oq.s, $$1).a(oq.i, $$1).a(oq.d, a($$0, "_top"));
   }

   public static op b(alp $$0, alp $$1) {
      return new op().a(oq.f, $$0).a(oq.e, $$1);
   }

   public static op w(dkd $$0) {
      return new op().a(oq.f, a($$0, "_top")).a(oq.e, a($$0, "_bottom"));
   }

   public static op x(dkd $$0) {
      return new op().a(oq.c, J($$0));
   }

   public static op h(alp $$0) {
      return new op().a(oq.c, $$0);
   }

   public static op y(dkd $$0) {
      return new op().a(oq.D, a($$0, "_0"));
   }

   public static op z(dkd $$0) {
      return new op().a(oq.D, a($$0, "_1"));
   }

   public static op A(dkd $$0) {
      return new op().a(oq.E, J($$0));
   }

   public static op B(dkd $$0) {
      return new op().a(oq.H, J($$0));
   }

   public static op i(alp $$0) {
      return new op().a(oq.H, $$0);
   }

   public static op a(dkd $$0, String $$1, String $$2) {
      return new op().a(oq.i, a($$0, $$1)).a(oq.f, a($$0, $$2)).a(oq.e, a($$0, "_bottom"));
   }

   public static op a(dkd $$0, String $$1, String $$2, String $$3, String $$4) {
      return new op().a(oq.g, a($$0, $$1)).a(oq.i, a($$0, $$2)).a(oq.f, a($$0, $$3)).a(oq.e, a($$0, $$4));
   }

   public static op a(cxc $$0) {
      return new op().a(oq.c, c($$0));
   }

   public static op C(dkd $$0) {
      return new op().a(oq.i, a($$0, "_side")).a(oq.g, a($$0, "_front")).a(oq.h, a($$0, "_back"));
   }

   public static op D(dkd $$0) {
      return new op().a(oq.i, a($$0, "_side")).a(oq.g, a($$0, "_front")).a(oq.f, a($$0, "_top")).a(oq.e, a($$0, "_bottom"));
   }

   public static op E(dkd $$0) {
      return new op().a(oq.i, a($$0, "_side")).a(oq.g, a($$0, "_front")).a(oq.f, a($$0, "_top"));
   }

   public static op F(dkd $$0) {
      return new op().a(oq.i, a($$0, "_side")).a(oq.g, a($$0, "_front")).a(oq.d, a($$0, "_end"));
   }

   public static op G(dkd $$0) {
      return new op().a(oq.f, a($$0, "_top"));
   }

   public static op c(dkd $$0, dkd $$1) {
      return new op()
         .a(oq.c, a($$0, "_front"))
         .a(oq.o, J($$1))
         .a(oq.n, a($$0, "_top"))
         .a(oq.j, a($$0, "_front"))
         .a(oq.l, a($$0, "_side"))
         .a(oq.k, a($$0, "_side"))
         .a(oq.m, a($$0, "_front"));
   }

   public static op d(dkd $$0, dkd $$1) {
      return new op()
         .a(oq.c, a($$0, "_front"))
         .a(oq.o, J($$1))
         .a(oq.n, a($$0, "_top"))
         .a(oq.j, a($$0, "_front"))
         .a(oq.k, a($$0, "_front"))
         .a(oq.l, a($$0, "_side"))
         .a(oq.m, a($$0, "_side"));
   }

   public static op a(String $$0) {
      return new op()
         .a(oq.c, a(dkf.mI, $$0 + "_north"))
         .a(oq.e, a(dkf.mI, $$0 + "_bottom"))
         .a(oq.f, a(dkf.mI, $$0 + "_top"))
         .a(oq.j, a(dkf.mI, $$0 + "_north"))
         .a(oq.k, a(dkf.mI, $$0 + "_south"))
         .a(oq.l, a(dkf.mI, $$0 + "_east"))
         .a(oq.m, a(dkf.mI, $$0 + "_west"));
   }

   public static op H(dkd $$0) {
      return new op().a(oq.L, a($$0, "_log_lit")).a(oq.D, a($$0, "_fire"));
   }

   public static op a(dkd $$0, boolean $$1) {
      return new op()
         .a(oq.c, a(dkf.et, "_side"))
         .a(oq.e, a(dkf.et, "_bottom"))
         .a(oq.f, a(dkf.et, "_top"))
         .a(oq.i, a(dkf.et, "_side"))
         .a(oq.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static op j(alp $$0) {
      return new op()
         .a(oq.c, a(dkf.fO, "_side"))
         .a(oq.i, a(dkf.fO, "_side"))
         .a(oq.f, a(dkf.fO, "_top"))
         .a(oq.e, a(dkf.fO, "_bottom"))
         .a(oq.N, a(dkf.fO, "_inner"))
         .a(oq.O, $$0);
   }

   public static op a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new op()
         .a(oq.c, a(dkf.rx, "_bottom"))
         .a(oq.i, a(dkf.rx, "_side"))
         .a(oq.f, a(dkf.rx, "_top"))
         .a(oq.P, a(dkf.rx, $$1 + "_inner_top"))
         .a(oq.e, a(dkf.rx, "_bottom"));
   }

   public static op b(cxc $$0) {
      return new op().a(oq.I, c($$0));
   }

   public static op I(dkd $$0) {
      return new op().a(oq.I, J($$0));
   }

   public static op k(alp $$0) {
      return new op().a(oq.I, $$0);
   }

   public static op c(alp $$0, alp $$1) {
      return new op().a(oq.I, $$0).a(oq.J, $$1);
   }

   public static op a(alp $$0, alp $$1, alp $$2) {
      return new op().a(oq.I, $$0).a(oq.J, $$1).a(oq.K, $$2);
   }

   public static alp J(dkd $$0) {
      alp $$1 = ma.e.b($$0);
      return $$1.f("block/");
   }

   public static alp a(dkd $$0, String $$1) {
      alp $$2 = ma.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alp c(cxc $$0) {
      alp $$1 = ma.g.b($$0);
      return $$1.f("item/");
   }

   public static alp a(cxc $$0, String $$1) {
      alp $$2 = ma.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
