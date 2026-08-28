import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class oj {
   private final Map<ok, ale> a = Maps.newHashMap();
   private final Set<ok> b = Sets.newHashSet();

   public oj a(ok $$0, ale $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public oj b(ok $$0, ale $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<ok> a() {
      return this.b.stream();
   }

   public oj a(ok $$0, ok $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public oj b(ok $$0, ok $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ale a(ok $$0) {
      for (ok $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ale $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public oj c(ok $$0, ale $$1) {
      oj $$2 = new oj();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static oj a(dhm $$0) {
      ale $$1 = G($$0);
      return b($$1);
   }

   public static oj b(dhm $$0) {
      ale $$1 = G($$0);
      return a($$1);
   }

   public static oj a(ale $$0) {
      return new oj().a(ok.b, $$0);
   }

   public static oj b(ale $$0) {
      return new oj().a(ok.a, $$0);
   }

   public static oj c(dhm $$0) {
      return d(ok.p, G($$0));
   }

   public static oj c(ale $$0) {
      return d(ok.p, $$0);
   }

   public static oj d(dhm $$0) {
      return d(ok.q, G($$0));
   }

   public static oj d(ale $$0) {
      return d(ok.q, $$0);
   }

   public static oj e(dhm $$0) {
      return d(ok.s, G($$0));
   }

   public static oj e(ale $$0) {
      return d(ok.s, $$0);
   }

   public static oj f(dhm $$0) {
      return d(ok.t, G($$0));
   }

   public static oj g(dhm $$0) {
      return new oj().a(ok.P, G($$0)).a(ok.y, a($$0, "_stem"));
   }

   public static oj f(ale $$0) {
      return d(ok.t, $$0);
   }

   public static oj h(dhm $$0) {
      return d(ok.y, G($$0));
   }

   public static oj a(dhm $$0, dhm $$1) {
      return new oj().a(ok.y, G($$0)).a(ok.z, G($$1));
   }

   public static oj i(dhm $$0) {
      return d(ok.u, G($$0));
   }

   public static oj j(dhm $$0) {
      return d(ok.x, G($$0));
   }

   public static oj g(ale $$0) {
      return d(ok.A, $$0);
   }

   public static oj b(dhm $$0, dhm $$1) {
      return new oj().a(ok.v, G($$0)).a(ok.w, a($$1, "_top"));
   }

   public static oj d(ok $$0, ale $$1) {
      return new oj().a($$0, $$1);
   }

   public static oj k(dhm $$0) {
      return new oj().a(ok.i, a($$0, "_side")).a(ok.d, a($$0, "_top"));
   }

   public static oj l(dhm $$0) {
      return new oj().a(ok.i, a($$0, "_side")).a(ok.f, a($$0, "_top"));
   }

   public static oj m(dhm $$0) {
      return new oj().a(ok.q, a($$0, "_plant")).a(ok.i, a($$0, "_side")).a(ok.f, a($$0, "_top"));
   }

   public static oj n(dhm $$0) {
      return new oj().a(ok.i, G($$0)).a(ok.d, a($$0, "_top")).a(ok.c, G($$0));
   }

   public static oj a(ale $$0, ale $$1) {
      return new oj().a(ok.i, $$0).a(ok.d, $$1);
   }

   public static oj o(dhm $$0) {
      return new oj().a(ok.b, G($$0)).a(ok.i, a($$0, "_side")).a(ok.f, a($$0, "_top"));
   }

   public static oj p(dhm $$0) {
      return new oj().a(ok.b, G($$0)).a(ok.c, a($$0, "_particle"));
   }

   public static oj q(dhm $$0) {
      return new oj().a(ok.i, a($$0, "_side")).a(ok.f, a($$0, "_top")).a(ok.e, a($$0, "_bottom"));
   }

   public static oj r(dhm $$0) {
      ale $$1 = G($$0);
      return new oj().a(ok.r, $$1).a(ok.i, $$1).a(ok.f, a($$0, "_top")).a(ok.e, a($$0, "_bottom"));
   }

   public static oj s(dhm $$0) {
      ale $$1 = G($$0);
      return new oj().a(ok.b, $$1).a(ok.r, $$1).a(ok.i, $$1).a(ok.d, a($$0, "_top"));
   }

   public static oj b(ale $$0, ale $$1) {
      return new oj().a(ok.f, $$0).a(ok.e, $$1);
   }

   public static oj t(dhm $$0) {
      return new oj().a(ok.f, a($$0, "_top")).a(ok.e, a($$0, "_bottom"));
   }

   public static oj u(dhm $$0) {
      return new oj().a(ok.c, G($$0));
   }

   public static oj h(ale $$0) {
      return new oj().a(ok.c, $$0);
   }

   public static oj v(dhm $$0) {
      return new oj().a(ok.C, a($$0, "_0"));
   }

   public static oj w(dhm $$0) {
      return new oj().a(ok.C, a($$0, "_1"));
   }

   public static oj x(dhm $$0) {
      return new oj().a(ok.D, G($$0));
   }

   public static oj y(dhm $$0) {
      return new oj().a(ok.G, G($$0));
   }

   public static oj i(ale $$0) {
      return new oj().a(ok.G, $$0);
   }

   public static oj a(dhm $$0, String $$1, String $$2) {
      return new oj().a(ok.i, a($$0, $$1)).a(ok.f, a($$0, $$2)).a(ok.e, a($$0, "_bottom"));
   }

   public static oj a(dhm $$0, String $$1, String $$2, String $$3, String $$4) {
      return new oj().a(ok.g, a($$0, $$1)).a(ok.i, a($$0, $$2)).a(ok.f, a($$0, $$3)).a(ok.e, a($$0, $$4));
   }

   public static oj a(cvn $$0) {
      return new oj().a(ok.c, c($$0));
   }

   public static oj z(dhm $$0) {
      return new oj().a(ok.i, a($$0, "_side")).a(ok.g, a($$0, "_front")).a(ok.h, a($$0, "_back"));
   }

   public static oj A(dhm $$0) {
      return new oj().a(ok.i, a($$0, "_side")).a(ok.g, a($$0, "_front")).a(ok.f, a($$0, "_top")).a(ok.e, a($$0, "_bottom"));
   }

   public static oj B(dhm $$0) {
      return new oj().a(ok.i, a($$0, "_side")).a(ok.g, a($$0, "_front")).a(ok.f, a($$0, "_top"));
   }

   public static oj C(dhm $$0) {
      return new oj().a(ok.i, a($$0, "_side")).a(ok.g, a($$0, "_front")).a(ok.d, a($$0, "_end"));
   }

   public static oj D(dhm $$0) {
      return new oj().a(ok.f, a($$0, "_top"));
   }

   public static oj c(dhm $$0, dhm $$1) {
      return new oj()
         .a(ok.c, a($$0, "_front"))
         .a(ok.o, G($$1))
         .a(ok.n, a($$0, "_top"))
         .a(ok.j, a($$0, "_front"))
         .a(ok.l, a($$0, "_side"))
         .a(ok.k, a($$0, "_side"))
         .a(ok.m, a($$0, "_front"));
   }

   public static oj d(dhm $$0, dhm $$1) {
      return new oj()
         .a(ok.c, a($$0, "_front"))
         .a(ok.o, G($$1))
         .a(ok.n, a($$0, "_top"))
         .a(ok.j, a($$0, "_front"))
         .a(ok.k, a($$0, "_front"))
         .a(ok.l, a($$0, "_side"))
         .a(ok.m, a($$0, "_side"));
   }

   public static oj a(String $$0) {
      return new oj()
         .a(ok.c, a(dho.mg, $$0 + "_north"))
         .a(ok.e, a(dho.mg, $$0 + "_bottom"))
         .a(ok.f, a(dho.mg, $$0 + "_top"))
         .a(ok.j, a(dho.mg, $$0 + "_north"))
         .a(ok.k, a(dho.mg, $$0 + "_south"))
         .a(ok.l, a(dho.mg, $$0 + "_east"))
         .a(ok.m, a(dho.mg, $$0 + "_west"));
   }

   public static oj E(dhm $$0) {
      return new oj().a(ok.K, a($$0, "_log_lit")).a(ok.C, a($$0, "_fire"));
   }

   public static oj a(dhm $$0, boolean $$1) {
      return new oj()
         .a(ok.c, a(dho.eg, "_side"))
         .a(ok.e, a(dho.eg, "_bottom"))
         .a(ok.f, a(dho.eg, "_top"))
         .a(ok.i, a(dho.eg, "_side"))
         .a(ok.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static oj j(ale $$0) {
      return new oj()
         .a(ok.c, a(dho.ft, "_side"))
         .a(ok.i, a(dho.ft, "_side"))
         .a(ok.f, a(dho.ft, "_top"))
         .a(ok.e, a(dho.ft, "_bottom"))
         .a(ok.M, a(dho.ft, "_inner"))
         .a(ok.N, $$0);
   }

   public static oj a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new oj()
         .a(ok.c, a(dho.qV, "_bottom"))
         .a(ok.i, a(dho.qV, "_side"))
         .a(ok.f, a(dho.qV, "_top"))
         .a(ok.O, a(dho.qV, $$1 + "_inner_top"))
         .a(ok.e, a(dho.qV, "_bottom"));
   }

   public static oj b(cvn $$0) {
      return new oj().a(ok.H, c($$0));
   }

   public static oj F(dhm $$0) {
      return new oj().a(ok.H, G($$0));
   }

   public static oj k(ale $$0) {
      return new oj().a(ok.H, $$0);
   }

   public static oj c(ale $$0, ale $$1) {
      return new oj().a(ok.H, $$0).a(ok.I, $$1);
   }

   public static oj a(ale $$0, ale $$1, ale $$2) {
      return new oj().a(ok.H, $$0).a(ok.I, $$1).a(ok.J, $$2);
   }

   public static ale G(dhm $$0) {
      ale $$1 = lv.e.b($$0);
      return $$1.f("block/");
   }

   public static ale a(dhm $$0, String $$1) {
      ale $$2 = lv.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ale c(cvn $$0) {
      ale $$1 = lv.g.b($$0);
      return $$1.f("item/");
   }

   public static ale a(cvn $$0, String $$1) {
      ale $$2 = lv.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
