import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class lh {
   private final Map<li, acq> a = Maps.newHashMap();
   private final Set<li> b = Sets.newHashSet();

   public lh a(li $$0, acq $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public lh b(li $$0, acq $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<li> a() {
      return this.b.stream();
   }

   public lh a(li $$0, li $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public lh b(li $$0, li $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public acq a(li $$0) {
      for (li $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         acq $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public lh c(li $$0, acq $$1) {
      lh $$2 = new lh();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static lh a(cpn $$0) {
      acq $$1 = G($$0);
      return b($$1);
   }

   public static lh b(cpn $$0) {
      acq $$1 = G($$0);
      return a($$1);
   }

   public static lh a(acq $$0) {
      return new lh().a(li.b, $$0);
   }

   public static lh b(acq $$0) {
      return new lh().a(li.a, $$0);
   }

   public static lh c(cpn $$0) {
      return d(li.p, G($$0));
   }

   public static lh c(acq $$0) {
      return d(li.p, $$0);
   }

   public static lh d(cpn $$0) {
      return d(li.q, G($$0));
   }

   public static lh d(acq $$0) {
      return d(li.q, $$0);
   }

   public static lh e(cpn $$0) {
      return d(li.s, G($$0));
   }

   public static lh e(acq $$0) {
      return d(li.s, $$0);
   }

   public static lh f(cpn $$0) {
      return d(li.t, G($$0));
   }

   public static lh g(cpn $$0) {
      return new lh().a(li.P, G($$0)).a(li.y, a($$0, "_stem"));
   }

   public static lh f(acq $$0) {
      return d(li.t, $$0);
   }

   public static lh h(cpn $$0) {
      return d(li.y, G($$0));
   }

   public static lh a(cpn $$0, cpn $$1) {
      return new lh().a(li.y, G($$0)).a(li.z, G($$1));
   }

   public static lh i(cpn $$0) {
      return d(li.u, G($$0));
   }

   public static lh j(cpn $$0) {
      return d(li.x, G($$0));
   }

   public static lh g(acq $$0) {
      return d(li.A, $$0);
   }

   public static lh b(cpn $$0, cpn $$1) {
      return new lh().a(li.v, G($$0)).a(li.w, a($$1, "_top"));
   }

   public static lh d(li $$0, acq $$1) {
      return new lh().a($$0, $$1);
   }

   public static lh k(cpn $$0) {
      return new lh().a(li.i, a($$0, "_side")).a(li.d, a($$0, "_top"));
   }

   public static lh l(cpn $$0) {
      return new lh().a(li.i, a($$0, "_side")).a(li.f, a($$0, "_top"));
   }

   public static lh m(cpn $$0) {
      return new lh().a(li.q, a($$0, "_plant")).a(li.i, a($$0, "_side")).a(li.f, a($$0, "_top"));
   }

   public static lh n(cpn $$0) {
      return new lh().a(li.i, G($$0)).a(li.d, a($$0, "_top")).a(li.c, G($$0));
   }

   public static lh a(acq $$0, acq $$1) {
      return new lh().a(li.i, $$0).a(li.d, $$1);
   }

   public static lh o(cpn $$0) {
      return new lh().a(li.b, G($$0)).a(li.i, a($$0, "_side")).a(li.f, a($$0, "_top"));
   }

   public static lh p(cpn $$0) {
      return new lh().a(li.b, G($$0)).a(li.c, a($$0, "_particle"));
   }

   public static lh q(cpn $$0) {
      return new lh().a(li.i, a($$0, "_side")).a(li.f, a($$0, "_top")).a(li.e, a($$0, "_bottom"));
   }

   public static lh r(cpn $$0) {
      acq $$1 = G($$0);
      return new lh().a(li.r, $$1).a(li.i, $$1).a(li.f, a($$0, "_top")).a(li.e, a($$0, "_bottom"));
   }

   public static lh s(cpn $$0) {
      acq $$1 = G($$0);
      return new lh().a(li.b, $$1).a(li.r, $$1).a(li.i, $$1).a(li.d, a($$0, "_top"));
   }

   public static lh b(acq $$0, acq $$1) {
      return new lh().a(li.f, $$0).a(li.e, $$1);
   }

   public static lh t(cpn $$0) {
      return new lh().a(li.f, a($$0, "_top")).a(li.e, a($$0, "_bottom"));
   }

   public static lh u(cpn $$0) {
      return new lh().a(li.c, G($$0));
   }

   public static lh h(acq $$0) {
      return new lh().a(li.c, $$0);
   }

   public static lh v(cpn $$0) {
      return new lh().a(li.C, a($$0, "_0"));
   }

   public static lh w(cpn $$0) {
      return new lh().a(li.C, a($$0, "_1"));
   }

   public static lh x(cpn $$0) {
      return new lh().a(li.D, G($$0));
   }

   public static lh y(cpn $$0) {
      return new lh().a(li.G, G($$0));
   }

   public static lh i(acq $$0) {
      return new lh().a(li.G, $$0);
   }

   public static lh a(cfu $$0) {
      return new lh().a(li.c, c($$0));
   }

   public static lh z(cpn $$0) {
      return new lh().a(li.i, a($$0, "_side")).a(li.g, a($$0, "_front")).a(li.h, a($$0, "_back"));
   }

   public static lh A(cpn $$0) {
      return new lh().a(li.i, a($$0, "_side")).a(li.g, a($$0, "_front")).a(li.f, a($$0, "_top")).a(li.e, a($$0, "_bottom"));
   }

   public static lh B(cpn $$0) {
      return new lh().a(li.i, a($$0, "_side")).a(li.g, a($$0, "_front")).a(li.f, a($$0, "_top"));
   }

   public static lh C(cpn $$0) {
      return new lh().a(li.i, a($$0, "_side")).a(li.g, a($$0, "_front")).a(li.d, a($$0, "_end"));
   }

   public static lh D(cpn $$0) {
      return new lh().a(li.f, a($$0, "_top"));
   }

   public static lh c(cpn $$0, cpn $$1) {
      return new lh()
         .a(li.c, a($$0, "_front"))
         .a(li.o, G($$1))
         .a(li.n, a($$0, "_top"))
         .a(li.j, a($$0, "_front"))
         .a(li.l, a($$0, "_side"))
         .a(li.k, a($$0, "_side"))
         .a(li.m, a($$0, "_front"));
   }

   public static lh d(cpn $$0, cpn $$1) {
      return new lh()
         .a(li.c, a($$0, "_front"))
         .a(li.o, G($$1))
         .a(li.n, a($$0, "_top"))
         .a(li.j, a($$0, "_front"))
         .a(li.k, a($$0, "_front"))
         .a(li.l, a($$0, "_side"))
         .a(li.m, a($$0, "_side"));
   }

   public static lh a(String $$0) {
      return new lh()
         .a(li.c, a(cpo.mg, $$0 + "_north"))
         .a(li.e, a(cpo.mg, $$0 + "_bottom"))
         .a(li.f, a(cpo.mg, $$0 + "_top"))
         .a(li.j, a(cpo.mg, $$0 + "_north"))
         .a(li.k, a(cpo.mg, $$0 + "_south"))
         .a(li.l, a(cpo.mg, $$0 + "_east"))
         .a(li.m, a(cpo.mg, $$0 + "_west"));
   }

   public static lh E(cpn $$0) {
      return new lh().a(li.K, a($$0, "_log_lit")).a(li.C, a($$0, "_fire"));
   }

   public static lh a(cpn $$0, boolean $$1) {
      return new lh()
         .a(li.c, a(cpo.eh, "_side"))
         .a(li.e, a(cpo.eh, "_bottom"))
         .a(li.f, a(cpo.eh, "_top"))
         .a(li.i, a(cpo.eh, "_side"))
         .a(li.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static lh j(acq $$0) {
      return new lh()
         .a(li.c, a(cpo.ft, "_side"))
         .a(li.i, a(cpo.ft, "_side"))
         .a(li.f, a(cpo.ft, "_top"))
         .a(li.e, a(cpo.ft, "_bottom"))
         .a(li.M, a(cpo.ft, "_inner"))
         .a(li.N, $$0);
   }

   public static lh a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new lh()
         .a(li.c, a(cpo.qI, "_bottom"))
         .a(li.i, a(cpo.qI, "_side"))
         .a(li.f, a(cpo.qI, "_top"))
         .a(li.O, a(cpo.qI, $$1 + "_inner_top"))
         .a(li.e, a(cpo.qI, "_bottom"));
   }

   public static lh b(cfu $$0) {
      return new lh().a(li.H, c($$0));
   }

   public static lh F(cpn $$0) {
      return new lh().a(li.H, G($$0));
   }

   public static lh k(acq $$0) {
      return new lh().a(li.H, $$0);
   }

   public static lh c(acq $$0, acq $$1) {
      return new lh().a(li.H, $$0).a(li.I, $$1);
   }

   public static lh a(acq $$0, acq $$1, acq $$2) {
      return new lh().a(li.H, $$0).a(li.I, $$1).a(li.J, $$2);
   }

   public static acq G(cpn $$0) {
      acq $$1 = jb.f.b($$0);
      return $$1.d("block/");
   }

   public static acq a(cpn $$0, String $$1) {
      acq $$2 = jb.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static acq c(cfu $$0) {
      acq $$1 = jb.i.b($$0);
      return $$1.d("item/");
   }

   public static acq a(cfu $$0, String $$1) {
      acq $$2 = jb.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
