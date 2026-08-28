import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ot {
   private final Map<ou, alz> a = Maps.newHashMap();
   private final Set<ou> b = Sets.newHashSet();

   public ot a(ou $$0, alz $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public ot b(ou $$0, alz $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<ou> a() {
      return this.b.stream();
   }

   public ot a(ou $$0, ou $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public ot b(ou $$0, ou $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alz a(ou $$0) {
      for (ou $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alz $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public ot c(ou $$0, alz $$1) {
      ot $$2 = new ot();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static ot a(dkm $$0) {
      alz $$1 = H($$0);
      return b($$1);
   }

   public static ot b(dkm $$0) {
      alz $$1 = H($$0);
      return a($$1);
   }

   public static ot a(alz $$0) {
      return new ot().a(ou.b, $$0);
   }

   public static ot b(alz $$0) {
      return new ot().a(ou.a, $$0);
   }

   public static ot c(dkm $$0) {
      return d(ou.p, H($$0));
   }

   public static ot d(dkm $$0) {
      return d(ou.i, H($$0));
   }

   public static ot c(alz $$0) {
      return d(ou.p, $$0);
   }

   public static ot e(dkm $$0) {
      return d(ou.q, H($$0));
   }

   public static ot d(alz $$0) {
      return d(ou.q, $$0);
   }

   public static ot f(dkm $$0) {
      return d(ou.s, H($$0));
   }

   public static ot e(alz $$0) {
      return d(ou.s, $$0);
   }

   public static ot g(dkm $$0) {
      return d(ou.t, H($$0));
   }

   public static ot h(dkm $$0) {
      return new ot().a(ou.P, H($$0)).a(ou.y, a($$0, "_stem"));
   }

   public static ot f(alz $$0) {
      return d(ou.t, $$0);
   }

   public static ot i(dkm $$0) {
      return d(ou.y, H($$0));
   }

   public static ot a(dkm $$0, dkm $$1) {
      return new ot().a(ou.y, H($$0)).a(ou.z, H($$1));
   }

   public static ot j(dkm $$0) {
      return d(ou.u, H($$0));
   }

   public static ot k(dkm $$0) {
      return d(ou.x, H($$0));
   }

   public static ot g(alz $$0) {
      return d(ou.A, $$0);
   }

   public static ot b(dkm $$0, dkm $$1) {
      return new ot().a(ou.v, H($$0)).a(ou.w, a($$1, "_top"));
   }

   public static ot d(ou $$0, alz $$1) {
      return new ot().a($$0, $$1);
   }

   public static ot l(dkm $$0) {
      return new ot().a(ou.i, a($$0, "_side")).a(ou.d, a($$0, "_top"));
   }

   public static ot m(dkm $$0) {
      return new ot().a(ou.i, a($$0, "_side")).a(ou.f, a($$0, "_top"));
   }

   public static ot n(dkm $$0) {
      return new ot().a(ou.q, a($$0, "_plant")).a(ou.i, a($$0, "_side")).a(ou.f, a($$0, "_top"));
   }

   public static ot o(dkm $$0) {
      return new ot().a(ou.i, H($$0)).a(ou.d, a($$0, "_top")).a(ou.c, H($$0));
   }

   public static ot a(alz $$0, alz $$1) {
      return new ot().a(ou.i, $$0).a(ou.d, $$1);
   }

   public static ot p(dkm $$0) {
      return new ot().a(ou.b, H($$0)).a(ou.i, a($$0, "_side")).a(ou.f, a($$0, "_top"));
   }

   public static ot q(dkm $$0) {
      return new ot().a(ou.b, H($$0)).a(ou.c, a($$0, "_particle"));
   }

   public static ot r(dkm $$0) {
      return new ot().a(ou.i, a($$0, "_side")).a(ou.f, a($$0, "_top")).a(ou.e, a($$0, "_bottom"));
   }

   public static ot s(dkm $$0) {
      alz $$1 = H($$0);
      return new ot().a(ou.r, $$1).a(ou.i, $$1).a(ou.f, a($$0, "_top")).a(ou.e, a($$0, "_bottom"));
   }

   public static ot t(dkm $$0) {
      alz $$1 = H($$0);
      return new ot().a(ou.b, $$1).a(ou.r, $$1).a(ou.i, $$1).a(ou.d, a($$0, "_top"));
   }

   public static ot b(alz $$0, alz $$1) {
      return new ot().a(ou.f, $$0).a(ou.e, $$1);
   }

   public static ot u(dkm $$0) {
      return new ot().a(ou.f, a($$0, "_top")).a(ou.e, a($$0, "_bottom"));
   }

   public static ot v(dkm $$0) {
      return new ot().a(ou.c, H($$0));
   }

   public static ot h(alz $$0) {
      return new ot().a(ou.c, $$0);
   }

   public static ot w(dkm $$0) {
      return new ot().a(ou.C, a($$0, "_0"));
   }

   public static ot x(dkm $$0) {
      return new ot().a(ou.C, a($$0, "_1"));
   }

   public static ot y(dkm $$0) {
      return new ot().a(ou.D, H($$0));
   }

   public static ot z(dkm $$0) {
      return new ot().a(ou.G, H($$0));
   }

   public static ot i(alz $$0) {
      return new ot().a(ou.G, $$0);
   }

   public static ot a(dkm $$0, String $$1, String $$2) {
      return new ot().a(ou.i, a($$0, $$1)).a(ou.f, a($$0, $$2)).a(ou.e, a($$0, "_bottom"));
   }

   public static ot a(dkm $$0, String $$1, String $$2, String $$3, String $$4) {
      return new ot().a(ou.g, a($$0, $$1)).a(ou.i, a($$0, $$2)).a(ou.f, a($$0, $$3)).a(ou.e, a($$0, $$4));
   }

   public static ot a(cxl $$0) {
      return new ot().a(ou.c, c($$0));
   }

   public static ot A(dkm $$0) {
      return new ot().a(ou.i, a($$0, "_side")).a(ou.g, a($$0, "_front")).a(ou.h, a($$0, "_back"));
   }

   public static ot B(dkm $$0) {
      return new ot().a(ou.i, a($$0, "_side")).a(ou.g, a($$0, "_front")).a(ou.f, a($$0, "_top")).a(ou.e, a($$0, "_bottom"));
   }

   public static ot C(dkm $$0) {
      return new ot().a(ou.i, a($$0, "_side")).a(ou.g, a($$0, "_front")).a(ou.f, a($$0, "_top"));
   }

   public static ot D(dkm $$0) {
      return new ot().a(ou.i, a($$0, "_side")).a(ou.g, a($$0, "_front")).a(ou.d, a($$0, "_end"));
   }

   public static ot E(dkm $$0) {
      return new ot().a(ou.f, a($$0, "_top"));
   }

   public static ot c(dkm $$0, dkm $$1) {
      return new ot()
         .a(ou.c, a($$0, "_front"))
         .a(ou.o, H($$1))
         .a(ou.n, a($$0, "_top"))
         .a(ou.j, a($$0, "_front"))
         .a(ou.l, a($$0, "_side"))
         .a(ou.k, a($$0, "_side"))
         .a(ou.m, a($$0, "_front"));
   }

   public static ot d(dkm $$0, dkm $$1) {
      return new ot()
         .a(ou.c, a($$0, "_front"))
         .a(ou.o, H($$1))
         .a(ou.n, a($$0, "_top"))
         .a(ou.j, a($$0, "_front"))
         .a(ou.k, a($$0, "_front"))
         .a(ou.l, a($$0, "_side"))
         .a(ou.m, a($$0, "_side"));
   }

   public static ot a(String $$0) {
      return new ot()
         .a(ou.c, a(dko.mB, $$0 + "_north"))
         .a(ou.e, a(dko.mB, $$0 + "_bottom"))
         .a(ou.f, a(dko.mB, $$0 + "_top"))
         .a(ou.j, a(dko.mB, $$0 + "_north"))
         .a(ou.k, a(dko.mB, $$0 + "_south"))
         .a(ou.l, a(dko.mB, $$0 + "_east"))
         .a(ou.m, a(dko.mB, $$0 + "_west"));
   }

   public static ot F(dkm $$0) {
      return new ot().a(ou.K, a($$0, "_log_lit")).a(ou.C, a($$0, "_fire"));
   }

   public static ot a(dkm $$0, boolean $$1) {
      return new ot()
         .a(ou.c, a(dko.et, "_side"))
         .a(ou.e, a(dko.et, "_bottom"))
         .a(ou.f, a(dko.et, "_top"))
         .a(ou.i, a(dko.et, "_side"))
         .a(ou.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static ot j(alz $$0) {
      return new ot()
         .a(ou.c, a(dko.fH, "_side"))
         .a(ou.i, a(dko.fH, "_side"))
         .a(ou.f, a(dko.fH, "_top"))
         .a(ou.e, a(dko.fH, "_bottom"))
         .a(ou.M, a(dko.fH, "_inner"))
         .a(ou.N, $$0);
   }

   public static ot a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new ot()
         .a(ou.c, a(dko.rq, "_bottom"))
         .a(ou.i, a(dko.rq, "_side"))
         .a(ou.f, a(dko.rq, "_top"))
         .a(ou.O, a(dko.rq, $$1 + "_inner_top"))
         .a(ou.e, a(dko.rq, "_bottom"));
   }

   public static ot b(cxl $$0) {
      return new ot().a(ou.H, c($$0));
   }

   public static ot G(dkm $$0) {
      return new ot().a(ou.H, H($$0));
   }

   public static ot k(alz $$0) {
      return new ot().a(ou.H, $$0);
   }

   public static ot c(alz $$0, alz $$1) {
      return new ot().a(ou.H, $$0).a(ou.I, $$1);
   }

   public static ot a(alz $$0, alz $$1, alz $$2) {
      return new ot().a(ou.H, $$0).a(ou.I, $$1).a(ou.J, $$2);
   }

   public static alz H(dkm $$0) {
      alz $$1 = ma.e.b($$0);
      return $$1.f("block/");
   }

   public static alz a(dkm $$0, String $$1) {
      alz $$2 = ma.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alz c(cxl $$0) {
      alz $$1 = ma.g.b($$0);
      return $$1.f("item/");
   }

   public static alz a(cxl $$0, String $$1) {
      alz $$2 = ma.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
