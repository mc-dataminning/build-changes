import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class mi {
   private final Map<mj, agi> a = Maps.newHashMap();
   private final Set<mj> b = Sets.newHashSet();

   public mi a(mj $$0, agi $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public mi b(mj $$0, agi $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<mj> a() {
      return this.b.stream();
   }

   public mi a(mj $$0, mj $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public mi b(mj $$0, mj $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public agi a(mj $$0) {
      for (mj $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         agi $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public mi c(mj $$0, agi $$1) {
      mi $$2 = new mi();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static mi a(cva $$0) {
      agi $$1 = G($$0);
      return b($$1);
   }

   public static mi b(cva $$0) {
      agi $$1 = G($$0);
      return a($$1);
   }

   public static mi a(agi $$0) {
      return new mi().a(mj.b, $$0);
   }

   public static mi b(agi $$0) {
      return new mi().a(mj.a, $$0);
   }

   public static mi c(cva $$0) {
      return d(mj.p, G($$0));
   }

   public static mi c(agi $$0) {
      return d(mj.p, $$0);
   }

   public static mi d(cva $$0) {
      return d(mj.q, G($$0));
   }

   public static mi d(agi $$0) {
      return d(mj.q, $$0);
   }

   public static mi e(cva $$0) {
      return d(mj.s, G($$0));
   }

   public static mi e(agi $$0) {
      return d(mj.s, $$0);
   }

   public static mi f(cva $$0) {
      return d(mj.t, G($$0));
   }

   public static mi g(cva $$0) {
      return new mi().a(mj.P, G($$0)).a(mj.y, a($$0, "_stem"));
   }

   public static mi f(agi $$0) {
      return d(mj.t, $$0);
   }

   public static mi h(cva $$0) {
      return d(mj.y, G($$0));
   }

   public static mi a(cva $$0, cva $$1) {
      return new mi().a(mj.y, G($$0)).a(mj.z, G($$1));
   }

   public static mi i(cva $$0) {
      return d(mj.u, G($$0));
   }

   public static mi j(cva $$0) {
      return d(mj.x, G($$0));
   }

   public static mi g(agi $$0) {
      return d(mj.A, $$0);
   }

   public static mi b(cva $$0, cva $$1) {
      return new mi().a(mj.v, G($$0)).a(mj.w, a($$1, "_top"));
   }

   public static mi d(mj $$0, agi $$1) {
      return new mi().a($$0, $$1);
   }

   public static mi k(cva $$0) {
      return new mi().a(mj.i, a($$0, "_side")).a(mj.d, a($$0, "_top"));
   }

   public static mi l(cva $$0) {
      return new mi().a(mj.i, a($$0, "_side")).a(mj.f, a($$0, "_top"));
   }

   public static mi m(cva $$0) {
      return new mi().a(mj.q, a($$0, "_plant")).a(mj.i, a($$0, "_side")).a(mj.f, a($$0, "_top"));
   }

   public static mi n(cva $$0) {
      return new mi().a(mj.i, G($$0)).a(mj.d, a($$0, "_top")).a(mj.c, G($$0));
   }

   public static mi a(agi $$0, agi $$1) {
      return new mi().a(mj.i, $$0).a(mj.d, $$1);
   }

   public static mi o(cva $$0) {
      return new mi().a(mj.b, G($$0)).a(mj.i, a($$0, "_side")).a(mj.f, a($$0, "_top"));
   }

   public static mi p(cva $$0) {
      return new mi().a(mj.b, G($$0)).a(mj.c, a($$0, "_particle"));
   }

   public static mi q(cva $$0) {
      return new mi().a(mj.i, a($$0, "_side")).a(mj.f, a($$0, "_top")).a(mj.e, a($$0, "_bottom"));
   }

   public static mi r(cva $$0) {
      agi $$1 = G($$0);
      return new mi().a(mj.r, $$1).a(mj.i, $$1).a(mj.f, a($$0, "_top")).a(mj.e, a($$0, "_bottom"));
   }

   public static mi s(cva $$0) {
      agi $$1 = G($$0);
      return new mi().a(mj.b, $$1).a(mj.r, $$1).a(mj.i, $$1).a(mj.d, a($$0, "_top"));
   }

   public static mi b(agi $$0, agi $$1) {
      return new mi().a(mj.f, $$0).a(mj.e, $$1);
   }

   public static mi t(cva $$0) {
      return new mi().a(mj.f, a($$0, "_top")).a(mj.e, a($$0, "_bottom"));
   }

   public static mi u(cva $$0) {
      return new mi().a(mj.c, G($$0));
   }

   public static mi h(agi $$0) {
      return new mi().a(mj.c, $$0);
   }

   public static mi v(cva $$0) {
      return new mi().a(mj.C, a($$0, "_0"));
   }

   public static mi w(cva $$0) {
      return new mi().a(mj.C, a($$0, "_1"));
   }

   public static mi x(cva $$0) {
      return new mi().a(mj.D, G($$0));
   }

   public static mi y(cva $$0) {
      return new mi().a(mj.G, G($$0));
   }

   public static mi i(agi $$0) {
      return new mi().a(mj.G, $$0);
   }

   public static mi a(cle $$0) {
      return new mi().a(mj.c, c($$0));
   }

   public static mi z(cva $$0) {
      return new mi().a(mj.i, a($$0, "_side")).a(mj.g, a($$0, "_front")).a(mj.h, a($$0, "_back"));
   }

   public static mi A(cva $$0) {
      return new mi().a(mj.i, a($$0, "_side")).a(mj.g, a($$0, "_front")).a(mj.f, a($$0, "_top")).a(mj.e, a($$0, "_bottom"));
   }

   public static mi B(cva $$0) {
      return new mi().a(mj.i, a($$0, "_side")).a(mj.g, a($$0, "_front")).a(mj.f, a($$0, "_top"));
   }

   public static mi C(cva $$0) {
      return new mi().a(mj.i, a($$0, "_side")).a(mj.g, a($$0, "_front")).a(mj.d, a($$0, "_end"));
   }

   public static mi D(cva $$0) {
      return new mi().a(mj.f, a($$0, "_top"));
   }

   public static mi c(cva $$0, cva $$1) {
      return new mi()
         .a(mj.c, a($$0, "_front"))
         .a(mj.o, G($$1))
         .a(mj.n, a($$0, "_top"))
         .a(mj.j, a($$0, "_front"))
         .a(mj.l, a($$0, "_side"))
         .a(mj.k, a($$0, "_side"))
         .a(mj.m, a($$0, "_front"));
   }

   public static mi d(cva $$0, cva $$1) {
      return new mi()
         .a(mj.c, a($$0, "_front"))
         .a(mj.o, G($$1))
         .a(mj.n, a($$0, "_top"))
         .a(mj.j, a($$0, "_front"))
         .a(mj.k, a($$0, "_front"))
         .a(mj.l, a($$0, "_side"))
         .a(mj.m, a($$0, "_side"));
   }

   public static mi a(String $$0) {
      return new mi()
         .a(mj.c, a(cvc.mg, $$0 + "_north"))
         .a(mj.e, a(cvc.mg, $$0 + "_bottom"))
         .a(mj.f, a(cvc.mg, $$0 + "_top"))
         .a(mj.j, a(cvc.mg, $$0 + "_north"))
         .a(mj.k, a(cvc.mg, $$0 + "_south"))
         .a(mj.l, a(cvc.mg, $$0 + "_east"))
         .a(mj.m, a(cvc.mg, $$0 + "_west"));
   }

   public static mi E(cva $$0) {
      return new mi().a(mj.K, a($$0, "_log_lit")).a(mj.C, a($$0, "_fire"));
   }

   public static mi a(cva $$0, boolean $$1) {
      return new mi()
         .a(mj.c, a(cvc.eg, "_side"))
         .a(mj.e, a(cvc.eg, "_bottom"))
         .a(mj.f, a(cvc.eg, "_top"))
         .a(mj.i, a(cvc.eg, "_side"))
         .a(mj.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static mi j(agi $$0) {
      return new mi()
         .a(mj.c, a(cvc.ft, "_side"))
         .a(mj.i, a(cvc.ft, "_side"))
         .a(mj.f, a(cvc.ft, "_top"))
         .a(mj.e, a(cvc.ft, "_bottom"))
         .a(mj.M, a(cvc.ft, "_inner"))
         .a(mj.N, $$0);
   }

   public static mi a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new mi()
         .a(mj.c, a(cvc.qV, "_bottom"))
         .a(mj.i, a(cvc.qV, "_side"))
         .a(mj.f, a(cvc.qV, "_top"))
         .a(mj.O, a(cvc.qV, $$1 + "_inner_top"))
         .a(mj.e, a(cvc.qV, "_bottom"));
   }

   public static mi b(cle $$0) {
      return new mi().a(mj.H, c($$0));
   }

   public static mi F(cva $$0) {
      return new mi().a(mj.H, G($$0));
   }

   public static mi k(agi $$0) {
      return new mi().a(mj.H, $$0);
   }

   public static mi c(agi $$0, agi $$1) {
      return new mi().a(mj.H, $$0).a(mj.I, $$1);
   }

   public static mi a(agi $$0, agi $$1, agi $$2) {
      return new mi().a(mj.H, $$0).a(mj.I, $$1).a(mj.J, $$2);
   }

   public static agi G(cva $$0) {
      agi $$1 = jy.f.b($$0);
      return $$1.d("block/");
   }

   public static agi a(cva $$0, String $$1) {
      agi $$2 = jy.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static agi c(cle $$0) {
      agi $$1 = jy.i.b($$0);
      return $$1.d("item/");
   }

   public static agi a(cle $$0, String $$1) {
      agi $$2 = jy.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
