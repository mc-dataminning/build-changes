import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class lj {
   private final Map<lk, aez> a = Maps.newHashMap();
   private final Set<lk> b = Sets.newHashSet();

   public lj a(lk $$0, aez $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public lj b(lk $$0, aez $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<lk> a() {
      return this.b.stream();
   }

   public lj a(lk $$0, lk $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public lj b(lk $$0, lk $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public aez a(lk $$0) {
      for (lk $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         aez $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public lj c(lk $$0, aez $$1) {
      lj $$2 = new lj();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static lj a(ctc $$0) {
      aez $$1 = G($$0);
      return b($$1);
   }

   public static lj b(ctc $$0) {
      aez $$1 = G($$0);
      return a($$1);
   }

   public static lj a(aez $$0) {
      return new lj().a(lk.b, $$0);
   }

   public static lj b(aez $$0) {
      return new lj().a(lk.a, $$0);
   }

   public static lj c(ctc $$0) {
      return d(lk.p, G($$0));
   }

   public static lj c(aez $$0) {
      return d(lk.p, $$0);
   }

   public static lj d(ctc $$0) {
      return d(lk.q, G($$0));
   }

   public static lj d(aez $$0) {
      return d(lk.q, $$0);
   }

   public static lj e(ctc $$0) {
      return d(lk.s, G($$0));
   }

   public static lj e(aez $$0) {
      return d(lk.s, $$0);
   }

   public static lj f(ctc $$0) {
      return d(lk.t, G($$0));
   }

   public static lj g(ctc $$0) {
      return new lj().a(lk.P, G($$0)).a(lk.y, a($$0, "_stem"));
   }

   public static lj f(aez $$0) {
      return d(lk.t, $$0);
   }

   public static lj h(ctc $$0) {
      return d(lk.y, G($$0));
   }

   public static lj a(ctc $$0, ctc $$1) {
      return new lj().a(lk.y, G($$0)).a(lk.z, G($$1));
   }

   public static lj i(ctc $$0) {
      return d(lk.u, G($$0));
   }

   public static lj j(ctc $$0) {
      return d(lk.x, G($$0));
   }

   public static lj g(aez $$0) {
      return d(lk.A, $$0);
   }

   public static lj b(ctc $$0, ctc $$1) {
      return new lj().a(lk.v, G($$0)).a(lk.w, a($$1, "_top"));
   }

   public static lj d(lk $$0, aez $$1) {
      return new lj().a($$0, $$1);
   }

   public static lj k(ctc $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.d, a($$0, "_top"));
   }

   public static lj l(ctc $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.f, a($$0, "_top"));
   }

   public static lj m(ctc $$0) {
      return new lj().a(lk.q, a($$0, "_plant")).a(lk.i, a($$0, "_side")).a(lk.f, a($$0, "_top"));
   }

   public static lj n(ctc $$0) {
      return new lj().a(lk.i, G($$0)).a(lk.d, a($$0, "_top")).a(lk.c, G($$0));
   }

   public static lj a(aez $$0, aez $$1) {
      return new lj().a(lk.i, $$0).a(lk.d, $$1);
   }

   public static lj o(ctc $$0) {
      return new lj().a(lk.b, G($$0)).a(lk.i, a($$0, "_side")).a(lk.f, a($$0, "_top"));
   }

   public static lj p(ctc $$0) {
      return new lj().a(lk.b, G($$0)).a(lk.c, a($$0, "_particle"));
   }

   public static lj q(ctc $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.f, a($$0, "_top")).a(lk.e, a($$0, "_bottom"));
   }

   public static lj r(ctc $$0) {
      aez $$1 = G($$0);
      return new lj().a(lk.r, $$1).a(lk.i, $$1).a(lk.f, a($$0, "_top")).a(lk.e, a($$0, "_bottom"));
   }

   public static lj s(ctc $$0) {
      aez $$1 = G($$0);
      return new lj().a(lk.b, $$1).a(lk.r, $$1).a(lk.i, $$1).a(lk.d, a($$0, "_top"));
   }

   public static lj b(aez $$0, aez $$1) {
      return new lj().a(lk.f, $$0).a(lk.e, $$1);
   }

   public static lj t(ctc $$0) {
      return new lj().a(lk.f, a($$0, "_top")).a(lk.e, a($$0, "_bottom"));
   }

   public static lj u(ctc $$0) {
      return new lj().a(lk.c, G($$0));
   }

   public static lj h(aez $$0) {
      return new lj().a(lk.c, $$0);
   }

   public static lj v(ctc $$0) {
      return new lj().a(lk.C, a($$0, "_0"));
   }

   public static lj w(ctc $$0) {
      return new lj().a(lk.C, a($$0, "_1"));
   }

   public static lj x(ctc $$0) {
      return new lj().a(lk.D, G($$0));
   }

   public static lj y(ctc $$0) {
      return new lj().a(lk.G, G($$0));
   }

   public static lj i(aez $$0) {
      return new lj().a(lk.G, $$0);
   }

   public static lj a(cjg $$0) {
      return new lj().a(lk.c, c($$0));
   }

   public static lj z(ctc $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.g, a($$0, "_front")).a(lk.h, a($$0, "_back"));
   }

   public static lj A(ctc $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.g, a($$0, "_front")).a(lk.f, a($$0, "_top")).a(lk.e, a($$0, "_bottom"));
   }

   public static lj B(ctc $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.g, a($$0, "_front")).a(lk.f, a($$0, "_top"));
   }

   public static lj C(ctc $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.g, a($$0, "_front")).a(lk.d, a($$0, "_end"));
   }

   public static lj D(ctc $$0) {
      return new lj().a(lk.f, a($$0, "_top"));
   }

   public static lj c(ctc $$0, ctc $$1) {
      return new lj()
         .a(lk.c, a($$0, "_front"))
         .a(lk.o, G($$1))
         .a(lk.n, a($$0, "_top"))
         .a(lk.j, a($$0, "_front"))
         .a(lk.l, a($$0, "_side"))
         .a(lk.k, a($$0, "_side"))
         .a(lk.m, a($$0, "_front"));
   }

   public static lj d(ctc $$0, ctc $$1) {
      return new lj()
         .a(lk.c, a($$0, "_front"))
         .a(lk.o, G($$1))
         .a(lk.n, a($$0, "_top"))
         .a(lk.j, a($$0, "_front"))
         .a(lk.k, a($$0, "_front"))
         .a(lk.l, a($$0, "_side"))
         .a(lk.m, a($$0, "_side"));
   }

   public static lj a(String $$0) {
      return new lj()
         .a(lk.c, a(cte.mg, $$0 + "_north"))
         .a(lk.e, a(cte.mg, $$0 + "_bottom"))
         .a(lk.f, a(cte.mg, $$0 + "_top"))
         .a(lk.j, a(cte.mg, $$0 + "_north"))
         .a(lk.k, a(cte.mg, $$0 + "_south"))
         .a(lk.l, a(cte.mg, $$0 + "_east"))
         .a(lk.m, a(cte.mg, $$0 + "_west"));
   }

   public static lj E(ctc $$0) {
      return new lj().a(lk.K, a($$0, "_log_lit")).a(lk.C, a($$0, "_fire"));
   }

   public static lj a(ctc $$0, boolean $$1) {
      return new lj()
         .a(lk.c, a(cte.eg, "_side"))
         .a(lk.e, a(cte.eg, "_bottom"))
         .a(lk.f, a(cte.eg, "_top"))
         .a(lk.i, a(cte.eg, "_side"))
         .a(lk.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static lj j(aez $$0) {
      return new lj()
         .a(lk.c, a(cte.ft, "_side"))
         .a(lk.i, a(cte.ft, "_side"))
         .a(lk.f, a(cte.ft, "_top"))
         .a(lk.e, a(cte.ft, "_bottom"))
         .a(lk.M, a(cte.ft, "_inner"))
         .a(lk.N, $$0);
   }

   public static lj a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new lj()
         .a(lk.c, a(cte.qI, "_bottom"))
         .a(lk.i, a(cte.qI, "_side"))
         .a(lk.f, a(cte.qI, "_top"))
         .a(lk.O, a(cte.qI, $$1 + "_inner_top"))
         .a(lk.e, a(cte.qI, "_bottom"));
   }

   public static lj b(cjg $$0) {
      return new lj().a(lk.H, c($$0));
   }

   public static lj F(ctc $$0) {
      return new lj().a(lk.H, G($$0));
   }

   public static lj k(aez $$0) {
      return new lj().a(lk.H, $$0);
   }

   public static lj c(aez $$0, aez $$1) {
      return new lj().a(lk.H, $$0).a(lk.I, $$1);
   }

   public static lj a(aez $$0, aez $$1, aez $$2) {
      return new lj().a(lk.H, $$0).a(lk.I, $$1).a(lk.J, $$2);
   }

   public static aez G(ctc $$0) {
      aez $$1 = jb.f.b($$0);
      return $$1.d("block/");
   }

   public static aez a(ctc $$0, String $$1) {
      aez $$2 = jb.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aez c(cjg $$0) {
      aez $$1 = jb.i.b($$0);
      return $$1.d("item/");
   }

   public static aez a(cjg $$0, String $$1) {
      aez $$2 = jb.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
