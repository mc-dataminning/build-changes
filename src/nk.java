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
   private final Consumer<cty> d;
   final List<dfi> e = ImmutableList.of(dfk.ey, dfk.eE, dfk.hY);
   final Map<dfi, nk.c> f = ImmutableMap.builder().put(dfk.b, nk::a).put(dfk.sJ, nk::c).put(dfk.eM, nk::b).build();
   final Map<dfi, od> g = ImmutableMap.builder()
      .put(dfk.aV, od.y.get(dfk.aV))
      .put(dfk.jp, od.y.get(dfk.jp))
      .put(dfk.jS, od.a(ob.a(dfk.aV, "_top")))
      .put(dfk.jU, od.a(ob.a(dfk.jp, "_top")))
      .put(dfk.aX, od.d.get(dfk.aV).a($$0x -> $$0x.a(oc.i, ob.G(dfk.aX))))
      .put(dfk.jr, od.d.get(dfk.jp).a($$0x -> $$0x.a(oc.i, ob.G(dfk.jr))))
      .put(dfk.hd, od.d.get(dfk.hd))
      .put(dfk.jT, od.a(ob.a(dfk.hd, "_bottom")))
      .put(dfk.pr, od.z.get(dfk.pr))
      .put(dfk.sJ, od.z.get(dfk.sJ))
      .put(dfk.he, od.d.get(dfk.he).a($$0x -> $$0x.a(oc.i, ob.G(dfk.he))))
      .put(dfk.aW, od.d.get(dfk.aW).a($$0x -> {
         $$0x.a(oc.d, ob.a(dfk.aV, "_top"));
         $$0x.a(oc.i, ob.G(dfk.aW));
      }))
      .put(dfk.jq, od.d.get(dfk.jq).a($$0x -> {
         $$0x.a(oc.d, ob.a(dfk.jp, "_top"));
         $$0x.a(oc.i, ob.G(dfk.jq));
      }))
      .put(dfk.qM, od.z.get(dfk.qM))
      .put(dfk.qH, od.z.get(dfk.qH))
      .build();
   static final Map<lu.b, BiConsumer<nk.b, dfi>> h = ImmutableMap.builder()
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
   public static final List<Pair<dtc, Function<akk, nt>>> a = List.of(
      Pair.of(dtb.L, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0)),
      Pair.of(dtb.M, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.b, nu.a.b).a(nu.d, true)),
      Pair.of(dtb.N, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.b, nu.a.c).a(nu.d, true)),
      Pair.of(dtb.O, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.b, nu.a.d).a(nu.d, true)),
      Pair.of(dtb.J, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.a, nu.a.d).a(nu.d, true)),
      Pair.of(dtb.K, (Function<akk, nt>)$$0 -> nt.a().a(nu.c, $$0).a(nu.a, nu.a.b).a(nu.d, true))
   );
   private static final Map<nk.d, akk> i = new HashMap<>();

   private static nn a(dfi $$0, akk $$1, ob $$2, BiConsumer<akk, Supplier<JsonElement>> $$3) {
      akk $$4 = oa.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nn b(dfi $$0, akk $$1, ob $$2, BiConsumer<akk, Supplier<JsonElement>> $$3) {
      akk $$4 = oa.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nn c(dfi $$0, akk $$1, ob $$2, BiConsumer<akk, Supplier<JsonElement>> $$3) {
      akk $$4 = oa.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nk(Consumer<nn> $$0, BiConsumer<akk, Supplier<JsonElement>> $$1, Consumer<cty> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dfi $$0) {
      this.d.accept($$0.r());
   }

   void a(dfi $$0, akk $$1) {
      this.c.accept(ny.a($$0.r()), new nx($$1));
   }

   private void a(cty $$0, akk $$1) {
      this.c.accept(ny.a($$0), new nx($$1));
   }

   void a(cty $$0) {
      oa.bx.a(ny.a($$0), ob.b($$0), this.c);
   }

   private void d(dfi $$0) {
      cty $$1 = $$0.r();
      if ($$1 != cug.a) {
         oa.bx.a(ny.a($$1), ob.F($$0), this.c);
      }
   }

   private void a(dfi $$0, String $$1) {
      cty $$2 = $$0.r();
      oa.bx.a(ny.a($$2), ob.k(ob.a($$0, $$1)), this.c);
   }

   private static nr b() {
      return nr.a(dtb.R).a(jf.f, nt.a().a(nu.b, nu.a.b)).a(jf.d, nt.a().a(nu.b, nu.a.c)).a(jf.e, nt.a().a(nu.b, nu.a.d)).a(jf.c, nt.a());
   }

   private static nr c() {
      return nr.a(dtb.R).a(jf.d, nt.a()).a(jf.e, nt.a().a(nu.b, nu.a.b)).a(jf.c, nt.a().a(nu.b, nu.a.c)).a(jf.f, nt.a().a(nu.b, nu.a.d));
   }

   private static nr d() {
      return nr.a(dtb.R).a(jf.f, nt.a()).a(jf.d, nt.a().a(nu.b, nu.a.b)).a(jf.e, nt.a().a(nu.b, nu.a.c)).a(jf.c, nt.a().a(nu.b, nu.a.d));
   }

   private static nr e() {
      return nr.a(dtb.P)
         .a(jf.a, nt.a().a(nu.a, nu.a.b))
         .a(jf.b, nt.a().a(nu.a, nu.a.d))
         .a(jf.c, nt.a())
         .a(jf.d, nt.a().a(nu.b, nu.a.c))
         .a(jf.e, nt.a().a(nu.b, nu.a.d))
         .a(jf.f, nt.a().a(nu.b, nu.a.b));
   }

   private static nq b(dfi $$0, akk $$1) {
      return nq.a($$0, a($$1));
   }

   private static nt[] a(akk $$0) {
      return new nt[]{nt.a().a(nu.c, $$0), nt.a().a(nu.c, $$0).a(nu.b, nu.a.b), nt.a().a(nu.c, $$0).a(nu.b, nu.a.c), nt.a().a(nu.c, $$0).a(nu.b, nu.a.d)};
   }

   private static nq a(dfi $$0, akk $$1, akk $$2) {
      return nq.a($$0, nt.a().a(nu.c, $$1), nt.a().a(nu.c, $$2), nt.a().a(nu.c, $$1).a(nu.b, nu.a.c), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c));
   }

   private static nr a(dtc $$0, akk $$1, akk $$2) {
      return nr.a($$0).a(true, nt.a().a(nu.c, $$1)).a(false, nt.a().a(nu.c, $$2));
   }

   private void e(dfi $$0) {
      akk $$1 = od.a.create($$0, this.c);
      akk $$2 = od.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dfi $$0) {
      akk $$1 = od.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dfi $$0) {
      this.b.accept(nq.a($$0).a(nr.a(dtb.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akk $$3 = ob.a($$0, $$2);
         return nt.a().a(nu.c, oa.c.a($$0, $$2, new ob().a(oc.a, $$3), this.c));
      })));
      this.a($$0, ob.a($$0, "_0"));
   }

   static nn b(dfi $$0, akk $$1, akk $$2) {
      return nq.a($$0)
         .a(nr.a(dtb.w).a(false, nt.a().a(nu.c, $$1)).a(true, nt.a().a(nu.c, $$2)))
         .a(
            nr.a(dtb.U, dtb.R)
               .a(dsw.a, jf.f, nt.a().a(nu.b, nu.a.b))
               .a(dsw.a, jf.e, nt.a().a(nu.b, nu.a.d))
               .a(dsw.a, jf.d, nt.a().a(nu.b, nu.a.c))
               .a(dsw.a, jf.c, nt.a())
               .a(dsw.b, jf.f, nt.a().a(nu.b, nu.a.b).a(nu.a, nu.a.b).a(nu.d, true))
               .a(dsw.b, jf.e, nt.a().a(nu.b, nu.a.d).a(nu.a, nu.a.b).a(nu.d, true))
               .a(dsw.b, jf.d, nt.a().a(nu.b, nu.a.c).a(nu.a, nu.a.b).a(nu.d, true))
               .a(dsw.b, jf.c, nt.a().a(nu.a, nu.a.b).a(nu.d, true))
               .a(dsw.c, jf.f, nt.a().a(nu.b, nu.a.d).a(nu.a, nu.a.c))
               .a(dsw.c, jf.e, nt.a().a(nu.b, nu.a.b).a(nu.a, nu.a.c))
               .a(dsw.c, jf.d, nt.a().a(nu.a, nu.a.c))
               .a(dsw.c, jf.c, nt.a().a(nu.b, nu.a.c).a(nu.a, nu.a.c))
         );
   }

   private static nr.d<jf, dth, dtg, Boolean> a(nr.d<jf, dth, dtg, Boolean> $$0, dth $$1, akk $$2, akk $$3, akk $$4, akk $$5) {
      return $$0.a(jf.f, $$1, dtg.a, false, nt.a().a(nu.c, $$2))
         .a(jf.d, $$1, dtg.a, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
         .a(jf.e, $$1, dtg.a, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
         .a(jf.c, $$1, dtg.a, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
         .a(jf.f, $$1, dtg.b, false, nt.a().a(nu.c, $$4))
         .a(jf.d, $$1, dtg.b, false, nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
         .a(jf.e, $$1, dtg.b, false, nt.a().a(nu.c, $$4).a(nu.b, nu.a.c))
         .a(jf.c, $$1, dtg.b, false, nt.a().a(nu.c, $$4).a(nu.b, nu.a.d))
         .a(jf.f, $$1, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
         .a(jf.d, $$1, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
         .a(jf.e, $$1, dtg.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
         .a(jf.c, $$1, dtg.a, true, nt.a().a(nu.c, $$3))
         .a(jf.f, $$1, dtg.b, true, nt.a().a(nu.c, $$5).a(nu.b, nu.a.d))
         .a(jf.d, $$1, dtg.b, true, nt.a().a(nu.c, $$5))
         .a(jf.e, $$1, dtg.b, true, nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
         .a(jf.c, $$1, dtg.b, true, nt.a().a(nu.c, $$5).a(nu.b, nu.a.c));
   }

   private static nn a(dfi $$0, akk $$1, akk $$2, akk $$3, akk $$4, akk $$5, akk $$6, akk $$7, akk $$8) {
      return nq.a($$0).a(a(a(nr.a(dtb.R, dtb.ae, dtb.be, dtb.u), dth.b, $$1, $$2, $$3, $$4), dth.a, $$5, $$6, $$7, $$8));
   }

   static nn a(dfi $$0, akk $$1, akk $$2, akk $$3, akk $$4, akk $$5) {
      return np.a($$0)
         .a(nt.a().a(nu.c, $$1))
         .a(no.a().a(dtb.L, true), nt.a().a(nu.c, $$2).a(nu.d, false))
         .a(no.a().a(dtb.M, true), nt.a().a(nu.c, $$3).a(nu.d, false))
         .a(no.a().a(dtb.N, true), nt.a().a(nu.c, $$4).a(nu.d, false))
         .a(no.a().a(dtb.O, true), nt.a().a(nu.c, $$5).a(nu.d, false));
   }

   static nn c(dfi $$0, akk $$1, akk $$2) {
      return np.a($$0)
         .a(nt.a().a(nu.c, $$1))
         .a(no.a().a(dtb.L, true), nt.a().a(nu.c, $$2).a(nu.d, true))
         .a(no.a().a(dtb.M, true), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true))
         .a(no.a().a(dtb.N, true), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true))
         .a(no.a().a(dtb.O, true), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true));
   }

   static nn a(dfi $$0, akk $$1, akk $$2, akk $$3) {
      return np.a($$0)
         .a(no.a().a(dtb.J, true), nt.a().a(nu.c, $$1))
         .a(no.a().a(dtb.X, dtx.b), nt.a().a(nu.c, $$2).a(nu.d, true))
         .a(no.a().a(dtb.W, dtx.b), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true))
         .a(no.a().a(dtb.Y, dtx.b), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true))
         .a(no.a().a(dtb.Z, dtx.b), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true))
         .a(no.a().a(dtb.X, dtx.c), nt.a().a(nu.c, $$3).a(nu.d, true))
         .a(no.a().a(dtb.W, dtx.c), nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true))
         .a(no.a().a(dtb.Y, dtx.c), nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true))
         .a(no.a().a(dtb.Z, dtx.c), nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true));
   }

   static nn a(dfi $$0, akk $$1, akk $$2, akk $$3, akk $$4, boolean $$5) {
      return nq.a($$0, nt.a().a(nu.d, $$5))
         .a(c())
         .a(
            nr.a(dtb.q, dtb.u)
               .a(false, false, nt.a().a(nu.c, $$2))
               .a(true, false, nt.a().a(nu.c, $$4))
               .a(false, true, nt.a().a(nu.c, $$1))
               .a(true, true, nt.a().a(nu.c, $$3))
         );
   }

   static nn b(dfi $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0)
         .a(
            nr.a(dtb.R, dtb.af, dtb.bi)
               .a(jf.f, dtk.b, dtu.a, nt.a().a(nu.c, $$2))
               .a(jf.e, dtk.b, dtu.a, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtk.b, dtu.a, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtk.b, dtu.a, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtk.b, dtu.e, nt.a().a(nu.c, $$3))
               .a(jf.e, dtk.b, dtu.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtk.b, dtu.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtk.b, dtu.e, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtk.b, dtu.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.e, dtk.b, dtu.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.d, dtk.b, dtu.d, nt.a().a(nu.c, $$3))
               .a(jf.c, dtk.b, dtu.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.f, dtk.b, dtu.c, nt.a().a(nu.c, $$1))
               .a(jf.e, dtk.b, dtu.c, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtk.b, dtu.c, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtk.b, dtu.c, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtk.b, dtu.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.e, dtk.b, dtu.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.d, dtk.b, dtu.b, nt.a().a(nu.c, $$1))
               .a(jf.c, dtk.b, dtu.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.f, dtk.a, dtu.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.e, dtk.a, dtu.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtk.a, dtu.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtk.a, dtu.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtk.a, dtu.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.e, dtk.a, dtu.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.d, dtk.a, dtu.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.c, dtk.a, dtu.e, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.f, dtk.a, dtu.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.e, dtk.a, dtu.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtk.a, dtu.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtk.a, dtu.d, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.f, dtk.a, dtu.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.e, dtk.a, dtu.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
               .a(jf.d, dtk.a, dtu.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.c, dtk.a, dtu.c, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.f, dtk.a, dtu.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.d, true))
               .a(jf.e, dtk.a, dtu.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.c).a(nu.d, true))
               .a(jf.d, dtk.a, dtu.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.b).a(nu.d, true))
               .a(jf.c, dtk.a, dtu.b, nt.a().a(nu.c, $$1).a(nu.a, nu.a.c).a(nu.b, nu.a.d).a(nu.d, true))
         );
   }

   private static nn c(dfi $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0)
         .a(
            nr.a(dtb.R, dtb.af, dtb.u)
               .a(jf.c, dtk.b, false, nt.a().a(nu.c, $$2))
               .a(jf.d, dtk.b, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
               .a(jf.f, dtk.b, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
               .a(jf.e, dtk.b, false, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
               .a(jf.c, dtk.a, false, nt.a().a(nu.c, $$1))
               .a(jf.d, dtk.a, false, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
               .a(jf.f, dtk.a, false, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
               .a(jf.e, dtk.a, false, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
               .a(jf.c, dtk.b, true, nt.a().a(nu.c, $$3))
               .a(jf.d, dtk.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(jf.f, dtk.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(jf.e, dtk.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               .a(jf.c, dtk.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.c))
               .a(jf.d, dtk.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.a))
               .a(jf.f, dtk.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.d))
               .a(jf.e, dtk.a, true, nt.a().a(nu.c, $$3).a(nu.a, nu.a.c).a(nu.b, nu.a.b))
         );
   }

   private static nn d(dfi $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0)
         .a(
            nr.a(dtb.R, dtb.af, dtb.u)
               .a(jf.c, dtk.b, false, nt.a().a(nu.c, $$2))
               .a(jf.d, dtk.b, false, nt.a().a(nu.c, $$2))
               .a(jf.f, dtk.b, false, nt.a().a(nu.c, $$2))
               .a(jf.e, dtk.b, false, nt.a().a(nu.c, $$2))
               .a(jf.c, dtk.a, false, nt.a().a(nu.c, $$1))
               .a(jf.d, dtk.a, false, nt.a().a(nu.c, $$1))
               .a(jf.f, dtk.a, false, nt.a().a(nu.c, $$1))
               .a(jf.e, dtk.a, false, nt.a().a(nu.c, $$1))
               .a(jf.c, dtk.b, true, nt.a().a(nu.c, $$3))
               .a(jf.d, dtk.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(jf.f, dtk.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(jf.e, dtk.b, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               .a(jf.c, dtk.a, true, nt.a().a(nu.c, $$3))
               .a(jf.d, dtk.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(jf.f, dtk.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(jf.e, dtk.a, true, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
         );
   }

   static nq c(dfi $$0, akk $$1) {
      return nq.a($$0, nt.a().a(nu.c, $$1));
   }

   private static nr f() {
      return nr.a(dtb.I).a(jf.a.b, nt.a()).a(jf.a.c, nt.a().a(nu.a, nu.a.b)).a(jf.a.a, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b));
   }

   static nn a(dfi $$0, ob $$1, BiConsumer<akk, Supplier<JsonElement>> $$2) {
      akk $$3 = oa.g.a($$0, $$1, $$2);
      akk $$4 = oa.h.a($$0, $$1, $$2);
      akk $$5 = oa.i.a($$0, $$1, $$2);
      akk $$6 = oa.j.a($$0, $$1, $$2);
      return nq.a($$0, nt.a().a(nu.c, $$6)).a(nr.a(dtb.I).a(jf.a.a, nt.a().a(nu.c, $$3)).a(jf.a.b, nt.a().a(nu.c, $$4)).a(jf.a.c, nt.a().a(nu.c, $$5)));
   }

   static nn d(dfi $$0, akk $$1) {
      return nq.a($$0, nt.a().a(nu.c, $$1)).a(f());
   }

   private void e(dfi $$0, akk $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dfi $$0, od.a $$1) {
      akk $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dfi $$0, od.a $$1) {
      akk $$2 = $$1.create($$0, this.c);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, $$2)).a(b()));
   }

   static nn d(dfi $$0, akk $$1, akk $$2) {
      return nq.a($$0)
         .a(
            nr.a(dtb.I)
               .a(jf.a.b, nt.a().a(nu.c, $$1))
               .a(jf.a.c, nt.a().a(nu.c, $$2).a(nu.a, nu.a.b))
               .a(jf.a.a, nt.a().a(nu.c, $$2).a(nu.a, nu.a.b).a(nu.b, nu.a.b))
         );
   }

   private void a(dfi $$0, od.a $$1, od.a $$2) {
      akk $$3 = $$1.create($$0, this.c);
      akk $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akk a(dfi $$0, String $$1, nz $$2, Function<akk, ob> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ob.a($$0, $$1)), this.c);
   }

   static nn e(dfi $$0, akk $$1, akk $$2) {
      return nq.a($$0).a(a(dtb.w, $$2, $$1));
   }

   static nn e(dfi $$0, akk $$1, akk $$2, akk $$3) {
      return nq.a($$0).a(nr.a(dtb.bh).a(dtt.b, nt.a().a(nu.c, $$1)).a(dtt.a, nt.a().a(nu.c, $$2)).a(dtt.c, nt.a().a(nu.c, $$3)));
   }

   public void a(dfi $$0) {
      this.b($$0, od.a);
   }

   public void b(dfi $$0, od.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dfi $$0, ob $$1, nz $$2) {
      akk $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nk.b h(dfi $$0) {
      od $$1 = this.g.getOrDefault($$0, od.a.get($$0));
      return new nk.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dfi $$0, dfi $$1, dfi $$2) {
      ob $$3 = ob.u($$0);
      akk $$4 = oa.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dfi $$0) {
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

   private void a(dfi $$0, dfi $$1) {
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

   void j(dfi $$0) {
      ob $$1 = ob.b($$0);
      akk $$2 = oa.ak.a($$0, $$1, this.c);
      akk $$3 = oa.al.a($$0, $$1, this.c);
      akk $$4 = oa.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dfi $$0) {
      ob $$1 = ob.b($$0);
      akk $$2 = oa.ah.a($$0, $$1, this.c);
      akk $$3 = oa.ai.a($$0, $$1, this.c);
      akk $$4 = oa.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dfi $$0, dfi $$1) {
      akk $$2 = oa.ah.a($$0);
      akk $$3 = oa.ai.a($$0);
      akk $$4 = oa.aj.a($$0);
      this.a($$1, ny.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dfk.sD);
      akk $$0 = ny.a(dfk.sD);
      akk $$1 = ny.a(dfk.sD, "_partial_tilt");
      akk $$2 = ny.a(dfk.sD, "_full_tilt");
      this.b
         .accept(
            nq.a(dfk.sD)
               .a(b())
               .a(nr.a(dtb.bl).a(dtw.a, nt.a().a(nu.c, $$0)).a(dtw.b, nt.a().a(nu.c, $$0)).a(dtw.c, nt.a().a(nu.c, $$1)).a(dtw.d, nt.a().a(nu.c, $$2)))
         );
   }

   private nk.f l(dfi $$0) {
      return new nk.f(ob.n($$0));
   }

   private void m(dfi $$0) {
      this.c($$0, $$0);
   }

   private void c(dfi $$0, dfi $$1) {
      this.b.accept(c($$0, ny.a($$1)));
   }

   private void a(dfi $$0, nk.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dfi $$0, nk.e $$1, ob $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfi $$0, nk.e $$1) {
      ob $$2 = ob.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfi $$0, nk.e $$1, ob $$2) {
      akk $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dfi $$0, nk.e $$1, dto<Integer> $$2, int... $$3) {
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

   private void a(dfi $$0, dfi $$1, nk.e $$2) {
      this.a($$0, $$2);
      ob $$3 = ob.d($$0);
      akk $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dfi $$0, dfi $$1) {
      od $$2 = od.p.get($$0);
      akk $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akk $$4 = oa.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nq.a($$1, nt.a().a(nu.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dfi $$0, dfi $$1) {
      this.a($$0.r());
      ob $$2 = ob.h($$0);
      ob $$3 = ob.a($$0, $$1);
      akk $$4 = oa.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nq.a($$1, nt.a().a(nu.c, $$4))
               .a(nr.a(dtb.R).a(jf.e, nt.a()).a(jf.d, nt.a().a(nu.b, nu.a.d)).a(jf.c, nt.a().a(nu.b, nu.a.b)).a(jf.f, nt.a().a(nu.b, nu.a.c)))
         );
      this.b.accept(nq.a($$0).a(nr.a(dtb.av).a($$2x -> nt.a().a(nu.c, oa.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dfi $$0 = dfk.kC;
      this.a($$0.r());
      akk $$1 = ny.a($$0, "_top");
      akk $$2 = ny.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dfi $$0 = dfk.kB;
      this.a($$0.r());
      nr $$1 = nr.a(dkx.d, dtb.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> nt.a().a(nu.c, ny.a($$0, "_top_stage_" + $$1x));
            case b -> nt.a().a(nu.c, ny.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nq.a($$0).a($$1));
   }

   private void a(dfi $$0, dfi $$1, dfi $$2, dfi $$3, dfi $$4, dfi $$5, dfi $$6, dfi $$7) {
      this.a($$0, nk.e.b);
      this.a($$1, nk.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dfi $$0, nk.e $$1) {
      this.a($$0, "_top");
      akk $$2 = this.a($$0, "_top", $$1.a(), ob::c);
      akk $$3 = this.a($$0, "_bottom", $$1.a(), ob::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dfk.iD, "_front");
      akk $$0 = ny.a(dfk.iD, "_top");
      akk $$1 = this.a(dfk.iD, "_bottom", nk.e.b.a(), ob::c);
      this.f(dfk.iD, $$0, $$1);
   }

   private void k() {
      akk $$0 = this.a(dfk.bx, "_top", oa.bk, ob::a);
      akk $$1 = this.a(dfk.bx, "_bottom", oa.bk, ob::a);
      this.f(dfk.bx, $$0, $$1);
   }

   private void l() {
      this.c(dfk.sF);
      akk $$0 = ny.a(dfk.sF, "_top");
      akk $$1 = ny.a(dfk.sF, "_bottom");
      this.b.accept(nq.a(dfk.sF).a(b()).a(nr.a(dtb.ae).a(dth.b, nt.a().a(nu.c, $$1)).a(dth.a, nt.a().a(nu.c, $$0))));
   }

   private void f(dfi $$0, akk $$1, akk $$2) {
      this.b.accept(nq.a($$0).a(nr.a(dtb.ae).a(dth.b, nt.a().a(nu.c, $$2)).a(dth.a, nt.a().a(nu.c, $$1))));
   }

   private void n(dfi $$0) {
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
                  nr.a(dtb.ag)
                     .a(dtp.a, nt.a().a(nu.c, $$3))
                     .a(dtp.b, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
                     .a(dtp.c, nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
                     .a(dtp.d, nt.a().a(nu.c, $$6).a(nu.b, nu.a.b))
                     .a(dtp.e, nt.a().a(nu.c, $$5))
                     .a(dtp.f, nt.a().a(nu.c, $$6))
                     .a(dtp.g, nt.a().a(nu.c, $$4))
                     .a(dtp.h, nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
                     .a(dtp.i, nt.a().a(nu.c, $$4).a(nu.b, nu.a.c))
                     .a(dtp.j, nt.a().a(nu.c, $$4).a(nu.b, nu.a.d))
               )
         );
   }

   private void o(dfi $$0) {
      akk $$1 = this.a($$0, "", oa.as, ob::e);
      akk $$2 = this.a($$0, "", oa.au, ob::e);
      akk $$3 = this.a($$0, "", oa.av, ob::e);
      akk $$4 = this.a($$0, "_on", oa.as, ob::e);
      akk $$5 = this.a($$0, "_on", oa.au, ob::e);
      akk $$6 = this.a($$0, "_on", oa.av, ob::e);
      nr $$7 = nr.a(dtb.w, dtb.ah).a(($$6x, $$7x) -> {
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

   private nk.a a(akk $$0, dfi $$1) {
      return new nk.a($$0, $$1);
   }

   private nk.a f(dfi $$0, dfi $$1) {
      return new nk.a(ny.a($$0), $$1);
   }

   private void a(dfi $$0, cty $$1) {
      akk $$2 = oa.aa.a($$0, ob.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dfi $$0, akk $$1) {
      akk $$2 = oa.aa.a($$0, ob.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dfi $$0, dfi $$1) {
      this.a($$0);
      akk $$2 = od.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dfi $$0) {
      this.a($$0.r());
      akk $$1 = od.k.create($$0, this.c);
      akk $$2 = od.l.create($$0, this.c);
      akk $$3 = od.m.create($$0, this.c);
      akk $$4 = od.n.create($$0, this.c);
      this.b
         .accept(
            np.a($$0)
               .a(no.a().a(dtb.S, 1, 2, 3, 4).a(dtb.R, jf.c), nt.a().a(nu.c, $$1))
               .a(no.a().a(dtb.S, 1, 2, 3, 4).a(dtb.R, jf.f), nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.S, 1, 2, 3, 4).a(dtb.R, jf.d), nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
               .a(no.a().a(dtb.S, 1, 2, 3, 4).a(dtb.R, jf.e), nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
               .a(no.a().a(dtb.S, 2, 3, 4).a(dtb.R, jf.c), nt.a().a(nu.c, $$2))
               .a(no.a().a(dtb.S, 2, 3, 4).a(dtb.R, jf.f), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.S, 2, 3, 4).a(dtb.R, jf.d), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
               .a(no.a().a(dtb.S, 2, 3, 4).a(dtb.R, jf.e), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
               .a(no.a().a(dtb.S, 3, 4).a(dtb.R, jf.c), nt.a().a(nu.c, $$3))
               .a(no.a().a(dtb.S, 3, 4).a(dtb.R, jf.f), nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.S, 3, 4).a(dtb.R, jf.d), nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               .a(no.a().a(dtb.S, 3, 4).a(dtb.R, jf.e), nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
               .a(no.a().a(dtb.S, 4).a(dtb.R, jf.c), nt.a().a(nu.c, $$4))
               .a(no.a().a(dtb.S, 4).a(dtb.R, jf.f), nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.S, 4).a(dtb.R, jf.d), nt.a().a(nu.c, $$4).a(nu.b, nu.a.c))
               .a(no.a().a(dtb.S, 4).a(dtb.R, jf.e), nt.a().a(nu.c, $$4).a(nu.b, nu.a.d))
         );
   }

   private void a(od.a $$0, dfi... $$1) {
      for (dfi $$2 : $$1) {
         akk $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(od.a $$0, dfi... $$1) {
      for (dfi $$2 : $$1) {
         akk $$3 = $$0.create($$2, this.c);
         this.b.accept(nq.a($$2, nt.a().a(nu.c, $$3)).a(c()));
      }
   }

   private void h(dfi $$0, dfi $$1) {
      this.a($$0);
      ob $$2 = ob.b($$0, $$1);
      akk $$3 = oa.aI.a($$1, $$2, this.c);
      akk $$4 = oa.aJ.a($$1, $$2, this.c);
      akk $$5 = oa.aK.a($$1, $$2, this.c);
      akk $$6 = oa.aG.a($$1, $$2, this.c);
      akk $$7 = oa.aH.a($$1, $$2, this.c);
      cty $$8 = $$1.r();
      oa.bx.a(ny.a($$8), ob.F($$0), this.c);
      this.b
         .accept(
            np.a($$1)
               .a(nt.a().a(nu.c, $$3))
               .a(no.a().a(dtb.L, true), nt.a().a(nu.c, $$4))
               .a(no.a().a(dtb.M, true), nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.N, true), nt.a().a(nu.c, $$5))
               .a(no.a().a(dtb.O, true), nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.L, false), nt.a().a(nu.c, $$6))
               .a(no.a().a(dtb.M, false), nt.a().a(nu.c, $$7))
               .a(no.a().a(dtb.N, false), nt.a().a(nu.c, $$7).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.O, false), nt.a().a(nu.c, $$6).a(nu.b, nu.a.d))
         );
   }

   private void q(dfi $$0) {
      ob $$1 = ob.z($$0);
      akk $$2 = oa.aL.a($$0, $$1, this.c);
      akk $$3 = this.a($$0, "_conditional", oa.aL, $$1x -> $$1.c(oc.i, $$1x));
      this.b.accept(nq.a($$0).a(a(dtb.c, $$3, $$2)).a(e()));
   }

   private void r(dfi $$0) {
      akk $$1 = od.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<nt> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> nt.a().a(nu.c, ny.a(dfk.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dfk.mZ);
      this.b
         .accept(
            np.a(dfk.mZ)
               .a(no.a().a(dtb.aq, 0), this.a(0))
               .a(no.a().a(dtb.aq, 1), this.a(1))
               .a(no.a().a(dtb.bk, dsx.b), nt.a().a(nu.c, ny.a(dfk.mZ, "_small_leaves")))
               .a(no.a().a(dtb.bk, dsx.c), nt.a().a(nu.c, ny.a(dfk.mZ, "_large_leaves")))
         );
   }

   private nr n() {
      return nr.a(dtb.P)
         .a(jf.a, nt.a().a(nu.a, nu.a.c))
         .a(jf.b, nt.a())
         .a(jf.c, nt.a().a(nu.a, nu.a.b))
         .a(jf.d, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.c))
         .a(jf.e, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.d))
         .a(jf.f, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b));
   }

   private void o() {
      akk $$0 = ob.a(dfk.nU, "_top_open");
      this.b
         .accept(
            nq.a(dfk.nU)
               .a(this.n())
               .a(
                  nr.a(dtb.u)
                     .a(false, nt.a().a(nu.c, od.f.create(dfk.nU, this.c)))
                     .a(true, nt.a().a(nu.c, od.f.get(dfk.nU).a($$1 -> $$1.a(oc.f, $$0)).a(dfk.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nr a(dto<T> $$0, T $$1, akk $$2, akk $$3) {
      nt $$4 = nt.a().a(nu.c, $$2);
      nt $$5 = nt.a().a(nu.c, $$3);
      return nr.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dfi $$0, Function<dfi, ob> $$1) {
      ob $$2 = $$1.apply($$0).b(oc.i, oc.c);
      ob $$3 = $$2.c(oc.g, ob.a($$0, "_front_honey"));
      akk $$4 = oa.q.a($$0, $$2, this.c);
      akk $$5 = oa.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nq.a($$0).a(b()).a(a(dtb.aN, 5, $$5, $$4)));
   }

   private void a(dfi $$0, dto<Integer> $$1, int... $$2) {
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
      akk $$0 = ny.a(dfk.od, "_floor");
      akk $$1 = ny.a(dfk.od, "_ceiling");
      akk $$2 = ny.a(dfk.od, "_wall");
      akk $$3 = ny.a(dfk.od, "_between_walls");
      this.a(cug.wr);
      this.b
         .accept(
            nq.a(dfk.od)
               .a(
                  nr.a(dtb.R, dtb.V)
                     .a(jf.c, dsz.a, nt.a().a(nu.c, $$0))
                     .a(jf.d, dsz.a, nt.a().a(nu.c, $$0).a(nu.b, nu.a.c))
                     .a(jf.f, dsz.a, nt.a().a(nu.c, $$0).a(nu.b, nu.a.b))
                     .a(jf.e, dsz.a, nt.a().a(nu.c, $$0).a(nu.b, nu.a.d))
                     .a(jf.c, dsz.b, nt.a().a(nu.c, $$1))
                     .a(jf.d, dsz.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
                     .a(jf.f, dsz.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
                     .a(jf.e, dsz.b, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
                     .a(jf.c, dsz.c, nt.a().a(nu.c, $$2).a(nu.b, nu.a.d))
                     .a(jf.d, dsz.c, nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
                     .a(jf.f, dsz.c, nt.a().a(nu.c, $$2))
                     .a(jf.e, dsz.c, nt.a().a(nu.c, $$2).a(nu.b, nu.a.c))
                     .a(jf.d, dsz.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
                     .a(jf.c, dsz.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.d))
                     .a(jf.f, dsz.d, nt.a().a(nu.c, $$3))
                     .a(jf.e, dsz.d, nt.a().a(nu.c, $$3).a(nu.b, nu.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nq.a(dfk.nZ, nt.a().a(nu.c, ny.a(dfk.nZ)))
               .a(
                  nr.a(dtb.U, dtb.R)
                     .a(dsw.a, jf.c, nt.a())
                     .a(dsw.a, jf.f, nt.a().a(nu.b, nu.a.b))
                     .a(dsw.a, jf.d, nt.a().a(nu.b, nu.a.c))
                     .a(dsw.a, jf.e, nt.a().a(nu.b, nu.a.d))
                     .a(dsw.b, jf.c, nt.a().a(nu.a, nu.a.b))
                     .a(dsw.b, jf.f, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b))
                     .a(dsw.b, jf.d, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.c))
                     .a(dsw.b, jf.e, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.d))
                     .a(dsw.c, jf.d, nt.a().a(nu.a, nu.a.c))
                     .a(dsw.c, jf.e, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.b))
                     .a(dsw.c, jf.c, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.c))
                     .a(dsw.c, jf.f, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.d))
               )
         );
   }

   private void d(dfi $$0, od.a $$1) {
      akk $$2 = $$1.create($$0, this.c);
      akk $$3 = ob.a($$0, "_front_on");
      akk $$4 = $$1.get($$0).a($$1x -> $$1x.a(oc.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nq.a($$0).a(a(dtb.r, $$4, $$2)).a(b()));
   }

   private void a(dfi... $$0) {
      akk $$1 = ny.a("campfire_off");

      for (dfi $$2 : $$0) {
         akk $$3 = oa.bc.a($$2, ob.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nq.a($$2).a(a(dtb.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dfi $$0) {
      akk $$1 = oa.bt.a($$0, ob.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dfi $$0) {
      akk $$1;
      if ($$0 == dfk.tj) {
         $$1 = oa.bv.a($$0, ob.m($$0), this.c);
      } else {
         $$1 = oa.bu.a($$0, ob.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ob $$0 = ob.a(ob.G(dfk.cl), ob.G(dfk.n));
      akk $$1 = oa.j.a(dfk.cl, $$0, this.c);
      this.b.accept(c(dfk.cl, $$1));
   }

   private void s() {
      this.a(cug.lH);
      this.b
         .accept(
            np.a(dfk.cw)
               .a(
                  no.b(
                     no.a().a(dtb.ab, dtq.c).a(dtb.aa, dtq.c).a(dtb.ac, dtq.c).a(dtb.ad, dtq.c),
                     no.a().a(dtb.ab, dtq.b, dtq.a).a(dtb.aa, dtq.b, dtq.a),
                     no.a().a(dtb.aa, dtq.b, dtq.a).a(dtb.ac, dtq.b, dtq.a),
                     no.a().a(dtb.ac, dtq.b, dtq.a).a(dtb.ad, dtq.b, dtq.a),
                     no.a().a(dtb.ad, dtq.b, dtq.a).a(dtb.ab, dtq.b, dtq.a)
                  ),
                  nt.a().a(nu.c, ny.a("redstone_dust_dot"))
               )
               .a(no.a().a(dtb.ab, dtq.b, dtq.a), nt.a().a(nu.c, ny.a("redstone_dust_side0")))
               .a(no.a().a(dtb.ac, dtq.b, dtq.a), nt.a().a(nu.c, ny.a("redstone_dust_side_alt0")))
               .a(no.a().a(dtb.aa, dtq.b, dtq.a), nt.a().a(nu.c, ny.a("redstone_dust_side_alt1")).a(nu.b, nu.a.d))
               .a(no.a().a(dtb.ad, dtq.b, dtq.a), nt.a().a(nu.c, ny.a("redstone_dust_side1")).a(nu.b, nu.a.d))
               .a(no.a().a(dtb.ab, dtq.a), nt.a().a(nu.c, ny.a("redstone_dust_up")))
               .a(no.a().a(dtb.aa, dtq.a), nt.a().a(nu.c, ny.a("redstone_dust_up")).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.ac, dtq.a), nt.a().a(nu.c, ny.a("redstone_dust_up")).a(nu.b, nu.a.c))
               .a(no.a().a(dtb.ad, dtq.a), nt.a().a(nu.c, ny.a("redstone_dust_up")).a(nu.b, nu.a.d))
         );
   }

   private void t() {
      this.a(cug.lL);
      this.b
         .accept(
            nq.a(dfk.gY)
               .a(c())
               .a(
                  nr.a(dtb.bd, dtb.w)
                     .a(dte.a, false, nt.a().a(nu.c, ny.a(dfk.gY)))
                     .a(dte.a, true, nt.a().a(nu.c, ny.a(dfk.gY, "_on")))
                     .a(dte.b, false, nt.a().a(nu.c, ny.a(dfk.gY, "_subtract")))
                     .a(dte.b, true, nt.a().a(nu.c, ny.a(dfk.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      ob $$0 = ob.a(dfk.jR);
      ob $$1 = ob.a(ob.a(dfk.jE, "_side"), $$0.a(oc.f));
      akk $$2 = oa.ab.a(dfk.jE, $$1, this.c);
      akk $$3 = oa.ac.a(dfk.jE, $$1, this.c);
      akk $$4 = oa.j.b(dfk.jE, "_double", $$1, this.c);
      this.b.accept(e(dfk.jE, $$2, $$3, $$4));
      this.b.accept(c(dfk.jR, oa.c.a(dfk.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cug.sq);
      this.b
         .accept(
            np.a(dfk.fs)
               .a(nt.a().a(nu.c, ob.G(dfk.fs)))
               .a(no.a().a(dtb.k, true), nt.a().a(nu.c, ob.a(dfk.fs, "_bottle0")))
               .a(no.a().a(dtb.l, true), nt.a().a(nu.c, ob.a(dfk.fs, "_bottle1")))
               .a(no.a().a(dtb.m, true), nt.a().a(nu.c, ob.a(dfk.fs, "_bottle2")))
               .a(no.a().a(dtb.k, false), nt.a().a(nu.c, ob.a(dfk.fs, "_empty0")))
               .a(no.a().a(dtb.l, false), nt.a().a(nu.c, ob.a(dfk.fs, "_empty1")))
               .a(no.a().a(dtb.m, false), nt.a().a(nu.c, ob.a(dfk.fs, "_empty2")))
         );
   }

   private void u(dfi $$0) {
      akk $$1 = oa.bp.a($$0, ob.b($$0), this.c);
      akk $$2 = ny.a("mushroom_block_inside");
      this.b
         .accept(
            np.a($$0)
               .a(no.a().a(dtb.L, true), nt.a().a(nu.c, $$1))
               .a(no.a().a(dtb.M, true), nt.a().a(nu.c, $$1).a(nu.b, nu.a.b).a(nu.d, true))
               .a(no.a().a(dtb.N, true), nt.a().a(nu.c, $$1).a(nu.b, nu.a.c).a(nu.d, true))
               .a(no.a().a(dtb.O, true), nt.a().a(nu.c, $$1).a(nu.b, nu.a.d).a(nu.d, true))
               .a(no.a().a(dtb.J, true), nt.a().a(nu.c, $$1).a(nu.a, nu.a.d).a(nu.d, true))
               .a(no.a().a(dtb.K, true), nt.a().a(nu.c, $$1).a(nu.a, nu.a.b).a(nu.d, true))
               .a(no.a().a(dtb.L, false), nt.a().a(nu.c, $$2))
               .a(no.a().a(dtb.M, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, false))
               .a(no.a().a(dtb.N, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, false))
               .a(no.a().a(dtb.O, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, false))
               .a(no.a().a(dtb.J, false), nt.a().a(nu.c, $$2).a(nu.a, nu.a.d).a(nu.d, false))
               .a(no.a().a(dtb.K, false), nt.a().a(nu.c, $$2).a(nu.a, nu.a.b).a(nu.d, false))
         );
      this.a($$0, od.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cug.rB);
      this.b
         .accept(
            nq.a(dfk.eg)
               .a(
                  nr.a(dtb.ay)
                     .a(0, nt.a().a(nu.c, ny.a(dfk.eg)))
                     .a(1, nt.a().a(nu.c, ny.a(dfk.eg, "_slice1")))
                     .a(2, nt.a().a(nu.c, ny.a(dfk.eg, "_slice2")))
                     .a(3, nt.a().a(nu.c, ny.a(dfk.eg, "_slice3")))
                     .a(4, nt.a().a(nu.c, ny.a(dfk.eg, "_slice4")))
                     .a(5, nt.a().a(nu.c, ny.a(dfk.eg, "_slice5")))
                     .a(6, nt.a().a(nu.c, ny.a(dfk.eg, "_slice6")))
               )
         );
   }

   private void x() {
      ob $$0 = new ob()
         .a(oc.c, ob.a(dfk.nX, "_side3"))
         .a(oc.o, ob.G(dfk.t))
         .a(oc.n, ob.a(dfk.nX, "_top"))
         .a(oc.j, ob.a(dfk.nX, "_side3"))
         .a(oc.l, ob.a(dfk.nX, "_side3"))
         .a(oc.k, ob.a(dfk.nX, "_side1"))
         .a(oc.m, ob.a(dfk.nX, "_side2"));
      this.b.accept(c(dfk.nX, oa.a.a(dfk.nX, $$0, this.c)));
   }

   private void y() {
      ob $$0 = new ob()
         .a(oc.c, ob.a(dfk.ob, "_front"))
         .a(oc.o, ob.a(dfk.ob, "_bottom"))
         .a(oc.n, ob.a(dfk.ob, "_top"))
         .a(oc.j, ob.a(dfk.ob, "_front"))
         .a(oc.k, ob.a(dfk.ob, "_front"))
         .a(oc.l, ob.a(dfk.ob, "_side"))
         .a(oc.m, ob.a(dfk.ob, "_side"));
      this.b.accept(c(dfk.ob, oa.a.a(dfk.ob, $$0, this.c)));
   }

   private void a(dfi $$0, dfi $$1, BiFunction<dfi, dfi, ob> $$2) {
      ob $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oa.a.a($$0, $$3, this.c)));
   }

   public void b(dfi $$0) {
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
      ob $$0 = ob.k(dfk.eZ);
      this.b.accept(c(dfk.eZ, ny.a(dfk.eZ)));
      this.a(dfk.ee, $$0);
      this.a(dfk.ef, $$0);
   }

   private void a(dfi $$0, ob $$1) {
      akk $$2 = oa.p.a($$0, $$1.c(oc.g, ob.G($$0)), this.c);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cug.sr);
      this.m(dfk.ft);
      this.b.accept(c(dfk.fv, oa.bs.a(dfk.fv, ob.j(ob.a(dfk.H, "_still")), this.c)));
      this.b
         .accept(
            nq.a(dfk.fu)
               .a(
                  nr.a(djr.g)
                     .a(1, nt.a().a(nu.c, oa.bq.a(dfk.fu, "_level1", ob.j(ob.a(dfk.G, "_still")), this.c)))
                     .a(2, nt.a().a(nu.c, oa.br.a(dfk.fu, "_level2", ob.j(ob.a(dfk.G, "_still")), this.c)))
                     .a(3, nt.a().a(nu.c, oa.bs.a(dfk.fu, "_full", ob.j(ob.a(dfk.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nq.a(dfk.fw)
               .a(
                  nr.a(djr.g)
                     .a(1, nt.a().a(nu.c, oa.bq.a(dfk.fw, "_level1", ob.j(ob.G(dfk.qP)), this.c)))
                     .a(2, nt.a().a(nu.c, oa.br.a(dfk.fw, "_level2", ob.j(ob.G(dfk.qP)), this.c)))
                     .a(3, nt.a().a(nu.c, oa.bs.a(dfk.fw, "_full", ob.j(ob.G(dfk.qP)), this.c)))
               )
         );
   }

   private void B() {
      ob $$0 = ob.b(dfk.kv);
      akk $$1 = oa.aE.a(dfk.kv, $$0, this.c);
      akk $$2 = this.a(dfk.kv, "_dead", oa.aE, $$1x -> $$0.c(oc.b, $$1x));
      this.b.accept(nq.a(dfk.kv).a(a(dtb.au, 5, $$2, $$1)));
   }

   private void C() {
      akk $$0 = ny.a(dfk.tq);
      akk $$1 = ny.a(dfk.tq, "_triggered");
      akk $$2 = ny.a(dfk.tq, "_crafting");
      akk $$3 = ny.a(dfk.tq, "_crafting_triggered");
      this.b
         .accept(
            nq.a(dfk.tq)
               .a(nr.a(dtb.T).a($$0x -> this.a($$0x, nt.a())))
               .a(
                  nr.a(dtb.A, dhb.b)
                     .a(false, false, nt.a().a(nu.c, $$0))
                     .a(true, true, nt.a().a(nu.c, $$3))
                     .a(true, false, nt.a().a(nu.c, $$1))
                     .a(false, true, nt.a().a(nu.c, $$2))
               )
         );
   }

   private void v(dfi $$0) {
      ob $$1 = new ob().a(oc.f, ob.a(dfk.cD, "_top")).a(oc.i, ob.a(dfk.cD, "_side")).a(oc.g, ob.a($$0, "_front"));
      ob $$2 = new ob().a(oc.i, ob.a(dfk.cD, "_top")).a(oc.g, ob.a($$0, "_front_vertical"));
      akk $$3 = oa.p.a($$0, $$1, this.c);
      akk $$4 = oa.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nq.a($$0)
               .a(
                  nr.a(dtb.P)
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
      akk $$0 = ny.a(dfk.fy);
      akk $$1 = ny.a(dfk.fy, "_filled");
      this.b.accept(nq.a(dfk.fy).a(nr.a(dtb.h).a(false, nt.a().a(nu.c, $$0)).a(true, nt.a().a(nu.c, $$1))).a(c()));
   }

   private void E() {
      akk $$0 = ny.a(dfk.ku, "_side");
      akk $$1 = ny.a(dfk.ku, "_noside");
      akk $$2 = ny.a(dfk.ku, "_noside1");
      akk $$3 = ny.a(dfk.ku, "_noside2");
      akk $$4 = ny.a(dfk.ku, "_noside3");
      this.b
         .accept(
            np.a(dfk.ku)
               .a(no.a().a(dtb.L, true), nt.a().a(nu.c, $$0))
               .a(no.a().a(dtb.M, true), nt.a().a(nu.c, $$0).a(nu.b, nu.a.b).a(nu.d, true))
               .a(no.a().a(dtb.N, true), nt.a().a(nu.c, $$0).a(nu.b, nu.a.c).a(nu.d, true))
               .a(no.a().a(dtb.O, true), nt.a().a(nu.c, $$0).a(nu.b, nu.a.d).a(nu.d, true))
               .a(no.a().a(dtb.J, true), nt.a().a(nu.c, $$0).a(nu.a, nu.a.d).a(nu.d, true))
               .a(no.a().a(dtb.K, true), nt.a().a(nu.c, $$0).a(nu.a, nu.a.b).a(nu.d, true))
               .a(no.a().a(dtb.L, false), nt.a().a(nu.c, $$1).a(nu.e, 2), nt.a().a(nu.c, $$2), nt.a().a(nu.c, $$3), nt.a().a(nu.c, $$4))
               .a(
                  no.a().a(dtb.M, false),
                  nt.a().a(nu.c, $$2).a(nu.b, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.b, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$4).a(nu.b, nu.a.b).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.b, nu.a.b).a(nu.d, true)
               )
               .a(
                  no.a().a(dtb.N, false),
                  nt.a().a(nu.c, $$3).a(nu.b, nu.a.c).a(nu.d, true),
                  nt.a().a(nu.c, $$4).a(nu.b, nu.a.c).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.b, nu.a.c).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.b, nu.a.c).a(nu.d, true)
               )
               .a(
                  no.a().a(dtb.O, false),
                  nt.a().a(nu.c, $$4).a(nu.b, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.b, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.b, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.b, nu.a.d).a(nu.d, true)
               )
               .a(
                  no.a().a(dtb.J, false),
                  nt.a().a(nu.c, $$1).a(nu.e, 2).a(nu.a, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$4).a(nu.a, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$2).a(nu.a, nu.a.d).a(nu.d, true),
                  nt.a().a(nu.c, $$3).a(nu.a, nu.a.d).a(nu.d, true)
               )
               .a(
                  no.a().a(dtb.K, false),
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
            np.a(dfk.pc)
               .a(nt.a().a(nu.c, ob.G(dfk.pc)))
               .a(no.a().a(dtb.aL, 1), nt.a().a(nu.c, ob.a(dfk.pc, "_contents1")))
               .a(no.a().a(dtb.aL, 2), nt.a().a(nu.c, ob.a(dfk.pc, "_contents2")))
               .a(no.a().a(dtb.aL, 3), nt.a().a(nu.c, ob.a(dfk.pc, "_contents3")))
               .a(no.a().a(dtb.aL, 4), nt.a().a(nu.c, ob.a(dfk.pc, "_contents4")))
               .a(no.a().a(dtb.aL, 5), nt.a().a(nu.c, ob.a(dfk.pc, "_contents5")))
               .a(no.a().a(dtb.aL, 6), nt.a().a(nu.c, ob.a(dfk.pc, "_contents6")))
               .a(no.a().a(dtb.aL, 7), nt.a().a(nu.c, ob.a(dfk.pc, "_contents7")))
               .a(no.a().a(dtb.aL, 8), nt.a().a(nu.c, ob.a(dfk.pc, "_contents_ready")))
         );
   }

   private void w(dfi $$0) {
      akk $$1 = oa.c.a($$0, ob.a($$0), this.c);
      akk $$2 = this.a($$0, "_powered", oa.c, ob::b);
      akk $$3 = this.a($$0, "_lit", oa.c, ob::b);
      akk $$4 = this.a($$0, "_lit_powered", oa.c, ob::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nn a(dfi $$0, akk $$1, akk $$2, akk $$3, akk $$4) {
      return nq.a($$0).a(nr.a(dtb.r, dtb.w).a(($$4x, $$5) -> $$4x ? nt.a().a(nu.c, $$5 ? $$4 : $$2) : nt.a().a(nu.c, $$5 ? $$3 : $$1)));
   }

   private void i(dfi $$0, dfi $$1) {
      akk $$2 = ny.a($$0);
      akk $$3 = ny.a($$0, "_powered");
      akk $$4 = ny.a($$0, "_lit");
      akk $$5 = ny.a($$0, "_lit_powered");
      this.a($$1, ny.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dfi $$0) {
      this.c($$0);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, oa.ao.a($$0, ob.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dfk.qy);
      this.x(dfk.qx);
      this.x(dfk.qw);
      this.x(dfk.qv);
   }

   private void H() {
      this.c(dfk.st);
      nr.b<jf, dti> $$0 = nr.a(dtb.bm, dtb.bn);

      for (dti $$1 : dti.values()) {
         $$0.a(jf.b, $$1, this.a(jf.b, $$1));
      }

      for (dti $$2 : dti.values()) {
         $$0.a(jf.a, $$2, this.a(jf.a, $$2));
      }

      this.b.accept(nq.a(dfk.st).a($$0));
   }

   private nt a(jf $$0, dti $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ob $$3 = ob.c(ob.a(dfk.st, $$2));
      return nt.a().a(nu.c, oa.an.a(dfk.st, $$2, $$3, this.c));
   }

   private void y(dfi $$0) {
      ob $$1 = new ob().a(oc.e, ob.G(dfk.dV)).a(oc.f, ob.G($$0)).a(oc.i, ob.a($$0, "_side"));
      this.b.accept(c($$0, oa.n.a($$0, $$1, this.c)));
   }

   private void I() {
      akk $$0 = ob.a(dfk.gZ, "_side");
      ob $$1 = new ob().a(oc.f, ob.a(dfk.gZ, "_top")).a(oc.i, $$0);
      ob $$2 = new ob().a(oc.f, ob.a(dfk.gZ, "_inverted_top")).a(oc.i, $$0);
      this.b
         .accept(
            nq.a(dfk.gZ)
               .a(nr.a(dtb.p).a(false, nt.a().a(nu.c, oa.aF.a(dfk.gZ, $$1, this.c))).a(true, nt.a().a(nu.c, oa.aF.a(ny.a(dfk.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dfi $$0) {
      this.b.accept(nq.a($$0, nt.a().a(nu.c, ny.a($$0))).a(this.n()));
   }

   private void J() {
      dfi $$0 = dfk.ss;
      akk $$1 = ny.a($$0, "_on");
      akk $$2 = ny.a($$0);
      this.b.accept(nq.a($$0, nt.a().a(nu.c, ny.a($$0))).a(this.n()).a(a(dtb.w, $$1, $$2)));
   }

   private void K() {
      ob $$0 = new ob().a(oc.B, ob.G(dfk.j)).a(oc.f, ob.G(dfk.cC));
      ob $$1 = new ob().a(oc.B, ob.G(dfk.j)).a(oc.f, ob.a(dfk.cC, "_moist"));
      akk $$2 = oa.aW.a(dfk.cC, $$0, this.c);
      akk $$3 = oa.aW.a(ob.a(dfk.cC, "_moist"), $$1, this.c);
      this.b.accept(nq.a(dfk.cC).a(a(dtb.aQ, 7, $$3, $$2)));
   }

   private List<akk> A(dfi $$0) {
      akk $$1 = oa.aX.a(ny.a($$0, "_floor0"), ob.v($$0), this.c);
      akk $$2 = oa.aX.a(ny.a($$0, "_floor1"), ob.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akk> B(dfi $$0) {
      akk $$1 = oa.aY.a(ny.a($$0, "_side0"), ob.v($$0), this.c);
      akk $$2 = oa.aY.a(ny.a($$0, "_side1"), ob.w($$0), this.c);
      akk $$3 = oa.aZ.a(ny.a($$0, "_side_alt0"), ob.v($$0), this.c);
      akk $$4 = oa.aZ.a(ny.a($$0, "_side_alt1"), ob.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akk> C(dfi $$0) {
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
      no $$0 = no.a().a(dtb.L, false).a(dtb.M, false).a(dtb.N, false).a(dtb.O, false).a(dtb.J, false);
      List<akk> $$1 = this.A(dfk.cr);
      List<akk> $$2 = this.B(dfk.cr);
      List<akk> $$3 = this.C(dfk.cr);
      this.b
         .accept(
            np.a(dfk.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(no.b(no.a().a(dtb.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(no.b(no.a().a(dtb.M, true), $$0), a($$2, $$0x -> $$0x.a(nu.b, nu.a.b)))
               .a(no.b(no.a().a(dtb.N, true), $$0), a($$2, $$0x -> $$0x.a(nu.b, nu.a.c)))
               .a(no.b(no.a().a(dtb.O, true), $$0), a($$2, $$0x -> $$0x.a(nu.b, nu.a.d)))
               .a(no.a().a(dtb.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<akk> $$0 = this.A(dfk.cs);
      List<akk> $$1 = this.B(dfk.cs);
      this.b
         .accept(
            np.a(dfk.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nu.b, nu.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nu.b, nu.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nu.b, nu.a.d)))
         );
   }

   private void D(dfi $$0) {
      akk $$1 = od.t.create($$0, this.c);
      akk $$2 = od.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nq.a($$0).a(a(dtb.j, $$2, $$1)));
   }

   private void N() {
      ob $$0 = ob.a(ob.a(dfk.ad, "_side"), ob.a(dfk.ad, "_top"));
      akk $$1 = oa.j.a(dfk.ad, $$0, this.c);
      this.b.accept(d(dfk.ad, $$1));
   }

   private void O() {
      this.a(cug.ad);
      dfi $$0 = dfk.E;
      nr.b<Boolean, Integer> $$1 = nr.a(dkd.d, dkd.b);
      akk $$2 = ny.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akk $$4 = ny.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, nt.a().a(nu.c, $$4));
         $$1.a(false, $$3, nt.a().a(nu.c, $$2));
      }

      this.b.accept(nq.a(dfk.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nq.a(dfk.kI)
               .a(
                  nr.a(dtb.as)
                     .a(0, nt.a().a(nu.c, this.a(dfk.kI, "_0", oa.c, ob::b)))
                     .a(1, nt.a().a(nu.c, this.a(dfk.kI, "_1", oa.c, ob::b)))
                     .a(2, nt.a().a(nu.c, this.a(dfk.kI, "_2", oa.c, ob::b)))
                     .a(3, nt.a().a(nu.c, this.a(dfk.kI, "_3", oa.c, ob::b)))
               )
         );
   }

   private void Q() {
      akk $$0 = ob.G(dfk.j);
      ob $$1 = new ob().a(oc.e, $$0).b(oc.e, oc.c).a(oc.f, ob.a(dfk.i, "_top")).a(oc.i, ob.a(dfk.i, "_snow"));
      nt $$2 = nt.a().a(nu.c, oa.n.a(dfk.i, "_snow", $$1, this.c));
      this.a(dfk.i, ny.a(dfk.i), $$2);
      akk $$3 = od.f.get(dfk.fl).a($$1x -> $$1x.a(oc.e, $$0)).a(dfk.fl, this.c);
      this.a(dfk.fl, $$3, $$2);
      akk $$4 = od.f.get(dfk.l).a($$1x -> $$1x.a(oc.e, $$0)).a(dfk.l, this.c);
      this.a(dfk.l, $$4, $$2);
   }

   private void a(dfi $$0, akk $$1, nt $$2) {
      List<nt> $$3 = Arrays.asList(a($$1));
      this.b.accept(nq.a($$0).a(nr.a(dtb.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cug.rh);
      this.b
         .accept(
            nq.a(dfk.fC)
               .a(
                  nr.a(dtb.ar)
                     .a(0, nt.a().a(nu.c, ny.a(dfk.fC, "_stage0")))
                     .a(1, nt.a().a(nu.c, ny.a(dfk.fC, "_stage1")))
                     .a(2, nt.a().a(nu.c, ny.a(dfk.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dfk.kE, ny.a(dfk.kE)));
   }

   private void j(dfi $$0, dfi $$1) {
      ob $$2 = ob.b($$1);
      akk $$3 = oa.Y.a($$0, $$2, this.c);
      akk $$4 = oa.Z.a($$0, $$2, this.c);
      this.b.accept(nq.a($$0).a(a(dtb.aT, 1, $$4, $$3)));
   }

   private void T() {
      akk $$0 = ny.a(dfk.hc);
      akk $$1 = ny.a(dfk.hc, "_side");
      this.a(cug.lR);
      this.b
         .accept(
            nq.a(dfk.hc)
               .a(
                  nr.a(dtb.Q)
                     .a(jf.a, nt.a().a(nu.c, $$0))
                     .a(jf.c, nt.a().a(nu.c, $$1))
                     .a(jf.f, nt.a().a(nu.c, $$1).a(nu.b, nu.a.b))
                     .a(jf.d, nt.a().a(nu.c, $$1).a(nu.b, nu.a.c))
                     .a(jf.e, nt.a().a(nu.c, $$1).a(nu.b, nu.a.d))
               )
         );
   }

   private void k(dfi $$0, dfi $$1) {
      akk $$2 = ny.a($$0);
      this.b.accept(nq.a($$1, nt.a().a(nu.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      akk $$0 = ny.a(dfk.eW, "_post_ends");
      akk $$1 = ny.a(dfk.eW, "_post");
      akk $$2 = ny.a(dfk.eW, "_cap");
      akk $$3 = ny.a(dfk.eW, "_cap_alt");
      akk $$4 = ny.a(dfk.eW, "_side");
      akk $$5 = ny.a(dfk.eW, "_side_alt");
      this.b
         .accept(
            np.a(dfk.eW)
               .a(nt.a().a(nu.c, $$0))
               .a(no.a().a(dtb.L, false).a(dtb.M, false).a(dtb.N, false).a(dtb.O, false), nt.a().a(nu.c, $$1))
               .a(no.a().a(dtb.L, true).a(dtb.M, false).a(dtb.N, false).a(dtb.O, false), nt.a().a(nu.c, $$2))
               .a(no.a().a(dtb.L, false).a(dtb.M, true).a(dtb.N, false).a(dtb.O, false), nt.a().a(nu.c, $$2).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.L, false).a(dtb.M, false).a(dtb.N, true).a(dtb.O, false), nt.a().a(nu.c, $$3))
               .a(no.a().a(dtb.L, false).a(dtb.M, false).a(dtb.N, false).a(dtb.O, true), nt.a().a(nu.c, $$3).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.L, true), nt.a().a(nu.c, $$4))
               .a(no.a().a(dtb.M, true), nt.a().a(nu.c, $$4).a(nu.b, nu.a.b))
               .a(no.a().a(dtb.N, true), nt.a().a(nu.c, $$5))
               .a(no.a().a(dtb.O, true), nt.a().a(nu.c, $$5).a(nu.b, nu.a.b))
         );
      this.d(dfk.eW);
   }

   private void E(dfi $$0) {
      this.b.accept(nq.a($$0, nt.a().a(nu.c, ny.a($$0))).a(b()));
   }

   private void V() {
      akk $$0 = ny.a(dfk.dw);
      akk $$1 = ny.a(dfk.dw, "_on");
      this.d(dfk.dw);
      this.b
         .accept(
            nq.a(dfk.dw)
               .a(a(dtb.w, $$0, $$1))
               .a(
                  nr.a(dtb.U, dtb.R)
                     .a(dsw.c, jf.c, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.c))
                     .a(dsw.c, jf.f, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.d))
                     .a(dsw.c, jf.d, nt.a().a(nu.a, nu.a.c))
                     .a(dsw.c, jf.e, nt.a().a(nu.a, nu.a.c).a(nu.b, nu.a.b))
                     .a(dsw.a, jf.c, nt.a())
                     .a(dsw.a, jf.f, nt.a().a(nu.b, nu.a.b))
                     .a(dsw.a, jf.d, nt.a().a(nu.b, nu.a.c))
                     .a(dsw.a, jf.e, nt.a().a(nu.b, nu.a.d))
                     .a(dsw.b, jf.c, nt.a().a(nu.a, nu.a.b))
                     .a(dsw.b, jf.f, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.b))
                     .a(dsw.b, jf.d, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.c))
                     .a(dsw.b, jf.e, nt.a().a(nu.a, nu.a.b).a(nu.b, nu.a.d))
               )
         );
   }

   private void W() {
      this.d(dfk.fm);
      this.b.accept(b(dfk.fm, ny.a(dfk.fm)));
   }

   private void X() {
      this.d(dfk.tn);
      this.b.accept(c(dfk.tn, ny.a(dfk.tn)));
   }

   private void Y() {
      this.b.accept(nq.a(dfk.ed).a(nr.a(dtb.H).a(jf.a.a, nt.a().a(nu.c, ny.a(dfk.ed, "_ns"))).a(jf.a.c, nt.a().a(nu.c, ny.a(dfk.ed, "_ew")))));
   }

   private void Z() {
      akk $$0 = od.a.create(dfk.dV, this.c);
      this.b
         .accept(
            nq.a(
               dfk.dV,
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
      akk $$0 = ny.a(dfk.kO);
      akk $$1 = ny.a(dfk.kO, "_on");
      this.b.accept(nq.a(dfk.kO).a(a(dtb.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      ob $$0 = new ob().a(oc.e, ob.a(dfk.by, "_bottom")).a(oc.i, ob.a(dfk.by, "_side"));
      akk $$1 = ob.a(dfk.by, "_top_sticky");
      akk $$2 = ob.a(dfk.by, "_top");
      ob $$3 = $$0.c(oc.E, $$1);
      ob $$4 = $$0.c(oc.E, $$2);
      akk $$5 = ny.a(dfk.by, "_base");
      this.a(dfk.by, $$5, $$4);
      this.a(dfk.br, $$5, $$3);
      akk $$6 = oa.n.a(dfk.by, "_inventory", $$0.c(oc.f, $$2), this.c);
      akk $$7 = oa.n.a(dfk.br, "_inventory", $$0.c(oc.f, $$1), this.c);
      this.a(dfk.by, $$6);
      this.a(dfk.br, $$7);
   }

   private void a(dfi $$0, akk $$1, ob $$2) {
      akk $$3 = oa.bh.a($$0, $$2, this.c);
      this.b.accept(nq.a($$0).a(a(dtb.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      ob $$0 = new ob().a(oc.F, ob.a(dfk.by, "_top")).a(oc.i, ob.a(dfk.by, "_side"));
      ob $$1 = $$0.c(oc.E, ob.a(dfk.by, "_top_sticky"));
      ob $$2 = $$0.c(oc.E, ob.a(dfk.by, "_top"));
      this.b
         .accept(
            nq.a(dfk.bz)
               .a(
                  nr.a(dtb.x, dtb.bg)
                     .a(false, dtn.a, nt.a().a(nu.c, oa.bi.a(dfk.by, "_head", $$2, this.c)))
                     .a(false, dtn.b, nt.a().a(nu.c, oa.bi.a(dfk.by, "_head_sticky", $$1, this.c)))
                     .a(true, dtn.a, nt.a().a(nu.c, oa.bj.a(dfk.by, "_head_short", $$2, this.c)))
                     .a(true, dtn.b, nt.a().a(nu.c, oa.bj.a(dfk.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dfi $$0 = dfk.tr;
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
      this.b.accept(nq.a($$0).a(nr.a(dtb.by, dtb.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> nt.a().a(nu.c, $$7x ? $$10 : $$7);
            case b, c, d -> nt.a().a(nu.c, $$7x ? $$11 : $$8);
            case e -> nt.a().a(nu.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dfi $$0 = dfk.ts;
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
      this.b.accept(nq.a($$0).a(b()).a(nr.a(dod.b, dod.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> nt.a().a(nu.c, $$9x ? $$13 : $$5);
            case b -> nt.a().a(nu.c, $$9x ? $$14 : $$6);
            case c -> nt.a().a(nu.c, $$9x ? $$15 : $$7);
            case d -> nt.a().a(nu.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      akk $$0 = ny.a(dfk.qQ, "_inactive");
      akk $$1 = ny.a(dfk.qQ, "_active");
      this.a(dfk.qQ, $$0);
      this.b.accept(nq.a(dfk.qQ).a(nr.a(dtb.bo).a($$2 -> nt.a().a(nu.c, $$2 != dts.b && $$2 != dts.c ? $$0 : $$1))));
   }

   private void ag() {
      akk $$0 = ny.a(dfk.qR, "_inactive");
      akk $$1 = ny.a(dfk.qR, "_active");
      this.a(dfk.qR, $$0);
      this.b.accept(nq.a(dfk.qR).a(nr.a(dtb.bo).a($$2 -> nt.a().a(nu.c, $$2 != dts.b && $$2 != dts.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      akk $$0 = oa.bM.a(dfk.qV, ob.a(false), this.c);
      akk $$1 = oa.bM.a(dfk.qV, "_can_summon", ob.a(true), this.c);
      this.a(dfk.qV, $$0);
      this.b.accept(nq.a(dfk.qV).a(a(dtb.G, $$1, $$0)));
   }

   private void ai() {
      akk $$0 = ny.a(dfk.nS, "_stable");
      akk $$1 = ny.a(dfk.nS, "_unstable");
      this.a(dfk.nS, $$0);
      this.b.accept(nq.a(dfk.nS).a(a(dtb.b, $$1, $$0)));
   }

   private void aj() {
      akk $$0 = this.a(dfk.sv, "", oa.ao, ob::c);
      akk $$1 = this.a(dfk.sv, "_lit", oa.ao, ob::c);
      this.b.accept(nq.a(dfk.sv).a(a(dtb.D, $$1, $$0)));
      akk $$2 = this.a(dfk.sw, "", oa.ao, ob::c);
      akk $$3 = this.a(dfk.sw, "_lit", oa.ao, ob::c);
      this.b.accept(nq.a(dfk.sw).a(a(dtb.D, $$3, $$2)));
   }

   private void ak() {
      akk $$0 = od.a.create(dfk.fB, this.c);
      akk $$1 = this.a(dfk.fB, "_on", oa.c, ob::b);
      this.b.accept(nq.a(dfk.fB).a(a(dtb.r, $$1, $$0)));
   }

   private void l(dfi $$0, dfi $$1) {
      ob $$2 = ob.y($$0);
      this.b.accept(c($$0, oa.bf.a($$0, $$2, this.c)));
      this.b.accept(nq.a($$1, nt.a().a(nu.c, oa.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      ob $$0 = ob.y(dfk.dK);
      ob $$1 = ob.i(ob.a(dfk.dK, "_off"));
      akk $$2 = oa.bf.a(dfk.dK, $$0, this.c);
      akk $$3 = oa.bf.a(dfk.dK, "_off", $$1, this.c);
      this.b.accept(nq.a(dfk.dK).a(a(dtb.r, $$2, $$3)));
      akk $$4 = oa.bg.a(dfk.dL, $$0, this.c);
      akk $$5 = oa.bg.a(dfk.dL, "_off", $$1, this.c);
      this.b.accept(nq.a(dfk.dL).a(a(dtb.r, $$4, $$5)).a(d()));
      this.d(dfk.dK);
      this.c(dfk.dL);
   }

   private void am() {
      this.a(cug.lK);
      this.b.accept(nq.a(dfk.eh).a(nr.a(dtb.aA, dtb.s, dtb.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return nt.a().a(nu.c, ob.a(dfk.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cug.cT);
      this.b
         .accept(
            nq.a(dfk.mV)
               .a(
                  nr.a(dtb.aS, dtb.C)
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
      ob $$0 = ob.a(dfk.dN);
      akk $$1 = oa.c.a(dfk.dP, $$0, this.c);
      this.b.accept(nq.a(dfk.dN).a(nr.a(dtb.aF).a($$1x -> nt.a().a(nu.c, $$1x < 8 ? ny.a(dfk.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dfk.dN, ny.a(dfk.dN, "_height2"));
      this.b.accept(c(dfk.dP, $$1));
   }

   private void ap() {
      this.b.accept(nq.a(dfk.oc, nt.a().a(nu.c, ny.a(dfk.oc))).a(b()));
   }

   private void aq() {
      akk $$0 = od.a.create(dfk.pa, this.c);
      this.a(dfk.pa, $$0);
      this.b.accept(nq.a(dfk.pa).a(nr.a(dtb.bj).a($$0x -> nt.a().a(nu.c, this.a(dfk.pa, "_" + $$0x.c(), oa.c, ob::b)))));
   }

   private void ar() {
      this.a(cug.wu);
      this.b.accept(nq.a(dfk.oi).a(nr.a(dtb.as).a($$0 -> nt.a().a(nu.c, this.a(dfk.oi, "_stage" + $$0, oa.ao, ob::c)))));
   }

   private void as() {
      this.a(cug.ps);
      this.b
         .accept(
            nq.a(dfk.fI)
               .a(
                  nr.a(dtb.a, dtb.M, dtb.L, dtb.N, dtb.O)
                     .a(false, false, false, false, false, nt.a().a(nu.c, ny.a(dfk.fI, "_ns")))
                     .a(false, true, false, false, false, nt.a().a(nu.c, ny.a(dfk.fI, "_n")).a(nu.b, nu.a.b))
                     .a(false, false, true, false, false, nt.a().a(nu.c, ny.a(dfk.fI, "_n")))
                     .a(false, false, false, true, false, nt.a().a(nu.c, ny.a(dfk.fI, "_n")).a(nu.b, nu.a.c))
                     .a(false, false, false, false, true, nt.a().a(nu.c, ny.a(dfk.fI, "_n")).a(nu.b, nu.a.d))
                     .a(false, true, true, false, false, nt.a().a(nu.c, ny.a(dfk.fI, "_ne")))
                     .a(false, true, false, true, false, nt.a().a(nu.c, ny.a(dfk.fI, "_ne")).a(nu.b, nu.a.b))
                     .a(false, false, false, true, true, nt.a().a(nu.c, ny.a(dfk.fI, "_ne")).a(nu.b, nu.a.c))
                     .a(false, false, true, false, true, nt.a().a(nu.c, ny.a(dfk.fI, "_ne")).a(nu.b, nu.a.d))
                     .a(false, false, true, true, false, nt.a().a(nu.c, ny.a(dfk.fI, "_ns")))
                     .a(false, true, false, false, true, nt.a().a(nu.c, ny.a(dfk.fI, "_ns")).a(nu.b, nu.a.b))
                     .a(false, true, true, true, false, nt.a().a(nu.c, ny.a(dfk.fI, "_nse")))
                     .a(false, true, false, true, true, nt.a().a(nu.c, ny.a(dfk.fI, "_nse")).a(nu.b, nu.a.b))
                     .a(false, false, true, true, true, nt.a().a(nu.c, ny.a(dfk.fI, "_nse")).a(nu.b, nu.a.c))
                     .a(false, true, true, false, true, nt.a().a(nu.c, ny.a(dfk.fI, "_nse")).a(nu.b, nu.a.d))
                     .a(false, true, true, true, true, nt.a().a(nu.c, ny.a(dfk.fI, "_nsew")))
                     .a(true, false, false, false, false, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_ns")))
                     .a(true, false, true, false, false, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_n")))
                     .a(true, false, false, true, false, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_n")).a(nu.b, nu.a.c))
                     .a(true, true, false, false, false, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_n")).a(nu.b, nu.a.b))
                     .a(true, false, false, false, true, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_n")).a(nu.b, nu.a.d))
                     .a(true, true, true, false, false, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_ne")))
                     .a(true, true, false, true, false, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_ne")).a(nu.b, nu.a.b))
                     .a(true, false, false, true, true, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_ne")).a(nu.b, nu.a.c))
                     .a(true, false, true, false, true, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_ne")).a(nu.b, nu.a.d))
                     .a(true, false, true, true, false, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_ns")))
                     .a(true, true, false, false, true, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_ns")).a(nu.b, nu.a.b))
                     .a(true, true, true, true, false, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_nse")))
                     .a(true, true, false, true, true, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_nse")).a(nu.b, nu.a.b))
                     .a(true, false, true, true, true, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_nse")).a(nu.b, nu.a.c))
                     .a(true, true, true, false, true, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_nse")).a(nu.b, nu.a.d))
                     .a(true, true, true, true, true, nt.a().a(nu.c, ny.a(dfk.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dfk.fH);
      this.b.accept(nq.a(dfk.fH).a(nr.a(dtb.a, dtb.w).a(($$0, $$1) -> nt.a().a(nu.c, ob.a(dfk.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
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
            return this.a($$0.intValue(), "", ob.b(ob.G(dfk.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ob.b(ob.a(dfk.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ob.b(ob.a(dfk.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cug.kp);
      this.b.accept(nq.a(dfk.mf).a(nr.a(dtb.aD, dtb.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cug.kq);
      Function<Integer, akk> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ob $$2 = ob.a($$1);
         return oa.bw.a(dfk.mg, $$1, $$2, this.c);
      };
      this.b.accept(nq.a(dfk.mg).a(nr.a(dmq.c).a($$1 -> nt.a().a(nu.c, $$0.apply($$1)))));
   }

   private void F(dfi $$0) {
      this.d($$0);
      akk $$1 = ny.a($$0);
      np $$2 = np.a($$0);
      no.c $$3 = ac.a(no.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dtc, Function<akk, nt>> $$4 : a) {
         dtc $$5 = (dtc)$$4.getFirst();
         Function<akk, nt> $$6 = (Function<akk, nt>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(no.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      akk $$0 = ob.a(dfk.qU, "_bottom");
      ob $$1 = new ob().a(oc.e, $$0).a(oc.f, ob.a(dfk.qU, "_top")).a(oc.i, ob.a(dfk.qU, "_side"));
      ob $$2 = new ob().a(oc.e, $$0).a(oc.f, ob.a(dfk.qU, "_top_bloom")).a(oc.i, ob.a(dfk.qU, "_side_bloom"));
      akk $$3 = oa.n.a(dfk.qU, "", $$1, this.c);
      akk $$4 = oa.n.a(dfk.qU, "_bloom", $$2, this.c);
      this.b.accept(nq.a(dfk.qU).a(nr.a(dtb.E).a($$2x -> nt.a().a(nu.c, $$2x ? $$4 : $$3))));
      this.a(cug.gj, $$3);
   }

   private void ax() {
      dfi $$0 = dfk.cm;
      akk $$1 = ny.a($$0);
      np $$2 = np.a($$0);
      List.of(Pair.of(jf.c, nu.a.a), Pair.of(jf.f, nu.a.b), Pair.of(jf.d, nu.a.c), Pair.of(jf.e, nu.a.d)).forEach($$2x -> {
         jf $$3 = (jf)$$2x.getFirst();
         nu.a $$4 = (nu.a)$$2x.getSecond();
         no.c $$5 = no.a().a(dtb.R, $$3);
         $$2.a($$5, nt.a().a(nu.c, $$1).a(nu.b, $$4).a(nu.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, ny.a($$0, "_inventory"));
      i.clear();
   }

   private void a(np $$0, no.c $$1, nu.a $$2) {
      List.of(Pair.of(dtb.bp, oa.aM), Pair.of(dtb.bq, oa.aN), Pair.of(dtb.br, oa.aO), Pair.of(dtb.bs, oa.aP), Pair.of(dtb.bt, oa.aQ), Pair.of(dtb.bu, oa.aR))
         .forEach($$3 -> {
            dtc $$4 = (dtc)$$3.getFirst();
            nz $$5 = (nz)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(np $$0, no.c $$1, nu.a $$2, dtc $$3, nz $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ob $$7 = new ob().a(oc.b, ob.a(dfk.cm, $$6));
      nk.d $$8 = new nk.d($$4, $$6);
      akk $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dfk.cm, $$6, $$7, this.c));
      $$0.a(no.a($$1, no.a().a($$3, $$5)), nt.a().a(nu.c, $$9).a(nu.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dfk.kJ, oa.c.a(dfk.kJ, ob.b(ny.a("magma")), this.c)));
   }

   private void G(dfi $$0) {
      this.b($$0, od.q);
      oa.bD.a(ny.a($$0.r()), ob.u($$0), this.c);
   }

   private void b(dfi $$0, dfi $$1, nk.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dfi $$0, dfi $$1) {
      oa.bE.a(ny.a($$0.r()), ob.u($$1), this.c);
   }

   private void az() {
      akk $$0 = ny.a(dfk.b);
      akk $$1 = ny.a(dfk.b, "_mirrored");
      this.b.accept(a(dfk.eN, $$0, $$1));
      this.a(dfk.eN, $$0);
   }

   private void aA() {
      akk $$0 = ny.a(dfk.sJ);
      akk $$1 = ny.a(dfk.sJ, "_mirrored");
      this.b.accept(a(dfk.td, $$0, $$1).a(f()));
      this.a(dfk.td, $$0);
   }

   private void n(dfi $$0, dfi $$1) {
      this.a($$0, nk.e.b);
      ob $$2 = ob.d(ob.a($$0, "_pot"));
      akk $$3 = nk.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      akk $$0 = ob.a(dfk.pl, "_bottom");
      akk $$1 = ob.a(dfk.pl, "_top_off");
      akk $$2 = ob.a(dfk.pl, "_top");
      akk[] $$3 = new akk[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ob $$5 = new ob().a(oc.e, $$0).a(oc.f, $$4 == 0 ? $$1 : $$2).a(oc.i, ob.a(dfk.pl, "_side" + $$4));
         $$3[$$4] = oa.n.a(dfk.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nq.a(dfk.pl).a(nr.a(dtb.aZ).a($$1x -> nt.a().a(nu.c, $$3[$$1x]))));
      this.a(cug.wS, $$3[0]);
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
      akk $$0 = ob.a(dfk.pb, "_top");
      akk $$1 = ob.a(dfk.pb, "_bottom");
      akk $$2 = ob.a(dfk.pb, "_side");
      akk $$3 = ob.a(dfk.pb, "_lock");
      ob $$4 = new ob().a(oc.o, $$2).a(oc.m, $$2).a(oc.l, $$2).a(oc.c, $$0).a(oc.j, $$0).a(oc.k, $$1).a(oc.n, $$3);
      akk $$5 = oa.b.a(dfk.pb, $$4, this.c);
      this.b.accept(nq.a(dfk.pb, nt.a().a(nu.c, $$5)).a(nr.a(dtb.T).a($$0x -> this.a($$0x, nt.a()))));
   }

   private void aD() {
      dfi $$0 = dfk.n;
      akk $$1 = ny.a($$0);
      od $$2 = od.a.get($$0);
      dfi $$3 = dfk.jH;
      akk $$4 = oa.ab.a($$3, $$2.b(), this.c);
      akk $$5 = oa.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lt.a().filter(lu::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dfk.rf).a(lt.w).a(dfk.rf, dfk.rD).a(dfk.rj, dfk.rn).a(lt.y);
      this.h(dfk.re).a(lt.A).a(dfk.re, dfk.rC).a(dfk.ri, dfk.rm).a(lt.C);
      this.h(dfk.rd).a(lt.E).a(dfk.rd, dfk.rB).a(dfk.rh, dfk.rl).a(lt.G);
      this.h(dfk.rc).a(lt.I).a(dfk.rc, dfk.rA).a(dfk.rg, dfk.rk).a(lt.K);
      this.w(dfk.sk);
      this.w(dfk.sl);
      this.w(dfk.sm);
      this.w(dfk.sn);
      this.i(dfk.sk, dfk.so);
      this.i(dfk.sl, dfk.sp);
      this.i(dfk.sm, dfk.sq);
      this.i(dfk.sn, dfk.sr);
      this.m(dfk.a);
      this.c(dfk.nc, dfk.a);
      this.c(dfk.nb, dfk.a);
      this.m(dfk.fO);
      this.m(dfk.dQ);
      this.c(dfk.nd, dfk.G);
      this.m(dfk.fA);
      this.m(dfk.me);
      this.m(dfk.fr);
      this.m(dfk.fR);
      this.a(cug.ue);
      this.m(dfk.pg);
      this.m(dfk.G);
      this.m(dfk.H);
      this.m(dfk.hV);
      this.a(cug.fS);
      this.o(dfk.pM, dfk.qd);
      this.o(dfk.pN, dfk.qe);
      this.o(dfk.pO, dfk.qf);
      this.o(dfk.pP, dfk.qg);
      this.o(dfk.pQ, dfk.qh);
      this.o(dfk.pR, dfk.qi);
      this.o(dfk.pS, dfk.qj);
      this.o(dfk.pT, dfk.qk);
      this.o(dfk.pU, dfk.ql);
      this.o(dfk.pV, dfk.qm);
      this.o(dfk.pW, dfk.qn);
      this.o(dfk.pX, dfk.qo);
      this.o(dfk.pY, dfk.qp);
      this.o(dfk.pZ, dfk.qq);
      this.o(dfk.qa, dfk.qr);
      this.o(dfk.qb, dfk.qs);
      this.o(dfk.pL, dfk.qc);
      this.m(dfk.na);
      this.m(dfk.gs);
      this.m(dfk.qP);
      this.m(dfk.sx);
      this.s(dfk.sy);
      this.s(dfk.sz);
      this.t(dfk.ti);
      this.t(dfk.tj);
      this.aj();
      this.g(dfk.sC, dfk.sA);
      this.p(dfk.sB);
      this.a(dfk.hW, cug.hB);
      this.a(cug.hB);
      this.aE();
      this.a(dfk.kN, cug.jb);
      this.a(cug.jb);
      this.f(dfk.bQ, ob.a(dfk.by, "_side"));
      this.a(dfk.R);
      this.a(dfk.S);
      this.a(dfk.iB);
      this.a(dfk.cx);
      this.a(dfk.cy);
      this.a(dfk.cz);
      this.a(dfk.fE);
      this.a(dfk.fF);
      this.a(dfk.fJ);
      this.a(dfk.N);
      this.a(dfk.T);
      this.a(dfk.O);
      this.a(dfk.ch);
      this.a(dfk.P);
      this.a(dfk.Q);
      this.a(dfk.ci);
      this.b(dfk.pj, od.d);
      this.a(dfk.pi);
      this.a(dfk.aR);
      this.a(dfk.aS);
      this.a(dfk.aT);
      this.a(dfk.hb);
      this.a(dfk.dI);
      this.a(dfk.dJ);
      this.a(dfk.ha);
      this.a(dfk.pC);
      this.a(dfk.mW);
      this.a(dfk.dR);
      this.a(dfk.k);
      this.a(dfk.pk);
      this.a(dfk.fz);
      this.a(dfk.ec);
      this.a(dfk.L);
      this.a(dfk.ph);
      this.a(dfk.dO);
      this.b(dfk.dT, od.g);
      this.b(dfk.pq, od.d);
      this.b(dfk.fa, od.d);
      this.m(dfk.ac);
      this.m(dfk.ga);
      this.a(dfk.kK);
      this.a(dfk.aY);
      this.a(dfk.iC);
      this.a(dfk.co);
      this.a(dfk.pK);
      this.a(dfk.ii);
      this.a(dfk.oy);
      this.a(dfk.dW);
      this.a(dfk.dX);
      this.b(dfk.ct, od.b);
      this.a(dfk.aO);
      this.b(dfk.bw, od.v);
      this.a(cug.cS);
      this.b(dfk.ck, od.f);
      this.b(dfk.pd, od.d);
      this.a(dfk.op);
      this.a(dfk.aP);
      this.a(dfk.qt);
      this.a(dfk.qu);
      this.a(dfk.qN);
      this.a(dfk.su);
      this.a(dfk.tf);
      this.a(dfk.tg);
      this.a(dfk.th);
      this.e(dfk.qS);
      this.m(dfk.tt);
      this.aD();
      this.a(dfk.ra);
      this.a(dfk.rb);
      this.a(dfk.qW);
      this.a(dfk.qX);
      this.a(dfk.qY);
      this.a(dfk.qZ);
      this.k(dfk.qW, dfk.rw);
      this.k(dfk.qX, dfk.ry);
      this.k(dfk.qY, dfk.rx);
      this.k(dfk.qZ, dfk.rz);
      this.i(dfk.rM);
      this.i(dfk.rN);
      this.i(dfk.rP);
      this.i(dfk.rO);
      this.a(dfk.rM, dfk.rQ);
      this.a(dfk.rN, dfk.rR);
      this.a(dfk.rP, dfk.rT);
      this.a(dfk.rO, dfk.rS);
      this.k(dfk.rU);
      this.k(dfk.rV);
      this.k(dfk.rX);
      this.k(dfk.rW);
      this.b(dfk.rU, dfk.rY);
      this.b(dfk.rV, dfk.rZ);
      this.b(dfk.rX, dfk.sb);
      this.b(dfk.rW, dfk.sa);
      this.a(dfk.sc);
      this.a(dfk.sd);
      this.a(dfk.se);
      this.a(dfk.sf);
      this.k(dfk.sc, dfk.sg);
      this.k(dfk.sd, dfk.sh);
      this.k(dfk.se, dfk.si);
      this.k(dfk.sf, dfk.sj);
      this.j(dfk.gW, dfk.ch);
      this.j(dfk.gX, dfk.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dfk.og, dfk.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dfk.kt);
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
      this.F(dfk.ff);
      this.F(dfk.fg);
      this.F(dfk.qT);
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
      this.E(dfk.cO);
      this.d(dfk.cO);
      this.E(dfk.oa);
      this.g();
      this.E(dfk.sE);
      this.l(dfk.cp, dfk.cq);
      this.l(dfk.ea, dfk.eb);
      this.a(dfk.cA, dfk.n, ob::c);
      this.a(dfk.nY, dfk.p, ob::d);
      this.y(dfk.ow);
      this.y(dfk.on);
      this.v(dfk.aU);
      this.v(dfk.hi);
      this.C();
      this.D(dfk.oe);
      this.D(dfk.of);
      this.e(dfk.eX, ny.a(dfk.eX));
      this.a(dfk.dY, od.d);
      this.a(dfk.dZ, od.d);
      this.a(dfk.te);
      this.a(dfk.kM, od.d);
      this.f(dfk.j);
      this.f(dfk.sH);
      this.f(dfk.I);
      this.g(dfk.J);
      this.g(dfk.M);
      this.f(dfk.K);
      this.e(dfk.F);
      this.b(dfk.to, od.f);
      this.a(dfk.ij, od.d, od.e);
      this.a(dfk.kx, od.w, od.x);
      this.a(dfk.hf, od.w, od.x);
      this.a(dfk.tk, od.d, od.e);
      this.a(dfk.tl, od.d, od.e);
      this.a(dfk.tm, od.d, od.e);
      this.c(dfk.nT, od.i);
      this.z();
      this.a(dfk.pe, ob::A);
      this.a(dfk.pf, ob::C);
      this.a(dfk.kD, dtb.as, 0, 1, 2, 3);
      this.a(dfk.gt, dtb.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfk.fq, dtb.as, 0, 1, 1, 2);
      this.a(dfk.gu, dtb.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfk.cB, dtb.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dfk.kA, nk.e.b, dtb.aq, 0, 1);
      this.i();
      this.h();
      this.a(ny.a("decorated_pot"), dfk.iA).b(dfk.tp);
      this.a(ny.a("banner"), dfk.n)
         .a(oa.bF, dfk.iJ, dfk.iK, dfk.iL, dfk.iM, dfk.iN, dfk.iO, dfk.iP, dfk.iQ, dfk.iR, dfk.iS, dfk.iT, dfk.iU, dfk.iV, dfk.iW, dfk.iX, dfk.iY)
         .b(dfk.iZ, dfk.ja, dfk.jb, dfk.jc, dfk.jd, dfk.je, dfk.jf, dfk.jg, dfk.jh, dfk.ji, dfk.jj, dfk.jk, dfk.jl, dfk.jm, dfk.jn, dfk.jo);
      this.a(ny.a("bed"), dfk.n)
         .b(dfk.aZ, dfk.ba, dfk.bb, dfk.bc, dfk.bd, dfk.be, dfk.bf, dfk.bg, dfk.bh, dfk.bi, dfk.bj, dfk.bk, dfk.bl, dfk.bm, dfk.bn, dfk.bo);
      this.m(dfk.aZ, dfk.bA);
      this.m(dfk.ba, dfk.bB);
      this.m(dfk.bb, dfk.bC);
      this.m(dfk.bc, dfk.bD);
      this.m(dfk.bd, dfk.bE);
      this.m(dfk.be, dfk.bF);
      this.m(dfk.bf, dfk.bG);
      this.m(dfk.bg, dfk.bH);
      this.m(dfk.bh, dfk.bI);
      this.m(dfk.bi, dfk.bJ);
      this.m(dfk.bj, dfk.bK);
      this.m(dfk.bk, dfk.bL);
      this.m(dfk.bl, dfk.bM);
      this.m(dfk.bm, dfk.bN);
      this.m(dfk.bn, dfk.bO);
      this.m(dfk.bo, dfk.bP);
      this.a(ny.a("skull"), dfk.dW)
         .a(oa.bG, dfk.gM, dfk.gK, dfk.gI, dfk.gE, dfk.gG, dfk.gQ)
         .a(dfk.gO)
         .b(dfk.gN, dfk.gP, dfk.gL, dfk.gJ, dfk.gF, dfk.gH, dfk.gR);
      this.G(dfk.kP);
      this.G(dfk.kQ);
      this.G(dfk.kR);
      this.G(dfk.kS);
      this.G(dfk.kT);
      this.G(dfk.kU);
      this.G(dfk.kV);
      this.G(dfk.kW);
      this.G(dfk.kX);
      this.G(dfk.kY);
      this.G(dfk.kZ);
      this.G(dfk.la);
      this.G(dfk.lb);
      this.G(dfk.lc);
      this.G(dfk.ld);
      this.G(dfk.le);
      this.G(dfk.lf);
      this.b(dfk.mX, od.q);
      this.c(dfk.mX);
      this.a(ny.a("chest"), dfk.n).b(dfk.cv, dfk.gV);
      this.a(ny.a("ender_chest"), dfk.co).b(dfk.fG);
      this.f(dfk.fx, dfk.co).a(dfk.fx, dfk.kF);
      this.a(dfk.aM);
      this.a(dfk.aN);
      this.a(dfk.lw);
      this.a(dfk.lx);
      this.a(dfk.ly);
      this.a(dfk.lz);
      this.a(dfk.lA);
      this.a(dfk.lB);
      this.a(dfk.lC);
      this.a(dfk.lD);
      this.a(dfk.lE);
      this.a(dfk.lF);
      this.a(dfk.lG);
      this.a(dfk.lH);
      this.a(dfk.lI);
      this.a(dfk.lJ);
      this.a(dfk.lK);
      this.a(dfk.lL);
      this.a(od.a, dfk.lM, dfk.lN, dfk.lO, dfk.lP, dfk.lQ, dfk.lR, dfk.lS, dfk.lT, dfk.lU, dfk.lV, dfk.lW, dfk.lX, dfk.lY, dfk.lZ, dfk.ma, dfk.mb);
      this.a(dfk.iA);
      this.a(dfk.hj);
      this.a(dfk.hk);
      this.a(dfk.hl);
      this.a(dfk.hm);
      this.a(dfk.hn);
      this.a(dfk.ho);
      this.a(dfk.hp);
      this.a(dfk.hq);
      this.a(dfk.hr);
      this.a(dfk.hs);
      this.a(dfk.ht);
      this.a(dfk.hu);
      this.a(dfk.hv);
      this.a(dfk.hw);
      this.a(dfk.hx);
      this.a(dfk.hy);
      this.a(dfk.qO);
      this.h(dfk.aQ, dfk.eY);
      this.h(dfk.ei, dfk.hz);
      this.h(dfk.ej, dfk.hA);
      this.h(dfk.ek, dfk.hB);
      this.h(dfk.el, dfk.hC);
      this.h(dfk.em, dfk.hD);
      this.h(dfk.en, dfk.hE);
      this.h(dfk.eo, dfk.hF);
      this.h(dfk.ep, dfk.hG);
      this.h(dfk.eq, dfk.hH);
      this.h(dfk.er, dfk.hI);
      this.h(dfk.es, dfk.hJ);
      this.h(dfk.et, dfk.hK);
      this.h(dfk.eu, dfk.hL);
      this.h(dfk.ev, dfk.hM);
      this.h(dfk.ew, dfk.hN);
      this.h(dfk.ex, dfk.hO);
      this.b(od.o, dfk.lg, dfk.lh, dfk.li, dfk.lj, dfk.lk, dfk.ll, dfk.lm, dfk.ln, dfk.lo, dfk.lp, dfk.lq, dfk.lr, dfk.ls, dfk.lt, dfk.lu, dfk.lv);
      this.g(dfk.bA, dfk.ik);
      this.g(dfk.bB, dfk.il);
      this.g(dfk.bC, dfk.im);
      this.g(dfk.bD, dfk.in);
      this.g(dfk.bE, dfk.io);
      this.g(dfk.bF, dfk.ip);
      this.g(dfk.bG, dfk.iq);
      this.g(dfk.bH, dfk.ir);
      this.g(dfk.bI, dfk.is);
      this.g(dfk.bJ, dfk.it);
      this.g(dfk.bK, dfk.iu);
      this.g(dfk.bL, dfk.iv);
      this.g(dfk.bM, dfk.iw);
      this.g(dfk.bN, dfk.ix);
      this.g(dfk.bO, dfk.iy);
      this.g(dfk.bP, dfk.iz);
      this.a(dfk.sI);
      this.a(dfk.eL);
      this.a(dfk.bu, dfk.gb, nk.e.a);
      this.a(dfk.bR, dfk.gc, nk.e.b);
      this.a(dfk.bT, dfk.gd, nk.e.b);
      this.a(dfk.bU, dfk.ge, nk.e.b);
      this.a(dfk.bV, dfk.gf, nk.e.b);
      this.a(dfk.bW, dfk.gg, nk.e.b);
      this.a(dfk.bX, dfk.gh, nk.e.b);
      this.a(dfk.bY, dfk.gi, nk.e.b);
      this.a(dfk.bZ, dfk.gj, nk.e.b);
      this.a(dfk.ca, dfk.gk, nk.e.b);
      this.a(dfk.cb, dfk.gl, nk.e.b);
      this.a(dfk.cc, dfk.gm, nk.e.b);
      this.a(dfk.ce, dfk.gn, nk.e.b);
      this.a(dfk.cd, dfk.go, nk.e.b);
      this.a(dfk.cg, dfk.gp, nk.e.b);
      this.a(dfk.cf, dfk.gq, nk.e.b);
      this.a(dfk.bv, dfk.gr, nk.e.b);
      this.a(dfk.bS, dfk.fS, nk.e.b);
      this.H();
      this.u(dfk.eT);
      this.u(dfk.eU);
      this.u(dfk.eV);
      this.a(dfk.bt, nk.e.a);
      this.b(dfk.dS, nk.e.a);
      this.a(cug.dJ);
      this.b(dfk.mc, dfk.md, nk.e.b);
      this.a(cug.dK);
      this.c(dfk.md);
      this.b(dfk.sG, nk.e.b);
      this.c(dfk.sG);
      this.c(dfk.sw);
      this.b(dfk.oz, dfk.oA, nk.e.b);
      this.b(dfk.oB, dfk.oC, nk.e.b);
      this.a(dfk.oz, "_plant");
      this.c(dfk.oA);
      this.a(dfk.oB, "_plant");
      this.c(dfk.oC);
      this.a(dfk.mY, nk.e.a, ob.c(ob.a(dfk.mZ, "_stage0")));
      this.m();
      this.a(dfk.bs, nk.e.b);
      this.c(dfk.iE, nk.e.b);
      this.c(dfk.iF, nk.e.b);
      this.c(dfk.iG, nk.e.b);
      this.c(dfk.iH, nk.e.a);
      this.c(dfk.iI, nk.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dfk.mw, dfk.mr, dfk.mm, dfk.mh, dfk.mG, dfk.mB, dfk.mQ, dfk.mL);
      this.a(dfk.mx, dfk.ms, dfk.mn, dfk.mi, dfk.mH, dfk.mC, dfk.mR, dfk.mM);
      this.a(dfk.my, dfk.mt, dfk.mo, dfk.mj, dfk.mI, dfk.mD, dfk.mS, dfk.mN);
      this.a(dfk.mz, dfk.mu, dfk.mp, dfk.mk, dfk.mJ, dfk.mE, dfk.mT, dfk.mO);
      this.a(dfk.mA, dfk.mv, dfk.mq, dfk.ml, dfk.mK, dfk.mF, dfk.mU, dfk.mP);
      this.e(dfk.fe, dfk.fc);
      this.e(dfk.fd, dfk.fb);
      this.l(dfk.ab).c(dfk.ab).a(dfk.av);
      this.l(dfk.am).c(dfk.am).a(dfk.aD);
      this.a(dfk.am, dfk.dj, dfk.ds);
      this.b(dfk.aL, od.s);
      this.l(dfk.Y).c(dfk.Y).a(dfk.as);
      this.l(dfk.ai).c(dfk.ai).a(dfk.aA);
      this.a(dfk.ai, dfk.dd, dfk.do);
      this.a(dfk.B, dfk.fX, nk.e.b);
      this.b(dfk.aI, od.s);
      this.l(dfk.Z).d(dfk.Z).a(dfk.at);
      this.l(dfk.aj).d(dfk.aj).a(dfk.aB);
      this.a(dfk.aj, dfk.de, dfk.dp);
      this.a(dfk.C, dfk.fY, nk.e.b);
      this.b(dfk.aJ, od.s);
      this.l(dfk.W).c(dfk.W).a(dfk.aq);
      this.l(dfk.ag).c(dfk.ag).a(dfk.ay);
      this.a(dfk.ag, dfk.dc, dfk.dn);
      this.a(dfk.z, dfk.fV, nk.e.b);
      this.b(dfk.aG, od.s);
      this.l(dfk.U).c(dfk.U).a(dfk.ao);
      this.l(dfk.al).c(dfk.al).a(dfk.aw);
      this.a(dfk.al, dfk.da, dfk.dl);
      this.a(dfk.x, dfk.fT, nk.e.b);
      this.b(dfk.aE, od.s);
      this.l(dfk.V).c(dfk.V).a(dfk.ap);
      this.l(dfk.af).c(dfk.af).a(dfk.ax);
      this.a(dfk.af, dfk.db, dfk.dm);
      this.a(dfk.y, dfk.fU, nk.e.b);
      this.b(dfk.aF, od.s);
      this.l(dfk.aa).c(dfk.aa).a(dfk.au);
      this.l(dfk.ak).c(dfk.ak).a(dfk.aC);
      this.a(dfk.ak, dfk.dg, dfk.dr);
      this.a(dfk.D, dfk.fZ, nk.e.b);
      this.b(dfk.aK, od.s);
      this.l(dfk.X).c(dfk.X).a(dfk.ar);
      this.l(dfk.ah).c(dfk.ah).a(dfk.az);
      this.a(dfk.ah, dfk.df, dfk.dq);
      this.a(dfk.A, dfk.fW, nk.e.b);
      this.b(dfk.aH, od.s);
      this.l(dfk.os).b(dfk.os).a(dfk.ou);
      this.l(dfk.ot).b(dfk.ot).a(dfk.ov);
      this.a(dfk.ot, dfk.dh, dfk.dt);
      this.a(dfk.ox, dfk.pm, nk.e.b);
      this.n(dfk.oD, dfk.po);
      this.l(dfk.oj).b(dfk.oj).a(dfk.ol);
      this.l(dfk.ok).b(dfk.ok).a(dfk.om);
      this.a(dfk.ok, dfk.di, dfk.du);
      this.a(dfk.oo, dfk.pn, nk.e.b);
      this.n(dfk.oq, dfk.pp);
      this.l(dfk.ae).d(dfk.ae);
      this.l(dfk.an).d(dfk.an);
      this.a(dfk.v, dfk.dk, dfk.dv);
      this.b(dfk.or, nk.e.b);
      this.a(cug.dG);
      this.i(dfk.dy);
      this.k(dfk.hY);
      this.u();
      this.n(dfk.cP);
      this.o(dfk.bp);
      this.o(dfk.bq);
      this.o(dfk.hh);
      this.t();
      this.q(dfk.fN);
      this.q(dfk.kG);
      this.q(dfk.kH);
      this.r(dfk.gS);
      this.r(dfk.gT);
      this.r(dfk.gU);
      this.o();
      this.p();
      this.d(dfk.cD, od.h);
      this.d(dfk.nW, od.h);
      this.d(dfk.nV, od.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dfk.eK, dfk.eS);
      this.k(dfk.m, dfk.eO);
      this.k(dfk.eJ, dfk.eR);
      this.k(dfk.eI, dfk.eQ);
      this.az();
      this.k(dfk.eH, dfk.eP);
      this.aA();
      cvk.h().forEach($$0 -> this.a($$0, ny.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dfk.hX);
      nr.a<Integer> $$0 = nr.a(dtb.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akk $$3 = ob.a(cug.hC, $$2);
         $$0.a($$1, nt.a().a(nu.c, oa.aa.a(dfk.hX, $$2, ob.h($$3), this.c)));
         oa.bx.a(ny.a(cug.hC, $$2), ob.k($$3), this.c);
      }

      this.b.accept(nq.a(dfk.hX).a($$0));
   }

   private void o(dfi $$0, dfi $$1) {
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
                  nr.a(dtb.az, dtb.r)
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
      this.b.accept(nq.a($$1).a(a(dtb.r, $$13, $$12)));
   }

   class a {
      private final akk b;

      public a(final akk $$0, final dfi $$1) {
         this.b = oa.aa.a($$0, ob.u($$1), nk.this.c);
      }

      public nk.a a(dfi... $$0) {
         for (dfi $$1 : $$0) {
            nk.this.b.accept(nk.c($$1, this.b));
         }

         return this;
      }

      public nk.a b(dfi... $$0) {
         for (dfi $$1 : $$0) {
            nk.this.c($$1);
         }

         return this.a($$0);
      }

      public nk.a a(nz $$0, dfi... $$1) {
         for (dfi $$2 : $$1) {
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
      private final Set<dfi> f = new HashSet<>();

      public b(final ob $$0) {
         this.b = $$0;
      }

      public nk.b a(dfi $$0, nz $$1) {
         this.e = $$1.a($$0, this.b, nk.this.c);
         if (nk.this.f.containsKey($$0)) {
            nk.this.b.accept(nk.this.f.get($$0).create($$0, this.e, this.b, nk.this.c));
         } else {
            nk.this.b.accept(nk.c($$0, this.e));
         }

         return this;
      }

      public nk.b a(dfi $$0, dfi $$1) {
         akk $$2 = ny.a($$0);
         nk.this.b.accept(nk.c($$1, $$2));
         nk.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nk.b a(dfi $$0) {
         akk $$1 = oa.s.a($$0, this.b, nk.this.c);
         akk $$2 = oa.t.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.b($$0, $$1, $$2));
         akk $$3 = oa.u.a($$0, this.b, nk.this.c);
         nk.this.a($$0, $$3);
         return this;
      }

      public nk.b b(dfi $$0) {
         akk $$1 = oa.M.a($$0, this.b, nk.this.c);
         akk $$2 = oa.N.a($$0, this.b, nk.this.c);
         akk $$3 = oa.O.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$1, $$2, $$3));
         akk $$4 = oa.P.a($$0, this.b, nk.this.c);
         nk.this.a($$0, $$4);
         return this;
      }

      public nk.b c(dfi $$0) {
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

      public nk.b d(dfi $$0) {
         akk $$1 = oa.J.a($$0, this.b, nk.this.c);
         akk $$2 = oa.K.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.c($$0, $$1, $$2));
         akk $$3 = oa.L.a($$0, this.b, nk.this.c);
         nk.this.a($$0, $$3);
         return this;
      }

      public nk.b e(dfi $$0) {
         ob $$1 = ob.p($$0);
         akk $$2 = oa.R.a($$0, $$1, nk.this.c);
         akk $$3 = oa.Q.a($$0, $$1, nk.this.c);
         akk $$4 = oa.T.a($$0, $$1, nk.this.c);
         akk $$5 = oa.S.a($$0, $$1, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nk.b f(dfi $$0) {
         akk $$1 = oa.V.a($$0, this.b, nk.this.c);
         akk $$2 = oa.U.a($$0, this.b, nk.this.c);
         akk $$3 = oa.X.a($$0, this.b, nk.this.c);
         akk $$4 = oa.W.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nk.b g(dfi $$0) {
         akk $$1 = oa.Y.a($$0, this.b, nk.this.c);
         akk $$2 = oa.Z.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.e($$0, $$1, $$2));
         return this;
      }

      public nk.b h(dfi $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dfi $$1 = this.d.b().get(lu.b.r);
            akk $$2 = oa.aa.a($$0, this.b, nk.this.c);
            nk.this.b.accept(nk.c($$0, $$2));
            nk.this.b.accept(nk.c($$1, $$2));
            nk.this.a($$0.r());
            nk.this.c($$1);
            return this;
         }
      }

      public nk.b i(dfi $$0) {
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

      public nk.b j(dfi $$0) {
         akk $$1 = this.a(oa.af, $$0);
         akk $$2 = this.a(oa.ae, $$0);
         akk $$3 = this.a(oa.ag, $$0);
         nk.this.b.accept(nk.b($$0, $$1, $$2, $$3));
         nk.this.a($$0, $$2);
         return this;
      }

      private nk.b k(dfi $$0) {
         od $$1 = nk.this.g.getOrDefault($$0, od.a.get($$0));
         akk $$2 = $$1.a($$0, nk.this.c);
         nk.this.b.accept(nk.c($$0, $$2));
         return this;
      }

      private nk.b l(dfi $$0) {
         nk.this.i($$0);
         return this;
      }

      private void m(dfi $$0) {
         if (nk.this.e.contains($$0)) {
            nk.this.k($$0);
         } else {
            nk.this.j($$0);
         }
      }

      private akk a(nz $$0, dfi $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nk.this.c));
      }

      public nk.b a(lu $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nk.b, dfi> $$2 = nk.h.get($$0x);
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
      nn create(dfi var1, akk var2, ob var3, BiConsumer<akk, Supplier<JsonElement>> var4);
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

      public nk.f a(dfi $$0) {
         ob $$1 = this.b.c(oc.d, this.b.a(oc.i));
         akk $$2 = oa.j.a($$0, $$1, nk.this.c);
         nk.this.b.accept(nk.d($$0, $$2));
         return this;
      }

      public nk.f b(dfi $$0) {
         akk $$1 = oa.j.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.d($$0, $$1));
         return this;
      }

      public nk.f c(dfi $$0) {
         akk $$1 = oa.j.a($$0, this.b, nk.this.c);
         akk $$2 = oa.k.a($$0, this.b, nk.this.c);
         nk.this.b.accept(nk.d($$0, $$1, $$2));
         return this;
      }

      public nk.f d(dfi $$0) {
         nk.this.b.accept(nk.a($$0, this.b, nk.this.c));
         return this;
      }
   }
}
