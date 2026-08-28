import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class om {
   private final Map<on, alh> a = Maps.newHashMap();
   private final Set<on> b = Sets.newHashSet();

   public om a(on $$0, alh $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public om b(on $$0, alh $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<on> a() {
      return this.b.stream();
   }

   public om a(on $$0, on $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public om b(on $$0, on $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alh a(on $$0) {
      for (on $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alh $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public om c(on $$0, alh $$1) {
      om $$2 = new om();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static om a(dhy $$0) {
      alh $$1 = G($$0);
      return b($$1);
   }

   public static om b(dhy $$0) {
      alh $$1 = G($$0);
      return a($$1);
   }

   public static om a(alh $$0) {
      return new om().a(on.b, $$0);
   }

   public static om b(alh $$0) {
      return new om().a(on.a, $$0);
   }

   public static om c(dhy $$0) {
      return d(on.p, G($$0));
   }

   public static om c(alh $$0) {
      return d(on.p, $$0);
   }

   public static om d(dhy $$0) {
      return d(on.q, G($$0));
   }

   public static om d(alh $$0) {
      return d(on.q, $$0);
   }

   public static om e(dhy $$0) {
      return d(on.s, G($$0));
   }

   public static om e(alh $$0) {
      return d(on.s, $$0);
   }

   public static om f(dhy $$0) {
      return d(on.t, G($$0));
   }

   public static om g(dhy $$0) {
      return new om().a(on.P, G($$0)).a(on.y, a($$0, "_stem"));
   }

   public static om f(alh $$0) {
      return d(on.t, $$0);
   }

   public static om h(dhy $$0) {
      return d(on.y, G($$0));
   }

   public static om a(dhy $$0, dhy $$1) {
      return new om().a(on.y, G($$0)).a(on.z, G($$1));
   }

   public static om i(dhy $$0) {
      return d(on.u, G($$0));
   }

   public static om j(dhy $$0) {
      return d(on.x, G($$0));
   }

   public static om g(alh $$0) {
      return d(on.A, $$0);
   }

   public static om b(dhy $$0, dhy $$1) {
      return new om().a(on.v, G($$0)).a(on.w, a($$1, "_top"));
   }

   public static om d(on $$0, alh $$1) {
      return new om().a($$0, $$1);
   }

   public static om k(dhy $$0) {
      return new om().a(on.i, a($$0, "_side")).a(on.d, a($$0, "_top"));
   }

   public static om l(dhy $$0) {
      return new om().a(on.i, a($$0, "_side")).a(on.f, a($$0, "_top"));
   }

   public static om m(dhy $$0) {
      return new om().a(on.q, a($$0, "_plant")).a(on.i, a($$0, "_side")).a(on.f, a($$0, "_top"));
   }

   public static om n(dhy $$0) {
      return new om().a(on.i, G($$0)).a(on.d, a($$0, "_top")).a(on.c, G($$0));
   }

   public static om a(alh $$0, alh $$1) {
      return new om().a(on.i, $$0).a(on.d, $$1);
   }

   public static om o(dhy $$0) {
      return new om().a(on.b, G($$0)).a(on.i, a($$0, "_side")).a(on.f, a($$0, "_top"));
   }

   public static om p(dhy $$0) {
      return new om().a(on.b, G($$0)).a(on.c, a($$0, "_particle"));
   }

   public static om q(dhy $$0) {
      return new om().a(on.i, a($$0, "_side")).a(on.f, a($$0, "_top")).a(on.e, a($$0, "_bottom"));
   }

   public static om r(dhy $$0) {
      alh $$1 = G($$0);
      return new om().a(on.r, $$1).a(on.i, $$1).a(on.f, a($$0, "_top")).a(on.e, a($$0, "_bottom"));
   }

   public static om s(dhy $$0) {
      alh $$1 = G($$0);
      return new om().a(on.b, $$1).a(on.r, $$1).a(on.i, $$1).a(on.d, a($$0, "_top"));
   }

   public static om b(alh $$0, alh $$1) {
      return new om().a(on.f, $$0).a(on.e, $$1);
   }

   public static om t(dhy $$0) {
      return new om().a(on.f, a($$0, "_top")).a(on.e, a($$0, "_bottom"));
   }

   public static om u(dhy $$0) {
      return new om().a(on.c, G($$0));
   }

   public static om h(alh $$0) {
      return new om().a(on.c, $$0);
   }

   public static om v(dhy $$0) {
      return new om().a(on.C, a($$0, "_0"));
   }

   public static om w(dhy $$0) {
      return new om().a(on.C, a($$0, "_1"));
   }

   public static om x(dhy $$0) {
      return new om().a(on.D, G($$0));
   }

   public static om y(dhy $$0) {
      return new om().a(on.G, G($$0));
   }

   public static om i(alh $$0) {
      return new om().a(on.G, $$0);
   }

   public static om a(dhy $$0, String $$1, String $$2) {
      return new om().a(on.i, a($$0, $$1)).a(on.f, a($$0, $$2)).a(on.e, a($$0, "_bottom"));
   }

   public static om a(dhy $$0, String $$1, String $$2, String $$3, String $$4) {
      return new om().a(on.g, a($$0, $$1)).a(on.i, a($$0, $$2)).a(on.f, a($$0, $$3)).a(on.e, a($$0, $$4));
   }

   public static om a(cvt $$0) {
      return new om().a(on.c, c($$0));
   }

   public static om z(dhy $$0) {
      return new om().a(on.i, a($$0, "_side")).a(on.g, a($$0, "_front")).a(on.h, a($$0, "_back"));
   }

   public static om A(dhy $$0) {
      return new om().a(on.i, a($$0, "_side")).a(on.g, a($$0, "_front")).a(on.f, a($$0, "_top")).a(on.e, a($$0, "_bottom"));
   }

   public static om B(dhy $$0) {
      return new om().a(on.i, a($$0, "_side")).a(on.g, a($$0, "_front")).a(on.f, a($$0, "_top"));
   }

   public static om C(dhy $$0) {
      return new om().a(on.i, a($$0, "_side")).a(on.g, a($$0, "_front")).a(on.d, a($$0, "_end"));
   }

   public static om D(dhy $$0) {
      return new om().a(on.f, a($$0, "_top"));
   }

   public static om c(dhy $$0, dhy $$1) {
      return new om()
         .a(on.c, a($$0, "_front"))
         .a(on.o, G($$1))
         .a(on.n, a($$0, "_top"))
         .a(on.j, a($$0, "_front"))
         .a(on.l, a($$0, "_side"))
         .a(on.k, a($$0, "_side"))
         .a(on.m, a($$0, "_front"));
   }

   public static om d(dhy $$0, dhy $$1) {
      return new om()
         .a(on.c, a($$0, "_front"))
         .a(on.o, G($$1))
         .a(on.n, a($$0, "_top"))
         .a(on.j, a($$0, "_front"))
         .a(on.k, a($$0, "_front"))
         .a(on.l, a($$0, "_side"))
         .a(on.m, a($$0, "_side"));
   }

   public static om a(String $$0) {
      return new om()
         .a(on.c, a(dia.mg, $$0 + "_north"))
         .a(on.e, a(dia.mg, $$0 + "_bottom"))
         .a(on.f, a(dia.mg, $$0 + "_top"))
         .a(on.j, a(dia.mg, $$0 + "_north"))
         .a(on.k, a(dia.mg, $$0 + "_south"))
         .a(on.l, a(dia.mg, $$0 + "_east"))
         .a(on.m, a(dia.mg, $$0 + "_west"));
   }

   public static om E(dhy $$0) {
      return new om().a(on.K, a($$0, "_log_lit")).a(on.C, a($$0, "_fire"));
   }

   public static om a(dhy $$0, boolean $$1) {
      return new om()
         .a(on.c, a(dia.eg, "_side"))
         .a(on.e, a(dia.eg, "_bottom"))
         .a(on.f, a(dia.eg, "_top"))
         .a(on.i, a(dia.eg, "_side"))
         .a(on.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static om j(alh $$0) {
      return new om()
         .a(on.c, a(dia.ft, "_side"))
         .a(on.i, a(dia.ft, "_side"))
         .a(on.f, a(dia.ft, "_top"))
         .a(on.e, a(dia.ft, "_bottom"))
         .a(on.M, a(dia.ft, "_inner"))
         .a(on.N, $$0);
   }

   public static om a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new om()
         .a(on.c, a(dia.qV, "_bottom"))
         .a(on.i, a(dia.qV, "_side"))
         .a(on.f, a(dia.qV, "_top"))
         .a(on.O, a(dia.qV, $$1 + "_inner_top"))
         .a(on.e, a(dia.qV, "_bottom"));
   }

   public static om b(cvt $$0) {
      return new om().a(on.H, c($$0));
   }

   public static om F(dhy $$0) {
      return new om().a(on.H, G($$0));
   }

   public static om k(alh $$0) {
      return new om().a(on.H, $$0);
   }

   public static om c(alh $$0, alh $$1) {
      return new om().a(on.H, $$0).a(on.I, $$1);
   }

   public static om a(alh $$0, alh $$1, alh $$2) {
      return new om().a(on.H, $$0).a(on.I, $$1).a(on.J, $$2);
   }

   public static alh G(dhy $$0) {
      alh $$1 = lx.e.b($$0);
      return $$1.f("block/");
   }

   public static alh a(dhy $$0, String $$1) {
      alh $$2 = lx.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alh c(cvt $$0) {
      alh $$1 = lx.g.b($$0);
      return $$1.f("item/");
   }

   public static alh a(cvt $$0, String $$1) {
      alh $$2 = lx.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
