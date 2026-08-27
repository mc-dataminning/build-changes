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

public class lr {
   final Consumer<lu> b;
   final BiConsumer<agg, Supplier<JsonElement>> c;
   private final Consumer<ckw> d;
   final List<cut> e = ImmutableList.of(cuv.ey, cuv.eE, cuv.hY);
   final Map<cut, lr.c> f = ImmutableMap.builder().put(cuv.b, lr::a).put(cuv.rI, lr::c).put(cuv.eM, lr::b).build();
   final Map<cut, mk> g = ImmutableMap.builder()
      .put(cuv.aV, mk.x.get(cuv.aV))
      .put(cuv.jp, mk.x.get(cuv.jp))
      .put(cuv.jS, mk.a(mi.a(cuv.aV, "_top")))
      .put(cuv.jU, mk.a(mi.a(cuv.jp, "_top")))
      .put(cuv.aX, mk.c.get(cuv.aV).a($$0x -> $$0x.a(mj.i, mi.G(cuv.aX))))
      .put(cuv.jr, mk.c.get(cuv.jp).a($$0x -> $$0x.a(mj.i, mi.G(cuv.jr))))
      .put(cuv.hd, mk.c.get(cuv.hd))
      .put(cuv.jT, mk.a(mi.a(cuv.hd, "_bottom")))
      .put(cuv.pr, mk.y.get(cuv.pr))
      .put(cuv.rI, mk.y.get(cuv.rI))
      .put(cuv.he, mk.c.get(cuv.he).a($$0x -> $$0x.a(mj.i, mi.G(cuv.he))))
      .put(cuv.aW, mk.c.get(cuv.aW).a($$0x -> {
         $$0x.a(mj.d, mi.a(cuv.aV, "_top"));
         $$0x.a(mj.i, mi.G(cuv.aW));
      }))
      .put(cuv.jq, mk.c.get(cuv.jq).a($$0x -> {
         $$0x.a(mj.d, mi.a(cuv.jp, "_top"));
         $$0x.a(mj.i, mi.G(cuv.jq));
      }))
      .build();
   static final Map<kc.b, BiConsumer<lr.b, cut>> h = ImmutableMap.builder()
      .put(kc.b.a, lr.b::a)
      .put(kc.b.e, lr.b::l)
      .put(kc.b.b, lr.b::k)
      .put(kc.b.c, lr.b::k)
      .put(kc.b.f, lr.b::c)
      .put(kc.b.g, lr.b::d)
      .put(kc.b.h, lr.b::e)
      .put(kc.b.i, lr.b::f)
      .put(kc.b.k, lr.b::h)
      .put(kc.b.l, lr.b::i)
      .put(kc.b.m, lr.b::j)
      .put(kc.b.n, lr.b::g)
      .put(kc.b.p, lr.b::m)
      .put(kc.b.q, lr.b::b)
      .build();
   public static final List<Pair<dhn, Function<agg, ma>>> a = List.of(
      Pair.of(dhm.L, (Function<agg, ma>)$$0 -> ma.a().a(mb.c, $$0)),
      Pair.of(dhm.M, (Function<agg, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.b, mb.a.b).a(mb.d, true)),
      Pair.of(dhm.N, (Function<agg, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.b, mb.a.c).a(mb.d, true)),
      Pair.of(dhm.O, (Function<agg, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.b, mb.a.d).a(mb.d, true)),
      Pair.of(dhm.J, (Function<agg, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.a, mb.a.d).a(mb.d, true)),
      Pair.of(dhm.K, (Function<agg, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.a, mb.a.b).a(mb.d, true))
   );
   private static final Map<lr.d, agg> i = new HashMap<>();

   private static lu a(cut $$0, agg $$1, mi $$2, BiConsumer<agg, Supplier<JsonElement>> $$3) {
      agg $$4 = mh.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static lu b(cut $$0, agg $$1, mi $$2, BiConsumer<agg, Supplier<JsonElement>> $$3) {
      agg $$4 = mh.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static lu c(cut $$0, agg $$1, mi $$2, BiConsumer<agg, Supplier<JsonElement>> $$3) {
      agg $$4 = mh.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public lr(Consumer<lu> $$0, BiConsumer<agg, Supplier<JsonElement>> $$1, Consumer<ckw> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cut $$0) {
      this.d.accept($$0.k());
   }

   void a(cut $$0, agg $$1) {
      this.c.accept(mf.a($$0.k()), new me($$1));
   }

   private void a(ckw $$0, agg $$1) {
      this.c.accept(mf.a($$0), new me($$1));
   }

   void a(ckw $$0) {
      mh.bv.a(mf.a($$0), mi.b($$0), this.c);
   }

   private void d(cut $$0) {
      ckw $$1 = $$0.k();
      if ($$1 != cle.a) {
         mh.bv.a(mf.a($$1), mi.F($$0), this.c);
      }
   }

   private void a(cut $$0, String $$1) {
      ckw $$2 = $$0.k();
      mh.bv.a(mf.a($$2), mi.k(mi.a($$0, $$1)), this.c);
   }

   private static ly b() {
      return ly.a(dhm.R).a(hx.f, ma.a().a(mb.b, mb.a.b)).a(hx.d, ma.a().a(mb.b, mb.a.c)).a(hx.e, ma.a().a(mb.b, mb.a.d)).a(hx.c, ma.a());
   }

   private static ly c() {
      return ly.a(dhm.R).a(hx.d, ma.a()).a(hx.e, ma.a().a(mb.b, mb.a.b)).a(hx.c, ma.a().a(mb.b, mb.a.c)).a(hx.f, ma.a().a(mb.b, mb.a.d));
   }

   private static ly d() {
      return ly.a(dhm.R).a(hx.f, ma.a()).a(hx.d, ma.a().a(mb.b, mb.a.b)).a(hx.e, ma.a().a(mb.b, mb.a.c)).a(hx.c, ma.a().a(mb.b, mb.a.d));
   }

   private static ly e() {
      return ly.a(dhm.P)
         .a(hx.a, ma.a().a(mb.a, mb.a.b))
         .a(hx.b, ma.a().a(mb.a, mb.a.d))
         .a(hx.c, ma.a())
         .a(hx.d, ma.a().a(mb.b, mb.a.c))
         .a(hx.e, ma.a().a(mb.b, mb.a.d))
         .a(hx.f, ma.a().a(mb.b, mb.a.b));
   }

   private static lx b(cut $$0, agg $$1) {
      return lx.a($$0, a($$1));
   }

   private static ma[] a(agg $$0) {
      return new ma[]{ma.a().a(mb.c, $$0), ma.a().a(mb.c, $$0).a(mb.b, mb.a.b), ma.a().a(mb.c, $$0).a(mb.b, mb.a.c), ma.a().a(mb.c, $$0).a(mb.b, mb.a.d)};
   }

   private static lx a(cut $$0, agg $$1, agg $$2) {
      return lx.a($$0, ma.a().a(mb.c, $$1), ma.a().a(mb.c, $$2), ma.a().a(mb.c, $$1).a(mb.b, mb.a.c), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c));
   }

   private static ly a(dhn $$0, agg $$1, agg $$2) {
      return ly.a($$0).a(true, ma.a().a(mb.c, $$1)).a(false, ma.a().a(mb.c, $$2));
   }

   private void e(cut $$0) {
      agg $$1 = mk.a.create($$0, this.c);
      agg $$2 = mk.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cut $$0) {
      agg $$1 = mk.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cut $$0) {
      this.b.accept(lx.a($$0).a(ly.a(dhm.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         agg $$3 = mi.a($$0, $$2);
         return ma.a().a(mb.c, mh.c.a($$0, $$2, new mi().a(mj.a, $$3), this.c));
      })));
      this.a($$0, mi.a($$0, "_0"));
   }

   static lu b(cut $$0, agg $$1, agg $$2) {
      return lx.a($$0)
         .a(ly.a(dhm.w).a(false, ma.a().a(mb.c, $$1)).a(true, ma.a().a(mb.c, $$2)))
         .a(
            ly.a(dhm.U, dhm.R)
               .a(dhh.a, hx.f, ma.a().a(mb.b, mb.a.b))
               .a(dhh.a, hx.e, ma.a().a(mb.b, mb.a.d))
               .a(dhh.a, hx.d, ma.a().a(mb.b, mb.a.c))
               .a(dhh.a, hx.c, ma.a())
               .a(dhh.b, hx.f, ma.a().a(mb.b, mb.a.b).a(mb.a, mb.a.b).a(mb.d, true))
               .a(dhh.b, hx.e, ma.a().a(mb.b, mb.a.d).a(mb.a, mb.a.b).a(mb.d, true))
               .a(dhh.b, hx.d, ma.a().a(mb.b, mb.a.c).a(mb.a, mb.a.b).a(mb.d, true))
               .a(dhh.b, hx.c, ma.a().a(mb.a, mb.a.b).a(mb.d, true))
               .a(dhh.c, hx.f, ma.a().a(mb.b, mb.a.d).a(mb.a, mb.a.c))
               .a(dhh.c, hx.e, ma.a().a(mb.b, mb.a.b).a(mb.a, mb.a.c))
               .a(dhh.c, hx.d, ma.a().a(mb.a, mb.a.c))
               .a(dhh.c, hx.c, ma.a().a(mb.b, mb.a.c).a(mb.a, mb.a.c))
         );
   }

   private static ly.d<hx, dhs, dhr, Boolean> a(ly.d<hx, dhs, dhr, Boolean> $$0, dhs $$1, agg $$2, agg $$3, agg $$4, agg $$5) {
      return $$0.a(hx.f, $$1, dhr.a, false, ma.a().a(mb.c, $$2))
         .a(hx.d, $$1, dhr.a, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
         .a(hx.e, $$1, dhr.a, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.c))
         .a(hx.c, $$1, dhr.a, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.d))
         .a(hx.f, $$1, dhr.b, false, ma.a().a(mb.c, $$4))
         .a(hx.d, $$1, dhr.b, false, ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
         .a(hx.e, $$1, dhr.b, false, ma.a().a(mb.c, $$4).a(mb.b, mb.a.c))
         .a(hx.c, $$1, dhr.b, false, ma.a().a(mb.c, $$4).a(mb.b, mb.a.d))
         .a(hx.f, $$1, dhr.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
         .a(hx.d, $$1, dhr.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
         .a(hx.e, $$1, dhr.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
         .a(hx.c, $$1, dhr.a, true, ma.a().a(mb.c, $$3))
         .a(hx.f, $$1, dhr.b, true, ma.a().a(mb.c, $$5).a(mb.b, mb.a.d))
         .a(hx.d, $$1, dhr.b, true, ma.a().a(mb.c, $$5))
         .a(hx.e, $$1, dhr.b, true, ma.a().a(mb.c, $$5).a(mb.b, mb.a.b))
         .a(hx.c, $$1, dhr.b, true, ma.a().a(mb.c, $$5).a(mb.b, mb.a.c));
   }

   private static lu a(cut $$0, agg $$1, agg $$2, agg $$3, agg $$4, agg $$5, agg $$6, agg $$7, agg $$8) {
      return lx.a($$0).a(a(a(ly.a(dhm.R, dhm.ae, dhm.be, dhm.u), dhs.b, $$1, $$2, $$3, $$4), dhs.a, $$5, $$6, $$7, $$8));
   }

   static lu a(cut $$0, agg $$1, agg $$2, agg $$3, agg $$4, agg $$5) {
      return lw.a($$0)
         .a(ma.a().a(mb.c, $$1))
         .a(lv.a().a(dhm.L, true), ma.a().a(mb.c, $$2).a(mb.d, false))
         .a(lv.a().a(dhm.M, true), ma.a().a(mb.c, $$3).a(mb.d, false))
         .a(lv.a().a(dhm.N, true), ma.a().a(mb.c, $$4).a(mb.d, false))
         .a(lv.a().a(dhm.O, true), ma.a().a(mb.c, $$5).a(mb.d, false));
   }

   static lu c(cut $$0, agg $$1, agg $$2) {
      return lw.a($$0)
         .a(ma.a().a(mb.c, $$1))
         .a(lv.a().a(dhm.L, true), ma.a().a(mb.c, $$2).a(mb.d, true))
         .a(lv.a().a(dhm.M, true), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, true))
         .a(lv.a().a(dhm.N, true), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, true))
         .a(lv.a().a(dhm.O, true), ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, true));
   }

   static lu a(cut $$0, agg $$1, agg $$2, agg $$3) {
      return lw.a($$0)
         .a(lv.a().a(dhm.J, true), ma.a().a(mb.c, $$1))
         .a(lv.a().a(dhm.X, dii.b), ma.a().a(mb.c, $$2).a(mb.d, true))
         .a(lv.a().a(dhm.W, dii.b), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, true))
         .a(lv.a().a(dhm.Y, dii.b), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, true))
         .a(lv.a().a(dhm.Z, dii.b), ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, true))
         .a(lv.a().a(dhm.X, dii.c), ma.a().a(mb.c, $$3).a(mb.d, true))
         .a(lv.a().a(dhm.W, dii.c), ma.a().a(mb.c, $$3).a(mb.b, mb.a.b).a(mb.d, true))
         .a(lv.a().a(dhm.Y, dii.c), ma.a().a(mb.c, $$3).a(mb.b, mb.a.c).a(mb.d, true))
         .a(lv.a().a(dhm.Z, dii.c), ma.a().a(mb.c, $$3).a(mb.b, mb.a.d).a(mb.d, true));
   }

   static lu a(cut $$0, agg $$1, agg $$2, agg $$3, agg $$4, boolean $$5) {
      return lx.a($$0, ma.a().a(mb.d, $$5))
         .a(c())
         .a(
            ly.a(dhm.q, dhm.u)
               .a(false, false, ma.a().a(mb.c, $$2))
               .a(true, false, ma.a().a(mb.c, $$4))
               .a(false, true, ma.a().a(mb.c, $$1))
               .a(true, true, ma.a().a(mb.c, $$3))
         );
   }

   static lu b(cut $$0, agg $$1, agg $$2, agg $$3) {
      return lx.a($$0)
         .a(
            ly.a(dhm.R, dhm.af, dhm.bi)
               .a(hx.f, dhv.b, dif.a, ma.a().a(mb.c, $$2))
               .a(hx.e, dhv.b, dif.a, ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dhv.b, dif.a, ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dhv.b, dif.a, ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dhv.b, dif.e, ma.a().a(mb.c, $$3))
               .a(hx.e, dhv.b, dif.e, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dhv.b, dif.e, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dhv.b, dif.e, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dhv.b, dif.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.e, dhv.b, dif.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.d, dhv.b, dif.d, ma.a().a(mb.c, $$3))
               .a(hx.c, dhv.b, dif.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.f, dhv.b, dif.c, ma.a().a(mb.c, $$1))
               .a(hx.e, dhv.b, dif.c, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dhv.b, dif.c, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dhv.b, dif.c, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dhv.b, dif.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.e, dhv.b, dif.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.d, dhv.b, dif.b, ma.a().a(mb.c, $$1))
               .a(hx.c, dhv.b, dif.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.f, dhv.a, dif.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.e, dhv.a, dif.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dhv.a, dif.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dhv.a, dif.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dhv.a, dif.e, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.e, dhv.a, dif.e, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.d, dhv.a, dif.e, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.c, dhv.a, dif.e, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.f, dhv.a, dif.d, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.e, dhv.a, dif.d, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dhv.a, dif.d, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dhv.a, dif.d, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dhv.a, dif.c, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.e, dhv.a, dif.c, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.d, dhv.a, dif.c, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.c, dhv.a, dif.c, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.f, dhv.a, dif.b, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.e, dhv.a, dif.b, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dhv.a, dif.b, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dhv.a, dif.b, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
         );
   }

   private static lu c(cut $$0, agg $$1, agg $$2, agg $$3) {
      return lx.a($$0)
         .a(
            ly.a(dhm.R, dhm.af, dhm.u)
               .a(hx.c, dhv.b, false, ma.a().a(mb.c, $$2))
               .a(hx.d, dhv.b, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.c))
               .a(hx.f, dhv.b, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
               .a(hx.e, dhv.b, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.d))
               .a(hx.c, dhv.a, false, ma.a().a(mb.c, $$1))
               .a(hx.d, dhv.a, false, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c))
               .a(hx.f, dhv.a, false, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b))
               .a(hx.e, dhv.a, false, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d))
               .a(hx.c, dhv.b, true, ma.a().a(mb.c, $$3))
               .a(hx.d, dhv.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               .a(hx.f, dhv.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(hx.e, dhv.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
               .a(hx.c, dhv.a, true, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.c))
               .a(hx.d, dhv.a, true, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.a))
               .a(hx.f, dhv.a, true, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.d))
               .a(hx.e, dhv.a, true, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.b))
         );
   }

   private static lu d(cut $$0, agg $$1, agg $$2, agg $$3) {
      return lx.a($$0)
         .a(
            ly.a(dhm.R, dhm.af, dhm.u)
               .a(hx.c, dhv.b, false, ma.a().a(mb.c, $$2))
               .a(hx.d, dhv.b, false, ma.a().a(mb.c, $$2))
               .a(hx.f, dhv.b, false, ma.a().a(mb.c, $$2))
               .a(hx.e, dhv.b, false, ma.a().a(mb.c, $$2))
               .a(hx.c, dhv.a, false, ma.a().a(mb.c, $$1))
               .a(hx.d, dhv.a, false, ma.a().a(mb.c, $$1))
               .a(hx.f, dhv.a, false, ma.a().a(mb.c, $$1))
               .a(hx.e, dhv.a, false, ma.a().a(mb.c, $$1))
               .a(hx.c, dhv.b, true, ma.a().a(mb.c, $$3))
               .a(hx.d, dhv.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               .a(hx.f, dhv.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(hx.e, dhv.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
               .a(hx.c, dhv.a, true, ma.a().a(mb.c, $$3))
               .a(hx.d, dhv.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               .a(hx.f, dhv.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(hx.e, dhv.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
         );
   }

   static lx c(cut $$0, agg $$1) {
      return lx.a($$0, ma.a().a(mb.c, $$1));
   }

   private static ly f() {
      return ly.a(dhm.I).a(hx.a.b, ma.a()).a(hx.a.c, ma.a().a(mb.a, mb.a.b)).a(hx.a.a, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.b));
   }

   static lu a(cut $$0, mi $$1, BiConsumer<agg, Supplier<JsonElement>> $$2) {
      agg $$3 = mh.f.a($$0, $$1, $$2);
      agg $$4 = mh.g.a($$0, $$1, $$2);
      agg $$5 = mh.h.a($$0, $$1, $$2);
      agg $$6 = mh.i.a($$0, $$1, $$2);
      return lx.a($$0, ma.a().a(mb.c, $$6)).a(ly.a(dhm.I).a(hx.a.a, ma.a().a(mb.c, $$3)).a(hx.a.b, ma.a().a(mb.c, $$4)).a(hx.a.c, ma.a().a(mb.c, $$5)));
   }

   static lu d(cut $$0, agg $$1) {
      return lx.a($$0, ma.a().a(mb.c, $$1)).a(f());
   }

   private void e(cut $$0, agg $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cut $$0, mk.a $$1) {
      agg $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cut $$0, mk.a $$1) {
      agg $$2 = $$1.create($$0, this.c);
      this.b.accept(lx.a($$0, ma.a().a(mb.c, $$2)).a(b()));
   }

   static lu d(cut $$0, agg $$1, agg $$2) {
      return lx.a($$0)
         .a(
            ly.a(dhm.I)
               .a(hx.a.b, ma.a().a(mb.c, $$1))
               .a(hx.a.c, ma.a().a(mb.c, $$2).a(mb.a, mb.a.b))
               .a(hx.a.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.b).a(mb.b, mb.a.b))
         );
   }

   private void a(cut $$0, mk.a $$1, mk.a $$2) {
      agg $$3 = $$1.create($$0, this.c);
      agg $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private agg a(cut $$0, String $$1, mg $$2, Function<agg, mi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mi.a($$0, $$1)), this.c);
   }

   static lu e(cut $$0, agg $$1, agg $$2) {
      return lx.a($$0).a(a(dhm.w, $$2, $$1));
   }

   static lu e(cut $$0, agg $$1, agg $$2, agg $$3) {
      return lx.a($$0).a(ly.a(dhm.bh).a(die.b, ma.a().a(mb.c, $$1)).a(die.a, ma.a().a(mb.c, $$2)).a(die.c, ma.a().a(mb.c, $$3)));
   }

   public void a(cut $$0) {
      this.b($$0, mk.a);
   }

   public void b(cut $$0, mk.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cut $$0, mi $$1, mg $$2) {
      agg $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private lr.b h(cut $$0) {
      mk $$1 = this.g.getOrDefault($$0, mk.a.get($$0));
      return new lr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cut $$0, cut $$1, cut $$2) {
      mi $$3 = mi.u($$0);
      agg $$4 = mh.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(cut $$0) {
      mi $$1 = mi.t($$0);
      agg $$2 = mh.t.a($$0, $$1, this.c);
      agg $$3 = mh.u.a($$0, $$1, this.c);
      agg $$4 = mh.v.a($$0, $$1, this.c);
      agg $$5 = mh.w.a($$0, $$1, this.c);
      agg $$6 = mh.x.a($$0, $$1, this.c);
      agg $$7 = mh.y.a($$0, $$1, this.c);
      agg $$8 = mh.z.a($$0, $$1, this.c);
      agg $$9 = mh.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cut $$0) {
      mi $$1 = mi.b($$0);
      agg $$2 = mh.ai.a($$0, $$1, this.c);
      agg $$3 = mh.aj.a($$0, $$1, this.c);
      agg $$4 = mh.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cut $$0) {
      mi $$1 = mi.b($$0);
      agg $$2 = mh.af.a($$0, $$1, this.c);
      agg $$3 = mh.ag.a($$0, $$1, this.c);
      agg $$4 = mh.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(cuv.rC);
      agg $$0 = mf.a(cuv.rC);
      agg $$1 = mf.a(cuv.rC, "_partial_tilt");
      agg $$2 = mf.a(cuv.rC, "_full_tilt");
      this.b
         .accept(
            lx.a(cuv.rC)
               .a(b())
               .a(ly.a(dhm.bl).a(dih.a, ma.a().a(mb.c, $$0)).a(dih.b, ma.a().a(mb.c, $$0)).a(dih.c, ma.a().a(mb.c, $$1)).a(dih.d, ma.a().a(mb.c, $$2)))
         );
   }

   private lr.f l(cut $$0) {
      return new lr.f(mi.n($$0));
   }

   private void m(cut $$0) {
      this.a($$0, $$0);
   }

   private void a(cut $$0, cut $$1) {
      this.b.accept(c($$0, mf.a($$1)));
   }

   private void a(cut $$0, lr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cut $$0, lr.e $$1, mi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cut $$0, lr.e $$1) {
      mi $$2 = mi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cut $$0, lr.e $$1, mi $$2) {
      agg $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cut $$0, lr.e $$1, dhz<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         ly $$4 = ly.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mi $$5 = mi.c(mi.a($$0, $$4x));
            agg $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return ma.a().a(mb.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(lx.a($$0).a($$4));
      }
   }

   private void a(cut $$0, cut $$1, lr.e $$2) {
      this.a($$0, $$2);
      mi $$3 = mi.d($$0);
      agg $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(cut $$0, cut $$1) {
      mk $$2 = mk.o.get($$0);
      agg $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      agg $$4 = mh.aA.a($$1, $$2.b(), this.c);
      this.b.accept(lx.a($$1, ma.a().a(mb.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(cut $$0, cut $$1) {
      this.a($$0.k());
      mi $$2 = mi.h($$0);
      mi $$3 = mi.a($$0, $$1);
      agg $$4 = mh.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            lx.a($$1, ma.a().a(mb.c, $$4))
               .a(ly.a(dhm.R).a(hx.e, ma.a()).a(hx.d, ma.a().a(mb.b, mb.a.d)).a(hx.c, ma.a().a(mb.b, mb.a.b)).a(hx.f, ma.a().a(mb.b, mb.a.c)))
         );
      this.b.accept(lx.a($$0).a(ly.a(dhm.av).a($$2x -> ma.a().a(mb.c, mh.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cut $$0 = cuv.kC;
      this.a($$0.k());
      agg $$1 = mf.a($$0, "_top");
      agg $$2 = mf.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cut $$0 = cuv.kB;
      this.a($$0.k());
      ly $$1 = ly.a(dah.d, dhm.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> ma.a().a(mb.c, mf.a($$0, "_top_stage_" + $$1x));
            case b -> ma.a().a(mb.c, mf.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(lx.a($$0).a($$1));
   }

   private void a(cut $$0, cut $$1, cut $$2, cut $$3, cut $$4, cut $$5, cut $$6, cut $$7) {
      this.a($$0, lr.e.b);
      this.a($$1, lr.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(cut $$0, lr.e $$1) {
      this.a($$0, "_top");
      agg $$2 = this.a($$0, "_top", $$1.a(), mi::c);
      agg $$3 = this.a($$0, "_bottom", $$1.a(), mi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cuv.iD, "_front");
      agg $$0 = mf.a(cuv.iD, "_top");
      agg $$1 = this.a(cuv.iD, "_bottom", lr.e.b.a(), mi::c);
      this.f(cuv.iD, $$0, $$1);
   }

   private void k() {
      agg $$0 = this.a(cuv.bx, "_top", mh.bi, mi::a);
      agg $$1 = this.a(cuv.bx, "_bottom", mh.bi, mi::a);
      this.f(cuv.bx, $$0, $$1);
   }

   private void l() {
      this.c(cuv.rE);
      agg $$0 = mf.a(cuv.rE, "_top");
      agg $$1 = mf.a(cuv.rE, "_bottom");
      this.b.accept(lx.a(cuv.rE).a(b()).a(ly.a(dhm.ae).a(dhs.b, ma.a().a(mb.c, $$1)).a(dhs.a, ma.a().a(mb.c, $$0))));
   }

   private void f(cut $$0, agg $$1, agg $$2) {
      this.b.accept(lx.a($$0).a(ly.a(dhm.ae).a(dhs.b, ma.a().a(mb.c, $$2)).a(dhs.a, ma.a().a(mb.c, $$1))));
   }

   private void n(cut $$0) {
      mi $$1 = mi.e($$0);
      mi $$2 = mi.e(mi.a($$0, "_corner"));
      agg $$3 = mh.aq.a($$0, $$1, this.c);
      agg $$4 = mh.ar.a($$0, $$2, this.c);
      agg $$5 = mh.as.a($$0, $$1, this.c);
      agg $$6 = mh.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            lx.a($$0)
               .a(
                  ly.a(dhm.ag)
                     .a(dia.a, ma.a().a(mb.c, $$3))
                     .a(dia.b, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
                     .a(dia.c, ma.a().a(mb.c, $$5).a(mb.b, mb.a.b))
                     .a(dia.d, ma.a().a(mb.c, $$6).a(mb.b, mb.a.b))
                     .a(dia.e, ma.a().a(mb.c, $$5))
                     .a(dia.f, ma.a().a(mb.c, $$6))
                     .a(dia.g, ma.a().a(mb.c, $$4))
                     .a(dia.h, ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
                     .a(dia.i, ma.a().a(mb.c, $$4).a(mb.b, mb.a.c))
                     .a(dia.j, ma.a().a(mb.c, $$4).a(mb.b, mb.a.d))
               )
         );
   }

   private void o(cut $$0) {
      agg $$1 = this.a($$0, "", mh.aq, mi::e);
      agg $$2 = this.a($$0, "", mh.as, mi::e);
      agg $$3 = this.a($$0, "", mh.at, mi::e);
      agg $$4 = this.a($$0, "_on", mh.aq, mi::e);
      agg $$5 = this.a($$0, "_on", mh.as, mi::e);
      agg $$6 = this.a($$0, "_on", mh.at, mi::e);
      ly $$7 = ly.a(dhm.w, dhm.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return ma.a().a(mb.c, $$6x ? $$4 : $$1);
            case b:
               return ma.a().a(mb.c, $$6x ? $$4 : $$1).a(mb.b, mb.a.b);
            case c:
               return ma.a().a(mb.c, $$6x ? $$5 : $$2).a(mb.b, mb.a.b);
            case d:
               return ma.a().a(mb.c, $$6x ? $$6 : $$3).a(mb.b, mb.a.b);
            case e:
               return ma.a().a(mb.c, $$6x ? $$5 : $$2);
            case f:
               return ma.a().a(mb.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(lx.a($$0).a($$7));
   }

   private lr.a a(agg $$0, cut $$1) {
      return new lr.a($$0, $$1);
   }

   private lr.a d(cut $$0, cut $$1) {
      return new lr.a(mf.a($$0), $$1);
   }

   private void a(cut $$0, ckw $$1) {
      agg $$2 = mh.Y.a($$0, mi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cut $$0, agg $$1) {
      agg $$2 = mh.Y.a($$0, mi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(cut $$0, cut $$1) {
      this.a($$0);
      agg $$2 = mk.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cut $$0) {
      this.a($$0.k());
      agg $$1 = mk.j.create($$0, this.c);
      agg $$2 = mk.k.create($$0, this.c);
      agg $$3 = mk.l.create($$0, this.c);
      agg $$4 = mk.m.create($$0, this.c);
      this.b
         .accept(
            lw.a($$0)
               .a(lv.a().a(dhm.S, 1, 2, 3, 4).a(dhm.R, hx.c), ma.a().a(mb.c, $$1))
               .a(lv.a().a(dhm.S, 1, 2, 3, 4).a(dhm.R, hx.f), ma.a().a(mb.c, $$1).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.S, 1, 2, 3, 4).a(dhm.R, hx.d), ma.a().a(mb.c, $$1).a(mb.b, mb.a.c))
               .a(lv.a().a(dhm.S, 1, 2, 3, 4).a(dhm.R, hx.e), ma.a().a(mb.c, $$1).a(mb.b, mb.a.d))
               .a(lv.a().a(dhm.S, 2, 3, 4).a(dhm.R, hx.c), ma.a().a(mb.c, $$2))
               .a(lv.a().a(dhm.S, 2, 3, 4).a(dhm.R, hx.f), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.S, 2, 3, 4).a(dhm.R, hx.d), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c))
               .a(lv.a().a(dhm.S, 2, 3, 4).a(dhm.R, hx.e), ma.a().a(mb.c, $$2).a(mb.b, mb.a.d))
               .a(lv.a().a(dhm.S, 3, 4).a(dhm.R, hx.c), ma.a().a(mb.c, $$3))
               .a(lv.a().a(dhm.S, 3, 4).a(dhm.R, hx.f), ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.S, 3, 4).a(dhm.R, hx.d), ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               .a(lv.a().a(dhm.S, 3, 4).a(dhm.R, hx.e), ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
               .a(lv.a().a(dhm.S, 4).a(dhm.R, hx.c), ma.a().a(mb.c, $$4))
               .a(lv.a().a(dhm.S, 4).a(dhm.R, hx.f), ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.S, 4).a(dhm.R, hx.d), ma.a().a(mb.c, $$4).a(mb.b, mb.a.c))
               .a(lv.a().a(dhm.S, 4).a(dhm.R, hx.e), ma.a().a(mb.c, $$4).a(mb.b, mb.a.d))
         );
   }

   private void a(mk.a $$0, cut... $$1) {
      for (cut $$2 : $$1) {
         agg $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(mk.a $$0, cut... $$1) {
      for (cut $$2 : $$1) {
         agg $$3 = $$0.create($$2, this.c);
         this.b.accept(lx.a($$2, ma.a().a(mb.c, $$3)).a(c()));
      }
   }

   private void f(cut $$0, cut $$1) {
      this.a($$0);
      mi $$2 = mi.b($$0, $$1);
      agg $$3 = mh.aG.a($$1, $$2, this.c);
      agg $$4 = mh.aH.a($$1, $$2, this.c);
      agg $$5 = mh.aI.a($$1, $$2, this.c);
      agg $$6 = mh.aE.a($$1, $$2, this.c);
      agg $$7 = mh.aF.a($$1, $$2, this.c);
      ckw $$8 = $$1.k();
      mh.bv.a(mf.a($$8), mi.F($$0), this.c);
      this.b
         .accept(
            lw.a($$1)
               .a(ma.a().a(mb.c, $$3))
               .a(lv.a().a(dhm.L, true), ma.a().a(mb.c, $$4))
               .a(lv.a().a(dhm.M, true), ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.N, true), ma.a().a(mb.c, $$5))
               .a(lv.a().a(dhm.O, true), ma.a().a(mb.c, $$5).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.L, false), ma.a().a(mb.c, $$6))
               .a(lv.a().a(dhm.M, false), ma.a().a(mb.c, $$7))
               .a(lv.a().a(dhm.N, false), ma.a().a(mb.c, $$7).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.O, false), ma.a().a(mb.c, $$6).a(mb.b, mb.a.d))
         );
   }

   private void q(cut $$0) {
      mi $$1 = mi.z($$0);
      agg $$2 = mh.aJ.a($$0, $$1, this.c);
      agg $$3 = this.a($$0, "_conditional", mh.aJ, $$1x -> $$1.c(mj.i, $$1x));
      this.b.accept(lx.a($$0).a(a(dhm.c, $$3, $$2)).a(e()));
   }

   private void r(cut $$0) {
      agg $$1 = mk.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<ma> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> ma.a().a(mb.c, mf.a(cuv.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cuv.mZ);
      this.b
         .accept(
            lw.a(cuv.mZ)
               .a(lv.a().a(dhm.aq, 0), this.a(0))
               .a(lv.a().a(dhm.aq, 1), this.a(1))
               .a(lv.a().a(dhm.bk, dhi.b), ma.a().a(mb.c, mf.a(cuv.mZ, "_small_leaves")))
               .a(lv.a().a(dhm.bk, dhi.c), ma.a().a(mb.c, mf.a(cuv.mZ, "_large_leaves")))
         );
   }

   private ly n() {
      return ly.a(dhm.P)
         .a(hx.a, ma.a().a(mb.a, mb.a.c))
         .a(hx.b, ma.a())
         .a(hx.c, ma.a().a(mb.a, mb.a.b))
         .a(hx.d, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.c))
         .a(hx.e, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.d))
         .a(hx.f, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.b));
   }

   private void o() {
      agg $$0 = mi.a(cuv.nU, "_top_open");
      this.b
         .accept(
            lx.a(cuv.nU)
               .a(this.n())
               .a(
                  ly.a(dhm.u)
                     .a(false, ma.a().a(mb.c, mk.e.create(cuv.nU, this.c)))
                     .a(true, ma.a().a(mb.c, mk.e.get(cuv.nU).a($$1 -> $$1.a(mj.f, $$0)).a(cuv.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ly a(dhz<T> $$0, T $$1, agg $$2, agg $$3) {
      ma $$4 = ma.a().a(mb.c, $$2);
      ma $$5 = ma.a().a(mb.c, $$3);
      return ly.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cut $$0, Function<cut, mi> $$1) {
      mi $$2 = $$1.apply($$0).b(mj.i, mj.c);
      mi $$3 = $$2.c(mj.g, mi.a($$0, "_front_honey"));
      agg $$4 = mh.o.a($$0, $$2, this.c);
      agg $$5 = mh.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(lx.a($$0).a(b()).a(a(dhm.aN, 5, $$5, $$4)));
   }

   private void a(cut $$0, dhz<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<agg> $$3 = new Int2ObjectOpenHashMap();
         ly $$4 = ly.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            agg $$5 = (agg)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mh.aT, mi::g));
            return ma.a().a(mb.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(lx.a($$0).a($$4));
      }
   }

   private void p() {
      agg $$0 = mf.a(cuv.od, "_floor");
      agg $$1 = mf.a(cuv.od, "_ceiling");
      agg $$2 = mf.a(cuv.od, "_wall");
      agg $$3 = mf.a(cuv.od, "_between_walls");
      this.a(cle.vt);
      this.b
         .accept(
            lx.a(cuv.od)
               .a(
                  ly.a(dhm.R, dhm.V)
                     .a(hx.c, dhk.a, ma.a().a(mb.c, $$0))
                     .a(hx.d, dhk.a, ma.a().a(mb.c, $$0).a(mb.b, mb.a.c))
                     .a(hx.f, dhk.a, ma.a().a(mb.c, $$0).a(mb.b, mb.a.b))
                     .a(hx.e, dhk.a, ma.a().a(mb.c, $$0).a(mb.b, mb.a.d))
                     .a(hx.c, dhk.b, ma.a().a(mb.c, $$1))
                     .a(hx.d, dhk.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c))
                     .a(hx.f, dhk.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b))
                     .a(hx.e, dhk.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d))
                     .a(hx.c, dhk.c, ma.a().a(mb.c, $$2).a(mb.b, mb.a.d))
                     .a(hx.d, dhk.c, ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
                     .a(hx.f, dhk.c, ma.a().a(mb.c, $$2))
                     .a(hx.e, dhk.c, ma.a().a(mb.c, $$2).a(mb.b, mb.a.c))
                     .a(hx.d, dhk.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
                     .a(hx.c, dhk.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
                     .a(hx.f, dhk.d, ma.a().a(mb.c, $$3))
                     .a(hx.e, dhk.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            lx.a(cuv.nZ, ma.a().a(mb.c, mf.a(cuv.nZ)))
               .a(
                  ly.a(dhm.U, dhm.R)
                     .a(dhh.a, hx.c, ma.a())
                     .a(dhh.a, hx.f, ma.a().a(mb.b, mb.a.b))
                     .a(dhh.a, hx.d, ma.a().a(mb.b, mb.a.c))
                     .a(dhh.a, hx.e, ma.a().a(mb.b, mb.a.d))
                     .a(dhh.b, hx.c, ma.a().a(mb.a, mb.a.b))
                     .a(dhh.b, hx.f, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.b))
                     .a(dhh.b, hx.d, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.c))
                     .a(dhh.b, hx.e, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.d))
                     .a(dhh.c, hx.d, ma.a().a(mb.a, mb.a.c))
                     .a(dhh.c, hx.e, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.b))
                     .a(dhh.c, hx.c, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.c))
                     .a(dhh.c, hx.f, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.d))
               )
         );
   }

   private void d(cut $$0, mk.a $$1) {
      agg $$2 = $$1.create($$0, this.c);
      agg $$3 = mi.a($$0, "_front_on");
      agg $$4 = $$1.get($$0).a($$1x -> $$1x.a(mj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(lx.a($$0).a(a(dhm.r, $$4, $$2)).a(b()));
   }

   private void a(cut... $$0) {
      agg $$1 = mf.a("campfire_off");

      for (cut $$2 : $$0) {
         agg $$3 = mh.ba.a($$2, mi.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(lx.a($$2).a(a(dhm.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cut $$0) {
      agg $$1 = mh.br.a($$0, mi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cut $$0) {
      agg $$1;
      if ($$0 == cuv.si) {
         $$1 = mh.bt.a($$0, mi.m($$0), this.c);
      } else {
         $$1 = mh.bs.a($$0, mi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mi $$0 = mi.a(mi.G(cuv.cl), mi.G(cuv.n));
      agg $$1 = mh.i.a(cuv.cl, $$0, this.c);
      this.b.accept(c(cuv.cl, $$1));
   }

   private void s() {
      this.a(cle.ll);
      this.b
         .accept(
            lw.a(cuv.cw)
               .a(
                  lv.b(
                     lv.a().a(dhm.ab, dib.c).a(dhm.aa, dib.c).a(dhm.ac, dib.c).a(dhm.ad, dib.c),
                     lv.a().a(dhm.ab, dib.b, dib.a).a(dhm.aa, dib.b, dib.a),
                     lv.a().a(dhm.aa, dib.b, dib.a).a(dhm.ac, dib.b, dib.a),
                     lv.a().a(dhm.ac, dib.b, dib.a).a(dhm.ad, dib.b, dib.a),
                     lv.a().a(dhm.ad, dib.b, dib.a).a(dhm.ab, dib.b, dib.a)
                  ),
                  ma.a().a(mb.c, mf.a("redstone_dust_dot"))
               )
               .a(lv.a().a(dhm.ab, dib.b, dib.a), ma.a().a(mb.c, mf.a("redstone_dust_side0")))
               .a(lv.a().a(dhm.ac, dib.b, dib.a), ma.a().a(mb.c, mf.a("redstone_dust_side_alt0")))
               .a(lv.a().a(dhm.aa, dib.b, dib.a), ma.a().a(mb.c, mf.a("redstone_dust_side_alt1")).a(mb.b, mb.a.d))
               .a(lv.a().a(dhm.ad, dib.b, dib.a), ma.a().a(mb.c, mf.a("redstone_dust_side1")).a(mb.b, mb.a.d))
               .a(lv.a().a(dhm.ab, dib.a), ma.a().a(mb.c, mf.a("redstone_dust_up")))
               .a(lv.a().a(dhm.aa, dib.a), ma.a().a(mb.c, mf.a("redstone_dust_up")).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.ac, dib.a), ma.a().a(mb.c, mf.a("redstone_dust_up")).a(mb.b, mb.a.c))
               .a(lv.a().a(dhm.ad, dib.a), ma.a().a(mb.c, mf.a("redstone_dust_up")).a(mb.b, mb.a.d))
         );
   }

   private void t() {
      this.a(cle.lp);
      this.b
         .accept(
            lx.a(cuv.gY)
               .a(c())
               .a(
                  ly.a(dhm.bd, dhm.w)
                     .a(dhp.a, false, ma.a().a(mb.c, mf.a(cuv.gY)))
                     .a(dhp.a, true, ma.a().a(mb.c, mf.a(cuv.gY, "_on")))
                     .a(dhp.b, false, ma.a().a(mb.c, mf.a(cuv.gY, "_subtract")))
                     .a(dhp.b, true, ma.a().a(mb.c, mf.a(cuv.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mi $$0 = mi.a(cuv.jR);
      mi $$1 = mi.a(mi.a(cuv.jE, "_side"), $$0.a(mj.f));
      agg $$2 = mh.Z.a(cuv.jE, $$1, this.c);
      agg $$3 = mh.aa.a(cuv.jE, $$1, this.c);
      agg $$4 = mh.i.b(cuv.jE, "_double", $$1, this.c);
      this.b.accept(e(cuv.jE, $$2, $$3, $$4));
      this.b.accept(c(cuv.jR, mh.c.a(cuv.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cle.rC);
      this.b
         .accept(
            lw.a(cuv.fs)
               .a(ma.a().a(mb.c, mi.G(cuv.fs)))
               .a(lv.a().a(dhm.k, true), ma.a().a(mb.c, mi.a(cuv.fs, "_bottle0")))
               .a(lv.a().a(dhm.l, true), ma.a().a(mb.c, mi.a(cuv.fs, "_bottle1")))
               .a(lv.a().a(dhm.m, true), ma.a().a(mb.c, mi.a(cuv.fs, "_bottle2")))
               .a(lv.a().a(dhm.k, false), ma.a().a(mb.c, mi.a(cuv.fs, "_empty0")))
               .a(lv.a().a(dhm.l, false), ma.a().a(mb.c, mi.a(cuv.fs, "_empty1")))
               .a(lv.a().a(dhm.m, false), ma.a().a(mb.c, mi.a(cuv.fs, "_empty2")))
         );
   }

   private void u(cut $$0) {
      agg $$1 = mh.bn.a($$0, mi.b($$0), this.c);
      agg $$2 = mf.a("mushroom_block_inside");
      this.b
         .accept(
            lw.a($$0)
               .a(lv.a().a(dhm.L, true), ma.a().a(mb.c, $$1))
               .a(lv.a().a(dhm.M, true), ma.a().a(mb.c, $$1).a(mb.b, mb.a.b).a(mb.d, true))
               .a(lv.a().a(dhm.N, true), ma.a().a(mb.c, $$1).a(mb.b, mb.a.c).a(mb.d, true))
               .a(lv.a().a(dhm.O, true), ma.a().a(mb.c, $$1).a(mb.b, mb.a.d).a(mb.d, true))
               .a(lv.a().a(dhm.J, true), ma.a().a(mb.c, $$1).a(mb.a, mb.a.d).a(mb.d, true))
               .a(lv.a().a(dhm.K, true), ma.a().a(mb.c, $$1).a(mb.a, mb.a.b).a(mb.d, true))
               .a(lv.a().a(dhm.L, false), ma.a().a(mb.c, $$2))
               .a(lv.a().a(dhm.M, false), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, false))
               .a(lv.a().a(dhm.N, false), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, false))
               .a(lv.a().a(dhm.O, false), ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, false))
               .a(lv.a().a(dhm.J, false), ma.a().a(mb.c, $$2).a(mb.a, mb.a.d).a(mb.d, false))
               .a(lv.a().a(dhm.K, false), ma.a().a(mb.c, $$2).a(mb.a, mb.a.b).a(mb.d, false))
         );
      this.a($$0, mk.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cle.qN);
      this.b
         .accept(
            lx.a(cuv.eg)
               .a(
                  ly.a(dhm.ay)
                     .a(0, ma.a().a(mb.c, mf.a(cuv.eg)))
                     .a(1, ma.a().a(mb.c, mf.a(cuv.eg, "_slice1")))
                     .a(2, ma.a().a(mb.c, mf.a(cuv.eg, "_slice2")))
                     .a(3, ma.a().a(mb.c, mf.a(cuv.eg, "_slice3")))
                     .a(4, ma.a().a(mb.c, mf.a(cuv.eg, "_slice4")))
                     .a(5, ma.a().a(mb.c, mf.a(cuv.eg, "_slice5")))
                     .a(6, ma.a().a(mb.c, mf.a(cuv.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mi $$0 = new mi()
         .a(mj.c, mi.a(cuv.nX, "_side3"))
         .a(mj.o, mi.G(cuv.t))
         .a(mj.n, mi.a(cuv.nX, "_top"))
         .a(mj.j, mi.a(cuv.nX, "_side3"))
         .a(mj.l, mi.a(cuv.nX, "_side3"))
         .a(mj.k, mi.a(cuv.nX, "_side1"))
         .a(mj.m, mi.a(cuv.nX, "_side2"));
      this.b.accept(c(cuv.nX, mh.a.a(cuv.nX, $$0, this.c)));
   }

   private void y() {
      mi $$0 = new mi()
         .a(mj.c, mi.a(cuv.ob, "_front"))
         .a(mj.o, mi.a(cuv.ob, "_bottom"))
         .a(mj.n, mi.a(cuv.ob, "_top"))
         .a(mj.j, mi.a(cuv.ob, "_front"))
         .a(mj.k, mi.a(cuv.ob, "_front"))
         .a(mj.l, mi.a(cuv.ob, "_side"))
         .a(mj.m, mi.a(cuv.ob, "_side"));
      this.b.accept(c(cuv.ob, mh.a.a(cuv.ob, $$0, this.c)));
   }

   private void a(cut $$0, cut $$1, BiFunction<cut, cut, mi> $$2) {
      mi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mh.a.a($$0, $$3, this.c)));
   }

   public void b(cut $$0) {
      mi $$1 = new mi()
         .a(mj.c, mi.a($$0, "_particle"))
         .a(mj.o, mi.a($$0, "_down"))
         .a(mj.n, mi.a($$0, "_up"))
         .a(mj.j, mi.a($$0, "_north"))
         .a(mj.k, mi.a($$0, "_south"))
         .a(mj.l, mi.a($$0, "_east"))
         .a(mj.m, mi.a($$0, "_west"));
      this.b.accept(c($$0, mh.a.a($$0, $$1, this.c)));
   }

   private void z() {
      mi $$0 = mi.k(cuv.eZ);
      this.b.accept(c(cuv.eZ, mf.a(cuv.eZ)));
      this.a(cuv.ee, $$0);
      this.a(cuv.ef, $$0);
   }

   private void a(cut $$0, mi $$1) {
      agg $$2 = mh.n.a($$0, $$1.c(mj.g, mi.G($$0)), this.c);
      this.b.accept(lx.a($$0, ma.a().a(mb.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cle.rD);
      this.m(cuv.ft);
      this.b.accept(c(cuv.fv, mh.bq.a(cuv.fv, mi.j(mi.a(cuv.H, "_still")), this.c)));
      this.b
         .accept(
            lx.a(cuv.fu)
               .a(
                  ly.a(czb.g)
                     .a(1, ma.a().a(mb.c, mh.bo.a(cuv.fu, "_level1", mi.j(mi.a(cuv.G, "_still")), this.c)))
                     .a(2, ma.a().a(mb.c, mh.bp.a(cuv.fu, "_level2", mi.j(mi.a(cuv.G, "_still")), this.c)))
                     .a(3, ma.a().a(mb.c, mh.bq.a(cuv.fu, "_full", mi.j(mi.a(cuv.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            lx.a(cuv.fw)
               .a(
                  ly.a(czb.g)
                     .a(1, ma.a().a(mb.c, mh.bo.a(cuv.fw, "_level1", mi.j(mi.G(cuv.qC)), this.c)))
                     .a(2, ma.a().a(mb.c, mh.bp.a(cuv.fw, "_level2", mi.j(mi.G(cuv.qC)), this.c)))
                     .a(3, ma.a().a(mb.c, mh.bq.a(cuv.fw, "_full", mi.j(mi.G(cuv.qC)), this.c)))
               )
         );
   }

   private void B() {
      mi $$0 = mi.b(cuv.kv);
      agg $$1 = mh.aC.a(cuv.kv, $$0, this.c);
      agg $$2 = this.a(cuv.kv, "_dead", mh.aC, $$1x -> $$0.c(mj.b, $$1x));
      this.b.accept(lx.a(cuv.kv).a(a(dhm.au, 5, $$2, $$1)));
   }

   private void C() {
      agg $$0 = mf.a(cuv.sp);
      agg $$1 = mf.a(cuv.sp, "_triggered");
      agg $$2 = mf.a(cuv.sp, "_crafting");
      agg $$3 = mf.a(cuv.sp, "_crafting_triggered");
      this.b
         .accept(
            lx.a(cuv.sp)
               .a(ly.a(dhm.T).a($$0x -> this.a($$0x, ma.a())))
               .a(
                  ly.a(dhm.A, cwl.b)
                     .a(false, false, ma.a().a(mb.c, $$0))
                     .a(true, true, ma.a().a(mb.c, $$3))
                     .a(true, false, ma.a().a(mb.c, $$1))
                     .a(false, true, ma.a().a(mb.c, $$2))
               )
         );
   }

   private void v(cut $$0) {
      mi $$1 = new mi().a(mj.f, mi.a(cuv.cD, "_top")).a(mj.i, mi.a(cuv.cD, "_side")).a(mj.g, mi.a($$0, "_front"));
      mi $$2 = new mi().a(mj.i, mi.a(cuv.cD, "_top")).a(mj.g, mi.a($$0, "_front_vertical"));
      agg $$3 = mh.n.a($$0, $$1, this.c);
      agg $$4 = mh.p.a($$0, $$2, this.c);
      this.b
         .accept(
            lx.a($$0)
               .a(
                  ly.a(dhm.P)
                     .a(hx.a, ma.a().a(mb.c, $$4).a(mb.a, mb.a.c))
                     .a(hx.b, ma.a().a(mb.c, $$4))
                     .a(hx.c, ma.a().a(mb.c, $$3))
                     .a(hx.f, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
                     .a(hx.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
                     .a(hx.e, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
               )
         );
   }

   private void D() {
      agg $$0 = mf.a(cuv.fy);
      agg $$1 = mf.a(cuv.fy, "_filled");
      this.b.accept(lx.a(cuv.fy).a(ly.a(dhm.h).a(false, ma.a().a(mb.c, $$0)).a(true, ma.a().a(mb.c, $$1))).a(c()));
   }

   private void E() {
      agg $$0 = mf.a(cuv.ku, "_side");
      agg $$1 = mf.a(cuv.ku, "_noside");
      agg $$2 = mf.a(cuv.ku, "_noside1");
      agg $$3 = mf.a(cuv.ku, "_noside2");
      agg $$4 = mf.a(cuv.ku, "_noside3");
      this.b
         .accept(
            lw.a(cuv.ku)
               .a(lv.a().a(dhm.L, true), ma.a().a(mb.c, $$0))
               .a(lv.a().a(dhm.M, true), ma.a().a(mb.c, $$0).a(mb.b, mb.a.b).a(mb.d, true))
               .a(lv.a().a(dhm.N, true), ma.a().a(mb.c, $$0).a(mb.b, mb.a.c).a(mb.d, true))
               .a(lv.a().a(dhm.O, true), ma.a().a(mb.c, $$0).a(mb.b, mb.a.d).a(mb.d, true))
               .a(lv.a().a(dhm.J, true), ma.a().a(mb.c, $$0).a(mb.a, mb.a.d).a(mb.d, true))
               .a(lv.a().a(dhm.K, true), ma.a().a(mb.c, $$0).a(mb.a, mb.a.b).a(mb.d, true))
               .a(lv.a().a(dhm.L, false), ma.a().a(mb.c, $$1).a(mb.e, 2), ma.a().a(mb.c, $$2), ma.a().a(mb.c, $$3), ma.a().a(mb.c, $$4))
               .a(
                  lv.a().a(dhm.M, false),
                  ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, true),
                  ma.a().a(mb.c, $$3).a(mb.b, mb.a.b).a(mb.d, true),
                  ma.a().a(mb.c, $$4).a(mb.b, mb.a.b).a(mb.d, true),
                  ma.a().a(mb.c, $$1).a(mb.e, 2).a(mb.b, mb.a.b).a(mb.d, true)
               )
               .a(
                  lv.a().a(dhm.N, false),
                  ma.a().a(mb.c, $$3).a(mb.b, mb.a.c).a(mb.d, true),
                  ma.a().a(mb.c, $$4).a(mb.b, mb.a.c).a(mb.d, true),
                  ma.a().a(mb.c, $$1).a(mb.e, 2).a(mb.b, mb.a.c).a(mb.d, true),
                  ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, true)
               )
               .a(
                  lv.a().a(dhm.O, false),
                  ma.a().a(mb.c, $$4).a(mb.b, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$1).a(mb.e, 2).a(mb.b, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$3).a(mb.b, mb.a.d).a(mb.d, true)
               )
               .a(
                  lv.a().a(dhm.J, false),
                  ma.a().a(mb.c, $$1).a(mb.e, 2).a(mb.a, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$4).a(mb.a, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$2).a(mb.a, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$3).a(mb.a, mb.a.d).a(mb.d, true)
               )
               .a(
                  lv.a().a(dhm.K, false),
                  ma.a().a(mb.c, $$4).a(mb.a, mb.a.b).a(mb.d, true),
                  ma.a().a(mb.c, $$3).a(mb.a, mb.a.b).a(mb.d, true),
                  ma.a().a(mb.c, $$2).a(mb.a, mb.a.b).a(mb.d, true),
                  ma.a().a(mb.c, $$1).a(mb.e, 2).a(mb.a, mb.a.b).a(mb.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            lw.a(cuv.pc)
               .a(ma.a().a(mb.c, mi.G(cuv.pc)))
               .a(lv.a().a(dhm.aL, 1), ma.a().a(mb.c, mi.a(cuv.pc, "_contents1")))
               .a(lv.a().a(dhm.aL, 2), ma.a().a(mb.c, mi.a(cuv.pc, "_contents2")))
               .a(lv.a().a(dhm.aL, 3), ma.a().a(mb.c, mi.a(cuv.pc, "_contents3")))
               .a(lv.a().a(dhm.aL, 4), ma.a().a(mb.c, mi.a(cuv.pc, "_contents4")))
               .a(lv.a().a(dhm.aL, 5), ma.a().a(mb.c, mi.a(cuv.pc, "_contents5")))
               .a(lv.a().a(dhm.aL, 6), ma.a().a(mb.c, mi.a(cuv.pc, "_contents6")))
               .a(lv.a().a(dhm.aL, 7), ma.a().a(mb.c, mi.a(cuv.pc, "_contents7")))
               .a(lv.a().a(dhm.aL, 8), ma.a().a(mb.c, mi.a(cuv.pc, "_contents_ready")))
         );
   }

   private void w(cut $$0) {
      this.c($$0);
      this.b.accept(lx.a($$0, ma.a().a(mb.c, mh.am.a($$0, mi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.w(cuv.qy);
      this.w(cuv.qx);
      this.w(cuv.qw);
      this.w(cuv.qv);
   }

   private void H() {
      this.c(cuv.rs);
      ly.b<hx, dht> $$0 = ly.a(dhm.bm, dhm.bn);

      for (dht $$1 : dht.values()) {
         $$0.a(hx.b, $$1, this.a(hx.b, $$1));
      }

      for (dht $$2 : dht.values()) {
         $$0.a(hx.a, $$2, this.a(hx.a, $$2));
      }

      this.b.accept(lx.a(cuv.rs).a($$0));
   }

   private ma a(hx $$0, dht $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mi $$3 = mi.c(mi.a(cuv.rs, $$2));
      return ma.a().a(mb.c, mh.al.a(cuv.rs, $$2, $$3, this.c));
   }

   private void x(cut $$0) {
      mi $$1 = new mi().a(mj.e, mi.G(cuv.dV)).a(mj.f, mi.G($$0)).a(mj.i, mi.a($$0, "_side"));
      this.b.accept(c($$0, mh.m.a($$0, $$1, this.c)));
   }

   private void I() {
      agg $$0 = mi.a(cuv.gZ, "_side");
      mi $$1 = new mi().a(mj.f, mi.a(cuv.gZ, "_top")).a(mj.i, $$0);
      mi $$2 = new mi().a(mj.f, mi.a(cuv.gZ, "_inverted_top")).a(mj.i, $$0);
      this.b
         .accept(
            lx.a(cuv.gZ)
               .a(ly.a(dhm.p).a(false, ma.a().a(mb.c, mh.aD.a(cuv.gZ, $$1, this.c))).a(true, ma.a().a(mb.c, mh.aD.a(mf.a(cuv.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(cut $$0) {
      this.b.accept(lx.a($$0, ma.a().a(mb.c, mf.a($$0))).a(this.n()));
   }

   private void J() {
      cut $$0 = cuv.rr;
      agg $$1 = mf.a($$0, "_on");
      agg $$2 = mf.a($$0);
      this.b.accept(lx.a($$0, ma.a().a(mb.c, mf.a($$0))).a(this.n()).a(a(dhm.w, $$1, $$2)));
   }

   private void K() {
      mi $$0 = new mi().a(mj.B, mi.G(cuv.j)).a(mj.f, mi.G(cuv.cC));
      mi $$1 = new mi().a(mj.B, mi.G(cuv.j)).a(mj.f, mi.a(cuv.cC, "_moist"));
      agg $$2 = mh.aU.a(cuv.cC, $$0, this.c);
      agg $$3 = mh.aU.a(mi.a(cuv.cC, "_moist"), $$1, this.c);
      this.b.accept(lx.a(cuv.cC).a(a(dhm.aQ, 7, $$3, $$2)));
   }

   private List<agg> z(cut $$0) {
      agg $$1 = mh.aV.a(mf.a($$0, "_floor0"), mi.v($$0), this.c);
      agg $$2 = mh.aV.a(mf.a($$0, "_floor1"), mi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<agg> A(cut $$0) {
      agg $$1 = mh.aW.a(mf.a($$0, "_side0"), mi.v($$0), this.c);
      agg $$2 = mh.aW.a(mf.a($$0, "_side1"), mi.w($$0), this.c);
      agg $$3 = mh.aX.a(mf.a($$0, "_side_alt0"), mi.v($$0), this.c);
      agg $$4 = mh.aX.a(mf.a($$0, "_side_alt1"), mi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<agg> B(cut $$0) {
      agg $$1 = mh.aY.a(mf.a($$0, "_up0"), mi.v($$0), this.c);
      agg $$2 = mh.aY.a(mf.a($$0, "_up1"), mi.w($$0), this.c);
      agg $$3 = mh.aZ.a(mf.a($$0, "_up_alt0"), mi.v($$0), this.c);
      agg $$4 = mh.aZ.a(mf.a($$0, "_up_alt1"), mi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<ma> a(List<agg> $$0, UnaryOperator<ma> $$1) {
      return $$0.stream().map($$0x -> ma.a().a(mb.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      lv $$0 = lv.a().a(dhm.L, false).a(dhm.M, false).a(dhm.N, false).a(dhm.O, false).a(dhm.J, false);
      List<agg> $$1 = this.z(cuv.cr);
      List<agg> $$2 = this.A(cuv.cr);
      List<agg> $$3 = this.B(cuv.cr);
      this.b
         .accept(
            lw.a(cuv.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(lv.b(lv.a().a(dhm.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(lv.b(lv.a().a(dhm.M, true), $$0), a($$2, $$0x -> $$0x.a(mb.b, mb.a.b)))
               .a(lv.b(lv.a().a(dhm.N, true), $$0), a($$2, $$0x -> $$0x.a(mb.b, mb.a.c)))
               .a(lv.b(lv.a().a(dhm.O, true), $$0), a($$2, $$0x -> $$0x.a(mb.b, mb.a.d)))
               .a(lv.a().a(dhm.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<agg> $$0 = this.z(cuv.cs);
      List<agg> $$1 = this.A(cuv.cs);
      this.b
         .accept(
            lw.a(cuv.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mb.b, mb.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mb.b, mb.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mb.b, mb.a.d)))
         );
   }

   private void C(cut $$0) {
      agg $$1 = mk.s.create($$0, this.c);
      agg $$2 = mk.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(lx.a($$0).a(a(dhm.j, $$2, $$1)));
   }

   private void N() {
      mi $$0 = mi.a(mi.a(cuv.ad, "_side"), mi.a(cuv.ad, "_top"));
      agg $$1 = mh.i.a(cuv.ad, $$0, this.c);
      this.b.accept(d(cuv.ad, $$1));
   }

   private void O() {
      this.a(cle.Q);
      cut $$0 = cuv.E;
      ly.b<Boolean, Integer> $$1 = ly.a(czn.d, czn.b);
      agg $$2 = mf.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         agg $$4 = mf.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, ma.a().a(mb.c, $$4));
         $$1.a(false, $$3, ma.a().a(mb.c, $$2));
      }

      this.b.accept(lx.a(cuv.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            lx.a(cuv.kI)
               .a(
                  ly.a(dhm.as)
                     .a(0, ma.a().a(mb.c, this.a(cuv.kI, "_0", mh.c, mi::b)))
                     .a(1, ma.a().a(mb.c, this.a(cuv.kI, "_1", mh.c, mi::b)))
                     .a(2, ma.a().a(mb.c, this.a(cuv.kI, "_2", mh.c, mi::b)))
                     .a(3, ma.a().a(mb.c, this.a(cuv.kI, "_3", mh.c, mi::b)))
               )
         );
   }

   private void Q() {
      agg $$0 = mi.G(cuv.j);
      mi $$1 = new mi().a(mj.e, $$0).b(mj.e, mj.c).a(mj.f, mi.a(cuv.i, "_top")).a(mj.i, mi.a(cuv.i, "_snow"));
      ma $$2 = ma.a().a(mb.c, mh.m.a(cuv.i, "_snow", $$1, this.c));
      this.a(cuv.i, mf.a(cuv.i), $$2);
      agg $$3 = mk.e.get(cuv.fl).a($$1x -> $$1x.a(mj.e, $$0)).a(cuv.fl, this.c);
      this.a(cuv.fl, $$3, $$2);
      agg $$4 = mk.e.get(cuv.l).a($$1x -> $$1x.a(mj.e, $$0)).a(cuv.l, this.c);
      this.a(cuv.l, $$4, $$2);
   }

   private void a(cut $$0, agg $$1, ma $$2) {
      List<ma> $$3 = Arrays.asList(a($$1));
      this.b.accept(lx.a($$0).a(ly.a(dhm.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cle.qt);
      this.b
         .accept(
            lx.a(cuv.fC)
               .a(
                  ly.a(dhm.ar)
                     .a(0, ma.a().a(mb.c, mf.a(cuv.fC, "_stage0")))
                     .a(1, ma.a().a(mb.c, mf.a(cuv.fC, "_stage1")))
                     .a(2, ma.a().a(mb.c, mf.a(cuv.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cuv.kE, mf.a(cuv.kE)));
   }

   private void g(cut $$0, cut $$1) {
      mi $$2 = mi.b($$1);
      agg $$3 = mh.W.a($$0, $$2, this.c);
      agg $$4 = mh.X.a($$0, $$2, this.c);
      this.b.accept(lx.a($$0).a(a(dhm.aT, 1, $$4, $$3)));
   }

   private void T() {
      agg $$0 = mf.a(cuv.hc);
      agg $$1 = mf.a(cuv.hc, "_side");
      this.a(cle.lv);
      this.b
         .accept(
            lx.a(cuv.hc)
               .a(
                  ly.a(dhm.Q)
                     .a(hx.a, ma.a().a(mb.c, $$0))
                     .a(hx.c, ma.a().a(mb.c, $$1))
                     .a(hx.f, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b))
                     .a(hx.d, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c))
                     .a(hx.e, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d))
               )
         );
   }

   private void h(cut $$0, cut $$1) {
      agg $$2 = mf.a($$0);
      this.b.accept(lx.a($$1, ma.a().a(mb.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      agg $$0 = mf.a(cuv.eW, "_post_ends");
      agg $$1 = mf.a(cuv.eW, "_post");
      agg $$2 = mf.a(cuv.eW, "_cap");
      agg $$3 = mf.a(cuv.eW, "_cap_alt");
      agg $$4 = mf.a(cuv.eW, "_side");
      agg $$5 = mf.a(cuv.eW, "_side_alt");
      this.b
         .accept(
            lw.a(cuv.eW)
               .a(ma.a().a(mb.c, $$0))
               .a(lv.a().a(dhm.L, false).a(dhm.M, false).a(dhm.N, false).a(dhm.O, false), ma.a().a(mb.c, $$1))
               .a(lv.a().a(dhm.L, true).a(dhm.M, false).a(dhm.N, false).a(dhm.O, false), ma.a().a(mb.c, $$2))
               .a(lv.a().a(dhm.L, false).a(dhm.M, true).a(dhm.N, false).a(dhm.O, false), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.L, false).a(dhm.M, false).a(dhm.N, true).a(dhm.O, false), ma.a().a(mb.c, $$3))
               .a(lv.a().a(dhm.L, false).a(dhm.M, false).a(dhm.N, false).a(dhm.O, true), ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.L, true), ma.a().a(mb.c, $$4))
               .a(lv.a().a(dhm.M, true), ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
               .a(lv.a().a(dhm.N, true), ma.a().a(mb.c, $$5))
               .a(lv.a().a(dhm.O, true), ma.a().a(mb.c, $$5).a(mb.b, mb.a.b))
         );
      this.d(cuv.eW);
   }

   private void D(cut $$0) {
      this.b.accept(lx.a($$0, ma.a().a(mb.c, mf.a($$0))).a(b()));
   }

   private void V() {
      agg $$0 = mf.a(cuv.dw);
      agg $$1 = mf.a(cuv.dw, "_on");
      this.d(cuv.dw);
      this.b
         .accept(
            lx.a(cuv.dw)
               .a(a(dhm.w, $$0, $$1))
               .a(
                  ly.a(dhm.U, dhm.R)
                     .a(dhh.c, hx.c, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.c))
                     .a(dhh.c, hx.f, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.d))
                     .a(dhh.c, hx.d, ma.a().a(mb.a, mb.a.c))
                     .a(dhh.c, hx.e, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.b))
                     .a(dhh.a, hx.c, ma.a())
                     .a(dhh.a, hx.f, ma.a().a(mb.b, mb.a.b))
                     .a(dhh.a, hx.d, ma.a().a(mb.b, mb.a.c))
                     .a(dhh.a, hx.e, ma.a().a(mb.b, mb.a.d))
                     .a(dhh.b, hx.c, ma.a().a(mb.a, mb.a.b))
                     .a(dhh.b, hx.f, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.b))
                     .a(dhh.b, hx.d, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.c))
                     .a(dhh.b, hx.e, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.d))
               )
         );
   }

   private void W() {
      this.d(cuv.fm);
      this.b.accept(b(cuv.fm, mf.a(cuv.fm)));
   }

   private void X() {
      this.d(cuv.sm);
      this.b.accept(c(cuv.sm, mf.a(cuv.sm)));
   }

   private void Y() {
      this.b.accept(lx.a(cuv.ed).a(ly.a(dhm.H).a(hx.a.a, ma.a().a(mb.c, mf.a(cuv.ed, "_ns"))).a(hx.a.c, ma.a().a(mb.c, mf.a(cuv.ed, "_ew")))));
   }

   private void Z() {
      agg $$0 = mk.a.create(cuv.dV, this.c);
      this.b
         .accept(
            lx.a(
               cuv.dV,
               ma.a().a(mb.c, $$0),
               ma.a().a(mb.c, $$0).a(mb.a, mb.a.b),
               ma.a().a(mb.c, $$0).a(mb.a, mb.a.c),
               ma.a().a(mb.c, $$0).a(mb.a, mb.a.d),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.b),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.b).a(mb.a, mb.a.b),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.b).a(mb.a, mb.a.c),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.b).a(mb.a, mb.a.d),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.c),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.c).a(mb.a, mb.a.b),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.c).a(mb.a, mb.a.c),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.c).a(mb.a, mb.a.d),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.d),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.d).a(mb.a, mb.a.b),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.d).a(mb.a, mb.a.c),
               ma.a().a(mb.c, $$0).a(mb.b, mb.a.d).a(mb.a, mb.a.d)
            )
         );
   }

   private void aa() {
      agg $$0 = mf.a(cuv.kO);
      agg $$1 = mf.a(cuv.kO, "_on");
      this.b.accept(lx.a(cuv.kO).a(a(dhm.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mi $$0 = new mi().a(mj.e, mi.a(cuv.by, "_bottom")).a(mj.i, mi.a(cuv.by, "_side"));
      agg $$1 = mi.a(cuv.by, "_top_sticky");
      agg $$2 = mi.a(cuv.by, "_top");
      mi $$3 = $$0.c(mj.E, $$1);
      mi $$4 = $$0.c(mj.E, $$2);
      agg $$5 = mf.a(cuv.by, "_base");
      this.a(cuv.by, $$5, $$4);
      this.a(cuv.br, $$5, $$3);
      agg $$6 = mh.m.a(cuv.by, "_inventory", $$0.c(mj.f, $$2), this.c);
      agg $$7 = mh.m.a(cuv.br, "_inventory", $$0.c(mj.f, $$1), this.c);
      this.a(cuv.by, $$6);
      this.a(cuv.br, $$7);
   }

   private void a(cut $$0, agg $$1, mi $$2) {
      agg $$3 = mh.bf.a($$0, $$2, this.c);
      this.b.accept(lx.a($$0).a(a(dhm.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mi $$0 = new mi().a(mj.F, mi.a(cuv.by, "_top")).a(mj.i, mi.a(cuv.by, "_side"));
      mi $$1 = $$0.c(mj.E, mi.a(cuv.by, "_top_sticky"));
      mi $$2 = $$0.c(mj.E, mi.a(cuv.by, "_top"));
      this.b
         .accept(
            lx.a(cuv.bz)
               .a(
                  ly.a(dhm.x, dhm.bg)
                     .a(false, dhy.a, ma.a().a(mb.c, mh.bg.a(cuv.by, "_head", $$2, this.c)))
                     .a(false, dhy.b, ma.a().a(mb.c, mh.bg.a(cuv.by, "_head_sticky", $$1, this.c)))
                     .a(true, dhy.a, ma.a().a(mb.c, mh.bh.a(cuv.by, "_head_short", $$2, this.c)))
                     .a(true, dhy.b, ma.a().a(mb.c, mh.bh.a(cuv.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      agg $$0 = mf.a(cuv.qD, "_inactive");
      agg $$1 = mf.a(cuv.qD, "_active");
      this.a(cuv.qD, $$0);
      this.b.accept(lx.a(cuv.qD).a(ly.a(dhm.bo).a($$2 -> ma.a().a(mb.c, $$2 != did.b && $$2 != did.c ? $$0 : $$1))));
   }

   private void ae() {
      agg $$0 = mf.a(cuv.qE, "_inactive");
      agg $$1 = mf.a(cuv.qE, "_active");
      this.a(cuv.qE, $$0);
      this.b.accept(lx.a(cuv.qE).a(ly.a(dhm.bo).a($$2 -> ma.a().a(mb.c, $$2 != did.b && $$2 != did.c ? $$0 : $$1))).a(b()));
   }

   private void af() {
      agg $$0 = mh.bK.a(cuv.qI, mi.a(false), this.c);
      agg $$1 = mh.bK.a(cuv.qI, "_can_summon", mi.a(true), this.c);
      this.a(cuv.qI, $$0);
      this.b.accept(lx.a(cuv.qI).a(a(dhm.G, $$1, $$0)));
   }

   private void ag() {
      agg $$0 = mf.a(cuv.nS, "_stable");
      agg $$1 = mf.a(cuv.nS, "_unstable");
      this.a(cuv.nS, $$0);
      this.b.accept(lx.a(cuv.nS).a(a(dhm.b, $$1, $$0)));
   }

   private void ah() {
      agg $$0 = this.a(cuv.ru, "", mh.am, mi::c);
      agg $$1 = this.a(cuv.ru, "_lit", mh.am, mi::c);
      this.b.accept(lx.a(cuv.ru).a(a(dhm.D, $$1, $$0)));
      agg $$2 = this.a(cuv.rv, "", mh.am, mi::c);
      agg $$3 = this.a(cuv.rv, "_lit", mh.am, mi::c);
      this.b.accept(lx.a(cuv.rv).a(a(dhm.D, $$3, $$2)));
   }

   private void ai() {
      agg $$0 = mk.a.create(cuv.fB, this.c);
      agg $$1 = this.a(cuv.fB, "_on", mh.c, mi::b);
      this.b.accept(lx.a(cuv.fB).a(a(dhm.r, $$1, $$0)));
   }

   private void i(cut $$0, cut $$1) {
      mi $$2 = mi.y($$0);
      this.b.accept(c($$0, mh.bd.a($$0, $$2, this.c)));
      this.b.accept(lx.a($$1, ma.a().a(mb.c, mh.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void aj() {
      mi $$0 = mi.y(cuv.dK);
      mi $$1 = mi.i(mi.a(cuv.dK, "_off"));
      agg $$2 = mh.bd.a(cuv.dK, $$0, this.c);
      agg $$3 = mh.bd.a(cuv.dK, "_off", $$1, this.c);
      this.b.accept(lx.a(cuv.dK).a(a(dhm.r, $$2, $$3)));
      agg $$4 = mh.be.a(cuv.dL, $$0, this.c);
      agg $$5 = mh.be.a(cuv.dL, "_off", $$1, this.c);
      this.b.accept(lx.a(cuv.dL).a(a(dhm.r, $$4, $$5)).a(d()));
      this.d(cuv.dK);
      this.c(cuv.dL);
   }

   private void ak() {
      this.a(cle.lo);
      this.b.accept(lx.a(cuv.eh).a(ly.a(dhm.aA, dhm.s, dhm.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return ma.a().a(mb.c, mi.a(cuv.eh, $$3.toString()));
      })).a(c()));
   }

   private void al() {
      this.a(cle.cx);
      this.b
         .accept(
            lx.a(cuv.mV)
               .a(
                  ly.a(dhm.aS, dhm.C)
                     .a(1, false, Arrays.asList(a(mf.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(mf.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(mf.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(mf.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(mf.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(mf.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(mf.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(mf.a("four_sea_pickles"))))
               )
         );
   }

   private void am() {
      mi $$0 = mi.a(cuv.dN);
      agg $$1 = mh.c.a(cuv.dP, $$0, this.c);
      this.b.accept(lx.a(cuv.dN).a(ly.a(dhm.aF).a($$1x -> ma.a().a(mb.c, $$1x < 8 ? mf.a(cuv.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cuv.dN, mf.a(cuv.dN, "_height2"));
      this.b.accept(c(cuv.dP, $$1));
   }

   private void an() {
      this.b.accept(lx.a(cuv.oc, ma.a().a(mb.c, mf.a(cuv.oc))).a(b()));
   }

   private void ao() {
      agg $$0 = mk.a.create(cuv.pa, this.c);
      this.a(cuv.pa, $$0);
      this.b.accept(lx.a(cuv.pa).a(ly.a(dhm.bj).a($$0x -> ma.a().a(mb.c, this.a(cuv.pa, "_" + $$0x.c(), mh.c, mi::b)))));
   }

   private void ap() {
      this.a(cle.vw);
      this.b.accept(lx.a(cuv.oi).a(ly.a(dhm.as).a($$0 -> ma.a().a(mb.c, this.a(cuv.oi, "_stage" + $$0, mh.am, mi::c)))));
   }

   private void aq() {
      this.a(cle.oE);
      this.b
         .accept(
            lx.a(cuv.fI)
               .a(
                  ly.a(dhm.a, dhm.M, dhm.L, dhm.N, dhm.O)
                     .a(false, false, false, false, false, ma.a().a(mb.c, mf.a(cuv.fI, "_ns")))
                     .a(false, true, false, false, false, ma.a().a(mb.c, mf.a(cuv.fI, "_n")).a(mb.b, mb.a.b))
                     .a(false, false, true, false, false, ma.a().a(mb.c, mf.a(cuv.fI, "_n")))
                     .a(false, false, false, true, false, ma.a().a(mb.c, mf.a(cuv.fI, "_n")).a(mb.b, mb.a.c))
                     .a(false, false, false, false, true, ma.a().a(mb.c, mf.a(cuv.fI, "_n")).a(mb.b, mb.a.d))
                     .a(false, true, true, false, false, ma.a().a(mb.c, mf.a(cuv.fI, "_ne")))
                     .a(false, true, false, true, false, ma.a().a(mb.c, mf.a(cuv.fI, "_ne")).a(mb.b, mb.a.b))
                     .a(false, false, false, true, true, ma.a().a(mb.c, mf.a(cuv.fI, "_ne")).a(mb.b, mb.a.c))
                     .a(false, false, true, false, true, ma.a().a(mb.c, mf.a(cuv.fI, "_ne")).a(mb.b, mb.a.d))
                     .a(false, false, true, true, false, ma.a().a(mb.c, mf.a(cuv.fI, "_ns")))
                     .a(false, true, false, false, true, ma.a().a(mb.c, mf.a(cuv.fI, "_ns")).a(mb.b, mb.a.b))
                     .a(false, true, true, true, false, ma.a().a(mb.c, mf.a(cuv.fI, "_nse")))
                     .a(false, true, false, true, true, ma.a().a(mb.c, mf.a(cuv.fI, "_nse")).a(mb.b, mb.a.b))
                     .a(false, false, true, true, true, ma.a().a(mb.c, mf.a(cuv.fI, "_nse")).a(mb.b, mb.a.c))
                     .a(false, true, true, false, true, ma.a().a(mb.c, mf.a(cuv.fI, "_nse")).a(mb.b, mb.a.d))
                     .a(false, true, true, true, true, ma.a().a(mb.c, mf.a(cuv.fI, "_nsew")))
                     .a(true, false, false, false, false, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_ns")))
                     .a(true, false, true, false, false, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_n")))
                     .a(true, false, false, true, false, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_n")).a(mb.b, mb.a.c))
                     .a(true, true, false, false, false, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_n")).a(mb.b, mb.a.b))
                     .a(true, false, false, false, true, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_n")).a(mb.b, mb.a.d))
                     .a(true, true, true, false, false, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_ne")))
                     .a(true, true, false, true, false, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_ne")).a(mb.b, mb.a.b))
                     .a(true, false, false, true, true, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_ne")).a(mb.b, mb.a.c))
                     .a(true, false, true, false, true, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_ne")).a(mb.b, mb.a.d))
                     .a(true, false, true, true, false, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_ns")))
                     .a(true, true, false, false, true, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_ns")).a(mb.b, mb.a.b))
                     .a(true, true, true, true, false, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_nse")))
                     .a(true, true, false, true, true, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_nse")).a(mb.b, mb.a.b))
                     .a(true, false, true, true, true, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_nse")).a(mb.b, mb.a.c))
                     .a(true, true, true, false, true, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_nse")).a(mb.b, mb.a.d))
                     .a(true, true, true, true, true, ma.a().a(mb.c, mf.a(cuv.fI, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.d(cuv.fH);
      this.b.accept(lx.a(cuv.fH).a(ly.a(dhm.a, dhm.w).a(($$0, $$1) -> ma.a().a(mb.c, mi.a(cuv.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private agg a(int $$0, String $$1, mi $$2) {
      switch ($$0) {
         case 1:
            return mh.bj.a(mf.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return mh.bk.a(mf.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return mh.bl.a(mf.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return mh.bm.a(mf.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private agg a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mi.b(mi.G(cuv.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mi.b(mi.a(cuv.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mi.b(mi.a(cuv.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void as() {
      this.a(cle.jT);
      this.b.accept(lx.a(cuv.mf).a(ly.a(dhm.aD, dhm.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void at() {
      this.a(cle.jU);
      Function<Integer, agg> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mi $$2 = mi.a($$1);
         return mh.bu.a(cuv.mg, $$1, $$2, this.c);
      };
      this.b.accept(lx.a(cuv.mg).a(ly.a(dca.c).a($$1 -> ma.a().a(mb.c, $$0.apply($$1)))));
   }

   private void E(cut $$0) {
      this.d($$0);
      agg $$1 = mf.a($$0);
      lw $$2 = lw.a($$0);
      lv.c $$3 = ac.a(lv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dhn, Function<agg, ma>> $$4 : a) {
         dhn $$5 = (dhn)$$4.getFirst();
         Function<agg, ma> $$6 = (Function<agg, ma>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(lv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void au() {
      agg $$0 = mi.a(cuv.qH, "_bottom");
      mi $$1 = new mi().a(mj.e, $$0).a(mj.f, mi.a(cuv.qH, "_top")).a(mj.i, mi.a(cuv.qH, "_side"));
      mi $$2 = new mi().a(mj.e, $$0).a(mj.f, mi.a(cuv.qH, "_top_bloom")).a(mj.i, mi.a(cuv.qH, "_side_bloom"));
      agg $$3 = mh.m.a(cuv.qH, "", $$1, this.c);
      agg $$4 = mh.m.a(cuv.qH, "_bloom", $$2, this.c);
      this.b.accept(lx.a(cuv.qH).a(ly.a(dhm.E).a($$2x -> ma.a().a(mb.c, $$2x ? $$4 : $$3))));
      this.a(cle.fN, $$3);
   }

   private void av() {
      cut $$0 = cuv.cm;
      agg $$1 = mf.a($$0);
      lw $$2 = lw.a($$0);
      Map.of(hx.c, mb.a.a, hx.f, mb.a.b, hx.d, mb.a.c, hx.e, mb.a.d).forEach(($$2x, $$3) -> {
         lv.c $$4 = lv.a().a(dhm.R, $$2x);
         $$2.a($$4, ma.a().a(mb.c, $$1).a(mb.b, $$3).a(mb.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mf.a($$0, "_inventory"));
      i.clear();
   }

   private void a(lw $$0, lv.c $$1, mb.a $$2) {
      List.of(Pair.of(dhm.bp, mh.aK), Pair.of(dhm.bq, mh.aL), Pair.of(dhm.br, mh.aM), Pair.of(dhm.bs, mh.aN), Pair.of(dhm.bt, mh.aO), Pair.of(dhm.bu, mh.aP))
         .forEach($$3 -> {
            dhn $$4 = (dhn)$$3.getFirst();
            mg $$5 = (mg)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(lw $$0, lv.c $$1, mb.a $$2, dhn $$3, mg $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mi $$7 = new mi().a(mj.b, mi.a(cuv.cm, $$6));
      lr.d $$8 = new lr.d($$4, $$6);
      agg $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cuv.cm, $$6, $$7, this.c));
      $$0.a(lv.a($$1, lv.a().a($$3, $$5)), ma.a().a(mb.c, $$9).a(mb.b, $$2));
   }

   private void aw() {
      this.b.accept(c(cuv.kJ, mh.c.a(cuv.kJ, mi.b(mf.a("magma")), this.c)));
   }

   private void F(cut $$0) {
      this.b($$0, mk.p);
      mh.bB.a(mf.a($$0.k()), mi.u($$0), this.c);
   }

   private void b(cut $$0, cut $$1, lr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(cut $$0, cut $$1) {
      mh.bC.a(mf.a($$0.k()), mi.u($$1), this.c);
   }

   private void ax() {
      agg $$0 = mf.a(cuv.b);
      agg $$1 = mf.a(cuv.b, "_mirrored");
      this.b.accept(a(cuv.eN, $$0, $$1));
      this.a(cuv.eN, $$0);
   }

   private void ay() {
      agg $$0 = mf.a(cuv.rI);
      agg $$1 = mf.a(cuv.rI, "_mirrored");
      this.b.accept(a(cuv.sc, $$0, $$1).a(f()));
      this.a(cuv.sc, $$0);
   }

   private void k(cut $$0, cut $$1) {
      this.a($$0, lr.e.b);
      mi $$2 = mi.d(mi.a($$0, "_pot"));
      agg $$3 = lr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void az() {
      agg $$0 = mi.a(cuv.pl, "_bottom");
      agg $$1 = mi.a(cuv.pl, "_top_off");
      agg $$2 = mi.a(cuv.pl, "_top");
      agg[] $$3 = new agg[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mi $$5 = new mi().a(mj.e, $$0).a(mj.f, $$4 == 0 ? $$1 : $$2).a(mj.i, mi.a(cuv.pl, "_side" + $$4));
         $$3[$$4] = mh.m.a(cuv.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(lx.a(cuv.pl).a(ly.a(dhm.aZ).a($$1x -> ma.a().a(mb.c, $$3[$$1x]))));
      this.a(cle.vU, $$3[0]);
   }

   private ma a(hz $$0, ma $$1) {
      switch ($$0) {
         case b:
            return $$1.a(mb.a, mb.a.b);
         case c:
            return $$1.a(mb.a, mb.a.b).a(mb.b, mb.a.c);
         case d:
            return $$1.a(mb.a, mb.a.b).a(mb.b, mb.a.d);
         case a:
            return $$1.a(mb.a, mb.a.b).a(mb.b, mb.a.b);
         case f:
            return $$1.a(mb.a, mb.a.d).a(mb.b, mb.a.c);
         case g:
            return $$1.a(mb.a, mb.a.d);
         case h:
            return $$1.a(mb.a, mb.a.d).a(mb.b, mb.a.b);
         case e:
            return $$1.a(mb.a, mb.a.d).a(mb.b, mb.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(mb.b, mb.a.c);
         case i:
            return $$1.a(mb.b, mb.a.d);
         case j:
            return $$1.a(mb.b, mb.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aA() {
      agg $$0 = mi.a(cuv.pb, "_top");
      agg $$1 = mi.a(cuv.pb, "_bottom");
      agg $$2 = mi.a(cuv.pb, "_side");
      agg $$3 = mi.a(cuv.pb, "_lock");
      mi $$4 = new mi().a(mj.o, $$2).a(mj.m, $$2).a(mj.l, $$2).a(mj.c, $$0).a(mj.j, $$0).a(mj.k, $$1).a(mj.n, $$3);
      agg $$5 = mh.b.a(cuv.pb, $$4, this.c);
      this.b.accept(lx.a(cuv.pb, ma.a().a(mb.c, $$5)).a(ly.a(dhm.T).a($$0x -> this.a($$0x, ma.a()))));
   }

   private void aB() {
      cut $$0 = cuv.n;
      agg $$1 = mf.a($$0);
      mk $$2 = mk.a.get($$0);
      cut $$3 = cuv.jH;
      agg $$4 = mh.Z.a($$3, $$2.b(), this.c);
      agg $$5 = mh.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kb.a().filter(kc::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cuv.qS).a(kb.w).a(cuv.ri).a(kb.y);
      this.h(cuv.qR).a(kb.A).a(cuv.rh).a(kb.C);
      this.h(cuv.qQ).a(kb.E).a(cuv.rg).a(kb.G);
      this.h(cuv.qP).a(kb.I).a(cuv.rf).a(kb.K);
      this.m(cuv.a);
      this.a(cuv.nc, cuv.a);
      this.a(cuv.nb, cuv.a);
      this.m(cuv.fO);
      this.m(cuv.dQ);
      this.a(cuv.nd, cuv.G);
      this.m(cuv.fA);
      this.m(cuv.me);
      this.m(cuv.fr);
      this.m(cuv.fR);
      this.a(cle.tl);
      this.m(cuv.pg);
      this.m(cuv.G);
      this.m(cuv.H);
      this.m(cuv.hV);
      this.a(cle.fw);
      this.l(cuv.pM, cuv.qd);
      this.l(cuv.pN, cuv.qe);
      this.l(cuv.pO, cuv.qf);
      this.l(cuv.pP, cuv.qg);
      this.l(cuv.pQ, cuv.qh);
      this.l(cuv.pR, cuv.qi);
      this.l(cuv.pS, cuv.qj);
      this.l(cuv.pT, cuv.qk);
      this.l(cuv.pU, cuv.ql);
      this.l(cuv.pV, cuv.qm);
      this.l(cuv.pW, cuv.qn);
      this.l(cuv.pX, cuv.qo);
      this.l(cuv.pY, cuv.qp);
      this.l(cuv.pZ, cuv.qq);
      this.l(cuv.qa, cuv.qr);
      this.l(cuv.qb, cuv.qs);
      this.l(cuv.pL, cuv.qc);
      this.m(cuv.na);
      this.m(cuv.gs);
      this.m(cuv.qC);
      this.m(cuv.rw);
      this.s(cuv.rx);
      this.s(cuv.ry);
      this.t(cuv.sh);
      this.t(cuv.si);
      this.ah();
      this.e(cuv.rB, cuv.rz);
      this.p(cuv.rA);
      this.a(cuv.hW, cle.hf);
      this.a(cle.hf);
      this.aC();
      this.a(cuv.kN, cle.iF);
      this.a(cle.iF);
      this.f(cuv.bQ, mi.a(cuv.by, "_side"));
      this.a(cuv.R);
      this.a(cuv.S);
      this.a(cuv.iB);
      this.a(cuv.cx);
      this.a(cuv.cy);
      this.a(cuv.cz);
      this.a(cuv.fE);
      this.a(cuv.fF);
      this.a(cuv.fJ);
      this.a(cuv.N);
      this.a(cuv.T);
      this.a(cuv.O);
      this.a(cuv.ch);
      this.a(cuv.P);
      this.a(cuv.Q);
      this.a(cuv.ci);
      this.b(cuv.pj, mk.c);
      this.a(cuv.pi);
      this.a(cuv.aR);
      this.a(cuv.aS);
      this.a(cuv.aT);
      this.a(cuv.hb);
      this.a(cuv.dI);
      this.a(cuv.dJ);
      this.a(cuv.ha);
      this.a(cuv.pC);
      this.a(cuv.mW);
      this.a(cuv.dR);
      this.a(cuv.k);
      this.a(cuv.pk);
      this.a(cuv.fz);
      this.a(cuv.ec);
      this.a(cuv.L);
      this.a(cuv.ph);
      this.a(cuv.dO);
      this.b(cuv.dT, mk.f);
      this.b(cuv.pq, mk.c);
      this.b(cuv.fa, mk.c);
      this.m(cuv.ac);
      this.m(cuv.ga);
      this.a(cuv.kK);
      this.a(cuv.aY);
      this.a(cuv.iC);
      this.a(cuv.co);
      this.a(cuv.pK);
      this.a(cuv.ii);
      this.a(cuv.oy);
      this.a(cuv.dW);
      this.a(cuv.dX);
      this.a(cuv.ct);
      this.a(cuv.aO);
      this.b(cuv.bw, mk.u);
      this.a(cle.cw);
      this.b(cuv.ck, mk.e);
      this.b(cuv.pd, mk.c);
      this.a(cuv.op);
      this.a(cuv.aP);
      this.a(cuv.qt);
      this.a(cuv.qu);
      this.a(cuv.qA);
      this.a(cuv.qz);
      this.a(cuv.rt);
      this.a(cuv.se);
      this.a(cuv.sf);
      this.a(cuv.sg);
      this.e(cuv.qF);
      this.aB();
      this.a(cuv.qN);
      this.a(cuv.qO);
      this.a(cuv.qM);
      this.a(cuv.qL);
      this.a(cuv.qK);
      this.a(cuv.qJ);
      this.h(cuv.qM, cuv.rb);
      this.h(cuv.qL, cuv.rd);
      this.h(cuv.qK, cuv.rc);
      this.h(cuv.qJ, cuv.re);
      this.g(cuv.gW, cuv.ch);
      this.g(cuv.gX, cuv.ci);
      this.G();
      this.r();
      this.av();
      this.v();
      this.w();
      this.a(cuv.og, cuv.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.y(cuv.kt);
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
      this.E(cuv.ff);
      this.E(cuv.fg);
      this.E(cuv.qG);
      this.aw();
      this.aA();
      this.ad();
      this.ae();
      this.af();
      this.X();
      this.O();
      this.N();
      this.D(cuv.cO);
      this.d(cuv.cO);
      this.D(cuv.oa);
      this.g();
      this.D(cuv.rD);
      this.i(cuv.cp, cuv.cq);
      this.i(cuv.ea, cuv.eb);
      this.a(cuv.cA, cuv.n, mi::c);
      this.a(cuv.nY, cuv.p, mi::d);
      this.x(cuv.ow);
      this.x(cuv.on);
      this.v(cuv.aU);
      this.v(cuv.hi);
      this.C();
      this.C(cuv.oe);
      this.C(cuv.of);
      this.e(cuv.eX, mf.a(cuv.eX));
      this.a(cuv.dY, mk.c);
      this.a(cuv.dZ, mk.c);
      this.a(cuv.sd);
      this.a(cuv.kM, mk.c);
      this.f(cuv.j);
      this.f(cuv.rG);
      this.f(cuv.I);
      this.g(cuv.J);
      this.g(cuv.M);
      this.f(cuv.K);
      this.e(cuv.F);
      this.b(cuv.sn, mk.e);
      this.a(cuv.ij, mk.c, mk.d);
      this.a(cuv.kx, mk.v, mk.w);
      this.a(cuv.hf, mk.v, mk.w);
      this.a(cuv.sj, mk.c, mk.d);
      this.a(cuv.sk, mk.c, mk.d);
      this.a(cuv.sl, mk.c, mk.d);
      this.c(cuv.nT, mk.h);
      this.z();
      this.a(cuv.pe, mi::A);
      this.a(cuv.pf, mi::C);
      this.a(cuv.kD, dhm.as, 0, 1, 2, 3);
      this.a(cuv.gt, dhm.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cuv.fq, dhm.as, 0, 1, 1, 2);
      this.a(cuv.gu, dhm.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cuv.cB, dhm.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cuv.kA, lr.e.b, dhm.aq, 0, 1);
      this.i();
      this.h();
      this.a(mf.a("decorated_pot"), cuv.iA).b(cuv.so);
      this.a(mf.a("banner"), cuv.n)
         .a(mh.bD, cuv.iJ, cuv.iK, cuv.iL, cuv.iM, cuv.iN, cuv.iO, cuv.iP, cuv.iQ, cuv.iR, cuv.iS, cuv.iT, cuv.iU, cuv.iV, cuv.iW, cuv.iX, cuv.iY)
         .b(cuv.iZ, cuv.ja, cuv.jb, cuv.jc, cuv.jd, cuv.je, cuv.jf, cuv.jg, cuv.jh, cuv.ji, cuv.jj, cuv.jk, cuv.jl, cuv.jm, cuv.jn, cuv.jo);
      this.a(mf.a("bed"), cuv.n)
         .b(cuv.aZ, cuv.ba, cuv.bb, cuv.bc, cuv.bd, cuv.be, cuv.bf, cuv.bg, cuv.bh, cuv.bi, cuv.bj, cuv.bk, cuv.bl, cuv.bm, cuv.bn, cuv.bo);
      this.j(cuv.aZ, cuv.bA);
      this.j(cuv.ba, cuv.bB);
      this.j(cuv.bb, cuv.bC);
      this.j(cuv.bc, cuv.bD);
      this.j(cuv.bd, cuv.bE);
      this.j(cuv.be, cuv.bF);
      this.j(cuv.bf, cuv.bG);
      this.j(cuv.bg, cuv.bH);
      this.j(cuv.bh, cuv.bI);
      this.j(cuv.bi, cuv.bJ);
      this.j(cuv.bj, cuv.bK);
      this.j(cuv.bk, cuv.bL);
      this.j(cuv.bl, cuv.bM);
      this.j(cuv.bm, cuv.bN);
      this.j(cuv.bn, cuv.bO);
      this.j(cuv.bo, cuv.bP);
      this.a(mf.a("skull"), cuv.dW)
         .a(mh.bE, cuv.gM, cuv.gK, cuv.gI, cuv.gE, cuv.gG, cuv.gQ)
         .a(cuv.gO)
         .b(cuv.gN, cuv.gP, cuv.gL, cuv.gJ, cuv.gF, cuv.gH, cuv.gR);
      this.F(cuv.kP);
      this.F(cuv.kQ);
      this.F(cuv.kR);
      this.F(cuv.kS);
      this.F(cuv.kT);
      this.F(cuv.kU);
      this.F(cuv.kV);
      this.F(cuv.kW);
      this.F(cuv.kX);
      this.F(cuv.kY);
      this.F(cuv.kZ);
      this.F(cuv.la);
      this.F(cuv.lb);
      this.F(cuv.lc);
      this.F(cuv.ld);
      this.F(cuv.le);
      this.F(cuv.lf);
      this.b(cuv.mX, mk.p);
      this.c(cuv.mX);
      this.a(mf.a("chest"), cuv.n).b(cuv.cv, cuv.gV);
      this.a(mf.a("ender_chest"), cuv.co).b(cuv.fG);
      this.d(cuv.fx, cuv.co).a(cuv.fx, cuv.kF);
      this.a(cuv.aM);
      this.a(cuv.aN);
      this.a(cuv.lw);
      this.a(cuv.lx);
      this.a(cuv.ly);
      this.a(cuv.lz);
      this.a(cuv.lA);
      this.a(cuv.lB);
      this.a(cuv.lC);
      this.a(cuv.lD);
      this.a(cuv.lE);
      this.a(cuv.lF);
      this.a(cuv.lG);
      this.a(cuv.lH);
      this.a(cuv.lI);
      this.a(cuv.lJ);
      this.a(cuv.lK);
      this.a(cuv.lL);
      this.a(mk.a, cuv.lM, cuv.lN, cuv.lO, cuv.lP, cuv.lQ, cuv.lR, cuv.lS, cuv.lT, cuv.lU, cuv.lV, cuv.lW, cuv.lX, cuv.lY, cuv.lZ, cuv.ma, cuv.mb);
      this.a(cuv.iA);
      this.a(cuv.hj);
      this.a(cuv.hk);
      this.a(cuv.hl);
      this.a(cuv.hm);
      this.a(cuv.hn);
      this.a(cuv.ho);
      this.a(cuv.hp);
      this.a(cuv.hq);
      this.a(cuv.hr);
      this.a(cuv.hs);
      this.a(cuv.ht);
      this.a(cuv.hu);
      this.a(cuv.hv);
      this.a(cuv.hw);
      this.a(cuv.hx);
      this.a(cuv.hy);
      this.a(cuv.qB);
      this.f(cuv.aQ, cuv.eY);
      this.f(cuv.ei, cuv.hz);
      this.f(cuv.ej, cuv.hA);
      this.f(cuv.ek, cuv.hB);
      this.f(cuv.el, cuv.hC);
      this.f(cuv.em, cuv.hD);
      this.f(cuv.en, cuv.hE);
      this.f(cuv.eo, cuv.hF);
      this.f(cuv.ep, cuv.hG);
      this.f(cuv.eq, cuv.hH);
      this.f(cuv.er, cuv.hI);
      this.f(cuv.es, cuv.hJ);
      this.f(cuv.et, cuv.hK);
      this.f(cuv.eu, cuv.hL);
      this.f(cuv.ev, cuv.hM);
      this.f(cuv.ew, cuv.hN);
      this.f(cuv.ex, cuv.hO);
      this.b(mk.n, cuv.lg, cuv.lh, cuv.li, cuv.lj, cuv.lk, cuv.ll, cuv.lm, cuv.ln, cuv.lo, cuv.lp, cuv.lq, cuv.lr, cuv.ls, cuv.lt, cuv.lu, cuv.lv);
      this.e(cuv.bA, cuv.ik);
      this.e(cuv.bB, cuv.il);
      this.e(cuv.bC, cuv.im);
      this.e(cuv.bD, cuv.in);
      this.e(cuv.bE, cuv.io);
      this.e(cuv.bF, cuv.ip);
      this.e(cuv.bG, cuv.iq);
      this.e(cuv.bH, cuv.ir);
      this.e(cuv.bI, cuv.is);
      this.e(cuv.bJ, cuv.it);
      this.e(cuv.bK, cuv.iu);
      this.e(cuv.bL, cuv.iv);
      this.e(cuv.bM, cuv.iw);
      this.e(cuv.bN, cuv.ix);
      this.e(cuv.bO, cuv.iy);
      this.e(cuv.bP, cuv.iz);
      this.a(cuv.rH);
      this.a(cuv.eL);
      this.a(cuv.bu, cuv.gb, lr.e.a);
      this.a(cuv.bR, cuv.gc, lr.e.b);
      this.a(cuv.bT, cuv.gd, lr.e.b);
      this.a(cuv.bU, cuv.ge, lr.e.b);
      this.a(cuv.bV, cuv.gf, lr.e.b);
      this.a(cuv.bW, cuv.gg, lr.e.b);
      this.a(cuv.bX, cuv.gh, lr.e.b);
      this.a(cuv.bY, cuv.gi, lr.e.b);
      this.a(cuv.bZ, cuv.gj, lr.e.b);
      this.a(cuv.ca, cuv.gk, lr.e.b);
      this.a(cuv.cb, cuv.gl, lr.e.b);
      this.a(cuv.cc, cuv.gm, lr.e.b);
      this.a(cuv.ce, cuv.gn, lr.e.b);
      this.a(cuv.cd, cuv.go, lr.e.b);
      this.a(cuv.cg, cuv.gp, lr.e.b);
      this.a(cuv.cf, cuv.gq, lr.e.b);
      this.a(cuv.bv, cuv.gr, lr.e.b);
      this.a(cuv.bS, cuv.fS, lr.e.b);
      this.H();
      this.u(cuv.eT);
      this.u(cuv.eU);
      this.u(cuv.eV);
      this.a(cuv.bt, lr.e.a);
      this.b(cuv.dS, lr.e.a);
      this.a(cle.dn);
      this.b(cuv.mc, cuv.md, lr.e.b);
      this.a(cle.do);
      this.c(cuv.md);
      this.b(cuv.rF, lr.e.b);
      this.c(cuv.rF);
      this.c(cuv.rv);
      this.b(cuv.oz, cuv.oA, lr.e.b);
      this.b(cuv.oB, cuv.oC, lr.e.b);
      this.a(cuv.oz, "_plant");
      this.c(cuv.oA);
      this.a(cuv.oB, "_plant");
      this.c(cuv.oC);
      this.a(cuv.mY, lr.e.a, mi.c(mi.a(cuv.mZ, "_stage0")));
      this.m();
      this.a(cuv.bs, lr.e.b);
      this.c(cuv.iE, lr.e.b);
      this.c(cuv.iF, lr.e.b);
      this.c(cuv.iG, lr.e.b);
      this.c(cuv.iH, lr.e.a);
      this.c(cuv.iI, lr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cuv.mw, cuv.mr, cuv.mm, cuv.mh, cuv.mG, cuv.mB, cuv.mQ, cuv.mL);
      this.a(cuv.mx, cuv.ms, cuv.mn, cuv.mi, cuv.mH, cuv.mC, cuv.mR, cuv.mM);
      this.a(cuv.my, cuv.mt, cuv.mo, cuv.mj, cuv.mI, cuv.mD, cuv.mS, cuv.mN);
      this.a(cuv.mz, cuv.mu, cuv.mp, cuv.mk, cuv.mJ, cuv.mE, cuv.mT, cuv.mO);
      this.a(cuv.mA, cuv.mv, cuv.mq, cuv.ml, cuv.mK, cuv.mF, cuv.mU, cuv.mP);
      this.c(cuv.fe, cuv.fc);
      this.c(cuv.fd, cuv.fb);
      this.l(cuv.ab).c(cuv.ab).a(cuv.av);
      this.l(cuv.am).c(cuv.am).a(cuv.aD);
      this.a(cuv.am, cuv.dj, cuv.ds);
      this.b(cuv.aL, mk.r);
      this.l(cuv.Y).c(cuv.Y).a(cuv.as);
      this.l(cuv.ai).c(cuv.ai).a(cuv.aA);
      this.a(cuv.ai, cuv.dd, cuv.do);
      this.a(cuv.B, cuv.fX, lr.e.b);
      this.b(cuv.aI, mk.r);
      this.l(cuv.Z).d(cuv.Z).a(cuv.at);
      this.l(cuv.aj).d(cuv.aj).a(cuv.aB);
      this.a(cuv.aj, cuv.de, cuv.dp);
      this.a(cuv.C, cuv.fY, lr.e.b);
      this.b(cuv.aJ, mk.r);
      this.l(cuv.W).c(cuv.W).a(cuv.aq);
      this.l(cuv.ag).c(cuv.ag).a(cuv.ay);
      this.a(cuv.ag, cuv.dc, cuv.dn);
      this.a(cuv.z, cuv.fV, lr.e.b);
      this.b(cuv.aG, mk.r);
      this.l(cuv.U).c(cuv.U).a(cuv.ao);
      this.l(cuv.al).c(cuv.al).a(cuv.aw);
      this.a(cuv.al, cuv.da, cuv.dl);
      this.a(cuv.x, cuv.fT, lr.e.b);
      this.b(cuv.aE, mk.r);
      this.l(cuv.V).c(cuv.V).a(cuv.ap);
      this.l(cuv.af).c(cuv.af).a(cuv.ax);
      this.a(cuv.af, cuv.db, cuv.dm);
      this.a(cuv.y, cuv.fU, lr.e.b);
      this.b(cuv.aF, mk.r);
      this.l(cuv.aa).c(cuv.aa).a(cuv.au);
      this.l(cuv.ak).c(cuv.ak).a(cuv.aC);
      this.a(cuv.ak, cuv.dg, cuv.dr);
      this.a(cuv.D, cuv.fZ, lr.e.b);
      this.b(cuv.aK, mk.r);
      this.l(cuv.X).c(cuv.X).a(cuv.ar);
      this.l(cuv.ah).c(cuv.ah).a(cuv.az);
      this.a(cuv.ah, cuv.df, cuv.dq);
      this.a(cuv.A, cuv.fW, lr.e.b);
      this.b(cuv.aH, mk.r);
      this.l(cuv.os).b(cuv.os).a(cuv.ou);
      this.l(cuv.ot).b(cuv.ot).a(cuv.ov);
      this.a(cuv.ot, cuv.dh, cuv.dt);
      this.a(cuv.ox, cuv.pm, lr.e.b);
      this.k(cuv.oD, cuv.po);
      this.l(cuv.oj).b(cuv.oj).a(cuv.ol);
      this.l(cuv.ok).b(cuv.ok).a(cuv.om);
      this.a(cuv.ok, cuv.di, cuv.du);
      this.a(cuv.oo, cuv.pn, lr.e.b);
      this.k(cuv.oq, cuv.pp);
      this.l(cuv.ae).d(cuv.ae);
      this.l(cuv.an).d(cuv.an);
      this.a(cuv.v, cuv.dk, cuv.dv);
      this.b(cuv.or, lr.e.b);
      this.a(cle.dk);
      this.i(cuv.dy);
      this.k(cuv.hY);
      this.u();
      this.n(cuv.cP);
      this.o(cuv.bp);
      this.o(cuv.bq);
      this.o(cuv.hh);
      this.t();
      this.q(cuv.fN);
      this.q(cuv.kG);
      this.q(cuv.kH);
      this.r(cuv.gS);
      this.r(cuv.gT);
      this.r(cuv.gU);
      this.o();
      this.p();
      this.d(cuv.cD, mk.g);
      this.d(cuv.nW, mk.g);
      this.d(cuv.nV, mk.h);
      this.s();
      this.az();
      this.au();
      this.h(cuv.eK, cuv.eS);
      this.h(cuv.m, cuv.eO);
      this.h(cuv.eJ, cuv.eR);
      this.h(cuv.eI, cuv.eQ);
      this.ax();
      this.h(cuv.eH, cuv.eP);
      this.ay();
      cmg.h().forEach($$0 -> this.a($$0, mf.b("template_spawn_egg")));
   }

   private void aC() {
      this.c(cuv.hX);
      ly.a<Integer> $$0 = ly.a(dhm.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         agg $$3 = mi.a(cle.hg, $$2);
         $$0.a($$1, ma.a().a(mb.c, mh.Y.a(cuv.hX, $$2, mi.h($$3), this.c)));
         mh.bv.a(mf.a(cle.hg, $$2), mi.k($$3), this.c);
      }

      this.b.accept(lx.a(cuv.hX).a($$0));
   }

   private void l(cut $$0, cut $$1) {
      this.a($$0.k());
      mi $$2 = mi.b(mi.G($$0));
      mi $$3 = mi.b(mi.a($$0, "_lit"));
      agg $$4 = mh.bF.a($$0, "_one_candle", $$2, this.c);
      agg $$5 = mh.bG.a($$0, "_two_candles", $$2, this.c);
      agg $$6 = mh.bH.a($$0, "_three_candles", $$2, this.c);
      agg $$7 = mh.bI.a($$0, "_four_candles", $$2, this.c);
      agg $$8 = mh.bF.a($$0, "_one_candle_lit", $$3, this.c);
      agg $$9 = mh.bG.a($$0, "_two_candles_lit", $$3, this.c);
      agg $$10 = mh.bH.a($$0, "_three_candles_lit", $$3, this.c);
      agg $$11 = mh.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            lx.a($$0)
               .a(
                  ly.a(dhm.az, dhm.r)
                     .a(1, false, ma.a().a(mb.c, $$4))
                     .a(2, false, ma.a().a(mb.c, $$5))
                     .a(3, false, ma.a().a(mb.c, $$6))
                     .a(4, false, ma.a().a(mb.c, $$7))
                     .a(1, true, ma.a().a(mb.c, $$8))
                     .a(2, true, ma.a().a(mb.c, $$9))
                     .a(3, true, ma.a().a(mb.c, $$10))
                     .a(4, true, ma.a().a(mb.c, $$11))
               )
         );
      agg $$12 = mh.bJ.a($$1, mi.a($$0, false), this.c);
      agg $$13 = mh.bJ.a($$1, "_lit", mi.a($$0, true), this.c);
      this.b.accept(lx.a($$1).a(a(dhm.r, $$13, $$12)));
   }

   class a {
      private final agg b;

      public a(agg $$0, cut $$1) {
         this.b = mh.Y.a($$0, mi.u($$1), lr.this.c);
      }

      public lr.a a(cut... $$0) {
         for (cut $$1 : $$0) {
            lr.this.b.accept(lr.c($$1, this.b));
         }

         return this;
      }

      public lr.a b(cut... $$0) {
         for (cut $$1 : $$0) {
            lr.this.c($$1);
         }

         return this.a($$0);
      }

      public lr.a a(mg $$0, cut... $$1) {
         for (cut $$2 : $$1) {
            $$0.a(mf.a($$2.k()), mi.u($$2), lr.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mi b;
      private final Map<mg, agg> c = Maps.newHashMap();
      @Nullable
      private kc d;
      @Nullable
      private agg e;

      public b(mi $$0) {
         this.b = $$0;
      }

      public lr.b a(cut $$0, mg $$1) {
         this.e = $$1.a($$0, this.b, lr.this.c);
         if (lr.this.f.containsKey($$0)) {
            lr.this.b.accept(lr.this.f.get($$0).create($$0, this.e, this.b, lr.this.c));
         } else {
            lr.this.b.accept(lr.c($$0, this.e));
         }

         return this;
      }

      public lr.b a(cut... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (cut $$1 : $$0) {
               lr.this.b.accept(lr.c($$1, this.e));
               lr.this.a($$1, this.e);
            }

            return this;
         }
      }

      public lr.b a(cut $$0) {
         agg $$1 = mh.q.a($$0, this.b, lr.this.c);
         agg $$2 = mh.r.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.b($$0, $$1, $$2));
         agg $$3 = mh.s.a($$0, this.b, lr.this.c);
         lr.this.a($$0, $$3);
         return this;
      }

      public lr.b b(cut $$0) {
         agg $$1 = mh.K.a($$0, this.b, lr.this.c);
         agg $$2 = mh.L.a($$0, this.b, lr.this.c);
         agg $$3 = mh.M.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.a($$0, $$1, $$2, $$3));
         agg $$4 = mh.N.a($$0, this.b, lr.this.c);
         lr.this.a($$0, $$4);
         return this;
      }

      public lr.b c(cut $$0) {
         mi $$1 = mi.p($$0);
         agg $$2 = mh.B.a($$0, $$1, lr.this.c);
         agg $$3 = mh.C.a($$0, $$1, lr.this.c);
         agg $$4 = mh.D.a($$0, $$1, lr.this.c);
         agg $$5 = mh.E.a($$0, $$1, lr.this.c);
         agg $$6 = mh.F.a($$0, $$1, lr.this.c);
         lr.this.b.accept(lr.a($$0, $$2, $$3, $$4, $$5, $$6));
         agg $$7 = mh.G.a($$0, $$1, lr.this.c);
         lr.this.a($$0, $$7);
         return this;
      }

      public lr.b d(cut $$0) {
         agg $$1 = mh.H.a($$0, this.b, lr.this.c);
         agg $$2 = mh.I.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.c($$0, $$1, $$2));
         agg $$3 = mh.J.a($$0, this.b, lr.this.c);
         lr.this.a($$0, $$3);
         return this;
      }

      public lr.b e(cut $$0) {
         mi $$1 = mi.p($$0);
         agg $$2 = mh.P.a($$0, $$1, lr.this.c);
         agg $$3 = mh.O.a($$0, $$1, lr.this.c);
         agg $$4 = mh.R.a($$0, $$1, lr.this.c);
         agg $$5 = mh.Q.a($$0, $$1, lr.this.c);
         lr.this.b.accept(lr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public lr.b f(cut $$0) {
         agg $$1 = mh.T.a($$0, this.b, lr.this.c);
         agg $$2 = mh.S.a($$0, this.b, lr.this.c);
         agg $$3 = mh.V.a($$0, this.b, lr.this.c);
         agg $$4 = mh.U.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public lr.b g(cut $$0) {
         agg $$1 = mh.W.a($$0, this.b, lr.this.c);
         agg $$2 = mh.X.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.e($$0, $$1, $$2));
         return this;
      }

      public lr.b h(cut $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cut $$1 = this.d.b().get(kc.b.r);
            agg $$2 = mh.Y.a($$0, this.b, lr.this.c);
            lr.this.b.accept(lr.c($$0, $$2));
            lr.this.b.accept(lr.c($$1, $$2));
            lr.this.a($$0.k());
            lr.this.c($$1);
            return this;
         }
      }

      public lr.b i(cut $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            agg $$1 = this.a(mh.Z, $$0);
            agg $$2 = this.a(mh.aa, $$0);
            lr.this.b.accept(lr.e($$0, $$1, $$2, this.e));
            lr.this.a($$0, $$1);
            return this;
         }
      }

      public lr.b j(cut $$0) {
         agg $$1 = this.a(mh.ad, $$0);
         agg $$2 = this.a(mh.ac, $$0);
         agg $$3 = this.a(mh.ae, $$0);
         lr.this.b.accept(lr.b($$0, $$1, $$2, $$3));
         lr.this.a($$0, $$2);
         return this;
      }

      private lr.b k(cut $$0) {
         mk $$1 = lr.this.g.getOrDefault($$0, mk.a.get($$0));
         lr.this.b.accept(lr.c($$0, $$1.a($$0, lr.this.c)));
         return this;
      }

      private lr.b l(cut $$0) {
         lr.this.i($$0);
         return this;
      }

      private void m(cut $$0) {
         if (lr.this.e.contains($$0)) {
            lr.this.k($$0);
         } else {
            lr.this.j($$0);
         }
      }

      private agg a(mg $$0, cut $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, lr.this.c));
      }

      public lr.b a(kc $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<lr.b, cut> $$2 = lr.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      lu create(cut var1, agg var2, mi var3, BiConsumer<agg, Supplier<JsonElement>> var4);
   }

   static record d(mg a, String b) {
   }

   static enum e {
      a,
      b;

      public mg a() {
         return this == a ? mh.an : mh.am;
      }

      public mg b() {
         return this == a ? mh.ap : mh.ao;
      }
   }

   class f {
      private final mi b;

      public f(mi $$0) {
         this.b = $$0;
      }

      public lr.f a(cut $$0) {
         mi $$1 = this.b.c(mj.d, this.b.a(mj.i));
         agg $$2 = mh.i.a($$0, $$1, lr.this.c);
         lr.this.b.accept(lr.d($$0, $$2));
         return this;
      }

      public lr.f b(cut $$0) {
         agg $$1 = mh.i.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.d($$0, $$1));
         return this;
      }

      public lr.f c(cut $$0) {
         agg $$1 = mh.i.a($$0, this.b, lr.this.c);
         agg $$2 = mh.j.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.d($$0, $$1, $$2));
         return this;
      }

      public lr.f d(cut $$0) {
         lr.this.b.accept(lr.a($$0, this.b, lr.this.c));
         return this;
      }
   }
}
