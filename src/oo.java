import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class oo {
   private final Map<op, all> a = Maps.newHashMap();
   private final Set<op> b = Sets.newHashSet();

   public oo a(op $$0, all $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public oo b(op $$0, all $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<op> a() {
      return this.b.stream();
   }

   public oo a(op $$0, op $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public oo b(op $$0, op $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public all a(op $$0) {
      for (op $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         all $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public oo c(op $$0, all $$1) {
      oo $$2 = new oo();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static oo a(dij $$0) {
      all $$1 = G($$0);
      return b($$1);
   }

   public static oo b(dij $$0) {
      all $$1 = G($$0);
      return a($$1);
   }

   public static oo a(all $$0) {
      return new oo().a(op.b, $$0);
   }

   public static oo b(all $$0) {
      return new oo().a(op.a, $$0);
   }

   public static oo c(dij $$0) {
      return d(op.p, G($$0));
   }

   public static oo c(all $$0) {
      return d(op.p, $$0);
   }

   public static oo d(dij $$0) {
      return d(op.q, G($$0));
   }

   public static oo d(all $$0) {
      return d(op.q, $$0);
   }

   public static oo e(dij $$0) {
      return d(op.s, G($$0));
   }

   public static oo e(all $$0) {
      return d(op.s, $$0);
   }

   public static oo f(dij $$0) {
      return d(op.t, G($$0));
   }

   public static oo g(dij $$0) {
      return new oo().a(op.P, G($$0)).a(op.y, a($$0, "_stem"));
   }

   public static oo f(all $$0) {
      return d(op.t, $$0);
   }

   public static oo h(dij $$0) {
      return d(op.y, G($$0));
   }

   public static oo a(dij $$0, dij $$1) {
      return new oo().a(op.y, G($$0)).a(op.z, G($$1));
   }

   public static oo i(dij $$0) {
      return d(op.u, G($$0));
   }

   public static oo j(dij $$0) {
      return d(op.x, G($$0));
   }

   public static oo g(all $$0) {
      return d(op.A, $$0);
   }

   public static oo b(dij $$0, dij $$1) {
      return new oo().a(op.v, G($$0)).a(op.w, a($$1, "_top"));
   }

   public static oo d(op $$0, all $$1) {
      return new oo().a($$0, $$1);
   }

   public static oo k(dij $$0) {
      return new oo().a(op.i, a($$0, "_side")).a(op.d, a($$0, "_top"));
   }

   public static oo l(dij $$0) {
      return new oo().a(op.i, a($$0, "_side")).a(op.f, a($$0, "_top"));
   }

   public static oo m(dij $$0) {
      return new oo().a(op.q, a($$0, "_plant")).a(op.i, a($$0, "_side")).a(op.f, a($$0, "_top"));
   }

   public static oo n(dij $$0) {
      return new oo().a(op.i, G($$0)).a(op.d, a($$0, "_top")).a(op.c, G($$0));
   }

   public static oo a(all $$0, all $$1) {
      return new oo().a(op.i, $$0).a(op.d, $$1);
   }

   public static oo o(dij $$0) {
      return new oo().a(op.b, G($$0)).a(op.i, a($$0, "_side")).a(op.f, a($$0, "_top"));
   }

   public static oo p(dij $$0) {
      return new oo().a(op.b, G($$0)).a(op.c, a($$0, "_particle"));
   }

   public static oo q(dij $$0) {
      return new oo().a(op.i, a($$0, "_side")).a(op.f, a($$0, "_top")).a(op.e, a($$0, "_bottom"));
   }

   public static oo r(dij $$0) {
      all $$1 = G($$0);
      return new oo().a(op.r, $$1).a(op.i, $$1).a(op.f, a($$0, "_top")).a(op.e, a($$0, "_bottom"));
   }

   public static oo s(dij $$0) {
      all $$1 = G($$0);
      return new oo().a(op.b, $$1).a(op.r, $$1).a(op.i, $$1).a(op.d, a($$0, "_top"));
   }

   public static oo b(all $$0, all $$1) {
      return new oo().a(op.f, $$0).a(op.e, $$1);
   }

   public static oo t(dij $$0) {
      return new oo().a(op.f, a($$0, "_top")).a(op.e, a($$0, "_bottom"));
   }

   public static oo u(dij $$0) {
      return new oo().a(op.c, G($$0));
   }

   public static oo h(all $$0) {
      return new oo().a(op.c, $$0);
   }

   public static oo v(dij $$0) {
      return new oo().a(op.C, a($$0, "_0"));
   }

   public static oo w(dij $$0) {
      return new oo().a(op.C, a($$0, "_1"));
   }

   public static oo x(dij $$0) {
      return new oo().a(op.D, G($$0));
   }

   public static oo y(dij $$0) {
      return new oo().a(op.G, G($$0));
   }

   public static oo i(all $$0) {
      return new oo().a(op.G, $$0);
   }

   public static oo a(dij $$0, String $$1, String $$2) {
      return new oo().a(op.i, a($$0, $$1)).a(op.f, a($$0, $$2)).a(op.e, a($$0, "_bottom"));
   }

   public static oo a(dij $$0, String $$1, String $$2, String $$3, String $$4) {
      return new oo().a(op.g, a($$0, $$1)).a(op.i, a($$0, $$2)).a(op.f, a($$0, $$3)).a(op.e, a($$0, $$4));
   }

   public static oo a(cwb $$0) {
      return new oo().a(op.c, c($$0));
   }

   public static oo z(dij $$0) {
      return new oo().a(op.i, a($$0, "_side")).a(op.g, a($$0, "_front")).a(op.h, a($$0, "_back"));
   }

   public static oo A(dij $$0) {
      return new oo().a(op.i, a($$0, "_side")).a(op.g, a($$0, "_front")).a(op.f, a($$0, "_top")).a(op.e, a($$0, "_bottom"));
   }

   public static oo B(dij $$0) {
      return new oo().a(op.i, a($$0, "_side")).a(op.g, a($$0, "_front")).a(op.f, a($$0, "_top"));
   }

   public static oo C(dij $$0) {
      return new oo().a(op.i, a($$0, "_side")).a(op.g, a($$0, "_front")).a(op.d, a($$0, "_end"));
   }

   public static oo D(dij $$0) {
      return new oo().a(op.f, a($$0, "_top"));
   }

   public static oo c(dij $$0, dij $$1) {
      return new oo()
         .a(op.c, a($$0, "_front"))
         .a(op.o, G($$1))
         .a(op.n, a($$0, "_top"))
         .a(op.j, a($$0, "_front"))
         .a(op.l, a($$0, "_side"))
         .a(op.k, a($$0, "_side"))
         .a(op.m, a($$0, "_front"));
   }

   public static oo d(dij $$0, dij $$1) {
      return new oo()
         .a(op.c, a($$0, "_front"))
         .a(op.o, G($$1))
         .a(op.n, a($$0, "_top"))
         .a(op.j, a($$0, "_front"))
         .a(op.k, a($$0, "_front"))
         .a(op.l, a($$0, "_side"))
         .a(op.m, a($$0, "_side"));
   }

   public static oo a(String $$0) {
      return new oo()
         .a(op.c, a(dil.mg, $$0 + "_north"))
         .a(op.e, a(dil.mg, $$0 + "_bottom"))
         .a(op.f, a(dil.mg, $$0 + "_top"))
         .a(op.j, a(dil.mg, $$0 + "_north"))
         .a(op.k, a(dil.mg, $$0 + "_south"))
         .a(op.l, a(dil.mg, $$0 + "_east"))
         .a(op.m, a(dil.mg, $$0 + "_west"));
   }

   public static oo E(dij $$0) {
      return new oo().a(op.K, a($$0, "_log_lit")).a(op.C, a($$0, "_fire"));
   }

   public static oo a(dij $$0, boolean $$1) {
      return new oo()
         .a(op.c, a(dil.eg, "_side"))
         .a(op.e, a(dil.eg, "_bottom"))
         .a(op.f, a(dil.eg, "_top"))
         .a(op.i, a(dil.eg, "_side"))
         .a(op.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static oo j(all $$0) {
      return new oo()
         .a(op.c, a(dil.ft, "_side"))
         .a(op.i, a(dil.ft, "_side"))
         .a(op.f, a(dil.ft, "_top"))
         .a(op.e, a(dil.ft, "_bottom"))
         .a(op.M, a(dil.ft, "_inner"))
         .a(op.N, $$0);
   }

   public static oo a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new oo()
         .a(op.c, a(dil.qV, "_bottom"))
         .a(op.i, a(dil.qV, "_side"))
         .a(op.f, a(dil.qV, "_top"))
         .a(op.O, a(dil.qV, $$1 + "_inner_top"))
         .a(op.e, a(dil.qV, "_bottom"));
   }

   public static oo b(cwb $$0) {
      return new oo().a(op.H, c($$0));
   }

   public static oo F(dij $$0) {
      return new oo().a(op.H, G($$0));
   }

   public static oo k(all $$0) {
      return new oo().a(op.H, $$0);
   }

   public static oo c(all $$0, all $$1) {
      return new oo().a(op.H, $$0).a(op.I, $$1);
   }

   public static oo a(all $$0, all $$1, all $$2) {
      return new oo().a(op.H, $$0).a(op.I, $$1).a(op.J, $$2);
   }

   public static all G(dij $$0) {
      all $$1 = lz.e.b($$0);
      return $$1.f("block/");
   }

   public static all a(dij $$0, String $$1) {
      all $$2 = lz.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static all c(cwb $$0) {
      all $$1 = lz.g.b($$0);
      return $$1.f("item/");
   }

   public static all a(cwb $$0, String $$1) {
      all $$2 = lz.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
