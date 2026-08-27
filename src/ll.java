import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ll {
   private final Map<lm, aex> a = Maps.newHashMap();
   private final Set<lm> b = Sets.newHashSet();

   public ll a(lm $$0, aex $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public ll b(lm $$0, aex $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<lm> a() {
      return this.b.stream();
   }

   public ll a(lm $$0, lm $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public ll b(lm $$0, lm $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public aex a(lm $$0) {
      for (lm $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         aex $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public ll c(lm $$0, aex $$1) {
      ll $$2 = new ll();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static ll a(csv $$0) {
      aex $$1 = G($$0);
      return b($$1);
   }

   public static ll b(csv $$0) {
      aex $$1 = G($$0);
      return a($$1);
   }

   public static ll a(aex $$0) {
      return new ll().a(lm.b, $$0);
   }

   public static ll b(aex $$0) {
      return new ll().a(lm.a, $$0);
   }

   public static ll c(csv $$0) {
      return d(lm.p, G($$0));
   }

   public static ll c(aex $$0) {
      return d(lm.p, $$0);
   }

   public static ll d(csv $$0) {
      return d(lm.q, G($$0));
   }

   public static ll d(aex $$0) {
      return d(lm.q, $$0);
   }

   public static ll e(csv $$0) {
      return d(lm.s, G($$0));
   }

   public static ll e(aex $$0) {
      return d(lm.s, $$0);
   }

   public static ll f(csv $$0) {
      return d(lm.t, G($$0));
   }

   public static ll g(csv $$0) {
      return new ll().a(lm.P, G($$0)).a(lm.y, a($$0, "_stem"));
   }

   public static ll f(aex $$0) {
      return d(lm.t, $$0);
   }

   public static ll h(csv $$0) {
      return d(lm.y, G($$0));
   }

   public static ll a(csv $$0, csv $$1) {
      return new ll().a(lm.y, G($$0)).a(lm.z, G($$1));
   }

   public static ll i(csv $$0) {
      return d(lm.u, G($$0));
   }

   public static ll j(csv $$0) {
      return d(lm.x, G($$0));
   }

   public static ll g(aex $$0) {
      return d(lm.A, $$0);
   }

   public static ll b(csv $$0, csv $$1) {
      return new ll().a(lm.v, G($$0)).a(lm.w, a($$1, "_top"));
   }

   public static ll d(lm $$0, aex $$1) {
      return new ll().a($$0, $$1);
   }

   public static ll k(csv $$0) {
      return new ll().a(lm.i, a($$0, "_side")).a(lm.d, a($$0, "_top"));
   }

   public static ll l(csv $$0) {
      return new ll().a(lm.i, a($$0, "_side")).a(lm.f, a($$0, "_top"));
   }

   public static ll m(csv $$0) {
      return new ll().a(lm.q, a($$0, "_plant")).a(lm.i, a($$0, "_side")).a(lm.f, a($$0, "_top"));
   }

   public static ll n(csv $$0) {
      return new ll().a(lm.i, G($$0)).a(lm.d, a($$0, "_top")).a(lm.c, G($$0));
   }

   public static ll a(aex $$0, aex $$1) {
      return new ll().a(lm.i, $$0).a(lm.d, $$1);
   }

   public static ll o(csv $$0) {
      return new ll().a(lm.b, G($$0)).a(lm.i, a($$0, "_side")).a(lm.f, a($$0, "_top"));
   }

   public static ll p(csv $$0) {
      return new ll().a(lm.b, G($$0)).a(lm.c, a($$0, "_particle"));
   }

   public static ll q(csv $$0) {
      return new ll().a(lm.i, a($$0, "_side")).a(lm.f, a($$0, "_top")).a(lm.e, a($$0, "_bottom"));
   }

   public static ll r(csv $$0) {
      aex $$1 = G($$0);
      return new ll().a(lm.r, $$1).a(lm.i, $$1).a(lm.f, a($$0, "_top")).a(lm.e, a($$0, "_bottom"));
   }

   public static ll s(csv $$0) {
      aex $$1 = G($$0);
      return new ll().a(lm.b, $$1).a(lm.r, $$1).a(lm.i, $$1).a(lm.d, a($$0, "_top"));
   }

   public static ll b(aex $$0, aex $$1) {
      return new ll().a(lm.f, $$0).a(lm.e, $$1);
   }

   public static ll t(csv $$0) {
      return new ll().a(lm.f, a($$0, "_top")).a(lm.e, a($$0, "_bottom"));
   }

   public static ll u(csv $$0) {
      return new ll().a(lm.c, G($$0));
   }

   public static ll h(aex $$0) {
      return new ll().a(lm.c, $$0);
   }

   public static ll v(csv $$0) {
      return new ll().a(lm.C, a($$0, "_0"));
   }

   public static ll w(csv $$0) {
      return new ll().a(lm.C, a($$0, "_1"));
   }

   public static ll x(csv $$0) {
      return new ll().a(lm.D, G($$0));
   }

   public static ll y(csv $$0) {
      return new ll().a(lm.G, G($$0));
   }

   public static ll i(aex $$0) {
      return new ll().a(lm.G, $$0);
   }

   public static ll a(cja $$0) {
      return new ll().a(lm.c, c($$0));
   }

   public static ll z(csv $$0) {
      return new ll().a(lm.i, a($$0, "_side")).a(lm.g, a($$0, "_front")).a(lm.h, a($$0, "_back"));
   }

   public static ll A(csv $$0) {
      return new ll().a(lm.i, a($$0, "_side")).a(lm.g, a($$0, "_front")).a(lm.f, a($$0, "_top")).a(lm.e, a($$0, "_bottom"));
   }

   public static ll B(csv $$0) {
      return new ll().a(lm.i, a($$0, "_side")).a(lm.g, a($$0, "_front")).a(lm.f, a($$0, "_top"));
   }

   public static ll C(csv $$0) {
      return new ll().a(lm.i, a($$0, "_side")).a(lm.g, a($$0, "_front")).a(lm.d, a($$0, "_end"));
   }

   public static ll D(csv $$0) {
      return new ll().a(lm.f, a($$0, "_top"));
   }

   public static ll c(csv $$0, csv $$1) {
      return new ll()
         .a(lm.c, a($$0, "_front"))
         .a(lm.o, G($$1))
         .a(lm.n, a($$0, "_top"))
         .a(lm.j, a($$0, "_front"))
         .a(lm.l, a($$0, "_side"))
         .a(lm.k, a($$0, "_side"))
         .a(lm.m, a($$0, "_front"));
   }

   public static ll d(csv $$0, csv $$1) {
      return new ll()
         .a(lm.c, a($$0, "_front"))
         .a(lm.o, G($$1))
         .a(lm.n, a($$0, "_top"))
         .a(lm.j, a($$0, "_front"))
         .a(lm.k, a($$0, "_front"))
         .a(lm.l, a($$0, "_side"))
         .a(lm.m, a($$0, "_side"));
   }

   public static ll a(String $$0) {
      return new ll()
         .a(lm.c, a(csw.mg, $$0 + "_north"))
         .a(lm.e, a(csw.mg, $$0 + "_bottom"))
         .a(lm.f, a(csw.mg, $$0 + "_top"))
         .a(lm.j, a(csw.mg, $$0 + "_north"))
         .a(lm.k, a(csw.mg, $$0 + "_south"))
         .a(lm.l, a(csw.mg, $$0 + "_east"))
         .a(lm.m, a(csw.mg, $$0 + "_west"));
   }

   public static ll E(csv $$0) {
      return new ll().a(lm.K, a($$0, "_log_lit")).a(lm.C, a($$0, "_fire"));
   }

   public static ll a(csv $$0, boolean $$1) {
      return new ll()
         .a(lm.c, a(csw.eh, "_side"))
         .a(lm.e, a(csw.eh, "_bottom"))
         .a(lm.f, a(csw.eh, "_top"))
         .a(lm.i, a(csw.eh, "_side"))
         .a(lm.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static ll j(aex $$0) {
      return new ll()
         .a(lm.c, a(csw.ft, "_side"))
         .a(lm.i, a(csw.ft, "_side"))
         .a(lm.f, a(csw.ft, "_top"))
         .a(lm.e, a(csw.ft, "_bottom"))
         .a(lm.M, a(csw.ft, "_inner"))
         .a(lm.N, $$0);
   }

   public static ll a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new ll()
         .a(lm.c, a(csw.qI, "_bottom"))
         .a(lm.i, a(csw.qI, "_side"))
         .a(lm.f, a(csw.qI, "_top"))
         .a(lm.O, a(csw.qI, $$1 + "_inner_top"))
         .a(lm.e, a(csw.qI, "_bottom"));
   }

   public static ll b(cja $$0) {
      return new ll().a(lm.H, c($$0));
   }

   public static ll F(csv $$0) {
      return new ll().a(lm.H, G($$0));
   }

   public static ll k(aex $$0) {
      return new ll().a(lm.H, $$0);
   }

   public static ll c(aex $$0, aex $$1) {
      return new ll().a(lm.H, $$0).a(lm.I, $$1);
   }

   public static ll a(aex $$0, aex $$1, aex $$2) {
      return new ll().a(lm.H, $$0).a(lm.I, $$1).a(lm.J, $$2);
   }

   public static aex G(csv $$0) {
      aex $$1 = jd.f.b($$0);
      return $$1.d("block/");
   }

   public static aex a(csv $$0, String $$1) {
      aex $$2 = jd.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aex c(cja $$0) {
      aex $$1 = jd.i.b($$0);
      return $$1.d("item/");
   }

   public static aex a(cja $$0, String $$1) {
      aex $$2 = jd.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
