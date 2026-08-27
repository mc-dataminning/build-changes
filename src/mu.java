import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class mu {
   private final Map<mv, ajc> a = Maps.newHashMap();
   private final Set<mv> b = Sets.newHashSet();

   public mu a(mv $$0, ajc $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public mu b(mv $$0, ajc $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<mv> a() {
      return this.b.stream();
   }

   public mu a(mv $$0, mv $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public mu b(mv $$0, mv $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ajc a(mv $$0) {
      for (mv $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ajc $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public mu c(mv $$0, ajc $$1) {
      mu $$2 = new mu();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static mu a(czf $$0) {
      ajc $$1 = G($$0);
      return b($$1);
   }

   public static mu b(czf $$0) {
      ajc $$1 = G($$0);
      return a($$1);
   }

   public static mu a(ajc $$0) {
      return new mu().a(mv.b, $$0);
   }

   public static mu b(ajc $$0) {
      return new mu().a(mv.a, $$0);
   }

   public static mu c(czf $$0) {
      return d(mv.p, G($$0));
   }

   public static mu c(ajc $$0) {
      return d(mv.p, $$0);
   }

   public static mu d(czf $$0) {
      return d(mv.q, G($$0));
   }

   public static mu d(ajc $$0) {
      return d(mv.q, $$0);
   }

   public static mu e(czf $$0) {
      return d(mv.s, G($$0));
   }

   public static mu e(ajc $$0) {
      return d(mv.s, $$0);
   }

   public static mu f(czf $$0) {
      return d(mv.t, G($$0));
   }

   public static mu g(czf $$0) {
      return new mu().a(mv.P, G($$0)).a(mv.y, a($$0, "_stem"));
   }

   public static mu f(ajc $$0) {
      return d(mv.t, $$0);
   }

   public static mu h(czf $$0) {
      return d(mv.y, G($$0));
   }

   public static mu a(czf $$0, czf $$1) {
      return new mu().a(mv.y, G($$0)).a(mv.z, G($$1));
   }

   public static mu i(czf $$0) {
      return d(mv.u, G($$0));
   }

   public static mu j(czf $$0) {
      return d(mv.x, G($$0));
   }

   public static mu g(ajc $$0) {
      return d(mv.A, $$0);
   }

   public static mu b(czf $$0, czf $$1) {
      return new mu().a(mv.v, G($$0)).a(mv.w, a($$1, "_top"));
   }

   public static mu d(mv $$0, ajc $$1) {
      return new mu().a($$0, $$1);
   }

   public static mu k(czf $$0) {
      return new mu().a(mv.i, a($$0, "_side")).a(mv.d, a($$0, "_top"));
   }

   public static mu l(czf $$0) {
      return new mu().a(mv.i, a($$0, "_side")).a(mv.f, a($$0, "_top"));
   }

   public static mu m(czf $$0) {
      return new mu().a(mv.q, a($$0, "_plant")).a(mv.i, a($$0, "_side")).a(mv.f, a($$0, "_top"));
   }

   public static mu n(czf $$0) {
      return new mu().a(mv.i, G($$0)).a(mv.d, a($$0, "_top")).a(mv.c, G($$0));
   }

   public static mu a(ajc $$0, ajc $$1) {
      return new mu().a(mv.i, $$0).a(mv.d, $$1);
   }

   public static mu o(czf $$0) {
      return new mu().a(mv.b, G($$0)).a(mv.i, a($$0, "_side")).a(mv.f, a($$0, "_top"));
   }

   public static mu p(czf $$0) {
      return new mu().a(mv.b, G($$0)).a(mv.c, a($$0, "_particle"));
   }

   public static mu q(czf $$0) {
      return new mu().a(mv.i, a($$0, "_side")).a(mv.f, a($$0, "_top")).a(mv.e, a($$0, "_bottom"));
   }

   public static mu r(czf $$0) {
      ajc $$1 = G($$0);
      return new mu().a(mv.r, $$1).a(mv.i, $$1).a(mv.f, a($$0, "_top")).a(mv.e, a($$0, "_bottom"));
   }

   public static mu s(czf $$0) {
      ajc $$1 = G($$0);
      return new mu().a(mv.b, $$1).a(mv.r, $$1).a(mv.i, $$1).a(mv.d, a($$0, "_top"));
   }

   public static mu b(ajc $$0, ajc $$1) {
      return new mu().a(mv.f, $$0).a(mv.e, $$1);
   }

   public static mu t(czf $$0) {
      return new mu().a(mv.f, a($$0, "_top")).a(mv.e, a($$0, "_bottom"));
   }

   public static mu u(czf $$0) {
      return new mu().a(mv.c, G($$0));
   }

   public static mu h(ajc $$0) {
      return new mu().a(mv.c, $$0);
   }

   public static mu v(czf $$0) {
      return new mu().a(mv.C, a($$0, "_0"));
   }

   public static mu w(czf $$0) {
      return new mu().a(mv.C, a($$0, "_1"));
   }

   public static mu x(czf $$0) {
      return new mu().a(mv.D, G($$0));
   }

   public static mu y(czf $$0) {
      return new mu().a(mv.G, G($$0));
   }

   public static mu i(ajc $$0) {
      return new mu().a(mv.G, $$0);
   }

   public static mu a(czf $$0, String $$1, String $$2) {
      return new mu().a(mv.i, a($$0, $$1)).a(mv.f, a($$0, $$2)).a(mv.e, a($$0, "_bottom"));
   }

   public static mu a(czf $$0, String $$1, String $$2, String $$3, String $$4) {
      return new mu().a(mv.g, a($$0, $$1)).a(mv.i, a($$0, $$2)).a(mv.f, a($$0, $$3)).a(mv.e, a($$0, $$4));
   }

   public static mu a(cpl $$0) {
      return new mu().a(mv.c, c($$0));
   }

   public static mu z(czf $$0) {
      return new mu().a(mv.i, a($$0, "_side")).a(mv.g, a($$0, "_front")).a(mv.h, a($$0, "_back"));
   }

   public static mu A(czf $$0) {
      return new mu().a(mv.i, a($$0, "_side")).a(mv.g, a($$0, "_front")).a(mv.f, a($$0, "_top")).a(mv.e, a($$0, "_bottom"));
   }

   public static mu B(czf $$0) {
      return new mu().a(mv.i, a($$0, "_side")).a(mv.g, a($$0, "_front")).a(mv.f, a($$0, "_top"));
   }

   public static mu C(czf $$0) {
      return new mu().a(mv.i, a($$0, "_side")).a(mv.g, a($$0, "_front")).a(mv.d, a($$0, "_end"));
   }

   public static mu D(czf $$0) {
      return new mu().a(mv.f, a($$0, "_top"));
   }

   public static mu c(czf $$0, czf $$1) {
      return new mu()
         .a(mv.c, a($$0, "_front"))
         .a(mv.o, G($$1))
         .a(mv.n, a($$0, "_top"))
         .a(mv.j, a($$0, "_front"))
         .a(mv.l, a($$0, "_side"))
         .a(mv.k, a($$0, "_side"))
         .a(mv.m, a($$0, "_front"));
   }

   public static mu d(czf $$0, czf $$1) {
      return new mu()
         .a(mv.c, a($$0, "_front"))
         .a(mv.o, G($$1))
         .a(mv.n, a($$0, "_top"))
         .a(mv.j, a($$0, "_front"))
         .a(mv.k, a($$0, "_front"))
         .a(mv.l, a($$0, "_side"))
         .a(mv.m, a($$0, "_side"));
   }

   public static mu a(String $$0) {
      return new mu()
         .a(mv.c, a(czh.mg, $$0 + "_north"))
         .a(mv.e, a(czh.mg, $$0 + "_bottom"))
         .a(mv.f, a(czh.mg, $$0 + "_top"))
         .a(mv.j, a(czh.mg, $$0 + "_north"))
         .a(mv.k, a(czh.mg, $$0 + "_south"))
         .a(mv.l, a(czh.mg, $$0 + "_east"))
         .a(mv.m, a(czh.mg, $$0 + "_west"));
   }

   public static mu E(czf $$0) {
      return new mu().a(mv.K, a($$0, "_log_lit")).a(mv.C, a($$0, "_fire"));
   }

   public static mu a(czf $$0, boolean $$1) {
      return new mu()
         .a(mv.c, a(czh.eg, "_side"))
         .a(mv.e, a(czh.eg, "_bottom"))
         .a(mv.f, a(czh.eg, "_top"))
         .a(mv.i, a(czh.eg, "_side"))
         .a(mv.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static mu j(ajc $$0) {
      return new mu()
         .a(mv.c, a(czh.ft, "_side"))
         .a(mv.i, a(czh.ft, "_side"))
         .a(mv.f, a(czh.ft, "_top"))
         .a(mv.e, a(czh.ft, "_bottom"))
         .a(mv.M, a(czh.ft, "_inner"))
         .a(mv.N, $$0);
   }

   public static mu a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new mu()
         .a(mv.c, a(czh.qV, "_bottom"))
         .a(mv.i, a(czh.qV, "_side"))
         .a(mv.f, a(czh.qV, "_top"))
         .a(mv.O, a(czh.qV, $$1 + "_inner_top"))
         .a(mv.e, a(czh.qV, "_bottom"));
   }

   public static mu b(cpl $$0) {
      return new mu().a(mv.H, c($$0));
   }

   public static mu F(czf $$0) {
      return new mu().a(mv.H, G($$0));
   }

   public static mu k(ajc $$0) {
      return new mu().a(mv.H, $$0);
   }

   public static mu c(ajc $$0, ajc $$1) {
      return new mu().a(mv.H, $$0).a(mv.I, $$1);
   }

   public static mu a(ajc $$0, ajc $$1, ajc $$2) {
      return new mu().a(mv.H, $$0).a(mv.I, $$1).a(mv.J, $$2);
   }

   public static ajc G(czf $$0) {
      ajc $$1 = kh.e.b($$0);
      return $$1.d("block/");
   }

   public static ajc a(czf $$0, String $$1) {
      ajc $$2 = kh.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ajc c(cpl $$0) {
      ajc $$1 = kh.h.b($$0);
      return $$1.d("item/");
   }

   public static ajc a(cpl $$0, String $$1) {
      ajc $$2 = kh.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
