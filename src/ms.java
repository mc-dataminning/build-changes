import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ms {
   private final Map<mt, aiy> a = Maps.newHashMap();
   private final Set<mt> b = Sets.newHashSet();

   public ms a(mt $$0, aiy $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public ms b(mt $$0, aiy $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<mt> a() {
      return this.b.stream();
   }

   public ms a(mt $$0, mt $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public ms b(mt $$0, mt $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public aiy a(mt $$0) {
      for (mt $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         aiy $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public ms c(mt $$0, aiy $$1) {
      ms $$2 = new ms();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static ms a(cyo $$0) {
      aiy $$1 = G($$0);
      return b($$1);
   }

   public static ms b(cyo $$0) {
      aiy $$1 = G($$0);
      return a($$1);
   }

   public static ms a(aiy $$0) {
      return new ms().a(mt.b, $$0);
   }

   public static ms b(aiy $$0) {
      return new ms().a(mt.a, $$0);
   }

   public static ms c(cyo $$0) {
      return d(mt.p, G($$0));
   }

   public static ms c(aiy $$0) {
      return d(mt.p, $$0);
   }

   public static ms d(cyo $$0) {
      return d(mt.q, G($$0));
   }

   public static ms d(aiy $$0) {
      return d(mt.q, $$0);
   }

   public static ms e(cyo $$0) {
      return d(mt.s, G($$0));
   }

   public static ms e(aiy $$0) {
      return d(mt.s, $$0);
   }

   public static ms f(cyo $$0) {
      return d(mt.t, G($$0));
   }

   public static ms g(cyo $$0) {
      return new ms().a(mt.P, G($$0)).a(mt.y, a($$0, "_stem"));
   }

   public static ms f(aiy $$0) {
      return d(mt.t, $$0);
   }

   public static ms h(cyo $$0) {
      return d(mt.y, G($$0));
   }

   public static ms a(cyo $$0, cyo $$1) {
      return new ms().a(mt.y, G($$0)).a(mt.z, G($$1));
   }

   public static ms i(cyo $$0) {
      return d(mt.u, G($$0));
   }

   public static ms j(cyo $$0) {
      return d(mt.x, G($$0));
   }

   public static ms g(aiy $$0) {
      return d(mt.A, $$0);
   }

   public static ms b(cyo $$0, cyo $$1) {
      return new ms().a(mt.v, G($$0)).a(mt.w, a($$1, "_top"));
   }

   public static ms d(mt $$0, aiy $$1) {
      return new ms().a($$0, $$1);
   }

   public static ms k(cyo $$0) {
      return new ms().a(mt.i, a($$0, "_side")).a(mt.d, a($$0, "_top"));
   }

   public static ms l(cyo $$0) {
      return new ms().a(mt.i, a($$0, "_side")).a(mt.f, a($$0, "_top"));
   }

   public static ms m(cyo $$0) {
      return new ms().a(mt.q, a($$0, "_plant")).a(mt.i, a($$0, "_side")).a(mt.f, a($$0, "_top"));
   }

   public static ms n(cyo $$0) {
      return new ms().a(mt.i, G($$0)).a(mt.d, a($$0, "_top")).a(mt.c, G($$0));
   }

   public static ms a(aiy $$0, aiy $$1) {
      return new ms().a(mt.i, $$0).a(mt.d, $$1);
   }

   public static ms o(cyo $$0) {
      return new ms().a(mt.b, G($$0)).a(mt.i, a($$0, "_side")).a(mt.f, a($$0, "_top"));
   }

   public static ms p(cyo $$0) {
      return new ms().a(mt.b, G($$0)).a(mt.c, a($$0, "_particle"));
   }

   public static ms q(cyo $$0) {
      return new ms().a(mt.i, a($$0, "_side")).a(mt.f, a($$0, "_top")).a(mt.e, a($$0, "_bottom"));
   }

   public static ms r(cyo $$0) {
      aiy $$1 = G($$0);
      return new ms().a(mt.r, $$1).a(mt.i, $$1).a(mt.f, a($$0, "_top")).a(mt.e, a($$0, "_bottom"));
   }

   public static ms s(cyo $$0) {
      aiy $$1 = G($$0);
      return new ms().a(mt.b, $$1).a(mt.r, $$1).a(mt.i, $$1).a(mt.d, a($$0, "_top"));
   }

   public static ms b(aiy $$0, aiy $$1) {
      return new ms().a(mt.f, $$0).a(mt.e, $$1);
   }

   public static ms t(cyo $$0) {
      return new ms().a(mt.f, a($$0, "_top")).a(mt.e, a($$0, "_bottom"));
   }

   public static ms u(cyo $$0) {
      return new ms().a(mt.c, G($$0));
   }

   public static ms h(aiy $$0) {
      return new ms().a(mt.c, $$0);
   }

   public static ms v(cyo $$0) {
      return new ms().a(mt.C, a($$0, "_0"));
   }

   public static ms w(cyo $$0) {
      return new ms().a(mt.C, a($$0, "_1"));
   }

   public static ms x(cyo $$0) {
      return new ms().a(mt.D, G($$0));
   }

   public static ms y(cyo $$0) {
      return new ms().a(mt.G, G($$0));
   }

   public static ms i(aiy $$0) {
      return new ms().a(mt.G, $$0);
   }

   public static ms a(cyo $$0, String $$1, String $$2) {
      return new ms().a(mt.i, a($$0, $$1)).a(mt.f, a($$0, $$2)).a(mt.e, a($$0, "_bottom"));
   }

   public static ms a(cou $$0) {
      return new ms().a(mt.c, c($$0));
   }

   public static ms z(cyo $$0) {
      return new ms().a(mt.i, a($$0, "_side")).a(mt.g, a($$0, "_front")).a(mt.h, a($$0, "_back"));
   }

   public static ms A(cyo $$0) {
      return new ms().a(mt.i, a($$0, "_side")).a(mt.g, a($$0, "_front")).a(mt.f, a($$0, "_top")).a(mt.e, a($$0, "_bottom"));
   }

   public static ms B(cyo $$0) {
      return new ms().a(mt.i, a($$0, "_side")).a(mt.g, a($$0, "_front")).a(mt.f, a($$0, "_top"));
   }

   public static ms C(cyo $$0) {
      return new ms().a(mt.i, a($$0, "_side")).a(mt.g, a($$0, "_front")).a(mt.d, a($$0, "_end"));
   }

   public static ms D(cyo $$0) {
      return new ms().a(mt.f, a($$0, "_top"));
   }

   public static ms c(cyo $$0, cyo $$1) {
      return new ms()
         .a(mt.c, a($$0, "_front"))
         .a(mt.o, G($$1))
         .a(mt.n, a($$0, "_top"))
         .a(mt.j, a($$0, "_front"))
         .a(mt.l, a($$0, "_side"))
         .a(mt.k, a($$0, "_side"))
         .a(mt.m, a($$0, "_front"));
   }

   public static ms d(cyo $$0, cyo $$1) {
      return new ms()
         .a(mt.c, a($$0, "_front"))
         .a(mt.o, G($$1))
         .a(mt.n, a($$0, "_top"))
         .a(mt.j, a($$0, "_front"))
         .a(mt.k, a($$0, "_front"))
         .a(mt.l, a($$0, "_side"))
         .a(mt.m, a($$0, "_side"));
   }

   public static ms a(String $$0) {
      return new ms()
         .a(mt.c, a(cyq.mg, $$0 + "_north"))
         .a(mt.e, a(cyq.mg, $$0 + "_bottom"))
         .a(mt.f, a(cyq.mg, $$0 + "_top"))
         .a(mt.j, a(cyq.mg, $$0 + "_north"))
         .a(mt.k, a(cyq.mg, $$0 + "_south"))
         .a(mt.l, a(cyq.mg, $$0 + "_east"))
         .a(mt.m, a(cyq.mg, $$0 + "_west"));
   }

   public static ms E(cyo $$0) {
      return new ms().a(mt.K, a($$0, "_log_lit")).a(mt.C, a($$0, "_fire"));
   }

   public static ms a(cyo $$0, boolean $$1) {
      return new ms()
         .a(mt.c, a(cyq.eg, "_side"))
         .a(mt.e, a(cyq.eg, "_bottom"))
         .a(mt.f, a(cyq.eg, "_top"))
         .a(mt.i, a(cyq.eg, "_side"))
         .a(mt.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static ms j(aiy $$0) {
      return new ms()
         .a(mt.c, a(cyq.ft, "_side"))
         .a(mt.i, a(cyq.ft, "_side"))
         .a(mt.f, a(cyq.ft, "_top"))
         .a(mt.e, a(cyq.ft, "_bottom"))
         .a(mt.M, a(cyq.ft, "_inner"))
         .a(mt.N, $$0);
   }

   public static ms a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new ms()
         .a(mt.c, a(cyq.qV, "_bottom"))
         .a(mt.i, a(cyq.qV, "_side"))
         .a(mt.f, a(cyq.qV, "_top"))
         .a(mt.O, a(cyq.qV, $$1 + "_inner_top"))
         .a(mt.e, a(cyq.qV, "_bottom"));
   }

   public static ms b(cou $$0) {
      return new ms().a(mt.H, c($$0));
   }

   public static ms F(cyo $$0) {
      return new ms().a(mt.H, G($$0));
   }

   public static ms k(aiy $$0) {
      return new ms().a(mt.H, $$0);
   }

   public static ms c(aiy $$0, aiy $$1) {
      return new ms().a(mt.H, $$0).a(mt.I, $$1);
   }

   public static ms a(aiy $$0, aiy $$1, aiy $$2) {
      return new ms().a(mt.H, $$0).a(mt.I, $$1).a(mt.J, $$2);
   }

   public static aiy G(cyo $$0) {
      aiy $$1 = kf.e.b($$0);
      return $$1.d("block/");
   }

   public static aiy a(cyo $$0, String $$1) {
      aiy $$2 = kf.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aiy c(cou $$0) {
      aiy $$1 = kf.h.b($$0);
      return $$1.d("item/");
   }

   public static aiy a(cou $$0, String $$1) {
      aiy $$2 = kf.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
