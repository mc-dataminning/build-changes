import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class nk {
   private final Map<nl, ajv> a = Maps.newHashMap();
   private final Set<nl> b = Sets.newHashSet();

   public nk a(nl $$0, ajv $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public nk b(nl $$0, ajv $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<nl> a() {
      return this.b.stream();
   }

   public nk a(nl $$0, nl $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public nk b(nl $$0, nl $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ajv a(nl $$0) {
      for (nl $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ajv $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public nk c(nl $$0, ajv $$1) {
      nk $$2 = new nk();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static nk a(dch $$0) {
      ajv $$1 = G($$0);
      return b($$1);
   }

   public static nk b(dch $$0) {
      ajv $$1 = G($$0);
      return a($$1);
   }

   public static nk a(ajv $$0) {
      return new nk().a(nl.b, $$0);
   }

   public static nk b(ajv $$0) {
      return new nk().a(nl.a, $$0);
   }

   public static nk c(dch $$0) {
      return d(nl.p, G($$0));
   }

   public static nk c(ajv $$0) {
      return d(nl.p, $$0);
   }

   public static nk d(dch $$0) {
      return d(nl.q, G($$0));
   }

   public static nk d(ajv $$0) {
      return d(nl.q, $$0);
   }

   public static nk e(dch $$0) {
      return d(nl.s, G($$0));
   }

   public static nk e(ajv $$0) {
      return d(nl.s, $$0);
   }

   public static nk f(dch $$0) {
      return d(nl.t, G($$0));
   }

   public static nk g(dch $$0) {
      return new nk().a(nl.P, G($$0)).a(nl.y, a($$0, "_stem"));
   }

   public static nk f(ajv $$0) {
      return d(nl.t, $$0);
   }

   public static nk h(dch $$0) {
      return d(nl.y, G($$0));
   }

   public static nk a(dch $$0, dch $$1) {
      return new nk().a(nl.y, G($$0)).a(nl.z, G($$1));
   }

   public static nk i(dch $$0) {
      return d(nl.u, G($$0));
   }

   public static nk j(dch $$0) {
      return d(nl.x, G($$0));
   }

   public static nk g(ajv $$0) {
      return d(nl.A, $$0);
   }

   public static nk b(dch $$0, dch $$1) {
      return new nk().a(nl.v, G($$0)).a(nl.w, a($$1, "_top"));
   }

   public static nk d(nl $$0, ajv $$1) {
      return new nk().a($$0, $$1);
   }

   public static nk k(dch $$0) {
      return new nk().a(nl.i, a($$0, "_side")).a(nl.d, a($$0, "_top"));
   }

   public static nk l(dch $$0) {
      return new nk().a(nl.i, a($$0, "_side")).a(nl.f, a($$0, "_top"));
   }

   public static nk m(dch $$0) {
      return new nk().a(nl.q, a($$0, "_plant")).a(nl.i, a($$0, "_side")).a(nl.f, a($$0, "_top"));
   }

   public static nk n(dch $$0) {
      return new nk().a(nl.i, G($$0)).a(nl.d, a($$0, "_top")).a(nl.c, G($$0));
   }

   public static nk a(ajv $$0, ajv $$1) {
      return new nk().a(nl.i, $$0).a(nl.d, $$1);
   }

   public static nk o(dch $$0) {
      return new nk().a(nl.b, G($$0)).a(nl.i, a($$0, "_side")).a(nl.f, a($$0, "_top"));
   }

   public static nk p(dch $$0) {
      return new nk().a(nl.b, G($$0)).a(nl.c, a($$0, "_particle"));
   }

   public static nk q(dch $$0) {
      return new nk().a(nl.i, a($$0, "_side")).a(nl.f, a($$0, "_top")).a(nl.e, a($$0, "_bottom"));
   }

   public static nk r(dch $$0) {
      ajv $$1 = G($$0);
      return new nk().a(nl.r, $$1).a(nl.i, $$1).a(nl.f, a($$0, "_top")).a(nl.e, a($$0, "_bottom"));
   }

   public static nk s(dch $$0) {
      ajv $$1 = G($$0);
      return new nk().a(nl.b, $$1).a(nl.r, $$1).a(nl.i, $$1).a(nl.d, a($$0, "_top"));
   }

   public static nk b(ajv $$0, ajv $$1) {
      return new nk().a(nl.f, $$0).a(nl.e, $$1);
   }

   public static nk t(dch $$0) {
      return new nk().a(nl.f, a($$0, "_top")).a(nl.e, a($$0, "_bottom"));
   }

   public static nk u(dch $$0) {
      return new nk().a(nl.c, G($$0));
   }

   public static nk h(ajv $$0) {
      return new nk().a(nl.c, $$0);
   }

   public static nk v(dch $$0) {
      return new nk().a(nl.C, a($$0, "_0"));
   }

   public static nk w(dch $$0) {
      return new nk().a(nl.C, a($$0, "_1"));
   }

   public static nk x(dch $$0) {
      return new nk().a(nl.D, G($$0));
   }

   public static nk y(dch $$0) {
      return new nk().a(nl.G, G($$0));
   }

   public static nk i(ajv $$0) {
      return new nk().a(nl.G, $$0);
   }

   public static nk a(dch $$0, String $$1, String $$2) {
      return new nk().a(nl.i, a($$0, $$1)).a(nl.f, a($$0, $$2)).a(nl.e, a($$0, "_bottom"));
   }

   public static nk a(dch $$0, String $$1, String $$2, String $$3, String $$4) {
      return new nk().a(nl.g, a($$0, $$1)).a(nl.i, a($$0, $$2)).a(nl.f, a($$0, $$3)).a(nl.e, a($$0, $$4));
   }

   public static nk a(crn $$0) {
      return new nk().a(nl.c, c($$0));
   }

   public static nk z(dch $$0) {
      return new nk().a(nl.i, a($$0, "_side")).a(nl.g, a($$0, "_front")).a(nl.h, a($$0, "_back"));
   }

   public static nk A(dch $$0) {
      return new nk().a(nl.i, a($$0, "_side")).a(nl.g, a($$0, "_front")).a(nl.f, a($$0, "_top")).a(nl.e, a($$0, "_bottom"));
   }

   public static nk B(dch $$0) {
      return new nk().a(nl.i, a($$0, "_side")).a(nl.g, a($$0, "_front")).a(nl.f, a($$0, "_top"));
   }

   public static nk C(dch $$0) {
      return new nk().a(nl.i, a($$0, "_side")).a(nl.g, a($$0, "_front")).a(nl.d, a($$0, "_end"));
   }

   public static nk D(dch $$0) {
      return new nk().a(nl.f, a($$0, "_top"));
   }

   public static nk c(dch $$0, dch $$1) {
      return new nk()
         .a(nl.c, a($$0, "_front"))
         .a(nl.o, G($$1))
         .a(nl.n, a($$0, "_top"))
         .a(nl.j, a($$0, "_front"))
         .a(nl.l, a($$0, "_side"))
         .a(nl.k, a($$0, "_side"))
         .a(nl.m, a($$0, "_front"));
   }

   public static nk d(dch $$0, dch $$1) {
      return new nk()
         .a(nl.c, a($$0, "_front"))
         .a(nl.o, G($$1))
         .a(nl.n, a($$0, "_top"))
         .a(nl.j, a($$0, "_front"))
         .a(nl.k, a($$0, "_front"))
         .a(nl.l, a($$0, "_side"))
         .a(nl.m, a($$0, "_side"));
   }

   public static nk a(String $$0) {
      return new nk()
         .a(nl.c, a(dcj.mg, $$0 + "_north"))
         .a(nl.e, a(dcj.mg, $$0 + "_bottom"))
         .a(nl.f, a(dcj.mg, $$0 + "_top"))
         .a(nl.j, a(dcj.mg, $$0 + "_north"))
         .a(nl.k, a(dcj.mg, $$0 + "_south"))
         .a(nl.l, a(dcj.mg, $$0 + "_east"))
         .a(nl.m, a(dcj.mg, $$0 + "_west"));
   }

   public static nk E(dch $$0) {
      return new nk().a(nl.K, a($$0, "_log_lit")).a(nl.C, a($$0, "_fire"));
   }

   public static nk a(dch $$0, boolean $$1) {
      return new nk()
         .a(nl.c, a(dcj.eg, "_side"))
         .a(nl.e, a(dcj.eg, "_bottom"))
         .a(nl.f, a(dcj.eg, "_top"))
         .a(nl.i, a(dcj.eg, "_side"))
         .a(nl.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static nk j(ajv $$0) {
      return new nk()
         .a(nl.c, a(dcj.ft, "_side"))
         .a(nl.i, a(dcj.ft, "_side"))
         .a(nl.f, a(dcj.ft, "_top"))
         .a(nl.e, a(dcj.ft, "_bottom"))
         .a(nl.M, a(dcj.ft, "_inner"))
         .a(nl.N, $$0);
   }

   public static nk a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new nk()
         .a(nl.c, a(dcj.qV, "_bottom"))
         .a(nl.i, a(dcj.qV, "_side"))
         .a(nl.f, a(dcj.qV, "_top"))
         .a(nl.O, a(dcj.qV, $$1 + "_inner_top"))
         .a(nl.e, a(dcj.qV, "_bottom"));
   }

   public static nk b(crn $$0) {
      return new nk().a(nl.H, c($$0));
   }

   public static nk F(dch $$0) {
      return new nk().a(nl.H, G($$0));
   }

   public static nk k(ajv $$0) {
      return new nk().a(nl.H, $$0);
   }

   public static nk c(ajv $$0, ajv $$1) {
      return new nk().a(nl.H, $$0).a(nl.I, $$1);
   }

   public static nk a(ajv $$0, ajv $$1, ajv $$2) {
      return new nk().a(nl.H, $$0).a(nl.I, $$1).a(nl.J, $$2);
   }

   public static ajv G(dch $$0) {
      ajv $$1 = kt.e.b($$0);
      return $$1.d("block/");
   }

   public static ajv a(dch $$0, String $$1) {
      ajv $$2 = kt.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ajv c(crn $$0) {
      ajv $$1 = kt.h.b($$0);
      return $$1.d("item/");
   }

   public static ajv a(crn $$0, String $$1) {
      ajv $$2 = kt.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
