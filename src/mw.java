import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class mw {
   private final Map<mx, ajh> a = Maps.newHashMap();
   private final Set<mx> b = Sets.newHashSet();

   public mw a(mx $$0, ajh $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public mw b(mx $$0, ajh $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<mx> a() {
      return this.b.stream();
   }

   public mw a(mx $$0, mx $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public mw b(mx $$0, mx $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ajh a(mx $$0) {
      for (mx $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ajh $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public mw c(mx $$0, ajh $$1) {
      mw $$2 = new mw();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static mw a(dac $$0) {
      ajh $$1 = G($$0);
      return b($$1);
   }

   public static mw b(dac $$0) {
      ajh $$1 = G($$0);
      return a($$1);
   }

   public static mw a(ajh $$0) {
      return new mw().a(mx.b, $$0);
   }

   public static mw b(ajh $$0) {
      return new mw().a(mx.a, $$0);
   }

   public static mw c(dac $$0) {
      return d(mx.p, G($$0));
   }

   public static mw c(ajh $$0) {
      return d(mx.p, $$0);
   }

   public static mw d(dac $$0) {
      return d(mx.q, G($$0));
   }

   public static mw d(ajh $$0) {
      return d(mx.q, $$0);
   }

   public static mw e(dac $$0) {
      return d(mx.s, G($$0));
   }

   public static mw e(ajh $$0) {
      return d(mx.s, $$0);
   }

   public static mw f(dac $$0) {
      return d(mx.t, G($$0));
   }

   public static mw g(dac $$0) {
      return new mw().a(mx.P, G($$0)).a(mx.y, a($$0, "_stem"));
   }

   public static mw f(ajh $$0) {
      return d(mx.t, $$0);
   }

   public static mw h(dac $$0) {
      return d(mx.y, G($$0));
   }

   public static mw a(dac $$0, dac $$1) {
      return new mw().a(mx.y, G($$0)).a(mx.z, G($$1));
   }

   public static mw i(dac $$0) {
      return d(mx.u, G($$0));
   }

   public static mw j(dac $$0) {
      return d(mx.x, G($$0));
   }

   public static mw g(ajh $$0) {
      return d(mx.A, $$0);
   }

   public static mw b(dac $$0, dac $$1) {
      return new mw().a(mx.v, G($$0)).a(mx.w, a($$1, "_top"));
   }

   public static mw d(mx $$0, ajh $$1) {
      return new mw().a($$0, $$1);
   }

   public static mw k(dac $$0) {
      return new mw().a(mx.i, a($$0, "_side")).a(mx.d, a($$0, "_top"));
   }

   public static mw l(dac $$0) {
      return new mw().a(mx.i, a($$0, "_side")).a(mx.f, a($$0, "_top"));
   }

   public static mw m(dac $$0) {
      return new mw().a(mx.q, a($$0, "_plant")).a(mx.i, a($$0, "_side")).a(mx.f, a($$0, "_top"));
   }

   public static mw n(dac $$0) {
      return new mw().a(mx.i, G($$0)).a(mx.d, a($$0, "_top")).a(mx.c, G($$0));
   }

   public static mw a(ajh $$0, ajh $$1) {
      return new mw().a(mx.i, $$0).a(mx.d, $$1);
   }

   public static mw o(dac $$0) {
      return new mw().a(mx.b, G($$0)).a(mx.i, a($$0, "_side")).a(mx.f, a($$0, "_top"));
   }

   public static mw p(dac $$0) {
      return new mw().a(mx.b, G($$0)).a(mx.c, a($$0, "_particle"));
   }

   public static mw q(dac $$0) {
      return new mw().a(mx.i, a($$0, "_side")).a(mx.f, a($$0, "_top")).a(mx.e, a($$0, "_bottom"));
   }

   public static mw r(dac $$0) {
      ajh $$1 = G($$0);
      return new mw().a(mx.r, $$1).a(mx.i, $$1).a(mx.f, a($$0, "_top")).a(mx.e, a($$0, "_bottom"));
   }

   public static mw s(dac $$0) {
      ajh $$1 = G($$0);
      return new mw().a(mx.b, $$1).a(mx.r, $$1).a(mx.i, $$1).a(mx.d, a($$0, "_top"));
   }

   public static mw b(ajh $$0, ajh $$1) {
      return new mw().a(mx.f, $$0).a(mx.e, $$1);
   }

   public static mw t(dac $$0) {
      return new mw().a(mx.f, a($$0, "_top")).a(mx.e, a($$0, "_bottom"));
   }

   public static mw u(dac $$0) {
      return new mw().a(mx.c, G($$0));
   }

   public static mw h(ajh $$0) {
      return new mw().a(mx.c, $$0);
   }

   public static mw v(dac $$0) {
      return new mw().a(mx.C, a($$0, "_0"));
   }

   public static mw w(dac $$0) {
      return new mw().a(mx.C, a($$0, "_1"));
   }

   public static mw x(dac $$0) {
      return new mw().a(mx.D, G($$0));
   }

   public static mw y(dac $$0) {
      return new mw().a(mx.G, G($$0));
   }

   public static mw i(ajh $$0) {
      return new mw().a(mx.G, $$0);
   }

   public static mw a(dac $$0, String $$1, String $$2) {
      return new mw().a(mx.i, a($$0, $$1)).a(mx.f, a($$0, $$2)).a(mx.e, a($$0, "_bottom"));
   }

   public static mw a(dac $$0, String $$1, String $$2, String $$3, String $$4) {
      return new mw().a(mx.g, a($$0, $$1)).a(mx.i, a($$0, $$2)).a(mx.f, a($$0, $$3)).a(mx.e, a($$0, $$4));
   }

   public static mw a(cqh $$0) {
      return new mw().a(mx.c, c($$0));
   }

   public static mw z(dac $$0) {
      return new mw().a(mx.i, a($$0, "_side")).a(mx.g, a($$0, "_front")).a(mx.h, a($$0, "_back"));
   }

   public static mw A(dac $$0) {
      return new mw().a(mx.i, a($$0, "_side")).a(mx.g, a($$0, "_front")).a(mx.f, a($$0, "_top")).a(mx.e, a($$0, "_bottom"));
   }

   public static mw B(dac $$0) {
      return new mw().a(mx.i, a($$0, "_side")).a(mx.g, a($$0, "_front")).a(mx.f, a($$0, "_top"));
   }

   public static mw C(dac $$0) {
      return new mw().a(mx.i, a($$0, "_side")).a(mx.g, a($$0, "_front")).a(mx.d, a($$0, "_end"));
   }

   public static mw D(dac $$0) {
      return new mw().a(mx.f, a($$0, "_top"));
   }

   public static mw c(dac $$0, dac $$1) {
      return new mw()
         .a(mx.c, a($$0, "_front"))
         .a(mx.o, G($$1))
         .a(mx.n, a($$0, "_top"))
         .a(mx.j, a($$0, "_front"))
         .a(mx.l, a($$0, "_side"))
         .a(mx.k, a($$0, "_side"))
         .a(mx.m, a($$0, "_front"));
   }

   public static mw d(dac $$0, dac $$1) {
      return new mw()
         .a(mx.c, a($$0, "_front"))
         .a(mx.o, G($$1))
         .a(mx.n, a($$0, "_top"))
         .a(mx.j, a($$0, "_front"))
         .a(mx.k, a($$0, "_front"))
         .a(mx.l, a($$0, "_side"))
         .a(mx.m, a($$0, "_side"));
   }

   public static mw a(String $$0) {
      return new mw()
         .a(mx.c, a(dae.mg, $$0 + "_north"))
         .a(mx.e, a(dae.mg, $$0 + "_bottom"))
         .a(mx.f, a(dae.mg, $$0 + "_top"))
         .a(mx.j, a(dae.mg, $$0 + "_north"))
         .a(mx.k, a(dae.mg, $$0 + "_south"))
         .a(mx.l, a(dae.mg, $$0 + "_east"))
         .a(mx.m, a(dae.mg, $$0 + "_west"));
   }

   public static mw E(dac $$0) {
      return new mw().a(mx.K, a($$0, "_log_lit")).a(mx.C, a($$0, "_fire"));
   }

   public static mw a(dac $$0, boolean $$1) {
      return new mw()
         .a(mx.c, a(dae.eg, "_side"))
         .a(mx.e, a(dae.eg, "_bottom"))
         .a(mx.f, a(dae.eg, "_top"))
         .a(mx.i, a(dae.eg, "_side"))
         .a(mx.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static mw j(ajh $$0) {
      return new mw()
         .a(mx.c, a(dae.ft, "_side"))
         .a(mx.i, a(dae.ft, "_side"))
         .a(mx.f, a(dae.ft, "_top"))
         .a(mx.e, a(dae.ft, "_bottom"))
         .a(mx.M, a(dae.ft, "_inner"))
         .a(mx.N, $$0);
   }

   public static mw a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new mw()
         .a(mx.c, a(dae.qV, "_bottom"))
         .a(mx.i, a(dae.qV, "_side"))
         .a(mx.f, a(dae.qV, "_top"))
         .a(mx.O, a(dae.qV, $$1 + "_inner_top"))
         .a(mx.e, a(dae.qV, "_bottom"));
   }

   public static mw b(cqh $$0) {
      return new mw().a(mx.H, c($$0));
   }

   public static mw F(dac $$0) {
      return new mw().a(mx.H, G($$0));
   }

   public static mw k(ajh $$0) {
      return new mw().a(mx.H, $$0);
   }

   public static mw c(ajh $$0, ajh $$1) {
      return new mw().a(mx.H, $$0).a(mx.I, $$1);
   }

   public static mw a(ajh $$0, ajh $$1, ajh $$2) {
      return new mw().a(mx.H, $$0).a(mx.I, $$1).a(mx.J, $$2);
   }

   public static ajh G(dac $$0) {
      ajh $$1 = ki.e.b($$0);
      return $$1.d("block/");
   }

   public static ajh a(dac $$0, String $$1) {
      ajh $$2 = ki.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ajh c(cqh $$0) {
      ajh $$1 = ki.h.b($$0);
      return $$1.d("item/");
   }

   public static ajh a(cqh $$0, String $$1) {
      ajh $$2 = ki.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
