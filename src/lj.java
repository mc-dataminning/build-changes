import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class lj {
   private final Map<lk, aeu> a = Maps.newHashMap();
   private final Set<lk> b = Sets.newHashSet();

   public lj a(lk $$0, aeu $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public lj b(lk $$0, aeu $$1) {
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

   public aeu a(lk $$0) {
      for (lk $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         aeu $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public lj c(lk $$0, aeu $$1) {
      lj $$2 = new lj();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static lj a(csq $$0) {
      aeu $$1 = G($$0);
      return b($$1);
   }

   public static lj b(csq $$0) {
      aeu $$1 = G($$0);
      return a($$1);
   }

   public static lj a(aeu $$0) {
      return new lj().a(lk.b, $$0);
   }

   public static lj b(aeu $$0) {
      return new lj().a(lk.a, $$0);
   }

   public static lj c(csq $$0) {
      return d(lk.p, G($$0));
   }

   public static lj c(aeu $$0) {
      return d(lk.p, $$0);
   }

   public static lj d(csq $$0) {
      return d(lk.q, G($$0));
   }

   public static lj d(aeu $$0) {
      return d(lk.q, $$0);
   }

   public static lj e(csq $$0) {
      return d(lk.s, G($$0));
   }

   public static lj e(aeu $$0) {
      return d(lk.s, $$0);
   }

   public static lj f(csq $$0) {
      return d(lk.t, G($$0));
   }

   public static lj g(csq $$0) {
      return new lj().a(lk.P, G($$0)).a(lk.y, a($$0, "_stem"));
   }

   public static lj f(aeu $$0) {
      return d(lk.t, $$0);
   }

   public static lj h(csq $$0) {
      return d(lk.y, G($$0));
   }

   public static lj a(csq $$0, csq $$1) {
      return new lj().a(lk.y, G($$0)).a(lk.z, G($$1));
   }

   public static lj i(csq $$0) {
      return d(lk.u, G($$0));
   }

   public static lj j(csq $$0) {
      return d(lk.x, G($$0));
   }

   public static lj g(aeu $$0) {
      return d(lk.A, $$0);
   }

   public static lj b(csq $$0, csq $$1) {
      return new lj().a(lk.v, G($$0)).a(lk.w, a($$1, "_top"));
   }

   public static lj d(lk $$0, aeu $$1) {
      return new lj().a($$0, $$1);
   }

   public static lj k(csq $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.d, a($$0, "_top"));
   }

   public static lj l(csq $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.f, a($$0, "_top"));
   }

   public static lj m(csq $$0) {
      return new lj().a(lk.q, a($$0, "_plant")).a(lk.i, a($$0, "_side")).a(lk.f, a($$0, "_top"));
   }

   public static lj n(csq $$0) {
      return new lj().a(lk.i, G($$0)).a(lk.d, a($$0, "_top")).a(lk.c, G($$0));
   }

   public static lj a(aeu $$0, aeu $$1) {
      return new lj().a(lk.i, $$0).a(lk.d, $$1);
   }

   public static lj o(csq $$0) {
      return new lj().a(lk.b, G($$0)).a(lk.i, a($$0, "_side")).a(lk.f, a($$0, "_top"));
   }

   public static lj p(csq $$0) {
      return new lj().a(lk.b, G($$0)).a(lk.c, a($$0, "_particle"));
   }

   public static lj q(csq $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.f, a($$0, "_top")).a(lk.e, a($$0, "_bottom"));
   }

   public static lj r(csq $$0) {
      aeu $$1 = G($$0);
      return new lj().a(lk.r, $$1).a(lk.i, $$1).a(lk.f, a($$0, "_top")).a(lk.e, a($$0, "_bottom"));
   }

   public static lj s(csq $$0) {
      aeu $$1 = G($$0);
      return new lj().a(lk.b, $$1).a(lk.r, $$1).a(lk.i, $$1).a(lk.d, a($$0, "_top"));
   }

   public static lj b(aeu $$0, aeu $$1) {
      return new lj().a(lk.f, $$0).a(lk.e, $$1);
   }

   public static lj t(csq $$0) {
      return new lj().a(lk.f, a($$0, "_top")).a(lk.e, a($$0, "_bottom"));
   }

   public static lj u(csq $$0) {
      return new lj().a(lk.c, G($$0));
   }

   public static lj h(aeu $$0) {
      return new lj().a(lk.c, $$0);
   }

   public static lj v(csq $$0) {
      return new lj().a(lk.C, a($$0, "_0"));
   }

   public static lj w(csq $$0) {
      return new lj().a(lk.C, a($$0, "_1"));
   }

   public static lj x(csq $$0) {
      return new lj().a(lk.D, G($$0));
   }

   public static lj y(csq $$0) {
      return new lj().a(lk.G, G($$0));
   }

   public static lj i(aeu $$0) {
      return new lj().a(lk.G, $$0);
   }

   public static lj a(civ $$0) {
      return new lj().a(lk.c, c($$0));
   }

   public static lj z(csq $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.g, a($$0, "_front")).a(lk.h, a($$0, "_back"));
   }

   public static lj A(csq $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.g, a($$0, "_front")).a(lk.f, a($$0, "_top")).a(lk.e, a($$0, "_bottom"));
   }

   public static lj B(csq $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.g, a($$0, "_front")).a(lk.f, a($$0, "_top"));
   }

   public static lj C(csq $$0) {
      return new lj().a(lk.i, a($$0, "_side")).a(lk.g, a($$0, "_front")).a(lk.d, a($$0, "_end"));
   }

   public static lj D(csq $$0) {
      return new lj().a(lk.f, a($$0, "_top"));
   }

   public static lj c(csq $$0, csq $$1) {
      return new lj()
         .a(lk.c, a($$0, "_front"))
         .a(lk.o, G($$1))
         .a(lk.n, a($$0, "_top"))
         .a(lk.j, a($$0, "_front"))
         .a(lk.l, a($$0, "_side"))
         .a(lk.k, a($$0, "_side"))
         .a(lk.m, a($$0, "_front"));
   }

   public static lj d(csq $$0, csq $$1) {
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
         .a(lk.c, a(csr.mg, $$0 + "_north"))
         .a(lk.e, a(csr.mg, $$0 + "_bottom"))
         .a(lk.f, a(csr.mg, $$0 + "_top"))
         .a(lk.j, a(csr.mg, $$0 + "_north"))
         .a(lk.k, a(csr.mg, $$0 + "_south"))
         .a(lk.l, a(csr.mg, $$0 + "_east"))
         .a(lk.m, a(csr.mg, $$0 + "_west"));
   }

   public static lj E(csq $$0) {
      return new lj().a(lk.K, a($$0, "_log_lit")).a(lk.C, a($$0, "_fire"));
   }

   public static lj a(csq $$0, boolean $$1) {
      return new lj()
         .a(lk.c, a(csr.eh, "_side"))
         .a(lk.e, a(csr.eh, "_bottom"))
         .a(lk.f, a(csr.eh, "_top"))
         .a(lk.i, a(csr.eh, "_side"))
         .a(lk.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static lj j(aeu $$0) {
      return new lj()
         .a(lk.c, a(csr.ft, "_side"))
         .a(lk.i, a(csr.ft, "_side"))
         .a(lk.f, a(csr.ft, "_top"))
         .a(lk.e, a(csr.ft, "_bottom"))
         .a(lk.M, a(csr.ft, "_inner"))
         .a(lk.N, $$0);
   }

   public static lj a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new lj()
         .a(lk.c, a(csr.qI, "_bottom"))
         .a(lk.i, a(csr.qI, "_side"))
         .a(lk.f, a(csr.qI, "_top"))
         .a(lk.O, a(csr.qI, $$1 + "_inner_top"))
         .a(lk.e, a(csr.qI, "_bottom"));
   }

   public static lj b(civ $$0) {
      return new lj().a(lk.H, c($$0));
   }

   public static lj F(csq $$0) {
      return new lj().a(lk.H, G($$0));
   }

   public static lj k(aeu $$0) {
      return new lj().a(lk.H, $$0);
   }

   public static lj c(aeu $$0, aeu $$1) {
      return new lj().a(lk.H, $$0).a(lk.I, $$1);
   }

   public static lj a(aeu $$0, aeu $$1, aeu $$2) {
      return new lj().a(lk.H, $$0).a(lk.I, $$1).a(lk.J, $$2);
   }

   public static aeu G(csq $$0) {
      aeu $$1 = jd.f.b($$0);
      return $$1.d("block/");
   }

   public static aeu a(csq $$0, String $$1) {
      aeu $$2 = jd.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aeu c(civ $$0) {
      aeu $$1 = jd.i.b($$0);
      return $$1.d("item/");
   }

   public static aeu a(civ $$0, String $$1) {
      aeu $$2 = jd.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
