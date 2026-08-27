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

public class lv {
   final Consumer<ly> b;
   final BiConsumer<agt, Supplier<JsonElement>> c;
   private final Consumer<cmc> d;
   final List<cvz> e = ImmutableList.of(cwb.ey, cwb.eE, cwb.hY);
   final Map<cvz, lv.c> f = ImmutableMap.builder().put(cwb.b, lv::a).put(cwb.sJ, lv::c).put(cwb.eM, lv::b).build();
   final Map<cvz, mo> g = ImmutableMap.builder()
      .put(cwb.aV, mo.y.get(cwb.aV))
      .put(cwb.jp, mo.y.get(cwb.jp))
      .put(cwb.jS, mo.a(mm.a(cwb.aV, "_top")))
      .put(cwb.jU, mo.a(mm.a(cwb.jp, "_top")))
      .put(cwb.aX, mo.d.get(cwb.aV).a($$0x -> $$0x.a(mn.i, mm.G(cwb.aX))))
      .put(cwb.jr, mo.d.get(cwb.jp).a($$0x -> $$0x.a(mn.i, mm.G(cwb.jr))))
      .put(cwb.hd, mo.d.get(cwb.hd))
      .put(cwb.jT, mo.a(mm.a(cwb.hd, "_bottom")))
      .put(cwb.pr, mo.z.get(cwb.pr))
      .put(cwb.sJ, mo.z.get(cwb.sJ))
      .put(cwb.he, mo.d.get(cwb.he).a($$0x -> $$0x.a(mn.i, mm.G(cwb.he))))
      .put(cwb.aW, mo.d.get(cwb.aW).a($$0x -> {
         $$0x.a(mn.d, mm.a(cwb.aV, "_top"));
         $$0x.a(mn.i, mm.G(cwb.aW));
      }))
      .put(cwb.jq, mo.d.get(cwb.jq).a($$0x -> {
         $$0x.a(mn.d, mm.a(cwb.jp, "_top"));
         $$0x.a(mn.i, mm.G(cwb.jq));
      }))
      .put(cwb.qM, mo.z.get(cwb.qM))
      .put(cwb.qH, mo.z.get(cwb.qH))
      .build();
   static final Map<kf.b, BiConsumer<lv.b, cvz>> h = ImmutableMap.builder()
      .put(kf.b.a, lv.b::a)
      .put(kf.b.e, lv.b::l)
      .put(kf.b.b, lv.b::k)
      .put(kf.b.c, lv.b::k)
      .put(kf.b.f, lv.b::c)
      .put(kf.b.g, lv.b::d)
      .put(kf.b.h, lv.b::e)
      .put(kf.b.i, lv.b::f)
      .put(kf.b.k, lv.b::h)
      .put(kf.b.l, lv.b::i)
      .put(kf.b.m, lv.b::j)
      .put(kf.b.n, lv.b::g)
      .put(kf.b.p, lv.b::m)
      .put(kf.b.q, lv.b::b)
      .build();
   public static final List<Pair<djg, Function<agt, me>>> a = List.of(
      Pair.of(djf.L, (Function<agt, me>)$$0 -> me.a().a(mf.c, $$0)),
      Pair.of(djf.M, (Function<agt, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.b, mf.a.b).a(mf.d, true)),
      Pair.of(djf.N, (Function<agt, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.b, mf.a.c).a(mf.d, true)),
      Pair.of(djf.O, (Function<agt, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.b, mf.a.d).a(mf.d, true)),
      Pair.of(djf.J, (Function<agt, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.a, mf.a.d).a(mf.d, true)),
      Pair.of(djf.K, (Function<agt, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.a, mf.a.b).a(mf.d, true))
   );
   private static final Map<lv.d, agt> i = new HashMap<>();

   private static ly a(cvz $$0, agt $$1, mm $$2, BiConsumer<agt, Supplier<JsonElement>> $$3) {
      agt $$4 = ml.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static ly b(cvz $$0, agt $$1, mm $$2, BiConsumer<agt, Supplier<JsonElement>> $$3) {
      agt $$4 = ml.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static ly c(cvz $$0, agt $$1, mm $$2, BiConsumer<agt, Supplier<JsonElement>> $$3) {
      agt $$4 = ml.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public lv(Consumer<ly> $$0, BiConsumer<agt, Supplier<JsonElement>> $$1, Consumer<cmc> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cvz $$0) {
      this.d.accept($$0.k());
   }

   void a(cvz $$0, agt $$1) {
      this.c.accept(mj.a($$0.k()), new mi($$1));
   }

   private void a(cmc $$0, agt $$1) {
      this.c.accept(mj.a($$0), new mi($$1));
   }

   void a(cmc $$0) {
      ml.bx.a(mj.a($$0), mm.b($$0), this.c);
   }

   private void d(cvz $$0) {
      cmc $$1 = $$0.k();
      if ($$1 != cmk.a) {
         ml.bx.a(mj.a($$1), mm.F($$0), this.c);
      }
   }

   private void a(cvz $$0, String $$1) {
      cmc $$2 = $$0.k();
      ml.bx.a(mj.a($$2), mm.k(mm.a($$0, $$1)), this.c);
   }

   private static mc b() {
      return mc.a(djf.R).a(ia.f, me.a().a(mf.b, mf.a.b)).a(ia.d, me.a().a(mf.b, mf.a.c)).a(ia.e, me.a().a(mf.b, mf.a.d)).a(ia.c, me.a());
   }

   private static mc c() {
      return mc.a(djf.R).a(ia.d, me.a()).a(ia.e, me.a().a(mf.b, mf.a.b)).a(ia.c, me.a().a(mf.b, mf.a.c)).a(ia.f, me.a().a(mf.b, mf.a.d));
   }

   private static mc d() {
      return mc.a(djf.R).a(ia.f, me.a()).a(ia.d, me.a().a(mf.b, mf.a.b)).a(ia.e, me.a().a(mf.b, mf.a.c)).a(ia.c, me.a().a(mf.b, mf.a.d));
   }

   private static mc e() {
      return mc.a(djf.P)
         .a(ia.a, me.a().a(mf.a, mf.a.b))
         .a(ia.b, me.a().a(mf.a, mf.a.d))
         .a(ia.c, me.a())
         .a(ia.d, me.a().a(mf.b, mf.a.c))
         .a(ia.e, me.a().a(mf.b, mf.a.d))
         .a(ia.f, me.a().a(mf.b, mf.a.b));
   }

   private static mb b(cvz $$0, agt $$1) {
      return mb.a($$0, a($$1));
   }

   private static me[] a(agt $$0) {
      return new me[]{me.a().a(mf.c, $$0), me.a().a(mf.c, $$0).a(mf.b, mf.a.b), me.a().a(mf.c, $$0).a(mf.b, mf.a.c), me.a().a(mf.c, $$0).a(mf.b, mf.a.d)};
   }

   private static mb a(cvz $$0, agt $$1, agt $$2) {
      return mb.a($$0, me.a().a(mf.c, $$1), me.a().a(mf.c, $$2), me.a().a(mf.c, $$1).a(mf.b, mf.a.c), me.a().a(mf.c, $$2).a(mf.b, mf.a.c));
   }

   private static mc a(djg $$0, agt $$1, agt $$2) {
      return mc.a($$0).a(true, me.a().a(mf.c, $$1)).a(false, me.a().a(mf.c, $$2));
   }

   private void e(cvz $$0) {
      agt $$1 = mo.a.create($$0, this.c);
      agt $$2 = mo.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cvz $$0) {
      agt $$1 = mo.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cvz $$0) {
      this.b.accept(mb.a($$0).a(mc.a(djf.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         agt $$3 = mm.a($$0, $$2);
         return me.a().a(mf.c, ml.c.a($$0, $$2, new mm().a(mn.a, $$3), this.c));
      })));
      this.a($$0, mm.a($$0, "_0"));
   }

   static ly b(cvz $$0, agt $$1, agt $$2) {
      return mb.a($$0)
         .a(mc.a(djf.w).a(false, me.a().a(mf.c, $$1)).a(true, me.a().a(mf.c, $$2)))
         .a(
            mc.a(djf.U, djf.R)
               .a(dja.a, ia.f, me.a().a(mf.b, mf.a.b))
               .a(dja.a, ia.e, me.a().a(mf.b, mf.a.d))
               .a(dja.a, ia.d, me.a().a(mf.b, mf.a.c))
               .a(dja.a, ia.c, me.a())
               .a(dja.b, ia.f, me.a().a(mf.b, mf.a.b).a(mf.a, mf.a.b).a(mf.d, true))
               .a(dja.b, ia.e, me.a().a(mf.b, mf.a.d).a(mf.a, mf.a.b).a(mf.d, true))
               .a(dja.b, ia.d, me.a().a(mf.b, mf.a.c).a(mf.a, mf.a.b).a(mf.d, true))
               .a(dja.b, ia.c, me.a().a(mf.a, mf.a.b).a(mf.d, true))
               .a(dja.c, ia.f, me.a().a(mf.b, mf.a.d).a(mf.a, mf.a.c))
               .a(dja.c, ia.e, me.a().a(mf.b, mf.a.b).a(mf.a, mf.a.c))
               .a(dja.c, ia.d, me.a().a(mf.a, mf.a.c))
               .a(dja.c, ia.c, me.a().a(mf.b, mf.a.c).a(mf.a, mf.a.c))
         );
   }

   private static mc.d<ia, djl, djk, Boolean> a(mc.d<ia, djl, djk, Boolean> $$0, djl $$1, agt $$2, agt $$3, agt $$4, agt $$5) {
      return $$0.a(ia.f, $$1, djk.a, false, me.a().a(mf.c, $$2))
         .a(ia.d, $$1, djk.a, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
         .a(ia.e, $$1, djk.a, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.c))
         .a(ia.c, $$1, djk.a, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.d))
         .a(ia.f, $$1, djk.b, false, me.a().a(mf.c, $$4))
         .a(ia.d, $$1, djk.b, false, me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
         .a(ia.e, $$1, djk.b, false, me.a().a(mf.c, $$4).a(mf.b, mf.a.c))
         .a(ia.c, $$1, djk.b, false, me.a().a(mf.c, $$4).a(mf.b, mf.a.d))
         .a(ia.f, $$1, djk.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
         .a(ia.d, $$1, djk.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
         .a(ia.e, $$1, djk.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
         .a(ia.c, $$1, djk.a, true, me.a().a(mf.c, $$3))
         .a(ia.f, $$1, djk.b, true, me.a().a(mf.c, $$5).a(mf.b, mf.a.d))
         .a(ia.d, $$1, djk.b, true, me.a().a(mf.c, $$5))
         .a(ia.e, $$1, djk.b, true, me.a().a(mf.c, $$5).a(mf.b, mf.a.b))
         .a(ia.c, $$1, djk.b, true, me.a().a(mf.c, $$5).a(mf.b, mf.a.c));
   }

   private static ly a(cvz $$0, agt $$1, agt $$2, agt $$3, agt $$4, agt $$5, agt $$6, agt $$7, agt $$8) {
      return mb.a($$0).a(a(a(mc.a(djf.R, djf.ae, djf.be, djf.u), djl.b, $$1, $$2, $$3, $$4), djl.a, $$5, $$6, $$7, $$8));
   }

   static ly a(cvz $$0, agt $$1, agt $$2, agt $$3, agt $$4, agt $$5) {
      return ma.a($$0)
         .a(me.a().a(mf.c, $$1))
         .a(lz.a().a(djf.L, true), me.a().a(mf.c, $$2).a(mf.d, false))
         .a(lz.a().a(djf.M, true), me.a().a(mf.c, $$3).a(mf.d, false))
         .a(lz.a().a(djf.N, true), me.a().a(mf.c, $$4).a(mf.d, false))
         .a(lz.a().a(djf.O, true), me.a().a(mf.c, $$5).a(mf.d, false));
   }

   static ly c(cvz $$0, agt $$1, agt $$2) {
      return ma.a($$0)
         .a(me.a().a(mf.c, $$1))
         .a(lz.a().a(djf.L, true), me.a().a(mf.c, $$2).a(mf.d, true))
         .a(lz.a().a(djf.M, true), me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, true))
         .a(lz.a().a(djf.N, true), me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, true))
         .a(lz.a().a(djf.O, true), me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, true));
   }

   static ly a(cvz $$0, agt $$1, agt $$2, agt $$3) {
      return ma.a($$0)
         .a(lz.a().a(djf.J, true), me.a().a(mf.c, $$1))
         .a(lz.a().a(djf.X, dkb.b), me.a().a(mf.c, $$2).a(mf.d, true))
         .a(lz.a().a(djf.W, dkb.b), me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, true))
         .a(lz.a().a(djf.Y, dkb.b), me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, true))
         .a(lz.a().a(djf.Z, dkb.b), me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, true))
         .a(lz.a().a(djf.X, dkb.c), me.a().a(mf.c, $$3).a(mf.d, true))
         .a(lz.a().a(djf.W, dkb.c), me.a().a(mf.c, $$3).a(mf.b, mf.a.b).a(mf.d, true))
         .a(lz.a().a(djf.Y, dkb.c), me.a().a(mf.c, $$3).a(mf.b, mf.a.c).a(mf.d, true))
         .a(lz.a().a(djf.Z, dkb.c), me.a().a(mf.c, $$3).a(mf.b, mf.a.d).a(mf.d, true));
   }

   static ly a(cvz $$0, agt $$1, agt $$2, agt $$3, agt $$4, boolean $$5) {
      return mb.a($$0, me.a().a(mf.d, $$5))
         .a(c())
         .a(
            mc.a(djf.q, djf.u)
               .a(false, false, me.a().a(mf.c, $$2))
               .a(true, false, me.a().a(mf.c, $$4))
               .a(false, true, me.a().a(mf.c, $$1))
               .a(true, true, me.a().a(mf.c, $$3))
         );
   }

   static ly b(cvz $$0, agt $$1, agt $$2, agt $$3) {
      return mb.a($$0)
         .a(
            mc.a(djf.R, djf.af, djf.bi)
               .a(ia.f, djo.b, djy.a, me.a().a(mf.c, $$2))
               .a(ia.e, djo.b, djy.a, me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.d, djo.b, djy.a, me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.c, djo.b, djy.a, me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ia.f, djo.b, djy.e, me.a().a(mf.c, $$3))
               .a(ia.e, djo.b, djy.e, me.a().a(mf.c, $$3).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.d, djo.b, djy.e, me.a().a(mf.c, $$3).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.c, djo.b, djy.e, me.a().a(mf.c, $$3).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ia.f, djo.b, djy.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ia.e, djo.b, djy.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.d, djo.b, djy.d, me.a().a(mf.c, $$3))
               .a(ia.c, djo.b, djy.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.f, djo.b, djy.c, me.a().a(mf.c, $$1))
               .a(ia.e, djo.b, djy.c, me.a().a(mf.c, $$1).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.d, djo.b, djy.c, me.a().a(mf.c, $$1).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.c, djo.b, djy.c, me.a().a(mf.c, $$1).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ia.f, djo.b, djy.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ia.e, djo.b, djy.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.d, djo.b, djy.b, me.a().a(mf.c, $$1))
               .a(ia.c, djo.b, djy.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.f, djo.a, djy.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ia.e, djo.a, djy.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.d, djo.a, djy.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.c, djo.a, djy.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ia.f, djo.a, djy.e, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.e, djo.a, djy.e, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ia.d, djo.a, djy.e, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.c, djo.a, djy.e, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ia.f, djo.a, djy.d, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ia.e, djo.a, djy.d, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.d, djo.a, djy.d, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.c, djo.a, djy.d, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ia.f, djo.a, djy.c, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.e, djo.a, djy.c, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ia.d, djo.a, djy.c, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.c, djo.a, djy.c, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ia.f, djo.a, djy.b, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ia.e, djo.a, djy.b, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ia.d, djo.a, djy.b, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ia.c, djo.a, djy.b, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
         );
   }

   private static ly c(cvz $$0, agt $$1, agt $$2, agt $$3) {
      return mb.a($$0)
         .a(
            mc.a(djf.R, djf.af, djf.u)
               .a(ia.c, djo.b, false, me.a().a(mf.c, $$2))
               .a(ia.d, djo.b, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.c))
               .a(ia.f, djo.b, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
               .a(ia.e, djo.b, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.d))
               .a(ia.c, djo.a, false, me.a().a(mf.c, $$1))
               .a(ia.d, djo.a, false, me.a().a(mf.c, $$1).a(mf.b, mf.a.c))
               .a(ia.f, djo.a, false, me.a().a(mf.c, $$1).a(mf.b, mf.a.b))
               .a(ia.e, djo.a, false, me.a().a(mf.c, $$1).a(mf.b, mf.a.d))
               .a(ia.c, djo.b, true, me.a().a(mf.c, $$3))
               .a(ia.d, djo.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               .a(ia.f, djo.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(ia.e, djo.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
               .a(ia.c, djo.a, true, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.c))
               .a(ia.d, djo.a, true, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.a))
               .a(ia.f, djo.a, true, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.d))
               .a(ia.e, djo.a, true, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.b))
         );
   }

   private static ly d(cvz $$0, agt $$1, agt $$2, agt $$3) {
      return mb.a($$0)
         .a(
            mc.a(djf.R, djf.af, djf.u)
               .a(ia.c, djo.b, false, me.a().a(mf.c, $$2))
               .a(ia.d, djo.b, false, me.a().a(mf.c, $$2))
               .a(ia.f, djo.b, false, me.a().a(mf.c, $$2))
               .a(ia.e, djo.b, false, me.a().a(mf.c, $$2))
               .a(ia.c, djo.a, false, me.a().a(mf.c, $$1))
               .a(ia.d, djo.a, false, me.a().a(mf.c, $$1))
               .a(ia.f, djo.a, false, me.a().a(mf.c, $$1))
               .a(ia.e, djo.a, false, me.a().a(mf.c, $$1))
               .a(ia.c, djo.b, true, me.a().a(mf.c, $$3))
               .a(ia.d, djo.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               .a(ia.f, djo.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(ia.e, djo.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
               .a(ia.c, djo.a, true, me.a().a(mf.c, $$3))
               .a(ia.d, djo.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               .a(ia.f, djo.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(ia.e, djo.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
         );
   }

   static mb c(cvz $$0, agt $$1) {
      return mb.a($$0, me.a().a(mf.c, $$1));
   }

   private static mc f() {
      return mc.a(djf.I).a(ia.a.b, me.a()).a(ia.a.c, me.a().a(mf.a, mf.a.b)).a(ia.a.a, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.b));
   }

   static ly a(cvz $$0, mm $$1, BiConsumer<agt, Supplier<JsonElement>> $$2) {
      agt $$3 = ml.g.a($$0, $$1, $$2);
      agt $$4 = ml.h.a($$0, $$1, $$2);
      agt $$5 = ml.i.a($$0, $$1, $$2);
      agt $$6 = ml.j.a($$0, $$1, $$2);
      return mb.a($$0, me.a().a(mf.c, $$6)).a(mc.a(djf.I).a(ia.a.a, me.a().a(mf.c, $$3)).a(ia.a.b, me.a().a(mf.c, $$4)).a(ia.a.c, me.a().a(mf.c, $$5)));
   }

   static ly d(cvz $$0, agt $$1) {
      return mb.a($$0, me.a().a(mf.c, $$1)).a(f());
   }

   private void e(cvz $$0, agt $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cvz $$0, mo.a $$1) {
      agt $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cvz $$0, mo.a $$1) {
      agt $$2 = $$1.create($$0, this.c);
      this.b.accept(mb.a($$0, me.a().a(mf.c, $$2)).a(b()));
   }

   static ly d(cvz $$0, agt $$1, agt $$2) {
      return mb.a($$0)
         .a(
            mc.a(djf.I)
               .a(ia.a.b, me.a().a(mf.c, $$1))
               .a(ia.a.c, me.a().a(mf.c, $$2).a(mf.a, mf.a.b))
               .a(ia.a.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.b).a(mf.b, mf.a.b))
         );
   }

   private void a(cvz $$0, mo.a $$1, mo.a $$2) {
      agt $$3 = $$1.create($$0, this.c);
      agt $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private agt a(cvz $$0, String $$1, mk $$2, Function<agt, mm> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mm.a($$0, $$1)), this.c);
   }

   static ly e(cvz $$0, agt $$1, agt $$2) {
      return mb.a($$0).a(a(djf.w, $$2, $$1));
   }

   static ly e(cvz $$0, agt $$1, agt $$2, agt $$3) {
      return mb.a($$0).a(mc.a(djf.bh).a(djx.b, me.a().a(mf.c, $$1)).a(djx.a, me.a().a(mf.c, $$2)).a(djx.c, me.a().a(mf.c, $$3)));
   }

   public void a(cvz $$0) {
      this.b($$0, mo.a);
   }

   public void b(cvz $$0, mo.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cvz $$0, mm $$1, mk $$2) {
      agt $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private lv.b h(cvz $$0) {
      mo $$1 = this.g.getOrDefault($$0, mo.a.get($$0));
      return new lv.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cvz $$0, cvz $$1, cvz $$2) {
      mm $$3 = mm.u($$0);
      agt $$4 = ml.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(cvz $$0) {
      mm $$1 = mm.t($$0);
      agt $$2 = ml.v.a($$0, $$1, this.c);
      agt $$3 = ml.w.a($$0, $$1, this.c);
      agt $$4 = ml.x.a($$0, $$1, this.c);
      agt $$5 = ml.y.a($$0, $$1, this.c);
      agt $$6 = ml.z.a($$0, $$1, this.c);
      agt $$7 = ml.A.a($$0, $$1, this.c);
      agt $$8 = ml.B.a($$0, $$1, this.c);
      agt $$9 = ml.C.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(cvz $$0, cvz $$1) {
      agt $$2 = ml.v.a($$0);
      agt $$3 = ml.w.a($$0);
      agt $$4 = ml.x.a($$0);
      agt $$5 = ml.y.a($$0);
      agt $$6 = ml.z.a($$0);
      agt $$7 = ml.A.a($$0);
      agt $$8 = ml.B.a($$0);
      agt $$9 = ml.C.a($$0);
      this.a($$1, mj.a($$0.k()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cvz $$0) {
      mm $$1 = mm.b($$0);
      agt $$2 = ml.ak.a($$0, $$1, this.c);
      agt $$3 = ml.al.a($$0, $$1, this.c);
      agt $$4 = ml.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cvz $$0) {
      mm $$1 = mm.b($$0);
      agt $$2 = ml.ah.a($$0, $$1, this.c);
      agt $$3 = ml.ai.a($$0, $$1, this.c);
      agt $$4 = ml.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(cvz $$0, cvz $$1) {
      agt $$2 = ml.ah.a($$0);
      agt $$3 = ml.ai.a($$0);
      agt $$4 = ml.aj.a($$0);
      this.a($$1, mj.a($$0.k()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(cwb.sD);
      agt $$0 = mj.a(cwb.sD);
      agt $$1 = mj.a(cwb.sD, "_partial_tilt");
      agt $$2 = mj.a(cwb.sD, "_full_tilt");
      this.b
         .accept(
            mb.a(cwb.sD)
               .a(b())
               .a(mc.a(djf.bl).a(dka.a, me.a().a(mf.c, $$0)).a(dka.b, me.a().a(mf.c, $$0)).a(dka.c, me.a().a(mf.c, $$1)).a(dka.d, me.a().a(mf.c, $$2)))
         );
   }

   private lv.f l(cvz $$0) {
      return new lv.f(mm.n($$0));
   }

   private void m(cvz $$0) {
      this.c($$0, $$0);
   }

   private void c(cvz $$0, cvz $$1) {
      this.b.accept(c($$0, mj.a($$1)));
   }

   private void a(cvz $$0, lv.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cvz $$0, lv.e $$1, mm $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cvz $$0, lv.e $$1) {
      mm $$2 = mm.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cvz $$0, lv.e $$1, mm $$2) {
      agt $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cvz $$0, lv.e $$1, djs<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         mc $$4 = mc.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mm $$5 = mm.c(mm.a($$0, $$4x));
            agt $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return me.a().a(mf.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(mb.a($$0).a($$4));
      }
   }

   private void a(cvz $$0, cvz $$1, lv.e $$2) {
      this.a($$0, $$2);
      mm $$3 = mm.d($$0);
      agt $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(cvz $$0, cvz $$1) {
      mo $$2 = mo.p.get($$0);
      agt $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      agt $$4 = ml.aC.a($$1, $$2.b(), this.c);
      this.b.accept(mb.a($$1, me.a().a(mf.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(cvz $$0, cvz $$1) {
      this.a($$0.k());
      mm $$2 = mm.h($$0);
      mm $$3 = mm.a($$0, $$1);
      agt $$4 = ml.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            mb.a($$1, me.a().a(mf.c, $$4))
               .a(mc.a(djf.R).a(ia.e, me.a()).a(ia.d, me.a().a(mf.b, mf.a.d)).a(ia.c, me.a().a(mf.b, mf.a.b)).a(ia.f, me.a().a(mf.b, mf.a.c)))
         );
      this.b.accept(mb.a($$0).a(mc.a(djf.av).a($$2x -> me.a().a(mf.c, ml.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cvz $$0 = cwb.kC;
      this.a($$0.k());
      agt $$1 = mj.a($$0, "_top");
      agt $$2 = mj.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cvz $$0 = cwb.kB;
      this.a($$0.k());
      mc $$1 = mc.a(dbn.d, djf.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> me.a().a(mf.c, mj.a($$0, "_top_stage_" + $$1x));
            case b -> me.a().a(mf.c, mj.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mb.a($$0).a($$1));
   }

   private void a(cvz $$0, cvz $$1, cvz $$2, cvz $$3, cvz $$4, cvz $$5, cvz $$6, cvz $$7) {
      this.a($$0, lv.e.b);
      this.a($$1, lv.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(cvz $$0, lv.e $$1) {
      this.a($$0, "_top");
      agt $$2 = this.a($$0, "_top", $$1.a(), mm::c);
      agt $$3 = this.a($$0, "_bottom", $$1.a(), mm::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cwb.iD, "_front");
      agt $$0 = mj.a(cwb.iD, "_top");
      agt $$1 = this.a(cwb.iD, "_bottom", lv.e.b.a(), mm::c);
      this.f(cwb.iD, $$0, $$1);
   }

   private void k() {
      agt $$0 = this.a(cwb.bx, "_top", ml.bk, mm::a);
      agt $$1 = this.a(cwb.bx, "_bottom", ml.bk, mm::a);
      this.f(cwb.bx, $$0, $$1);
   }

   private void l() {
      this.c(cwb.sF);
      agt $$0 = mj.a(cwb.sF, "_top");
      agt $$1 = mj.a(cwb.sF, "_bottom");
      this.b.accept(mb.a(cwb.sF).a(b()).a(mc.a(djf.ae).a(djl.b, me.a().a(mf.c, $$1)).a(djl.a, me.a().a(mf.c, $$0))));
   }

   private void f(cvz $$0, agt $$1, agt $$2) {
      this.b.accept(mb.a($$0).a(mc.a(djf.ae).a(djl.b, me.a().a(mf.c, $$2)).a(djl.a, me.a().a(mf.c, $$1))));
   }

   private void n(cvz $$0) {
      mm $$1 = mm.e($$0);
      mm $$2 = mm.e(mm.a($$0, "_corner"));
      agt $$3 = ml.as.a($$0, $$1, this.c);
      agt $$4 = ml.at.a($$0, $$2, this.c);
      agt $$5 = ml.au.a($$0, $$1, this.c);
      agt $$6 = ml.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            mb.a($$0)
               .a(
                  mc.a(djf.ag)
                     .a(djt.a, me.a().a(mf.c, $$3))
                     .a(djt.b, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
                     .a(djt.c, me.a().a(mf.c, $$5).a(mf.b, mf.a.b))
                     .a(djt.d, me.a().a(mf.c, $$6).a(mf.b, mf.a.b))
                     .a(djt.e, me.a().a(mf.c, $$5))
                     .a(djt.f, me.a().a(mf.c, $$6))
                     .a(djt.g, me.a().a(mf.c, $$4))
                     .a(djt.h, me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
                     .a(djt.i, me.a().a(mf.c, $$4).a(mf.b, mf.a.c))
                     .a(djt.j, me.a().a(mf.c, $$4).a(mf.b, mf.a.d))
               )
         );
   }

   private void o(cvz $$0) {
      agt $$1 = this.a($$0, "", ml.as, mm::e);
      agt $$2 = this.a($$0, "", ml.au, mm::e);
      agt $$3 = this.a($$0, "", ml.av, mm::e);
      agt $$4 = this.a($$0, "_on", ml.as, mm::e);
      agt $$5 = this.a($$0, "_on", ml.au, mm::e);
      agt $$6 = this.a($$0, "_on", ml.av, mm::e);
      mc $$7 = mc.a(djf.w, djf.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return me.a().a(mf.c, $$6x ? $$4 : $$1);
            case b:
               return me.a().a(mf.c, $$6x ? $$4 : $$1).a(mf.b, mf.a.b);
            case c:
               return me.a().a(mf.c, $$6x ? $$5 : $$2).a(mf.b, mf.a.b);
            case d:
               return me.a().a(mf.c, $$6x ? $$6 : $$3).a(mf.b, mf.a.b);
            case e:
               return me.a().a(mf.c, $$6x ? $$5 : $$2);
            case f:
               return me.a().a(mf.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(mb.a($$0).a($$7));
   }

   private lv.a a(agt $$0, cvz $$1) {
      return new lv.a($$0, $$1);
   }

   private lv.a f(cvz $$0, cvz $$1) {
      return new lv.a(mj.a($$0), $$1);
   }

   private void a(cvz $$0, cmc $$1) {
      agt $$2 = ml.aa.a($$0, mm.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cvz $$0, agt $$1) {
      agt $$2 = ml.aa.a($$0, mm.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(cvz $$0, cvz $$1) {
      this.a($$0);
      agt $$2 = mo.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cvz $$0) {
      this.a($$0.k());
      agt $$1 = mo.k.create($$0, this.c);
      agt $$2 = mo.l.create($$0, this.c);
      agt $$3 = mo.m.create($$0, this.c);
      agt $$4 = mo.n.create($$0, this.c);
      this.b
         .accept(
            ma.a($$0)
               .a(lz.a().a(djf.S, 1, 2, 3, 4).a(djf.R, ia.c), me.a().a(mf.c, $$1))
               .a(lz.a().a(djf.S, 1, 2, 3, 4).a(djf.R, ia.f), me.a().a(mf.c, $$1).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.S, 1, 2, 3, 4).a(djf.R, ia.d), me.a().a(mf.c, $$1).a(mf.b, mf.a.c))
               .a(lz.a().a(djf.S, 1, 2, 3, 4).a(djf.R, ia.e), me.a().a(mf.c, $$1).a(mf.b, mf.a.d))
               .a(lz.a().a(djf.S, 2, 3, 4).a(djf.R, ia.c), me.a().a(mf.c, $$2))
               .a(lz.a().a(djf.S, 2, 3, 4).a(djf.R, ia.f), me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.S, 2, 3, 4).a(djf.R, ia.d), me.a().a(mf.c, $$2).a(mf.b, mf.a.c))
               .a(lz.a().a(djf.S, 2, 3, 4).a(djf.R, ia.e), me.a().a(mf.c, $$2).a(mf.b, mf.a.d))
               .a(lz.a().a(djf.S, 3, 4).a(djf.R, ia.c), me.a().a(mf.c, $$3))
               .a(lz.a().a(djf.S, 3, 4).a(djf.R, ia.f), me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.S, 3, 4).a(djf.R, ia.d), me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               .a(lz.a().a(djf.S, 3, 4).a(djf.R, ia.e), me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
               .a(lz.a().a(djf.S, 4).a(djf.R, ia.c), me.a().a(mf.c, $$4))
               .a(lz.a().a(djf.S, 4).a(djf.R, ia.f), me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.S, 4).a(djf.R, ia.d), me.a().a(mf.c, $$4).a(mf.b, mf.a.c))
               .a(lz.a().a(djf.S, 4).a(djf.R, ia.e), me.a().a(mf.c, $$4).a(mf.b, mf.a.d))
         );
   }

   private void a(mo.a $$0, cvz... $$1) {
      for (cvz $$2 : $$1) {
         agt $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(mo.a $$0, cvz... $$1) {
      for (cvz $$2 : $$1) {
         agt $$3 = $$0.create($$2, this.c);
         this.b.accept(mb.a($$2, me.a().a(mf.c, $$3)).a(c()));
      }
   }

   private void h(cvz $$0, cvz $$1) {
      this.a($$0);
      mm $$2 = mm.b($$0, $$1);
      agt $$3 = ml.aI.a($$1, $$2, this.c);
      agt $$4 = ml.aJ.a($$1, $$2, this.c);
      agt $$5 = ml.aK.a($$1, $$2, this.c);
      agt $$6 = ml.aG.a($$1, $$2, this.c);
      agt $$7 = ml.aH.a($$1, $$2, this.c);
      cmc $$8 = $$1.k();
      ml.bx.a(mj.a($$8), mm.F($$0), this.c);
      this.b
         .accept(
            ma.a($$1)
               .a(me.a().a(mf.c, $$3))
               .a(lz.a().a(djf.L, true), me.a().a(mf.c, $$4))
               .a(lz.a().a(djf.M, true), me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.N, true), me.a().a(mf.c, $$5))
               .a(lz.a().a(djf.O, true), me.a().a(mf.c, $$5).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.L, false), me.a().a(mf.c, $$6))
               .a(lz.a().a(djf.M, false), me.a().a(mf.c, $$7))
               .a(lz.a().a(djf.N, false), me.a().a(mf.c, $$7).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.O, false), me.a().a(mf.c, $$6).a(mf.b, mf.a.d))
         );
   }

   private void q(cvz $$0) {
      mm $$1 = mm.z($$0);
      agt $$2 = ml.aL.a($$0, $$1, this.c);
      agt $$3 = this.a($$0, "_conditional", ml.aL, $$1x -> $$1.c(mn.i, $$1x));
      this.b.accept(mb.a($$0).a(a(djf.c, $$3, $$2)).a(e()));
   }

   private void r(cvz $$0) {
      agt $$1 = mo.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<me> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> me.a().a(mf.c, mj.a(cwb.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cwb.mZ);
      this.b
         .accept(
            ma.a(cwb.mZ)
               .a(lz.a().a(djf.aq, 0), this.a(0))
               .a(lz.a().a(djf.aq, 1), this.a(1))
               .a(lz.a().a(djf.bk, djb.b), me.a().a(mf.c, mj.a(cwb.mZ, "_small_leaves")))
               .a(lz.a().a(djf.bk, djb.c), me.a().a(mf.c, mj.a(cwb.mZ, "_large_leaves")))
         );
   }

   private mc n() {
      return mc.a(djf.P)
         .a(ia.a, me.a().a(mf.a, mf.a.c))
         .a(ia.b, me.a())
         .a(ia.c, me.a().a(mf.a, mf.a.b))
         .a(ia.d, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.c))
         .a(ia.e, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.d))
         .a(ia.f, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.b));
   }

   private void o() {
      agt $$0 = mm.a(cwb.nU, "_top_open");
      this.b
         .accept(
            mb.a(cwb.nU)
               .a(this.n())
               .a(
                  mc.a(djf.u)
                     .a(false, me.a().a(mf.c, mo.f.create(cwb.nU, this.c)))
                     .a(true, me.a().a(mf.c, mo.f.get(cwb.nU).a($$1 -> $$1.a(mn.f, $$0)).a(cwb.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mc a(djs<T> $$0, T $$1, agt $$2, agt $$3) {
      me $$4 = me.a().a(mf.c, $$2);
      me $$5 = me.a().a(mf.c, $$3);
      return mc.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cvz $$0, Function<cvz, mm> $$1) {
      mm $$2 = $$1.apply($$0).b(mn.i, mn.c);
      mm $$3 = $$2.c(mn.g, mm.a($$0, "_front_honey"));
      agt $$4 = ml.q.a($$0, $$2, this.c);
      agt $$5 = ml.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(mb.a($$0).a(b()).a(a(djf.aN, 5, $$5, $$4)));
   }

   private void a(cvz $$0, djs<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<agt> $$3 = new Int2ObjectOpenHashMap();
         mc $$4 = mc.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            agt $$5 = (agt)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, ml.aV, mm::g));
            return me.a().a(mf.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(mb.a($$0).a($$4));
      }
   }

   private void p() {
      agt $$0 = mj.a(cwb.od, "_floor");
      agt $$1 = mj.a(cwb.od, "_ceiling");
      agt $$2 = mj.a(cwb.od, "_wall");
      agt $$3 = mj.a(cwb.od, "_between_walls");
      this.a(cmk.wf);
      this.b
         .accept(
            mb.a(cwb.od)
               .a(
                  mc.a(djf.R, djf.V)
                     .a(ia.c, djd.a, me.a().a(mf.c, $$0))
                     .a(ia.d, djd.a, me.a().a(mf.c, $$0).a(mf.b, mf.a.c))
                     .a(ia.f, djd.a, me.a().a(mf.c, $$0).a(mf.b, mf.a.b))
                     .a(ia.e, djd.a, me.a().a(mf.c, $$0).a(mf.b, mf.a.d))
                     .a(ia.c, djd.b, me.a().a(mf.c, $$1))
                     .a(ia.d, djd.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.c))
                     .a(ia.f, djd.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.b))
                     .a(ia.e, djd.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.d))
                     .a(ia.c, djd.c, me.a().a(mf.c, $$2).a(mf.b, mf.a.d))
                     .a(ia.d, djd.c, me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
                     .a(ia.f, djd.c, me.a().a(mf.c, $$2))
                     .a(ia.e, djd.c, me.a().a(mf.c, $$2).a(mf.b, mf.a.c))
                     .a(ia.d, djd.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
                     .a(ia.c, djd.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
                     .a(ia.f, djd.d, me.a().a(mf.c, $$3))
                     .a(ia.e, djd.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mb.a(cwb.nZ, me.a().a(mf.c, mj.a(cwb.nZ)))
               .a(
                  mc.a(djf.U, djf.R)
                     .a(dja.a, ia.c, me.a())
                     .a(dja.a, ia.f, me.a().a(mf.b, mf.a.b))
                     .a(dja.a, ia.d, me.a().a(mf.b, mf.a.c))
                     .a(dja.a, ia.e, me.a().a(mf.b, mf.a.d))
                     .a(dja.b, ia.c, me.a().a(mf.a, mf.a.b))
                     .a(dja.b, ia.f, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.b))
                     .a(dja.b, ia.d, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.c))
                     .a(dja.b, ia.e, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.d))
                     .a(dja.c, ia.d, me.a().a(mf.a, mf.a.c))
                     .a(dja.c, ia.e, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.b))
                     .a(dja.c, ia.c, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.c))
                     .a(dja.c, ia.f, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.d))
               )
         );
   }

   private void d(cvz $$0, mo.a $$1) {
      agt $$2 = $$1.create($$0, this.c);
      agt $$3 = mm.a($$0, "_front_on");
      agt $$4 = $$1.get($$0).a($$1x -> $$1x.a(mn.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mb.a($$0).a(a(djf.r, $$4, $$2)).a(b()));
   }

   private void a(cvz... $$0) {
      agt $$1 = mj.a("campfire_off");

      for (cvz $$2 : $$0) {
         agt $$3 = ml.bc.a($$2, mm.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(mb.a($$2).a(a(djf.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cvz $$0) {
      agt $$1 = ml.bt.a($$0, mm.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cvz $$0) {
      agt $$1;
      if ($$0 == cwb.tj) {
         $$1 = ml.bv.a($$0, mm.m($$0), this.c);
      } else {
         $$1 = ml.bu.a($$0, mm.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mm $$0 = mm.a(mm.G(cwb.cl), mm.G(cwb.n));
      agt $$1 = ml.j.a(cwb.cl, $$0, this.c);
      this.b.accept(c(cwb.cl, $$1));
   }

   private void s() {
      this.a(cmk.lG);
      this.b
         .accept(
            ma.a(cwb.cw)
               .a(
                  lz.b(
                     lz.a().a(djf.ab, dju.c).a(djf.aa, dju.c).a(djf.ac, dju.c).a(djf.ad, dju.c),
                     lz.a().a(djf.ab, dju.b, dju.a).a(djf.aa, dju.b, dju.a),
                     lz.a().a(djf.aa, dju.b, dju.a).a(djf.ac, dju.b, dju.a),
                     lz.a().a(djf.ac, dju.b, dju.a).a(djf.ad, dju.b, dju.a),
                     lz.a().a(djf.ad, dju.b, dju.a).a(djf.ab, dju.b, dju.a)
                  ),
                  me.a().a(mf.c, mj.a("redstone_dust_dot"))
               )
               .a(lz.a().a(djf.ab, dju.b, dju.a), me.a().a(mf.c, mj.a("redstone_dust_side0")))
               .a(lz.a().a(djf.ac, dju.b, dju.a), me.a().a(mf.c, mj.a("redstone_dust_side_alt0")))
               .a(lz.a().a(djf.aa, dju.b, dju.a), me.a().a(mf.c, mj.a("redstone_dust_side_alt1")).a(mf.b, mf.a.d))
               .a(lz.a().a(djf.ad, dju.b, dju.a), me.a().a(mf.c, mj.a("redstone_dust_side1")).a(mf.b, mf.a.d))
               .a(lz.a().a(djf.ab, dju.a), me.a().a(mf.c, mj.a("redstone_dust_up")))
               .a(lz.a().a(djf.aa, dju.a), me.a().a(mf.c, mj.a("redstone_dust_up")).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.ac, dju.a), me.a().a(mf.c, mj.a("redstone_dust_up")).a(mf.b, mf.a.c))
               .a(lz.a().a(djf.ad, dju.a), me.a().a(mf.c, mj.a("redstone_dust_up")).a(mf.b, mf.a.d))
         );
   }

   private void t() {
      this.a(cmk.lK);
      this.b
         .accept(
            mb.a(cwb.gY)
               .a(c())
               .a(
                  mc.a(djf.bd, djf.w)
                     .a(dji.a, false, me.a().a(mf.c, mj.a(cwb.gY)))
                     .a(dji.a, true, me.a().a(mf.c, mj.a(cwb.gY, "_on")))
                     .a(dji.b, false, me.a().a(mf.c, mj.a(cwb.gY, "_subtract")))
                     .a(dji.b, true, me.a().a(mf.c, mj.a(cwb.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mm $$0 = mm.a(cwb.jR);
      mm $$1 = mm.a(mm.a(cwb.jE, "_side"), $$0.a(mn.f));
      agt $$2 = ml.ab.a(cwb.jE, $$1, this.c);
      agt $$3 = ml.ac.a(cwb.jE, $$1, this.c);
      agt $$4 = ml.j.b(cwb.jE, "_double", $$1, this.c);
      this.b.accept(e(cwb.jE, $$2, $$3, $$4));
      this.b.accept(c(cwb.jR, ml.c.a(cwb.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cmk.sn);
      this.b
         .accept(
            ma.a(cwb.fs)
               .a(me.a().a(mf.c, mm.G(cwb.fs)))
               .a(lz.a().a(djf.k, true), me.a().a(mf.c, mm.a(cwb.fs, "_bottle0")))
               .a(lz.a().a(djf.l, true), me.a().a(mf.c, mm.a(cwb.fs, "_bottle1")))
               .a(lz.a().a(djf.m, true), me.a().a(mf.c, mm.a(cwb.fs, "_bottle2")))
               .a(lz.a().a(djf.k, false), me.a().a(mf.c, mm.a(cwb.fs, "_empty0")))
               .a(lz.a().a(djf.l, false), me.a().a(mf.c, mm.a(cwb.fs, "_empty1")))
               .a(lz.a().a(djf.m, false), me.a().a(mf.c, mm.a(cwb.fs, "_empty2")))
         );
   }

   private void u(cvz $$0) {
      agt $$1 = ml.bp.a($$0, mm.b($$0), this.c);
      agt $$2 = mj.a("mushroom_block_inside");
      this.b
         .accept(
            ma.a($$0)
               .a(lz.a().a(djf.L, true), me.a().a(mf.c, $$1))
               .a(lz.a().a(djf.M, true), me.a().a(mf.c, $$1).a(mf.b, mf.a.b).a(mf.d, true))
               .a(lz.a().a(djf.N, true), me.a().a(mf.c, $$1).a(mf.b, mf.a.c).a(mf.d, true))
               .a(lz.a().a(djf.O, true), me.a().a(mf.c, $$1).a(mf.b, mf.a.d).a(mf.d, true))
               .a(lz.a().a(djf.J, true), me.a().a(mf.c, $$1).a(mf.a, mf.a.d).a(mf.d, true))
               .a(lz.a().a(djf.K, true), me.a().a(mf.c, $$1).a(mf.a, mf.a.b).a(mf.d, true))
               .a(lz.a().a(djf.L, false), me.a().a(mf.c, $$2))
               .a(lz.a().a(djf.M, false), me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, false))
               .a(lz.a().a(djf.N, false), me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, false))
               .a(lz.a().a(djf.O, false), me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, false))
               .a(lz.a().a(djf.J, false), me.a().a(mf.c, $$2).a(mf.a, mf.a.d).a(mf.d, false))
               .a(lz.a().a(djf.K, false), me.a().a(mf.c, $$2).a(mf.a, mf.a.b).a(mf.d, false))
         );
      this.a($$0, mo.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cmk.ry);
      this.b
         .accept(
            mb.a(cwb.eg)
               .a(
                  mc.a(djf.ay)
                     .a(0, me.a().a(mf.c, mj.a(cwb.eg)))
                     .a(1, me.a().a(mf.c, mj.a(cwb.eg, "_slice1")))
                     .a(2, me.a().a(mf.c, mj.a(cwb.eg, "_slice2")))
                     .a(3, me.a().a(mf.c, mj.a(cwb.eg, "_slice3")))
                     .a(4, me.a().a(mf.c, mj.a(cwb.eg, "_slice4")))
                     .a(5, me.a().a(mf.c, mj.a(cwb.eg, "_slice5")))
                     .a(6, me.a().a(mf.c, mj.a(cwb.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mm $$0 = new mm()
         .a(mn.c, mm.a(cwb.nX, "_side3"))
         .a(mn.o, mm.G(cwb.t))
         .a(mn.n, mm.a(cwb.nX, "_top"))
         .a(mn.j, mm.a(cwb.nX, "_side3"))
         .a(mn.l, mm.a(cwb.nX, "_side3"))
         .a(mn.k, mm.a(cwb.nX, "_side1"))
         .a(mn.m, mm.a(cwb.nX, "_side2"));
      this.b.accept(c(cwb.nX, ml.a.a(cwb.nX, $$0, this.c)));
   }

   private void y() {
      mm $$0 = new mm()
         .a(mn.c, mm.a(cwb.ob, "_front"))
         .a(mn.o, mm.a(cwb.ob, "_bottom"))
         .a(mn.n, mm.a(cwb.ob, "_top"))
         .a(mn.j, mm.a(cwb.ob, "_front"))
         .a(mn.k, mm.a(cwb.ob, "_front"))
         .a(mn.l, mm.a(cwb.ob, "_side"))
         .a(mn.m, mm.a(cwb.ob, "_side"));
      this.b.accept(c(cwb.ob, ml.a.a(cwb.ob, $$0, this.c)));
   }

   private void a(cvz $$0, cvz $$1, BiFunction<cvz, cvz, mm> $$2) {
      mm $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, ml.a.a($$0, $$3, this.c)));
   }

   public void b(cvz $$0) {
      mm $$1 = new mm()
         .a(mn.c, mm.a($$0, "_particle"))
         .a(mn.o, mm.a($$0, "_down"))
         .a(mn.n, mm.a($$0, "_up"))
         .a(mn.j, mm.a($$0, "_north"))
         .a(mn.k, mm.a($$0, "_south"))
         .a(mn.l, mm.a($$0, "_east"))
         .a(mn.m, mm.a($$0, "_west"));
      this.b.accept(c($$0, ml.a.a($$0, $$1, this.c)));
   }

   private void z() {
      mm $$0 = mm.k(cwb.eZ);
      this.b.accept(c(cwb.eZ, mj.a(cwb.eZ)));
      this.a(cwb.ee, $$0);
      this.a(cwb.ef, $$0);
   }

   private void a(cvz $$0, mm $$1) {
      agt $$2 = ml.p.a($$0, $$1.c(mn.g, mm.G($$0)), this.c);
      this.b.accept(mb.a($$0, me.a().a(mf.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cmk.so);
      this.m(cwb.ft);
      this.b.accept(c(cwb.fv, ml.bs.a(cwb.fv, mm.j(mm.a(cwb.H, "_still")), this.c)));
      this.b
         .accept(
            mb.a(cwb.fu)
               .a(
                  mc.a(dah.g)
                     .a(1, me.a().a(mf.c, ml.bq.a(cwb.fu, "_level1", mm.j(mm.a(cwb.G, "_still")), this.c)))
                     .a(2, me.a().a(mf.c, ml.br.a(cwb.fu, "_level2", mm.j(mm.a(cwb.G, "_still")), this.c)))
                     .a(3, me.a().a(mf.c, ml.bs.a(cwb.fu, "_full", mm.j(mm.a(cwb.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mb.a(cwb.fw)
               .a(
                  mc.a(dah.g)
                     .a(1, me.a().a(mf.c, ml.bq.a(cwb.fw, "_level1", mm.j(mm.G(cwb.qP)), this.c)))
                     .a(2, me.a().a(mf.c, ml.br.a(cwb.fw, "_level2", mm.j(mm.G(cwb.qP)), this.c)))
                     .a(3, me.a().a(mf.c, ml.bs.a(cwb.fw, "_full", mm.j(mm.G(cwb.qP)), this.c)))
               )
         );
   }

   private void B() {
      mm $$0 = mm.b(cwb.kv);
      agt $$1 = ml.aE.a(cwb.kv, $$0, this.c);
      agt $$2 = this.a(cwb.kv, "_dead", ml.aE, $$1x -> $$0.c(mn.b, $$1x));
      this.b.accept(mb.a(cwb.kv).a(a(djf.au, 5, $$2, $$1)));
   }

   private void C() {
      agt $$0 = mj.a(cwb.tq);
      agt $$1 = mj.a(cwb.tq, "_triggered");
      agt $$2 = mj.a(cwb.tq, "_crafting");
      agt $$3 = mj.a(cwb.tq, "_crafting_triggered");
      this.b
         .accept(
            mb.a(cwb.tq)
               .a(mc.a(djf.T).a($$0x -> this.a($$0x, me.a())))
               .a(
                  mc.a(djf.A, cxs.b)
                     .a(false, false, me.a().a(mf.c, $$0))
                     .a(true, true, me.a().a(mf.c, $$3))
                     .a(true, false, me.a().a(mf.c, $$1))
                     .a(false, true, me.a().a(mf.c, $$2))
               )
         );
   }

   private void v(cvz $$0) {
      mm $$1 = new mm().a(mn.f, mm.a(cwb.cD, "_top")).a(mn.i, mm.a(cwb.cD, "_side")).a(mn.g, mm.a($$0, "_front"));
      mm $$2 = new mm().a(mn.i, mm.a(cwb.cD, "_top")).a(mn.g, mm.a($$0, "_front_vertical"));
      agt $$3 = ml.p.a($$0, $$1, this.c);
      agt $$4 = ml.r.a($$0, $$2, this.c);
      this.b
         .accept(
            mb.a($$0)
               .a(
                  mc.a(djf.P)
                     .a(ia.a, me.a().a(mf.c, $$4).a(mf.a, mf.a.c))
                     .a(ia.b, me.a().a(mf.c, $$4))
                     .a(ia.c, me.a().a(mf.c, $$3))
                     .a(ia.f, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
                     .a(ia.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
                     .a(ia.e, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
               )
         );
   }

   private void D() {
      agt $$0 = mj.a(cwb.fy);
      agt $$1 = mj.a(cwb.fy, "_filled");
      this.b.accept(mb.a(cwb.fy).a(mc.a(djf.h).a(false, me.a().a(mf.c, $$0)).a(true, me.a().a(mf.c, $$1))).a(c()));
   }

   private void E() {
      agt $$0 = mj.a(cwb.ku, "_side");
      agt $$1 = mj.a(cwb.ku, "_noside");
      agt $$2 = mj.a(cwb.ku, "_noside1");
      agt $$3 = mj.a(cwb.ku, "_noside2");
      agt $$4 = mj.a(cwb.ku, "_noside3");
      this.b
         .accept(
            ma.a(cwb.ku)
               .a(lz.a().a(djf.L, true), me.a().a(mf.c, $$0))
               .a(lz.a().a(djf.M, true), me.a().a(mf.c, $$0).a(mf.b, mf.a.b).a(mf.d, true))
               .a(lz.a().a(djf.N, true), me.a().a(mf.c, $$0).a(mf.b, mf.a.c).a(mf.d, true))
               .a(lz.a().a(djf.O, true), me.a().a(mf.c, $$0).a(mf.b, mf.a.d).a(mf.d, true))
               .a(lz.a().a(djf.J, true), me.a().a(mf.c, $$0).a(mf.a, mf.a.d).a(mf.d, true))
               .a(lz.a().a(djf.K, true), me.a().a(mf.c, $$0).a(mf.a, mf.a.b).a(mf.d, true))
               .a(lz.a().a(djf.L, false), me.a().a(mf.c, $$1).a(mf.e, 2), me.a().a(mf.c, $$2), me.a().a(mf.c, $$3), me.a().a(mf.c, $$4))
               .a(
                  lz.a().a(djf.M, false),
                  me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, true),
                  me.a().a(mf.c, $$3).a(mf.b, mf.a.b).a(mf.d, true),
                  me.a().a(mf.c, $$4).a(mf.b, mf.a.b).a(mf.d, true),
                  me.a().a(mf.c, $$1).a(mf.e, 2).a(mf.b, mf.a.b).a(mf.d, true)
               )
               .a(
                  lz.a().a(djf.N, false),
                  me.a().a(mf.c, $$3).a(mf.b, mf.a.c).a(mf.d, true),
                  me.a().a(mf.c, $$4).a(mf.b, mf.a.c).a(mf.d, true),
                  me.a().a(mf.c, $$1).a(mf.e, 2).a(mf.b, mf.a.c).a(mf.d, true),
                  me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, true)
               )
               .a(
                  lz.a().a(djf.O, false),
                  me.a().a(mf.c, $$4).a(mf.b, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$1).a(mf.e, 2).a(mf.b, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$3).a(mf.b, mf.a.d).a(mf.d, true)
               )
               .a(
                  lz.a().a(djf.J, false),
                  me.a().a(mf.c, $$1).a(mf.e, 2).a(mf.a, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$4).a(mf.a, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$2).a(mf.a, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$3).a(mf.a, mf.a.d).a(mf.d, true)
               )
               .a(
                  lz.a().a(djf.K, false),
                  me.a().a(mf.c, $$4).a(mf.a, mf.a.b).a(mf.d, true),
                  me.a().a(mf.c, $$3).a(mf.a, mf.a.b).a(mf.d, true),
                  me.a().a(mf.c, $$2).a(mf.a, mf.a.b).a(mf.d, true),
                  me.a().a(mf.c, $$1).a(mf.e, 2).a(mf.a, mf.a.b).a(mf.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            ma.a(cwb.pc)
               .a(me.a().a(mf.c, mm.G(cwb.pc)))
               .a(lz.a().a(djf.aL, 1), me.a().a(mf.c, mm.a(cwb.pc, "_contents1")))
               .a(lz.a().a(djf.aL, 2), me.a().a(mf.c, mm.a(cwb.pc, "_contents2")))
               .a(lz.a().a(djf.aL, 3), me.a().a(mf.c, mm.a(cwb.pc, "_contents3")))
               .a(lz.a().a(djf.aL, 4), me.a().a(mf.c, mm.a(cwb.pc, "_contents4")))
               .a(lz.a().a(djf.aL, 5), me.a().a(mf.c, mm.a(cwb.pc, "_contents5")))
               .a(lz.a().a(djf.aL, 6), me.a().a(mf.c, mm.a(cwb.pc, "_contents6")))
               .a(lz.a().a(djf.aL, 7), me.a().a(mf.c, mm.a(cwb.pc, "_contents7")))
               .a(lz.a().a(djf.aL, 8), me.a().a(mf.c, mm.a(cwb.pc, "_contents_ready")))
         );
   }

   private void w(cvz $$0) {
      agt $$1 = ml.c.a($$0, mm.a($$0), this.c);
      agt $$2 = this.a($$0, "_powered", ml.c, mm::b);
      agt $$3 = this.a($$0, "_lit", ml.c, mm::b);
      agt $$4 = this.a($$0, "_lit_powered", ml.c, mm::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private ly a(cvz $$0, agt $$1, agt $$2, agt $$3, agt $$4) {
      return mb.a($$0).a(mc.a(djf.r, djf.w).a(($$4x, $$5) -> $$4x ? me.a().a(mf.c, $$5 ? $$4 : $$2) : me.a().a(mf.c, $$5 ? $$3 : $$1)));
   }

   private void i(cvz $$0, cvz $$1) {
      agt $$2 = mj.a($$0);
      agt $$3 = mj.a($$0, "_powered");
      agt $$4 = mj.a($$0, "_lit");
      agt $$5 = mj.a($$0, "_lit_powered");
      this.a($$1, mj.a($$0.k()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(cvz $$0) {
      this.c($$0);
      this.b.accept(mb.a($$0, me.a().a(mf.c, ml.ao.a($$0, mm.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(cwb.qy);
      this.x(cwb.qx);
      this.x(cwb.qw);
      this.x(cwb.qv);
   }

   private void H() {
      this.c(cwb.st);
      mc.b<ia, djm> $$0 = mc.a(djf.bm, djf.bn);

      for (djm $$1 : djm.values()) {
         $$0.a(ia.b, $$1, this.a(ia.b, $$1));
      }

      for (djm $$2 : djm.values()) {
         $$0.a(ia.a, $$2, this.a(ia.a, $$2));
      }

      this.b.accept(mb.a(cwb.st).a($$0));
   }

   private me a(ia $$0, djm $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mm $$3 = mm.c(mm.a(cwb.st, $$2));
      return me.a().a(mf.c, ml.an.a(cwb.st, $$2, $$3, this.c));
   }

   private void y(cvz $$0) {
      mm $$1 = new mm().a(mn.e, mm.G(cwb.dV)).a(mn.f, mm.G($$0)).a(mn.i, mm.a($$0, "_side"));
      this.b.accept(c($$0, ml.n.a($$0, $$1, this.c)));
   }

   private void I() {
      agt $$0 = mm.a(cwb.gZ, "_side");
      mm $$1 = new mm().a(mn.f, mm.a(cwb.gZ, "_top")).a(mn.i, $$0);
      mm $$2 = new mm().a(mn.f, mm.a(cwb.gZ, "_inverted_top")).a(mn.i, $$0);
      this.b
         .accept(
            mb.a(cwb.gZ)
               .a(mc.a(djf.p).a(false, me.a().a(mf.c, ml.aF.a(cwb.gZ, $$1, this.c))).a(true, me.a().a(mf.c, ml.aF.a(mj.a(cwb.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(cvz $$0) {
      this.b.accept(mb.a($$0, me.a().a(mf.c, mj.a($$0))).a(this.n()));
   }

   private void J() {
      cvz $$0 = cwb.ss;
      agt $$1 = mj.a($$0, "_on");
      agt $$2 = mj.a($$0);
      this.b.accept(mb.a($$0, me.a().a(mf.c, mj.a($$0))).a(this.n()).a(a(djf.w, $$1, $$2)));
   }

   private void K() {
      mm $$0 = new mm().a(mn.B, mm.G(cwb.j)).a(mn.f, mm.G(cwb.cC));
      mm $$1 = new mm().a(mn.B, mm.G(cwb.j)).a(mn.f, mm.a(cwb.cC, "_moist"));
      agt $$2 = ml.aW.a(cwb.cC, $$0, this.c);
      agt $$3 = ml.aW.a(mm.a(cwb.cC, "_moist"), $$1, this.c);
      this.b.accept(mb.a(cwb.cC).a(a(djf.aQ, 7, $$3, $$2)));
   }

   private List<agt> A(cvz $$0) {
      agt $$1 = ml.aX.a(mj.a($$0, "_floor0"), mm.v($$0), this.c);
      agt $$2 = ml.aX.a(mj.a($$0, "_floor1"), mm.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<agt> B(cvz $$0) {
      agt $$1 = ml.aY.a(mj.a($$0, "_side0"), mm.v($$0), this.c);
      agt $$2 = ml.aY.a(mj.a($$0, "_side1"), mm.w($$0), this.c);
      agt $$3 = ml.aZ.a(mj.a($$0, "_side_alt0"), mm.v($$0), this.c);
      agt $$4 = ml.aZ.a(mj.a($$0, "_side_alt1"), mm.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<agt> C(cvz $$0) {
      agt $$1 = ml.ba.a(mj.a($$0, "_up0"), mm.v($$0), this.c);
      agt $$2 = ml.ba.a(mj.a($$0, "_up1"), mm.w($$0), this.c);
      agt $$3 = ml.bb.a(mj.a($$0, "_up_alt0"), mm.v($$0), this.c);
      agt $$4 = ml.bb.a(mj.a($$0, "_up_alt1"), mm.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<me> a(List<agt> $$0, UnaryOperator<me> $$1) {
      return $$0.stream().map($$0x -> me.a().a(mf.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      lz $$0 = lz.a().a(djf.L, false).a(djf.M, false).a(djf.N, false).a(djf.O, false).a(djf.J, false);
      List<agt> $$1 = this.A(cwb.cr);
      List<agt> $$2 = this.B(cwb.cr);
      List<agt> $$3 = this.C(cwb.cr);
      this.b
         .accept(
            ma.a(cwb.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(lz.b(lz.a().a(djf.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(lz.b(lz.a().a(djf.M, true), $$0), a($$2, $$0x -> $$0x.a(mf.b, mf.a.b)))
               .a(lz.b(lz.a().a(djf.N, true), $$0), a($$2, $$0x -> $$0x.a(mf.b, mf.a.c)))
               .a(lz.b(lz.a().a(djf.O, true), $$0), a($$2, $$0x -> $$0x.a(mf.b, mf.a.d)))
               .a(lz.a().a(djf.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<agt> $$0 = this.A(cwb.cs);
      List<agt> $$1 = this.B(cwb.cs);
      this.b
         .accept(
            ma.a(cwb.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mf.b, mf.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mf.b, mf.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mf.b, mf.a.d)))
         );
   }

   private void D(cvz $$0) {
      agt $$1 = mo.t.create($$0, this.c);
      agt $$2 = mo.u.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(mb.a($$0).a(a(djf.j, $$2, $$1)));
   }

   private void N() {
      mm $$0 = mm.a(mm.a(cwb.ad, "_side"), mm.a(cwb.ad, "_top"));
      agt $$1 = ml.j.a(cwb.ad, $$0, this.c);
      this.b.accept(d(cwb.ad, $$1));
   }

   private void O() {
      this.a(cmk.ad);
      cvz $$0 = cwb.E;
      mc.b<Boolean, Integer> $$1 = mc.a(dat.d, dat.b);
      agt $$2 = mj.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         agt $$4 = mj.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, me.a().a(mf.c, $$4));
         $$1.a(false, $$3, me.a().a(mf.c, $$2));
      }

      this.b.accept(mb.a(cwb.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mb.a(cwb.kI)
               .a(
                  mc.a(djf.as)
                     .a(0, me.a().a(mf.c, this.a(cwb.kI, "_0", ml.c, mm::b)))
                     .a(1, me.a().a(mf.c, this.a(cwb.kI, "_1", ml.c, mm::b)))
                     .a(2, me.a().a(mf.c, this.a(cwb.kI, "_2", ml.c, mm::b)))
                     .a(3, me.a().a(mf.c, this.a(cwb.kI, "_3", ml.c, mm::b)))
               )
         );
   }

   private void Q() {
      agt $$0 = mm.G(cwb.j);
      mm $$1 = new mm().a(mn.e, $$0).b(mn.e, mn.c).a(mn.f, mm.a(cwb.i, "_top")).a(mn.i, mm.a(cwb.i, "_snow"));
      me $$2 = me.a().a(mf.c, ml.n.a(cwb.i, "_snow", $$1, this.c));
      this.a(cwb.i, mj.a(cwb.i), $$2);
      agt $$3 = mo.f.get(cwb.fl).a($$1x -> $$1x.a(mn.e, $$0)).a(cwb.fl, this.c);
      this.a(cwb.fl, $$3, $$2);
      agt $$4 = mo.f.get(cwb.l).a($$1x -> $$1x.a(mn.e, $$0)).a(cwb.l, this.c);
      this.a(cwb.l, $$4, $$2);
   }

   private void a(cvz $$0, agt $$1, me $$2) {
      List<me> $$3 = Arrays.asList(a($$1));
      this.b.accept(mb.a($$0).a(mc.a(djf.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cmk.re);
      this.b
         .accept(
            mb.a(cwb.fC)
               .a(
                  mc.a(djf.ar)
                     .a(0, me.a().a(mf.c, mj.a(cwb.fC, "_stage0")))
                     .a(1, me.a().a(mf.c, mj.a(cwb.fC, "_stage1")))
                     .a(2, me.a().a(mf.c, mj.a(cwb.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cwb.kE, mj.a(cwb.kE)));
   }

   private void j(cvz $$0, cvz $$1) {
      mm $$2 = mm.b($$1);
      agt $$3 = ml.Y.a($$0, $$2, this.c);
      agt $$4 = ml.Z.a($$0, $$2, this.c);
      this.b.accept(mb.a($$0).a(a(djf.aT, 1, $$4, $$3)));
   }

   private void T() {
      agt $$0 = mj.a(cwb.hc);
      agt $$1 = mj.a(cwb.hc, "_side");
      this.a(cmk.lQ);
      this.b
         .accept(
            mb.a(cwb.hc)
               .a(
                  mc.a(djf.Q)
                     .a(ia.a, me.a().a(mf.c, $$0))
                     .a(ia.c, me.a().a(mf.c, $$1))
                     .a(ia.f, me.a().a(mf.c, $$1).a(mf.b, mf.a.b))
                     .a(ia.d, me.a().a(mf.c, $$1).a(mf.b, mf.a.c))
                     .a(ia.e, me.a().a(mf.c, $$1).a(mf.b, mf.a.d))
               )
         );
   }

   private void k(cvz $$0, cvz $$1) {
      agt $$2 = mj.a($$0);
      this.b.accept(mb.a($$1, me.a().a(mf.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      agt $$0 = mj.a(cwb.eW, "_post_ends");
      agt $$1 = mj.a(cwb.eW, "_post");
      agt $$2 = mj.a(cwb.eW, "_cap");
      agt $$3 = mj.a(cwb.eW, "_cap_alt");
      agt $$4 = mj.a(cwb.eW, "_side");
      agt $$5 = mj.a(cwb.eW, "_side_alt");
      this.b
         .accept(
            ma.a(cwb.eW)
               .a(me.a().a(mf.c, $$0))
               .a(lz.a().a(djf.L, false).a(djf.M, false).a(djf.N, false).a(djf.O, false), me.a().a(mf.c, $$1))
               .a(lz.a().a(djf.L, true).a(djf.M, false).a(djf.N, false).a(djf.O, false), me.a().a(mf.c, $$2))
               .a(lz.a().a(djf.L, false).a(djf.M, true).a(djf.N, false).a(djf.O, false), me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.L, false).a(djf.M, false).a(djf.N, true).a(djf.O, false), me.a().a(mf.c, $$3))
               .a(lz.a().a(djf.L, false).a(djf.M, false).a(djf.N, false).a(djf.O, true), me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.L, true), me.a().a(mf.c, $$4))
               .a(lz.a().a(djf.M, true), me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
               .a(lz.a().a(djf.N, true), me.a().a(mf.c, $$5))
               .a(lz.a().a(djf.O, true), me.a().a(mf.c, $$5).a(mf.b, mf.a.b))
         );
      this.d(cwb.eW);
   }

   private void E(cvz $$0) {
      this.b.accept(mb.a($$0, me.a().a(mf.c, mj.a($$0))).a(b()));
   }

   private void V() {
      agt $$0 = mj.a(cwb.dw);
      agt $$1 = mj.a(cwb.dw, "_on");
      this.d(cwb.dw);
      this.b
         .accept(
            mb.a(cwb.dw)
               .a(a(djf.w, $$0, $$1))
               .a(
                  mc.a(djf.U, djf.R)
                     .a(dja.c, ia.c, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.c))
                     .a(dja.c, ia.f, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.d))
                     .a(dja.c, ia.d, me.a().a(mf.a, mf.a.c))
                     .a(dja.c, ia.e, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.b))
                     .a(dja.a, ia.c, me.a())
                     .a(dja.a, ia.f, me.a().a(mf.b, mf.a.b))
                     .a(dja.a, ia.d, me.a().a(mf.b, mf.a.c))
                     .a(dja.a, ia.e, me.a().a(mf.b, mf.a.d))
                     .a(dja.b, ia.c, me.a().a(mf.a, mf.a.b))
                     .a(dja.b, ia.f, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.b))
                     .a(dja.b, ia.d, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.c))
                     .a(dja.b, ia.e, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.d))
               )
         );
   }

   private void W() {
      this.d(cwb.fm);
      this.b.accept(b(cwb.fm, mj.a(cwb.fm)));
   }

   private void X() {
      this.d(cwb.tn);
      this.b.accept(c(cwb.tn, mj.a(cwb.tn)));
   }

   private void Y() {
      this.b.accept(mb.a(cwb.ed).a(mc.a(djf.H).a(ia.a.a, me.a().a(mf.c, mj.a(cwb.ed, "_ns"))).a(ia.a.c, me.a().a(mf.c, mj.a(cwb.ed, "_ew")))));
   }

   private void Z() {
      agt $$0 = mo.a.create(cwb.dV, this.c);
      this.b
         .accept(
            mb.a(
               cwb.dV,
               me.a().a(mf.c, $$0),
               me.a().a(mf.c, $$0).a(mf.a, mf.a.b),
               me.a().a(mf.c, $$0).a(mf.a, mf.a.c),
               me.a().a(mf.c, $$0).a(mf.a, mf.a.d),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.b),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.b).a(mf.a, mf.a.b),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.b).a(mf.a, mf.a.c),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.b).a(mf.a, mf.a.d),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.c),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.c).a(mf.a, mf.a.b),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.c).a(mf.a, mf.a.c),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.c).a(mf.a, mf.a.d),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.d),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.d).a(mf.a, mf.a.b),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.d).a(mf.a, mf.a.c),
               me.a().a(mf.c, $$0).a(mf.b, mf.a.d).a(mf.a, mf.a.d)
            )
         );
   }

   private void aa() {
      agt $$0 = mj.a(cwb.kO);
      agt $$1 = mj.a(cwb.kO, "_on");
      this.b.accept(mb.a(cwb.kO).a(a(djf.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mm $$0 = new mm().a(mn.e, mm.a(cwb.by, "_bottom")).a(mn.i, mm.a(cwb.by, "_side"));
      agt $$1 = mm.a(cwb.by, "_top_sticky");
      agt $$2 = mm.a(cwb.by, "_top");
      mm $$3 = $$0.c(mn.E, $$1);
      mm $$4 = $$0.c(mn.E, $$2);
      agt $$5 = mj.a(cwb.by, "_base");
      this.a(cwb.by, $$5, $$4);
      this.a(cwb.br, $$5, $$3);
      agt $$6 = ml.n.a(cwb.by, "_inventory", $$0.c(mn.f, $$2), this.c);
      agt $$7 = ml.n.a(cwb.br, "_inventory", $$0.c(mn.f, $$1), this.c);
      this.a(cwb.by, $$6);
      this.a(cwb.br, $$7);
   }

   private void a(cvz $$0, agt $$1, mm $$2) {
      agt $$3 = ml.bh.a($$0, $$2, this.c);
      this.b.accept(mb.a($$0).a(a(djf.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mm $$0 = new mm().a(mn.F, mm.a(cwb.by, "_top")).a(mn.i, mm.a(cwb.by, "_side"));
      mm $$1 = $$0.c(mn.E, mm.a(cwb.by, "_top_sticky"));
      mm $$2 = $$0.c(mn.E, mm.a(cwb.by, "_top"));
      this.b
         .accept(
            mb.a(cwb.bz)
               .a(
                  mc.a(djf.x, djf.bg)
                     .a(false, djr.a, me.a().a(mf.c, ml.bi.a(cwb.by, "_head", $$2, this.c)))
                     .a(false, djr.b, me.a().a(mf.c, ml.bi.a(cwb.by, "_head_sticky", $$1, this.c)))
                     .a(true, djr.a, me.a().a(mf.c, ml.bj.a(cwb.by, "_head_short", $$2, this.c)))
                     .a(true, djr.b, me.a().a(mf.c, ml.bj.a(cwb.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      cvz $$0 = cwb.tr;
      mm $$1 = mm.a($$0, "_side_inactive", "_top_inactive");
      mm $$2 = mm.a($$0, "_side_active", "_top_active");
      mm $$3 = mm.a($$0, "_side_active", "_top_ejecting_reward");
      agt $$4 = ml.o.a($$0, $$1, this.c);
      agt $$5 = ml.o.a($$0, "_active", $$2, this.c);
      agt $$6 = ml.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(mb.a($$0).a(mc.a(djf.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> me.a().a(mf.c, $$4);
            case b, c, d -> me.a().a(mf.c, $$5);
            case e -> me.a().a(mf.c, $$6);
         };
      })));
   }

   private void ae() {
      agt $$0 = mj.a(cwb.qQ, "_inactive");
      agt $$1 = mj.a(cwb.qQ, "_active");
      this.a(cwb.qQ, $$0);
      this.b.accept(mb.a(cwb.qQ).a(mc.a(djf.bo).a($$2 -> me.a().a(mf.c, $$2 != djw.b && $$2 != djw.c ? $$0 : $$1))));
   }

   private void af() {
      agt $$0 = mj.a(cwb.qR, "_inactive");
      agt $$1 = mj.a(cwb.qR, "_active");
      this.a(cwb.qR, $$0);
      this.b.accept(mb.a(cwb.qR).a(mc.a(djf.bo).a($$2 -> me.a().a(mf.c, $$2 != djw.b && $$2 != djw.c ? $$0 : $$1))).a(b()));
   }

   private void ag() {
      agt $$0 = ml.bM.a(cwb.qV, mm.a(false), this.c);
      agt $$1 = ml.bM.a(cwb.qV, "_can_summon", mm.a(true), this.c);
      this.a(cwb.qV, $$0);
      this.b.accept(mb.a(cwb.qV).a(a(djf.G, $$1, $$0)));
   }

   private void ah() {
      agt $$0 = mj.a(cwb.nS, "_stable");
      agt $$1 = mj.a(cwb.nS, "_unstable");
      this.a(cwb.nS, $$0);
      this.b.accept(mb.a(cwb.nS).a(a(djf.b, $$1, $$0)));
   }

   private void ai() {
      agt $$0 = this.a(cwb.sv, "", ml.ao, mm::c);
      agt $$1 = this.a(cwb.sv, "_lit", ml.ao, mm::c);
      this.b.accept(mb.a(cwb.sv).a(a(djf.D, $$1, $$0)));
      agt $$2 = this.a(cwb.sw, "", ml.ao, mm::c);
      agt $$3 = this.a(cwb.sw, "_lit", ml.ao, mm::c);
      this.b.accept(mb.a(cwb.sw).a(a(djf.D, $$3, $$2)));
   }

   private void aj() {
      agt $$0 = mo.a.create(cwb.fB, this.c);
      agt $$1 = this.a(cwb.fB, "_on", ml.c, mm::b);
      this.b.accept(mb.a(cwb.fB).a(a(djf.r, $$1, $$0)));
   }

   private void l(cvz $$0, cvz $$1) {
      mm $$2 = mm.y($$0);
      this.b.accept(c($$0, ml.bf.a($$0, $$2, this.c)));
      this.b.accept(mb.a($$1, me.a().a(mf.c, ml.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ak() {
      mm $$0 = mm.y(cwb.dK);
      mm $$1 = mm.i(mm.a(cwb.dK, "_off"));
      agt $$2 = ml.bf.a(cwb.dK, $$0, this.c);
      agt $$3 = ml.bf.a(cwb.dK, "_off", $$1, this.c);
      this.b.accept(mb.a(cwb.dK).a(a(djf.r, $$2, $$3)));
      agt $$4 = ml.bg.a(cwb.dL, $$0, this.c);
      agt $$5 = ml.bg.a(cwb.dL, "_off", $$1, this.c);
      this.b.accept(mb.a(cwb.dL).a(a(djf.r, $$4, $$5)).a(d()));
      this.d(cwb.dK);
      this.c(cwb.dL);
   }

   private void al() {
      this.a(cmk.lJ);
      this.b.accept(mb.a(cwb.eh).a(mc.a(djf.aA, djf.s, djf.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return me.a().a(mf.c, mm.a(cwb.eh, $$3.toString()));
      })).a(c()));
   }

   private void am() {
      this.a(cmk.cS);
      this.b
         .accept(
            mb.a(cwb.mV)
               .a(
                  mc.a(djf.aS, djf.C)
                     .a(1, false, Arrays.asList(a(mj.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(mj.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(mj.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(mj.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(mj.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(mj.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(mj.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(mj.a("four_sea_pickles"))))
               )
         );
   }

   private void an() {
      mm $$0 = mm.a(cwb.dN);
      agt $$1 = ml.c.a(cwb.dP, $$0, this.c);
      this.b.accept(mb.a(cwb.dN).a(mc.a(djf.aF).a($$1x -> me.a().a(mf.c, $$1x < 8 ? mj.a(cwb.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cwb.dN, mj.a(cwb.dN, "_height2"));
      this.b.accept(c(cwb.dP, $$1));
   }

   private void ao() {
      this.b.accept(mb.a(cwb.oc, me.a().a(mf.c, mj.a(cwb.oc))).a(b()));
   }

   private void ap() {
      agt $$0 = mo.a.create(cwb.pa, this.c);
      this.a(cwb.pa, $$0);
      this.b.accept(mb.a(cwb.pa).a(mc.a(djf.bj).a($$0x -> me.a().a(mf.c, this.a(cwb.pa, "_" + $$0x.c(), ml.c, mm::b)))));
   }

   private void aq() {
      this.a(cmk.wi);
      this.b.accept(mb.a(cwb.oi).a(mc.a(djf.as).a($$0 -> me.a().a(mf.c, this.a(cwb.oi, "_stage" + $$0, ml.ao, mm::c)))));
   }

   private void ar() {
      this.a(cmk.pp);
      this.b
         .accept(
            mb.a(cwb.fI)
               .a(
                  mc.a(djf.a, djf.M, djf.L, djf.N, djf.O)
                     .a(false, false, false, false, false, me.a().a(mf.c, mj.a(cwb.fI, "_ns")))
                     .a(false, true, false, false, false, me.a().a(mf.c, mj.a(cwb.fI, "_n")).a(mf.b, mf.a.b))
                     .a(false, false, true, false, false, me.a().a(mf.c, mj.a(cwb.fI, "_n")))
                     .a(false, false, false, true, false, me.a().a(mf.c, mj.a(cwb.fI, "_n")).a(mf.b, mf.a.c))
                     .a(false, false, false, false, true, me.a().a(mf.c, mj.a(cwb.fI, "_n")).a(mf.b, mf.a.d))
                     .a(false, true, true, false, false, me.a().a(mf.c, mj.a(cwb.fI, "_ne")))
                     .a(false, true, false, true, false, me.a().a(mf.c, mj.a(cwb.fI, "_ne")).a(mf.b, mf.a.b))
                     .a(false, false, false, true, true, me.a().a(mf.c, mj.a(cwb.fI, "_ne")).a(mf.b, mf.a.c))
                     .a(false, false, true, false, true, me.a().a(mf.c, mj.a(cwb.fI, "_ne")).a(mf.b, mf.a.d))
                     .a(false, false, true, true, false, me.a().a(mf.c, mj.a(cwb.fI, "_ns")))
                     .a(false, true, false, false, true, me.a().a(mf.c, mj.a(cwb.fI, "_ns")).a(mf.b, mf.a.b))
                     .a(false, true, true, true, false, me.a().a(mf.c, mj.a(cwb.fI, "_nse")))
                     .a(false, true, false, true, true, me.a().a(mf.c, mj.a(cwb.fI, "_nse")).a(mf.b, mf.a.b))
                     .a(false, false, true, true, true, me.a().a(mf.c, mj.a(cwb.fI, "_nse")).a(mf.b, mf.a.c))
                     .a(false, true, true, false, true, me.a().a(mf.c, mj.a(cwb.fI, "_nse")).a(mf.b, mf.a.d))
                     .a(false, true, true, true, true, me.a().a(mf.c, mj.a(cwb.fI, "_nsew")))
                     .a(true, false, false, false, false, me.a().a(mf.c, mj.a(cwb.fI, "_attached_ns")))
                     .a(true, false, true, false, false, me.a().a(mf.c, mj.a(cwb.fI, "_attached_n")))
                     .a(true, false, false, true, false, me.a().a(mf.c, mj.a(cwb.fI, "_attached_n")).a(mf.b, mf.a.c))
                     .a(true, true, false, false, false, me.a().a(mf.c, mj.a(cwb.fI, "_attached_n")).a(mf.b, mf.a.b))
                     .a(true, false, false, false, true, me.a().a(mf.c, mj.a(cwb.fI, "_attached_n")).a(mf.b, mf.a.d))
                     .a(true, true, true, false, false, me.a().a(mf.c, mj.a(cwb.fI, "_attached_ne")))
                     .a(true, true, false, true, false, me.a().a(mf.c, mj.a(cwb.fI, "_attached_ne")).a(mf.b, mf.a.b))
                     .a(true, false, false, true, true, me.a().a(mf.c, mj.a(cwb.fI, "_attached_ne")).a(mf.b, mf.a.c))
                     .a(true, false, true, false, true, me.a().a(mf.c, mj.a(cwb.fI, "_attached_ne")).a(mf.b, mf.a.d))
                     .a(true, false, true, true, false, me.a().a(mf.c, mj.a(cwb.fI, "_attached_ns")))
                     .a(true, true, false, false, true, me.a().a(mf.c, mj.a(cwb.fI, "_attached_ns")).a(mf.b, mf.a.b))
                     .a(true, true, true, true, false, me.a().a(mf.c, mj.a(cwb.fI, "_attached_nse")))
                     .a(true, true, false, true, true, me.a().a(mf.c, mj.a(cwb.fI, "_attached_nse")).a(mf.b, mf.a.b))
                     .a(true, false, true, true, true, me.a().a(mf.c, mj.a(cwb.fI, "_attached_nse")).a(mf.b, mf.a.c))
                     .a(true, true, true, false, true, me.a().a(mf.c, mj.a(cwb.fI, "_attached_nse")).a(mf.b, mf.a.d))
                     .a(true, true, true, true, true, me.a().a(mf.c, mj.a(cwb.fI, "_attached_nsew")))
               )
         );
   }

   private void as() {
      this.d(cwb.fH);
      this.b.accept(mb.a(cwb.fH).a(mc.a(djf.a, djf.w).a(($$0, $$1) -> me.a().a(mf.c, mm.a(cwb.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private agt a(int $$0, String $$1, mm $$2) {
      switch ($$0) {
         case 1:
            return ml.bl.a(mj.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return ml.bm.a(mj.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return ml.bn.a(mj.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return ml.bo.a(mj.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private agt a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mm.b(mm.G(cwb.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mm.b(mm.a(cwb.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mm.b(mm.a(cwb.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void at() {
      this.a(cmk.ko);
      this.b.accept(mb.a(cwb.mf).a(mc.a(djf.aD, djf.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void au() {
      this.a(cmk.kp);
      Function<Integer, agt> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mm $$2 = mm.a($$1);
         return ml.bw.a(cwb.mg, $$1, $$2, this.c);
      };
      this.b.accept(mb.a(cwb.mg).a(mc.a(ddg.c).a($$1 -> me.a().a(mf.c, $$0.apply($$1)))));
   }

   private void F(cvz $$0) {
      this.d($$0);
      agt $$1 = mj.a($$0);
      ma $$2 = ma.a($$0);
      lz.c $$3 = ac.a(lz.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<djg, Function<agt, me>> $$4 : a) {
         djg $$5 = (djg)$$4.getFirst();
         Function<agt, me> $$6 = (Function<agt, me>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(lz.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void av() {
      agt $$0 = mm.a(cwb.qU, "_bottom");
      mm $$1 = new mm().a(mn.e, $$0).a(mn.f, mm.a(cwb.qU, "_top")).a(mn.i, mm.a(cwb.qU, "_side"));
      mm $$2 = new mm().a(mn.e, $$0).a(mn.f, mm.a(cwb.qU, "_top_bloom")).a(mn.i, mm.a(cwb.qU, "_side_bloom"));
      agt $$3 = ml.n.a(cwb.qU, "", $$1, this.c);
      agt $$4 = ml.n.a(cwb.qU, "_bloom", $$2, this.c);
      this.b.accept(mb.a(cwb.qU).a(mc.a(djf.E).a($$2x -> me.a().a(mf.c, $$2x ? $$4 : $$3))));
      this.a(cmk.gi, $$3);
   }

   private void aw() {
      cvz $$0 = cwb.cm;
      agt $$1 = mj.a($$0);
      ma $$2 = ma.a($$0);
      Map.of(ia.c, mf.a.a, ia.f, mf.a.b, ia.d, mf.a.c, ia.e, mf.a.d).forEach(($$2x, $$3) -> {
         lz.c $$4 = lz.a().a(djf.R, $$2x);
         $$2.a($$4, me.a().a(mf.c, $$1).a(mf.b, $$3).a(mf.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mj.a($$0, "_inventory"));
      i.clear();
   }

   private void a(ma $$0, lz.c $$1, mf.a $$2) {
      List.of(Pair.of(djf.bp, ml.aM), Pair.of(djf.bq, ml.aN), Pair.of(djf.br, ml.aO), Pair.of(djf.bs, ml.aP), Pair.of(djf.bt, ml.aQ), Pair.of(djf.bu, ml.aR))
         .forEach($$3 -> {
            djg $$4 = (djg)$$3.getFirst();
            mk $$5 = (mk)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(ma $$0, lz.c $$1, mf.a $$2, djg $$3, mk $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mm $$7 = new mm().a(mn.b, mm.a(cwb.cm, $$6));
      lv.d $$8 = new lv.d($$4, $$6);
      agt $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cwb.cm, $$6, $$7, this.c));
      $$0.a(lz.a($$1, lz.a().a($$3, $$5)), me.a().a(mf.c, $$9).a(mf.b, $$2));
   }

   private void ax() {
      this.b.accept(c(cwb.kJ, ml.c.a(cwb.kJ, mm.b(mj.a("magma")), this.c)));
   }

   private void G(cvz $$0) {
      this.b($$0, mo.q);
      ml.bD.a(mj.a($$0.k()), mm.u($$0), this.c);
   }

   private void b(cvz $$0, cvz $$1, lv.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(cvz $$0, cvz $$1) {
      ml.bE.a(mj.a($$0.k()), mm.u($$1), this.c);
   }

   private void ay() {
      agt $$0 = mj.a(cwb.b);
      agt $$1 = mj.a(cwb.b, "_mirrored");
      this.b.accept(a(cwb.eN, $$0, $$1));
      this.a(cwb.eN, $$0);
   }

   private void az() {
      agt $$0 = mj.a(cwb.sJ);
      agt $$1 = mj.a(cwb.sJ, "_mirrored");
      this.b.accept(a(cwb.td, $$0, $$1).a(f()));
      this.a(cwb.td, $$0);
   }

   private void n(cvz $$0, cvz $$1) {
      this.a($$0, lv.e.b);
      mm $$2 = mm.d(mm.a($$0, "_pot"));
      agt $$3 = lv.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aA() {
      agt $$0 = mm.a(cwb.pl, "_bottom");
      agt $$1 = mm.a(cwb.pl, "_top_off");
      agt $$2 = mm.a(cwb.pl, "_top");
      agt[] $$3 = new agt[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mm $$5 = new mm().a(mn.e, $$0).a(mn.f, $$4 == 0 ? $$1 : $$2).a(mn.i, mm.a(cwb.pl, "_side" + $$4));
         $$3[$$4] = ml.n.a(cwb.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mb.a(cwb.pl).a(mc.a(djf.aZ).a($$1x -> me.a().a(mf.c, $$3[$$1x]))));
      this.a(cmk.wG, $$3[0]);
   }

   private me a(ic $$0, me $$1) {
      switch ($$0) {
         case b:
            return $$1.a(mf.a, mf.a.b);
         case c:
            return $$1.a(mf.a, mf.a.b).a(mf.b, mf.a.c);
         case d:
            return $$1.a(mf.a, mf.a.b).a(mf.b, mf.a.d);
         case a:
            return $$1.a(mf.a, mf.a.b).a(mf.b, mf.a.b);
         case f:
            return $$1.a(mf.a, mf.a.d).a(mf.b, mf.a.c);
         case g:
            return $$1.a(mf.a, mf.a.d);
         case h:
            return $$1.a(mf.a, mf.a.d).a(mf.b, mf.a.b);
         case e:
            return $$1.a(mf.a, mf.a.d).a(mf.b, mf.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(mf.b, mf.a.c);
         case i:
            return $$1.a(mf.b, mf.a.d);
         case j:
            return $$1.a(mf.b, mf.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aB() {
      agt $$0 = mm.a(cwb.pb, "_top");
      agt $$1 = mm.a(cwb.pb, "_bottom");
      agt $$2 = mm.a(cwb.pb, "_side");
      agt $$3 = mm.a(cwb.pb, "_lock");
      mm $$4 = new mm().a(mn.o, $$2).a(mn.m, $$2).a(mn.l, $$2).a(mn.c, $$0).a(mn.j, $$0).a(mn.k, $$1).a(mn.n, $$3);
      agt $$5 = ml.b.a(cwb.pb, $$4, this.c);
      this.b.accept(mb.a(cwb.pb, me.a().a(mf.c, $$5)).a(mc.a(djf.T).a($$0x -> this.a($$0x, me.a()))));
   }

   private void aC() {
      cvz $$0 = cwb.n;
      agt $$1 = mj.a($$0);
      mo $$2 = mo.a.get($$0);
      cvz $$3 = cwb.jH;
      agt $$4 = ml.ab.a($$3, $$2.b(), this.c);
      agt $$5 = ml.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ke.a().filter(kf::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cwb.rf).a(ke.w).a(cwb.rf, cwb.rD).a(cwb.rj, cwb.rn).a(ke.y);
      this.h(cwb.re).a(ke.A).a(cwb.re, cwb.rC).a(cwb.ri, cwb.rm).a(ke.C);
      this.h(cwb.rd).a(ke.E).a(cwb.rd, cwb.rB).a(cwb.rh, cwb.rl).a(ke.G);
      this.h(cwb.rc).a(ke.I).a(cwb.rc, cwb.rA).a(cwb.rg, cwb.rk).a(ke.K);
      this.w(cwb.sk);
      this.w(cwb.sl);
      this.w(cwb.sm);
      this.w(cwb.sn);
      this.i(cwb.sk, cwb.so);
      this.i(cwb.sl, cwb.sp);
      this.i(cwb.sm, cwb.sq);
      this.i(cwb.sn, cwb.sr);
      this.m(cwb.a);
      this.c(cwb.nc, cwb.a);
      this.c(cwb.nb, cwb.a);
      this.m(cwb.fO);
      this.m(cwb.dQ);
      this.c(cwb.nd, cwb.G);
      this.m(cwb.fA);
      this.m(cwb.me);
      this.m(cwb.fr);
      this.m(cwb.fR);
      this.a(cmk.tX);
      this.m(cwb.pg);
      this.m(cwb.G);
      this.m(cwb.H);
      this.m(cwb.hV);
      this.a(cmk.fR);
      this.o(cwb.pM, cwb.qd);
      this.o(cwb.pN, cwb.qe);
      this.o(cwb.pO, cwb.qf);
      this.o(cwb.pP, cwb.qg);
      this.o(cwb.pQ, cwb.qh);
      this.o(cwb.pR, cwb.qi);
      this.o(cwb.pS, cwb.qj);
      this.o(cwb.pT, cwb.qk);
      this.o(cwb.pU, cwb.ql);
      this.o(cwb.pV, cwb.qm);
      this.o(cwb.pW, cwb.qn);
      this.o(cwb.pX, cwb.qo);
      this.o(cwb.pY, cwb.qp);
      this.o(cwb.pZ, cwb.qq);
      this.o(cwb.qa, cwb.qr);
      this.o(cwb.qb, cwb.qs);
      this.o(cwb.pL, cwb.qc);
      this.m(cwb.na);
      this.m(cwb.gs);
      this.m(cwb.qP);
      this.m(cwb.sx);
      this.s(cwb.sy);
      this.s(cwb.sz);
      this.t(cwb.ti);
      this.t(cwb.tj);
      this.ai();
      this.g(cwb.sC, cwb.sA);
      this.p(cwb.sB);
      this.a(cwb.hW, cmk.hA);
      this.a(cmk.hA);
      this.aD();
      this.a(cwb.kN, cmk.ja);
      this.a(cmk.ja);
      this.f(cwb.bQ, mm.a(cwb.by, "_side"));
      this.a(cwb.R);
      this.a(cwb.S);
      this.a(cwb.iB);
      this.a(cwb.cx);
      this.a(cwb.cy);
      this.a(cwb.cz);
      this.a(cwb.fE);
      this.a(cwb.fF);
      this.a(cwb.fJ);
      this.a(cwb.N);
      this.a(cwb.T);
      this.a(cwb.O);
      this.a(cwb.ch);
      this.a(cwb.P);
      this.a(cwb.Q);
      this.a(cwb.ci);
      this.b(cwb.pj, mo.d);
      this.a(cwb.pi);
      this.a(cwb.aR);
      this.a(cwb.aS);
      this.a(cwb.aT);
      this.a(cwb.hb);
      this.a(cwb.dI);
      this.a(cwb.dJ);
      this.a(cwb.ha);
      this.a(cwb.pC);
      this.a(cwb.mW);
      this.a(cwb.dR);
      this.a(cwb.k);
      this.a(cwb.pk);
      this.a(cwb.fz);
      this.a(cwb.ec);
      this.a(cwb.L);
      this.a(cwb.ph);
      this.a(cwb.dO);
      this.b(cwb.dT, mo.g);
      this.b(cwb.pq, mo.d);
      this.b(cwb.fa, mo.d);
      this.m(cwb.ac);
      this.m(cwb.ga);
      this.a(cwb.kK);
      this.a(cwb.aY);
      this.a(cwb.iC);
      this.a(cwb.co);
      this.a(cwb.pK);
      this.a(cwb.ii);
      this.a(cwb.oy);
      this.a(cwb.dW);
      this.a(cwb.dX);
      this.b(cwb.ct, mo.b);
      this.a(cwb.aO);
      this.b(cwb.bw, mo.v);
      this.a(cmk.cR);
      this.b(cwb.ck, mo.f);
      this.b(cwb.pd, mo.d);
      this.a(cwb.op);
      this.a(cwb.aP);
      this.a(cwb.qt);
      this.a(cwb.qu);
      this.a(cwb.qN);
      this.a(cwb.su);
      this.a(cwb.tf);
      this.a(cwb.tg);
      this.a(cwb.th);
      this.e(cwb.qS);
      this.aC();
      this.a(cwb.ra);
      this.a(cwb.rb);
      this.a(cwb.qW);
      this.a(cwb.qX);
      this.a(cwb.qY);
      this.a(cwb.qZ);
      this.k(cwb.qW, cwb.rw);
      this.k(cwb.qX, cwb.ry);
      this.k(cwb.qY, cwb.rx);
      this.k(cwb.qZ, cwb.rz);
      this.i(cwb.rM);
      this.i(cwb.rN);
      this.i(cwb.rP);
      this.i(cwb.rO);
      this.a(cwb.rM, cwb.rQ);
      this.a(cwb.rN, cwb.rR);
      this.a(cwb.rP, cwb.rT);
      this.a(cwb.rO, cwb.rS);
      this.k(cwb.rU);
      this.k(cwb.rV);
      this.k(cwb.rX);
      this.k(cwb.rW);
      this.b(cwb.rU, cwb.rY);
      this.b(cwb.rV, cwb.rZ);
      this.b(cwb.rX, cwb.sb);
      this.b(cwb.rW, cwb.sa);
      this.a(cwb.sc);
      this.a(cwb.sd);
      this.a(cwb.se);
      this.a(cwb.sf);
      this.k(cwb.sc, cwb.sg);
      this.k(cwb.sd, cwb.sh);
      this.k(cwb.se, cwb.si);
      this.k(cwb.sf, cwb.sj);
      this.j(cwb.gW, cwb.ch);
      this.j(cwb.gX, cwb.ci);
      this.G();
      this.r();
      this.aw();
      this.v();
      this.w();
      this.a(cwb.og, cwb.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(cwb.kt);
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
      this.F(cwb.ff);
      this.F(cwb.fg);
      this.F(cwb.qT);
      this.ax();
      this.aB();
      this.ae();
      this.af();
      this.ag();
      this.X();
      this.O();
      this.N();
      this.ad();
      this.E(cwb.cO);
      this.d(cwb.cO);
      this.E(cwb.oa);
      this.g();
      this.E(cwb.sE);
      this.l(cwb.cp, cwb.cq);
      this.l(cwb.ea, cwb.eb);
      this.a(cwb.cA, cwb.n, mm::c);
      this.a(cwb.nY, cwb.p, mm::d);
      this.y(cwb.ow);
      this.y(cwb.on);
      this.v(cwb.aU);
      this.v(cwb.hi);
      this.C();
      this.D(cwb.oe);
      this.D(cwb.of);
      this.e(cwb.eX, mj.a(cwb.eX));
      this.a(cwb.dY, mo.d);
      this.a(cwb.dZ, mo.d);
      this.a(cwb.te);
      this.a(cwb.kM, mo.d);
      this.f(cwb.j);
      this.f(cwb.sH);
      this.f(cwb.I);
      this.g(cwb.J);
      this.g(cwb.M);
      this.f(cwb.K);
      this.e(cwb.F);
      this.b(cwb.to, mo.f);
      this.a(cwb.ij, mo.d, mo.e);
      this.a(cwb.kx, mo.w, mo.x);
      this.a(cwb.hf, mo.w, mo.x);
      this.a(cwb.tk, mo.d, mo.e);
      this.a(cwb.tl, mo.d, mo.e);
      this.a(cwb.tm, mo.d, mo.e);
      this.c(cwb.nT, mo.i);
      this.z();
      this.a(cwb.pe, mm::A);
      this.a(cwb.pf, mm::C);
      this.a(cwb.kD, djf.as, 0, 1, 2, 3);
      this.a(cwb.gt, djf.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cwb.fq, djf.as, 0, 1, 1, 2);
      this.a(cwb.gu, djf.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cwb.cB, djf.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cwb.kA, lv.e.b, djf.aq, 0, 1);
      this.i();
      this.h();
      this.a(mj.a("decorated_pot"), cwb.iA).b(cwb.tp);
      this.a(mj.a("banner"), cwb.n)
         .a(ml.bF, cwb.iJ, cwb.iK, cwb.iL, cwb.iM, cwb.iN, cwb.iO, cwb.iP, cwb.iQ, cwb.iR, cwb.iS, cwb.iT, cwb.iU, cwb.iV, cwb.iW, cwb.iX, cwb.iY)
         .b(cwb.iZ, cwb.ja, cwb.jb, cwb.jc, cwb.jd, cwb.je, cwb.jf, cwb.jg, cwb.jh, cwb.ji, cwb.jj, cwb.jk, cwb.jl, cwb.jm, cwb.jn, cwb.jo);
      this.a(mj.a("bed"), cwb.n)
         .b(cwb.aZ, cwb.ba, cwb.bb, cwb.bc, cwb.bd, cwb.be, cwb.bf, cwb.bg, cwb.bh, cwb.bi, cwb.bj, cwb.bk, cwb.bl, cwb.bm, cwb.bn, cwb.bo);
      this.m(cwb.aZ, cwb.bA);
      this.m(cwb.ba, cwb.bB);
      this.m(cwb.bb, cwb.bC);
      this.m(cwb.bc, cwb.bD);
      this.m(cwb.bd, cwb.bE);
      this.m(cwb.be, cwb.bF);
      this.m(cwb.bf, cwb.bG);
      this.m(cwb.bg, cwb.bH);
      this.m(cwb.bh, cwb.bI);
      this.m(cwb.bi, cwb.bJ);
      this.m(cwb.bj, cwb.bK);
      this.m(cwb.bk, cwb.bL);
      this.m(cwb.bl, cwb.bM);
      this.m(cwb.bm, cwb.bN);
      this.m(cwb.bn, cwb.bO);
      this.m(cwb.bo, cwb.bP);
      this.a(mj.a("skull"), cwb.dW)
         .a(ml.bG, cwb.gM, cwb.gK, cwb.gI, cwb.gE, cwb.gG, cwb.gQ)
         .a(cwb.gO)
         .b(cwb.gN, cwb.gP, cwb.gL, cwb.gJ, cwb.gF, cwb.gH, cwb.gR);
      this.G(cwb.kP);
      this.G(cwb.kQ);
      this.G(cwb.kR);
      this.G(cwb.kS);
      this.G(cwb.kT);
      this.G(cwb.kU);
      this.G(cwb.kV);
      this.G(cwb.kW);
      this.G(cwb.kX);
      this.G(cwb.kY);
      this.G(cwb.kZ);
      this.G(cwb.la);
      this.G(cwb.lb);
      this.G(cwb.lc);
      this.G(cwb.ld);
      this.G(cwb.le);
      this.G(cwb.lf);
      this.b(cwb.mX, mo.q);
      this.c(cwb.mX);
      this.a(mj.a("chest"), cwb.n).b(cwb.cv, cwb.gV);
      this.a(mj.a("ender_chest"), cwb.co).b(cwb.fG);
      this.f(cwb.fx, cwb.co).a(cwb.fx, cwb.kF);
      this.a(cwb.aM);
      this.a(cwb.aN);
      this.a(cwb.lw);
      this.a(cwb.lx);
      this.a(cwb.ly);
      this.a(cwb.lz);
      this.a(cwb.lA);
      this.a(cwb.lB);
      this.a(cwb.lC);
      this.a(cwb.lD);
      this.a(cwb.lE);
      this.a(cwb.lF);
      this.a(cwb.lG);
      this.a(cwb.lH);
      this.a(cwb.lI);
      this.a(cwb.lJ);
      this.a(cwb.lK);
      this.a(cwb.lL);
      this.a(mo.a, cwb.lM, cwb.lN, cwb.lO, cwb.lP, cwb.lQ, cwb.lR, cwb.lS, cwb.lT, cwb.lU, cwb.lV, cwb.lW, cwb.lX, cwb.lY, cwb.lZ, cwb.ma, cwb.mb);
      this.a(cwb.iA);
      this.a(cwb.hj);
      this.a(cwb.hk);
      this.a(cwb.hl);
      this.a(cwb.hm);
      this.a(cwb.hn);
      this.a(cwb.ho);
      this.a(cwb.hp);
      this.a(cwb.hq);
      this.a(cwb.hr);
      this.a(cwb.hs);
      this.a(cwb.ht);
      this.a(cwb.hu);
      this.a(cwb.hv);
      this.a(cwb.hw);
      this.a(cwb.hx);
      this.a(cwb.hy);
      this.a(cwb.qO);
      this.h(cwb.aQ, cwb.eY);
      this.h(cwb.ei, cwb.hz);
      this.h(cwb.ej, cwb.hA);
      this.h(cwb.ek, cwb.hB);
      this.h(cwb.el, cwb.hC);
      this.h(cwb.em, cwb.hD);
      this.h(cwb.en, cwb.hE);
      this.h(cwb.eo, cwb.hF);
      this.h(cwb.ep, cwb.hG);
      this.h(cwb.eq, cwb.hH);
      this.h(cwb.er, cwb.hI);
      this.h(cwb.es, cwb.hJ);
      this.h(cwb.et, cwb.hK);
      this.h(cwb.eu, cwb.hL);
      this.h(cwb.ev, cwb.hM);
      this.h(cwb.ew, cwb.hN);
      this.h(cwb.ex, cwb.hO);
      this.b(mo.o, cwb.lg, cwb.lh, cwb.li, cwb.lj, cwb.lk, cwb.ll, cwb.lm, cwb.ln, cwb.lo, cwb.lp, cwb.lq, cwb.lr, cwb.ls, cwb.lt, cwb.lu, cwb.lv);
      this.g(cwb.bA, cwb.ik);
      this.g(cwb.bB, cwb.il);
      this.g(cwb.bC, cwb.im);
      this.g(cwb.bD, cwb.in);
      this.g(cwb.bE, cwb.io);
      this.g(cwb.bF, cwb.ip);
      this.g(cwb.bG, cwb.iq);
      this.g(cwb.bH, cwb.ir);
      this.g(cwb.bI, cwb.is);
      this.g(cwb.bJ, cwb.it);
      this.g(cwb.bK, cwb.iu);
      this.g(cwb.bL, cwb.iv);
      this.g(cwb.bM, cwb.iw);
      this.g(cwb.bN, cwb.ix);
      this.g(cwb.bO, cwb.iy);
      this.g(cwb.bP, cwb.iz);
      this.a(cwb.sI);
      this.a(cwb.eL);
      this.a(cwb.bu, cwb.gb, lv.e.a);
      this.a(cwb.bR, cwb.gc, lv.e.b);
      this.a(cwb.bT, cwb.gd, lv.e.b);
      this.a(cwb.bU, cwb.ge, lv.e.b);
      this.a(cwb.bV, cwb.gf, lv.e.b);
      this.a(cwb.bW, cwb.gg, lv.e.b);
      this.a(cwb.bX, cwb.gh, lv.e.b);
      this.a(cwb.bY, cwb.gi, lv.e.b);
      this.a(cwb.bZ, cwb.gj, lv.e.b);
      this.a(cwb.ca, cwb.gk, lv.e.b);
      this.a(cwb.cb, cwb.gl, lv.e.b);
      this.a(cwb.cc, cwb.gm, lv.e.b);
      this.a(cwb.ce, cwb.gn, lv.e.b);
      this.a(cwb.cd, cwb.go, lv.e.b);
      this.a(cwb.cg, cwb.gp, lv.e.b);
      this.a(cwb.cf, cwb.gq, lv.e.b);
      this.a(cwb.bv, cwb.gr, lv.e.b);
      this.a(cwb.bS, cwb.fS, lv.e.b);
      this.H();
      this.u(cwb.eT);
      this.u(cwb.eU);
      this.u(cwb.eV);
      this.a(cwb.bt, lv.e.a);
      this.b(cwb.dS, lv.e.a);
      this.a(cmk.dI);
      this.b(cwb.mc, cwb.md, lv.e.b);
      this.a(cmk.dJ);
      this.c(cwb.md);
      this.b(cwb.sG, lv.e.b);
      this.c(cwb.sG);
      this.c(cwb.sw);
      this.b(cwb.oz, cwb.oA, lv.e.b);
      this.b(cwb.oB, cwb.oC, lv.e.b);
      this.a(cwb.oz, "_plant");
      this.c(cwb.oA);
      this.a(cwb.oB, "_plant");
      this.c(cwb.oC);
      this.a(cwb.mY, lv.e.a, mm.c(mm.a(cwb.mZ, "_stage0")));
      this.m();
      this.a(cwb.bs, lv.e.b);
      this.c(cwb.iE, lv.e.b);
      this.c(cwb.iF, lv.e.b);
      this.c(cwb.iG, lv.e.b);
      this.c(cwb.iH, lv.e.a);
      this.c(cwb.iI, lv.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cwb.mw, cwb.mr, cwb.mm, cwb.mh, cwb.mG, cwb.mB, cwb.mQ, cwb.mL);
      this.a(cwb.mx, cwb.ms, cwb.mn, cwb.mi, cwb.mH, cwb.mC, cwb.mR, cwb.mM);
      this.a(cwb.my, cwb.mt, cwb.mo, cwb.mj, cwb.mI, cwb.mD, cwb.mS, cwb.mN);
      this.a(cwb.mz, cwb.mu, cwb.mp, cwb.mk, cwb.mJ, cwb.mE, cwb.mT, cwb.mO);
      this.a(cwb.mA, cwb.mv, cwb.mq, cwb.ml, cwb.mK, cwb.mF, cwb.mU, cwb.mP);
      this.e(cwb.fe, cwb.fc);
      this.e(cwb.fd, cwb.fb);
      this.l(cwb.ab).c(cwb.ab).a(cwb.av);
      this.l(cwb.am).c(cwb.am).a(cwb.aD);
      this.a(cwb.am, cwb.dj, cwb.ds);
      this.b(cwb.aL, mo.s);
      this.l(cwb.Y).c(cwb.Y).a(cwb.as);
      this.l(cwb.ai).c(cwb.ai).a(cwb.aA);
      this.a(cwb.ai, cwb.dd, cwb.do);
      this.a(cwb.B, cwb.fX, lv.e.b);
      this.b(cwb.aI, mo.s);
      this.l(cwb.Z).d(cwb.Z).a(cwb.at);
      this.l(cwb.aj).d(cwb.aj).a(cwb.aB);
      this.a(cwb.aj, cwb.de, cwb.dp);
      this.a(cwb.C, cwb.fY, lv.e.b);
      this.b(cwb.aJ, mo.s);
      this.l(cwb.W).c(cwb.W).a(cwb.aq);
      this.l(cwb.ag).c(cwb.ag).a(cwb.ay);
      this.a(cwb.ag, cwb.dc, cwb.dn);
      this.a(cwb.z, cwb.fV, lv.e.b);
      this.b(cwb.aG, mo.s);
      this.l(cwb.U).c(cwb.U).a(cwb.ao);
      this.l(cwb.al).c(cwb.al).a(cwb.aw);
      this.a(cwb.al, cwb.da, cwb.dl);
      this.a(cwb.x, cwb.fT, lv.e.b);
      this.b(cwb.aE, mo.s);
      this.l(cwb.V).c(cwb.V).a(cwb.ap);
      this.l(cwb.af).c(cwb.af).a(cwb.ax);
      this.a(cwb.af, cwb.db, cwb.dm);
      this.a(cwb.y, cwb.fU, lv.e.b);
      this.b(cwb.aF, mo.s);
      this.l(cwb.aa).c(cwb.aa).a(cwb.au);
      this.l(cwb.ak).c(cwb.ak).a(cwb.aC);
      this.a(cwb.ak, cwb.dg, cwb.dr);
      this.a(cwb.D, cwb.fZ, lv.e.b);
      this.b(cwb.aK, mo.s);
      this.l(cwb.X).c(cwb.X).a(cwb.ar);
      this.l(cwb.ah).c(cwb.ah).a(cwb.az);
      this.a(cwb.ah, cwb.df, cwb.dq);
      this.a(cwb.A, cwb.fW, lv.e.b);
      this.b(cwb.aH, mo.s);
      this.l(cwb.os).b(cwb.os).a(cwb.ou);
      this.l(cwb.ot).b(cwb.ot).a(cwb.ov);
      this.a(cwb.ot, cwb.dh, cwb.dt);
      this.a(cwb.ox, cwb.pm, lv.e.b);
      this.n(cwb.oD, cwb.po);
      this.l(cwb.oj).b(cwb.oj).a(cwb.ol);
      this.l(cwb.ok).b(cwb.ok).a(cwb.om);
      this.a(cwb.ok, cwb.di, cwb.du);
      this.a(cwb.oo, cwb.pn, lv.e.b);
      this.n(cwb.oq, cwb.pp);
      this.l(cwb.ae).d(cwb.ae);
      this.l(cwb.an).d(cwb.an);
      this.a(cwb.v, cwb.dk, cwb.dv);
      this.b(cwb.or, lv.e.b);
      this.a(cmk.dF);
      this.i(cwb.dy);
      this.k(cwb.hY);
      this.u();
      this.n(cwb.cP);
      this.o(cwb.bp);
      this.o(cwb.bq);
      this.o(cwb.hh);
      this.t();
      this.q(cwb.fN);
      this.q(cwb.kG);
      this.q(cwb.kH);
      this.r(cwb.gS);
      this.r(cwb.gT);
      this.r(cwb.gU);
      this.o();
      this.p();
      this.d(cwb.cD, mo.h);
      this.d(cwb.nW, mo.h);
      this.d(cwb.nV, mo.i);
      this.s();
      this.aA();
      this.av();
      this.k(cwb.eK, cwb.eS);
      this.k(cwb.m, cwb.eO);
      this.k(cwb.eJ, cwb.eR);
      this.k(cwb.eI, cwb.eQ);
      this.ay();
      this.k(cwb.eH, cwb.eP);
      this.az();
      cnm.h().forEach($$0 -> this.a($$0, mj.b("template_spawn_egg")));
   }

   private void aD() {
      this.c(cwb.hX);
      mc.a<Integer> $$0 = mc.a(djf.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         agt $$3 = mm.a(cmk.hB, $$2);
         $$0.a($$1, me.a().a(mf.c, ml.aa.a(cwb.hX, $$2, mm.h($$3), this.c)));
         ml.bx.a(mj.a(cmk.hB, $$2), mm.k($$3), this.c);
      }

      this.b.accept(mb.a(cwb.hX).a($$0));
   }

   private void o(cvz $$0, cvz $$1) {
      this.a($$0.k());
      mm $$2 = mm.b(mm.G($$0));
      mm $$3 = mm.b(mm.a($$0, "_lit"));
      agt $$4 = ml.bH.a($$0, "_one_candle", $$2, this.c);
      agt $$5 = ml.bI.a($$0, "_two_candles", $$2, this.c);
      agt $$6 = ml.bJ.a($$0, "_three_candles", $$2, this.c);
      agt $$7 = ml.bK.a($$0, "_four_candles", $$2, this.c);
      agt $$8 = ml.bH.a($$0, "_one_candle_lit", $$3, this.c);
      agt $$9 = ml.bI.a($$0, "_two_candles_lit", $$3, this.c);
      agt $$10 = ml.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      agt $$11 = ml.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            mb.a($$0)
               .a(
                  mc.a(djf.az, djf.r)
                     .a(1, false, me.a().a(mf.c, $$4))
                     .a(2, false, me.a().a(mf.c, $$5))
                     .a(3, false, me.a().a(mf.c, $$6))
                     .a(4, false, me.a().a(mf.c, $$7))
                     .a(1, true, me.a().a(mf.c, $$8))
                     .a(2, true, me.a().a(mf.c, $$9))
                     .a(3, true, me.a().a(mf.c, $$10))
                     .a(4, true, me.a().a(mf.c, $$11))
               )
         );
      agt $$12 = ml.bL.a($$1, mm.a($$0, false), this.c);
      agt $$13 = ml.bL.a($$1, "_lit", mm.a($$0, true), this.c);
      this.b.accept(mb.a($$1).a(a(djf.r, $$13, $$12)));
   }

   class a {
      private final agt b;

      public a(agt $$0, cvz $$1) {
         this.b = ml.aa.a($$0, mm.u($$1), lv.this.c);
      }

      public lv.a a(cvz... $$0) {
         for (cvz $$1 : $$0) {
            lv.this.b.accept(lv.c($$1, this.b));
         }

         return this;
      }

      public lv.a b(cvz... $$0) {
         for (cvz $$1 : $$0) {
            lv.this.c($$1);
         }

         return this.a($$0);
      }

      public lv.a a(mk $$0, cvz... $$1) {
         for (cvz $$2 : $$1) {
            $$0.a(mj.a($$2.k()), mm.u($$2), lv.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mm b;
      private final Map<mk, agt> c = Maps.newHashMap();
      @Nullable
      private kf d;
      @Nullable
      private agt e;
      private final Set<cvz> f = new HashSet<>();

      public b(mm $$0) {
         this.b = $$0;
      }

      public lv.b a(cvz $$0, mk $$1) {
         this.e = $$1.a($$0, this.b, lv.this.c);
         if (lv.this.f.containsKey($$0)) {
            lv.this.b.accept(lv.this.f.get($$0).create($$0, this.e, this.b, lv.this.c));
         } else {
            lv.this.b.accept(lv.c($$0, this.e));
         }

         return this;
      }

      public lv.b a(cvz $$0, cvz $$1) {
         agt $$2 = mj.a($$0);
         lv.this.b.accept(lv.c($$1, $$2));
         lv.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public lv.b a(cvz $$0) {
         agt $$1 = ml.s.a($$0, this.b, lv.this.c);
         agt $$2 = ml.t.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.b($$0, $$1, $$2));
         agt $$3 = ml.u.a($$0, this.b, lv.this.c);
         lv.this.a($$0, $$3);
         return this;
      }

      public lv.b b(cvz $$0) {
         agt $$1 = ml.M.a($$0, this.b, lv.this.c);
         agt $$2 = ml.N.a($$0, this.b, lv.this.c);
         agt $$3 = ml.O.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.a($$0, $$1, $$2, $$3));
         agt $$4 = ml.P.a($$0, this.b, lv.this.c);
         lv.this.a($$0, $$4);
         return this;
      }

      public lv.b c(cvz $$0) {
         mm $$1 = mm.p($$0);
         agt $$2 = ml.D.a($$0, $$1, lv.this.c);
         agt $$3 = ml.E.a($$0, $$1, lv.this.c);
         agt $$4 = ml.F.a($$0, $$1, lv.this.c);
         agt $$5 = ml.G.a($$0, $$1, lv.this.c);
         agt $$6 = ml.H.a($$0, $$1, lv.this.c);
         lv.this.b.accept(lv.a($$0, $$2, $$3, $$4, $$5, $$6));
         agt $$7 = ml.I.a($$0, $$1, lv.this.c);
         lv.this.a($$0, $$7);
         return this;
      }

      public lv.b d(cvz $$0) {
         agt $$1 = ml.J.a($$0, this.b, lv.this.c);
         agt $$2 = ml.K.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.c($$0, $$1, $$2));
         agt $$3 = ml.L.a($$0, this.b, lv.this.c);
         lv.this.a($$0, $$3);
         return this;
      }

      public lv.b e(cvz $$0) {
         mm $$1 = mm.p($$0);
         agt $$2 = ml.R.a($$0, $$1, lv.this.c);
         agt $$3 = ml.Q.a($$0, $$1, lv.this.c);
         agt $$4 = ml.T.a($$0, $$1, lv.this.c);
         agt $$5 = ml.S.a($$0, $$1, lv.this.c);
         lv.this.b.accept(lv.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public lv.b f(cvz $$0) {
         agt $$1 = ml.V.a($$0, this.b, lv.this.c);
         agt $$2 = ml.U.a($$0, this.b, lv.this.c);
         agt $$3 = ml.X.a($$0, this.b, lv.this.c);
         agt $$4 = ml.W.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public lv.b g(cvz $$0) {
         agt $$1 = ml.Y.a($$0, this.b, lv.this.c);
         agt $$2 = ml.Z.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.e($$0, $$1, $$2));
         return this;
      }

      public lv.b h(cvz $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cvz $$1 = this.d.b().get(kf.b.r);
            agt $$2 = ml.aa.a($$0, this.b, lv.this.c);
            lv.this.b.accept(lv.c($$0, $$2));
            lv.this.b.accept(lv.c($$1, $$2));
            lv.this.a($$0.k());
            lv.this.c($$1);
            return this;
         }
      }

      public lv.b i(cvz $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            agt $$1 = this.a(ml.ab, $$0);
            agt $$2 = this.a(ml.ac, $$0);
            lv.this.b.accept(lv.e($$0, $$1, $$2, this.e));
            lv.this.a($$0, $$1);
            return this;
         }
      }

      public lv.b j(cvz $$0) {
         agt $$1 = this.a(ml.af, $$0);
         agt $$2 = this.a(ml.ae, $$0);
         agt $$3 = this.a(ml.ag, $$0);
         lv.this.b.accept(lv.b($$0, $$1, $$2, $$3));
         lv.this.a($$0, $$2);
         return this;
      }

      private lv.b k(cvz $$0) {
         mo $$1 = lv.this.g.getOrDefault($$0, mo.a.get($$0));
         agt $$2 = $$1.a($$0, lv.this.c);
         lv.this.b.accept(lv.c($$0, $$2));
         return this;
      }

      private lv.b l(cvz $$0) {
         lv.this.i($$0);
         return this;
      }

      private void m(cvz $$0) {
         if (lv.this.e.contains($$0)) {
            lv.this.k($$0);
         } else {
            lv.this.j($$0);
         }
      }

      private agt a(mk $$0, cvz $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, lv.this.c));
      }

      public lv.b a(kf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<lv.b, cvz> $$2 = lv.h.get($$0x);
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
      ly create(cvz var1, agt var2, mm var3, BiConsumer<agt, Supplier<JsonElement>> var4);
   }

   static record d(mk a, String b) {
   }

   static enum e {
      a,
      b;

      public mk a() {
         return this == a ? ml.ap : ml.ao;
      }

      public mk b() {
         return this == a ? ml.ar : ml.aq;
      }
   }

   class f {
      private final mm b;

      public f(mm $$0) {
         this.b = $$0;
      }

      public lv.f a(cvz $$0) {
         mm $$1 = this.b.c(mn.d, this.b.a(mn.i));
         agt $$2 = ml.j.a($$0, $$1, lv.this.c);
         lv.this.b.accept(lv.d($$0, $$2));
         return this;
      }

      public lv.f b(cvz $$0) {
         agt $$1 = ml.j.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.d($$0, $$1));
         return this;
      }

      public lv.f c(cvz $$0) {
         agt $$1 = ml.j.a($$0, this.b, lv.this.c);
         agt $$2 = ml.k.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.d($$0, $$1, $$2));
         return this;
      }

      public lv.f d(cvz $$0) {
         lv.this.b.accept(lv.a($$0, this.b, lv.this.c));
         return this;
      }
   }
}
