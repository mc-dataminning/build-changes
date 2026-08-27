import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class mg {
   private final Map<mh, afw> a = Maps.newHashMap();
   private final Set<mh> b = Sets.newHashSet();

   public mg a(mh $$0, afw $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public mg b(mh $$0, afw $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<mh> a() {
      return this.b.stream();
   }

   public mg a(mh $$0, mh $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public mg b(mh $$0, mh $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public afw a(mh $$0) {
      for (mh $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         afw $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public mg c(mh $$0, afw $$1) {
      mg $$2 = new mg();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static mg a(cua $$0) {
      afw $$1 = G($$0);
      return b($$1);
   }

   public static mg b(cua $$0) {
      afw $$1 = G($$0);
      return a($$1);
   }

   public static mg a(afw $$0) {
      return new mg().a(mh.b, $$0);
   }

   public static mg b(afw $$0) {
      return new mg().a(mh.a, $$0);
   }

   public static mg c(cua $$0) {
      return d(mh.p, G($$0));
   }

   public static mg c(afw $$0) {
      return d(mh.p, $$0);
   }

   public static mg d(cua $$0) {
      return d(mh.q, G($$0));
   }

   public static mg d(afw $$0) {
      return d(mh.q, $$0);
   }

   public static mg e(cua $$0) {
      return d(mh.s, G($$0));
   }

   public static mg e(afw $$0) {
      return d(mh.s, $$0);
   }

   public static mg f(cua $$0) {
      return d(mh.t, G($$0));
   }

   public static mg g(cua $$0) {
      return new mg().a(mh.P, G($$0)).a(mh.y, a($$0, "_stem"));
   }

   public static mg f(afw $$0) {
      return d(mh.t, $$0);
   }

   public static mg h(cua $$0) {
      return d(mh.y, G($$0));
   }

   public static mg a(cua $$0, cua $$1) {
      return new mg().a(mh.y, G($$0)).a(mh.z, G($$1));
   }

   public static mg i(cua $$0) {
      return d(mh.u, G($$0));
   }

   public static mg j(cua $$0) {
      return d(mh.x, G($$0));
   }

   public static mg g(afw $$0) {
      return d(mh.A, $$0);
   }

   public static mg b(cua $$0, cua $$1) {
      return new mg().a(mh.v, G($$0)).a(mh.w, a($$1, "_top"));
   }

   public static mg d(mh $$0, afw $$1) {
      return new mg().a($$0, $$1);
   }

   public static mg k(cua $$0) {
      return new mg().a(mh.i, a($$0, "_side")).a(mh.d, a($$0, "_top"));
   }

   public static mg l(cua $$0) {
      return new mg().a(mh.i, a($$0, "_side")).a(mh.f, a($$0, "_top"));
   }

   public static mg m(cua $$0) {
      return new mg().a(mh.q, a($$0, "_plant")).a(mh.i, a($$0, "_side")).a(mh.f, a($$0, "_top"));
   }

   public static mg n(cua $$0) {
      return new mg().a(mh.i, G($$0)).a(mh.d, a($$0, "_top")).a(mh.c, G($$0));
   }

   public static mg a(afw $$0, afw $$1) {
      return new mg().a(mh.i, $$0).a(mh.d, $$1);
   }

   public static mg o(cua $$0) {
      return new mg().a(mh.b, G($$0)).a(mh.i, a($$0, "_side")).a(mh.f, a($$0, "_top"));
   }

   public static mg p(cua $$0) {
      return new mg().a(mh.b, G($$0)).a(mh.c, a($$0, "_particle"));
   }

   public static mg q(cua $$0) {
      return new mg().a(mh.i, a($$0, "_side")).a(mh.f, a($$0, "_top")).a(mh.e, a($$0, "_bottom"));
   }

   public static mg r(cua $$0) {
      afw $$1 = G($$0);
      return new mg().a(mh.r, $$1).a(mh.i, $$1).a(mh.f, a($$0, "_top")).a(mh.e, a($$0, "_bottom"));
   }

   public static mg s(cua $$0) {
      afw $$1 = G($$0);
      return new mg().a(mh.b, $$1).a(mh.r, $$1).a(mh.i, $$1).a(mh.d, a($$0, "_top"));
   }

   public static mg b(afw $$0, afw $$1) {
      return new mg().a(mh.f, $$0).a(mh.e, $$1);
   }

   public static mg t(cua $$0) {
      return new mg().a(mh.f, a($$0, "_top")).a(mh.e, a($$0, "_bottom"));
   }

   public static mg u(cua $$0) {
      return new mg().a(mh.c, G($$0));
   }

   public static mg h(afw $$0) {
      return new mg().a(mh.c, $$0);
   }

   public static mg v(cua $$0) {
      return new mg().a(mh.C, a($$0, "_0"));
   }

   public static mg w(cua $$0) {
      return new mg().a(mh.C, a($$0, "_1"));
   }

   public static mg x(cua $$0) {
      return new mg().a(mh.D, G($$0));
   }

   public static mg y(cua $$0) {
      return new mg().a(mh.G, G($$0));
   }

   public static mg i(afw $$0) {
      return new mg().a(mh.G, $$0);
   }

   public static mg a(cke $$0) {
      return new mg().a(mh.c, c($$0));
   }

   public static mg z(cua $$0) {
      return new mg().a(mh.i, a($$0, "_side")).a(mh.g, a($$0, "_front")).a(mh.h, a($$0, "_back"));
   }

   public static mg A(cua $$0) {
      return new mg().a(mh.i, a($$0, "_side")).a(mh.g, a($$0, "_front")).a(mh.f, a($$0, "_top")).a(mh.e, a($$0, "_bottom"));
   }

   public static mg B(cua $$0) {
      return new mg().a(mh.i, a($$0, "_side")).a(mh.g, a($$0, "_front")).a(mh.f, a($$0, "_top"));
   }

   public static mg C(cua $$0) {
      return new mg().a(mh.i, a($$0, "_side")).a(mh.g, a($$0, "_front")).a(mh.d, a($$0, "_end"));
   }

   public static mg D(cua $$0) {
      return new mg().a(mh.f, a($$0, "_top"));
   }

   public static mg c(cua $$0, cua $$1) {
      return new mg()
         .a(mh.c, a($$0, "_front"))
         .a(mh.o, G($$1))
         .a(mh.n, a($$0, "_top"))
         .a(mh.j, a($$0, "_front"))
         .a(mh.l, a($$0, "_side"))
         .a(mh.k, a($$0, "_side"))
         .a(mh.m, a($$0, "_front"));
   }

   public static mg d(cua $$0, cua $$1) {
      return new mg()
         .a(mh.c, a($$0, "_front"))
         .a(mh.o, G($$1))
         .a(mh.n, a($$0, "_top"))
         .a(mh.j, a($$0, "_front"))
         .a(mh.k, a($$0, "_front"))
         .a(mh.l, a($$0, "_side"))
         .a(mh.m, a($$0, "_side"));
   }

   public static mg a(String $$0) {
      return new mg()
         .a(mh.c, a(cuc.mg, $$0 + "_north"))
         .a(mh.e, a(cuc.mg, $$0 + "_bottom"))
         .a(mh.f, a(cuc.mg, $$0 + "_top"))
         .a(mh.j, a(cuc.mg, $$0 + "_north"))
         .a(mh.k, a(cuc.mg, $$0 + "_south"))
         .a(mh.l, a(cuc.mg, $$0 + "_east"))
         .a(mh.m, a(cuc.mg, $$0 + "_west"));
   }

   public static mg E(cua $$0) {
      return new mg().a(mh.K, a($$0, "_log_lit")).a(mh.C, a($$0, "_fire"));
   }

   public static mg a(cua $$0, boolean $$1) {
      return new mg()
         .a(mh.c, a(cuc.eg, "_side"))
         .a(mh.e, a(cuc.eg, "_bottom"))
         .a(mh.f, a(cuc.eg, "_top"))
         .a(mh.i, a(cuc.eg, "_side"))
         .a(mh.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static mg j(afw $$0) {
      return new mg()
         .a(mh.c, a(cuc.ft, "_side"))
         .a(mh.i, a(cuc.ft, "_side"))
         .a(mh.f, a(cuc.ft, "_top"))
         .a(mh.e, a(cuc.ft, "_bottom"))
         .a(mh.M, a(cuc.ft, "_inner"))
         .a(mh.N, $$0);
   }

   public static mg a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new mg()
         .a(mh.c, a(cuc.qI, "_bottom"))
         .a(mh.i, a(cuc.qI, "_side"))
         .a(mh.f, a(cuc.qI, "_top"))
         .a(mh.O, a(cuc.qI, $$1 + "_inner_top"))
         .a(mh.e, a(cuc.qI, "_bottom"));
   }

   public static mg b(cke $$0) {
      return new mg().a(mh.H, c($$0));
   }

   public static mg F(cua $$0) {
      return new mg().a(mh.H, G($$0));
   }

   public static mg k(afw $$0) {
      return new mg().a(mh.H, $$0);
   }

   public static mg c(afw $$0, afw $$1) {
      return new mg().a(mh.H, $$0).a(mh.I, $$1);
   }

   public static mg a(afw $$0, afw $$1, afw $$2) {
      return new mg().a(mh.H, $$0).a(mh.I, $$1).a(mh.J, $$2);
   }

   public static afw G(cua $$0) {
      afw $$1 = jy.f.b($$0);
      return $$1.d("block/");
   }

   public static afw a(cua $$0, String $$1) {
      afw $$2 = jy.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static afw c(cke $$0) {
      afw $$1 = jy.i.b($$0);
      return $$1.d("item/");
   }

   public static afw a(cke $$0, String $$1) {
      afw $$2 = jy.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
