import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class nu {
   private final Map<nv, akh> a = Maps.newHashMap();
   private final Set<nv> b = Sets.newHashSet();

   public nu a(nv $$0, akh $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public nu b(nv $$0, akh $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<nv> a() {
      return this.b.stream();
   }

   public nu a(nv $$0, nv $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public nu b(nv $$0, nv $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public akh a(nv $$0) {
      for (nv $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         akh $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public nu c(nv $$0, akh $$1) {
      nu $$2 = new nu();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static nu a(dde $$0) {
      akh $$1 = G($$0);
      return b($$1);
   }

   public static nu b(dde $$0) {
      akh $$1 = G($$0);
      return a($$1);
   }

   public static nu a(akh $$0) {
      return new nu().a(nv.b, $$0);
   }

   public static nu b(akh $$0) {
      return new nu().a(nv.a, $$0);
   }

   public static nu c(dde $$0) {
      return d(nv.p, G($$0));
   }

   public static nu c(akh $$0) {
      return d(nv.p, $$0);
   }

   public static nu d(dde $$0) {
      return d(nv.q, G($$0));
   }

   public static nu d(akh $$0) {
      return d(nv.q, $$0);
   }

   public static nu e(dde $$0) {
      return d(nv.s, G($$0));
   }

   public static nu e(akh $$0) {
      return d(nv.s, $$0);
   }

   public static nu f(dde $$0) {
      return d(nv.t, G($$0));
   }

   public static nu g(dde $$0) {
      return new nu().a(nv.P, G($$0)).a(nv.y, a($$0, "_stem"));
   }

   public static nu f(akh $$0) {
      return d(nv.t, $$0);
   }

   public static nu h(dde $$0) {
      return d(nv.y, G($$0));
   }

   public static nu a(dde $$0, dde $$1) {
      return new nu().a(nv.y, G($$0)).a(nv.z, G($$1));
   }

   public static nu i(dde $$0) {
      return d(nv.u, G($$0));
   }

   public static nu j(dde $$0) {
      return d(nv.x, G($$0));
   }

   public static nu g(akh $$0) {
      return d(nv.A, $$0);
   }

   public static nu b(dde $$0, dde $$1) {
      return new nu().a(nv.v, G($$0)).a(nv.w, a($$1, "_top"));
   }

   public static nu d(nv $$0, akh $$1) {
      return new nu().a($$0, $$1);
   }

   public static nu k(dde $$0) {
      return new nu().a(nv.i, a($$0, "_side")).a(nv.d, a($$0, "_top"));
   }

   public static nu l(dde $$0) {
      return new nu().a(nv.i, a($$0, "_side")).a(nv.f, a($$0, "_top"));
   }

   public static nu m(dde $$0) {
      return new nu().a(nv.q, a($$0, "_plant")).a(nv.i, a($$0, "_side")).a(nv.f, a($$0, "_top"));
   }

   public static nu n(dde $$0) {
      return new nu().a(nv.i, G($$0)).a(nv.d, a($$0, "_top")).a(nv.c, G($$0));
   }

   public static nu a(akh $$0, akh $$1) {
      return new nu().a(nv.i, $$0).a(nv.d, $$1);
   }

   public static nu o(dde $$0) {
      return new nu().a(nv.b, G($$0)).a(nv.i, a($$0, "_side")).a(nv.f, a($$0, "_top"));
   }

   public static nu p(dde $$0) {
      return new nu().a(nv.b, G($$0)).a(nv.c, a($$0, "_particle"));
   }

   public static nu q(dde $$0) {
      return new nu().a(nv.i, a($$0, "_side")).a(nv.f, a($$0, "_top")).a(nv.e, a($$0, "_bottom"));
   }

   public static nu r(dde $$0) {
      akh $$1 = G($$0);
      return new nu().a(nv.r, $$1).a(nv.i, $$1).a(nv.f, a($$0, "_top")).a(nv.e, a($$0, "_bottom"));
   }

   public static nu s(dde $$0) {
      akh $$1 = G($$0);
      return new nu().a(nv.b, $$1).a(nv.r, $$1).a(nv.i, $$1).a(nv.d, a($$0, "_top"));
   }

   public static nu b(akh $$0, akh $$1) {
      return new nu().a(nv.f, $$0).a(nv.e, $$1);
   }

   public static nu t(dde $$0) {
      return new nu().a(nv.f, a($$0, "_top")).a(nv.e, a($$0, "_bottom"));
   }

   public static nu u(dde $$0) {
      return new nu().a(nv.c, G($$0));
   }

   public static nu h(akh $$0) {
      return new nu().a(nv.c, $$0);
   }

   public static nu v(dde $$0) {
      return new nu().a(nv.C, a($$0, "_0"));
   }

   public static nu w(dde $$0) {
      return new nu().a(nv.C, a($$0, "_1"));
   }

   public static nu x(dde $$0) {
      return new nu().a(nv.D, G($$0));
   }

   public static nu y(dde $$0) {
      return new nu().a(nv.G, G($$0));
   }

   public static nu i(akh $$0) {
      return new nu().a(nv.G, $$0);
   }

   public static nu a(dde $$0, String $$1, String $$2) {
      return new nu().a(nv.i, a($$0, $$1)).a(nv.f, a($$0, $$2)).a(nv.e, a($$0, "_bottom"));
   }

   public static nu a(dde $$0, String $$1, String $$2, String $$3, String $$4) {
      return new nu().a(nv.g, a($$0, $$1)).a(nv.i, a($$0, $$2)).a(nv.f, a($$0, $$3)).a(nv.e, a($$0, $$4));
   }

   public static nu a(csu $$0) {
      return new nu().a(nv.c, c($$0));
   }

   public static nu z(dde $$0) {
      return new nu().a(nv.i, a($$0, "_side")).a(nv.g, a($$0, "_front")).a(nv.h, a($$0, "_back"));
   }

   public static nu A(dde $$0) {
      return new nu().a(nv.i, a($$0, "_side")).a(nv.g, a($$0, "_front")).a(nv.f, a($$0, "_top")).a(nv.e, a($$0, "_bottom"));
   }

   public static nu B(dde $$0) {
      return new nu().a(nv.i, a($$0, "_side")).a(nv.g, a($$0, "_front")).a(nv.f, a($$0, "_top"));
   }

   public static nu C(dde $$0) {
      return new nu().a(nv.i, a($$0, "_side")).a(nv.g, a($$0, "_front")).a(nv.d, a($$0, "_end"));
   }

   public static nu D(dde $$0) {
      return new nu().a(nv.f, a($$0, "_top"));
   }

   public static nu c(dde $$0, dde $$1) {
      return new nu()
         .a(nv.c, a($$0, "_front"))
         .a(nv.o, G($$1))
         .a(nv.n, a($$0, "_top"))
         .a(nv.j, a($$0, "_front"))
         .a(nv.l, a($$0, "_side"))
         .a(nv.k, a($$0, "_side"))
         .a(nv.m, a($$0, "_front"));
   }

   public static nu d(dde $$0, dde $$1) {
      return new nu()
         .a(nv.c, a($$0, "_front"))
         .a(nv.o, G($$1))
         .a(nv.n, a($$0, "_top"))
         .a(nv.j, a($$0, "_front"))
         .a(nv.k, a($$0, "_front"))
         .a(nv.l, a($$0, "_side"))
         .a(nv.m, a($$0, "_side"));
   }

   public static nu a(String $$0) {
      return new nu()
         .a(nv.c, a(ddg.mg, $$0 + "_north"))
         .a(nv.e, a(ddg.mg, $$0 + "_bottom"))
         .a(nv.f, a(ddg.mg, $$0 + "_top"))
         .a(nv.j, a(ddg.mg, $$0 + "_north"))
         .a(nv.k, a(ddg.mg, $$0 + "_south"))
         .a(nv.l, a(ddg.mg, $$0 + "_east"))
         .a(nv.m, a(ddg.mg, $$0 + "_west"));
   }

   public static nu E(dde $$0) {
      return new nu().a(nv.K, a($$0, "_log_lit")).a(nv.C, a($$0, "_fire"));
   }

   public static nu a(dde $$0, boolean $$1) {
      return new nu()
         .a(nv.c, a(ddg.eg, "_side"))
         .a(nv.e, a(ddg.eg, "_bottom"))
         .a(nv.f, a(ddg.eg, "_top"))
         .a(nv.i, a(ddg.eg, "_side"))
         .a(nv.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static nu j(akh $$0) {
      return new nu()
         .a(nv.c, a(ddg.ft, "_side"))
         .a(nv.i, a(ddg.ft, "_side"))
         .a(nv.f, a(ddg.ft, "_top"))
         .a(nv.e, a(ddg.ft, "_bottom"))
         .a(nv.M, a(ddg.ft, "_inner"))
         .a(nv.N, $$0);
   }

   public static nu a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new nu()
         .a(nv.c, a(ddg.qV, "_bottom"))
         .a(nv.i, a(ddg.qV, "_side"))
         .a(nv.f, a(ddg.qV, "_top"))
         .a(nv.O, a(ddg.qV, $$1 + "_inner_top"))
         .a(nv.e, a(ddg.qV, "_bottom"));
   }

   public static nu b(csu $$0) {
      return new nu().a(nv.H, c($$0));
   }

   public static nu F(dde $$0) {
      return new nu().a(nv.H, G($$0));
   }

   public static nu k(akh $$0) {
      return new nu().a(nv.H, $$0);
   }

   public static nu c(akh $$0, akh $$1) {
      return new nu().a(nv.H, $$0).a(nv.I, $$1);
   }

   public static nu a(akh $$0, akh $$1, akh $$2) {
      return new nu().a(nv.H, $$0).a(nv.I, $$1).a(nv.J, $$2);
   }

   public static akh G(dde $$0) {
      akh $$1 = ld.e.b($$0);
      return $$1.d("block/");
   }

   public static akh a(dde $$0, String $$1) {
      akh $$2 = ld.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akh c(csu $$0) {
      akh $$1 = ld.h.b($$0);
      return $$1.d("item/");
   }

   public static akh a(csu $$0, String $$1) {
      akh $$2 = ld.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
