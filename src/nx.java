import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class nx {
   private final Map<ny, akn> a = Maps.newHashMap();
   private final Set<ny> b = Sets.newHashSet();

   public nx a(ny $$0, akn $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public nx b(ny $$0, akn $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<ny> a() {
      return this.b.stream();
   }

   public nx a(ny $$0, ny $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public nx b(ny $$0, ny $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public akn a(ny $$0) {
      for (ny $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         akn $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public nx c(ny $$0, akn $$1) {
      nx $$2 = new nx();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static nx a(dea $$0) {
      akn $$1 = G($$0);
      return b($$1);
   }

   public static nx b(dea $$0) {
      akn $$1 = G($$0);
      return a($$1);
   }

   public static nx a(akn $$0) {
      return new nx().a(ny.b, $$0);
   }

   public static nx b(akn $$0) {
      return new nx().a(ny.a, $$0);
   }

   public static nx c(dea $$0) {
      return d(ny.p, G($$0));
   }

   public static nx c(akn $$0) {
      return d(ny.p, $$0);
   }

   public static nx d(dea $$0) {
      return d(ny.q, G($$0));
   }

   public static nx d(akn $$0) {
      return d(ny.q, $$0);
   }

   public static nx e(dea $$0) {
      return d(ny.s, G($$0));
   }

   public static nx e(akn $$0) {
      return d(ny.s, $$0);
   }

   public static nx f(dea $$0) {
      return d(ny.t, G($$0));
   }

   public static nx g(dea $$0) {
      return new nx().a(ny.P, G($$0)).a(ny.y, a($$0, "_stem"));
   }

   public static nx f(akn $$0) {
      return d(ny.t, $$0);
   }

   public static nx h(dea $$0) {
      return d(ny.y, G($$0));
   }

   public static nx a(dea $$0, dea $$1) {
      return new nx().a(ny.y, G($$0)).a(ny.z, G($$1));
   }

   public static nx i(dea $$0) {
      return d(ny.u, G($$0));
   }

   public static nx j(dea $$0) {
      return d(ny.x, G($$0));
   }

   public static nx g(akn $$0) {
      return d(ny.A, $$0);
   }

   public static nx b(dea $$0, dea $$1) {
      return new nx().a(ny.v, G($$0)).a(ny.w, a($$1, "_top"));
   }

   public static nx d(ny $$0, akn $$1) {
      return new nx().a($$0, $$1);
   }

   public static nx k(dea $$0) {
      return new nx().a(ny.i, a($$0, "_side")).a(ny.d, a($$0, "_top"));
   }

   public static nx l(dea $$0) {
      return new nx().a(ny.i, a($$0, "_side")).a(ny.f, a($$0, "_top"));
   }

   public static nx m(dea $$0) {
      return new nx().a(ny.q, a($$0, "_plant")).a(ny.i, a($$0, "_side")).a(ny.f, a($$0, "_top"));
   }

   public static nx n(dea $$0) {
      return new nx().a(ny.i, G($$0)).a(ny.d, a($$0, "_top")).a(ny.c, G($$0));
   }

   public static nx a(akn $$0, akn $$1) {
      return new nx().a(ny.i, $$0).a(ny.d, $$1);
   }

   public static nx o(dea $$0) {
      return new nx().a(ny.b, G($$0)).a(ny.i, a($$0, "_side")).a(ny.f, a($$0, "_top"));
   }

   public static nx p(dea $$0) {
      return new nx().a(ny.b, G($$0)).a(ny.c, a($$0, "_particle"));
   }

   public static nx q(dea $$0) {
      return new nx().a(ny.i, a($$0, "_side")).a(ny.f, a($$0, "_top")).a(ny.e, a($$0, "_bottom"));
   }

   public static nx r(dea $$0) {
      akn $$1 = G($$0);
      return new nx().a(ny.r, $$1).a(ny.i, $$1).a(ny.f, a($$0, "_top")).a(ny.e, a($$0, "_bottom"));
   }

   public static nx s(dea $$0) {
      akn $$1 = G($$0);
      return new nx().a(ny.b, $$1).a(ny.r, $$1).a(ny.i, $$1).a(ny.d, a($$0, "_top"));
   }

   public static nx b(akn $$0, akn $$1) {
      return new nx().a(ny.f, $$0).a(ny.e, $$1);
   }

   public static nx t(dea $$0) {
      return new nx().a(ny.f, a($$0, "_top")).a(ny.e, a($$0, "_bottom"));
   }

   public static nx u(dea $$0) {
      return new nx().a(ny.c, G($$0));
   }

   public static nx h(akn $$0) {
      return new nx().a(ny.c, $$0);
   }

   public static nx v(dea $$0) {
      return new nx().a(ny.C, a($$0, "_0"));
   }

   public static nx w(dea $$0) {
      return new nx().a(ny.C, a($$0, "_1"));
   }

   public static nx x(dea $$0) {
      return new nx().a(ny.D, G($$0));
   }

   public static nx y(dea $$0) {
      return new nx().a(ny.G, G($$0));
   }

   public static nx i(akn $$0) {
      return new nx().a(ny.G, $$0);
   }

   public static nx a(dea $$0, String $$1, String $$2) {
      return new nx().a(ny.i, a($$0, $$1)).a(ny.f, a($$0, $$2)).a(ny.e, a($$0, "_bottom"));
   }

   public static nx a(dea $$0, String $$1, String $$2, String $$3, String $$4) {
      return new nx().a(ny.g, a($$0, $$1)).a(ny.i, a($$0, $$2)).a(ny.f, a($$0, $$3)).a(ny.e, a($$0, $$4));
   }

   public static nx a(ctl $$0) {
      return new nx().a(ny.c, c($$0));
   }

   public static nx z(dea $$0) {
      return new nx().a(ny.i, a($$0, "_side")).a(ny.g, a($$0, "_front")).a(ny.h, a($$0, "_back"));
   }

   public static nx A(dea $$0) {
      return new nx().a(ny.i, a($$0, "_side")).a(ny.g, a($$0, "_front")).a(ny.f, a($$0, "_top")).a(ny.e, a($$0, "_bottom"));
   }

   public static nx B(dea $$0) {
      return new nx().a(ny.i, a($$0, "_side")).a(ny.g, a($$0, "_front")).a(ny.f, a($$0, "_top"));
   }

   public static nx C(dea $$0) {
      return new nx().a(ny.i, a($$0, "_side")).a(ny.g, a($$0, "_front")).a(ny.d, a($$0, "_end"));
   }

   public static nx D(dea $$0) {
      return new nx().a(ny.f, a($$0, "_top"));
   }

   public static nx c(dea $$0, dea $$1) {
      return new nx()
         .a(ny.c, a($$0, "_front"))
         .a(ny.o, G($$1))
         .a(ny.n, a($$0, "_top"))
         .a(ny.j, a($$0, "_front"))
         .a(ny.l, a($$0, "_side"))
         .a(ny.k, a($$0, "_side"))
         .a(ny.m, a($$0, "_front"));
   }

   public static nx d(dea $$0, dea $$1) {
      return new nx()
         .a(ny.c, a($$0, "_front"))
         .a(ny.o, G($$1))
         .a(ny.n, a($$0, "_top"))
         .a(ny.j, a($$0, "_front"))
         .a(ny.k, a($$0, "_front"))
         .a(ny.l, a($$0, "_side"))
         .a(ny.m, a($$0, "_side"));
   }

   public static nx a(String $$0) {
      return new nx()
         .a(ny.c, a(dec.mg, $$0 + "_north"))
         .a(ny.e, a(dec.mg, $$0 + "_bottom"))
         .a(ny.f, a(dec.mg, $$0 + "_top"))
         .a(ny.j, a(dec.mg, $$0 + "_north"))
         .a(ny.k, a(dec.mg, $$0 + "_south"))
         .a(ny.l, a(dec.mg, $$0 + "_east"))
         .a(ny.m, a(dec.mg, $$0 + "_west"));
   }

   public static nx E(dea $$0) {
      return new nx().a(ny.K, a($$0, "_log_lit")).a(ny.C, a($$0, "_fire"));
   }

   public static nx a(dea $$0, boolean $$1) {
      return new nx()
         .a(ny.c, a(dec.eg, "_side"))
         .a(ny.e, a(dec.eg, "_bottom"))
         .a(ny.f, a(dec.eg, "_top"))
         .a(ny.i, a(dec.eg, "_side"))
         .a(ny.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static nx j(akn $$0) {
      return new nx()
         .a(ny.c, a(dec.ft, "_side"))
         .a(ny.i, a(dec.ft, "_side"))
         .a(ny.f, a(dec.ft, "_top"))
         .a(ny.e, a(dec.ft, "_bottom"))
         .a(ny.M, a(dec.ft, "_inner"))
         .a(ny.N, $$0);
   }

   public static nx a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new nx()
         .a(ny.c, a(dec.qV, "_bottom"))
         .a(ny.i, a(dec.qV, "_side"))
         .a(ny.f, a(dec.qV, "_top"))
         .a(ny.O, a(dec.qV, $$1 + "_inner_top"))
         .a(ny.e, a(dec.qV, "_bottom"));
   }

   public static nx b(ctl $$0) {
      return new nx().a(ny.H, c($$0));
   }

   public static nx F(dea $$0) {
      return new nx().a(ny.H, G($$0));
   }

   public static nx k(akn $$0) {
      return new nx().a(ny.H, $$0);
   }

   public static nx c(akn $$0, akn $$1) {
      return new nx().a(ny.H, $$0).a(ny.I, $$1);
   }

   public static nx a(akn $$0, akn $$1, akn $$2) {
      return new nx().a(ny.H, $$0).a(ny.I, $$1).a(ny.J, $$2);
   }

   public static akn G(dea $$0) {
      akn $$1 = le.e.b($$0);
      return $$1.d("block/");
   }

   public static akn a(dea $$0, String $$1) {
      akn $$2 = le.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akn c(ctl $$0) {
      akn $$1 = le.h.b($$0);
      return $$1.d("item/");
   }

   public static akn a(ctl $$0, String $$1) {
      akn $$2 = le.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
