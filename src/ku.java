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
   final BiConsumer<aey, Supplier<JsonElement>> c;
   private final Consumer<cjc> d;
   final List<csx> e = ImmutableList.of(csy.ez, csy.eF, csy.hY);
   final Map<csx, ku.c> f = ImmutableMap.builder().put(csy.b, ku::a).put(csy.rI, ku::c).put(csy.eN, ku::b).build();
   final Map<csx, ln> g = ImmutableMap.builder()
      .put(csy.aV, ln.x.get(csy.aV))
      .put(csy.jp, ln.x.get(csy.jp))
      .put(csy.jS, ln.a(ll.a(csy.aV, "_top")))
      .put(csy.jU, ln.a(ll.a(csy.jp, "_top")))
      .put(csy.aX, ln.c.get(csy.aV).a($$0x -> $$0x.a(lm.i, ll.G(csy.aX))))
      .put(csy.jr, ln.c.get(csy.jp).a($$0x -> $$0x.a(lm.i, ll.G(csy.jr))))
      .put(csy.hd, ln.c.get(csy.hd))
      .put(csy.jT, ln.a(ll.a(csy.hd, "_bottom")))
      .put(csy.pr, ln.y.get(csy.pr))
      .put(csy.rI, ln.y.get(csy.rI))
      .put(csy.he, ln.c.get(csy.he).a($$0x -> $$0x.a(lm.i, ll.G(csy.he))))
      .put(csy.aW, ln.c.get(csy.aW).a($$0x -> {
         $$0x.a(lm.d, ll.a(csy.aV, "_top"));
         $$0x.a(lm.i, ll.G(csy.aW));
      }))
      .put(csy.jq, ln.c.get(csy.jq).a($$0x -> {
         $$0x.a(lm.d, ll.a(csy.jp, "_top"));
         $$0x.a(lm.i, ll.G(csy.jq));
      }))
      .build();
   static final Map<jh.b, BiConsumer<ku.b, csx>> h = ImmutableMap.builder()
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
   public static final List<Pair<dgc, Function<aey, ld>>> a = List.of(
      Pair.of(dgb.L, (Function<aey, ld>)$$0 -> ld.a().a(le.c, $$0)),
      Pair.of(dgb.M, (Function<aey, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.b, le.a.b).a(le.d, true)),
      Pair.of(dgb.N, (Function<aey, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.b, le.a.c).a(le.d, true)),
      Pair.of(dgb.O, (Function<aey, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.b, le.a.d).a(le.d, true)),
      Pair.of(dgb.J, (Function<aey, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.a, le.a.d).a(le.d, true)),
      Pair.of(dgb.K, (Function<aey, ld>)$$0 -> ld.a().a(le.c, $$0).a(le.a, le.a.b).a(le.d, true))
   );
   private static final Map<ku.d, aey> i = new HashMap<>();

   private static kx a(csx $$0, aey $$1, ll $$2, BiConsumer<aey, Supplier<JsonElement>> $$3) {
      aey $$4 = lk.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static kx b(csx $$0, aey $$1, ll $$2, BiConsumer<aey, Supplier<JsonElement>> $$3) {
      aey $$4 = lk.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static kx c(csx $$0, aey $$1, ll $$2, BiConsumer<aey, Supplier<JsonElement>> $$3) {
      aey $$4 = lk.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ku(Consumer<kx> $$0, BiConsumer<aey, Supplier<JsonElement>> $$1, Consumer<cjc> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(csx $$0) {
      this.d.accept($$0.k());
   }

   void a(csx $$0, aey $$1) {
      this.c.accept(li.a($$0.k()), new lh($$1));
   }

   private void a(cjc $$0, aey $$1) {
      this.c.accept(li.a($$0), new lh($$1));
   }

   void a(cjc $$0) {
      lk.bv.a(li.a($$0), ll.b($$0), this.c);
   }

   private void d(csx $$0) {
      cjc $$1 = $$0.k();
      if ($$1 != cjk.a) {
         lk.bv.a(li.a($$1), ll.F($$0), this.c);
      }
   }

   private void a(csx $$0, String $$1) {
      cjc $$2 = $$0.k();
      lk.bv.a(li.a($$2), ll.k(ll.a($$0, $$1)), this.c);
   }

   private static lb b() {
      return lb.a(dgb.R).a(hc.f, ld.a().a(le.b, le.a.b)).a(hc.d, ld.a().a(le.b, le.a.c)).a(hc.e, ld.a().a(le.b, le.a.d)).a(hc.c, ld.a());
   }

   private static lb c() {
      return lb.a(dgb.R).a(hc.d, ld.a()).a(hc.e, ld.a().a(le.b, le.a.b)).a(hc.c, ld.a().a(le.b, le.a.c)).a(hc.f, ld.a().a(le.b, le.a.d));
   }

   private static lb d() {
      return lb.a(dgb.R).a(hc.f, ld.a()).a(hc.d, ld.a().a(le.b, le.a.b)).a(hc.e, ld.a().a(le.b, le.a.c)).a(hc.c, ld.a().a(le.b, le.a.d));
   }

   private static lb e() {
      return lb.a(dgb.P)
         .a(hc.a, ld.a().a(le.a, le.a.b))
         .a(hc.b, ld.a().a(le.a, le.a.d))
         .a(hc.c, ld.a())
         .a(hc.d, ld.a().a(le.b, le.a.c))
         .a(hc.e, ld.a().a(le.b, le.a.d))
         .a(hc.f, ld.a().a(le.b, le.a.b));
   }

   private static la b(csx $$0, aey $$1) {
      return la.a($$0, a($$1));
   }

   private static ld[] a(aey $$0) {
      return new ld[]{ld.a().a(le.c, $$0), ld.a().a(le.c, $$0).a(le.b, le.a.b), ld.a().a(le.c, $$0).a(le.b, le.a.c), ld.a().a(le.c, $$0).a(le.b, le.a.d)};
   }

   private static la a(csx $$0, aey $$1, aey $$2) {
      return la.a($$0, ld.a().a(le.c, $$1), ld.a().a(le.c, $$2), ld.a().a(le.c, $$1).a(le.b, le.a.c), ld.a().a(le.c, $$2).a(le.b, le.a.c));
   }

   private static lb a(dgc $$0, aey $$1, aey $$2) {
      return lb.a($$0).a(true, ld.a().a(le.c, $$1)).a(false, ld.a().a(le.c, $$2));
   }

   private void e(csx $$0) {
      aey $$1 = ln.a.create($$0, this.c);
      aey $$2 = ln.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(csx $$0) {
      aey $$1 = ln.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(csx $$0) {
      this.b.accept(la.a($$0).a(lb.a(dgb.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aey $$3 = ll.a($$0, $$2);
         return ld.a().a(le.c, lk.c.a($$0, $$2, new ll().a(lm.a, $$3), this.c));
      })));
      this.a($$0, ll.a($$0, "_0"));
   }

   static kx b(csx $$0, aey $$1, aey $$2) {
      return la.a($$0)
         .a(lb.a(dgb.w).a(false, ld.a().a(le.c, $$1)).a(true, ld.a().a(le.c, $$2)))
         .a(
            lb.a(dgb.U, dgb.R)
               .a(dfw.a, hc.f, ld.a().a(le.b, le.a.b))
               .a(dfw.a, hc.e, ld.a().a(le.b, le.a.d))
               .a(dfw.a, hc.d, ld.a().a(le.b, le.a.c))
               .a(dfw.a, hc.c, ld.a())
               .a(dfw.b, hc.f, ld.a().a(le.b, le.a.b).a(le.a, le.a.b).a(le.d, true))
               .a(dfw.b, hc.e, ld.a().a(le.b, le.a.d).a(le.a, le.a.b).a(le.d, true))
               .a(dfw.b, hc.d, ld.a().a(le.b, le.a.c).a(le.a, le.a.b).a(le.d, true))
               .a(dfw.b, hc.c, ld.a().a(le.a, le.a.b).a(le.d, true))
               .a(dfw.c, hc.f, ld.a().a(le.b, le.a.d).a(le.a, le.a.c))
               .a(dfw.c, hc.e, ld.a().a(le.b, le.a.b).a(le.a, le.a.c))
               .a(dfw.c, hc.d, ld.a().a(le.a, le.a.c))
               .a(dfw.c, hc.c, ld.a().a(le.b, le.a.c).a(le.a, le.a.c))
         );
   }

   private static lb.d<hc, dgh, dgg, Boolean> a(lb.d<hc, dgh, dgg, Boolean> $$0, dgh $$1, aey $$2, aey $$3, aey $$4, aey $$5) {
      return $$0.a(hc.f, $$1, dgg.a, false, ld.a().a(le.c, $$2))
         .a(hc.d, $$1, dgg.a, false, ld.a().a(le.c, $$2).a(le.b, le.a.b))
         .a(hc.e, $$1, dgg.a, false, ld.a().a(le.c, $$2).a(le.b, le.a.c))
         .a(hc.c, $$1, dgg.a, false, ld.a().a(le.c, $$2).a(le.b, le.a.d))
         .a(hc.f, $$1, dgg.b, false, ld.a().a(le.c, $$4))
         .a(hc.d, $$1, dgg.b, false, ld.a().a(le.c, $$4).a(le.b, le.a.b))
         .a(hc.e, $$1, dgg.b, false, ld.a().a(le.c, $$4).a(le.b, le.a.c))
         .a(hc.c, $$1, dgg.b, false, ld.a().a(le.c, $$4).a(le.b, le.a.d))
         .a(hc.f, $$1, dgg.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.b))
         .a(hc.d, $$1, dgg.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.c))
         .a(hc.e, $$1, dgg.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.d))
         .a(hc.c, $$1, dgg.a, true, ld.a().a(le.c, $$3))
         .a(hc.f, $$1, dgg.b, true, ld.a().a(le.c, $$5).a(le.b, le.a.d))
         .a(hc.d, $$1, dgg.b, true, ld.a().a(le.c, $$5))
         .a(hc.e, $$1, dgg.b, true, ld.a().a(le.c, $$5).a(le.b, le.a.b))
         .a(hc.c, $$1, dgg.b, true, ld.a().a(le.c, $$5).a(le.b, le.a.c));
   }

   private static kx a(csx $$0, aey $$1, aey $$2, aey $$3, aey $$4, aey $$5, aey $$6, aey $$7, aey $$8) {
      return la.a($$0).a(a(a(lb.a(dgb.R, dgb.ae, dgb.be, dgb.u), dgh.b, $$1, $$2, $$3, $$4), dgh.a, $$5, $$6, $$7, $$8));
   }

   static kx a(csx $$0, aey $$1, aey $$2, aey $$3, aey $$4, aey $$5) {
      return kz.a($$0)
         .a(ld.a().a(le.c, $$1))
         .a(ky.a().a(dgb.L, true), ld.a().a(le.c, $$2).a(le.d, false))
         .a(ky.a().a(dgb.M, true), ld.a().a(le.c, $$3).a(le.d, false))
         .a(ky.a().a(dgb.N, true), ld.a().a(le.c, $$4).a(le.d, false))
         .a(ky.a().a(dgb.O, true), ld.a().a(le.c, $$5).a(le.d, false));
   }

   static kx c(csx $$0, aey $$1, aey $$2) {
      return kz.a($$0)
         .a(ld.a().a(le.c, $$1))
         .a(ky.a().a(dgb.L, true), ld.a().a(le.c, $$2).a(le.d, true))
         .a(ky.a().a(dgb.M, true), ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, true))
         .a(ky.a().a(dgb.N, true), ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, true))
         .a(ky.a().a(dgb.O, true), ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, true));
   }

   static kx a(csx $$0, aey $$1, aey $$2, aey $$3) {
      return kz.a($$0)
         .a(ky.a().a(dgb.J, true), ld.a().a(le.c, $$1))
         .a(ky.a().a(dgb.X, dgx.b), ld.a().a(le.c, $$2).a(le.d, true))
         .a(ky.a().a(dgb.W, dgx.b), ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, true))
         .a(ky.a().a(dgb.Y, dgx.b), ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, true))
         .a(ky.a().a(dgb.Z, dgx.b), ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, true))
         .a(ky.a().a(dgb.X, dgx.c), ld.a().a(le.c, $$3).a(le.d, true))
         .a(ky.a().a(dgb.W, dgx.c), ld.a().a(le.c, $$3).a(le.b, le.a.b).a(le.d, true))
         .a(ky.a().a(dgb.Y, dgx.c), ld.a().a(le.c, $$3).a(le.b, le.a.c).a(le.d, true))
         .a(ky.a().a(dgb.Z, dgx.c), ld.a().a(le.c, $$3).a(le.b, le.a.d).a(le.d, true));
   }

   static kx a(csx $$0, aey $$1, aey $$2, aey $$3, aey $$4, boolean $$5) {
      return la.a($$0, ld.a().a(le.d, $$5))
         .a(c())
         .a(
            lb.a(dgb.q, dgb.u)
               .a(false, false, ld.a().a(le.c, $$2))
               .a(true, false, ld.a().a(le.c, $$4))
               .a(false, true, ld.a().a(le.c, $$1))
               .a(true, true, ld.a().a(le.c, $$3))
         );
   }

   static kx b(csx $$0, aey $$1, aey $$2, aey $$3) {
      return la.a($$0)
         .a(
            lb.a(dgb.R, dgb.af, dgb.bi)
               .a(hc.f, dgk.b, dgu.a, ld.a().a(le.c, $$2))
               .a(hc.e, dgk.b, dgu.a, ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgk.b, dgu.a, ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgk.b, dgu.a, ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgk.b, dgu.e, ld.a().a(le.c, $$3))
               .a(hc.e, dgk.b, dgu.e, ld.a().a(le.c, $$3).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgk.b, dgu.e, ld.a().a(le.c, $$3).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgk.b, dgu.e, ld.a().a(le.c, $$3).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgk.b, dgu.d, ld.a().a(le.c, $$3).a(le.b, le.a.d).a(le.d, true))
               .a(hc.e, dgk.b, dgu.d, ld.a().a(le.c, $$3).a(le.b, le.a.b).a(le.d, true))
               .a(hc.d, dgk.b, dgu.d, ld.a().a(le.c, $$3))
               .a(hc.c, dgk.b, dgu.d, ld.a().a(le.c, $$3).a(le.b, le.a.c).a(le.d, true))
               .a(hc.f, dgk.b, dgu.c, ld.a().a(le.c, $$1))
               .a(hc.e, dgk.b, dgu.c, ld.a().a(le.c, $$1).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgk.b, dgu.c, ld.a().a(le.c, $$1).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgk.b, dgu.c, ld.a().a(le.c, $$1).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgk.b, dgu.b, ld.a().a(le.c, $$1).a(le.b, le.a.d).a(le.d, true))
               .a(hc.e, dgk.b, dgu.b, ld.a().a(le.c, $$1).a(le.b, le.a.b).a(le.d, true))
               .a(hc.d, dgk.b, dgu.b, ld.a().a(le.c, $$1))
               .a(hc.c, dgk.b, dgu.b, ld.a().a(le.c, $$1).a(le.b, le.a.c).a(le.d, true))
               .a(hc.f, dgk.a, dgu.a, ld.a().a(le.c, $$2).a(le.a, le.a.c).a(le.d, true))
               .a(hc.e, dgk.a, dgu.a, ld.a().a(le.c, $$2).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgk.a, dgu.a, ld.a().a(le.c, $$2).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgk.a, dgu.a, ld.a().a(le.c, $$2).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgk.a, dgu.e, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.e, dgk.a, dgu.e, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
               .a(hc.d, dgk.a, dgu.e, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.c, dgk.a, dgu.e, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.d, true))
               .a(hc.f, dgk.a, dgu.d, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.d, true))
               .a(hc.e, dgk.a, dgu.d, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgk.a, dgu.d, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgk.a, dgu.d, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
               .a(hc.f, dgk.a, dgu.c, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.e, dgk.a, dgu.c, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
               .a(hc.d, dgk.a, dgu.c, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.c, dgk.a, dgu.c, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.d, true))
               .a(hc.f, dgk.a, dgu.b, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.d, true))
               .a(hc.e, dgk.a, dgu.b, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.c).a(le.d, true))
               .a(hc.d, dgk.a, dgu.b, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.b).a(le.d, true))
               .a(hc.c, dgk.a, dgu.b, ld.a().a(le.c, $$1).a(le.a, le.a.c).a(le.b, le.a.d).a(le.d, true))
         );
   }

   private static kx c(csx $$0, aey $$1, aey $$2, aey $$3) {
      return la.a($$0)
         .a(
            lb.a(dgb.R, dgb.af, dgb.u)
               .a(hc.c, dgk.b, false, ld.a().a(le.c, $$2))
               .a(hc.d, dgk.b, false, ld.a().a(le.c, $$2).a(le.b, le.a.c))
               .a(hc.f, dgk.b, false, ld.a().a(le.c, $$2).a(le.b, le.a.b))
               .a(hc.e, dgk.b, false, ld.a().a(le.c, $$2).a(le.b, le.a.d))
               .a(hc.c, dgk.a, false, ld.a().a(le.c, $$1))
               .a(hc.d, dgk.a, false, ld.a().a(le.c, $$1).a(le.b, le.a.c))
               .a(hc.f, dgk.a, false, ld.a().a(le.c, $$1).a(le.b, le.a.b))
               .a(hc.e, dgk.a, false, ld.a().a(le.c, $$1).a(le.b, le.a.d))
               .a(hc.c, dgk.b, true, ld.a().a(le.c, $$3))
               .a(hc.d, dgk.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.c))
               .a(hc.f, dgk.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(hc.e, dgk.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.d))
               .a(hc.c, dgk.a, true, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.c))
               .a(hc.d, dgk.a, true, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.a))
               .a(hc.f, dgk.a, true, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.d))
               .a(hc.e, dgk.a, true, ld.a().a(le.c, $$3).a(le.a, le.a.c).a(le.b, le.a.b))
         );
   }

   private static kx d(csx $$0, aey $$1, aey $$2, aey $$3) {
      return la.a($$0)
         .a(
            lb.a(dgb.R, dgb.af, dgb.u)
               .a(hc.c, dgk.b, false, ld.a().a(le.c, $$2))
               .a(hc.d, dgk.b, false, ld.a().a(le.c, $$2))
               .a(hc.f, dgk.b, false, ld.a().a(le.c, $$2))
               .a(hc.e, dgk.b, false, ld.a().a(le.c, $$2))
               .a(hc.c, dgk.a, false, ld.a().a(le.c, $$1))
               .a(hc.d, dgk.a, false, ld.a().a(le.c, $$1))
               .a(hc.f, dgk.a, false, ld.a().a(le.c, $$1))
               .a(hc.e, dgk.a, false, ld.a().a(le.c, $$1))
               .a(hc.c, dgk.b, true, ld.a().a(le.c, $$3))
               .a(hc.d, dgk.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.c))
               .a(hc.f, dgk.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(hc.e, dgk.b, true, ld.a().a(le.c, $$3).a(le.b, le.a.d))
               .a(hc.c, dgk.a, true, ld.a().a(le.c, $$3))
               .a(hc.d, dgk.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.c))
               .a(hc.f, dgk.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(hc.e, dgk.a, true, ld.a().a(le.c, $$3).a(le.b, le.a.d))
         );
   }

   static la c(csx $$0, aey $$1) {
      return la.a($$0, ld.a().a(le.c, $$1));
   }

   private static lb f() {
      return lb.a(dgb.I).a(hc.a.b, ld.a()).a(hc.a.c, ld.a().a(le.a, le.a.b)).a(hc.a.a, ld.a().a(le.a, le.a.b).a(le.b, le.a.b));
   }

   static kx a(csx $$0, ll $$1, BiConsumer<aey, Supplier<JsonElement>> $$2) {
      aey $$3 = lk.f.a($$0, $$1, $$2);
      aey $$4 = lk.g.a($$0, $$1, $$2);
      aey $$5 = lk.h.a($$0, $$1, $$2);
      aey $$6 = lk.i.a($$0, $$1, $$2);
      return la.a($$0, ld.a().a(le.c, $$6)).a(lb.a(dgb.I).a(hc.a.a, ld.a().a(le.c, $$3)).a(hc.a.b, ld.a().a(le.c, $$4)).a(hc.a.c, ld.a().a(le.c, $$5)));
   }

   static kx d(csx $$0, aey $$1) {
      return la.a($$0, ld.a().a(le.c, $$1)).a(f());
   }

   private void e(csx $$0, aey $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(csx $$0, ln.a $$1) {
      aey $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(csx $$0, ln.a $$1) {
      aey $$2 = $$1.create($$0, this.c);
      this.b.accept(la.a($$0, ld.a().a(le.c, $$2)).a(b()));
   }

   static kx d(csx $$0, aey $$1, aey $$2) {
      return la.a($$0)
         .a(
            lb.a(dgb.I)
               .a(hc.a.b, ld.a().a(le.c, $$1))
               .a(hc.a.c, ld.a().a(le.c, $$2).a(le.a, le.a.b))
               .a(hc.a.a, ld.a().a(le.c, $$2).a(le.a, le.a.b).a(le.b, le.a.b))
         );
   }

   private void a(csx $$0, ln.a $$1, ln.a $$2) {
      aey $$3 = $$1.create($$0, this.c);
      aey $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aey a(csx $$0, String $$1, lj $$2, Function<aey, ll> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ll.a($$0, $$1)), this.c);
   }

   static kx e(csx $$0, aey $$1, aey $$2) {
      return la.a($$0).a(a(dgb.w, $$2, $$1));
   }

   static kx e(csx $$0, aey $$1, aey $$2, aey $$3) {
      return la.a($$0).a(lb.a(dgb.bh).a(dgt.b, ld.a().a(le.c, $$1)).a(dgt.a, ld.a().a(le.c, $$2)).a(dgt.c, ld.a().a(le.c, $$3)));
   }

   public void a(csx $$0) {
      this.b($$0, ln.a);
   }

   public void b(csx $$0, ln.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(csx $$0, ll $$1, lj $$2) {
      aey $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ku.b h(csx $$0) {
      ln $$1 = this.g.getOrDefault($$0, ln.a.get($$0));
      return new ku.b($$1.b()).a($$0, $$1.a());
   }

   public void a(csx $$0, csx $$1, csx $$2) {
      ll $$3 = ll.u($$0);
      aey $$4 = lk.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(csx $$0) {
      ll $$1 = ll.t($$0);
      aey $$2 = lk.t.a($$0, $$1, this.c);
      aey $$3 = lk.u.a($$0, $$1, this.c);
      aey $$4 = lk.v.a($$0, $$1, this.c);
      aey $$5 = lk.w.a($$0, $$1, this.c);
      aey $$6 = lk.x.a($$0, $$1, this.c);
      aey $$7 = lk.y.a($$0, $$1, this.c);
      aey $$8 = lk.z.a($$0, $$1, this.c);
      aey $$9 = lk.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(csx $$0) {
      ll $$1 = ll.b($$0);
      aey $$2 = lk.ai.a($$0, $$1, this.c);
      aey $$3 = lk.aj.a($$0, $$1, this.c);
      aey $$4 = lk.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(csx $$0) {
      ll $$1 = ll.b($$0);
      aey $$2 = lk.af.a($$0, $$1, this.c);
      aey $$3 = lk.ag.a($$0, $$1, this.c);
      aey $$4 = lk.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(csy.rC);
      aey $$0 = li.a(csy.rC);
      aey $$1 = li.a(csy.rC, "_partial_tilt");
      aey $$2 = li.a(csy.rC, "_full_tilt");
      this.b
         .accept(
            la.a(csy.rC)
               .a(b())
               .a(lb.a(dgb.bl).a(dgw.a, ld.a().a(le.c, $$0)).a(dgw.b, ld.a().a(le.c, $$0)).a(dgw.c, ld.a().a(le.c, $$1)).a(dgw.d, ld.a().a(le.c, $$2)))
         );
   }

   private ku.f l(csx $$0) {
      return new ku.f(ll.n($$0));
   }

   private void m(csx $$0) {
      this.a($$0, $$0);
   }

   private void a(csx $$0, csx $$1) {
      this.b.accept(c($$0, li.a($$1)));
   }

   private void a(csx $$0, ku.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(csx $$0, ku.e $$1, ll $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csx $$0, ku.e $$1) {
      ll $$2 = ll.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csx $$0, ku.e $$1, ll $$2) {
      aey $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(csx $$0, ku.e $$1, dgo<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         lb $$4 = lb.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            ll $$5 = ll.c(ll.a($$0, $$4x));
            aey $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return ld.a().a(le.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(la.a($$0).a($$4));
      }
   }

   private void a(csx $$0, csx $$1, ku.e $$2) {
      this.a($$0, $$2);
      ll $$3 = ll.d($$0);
      aey $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(csx $$0, csx $$1) {
      ln $$2 = ln.o.get($$0);
      aey $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aey $$4 = lk.aA.a($$1, $$2.b(), this.c);
      this.b.accept(la.a($$1, ld.a().a(le.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(csx $$0, csx $$1) {
      this.a($$0.k());
      ll $$2 = ll.h($$0);
      ll $$3 = ll.a($$0, $$1);
      aey $$4 = lk.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            la.a($$1, ld.a().a(le.c, $$4))
               .a(lb.a(dgb.R).a(hc.e, ld.a()).a(hc.d, ld.a().a(le.b, le.a.d)).a(hc.c, ld.a().a(le.b, le.a.b)).a(hc.f, ld.a().a(le.b, le.a.c)))
         );
      this.b.accept(la.a($$0).a(lb.a(dgb.av).a($$2x -> ld.a().a(le.c, lk.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      csx $$0 = csy.kC;
      this.a($$0.k());
      aey $$1 = li.a($$0, "_top");
      aey $$2 = li.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      csx $$0 = csy.kB;
      this.a($$0.k());
      lb $$1 = lb.a(cyk.b, dgb.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> ld.a().a(le.c, li.a($$0, "_top_stage_" + $$1x));
            case b -> ld.a().a(le.c, li.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(la.a($$0).a($$1));
   }

   private void a(csx $$0, csx $$1, csx $$2, csx $$3, csx $$4, csx $$5, csx $$6, csx $$7) {
      this.a($$0, ku.e.b);
      this.a($$1, ku.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(csx $$0, ku.e $$1) {
      this.a($$0, "_top");
      aey $$2 = this.a($$0, "_top", $$1.a(), ll::c);
      aey $$3 = this.a($$0, "_bottom", $$1.a(), ll::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(csy.iD, "_front");
      aey $$0 = li.a(csy.iD, "_top");
      aey $$1 = this.a(csy.iD, "_bottom", ku.e.b.a(), ll::c);
      this.f(csy.iD, $$0, $$1);
   }

   private void k() {
      aey $$0 = this.a(csy.bx, "_top", lk.bi, ll::a);
      aey $$1 = this.a(csy.bx, "_bottom", lk.bi, ll::a);
      this.f(csy.bx, $$0, $$1);
   }

   private void l() {
      this.c(csy.rE);
      aey $$0 = li.a(csy.rE, "_top");
      aey $$1 = li.a(csy.rE, "_bottom");
      this.b.accept(la.a(csy.rE).a(b()).a(lb.a(dgb.ae).a(dgh.b, ld.a().a(le.c, $$1)).a(dgh.a, ld.a().a(le.c, $$0))));
   }

   private void f(csx $$0, aey $$1, aey $$2) {
      this.b.accept(la.a($$0).a(lb.a(dgb.ae).a(dgh.b, ld.a().a(le.c, $$2)).a(dgh.a, ld.a().a(le.c, $$1))));
   }

   private void n(csx $$0) {
      ll $$1 = ll.e($$0);
      ll $$2 = ll.e(ll.a($$0, "_corner"));
      aey $$3 = lk.aq.a($$0, $$1, this.c);
      aey $$4 = lk.ar.a($$0, $$2, this.c);
      aey $$5 = lk.as.a($$0, $$1, this.c);
      aey $$6 = lk.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            la.a($$0)
               .a(
                  lb.a(dgb.ag)
                     .a(dgp.a, ld.a().a(le.c, $$3))
                     .a(dgp.b, ld.a().a(le.c, $$3).a(le.b, le.a.b))
                     .a(dgp.c, ld.a().a(le.c, $$5).a(le.b, le.a.b))
                     .a(dgp.d, ld.a().a(le.c, $$6).a(le.b, le.a.b))
                     .a(dgp.e, ld.a().a(le.c, $$5))
                     .a(dgp.f, ld.a().a(le.c, $$6))
                     .a(dgp.g, ld.a().a(le.c, $$4))
                     .a(dgp.h, ld.a().a(le.c, $$4).a(le.b, le.a.b))
                     .a(dgp.i, ld.a().a(le.c, $$4).a(le.b, le.a.c))
                     .a(dgp.j, ld.a().a(le.c, $$4).a(le.b, le.a.d))
               )
         );
   }

   private void o(csx $$0) {
      aey $$1 = this.a($$0, "", lk.aq, ll::e);
      aey $$2 = this.a($$0, "", lk.as, ll::e);
      aey $$3 = this.a($$0, "", lk.at, ll::e);
      aey $$4 = this.a($$0, "_on", lk.aq, ll::e);
      aey $$5 = this.a($$0, "_on", lk.as, ll::e);
      aey $$6 = this.a($$0, "_on", lk.at, ll::e);
      lb $$7 = lb.a(dgb.w, dgb.ah).a(($$6x, $$7x) -> {
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

   private ku.a a(aey $$0, csx $$1) {
      return new ku.a($$0, $$1);
   }

   private ku.a d(csx $$0, csx $$1) {
      return new ku.a(li.a($$0), $$1);
   }

   private void a(csx $$0, cjc $$1) {
      aey $$2 = lk.Y.a($$0, ll.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(csx $$0, aey $$1) {
      aey $$2 = lk.Y.a($$0, ll.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(csx $$0, csx $$1) {
      this.a($$0);
      aey $$2 = ln.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(csx $$0) {
      this.a($$0.k());
      aey $$1 = ln.j.create($$0, this.c);
      aey $$2 = ln.k.create($$0, this.c);
      aey $$3 = ln.l.create($$0, this.c);
      aey $$4 = ln.m.create($$0, this.c);
      this.b
         .accept(
            kz.a($$0)
               .a(ky.a().a(dgb.S, 1, 2, 3, 4).a(dgb.R, hc.c), ld.a().a(le.c, $$1))
               .a(ky.a().a(dgb.S, 1, 2, 3, 4).a(dgb.R, hc.f), ld.a().a(le.c, $$1).a(le.b, le.a.b))
               .a(ky.a().a(dgb.S, 1, 2, 3, 4).a(dgb.R, hc.d), ld.a().a(le.c, $$1).a(le.b, le.a.c))
               .a(ky.a().a(dgb.S, 1, 2, 3, 4).a(dgb.R, hc.e), ld.a().a(le.c, $$1).a(le.b, le.a.d))
               .a(ky.a().a(dgb.S, 2, 3, 4).a(dgb.R, hc.c), ld.a().a(le.c, $$2))
               .a(ky.a().a(dgb.S, 2, 3, 4).a(dgb.R, hc.f), ld.a().a(le.c, $$2).a(le.b, le.a.b))
               .a(ky.a().a(dgb.S, 2, 3, 4).a(dgb.R, hc.d), ld.a().a(le.c, $$2).a(le.b, le.a.c))
               .a(ky.a().a(dgb.S, 2, 3, 4).a(dgb.R, hc.e), ld.a().a(le.c, $$2).a(le.b, le.a.d))
               .a(ky.a().a(dgb.S, 3, 4).a(dgb.R, hc.c), ld.a().a(le.c, $$3))
               .a(ky.a().a(dgb.S, 3, 4).a(dgb.R, hc.f), ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(ky.a().a(dgb.S, 3, 4).a(dgb.R, hc.d), ld.a().a(le.c, $$3).a(le.b, le.a.c))
               .a(ky.a().a(dgb.S, 3, 4).a(dgb.R, hc.e), ld.a().a(le.c, $$3).a(le.b, le.a.d))
               .a(ky.a().a(dgb.S, 4).a(dgb.R, hc.c), ld.a().a(le.c, $$4))
               .a(ky.a().a(dgb.S, 4).a(dgb.R, hc.f), ld.a().a(le.c, $$4).a(le.b, le.a.b))
               .a(ky.a().a(dgb.S, 4).a(dgb.R, hc.d), ld.a().a(le.c, $$4).a(le.b, le.a.c))
               .a(ky.a().a(dgb.S, 4).a(dgb.R, hc.e), ld.a().a(le.c, $$4).a(le.b, le.a.d))
         );
   }

   private void a(ln.a $$0, csx... $$1) {
      for (csx $$2 : $$1) {
         aey $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ln.a $$0, csx... $$1) {
      for (csx $$2 : $$1) {
         aey $$3 = $$0.create($$2, this.c);
         this.b.accept(la.a($$2, ld.a().a(le.c, $$3)).a(c()));
      }
   }

   private void f(csx $$0, csx $$1) {
      this.a($$0);
      ll $$2 = ll.b($$0, $$1);
      aey $$3 = lk.aG.a($$1, $$2, this.c);
      aey $$4 = lk.aH.a($$1, $$2, this.c);
      aey $$5 = lk.aI.a($$1, $$2, this.c);
      aey $$6 = lk.aE.a($$1, $$2, this.c);
      aey $$7 = lk.aF.a($$1, $$2, this.c);
      cjc $$8 = $$1.k();
      lk.bv.a(li.a($$8), ll.F($$0), this.c);
      this.b
         .accept(
            kz.a($$1)
               .a(ld.a().a(le.c, $$3))
               .a(ky.a().a(dgb.L, true), ld.a().a(le.c, $$4))
               .a(ky.a().a(dgb.M, true), ld.a().a(le.c, $$4).a(le.b, le.a.b))
               .a(ky.a().a(dgb.N, true), ld.a().a(le.c, $$5))
               .a(ky.a().a(dgb.O, true), ld.a().a(le.c, $$5).a(le.b, le.a.b))
               .a(ky.a().a(dgb.L, false), ld.a().a(le.c, $$6))
               .a(ky.a().a(dgb.M, false), ld.a().a(le.c, $$7))
               .a(ky.a().a(dgb.N, false), ld.a().a(le.c, $$7).a(le.b, le.a.b))
               .a(ky.a().a(dgb.O, false), ld.a().a(le.c, $$6).a(le.b, le.a.d))
         );
   }

   private void q(csx $$0) {
      ll $$1 = ll.z($$0);
      aey $$2 = lk.aJ.a($$0, $$1, this.c);
      aey $$3 = this.a($$0, "_conditional", lk.aJ, $$1x -> $$1.c(lm.i, $$1x));
      this.b.accept(la.a($$0).a(a(dgb.c, $$3, $$2)).a(e()));
   }

   private void r(csx $$0) {
      aey $$1 = ln.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<ld> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> ld.a().a(le.c, li.a(csy.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(csy.mZ);
      this.b
         .accept(
            kz.a(csy.mZ)
               .a(ky.a().a(dgb.aq, 0), this.a(0))
               .a(ky.a().a(dgb.aq, 1), this.a(1))
               .a(ky.a().a(dgb.bk, dfx.b), ld.a().a(le.c, li.a(csy.mZ, "_small_leaves")))
               .a(ky.a().a(dgb.bk, dfx.c), ld.a().a(le.c, li.a(csy.mZ, "_large_leaves")))
         );
   }

   private lb n() {
      return lb.a(dgb.P)
         .a(hc.a, ld.a().a(le.a, le.a.c))
         .a(hc.b, ld.a())
         .a(hc.c, ld.a().a(le.a, le.a.b))
         .a(hc.d, ld.a().a(le.a, le.a.b).a(le.b, le.a.c))
         .a(hc.e, ld.a().a(le.a, le.a.b).a(le.b, le.a.d))
         .a(hc.f, ld.a().a(le.a, le.a.b).a(le.b, le.a.b));
   }

   private void o() {
      aey $$0 = ll.a(csy.nU, "_top_open");
      this.b
         .accept(
            la.a(csy.nU)
               .a(this.n())
               .a(
                  lb.a(dgb.u)
                     .a(false, ld.a().a(le.c, ln.e.create(csy.nU, this.c)))
                     .a(true, ld.a().a(le.c, ln.e.get(csy.nU).a($$1 -> $$1.a(lm.f, $$0)).a(csy.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> lb a(dgo<T> $$0, T $$1, aey $$2, aey $$3) {
      ld $$4 = ld.a().a(le.c, $$2);
      ld $$5 = ld.a().a(le.c, $$3);
      return lb.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(csx $$0, Function<csx, ll> $$1) {
      ll $$2 = $$1.apply($$0).b(lm.i, lm.c);
      ll $$3 = $$2.c(lm.g, ll.a($$0, "_front_honey"));
      aey $$4 = lk.o.a($$0, $$2, this.c);
      aey $$5 = lk.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(la.a($$0).a(b()).a(a(dgb.aN, 5, $$5, $$4)));
   }

   private void a(csx $$0, dgo<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aey> $$3 = new Int2ObjectOpenHashMap();
         lb $$4 = lb.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aey $$5 = (aey)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, lk.aT, ll::g));
            return ld.a().a(le.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(la.a($$0).a($$4));
      }
   }

   private void p() {
      aey $$0 = li.a(csy.od, "_floor");
      aey $$1 = li.a(csy.od, "_ceiling");
      aey $$2 = li.a(csy.od, "_wall");
      aey $$3 = li.a(csy.od, "_between_walls");
      this.a(cjk.vs);
      this.b
         .accept(
            la.a(csy.od)
               .a(
                  lb.a(dgb.R, dgb.V)
                     .a(hc.c, dfz.a, ld.a().a(le.c, $$0))
                     .a(hc.d, dfz.a, ld.a().a(le.c, $$0).a(le.b, le.a.c))
                     .a(hc.f, dfz.a, ld.a().a(le.c, $$0).a(le.b, le.a.b))
                     .a(hc.e, dfz.a, ld.a().a(le.c, $$0).a(le.b, le.a.d))
                     .a(hc.c, dfz.b, ld.a().a(le.c, $$1))
                     .a(hc.d, dfz.b, ld.a().a(le.c, $$1).a(le.b, le.a.c))
                     .a(hc.f, dfz.b, ld.a().a(le.c, $$1).a(le.b, le.a.b))
                     .a(hc.e, dfz.b, ld.a().a(le.c, $$1).a(le.b, le.a.d))
                     .a(hc.c, dfz.c, ld.a().a(le.c, $$2).a(le.b, le.a.d))
                     .a(hc.d, dfz.c, ld.a().a(le.c, $$2).a(le.b, le.a.b))
                     .a(hc.f, dfz.c, ld.a().a(le.c, $$2))
                     .a(hc.e, dfz.c, ld.a().a(le.c, $$2).a(le.b, le.a.c))
                     .a(hc.d, dfz.d, ld.a().a(le.c, $$3).a(le.b, le.a.b))
                     .a(hc.c, dfz.d, ld.a().a(le.c, $$3).a(le.b, le.a.d))
                     .a(hc.f, dfz.d, ld.a().a(le.c, $$3))
                     .a(hc.e, dfz.d, ld.a().a(le.c, $$3).a(le.b, le.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            la.a(csy.nZ, ld.a().a(le.c, li.a(csy.nZ)))
               .a(
                  lb.a(dgb.U, dgb.R)
                     .a(dfw.a, hc.c, ld.a())
                     .a(dfw.a, hc.f, ld.a().a(le.b, le.a.b))
                     .a(dfw.a, hc.d, ld.a().a(le.b, le.a.c))
                     .a(dfw.a, hc.e, ld.a().a(le.b, le.a.d))
                     .a(dfw.b, hc.c, ld.a().a(le.a, le.a.b))
                     .a(dfw.b, hc.f, ld.a().a(le.a, le.a.b).a(le.b, le.a.b))
                     .a(dfw.b, hc.d, ld.a().a(le.a, le.a.b).a(le.b, le.a.c))
                     .a(dfw.b, hc.e, ld.a().a(le.a, le.a.b).a(le.b, le.a.d))
                     .a(dfw.c, hc.d, ld.a().a(le.a, le.a.c))
                     .a(dfw.c, hc.e, ld.a().a(le.a, le.a.c).a(le.b, le.a.b))
                     .a(dfw.c, hc.c, ld.a().a(le.a, le.a.c).a(le.b, le.a.c))
                     .a(dfw.c, hc.f, ld.a().a(le.a, le.a.c).a(le.b, le.a.d))
               )
         );
   }

   private void d(csx $$0, ln.a $$1) {
      aey $$2 = $$1.create($$0, this.c);
      aey $$3 = ll.a($$0, "_front_on");
      aey $$4 = $$1.get($$0).a($$1x -> $$1x.a(lm.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(la.a($$0).a(a(dgb.r, $$4, $$2)).a(b()));
   }

   private void a(csx... $$0) {
      aey $$1 = li.a("campfire_off");

      for (csx $$2 : $$0) {
         aey $$3 = lk.ba.a($$2, ll.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(la.a($$2).a(a(dgb.r, $$3, $$1)).a(c()));
      }
   }

   private void s(csx $$0) {
      aey $$1 = lk.br.a($$0, ll.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(csx $$0) {
      aey $$1;
      if ($$0 == csy.si) {
         $$1 = lk.bt.a($$0, ll.m($$0), this.c);
      } else {
         $$1 = lk.bs.a($$0, ll.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ll $$0 = ll.a(ll.G(csy.cl), ll.G(csy.n));
      aey $$1 = lk.i.a(csy.cl, $$0, this.c);
      this.b.accept(c(csy.cl, $$1));
   }

   private void s() {
      this.a(cjk.ll);
      this.b
         .accept(
            kz.a(csy.cw)
               .a(
                  ky.b(
                     ky.a().a(dgb.ab, dgq.c).a(dgb.aa, dgq.c).a(dgb.ac, dgq.c).a(dgb.ad, dgq.c),
                     ky.a().a(dgb.ab, dgq.b, dgq.a).a(dgb.aa, dgq.b, dgq.a),
                     ky.a().a(dgb.aa, dgq.b, dgq.a).a(dgb.ac, dgq.b, dgq.a),
                     ky.a().a(dgb.ac, dgq.b, dgq.a).a(dgb.ad, dgq.b, dgq.a),
                     ky.a().a(dgb.ad, dgq.b, dgq.a).a(dgb.ab, dgq.b, dgq.a)
                  ),
                  ld.a().a(le.c, li.a("redstone_dust_dot"))
               )
               .a(ky.a().a(dgb.ab, dgq.b, dgq.a), ld.a().a(le.c, li.a("redstone_dust_side0")))
               .a(ky.a().a(dgb.ac, dgq.b, dgq.a), ld.a().a(le.c, li.a("redstone_dust_side_alt0")))
               .a(ky.a().a(dgb.aa, dgq.b, dgq.a), ld.a().a(le.c, li.a("redstone_dust_side_alt1")).a(le.b, le.a.d))
               .a(ky.a().a(dgb.ad, dgq.b, dgq.a), ld.a().a(le.c, li.a("redstone_dust_side1")).a(le.b, le.a.d))
               .a(ky.a().a(dgb.ab, dgq.a), ld.a().a(le.c, li.a("redstone_dust_up")))
               .a(ky.a().a(dgb.aa, dgq.a), ld.a().a(le.c, li.a("redstone_dust_up")).a(le.b, le.a.b))
               .a(ky.a().a(dgb.ac, dgq.a), ld.a().a(le.c, li.a("redstone_dust_up")).a(le.b, le.a.c))
               .a(ky.a().a(dgb.ad, dgq.a), ld.a().a(le.c, li.a("redstone_dust_up")).a(le.b, le.a.d))
         );
   }

   private void t() {
      this.a(cjk.lp);
      this.b
         .accept(
            la.a(csy.gY)
               .a(c())
               .a(
                  lb.a(dgb.bd, dgb.w)
                     .a(dge.a, false, ld.a().a(le.c, li.a(csy.gY)))
                     .a(dge.a, true, ld.a().a(le.c, li.a(csy.gY, "_on")))
                     .a(dge.b, false, ld.a().a(le.c, li.a(csy.gY, "_subtract")))
                     .a(dge.b, true, ld.a().a(le.c, li.a(csy.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      ll $$0 = ll.a(csy.jR);
      ll $$1 = ll.a(ll.a(csy.jE, "_side"), $$0.a(lm.f));
      aey $$2 = lk.Z.a(csy.jE, $$1, this.c);
      aey $$3 = lk.aa.a(csy.jE, $$1, this.c);
      aey $$4 = lk.i.b(csy.jE, "_double", $$1, this.c);
      this.b.accept(e(csy.jE, $$2, $$3, $$4));
      this.b.accept(c(csy.jR, lk.c.a(csy.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cjk.rB);
      this.b
         .accept(
            kz.a(csy.fs)
               .a(ld.a().a(le.c, ll.G(csy.fs)))
               .a(ky.a().a(dgb.k, true), ld.a().a(le.c, ll.a(csy.fs, "_bottle0")))
               .a(ky.a().a(dgb.l, true), ld.a().a(le.c, ll.a(csy.fs, "_bottle1")))
               .a(ky.a().a(dgb.m, true), ld.a().a(le.c, ll.a(csy.fs, "_bottle2")))
               .a(ky.a().a(dgb.k, false), ld.a().a(le.c, ll.a(csy.fs, "_empty0")))
               .a(ky.a().a(dgb.l, false), ld.a().a(le.c, ll.a(csy.fs, "_empty1")))
               .a(ky.a().a(dgb.m, false), ld.a().a(le.c, ll.a(csy.fs, "_empty2")))
         );
   }

   private void u(csx $$0) {
      aey $$1 = lk.bn.a($$0, ll.b($$0), this.c);
      aey $$2 = li.a("mushroom_block_inside");
      this.b
         .accept(
            kz.a($$0)
               .a(ky.a().a(dgb.L, true), ld.a().a(le.c, $$1))
               .a(ky.a().a(dgb.M, true), ld.a().a(le.c, $$1).a(le.b, le.a.b).a(le.d, true))
               .a(ky.a().a(dgb.N, true), ld.a().a(le.c, $$1).a(le.b, le.a.c).a(le.d, true))
               .a(ky.a().a(dgb.O, true), ld.a().a(le.c, $$1).a(le.b, le.a.d).a(le.d, true))
               .a(ky.a().a(dgb.J, true), ld.a().a(le.c, $$1).a(le.a, le.a.d).a(le.d, true))
               .a(ky.a().a(dgb.K, true), ld.a().a(le.c, $$1).a(le.a, le.a.b).a(le.d, true))
               .a(ky.a().a(dgb.L, false), ld.a().a(le.c, $$2))
               .a(ky.a().a(dgb.M, false), ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, false))
               .a(ky.a().a(dgb.N, false), ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, false))
               .a(ky.a().a(dgb.O, false), ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, false))
               .a(ky.a().a(dgb.J, false), ld.a().a(le.c, $$2).a(le.a, le.a.d).a(le.d, false))
               .a(ky.a().a(dgb.K, false), ld.a().a(le.c, $$2).a(le.a, le.a.b).a(le.d, false))
         );
      this.a($$0, ln.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cjk.qN);
      this.b
         .accept(
            la.a(csy.eh)
               .a(
                  lb.a(dgb.ay)
                     .a(0, ld.a().a(le.c, li.a(csy.eh)))
                     .a(1, ld.a().a(le.c, li.a(csy.eh, "_slice1")))
                     .a(2, ld.a().a(le.c, li.a(csy.eh, "_slice2")))
                     .a(3, ld.a().a(le.c, li.a(csy.eh, "_slice3")))
                     .a(4, ld.a().a(le.c, li.a(csy.eh, "_slice4")))
                     .a(5, ld.a().a(le.c, li.a(csy.eh, "_slice5")))
                     .a(6, ld.a().a(le.c, li.a(csy.eh, "_slice6")))
               )
         );
   }

   private void x() {
      ll $$0 = new ll()
         .a(lm.c, ll.a(csy.nX, "_side3"))
         .a(lm.o, ll.G(csy.t))
         .a(lm.n, ll.a(csy.nX, "_top"))
         .a(lm.j, ll.a(csy.nX, "_side3"))
         .a(lm.l, ll.a(csy.nX, "_side3"))
         .a(lm.k, ll.a(csy.nX, "_side1"))
         .a(lm.m, ll.a(csy.nX, "_side2"));
      this.b.accept(c(csy.nX, lk.a.a(csy.nX, $$0, this.c)));
   }

   private void y() {
      ll $$0 = new ll()
         .a(lm.c, ll.a(csy.ob, "_front"))
         .a(lm.o, ll.a(csy.ob, "_bottom"))
         .a(lm.n, ll.a(csy.ob, "_top"))
         .a(lm.j, ll.a(csy.ob, "_front"))
         .a(lm.k, ll.a(csy.ob, "_front"))
         .a(lm.l, ll.a(csy.ob, "_side"))
         .a(lm.m, ll.a(csy.ob, "_side"));
      this.b.accept(c(csy.ob, lk.a.a(csy.ob, $$0, this.c)));
   }

   private void a(csx $$0, csx $$1, BiFunction<csx, csx, ll> $$2) {
      ll $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, lk.a.a($$0, $$3, this.c)));
   }

   public void b(csx $$0) {
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
      ll $$0 = ll.k(csy.dV);
      this.b.accept(c(csy.dV, li.a(csy.dV)));
      this.a(csy.ef, $$0);
      this.a(csy.eg, $$0);
   }

   private void a(csx $$0, ll $$1) {
      aey $$2 = lk.n.a($$0, $$1.c(lm.g, ll.G($$0)), this.c);
      this.b.accept(la.a($$0, ld.a().a(le.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cjk.rC);
      this.m(csy.ft);
      this.b.accept(c(csy.fv, lk.bq.a(csy.fv, ll.j(ll.a(csy.H, "_still")), this.c)));
      this.b
         .accept(
            la.a(csy.fu)
               .a(
                  lb.a(cxd.e)
                     .a(1, ld.a().a(le.c, lk.bo.a(csy.fu, "_level1", ll.j(ll.a(csy.G, "_still")), this.c)))
                     .a(2, ld.a().a(le.c, lk.bp.a(csy.fu, "_level2", ll.j(ll.a(csy.G, "_still")), this.c)))
                     .a(3, ld.a().a(le.c, lk.bq.a(csy.fu, "_full", ll.j(ll.a(csy.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            la.a(csy.fw)
               .a(
                  lb.a(cxd.e)
                     .a(1, ld.a().a(le.c, lk.bo.a(csy.fw, "_level1", ll.j(ll.G(csy.qC)), this.c)))
                     .a(2, ld.a().a(le.c, lk.bp.a(csy.fw, "_level2", ll.j(ll.G(csy.qC)), this.c)))
                     .a(3, ld.a().a(le.c, lk.bq.a(csy.fw, "_full", ll.j(ll.G(csy.qC)), this.c)))
               )
         );
   }

   private void B() {
      ll $$0 = ll.b(csy.kv);
      aey $$1 = lk.aC.a(csy.kv, $$0, this.c);
      aey $$2 = this.a(csy.kv, "_dead", lk.aC, $$1x -> $$0.c(lm.b, $$1x));
      this.b.accept(la.a(csy.kv).a(a(dgb.au, 5, $$2, $$1)));
   }

   private void v(csx $$0) {
      ll $$1 = new ll().a(lm.f, ll.a(csy.cD, "_top")).a(lm.i, ll.a(csy.cD, "_side")).a(lm.g, ll.a($$0, "_front"));
      ll $$2 = new ll().a(lm.i, ll.a(csy.cD, "_top")).a(lm.g, ll.a($$0, "_front_vertical"));
      aey $$3 = lk.n.a($$0, $$1, this.c);
      aey $$4 = lk.p.a($$0, $$2, this.c);
      this.b
         .accept(
            la.a($$0)
               .a(
                  lb.a(dgb.P)
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
      aey $$0 = li.a(csy.fy);
      aey $$1 = li.a(csy.fy, "_filled");
      this.b.accept(la.a(csy.fy).a(lb.a(dgb.h).a(false, ld.a().a(le.c, $$0)).a(true, ld.a().a(le.c, $$1))).a(c()));
   }

   private void D() {
      aey $$0 = li.a(csy.ku, "_side");
      aey $$1 = li.a(csy.ku, "_noside");
      aey $$2 = li.a(csy.ku, "_noside1");
      aey $$3 = li.a(csy.ku, "_noside2");
      aey $$4 = li.a(csy.ku, "_noside3");
      this.b
         .accept(
            kz.a(csy.ku)
               .a(ky.a().a(dgb.L, true), ld.a().a(le.c, $$0))
               .a(ky.a().a(dgb.M, true), ld.a().a(le.c, $$0).a(le.b, le.a.b).a(le.d, true))
               .a(ky.a().a(dgb.N, true), ld.a().a(le.c, $$0).a(le.b, le.a.c).a(le.d, true))
               .a(ky.a().a(dgb.O, true), ld.a().a(le.c, $$0).a(le.b, le.a.d).a(le.d, true))
               .a(ky.a().a(dgb.J, true), ld.a().a(le.c, $$0).a(le.a, le.a.d).a(le.d, true))
               .a(ky.a().a(dgb.K, true), ld.a().a(le.c, $$0).a(le.a, le.a.b).a(le.d, true))
               .a(ky.a().a(dgb.L, false), ld.a().a(le.c, $$1).a(le.e, 2), ld.a().a(le.c, $$2), ld.a().a(le.c, $$3), ld.a().a(le.c, $$4))
               .a(
                  ky.a().a(dgb.M, false),
                  ld.a().a(le.c, $$2).a(le.b, le.a.b).a(le.d, true),
                  ld.a().a(le.c, $$3).a(le.b, le.a.b).a(le.d, true),
                  ld.a().a(le.c, $$4).a(le.b, le.a.b).a(le.d, true),
                  ld.a().a(le.c, $$1).a(le.e, 2).a(le.b, le.a.b).a(le.d, true)
               )
               .a(
                  ky.a().a(dgb.N, false),
                  ld.a().a(le.c, $$3).a(le.b, le.a.c).a(le.d, true),
                  ld.a().a(le.c, $$4).a(le.b, le.a.c).a(le.d, true),
                  ld.a().a(le.c, $$1).a(le.e, 2).a(le.b, le.a.c).a(le.d, true),
                  ld.a().a(le.c, $$2).a(le.b, le.a.c).a(le.d, true)
               )
               .a(
                  ky.a().a(dgb.O, false),
                  ld.a().a(le.c, $$4).a(le.b, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$1).a(le.e, 2).a(le.b, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$2).a(le.b, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$3).a(le.b, le.a.d).a(le.d, true)
               )
               .a(
                  ky.a().a(dgb.J, false),
                  ld.a().a(le.c, $$1).a(le.e, 2).a(le.a, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$4).a(le.a, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$2).a(le.a, le.a.d).a(le.d, true),
                  ld.a().a(le.c, $$3).a(le.a, le.a.d).a(le.d, true)
               )
               .a(
                  ky.a().a(dgb.K, false),
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
            kz.a(csy.pc)
               .a(ld.a().a(le.c, ll.G(csy.pc)))
               .a(ky.a().a(dgb.aL, 1), ld.a().a(le.c, ll.a(csy.pc, "_contents1")))
               .a(ky.a().a(dgb.aL, 2), ld.a().a(le.c, ll.a(csy.pc, "_contents2")))
               .a(ky.a().a(dgb.aL, 3), ld.a().a(le.c, ll.a(csy.pc, "_contents3")))
               .a(ky.a().a(dgb.aL, 4), ld.a().a(le.c, ll.a(csy.pc, "_contents4")))
               .a(ky.a().a(dgb.aL, 5), ld.a().a(le.c, ll.a(csy.pc, "_contents5")))
               .a(ky.a().a(dgb.aL, 6), ld.a().a(le.c, ll.a(csy.pc, "_contents6")))
               .a(ky.a().a(dgb.aL, 7), ld.a().a(le.c, ll.a(csy.pc, "_contents7")))
               .a(ky.a().a(dgb.aL, 8), ld.a().a(le.c, ll.a(csy.pc, "_contents_ready")))
         );
   }

   private void w(csx $$0) {
      this.c($$0);
      this.b.accept(la.a($$0, ld.a().a(le.c, lk.am.a($$0, ll.c($$0), this.c))).a(this.n()));
   }

   private void F() {
      this.w(csy.qy);
      this.w(csy.qx);
      this.w(csy.qw);
      this.w(csy.qv);
   }

   private void G() {
      this.c(csy.rs);
      lb.b<hc, dgi> $$0 = lb.a(dgb.bm, dgb.bn);

      for (dgi $$1 : dgi.values()) {
         $$0.a(hc.b, $$1, this.a(hc.b, $$1));
      }

      for (dgi $$2 : dgi.values()) {
         $$0.a(hc.a, $$2, this.a(hc.a, $$2));
      }

      this.b.accept(la.a(csy.rs).a($$0));
   }

   private ld a(hc $$0, dgi $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ll $$3 = ll.c(ll.a(csy.rs, $$2));
      return ld.a().a(le.c, lk.al.a(csy.rs, $$2, $$3, this.c));
   }

   private void x(csx $$0) {
      ll $$1 = new ll().a(lm.e, ll.G(csy.dW)).a(lm.f, ll.G($$0)).a(lm.i, ll.a($$0, "_side"));
      this.b.accept(c($$0, lk.m.a($$0, $$1, this.c)));
   }

   private void H() {
      aey $$0 = ll.a(csy.gZ, "_side");
      ll $$1 = new ll().a(lm.f, ll.a(csy.gZ, "_top")).a(lm.i, $$0);
      ll $$2 = new ll().a(lm.f, ll.a(csy.gZ, "_inverted_top")).a(lm.i, $$0);
      this.b
         .accept(
            la.a(csy.gZ)
               .a(lb.a(dgb.p).a(false, ld.a().a(le.c, lk.aD.a(csy.gZ, $$1, this.c))).a(true, ld.a().a(le.c, lk.aD.a(li.a(csy.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(csx $$0) {
      this.b.accept(la.a($$0, ld.a().a(le.c, li.a($$0))).a(this.n()));
   }

   private void I() {
      csx $$0 = csy.rr;
      aey $$1 = li.a($$0, "_on");
      aey $$2 = li.a($$0);
      this.b.accept(la.a($$0, ld.a().a(le.c, li.a($$0))).a(this.n()).a(a(dgb.w, $$1, $$2)));
   }

   private void J() {
      ll $$0 = new ll().a(lm.B, ll.G(csy.j)).a(lm.f, ll.G(csy.cC));
      ll $$1 = new ll().a(lm.B, ll.G(csy.j)).a(lm.f, ll.a(csy.cC, "_moist"));
      aey $$2 = lk.aU.a(csy.cC, $$0, this.c);
      aey $$3 = lk.aU.a(ll.a(csy.cC, "_moist"), $$1, this.c);
      this.b.accept(la.a(csy.cC).a(a(dgb.aQ, 7, $$3, $$2)));
   }

   private List<aey> z(csx $$0) {
      aey $$1 = lk.aV.a(li.a($$0, "_floor0"), ll.v($$0), this.c);
      aey $$2 = lk.aV.a(li.a($$0, "_floor1"), ll.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aey> A(csx $$0) {
      aey $$1 = lk.aW.a(li.a($$0, "_side0"), ll.v($$0), this.c);
      aey $$2 = lk.aW.a(li.a($$0, "_side1"), ll.w($$0), this.c);
      aey $$3 = lk.aX.a(li.a($$0, "_side_alt0"), ll.v($$0), this.c);
      aey $$4 = lk.aX.a(li.a($$0, "_side_alt1"), ll.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aey> B(csx $$0) {
      aey $$1 = lk.aY.a(li.a($$0, "_up0"), ll.v($$0), this.c);
      aey $$2 = lk.aY.a(li.a($$0, "_up1"), ll.w($$0), this.c);
      aey $$3 = lk.aZ.a(li.a($$0, "_up_alt0"), ll.v($$0), this.c);
      aey $$4 = lk.aZ.a(li.a($$0, "_up_alt1"), ll.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<ld> a(List<aey> $$0, UnaryOperator<ld> $$1) {
      return $$0.stream().map($$0x -> ld.a().a(le.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void K() {
      ky $$0 = ky.a().a(dgb.L, false).a(dgb.M, false).a(dgb.N, false).a(dgb.O, false).a(dgb.J, false);
      List<aey> $$1 = this.z(csy.cr);
      List<aey> $$2 = this.A(csy.cr);
      List<aey> $$3 = this.B(csy.cr);
      this.b
         .accept(
            kz.a(csy.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(ky.b(ky.a().a(dgb.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(ky.b(ky.a().a(dgb.M, true), $$0), a($$2, $$0x -> $$0x.a(le.b, le.a.b)))
               .a(ky.b(ky.a().a(dgb.N, true), $$0), a($$2, $$0x -> $$0x.a(le.b, le.a.c)))
               .a(ky.b(ky.a().a(dgb.O, true), $$0), a($$2, $$0x -> $$0x.a(le.b, le.a.d)))
               .a(ky.a().a(dgb.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void L() {
      List<aey> $$0 = this.z(csy.cs);
      List<aey> $$1 = this.A(csy.cs);
      this.b
         .accept(
            kz.a(csy.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(le.b, le.a.b)))
               .a(a($$1, $$0x -> $$0x.a(le.b, le.a.c)))
               .a(a($$1, $$0x -> $$0x.a(le.b, le.a.d)))
         );
   }

   private void C(csx $$0) {
      aey $$1 = ln.s.create($$0, this.c);
      aey $$2 = ln.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(la.a($$0).a(a(dgb.j, $$2, $$1)));
   }

   private void M() {
      ll $$0 = ll.a(ll.a(csy.ad, "_side"), ll.a(csy.ad, "_top"));
      aey $$1 = lk.i.a(csy.ad, $$0, this.c);
      this.b.accept(d(csy.ad, $$1));
   }

   private void N() {
      this.a(cjk.Q);
      csx $$0 = csy.E;
      lb.b<Boolean, Integer> $$1 = lb.a(cxp.c, cxp.a);
      aey $$2 = li.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aey $$4 = li.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, ld.a().a(le.c, $$4));
         $$1.a(false, $$3, ld.a().a(le.c, $$2));
      }

      this.b.accept(la.a(csy.E).a($$1));
   }

   private void O() {
      this.b
         .accept(
            la.a(csy.kI)
               .a(
                  lb.a(dgb.as)
                     .a(0, ld.a().a(le.c, this.a(csy.kI, "_0", lk.c, ll::b)))
                     .a(1, ld.a().a(le.c, this.a(csy.kI, "_1", lk.c, ll::b)))
                     .a(2, ld.a().a(le.c, this.a(csy.kI, "_2", lk.c, ll::b)))
                     .a(3, ld.a().a(le.c, this.a(csy.kI, "_3", lk.c, ll::b)))
               )
         );
   }

   private void P() {
      aey $$0 = ll.G(csy.j);
      ll $$1 = new ll().a(lm.e, $$0).b(lm.e, lm.c).a(lm.f, ll.a(csy.i, "_top")).a(lm.i, ll.a(csy.i, "_snow"));
      ld $$2 = ld.a().a(le.c, lk.m.a(csy.i, "_snow", $$1, this.c));
      this.a(csy.i, li.a(csy.i), $$2);
      aey $$3 = ln.e.get(csy.fl).a($$1x -> $$1x.a(lm.e, $$0)).a(csy.fl, this.c);
      this.a(csy.fl, $$3, $$2);
      aey $$4 = ln.e.get(csy.l).a($$1x -> $$1x.a(lm.e, $$0)).a(csy.l, this.c);
      this.a(csy.l, $$4, $$2);
   }

   private void a(csx $$0, aey $$1, ld $$2) {
      List<ld> $$3 = Arrays.asList(a($$1));
      this.b.accept(la.a($$0).a(lb.a(dgb.z).a(true, $$2).a(false, $$3)));
   }

   private void Q() {
      this.a(cjk.qt);
      this.b
         .accept(
            la.a(csy.fC)
               .a(
                  lb.a(dgb.ar)
                     .a(0, ld.a().a(le.c, li.a(csy.fC, "_stage0")))
                     .a(1, ld.a().a(le.c, li.a(csy.fC, "_stage1")))
                     .a(2, ld.a().a(le.c, li.a(csy.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void R() {
      this.b.accept(b(csy.kE, li.a(csy.kE)));
   }

   private void g(csx $$0, csx $$1) {
      ll $$2 = ll.b($$1);
      aey $$3 = lk.W.a($$0, $$2, this.c);
      aey $$4 = lk.X.a($$0, $$2, this.c);
      this.b.accept(la.a($$0).a(a(dgb.aT, 1, $$4, $$3)));
   }

   private void S() {
      aey $$0 = li.a(csy.hc);
      aey $$1 = li.a(csy.hc, "_side");
      this.a(cjk.lv);
      this.b
         .accept(
            la.a(csy.hc)
               .a(
                  lb.a(dgb.Q)
                     .a(hc.a, ld.a().a(le.c, $$0))
                     .a(hc.c, ld.a().a(le.c, $$1))
                     .a(hc.f, ld.a().a(le.c, $$1).a(le.b, le.a.b))
                     .a(hc.d, ld.a().a(le.c, $$1).a(le.b, le.a.c))
                     .a(hc.e, ld.a().a(le.c, $$1).a(le.b, le.a.d))
               )
         );
   }

   private void h(csx $$0, csx $$1) {
      aey $$2 = li.a($$0);
      this.b.accept(la.a($$1, ld.a().a(le.c, $$2)));
      this.a($$1, $$2);
   }

   private void T() {
      aey $$0 = li.a(csy.eX, "_post_ends");
      aey $$1 = li.a(csy.eX, "_post");
      aey $$2 = li.a(csy.eX, "_cap");
      aey $$3 = li.a(csy.eX, "_cap_alt");
      aey $$4 = li.a(csy.eX, "_side");
      aey $$5 = li.a(csy.eX, "_side_alt");
      this.b
         .accept(
            kz.a(csy.eX)
               .a(ld.a().a(le.c, $$0))
               .a(ky.a().a(dgb.L, false).a(dgb.M, false).a(dgb.N, false).a(dgb.O, false), ld.a().a(le.c, $$1))
               .a(ky.a().a(dgb.L, true).a(dgb.M, false).a(dgb.N, false).a(dgb.O, false), ld.a().a(le.c, $$2))
               .a(ky.a().a(dgb.L, false).a(dgb.M, true).a(dgb.N, false).a(dgb.O, false), ld.a().a(le.c, $$2).a(le.b, le.a.b))
               .a(ky.a().a(dgb.L, false).a(dgb.M, false).a(dgb.N, true).a(dgb.O, false), ld.a().a(le.c, $$3))
               .a(ky.a().a(dgb.L, false).a(dgb.M, false).a(dgb.N, false).a(dgb.O, true), ld.a().a(le.c, $$3).a(le.b, le.a.b))
               .a(ky.a().a(dgb.L, true), ld.a().a(le.c, $$4))
               .a(ky.a().a(dgb.M, true), ld.a().a(le.c, $$4).a(le.b, le.a.b))
               .a(ky.a().a(dgb.N, true), ld.a().a(le.c, $$5))
               .a(ky.a().a(dgb.O, true), ld.a().a(le.c, $$5).a(le.b, le.a.b))
         );
      this.d(csy.eX);
   }

   private void D(csx $$0) {
      this.b.accept(la.a($$0, ld.a().a(le.c, li.a($$0))).a(b()));
   }

   private void U() {
      aey $$0 = li.a(csy.dw);
      aey $$1 = li.a(csy.dw, "_on");
      this.d(csy.dw);
      this.b
         .accept(
            la.a(csy.dw)
               .a(a(dgb.w, $$0, $$1))
               .a(
                  lb.a(dgb.U, dgb.R)
                     .a(dfw.c, hc.c, ld.a().a(le.a, le.a.c).a(le.b, le.a.c))
                     .a(dfw.c, hc.f, ld.a().a(le.a, le.a.c).a(le.b, le.a.d))
                     .a(dfw.c, hc.d, ld.a().a(le.a, le.a.c))
                     .a(dfw.c, hc.e, ld.a().a(le.a, le.a.c).a(le.b, le.a.b))
                     .a(dfw.a, hc.c, ld.a())
                     .a(dfw.a, hc.f, ld.a().a(le.b, le.a.b))
                     .a(dfw.a, hc.d, ld.a().a(le.b, le.a.c))
                     .a(dfw.a, hc.e, ld.a().a(le.b, le.a.d))
                     .a(dfw.b, hc.c, ld.a().a(le.a, le.a.b))
                     .a(dfw.b, hc.f, ld.a().a(le.a, le.a.b).a(le.b, le.a.b))
                     .a(dfw.b, hc.d, ld.a().a(le.a, le.a.b).a(le.b, le.a.c))
                     .a(dfw.b, hc.e, ld.a().a(le.a, le.a.b).a(le.b, le.a.d))
               )
         );
   }

   private void V() {
      this.d(csy.fm);
      this.b.accept(b(csy.fm, li.a(csy.fm)));
   }

   private void W() {
      this.d(csy.sm);
      this.b.accept(c(csy.sm, li.a(csy.sm)));
   }

   private void X() {
      this.b.accept(la.a(csy.ee).a(lb.a(dgb.H).a(hc.a.a, ld.a().a(le.c, li.a(csy.ee, "_ns"))).a(hc.a.c, ld.a().a(le.c, li.a(csy.ee, "_ew")))));
   }

   private void Y() {
      aey $$0 = ln.a.create(csy.dW, this.c);
      this.b
         .accept(
            la.a(
               csy.dW,
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
      aey $$0 = li.a(csy.kO);
      aey $$1 = li.a(csy.kO, "_on");
      this.b.accept(la.a(csy.kO).a(a(dgb.w, $$1, $$0)).a(e()));
   }

   private void aa() {
      ll $$0 = new ll().a(lm.e, ll.a(csy.by, "_bottom")).a(lm.i, ll.a(csy.by, "_side"));
      aey $$1 = ll.a(csy.by, "_top_sticky");
      aey $$2 = ll.a(csy.by, "_top");
      ll $$3 = $$0.c(lm.E, $$1);
      ll $$4 = $$0.c(lm.E, $$2);
      aey $$5 = li.a(csy.by, "_base");
      this.a(csy.by, $$5, $$4);
      this.a(csy.br, $$5, $$3);
      aey $$6 = lk.m.a(csy.by, "_inventory", $$0.c(lm.f, $$2), this.c);
      aey $$7 = lk.m.a(csy.br, "_inventory", $$0.c(lm.f, $$1), this.c);
      this.a(csy.by, $$6);
      this.a(csy.br, $$7);
   }

   private void a(csx $$0, aey $$1, ll $$2) {
      aey $$3 = lk.bf.a($$0, $$2, this.c);
      this.b.accept(la.a($$0).a(a(dgb.g, $$1, $$3)).a(e()));
   }

   private void ab() {
      ll $$0 = new ll().a(lm.F, ll.a(csy.by, "_top")).a(lm.i, ll.a(csy.by, "_side"));
      ll $$1 = $$0.c(lm.E, ll.a(csy.by, "_top_sticky"));
      ll $$2 = $$0.c(lm.E, ll.a(csy.by, "_top"));
      this.b
         .accept(
            la.a(csy.bz)
               .a(
                  lb.a(dgb.x, dgb.bg)
                     .a(false, dgn.a, ld.a().a(le.c, lk.bg.a(csy.by, "_head", $$2, this.c)))
                     .a(false, dgn.b, ld.a().a(le.c, lk.bg.a(csy.by, "_head_sticky", $$1, this.c)))
                     .a(true, dgn.a, ld.a().a(le.c, lk.bh.a(csy.by, "_head_short", $$2, this.c)))
                     .a(true, dgn.b, ld.a().a(le.c, lk.bh.a(csy.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ac() {
      aey $$0 = li.a(csy.qD, "_inactive");
      aey $$1 = li.a(csy.qD, "_active");
      this.a(csy.qD, $$0);
      this.b.accept(la.a(csy.qD).a(lb.a(dgb.bo).a($$2 -> ld.a().a(le.c, $$2 != dgs.b && $$2 != dgs.c ? $$0 : $$1))));
   }

   private void ad() {
      aey $$0 = li.a(csy.qE, "_inactive");
      aey $$1 = li.a(csy.qE, "_active");
      this.a(csy.qE, $$0);
      this.b.accept(la.a(csy.qE).a(lb.a(dgb.bo).a($$2 -> ld.a().a(le.c, $$2 != dgs.b && $$2 != dgs.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      aey $$0 = lk.bK.a(csy.qI, ll.a(false), this.c);
      aey $$1 = lk.bK.a(csy.qI, "_can_summon", ll.a(true), this.c);
      this.a(csy.qI, $$0);
      this.b.accept(la.a(csy.qI).a(a(dgb.G, $$1, $$0)));
   }

   private void af() {
      aey $$0 = li.a(csy.nS, "_stable");
      aey $$1 = li.a(csy.nS, "_unstable");
      this.a(csy.nS, $$0);
      this.b.accept(la.a(csy.nS).a(a(dgb.b, $$1, $$0)));
   }

   private void ag() {
      aey $$0 = this.a(csy.ru, "", lk.am, ll::c);
      aey $$1 = this.a(csy.ru, "_lit", lk.am, ll::c);
      this.b.accept(la.a(csy.ru).a(a(dgb.D, $$1, $$0)));
      aey $$2 = this.a(csy.rv, "", lk.am, ll::c);
      aey $$3 = this.a(csy.rv, "_lit", lk.am, ll::c);
      this.b.accept(la.a(csy.rv).a(a(dgb.D, $$3, $$2)));
   }

   private void ah() {
      aey $$0 = ln.a.create(csy.fB, this.c);
      aey $$1 = this.a(csy.fB, "_on", lk.c, ll::b);
      this.b.accept(la.a(csy.fB).a(a(dgb.r, $$1, $$0)));
   }

   private void i(csx $$0, csx $$1) {
      ll $$2 = ll.y($$0);
      this.b.accept(c($$0, lk.bd.a($$0, $$2, this.c)));
      this.b.accept(la.a($$1, ld.a().a(le.c, lk.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      ll $$0 = ll.y(csy.dK);
      ll $$1 = ll.i(ll.a(csy.dK, "_off"));
      aey $$2 = lk.bd.a(csy.dK, $$0, this.c);
      aey $$3 = lk.bd.a(csy.dK, "_off", $$1, this.c);
      this.b.accept(la.a(csy.dK).a(a(dgb.r, $$2, $$3)));
      aey $$4 = lk.be.a(csy.dL, $$0, this.c);
      aey $$5 = lk.be.a(csy.dL, "_off", $$1, this.c);
      this.b.accept(la.a(csy.dL).a(a(dgb.r, $$4, $$5)).a(d()));
      this.d(csy.dK);
      this.c(csy.dL);
   }

   private void aj() {
      this.a(cjk.lo);
      this.b.accept(la.a(csy.ei).a(lb.a(dgb.aA, dgb.s, dgb.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return ld.a().a(le.c, ll.a(csy.ei, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(cjk.cx);
      this.b
         .accept(
            la.a(csy.mV)
               .a(
                  lb.a(dgb.aS, dgb.C)
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
      ll $$0 = ll.a(csy.dN);
      aey $$1 = lk.c.a(csy.dP, $$0, this.c);
      this.b.accept(la.a(csy.dN).a(lb.a(dgb.aF).a($$1x -> ld.a().a(le.c, $$1x < 8 ? li.a(csy.dN, "_height" + $$1x * 2) : $$1))));
      this.a(csy.dN, li.a(csy.dN, "_height2"));
      this.b.accept(c(csy.dP, $$1));
   }

   private void am() {
      this.b.accept(la.a(csy.oc, ld.a().a(le.c, li.a(csy.oc))).a(b()));
   }

   private void an() {
      aey $$0 = ln.a.create(csy.pa, this.c);
      this.a(csy.pa, $$0);
      this.b.accept(la.a(csy.pa).a(lb.a(dgb.bj).a($$0x -> ld.a().a(le.c, this.a(csy.pa, "_" + $$0x.c(), lk.c, ll::b)))));
   }

   private void ao() {
      this.a(cjk.vv);
      this.b.accept(la.a(csy.oi).a(lb.a(dgb.as).a($$0 -> ld.a().a(le.c, this.a(csy.oi, "_stage" + $$0, lk.am, ll::c)))));
   }

   private void ap() {
      this.a(cjk.oE);
      this.b
         .accept(
            la.a(csy.fI)
               .a(
                  lb.a(dgb.a, dgb.M, dgb.L, dgb.N, dgb.O)
                     .a(false, false, false, false, false, ld.a().a(le.c, li.a(csy.fI, "_ns")))
                     .a(false, true, false, false, false, ld.a().a(le.c, li.a(csy.fI, "_n")).a(le.b, le.a.b))
                     .a(false, false, true, false, false, ld.a().a(le.c, li.a(csy.fI, "_n")))
                     .a(false, false, false, true, false, ld.a().a(le.c, li.a(csy.fI, "_n")).a(le.b, le.a.c))
                     .a(false, false, false, false, true, ld.a().a(le.c, li.a(csy.fI, "_n")).a(le.b, le.a.d))
                     .a(false, true, true, false, false, ld.a().a(le.c, li.a(csy.fI, "_ne")))
                     .a(false, true, false, true, false, ld.a().a(le.c, li.a(csy.fI, "_ne")).a(le.b, le.a.b))
                     .a(false, false, false, true, true, ld.a().a(le.c, li.a(csy.fI, "_ne")).a(le.b, le.a.c))
                     .a(false, false, true, false, true, ld.a().a(le.c, li.a(csy.fI, "_ne")).a(le.b, le.a.d))
                     .a(false, false, true, true, false, ld.a().a(le.c, li.a(csy.fI, "_ns")))
                     .a(false, true, false, false, true, ld.a().a(le.c, li.a(csy.fI, "_ns")).a(le.b, le.a.b))
                     .a(false, true, true, true, false, ld.a().a(le.c, li.a(csy.fI, "_nse")))
                     .a(false, true, false, true, true, ld.a().a(le.c, li.a(csy.fI, "_nse")).a(le.b, le.a.b))
                     .a(false, false, true, true, true, ld.a().a(le.c, li.a(csy.fI, "_nse")).a(le.b, le.a.c))
                     .a(false, true, true, false, true, ld.a().a(le.c, li.a(csy.fI, "_nse")).a(le.b, le.a.d))
                     .a(false, true, true, true, true, ld.a().a(le.c, li.a(csy.fI, "_nsew")))
                     .a(true, false, false, false, false, ld.a().a(le.c, li.a(csy.fI, "_attached_ns")))
                     .a(true, false, true, false, false, ld.a().a(le.c, li.a(csy.fI, "_attached_n")))
                     .a(true, false, false, true, false, ld.a().a(le.c, li.a(csy.fI, "_attached_n")).a(le.b, le.a.c))
                     .a(true, true, false, false, false, ld.a().a(le.c, li.a(csy.fI, "_attached_n")).a(le.b, le.a.b))
                     .a(true, false, false, false, true, ld.a().a(le.c, li.a(csy.fI, "_attached_n")).a(le.b, le.a.d))
                     .a(true, true, true, false, false, ld.a().a(le.c, li.a(csy.fI, "_attached_ne")))
                     .a(true, true, false, true, false, ld.a().a(le.c, li.a(csy.fI, "_attached_ne")).a(le.b, le.a.b))
                     .a(true, false, false, true, true, ld.a().a(le.c, li.a(csy.fI, "_attached_ne")).a(le.b, le.a.c))
                     .a(true, false, true, false, true, ld.a().a(le.c, li.a(csy.fI, "_attached_ne")).a(le.b, le.a.d))
                     .a(true, false, true, true, false, ld.a().a(le.c, li.a(csy.fI, "_attached_ns")))
                     .a(true, true, false, false, true, ld.a().a(le.c, li.a(csy.fI, "_attached_ns")).a(le.b, le.a.b))
                     .a(true, true, true, true, false, ld.a().a(le.c, li.a(csy.fI, "_attached_nse")))
                     .a(true, true, false, true, true, ld.a().a(le.c, li.a(csy.fI, "_attached_nse")).a(le.b, le.a.b))
                     .a(true, false, true, true, true, ld.a().a(le.c, li.a(csy.fI, "_attached_nse")).a(le.b, le.a.c))
                     .a(true, true, true, false, true, ld.a().a(le.c, li.a(csy.fI, "_attached_nse")).a(le.b, le.a.d))
                     .a(true, true, true, true, true, ld.a().a(le.c, li.a(csy.fI, "_attached_nsew")))
               )
         );
   }

   private void aq() {
      this.d(csy.fH);
      this.b.accept(la.a(csy.fH).a(lb.a(dgb.a, dgb.w).a(($$0, $$1) -> ld.a().a(le.c, ll.a(csy.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aey a(int $$0, String $$1, ll $$2) {
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

   private aey a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", ll.b(ll.G(csy.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ll.b(ll.a(csy.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ll.b(ll.a(csy.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ar() {
      this.a(cjk.jT);
      this.b.accept(la.a(csy.mf).a(lb.a(dgb.aD, dgb.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void as() {
      this.a(cjk.jU);
      Function<Integer, aey> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ll $$2 = ll.a($$1);
         return lk.bu.a(csy.mg, $$1, $$2, this.c);
      };
      this.b.accept(la.a(csy.mg).a(lb.a(daf.b).a($$1 -> ld.a().a(le.c, $$0.apply($$1)))));
   }

   private void E(csx $$0) {
      this.d($$0);
      aey $$1 = li.a($$0);
      kz $$2 = kz.a($$0);
      ky.c $$3 = ac.a(ky.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dgc, Function<aey, ld>> $$4 : a) {
         dgc $$5 = (dgc)$$4.getFirst();
         Function<aey, ld> $$6 = (Function<aey, ld>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(ky.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void at() {
      aey $$0 = ll.a(csy.qH, "_bottom");
      ll $$1 = new ll().a(lm.e, $$0).a(lm.f, ll.a(csy.qH, "_top")).a(lm.i, ll.a(csy.qH, "_side"));
      ll $$2 = new ll().a(lm.e, $$0).a(lm.f, ll.a(csy.qH, "_top_bloom")).a(lm.i, ll.a(csy.qH, "_side_bloom"));
      aey $$3 = lk.m.a(csy.qH, "", $$1, this.c);
      aey $$4 = lk.m.a(csy.qH, "_bloom", $$2, this.c);
      this.b.accept(la.a(csy.qH).a(lb.a(dgb.E).a($$2x -> ld.a().a(le.c, $$2x ? $$4 : $$3))));
      this.a(cjk.fN, $$3);
   }

   private void au() {
      csx $$0 = csy.cm;
      aey $$1 = li.a($$0);
      kz $$2 = kz.a($$0);
      Map.of(hc.c, le.a.a, hc.f, le.a.b, hc.d, le.a.c, hc.e, le.a.d).forEach(($$2x, $$3) -> {
         ky.c $$4 = ky.a().a(dgb.R, $$2x);
         $$2.a($$4, ld.a().a(le.c, $$1).a(le.b, $$3).a(le.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, li.a($$0, "_inventory"));
      i.clear();
   }

   private void a(kz $$0, ky.c $$1, le.a $$2) {
      Map.of(dgb.bp, lk.aK, dgb.bq, lk.aL, dgb.br, lk.aM, dgb.bs, lk.aN, dgb.bt, lk.aO, dgb.bu, lk.aP).forEach(($$3, $$4) -> {
         this.a($$0, $$1, $$2, $$3, $$4, true);
         this.a($$0, $$1, $$2, $$3, $$4, false);
      });
   }

   private void a(kz $$0, ky.c $$1, le.a $$2, dgc $$3, lj $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ll $$7 = new ll().a(lm.b, ll.a(csy.cm, $$6));
      ku.d $$8 = new ku.d($$4, $$6);
      aey $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(csy.cm, $$6, $$7, this.c));
      $$0.a(ky.a($$1, ky.a().a($$3, $$5)), ld.a().a(le.c, $$9).a(le.b, $$2));
   }

   private void av() {
      this.b.accept(c(csy.kJ, lk.c.a(csy.kJ, ll.b(li.a("magma")), this.c)));
   }

   private void F(csx $$0) {
      this.b($$0, ln.p);
      lk.bB.a(li.a($$0.k()), ll.u($$0), this.c);
   }

   private void b(csx $$0, csx $$1, ku.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(csx $$0, csx $$1) {
      lk.bC.a(li.a($$0.k()), ll.u($$1), this.c);
   }

   private void aw() {
      aey $$0 = li.a(csy.b);
      aey $$1 = li.a(csy.b, "_mirrored");
      this.b.accept(a(csy.eO, $$0, $$1));
      this.a(csy.eO, $$0);
   }

   private void ax() {
      aey $$0 = li.a(csy.rI);
      aey $$1 = li.a(csy.rI, "_mirrored");
      this.b.accept(a(csy.sc, $$0, $$1).a(f()));
      this.a(csy.sc, $$0);
   }

   private void k(csx $$0, csx $$1) {
      this.a($$0, ku.e.b);
      ll $$2 = ll.d(ll.a($$0, "_pot"));
      aey $$3 = ku.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void ay() {
      aey $$0 = ll.a(csy.pl, "_bottom");
      aey $$1 = ll.a(csy.pl, "_top_off");
      aey $$2 = ll.a(csy.pl, "_top");
      aey[] $$3 = new aey[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ll $$5 = new ll().a(lm.e, $$0).a(lm.f, $$4 == 0 ? $$1 : $$2).a(lm.i, ll.a(csy.pl, "_side" + $$4));
         $$3[$$4] = lk.m.a(csy.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(la.a(csy.pl).a(lb.a(dgb.aZ).a($$1x -> ld.a().a(le.c, $$3[$$1x]))));
      this.a(cjk.vT, $$3[0]);
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
      aey $$0 = ll.a(csy.pb, "_top");
      aey $$1 = ll.a(csy.pb, "_bottom");
      aey $$2 = ll.a(csy.pb, "_side");
      aey $$3 = ll.a(csy.pb, "_lock");
      ll $$4 = new ll().a(lm.o, $$2).a(lm.m, $$2).a(lm.l, $$2).a(lm.c, $$0).a(lm.j, $$0).a(lm.k, $$1).a(lm.n, $$3);
      aey $$5 = lk.b.a(csy.pb, $$4, this.c);
      this.b.accept(la.a(csy.pb, ld.a().a(le.c, $$5)).a(lb.a(dgb.T).a($$0x -> this.a($$0x, ld.a()))));
   }

   private void aA() {
      csx $$0 = csy.n;
      aey $$1 = li.a($$0);
      ln $$2 = ln.a.get($$0);
      csx $$3 = csy.jH;
      aey $$4 = lk.Z.a($$3, $$2.b(), this.c);
      aey $$5 = lk.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      jg.a().filter(jh::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(csy.qS).a(jg.w).a(csy.ri).a(jg.y);
      this.h(csy.qR).a(jg.A).a(csy.rh).a(jg.C);
      this.h(csy.qQ).a(jg.E).a(csy.rg).a(jg.G);
      this.h(csy.qP).a(jg.I).a(csy.rf).a(jg.K);
      this.m(csy.a);
      this.a(csy.nc, csy.a);
      this.a(csy.nb, csy.a);
      this.m(csy.fO);
      this.m(csy.dQ);
      this.a(csy.nd, csy.G);
      this.m(csy.fA);
      this.m(csy.me);
      this.m(csy.fr);
      this.m(csy.fR);
      this.a(cjk.tk);
      this.m(csy.pg);
      this.m(csy.G);
      this.m(csy.H);
      this.m(csy.hV);
      this.a(cjk.fw);
      this.l(csy.pM, csy.qd);
      this.l(csy.pN, csy.qe);
      this.l(csy.pO, csy.qf);
      this.l(csy.pP, csy.qg);
      this.l(csy.pQ, csy.qh);
      this.l(csy.pR, csy.qi);
      this.l(csy.pS, csy.qj);
      this.l(csy.pT, csy.qk);
      this.l(csy.pU, csy.ql);
      this.l(csy.pV, csy.qm);
      this.l(csy.pW, csy.qn);
      this.l(csy.pX, csy.qo);
      this.l(csy.pY, csy.qp);
      this.l(csy.pZ, csy.qq);
      this.l(csy.qa, csy.qr);
      this.l(csy.qb, csy.qs);
      this.l(csy.pL, csy.qc);
      this.m(csy.na);
      this.m(csy.gs);
      this.m(csy.qC);
      this.m(csy.rw);
      this.s(csy.rx);
      this.s(csy.ry);
      this.t(csy.sh);
      this.t(csy.si);
      this.ag();
      this.e(csy.rB, csy.rz);
      this.p(csy.rA);
      this.a(csy.hW, cjk.hf);
      this.a(cjk.hf);
      this.aB();
      this.a(csy.kN, cjk.iF);
      this.a(cjk.iF);
      this.f(csy.bQ, ll.a(csy.by, "_side"));
      this.a(csy.R);
      this.a(csy.S);
      this.a(csy.iB);
      this.a(csy.cx);
      this.a(csy.cy);
      this.a(csy.cz);
      this.a(csy.fE);
      this.a(csy.fF);
      this.a(csy.fJ);
      this.a(csy.N);
      this.a(csy.T);
      this.a(csy.O);
      this.a(csy.ch);
      this.a(csy.P);
      this.a(csy.Q);
      this.a(csy.ci);
      this.b(csy.pj, ln.c);
      this.a(csy.pi);
      this.a(csy.aR);
      this.a(csy.aS);
      this.a(csy.aT);
      this.a(csy.hb);
      this.a(csy.dI);
      this.a(csy.dJ);
      this.a(csy.ha);
      this.a(csy.pC);
      this.a(csy.mW);
      this.a(csy.dR);
      this.a(csy.k);
      this.a(csy.pk);
      this.a(csy.fz);
      this.a(csy.ed);
      this.a(csy.L);
      this.a(csy.ph);
      this.a(csy.dO);
      this.b(csy.dT, ln.f);
      this.b(csy.pq, ln.c);
      this.b(csy.fa, ln.c);
      this.m(csy.ac);
      this.m(csy.ga);
      this.a(csy.kK);
      this.a(csy.aY);
      this.a(csy.iC);
      this.a(csy.co);
      this.a(csy.pK);
      this.a(csy.ii);
      this.a(csy.oy);
      this.a(csy.dX);
      this.a(csy.dY);
      this.a(csy.ct);
      this.a(csy.aO);
      this.b(csy.bw, ln.u);
      this.a(cjk.cw);
      this.b(csy.ck, ln.e);
      this.b(csy.pd, ln.c);
      this.a(csy.op);
      this.a(csy.aP);
      this.a(csy.qt);
      this.a(csy.qu);
      this.a(csy.qA);
      this.a(csy.qz);
      this.a(csy.rt);
      this.a(csy.se);
      this.a(csy.sf);
      this.a(csy.sg);
      this.e(csy.qF);
      this.aA();
      this.a(csy.qN);
      this.a(csy.qO);
      this.a(csy.qM);
      this.a(csy.qL);
      this.a(csy.qK);
      this.a(csy.qJ);
      this.h(csy.qM, csy.rb);
      this.h(csy.qL, csy.rd);
      this.h(csy.qK, csy.rc);
      this.h(csy.qJ, csy.re);
      this.g(csy.gW, csy.ch);
      this.g(csy.gX, csy.ci);
      this.F();
      this.r();
      this.au();
      this.v();
      this.w();
      this.a(csy.og, csy.oh);
      this.x();
      this.A();
      this.B();
      this.D();
      this.E();
      this.H();
      this.C();
      this.y(csy.kt);
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
      this.E(csy.ff);
      this.E(csy.fg);
      this.E(csy.qG);
      this.av();
      this.az();
      this.ac();
      this.ad();
      this.ae();
      this.W();
      this.N();
      this.M();
      this.D(csy.cO);
      this.d(csy.cO);
      this.D(csy.oa);
      this.g();
      this.D(csy.rD);
      this.i(csy.cp, csy.cq);
      this.i(csy.eb, csy.ec);
      this.a(csy.cA, csy.n, ll::c);
      this.a(csy.nY, csy.p, ll::d);
      this.x(csy.ow);
      this.x(csy.on);
      this.v(csy.aU);
      this.v(csy.hi);
      this.C(csy.oe);
      this.C(csy.of);
      this.e(csy.eY, li.a(csy.eY));
      this.a(csy.dZ, ln.c);
      this.a(csy.ea, ln.c);
      this.a(csy.sd);
      this.a(csy.kM, ln.c);
      this.f(csy.j);
      this.f(csy.rG);
      this.f(csy.I);
      this.g(csy.J);
      this.g(csy.M);
      this.f(csy.K);
      this.e(csy.F);
      this.b(csy.sn, ln.e);
      this.a(csy.ij, ln.c, ln.d);
      this.a(csy.kx, ln.v, ln.w);
      this.a(csy.hf, ln.v, ln.w);
      this.a(csy.sj, ln.c, ln.d);
      this.a(csy.sk, ln.c, ln.d);
      this.a(csy.sl, ln.c, ln.d);
      this.c(csy.nT, ln.h);
      this.z();
      this.a(csy.pe, ll::A);
      this.a(csy.pf, ll::C);
      this.a(csy.kD, dgb.as, 0, 1, 2, 3);
      this.a(csy.gt, dgb.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csy.fq, dgb.as, 0, 1, 1, 2);
      this.a(csy.gu, dgb.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csy.cB, dgb.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(csy.kA, ku.e.b, dgb.aq, 0, 1);
      this.i();
      this.h();
      this.a(li.a("decorated_pot"), csy.iA).b(csy.so);
      this.a(li.a("banner"), csy.n)
         .a(lk.bD, csy.iJ, csy.iK, csy.iL, csy.iM, csy.iN, csy.iO, csy.iP, csy.iQ, csy.iR, csy.iS, csy.iT, csy.iU, csy.iV, csy.iW, csy.iX, csy.iY)
         .b(csy.iZ, csy.ja, csy.jb, csy.jc, csy.jd, csy.je, csy.jf, csy.jg, csy.jh, csy.ji, csy.jj, csy.jk, csy.jl, csy.jm, csy.jn, csy.jo);
      this.a(li.a("bed"), csy.n)
         .b(csy.aZ, csy.ba, csy.bb, csy.bc, csy.bd, csy.be, csy.bf, csy.bg, csy.bh, csy.bi, csy.bj, csy.bk, csy.bl, csy.bm, csy.bn, csy.bo);
      this.j(csy.aZ, csy.bA);
      this.j(csy.ba, csy.bB);
      this.j(csy.bb, csy.bC);
      this.j(csy.bc, csy.bD);
      this.j(csy.bd, csy.bE);
      this.j(csy.be, csy.bF);
      this.j(csy.bf, csy.bG);
      this.j(csy.bg, csy.bH);
      this.j(csy.bh, csy.bI);
      this.j(csy.bi, csy.bJ);
      this.j(csy.bj, csy.bK);
      this.j(csy.bk, csy.bL);
      this.j(csy.bl, csy.bM);
      this.j(csy.bm, csy.bN);
      this.j(csy.bn, csy.bO);
      this.j(csy.bo, csy.bP);
      this.a(li.a("skull"), csy.dX)
         .a(lk.bE, csy.gM, csy.gK, csy.gI, csy.gE, csy.gG, csy.gQ)
         .a(csy.gO)
         .b(csy.gN, csy.gP, csy.gL, csy.gJ, csy.gF, csy.gH, csy.gR);
      this.F(csy.kP);
      this.F(csy.kQ);
      this.F(csy.kR);
      this.F(csy.kS);
      this.F(csy.kT);
      this.F(csy.kU);
      this.F(csy.kV);
      this.F(csy.kW);
      this.F(csy.kX);
      this.F(csy.kY);
      this.F(csy.kZ);
      this.F(csy.la);
      this.F(csy.lb);
      this.F(csy.lc);
      this.F(csy.ld);
      this.F(csy.le);
      this.F(csy.lf);
      this.b(csy.mX, ln.p);
      this.c(csy.mX);
      this.a(li.a("chest"), csy.n).b(csy.cv, csy.gV);
      this.a(li.a("ender_chest"), csy.co).b(csy.fG);
      this.d(csy.fx, csy.co).a(csy.fx, csy.kF);
      this.a(csy.aM);
      this.a(csy.aN);
      this.a(csy.lw);
      this.a(csy.lx);
      this.a(csy.ly);
      this.a(csy.lz);
      this.a(csy.lA);
      this.a(csy.lB);
      this.a(csy.lC);
      this.a(csy.lD);
      this.a(csy.lE);
      this.a(csy.lF);
      this.a(csy.lG);
      this.a(csy.lH);
      this.a(csy.lI);
      this.a(csy.lJ);
      this.a(csy.lK);
      this.a(csy.lL);
      this.a(ln.a, csy.lM, csy.lN, csy.lO, csy.lP, csy.lQ, csy.lR, csy.lS, csy.lT, csy.lU, csy.lV, csy.lW, csy.lX, csy.lY, csy.lZ, csy.ma, csy.mb);
      this.a(csy.iA);
      this.a(csy.hj);
      this.a(csy.hk);
      this.a(csy.hl);
      this.a(csy.hm);
      this.a(csy.hn);
      this.a(csy.ho);
      this.a(csy.hp);
      this.a(csy.hq);
      this.a(csy.hr);
      this.a(csy.hs);
      this.a(csy.ht);
      this.a(csy.hu);
      this.a(csy.hv);
      this.a(csy.hw);
      this.a(csy.hx);
      this.a(csy.hy);
      this.a(csy.qB);
      this.f(csy.aQ, csy.eZ);
      this.f(csy.ej, csy.hz);
      this.f(csy.ek, csy.hA);
      this.f(csy.el, csy.hB);
      this.f(csy.em, csy.hC);
      this.f(csy.en, csy.hD);
      this.f(csy.eo, csy.hE);
      this.f(csy.ep, csy.hF);
      this.f(csy.eq, csy.hG);
      this.f(csy.er, csy.hH);
      this.f(csy.es, csy.hI);
      this.f(csy.et, csy.hJ);
      this.f(csy.eu, csy.hK);
      this.f(csy.ev, csy.hL);
      this.f(csy.ew, csy.hM);
      this.f(csy.ex, csy.hN);
      this.f(csy.ey, csy.hO);
      this.b(ln.n, csy.lg, csy.lh, csy.li, csy.lj, csy.lk, csy.ll, csy.lm, csy.ln, csy.lo, csy.lp, csy.lq, csy.lr, csy.ls, csy.lt, csy.lu, csy.lv);
      this.e(csy.bA, csy.ik);
      this.e(csy.bB, csy.il);
      this.e(csy.bC, csy.im);
      this.e(csy.bD, csy.in);
      this.e(csy.bE, csy.io);
      this.e(csy.bF, csy.ip);
      this.e(csy.bG, csy.iq);
      this.e(csy.bH, csy.ir);
      this.e(csy.bI, csy.is);
      this.e(csy.bJ, csy.it);
      this.e(csy.bK, csy.iu);
      this.e(csy.bL, csy.iv);
      this.e(csy.bM, csy.iw);
      this.e(csy.bN, csy.ix);
      this.e(csy.bO, csy.iy);
      this.e(csy.bP, csy.iz);
      this.a(csy.rH);
      this.a(csy.eM);
      this.a(csy.bu, csy.gb, ku.e.a);
      this.a(csy.bR, csy.gc, ku.e.b);
      this.a(csy.bT, csy.gd, ku.e.b);
      this.a(csy.bU, csy.ge, ku.e.b);
      this.a(csy.bV, csy.gf, ku.e.b);
      this.a(csy.bW, csy.gg, ku.e.b);
      this.a(csy.bX, csy.gh, ku.e.b);
      this.a(csy.bY, csy.gi, ku.e.b);
      this.a(csy.bZ, csy.gj, ku.e.b);
      this.a(csy.ca, csy.gk, ku.e.b);
      this.a(csy.cb, csy.gl, ku.e.b);
      this.a(csy.cc, csy.gm, ku.e.b);
      this.a(csy.ce, csy.gn, ku.e.b);
      this.a(csy.cd, csy.go, ku.e.b);
      this.a(csy.cg, csy.gp, ku.e.b);
      this.a(csy.cf, csy.gq, ku.e.b);
      this.a(csy.bv, csy.gr, ku.e.b);
      this.a(csy.bS, csy.fS, ku.e.b);
      this.G();
      this.u(csy.eU);
      this.u(csy.eV);
      this.u(csy.eW);
      this.a(csy.bt, ku.e.a);
      this.b(csy.dS, ku.e.a);
      this.a(cjk.dn);
      this.b(csy.mc, csy.md, ku.e.b);
      this.a(cjk.do);
      this.c(csy.md);
      this.b(csy.rF, ku.e.b);
      this.c(csy.rF);
      this.c(csy.rv);
      this.b(csy.oz, csy.oA, ku.e.b);
      this.b(csy.oB, csy.oC, ku.e.b);
      this.a(csy.oz, "_plant");
      this.c(csy.oA);
      this.a(csy.oB, "_plant");
      this.c(csy.oC);
      this.a(csy.mY, ku.e.a, ll.c(ll.a(csy.mZ, "_stage0")));
      this.m();
      this.a(csy.bs, ku.e.b);
      this.c(csy.iE, ku.e.b);
      this.c(csy.iF, ku.e.b);
      this.c(csy.iG, ku.e.b);
      this.c(csy.iH, ku.e.a);
      this.c(csy.iI, ku.e.a);
      this.j();
      this.k();
      this.l();
      this.a(csy.mw, csy.mr, csy.mm, csy.mh, csy.mG, csy.mB, csy.mQ, csy.mL);
      this.a(csy.mx, csy.ms, csy.mn, csy.mi, csy.mH, csy.mC, csy.mR, csy.mM);
      this.a(csy.my, csy.mt, csy.mo, csy.mj, csy.mI, csy.mD, csy.mS, csy.mN);
      this.a(csy.mz, csy.mu, csy.mp, csy.mk, csy.mJ, csy.mE, csy.mT, csy.mO);
      this.a(csy.mA, csy.mv, csy.mq, csy.ml, csy.mK, csy.mF, csy.mU, csy.mP);
      this.c(csy.fe, csy.fc);
      this.c(csy.fd, csy.fb);
      this.l(csy.ab).c(csy.ab).a(csy.av);
      this.l(csy.am).c(csy.am).a(csy.aD);
      this.a(csy.am, csy.dj, csy.ds);
      this.b(csy.aL, ln.r);
      this.l(csy.Y).c(csy.Y).a(csy.as);
      this.l(csy.ai).c(csy.ai).a(csy.aA);
      this.a(csy.ai, csy.dd, csy.do);
      this.a(csy.B, csy.fX, ku.e.b);
      this.b(csy.aI, ln.r);
      this.l(csy.Z).d(csy.Z).a(csy.at);
      this.l(csy.aj).d(csy.aj).a(csy.aB);
      this.a(csy.aj, csy.de, csy.dp);
      this.a(csy.C, csy.fY, ku.e.b);
      this.b(csy.aJ, ln.r);
      this.l(csy.W).c(csy.W).a(csy.aq);
      this.l(csy.ag).c(csy.ag).a(csy.ay);
      this.a(csy.ag, csy.dc, csy.dn);
      this.a(csy.z, csy.fV, ku.e.b);
      this.b(csy.aG, ln.r);
      this.l(csy.U).c(csy.U).a(csy.ao);
      this.l(csy.al).c(csy.al).a(csy.aw);
      this.a(csy.al, csy.da, csy.dl);
      this.a(csy.x, csy.fT, ku.e.b);
      this.b(csy.aE, ln.r);
      this.l(csy.V).c(csy.V).a(csy.ap);
      this.l(csy.af).c(csy.af).a(csy.ax);
      this.a(csy.af, csy.db, csy.dm);
      this.a(csy.y, csy.fU, ku.e.b);
      this.b(csy.aF, ln.r);
      this.l(csy.aa).c(csy.aa).a(csy.au);
      this.l(csy.ak).c(csy.ak).a(csy.aC);
      this.a(csy.ak, csy.dg, csy.dr);
      this.a(csy.D, csy.fZ, ku.e.b);
      this.b(csy.aK, ln.r);
      this.l(csy.X).c(csy.X).a(csy.ar);
      this.l(csy.ah).c(csy.ah).a(csy.az);
      this.a(csy.ah, csy.df, csy.dq);
      this.a(csy.A, csy.fW, ku.e.b);
      this.b(csy.aH, ln.r);
      this.l(csy.os).b(csy.os).a(csy.ou);
      this.l(csy.ot).b(csy.ot).a(csy.ov);
      this.a(csy.ot, csy.dh, csy.dt);
      this.a(csy.ox, csy.pm, ku.e.b);
      this.k(csy.oD, csy.po);
      this.l(csy.oj).b(csy.oj).a(csy.ol);
      this.l(csy.ok).b(csy.ok).a(csy.om);
      this.a(csy.ok, csy.di, csy.du);
      this.a(csy.oo, csy.pn, ku.e.b);
      this.k(csy.oq, csy.pp);
      this.l(csy.ae).d(csy.ae);
      this.l(csy.an).d(csy.an);
      this.a(csy.v, csy.dk, csy.dv);
      this.b(csy.or, ku.e.b);
      this.a(cjk.dk);
      this.i(csy.dy);
      this.k(csy.hY);
      this.u();
      this.n(csy.cP);
      this.o(csy.bp);
      this.o(csy.bq);
      this.o(csy.hh);
      this.t();
      this.q(csy.fN);
      this.q(csy.kG);
      this.q(csy.kH);
      this.r(csy.gS);
      this.r(csy.gT);
      this.r(csy.gU);
      this.o();
      this.p();
      this.d(csy.cD, ln.g);
      this.d(csy.nW, ln.g);
      this.d(csy.nV, ln.h);
      this.s();
      this.ay();
      this.at();
      this.h(csy.eL, csy.eT);
      this.h(csy.m, csy.eP);
      this.h(csy.eK, csy.eS);
      this.h(csy.eJ, csy.eR);
      this.aw();
      this.h(csy.eI, csy.eQ);
      this.ax();
      ckm.h().forEach($$0 -> this.a($$0, li.b("template_spawn_egg")));
   }

   private void aB() {
      this.c(csy.hX);
      lb.a<Integer> $$0 = lb.a(dgb.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aey $$3 = ll.a(cjk.hg, $$2);
         $$0.a($$1, ld.a().a(le.c, lk.Y.a(csy.hX, $$2, ll.h($$3), this.c)));
         lk.bv.a(li.a(cjk.hg, $$2), ll.k($$3), this.c);
      }

      this.b.accept(la.a(csy.hX).a($$0));
   }

   private void l(csx $$0, csx $$1) {
      this.a($$0.k());
      ll $$2 = ll.b(ll.G($$0));
      ll $$3 = ll.b(ll.a($$0, "_lit"));
      aey $$4 = lk.bF.a($$0, "_one_candle", $$2, this.c);
      aey $$5 = lk.bG.a($$0, "_two_candles", $$2, this.c);
      aey $$6 = lk.bH.a($$0, "_three_candles", $$2, this.c);
      aey $$7 = lk.bI.a($$0, "_four_candles", $$2, this.c);
      aey $$8 = lk.bF.a($$0, "_one_candle_lit", $$3, this.c);
      aey $$9 = lk.bG.a($$0, "_two_candles_lit", $$3, this.c);
      aey $$10 = lk.bH.a($$0, "_three_candles_lit", $$3, this.c);
      aey $$11 = lk.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            la.a($$0)
               .a(
                  lb.a(dgb.az, dgb.r)
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
      aey $$12 = lk.bJ.a($$1, ll.a($$0, false), this.c);
      aey $$13 = lk.bJ.a($$1, "_lit", ll.a($$0, true), this.c);
      this.b.accept(la.a($$1).a(a(dgb.r, $$13, $$12)));
   }

   class a {
      private final aey b;

      public a(aey $$0, csx $$1) {
         this.b = lk.Y.a($$0, ll.u($$1), ku.this.c);
      }

      public ku.a a(csx... $$0) {
         for (csx $$1 : $$0) {
            ku.this.b.accept(ku.c($$1, this.b));
         }

         return this;
      }

      public ku.a b(csx... $$0) {
         for (csx $$1 : $$0) {
            ku.this.c($$1);
         }

         return this.a($$0);
      }

      public ku.a a(lj $$0, csx... $$1) {
         for (csx $$2 : $$1) {
            $$0.a(li.a($$2.k()), ll.u($$2), ku.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final ll b;
      private final Map<lj, aey> c = Maps.newHashMap();
      @Nullable
      private jh d;
      @Nullable
      private aey e;

      public b(ll $$0) {
         this.b = $$0;
      }

      public ku.b a(csx $$0, lj $$1) {
         this.e = $$1.a($$0, this.b, ku.this.c);
         if (ku.this.f.containsKey($$0)) {
            ku.this.b.accept(ku.this.f.get($$0).create($$0, this.e, this.b, ku.this.c));
         } else {
            ku.this.b.accept(ku.c($$0, this.e));
         }

         return this;
      }

      public ku.b a(csx... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (csx $$1 : $$0) {
               ku.this.b.accept(ku.c($$1, this.e));
               ku.this.a($$1, this.e);
            }

            return this;
         }
      }

      public ku.b a(csx $$0) {
         aey $$1 = lk.q.a($$0, this.b, ku.this.c);
         aey $$2 = lk.r.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.b($$0, $$1, $$2));
         aey $$3 = lk.s.a($$0, this.b, ku.this.c);
         ku.this.a($$0, $$3);
         return this;
      }

      public ku.b b(csx $$0) {
         aey $$1 = lk.K.a($$0, this.b, ku.this.c);
         aey $$2 = lk.L.a($$0, this.b, ku.this.c);
         aey $$3 = lk.M.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.a($$0, $$1, $$2, $$3));
         aey $$4 = lk.N.a($$0, this.b, ku.this.c);
         ku.this.a($$0, $$4);
         return this;
      }

      public ku.b c(csx $$0) {
         ll $$1 = ll.p($$0);
         aey $$2 = lk.B.a($$0, $$1, ku.this.c);
         aey $$3 = lk.C.a($$0, $$1, ku.this.c);
         aey $$4 = lk.D.a($$0, $$1, ku.this.c);
         aey $$5 = lk.E.a($$0, $$1, ku.this.c);
         aey $$6 = lk.F.a($$0, $$1, ku.this.c);
         ku.this.b.accept(ku.a($$0, $$2, $$3, $$4, $$5, $$6));
         aey $$7 = lk.G.a($$0, $$1, ku.this.c);
         ku.this.a($$0, $$7);
         return this;
      }

      public ku.b d(csx $$0) {
         aey $$1 = lk.H.a($$0, this.b, ku.this.c);
         aey $$2 = lk.I.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.c($$0, $$1, $$2));
         aey $$3 = lk.J.a($$0, this.b, ku.this.c);
         ku.this.a($$0, $$3);
         return this;
      }

      public ku.b e(csx $$0) {
         ll $$1 = ll.p($$0);
         aey $$2 = lk.P.a($$0, $$1, ku.this.c);
         aey $$3 = lk.O.a($$0, $$1, ku.this.c);
         aey $$4 = lk.R.a($$0, $$1, ku.this.c);
         aey $$5 = lk.Q.a($$0, $$1, ku.this.c);
         ku.this.b.accept(ku.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ku.b f(csx $$0) {
         aey $$1 = lk.T.a($$0, this.b, ku.this.c);
         aey $$2 = lk.S.a($$0, this.b, ku.this.c);
         aey $$3 = lk.V.a($$0, this.b, ku.this.c);
         aey $$4 = lk.U.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ku.b g(csx $$0) {
         aey $$1 = lk.W.a($$0, this.b, ku.this.c);
         aey $$2 = lk.X.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.e($$0, $$1, $$2));
         return this;
      }

      public ku.b h(csx $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            csx $$1 = this.d.b().get(jh.b.r);
            aey $$2 = lk.Y.a($$0, this.b, ku.this.c);
            ku.this.b.accept(ku.c($$0, $$2));
            ku.this.b.accept(ku.c($$1, $$2));
            ku.this.a($$0.k());
            ku.this.c($$1);
            return this;
         }
      }

      public ku.b i(csx $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aey $$1 = this.a(lk.Z, $$0);
            aey $$2 = this.a(lk.aa, $$0);
            ku.this.b.accept(ku.e($$0, $$1, $$2, this.e));
            ku.this.a($$0, $$1);
            return this;
         }
      }

      public ku.b j(csx $$0) {
         aey $$1 = this.a(lk.ad, $$0);
         aey $$2 = this.a(lk.ac, $$0);
         aey $$3 = this.a(lk.ae, $$0);
         ku.this.b.accept(ku.b($$0, $$1, $$2, $$3));
         ku.this.a($$0, $$2);
         return this;
      }

      private ku.b k(csx $$0) {
         ln $$1 = ku.this.g.getOrDefault($$0, ln.a.get($$0));
         ku.this.b.accept(ku.c($$0, $$1.a($$0, ku.this.c)));
         return this;
      }

      private ku.b l(csx $$0) {
         ku.this.i($$0);
         return this;
      }

      private void m(csx $$0) {
         if (ku.this.e.contains($$0)) {
            ku.this.k($$0);
         } else {
            ku.this.j($$0);
         }
      }

      private aey a(lj $$0, csx $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ku.this.c));
      }

      public ku.b a(jh $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<ku.b, csx> $$2 = ku.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      kx create(csx var1, aey var2, ll var3, BiConsumer<aey, Supplier<JsonElement>> var4);
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

      public ku.f a(csx $$0) {
         ll $$1 = this.b.c(lm.d, this.b.a(lm.i));
         aey $$2 = lk.i.a($$0, $$1, ku.this.c);
         ku.this.b.accept(ku.d($$0, $$2));
         return this;
      }

      public ku.f b(csx $$0) {
         aey $$1 = lk.i.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.d($$0, $$1));
         return this;
      }

      public ku.f c(csx $$0) {
         aey $$1 = lk.i.a($$0, this.b, ku.this.c);
         aey $$2 = lk.j.a($$0, this.b, ku.this.c);
         ku.this.b.accept(ku.d($$0, $$1, $$2));
         return this;
      }

      public ku.f d(csx $$0) {
         ku.this.b.accept(ku.a($$0, this.b, ku.this.c));
         return this;
      }
   }
}
