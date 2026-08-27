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

public class mb {
   final Consumer<me> b;
   final BiConsumer<aiy, Supplier<JsonElement>> c;
   private final Consumer<cou> d;
   final List<cyo> e = ImmutableList.of(cyq.ey, cyq.eE, cyq.hY);
   final Map<cyo, mb.c> f = ImmutableMap.builder().put(cyq.b, mb::a).put(cyq.sJ, mb::c).put(cyq.eM, mb::b).build();
   final Map<cyo, mu> g = ImmutableMap.builder()
      .put(cyq.aV, mu.y.get(cyq.aV))
      .put(cyq.jp, mu.y.get(cyq.jp))
      .put(cyq.jS, mu.a(ms.a(cyq.aV, "_top")))
      .put(cyq.jU, mu.a(ms.a(cyq.jp, "_top")))
      .put(cyq.aX, mu.d.get(cyq.aV).a($$0x -> $$0x.a(mt.i, ms.G(cyq.aX))))
      .put(cyq.jr, mu.d.get(cyq.jp).a($$0x -> $$0x.a(mt.i, ms.G(cyq.jr))))
      .put(cyq.hd, mu.d.get(cyq.hd))
      .put(cyq.jT, mu.a(ms.a(cyq.hd, "_bottom")))
      .put(cyq.pr, mu.z.get(cyq.pr))
      .put(cyq.sJ, mu.z.get(cyq.sJ))
      .put(cyq.he, mu.d.get(cyq.he).a($$0x -> $$0x.a(mt.i, ms.G(cyq.he))))
      .put(cyq.aW, mu.d.get(cyq.aW).a($$0x -> {
         $$0x.a(mt.d, ms.a(cyq.aV, "_top"));
         $$0x.a(mt.i, ms.G(cyq.aW));
      }))
      .put(cyq.jq, mu.d.get(cyq.jq).a($$0x -> {
         $$0x.a(mt.d, ms.a(cyq.jp, "_top"));
         $$0x.a(mt.i, ms.G(cyq.jq));
      }))
      .put(cyq.qM, mu.z.get(cyq.qM))
      .put(cyq.qH, mu.z.get(cyq.qH))
      .build();
   static final Map<kj.b, BiConsumer<mb.b, cyo>> h = ImmutableMap.builder()
      .put(kj.b.a, mb.b::a)
      .put(kj.b.e, mb.b::l)
      .put(kj.b.b, mb.b::k)
      .put(kj.b.c, mb.b::k)
      .put(kj.b.f, mb.b::c)
      .put(kj.b.g, mb.b::d)
      .put(kj.b.h, mb.b::e)
      .put(kj.b.i, mb.b::f)
      .put(kj.b.k, mb.b::h)
      .put(kj.b.l, mb.b::i)
      .put(kj.b.m, mb.b::j)
      .put(kj.b.n, mb.b::g)
      .put(kj.b.p, mb.b::m)
      .put(kj.b.q, mb.b::b)
      .build();
   public static final List<Pair<dlw, Function<aiy, mk>>> a = List.of(
      Pair.of(dlv.L, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0)),
      Pair.of(dlv.M, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.d, true)),
      Pair.of(dlv.N, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.d, true)),
      Pair.of(dlv.O, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.d, true)),
      Pair.of(dlv.J, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.a, ml.a.d).a(ml.d, true)),
      Pair.of(dlv.K, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.a, ml.a.b).a(ml.d, true))
   );
   private static final Map<mb.d, aiy> i = new HashMap<>();

   private static me a(cyo $$0, aiy $$1, ms $$2, BiConsumer<aiy, Supplier<JsonElement>> $$3) {
      aiy $$4 = mr.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static me b(cyo $$0, aiy $$1, ms $$2, BiConsumer<aiy, Supplier<JsonElement>> $$3) {
      aiy $$4 = mr.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static me c(cyo $$0, aiy $$1, ms $$2, BiConsumer<aiy, Supplier<JsonElement>> $$3) {
      aiy $$4 = mr.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public mb(Consumer<me> $$0, BiConsumer<aiy, Supplier<JsonElement>> $$1, Consumer<cou> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cyo $$0) {
      this.d.accept($$0.j());
   }

   void a(cyo $$0, aiy $$1) {
      this.c.accept(mp.a($$0.j()), new mo($$1));
   }

   private void a(cou $$0, aiy $$1) {
      this.c.accept(mp.a($$0), new mo($$1));
   }

   void a(cou $$0) {
      mr.bx.a(mp.a($$0), ms.b($$0), this.c);
   }

   private void d(cyo $$0) {
      cou $$1 = $$0.j();
      if ($$1 != cpc.a) {
         mr.bx.a(mp.a($$1), ms.F($$0), this.c);
      }
   }

   private void a(cyo $$0, String $$1) {
      cou $$2 = $$0.j();
      mr.bx.a(mp.a($$2), ms.k(ms.a($$0, $$1)), this.c);
   }

   private static mi b() {
      return mi.a(dlv.R).a(ie.f, mk.a().a(ml.b, ml.a.b)).a(ie.d, mk.a().a(ml.b, ml.a.c)).a(ie.e, mk.a().a(ml.b, ml.a.d)).a(ie.c, mk.a());
   }

   private static mi c() {
      return mi.a(dlv.R).a(ie.d, mk.a()).a(ie.e, mk.a().a(ml.b, ml.a.b)).a(ie.c, mk.a().a(ml.b, ml.a.c)).a(ie.f, mk.a().a(ml.b, ml.a.d));
   }

   private static mi d() {
      return mi.a(dlv.R).a(ie.f, mk.a()).a(ie.d, mk.a().a(ml.b, ml.a.b)).a(ie.e, mk.a().a(ml.b, ml.a.c)).a(ie.c, mk.a().a(ml.b, ml.a.d));
   }

   private static mi e() {
      return mi.a(dlv.P)
         .a(ie.a, mk.a().a(ml.a, ml.a.b))
         .a(ie.b, mk.a().a(ml.a, ml.a.d))
         .a(ie.c, mk.a())
         .a(ie.d, mk.a().a(ml.b, ml.a.c))
         .a(ie.e, mk.a().a(ml.b, ml.a.d))
         .a(ie.f, mk.a().a(ml.b, ml.a.b));
   }

   private static mh b(cyo $$0, aiy $$1) {
      return mh.a($$0, a($$1));
   }

   private static mk[] a(aiy $$0) {
      return new mk[]{mk.a().a(ml.c, $$0), mk.a().a(ml.c, $$0).a(ml.b, ml.a.b), mk.a().a(ml.c, $$0).a(ml.b, ml.a.c), mk.a().a(ml.c, $$0).a(ml.b, ml.a.d)};
   }

   private static mh a(cyo $$0, aiy $$1, aiy $$2) {
      return mh.a($$0, mk.a().a(ml.c, $$1), mk.a().a(ml.c, $$2), mk.a().a(ml.c, $$1).a(ml.b, ml.a.c), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c));
   }

   private static mi a(dlw $$0, aiy $$1, aiy $$2) {
      return mi.a($$0).a(true, mk.a().a(ml.c, $$1)).a(false, mk.a().a(ml.c, $$2));
   }

   private void e(cyo $$0) {
      aiy $$1 = mu.a.create($$0, this.c);
      aiy $$2 = mu.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cyo $$0) {
      aiy $$1 = mu.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cyo $$0) {
      this.b.accept(mh.a($$0).a(mi.a(dlv.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aiy $$3 = ms.a($$0, $$2);
         return mk.a().a(ml.c, mr.c.a($$0, $$2, new ms().a(mt.a, $$3), this.c));
      })));
      this.a($$0, ms.a($$0, "_0"));
   }

   static me b(cyo $$0, aiy $$1, aiy $$2) {
      return mh.a($$0)
         .a(mi.a(dlv.w).a(false, mk.a().a(ml.c, $$1)).a(true, mk.a().a(ml.c, $$2)))
         .a(
            mi.a(dlv.U, dlv.R)
               .a(dlq.a, ie.f, mk.a().a(ml.b, ml.a.b))
               .a(dlq.a, ie.e, mk.a().a(ml.b, ml.a.d))
               .a(dlq.a, ie.d, mk.a().a(ml.b, ml.a.c))
               .a(dlq.a, ie.c, mk.a())
               .a(dlq.b, ie.f, mk.a().a(ml.b, ml.a.b).a(ml.a, ml.a.b).a(ml.d, true))
               .a(dlq.b, ie.e, mk.a().a(ml.b, ml.a.d).a(ml.a, ml.a.b).a(ml.d, true))
               .a(dlq.b, ie.d, mk.a().a(ml.b, ml.a.c).a(ml.a, ml.a.b).a(ml.d, true))
               .a(dlq.b, ie.c, mk.a().a(ml.a, ml.a.b).a(ml.d, true))
               .a(dlq.c, ie.f, mk.a().a(ml.b, ml.a.d).a(ml.a, ml.a.c))
               .a(dlq.c, ie.e, mk.a().a(ml.b, ml.a.b).a(ml.a, ml.a.c))
               .a(dlq.c, ie.d, mk.a().a(ml.a, ml.a.c))
               .a(dlq.c, ie.c, mk.a().a(ml.b, ml.a.c).a(ml.a, ml.a.c))
         );
   }

   private static mi.d<ie, dmb, dma, Boolean> a(mi.d<ie, dmb, dma, Boolean> $$0, dmb $$1, aiy $$2, aiy $$3, aiy $$4, aiy $$5) {
      return $$0.a(ie.f, $$1, dma.a, false, mk.a().a(ml.c, $$2))
         .a(ie.d, $$1, dma.a, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
         .a(ie.e, $$1, dma.a, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.c))
         .a(ie.c, $$1, dma.a, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.d))
         .a(ie.f, $$1, dma.b, false, mk.a().a(ml.c, $$4))
         .a(ie.d, $$1, dma.b, false, mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
         .a(ie.e, $$1, dma.b, false, mk.a().a(ml.c, $$4).a(ml.b, ml.a.c))
         .a(ie.c, $$1, dma.b, false, mk.a().a(ml.c, $$4).a(ml.b, ml.a.d))
         .a(ie.f, $$1, dma.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
         .a(ie.d, $$1, dma.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
         .a(ie.e, $$1, dma.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
         .a(ie.c, $$1, dma.a, true, mk.a().a(ml.c, $$3))
         .a(ie.f, $$1, dma.b, true, mk.a().a(ml.c, $$5).a(ml.b, ml.a.d))
         .a(ie.d, $$1, dma.b, true, mk.a().a(ml.c, $$5))
         .a(ie.e, $$1, dma.b, true, mk.a().a(ml.c, $$5).a(ml.b, ml.a.b))
         .a(ie.c, $$1, dma.b, true, mk.a().a(ml.c, $$5).a(ml.b, ml.a.c));
   }

   private static me a(cyo $$0, aiy $$1, aiy $$2, aiy $$3, aiy $$4, aiy $$5, aiy $$6, aiy $$7, aiy $$8) {
      return mh.a($$0).a(a(a(mi.a(dlv.R, dlv.ae, dlv.be, dlv.u), dmb.b, $$1, $$2, $$3, $$4), dmb.a, $$5, $$6, $$7, $$8));
   }

   static me a(cyo $$0, aiy $$1, aiy $$2, aiy $$3, aiy $$4, aiy $$5) {
      return mg.a($$0)
         .a(mk.a().a(ml.c, $$1))
         .a(mf.a().a(dlv.L, true), mk.a().a(ml.c, $$2).a(ml.d, false))
         .a(mf.a().a(dlv.M, true), mk.a().a(ml.c, $$3).a(ml.d, false))
         .a(mf.a().a(dlv.N, true), mk.a().a(ml.c, $$4).a(ml.d, false))
         .a(mf.a().a(dlv.O, true), mk.a().a(ml.c, $$5).a(ml.d, false));
   }

   static me c(cyo $$0, aiy $$1, aiy $$2) {
      return mg.a($$0)
         .a(mk.a().a(ml.c, $$1))
         .a(mf.a().a(dlv.L, true), mk.a().a(ml.c, $$2).a(ml.d, true))
         .a(mf.a().a(dlv.M, true), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, true))
         .a(mf.a().a(dlv.N, true), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, true))
         .a(mf.a().a(dlv.O, true), mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, true));
   }

   static me a(cyo $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mg.a($$0)
         .a(mf.a().a(dlv.J, true), mk.a().a(ml.c, $$1))
         .a(mf.a().a(dlv.X, dmr.b), mk.a().a(ml.c, $$2).a(ml.d, true))
         .a(mf.a().a(dlv.W, dmr.b), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, true))
         .a(mf.a().a(dlv.Y, dmr.b), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, true))
         .a(mf.a().a(dlv.Z, dmr.b), mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, true))
         .a(mf.a().a(dlv.X, dmr.c), mk.a().a(ml.c, $$3).a(ml.d, true))
         .a(mf.a().a(dlv.W, dmr.c), mk.a().a(ml.c, $$3).a(ml.b, ml.a.b).a(ml.d, true))
         .a(mf.a().a(dlv.Y, dmr.c), mk.a().a(ml.c, $$3).a(ml.b, ml.a.c).a(ml.d, true))
         .a(mf.a().a(dlv.Z, dmr.c), mk.a().a(ml.c, $$3).a(ml.b, ml.a.d).a(ml.d, true));
   }

   static me a(cyo $$0, aiy $$1, aiy $$2, aiy $$3, aiy $$4, boolean $$5) {
      return mh.a($$0, mk.a().a(ml.d, $$5))
         .a(c())
         .a(
            mi.a(dlv.q, dlv.u)
               .a(false, false, mk.a().a(ml.c, $$2))
               .a(true, false, mk.a().a(ml.c, $$4))
               .a(false, true, mk.a().a(ml.c, $$1))
               .a(true, true, mk.a().a(ml.c, $$3))
         );
   }

   static me b(cyo $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mh.a($$0)
         .a(
            mi.a(dlv.R, dlv.af, dlv.bi)
               .a(ie.f, dme.b, dmo.a, mk.a().a(ml.c, $$2))
               .a(ie.e, dme.b, dmo.a, mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dme.b, dmo.a, mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dme.b, dmo.a, mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dme.b, dmo.e, mk.a().a(ml.c, $$3))
               .a(ie.e, dme.b, dmo.e, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dme.b, dmo.e, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dme.b, dmo.e, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dme.b, dmo.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.e, dme.b, dmo.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.d, dme.b, dmo.d, mk.a().a(ml.c, $$3))
               .a(ie.c, dme.b, dmo.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.f, dme.b, dmo.c, mk.a().a(ml.c, $$1))
               .a(ie.e, dme.b, dmo.c, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dme.b, dmo.c, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dme.b, dmo.c, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dme.b, dmo.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.e, dme.b, dmo.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.d, dme.b, dmo.b, mk.a().a(ml.c, $$1))
               .a(ie.c, dme.b, dmo.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.f, dme.a, dmo.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.e, dme.a, dmo.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dme.a, dmo.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dme.a, dmo.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dme.a, dmo.e, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.e, dme.a, dmo.e, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.d, dme.a, dmo.e, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.c, dme.a, dmo.e, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.f, dme.a, dmo.d, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.e, dme.a, dmo.d, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dme.a, dmo.d, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dme.a, dmo.d, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dme.a, dmo.c, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.e, dme.a, dmo.c, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.d, dme.a, dmo.c, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.c, dme.a, dmo.c, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.f, dme.a, dmo.b, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.e, dme.a, dmo.b, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dme.a, dmo.b, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dme.a, dmo.b, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
         );
   }

   private static me c(cyo $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mh.a($$0)
         .a(
            mi.a(dlv.R, dlv.af, dlv.u)
               .a(ie.c, dme.b, false, mk.a().a(ml.c, $$2))
               .a(ie.d, dme.b, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.c))
               .a(ie.f, dme.b, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
               .a(ie.e, dme.b, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.d))
               .a(ie.c, dme.a, false, mk.a().a(ml.c, $$1))
               .a(ie.d, dme.a, false, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c))
               .a(ie.f, dme.a, false, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b))
               .a(ie.e, dme.a, false, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d))
               .a(ie.c, dme.b, true, mk.a().a(ml.c, $$3))
               .a(ie.d, dme.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               .a(ie.f, dme.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(ie.e, dme.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
               .a(ie.c, dme.a, true, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.c))
               .a(ie.d, dme.a, true, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.a))
               .a(ie.f, dme.a, true, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.d))
               .a(ie.e, dme.a, true, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.b))
         );
   }

   private static me d(cyo $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mh.a($$0)
         .a(
            mi.a(dlv.R, dlv.af, dlv.u)
               .a(ie.c, dme.b, false, mk.a().a(ml.c, $$2))
               .a(ie.d, dme.b, false, mk.a().a(ml.c, $$2))
               .a(ie.f, dme.b, false, mk.a().a(ml.c, $$2))
               .a(ie.e, dme.b, false, mk.a().a(ml.c, $$2))
               .a(ie.c, dme.a, false, mk.a().a(ml.c, $$1))
               .a(ie.d, dme.a, false, mk.a().a(ml.c, $$1))
               .a(ie.f, dme.a, false, mk.a().a(ml.c, $$1))
               .a(ie.e, dme.a, false, mk.a().a(ml.c, $$1))
               .a(ie.c, dme.b, true, mk.a().a(ml.c, $$3))
               .a(ie.d, dme.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               .a(ie.f, dme.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(ie.e, dme.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
               .a(ie.c, dme.a, true, mk.a().a(ml.c, $$3))
               .a(ie.d, dme.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               .a(ie.f, dme.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(ie.e, dme.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
         );
   }

   static mh c(cyo $$0, aiy $$1) {
      return mh.a($$0, mk.a().a(ml.c, $$1));
   }

   private static mi f() {
      return mi.a(dlv.I).a(ie.a.b, mk.a()).a(ie.a.c, mk.a().a(ml.a, ml.a.b)).a(ie.a.a, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.b));
   }

   static me a(cyo $$0, ms $$1, BiConsumer<aiy, Supplier<JsonElement>> $$2) {
      aiy $$3 = mr.g.a($$0, $$1, $$2);
      aiy $$4 = mr.h.a($$0, $$1, $$2);
      aiy $$5 = mr.i.a($$0, $$1, $$2);
      aiy $$6 = mr.j.a($$0, $$1, $$2);
      return mh.a($$0, mk.a().a(ml.c, $$6)).a(mi.a(dlv.I).a(ie.a.a, mk.a().a(ml.c, $$3)).a(ie.a.b, mk.a().a(ml.c, $$4)).a(ie.a.c, mk.a().a(ml.c, $$5)));
   }

   static me d(cyo $$0, aiy $$1) {
      return mh.a($$0, mk.a().a(ml.c, $$1)).a(f());
   }

   private void e(cyo $$0, aiy $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cyo $$0, mu.a $$1) {
      aiy $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cyo $$0, mu.a $$1) {
      aiy $$2 = $$1.create($$0, this.c);
      this.b.accept(mh.a($$0, mk.a().a(ml.c, $$2)).a(b()));
   }

   static me d(cyo $$0, aiy $$1, aiy $$2) {
      return mh.a($$0)
         .a(
            mi.a(dlv.I)
               .a(ie.a.b, mk.a().a(ml.c, $$1))
               .a(ie.a.c, mk.a().a(ml.c, $$2).a(ml.a, ml.a.b))
               .a(ie.a.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.b).a(ml.b, ml.a.b))
         );
   }

   private void a(cyo $$0, mu.a $$1, mu.a $$2) {
      aiy $$3 = $$1.create($$0, this.c);
      aiy $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aiy a(cyo $$0, String $$1, mq $$2, Function<aiy, ms> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ms.a($$0, $$1)), this.c);
   }

   static me e(cyo $$0, aiy $$1, aiy $$2) {
      return mh.a($$0).a(a(dlv.w, $$2, $$1));
   }

   static me e(cyo $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mh.a($$0).a(mi.a(dlv.bh).a(dmn.b, mk.a().a(ml.c, $$1)).a(dmn.a, mk.a().a(ml.c, $$2)).a(dmn.c, mk.a().a(ml.c, $$3)));
   }

   public void a(cyo $$0) {
      this.b($$0, mu.a);
   }

   public void b(cyo $$0, mu.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cyo $$0, ms $$1, mq $$2) {
      aiy $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private mb.b h(cyo $$0) {
      mu $$1 = this.g.getOrDefault($$0, mu.a.get($$0));
      return new mb.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cyo $$0, cyo $$1, cyo $$2) {
      ms $$3 = ms.u($$0);
      aiy $$4 = mr.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void i(cyo $$0) {
      ms $$1 = ms.t($$0);
      aiy $$2 = mr.v.a($$0, $$1, this.c);
      aiy $$3 = mr.w.a($$0, $$1, this.c);
      aiy $$4 = mr.x.a($$0, $$1, this.c);
      aiy $$5 = mr.y.a($$0, $$1, this.c);
      aiy $$6 = mr.z.a($$0, $$1, this.c);
      aiy $$7 = mr.A.a($$0, $$1, this.c);
      aiy $$8 = mr.B.a($$0, $$1, this.c);
      aiy $$9 = mr.C.a($$0, $$1, this.c);
      this.a($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(cyo $$0, cyo $$1) {
      aiy $$2 = mr.v.a($$0);
      aiy $$3 = mr.w.a($$0);
      aiy $$4 = mr.x.a($$0);
      aiy $$5 = mr.y.a($$0);
      aiy $$6 = mr.z.a($$0);
      aiy $$7 = mr.A.a($$0);
      aiy $$8 = mr.B.a($$0);
      aiy $$9 = mr.C.a($$0);
      this.a($$1, mp.a($$0.j()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cyo $$0) {
      ms $$1 = ms.b($$0);
      aiy $$2 = mr.ak.a($$0, $$1, this.c);
      aiy $$3 = mr.al.a($$0, $$1, this.c);
      aiy $$4 = mr.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cyo $$0) {
      ms $$1 = ms.b($$0);
      aiy $$2 = mr.ah.a($$0, $$1, this.c);
      aiy $$3 = mr.ai.a($$0, $$1, this.c);
      aiy $$4 = mr.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(cyo $$0, cyo $$1) {
      aiy $$2 = mr.ah.a($$0);
      aiy $$3 = mr.ai.a($$0);
      aiy $$4 = mr.aj.a($$0);
      this.a($$1, mp.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(cyq.sD);
      aiy $$0 = mp.a(cyq.sD);
      aiy $$1 = mp.a(cyq.sD, "_partial_tilt");
      aiy $$2 = mp.a(cyq.sD, "_full_tilt");
      this.b
         .accept(
            mh.a(cyq.sD)
               .a(b())
               .a(mi.a(dlv.bl).a(dmq.a, mk.a().a(ml.c, $$0)).a(dmq.b, mk.a().a(ml.c, $$0)).a(dmq.c, mk.a().a(ml.c, $$1)).a(dmq.d, mk.a().a(ml.c, $$2)))
         );
   }

   private mb.f l(cyo $$0) {
      return new mb.f(ms.n($$0));
   }

   private void m(cyo $$0) {
      this.c($$0, $$0);
   }

   private void c(cyo $$0, cyo $$1) {
      this.b.accept(c($$0, mp.a($$1)));
   }

   private void a(cyo $$0, mb.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cyo $$0, mb.e $$1, ms $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cyo $$0, mb.e $$1) {
      ms $$2 = ms.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cyo $$0, mb.e $$1, ms $$2) {
      aiy $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cyo $$0, mb.e $$1, dmi<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         mi $$4 = mi.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            ms $$5 = ms.c(ms.a($$0, $$4x));
            aiy $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return mk.a().a(ml.c, $$6);
         });
         this.a($$0.j());
         this.b.accept(mh.a($$0).a($$4));
      }
   }

   private void a(cyo $$0, cyo $$1, mb.e $$2) {
      this.a($$0, $$2);
      ms $$3 = ms.d($$0);
      aiy $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(cyo $$0, cyo $$1) {
      mu $$2 = mu.p.get($$0);
      aiy $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aiy $$4 = mr.aC.a($$1, $$2.b(), this.c);
      this.b.accept(mh.a($$1, mk.a().a(ml.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(cyo $$0, cyo $$1) {
      this.a($$0.j());
      ms $$2 = ms.h($$0);
      ms $$3 = ms.a($$0, $$1);
      aiy $$4 = mr.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            mh.a($$1, mk.a().a(ml.c, $$4))
               .a(mi.a(dlv.R).a(ie.e, mk.a()).a(ie.d, mk.a().a(ml.b, ml.a.d)).a(ie.c, mk.a().a(ml.b, ml.a.b)).a(ie.f, mk.a().a(ml.b, ml.a.c)))
         );
      this.b.accept(mh.a($$0).a(mi.a(dlv.av).a($$2x -> mk.a().a(ml.c, mr.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cyo $$0 = cyq.kC;
      this.a($$0.j());
      aiy $$1 = mp.a($$0, "_top");
      aiy $$2 = mp.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cyo $$0 = cyq.kB;
      this.a($$0.j());
      mi $$1 = mi.a(dec.d, dlv.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> mk.a().a(ml.c, mp.a($$0, "_top_stage_" + $$1x));
            case b -> mk.a().a(ml.c, mp.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mh.a($$0).a($$1));
   }

   private void a(cyo $$0, cyo $$1, cyo $$2, cyo $$3, cyo $$4, cyo $$5, cyo $$6, cyo $$7) {
      this.a($$0, mb.e.b);
      this.a($$1, mb.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(cyo $$0, mb.e $$1) {
      this.a($$0, "_top");
      aiy $$2 = this.a($$0, "_top", $$1.a(), ms::c);
      aiy $$3 = this.a($$0, "_bottom", $$1.a(), ms::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cyq.iD, "_front");
      aiy $$0 = mp.a(cyq.iD, "_top");
      aiy $$1 = this.a(cyq.iD, "_bottom", mb.e.b.a(), ms::c);
      this.f(cyq.iD, $$0, $$1);
   }

   private void k() {
      aiy $$0 = this.a(cyq.bx, "_top", mr.bk, ms::a);
      aiy $$1 = this.a(cyq.bx, "_bottom", mr.bk, ms::a);
      this.f(cyq.bx, $$0, $$1);
   }

   private void l() {
      this.c(cyq.sF);
      aiy $$0 = mp.a(cyq.sF, "_top");
      aiy $$1 = mp.a(cyq.sF, "_bottom");
      this.b.accept(mh.a(cyq.sF).a(b()).a(mi.a(dlv.ae).a(dmb.b, mk.a().a(ml.c, $$1)).a(dmb.a, mk.a().a(ml.c, $$0))));
   }

   private void f(cyo $$0, aiy $$1, aiy $$2) {
      this.b.accept(mh.a($$0).a(mi.a(dlv.ae).a(dmb.b, mk.a().a(ml.c, $$2)).a(dmb.a, mk.a().a(ml.c, $$1))));
   }

   private void n(cyo $$0) {
      ms $$1 = ms.e($$0);
      ms $$2 = ms.e(ms.a($$0, "_corner"));
      aiy $$3 = mr.as.a($$0, $$1, this.c);
      aiy $$4 = mr.at.a($$0, $$2, this.c);
      aiy $$5 = mr.au.a($$0, $$1, this.c);
      aiy $$6 = mr.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            mh.a($$0)
               .a(
                  mi.a(dlv.ag)
                     .a(dmj.a, mk.a().a(ml.c, $$3))
                     .a(dmj.b, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
                     .a(dmj.c, mk.a().a(ml.c, $$5).a(ml.b, ml.a.b))
                     .a(dmj.d, mk.a().a(ml.c, $$6).a(ml.b, ml.a.b))
                     .a(dmj.e, mk.a().a(ml.c, $$5))
                     .a(dmj.f, mk.a().a(ml.c, $$6))
                     .a(dmj.g, mk.a().a(ml.c, $$4))
                     .a(dmj.h, mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
                     .a(dmj.i, mk.a().a(ml.c, $$4).a(ml.b, ml.a.c))
                     .a(dmj.j, mk.a().a(ml.c, $$4).a(ml.b, ml.a.d))
               )
         );
   }

   private void o(cyo $$0) {
      aiy $$1 = this.a($$0, "", mr.as, ms::e);
      aiy $$2 = this.a($$0, "", mr.au, ms::e);
      aiy $$3 = this.a($$0, "", mr.av, ms::e);
      aiy $$4 = this.a($$0, "_on", mr.as, ms::e);
      aiy $$5 = this.a($$0, "_on", mr.au, ms::e);
      aiy $$6 = this.a($$0, "_on", mr.av, ms::e);
      mi $$7 = mi.a(dlv.w, dlv.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return mk.a().a(ml.c, $$6x ? $$4 : $$1);
            case b:
               return mk.a().a(ml.c, $$6x ? $$4 : $$1).a(ml.b, ml.a.b);
            case c:
               return mk.a().a(ml.c, $$6x ? $$5 : $$2).a(ml.b, ml.a.b);
            case d:
               return mk.a().a(ml.c, $$6x ? $$6 : $$3).a(ml.b, ml.a.b);
            case e:
               return mk.a().a(ml.c, $$6x ? $$5 : $$2);
            case f:
               return mk.a().a(ml.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(mh.a($$0).a($$7));
   }

   private mb.a a(aiy $$0, cyo $$1) {
      return new mb.a($$0, $$1);
   }

   private mb.a f(cyo $$0, cyo $$1) {
      return new mb.a(mp.a($$0), $$1);
   }

   private void a(cyo $$0, cou $$1) {
      aiy $$2 = mr.aa.a($$0, ms.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cyo $$0, aiy $$1) {
      aiy $$2 = mr.aa.a($$0, ms.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(cyo $$0, cyo $$1) {
      this.a($$0);
      aiy $$2 = mu.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cyo $$0) {
      this.a($$0.j());
      aiy $$1 = mu.k.create($$0, this.c);
      aiy $$2 = mu.l.create($$0, this.c);
      aiy $$3 = mu.m.create($$0, this.c);
      aiy $$4 = mu.n.create($$0, this.c);
      this.b
         .accept(
            mg.a($$0)
               .a(mf.a().a(dlv.S, 1, 2, 3, 4).a(dlv.R, ie.c), mk.a().a(ml.c, $$1))
               .a(mf.a().a(dlv.S, 1, 2, 3, 4).a(dlv.R, ie.f), mk.a().a(ml.c, $$1).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.S, 1, 2, 3, 4).a(dlv.R, ie.d), mk.a().a(ml.c, $$1).a(ml.b, ml.a.c))
               .a(mf.a().a(dlv.S, 1, 2, 3, 4).a(dlv.R, ie.e), mk.a().a(ml.c, $$1).a(ml.b, ml.a.d))
               .a(mf.a().a(dlv.S, 2, 3, 4).a(dlv.R, ie.c), mk.a().a(ml.c, $$2))
               .a(mf.a().a(dlv.S, 2, 3, 4).a(dlv.R, ie.f), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.S, 2, 3, 4).a(dlv.R, ie.d), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c))
               .a(mf.a().a(dlv.S, 2, 3, 4).a(dlv.R, ie.e), mk.a().a(ml.c, $$2).a(ml.b, ml.a.d))
               .a(mf.a().a(dlv.S, 3, 4).a(dlv.R, ie.c), mk.a().a(ml.c, $$3))
               .a(mf.a().a(dlv.S, 3, 4).a(dlv.R, ie.f), mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.S, 3, 4).a(dlv.R, ie.d), mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               .a(mf.a().a(dlv.S, 3, 4).a(dlv.R, ie.e), mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
               .a(mf.a().a(dlv.S, 4).a(dlv.R, ie.c), mk.a().a(ml.c, $$4))
               .a(mf.a().a(dlv.S, 4).a(dlv.R, ie.f), mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.S, 4).a(dlv.R, ie.d), mk.a().a(ml.c, $$4).a(ml.b, ml.a.c))
               .a(mf.a().a(dlv.S, 4).a(dlv.R, ie.e), mk.a().a(ml.c, $$4).a(ml.b, ml.a.d))
         );
   }

   private void a(mu.a $$0, cyo... $$1) {
      for (cyo $$2 : $$1) {
         aiy $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(mu.a $$0, cyo... $$1) {
      for (cyo $$2 : $$1) {
         aiy $$3 = $$0.create($$2, this.c);
         this.b.accept(mh.a($$2, mk.a().a(ml.c, $$3)).a(c()));
      }
   }

   private void h(cyo $$0, cyo $$1) {
      this.a($$0);
      ms $$2 = ms.b($$0, $$1);
      aiy $$3 = mr.aI.a($$1, $$2, this.c);
      aiy $$4 = mr.aJ.a($$1, $$2, this.c);
      aiy $$5 = mr.aK.a($$1, $$2, this.c);
      aiy $$6 = mr.aG.a($$1, $$2, this.c);
      aiy $$7 = mr.aH.a($$1, $$2, this.c);
      cou $$8 = $$1.j();
      mr.bx.a(mp.a($$8), ms.F($$0), this.c);
      this.b
         .accept(
            mg.a($$1)
               .a(mk.a().a(ml.c, $$3))
               .a(mf.a().a(dlv.L, true), mk.a().a(ml.c, $$4))
               .a(mf.a().a(dlv.M, true), mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.N, true), mk.a().a(ml.c, $$5))
               .a(mf.a().a(dlv.O, true), mk.a().a(ml.c, $$5).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.L, false), mk.a().a(ml.c, $$6))
               .a(mf.a().a(dlv.M, false), mk.a().a(ml.c, $$7))
               .a(mf.a().a(dlv.N, false), mk.a().a(ml.c, $$7).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.O, false), mk.a().a(ml.c, $$6).a(ml.b, ml.a.d))
         );
   }

   private void q(cyo $$0) {
      ms $$1 = ms.z($$0);
      aiy $$2 = mr.aL.a($$0, $$1, this.c);
      aiy $$3 = this.a($$0, "_conditional", mr.aL, $$1x -> $$1.c(mt.i, $$1x));
      this.b.accept(mh.a($$0).a(a(dlv.c, $$3, $$2)).a(e()));
   }

   private void r(cyo $$0) {
      aiy $$1 = mu.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<mk> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> mk.a().a(ml.c, mp.a(cyq.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cyq.mZ);
      this.b
         .accept(
            mg.a(cyq.mZ)
               .a(mf.a().a(dlv.aq, 0), this.a(0))
               .a(mf.a().a(dlv.aq, 1), this.a(1))
               .a(mf.a().a(dlv.bk, dlr.b), mk.a().a(ml.c, mp.a(cyq.mZ, "_small_leaves")))
               .a(mf.a().a(dlv.bk, dlr.c), mk.a().a(ml.c, mp.a(cyq.mZ, "_large_leaves")))
         );
   }

   private mi n() {
      return mi.a(dlv.P)
         .a(ie.a, mk.a().a(ml.a, ml.a.c))
         .a(ie.b, mk.a())
         .a(ie.c, mk.a().a(ml.a, ml.a.b))
         .a(ie.d, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.c))
         .a(ie.e, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.d))
         .a(ie.f, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.b));
   }

   private void o() {
      aiy $$0 = ms.a(cyq.nU, "_top_open");
      this.b
         .accept(
            mh.a(cyq.nU)
               .a(this.n())
               .a(
                  mi.a(dlv.u)
                     .a(false, mk.a().a(ml.c, mu.f.create(cyq.nU, this.c)))
                     .a(true, mk.a().a(ml.c, mu.f.get(cyq.nU).a($$1 -> $$1.a(mt.f, $$0)).a(cyq.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mi a(dmi<T> $$0, T $$1, aiy $$2, aiy $$3) {
      mk $$4 = mk.a().a(ml.c, $$2);
      mk $$5 = mk.a().a(ml.c, $$3);
      return mi.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cyo $$0, Function<cyo, ms> $$1) {
      ms $$2 = $$1.apply($$0).b(mt.i, mt.c);
      ms $$3 = $$2.c(mt.g, ms.a($$0, "_front_honey"));
      aiy $$4 = mr.q.a($$0, $$2, this.c);
      aiy $$5 = mr.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(mh.a($$0).a(b()).a(a(dlv.aN, 5, $$5, $$4)));
   }

   private void a(cyo $$0, dmi<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aiy> $$3 = new Int2ObjectOpenHashMap();
         mi $$4 = mi.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aiy $$5 = (aiy)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mr.aV, ms::g));
            return mk.a().a(ml.c, $$5);
         });
         this.a($$0.j());
         this.b.accept(mh.a($$0).a($$4));
      }
   }

   private void p() {
      aiy $$0 = mp.a(cyq.od, "_floor");
      aiy $$1 = mp.a(cyq.od, "_ceiling");
      aiy $$2 = mp.a(cyq.od, "_wall");
      aiy $$3 = mp.a(cyq.od, "_between_walls");
      this.a(cpc.wi);
      this.b
         .accept(
            mh.a(cyq.od)
               .a(
                  mi.a(dlv.R, dlv.V)
                     .a(ie.c, dlt.a, mk.a().a(ml.c, $$0))
                     .a(ie.d, dlt.a, mk.a().a(ml.c, $$0).a(ml.b, ml.a.c))
                     .a(ie.f, dlt.a, mk.a().a(ml.c, $$0).a(ml.b, ml.a.b))
                     .a(ie.e, dlt.a, mk.a().a(ml.c, $$0).a(ml.b, ml.a.d))
                     .a(ie.c, dlt.b, mk.a().a(ml.c, $$1))
                     .a(ie.d, dlt.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c))
                     .a(ie.f, dlt.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b))
                     .a(ie.e, dlt.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d))
                     .a(ie.c, dlt.c, mk.a().a(ml.c, $$2).a(ml.b, ml.a.d))
                     .a(ie.d, dlt.c, mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
                     .a(ie.f, dlt.c, mk.a().a(ml.c, $$2))
                     .a(ie.e, dlt.c, mk.a().a(ml.c, $$2).a(ml.b, ml.a.c))
                     .a(ie.d, dlt.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
                     .a(ie.c, dlt.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
                     .a(ie.f, dlt.d, mk.a().a(ml.c, $$3))
                     .a(ie.e, dlt.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mh.a(cyq.nZ, mk.a().a(ml.c, mp.a(cyq.nZ)))
               .a(
                  mi.a(dlv.U, dlv.R)
                     .a(dlq.a, ie.c, mk.a())
                     .a(dlq.a, ie.f, mk.a().a(ml.b, ml.a.b))
                     .a(dlq.a, ie.d, mk.a().a(ml.b, ml.a.c))
                     .a(dlq.a, ie.e, mk.a().a(ml.b, ml.a.d))
                     .a(dlq.b, ie.c, mk.a().a(ml.a, ml.a.b))
                     .a(dlq.b, ie.f, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.b))
                     .a(dlq.b, ie.d, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.c))
                     .a(dlq.b, ie.e, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.d))
                     .a(dlq.c, ie.d, mk.a().a(ml.a, ml.a.c))
                     .a(dlq.c, ie.e, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.b))
                     .a(dlq.c, ie.c, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.c))
                     .a(dlq.c, ie.f, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.d))
               )
         );
   }

   private void d(cyo $$0, mu.a $$1) {
      aiy $$2 = $$1.create($$0, this.c);
      aiy $$3 = ms.a($$0, "_front_on");
      aiy $$4 = $$1.get($$0).a($$1x -> $$1x.a(mt.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mh.a($$0).a(a(dlv.r, $$4, $$2)).a(b()));
   }

   private void a(cyo... $$0) {
      aiy $$1 = mp.a("campfire_off");

      for (cyo $$2 : $$0) {
         aiy $$3 = mr.bc.a($$2, ms.E($$2), this.c);
         this.a($$2.j());
         this.b.accept(mh.a($$2).a(a(dlv.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cyo $$0) {
      aiy $$1 = mr.bt.a($$0, ms.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cyo $$0) {
      aiy $$1;
      if ($$0 == cyq.tj) {
         $$1 = mr.bv.a($$0, ms.m($$0), this.c);
      } else {
         $$1 = mr.bu.a($$0, ms.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ms $$0 = ms.a(ms.G(cyq.cl), ms.G(cyq.n));
      aiy $$1 = mr.j.a(cyq.cl, $$0, this.c);
      this.b.accept(c(cyq.cl, $$1));
   }

   private void s() {
      this.a(cpc.lG);
      this.b
         .accept(
            mg.a(cyq.cw)
               .a(
                  mf.b(
                     mf.a().a(dlv.ab, dmk.c).a(dlv.aa, dmk.c).a(dlv.ac, dmk.c).a(dlv.ad, dmk.c),
                     mf.a().a(dlv.ab, dmk.b, dmk.a).a(dlv.aa, dmk.b, dmk.a),
                     mf.a().a(dlv.aa, dmk.b, dmk.a).a(dlv.ac, dmk.b, dmk.a),
                     mf.a().a(dlv.ac, dmk.b, dmk.a).a(dlv.ad, dmk.b, dmk.a),
                     mf.a().a(dlv.ad, dmk.b, dmk.a).a(dlv.ab, dmk.b, dmk.a)
                  ),
                  mk.a().a(ml.c, mp.a("redstone_dust_dot"))
               )
               .a(mf.a().a(dlv.ab, dmk.b, dmk.a), mk.a().a(ml.c, mp.a("redstone_dust_side0")))
               .a(mf.a().a(dlv.ac, dmk.b, dmk.a), mk.a().a(ml.c, mp.a("redstone_dust_side_alt0")))
               .a(mf.a().a(dlv.aa, dmk.b, dmk.a), mk.a().a(ml.c, mp.a("redstone_dust_side_alt1")).a(ml.b, ml.a.d))
               .a(mf.a().a(dlv.ad, dmk.b, dmk.a), mk.a().a(ml.c, mp.a("redstone_dust_side1")).a(ml.b, ml.a.d))
               .a(mf.a().a(dlv.ab, dmk.a), mk.a().a(ml.c, mp.a("redstone_dust_up")))
               .a(mf.a().a(dlv.aa, dmk.a), mk.a().a(ml.c, mp.a("redstone_dust_up")).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.ac, dmk.a), mk.a().a(ml.c, mp.a("redstone_dust_up")).a(ml.b, ml.a.c))
               .a(mf.a().a(dlv.ad, dmk.a), mk.a().a(ml.c, mp.a("redstone_dust_up")).a(ml.b, ml.a.d))
         );
   }

   private void t() {
      this.a(cpc.lK);
      this.b
         .accept(
            mh.a(cyq.gY)
               .a(c())
               .a(
                  mi.a(dlv.bd, dlv.w)
                     .a(dly.a, false, mk.a().a(ml.c, mp.a(cyq.gY)))
                     .a(dly.a, true, mk.a().a(ml.c, mp.a(cyq.gY, "_on")))
                     .a(dly.b, false, mk.a().a(ml.c, mp.a(cyq.gY, "_subtract")))
                     .a(dly.b, true, mk.a().a(ml.c, mp.a(cyq.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      ms $$0 = ms.a(cyq.jR);
      ms $$1 = ms.a(ms.a(cyq.jE, "_side"), $$0.a(mt.f));
      aiy $$2 = mr.ab.a(cyq.jE, $$1, this.c);
      aiy $$3 = mr.ac.a(cyq.jE, $$1, this.c);
      aiy $$4 = mr.j.b(cyq.jE, "_double", $$1, this.c);
      this.b.accept(e(cyq.jE, $$2, $$3, $$4));
      this.b.accept(c(cyq.jR, mr.c.a(cyq.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cpc.sp);
      this.b
         .accept(
            mg.a(cyq.fs)
               .a(mk.a().a(ml.c, ms.G(cyq.fs)))
               .a(mf.a().a(dlv.k, true), mk.a().a(ml.c, ms.a(cyq.fs, "_bottle0")))
               .a(mf.a().a(dlv.l, true), mk.a().a(ml.c, ms.a(cyq.fs, "_bottle1")))
               .a(mf.a().a(dlv.m, true), mk.a().a(ml.c, ms.a(cyq.fs, "_bottle2")))
               .a(mf.a().a(dlv.k, false), mk.a().a(ml.c, ms.a(cyq.fs, "_empty0")))
               .a(mf.a().a(dlv.l, false), mk.a().a(ml.c, ms.a(cyq.fs, "_empty1")))
               .a(mf.a().a(dlv.m, false), mk.a().a(ml.c, ms.a(cyq.fs, "_empty2")))
         );
   }

   private void u(cyo $$0) {
      aiy $$1 = mr.bp.a($$0, ms.b($$0), this.c);
      aiy $$2 = mp.a("mushroom_block_inside");
      this.b
         .accept(
            mg.a($$0)
               .a(mf.a().a(dlv.L, true), mk.a().a(ml.c, $$1))
               .a(mf.a().a(dlv.M, true), mk.a().a(ml.c, $$1).a(ml.b, ml.a.b).a(ml.d, true))
               .a(mf.a().a(dlv.N, true), mk.a().a(ml.c, $$1).a(ml.b, ml.a.c).a(ml.d, true))
               .a(mf.a().a(dlv.O, true), mk.a().a(ml.c, $$1).a(ml.b, ml.a.d).a(ml.d, true))
               .a(mf.a().a(dlv.J, true), mk.a().a(ml.c, $$1).a(ml.a, ml.a.d).a(ml.d, true))
               .a(mf.a().a(dlv.K, true), mk.a().a(ml.c, $$1).a(ml.a, ml.a.b).a(ml.d, true))
               .a(mf.a().a(dlv.L, false), mk.a().a(ml.c, $$2))
               .a(mf.a().a(dlv.M, false), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, false))
               .a(mf.a().a(dlv.N, false), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, false))
               .a(mf.a().a(dlv.O, false), mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, false))
               .a(mf.a().a(dlv.J, false), mk.a().a(ml.c, $$2).a(ml.a, ml.a.d).a(ml.d, false))
               .a(mf.a().a(dlv.K, false), mk.a().a(ml.c, $$2).a(ml.a, ml.a.b).a(ml.d, false))
         );
      this.a($$0, mu.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cpc.rA);
      this.b
         .accept(
            mh.a(cyq.eg)
               .a(
                  mi.a(dlv.ay)
                     .a(0, mk.a().a(ml.c, mp.a(cyq.eg)))
                     .a(1, mk.a().a(ml.c, mp.a(cyq.eg, "_slice1")))
                     .a(2, mk.a().a(ml.c, mp.a(cyq.eg, "_slice2")))
                     .a(3, mk.a().a(ml.c, mp.a(cyq.eg, "_slice3")))
                     .a(4, mk.a().a(ml.c, mp.a(cyq.eg, "_slice4")))
                     .a(5, mk.a().a(ml.c, mp.a(cyq.eg, "_slice5")))
                     .a(6, mk.a().a(ml.c, mp.a(cyq.eg, "_slice6")))
               )
         );
   }

   private void x() {
      ms $$0 = new ms()
         .a(mt.c, ms.a(cyq.nX, "_side3"))
         .a(mt.o, ms.G(cyq.t))
         .a(mt.n, ms.a(cyq.nX, "_top"))
         .a(mt.j, ms.a(cyq.nX, "_side3"))
         .a(mt.l, ms.a(cyq.nX, "_side3"))
         .a(mt.k, ms.a(cyq.nX, "_side1"))
         .a(mt.m, ms.a(cyq.nX, "_side2"));
      this.b.accept(c(cyq.nX, mr.a.a(cyq.nX, $$0, this.c)));
   }

   private void y() {
      ms $$0 = new ms()
         .a(mt.c, ms.a(cyq.ob, "_front"))
         .a(mt.o, ms.a(cyq.ob, "_bottom"))
         .a(mt.n, ms.a(cyq.ob, "_top"))
         .a(mt.j, ms.a(cyq.ob, "_front"))
         .a(mt.k, ms.a(cyq.ob, "_front"))
         .a(mt.l, ms.a(cyq.ob, "_side"))
         .a(mt.m, ms.a(cyq.ob, "_side"));
      this.b.accept(c(cyq.ob, mr.a.a(cyq.ob, $$0, this.c)));
   }

   private void a(cyo $$0, cyo $$1, BiFunction<cyo, cyo, ms> $$2) {
      ms $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mr.a.a($$0, $$3, this.c)));
   }

   public void b(cyo $$0) {
      ms $$1 = new ms()
         .a(mt.c, ms.a($$0, "_particle"))
         .a(mt.o, ms.a($$0, "_down"))
         .a(mt.n, ms.a($$0, "_up"))
         .a(mt.j, ms.a($$0, "_north"))
         .a(mt.k, ms.a($$0, "_south"))
         .a(mt.l, ms.a($$0, "_east"))
         .a(mt.m, ms.a($$0, "_west"));
      this.b.accept(c($$0, mr.a.a($$0, $$1, this.c)));
   }

   private void z() {
      ms $$0 = ms.k(cyq.eZ);
      this.b.accept(c(cyq.eZ, mp.a(cyq.eZ)));
      this.a(cyq.ee, $$0);
      this.a(cyq.ef, $$0);
   }

   private void a(cyo $$0, ms $$1) {
      aiy $$2 = mr.p.a($$0, $$1.c(mt.g, ms.G($$0)), this.c);
      this.b.accept(mh.a($$0, mk.a().a(ml.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cpc.sq);
      this.m(cyq.ft);
      this.b.accept(c(cyq.fv, mr.bs.a(cyq.fv, ms.j(ms.a(cyq.H, "_still")), this.c)));
      this.b
         .accept(
            mh.a(cyq.fu)
               .a(
                  mi.a(dcw.g)
                     .a(1, mk.a().a(ml.c, mr.bq.a(cyq.fu, "_level1", ms.j(ms.a(cyq.G, "_still")), this.c)))
                     .a(2, mk.a().a(ml.c, mr.br.a(cyq.fu, "_level2", ms.j(ms.a(cyq.G, "_still")), this.c)))
                     .a(3, mk.a().a(ml.c, mr.bs.a(cyq.fu, "_full", ms.j(ms.a(cyq.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mh.a(cyq.fw)
               .a(
                  mi.a(dcw.g)
                     .a(1, mk.a().a(ml.c, mr.bq.a(cyq.fw, "_level1", ms.j(ms.G(cyq.qP)), this.c)))
                     .a(2, mk.a().a(ml.c, mr.br.a(cyq.fw, "_level2", ms.j(ms.G(cyq.qP)), this.c)))
                     .a(3, mk.a().a(ml.c, mr.bs.a(cyq.fw, "_full", ms.j(ms.G(cyq.qP)), this.c)))
               )
         );
   }

   private void B() {
      ms $$0 = ms.b(cyq.kv);
      aiy $$1 = mr.aE.a(cyq.kv, $$0, this.c);
      aiy $$2 = this.a(cyq.kv, "_dead", mr.aE, $$1x -> $$0.c(mt.b, $$1x));
      this.b.accept(mh.a(cyq.kv).a(a(dlv.au, 5, $$2, $$1)));
   }

   private void C() {
      aiy $$0 = mp.a(cyq.tq);
      aiy $$1 = mp.a(cyq.tq, "_triggered");
      aiy $$2 = mp.a(cyq.tq, "_crafting");
      aiy $$3 = mp.a(cyq.tq, "_crafting_triggered");
      this.b
         .accept(
            mh.a(cyq.tq)
               .a(mi.a(dlv.T).a($$0x -> this.a($$0x, mk.a())))
               .a(
                  mi.a(dlv.A, dah.b)
                     .a(false, false, mk.a().a(ml.c, $$0))
                     .a(true, true, mk.a().a(ml.c, $$3))
                     .a(true, false, mk.a().a(ml.c, $$1))
                     .a(false, true, mk.a().a(ml.c, $$2))
               )
         );
   }

   private void v(cyo $$0) {
      ms $$1 = new ms().a(mt.f, ms.a(cyq.cD, "_top")).a(mt.i, ms.a(cyq.cD, "_side")).a(mt.g, ms.a($$0, "_front"));
      ms $$2 = new ms().a(mt.i, ms.a(cyq.cD, "_top")).a(mt.g, ms.a($$0, "_front_vertical"));
      aiy $$3 = mr.p.a($$0, $$1, this.c);
      aiy $$4 = mr.r.a($$0, $$2, this.c);
      this.b
         .accept(
            mh.a($$0)
               .a(
                  mi.a(dlv.P)
                     .a(ie.a, mk.a().a(ml.c, $$4).a(ml.a, ml.a.c))
                     .a(ie.b, mk.a().a(ml.c, $$4))
                     .a(ie.c, mk.a().a(ml.c, $$3))
                     .a(ie.f, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
                     .a(ie.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
                     .a(ie.e, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
               )
         );
   }

   private void D() {
      aiy $$0 = mp.a(cyq.fy);
      aiy $$1 = mp.a(cyq.fy, "_filled");
      this.b.accept(mh.a(cyq.fy).a(mi.a(dlv.h).a(false, mk.a().a(ml.c, $$0)).a(true, mk.a().a(ml.c, $$1))).a(c()));
   }

   private void E() {
      aiy $$0 = mp.a(cyq.ku, "_side");
      aiy $$1 = mp.a(cyq.ku, "_noside");
      aiy $$2 = mp.a(cyq.ku, "_noside1");
      aiy $$3 = mp.a(cyq.ku, "_noside2");
      aiy $$4 = mp.a(cyq.ku, "_noside3");
      this.b
         .accept(
            mg.a(cyq.ku)
               .a(mf.a().a(dlv.L, true), mk.a().a(ml.c, $$0))
               .a(mf.a().a(dlv.M, true), mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.d, true))
               .a(mf.a().a(dlv.N, true), mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.d, true))
               .a(mf.a().a(dlv.O, true), mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.d, true))
               .a(mf.a().a(dlv.J, true), mk.a().a(ml.c, $$0).a(ml.a, ml.a.d).a(ml.d, true))
               .a(mf.a().a(dlv.K, true), mk.a().a(ml.c, $$0).a(ml.a, ml.a.b).a(ml.d, true))
               .a(mf.a().a(dlv.L, false), mk.a().a(ml.c, $$1).a(ml.e, 2), mk.a().a(ml.c, $$2), mk.a().a(ml.c, $$3), mk.a().a(ml.c, $$4))
               .a(
                  mf.a().a(dlv.M, false),
                  mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$3).a(ml.b, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$4).a(ml.b, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.b, ml.a.b).a(ml.d, true)
               )
               .a(
                  mf.a().a(dlv.N, false),
                  mk.a().a(ml.c, $$3).a(ml.b, ml.a.c).a(ml.d, true),
                  mk.a().a(ml.c, $$4).a(ml.b, ml.a.c).a(ml.d, true),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.b, ml.a.c).a(ml.d, true),
                  mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, true)
               )
               .a(
                  mf.a().a(dlv.O, false),
                  mk.a().a(ml.c, $$4).a(ml.b, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.b, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$3).a(ml.b, ml.a.d).a(ml.d, true)
               )
               .a(
                  mf.a().a(dlv.J, false),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.a, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$4).a(ml.a, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$2).a(ml.a, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$3).a(ml.a, ml.a.d).a(ml.d, true)
               )
               .a(
                  mf.a().a(dlv.K, false),
                  mk.a().a(ml.c, $$4).a(ml.a, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$3).a(ml.a, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$2).a(ml.a, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.a, ml.a.b).a(ml.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            mg.a(cyq.pc)
               .a(mk.a().a(ml.c, ms.G(cyq.pc)))
               .a(mf.a().a(dlv.aL, 1), mk.a().a(ml.c, ms.a(cyq.pc, "_contents1")))
               .a(mf.a().a(dlv.aL, 2), mk.a().a(ml.c, ms.a(cyq.pc, "_contents2")))
               .a(mf.a().a(dlv.aL, 3), mk.a().a(ml.c, ms.a(cyq.pc, "_contents3")))
               .a(mf.a().a(dlv.aL, 4), mk.a().a(ml.c, ms.a(cyq.pc, "_contents4")))
               .a(mf.a().a(dlv.aL, 5), mk.a().a(ml.c, ms.a(cyq.pc, "_contents5")))
               .a(mf.a().a(dlv.aL, 6), mk.a().a(ml.c, ms.a(cyq.pc, "_contents6")))
               .a(mf.a().a(dlv.aL, 7), mk.a().a(ml.c, ms.a(cyq.pc, "_contents7")))
               .a(mf.a().a(dlv.aL, 8), mk.a().a(ml.c, ms.a(cyq.pc, "_contents_ready")))
         );
   }

   private void w(cyo $$0) {
      aiy $$1 = mr.c.a($$0, ms.a($$0), this.c);
      aiy $$2 = this.a($$0, "_powered", mr.c, ms::b);
      aiy $$3 = this.a($$0, "_lit", mr.c, ms::b);
      aiy $$4 = this.a($$0, "_lit_powered", mr.c, ms::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private me a(cyo $$0, aiy $$1, aiy $$2, aiy $$3, aiy $$4) {
      return mh.a($$0).a(mi.a(dlv.r, dlv.w).a(($$4x, $$5) -> $$4x ? mk.a().a(ml.c, $$5 ? $$4 : $$2) : mk.a().a(ml.c, $$5 ? $$3 : $$1)));
   }

   private void i(cyo $$0, cyo $$1) {
      aiy $$2 = mp.a($$0);
      aiy $$3 = mp.a($$0, "_powered");
      aiy $$4 = mp.a($$0, "_lit");
      aiy $$5 = mp.a($$0, "_lit_powered");
      this.a($$1, mp.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(cyo $$0) {
      this.c($$0);
      this.b.accept(mh.a($$0, mk.a().a(ml.c, mr.ao.a($$0, ms.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(cyq.qy);
      this.x(cyq.qx);
      this.x(cyq.qw);
      this.x(cyq.qv);
   }

   private void H() {
      this.c(cyq.st);
      mi.b<ie, dmc> $$0 = mi.a(dlv.bm, dlv.bn);

      for (dmc $$1 : dmc.values()) {
         $$0.a(ie.b, $$1, this.a(ie.b, $$1));
      }

      for (dmc $$2 : dmc.values()) {
         $$0.a(ie.a, $$2, this.a(ie.a, $$2));
      }

      this.b.accept(mh.a(cyq.st).a($$0));
   }

   private mk a(ie $$0, dmc $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ms $$3 = ms.c(ms.a(cyq.st, $$2));
      return mk.a().a(ml.c, mr.an.a(cyq.st, $$2, $$3, this.c));
   }

   private void y(cyo $$0) {
      ms $$1 = new ms().a(mt.e, ms.G(cyq.dV)).a(mt.f, ms.G($$0)).a(mt.i, ms.a($$0, "_side"));
      this.b.accept(c($$0, mr.n.a($$0, $$1, this.c)));
   }

   private void I() {
      aiy $$0 = ms.a(cyq.gZ, "_side");
      ms $$1 = new ms().a(mt.f, ms.a(cyq.gZ, "_top")).a(mt.i, $$0);
      ms $$2 = new ms().a(mt.f, ms.a(cyq.gZ, "_inverted_top")).a(mt.i, $$0);
      this.b
         .accept(
            mh.a(cyq.gZ)
               .a(mi.a(dlv.p).a(false, mk.a().a(ml.c, mr.aF.a(cyq.gZ, $$1, this.c))).a(true, mk.a().a(ml.c, mr.aF.a(mp.a(cyq.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(cyo $$0) {
      this.b.accept(mh.a($$0, mk.a().a(ml.c, mp.a($$0))).a(this.n()));
   }

   private void J() {
      cyo $$0 = cyq.ss;
      aiy $$1 = mp.a($$0, "_on");
      aiy $$2 = mp.a($$0);
      this.b.accept(mh.a($$0, mk.a().a(ml.c, mp.a($$0))).a(this.n()).a(a(dlv.w, $$1, $$2)));
   }

   private void K() {
      ms $$0 = new ms().a(mt.B, ms.G(cyq.j)).a(mt.f, ms.G(cyq.cC));
      ms $$1 = new ms().a(mt.B, ms.G(cyq.j)).a(mt.f, ms.a(cyq.cC, "_moist"));
      aiy $$2 = mr.aW.a(cyq.cC, $$0, this.c);
      aiy $$3 = mr.aW.a(ms.a(cyq.cC, "_moist"), $$1, this.c);
      this.b.accept(mh.a(cyq.cC).a(a(dlv.aQ, 7, $$3, $$2)));
   }

   private List<aiy> A(cyo $$0) {
      aiy $$1 = mr.aX.a(mp.a($$0, "_floor0"), ms.v($$0), this.c);
      aiy $$2 = mr.aX.a(mp.a($$0, "_floor1"), ms.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aiy> B(cyo $$0) {
      aiy $$1 = mr.aY.a(mp.a($$0, "_side0"), ms.v($$0), this.c);
      aiy $$2 = mr.aY.a(mp.a($$0, "_side1"), ms.w($$0), this.c);
      aiy $$3 = mr.aZ.a(mp.a($$0, "_side_alt0"), ms.v($$0), this.c);
      aiy $$4 = mr.aZ.a(mp.a($$0, "_side_alt1"), ms.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aiy> C(cyo $$0) {
      aiy $$1 = mr.ba.a(mp.a($$0, "_up0"), ms.v($$0), this.c);
      aiy $$2 = mr.ba.a(mp.a($$0, "_up1"), ms.w($$0), this.c);
      aiy $$3 = mr.bb.a(mp.a($$0, "_up_alt0"), ms.v($$0), this.c);
      aiy $$4 = mr.bb.a(mp.a($$0, "_up_alt1"), ms.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<mk> a(List<aiy> $$0, UnaryOperator<mk> $$1) {
      return $$0.stream().map($$0x -> mk.a().a(ml.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      mf $$0 = mf.a().a(dlv.L, false).a(dlv.M, false).a(dlv.N, false).a(dlv.O, false).a(dlv.J, false);
      List<aiy> $$1 = this.A(cyq.cr);
      List<aiy> $$2 = this.B(cyq.cr);
      List<aiy> $$3 = this.C(cyq.cr);
      this.b
         .accept(
            mg.a(cyq.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(mf.b(mf.a().a(dlv.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(mf.b(mf.a().a(dlv.M, true), $$0), a($$2, $$0x -> $$0x.a(ml.b, ml.a.b)))
               .a(mf.b(mf.a().a(dlv.N, true), $$0), a($$2, $$0x -> $$0x.a(ml.b, ml.a.c)))
               .a(mf.b(mf.a().a(dlv.O, true), $$0), a($$2, $$0x -> $$0x.a(ml.b, ml.a.d)))
               .a(mf.a().a(dlv.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<aiy> $$0 = this.A(cyq.cs);
      List<aiy> $$1 = this.B(cyq.cs);
      this.b
         .accept(
            mg.a(cyq.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ml.b, ml.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ml.b, ml.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ml.b, ml.a.d)))
         );
   }

   private void D(cyo $$0) {
      aiy $$1 = mu.t.create($$0, this.c);
      aiy $$2 = mu.u.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(mh.a($$0).a(a(dlv.j, $$2, $$1)));
   }

   private void N() {
      ms $$0 = ms.a(ms.a(cyq.ad, "_side"), ms.a(cyq.ad, "_top"));
      aiy $$1 = mr.j.a(cyq.ad, $$0, this.c);
      this.b.accept(d(cyq.ad, $$1));
   }

   private void O() {
      this.a(cpc.ad);
      cyo $$0 = cyq.E;
      mi.b<Boolean, Integer> $$1 = mi.a(ddi.d, ddi.b);
      aiy $$2 = mp.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aiy $$4 = mp.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, mk.a().a(ml.c, $$4));
         $$1.a(false, $$3, mk.a().a(ml.c, $$2));
      }

      this.b.accept(mh.a(cyq.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mh.a(cyq.kI)
               .a(
                  mi.a(dlv.as)
                     .a(0, mk.a().a(ml.c, this.a(cyq.kI, "_0", mr.c, ms::b)))
                     .a(1, mk.a().a(ml.c, this.a(cyq.kI, "_1", mr.c, ms::b)))
                     .a(2, mk.a().a(ml.c, this.a(cyq.kI, "_2", mr.c, ms::b)))
                     .a(3, mk.a().a(ml.c, this.a(cyq.kI, "_3", mr.c, ms::b)))
               )
         );
   }

   private void Q() {
      aiy $$0 = ms.G(cyq.j);
      ms $$1 = new ms().a(mt.e, $$0).b(mt.e, mt.c).a(mt.f, ms.a(cyq.i, "_top")).a(mt.i, ms.a(cyq.i, "_snow"));
      mk $$2 = mk.a().a(ml.c, mr.n.a(cyq.i, "_snow", $$1, this.c));
      this.a(cyq.i, mp.a(cyq.i), $$2);
      aiy $$3 = mu.f.get(cyq.fl).a($$1x -> $$1x.a(mt.e, $$0)).a(cyq.fl, this.c);
      this.a(cyq.fl, $$3, $$2);
      aiy $$4 = mu.f.get(cyq.l).a($$1x -> $$1x.a(mt.e, $$0)).a(cyq.l, this.c);
      this.a(cyq.l, $$4, $$2);
   }

   private void a(cyo $$0, aiy $$1, mk $$2) {
      List<mk> $$3 = Arrays.asList(a($$1));
      this.b.accept(mh.a($$0).a(mi.a(dlv.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cpc.rg);
      this.b
         .accept(
            mh.a(cyq.fC)
               .a(
                  mi.a(dlv.ar)
                     .a(0, mk.a().a(ml.c, mp.a(cyq.fC, "_stage0")))
                     .a(1, mk.a().a(ml.c, mp.a(cyq.fC, "_stage1")))
                     .a(2, mk.a().a(ml.c, mp.a(cyq.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cyq.kE, mp.a(cyq.kE)));
   }

   private void j(cyo $$0, cyo $$1) {
      ms $$2 = ms.b($$1);
      aiy $$3 = mr.Y.a($$0, $$2, this.c);
      aiy $$4 = mr.Z.a($$0, $$2, this.c);
      this.b.accept(mh.a($$0).a(a(dlv.aT, 1, $$4, $$3)));
   }

   private void T() {
      aiy $$0 = mp.a(cyq.hc);
      aiy $$1 = mp.a(cyq.hc, "_side");
      this.a(cpc.lQ);
      this.b
         .accept(
            mh.a(cyq.hc)
               .a(
                  mi.a(dlv.Q)
                     .a(ie.a, mk.a().a(ml.c, $$0))
                     .a(ie.c, mk.a().a(ml.c, $$1))
                     .a(ie.f, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b))
                     .a(ie.d, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c))
                     .a(ie.e, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d))
               )
         );
   }

   private void k(cyo $$0, cyo $$1) {
      aiy $$2 = mp.a($$0);
      this.b.accept(mh.a($$1, mk.a().a(ml.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      aiy $$0 = mp.a(cyq.eW, "_post_ends");
      aiy $$1 = mp.a(cyq.eW, "_post");
      aiy $$2 = mp.a(cyq.eW, "_cap");
      aiy $$3 = mp.a(cyq.eW, "_cap_alt");
      aiy $$4 = mp.a(cyq.eW, "_side");
      aiy $$5 = mp.a(cyq.eW, "_side_alt");
      this.b
         .accept(
            mg.a(cyq.eW)
               .a(mk.a().a(ml.c, $$0))
               .a(mf.a().a(dlv.L, false).a(dlv.M, false).a(dlv.N, false).a(dlv.O, false), mk.a().a(ml.c, $$1))
               .a(mf.a().a(dlv.L, true).a(dlv.M, false).a(dlv.N, false).a(dlv.O, false), mk.a().a(ml.c, $$2))
               .a(mf.a().a(dlv.L, false).a(dlv.M, true).a(dlv.N, false).a(dlv.O, false), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.L, false).a(dlv.M, false).a(dlv.N, true).a(dlv.O, false), mk.a().a(ml.c, $$3))
               .a(mf.a().a(dlv.L, false).a(dlv.M, false).a(dlv.N, false).a(dlv.O, true), mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.L, true), mk.a().a(ml.c, $$4))
               .a(mf.a().a(dlv.M, true), mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
               .a(mf.a().a(dlv.N, true), mk.a().a(ml.c, $$5))
               .a(mf.a().a(dlv.O, true), mk.a().a(ml.c, $$5).a(ml.b, ml.a.b))
         );
      this.d(cyq.eW);
   }

   private void E(cyo $$0) {
      this.b.accept(mh.a($$0, mk.a().a(ml.c, mp.a($$0))).a(b()));
   }

   private void V() {
      aiy $$0 = mp.a(cyq.dw);
      aiy $$1 = mp.a(cyq.dw, "_on");
      this.d(cyq.dw);
      this.b
         .accept(
            mh.a(cyq.dw)
               .a(a(dlv.w, $$0, $$1))
               .a(
                  mi.a(dlv.U, dlv.R)
                     .a(dlq.c, ie.c, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.c))
                     .a(dlq.c, ie.f, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.d))
                     .a(dlq.c, ie.d, mk.a().a(ml.a, ml.a.c))
                     .a(dlq.c, ie.e, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.b))
                     .a(dlq.a, ie.c, mk.a())
                     .a(dlq.a, ie.f, mk.a().a(ml.b, ml.a.b))
                     .a(dlq.a, ie.d, mk.a().a(ml.b, ml.a.c))
                     .a(dlq.a, ie.e, mk.a().a(ml.b, ml.a.d))
                     .a(dlq.b, ie.c, mk.a().a(ml.a, ml.a.b))
                     .a(dlq.b, ie.f, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.b))
                     .a(dlq.b, ie.d, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.c))
                     .a(dlq.b, ie.e, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.d))
               )
         );
   }

   private void W() {
      this.d(cyq.fm);
      this.b.accept(b(cyq.fm, mp.a(cyq.fm)));
   }

   private void X() {
      this.d(cyq.tn);
      this.b.accept(c(cyq.tn, mp.a(cyq.tn)));
   }

   private void Y() {
      this.b.accept(mh.a(cyq.ed).a(mi.a(dlv.H).a(ie.a.a, mk.a().a(ml.c, mp.a(cyq.ed, "_ns"))).a(ie.a.c, mk.a().a(ml.c, mp.a(cyq.ed, "_ew")))));
   }

   private void Z() {
      aiy $$0 = mu.a.create(cyq.dV, this.c);
      this.b
         .accept(
            mh.a(
               cyq.dV,
               mk.a().a(ml.c, $$0),
               mk.a().a(ml.c, $$0).a(ml.a, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.a, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.a, ml.a.d),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.a, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.a, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.a, ml.a.d),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.a, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.a, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.a, ml.a.d),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.d),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.a, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.a, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.a, ml.a.d)
            )
         );
   }

   private void aa() {
      aiy $$0 = mp.a(cyq.kO);
      aiy $$1 = mp.a(cyq.kO, "_on");
      this.b.accept(mh.a(cyq.kO).a(a(dlv.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      ms $$0 = new ms().a(mt.e, ms.a(cyq.by, "_bottom")).a(mt.i, ms.a(cyq.by, "_side"));
      aiy $$1 = ms.a(cyq.by, "_top_sticky");
      aiy $$2 = ms.a(cyq.by, "_top");
      ms $$3 = $$0.c(mt.E, $$1);
      ms $$4 = $$0.c(mt.E, $$2);
      aiy $$5 = mp.a(cyq.by, "_base");
      this.a(cyq.by, $$5, $$4);
      this.a(cyq.br, $$5, $$3);
      aiy $$6 = mr.n.a(cyq.by, "_inventory", $$0.c(mt.f, $$2), this.c);
      aiy $$7 = mr.n.a(cyq.br, "_inventory", $$0.c(mt.f, $$1), this.c);
      this.a(cyq.by, $$6);
      this.a(cyq.br, $$7);
   }

   private void a(cyo $$0, aiy $$1, ms $$2) {
      aiy $$3 = mr.bh.a($$0, $$2, this.c);
      this.b.accept(mh.a($$0).a(a(dlv.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      ms $$0 = new ms().a(mt.F, ms.a(cyq.by, "_top")).a(mt.i, ms.a(cyq.by, "_side"));
      ms $$1 = $$0.c(mt.E, ms.a(cyq.by, "_top_sticky"));
      ms $$2 = $$0.c(mt.E, ms.a(cyq.by, "_top"));
      this.b
         .accept(
            mh.a(cyq.bz)
               .a(
                  mi.a(dlv.x, dlv.bg)
                     .a(false, dmh.a, mk.a().a(ml.c, mr.bi.a(cyq.by, "_head", $$2, this.c)))
                     .a(false, dmh.b, mk.a().a(ml.c, mr.bi.a(cyq.by, "_head_sticky", $$1, this.c)))
                     .a(true, dmh.a, mk.a().a(ml.c, mr.bj.a(cyq.by, "_head_short", $$2, this.c)))
                     .a(true, dmh.b, mk.a().a(ml.c, mr.bj.a(cyq.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      cyo $$0 = cyq.tr;
      ms $$1 = ms.a($$0, "_side_inactive", "_top_inactive");
      ms $$2 = ms.a($$0, "_side_active", "_top_active");
      ms $$3 = ms.a($$0, "_side_active", "_top_ejecting_reward");
      aiy $$4 = mr.o.a($$0, $$1, this.c);
      aiy $$5 = mr.o.a($$0, "_active", $$2, this.c);
      aiy $$6 = mr.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(mh.a($$0).a(mi.a(dlv.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> mk.a().a(ml.c, $$4);
            case b, c, d -> mk.a().a(ml.c, $$5);
            case e -> mk.a().a(ml.c, $$6);
         };
      })));
   }

   private void ae() {
      aiy $$0 = mp.a(cyq.qQ, "_inactive");
      aiy $$1 = mp.a(cyq.qQ, "_active");
      this.a(cyq.qQ, $$0);
      this.b.accept(mh.a(cyq.qQ).a(mi.a(dlv.bo).a($$2 -> mk.a().a(ml.c, $$2 != dmm.b && $$2 != dmm.c ? $$0 : $$1))));
   }

   private void af() {
      aiy $$0 = mp.a(cyq.qR, "_inactive");
      aiy $$1 = mp.a(cyq.qR, "_active");
      this.a(cyq.qR, $$0);
      this.b.accept(mh.a(cyq.qR).a(mi.a(dlv.bo).a($$2 -> mk.a().a(ml.c, $$2 != dmm.b && $$2 != dmm.c ? $$0 : $$1))).a(b()));
   }

   private void ag() {
      aiy $$0 = mr.bM.a(cyq.qV, ms.a(false), this.c);
      aiy $$1 = mr.bM.a(cyq.qV, "_can_summon", ms.a(true), this.c);
      this.a(cyq.qV, $$0);
      this.b.accept(mh.a(cyq.qV).a(a(dlv.G, $$1, $$0)));
   }

   private void ah() {
      aiy $$0 = mp.a(cyq.nS, "_stable");
      aiy $$1 = mp.a(cyq.nS, "_unstable");
      this.a(cyq.nS, $$0);
      this.b.accept(mh.a(cyq.nS).a(a(dlv.b, $$1, $$0)));
   }

   private void ai() {
      aiy $$0 = this.a(cyq.sv, "", mr.ao, ms::c);
      aiy $$1 = this.a(cyq.sv, "_lit", mr.ao, ms::c);
      this.b.accept(mh.a(cyq.sv).a(a(dlv.D, $$1, $$0)));
      aiy $$2 = this.a(cyq.sw, "", mr.ao, ms::c);
      aiy $$3 = this.a(cyq.sw, "_lit", mr.ao, ms::c);
      this.b.accept(mh.a(cyq.sw).a(a(dlv.D, $$3, $$2)));
   }

   private void aj() {
      aiy $$0 = mu.a.create(cyq.fB, this.c);
      aiy $$1 = this.a(cyq.fB, "_on", mr.c, ms::b);
      this.b.accept(mh.a(cyq.fB).a(a(dlv.r, $$1, $$0)));
   }

   private void l(cyo $$0, cyo $$1) {
      ms $$2 = ms.y($$0);
      this.b.accept(c($$0, mr.bf.a($$0, $$2, this.c)));
      this.b.accept(mh.a($$1, mk.a().a(ml.c, mr.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ak() {
      ms $$0 = ms.y(cyq.dK);
      ms $$1 = ms.i(ms.a(cyq.dK, "_off"));
      aiy $$2 = mr.bf.a(cyq.dK, $$0, this.c);
      aiy $$3 = mr.bf.a(cyq.dK, "_off", $$1, this.c);
      this.b.accept(mh.a(cyq.dK).a(a(dlv.r, $$2, $$3)));
      aiy $$4 = mr.bg.a(cyq.dL, $$0, this.c);
      aiy $$5 = mr.bg.a(cyq.dL, "_off", $$1, this.c);
      this.b.accept(mh.a(cyq.dL).a(a(dlv.r, $$4, $$5)).a(d()));
      this.d(cyq.dK);
      this.c(cyq.dL);
   }

   private void al() {
      this.a(cpc.lJ);
      this.b.accept(mh.a(cyq.eh).a(mi.a(dlv.aA, dlv.s, dlv.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return mk.a().a(ml.c, ms.a(cyq.eh, $$3.toString()));
      })).a(c()));
   }

   private void am() {
      this.a(cpc.cS);
      this.b
         .accept(
            mh.a(cyq.mV)
               .a(
                  mi.a(dlv.aS, dlv.C)
                     .a(1, false, Arrays.asList(a(mp.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(mp.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(mp.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(mp.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(mp.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(mp.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(mp.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(mp.a("four_sea_pickles"))))
               )
         );
   }

   private void an() {
      ms $$0 = ms.a(cyq.dN);
      aiy $$1 = mr.c.a(cyq.dP, $$0, this.c);
      this.b.accept(mh.a(cyq.dN).a(mi.a(dlv.aF).a($$1x -> mk.a().a(ml.c, $$1x < 8 ? mp.a(cyq.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cyq.dN, mp.a(cyq.dN, "_height2"));
      this.b.accept(c(cyq.dP, $$1));
   }

   private void ao() {
      this.b.accept(mh.a(cyq.oc, mk.a().a(ml.c, mp.a(cyq.oc))).a(b()));
   }

   private void ap() {
      aiy $$0 = mu.a.create(cyq.pa, this.c);
      this.a(cyq.pa, $$0);
      this.b.accept(mh.a(cyq.pa).a(mi.a(dlv.bj).a($$0x -> mk.a().a(ml.c, this.a(cyq.pa, "_" + $$0x.c(), mr.c, ms::b)))));
   }

   private void aq() {
      this.a(cpc.wl);
      this.b.accept(mh.a(cyq.oi).a(mi.a(dlv.as).a($$0 -> mk.a().a(ml.c, this.a(cyq.oi, "_stage" + $$0, mr.ao, ms::c)))));
   }

   private void ar() {
      this.a(cpc.pr);
      this.b
         .accept(
            mh.a(cyq.fI)
               .a(
                  mi.a(dlv.a, dlv.M, dlv.L, dlv.N, dlv.O)
                     .a(false, false, false, false, false, mk.a().a(ml.c, mp.a(cyq.fI, "_ns")))
                     .a(false, true, false, false, false, mk.a().a(ml.c, mp.a(cyq.fI, "_n")).a(ml.b, ml.a.b))
                     .a(false, false, true, false, false, mk.a().a(ml.c, mp.a(cyq.fI, "_n")))
                     .a(false, false, false, true, false, mk.a().a(ml.c, mp.a(cyq.fI, "_n")).a(ml.b, ml.a.c))
                     .a(false, false, false, false, true, mk.a().a(ml.c, mp.a(cyq.fI, "_n")).a(ml.b, ml.a.d))
                     .a(false, true, true, false, false, mk.a().a(ml.c, mp.a(cyq.fI, "_ne")))
                     .a(false, true, false, true, false, mk.a().a(ml.c, mp.a(cyq.fI, "_ne")).a(ml.b, ml.a.b))
                     .a(false, false, false, true, true, mk.a().a(ml.c, mp.a(cyq.fI, "_ne")).a(ml.b, ml.a.c))
                     .a(false, false, true, false, true, mk.a().a(ml.c, mp.a(cyq.fI, "_ne")).a(ml.b, ml.a.d))
                     .a(false, false, true, true, false, mk.a().a(ml.c, mp.a(cyq.fI, "_ns")))
                     .a(false, true, false, false, true, mk.a().a(ml.c, mp.a(cyq.fI, "_ns")).a(ml.b, ml.a.b))
                     .a(false, true, true, true, false, mk.a().a(ml.c, mp.a(cyq.fI, "_nse")))
                     .a(false, true, false, true, true, mk.a().a(ml.c, mp.a(cyq.fI, "_nse")).a(ml.b, ml.a.b))
                     .a(false, false, true, true, true, mk.a().a(ml.c, mp.a(cyq.fI, "_nse")).a(ml.b, ml.a.c))
                     .a(false, true, true, false, true, mk.a().a(ml.c, mp.a(cyq.fI, "_nse")).a(ml.b, ml.a.d))
                     .a(false, true, true, true, true, mk.a().a(ml.c, mp.a(cyq.fI, "_nsew")))
                     .a(true, false, false, false, false, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_ns")))
                     .a(true, false, true, false, false, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_n")))
                     .a(true, false, false, true, false, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_n")).a(ml.b, ml.a.c))
                     .a(true, true, false, false, false, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_n")).a(ml.b, ml.a.b))
                     .a(true, false, false, false, true, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_n")).a(ml.b, ml.a.d))
                     .a(true, true, true, false, false, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_ne")))
                     .a(true, true, false, true, false, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_ne")).a(ml.b, ml.a.b))
                     .a(true, false, false, true, true, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_ne")).a(ml.b, ml.a.c))
                     .a(true, false, true, false, true, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_ne")).a(ml.b, ml.a.d))
                     .a(true, false, true, true, false, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_ns")))
                     .a(true, true, false, false, true, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_ns")).a(ml.b, ml.a.b))
                     .a(true, true, true, true, false, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_nse")))
                     .a(true, true, false, true, true, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_nse")).a(ml.b, ml.a.b))
                     .a(true, false, true, true, true, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_nse")).a(ml.b, ml.a.c))
                     .a(true, true, true, false, true, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_nse")).a(ml.b, ml.a.d))
                     .a(true, true, true, true, true, mk.a().a(ml.c, mp.a(cyq.fI, "_attached_nsew")))
               )
         );
   }

   private void as() {
      this.d(cyq.fH);
      this.b.accept(mh.a(cyq.fH).a(mi.a(dlv.a, dlv.w).a(($$0, $$1) -> mk.a().a(ml.c, ms.a(cyq.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aiy a(int $$0, String $$1, ms $$2) {
      switch ($$0) {
         case 1:
            return mr.bl.a(mp.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return mr.bm.a(mp.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return mr.bn.a(mp.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return mr.bo.a(mp.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private aiy a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", ms.b(ms.G(cyq.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ms.b(ms.a(cyq.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ms.b(ms.a(cyq.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void at() {
      this.a(cpc.ko);
      this.b.accept(mh.a(cyq.mf).a(mi.a(dlv.aD, dlv.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void au() {
      this.a(cpc.kp);
      Function<Integer, aiy> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ms $$2 = ms.a($$1);
         return mr.bw.a(cyq.mg, $$1, $$2, this.c);
      };
      this.b.accept(mh.a(cyq.mg).a(mi.a(dfv.c).a($$1 -> mk.a().a(ml.c, $$0.apply($$1)))));
   }

   private void F(cyo $$0) {
      this.d($$0);
      aiy $$1 = mp.a($$0);
      mg $$2 = mg.a($$0);
      mf.c $$3 = ac.a(mf.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dlw, Function<aiy, mk>> $$4 : a) {
         dlw $$5 = (dlw)$$4.getFirst();
         Function<aiy, mk> $$6 = (Function<aiy, mk>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(mf.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void av() {
      aiy $$0 = ms.a(cyq.qU, "_bottom");
      ms $$1 = new ms().a(mt.e, $$0).a(mt.f, ms.a(cyq.qU, "_top")).a(mt.i, ms.a(cyq.qU, "_side"));
      ms $$2 = new ms().a(mt.e, $$0).a(mt.f, ms.a(cyq.qU, "_top_bloom")).a(mt.i, ms.a(cyq.qU, "_side_bloom"));
      aiy $$3 = mr.n.a(cyq.qU, "", $$1, this.c);
      aiy $$4 = mr.n.a(cyq.qU, "_bloom", $$2, this.c);
      this.b.accept(mh.a(cyq.qU).a(mi.a(dlv.E).a($$2x -> mk.a().a(ml.c, $$2x ? $$4 : $$3))));
      this.a(cpc.gi, $$3);
   }

   private void aw() {
      cyo $$0 = cyq.cm;
      aiy $$1 = mp.a($$0);
      mg $$2 = mg.a($$0);
      Map.of(ie.c, ml.a.a, ie.f, ml.a.b, ie.d, ml.a.c, ie.e, ml.a.d).forEach(($$2x, $$3) -> {
         mf.c $$4 = mf.a().a(dlv.R, $$2x);
         $$2.a($$4, mk.a().a(ml.c, $$1).a(ml.b, $$3).a(ml.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mp.a($$0, "_inventory"));
      i.clear();
   }

   private void a(mg $$0, mf.c $$1, ml.a $$2) {
      List.of(Pair.of(dlv.bp, mr.aM), Pair.of(dlv.bq, mr.aN), Pair.of(dlv.br, mr.aO), Pair.of(dlv.bs, mr.aP), Pair.of(dlv.bt, mr.aQ), Pair.of(dlv.bu, mr.aR))
         .forEach($$3 -> {
            dlw $$4 = (dlw)$$3.getFirst();
            mq $$5 = (mq)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(mg $$0, mf.c $$1, ml.a $$2, dlw $$3, mq $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ms $$7 = new ms().a(mt.b, ms.a(cyq.cm, $$6));
      mb.d $$8 = new mb.d($$4, $$6);
      aiy $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cyq.cm, $$6, $$7, this.c));
      $$0.a(mf.a($$1, mf.a().a($$3, $$5)), mk.a().a(ml.c, $$9).a(ml.b, $$2));
   }

   private void ax() {
      this.b.accept(c(cyq.kJ, mr.c.a(cyq.kJ, ms.b(mp.a("magma")), this.c)));
   }

   private void G(cyo $$0) {
      this.b($$0, mu.q);
      mr.bD.a(mp.a($$0.j()), ms.u($$0), this.c);
   }

   private void b(cyo $$0, cyo $$1, mb.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(cyo $$0, cyo $$1) {
      mr.bE.a(mp.a($$0.j()), ms.u($$1), this.c);
   }

   private void ay() {
      aiy $$0 = mp.a(cyq.b);
      aiy $$1 = mp.a(cyq.b, "_mirrored");
      this.b.accept(a(cyq.eN, $$0, $$1));
      this.a(cyq.eN, $$0);
   }

   private void az() {
      aiy $$0 = mp.a(cyq.sJ);
      aiy $$1 = mp.a(cyq.sJ, "_mirrored");
      this.b.accept(a(cyq.td, $$0, $$1).a(f()));
      this.a(cyq.td, $$0);
   }

   private void n(cyo $$0, cyo $$1) {
      this.a($$0, mb.e.b);
      ms $$2 = ms.d(ms.a($$0, "_pot"));
      aiy $$3 = mb.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aA() {
      aiy $$0 = ms.a(cyq.pl, "_bottom");
      aiy $$1 = ms.a(cyq.pl, "_top_off");
      aiy $$2 = ms.a(cyq.pl, "_top");
      aiy[] $$3 = new aiy[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ms $$5 = new ms().a(mt.e, $$0).a(mt.f, $$4 == 0 ? $$1 : $$2).a(mt.i, ms.a(cyq.pl, "_side" + $$4));
         $$3[$$4] = mr.n.a(cyq.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mh.a(cyq.pl).a(mi.a(dlv.aZ).a($$1x -> mk.a().a(ml.c, $$3[$$1x]))));
      this.a(cpc.wJ, $$3[0]);
   }

   private mk a(ih $$0, mk $$1) {
      switch ($$0) {
         case b:
            return $$1.a(ml.a, ml.a.b);
         case c:
            return $$1.a(ml.a, ml.a.b).a(ml.b, ml.a.c);
         case d:
            return $$1.a(ml.a, ml.a.b).a(ml.b, ml.a.d);
         case a:
            return $$1.a(ml.a, ml.a.b).a(ml.b, ml.a.b);
         case f:
            return $$1.a(ml.a, ml.a.d).a(ml.b, ml.a.c);
         case g:
            return $$1.a(ml.a, ml.a.d);
         case h:
            return $$1.a(ml.a, ml.a.d).a(ml.b, ml.a.b);
         case e:
            return $$1.a(ml.a, ml.a.d).a(ml.b, ml.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(ml.b, ml.a.c);
         case i:
            return $$1.a(ml.b, ml.a.d);
         case j:
            return $$1.a(ml.b, ml.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aB() {
      aiy $$0 = ms.a(cyq.pb, "_top");
      aiy $$1 = ms.a(cyq.pb, "_bottom");
      aiy $$2 = ms.a(cyq.pb, "_side");
      aiy $$3 = ms.a(cyq.pb, "_lock");
      ms $$4 = new ms().a(mt.o, $$2).a(mt.m, $$2).a(mt.l, $$2).a(mt.c, $$0).a(mt.j, $$0).a(mt.k, $$1).a(mt.n, $$3);
      aiy $$5 = mr.b.a(cyq.pb, $$4, this.c);
      this.b.accept(mh.a(cyq.pb, mk.a().a(ml.c, $$5)).a(mi.a(dlv.T).a($$0x -> this.a($$0x, mk.a()))));
   }

   private void aC() {
      cyo $$0 = cyq.n;
      aiy $$1 = mp.a($$0);
      mu $$2 = mu.a.get($$0);
      cyo $$3 = cyq.jH;
      aiy $$4 = mr.ab.a($$3, $$2.b(), this.c);
      aiy $$5 = mr.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ki.a().filter(kj::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cyq.rf).a(ki.w).a(cyq.rf, cyq.rD).a(cyq.rj, cyq.rn).a(ki.y);
      this.h(cyq.re).a(ki.A).a(cyq.re, cyq.rC).a(cyq.ri, cyq.rm).a(ki.C);
      this.h(cyq.rd).a(ki.E).a(cyq.rd, cyq.rB).a(cyq.rh, cyq.rl).a(ki.G);
      this.h(cyq.rc).a(ki.I).a(cyq.rc, cyq.rA).a(cyq.rg, cyq.rk).a(ki.K);
      this.w(cyq.sk);
      this.w(cyq.sl);
      this.w(cyq.sm);
      this.w(cyq.sn);
      this.i(cyq.sk, cyq.so);
      this.i(cyq.sl, cyq.sp);
      this.i(cyq.sm, cyq.sq);
      this.i(cyq.sn, cyq.sr);
      this.m(cyq.a);
      this.c(cyq.nc, cyq.a);
      this.c(cyq.nb, cyq.a);
      this.m(cyq.fO);
      this.m(cyq.dQ);
      this.c(cyq.nd, cyq.G);
      this.m(cyq.fA);
      this.m(cyq.me);
      this.m(cyq.fr);
      this.m(cyq.fR);
      this.a(cpc.ua);
      this.m(cyq.pg);
      this.m(cyq.G);
      this.m(cyq.H);
      this.m(cyq.hV);
      this.a(cpc.fR);
      this.o(cyq.pM, cyq.qd);
      this.o(cyq.pN, cyq.qe);
      this.o(cyq.pO, cyq.qf);
      this.o(cyq.pP, cyq.qg);
      this.o(cyq.pQ, cyq.qh);
      this.o(cyq.pR, cyq.qi);
      this.o(cyq.pS, cyq.qj);
      this.o(cyq.pT, cyq.qk);
      this.o(cyq.pU, cyq.ql);
      this.o(cyq.pV, cyq.qm);
      this.o(cyq.pW, cyq.qn);
      this.o(cyq.pX, cyq.qo);
      this.o(cyq.pY, cyq.qp);
      this.o(cyq.pZ, cyq.qq);
      this.o(cyq.qa, cyq.qr);
      this.o(cyq.qb, cyq.qs);
      this.o(cyq.pL, cyq.qc);
      this.m(cyq.na);
      this.m(cyq.gs);
      this.m(cyq.qP);
      this.m(cyq.sx);
      this.s(cyq.sy);
      this.s(cyq.sz);
      this.t(cyq.ti);
      this.t(cyq.tj);
      this.ai();
      this.g(cyq.sC, cyq.sA);
      this.p(cyq.sB);
      this.a(cyq.hW, cpc.hA);
      this.a(cpc.hA);
      this.aD();
      this.a(cyq.kN, cpc.ja);
      this.a(cpc.ja);
      this.f(cyq.bQ, ms.a(cyq.by, "_side"));
      this.a(cyq.R);
      this.a(cyq.S);
      this.a(cyq.iB);
      this.a(cyq.cx);
      this.a(cyq.cy);
      this.a(cyq.cz);
      this.a(cyq.fE);
      this.a(cyq.fF);
      this.a(cyq.fJ);
      this.a(cyq.N);
      this.a(cyq.T);
      this.a(cyq.O);
      this.a(cyq.ch);
      this.a(cyq.P);
      this.a(cyq.Q);
      this.a(cyq.ci);
      this.b(cyq.pj, mu.d);
      this.a(cyq.pi);
      this.a(cyq.aR);
      this.a(cyq.aS);
      this.a(cyq.aT);
      this.a(cyq.hb);
      this.a(cyq.dI);
      this.a(cyq.dJ);
      this.a(cyq.ha);
      this.a(cyq.pC);
      this.a(cyq.mW);
      this.a(cyq.dR);
      this.a(cyq.k);
      this.a(cyq.pk);
      this.a(cyq.fz);
      this.a(cyq.ec);
      this.a(cyq.L);
      this.a(cyq.ph);
      this.a(cyq.dO);
      this.b(cyq.dT, mu.g);
      this.b(cyq.pq, mu.d);
      this.b(cyq.fa, mu.d);
      this.m(cyq.ac);
      this.m(cyq.ga);
      this.a(cyq.kK);
      this.a(cyq.aY);
      this.a(cyq.iC);
      this.a(cyq.co);
      this.a(cyq.pK);
      this.a(cyq.ii);
      this.a(cyq.oy);
      this.a(cyq.dW);
      this.a(cyq.dX);
      this.b(cyq.ct, mu.b);
      this.a(cyq.aO);
      this.b(cyq.bw, mu.v);
      this.a(cpc.cR);
      this.b(cyq.ck, mu.f);
      this.b(cyq.pd, mu.d);
      this.a(cyq.op);
      this.a(cyq.aP);
      this.a(cyq.qt);
      this.a(cyq.qu);
      this.a(cyq.qN);
      this.a(cyq.su);
      this.a(cyq.tf);
      this.a(cyq.tg);
      this.a(cyq.th);
      this.e(cyq.qS);
      this.aC();
      this.a(cyq.ra);
      this.a(cyq.rb);
      this.a(cyq.qW);
      this.a(cyq.qX);
      this.a(cyq.qY);
      this.a(cyq.qZ);
      this.k(cyq.qW, cyq.rw);
      this.k(cyq.qX, cyq.ry);
      this.k(cyq.qY, cyq.rx);
      this.k(cyq.qZ, cyq.rz);
      this.i(cyq.rM);
      this.i(cyq.rN);
      this.i(cyq.rP);
      this.i(cyq.rO);
      this.a(cyq.rM, cyq.rQ);
      this.a(cyq.rN, cyq.rR);
      this.a(cyq.rP, cyq.rT);
      this.a(cyq.rO, cyq.rS);
      this.k(cyq.rU);
      this.k(cyq.rV);
      this.k(cyq.rX);
      this.k(cyq.rW);
      this.b(cyq.rU, cyq.rY);
      this.b(cyq.rV, cyq.rZ);
      this.b(cyq.rX, cyq.sb);
      this.b(cyq.rW, cyq.sa);
      this.a(cyq.sc);
      this.a(cyq.sd);
      this.a(cyq.se);
      this.a(cyq.sf);
      this.k(cyq.sc, cyq.sg);
      this.k(cyq.sd, cyq.sh);
      this.k(cyq.se, cyq.si);
      this.k(cyq.sf, cyq.sj);
      this.j(cyq.gW, cyq.ch);
      this.j(cyq.gX, cyq.ci);
      this.G();
      this.r();
      this.aw();
      this.v();
      this.w();
      this.a(cyq.og, cyq.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(cyq.kt);
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
      this.ah();
      this.ak();
      this.aj();
      this.al();
      this.am();
      this.y();
      this.an();
      this.ao();
      this.ap();
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.au();
      this.F(cyq.ff);
      this.F(cyq.fg);
      this.F(cyq.qT);
      this.ax();
      this.aB();
      this.ae();
      this.af();
      this.ag();
      this.X();
      this.O();
      this.N();
      this.ad();
      this.E(cyq.cO);
      this.d(cyq.cO);
      this.E(cyq.oa);
      this.g();
      this.E(cyq.sE);
      this.l(cyq.cp, cyq.cq);
      this.l(cyq.ea, cyq.eb);
      this.a(cyq.cA, cyq.n, ms::c);
      this.a(cyq.nY, cyq.p, ms::d);
      this.y(cyq.ow);
      this.y(cyq.on);
      this.v(cyq.aU);
      this.v(cyq.hi);
      this.C();
      this.D(cyq.oe);
      this.D(cyq.of);
      this.e(cyq.eX, mp.a(cyq.eX));
      this.a(cyq.dY, mu.d);
      this.a(cyq.dZ, mu.d);
      this.a(cyq.te);
      this.a(cyq.kM, mu.d);
      this.f(cyq.j);
      this.f(cyq.sH);
      this.f(cyq.I);
      this.g(cyq.J);
      this.g(cyq.M);
      this.f(cyq.K);
      this.e(cyq.F);
      this.b(cyq.to, mu.f);
      this.a(cyq.ij, mu.d, mu.e);
      this.a(cyq.kx, mu.w, mu.x);
      this.a(cyq.hf, mu.w, mu.x);
      this.a(cyq.tk, mu.d, mu.e);
      this.a(cyq.tl, mu.d, mu.e);
      this.a(cyq.tm, mu.d, mu.e);
      this.c(cyq.nT, mu.i);
      this.z();
      this.a(cyq.pe, ms::A);
      this.a(cyq.pf, ms::C);
      this.a(cyq.kD, dlv.as, 0, 1, 2, 3);
      this.a(cyq.gt, dlv.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cyq.fq, dlv.as, 0, 1, 1, 2);
      this.a(cyq.gu, dlv.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cyq.cB, dlv.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cyq.kA, mb.e.b, dlv.aq, 0, 1);
      this.i();
      this.h();
      this.a(mp.a("decorated_pot"), cyq.iA).b(cyq.tp);
      this.a(mp.a("banner"), cyq.n)
         .a(mr.bF, cyq.iJ, cyq.iK, cyq.iL, cyq.iM, cyq.iN, cyq.iO, cyq.iP, cyq.iQ, cyq.iR, cyq.iS, cyq.iT, cyq.iU, cyq.iV, cyq.iW, cyq.iX, cyq.iY)
         .b(cyq.iZ, cyq.ja, cyq.jb, cyq.jc, cyq.jd, cyq.je, cyq.jf, cyq.jg, cyq.jh, cyq.ji, cyq.jj, cyq.jk, cyq.jl, cyq.jm, cyq.jn, cyq.jo);
      this.a(mp.a("bed"), cyq.n)
         .b(cyq.aZ, cyq.ba, cyq.bb, cyq.bc, cyq.bd, cyq.be, cyq.bf, cyq.bg, cyq.bh, cyq.bi, cyq.bj, cyq.bk, cyq.bl, cyq.bm, cyq.bn, cyq.bo);
      this.m(cyq.aZ, cyq.bA);
      this.m(cyq.ba, cyq.bB);
      this.m(cyq.bb, cyq.bC);
      this.m(cyq.bc, cyq.bD);
      this.m(cyq.bd, cyq.bE);
      this.m(cyq.be, cyq.bF);
      this.m(cyq.bf, cyq.bG);
      this.m(cyq.bg, cyq.bH);
      this.m(cyq.bh, cyq.bI);
      this.m(cyq.bi, cyq.bJ);
      this.m(cyq.bj, cyq.bK);
      this.m(cyq.bk, cyq.bL);
      this.m(cyq.bl, cyq.bM);
      this.m(cyq.bm, cyq.bN);
      this.m(cyq.bn, cyq.bO);
      this.m(cyq.bo, cyq.bP);
      this.a(mp.a("skull"), cyq.dW)
         .a(mr.bG, cyq.gM, cyq.gK, cyq.gI, cyq.gE, cyq.gG, cyq.gQ)
         .a(cyq.gO)
         .b(cyq.gN, cyq.gP, cyq.gL, cyq.gJ, cyq.gF, cyq.gH, cyq.gR);
      this.G(cyq.kP);
      this.G(cyq.kQ);
      this.G(cyq.kR);
      this.G(cyq.kS);
      this.G(cyq.kT);
      this.G(cyq.kU);
      this.G(cyq.kV);
      this.G(cyq.kW);
      this.G(cyq.kX);
      this.G(cyq.kY);
      this.G(cyq.kZ);
      this.G(cyq.la);
      this.G(cyq.lb);
      this.G(cyq.lc);
      this.G(cyq.ld);
      this.G(cyq.le);
      this.G(cyq.lf);
      this.b(cyq.mX, mu.q);
      this.c(cyq.mX);
      this.a(mp.a("chest"), cyq.n).b(cyq.cv, cyq.gV);
      this.a(mp.a("ender_chest"), cyq.co).b(cyq.fG);
      this.f(cyq.fx, cyq.co).a(cyq.fx, cyq.kF);
      this.a(cyq.aM);
      this.a(cyq.aN);
      this.a(cyq.lw);
      this.a(cyq.lx);
      this.a(cyq.ly);
      this.a(cyq.lz);
      this.a(cyq.lA);
      this.a(cyq.lB);
      this.a(cyq.lC);
      this.a(cyq.lD);
      this.a(cyq.lE);
      this.a(cyq.lF);
      this.a(cyq.lG);
      this.a(cyq.lH);
      this.a(cyq.lI);
      this.a(cyq.lJ);
      this.a(cyq.lK);
      this.a(cyq.lL);
      this.a(mu.a, cyq.lM, cyq.lN, cyq.lO, cyq.lP, cyq.lQ, cyq.lR, cyq.lS, cyq.lT, cyq.lU, cyq.lV, cyq.lW, cyq.lX, cyq.lY, cyq.lZ, cyq.ma, cyq.mb);
      this.a(cyq.iA);
      this.a(cyq.hj);
      this.a(cyq.hk);
      this.a(cyq.hl);
      this.a(cyq.hm);
      this.a(cyq.hn);
      this.a(cyq.ho);
      this.a(cyq.hp);
      this.a(cyq.hq);
      this.a(cyq.hr);
      this.a(cyq.hs);
      this.a(cyq.ht);
      this.a(cyq.hu);
      this.a(cyq.hv);
      this.a(cyq.hw);
      this.a(cyq.hx);
      this.a(cyq.hy);
      this.a(cyq.qO);
      this.h(cyq.aQ, cyq.eY);
      this.h(cyq.ei, cyq.hz);
      this.h(cyq.ej, cyq.hA);
      this.h(cyq.ek, cyq.hB);
      this.h(cyq.el, cyq.hC);
      this.h(cyq.em, cyq.hD);
      this.h(cyq.en, cyq.hE);
      this.h(cyq.eo, cyq.hF);
      this.h(cyq.ep, cyq.hG);
      this.h(cyq.eq, cyq.hH);
      this.h(cyq.er, cyq.hI);
      this.h(cyq.es, cyq.hJ);
      this.h(cyq.et, cyq.hK);
      this.h(cyq.eu, cyq.hL);
      this.h(cyq.ev, cyq.hM);
      this.h(cyq.ew, cyq.hN);
      this.h(cyq.ex, cyq.hO);
      this.b(mu.o, cyq.lg, cyq.lh, cyq.li, cyq.lj, cyq.lk, cyq.ll, cyq.lm, cyq.ln, cyq.lo, cyq.lp, cyq.lq, cyq.lr, cyq.ls, cyq.lt, cyq.lu, cyq.lv);
      this.g(cyq.bA, cyq.ik);
      this.g(cyq.bB, cyq.il);
      this.g(cyq.bC, cyq.im);
      this.g(cyq.bD, cyq.in);
      this.g(cyq.bE, cyq.io);
      this.g(cyq.bF, cyq.ip);
      this.g(cyq.bG, cyq.iq);
      this.g(cyq.bH, cyq.ir);
      this.g(cyq.bI, cyq.is);
      this.g(cyq.bJ, cyq.it);
      this.g(cyq.bK, cyq.iu);
      this.g(cyq.bL, cyq.iv);
      this.g(cyq.bM, cyq.iw);
      this.g(cyq.bN, cyq.ix);
      this.g(cyq.bO, cyq.iy);
      this.g(cyq.bP, cyq.iz);
      this.a(cyq.sI);
      this.a(cyq.eL);
      this.a(cyq.bu, cyq.gb, mb.e.a);
      this.a(cyq.bR, cyq.gc, mb.e.b);
      this.a(cyq.bT, cyq.gd, mb.e.b);
      this.a(cyq.bU, cyq.ge, mb.e.b);
      this.a(cyq.bV, cyq.gf, mb.e.b);
      this.a(cyq.bW, cyq.gg, mb.e.b);
      this.a(cyq.bX, cyq.gh, mb.e.b);
      this.a(cyq.bY, cyq.gi, mb.e.b);
      this.a(cyq.bZ, cyq.gj, mb.e.b);
      this.a(cyq.ca, cyq.gk, mb.e.b);
      this.a(cyq.cb, cyq.gl, mb.e.b);
      this.a(cyq.cc, cyq.gm, mb.e.b);
      this.a(cyq.ce, cyq.gn, mb.e.b);
      this.a(cyq.cd, cyq.go, mb.e.b);
      this.a(cyq.cg, cyq.gp, mb.e.b);
      this.a(cyq.cf, cyq.gq, mb.e.b);
      this.a(cyq.bv, cyq.gr, mb.e.b);
      this.a(cyq.bS, cyq.fS, mb.e.b);
      this.H();
      this.u(cyq.eT);
      this.u(cyq.eU);
      this.u(cyq.eV);
      this.a(cyq.bt, mb.e.a);
      this.b(cyq.dS, mb.e.a);
      this.a(cpc.dI);
      this.b(cyq.mc, cyq.md, mb.e.b);
      this.a(cpc.dJ);
      this.c(cyq.md);
      this.b(cyq.sG, mb.e.b);
      this.c(cyq.sG);
      this.c(cyq.sw);
      this.b(cyq.oz, cyq.oA, mb.e.b);
      this.b(cyq.oB, cyq.oC, mb.e.b);
      this.a(cyq.oz, "_plant");
      this.c(cyq.oA);
      this.a(cyq.oB, "_plant");
      this.c(cyq.oC);
      this.a(cyq.mY, mb.e.a, ms.c(ms.a(cyq.mZ, "_stage0")));
      this.m();
      this.a(cyq.bs, mb.e.b);
      this.c(cyq.iE, mb.e.b);
      this.c(cyq.iF, mb.e.b);
      this.c(cyq.iG, mb.e.b);
      this.c(cyq.iH, mb.e.a);
      this.c(cyq.iI, mb.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cyq.mw, cyq.mr, cyq.mm, cyq.mh, cyq.mG, cyq.mB, cyq.mQ, cyq.mL);
      this.a(cyq.mx, cyq.ms, cyq.mn, cyq.mi, cyq.mH, cyq.mC, cyq.mR, cyq.mM);
      this.a(cyq.my, cyq.mt, cyq.mo, cyq.mj, cyq.mI, cyq.mD, cyq.mS, cyq.mN);
      this.a(cyq.mz, cyq.mu, cyq.mp, cyq.mk, cyq.mJ, cyq.mE, cyq.mT, cyq.mO);
      this.a(cyq.mA, cyq.mv, cyq.mq, cyq.ml, cyq.mK, cyq.mF, cyq.mU, cyq.mP);
      this.e(cyq.fe, cyq.fc);
      this.e(cyq.fd, cyq.fb);
      this.l(cyq.ab).c(cyq.ab).a(cyq.av);
      this.l(cyq.am).c(cyq.am).a(cyq.aD);
      this.a(cyq.am, cyq.dj, cyq.ds);
      this.b(cyq.aL, mu.s);
      this.l(cyq.Y).c(cyq.Y).a(cyq.as);
      this.l(cyq.ai).c(cyq.ai).a(cyq.aA);
      this.a(cyq.ai, cyq.dd, cyq.do);
      this.a(cyq.B, cyq.fX, mb.e.b);
      this.b(cyq.aI, mu.s);
      this.l(cyq.Z).d(cyq.Z).a(cyq.at);
      this.l(cyq.aj).d(cyq.aj).a(cyq.aB);
      this.a(cyq.aj, cyq.de, cyq.dp);
      this.a(cyq.C, cyq.fY, mb.e.b);
      this.b(cyq.aJ, mu.s);
      this.l(cyq.W).c(cyq.W).a(cyq.aq);
      this.l(cyq.ag).c(cyq.ag).a(cyq.ay);
      this.a(cyq.ag, cyq.dc, cyq.dn);
      this.a(cyq.z, cyq.fV, mb.e.b);
      this.b(cyq.aG, mu.s);
      this.l(cyq.U).c(cyq.U).a(cyq.ao);
      this.l(cyq.al).c(cyq.al).a(cyq.aw);
      this.a(cyq.al, cyq.da, cyq.dl);
      this.a(cyq.x, cyq.fT, mb.e.b);
      this.b(cyq.aE, mu.s);
      this.l(cyq.V).c(cyq.V).a(cyq.ap);
      this.l(cyq.af).c(cyq.af).a(cyq.ax);
      this.a(cyq.af, cyq.db, cyq.dm);
      this.a(cyq.y, cyq.fU, mb.e.b);
      this.b(cyq.aF, mu.s);
      this.l(cyq.aa).c(cyq.aa).a(cyq.au);
      this.l(cyq.ak).c(cyq.ak).a(cyq.aC);
      this.a(cyq.ak, cyq.dg, cyq.dr);
      this.a(cyq.D, cyq.fZ, mb.e.b);
      this.b(cyq.aK, mu.s);
      this.l(cyq.X).c(cyq.X).a(cyq.ar);
      this.l(cyq.ah).c(cyq.ah).a(cyq.az);
      this.a(cyq.ah, cyq.df, cyq.dq);
      this.a(cyq.A, cyq.fW, mb.e.b);
      this.b(cyq.aH, mu.s);
      this.l(cyq.os).b(cyq.os).a(cyq.ou);
      this.l(cyq.ot).b(cyq.ot).a(cyq.ov);
      this.a(cyq.ot, cyq.dh, cyq.dt);
      this.a(cyq.ox, cyq.pm, mb.e.b);
      this.n(cyq.oD, cyq.po);
      this.l(cyq.oj).b(cyq.oj).a(cyq.ol);
      this.l(cyq.ok).b(cyq.ok).a(cyq.om);
      this.a(cyq.ok, cyq.di, cyq.du);
      this.a(cyq.oo, cyq.pn, mb.e.b);
      this.n(cyq.oq, cyq.pp);
      this.l(cyq.ae).d(cyq.ae);
      this.l(cyq.an).d(cyq.an);
      this.a(cyq.v, cyq.dk, cyq.dv);
      this.b(cyq.or, mb.e.b);
      this.a(cpc.dF);
      this.i(cyq.dy);
      this.k(cyq.hY);
      this.u();
      this.n(cyq.cP);
      this.o(cyq.bp);
      this.o(cyq.bq);
      this.o(cyq.hh);
      this.t();
      this.q(cyq.fN);
      this.q(cyq.kG);
      this.q(cyq.kH);
      this.r(cyq.gS);
      this.r(cyq.gT);
      this.r(cyq.gU);
      this.o();
      this.p();
      this.d(cyq.cD, mu.h);
      this.d(cyq.nW, mu.h);
      this.d(cyq.nV, mu.i);
      this.s();
      this.aA();
      this.av();
      this.k(cyq.eK, cyq.eS);
      this.k(cyq.m, cyq.eO);
      this.k(cyq.eJ, cyq.eR);
      this.k(cyq.eI, cyq.eQ);
      this.ay();
      this.k(cyq.eH, cyq.eP);
      this.az();
      cqe.h().forEach($$0 -> this.a($$0, mp.b("template_spawn_egg")));
   }

   private void aD() {
      this.c(cyq.hX);
      mi.a<Integer> $$0 = mi.a(dlv.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aiy $$3 = ms.a(cpc.hB, $$2);
         $$0.a($$1, mk.a().a(ml.c, mr.aa.a(cyq.hX, $$2, ms.h($$3), this.c)));
         mr.bx.a(mp.a(cpc.hB, $$2), ms.k($$3), this.c);
      }

      this.b.accept(mh.a(cyq.hX).a($$0));
   }

   private void o(cyo $$0, cyo $$1) {
      this.a($$0.j());
      ms $$2 = ms.b(ms.G($$0));
      ms $$3 = ms.b(ms.a($$0, "_lit"));
      aiy $$4 = mr.bH.a($$0, "_one_candle", $$2, this.c);
      aiy $$5 = mr.bI.a($$0, "_two_candles", $$2, this.c);
      aiy $$6 = mr.bJ.a($$0, "_three_candles", $$2, this.c);
      aiy $$7 = mr.bK.a($$0, "_four_candles", $$2, this.c);
      aiy $$8 = mr.bH.a($$0, "_one_candle_lit", $$3, this.c);
      aiy $$9 = mr.bI.a($$0, "_two_candles_lit", $$3, this.c);
      aiy $$10 = mr.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      aiy $$11 = mr.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            mh.a($$0)
               .a(
                  mi.a(dlv.az, dlv.r)
                     .a(1, false, mk.a().a(ml.c, $$4))
                     .a(2, false, mk.a().a(ml.c, $$5))
                     .a(3, false, mk.a().a(ml.c, $$6))
                     .a(4, false, mk.a().a(ml.c, $$7))
                     .a(1, true, mk.a().a(ml.c, $$8))
                     .a(2, true, mk.a().a(ml.c, $$9))
                     .a(3, true, mk.a().a(ml.c, $$10))
                     .a(4, true, mk.a().a(ml.c, $$11))
               )
         );
      aiy $$12 = mr.bL.a($$1, ms.a($$0, false), this.c);
      aiy $$13 = mr.bL.a($$1, "_lit", ms.a($$0, true), this.c);
      this.b.accept(mh.a($$1).a(a(dlv.r, $$13, $$12)));
   }

   class a {
      private final aiy b;

      public a(aiy $$0, cyo $$1) {
         this.b = mr.aa.a($$0, ms.u($$1), mb.this.c);
      }

      public mb.a a(cyo... $$0) {
         for (cyo $$1 : $$0) {
            mb.this.b.accept(mb.c($$1, this.b));
         }

         return this;
      }

      public mb.a b(cyo... $$0) {
         for (cyo $$1 : $$0) {
            mb.this.c($$1);
         }

         return this.a($$0);
      }

      public mb.a a(mq $$0, cyo... $$1) {
         for (cyo $$2 : $$1) {
            $$0.a(mp.a($$2.j()), ms.u($$2), mb.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final ms b;
      private final Map<mq, aiy> c = Maps.newHashMap();
      @Nullable
      private kj d;
      @Nullable
      private aiy e;
      private final Set<cyo> f = new HashSet<>();

      public b(ms $$0) {
         this.b = $$0;
      }

      public mb.b a(cyo $$0, mq $$1) {
         this.e = $$1.a($$0, this.b, mb.this.c);
         if (mb.this.f.containsKey($$0)) {
            mb.this.b.accept(mb.this.f.get($$0).create($$0, this.e, this.b, mb.this.c));
         } else {
            mb.this.b.accept(mb.c($$0, this.e));
         }

         return this;
      }

      public mb.b a(cyo $$0, cyo $$1) {
         aiy $$2 = mp.a($$0);
         mb.this.b.accept(mb.c($$1, $$2));
         mb.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public mb.b a(cyo $$0) {
         aiy $$1 = mr.s.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.t.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.b($$0, $$1, $$2));
         aiy $$3 = mr.u.a($$0, this.b, mb.this.c);
         mb.this.a($$0, $$3);
         return this;
      }

      public mb.b b(cyo $$0) {
         aiy $$1 = mr.M.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.N.a($$0, this.b, mb.this.c);
         aiy $$3 = mr.O.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.a($$0, $$1, $$2, $$3));
         aiy $$4 = mr.P.a($$0, this.b, mb.this.c);
         mb.this.a($$0, $$4);
         return this;
      }

      public mb.b c(cyo $$0) {
         ms $$1 = ms.p($$0);
         aiy $$2 = mr.D.a($$0, $$1, mb.this.c);
         aiy $$3 = mr.E.a($$0, $$1, mb.this.c);
         aiy $$4 = mr.F.a($$0, $$1, mb.this.c);
         aiy $$5 = mr.G.a($$0, $$1, mb.this.c);
         aiy $$6 = mr.H.a($$0, $$1, mb.this.c);
         mb.this.b.accept(mb.a($$0, $$2, $$3, $$4, $$5, $$6));
         aiy $$7 = mr.I.a($$0, $$1, mb.this.c);
         mb.this.a($$0, $$7);
         return this;
      }

      public mb.b d(cyo $$0) {
         aiy $$1 = mr.J.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.K.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.c($$0, $$1, $$2));
         aiy $$3 = mr.L.a($$0, this.b, mb.this.c);
         mb.this.a($$0, $$3);
         return this;
      }

      public mb.b e(cyo $$0) {
         ms $$1 = ms.p($$0);
         aiy $$2 = mr.R.a($$0, $$1, mb.this.c);
         aiy $$3 = mr.Q.a($$0, $$1, mb.this.c);
         aiy $$4 = mr.T.a($$0, $$1, mb.this.c);
         aiy $$5 = mr.S.a($$0, $$1, mb.this.c);
         mb.this.b.accept(mb.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public mb.b f(cyo $$0) {
         aiy $$1 = mr.V.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.U.a($$0, this.b, mb.this.c);
         aiy $$3 = mr.X.a($$0, this.b, mb.this.c);
         aiy $$4 = mr.W.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public mb.b g(cyo $$0) {
         aiy $$1 = mr.Y.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.Z.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.e($$0, $$1, $$2));
         return this;
      }

      public mb.b h(cyo $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cyo $$1 = this.d.b().get(kj.b.r);
            aiy $$2 = mr.aa.a($$0, this.b, mb.this.c);
            mb.this.b.accept(mb.c($$0, $$2));
            mb.this.b.accept(mb.c($$1, $$2));
            mb.this.a($$0.j());
            mb.this.c($$1);
            return this;
         }
      }

      public mb.b i(cyo $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aiy $$1 = this.a(mr.ab, $$0);
            aiy $$2 = this.a(mr.ac, $$0);
            mb.this.b.accept(mb.e($$0, $$1, $$2, this.e));
            mb.this.a($$0, $$1);
            return this;
         }
      }

      public mb.b j(cyo $$0) {
         aiy $$1 = this.a(mr.af, $$0);
         aiy $$2 = this.a(mr.ae, $$0);
         aiy $$3 = this.a(mr.ag, $$0);
         mb.this.b.accept(mb.b($$0, $$1, $$2, $$3));
         mb.this.a($$0, $$2);
         return this;
      }

      private mb.b k(cyo $$0) {
         mu $$1 = mb.this.g.getOrDefault($$0, mu.a.get($$0));
         aiy $$2 = $$1.a($$0, mb.this.c);
         mb.this.b.accept(mb.c($$0, $$2));
         return this;
      }

      private mb.b l(cyo $$0) {
         mb.this.i($$0);
         return this;
      }

      private void m(cyo $$0) {
         if (mb.this.e.contains($$0)) {
            mb.this.k($$0);
         } else {
            mb.this.j($$0);
         }
      }

      private aiy a(mq $$0, cyo $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, mb.this.c));
      }

      public mb.b a(kj $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<mb.b, cyo> $$2 = mb.h.get($$0x);
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
      me create(cyo var1, aiy var2, ms var3, BiConsumer<aiy, Supplier<JsonElement>> var4);
   }

   static record d(mq a, String b) {
   }

   static enum e {
      a,
      b;

      public mq a() {
         return this == a ? mr.ap : mr.ao;
      }

      public mq b() {
         return this == a ? mr.ar : mr.aq;
      }
   }

   class f {
      private final ms b;

      public f(ms $$0) {
         this.b = $$0;
      }

      public mb.f a(cyo $$0) {
         ms $$1 = this.b.c(mt.d, this.b.a(mt.i));
         aiy $$2 = mr.j.a($$0, $$1, mb.this.c);
         mb.this.b.accept(mb.d($$0, $$2));
         return this;
      }

      public mb.f b(cyo $$0) {
         aiy $$1 = mr.j.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.d($$0, $$1));
         return this;
      }

      public mb.f c(cyo $$0) {
         aiy $$1 = mr.j.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.k.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.d($$0, $$1, $$2));
         return this;
      }

      public mb.f d(cyo $$0) {
         mb.this.b.accept(mb.a($$0, this.b, mb.this.c));
         return this;
      }
   }
}
