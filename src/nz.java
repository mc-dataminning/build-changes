import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class nz {
   private final Map<oa, akt> a = Maps.newHashMap();
   private final Set<oa> b = Sets.newHashSet();

   public nz a(oa $$0, akt $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public nz b(oa $$0, akt $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<oa> a() {
      return this.b.stream();
   }

   public nz a(oa $$0, oa $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public nz b(oa $$0, oa $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public akt a(oa $$0) {
      for (oa $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         akt $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public nz c(oa $$0, akt $$1) {
      nz $$2 = new nz();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static nz a(dfc $$0) {
      akt $$1 = H($$0);
      return b($$1);
   }

   public static nz b(dfc $$0) {
      akt $$1 = H($$0);
      return a($$1);
   }

   public static nz a(akt $$0) {
      return new nz().a(oa.b, $$0);
   }

   public static nz b(akt $$0) {
      return new nz().a(oa.a, $$0);
   }

   public static nz c(dfc $$0) {
      return d(oa.p, H($$0));
   }

   public static nz c(akt $$0) {
      return d(oa.p, $$0);
   }

   public static nz d(dfc $$0) {
      return d(oa.q, H($$0));
   }

   public static nz d(akt $$0) {
      return d(oa.q, $$0);
   }

   public static nz e(dfc $$0) {
      return d(oa.s, H($$0));
   }

   public static nz e(akt $$0) {
      return d(oa.s, $$0);
   }

   public static nz f(dfc $$0) {
      return d(oa.t, H($$0));
   }

   public static nz g(dfc $$0) {
      return new nz().a(oa.Q, H($$0)).a(oa.y, a($$0, "_stem"));
   }

   public static nz f(akt $$0) {
      return d(oa.t, $$0);
   }

   public static nz h(dfc $$0) {
      return d(oa.y, H($$0));
   }

   public static nz a(dfc $$0, dfc $$1) {
      return new nz().a(oa.y, H($$0)).a(oa.z, H($$1));
   }

   public static nz i(dfc $$0) {
      return d(oa.u, H($$0));
   }

   public static nz j(dfc $$0) {
      return d(oa.x, H($$0));
   }

   public static nz g(akt $$0) {
      return d(oa.A, $$0);
   }

   public static nz b(dfc $$0, dfc $$1) {
      return new nz().a(oa.v, H($$0)).a(oa.w, a($$1, "_top"));
   }

   public static nz d(oa $$0, akt $$1) {
      return new nz().a($$0, $$1);
   }

   public static nz k(dfc $$0) {
      return new nz().a(oa.i, a($$0, "_side")).a(oa.d, a($$0, "_top"));
   }

   public static nz l(dfc $$0) {
      return new nz().a(oa.i, a($$0, "_side")).a(oa.f, a($$0, "_top"));
   }

   public static nz m(dfc $$0) {
      return new nz().a(oa.q, a($$0, "_plant")).a(oa.i, a($$0, "_side")).a(oa.f, a($$0, "_top"));
   }

   public static nz n(dfc $$0) {
      return new nz().a(oa.i, H($$0)).a(oa.d, a($$0, "_top")).a(oa.c, H($$0));
   }

   public static nz a(akt $$0, akt $$1) {
      return new nz().a(oa.i, $$0).a(oa.d, $$1);
   }

   public static nz o(dfc $$0) {
      return new nz().a(oa.b, H($$0)).a(oa.i, a($$0, "_side")).a(oa.f, a($$0, "_top"));
   }

   public static nz p(dfc $$0) {
      return new nz().a(oa.b, H($$0)).a(oa.c, a($$0, "_particle"));
   }

   public static nz q(dfc $$0) {
      return new nz().a(oa.i, a($$0, "_side")).a(oa.f, a($$0, "_top")).a(oa.e, a($$0, "_bottom"));
   }

   public static nz r(dfc $$0) {
      akt $$1 = H($$0);
      return new nz().a(oa.r, $$1).a(oa.i, $$1).a(oa.f, a($$0, "_top")).a(oa.e, a($$0, "_bottom"));
   }

   public static nz s(dfc $$0) {
      akt $$1 = H($$0);
      return new nz().a(oa.b, $$1).a(oa.r, $$1).a(oa.i, $$1).a(oa.d, a($$0, "_top"));
   }

   public static nz b(akt $$0, akt $$1) {
      return new nz().a(oa.f, $$0).a(oa.e, $$1);
   }

   public static nz t(dfc $$0) {
      return new nz().a(oa.f, a($$0, "_top")).a(oa.e, a($$0, "_bottom"));
   }

   public static nz u(dfc $$0) {
      return new nz().a(oa.c, H($$0));
   }

   public static nz h(akt $$0) {
      return new nz().a(oa.c, $$0);
   }

   public static nz v(dfc $$0) {
      return new nz().a(oa.C, a($$0, "_0"));
   }

   public static nz w(dfc $$0) {
      return new nz().a(oa.C, a($$0, "_1"));
   }

   public static nz x(dfc $$0) {
      return new nz().a(oa.D, H($$0));
   }

   public static nz y(dfc $$0) {
      return new nz().a(oa.H, H($$0));
   }

   public static nz i(akt $$0) {
      return new nz().a(oa.H, $$0);
   }

   public static nz a(dfc $$0, String $$1, String $$2) {
      return new nz().a(oa.i, a($$0, $$1)).a(oa.f, a($$0, $$2)).a(oa.e, a($$0, "_bottom"));
   }

   public static nz a(dfc $$0, String $$1, String $$2, String $$3, String $$4) {
      return new nz().a(oa.g, a($$0, $$1)).a(oa.i, a($$0, $$2)).a(oa.f, a($$0, $$3)).a(oa.e, a($$0, $$4));
   }

   public static nz a(cuc $$0) {
      return new nz().a(oa.c, c($$0));
   }

   public static nz z(dfc $$0) {
      return new nz().a(oa.i, a($$0, "_side")).a(oa.g, a($$0, "_front")).a(oa.h, a($$0, "_back"));
   }

   public static nz A(dfc $$0) {
      return new nz().a(oa.i, a($$0, "_side")).a(oa.g, a($$0, "_front")).a(oa.f, a($$0, "_top")).a(oa.e, a($$0, "_bottom"));
   }

   public static nz B(dfc $$0) {
      return new nz().a(oa.i, a($$0, "_side")).a(oa.g, a($$0, "_front")).a(oa.f, a($$0, "_top"));
   }

   public static nz C(dfc $$0) {
      return new nz().a(oa.i, a($$0, "_side")).a(oa.g, a($$0, "_front")).a(oa.d, a($$0, "_end"));
   }

   public static nz D(dfc $$0) {
      return new nz().a(oa.f, a($$0, "_top"));
   }

   public static nz c(dfc $$0, dfc $$1) {
      return new nz()
         .a(oa.c, a($$0, "_front"))
         .a(oa.o, H($$1))
         .a(oa.n, a($$0, "_top"))
         .a(oa.j, a($$0, "_front"))
         .a(oa.l, a($$0, "_side"))
         .a(oa.k, a($$0, "_side"))
         .a(oa.m, a($$0, "_front"));
   }

   public static nz d(dfc $$0, dfc $$1) {
      return new nz()
         .a(oa.c, a($$0, "_front"))
         .a(oa.o, H($$1))
         .a(oa.n, a($$0, "_top"))
         .a(oa.j, a($$0, "_front"))
         .a(oa.k, a($$0, "_front"))
         .a(oa.l, a($$0, "_side"))
         .a(oa.m, a($$0, "_side"));
   }

   public static nz a(String $$0) {
      return new nz()
         .a(oa.c, a(dfe.ne, $$0 + "_north"))
         .a(oa.e, a(dfe.ne, $$0 + "_bottom"))
         .a(oa.f, a(dfe.ne, $$0 + "_top"))
         .a(oa.j, a(dfe.ne, $$0 + "_north"))
         .a(oa.k, a(dfe.ne, $$0 + "_south"))
         .a(oa.l, a(dfe.ne, $$0 + "_east"))
         .a(oa.m, a(dfe.ne, $$0 + "_west"));
   }

   public static nz E(dfc $$0) {
      return new nz().a(oa.L, a($$0, "_log_lit")).a(oa.C, a($$0, "_fire"));
   }

   public static nz F(dfc $$0) {
      return new nz().a(oa.E, H($$0));
   }

   public static nz a(dfc $$0, boolean $$1) {
      return new nz()
         .a(oa.c, a(dfe.eY, "_side"))
         .a(oa.e, a(dfe.eY, "_bottom"))
         .a(oa.f, a(dfe.eY, "_top"))
         .a(oa.i, a(dfe.eY, "_side"))
         .a(oa.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static nz j(akt $$0) {
      return new nz()
         .a(oa.c, a(dfe.gl, "_side"))
         .a(oa.i, a(dfe.gl, "_side"))
         .a(oa.f, a(dfe.gl, "_top"))
         .a(oa.e, a(dfe.gl, "_bottom"))
         .a(oa.N, a(dfe.gl, "_inner"))
         .a(oa.O, $$0);
   }

   public static nz a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new nz()
         .a(oa.c, a(dfe.sg, "_bottom"))
         .a(oa.i, a(dfe.sg, "_side"))
         .a(oa.f, a(dfe.sg, "_top"))
         .a(oa.P, a(dfe.sg, $$1 + "_inner_top"))
         .a(oa.e, a(dfe.sg, "_bottom"));
   }

   public static nz b(cuc $$0) {
      return new nz().a(oa.I, c($$0));
   }

   public static nz G(dfc $$0) {
      return new nz().a(oa.I, H($$0));
   }

   public static nz k(akt $$0) {
      return new nz().a(oa.I, $$0);
   }

   public static nz c(akt $$0, akt $$1) {
      return new nz().a(oa.I, $$0).a(oa.J, $$1);
   }

   public static nz a(akt $$0, akt $$1, akt $$2) {
      return new nz().a(oa.I, $$0).a(oa.J, $$1).a(oa.K, $$2);
   }

   public static akt H(dfc $$0) {
      akt $$1 = lh.e.b($$0);
      return $$1.d("block/");
   }

   public static akt a(dfc $$0, String $$1) {
      akt $$2 = lh.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akt c(cuc $$0) {
      akt $$1 = lh.h.b($$0);
      return $$1.d("item/");
   }

   public static akt a(cuc $$0, String $$1) {
      akt $$2 = lh.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
