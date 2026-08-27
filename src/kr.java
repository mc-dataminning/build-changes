import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class kr {
   final Consumer<ku> b;
   final BiConsumer<aep, Supplier<JsonElement>> c;
   private final Consumer<cir> d;
   final List<csk> e = ImmutableList.of(csl.ez, csl.eF, csl.hY);
   final Map<csk, kr.c> f = ImmutableMap.builder().put(csl.b, kr::a).put(csl.rI, kr::c).put(csl.eN, kr::b).build();
   final Map<csk, lk> g = ImmutableMap.builder()
      .put(csl.aV, lk.x.get(csl.aV))
      .put(csl.jp, lk.x.get(csl.jp))
      .put(csl.jS, lk.a(li.a(csl.aV, "_top")))
      .put(csl.jU, lk.a(li.a(csl.jp, "_top")))
      .put(csl.aX, lk.c.get(csl.aV).a($$0x -> $$0x.a(lj.i, li.G(csl.aX))))
      .put(csl.jr, lk.c.get(csl.jp).a($$0x -> $$0x.a(lj.i, li.G(csl.jr))))
      .put(csl.hd, lk.c.get(csl.hd))
      .put(csl.jT, lk.a(li.a(csl.hd, "_bottom")))
      .put(csl.pr, lk.y.get(csl.pr))
      .put(csl.rI, lk.y.get(csl.rI))
      .put(csl.he, lk.c.get(csl.he).a($$0x -> $$0x.a(lj.i, li.G(csl.he))))
      .put(csl.aW, lk.c.get(csl.aW).a($$0x -> {
         $$0x.a(lj.d, li.a(csl.aV, "_top"));
         $$0x.a(lj.i, li.G(csl.aW));
      }))
      .put(csl.jq, lk.c.get(csl.jq).a($$0x -> {
         $$0x.a(lj.d, li.a(csl.jp, "_top"));
         $$0x.a(lj.i, li.G(csl.jq));
      }))
      .build();
   static final Map<jg.b, BiConsumer<kr.b, csk>> h = ImmutableMap.builder()
      .put(jg.b.a, kr.b::a)
      .put(jg.b.e, kr.b::l)
      .put(jg.b.b, kr.b::k)
      .put(jg.b.c, kr.b::k)
      .put(jg.b.f, kr.b::c)
      .put(jg.b.g, kr.b::d)
      .put(jg.b.h, kr.b::e)
      .put(jg.b.i, kr.b::f)
      .put(jg.b.k, kr.b::h)
      .put(jg.b.l, kr.b::i)
      .put(jg.b.m, kr.b::j)
      .put(jg.b.n, kr.b::g)
      .put(jg.b.p, kr.b::m)
      .put(jg.b.q, kr.b::b)
      .build();
   public static final List<Pair<dfp, Function<aep, la>>> a = List.of(
      Pair.of(dfo.L, (Function<aep, la>)$$0 -> la.a().a(lb.c, $$0)),
      Pair.of(dfo.M, (Function<aep, la>)$$0 -> la.a().a(lb.c, $$0).a(lb.b, lb.a.b).a(lb.d, true)),
      Pair.of(dfo.N, (Function<aep, la>)$$0 -> la.a().a(lb.c, $$0).a(lb.b, lb.a.c).a(lb.d, true)),
      Pair.of(dfo.O, (Function<aep, la>)$$0 -> la.a().a(lb.c, $$0).a(lb.b, lb.a.d).a(lb.d, true)),
      Pair.of(dfo.J, (Function<aep, la>)$$0 -> la.a().a(lb.c, $$0).a(lb.a, lb.a.d).a(lb.d, true)),
      Pair.of(dfo.K, (Function<aep, la>)$$0 -> la.a().a(lb.c, $$0).a(lb.a, lb.a.b).a(lb.d, true))
   );
   private static final Map<kr.d, aep> i = new HashMap<>();

   private static ku a(csk $$0, aep $$1, li $$2, BiConsumer<aep, Supplier<JsonElement>> $$3) {
      aep $$4 = lh.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static ku b(csk $$0, aep $$1, li $$2, BiConsumer<aep, Supplier<JsonElement>> $$3) {
      aep $$4 = lh.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static ku c(csk $$0, aep $$1, li $$2, BiConsumer<aep, Supplier<JsonElement>> $$3) {
      aep $$4 = lh.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public kr(Consumer<ku> $$0, BiConsumer<aep, Supplier<JsonElement>> $$1, Consumer<cir> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(csk $$0) {
      this.d.accept($$0.k());
   }

   void a(csk $$0, aep $$1) {
      this.c.accept(lf.a($$0.k()), new le($$1));
   }

   private void a(cir $$0, aep $$1) {
      this.c.accept(lf.a($$0), new le($$1));
   }

   void a(cir $$0) {
      lh.bv.a(lf.a($$0), li.b($$0), this.c);
   }

   private void d(csk $$0) {
      cir $$1 = $$0.k();
      if ($$1 != ciz.a) {
         lh.bv.a(lf.a($$1), li.F($$0), this.c);
      }
   }

   private void a(csk $$0, String $$1) {
      cir $$2 = $$0.k();
      lh.bv.a(lf.a($$2), li.k(li.a($$0, $$1)), this.c);
   }

   private static ky b() {
      return ky.a(dfo.R).a(hb.f, la.a().a(lb.b, lb.a.b)).a(hb.d, la.a().a(lb.b, lb.a.c)).a(hb.e, la.a().a(lb.b, lb.a.d)).a(hb.c, la.a());
   }

   private static ky c() {
      return ky.a(dfo.R).a(hb.d, la.a()).a(hb.e, la.a().a(lb.b, lb.a.b)).a(hb.c, la.a().a(lb.b, lb.a.c)).a(hb.f, la.a().a(lb.b, lb.a.d));
   }

   private static ky d() {
      return ky.a(dfo.R).a(hb.f, la.a()).a(hb.d, la.a().a(lb.b, lb.a.b)).a(hb.e, la.a().a(lb.b, lb.a.c)).a(hb.c, la.a().a(lb.b, lb.a.d));
   }

   private static ky e() {
      return ky.a(dfo.P)
         .a(hb.a, la.a().a(lb.a, lb.a.b))
         .a(hb.b, la.a().a(lb.a, lb.a.d))
         .a(hb.c, la.a())
         .a(hb.d, la.a().a(lb.b, lb.a.c))
         .a(hb.e, la.a().a(lb.b, lb.a.d))
         .a(hb.f, la.a().a(lb.b, lb.a.b));
   }

   private static kx b(csk $$0, aep $$1) {
      return kx.a($$0, a($$1));
   }

   private static la[] a(aep $$0) {
      return new la[]{la.a().a(lb.c, $$0), la.a().a(lb.c, $$0).a(lb.b, lb.a.b), la.a().a(lb.c, $$0).a(lb.b, lb.a.c), la.a().a(lb.c, $$0).a(lb.b, lb.a.d)};
   }

   private static kx a(csk $$0, aep $$1, aep $$2) {
      return kx.a($$0, la.a().a(lb.c, $$1), la.a().a(lb.c, $$2), la.a().a(lb.c, $$1).a(lb.b, lb.a.c), la.a().a(lb.c, $$2).a(lb.b, lb.a.c));
   }

   private static ky a(dfp $$0, aep $$1, aep $$2) {
      return ky.a($$0).a(true, la.a().a(lb.c, $$1)).a(false, la.a().a(lb.c, $$2));
   }

   private void e(csk $$0) {
      aep $$1 = lk.a.create($$0, this.c);
      aep $$2 = lk.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(csk $$0) {
      aep $$1 = lk.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(csk $$0) {
      this.b.accept(kx.a($$0).a(ky.a(dfo.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aep $$3 = li.a($$0, $$2);
         return la.a().a(lb.c, lh.c.a($$0, $$2, new li().a(lj.a, $$3), this.c));
      })));
      this.a($$0, li.a($$0, "_0"));
   }

   static ku b(csk $$0, aep $$1, aep $$2) {
      return kx.a($$0)
         .a(ky.a(dfo.w).a(false, la.a().a(lb.c, $$1)).a(true, la.a().a(lb.c, $$2)))
         .a(
            ky.a(dfo.U, dfo.R)
               .a(dfj.a, hb.f, la.a().a(lb.b, lb.a.b))
               .a(dfj.a, hb.e, la.a().a(lb.b, lb.a.d))
               .a(dfj.a, hb.d, la.a().a(lb.b, lb.a.c))
               .a(dfj.a, hb.c, la.a())
               .a(dfj.b, hb.f, la.a().a(lb.b, lb.a.b).a(lb.a, lb.a.b).a(lb.d, true))
               .a(dfj.b, hb.e, la.a().a(lb.b, lb.a.d).a(lb.a, lb.a.b).a(lb.d, true))
               .a(dfj.b, hb.d, la.a().a(lb.b, lb.a.c).a(lb.a, lb.a.b).a(lb.d, true))
               .a(dfj.b, hb.c, la.a().a(lb.a, lb.a.b).a(lb.d, true))
               .a(dfj.c, hb.f, la.a().a(lb.b, lb.a.d).a(lb.a, lb.a.c))
               .a(dfj.c, hb.e, la.a().a(lb.b, lb.a.b).a(lb.a, lb.a.c))
               .a(dfj.c, hb.d, la.a().a(lb.a, lb.a.c))
               .a(dfj.c, hb.c, la.a().a(lb.b, lb.a.c).a(lb.a, lb.a.c))
         );
   }

   private static ky.d<hb, dfu, dft, Boolean> a(ky.d<hb, dfu, dft, Boolean> $$0, dfu $$1, aep $$2, aep $$3, aep $$4, aep $$5) {
      return $$0.a(hb.f, $$1, dft.a, false, la.a().a(lb.c, $$2))
         .a(hb.d, $$1, dft.a, false, la.a().a(lb.c, $$2).a(lb.b, lb.a.b))
         .a(hb.e, $$1, dft.a, false, la.a().a(lb.c, $$2).a(lb.b, lb.a.c))
         .a(hb.c, $$1, dft.a, false, la.a().a(lb.c, $$2).a(lb.b, lb.a.d))
         .a(hb.f, $$1, dft.b, false, la.a().a(lb.c, $$4))
         .a(hb.d, $$1, dft.b, false, la.a().a(lb.c, $$4).a(lb.b, lb.a.b))
         .a(hb.e, $$1, dft.b, false, la.a().a(lb.c, $$4).a(lb.b, lb.a.c))
         .a(hb.c, $$1, dft.b, false, la.a().a(lb.c, $$4).a(lb.b, lb.a.d))
         .a(hb.f, $$1, dft.a, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.b))
         .a(hb.d, $$1, dft.a, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.c))
         .a(hb.e, $$1, dft.a, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.d))
         .a(hb.c, $$1, dft.a, true, la.a().a(lb.c, $$3))
         .a(hb.f, $$1, dft.b, true, la.a().a(lb.c, $$5).a(lb.b, lb.a.d))
         .a(hb.d, $$1, dft.b, true, la.a().a(lb.c, $$5))
         .a(hb.e, $$1, dft.b, true, la.a().a(lb.c, $$5).a(lb.b, lb.a.b))
         .a(hb.c, $$1, dft.b, true, la.a().a(lb.c, $$5).a(lb.b, lb.a.c));
   }

   private static ku a(csk $$0, aep $$1, aep $$2, aep $$3, aep $$4, aep $$5, aep $$6, aep $$7, aep $$8) {
      return kx.a($$0).a(a(a(ky.a(dfo.R, dfo.ae, dfo.be, dfo.u), dfu.b, $$1, $$2, $$3, $$4), dfu.a, $$5, $$6, $$7, $$8));
   }

   static ku a(csk $$0, aep $$1, aep $$2, aep $$3, aep $$4, aep $$5) {
      return kw.a($$0)
         .a(la.a().a(lb.c, $$1))
         .a(kv.a().a(dfo.L, true), la.a().a(lb.c, $$2).a(lb.d, false))
         .a(kv.a().a(dfo.M, true), la.a().a(lb.c, $$3).a(lb.d, false))
         .a(kv.a().a(dfo.N, true), la.a().a(lb.c, $$4).a(lb.d, false))
         .a(kv.a().a(dfo.O, true), la.a().a(lb.c, $$5).a(lb.d, false));
   }

   static ku c(csk $$0, aep $$1, aep $$2) {
      return kw.a($$0)
         .a(la.a().a(lb.c, $$1))
         .a(kv.a().a(dfo.L, true), la.a().a(lb.c, $$2).a(lb.d, true))
         .a(kv.a().a(dfo.M, true), la.a().a(lb.c, $$2).a(lb.b, lb.a.b).a(lb.d, true))
         .a(kv.a().a(dfo.N, true), la.a().a(lb.c, $$2).a(lb.b, lb.a.c).a(lb.d, true))
         .a(kv.a().a(dfo.O, true), la.a().a(lb.c, $$2).a(lb.b, lb.a.d).a(lb.d, true));
   }

   static ku a(csk $$0, aep $$1, aep $$2, aep $$3) {
      return kw.a($$0)
         .a(kv.a().a(dfo.J, true), la.a().a(lb.c, $$1))
         .a(kv.a().a(dfo.X, dgk.b), la.a().a(lb.c, $$2).a(lb.d, true))
         .a(kv.a().a(dfo.W, dgk.b), la.a().a(lb.c, $$2).a(lb.b, lb.a.b).a(lb.d, true))
         .a(kv.a().a(dfo.Y, dgk.b), la.a().a(lb.c, $$2).a(lb.b, lb.a.c).a(lb.d, true))
         .a(kv.a().a(dfo.Z, dgk.b), la.a().a(lb.c, $$2).a(lb.b, lb.a.d).a(lb.d, true))
         .a(kv.a().a(dfo.X, dgk.c), la.a().a(lb.c, $$3).a(lb.d, true))
         .a(kv.a().a(dfo.W, dgk.c), la.a().a(lb.c, $$3).a(lb.b, lb.a.b).a(lb.d, true))
         .a(kv.a().a(dfo.Y, dgk.c), la.a().a(lb.c, $$3).a(lb.b, lb.a.c).a(lb.d, true))
         .a(kv.a().a(dfo.Z, dgk.c), la.a().a(lb.c, $$3).a(lb.b, lb.a.d).a(lb.d, true));
   }

   static ku a(csk $$0, aep $$1, aep $$2, aep $$3, aep $$4, boolean $$5) {
      return kx.a($$0, la.a().a(lb.d, $$5))
         .a(c())
         .a(
            ky.a(dfo.q, dfo.u)
               .a(false, false, la.a().a(lb.c, $$2))
               .a(true, false, la.a().a(lb.c, $$4))
               .a(false, true, la.a().a(lb.c, $$1))
               .a(true, true, la.a().a(lb.c, $$3))
         );
   }

   static ku b(csk $$0, aep $$1, aep $$2, aep $$3) {
      return kx.a($$0)
         .a(
            ky.a(dfo.R, dfo.af, dfo.bi)
               .a(hb.f, dfx.b, dgh.a, la.a().a(lb.c, $$2))
               .a(hb.e, dfx.b, dgh.a, la.a().a(lb.c, $$2).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.d, dfx.b, dgh.a, la.a().a(lb.c, $$2).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.c, dfx.b, dgh.a, la.a().a(lb.c, $$2).a(lb.b, lb.a.d).a(lb.d, true))
               .a(hb.f, dfx.b, dgh.e, la.a().a(lb.c, $$3))
               .a(hb.e, dfx.b, dgh.e, la.a().a(lb.c, $$3).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.d, dfx.b, dgh.e, la.a().a(lb.c, $$3).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.c, dfx.b, dgh.e, la.a().a(lb.c, $$3).a(lb.b, lb.a.d).a(lb.d, true))
               .a(hb.f, dfx.b, dgh.d, la.a().a(lb.c, $$3).a(lb.b, lb.a.d).a(lb.d, true))
               .a(hb.e, dfx.b, dgh.d, la.a().a(lb.c, $$3).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.d, dfx.b, dgh.d, la.a().a(lb.c, $$3))
               .a(hb.c, dfx.b, dgh.d, la.a().a(lb.c, $$3).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.f, dfx.b, dgh.c, la.a().a(lb.c, $$1))
               .a(hb.e, dfx.b, dgh.c, la.a().a(lb.c, $$1).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.d, dfx.b, dgh.c, la.a().a(lb.c, $$1).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.c, dfx.b, dgh.c, la.a().a(lb.c, $$1).a(lb.b, lb.a.d).a(lb.d, true))
               .a(hb.f, dfx.b, dgh.b, la.a().a(lb.c, $$1).a(lb.b, lb.a.d).a(lb.d, true))
               .a(hb.e, dfx.b, dgh.b, la.a().a(lb.c, $$1).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.d, dfx.b, dgh.b, la.a().a(lb.c, $$1))
               .a(hb.c, dfx.b, dgh.b, la.a().a(lb.c, $$1).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.f, dfx.a, dgh.a, la.a().a(lb.c, $$2).a(lb.a, lb.a.c).a(lb.d, true))
               .a(hb.e, dfx.a, dgh.a, la.a().a(lb.c, $$2).a(lb.a, lb.a.c).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.d, dfx.a, dgh.a, la.a().a(lb.c, $$2).a(lb.a, lb.a.c).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.c, dfx.a, dgh.a, la.a().a(lb.c, $$2).a(lb.a, lb.a.c).a(lb.b, lb.a.d).a(lb.d, true))
               .a(hb.f, dfx.a, dgh.e, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.e, dfx.a, dgh.e, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.d).a(lb.d, true))
               .a(hb.d, dfx.a, dgh.e, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.c, dfx.a, dgh.e, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.d, true))
               .a(hb.f, dfx.a, dgh.d, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.d, true))
               .a(hb.e, dfx.a, dgh.d, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.d, dfx.a, dgh.d, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.c, dfx.a, dgh.d, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.d).a(lb.d, true))
               .a(hb.f, dfx.a, dgh.c, la.a().a(lb.c, $$1).a(lb.a, lb.a.c).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.e, dfx.a, dgh.c, la.a().a(lb.c, $$1).a(lb.a, lb.a.c).a(lb.b, lb.a.d).a(lb.d, true))
               .a(hb.d, dfx.a, dgh.c, la.a().a(lb.c, $$1).a(lb.a, lb.a.c).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.c, dfx.a, dgh.c, la.a().a(lb.c, $$1).a(lb.a, lb.a.c).a(lb.d, true))
               .a(hb.f, dfx.a, dgh.b, la.a().a(lb.c, $$1).a(lb.a, lb.a.c).a(lb.d, true))
               .a(hb.e, dfx.a, dgh.b, la.a().a(lb.c, $$1).a(lb.a, lb.a.c).a(lb.b, lb.a.c).a(lb.d, true))
               .a(hb.d, dfx.a, dgh.b, la.a().a(lb.c, $$1).a(lb.a, lb.a.c).a(lb.b, lb.a.b).a(lb.d, true))
               .a(hb.c, dfx.a, dgh.b, la.a().a(lb.c, $$1).a(lb.a, lb.a.c).a(lb.b, lb.a.d).a(lb.d, true))
         );
   }

   private static ku c(csk $$0, aep $$1, aep $$2, aep $$3) {
      return kx.a($$0)
         .a(
            ky.a(dfo.R, dfo.af, dfo.u)
               .a(hb.c, dfx.b, false, la.a().a(lb.c, $$2))
               .a(hb.d, dfx.b, false, la.a().a(lb.c, $$2).a(lb.b, lb.a.c))
               .a(hb.f, dfx.b, false, la.a().a(lb.c, $$2).a(lb.b, lb.a.b))
               .a(hb.e, dfx.b, false, la.a().a(lb.c, $$2).a(lb.b, lb.a.d))
               .a(hb.c, dfx.a, false, la.a().a(lb.c, $$1))
               .a(hb.d, dfx.a, false, la.a().a(lb.c, $$1).a(lb.b, lb.a.c))
               .a(hb.f, dfx.a, false, la.a().a(lb.c, $$1).a(lb.b, lb.a.b))
               .a(hb.e, dfx.a, false, la.a().a(lb.c, $$1).a(lb.b, lb.a.d))
               .a(hb.c, dfx.b, true, la.a().a(lb.c, $$3))
               .a(hb.d, dfx.b, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.c))
               .a(hb.f, dfx.b, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.b))
               .a(hb.e, dfx.b, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.d))
               .a(hb.c, dfx.a, true, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.c))
               .a(hb.d, dfx.a, true, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.a))
               .a(hb.f, dfx.a, true, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.d))
               .a(hb.e, dfx.a, true, la.a().a(lb.c, $$3).a(lb.a, lb.a.c).a(lb.b, lb.a.b))
         );
   }

   private static ku d(csk $$0, aep $$1, aep $$2, aep $$3) {
      return kx.a($$0)
         .a(
            ky.a(dfo.R, dfo.af, dfo.u)
               .a(hb.c, dfx.b, false, la.a().a(lb.c, $$2))
               .a(hb.d, dfx.b, false, la.a().a(lb.c, $$2))
               .a(hb.f, dfx.b, false, la.a().a(lb.c, $$2))
               .a(hb.e, dfx.b, false, la.a().a(lb.c, $$2))
               .a(hb.c, dfx.a, false, la.a().a(lb.c, $$1))
               .a(hb.d, dfx.a, false, la.a().a(lb.c, $$1))
               .a(hb.f, dfx.a, false, la.a().a(lb.c, $$1))
               .a(hb.e, dfx.a, false, la.a().a(lb.c, $$1))
               .a(hb.c, dfx.b, true, la.a().a(lb.c, $$3))
               .a(hb.d, dfx.b, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.c))
               .a(hb.f, dfx.b, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.b))
               .a(hb.e, dfx.b, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.d))
               .a(hb.c, dfx.a, true, la.a().a(lb.c, $$3))
               .a(hb.d, dfx.a, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.c))
               .a(hb.f, dfx.a, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.b))
               .a(hb.e, dfx.a, true, la.a().a(lb.c, $$3).a(lb.b, lb.a.d))
         );
   }

   static kx c(csk $$0, aep $$1) {
      return kx.a($$0, la.a().a(lb.c, $$1));
   }

   private static ky f() {
      return ky.a(dfo.I).a(hb.a.b, la.a()).a(hb.a.c, la.a().a(lb.a, lb.a.b)).a(hb.a.a, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.b));
   }

   static ku a(csk $$0, li $$1, BiConsumer<aep, Supplier<JsonElement>> $$2) {
      aep $$3 = lh.f.a($$0, $$1, $$2);
      aep $$4 = lh.g.a($$0, $$1, $$2);
      aep $$5 = lh.h.a($$0, $$1, $$2);
      aep $$6 = lh.i.a($$0, $$1, $$2);
      return kx.a($$0, la.a().a(lb.c, $$6)).a(ky.a(dfo.I).a(hb.a.a, la.a().a(lb.c, $$3)).a(hb.a.b, la.a().a(lb.c, $$4)).a(hb.a.c, la.a().a(lb.c, $$5)));
   }

   static ku d(csk $$0, aep $$1) {
      return kx.a($$0, la.a().a(lb.c, $$1)).a(f());
   }

   private void e(csk $$0, aep $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(csk $$0, lk.a $$1) {
      aep $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(csk $$0, lk.a $$1) {
      aep $$2 = $$1.create($$0, this.c);
      this.b.accept(kx.a($$0, la.a().a(lb.c, $$2)).a(b()));
   }

   static ku d(csk $$0, aep $$1, aep $$2) {
      return kx.a($$0)
         .a(
            ky.a(dfo.I)
               .a(hb.a.b, la.a().a(lb.c, $$1))
               .a(hb.a.c, la.a().a(lb.c, $$2).a(lb.a, lb.a.b))
               .a(hb.a.a, la.a().a(lb.c, $$2).a(lb.a, lb.a.b).a(lb.b, lb.a.b))
         );
   }

   private void a(csk $$0, lk.a $$1, lk.a $$2) {
      aep $$3 = $$1.create($$0, this.c);
      aep $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aep a(csk $$0, String $$1, lg $$2, Function<aep, li> $$3) {
      return $$2.a($$0, $$1, $$3.apply(li.a($$0, $$1)), this.c);
   }

   static ku e(csk $$0, aep $$1, aep $$2) {
      return kx.a($$0).a(a(dfo.w, $$2, $$1));
   }

   static ku e(csk $$0, aep $$1, aep $$2, aep $$3) {
      return kx.a($$0).a(ky.a(dfo.bh).a(dgg.b, la.a().a(lb.c, $$1)).a(dgg.a, la.a().a(lb.c, $$2)).a(dgg.c, la.a().a(lb.c, $$3)));
   }

   public void a(csk $$0) {
      this.b($$0, lk.a);
   }

   public void b(csk $$0, lk.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(csk $$0, li $$1, lg $$2) {
      aep $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private kr.b h(csk $$0) {
      lk $$1 = this.g.getOrDefault($$0, lk.a.get($$0));
      return new kr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(csk $$0, csk $$1, csk $$2) {
      li $$3 = li.u($$0);
      aep $$4 = lh.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(csk $$0) {
      li $$1 = li.t($$0);
      aep $$2 = lh.t.a($$0, $$1, this.c);
      aep $$3 = lh.u.a($$0, $$1, this.c);
      aep $$4 = lh.v.a($$0, $$1, this.c);
      aep $$5 = lh.w.a($$0, $$1, this.c);
      aep $$6 = lh.x.a($$0, $$1, this.c);
      aep $$7 = lh.y.a($$0, $$1, this.c);
      aep $$8 = lh.z.a($$0, $$1, this.c);
      aep $$9 = lh.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(csk $$0) {
      li $$1 = li.b($$0);
      aep $$2 = lh.ai.a($$0, $$1, this.c);
      aep $$3 = lh.aj.a($$0, $$1, this.c);
      aep $$4 = lh.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(csk $$0) {
      li $$1 = li.b($$0);
      aep $$2 = lh.af.a($$0, $$1, this.c);
      aep $$3 = lh.ag.a($$0, $$1, this.c);
      aep $$4 = lh.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(csl.rC);
      aep $$0 = lf.a(csl.rC);
      aep $$1 = lf.a(csl.rC, "_partial_tilt");
      aep $$2 = lf.a(csl.rC, "_full_tilt");
      this.b
         .accept(
            kx.a(csl.rC)
               .a(b())
               .a(ky.a(dfo.bl).a(dgj.a, la.a().a(lb.c, $$0)).a(dgj.b, la.a().a(lb.c, $$0)).a(dgj.c, la.a().a(lb.c, $$1)).a(dgj.d, la.a().a(lb.c, $$2)))
         );
   }

   private kr.f l(csk $$0) {
      return new kr.f(li.n($$0));
   }

   private void m(csk $$0) {
      this.a($$0, $$0);
   }

   private void a(csk $$0, csk $$1) {
      this.b.accept(c($$0, lf.a($$1)));
   }

   private void a(csk $$0, kr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(csk $$0, kr.e $$1, li $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csk $$0, kr.e $$1) {
      li $$2 = li.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csk $$0, kr.e $$1, li $$2) {
      aep $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(csk $$0, kr.e $$1, dgb<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         ky $$4 = ky.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            li $$5 = li.c(li.a($$0, $$4x));
            aep $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return la.a().a(lb.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(kx.a($$0).a($$4));
      }
   }

   private void a(csk $$0, csk $$1, kr.e $$2) {
      this.a($$0, $$2);
      li $$3 = li.d($$0);
      aep $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(csk $$0, csk $$1) {
      lk $$2 = lk.o.get($$0);
      aep $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aep $$4 = lh.aA.a($$1, $$2.b(), this.c);
      this.b.accept(kx.a($$1, la.a().a(lb.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(csk $$0, csk $$1) {
      this.a($$0.k());
      li $$2 = li.h($$0);
      li $$3 = li.a($$0, $$1);
      aep $$4 = lh.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            kx.a($$1, la.a().a(lb.c, $$4))
               .a(ky.a(dfo.R).a(hb.e, la.a()).a(hb.d, la.a().a(lb.b, lb.a.d)).a(hb.c, la.a().a(lb.b, lb.a.b)).a(hb.f, la.a().a(lb.b, lb.a.c)))
         );
      this.b.accept(kx.a($$0).a(ky.a(dfo.av).a($$2x -> la.a().a(lb.c, lh.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      csk $$0 = csl.kC;
      this.a($$0.k());
      aep $$1 = lf.a($$0, "_top");
      aep $$2 = lf.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      csk $$0 = csl.kB;
      this.a($$0.k());
      ky $$1 = ky.a(cxx.b, dfo.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> la.a().a(lb.c, lf.a($$0, "_top_stage_" + $$1x));
            case b -> la.a().a(lb.c, lf.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(kx.a($$0).a($$1));
   }

   private void a(csk $$0, csk $$1, csk $$2, csk $$3, csk $$4, csk $$5, csk $$6, csk $$7) {
      this.a($$0, kr.e.b);
      this.a($$1, kr.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(csk $$0, kr.e $$1) {
      this.a($$0, "_top");
      aep $$2 = this.a($$0, "_top", $$1.a(), li::c);
      aep $$3 = this.a($$0, "_bottom", $$1.a(), li::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(csl.iD, "_front");
      aep $$0 = lf.a(csl.iD, "_top");
      aep $$1 = this.a(csl.iD, "_bottom", kr.e.b.a(), li::c);
      this.f(csl.iD, $$0, $$1);
   }

   private void k() {
      aep $$0 = this.a(csl.bx, "_top", lh.bi, li::a);
      aep $$1 = this.a(csl.bx, "_bottom", lh.bi, li::a);
      this.f(csl.bx, $$0, $$1);
   }

   private void l() {
      this.c(csl.rE);
      aep $$0 = lf.a(csl.rE, "_top");
      aep $$1 = lf.a(csl.rE, "_bottom");
      this.b.accept(kx.a(csl.rE).a(b()).a(ky.a(dfo.ae).a(dfu.b, la.a().a(lb.c, $$1)).a(dfu.a, la.a().a(lb.c, $$0))));
   }

   private void f(csk $$0, aep $$1, aep $$2) {
      this.b.accept(kx.a($$0).a(ky.a(dfo.ae).a(dfu.b, la.a().a(lb.c, $$2)).a(dfu.a, la.a().a(lb.c, $$1))));
   }

   private void n(csk $$0) {
      li $$1 = li.e($$0);
      li $$2 = li.e(li.a($$0, "_corner"));
      aep $$3 = lh.aq.a($$0, $$1, this.c);
      aep $$4 = lh.ar.a($$0, $$2, this.c);
      aep $$5 = lh.as.a($$0, $$1, this.c);
      aep $$6 = lh.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            kx.a($$0)
               .a(
                  ky.a(dfo.ag)
                     .a(dgc.a, la.a().a(lb.c, $$3))
                     .a(dgc.b, la.a().a(lb.c, $$3).a(lb.b, lb.a.b))
                     .a(dgc.c, la.a().a(lb.c, $$5).a(lb.b, lb.a.b))
                     .a(dgc.d, la.a().a(lb.c, $$6).a(lb.b, lb.a.b))
                     .a(dgc.e, la.a().a(lb.c, $$5))
                     .a(dgc.f, la.a().a(lb.c, $$6))
                     .a(dgc.g, la.a().a(lb.c, $$4))
                     .a(dgc.h, la.a().a(lb.c, $$4).a(lb.b, lb.a.b))
                     .a(dgc.i, la.a().a(lb.c, $$4).a(lb.b, lb.a.c))
                     .a(dgc.j, la.a().a(lb.c, $$4).a(lb.b, lb.a.d))
               )
         );
   }

   private void o(csk $$0) {
      aep $$1 = this.a($$0, "", lh.aq, li::e);
      aep $$2 = this.a($$0, "", lh.as, li::e);
      aep $$3 = this.a($$0, "", lh.at, li::e);
      aep $$4 = this.a($$0, "_on", lh.aq, li::e);
      aep $$5 = this.a($$0, "_on", lh.as, li::e);
      aep $$6 = this.a($$0, "_on", lh.at, li::e);
      ky $$7 = ky.a(dfo.w, dfo.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return la.a().a(lb.c, $$6x ? $$4 : $$1);
            case b:
               return la.a().a(lb.c, $$6x ? $$4 : $$1).a(lb.b, lb.a.b);
            case c:
               return la.a().a(lb.c, $$6x ? $$5 : $$2).a(lb.b, lb.a.b);
            case d:
               return la.a().a(lb.c, $$6x ? $$6 : $$3).a(lb.b, lb.a.b);
            case e:
               return la.a().a(lb.c, $$6x ? $$5 : $$2);
            case f:
               return la.a().a(lb.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(kx.a($$0).a($$7));
   }

   private kr.a a(aep $$0, csk $$1) {
      return new kr.a($$0, $$1);
   }

   private kr.a d(csk $$0, csk $$1) {
      return new kr.a(lf.a($$0), $$1);
   }

   private void a(csk $$0, cir $$1) {
      aep $$2 = lh.Y.a($$0, li.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(csk $$0, aep $$1) {
      aep $$2 = lh.Y.a($$0, li.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(csk $$0, csk $$1) {
      this.a($$0);
      aep $$2 = lk.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(csk $$0) {
      this.a($$0.k());
      aep $$1 = lk.j.create($$0, this.c);
      aep $$2 = lk.k.create($$0, this.c);
      aep $$3 = lk.l.create($$0, this.c);
      aep $$4 = lk.m.create($$0, this.c);
      this.b
         .accept(
            kw.a($$0)
               .a(kv.a().a(dfo.S, 1, 2, 3, 4).a(dfo.R, hb.c), la.a().a(lb.c, $$1))
               .a(kv.a().a(dfo.S, 1, 2, 3, 4).a(dfo.R, hb.f), la.a().a(lb.c, $$1).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.S, 1, 2, 3, 4).a(dfo.R, hb.d), la.a().a(lb.c, $$1).a(lb.b, lb.a.c))
               .a(kv.a().a(dfo.S, 1, 2, 3, 4).a(dfo.R, hb.e), la.a().a(lb.c, $$1).a(lb.b, lb.a.d))
               .a(kv.a().a(dfo.S, 2, 3, 4).a(dfo.R, hb.c), la.a().a(lb.c, $$2))
               .a(kv.a().a(dfo.S, 2, 3, 4).a(dfo.R, hb.f), la.a().a(lb.c, $$2).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.S, 2, 3, 4).a(dfo.R, hb.d), la.a().a(lb.c, $$2).a(lb.b, lb.a.c))
               .a(kv.a().a(dfo.S, 2, 3, 4).a(dfo.R, hb.e), la.a().a(lb.c, $$2).a(lb.b, lb.a.d))
               .a(kv.a().a(dfo.S, 3, 4).a(dfo.R, hb.c), la.a().a(lb.c, $$3))
               .a(kv.a().a(dfo.S, 3, 4).a(dfo.R, hb.f), la.a().a(lb.c, $$3).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.S, 3, 4).a(dfo.R, hb.d), la.a().a(lb.c, $$3).a(lb.b, lb.a.c))
               .a(kv.a().a(dfo.S, 3, 4).a(dfo.R, hb.e), la.a().a(lb.c, $$3).a(lb.b, lb.a.d))
               .a(kv.a().a(dfo.S, 4).a(dfo.R, hb.c), la.a().a(lb.c, $$4))
               .a(kv.a().a(dfo.S, 4).a(dfo.R, hb.f), la.a().a(lb.c, $$4).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.S, 4).a(dfo.R, hb.d), la.a().a(lb.c, $$4).a(lb.b, lb.a.c))
               .a(kv.a().a(dfo.S, 4).a(dfo.R, hb.e), la.a().a(lb.c, $$4).a(lb.b, lb.a.d))
         );
   }

   private void a(lk.a $$0, csk... $$1) {
      for (csk $$2 : $$1) {
         aep $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(lk.a $$0, csk... $$1) {
      for (csk $$2 : $$1) {
         aep $$3 = $$0.create($$2, this.c);
         this.b.accept(kx.a($$2, la.a().a(lb.c, $$3)).a(c()));
      }
   }

   private void f(csk $$0, csk $$1) {
      this.a($$0);
      li $$2 = li.b($$0, $$1);
      aep $$3 = lh.aG.a($$1, $$2, this.c);
      aep $$4 = lh.aH.a($$1, $$2, this.c);
      aep $$5 = lh.aI.a($$1, $$2, this.c);
      aep $$6 = lh.aE.a($$1, $$2, this.c);
      aep $$7 = lh.aF.a($$1, $$2, this.c);
      cir $$8 = $$1.k();
      lh.bv.a(lf.a($$8), li.F($$0), this.c);
      this.b
         .accept(
            kw.a($$1)
               .a(la.a().a(lb.c, $$3))
               .a(kv.a().a(dfo.L, true), la.a().a(lb.c, $$4))
               .a(kv.a().a(dfo.M, true), la.a().a(lb.c, $$4).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.N, true), la.a().a(lb.c, $$5))
               .a(kv.a().a(dfo.O, true), la.a().a(lb.c, $$5).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.L, false), la.a().a(lb.c, $$6))
               .a(kv.a().a(dfo.M, false), la.a().a(lb.c, $$7))
               .a(kv.a().a(dfo.N, false), la.a().a(lb.c, $$7).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.O, false), la.a().a(lb.c, $$6).a(lb.b, lb.a.d))
         );
   }

   private void q(csk $$0) {
      li $$1 = li.z($$0);
      aep $$2 = lh.aJ.a($$0, $$1, this.c);
      aep $$3 = this.a($$0, "_conditional", lh.aJ, $$1x -> $$1.c(lj.i, $$1x));
      this.b.accept(kx.a($$0).a(a(dfo.c, $$3, $$2)).a(e()));
   }

   private void r(csk $$0) {
      aep $$1 = lk.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<la> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> la.a().a(lb.c, lf.a(csl.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(csl.mZ);
      this.b
         .accept(
            kw.a(csl.mZ)
               .a(kv.a().a(dfo.aq, 0), this.a(0))
               .a(kv.a().a(dfo.aq, 1), this.a(1))
               .a(kv.a().a(dfo.bk, dfk.b), la.a().a(lb.c, lf.a(csl.mZ, "_small_leaves")))
               .a(kv.a().a(dfo.bk, dfk.c), la.a().a(lb.c, lf.a(csl.mZ, "_large_leaves")))
         );
   }

   private ky n() {
      return ky.a(dfo.P)
         .a(hb.a, la.a().a(lb.a, lb.a.c))
         .a(hb.b, la.a())
         .a(hb.c, la.a().a(lb.a, lb.a.b))
         .a(hb.d, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.c))
         .a(hb.e, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.d))
         .a(hb.f, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.b));
   }

   private void o() {
      aep $$0 = li.a(csl.nU, "_top_open");
      this.b
         .accept(
            kx.a(csl.nU)
               .a(this.n())
               .a(
                  ky.a(dfo.u)
                     .a(false, la.a().a(lb.c, lk.e.create(csl.nU, this.c)))
                     .a(true, la.a().a(lb.c, lk.e.get(csl.nU).a($$1 -> $$1.a(lj.f, $$0)).a(csl.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ky a(dgb<T> $$0, T $$1, aep $$2, aep $$3) {
      la $$4 = la.a().a(lb.c, $$2);
      la $$5 = la.a().a(lb.c, $$3);
      return ky.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(csk $$0, Function<csk, li> $$1) {
      li $$2 = $$1.apply($$0).b(lj.i, lj.c);
      li $$3 = $$2.c(lj.g, li.a($$0, "_front_honey"));
      aep $$4 = lh.o.a($$0, $$2, this.c);
      aep $$5 = lh.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(kx.a($$0).a(b()).a(a(dfo.aN, 5, $$5, $$4)));
   }

   private void a(csk $$0, dgb<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aep> $$3 = new Int2ObjectOpenHashMap();
         ky $$4 = ky.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aep $$5 = (aep)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, lh.aT, li::g));
            return la.a().a(lb.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(kx.a($$0).a($$4));
      }
   }

   private void p() {
      aep $$0 = lf.a(csl.od, "_floor");
      aep $$1 = lf.a(csl.od, "_ceiling");
      aep $$2 = lf.a(csl.od, "_wall");
      aep $$3 = lf.a(csl.od, "_between_walls");
      this.a(ciz.vs);
      this.b
         .accept(
            kx.a(csl.od)
               .a(
                  ky.a(dfo.R, dfo.V)
                     .a(hb.c, dfm.a, la.a().a(lb.c, $$0))
                     .a(hb.d, dfm.a, la.a().a(lb.c, $$0).a(lb.b, lb.a.c))
                     .a(hb.f, dfm.a, la.a().a(lb.c, $$0).a(lb.b, lb.a.b))
                     .a(hb.e, dfm.a, la.a().a(lb.c, $$0).a(lb.b, lb.a.d))
                     .a(hb.c, dfm.b, la.a().a(lb.c, $$1))
                     .a(hb.d, dfm.b, la.a().a(lb.c, $$1).a(lb.b, lb.a.c))
                     .a(hb.f, dfm.b, la.a().a(lb.c, $$1).a(lb.b, lb.a.b))
                     .a(hb.e, dfm.b, la.a().a(lb.c, $$1).a(lb.b, lb.a.d))
                     .a(hb.c, dfm.c, la.a().a(lb.c, $$2).a(lb.b, lb.a.d))
                     .a(hb.d, dfm.c, la.a().a(lb.c, $$2).a(lb.b, lb.a.b))
                     .a(hb.f, dfm.c, la.a().a(lb.c, $$2))
                     .a(hb.e, dfm.c, la.a().a(lb.c, $$2).a(lb.b, lb.a.c))
                     .a(hb.d, dfm.d, la.a().a(lb.c, $$3).a(lb.b, lb.a.b))
                     .a(hb.c, dfm.d, la.a().a(lb.c, $$3).a(lb.b, lb.a.d))
                     .a(hb.f, dfm.d, la.a().a(lb.c, $$3))
                     .a(hb.e, dfm.d, la.a().a(lb.c, $$3).a(lb.b, lb.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            kx.a(csl.nZ, la.a().a(lb.c, lf.a(csl.nZ)))
               .a(
                  ky.a(dfo.U, dfo.R)
                     .a(dfj.a, hb.c, la.a())
                     .a(dfj.a, hb.f, la.a().a(lb.b, lb.a.b))
                     .a(dfj.a, hb.d, la.a().a(lb.b, lb.a.c))
                     .a(dfj.a, hb.e, la.a().a(lb.b, lb.a.d))
                     .a(dfj.b, hb.c, la.a().a(lb.a, lb.a.b))
                     .a(dfj.b, hb.f, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.b))
                     .a(dfj.b, hb.d, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.c))
                     .a(dfj.b, hb.e, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.d))
                     .a(dfj.c, hb.d, la.a().a(lb.a, lb.a.c))
                     .a(dfj.c, hb.e, la.a().a(lb.a, lb.a.c).a(lb.b, lb.a.b))
                     .a(dfj.c, hb.c, la.a().a(lb.a, lb.a.c).a(lb.b, lb.a.c))
                     .a(dfj.c, hb.f, la.a().a(lb.a, lb.a.c).a(lb.b, lb.a.d))
               )
         );
   }

   private void d(csk $$0, lk.a $$1) {
      aep $$2 = $$1.create($$0, this.c);
      aep $$3 = li.a($$0, "_front_on");
      aep $$4 = $$1.get($$0).a($$1x -> $$1x.a(lj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(kx.a($$0).a(a(dfo.r, $$4, $$2)).a(b()));
   }

   private void a(csk... $$0) {
      aep $$1 = lf.a("campfire_off");

      for (csk $$2 : $$0) {
         aep $$3 = lh.ba.a($$2, li.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(kx.a($$2).a(a(dfo.r, $$3, $$1)).a(c()));
      }
   }

   private void s(csk $$0) {
      aep $$1 = lh.br.a($$0, li.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(csk $$0) {
      aep $$1;
      if ($$0 == csl.si) {
         $$1 = lh.bt.a($$0, li.m($$0), this.c);
      } else {
         $$1 = lh.bs.a($$0, li.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      li $$0 = li.a(li.G(csl.cl), li.G(csl.n));
      aep $$1 = lh.i.a(csl.cl, $$0, this.c);
      this.b.accept(c(csl.cl, $$1));
   }

   private void s() {
      this.a(ciz.ll);
      this.b
         .accept(
            kw.a(csl.cw)
               .a(
                  kv.b(
                     kv.a().a(dfo.ab, dgd.c).a(dfo.aa, dgd.c).a(dfo.ac, dgd.c).a(dfo.ad, dgd.c),
                     kv.a().a(dfo.ab, dgd.b, dgd.a).a(dfo.aa, dgd.b, dgd.a),
                     kv.a().a(dfo.aa, dgd.b, dgd.a).a(dfo.ac, dgd.b, dgd.a),
                     kv.a().a(dfo.ac, dgd.b, dgd.a).a(dfo.ad, dgd.b, dgd.a),
                     kv.a().a(dfo.ad, dgd.b, dgd.a).a(dfo.ab, dgd.b, dgd.a)
                  ),
                  la.a().a(lb.c, lf.a("redstone_dust_dot"))
               )
               .a(kv.a().a(dfo.ab, dgd.b, dgd.a), la.a().a(lb.c, lf.a("redstone_dust_side0")))
               .a(kv.a().a(dfo.ac, dgd.b, dgd.a), la.a().a(lb.c, lf.a("redstone_dust_side_alt0")))
               .a(kv.a().a(dfo.aa, dgd.b, dgd.a), la.a().a(lb.c, lf.a("redstone_dust_side_alt1")).a(lb.b, lb.a.d))
               .a(kv.a().a(dfo.ad, dgd.b, dgd.a), la.a().a(lb.c, lf.a("redstone_dust_side1")).a(lb.b, lb.a.d))
               .a(kv.a().a(dfo.ab, dgd.a), la.a().a(lb.c, lf.a("redstone_dust_up")))
               .a(kv.a().a(dfo.aa, dgd.a), la.a().a(lb.c, lf.a("redstone_dust_up")).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.ac, dgd.a), la.a().a(lb.c, lf.a("redstone_dust_up")).a(lb.b, lb.a.c))
               .a(kv.a().a(dfo.ad, dgd.a), la.a().a(lb.c, lf.a("redstone_dust_up")).a(lb.b, lb.a.d))
         );
   }

   private void t() {
      this.a(ciz.lp);
      this.b
         .accept(
            kx.a(csl.gY)
               .a(c())
               .a(
                  ky.a(dfo.bd, dfo.w)
                     .a(dfr.a, false, la.a().a(lb.c, lf.a(csl.gY)))
                     .a(dfr.a, true, la.a().a(lb.c, lf.a(csl.gY, "_on")))
                     .a(dfr.b, false, la.a().a(lb.c, lf.a(csl.gY, "_subtract")))
                     .a(dfr.b, true, la.a().a(lb.c, lf.a(csl.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      li $$0 = li.a(csl.jR);
      li $$1 = li.a(li.a(csl.jE, "_side"), $$0.a(lj.f));
      aep $$2 = lh.Z.a(csl.jE, $$1, this.c);
      aep $$3 = lh.aa.a(csl.jE, $$1, this.c);
      aep $$4 = lh.i.b(csl.jE, "_double", $$1, this.c);
      this.b.accept(e(csl.jE, $$2, $$3, $$4));
      this.b.accept(c(csl.jR, lh.c.a(csl.jR, $$0, this.c)));
   }

   private void v() {
      this.a(ciz.rB);
      this.b
         .accept(
            kw.a(csl.fs)
               .a(la.a().a(lb.c, li.G(csl.fs)))
               .a(kv.a().a(dfo.k, true), la.a().a(lb.c, li.a(csl.fs, "_bottle0")))
               .a(kv.a().a(dfo.l, true), la.a().a(lb.c, li.a(csl.fs, "_bottle1")))
               .a(kv.a().a(dfo.m, true), la.a().a(lb.c, li.a(csl.fs, "_bottle2")))
               .a(kv.a().a(dfo.k, false), la.a().a(lb.c, li.a(csl.fs, "_empty0")))
               .a(kv.a().a(dfo.l, false), la.a().a(lb.c, li.a(csl.fs, "_empty1")))
               .a(kv.a().a(dfo.m, false), la.a().a(lb.c, li.a(csl.fs, "_empty2")))
         );
   }

   private void u(csk $$0) {
      aep $$1 = lh.bn.a($$0, li.b($$0), this.c);
      aep $$2 = lf.a("mushroom_block_inside");
      this.b
         .accept(
            kw.a($$0)
               .a(kv.a().a(dfo.L, true), la.a().a(lb.c, $$1))
               .a(kv.a().a(dfo.M, true), la.a().a(lb.c, $$1).a(lb.b, lb.a.b).a(lb.d, true))
               .a(kv.a().a(dfo.N, true), la.a().a(lb.c, $$1).a(lb.b, lb.a.c).a(lb.d, true))
               .a(kv.a().a(dfo.O, true), la.a().a(lb.c, $$1).a(lb.b, lb.a.d).a(lb.d, true))
               .a(kv.a().a(dfo.J, true), la.a().a(lb.c, $$1).a(lb.a, lb.a.d).a(lb.d, true))
               .a(kv.a().a(dfo.K, true), la.a().a(lb.c, $$1).a(lb.a, lb.a.b).a(lb.d, true))
               .a(kv.a().a(dfo.L, false), la.a().a(lb.c, $$2))
               .a(kv.a().a(dfo.M, false), la.a().a(lb.c, $$2).a(lb.b, lb.a.b).a(lb.d, false))
               .a(kv.a().a(dfo.N, false), la.a().a(lb.c, $$2).a(lb.b, lb.a.c).a(lb.d, false))
               .a(kv.a().a(dfo.O, false), la.a().a(lb.c, $$2).a(lb.b, lb.a.d).a(lb.d, false))
               .a(kv.a().a(dfo.J, false), la.a().a(lb.c, $$2).a(lb.a, lb.a.d).a(lb.d, false))
               .a(kv.a().a(dfo.K, false), la.a().a(lb.c, $$2).a(lb.a, lb.a.b).a(lb.d, false))
         );
      this.a($$0, lk.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(ciz.qN);
      this.b
         .accept(
            kx.a(csl.eh)
               .a(
                  ky.a(dfo.ay)
                     .a(0, la.a().a(lb.c, lf.a(csl.eh)))
                     .a(1, la.a().a(lb.c, lf.a(csl.eh, "_slice1")))
                     .a(2, la.a().a(lb.c, lf.a(csl.eh, "_slice2")))
                     .a(3, la.a().a(lb.c, lf.a(csl.eh, "_slice3")))
                     .a(4, la.a().a(lb.c, lf.a(csl.eh, "_slice4")))
                     .a(5, la.a().a(lb.c, lf.a(csl.eh, "_slice5")))
                     .a(6, la.a().a(lb.c, lf.a(csl.eh, "_slice6")))
               )
         );
   }

   private void x() {
      li $$0 = new li()
         .a(lj.c, li.a(csl.nX, "_side3"))
         .a(lj.o, li.G(csl.t))
         .a(lj.n, li.a(csl.nX, "_top"))
         .a(lj.j, li.a(csl.nX, "_side3"))
         .a(lj.l, li.a(csl.nX, "_side3"))
         .a(lj.k, li.a(csl.nX, "_side1"))
         .a(lj.m, li.a(csl.nX, "_side2"));
      this.b.accept(c(csl.nX, lh.a.a(csl.nX, $$0, this.c)));
   }

   private void y() {
      li $$0 = new li()
         .a(lj.c, li.a(csl.ob, "_front"))
         .a(lj.o, li.a(csl.ob, "_bottom"))
         .a(lj.n, li.a(csl.ob, "_top"))
         .a(lj.j, li.a(csl.ob, "_front"))
         .a(lj.k, li.a(csl.ob, "_front"))
         .a(lj.l, li.a(csl.ob, "_side"))
         .a(lj.m, li.a(csl.ob, "_side"));
      this.b.accept(c(csl.ob, lh.a.a(csl.ob, $$0, this.c)));
   }

   private void a(csk $$0, csk $$1, BiFunction<csk, csk, li> $$2) {
      li $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, lh.a.a($$0, $$3, this.c)));
   }

   public void b(csk $$0) {
      li $$1 = new li()
         .a(lj.c, li.a($$0, "_particle"))
         .a(lj.o, li.a($$0, "_down"))
         .a(lj.n, li.a($$0, "_up"))
         .a(lj.j, li.a($$0, "_north"))
         .a(lj.k, li.a($$0, "_south"))
         .a(lj.l, li.a($$0, "_east"))
         .a(lj.m, li.a($$0, "_west"));
      this.b.accept(c($$0, lh.a.a($$0, $$1, this.c)));
   }

   private void z() {
      li $$0 = li.k(csl.dV);
      this.b.accept(c(csl.dV, lf.a(csl.dV)));
      this.a(csl.ef, $$0);
      this.a(csl.eg, $$0);
   }

   private void a(csk $$0, li $$1) {
      aep $$2 = lh.n.a($$0, $$1.c(lj.g, li.G($$0)), this.c);
      this.b.accept(kx.a($$0, la.a().a(lb.c, $$2)).a(b()));
   }

   private void A() {
      this.a(ciz.rC);
      this.m(csl.ft);
      this.b.accept(c(csl.fv, lh.bq.a(csl.fv, li.j(li.a(csl.H, "_still")), this.c)));
      this.b
         .accept(
            kx.a(csl.fu)
               .a(
                  ky.a(cwq.e)
                     .a(1, la.a().a(lb.c, lh.bo.a(csl.fu, "_level1", li.j(li.a(csl.G, "_still")), this.c)))
                     .a(2, la.a().a(lb.c, lh.bp.a(csl.fu, "_level2", li.j(li.a(csl.G, "_still")), this.c)))
                     .a(3, la.a().a(lb.c, lh.bq.a(csl.fu, "_full", li.j(li.a(csl.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            kx.a(csl.fw)
               .a(
                  ky.a(cwq.e)
                     .a(1, la.a().a(lb.c, lh.bo.a(csl.fw, "_level1", li.j(li.G(csl.qC)), this.c)))
                     .a(2, la.a().a(lb.c, lh.bp.a(csl.fw, "_level2", li.j(li.G(csl.qC)), this.c)))
                     .a(3, la.a().a(lb.c, lh.bq.a(csl.fw, "_full", li.j(li.G(csl.qC)), this.c)))
               )
         );
   }

   private void B() {
      li $$0 = li.b(csl.kv);
      aep $$1 = lh.aC.a(csl.kv, $$0, this.c);
      aep $$2 = this.a(csl.kv, "_dead", lh.aC, $$1x -> $$0.c(lj.b, $$1x));
      this.b.accept(kx.a(csl.kv).a(a(dfo.au, 5, $$2, $$1)));
   }

   private void v(csk $$0) {
      li $$1 = new li().a(lj.f, li.a(csl.cD, "_top")).a(lj.i, li.a(csl.cD, "_side")).a(lj.g, li.a($$0, "_front"));
      li $$2 = new li().a(lj.i, li.a(csl.cD, "_top")).a(lj.g, li.a($$0, "_front_vertical"));
      aep $$3 = lh.n.a($$0, $$1, this.c);
      aep $$4 = lh.p.a($$0, $$2, this.c);
      this.b
         .accept(
            kx.a($$0)
               .a(
                  ky.a(dfo.P)
                     .a(hb.a, la.a().a(lb.c, $$4).a(lb.a, lb.a.c))
                     .a(hb.b, la.a().a(lb.c, $$4))
                     .a(hb.c, la.a().a(lb.c, $$3))
                     .a(hb.f, la.a().a(lb.c, $$3).a(lb.b, lb.a.b))
                     .a(hb.d, la.a().a(lb.c, $$3).a(lb.b, lb.a.c))
                     .a(hb.e, la.a().a(lb.c, $$3).a(lb.b, lb.a.d))
               )
         );
   }

   private void C() {
      aep $$0 = lf.a(csl.fy);
      aep $$1 = lf.a(csl.fy, "_filled");
      this.b.accept(kx.a(csl.fy).a(ky.a(dfo.h).a(false, la.a().a(lb.c, $$0)).a(true, la.a().a(lb.c, $$1))).a(c()));
   }

   private void D() {
      aep $$0 = lf.a(csl.ku, "_side");
      aep $$1 = lf.a(csl.ku, "_noside");
      aep $$2 = lf.a(csl.ku, "_noside1");
      aep $$3 = lf.a(csl.ku, "_noside2");
      aep $$4 = lf.a(csl.ku, "_noside3");
      this.b
         .accept(
            kw.a(csl.ku)
               .a(kv.a().a(dfo.L, true), la.a().a(lb.c, $$0))
               .a(kv.a().a(dfo.M, true), la.a().a(lb.c, $$0).a(lb.b, lb.a.b).a(lb.d, true))
               .a(kv.a().a(dfo.N, true), la.a().a(lb.c, $$0).a(lb.b, lb.a.c).a(lb.d, true))
               .a(kv.a().a(dfo.O, true), la.a().a(lb.c, $$0).a(lb.b, lb.a.d).a(lb.d, true))
               .a(kv.a().a(dfo.J, true), la.a().a(lb.c, $$0).a(lb.a, lb.a.d).a(lb.d, true))
               .a(kv.a().a(dfo.K, true), la.a().a(lb.c, $$0).a(lb.a, lb.a.b).a(lb.d, true))
               .a(kv.a().a(dfo.L, false), la.a().a(lb.c, $$1).a(lb.e, 2), la.a().a(lb.c, $$2), la.a().a(lb.c, $$3), la.a().a(lb.c, $$4))
               .a(
                  kv.a().a(dfo.M, false),
                  la.a().a(lb.c, $$2).a(lb.b, lb.a.b).a(lb.d, true),
                  la.a().a(lb.c, $$3).a(lb.b, lb.a.b).a(lb.d, true),
                  la.a().a(lb.c, $$4).a(lb.b, lb.a.b).a(lb.d, true),
                  la.a().a(lb.c, $$1).a(lb.e, 2).a(lb.b, lb.a.b).a(lb.d, true)
               )
               .a(
                  kv.a().a(dfo.N, false),
                  la.a().a(lb.c, $$3).a(lb.b, lb.a.c).a(lb.d, true),
                  la.a().a(lb.c, $$4).a(lb.b, lb.a.c).a(lb.d, true),
                  la.a().a(lb.c, $$1).a(lb.e, 2).a(lb.b, lb.a.c).a(lb.d, true),
                  la.a().a(lb.c, $$2).a(lb.b, lb.a.c).a(lb.d, true)
               )
               .a(
                  kv.a().a(dfo.O, false),
                  la.a().a(lb.c, $$4).a(lb.b, lb.a.d).a(lb.d, true),
                  la.a().a(lb.c, $$1).a(lb.e, 2).a(lb.b, lb.a.d).a(lb.d, true),
                  la.a().a(lb.c, $$2).a(lb.b, lb.a.d).a(lb.d, true),
                  la.a().a(lb.c, $$3).a(lb.b, lb.a.d).a(lb.d, true)
               )
               .a(
                  kv.a().a(dfo.J, false),
                  la.a().a(lb.c, $$1).a(lb.e, 2).a(lb.a, lb.a.d).a(lb.d, true),
                  la.a().a(lb.c, $$4).a(lb.a, lb.a.d).a(lb.d, true),
                  la.a().a(lb.c, $$2).a(lb.a, lb.a.d).a(lb.d, true),
                  la.a().a(lb.c, $$3).a(lb.a, lb.a.d).a(lb.d, true)
               )
               .a(
                  kv.a().a(dfo.K, false),
                  la.a().a(lb.c, $$4).a(lb.a, lb.a.b).a(lb.d, true),
                  la.a().a(lb.c, $$3).a(lb.a, lb.a.b).a(lb.d, true),
                  la.a().a(lb.c, $$2).a(lb.a, lb.a.b).a(lb.d, true),
                  la.a().a(lb.c, $$1).a(lb.e, 2).a(lb.a, lb.a.b).a(lb.d, true)
               )
         );
   }

   private void E() {
      this.b
         .accept(
            kw.a(csl.pc)
               .a(la.a().a(lb.c, li.G(csl.pc)))
               .a(kv.a().a(dfo.aL, 1), la.a().a(lb.c, li.a(csl.pc, "_contents1")))
               .a(kv.a().a(dfo.aL, 2), la.a().a(lb.c, li.a(csl.pc, "_contents2")))
               .a(kv.a().a(dfo.aL, 3), la.a().a(lb.c, li.a(csl.pc, "_contents3")))
               .a(kv.a().a(dfo.aL, 4), la.a().a(lb.c, li.a(csl.pc, "_contents4")))
               .a(kv.a().a(dfo.aL, 5), la.a().a(lb.c, li.a(csl.pc, "_contents5")))
               .a(kv.a().a(dfo.aL, 6), la.a().a(lb.c, li.a(csl.pc, "_contents6")))
               .a(kv.a().a(dfo.aL, 7), la.a().a(lb.c, li.a(csl.pc, "_contents7")))
               .a(kv.a().a(dfo.aL, 8), la.a().a(lb.c, li.a(csl.pc, "_contents_ready")))
         );
   }

   private void w(csk $$0) {
      this.c($$0);
      this.b.accept(kx.a($$0, la.a().a(lb.c, lh.am.a($$0, li.c($$0), this.c))).a(this.n()));
   }

   private void F() {
      this.w(csl.qy);
      this.w(csl.qx);
      this.w(csl.qw);
      this.w(csl.qv);
   }

   private void G() {
      this.c(csl.rs);
      ky.b<hb, dfv> $$0 = ky.a(dfo.bm, dfo.bn);

      for (dfv $$1 : dfv.values()) {
         $$0.a(hb.b, $$1, this.a(hb.b, $$1));
      }

      for (dfv $$2 : dfv.values()) {
         $$0.a(hb.a, $$2, this.a(hb.a, $$2));
      }

      this.b.accept(kx.a(csl.rs).a($$0));
   }

   private la a(hb $$0, dfv $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      li $$3 = li.c(li.a(csl.rs, $$2));
      return la.a().a(lb.c, lh.al.a(csl.rs, $$2, $$3, this.c));
   }

   private void x(csk $$0) {
      li $$1 = new li().a(lj.e, li.G(csl.dW)).a(lj.f, li.G($$0)).a(lj.i, li.a($$0, "_side"));
      this.b.accept(c($$0, lh.m.a($$0, $$1, this.c)));
   }

   private void H() {
      aep $$0 = li.a(csl.gZ, "_side");
      li $$1 = new li().a(lj.f, li.a(csl.gZ, "_top")).a(lj.i, $$0);
      li $$2 = new li().a(lj.f, li.a(csl.gZ, "_inverted_top")).a(lj.i, $$0);
      this.b
         .accept(
            kx.a(csl.gZ)
               .a(ky.a(dfo.p).a(false, la.a().a(lb.c, lh.aD.a(csl.gZ, $$1, this.c))).a(true, la.a().a(lb.c, lh.aD.a(lf.a(csl.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(csk $$0) {
      this.b.accept(kx.a($$0, la.a().a(lb.c, lf.a($$0))).a(this.n()));
   }

   private void I() {
      csk $$0 = csl.rr;
      aep $$1 = lf.a($$0, "_on");
      aep $$2 = lf.a($$0);
      this.b.accept(kx.a($$0, la.a().a(lb.c, lf.a($$0))).a(this.n()).a(a(dfo.w, $$1, $$2)));
   }

   private void J() {
      li $$0 = new li().a(lj.B, li.G(csl.j)).a(lj.f, li.G(csl.cC));
      li $$1 = new li().a(lj.B, li.G(csl.j)).a(lj.f, li.a(csl.cC, "_moist"));
      aep $$2 = lh.aU.a(csl.cC, $$0, this.c);
      aep $$3 = lh.aU.a(li.a(csl.cC, "_moist"), $$1, this.c);
      this.b.accept(kx.a(csl.cC).a(a(dfo.aQ, 7, $$3, $$2)));
   }

   private List<aep> z(csk $$0) {
      aep $$1 = lh.aV.a(lf.a($$0, "_floor0"), li.v($$0), this.c);
      aep $$2 = lh.aV.a(lf.a($$0, "_floor1"), li.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aep> A(csk $$0) {
      aep $$1 = lh.aW.a(lf.a($$0, "_side0"), li.v($$0), this.c);
      aep $$2 = lh.aW.a(lf.a($$0, "_side1"), li.w($$0), this.c);
      aep $$3 = lh.aX.a(lf.a($$0, "_side_alt0"), li.v($$0), this.c);
      aep $$4 = lh.aX.a(lf.a($$0, "_side_alt1"), li.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aep> B(csk $$0) {
      aep $$1 = lh.aY.a(lf.a($$0, "_up0"), li.v($$0), this.c);
      aep $$2 = lh.aY.a(lf.a($$0, "_up1"), li.w($$0), this.c);
      aep $$3 = lh.aZ.a(lf.a($$0, "_up_alt0"), li.v($$0), this.c);
      aep $$4 = lh.aZ.a(lf.a($$0, "_up_alt1"), li.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<la> a(List<aep> $$0, UnaryOperator<la> $$1) {
      return $$0.stream().map($$0x -> la.a().a(lb.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void K() {
      kv $$0 = kv.a().a(dfo.L, false).a(dfo.M, false).a(dfo.N, false).a(dfo.O, false).a(dfo.J, false);
      List<aep> $$1 = this.z(csl.cr);
      List<aep> $$2 = this.A(csl.cr);
      List<aep> $$3 = this.B(csl.cr);
      this.b
         .accept(
            kw.a(csl.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(kv.b(kv.a().a(dfo.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(kv.b(kv.a().a(dfo.M, true), $$0), a($$2, $$0x -> $$0x.a(lb.b, lb.a.b)))
               .a(kv.b(kv.a().a(dfo.N, true), $$0), a($$2, $$0x -> $$0x.a(lb.b, lb.a.c)))
               .a(kv.b(kv.a().a(dfo.O, true), $$0), a($$2, $$0x -> $$0x.a(lb.b, lb.a.d)))
               .a(kv.a().a(dfo.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void L() {
      List<aep> $$0 = this.z(csl.cs);
      List<aep> $$1 = this.A(csl.cs);
      this.b
         .accept(
            kw.a(csl.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(lb.b, lb.a.b)))
               .a(a($$1, $$0x -> $$0x.a(lb.b, lb.a.c)))
               .a(a($$1, $$0x -> $$0x.a(lb.b, lb.a.d)))
         );
   }

   private void C(csk $$0) {
      aep $$1 = lk.s.create($$0, this.c);
      aep $$2 = lk.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(kx.a($$0).a(a(dfo.j, $$2, $$1)));
   }

   private void M() {
      li $$0 = li.a(li.a(csl.ad, "_side"), li.a(csl.ad, "_top"));
      aep $$1 = lh.i.a(csl.ad, $$0, this.c);
      this.b.accept(d(csl.ad, $$1));
   }

   private void N() {
      this.a(ciz.Q);
      csk $$0 = csl.E;
      ky.b<Boolean, Integer> $$1 = ky.a(cxc.c, cxc.a);
      aep $$2 = lf.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aep $$4 = lf.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, la.a().a(lb.c, $$4));
         $$1.a(false, $$3, la.a().a(lb.c, $$2));
      }

      this.b.accept(kx.a(csl.E).a($$1));
   }

   private void O() {
      this.b
         .accept(
            kx.a(csl.kI)
               .a(
                  ky.a(dfo.as)
                     .a(0, la.a().a(lb.c, this.a(csl.kI, "_0", lh.c, li::b)))
                     .a(1, la.a().a(lb.c, this.a(csl.kI, "_1", lh.c, li::b)))
                     .a(2, la.a().a(lb.c, this.a(csl.kI, "_2", lh.c, li::b)))
                     .a(3, la.a().a(lb.c, this.a(csl.kI, "_3", lh.c, li::b)))
               )
         );
   }

   private void P() {
      aep $$0 = li.G(csl.j);
      li $$1 = new li().a(lj.e, $$0).b(lj.e, lj.c).a(lj.f, li.a(csl.i, "_top")).a(lj.i, li.a(csl.i, "_snow"));
      la $$2 = la.a().a(lb.c, lh.m.a(csl.i, "_snow", $$1, this.c));
      this.a(csl.i, lf.a(csl.i), $$2);
      aep $$3 = lk.e.get(csl.fl).a($$1x -> $$1x.a(lj.e, $$0)).a(csl.fl, this.c);
      this.a(csl.fl, $$3, $$2);
      aep $$4 = lk.e.get(csl.l).a($$1x -> $$1x.a(lj.e, $$0)).a(csl.l, this.c);
      this.a(csl.l, $$4, $$2);
   }

   private void a(csk $$0, aep $$1, la $$2) {
      List<la> $$3 = Arrays.asList(a($$1));
      this.b.accept(kx.a($$0).a(ky.a(dfo.z).a(true, $$2).a(false, $$3)));
   }

   private void Q() {
      this.a(ciz.qt);
      this.b
         .accept(
            kx.a(csl.fC)
               .a(
                  ky.a(dfo.ar)
                     .a(0, la.a().a(lb.c, lf.a(csl.fC, "_stage0")))
                     .a(1, la.a().a(lb.c, lf.a(csl.fC, "_stage1")))
                     .a(2, la.a().a(lb.c, lf.a(csl.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void R() {
      this.b.accept(b(csl.kE, lf.a(csl.kE)));
   }

   private void g(csk $$0, csk $$1) {
      li $$2 = li.b($$1);
      aep $$3 = lh.W.a($$0, $$2, this.c);
      aep $$4 = lh.X.a($$0, $$2, this.c);
      this.b.accept(kx.a($$0).a(a(dfo.aT, 1, $$4, $$3)));
   }

   private void S() {
      aep $$0 = lf.a(csl.hc);
      aep $$1 = lf.a(csl.hc, "_side");
      this.a(ciz.lv);
      this.b
         .accept(
            kx.a(csl.hc)
               .a(
                  ky.a(dfo.Q)
                     .a(hb.a, la.a().a(lb.c, $$0))
                     .a(hb.c, la.a().a(lb.c, $$1))
                     .a(hb.f, la.a().a(lb.c, $$1).a(lb.b, lb.a.b))
                     .a(hb.d, la.a().a(lb.c, $$1).a(lb.b, lb.a.c))
                     .a(hb.e, la.a().a(lb.c, $$1).a(lb.b, lb.a.d))
               )
         );
   }

   private void h(csk $$0, csk $$1) {
      aep $$2 = lf.a($$0);
      this.b.accept(kx.a($$1, la.a().a(lb.c, $$2)));
      this.a($$1, $$2);
   }

   private void T() {
      aep $$0 = lf.a(csl.eX, "_post_ends");
      aep $$1 = lf.a(csl.eX, "_post");
      aep $$2 = lf.a(csl.eX, "_cap");
      aep $$3 = lf.a(csl.eX, "_cap_alt");
      aep $$4 = lf.a(csl.eX, "_side");
      aep $$5 = lf.a(csl.eX, "_side_alt");
      this.b
         .accept(
            kw.a(csl.eX)
               .a(la.a().a(lb.c, $$0))
               .a(kv.a().a(dfo.L, false).a(dfo.M, false).a(dfo.N, false).a(dfo.O, false), la.a().a(lb.c, $$1))
               .a(kv.a().a(dfo.L, true).a(dfo.M, false).a(dfo.N, false).a(dfo.O, false), la.a().a(lb.c, $$2))
               .a(kv.a().a(dfo.L, false).a(dfo.M, true).a(dfo.N, false).a(dfo.O, false), la.a().a(lb.c, $$2).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.L, false).a(dfo.M, false).a(dfo.N, true).a(dfo.O, false), la.a().a(lb.c, $$3))
               .a(kv.a().a(dfo.L, false).a(dfo.M, false).a(dfo.N, false).a(dfo.O, true), la.a().a(lb.c, $$3).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.L, true), la.a().a(lb.c, $$4))
               .a(kv.a().a(dfo.M, true), la.a().a(lb.c, $$4).a(lb.b, lb.a.b))
               .a(kv.a().a(dfo.N, true), la.a().a(lb.c, $$5))
               .a(kv.a().a(dfo.O, true), la.a().a(lb.c, $$5).a(lb.b, lb.a.b))
         );
      this.d(csl.eX);
   }

   private void D(csk $$0) {
      this.b.accept(kx.a($$0, la.a().a(lb.c, lf.a($$0))).a(b()));
   }

   private void U() {
      aep $$0 = lf.a(csl.dw);
      aep $$1 = lf.a(csl.dw, "_on");
      this.d(csl.dw);
      this.b
         .accept(
            kx.a(csl.dw)
               .a(a(dfo.w, $$0, $$1))
               .a(
                  ky.a(dfo.U, dfo.R)
                     .a(dfj.c, hb.c, la.a().a(lb.a, lb.a.c).a(lb.b, lb.a.c))
                     .a(dfj.c, hb.f, la.a().a(lb.a, lb.a.c).a(lb.b, lb.a.d))
                     .a(dfj.c, hb.d, la.a().a(lb.a, lb.a.c))
                     .a(dfj.c, hb.e, la.a().a(lb.a, lb.a.c).a(lb.b, lb.a.b))
                     .a(dfj.a, hb.c, la.a())
                     .a(dfj.a, hb.f, la.a().a(lb.b, lb.a.b))
                     .a(dfj.a, hb.d, la.a().a(lb.b, lb.a.c))
                     .a(dfj.a, hb.e, la.a().a(lb.b, lb.a.d))
                     .a(dfj.b, hb.c, la.a().a(lb.a, lb.a.b))
                     .a(dfj.b, hb.f, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.b))
                     .a(dfj.b, hb.d, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.c))
                     .a(dfj.b, hb.e, la.a().a(lb.a, lb.a.b).a(lb.b, lb.a.d))
               )
         );
   }

   private void V() {
      this.d(csl.fm);
      this.b.accept(b(csl.fm, lf.a(csl.fm)));
   }

   private void W() {
      this.d(csl.sm);
      this.b.accept(c(csl.sm, lf.a(csl.sm)));
   }

   private void X() {
      this.b.accept(kx.a(csl.ee).a(ky.a(dfo.H).a(hb.a.a, la.a().a(lb.c, lf.a(csl.ee, "_ns"))).a(hb.a.c, la.a().a(lb.c, lf.a(csl.ee, "_ew")))));
   }

   private void Y() {
      aep $$0 = lk.a.create(csl.dW, this.c);
      this.b
         .accept(
            kx.a(
               csl.dW,
               la.a().a(lb.c, $$0),
               la.a().a(lb.c, $$0).a(lb.a, lb.a.b),
               la.a().a(lb.c, $$0).a(lb.a, lb.a.c),
               la.a().a(lb.c, $$0).a(lb.a, lb.a.d),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.b),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.b).a(lb.a, lb.a.b),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.b).a(lb.a, lb.a.c),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.b).a(lb.a, lb.a.d),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.c),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.c).a(lb.a, lb.a.b),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.c).a(lb.a, lb.a.c),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.c).a(lb.a, lb.a.d),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.d),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.d).a(lb.a, lb.a.b),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.d).a(lb.a, lb.a.c),
               la.a().a(lb.c, $$0).a(lb.b, lb.a.d).a(lb.a, lb.a.d)
            )
         );
   }

   private void Z() {
      aep $$0 = lf.a(csl.kO);
      aep $$1 = lf.a(csl.kO, "_on");
      this.b.accept(kx.a(csl.kO).a(a(dfo.w, $$1, $$0)).a(e()));
   }

   private void aa() {
      li $$0 = new li().a(lj.e, li.a(csl.by, "_bottom")).a(lj.i, li.a(csl.by, "_side"));
      aep $$1 = li.a(csl.by, "_top_sticky");
      aep $$2 = li.a(csl.by, "_top");
      li $$3 = $$0.c(lj.E, $$1);
      li $$4 = $$0.c(lj.E, $$2);
      aep $$5 = lf.a(csl.by, "_base");
      this.a(csl.by, $$5, $$4);
      this.a(csl.br, $$5, $$3);
      aep $$6 = lh.m.a(csl.by, "_inventory", $$0.c(lj.f, $$2), this.c);
      aep $$7 = lh.m.a(csl.br, "_inventory", $$0.c(lj.f, $$1), this.c);
      this.a(csl.by, $$6);
      this.a(csl.br, $$7);
   }

   private void a(csk $$0, aep $$1, li $$2) {
      aep $$3 = lh.bf.a($$0, $$2, this.c);
      this.b.accept(kx.a($$0).a(a(dfo.g, $$1, $$3)).a(e()));
   }

   private void ab() {
      li $$0 = new li().a(lj.F, li.a(csl.by, "_top")).a(lj.i, li.a(csl.by, "_side"));
      li $$1 = $$0.c(lj.E, li.a(csl.by, "_top_sticky"));
      li $$2 = $$0.c(lj.E, li.a(csl.by, "_top"));
      this.b
         .accept(
            kx.a(csl.bz)
               .a(
                  ky.a(dfo.x, dfo.bg)
                     .a(false, dga.a, la.a().a(lb.c, lh.bg.a(csl.by, "_head", $$2, this.c)))
                     .a(false, dga.b, la.a().a(lb.c, lh.bg.a(csl.by, "_head_sticky", $$1, this.c)))
                     .a(true, dga.a, la.a().a(lb.c, lh.bh.a(csl.by, "_head_short", $$2, this.c)))
                     .a(true, dga.b, la.a().a(lb.c, lh.bh.a(csl.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ac() {
      aep $$0 = lf.a(csl.qD, "_inactive");
      aep $$1 = lf.a(csl.qD, "_active");
      this.a(csl.qD, $$0);
      this.b.accept(kx.a(csl.qD).a(ky.a(dfo.bo).a($$2 -> la.a().a(lb.c, $$2 != dgf.b && $$2 != dgf.c ? $$0 : $$1))));
   }

   private void ad() {
      aep $$0 = lf.a(csl.qE, "_inactive");
      aep $$1 = lf.a(csl.qE, "_active");
      this.a(csl.qE, $$0);
      this.b.accept(kx.a(csl.qE).a(ky.a(dfo.bo).a($$2 -> la.a().a(lb.c, $$2 != dgf.b && $$2 != dgf.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      aep $$0 = lh.bK.a(csl.qI, li.a(false), this.c);
      aep $$1 = lh.bK.a(csl.qI, "_can_summon", li.a(true), this.c);
      this.a(csl.qI, $$0);
      this.b.accept(kx.a(csl.qI).a(a(dfo.G, $$1, $$0)));
   }

   private void af() {
      aep $$0 = lf.a(csl.nS, "_stable");
      aep $$1 = lf.a(csl.nS, "_unstable");
      this.a(csl.nS, $$0);
      this.b.accept(kx.a(csl.nS).a(a(dfo.b, $$1, $$0)));
   }

   private void ag() {
      aep $$0 = this.a(csl.ru, "", lh.am, li::c);
      aep $$1 = this.a(csl.ru, "_lit", lh.am, li::c);
      this.b.accept(kx.a(csl.ru).a(a(dfo.D, $$1, $$0)));
      aep $$2 = this.a(csl.rv, "", lh.am, li::c);
      aep $$3 = this.a(csl.rv, "_lit", lh.am, li::c);
      this.b.accept(kx.a(csl.rv).a(a(dfo.D, $$3, $$2)));
   }

   private void ah() {
      aep $$0 = lk.a.create(csl.fB, this.c);
      aep $$1 = this.a(csl.fB, "_on", lh.c, li::b);
      this.b.accept(kx.a(csl.fB).a(a(dfo.r, $$1, $$0)));
   }

   private void i(csk $$0, csk $$1) {
      li $$2 = li.y($$0);
      this.b.accept(c($$0, lh.bd.a($$0, $$2, this.c)));
      this.b.accept(kx.a($$1, la.a().a(lb.c, lh.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      li $$0 = li.y(csl.dK);
      li $$1 = li.i(li.a(csl.dK, "_off"));
      aep $$2 = lh.bd.a(csl.dK, $$0, this.c);
      aep $$3 = lh.bd.a(csl.dK, "_off", $$1, this.c);
      this.b.accept(kx.a(csl.dK).a(a(dfo.r, $$2, $$3)));
      aep $$4 = lh.be.a(csl.dL, $$0, this.c);
      aep $$5 = lh.be.a(csl.dL, "_off", $$1, this.c);
      this.b.accept(kx.a(csl.dL).a(a(dfo.r, $$4, $$5)).a(d()));
      this.d(csl.dK);
      this.c(csl.dL);
   }

   private void aj() {
      this.a(ciz.lo);
      this.b.accept(kx.a(csl.ei).a(ky.a(dfo.aA, dfo.s, dfo.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return la.a().a(lb.c, li.a(csl.ei, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(ciz.cx);
      this.b
         .accept(
            kx.a(csl.mV)
               .a(
                  ky.a(dfo.aS, dfo.C)
                     .a(1, false, Arrays.asList(a(lf.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(lf.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(lf.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(lf.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(lf.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(lf.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(lf.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(lf.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      li $$0 = li.a(csl.dN);
      aep $$1 = lh.c.a(csl.dP, $$0, this.c);
      this.b.accept(kx.a(csl.dN).a(ky.a(dfo.aF).a($$1x -> la.a().a(lb.c, $$1x < 8 ? lf.a(csl.dN, "_height" + $$1x * 2) : $$1))));
      this.a(csl.dN, lf.a(csl.dN, "_height2"));
      this.b.accept(c(csl.dP, $$1));
   }

   private void am() {
      this.b.accept(kx.a(csl.oc, la.a().a(lb.c, lf.a(csl.oc))).a(b()));
   }

   private void an() {
      aep $$0 = lk.a.create(csl.pa, this.c);
      this.a(csl.pa, $$0);
      this.b.accept(kx.a(csl.pa).a(ky.a(dfo.bj).a($$0x -> la.a().a(lb.c, this.a(csl.pa, "_" + $$0x.c(), lh.c, li::b)))));
   }

   private void ao() {
      this.a(ciz.vv);
      this.b.accept(kx.a(csl.oi).a(ky.a(dfo.as).a($$0 -> la.a().a(lb.c, this.a(csl.oi, "_stage" + $$0, lh.am, li::c)))));
   }

   private void ap() {
      this.a(ciz.oE);
      this.b
         .accept(
            kx.a(csl.fI)
               .a(
                  ky.a(dfo.a, dfo.M, dfo.L, dfo.N, dfo.O)
                     .a(false, false, false, false, false, la.a().a(lb.c, lf.a(csl.fI, "_ns")))
                     .a(false, true, false, false, false, la.a().a(lb.c, lf.a(csl.fI, "_n")).a(lb.b, lb.a.b))
                     .a(false, false, true, false, false, la.a().a(lb.c, lf.a(csl.fI, "_n")))
                     .a(false, false, false, true, false, la.a().a(lb.c, lf.a(csl.fI, "_n")).a(lb.b, lb.a.c))
                     .a(false, false, false, false, true, la.a().a(lb.c, lf.a(csl.fI, "_n")).a(lb.b, lb.a.d))
                     .a(false, true, true, false, false, la.a().a(lb.c, lf.a(csl.fI, "_ne")))
                     .a(false, true, false, true, false, la.a().a(lb.c, lf.a(csl.fI, "_ne")).a(lb.b, lb.a.b))
                     .a(false, false, false, true, true, la.a().a(lb.c, lf.a(csl.fI, "_ne")).a(lb.b, lb.a.c))
                     .a(false, false, true, false, true, la.a().a(lb.c, lf.a(csl.fI, "_ne")).a(lb.b, lb.a.d))
                     .a(false, false, true, true, false, la.a().a(lb.c, lf.a(csl.fI, "_ns")))
                     .a(false, true, false, false, true, la.a().a(lb.c, lf.a(csl.fI, "_ns")).a(lb.b, lb.a.b))
                     .a(false, true, true, true, false, la.a().a(lb.c, lf.a(csl.fI, "_nse")))
                     .a(false, true, false, true, true, la.a().a(lb.c, lf.a(csl.fI, "_nse")).a(lb.b, lb.a.b))
                     .a(false, false, true, true, true, la.a().a(lb.c, lf.a(csl.fI, "_nse")).a(lb.b, lb.a.c))
                     .a(false, true, true, false, true, la.a().a(lb.c, lf.a(csl.fI, "_nse")).a(lb.b, lb.a.d))
                     .a(false, true, true, true, true, la.a().a(lb.c, lf.a(csl.fI, "_nsew")))
                     .a(true, false, false, false, false, la.a().a(lb.c, lf.a(csl.fI, "_attached_ns")))
                     .a(true, false, true, false, false, la.a().a(lb.c, lf.a(csl.fI, "_attached_n")))
                     .a(true, false, false, true, false, la.a().a(lb.c, lf.a(csl.fI, "_attached_n")).a(lb.b, lb.a.c))
                     .a(true, true, false, false, false, la.a().a(lb.c, lf.a(csl.fI, "_attached_n")).a(lb.b, lb.a.b))
                     .a(true, false, false, false, true, la.a().a(lb.c, lf.a(csl.fI, "_attached_n")).a(lb.b, lb.a.d))
                     .a(true, true, true, false, false, la.a().a(lb.c, lf.a(csl.fI, "_attached_ne")))
                     .a(true, true, false, true, false, la.a().a(lb.c, lf.a(csl.fI, "_attached_ne")).a(lb.b, lb.a.b))
                     .a(true, false, false, true, true, la.a().a(lb.c, lf.a(csl.fI, "_attached_ne")).a(lb.b, lb.a.c))
                     .a(true, false, true, false, true, la.a().a(lb.c, lf.a(csl.fI, "_attached_ne")).a(lb.b, lb.a.d))
                     .a(true, false, true, true, false, la.a().a(lb.c, lf.a(csl.fI, "_attached_ns")))
                     .a(true, true, false, false, true, la.a().a(lb.c, lf.a(csl.fI, "_attached_ns")).a(lb.b, lb.a.b))
                     .a(true, true, true, true, false, la.a().a(lb.c, lf.a(csl.fI, "_attached_nse")))
                     .a(true, true, false, true, true, la.a().a(lb.c, lf.a(csl.fI, "_attached_nse")).a(lb.b, lb.a.b))
                     .a(true, false, true, true, true, la.a().a(lb.c, lf.a(csl.fI, "_attached_nse")).a(lb.b, lb.a.c))
                     .a(true, true, true, false, true, la.a().a(lb.c, lf.a(csl.fI, "_attached_nse")).a(lb.b, lb.a.d))
                     .a(true, true, true, true, true, la.a().a(lb.c, lf.a(csl.fI, "_attached_nsew")))
               )
         );
   }

   private void aq() {
      this.d(csl.fH);
      this.b.accept(kx.a(csl.fH).a(ky.a(dfo.a, dfo.w).a(($$0, $$1) -> la.a().a(lb.c, li.a(csl.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aep a(int $$0, String $$1, li $$2) {
      switch ($$0) {
         case 1:
            return lh.bj.a(lf.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return lh.bk.a(lf.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return lh.bl.a(lf.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return lh.bm.a(lf.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private aep a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", li.b(li.G(csl.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", li.b(li.a(csl.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", li.b(li.a(csl.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ar() {
      this.a(ciz.jT);
      this.b.accept(kx.a(csl.mf).a(ky.a(dfo.aD, dfo.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void as() {
      this.a(ciz.jU);
      Function<Integer, aep> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         li $$2 = li.a($$1);
         return lh.bu.a(csl.mg, $$1, $$2, this.c);
      };
      this.b.accept(kx.a(csl.mg).a(ky.a(czs.b).a($$1 -> la.a().a(lb.c, $$0.apply($$1)))));
   }

   private void E(csk $$0) {
      this.d($$0);
      aep $$1 = lf.a($$0);
      kw $$2 = kw.a($$0);
      kv.c $$3 = ac.a(kv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dfp, Function<aep, la>> $$4 : a) {
         dfp $$5 = (dfp)$$4.getFirst();
         Function<aep, la> $$6 = (Function<aep, la>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(kv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void at() {
      aep $$0 = li.a(csl.qH, "_bottom");
      li $$1 = new li().a(lj.e, $$0).a(lj.f, li.a(csl.qH, "_top")).a(lj.i, li.a(csl.qH, "_side"));
      li $$2 = new li().a(lj.e, $$0).a(lj.f, li.a(csl.qH, "_top_bloom")).a(lj.i, li.a(csl.qH, "_side_bloom"));
      aep $$3 = lh.m.a(csl.qH, "", $$1, this.c);
      aep $$4 = lh.m.a(csl.qH, "_bloom", $$2, this.c);
      this.b.accept(kx.a(csl.qH).a(ky.a(dfo.E).a($$2x -> la.a().a(lb.c, $$2x ? $$4 : $$3))));
      this.a(ciz.fN, $$3);
   }

   private void au() {
      csk $$0 = csl.cm;
      aep $$1 = lf.a($$0);
      kw $$2 = kw.a($$0);
      Map.of(hb.c, lb.a.a, hb.f, lb.a.b, hb.d, lb.a.c, hb.e, lb.a.d).forEach(($$2x, $$3) -> {
         kv.c $$4 = kv.a().a(dfo.R, $$2x);
         $$2.a($$4, la.a().a(lb.c, $$1).a(lb.b, $$3).a(lb.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, lf.a($$0, "_inventory"));
      i.clear();
   }

   private void a(kw $$0, kv.c $$1, lb.a $$2) {
      Map.of(dfo.bp, lh.aK, dfo.bq, lh.aL, dfo.br, lh.aM, dfo.bs, lh.aN, dfo.bt, lh.aO, dfo.bu, lh.aP).forEach(($$3, $$4) -> {
         this.a($$0, $$1, $$2, $$3, $$4, true);
         this.a($$0, $$1, $$2, $$3, $$4, false);
      });
   }

   private void a(kw $$0, kv.c $$1, lb.a $$2, dfp $$3, lg $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      li $$7 = new li().a(lj.b, li.a(csl.cm, $$6));
      kr.d $$8 = new kr.d($$4, $$6);
      aep $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(csl.cm, $$6, $$7, this.c));
      $$0.a(kv.a($$1, kv.a().a($$3, $$5)), la.a().a(lb.c, $$9).a(lb.b, $$2));
   }

   private void av() {
      this.b.accept(c(csl.kJ, lh.c.a(csl.kJ, li.b(lf.a("magma")), this.c)));
   }

   private void F(csk $$0) {
      this.b($$0, lk.p);
      lh.bB.a(lf.a($$0.k()), li.u($$0), this.c);
   }

   private void b(csk $$0, csk $$1, kr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(csk $$0, csk $$1) {
      lh.bC.a(lf.a($$0.k()), li.u($$1), this.c);
   }

   private void aw() {
      aep $$0 = lf.a(csl.b);
      aep $$1 = lf.a(csl.b, "_mirrored");
      this.b.accept(a(csl.eO, $$0, $$1));
      this.a(csl.eO, $$0);
   }

   private void ax() {
      aep $$0 = lf.a(csl.rI);
      aep $$1 = lf.a(csl.rI, "_mirrored");
      this.b.accept(a(csl.sc, $$0, $$1).a(f()));
      this.a(csl.sc, $$0);
   }

   private void k(csk $$0, csk $$1) {
      this.a($$0, kr.e.b);
      li $$2 = li.d(li.a($$0, "_pot"));
      aep $$3 = kr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void ay() {
      aep $$0 = li.a(csl.pl, "_bottom");
      aep $$1 = li.a(csl.pl, "_top_off");
      aep $$2 = li.a(csl.pl, "_top");
      aep[] $$3 = new aep[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         li $$5 = new li().a(lj.e, $$0).a(lj.f, $$4 == 0 ? $$1 : $$2).a(lj.i, li.a(csl.pl, "_side" + $$4));
         $$3[$$4] = lh.m.a(csl.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(kx.a(csl.pl).a(ky.a(dfo.aZ).a($$1x -> la.a().a(lb.c, $$3[$$1x]))));
      this.a(ciz.vT, $$3[0]);
   }

   private la a(hd $$0, la $$1) {
      switch ($$0) {
         case b:
            return $$1.a(lb.a, lb.a.b);
         case c:
            return $$1.a(lb.a, lb.a.b).a(lb.b, lb.a.c);
         case d:
            return $$1.a(lb.a, lb.a.b).a(lb.b, lb.a.d);
         case a:
            return $$1.a(lb.a, lb.a.b).a(lb.b, lb.a.b);
         case f:
            return $$1.a(lb.a, lb.a.d).a(lb.b, lb.a.c);
         case g:
            return $$1.a(lb.a, lb.a.d);
         case h:
            return $$1.a(lb.a, lb.a.d).a(lb.b, lb.a.b);
         case e:
            return $$1.a(lb.a, lb.a.d).a(lb.b, lb.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(lb.b, lb.a.c);
         case i:
            return $$1.a(lb.b, lb.a.d);
         case j:
            return $$1.a(lb.b, lb.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void az() {
      aep $$0 = li.a(csl.pb, "_top");
      aep $$1 = li.a(csl.pb, "_bottom");
      aep $$2 = li.a(csl.pb, "_side");
      aep $$3 = li.a(csl.pb, "_lock");
      li $$4 = new li().a(lj.o, $$2).a(lj.m, $$2).a(lj.l, $$2).a(lj.c, $$0).a(lj.j, $$0).a(lj.k, $$1).a(lj.n, $$3);
      aep $$5 = lh.b.a(csl.pb, $$4, this.c);
      this.b.accept(kx.a(csl.pb, la.a().a(lb.c, $$5)).a(ky.a(dfo.T).a($$0x -> this.a($$0x, la.a()))));
   }

   private void aA() {
      csk $$0 = csl.n;
      aep $$1 = lf.a($$0);
      lk $$2 = lk.a.get($$0);
      csk $$3 = csl.jH;
      aep $$4 = lh.Z.a($$3, $$2.b(), this.c);
      aep $$5 = lh.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      jf.a().filter(jg::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(csl.qS).a(jf.w).a(csl.ri).a(jf.y);
      this.h(csl.qR).a(jf.A).a(csl.rh).a(jf.C);
      this.h(csl.qQ).a(jf.E).a(csl.rg).a(jf.G);
      this.h(csl.qP).a(jf.I).a(csl.rf).a(jf.K);
      this.m(csl.a);
      this.a(csl.nc, csl.a);
      this.a(csl.nb, csl.a);
      this.m(csl.fO);
      this.m(csl.dQ);
      this.a(csl.nd, csl.G);
      this.m(csl.fA);
      this.m(csl.me);
      this.m(csl.fr);
      this.m(csl.fR);
      this.a(ciz.tk);
      this.m(csl.pg);
      this.m(csl.G);
      this.m(csl.H);
      this.m(csl.hV);
      this.a(ciz.fw);
      this.l(csl.pM, csl.qd);
      this.l(csl.pN, csl.qe);
      this.l(csl.pO, csl.qf);
      this.l(csl.pP, csl.qg);
      this.l(csl.pQ, csl.qh);
      this.l(csl.pR, csl.qi);
      this.l(csl.pS, csl.qj);
      this.l(csl.pT, csl.qk);
      this.l(csl.pU, csl.ql);
      this.l(csl.pV, csl.qm);
      this.l(csl.pW, csl.qn);
      this.l(csl.pX, csl.qo);
      this.l(csl.pY, csl.qp);
      this.l(csl.pZ, csl.qq);
      this.l(csl.qa, csl.qr);
      this.l(csl.qb, csl.qs);
      this.l(csl.pL, csl.qc);
      this.m(csl.na);
      this.m(csl.gs);
      this.m(csl.qC);
      this.m(csl.rw);
      this.s(csl.rx);
      this.s(csl.ry);
      this.t(csl.sh);
      this.t(csl.si);
      this.ag();
      this.e(csl.rB, csl.rz);
      this.p(csl.rA);
      this.a(csl.hW, ciz.hf);
      this.a(ciz.hf);
      this.aB();
      this.a(csl.kN, ciz.iF);
      this.a(ciz.iF);
      this.f(csl.bQ, li.a(csl.by, "_side"));
      this.a(csl.R);
      this.a(csl.S);
      this.a(csl.iB);
      this.a(csl.cx);
      this.a(csl.cy);
      this.a(csl.cz);
      this.a(csl.fE);
      this.a(csl.fF);
      this.a(csl.fJ);
      this.a(csl.N);
      this.a(csl.T);
      this.a(csl.O);
      this.a(csl.ch);
      this.a(csl.P);
      this.a(csl.Q);
      this.a(csl.ci);
      this.b(csl.pj, lk.c);
      this.a(csl.pi);
      this.a(csl.aR);
      this.a(csl.aS);
      this.a(csl.aT);
      this.a(csl.hb);
      this.a(csl.dI);
      this.a(csl.dJ);
      this.a(csl.ha);
      this.a(csl.pC);
      this.a(csl.mW);
      this.a(csl.dR);
      this.a(csl.k);
      this.a(csl.pk);
      this.a(csl.fz);
      this.a(csl.ed);
      this.a(csl.L);
      this.a(csl.ph);
      this.a(csl.dO);
      this.b(csl.dT, lk.f);
      this.b(csl.pq, lk.c);
      this.b(csl.fa, lk.c);
      this.m(csl.ac);
      this.m(csl.ga);
      this.a(csl.kK);
      this.a(csl.aY);
      this.a(csl.iC);
      this.a(csl.co);
      this.a(csl.pK);
      this.a(csl.ii);
      this.a(csl.oy);
      this.a(csl.dX);
      this.a(csl.dY);
      this.a(csl.ct);
      this.a(csl.aO);
      this.b(csl.bw, lk.u);
      this.a(ciz.cw);
      this.b(csl.ck, lk.e);
      this.b(csl.pd, lk.c);
      this.a(csl.op);
      this.a(csl.aP);
      this.a(csl.qt);
      this.a(csl.qu);
      this.a(csl.qA);
      this.a(csl.qz);
      this.a(csl.rt);
      this.a(csl.se);
      this.a(csl.sf);
      this.a(csl.sg);
      this.e(csl.qF);
      this.aA();
      this.a(csl.qN);
      this.a(csl.qO);
      this.a(csl.qM);
      this.a(csl.qL);
      this.a(csl.qK);
      this.a(csl.qJ);
      this.h(csl.qM, csl.rb);
      this.h(csl.qL, csl.rd);
      this.h(csl.qK, csl.rc);
      this.h(csl.qJ, csl.re);
      this.g(csl.gW, csl.ch);
      this.g(csl.gX, csl.ci);
      this.F();
      this.r();
      this.au();
      this.v();
      this.w();
      this.a(csl.og, csl.oh);
      this.x();
      this.A();
      this.B();
      this.D();
      this.E();
      this.H();
      this.C();
      this.y(csl.kt);
      this.I();
      this.J();
      this.K();
      this.L();
      this.O();
      this.P();
      this.Q();
      this.R();
      this.q();
      this.S();
      this.T();
      this.U();
      this.V();
      this.X();
      this.Y();
      this.Z();
      this.aa();
      this.ab();
      this.af();
      this.ai();
      this.ah();
      this.aj();
      this.ak();
      this.y();
      this.al();
      this.am();
      this.an();
      this.ao();
      this.ap();
      this.aq();
      this.ar();
      this.as();
      this.E(csl.ff);
      this.E(csl.fg);
      this.E(csl.qG);
      this.av();
      this.az();
      this.ac();
      this.ad();
      this.ae();
      this.W();
      this.N();
      this.M();
      this.D(csl.cO);
      this.d(csl.cO);
      this.D(csl.oa);
      this.g();
      this.D(csl.rD);
      this.i(csl.cp, csl.cq);
      this.i(csl.eb, csl.ec);
      this.a(csl.cA, csl.n, li::c);
      this.a(csl.nY, csl.p, li::d);
      this.x(csl.ow);
      this.x(csl.on);
      this.v(csl.aU);
      this.v(csl.hi);
      this.C(csl.oe);
      this.C(csl.of);
      this.e(csl.eY, lf.a(csl.eY));
      this.a(csl.dZ, lk.c);
      this.a(csl.ea, lk.c);
      this.a(csl.sd);
      this.a(csl.kM, lk.c);
      this.f(csl.j);
      this.f(csl.rG);
      this.f(csl.I);
      this.g(csl.J);
      this.g(csl.M);
      this.f(csl.K);
      this.e(csl.F);
      this.b(csl.sn, lk.e);
      this.a(csl.ij, lk.c, lk.d);
      this.a(csl.kx, lk.v, lk.w);
      this.a(csl.hf, lk.v, lk.w);
      this.a(csl.sj, lk.c, lk.d);
      this.a(csl.sk, lk.c, lk.d);
      this.a(csl.sl, lk.c, lk.d);
      this.c(csl.nT, lk.h);
      this.z();
      this.a(csl.pe, li::A);
      this.a(csl.pf, li::C);
      this.a(csl.kD, dfo.as, 0, 1, 2, 3);
      this.a(csl.gt, dfo.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csl.fq, dfo.as, 0, 1, 1, 2);
      this.a(csl.gu, dfo.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csl.cB, dfo.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(csl.kA, kr.e.b, dfo.aq, 0, 1);
      this.i();
      this.h();
      this.a(lf.a("decorated_pot"), csl.iA).b(csl.so);
      this.a(lf.a("banner"), csl.n)
         .a(lh.bD, csl.iJ, csl.iK, csl.iL, csl.iM, csl.iN, csl.iO, csl.iP, csl.iQ, csl.iR, csl.iS, csl.iT, csl.iU, csl.iV, csl.iW, csl.iX, csl.iY)
         .b(csl.iZ, csl.ja, csl.jb, csl.jc, csl.jd, csl.je, csl.jf, csl.jg, csl.jh, csl.ji, csl.jj, csl.jk, csl.jl, csl.jm, csl.jn, csl.jo);
      this.a(lf.a("bed"), csl.n)
         .b(csl.aZ, csl.ba, csl.bb, csl.bc, csl.bd, csl.be, csl.bf, csl.bg, csl.bh, csl.bi, csl.bj, csl.bk, csl.bl, csl.bm, csl.bn, csl.bo);
      this.j(csl.aZ, csl.bA);
      this.j(csl.ba, csl.bB);
      this.j(csl.bb, csl.bC);
      this.j(csl.bc, csl.bD);
      this.j(csl.bd, csl.bE);
      this.j(csl.be, csl.bF);
      this.j(csl.bf, csl.bG);
      this.j(csl.bg, csl.bH);
      this.j(csl.bh, csl.bI);
      this.j(csl.bi, csl.bJ);
      this.j(csl.bj, csl.bK);
      this.j(csl.bk, csl.bL);
      this.j(csl.bl, csl.bM);
      this.j(csl.bm, csl.bN);
      this.j(csl.bn, csl.bO);
      this.j(csl.bo, csl.bP);
      this.a(lf.a("skull"), csl.dX)
         .a(lh.bE, csl.gM, csl.gK, csl.gI, csl.gE, csl.gG, csl.gQ)
         .a(csl.gO)
         .b(csl.gN, csl.gP, csl.gL, csl.gJ, csl.gF, csl.gH, csl.gR);
      this.F(csl.kP);
      this.F(csl.kQ);
      this.F(csl.kR);
      this.F(csl.kS);
      this.F(csl.kT);
      this.F(csl.kU);
      this.F(csl.kV);
      this.F(csl.kW);
      this.F(csl.kX);
      this.F(csl.kY);
      this.F(csl.kZ);
      this.F(csl.la);
      this.F(csl.lb);
      this.F(csl.lc);
      this.F(csl.ld);
      this.F(csl.le);
      this.F(csl.lf);
      this.b(csl.mX, lk.p);
      this.c(csl.mX);
      this.a(lf.a("chest"), csl.n).b(csl.cv, csl.gV);
      this.a(lf.a("ender_chest"), csl.co).b(csl.fG);
      this.d(csl.fx, csl.co).a(csl.fx, csl.kF);
      this.a(csl.aM);
      this.a(csl.aN);
      this.a(csl.lw);
      this.a(csl.lx);
      this.a(csl.ly);
      this.a(csl.lz);
      this.a(csl.lA);
      this.a(csl.lB);
      this.a(csl.lC);
      this.a(csl.lD);
      this.a(csl.lE);
      this.a(csl.lF);
      this.a(csl.lG);
      this.a(csl.lH);
      this.a(csl.lI);
      this.a(csl.lJ);
      this.a(csl.lK);
      this.a(csl.lL);
      this.a(lk.a, csl.lM, csl.lN, csl.lO, csl.lP, csl.lQ, csl.lR, csl.lS, csl.lT, csl.lU, csl.lV, csl.lW, csl.lX, csl.lY, csl.lZ, csl.ma, csl.mb);
      this.a(csl.iA);
      this.a(csl.hj);
      this.a(csl.hk);
      this.a(csl.hl);
      this.a(csl.hm);
      this.a(csl.hn);
      this.a(csl.ho);
      this.a(csl.hp);
      this.a(csl.hq);
      this.a(csl.hr);
      this.a(csl.hs);
      this.a(csl.ht);
      this.a(csl.hu);
      this.a(csl.hv);
      this.a(csl.hw);
      this.a(csl.hx);
      this.a(csl.hy);
      this.a(csl.qB);
      this.f(csl.aQ, csl.eZ);
      this.f(csl.ej, csl.hz);
      this.f(csl.ek, csl.hA);
      this.f(csl.el, csl.hB);
      this.f(csl.em, csl.hC);
      this.f(csl.en, csl.hD);
      this.f(csl.eo, csl.hE);
      this.f(csl.ep, csl.hF);
      this.f(csl.eq, csl.hG);
      this.f(csl.er, csl.hH);
      this.f(csl.es, csl.hI);
      this.f(csl.et, csl.hJ);
      this.f(csl.eu, csl.hK);
      this.f(csl.ev, csl.hL);
      this.f(csl.ew, csl.hM);
      this.f(csl.ex, csl.hN);
      this.f(csl.ey, csl.hO);
      this.b(lk.n, csl.lg, csl.lh, csl.li, csl.lj, csl.lk, csl.ll, csl.lm, csl.ln, csl.lo, csl.lp, csl.lq, csl.lr, csl.ls, csl.lt, csl.lu, csl.lv);
      this.e(csl.bA, csl.ik);
      this.e(csl.bB, csl.il);
      this.e(csl.bC, csl.im);
      this.e(csl.bD, csl.in);
      this.e(csl.bE, csl.io);
      this.e(csl.bF, csl.ip);
      this.e(csl.bG, csl.iq);
      this.e(csl.bH, csl.ir);
      this.e(csl.bI, csl.is);
      this.e(csl.bJ, csl.it);
      this.e(csl.bK, csl.iu);
      this.e(csl.bL, csl.iv);
      this.e(csl.bM, csl.iw);
      this.e(csl.bN, csl.ix);
      this.e(csl.bO, csl.iy);
      this.e(csl.bP, csl.iz);
      this.a(csl.rH);
      this.a(csl.eM);
      this.a(csl.bu, csl.gb, kr.e.a);
      this.a(csl.bR, csl.gc, kr.e.b);
      this.a(csl.bT, csl.gd, kr.e.b);
      this.a(csl.bU, csl.ge, kr.e.b);
      this.a(csl.bV, csl.gf, kr.e.b);
      this.a(csl.bW, csl.gg, kr.e.b);
      this.a(csl.bX, csl.gh, kr.e.b);
      this.a(csl.bY, csl.gi, kr.e.b);
      this.a(csl.bZ, csl.gj, kr.e.b);
      this.a(csl.ca, csl.gk, kr.e.b);
      this.a(csl.cb, csl.gl, kr.e.b);
      this.a(csl.cc, csl.gm, kr.e.b);
      this.a(csl.ce, csl.gn, kr.e.b);
      this.a(csl.cd, csl.go, kr.e.b);
      this.a(csl.cg, csl.gp, kr.e.b);
      this.a(csl.cf, csl.gq, kr.e.b);
      this.a(csl.bv, csl.gr, kr.e.b);
      this.a(csl.bS, csl.fS, kr.e.b);
      this.G();
      this.u(csl.eU);
      this.u(csl.eV);
      this.u(csl.eW);
      this.a(csl.bt, kr.e.a);
      this.b(csl.dS, kr.e.a);
      this.a(ciz.dn);
      this.b(csl.mc, csl.md, kr.e.b);
      this.a(ciz.do);
      this.c(csl.md);
      this.b(csl.rF, kr.e.b);
      this.c(csl.rF);
      this.c(csl.rv);
      this.b(csl.oz, csl.oA, kr.e.b);
      this.b(csl.oB, csl.oC, kr.e.b);
      this.a(csl.oz, "_plant");
      this.c(csl.oA);
      this.a(csl.oB, "_plant");
      this.c(csl.oC);
      this.a(csl.mY, kr.e.a, li.c(li.a(csl.mZ, "_stage0")));
      this.m();
      this.a(csl.bs, kr.e.b);
      this.c(csl.iE, kr.e.b);
      this.c(csl.iF, kr.e.b);
      this.c(csl.iG, kr.e.b);
      this.c(csl.iH, kr.e.a);
      this.c(csl.iI, kr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(csl.mw, csl.mr, csl.mm, csl.mh, csl.mG, csl.mB, csl.mQ, csl.mL);
      this.a(csl.mx, csl.ms, csl.mn, csl.mi, csl.mH, csl.mC, csl.mR, csl.mM);
      this.a(csl.my, csl.mt, csl.mo, csl.mj, csl.mI, csl.mD, csl.mS, csl.mN);
      this.a(csl.mz, csl.mu, csl.mp, csl.mk, csl.mJ, csl.mE, csl.mT, csl.mO);
      this.a(csl.mA, csl.mv, csl.mq, csl.ml, csl.mK, csl.mF, csl.mU, csl.mP);
      this.c(csl.fe, csl.fc);
      this.c(csl.fd, csl.fb);
      this.l(csl.ab).c(csl.ab).a(csl.av);
      this.l(csl.am).c(csl.am).a(csl.aD);
      this.a(csl.am, csl.dj, csl.ds);
      this.b(csl.aL, lk.r);
      this.l(csl.Y).c(csl.Y).a(csl.as);
      this.l(csl.ai).c(csl.ai).a(csl.aA);
      this.a(csl.ai, csl.dd, csl.do);
      this.a(csl.B, csl.fX, kr.e.b);
      this.b(csl.aI, lk.r);
      this.l(csl.Z).d(csl.Z).a(csl.at);
      this.l(csl.aj).d(csl.aj).a(csl.aB);
      this.a(csl.aj, csl.de, csl.dp);
      this.a(csl.C, csl.fY, kr.e.b);
      this.b(csl.aJ, lk.r);
      this.l(csl.W).c(csl.W).a(csl.aq);
      this.l(csl.ag).c(csl.ag).a(csl.ay);
      this.a(csl.ag, csl.dc, csl.dn);
      this.a(csl.z, csl.fV, kr.e.b);
      this.b(csl.aG, lk.r);
      this.l(csl.U).c(csl.U).a(csl.ao);
      this.l(csl.al).c(csl.al).a(csl.aw);
      this.a(csl.al, csl.da, csl.dl);
      this.a(csl.x, csl.fT, kr.e.b);
      this.b(csl.aE, lk.r);
      this.l(csl.V).c(csl.V).a(csl.ap);
      this.l(csl.af).c(csl.af).a(csl.ax);
      this.a(csl.af, csl.db, csl.dm);
      this.a(csl.y, csl.fU, kr.e.b);
      this.b(csl.aF, lk.r);
      this.l(csl.aa).c(csl.aa).a(csl.au);
      this.l(csl.ak).c(csl.ak).a(csl.aC);
      this.a(csl.ak, csl.dg, csl.dr);
      this.a(csl.D, csl.fZ, kr.e.b);
      this.b(csl.aK, lk.r);
      this.l(csl.X).c(csl.X).a(csl.ar);
      this.l(csl.ah).c(csl.ah).a(csl.az);
      this.a(csl.ah, csl.df, csl.dq);
      this.a(csl.A, csl.fW, kr.e.b);
      this.b(csl.aH, lk.r);
      this.l(csl.os).b(csl.os).a(csl.ou);
      this.l(csl.ot).b(csl.ot).a(csl.ov);
      this.a(csl.ot, csl.dh, csl.dt);
      this.a(csl.ox, csl.pm, kr.e.b);
      this.k(csl.oD, csl.po);
      this.l(csl.oj).b(csl.oj).a(csl.ol);
      this.l(csl.ok).b(csl.ok).a(csl.om);
      this.a(csl.ok, csl.di, csl.du);
      this.a(csl.oo, csl.pn, kr.e.b);
      this.k(csl.oq, csl.pp);
      this.l(csl.ae).d(csl.ae);
      this.l(csl.an).d(csl.an);
      this.a(csl.v, csl.dk, csl.dv);
      this.b(csl.or, kr.e.b);
      this.a(ciz.dk);
      this.i(csl.dy);
      this.k(csl.hY);
      this.u();
      this.n(csl.cP);
      this.o(csl.bp);
      this.o(csl.bq);
      this.o(csl.hh);
      this.t();
      this.q(csl.fN);
      this.q(csl.kG);
      this.q(csl.kH);
      this.r(csl.gS);
      this.r(csl.gT);
      this.r(csl.gU);
      this.o();
      this.p();
      this.d(csl.cD, lk.g);
      this.d(csl.nW, lk.g);
      this.d(csl.nV, lk.h);
      this.s();
      this.ay();
      this.at();
      this.h(csl.eL, csl.eT);
      this.h(csl.m, csl.eP);
      this.h(csl.eK, csl.eS);
      this.h(csl.eJ, csl.eR);
      this.aw();
      this.h(csl.eI, csl.eQ);
      this.ax();
      ckb.h().forEach($$0 -> this.a($$0, lf.b("template_spawn_egg")));
   }

   private void aB() {
      this.c(csl.hX);
      ky.a<Integer> $$0 = ky.a(dfo.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aep $$3 = li.a(ciz.hg, $$2);
         $$0.a($$1, la.a().a(lb.c, lh.Y.a(csl.hX, $$2, li.h($$3), this.c)));
         lh.bv.a(lf.a(ciz.hg, $$2), li.k($$3), this.c);
      }

      this.b.accept(kx.a(csl.hX).a($$0));
   }

   private void l(csk $$0, csk $$1) {
      this.a($$0.k());
      li $$2 = li.b(li.G($$0));
      li $$3 = li.b(li.a($$0, "_lit"));
      aep $$4 = lh.bF.a($$0, "_one_candle", $$2, this.c);
      aep $$5 = lh.bG.a($$0, "_two_candles", $$2, this.c);
      aep $$6 = lh.bH.a($$0, "_three_candles", $$2, this.c);
      aep $$7 = lh.bI.a($$0, "_four_candles", $$2, this.c);
      aep $$8 = lh.bF.a($$0, "_one_candle_lit", $$3, this.c);
      aep $$9 = lh.bG.a($$0, "_two_candles_lit", $$3, this.c);
      aep $$10 = lh.bH.a($$0, "_three_candles_lit", $$3, this.c);
      aep $$11 = lh.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            kx.a($$0)
               .a(
                  ky.a(dfo.az, dfo.r)
                     .a(1, false, la.a().a(lb.c, $$4))
                     .a(2, false, la.a().a(lb.c, $$5))
                     .a(3, false, la.a().a(lb.c, $$6))
                     .a(4, false, la.a().a(lb.c, $$7))
                     .a(1, true, la.a().a(lb.c, $$8))
                     .a(2, true, la.a().a(lb.c, $$9))
                     .a(3, true, la.a().a(lb.c, $$10))
                     .a(4, true, la.a().a(lb.c, $$11))
               )
         );
      aep $$12 = lh.bJ.a($$1, li.a($$0, false), this.c);
      aep $$13 = lh.bJ.a($$1, "_lit", li.a($$0, true), this.c);
      this.b.accept(kx.a($$1).a(a(dfo.r, $$13, $$12)));
   }

   class a {
      private final aep b;

      public a(aep $$0, csk $$1) {
         this.b = lh.Y.a($$0, li.u($$1), kr.this.c);
      }

      public kr.a a(csk... $$0) {
         for (csk $$1 : $$0) {
            kr.this.b.accept(kr.c($$1, this.b));
         }

         return this;
      }

      public kr.a b(csk... $$0) {
         for (csk $$1 : $$0) {
            kr.this.c($$1);
         }

         return this.a($$0);
      }

      public kr.a a(lg $$0, csk... $$1) {
         for (csk $$2 : $$1) {
            $$0.a(lf.a($$2.k()), li.u($$2), kr.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final li b;
      private final Map<lg, aep> c = Maps.newHashMap();
      @Nullable
      private jg d;
      @Nullable
      private aep e;

      public b(li $$0) {
         this.b = $$0;
      }

      public kr.b a(csk $$0, lg $$1) {
         this.e = $$1.a($$0, this.b, kr.this.c);
         if (kr.this.f.containsKey($$0)) {
            kr.this.b.accept(kr.this.f.get($$0).create($$0, this.e, this.b, kr.this.c));
         } else {
            kr.this.b.accept(kr.c($$0, this.e));
         }

         return this;
      }

      public kr.b a(csk... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (csk $$1 : $$0) {
               kr.this.b.accept(kr.c($$1, this.e));
               kr.this.a($$1, this.e);
            }

            return this;
         }
      }

      public kr.b a(csk $$0) {
         aep $$1 = lh.q.a($$0, this.b, kr.this.c);
         aep $$2 = lh.r.a($$0, this.b, kr.this.c);
         kr.this.b.accept(kr.b($$0, $$1, $$2));
         aep $$3 = lh.s.a($$0, this.b, kr.this.c);
         kr.this.a($$0, $$3);
         return this;
      }

      public kr.b b(csk $$0) {
         aep $$1 = lh.K.a($$0, this.b, kr.this.c);
         aep $$2 = lh.L.a($$0, this.b, kr.this.c);
         aep $$3 = lh.M.a($$0, this.b, kr.this.c);
         kr.this.b.accept(kr.a($$0, $$1, $$2, $$3));
         aep $$4 = lh.N.a($$0, this.b, kr.this.c);
         kr.this.a($$0, $$4);
         return this;
      }

      public kr.b c(csk $$0) {
         li $$1 = li.p($$0);
         aep $$2 = lh.B.a($$0, $$1, kr.this.c);
         aep $$3 = lh.C.a($$0, $$1, kr.this.c);
         aep $$4 = lh.D.a($$0, $$1, kr.this.c);
         aep $$5 = lh.E.a($$0, $$1, kr.this.c);
         aep $$6 = lh.F.a($$0, $$1, kr.this.c);
         kr.this.b.accept(kr.a($$0, $$2, $$3, $$4, $$5, $$6));
         aep $$7 = lh.G.a($$0, $$1, kr.this.c);
         kr.this.a($$0, $$7);
         return this;
      }

      public kr.b d(csk $$0) {
         aep $$1 = lh.H.a($$0, this.b, kr.this.c);
         aep $$2 = lh.I.a($$0, this.b, kr.this.c);
         kr.this.b.accept(kr.c($$0, $$1, $$2));
         aep $$3 = lh.J.a($$0, this.b, kr.this.c);
         kr.this.a($$0, $$3);
         return this;
      }

      public kr.b e(csk $$0) {
         li $$1 = li.p($$0);
         aep $$2 = lh.P.a($$0, $$1, kr.this.c);
         aep $$3 = lh.O.a($$0, $$1, kr.this.c);
         aep $$4 = lh.R.a($$0, $$1, kr.this.c);
         aep $$5 = lh.Q.a($$0, $$1, kr.this.c);
         kr.this.b.accept(kr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public kr.b f(csk $$0) {
         aep $$1 = lh.T.a($$0, this.b, kr.this.c);
         aep $$2 = lh.S.a($$0, this.b, kr.this.c);
         aep $$3 = lh.V.a($$0, this.b, kr.this.c);
         aep $$4 = lh.U.a($$0, this.b, kr.this.c);
         kr.this.b.accept(kr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public kr.b g(csk $$0) {
         aep $$1 = lh.W.a($$0, this.b, kr.this.c);
         aep $$2 = lh.X.a($$0, this.b, kr.this.c);
         kr.this.b.accept(kr.e($$0, $$1, $$2));
         return this;
      }

      public kr.b h(csk $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            csk $$1 = this.d.b().get(jg.b.r);
            aep $$2 = lh.Y.a($$0, this.b, kr.this.c);
            kr.this.b.accept(kr.c($$0, $$2));
            kr.this.b.accept(kr.c($$1, $$2));
            kr.this.a($$0.k());
            kr.this.c($$1);
            return this;
         }
      }

      public kr.b i(csk $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aep $$1 = this.a(lh.Z, $$0);
            aep $$2 = this.a(lh.aa, $$0);
            kr.this.b.accept(kr.e($$0, $$1, $$2, this.e));
            kr.this.a($$0, $$1);
            return this;
         }
      }

      public kr.b j(csk $$0) {
         aep $$1 = this.a(lh.ad, $$0);
         aep $$2 = this.a(lh.ac, $$0);
         aep $$3 = this.a(lh.ae, $$0);
         kr.this.b.accept(kr.b($$0, $$1, $$2, $$3));
         kr.this.a($$0, $$2);
         return this;
      }

      private kr.b k(csk $$0) {
         lk $$1 = kr.this.g.getOrDefault($$0, lk.a.get($$0));
         kr.this.b.accept(kr.c($$0, $$1.a($$0, kr.this.c)));
         return this;
      }

      private kr.b l(csk $$0) {
         kr.this.i($$0);
         return this;
      }

      private void m(csk $$0) {
         if (kr.this.e.contains($$0)) {
            kr.this.k($$0);
         } else {
            kr.this.j($$0);
         }
      }

      private aep a(lg $$0, csk $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, kr.this.c));
      }

      public kr.b a(jg $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<kr.b, csk> $$2 = kr.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      ku create(csk var1, aep var2, li var3, BiConsumer<aep, Supplier<JsonElement>> var4);
   }

   static record d(lg a, String b) {
   }

   static enum e {
      a,
      b;

      public lg a() {
         return this == a ? lh.an : lh.am;
      }

      public lg b() {
         return this == a ? lh.ap : lh.ao;
      }
   }

   class f {
      private final li b;

      public f(li $$0) {
         this.b = $$0;
      }

      public kr.f a(csk $$0) {
         li $$1 = this.b.c(lj.d, this.b.a(lj.i));
         aep $$2 = lh.i.a($$0, $$1, kr.this.c);
         kr.this.b.accept(kr.d($$0, $$2));
         return this;
      }

      public kr.f b(csk $$0) {
         aep $$1 = lh.i.a($$0, this.b, kr.this.c);
         kr.this.b.accept(kr.d($$0, $$1));
         return this;
      }

      public kr.f c(csk $$0) {
         aep $$1 = lh.i.a($$0, this.b, kr.this.c);
         aep $$2 = lh.j.a($$0, this.b, kr.this.c);
         kr.this.b.accept(kr.d($$0, $$1, $$2));
         return this;
      }

      public kr.f d(csk $$0) {
         kr.this.b.accept(kr.a($$0, this.b, kr.this.c));
         return this;
      }
   }
}
