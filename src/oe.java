import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class oe {
   private final Map<of, akq> a = Maps.newHashMap();
   private final Set<of> b = Sets.newHashSet();

   public oe a(of $$0, akq $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public oe b(of $$0, akq $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<of> a() {
      return this.b.stream();
   }

   public oe a(of $$0, of $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public oe b(of $$0, of $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public akq a(of $$0) {
      for (of $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         akq $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public oe c(of $$0, akq $$1) {
      oe $$2 = new oe();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static oe a(dfw $$0) {
      akq $$1 = G($$0);
      return b($$1);
   }

   public static oe b(dfw $$0) {
      akq $$1 = G($$0);
      return a($$1);
   }

   public static oe a(akq $$0) {
      return new oe().a(of.b, $$0);
   }

   public static oe b(akq $$0) {
      return new oe().a(of.a, $$0);
   }

   public static oe c(dfw $$0) {
      return d(of.p, G($$0));
   }

   public static oe c(akq $$0) {
      return d(of.p, $$0);
   }

   public static oe d(dfw $$0) {
      return d(of.q, G($$0));
   }

   public static oe d(akq $$0) {
      return d(of.q, $$0);
   }

   public static oe e(dfw $$0) {
      return d(of.s, G($$0));
   }

   public static oe e(akq $$0) {
      return d(of.s, $$0);
   }

   public static oe f(dfw $$0) {
      return d(of.t, G($$0));
   }

   public static oe g(dfw $$0) {
      return new oe().a(of.P, G($$0)).a(of.y, a($$0, "_stem"));
   }

   public static oe f(akq $$0) {
      return d(of.t, $$0);
   }

   public static oe h(dfw $$0) {
      return d(of.y, G($$0));
   }

   public static oe a(dfw $$0, dfw $$1) {
      return new oe().a(of.y, G($$0)).a(of.z, G($$1));
   }

   public static oe i(dfw $$0) {
      return d(of.u, G($$0));
   }

   public static oe j(dfw $$0) {
      return d(of.x, G($$0));
   }

   public static oe g(akq $$0) {
      return d(of.A, $$0);
   }

   public static oe b(dfw $$0, dfw $$1) {
      return new oe().a(of.v, G($$0)).a(of.w, a($$1, "_top"));
   }

   public static oe d(of $$0, akq $$1) {
      return new oe().a($$0, $$1);
   }

   public static oe k(dfw $$0) {
      return new oe().a(of.i, a($$0, "_side")).a(of.d, a($$0, "_top"));
   }

   public static oe l(dfw $$0) {
      return new oe().a(of.i, a($$0, "_side")).a(of.f, a($$0, "_top"));
   }

   public static oe m(dfw $$0) {
      return new oe().a(of.q, a($$0, "_plant")).a(of.i, a($$0, "_side")).a(of.f, a($$0, "_top"));
   }

   public static oe n(dfw $$0) {
      return new oe().a(of.i, G($$0)).a(of.d, a($$0, "_top")).a(of.c, G($$0));
   }

   public static oe a(akq $$0, akq $$1) {
      return new oe().a(of.i, $$0).a(of.d, $$1);
   }

   public static oe o(dfw $$0) {
      return new oe().a(of.b, G($$0)).a(of.i, a($$0, "_side")).a(of.f, a($$0, "_top"));
   }

   public static oe p(dfw $$0) {
      return new oe().a(of.b, G($$0)).a(of.c, a($$0, "_particle"));
   }

   public static oe q(dfw $$0) {
      return new oe().a(of.i, a($$0, "_side")).a(of.f, a($$0, "_top")).a(of.e, a($$0, "_bottom"));
   }

   public static oe r(dfw $$0) {
      akq $$1 = G($$0);
      return new oe().a(of.r, $$1).a(of.i, $$1).a(of.f, a($$0, "_top")).a(of.e, a($$0, "_bottom"));
   }

   public static oe s(dfw $$0) {
      akq $$1 = G($$0);
      return new oe().a(of.b, $$1).a(of.r, $$1).a(of.i, $$1).a(of.d, a($$0, "_top"));
   }

   public static oe b(akq $$0, akq $$1) {
      return new oe().a(of.f, $$0).a(of.e, $$1);
   }

   public static oe t(dfw $$0) {
      return new oe().a(of.f, a($$0, "_top")).a(of.e, a($$0, "_bottom"));
   }

   public static oe u(dfw $$0) {
      return new oe().a(of.c, G($$0));
   }

   public static oe h(akq $$0) {
      return new oe().a(of.c, $$0);
   }

   public static oe v(dfw $$0) {
      return new oe().a(of.C, a($$0, "_0"));
   }

   public static oe w(dfw $$0) {
      return new oe().a(of.C, a($$0, "_1"));
   }

   public static oe x(dfw $$0) {
      return new oe().a(of.D, G($$0));
   }

   public static oe y(dfw $$0) {
      return new oe().a(of.G, G($$0));
   }

   public static oe i(akq $$0) {
      return new oe().a(of.G, $$0);
   }

   public static oe a(dfw $$0, String $$1, String $$2) {
      return new oe().a(of.i, a($$0, $$1)).a(of.f, a($$0, $$2)).a(of.e, a($$0, "_bottom"));
   }

   public static oe a(dfw $$0, String $$1, String $$2, String $$3, String $$4) {
      return new oe().a(of.g, a($$0, $$1)).a(of.i, a($$0, $$2)).a(of.f, a($$0, $$3)).a(of.e, a($$0, $$4));
   }

   public static oe a(cuj $$0) {
      return new oe().a(of.c, c($$0));
   }

   public static oe z(dfw $$0) {
      return new oe().a(of.i, a($$0, "_side")).a(of.g, a($$0, "_front")).a(of.h, a($$0, "_back"));
   }

   public static oe A(dfw $$0) {
      return new oe().a(of.i, a($$0, "_side")).a(of.g, a($$0, "_front")).a(of.f, a($$0, "_top")).a(of.e, a($$0, "_bottom"));
   }

   public static oe B(dfw $$0) {
      return new oe().a(of.i, a($$0, "_side")).a(of.g, a($$0, "_front")).a(of.f, a($$0, "_top"));
   }

   public static oe C(dfw $$0) {
      return new oe().a(of.i, a($$0, "_side")).a(of.g, a($$0, "_front")).a(of.d, a($$0, "_end"));
   }

   public static oe D(dfw $$0) {
      return new oe().a(of.f, a($$0, "_top"));
   }

   public static oe c(dfw $$0, dfw $$1) {
      return new oe()
         .a(of.c, a($$0, "_front"))
         .a(of.o, G($$1))
         .a(of.n, a($$0, "_top"))
         .a(of.j, a($$0, "_front"))
         .a(of.l, a($$0, "_side"))
         .a(of.k, a($$0, "_side"))
         .a(of.m, a($$0, "_front"));
   }

   public static oe d(dfw $$0, dfw $$1) {
      return new oe()
         .a(of.c, a($$0, "_front"))
         .a(of.o, G($$1))
         .a(of.n, a($$0, "_top"))
         .a(of.j, a($$0, "_front"))
         .a(of.k, a($$0, "_front"))
         .a(of.l, a($$0, "_side"))
         .a(of.m, a($$0, "_side"));
   }

   public static oe a(String $$0) {
      return new oe()
         .a(of.c, a(dfy.mg, $$0 + "_north"))
         .a(of.e, a(dfy.mg, $$0 + "_bottom"))
         .a(of.f, a(dfy.mg, $$0 + "_top"))
         .a(of.j, a(dfy.mg, $$0 + "_north"))
         .a(of.k, a(dfy.mg, $$0 + "_south"))
         .a(of.l, a(dfy.mg, $$0 + "_east"))
         .a(of.m, a(dfy.mg, $$0 + "_west"));
   }

   public static oe E(dfw $$0) {
      return new oe().a(of.K, a($$0, "_log_lit")).a(of.C, a($$0, "_fire"));
   }

   public static oe a(dfw $$0, boolean $$1) {
      return new oe()
         .a(of.c, a(dfy.eg, "_side"))
         .a(of.e, a(dfy.eg, "_bottom"))
         .a(of.f, a(dfy.eg, "_top"))
         .a(of.i, a(dfy.eg, "_side"))
         .a(of.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static oe j(akq $$0) {
      return new oe()
         .a(of.c, a(dfy.ft, "_side"))
         .a(of.i, a(dfy.ft, "_side"))
         .a(of.f, a(dfy.ft, "_top"))
         .a(of.e, a(dfy.ft, "_bottom"))
         .a(of.M, a(dfy.ft, "_inner"))
         .a(of.N, $$0);
   }

   public static oe a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new oe()
         .a(of.c, a(dfy.qV, "_bottom"))
         .a(of.i, a(dfy.qV, "_side"))
         .a(of.f, a(dfy.qV, "_top"))
         .a(of.O, a(dfy.qV, $$1 + "_inner_top"))
         .a(of.e, a(dfy.qV, "_bottom"));
   }

   public static oe b(cuj $$0) {
      return new oe().a(of.H, c($$0));
   }

   public static oe F(dfw $$0) {
      return new oe().a(of.H, G($$0));
   }

   public static oe k(akq $$0) {
      return new oe().a(of.H, $$0);
   }

   public static oe c(akq $$0, akq $$1) {
      return new oe().a(of.H, $$0).a(of.I, $$1);
   }

   public static oe a(akq $$0, akq $$1, akq $$2) {
      return new oe().a(of.H, $$0).a(of.I, $$1).a(of.J, $$2);
   }

   public static akq G(dfw $$0) {
      akq $$1 = lt.e.b($$0);
      return $$1.f("block/");
   }

   public static akq a(dfw $$0, String $$1) {
      akq $$2 = lt.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akq c(cuj $$0) {
      akq $$1 = lt.g.b($$0);
      return $$1.f("item/");
   }

   public static akq a(cuj $$0, String $$1) {
      akq $$2 = lt.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
