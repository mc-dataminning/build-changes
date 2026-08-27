import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class nt {
   private final Map<nu, akf> a = Maps.newHashMap();
   private final Set<nu> b = Sets.newHashSet();

   public nt a(nu $$0, akf $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public nt b(nu $$0, akf $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<nu> a() {
      return this.b.stream();
   }

   public nt a(nu $$0, nu $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public nt b(nu $$0, nu $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public akf a(nu $$0) {
      for (nu $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         akf $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public nt c(nu $$0, akf $$1) {
      nt $$2 = new nt();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static nt a(dcv $$0) {
      akf $$1 = G($$0);
      return b($$1);
   }

   public static nt b(dcv $$0) {
      akf $$1 = G($$0);
      return a($$1);
   }

   public static nt a(akf $$0) {
      return new nt().a(nu.b, $$0);
   }

   public static nt b(akf $$0) {
      return new nt().a(nu.a, $$0);
   }

   public static nt c(dcv $$0) {
      return d(nu.p, G($$0));
   }

   public static nt c(akf $$0) {
      return d(nu.p, $$0);
   }

   public static nt d(dcv $$0) {
      return d(nu.q, G($$0));
   }

   public static nt d(akf $$0) {
      return d(nu.q, $$0);
   }

   public static nt e(dcv $$0) {
      return d(nu.s, G($$0));
   }

   public static nt e(akf $$0) {
      return d(nu.s, $$0);
   }

   public static nt f(dcv $$0) {
      return d(nu.t, G($$0));
   }

   public static nt g(dcv $$0) {
      return new nt().a(nu.P, G($$0)).a(nu.y, a($$0, "_stem"));
   }

   public static nt f(akf $$0) {
      return d(nu.t, $$0);
   }

   public static nt h(dcv $$0) {
      return d(nu.y, G($$0));
   }

   public static nt a(dcv $$0, dcv $$1) {
      return new nt().a(nu.y, G($$0)).a(nu.z, G($$1));
   }

   public static nt i(dcv $$0) {
      return d(nu.u, G($$0));
   }

   public static nt j(dcv $$0) {
      return d(nu.x, G($$0));
   }

   public static nt g(akf $$0) {
      return d(nu.A, $$0);
   }

   public static nt b(dcv $$0, dcv $$1) {
      return new nt().a(nu.v, G($$0)).a(nu.w, a($$1, "_top"));
   }

   public static nt d(nu $$0, akf $$1) {
      return new nt().a($$0, $$1);
   }

   public static nt k(dcv $$0) {
      return new nt().a(nu.i, a($$0, "_side")).a(nu.d, a($$0, "_top"));
   }

   public static nt l(dcv $$0) {
      return new nt().a(nu.i, a($$0, "_side")).a(nu.f, a($$0, "_top"));
   }

   public static nt m(dcv $$0) {
      return new nt().a(nu.q, a($$0, "_plant")).a(nu.i, a($$0, "_side")).a(nu.f, a($$0, "_top"));
   }

   public static nt n(dcv $$0) {
      return new nt().a(nu.i, G($$0)).a(nu.d, a($$0, "_top")).a(nu.c, G($$0));
   }

   public static nt a(akf $$0, akf $$1) {
      return new nt().a(nu.i, $$0).a(nu.d, $$1);
   }

   public static nt o(dcv $$0) {
      return new nt().a(nu.b, G($$0)).a(nu.i, a($$0, "_side")).a(nu.f, a($$0, "_top"));
   }

   public static nt p(dcv $$0) {
      return new nt().a(nu.b, G($$0)).a(nu.c, a($$0, "_particle"));
   }

   public static nt q(dcv $$0) {
      return new nt().a(nu.i, a($$0, "_side")).a(nu.f, a($$0, "_top")).a(nu.e, a($$0, "_bottom"));
   }

   public static nt r(dcv $$0) {
      akf $$1 = G($$0);
      return new nt().a(nu.r, $$1).a(nu.i, $$1).a(nu.f, a($$0, "_top")).a(nu.e, a($$0, "_bottom"));
   }

   public static nt s(dcv $$0) {
      akf $$1 = G($$0);
      return new nt().a(nu.b, $$1).a(nu.r, $$1).a(nu.i, $$1).a(nu.d, a($$0, "_top"));
   }

   public static nt b(akf $$0, akf $$1) {
      return new nt().a(nu.f, $$0).a(nu.e, $$1);
   }

   public static nt t(dcv $$0) {
      return new nt().a(nu.f, a($$0, "_top")).a(nu.e, a($$0, "_bottom"));
   }

   public static nt u(dcv $$0) {
      return new nt().a(nu.c, G($$0));
   }

   public static nt h(akf $$0) {
      return new nt().a(nu.c, $$0);
   }

   public static nt v(dcv $$0) {
      return new nt().a(nu.C, a($$0, "_0"));
   }

   public static nt w(dcv $$0) {
      return new nt().a(nu.C, a($$0, "_1"));
   }

   public static nt x(dcv $$0) {
      return new nt().a(nu.D, G($$0));
   }

   public static nt y(dcv $$0) {
      return new nt().a(nu.G, G($$0));
   }

   public static nt i(akf $$0) {
      return new nt().a(nu.G, $$0);
   }

   public static nt a(dcv $$0, String $$1, String $$2) {
      return new nt().a(nu.i, a($$0, $$1)).a(nu.f, a($$0, $$2)).a(nu.e, a($$0, "_bottom"));
   }

   public static nt a(dcv $$0, String $$1, String $$2, String $$3, String $$4) {
      return new nt().a(nu.g, a($$0, $$1)).a(nu.i, a($$0, $$2)).a(nu.f, a($$0, $$3)).a(nu.e, a($$0, $$4));
   }

   public static nt a(cry $$0) {
      return new nt().a(nu.c, c($$0));
   }

   public static nt z(dcv $$0) {
      return new nt().a(nu.i, a($$0, "_side")).a(nu.g, a($$0, "_front")).a(nu.h, a($$0, "_back"));
   }

   public static nt A(dcv $$0) {
      return new nt().a(nu.i, a($$0, "_side")).a(nu.g, a($$0, "_front")).a(nu.f, a($$0, "_top")).a(nu.e, a($$0, "_bottom"));
   }

   public static nt B(dcv $$0) {
      return new nt().a(nu.i, a($$0, "_side")).a(nu.g, a($$0, "_front")).a(nu.f, a($$0, "_top"));
   }

   public static nt C(dcv $$0) {
      return new nt().a(nu.i, a($$0, "_side")).a(nu.g, a($$0, "_front")).a(nu.d, a($$0, "_end"));
   }

   public static nt D(dcv $$0) {
      return new nt().a(nu.f, a($$0, "_top"));
   }

   public static nt c(dcv $$0, dcv $$1) {
      return new nt()
         .a(nu.c, a($$0, "_front"))
         .a(nu.o, G($$1))
         .a(nu.n, a($$0, "_top"))
         .a(nu.j, a($$0, "_front"))
         .a(nu.l, a($$0, "_side"))
         .a(nu.k, a($$0, "_side"))
         .a(nu.m, a($$0, "_front"));
   }

   public static nt d(dcv $$0, dcv $$1) {
      return new nt()
         .a(nu.c, a($$0, "_front"))
         .a(nu.o, G($$1))
         .a(nu.n, a($$0, "_top"))
         .a(nu.j, a($$0, "_front"))
         .a(nu.k, a($$0, "_front"))
         .a(nu.l, a($$0, "_side"))
         .a(nu.m, a($$0, "_side"));
   }

   public static nt a(String $$0) {
      return new nt()
         .a(nu.c, a(dcx.mg, $$0 + "_north"))
         .a(nu.e, a(dcx.mg, $$0 + "_bottom"))
         .a(nu.f, a(dcx.mg, $$0 + "_top"))
         .a(nu.j, a(dcx.mg, $$0 + "_north"))
         .a(nu.k, a(dcx.mg, $$0 + "_south"))
         .a(nu.l, a(dcx.mg, $$0 + "_east"))
         .a(nu.m, a(dcx.mg, $$0 + "_west"));
   }

   public static nt E(dcv $$0) {
      return new nt().a(nu.K, a($$0, "_log_lit")).a(nu.C, a($$0, "_fire"));
   }

   public static nt a(dcv $$0, boolean $$1) {
      return new nt()
         .a(nu.c, a(dcx.eg, "_side"))
         .a(nu.e, a(dcx.eg, "_bottom"))
         .a(nu.f, a(dcx.eg, "_top"))
         .a(nu.i, a(dcx.eg, "_side"))
         .a(nu.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static nt j(akf $$0) {
      return new nt()
         .a(nu.c, a(dcx.ft, "_side"))
         .a(nu.i, a(dcx.ft, "_side"))
         .a(nu.f, a(dcx.ft, "_top"))
         .a(nu.e, a(dcx.ft, "_bottom"))
         .a(nu.M, a(dcx.ft, "_inner"))
         .a(nu.N, $$0);
   }

   public static nt a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new nt()
         .a(nu.c, a(dcx.qV, "_bottom"))
         .a(nu.i, a(dcx.qV, "_side"))
         .a(nu.f, a(dcx.qV, "_top"))
         .a(nu.O, a(dcx.qV, $$1 + "_inner_top"))
         .a(nu.e, a(dcx.qV, "_bottom"));
   }

   public static nt b(cry $$0) {
      return new nt().a(nu.H, c($$0));
   }

   public static nt F(dcv $$0) {
      return new nt().a(nu.H, G($$0));
   }

   public static nt k(akf $$0) {
      return new nt().a(nu.H, $$0);
   }

   public static nt c(akf $$0, akf $$1) {
      return new nt().a(nu.H, $$0).a(nu.I, $$1);
   }

   public static nt a(akf $$0, akf $$1, akf $$2) {
      return new nt().a(nu.H, $$0).a(nu.I, $$1).a(nu.J, $$2);
   }

   public static akf G(dcv $$0) {
      akf $$1 = lc.e.b($$0);
      return $$1.d("block/");
   }

   public static akf a(dcv $$0, String $$1) {
      akf $$2 = lc.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akf c(cry $$0) {
      akf $$1 = lc.h.b($$0);
      return $$1.d("item/");
   }

   public static akf a(cry $$0, String $$1) {
      akf $$2 = lc.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
