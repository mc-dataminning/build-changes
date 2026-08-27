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

public class ku {
   final Consumer<kx> b;
   final BiConsumer<aex, Supplier<JsonElement>> c;
   private final Consumer<cja> d;
   final List<csv> e = ImmutableList.of(csw.ez, csw.eF, csw.hY);
   final Map<csv, ku.c> f = ImmutableMap.builder().put(csw.b, ku::a).put(csw.rI, ku::c).put(csw.eN, ku::b).build();
   final Map<csv, ln> g = ImmutableMap.builder()
      .put(csw.aV, ln.x.get(csw.aV))
      .put(csw.jp, ln.x.get(csw.jp))
      .put(csw.jS, ln.a(ll.a(csw.aV, "_top")))
      .put(csw.jU, ln.a(ll.a(csw.jp, "_top")))
      .put(csw.aX, ln.c.get(csw.aV).a($$0x -> $$0x.a(lm.i, ll.G(csw.aX))))
      .put(csw.jr, ln.c.get(csw.jp).a($$0x -> $$0x.a(lm.i, ll.G(csw.jr))))
      .put(csw.hd, ln.c.get(csw.hd))
      .put(csw.jT, ln.a(ll.a(csw.hd, "_bottom")))
      .put(csw.pr, ln.y.get(csw.pr))
      .put(csw.rI, ln.y.get(csw.rI))
      .put(csw.he, ln.c.get(csw.he).a($$0x -> $$0x.a(lm.i, ll.G(csw.he))))
      .put(csw.aW, ln.c.get(csw.aW).a($$0x -> {
         $$0x.a(lm.d, ll.a(csw.aV, "_top"));
         $$0x.a(lm.i, ll.G(csw.aW));
      }))
      .put(csw.jq, ln.c.get(csw.jq).a($$0x -> {
         $$0x.a(lm.d, ll.a(csw.jp, "_top"));
         $$0x.a(lm.i, ll.G(csw.jq));
      }))
      .build();
   static final Map<jh.b, BiConsumer<ku.b, csv>> h = ImmutableMap.builder()
      .put(jh.b.a, ku.b::a)
      .put(jh.b.e, ku.b::l)
      .put(jh.b.b, ku.b::k)
      .put(jh.b.c, ku.b::k)
      .put(jh.b.f, ku.b::c)
      .put(jh.b.g, ku.b::d)
      .put(jh.b.h, ku.b::e)
      .put(jh.b.i, ku.b::f)
      .put(jh.b.k, ku.b::h)
      .put(jh.b.l, ku.b::i)
      .put(jh.b.m, ku.b::j)
      .put(jh.b.n, ku.b::g)
      .put(jh.b.p, ku.b::m)
      .put(jh.b.q, ku.b::b)
      .build();
   public static final List<Pair<dga, Function<aex, ld>>> a = List.of(
      Pair.of(dfz.L, (Function<aex, ld>)$$0 -> ld.a().a(le.c, $$0)),
      Pair.of(dfz.M, (Function<aex, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.b, le.a.b).a(le.d, true)),
      Pair.of(dfz.N, (Function<aex, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.b, le.a.c).a(le.d, true)),
      Pair.of(dfz.O, (Function<aex, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.b, le.a.d).a(le.d, true)),
      Pair.of(dfz.J, (Function<aex, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.a, le.a.d).a(le.d, true)),
      Pair.of(dfz.K, (Function<aex, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.a, le.a.b).a(le.d, true))
   );
   private static final Map<ku.d, aex> i = new HashMap<>();

   private static kx a(csv $$0, aex $$1, ll $$2, BiConsumer<aex, Supplier<JsonElement>> $$3) {
      aex $$4 = lk.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static kx b(csv $$0, aex $$1, ll $$2, BiConsumer<aex, Supplier<JsonElement>> $$3) {
      aex $$4 = lk.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static kx c(csv $$0, aex $$1, ll $$2, BiConsumer<aex, Supplier<JsonElement>> $$3) {
      aex $$4 = lk.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ku(Consumer<kx> $$0, BiConsumer<aex, Supplier<JsonElement>> $$1, Consumer<cja> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(csv $$0) {
      this.d.accept($$0.k());
   }

   void a(csv $$0, aex $$1) {
      this.c.accept(li.a($$0.k()), new lh($$1));
   }

   private void a(cja $$0, aex $$1) {
      this.c.accept(li.a($$0), new lh($$1));
   }

   void a(cja $$0) {
      lk.bv.a(li.a($$0), ll.b($$0), this.c);
   }

   private void d(csv $$0) {
      cja $$1 = $$0.k();
      if ($$1 != cji.a) {
         lk.bv.a(li.a($$1), ll.F($$0), this.c);
      }
   }

   private void a(csv $$0, String $$1) {
      cja $$2 = $$0.k();
      lk.bv.a(li.a($$2), ll.k(ll.a($$0, $$1)), this.c);
   }

   private static lb b() {
      return lb.a(dfz.R).a(hc.f, ld.a().a(le.b, le.a.b)).a(hc.d, ld.a().a(le.b, le.a.c)).a(hc.e, ld.a().a(le.b, le.a.d)).a(hc.c, ld.a());
   }

   private static lb c() {
      return lb.a(dfz.R).a(hc.d, ld.a()).a(hc.e, ld.a().a(le.b, le.a.b)).a(hc.c, ld.a().a(le.b, le.a.c)).a(hc.f, ld.a().a(le.b, le.a.d));
   }

   private static lb d() {
      return lb.a(dfz.R).a(hc.f, ld.a()).a(hc.d, ld.a().a(le.b, le.a.b)).a(hc.e, ld.a().a(le.b, le.a.c)).a(hc.c, ld.a().a(le.b, le.a.d));
   }

   private static lb e() {
      return lb.a(dfz.P)
         .a(hc.a, ld.a().a(le.a, le.a.b))
         .a(hc.b, ld.a().a(le.a, le.a.d))
         .a(hc.c, ld.a())
         .a(hc.d, ld.a().a(le.b, le.a.c))
         .a(hc.e, ld.a().a(le.b, le.a.d))
         .a(hc.f, ld.a().a(le.b, le.a.b));
   }

   private static la b(csv $$0, aex $$1) {
      return la.a($$0, a($$1));
   }

   private static ld[] a(aex $$0) {
      return new ld[]{ld.a().a(le.c, $$0), ld.a().a(le.c, $$0).a(le.b, le.a.b), ld.a().a(le.c, $$0).a(le.b, le.a.c), ld.a().a(le.c, $$0).a(le.b, le.a.d)};
   }

   private static la a(csv $$0, aex $$1, aex $$2) {
      return la.a($$0, ld.a().a(le.c, $$1), ld.a().a(le.c, $$2), ld.a().a(le.c, $$1).a(le.b, le.a.c), ld.a().a(le.c, $$2).a(le.b, le.a.c));
   }

   private static lb a(dga $$0, aex $$1, aex $$2) {
      return lb.a($$0).a(true, ld.a().a(le.c, $$1)).a(false, ld.a().a(le.c, $$2));
   }

   private void e(csv $$0) {
      aex $$1 = ln.a.create($$0, this.c);
      aex $$2 = ln.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(csv $$0) {
      aex $$1 = ln.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(csv $$0) {
      this.b.accept(la.a($$0).a(lb.a(dfz.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aex $$3 = ll.a($$0, $$2);
         return ld.a().a(le.c, lk.c.a($$0, $$2, new ll().a(lm.a, $$3), this.c));
      })));
      this.a($$0, ll.a($$0, "_0"));
   }

   static kx b(csv $$0, aex $$1, aex $$2) {
      return la.a($$0)
         .a(lb.a(dfz.w).a(false, ld.a().a(le.c, $$1)).a(true, ld.a().a(le.c, $$2)))
         .a(
            lb.a(dfz.U, dfz.R)
               .a(dfu.a, hc.f, ld.a().a(le.b, le.a.b))
               .a(dfu.a, hc.e, ld.a().a(le.b, le.a.d))
               .a(dfu.a, hc.d, ld.a().a(le.b, le.a.c))
               .a(dfu.a, hc.c, ld.a())
               .a(dfu.b, hc.f, ld.a().a(le.b, le.a.b).a(le.a, le.a.b).a(le.d, true))
               .a(dfu.b, hc.e, ld.a().a(le.b, le.a.d).a(le.a, le.a.b).a(le.d, true))
               .a(dfu.b, hc.d, ld.a().a(le.b, le.a.c).a(le.a, le.a.b).a(le.d, true))
               .a(dfu.b, hc.c, ld.a().a(le.a, le.a.b).a(le.d, true))
               .a(dfu.c, hc.f, ld.a().a(le.b, le.a.d).a(le.a, le.a.c))
               .a(dfu.c, hc.e, ld.a().a(le.b, le.a.b).a(le.a, le.a.c))
               .a(dfu.c, hc.d, ld.a().a(le.a, le.a.c))
               .a(dfu.c, hc.c, ld.a().a(le.b, le.a.c).a(le.a, le.a.c))
         );
   }

   private static lb.d<hc, dgf, dge, Boolean> a(lb.d<hc, dgf, dge, Boolean> $$0, dgf $$1, aex $$2, aex $$3, aex $$4, aex $$5) {
      return $$0.a(hc.f, $$1, dge.a, false, ld.a().a(le.c, $$2))
         .a(hc.d, $$1, dge.a, false, ld.a().a(le.c, $$2).a(le.b, le.a.b))
         .a(hc.e, $$1, dge.a, false, ld.a().a(le.c, $$2).a(le.b, le.a.c))
         .a(hc.c, $$1, dge.a, false, ld.a().a(le.c, $$2).a(le.b, le.a.d))
         .a(hc.f, $$1, dge.b, false, ld.a().a(le.c, $$4))
         .a(hc.d, $$1, dge.b, false, ld.a().a(le.c, $$4).a(le.b, le.a.b))
         .a(hc.e, $$1, dge.b, false, ld.a().a(le.c, $$4).a(le.b, le.a.c))
         .a(hc.c, $$1, dge.b, false, ld.a().a(le.c, $$4).a(le.b, le.a.d))
         .a(hc.f, $$1, dge.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.b))
         .a(hc.d, $$1, dge.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.c))
         .a(hc.e, $$1, dge.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.d))
         .a(hc.c, $$1, dge.a, true, ld.a().a(le.c, $$3))
         .a(hc.f, $$1, dge.b, true, ld.a().a(le.c, $$5).a(le.b, le.a.d))
         .a(hc.d, $$1, dge.b, true, ld.a().a(le.c, $$5))
         .a(hc.e, $$1, dge.b, true, ld.a().a(le.c, $$5).a(le.b, le.a.b))
         .a(hc.c, $$1, dge.b, true, ld.a().a(le.c, $$5).a(le.b, le.a.c));
   }

   private static kx a(csv $$0, aex $$1, aex $$2, aex $$3, aex $$4, aex $$5, aex $$6, aex $$7, aex $$8) {
      return la.a($$0).a(a(a(lb.a(dfz.R, dfz.ae, dfz.be, dfz.u), dgf.b, $$1, $$2, $$3, $$4), dgf.a, $$5, $$6, $$7, $$8));
   }

   static kx a(csv $$0, aex $$1, aex $$2, aex $$3, aex $$4, aex $$5) {
      return kz.a($$0)
         .a(ld.a().a(le.c, $$1))
         .a(ky.a().a(dfz.L, true), ld.a().a(le.c, $$2).a(le.d, false))
         .a(ky.a().a(dfz.M, true), ld.a().a(le.c, $$3).a(le.d, false))
         .a(ky.a().a(dfz.N, true), ld.a().a(le.c, $$4).a(le.d, false))
         .a(ky.a().a(dfz.O, true), ld.a().a(le.c, $$5).a(le.d, false));
   }

   static kx c(csv $$0, aex $$1, aex $$2) {
      return kz.a($$0)
         .a(ld.a().a(le.c, $$1))
         .a(ky.a().a(dfz.L, true), ld.a().a(le.c, $$2).a(le.d, true))
         .a(ky.a().a(dfz.M, true), ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, true))
         .a(ky.a().a(dfz.N, true), ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, true))
         .a(ky.a().a(dfz.O, true), ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, true));
   }

   static kx a(csv $$0, aex $$1, aex $$2, aex $$3) {
      return kz.a($$0)
         .a(ky.a().a(dfz.J, true), ld.a().a(le.c, $$1))
         .a(ky.a().a(dfz.X, dgv.b), ld.a().a(le.c, $$2).a(le.d, true))
         .a(ky.a().a(dfz.W, dgv.b), ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, true))
         .a(ky.a().a(dfz.Y, dgv.b), ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, true))
         .a(ky.a().a(dfz.Z, dgv.b), ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, true))
         .a(ky.a().a(dfz.X, dgv.c), ld.a().a(le.c, $$3).a(le.d, true))
         .a(ky.a().a(dfz.W, dgv.c), ld.a().a(le.c, $$3).a(le.b, le.a.b).a(le.d, true))
         .a(ky.a().a(dfz.Y, dgv.c), ld.a().a(le.c, $$3).a(le.b, le.a.c).a(le.d, true))
         .a(ky.a().a(dfz.Z, dgv.c), ld.a().a(le.c, $$3).a(le.b, le.a.d).a(le.d, true));
   }

   static kx a(csv $$0, aex $$1, aex $$2, aex $$3, aex $$4, boolean $$5) {
      return la.a($$0, ld.a().a(le.d, $$5))
         .a(c())
         .a(
            lb.a(dfz.q, dfz.u)
               .a(false, false, ld.a().a(le.c, $$2))
               .a(true, false, ld.a().a(le.c, $$4))
               .a(false, true, ld.a().a(le.c, $$1))
               .a(true, true, ld.a().a(le.c, $$3))
         );
   }

   static kx b(csv $$0, aex $$1, aex $$2, aex $$3) {
      return la.a($$0)
         .a(
            lb.a(dfz.R, dfz.af, dfz.bi)
               .a(hc.f, dgi.b, dgs.a, ld.a().a(le.c, $$2))
               .a(hc.e, dgi.b, dgs.a, ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgi.b, dgs.a, ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgi.b, dgs.a, ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgi.b, dgs.e, ld.a().a(le.c, $$3))
               .a(hc.e, dgi.b, dgs.e, ld.a().a(le.c, $$3).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgi.b, dgs.e, ld.a().a(le.c, $$3).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgi.b, dgs.e, ld.a().a(le.c, $$3).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgi.b, dgs.d, ld.a().a(le.c, $$3).a(le.b, le.a.d).a(le.d, true))
               .a(hc.e, dgi.b, dgs.d, ld.a().a(le.c, $$3).a(le.b, le.a.b).a(le.d, true))
               .a(hc.d, dgi.b, dgs.d, ld.a().a(le.c, $$3))
               .a(hc.c, dgi.b, dgs.d, ld.a().a(le.c, $$3).a(le.b, le.a.c).a(le.d, true))
               .a(hc.f, dgi.b, dgs.c, ld.a().a(le.c, $$1))
               .a(hc.e, dgi.b, dgs.c, ld.a().a(le.c, $$1).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgi.b, dgs.c, ld.a().a(le.c, $$1).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgi.b, dgs.c, ld.a().a(le.c, $$1).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgi.b, dgs.b, ld.a().a(le.c, $$1).a(le.b, le.a.d).a(le.d, true))
               .a(hc.e, dgi.b, dgs.b, ld.a().a(le.c, $$1).a(le.b, le.a.b).a(le.d, true))
               .a(hc.d, dgi.b, dgs.b, ld.a().a(le.c, $$1))
               .a(hc.c, dgi.b, dgs.b, ld.a().a(le.c, $$1).a(le.b, le.a.c).a(le.d, true))
               .a(hc.f, dgi.a, dgs.a, ld.a().a(le.c, $$2).a(le.a, le.a.c).a(le.d, true))
               .a(hc.e, dgi.a, dgs.a, ld.a().a(le.c, $$2).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgi.a, dgs.a, ld.a().a(le.c, $$2).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgi.a, dgs.a, ld.a().a(le.c, $$2).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgi.a, dgs.e, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.e, dgi.a, dgs.e, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
               .a(hc.d, dgi.a, dgs.e, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.c, dgi.a, dgs.e, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.d, true))
               .a(hc.f, dgi.a, dgs.d, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.d, true))
               .a(hc.e, dgi.a, dgs.d, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgi.a, dgs.d, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgi.a, dgs.d, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgi.a, dgs.c, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.e, dgi.a, dgs.c, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
               .a(hc.d, dgi.a, dgs.c, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.c, dgi.a, dgs.c, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.d, true))
               .a(hc.f, dgi.a, dgs.b, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.d, true))
               .a(hc.e, dgi.a, dgs.b, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgi.a, dgs.b, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgi.a, dgs.b, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
         );
   }

   private static kx c(csv $$0, aex $$1, aex $$2, aex $$3) {
      return la.a($$0)
         .a(
            lb.a(dfz.R, dfz.af, dfz.u)
               .a(hc.c, dgi.b, false, ld.a().a(le.c, $$2))
               .a(hc.d, dgi.b, false, ld.a().a(le.c, $$2).a(le.b, le.a.c))
               .a(hc.f, dgi.b, false, ld.a().a(le.c, $$2).a(le.b, le.a.b))
               .a(hc.e, dgi.b, false, ld.a().a(le.c, $$2).a(le.b, le.a.d))
               .a(hc.c, dgi.a, false, ld.a().a(le.c, $$1))
               .a(hc.d, dgi.a, false, ld.a().a(le.c, $$1).a(le.b, le.a.c))
               .a(hc.f, dgi.a, false, ld.a().a(le.c, $$1).a(le.b, le.a.b))
               .a(hc.e, dgi.a, false, ld.a().a(le.c, $$1).a(le.b, le.a.d))
               .a(hc.c, dgi.b, true, ld.a().a(le.c, $$3))
               .a(hc.d, dgi.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.c))
               .a(hc.f, dgi.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(hc.e, dgi.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.d))
               .a(hc.c, dgi.a, true, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.c))
               .a(hc.d, dgi.a, true, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.a))
               .a(hc.f, dgi.a, true, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.d))
               .a(hc.e, dgi.a, true, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.b))
         );
   }

   private static kx d(csv $$0, aex $$1, aex $$2, aex $$3) {
      return la.a($$0)
         .a(
            lb.a(dfz.R, dfz.af, dfz.u)
               .a(hc.c, dgi.b, false, ld.a().a(le.c, $$2))
               .a(hc.d, dgi.b, false, ld.a().a(le.c, $$2))
               .a(hc.f, dgi.b, false, ld.a().a(le.c, $$2))
               .a(hc.e, dgi.b, false, ld.a().a(le.c, $$2))
               .a(hc.c, dgi.a, false, ld.a().a(le.c, $$1))
               .a(hc.d, dgi.a, false, ld.a().a(le.c, $$1))
               .a(hc.f, dgi.a, false, ld.a().a(le.c, $$1))
               .a(hc.e, dgi.a, false, ld.a().a(le.c, $$1))
               .a(hc.c, dgi.b, true, ld.a().a(le.c, $$3))
               .a(hc.d, dgi.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.c))
               .a(hc.f, dgi.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(hc.e, dgi.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.d))
               .a(hc.c, dgi.a, true, ld.a().a(le.c, $$3))
               .a(hc.d, dgi.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.c))
               .a(hc.f, dgi.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(hc.e, dgi.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.d))
         );
   }

   static la c(csv $$0, aex $$1) {
      return la.a($$0, ld.a().a(le.c, $$1));
   }

   private static lb f() {
      return lb.a(dfz.I).a(hc.a.b, ld.a()).a(hc.a.c, ld.a().a(le.a, le.a.b)).a(hc.a.a, ld.a().a(le.a, le.a.b).a(le.b, le.a.b));
   }

   static kx a(csv $$0, ll $$1, BiConsumer<aex, Supplier<JsonElement>> $$2) {
      aex $$3 = lk.f.a($$0, $$1, $$2);
      aex $$4 = lk.g.a($$0, $$1, $$2);
      aex $$5 = lk.h.a($$0, $$1, $$2);
      aex $$6 = lk.i.a($$0, $$1, $$2);
      return la.a($$0, ld.a().a(le.c, $$6)).a(lb.a(dfz.I).a(hc.a.a, ld.a().a(le.c, $$3)).a(hc.a.b, ld.a().a(le.c, $$4)).a(hc.a.c, ld.a().a(le.c, $$5)));
   }

   static kx d(csv $$0, aex $$1) {
      return la.a($$0, ld.a().a(le.c, $$1)).a(f());
   }

   private void e(csv $$0, aex $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(csv $$0, ln.a $$1) {
      aex $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(csv $$0, ln.a $$1) {
      aex $$2 = $$1.create($$0, this.c);
      this.b.accept(la.a($$0, ld.a().a(le.c, $$2)).a(b()));
   }

   static kx d(csv $$0, aex $$1, aex $$2) {
      return la.a($$0)
         .a(
            lb.a(dfz.I)
               .a(hc.a.b, ld.a().a(le.c, $$1))
               .a(hc.a.c, ld.a().a(le.c, $$2).a(le.a, le.a.b))
               .a(hc.a.a, ld.a().a(le.c, $$2).a(le.a, le.a.b).a(le.b, le.a.b))
         );
   }

   private void a(csv $$0, ln.a $$1, ln.a $$2) {
      aex $$3 = $$1.create($$0, this.c);
      aex $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aex a(csv $$0, String $$1, lj $$2, Function<aex, ll> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ll.a($$0, $$1)), this.c);
   }

   static kx e(csv $$0, aex $$1, aex $$2) {
      return la.a($$0).a(a(dfz.w, $$2, $$1));
   }

   static kx e(csv $$0, aex $$1, aex $$2, aex $$3) {
      return la.a($$0).a(lb.a(dfz.bh).a(dgr.b, ld.a().a(le.c, $$1)).a(dgr.a, ld.a().a(le.c, $$2)).a(dgr.c, ld.a().a(le.c, $$3)));
   }

   public void a(csv $$0) {
      this.b($$0, ln.a);
   }

   public void b(csv $$0, ln.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(csv $$0, ll $$1, lj $$2) {
      aex $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ku.b h(csv $$0) {
      ln $$1 = this.g.getOrDefault($$0, ln.a.get($$0));
      return new ku.b($$1.b()).a($$0, $$1.a());
   }

   public void a(csv $$0, csv $$1, csv $$2) {
      ll $$3 = ll.u($$0);
      aex $$4 = lk.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(csv $$0) {
      ll $$1 = ll.t($$0);
      aex $$2 = lk.t.a($$0, $$1, this.c);
      aex $$3 = lk.u.a($$0, $$1, this.c);
      aex $$4 = lk.v.a($$0, $$1, this.c);
      aex $$5 = lk.w.a($$0, $$1, this.c);
      aex $$6 = lk.x.a($$0, $$1, this.c);
      aex $$7 = lk.y.a($$0, $$1, this.c);
      aex $$8 = lk.z.a($$0, $$1, this.c);
      aex $$9 = lk.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(csv $$0) {
      ll $$1 = ll.b($$0);
      aex $$2 = lk.ai.a($$0, $$1, this.c);
      aex $$3 = lk.aj.a($$0, $$1, this.c);
      aex $$4 = lk.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(csv $$0) {
      ll $$1 = ll.b($$0);
      aex $$2 = lk.af.a($$0, $$1, this.c);
      aex $$3 = lk.ag.a($$0, $$1, this.c);
      aex $$4 = lk.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(csw.rC);
      aex $$0 = li.a(csw.rC);
      aex $$1 = li.a(csw.rC, "_partial_tilt");
      aex $$2 = li.a(csw.rC, "_full_tilt");
      this.b
         .accept(
            la.a(csw.rC)
               .a(b())
               .a(lb.a(dfz.bl).a(dgu.a, ld.a().a(le.c, $$0)).a(dgu.b, ld.a().a(le.c, $$0)).a(dgu.c, ld.a().a(le.c, $$1)).a(dgu.d, ld.a().a(le.c, $$2)))
         );
   }

   private ku.f l(csv $$0) {
      return new ku.f(ll.n($$0));
   }

   private void m(csv $$0) {
      this.a($$0, $$0);
   }

   private void a(csv $$0, csv $$1) {
      this.b.accept(c($$0, li.a($$1)));
   }

   private void a(csv $$0, ku.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(csv $$0, ku.e $$1, ll $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csv $$0, ku.e $$1) {
      ll $$2 = ll.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csv $$0, ku.e $$1, ll $$2) {
      aex $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(csv $$0, ku.e $$1, dgm<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         lb $$4 = lb.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            ll $$5 = ll.c(ll.a($$0, $$4x));
            aex $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return ld.a().a(le.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(la.a($$0).a($$4));
      }
   }

   private void a(csv $$0, csv $$1, ku.e $$2) {
      this.a($$0, $$2);
      ll $$3 = ll.d($$0);
      aex $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(csv $$0, csv $$1) {
      ln $$2 = ln.o.get($$0);
      aex $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aex $$4 = lk.aA.a($$1, $$2.b(), this.c);
      this.b.accept(la.a($$1, ld.a().a(le.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(csv $$0, csv $$1) {
      this.a($$0.k());
      ll $$2 = ll.h($$0);
      ll $$3 = ll.a($$0, $$1);
      aex $$4 = lk.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            la.a($$1, ld.a().a(le.c, $$4))
               .a(lb.a(dfz.R).a(hc.e, ld.a()).a(hc.d, ld.a().a(le.b, le.a.d)).a(hc.c, ld.a().a(le.b, le.a.b)).a(hc.f, ld.a().a(le.b, le.a.c)))
         );
      this.b.accept(la.a($$0).a(lb.a(dfz.av).a($$2x -> ld.a().a(le.c, lk.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      csv $$0 = csw.kC;
      this.a($$0.k());
      aex $$1 = li.a($$0, "_top");
      aex $$2 = li.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      csv $$0 = csw.kB;
      this.a($$0.k());
      lb $$1 = lb.a(cyi.b, dfz.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> ld.a().a(le.c, li.a($$0, "_top_stage_" + $$1x));
            case b -> ld.a().a(le.c, li.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(la.a($$0).a($$1));
   }

   private void a(csv $$0, csv $$1, csv $$2, csv $$3, csv $$4, csv $$5, csv $$6, csv $$7) {
      this.a($$0, ku.e.b);
      this.a($$1, ku.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(csv $$0, ku.e $$1) {
      this.a($$0, "_top");
      aex $$2 = this.a($$0, "_top", $$1.a(), ll::c);
      aex $$3 = this.a($$0, "_bottom", $$1.a(), ll::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(csw.iD, "_front");
      aex $$0 = li.a(csw.iD, "_top");
      aex $$1 = this.a(csw.iD, "_bottom", ku.e.b.a(), ll::c);
      this.f(csw.iD, $$0, $$1);
   }

   private void k() {
      aex $$0 = this.a(csw.bx, "_top", lk.bi, ll::a);
      aex $$1 = this.a(csw.bx, "_bottom", lk.bi, ll::a);
      this.f(csw.bx, $$0, $$1);
   }

   private void l() {
      this.c(csw.rE);
      aex $$0 = li.a(csw.rE, "_top");
      aex $$1 = li.a(csw.rE, "_bottom");
      this.b.accept(la.a(csw.rE).a(b()).a(lb.a(dfz.ae).a(dgf.b, ld.a().a(le.c, $$1)).a(dgf.a, ld.a().a(le.c, $$0))));
   }

   private void f(csv $$0, aex $$1, aex $$2) {
      this.b.accept(la.a($$0).a(lb.a(dfz.ae).a(dgf.b, ld.a().a(le.c, $$2)).a(dgf.a, ld.a().a(le.c, $$1))));
   }

   private void n(csv $$0) {
      ll $$1 = ll.e($$0);
      ll $$2 = ll.e(ll.a($$0, "_corner"));
      aex $$3 = lk.aq.a($$0, $$1, this.c);
      aex $$4 = lk.ar.a($$0, $$2, this.c);
      aex $$5 = lk.as.a($$0, $$1, this.c);
      aex $$6 = lk.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            la.a($$0)
               .a(
                  lb.a(dfz.ag)
                     .a(dgn.a, ld.a().a(le.c, $$3))
                     .a(dgn.b, ld.a().a(le.c, $$3).a(le.b, le.a.b))
                     .a(dgn.c, ld.a().a(le.c, $$5).a(le.b, le.a.b))
                     .a(dgn.d, ld.a().a(le.c, $$6).a(le.b, le.a.b))
                     .a(dgn.e, ld.a().a(le.c, $$5))
                     .a(dgn.f, ld.a().a(le.c, $$6))
                     .a(dgn.g, ld.a().a(le.c, $$4))
                     .a(dgn.h, ld.a().a(le.c, $$4).a(le.b, le.a.b))
                     .a(dgn.i, ld.a().a(le.c, $$4).a(le.b, le.a.c))
                     .a(dgn.j, ld.a().a(le.c, $$4).a(le.b, le.a.d))
               )
         );
   }

   private void o(csv $$0) {
      aex $$1 = this.a($$0, "", lk.aq, ll::e);
      aex $$2 = this.a($$0, "", lk.as, ll::e);
      aex $$3 = this.a($$0, "", lk.at, ll::e);
      aex $$4 = this.a($$0, "_on", lk.aq, ll::e);
      aex $$5 = this.a($$0, "_on", lk.as, ll::e);
      aex $$6 = this.a($$0, "_on", lk.at, ll::e);
      lb $$7 = lb.a(dfz.w, dfz.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return ld.a().a(le.c, $$6x ? $$4 : $$1);
            case b:
               return ld.a().a(le.c, $$6x ? $$4 : $$1).a(le.b, le.a.b);
            case c:
               return ld.a().a(le.c, $$6x ? $$5 : $$2).a(le.b, le.a.b);
            case d:
               return ld.a().a(le.c, $$6x ? $$6 : $$3).a(le.b, le.a.b);
            case e:
               return ld.a().a(le.c, $$6x ? $$5 : $$2);
            case f:
               return ld.a().a(le.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(la.a($$0).a($$7));
   }

   private ku.a a(aex $$0, csv $$1) {
      return new ku.a($$0, $$1);
   }

   private ku.a d(csv $$0, csv $$1) {
      return new ku.a(li.a($$0), $$1);
   }

   private void a(csv $$0, cja $$1) {
      aex $$2 = lk.Y.a($$0, ll.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(csv $$0, aex $$1) {
      aex $$2 = lk.Y.a($$0, ll.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(csv $$0, csv $$1) {
      this.a($$0);
      aex $$2 = ln.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(csv $$0) {
      this.a($$0.k());
      aex $$1 = ln.j.create($$0, this.c);
      aex $$2 = ln.k.create($$0, this.c);
      aex $$3 = ln.l.create($$0, this.c);
      aex $$4 = ln.m.create($$0, this.c);
      this.b
         .accept(
            kz.a($$0)
               .a(ky.a().a(dfz.S, 1, 2, 3, 4).a(dfz.R, hc.c), ld.a().a(le.c, $$1))
               .a(ky.a().a(dfz.S, 1, 2, 3, 4).a(dfz.R, hc.f), ld.a().a(le.c, $$1).a(le.b, le.a.b))
               .a(ky.a().a(dfz.S, 1, 2, 3, 4).a(dfz.R, hc.d), ld.a().a(le.c, $$1).a(le.b, le.a.c))
               .a(ky.a().a(dfz.S, 1, 2, 3, 4).a(dfz.R, hc.e), ld.a().a(le.c, $$1).a(le.b, le.a.d))
               .a(ky.a().a(dfz.S, 2, 3, 4).a(dfz.R, hc.c), ld.a().a(le.c, $$2))
               .a(ky.a().a(dfz.S, 2, 3, 4).a(dfz.R, hc.f), ld.a().a(le.c, $$2).a(le.b, le.a.b))
               .a(ky.a().a(dfz.S, 2, 3, 4).a(dfz.R, hc.d), ld.a().a(le.c, $$2).a(le.b, le.a.c))
               .a(ky.a().a(dfz.S, 2, 3, 4).a(dfz.R, hc.e), ld.a().a(le.c, $$2).a(le.b, le.a.d))
               .a(ky.a().a(dfz.S, 3, 4).a(dfz.R, hc.c), ld.a().a(le.c, $$3))
               .a(ky.a().a(dfz.S, 3, 4).a(dfz.R, hc.f), ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(ky.a().a(dfz.S, 3, 4).a(dfz.R, hc.d), ld.a().a(le.c, $$3).a(le.b, le.a.c))
               .a(ky.a().a(dfz.S, 3, 4).a(dfz.R, hc.e), ld.a().a(le.c, $$3).a(le.b, le.a.d))
               .a(ky.a().a(dfz.S, 4).a(dfz.R, hc.c), ld.a().a(le.c, $$4))
               .a(ky.a().a(dfz.S, 4).a(dfz.R, hc.f), ld.a().a(le.c, $$4).a(le.b, le.a.b))
               .a(ky.a().a(dfz.S, 4).a(dfz.R, hc.d), ld.a().a(le.c, $$4).a(le.b, le.a.c))
               .a(ky.a().a(dfz.S, 4).a(dfz.R, hc.e), ld.a().a(le.c, $$4).a(le.b, le.a.d))
         );
   }

   private void a(ln.a $$0, csv... $$1) {
      for (csv $$2 : $$1) {
         aex $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ln.a $$0, csv... $$1) {
      for (csv $$2 : $$1) {
         aex $$3 = $$0.create($$2, this.c);
         this.b.accept(la.a($$2, ld.a().a(le.c, $$3)).a(c()));
      }
   }

   private void f(csv $$0, csv $$1) {
      this.a($$0);
      ll $$2 = ll.b($$0, $$1);
      aex $$3 = lk.aG.a($$1, $$2, this.c);
      aex $$4 = lk.aH.a($$1, $$2, this.c);
      aex $$5 = lk.aI.a($$1, $$2, this.c);
      aex $$6 = lk.aE.a($$1, $$2, this.c);
      aex $$7 = lk.aF.a($$1, $$2, this.c);
      cja $$8 = $$1.k();
      lk.bv.a(li.a($$8), ll.F($$0), this.c);
      this.b
         .accept(
            kz.a($$1)
               .a(ld.a().a(le.c, $$3))
               .a(ky.a().a(dfz.L, true), ld.a().a(le.c, $$4))
               .a(ky.a().a(dfz.M, true), ld.a().a(le.c, $$4).a(le.b, le.a.b))
               .a(ky.a().a(dfz.N, true), ld.a().a(le.c, $$5))
               .a(ky.a().a(dfz.O, true), ld.a().a(le.c, $$5).a(le.b, le.a.b))
               .a(ky.a().a(dfz.L, false), ld.a().a(le.c, $$6))
               .a(ky.a().a(dfz.M, false), ld.a().a(le.c, $$7))
               .a(ky.a().a(dfz.N, false), ld.a().a(le.c, $$7).a(le.b, le.a.b))
               .a(ky.a().a(dfz.O, false), ld.a().a(le.c, $$6).a(le.b, le.a.d))
         );
   }

   private void q(csv $$0) {
      ll $$1 = ll.z($$0);
      aex $$2 = lk.aJ.a($$0, $$1, this.c);
      aex $$3 = this.a($$0, "_conditional", lk.aJ, $$1x -> $$1.c(lm.i, $$1x));
      this.b.accept(la.a($$0).a(a(dfz.c, $$3, $$2)).a(e()));
   }

   private void r(csv $$0) {
      aex $$1 = ln.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<ld> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> ld.a().a(le.c, li.a(csw.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(csw.mZ);
      this.b
         .accept(
            kz.a(csw.mZ)
               .a(ky.a().a(dfz.aq, 0), this.a(0))
               .a(ky.a().a(dfz.aq, 1), this.a(1))
               .a(ky.a().a(dfz.bk, dfv.b), ld.a().a(le.c, li.a(csw.mZ, "_small_leaves")))
               .a(ky.a().a(dfz.bk, dfv.c), ld.a().a(le.c, li.a(csw.mZ, "_large_leaves")))
         );
   }

   private lb n() {
      return lb.a(dfz.P)
         .a(hc.a, ld.a().a(le.a, le.a.c))
         .a(hc.b, ld.a())
         .a(hc.c, ld.a().a(le.a, le.a.b))
         .a(hc.d, ld.a().a(le.a, le.a.b).a(le.b, le.a.c))
         .a(hc.e, ld.a().a(le.a, le.a.b).a(le.b, le.a.d))
         .a(hc.f, ld.a().a(le.a, le.a.b).a(le.b, le.a.b));
   }

   private void o() {
      aex $$0 = ll.a(csw.nU, "_top_open");
      this.b
         .accept(
            la.a(csw.nU)
               .a(this.n())
               .a(
                  lb.a(dfz.u)
                     .a(false, ld.a().a(le.c, ln.e.create(csw.nU, this.c)))
                     .a(true, ld.a().a(le.c, ln.e.get(csw.nU).a($$1 -> $$1.a(lm.f, $$0)).a(csw.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> lb a(dgm<T> $$0, T $$1, aex $$2, aex $$3) {
      ld $$4 = ld.a().a(le.c, $$2);
      ld $$5 = ld.a().a(le.c, $$3);
      return lb.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(csv $$0, Function<csv, ll> $$1) {
      ll $$2 = $$1.apply($$0).b(lm.i, lm.c);
      ll $$3 = $$2.c(lm.g, ll.a($$0, "_front_honey"));
      aex $$4 = lk.o.a($$0, $$2, this.c);
      aex $$5 = lk.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(la.a($$0).a(b()).a(a(dfz.aN, 5, $$5, $$4)));
   }

   private void a(csv $$0, dgm<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aex> $$3 = new Int2ObjectOpenHashMap();
         lb $$4 = lb.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aex $$5 = (aex)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, lk.aT, ll::g));
            return ld.a().a(le.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(la.a($$0).a($$4));
      }
   }

   private void p() {
      aex $$0 = li.a(csw.od, "_floor");
      aex $$1 = li.a(csw.od, "_ceiling");
      aex $$2 = li.a(csw.od, "_wall");
      aex $$3 = li.a(csw.od, "_between_walls");
      this.a(cji.vs);
      this.b
         .accept(
            la.a(csw.od)
               .a(
                  lb.a(dfz.R, dfz.V)
                     .a(hc.c, dfx.a, ld.a().a(le.c, $$0))
                     .a(hc.d, dfx.a, ld.a().a(le.c, $$0).a(le.b, le.a.c))
                     .a(hc.f, dfx.a, ld.a().a(le.c, $$0).a(le.b, le.a.b))
                     .a(hc.e, dfx.a, ld.a().a(le.c, $$0).a(le.b, le.a.d))
                     .a(hc.c, dfx.b, ld.a().a(le.c, $$1))
                     .a(hc.d, dfx.b, ld.a().a(le.c, $$1).a(le.b, le.a.c))
                     .a(hc.f, dfx.b, ld.a().a(le.c, $$1).a(le.b, le.a.b))
                     .a(hc.e, dfx.b, ld.a().a(le.c, $$1).a(le.b, le.a.d))
                     .a(hc.c, dfx.c, ld.a().a(le.c, $$2).a(le.b, le.a.d))
                     .a(hc.d, dfx.c, ld.a().a(le.c, $$2).a(le.b, le.a.b))
                     .a(hc.f, dfx.c, ld.a().a(le.c, $$2))
                     .a(hc.e, dfx.c, ld.a().a(le.c, $$2).a(le.b, le.a.c))
                     .a(hc.d, dfx.d, ld.a().a(le.c, $$3).a(le.b, le.a.b))
                     .a(hc.c, dfx.d, ld.a().a(le.c, $$3).a(le.b, le.a.d))
                     .a(hc.f, dfx.d, ld.a().a(le.c, $$3))
                     .a(hc.e, dfx.d, ld.a().a(le.c, $$3).a(le.b, le.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            la.a(csw.nZ, ld.a().a(le.c, li.a(csw.nZ)))
               .a(
                  lb.a(dfz.U, dfz.R)
                     .a(dfu.a, hc.c, ld.a())
                     .a(dfu.a, hc.f, ld.a().a(le.b, le.a.b))
                     .a(dfu.a, hc.d, ld.a().a(le.b, le.a.c))
                     .a(dfu.a, hc.e, ld.a().a(le.b, le.a.d))
                     .a(dfu.b, hc.c, ld.a().a(le.a, le.a.b))
                     .a(dfu.b, hc.f, ld.a().a(le.a, le.a.b).a(le.b, le.a.b))
                     .a(dfu.b, hc.d, ld.a().a(le.a, le.a.b).a(le.b, le.a.c))
                     .a(dfu.b, hc.e, ld.a().a(le.a, le.a.b).a(le.b, le.a.d))
                     .a(dfu.c, hc.d, ld.a().a(le.a, le.a.c))
                     .a(dfu.c, hc.e, ld.a().a(le.a, le.a.c).a(le.b, le.a.b))
                     .a(dfu.c, hc.c, ld.a().a(le.a, le.a.c).a(le.b, le.a.c))
                     .a(dfu.c, hc.f, ld.a().a(le.a, le.a.c).a(le.b, le.a.d))
               )
         );
   }

   private void d(csv $$0, ln.a $$1) {
      aex $$2 = $$1.create($$0, this.c);
      aex $$3 = ll.a($$0, "_front_on");
      aex $$4 = $$1.get($$0).a($$1x -> $$1x.a(lm.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(la.a($$0).a(a(dfz.r, $$4, $$2)).a(b()));
   }

   private void a(csv... $$0) {
      aex $$1 = li.a("campfire_off");

      for (csv $$2 : $$0) {
         aex $$3 = lk.ba.a($$2, ll.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(la.a($$2).a(a(dfz.r, $$3, $$1)).a(c()));
      }
   }

   private void s(csv $$0) {
      aex $$1 = lk.br.a($$0, ll.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(csv $$0) {
      aex $$1;
      if ($$0 == csw.si) {
         $$1 = lk.bt.a($$0, ll.m($$0), this.c);
      } else {
         $$1 = lk.bs.a($$0, ll.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ll $$0 = ll.a(ll.G(csw.cl), ll.G(csw.n));
      aex $$1 = lk.i.a(csw.cl, $$0, this.c);
      this.b.accept(c(csw.cl, $$1));
   }

   private void s() {
      this.a(cji.ll);
      this.b
         .accept(
            kz.a(csw.cw)
               .a(
                  ky.b(
                     ky.a().a(dfz.ab, dgo.c).a(dfz.aa, dgo.c).a(dfz.ac, dgo.c).a(dfz.ad, dgo.c),
                     ky.a().a(dfz.ab, dgo.b, dgo.a).a(dfz.aa, dgo.b, dgo.a),
                     ky.a().a(dfz.aa, dgo.b, dgo.a).a(dfz.ac, dgo.b, dgo.a),
                     ky.a().a(dfz.ac, dgo.b, dgo.a).a(dfz.ad, dgo.b, dgo.a),
                     ky.a().a(dfz.ad, dgo.b, dgo.a).a(dfz.ab, dgo.b, dgo.a)
                  ),
                  ld.a().a(le.c, li.a("redstone_dust_dot"))
               )
               .a(ky.a().a(dfz.ab, dgo.b, dgo.a), ld.a().a(le.c, li.a("redstone_dust_side0")))
               .a(ky.a().a(dfz.ac, dgo.b, dgo.a), ld.a().a(le.c, li.a("redstone_dust_side_alt0")))
               .a(ky.a().a(dfz.aa, dgo.b, dgo.a), ld.a().a(le.c, li.a("redstone_dust_side_alt1")).a(le.b, le.a.d))
               .a(ky.a().a(dfz.ad, dgo.b, dgo.a), ld.a().a(le.c, li.a("redstone_dust_side1")).a(le.b, le.a.d))
               .a(ky.a().a(dfz.ab, dgo.a), ld.a().a(le.c, li.a("redstone_dust_up")))
               .a(ky.a().a(dfz.aa, dgo.a), ld.a().a(le.c, li.a("redstone_dust_up")).a(le.b, le.a.b))
               .a(ky.a().a(dfz.ac, dgo.a), ld.a().a(le.c, li.a("redstone_dust_up")).a(le.b, le.a.c))
               .a(ky.a().a(dfz.ad, dgo.a), ld.a().a(le.c, li.a("redstone_dust_up")).a(le.b, le.a.d))
         );
   }

   private void t() {
      this.a(cji.lp);
      this.b
         .accept(
            la.a(csw.gY)
               .a(c())
               .a(
                  lb.a(dfz.bd, dfz.w)
                     .a(dgc.a, false, ld.a().a(le.c, li.a(csw.gY)))
                     .a(dgc.a, true, ld.a().a(le.c, li.a(csw.gY, "_on")))
                     .a(dgc.b, false, ld.a().a(le.c, li.a(csw.gY, "_subtract")))
                     .a(dgc.b, true, ld.a().a(le.c, li.a(csw.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      ll $$0 = ll.a(csw.jR);
      ll $$1 = ll.a(ll.a(csw.jE, "_side"), $$0.a(lm.f));
      aex $$2 = lk.Z.a(csw.jE, $$1, this.c);
      aex $$3 = lk.aa.a(csw.jE, $$1, this.c);
      aex $$4 = lk.i.b(csw.jE, "_double", $$1, this.c);
      this.b.accept(e(csw.jE, $$2, $$3, $$4));
      this.b.accept(c(csw.jR, lk.c.a(csw.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cji.rB);
      this.b
         .accept(
            kz.a(csw.fs)
               .a(ld.a().a(le.c, ll.G(csw.fs)))
               .a(ky.a().a(dfz.k, true), ld.a().a(le.c, ll.a(csw.fs, "_bottle0")))
               .a(ky.a().a(dfz.l, true), ld.a().a(le.c, ll.a(csw.fs, "_bottle1")))
               .a(ky.a().a(dfz.m, true), ld.a().a(le.c, ll.a(csw.fs, "_bottle2")))
               .a(ky.a().a(dfz.k, false), ld.a().a(le.c, ll.a(csw.fs, "_empty0")))
               .a(ky.a().a(dfz.l, false), ld.a().a(le.c, ll.a(csw.fs, "_empty1")))
               .a(ky.a().a(dfz.m, false), ld.a().a(le.c, ll.a(csw.fs, "_empty2")))
         );
   }

   private void u(csv $$0) {
      aex $$1 = lk.bn.a($$0, ll.b($$0), this.c);
      aex $$2 = li.a("mushroom_block_inside");
      this.b
         .accept(
            kz.a($$0)
               .a(ky.a().a(dfz.L, true), ld.a().a(le.c, $$1))
               .a(ky.a().a(dfz.M, true), ld.a().a(le.c, $$1).a(le.b, le.a.b).a(le.d, true))
               .a(ky.a().a(dfz.N, true), ld.a().a(le.c, $$1).a(le.b, le.a.c).a(le.d, true))
               .a(ky.a().a(dfz.O, true), ld.a().a(le.c, $$1).a(le.b, le.a.d).a(le.d, true))
               .a(ky.a().a(dfz.J, true), ld.a().a(le.c, $$1).a(le.a, le.a.d).a(le.d, true))
               .a(ky.a().a(dfz.K, true), ld.a().a(le.c, $$1).a(le.a, le.a.b).a(le.d, true))
               .a(ky.a().a(dfz.L, false), ld.a().a(le.c, $$2))
               .a(ky.a().a(dfz.M, false), ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, false))
               .a(ky.a().a(dfz.N, false), ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, false))
               .a(ky.a().a(dfz.O, false), ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, false))
               .a(ky.a().a(dfz.J, false), ld.a().a(le.c, $$2).a(le.a, le.a.d).a(le.d, false))
               .a(ky.a().a(dfz.K, false), ld.a().a(le.c, $$2).a(le.a, le.a.b).a(le.d, false))
         );
      this.a($$0, ln.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cji.qN);
      this.b
         .accept(
            la.a(csw.eh)
               .a(
                  lb.a(dfz.ay)
                     .a(0, ld.a().a(le.c, li.a(csw.eh)))
                     .a(1, ld.a().a(le.c, li.a(csw.eh, "_slice1")))
                     .a(2, ld.a().a(le.c, li.a(csw.eh, "_slice2")))
                     .a(3, ld.a().a(le.c, li.a(csw.eh, "_slice3")))
                     .a(4, ld.a().a(le.c, li.a(csw.eh, "_slice4")))
                     .a(5, ld.a().a(le.c, li.a(csw.eh, "_slice5")))
                     .a(6, ld.a().a(le.c, li.a(csw.eh, "_slice6")))
               )
         );
   }

   private void x() {
      ll $$0 = new ll()
         .a(lm.c, ll.a(csw.nX, "_side3"))
         .a(lm.o, ll.G(csw.t))
         .a(lm.n, ll.a(csw.nX, "_top"))
         .a(lm.j, ll.a(csw.nX, "_side3"))
         .a(lm.l, ll.a(csw.nX, "_side3"))
         .a(lm.k, ll.a(csw.nX, "_side1"))
         .a(lm.m, ll.a(csw.nX, "_side2"));
      this.b.accept(c(csw.nX, lk.a.a(csw.nX, $$0, this.c)));
   }

   private void y() {
      ll $$0 = new ll()
         .a(lm.c, ll.a(csw.ob, "_front"))
         .a(lm.o, ll.a(csw.ob, "_bottom"))
         .a(lm.n, ll.a(csw.ob, "_top"))
         .a(lm.j, ll.a(csw.ob, "_front"))
         .a(lm.k, ll.a(csw.ob, "_front"))
         .a(lm.l, ll.a(csw.ob, "_side"))
         .a(lm.m, ll.a(csw.ob, "_side"));
      this.b.accept(c(csw.ob, lk.a.a(csw.ob, $$0, this.c)));
   }

   private void a(csv $$0, csv $$1, BiFunction<csv, csv, ll> $$2) {
      ll $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, lk.a.a($$0, $$3, this.c)));
   }

   public void b(csv $$0) {
      ll $$1 = new ll()
         .a(lm.c, ll.a($$0, "_particle"))
         .a(lm.o, ll.a($$0, "_down"))
         .a(lm.n, ll.a($$0, "_up"))
         .a(lm.j, ll.a($$0, "_north"))
         .a(lm.k, ll.a($$0, "_south"))
         .a(lm.l, ll.a($$0, "_east"))
         .a(lm.m, ll.a($$0, "_west"));
      this.b.accept(c($$0, lk.a.a($$0, $$1, this.c)));
   }

   private void z() {
      ll $$0 = ll.k(csw.dV);
      this.b.accept(c(csw.dV, li.a(csw.dV)));
      this.a(csw.ef, $$0);
      this.a(csw.eg, $$0);
   }

   private void a(csv $$0, ll $$1) {
      aex $$2 = lk.n.a($$0, $$1.c(lm.g, ll.G($$0)), this.c);
      this.b.accept(la.a($$0, ld.a().a(le.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cji.rC);
      this.m(csw.ft);
      this.b.accept(c(csw.fv, lk.bq.a(csw.fv, ll.j(ll.a(csw.H, "_still")), this.c)));
      this.b
         .accept(
            la.a(csw.fu)
               .a(
                  lb.a(cxb.e)
                     .a(1, ld.a().a(le.c, lk.bo.a(csw.fu, "_level1", ll.j(ll.a(csw.G, "_still")), this.c)))
                     .a(2, ld.a().a(le.c, lk.bp.a(csw.fu, "_level2", ll.j(ll.a(csw.G, "_still")), this.c)))
                     .a(3, ld.a().a(le.c, lk.bq.a(csw.fu, "_full", ll.j(ll.a(csw.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            la.a(csw.fw)
               .a(
                  lb.a(cxb.e)
                     .a(1, ld.a().a(le.c, lk.bo.a(csw.fw, "_level1", ll.j(ll.G(csw.qC)), this.c)))
                     .a(2, ld.a().a(le.c, lk.bp.a(csw.fw, "_level2", ll.j(ll.G(csw.qC)), this.c)))
                     .a(3, ld.a().a(le.c, lk.bq.a(csw.fw, "_full", ll.j(ll.G(csw.qC)), this.c)))
               )
         );
   }

   private void B() {
      ll $$0 = ll.b(csw.kv);
      aex $$1 = lk.aC.a(csw.kv, $$0, this.c);
      aex $$2 = this.a(csw.kv, "_dead", lk.aC, $$1x -> $$0.c(lm.b, $$1x));
      this.b.accept(la.a(csw.kv).a(a(dfz.au, 5, $$2, $$1)));
   }

   private void v(csv $$0) {
      ll $$1 = new ll().a(lm.f, ll.a(csw.cD, "_top")).a(lm.i, ll.a(csw.cD, "_side")).a(lm.g, ll.a($$0, "_front"));
      ll $$2 = new ll().a(lm.i, ll.a(csw.cD, "_top")).a(lm.g, ll.a($$0, "_front_vertical"));
      aex $$3 = lk.n.a($$0, $$1, this.c);
      aex $$4 = lk.p.a($$0, $$2, this.c);
      this.b
         .accept(
            la.a($$0)
               .a(
                  lb.a(dfz.P)
                     .a(hc.a, ld.a().a(le.c, $$4).a(le.a, le.a.c))
                     .a(hc.b, ld.a().a(le.c, $$4))
                     .a(hc.c, ld.a().a(le.c, $$3))
                     .a(hc.f, ld.a().a(le.c, $$3).a(le.b, le.a.b))
                     .a(hc.d, ld.a().a(le.c, $$3).a(le.b, le.a.c))
                     .a(hc.e, ld.a().a(le.c, $$3).a(le.b, le.a.d))
               )
         );
   }

   private void C() {
      aex $$0 = li.a(csw.fy);
      aex $$1 = li.a(csw.fy, "_filled");
      this.b.accept(la.a(csw.fy).a(lb.a(dfz.h).a(false, ld.a().a(le.c, $$0)).a(true, ld.a().a(le.c, $$1))).a(c()));
   }

   private void D() {
      aex $$0 = li.a(csw.ku, "_side");
      aex $$1 = li.a(csw.ku, "_noside");
      aex $$2 = li.a(csw.ku, "_noside1");
      aex $$3 = li.a(csw.ku, "_noside2");
      aex $$4 = li.a(csw.ku, "_noside3");
      this.b
         .accept(
            kz.a(csw.ku)
               .a(ky.a().a(dfz.L, true), ld.a().a(le.c, $$0))
               .a(ky.a().a(dfz.M, true), ld.a().a(le.c, $$0).a(le.b, le.a.b).a(le.d, true))
               .a(ky.a().a(dfz.N, true), ld.a().a(le.c, $$0).a(le.b, le.a.c).a(le.d, true))
               .a(ky.a().a(dfz.O, true), ld.a().a(le.c, $$0).a(le.b, le.a.d).a(le.d, true))
               .a(ky.a().a(dfz.J, true), ld.a().a(le.c, $$0).a(le.a, le.a.d).a(le.d, true))
               .a(ky.a().a(dfz.K, true), ld.a().a(le.c, $$0).a(le.a, le.a.b).a(le.d, true))
               .a(ky.a().a(dfz.L, false), ld.a().a(le.c, $$1).a(le.e, 2), ld.a().a(le.c, $$2), ld.a().a(le.c, $$3), ld.a().a(le.c, $$4))
               .a(
                  ky.a().a(dfz.M, false),
                  ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, true),
                  ld.a().a(le.c, $$3).a(le.b, le.a.b).a(le.d, true),
                  ld.a().a(le.c, $$4).a(le.b, le.a.b).a(le.d, true),
                  ld.a().a(le.c, $$1).a(le.e, 2).a(le.b, le.a.b).a(le.d, true)
               )
               .a(
                  ky.a().a(dfz.N, false),
                  ld.a().a(le.c, $$3).a(le.b, le.a.c).a(le.d, true),
                  ld.a().a(le.c, $$4).a(le.b, le.a.c).a(le.d, true),
                  ld.a().a(le.c, $$1).a(le.e, 2).a(le.b, le.a.c).a(le.d, true),
                  ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, true)
               )
               .a(
                  ky.a().a(dfz.O, false),
                  ld.a().a(le.c, $$4).a(le.b, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$1).a(le.e, 2).a(le.b, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$3).a(le.b, le.a.d).a(le.d, true)
               )
               .a(
                  ky.a().a(dfz.J, false),
                  ld.a().a(le.c, $$1).a(le.e, 2).a(le.a, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$4).a(le.a, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$2).a(le.a, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$3).a(le.a, le.a.d).a(le.d, true)
               )
               .a(
                  ky.a().a(dfz.K, false),
                  ld.a().a(le.c, $$4).a(le.a, le.a.b).a(le.d, true),
                  ld.a().a(le.c, $$3).a(le.a, le.a.b).a(le.d, true),
                  ld.a().a(le.c, $$2).a(le.a, le.a.b).a(le.d, true),
                  ld.a().a(le.c, $$1).a(le.e, 2).a(le.a, le.a.b).a(le.d, true)
               )
         );
   }

   private void E() {
      this.b
         .accept(
            kz.a(csw.pc)
               .a(ld.a().a(le.c, ll.G(csw.pc)))
               .a(ky.a().a(dfz.aL, 1), ld.a().a(le.c, ll.a(csw.pc, "_contents1")))
               .a(ky.a().a(dfz.aL, 2), ld.a().a(le.c, ll.a(csw.pc, "_contents2")))
               .a(ky.a().a(dfz.aL, 3), ld.a().a(le.c, ll.a(csw.pc, "_contents3")))
               .a(ky.a().a(dfz.aL, 4), ld.a().a(le.c, ll.a(csw.pc, "_contents4")))
               .a(ky.a().a(dfz.aL, 5), ld.a().a(le.c, ll.a(csw.pc, "_contents5")))
               .a(ky.a().a(dfz.aL, 6), ld.a().a(le.c, ll.a(csw.pc, "_contents6")))
               .a(ky.a().a(dfz.aL, 7), ld.a().a(le.c, ll.a(csw.pc, "_contents7")))
               .a(ky.a().a(dfz.aL, 8), ld.a().a(le.c, ll.a(csw.pc, "_contents_ready")))
         );
   }

   private void w(csv $$0) {
      this.c($$0);
      this.b.accept(la.a($$0, ld.a().a(le.c, lk.am.a($$0, ll.c($$0), this.c))).a(this.n()));
   }

   private void F() {
      this.w(csw.qy);
      this.w(csw.qx);
      this.w(csw.qw);
      this.w(csw.qv);
   }

   private void G() {
      this.c(csw.rs);
      lb.b<hc, dgg> $$0 = lb.a(dfz.bm, dfz.bn);

      for (dgg $$1 : dgg.values()) {
         $$0.a(hc.b, $$1, this.a(hc.b, $$1));
      }

      for (dgg $$2 : dgg.values()) {
         $$0.a(hc.a, $$2, this.a(hc.a, $$2));
      }

      this.b.accept(la.a(csw.rs).a($$0));
   }

   private ld a(hc $$0, dgg $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ll $$3 = ll.c(ll.a(csw.rs, $$2));
      return ld.a().a(le.c, lk.al.a(csw.rs, $$2, $$3, this.c));
   }

   private void x(csv $$0) {
      ll $$1 = new ll().a(lm.e, ll.G(csw.dW)).a(lm.f, ll.G($$0)).a(lm.i, ll.a($$0, "_side"));
      this.b.accept(c($$0, lk.m.a($$0, $$1, this.c)));
   }

   private void H() {
      aex $$0 = ll.a(csw.gZ, "_side");
      ll $$1 = new ll().a(lm.f, ll.a(csw.gZ, "_top")).a(lm.i, $$0);
      ll $$2 = new ll().a(lm.f, ll.a(csw.gZ, "_inverted_top")).a(lm.i, $$0);
      this.b
         .accept(
            la.a(csw.gZ)
               .a(lb.a(dfz.p).a(false, ld.a().a(le.c, lk.aD.a(csw.gZ, $$1, this.c))).a(true, ld.a().a(le.c, lk.aD.a(li.a(csw.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(csv $$0) {
      this.b.accept(la.a($$0, ld.a().a(le.c, li.a($$0))).a(this.n()));
   }

   private void I() {
      csv $$0 = csw.rr;
      aex $$1 = li.a($$0, "_on");
      aex $$2 = li.a($$0);
      this.b.accept(la.a($$0, ld.a().a(le.c, li.a($$0))).a(this.n()).a(a(dfz.w, $$1, $$2)));
   }

   private void J() {
      ll $$0 = new ll().a(lm.B, ll.G(csw.j)).a(lm.f, ll.G(csw.cC));
      ll $$1 = new ll().a(lm.B, ll.G(csw.j)).a(lm.f, ll.a(csw.cC, "_moist"));
      aex $$2 = lk.aU.a(csw.cC, $$0, this.c);
      aex $$3 = lk.aU.a(ll.a(csw.cC, "_moist"), $$1, this.c);
      this.b.accept(la.a(csw.cC).a(a(dfz.aQ, 7, $$3, $$2)));
   }

   private List<aex> z(csv $$0) {
      aex $$1 = lk.aV.a(li.a($$0, "_floor0"), ll.v($$0), this.c);
      aex $$2 = lk.aV.a(li.a($$0, "_floor1"), ll.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aex> A(csv $$0) {
      aex $$1 = lk.aW.a(li.a($$0, "_side0"), ll.v($$0), this.c);
      aex $$2 = lk.aW.a(li.a($$0, "_side1"), ll.w($$0), this.c);
      aex $$3 = lk.aX.a(li.a($$0, "_side_alt0"), ll.v($$0), this.c);
      aex $$4 = lk.aX.a(li.a($$0, "_side_alt1"), ll.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aex> B(csv $$0) {
      aex $$1 = lk.aY.a(li.a($$0, "_up0"), ll.v($$0), this.c);
      aex $$2 = lk.aY.a(li.a($$0, "_up1"), ll.w($$0), this.c);
      aex $$3 = lk.aZ.a(li.a($$0, "_up_alt0"), ll.v($$0), this.c);
      aex $$4 = lk.aZ.a(li.a($$0, "_up_alt1"), ll.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<ld> a(List<aex> $$0, UnaryOperator<ld> $$1) {
      return $$0.stream().map($$0x -> ld.a().a(le.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void K() {
      ky $$0 = ky.a().a(dfz.L, false).a(dfz.M, false).a(dfz.N, false).a(dfz.O, false).a(dfz.J, false);
      List<aex> $$1 = this.z(csw.cr);
      List<aex> $$2 = this.A(csw.cr);
      List<aex> $$3 = this.B(csw.cr);
      this.b
         .accept(
            kz.a(csw.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(ky.b(ky.a().a(dfz.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(ky.b(ky.a().a(dfz.M, true), $$0), a($$2, $$0x -> $$0x.a(le.b, le.a.b)))
               .a(ky.b(ky.a().a(dfz.N, true), $$0), a($$2, $$0x -> $$0x.a(le.b, le.a.c)))
               .a(ky.b(ky.a().a(dfz.O, true), $$0), a($$2, $$0x -> $$0x.a(le.b, le.a.d)))
               .a(ky.a().a(dfz.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void L() {
      List<aex> $$0 = this.z(csw.cs);
      List<aex> $$1 = this.A(csw.cs);
      this.b
         .accept(
            kz.a(csw.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(le.b, le.a.b)))
               .a(a($$1, $$0x -> $$0x.a(le.b, le.a.c)))
               .a(a($$1, $$0x -> $$0x.a(le.b, le.a.d)))
         );
   }

   private void C(csv $$0) {
      aex $$1 = ln.s.create($$0, this.c);
      aex $$2 = ln.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(la.a($$0).a(a(dfz.j, $$2, $$1)));
   }

   private void M() {
      ll $$0 = ll.a(ll.a(csw.ad, "_side"), ll.a(csw.ad, "_top"));
      aex $$1 = lk.i.a(csw.ad, $$0, this.c);
      this.b.accept(d(csw.ad, $$1));
   }

   private void N() {
      this.a(cji.Q);
      csv $$0 = csw.E;
      lb.b<Boolean, Integer> $$1 = lb.a(cxn.c, cxn.a);
      aex $$2 = li.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aex $$4 = li.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, ld.a().a(le.c, $$4));
         $$1.a(false, $$3, ld.a().a(le.c, $$2));
      }

      this.b.accept(la.a(csw.E).a($$1));
   }

   private void O() {
      this.b
         .accept(
            la.a(csw.kI)
               .a(
                  lb.a(dfz.as)
                     .a(0, ld.a().a(le.c, this.a(csw.kI, "_0", lk.c, ll::b)))
                     .a(1, ld.a().a(le.c, this.a(csw.kI, "_1", lk.c, ll::b)))
                     .a(2, ld.a().a(le.c, this.a(csw.kI, "_2", lk.c, ll::b)))
                     .a(3, ld.a().a(le.c, this.a(csw.kI, "_3", lk.c, ll::b)))
               )
         );
   }

   private void P() {
      aex $$0 = ll.G(csw.j);
      ll $$1 = new ll().a(lm.e, $$0).b(lm.e, lm.c).a(lm.f, ll.a(csw.i, "_top")).a(lm.i, ll.a(csw.i, "_snow"));
      ld $$2 = ld.a().a(le.c, lk.m.a(csw.i, "_snow", $$1, this.c));
      this.a(csw.i, li.a(csw.i), $$2);
      aex $$3 = ln.e.get(csw.fl).a($$1x -> $$1x.a(lm.e, $$0)).a(csw.fl, this.c);
      this.a(csw.fl, $$3, $$2);
      aex $$4 = ln.e.get(csw.l).a($$1x -> $$1x.a(lm.e, $$0)).a(csw.l, this.c);
      this.a(csw.l, $$4, $$2);
   }

   private void a(csv $$0, aex $$1, ld $$2) {
      List<ld> $$3 = Arrays.asList(a($$1));
      this.b.accept(la.a($$0).a(lb.a(dfz.z).a(true, $$2).a(false, $$3)));
   }

   private void Q() {
      this.a(cji.qt);
      this.b
         .accept(
            la.a(csw.fC)
               .a(
                  lb.a(dfz.ar)
                     .a(0, ld.a().a(le.c, li.a(csw.fC, "_stage0")))
                     .a(1, ld.a().a(le.c, li.a(csw.fC, "_stage1")))
                     .a(2, ld.a().a(le.c, li.a(csw.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void R() {
      this.b.accept(b(csw.kE, li.a(csw.kE)));
   }

   private void g(csv $$0, csv $$1) {
      ll $$2 = ll.b($$1);
      aex $$3 = lk.W.a($$0, $$2, this.c);
      aex $$4 = lk.X.a($$0, $$2, this.c);
      this.b.accept(la.a($$0).a(a(dfz.aT, 1, $$4, $$3)));
   }

   private void S() {
      aex $$0 = li.a(csw.hc);
      aex $$1 = li.a(csw.hc, "_side");
      this.a(cji.lv);
      this.b
         .accept(
            la.a(csw.hc)
               .a(
                  lb.a(dfz.Q)
                     .a(hc.a, ld.a().a(le.c, $$0))
                     .a(hc.c, ld.a().a(le.c, $$1))
                     .a(hc.f, ld.a().a(le.c, $$1).a(le.b, le.a.b))
                     .a(hc.d, ld.a().a(le.c, $$1).a(le.b, le.a.c))
                     .a(hc.e, ld.a().a(le.c, $$1).a(le.b, le.a.d))
               )
         );
   }

   private void h(csv $$0, csv $$1) {
      aex $$2 = li.a($$0);
      this.b.accept(la.a($$1, ld.a().a(le.c, $$2)));
      this.a($$1, $$2);
   }

   private void T() {
      aex $$0 = li.a(csw.eX, "_post_ends");
      aex $$1 = li.a(csw.eX, "_post");
      aex $$2 = li.a(csw.eX, "_cap");
      aex $$3 = li.a(csw.eX, "_cap_alt");
      aex $$4 = li.a(csw.eX, "_side");
      aex $$5 = li.a(csw.eX, "_side_alt");
      this.b
         .accept(
            kz.a(csw.eX)
               .a(ld.a().a(le.c, $$0))
               .a(ky.a().a(dfz.L, false).a(dfz.M, false).a(dfz.N, false).a(dfz.O, false), ld.a().a(le.c, $$1))
               .a(ky.a().a(dfz.L, true).a(dfz.M, false).a(dfz.N, false).a(dfz.O, false), ld.a().a(le.c, $$2))
               .a(ky.a().a(dfz.L, false).a(dfz.M, true).a(dfz.N, false).a(dfz.O, false), ld.a().a(le.c, $$2).a(le.b, le.a.b))
               .a(ky.a().a(dfz.L, false).a(dfz.M, false).a(dfz.N, true).a(dfz.O, false), ld.a().a(le.c, $$3))
               .a(ky.a().a(dfz.L, false).a(dfz.M, false).a(dfz.N, false).a(dfz.O, true), ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(ky.a().a(dfz.L, true), ld.a().a(le.c, $$4))
               .a(ky.a().a(dfz.M, true), ld.a().a(le.c, $$4).a(le.b, le.a.b))
               .a(ky.a().a(dfz.N, true), ld.a().a(le.c, $$5))
               .a(ky.a().a(dfz.O, true), ld.a().a(le.c, $$5).a(le.b, le.a.b))
         );
      this.d(csw.eX);
   }

   private void D(csv $$0) {
      this.b.accept(la.a($$0, ld.a().a(le.c, li.a($$0))).a(b()));
   }

   private void U() {
      aex $$0 = li.a(csw.dw);
      aex $$1 = li.a(csw.dw, "_on");
      this.d(csw.dw);
      this.b
         .accept(
            la.a(csw.dw)
               .a(a(dfz.w, $$0, $$1))
               .a(
                  lb.a(dfz.U, dfz.R)
                     .a(dfu.c, hc.c, ld.a().a(le.a, le.a.c).a(le.b, le.a.c))
                     .a(dfu.c, hc.f, ld.a().a(le.a, le.a.c).a(le.b, le.a.d))
                     .a(dfu.c, hc.d, ld.a().a(le.a, le.a.c))
                     .a(dfu.c, hc.e, ld.a().a(le.a, le.a.c).a(le.b, le.a.b))
                     .a(dfu.a, hc.c, ld.a())
                     .a(dfu.a, hc.f, ld.a().a(le.b, le.a.b))
                     .a(dfu.a, hc.d, ld.a().a(le.b, le.a.c))
                     .a(dfu.a, hc.e, ld.a().a(le.b, le.a.d))
                     .a(dfu.b, hc.c, ld.a().a(le.a, le.a.b))
                     .a(dfu.b, hc.f, ld.a().a(le.a, le.a.b).a(le.b, le.a.b))
                     .a(dfu.b, hc.d, ld.a().a(le.a, le.a.b).a(le.b, le.a.c))
                     .a(dfu.b, hc.e, ld.a().a(le.a, le.a.b).a(le.b, le.a.d))
               )
         );
   }

   private void V() {
      this.d(csw.fm);
      this.b.accept(b(csw.fm, li.a(csw.fm)));
   }

   private void W() {
      this.d(csw.sm);
      this.b.accept(c(csw.sm, li.a(csw.sm)));
   }

   private void X() {
      this.b.accept(la.a(csw.ee).a(lb.a(dfz.H).a(hc.a.a, ld.a().a(le.c, li.a(csw.ee, "_ns"))).a(hc.a.c, ld.a().a(le.c, li.a(csw.ee, "_ew")))));
   }

   private void Y() {
      aex $$0 = ln.a.create(csw.dW, this.c);
      this.b
         .accept(
            la.a(
               csw.dW,
               ld.a().a(le.c, $$0),
               ld.a().a(le.c, $$0).a(le.a, le.a.b),
               ld.a().a(le.c, $$0).a(le.a, le.a.c),
               ld.a().a(le.c, $$0).a(le.a, le.a.d),
               ld.a().a(le.c, $$0).a(le.b, le.a.b),
               ld.a().a(le.c, $$0).a(le.b, le.a.b).a(le.a, le.a.b),
               ld.a().a(le.c, $$0).a(le.b, le.a.b).a(le.a, le.a.c),
               ld.a().a(le.c, $$0).a(le.b, le.a.b).a(le.a, le.a.d),
               ld.a().a(le.c, $$0).a(le.b, le.a.c),
               ld.a().a(le.c, $$0).a(le.b, le.a.c).a(le.a, le.a.b),
               ld.a().a(le.c, $$0).a(le.b, le.a.c).a(le.a, le.a.c),
               ld.a().a(le.c, $$0).a(le.b, le.a.c).a(le.a, le.a.d),
               ld.a().a(le.c, $$0).a(le.b, le.a.d),
               ld.a().a(le.c, $$0).a(le.b, le.a.d).a(le.a, le.a.b),
               ld.a().a(le.c, $$0).a(le.b, le.a.d).a(le.a, le.a.c),
               ld.a().a(le.c, $$0).a(le.b, le.a.d).a(le.a, le.a.d)
            )
         );
   }

   private void Z() {
      aex $$0 = li.a(csw.kO);
      aex $$1 = li.a(csw.kO, "_on");
      this.b.accept(la.a(csw.kO).a(a(dfz.w, $$1, $$0)).a(e()));
   }

   private void aa() {
      ll $$0 = new ll().a(lm.e, ll.a(csw.by, "_bottom")).a(lm.i, ll.a(csw.by, "_side"));
      aex $$1 = ll.a(csw.by, "_top_sticky");
      aex $$2 = ll.a(csw.by, "_top");
      ll $$3 = $$0.c(lm.E, $$1);
      ll $$4 = $$0.c(lm.E, $$2);
      aex $$5 = li.a(csw.by, "_base");
      this.a(csw.by, $$5, $$4);
      this.a(csw.br, $$5, $$3);
      aex $$6 = lk.m.a(csw.by, "_inventory", $$0.c(lm.f, $$2), this.c);
      aex $$7 = lk.m.a(csw.br, "_inventory", $$0.c(lm.f, $$1), this.c);
      this.a(csw.by, $$6);
      this.a(csw.br, $$7);
   }

   private void a(csv $$0, aex $$1, ll $$2) {
      aex $$3 = lk.bf.a($$0, $$2, this.c);
      this.b.accept(la.a($$0).a(a(dfz.g, $$1, $$3)).a(e()));
   }

   private void ab() {
      ll $$0 = new ll().a(lm.F, ll.a(csw.by, "_top")).a(lm.i, ll.a(csw.by, "_side"));
      ll $$1 = $$0.c(lm.E, ll.a(csw.by, "_top_sticky"));
      ll $$2 = $$0.c(lm.E, ll.a(csw.by, "_top"));
      this.b
         .accept(
            la.a(csw.bz)
               .a(
                  lb.a(dfz.x, dfz.bg)
                     .a(false, dgl.a, ld.a().a(le.c, lk.bg.a(csw.by, "_head", $$2, this.c)))
                     .a(false, dgl.b, ld.a().a(le.c, lk.bg.a(csw.by, "_head_sticky", $$1, this.c)))
                     .a(true, dgl.a, ld.a().a(le.c, lk.bh.a(csw.by, "_head_short", $$2, this.c)))
                     .a(true, dgl.b, ld.a().a(le.c, lk.bh.a(csw.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ac() {
      aex $$0 = li.a(csw.qD, "_inactive");
      aex $$1 = li.a(csw.qD, "_active");
      this.a(csw.qD, $$0);
      this.b.accept(la.a(csw.qD).a(lb.a(dfz.bo).a($$2 -> ld.a().a(le.c, $$2 != dgq.b && $$2 != dgq.c ? $$0 : $$1))));
   }

   private void ad() {
      aex $$0 = li.a(csw.qE, "_inactive");
      aex $$1 = li.a(csw.qE, "_active");
      this.a(csw.qE, $$0);
      this.b.accept(la.a(csw.qE).a(lb.a(dfz.bo).a($$2 -> ld.a().a(le.c, $$2 != dgq.b && $$2 != dgq.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      aex $$0 = lk.bK.a(csw.qI, ll.a(false), this.c);
      aex $$1 = lk.bK.a(csw.qI, "_can_summon", ll.a(true), this.c);
      this.a(csw.qI, $$0);
      this.b.accept(la.a(csw.qI).a(a(dfz.G, $$1, $$0)));
   }

   private void af() {
      aex $$0 = li.a(csw.nS, "_stable");
      aex $$1 = li.a(csw.nS, "_unstable");
      this.a(csw.nS, $$0);
      this.b.accept(la.a(csw.nS).a(a(dfz.b, $$1, $$0)));
   }

   private void ag() {
      aex $$0 = this.a(csw.ru, "", lk.am, ll::c);
      aex $$1 = this.a(csw.ru, "_lit", lk.am, ll::c);
      this.b.accept(la.a(csw.ru).a(a(dfz.D, $$1, $$0)));
      aex $$2 = this.a(csw.rv, "", lk.am, ll::c);
      aex $$3 = this.a(csw.rv, "_lit", lk.am, ll::c);
      this.b.accept(la.a(csw.rv).a(a(dfz.D, $$3, $$2)));
   }

   private void ah() {
      aex $$0 = ln.a.create(csw.fB, this.c);
      aex $$1 = this.a(csw.fB, "_on", lk.c, ll::b);
      this.b.accept(la.a(csw.fB).a(a(dfz.r, $$1, $$0)));
   }

   private void i(csv $$0, csv $$1) {
      ll $$2 = ll.y($$0);
      this.b.accept(c($$0, lk.bd.a($$0, $$2, this.c)));
      this.b.accept(la.a($$1, ld.a().a(le.c, lk.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      ll $$0 = ll.y(csw.dK);
      ll $$1 = ll.i(ll.a(csw.dK, "_off"));
      aex $$2 = lk.bd.a(csw.dK, $$0, this.c);
      aex $$3 = lk.bd.a(csw.dK, "_off", $$1, this.c);
      this.b.accept(la.a(csw.dK).a(a(dfz.r, $$2, $$3)));
      aex $$4 = lk.be.a(csw.dL, $$0, this.c);
      aex $$5 = lk.be.a(csw.dL, "_off", $$1, this.c);
      this.b.accept(la.a(csw.dL).a(a(dfz.r, $$4, $$5)).a(d()));
      this.d(csw.dK);
      this.c(csw.dL);
   }

   private void aj() {
      this.a(cji.lo);
      this.b.accept(la.a(csw.ei).a(lb.a(dfz.aA, dfz.s, dfz.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return ld.a().a(le.c, ll.a(csw.ei, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(cji.cx);
      this.b
         .accept(
            la.a(csw.mV)
               .a(
                  lb.a(dfz.aS, dfz.C)
                     .a(1, false, Arrays.asList(a(li.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(li.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(li.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(li.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(li.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(li.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(li.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(li.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      ll $$0 = ll.a(csw.dN);
      aex $$1 = lk.c.a(csw.dP, $$0, this.c);
      this.b.accept(la.a(csw.dN).a(lb.a(dfz.aF).a($$1x -> ld.a().a(le.c, $$1x < 8 ? li.a(csw.dN, "_height" + $$1x * 2) : $$1))));
      this.a(csw.dN, li.a(csw.dN, "_height2"));
      this.b.accept(c(csw.dP, $$1));
   }

   private void am() {
      this.b.accept(la.a(csw.oc, ld.a().a(le.c, li.a(csw.oc))).a(b()));
   }

   private void an() {
      aex $$0 = ln.a.create(csw.pa, this.c);
      this.a(csw.pa, $$0);
      this.b.accept(la.a(csw.pa).a(lb.a(dfz.bj).a($$0x -> ld.a().a(le.c, this.a(csw.pa, "_" + $$0x.c(), lk.c, ll::b)))));
   }

   private void ao() {
      this.a(cji.vv);
      this.b.accept(la.a(csw.oi).a(lb.a(dfz.as).a($$0 -> ld.a().a(le.c, this.a(csw.oi, "_stage" + $$0, lk.am, ll::c)))));
   }

   private void ap() {
      this.a(cji.oE);
      this.b
         .accept(
            la.a(csw.fI)
               .a(
                  lb.a(dfz.a, dfz.M, dfz.L, dfz.N, dfz.O)
                     .a(false, false, false, false, false, ld.a().a(le.c, li.a(csw.fI, "_ns")))
                     .a(false, true, false, false, false, ld.a().a(le.c, li.a(csw.fI, "_n")).a(le.b, le.a.b))
                     .a(false, false, true, false, false, ld.a().a(le.c, li.a(csw.fI, "_n")))
                     .a(false, false, false, true, false, ld.a().a(le.c, li.a(csw.fI, "_n")).a(le.b, le.a.c))
                     .a(false, false, false, false, true, ld.a().a(le.c, li.a(csw.fI, "_n")).a(le.b, le.a.d))
                     .a(false, true, true, false, false, ld.a().a(le.c, li.a(csw.fI, "_ne")))
                     .a(false, true, false, true, false, ld.a().a(le.c, li.a(csw.fI, "_ne")).a(le.b, le.a.b))
                     .a(false, false, false, true, true, ld.a().a(le.c, li.a(csw.fI, "_ne")).a(le.b, le.a.c))
                     .a(false, false, true, false, true, ld.a().a(le.c, li.a(csw.fI, "_ne")).a(le.b, le.a.d))
                     .a(false, false, true, true, false, ld.a().a(le.c, li.a(csw.fI, "_ns")))
                     .a(false, true, false, false, true, ld.a().a(le.c, li.a(csw.fI, "_ns")).a(le.b, le.a.b))
                     .a(false, true, true, true, false, ld.a().a(le.c, li.a(csw.fI, "_nse")))
                     .a(false, true, false, true, true, ld.a().a(le.c, li.a(csw.fI, "_nse")).a(le.b, le.a.b))
                     .a(false, false, true, true, true, ld.a().a(le.c, li.a(csw.fI, "_nse")).a(le.b, le.a.c))
                     .a(false, true, true, false, true, ld.a().a(le.c, li.a(csw.fI, "_nse")).a(le.b, le.a.d))
                     .a(false, true, true, true, true, ld.a().a(le.c, li.a(csw.fI, "_nsew")))
                     .a(true, false, false, false, false, ld.a().a(le.c, li.a(csw.fI, "_attached_ns")))
                     .a(true, false, true, false, false, ld.a().a(le.c, li.a(csw.fI, "_attached_n")))
                     .a(true, false, false, true, false, ld.a().a(le.c, li.a(csw.fI, "_attached_n")).a(le.b, le.a.c))
                     .a(true, true, false, false, false, ld.a().a(le.c, li.a(csw.fI, "_attached_n")).a(le.b, le.a.b))
                     .a(true, false, false, false, true, ld.a().a(le.c, li.a(csw.fI, "_attached_n")).a(le.b, le.a.d))
                     .a(true, true, true, false, false, ld.a().a(le.c, li.a(csw.fI, "_attached_ne")))
                     .a(true, true, false, true, false, ld.a().a(le.c, li.a(csw.fI, "_attached_ne")).a(le.b, le.a.b))
                     .a(true, false, false, true, true, ld.a().a(le.c, li.a(csw.fI, "_attached_ne")).a(le.b, le.a.c))
                     .a(true, false, true, false, true, ld.a().a(le.c, li.a(csw.fI, "_attached_ne")).a(le.b, le.a.d))
                     .a(true, false, true, true, false, ld.a().a(le.c, li.a(csw.fI, "_attached_ns")))
                     .a(true, true, false, false, true, ld.a().a(le.c, li.a(csw.fI, "_attached_ns")).a(le.b, le.a.b))
                     .a(true, true, true, true, false, ld.a().a(le.c, li.a(csw.fI, "_attached_nse")))
                     .a(true, true, false, true, true, ld.a().a(le.c, li.a(csw.fI, "_attached_nse")).a(le.b, le.a.b))
                     .a(true, false, true, true, true, ld.a().a(le.c, li.a(csw.fI, "_attached_nse")).a(le.b, le.a.c))
                     .a(true, true, true, false, true, ld.a().a(le.c, li.a(csw.fI, "_attached_nse")).a(le.b, le.a.d))
                     .a(true, true, true, true, true, ld.a().a(le.c, li.a(csw.fI, "_attached_nsew")))
               )
         );
   }

   private void aq() {
      this.d(csw.fH);
      this.b.accept(la.a(csw.fH).a(lb.a(dfz.a, dfz.w).a(($$0, $$1) -> ld.a().a(le.c, ll.a(csw.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aex a(int $$0, String $$1, ll $$2) {
      switch ($$0) {
         case 1:
            return lk.bj.a(li.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return lk.bk.a(li.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return lk.bl.a(li.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return lk.bm.a(li.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private aex a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", ll.b(ll.G(csw.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ll.b(ll.a(csw.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ll.b(ll.a(csw.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ar() {
      this.a(cji.jT);
      this.b.accept(la.a(csw.mf).a(lb.a(dfz.aD, dfz.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void as() {
      this.a(cji.jU);
      Function<Integer, aex> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ll $$2 = ll.a($$1);
         return lk.bu.a(csw.mg, $$1, $$2, this.c);
      };
      this.b.accept(la.a(csw.mg).a(lb.a(dad.b).a($$1 -> ld.a().a(le.c, $$0.apply($$1)))));
   }

   private void E(csv $$0) {
      this.d($$0);
      aex $$1 = li.a($$0);
      kz $$2 = kz.a($$0);
      ky.c $$3 = ac.a(ky.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dga, Function<aex, ld>> $$4 : a) {
         dga $$5 = (dga)$$4.getFirst();
         Function<aex, ld> $$6 = (Function<aex, ld>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(ky.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void at() {
      aex $$0 = ll.a(csw.qH, "_bottom");
      ll $$1 = new ll().a(lm.e, $$0).a(lm.f, ll.a(csw.qH, "_top")).a(lm.i, ll.a(csw.qH, "_side"));
      ll $$2 = new ll().a(lm.e, $$0).a(lm.f, ll.a(csw.qH, "_top_bloom")).a(lm.i, ll.a(csw.qH, "_side_bloom"));
      aex $$3 = lk.m.a(csw.qH, "", $$1, this.c);
      aex $$4 = lk.m.a(csw.qH, "_bloom", $$2, this.c);
      this.b.accept(la.a(csw.qH).a(lb.a(dfz.E).a($$2x -> ld.a().a(le.c, $$2x ? $$4 : $$3))));
      this.a(cji.fN, $$3);
   }

   private void au() {
      csv $$0 = csw.cm;
      aex $$1 = li.a($$0);
      kz $$2 = kz.a($$0);
      Map.of(hc.c, le.a.a, hc.f, le.a.b, hc.d, le.a.c, hc.e, le.a.d).forEach(($$2x, $$3) -> {
         ky.c $$4 = ky.a().a(dfz.R, $$2x);
         $$2.a($$4, ld.a().a(le.c, $$1).a(le.b, $$3).a(le.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, li.a($$0, "_inventory"));
      i.clear();
   }

   private void a(kz $$0, ky.c $$1, le.a $$2) {
      Map.of(dfz.bp, lk.aK, dfz.bq, lk.aL, dfz.br, lk.aM, dfz.bs, lk.aN, dfz.bt, lk.aO, dfz.bu, lk.aP).forEach(($$3, $$4) -> {
         this.a($$0, $$1, $$2, $$3, $$4, true);
         this.a($$0, $$1, $$2, $$3, $$4, false);
      });
   }

   private void a(kz $$0, ky.c $$1, le.a $$2, dga $$3, lj $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ll $$7 = new ll().a(lm.b, ll.a(csw.cm, $$6));
      ku.d $$8 = new ku.d($$4, $$6);
      aex $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(csw.cm, $$6, $$7, this.c));
      $$0.a(ky.a($$1, ky.a().a($$3, $$5)), ld.a().a(le.c, $$9).a(le.b, $$2));
   }

   private void av() {
      this.b.accept(c(csw.kJ, lk.c.a(csw.kJ, ll.b(li.a("magma")), this.c)));
   }

   private void F(csv $$0) {
      this.b($$0, ln.p);
      lk.bB.a(li.a($$0.k()), ll.u($$0), this.c);
   }

   private void b(csv $$0, csv $$1, ku.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(csv $$0, csv $$1) {
      lk.bC.a(li.a($$0.k()), ll.u($$1), this.c);
   }

   private void aw() {
      aex $$0 = li.a(csw.b);
      aex $$1 = li.a(csw.b, "_mirrored");
      this.b.accept(a(csw.eO, $$0, $$1));
      this.a(csw.eO, $$0);
   }

   private void ax() {
      aex $$0 = li.a(csw.rI);
      aex $$1 = li.a(csw.rI, "_mirrored");
      this.b.accept(a(csw.sc, $$0, $$1).a(f()));
      this.a(csw.sc, $$0);
   }

   private void k(csv $$0, csv $$1) {
      this.a($$0, ku.e.b);
      ll $$2 = ll.d(ll.a($$0, "_pot"));
      aex $$3 = ku.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void ay() {
      aex $$0 = ll.a(csw.pl, "_bottom");
      aex $$1 = ll.a(csw.pl, "_top_off");
      aex $$2 = ll.a(csw.pl, "_top");
      aex[] $$3 = new aex[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ll $$5 = new ll().a(lm.e, $$0).a(lm.f, $$4 == 0 ? $$1 : $$2).a(lm.i, ll.a(csw.pl, "_side" + $$4));
         $$3[$$4] = lk.m.a(csw.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(la.a(csw.pl).a(lb.a(dfz.aZ).a($$1x -> ld.a().a(le.c, $$3[$$1x]))));
      this.a(cji.vT, $$3[0]);
   }

   private ld a(he $$0, ld $$1) {
      switch ($$0) {
         case b:
            return $$1.a(le.a, le.a.b);
         case c:
            return $$1.a(le.a, le.a.b).a(le.b, le.a.c);
         case d:
            return $$1.a(le.a, le.a.b).a(le.b, le.a.d);
         case a:
            return $$1.a(le.a, le.a.b).a(le.b, le.a.b);
         case f:
            return $$1.a(le.a, le.a.d).a(le.b, le.a.c);
         case g:
            return $$1.a(le.a, le.a.d);
         case h:
            return $$1.a(le.a, le.a.d).a(le.b, le.a.b);
         case e:
            return $$1.a(le.a, le.a.d).a(le.b, le.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(le.b, le.a.c);
         case i:
            return $$1.a(le.b, le.a.d);
         case j:
            return $$1.a(le.b, le.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void az() {
      aex $$0 = ll.a(csw.pb, "_top");
      aex $$1 = ll.a(csw.pb, "_bottom");
      aex $$2 = ll.a(csw.pb, "_side");
      aex $$3 = ll.a(csw.pb, "_lock");
      ll $$4 = new ll().a(lm.o, $$2).a(lm.m, $$2).a(lm.l, $$2).a(lm.c, $$0).a(lm.j, $$0).a(lm.k, $$1).a(lm.n, $$3);
      aex $$5 = lk.b.a(csw.pb, $$4, this.c);
      this.b.accept(la.a(csw.pb, ld.a().a(le.c, $$5)).a(lb.a(dfz.T).a($$0x -> this.a($$0x, ld.a()))));
   }

   private void aA() {
      csv $$0 = csw.n;
      aex $$1 = li.a($$0);
      ln $$2 = ln.a.get($$0);
      csv $$3 = csw.jH;
      aex $$4 = lk.Z.a($$3, $$2.b(), this.c);
      aex $$5 = lk.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      jg.a().filter(jh::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(csw.qS).a(jg.w).a(csw.ri).a(jg.y);
      this.h(csw.qR).a(jg.A).a(csw.rh).a(jg.C);
      this.h(csw.qQ).a(jg.E).a(csw.rg).a(jg.G);
      this.h(csw.qP).a(jg.I).a(csw.rf).a(jg.K);
      this.m(csw.a);
      this.a(csw.nc, csw.a);
      this.a(csw.nb, csw.a);
      this.m(csw.fO);
      this.m(csw.dQ);
      this.a(csw.nd, csw.G);
      this.m(csw.fA);
      this.m(csw.me);
      this.m(csw.fr);
      this.m(csw.fR);
      this.a(cji.tk);
      this.m(csw.pg);
      this.m(csw.G);
      this.m(csw.H);
      this.m(csw.hV);
      this.a(cji.fw);
      this.l(csw.pM, csw.qd);
      this.l(csw.pN, csw.qe);
      this.l(csw.pO, csw.qf);
      this.l(csw.pP, csw.qg);
      this.l(csw.pQ, csw.qh);
      this.l(csw.pR, csw.qi);
      this.l(csw.pS, csw.qj);
      this.l(csw.pT, csw.qk);
      this.l(csw.pU, csw.ql);
      this.l(csw.pV, csw.qm);
      this.l(csw.pW, csw.qn);
      this.l(csw.pX, csw.qo);
      this.l(csw.pY, csw.qp);
      this.l(csw.pZ, csw.qq);
      this.l(csw.qa, csw.qr);
      this.l(csw.qb, csw.qs);
      this.l(csw.pL, csw.qc);
      this.m(csw.na);
      this.m(csw.gs);
      this.m(csw.qC);
      this.m(csw.rw);
      this.s(csw.rx);
      this.s(csw.ry);
      this.t(csw.sh);
      this.t(csw.si);
      this.ag();
      this.e(csw.rB, csw.rz);
      this.p(csw.rA);
      this.a(csw.hW, cji.hf);
      this.a(cji.hf);
      this.aB();
      this.a(csw.kN, cji.iF);
      this.a(cji.iF);
      this.f(csw.bQ, ll.a(csw.by, "_side"));
      this.a(csw.R);
      this.a(csw.S);
      this.a(csw.iB);
      this.a(csw.cx);
      this.a(csw.cy);
      this.a(csw.cz);
      this.a(csw.fE);
      this.a(csw.fF);
      this.a(csw.fJ);
      this.a(csw.N);
      this.a(csw.T);
      this.a(csw.O);
      this.a(csw.ch);
      this.a(csw.P);
      this.a(csw.Q);
      this.a(csw.ci);
      this.b(csw.pj, ln.c);
      this.a(csw.pi);
      this.a(csw.aR);
      this.a(csw.aS);
      this.a(csw.aT);
      this.a(csw.hb);
      this.a(csw.dI);
      this.a(csw.dJ);
      this.a(csw.ha);
      this.a(csw.pC);
      this.a(csw.mW);
      this.a(csw.dR);
      this.a(csw.k);
      this.a(csw.pk);
      this.a(csw.fz);
      this.a(csw.ed);
      this.a(csw.L);
      this.a(csw.ph);
      this.a(csw.dO);
      this.b(csw.dT, ln.f);
      this.b(csw.pq, ln.c);
      this.b(csw.fa, ln.c);
      this.m(csw.ac);
      this.m(csw.ga);
      this.a(csw.kK);
      this.a(csw.aY);
      this.a(csw.iC);
      this.a(csw.co);
      this.a(csw.pK);
      this.a(csw.ii);
      this.a(csw.oy);
      this.a(csw.dX);
      this.a(csw.dY);
      this.a(csw.ct);
      this.a(csw.aO);
      this.b(csw.bw, ln.u);
      this.a(cji.cw);
      this.b(csw.ck, ln.e);
      this.b(csw.pd, ln.c);
      this.a(csw.op);
      this.a(csw.aP);
      this.a(csw.qt);
      this.a(csw.qu);
      this.a(csw.qA);
      this.a(csw.qz);
      this.a(csw.rt);
      this.a(csw.se);
      this.a(csw.sf);
      this.a(csw.sg);
      this.e(csw.qF);
      this.aA();
      this.a(csw.qN);
      this.a(csw.qO);
      this.a(csw.qM);
      this.a(csw.qL);
      this.a(csw.qK);
      this.a(csw.qJ);
      this.h(csw.qM, csw.rb);
      this.h(csw.qL, csw.rd);
      this.h(csw.qK, csw.rc);
      this.h(csw.qJ, csw.re);
      this.g(csw.gW, csw.ch);
      this.g(csw.gX, csw.ci);
      this.F();
      this.r();
      this.au();
      this.v();
      this.w();
      this.a(csw.og, csw.oh);
      this.x();
      this.A();
      this.B();
      this.D();
      this.E();
      this.H();
      this.C();
      this.y(csw.kt);
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
      this.E(csw.ff);
      this.E(csw.fg);
      this.E(csw.qG);
      this.av();
      this.az();
      this.ac();
      this.ad();
      this.ae();
      this.W();
      this.N();
      this.M();
      this.D(csw.cO);
      this.d(csw.cO);
      this.D(csw.oa);
      this.g();
      this.D(csw.rD);
      this.i(csw.cp, csw.cq);
      this.i(csw.eb, csw.ec);
      this.a(csw.cA, csw.n, ll::c);
      this.a(csw.nY, csw.p, ll::d);
      this.x(csw.ow);
      this.x(csw.on);
      this.v(csw.aU);
      this.v(csw.hi);
      this.C(csw.oe);
      this.C(csw.of);
      this.e(csw.eY, li.a(csw.eY));
      this.a(csw.dZ, ln.c);
      this.a(csw.ea, ln.c);
      this.a(csw.sd);
      this.a(csw.kM, ln.c);
      this.f(csw.j);
      this.f(csw.rG);
      this.f(csw.I);
      this.g(csw.J);
      this.g(csw.M);
      this.f(csw.K);
      this.e(csw.F);
      this.b(csw.sn, ln.e);
      this.a(csw.ij, ln.c, ln.d);
      this.a(csw.kx, ln.v, ln.w);
      this.a(csw.hf, ln.v, ln.w);
      this.a(csw.sj, ln.c, ln.d);
      this.a(csw.sk, ln.c, ln.d);
      this.a(csw.sl, ln.c, ln.d);
      this.c(csw.nT, ln.h);
      this.z();
      this.a(csw.pe, ll::A);
      this.a(csw.pf, ll::C);
      this.a(csw.kD, dfz.as, 0, 1, 2, 3);
      this.a(csw.gt, dfz.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csw.fq, dfz.as, 0, 1, 1, 2);
      this.a(csw.gu, dfz.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csw.cB, dfz.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(csw.kA, ku.e.b, dfz.aq, 0, 1);
      this.i();
      this.h();
      this.a(li.a("decorated_pot"), csw.iA).b(csw.so);
      this.a(li.a("banner"), csw.n)
         .a(lk.bD, csw.iJ, csw.iK, csw.iL, csw.iM, csw.iN, csw.iO, csw.iP, csw.iQ, csw.iR, csw.iS, csw.iT, csw.iU, csw.iV, csw.iW, csw.iX, csw.iY)
         .b(csw.iZ, csw.ja, csw.jb, csw.jc, csw.jd, csw.je, csw.jf, csw.jg, csw.jh, csw.ji, csw.jj, csw.jk, csw.jl, csw.jm, csw.jn, csw.jo);
      this.a(li.a("bed"), csw.n)
         .b(csw.aZ, csw.ba, csw.bb, csw.bc, csw.bd, csw.be, csw.bf, csw.bg, csw.bh, csw.bi, csw.bj, csw.bk, csw.bl, csw.bm, csw.bn, csw.bo);
      this.j(csw.aZ, csw.bA);
      this.j(csw.ba, csw.bB);
      this.j(csw.bb, csw.bC);
      this.j(csw.bc, csw.bD);
      this.j(csw.bd, csw.bE);
      this.j(csw.be, csw.bF);
      this.j(csw.bf, csw.bG);
      this.j(csw.bg, csw.bH);
      this.j(csw.bh, csw.bI);
      this.j(csw.bi, csw.bJ);
      this.j(csw.bj, csw.bK);
      this.j(csw.bk, csw.bL);
      this.j(csw.bl, csw.bM);
      this.j(csw.bm, csw.bN);
      this.j(csw.bn, csw.bO);
      this.j(csw.bo, csw.bP);
      this.a(li.a("skull"), csw.dX)
         .a(lk.bE, csw.gM, csw.gK, csw.gI, csw.gE, csw.gG, csw.gQ)
         .a(csw.gO)
         .b(csw.gN, csw.gP, csw.gL, csw.gJ, csw.gF, csw.gH, csw.gR);
      this.F(csw.kP);
      this.F(csw.kQ);
      this.F(csw.kR);
      this.F(csw.kS);
      this.F(csw.kT);
      this.F(csw.kU);
      this.F(csw.kV);
      this.F(csw.kW);
      this.F(csw.kX);
      this.F(csw.kY);
      this.F(csw.kZ);
      this.F(csw.la);
      this.F(csw.lb);
      this.F(csw.lc);
      this.F(csw.ld);
      this.F(csw.le);
      this.F(csw.lf);
      this.b(csw.mX, ln.p);
      this.c(csw.mX);
      this.a(li.a("chest"), csw.n).b(csw.cv, csw.gV);
      this.a(li.a("ender_chest"), csw.co).b(csw.fG);
      this.d(csw.fx, csw.co).a(csw.fx, csw.kF);
      this.a(csw.aM);
      this.a(csw.aN);
      this.a(csw.lw);
      this.a(csw.lx);
      this.a(csw.ly);
      this.a(csw.lz);
      this.a(csw.lA);
      this.a(csw.lB);
      this.a(csw.lC);
      this.a(csw.lD);
      this.a(csw.lE);
      this.a(csw.lF);
      this.a(csw.lG);
      this.a(csw.lH);
      this.a(csw.lI);
      this.a(csw.lJ);
      this.a(csw.lK);
      this.a(csw.lL);
      this.a(ln.a, csw.lM, csw.lN, csw.lO, csw.lP, csw.lQ, csw.lR, csw.lS, csw.lT, csw.lU, csw.lV, csw.lW, csw.lX, csw.lY, csw.lZ, csw.ma, csw.mb);
      this.a(csw.iA);
      this.a(csw.hj);
      this.a(csw.hk);
      this.a(csw.hl);
      this.a(csw.hm);
      this.a(csw.hn);
      this.a(csw.ho);
      this.a(csw.hp);
      this.a(csw.hq);
      this.a(csw.hr);
      this.a(csw.hs);
      this.a(csw.ht);
      this.a(csw.hu);
      this.a(csw.hv);
      this.a(csw.hw);
      this.a(csw.hx);
      this.a(csw.hy);
      this.a(csw.qB);
      this.f(csw.aQ, csw.eZ);
      this.f(csw.ej, csw.hz);
      this.f(csw.ek, csw.hA);
      this.f(csw.el, csw.hB);
      this.f(csw.em, csw.hC);
      this.f(csw.en, csw.hD);
      this.f(csw.eo, csw.hE);
      this.f(csw.ep, csw.hF);
      this.f(csw.eq, csw.hG);
      this.f(csw.er, csw.hH);
      this.f(csw.es, csw.hI);
      this.f(csw.et, csw.hJ);
      this.f(csw.eu, csw.hK);
      this.f(csw.ev, csw.hL);
      this.f(csw.ew, csw.hM);
      this.f(csw.ex, csw.hN);
      this.f(csw.ey, csw.hO);
      this.b(ln.n, csw.lg, csw.lh, csw.li, csw.lj, csw.lk, csw.ll, csw.lm, csw.ln, csw.lo, csw.lp, csw.lq, csw.lr, csw.ls, csw.lt, csw.lu, csw.lv);
      this.e(csw.bA, csw.ik);
      this.e(csw.bB, csw.il);
      this.e(csw.bC, csw.im);
      this.e(csw.bD, csw.in);
      this.e(csw.bE, csw.io);
      this.e(csw.bF, csw.ip);
      this.e(csw.bG, csw.iq);
      this.e(csw.bH, csw.ir);
      this.e(csw.bI, csw.is);
      this.e(csw.bJ, csw.it);
      this.e(csw.bK, csw.iu);
      this.e(csw.bL, csw.iv);
      this.e(csw.bM, csw.iw);
      this.e(csw.bN, csw.ix);
      this.e(csw.bO, csw.iy);
      this.e(csw.bP, csw.iz);
      this.a(csw.rH);
      this.a(csw.eM);
      this.a(csw.bu, csw.gb, ku.e.a);
      this.a(csw.bR, csw.gc, ku.e.b);
      this.a(csw.bT, csw.gd, ku.e.b);
      this.a(csw.bU, csw.ge, ku.e.b);
      this.a(csw.bV, csw.gf, ku.e.b);
      this.a(csw.bW, csw.gg, ku.e.b);
      this.a(csw.bX, csw.gh, ku.e.b);
      this.a(csw.bY, csw.gi, ku.e.b);
      this.a(csw.bZ, csw.gj, ku.e.b);
      this.a(csw.ca, csw.gk, ku.e.b);
      this.a(csw.cb, csw.gl, ku.e.b);
      this.a(csw.cc, csw.gm, ku.e.b);
      this.a(csw.ce, csw.gn, ku.e.b);
      this.a(csw.cd, csw.go, ku.e.b);
      this.a(csw.cg, csw.gp, ku.e.b);
      this.a(csw.cf, csw.gq, ku.e.b);
      this.a(csw.bv, csw.gr, ku.e.b);
      this.a(csw.bS, csw.fS, ku.e.b);
      this.G();
      this.u(csw.eU);
      this.u(csw.eV);
      this.u(csw.eW);
      this.a(csw.bt, ku.e.a);
      this.b(csw.dS, ku.e.a);
      this.a(cji.dn);
      this.b(csw.mc, csw.md, ku.e.b);
      this.a(cji.do);
      this.c(csw.md);
      this.b(csw.rF, ku.e.b);
      this.c(csw.rF);
      this.c(csw.rv);
      this.b(csw.oz, csw.oA, ku.e.b);
      this.b(csw.oB, csw.oC, ku.e.b);
      this.a(csw.oz, "_plant");
      this.c(csw.oA);
      this.a(csw.oB, "_plant");
      this.c(csw.oC);
      this.a(csw.mY, ku.e.a, ll.c(ll.a(csw.mZ, "_stage0")));
      this.m();
      this.a(csw.bs, ku.e.b);
      this.c(csw.iE, ku.e.b);
      this.c(csw.iF, ku.e.b);
      this.c(csw.iG, ku.e.b);
      this.c(csw.iH, ku.e.a);
      this.c(csw.iI, ku.e.a);
      this.j();
      this.k();
      this.l();
      this.a(csw.mw, csw.mr, csw.mm, csw.mh, csw.mG, csw.mB, csw.mQ, csw.mL);
      this.a(csw.mx, csw.ms, csw.mn, csw.mi, csw.mH, csw.mC, csw.mR, csw.mM);
      this.a(csw.my, csw.mt, csw.mo, csw.mj, csw.mI, csw.mD, csw.mS, csw.mN);
      this.a(csw.mz, csw.mu, csw.mp, csw.mk, csw.mJ, csw.mE, csw.mT, csw.mO);
      this.a(csw.mA, csw.mv, csw.mq, csw.ml, csw.mK, csw.mF, csw.mU, csw.mP);
      this.c(csw.fe, csw.fc);
      this.c(csw.fd, csw.fb);
      this.l(csw.ab).c(csw.ab).a(csw.av);
      this.l(csw.am).c(csw.am).a(csw.aD);
      this.a(csw.am, csw.dj, csw.ds);
      this.b(csw.aL, ln.r);
      this.l(csw.Y).c(csw.Y).a(csw.as);
      this.l(csw.ai).c(csw.ai).a(csw.aA);
      this.a(csw.ai, csw.dd, csw.do);
      this.a(csw.B, csw.fX, ku.e.b);
      this.b(csw.aI, ln.r);
      this.l(csw.Z).d(csw.Z).a(csw.at);
      this.l(csw.aj).d(csw.aj).a(csw.aB);
      this.a(csw.aj, csw.de, csw.dp);
      this.a(csw.C, csw.fY, ku.e.b);
      this.b(csw.aJ, ln.r);
      this.l(csw.W).c(csw.W).a(csw.aq);
      this.l(csw.ag).c(csw.ag).a(csw.ay);
      this.a(csw.ag, csw.dc, csw.dn);
      this.a(csw.z, csw.fV, ku.e.b);
      this.b(csw.aG, ln.r);
      this.l(csw.U).c(csw.U).a(csw.ao);
      this.l(csw.al).c(csw.al).a(csw.aw);
      this.a(csw.al, csw.da, csw.dl);
      this.a(csw.x, csw.fT, ku.e.b);
      this.b(csw.aE, ln.r);
      this.l(csw.V).c(csw.V).a(csw.ap);
      this.l(csw.af).c(csw.af).a(csw.ax);
      this.a(csw.af, csw.db, csw.dm);
      this.a(csw.y, csw.fU, ku.e.b);
      this.b(csw.aF, ln.r);
      this.l(csw.aa).c(csw.aa).a(csw.au);
      this.l(csw.ak).c(csw.ak).a(csw.aC);
      this.a(csw.ak, csw.dg, csw.dr);
      this.a(csw.D, csw.fZ, ku.e.b);
      this.b(csw.aK, ln.r);
      this.l(csw.X).c(csw.X).a(csw.ar);
      this.l(csw.ah).c(csw.ah).a(csw.az);
      this.a(csw.ah, csw.df, csw.dq);
      this.a(csw.A, csw.fW, ku.e.b);
      this.b(csw.aH, ln.r);
      this.l(csw.os).b(csw.os).a(csw.ou);
      this.l(csw.ot).b(csw.ot).a(csw.ov);
      this.a(csw.ot, csw.dh, csw.dt);
      this.a(csw.ox, csw.pm, ku.e.b);
      this.k(csw.oD, csw.po);
      this.l(csw.oj).b(csw.oj).a(csw.ol);
      this.l(csw.ok).b(csw.ok).a(csw.om);
      this.a(csw.ok, csw.di, csw.du);
      this.a(csw.oo, csw.pn, ku.e.b);
      this.k(csw.oq, csw.pp);
      this.l(csw.ae).d(csw.ae);
      this.l(csw.an).d(csw.an);
      this.a(csw.v, csw.dk, csw.dv);
      this.b(csw.or, ku.e.b);
      this.a(cji.dk);
      this.i(csw.dy);
      this.k(csw.hY);
      this.u();
      this.n(csw.cP);
      this.o(csw.bp);
      this.o(csw.bq);
      this.o(csw.hh);
      this.t();
      this.q(csw.fN);
      this.q(csw.kG);
      this.q(csw.kH);
      this.r(csw.gS);
      this.r(csw.gT);
      this.r(csw.gU);
      this.o();
      this.p();
      this.d(csw.cD, ln.g);
      this.d(csw.nW, ln.g);
      this.d(csw.nV, ln.h);
      this.s();
      this.ay();
      this.at();
      this.h(csw.eL, csw.eT);
      this.h(csw.m, csw.eP);
      this.h(csw.eK, csw.eS);
      this.h(csw.eJ, csw.eR);
      this.aw();
      this.h(csw.eI, csw.eQ);
      this.ax();
      ckk.h().forEach($$0 -> this.a($$0, li.b("template_spawn_egg")));
   }

   private void aB() {
      this.c(csw.hX);
      lb.a<Integer> $$0 = lb.a(dfz.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aex $$3 = ll.a(cji.hg, $$2);
         $$0.a($$1, ld.a().a(le.c, lk.Y.a(csw.hX, $$2, ll.h($$3), this.c)));
         lk.bv.a(li.a(cji.hg, $$2), ll.k($$3), this.c);
      }

      this.b.accept(la.a(csw.hX).a($$0));
   }

   private void l(csv $$0, csv $$1) {
      this.a($$0.k());
      ll $$2 = ll.b(ll.G($$0));
      ll $$3 = ll.b(ll.a($$0, "_lit"));
      aex $$4 = lk.bF.a($$0, "_one_candle", $$2, this.c);
      aex $$5 = lk.bG.a($$0, "_two_candles", $$2, this.c);
      aex $$6 = lk.bH.a($$0, "_three_candles", $$2, this.c);
      aex $$7 = lk.bI.a($$0, "_four_candles", $$2, this.c);
      aex $$8 = lk.bF.a($$0, "_one_candle_lit", $$3, this.c);
      aex $$9 = lk.bG.a($$0, "_two_candles_lit", $$3, this.c);
      aex $$10 = lk.bH.a($$0, "_three_candles_lit", $$3, this.c);
      aex $$11 = lk.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            la.a($$0)
               .a(
                  lb.a(dfz.az, dfz.r)
                     .a(1, false, ld.a().a(le.c, $$4))
                     .a(2, false, ld.a().a(le.c, $$5))
                     .a(3, false, ld.a().a(le.c, $$6))
                     .a(4, false, ld.a().a(le.c, $$7))
                     .a(1, true, ld.a().a(le.c, $$8))
                     .a(2, true, ld.a().a(le.c, $$9))
                     .a(3, true, ld.a().a(le.c, $$10))
                     .a(4, true, ld.a().a(le.c, $$11))
               )
         );
      aex $$12 = lk.bJ.a($$1, ll.a($$0, false), this.c);
      aex $$13 = lk.bJ.a($$1, "_lit", ll.a($$0, true), this.c);
      this.b.accept(la.a($$1).a(a(dfz.r, $$13, $$12)));
   }

   class a {
      private final aex b;

      public a(aex $$0, csv $$1) {
         this.b = lk.Y.a($$0, ll.u($$1), ku.this.c);
      }

      public ku.a a(csv... $$0) {
         for (csv $$1 : $$0) {
            ku.this.b.accept(ku.c($$1, this.b));
         }

         return this;
      }

      public ku.a b(csv... $$0) {
         for (csv $$1 : $$0) {
            ku.this.c($$1);
         }

         return this.a($$0);
      }

      public ku.a a(lj $$0, csv... $$1) {
         for (csv $$2 : $$1) {
            $$0.a(li.a($$2.k()), ll.u($$2), ku.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final ll b;
      private final Map<lj, aex> c = Maps.newHashMap();
      @Nullable
      private jh d;
      @Nullable
      private aex e;

      public b(ll $$0) {
         this.b = $$0;
      }

      public ku.b a(csv $$0, lj $$1) {
         this.e = $$1.a($$0, this.b, ku.this.c);
         if (ku.this.f.containsKey($$0)) {
            ku.this.b.accept(ku.this.f.get($$0).create($$0, this.e, this.b, ku.this.c));
         } else {
            ku.this.b.accept(ku.c($$0, this.e));
         }

         return this;
      }

      public ku.b a(csv... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (csv $$1 : $$0) {
               ku.this.b.accept(ku.c($$1, this.e));
               ku.this.a($$1, this.e);
            }

            return this;
         }
      }

      public ku.b a(csv $$0) {
         aex $$1 = lk.q.a($$0, this.b, ku.this.c);
         aex $$2 = lk.r.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.b($$0, $$1, $$2));
         aex $$3 = lk.s.a($$0, this.b, ku.this.c);
         ku.this.a($$0, $$3);
         return this;
      }

      public ku.b b(csv $$0) {
         aex $$1 = lk.K.a($$0, this.b, ku.this.c);
         aex $$2 = lk.L.a($$0, this.b, ku.this.c);
         aex $$3 = lk.M.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.a($$0, $$1, $$2, $$3));
         aex $$4 = lk.N.a($$0, this.b, ku.this.c);
         ku.this.a($$0, $$4);
         return this;
      }

      public ku.b c(csv $$0) {
         ll $$1 = ll.p($$0);
         aex $$2 = lk.B.a($$0, $$1, ku.this.c);
         aex $$3 = lk.C.a($$0, $$1, ku.this.c);
         aex $$4 = lk.D.a($$0, $$1, ku.this.c);
         aex $$5 = lk.E.a($$0, $$1, ku.this.c);
         aex $$6 = lk.F.a($$0, $$1, ku.this.c);
         ku.this.b.accept(ku.a($$0, $$2, $$3, $$4, $$5, $$6));
         aex $$7 = lk.G.a($$0, $$1, ku.this.c);
         ku.this.a($$0, $$7);
         return this;
      }

      public ku.b d(csv $$0) {
         aex $$1 = lk.H.a($$0, this.b, ku.this.c);
         aex $$2 = lk.I.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.c($$0, $$1, $$2));
         aex $$3 = lk.J.a($$0, this.b, ku.this.c);
         ku.this.a($$0, $$3);
         return this;
      }

      public ku.b e(csv $$0) {
         ll $$1 = ll.p($$0);
         aex $$2 = lk.P.a($$0, $$1, ku.this.c);
         aex $$3 = lk.O.a($$0, $$1, ku.this.c);
         aex $$4 = lk.R.a($$0, $$1, ku.this.c);
         aex $$5 = lk.Q.a($$0, $$1, ku.this.c);
         ku.this.b.accept(ku.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ku.b f(csv $$0) {
         aex $$1 = lk.T.a($$0, this.b, ku.this.c);
         aex $$2 = lk.S.a($$0, this.b, ku.this.c);
         aex $$3 = lk.V.a($$0, this.b, ku.this.c);
         aex $$4 = lk.U.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ku.b g(csv $$0) {
         aex $$1 = lk.W.a($$0, this.b, ku.this.c);
         aex $$2 = lk.X.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.e($$0, $$1, $$2));
         return this;
      }

      public ku.b h(csv $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            csv $$1 = this.d.b().get(jh.b.r);
            aex $$2 = lk.Y.a($$0, this.b, ku.this.c);
            ku.this.b.accept(ku.c($$0, $$2));
            ku.this.b.accept(ku.c($$1, $$2));
            ku.this.a($$0.k());
            ku.this.c($$1);
            return this;
         }
      }

      public ku.b i(csv $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aex $$1 = this.a(lk.Z, $$0);
            aex $$2 = this.a(lk.aa, $$0);
            ku.this.b.accept(ku.e($$0, $$1, $$2, this.e));
            ku.this.a($$0, $$1);
            return this;
         }
      }

      public ku.b j(csv $$0) {
         aex $$1 = this.a(lk.ad, $$0);
         aex $$2 = this.a(lk.ac, $$0);
         aex $$3 = this.a(lk.ae, $$0);
         ku.this.b.accept(ku.b($$0, $$1, $$2, $$3));
         ku.this.a($$0, $$2);
         return this;
      }

      private ku.b k(csv $$0) {
         ln $$1 = ku.this.g.getOrDefault($$0, ln.a.get($$0));
         ku.this.b.accept(ku.c($$0, $$1.a($$0, ku.this.c)));
         return this;
      }

      private ku.b l(csv $$0) {
         ku.this.i($$0);
         return this;
      }

      private void m(csv $$0) {
         if (ku.this.e.contains($$0)) {
            ku.this.k($$0);
         } else {
            ku.this.j($$0);
         }
      }

      private aex a(lj $$0, csv $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ku.this.c));
      }

      public ku.b a(jh $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<ku.b, csv> $$2 = ku.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      kx create(csv var1, aex var2, ll var3, BiConsumer<aex, Supplier<JsonElement>> var4);
   }

   static record d(lj a, String b) {
   }

   static enum e {
      a,
      b;

      public lj a() {
         return this == a ? lk.an : lk.am;
      }

      public lj b() {
         return this == a ? lk.ap : lk.ao;
      }
   }

   class f {
      private final ll b;

      public f(ll $$0) {
         this.b = $$0;
      }

      public ku.f a(csv $$0) {
         ll $$1 = this.b.c(lm.d, this.b.a(lm.i));
         aex $$2 = lk.i.a($$0, $$1, ku.this.c);
         ku.this.b.accept(ku.d($$0, $$2));
         return this;
      }

      public ku.f b(csv $$0) {
         aex $$1 = lk.i.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.d($$0, $$1));
         return this;
      }

      public ku.f c(csv $$0) {
         aex $$1 = lk.i.a($$0, this.b, ku.this.c);
         aex $$2 = lk.j.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.d($$0, $$1, $$2));
         return this;
      }

      public ku.f d(csv $$0) {
         ku.this.b.accept(ku.a($$0, this.b, ku.this.c));
         return this;
      }
   }
}
