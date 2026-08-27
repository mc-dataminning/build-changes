import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class mm {
   private final Map<mn, agm> a = Maps.newHashMap();
   private final Set<mn> b = Sets.newHashSet();

   public mm a(mn $$0, agm $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public mm b(mn $$0, agm $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<mn> a() {
      return this.b.stream();
   }

   public mm a(mn $$0, mn $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public mm b(mn $$0, mn $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public agm a(mn $$0) {
      for (mn $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         agm $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public mm c(mn $$0, agm $$1) {
      mm $$2 = new mm();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static mm a(cvf $$0) {
      agm $$1 = G($$0);
      return b($$1);
   }

   public static mm b(cvf $$0) {
      agm $$1 = G($$0);
      return a($$1);
   }

   public static mm a(agm $$0) {
      return new mm().a(mn.b, $$0);
   }

   public static mm b(agm $$0) {
      return new mm().a(mn.a, $$0);
   }

   public static mm c(cvf $$0) {
      return d(mn.p, G($$0));
   }

   public static mm c(agm $$0) {
      return d(mn.p, $$0);
   }

   public static mm d(cvf $$0) {
      return d(mn.q, G($$0));
   }

   public static mm d(agm $$0) {
      return d(mn.q, $$0);
   }

   public static mm e(cvf $$0) {
      return d(mn.s, G($$0));
   }

   public static mm e(agm $$0) {
      return d(mn.s, $$0);
   }

   public static mm f(cvf $$0) {
      return d(mn.t, G($$0));
   }

   public static mm g(cvf $$0) {
      return new mm().a(mn.P, G($$0)).a(mn.y, a($$0, "_stem"));
   }

   public static mm f(agm $$0) {
      return d(mn.t, $$0);
   }

   public static mm h(cvf $$0) {
      return d(mn.y, G($$0));
   }

   public static mm a(cvf $$0, cvf $$1) {
      return new mm().a(mn.y, G($$0)).a(mn.z, G($$1));
   }

   public static mm i(cvf $$0) {
      return d(mn.u, G($$0));
   }

   public static mm j(cvf $$0) {
      return d(mn.x, G($$0));
   }

   public static mm g(agm $$0) {
      return d(mn.A, $$0);
   }

   public static mm b(cvf $$0, cvf $$1) {
      return new mm().a(mn.v, G($$0)).a(mn.w, a($$1, "_top"));
   }

   public static mm d(mn $$0, agm $$1) {
      return new mm().a($$0, $$1);
   }

   public static mm k(cvf $$0) {
      return new mm().a(mn.i, a($$0, "_side")).a(mn.d, a($$0, "_top"));
   }

   public static mm l(cvf $$0) {
      return new mm().a(mn.i, a($$0, "_side")).a(mn.f, a($$0, "_top"));
   }

   public static mm m(cvf $$0) {
      return new mm().a(mn.q, a($$0, "_plant")).a(mn.i, a($$0, "_side")).a(mn.f, a($$0, "_top"));
   }

   public static mm n(cvf $$0) {
      return new mm().a(mn.i, G($$0)).a(mn.d, a($$0, "_top")).a(mn.c, G($$0));
   }

   public static mm a(agm $$0, agm $$1) {
      return new mm().a(mn.i, $$0).a(mn.d, $$1);
   }

   public static mm o(cvf $$0) {
      return new mm().a(mn.b, G($$0)).a(mn.i, a($$0, "_side")).a(mn.f, a($$0, "_top"));
   }

   public static mm p(cvf $$0) {
      return new mm().a(mn.b, G($$0)).a(mn.c, a($$0, "_particle"));
   }

   public static mm q(cvf $$0) {
      return new mm().a(mn.i, a($$0, "_side")).a(mn.f, a($$0, "_top")).a(mn.e, a($$0, "_bottom"));
   }

   public static mm r(cvf $$0) {
      agm $$1 = G($$0);
      return new mm().a(mn.r, $$1).a(mn.i, $$1).a(mn.f, a($$0, "_top")).a(mn.e, a($$0, "_bottom"));
   }

   public static mm s(cvf $$0) {
      agm $$1 = G($$0);
      return new mm().a(mn.b, $$1).a(mn.r, $$1).a(mn.i, $$1).a(mn.d, a($$0, "_top"));
   }

   public static mm b(agm $$0, agm $$1) {
      return new mm().a(mn.f, $$0).a(mn.e, $$1);
   }

   public static mm t(cvf $$0) {
      return new mm().a(mn.f, a($$0, "_top")).a(mn.e, a($$0, "_bottom"));
   }

   public static mm u(cvf $$0) {
      return new mm().a(mn.c, G($$0));
   }

   public static mm h(agm $$0) {
      return new mm().a(mn.c, $$0);
   }

   public static mm v(cvf $$0) {
      return new mm().a(mn.C, a($$0, "_0"));
   }

   public static mm w(cvf $$0) {
      return new mm().a(mn.C, a($$0, "_1"));
   }

   public static mm x(cvf $$0) {
      return new mm().a(mn.D, G($$0));
   }

   public static mm y(cvf $$0) {
      return new mm().a(mn.G, G($$0));
   }

   public static mm i(agm $$0) {
      return new mm().a(mn.G, $$0);
   }

   public static mm a(clj $$0) {
      return new mm().a(mn.c, c($$0));
   }

   public static mm z(cvf $$0) {
      return new mm().a(mn.i, a($$0, "_side")).a(mn.g, a($$0, "_front")).a(mn.h, a($$0, "_back"));
   }

   public static mm A(cvf $$0) {
      return new mm().a(mn.i, a($$0, "_side")).a(mn.g, a($$0, "_front")).a(mn.f, a($$0, "_top")).a(mn.e, a($$0, "_bottom"));
   }

   public static mm B(cvf $$0) {
      return new mm().a(mn.i, a($$0, "_side")).a(mn.g, a($$0, "_front")).a(mn.f, a($$0, "_top"));
   }

   public static mm C(cvf $$0) {
      return new mm().a(mn.i, a($$0, "_side")).a(mn.g, a($$0, "_front")).a(mn.d, a($$0, "_end"));
   }

   public static mm D(cvf $$0) {
      return new mm().a(mn.f, a($$0, "_top"));
   }

   public static mm c(cvf $$0, cvf $$1) {
      return new mm()
         .a(mn.c, a($$0, "_front"))
         .a(mn.o, G($$1))
         .a(mn.n, a($$0, "_top"))
         .a(mn.j, a($$0, "_front"))
         .a(mn.l, a($$0, "_side"))
         .a(mn.k, a($$0, "_side"))
         .a(mn.m, a($$0, "_front"));
   }

   public static mm d(cvf $$0, cvf $$1) {
      return new mm()
         .a(mn.c, a($$0, "_front"))
         .a(mn.o, G($$1))
         .a(mn.n, a($$0, "_top"))
         .a(mn.j, a($$0, "_front"))
         .a(mn.k, a($$0, "_front"))
         .a(mn.l, a($$0, "_side"))
         .a(mn.m, a($$0, "_side"));
   }

   public static mm a(String $$0) {
      return new mm()
         .a(mn.c, a(cvh.mg, $$0 + "_north"))
         .a(mn.e, a(cvh.mg, $$0 + "_bottom"))
         .a(mn.f, a(cvh.mg, $$0 + "_top"))
         .a(mn.j, a(cvh.mg, $$0 + "_north"))
         .a(mn.k, a(cvh.mg, $$0 + "_south"))
         .a(mn.l, a(cvh.mg, $$0 + "_east"))
         .a(mn.m, a(cvh.mg, $$0 + "_west"));
   }

   public static mm E(cvf $$0) {
      return new mm().a(mn.K, a($$0, "_log_lit")).a(mn.C, a($$0, "_fire"));
   }

   public static mm a(cvf $$0, boolean $$1) {
      return new mm()
         .a(mn.c, a(cvh.eg, "_side"))
         .a(mn.e, a(cvh.eg, "_bottom"))
         .a(mn.f, a(cvh.eg, "_top"))
         .a(mn.i, a(cvh.eg, "_side"))
         .a(mn.L, a($$0, $$1 ? "_lit" : ""));
   }

   public static mm j(agm $$0) {
      return new mm()
         .a(mn.c, a(cvh.ft, "_side"))
         .a(mn.i, a(cvh.ft, "_side"))
         .a(mn.f, a(cvh.ft, "_top"))
         .a(mn.e, a(cvh.ft, "_bottom"))
         .a(mn.M, a(cvh.ft, "_inner"))
         .a(mn.N, $$0);
   }

   public static mm a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new mm()
         .a(mn.c, a(cvh.qV, "_bottom"))
         .a(mn.i, a(cvh.qV, "_side"))
         .a(mn.f, a(cvh.qV, "_top"))
         .a(mn.O, a(cvh.qV, $$1 + "_inner_top"))
         .a(mn.e, a(cvh.qV, "_bottom"));
   }

   public static mm b(clj $$0) {
      return new mm().a(mn.H, c($$0));
   }

   public static mm F(cvf $$0) {
      return new mm().a(mn.H, G($$0));
   }

   public static mm k(agm $$0) {
      return new mm().a(mn.H, $$0);
   }

   public static mm c(agm $$0, agm $$1) {
      return new mm().a(mn.H, $$0).a(mn.I, $$1);
   }

   public static mm a(agm $$0, agm $$1, agm $$2) {
      return new mm().a(mn.H, $$0).a(mn.I, $$1).a(mn.J, $$2);
   }

   public static agm G(cvf $$0) {
      agm $$1 = kc.f.b($$0);
      return $$1.d("block/");
   }

   public static agm a(cvf $$0, String $$1) {
      agm $$2 = kc.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static agm c(clj $$0) {
      agm $$1 = kc.i.b($$0);
      return $$1.d("item/");
   }

   public static agm a(clj $$0, String $$1) {
      agm $$2 = kc.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
