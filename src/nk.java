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
   private final Consumer<ctv> d;
   final List<dff> e = ImmutableList.of(dfh.ey, dfh.eE, dfh.hY);
   final Map<dff, nk.c> f = ImmutableMap.builder().put(dfh.b, nk::a).put(dfh.sJ, nk::c).put(dfh.eM, nk::b).build();
   final Map<dff, od> g = ImmutableMap.builder()
      .put(dfh.aV, od.y.get(dfh.aV))
      .put(dfh.jp, od.y.get(dfh.jp))
      .put(dfh.jS, od.a(ob.a(dfh.aV, "_top")))
      .put(dfh.jU, od.a(ob.a(dfh.jp, "_top")))
      .put(dfh.aX, od.d.get(dfh.aV).a($$0x -> $$0x.a(oc.i, ob.G(dfh.aX))))
      .put(dfh.jr, od.d.get(dfh.jp).a($$0x -> $$0x.a(oc.i, ob.G(dfh.jr))))
      .put(dfh.hd, od.d.get(dfh.hd))
      .put(dfh.jT, od.a(ob.a(dfh.hd, "_bottom")))
      .put(dfh.pr, od.z.get(dfh.pr))
      .put(dfh.sJ, od.z.get(dfh.sJ))
      .put(dfh.he, od.d.get(dfh.he).a($$0x -> $$0x.a(oc.i, ob.G(dfh.he))))
      .put(dfh.aW, od.d.get(dfh.aW).a($$0x -> {
         $$0x.a(oc.d, ob.a(dfh.aV, "_top"));
         $$0x.a(oc.i, ob.G(dfh.aW));
      }))
      .put(dfh.jq, od.d.get(dfh.jq).a($$0x -> {
         $$0x.a(oc.d, ob.a(dfh.jp, "_top"));
         $$0x.a(oc.i, ob.G(dfh.jq));
      }))
      .put(dfh.qM, od.z.get(dfh.qM))
      .put(dfh.qH, od.z.get(dfh.qH))
      .build();
   static final Map<lu.b, BiConsumer<nk.b, dff>> h = ImmutableMap.builder()
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
   public static final List<Pair<dsy, Function<akk, nt>>> a = List.of(
      Pair.of(dsx.L, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0)),
      Pair.of(dsx.M, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.b, nu.a.b).a(nu.d, true)),
      Pair.of(dsx.N, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.b, nu.a.c).a(nu.d, true)),
      Pair.of(dsx.O, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.b, nu.a.d).a(nu.d, true)),
      Pair.of(dsx.J, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.a, nu.a.d).a(nu.d, true)),
      Pair.of(dsx.K, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.a, nu.a.b).a(nu.d, true))
   );
   private static final Map<nk.d, akk> i = new HashMap<>();

   private static nn a(dff $$0, akk $$1, ob $$2, BiConsumer<akk, Supplier<JsonElement>> $$3) {
      akk $$4 = oa.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nn b(dff $$0, akk $$1, ob $$2, BiConsumer<akk, Supplier<JsonElement>> $$3) {
      akk $$4 = oa.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nn c(dff $$0, akk $$1, ob $$2, BiConsumer<akk, Supplier<JsonElement>> $$3) {
      akk $$4 = oa.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nk(Consumer<nn> $$0, BiConsumer<akk, Supplier<JsonElement>> $$1, Consumer<ctv> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dff $$0) {
      this.d.accept($$0.r());
   }

   void a(dff $$0, akk $$1) {
      this.c.accept(ny.a($$0.r()), new nx($$1));
   }

   private void a(ctv $$0, akk $$1) {
      this.c.accept(ny.a($$0), new nx($$1));
   }

   void a(ctv $$0) {
      oa.bx.a(ny.a($$0), ob.b($$0), this.c);
   }

   private void d(dff $$0) {
      ctv $$1 = $$0.r();
      if ($$1 != cud.a) {
         oa.bx.a(ny.a($$1), ob.F($$0), this.c);
      }
   }

   private void a(dff $$0, String $$1) {
      ctv $$2 = $$0.r();
      oa.bx.a(ny.a($$2), ob.k(ob.a($$0, $$1)), this.c);
   }

   private static nr b() {
      return nr.a(dsx.R).a(jf.f, nt.a().a(nu.b, nu.a.b)).a(jf.d, nt.a().a(nu.b, nu.a.c)).a(jf.e, nt.a().a(nu.b, nu.a.d)).a(jf.c, nt.a());
   }

   private static nr c() {
      return nr.a(dsx.R).a(jf.d, nt.a()).a(jf.e, nt.a().a(nu.b, nu.a.b)).a(jf.c, nt.a().a(nu.b, nu.a.c)).a(jf.f, nt.a().a(nu.b, nu.a.d));
   }

   private static nr d() {
      return nr.a(dsx.R).a(jf.f, nt.a()).a(jf.d, nt.a().a(nu.b, nu.a.b)).a(jf.e, nt.a().a(nu.b, nu.a.c)).a(jf.c, nt.a().a(nu.b, nu.a.d));
   }

   private static nr e() {
      return nr.a(dsx.P)
         .a(jf.a, nt.a().a(nu.a, nu.a.b))
         .a(jf.b, nt.a().a(nu.a, nu.a.d))
         .a(jf.c, nt.a())
         .a(jf.d, nt.a().a(nu.b, nu.a.c))
         .a(jf.e, nt.a().a(nu.b, nu.a.d))
         .a(jf.f, nt.a().a(nu.b, nu.a.b));
   }

   private static nq b(dff $$0, akk $$1) {
      return nq.a($$0, a($$1));
   }

   private static nt[] a(akk $$0) {
      return new nt[]{nt.a().a(nu.c, $$0), nt.a().a(nu.c, $$0).a(nu.b, nu.a.b), nt.a().a(nu.c, $$0).a(nu.b, nu.a.c), nt.a().a(nu.c, $$0).a(nu.b, nu.a.d)};
   }

   private static nq a(dff $$0, akk $$1, akk $$2) {
      return nq.a($$0, nt.a().a(nu.c, $$1), nt.a().a(nu.c, $$2), nt.a().a(nu.c, $$1).a(nu.b, nu.a.c), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c));
   }

   private static nr a(dsy $$0, akk $$1, akk $$2) {
      return nr.a($$0).a(true, nt.a().a(nu.c, $$1)).a(false, nt.a().a(nu.c, $$2));
   }

   private void e(dff $$0) {
      akk $$1 = od.a.create($$0, this.c);
      akk $$2 = od.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dff $$0) {
      akk $$1 = od.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dff $$0) {
      this.b.accept(nq.a($$0).a(nr.a(dsx.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akk $$3 = ob.a($$0, $$2);
         return nt.a().a(nu.c, oa.c.a($$0, $$2, new ob().a(oc.a, $$3), this.c));
      })));
      this.a($$0, ob.a($$0, "_0"));
   }

   static nn b(dff $$0, akk $$1, akk $$2) {
      return nq.a($$0)
         .a(nr.a(dsx.w).a(false, nt.a().a(nu.c, $$1)).a(true, nt.a().a(nu.c, $$2)))
         .a(
            nr.a(dsx.U, dsx.R)
               .a(dss.a, jf.f, nt.a().a(nu.b, nu.a.b))
               .a(dss.a, jf.e, nt.a().a(nu.b, nu.a.d))
               .a(dss.a, jf.d, nt.a().a(nu.b, nu.a.c))
               .a(dss.a, jf.c, nt.a())
               .a(dss.b, jf.f, nt.a().a(nu.b, nu.a.b).a(nu.a, nu.a.b).a(nu.d, true))
               .a(dss.b, jf.e, nt.a().a(nu.b, nu.a.d).a(nu.a, nu.a.b).a(nu.d, true))
               .a(dss.b, jf.d, nt.a().a(nu.b, nu.a.c).a(nu.a, nu.a.b).a(nu.d, true))
               .a(dss.b, jf.c, nt.a().a(nu.a, nu.a.b).a(nu.d, true))
               .a(dss.c, jf.f, nt.a().a(nu.b, nu.a.d).a(nu.a, nu.a.c))
               .a(dss.c, jf.e, nt.a().a(nu.b, nu.a.b).a(nu.a, nu.a.c))
               .a(dss.c, jf.d, nt.a().a(nu.a, nu.a.c))
               .a(dss.c, jf.c, nt.a().a(nu.b, nu.a.c).a(nu.a, nu.a.c))
         );
   }

   private static nr.d<jf, dtd, dtc, Boolean> a(nr.d<jf, dtd, dtc, Boolean> $$0, dtd $$1, akk $$2, akk $$3, akk $$4, akk $$5) {
      return $$0.a(jf.f, $$1, dtc.a, false, nt.a().a(nu.c, $$2))
         .a(jf.d, $$1, dtc.a, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
         .a(jf.e, $$1, dtc.a, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
         .a(jf.c, $$1, dtc.a, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
         .a(jf.f, $$1, dtc.b, false, nt.a().a(nu.c, $$4))
         .a(jf.d, $$1, dtc.b, false, nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
         .a(jf.e, $$1, dtc.b, false, nt.a().a(nu.c, $$4).a(nu.b, nu.a.c))
         .a(jf.c, $$1, dtc.b, false, nt.a().a(nu.c, $$4).a(nu.b, nu.a.d))
         .a(jf.f, $$1, dtc.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
         .a(jf.d, $$1, dtc.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
         .a(jf.e, $$1, dtc.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
         .a(jf.c, $$1, dtc.a, true, nt.a().a(nu.c, $$3))
         .a(jf.f, $$1, dtc.b, true, nt.a().a(nu.c, $$5).a(nu.b, nu.a.d))
         .a(jf.d, $$1, dtc.b, true, nt.a().a(nu.c, $$5))
         .a(jf.e, $$1, dtc.b, true, nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
         .a(jf.c, $$1, dtc.b, true, nt.a().a(nu.c, $$5).a(nu.b, nu.a.c));
   }

   private static nn a(dff $$0, akk $$1, akk $$2, akk $$3, akk $$4, akk $$5, akk $$6, akk $$7, akk $$8) {
      return nq.a($$0).a(a(a(nr.a(dsx.R, dsx.ae, dsx.be, dsx.u), dtd.b, $$1, $$2, $$3, $$4), dtd.a, $$5, $$6, $$7, $$8));
   }

   static nn a(dff $$0, akk $$1, akk $$2, akk $$3, akk $$4, akk $$5) {
      return np.a($$0)
         .a(nt.a().a(nu.c, $$1))
         .a(no.a().a(dsx.L, true), nt.a().a(nu.c, $$2).a(nu.d, false))
         .a(no.a().a(dsx.M, true), nt.a().a(nu.c, $$3).a(nu.d, false))
         .a(no.a().a(dsx.N, true), nt.a().a(nu.c, $$4).a(nu.d, false))
         .a(no.a().a(dsx.O, true), nt.a().a(nu.c, $$5).a(nu.d, false));
   }

   static nn c(dff $$0, akk $$1, akk $$2) {
      return np.a($$0)
         .a(nt.a().a(nu.c, $$1))
         .a(no.a().a(dsx.L, true), nt.a().a(nu.c, $$2).a(nu.d, true))
         .a(no.a().a(dsx.M, true), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true))
         .a(no.a().a(dsx.N, true), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true))
         .a(no.a().a(dsx.O, true), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true));
   }

   static nn a(dff $$0, akk $$1, akk $$2, akk $$3) {
      return np.a($$0)
         .a(no.a().a(dsx.J, true), nt.a().a(nu.c, $$1))
         .a(no.a().a(dsx.X, dtt.b), nt.a().a(nu.c, $$2).a(nu.d, true))
         .a(no.a().a(dsx.W, dtt.b), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true))
         .a(no.a().a(dsx.Y, dtt.b), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true))
         .a(no.a().a(dsx.Z, dtt.b), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true))
         .a(no.a().a(dsx.X, dtt.c), nt.a().a(nu.c, $$3).a(nu.d, true))
         .a(no.a().a(dsx.W, dtt.c), nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true))
         .a(no.a().a(dsx.Y, dtt.c), nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true))
         .a(no.a().a(dsx.Z, dtt.c), nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true));
   }

   static nn a(dff $$0, akk $$1, akk $$2, akk $$3, akk $$4, boolean $$5) {
      return nq.a($$0, nt.a().a(nu.d, $$5))
         .a(c())
         .a(
            nr.a(dsx.q, dsx.u)
               .a(false, false, nt.a().a(nu.c, $$2))
               .a(true, false, nt.a().a(nu.c, $$4))
               .a(false, true, nt.a().a(nu.c, $$1))
               .a(true, true, nt.a().a(nu.c, $$3))
         );
   }

   static nn b(dff $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0)
         .a(
            nr.a(dsx.R, dsx.af, dsx.bi)
               .a(jf.f, dtg.b, dtq.a, nt.a().a(nu.c, $$2))
               .a(jf.e, dtg.b, dtq.a, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtg.b, dtq.a, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtg.b, dtq.a, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtg.b, dtq.e, nt.a().a(nu.c, $$3))
               .a(jf.e, dtg.b, dtq.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtg.b, dtq.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtg.b, dtq.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtg.b, dtq.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.e, dtg.b, dtq.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.d, dtg.b, dtq.d, nt.a().a(nu.c, $$3))
               .a(jf.c, dtg.b, dtq.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.f, dtg.b, dtq.c, nt.a().a(nu.c, $$1))
               .a(jf.e, dtg.b, dtq.c, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtg.b, dtq.c, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtg.b, dtq.c, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtg.b, dtq.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.e, dtg.b, dtq.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.d, dtg.b, dtq.b, nt.a().a(nu.c, $$1))
               .a(jf.c, dtg.b, dtq.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.f, dtg.a, dtq.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.e, dtg.a, dtq.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtg.a, dtq.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtg.a, dtq.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtg.a, dtq.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.e, dtg.a, dtq.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.d, dtg.a, dtq.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.c, dtg.a, dtq.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.f, dtg.a, dtq.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.e, dtg.a, dtq.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtg.a, dtq.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtg.a, dtq.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtg.a, dtq.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.e, dtg.a, dtq.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.d, dtg.a, dtq.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.c, dtg.a, dtq.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.f, dtg.a, dtq.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.e, dtg.a, dtq.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtg.a, dtq.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtg.a, dtq.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
         );
   }

   private static nn c(dff $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0)
         .a(
            nr.a(dsx.R, dsx.af, dsx.u)
               .a(jf.c, dtg.b, false, nt.a().a(nu.c, $$2))
               .a(jf.d, dtg.b, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
               .a(jf.f, dtg.b, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
               .a(jf.e, dtg.b, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
               .a(jf.c, dtg.a, false, nt.a().a(nu.c, $$1))
               .a(jf.d, dtg.a, false, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
               .a(jf.f, dtg.a, false, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
               .a(jf.e, dtg.a, false, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
               .a(jf.c, dtg.b, true, nt.a().a(nu.c, $$3))
               .a(jf.d, dtg.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(jf.f, dtg.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(jf.e, dtg.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               .a(jf.c, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.c))
               .a(jf.d, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.a))
               .a(jf.f, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.d))
               .a(jf.e, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.b))
         );
   }

   private static nn d(dff $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0)
         .a(
            nr.a(dsx.R, dsx.af, dsx.u)
               .a(jf.c, dtg.b, false, nt.a().a(nu.c, $$2))
               .a(jf.d, dtg.b, false, nt.a().a(nu.c, $$2))
               .a(jf.f, dtg.b, false, nt.a().a(nu.c, $$2))
               .a(jf.e, dtg.b, false, nt.a().a(nu.c, $$2))
               .a(jf.c, dtg.a, false, nt.a().a(nu.c, $$1))
               .a(jf.d, dtg.a, false, nt.a().a(nu.c, $$1))
               .a(jf.f, dtg.a, false, nt.a().a(nu.c, $$1))
               .a(jf.e, dtg.a, false, nt.a().a(nu.c, $$1))
               .a(jf.c, dtg.b, true, nt.a().a(nu.c, $$3))
               .a(jf.d, dtg.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(jf.f, dtg.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(jf.e, dtg.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               .a(jf.c, dtg.a, true, nt.a().a(nu.c, $$3))
               .a(jf.d, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(jf.f, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(jf.e, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
         );
   }

   static nq c(dff $$0, akk $$1) {
      return nq.a($$0, nt.a().a(nu.c, $$1));
   }

   private static nr f() {
      return nr.a(dsx.I).a(jf.a.b, nt.a()).a(jf.a.c, nt.a().a(nu.a, nu.a.b)).a(jf.a.a, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b));
   }

   static nn a(dff $$0, ob $$1, BiConsumer<akk, Supplier<JsonElement>> $$2) {
      akk $$3 = oa.g.a($$0, $$1, $$2);
      akk $$4 = oa.h.a($$0, $$1, $$2);
      akk $$5 = oa.i.a($$0, $$1, $$2);
      akk $$6 = oa.j.a($$0, $$1, $$2);
      return nq.a($$0, nt.a().a(nu.c, $$6)).a(nr.a(dsx.I).a(jf.a.a, nt.a().a(nu.c, $$3)).a(jf.a.b, nt.a().a(nu.c, $$4)).a(jf.a.c, nt.a().a(nu.c, $$5)));
   }

   static nn d(dff $$0, akk $$1) {
      return nq.a($$0, nt.a().a(nu.c, $$1)).a(f());
   }

   private void e(dff $$0, akk $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dff $$0, od.a $$1) {
      akk $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dff $$0, od.a $$1) {
      akk $$2 = $$1.create($$0, this.c);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, $$2)).a(b()));
   }

   static nn d(dff $$0, akk $$1, akk $$2) {
      return nq.a($$0)
         .a(
            nr.a(dsx.I)
               .a(jf.a.b, nt.a().a(nu.c, $$1))
               .a(jf.a.c, nt.a().a(nu.c, $$2).a(nu.a, nu.a.b))
               .a(jf.a.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.b).a(nu.b, nu.a.b))
         );
   }

   private void a(dff $$0, od.a $$1, od.a $$2) {
      akk $$3 = $$1.create($$0, this.c);
      akk $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akk a(dff $$0, String $$1, nz $$2, Function<akk, ob> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ob.a($$0, $$1)), this.c);
   }

   static nn e(dff $$0, akk $$1, akk $$2) {
      return nq.a($$0).a(a(dsx.w, $$2, $$1));
   }

   static nn e(dff $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0).a(nr.a(dsx.bh).a(dtp.b, nt.a().a(nu.c, $$1)).a(dtp.a, nt.a().a(nu.c, $$2)).a(dtp.c, nt.a().a(nu.c, $$3)));
   }

   public void a(dff $$0) {
      this.b($$0, od.a);
   }

   public void b(dff $$0, od.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dff $$0, ob $$1, nz $$2) {
      akk $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nk.b h(dff $$0) {
      od $$1 = this.g.getOrDefault($$0, od.a.get($$0));
      return new nk.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dff $$0, dff $$1, dff $$2) {
      ob $$3 = ob.u($$0);
      akk $$4 = oa.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dff $$0) {
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

   private void a(dff $$0, dff $$1) {
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

   void j(dff $$0) {
      ob $$1 = ob.b($$0);
      akk $$2 = oa.ak.a($$0, $$1, this.c);
      akk $$3 = oa.al.a($$0, $$1, this.c);
      akk $$4 = oa.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dff $$0) {
      ob $$1 = ob.b($$0);
      akk $$2 = oa.ah.a($$0, $$1, this.c);
      akk $$3 = oa.ai.a($$0, $$1, this.c);
      akk $$4 = oa.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dff $$0, dff $$1) {
      akk $$2 = oa.ah.a($$0);
      akk $$3 = oa.ai.a($$0);
      akk $$4 = oa.aj.a($$0);
      this.a($$1, ny.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dfh.sD);
      akk $$0 = ny.a(dfh.sD);
      akk $$1 = ny.a(dfh.sD, "_partial_tilt");
      akk $$2 = ny.a(dfh.sD, "_full_tilt");
      this.b
         .accept(
            nq.a(dfh.sD)
               .a(b())
               .a(nr.a(dsx.bl).a(dts.a, nt.a().a(nu.c, $$0)).a(dts.b, nt.a().a(nu.c, $$0)).a(dts.c, nt.a().a(nu.c, $$1)).a(dts.d, nt.a().a(nu.c, $$2)))
         );
   }

   private nk.f l(dff $$0) {
      return new nk.f(ob.n($$0));
   }

   private void m(dff $$0) {
      this.c($$0, $$0);
   }

   private void c(dff $$0, dff $$1) {
      this.b.accept(c($$0, ny.a($$1)));
   }

   private void a(dff $$0, nk.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dff $$0, nk.e $$1, ob $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dff $$0, nk.e $$1) {
      ob $$2 = ob.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dff $$0, nk.e $$1, ob $$2) {
      akk $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dff $$0, nk.e $$1, dtk<Integer> $$2, int... $$3) {
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

   private void a(dff $$0, dff $$1, nk.e $$2) {
      this.a($$0, $$2);
      ob $$3 = ob.d($$0);
      akk $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dff $$0, dff $$1) {
      od $$2 = od.p.get($$0);
      akk $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akk $$4 = oa.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nq.a($$1, nt.a().a(nu.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dff $$0, dff $$1) {
      this.a($$0.r());
      ob $$2 = ob.h($$0);
      ob $$3 = ob.a($$0, $$1);
      akk $$4 = oa.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nq.a($$1, nt.a().a(nu.c, $$4))
               .a(nr.a(dsx.R).a(jf.e, nt.a()).a(jf.d, nt.a().a(nu.b, nu.a.d)).a(jf.c, nt.a().a(nu.b, nu.a.b)).a(jf.f, nt.a().a(nu.b, nu.a.c)))
         );
      this.b.accept(nq.a($$0).a(nr.a(dsx.av).a($$2x -> nt.a().a(nu.c, oa.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dff $$0 = dfh.kC;
      this.a($$0.r());
      akk $$1 = ny.a($$0, "_top");
      akk $$2 = ny.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dff $$0 = dfh.kB;
      this.a($$0.r());
      nr $$1 = nr.a(dku.d, dsx.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> nt.a().a(nu.c, ny.a($$0, "_top_stage_" + $$1x));
            case b -> nt.a().a(nu.c, ny.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nq.a($$0).a($$1));
   }

   private void a(dff $$0, dff $$1, dff $$2, dff $$3, dff $$4, dff $$5, dff $$6, dff $$7) {
      this.a($$0, nk.e.b);
      this.a($$1, nk.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dff $$0, nk.e $$1) {
      this.a($$0, "_top");
      akk $$2 = this.a($$0, "_top", $$1.a(), ob::c);
      akk $$3 = this.a($$0, "_bottom", $$1.a(), ob::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dfh.iD, "_front");
      akk $$0 = ny.a(dfh.iD, "_top");
      akk $$1 = this.a(dfh.iD, "_bottom", nk.e.b.a(), ob::c);
      this.f(dfh.iD, $$0, $$1);
   }

   private void k() {
      akk $$0 = this.a(dfh.bx, "_top", oa.bk, ob::a);
      akk $$1 = this.a(dfh.bx, "_bottom", oa.bk, ob::a);
      this.f(dfh.bx, $$0, $$1);
   }

   private void l() {
      this.c(dfh.sF);
      akk $$0 = ny.a(dfh.sF, "_top");
      akk $$1 = ny.a(dfh.sF, "_bottom");
      this.b.accept(nq.a(dfh.sF).a(b()).a(nr.a(dsx.ae).a(dtd.b, nt.a().a(nu.c, $$1)).a(dtd.a, nt.a().a(nu.c, $$0))));
   }

   private void f(dff $$0, akk $$1, akk $$2) {
      this.b.accept(nq.a($$0).a(nr.a(dsx.ae).a(dtd.b, nt.a().a(nu.c, $$2)).a(dtd.a, nt.a().a(nu.c, $$1))));
   }

   private void n(dff $$0) {
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
                  nr.a(dsx.ag)
                     .a(dtl.a, nt.a().a(nu.c, $$3))
                     .a(dtl.b, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
                     .a(dtl.c, nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
                     .a(dtl.d, nt.a().a(nu.c, $$6).a(nu.b, nu.a.b))
                     .a(dtl.e, nt.a().a(nu.c, $$5))
                     .a(dtl.f, nt.a().a(nu.c, $$6))
                     .a(dtl.g, nt.a().a(nu.c, $$4))
                     .a(dtl.h, nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
                     .a(dtl.i, nt.a().a(nu.c, $$4).a(nu.b, nu.a.c))
                     .a(dtl.j, nt.a().a(nu.c, $$4).a(nu.b, nu.a.d))
               )
         );
   }

   private void o(dff $$0) {
      akk $$1 = this.a($$0, "", oa.as, ob::e);
      akk $$2 = this.a($$0, "", oa.au, ob::e);
      akk $$3 = this.a($$0, "", oa.av, ob::e);
      akk $$4 = this.a($$0, "_on", oa.as, ob::e);
      akk $$5 = this.a($$0, "_on", oa.au, ob::e);
      akk $$6 = this.a($$0, "_on", oa.av, ob::e);
      nr $$7 = nr.a(dsx.w, dsx.ah).a(($$6x, $$7x) -> {
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

   private nk.a a(akk $$0, dff $$1) {
      return new nk.a($$0, $$1);
   }

   private nk.a f(dff $$0, dff $$1) {
      return new nk.a(ny.a($$0), $$1);
   }

   private void a(dff $$0, ctv $$1) {
      akk $$2 = oa.aa.a($$0, ob.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dff $$0, akk $$1) {
      akk $$2 = oa.aa.a($$0, ob.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dff $$0, dff $$1) {
      this.a($$0);
      akk $$2 = od.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dff $$0) {
      this.a($$0.r());
      akk $$1 = od.k.create($$0, this.c);
      akk $$2 = od.l.create($$0, this.c);
      akk $$3 = od.m.create($$0, this.c);
      akk $$4 = od.n.create($$0, this.c);
      this.b
         .accept(
            np.a($$0)
               .a(no.a().a(dsx.S, 1, 2, 3, 4).a(dsx.R, jf.c), nt.a().a(nu.c, $$1))
               .a(no.a().a(dsx.S, 1, 2, 3, 4).a(dsx.R, jf.f), nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.S, 1, 2, 3, 4).a(dsx.R, jf.d), nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
               .a(no.a().a(dsx.S, 1, 2, 3, 4).a(dsx.R, jf.e), nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
               .a(no.a().a(dsx.S, 2, 3, 4).a(dsx.R, jf.c), nt.a().a(nu.c, $$2))
               .a(no.a().a(dsx.S, 2, 3, 4).a(dsx.R, jf.f), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.S, 2, 3, 4).a(dsx.R, jf.d), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
               .a(no.a().a(dsx.S, 2, 3, 4).a(dsx.R, jf.e), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
               .a(no.a().a(dsx.S, 3, 4).a(dsx.R, jf.c), nt.a().a(nu.c, $$3))
               .a(no.a().a(dsx.S, 3, 4).a(dsx.R, jf.f), nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.S, 3, 4).a(dsx.R, jf.d), nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(no.a().a(dsx.S, 3, 4).a(dsx.R, jf.e), nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               .a(no.a().a(dsx.S, 4).a(dsx.R, jf.c), nt.a().a(nu.c, $$4))
               .a(no.a().a(dsx.S, 4).a(dsx.R, jf.f), nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.S, 4).a(dsx.R, jf.d), nt.a().a(nu.c, $$4).a(nu.b, nu.a.c))
               .a(no.a().a(dsx.S, 4).a(dsx.R, jf.e), nt.a().a(nu.c, $$4).a(nu.b, nu.a.d))
         );
   }

   private void a(od.a $$0, dff... $$1) {
      for (dff $$2 : $$1) {
         akk $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(od.a $$0, dff... $$1) {
      for (dff $$2 : $$1) {
         akk $$3 = $$0.create($$2, this.c);
         this.b.accept(nq.a($$2, nt.a().a(nu.c, $$3)).a(c()));
      }
   }

   private void h(dff $$0, dff $$1) {
      this.a($$0);
      ob $$2 = ob.b($$0, $$1);
      akk $$3 = oa.aI.a($$1, $$2, this.c);
      akk $$4 = oa.aJ.a($$1, $$2, this.c);
      akk $$5 = oa.aK.a($$1, $$2, this.c);
      akk $$6 = oa.aG.a($$1, $$2, this.c);
      akk $$7 = oa.aH.a($$1, $$2, this.c);
      ctv $$8 = $$1.r();
      oa.bx.a(ny.a($$8), ob.F($$0), this.c);
      this.b
         .accept(
            np.a($$1)
               .a(nt.a().a(nu.c, $$3))
               .a(no.a().a(dsx.L, true), nt.a().a(nu.c, $$4))
               .a(no.a().a(dsx.M, true), nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.N, true), nt.a().a(nu.c, $$5))
               .a(no.a().a(dsx.O, true), nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.L, false), nt.a().a(nu.c, $$6))
               .a(no.a().a(dsx.M, false), nt.a().a(nu.c, $$7))
               .a(no.a().a(dsx.N, false), nt.a().a(nu.c, $$7).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.O, false), nt.a().a(nu.c, $$6).a(nu.b, nu.a.d))
         );
   }

   private void q(dff $$0) {
      ob $$1 = ob.z($$0);
      akk $$2 = oa.aL.a($$0, $$1, this.c);
      akk $$3 = this.a($$0, "_conditional", oa.aL, $$1x -> $$1.c(oc.i, $$1x));
      this.b.accept(nq.a($$0).a(a(dsx.c, $$3, $$2)).a(e()));
   }

   private void r(dff $$0) {
      akk $$1 = od.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<nt> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> nt.a().a(nu.c, ny.a(dfh.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dfh.mZ);
      this.b
         .accept(
            np.a(dfh.mZ)
               .a(no.a().a(dsx.aq, 0), this.a(0))
               .a(no.a().a(dsx.aq, 1), this.a(1))
               .a(no.a().a(dsx.bk, dst.b), nt.a().a(nu.c, ny.a(dfh.mZ, "_small_leaves")))
               .a(no.a().a(dsx.bk, dst.c), nt.a().a(nu.c, ny.a(dfh.mZ, "_large_leaves")))
         );
   }

   private nr n() {
      return nr.a(dsx.P)
         .a(jf.a, nt.a().a(nu.a, nu.a.c))
         .a(jf.b, nt.a())
         .a(jf.c, nt.a().a(nu.a, nu.a.b))
         .a(jf.d, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.c))
         .a(jf.e, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.d))
         .a(jf.f, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b));
   }

   private void o() {
      akk $$0 = ob.a(dfh.nU, "_top_open");
      this.b
         .accept(
            nq.a(dfh.nU)
               .a(this.n())
               .a(
                  nr.a(dsx.u)
                     .a(false, nt.a().a(nu.c, od.f.create(dfh.nU, this.c)))
                     .a(true, nt.a().a(nu.c, od.f.get(dfh.nU).a($$1 -> $$1.a(oc.f, $$0)).a(dfh.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nr a(dtk<T> $$0, T $$1, akk $$2, akk $$3) {
      nt $$4 = nt.a().a(nu.c, $$2);
      nt $$5 = nt.a().a(nu.c, $$3);
      return nr.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dff $$0, Function<dff, ob> $$1) {
      ob $$2 = $$1.apply($$0).b(oc.i, oc.c);
      ob $$3 = $$2.c(oc.g, ob.a($$0, "_front_honey"));
      akk $$4 = oa.q.a($$0, $$2, this.c);
      akk $$5 = oa.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nq.a($$0).a(b()).a(a(dsx.aN, 5, $$5, $$4)));
   }

   private void a(dff $$0, dtk<Integer> $$1, int... $$2) {
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
      akk $$0 = ny.a(dfh.od, "_floor");
      akk $$1 = ny.a(dfh.od, "_ceiling");
      akk $$2 = ny.a(dfh.od, "_wall");
      akk $$3 = ny.a(dfh.od, "_between_walls");
      this.a(cud.wr);
      this.b
         .accept(
            nq.a(dfh.od)
               .a(
                  nr.a(dsx.R, dsx.V)
                     .a(jf.c, dsv.a, nt.a().a(nu.c, $$0))
                     .a(jf.d, dsv.a, nt.a().a(nu.c, $$0).a(nu.b, nu.a.c))
                     .a(jf.f, dsv.a, nt.a().a(nu.c, $$0).a(nu.b, nu.a.b))
                     .a(jf.e, dsv.a, nt.a().a(nu.c, $$0).a(nu.b, nu.a.d))
                     .a(jf.c, dsv.b, nt.a().a(nu.c, $$1))
                     .a(jf.d, dsv.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
                     .a(jf.f, dsv.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
                     .a(jf.e, dsv.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
                     .a(jf.c, dsv.c, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
                     .a(jf.d, dsv.c, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
                     .a(jf.f, dsv.c, nt.a().a(nu.c, $$2))
                     .a(jf.e, dsv.c, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
                     .a(jf.d, dsv.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
                     .a(jf.c, dsv.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
                     .a(jf.f, dsv.d, nt.a().a(nu.c, $$3))
                     .a(jf.e, dsv.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nq.a(dfh.nZ, nt.a().a(nu.c, ny.a(dfh.nZ)))
               .a(
                  nr.a(dsx.U, dsx.R)
                     .a(dss.a, jf.c, nt.a())
                     .a(dss.a, jf.f, nt.a().a(nu.b, nu.a.b))
                     .a(dss.a, jf.d, nt.a().a(nu.b, nu.a.c))
                     .a(dss.a, jf.e, nt.a().a(nu.b, nu.a.d))
                     .a(dss.b, jf.c, nt.a().a(nu.a, nu.a.b))
                     .a(dss.b, jf.f, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b))
                     .a(dss.b, jf.d, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.c))
                     .a(dss.b, jf.e, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.d))
                     .a(dss.c, jf.d, nt.a().a(nu.a, nu.a.c))
                     .a(dss.c, jf.e, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.b))
                     .a(dss.c, jf.c, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.c))
                     .a(dss.c, jf.f, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.d))
               )
         );
   }

   private void d(dff $$0, od.a $$1) {
      akk $$2 = $$1.create($$0, this.c);
      akk $$3 = ob.a($$0, "_front_on");
      akk $$4 = $$1.get($$0).a($$1x -> $$1x.a(oc.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nq.a($$0).a(a(dsx.r, $$4, $$2)).a(b()));
   }

   private void a(dff... $$0) {
      akk $$1 = ny.a("campfire_off");

      for (dff $$2 : $$0) {
         akk $$3 = oa.bc.a($$2, ob.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nq.a($$2).a(a(dsx.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dff $$0) {
      akk $$1 = oa.bt.a($$0, ob.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dff $$0) {
      akk $$1;
      if ($$0 == dfh.tj) {
         $$1 = oa.bv.a($$0, ob.m($$0), this.c);
      } else {
         $$1 = oa.bu.a($$0, ob.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ob $$0 = ob.a(ob.G(dfh.cl), ob.G(dfh.n));
      akk $$1 = oa.j.a(dfh.cl, $$0, this.c);
      this.b.accept(c(dfh.cl, $$1));
   }

   private void s() {
      this.a(cud.lH);
      this.b
         .accept(
            np.a(dfh.cw)
               .a(
                  no.b(
                     no.a().a(dsx.ab, dtm.c).a(dsx.aa, dtm.c).a(dsx.ac, dtm.c).a(dsx.ad, dtm.c),
                     no.a().a(dsx.ab, dtm.b, dtm.a).a(dsx.aa, dtm.b, dtm.a),
                     no.a().a(dsx.aa, dtm.b, dtm.a).a(dsx.ac, dtm.b, dtm.a),
                     no.a().a(dsx.ac, dtm.b, dtm.a).a(dsx.ad, dtm.b, dtm.a),
                     no.a().a(dsx.ad, dtm.b, dtm.a).a(dsx.ab, dtm.b, dtm.a)
                  ),
                  nt.a().a(nu.c, ny.a("redstone_dust_dot"))
               )
               .a(no.a().a(dsx.ab, dtm.b, dtm.a), nt.a().a(nu.c, ny.a("redstone_dust_side0")))
               .a(no.a().a(dsx.ac, dtm.b, dtm.a), nt.a().a(nu.c, ny.a("redstone_dust_side_alt0")))
               .a(no.a().a(dsx.aa, dtm.b, dtm.a), nt.a().a(nu.c, ny.a("redstone_dust_side_alt1")).a(nu.b, nu.a.d))
               .a(no.a().a(dsx.ad, dtm.b, dtm.a), nt.a().a(nu.c, ny.a("redstone_dust_side1")).a(nu.b, nu.a.d))
               .a(no.a().a(dsx.ab, dtm.a), nt.a().a(nu.c, ny.a("redstone_dust_up")))
               .a(no.a().a(dsx.aa, dtm.a), nt.a().a(nu.c, ny.a("redstone_dust_up")).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.ac, dtm.a), nt.a().a(nu.c, ny.a("redstone_dust_up")).a(nu.b, nu.a.c))
               .a(no.a().a(dsx.ad, dtm.a), nt.a().a(nu.c, ny.a("redstone_dust_up")).a(nu.b, nu.a.d))
         );
   }

   private void t() {
      this.a(cud.lL);
      this.b
         .accept(
            nq.a(dfh.gY)
               .a(c())
               .a(
                  nr.a(dsx.bd, dsx.w)
                     .a(dta.a, false, nt.a().a(nu.c, ny.a(dfh.gY)))
                     .a(dta.a, true, nt.a().a(nu.c, ny.a(dfh.gY, "_on")))
                     .a(dta.b, false, nt.a().a(nu.c, ny.a(dfh.gY, "_subtract")))
                     .a(dta.b, true, nt.a().a(nu.c, ny.a(dfh.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      ob $$0 = ob.a(dfh.jR);
      ob $$1 = ob.a(ob.a(dfh.jE, "_side"), $$0.a(oc.f));
      akk $$2 = oa.ab.a(dfh.jE, $$1, this.c);
      akk $$3 = oa.ac.a(dfh.jE, $$1, this.c);
      akk $$4 = oa.j.b(dfh.jE, "_double", $$1, this.c);
      this.b.accept(e(dfh.jE, $$2, $$3, $$4));
      this.b.accept(c(dfh.jR, oa.c.a(dfh.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cud.sq);
      this.b
         .accept(
            np.a(dfh.fs)
               .a(nt.a().a(nu.c, ob.G(dfh.fs)))
               .a(no.a().a(dsx.k, true), nt.a().a(nu.c, ob.a(dfh.fs, "_bottle0")))
               .a(no.a().a(dsx.l, true), nt.a().a(nu.c, ob.a(dfh.fs, "_bottle1")))
               .a(no.a().a(dsx.m, true), nt.a().a(nu.c, ob.a(dfh.fs, "_bottle2")))
               .a(no.a().a(dsx.k, false), nt.a().a(nu.c, ob.a(dfh.fs, "_empty0")))
               .a(no.a().a(dsx.l, false), nt.a().a(nu.c, ob.a(dfh.fs, "_empty1")))
               .a(no.a().a(dsx.m, false), nt.a().a(nu.c, ob.a(dfh.fs, "_empty2")))
         );
   }

   private void u(dff $$0) {
      akk $$1 = oa.bp.a($$0, ob.b($$0), this.c);
      akk $$2 = ny.a("mushroom_block_inside");
      this.b
         .accept(
            np.a($$0)
               .a(no.a().a(dsx.L, true), nt.a().a(nu.c, $$1))
               .a(no.a().a(dsx.M, true), nt.a().a(nu.c, $$1).a(nu.b, nu.a.b).a(nu.d, true))
               .a(no.a().a(dsx.N, true), nt.a().a(nu.c, $$1).a(nu.b, nu.a.c).a(nu.d, true))
               .a(no.a().a(dsx.O, true), nt.a().a(nu.c, $$1).a(nu.b, nu.a.d).a(nu.d, true))
               .a(no.a().a(dsx.J, true), nt.a().a(nu.c, $$1).a(nu.a, nu.a.d).a(nu.d, true))
               .a(no.a().a(dsx.K, true), nt.a().a(nu.c, $$1).a(nu.a, nu.a.b).a(nu.d, true))
               .a(no.a().a(dsx.L, false), nt.a().a(nu.c, $$2))
               .a(no.a().a(dsx.M, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, false))
               .a(no.a().a(dsx.N, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, false))
               .a(no.a().a(dsx.O, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, false))
               .a(no.a().a(dsx.J, false), nt.a().a(nu.c, $$2).a(nu.a, nu.a.d).a(nu.d, false))
               .a(no.a().a(dsx.K, false), nt.a().a(nu.c, $$2).a(nu.a, nu.a.b).a(nu.d, false))
         );
      this.a($$0, od.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cud.rB);
      this.b
         .accept(
            nq.a(dfh.eg)
               .a(
                  nr.a(dsx.ay)
                     .a(0, nt.a().a(nu.c, ny.a(dfh.eg)))
                     .a(1, nt.a().a(nu.c, ny.a(dfh.eg, "_slice1")))
                     .a(2, nt.a().a(nu.c, ny.a(dfh.eg, "_slice2")))
                     .a(3, nt.a().a(nu.c, ny.a(dfh.eg, "_slice3")))
                     .a(4, nt.a().a(nu.c, ny.a(dfh.eg, "_slice4")))
                     .a(5, nt.a().a(nu.c, ny.a(dfh.eg, "_slice5")))
                     .a(6, nt.a().a(nu.c, ny.a(dfh.eg, "_slice6")))
               )
         );
   }

   private void x() {
      ob $$0 = new ob()
         .a(oc.c, ob.a(dfh.nX, "_side3"))
         .a(oc.o, ob.G(dfh.t))
         .a(oc.n, ob.a(dfh.nX, "_top"))
         .a(oc.j, ob.a(dfh.nX, "_side3"))
         .a(oc.l, ob.a(dfh.nX, "_side3"))
         .a(oc.k, ob.a(dfh.nX, "_side1"))
         .a(oc.m, ob.a(dfh.nX, "_side2"));
      this.b.accept(c(dfh.nX, oa.a.a(dfh.nX, $$0, this.c)));
   }

   private void y() {
      ob $$0 = new ob()
         .a(oc.c, ob.a(dfh.ob, "_front"))
         .a(oc.o, ob.a(dfh.ob, "_bottom"))
         .a(oc.n, ob.a(dfh.ob, "_top"))
         .a(oc.j, ob.a(dfh.ob, "_front"))
         .a(oc.k, ob.a(dfh.ob, "_front"))
         .a(oc.l, ob.a(dfh.ob, "_side"))
         .a(oc.m, ob.a(dfh.ob, "_side"));
      this.b.accept(c(dfh.ob, oa.a.a(dfh.ob, $$0, this.c)));
   }

   private void a(dff $$0, dff $$1, BiFunction<dff, dff, ob> $$2) {
      ob $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oa.a.a($$0, $$3, this.c)));
   }

   public void b(dff $$0) {
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
      ob $$0 = ob.k(dfh.eZ);
      this.b.accept(c(dfh.eZ, ny.a(dfh.eZ)));
      this.a(dfh.ee, $$0);
      this.a(dfh.ef, $$0);
   }

   private void a(dff $$0, ob $$1) {
      akk $$2 = oa.p.a($$0, $$1.c(oc.g, ob.G($$0)), this.c);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cud.sr);
      this.m(dfh.ft);
      this.b.accept(c(dfh.fv, oa.bs.a(dfh.fv, ob.j(ob.a(dfh.H, "_still")), this.c)));
      this.b
         .accept(
            nq.a(dfh.fu)
               .a(
                  nr.a(djo.g)
                     .a(1, nt.a().a(nu.c, oa.bq.a(dfh.fu, "_level1", ob.j(ob.a(dfh.G, "_still")), this.c)))
                     .a(2, nt.a().a(nu.c, oa.br.a(dfh.fu, "_level2", ob.j(ob.a(dfh.G, "_still")), this.c)))
                     .a(3, nt.a().a(nu.c, oa.bs.a(dfh.fu, "_full", ob.j(ob.a(dfh.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nq.a(dfh.fw)
               .a(
                  nr.a(djo.g)
                     .a(1, nt.a().a(nu.c, oa.bq.a(dfh.fw, "_level1", ob.j(ob.G(dfh.qP)), this.c)))
                     .a(2, nt.a().a(nu.c, oa.br.a(dfh.fw, "_level2", ob.j(ob.G(dfh.qP)), this.c)))
                     .a(3, nt.a().a(nu.c, oa.bs.a(dfh.fw, "_full", ob.j(ob.G(dfh.qP)), this.c)))
               )
         );
   }

   private void B() {
      ob $$0 = ob.b(dfh.kv);
      akk $$1 = oa.aE.a(dfh.kv, $$0, this.c);
      akk $$2 = this.a(dfh.kv, "_dead", oa.aE, $$1x -> $$0.c(oc.b, $$1x));
      this.b.accept(nq.a(dfh.kv).a(a(dsx.au, 5, $$2, $$1)));
   }

   private void C() {
      akk $$0 = ny.a(dfh.tq);
      akk $$1 = ny.a(dfh.tq, "_triggered");
      akk $$2 = ny.a(dfh.tq, "_crafting");
      akk $$3 = ny.a(dfh.tq, "_crafting_triggered");
      this.b
         .accept(
            nq.a(dfh.tq)
               .a(nr.a(dsx.T).a($$0x -> this.a($$0x, nt.a())))
               .a(
                  nr.a(dsx.A, dgy.b)
                     .a(false, false, nt.a().a(nu.c, $$0))
                     .a(true, true, nt.a().a(nu.c, $$3))
                     .a(true, false, nt.a().a(nu.c, $$1))
                     .a(false, true, nt.a().a(nu.c, $$2))
               )
         );
   }

   private void v(dff $$0) {
      ob $$1 = new ob().a(oc.f, ob.a(dfh.cD, "_top")).a(oc.i, ob.a(dfh.cD, "_side")).a(oc.g, ob.a($$0, "_front"));
      ob $$2 = new ob().a(oc.i, ob.a(dfh.cD, "_top")).a(oc.g, ob.a($$0, "_front_vertical"));
      akk $$3 = oa.p.a($$0, $$1, this.c);
      akk $$4 = oa.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nq.a($$0)
               .a(
                  nr.a(dsx.P)
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
      akk $$0 = ny.a(dfh.fy);
      akk $$1 = ny.a(dfh.fy, "_filled");
      this.b.accept(nq.a(dfh.fy).a(nr.a(dsx.h).a(false, nt.a().a(nu.c, $$0)).a(true, nt.a().a(nu.c, $$1))).a(c()));
   }

   private void E() {
      akk $$0 = ny.a(dfh.ku, "_side");
      akk $$1 = ny.a(dfh.ku, "_noside");
      akk $$2 = ny.a(dfh.ku, "_noside1");
      akk $$3 = ny.a(dfh.ku, "_noside2");
      akk $$4 = ny.a(dfh.ku, "_noside3");
      this.b
         .accept(
            np.a(dfh.ku)
               .a(no.a().a(dsx.L, true), nt.a().a(nu.c, $$0))
               .a(no.a().a(dsx.M, true), nt.a().a(nu.c, $$0).a(nu.b, nu.a.b).a(nu.d, true))
               .a(no.a().a(dsx.N, true), nt.a().a(nu.c, $$0).a(nu.b, nu.a.c).a(nu.d, true))
               .a(no.a().a(dsx.O, true), nt.a().a(nu.c, $$0).a(nu.b, nu.a.d).a(nu.d, true))
               .a(no.a().a(dsx.J, true), nt.a().a(nu.c, $$0).a(nu.a, nu.a.d).a(nu.d, true))
               .a(no.a().a(dsx.K, true), nt.a().a(nu.c, $$0).a(nu.a, nu.a.b).a(nu.d, true))
               .a(no.a().a(dsx.L, false), nt.a().a(nu.c, $$1).a(nu.e, 2), nt.a().a(nu.c, $$2), nt.a().a(nu.c, $$3), nt.a().a(nu.c, $$4))
               .a(
                  no.a().a(dsx.M, false),
                  nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$4).a(nu.b, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.b, nu.a.b).a(nu.d, true)
               )
               .a(
                  no.a().a(dsx.N, false),
                  nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true),
                  nt.a().a(nu.c, $$4).a(nu.b, nu.a.c).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.b, nu.a.c).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true)
               )
               .a(
                  no.a().a(dsx.O, false),
                  nt.a().a(nu.c, $$4).a(nu.b, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.b, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true)
               )
               .a(
                  no.a().a(dsx.J, false),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.a, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$4).a(nu.a, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.a, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.a, nu.a.d).a(nu.d, true)
               )
               .a(
                  no.a().a(dsx.K, false),
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
            np.a(dfh.pc)
               .a(nt.a().a(nu.c, ob.G(dfh.pc)))
               .a(no.a().a(dsx.aL, 1), nt.a().a(nu.c, ob.a(dfh.pc, "_contents1")))
               .a(no.a().a(dsx.aL, 2), nt.a().a(nu.c, ob.a(dfh.pc, "_contents2")))
               .a(no.a().a(dsx.aL, 3), nt.a().a(nu.c, ob.a(dfh.pc, "_contents3")))
               .a(no.a().a(dsx.aL, 4), nt.a().a(nu.c, ob.a(dfh.pc, "_contents4")))
               .a(no.a().a(dsx.aL, 5), nt.a().a(nu.c, ob.a(dfh.pc, "_contents5")))
               .a(no.a().a(dsx.aL, 6), nt.a().a(nu.c, ob.a(dfh.pc, "_contents6")))
               .a(no.a().a(dsx.aL, 7), nt.a().a(nu.c, ob.a(dfh.pc, "_contents7")))
               .a(no.a().a(dsx.aL, 8), nt.a().a(nu.c, ob.a(dfh.pc, "_contents_ready")))
         );
   }

   private void w(dff $$0) {
      akk $$1 = oa.c.a($$0, ob.a($$0), this.c);
      akk $$2 = this.a($$0, "_powered", oa.c, ob::b);
      akk $$3 = this.a($$0, "_lit", oa.c, ob::b);
      akk $$4 = this.a($$0, "_lit_powered", oa.c, ob::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nn a(dff $$0, akk $$1, akk $$2, akk $$3, akk $$4) {
      return nq.a($$0).a(nr.a(dsx.r, dsx.w).a(($$4x, $$5) -> $$4x ? nt.a().a(nu.c, $$5 ? $$4 : $$2) : nt.a().a(nu.c, $$5 ? $$3 : $$1)));
   }

   private void i(dff $$0, dff $$1) {
      akk $$2 = ny.a($$0);
      akk $$3 = ny.a($$0, "_powered");
      akk $$4 = ny.a($$0, "_lit");
      akk $$5 = ny.a($$0, "_lit_powered");
      this.a($$1, ny.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dff $$0) {
      this.c($$0);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, oa.ao.a($$0, ob.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dfh.qy);
      this.x(dfh.qx);
      this.x(dfh.qw);
      this.x(dfh.qv);
   }

   private void H() {
      this.c(dfh.st);
      nr.b<jf, dte> $$0 = nr.a(dsx.bm, dsx.bn);

      for (dte $$1 : dte.values()) {
         $$0.a(jf.b, $$1, this.a(jf.b, $$1));
      }

      for (dte $$2 : dte.values()) {
         $$0.a(jf.a, $$2, this.a(jf.a, $$2));
      }

      this.b.accept(nq.a(dfh.st).a($$0));
   }

   private nt a(jf $$0, dte $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ob $$3 = ob.c(ob.a(dfh.st, $$2));
      return nt.a().a(nu.c, oa.an.a(dfh.st, $$2, $$3, this.c));
   }

   private void y(dff $$0) {
      ob $$1 = new ob().a(oc.e, ob.G(dfh.dV)).a(oc.f, ob.G($$0)).a(oc.i, ob.a($$0, "_side"));
      this.b.accept(c($$0, oa.n.a($$0, $$1, this.c)));
   }

   private void I() {
      akk $$0 = ob.a(dfh.gZ, "_side");
      ob $$1 = new ob().a(oc.f, ob.a(dfh.gZ, "_top")).a(oc.i, $$0);
      ob $$2 = new ob().a(oc.f, ob.a(dfh.gZ, "_inverted_top")).a(oc.i, $$0);
      this.b
         .accept(
            nq.a(dfh.gZ)
               .a(nr.a(dsx.p).a(false, nt.a().a(nu.c, oa.aF.a(dfh.gZ, $$1, this.c))).a(true, nt.a().a(nu.c, oa.aF.a(ny.a(dfh.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dff $$0) {
      this.b.accept(nq.a($$0, nt.a().a(nu.c, ny.a($$0))).a(this.n()));
   }

   private void J() {
      dff $$0 = dfh.ss;
      akk $$1 = ny.a($$0, "_on");
      akk $$2 = ny.a($$0);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, ny.a($$0))).a(this.n()).a(a(dsx.w, $$1, $$2)));
   }

   private void K() {
      ob $$0 = new ob().a(oc.B, ob.G(dfh.j)).a(oc.f, ob.G(dfh.cC));
      ob $$1 = new ob().a(oc.B, ob.G(dfh.j)).a(oc.f, ob.a(dfh.cC, "_moist"));
      akk $$2 = oa.aW.a(dfh.cC, $$0, this.c);
      akk $$3 = oa.aW.a(ob.a(dfh.cC, "_moist"), $$1, this.c);
      this.b.accept(nq.a(dfh.cC).a(a(dsx.aQ, 7, $$3, $$2)));
   }

   private List<akk> A(dff $$0) {
      akk $$1 = oa.aX.a(ny.a($$0, "_floor0"), ob.v($$0), this.c);
      akk $$2 = oa.aX.a(ny.a($$0, "_floor1"), ob.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akk> B(dff $$0) {
      akk $$1 = oa.aY.a(ny.a($$0, "_side0"), ob.v($$0), this.c);
      akk $$2 = oa.aY.a(ny.a($$0, "_side1"), ob.w($$0), this.c);
      akk $$3 = oa.aZ.a(ny.a($$0, "_side_alt0"), ob.v($$0), this.c);
      akk $$4 = oa.aZ.a(ny.a($$0, "_side_alt1"), ob.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akk> C(dff $$0) {
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
      no $$0 = no.a().a(dsx.L, false).a(dsx.M, false).a(dsx.N, false).a(dsx.O, false).a(dsx.J, false);
      List<akk> $$1 = this.A(dfh.cr);
      List<akk> $$2 = this.B(dfh.cr);
      List<akk> $$3 = this.C(dfh.cr);
      this.b
         .accept(
            np.a(dfh.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(no.b(no.a().a(dsx.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(no.b(no.a().a(dsx.M, true), $$0), a($$2, $$0x -> $$0x.a(nu.b, nu.a.b)))
               .a(no.b(no.a().a(dsx.N, true), $$0), a($$2, $$0x -> $$0x.a(nu.b, nu.a.c)))
               .a(no.b(no.a().a(dsx.O, true), $$0), a($$2, $$0x -> $$0x.a(nu.b, nu.a.d)))
               .a(no.a().a(dsx.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<akk> $$0 = this.A(dfh.cs);
      List<akk> $$1 = this.B(dfh.cs);
      this.b
         .accept(
            np.a(dfh.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nu.b, nu.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nu.b, nu.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nu.b, nu.a.d)))
         );
   }

   private void D(dff $$0) {
      akk $$1 = od.t.create($$0, this.c);
      akk $$2 = od.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nq.a($$0).a(a(dsx.j, $$2, $$1)));
   }

   private void N() {
      ob $$0 = ob.a(ob.a(dfh.ad, "_side"), ob.a(dfh.ad, "_top"));
      akk $$1 = oa.j.a(dfh.ad, $$0, this.c);
      this.b.accept(d(dfh.ad, $$1));
   }

   private void O() {
      this.a(cud.ad);
      dff $$0 = dfh.E;
      nr.b<Boolean, Integer> $$1 = nr.a(dka.d, dka.b);
      akk $$2 = ny.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akk $$4 = ny.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, nt.a().a(nu.c, $$4));
         $$1.a(false, $$3, nt.a().a(nu.c, $$2));
      }

      this.b.accept(nq.a(dfh.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nq.a(dfh.kI)
               .a(
                  nr.a(dsx.as)
                     .a(0, nt.a().a(nu.c, this.a(dfh.kI, "_0", oa.c, ob::b)))
                     .a(1, nt.a().a(nu.c, this.a(dfh.kI, "_1", oa.c, ob::b)))
                     .a(2, nt.a().a(nu.c, this.a(dfh.kI, "_2", oa.c, ob::b)))
                     .a(3, nt.a().a(nu.c, this.a(dfh.kI, "_3", oa.c, ob::b)))
               )
         );
   }

   private void Q() {
      akk $$0 = ob.G(dfh.j);
      ob $$1 = new ob().a(oc.e, $$0).b(oc.e, oc.c).a(oc.f, ob.a(dfh.i, "_top")).a(oc.i, ob.a(dfh.i, "_snow"));
      nt $$2 = nt.a().a(nu.c, oa.n.a(dfh.i, "_snow", $$1, this.c));
      this.a(dfh.i, ny.a(dfh.i), $$2);
      akk $$3 = od.f.get(dfh.fl).a($$1x -> $$1x.a(oc.e, $$0)).a(dfh.fl, this.c);
      this.a(dfh.fl, $$3, $$2);
      akk $$4 = od.f.get(dfh.l).a($$1x -> $$1x.a(oc.e, $$0)).a(dfh.l, this.c);
      this.a(dfh.l, $$4, $$2);
   }

   private void a(dff $$0, akk $$1, nt $$2) {
      List<nt> $$3 = Arrays.asList(a($$1));
      this.b.accept(nq.a($$0).a(nr.a(dsx.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cud.rh);
      this.b
         .accept(
            nq.a(dfh.fC)
               .a(
                  nr.a(dsx.ar)
                     .a(0, nt.a().a(nu.c, ny.a(dfh.fC, "_stage0")))
                     .a(1, nt.a().a(nu.c, ny.a(dfh.fC, "_stage1")))
                     .a(2, nt.a().a(nu.c, ny.a(dfh.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dfh.kE, ny.a(dfh.kE)));
   }

   private void j(dff $$0, dff $$1) {
      ob $$2 = ob.b($$1);
      akk $$3 = oa.Y.a($$0, $$2, this.c);
      akk $$4 = oa.Z.a($$0, $$2, this.c);
      this.b.accept(nq.a($$0).a(a(dsx.aT, 1, $$4, $$3)));
   }

   private void T() {
      akk $$0 = ny.a(dfh.hc);
      akk $$1 = ny.a(dfh.hc, "_side");
      this.a(cud.lR);
      this.b
         .accept(
            nq.a(dfh.hc)
               .a(
                  nr.a(dsx.Q)
                     .a(jf.a, nt.a().a(nu.c, $$0))
                     .a(jf.c, nt.a().a(nu.c, $$1))
                     .a(jf.f, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
                     .a(jf.d, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
                     .a(jf.e, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
               )
         );
   }

   private void k(dff $$0, dff $$1) {
      akk $$2 = ny.a($$0);
      this.b.accept(nq.a($$1, nt.a().a(nu.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      akk $$0 = ny.a(dfh.eW, "_post_ends");
      akk $$1 = ny.a(dfh.eW, "_post");
      akk $$2 = ny.a(dfh.eW, "_cap");
      akk $$3 = ny.a(dfh.eW, "_cap_alt");
      akk $$4 = ny.a(dfh.eW, "_side");
      akk $$5 = ny.a(dfh.eW, "_side_alt");
      this.b
         .accept(
            np.a(dfh.eW)
               .a(nt.a().a(nu.c, $$0))
               .a(no.a().a(dsx.L, false).a(dsx.M, false).a(dsx.N, false).a(dsx.O, false), nt.a().a(nu.c, $$1))
               .a(no.a().a(dsx.L, true).a(dsx.M, false).a(dsx.N, false).a(dsx.O, false), nt.a().a(nu.c, $$2))
               .a(no.a().a(dsx.L, false).a(dsx.M, true).a(dsx.N, false).a(dsx.O, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.L, false).a(dsx.M, false).a(dsx.N, true).a(dsx.O, false), nt.a().a(nu.c, $$3))
               .a(no.a().a(dsx.L, false).a(dsx.M, false).a(dsx.N, false).a(dsx.O, true), nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.L, true), nt.a().a(nu.c, $$4))
               .a(no.a().a(dsx.M, true), nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
               .a(no.a().a(dsx.N, true), nt.a().a(nu.c, $$5))
               .a(no.a().a(dsx.O, true), nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
         );
      this.d(dfh.eW);
   }

   private void E(dff $$0) {
      this.b.accept(nq.a($$0, nt.a().a(nu.c, ny.a($$0))).a(b()));
   }

   private void V() {
      akk $$0 = ny.a(dfh.dw);
      akk $$1 = ny.a(dfh.dw, "_on");
      this.d(dfh.dw);
      this.b
         .accept(
            nq.a(dfh.dw)
               .a(a(dsx.w, $$0, $$1))
               .a(
                  nr.a(dsx.U, dsx.R)
                     .a(dss.c, jf.c, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.c))
                     .a(dss.c, jf.f, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.d))
                     .a(dss.c, jf.d, nt.a().a(nu.a, nu.a.c))
                     .a(dss.c, jf.e, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.b))
                     .a(dss.a, jf.c, nt.a())
                     .a(dss.a, jf.f, nt.a().a(nu.b, nu.a.b))
                     .a(dss.a, jf.d, nt.a().a(nu.b, nu.a.c))
                     .a(dss.a, jf.e, nt.a().a(nu.b, nu.a.d))
                     .a(dss.b, jf.c, nt.a().a(nu.a, nu.a.b))
                     .a(dss.b, jf.f, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b))
                     .a(dss.b, jf.d, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.c))
                     .a(dss.b, jf.e, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.d))
               )
         );
   }

   private void W() {
      this.d(dfh.fm);
      this.b.accept(b(dfh.fm, ny.a(dfh.fm)));
   }

   private void X() {
      this.d(dfh.tn);
      this.b.accept(c(dfh.tn, ny.a(dfh.tn)));
   }

   private void Y() {
      this.b.accept(nq.a(dfh.ed).a(nr.a(dsx.H).a(jf.a.a, nt.a().a(nu.c, ny.a(dfh.ed, "_ns"))).a(jf.a.c, nt.a().a(nu.c, ny.a(dfh.ed, "_ew")))));
   }

   private void Z() {
      akk $$0 = od.a.create(dfh.dV, this.c);
      this.b
         .accept(
            nq.a(
               dfh.dV,
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
      akk $$0 = ny.a(dfh.kO);
      akk $$1 = ny.a(dfh.kO, "_on");
      this.b.accept(nq.a(dfh.kO).a(a(dsx.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      ob $$0 = new ob().a(oc.e, ob.a(dfh.by, "_bottom")).a(oc.i, ob.a(dfh.by, "_side"));
      akk $$1 = ob.a(dfh.by, "_top_sticky");
      akk $$2 = ob.a(dfh.by, "_top");
      ob $$3 = $$0.c(oc.E, $$1);
      ob $$4 = $$0.c(oc.E, $$2);
      akk $$5 = ny.a(dfh.by, "_base");
      this.a(dfh.by, $$5, $$4);
      this.a(dfh.br, $$5, $$3);
      akk $$6 = oa.n.a(dfh.by, "_inventory", $$0.c(oc.f, $$2), this.c);
      akk $$7 = oa.n.a(dfh.br, "_inventory", $$0.c(oc.f, $$1), this.c);
      this.a(dfh.by, $$6);
      this.a(dfh.br, $$7);
   }

   private void a(dff $$0, akk $$1, ob $$2) {
      akk $$3 = oa.bh.a($$0, $$2, this.c);
      this.b.accept(nq.a($$0).a(a(dsx.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      ob $$0 = new ob().a(oc.F, ob.a(dfh.by, "_top")).a(oc.i, ob.a(dfh.by, "_side"));
      ob $$1 = $$0.c(oc.E, ob.a(dfh.by, "_top_sticky"));
      ob $$2 = $$0.c(oc.E, ob.a(dfh.by, "_top"));
      this.b
         .accept(
            nq.a(dfh.bz)
               .a(
                  nr.a(dsx.x, dsx.bg)
                     .a(false, dtj.a, nt.a().a(nu.c, oa.bi.a(dfh.by, "_head", $$2, this.c)))
                     .a(false, dtj.b, nt.a().a(nu.c, oa.bi.a(dfh.by, "_head_sticky", $$1, this.c)))
                     .a(true, dtj.a, nt.a().a(nu.c, oa.bj.a(dfh.by, "_head_short", $$2, this.c)))
                     .a(true, dtj.b, nt.a().a(nu.c, oa.bj.a(dfh.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dff $$0 = dfh.tr;
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
      this.b.accept(nq.a($$0).a(nr.a(dsx.by, dsx.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> nt.a().a(nu.c, $$7x ? $$10 : $$7);
            case b, c, d -> nt.a().a(nu.c, $$7x ? $$11 : $$8);
            case e -> nt.a().a(nu.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dff $$0 = dfh.ts;
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
      this.b.accept(nq.a($$0).a(b()).a(nr.a(doa.b, doa.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> nt.a().a(nu.c, $$9x ? $$13 : $$5);
            case b -> nt.a().a(nu.c, $$9x ? $$14 : $$6);
            case c -> nt.a().a(nu.c, $$9x ? $$15 : $$7);
            case d -> nt.a().a(nu.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      akk $$0 = ny.a(dfh.qQ, "_inactive");
      akk $$1 = ny.a(dfh.qQ, "_active");
      this.a(dfh.qQ, $$0);
      this.b.accept(nq.a(dfh.qQ).a(nr.a(dsx.bo).a($$2 -> nt.a().a(nu.c, $$2 != dto.b && $$2 != dto.c ? $$0 : $$1))));
   }

   private void ag() {
      akk $$0 = ny.a(dfh.qR, "_inactive");
      akk $$1 = ny.a(dfh.qR, "_active");
      this.a(dfh.qR, $$0);
      this.b.accept(nq.a(dfh.qR).a(nr.a(dsx.bo).a($$2 -> nt.a().a(nu.c, $$2 != dto.b && $$2 != dto.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      akk $$0 = oa.bM.a(dfh.qV, ob.a(false), this.c);
      akk $$1 = oa.bM.a(dfh.qV, "_can_summon", ob.a(true), this.c);
      this.a(dfh.qV, $$0);
      this.b.accept(nq.a(dfh.qV).a(a(dsx.G, $$1, $$0)));
   }

   private void ai() {
      akk $$0 = ny.a(dfh.nS, "_stable");
      akk $$1 = ny.a(dfh.nS, "_unstable");
      this.a(dfh.nS, $$0);
      this.b.accept(nq.a(dfh.nS).a(a(dsx.b, $$1, $$0)));
   }

   private void aj() {
      akk $$0 = this.a(dfh.sv, "", oa.ao, ob::c);
      akk $$1 = this.a(dfh.sv, "_lit", oa.ao, ob::c);
      this.b.accept(nq.a(dfh.sv).a(a(dsx.D, $$1, $$0)));
      akk $$2 = this.a(dfh.sw, "", oa.ao, ob::c);
      akk $$3 = this.a(dfh.sw, "_lit", oa.ao, ob::c);
      this.b.accept(nq.a(dfh.sw).a(a(dsx.D, $$3, $$2)));
   }

   private void ak() {
      akk $$0 = od.a.create(dfh.fB, this.c);
      akk $$1 = this.a(dfh.fB, "_on", oa.c, ob::b);
      this.b.accept(nq.a(dfh.fB).a(a(dsx.r, $$1, $$0)));
   }

   private void l(dff $$0, dff $$1) {
      ob $$2 = ob.y($$0);
      this.b.accept(c($$0, oa.bf.a($$0, $$2, this.c)));
      this.b.accept(nq.a($$1, nt.a().a(nu.c, oa.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      ob $$0 = ob.y(dfh.dK);
      ob $$1 = ob.i(ob.a(dfh.dK, "_off"));
      akk $$2 = oa.bf.a(dfh.dK, $$0, this.c);
      akk $$3 = oa.bf.a(dfh.dK, "_off", $$1, this.c);
      this.b.accept(nq.a(dfh.dK).a(a(dsx.r, $$2, $$3)));
      akk $$4 = oa.bg.a(dfh.dL, $$0, this.c);
      akk $$5 = oa.bg.a(dfh.dL, "_off", $$1, this.c);
      this.b.accept(nq.a(dfh.dL).a(a(dsx.r, $$4, $$5)).a(d()));
      this.d(dfh.dK);
      this.c(dfh.dL);
   }

   private void am() {
      this.a(cud.lK);
      this.b.accept(nq.a(dfh.eh).a(nr.a(dsx.aA, dsx.s, dsx.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return nt.a().a(nu.c, ob.a(dfh.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cud.cT);
      this.b
         .accept(
            nq.a(dfh.mV)
               .a(
                  nr.a(dsx.aS, dsx.C)
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
      ob $$0 = ob.a(dfh.dN);
      akk $$1 = oa.c.a(dfh.dP, $$0, this.c);
      this.b.accept(nq.a(dfh.dN).a(nr.a(dsx.aF).a($$1x -> nt.a().a(nu.c, $$1x < 8 ? ny.a(dfh.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dfh.dN, ny.a(dfh.dN, "_height2"));
      this.b.accept(c(dfh.dP, $$1));
   }

   private void ap() {
      this.b.accept(nq.a(dfh.oc, nt.a().a(nu.c, ny.a(dfh.oc))).a(b()));
   }

   private void aq() {
      akk $$0 = od.a.create(dfh.pa, this.c);
      this.a(dfh.pa, $$0);
      this.b.accept(nq.a(dfh.pa).a(nr.a(dsx.bj).a($$0x -> nt.a().a(nu.c, this.a(dfh.pa, "_" + $$0x.c(), oa.c, ob::b)))));
   }

   private void ar() {
      this.a(cud.wu);
      this.b.accept(nq.a(dfh.oi).a(nr.a(dsx.as).a($$0 -> nt.a().a(nu.c, this.a(dfh.oi, "_stage" + $$0, oa.ao, ob::c)))));
   }

   private void as() {
      this.a(cud.ps);
      this.b
         .accept(
            nq.a(dfh.fI)
               .a(
                  nr.a(dsx.a, dsx.M, dsx.L, dsx.N, dsx.O)
                     .a(false, false, false, false, false, nt.a().a(nu.c, ny.a(dfh.fI, "_ns")))
                     .a(false, true, false, false, false, nt.a().a(nu.c, ny.a(dfh.fI, "_n")).a(nu.b, nu.a.b))
                     .a(false, false, true, false, false, nt.a().a(nu.c, ny.a(dfh.fI, "_n")))
                     .a(false, false, false, true, false, nt.a().a(nu.c, ny.a(dfh.fI, "_n")).a(nu.b, nu.a.c))
                     .a(false, false, false, false, true, nt.a().a(nu.c, ny.a(dfh.fI, "_n")).a(nu.b, nu.a.d))
                     .a(false, true, true, false, false, nt.a().a(nu.c, ny.a(dfh.fI, "_ne")))
                     .a(false, true, false, true, false, nt.a().a(nu.c, ny.a(dfh.fI, "_ne")).a(nu.b, nu.a.b))
                     .a(false, false, false, true, true, nt.a().a(nu.c, ny.a(dfh.fI, "_ne")).a(nu.b, nu.a.c))
                     .a(false, false, true, false, true, nt.a().a(nu.c, ny.a(dfh.fI, "_ne")).a(nu.b, nu.a.d))
                     .a(false, false, true, true, false, nt.a().a(nu.c, ny.a(dfh.fI, "_ns")))
                     .a(false, true, false, false, true, nt.a().a(nu.c, ny.a(dfh.fI, "_ns")).a(nu.b, nu.a.b))
                     .a(false, true, true, true, false, nt.a().a(nu.c, ny.a(dfh.fI, "_nse")))
                     .a(false, true, false, true, true, nt.a().a(nu.c, ny.a(dfh.fI, "_nse")).a(nu.b, nu.a.b))
                     .a(false, false, true, true, true, nt.a().a(nu.c, ny.a(dfh.fI, "_nse")).a(nu.b, nu.a.c))
                     .a(false, true, true, false, true, nt.a().a(nu.c, ny.a(dfh.fI, "_nse")).a(nu.b, nu.a.d))
                     .a(false, true, true, true, true, nt.a().a(nu.c, ny.a(dfh.fI, "_nsew")))
                     .a(true, false, false, false, false, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_ns")))
                     .a(true, false, true, false, false, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_n")))
                     .a(true, false, false, true, false, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_n")).a(nu.b, nu.a.c))
                     .a(true, true, false, false, false, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_n")).a(nu.b, nu.a.b))
                     .a(true, false, false, false, true, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_n")).a(nu.b, nu.a.d))
                     .a(true, true, true, false, false, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_ne")))
                     .a(true, true, false, true, false, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_ne")).a(nu.b, nu.a.b))
                     .a(true, false, false, true, true, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_ne")).a(nu.b, nu.a.c))
                     .a(true, false, true, false, true, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_ne")).a(nu.b, nu.a.d))
                     .a(true, false, true, true, false, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_ns")))
                     .a(true, true, false, false, true, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_ns")).a(nu.b, nu.a.b))
                     .a(true, true, true, true, false, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_nse")))
                     .a(true, true, false, true, true, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_nse")).a(nu.b, nu.a.b))
                     .a(true, false, true, true, true, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_nse")).a(nu.b, nu.a.c))
                     .a(true, true, true, false, true, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_nse")).a(nu.b, nu.a.d))
                     .a(true, true, true, true, true, nt.a().a(nu.c, ny.a(dfh.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dfh.fH);
      this.b.accept(nq.a(dfh.fH).a(nr.a(dsx.a, dsx.w).a(($$0, $$1) -> nt.a().a(nu.c, ob.a(dfh.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
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
            return this.a($$0.intValue(), "", ob.b(ob.G(dfh.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ob.b(ob.a(dfh.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ob.b(ob.a(dfh.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cud.kp);
      this.b.accept(nq.a(dfh.mf).a(nr.a(dsx.aD, dsx.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cud.kq);
      Function<Integer, akk> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ob $$2 = ob.a($$1);
         return oa.bw.a(dfh.mg, $$1, $$2, this.c);
      };
      this.b.accept(nq.a(dfh.mg).a(nr.a(dmn.c).a($$1 -> nt.a().a(nu.c, $$0.apply($$1)))));
   }

   private void F(dff $$0) {
      this.d($$0);
      akk $$1 = ny.a($$0);
      np $$2 = np.a($$0);
      no.c $$3 = ac.a(no.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dsy, Function<akk, nt>> $$4 : a) {
         dsy $$5 = (dsy)$$4.getFirst();
         Function<akk, nt> $$6 = (Function<akk, nt>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(no.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      akk $$0 = ob.a(dfh.qU, "_bottom");
      ob $$1 = new ob().a(oc.e, $$0).a(oc.f, ob.a(dfh.qU, "_top")).a(oc.i, ob.a(dfh.qU, "_side"));
      ob $$2 = new ob().a(oc.e, $$0).a(oc.f, ob.a(dfh.qU, "_top_bloom")).a(oc.i, ob.a(dfh.qU, "_side_bloom"));
      akk $$3 = oa.n.a(dfh.qU, "", $$1, this.c);
      akk $$4 = oa.n.a(dfh.qU, "_bloom", $$2, this.c);
      this.b.accept(nq.a(dfh.qU).a(nr.a(dsx.E).a($$2x -> nt.a().a(nu.c, $$2x ? $$4 : $$3))));
      this.a(cud.gj, $$3);
   }

   private void ax() {
      dff $$0 = dfh.cm;
      akk $$1 = ny.a($$0);
      np $$2 = np.a($$0);
      List.of(Pair.of(jf.c, nu.a.a), Pair.of(jf.f, nu.a.b), Pair.of(jf.d, nu.a.c), Pair.of(jf.e, nu.a.d)).forEach($$2x -> {
         jf $$3 = (jf)$$2x.getFirst();
         nu.a $$4 = (nu.a)$$2x.getSecond();
         no.c $$5 = no.a().a(dsx.R, $$3);
         $$2.a($$5, nt.a().a(nu.c, $$1).a(nu.b, $$4).a(nu.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, ny.a($$0, "_inventory"));
      i.clear();
   }

   private void a(np $$0, no.c $$1, nu.a $$2) {
      List.of(Pair.of(dsx.bp, oa.aM), Pair.of(dsx.bq, oa.aN), Pair.of(dsx.br, oa.aO), Pair.of(dsx.bs, oa.aP), Pair.of(dsx.bt, oa.aQ), Pair.of(dsx.bu, oa.aR))
         .forEach($$3 -> {
            dsy $$4 = (dsy)$$3.getFirst();
            nz $$5 = (nz)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(np $$0, no.c $$1, nu.a $$2, dsy $$3, nz $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ob $$7 = new ob().a(oc.b, ob.a(dfh.cm, $$6));
      nk.d $$8 = new nk.d($$4, $$6);
      akk $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dfh.cm, $$6, $$7, this.c));
      $$0.a(no.a($$1, no.a().a($$3, $$5)), nt.a().a(nu.c, $$9).a(nu.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dfh.kJ, oa.c.a(dfh.kJ, ob.b(ny.a("magma")), this.c)));
   }

   private void G(dff $$0) {
      this.b($$0, od.q);
      oa.bD.a(ny.a($$0.r()), ob.u($$0), this.c);
   }

   private void b(dff $$0, dff $$1, nk.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dff $$0, dff $$1) {
      oa.bE.a(ny.a($$0.r()), ob.u($$1), this.c);
   }

   private void az() {
      akk $$0 = ny.a(dfh.b);
      akk $$1 = ny.a(dfh.b, "_mirrored");
      this.b.accept(a(dfh.eN, $$0, $$1));
      this.a(dfh.eN, $$0);
   }

   private void aA() {
      akk $$0 = ny.a(dfh.sJ);
      akk $$1 = ny.a(dfh.sJ, "_mirrored");
      this.b.accept(a(dfh.td, $$0, $$1).a(f()));
      this.a(dfh.td, $$0);
   }

   private void n(dff $$0, dff $$1) {
      this.a($$0, nk.e.b);
      ob $$2 = ob.d(ob.a($$0, "_pot"));
      akk $$3 = nk.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      akk $$0 = ob.a(dfh.pl, "_bottom");
      akk $$1 = ob.a(dfh.pl, "_top_off");
      akk $$2 = ob.a(dfh.pl, "_top");
      akk[] $$3 = new akk[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ob $$5 = new ob().a(oc.e, $$0).a(oc.f, $$4 == 0 ? $$1 : $$2).a(oc.i, ob.a(dfh.pl, "_side" + $$4));
         $$3[$$4] = oa.n.a(dfh.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nq.a(dfh.pl).a(nr.a(dsx.aZ).a($$1x -> nt.a().a(nu.c, $$3[$$1x]))));
      this.a(cud.wS, $$3[0]);
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
      akk $$0 = ob.a(dfh.pb, "_top");
      akk $$1 = ob.a(dfh.pb, "_bottom");
      akk $$2 = ob.a(dfh.pb, "_side");
      akk $$3 = ob.a(dfh.pb, "_lock");
      ob $$4 = new ob().a(oc.o, $$2).a(oc.m, $$2).a(oc.l, $$2).a(oc.c, $$0).a(oc.j, $$0).a(oc.k, $$1).a(oc.n, $$3);
      akk $$5 = oa.b.a(dfh.pb, $$4, this.c);
      this.b.accept(nq.a(dfh.pb, nt.a().a(nu.c, $$5)).a(nr.a(dsx.T).a($$0x -> this.a($$0x, nt.a()))));
   }

   private void aD() {
      dff $$0 = dfh.n;
      akk $$1 = ny.a($$0);
      od $$2 = od.a.get($$0);
      dff $$3 = dfh.jH;
      akk $$4 = oa.ab.a($$3, $$2.b(), this.c);
      akk $$5 = oa.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lt.a().filter(lu::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dfh.rf).a(lt.w).a(dfh.rf, dfh.rD).a(dfh.rj, dfh.rn).a(lt.y);
      this.h(dfh.re).a(lt.A).a(dfh.re, dfh.rC).a(dfh.ri, dfh.rm).a(lt.C);
      this.h(dfh.rd).a(lt.E).a(dfh.rd, dfh.rB).a(dfh.rh, dfh.rl).a(lt.G);
      this.h(dfh.rc).a(lt.I).a(dfh.rc, dfh.rA).a(dfh.rg, dfh.rk).a(lt.K);
      this.w(dfh.sk);
      this.w(dfh.sl);
      this.w(dfh.sm);
      this.w(dfh.sn);
      this.i(dfh.sk, dfh.so);
      this.i(dfh.sl, dfh.sp);
      this.i(dfh.sm, dfh.sq);
      this.i(dfh.sn, dfh.sr);
      this.m(dfh.a);
      this.c(dfh.nc, dfh.a);
      this.c(dfh.nb, dfh.a);
      this.m(dfh.fO);
      this.m(dfh.dQ);
      this.c(dfh.nd, dfh.G);
      this.m(dfh.fA);
      this.m(dfh.me);
      this.m(dfh.fr);
      this.m(dfh.fR);
      this.a(cud.ue);
      this.m(dfh.pg);
      this.m(dfh.G);
      this.m(dfh.H);
      this.m(dfh.hV);
      this.a(cud.fS);
      this.o(dfh.pM, dfh.qd);
      this.o(dfh.pN, dfh.qe);
      this.o(dfh.pO, dfh.qf);
      this.o(dfh.pP, dfh.qg);
      this.o(dfh.pQ, dfh.qh);
      this.o(dfh.pR, dfh.qi);
      this.o(dfh.pS, dfh.qj);
      this.o(dfh.pT, dfh.qk);
      this.o(dfh.pU, dfh.ql);
      this.o(dfh.pV, dfh.qm);
      this.o(dfh.pW, dfh.qn);
      this.o(dfh.pX, dfh.qo);
      this.o(dfh.pY, dfh.qp);
      this.o(dfh.pZ, dfh.qq);
      this.o(dfh.qa, dfh.qr);
      this.o(dfh.qb, dfh.qs);
      this.o(dfh.pL, dfh.qc);
      this.m(dfh.na);
      this.m(dfh.gs);
      this.m(dfh.qP);
      this.m(dfh.sx);
      this.s(dfh.sy);
      this.s(dfh.sz);
      this.t(dfh.ti);
      this.t(dfh.tj);
      this.aj();
      this.g(dfh.sC, dfh.sA);
      this.p(dfh.sB);
      this.a(dfh.hW, cud.hB);
      this.a(cud.hB);
      this.aE();
      this.a(dfh.kN, cud.jb);
      this.a(cud.jb);
      this.f(dfh.bQ, ob.a(dfh.by, "_side"));
      this.a(dfh.R);
      this.a(dfh.S);
      this.a(dfh.iB);
      this.a(dfh.cx);
      this.a(dfh.cy);
      this.a(dfh.cz);
      this.a(dfh.fE);
      this.a(dfh.fF);
      this.a(dfh.fJ);
      this.a(dfh.N);
      this.a(dfh.T);
      this.a(dfh.O);
      this.a(dfh.ch);
      this.a(dfh.P);
      this.a(dfh.Q);
      this.a(dfh.ci);
      this.b(dfh.pj, od.d);
      this.a(dfh.pi);
      this.a(dfh.aR);
      this.a(dfh.aS);
      this.a(dfh.aT);
      this.a(dfh.hb);
      this.a(dfh.dI);
      this.a(dfh.dJ);
      this.a(dfh.ha);
      this.a(dfh.pC);
      this.a(dfh.mW);
      this.a(dfh.dR);
      this.a(dfh.k);
      this.a(dfh.pk);
      this.a(dfh.fz);
      this.a(dfh.ec);
      this.a(dfh.L);
      this.a(dfh.ph);
      this.a(dfh.dO);
      this.b(dfh.dT, od.g);
      this.b(dfh.pq, od.d);
      this.b(dfh.fa, od.d);
      this.m(dfh.ac);
      this.m(dfh.ga);
      this.a(dfh.kK);
      this.a(dfh.aY);
      this.a(dfh.iC);
      this.a(dfh.co);
      this.a(dfh.pK);
      this.a(dfh.ii);
      this.a(dfh.oy);
      this.a(dfh.dW);
      this.a(dfh.dX);
      this.b(dfh.ct, od.b);
      this.a(dfh.aO);
      this.b(dfh.bw, od.v);
      this.a(cud.cS);
      this.b(dfh.ck, od.f);
      this.b(dfh.pd, od.d);
      this.a(dfh.op);
      this.a(dfh.aP);
      this.a(dfh.qt);
      this.a(dfh.qu);
      this.a(dfh.qN);
      this.a(dfh.su);
      this.a(dfh.tf);
      this.a(dfh.tg);
      this.a(dfh.th);
      this.e(dfh.qS);
      this.m(dfh.tt);
      this.aD();
      this.a(dfh.ra);
      this.a(dfh.rb);
      this.a(dfh.qW);
      this.a(dfh.qX);
      this.a(dfh.qY);
      this.a(dfh.qZ);
      this.k(dfh.qW, dfh.rw);
      this.k(dfh.qX, dfh.ry);
      this.k(dfh.qY, dfh.rx);
      this.k(dfh.qZ, dfh.rz);
      this.i(dfh.rM);
      this.i(dfh.rN);
      this.i(dfh.rP);
      this.i(dfh.rO);
      this.a(dfh.rM, dfh.rQ);
      this.a(dfh.rN, dfh.rR);
      this.a(dfh.rP, dfh.rT);
      this.a(dfh.rO, dfh.rS);
      this.k(dfh.rU);
      this.k(dfh.rV);
      this.k(dfh.rX);
      this.k(dfh.rW);
      this.b(dfh.rU, dfh.rY);
      this.b(dfh.rV, dfh.rZ);
      this.b(dfh.rX, dfh.sb);
      this.b(dfh.rW, dfh.sa);
      this.a(dfh.sc);
      this.a(dfh.sd);
      this.a(dfh.se);
      this.a(dfh.sf);
      this.k(dfh.sc, dfh.sg);
      this.k(dfh.sd, dfh.sh);
      this.k(dfh.se, dfh.si);
      this.k(dfh.sf, dfh.sj);
      this.j(dfh.gW, dfh.ch);
      this.j(dfh.gX, dfh.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dfh.og, dfh.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dfh.kt);
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
      this.F(dfh.ff);
      this.F(dfh.fg);
      this.F(dfh.qT);
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
      this.E(dfh.cO);
      this.d(dfh.cO);
      this.E(dfh.oa);
      this.g();
      this.E(dfh.sE);
      this.l(dfh.cp, dfh.cq);
      this.l(dfh.ea, dfh.eb);
      this.a(dfh.cA, dfh.n, ob::c);
      this.a(dfh.nY, dfh.p, ob::d);
      this.y(dfh.ow);
      this.y(dfh.on);
      this.v(dfh.aU);
      this.v(dfh.hi);
      this.C();
      this.D(dfh.oe);
      this.D(dfh.of);
      this.e(dfh.eX, ny.a(dfh.eX));
      this.a(dfh.dY, od.d);
      this.a(dfh.dZ, od.d);
      this.a(dfh.te);
      this.a(dfh.kM, od.d);
      this.f(dfh.j);
      this.f(dfh.sH);
      this.f(dfh.I);
      this.g(dfh.J);
      this.g(dfh.M);
      this.f(dfh.K);
      this.e(dfh.F);
      this.b(dfh.to, od.f);
      this.a(dfh.ij, od.d, od.e);
      this.a(dfh.kx, od.w, od.x);
      this.a(dfh.hf, od.w, od.x);
      this.a(dfh.tk, od.d, od.e);
      this.a(dfh.tl, od.d, od.e);
      this.a(dfh.tm, od.d, od.e);
      this.c(dfh.nT, od.i);
      this.z();
      this.a(dfh.pe, ob::A);
      this.a(dfh.pf, ob::C);
      this.a(dfh.kD, dsx.as, 0, 1, 2, 3);
      this.a(dfh.gt, dsx.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfh.fq, dsx.as, 0, 1, 1, 2);
      this.a(dfh.gu, dsx.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfh.cB, dsx.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dfh.kA, nk.e.b, dsx.aq, 0, 1);
      this.i();
      this.h();
      this.a(ny.a("decorated_pot"), dfh.iA).b(dfh.tp);
      this.a(ny.a("banner"), dfh.n)
         .a(oa.bF, dfh.iJ, dfh.iK, dfh.iL, dfh.iM, dfh.iN, dfh.iO, dfh.iP, dfh.iQ, dfh.iR, dfh.iS, dfh.iT, dfh.iU, dfh.iV, dfh.iW, dfh.iX, dfh.iY)
         .b(dfh.iZ, dfh.ja, dfh.jb, dfh.jc, dfh.jd, dfh.je, dfh.jf, dfh.jg, dfh.jh, dfh.ji, dfh.jj, dfh.jk, dfh.jl, dfh.jm, dfh.jn, dfh.jo);
      this.a(ny.a("bed"), dfh.n)
         .b(dfh.aZ, dfh.ba, dfh.bb, dfh.bc, dfh.bd, dfh.be, dfh.bf, dfh.bg, dfh.bh, dfh.bi, dfh.bj, dfh.bk, dfh.bl, dfh.bm, dfh.bn, dfh.bo);
      this.m(dfh.aZ, dfh.bA);
      this.m(dfh.ba, dfh.bB);
      this.m(dfh.bb, dfh.bC);
      this.m(dfh.bc, dfh.bD);
      this.m(dfh.bd, dfh.bE);
      this.m(dfh.be, dfh.bF);
      this.m(dfh.bf, dfh.bG);
      this.m(dfh.bg, dfh.bH);
      this.m(dfh.bh, dfh.bI);
      this.m(dfh.bi, dfh.bJ);
      this.m(dfh.bj, dfh.bK);
      this.m(dfh.bk, dfh.bL);
      this.m(dfh.bl, dfh.bM);
      this.m(dfh.bm, dfh.bN);
      this.m(dfh.bn, dfh.bO);
      this.m(dfh.bo, dfh.bP);
      this.a(ny.a("skull"), dfh.dW)
         .a(oa.bG, dfh.gM, dfh.gK, dfh.gI, dfh.gE, dfh.gG, dfh.gQ)
         .a(dfh.gO)
         .b(dfh.gN, dfh.gP, dfh.gL, dfh.gJ, dfh.gF, dfh.gH, dfh.gR);
      this.G(dfh.kP);
      this.G(dfh.kQ);
      this.G(dfh.kR);
      this.G(dfh.kS);
      this.G(dfh.kT);
      this.G(dfh.kU);
      this.G(dfh.kV);
      this.G(dfh.kW);
      this.G(dfh.kX);
      this.G(dfh.kY);
      this.G(dfh.kZ);
      this.G(dfh.la);
      this.G(dfh.lb);
      this.G(dfh.lc);
      this.G(dfh.ld);
      this.G(dfh.le);
      this.G(dfh.lf);
      this.b(dfh.mX, od.q);
      this.c(dfh.mX);
      this.a(ny.a("chest"), dfh.n).b(dfh.cv, dfh.gV);
      this.a(ny.a("ender_chest"), dfh.co).b(dfh.fG);
      this.f(dfh.fx, dfh.co).a(dfh.fx, dfh.kF);
      this.a(dfh.aM);
      this.a(dfh.aN);
      this.a(dfh.lw);
      this.a(dfh.lx);
      this.a(dfh.ly);
      this.a(dfh.lz);
      this.a(dfh.lA);
      this.a(dfh.lB);
      this.a(dfh.lC);
      this.a(dfh.lD);
      this.a(dfh.lE);
      this.a(dfh.lF);
      this.a(dfh.lG);
      this.a(dfh.lH);
      this.a(dfh.lI);
      this.a(dfh.lJ);
      this.a(dfh.lK);
      this.a(dfh.lL);
      this.a(od.a, dfh.lM, dfh.lN, dfh.lO, dfh.lP, dfh.lQ, dfh.lR, dfh.lS, dfh.lT, dfh.lU, dfh.lV, dfh.lW, dfh.lX, dfh.lY, dfh.lZ, dfh.ma, dfh.mb);
      this.a(dfh.iA);
      this.a(dfh.hj);
      this.a(dfh.hk);
      this.a(dfh.hl);
      this.a(dfh.hm);
      this.a(dfh.hn);
      this.a(dfh.ho);
      this.a(dfh.hp);
      this.a(dfh.hq);
      this.a(dfh.hr);
      this.a(dfh.hs);
      this.a(dfh.ht);
      this.a(dfh.hu);
      this.a(dfh.hv);
      this.a(dfh.hw);
      this.a(dfh.hx);
      this.a(dfh.hy);
      this.a(dfh.qO);
      this.h(dfh.aQ, dfh.eY);
      this.h(dfh.ei, dfh.hz);
      this.h(dfh.ej, dfh.hA);
      this.h(dfh.ek, dfh.hB);
      this.h(dfh.el, dfh.hC);
      this.h(dfh.em, dfh.hD);
      this.h(dfh.en, dfh.hE);
      this.h(dfh.eo, dfh.hF);
      this.h(dfh.ep, dfh.hG);
      this.h(dfh.eq, dfh.hH);
      this.h(dfh.er, dfh.hI);
      this.h(dfh.es, dfh.hJ);
      this.h(dfh.et, dfh.hK);
      this.h(dfh.eu, dfh.hL);
      this.h(dfh.ev, dfh.hM);
      this.h(dfh.ew, dfh.hN);
      this.h(dfh.ex, dfh.hO);
      this.b(od.o, dfh.lg, dfh.lh, dfh.li, dfh.lj, dfh.lk, dfh.ll, dfh.lm, dfh.ln, dfh.lo, dfh.lp, dfh.lq, dfh.lr, dfh.ls, dfh.lt, dfh.lu, dfh.lv);
      this.g(dfh.bA, dfh.ik);
      this.g(dfh.bB, dfh.il);
      this.g(dfh.bC, dfh.im);
      this.g(dfh.bD, dfh.in);
      this.g(dfh.bE, dfh.io);
      this.g(dfh.bF, dfh.ip);
      this.g(dfh.bG, dfh.iq);
      this.g(dfh.bH, dfh.ir);
      this.g(dfh.bI, dfh.is);
      this.g(dfh.bJ, dfh.it);
      this.g(dfh.bK, dfh.iu);
      this.g(dfh.bL, dfh.iv);
      this.g(dfh.bM, dfh.iw);
      this.g(dfh.bN, dfh.ix);
      this.g(dfh.bO, dfh.iy);
      this.g(dfh.bP, dfh.iz);
      this.a(dfh.sI);
      this.a(dfh.eL);
      this.a(dfh.bu, dfh.gb, nk.e.a);
      this.a(dfh.bR, dfh.gc, nk.e.b);
      this.a(dfh.bT, dfh.gd, nk.e.b);
      this.a(dfh.bU, dfh.ge, nk.e.b);
      this.a(dfh.bV, dfh.gf, nk.e.b);
      this.a(dfh.bW, dfh.gg, nk.e.b);
      this.a(dfh.bX, dfh.gh, nk.e.b);
      this.a(dfh.bY, dfh.gi, nk.e.b);
      this.a(dfh.bZ, dfh.gj, nk.e.b);
      this.a(dfh.ca, dfh.gk, nk.e.b);
      this.a(dfh.cb, dfh.gl, nk.e.b);
      this.a(dfh.cc, dfh.gm, nk.e.b);
      this.a(dfh.ce, dfh.gn, nk.e.b);
      this.a(dfh.cd, dfh.go, nk.e.b);
      this.a(dfh.cg, dfh.gp, nk.e.b);
      this.a(dfh.cf, dfh.gq, nk.e.b);
      this.a(dfh.bv, dfh.gr, nk.e.b);
      this.a(dfh.bS, dfh.fS, nk.e.b);
      this.H();
      this.u(dfh.eT);
      this.u(dfh.eU);
      this.u(dfh.eV);
      this.a(dfh.bt, nk.e.a);
      this.b(dfh.dS, nk.e.a);
      this.a(cud.dJ);
      this.b(dfh.mc, dfh.md, nk.e.b);
      this.a(cud.dK);
      this.c(dfh.md);
      this.b(dfh.sG, nk.e.b);
      this.c(dfh.sG);
      this.c(dfh.sw);
      this.b(dfh.oz, dfh.oA, nk.e.b);
      this.b(dfh.oB, dfh.oC, nk.e.b);
      this.a(dfh.oz, "_plant");
      this.c(dfh.oA);
      this.a(dfh.oB, "_plant");
      this.c(dfh.oC);
      this.a(dfh.mY, nk.e.a, ob.c(ob.a(dfh.mZ, "_stage0")));
      this.m();
      this.a(dfh.bs, nk.e.b);
      this.c(dfh.iE, nk.e.b);
      this.c(dfh.iF, nk.e.b);
      this.c(dfh.iG, nk.e.b);
      this.c(dfh.iH, nk.e.a);
      this.c(dfh.iI, nk.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dfh.mw, dfh.mr, dfh.mm, dfh.mh, dfh.mG, dfh.mB, dfh.mQ, dfh.mL);
      this.a(dfh.mx, dfh.ms, dfh.mn, dfh.mi, dfh.mH, dfh.mC, dfh.mR, dfh.mM);
      this.a(dfh.my, dfh.mt, dfh.mo, dfh.mj, dfh.mI, dfh.mD, dfh.mS, dfh.mN);
      this.a(dfh.mz, dfh.mu, dfh.mp, dfh.mk, dfh.mJ, dfh.mE, dfh.mT, dfh.mO);
      this.a(dfh.mA, dfh.mv, dfh.mq, dfh.ml, dfh.mK, dfh.mF, dfh.mU, dfh.mP);
      this.e(dfh.fe, dfh.fc);
      this.e(dfh.fd, dfh.fb);
      this.l(dfh.ab).c(dfh.ab).a(dfh.av);
      this.l(dfh.am).c(dfh.am).a(dfh.aD);
      this.a(dfh.am, dfh.dj, dfh.ds);
      this.b(dfh.aL, od.s);
      this.l(dfh.Y).c(dfh.Y).a(dfh.as);
      this.l(dfh.ai).c(dfh.ai).a(dfh.aA);
      this.a(dfh.ai, dfh.dd, dfh.do);
      this.a(dfh.B, dfh.fX, nk.e.b);
      this.b(dfh.aI, od.s);
      this.l(dfh.Z).d(dfh.Z).a(dfh.at);
      this.l(dfh.aj).d(dfh.aj).a(dfh.aB);
      this.a(dfh.aj, dfh.de, dfh.dp);
      this.a(dfh.C, dfh.fY, nk.e.b);
      this.b(dfh.aJ, od.s);
      this.l(dfh.W).c(dfh.W).a(dfh.aq);
      this.l(dfh.ag).c(dfh.ag).a(dfh.ay);
      this.a(dfh.ag, dfh.dc, dfh.dn);
      this.a(dfh.z, dfh.fV, nk.e.b);
      this.b(dfh.aG, od.s);
      this.l(dfh.U).c(dfh.U).a(dfh.ao);
      this.l(dfh.al).c(dfh.al).a(dfh.aw);
      this.a(dfh.al, dfh.da, dfh.dl);
      this.a(dfh.x, dfh.fT, nk.e.b);
      this.b(dfh.aE, od.s);
      this.l(dfh.V).c(dfh.V).a(dfh.ap);
      this.l(dfh.af).c(dfh.af).a(dfh.ax);
      this.a(dfh.af, dfh.db, dfh.dm);
      this.a(dfh.y, dfh.fU, nk.e.b);
      this.b(dfh.aF, od.s);
      this.l(dfh.aa).c(dfh.aa).a(dfh.au);
      this.l(dfh.ak).c(dfh.ak).a(dfh.aC);
      this.a(dfh.ak, dfh.dg, dfh.dr);
      this.a(dfh.D, dfh.fZ, nk.e.b);
      this.b(dfh.aK, od.s);
      this.l(dfh.X).c(dfh.X).a(dfh.ar);
      this.l(dfh.ah).c(dfh.ah).a(dfh.az);
      this.a(dfh.ah, dfh.df, dfh.dq);
      this.a(dfh.A, dfh.fW, nk.e.b);
      this.b(dfh.aH, od.s);
      this.l(dfh.os).b(dfh.os).a(dfh.ou);
      this.l(dfh.ot).b(dfh.ot).a(dfh.ov);
      this.a(dfh.ot, dfh.dh, dfh.dt);
      this.a(dfh.ox, dfh.pm, nk.e.b);
      this.n(dfh.oD, dfh.po);
      this.l(dfh.oj).b(dfh.oj).a(dfh.ol);
      this.l(dfh.ok).b(dfh.ok).a(dfh.om);
      this.a(dfh.ok, dfh.di, dfh.du);
      this.a(dfh.oo, dfh.pn, nk.e.b);
      this.n(dfh.oq, dfh.pp);
      this.l(dfh.ae).d(dfh.ae);
      this.l(dfh.an).d(dfh.an);
      this.a(dfh.v, dfh.dk, dfh.dv);
      this.b(dfh.or, nk.e.b);
      this.a(cud.dG);
      this.i(dfh.dy);
      this.k(dfh.hY);
      this.u();
      this.n(dfh.cP);
      this.o(dfh.bp);
      this.o(dfh.bq);
      this.o(dfh.hh);
      this.t();
      this.q(dfh.fN);
      this.q(dfh.kG);
      this.q(dfh.kH);
      this.r(dfh.gS);
      this.r(dfh.gT);
      this.r(dfh.gU);
      this.o();
      this.p();
      this.d(dfh.cD, od.h);
      this.d(dfh.nW, od.h);
      this.d(dfh.nV, od.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dfh.eK, dfh.eS);
      this.k(dfh.m, dfh.eO);
      this.k(dfh.eJ, dfh.eR);
      this.k(dfh.eI, dfh.eQ);
      this.az();
      this.k(dfh.eH, dfh.eP);
      this.aA();
      cvh.h().forEach($$0 -> this.a($$0, ny.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dfh.hX);
      nr.a<Integer> $$0 = nr.a(dsx.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akk $$3 = ob.a(cud.hC, $$2);
         $$0.a($$1, nt.a().a(nu.c, oa.aa.a(dfh.hX, $$2, ob.h($$3), this.c)));
         oa.bx.a(ny.a(cud.hC, $$2), ob.k($$3), this.c);
      }

      this.b.accept(nq.a(dfh.hX).a($$0));
   }

   private void o(dff $$0, dff $$1) {
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
                  nr.a(dsx.az, dsx.r)
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
      this.b.accept(nq.a($$1).a(a(dsx.r, $$13, $$12)));
   }

   class a {
      private final akk b;

      public a(final akk $$0, final dff $$1) {
         this.b = oa.aa.a($$0, ob.u($$1), nk.this.c);
      }

      public nk.a a(dff... $$0) {
         for (dff $$1 : $$0) {
            nk.this.b.accept(nk.c($$1, this.b));
         }

         return this;
      }

      public nk.a b(dff... $$0) {
         for (dff $$1 : $$0) {
            nk.this.c($$1);
         }

         return this.a($$0);
      }

      public nk.a a(nz $$0, dff... $$1) {
         for (dff $$2 : $$1) {
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
      private final Set<dff> f = new HashSet<>();

      public b(final ob $$0) {
         this.b = $$0;
      }

      public nk.b a(dff $$0, nz $$1) {
         this.e = $$1.a($$0, this.b, nk.this.c);
         if (nk.this.f.containsKey($$0)) {
            nk.this.b.accept(nk.this.f.get($$0).create($$0, this.e, this.b, nk.this.c));
         } else {
            nk.this.b.accept(nk.c($$0, this.e));
         }

         return this;
      }

      public nk.b a(dff $$0, dff $$1) {
         akk $$2 = ny.a($$0);
         nk.this.b.accept(nk.c($$1, $$2));
         nk.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nk.b a(dff $$0) {
         akk $$1 = oa.s.a($$0, this.b, nk.this.c);
         akk $$2 = oa.t.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.b($$0, $$1, $$2));
         akk $$3 = oa.u.a($$0, this.b, nk.this.c);
         nk.this.a($$0, $$3);
         return this;
      }

      public nk.b b(dff $$0) {
         akk $$1 = oa.M.a($$0, this.b, nk.this.c);
         akk $$2 = oa.N.a($$0, this.b, nk.this.c);
         akk $$3 = oa.O.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$1, $$2, $$3));
         akk $$4 = oa.P.a($$0, this.b, nk.this.c);
         nk.this.a($$0, $$4);
         return this;
      }

      public nk.b c(dff $$0) {
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

      public nk.b d(dff $$0) {
         akk $$1 = oa.J.a($$0, this.b, nk.this.c);
         akk $$2 = oa.K.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.c($$0, $$1, $$2));
         akk $$3 = oa.L.a($$0, this.b, nk.this.c);
         nk.this.a($$0, $$3);
         return this;
      }

      public nk.b e(dff $$0) {
         ob $$1 = ob.p($$0);
         akk $$2 = oa.R.a($$0, $$1, nk.this.c);
         akk $$3 = oa.Q.a($$0, $$1, nk.this.c);
         akk $$4 = oa.T.a($$0, $$1, nk.this.c);
         akk $$5 = oa.S.a($$0, $$1, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nk.b f(dff $$0) {
         akk $$1 = oa.V.a($$0, this.b, nk.this.c);
         akk $$2 = oa.U.a($$0, this.b, nk.this.c);
         akk $$3 = oa.X.a($$0, this.b, nk.this.c);
         akk $$4 = oa.W.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nk.b g(dff $$0) {
         akk $$1 = oa.Y.a($$0, this.b, nk.this.c);
         akk $$2 = oa.Z.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.e($$0, $$1, $$2));
         return this;
      }

      public nk.b h(dff $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dff $$1 = this.d.b().get(lu.b.r);
            akk $$2 = oa.aa.a($$0, this.b, nk.this.c);
            nk.this.b.accept(nk.c($$0, $$2));
            nk.this.b.accept(nk.c($$1, $$2));
            nk.this.a($$0.r());
            nk.this.c($$1);
            return this;
         }
      }

      public nk.b i(dff $$0) {
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

      public nk.b j(dff $$0) {
         akk $$1 = this.a(oa.af, $$0);
         akk $$2 = this.a(oa.ae, $$0);
         akk $$3 = this.a(oa.ag, $$0);
         nk.this.b.accept(nk.b($$0, $$1, $$2, $$3));
         nk.this.a($$0, $$2);
         return this;
      }

      private nk.b k(dff $$0) {
         od $$1 = nk.this.g.getOrDefault($$0, od.a.get($$0));
         akk $$2 = $$1.a($$0, nk.this.c);
         nk.this.b.accept(nk.c($$0, $$2));
         return this;
      }

      private nk.b l(dff $$0) {
         nk.this.i($$0);
         return this;
      }

      private void m(dff $$0) {
         if (nk.this.e.contains($$0)) {
            nk.this.k($$0);
         } else {
            nk.this.j($$0);
         }
      }

      private akk a(nz $$0, dff $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nk.this.c));
      }

      public nk.b a(lu $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nk.b, dff> $$2 = nk.h.get($$0x);
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
      nn create(dff var1, akk var2, ob var3, BiConsumer<akk, Supplier<JsonElement>> var4);
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

      public nk.f a(dff $$0) {
         ob $$1 = this.b.c(oc.d, this.b.a(oc.i));
         akk $$2 = oa.j.a($$0, $$1, nk.this.c);
         nk.this.b.accept(nk.d($$0, $$2));
         return this;
      }

      public nk.f b(dff $$0) {
         akk $$1 = oa.j.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.d($$0, $$1));
         return this;
      }

      public nk.f c(dff $$0) {
         akk $$1 = oa.j.a($$0, this.b, nk.this.c);
         akk $$2 = oa.k.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.d($$0, $$1, $$2));
         return this;
      }

      public nk.f d(dff $$0) {
         nk.this.b.accept(nk.a($$0, this.b, nk.this.c));
         return this;
      }
   }
}
