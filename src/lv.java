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
   final BiConsumer<agm, Supplier<JsonElement>> c;
   private final Consumer<clj> d;
   final List<cvf> e = ImmutableList.of(cvh.ey, cvh.eE, cvh.hY);
   final Map<cvf, lv.c> f = ImmutableMap.builder().put(cvh.b, lv::a).put(cvh.sJ, lv::c).put(cvh.eM, lv::b).build();
   final Map<cvf, mo> g = ImmutableMap.builder()
      .put(cvh.aV, mo.x.get(cvh.aV))
      .put(cvh.jp, mo.x.get(cvh.jp))
      .put(cvh.jS, mo.a(mm.a(cvh.aV, "_top")))
      .put(cvh.jU, mo.a(mm.a(cvh.jp, "_top")))
      .put(cvh.aX, mo.c.get(cvh.aV).a($$0x -> $$0x.a(mn.i, mm.G(cvh.aX))))
      .put(cvh.jr, mo.c.get(cvh.jp).a($$0x -> $$0x.a(mn.i, mm.G(cvh.jr))))
      .put(cvh.hd, mo.c.get(cvh.hd))
      .put(cvh.jT, mo.a(mm.a(cvh.hd, "_bottom")))
      .put(cvh.pr, mo.y.get(cvh.pr))
      .put(cvh.sJ, mo.y.get(cvh.sJ))
      .put(cvh.he, mo.c.get(cvh.he).a($$0x -> $$0x.a(mn.i, mm.G(cvh.he))))
      .put(cvh.aW, mo.c.get(cvh.aW).a($$0x -> {
         $$0x.a(mn.d, mm.a(cvh.aV, "_top"));
         $$0x.a(mn.i, mm.G(cvh.aW));
      }))
      .put(cvh.jq, mo.c.get(cvh.jq).a($$0x -> {
         $$0x.a(mn.d, mm.a(cvh.jp, "_top"));
         $$0x.a(mn.i, mm.G(cvh.jq));
      }))
      .put(cvh.qM, mo.y.get(cvh.qM))
      .put(cvh.qH, mo.y.get(cvh.qH))
      .build();
   static final Map<kg.b, BiConsumer<lv.b, cvf>> h = ImmutableMap.builder()
      .put(kg.b.a, lv.b::a)
      .put(kg.b.e, lv.b::l)
      .put(kg.b.b, lv.b::k)
      .put(kg.b.c, lv.b::k)
      .put(kg.b.f, lv.b::c)
      .put(kg.b.g, lv.b::d)
      .put(kg.b.h, lv.b::e)
      .put(kg.b.i, lv.b::f)
      .put(kg.b.k, lv.b::h)
      .put(kg.b.l, lv.b::i)
      .put(kg.b.m, lv.b::j)
      .put(kg.b.n, lv.b::g)
      .put(kg.b.p, lv.b::m)
      .put(kg.b.q, lv.b::b)
      .build();
   public static final List<Pair<die, Function<agm, me>>> a = List.of(
      Pair.of(did.L, (Function<agm, me>)$$0 -> me.a().a(mf.c, $$0)),
      Pair.of(did.M, (Function<agm, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.b, mf.a.b).a(mf.d, true)),
      Pair.of(did.N, (Function<agm, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.b, mf.a.c).a(mf.d, true)),
      Pair.of(did.O, (Function<agm, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.b, mf.a.d).a(mf.d, true)),
      Pair.of(did.J, (Function<agm, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.a, mf.a.d).a(mf.d, true)),
      Pair.of(did.K, (Function<agm, me>)$$0 -> me.a().a(mf.c, $$0).a(mf.a, mf.a.b).a(mf.d, true))
   );
   private static final Map<lv.d, agm> i = new HashMap<>();

   private static ly a(cvf $$0, agm $$1, mm $$2, BiConsumer<agm, Supplier<JsonElement>> $$3) {
      agm $$4 = ml.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static ly b(cvf $$0, agm $$1, mm $$2, BiConsumer<agm, Supplier<JsonElement>> $$3) {
      agm $$4 = ml.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static ly c(cvf $$0, agm $$1, mm $$2, BiConsumer<agm, Supplier<JsonElement>> $$3) {
      agm $$4 = ml.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public lv(Consumer<ly> $$0, BiConsumer<agm, Supplier<JsonElement>> $$1, Consumer<clj> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cvf $$0) {
      this.d.accept($$0.k());
   }

   void a(cvf $$0, agm $$1) {
      this.c.accept(mj.a($$0.k()), new mi($$1));
   }

   private void a(clj $$0, agm $$1) {
      this.c.accept(mj.a($$0), new mi($$1));
   }

   void a(clj $$0) {
      ml.bv.a(mj.a($$0), mm.b($$0), this.c);
   }

   private void d(cvf $$0) {
      clj $$1 = $$0.k();
      if ($$1 != clr.a) {
         ml.bv.a(mj.a($$1), mm.F($$0), this.c);
      }
   }

   private void a(cvf $$0, String $$1) {
      clj $$2 = $$0.k();
      ml.bv.a(mj.a($$2), mm.k(mm.a($$0, $$1)), this.c);
   }

   private static mc b() {
      return mc.a(did.R).a(ib.f, me.a().a(mf.b, mf.a.b)).a(ib.d, me.a().a(mf.b, mf.a.c)).a(ib.e, me.a().a(mf.b, mf.a.d)).a(ib.c, me.a());
   }

   private static mc c() {
      return mc.a(did.R).a(ib.d, me.a()).a(ib.e, me.a().a(mf.b, mf.a.b)).a(ib.c, me.a().a(mf.b, mf.a.c)).a(ib.f, me.a().a(mf.b, mf.a.d));
   }

   private static mc d() {
      return mc.a(did.R).a(ib.f, me.a()).a(ib.d, me.a().a(mf.b, mf.a.b)).a(ib.e, me.a().a(mf.b, mf.a.c)).a(ib.c, me.a().a(mf.b, mf.a.d));
   }

   private static mc e() {
      return mc.a(did.P)
         .a(ib.a, me.a().a(mf.a, mf.a.b))
         .a(ib.b, me.a().a(mf.a, mf.a.d))
         .a(ib.c, me.a())
         .a(ib.d, me.a().a(mf.b, mf.a.c))
         .a(ib.e, me.a().a(mf.b, mf.a.d))
         .a(ib.f, me.a().a(mf.b, mf.a.b));
   }

   private static mb b(cvf $$0, agm $$1) {
      return mb.a($$0, a($$1));
   }

   private static me[] a(agm $$0) {
      return new me[]{me.a().a(mf.c, $$0), me.a().a(mf.c, $$0).a(mf.b, mf.a.b), me.a().a(mf.c, $$0).a(mf.b, mf.a.c), me.a().a(mf.c, $$0).a(mf.b, mf.a.d)};
   }

   private static mb a(cvf $$0, agm $$1, agm $$2) {
      return mb.a($$0, me.a().a(mf.c, $$1), me.a().a(mf.c, $$2), me.a().a(mf.c, $$1).a(mf.b, mf.a.c), me.a().a(mf.c, $$2).a(mf.b, mf.a.c));
   }

   private static mc a(die $$0, agm $$1, agm $$2) {
      return mc.a($$0).a(true, me.a().a(mf.c, $$1)).a(false, me.a().a(mf.c, $$2));
   }

   private void e(cvf $$0) {
      agm $$1 = mo.a.create($$0, this.c);
      agm $$2 = mo.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cvf $$0) {
      agm $$1 = mo.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cvf $$0) {
      this.b.accept(mb.a($$0).a(mc.a(did.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         agm $$3 = mm.a($$0, $$2);
         return me.a().a(mf.c, ml.c.a($$0, $$2, new mm().a(mn.a, $$3), this.c));
      })));
      this.a($$0, mm.a($$0, "_0"));
   }

   static ly b(cvf $$0, agm $$1, agm $$2) {
      return mb.a($$0)
         .a(mc.a(did.w).a(false, me.a().a(mf.c, $$1)).a(true, me.a().a(mf.c, $$2)))
         .a(
            mc.a(did.U, did.R)
               .a(dhy.a, ib.f, me.a().a(mf.b, mf.a.b))
               .a(dhy.a, ib.e, me.a().a(mf.b, mf.a.d))
               .a(dhy.a, ib.d, me.a().a(mf.b, mf.a.c))
               .a(dhy.a, ib.c, me.a())
               .a(dhy.b, ib.f, me.a().a(mf.b, mf.a.b).a(mf.a, mf.a.b).a(mf.d, true))
               .a(dhy.b, ib.e, me.a().a(mf.b, mf.a.d).a(mf.a, mf.a.b).a(mf.d, true))
               .a(dhy.b, ib.d, me.a().a(mf.b, mf.a.c).a(mf.a, mf.a.b).a(mf.d, true))
               .a(dhy.b, ib.c, me.a().a(mf.a, mf.a.b).a(mf.d, true))
               .a(dhy.c, ib.f, me.a().a(mf.b, mf.a.d).a(mf.a, mf.a.c))
               .a(dhy.c, ib.e, me.a().a(mf.b, mf.a.b).a(mf.a, mf.a.c))
               .a(dhy.c, ib.d, me.a().a(mf.a, mf.a.c))
               .a(dhy.c, ib.c, me.a().a(mf.b, mf.a.c).a(mf.a, mf.a.c))
         );
   }

   private static mc.d<ib, dij, dii, Boolean> a(mc.d<ib, dij, dii, Boolean> $$0, dij $$1, agm $$2, agm $$3, agm $$4, agm $$5) {
      return $$0.a(ib.f, $$1, dii.a, false, me.a().a(mf.c, $$2))
         .a(ib.d, $$1, dii.a, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
         .a(ib.e, $$1, dii.a, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.c))
         .a(ib.c, $$1, dii.a, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.d))
         .a(ib.f, $$1, dii.b, false, me.a().a(mf.c, $$4))
         .a(ib.d, $$1, dii.b, false, me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
         .a(ib.e, $$1, dii.b, false, me.a().a(mf.c, $$4).a(mf.b, mf.a.c))
         .a(ib.c, $$1, dii.b, false, me.a().a(mf.c, $$4).a(mf.b, mf.a.d))
         .a(ib.f, $$1, dii.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
         .a(ib.d, $$1, dii.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
         .a(ib.e, $$1, dii.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
         .a(ib.c, $$1, dii.a, true, me.a().a(mf.c, $$3))
         .a(ib.f, $$1, dii.b, true, me.a().a(mf.c, $$5).a(mf.b, mf.a.d))
         .a(ib.d, $$1, dii.b, true, me.a().a(mf.c, $$5))
         .a(ib.e, $$1, dii.b, true, me.a().a(mf.c, $$5).a(mf.b, mf.a.b))
         .a(ib.c, $$1, dii.b, true, me.a().a(mf.c, $$5).a(mf.b, mf.a.c));
   }

   private static ly a(cvf $$0, agm $$1, agm $$2, agm $$3, agm $$4, agm $$5, agm $$6, agm $$7, agm $$8) {
      return mb.a($$0).a(a(a(mc.a(did.R, did.ae, did.be, did.u), dij.b, $$1, $$2, $$3, $$4), dij.a, $$5, $$6, $$7, $$8));
   }

   static ly a(cvf $$0, agm $$1, agm $$2, agm $$3, agm $$4, agm $$5) {
      return ma.a($$0)
         .a(me.a().a(mf.c, $$1))
         .a(lz.a().a(did.L, true), me.a().a(mf.c, $$2).a(mf.d, false))
         .a(lz.a().a(did.M, true), me.a().a(mf.c, $$3).a(mf.d, false))
         .a(lz.a().a(did.N, true), me.a().a(mf.c, $$4).a(mf.d, false))
         .a(lz.a().a(did.O, true), me.a().a(mf.c, $$5).a(mf.d, false));
   }

   static ly c(cvf $$0, agm $$1, agm $$2) {
      return ma.a($$0)
         .a(me.a().a(mf.c, $$1))
         .a(lz.a().a(did.L, true), me.a().a(mf.c, $$2).a(mf.d, true))
         .a(lz.a().a(did.M, true), me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, true))
         .a(lz.a().a(did.N, true), me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, true))
         .a(lz.a().a(did.O, true), me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, true));
   }

   static ly a(cvf $$0, agm $$1, agm $$2, agm $$3) {
      return ma.a($$0)
         .a(lz.a().a(did.J, true), me.a().a(mf.c, $$1))
         .a(lz.a().a(did.X, diz.b), me.a().a(mf.c, $$2).a(mf.d, true))
         .a(lz.a().a(did.W, diz.b), me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, true))
         .a(lz.a().a(did.Y, diz.b), me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, true))
         .a(lz.a().a(did.Z, diz.b), me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, true))
         .a(lz.a().a(did.X, diz.c), me.a().a(mf.c, $$3).a(mf.d, true))
         .a(lz.a().a(did.W, diz.c), me.a().a(mf.c, $$3).a(mf.b, mf.a.b).a(mf.d, true))
         .a(lz.a().a(did.Y, diz.c), me.a().a(mf.c, $$3).a(mf.b, mf.a.c).a(mf.d, true))
         .a(lz.a().a(did.Z, diz.c), me.a().a(mf.c, $$3).a(mf.b, mf.a.d).a(mf.d, true));
   }

   static ly a(cvf $$0, agm $$1, agm $$2, agm $$3, agm $$4, boolean $$5) {
      return mb.a($$0, me.a().a(mf.d, $$5))
         .a(c())
         .a(
            mc.a(did.q, did.u)
               .a(false, false, me.a().a(mf.c, $$2))
               .a(true, false, me.a().a(mf.c, $$4))
               .a(false, true, me.a().a(mf.c, $$1))
               .a(true, true, me.a().a(mf.c, $$3))
         );
   }

   static ly b(cvf $$0, agm $$1, agm $$2, agm $$3) {
      return mb.a($$0)
         .a(
            mc.a(did.R, did.af, did.bi)
               .a(ib.f, dim.b, diw.a, me.a().a(mf.c, $$2))
               .a(ib.e, dim.b, diw.a, me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.d, dim.b, diw.a, me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.c, dim.b, diw.a, me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ib.f, dim.b, diw.e, me.a().a(mf.c, $$3))
               .a(ib.e, dim.b, diw.e, me.a().a(mf.c, $$3).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.d, dim.b, diw.e, me.a().a(mf.c, $$3).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.c, dim.b, diw.e, me.a().a(mf.c, $$3).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ib.f, dim.b, diw.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ib.e, dim.b, diw.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.d, dim.b, diw.d, me.a().a(mf.c, $$3))
               .a(ib.c, dim.b, diw.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.f, dim.b, diw.c, me.a().a(mf.c, $$1))
               .a(ib.e, dim.b, diw.c, me.a().a(mf.c, $$1).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.d, dim.b, diw.c, me.a().a(mf.c, $$1).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.c, dim.b, diw.c, me.a().a(mf.c, $$1).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ib.f, dim.b, diw.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ib.e, dim.b, diw.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.d, dim.b, diw.b, me.a().a(mf.c, $$1))
               .a(ib.c, dim.b, diw.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.f, dim.a, diw.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ib.e, dim.a, diw.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.d, dim.a, diw.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.c, dim.a, diw.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ib.f, dim.a, diw.e, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.e, dim.a, diw.e, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ib.d, dim.a, diw.e, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.c, dim.a, diw.e, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ib.f, dim.a, diw.d, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ib.e, dim.a, diw.d, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.d, dim.a, diw.d, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.c, dim.a, diw.d, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ib.f, dim.a, diw.c, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.e, dim.a, diw.c, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
               .a(ib.d, dim.a, diw.c, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.c, dim.a, diw.c, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ib.f, dim.a, diw.b, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.d, true))
               .a(ib.e, dim.a, diw.b, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.c).a(mf.d, true))
               .a(ib.d, dim.a, diw.b, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.b).a(mf.d, true))
               .a(ib.c, dim.a, diw.b, me.a().a(mf.c, $$1).a(mf.a, mf.a.c).a(mf.b, mf.a.d).a(mf.d, true))
         );
   }

   private static ly c(cvf $$0, agm $$1, agm $$2, agm $$3) {
      return mb.a($$0)
         .a(
            mc.a(did.R, did.af, did.u)
               .a(ib.c, dim.b, false, me.a().a(mf.c, $$2))
               .a(ib.d, dim.b, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.c))
               .a(ib.f, dim.b, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
               .a(ib.e, dim.b, false, me.a().a(mf.c, $$2).a(mf.b, mf.a.d))
               .a(ib.c, dim.a, false, me.a().a(mf.c, $$1))
               .a(ib.d, dim.a, false, me.a().a(mf.c, $$1).a(mf.b, mf.a.c))
               .a(ib.f, dim.a, false, me.a().a(mf.c, $$1).a(mf.b, mf.a.b))
               .a(ib.e, dim.a, false, me.a().a(mf.c, $$1).a(mf.b, mf.a.d))
               .a(ib.c, dim.b, true, me.a().a(mf.c, $$3))
               .a(ib.d, dim.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               .a(ib.f, dim.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(ib.e, dim.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
               .a(ib.c, dim.a, true, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.c))
               .a(ib.d, dim.a, true, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.a))
               .a(ib.f, dim.a, true, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.d))
               .a(ib.e, dim.a, true, me.a().a(mf.c, $$3).a(mf.a, mf.a.c).a(mf.b, mf.a.b))
         );
   }

   private static ly d(cvf $$0, agm $$1, agm $$2, agm $$3) {
      return mb.a($$0)
         .a(
            mc.a(did.R, did.af, did.u)
               .a(ib.c, dim.b, false, me.a().a(mf.c, $$2))
               .a(ib.d, dim.b, false, me.a().a(mf.c, $$2))
               .a(ib.f, dim.b, false, me.a().a(mf.c, $$2))
               .a(ib.e, dim.b, false, me.a().a(mf.c, $$2))
               .a(ib.c, dim.a, false, me.a().a(mf.c, $$1))
               .a(ib.d, dim.a, false, me.a().a(mf.c, $$1))
               .a(ib.f, dim.a, false, me.a().a(mf.c, $$1))
               .a(ib.e, dim.a, false, me.a().a(mf.c, $$1))
               .a(ib.c, dim.b, true, me.a().a(mf.c, $$3))
               .a(ib.d, dim.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               .a(ib.f, dim.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(ib.e, dim.b, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
               .a(ib.c, dim.a, true, me.a().a(mf.c, $$3))
               .a(ib.d, dim.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               .a(ib.f, dim.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(ib.e, dim.a, true, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
         );
   }

   static mb c(cvf $$0, agm $$1) {
      return mb.a($$0, me.a().a(mf.c, $$1));
   }

   private static mc f() {
      return mc.a(did.I).a(ib.a.b, me.a()).a(ib.a.c, me.a().a(mf.a, mf.a.b)).a(ib.a.a, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.b));
   }

   static ly a(cvf $$0, mm $$1, BiConsumer<agm, Supplier<JsonElement>> $$2) {
      agm $$3 = ml.f.a($$0, $$1, $$2);
      agm $$4 = ml.g.a($$0, $$1, $$2);
      agm $$5 = ml.h.a($$0, $$1, $$2);
      agm $$6 = ml.i.a($$0, $$1, $$2);
      return mb.a($$0, me.a().a(mf.c, $$6)).a(mc.a(did.I).a(ib.a.a, me.a().a(mf.c, $$3)).a(ib.a.b, me.a().a(mf.c, $$4)).a(ib.a.c, me.a().a(mf.c, $$5)));
   }

   static ly d(cvf $$0, agm $$1) {
      return mb.a($$0, me.a().a(mf.c, $$1)).a(f());
   }

   private void e(cvf $$0, agm $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cvf $$0, mo.a $$1) {
      agm $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cvf $$0, mo.a $$1) {
      agm $$2 = $$1.create($$0, this.c);
      this.b.accept(mb.a($$0, me.a().a(mf.c, $$2)).a(b()));
   }

   static ly d(cvf $$0, agm $$1, agm $$2) {
      return mb.a($$0)
         .a(
            mc.a(did.I)
               .a(ib.a.b, me.a().a(mf.c, $$1))
               .a(ib.a.c, me.a().a(mf.c, $$2).a(mf.a, mf.a.b))
               .a(ib.a.a, me.a().a(mf.c, $$2).a(mf.a, mf.a.b).a(mf.b, mf.a.b))
         );
   }

   private void a(cvf $$0, mo.a $$1, mo.a $$2) {
      agm $$3 = $$1.create($$0, this.c);
      agm $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private agm a(cvf $$0, String $$1, mk $$2, Function<agm, mm> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mm.a($$0, $$1)), this.c);
   }

   static ly e(cvf $$0, agm $$1, agm $$2) {
      return mb.a($$0).a(a(did.w, $$2, $$1));
   }

   static ly e(cvf $$0, agm $$1, agm $$2, agm $$3) {
      return mb.a($$0).a(mc.a(did.bh).a(div.b, me.a().a(mf.c, $$1)).a(div.a, me.a().a(mf.c, $$2)).a(div.c, me.a().a(mf.c, $$3)));
   }

   public void a(cvf $$0) {
      this.b($$0, mo.a);
   }

   public void b(cvf $$0, mo.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cvf $$0, mm $$1, mk $$2) {
      agm $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private lv.b h(cvf $$0) {
      mo $$1 = this.g.getOrDefault($$0, mo.a.get($$0));
      return new lv.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cvf $$0, cvf $$1, cvf $$2) {
      mm $$3 = mm.u($$0);
      agm $$4 = ml.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(cvf $$0) {
      mm $$1 = mm.t($$0);
      agm $$2 = ml.t.a($$0, $$1, this.c);
      agm $$3 = ml.u.a($$0, $$1, this.c);
      agm $$4 = ml.v.a($$0, $$1, this.c);
      agm $$5 = ml.w.a($$0, $$1, this.c);
      agm $$6 = ml.x.a($$0, $$1, this.c);
      agm $$7 = ml.y.a($$0, $$1, this.c);
      agm $$8 = ml.z.a($$0, $$1, this.c);
      agm $$9 = ml.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(cvf $$0, cvf $$1) {
      agm $$2 = ml.t.a($$0);
      agm $$3 = ml.u.a($$0);
      agm $$4 = ml.v.a($$0);
      agm $$5 = ml.w.a($$0);
      agm $$6 = ml.x.a($$0);
      agm $$7 = ml.y.a($$0);
      agm $$8 = ml.z.a($$0);
      agm $$9 = ml.A.a($$0);
      this.a($$1, mj.a($$0.k()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cvf $$0) {
      mm $$1 = mm.b($$0);
      agm $$2 = ml.ai.a($$0, $$1, this.c);
      agm $$3 = ml.aj.a($$0, $$1, this.c);
      agm $$4 = ml.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cvf $$0) {
      mm $$1 = mm.b($$0);
      agm $$2 = ml.af.a($$0, $$1, this.c);
      agm $$3 = ml.ag.a($$0, $$1, this.c);
      agm $$4 = ml.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(cvf $$0, cvf $$1) {
      agm $$2 = ml.af.a($$0);
      agm $$3 = ml.ag.a($$0);
      agm $$4 = ml.ah.a($$0);
      this.a($$1, mj.a($$0.k()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(cvh.sD);
      agm $$0 = mj.a(cvh.sD);
      agm $$1 = mj.a(cvh.sD, "_partial_tilt");
      agm $$2 = mj.a(cvh.sD, "_full_tilt");
      this.b
         .accept(
            mb.a(cvh.sD)
               .a(b())
               .a(mc.a(did.bl).a(diy.a, me.a().a(mf.c, $$0)).a(diy.b, me.a().a(mf.c, $$0)).a(diy.c, me.a().a(mf.c, $$1)).a(diy.d, me.a().a(mf.c, $$2)))
         );
   }

   private lv.f l(cvf $$0) {
      return new lv.f(mm.n($$0));
   }

   private void m(cvf $$0) {
      this.c($$0, $$0);
   }

   private void c(cvf $$0, cvf $$1) {
      this.b.accept(c($$0, mj.a($$1)));
   }

   private void a(cvf $$0, lv.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cvf $$0, lv.e $$1, mm $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cvf $$0, lv.e $$1) {
      mm $$2 = mm.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cvf $$0, lv.e $$1, mm $$2) {
      agm $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cvf $$0, lv.e $$1, diq<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         mc $$4 = mc.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mm $$5 = mm.c(mm.a($$0, $$4x));
            agm $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return me.a().a(mf.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(mb.a($$0).a($$4));
      }
   }

   private void a(cvf $$0, cvf $$1, lv.e $$2) {
      this.a($$0, $$2);
      mm $$3 = mm.d($$0);
      agm $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(cvf $$0, cvf $$1) {
      mo $$2 = mo.o.get($$0);
      agm $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      agm $$4 = ml.aA.a($$1, $$2.b(), this.c);
      this.b.accept(mb.a($$1, me.a().a(mf.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(cvf $$0, cvf $$1) {
      this.a($$0.k());
      mm $$2 = mm.h($$0);
      mm $$3 = mm.a($$0, $$1);
      agm $$4 = ml.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            mb.a($$1, me.a().a(mf.c, $$4))
               .a(mc.a(did.R).a(ib.e, me.a()).a(ib.d, me.a().a(mf.b, mf.a.d)).a(ib.c, me.a().a(mf.b, mf.a.b)).a(ib.f, me.a().a(mf.b, mf.a.c)))
         );
      this.b.accept(mb.a($$0).a(mc.a(did.av).a($$2x -> me.a().a(mf.c, ml.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cvf $$0 = cvh.kC;
      this.a($$0.k());
      agm $$1 = mj.a($$0, "_top");
      agm $$2 = mj.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cvf $$0 = cvh.kB;
      this.a($$0.k());
      mc $$1 = mc.a(dat.d, did.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> me.a().a(mf.c, mj.a($$0, "_top_stage_" + $$1x));
            case b -> me.a().a(mf.c, mj.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mb.a($$0).a($$1));
   }

   private void a(cvf $$0, cvf $$1, cvf $$2, cvf $$3, cvf $$4, cvf $$5, cvf $$6, cvf $$7) {
      this.a($$0, lv.e.b);
      this.a($$1, lv.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(cvf $$0, lv.e $$1) {
      this.a($$0, "_top");
      agm $$2 = this.a($$0, "_top", $$1.a(), mm::c);
      agm $$3 = this.a($$0, "_bottom", $$1.a(), mm::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cvh.iD, "_front");
      agm $$0 = mj.a(cvh.iD, "_top");
      agm $$1 = this.a(cvh.iD, "_bottom", lv.e.b.a(), mm::c);
      this.f(cvh.iD, $$0, $$1);
   }

   private void k() {
      agm $$0 = this.a(cvh.bx, "_top", ml.bi, mm::a);
      agm $$1 = this.a(cvh.bx, "_bottom", ml.bi, mm::a);
      this.f(cvh.bx, $$0, $$1);
   }

   private void l() {
      this.c(cvh.sF);
      agm $$0 = mj.a(cvh.sF, "_top");
      agm $$1 = mj.a(cvh.sF, "_bottom");
      this.b.accept(mb.a(cvh.sF).a(b()).a(mc.a(did.ae).a(dij.b, me.a().a(mf.c, $$1)).a(dij.a, me.a().a(mf.c, $$0))));
   }

   private void f(cvf $$0, agm $$1, agm $$2) {
      this.b.accept(mb.a($$0).a(mc.a(did.ae).a(dij.b, me.a().a(mf.c, $$2)).a(dij.a, me.a().a(mf.c, $$1))));
   }

   private void n(cvf $$0) {
      mm $$1 = mm.e($$0);
      mm $$2 = mm.e(mm.a($$0, "_corner"));
      agm $$3 = ml.aq.a($$0, $$1, this.c);
      agm $$4 = ml.ar.a($$0, $$2, this.c);
      agm $$5 = ml.as.a($$0, $$1, this.c);
      agm $$6 = ml.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            mb.a($$0)
               .a(
                  mc.a(did.ag)
                     .a(dir.a, me.a().a(mf.c, $$3))
                     .a(dir.b, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
                     .a(dir.c, me.a().a(mf.c, $$5).a(mf.b, mf.a.b))
                     .a(dir.d, me.a().a(mf.c, $$6).a(mf.b, mf.a.b))
                     .a(dir.e, me.a().a(mf.c, $$5))
                     .a(dir.f, me.a().a(mf.c, $$6))
                     .a(dir.g, me.a().a(mf.c, $$4))
                     .a(dir.h, me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
                     .a(dir.i, me.a().a(mf.c, $$4).a(mf.b, mf.a.c))
                     .a(dir.j, me.a().a(mf.c, $$4).a(mf.b, mf.a.d))
               )
         );
   }

   private void o(cvf $$0) {
      agm $$1 = this.a($$0, "", ml.aq, mm::e);
      agm $$2 = this.a($$0, "", ml.as, mm::e);
      agm $$3 = this.a($$0, "", ml.at, mm::e);
      agm $$4 = this.a($$0, "_on", ml.aq, mm::e);
      agm $$5 = this.a($$0, "_on", ml.as, mm::e);
      agm $$6 = this.a($$0, "_on", ml.at, mm::e);
      mc $$7 = mc.a(did.w, did.ah).a(($$6x, $$7x) -> {
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

   private lv.a a(agm $$0, cvf $$1) {
      return new lv.a($$0, $$1);
   }

   private lv.a f(cvf $$0, cvf $$1) {
      return new lv.a(mj.a($$0), $$1);
   }

   private void a(cvf $$0, clj $$1) {
      agm $$2 = ml.Y.a($$0, mm.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cvf $$0, agm $$1) {
      agm $$2 = ml.Y.a($$0, mm.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(cvf $$0, cvf $$1) {
      this.a($$0);
      agm $$2 = mo.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cvf $$0) {
      this.a($$0.k());
      agm $$1 = mo.j.create($$0, this.c);
      agm $$2 = mo.k.create($$0, this.c);
      agm $$3 = mo.l.create($$0, this.c);
      agm $$4 = mo.m.create($$0, this.c);
      this.b
         .accept(
            ma.a($$0)
               .a(lz.a().a(did.S, 1, 2, 3, 4).a(did.R, ib.c), me.a().a(mf.c, $$1))
               .a(lz.a().a(did.S, 1, 2, 3, 4).a(did.R, ib.f), me.a().a(mf.c, $$1).a(mf.b, mf.a.b))
               .a(lz.a().a(did.S, 1, 2, 3, 4).a(did.R, ib.d), me.a().a(mf.c, $$1).a(mf.b, mf.a.c))
               .a(lz.a().a(did.S, 1, 2, 3, 4).a(did.R, ib.e), me.a().a(mf.c, $$1).a(mf.b, mf.a.d))
               .a(lz.a().a(did.S, 2, 3, 4).a(did.R, ib.c), me.a().a(mf.c, $$2))
               .a(lz.a().a(did.S, 2, 3, 4).a(did.R, ib.f), me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
               .a(lz.a().a(did.S, 2, 3, 4).a(did.R, ib.d), me.a().a(mf.c, $$2).a(mf.b, mf.a.c))
               .a(lz.a().a(did.S, 2, 3, 4).a(did.R, ib.e), me.a().a(mf.c, $$2).a(mf.b, mf.a.d))
               .a(lz.a().a(did.S, 3, 4).a(did.R, ib.c), me.a().a(mf.c, $$3))
               .a(lz.a().a(did.S, 3, 4).a(did.R, ib.f), me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(lz.a().a(did.S, 3, 4).a(did.R, ib.d), me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               .a(lz.a().a(did.S, 3, 4).a(did.R, ib.e), me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
               .a(lz.a().a(did.S, 4).a(did.R, ib.c), me.a().a(mf.c, $$4))
               .a(lz.a().a(did.S, 4).a(did.R, ib.f), me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
               .a(lz.a().a(did.S, 4).a(did.R, ib.d), me.a().a(mf.c, $$4).a(mf.b, mf.a.c))
               .a(lz.a().a(did.S, 4).a(did.R, ib.e), me.a().a(mf.c, $$4).a(mf.b, mf.a.d))
         );
   }

   private void a(mo.a $$0, cvf... $$1) {
      for (cvf $$2 : $$1) {
         agm $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(mo.a $$0, cvf... $$1) {
      for (cvf $$2 : $$1) {
         agm $$3 = $$0.create($$2, this.c);
         this.b.accept(mb.a($$2, me.a().a(mf.c, $$3)).a(c()));
      }
   }

   private void h(cvf $$0, cvf $$1) {
      this.a($$0);
      mm $$2 = mm.b($$0, $$1);
      agm $$3 = ml.aG.a($$1, $$2, this.c);
      agm $$4 = ml.aH.a($$1, $$2, this.c);
      agm $$5 = ml.aI.a($$1, $$2, this.c);
      agm $$6 = ml.aE.a($$1, $$2, this.c);
      agm $$7 = ml.aF.a($$1, $$2, this.c);
      clj $$8 = $$1.k();
      ml.bv.a(mj.a($$8), mm.F($$0), this.c);
      this.b
         .accept(
            ma.a($$1)
               .a(me.a().a(mf.c, $$3))
               .a(lz.a().a(did.L, true), me.a().a(mf.c, $$4))
               .a(lz.a().a(did.M, true), me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
               .a(lz.a().a(did.N, true), me.a().a(mf.c, $$5))
               .a(lz.a().a(did.O, true), me.a().a(mf.c, $$5).a(mf.b, mf.a.b))
               .a(lz.a().a(did.L, false), me.a().a(mf.c, $$6))
               .a(lz.a().a(did.M, false), me.a().a(mf.c, $$7))
               .a(lz.a().a(did.N, false), me.a().a(mf.c, $$7).a(mf.b, mf.a.b))
               .a(lz.a().a(did.O, false), me.a().a(mf.c, $$6).a(mf.b, mf.a.d))
         );
   }

   private void q(cvf $$0) {
      mm $$1 = mm.z($$0);
      agm $$2 = ml.aJ.a($$0, $$1, this.c);
      agm $$3 = this.a($$0, "_conditional", ml.aJ, $$1x -> $$1.c(mn.i, $$1x));
      this.b.accept(mb.a($$0).a(a(did.c, $$3, $$2)).a(e()));
   }

   private void r(cvf $$0) {
      agm $$1 = mo.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<me> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> me.a().a(mf.c, mj.a(cvh.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cvh.mZ);
      this.b
         .accept(
            ma.a(cvh.mZ)
               .a(lz.a().a(did.aq, 0), this.a(0))
               .a(lz.a().a(did.aq, 1), this.a(1))
               .a(lz.a().a(did.bk, dhz.b), me.a().a(mf.c, mj.a(cvh.mZ, "_small_leaves")))
               .a(lz.a().a(did.bk, dhz.c), me.a().a(mf.c, mj.a(cvh.mZ, "_large_leaves")))
         );
   }

   private mc n() {
      return mc.a(did.P)
         .a(ib.a, me.a().a(mf.a, mf.a.c))
         .a(ib.b, me.a())
         .a(ib.c, me.a().a(mf.a, mf.a.b))
         .a(ib.d, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.c))
         .a(ib.e, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.d))
         .a(ib.f, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.b));
   }

   private void o() {
      agm $$0 = mm.a(cvh.nU, "_top_open");
      this.b
         .accept(
            mb.a(cvh.nU)
               .a(this.n())
               .a(
                  mc.a(did.u)
                     .a(false, me.a().a(mf.c, mo.e.create(cvh.nU, this.c)))
                     .a(true, me.a().a(mf.c, mo.e.get(cvh.nU).a($$1 -> $$1.a(mn.f, $$0)).a(cvh.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mc a(diq<T> $$0, T $$1, agm $$2, agm $$3) {
      me $$4 = me.a().a(mf.c, $$2);
      me $$5 = me.a().a(mf.c, $$3);
      return mc.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cvf $$0, Function<cvf, mm> $$1) {
      mm $$2 = $$1.apply($$0).b(mn.i, mn.c);
      mm $$3 = $$2.c(mn.g, mm.a($$0, "_front_honey"));
      agm $$4 = ml.o.a($$0, $$2, this.c);
      agm $$5 = ml.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(mb.a($$0).a(b()).a(a(did.aN, 5, $$5, $$4)));
   }

   private void a(cvf $$0, diq<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<agm> $$3 = new Int2ObjectOpenHashMap();
         mc $$4 = mc.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            agm $$5 = (agm)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, ml.aT, mm::g));
            return me.a().a(mf.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(mb.a($$0).a($$4));
      }
   }

   private void p() {
      agm $$0 = mj.a(cvh.od, "_floor");
      agm $$1 = mj.a(cvh.od, "_ceiling");
      agm $$2 = mj.a(cvh.od, "_wall");
      agm $$3 = mj.a(cvh.od, "_between_walls");
      this.a(clr.we);
      this.b
         .accept(
            mb.a(cvh.od)
               .a(
                  mc.a(did.R, did.V)
                     .a(ib.c, dib.a, me.a().a(mf.c, $$0))
                     .a(ib.d, dib.a, me.a().a(mf.c, $$0).a(mf.b, mf.a.c))
                     .a(ib.f, dib.a, me.a().a(mf.c, $$0).a(mf.b, mf.a.b))
                     .a(ib.e, dib.a, me.a().a(mf.c, $$0).a(mf.b, mf.a.d))
                     .a(ib.c, dib.b, me.a().a(mf.c, $$1))
                     .a(ib.d, dib.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.c))
                     .a(ib.f, dib.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.b))
                     .a(ib.e, dib.b, me.a().a(mf.c, $$1).a(mf.b, mf.a.d))
                     .a(ib.c, dib.c, me.a().a(mf.c, $$2).a(mf.b, mf.a.d))
                     .a(ib.d, dib.c, me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
                     .a(ib.f, dib.c, me.a().a(mf.c, $$2))
                     .a(ib.e, dib.c, me.a().a(mf.c, $$2).a(mf.b, mf.a.c))
                     .a(ib.d, dib.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
                     .a(ib.c, dib.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
                     .a(ib.f, dib.d, me.a().a(mf.c, $$3))
                     .a(ib.e, dib.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mb.a(cvh.nZ, me.a().a(mf.c, mj.a(cvh.nZ)))
               .a(
                  mc.a(did.U, did.R)
                     .a(dhy.a, ib.c, me.a())
                     .a(dhy.a, ib.f, me.a().a(mf.b, mf.a.b))
                     .a(dhy.a, ib.d, me.a().a(mf.b, mf.a.c))
                     .a(dhy.a, ib.e, me.a().a(mf.b, mf.a.d))
                     .a(dhy.b, ib.c, me.a().a(mf.a, mf.a.b))
                     .a(dhy.b, ib.f, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.b))
                     .a(dhy.b, ib.d, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.c))
                     .a(dhy.b, ib.e, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.d))
                     .a(dhy.c, ib.d, me.a().a(mf.a, mf.a.c))
                     .a(dhy.c, ib.e, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.b))
                     .a(dhy.c, ib.c, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.c))
                     .a(dhy.c, ib.f, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.d))
               )
         );
   }

   private void d(cvf $$0, mo.a $$1) {
      agm $$2 = $$1.create($$0, this.c);
      agm $$3 = mm.a($$0, "_front_on");
      agm $$4 = $$1.get($$0).a($$1x -> $$1x.a(mn.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mb.a($$0).a(a(did.r, $$4, $$2)).a(b()));
   }

   private void a(cvf... $$0) {
      agm $$1 = mj.a("campfire_off");

      for (cvf $$2 : $$0) {
         agm $$3 = ml.ba.a($$2, mm.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(mb.a($$2).a(a(did.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cvf $$0) {
      agm $$1 = ml.br.a($$0, mm.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cvf $$0) {
      agm $$1;
      if ($$0 == cvh.tj) {
         $$1 = ml.bt.a($$0, mm.m($$0), this.c);
      } else {
         $$1 = ml.bs.a($$0, mm.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mm $$0 = mm.a(mm.G(cvh.cl), mm.G(cvh.n));
      agm $$1 = ml.i.a(cvh.cl, $$0, this.c);
      this.b.accept(c(cvh.cl, $$1));
   }

   private void s() {
      this.a(clr.lG);
      this.b
         .accept(
            ma.a(cvh.cw)
               .a(
                  lz.b(
                     lz.a().a(did.ab, dis.c).a(did.aa, dis.c).a(did.ac, dis.c).a(did.ad, dis.c),
                     lz.a().a(did.ab, dis.b, dis.a).a(did.aa, dis.b, dis.a),
                     lz.a().a(did.aa, dis.b, dis.a).a(did.ac, dis.b, dis.a),
                     lz.a().a(did.ac, dis.b, dis.a).a(did.ad, dis.b, dis.a),
                     lz.a().a(did.ad, dis.b, dis.a).a(did.ab, dis.b, dis.a)
                  ),
                  me.a().a(mf.c, mj.a("redstone_dust_dot"))
               )
               .a(lz.a().a(did.ab, dis.b, dis.a), me.a().a(mf.c, mj.a("redstone_dust_side0")))
               .a(lz.a().a(did.ac, dis.b, dis.a), me.a().a(mf.c, mj.a("redstone_dust_side_alt0")))
               .a(lz.a().a(did.aa, dis.b, dis.a), me.a().a(mf.c, mj.a("redstone_dust_side_alt1")).a(mf.b, mf.a.d))
               .a(lz.a().a(did.ad, dis.b, dis.a), me.a().a(mf.c, mj.a("redstone_dust_side1")).a(mf.b, mf.a.d))
               .a(lz.a().a(did.ab, dis.a), me.a().a(mf.c, mj.a("redstone_dust_up")))
               .a(lz.a().a(did.aa, dis.a), me.a().a(mf.c, mj.a("redstone_dust_up")).a(mf.b, mf.a.b))
               .a(lz.a().a(did.ac, dis.a), me.a().a(mf.c, mj.a("redstone_dust_up")).a(mf.b, mf.a.c))
               .a(lz.a().a(did.ad, dis.a), me.a().a(mf.c, mj.a("redstone_dust_up")).a(mf.b, mf.a.d))
         );
   }

   private void t() {
      this.a(clr.lK);
      this.b
         .accept(
            mb.a(cvh.gY)
               .a(c())
               .a(
                  mc.a(did.bd, did.w)
                     .a(dig.a, false, me.a().a(mf.c, mj.a(cvh.gY)))
                     .a(dig.a, true, me.a().a(mf.c, mj.a(cvh.gY, "_on")))
                     .a(dig.b, false, me.a().a(mf.c, mj.a(cvh.gY, "_subtract")))
                     .a(dig.b, true, me.a().a(mf.c, mj.a(cvh.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mm $$0 = mm.a(cvh.jR);
      mm $$1 = mm.a(mm.a(cvh.jE, "_side"), $$0.a(mn.f));
      agm $$2 = ml.Z.a(cvh.jE, $$1, this.c);
      agm $$3 = ml.aa.a(cvh.jE, $$1, this.c);
      agm $$4 = ml.i.b(cvh.jE, "_double", $$1, this.c);
      this.b.accept(e(cvh.jE, $$2, $$3, $$4));
      this.b.accept(c(cvh.jR, ml.c.a(cvh.jR, $$0, this.c)));
   }

   private void v() {
      this.a(clr.sn);
      this.b
         .accept(
            ma.a(cvh.fs)
               .a(me.a().a(mf.c, mm.G(cvh.fs)))
               .a(lz.a().a(did.k, true), me.a().a(mf.c, mm.a(cvh.fs, "_bottle0")))
               .a(lz.a().a(did.l, true), me.a().a(mf.c, mm.a(cvh.fs, "_bottle1")))
               .a(lz.a().a(did.m, true), me.a().a(mf.c, mm.a(cvh.fs, "_bottle2")))
               .a(lz.a().a(did.k, false), me.a().a(mf.c, mm.a(cvh.fs, "_empty0")))
               .a(lz.a().a(did.l, false), me.a().a(mf.c, mm.a(cvh.fs, "_empty1")))
               .a(lz.a().a(did.m, false), me.a().a(mf.c, mm.a(cvh.fs, "_empty2")))
         );
   }

   private void u(cvf $$0) {
      agm $$1 = ml.bn.a($$0, mm.b($$0), this.c);
      agm $$2 = mj.a("mushroom_block_inside");
      this.b
         .accept(
            ma.a($$0)
               .a(lz.a().a(did.L, true), me.a().a(mf.c, $$1))
               .a(lz.a().a(did.M, true), me.a().a(mf.c, $$1).a(mf.b, mf.a.b).a(mf.d, true))
               .a(lz.a().a(did.N, true), me.a().a(mf.c, $$1).a(mf.b, mf.a.c).a(mf.d, true))
               .a(lz.a().a(did.O, true), me.a().a(mf.c, $$1).a(mf.b, mf.a.d).a(mf.d, true))
               .a(lz.a().a(did.J, true), me.a().a(mf.c, $$1).a(mf.a, mf.a.d).a(mf.d, true))
               .a(lz.a().a(did.K, true), me.a().a(mf.c, $$1).a(mf.a, mf.a.b).a(mf.d, true))
               .a(lz.a().a(did.L, false), me.a().a(mf.c, $$2))
               .a(lz.a().a(did.M, false), me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, false))
               .a(lz.a().a(did.N, false), me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, false))
               .a(lz.a().a(did.O, false), me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, false))
               .a(lz.a().a(did.J, false), me.a().a(mf.c, $$2).a(mf.a, mf.a.d).a(mf.d, false))
               .a(lz.a().a(did.K, false), me.a().a(mf.c, $$2).a(mf.a, mf.a.b).a(mf.d, false))
         );
      this.a($$0, mo.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(clr.ry);
      this.b
         .accept(
            mb.a(cvh.eg)
               .a(
                  mc.a(did.ay)
                     .a(0, me.a().a(mf.c, mj.a(cvh.eg)))
                     .a(1, me.a().a(mf.c, mj.a(cvh.eg, "_slice1")))
                     .a(2, me.a().a(mf.c, mj.a(cvh.eg, "_slice2")))
                     .a(3, me.a().a(mf.c, mj.a(cvh.eg, "_slice3")))
                     .a(4, me.a().a(mf.c, mj.a(cvh.eg, "_slice4")))
                     .a(5, me.a().a(mf.c, mj.a(cvh.eg, "_slice5")))
                     .a(6, me.a().a(mf.c, mj.a(cvh.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mm $$0 = new mm()
         .a(mn.c, mm.a(cvh.nX, "_side3"))
         .a(mn.o, mm.G(cvh.t))
         .a(mn.n, mm.a(cvh.nX, "_top"))
         .a(mn.j, mm.a(cvh.nX, "_side3"))
         .a(mn.l, mm.a(cvh.nX, "_side3"))
         .a(mn.k, mm.a(cvh.nX, "_side1"))
         .a(mn.m, mm.a(cvh.nX, "_side2"));
      this.b.accept(c(cvh.nX, ml.a.a(cvh.nX, $$0, this.c)));
   }

   private void y() {
      mm $$0 = new mm()
         .a(mn.c, mm.a(cvh.ob, "_front"))
         .a(mn.o, mm.a(cvh.ob, "_bottom"))
         .a(mn.n, mm.a(cvh.ob, "_top"))
         .a(mn.j, mm.a(cvh.ob, "_front"))
         .a(mn.k, mm.a(cvh.ob, "_front"))
         .a(mn.l, mm.a(cvh.ob, "_side"))
         .a(mn.m, mm.a(cvh.ob, "_side"));
      this.b.accept(c(cvh.ob, ml.a.a(cvh.ob, $$0, this.c)));
   }

   private void a(cvf $$0, cvf $$1, BiFunction<cvf, cvf, mm> $$2) {
      mm $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, ml.a.a($$0, $$3, this.c)));
   }

   public void b(cvf $$0) {
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
      mm $$0 = mm.k(cvh.eZ);
      this.b.accept(c(cvh.eZ, mj.a(cvh.eZ)));
      this.a(cvh.ee, $$0);
      this.a(cvh.ef, $$0);
   }

   private void a(cvf $$0, mm $$1) {
      agm $$2 = ml.n.a($$0, $$1.c(mn.g, mm.G($$0)), this.c);
      this.b.accept(mb.a($$0, me.a().a(mf.c, $$2)).a(b()));
   }

   private void A() {
      this.a(clr.so);
      this.m(cvh.ft);
      this.b.accept(c(cvh.fv, ml.bq.a(cvh.fv, mm.j(mm.a(cvh.H, "_still")), this.c)));
      this.b
         .accept(
            mb.a(cvh.fu)
               .a(
                  mc.a(czn.g)
                     .a(1, me.a().a(mf.c, ml.bo.a(cvh.fu, "_level1", mm.j(mm.a(cvh.G, "_still")), this.c)))
                     .a(2, me.a().a(mf.c, ml.bp.a(cvh.fu, "_level2", mm.j(mm.a(cvh.G, "_still")), this.c)))
                     .a(3, me.a().a(mf.c, ml.bq.a(cvh.fu, "_full", mm.j(mm.a(cvh.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mb.a(cvh.fw)
               .a(
                  mc.a(czn.g)
                     .a(1, me.a().a(mf.c, ml.bo.a(cvh.fw, "_level1", mm.j(mm.G(cvh.qP)), this.c)))
                     .a(2, me.a().a(mf.c, ml.bp.a(cvh.fw, "_level2", mm.j(mm.G(cvh.qP)), this.c)))
                     .a(3, me.a().a(mf.c, ml.bq.a(cvh.fw, "_full", mm.j(mm.G(cvh.qP)), this.c)))
               )
         );
   }

   private void B() {
      mm $$0 = mm.b(cvh.kv);
      agm $$1 = ml.aC.a(cvh.kv, $$0, this.c);
      agm $$2 = this.a(cvh.kv, "_dead", ml.aC, $$1x -> $$0.c(mn.b, $$1x));
      this.b.accept(mb.a(cvh.kv).a(a(did.au, 5, $$2, $$1)));
   }

   private void C() {
      agm $$0 = mj.a(cvh.tq);
      agm $$1 = mj.a(cvh.tq, "_triggered");
      agm $$2 = mj.a(cvh.tq, "_crafting");
      agm $$3 = mj.a(cvh.tq, "_crafting_triggered");
      this.b
         .accept(
            mb.a(cvh.tq)
               .a(mc.a(did.T).a($$0x -> this.a($$0x, me.a())))
               .a(
                  mc.a(did.A, cwy.b)
                     .a(false, false, me.a().a(mf.c, $$0))
                     .a(true, true, me.a().a(mf.c, $$3))
                     .a(true, false, me.a().a(mf.c, $$1))
                     .a(false, true, me.a().a(mf.c, $$2))
               )
         );
   }

   private void v(cvf $$0) {
      mm $$1 = new mm().a(mn.f, mm.a(cvh.cD, "_top")).a(mn.i, mm.a(cvh.cD, "_side")).a(mn.g, mm.a($$0, "_front"));
      mm $$2 = new mm().a(mn.i, mm.a(cvh.cD, "_top")).a(mn.g, mm.a($$0, "_front_vertical"));
      agm $$3 = ml.n.a($$0, $$1, this.c);
      agm $$4 = ml.p.a($$0, $$2, this.c);
      this.b
         .accept(
            mb.a($$0)
               .a(
                  mc.a(did.P)
                     .a(ib.a, me.a().a(mf.c, $$4).a(mf.a, mf.a.c))
                     .a(ib.b, me.a().a(mf.c, $$4))
                     .a(ib.c, me.a().a(mf.c, $$3))
                     .a(ib.f, me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
                     .a(ib.d, me.a().a(mf.c, $$3).a(mf.b, mf.a.c))
                     .a(ib.e, me.a().a(mf.c, $$3).a(mf.b, mf.a.d))
               )
         );
   }

   private void D() {
      agm $$0 = mj.a(cvh.fy);
      agm $$1 = mj.a(cvh.fy, "_filled");
      this.b.accept(mb.a(cvh.fy).a(mc.a(did.h).a(false, me.a().a(mf.c, $$0)).a(true, me.a().a(mf.c, $$1))).a(c()));
   }

   private void E() {
      agm $$0 = mj.a(cvh.ku, "_side");
      agm $$1 = mj.a(cvh.ku, "_noside");
      agm $$2 = mj.a(cvh.ku, "_noside1");
      agm $$3 = mj.a(cvh.ku, "_noside2");
      agm $$4 = mj.a(cvh.ku, "_noside3");
      this.b
         .accept(
            ma.a(cvh.ku)
               .a(lz.a().a(did.L, true), me.a().a(mf.c, $$0))
               .a(lz.a().a(did.M, true), me.a().a(mf.c, $$0).a(mf.b, mf.a.b).a(mf.d, true))
               .a(lz.a().a(did.N, true), me.a().a(mf.c, $$0).a(mf.b, mf.a.c).a(mf.d, true))
               .a(lz.a().a(did.O, true), me.a().a(mf.c, $$0).a(mf.b, mf.a.d).a(mf.d, true))
               .a(lz.a().a(did.J, true), me.a().a(mf.c, $$0).a(mf.a, mf.a.d).a(mf.d, true))
               .a(lz.a().a(did.K, true), me.a().a(mf.c, $$0).a(mf.a, mf.a.b).a(mf.d, true))
               .a(lz.a().a(did.L, false), me.a().a(mf.c, $$1).a(mf.e, 2), me.a().a(mf.c, $$2), me.a().a(mf.c, $$3), me.a().a(mf.c, $$4))
               .a(
                  lz.a().a(did.M, false),
                  me.a().a(mf.c, $$2).a(mf.b, mf.a.b).a(mf.d, true),
                  me.a().a(mf.c, $$3).a(mf.b, mf.a.b).a(mf.d, true),
                  me.a().a(mf.c, $$4).a(mf.b, mf.a.b).a(mf.d, true),
                  me.a().a(mf.c, $$1).a(mf.e, 2).a(mf.b, mf.a.b).a(mf.d, true)
               )
               .a(
                  lz.a().a(did.N, false),
                  me.a().a(mf.c, $$3).a(mf.b, mf.a.c).a(mf.d, true),
                  me.a().a(mf.c, $$4).a(mf.b, mf.a.c).a(mf.d, true),
                  me.a().a(mf.c, $$1).a(mf.e, 2).a(mf.b, mf.a.c).a(mf.d, true),
                  me.a().a(mf.c, $$2).a(mf.b, mf.a.c).a(mf.d, true)
               )
               .a(
                  lz.a().a(did.O, false),
                  me.a().a(mf.c, $$4).a(mf.b, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$1).a(mf.e, 2).a(mf.b, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$2).a(mf.b, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$3).a(mf.b, mf.a.d).a(mf.d, true)
               )
               .a(
                  lz.a().a(did.J, false),
                  me.a().a(mf.c, $$1).a(mf.e, 2).a(mf.a, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$4).a(mf.a, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$2).a(mf.a, mf.a.d).a(mf.d, true),
                  me.a().a(mf.c, $$3).a(mf.a, mf.a.d).a(mf.d, true)
               )
               .a(
                  lz.a().a(did.K, false),
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
            ma.a(cvh.pc)
               .a(me.a().a(mf.c, mm.G(cvh.pc)))
               .a(lz.a().a(did.aL, 1), me.a().a(mf.c, mm.a(cvh.pc, "_contents1")))
               .a(lz.a().a(did.aL, 2), me.a().a(mf.c, mm.a(cvh.pc, "_contents2")))
               .a(lz.a().a(did.aL, 3), me.a().a(mf.c, mm.a(cvh.pc, "_contents3")))
               .a(lz.a().a(did.aL, 4), me.a().a(mf.c, mm.a(cvh.pc, "_contents4")))
               .a(lz.a().a(did.aL, 5), me.a().a(mf.c, mm.a(cvh.pc, "_contents5")))
               .a(lz.a().a(did.aL, 6), me.a().a(mf.c, mm.a(cvh.pc, "_contents6")))
               .a(lz.a().a(did.aL, 7), me.a().a(mf.c, mm.a(cvh.pc, "_contents7")))
               .a(lz.a().a(did.aL, 8), me.a().a(mf.c, mm.a(cvh.pc, "_contents_ready")))
         );
   }

   private void w(cvf $$0) {
      agm $$1 = ml.c.a($$0, mm.a($$0), this.c);
      agm $$2 = this.a($$0, "_powered", ml.c, mm::b);
      agm $$3 = this.a($$0, "_lit", ml.c, mm::b);
      agm $$4 = this.a($$0, "_lit_powered", ml.c, mm::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private ly a(cvf $$0, agm $$1, agm $$2, agm $$3, agm $$4) {
      return mb.a($$0).a(mc.a(did.r, did.w).a(($$4x, $$5) -> $$4x ? me.a().a(mf.c, $$5 ? $$4 : $$2) : me.a().a(mf.c, $$5 ? $$3 : $$1)));
   }

   private void i(cvf $$0, cvf $$1) {
      agm $$2 = mj.a($$0);
      agm $$3 = mj.a($$0, "_powered");
      agm $$4 = mj.a($$0, "_lit");
      agm $$5 = mj.a($$0, "_lit_powered");
      this.a($$1, mj.a($$0.k()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(cvf $$0) {
      this.c($$0);
      this.b.accept(mb.a($$0, me.a().a(mf.c, ml.am.a($$0, mm.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(cvh.qy);
      this.x(cvh.qx);
      this.x(cvh.qw);
      this.x(cvh.qv);
   }

   private void H() {
      this.c(cvh.st);
      mc.b<ib, dik> $$0 = mc.a(did.bm, did.bn);

      for (dik $$1 : dik.values()) {
         $$0.a(ib.b, $$1, this.a(ib.b, $$1));
      }

      for (dik $$2 : dik.values()) {
         $$0.a(ib.a, $$2, this.a(ib.a, $$2));
      }

      this.b.accept(mb.a(cvh.st).a($$0));
   }

   private me a(ib $$0, dik $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mm $$3 = mm.c(mm.a(cvh.st, $$2));
      return me.a().a(mf.c, ml.al.a(cvh.st, $$2, $$3, this.c));
   }

   private void y(cvf $$0) {
      mm $$1 = new mm().a(mn.e, mm.G(cvh.dV)).a(mn.f, mm.G($$0)).a(mn.i, mm.a($$0, "_side"));
      this.b.accept(c($$0, ml.m.a($$0, $$1, this.c)));
   }

   private void I() {
      agm $$0 = mm.a(cvh.gZ, "_side");
      mm $$1 = new mm().a(mn.f, mm.a(cvh.gZ, "_top")).a(mn.i, $$0);
      mm $$2 = new mm().a(mn.f, mm.a(cvh.gZ, "_inverted_top")).a(mn.i, $$0);
      this.b
         .accept(
            mb.a(cvh.gZ)
               .a(mc.a(did.p).a(false, me.a().a(mf.c, ml.aD.a(cvh.gZ, $$1, this.c))).a(true, me.a().a(mf.c, ml.aD.a(mj.a(cvh.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(cvf $$0) {
      this.b.accept(mb.a($$0, me.a().a(mf.c, mj.a($$0))).a(this.n()));
   }

   private void J() {
      cvf $$0 = cvh.ss;
      agm $$1 = mj.a($$0, "_on");
      agm $$2 = mj.a($$0);
      this.b.accept(mb.a($$0, me.a().a(mf.c, mj.a($$0))).a(this.n()).a(a(did.w, $$1, $$2)));
   }

   private void K() {
      mm $$0 = new mm().a(mn.B, mm.G(cvh.j)).a(mn.f, mm.G(cvh.cC));
      mm $$1 = new mm().a(mn.B, mm.G(cvh.j)).a(mn.f, mm.a(cvh.cC, "_moist"));
      agm $$2 = ml.aU.a(cvh.cC, $$0, this.c);
      agm $$3 = ml.aU.a(mm.a(cvh.cC, "_moist"), $$1, this.c);
      this.b.accept(mb.a(cvh.cC).a(a(did.aQ, 7, $$3, $$2)));
   }

   private List<agm> A(cvf $$0) {
      agm $$1 = ml.aV.a(mj.a($$0, "_floor0"), mm.v($$0), this.c);
      agm $$2 = ml.aV.a(mj.a($$0, "_floor1"), mm.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<agm> B(cvf $$0) {
      agm $$1 = ml.aW.a(mj.a($$0, "_side0"), mm.v($$0), this.c);
      agm $$2 = ml.aW.a(mj.a($$0, "_side1"), mm.w($$0), this.c);
      agm $$3 = ml.aX.a(mj.a($$0, "_side_alt0"), mm.v($$0), this.c);
      agm $$4 = ml.aX.a(mj.a($$0, "_side_alt1"), mm.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<agm> C(cvf $$0) {
      agm $$1 = ml.aY.a(mj.a($$0, "_up0"), mm.v($$0), this.c);
      agm $$2 = ml.aY.a(mj.a($$0, "_up1"), mm.w($$0), this.c);
      agm $$3 = ml.aZ.a(mj.a($$0, "_up_alt0"), mm.v($$0), this.c);
      agm $$4 = ml.aZ.a(mj.a($$0, "_up_alt1"), mm.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<me> a(List<agm> $$0, UnaryOperator<me> $$1) {
      return $$0.stream().map($$0x -> me.a().a(mf.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      lz $$0 = lz.a().a(did.L, false).a(did.M, false).a(did.N, false).a(did.O, false).a(did.J, false);
      List<agm> $$1 = this.A(cvh.cr);
      List<agm> $$2 = this.B(cvh.cr);
      List<agm> $$3 = this.C(cvh.cr);
      this.b
         .accept(
            ma.a(cvh.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(lz.b(lz.a().a(did.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(lz.b(lz.a().a(did.M, true), $$0), a($$2, $$0x -> $$0x.a(mf.b, mf.a.b)))
               .a(lz.b(lz.a().a(did.N, true), $$0), a($$2, $$0x -> $$0x.a(mf.b, mf.a.c)))
               .a(lz.b(lz.a().a(did.O, true), $$0), a($$2, $$0x -> $$0x.a(mf.b, mf.a.d)))
               .a(lz.a().a(did.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<agm> $$0 = this.A(cvh.cs);
      List<agm> $$1 = this.B(cvh.cs);
      this.b
         .accept(
            ma.a(cvh.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mf.b, mf.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mf.b, mf.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mf.b, mf.a.d)))
         );
   }

   private void D(cvf $$0) {
      agm $$1 = mo.s.create($$0, this.c);
      agm $$2 = mo.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(mb.a($$0).a(a(did.j, $$2, $$1)));
   }

   private void N() {
      mm $$0 = mm.a(mm.a(cvh.ad, "_side"), mm.a(cvh.ad, "_top"));
      agm $$1 = ml.i.a(cvh.ad, $$0, this.c);
      this.b.accept(d(cvh.ad, $$1));
   }

   private void O() {
      this.a(clr.ad);
      cvf $$0 = cvh.E;
      mc.b<Boolean, Integer> $$1 = mc.a(czz.d, czz.b);
      agm $$2 = mj.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         agm $$4 = mj.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, me.a().a(mf.c, $$4));
         $$1.a(false, $$3, me.a().a(mf.c, $$2));
      }

      this.b.accept(mb.a(cvh.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mb.a(cvh.kI)
               .a(
                  mc.a(did.as)
                     .a(0, me.a().a(mf.c, this.a(cvh.kI, "_0", ml.c, mm::b)))
                     .a(1, me.a().a(mf.c, this.a(cvh.kI, "_1", ml.c, mm::b)))
                     .a(2, me.a().a(mf.c, this.a(cvh.kI, "_2", ml.c, mm::b)))
                     .a(3, me.a().a(mf.c, this.a(cvh.kI, "_3", ml.c, mm::b)))
               )
         );
   }

   private void Q() {
      agm $$0 = mm.G(cvh.j);
      mm $$1 = new mm().a(mn.e, $$0).b(mn.e, mn.c).a(mn.f, mm.a(cvh.i, "_top")).a(mn.i, mm.a(cvh.i, "_snow"));
      me $$2 = me.a().a(mf.c, ml.m.a(cvh.i, "_snow", $$1, this.c));
      this.a(cvh.i, mj.a(cvh.i), $$2);
      agm $$3 = mo.e.get(cvh.fl).a($$1x -> $$1x.a(mn.e, $$0)).a(cvh.fl, this.c);
      this.a(cvh.fl, $$3, $$2);
      agm $$4 = mo.e.get(cvh.l).a($$1x -> $$1x.a(mn.e, $$0)).a(cvh.l, this.c);
      this.a(cvh.l, $$4, $$2);
   }

   private void a(cvf $$0, agm $$1, me $$2) {
      List<me> $$3 = Arrays.asList(a($$1));
      this.b.accept(mb.a($$0).a(mc.a(did.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(clr.re);
      this.b
         .accept(
            mb.a(cvh.fC)
               .a(
                  mc.a(did.ar)
                     .a(0, me.a().a(mf.c, mj.a(cvh.fC, "_stage0")))
                     .a(1, me.a().a(mf.c, mj.a(cvh.fC, "_stage1")))
                     .a(2, me.a().a(mf.c, mj.a(cvh.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cvh.kE, mj.a(cvh.kE)));
   }

   private void j(cvf $$0, cvf $$1) {
      mm $$2 = mm.b($$1);
      agm $$3 = ml.W.a($$0, $$2, this.c);
      agm $$4 = ml.X.a($$0, $$2, this.c);
      this.b.accept(mb.a($$0).a(a(did.aT, 1, $$4, $$3)));
   }

   private void T() {
      agm $$0 = mj.a(cvh.hc);
      agm $$1 = mj.a(cvh.hc, "_side");
      this.a(clr.lQ);
      this.b
         .accept(
            mb.a(cvh.hc)
               .a(
                  mc.a(did.Q)
                     .a(ib.a, me.a().a(mf.c, $$0))
                     .a(ib.c, me.a().a(mf.c, $$1))
                     .a(ib.f, me.a().a(mf.c, $$1).a(mf.b, mf.a.b))
                     .a(ib.d, me.a().a(mf.c, $$1).a(mf.b, mf.a.c))
                     .a(ib.e, me.a().a(mf.c, $$1).a(mf.b, mf.a.d))
               )
         );
   }

   private void k(cvf $$0, cvf $$1) {
      agm $$2 = mj.a($$0);
      this.b.accept(mb.a($$1, me.a().a(mf.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      agm $$0 = mj.a(cvh.eW, "_post_ends");
      agm $$1 = mj.a(cvh.eW, "_post");
      agm $$2 = mj.a(cvh.eW, "_cap");
      agm $$3 = mj.a(cvh.eW, "_cap_alt");
      agm $$4 = mj.a(cvh.eW, "_side");
      agm $$5 = mj.a(cvh.eW, "_side_alt");
      this.b
         .accept(
            ma.a(cvh.eW)
               .a(me.a().a(mf.c, $$0))
               .a(lz.a().a(did.L, false).a(did.M, false).a(did.N, false).a(did.O, false), me.a().a(mf.c, $$1))
               .a(lz.a().a(did.L, true).a(did.M, false).a(did.N, false).a(did.O, false), me.a().a(mf.c, $$2))
               .a(lz.a().a(did.L, false).a(did.M, true).a(did.N, false).a(did.O, false), me.a().a(mf.c, $$2).a(mf.b, mf.a.b))
               .a(lz.a().a(did.L, false).a(did.M, false).a(did.N, true).a(did.O, false), me.a().a(mf.c, $$3))
               .a(lz.a().a(did.L, false).a(did.M, false).a(did.N, false).a(did.O, true), me.a().a(mf.c, $$3).a(mf.b, mf.a.b))
               .a(lz.a().a(did.L, true), me.a().a(mf.c, $$4))
               .a(lz.a().a(did.M, true), me.a().a(mf.c, $$4).a(mf.b, mf.a.b))
               .a(lz.a().a(did.N, true), me.a().a(mf.c, $$5))
               .a(lz.a().a(did.O, true), me.a().a(mf.c, $$5).a(mf.b, mf.a.b))
         );
      this.d(cvh.eW);
   }

   private void E(cvf $$0) {
      this.b.accept(mb.a($$0, me.a().a(mf.c, mj.a($$0))).a(b()));
   }

   private void V() {
      agm $$0 = mj.a(cvh.dw);
      agm $$1 = mj.a(cvh.dw, "_on");
      this.d(cvh.dw);
      this.b
         .accept(
            mb.a(cvh.dw)
               .a(a(did.w, $$0, $$1))
               .a(
                  mc.a(did.U, did.R)
                     .a(dhy.c, ib.c, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.c))
                     .a(dhy.c, ib.f, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.d))
                     .a(dhy.c, ib.d, me.a().a(mf.a, mf.a.c))
                     .a(dhy.c, ib.e, me.a().a(mf.a, mf.a.c).a(mf.b, mf.a.b))
                     .a(dhy.a, ib.c, me.a())
                     .a(dhy.a, ib.f, me.a().a(mf.b, mf.a.b))
                     .a(dhy.a, ib.d, me.a().a(mf.b, mf.a.c))
                     .a(dhy.a, ib.e, me.a().a(mf.b, mf.a.d))
                     .a(dhy.b, ib.c, me.a().a(mf.a, mf.a.b))
                     .a(dhy.b, ib.f, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.b))
                     .a(dhy.b, ib.d, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.c))
                     .a(dhy.b, ib.e, me.a().a(mf.a, mf.a.b).a(mf.b, mf.a.d))
               )
         );
   }

   private void W() {
      this.d(cvh.fm);
      this.b.accept(b(cvh.fm, mj.a(cvh.fm)));
   }

   private void X() {
      this.d(cvh.tn);
      this.b.accept(c(cvh.tn, mj.a(cvh.tn)));
   }

   private void Y() {
      this.b.accept(mb.a(cvh.ed).a(mc.a(did.H).a(ib.a.a, me.a().a(mf.c, mj.a(cvh.ed, "_ns"))).a(ib.a.c, me.a().a(mf.c, mj.a(cvh.ed, "_ew")))));
   }

   private void Z() {
      agm $$0 = mo.a.create(cvh.dV, this.c);
      this.b
         .accept(
            mb.a(
               cvh.dV,
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
      agm $$0 = mj.a(cvh.kO);
      agm $$1 = mj.a(cvh.kO, "_on");
      this.b.accept(mb.a(cvh.kO).a(a(did.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mm $$0 = new mm().a(mn.e, mm.a(cvh.by, "_bottom")).a(mn.i, mm.a(cvh.by, "_side"));
      agm $$1 = mm.a(cvh.by, "_top_sticky");
      agm $$2 = mm.a(cvh.by, "_top");
      mm $$3 = $$0.c(mn.E, $$1);
      mm $$4 = $$0.c(mn.E, $$2);
      agm $$5 = mj.a(cvh.by, "_base");
      this.a(cvh.by, $$5, $$4);
      this.a(cvh.br, $$5, $$3);
      agm $$6 = ml.m.a(cvh.by, "_inventory", $$0.c(mn.f, $$2), this.c);
      agm $$7 = ml.m.a(cvh.br, "_inventory", $$0.c(mn.f, $$1), this.c);
      this.a(cvh.by, $$6);
      this.a(cvh.br, $$7);
   }

   private void a(cvf $$0, agm $$1, mm $$2) {
      agm $$3 = ml.bf.a($$0, $$2, this.c);
      this.b.accept(mb.a($$0).a(a(did.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mm $$0 = new mm().a(mn.F, mm.a(cvh.by, "_top")).a(mn.i, mm.a(cvh.by, "_side"));
      mm $$1 = $$0.c(mn.E, mm.a(cvh.by, "_top_sticky"));
      mm $$2 = $$0.c(mn.E, mm.a(cvh.by, "_top"));
      this.b
         .accept(
            mb.a(cvh.bz)
               .a(
                  mc.a(did.x, did.bg)
                     .a(false, dip.a, me.a().a(mf.c, ml.bg.a(cvh.by, "_head", $$2, this.c)))
                     .a(false, dip.b, me.a().a(mf.c, ml.bg.a(cvh.by, "_head_sticky", $$1, this.c)))
                     .a(true, dip.a, me.a().a(mf.c, ml.bh.a(cvh.by, "_head_short", $$2, this.c)))
                     .a(true, dip.b, me.a().a(mf.c, ml.bh.a(cvh.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      agm $$0 = mj.a(cvh.qQ, "_inactive");
      agm $$1 = mj.a(cvh.qQ, "_active");
      this.a(cvh.qQ, $$0);
      this.b.accept(mb.a(cvh.qQ).a(mc.a(did.bo).a($$2 -> me.a().a(mf.c, $$2 != diu.b && $$2 != diu.c ? $$0 : $$1))));
   }

   private void ae() {
      agm $$0 = mj.a(cvh.qR, "_inactive");
      agm $$1 = mj.a(cvh.qR, "_active");
      this.a(cvh.qR, $$0);
      this.b.accept(mb.a(cvh.qR).a(mc.a(did.bo).a($$2 -> me.a().a(mf.c, $$2 != diu.b && $$2 != diu.c ? $$0 : $$1))).a(b()));
   }

   private void af() {
      agm $$0 = ml.bK.a(cvh.qV, mm.a(false), this.c);
      agm $$1 = ml.bK.a(cvh.qV, "_can_summon", mm.a(true), this.c);
      this.a(cvh.qV, $$0);
      this.b.accept(mb.a(cvh.qV).a(a(did.G, $$1, $$0)));
   }

   private void ag() {
      agm $$0 = mj.a(cvh.nS, "_stable");
      agm $$1 = mj.a(cvh.nS, "_unstable");
      this.a(cvh.nS, $$0);
      this.b.accept(mb.a(cvh.nS).a(a(did.b, $$1, $$0)));
   }

   private void ah() {
      agm $$0 = this.a(cvh.sv, "", ml.am, mm::c);
      agm $$1 = this.a(cvh.sv, "_lit", ml.am, mm::c);
      this.b.accept(mb.a(cvh.sv).a(a(did.D, $$1, $$0)));
      agm $$2 = this.a(cvh.sw, "", ml.am, mm::c);
      agm $$3 = this.a(cvh.sw, "_lit", ml.am, mm::c);
      this.b.accept(mb.a(cvh.sw).a(a(did.D, $$3, $$2)));
   }

   private void ai() {
      agm $$0 = mo.a.create(cvh.fB, this.c);
      agm $$1 = this.a(cvh.fB, "_on", ml.c, mm::b);
      this.b.accept(mb.a(cvh.fB).a(a(did.r, $$1, $$0)));
   }

   private void l(cvf $$0, cvf $$1) {
      mm $$2 = mm.y($$0);
      this.b.accept(c($$0, ml.bd.a($$0, $$2, this.c)));
      this.b.accept(mb.a($$1, me.a().a(mf.c, ml.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void aj() {
      mm $$0 = mm.y(cvh.dK);
      mm $$1 = mm.i(mm.a(cvh.dK, "_off"));
      agm $$2 = ml.bd.a(cvh.dK, $$0, this.c);
      agm $$3 = ml.bd.a(cvh.dK, "_off", $$1, this.c);
      this.b.accept(mb.a(cvh.dK).a(a(did.r, $$2, $$3)));
      agm $$4 = ml.be.a(cvh.dL, $$0, this.c);
      agm $$5 = ml.be.a(cvh.dL, "_off", $$1, this.c);
      this.b.accept(mb.a(cvh.dL).a(a(did.r, $$4, $$5)).a(d()));
      this.d(cvh.dK);
      this.c(cvh.dL);
   }

   private void ak() {
      this.a(clr.lJ);
      this.b.accept(mb.a(cvh.eh).a(mc.a(did.aA, did.s, did.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return me.a().a(mf.c, mm.a(cvh.eh, $$3.toString()));
      })).a(c()));
   }

   private void al() {
      this.a(clr.cS);
      this.b
         .accept(
            mb.a(cvh.mV)
               .a(
                  mc.a(did.aS, did.C)
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

   private void am() {
      mm $$0 = mm.a(cvh.dN);
      agm $$1 = ml.c.a(cvh.dP, $$0, this.c);
      this.b.accept(mb.a(cvh.dN).a(mc.a(did.aF).a($$1x -> me.a().a(mf.c, $$1x < 8 ? mj.a(cvh.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cvh.dN, mj.a(cvh.dN, "_height2"));
      this.b.accept(c(cvh.dP, $$1));
   }

   private void an() {
      this.b.accept(mb.a(cvh.oc, me.a().a(mf.c, mj.a(cvh.oc))).a(b()));
   }

   private void ao() {
      agm $$0 = mo.a.create(cvh.pa, this.c);
      this.a(cvh.pa, $$0);
      this.b.accept(mb.a(cvh.pa).a(mc.a(did.bj).a($$0x -> me.a().a(mf.c, this.a(cvh.pa, "_" + $$0x.c(), ml.c, mm::b)))));
   }

   private void ap() {
      this.a(clr.wh);
      this.b.accept(mb.a(cvh.oi).a(mc.a(did.as).a($$0 -> me.a().a(mf.c, this.a(cvh.oi, "_stage" + $$0, ml.am, mm::c)))));
   }

   private void aq() {
      this.a(clr.pp);
      this.b
         .accept(
            mb.a(cvh.fI)
               .a(
                  mc.a(did.a, did.M, did.L, did.N, did.O)
                     .a(false, false, false, false, false, me.a().a(mf.c, mj.a(cvh.fI, "_ns")))
                     .a(false, true, false, false, false, me.a().a(mf.c, mj.a(cvh.fI, "_n")).a(mf.b, mf.a.b))
                     .a(false, false, true, false, false, me.a().a(mf.c, mj.a(cvh.fI, "_n")))
                     .a(false, false, false, true, false, me.a().a(mf.c, mj.a(cvh.fI, "_n")).a(mf.b, mf.a.c))
                     .a(false, false, false, false, true, me.a().a(mf.c, mj.a(cvh.fI, "_n")).a(mf.b, mf.a.d))
                     .a(false, true, true, false, false, me.a().a(mf.c, mj.a(cvh.fI, "_ne")))
                     .a(false, true, false, true, false, me.a().a(mf.c, mj.a(cvh.fI, "_ne")).a(mf.b, mf.a.b))
                     .a(false, false, false, true, true, me.a().a(mf.c, mj.a(cvh.fI, "_ne")).a(mf.b, mf.a.c))
                     .a(false, false, true, false, true, me.a().a(mf.c, mj.a(cvh.fI, "_ne")).a(mf.b, mf.a.d))
                     .a(false, false, true, true, false, me.a().a(mf.c, mj.a(cvh.fI, "_ns")))
                     .a(false, true, false, false, true, me.a().a(mf.c, mj.a(cvh.fI, "_ns")).a(mf.b, mf.a.b))
                     .a(false, true, true, true, false, me.a().a(mf.c, mj.a(cvh.fI, "_nse")))
                     .a(false, true, false, true, true, me.a().a(mf.c, mj.a(cvh.fI, "_nse")).a(mf.b, mf.a.b))
                     .a(false, false, true, true, true, me.a().a(mf.c, mj.a(cvh.fI, "_nse")).a(mf.b, mf.a.c))
                     .a(false, true, true, false, true, me.a().a(mf.c, mj.a(cvh.fI, "_nse")).a(mf.b, mf.a.d))
                     .a(false, true, true, true, true, me.a().a(mf.c, mj.a(cvh.fI, "_nsew")))
                     .a(true, false, false, false, false, me.a().a(mf.c, mj.a(cvh.fI, "_attached_ns")))
                     .a(true, false, true, false, false, me.a().a(mf.c, mj.a(cvh.fI, "_attached_n")))
                     .a(true, false, false, true, false, me.a().a(mf.c, mj.a(cvh.fI, "_attached_n")).a(mf.b, mf.a.c))
                     .a(true, true, false, false, false, me.a().a(mf.c, mj.a(cvh.fI, "_attached_n")).a(mf.b, mf.a.b))
                     .a(true, false, false, false, true, me.a().a(mf.c, mj.a(cvh.fI, "_attached_n")).a(mf.b, mf.a.d))
                     .a(true, true, true, false, false, me.a().a(mf.c, mj.a(cvh.fI, "_attached_ne")))
                     .a(true, true, false, true, false, me.a().a(mf.c, mj.a(cvh.fI, "_attached_ne")).a(mf.b, mf.a.b))
                     .a(true, false, false, true, true, me.a().a(mf.c, mj.a(cvh.fI, "_attached_ne")).a(mf.b, mf.a.c))
                     .a(true, false, true, false, true, me.a().a(mf.c, mj.a(cvh.fI, "_attached_ne")).a(mf.b, mf.a.d))
                     .a(true, false, true, true, false, me.a().a(mf.c, mj.a(cvh.fI, "_attached_ns")))
                     .a(true, true, false, false, true, me.a().a(mf.c, mj.a(cvh.fI, "_attached_ns")).a(mf.b, mf.a.b))
                     .a(true, true, true, true, false, me.a().a(mf.c, mj.a(cvh.fI, "_attached_nse")))
                     .a(true, true, false, true, true, me.a().a(mf.c, mj.a(cvh.fI, "_attached_nse")).a(mf.b, mf.a.b))
                     .a(true, false, true, true, true, me.a().a(mf.c, mj.a(cvh.fI, "_attached_nse")).a(mf.b, mf.a.c))
                     .a(true, true, true, false, true, me.a().a(mf.c, mj.a(cvh.fI, "_attached_nse")).a(mf.b, mf.a.d))
                     .a(true, true, true, true, true, me.a().a(mf.c, mj.a(cvh.fI, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.d(cvh.fH);
      this.b.accept(mb.a(cvh.fH).a(mc.a(did.a, did.w).a(($$0, $$1) -> me.a().a(mf.c, mm.a(cvh.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private agm a(int $$0, String $$1, mm $$2) {
      switch ($$0) {
         case 1:
            return ml.bj.a(mj.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return ml.bk.a(mj.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return ml.bl.a(mj.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return ml.bm.a(mj.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private agm a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mm.b(mm.G(cvh.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mm.b(mm.a(cvh.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mm.b(mm.a(cvh.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void as() {
      this.a(clr.ko);
      this.b.accept(mb.a(cvh.mf).a(mc.a(did.aD, did.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void at() {
      this.a(clr.kp);
      Function<Integer, agm> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mm $$2 = mm.a($$1);
         return ml.bu.a(cvh.mg, $$1, $$2, this.c);
      };
      this.b.accept(mb.a(cvh.mg).a(mc.a(dcm.c).a($$1 -> me.a().a(mf.c, $$0.apply($$1)))));
   }

   private void F(cvf $$0) {
      this.d($$0);
      agm $$1 = mj.a($$0);
      ma $$2 = ma.a($$0);
      lz.c $$3 = ac.a(lz.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<die, Function<agm, me>> $$4 : a) {
         die $$5 = (die)$$4.getFirst();
         Function<agm, me> $$6 = (Function<agm, me>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(lz.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void au() {
      agm $$0 = mm.a(cvh.qU, "_bottom");
      mm $$1 = new mm().a(mn.e, $$0).a(mn.f, mm.a(cvh.qU, "_top")).a(mn.i, mm.a(cvh.qU, "_side"));
      mm $$2 = new mm().a(mn.e, $$0).a(mn.f, mm.a(cvh.qU, "_top_bloom")).a(mn.i, mm.a(cvh.qU, "_side_bloom"));
      agm $$3 = ml.m.a(cvh.qU, "", $$1, this.c);
      agm $$4 = ml.m.a(cvh.qU, "_bloom", $$2, this.c);
      this.b.accept(mb.a(cvh.qU).a(mc.a(did.E).a($$2x -> me.a().a(mf.c, $$2x ? $$4 : $$3))));
      this.a(clr.gi, $$3);
   }

   private void av() {
      cvf $$0 = cvh.cm;
      agm $$1 = mj.a($$0);
      ma $$2 = ma.a($$0);
      Map.of(ib.c, mf.a.a, ib.f, mf.a.b, ib.d, mf.a.c, ib.e, mf.a.d).forEach(($$2x, $$3) -> {
         lz.c $$4 = lz.a().a(did.R, $$2x);
         $$2.a($$4, me.a().a(mf.c, $$1).a(mf.b, $$3).a(mf.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mj.a($$0, "_inventory"));
      i.clear();
   }

   private void a(ma $$0, lz.c $$1, mf.a $$2) {
      List.of(Pair.of(did.bp, ml.aK), Pair.of(did.bq, ml.aL), Pair.of(did.br, ml.aM), Pair.of(did.bs, ml.aN), Pair.of(did.bt, ml.aO), Pair.of(did.bu, ml.aP))
         .forEach($$3 -> {
            die $$4 = (die)$$3.getFirst();
            mk $$5 = (mk)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(ma $$0, lz.c $$1, mf.a $$2, die $$3, mk $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mm $$7 = new mm().a(mn.b, mm.a(cvh.cm, $$6));
      lv.d $$8 = new lv.d($$4, $$6);
      agm $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cvh.cm, $$6, $$7, this.c));
      $$0.a(lz.a($$1, lz.a().a($$3, $$5)), me.a().a(mf.c, $$9).a(mf.b, $$2));
   }

   private void aw() {
      this.b.accept(c(cvh.kJ, ml.c.a(cvh.kJ, mm.b(mj.a("magma")), this.c)));
   }

   private void G(cvf $$0) {
      this.b($$0, mo.p);
      ml.bB.a(mj.a($$0.k()), mm.u($$0), this.c);
   }

   private void b(cvf $$0, cvf $$1, lv.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(cvf $$0, cvf $$1) {
      ml.bC.a(mj.a($$0.k()), mm.u($$1), this.c);
   }

   private void ax() {
      agm $$0 = mj.a(cvh.b);
      agm $$1 = mj.a(cvh.b, "_mirrored");
      this.b.accept(a(cvh.eN, $$0, $$1));
      this.a(cvh.eN, $$0);
   }

   private void ay() {
      agm $$0 = mj.a(cvh.sJ);
      agm $$1 = mj.a(cvh.sJ, "_mirrored");
      this.b.accept(a(cvh.td, $$0, $$1).a(f()));
      this.a(cvh.td, $$0);
   }

   private void n(cvf $$0, cvf $$1) {
      this.a($$0, lv.e.b);
      mm $$2 = mm.d(mm.a($$0, "_pot"));
      agm $$3 = lv.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void az() {
      agm $$0 = mm.a(cvh.pl, "_bottom");
      agm $$1 = mm.a(cvh.pl, "_top_off");
      agm $$2 = mm.a(cvh.pl, "_top");
      agm[] $$3 = new agm[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mm $$5 = new mm().a(mn.e, $$0).a(mn.f, $$4 == 0 ? $$1 : $$2).a(mn.i, mm.a(cvh.pl, "_side" + $$4));
         $$3[$$4] = ml.m.a(cvh.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mb.a(cvh.pl).a(mc.a(did.aZ).a($$1x -> me.a().a(mf.c, $$3[$$1x]))));
      this.a(clr.wF, $$3[0]);
   }

   private me a(id $$0, me $$1) {
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

   private void aA() {
      agm $$0 = mm.a(cvh.pb, "_top");
      agm $$1 = mm.a(cvh.pb, "_bottom");
      agm $$2 = mm.a(cvh.pb, "_side");
      agm $$3 = mm.a(cvh.pb, "_lock");
      mm $$4 = new mm().a(mn.o, $$2).a(mn.m, $$2).a(mn.l, $$2).a(mn.c, $$0).a(mn.j, $$0).a(mn.k, $$1).a(mn.n, $$3);
      agm $$5 = ml.b.a(cvh.pb, $$4, this.c);
      this.b.accept(mb.a(cvh.pb, me.a().a(mf.c, $$5)).a(mc.a(did.T).a($$0x -> this.a($$0x, me.a()))));
   }

   private void aB() {
      cvf $$0 = cvh.n;
      agm $$1 = mj.a($$0);
      mo $$2 = mo.a.get($$0);
      cvf $$3 = cvh.jH;
      agm $$4 = ml.Z.a($$3, $$2.b(), this.c);
      agm $$5 = ml.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kf.a().filter(kg::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cvh.rf).a(kf.w).a(cvh.rf, cvh.rD).a(cvh.rj, cvh.rn).a(kf.y);
      this.h(cvh.re).a(kf.A).a(cvh.re, cvh.rC).a(cvh.ri, cvh.rm).a(kf.C);
      this.h(cvh.rd).a(kf.E).a(cvh.rd, cvh.rB).a(cvh.rh, cvh.rl).a(kf.G);
      this.h(cvh.rc).a(kf.I).a(cvh.rc, cvh.rA).a(cvh.rg, cvh.rk).a(kf.K);
      this.w(cvh.sk);
      this.w(cvh.sl);
      this.w(cvh.sm);
      this.w(cvh.sn);
      this.i(cvh.sk, cvh.so);
      this.i(cvh.sl, cvh.sp);
      this.i(cvh.sm, cvh.sq);
      this.i(cvh.sn, cvh.sr);
      this.m(cvh.a);
      this.c(cvh.nc, cvh.a);
      this.c(cvh.nb, cvh.a);
      this.m(cvh.fO);
      this.m(cvh.dQ);
      this.c(cvh.nd, cvh.G);
      this.m(cvh.fA);
      this.m(cvh.me);
      this.m(cvh.fr);
      this.m(cvh.fR);
      this.a(clr.tW);
      this.m(cvh.pg);
      this.m(cvh.G);
      this.m(cvh.H);
      this.m(cvh.hV);
      this.a(clr.fR);
      this.o(cvh.pM, cvh.qd);
      this.o(cvh.pN, cvh.qe);
      this.o(cvh.pO, cvh.qf);
      this.o(cvh.pP, cvh.qg);
      this.o(cvh.pQ, cvh.qh);
      this.o(cvh.pR, cvh.qi);
      this.o(cvh.pS, cvh.qj);
      this.o(cvh.pT, cvh.qk);
      this.o(cvh.pU, cvh.ql);
      this.o(cvh.pV, cvh.qm);
      this.o(cvh.pW, cvh.qn);
      this.o(cvh.pX, cvh.qo);
      this.o(cvh.pY, cvh.qp);
      this.o(cvh.pZ, cvh.qq);
      this.o(cvh.qa, cvh.qr);
      this.o(cvh.qb, cvh.qs);
      this.o(cvh.pL, cvh.qc);
      this.m(cvh.na);
      this.m(cvh.gs);
      this.m(cvh.qP);
      this.m(cvh.sx);
      this.s(cvh.sy);
      this.s(cvh.sz);
      this.t(cvh.ti);
      this.t(cvh.tj);
      this.ah();
      this.g(cvh.sC, cvh.sA);
      this.p(cvh.sB);
      this.a(cvh.hW, clr.hA);
      this.a(clr.hA);
      this.aC();
      this.a(cvh.kN, clr.ja);
      this.a(clr.ja);
      this.f(cvh.bQ, mm.a(cvh.by, "_side"));
      this.a(cvh.R);
      this.a(cvh.S);
      this.a(cvh.iB);
      this.a(cvh.cx);
      this.a(cvh.cy);
      this.a(cvh.cz);
      this.a(cvh.fE);
      this.a(cvh.fF);
      this.a(cvh.fJ);
      this.a(cvh.N);
      this.a(cvh.T);
      this.a(cvh.O);
      this.a(cvh.ch);
      this.a(cvh.P);
      this.a(cvh.Q);
      this.a(cvh.ci);
      this.b(cvh.pj, mo.c);
      this.a(cvh.pi);
      this.a(cvh.aR);
      this.a(cvh.aS);
      this.a(cvh.aT);
      this.a(cvh.hb);
      this.a(cvh.dI);
      this.a(cvh.dJ);
      this.a(cvh.ha);
      this.a(cvh.pC);
      this.a(cvh.mW);
      this.a(cvh.dR);
      this.a(cvh.k);
      this.a(cvh.pk);
      this.a(cvh.fz);
      this.a(cvh.ec);
      this.a(cvh.L);
      this.a(cvh.ph);
      this.a(cvh.dO);
      this.b(cvh.dT, mo.f);
      this.b(cvh.pq, mo.c);
      this.b(cvh.fa, mo.c);
      this.m(cvh.ac);
      this.m(cvh.ga);
      this.a(cvh.kK);
      this.a(cvh.aY);
      this.a(cvh.iC);
      this.a(cvh.co);
      this.a(cvh.pK);
      this.a(cvh.ii);
      this.a(cvh.oy);
      this.a(cvh.dW);
      this.a(cvh.dX);
      this.a(cvh.ct);
      this.a(cvh.aO);
      this.b(cvh.bw, mo.u);
      this.a(clr.cR);
      this.b(cvh.ck, mo.e);
      this.b(cvh.pd, mo.c);
      this.a(cvh.op);
      this.a(cvh.aP);
      this.a(cvh.qt);
      this.a(cvh.qu);
      this.a(cvh.qN);
      this.a(cvh.su);
      this.a(cvh.tf);
      this.a(cvh.tg);
      this.a(cvh.th);
      this.e(cvh.qS);
      this.aB();
      this.a(cvh.ra);
      this.a(cvh.rb);
      this.a(cvh.qZ);
      this.a(cvh.qY);
      this.a(cvh.qX);
      this.a(cvh.qW);
      this.k(cvh.qZ, cvh.rw);
      this.k(cvh.qY, cvh.ry);
      this.k(cvh.qX, cvh.rx);
      this.k(cvh.qW, cvh.rz);
      this.i(cvh.rM);
      this.i(cvh.rN);
      this.i(cvh.rP);
      this.i(cvh.rO);
      this.a(cvh.rM, cvh.rQ);
      this.a(cvh.rN, cvh.rR);
      this.a(cvh.rP, cvh.rT);
      this.a(cvh.rO, cvh.rS);
      this.k(cvh.rU);
      this.k(cvh.rV);
      this.k(cvh.rX);
      this.k(cvh.rW);
      this.b(cvh.rU, cvh.rY);
      this.b(cvh.rV, cvh.rZ);
      this.b(cvh.rX, cvh.sb);
      this.b(cvh.rW, cvh.sa);
      this.a(cvh.sc);
      this.a(cvh.sd);
      this.a(cvh.se);
      this.a(cvh.sf);
      this.k(cvh.sc, cvh.sg);
      this.k(cvh.sd, cvh.sh);
      this.k(cvh.se, cvh.si);
      this.k(cvh.sf, cvh.sj);
      this.j(cvh.gW, cvh.ch);
      this.j(cvh.gX, cvh.ci);
      this.G();
      this.r();
      this.av();
      this.v();
      this.w();
      this.a(cvh.og, cvh.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(cvh.kt);
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
      this.ag();
      this.aj();
      this.ai();
      this.ak();
      this.al();
      this.y();
      this.am();
      this.an();
      this.ao();
      this.ap();
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.F(cvh.ff);
      this.F(cvh.fg);
      this.F(cvh.qT);
      this.aw();
      this.aA();
      this.ad();
      this.ae();
      this.af();
      this.X();
      this.O();
      this.N();
      this.E(cvh.cO);
      this.d(cvh.cO);
      this.E(cvh.oa);
      this.g();
      this.E(cvh.sE);
      this.l(cvh.cp, cvh.cq);
      this.l(cvh.ea, cvh.eb);
      this.a(cvh.cA, cvh.n, mm::c);
      this.a(cvh.nY, cvh.p, mm::d);
      this.y(cvh.ow);
      this.y(cvh.on);
      this.v(cvh.aU);
      this.v(cvh.hi);
      this.C();
      this.D(cvh.oe);
      this.D(cvh.of);
      this.e(cvh.eX, mj.a(cvh.eX));
      this.a(cvh.dY, mo.c);
      this.a(cvh.dZ, mo.c);
      this.a(cvh.te);
      this.a(cvh.kM, mo.c);
      this.f(cvh.j);
      this.f(cvh.sH);
      this.f(cvh.I);
      this.g(cvh.J);
      this.g(cvh.M);
      this.f(cvh.K);
      this.e(cvh.F);
      this.b(cvh.to, mo.e);
      this.a(cvh.ij, mo.c, mo.d);
      this.a(cvh.kx, mo.v, mo.w);
      this.a(cvh.hf, mo.v, mo.w);
      this.a(cvh.tk, mo.c, mo.d);
      this.a(cvh.tl, mo.c, mo.d);
      this.a(cvh.tm, mo.c, mo.d);
      this.c(cvh.nT, mo.h);
      this.z();
      this.a(cvh.pe, mm::A);
      this.a(cvh.pf, mm::C);
      this.a(cvh.kD, did.as, 0, 1, 2, 3);
      this.a(cvh.gt, did.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cvh.fq, did.as, 0, 1, 1, 2);
      this.a(cvh.gu, did.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cvh.cB, did.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cvh.kA, lv.e.b, did.aq, 0, 1);
      this.i();
      this.h();
      this.a(mj.a("decorated_pot"), cvh.iA).b(cvh.tp);
      this.a(mj.a("banner"), cvh.n)
         .a(ml.bD, cvh.iJ, cvh.iK, cvh.iL, cvh.iM, cvh.iN, cvh.iO, cvh.iP, cvh.iQ, cvh.iR, cvh.iS, cvh.iT, cvh.iU, cvh.iV, cvh.iW, cvh.iX, cvh.iY)
         .b(cvh.iZ, cvh.ja, cvh.jb, cvh.jc, cvh.jd, cvh.je, cvh.jf, cvh.jg, cvh.jh, cvh.ji, cvh.jj, cvh.jk, cvh.jl, cvh.jm, cvh.jn, cvh.jo);
      this.a(mj.a("bed"), cvh.n)
         .b(cvh.aZ, cvh.ba, cvh.bb, cvh.bc, cvh.bd, cvh.be, cvh.bf, cvh.bg, cvh.bh, cvh.bi, cvh.bj, cvh.bk, cvh.bl, cvh.bm, cvh.bn, cvh.bo);
      this.m(cvh.aZ, cvh.bA);
      this.m(cvh.ba, cvh.bB);
      this.m(cvh.bb, cvh.bC);
      this.m(cvh.bc, cvh.bD);
      this.m(cvh.bd, cvh.bE);
      this.m(cvh.be, cvh.bF);
      this.m(cvh.bf, cvh.bG);
      this.m(cvh.bg, cvh.bH);
      this.m(cvh.bh, cvh.bI);
      this.m(cvh.bi, cvh.bJ);
      this.m(cvh.bj, cvh.bK);
      this.m(cvh.bk, cvh.bL);
      this.m(cvh.bl, cvh.bM);
      this.m(cvh.bm, cvh.bN);
      this.m(cvh.bn, cvh.bO);
      this.m(cvh.bo, cvh.bP);
      this.a(mj.a("skull"), cvh.dW)
         .a(ml.bE, cvh.gM, cvh.gK, cvh.gI, cvh.gE, cvh.gG, cvh.gQ)
         .a(cvh.gO)
         .b(cvh.gN, cvh.gP, cvh.gL, cvh.gJ, cvh.gF, cvh.gH, cvh.gR);
      this.G(cvh.kP);
      this.G(cvh.kQ);
      this.G(cvh.kR);
      this.G(cvh.kS);
      this.G(cvh.kT);
      this.G(cvh.kU);
      this.G(cvh.kV);
      this.G(cvh.kW);
      this.G(cvh.kX);
      this.G(cvh.kY);
      this.G(cvh.kZ);
      this.G(cvh.la);
      this.G(cvh.lb);
      this.G(cvh.lc);
      this.G(cvh.ld);
      this.G(cvh.le);
      this.G(cvh.lf);
      this.b(cvh.mX, mo.p);
      this.c(cvh.mX);
      this.a(mj.a("chest"), cvh.n).b(cvh.cv, cvh.gV);
      this.a(mj.a("ender_chest"), cvh.co).b(cvh.fG);
      this.f(cvh.fx, cvh.co).a(cvh.fx, cvh.kF);
      this.a(cvh.aM);
      this.a(cvh.aN);
      this.a(cvh.lw);
      this.a(cvh.lx);
      this.a(cvh.ly);
      this.a(cvh.lz);
      this.a(cvh.lA);
      this.a(cvh.lB);
      this.a(cvh.lC);
      this.a(cvh.lD);
      this.a(cvh.lE);
      this.a(cvh.lF);
      this.a(cvh.lG);
      this.a(cvh.lH);
      this.a(cvh.lI);
      this.a(cvh.lJ);
      this.a(cvh.lK);
      this.a(cvh.lL);
      this.a(mo.a, cvh.lM, cvh.lN, cvh.lO, cvh.lP, cvh.lQ, cvh.lR, cvh.lS, cvh.lT, cvh.lU, cvh.lV, cvh.lW, cvh.lX, cvh.lY, cvh.lZ, cvh.ma, cvh.mb);
      this.a(cvh.iA);
      this.a(cvh.hj);
      this.a(cvh.hk);
      this.a(cvh.hl);
      this.a(cvh.hm);
      this.a(cvh.hn);
      this.a(cvh.ho);
      this.a(cvh.hp);
      this.a(cvh.hq);
      this.a(cvh.hr);
      this.a(cvh.hs);
      this.a(cvh.ht);
      this.a(cvh.hu);
      this.a(cvh.hv);
      this.a(cvh.hw);
      this.a(cvh.hx);
      this.a(cvh.hy);
      this.a(cvh.qO);
      this.h(cvh.aQ, cvh.eY);
      this.h(cvh.ei, cvh.hz);
      this.h(cvh.ej, cvh.hA);
      this.h(cvh.ek, cvh.hB);
      this.h(cvh.el, cvh.hC);
      this.h(cvh.em, cvh.hD);
      this.h(cvh.en, cvh.hE);
      this.h(cvh.eo, cvh.hF);
      this.h(cvh.ep, cvh.hG);
      this.h(cvh.eq, cvh.hH);
      this.h(cvh.er, cvh.hI);
      this.h(cvh.es, cvh.hJ);
      this.h(cvh.et, cvh.hK);
      this.h(cvh.eu, cvh.hL);
      this.h(cvh.ev, cvh.hM);
      this.h(cvh.ew, cvh.hN);
      this.h(cvh.ex, cvh.hO);
      this.b(mo.n, cvh.lg, cvh.lh, cvh.li, cvh.lj, cvh.lk, cvh.ll, cvh.lm, cvh.ln, cvh.lo, cvh.lp, cvh.lq, cvh.lr, cvh.ls, cvh.lt, cvh.lu, cvh.lv);
      this.g(cvh.bA, cvh.ik);
      this.g(cvh.bB, cvh.il);
      this.g(cvh.bC, cvh.im);
      this.g(cvh.bD, cvh.in);
      this.g(cvh.bE, cvh.io);
      this.g(cvh.bF, cvh.ip);
      this.g(cvh.bG, cvh.iq);
      this.g(cvh.bH, cvh.ir);
      this.g(cvh.bI, cvh.is);
      this.g(cvh.bJ, cvh.it);
      this.g(cvh.bK, cvh.iu);
      this.g(cvh.bL, cvh.iv);
      this.g(cvh.bM, cvh.iw);
      this.g(cvh.bN, cvh.ix);
      this.g(cvh.bO, cvh.iy);
      this.g(cvh.bP, cvh.iz);
      this.a(cvh.sI);
      this.a(cvh.eL);
      this.a(cvh.bu, cvh.gb, lv.e.a);
      this.a(cvh.bR, cvh.gc, lv.e.b);
      this.a(cvh.bT, cvh.gd, lv.e.b);
      this.a(cvh.bU, cvh.ge, lv.e.b);
      this.a(cvh.bV, cvh.gf, lv.e.b);
      this.a(cvh.bW, cvh.gg, lv.e.b);
      this.a(cvh.bX, cvh.gh, lv.e.b);
      this.a(cvh.bY, cvh.gi, lv.e.b);
      this.a(cvh.bZ, cvh.gj, lv.e.b);
      this.a(cvh.ca, cvh.gk, lv.e.b);
      this.a(cvh.cb, cvh.gl, lv.e.b);
      this.a(cvh.cc, cvh.gm, lv.e.b);
      this.a(cvh.ce, cvh.gn, lv.e.b);
      this.a(cvh.cd, cvh.go, lv.e.b);
      this.a(cvh.cg, cvh.gp, lv.e.b);
      this.a(cvh.cf, cvh.gq, lv.e.b);
      this.a(cvh.bv, cvh.gr, lv.e.b);
      this.a(cvh.bS, cvh.fS, lv.e.b);
      this.H();
      this.u(cvh.eT);
      this.u(cvh.eU);
      this.u(cvh.eV);
      this.a(cvh.bt, lv.e.a);
      this.b(cvh.dS, lv.e.a);
      this.a(clr.dI);
      this.b(cvh.mc, cvh.md, lv.e.b);
      this.a(clr.dJ);
      this.c(cvh.md);
      this.b(cvh.sG, lv.e.b);
      this.c(cvh.sG);
      this.c(cvh.sw);
      this.b(cvh.oz, cvh.oA, lv.e.b);
      this.b(cvh.oB, cvh.oC, lv.e.b);
      this.a(cvh.oz, "_plant");
      this.c(cvh.oA);
      this.a(cvh.oB, "_plant");
      this.c(cvh.oC);
      this.a(cvh.mY, lv.e.a, mm.c(mm.a(cvh.mZ, "_stage0")));
      this.m();
      this.a(cvh.bs, lv.e.b);
      this.c(cvh.iE, lv.e.b);
      this.c(cvh.iF, lv.e.b);
      this.c(cvh.iG, lv.e.b);
      this.c(cvh.iH, lv.e.a);
      this.c(cvh.iI, lv.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cvh.mw, cvh.mr, cvh.mm, cvh.mh, cvh.mG, cvh.mB, cvh.mQ, cvh.mL);
      this.a(cvh.mx, cvh.ms, cvh.mn, cvh.mi, cvh.mH, cvh.mC, cvh.mR, cvh.mM);
      this.a(cvh.my, cvh.mt, cvh.mo, cvh.mj, cvh.mI, cvh.mD, cvh.mS, cvh.mN);
      this.a(cvh.mz, cvh.mu, cvh.mp, cvh.mk, cvh.mJ, cvh.mE, cvh.mT, cvh.mO);
      this.a(cvh.mA, cvh.mv, cvh.mq, cvh.ml, cvh.mK, cvh.mF, cvh.mU, cvh.mP);
      this.e(cvh.fe, cvh.fc);
      this.e(cvh.fd, cvh.fb);
      this.l(cvh.ab).c(cvh.ab).a(cvh.av);
      this.l(cvh.am).c(cvh.am).a(cvh.aD);
      this.a(cvh.am, cvh.dj, cvh.ds);
      this.b(cvh.aL, mo.r);
      this.l(cvh.Y).c(cvh.Y).a(cvh.as);
      this.l(cvh.ai).c(cvh.ai).a(cvh.aA);
      this.a(cvh.ai, cvh.dd, cvh.do);
      this.a(cvh.B, cvh.fX, lv.e.b);
      this.b(cvh.aI, mo.r);
      this.l(cvh.Z).d(cvh.Z).a(cvh.at);
      this.l(cvh.aj).d(cvh.aj).a(cvh.aB);
      this.a(cvh.aj, cvh.de, cvh.dp);
      this.a(cvh.C, cvh.fY, lv.e.b);
      this.b(cvh.aJ, mo.r);
      this.l(cvh.W).c(cvh.W).a(cvh.aq);
      this.l(cvh.ag).c(cvh.ag).a(cvh.ay);
      this.a(cvh.ag, cvh.dc, cvh.dn);
      this.a(cvh.z, cvh.fV, lv.e.b);
      this.b(cvh.aG, mo.r);
      this.l(cvh.U).c(cvh.U).a(cvh.ao);
      this.l(cvh.al).c(cvh.al).a(cvh.aw);
      this.a(cvh.al, cvh.da, cvh.dl);
      this.a(cvh.x, cvh.fT, lv.e.b);
      this.b(cvh.aE, mo.r);
      this.l(cvh.V).c(cvh.V).a(cvh.ap);
      this.l(cvh.af).c(cvh.af).a(cvh.ax);
      this.a(cvh.af, cvh.db, cvh.dm);
      this.a(cvh.y, cvh.fU, lv.e.b);
      this.b(cvh.aF, mo.r);
      this.l(cvh.aa).c(cvh.aa).a(cvh.au);
      this.l(cvh.ak).c(cvh.ak).a(cvh.aC);
      this.a(cvh.ak, cvh.dg, cvh.dr);
      this.a(cvh.D, cvh.fZ, lv.e.b);
      this.b(cvh.aK, mo.r);
      this.l(cvh.X).c(cvh.X).a(cvh.ar);
      this.l(cvh.ah).c(cvh.ah).a(cvh.az);
      this.a(cvh.ah, cvh.df, cvh.dq);
      this.a(cvh.A, cvh.fW, lv.e.b);
      this.b(cvh.aH, mo.r);
      this.l(cvh.os).b(cvh.os).a(cvh.ou);
      this.l(cvh.ot).b(cvh.ot).a(cvh.ov);
      this.a(cvh.ot, cvh.dh, cvh.dt);
      this.a(cvh.ox, cvh.pm, lv.e.b);
      this.n(cvh.oD, cvh.po);
      this.l(cvh.oj).b(cvh.oj).a(cvh.ol);
      this.l(cvh.ok).b(cvh.ok).a(cvh.om);
      this.a(cvh.ok, cvh.di, cvh.du);
      this.a(cvh.oo, cvh.pn, lv.e.b);
      this.n(cvh.oq, cvh.pp);
      this.l(cvh.ae).d(cvh.ae);
      this.l(cvh.an).d(cvh.an);
      this.a(cvh.v, cvh.dk, cvh.dv);
      this.b(cvh.or, lv.e.b);
      this.a(clr.dF);
      this.i(cvh.dy);
      this.k(cvh.hY);
      this.u();
      this.n(cvh.cP);
      this.o(cvh.bp);
      this.o(cvh.bq);
      this.o(cvh.hh);
      this.t();
      this.q(cvh.fN);
      this.q(cvh.kG);
      this.q(cvh.kH);
      this.r(cvh.gS);
      this.r(cvh.gT);
      this.r(cvh.gU);
      this.o();
      this.p();
      this.d(cvh.cD, mo.g);
      this.d(cvh.nW, mo.g);
      this.d(cvh.nV, mo.h);
      this.s();
      this.az();
      this.au();
      this.k(cvh.eK, cvh.eS);
      this.k(cvh.m, cvh.eO);
      this.k(cvh.eJ, cvh.eR);
      this.k(cvh.eI, cvh.eQ);
      this.ax();
      this.k(cvh.eH, cvh.eP);
      this.ay();
      cmt.h().forEach($$0 -> this.a($$0, mj.b("template_spawn_egg")));
   }

   private void aC() {
      this.c(cvh.hX);
      mc.a<Integer> $$0 = mc.a(did.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         agm $$3 = mm.a(clr.hB, $$2);
         $$0.a($$1, me.a().a(mf.c, ml.Y.a(cvh.hX, $$2, mm.h($$3), this.c)));
         ml.bv.a(mj.a(clr.hB, $$2), mm.k($$3), this.c);
      }

      this.b.accept(mb.a(cvh.hX).a($$0));
   }

   private void o(cvf $$0, cvf $$1) {
      this.a($$0.k());
      mm $$2 = mm.b(mm.G($$0));
      mm $$3 = mm.b(mm.a($$0, "_lit"));
      agm $$4 = ml.bF.a($$0, "_one_candle", $$2, this.c);
      agm $$5 = ml.bG.a($$0, "_two_candles", $$2, this.c);
      agm $$6 = ml.bH.a($$0, "_three_candles", $$2, this.c);
      agm $$7 = ml.bI.a($$0, "_four_candles", $$2, this.c);
      agm $$8 = ml.bF.a($$0, "_one_candle_lit", $$3, this.c);
      agm $$9 = ml.bG.a($$0, "_two_candles_lit", $$3, this.c);
      agm $$10 = ml.bH.a($$0, "_three_candles_lit", $$3, this.c);
      agm $$11 = ml.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            mb.a($$0)
               .a(
                  mc.a(did.az, did.r)
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
      agm $$12 = ml.bJ.a($$1, mm.a($$0, false), this.c);
      agm $$13 = ml.bJ.a($$1, "_lit", mm.a($$0, true), this.c);
      this.b.accept(mb.a($$1).a(a(did.r, $$13, $$12)));
   }

   class a {
      private final agm b;

      public a(agm $$0, cvf $$1) {
         this.b = ml.Y.a($$0, mm.u($$1), lv.this.c);
      }

      public lv.a a(cvf... $$0) {
         for (cvf $$1 : $$0) {
            lv.this.b.accept(lv.c($$1, this.b));
         }

         return this;
      }

      public lv.a b(cvf... $$0) {
         for (cvf $$1 : $$0) {
            lv.this.c($$1);
         }

         return this.a($$0);
      }

      public lv.a a(mk $$0, cvf... $$1) {
         for (cvf $$2 : $$1) {
            $$0.a(mj.a($$2.k()), mm.u($$2), lv.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mm b;
      private final Map<mk, agm> c = Maps.newHashMap();
      @Nullable
      private kg d;
      @Nullable
      private agm e;
      private final Set<cvf> f = new HashSet<>();

      public b(mm $$0) {
         this.b = $$0;
      }

      public lv.b a(cvf $$0, mk $$1) {
         this.e = $$1.a($$0, this.b, lv.this.c);
         if (lv.this.f.containsKey($$0)) {
            lv.this.b.accept(lv.this.f.get($$0).create($$0, this.e, this.b, lv.this.c));
         } else {
            lv.this.b.accept(lv.c($$0, this.e));
         }

         return this;
      }

      public lv.b a(cvf $$0, cvf $$1) {
         agm $$2 = mj.a($$0);
         lv.this.b.accept(lv.c($$1, $$2));
         lv.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public lv.b a(cvf $$0) {
         agm $$1 = ml.q.a($$0, this.b, lv.this.c);
         agm $$2 = ml.r.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.b($$0, $$1, $$2));
         agm $$3 = ml.s.a($$0, this.b, lv.this.c);
         lv.this.a($$0, $$3);
         return this;
      }

      public lv.b b(cvf $$0) {
         agm $$1 = ml.K.a($$0, this.b, lv.this.c);
         agm $$2 = ml.L.a($$0, this.b, lv.this.c);
         agm $$3 = ml.M.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.a($$0, $$1, $$2, $$3));
         agm $$4 = ml.N.a($$0, this.b, lv.this.c);
         lv.this.a($$0, $$4);
         return this;
      }

      public lv.b c(cvf $$0) {
         mm $$1 = mm.p($$0);
         agm $$2 = ml.B.a($$0, $$1, lv.this.c);
         agm $$3 = ml.C.a($$0, $$1, lv.this.c);
         agm $$4 = ml.D.a($$0, $$1, lv.this.c);
         agm $$5 = ml.E.a($$0, $$1, lv.this.c);
         agm $$6 = ml.F.a($$0, $$1, lv.this.c);
         lv.this.b.accept(lv.a($$0, $$2, $$3, $$4, $$5, $$6));
         agm $$7 = ml.G.a($$0, $$1, lv.this.c);
         lv.this.a($$0, $$7);
         return this;
      }

      public lv.b d(cvf $$0) {
         agm $$1 = ml.H.a($$0, this.b, lv.this.c);
         agm $$2 = ml.I.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.c($$0, $$1, $$2));
         agm $$3 = ml.J.a($$0, this.b, lv.this.c);
         lv.this.a($$0, $$3);
         return this;
      }

      public lv.b e(cvf $$0) {
         mm $$1 = mm.p($$0);
         agm $$2 = ml.P.a($$0, $$1, lv.this.c);
         agm $$3 = ml.O.a($$0, $$1, lv.this.c);
         agm $$4 = ml.R.a($$0, $$1, lv.this.c);
         agm $$5 = ml.Q.a($$0, $$1, lv.this.c);
         lv.this.b.accept(lv.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public lv.b f(cvf $$0) {
         agm $$1 = ml.T.a($$0, this.b, lv.this.c);
         agm $$2 = ml.S.a($$0, this.b, lv.this.c);
         agm $$3 = ml.V.a($$0, this.b, lv.this.c);
         agm $$4 = ml.U.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public lv.b g(cvf $$0) {
         agm $$1 = ml.W.a($$0, this.b, lv.this.c);
         agm $$2 = ml.X.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.e($$0, $$1, $$2));
         return this;
      }

      public lv.b h(cvf $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cvf $$1 = this.d.b().get(kg.b.r);
            agm $$2 = ml.Y.a($$0, this.b, lv.this.c);
            lv.this.b.accept(lv.c($$0, $$2));
            lv.this.b.accept(lv.c($$1, $$2));
            lv.this.a($$0.k());
            lv.this.c($$1);
            return this;
         }
      }

      public lv.b i(cvf $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            agm $$1 = this.a(ml.Z, $$0);
            agm $$2 = this.a(ml.aa, $$0);
            lv.this.b.accept(lv.e($$0, $$1, $$2, this.e));
            lv.this.a($$0, $$1);
            return this;
         }
      }

      public lv.b j(cvf $$0) {
         agm $$1 = this.a(ml.ad, $$0);
         agm $$2 = this.a(ml.ac, $$0);
         agm $$3 = this.a(ml.ae, $$0);
         lv.this.b.accept(lv.b($$0, $$1, $$2, $$3));
         lv.this.a($$0, $$2);
         return this;
      }

      private lv.b k(cvf $$0) {
         mo $$1 = lv.this.g.getOrDefault($$0, mo.a.get($$0));
         agm $$2 = $$1.a($$0, lv.this.c);
         lv.this.b.accept(lv.c($$0, $$2));
         return this;
      }

      private lv.b l(cvf $$0) {
         lv.this.i($$0);
         return this;
      }

      private void m(cvf $$0) {
         if (lv.this.e.contains($$0)) {
            lv.this.k($$0);
         } else {
            lv.this.j($$0);
         }
      }

      private agm a(mk $$0, cvf $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, lv.this.c));
      }

      public lv.b a(kg $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<lv.b, cvf> $$2 = lv.h.get($$0x);
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
      ly create(cvf var1, agm var2, mm var3, BiConsumer<agm, Supplier<JsonElement>> var4);
   }

   static record d(mk a, String b) {
   }

   static enum e {
      a,
      b;

      public mk a() {
         return this == a ? ml.an : ml.am;
      }

      public mk b() {
         return this == a ? ml.ap : ml.ao;
      }
   }

   class f {
      private final mm b;

      public f(mm $$0) {
         this.b = $$0;
      }

      public lv.f a(cvf $$0) {
         mm $$1 = this.b.c(mn.d, this.b.a(mn.i));
         agm $$2 = ml.i.a($$0, $$1, lv.this.c);
         lv.this.b.accept(lv.d($$0, $$2));
         return this;
      }

      public lv.f b(cvf $$0) {
         agm $$1 = ml.i.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.d($$0, $$1));
         return this;
      }

      public lv.f c(cvf $$0) {
         agm $$1 = ml.i.a($$0, this.b, lv.this.c);
         agm $$2 = ml.j.a($$0, this.b, lv.this.c);
         lv.this.b.accept(lv.d($$0, $$1, $$2));
         return this;
      }

      public lv.f d(cvf $$0) {
         lv.this.b.accept(lv.a($$0, this.b, lv.this.c));
         return this;
      }
   }
}
