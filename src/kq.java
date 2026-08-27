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

public class kq {
   final Consumer<kt> b;
   final BiConsumer<aer, Supplier<JsonElement>> c;
   private final Consumer<cis> d;
   final List<csl> e = ImmutableList.of(csm.ez, csm.eF, csm.hY);
   final Map<csl, kq.c> f = ImmutableMap.builder().put(csm.b, kq::a).put(csm.rI, kq::c).put(csm.eN, kq::b).build();
   final Map<csl, lj> g = ImmutableMap.builder()
      .put(csm.aV, lj.x.get(csm.aV))
      .put(csm.jp, lj.x.get(csm.jp))
      .put(csm.jS, lj.a(lh.a(csm.aV, "_top")))
      .put(csm.jU, lj.a(lh.a(csm.jp, "_top")))
      .put(csm.aX, lj.c.get(csm.aV).a($$0x -> $$0x.a(li.i, lh.G(csm.aX))))
      .put(csm.jr, lj.c.get(csm.jp).a($$0x -> $$0x.a(li.i, lh.G(csm.jr))))
      .put(csm.hd, lj.c.get(csm.hd))
      .put(csm.jT, lj.a(lh.a(csm.hd, "_bottom")))
      .put(csm.pr, lj.y.get(csm.pr))
      .put(csm.rI, lj.y.get(csm.rI))
      .put(csm.he, lj.c.get(csm.he).a($$0x -> $$0x.a(li.i, lh.G(csm.he))))
      .put(csm.aW, lj.c.get(csm.aW).a($$0x -> {
         $$0x.a(li.d, lh.a(csm.aV, "_top"));
         $$0x.a(li.i, lh.G(csm.aW));
      }))
      .put(csm.jq, lj.c.get(csm.jq).a($$0x -> {
         $$0x.a(li.d, lh.a(csm.jp, "_top"));
         $$0x.a(li.i, lh.G(csm.jq));
      }))
      .build();
   static final Map<jf.b, BiConsumer<kq.b, csl>> h = ImmutableMap.builder()
      .put(jf.b.a, kq.b::a)
      .put(jf.b.e, kq.b::l)
      .put(jf.b.b, kq.b::k)
      .put(jf.b.c, kq.b::k)
      .put(jf.b.f, kq.b::c)
      .put(jf.b.g, kq.b::d)
      .put(jf.b.h, kq.b::e)
      .put(jf.b.i, kq.b::f)
      .put(jf.b.k, kq.b::h)
      .put(jf.b.l, kq.b::i)
      .put(jf.b.m, kq.b::j)
      .put(jf.b.n, kq.b::g)
      .put(jf.b.p, kq.b::m)
      .put(jf.b.q, kq.b::b)
      .build();
   public static final List<Pair<dfq, Function<aer, kz>>> a = List.of(
      Pair.of(dfp.L, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0)),
      Pair.of(dfp.M, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.d, true)),
      Pair.of(dfp.N, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.d, true)),
      Pair.of(dfp.O, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.d, true)),
      Pair.of(dfp.J, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.a, la.a.d).a(la.d, true)),
      Pair.of(dfp.K, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.a, la.a.b).a(la.d, true))
   );
   private static final Map<kq.d, aer> i = new HashMap<>();

   private static kt a(csl $$0, aer $$1, lh $$2, BiConsumer<aer, Supplier<JsonElement>> $$3) {
      aer $$4 = lg.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static kt b(csl $$0, aer $$1, lh $$2, BiConsumer<aer, Supplier<JsonElement>> $$3) {
      aer $$4 = lg.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static kt c(csl $$0, aer $$1, lh $$2, BiConsumer<aer, Supplier<JsonElement>> $$3) {
      aer $$4 = lg.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public kq(Consumer<kt> $$0, BiConsumer<aer, Supplier<JsonElement>> $$1, Consumer<cis> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(csl $$0) {
      this.d.accept($$0.k());
   }

   void a(csl $$0, aer $$1) {
      this.c.accept(le.a($$0.k()), new ld($$1));
   }

   private void a(cis $$0, aer $$1) {
      this.c.accept(le.a($$0), new ld($$1));
   }

   void a(cis $$0) {
      lg.bv.a(le.a($$0), lh.b($$0), this.c);
   }

   private void d(csl $$0) {
      cis $$1 = $$0.k();
      if ($$1 != cja.a) {
         lg.bv.a(le.a($$1), lh.F($$0), this.c);
      }
   }

   private void a(csl $$0, String $$1) {
      cis $$2 = $$0.k();
      lg.bv.a(le.a($$2), lh.k(lh.a($$0, $$1)), this.c);
   }

   private static kx b() {
      return kx.a(dfp.R).a(ha.f, kz.a().a(la.b, la.a.b)).a(ha.d, kz.a().a(la.b, la.a.c)).a(ha.e, kz.a().a(la.b, la.a.d)).a(ha.c, kz.a());
   }

   private static kx c() {
      return kx.a(dfp.R).a(ha.d, kz.a()).a(ha.e, kz.a().a(la.b, la.a.b)).a(ha.c, kz.a().a(la.b, la.a.c)).a(ha.f, kz.a().a(la.b, la.a.d));
   }

   private static kx d() {
      return kx.a(dfp.R).a(ha.f, kz.a()).a(ha.d, kz.a().a(la.b, la.a.b)).a(ha.e, kz.a().a(la.b, la.a.c)).a(ha.c, kz.a().a(la.b, la.a.d));
   }

   private static kx e() {
      return kx.a(dfp.P)
         .a(ha.a, kz.a().a(la.a, la.a.b))
         .a(ha.b, kz.a().a(la.a, la.a.d))
         .a(ha.c, kz.a())
         .a(ha.d, kz.a().a(la.b, la.a.c))
         .a(ha.e, kz.a().a(la.b, la.a.d))
         .a(ha.f, kz.a().a(la.b, la.a.b));
   }

   private static kw b(csl $$0, aer $$1) {
      return kw.a($$0, a($$1));
   }

   private static kz[] a(aer $$0) {
      return new kz[]{kz.a().a(la.c, $$0), kz.a().a(la.c, $$0).a(la.b, la.a.b), kz.a().a(la.c, $$0).a(la.b, la.a.c), kz.a().a(la.c, $$0).a(la.b, la.a.d)};
   }

   private static kw a(csl $$0, aer $$1, aer $$2) {
      return kw.a($$0, kz.a().a(la.c, $$1), kz.a().a(la.c, $$2), kz.a().a(la.c, $$1).a(la.b, la.a.c), kz.a().a(la.c, $$2).a(la.b, la.a.c));
   }

   private static kx a(dfq $$0, aer $$1, aer $$2) {
      return kx.a($$0).a(true, kz.a().a(la.c, $$1)).a(false, kz.a().a(la.c, $$2));
   }

   private void e(csl $$0) {
      aer $$1 = lj.a.create($$0, this.c);
      aer $$2 = lj.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(csl $$0) {
      aer $$1 = lj.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(csl $$0) {
      this.b.accept(kw.a($$0).a(kx.a(dfp.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aer $$3 = lh.a($$0, $$2);
         return kz.a().a(la.c, lg.c.a($$0, $$2, new lh().a(li.a, $$3), this.c));
      })));
      this.a($$0, lh.a($$0, "_0"));
   }

   static kt b(csl $$0, aer $$1, aer $$2) {
      return kw.a($$0)
         .a(kx.a(dfp.w).a(false, kz.a().a(la.c, $$1)).a(true, kz.a().a(la.c, $$2)))
         .a(
            kx.a(dfp.U, dfp.R)
               .a(dfk.a, ha.f, kz.a().a(la.b, la.a.b))
               .a(dfk.a, ha.e, kz.a().a(la.b, la.a.d))
               .a(dfk.a, ha.d, kz.a().a(la.b, la.a.c))
               .a(dfk.a, ha.c, kz.a())
               .a(dfk.b, ha.f, kz.a().a(la.b, la.a.b).a(la.a, la.a.b).a(la.d, true))
               .a(dfk.b, ha.e, kz.a().a(la.b, la.a.d).a(la.a, la.a.b).a(la.d, true))
               .a(dfk.b, ha.d, kz.a().a(la.b, la.a.c).a(la.a, la.a.b).a(la.d, true))
               .a(dfk.b, ha.c, kz.a().a(la.a, la.a.b).a(la.d, true))
               .a(dfk.c, ha.f, kz.a().a(la.b, la.a.d).a(la.a, la.a.c))
               .a(dfk.c, ha.e, kz.a().a(la.b, la.a.b).a(la.a, la.a.c))
               .a(dfk.c, ha.d, kz.a().a(la.a, la.a.c))
               .a(dfk.c, ha.c, kz.a().a(la.b, la.a.c).a(la.a, la.a.c))
         );
   }

   private static kx.d<ha, dfv, dfu, Boolean> a(kx.d<ha, dfv, dfu, Boolean> $$0, dfv $$1, aer $$2, aer $$3, aer $$4, aer $$5) {
      return $$0.a(ha.f, $$1, dfu.a, false, kz.a().a(la.c, $$2))
         .a(ha.d, $$1, dfu.a, false, kz.a().a(la.c, $$2).a(la.b, la.a.b))
         .a(ha.e, $$1, dfu.a, false, kz.a().a(la.c, $$2).a(la.b, la.a.c))
         .a(ha.c, $$1, dfu.a, false, kz.a().a(la.c, $$2).a(la.b, la.a.d))
         .a(ha.f, $$1, dfu.b, false, kz.a().a(la.c, $$4))
         .a(ha.d, $$1, dfu.b, false, kz.a().a(la.c, $$4).a(la.b, la.a.b))
         .a(ha.e, $$1, dfu.b, false, kz.a().a(la.c, $$4).a(la.b, la.a.c))
         .a(ha.c, $$1, dfu.b, false, kz.a().a(la.c, $$4).a(la.b, la.a.d))
         .a(ha.f, $$1, dfu.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.b))
         .a(ha.d, $$1, dfu.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.c))
         .a(ha.e, $$1, dfu.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.d))
         .a(ha.c, $$1, dfu.a, true, kz.a().a(la.c, $$3))
         .a(ha.f, $$1, dfu.b, true, kz.a().a(la.c, $$5).a(la.b, la.a.d))
         .a(ha.d, $$1, dfu.b, true, kz.a().a(la.c, $$5))
         .a(ha.e, $$1, dfu.b, true, kz.a().a(la.c, $$5).a(la.b, la.a.b))
         .a(ha.c, $$1, dfu.b, true, kz.a().a(la.c, $$5).a(la.b, la.a.c));
   }

   private static kt a(csl $$0, aer $$1, aer $$2, aer $$3, aer $$4, aer $$5, aer $$6, aer $$7, aer $$8) {
      return kw.a($$0).a(a(a(kx.a(dfp.R, dfp.ae, dfp.be, dfp.u), dfv.b, $$1, $$2, $$3, $$4), dfv.a, $$5, $$6, $$7, $$8));
   }

   static kt a(csl $$0, aer $$1, aer $$2, aer $$3, aer $$4, aer $$5) {
      return kv.a($$0)
         .a(kz.a().a(la.c, $$1))
         .a(ku.a().a(dfp.L, true), kz.a().a(la.c, $$2).a(la.d, false))
         .a(ku.a().a(dfp.M, true), kz.a().a(la.c, $$3).a(la.d, false))
         .a(ku.a().a(dfp.N, true), kz.a().a(la.c, $$4).a(la.d, false))
         .a(ku.a().a(dfp.O, true), kz.a().a(la.c, $$5).a(la.d, false));
   }

   static kt c(csl $$0, aer $$1, aer $$2) {
      return kv.a($$0)
         .a(kz.a().a(la.c, $$1))
         .a(ku.a().a(dfp.L, true), kz.a().a(la.c, $$2).a(la.d, true))
         .a(ku.a().a(dfp.M, true), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true))
         .a(ku.a().a(dfp.N, true), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true))
         .a(ku.a().a(dfp.O, true), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true));
   }

   static kt a(csl $$0, aer $$1, aer $$2, aer $$3) {
      return kv.a($$0)
         .a(ku.a().a(dfp.J, true), kz.a().a(la.c, $$1))
         .a(ku.a().a(dfp.X, dgl.b), kz.a().a(la.c, $$2).a(la.d, true))
         .a(ku.a().a(dfp.W, dgl.b), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true))
         .a(ku.a().a(dfp.Y, dgl.b), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true))
         .a(ku.a().a(dfp.Z, dgl.b), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true))
         .a(ku.a().a(dfp.X, dgl.c), kz.a().a(la.c, $$3).a(la.d, true))
         .a(ku.a().a(dfp.W, dgl.c), kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true))
         .a(ku.a().a(dfp.Y, dgl.c), kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true))
         .a(ku.a().a(dfp.Z, dgl.c), kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true));
   }

   static kt a(csl $$0, aer $$1, aer $$2, aer $$3, aer $$4, boolean $$5) {
      return kw.a($$0, kz.a().a(la.d, $$5))
         .a(c())
         .a(
            kx.a(dfp.q, dfp.u)
               .a(false, false, kz.a().a(la.c, $$2))
               .a(true, false, kz.a().a(la.c, $$4))
               .a(false, true, kz.a().a(la.c, $$1))
               .a(true, true, kz.a().a(la.c, $$3))
         );
   }

   static kt b(csl $$0, aer $$1, aer $$2, aer $$3) {
      return kw.a($$0)
         .a(
            kx.a(dfp.R, dfp.af, dfp.bi)
               .a(ha.f, dfy.b, dgi.a, kz.a().a(la.c, $$2))
               .a(ha.e, dfy.b, dgi.a, kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfy.b, dgi.a, kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfy.b, dgi.a, kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfy.b, dgi.e, kz.a().a(la.c, $$3))
               .a(ha.e, dfy.b, dgi.e, kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfy.b, dgi.e, kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfy.b, dgi.e, kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfy.b, dgi.d, kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true))
               .a(ha.e, dfy.b, dgi.d, kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true))
               .a(ha.d, dfy.b, dgi.d, kz.a().a(la.c, $$3))
               .a(ha.c, dfy.b, dgi.d, kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true))
               .a(ha.f, dfy.b, dgi.c, kz.a().a(la.c, $$1))
               .a(ha.e, dfy.b, dgi.c, kz.a().a(la.c, $$1).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfy.b, dgi.c, kz.a().a(la.c, $$1).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfy.b, dgi.c, kz.a().a(la.c, $$1).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfy.b, dgi.b, kz.a().a(la.c, $$1).a(la.b, la.a.d).a(la.d, true))
               .a(ha.e, dfy.b, dgi.b, kz.a().a(la.c, $$1).a(la.b, la.a.b).a(la.d, true))
               .a(ha.d, dfy.b, dgi.b, kz.a().a(la.c, $$1))
               .a(ha.c, dfy.b, dgi.b, kz.a().a(la.c, $$1).a(la.b, la.a.c).a(la.d, true))
               .a(ha.f, dfy.a, dgi.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.d, true))
               .a(ha.e, dfy.a, dgi.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfy.a, dgi.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfy.a, dgi.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfy.a, dgi.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.e, dfy.a, dgi.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
               .a(ha.d, dfy.a, dgi.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.c, dfy.a, dgi.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.d, true))
               .a(ha.f, dfy.a, dgi.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.d, true))
               .a(ha.e, dfy.a, dgi.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfy.a, dgi.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfy.a, dgi.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfy.a, dgi.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.e, dfy.a, dgi.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
               .a(ha.d, dfy.a, dgi.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.c, dfy.a, dgi.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.d, true))
               .a(ha.f, dfy.a, dgi.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.d, true))
               .a(ha.e, dfy.a, dgi.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfy.a, dgi.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfy.a, dgi.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
         );
   }

   private static kt c(csl $$0, aer $$1, aer $$2, aer $$3) {
      return kw.a($$0)
         .a(
            kx.a(dfp.R, dfp.af, dfp.u)
               .a(ha.c, dfy.b, false, kz.a().a(la.c, $$2))
               .a(ha.d, dfy.b, false, kz.a().a(la.c, $$2).a(la.b, la.a.c))
               .a(ha.f, dfy.b, false, kz.a().a(la.c, $$2).a(la.b, la.a.b))
               .a(ha.e, dfy.b, false, kz.a().a(la.c, $$2).a(la.b, la.a.d))
               .a(ha.c, dfy.a, false, kz.a().a(la.c, $$1))
               .a(ha.d, dfy.a, false, kz.a().a(la.c, $$1).a(la.b, la.a.c))
               .a(ha.f, dfy.a, false, kz.a().a(la.c, $$1).a(la.b, la.a.b))
               .a(ha.e, dfy.a, false, kz.a().a(la.c, $$1).a(la.b, la.a.d))
               .a(ha.c, dfy.b, true, kz.a().a(la.c, $$3))
               .a(ha.d, dfy.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.c))
               .a(ha.f, dfy.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ha.e, dfy.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.d))
               .a(ha.c, dfy.a, true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.c))
               .a(ha.d, dfy.a, true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.a))
               .a(ha.f, dfy.a, true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.d))
               .a(ha.e, dfy.a, true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.b))
         );
   }

   private static kt d(csl $$0, aer $$1, aer $$2, aer $$3) {
      return kw.a($$0)
         .a(
            kx.a(dfp.R, dfp.af, dfp.u)
               .a(ha.c, dfy.b, false, kz.a().a(la.c, $$2))
               .a(ha.d, dfy.b, false, kz.a().a(la.c, $$2))
               .a(ha.f, dfy.b, false, kz.a().a(la.c, $$2))
               .a(ha.e, dfy.b, false, kz.a().a(la.c, $$2))
               .a(ha.c, dfy.a, false, kz.a().a(la.c, $$1))
               .a(ha.d, dfy.a, false, kz.a().a(la.c, $$1))
               .a(ha.f, dfy.a, false, kz.a().a(la.c, $$1))
               .a(ha.e, dfy.a, false, kz.a().a(la.c, $$1))
               .a(ha.c, dfy.b, true, kz.a().a(la.c, $$3))
               .a(ha.d, dfy.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.c))
               .a(ha.f, dfy.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ha.e, dfy.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.d))
               .a(ha.c, dfy.a, true, kz.a().a(la.c, $$3))
               .a(ha.d, dfy.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.c))
               .a(ha.f, dfy.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ha.e, dfy.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.d))
         );
   }

   static kw c(csl $$0, aer $$1) {
      return kw.a($$0, kz.a().a(la.c, $$1));
   }

   private static kx f() {
      return kx.a(dfp.I).a(ha.a.b, kz.a()).a(ha.a.c, kz.a().a(la.a, la.a.b)).a(ha.a.a, kz.a().a(la.a, la.a.b).a(la.b, la.a.b));
   }

   static kt a(csl $$0, lh $$1, BiConsumer<aer, Supplier<JsonElement>> $$2) {
      aer $$3 = lg.f.a($$0, $$1, $$2);
      aer $$4 = lg.g.a($$0, $$1, $$2);
      aer $$5 = lg.h.a($$0, $$1, $$2);
      aer $$6 = lg.i.a($$0, $$1, $$2);
      return kw.a($$0, kz.a().a(la.c, $$6)).a(kx.a(dfp.I).a(ha.a.a, kz.a().a(la.c, $$3)).a(ha.a.b, kz.a().a(la.c, $$4)).a(ha.a.c, kz.a().a(la.c, $$5)));
   }

   static kt d(csl $$0, aer $$1) {
      return kw.a($$0, kz.a().a(la.c, $$1)).a(f());
   }

   private void e(csl $$0, aer $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(csl $$0, lj.a $$1) {
      aer $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(csl $$0, lj.a $$1) {
      aer $$2 = $$1.create($$0, this.c);
      this.b.accept(kw.a($$0, kz.a().a(la.c, $$2)).a(b()));
   }

   static kt d(csl $$0, aer $$1, aer $$2) {
      return kw.a($$0)
         .a(
            kx.a(dfp.I)
               .a(ha.a.b, kz.a().a(la.c, $$1))
               .a(ha.a.c, kz.a().a(la.c, $$2).a(la.a, la.a.b))
               .a(ha.a.a, kz.a().a(la.c, $$2).a(la.a, la.a.b).a(la.b, la.a.b))
         );
   }

   private void a(csl $$0, lj.a $$1, lj.a $$2) {
      aer $$3 = $$1.create($$0, this.c);
      aer $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aer a(csl $$0, String $$1, lf $$2, Function<aer, lh> $$3) {
      return $$2.a($$0, $$1, $$3.apply(lh.a($$0, $$1)), this.c);
   }

   static kt e(csl $$0, aer $$1, aer $$2) {
      return kw.a($$0).a(a(dfp.w, $$2, $$1));
   }

   static kt e(csl $$0, aer $$1, aer $$2, aer $$3) {
      return kw.a($$0).a(kx.a(dfp.bh).a(dgh.b, kz.a().a(la.c, $$1)).a(dgh.a, kz.a().a(la.c, $$2)).a(dgh.c, kz.a().a(la.c, $$3)));
   }

   public void a(csl $$0) {
      this.b($$0, lj.a);
   }

   public void b(csl $$0, lj.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(csl $$0, lh $$1, lf $$2) {
      aer $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private kq.b h(csl $$0) {
      lj $$1 = this.g.getOrDefault($$0, lj.a.get($$0));
      return new kq.b($$1.b()).a($$0, $$1.a());
   }

   public void a(csl $$0, csl $$1, csl $$2) {
      lh $$3 = lh.u($$0);
      aer $$4 = lg.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(csl $$0) {
      lh $$1 = lh.t($$0);
      aer $$2 = lg.t.a($$0, $$1, this.c);
      aer $$3 = lg.u.a($$0, $$1, this.c);
      aer $$4 = lg.v.a($$0, $$1, this.c);
      aer $$5 = lg.w.a($$0, $$1, this.c);
      aer $$6 = lg.x.a($$0, $$1, this.c);
      aer $$7 = lg.y.a($$0, $$1, this.c);
      aer $$8 = lg.z.a($$0, $$1, this.c);
      aer $$9 = lg.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(csl $$0) {
      lh $$1 = lh.b($$0);
      aer $$2 = lg.ai.a($$0, $$1, this.c);
      aer $$3 = lg.aj.a($$0, $$1, this.c);
      aer $$4 = lg.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(csl $$0) {
      lh $$1 = lh.b($$0);
      aer $$2 = lg.af.a($$0, $$1, this.c);
      aer $$3 = lg.ag.a($$0, $$1, this.c);
      aer $$4 = lg.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(csm.rC);
      aer $$0 = le.a(csm.rC);
      aer $$1 = le.a(csm.rC, "_partial_tilt");
      aer $$2 = le.a(csm.rC, "_full_tilt");
      this.b
         .accept(
            kw.a(csm.rC)
               .a(b())
               .a(kx.a(dfp.bl).a(dgk.a, kz.a().a(la.c, $$0)).a(dgk.b, kz.a().a(la.c, $$0)).a(dgk.c, kz.a().a(la.c, $$1)).a(dgk.d, kz.a().a(la.c, $$2)))
         );
   }

   private kq.f l(csl $$0) {
      return new kq.f(lh.n($$0));
   }

   private void m(csl $$0) {
      this.a($$0, $$0);
   }

   private void a(csl $$0, csl $$1) {
      this.b.accept(c($$0, le.a($$1)));
   }

   private void a(csl $$0, kq.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(csl $$0, kq.e $$1, lh $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csl $$0, kq.e $$1) {
      lh $$2 = lh.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csl $$0, kq.e $$1, lh $$2) {
      aer $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(csl $$0, kq.e $$1, dgc<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         kx $$4 = kx.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            lh $$5 = lh.c(lh.a($$0, $$4x));
            aer $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return kz.a().a(la.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(kw.a($$0).a($$4));
      }
   }

   private void a(csl $$0, csl $$1, kq.e $$2) {
      this.a($$0, $$2);
      lh $$3 = lh.d($$0);
      aer $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(csl $$0, csl $$1) {
      lj $$2 = lj.o.get($$0);
      aer $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aer $$4 = lg.aA.a($$1, $$2.b(), this.c);
      this.b.accept(kw.a($$1, kz.a().a(la.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(csl $$0, csl $$1) {
      this.a($$0.k());
      lh $$2 = lh.h($$0);
      lh $$3 = lh.a($$0, $$1);
      aer $$4 = lg.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            kw.a($$1, kz.a().a(la.c, $$4))
               .a(kx.a(dfp.R).a(ha.e, kz.a()).a(ha.d, kz.a().a(la.b, la.a.d)).a(ha.c, kz.a().a(la.b, la.a.b)).a(ha.f, kz.a().a(la.b, la.a.c)))
         );
      this.b.accept(kw.a($$0).a(kx.a(dfp.av).a($$2x -> kz.a().a(la.c, lg.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      csl $$0 = csm.kC;
      this.a($$0.k());
      aer $$1 = le.a($$0, "_top");
      aer $$2 = le.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      csl $$0 = csm.kB;
      this.a($$0.k());
      kx $$1 = kx.a(cxy.b, dfp.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> kz.a().a(la.c, le.a($$0, "_top_stage_" + $$1x));
            case b -> kz.a().a(la.c, le.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(kw.a($$0).a($$1));
   }

   private void a(csl $$0, csl $$1, csl $$2, csl $$3, csl $$4, csl $$5, csl $$6, csl $$7) {
      this.a($$0, kq.e.b);
      this.a($$1, kq.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(csl $$0, kq.e $$1) {
      this.a($$0, "_top");
      aer $$2 = this.a($$0, "_top", $$1.a(), lh::c);
      aer $$3 = this.a($$0, "_bottom", $$1.a(), lh::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(csm.iD, "_front");
      aer $$0 = le.a(csm.iD, "_top");
      aer $$1 = this.a(csm.iD, "_bottom", kq.e.b.a(), lh::c);
      this.f(csm.iD, $$0, $$1);
   }

   private void k() {
      aer $$0 = this.a(csm.bx, "_top", lg.bi, lh::a);
      aer $$1 = this.a(csm.bx, "_bottom", lg.bi, lh::a);
      this.f(csm.bx, $$0, $$1);
   }

   private void l() {
      this.c(csm.rE);
      aer $$0 = le.a(csm.rE, "_top");
      aer $$1 = le.a(csm.rE, "_bottom");
      this.b.accept(kw.a(csm.rE).a(b()).a(kx.a(dfp.ae).a(dfv.b, kz.a().a(la.c, $$1)).a(dfv.a, kz.a().a(la.c, $$0))));
   }

   private void f(csl $$0, aer $$1, aer $$2) {
      this.b.accept(kw.a($$0).a(kx.a(dfp.ae).a(dfv.b, kz.a().a(la.c, $$2)).a(dfv.a, kz.a().a(la.c, $$1))));
   }

   private void n(csl $$0) {
      lh $$1 = lh.e($$0);
      lh $$2 = lh.e(lh.a($$0, "_corner"));
      aer $$3 = lg.aq.a($$0, $$1, this.c);
      aer $$4 = lg.ar.a($$0, $$2, this.c);
      aer $$5 = lg.as.a($$0, $$1, this.c);
      aer $$6 = lg.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            kw.a($$0)
               .a(
                  kx.a(dfp.ag)
                     .a(dgd.a, kz.a().a(la.c, $$3))
                     .a(dgd.b, kz.a().a(la.c, $$3).a(la.b, la.a.b))
                     .a(dgd.c, kz.a().a(la.c, $$5).a(la.b, la.a.b))
                     .a(dgd.d, kz.a().a(la.c, $$6).a(la.b, la.a.b))
                     .a(dgd.e, kz.a().a(la.c, $$5))
                     .a(dgd.f, kz.a().a(la.c, $$6))
                     .a(dgd.g, kz.a().a(la.c, $$4))
                     .a(dgd.h, kz.a().a(la.c, $$4).a(la.b, la.a.b))
                     .a(dgd.i, kz.a().a(la.c, $$4).a(la.b, la.a.c))
                     .a(dgd.j, kz.a().a(la.c, $$4).a(la.b, la.a.d))
               )
         );
   }

   private void o(csl $$0) {
      aer $$1 = this.a($$0, "", lg.aq, lh::e);
      aer $$2 = this.a($$0, "", lg.as, lh::e);
      aer $$3 = this.a($$0, "", lg.at, lh::e);
      aer $$4 = this.a($$0, "_on", lg.aq, lh::e);
      aer $$5 = this.a($$0, "_on", lg.as, lh::e);
      aer $$6 = this.a($$0, "_on", lg.at, lh::e);
      kx $$7 = kx.a(dfp.w, dfp.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return kz.a().a(la.c, $$6x ? $$4 : $$1);
            case b:
               return kz.a().a(la.c, $$6x ? $$4 : $$1).a(la.b, la.a.b);
            case c:
               return kz.a().a(la.c, $$6x ? $$5 : $$2).a(la.b, la.a.b);
            case d:
               return kz.a().a(la.c, $$6x ? $$6 : $$3).a(la.b, la.a.b);
            case e:
               return kz.a().a(la.c, $$6x ? $$5 : $$2);
            case f:
               return kz.a().a(la.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(kw.a($$0).a($$7));
   }

   private kq.a a(aer $$0, csl $$1) {
      return new kq.a($$0, $$1);
   }

   private kq.a d(csl $$0, csl $$1) {
      return new kq.a(le.a($$0), $$1);
   }

   private void a(csl $$0, cis $$1) {
      aer $$2 = lg.Y.a($$0, lh.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(csl $$0, aer $$1) {
      aer $$2 = lg.Y.a($$0, lh.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(csl $$0, csl $$1) {
      this.a($$0);
      aer $$2 = lj.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(csl $$0) {
      this.a($$0.k());
      aer $$1 = lj.j.create($$0, this.c);
      aer $$2 = lj.k.create($$0, this.c);
      aer $$3 = lj.l.create($$0, this.c);
      aer $$4 = lj.m.create($$0, this.c);
      this.b
         .accept(
            kv.a($$0)
               .a(ku.a().a(dfp.S, 1, 2, 3, 4).a(dfp.R, ha.c), kz.a().a(la.c, $$1))
               .a(ku.a().a(dfp.S, 1, 2, 3, 4).a(dfp.R, ha.f), kz.a().a(la.c, $$1).a(la.b, la.a.b))
               .a(ku.a().a(dfp.S, 1, 2, 3, 4).a(dfp.R, ha.d), kz.a().a(la.c, $$1).a(la.b, la.a.c))
               .a(ku.a().a(dfp.S, 1, 2, 3, 4).a(dfp.R, ha.e), kz.a().a(la.c, $$1).a(la.b, la.a.d))
               .a(ku.a().a(dfp.S, 2, 3, 4).a(dfp.R, ha.c), kz.a().a(la.c, $$2))
               .a(ku.a().a(dfp.S, 2, 3, 4).a(dfp.R, ha.f), kz.a().a(la.c, $$2).a(la.b, la.a.b))
               .a(ku.a().a(dfp.S, 2, 3, 4).a(dfp.R, ha.d), kz.a().a(la.c, $$2).a(la.b, la.a.c))
               .a(ku.a().a(dfp.S, 2, 3, 4).a(dfp.R, ha.e), kz.a().a(la.c, $$2).a(la.b, la.a.d))
               .a(ku.a().a(dfp.S, 3, 4).a(dfp.R, ha.c), kz.a().a(la.c, $$3))
               .a(ku.a().a(dfp.S, 3, 4).a(dfp.R, ha.f), kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ku.a().a(dfp.S, 3, 4).a(dfp.R, ha.d), kz.a().a(la.c, $$3).a(la.b, la.a.c))
               .a(ku.a().a(dfp.S, 3, 4).a(dfp.R, ha.e), kz.a().a(la.c, $$3).a(la.b, la.a.d))
               .a(ku.a().a(dfp.S, 4).a(dfp.R, ha.c), kz.a().a(la.c, $$4))
               .a(ku.a().a(dfp.S, 4).a(dfp.R, ha.f), kz.a().a(la.c, $$4).a(la.b, la.a.b))
               .a(ku.a().a(dfp.S, 4).a(dfp.R, ha.d), kz.a().a(la.c, $$4).a(la.b, la.a.c))
               .a(ku.a().a(dfp.S, 4).a(dfp.R, ha.e), kz.a().a(la.c, $$4).a(la.b, la.a.d))
         );
   }

   private void a(lj.a $$0, csl... $$1) {
      for (csl $$2 : $$1) {
         aer $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(lj.a $$0, csl... $$1) {
      for (csl $$2 : $$1) {
         aer $$3 = $$0.create($$2, this.c);
         this.b.accept(kw.a($$2, kz.a().a(la.c, $$3)).a(c()));
      }
   }

   private void f(csl $$0, csl $$1) {
      this.a($$0);
      lh $$2 = lh.b($$0, $$1);
      aer $$3 = lg.aG.a($$1, $$2, this.c);
      aer $$4 = lg.aH.a($$1, $$2, this.c);
      aer $$5 = lg.aI.a($$1, $$2, this.c);
      aer $$6 = lg.aE.a($$1, $$2, this.c);
      aer $$7 = lg.aF.a($$1, $$2, this.c);
      cis $$8 = $$1.k();
      lg.bv.a(le.a($$8), lh.F($$0), this.c);
      this.b
         .accept(
            kv.a($$1)
               .a(kz.a().a(la.c, $$3))
               .a(ku.a().a(dfp.L, true), kz.a().a(la.c, $$4))
               .a(ku.a().a(dfp.M, true), kz.a().a(la.c, $$4).a(la.b, la.a.b))
               .a(ku.a().a(dfp.N, true), kz.a().a(la.c, $$5))
               .a(ku.a().a(dfp.O, true), kz.a().a(la.c, $$5).a(la.b, la.a.b))
               .a(ku.a().a(dfp.L, false), kz.a().a(la.c, $$6))
               .a(ku.a().a(dfp.M, false), kz.a().a(la.c, $$7))
               .a(ku.a().a(dfp.N, false), kz.a().a(la.c, $$7).a(la.b, la.a.b))
               .a(ku.a().a(dfp.O, false), kz.a().a(la.c, $$6).a(la.b, la.a.d))
         );
   }

   private void q(csl $$0) {
      lh $$1 = lh.z($$0);
      aer $$2 = lg.aJ.a($$0, $$1, this.c);
      aer $$3 = this.a($$0, "_conditional", lg.aJ, $$1x -> $$1.c(li.i, $$1x));
      this.b.accept(kw.a($$0).a(a(dfp.c, $$3, $$2)).a(e()));
   }

   private void r(csl $$0) {
      aer $$1 = lj.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<kz> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> kz.a().a(la.c, le.a(csm.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(csm.mZ);
      this.b
         .accept(
            kv.a(csm.mZ)
               .a(ku.a().a(dfp.aq, 0), this.a(0))
               .a(ku.a().a(dfp.aq, 1), this.a(1))
               .a(ku.a().a(dfp.bk, dfl.b), kz.a().a(la.c, le.a(csm.mZ, "_small_leaves")))
               .a(ku.a().a(dfp.bk, dfl.c), kz.a().a(la.c, le.a(csm.mZ, "_large_leaves")))
         );
   }

   private kx n() {
      return kx.a(dfp.P)
         .a(ha.a, kz.a().a(la.a, la.a.c))
         .a(ha.b, kz.a())
         .a(ha.c, kz.a().a(la.a, la.a.b))
         .a(ha.d, kz.a().a(la.a, la.a.b).a(la.b, la.a.c))
         .a(ha.e, kz.a().a(la.a, la.a.b).a(la.b, la.a.d))
         .a(ha.f, kz.a().a(la.a, la.a.b).a(la.b, la.a.b));
   }

   private void o() {
      aer $$0 = lh.a(csm.nU, "_top_open");
      this.b
         .accept(
            kw.a(csm.nU)
               .a(this.n())
               .a(
                  kx.a(dfp.u)
                     .a(false, kz.a().a(la.c, lj.e.create(csm.nU, this.c)))
                     .a(true, kz.a().a(la.c, lj.e.get(csm.nU).a($$1 -> $$1.a(li.f, $$0)).a(csm.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> kx a(dgc<T> $$0, T $$1, aer $$2, aer $$3) {
      kz $$4 = kz.a().a(la.c, $$2);
      kz $$5 = kz.a().a(la.c, $$3);
      return kx.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(csl $$0, Function<csl, lh> $$1) {
      lh $$2 = $$1.apply($$0).b(li.i, li.c);
      lh $$3 = $$2.c(li.g, lh.a($$0, "_front_honey"));
      aer $$4 = lg.o.a($$0, $$2, this.c);
      aer $$5 = lg.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(kw.a($$0).a(b()).a(a(dfp.aN, 5, $$5, $$4)));
   }

   private void a(csl $$0, dgc<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aer> $$3 = new Int2ObjectOpenHashMap();
         kx $$4 = kx.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aer $$5 = (aer)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, lg.aT, lh::g));
            return kz.a().a(la.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(kw.a($$0).a($$4));
      }
   }

   private void p() {
      aer $$0 = le.a(csm.od, "_floor");
      aer $$1 = le.a(csm.od, "_ceiling");
      aer $$2 = le.a(csm.od, "_wall");
      aer $$3 = le.a(csm.od, "_between_walls");
      this.a(cja.vs);
      this.b
         .accept(
            kw.a(csm.od)
               .a(
                  kx.a(dfp.R, dfp.V)
                     .a(ha.c, dfn.a, kz.a().a(la.c, $$0))
                     .a(ha.d, dfn.a, kz.a().a(la.c, $$0).a(la.b, la.a.c))
                     .a(ha.f, dfn.a, kz.a().a(la.c, $$0).a(la.b, la.a.b))
                     .a(ha.e, dfn.a, kz.a().a(la.c, $$0).a(la.b, la.a.d))
                     .a(ha.c, dfn.b, kz.a().a(la.c, $$1))
                     .a(ha.d, dfn.b, kz.a().a(la.c, $$1).a(la.b, la.a.c))
                     .a(ha.f, dfn.b, kz.a().a(la.c, $$1).a(la.b, la.a.b))
                     .a(ha.e, dfn.b, kz.a().a(la.c, $$1).a(la.b, la.a.d))
                     .a(ha.c, dfn.c, kz.a().a(la.c, $$2).a(la.b, la.a.d))
                     .a(ha.d, dfn.c, kz.a().a(la.c, $$2).a(la.b, la.a.b))
                     .a(ha.f, dfn.c, kz.a().a(la.c, $$2))
                     .a(ha.e, dfn.c, kz.a().a(la.c, $$2).a(la.b, la.a.c))
                     .a(ha.d, dfn.d, kz.a().a(la.c, $$3).a(la.b, la.a.b))
                     .a(ha.c, dfn.d, kz.a().a(la.c, $$3).a(la.b, la.a.d))
                     .a(ha.f, dfn.d, kz.a().a(la.c, $$3))
                     .a(ha.e, dfn.d, kz.a().a(la.c, $$3).a(la.b, la.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            kw.a(csm.nZ, kz.a().a(la.c, le.a(csm.nZ)))
               .a(
                  kx.a(dfp.U, dfp.R)
                     .a(dfk.a, ha.c, kz.a())
                     .a(dfk.a, ha.f, kz.a().a(la.b, la.a.b))
                     .a(dfk.a, ha.d, kz.a().a(la.b, la.a.c))
                     .a(dfk.a, ha.e, kz.a().a(la.b, la.a.d))
                     .a(dfk.b, ha.c, kz.a().a(la.a, la.a.b))
                     .a(dfk.b, ha.f, kz.a().a(la.a, la.a.b).a(la.b, la.a.b))
                     .a(dfk.b, ha.d, kz.a().a(la.a, la.a.b).a(la.b, la.a.c))
                     .a(dfk.b, ha.e, kz.a().a(la.a, la.a.b).a(la.b, la.a.d))
                     .a(dfk.c, ha.d, kz.a().a(la.a, la.a.c))
                     .a(dfk.c, ha.e, kz.a().a(la.a, la.a.c).a(la.b, la.a.b))
                     .a(dfk.c, ha.c, kz.a().a(la.a, la.a.c).a(la.b, la.a.c))
                     .a(dfk.c, ha.f, kz.a().a(la.a, la.a.c).a(la.b, la.a.d))
               )
         );
   }

   private void d(csl $$0, lj.a $$1) {
      aer $$2 = $$1.create($$0, this.c);
      aer $$3 = lh.a($$0, "_front_on");
      aer $$4 = $$1.get($$0).a($$1x -> $$1x.a(li.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(kw.a($$0).a(a(dfp.r, $$4, $$2)).a(b()));
   }

   private void a(csl... $$0) {
      aer $$1 = le.a("campfire_off");

      for (csl $$2 : $$0) {
         aer $$3 = lg.ba.a($$2, lh.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(kw.a($$2).a(a(dfp.r, $$3, $$1)).a(c()));
      }
   }

   private void s(csl $$0) {
      aer $$1 = lg.br.a($$0, lh.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(csl $$0) {
      aer $$1;
      if ($$0 == csm.si) {
         $$1 = lg.bt.a($$0, lh.m($$0), this.c);
      } else {
         $$1 = lg.bs.a($$0, lh.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      lh $$0 = lh.a(lh.G(csm.cl), lh.G(csm.n));
      aer $$1 = lg.i.a(csm.cl, $$0, this.c);
      this.b.accept(c(csm.cl, $$1));
   }

   private void s() {
      this.a(cja.ll);
      this.b
         .accept(
            kv.a(csm.cw)
               .a(
                  ku.b(
                     ku.a().a(dfp.ab, dge.c).a(dfp.aa, dge.c).a(dfp.ac, dge.c).a(dfp.ad, dge.c),
                     ku.a().a(dfp.ab, dge.b, dge.a).a(dfp.aa, dge.b, dge.a),
                     ku.a().a(dfp.aa, dge.b, dge.a).a(dfp.ac, dge.b, dge.a),
                     ku.a().a(dfp.ac, dge.b, dge.a).a(dfp.ad, dge.b, dge.a),
                     ku.a().a(dfp.ad, dge.b, dge.a).a(dfp.ab, dge.b, dge.a)
                  ),
                  kz.a().a(la.c, le.a("redstone_dust_dot"))
               )
               .a(ku.a().a(dfp.ab, dge.b, dge.a), kz.a().a(la.c, le.a("redstone_dust_side0")))
               .a(ku.a().a(dfp.ac, dge.b, dge.a), kz.a().a(la.c, le.a("redstone_dust_side_alt0")))
               .a(ku.a().a(dfp.aa, dge.b, dge.a), kz.a().a(la.c, le.a("redstone_dust_side_alt1")).a(la.b, la.a.d))
               .a(ku.a().a(dfp.ad, dge.b, dge.a), kz.a().a(la.c, le.a("redstone_dust_side1")).a(la.b, la.a.d))
               .a(ku.a().a(dfp.ab, dge.a), kz.a().a(la.c, le.a("redstone_dust_up")))
               .a(ku.a().a(dfp.aa, dge.a), kz.a().a(la.c, le.a("redstone_dust_up")).a(la.b, la.a.b))
               .a(ku.a().a(dfp.ac, dge.a), kz.a().a(la.c, le.a("redstone_dust_up")).a(la.b, la.a.c))
               .a(ku.a().a(dfp.ad, dge.a), kz.a().a(la.c, le.a("redstone_dust_up")).a(la.b, la.a.d))
         );
   }

   private void t() {
      this.a(cja.lp);
      this.b
         .accept(
            kw.a(csm.gY)
               .a(c())
               .a(
                  kx.a(dfp.bd, dfp.w)
                     .a(dfs.a, false, kz.a().a(la.c, le.a(csm.gY)))
                     .a(dfs.a, true, kz.a().a(la.c, le.a(csm.gY, "_on")))
                     .a(dfs.b, false, kz.a().a(la.c, le.a(csm.gY, "_subtract")))
                     .a(dfs.b, true, kz.a().a(la.c, le.a(csm.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      lh $$0 = lh.a(csm.jR);
      lh $$1 = lh.a(lh.a(csm.jE, "_side"), $$0.a(li.f));
      aer $$2 = lg.Z.a(csm.jE, $$1, this.c);
      aer $$3 = lg.aa.a(csm.jE, $$1, this.c);
      aer $$4 = lg.i.b(csm.jE, "_double", $$1, this.c);
      this.b.accept(e(csm.jE, $$2, $$3, $$4));
      this.b.accept(c(csm.jR, lg.c.a(csm.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cja.rB);
      this.b
         .accept(
            kv.a(csm.fs)
               .a(kz.a().a(la.c, lh.G(csm.fs)))
               .a(ku.a().a(dfp.k, true), kz.a().a(la.c, lh.a(csm.fs, "_bottle0")))
               .a(ku.a().a(dfp.l, true), kz.a().a(la.c, lh.a(csm.fs, "_bottle1")))
               .a(ku.a().a(dfp.m, true), kz.a().a(la.c, lh.a(csm.fs, "_bottle2")))
               .a(ku.a().a(dfp.k, false), kz.a().a(la.c, lh.a(csm.fs, "_empty0")))
               .a(ku.a().a(dfp.l, false), kz.a().a(la.c, lh.a(csm.fs, "_empty1")))
               .a(ku.a().a(dfp.m, false), kz.a().a(la.c, lh.a(csm.fs, "_empty2")))
         );
   }

   private void u(csl $$0) {
      aer $$1 = lg.bn.a($$0, lh.b($$0), this.c);
      aer $$2 = le.a("mushroom_block_inside");
      this.b
         .accept(
            kv.a($$0)
               .a(ku.a().a(dfp.L, true), kz.a().a(la.c, $$1))
               .a(ku.a().a(dfp.M, true), kz.a().a(la.c, $$1).a(la.b, la.a.b).a(la.d, true))
               .a(ku.a().a(dfp.N, true), kz.a().a(la.c, $$1).a(la.b, la.a.c).a(la.d, true))
               .a(ku.a().a(dfp.O, true), kz.a().a(la.c, $$1).a(la.b, la.a.d).a(la.d, true))
               .a(ku.a().a(dfp.J, true), kz.a().a(la.c, $$1).a(la.a, la.a.d).a(la.d, true))
               .a(ku.a().a(dfp.K, true), kz.a().a(la.c, $$1).a(la.a, la.a.b).a(la.d, true))
               .a(ku.a().a(dfp.L, false), kz.a().a(la.c, $$2))
               .a(ku.a().a(dfp.M, false), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, false))
               .a(ku.a().a(dfp.N, false), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, false))
               .a(ku.a().a(dfp.O, false), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, false))
               .a(ku.a().a(dfp.J, false), kz.a().a(la.c, $$2).a(la.a, la.a.d).a(la.d, false))
               .a(ku.a().a(dfp.K, false), kz.a().a(la.c, $$2).a(la.a, la.a.b).a(la.d, false))
         );
      this.a($$0, lj.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cja.qN);
      this.b
         .accept(
            kw.a(csm.eh)
               .a(
                  kx.a(dfp.ay)
                     .a(0, kz.a().a(la.c, le.a(csm.eh)))
                     .a(1, kz.a().a(la.c, le.a(csm.eh, "_slice1")))
                     .a(2, kz.a().a(la.c, le.a(csm.eh, "_slice2")))
                     .a(3, kz.a().a(la.c, le.a(csm.eh, "_slice3")))
                     .a(4, kz.a().a(la.c, le.a(csm.eh, "_slice4")))
                     .a(5, kz.a().a(la.c, le.a(csm.eh, "_slice5")))
                     .a(6, kz.a().a(la.c, le.a(csm.eh, "_slice6")))
               )
         );
   }

   private void x() {
      lh $$0 = new lh()
         .a(li.c, lh.a(csm.nX, "_side3"))
         .a(li.o, lh.G(csm.t))
         .a(li.n, lh.a(csm.nX, "_top"))
         .a(li.j, lh.a(csm.nX, "_side3"))
         .a(li.l, lh.a(csm.nX, "_side3"))
         .a(li.k, lh.a(csm.nX, "_side1"))
         .a(li.m, lh.a(csm.nX, "_side2"));
      this.b.accept(c(csm.nX, lg.a.a(csm.nX, $$0, this.c)));
   }

   private void y() {
      lh $$0 = new lh()
         .a(li.c, lh.a(csm.ob, "_front"))
         .a(li.o, lh.a(csm.ob, "_bottom"))
         .a(li.n, lh.a(csm.ob, "_top"))
         .a(li.j, lh.a(csm.ob, "_front"))
         .a(li.k, lh.a(csm.ob, "_front"))
         .a(li.l, lh.a(csm.ob, "_side"))
         .a(li.m, lh.a(csm.ob, "_side"));
      this.b.accept(c(csm.ob, lg.a.a(csm.ob, $$0, this.c)));
   }

   private void a(csl $$0, csl $$1, BiFunction<csl, csl, lh> $$2) {
      lh $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, lg.a.a($$0, $$3, this.c)));
   }

   public void b(csl $$0) {
      lh $$1 = new lh()
         .a(li.c, lh.a($$0, "_particle"))
         .a(li.o, lh.a($$0, "_down"))
         .a(li.n, lh.a($$0, "_up"))
         .a(li.j, lh.a($$0, "_north"))
         .a(li.k, lh.a($$0, "_south"))
         .a(li.l, lh.a($$0, "_east"))
         .a(li.m, lh.a($$0, "_west"));
      this.b.accept(c($$0, lg.a.a($$0, $$1, this.c)));
   }

   private void z() {
      lh $$0 = lh.k(csm.dV);
      this.b.accept(c(csm.dV, le.a(csm.dV)));
      this.a(csm.ef, $$0);
      this.a(csm.eg, $$0);
   }

   private void a(csl $$0, lh $$1) {
      aer $$2 = lg.n.a($$0, $$1.c(li.g, lh.G($$0)), this.c);
      this.b.accept(kw.a($$0, kz.a().a(la.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cja.rC);
      this.m(csm.ft);
      this.b.accept(c(csm.fv, lg.bq.a(csm.fv, lh.j(lh.a(csm.H, "_still")), this.c)));
      this.b
         .accept(
            kw.a(csm.fu)
               .a(
                  kx.a(cwr.e)
                     .a(1, kz.a().a(la.c, lg.bo.a(csm.fu, "_level1", lh.j(lh.a(csm.G, "_still")), this.c)))
                     .a(2, kz.a().a(la.c, lg.bp.a(csm.fu, "_level2", lh.j(lh.a(csm.G, "_still")), this.c)))
                     .a(3, kz.a().a(la.c, lg.bq.a(csm.fu, "_full", lh.j(lh.a(csm.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            kw.a(csm.fw)
               .a(
                  kx.a(cwr.e)
                     .a(1, kz.a().a(la.c, lg.bo.a(csm.fw, "_level1", lh.j(lh.G(csm.qC)), this.c)))
                     .a(2, kz.a().a(la.c, lg.bp.a(csm.fw, "_level2", lh.j(lh.G(csm.qC)), this.c)))
                     .a(3, kz.a().a(la.c, lg.bq.a(csm.fw, "_full", lh.j(lh.G(csm.qC)), this.c)))
               )
         );
   }

   private void B() {
      lh $$0 = lh.b(csm.kv);
      aer $$1 = lg.aC.a(csm.kv, $$0, this.c);
      aer $$2 = this.a(csm.kv, "_dead", lg.aC, $$1x -> $$0.c(li.b, $$1x));
      this.b.accept(kw.a(csm.kv).a(a(dfp.au, 5, $$2, $$1)));
   }

   private void v(csl $$0) {
      lh $$1 = new lh().a(li.f, lh.a(csm.cD, "_top")).a(li.i, lh.a(csm.cD, "_side")).a(li.g, lh.a($$0, "_front"));
      lh $$2 = new lh().a(li.i, lh.a(csm.cD, "_top")).a(li.g, lh.a($$0, "_front_vertical"));
      aer $$3 = lg.n.a($$0, $$1, this.c);
      aer $$4 = lg.p.a($$0, $$2, this.c);
      this.b
         .accept(
            kw.a($$0)
               .a(
                  kx.a(dfp.P)
                     .a(ha.a, kz.a().a(la.c, $$4).a(la.a, la.a.c))
                     .a(ha.b, kz.a().a(la.c, $$4))
                     .a(ha.c, kz.a().a(la.c, $$3))
                     .a(ha.f, kz.a().a(la.c, $$3).a(la.b, la.a.b))
                     .a(ha.d, kz.a().a(la.c, $$3).a(la.b, la.a.c))
                     .a(ha.e, kz.a().a(la.c, $$3).a(la.b, la.a.d))
               )
         );
   }

   private void C() {
      aer $$0 = le.a(csm.fy);
      aer $$1 = le.a(csm.fy, "_filled");
      this.b.accept(kw.a(csm.fy).a(kx.a(dfp.h).a(false, kz.a().a(la.c, $$0)).a(true, kz.a().a(la.c, $$1))).a(c()));
   }

   private void D() {
      aer $$0 = le.a(csm.ku, "_side");
      aer $$1 = le.a(csm.ku, "_noside");
      aer $$2 = le.a(csm.ku, "_noside1");
      aer $$3 = le.a(csm.ku, "_noside2");
      aer $$4 = le.a(csm.ku, "_noside3");
      this.b
         .accept(
            kv.a(csm.ku)
               .a(ku.a().a(dfp.L, true), kz.a().a(la.c, $$0))
               .a(ku.a().a(dfp.M, true), kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.d, true))
               .a(ku.a().a(dfp.N, true), kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.d, true))
               .a(ku.a().a(dfp.O, true), kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.d, true))
               .a(ku.a().a(dfp.J, true), kz.a().a(la.c, $$0).a(la.a, la.a.d).a(la.d, true))
               .a(ku.a().a(dfp.K, true), kz.a().a(la.c, $$0).a(la.a, la.a.b).a(la.d, true))
               .a(ku.a().a(dfp.L, false), kz.a().a(la.c, $$1).a(la.e, 2), kz.a().a(la.c, $$2), kz.a().a(la.c, $$3), kz.a().a(la.c, $$4))
               .a(
                  ku.a().a(dfp.M, false),
                  kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$4).a(la.b, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.b, la.a.b).a(la.d, true)
               )
               .a(
                  ku.a().a(dfp.N, false),
                  kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true),
                  kz.a().a(la.c, $$4).a(la.b, la.a.c).a(la.d, true),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.b, la.a.c).a(la.d, true),
                  kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true)
               )
               .a(
                  ku.a().a(dfp.O, false),
                  kz.a().a(la.c, $$4).a(la.b, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.b, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true)
               )
               .a(
                  ku.a().a(dfp.J, false),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.a, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$4).a(la.a, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$2).a(la.a, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$3).a(la.a, la.a.d).a(la.d, true)
               )
               .a(
                  ku.a().a(dfp.K, false),
                  kz.a().a(la.c, $$4).a(la.a, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$3).a(la.a, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$2).a(la.a, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.a, la.a.b).a(la.d, true)
               )
         );
   }

   private void E() {
      this.b
         .accept(
            kv.a(csm.pc)
               .a(kz.a().a(la.c, lh.G(csm.pc)))
               .a(ku.a().a(dfp.aL, 1), kz.a().a(la.c, lh.a(csm.pc, "_contents1")))
               .a(ku.a().a(dfp.aL, 2), kz.a().a(la.c, lh.a(csm.pc, "_contents2")))
               .a(ku.a().a(dfp.aL, 3), kz.a().a(la.c, lh.a(csm.pc, "_contents3")))
               .a(ku.a().a(dfp.aL, 4), kz.a().a(la.c, lh.a(csm.pc, "_contents4")))
               .a(ku.a().a(dfp.aL, 5), kz.a().a(la.c, lh.a(csm.pc, "_contents5")))
               .a(ku.a().a(dfp.aL, 6), kz.a().a(la.c, lh.a(csm.pc, "_contents6")))
               .a(ku.a().a(dfp.aL, 7), kz.a().a(la.c, lh.a(csm.pc, "_contents7")))
               .a(ku.a().a(dfp.aL, 8), kz.a().a(la.c, lh.a(csm.pc, "_contents_ready")))
         );
   }

   private void w(csl $$0) {
      this.c($$0);
      this.b.accept(kw.a($$0, kz.a().a(la.c, lg.am.a($$0, lh.c($$0), this.c))).a(this.n()));
   }

   private void F() {
      this.w(csm.qy);
      this.w(csm.qx);
      this.w(csm.qw);
      this.w(csm.qv);
   }

   private void G() {
      this.c(csm.rs);
      kx.b<ha, dfw> $$0 = kx.a(dfp.bm, dfp.bn);

      for (dfw $$1 : dfw.values()) {
         $$0.a(ha.b, $$1, this.a(ha.b, $$1));
      }

      for (dfw $$2 : dfw.values()) {
         $$0.a(ha.a, $$2, this.a(ha.a, $$2));
      }

      this.b.accept(kw.a(csm.rs).a($$0));
   }

   private kz a(ha $$0, dfw $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      lh $$3 = lh.c(lh.a(csm.rs, $$2));
      return kz.a().a(la.c, lg.al.a(csm.rs, $$2, $$3, this.c));
   }

   private void x(csl $$0) {
      lh $$1 = new lh().a(li.e, lh.G(csm.dW)).a(li.f, lh.G($$0)).a(li.i, lh.a($$0, "_side"));
      this.b.accept(c($$0, lg.m.a($$0, $$1, this.c)));
   }

   private void H() {
      aer $$0 = lh.a(csm.gZ, "_side");
      lh $$1 = new lh().a(li.f, lh.a(csm.gZ, "_top")).a(li.i, $$0);
      lh $$2 = new lh().a(li.f, lh.a(csm.gZ, "_inverted_top")).a(li.i, $$0);
      this.b
         .accept(
            kw.a(csm.gZ)
               .a(kx.a(dfp.p).a(false, kz.a().a(la.c, lg.aD.a(csm.gZ, $$1, this.c))).a(true, kz.a().a(la.c, lg.aD.a(le.a(csm.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(csl $$0) {
      this.b.accept(kw.a($$0, kz.a().a(la.c, le.a($$0))).a(this.n()));
   }

   private void I() {
      csl $$0 = csm.rr;
      aer $$1 = le.a($$0, "_on");
      aer $$2 = le.a($$0);
      this.b.accept(kw.a($$0, kz.a().a(la.c, le.a($$0))).a(this.n()).a(a(dfp.w, $$1, $$2)));
   }

   private void J() {
      lh $$0 = new lh().a(li.B, lh.G(csm.j)).a(li.f, lh.G(csm.cC));
      lh $$1 = new lh().a(li.B, lh.G(csm.j)).a(li.f, lh.a(csm.cC, "_moist"));
      aer $$2 = lg.aU.a(csm.cC, $$0, this.c);
      aer $$3 = lg.aU.a(lh.a(csm.cC, "_moist"), $$1, this.c);
      this.b.accept(kw.a(csm.cC).a(a(dfp.aQ, 7, $$3, $$2)));
   }

   private List<aer> z(csl $$0) {
      aer $$1 = lg.aV.a(le.a($$0, "_floor0"), lh.v($$0), this.c);
      aer $$2 = lg.aV.a(le.a($$0, "_floor1"), lh.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aer> A(csl $$0) {
      aer $$1 = lg.aW.a(le.a($$0, "_side0"), lh.v($$0), this.c);
      aer $$2 = lg.aW.a(le.a($$0, "_side1"), lh.w($$0), this.c);
      aer $$3 = lg.aX.a(le.a($$0, "_side_alt0"), lh.v($$0), this.c);
      aer $$4 = lg.aX.a(le.a($$0, "_side_alt1"), lh.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aer> B(csl $$0) {
      aer $$1 = lg.aY.a(le.a($$0, "_up0"), lh.v($$0), this.c);
      aer $$2 = lg.aY.a(le.a($$0, "_up1"), lh.w($$0), this.c);
      aer $$3 = lg.aZ.a(le.a($$0, "_up_alt0"), lh.v($$0), this.c);
      aer $$4 = lg.aZ.a(le.a($$0, "_up_alt1"), lh.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<kz> a(List<aer> $$0, UnaryOperator<kz> $$1) {
      return $$0.stream().map($$0x -> kz.a().a(la.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void K() {
      ku $$0 = ku.a().a(dfp.L, false).a(dfp.M, false).a(dfp.N, false).a(dfp.O, false).a(dfp.J, false);
      List<aer> $$1 = this.z(csm.cr);
      List<aer> $$2 = this.A(csm.cr);
      List<aer> $$3 = this.B(csm.cr);
      this.b
         .accept(
            kv.a(csm.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(ku.b(ku.a().a(dfp.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(ku.b(ku.a().a(dfp.M, true), $$0), a($$2, $$0x -> $$0x.a(la.b, la.a.b)))
               .a(ku.b(ku.a().a(dfp.N, true), $$0), a($$2, $$0x -> $$0x.a(la.b, la.a.c)))
               .a(ku.b(ku.a().a(dfp.O, true), $$0), a($$2, $$0x -> $$0x.a(la.b, la.a.d)))
               .a(ku.a().a(dfp.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void L() {
      List<aer> $$0 = this.z(csm.cs);
      List<aer> $$1 = this.A(csm.cs);
      this.b
         .accept(
            kv.a(csm.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(la.b, la.a.b)))
               .a(a($$1, $$0x -> $$0x.a(la.b, la.a.c)))
               .a(a($$1, $$0x -> $$0x.a(la.b, la.a.d)))
         );
   }

   private void C(csl $$0) {
      aer $$1 = lj.s.create($$0, this.c);
      aer $$2 = lj.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(kw.a($$0).a(a(dfp.j, $$2, $$1)));
   }

   private void M() {
      lh $$0 = lh.a(lh.a(csm.ad, "_side"), lh.a(csm.ad, "_top"));
      aer $$1 = lg.i.a(csm.ad, $$0, this.c);
      this.b.accept(d(csm.ad, $$1));
   }

   private void N() {
      this.a(cja.Q);
      csl $$0 = csm.E;
      kx.b<Boolean, Integer> $$1 = kx.a(cxd.c, cxd.a);
      aer $$2 = le.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aer $$4 = le.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, kz.a().a(la.c, $$4));
         $$1.a(false, $$3, kz.a().a(la.c, $$2));
      }

      this.b.accept(kw.a(csm.E).a($$1));
   }

   private void O() {
      this.b
         .accept(
            kw.a(csm.kI)
               .a(
                  kx.a(dfp.as)
                     .a(0, kz.a().a(la.c, this.a(csm.kI, "_0", lg.c, lh::b)))
                     .a(1, kz.a().a(la.c, this.a(csm.kI, "_1", lg.c, lh::b)))
                     .a(2, kz.a().a(la.c, this.a(csm.kI, "_2", lg.c, lh::b)))
                     .a(3, kz.a().a(la.c, this.a(csm.kI, "_3", lg.c, lh::b)))
               )
         );
   }

   private void P() {
      aer $$0 = lh.G(csm.j);
      lh $$1 = new lh().a(li.e, $$0).b(li.e, li.c).a(li.f, lh.a(csm.i, "_top")).a(li.i, lh.a(csm.i, "_snow"));
      kz $$2 = kz.a().a(la.c, lg.m.a(csm.i, "_snow", $$1, this.c));
      this.a(csm.i, le.a(csm.i), $$2);
      aer $$3 = lj.e.get(csm.fl).a($$1x -> $$1x.a(li.e, $$0)).a(csm.fl, this.c);
      this.a(csm.fl, $$3, $$2);
      aer $$4 = lj.e.get(csm.l).a($$1x -> $$1x.a(li.e, $$0)).a(csm.l, this.c);
      this.a(csm.l, $$4, $$2);
   }

   private void a(csl $$0, aer $$1, kz $$2) {
      List<kz> $$3 = Arrays.asList(a($$1));
      this.b.accept(kw.a($$0).a(kx.a(dfp.z).a(true, $$2).a(false, $$3)));
   }

   private void Q() {
      this.a(cja.qt);
      this.b
         .accept(
            kw.a(csm.fC)
               .a(
                  kx.a(dfp.ar)
                     .a(0, kz.a().a(la.c, le.a(csm.fC, "_stage0")))
                     .a(1, kz.a().a(la.c, le.a(csm.fC, "_stage1")))
                     .a(2, kz.a().a(la.c, le.a(csm.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void R() {
      this.b.accept(b(csm.kE, le.a(csm.kE)));
   }

   private void g(csl $$0, csl $$1) {
      lh $$2 = lh.b($$1);
      aer $$3 = lg.W.a($$0, $$2, this.c);
      aer $$4 = lg.X.a($$0, $$2, this.c);
      this.b.accept(kw.a($$0).a(a(dfp.aT, 1, $$4, $$3)));
   }

   private void S() {
      aer $$0 = le.a(csm.hc);
      aer $$1 = le.a(csm.hc, "_side");
      this.a(cja.lv);
      this.b
         .accept(
            kw.a(csm.hc)
               .a(
                  kx.a(dfp.Q)
                     .a(ha.a, kz.a().a(la.c, $$0))
                     .a(ha.c, kz.a().a(la.c, $$1))
                     .a(ha.f, kz.a().a(la.c, $$1).a(la.b, la.a.b))
                     .a(ha.d, kz.a().a(la.c, $$1).a(la.b, la.a.c))
                     .a(ha.e, kz.a().a(la.c, $$1).a(la.b, la.a.d))
               )
         );
   }

   private void h(csl $$0, csl $$1) {
      aer $$2 = le.a($$0);
      this.b.accept(kw.a($$1, kz.a().a(la.c, $$2)));
      this.a($$1, $$2);
   }

   private void T() {
      aer $$0 = le.a(csm.eX, "_post_ends");
      aer $$1 = le.a(csm.eX, "_post");
      aer $$2 = le.a(csm.eX, "_cap");
      aer $$3 = le.a(csm.eX, "_cap_alt");
      aer $$4 = le.a(csm.eX, "_side");
      aer $$5 = le.a(csm.eX, "_side_alt");
      this.b
         .accept(
            kv.a(csm.eX)
               .a(kz.a().a(la.c, $$0))
               .a(ku.a().a(dfp.L, false).a(dfp.M, false).a(dfp.N, false).a(dfp.O, false), kz.a().a(la.c, $$1))
               .a(ku.a().a(dfp.L, true).a(dfp.M, false).a(dfp.N, false).a(dfp.O, false), kz.a().a(la.c, $$2))
               .a(ku.a().a(dfp.L, false).a(dfp.M, true).a(dfp.N, false).a(dfp.O, false), kz.a().a(la.c, $$2).a(la.b, la.a.b))
               .a(ku.a().a(dfp.L, false).a(dfp.M, false).a(dfp.N, true).a(dfp.O, false), kz.a().a(la.c, $$3))
               .a(ku.a().a(dfp.L, false).a(dfp.M, false).a(dfp.N, false).a(dfp.O, true), kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ku.a().a(dfp.L, true), kz.a().a(la.c, $$4))
               .a(ku.a().a(dfp.M, true), kz.a().a(la.c, $$4).a(la.b, la.a.b))
               .a(ku.a().a(dfp.N, true), kz.a().a(la.c, $$5))
               .a(ku.a().a(dfp.O, true), kz.a().a(la.c, $$5).a(la.b, la.a.b))
         );
      this.d(csm.eX);
   }

   private void D(csl $$0) {
      this.b.accept(kw.a($$0, kz.a().a(la.c, le.a($$0))).a(b()));
   }

   private void U() {
      aer $$0 = le.a(csm.dw);
      aer $$1 = le.a(csm.dw, "_on");
      this.d(csm.dw);
      this.b
         .accept(
            kw.a(csm.dw)
               .a(a(dfp.w, $$0, $$1))
               .a(
                  kx.a(dfp.U, dfp.R)
                     .a(dfk.c, ha.c, kz.a().a(la.a, la.a.c).a(la.b, la.a.c))
                     .a(dfk.c, ha.f, kz.a().a(la.a, la.a.c).a(la.b, la.a.d))
                     .a(dfk.c, ha.d, kz.a().a(la.a, la.a.c))
                     .a(dfk.c, ha.e, kz.a().a(la.a, la.a.c).a(la.b, la.a.b))
                     .a(dfk.a, ha.c, kz.a())
                     .a(dfk.a, ha.f, kz.a().a(la.b, la.a.b))
                     .a(dfk.a, ha.d, kz.a().a(la.b, la.a.c))
                     .a(dfk.a, ha.e, kz.a().a(la.b, la.a.d))
                     .a(dfk.b, ha.c, kz.a().a(la.a, la.a.b))
                     .a(dfk.b, ha.f, kz.a().a(la.a, la.a.b).a(la.b, la.a.b))
                     .a(dfk.b, ha.d, kz.a().a(la.a, la.a.b).a(la.b, la.a.c))
                     .a(dfk.b, ha.e, kz.a().a(la.a, la.a.b).a(la.b, la.a.d))
               )
         );
   }

   private void V() {
      this.d(csm.fm);
      this.b.accept(b(csm.fm, le.a(csm.fm)));
   }

   private void W() {
      this.d(csm.sm);
      this.b.accept(c(csm.sm, le.a(csm.sm)));
   }

   private void X() {
      this.b.accept(kw.a(csm.ee).a(kx.a(dfp.H).a(ha.a.a, kz.a().a(la.c, le.a(csm.ee, "_ns"))).a(ha.a.c, kz.a().a(la.c, le.a(csm.ee, "_ew")))));
   }

   private void Y() {
      aer $$0 = lj.a.create(csm.dW, this.c);
      this.b
         .accept(
            kw.a(
               csm.dW,
               kz.a().a(la.c, $$0),
               kz.a().a(la.c, $$0).a(la.a, la.a.b),
               kz.a().a(la.c, $$0).a(la.a, la.a.c),
               kz.a().a(la.c, $$0).a(la.a, la.a.d),
               kz.a().a(la.c, $$0).a(la.b, la.a.b),
               kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.a, la.a.b),
               kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.a, la.a.c),
               kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.a, la.a.d),
               kz.a().a(la.c, $$0).a(la.b, la.a.c),
               kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.a, la.a.b),
               kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.a, la.a.c),
               kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.a, la.a.d),
               kz.a().a(la.c, $$0).a(la.b, la.a.d),
               kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.a, la.a.b),
               kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.a, la.a.c),
               kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.a, la.a.d)
            )
         );
   }

   private void Z() {
      aer $$0 = le.a(csm.kO);
      aer $$1 = le.a(csm.kO, "_on");
      this.b.accept(kw.a(csm.kO).a(a(dfp.w, $$1, $$0)).a(e()));
   }

   private void aa() {
      lh $$0 = new lh().a(li.e, lh.a(csm.by, "_bottom")).a(li.i, lh.a(csm.by, "_side"));
      aer $$1 = lh.a(csm.by, "_top_sticky");
      aer $$2 = lh.a(csm.by, "_top");
      lh $$3 = $$0.c(li.E, $$1);
      lh $$4 = $$0.c(li.E, $$2);
      aer $$5 = le.a(csm.by, "_base");
      this.a(csm.by, $$5, $$4);
      this.a(csm.br, $$5, $$3);
      aer $$6 = lg.m.a(csm.by, "_inventory", $$0.c(li.f, $$2), this.c);
      aer $$7 = lg.m.a(csm.br, "_inventory", $$0.c(li.f, $$1), this.c);
      this.a(csm.by, $$6);
      this.a(csm.br, $$7);
   }

   private void a(csl $$0, aer $$1, lh $$2) {
      aer $$3 = lg.bf.a($$0, $$2, this.c);
      this.b.accept(kw.a($$0).a(a(dfp.g, $$1, $$3)).a(e()));
   }

   private void ab() {
      lh $$0 = new lh().a(li.F, lh.a(csm.by, "_top")).a(li.i, lh.a(csm.by, "_side"));
      lh $$1 = $$0.c(li.E, lh.a(csm.by, "_top_sticky"));
      lh $$2 = $$0.c(li.E, lh.a(csm.by, "_top"));
      this.b
         .accept(
            kw.a(csm.bz)
               .a(
                  kx.a(dfp.x, dfp.bg)
                     .a(false, dgb.a, kz.a().a(la.c, lg.bg.a(csm.by, "_head", $$2, this.c)))
                     .a(false, dgb.b, kz.a().a(la.c, lg.bg.a(csm.by, "_head_sticky", $$1, this.c)))
                     .a(true, dgb.a, kz.a().a(la.c, lg.bh.a(csm.by, "_head_short", $$2, this.c)))
                     .a(true, dgb.b, kz.a().a(la.c, lg.bh.a(csm.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ac() {
      aer $$0 = le.a(csm.qD, "_inactive");
      aer $$1 = le.a(csm.qD, "_active");
      this.a(csm.qD, $$0);
      this.b.accept(kw.a(csm.qD).a(kx.a(dfp.bo).a($$2 -> kz.a().a(la.c, $$2 != dgg.b && $$2 != dgg.c ? $$0 : $$1))));
   }

   private void ad() {
      aer $$0 = le.a(csm.qE, "_inactive");
      aer $$1 = le.a(csm.qE, "_active");
      this.a(csm.qE, $$0);
      this.b.accept(kw.a(csm.qE).a(kx.a(dfp.bo).a($$2 -> kz.a().a(la.c, $$2 != dgg.b && $$2 != dgg.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      aer $$0 = lg.bK.a(csm.qI, lh.a(false), this.c);
      aer $$1 = lg.bK.a(csm.qI, "_can_summon", lh.a(true), this.c);
      this.a(csm.qI, $$0);
      this.b.accept(kw.a(csm.qI).a(a(dfp.G, $$1, $$0)));
   }

   private void af() {
      aer $$0 = le.a(csm.nS, "_stable");
      aer $$1 = le.a(csm.nS, "_unstable");
      this.a(csm.nS, $$0);
      this.b.accept(kw.a(csm.nS).a(a(dfp.b, $$1, $$0)));
   }

   private void ag() {
      aer $$0 = this.a(csm.ru, "", lg.am, lh::c);
      aer $$1 = this.a(csm.ru, "_lit", lg.am, lh::c);
      this.b.accept(kw.a(csm.ru).a(a(dfp.D, $$1, $$0)));
      aer $$2 = this.a(csm.rv, "", lg.am, lh::c);
      aer $$3 = this.a(csm.rv, "_lit", lg.am, lh::c);
      this.b.accept(kw.a(csm.rv).a(a(dfp.D, $$3, $$2)));
   }

   private void ah() {
      aer $$0 = lj.a.create(csm.fB, this.c);
      aer $$1 = this.a(csm.fB, "_on", lg.c, lh::b);
      this.b.accept(kw.a(csm.fB).a(a(dfp.r, $$1, $$0)));
   }

   private void i(csl $$0, csl $$1) {
      lh $$2 = lh.y($$0);
      this.b.accept(c($$0, lg.bd.a($$0, $$2, this.c)));
      this.b.accept(kw.a($$1, kz.a().a(la.c, lg.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      lh $$0 = lh.y(csm.dK);
      lh $$1 = lh.i(lh.a(csm.dK, "_off"));
      aer $$2 = lg.bd.a(csm.dK, $$0, this.c);
      aer $$3 = lg.bd.a(csm.dK, "_off", $$1, this.c);
      this.b.accept(kw.a(csm.dK).a(a(dfp.r, $$2, $$3)));
      aer $$4 = lg.be.a(csm.dL, $$0, this.c);
      aer $$5 = lg.be.a(csm.dL, "_off", $$1, this.c);
      this.b.accept(kw.a(csm.dL).a(a(dfp.r, $$4, $$5)).a(d()));
      this.d(csm.dK);
      this.c(csm.dL);
   }

   private void aj() {
      this.a(cja.lo);
      this.b.accept(kw.a(csm.ei).a(kx.a(dfp.aA, dfp.s, dfp.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return kz.a().a(la.c, lh.a(csm.ei, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(cja.cx);
      this.b
         .accept(
            kw.a(csm.mV)
               .a(
                  kx.a(dfp.aS, dfp.C)
                     .a(1, false, Arrays.asList(a(le.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(le.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(le.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(le.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(le.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(le.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(le.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(le.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      lh $$0 = lh.a(csm.dN);
      aer $$1 = lg.c.a(csm.dP, $$0, this.c);
      this.b.accept(kw.a(csm.dN).a(kx.a(dfp.aF).a($$1x -> kz.a().a(la.c, $$1x < 8 ? le.a(csm.dN, "_height" + $$1x * 2) : $$1))));
      this.a(csm.dN, le.a(csm.dN, "_height2"));
      this.b.accept(c(csm.dP, $$1));
   }

   private void am() {
      this.b.accept(kw.a(csm.oc, kz.a().a(la.c, le.a(csm.oc))).a(b()));
   }

   private void an() {
      aer $$0 = lj.a.create(csm.pa, this.c);
      this.a(csm.pa, $$0);
      this.b.accept(kw.a(csm.pa).a(kx.a(dfp.bj).a($$0x -> kz.a().a(la.c, this.a(csm.pa, "_" + $$0x.c(), lg.c, lh::b)))));
   }

   private void ao() {
      this.a(cja.vv);
      this.b.accept(kw.a(csm.oi).a(kx.a(dfp.as).a($$0 -> kz.a().a(la.c, this.a(csm.oi, "_stage" + $$0, lg.am, lh::c)))));
   }

   private void ap() {
      this.a(cja.oE);
      this.b
         .accept(
            kw.a(csm.fI)
               .a(
                  kx.a(dfp.a, dfp.M, dfp.L, dfp.N, dfp.O)
                     .a(false, false, false, false, false, kz.a().a(la.c, le.a(csm.fI, "_ns")))
                     .a(false, true, false, false, false, kz.a().a(la.c, le.a(csm.fI, "_n")).a(la.b, la.a.b))
                     .a(false, false, true, false, false, kz.a().a(la.c, le.a(csm.fI, "_n")))
                     .a(false, false, false, true, false, kz.a().a(la.c, le.a(csm.fI, "_n")).a(la.b, la.a.c))
                     .a(false, false, false, false, true, kz.a().a(la.c, le.a(csm.fI, "_n")).a(la.b, la.a.d))
                     .a(false, true, true, false, false, kz.a().a(la.c, le.a(csm.fI, "_ne")))
                     .a(false, true, false, true, false, kz.a().a(la.c, le.a(csm.fI, "_ne")).a(la.b, la.a.b))
                     .a(false, false, false, true, true, kz.a().a(la.c, le.a(csm.fI, "_ne")).a(la.b, la.a.c))
                     .a(false, false, true, false, true, kz.a().a(la.c, le.a(csm.fI, "_ne")).a(la.b, la.a.d))
                     .a(false, false, true, true, false, kz.a().a(la.c, le.a(csm.fI, "_ns")))
                     .a(false, true, false, false, true, kz.a().a(la.c, le.a(csm.fI, "_ns")).a(la.b, la.a.b))
                     .a(false, true, true, true, false, kz.a().a(la.c, le.a(csm.fI, "_nse")))
                     .a(false, true, false, true, true, kz.a().a(la.c, le.a(csm.fI, "_nse")).a(la.b, la.a.b))
                     .a(false, false, true, true, true, kz.a().a(la.c, le.a(csm.fI, "_nse")).a(la.b, la.a.c))
                     .a(false, true, true, false, true, kz.a().a(la.c, le.a(csm.fI, "_nse")).a(la.b, la.a.d))
                     .a(false, true, true, true, true, kz.a().a(la.c, le.a(csm.fI, "_nsew")))
                     .a(true, false, false, false, false, kz.a().a(la.c, le.a(csm.fI, "_attached_ns")))
                     .a(true, false, true, false, false, kz.a().a(la.c, le.a(csm.fI, "_attached_n")))
                     .a(true, false, false, true, false, kz.a().a(la.c, le.a(csm.fI, "_attached_n")).a(la.b, la.a.c))
                     .a(true, true, false, false, false, kz.a().a(la.c, le.a(csm.fI, "_attached_n")).a(la.b, la.a.b))
                     .a(true, false, false, false, true, kz.a().a(la.c, le.a(csm.fI, "_attached_n")).a(la.b, la.a.d))
                     .a(true, true, true, false, false, kz.a().a(la.c, le.a(csm.fI, "_attached_ne")))
                     .a(true, true, false, true, false, kz.a().a(la.c, le.a(csm.fI, "_attached_ne")).a(la.b, la.a.b))
                     .a(true, false, false, true, true, kz.a().a(la.c, le.a(csm.fI, "_attached_ne")).a(la.b, la.a.c))
                     .a(true, false, true, false, true, kz.a().a(la.c, le.a(csm.fI, "_attached_ne")).a(la.b, la.a.d))
                     .a(true, false, true, true, false, kz.a().a(la.c, le.a(csm.fI, "_attached_ns")))
                     .a(true, true, false, false, true, kz.a().a(la.c, le.a(csm.fI, "_attached_ns")).a(la.b, la.a.b))
                     .a(true, true, true, true, false, kz.a().a(la.c, le.a(csm.fI, "_attached_nse")))
                     .a(true, true, false, true, true, kz.a().a(la.c, le.a(csm.fI, "_attached_nse")).a(la.b, la.a.b))
                     .a(true, false, true, true, true, kz.a().a(la.c, le.a(csm.fI, "_attached_nse")).a(la.b, la.a.c))
                     .a(true, true, true, false, true, kz.a().a(la.c, le.a(csm.fI, "_attached_nse")).a(la.b, la.a.d))
                     .a(true, true, true, true, true, kz.a().a(la.c, le.a(csm.fI, "_attached_nsew")))
               )
         );
   }

   private void aq() {
      this.d(csm.fH);
      this.b.accept(kw.a(csm.fH).a(kx.a(dfp.a, dfp.w).a(($$0, $$1) -> kz.a().a(la.c, lh.a(csm.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aer a(int $$0, String $$1, lh $$2) {
      switch ($$0) {
         case 1:
            return lg.bj.a(le.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return lg.bk.a(le.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return lg.bl.a(le.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return lg.bm.a(le.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private aer a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", lh.b(lh.G(csm.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", lh.b(lh.a(csm.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", lh.b(lh.a(csm.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ar() {
      this.a(cja.jT);
      this.b.accept(kw.a(csm.mf).a(kx.a(dfp.aD, dfp.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void as() {
      this.a(cja.jU);
      Function<Integer, aer> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         lh $$2 = lh.a($$1);
         return lg.bu.a(csm.mg, $$1, $$2, this.c);
      };
      this.b.accept(kw.a(csm.mg).a(kx.a(czt.b).a($$1 -> kz.a().a(la.c, $$0.apply($$1)))));
   }

   private void E(csl $$0) {
      this.d($$0);
      aer $$1 = le.a($$0);
      kv $$2 = kv.a($$0);
      ku.c $$3 = ac.a(ku.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dfq, Function<aer, kz>> $$4 : a) {
         dfq $$5 = (dfq)$$4.getFirst();
         Function<aer, kz> $$6 = (Function<aer, kz>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(ku.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void at() {
      aer $$0 = lh.a(csm.qH, "_bottom");
      lh $$1 = new lh().a(li.e, $$0).a(li.f, lh.a(csm.qH, "_top")).a(li.i, lh.a(csm.qH, "_side"));
      lh $$2 = new lh().a(li.e, $$0).a(li.f, lh.a(csm.qH, "_top_bloom")).a(li.i, lh.a(csm.qH, "_side_bloom"));
      aer $$3 = lg.m.a(csm.qH, "", $$1, this.c);
      aer $$4 = lg.m.a(csm.qH, "_bloom", $$2, this.c);
      this.b.accept(kw.a(csm.qH).a(kx.a(dfp.E).a($$2x -> kz.a().a(la.c, $$2x ? $$4 : $$3))));
      this.a(cja.fN, $$3);
   }

   private void au() {
      csl $$0 = csm.cm;
      aer $$1 = le.a($$0);
      kv $$2 = kv.a($$0);
      Map.of(ha.c, la.a.a, ha.f, la.a.b, ha.d, la.a.c, ha.e, la.a.d).forEach(($$2x, $$3) -> {
         ku.c $$4 = ku.a().a(dfp.R, $$2x);
         $$2.a($$4, kz.a().a(la.c, $$1).a(la.b, $$3).a(la.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, le.a($$0, "_inventory"));
      i.clear();
   }

   private void a(kv $$0, ku.c $$1, la.a $$2) {
      Map.of(dfp.bp, lg.aK, dfp.bq, lg.aL, dfp.br, lg.aM, dfp.bs, lg.aN, dfp.bt, lg.aO, dfp.bu, lg.aP).forEach(($$3, $$4) -> {
         this.a($$0, $$1, $$2, $$3, $$4, true);
         this.a($$0, $$1, $$2, $$3, $$4, false);
      });
   }

   private void a(kv $$0, ku.c $$1, la.a $$2, dfq $$3, lf $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      lh $$7 = new lh().a(li.b, lh.a(csm.cm, $$6));
      kq.d $$8 = new kq.d($$4, $$6);
      aer $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(csm.cm, $$6, $$7, this.c));
      $$0.a(ku.a($$1, ku.a().a($$3, $$5)), kz.a().a(la.c, $$9).a(la.b, $$2));
   }

   private void av() {
      this.b.accept(c(csm.kJ, lg.c.a(csm.kJ, lh.b(le.a("magma")), this.c)));
   }

   private void F(csl $$0) {
      this.b($$0, lj.p);
      lg.bB.a(le.a($$0.k()), lh.u($$0), this.c);
   }

   private void b(csl $$0, csl $$1, kq.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(csl $$0, csl $$1) {
      lg.bC.a(le.a($$0.k()), lh.u($$1), this.c);
   }

   private void aw() {
      aer $$0 = le.a(csm.b);
      aer $$1 = le.a(csm.b, "_mirrored");
      this.b.accept(a(csm.eO, $$0, $$1));
      this.a(csm.eO, $$0);
   }

   private void ax() {
      aer $$0 = le.a(csm.rI);
      aer $$1 = le.a(csm.rI, "_mirrored");
      this.b.accept(a(csm.sc, $$0, $$1).a(f()));
      this.a(csm.sc, $$0);
   }

   private void k(csl $$0, csl $$1) {
      this.a($$0, kq.e.b);
      lh $$2 = lh.d(lh.a($$0, "_pot"));
      aer $$3 = kq.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void ay() {
      aer $$0 = lh.a(csm.pl, "_bottom");
      aer $$1 = lh.a(csm.pl, "_top_off");
      aer $$2 = lh.a(csm.pl, "_top");
      aer[] $$3 = new aer[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         lh $$5 = new lh().a(li.e, $$0).a(li.f, $$4 == 0 ? $$1 : $$2).a(li.i, lh.a(csm.pl, "_side" + $$4));
         $$3[$$4] = lg.m.a(csm.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(kw.a(csm.pl).a(kx.a(dfp.aZ).a($$1x -> kz.a().a(la.c, $$3[$$1x]))));
      this.a(cja.vT, $$3[0]);
   }

   private kz a(hc $$0, kz $$1) {
      switch ($$0) {
         case b:
            return $$1.a(la.a, la.a.b);
         case c:
            return $$1.a(la.a, la.a.b).a(la.b, la.a.c);
         case d:
            return $$1.a(la.a, la.a.b).a(la.b, la.a.d);
         case a:
            return $$1.a(la.a, la.a.b).a(la.b, la.a.b);
         case f:
            return $$1.a(la.a, la.a.d).a(la.b, la.a.c);
         case g:
            return $$1.a(la.a, la.a.d);
         case h:
            return $$1.a(la.a, la.a.d).a(la.b, la.a.b);
         case e:
            return $$1.a(la.a, la.a.d).a(la.b, la.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(la.b, la.a.c);
         case i:
            return $$1.a(la.b, la.a.d);
         case j:
            return $$1.a(la.b, la.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void az() {
      aer $$0 = lh.a(csm.pb, "_top");
      aer $$1 = lh.a(csm.pb, "_bottom");
      aer $$2 = lh.a(csm.pb, "_side");
      aer $$3 = lh.a(csm.pb, "_lock");
      lh $$4 = new lh().a(li.o, $$2).a(li.m, $$2).a(li.l, $$2).a(li.c, $$0).a(li.j, $$0).a(li.k, $$1).a(li.n, $$3);
      aer $$5 = lg.b.a(csm.pb, $$4, this.c);
      this.b.accept(kw.a(csm.pb, kz.a().a(la.c, $$5)).a(kx.a(dfp.T).a($$0x -> this.a($$0x, kz.a()))));
   }

   private void aA() {
      csl $$0 = csm.n;
      aer $$1 = le.a($$0);
      lj $$2 = lj.a.get($$0);
      csl $$3 = csm.jH;
      aer $$4 = lg.Z.a($$3, $$2.b(), this.c);
      aer $$5 = lg.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      je.a().filter(jf::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(csm.qS).a(je.w).a(csm.ri).a(je.y);
      this.h(csm.qR).a(je.A).a(csm.rh).a(je.C);
      this.h(csm.qQ).a(je.E).a(csm.rg).a(je.G);
      this.h(csm.qP).a(je.I).a(csm.rf).a(je.K);
      this.m(csm.a);
      this.a(csm.nc, csm.a);
      this.a(csm.nb, csm.a);
      this.m(csm.fO);
      this.m(csm.dQ);
      this.a(csm.nd, csm.G);
      this.m(csm.fA);
      this.m(csm.me);
      this.m(csm.fr);
      this.m(csm.fR);
      this.a(cja.tk);
      this.m(csm.pg);
      this.m(csm.G);
      this.m(csm.H);
      this.m(csm.hV);
      this.a(cja.fw);
      this.l(csm.pM, csm.qd);
      this.l(csm.pN, csm.qe);
      this.l(csm.pO, csm.qf);
      this.l(csm.pP, csm.qg);
      this.l(csm.pQ, csm.qh);
      this.l(csm.pR, csm.qi);
      this.l(csm.pS, csm.qj);
      this.l(csm.pT, csm.qk);
      this.l(csm.pU, csm.ql);
      this.l(csm.pV, csm.qm);
      this.l(csm.pW, csm.qn);
      this.l(csm.pX, csm.qo);
      this.l(csm.pY, csm.qp);
      this.l(csm.pZ, csm.qq);
      this.l(csm.qa, csm.qr);
      this.l(csm.qb, csm.qs);
      this.l(csm.pL, csm.qc);
      this.m(csm.na);
      this.m(csm.gs);
      this.m(csm.qC);
      this.m(csm.rw);
      this.s(csm.rx);
      this.s(csm.ry);
      this.t(csm.sh);
      this.t(csm.si);
      this.ag();
      this.e(csm.rB, csm.rz);
      this.p(csm.rA);
      this.a(csm.hW, cja.hf);
      this.a(cja.hf);
      this.aB();
      this.a(csm.kN, cja.iF);
      this.a(cja.iF);
      this.f(csm.bQ, lh.a(csm.by, "_side"));
      this.a(csm.R);
      this.a(csm.S);
      this.a(csm.iB);
      this.a(csm.cx);
      this.a(csm.cy);
      this.a(csm.cz);
      this.a(csm.fE);
      this.a(csm.fF);
      this.a(csm.fJ);
      this.a(csm.N);
      this.a(csm.T);
      this.a(csm.O);
      this.a(csm.ch);
      this.a(csm.P);
      this.a(csm.Q);
      this.a(csm.ci);
      this.b(csm.pj, lj.c);
      this.a(csm.pi);
      this.a(csm.aR);
      this.a(csm.aS);
      this.a(csm.aT);
      this.a(csm.hb);
      this.a(csm.dI);
      this.a(csm.dJ);
      this.a(csm.ha);
      this.a(csm.pC);
      this.a(csm.mW);
      this.a(csm.dR);
      this.a(csm.k);
      this.a(csm.pk);
      this.a(csm.fz);
      this.a(csm.ed);
      this.a(csm.L);
      this.a(csm.ph);
      this.a(csm.dO);
      this.b(csm.dT, lj.f);
      this.b(csm.pq, lj.c);
      this.b(csm.fa, lj.c);
      this.m(csm.ac);
      this.m(csm.ga);
      this.a(csm.kK);
      this.a(csm.aY);
      this.a(csm.iC);
      this.a(csm.co);
      this.a(csm.pK);
      this.a(csm.ii);
      this.a(csm.oy);
      this.a(csm.dX);
      this.a(csm.dY);
      this.a(csm.ct);
      this.a(csm.aO);
      this.b(csm.bw, lj.u);
      this.a(cja.cw);
      this.b(csm.ck, lj.e);
      this.b(csm.pd, lj.c);
      this.a(csm.op);
      this.a(csm.aP);
      this.a(csm.qt);
      this.a(csm.qu);
      this.a(csm.qA);
      this.a(csm.qz);
      this.a(csm.rt);
      this.a(csm.se);
      this.a(csm.sf);
      this.a(csm.sg);
      this.e(csm.qF);
      this.aA();
      this.a(csm.qN);
      this.a(csm.qO);
      this.a(csm.qM);
      this.a(csm.qL);
      this.a(csm.qK);
      this.a(csm.qJ);
      this.h(csm.qM, csm.rb);
      this.h(csm.qL, csm.rd);
      this.h(csm.qK, csm.rc);
      this.h(csm.qJ, csm.re);
      this.g(csm.gW, csm.ch);
      this.g(csm.gX, csm.ci);
      this.F();
      this.r();
      this.au();
      this.v();
      this.w();
      this.a(csm.og, csm.oh);
      this.x();
      this.A();
      this.B();
      this.D();
      this.E();
      this.H();
      this.C();
      this.y(csm.kt);
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
      this.E(csm.ff);
      this.E(csm.fg);
      this.E(csm.qG);
      this.av();
      this.az();
      this.ac();
      this.ad();
      this.ae();
      this.W();
      this.N();
      this.M();
      this.D(csm.cO);
      this.d(csm.cO);
      this.D(csm.oa);
      this.g();
      this.D(csm.rD);
      this.i(csm.cp, csm.cq);
      this.i(csm.eb, csm.ec);
      this.a(csm.cA, csm.n, lh::c);
      this.a(csm.nY, csm.p, lh::d);
      this.x(csm.ow);
      this.x(csm.on);
      this.v(csm.aU);
      this.v(csm.hi);
      this.C(csm.oe);
      this.C(csm.of);
      this.e(csm.eY, le.a(csm.eY));
      this.a(csm.dZ, lj.c);
      this.a(csm.ea, lj.c);
      this.a(csm.sd);
      this.a(csm.kM, lj.c);
      this.f(csm.j);
      this.f(csm.rG);
      this.f(csm.I);
      this.g(csm.J);
      this.g(csm.M);
      this.f(csm.K);
      this.e(csm.F);
      this.b(csm.sn, lj.e);
      this.a(csm.ij, lj.c, lj.d);
      this.a(csm.kx, lj.v, lj.w);
      this.a(csm.hf, lj.v, lj.w);
      this.a(csm.sj, lj.c, lj.d);
      this.a(csm.sk, lj.c, lj.d);
      this.a(csm.sl, lj.c, lj.d);
      this.c(csm.nT, lj.h);
      this.z();
      this.a(csm.pe, lh::A);
      this.a(csm.pf, lh::C);
      this.a(csm.kD, dfp.as, 0, 1, 2, 3);
      this.a(csm.gt, dfp.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csm.fq, dfp.as, 0, 1, 1, 2);
      this.a(csm.gu, dfp.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csm.cB, dfp.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(csm.kA, kq.e.b, dfp.aq, 0, 1);
      this.i();
      this.h();
      this.a(le.a("decorated_pot"), csm.iA).b(csm.so);
      this.a(le.a("banner"), csm.n)
         .a(lg.bD, csm.iJ, csm.iK, csm.iL, csm.iM, csm.iN, csm.iO, csm.iP, csm.iQ, csm.iR, csm.iS, csm.iT, csm.iU, csm.iV, csm.iW, csm.iX, csm.iY)
         .b(csm.iZ, csm.ja, csm.jb, csm.jc, csm.jd, csm.je, csm.jf, csm.jg, csm.jh, csm.ji, csm.jj, csm.jk, csm.jl, csm.jm, csm.jn, csm.jo);
      this.a(le.a("bed"), csm.n)
         .b(csm.aZ, csm.ba, csm.bb, csm.bc, csm.bd, csm.be, csm.bf, csm.bg, csm.bh, csm.bi, csm.bj, csm.bk, csm.bl, csm.bm, csm.bn, csm.bo);
      this.j(csm.aZ, csm.bA);
      this.j(csm.ba, csm.bB);
      this.j(csm.bb, csm.bC);
      this.j(csm.bc, csm.bD);
      this.j(csm.bd, csm.bE);
      this.j(csm.be, csm.bF);
      this.j(csm.bf, csm.bG);
      this.j(csm.bg, csm.bH);
      this.j(csm.bh, csm.bI);
      this.j(csm.bi, csm.bJ);
      this.j(csm.bj, csm.bK);
      this.j(csm.bk, csm.bL);
      this.j(csm.bl, csm.bM);
      this.j(csm.bm, csm.bN);
      this.j(csm.bn, csm.bO);
      this.j(csm.bo, csm.bP);
      this.a(le.a("skull"), csm.dX)
         .a(lg.bE, csm.gM, csm.gK, csm.gI, csm.gE, csm.gG, csm.gQ)
         .a(csm.gO)
         .b(csm.gN, csm.gP, csm.gL, csm.gJ, csm.gF, csm.gH, csm.gR);
      this.F(csm.kP);
      this.F(csm.kQ);
      this.F(csm.kR);
      this.F(csm.kS);
      this.F(csm.kT);
      this.F(csm.kU);
      this.F(csm.kV);
      this.F(csm.kW);
      this.F(csm.kX);
      this.F(csm.kY);
      this.F(csm.kZ);
      this.F(csm.la);
      this.F(csm.lb);
      this.F(csm.lc);
      this.F(csm.ld);
      this.F(csm.le);
      this.F(csm.lf);
      this.b(csm.mX, lj.p);
      this.c(csm.mX);
      this.a(le.a("chest"), csm.n).b(csm.cv, csm.gV);
      this.a(le.a("ender_chest"), csm.co).b(csm.fG);
      this.d(csm.fx, csm.co).a(csm.fx, csm.kF);
      this.a(csm.aM);
      this.a(csm.aN);
      this.a(csm.lw);
      this.a(csm.lx);
      this.a(csm.ly);
      this.a(csm.lz);
      this.a(csm.lA);
      this.a(csm.lB);
      this.a(csm.lC);
      this.a(csm.lD);
      this.a(csm.lE);
      this.a(csm.lF);
      this.a(csm.lG);
      this.a(csm.lH);
      this.a(csm.lI);
      this.a(csm.lJ);
      this.a(csm.lK);
      this.a(csm.lL);
      this.a(lj.a, csm.lM, csm.lN, csm.lO, csm.lP, csm.lQ, csm.lR, csm.lS, csm.lT, csm.lU, csm.lV, csm.lW, csm.lX, csm.lY, csm.lZ, csm.ma, csm.mb);
      this.a(csm.iA);
      this.a(csm.hj);
      this.a(csm.hk);
      this.a(csm.hl);
      this.a(csm.hm);
      this.a(csm.hn);
      this.a(csm.ho);
      this.a(csm.hp);
      this.a(csm.hq);
      this.a(csm.hr);
      this.a(csm.hs);
      this.a(csm.ht);
      this.a(csm.hu);
      this.a(csm.hv);
      this.a(csm.hw);
      this.a(csm.hx);
      this.a(csm.hy);
      this.a(csm.qB);
      this.f(csm.aQ, csm.eZ);
      this.f(csm.ej, csm.hz);
      this.f(csm.ek, csm.hA);
      this.f(csm.el, csm.hB);
      this.f(csm.em, csm.hC);
      this.f(csm.en, csm.hD);
      this.f(csm.eo, csm.hE);
      this.f(csm.ep, csm.hF);
      this.f(csm.eq, csm.hG);
      this.f(csm.er, csm.hH);
      this.f(csm.es, csm.hI);
      this.f(csm.et, csm.hJ);
      this.f(csm.eu, csm.hK);
      this.f(csm.ev, csm.hL);
      this.f(csm.ew, csm.hM);
      this.f(csm.ex, csm.hN);
      this.f(csm.ey, csm.hO);
      this.b(lj.n, csm.lg, csm.lh, csm.li, csm.lj, csm.lk, csm.ll, csm.lm, csm.ln, csm.lo, csm.lp, csm.lq, csm.lr, csm.ls, csm.lt, csm.lu, csm.lv);
      this.e(csm.bA, csm.ik);
      this.e(csm.bB, csm.il);
      this.e(csm.bC, csm.im);
      this.e(csm.bD, csm.in);
      this.e(csm.bE, csm.io);
      this.e(csm.bF, csm.ip);
      this.e(csm.bG, csm.iq);
      this.e(csm.bH, csm.ir);
      this.e(csm.bI, csm.is);
      this.e(csm.bJ, csm.it);
      this.e(csm.bK, csm.iu);
      this.e(csm.bL, csm.iv);
      this.e(csm.bM, csm.iw);
      this.e(csm.bN, csm.ix);
      this.e(csm.bO, csm.iy);
      this.e(csm.bP, csm.iz);
      this.a(csm.rH);
      this.a(csm.eM);
      this.a(csm.bu, csm.gb, kq.e.a);
      this.a(csm.bR, csm.gc, kq.e.b);
      this.a(csm.bT, csm.gd, kq.e.b);
      this.a(csm.bU, csm.ge, kq.e.b);
      this.a(csm.bV, csm.gf, kq.e.b);
      this.a(csm.bW, csm.gg, kq.e.b);
      this.a(csm.bX, csm.gh, kq.e.b);
      this.a(csm.bY, csm.gi, kq.e.b);
      this.a(csm.bZ, csm.gj, kq.e.b);
      this.a(csm.ca, csm.gk, kq.e.b);
      this.a(csm.cb, csm.gl, kq.e.b);
      this.a(csm.cc, csm.gm, kq.e.b);
      this.a(csm.ce, csm.gn, kq.e.b);
      this.a(csm.cd, csm.go, kq.e.b);
      this.a(csm.cg, csm.gp, kq.e.b);
      this.a(csm.cf, csm.gq, kq.e.b);
      this.a(csm.bv, csm.gr, kq.e.b);
      this.a(csm.bS, csm.fS, kq.e.b);
      this.G();
      this.u(csm.eU);
      this.u(csm.eV);
      this.u(csm.eW);
      this.a(csm.bt, kq.e.a);
      this.b(csm.dS, kq.e.a);
      this.a(cja.dn);
      this.b(csm.mc, csm.md, kq.e.b);
      this.a(cja.do);
      this.c(csm.md);
      this.b(csm.rF, kq.e.b);
      this.c(csm.rF);
      this.c(csm.rv);
      this.b(csm.oz, csm.oA, kq.e.b);
      this.b(csm.oB, csm.oC, kq.e.b);
      this.a(csm.oz, "_plant");
      this.c(csm.oA);
      this.a(csm.oB, "_plant");
      this.c(csm.oC);
      this.a(csm.mY, kq.e.a, lh.c(lh.a(csm.mZ, "_stage0")));
      this.m();
      this.a(csm.bs, kq.e.b);
      this.c(csm.iE, kq.e.b);
      this.c(csm.iF, kq.e.b);
      this.c(csm.iG, kq.e.b);
      this.c(csm.iH, kq.e.a);
      this.c(csm.iI, kq.e.a);
      this.j();
      this.k();
      this.l();
      this.a(csm.mw, csm.mr, csm.mm, csm.mh, csm.mG, csm.mB, csm.mQ, csm.mL);
      this.a(csm.mx, csm.ms, csm.mn, csm.mi, csm.mH, csm.mC, csm.mR, csm.mM);
      this.a(csm.my, csm.mt, csm.mo, csm.mj, csm.mI, csm.mD, csm.mS, csm.mN);
      this.a(csm.mz, csm.mu, csm.mp, csm.mk, csm.mJ, csm.mE, csm.mT, csm.mO);
      this.a(csm.mA, csm.mv, csm.mq, csm.ml, csm.mK, csm.mF, csm.mU, csm.mP);
      this.c(csm.fe, csm.fc);
      this.c(csm.fd, csm.fb);
      this.l(csm.ab).c(csm.ab).a(csm.av);
      this.l(csm.am).c(csm.am).a(csm.aD);
      this.a(csm.am, csm.dj, csm.ds);
      this.b(csm.aL, lj.r);
      this.l(csm.Y).c(csm.Y).a(csm.as);
      this.l(csm.ai).c(csm.ai).a(csm.aA);
      this.a(csm.ai, csm.dd, csm.do);
      this.a(csm.B, csm.fX, kq.e.b);
      this.b(csm.aI, lj.r);
      this.l(csm.Z).d(csm.Z).a(csm.at);
      this.l(csm.aj).d(csm.aj).a(csm.aB);
      this.a(csm.aj, csm.de, csm.dp);
      this.a(csm.C, csm.fY, kq.e.b);
      this.b(csm.aJ, lj.r);
      this.l(csm.W).c(csm.W).a(csm.aq);
      this.l(csm.ag).c(csm.ag).a(csm.ay);
      this.a(csm.ag, csm.dc, csm.dn);
      this.a(csm.z, csm.fV, kq.e.b);
      this.b(csm.aG, lj.r);
      this.l(csm.U).c(csm.U).a(csm.ao);
      this.l(csm.al).c(csm.al).a(csm.aw);
      this.a(csm.al, csm.da, csm.dl);
      this.a(csm.x, csm.fT, kq.e.b);
      this.b(csm.aE, lj.r);
      this.l(csm.V).c(csm.V).a(csm.ap);
      this.l(csm.af).c(csm.af).a(csm.ax);
      this.a(csm.af, csm.db, csm.dm);
      this.a(csm.y, csm.fU, kq.e.b);
      this.b(csm.aF, lj.r);
      this.l(csm.aa).c(csm.aa).a(csm.au);
      this.l(csm.ak).c(csm.ak).a(csm.aC);
      this.a(csm.ak, csm.dg, csm.dr);
      this.a(csm.D, csm.fZ, kq.e.b);
      this.b(csm.aK, lj.r);
      this.l(csm.X).c(csm.X).a(csm.ar);
      this.l(csm.ah).c(csm.ah).a(csm.az);
      this.a(csm.ah, csm.df, csm.dq);
      this.a(csm.A, csm.fW, kq.e.b);
      this.b(csm.aH, lj.r);
      this.l(csm.os).b(csm.os).a(csm.ou);
      this.l(csm.ot).b(csm.ot).a(csm.ov);
      this.a(csm.ot, csm.dh, csm.dt);
      this.a(csm.ox, csm.pm, kq.e.b);
      this.k(csm.oD, csm.po);
      this.l(csm.oj).b(csm.oj).a(csm.ol);
      this.l(csm.ok).b(csm.ok).a(csm.om);
      this.a(csm.ok, csm.di, csm.du);
      this.a(csm.oo, csm.pn, kq.e.b);
      this.k(csm.oq, csm.pp);
      this.l(csm.ae).d(csm.ae);
      this.l(csm.an).d(csm.an);
      this.a(csm.v, csm.dk, csm.dv);
      this.b(csm.or, kq.e.b);
      this.a(cja.dk);
      this.i(csm.dy);
      this.k(csm.hY);
      this.u();
      this.n(csm.cP);
      this.o(csm.bp);
      this.o(csm.bq);
      this.o(csm.hh);
      this.t();
      this.q(csm.fN);
      this.q(csm.kG);
      this.q(csm.kH);
      this.r(csm.gS);
      this.r(csm.gT);
      this.r(csm.gU);
      this.o();
      this.p();
      this.d(csm.cD, lj.g);
      this.d(csm.nW, lj.g);
      this.d(csm.nV, lj.h);
      this.s();
      this.ay();
      this.at();
      this.h(csm.eL, csm.eT);
      this.h(csm.m, csm.eP);
      this.h(csm.eK, csm.eS);
      this.h(csm.eJ, csm.eR);
      this.aw();
      this.h(csm.eI, csm.eQ);
      this.ax();
      ckc.h().forEach($$0 -> this.a($$0, le.b("template_spawn_egg")));
   }

   private void aB() {
      this.c(csm.hX);
      kx.a<Integer> $$0 = kx.a(dfp.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aer $$3 = lh.a(cja.hg, $$2);
         $$0.a($$1, kz.a().a(la.c, lg.Y.a(csm.hX, $$2, lh.h($$3), this.c)));
         lg.bv.a(le.a(cja.hg, $$2), lh.k($$3), this.c);
      }

      this.b.accept(kw.a(csm.hX).a($$0));
   }

   private void l(csl $$0, csl $$1) {
      this.a($$0.k());
      lh $$2 = lh.b(lh.G($$0));
      lh $$3 = lh.b(lh.a($$0, "_lit"));
      aer $$4 = lg.bF.a($$0, "_one_candle", $$2, this.c);
      aer $$5 = lg.bG.a($$0, "_two_candles", $$2, this.c);
      aer $$6 = lg.bH.a($$0, "_three_candles", $$2, this.c);
      aer $$7 = lg.bI.a($$0, "_four_candles", $$2, this.c);
      aer $$8 = lg.bF.a($$0, "_one_candle_lit", $$3, this.c);
      aer $$9 = lg.bG.a($$0, "_two_candles_lit", $$3, this.c);
      aer $$10 = lg.bH.a($$0, "_three_candles_lit", $$3, this.c);
      aer $$11 = lg.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            kw.a($$0)
               .a(
                  kx.a(dfp.az, dfp.r)
                     .a(1, false, kz.a().a(la.c, $$4))
                     .a(2, false, kz.a().a(la.c, $$5))
                     .a(3, false, kz.a().a(la.c, $$6))
                     .a(4, false, kz.a().a(la.c, $$7))
                     .a(1, true, kz.a().a(la.c, $$8))
                     .a(2, true, kz.a().a(la.c, $$9))
                     .a(3, true, kz.a().a(la.c, $$10))
                     .a(4, true, kz.a().a(la.c, $$11))
               )
         );
      aer $$12 = lg.bJ.a($$1, lh.a($$0, false), this.c);
      aer $$13 = lg.bJ.a($$1, "_lit", lh.a($$0, true), this.c);
      this.b.accept(kw.a($$1).a(a(dfp.r, $$13, $$12)));
   }

   class a {
      private final aer b;

      public a(aer $$0, csl $$1) {
         this.b = lg.Y.a($$0, lh.u($$1), kq.this.c);
      }

      public kq.a a(csl... $$0) {
         for (csl $$1 : $$0) {
            kq.this.b.accept(kq.c($$1, this.b));
         }

         return this;
      }

      public kq.a b(csl... $$0) {
         for (csl $$1 : $$0) {
            kq.this.c($$1);
         }

         return this.a($$0);
      }

      public kq.a a(lf $$0, csl... $$1) {
         for (csl $$2 : $$1) {
            $$0.a(le.a($$2.k()), lh.u($$2), kq.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final lh b;
      private final Map<lf, aer> c = Maps.newHashMap();
      @Nullable
      private jf d;
      @Nullable
      private aer e;

      public b(lh $$0) {
         this.b = $$0;
      }

      public kq.b a(csl $$0, lf $$1) {
         this.e = $$1.a($$0, this.b, kq.this.c);
         if (kq.this.f.containsKey($$0)) {
            kq.this.b.accept(kq.this.f.get($$0).create($$0, this.e, this.b, kq.this.c));
         } else {
            kq.this.b.accept(kq.c($$0, this.e));
         }

         return this;
      }

      public kq.b a(csl... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (csl $$1 : $$0) {
               kq.this.b.accept(kq.c($$1, this.e));
               kq.this.a($$1, this.e);
            }

            return this;
         }
      }

      public kq.b a(csl $$0) {
         aer $$1 = lg.q.a($$0, this.b, kq.this.c);
         aer $$2 = lg.r.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.b($$0, $$1, $$2));
         aer $$3 = lg.s.a($$0, this.b, kq.this.c);
         kq.this.a($$0, $$3);
         return this;
      }

      public kq.b b(csl $$0) {
         aer $$1 = lg.K.a($$0, this.b, kq.this.c);
         aer $$2 = lg.L.a($$0, this.b, kq.this.c);
         aer $$3 = lg.M.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.a($$0, $$1, $$2, $$3));
         aer $$4 = lg.N.a($$0, this.b, kq.this.c);
         kq.this.a($$0, $$4);
         return this;
      }

      public kq.b c(csl $$0) {
         lh $$1 = lh.p($$0);
         aer $$2 = lg.B.a($$0, $$1, kq.this.c);
         aer $$3 = lg.C.a($$0, $$1, kq.this.c);
         aer $$4 = lg.D.a($$0, $$1, kq.this.c);
         aer $$5 = lg.E.a($$0, $$1, kq.this.c);
         aer $$6 = lg.F.a($$0, $$1, kq.this.c);
         kq.this.b.accept(kq.a($$0, $$2, $$3, $$4, $$5, $$6));
         aer $$7 = lg.G.a($$0, $$1, kq.this.c);
         kq.this.a($$0, $$7);
         return this;
      }

      public kq.b d(csl $$0) {
         aer $$1 = lg.H.a($$0, this.b, kq.this.c);
         aer $$2 = lg.I.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.c($$0, $$1, $$2));
         aer $$3 = lg.J.a($$0, this.b, kq.this.c);
         kq.this.a($$0, $$3);
         return this;
      }

      public kq.b e(csl $$0) {
         lh $$1 = lh.p($$0);
         aer $$2 = lg.P.a($$0, $$1, kq.this.c);
         aer $$3 = lg.O.a($$0, $$1, kq.this.c);
         aer $$4 = lg.R.a($$0, $$1, kq.this.c);
         aer $$5 = lg.Q.a($$0, $$1, kq.this.c);
         kq.this.b.accept(kq.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public kq.b f(csl $$0) {
         aer $$1 = lg.T.a($$0, this.b, kq.this.c);
         aer $$2 = lg.S.a($$0, this.b, kq.this.c);
         aer $$3 = lg.V.a($$0, this.b, kq.this.c);
         aer $$4 = lg.U.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public kq.b g(csl $$0) {
         aer $$1 = lg.W.a($$0, this.b, kq.this.c);
         aer $$2 = lg.X.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.e($$0, $$1, $$2));
         return this;
      }

      public kq.b h(csl $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            csl $$1 = this.d.b().get(jf.b.r);
            aer $$2 = lg.Y.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.c($$0, $$2));
            kq.this.b.accept(kq.c($$1, $$2));
            kq.this.a($$0.k());
            kq.this.c($$1);
            return this;
         }
      }

      public kq.b i(csl $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aer $$1 = this.a(lg.Z, $$0);
            aer $$2 = this.a(lg.aa, $$0);
            kq.this.b.accept(kq.e($$0, $$1, $$2, this.e));
            kq.this.a($$0, $$1);
            return this;
         }
      }

      public kq.b j(csl $$0) {
         aer $$1 = this.a(lg.ad, $$0);
         aer $$2 = this.a(lg.ac, $$0);
         aer $$3 = this.a(lg.ae, $$0);
         kq.this.b.accept(kq.b($$0, $$1, $$2, $$3));
         kq.this.a($$0, $$2);
         return this;
      }

      private kq.b k(csl $$0) {
         lj $$1 = kq.this.g.getOrDefault($$0, lj.a.get($$0));
         kq.this.b.accept(kq.c($$0, $$1.a($$0, kq.this.c)));
         return this;
      }

      private kq.b l(csl $$0) {
         kq.this.i($$0);
         return this;
      }

      private void m(csl $$0) {
         if (kq.this.e.contains($$0)) {
            kq.this.k($$0);
         } else {
            kq.this.j($$0);
         }
      }

      private aer a(lf $$0, csl $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, kq.this.c));
      }

      public kq.b a(jf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<kq.b, csl> $$2 = kq.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      kt create(csl var1, aer var2, lh var3, BiConsumer<aer, Supplier<JsonElement>> var4);
   }

   static record d(lf a, String b) {
   }

   static enum e {
      a,
      b;

      public lf a() {
         return this == a ? lg.an : lg.am;
      }

      public lf b() {
         return this == a ? lg.ap : lg.ao;
      }
   }

   class f {
      private final lh b;

      public f(lh $$0) {
         this.b = $$0;
      }

      public kq.f a(csl $$0) {
         lh $$1 = this.b.c(li.d, this.b.a(li.i));
         aer $$2 = lg.i.a($$0, $$1, kq.this.c);
         kq.this.b.accept(kq.d($$0, $$2));
         return this;
      }

      public kq.f b(csl $$0) {
         aer $$1 = lg.i.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.d($$0, $$1));
         return this;
      }

      public kq.f c(csl $$0) {
         aer $$1 = lg.i.a($$0, this.b, kq.this.c);
         aer $$2 = lg.j.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.d($$0, $$1, $$2));
         return this;
      }

      public kq.f d(csl $$0) {
         kq.this.b.accept(kq.a($$0, this.b, kq.this.c));
         return this;
      }
   }
}
