import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class nk {
   final Consumer<nn> b;
   final BiConsumer<akk, Supplier<JsonElement>> c;
   private final Consumer<ctx> d;
   final List<dfh> e = ImmutableList.of(dfj.ey, dfj.eE, dfj.hY);
   final Map<dfh, nk.c> f = ImmutableMap.builder().put(dfj.b, nk::a).put(dfj.sJ, nk::c).put(dfj.eM, nk::b).build();
   final Map<dfh, od> g = ImmutableMap.builder()
      .put(dfj.aV, od.y.get(dfj.aV))
      .put(dfj.jp, od.y.get(dfj.jp))
      .put(dfj.jS, od.a(ob.a(dfj.aV, "_top")))
      .put(dfj.jU, od.a(ob.a(dfj.jp, "_top")))
      .put(dfj.aX, od.d.get(dfj.aV).a($$0x -> $$0x.a(oc.i, ob.G(dfj.aX))))
      .put(dfj.jr, od.d.get(dfj.jp).a($$0x -> $$0x.a(oc.i, ob.G(dfj.jr))))
      .put(dfj.hd, od.d.get(dfj.hd))
      .put(dfj.jT, od.a(ob.a(dfj.hd, "_bottom")))
      .put(dfj.pr, od.z.get(dfj.pr))
      .put(dfj.sJ, od.z.get(dfj.sJ))
      .put(dfj.he, od.d.get(dfj.he).a($$0x -> $$0x.a(oc.i, ob.G(dfj.he))))
      .put(dfj.aW, od.d.get(dfj.aW).a($$0x -> {
         $$0x.a(oc.d, ob.a(dfj.aV, "_top"));
         $$0x.a(oc.i, ob.G(dfj.aW));
      }))
      .put(dfj.jq, od.d.get(dfj.jq).a($$0x -> {
         $$0x.a(oc.d, ob.a(dfj.jp, "_top"));
         $$0x.a(oc.i, ob.G(dfj.jq));
      }))
      .put(dfj.qM, od.z.get(dfj.qM))
      .put(dfj.qH, od.z.get(dfj.qH))
      .build();
   static final Map<lu.b, BiConsumer<nk.b, dfh>> h = ImmutableMap.builder()
      .put(lu.b.a, nk.b::a)
      .put(lu.b.e, nk.b::l)
      .put(lu.b.b, nk.b::k)
      .put(lu.b.c, nk.b::k)
      .put(lu.b.f, nk.b::c)
      .put(lu.b.g, nk.b::d)
      .put(lu.b.h, nk.b::e)
      .put(lu.b.i, nk.b::f)
      .put(lu.b.k, nk.b::h)
      .put(lu.b.l, nk.b::i)
      .put(lu.b.m, nk.b::j)
      .put(lu.b.n, nk.b::g)
      .put(lu.b.p, nk.b::m)
      .put(lu.b.q, nk.b::b)
      .build();
   public static final List<Pair<dtb, Function<akk, nt>>> a = List.of(
      Pair.of(dta.L, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0)),
      Pair.of(dta.M, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.b, nu.a.b).a(nu.d, true)),
      Pair.of(dta.N, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.b, nu.a.c).a(nu.d, true)),
      Pair.of(dta.O, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.b, nu.a.d).a(nu.d, true)),
      Pair.of(dta.J, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.a, nu.a.d).a(nu.d, true)),
      Pair.of(dta.K, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.a, nu.a.b).a(nu.d, true))
   );
   private static final Map<nk.d, akk> i = new HashMap<>();

   private static nn a(dfh $$0, akk $$1, ob $$2, BiConsumer<akk, Supplier<JsonElement>> $$3) {
      akk $$4 = oa.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nn b(dfh $$0, akk $$1, ob $$2, BiConsumer<akk, Supplier<JsonElement>> $$3) {
      akk $$4 = oa.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nn c(dfh $$0, akk $$1, ob $$2, BiConsumer<akk, Supplier<JsonElement>> $$3) {
      akk $$4 = oa.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nk(Consumer<nn> $$0, BiConsumer<akk, Supplier<JsonElement>> $$1, Consumer<ctx> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dfh $$0) {
      this.d.accept($$0.r());
   }

   void a(dfh $$0, akk $$1) {
      this.c.accept(ny.a($$0.r()), new nx($$1));
   }

   private void a(ctx $$0, akk $$1) {
      this.c.accept(ny.a($$0), new nx($$1));
   }

   void a(ctx $$0) {
      oa.bx.a(ny.a($$0), ob.b($$0), this.c);
   }

   private void d(dfh $$0) {
      ctx $$1 = $$0.r();
      if ($$1 != cuf.a) {
         oa.bx.a(ny.a($$1), ob.F($$0), this.c);
      }
   }

   private void a(dfh $$0, String $$1) {
      ctx $$2 = $$0.r();
      oa.bx.a(ny.a($$2), ob.k(ob.a($$0, $$1)), this.c);
   }

   private static nr b() {
      return nr.a(dta.R).a(jf.f, nt.a().a(nu.b, nu.a.b)).a(jf.d, nt.a().a(nu.b, nu.a.c)).a(jf.e, nt.a().a(nu.b, nu.a.d)).a(jf.c, nt.a());
   }

   private static nr c() {
      return nr.a(dta.R).a(jf.d, nt.a()).a(jf.e, nt.a().a(nu.b, nu.a.b)).a(jf.c, nt.a().a(nu.b, nu.a.c)).a(jf.f, nt.a().a(nu.b, nu.a.d));
   }

   private static nr d() {
      return nr.a(dta.R).a(jf.f, nt.a()).a(jf.d, nt.a().a(nu.b, nu.a.b)).a(jf.e, nt.a().a(nu.b, nu.a.c)).a(jf.c, nt.a().a(nu.b, nu.a.d));
   }

   private static nr e() {
      return nr.a(dta.P)
         .a(jf.a, nt.a().a(nu.a, nu.a.b))
         .a(jf.b, nt.a().a(nu.a, nu.a.d))
         .a(jf.c, nt.a())
         .a(jf.d, nt.a().a(nu.b, nu.a.c))
         .a(jf.e, nt.a().a(nu.b, nu.a.d))
         .a(jf.f, nt.a().a(nu.b, nu.a.b));
   }

   private static nq b(dfh $$0, akk $$1) {
      return nq.a($$0, a($$1));
   }

   private static nt[] a(akk $$0) {
      return new nt[]{nt.a().a(nu.c, $$0), nt.a().a(nu.c, $$0).a(nu.b, nu.a.b), nt.a().a(nu.c, $$0).a(nu.b, nu.a.c), nt.a().a(nu.c, $$0).a(nu.b, nu.a.d)};
   }

   private static nq a(dfh $$0, akk $$1, akk $$2) {
      return nq.a($$0, nt.a().a(nu.c, $$1), nt.a().a(nu.c, $$2), nt.a().a(nu.c, $$1).a(nu.b, nu.a.c), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c));
   }

   private static nr a(dtb $$0, akk $$1, akk $$2) {
      return nr.a($$0).a(true, nt.a().a(nu.c, $$1)).a(false, nt.a().a(nu.c, $$2));
   }

   private void e(dfh $$0) {
      akk $$1 = od.a.create($$0, this.c);
      akk $$2 = od.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dfh $$0) {
      akk $$1 = od.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dfh $$0) {
      this.b.accept(nq.a($$0).a(nr.a(dta.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akk $$3 = ob.a($$0, $$2);
         return nt.a().a(nu.c, oa.c.a($$0, $$2, new ob().a(oc.a, $$3), this.c));
      })));
      this.a($$0, ob.a($$0, "_0"));
   }

   static nn b(dfh $$0, akk $$1, akk $$2) {
      return nq.a($$0)
         .a(nr.a(dta.w).a(false, nt.a().a(nu.c, $$1)).a(true, nt.a().a(nu.c, $$2)))
         .a(
            nr.a(dta.U, dta.R)
               .a(dsv.a, jf.f, nt.a().a(nu.b, nu.a.b))
               .a(dsv.a, jf.e, nt.a().a(nu.b, nu.a.d))
               .a(dsv.a, jf.d, nt.a().a(nu.b, nu.a.c))
               .a(dsv.a, jf.c, nt.a())
               .a(dsv.b, jf.f, nt.a().a(nu.b, nu.a.b).a(nu.a, nu.a.b).a(nu.d, true))
               .a(dsv.b, jf.e, nt.a().a(nu.b, nu.a.d).a(nu.a, nu.a.b).a(nu.d, true))
               .a(dsv.b, jf.d, nt.a().a(nu.b, nu.a.c).a(nu.a, nu.a.b).a(nu.d, true))
               .a(dsv.b, jf.c, nt.a().a(nu.a, nu.a.b).a(nu.d, true))
               .a(dsv.c, jf.f, nt.a().a(nu.b, nu.a.d).a(nu.a, nu.a.c))
               .a(dsv.c, jf.e, nt.a().a(nu.b, nu.a.b).a(nu.a, nu.a.c))
               .a(dsv.c, jf.d, nt.a().a(nu.a, nu.a.c))
               .a(dsv.c, jf.c, nt.a().a(nu.b, nu.a.c).a(nu.a, nu.a.c))
         );
   }

   private static nr.d<jf, dtg, dtf, Boolean> a(nr.d<jf, dtg, dtf, Boolean> $$0, dtg $$1, akk $$2, akk $$3, akk $$4, akk $$5) {
      return $$0.a(jf.f, $$1, dtf.a, false, nt.a().a(nu.c, $$2))
         .a(jf.d, $$1, dtf.a, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
         .a(jf.e, $$1, dtf.a, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
         .a(jf.c, $$1, dtf.a, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
         .a(jf.f, $$1, dtf.b, false, nt.a().a(nu.c, $$4))
         .a(jf.d, $$1, dtf.b, false, nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
         .a(jf.e, $$1, dtf.b, false, nt.a().a(nu.c, $$4).a(nu.b, nu.a.c))
         .a(jf.c, $$1, dtf.b, false, nt.a().a(nu.c, $$4).a(nu.b, nu.a.d))
         .a(jf.f, $$1, dtf.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
         .a(jf.d, $$1, dtf.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
         .a(jf.e, $$1, dtf.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
         .a(jf.c, $$1, dtf.a, true, nt.a().a(nu.c, $$3))
         .a(jf.f, $$1, dtf.b, true, nt.a().a(nu.c, $$5).a(nu.b, nu.a.d))
         .a(jf.d, $$1, dtf.b, true, nt.a().a(nu.c, $$5))
         .a(jf.e, $$1, dtf.b, true, nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
         .a(jf.c, $$1, dtf.b, true, nt.a().a(nu.c, $$5).a(nu.b, nu.a.c));
   }

   private static nn a(dfh $$0, akk $$1, akk $$2, akk $$3, akk $$4, akk $$5, akk $$6, akk $$7, akk $$8) {
      return nq.a($$0).a(a(a(nr.a(dta.R, dta.ae, dta.be, dta.u), dtg.b, $$1, $$2, $$3, $$4), dtg.a, $$5, $$6, $$7, $$8));
   }

   static nn a(dfh $$0, akk $$1, akk $$2, akk $$3, akk $$4, akk $$5) {
      return np.a($$0)
         .a(nt.a().a(nu.c, $$1))
         .a(no.a().a(dta.L, true), nt.a().a(nu.c, $$2).a(nu.d, false))
         .a(no.a().a(dta.M, true), nt.a().a(nu.c, $$3).a(nu.d, false))
         .a(no.a().a(dta.N, true), nt.a().a(nu.c, $$4).a(nu.d, false))
         .a(no.a().a(dta.O, true), nt.a().a(nu.c, $$5).a(nu.d, false));
   }

   static nn c(dfh $$0, akk $$1, akk $$2) {
      return np.a($$0)
         .a(nt.a().a(nu.c, $$1))
         .a(no.a().a(dta.L, true), nt.a().a(nu.c, $$2).a(nu.d, true))
         .a(no.a().a(dta.M, true), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true))
         .a(no.a().a(dta.N, true), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true))
         .a(no.a().a(dta.O, true), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true));
   }

   static nn a(dfh $$0, akk $$1, akk $$2, akk $$3) {
      return np.a($$0)
         .a(no.a().a(dta.J, true), nt.a().a(nu.c, $$1))
         .a(no.a().a(dta.X, dtw.b), nt.a().a(nu.c, $$2).a(nu.d, true))
         .a(no.a().a(dta.W, dtw.b), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true))
         .a(no.a().a(dta.Y, dtw.b), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true))
         .a(no.a().a(dta.Z, dtw.b), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true))
         .a(no.a().a(dta.X, dtw.c), nt.a().a(nu.c, $$3).a(nu.d, true))
         .a(no.a().a(dta.W, dtw.c), nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true))
         .a(no.a().a(dta.Y, dtw.c), nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true))
         .a(no.a().a(dta.Z, dtw.c), nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true));
   }

   static nn a(dfh $$0, akk $$1, akk $$2, akk $$3, akk $$4, boolean $$5) {
      return nq.a($$0, nt.a().a(nu.d, $$5))
         .a(c())
         .a(
            nr.a(dta.q, dta.u)
               .a(false, false, nt.a().a(nu.c, $$2))
               .a(true, false, nt.a().a(nu.c, $$4))
               .a(false, true, nt.a().a(nu.c, $$1))
               .a(true, true, nt.a().a(nu.c, $$3))
         );
   }

   static nn b(dfh $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0)
         .a(
            nr.a(dta.R, dta.af, dta.bi)
               .a(jf.f, dtj.b, dtt.a, nt.a().a(nu.c, $$2))
               .a(jf.e, dtj.b, dtt.a, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtj.b, dtt.a, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtj.b, dtt.a, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtj.b, dtt.e, nt.a().a(nu.c, $$3))
               .a(jf.e, dtj.b, dtt.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtj.b, dtt.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtj.b, dtt.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtj.b, dtt.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.e, dtj.b, dtt.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.d, dtj.b, dtt.d, nt.a().a(nu.c, $$3))
               .a(jf.c, dtj.b, dtt.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.f, dtj.b, dtt.c, nt.a().a(nu.c, $$1))
               .a(jf.e, dtj.b, dtt.c, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtj.b, dtt.c, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtj.b, dtt.c, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtj.b, dtt.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.e, dtj.b, dtt.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.d, dtj.b, dtt.b, nt.a().a(nu.c, $$1))
               .a(jf.c, dtj.b, dtt.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.f, dtj.a, dtt.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.e, dtj.a, dtt.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtj.a, dtt.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtj.a, dtt.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtj.a, dtt.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.e, dtj.a, dtt.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.d, dtj.a, dtt.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.c, dtj.a, dtt.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.f, dtj.a, dtt.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.e, dtj.a, dtt.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtj.a, dtt.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtj.a, dtt.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtj.a, dtt.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.e, dtj.a, dtt.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.d, dtj.a, dtt.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.c, dtj.a, dtt.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.f, dtj.a, dtt.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.e, dtj.a, dtt.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtj.a, dtt.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtj.a, dtt.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
         );
   }

   private static nn c(dfh $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0)
         .a(
            nr.a(dta.R, dta.af, dta.u)
               .a(jf.c, dtj.b, false, nt.a().a(nu.c, $$2))
               .a(jf.d, dtj.b, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
               .a(jf.f, dtj.b, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
               .a(jf.e, dtj.b, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
               .a(jf.c, dtj.a, false, nt.a().a(nu.c, $$1))
               .a(jf.d, dtj.a, false, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
               .a(jf.f, dtj.a, false, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
               .a(jf.e, dtj.a, false, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
               .a(jf.c, dtj.b, true, nt.a().a(nu.c, $$3))
               .a(jf.d, dtj.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(jf.f, dtj.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(jf.e, dtj.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               .a(jf.c, dtj.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.c))
               .a(jf.d, dtj.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.a))
               .a(jf.f, dtj.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.d))
               .a(jf.e, dtj.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.b))
         );
   }

   private static nn d(dfh $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0)
         .a(
            nr.a(dta.R, dta.af, dta.u)
               .a(jf.c, dtj.b, false, nt.a().a(nu.c, $$2))
               .a(jf.d, dtj.b, false, nt.a().a(nu.c, $$2))
               .a(jf.f, dtj.b, false, nt.a().a(nu.c, $$2))
               .a(jf.e, dtj.b, false, nt.a().a(nu.c, $$2))
               .a(jf.c, dtj.a, false, nt.a().a(nu.c, $$1))
               .a(jf.d, dtj.a, false, nt.a().a(nu.c, $$1))
               .a(jf.f, dtj.a, false, nt.a().a(nu.c, $$1))
               .a(jf.e, dtj.a, false, nt.a().a(nu.c, $$1))
               .a(jf.c, dtj.b, true, nt.a().a(nu.c, $$3))
               .a(jf.d, dtj.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(jf.f, dtj.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(jf.e, dtj.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               .a(jf.c, dtj.a, true, nt.a().a(nu.c, $$3))
               .a(jf.d, dtj.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(jf.f, dtj.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(jf.e, dtj.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
         );
   }

   static nq c(dfh $$0, akk $$1) {
      return nq.a($$0, nt.a().a(nu.c, $$1));
   }

   private static nr f() {
      return nr.a(dta.I).a(jf.a.b, nt.a()).a(jf.a.c, nt.a().a(nu.a, nu.a.b)).a(jf.a.a, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b));
   }

   static nn a(dfh $$0, ob $$1, BiConsumer<akk, Supplier<JsonElement>> $$2) {
      akk $$3 = oa.g.a($$0, $$1, $$2);
      akk $$4 = oa.h.a($$0, $$1, $$2);
      akk $$5 = oa.i.a($$0, $$1, $$2);
      akk $$6 = oa.j.a($$0, $$1, $$2);
      return nq.a($$0, nt.a().a(nu.c, $$6)).a(nr.a(dta.I).a(jf.a.a, nt.a().a(nu.c, $$3)).a(jf.a.b, nt.a().a(nu.c, $$4)).a(jf.a.c, nt.a().a(nu.c, $$5)));
   }

   static nn d(dfh $$0, akk $$1) {
      return nq.a($$0, nt.a().a(nu.c, $$1)).a(f());
   }

   private void e(dfh $$0, akk $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dfh $$0, od.a $$1) {
      akk $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dfh $$0, od.a $$1) {
      akk $$2 = $$1.create($$0, this.c);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, $$2)).a(b()));
   }

   static nn d(dfh $$0, akk $$1, akk $$2) {
      return nq.a($$0)
         .a(
            nr.a(dta.I)
               .a(jf.a.b, nt.a().a(nu.c, $$1))
               .a(jf.a.c, nt.a().a(nu.c, $$2).a(nu.a, nu.a.b))
               .a(jf.a.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.b).a(nu.b, nu.a.b))
         );
   }

   private void a(dfh $$0, od.a $$1, od.a $$2) {
      akk $$3 = $$1.create($$0, this.c);
      akk $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akk a(dfh $$0, String $$1, nz $$2, Function<akk, ob> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ob.a($$0, $$1)), this.c);
   }

   static nn e(dfh $$0, akk $$1, akk $$2) {
      return nq.a($$0).a(a(dta.w, $$2, $$1));
   }

   static nn e(dfh $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0).a(nr.a(dta.bh).a(dts.b, nt.a().a(nu.c, $$1)).a(dts.a, nt.a().a(nu.c, $$2)).a(dts.c, nt.a().a(nu.c, $$3)));
   }

   public void a(dfh $$0) {
      this.b($$0, od.a);
   }

   public void b(dfh $$0, od.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dfh $$0, ob $$1, nz $$2) {
      akk $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nk.b h(dfh $$0) {
      od $$1 = this.g.getOrDefault($$0, od.a.get($$0));
      return new nk.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dfh $$0, dfh $$1, dfh $$2) {
      ob $$3 = ob.u($$0);
      akk $$4 = oa.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dfh $$0) {
      ob $$1 = ob.t($$0);
      akk $$2 = oa.v.a($$0, $$1, this.c);
      akk $$3 = oa.w.a($$0, $$1, this.c);
      akk $$4 = oa.x.a($$0, $$1, this.c);
      akk $$5 = oa.y.a($$0, $$1, this.c);
      akk $$6 = oa.z.a($$0, $$1, this.c);
      akk $$7 = oa.A.a($$0, $$1, this.c);
      akk $$8 = oa.B.a($$0, $$1, this.c);
      akk $$9 = oa.C.a($$0, $$1, this.c);
      this.a($$0.r());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dfh $$0, dfh $$1) {
      akk $$2 = oa.v.a($$0);
      akk $$3 = oa.w.a($$0);
      akk $$4 = oa.x.a($$0);
      akk $$5 = oa.y.a($$0);
      akk $$6 = oa.z.a($$0);
      akk $$7 = oa.A.a($$0);
      akk $$8 = oa.B.a($$0);
      akk $$9 = oa.C.a($$0);
      this.a($$1, ny.a($$0.r()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dfh $$0) {
      ob $$1 = ob.b($$0);
      akk $$2 = oa.ak.a($$0, $$1, this.c);
      akk $$3 = oa.al.a($$0, $$1, this.c);
      akk $$4 = oa.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dfh $$0) {
      ob $$1 = ob.b($$0);
      akk $$2 = oa.ah.a($$0, $$1, this.c);
      akk $$3 = oa.ai.a($$0, $$1, this.c);
      akk $$4 = oa.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dfh $$0, dfh $$1) {
      akk $$2 = oa.ah.a($$0);
      akk $$3 = oa.ai.a($$0);
      akk $$4 = oa.aj.a($$0);
      this.a($$1, ny.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dfj.sD);
      akk $$0 = ny.a(dfj.sD);
      akk $$1 = ny.a(dfj.sD, "_partial_tilt");
      akk $$2 = ny.a(dfj.sD, "_full_tilt");
      this.b
         .accept(
            nq.a(dfj.sD)
               .a(b())
               .a(nr.a(dta.bl).a(dtv.a, nt.a().a(nu.c, $$0)).a(dtv.b, nt.a().a(nu.c, $$0)).a(dtv.c, nt.a().a(nu.c, $$1)).a(dtv.d, nt.a().a(nu.c, $$2)))
         );
   }

   private nk.f l(dfh $$0) {
      return new nk.f(ob.n($$0));
   }

   private void m(dfh $$0) {
      this.c($$0, $$0);
   }

   private void c(dfh $$0, dfh $$1) {
      this.b.accept(c($$0, ny.a($$1)));
   }

   private void a(dfh $$0, nk.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dfh $$0, nk.e $$1, ob $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfh $$0, nk.e $$1) {
      ob $$2 = ob.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfh $$0, nk.e $$1, ob $$2) {
      akk $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dfh $$0, nk.e $$1, dtn<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         nr $$4 = nr.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            ob $$5 = ob.c(ob.a($$0, $$4x));
            akk $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return nt.a().a(nu.c, $$6);
         });
         this.a($$0.r());
         this.b.accept(nq.a($$0).a($$4));
      }
   }

   private void a(dfh $$0, dfh $$1, nk.e $$2) {
      this.a($$0, $$2);
      ob $$3 = ob.d($$0);
      akk $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dfh $$0, dfh $$1) {
      od $$2 = od.p.get($$0);
      akk $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akk $$4 = oa.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nq.a($$1, nt.a().a(nu.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dfh $$0, dfh $$1) {
      this.a($$0.r());
      ob $$2 = ob.h($$0);
      ob $$3 = ob.a($$0, $$1);
      akk $$4 = oa.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nq.a($$1, nt.a().a(nu.c, $$4))
               .a(nr.a(dta.R).a(jf.e, nt.a()).a(jf.d, nt.a().a(nu.b, nu.a.d)).a(jf.c, nt.a().a(nu.b, nu.a.b)).a(jf.f, nt.a().a(nu.b, nu.a.c)))
         );
      this.b.accept(nq.a($$0).a(nr.a(dta.av).a($$2x -> nt.a().a(nu.c, oa.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dfh $$0 = dfj.kC;
      this.a($$0.r());
      akk $$1 = ny.a($$0, "_top");
      akk $$2 = ny.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dfh $$0 = dfj.kB;
      this.a($$0.r());
      nr $$1 = nr.a(dkw.d, dta.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> nt.a().a(nu.c, ny.a($$0, "_top_stage_" + $$1x));
            case b -> nt.a().a(nu.c, ny.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nq.a($$0).a($$1));
   }

   private void a(dfh $$0, dfh $$1, dfh $$2, dfh $$3, dfh $$4, dfh $$5, dfh $$6, dfh $$7) {
      this.a($$0, nk.e.b);
      this.a($$1, nk.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dfh $$0, nk.e $$1) {
      this.a($$0, "_top");
      akk $$2 = this.a($$0, "_top", $$1.a(), ob::c);
      akk $$3 = this.a($$0, "_bottom", $$1.a(), ob::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dfj.iD, "_front");
      akk $$0 = ny.a(dfj.iD, "_top");
      akk $$1 = this.a(dfj.iD, "_bottom", nk.e.b.a(), ob::c);
      this.f(dfj.iD, $$0, $$1);
   }

   private void k() {
      akk $$0 = this.a(dfj.bx, "_top", oa.bk, ob::a);
      akk $$1 = this.a(dfj.bx, "_bottom", oa.bk, ob::a);
      this.f(dfj.bx, $$0, $$1);
   }

   private void l() {
      this.c(dfj.sF);
      akk $$0 = ny.a(dfj.sF, "_top");
      akk $$1 = ny.a(dfj.sF, "_bottom");
      this.b.accept(nq.a(dfj.sF).a(b()).a(nr.a(dta.ae).a(dtg.b, nt.a().a(nu.c, $$1)).a(dtg.a, nt.a().a(nu.c, $$0))));
   }

   private void f(dfh $$0, akk $$1, akk $$2) {
      this.b.accept(nq.a($$0).a(nr.a(dta.ae).a(dtg.b, nt.a().a(nu.c, $$2)).a(dtg.a, nt.a().a(nu.c, $$1))));
   }

   private void n(dfh $$0) {
      ob $$1 = ob.e($$0);
      ob $$2 = ob.e(ob.a($$0, "_corner"));
      akk $$3 = oa.as.a($$0, $$1, this.c);
      akk $$4 = oa.at.a($$0, $$2, this.c);
      akk $$5 = oa.au.a($$0, $$1, this.c);
      akk $$6 = oa.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nq.a($$0)
               .a(
                  nr.a(dta.ag)
                     .a(dto.a, nt.a().a(nu.c, $$3))
                     .a(dto.b, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
                     .a(dto.c, nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
                     .a(dto.d, nt.a().a(nu.c, $$6).a(nu.b, nu.a.b))
                     .a(dto.e, nt.a().a(nu.c, $$5))
                     .a(dto.f, nt.a().a(nu.c, $$6))
                     .a(dto.g, nt.a().a(nu.c, $$4))
                     .a(dto.h, nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
                     .a(dto.i, nt.a().a(nu.c, $$4).a(nu.b, nu.a.c))
                     .a(dto.j, nt.a().a(nu.c, $$4).a(nu.b, nu.a.d))
               )
         );
   }

   private void o(dfh $$0) {
      akk $$1 = this.a($$0, "", oa.as, ob::e);
      akk $$2 = this.a($$0, "", oa.au, ob::e);
      akk $$3 = this.a($$0, "", oa.av, ob::e);
      akk $$4 = this.a($$0, "_on", oa.as, ob::e);
      akk $$5 = this.a($$0, "_on", oa.au, ob::e);
      akk $$6 = this.a($$0, "_on", oa.av, ob::e);
      nr $$7 = nr.a(dta.w, dta.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return nt.a().a(nu.c, $$6x ? $$4 : $$1);
            case b:
               return nt.a().a(nu.c, $$6x ? $$4 : $$1).a(nu.b, nu.a.b);
            case c:
               return nt.a().a(nu.c, $$6x ? $$5 : $$2).a(nu.b, nu.a.b);
            case d:
               return nt.a().a(nu.c, $$6x ? $$6 : $$3).a(nu.b, nu.a.b);
            case e:
               return nt.a().a(nu.c, $$6x ? $$5 : $$2);
            case f:
               return nt.a().a(nu.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(nq.a($$0).a($$7));
   }

   private nk.a a(akk $$0, dfh $$1) {
      return new nk.a($$0, $$1);
   }

   private nk.a f(dfh $$0, dfh $$1) {
      return new nk.a(ny.a($$0), $$1);
   }

   private void a(dfh $$0, ctx $$1) {
      akk $$2 = oa.aa.a($$0, ob.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dfh $$0, akk $$1) {
      akk $$2 = oa.aa.a($$0, ob.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dfh $$0, dfh $$1) {
      this.a($$0);
      akk $$2 = od.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dfh $$0) {
      this.a($$0.r());
      akk $$1 = od.k.create($$0, this.c);
      akk $$2 = od.l.create($$0, this.c);
      akk $$3 = od.m.create($$0, this.c);
      akk $$4 = od.n.create($$0, this.c);
      this.b
         .accept(
            np.a($$0)
               .a(no.a().a(dta.S, 1, 2, 3, 4).a(dta.R, jf.c), nt.a().a(nu.c, $$1))
               .a(no.a().a(dta.S, 1, 2, 3, 4).a(dta.R, jf.f), nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
               .a(no.a().a(dta.S, 1, 2, 3, 4).a(dta.R, jf.d), nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
               .a(no.a().a(dta.S, 1, 2, 3, 4).a(dta.R, jf.e), nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
               .a(no.a().a(dta.S, 2, 3, 4).a(dta.R, jf.c), nt.a().a(nu.c, $$2))
               .a(no.a().a(dta.S, 2, 3, 4).a(dta.R, jf.f), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
               .a(no.a().a(dta.S, 2, 3, 4).a(dta.R, jf.d), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
               .a(no.a().a(dta.S, 2, 3, 4).a(dta.R, jf.e), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
               .a(no.a().a(dta.S, 3, 4).a(dta.R, jf.c), nt.a().a(nu.c, $$3))
               .a(no.a().a(dta.S, 3, 4).a(dta.R, jf.f), nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(no.a().a(dta.S, 3, 4).a(dta.R, jf.d), nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(no.a().a(dta.S, 3, 4).a(dta.R, jf.e), nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               .a(no.a().a(dta.S, 4).a(dta.R, jf.c), nt.a().a(nu.c, $$4))
               .a(no.a().a(dta.S, 4).a(dta.R, jf.f), nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
               .a(no.a().a(dta.S, 4).a(dta.R, jf.d), nt.a().a(nu.c, $$4).a(nu.b, nu.a.c))
               .a(no.a().a(dta.S, 4).a(dta.R, jf.e), nt.a().a(nu.c, $$4).a(nu.b, nu.a.d))
         );
   }

   private void a(od.a $$0, dfh... $$1) {
      for (dfh $$2 : $$1) {
         akk $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(od.a $$0, dfh... $$1) {
      for (dfh $$2 : $$1) {
         akk $$3 = $$0.create($$2, this.c);
         this.b.accept(nq.a($$2, nt.a().a(nu.c, $$3)).a(c()));
      }
   }

   private void h(dfh $$0, dfh $$1) {
      this.a($$0);
      ob $$2 = ob.b($$0, $$1);
      akk $$3 = oa.aI.a($$1, $$2, this.c);
      akk $$4 = oa.aJ.a($$1, $$2, this.c);
      akk $$5 = oa.aK.a($$1, $$2, this.c);
      akk $$6 = oa.aG.a($$1, $$2, this.c);
      akk $$7 = oa.aH.a($$1, $$2, this.c);
      ctx $$8 = $$1.r();
      oa.bx.a(ny.a($$8), ob.F($$0), this.c);
      this.b
         .accept(
            np.a($$1)
               .a(nt.a().a(nu.c, $$3))
               .a(no.a().a(dta.L, true), nt.a().a(nu.c, $$4))
               .a(no.a().a(dta.M, true), nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
               .a(no.a().a(dta.N, true), nt.a().a(nu.c, $$5))
               .a(no.a().a(dta.O, true), nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
               .a(no.a().a(dta.L, false), nt.a().a(nu.c, $$6))
               .a(no.a().a(dta.M, false), nt.a().a(nu.c, $$7))
               .a(no.a().a(dta.N, false), nt.a().a(nu.c, $$7).a(nu.b, nu.a.b))
               .a(no.a().a(dta.O, false), nt.a().a(nu.c, $$6).a(nu.b, nu.a.d))
         );
   }

   private void q(dfh $$0) {
      ob $$1 = ob.z($$0);
      akk $$2 = oa.aL.a($$0, $$1, this.c);
      akk $$3 = this.a($$0, "_conditional", oa.aL, $$1x -> $$1.c(oc.i, $$1x));
      this.b.accept(nq.a($$0).a(a(dta.c, $$3, $$2)).a(e()));
   }

   private void r(dfh $$0) {
      akk $$1 = od.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<nt> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> nt.a().a(nu.c, ny.a(dfj.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dfj.mZ);
      this.b
         .accept(
            np.a(dfj.mZ)
               .a(no.a().a(dta.aq, 0), this.a(0))
               .a(no.a().a(dta.aq, 1), this.a(1))
               .a(no.a().a(dta.bk, dsw.b), nt.a().a(nu.c, ny.a(dfj.mZ, "_small_leaves")))
               .a(no.a().a(dta.bk, dsw.c), nt.a().a(nu.c, ny.a(dfj.mZ, "_large_leaves")))
         );
   }

   private nr n() {
      return nr.a(dta.P)
         .a(jf.a, nt.a().a(nu.a, nu.a.c))
         .a(jf.b, nt.a())
         .a(jf.c, nt.a().a(nu.a, nu.a.b))
         .a(jf.d, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.c))
         .a(jf.e, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.d))
         .a(jf.f, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b));
   }

   private void o() {
      akk $$0 = ob.a(dfj.nU, "_top_open");
      this.b
         .accept(
            nq.a(dfj.nU)
               .a(this.n())
               .a(
                  nr.a(dta.u)
                     .a(false, nt.a().a(nu.c, od.f.create(dfj.nU, this.c)))
                     .a(true, nt.a().a(nu.c, od.f.get(dfj.nU).a($$1 -> $$1.a(oc.f, $$0)).a(dfj.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nr a(dtn<T> $$0, T $$1, akk $$2, akk $$3) {
      nt $$4 = nt.a().a(nu.c, $$2);
      nt $$5 = nt.a().a(nu.c, $$3);
      return nr.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dfh $$0, Function<dfh, ob> $$1) {
      ob $$2 = $$1.apply($$0).b(oc.i, oc.c);
      ob $$3 = $$2.c(oc.g, ob.a($$0, "_front_honey"));
      akk $$4 = oa.q.a($$0, $$2, this.c);
      akk $$5 = oa.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nq.a($$0).a(b()).a(a(dta.aN, 5, $$5, $$4)));
   }

   private void a(dfh $$0, dtn<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akk> $$3 = new Int2ObjectOpenHashMap();
         nr $$4 = nr.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akk $$5 = (akk)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, oa.aV, ob::g));
            return nt.a().a(nu.c, $$5);
         });
         this.a($$0.r());
         this.b.accept(nq.a($$0).a($$4));
      }
   }

   private void p() {
      akk $$0 = ny.a(dfj.od, "_floor");
      akk $$1 = ny.a(dfj.od, "_ceiling");
      akk $$2 = ny.a(dfj.od, "_wall");
      akk $$3 = ny.a(dfj.od, "_between_walls");
      this.a(cuf.wr);
      this.b
         .accept(
            nq.a(dfj.od)
               .a(
                  nr.a(dta.R, dta.V)
                     .a(jf.c, dsy.a, nt.a().a(nu.c, $$0))
                     .a(jf.d, dsy.a, nt.a().a(nu.c, $$0).a(nu.b, nu.a.c))
                     .a(jf.f, dsy.a, nt.a().a(nu.c, $$0).a(nu.b, nu.a.b))
                     .a(jf.e, dsy.a, nt.a().a(nu.c, $$0).a(nu.b, nu.a.d))
                     .a(jf.c, dsy.b, nt.a().a(nu.c, $$1))
                     .a(jf.d, dsy.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
                     .a(jf.f, dsy.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
                     .a(jf.e, dsy.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
                     .a(jf.c, dsy.c, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
                     .a(jf.d, dsy.c, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
                     .a(jf.f, dsy.c, nt.a().a(nu.c, $$2))
                     .a(jf.e, dsy.c, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
                     .a(jf.d, dsy.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
                     .a(jf.c, dsy.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
                     .a(jf.f, dsy.d, nt.a().a(nu.c, $$3))
                     .a(jf.e, dsy.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nq.a(dfj.nZ, nt.a().a(nu.c, ny.a(dfj.nZ)))
               .a(
                  nr.a(dta.U, dta.R)
                     .a(dsv.a, jf.c, nt.a())
                     .a(dsv.a, jf.f, nt.a().a(nu.b, nu.a.b))
                     .a(dsv.a, jf.d, nt.a().a(nu.b, nu.a.c))
                     .a(dsv.a, jf.e, nt.a().a(nu.b, nu.a.d))
                     .a(dsv.b, jf.c, nt.a().a(nu.a, nu.a.b))
                     .a(dsv.b, jf.f, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b))
                     .a(dsv.b, jf.d, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.c))
                     .a(dsv.b, jf.e, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.d))
                     .a(dsv.c, jf.d, nt.a().a(nu.a, nu.a.c))
                     .a(dsv.c, jf.e, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.b))
                     .a(dsv.c, jf.c, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.c))
                     .a(dsv.c, jf.f, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.d))
               )
         );
   }

   private void d(dfh $$0, od.a $$1) {
      akk $$2 = $$1.create($$0, this.c);
      akk $$3 = ob.a($$0, "_front_on");
      akk $$4 = $$1.get($$0).a($$1x -> $$1x.a(oc.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nq.a($$0).a(a(dta.r, $$4, $$2)).a(b()));
   }

   private void a(dfh... $$0) {
      akk $$1 = ny.a("campfire_off");

      for (dfh $$2 : $$0) {
         akk $$3 = oa.bc.a($$2, ob.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nq.a($$2).a(a(dta.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dfh $$0) {
      akk $$1 = oa.bt.a($$0, ob.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dfh $$0) {
      akk $$1;
      if ($$0 == dfj.tj) {
         $$1 = oa.bv.a($$0, ob.m($$0), this.c);
      } else {
         $$1 = oa.bu.a($$0, ob.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ob $$0 = ob.a(ob.G(dfj.cl), ob.G(dfj.n));
      akk $$1 = oa.j.a(dfj.cl, $$0, this.c);
      this.b.accept(c(dfj.cl, $$1));
   }

   private void s() {
      this.a(cuf.lH);
      this.b
         .accept(
            np.a(dfj.cw)
               .a(
                  no.b(
                     no.a().a(dta.ab, dtp.c).a(dta.aa, dtp.c).a(dta.ac, dtp.c).a(dta.ad, dtp.c),
                     no.a().a(dta.ab, dtp.b, dtp.a).a(dta.aa, dtp.b, dtp.a),
                     no.a().a(dta.aa, dtp.b, dtp.a).a(dta.ac, dtp.b, dtp.a),
                     no.a().a(dta.ac, dtp.b, dtp.a).a(dta.ad, dtp.b, dtp.a),
                     no.a().a(dta.ad, dtp.b, dtp.a).a(dta.ab, dtp.b, dtp.a)
                  ),
                  nt.a().a(nu.c, ny.a("redstone_dust_dot"))
               )
               .a(no.a().a(dta.ab, dtp.b, dtp.a), nt.a().a(nu.c, ny.a("redstone_dust_side0")))
               .a(no.a().a(dta.ac, dtp.b, dtp.a), nt.a().a(nu.c, ny.a("redstone_dust_side_alt0")))
               .a(no.a().a(dta.aa, dtp.b, dtp.a), nt.a().a(nu.c, ny.a("redstone_dust_side_alt1")).a(nu.b, nu.a.d))
               .a(no.a().a(dta.ad, dtp.b, dtp.a), nt.a().a(nu.c, ny.a("redstone_dust_side1")).a(nu.b, nu.a.d))
               .a(no.a().a(dta.ab, dtp.a), nt.a().a(nu.c, ny.a("redstone_dust_up")))
               .a(no.a().a(dta.aa, dtp.a), nt.a().a(nu.c, ny.a("redstone_dust_up")).a(nu.b, nu.a.b))
               .a(no.a().a(dta.ac, dtp.a), nt.a().a(nu.c, ny.a("redstone_dust_up")).a(nu.b, nu.a.c))
               .a(no.a().a(dta.ad, dtp.a), nt.a().a(nu.c, ny.a("redstone_dust_up")).a(nu.b, nu.a.d))
         );
   }

   private void t() {
      this.a(cuf.lL);
      this.b
         .accept(
            nq.a(dfj.gY)
               .a(c())
               .a(
                  nr.a(dta.bd, dta.w)
                     .a(dtd.a, false, nt.a().a(nu.c, ny.a(dfj.gY)))
                     .a(dtd.a, true, nt.a().a(nu.c, ny.a(dfj.gY, "_on")))
                     .a(dtd.b, false, nt.a().a(nu.c, ny.a(dfj.gY, "_subtract")))
                     .a(dtd.b, true, nt.a().a(nu.c, ny.a(dfj.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      ob $$0 = ob.a(dfj.jR);
      ob $$1 = ob.a(ob.a(dfj.jE, "_side"), $$0.a(oc.f));
      akk $$2 = oa.ab.a(dfj.jE, $$1, this.c);
      akk $$3 = oa.ac.a(dfj.jE, $$1, this.c);
      akk $$4 = oa.j.b(dfj.jE, "_double", $$1, this.c);
      this.b.accept(e(dfj.jE, $$2, $$3, $$4));
      this.b.accept(c(dfj.jR, oa.c.a(dfj.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cuf.sq);
      this.b
         .accept(
            np.a(dfj.fs)
               .a(nt.a().a(nu.c, ob.G(dfj.fs)))
               .a(no.a().a(dta.k, true), nt.a().a(nu.c, ob.a(dfj.fs, "_bottle0")))
               .a(no.a().a(dta.l, true), nt.a().a(nu.c, ob.a(dfj.fs, "_bottle1")))
               .a(no.a().a(dta.m, true), nt.a().a(nu.c, ob.a(dfj.fs, "_bottle2")))
               .a(no.a().a(dta.k, false), nt.a().a(nu.c, ob.a(dfj.fs, "_empty0")))
               .a(no.a().a(dta.l, false), nt.a().a(nu.c, ob.a(dfj.fs, "_empty1")))
               .a(no.a().a(dta.m, false), nt.a().a(nu.c, ob.a(dfj.fs, "_empty2")))
         );
   }

   private void u(dfh $$0) {
      akk $$1 = oa.bp.a($$0, ob.b($$0), this.c);
      akk $$2 = ny.a("mushroom_block_inside");
      this.b
         .accept(
            np.a($$0)
               .a(no.a().a(dta.L, true), nt.a().a(nu.c, $$1))
               .a(no.a().a(dta.M, true), nt.a().a(nu.c, $$1).a(nu.b, nu.a.b).a(nu.d, true))
               .a(no.a().a(dta.N, true), nt.a().a(nu.c, $$1).a(nu.b, nu.a.c).a(nu.d, true))
               .a(no.a().a(dta.O, true), nt.a().a(nu.c, $$1).a(nu.b, nu.a.d).a(nu.d, true))
               .a(no.a().a(dta.J, true), nt.a().a(nu.c, $$1).a(nu.a, nu.a.d).a(nu.d, true))
               .a(no.a().a(dta.K, true), nt.a().a(nu.c, $$1).a(nu.a, nu.a.b).a(nu.d, true))
               .a(no.a().a(dta.L, false), nt.a().a(nu.c, $$2))
               .a(no.a().a(dta.M, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, false))
               .a(no.a().a(dta.N, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, false))
               .a(no.a().a(dta.O, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, false))
               .a(no.a().a(dta.J, false), nt.a().a(nu.c, $$2).a(nu.a, nu.a.d).a(nu.d, false))
               .a(no.a().a(dta.K, false), nt.a().a(nu.c, $$2).a(nu.a, nu.a.b).a(nu.d, false))
         );
      this.a($$0, od.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cuf.rB);
      this.b
         .accept(
            nq.a(dfj.eg)
               .a(
                  nr.a(dta.ay)
                     .a(0, nt.a().a(nu.c, ny.a(dfj.eg)))
                     .a(1, nt.a().a(nu.c, ny.a(dfj.eg, "_slice1")))
                     .a(2, nt.a().a(nu.c, ny.a(dfj.eg, "_slice2")))
                     .a(3, nt.a().a(nu.c, ny.a(dfj.eg, "_slice3")))
                     .a(4, nt.a().a(nu.c, ny.a(dfj.eg, "_slice4")))
                     .a(5, nt.a().a(nu.c, ny.a(dfj.eg, "_slice5")))
                     .a(6, nt.a().a(nu.c, ny.a(dfj.eg, "_slice6")))
               )
         );
   }

   private void x() {
      ob $$0 = new ob()
         .a(oc.c, ob.a(dfj.nX, "_side3"))
         .a(oc.o, ob.G(dfj.t))
         .a(oc.n, ob.a(dfj.nX, "_top"))
         .a(oc.j, ob.a(dfj.nX, "_side3"))
         .a(oc.l, ob.a(dfj.nX, "_side3"))
         .a(oc.k, ob.a(dfj.nX, "_side1"))
         .a(oc.m, ob.a(dfj.nX, "_side2"));
      this.b.accept(c(dfj.nX, oa.a.a(dfj.nX, $$0, this.c)));
   }

   private void y() {
      ob $$0 = new ob()
         .a(oc.c, ob.a(dfj.ob, "_front"))
         .a(oc.o, ob.a(dfj.ob, "_bottom"))
         .a(oc.n, ob.a(dfj.ob, "_top"))
         .a(oc.j, ob.a(dfj.ob, "_front"))
         .a(oc.k, ob.a(dfj.ob, "_front"))
         .a(oc.l, ob.a(dfj.ob, "_side"))
         .a(oc.m, ob.a(dfj.ob, "_side"));
      this.b.accept(c(dfj.ob, oa.a.a(dfj.ob, $$0, this.c)));
   }

   private void a(dfh $$0, dfh $$1, BiFunction<dfh, dfh, ob> $$2) {
      ob $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oa.a.a($$0, $$3, this.c)));
   }

   public void b(dfh $$0) {
      ob $$1 = new ob()
         .a(oc.c, ob.a($$0, "_particle"))
         .a(oc.o, ob.a($$0, "_down"))
         .a(oc.n, ob.a($$0, "_up"))
         .a(oc.j, ob.a($$0, "_north"))
         .a(oc.k, ob.a($$0, "_south"))
         .a(oc.l, ob.a($$0, "_east"))
         .a(oc.m, ob.a($$0, "_west"));
      this.b.accept(c($$0, oa.a.a($$0, $$1, this.c)));
   }

   private void z() {
      ob $$0 = ob.k(dfj.eZ);
      this.b.accept(c(dfj.eZ, ny.a(dfj.eZ)));
      this.a(dfj.ee, $$0);
      this.a(dfj.ef, $$0);
   }

   private void a(dfh $$0, ob $$1) {
      akk $$2 = oa.p.a($$0, $$1.c(oc.g, ob.G($$0)), this.c);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cuf.sr);
      this.m(dfj.ft);
      this.b.accept(c(dfj.fv, oa.bs.a(dfj.fv, ob.j(ob.a(dfj.H, "_still")), this.c)));
      this.b
         .accept(
            nq.a(dfj.fu)
               .a(
                  nr.a(djq.g)
                     .a(1, nt.a().a(nu.c, oa.bq.a(dfj.fu, "_level1", ob.j(ob.a(dfj.G, "_still")), this.c)))
                     .a(2, nt.a().a(nu.c, oa.br.a(dfj.fu, "_level2", ob.j(ob.a(dfj.G, "_still")), this.c)))
                     .a(3, nt.a().a(nu.c, oa.bs.a(dfj.fu, "_full", ob.j(ob.a(dfj.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nq.a(dfj.fw)
               .a(
                  nr.a(djq.g)
                     .a(1, nt.a().a(nu.c, oa.bq.a(dfj.fw, "_level1", ob.j(ob.G(dfj.qP)), this.c)))
                     .a(2, nt.a().a(nu.c, oa.br.a(dfj.fw, "_level2", ob.j(ob.G(dfj.qP)), this.c)))
                     .a(3, nt.a().a(nu.c, oa.bs.a(dfj.fw, "_full", ob.j(ob.G(dfj.qP)), this.c)))
               )
         );
   }

   private void B() {
      ob $$0 = ob.b(dfj.kv);
      akk $$1 = oa.aE.a(dfj.kv, $$0, this.c);
      akk $$2 = this.a(dfj.kv, "_dead", oa.aE, $$1x -> $$0.c(oc.b, $$1x));
      this.b.accept(nq.a(dfj.kv).a(a(dta.au, 5, $$2, $$1)));
   }

   private void C() {
      akk $$0 = ny.a(dfj.tq);
      akk $$1 = ny.a(dfj.tq, "_triggered");
      akk $$2 = ny.a(dfj.tq, "_crafting");
      akk $$3 = ny.a(dfj.tq, "_crafting_triggered");
      this.b
         .accept(
            nq.a(dfj.tq)
               .a(nr.a(dta.T).a($$0x -> this.a($$0x, nt.a())))
               .a(
                  nr.a(dta.A, dha.b)
                     .a(false, false, nt.a().a(nu.c, $$0))
                     .a(true, true, nt.a().a(nu.c, $$3))
                     .a(true, false, nt.a().a(nu.c, $$1))
                     .a(false, true, nt.a().a(nu.c, $$2))
               )
         );
   }

   private void v(dfh $$0) {
      ob $$1 = new ob().a(oc.f, ob.a(dfj.cD, "_top")).a(oc.i, ob.a(dfj.cD, "_side")).a(oc.g, ob.a($$0, "_front"));
      ob $$2 = new ob().a(oc.i, ob.a(dfj.cD, "_top")).a(oc.g, ob.a($$0, "_front_vertical"));
      akk $$3 = oa.p.a($$0, $$1, this.c);
      akk $$4 = oa.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nq.a($$0)
               .a(
                  nr.a(dta.P)
                     .a(jf.a, nt.a().a(nu.c, $$4).a(nu.a, nu.a.c))
                     .a(jf.b, nt.a().a(nu.c, $$4))
                     .a(jf.c, nt.a().a(nu.c, $$3))
                     .a(jf.f, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
                     .a(jf.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
                     .a(jf.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               )
         );
   }

   private void D() {
      akk $$0 = ny.a(dfj.fy);
      akk $$1 = ny.a(dfj.fy, "_filled");
      this.b.accept(nq.a(dfj.fy).a(nr.a(dta.h).a(false, nt.a().a(nu.c, $$0)).a(true, nt.a().a(nu.c, $$1))).a(c()));
   }

   private void E() {
      akk $$0 = ny.a(dfj.ku, "_side");
      akk $$1 = ny.a(dfj.ku, "_noside");
      akk $$2 = ny.a(dfj.ku, "_noside1");
      akk $$3 = ny.a(dfj.ku, "_noside2");
      akk $$4 = ny.a(dfj.ku, "_noside3");
      this.b
         .accept(
            np.a(dfj.ku)
               .a(no.a().a(dta.L, true), nt.a().a(nu.c, $$0))
               .a(no.a().a(dta.M, true), nt.a().a(nu.c, $$0).a(nu.b, nu.a.b).a(nu.d, true))
               .a(no.a().a(dta.N, true), nt.a().a(nu.c, $$0).a(nu.b, nu.a.c).a(nu.d, true))
               .a(no.a().a(dta.O, true), nt.a().a(nu.c, $$0).a(nu.b, nu.a.d).a(nu.d, true))
               .a(no.a().a(dta.J, true), nt.a().a(nu.c, $$0).a(nu.a, nu.a.d).a(nu.d, true))
               .a(no.a().a(dta.K, true), nt.a().a(nu.c, $$0).a(nu.a, nu.a.b).a(nu.d, true))
               .a(no.a().a(dta.L, false), nt.a().a(nu.c, $$1).a(nu.e, 2), nt.a().a(nu.c, $$2), nt.a().a(nu.c, $$3), nt.a().a(nu.c, $$4))
               .a(
                  no.a().a(dta.M, false),
                  nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$4).a(nu.b, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.b, nu.a.b).a(nu.d, true)
               )
               .a(
                  no.a().a(dta.N, false),
                  nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true),
                  nt.a().a(nu.c, $$4).a(nu.b, nu.a.c).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.b, nu.a.c).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true)
               )
               .a(
                  no.a().a(dta.O, false),
                  nt.a().a(nu.c, $$4).a(nu.b, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.b, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true)
               )
               .a(
                  no.a().a(dta.J, false),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.a, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$4).a(nu.a, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.a, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.a, nu.a.d).a(nu.d, true)
               )
               .a(
                  no.a().a(dta.K, false),
                  nt.a().a(nu.c, $$4).a(nu.a, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.a, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.a, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.a, nu.a.b).a(nu.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            np.a(dfj.pc)
               .a(nt.a().a(nu.c, ob.G(dfj.pc)))
               .a(no.a().a(dta.aL, 1), nt.a().a(nu.c, ob.a(dfj.pc, "_contents1")))
               .a(no.a().a(dta.aL, 2), nt.a().a(nu.c, ob.a(dfj.pc, "_contents2")))
               .a(no.a().a(dta.aL, 3), nt.a().a(nu.c, ob.a(dfj.pc, "_contents3")))
               .a(no.a().a(dta.aL, 4), nt.a().a(nu.c, ob.a(dfj.pc, "_contents4")))
               .a(no.a().a(dta.aL, 5), nt.a().a(nu.c, ob.a(dfj.pc, "_contents5")))
               .a(no.a().a(dta.aL, 6), nt.a().a(nu.c, ob.a(dfj.pc, "_contents6")))
               .a(no.a().a(dta.aL, 7), nt.a().a(nu.c, ob.a(dfj.pc, "_contents7")))
               .a(no.a().a(dta.aL, 8), nt.a().a(nu.c, ob.a(dfj.pc, "_contents_ready")))
         );
   }

   private void w(dfh $$0) {
      akk $$1 = oa.c.a($$0, ob.a($$0), this.c);
      akk $$2 = this.a($$0, "_powered", oa.c, ob::b);
      akk $$3 = this.a($$0, "_lit", oa.c, ob::b);
      akk $$4 = this.a($$0, "_lit_powered", oa.c, ob::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nn a(dfh $$0, akk $$1, akk $$2, akk $$3, akk $$4) {
      return nq.a($$0).a(nr.a(dta.r, dta.w).a(($$4x, $$5) -> $$4x ? nt.a().a(nu.c, $$5 ? $$4 : $$2) : nt.a().a(nu.c, $$5 ? $$3 : $$1)));
   }

   private void i(dfh $$0, dfh $$1) {
      akk $$2 = ny.a($$0);
      akk $$3 = ny.a($$0, "_powered");
      akk $$4 = ny.a($$0, "_lit");
      akk $$5 = ny.a($$0, "_lit_powered");
      this.a($$1, ny.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dfh $$0) {
      this.c($$0);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, oa.ao.a($$0, ob.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dfj.qy);
      this.x(dfj.qx);
      this.x(dfj.qw);
      this.x(dfj.qv);
   }

   private void H() {
      this.c(dfj.st);
      nr.b<jf, dth> $$0 = nr.a(dta.bm, dta.bn);

      for (dth $$1 : dth.values()) {
         $$0.a(jf.b, $$1, this.a(jf.b, $$1));
      }

      for (dth $$2 : dth.values()) {
         $$0.a(jf.a, $$2, this.a(jf.a, $$2));
      }

      this.b.accept(nq.a(dfj.st).a($$0));
   }

   private nt a(jf $$0, dth $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ob $$3 = ob.c(ob.a(dfj.st, $$2));
      return nt.a().a(nu.c, oa.an.a(dfj.st, $$2, $$3, this.c));
   }

   private void y(dfh $$0) {
      ob $$1 = new ob().a(oc.e, ob.G(dfj.dV)).a(oc.f, ob.G($$0)).a(oc.i, ob.a($$0, "_side"));
      this.b.accept(c($$0, oa.n.a($$0, $$1, this.c)));
   }

   private void I() {
      akk $$0 = ob.a(dfj.gZ, "_side");
      ob $$1 = new ob().a(oc.f, ob.a(dfj.gZ, "_top")).a(oc.i, $$0);
      ob $$2 = new ob().a(oc.f, ob.a(dfj.gZ, "_inverted_top")).a(oc.i, $$0);
      this.b
         .accept(
            nq.a(dfj.gZ)
               .a(nr.a(dta.p).a(false, nt.a().a(nu.c, oa.aF.a(dfj.gZ, $$1, this.c))).a(true, nt.a().a(nu.c, oa.aF.a(ny.a(dfj.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dfh $$0) {
      this.b.accept(nq.a($$0, nt.a().a(nu.c, ny.a($$0))).a(this.n()));
   }

   private void J() {
      dfh $$0 = dfj.ss;
      akk $$1 = ny.a($$0, "_on");
      akk $$2 = ny.a($$0);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, ny.a($$0))).a(this.n()).a(a(dta.w, $$1, $$2)));
   }

   private void K() {
      ob $$0 = new ob().a(oc.B, ob.G(dfj.j)).a(oc.f, ob.G(dfj.cC));
      ob $$1 = new ob().a(oc.B, ob.G(dfj.j)).a(oc.f, ob.a(dfj.cC, "_moist"));
      akk $$2 = oa.aW.a(dfj.cC, $$0, this.c);
      akk $$3 = oa.aW.a(ob.a(dfj.cC, "_moist"), $$1, this.c);
      this.b.accept(nq.a(dfj.cC).a(a(dta.aQ, 7, $$3, $$2)));
   }

   private List<akk> A(dfh $$0) {
      akk $$1 = oa.aX.a(ny.a($$0, "_floor0"), ob.v($$0), this.c);
      akk $$2 = oa.aX.a(ny.a($$0, "_floor1"), ob.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akk> B(dfh $$0) {
      akk $$1 = oa.aY.a(ny.a($$0, "_side0"), ob.v($$0), this.c);
      akk $$2 = oa.aY.a(ny.a($$0, "_side1"), ob.w($$0), this.c);
      akk $$3 = oa.aZ.a(ny.a($$0, "_side_alt0"), ob.v($$0), this.c);
      akk $$4 = oa.aZ.a(ny.a($$0, "_side_alt1"), ob.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akk> C(dfh $$0) {
      akk $$1 = oa.ba.a(ny.a($$0, "_up0"), ob.v($$0), this.c);
      akk $$2 = oa.ba.a(ny.a($$0, "_up1"), ob.w($$0), this.c);
      akk $$3 = oa.bb.a(ny.a($$0, "_up_alt0"), ob.v($$0), this.c);
      akk $$4 = oa.bb.a(ny.a($$0, "_up_alt1"), ob.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<nt> a(List<akk> $$0, UnaryOperator<nt> $$1) {
      return $$0.stream().map($$0x -> nt.a().a(nu.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      no $$0 = no.a().a(dta.L, false).a(dta.M, false).a(dta.N, false).a(dta.O, false).a(dta.J, false);
      List<akk> $$1 = this.A(dfj.cr);
      List<akk> $$2 = this.B(dfj.cr);
      List<akk> $$3 = this.C(dfj.cr);
      this.b
         .accept(
            np.a(dfj.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(no.b(no.a().a(dta.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(no.b(no.a().a(dta.M, true), $$0), a($$2, $$0x -> $$0x.a(nu.b, nu.a.b)))
               .a(no.b(no.a().a(dta.N, true), $$0), a($$2, $$0x -> $$0x.a(nu.b, nu.a.c)))
               .a(no.b(no.a().a(dta.O, true), $$0), a($$2, $$0x -> $$0x.a(nu.b, nu.a.d)))
               .a(no.a().a(dta.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<akk> $$0 = this.A(dfj.cs);
      List<akk> $$1 = this.B(dfj.cs);
      this.b
         .accept(
            np.a(dfj.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nu.b, nu.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nu.b, nu.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nu.b, nu.a.d)))
         );
   }

   private void D(dfh $$0) {
      akk $$1 = od.t.create($$0, this.c);
      akk $$2 = od.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nq.a($$0).a(a(dta.j, $$2, $$1)));
   }

   private void N() {
      ob $$0 = ob.a(ob.a(dfj.ad, "_side"), ob.a(dfj.ad, "_top"));
      akk $$1 = oa.j.a(dfj.ad, $$0, this.c);
      this.b.accept(d(dfj.ad, $$1));
   }

   private void O() {
      this.a(cuf.ad);
      dfh $$0 = dfj.E;
      nr.b<Boolean, Integer> $$1 = nr.a(dkc.d, dkc.b);
      akk $$2 = ny.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akk $$4 = ny.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, nt.a().a(nu.c, $$4));
         $$1.a(false, $$3, nt.a().a(nu.c, $$2));
      }

      this.b.accept(nq.a(dfj.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nq.a(dfj.kI)
               .a(
                  nr.a(dta.as)
                     .a(0, nt.a().a(nu.c, this.a(dfj.kI, "_0", oa.c, ob::b)))
                     .a(1, nt.a().a(nu.c, this.a(dfj.kI, "_1", oa.c, ob::b)))
                     .a(2, nt.a().a(nu.c, this.a(dfj.kI, "_2", oa.c, ob::b)))
                     .a(3, nt.a().a(nu.c, this.a(dfj.kI, "_3", oa.c, ob::b)))
               )
         );
   }

   private void Q() {
      akk $$0 = ob.G(dfj.j);
      ob $$1 = new ob().a(oc.e, $$0).b(oc.e, oc.c).a(oc.f, ob.a(dfj.i, "_top")).a(oc.i, ob.a(dfj.i, "_snow"));
      nt $$2 = nt.a().a(nu.c, oa.n.a(dfj.i, "_snow", $$1, this.c));
      this.a(dfj.i, ny.a(dfj.i), $$2);
      akk $$3 = od.f.get(dfj.fl).a($$1x -> $$1x.a(oc.e, $$0)).a(dfj.fl, this.c);
      this.a(dfj.fl, $$3, $$2);
      akk $$4 = od.f.get(dfj.l).a($$1x -> $$1x.a(oc.e, $$0)).a(dfj.l, this.c);
      this.a(dfj.l, $$4, $$2);
   }

   private void a(dfh $$0, akk $$1, nt $$2) {
      List<nt> $$3 = Arrays.asList(a($$1));
      this.b.accept(nq.a($$0).a(nr.a(dta.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cuf.rh);
      this.b
         .accept(
            nq.a(dfj.fC)
               .a(
                  nr.a(dta.ar)
                     .a(0, nt.a().a(nu.c, ny.a(dfj.fC, "_stage0")))
                     .a(1, nt.a().a(nu.c, ny.a(dfj.fC, "_stage1")))
                     .a(2, nt.a().a(nu.c, ny.a(dfj.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dfj.kE, ny.a(dfj.kE)));
   }

   private void j(dfh $$0, dfh $$1) {
      ob $$2 = ob.b($$1);
      akk $$3 = oa.Y.a($$0, $$2, this.c);
      akk $$4 = oa.Z.a($$0, $$2, this.c);
      this.b.accept(nq.a($$0).a(a(dta.aT, 1, $$4, $$3)));
   }

   private void T() {
      akk $$0 = ny.a(dfj.hc);
      akk $$1 = ny.a(dfj.hc, "_side");
      this.a(cuf.lR);
      this.b
         .accept(
            nq.a(dfj.hc)
               .a(
                  nr.a(dta.Q)
                     .a(jf.a, nt.a().a(nu.c, $$0))
                     .a(jf.c, nt.a().a(nu.c, $$1))
                     .a(jf.f, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
                     .a(jf.d, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
                     .a(jf.e, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
               )
         );
   }

   private void k(dfh $$0, dfh $$1) {
      akk $$2 = ny.a($$0);
      this.b.accept(nq.a($$1, nt.a().a(nu.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      akk $$0 = ny.a(dfj.eW, "_post_ends");
      akk $$1 = ny.a(dfj.eW, "_post");
      akk $$2 = ny.a(dfj.eW, "_cap");
      akk $$3 = ny.a(dfj.eW, "_cap_alt");
      akk $$4 = ny.a(dfj.eW, "_side");
      akk $$5 = ny.a(dfj.eW, "_side_alt");
      this.b
         .accept(
            np.a(dfj.eW)
               .a(nt.a().a(nu.c, $$0))
               .a(no.a().a(dta.L, false).a(dta.M, false).a(dta.N, false).a(dta.O, false), nt.a().a(nu.c, $$1))
               .a(no.a().a(dta.L, true).a(dta.M, false).a(dta.N, false).a(dta.O, false), nt.a().a(nu.c, $$2))
               .a(no.a().a(dta.L, false).a(dta.M, true).a(dta.N, false).a(dta.O, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
               .a(no.a().a(dta.L, false).a(dta.M, false).a(dta.N, true).a(dta.O, false), nt.a().a(nu.c, $$3))
               .a(no.a().a(dta.L, false).a(dta.M, false).a(dta.N, false).a(dta.O, true), nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(no.a().a(dta.L, true), nt.a().a(nu.c, $$4))
               .a(no.a().a(dta.M, true), nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
               .a(no.a().a(dta.N, true), nt.a().a(nu.c, $$5))
               .a(no.a().a(dta.O, true), nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
         );
      this.d(dfj.eW);
   }

   private void E(dfh $$0) {
      this.b.accept(nq.a($$0, nt.a().a(nu.c, ny.a($$0))).a(b()));
   }

   private void V() {
      akk $$0 = ny.a(dfj.dw);
      akk $$1 = ny.a(dfj.dw, "_on");
      this.d(dfj.dw);
      this.b
         .accept(
            nq.a(dfj.dw)
               .a(a(dta.w, $$0, $$1))
               .a(
                  nr.a(dta.U, dta.R)
                     .a(dsv.c, jf.c, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.c))
                     .a(dsv.c, jf.f, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.d))
                     .a(dsv.c, jf.d, nt.a().a(nu.a, nu.a.c))
                     .a(dsv.c, jf.e, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.b))
                     .a(dsv.a, jf.c, nt.a())
                     .a(dsv.a, jf.f, nt.a().a(nu.b, nu.a.b))
                     .a(dsv.a, jf.d, nt.a().a(nu.b, nu.a.c))
                     .a(dsv.a, jf.e, nt.a().a(nu.b, nu.a.d))
                     .a(dsv.b, jf.c, nt.a().a(nu.a, nu.a.b))
                     .a(dsv.b, jf.f, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b))
                     .a(dsv.b, jf.d, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.c))
                     .a(dsv.b, jf.e, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.d))
               )
         );
   }

   private void W() {
      this.d(dfj.fm);
      this.b.accept(b(dfj.fm, ny.a(dfj.fm)));
   }

   private void X() {
      this.d(dfj.tn);
      this.b.accept(c(dfj.tn, ny.a(dfj.tn)));
   }

   private void Y() {
      this.b.accept(nq.a(dfj.ed).a(nr.a(dta.H).a(jf.a.a, nt.a().a(nu.c, ny.a(dfj.ed, "_ns"))).a(jf.a.c, nt.a().a(nu.c, ny.a(dfj.ed, "_ew")))));
   }

   private void Z() {
      akk $$0 = od.a.create(dfj.dV, this.c);
      this.b
         .accept(
            nq.a(
               dfj.dV,
               nt.a().a(nu.c, $$0),
               nt.a().a(nu.c, $$0).a(nu.a, nu.a.b),
               nt.a().a(nu.c, $$0).a(nu.a, nu.a.c),
               nt.a().a(nu.c, $$0).a(nu.a, nu.a.d),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.b),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.b).a(nu.a, nu.a.b),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.b).a(nu.a, nu.a.c),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.b).a(nu.a, nu.a.d),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.c),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.c).a(nu.a, nu.a.b),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.c).a(nu.a, nu.a.c),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.c).a(nu.a, nu.a.d),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.d),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.d).a(nu.a, nu.a.b),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.d).a(nu.a, nu.a.c),
               nt.a().a(nu.c, $$0).a(nu.b, nu.a.d).a(nu.a, nu.a.d)
            )
         );
   }

   private void aa() {
      akk $$0 = ny.a(dfj.kO);
      akk $$1 = ny.a(dfj.kO, "_on");
      this.b.accept(nq.a(dfj.kO).a(a(dta.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      ob $$0 = new ob().a(oc.e, ob.a(dfj.by, "_bottom")).a(oc.i, ob.a(dfj.by, "_side"));
      akk $$1 = ob.a(dfj.by, "_top_sticky");
      akk $$2 = ob.a(dfj.by, "_top");
      ob $$3 = $$0.c(oc.E, $$1);
      ob $$4 = $$0.c(oc.E, $$2);
      akk $$5 = ny.a(dfj.by, "_base");
      this.a(dfj.by, $$5, $$4);
      this.a(dfj.br, $$5, $$3);
      akk $$6 = oa.n.a(dfj.by, "_inventory", $$0.c(oc.f, $$2), this.c);
      akk $$7 = oa.n.a(dfj.br, "_inventory", $$0.c(oc.f, $$1), this.c);
      this.a(dfj.by, $$6);
      this.a(dfj.br, $$7);
   }

   private void a(dfh $$0, akk $$1, ob $$2) {
      akk $$3 = oa.bh.a($$0, $$2, this.c);
      this.b.accept(nq.a($$0).a(a(dta.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      ob $$0 = new ob().a(oc.F, ob.a(dfj.by, "_top")).a(oc.i, ob.a(dfj.by, "_side"));
      ob $$1 = $$0.c(oc.E, ob.a(dfj.by, "_top_sticky"));
      ob $$2 = $$0.c(oc.E, ob.a(dfj.by, "_top"));
      this.b
         .accept(
            nq.a(dfj.bz)
               .a(
                  nr.a(dta.x, dta.bg)
                     .a(false, dtm.a, nt.a().a(nu.c, oa.bi.a(dfj.by, "_head", $$2, this.c)))
                     .a(false, dtm.b, nt.a().a(nu.c, oa.bi.a(dfj.by, "_head_sticky", $$1, this.c)))
                     .a(true, dtm.a, nt.a().a(nu.c, oa.bj.a(dfj.by, "_head_short", $$2, this.c)))
                     .a(true, dtm.b, nt.a().a(nu.c, oa.bj.a(dfj.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dfh $$0 = dfj.tr;
      ob $$1 = ob.a($$0, "_side_inactive", "_top_inactive");
      ob $$2 = ob.a($$0, "_side_active", "_top_active");
      ob $$3 = ob.a($$0, "_side_active", "_top_ejecting_reward");
      ob $$4 = ob.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      ob $$5 = ob.a($$0, "_side_active_ominous", "_top_active_ominous");
      ob $$6 = ob.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      akk $$7 = oa.o.a($$0, $$1, this.c);
      akk $$8 = oa.o.a($$0, "_active", $$2, this.c);
      akk $$9 = oa.o.a($$0, "_ejecting_reward", $$3, this.c);
      akk $$10 = oa.o.a($$0, "_inactive_ominous", $$4, this.c);
      akk $$11 = oa.o.a($$0, "_active_ominous", $$5, this.c);
      akk $$12 = oa.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nq.a($$0).a(nr.a(dta.by, dta.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> nt.a().a(nu.c, $$7x ? $$10 : $$7);
            case b, c, d -> nt.a().a(nu.c, $$7x ? $$11 : $$8);
            case e -> nt.a().a(nu.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dfh $$0 = dfj.ts;
      ob $$1 = ob.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      ob $$2 = ob.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      ob $$3 = ob.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      ob $$4 = ob.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akk $$5 = oa.bN.a($$0, $$1, this.c);
      akk $$6 = oa.bN.a($$0, "_active", $$2, this.c);
      akk $$7 = oa.bN.a($$0, "_unlocking", $$3, this.c);
      akk $$8 = oa.bN.a($$0, "_ejecting_reward", $$4, this.c);
      ob $$9 = ob.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      ob $$10 = ob.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      ob $$11 = ob.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      ob $$12 = ob.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      akk $$13 = oa.bN.a($$0, "_ominous", $$9, this.c);
      akk $$14 = oa.bN.a($$0, "_active_ominous", $$10, this.c);
      akk $$15 = oa.bN.a($$0, "_unlocking_ominous", $$11, this.c);
      akk $$16 = oa.bN.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nq.a($$0).a(b()).a(nr.a(doc.b, doc.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> nt.a().a(nu.c, $$9x ? $$13 : $$5);
            case b -> nt.a().a(nu.c, $$9x ? $$14 : $$6);
            case c -> nt.a().a(nu.c, $$9x ? $$15 : $$7);
            case d -> nt.a().a(nu.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      akk $$0 = ny.a(dfj.qQ, "_inactive");
      akk $$1 = ny.a(dfj.qQ, "_active");
      this.a(dfj.qQ, $$0);
      this.b.accept(nq.a(dfj.qQ).a(nr.a(dta.bo).a($$2 -> nt.a().a(nu.c, $$2 != dtr.b && $$2 != dtr.c ? $$0 : $$1))));
   }

   private void ag() {
      akk $$0 = ny.a(dfj.qR, "_inactive");
      akk $$1 = ny.a(dfj.qR, "_active");
      this.a(dfj.qR, $$0);
      this.b.accept(nq.a(dfj.qR).a(nr.a(dta.bo).a($$2 -> nt.a().a(nu.c, $$2 != dtr.b && $$2 != dtr.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      akk $$0 = oa.bM.a(dfj.qV, ob.a(false), this.c);
      akk $$1 = oa.bM.a(dfj.qV, "_can_summon", ob.a(true), this.c);
      this.a(dfj.qV, $$0);
      this.b.accept(nq.a(dfj.qV).a(a(dta.G, $$1, $$0)));
   }

   private void ai() {
      akk $$0 = ny.a(dfj.nS, "_stable");
      akk $$1 = ny.a(dfj.nS, "_unstable");
      this.a(dfj.nS, $$0);
      this.b.accept(nq.a(dfj.nS).a(a(dta.b, $$1, $$0)));
   }

   private void aj() {
      akk $$0 = this.a(dfj.sv, "", oa.ao, ob::c);
      akk $$1 = this.a(dfj.sv, "_lit", oa.ao, ob::c);
      this.b.accept(nq.a(dfj.sv).a(a(dta.D, $$1, $$0)));
      akk $$2 = this.a(dfj.sw, "", oa.ao, ob::c);
      akk $$3 = this.a(dfj.sw, "_lit", oa.ao, ob::c);
      this.b.accept(nq.a(dfj.sw).a(a(dta.D, $$3, $$2)));
   }

   private void ak() {
      akk $$0 = od.a.create(dfj.fB, this.c);
      akk $$1 = this.a(dfj.fB, "_on", oa.c, ob::b);
      this.b.accept(nq.a(dfj.fB).a(a(dta.r, $$1, $$0)));
   }

   private void l(dfh $$0, dfh $$1) {
      ob $$2 = ob.y($$0);
      this.b.accept(c($$0, oa.bf.a($$0, $$2, this.c)));
      this.b.accept(nq.a($$1, nt.a().a(nu.c, oa.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      ob $$0 = ob.y(dfj.dK);
      ob $$1 = ob.i(ob.a(dfj.dK, "_off"));
      akk $$2 = oa.bf.a(dfj.dK, $$0, this.c);
      akk $$3 = oa.bf.a(dfj.dK, "_off", $$1, this.c);
      this.b.accept(nq.a(dfj.dK).a(a(dta.r, $$2, $$3)));
      akk $$4 = oa.bg.a(dfj.dL, $$0, this.c);
      akk $$5 = oa.bg.a(dfj.dL, "_off", $$1, this.c);
      this.b.accept(nq.a(dfj.dL).a(a(dta.r, $$4, $$5)).a(d()));
      this.d(dfj.dK);
      this.c(dfj.dL);
   }

   private void am() {
      this.a(cuf.lK);
      this.b.accept(nq.a(dfj.eh).a(nr.a(dta.aA, dta.s, dta.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return nt.a().a(nu.c, ob.a(dfj.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cuf.cT);
      this.b
         .accept(
            nq.a(dfj.mV)
               .a(
                  nr.a(dta.aS, dta.C)
                     .a(1, false, Arrays.asList(a(ny.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(ny.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(ny.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(ny.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(ny.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(ny.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(ny.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(ny.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      ob $$0 = ob.a(dfj.dN);
      akk $$1 = oa.c.a(dfj.dP, $$0, this.c);
      this.b.accept(nq.a(dfj.dN).a(nr.a(dta.aF).a($$1x -> nt.a().a(nu.c, $$1x < 8 ? ny.a(dfj.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dfj.dN, ny.a(dfj.dN, "_height2"));
      this.b.accept(c(dfj.dP, $$1));
   }

   private void ap() {
      this.b.accept(nq.a(dfj.oc, nt.a().a(nu.c, ny.a(dfj.oc))).a(b()));
   }

   private void aq() {
      akk $$0 = od.a.create(dfj.pa, this.c);
      this.a(dfj.pa, $$0);
      this.b.accept(nq.a(dfj.pa).a(nr.a(dta.bj).a($$0x -> nt.a().a(nu.c, this.a(dfj.pa, "_" + $$0x.c(), oa.c, ob::b)))));
   }

   private void ar() {
      this.a(cuf.wu);
      this.b.accept(nq.a(dfj.oi).a(nr.a(dta.as).a($$0 -> nt.a().a(nu.c, this.a(dfj.oi, "_stage" + $$0, oa.ao, ob::c)))));
   }

   private void as() {
      this.a(cuf.ps);
      this.b
         .accept(
            nq.a(dfj.fI)
               .a(
                  nr.a(dta.a, dta.M, dta.L, dta.N, dta.O)
                     .a(false, false, false, false, false, nt.a().a(nu.c, ny.a(dfj.fI, "_ns")))
                     .a(false, true, false, false, false, nt.a().a(nu.c, ny.a(dfj.fI, "_n")).a(nu.b, nu.a.b))
                     .a(false, false, true, false, false, nt.a().a(nu.c, ny.a(dfj.fI, "_n")))
                     .a(false, false, false, true, false, nt.a().a(nu.c, ny.a(dfj.fI, "_n")).a(nu.b, nu.a.c))
                     .a(false, false, false, false, true, nt.a().a(nu.c, ny.a(dfj.fI, "_n")).a(nu.b, nu.a.d))
                     .a(false, true, true, false, false, nt.a().a(nu.c, ny.a(dfj.fI, "_ne")))
                     .a(false, true, false, true, false, nt.a().a(nu.c, ny.a(dfj.fI, "_ne")).a(nu.b, nu.a.b))
                     .a(false, false, false, true, true, nt.a().a(nu.c, ny.a(dfj.fI, "_ne")).a(nu.b, nu.a.c))
                     .a(false, false, true, false, true, nt.a().a(nu.c, ny.a(dfj.fI, "_ne")).a(nu.b, nu.a.d))
                     .a(false, false, true, true, false, nt.a().a(nu.c, ny.a(dfj.fI, "_ns")))
                     .a(false, true, false, false, true, nt.a().a(nu.c, ny.a(dfj.fI, "_ns")).a(nu.b, nu.a.b))
                     .a(false, true, true, true, false, nt.a().a(nu.c, ny.a(dfj.fI, "_nse")))
                     .a(false, true, false, true, true, nt.a().a(nu.c, ny.a(dfj.fI, "_nse")).a(nu.b, nu.a.b))
                     .a(false, false, true, true, true, nt.a().a(nu.c, ny.a(dfj.fI, "_nse")).a(nu.b, nu.a.c))
                     .a(false, true, true, false, true, nt.a().a(nu.c, ny.a(dfj.fI, "_nse")).a(nu.b, nu.a.d))
                     .a(false, true, true, true, true, nt.a().a(nu.c, ny.a(dfj.fI, "_nsew")))
                     .a(true, false, false, false, false, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_ns")))
                     .a(true, false, true, false, false, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_n")))
                     .a(true, false, false, true, false, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_n")).a(nu.b, nu.a.c))
                     .a(true, true, false, false, false, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_n")).a(nu.b, nu.a.b))
                     .a(true, false, false, false, true, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_n")).a(nu.b, nu.a.d))
                     .a(true, true, true, false, false, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_ne")))
                     .a(true, true, false, true, false, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_ne")).a(nu.b, nu.a.b))
                     .a(true, false, false, true, true, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_ne")).a(nu.b, nu.a.c))
                     .a(true, false, true, false, true, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_ne")).a(nu.b, nu.a.d))
                     .a(true, false, true, true, false, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_ns")))
                     .a(true, true, false, false, true, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_ns")).a(nu.b, nu.a.b))
                     .a(true, true, true, true, false, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_nse")))
                     .a(true, true, false, true, true, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_nse")).a(nu.b, nu.a.b))
                     .a(true, false, true, true, true, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_nse")).a(nu.b, nu.a.c))
                     .a(true, true, true, false, true, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_nse")).a(nu.b, nu.a.d))
                     .a(true, true, true, true, true, nt.a().a(nu.c, ny.a(dfj.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dfj.fH);
      this.b.accept(nq.a(dfj.fH).a(nr.a(dta.a, dta.w).a(($$0, $$1) -> nt.a().a(nu.c, ob.a(dfj.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akk a(int $$0, String $$1, ob $$2) {
      switch ($$0) {
         case 1:
            return oa.bl.a(ny.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return oa.bm.a(ny.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return oa.bn.a(ny.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return oa.bo.a(ny.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akk a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", ob.b(ob.G(dfj.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ob.b(ob.a(dfj.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ob.b(ob.a(dfj.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cuf.kp);
      this.b.accept(nq.a(dfj.mf).a(nr.a(dta.aD, dta.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cuf.kq);
      Function<Integer, akk> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ob $$2 = ob.a($$1);
         return oa.bw.a(dfj.mg, $$1, $$2, this.c);
      };
      this.b.accept(nq.a(dfj.mg).a(nr.a(dmp.c).a($$1 -> nt.a().a(nu.c, $$0.apply($$1)))));
   }

   private void F(dfh $$0) {
      this.d($$0);
      akk $$1 = ny.a($$0);
      np $$2 = np.a($$0);
      no.c $$3 = ac.a(no.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dtb, Function<akk, nt>> $$4 : a) {
         dtb $$5 = (dtb)$$4.getFirst();
         Function<akk, nt> $$6 = (Function<akk, nt>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(no.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      akk $$0 = ob.a(dfj.qU, "_bottom");
      ob $$1 = new ob().a(oc.e, $$0).a(oc.f, ob.a(dfj.qU, "_top")).a(oc.i, ob.a(dfj.qU, "_side"));
      ob $$2 = new ob().a(oc.e, $$0).a(oc.f, ob.a(dfj.qU, "_top_bloom")).a(oc.i, ob.a(dfj.qU, "_side_bloom"));
      akk $$3 = oa.n.a(dfj.qU, "", $$1, this.c);
      akk $$4 = oa.n.a(dfj.qU, "_bloom", $$2, this.c);
      this.b.accept(nq.a(dfj.qU).a(nr.a(dta.E).a($$2x -> nt.a().a(nu.c, $$2x ? $$4 : $$3))));
      this.a(cuf.gj, $$3);
   }

   private void ax() {
      dfh $$0 = dfj.cm;
      akk $$1 = ny.a($$0);
      np $$2 = np.a($$0);
      List.of(Pair.of(jf.c, nu.a.a), Pair.of(jf.f, nu.a.b), Pair.of(jf.d, nu.a.c), Pair.of(jf.e, nu.a.d)).forEach($$2x -> {
         jf $$3 = (jf)$$2x.getFirst();
         nu.a $$4 = (nu.a)$$2x.getSecond();
         no.c $$5 = no.a().a(dta.R, $$3);
         $$2.a($$5, nt.a().a(nu.c, $$1).a(nu.b, $$4).a(nu.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, ny.a($$0, "_inventory"));
      i.clear();
   }

   private void a(np $$0, no.c $$1, nu.a $$2) {
      List.of(Pair.of(dta.bp, oa.aM), Pair.of(dta.bq, oa.aN), Pair.of(dta.br, oa.aO), Pair.of(dta.bs, oa.aP), Pair.of(dta.bt, oa.aQ), Pair.of(dta.bu, oa.aR))
         .forEach($$3 -> {
            dtb $$4 = (dtb)$$3.getFirst();
            nz $$5 = (nz)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(np $$0, no.c $$1, nu.a $$2, dtb $$3, nz $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ob $$7 = new ob().a(oc.b, ob.a(dfj.cm, $$6));
      nk.d $$8 = new nk.d($$4, $$6);
      akk $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dfj.cm, $$6, $$7, this.c));
      $$0.a(no.a($$1, no.a().a($$3, $$5)), nt.a().a(nu.c, $$9).a(nu.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dfj.kJ, oa.c.a(dfj.kJ, ob.b(ny.a("magma")), this.c)));
   }

   private void G(dfh $$0) {
      this.b($$0, od.q);
      oa.bD.a(ny.a($$0.r()), ob.u($$0), this.c);
   }

   private void b(dfh $$0, dfh $$1, nk.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dfh $$0, dfh $$1) {
      oa.bE.a(ny.a($$0.r()), ob.u($$1), this.c);
   }

   private void az() {
      akk $$0 = ny.a(dfj.b);
      akk $$1 = ny.a(dfj.b, "_mirrored");
      this.b.accept(a(dfj.eN, $$0, $$1));
      this.a(dfj.eN, $$0);
   }

   private void aA() {
      akk $$0 = ny.a(dfj.sJ);
      akk $$1 = ny.a(dfj.sJ, "_mirrored");
      this.b.accept(a(dfj.td, $$0, $$1).a(f()));
      this.a(dfj.td, $$0);
   }

   private void n(dfh $$0, dfh $$1) {
      this.a($$0, nk.e.b);
      ob $$2 = ob.d(ob.a($$0, "_pot"));
      akk $$3 = nk.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      akk $$0 = ob.a(dfj.pl, "_bottom");
      akk $$1 = ob.a(dfj.pl, "_top_off");
      akk $$2 = ob.a(dfj.pl, "_top");
      akk[] $$3 = new akk[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ob $$5 = new ob().a(oc.e, $$0).a(oc.f, $$4 == 0 ? $$1 : $$2).a(oc.i, ob.a(dfj.pl, "_side" + $$4));
         $$3[$$4] = oa.n.a(dfj.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nq.a(dfj.pl).a(nr.a(dta.aZ).a($$1x -> nt.a().a(nu.c, $$3[$$1x]))));
      this.a(cuf.wS, $$3[0]);
   }

   private nt a(jh $$0, nt $$1) {
      switch ($$0) {
         case b:
            return $$1.a(nu.a, nu.a.b);
         case c:
            return $$1.a(nu.a, nu.a.b).a(nu.b, nu.a.c);
         case d:
            return $$1.a(nu.a, nu.a.b).a(nu.b, nu.a.d);
         case a:
            return $$1.a(nu.a, nu.a.b).a(nu.b, nu.a.b);
         case f:
            return $$1.a(nu.a, nu.a.d).a(nu.b, nu.a.c);
         case g:
            return $$1.a(nu.a, nu.a.d);
         case h:
            return $$1.a(nu.a, nu.a.d).a(nu.b, nu.a.b);
         case e:
            return $$1.a(nu.a, nu.a.d).a(nu.b, nu.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(nu.b, nu.a.c);
         case i:
            return $$1.a(nu.b, nu.a.d);
         case j:
            return $$1.a(nu.b, nu.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      akk $$0 = ob.a(dfj.pb, "_top");
      akk $$1 = ob.a(dfj.pb, "_bottom");
      akk $$2 = ob.a(dfj.pb, "_side");
      akk $$3 = ob.a(dfj.pb, "_lock");
      ob $$4 = new ob().a(oc.o, $$2).a(oc.m, $$2).a(oc.l, $$2).a(oc.c, $$0).a(oc.j, $$0).a(oc.k, $$1).a(oc.n, $$3);
      akk $$5 = oa.b.a(dfj.pb, $$4, this.c);
      this.b.accept(nq.a(dfj.pb, nt.a().a(nu.c, $$5)).a(nr.a(dta.T).a($$0x -> this.a($$0x, nt.a()))));
   }

   private void aD() {
      dfh $$0 = dfj.n;
      akk $$1 = ny.a($$0);
      od $$2 = od.a.get($$0);
      dfh $$3 = dfj.jH;
      akk $$4 = oa.ab.a($$3, $$2.b(), this.c);
      akk $$5 = oa.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lt.a().filter(lu::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dfj.rf).a(lt.w).a(dfj.rf, dfj.rD).a(dfj.rj, dfj.rn).a(lt.y);
      this.h(dfj.re).a(lt.A).a(dfj.re, dfj.rC).a(dfj.ri, dfj.rm).a(lt.C);
      this.h(dfj.rd).a(lt.E).a(dfj.rd, dfj.rB).a(dfj.rh, dfj.rl).a(lt.G);
      this.h(dfj.rc).a(lt.I).a(dfj.rc, dfj.rA).a(dfj.rg, dfj.rk).a(lt.K);
      this.w(dfj.sk);
      this.w(dfj.sl);
      this.w(dfj.sm);
      this.w(dfj.sn);
      this.i(dfj.sk, dfj.so);
      this.i(dfj.sl, dfj.sp);
      this.i(dfj.sm, dfj.sq);
      this.i(dfj.sn, dfj.sr);
      this.m(dfj.a);
      this.c(dfj.nc, dfj.a);
      this.c(dfj.nb, dfj.a);
      this.m(dfj.fO);
      this.m(dfj.dQ);
      this.c(dfj.nd, dfj.G);
      this.m(dfj.fA);
      this.m(dfj.me);
      this.m(dfj.fr);
      this.m(dfj.fR);
      this.a(cuf.ue);
      this.m(dfj.pg);
      this.m(dfj.G);
      this.m(dfj.H);
      this.m(dfj.hV);
      this.a(cuf.fS);
      this.o(dfj.pM, dfj.qd);
      this.o(dfj.pN, dfj.qe);
      this.o(dfj.pO, dfj.qf);
      this.o(dfj.pP, dfj.qg);
      this.o(dfj.pQ, dfj.qh);
      this.o(dfj.pR, dfj.qi);
      this.o(dfj.pS, dfj.qj);
      this.o(dfj.pT, dfj.qk);
      this.o(dfj.pU, dfj.ql);
      this.o(dfj.pV, dfj.qm);
      this.o(dfj.pW, dfj.qn);
      this.o(dfj.pX, dfj.qo);
      this.o(dfj.pY, dfj.qp);
      this.o(dfj.pZ, dfj.qq);
      this.o(dfj.qa, dfj.qr);
      this.o(dfj.qb, dfj.qs);
      this.o(dfj.pL, dfj.qc);
      this.m(dfj.na);
      this.m(dfj.gs);
      this.m(dfj.qP);
      this.m(dfj.sx);
      this.s(dfj.sy);
      this.s(dfj.sz);
      this.t(dfj.ti);
      this.t(dfj.tj);
      this.aj();
      this.g(dfj.sC, dfj.sA);
      this.p(dfj.sB);
      this.a(dfj.hW, cuf.hB);
      this.a(cuf.hB);
      this.aE();
      this.a(dfj.kN, cuf.jb);
      this.a(cuf.jb);
      this.f(dfj.bQ, ob.a(dfj.by, "_side"));
      this.a(dfj.R);
      this.a(dfj.S);
      this.a(dfj.iB);
      this.a(dfj.cx);
      this.a(dfj.cy);
      this.a(dfj.cz);
      this.a(dfj.fE);
      this.a(dfj.fF);
      this.a(dfj.fJ);
      this.a(dfj.N);
      this.a(dfj.T);
      this.a(dfj.O);
      this.a(dfj.ch);
      this.a(dfj.P);
      this.a(dfj.Q);
      this.a(dfj.ci);
      this.b(dfj.pj, od.d);
      this.a(dfj.pi);
      this.a(dfj.aR);
      this.a(dfj.aS);
      this.a(dfj.aT);
      this.a(dfj.hb);
      this.a(dfj.dI);
      this.a(dfj.dJ);
      this.a(dfj.ha);
      this.a(dfj.pC);
      this.a(dfj.mW);
      this.a(dfj.dR);
      this.a(dfj.k);
      this.a(dfj.pk);
      this.a(dfj.fz);
      this.a(dfj.ec);
      this.a(dfj.L);
      this.a(dfj.ph);
      this.a(dfj.dO);
      this.b(dfj.dT, od.g);
      this.b(dfj.pq, od.d);
      this.b(dfj.fa, od.d);
      this.m(dfj.ac);
      this.m(dfj.ga);
      this.a(dfj.kK);
      this.a(dfj.aY);
      this.a(dfj.iC);
      this.a(dfj.co);
      this.a(dfj.pK);
      this.a(dfj.ii);
      this.a(dfj.oy);
      this.a(dfj.dW);
      this.a(dfj.dX);
      this.b(dfj.ct, od.b);
      this.a(dfj.aO);
      this.b(dfj.bw, od.v);
      this.a(cuf.cS);
      this.b(dfj.ck, od.f);
      this.b(dfj.pd, od.d);
      this.a(dfj.op);
      this.a(dfj.aP);
      this.a(dfj.qt);
      this.a(dfj.qu);
      this.a(dfj.qN);
      this.a(dfj.su);
      this.a(dfj.tf);
      this.a(dfj.tg);
      this.a(dfj.th);
      this.e(dfj.qS);
      this.m(dfj.tt);
      this.aD();
      this.a(dfj.ra);
      this.a(dfj.rb);
      this.a(dfj.qW);
      this.a(dfj.qX);
      this.a(dfj.qY);
      this.a(dfj.qZ);
      this.k(dfj.qW, dfj.rw);
      this.k(dfj.qX, dfj.ry);
      this.k(dfj.qY, dfj.rx);
      this.k(dfj.qZ, dfj.rz);
      this.i(dfj.rM);
      this.i(dfj.rN);
      this.i(dfj.rP);
      this.i(dfj.rO);
      this.a(dfj.rM, dfj.rQ);
      this.a(dfj.rN, dfj.rR);
      this.a(dfj.rP, dfj.rT);
      this.a(dfj.rO, dfj.rS);
      this.k(dfj.rU);
      this.k(dfj.rV);
      this.k(dfj.rX);
      this.k(dfj.rW);
      this.b(dfj.rU, dfj.rY);
      this.b(dfj.rV, dfj.rZ);
      this.b(dfj.rX, dfj.sb);
      this.b(dfj.rW, dfj.sa);
      this.a(dfj.sc);
      this.a(dfj.sd);
      this.a(dfj.se);
      this.a(dfj.sf);
      this.k(dfj.sc, dfj.sg);
      this.k(dfj.sd, dfj.sh);
      this.k(dfj.se, dfj.si);
      this.k(dfj.sf, dfj.sj);
      this.j(dfj.gW, dfj.ch);
      this.j(dfj.gX, dfj.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dfj.og, dfj.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dfj.kt);
      this.J();
      this.K();
      this.L();
      this.M();
      this.P();
      this.Q();
      this.R();
      this.S();
      this.q();
      this.T();
      this.U();
      this.V();
      this.W();
      this.Y();
      this.Z();
      this.aa();
      this.ab();
      this.ac();
      this.ai();
      this.al();
      this.ak();
      this.am();
      this.an();
      this.y();
      this.ao();
      this.ap();
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.au();
      this.av();
      this.F(dfj.ff);
      this.F(dfj.fg);
      this.F(dfj.qT);
      this.ay();
      this.aC();
      this.af();
      this.ag();
      this.ah();
      this.X();
      this.O();
      this.N();
      this.ad();
      this.ae();
      this.E(dfj.cO);
      this.d(dfj.cO);
      this.E(dfj.oa);
      this.g();
      this.E(dfj.sE);
      this.l(dfj.cp, dfj.cq);
      this.l(dfj.ea, dfj.eb);
      this.a(dfj.cA, dfj.n, ob::c);
      this.a(dfj.nY, dfj.p, ob::d);
      this.y(dfj.ow);
      this.y(dfj.on);
      this.v(dfj.aU);
      this.v(dfj.hi);
      this.C();
      this.D(dfj.oe);
      this.D(dfj.of);
      this.e(dfj.eX, ny.a(dfj.eX));
      this.a(dfj.dY, od.d);
      this.a(dfj.dZ, od.d);
      this.a(dfj.te);
      this.a(dfj.kM, od.d);
      this.f(dfj.j);
      this.f(dfj.sH);
      this.f(dfj.I);
      this.g(dfj.J);
      this.g(dfj.M);
      this.f(dfj.K);
      this.e(dfj.F);
      this.b(dfj.to, od.f);
      this.a(dfj.ij, od.d, od.e);
      this.a(dfj.kx, od.w, od.x);
      this.a(dfj.hf, od.w, od.x);
      this.a(dfj.tk, od.d, od.e);
      this.a(dfj.tl, od.d, od.e);
      this.a(dfj.tm, od.d, od.e);
      this.c(dfj.nT, od.i);
      this.z();
      this.a(dfj.pe, ob::A);
      this.a(dfj.pf, ob::C);
      this.a(dfj.kD, dta.as, 0, 1, 2, 3);
      this.a(dfj.gt, dta.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfj.fq, dta.as, 0, 1, 1, 2);
      this.a(dfj.gu, dta.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfj.cB, dta.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dfj.kA, nk.e.b, dta.aq, 0, 1);
      this.i();
      this.h();
      this.a(ny.a("decorated_pot"), dfj.iA).b(dfj.tp);
      this.a(ny.a("banner"), dfj.n)
         .a(oa.bF, dfj.iJ, dfj.iK, dfj.iL, dfj.iM, dfj.iN, dfj.iO, dfj.iP, dfj.iQ, dfj.iR, dfj.iS, dfj.iT, dfj.iU, dfj.iV, dfj.iW, dfj.iX, dfj.iY)
         .b(dfj.iZ, dfj.ja, dfj.jb, dfj.jc, dfj.jd, dfj.je, dfj.jf, dfj.jg, dfj.jh, dfj.ji, dfj.jj, dfj.jk, dfj.jl, dfj.jm, dfj.jn, dfj.jo);
      this.a(ny.a("bed"), dfj.n)
         .b(dfj.aZ, dfj.ba, dfj.bb, dfj.bc, dfj.bd, dfj.be, dfj.bf, dfj.bg, dfj.bh, dfj.bi, dfj.bj, dfj.bk, dfj.bl, dfj.bm, dfj.bn, dfj.bo);
      this.m(dfj.aZ, dfj.bA);
      this.m(dfj.ba, dfj.bB);
      this.m(dfj.bb, dfj.bC);
      this.m(dfj.bc, dfj.bD);
      this.m(dfj.bd, dfj.bE);
      this.m(dfj.be, dfj.bF);
      this.m(dfj.bf, dfj.bG);
      this.m(dfj.bg, dfj.bH);
      this.m(dfj.bh, dfj.bI);
      this.m(dfj.bi, dfj.bJ);
      this.m(dfj.bj, dfj.bK);
      this.m(dfj.bk, dfj.bL);
      this.m(dfj.bl, dfj.bM);
      this.m(dfj.bm, dfj.bN);
      this.m(dfj.bn, dfj.bO);
      this.m(dfj.bo, dfj.bP);
      this.a(ny.a("skull"), dfj.dW)
         .a(oa.bG, dfj.gM, dfj.gK, dfj.gI, dfj.gE, dfj.gG, dfj.gQ)
         .a(dfj.gO)
         .b(dfj.gN, dfj.gP, dfj.gL, dfj.gJ, dfj.gF, dfj.gH, dfj.gR);
      this.G(dfj.kP);
      this.G(dfj.kQ);
      this.G(dfj.kR);
      this.G(dfj.kS);
      this.G(dfj.kT);
      this.G(dfj.kU);
      this.G(dfj.kV);
      this.G(dfj.kW);
      this.G(dfj.kX);
      this.G(dfj.kY);
      this.G(dfj.kZ);
      this.G(dfj.la);
      this.G(dfj.lb);
      this.G(dfj.lc);
      this.G(dfj.ld);
      this.G(dfj.le);
      this.G(dfj.lf);
      this.b(dfj.mX, od.q);
      this.c(dfj.mX);
      this.a(ny.a("chest"), dfj.n).b(dfj.cv, dfj.gV);
      this.a(ny.a("ender_chest"), dfj.co).b(dfj.fG);
      this.f(dfj.fx, dfj.co).a(dfj.fx, dfj.kF);
      this.a(dfj.aM);
      this.a(dfj.aN);
      this.a(dfj.lw);
      this.a(dfj.lx);
      this.a(dfj.ly);
      this.a(dfj.lz);
      this.a(dfj.lA);
      this.a(dfj.lB);
      this.a(dfj.lC);
      this.a(dfj.lD);
      this.a(dfj.lE);
      this.a(dfj.lF);
      this.a(dfj.lG);
      this.a(dfj.lH);
      this.a(dfj.lI);
      this.a(dfj.lJ);
      this.a(dfj.lK);
      this.a(dfj.lL);
      this.a(od.a, dfj.lM, dfj.lN, dfj.lO, dfj.lP, dfj.lQ, dfj.lR, dfj.lS, dfj.lT, dfj.lU, dfj.lV, dfj.lW, dfj.lX, dfj.lY, dfj.lZ, dfj.ma, dfj.mb);
      this.a(dfj.iA);
      this.a(dfj.hj);
      this.a(dfj.hk);
      this.a(dfj.hl);
      this.a(dfj.hm);
      this.a(dfj.hn);
      this.a(dfj.ho);
      this.a(dfj.hp);
      this.a(dfj.hq);
      this.a(dfj.hr);
      this.a(dfj.hs);
      this.a(dfj.ht);
      this.a(dfj.hu);
      this.a(dfj.hv);
      this.a(dfj.hw);
      this.a(dfj.hx);
      this.a(dfj.hy);
      this.a(dfj.qO);
      this.h(dfj.aQ, dfj.eY);
      this.h(dfj.ei, dfj.hz);
      this.h(dfj.ej, dfj.hA);
      this.h(dfj.ek, dfj.hB);
      this.h(dfj.el, dfj.hC);
      this.h(dfj.em, dfj.hD);
      this.h(dfj.en, dfj.hE);
      this.h(dfj.eo, dfj.hF);
      this.h(dfj.ep, dfj.hG);
      this.h(dfj.eq, dfj.hH);
      this.h(dfj.er, dfj.hI);
      this.h(dfj.es, dfj.hJ);
      this.h(dfj.et, dfj.hK);
      this.h(dfj.eu, dfj.hL);
      this.h(dfj.ev, dfj.hM);
      this.h(dfj.ew, dfj.hN);
      this.h(dfj.ex, dfj.hO);
      this.b(od.o, dfj.lg, dfj.lh, dfj.li, dfj.lj, dfj.lk, dfj.ll, dfj.lm, dfj.ln, dfj.lo, dfj.lp, dfj.lq, dfj.lr, dfj.ls, dfj.lt, dfj.lu, dfj.lv);
      this.g(dfj.bA, dfj.ik);
      this.g(dfj.bB, dfj.il);
      this.g(dfj.bC, dfj.im);
      this.g(dfj.bD, dfj.in);
      this.g(dfj.bE, dfj.io);
      this.g(dfj.bF, dfj.ip);
      this.g(dfj.bG, dfj.iq);
      this.g(dfj.bH, dfj.ir);
      this.g(dfj.bI, dfj.is);
      this.g(dfj.bJ, dfj.it);
      this.g(dfj.bK, dfj.iu);
      this.g(dfj.bL, dfj.iv);
      this.g(dfj.bM, dfj.iw);
      this.g(dfj.bN, dfj.ix);
      this.g(dfj.bO, dfj.iy);
      this.g(dfj.bP, dfj.iz);
      this.a(dfj.sI);
      this.a(dfj.eL);
      this.a(dfj.bu, dfj.gb, nk.e.a);
      this.a(dfj.bR, dfj.gc, nk.e.b);
      this.a(dfj.bT, dfj.gd, nk.e.b);
      this.a(dfj.bU, dfj.ge, nk.e.b);
      this.a(dfj.bV, dfj.gf, nk.e.b);
      this.a(dfj.bW, dfj.gg, nk.e.b);
      this.a(dfj.bX, dfj.gh, nk.e.b);
      this.a(dfj.bY, dfj.gi, nk.e.b);
      this.a(dfj.bZ, dfj.gj, nk.e.b);
      this.a(dfj.ca, dfj.gk, nk.e.b);
      this.a(dfj.cb, dfj.gl, nk.e.b);
      this.a(dfj.cc, dfj.gm, nk.e.b);
      this.a(dfj.ce, dfj.gn, nk.e.b);
      this.a(dfj.cd, dfj.go, nk.e.b);
      this.a(dfj.cg, dfj.gp, nk.e.b);
      this.a(dfj.cf, dfj.gq, nk.e.b);
      this.a(dfj.bv, dfj.gr, nk.e.b);
      this.a(dfj.bS, dfj.fS, nk.e.b);
      this.H();
      this.u(dfj.eT);
      this.u(dfj.eU);
      this.u(dfj.eV);
      this.a(dfj.bt, nk.e.a);
      this.b(dfj.dS, nk.e.a);
      this.a(cuf.dJ);
      this.b(dfj.mc, dfj.md, nk.e.b);
      this.a(cuf.dK);
      this.c(dfj.md);
      this.b(dfj.sG, nk.e.b);
      this.c(dfj.sG);
      this.c(dfj.sw);
      this.b(dfj.oz, dfj.oA, nk.e.b);
      this.b(dfj.oB, dfj.oC, nk.e.b);
      this.a(dfj.oz, "_plant");
      this.c(dfj.oA);
      this.a(dfj.oB, "_plant");
      this.c(dfj.oC);
      this.a(dfj.mY, nk.e.a, ob.c(ob.a(dfj.mZ, "_stage0")));
      this.m();
      this.a(dfj.bs, nk.e.b);
      this.c(dfj.iE, nk.e.b);
      this.c(dfj.iF, nk.e.b);
      this.c(dfj.iG, nk.e.b);
      this.c(dfj.iH, nk.e.a);
      this.c(dfj.iI, nk.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dfj.mw, dfj.mr, dfj.mm, dfj.mh, dfj.mG, dfj.mB, dfj.mQ, dfj.mL);
      this.a(dfj.mx, dfj.ms, dfj.mn, dfj.mi, dfj.mH, dfj.mC, dfj.mR, dfj.mM);
      this.a(dfj.my, dfj.mt, dfj.mo, dfj.mj, dfj.mI, dfj.mD, dfj.mS, dfj.mN);
      this.a(dfj.mz, dfj.mu, dfj.mp, dfj.mk, dfj.mJ, dfj.mE, dfj.mT, dfj.mO);
      this.a(dfj.mA, dfj.mv, dfj.mq, dfj.ml, dfj.mK, dfj.mF, dfj.mU, dfj.mP);
      this.e(dfj.fe, dfj.fc);
      this.e(dfj.fd, dfj.fb);
      this.l(dfj.ab).c(dfj.ab).a(dfj.av);
      this.l(dfj.am).c(dfj.am).a(dfj.aD);
      this.a(dfj.am, dfj.dj, dfj.ds);
      this.b(dfj.aL, od.s);
      this.l(dfj.Y).c(dfj.Y).a(dfj.as);
      this.l(dfj.ai).c(dfj.ai).a(dfj.aA);
      this.a(dfj.ai, dfj.dd, dfj.do);
      this.a(dfj.B, dfj.fX, nk.e.b);
      this.b(dfj.aI, od.s);
      this.l(dfj.Z).d(dfj.Z).a(dfj.at);
      this.l(dfj.aj).d(dfj.aj).a(dfj.aB);
      this.a(dfj.aj, dfj.de, dfj.dp);
      this.a(dfj.C, dfj.fY, nk.e.b);
      this.b(dfj.aJ, od.s);
      this.l(dfj.W).c(dfj.W).a(dfj.aq);
      this.l(dfj.ag).c(dfj.ag).a(dfj.ay);
      this.a(dfj.ag, dfj.dc, dfj.dn);
      this.a(dfj.z, dfj.fV, nk.e.b);
      this.b(dfj.aG, od.s);
      this.l(dfj.U).c(dfj.U).a(dfj.ao);
      this.l(dfj.al).c(dfj.al).a(dfj.aw);
      this.a(dfj.al, dfj.da, dfj.dl);
      this.a(dfj.x, dfj.fT, nk.e.b);
      this.b(dfj.aE, od.s);
      this.l(dfj.V).c(dfj.V).a(dfj.ap);
      this.l(dfj.af).c(dfj.af).a(dfj.ax);
      this.a(dfj.af, dfj.db, dfj.dm);
      this.a(dfj.y, dfj.fU, nk.e.b);
      this.b(dfj.aF, od.s);
      this.l(dfj.aa).c(dfj.aa).a(dfj.au);
      this.l(dfj.ak).c(dfj.ak).a(dfj.aC);
      this.a(dfj.ak, dfj.dg, dfj.dr);
      this.a(dfj.D, dfj.fZ, nk.e.b);
      this.b(dfj.aK, od.s);
      this.l(dfj.X).c(dfj.X).a(dfj.ar);
      this.l(dfj.ah).c(dfj.ah).a(dfj.az);
      this.a(dfj.ah, dfj.df, dfj.dq);
      this.a(dfj.A, dfj.fW, nk.e.b);
      this.b(dfj.aH, od.s);
      this.l(dfj.os).b(dfj.os).a(dfj.ou);
      this.l(dfj.ot).b(dfj.ot).a(dfj.ov);
      this.a(dfj.ot, dfj.dh, dfj.dt);
      this.a(dfj.ox, dfj.pm, nk.e.b);
      this.n(dfj.oD, dfj.po);
      this.l(dfj.oj).b(dfj.oj).a(dfj.ol);
      this.l(dfj.ok).b(dfj.ok).a(dfj.om);
      this.a(dfj.ok, dfj.di, dfj.du);
      this.a(dfj.oo, dfj.pn, nk.e.b);
      this.n(dfj.oq, dfj.pp);
      this.l(dfj.ae).d(dfj.ae);
      this.l(dfj.an).d(dfj.an);
      this.a(dfj.v, dfj.dk, dfj.dv);
      this.b(dfj.or, nk.e.b);
      this.a(cuf.dG);
      this.i(dfj.dy);
      this.k(dfj.hY);
      this.u();
      this.n(dfj.cP);
      this.o(dfj.bp);
      this.o(dfj.bq);
      this.o(dfj.hh);
      this.t();
      this.q(dfj.fN);
      this.q(dfj.kG);
      this.q(dfj.kH);
      this.r(dfj.gS);
      this.r(dfj.gT);
      this.r(dfj.gU);
      this.o();
      this.p();
      this.d(dfj.cD, od.h);
      this.d(dfj.nW, od.h);
      this.d(dfj.nV, od.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dfj.eK, dfj.eS);
      this.k(dfj.m, dfj.eO);
      this.k(dfj.eJ, dfj.eR);
      this.k(dfj.eI, dfj.eQ);
      this.az();
      this.k(dfj.eH, dfj.eP);
      this.aA();
      cvj.h().forEach($$0 -> this.a($$0, ny.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dfj.hX);
      nr.a<Integer> $$0 = nr.a(dta.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akk $$3 = ob.a(cuf.hC, $$2);
         $$0.a($$1, nt.a().a(nu.c, oa.aa.a(dfj.hX, $$2, ob.h($$3), this.c)));
         oa.bx.a(ny.a(cuf.hC, $$2), ob.k($$3), this.c);
      }

      this.b.accept(nq.a(dfj.hX).a($$0));
   }

   private void o(dfh $$0, dfh $$1) {
      this.a($$0.r());
      ob $$2 = ob.b(ob.G($$0));
      ob $$3 = ob.b(ob.a($$0, "_lit"));
      akk $$4 = oa.bH.a($$0, "_one_candle", $$2, this.c);
      akk $$5 = oa.bI.a($$0, "_two_candles", $$2, this.c);
      akk $$6 = oa.bJ.a($$0, "_three_candles", $$2, this.c);
      akk $$7 = oa.bK.a($$0, "_four_candles", $$2, this.c);
      akk $$8 = oa.bH.a($$0, "_one_candle_lit", $$3, this.c);
      akk $$9 = oa.bI.a($$0, "_two_candles_lit", $$3, this.c);
      akk $$10 = oa.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      akk $$11 = oa.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nq.a($$0)
               .a(
                  nr.a(dta.az, dta.r)
                     .a(1, false, nt.a().a(nu.c, $$4))
                     .a(2, false, nt.a().a(nu.c, $$5))
                     .a(3, false, nt.a().a(nu.c, $$6))
                     .a(4, false, nt.a().a(nu.c, $$7))
                     .a(1, true, nt.a().a(nu.c, $$8))
                     .a(2, true, nt.a().a(nu.c, $$9))
                     .a(3, true, nt.a().a(nu.c, $$10))
                     .a(4, true, nt.a().a(nu.c, $$11))
               )
         );
      akk $$12 = oa.bL.a($$1, ob.a($$0, false), this.c);
      akk $$13 = oa.bL.a($$1, "_lit", ob.a($$0, true), this.c);
      this.b.accept(nq.a($$1).a(a(dta.r, $$13, $$12)));
   }

   class a {
      private final akk b;

      public a(final akk $$0, final dfh $$1) {
         this.b = oa.aa.a($$0, ob.u($$1), nk.this.c);
      }

      public nk.a a(dfh... $$0) {
         for (dfh $$1 : $$0) {
            nk.this.b.accept(nk.c($$1, this.b));
         }

         return this;
      }

      public nk.a b(dfh... $$0) {
         for (dfh $$1 : $$0) {
            nk.this.c($$1);
         }

         return this.a($$0);
      }

      public nk.a a(nz $$0, dfh... $$1) {
         for (dfh $$2 : $$1) {
            $$0.a(ny.a($$2.r()), ob.u($$2), nk.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final ob b;
      private final Map<nz, akk> c = Maps.newHashMap();
      @Nullable
      private lu d;
      @Nullable
      private akk e;
      private final Set<dfh> f = new HashSet<>();

      public b(final ob $$0) {
         this.b = $$0;
      }

      public nk.b a(dfh $$0, nz $$1) {
         this.e = $$1.a($$0, this.b, nk.this.c);
         if (nk.this.f.containsKey($$0)) {
            nk.this.b.accept(nk.this.f.get($$0).create($$0, this.e, this.b, nk.this.c));
         } else {
            nk.this.b.accept(nk.c($$0, this.e));
         }

         return this;
      }

      public nk.b a(dfh $$0, dfh $$1) {
         akk $$2 = ny.a($$0);
         nk.this.b.accept(nk.c($$1, $$2));
         nk.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nk.b a(dfh $$0) {
         akk $$1 = oa.s.a($$0, this.b, nk.this.c);
         akk $$2 = oa.t.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.b($$0, $$1, $$2));
         akk $$3 = oa.u.a($$0, this.b, nk.this.c);
         nk.this.a($$0, $$3);
         return this;
      }

      public nk.b b(dfh $$0) {
         akk $$1 = oa.M.a($$0, this.b, nk.this.c);
         akk $$2 = oa.N.a($$0, this.b, nk.this.c);
         akk $$3 = oa.O.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$1, $$2, $$3));
         akk $$4 = oa.P.a($$0, this.b, nk.this.c);
         nk.this.a($$0, $$4);
         return this;
      }

      public nk.b c(dfh $$0) {
         ob $$1 = ob.p($$0);
         akk $$2 = oa.D.a($$0, $$1, nk.this.c);
         akk $$3 = oa.E.a($$0, $$1, nk.this.c);
         akk $$4 = oa.F.a($$0, $$1, nk.this.c);
         akk $$5 = oa.G.a($$0, $$1, nk.this.c);
         akk $$6 = oa.H.a($$0, $$1, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$2, $$3, $$4, $$5, $$6));
         akk $$7 = oa.I.a($$0, $$1, nk.this.c);
         nk.this.a($$0, $$7);
         return this;
      }

      public nk.b d(dfh $$0) {
         akk $$1 = oa.J.a($$0, this.b, nk.this.c);
         akk $$2 = oa.K.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.c($$0, $$1, $$2));
         akk $$3 = oa.L.a($$0, this.b, nk.this.c);
         nk.this.a($$0, $$3);
         return this;
      }

      public nk.b e(dfh $$0) {
         ob $$1 = ob.p($$0);
         akk $$2 = oa.R.a($$0, $$1, nk.this.c);
         akk $$3 = oa.Q.a($$0, $$1, nk.this.c);
         akk $$4 = oa.T.a($$0, $$1, nk.this.c);
         akk $$5 = oa.S.a($$0, $$1, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nk.b f(dfh $$0) {
         akk $$1 = oa.V.a($$0, this.b, nk.this.c);
         akk $$2 = oa.U.a($$0, this.b, nk.this.c);
         akk $$3 = oa.X.a($$0, this.b, nk.this.c);
         akk $$4 = oa.W.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nk.b g(dfh $$0) {
         akk $$1 = oa.Y.a($$0, this.b, nk.this.c);
         akk $$2 = oa.Z.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.e($$0, $$1, $$2));
         return this;
      }

      public nk.b h(dfh $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dfh $$1 = this.d.b().get(lu.b.r);
            akk $$2 = oa.aa.a($$0, this.b, nk.this.c);
            nk.this.b.accept(nk.c($$0, $$2));
            nk.this.b.accept(nk.c($$1, $$2));
            nk.this.a($$0.r());
            nk.this.c($$1);
            return this;
         }
      }

      public nk.b i(dfh $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akk $$1 = this.a(oa.ab, $$0);
            akk $$2 = this.a(oa.ac, $$0);
            nk.this.b.accept(nk.e($$0, $$1, $$2, this.e));
            nk.this.a($$0, $$1);
            return this;
         }
      }

      public nk.b j(dfh $$0) {
         akk $$1 = this.a(oa.af, $$0);
         akk $$2 = this.a(oa.ae, $$0);
         akk $$3 = this.a(oa.ag, $$0);
         nk.this.b.accept(nk.b($$0, $$1, $$2, $$3));
         nk.this.a($$0, $$2);
         return this;
      }

      private nk.b k(dfh $$0) {
         od $$1 = nk.this.g.getOrDefault($$0, od.a.get($$0));
         akk $$2 = $$1.a($$0, nk.this.c);
         nk.this.b.accept(nk.c($$0, $$2));
         return this;
      }

      private nk.b l(dfh $$0) {
         nk.this.i($$0);
         return this;
      }

      private void m(dfh $$0) {
         if (nk.this.e.contains($$0)) {
            nk.this.k($$0);
         } else {
            nk.this.j($$0);
         }
      }

      private akk a(nz $$0, dfh $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nk.this.c));
      }

      public nk.b a(lu $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nk.b, dfh> $$2 = nk.h.get($$0x);
               if ($$2 != null) {
                  $$2.accept(this, $$1);
               }
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      nn create(dfh var1, akk var2, ob var3, BiConsumer<akk, Supplier<JsonElement>> var4);
   }

   static record d(nz a, String b) {
   }

   static enum e {
      a,
      b;

      public nz a() {
         return this == a ? oa.ap : oa.ao;
      }

      public nz b() {
         return this == a ? oa.ar : oa.aq;
      }
   }

   class f {
      private final ob b;

      public f(final ob $$0) {
         this.b = $$0;
      }

      public nk.f a(dfh $$0) {
         ob $$1 = this.b.c(oc.d, this.b.a(oc.i));
         akk $$2 = oa.j.a($$0, $$1, nk.this.c);
         nk.this.b.accept(nk.d($$0, $$2));
         return this;
      }

      public nk.f b(dfh $$0) {
         akk $$1 = oa.j.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.d($$0, $$1));
         return this;
      }

      public nk.f c(dfh $$0) {
         akk $$1 = oa.j.a($$0, this.b, nk.this.c);
         akk $$2 = oa.k.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.d($$0, $$1, $$2));
         return this;
      }

      public nk.f d(dfh $$0) {
         nk.this.b.accept(nk.a($$0, this.b, nk.this.c));
         return this;
      }
   }
}
