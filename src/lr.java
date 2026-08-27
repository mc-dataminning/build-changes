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

public class lr {
   final Consumer<lu> b;
   final BiConsumer<agi, Supplier<JsonElement>> c;
   private final Consumer<cle> d;
   final List<cva> e = ImmutableList.of(cvc.ey, cvc.eE, cvc.hY);
   final Map<cva, lr.c> f = ImmutableMap.builder().put(cvc.b, lr::a).put(cvc.sJ, lr::c).put(cvc.eM, lr::b).build();
   final Map<cva, mk> g = ImmutableMap.builder()
      .put(cvc.aV, mk.x.get(cvc.aV))
      .put(cvc.jp, mk.x.get(cvc.jp))
      .put(cvc.jS, mk.a(mi.a(cvc.aV, "_top")))
      .put(cvc.jU, mk.a(mi.a(cvc.jp, "_top")))
      .put(cvc.aX, mk.c.get(cvc.aV).a($$0x -> $$0x.a(mj.i, mi.G(cvc.aX))))
      .put(cvc.jr, mk.c.get(cvc.jp).a($$0x -> $$0x.a(mj.i, mi.G(cvc.jr))))
      .put(cvc.hd, mk.c.get(cvc.hd))
      .put(cvc.jT, mk.a(mi.a(cvc.hd, "_bottom")))
      .put(cvc.pr, mk.y.get(cvc.pr))
      .put(cvc.sJ, mk.y.get(cvc.sJ))
      .put(cvc.he, mk.c.get(cvc.he).a($$0x -> $$0x.a(mj.i, mi.G(cvc.he))))
      .put(cvc.aW, mk.c.get(cvc.aW).a($$0x -> {
         $$0x.a(mj.d, mi.a(cvc.aV, "_top"));
         $$0x.a(mj.i, mi.G(cvc.aW));
      }))
      .put(cvc.jq, mk.c.get(cvc.jq).a($$0x -> {
         $$0x.a(mj.d, mi.a(cvc.jp, "_top"));
         $$0x.a(mj.i, mi.G(cvc.jq));
      }))
      .put(cvc.qM, mk.y.get(cvc.qM))
      .put(cvc.qH, mk.y.get(cvc.qH))
      .build();
   static final Map<kc.b, BiConsumer<lr.b, cva>> h = ImmutableMap.builder()
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
   public static final List<Pair<dhz, Function<agi, ma>>> a = List.of(
      Pair.of(dhy.L, (Function<agi, ma>)$$0 -> ma.a().a(mb.c, $$0)),
      Pair.of(dhy.M, (Function<agi, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.b, mb.a.b).a(mb.d, true)),
      Pair.of(dhy.N, (Function<agi, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.b, mb.a.c).a(mb.d, true)),
      Pair.of(dhy.O, (Function<agi, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.b, mb.a.d).a(mb.d, true)),
      Pair.of(dhy.J, (Function<agi, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.a, mb.a.d).a(mb.d, true)),
      Pair.of(dhy.K, (Function<agi, ma>)$$0 -> ma.a().a(mb.c, $$0).a(mb.a, mb.a.b).a(mb.d, true))
   );
   private static final Map<lr.d, agi> i = new HashMap<>();

   private static lu a(cva $$0, agi $$1, mi $$2, BiConsumer<agi, Supplier<JsonElement>> $$3) {
      agi $$4 = mh.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static lu b(cva $$0, agi $$1, mi $$2, BiConsumer<agi, Supplier<JsonElement>> $$3) {
      agi $$4 = mh.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static lu c(cva $$0, agi $$1, mi $$2, BiConsumer<agi, Supplier<JsonElement>> $$3) {
      agi $$4 = mh.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public lr(Consumer<lu> $$0, BiConsumer<agi, Supplier<JsonElement>> $$1, Consumer<cle> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cva $$0) {
      this.d.accept($$0.k());
   }

   void a(cva $$0, agi $$1) {
      this.c.accept(mf.a($$0.k()), new me($$1));
   }

   private void a(cle $$0, agi $$1) {
      this.c.accept(mf.a($$0), new me($$1));
   }

   void a(cle $$0) {
      mh.bv.a(mf.a($$0), mi.b($$0), this.c);
   }

   private void d(cva $$0) {
      cle $$1 = $$0.k();
      if ($$1 != clm.a) {
         mh.bv.a(mf.a($$1), mi.F($$0), this.c);
      }
   }

   private void a(cva $$0, String $$1) {
      cle $$2 = $$0.k();
      mh.bv.a(mf.a($$2), mi.k(mi.a($$0, $$1)), this.c);
   }

   private static ly b() {
      return ly.a(dhy.R).a(hx.f, ma.a().a(mb.b, mb.a.b)).a(hx.d, ma.a().a(mb.b, mb.a.c)).a(hx.e, ma.a().a(mb.b, mb.a.d)).a(hx.c, ma.a());
   }

   private static ly c() {
      return ly.a(dhy.R).a(hx.d, ma.a()).a(hx.e, ma.a().a(mb.b, mb.a.b)).a(hx.c, ma.a().a(mb.b, mb.a.c)).a(hx.f, ma.a().a(mb.b, mb.a.d));
   }

   private static ly d() {
      return ly.a(dhy.R).a(hx.f, ma.a()).a(hx.d, ma.a().a(mb.b, mb.a.b)).a(hx.e, ma.a().a(mb.b, mb.a.c)).a(hx.c, ma.a().a(mb.b, mb.a.d));
   }

   private static ly e() {
      return ly.a(dhy.P)
         .a(hx.a, ma.a().a(mb.a, mb.a.b))
         .a(hx.b, ma.a().a(mb.a, mb.a.d))
         .a(hx.c, ma.a())
         .a(hx.d, ma.a().a(mb.b, mb.a.c))
         .a(hx.e, ma.a().a(mb.b, mb.a.d))
         .a(hx.f, ma.a().a(mb.b, mb.a.b));
   }

   private static lx b(cva $$0, agi $$1) {
      return lx.a($$0, a($$1));
   }

   private static ma[] a(agi $$0) {
      return new ma[]{ma.a().a(mb.c, $$0), ma.a().a(mb.c, $$0).a(mb.b, mb.a.b), ma.a().a(mb.c, $$0).a(mb.b, mb.a.c), ma.a().a(mb.c, $$0).a(mb.b, mb.a.d)};
   }

   private static lx a(cva $$0, agi $$1, agi $$2) {
      return lx.a($$0, ma.a().a(mb.c, $$1), ma.a().a(mb.c, $$2), ma.a().a(mb.c, $$1).a(mb.b, mb.a.c), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c));
   }

   private static ly a(dhz $$0, agi $$1, agi $$2) {
      return ly.a($$0).a(true, ma.a().a(mb.c, $$1)).a(false, ma.a().a(mb.c, $$2));
   }

   private void e(cva $$0) {
      agi $$1 = mk.a.create($$0, this.c);
      agi $$2 = mk.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cva $$0) {
      agi $$1 = mk.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cva $$0) {
      this.b.accept(lx.a($$0).a(ly.a(dhy.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         agi $$3 = mi.a($$0, $$2);
         return ma.a().a(mb.c, mh.c.a($$0, $$2, new mi().a(mj.a, $$3), this.c));
      })));
      this.a($$0, mi.a($$0, "_0"));
   }

   static lu b(cva $$0, agi $$1, agi $$2) {
      return lx.a($$0)
         .a(ly.a(dhy.w).a(false, ma.a().a(mb.c, $$1)).a(true, ma.a().a(mb.c, $$2)))
         .a(
            ly.a(dhy.U, dhy.R)
               .a(dht.a, hx.f, ma.a().a(mb.b, mb.a.b))
               .a(dht.a, hx.e, ma.a().a(mb.b, mb.a.d))
               .a(dht.a, hx.d, ma.a().a(mb.b, mb.a.c))
               .a(dht.a, hx.c, ma.a())
               .a(dht.b, hx.f, ma.a().a(mb.b, mb.a.b).a(mb.a, mb.a.b).a(mb.d, true))
               .a(dht.b, hx.e, ma.a().a(mb.b, mb.a.d).a(mb.a, mb.a.b).a(mb.d, true))
               .a(dht.b, hx.d, ma.a().a(mb.b, mb.a.c).a(mb.a, mb.a.b).a(mb.d, true))
               .a(dht.b, hx.c, ma.a().a(mb.a, mb.a.b).a(mb.d, true))
               .a(dht.c, hx.f, ma.a().a(mb.b, mb.a.d).a(mb.a, mb.a.c))
               .a(dht.c, hx.e, ma.a().a(mb.b, mb.a.b).a(mb.a, mb.a.c))
               .a(dht.c, hx.d, ma.a().a(mb.a, mb.a.c))
               .a(dht.c, hx.c, ma.a().a(mb.b, mb.a.c).a(mb.a, mb.a.c))
         );
   }

   private static ly.d<hx, die, did, Boolean> a(ly.d<hx, die, did, Boolean> $$0, die $$1, agi $$2, agi $$3, agi $$4, agi $$5) {
      return $$0.a(hx.f, $$1, did.a, false, ma.a().a(mb.c, $$2))
         .a(hx.d, $$1, did.a, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
         .a(hx.e, $$1, did.a, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.c))
         .a(hx.c, $$1, did.a, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.d))
         .a(hx.f, $$1, did.b, false, ma.a().a(mb.c, $$4))
         .a(hx.d, $$1, did.b, false, ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
         .a(hx.e, $$1, did.b, false, ma.a().a(mb.c, $$4).a(mb.b, mb.a.c))
         .a(hx.c, $$1, did.b, false, ma.a().a(mb.c, $$4).a(mb.b, mb.a.d))
         .a(hx.f, $$1, did.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
         .a(hx.d, $$1, did.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
         .a(hx.e, $$1, did.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
         .a(hx.c, $$1, did.a, true, ma.a().a(mb.c, $$3))
         .a(hx.f, $$1, did.b, true, ma.a().a(mb.c, $$5).a(mb.b, mb.a.d))
         .a(hx.d, $$1, did.b, true, ma.a().a(mb.c, $$5))
         .a(hx.e, $$1, did.b, true, ma.a().a(mb.c, $$5).a(mb.b, mb.a.b))
         .a(hx.c, $$1, did.b, true, ma.a().a(mb.c, $$5).a(mb.b, mb.a.c));
   }

   private static lu a(cva $$0, agi $$1, agi $$2, agi $$3, agi $$4, agi $$5, agi $$6, agi $$7, agi $$8) {
      return lx.a($$0).a(a(a(ly.a(dhy.R, dhy.ae, dhy.be, dhy.u), die.b, $$1, $$2, $$3, $$4), die.a, $$5, $$6, $$7, $$8));
   }

   static lu a(cva $$0, agi $$1, agi $$2, agi $$3, agi $$4, agi $$5) {
      return lw.a($$0)
         .a(ma.a().a(mb.c, $$1))
         .a(lv.a().a(dhy.L, true), ma.a().a(mb.c, $$2).a(mb.d, false))
         .a(lv.a().a(dhy.M, true), ma.a().a(mb.c, $$3).a(mb.d, false))
         .a(lv.a().a(dhy.N, true), ma.a().a(mb.c, $$4).a(mb.d, false))
         .a(lv.a().a(dhy.O, true), ma.a().a(mb.c, $$5).a(mb.d, false));
   }

   static lu c(cva $$0, agi $$1, agi $$2) {
      return lw.a($$0)
         .a(ma.a().a(mb.c, $$1))
         .a(lv.a().a(dhy.L, true), ma.a().a(mb.c, $$2).a(mb.d, true))
         .a(lv.a().a(dhy.M, true), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, true))
         .a(lv.a().a(dhy.N, true), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, true))
         .a(lv.a().a(dhy.O, true), ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, true));
   }

   static lu a(cva $$0, agi $$1, agi $$2, agi $$3) {
      return lw.a($$0)
         .a(lv.a().a(dhy.J, true), ma.a().a(mb.c, $$1))
         .a(lv.a().a(dhy.X, diu.b), ma.a().a(mb.c, $$2).a(mb.d, true))
         .a(lv.a().a(dhy.W, diu.b), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, true))
         .a(lv.a().a(dhy.Y, diu.b), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, true))
         .a(lv.a().a(dhy.Z, diu.b), ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, true))
         .a(lv.a().a(dhy.X, diu.c), ma.a().a(mb.c, $$3).a(mb.d, true))
         .a(lv.a().a(dhy.W, diu.c), ma.a().a(mb.c, $$3).a(mb.b, mb.a.b).a(mb.d, true))
         .a(lv.a().a(dhy.Y, diu.c), ma.a().a(mb.c, $$3).a(mb.b, mb.a.c).a(mb.d, true))
         .a(lv.a().a(dhy.Z, diu.c), ma.a().a(mb.c, $$3).a(mb.b, mb.a.d).a(mb.d, true));
   }

   static lu a(cva $$0, agi $$1, agi $$2, agi $$3, agi $$4, boolean $$5) {
      return lx.a($$0, ma.a().a(mb.d, $$5))
         .a(c())
         .a(
            ly.a(dhy.q, dhy.u)
               .a(false, false, ma.a().a(mb.c, $$2))
               .a(true, false, ma.a().a(mb.c, $$4))
               .a(false, true, ma.a().a(mb.c, $$1))
               .a(true, true, ma.a().a(mb.c, $$3))
         );
   }

   static lu b(cva $$0, agi $$1, agi $$2, agi $$3) {
      return lx.a($$0)
         .a(
            ly.a(dhy.R, dhy.af, dhy.bi)
               .a(hx.f, dih.b, dir.a, ma.a().a(mb.c, $$2))
               .a(hx.e, dih.b, dir.a, ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dih.b, dir.a, ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dih.b, dir.a, ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dih.b, dir.e, ma.a().a(mb.c, $$3))
               .a(hx.e, dih.b, dir.e, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dih.b, dir.e, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dih.b, dir.e, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dih.b, dir.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.e, dih.b, dir.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.d, dih.b, dir.d, ma.a().a(mb.c, $$3))
               .a(hx.c, dih.b, dir.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.f, dih.b, dir.c, ma.a().a(mb.c, $$1))
               .a(hx.e, dih.b, dir.c, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dih.b, dir.c, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dih.b, dir.c, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dih.b, dir.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.e, dih.b, dir.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.d, dih.b, dir.b, ma.a().a(mb.c, $$1))
               .a(hx.c, dih.b, dir.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.f, dih.a, dir.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.e, dih.a, dir.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dih.a, dir.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dih.a, dir.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dih.a, dir.e, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.e, dih.a, dir.e, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.d, dih.a, dir.e, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.c, dih.a, dir.e, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.f, dih.a, dir.d, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.e, dih.a, dir.d, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dih.a, dir.d, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dih.a, dir.d, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.f, dih.a, dir.c, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.e, dih.a, dir.c, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
               .a(hx.d, dih.a, dir.c, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.c, dih.a, dir.c, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.f, dih.a, dir.b, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.d, true))
               .a(hx.e, dih.a, dir.b, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.c).a(mb.d, true))
               .a(hx.d, dih.a, dir.b, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.b).a(mb.d, true))
               .a(hx.c, dih.a, dir.b, ma.a().a(mb.c, $$1).a(mb.a, mb.a.c).a(mb.b, mb.a.d).a(mb.d, true))
         );
   }

   private static lu c(cva $$0, agi $$1, agi $$2, agi $$3) {
      return lx.a($$0)
         .a(
            ly.a(dhy.R, dhy.af, dhy.u)
               .a(hx.c, dih.b, false, ma.a().a(mb.c, $$2))
               .a(hx.d, dih.b, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.c))
               .a(hx.f, dih.b, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
               .a(hx.e, dih.b, false, ma.a().a(mb.c, $$2).a(mb.b, mb.a.d))
               .a(hx.c, dih.a, false, ma.a().a(mb.c, $$1))
               .a(hx.d, dih.a, false, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c))
               .a(hx.f, dih.a, false, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b))
               .a(hx.e, dih.a, false, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d))
               .a(hx.c, dih.b, true, ma.a().a(mb.c, $$3))
               .a(hx.d, dih.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               .a(hx.f, dih.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(hx.e, dih.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
               .a(hx.c, dih.a, true, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.c))
               .a(hx.d, dih.a, true, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.a))
               .a(hx.f, dih.a, true, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.d))
               .a(hx.e, dih.a, true, ma.a().a(mb.c, $$3).a(mb.a, mb.a.c).a(mb.b, mb.a.b))
         );
   }

   private static lu d(cva $$0, agi $$1, agi $$2, agi $$3) {
      return lx.a($$0)
         .a(
            ly.a(dhy.R, dhy.af, dhy.u)
               .a(hx.c, dih.b, false, ma.a().a(mb.c, $$2))
               .a(hx.d, dih.b, false, ma.a().a(mb.c, $$2))
               .a(hx.f, dih.b, false, ma.a().a(mb.c, $$2))
               .a(hx.e, dih.b, false, ma.a().a(mb.c, $$2))
               .a(hx.c, dih.a, false, ma.a().a(mb.c, $$1))
               .a(hx.d, dih.a, false, ma.a().a(mb.c, $$1))
               .a(hx.f, dih.a, false, ma.a().a(mb.c, $$1))
               .a(hx.e, dih.a, false, ma.a().a(mb.c, $$1))
               .a(hx.c, dih.b, true, ma.a().a(mb.c, $$3))
               .a(hx.d, dih.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               .a(hx.f, dih.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(hx.e, dih.b, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
               .a(hx.c, dih.a, true, ma.a().a(mb.c, $$3))
               .a(hx.d, dih.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               .a(hx.f, dih.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(hx.e, dih.a, true, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
         );
   }

   static lx c(cva $$0, agi $$1) {
      return lx.a($$0, ma.a().a(mb.c, $$1));
   }

   private static ly f() {
      return ly.a(dhy.I).a(hx.a.b, ma.a()).a(hx.a.c, ma.a().a(mb.a, mb.a.b)).a(hx.a.a, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.b));
   }

   static lu a(cva $$0, mi $$1, BiConsumer<agi, Supplier<JsonElement>> $$2) {
      agi $$3 = mh.f.a($$0, $$1, $$2);
      agi $$4 = mh.g.a($$0, $$1, $$2);
      agi $$5 = mh.h.a($$0, $$1, $$2);
      agi $$6 = mh.i.a($$0, $$1, $$2);
      return lx.a($$0, ma.a().a(mb.c, $$6)).a(ly.a(dhy.I).a(hx.a.a, ma.a().a(mb.c, $$3)).a(hx.a.b, ma.a().a(mb.c, $$4)).a(hx.a.c, ma.a().a(mb.c, $$5)));
   }

   static lu d(cva $$0, agi $$1) {
      return lx.a($$0, ma.a().a(mb.c, $$1)).a(f());
   }

   private void e(cva $$0, agi $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cva $$0, mk.a $$1) {
      agi $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cva $$0, mk.a $$1) {
      agi $$2 = $$1.create($$0, this.c);
      this.b.accept(lx.a($$0, ma.a().a(mb.c, $$2)).a(b()));
   }

   static lu d(cva $$0, agi $$1, agi $$2) {
      return lx.a($$0)
         .a(
            ly.a(dhy.I)
               .a(hx.a.b, ma.a().a(mb.c, $$1))
               .a(hx.a.c, ma.a().a(mb.c, $$2).a(mb.a, mb.a.b))
               .a(hx.a.a, ma.a().a(mb.c, $$2).a(mb.a, mb.a.b).a(mb.b, mb.a.b))
         );
   }

   private void a(cva $$0, mk.a $$1, mk.a $$2) {
      agi $$3 = $$1.create($$0, this.c);
      agi $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private agi a(cva $$0, String $$1, mg $$2, Function<agi, mi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mi.a($$0, $$1)), this.c);
   }

   static lu e(cva $$0, agi $$1, agi $$2) {
      return lx.a($$0).a(a(dhy.w, $$2, $$1));
   }

   static lu e(cva $$0, agi $$1, agi $$2, agi $$3) {
      return lx.a($$0).a(ly.a(dhy.bh).a(diq.b, ma.a().a(mb.c, $$1)).a(diq.a, ma.a().a(mb.c, $$2)).a(diq.c, ma.a().a(mb.c, $$3)));
   }

   public void a(cva $$0) {
      this.b($$0, mk.a);
   }

   public void b(cva $$0, mk.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cva $$0, mi $$1, mg $$2) {
      agi $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private lr.b h(cva $$0) {
      mk $$1 = this.g.getOrDefault($$0, mk.a.get($$0));
      return new lr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cva $$0, cva $$1, cva $$2) {
      mi $$3 = mi.u($$0);
      agi $$4 = mh.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(cva $$0) {
      mi $$1 = mi.t($$0);
      agi $$2 = mh.t.a($$0, $$1, this.c);
      agi $$3 = mh.u.a($$0, $$1, this.c);
      agi $$4 = mh.v.a($$0, $$1, this.c);
      agi $$5 = mh.w.a($$0, $$1, this.c);
      agi $$6 = mh.x.a($$0, $$1, this.c);
      agi $$7 = mh.y.a($$0, $$1, this.c);
      agi $$8 = mh.z.a($$0, $$1, this.c);
      agi $$9 = mh.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(cva $$0, cva $$1) {
      agi $$2 = mh.t.a($$0);
      agi $$3 = mh.u.a($$0);
      agi $$4 = mh.v.a($$0);
      agi $$5 = mh.w.a($$0);
      agi $$6 = mh.x.a($$0);
      agi $$7 = mh.y.a($$0);
      agi $$8 = mh.z.a($$0);
      agi $$9 = mh.A.a($$0);
      this.a($$1, mf.a($$0.k()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cva $$0) {
      mi $$1 = mi.b($$0);
      agi $$2 = mh.ai.a($$0, $$1, this.c);
      agi $$3 = mh.aj.a($$0, $$1, this.c);
      agi $$4 = mh.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cva $$0) {
      mi $$1 = mi.b($$0);
      agi $$2 = mh.af.a($$0, $$1, this.c);
      agi $$3 = mh.ag.a($$0, $$1, this.c);
      agi $$4 = mh.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(cva $$0, cva $$1) {
      agi $$2 = mh.af.a($$0);
      agi $$3 = mh.ag.a($$0);
      agi $$4 = mh.ah.a($$0);
      this.a($$1, mf.a($$0.k()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(cvc.sD);
      agi $$0 = mf.a(cvc.sD);
      agi $$1 = mf.a(cvc.sD, "_partial_tilt");
      agi $$2 = mf.a(cvc.sD, "_full_tilt");
      this.b
         .accept(
            lx.a(cvc.sD)
               .a(b())
               .a(ly.a(dhy.bl).a(dit.a, ma.a().a(mb.c, $$0)).a(dit.b, ma.a().a(mb.c, $$0)).a(dit.c, ma.a().a(mb.c, $$1)).a(dit.d, ma.a().a(mb.c, $$2)))
         );
   }

   private lr.f l(cva $$0) {
      return new lr.f(mi.n($$0));
   }

   private void m(cva $$0) {
      this.c($$0, $$0);
   }

   private void c(cva $$0, cva $$1) {
      this.b.accept(c($$0, mf.a($$1)));
   }

   private void a(cva $$0, lr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cva $$0, lr.e $$1, mi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cva $$0, lr.e $$1) {
      mi $$2 = mi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cva $$0, lr.e $$1, mi $$2) {
      agi $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cva $$0, lr.e $$1, dil<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         ly $$4 = ly.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mi $$5 = mi.c(mi.a($$0, $$4x));
            agi $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return ma.a().a(mb.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(lx.a($$0).a($$4));
      }
   }

   private void a(cva $$0, cva $$1, lr.e $$2) {
      this.a($$0, $$2);
      mi $$3 = mi.d($$0);
      agi $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(cva $$0, cva $$1) {
      mk $$2 = mk.o.get($$0);
      agi $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      agi $$4 = mh.aA.a($$1, $$2.b(), this.c);
      this.b.accept(lx.a($$1, ma.a().a(mb.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(cva $$0, cva $$1) {
      this.a($$0.k());
      mi $$2 = mi.h($$0);
      mi $$3 = mi.a($$0, $$1);
      agi $$4 = mh.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            lx.a($$1, ma.a().a(mb.c, $$4))
               .a(ly.a(dhy.R).a(hx.e, ma.a()).a(hx.d, ma.a().a(mb.b, mb.a.d)).a(hx.c, ma.a().a(mb.b, mb.a.b)).a(hx.f, ma.a().a(mb.b, mb.a.c)))
         );
      this.b.accept(lx.a($$0).a(ly.a(dhy.av).a($$2x -> ma.a().a(mb.c, mh.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cva $$0 = cvc.kC;
      this.a($$0.k());
      agi $$1 = mf.a($$0, "_top");
      agi $$2 = mf.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cva $$0 = cvc.kB;
      this.a($$0.k());
      ly $$1 = ly.a(dao.d, dhy.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> ma.a().a(mb.c, mf.a($$0, "_top_stage_" + $$1x));
            case b -> ma.a().a(mb.c, mf.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(lx.a($$0).a($$1));
   }

   private void a(cva $$0, cva $$1, cva $$2, cva $$3, cva $$4, cva $$5, cva $$6, cva $$7) {
      this.a($$0, lr.e.b);
      this.a($$1, lr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(cva $$0, lr.e $$1) {
      this.a($$0, "_top");
      agi $$2 = this.a($$0, "_top", $$1.a(), mi::c);
      agi $$3 = this.a($$0, "_bottom", $$1.a(), mi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cvc.iD, "_front");
      agi $$0 = mf.a(cvc.iD, "_top");
      agi $$1 = this.a(cvc.iD, "_bottom", lr.e.b.a(), mi::c);
      this.f(cvc.iD, $$0, $$1);
   }

   private void k() {
      agi $$0 = this.a(cvc.bx, "_top", mh.bi, mi::a);
      agi $$1 = this.a(cvc.bx, "_bottom", mh.bi, mi::a);
      this.f(cvc.bx, $$0, $$1);
   }

   private void l() {
      this.c(cvc.sF);
      agi $$0 = mf.a(cvc.sF, "_top");
      agi $$1 = mf.a(cvc.sF, "_bottom");
      this.b.accept(lx.a(cvc.sF).a(b()).a(ly.a(dhy.ae).a(die.b, ma.a().a(mb.c, $$1)).a(die.a, ma.a().a(mb.c, $$0))));
   }

   private void f(cva $$0, agi $$1, agi $$2) {
      this.b.accept(lx.a($$0).a(ly.a(dhy.ae).a(die.b, ma.a().a(mb.c, $$2)).a(die.a, ma.a().a(mb.c, $$1))));
   }

   private void n(cva $$0) {
      mi $$1 = mi.e($$0);
      mi $$2 = mi.e(mi.a($$0, "_corner"));
      agi $$3 = mh.aq.a($$0, $$1, this.c);
      agi $$4 = mh.ar.a($$0, $$2, this.c);
      agi $$5 = mh.as.a($$0, $$1, this.c);
      agi $$6 = mh.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            lx.a($$0)
               .a(
                  ly.a(dhy.ag)
                     .a(dim.a, ma.a().a(mb.c, $$3))
                     .a(dim.b, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
                     .a(dim.c, ma.a().a(mb.c, $$5).a(mb.b, mb.a.b))
                     .a(dim.d, ma.a().a(mb.c, $$6).a(mb.b, mb.a.b))
                     .a(dim.e, ma.a().a(mb.c, $$5))
                     .a(dim.f, ma.a().a(mb.c, $$6))
                     .a(dim.g, ma.a().a(mb.c, $$4))
                     .a(dim.h, ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
                     .a(dim.i, ma.a().a(mb.c, $$4).a(mb.b, mb.a.c))
                     .a(dim.j, ma.a().a(mb.c, $$4).a(mb.b, mb.a.d))
               )
         );
   }

   private void o(cva $$0) {
      agi $$1 = this.a($$0, "", mh.aq, mi::e);
      agi $$2 = this.a($$0, "", mh.as, mi::e);
      agi $$3 = this.a($$0, "", mh.at, mi::e);
      agi $$4 = this.a($$0, "_on", mh.aq, mi::e);
      agi $$5 = this.a($$0, "_on", mh.as, mi::e);
      agi $$6 = this.a($$0, "_on", mh.at, mi::e);
      ly $$7 = ly.a(dhy.w, dhy.ah).a(($$6x, $$7x) -> {
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

   private lr.a a(agi $$0, cva $$1) {
      return new lr.a($$0, $$1);
   }

   private lr.a f(cva $$0, cva $$1) {
      return new lr.a(mf.a($$0), $$1);
   }

   private void a(cva $$0, cle $$1) {
      agi $$2 = mh.Y.a($$0, mi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cva $$0, agi $$1) {
      agi $$2 = mh.Y.a($$0, mi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(cva $$0, cva $$1) {
      this.a($$0);
      agi $$2 = mk.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cva $$0) {
      this.a($$0.k());
      agi $$1 = mk.j.create($$0, this.c);
      agi $$2 = mk.k.create($$0, this.c);
      agi $$3 = mk.l.create($$0, this.c);
      agi $$4 = mk.m.create($$0, this.c);
      this.b
         .accept(
            lw.a($$0)
               .a(lv.a().a(dhy.S, 1, 2, 3, 4).a(dhy.R, hx.c), ma.a().a(mb.c, $$1))
               .a(lv.a().a(dhy.S, 1, 2, 3, 4).a(dhy.R, hx.f), ma.a().a(mb.c, $$1).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.S, 1, 2, 3, 4).a(dhy.R, hx.d), ma.a().a(mb.c, $$1).a(mb.b, mb.a.c))
               .a(lv.a().a(dhy.S, 1, 2, 3, 4).a(dhy.R, hx.e), ma.a().a(mb.c, $$1).a(mb.b, mb.a.d))
               .a(lv.a().a(dhy.S, 2, 3, 4).a(dhy.R, hx.c), ma.a().a(mb.c, $$2))
               .a(lv.a().a(dhy.S, 2, 3, 4).a(dhy.R, hx.f), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.S, 2, 3, 4).a(dhy.R, hx.d), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c))
               .a(lv.a().a(dhy.S, 2, 3, 4).a(dhy.R, hx.e), ma.a().a(mb.c, $$2).a(mb.b, mb.a.d))
               .a(lv.a().a(dhy.S, 3, 4).a(dhy.R, hx.c), ma.a().a(mb.c, $$3))
               .a(lv.a().a(dhy.S, 3, 4).a(dhy.R, hx.f), ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.S, 3, 4).a(dhy.R, hx.d), ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               .a(lv.a().a(dhy.S, 3, 4).a(dhy.R, hx.e), ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
               .a(lv.a().a(dhy.S, 4).a(dhy.R, hx.c), ma.a().a(mb.c, $$4))
               .a(lv.a().a(dhy.S, 4).a(dhy.R, hx.f), ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.S, 4).a(dhy.R, hx.d), ma.a().a(mb.c, $$4).a(mb.b, mb.a.c))
               .a(lv.a().a(dhy.S, 4).a(dhy.R, hx.e), ma.a().a(mb.c, $$4).a(mb.b, mb.a.d))
         );
   }

   private void a(mk.a $$0, cva... $$1) {
      for (cva $$2 : $$1) {
         agi $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(mk.a $$0, cva... $$1) {
      for (cva $$2 : $$1) {
         agi $$3 = $$0.create($$2, this.c);
         this.b.accept(lx.a($$2, ma.a().a(mb.c, $$3)).a(c()));
      }
   }

   private void h(cva $$0, cva $$1) {
      this.a($$0);
      mi $$2 = mi.b($$0, $$1);
      agi $$3 = mh.aG.a($$1, $$2, this.c);
      agi $$4 = mh.aH.a($$1, $$2, this.c);
      agi $$5 = mh.aI.a($$1, $$2, this.c);
      agi $$6 = mh.aE.a($$1, $$2, this.c);
      agi $$7 = mh.aF.a($$1, $$2, this.c);
      cle $$8 = $$1.k();
      mh.bv.a(mf.a($$8), mi.F($$0), this.c);
      this.b
         .accept(
            lw.a($$1)
               .a(ma.a().a(mb.c, $$3))
               .a(lv.a().a(dhy.L, true), ma.a().a(mb.c, $$4))
               .a(lv.a().a(dhy.M, true), ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.N, true), ma.a().a(mb.c, $$5))
               .a(lv.a().a(dhy.O, true), ma.a().a(mb.c, $$5).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.L, false), ma.a().a(mb.c, $$6))
               .a(lv.a().a(dhy.M, false), ma.a().a(mb.c, $$7))
               .a(lv.a().a(dhy.N, false), ma.a().a(mb.c, $$7).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.O, false), ma.a().a(mb.c, $$6).a(mb.b, mb.a.d))
         );
   }

   private void q(cva $$0) {
      mi $$1 = mi.z($$0);
      agi $$2 = mh.aJ.a($$0, $$1, this.c);
      agi $$3 = this.a($$0, "_conditional", mh.aJ, $$1x -> $$1.c(mj.i, $$1x));
      this.b.accept(lx.a($$0).a(a(dhy.c, $$3, $$2)).a(e()));
   }

   private void r(cva $$0) {
      agi $$1 = mk.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<ma> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> ma.a().a(mb.c, mf.a(cvc.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cvc.mZ);
      this.b
         .accept(
            lw.a(cvc.mZ)
               .a(lv.a().a(dhy.aq, 0), this.a(0))
               .a(lv.a().a(dhy.aq, 1), this.a(1))
               .a(lv.a().a(dhy.bk, dhu.b), ma.a().a(mb.c, mf.a(cvc.mZ, "_small_leaves")))
               .a(lv.a().a(dhy.bk, dhu.c), ma.a().a(mb.c, mf.a(cvc.mZ, "_large_leaves")))
         );
   }

   private ly n() {
      return ly.a(dhy.P)
         .a(hx.a, ma.a().a(mb.a, mb.a.c))
         .a(hx.b, ma.a())
         .a(hx.c, ma.a().a(mb.a, mb.a.b))
         .a(hx.d, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.c))
         .a(hx.e, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.d))
         .a(hx.f, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.b));
   }

   private void o() {
      agi $$0 = mi.a(cvc.nU, "_top_open");
      this.b
         .accept(
            lx.a(cvc.nU)
               .a(this.n())
               .a(
                  ly.a(dhy.u)
                     .a(false, ma.a().a(mb.c, mk.e.create(cvc.nU, this.c)))
                     .a(true, ma.a().a(mb.c, mk.e.get(cvc.nU).a($$1 -> $$1.a(mj.f, $$0)).a(cvc.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ly a(dil<T> $$0, T $$1, agi $$2, agi $$3) {
      ma $$4 = ma.a().a(mb.c, $$2);
      ma $$5 = ma.a().a(mb.c, $$3);
      return ly.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cva $$0, Function<cva, mi> $$1) {
      mi $$2 = $$1.apply($$0).b(mj.i, mj.c);
      mi $$3 = $$2.c(mj.g, mi.a($$0, "_front_honey"));
      agi $$4 = mh.o.a($$0, $$2, this.c);
      agi $$5 = mh.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(lx.a($$0).a(b()).a(a(dhy.aN, 5, $$5, $$4)));
   }

   private void a(cva $$0, dil<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<agi> $$3 = new Int2ObjectOpenHashMap();
         ly $$4 = ly.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            agi $$5 = (agi)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mh.aT, mi::g));
            return ma.a().a(mb.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(lx.a($$0).a($$4));
      }
   }

   private void p() {
      agi $$0 = mf.a(cvc.od, "_floor");
      agi $$1 = mf.a(cvc.od, "_ceiling");
      agi $$2 = mf.a(cvc.od, "_wall");
      agi $$3 = mf.a(cvc.od, "_between_walls");
      this.a(clm.we);
      this.b
         .accept(
            lx.a(cvc.od)
               .a(
                  ly.a(dhy.R, dhy.V)
                     .a(hx.c, dhw.a, ma.a().a(mb.c, $$0))
                     .a(hx.d, dhw.a, ma.a().a(mb.c, $$0).a(mb.b, mb.a.c))
                     .a(hx.f, dhw.a, ma.a().a(mb.c, $$0).a(mb.b, mb.a.b))
                     .a(hx.e, dhw.a, ma.a().a(mb.c, $$0).a(mb.b, mb.a.d))
                     .a(hx.c, dhw.b, ma.a().a(mb.c, $$1))
                     .a(hx.d, dhw.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c))
                     .a(hx.f, dhw.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b))
                     .a(hx.e, dhw.b, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d))
                     .a(hx.c, dhw.c, ma.a().a(mb.c, $$2).a(mb.b, mb.a.d))
                     .a(hx.d, dhw.c, ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
                     .a(hx.f, dhw.c, ma.a().a(mb.c, $$2))
                     .a(hx.e, dhw.c, ma.a().a(mb.c, $$2).a(mb.b, mb.a.c))
                     .a(hx.d, dhw.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
                     .a(hx.c, dhw.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.d))
                     .a(hx.f, dhw.d, ma.a().a(mb.c, $$3))
                     .a(hx.e, dhw.d, ma.a().a(mb.c, $$3).a(mb.b, mb.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            lx.a(cvc.nZ, ma.a().a(mb.c, mf.a(cvc.nZ)))
               .a(
                  ly.a(dhy.U, dhy.R)
                     .a(dht.a, hx.c, ma.a())
                     .a(dht.a, hx.f, ma.a().a(mb.b, mb.a.b))
                     .a(dht.a, hx.d, ma.a().a(mb.b, mb.a.c))
                     .a(dht.a, hx.e, ma.a().a(mb.b, mb.a.d))
                     .a(dht.b, hx.c, ma.a().a(mb.a, mb.a.b))
                     .a(dht.b, hx.f, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.b))
                     .a(dht.b, hx.d, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.c))
                     .a(dht.b, hx.e, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.d))
                     .a(dht.c, hx.d, ma.a().a(mb.a, mb.a.c))
                     .a(dht.c, hx.e, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.b))
                     .a(dht.c, hx.c, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.c))
                     .a(dht.c, hx.f, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.d))
               )
         );
   }

   private void d(cva $$0, mk.a $$1) {
      agi $$2 = $$1.create($$0, this.c);
      agi $$3 = mi.a($$0, "_front_on");
      agi $$4 = $$1.get($$0).a($$1x -> $$1x.a(mj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(lx.a($$0).a(a(dhy.r, $$4, $$2)).a(b()));
   }

   private void a(cva... $$0) {
      agi $$1 = mf.a("campfire_off");

      for (cva $$2 : $$0) {
         agi $$3 = mh.ba.a($$2, mi.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(lx.a($$2).a(a(dhy.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cva $$0) {
      agi $$1 = mh.br.a($$0, mi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cva $$0) {
      agi $$1;
      if ($$0 == cvc.tj) {
         $$1 = mh.bt.a($$0, mi.m($$0), this.c);
      } else {
         $$1 = mh.bs.a($$0, mi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mi $$0 = mi.a(mi.G(cvc.cl), mi.G(cvc.n));
      agi $$1 = mh.i.a(cvc.cl, $$0, this.c);
      this.b.accept(c(cvc.cl, $$1));
   }

   private void s() {
      this.a(clm.lG);
      this.b
         .accept(
            lw.a(cvc.cw)
               .a(
                  lv.b(
                     lv.a().a(dhy.ab, din.c).a(dhy.aa, din.c).a(dhy.ac, din.c).a(dhy.ad, din.c),
                     lv.a().a(dhy.ab, din.b, din.a).a(dhy.aa, din.b, din.a),
                     lv.a().a(dhy.aa, din.b, din.a).a(dhy.ac, din.b, din.a),
                     lv.a().a(dhy.ac, din.b, din.a).a(dhy.ad, din.b, din.a),
                     lv.a().a(dhy.ad, din.b, din.a).a(dhy.ab, din.b, din.a)
                  ),
                  ma.a().a(mb.c, mf.a("redstone_dust_dot"))
               )
               .a(lv.a().a(dhy.ab, din.b, din.a), ma.a().a(mb.c, mf.a("redstone_dust_side0")))
               .a(lv.a().a(dhy.ac, din.b, din.a), ma.a().a(mb.c, mf.a("redstone_dust_side_alt0")))
               .a(lv.a().a(dhy.aa, din.b, din.a), ma.a().a(mb.c, mf.a("redstone_dust_side_alt1")).a(mb.b, mb.a.d))
               .a(lv.a().a(dhy.ad, din.b, din.a), ma.a().a(mb.c, mf.a("redstone_dust_side1")).a(mb.b, mb.a.d))
               .a(lv.a().a(dhy.ab, din.a), ma.a().a(mb.c, mf.a("redstone_dust_up")))
               .a(lv.a().a(dhy.aa, din.a), ma.a().a(mb.c, mf.a("redstone_dust_up")).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.ac, din.a), ma.a().a(mb.c, mf.a("redstone_dust_up")).a(mb.b, mb.a.c))
               .a(lv.a().a(dhy.ad, din.a), ma.a().a(mb.c, mf.a("redstone_dust_up")).a(mb.b, mb.a.d))
         );
   }

   private void t() {
      this.a(clm.lK);
      this.b
         .accept(
            lx.a(cvc.gY)
               .a(c())
               .a(
                  ly.a(dhy.bd, dhy.w)
                     .a(dib.a, false, ma.a().a(mb.c, mf.a(cvc.gY)))
                     .a(dib.a, true, ma.a().a(mb.c, mf.a(cvc.gY, "_on")))
                     .a(dib.b, false, ma.a().a(mb.c, mf.a(cvc.gY, "_subtract")))
                     .a(dib.b, true, ma.a().a(mb.c, mf.a(cvc.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mi $$0 = mi.a(cvc.jR);
      mi $$1 = mi.a(mi.a(cvc.jE, "_side"), $$0.a(mj.f));
      agi $$2 = mh.Z.a(cvc.jE, $$1, this.c);
      agi $$3 = mh.aa.a(cvc.jE, $$1, this.c);
      agi $$4 = mh.i.b(cvc.jE, "_double", $$1, this.c);
      this.b.accept(e(cvc.jE, $$2, $$3, $$4));
      this.b.accept(c(cvc.jR, mh.c.a(cvc.jR, $$0, this.c)));
   }

   private void v() {
      this.a(clm.sn);
      this.b
         .accept(
            lw.a(cvc.fs)
               .a(ma.a().a(mb.c, mi.G(cvc.fs)))
               .a(lv.a().a(dhy.k, true), ma.a().a(mb.c, mi.a(cvc.fs, "_bottle0")))
               .a(lv.a().a(dhy.l, true), ma.a().a(mb.c, mi.a(cvc.fs, "_bottle1")))
               .a(lv.a().a(dhy.m, true), ma.a().a(mb.c, mi.a(cvc.fs, "_bottle2")))
               .a(lv.a().a(dhy.k, false), ma.a().a(mb.c, mi.a(cvc.fs, "_empty0")))
               .a(lv.a().a(dhy.l, false), ma.a().a(mb.c, mi.a(cvc.fs, "_empty1")))
               .a(lv.a().a(dhy.m, false), ma.a().a(mb.c, mi.a(cvc.fs, "_empty2")))
         );
   }

   private void u(cva $$0) {
      agi $$1 = mh.bn.a($$0, mi.b($$0), this.c);
      agi $$2 = mf.a("mushroom_block_inside");
      this.b
         .accept(
            lw.a($$0)
               .a(lv.a().a(dhy.L, true), ma.a().a(mb.c, $$1))
               .a(lv.a().a(dhy.M, true), ma.a().a(mb.c, $$1).a(mb.b, mb.a.b).a(mb.d, true))
               .a(lv.a().a(dhy.N, true), ma.a().a(mb.c, $$1).a(mb.b, mb.a.c).a(mb.d, true))
               .a(lv.a().a(dhy.O, true), ma.a().a(mb.c, $$1).a(mb.b, mb.a.d).a(mb.d, true))
               .a(lv.a().a(dhy.J, true), ma.a().a(mb.c, $$1).a(mb.a, mb.a.d).a(mb.d, true))
               .a(lv.a().a(dhy.K, true), ma.a().a(mb.c, $$1).a(mb.a, mb.a.b).a(mb.d, true))
               .a(lv.a().a(dhy.L, false), ma.a().a(mb.c, $$2))
               .a(lv.a().a(dhy.M, false), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, false))
               .a(lv.a().a(dhy.N, false), ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, false))
               .a(lv.a().a(dhy.O, false), ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, false))
               .a(lv.a().a(dhy.J, false), ma.a().a(mb.c, $$2).a(mb.a, mb.a.d).a(mb.d, false))
               .a(lv.a().a(dhy.K, false), ma.a().a(mb.c, $$2).a(mb.a, mb.a.b).a(mb.d, false))
         );
      this.a($$0, mk.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(clm.ry);
      this.b
         .accept(
            lx.a(cvc.eg)
               .a(
                  ly.a(dhy.ay)
                     .a(0, ma.a().a(mb.c, mf.a(cvc.eg)))
                     .a(1, ma.a().a(mb.c, mf.a(cvc.eg, "_slice1")))
                     .a(2, ma.a().a(mb.c, mf.a(cvc.eg, "_slice2")))
                     .a(3, ma.a().a(mb.c, mf.a(cvc.eg, "_slice3")))
                     .a(4, ma.a().a(mb.c, mf.a(cvc.eg, "_slice4")))
                     .a(5, ma.a().a(mb.c, mf.a(cvc.eg, "_slice5")))
                     .a(6, ma.a().a(mb.c, mf.a(cvc.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mi $$0 = new mi()
         .a(mj.c, mi.a(cvc.nX, "_side3"))
         .a(mj.o, mi.G(cvc.t))
         .a(mj.n, mi.a(cvc.nX, "_top"))
         .a(mj.j, mi.a(cvc.nX, "_side3"))
         .a(mj.l, mi.a(cvc.nX, "_side3"))
         .a(mj.k, mi.a(cvc.nX, "_side1"))
         .a(mj.m, mi.a(cvc.nX, "_side2"));
      this.b.accept(c(cvc.nX, mh.a.a(cvc.nX, $$0, this.c)));
   }

   private void y() {
      mi $$0 = new mi()
         .a(mj.c, mi.a(cvc.ob, "_front"))
         .a(mj.o, mi.a(cvc.ob, "_bottom"))
         .a(mj.n, mi.a(cvc.ob, "_top"))
         .a(mj.j, mi.a(cvc.ob, "_front"))
         .a(mj.k, mi.a(cvc.ob, "_front"))
         .a(mj.l, mi.a(cvc.ob, "_side"))
         .a(mj.m, mi.a(cvc.ob, "_side"));
      this.b.accept(c(cvc.ob, mh.a.a(cvc.ob, $$0, this.c)));
   }

   private void a(cva $$0, cva $$1, BiFunction<cva, cva, mi> $$2) {
      mi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mh.a.a($$0, $$3, this.c)));
   }

   public void b(cva $$0) {
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
      mi $$0 = mi.k(cvc.eZ);
      this.b.accept(c(cvc.eZ, mf.a(cvc.eZ)));
      this.a(cvc.ee, $$0);
      this.a(cvc.ef, $$0);
   }

   private void a(cva $$0, mi $$1) {
      agi $$2 = mh.n.a($$0, $$1.c(mj.g, mi.G($$0)), this.c);
      this.b.accept(lx.a($$0, ma.a().a(mb.c, $$2)).a(b()));
   }

   private void A() {
      this.a(clm.so);
      this.m(cvc.ft);
      this.b.accept(c(cvc.fv, mh.bq.a(cvc.fv, mi.j(mi.a(cvc.H, "_still")), this.c)));
      this.b
         .accept(
            lx.a(cvc.fu)
               .a(
                  ly.a(czi.g)
                     .a(1, ma.a().a(mb.c, mh.bo.a(cvc.fu, "_level1", mi.j(mi.a(cvc.G, "_still")), this.c)))
                     .a(2, ma.a().a(mb.c, mh.bp.a(cvc.fu, "_level2", mi.j(mi.a(cvc.G, "_still")), this.c)))
                     .a(3, ma.a().a(mb.c, mh.bq.a(cvc.fu, "_full", mi.j(mi.a(cvc.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            lx.a(cvc.fw)
               .a(
                  ly.a(czi.g)
                     .a(1, ma.a().a(mb.c, mh.bo.a(cvc.fw, "_level1", mi.j(mi.G(cvc.qP)), this.c)))
                     .a(2, ma.a().a(mb.c, mh.bp.a(cvc.fw, "_level2", mi.j(mi.G(cvc.qP)), this.c)))
                     .a(3, ma.a().a(mb.c, mh.bq.a(cvc.fw, "_full", mi.j(mi.G(cvc.qP)), this.c)))
               )
         );
   }

   private void B() {
      mi $$0 = mi.b(cvc.kv);
      agi $$1 = mh.aC.a(cvc.kv, $$0, this.c);
      agi $$2 = this.a(cvc.kv, "_dead", mh.aC, $$1x -> $$0.c(mj.b, $$1x));
      this.b.accept(lx.a(cvc.kv).a(a(dhy.au, 5, $$2, $$1)));
   }

   private void C() {
      agi $$0 = mf.a(cvc.tq);
      agi $$1 = mf.a(cvc.tq, "_triggered");
      agi $$2 = mf.a(cvc.tq, "_crafting");
      agi $$3 = mf.a(cvc.tq, "_crafting_triggered");
      this.b
         .accept(
            lx.a(cvc.tq)
               .a(ly.a(dhy.T).a($$0x -> this.a($$0x, ma.a())))
               .a(
                  ly.a(dhy.A, cwt.b)
                     .a(false, false, ma.a().a(mb.c, $$0))
                     .a(true, true, ma.a().a(mb.c, $$3))
                     .a(true, false, ma.a().a(mb.c, $$1))
                     .a(false, true, ma.a().a(mb.c, $$2))
               )
         );
   }

   private void v(cva $$0) {
      mi $$1 = new mi().a(mj.f, mi.a(cvc.cD, "_top")).a(mj.i, mi.a(cvc.cD, "_side")).a(mj.g, mi.a($$0, "_front"));
      mi $$2 = new mi().a(mj.i, mi.a(cvc.cD, "_top")).a(mj.g, mi.a($$0, "_front_vertical"));
      agi $$3 = mh.n.a($$0, $$1, this.c);
      agi $$4 = mh.p.a($$0, $$2, this.c);
      this.b
         .accept(
            lx.a($$0)
               .a(
                  ly.a(dhy.P)
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
      agi $$0 = mf.a(cvc.fy);
      agi $$1 = mf.a(cvc.fy, "_filled");
      this.b.accept(lx.a(cvc.fy).a(ly.a(dhy.h).a(false, ma.a().a(mb.c, $$0)).a(true, ma.a().a(mb.c, $$1))).a(c()));
   }

   private void E() {
      agi $$0 = mf.a(cvc.ku, "_side");
      agi $$1 = mf.a(cvc.ku, "_noside");
      agi $$2 = mf.a(cvc.ku, "_noside1");
      agi $$3 = mf.a(cvc.ku, "_noside2");
      agi $$4 = mf.a(cvc.ku, "_noside3");
      this.b
         .accept(
            lw.a(cvc.ku)
               .a(lv.a().a(dhy.L, true), ma.a().a(mb.c, $$0))
               .a(lv.a().a(dhy.M, true), ma.a().a(mb.c, $$0).a(mb.b, mb.a.b).a(mb.d, true))
               .a(lv.a().a(dhy.N, true), ma.a().a(mb.c, $$0).a(mb.b, mb.a.c).a(mb.d, true))
               .a(lv.a().a(dhy.O, true), ma.a().a(mb.c, $$0).a(mb.b, mb.a.d).a(mb.d, true))
               .a(lv.a().a(dhy.J, true), ma.a().a(mb.c, $$0).a(mb.a, mb.a.d).a(mb.d, true))
               .a(lv.a().a(dhy.K, true), ma.a().a(mb.c, $$0).a(mb.a, mb.a.b).a(mb.d, true))
               .a(lv.a().a(dhy.L, false), ma.a().a(mb.c, $$1).a(mb.e, 2), ma.a().a(mb.c, $$2), ma.a().a(mb.c, $$3), ma.a().a(mb.c, $$4))
               .a(
                  lv.a().a(dhy.M, false),
                  ma.a().a(mb.c, $$2).a(mb.b, mb.a.b).a(mb.d, true),
                  ma.a().a(mb.c, $$3).a(mb.b, mb.a.b).a(mb.d, true),
                  ma.a().a(mb.c, $$4).a(mb.b, mb.a.b).a(mb.d, true),
                  ma.a().a(mb.c, $$1).a(mb.e, 2).a(mb.b, mb.a.b).a(mb.d, true)
               )
               .a(
                  lv.a().a(dhy.N, false),
                  ma.a().a(mb.c, $$3).a(mb.b, mb.a.c).a(mb.d, true),
                  ma.a().a(mb.c, $$4).a(mb.b, mb.a.c).a(mb.d, true),
                  ma.a().a(mb.c, $$1).a(mb.e, 2).a(mb.b, mb.a.c).a(mb.d, true),
                  ma.a().a(mb.c, $$2).a(mb.b, mb.a.c).a(mb.d, true)
               )
               .a(
                  lv.a().a(dhy.O, false),
                  ma.a().a(mb.c, $$4).a(mb.b, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$1).a(mb.e, 2).a(mb.b, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$2).a(mb.b, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$3).a(mb.b, mb.a.d).a(mb.d, true)
               )
               .a(
                  lv.a().a(dhy.J, false),
                  ma.a().a(mb.c, $$1).a(mb.e, 2).a(mb.a, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$4).a(mb.a, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$2).a(mb.a, mb.a.d).a(mb.d, true),
                  ma.a().a(mb.c, $$3).a(mb.a, mb.a.d).a(mb.d, true)
               )
               .a(
                  lv.a().a(dhy.K, false),
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
            lw.a(cvc.pc)
               .a(ma.a().a(mb.c, mi.G(cvc.pc)))
               .a(lv.a().a(dhy.aL, 1), ma.a().a(mb.c, mi.a(cvc.pc, "_contents1")))
               .a(lv.a().a(dhy.aL, 2), ma.a().a(mb.c, mi.a(cvc.pc, "_contents2")))
               .a(lv.a().a(dhy.aL, 3), ma.a().a(mb.c, mi.a(cvc.pc, "_contents3")))
               .a(lv.a().a(dhy.aL, 4), ma.a().a(mb.c, mi.a(cvc.pc, "_contents4")))
               .a(lv.a().a(dhy.aL, 5), ma.a().a(mb.c, mi.a(cvc.pc, "_contents5")))
               .a(lv.a().a(dhy.aL, 6), ma.a().a(mb.c, mi.a(cvc.pc, "_contents6")))
               .a(lv.a().a(dhy.aL, 7), ma.a().a(mb.c, mi.a(cvc.pc, "_contents7")))
               .a(lv.a().a(dhy.aL, 8), ma.a().a(mb.c, mi.a(cvc.pc, "_contents_ready")))
         );
   }

   private void w(cva $$0) {
      agi $$1 = mh.c.a($$0, mi.a($$0), this.c);
      agi $$2 = this.a($$0, "_powered", mh.c, mi::b);
      agi $$3 = this.a($$0, "_lit", mh.c, mi::b);
      agi $$4 = this.a($$0, "_lit_powered", mh.c, mi::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private lu a(cva $$0, agi $$1, agi $$2, agi $$3, agi $$4) {
      return lx.a($$0).a(ly.a(dhy.r, dhy.w).a(($$4x, $$5) -> $$4x ? ma.a().a(mb.c, $$5 ? $$4 : $$2) : ma.a().a(mb.c, $$5 ? $$3 : $$1)));
   }

   private void i(cva $$0, cva $$1) {
      agi $$2 = mf.a($$0);
      agi $$3 = mf.a($$0, "_powered");
      agi $$4 = mf.a($$0, "_lit");
      agi $$5 = mf.a($$0, "_lit_powered");
      this.a($$1, mf.a($$0.k()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(cva $$0) {
      this.c($$0);
      this.b.accept(lx.a($$0, ma.a().a(mb.c, mh.am.a($$0, mi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(cvc.qy);
      this.x(cvc.qx);
      this.x(cvc.qw);
      this.x(cvc.qv);
   }

   private void H() {
      this.c(cvc.st);
      ly.b<hx, dif> $$0 = ly.a(dhy.bm, dhy.bn);

      for (dif $$1 : dif.values()) {
         $$0.a(hx.b, $$1, this.a(hx.b, $$1));
      }

      for (dif $$2 : dif.values()) {
         $$0.a(hx.a, $$2, this.a(hx.a, $$2));
      }

      this.b.accept(lx.a(cvc.st).a($$0));
   }

   private ma a(hx $$0, dif $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mi $$3 = mi.c(mi.a(cvc.st, $$2));
      return ma.a().a(mb.c, mh.al.a(cvc.st, $$2, $$3, this.c));
   }

   private void y(cva $$0) {
      mi $$1 = new mi().a(mj.e, mi.G(cvc.dV)).a(mj.f, mi.G($$0)).a(mj.i, mi.a($$0, "_side"));
      this.b.accept(c($$0, mh.m.a($$0, $$1, this.c)));
   }

   private void I() {
      agi $$0 = mi.a(cvc.gZ, "_side");
      mi $$1 = new mi().a(mj.f, mi.a(cvc.gZ, "_top")).a(mj.i, $$0);
      mi $$2 = new mi().a(mj.f, mi.a(cvc.gZ, "_inverted_top")).a(mj.i, $$0);
      this.b
         .accept(
            lx.a(cvc.gZ)
               .a(ly.a(dhy.p).a(false, ma.a().a(mb.c, mh.aD.a(cvc.gZ, $$1, this.c))).a(true, ma.a().a(mb.c, mh.aD.a(mf.a(cvc.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(cva $$0) {
      this.b.accept(lx.a($$0, ma.a().a(mb.c, mf.a($$0))).a(this.n()));
   }

   private void J() {
      cva $$0 = cvc.ss;
      agi $$1 = mf.a($$0, "_on");
      agi $$2 = mf.a($$0);
      this.b.accept(lx.a($$0, ma.a().a(mb.c, mf.a($$0))).a(this.n()).a(a(dhy.w, $$1, $$2)));
   }

   private void K() {
      mi $$0 = new mi().a(mj.B, mi.G(cvc.j)).a(mj.f, mi.G(cvc.cC));
      mi $$1 = new mi().a(mj.B, mi.G(cvc.j)).a(mj.f, mi.a(cvc.cC, "_moist"));
      agi $$2 = mh.aU.a(cvc.cC, $$0, this.c);
      agi $$3 = mh.aU.a(mi.a(cvc.cC, "_moist"), $$1, this.c);
      this.b.accept(lx.a(cvc.cC).a(a(dhy.aQ, 7, $$3, $$2)));
   }

   private List<agi> A(cva $$0) {
      agi $$1 = mh.aV.a(mf.a($$0, "_floor0"), mi.v($$0), this.c);
      agi $$2 = mh.aV.a(mf.a($$0, "_floor1"), mi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<agi> B(cva $$0) {
      agi $$1 = mh.aW.a(mf.a($$0, "_side0"), mi.v($$0), this.c);
      agi $$2 = mh.aW.a(mf.a($$0, "_side1"), mi.w($$0), this.c);
      agi $$3 = mh.aX.a(mf.a($$0, "_side_alt0"), mi.v($$0), this.c);
      agi $$4 = mh.aX.a(mf.a($$0, "_side_alt1"), mi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<agi> C(cva $$0) {
      agi $$1 = mh.aY.a(mf.a($$0, "_up0"), mi.v($$0), this.c);
      agi $$2 = mh.aY.a(mf.a($$0, "_up1"), mi.w($$0), this.c);
      agi $$3 = mh.aZ.a(mf.a($$0, "_up_alt0"), mi.v($$0), this.c);
      agi $$4 = mh.aZ.a(mf.a($$0, "_up_alt1"), mi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<ma> a(List<agi> $$0, UnaryOperator<ma> $$1) {
      return $$0.stream().map($$0x -> ma.a().a(mb.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      lv $$0 = lv.a().a(dhy.L, false).a(dhy.M, false).a(dhy.N, false).a(dhy.O, false).a(dhy.J, false);
      List<agi> $$1 = this.A(cvc.cr);
      List<agi> $$2 = this.B(cvc.cr);
      List<agi> $$3 = this.C(cvc.cr);
      this.b
         .accept(
            lw.a(cvc.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(lv.b(lv.a().a(dhy.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(lv.b(lv.a().a(dhy.M, true), $$0), a($$2, $$0x -> $$0x.a(mb.b, mb.a.b)))
               .a(lv.b(lv.a().a(dhy.N, true), $$0), a($$2, $$0x -> $$0x.a(mb.b, mb.a.c)))
               .a(lv.b(lv.a().a(dhy.O, true), $$0), a($$2, $$0x -> $$0x.a(mb.b, mb.a.d)))
               .a(lv.a().a(dhy.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<agi> $$0 = this.A(cvc.cs);
      List<agi> $$1 = this.B(cvc.cs);
      this.b
         .accept(
            lw.a(cvc.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mb.b, mb.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mb.b, mb.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mb.b, mb.a.d)))
         );
   }

   private void D(cva $$0) {
      agi $$1 = mk.s.create($$0, this.c);
      agi $$2 = mk.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(lx.a($$0).a(a(dhy.j, $$2, $$1)));
   }

   private void N() {
      mi $$0 = mi.a(mi.a(cvc.ad, "_side"), mi.a(cvc.ad, "_top"));
      agi $$1 = mh.i.a(cvc.ad, $$0, this.c);
      this.b.accept(d(cvc.ad, $$1));
   }

   private void O() {
      this.a(clm.ad);
      cva $$0 = cvc.E;
      ly.b<Boolean, Integer> $$1 = ly.a(czu.d, czu.b);
      agi $$2 = mf.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         agi $$4 = mf.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, ma.a().a(mb.c, $$4));
         $$1.a(false, $$3, ma.a().a(mb.c, $$2));
      }

      this.b.accept(lx.a(cvc.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            lx.a(cvc.kI)
               .a(
                  ly.a(dhy.as)
                     .a(0, ma.a().a(mb.c, this.a(cvc.kI, "_0", mh.c, mi::b)))
                     .a(1, ma.a().a(mb.c, this.a(cvc.kI, "_1", mh.c, mi::b)))
                     .a(2, ma.a().a(mb.c, this.a(cvc.kI, "_2", mh.c, mi::b)))
                     .a(3, ma.a().a(mb.c, this.a(cvc.kI, "_3", mh.c, mi::b)))
               )
         );
   }

   private void Q() {
      agi $$0 = mi.G(cvc.j);
      mi $$1 = new mi().a(mj.e, $$0).b(mj.e, mj.c).a(mj.f, mi.a(cvc.i, "_top")).a(mj.i, mi.a(cvc.i, "_snow"));
      ma $$2 = ma.a().a(mb.c, mh.m.a(cvc.i, "_snow", $$1, this.c));
      this.a(cvc.i, mf.a(cvc.i), $$2);
      agi $$3 = mk.e.get(cvc.fl).a($$1x -> $$1x.a(mj.e, $$0)).a(cvc.fl, this.c);
      this.a(cvc.fl, $$3, $$2);
      agi $$4 = mk.e.get(cvc.l).a($$1x -> $$1x.a(mj.e, $$0)).a(cvc.l, this.c);
      this.a(cvc.l, $$4, $$2);
   }

   private void a(cva $$0, agi $$1, ma $$2) {
      List<ma> $$3 = Arrays.asList(a($$1));
      this.b.accept(lx.a($$0).a(ly.a(dhy.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(clm.re);
      this.b
         .accept(
            lx.a(cvc.fC)
               .a(
                  ly.a(dhy.ar)
                     .a(0, ma.a().a(mb.c, mf.a(cvc.fC, "_stage0")))
                     .a(1, ma.a().a(mb.c, mf.a(cvc.fC, "_stage1")))
                     .a(2, ma.a().a(mb.c, mf.a(cvc.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cvc.kE, mf.a(cvc.kE)));
   }

   private void j(cva $$0, cva $$1) {
      mi $$2 = mi.b($$1);
      agi $$3 = mh.W.a($$0, $$2, this.c);
      agi $$4 = mh.X.a($$0, $$2, this.c);
      this.b.accept(lx.a($$0).a(a(dhy.aT, 1, $$4, $$3)));
   }

   private void T() {
      agi $$0 = mf.a(cvc.hc);
      agi $$1 = mf.a(cvc.hc, "_side");
      this.a(clm.lQ);
      this.b
         .accept(
            lx.a(cvc.hc)
               .a(
                  ly.a(dhy.Q)
                     .a(hx.a, ma.a().a(mb.c, $$0))
                     .a(hx.c, ma.a().a(mb.c, $$1))
                     .a(hx.f, ma.a().a(mb.c, $$1).a(mb.b, mb.a.b))
                     .a(hx.d, ma.a().a(mb.c, $$1).a(mb.b, mb.a.c))
                     .a(hx.e, ma.a().a(mb.c, $$1).a(mb.b, mb.a.d))
               )
         );
   }

   private void k(cva $$0, cva $$1) {
      agi $$2 = mf.a($$0);
      this.b.accept(lx.a($$1, ma.a().a(mb.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      agi $$0 = mf.a(cvc.eW, "_post_ends");
      agi $$1 = mf.a(cvc.eW, "_post");
      agi $$2 = mf.a(cvc.eW, "_cap");
      agi $$3 = mf.a(cvc.eW, "_cap_alt");
      agi $$4 = mf.a(cvc.eW, "_side");
      agi $$5 = mf.a(cvc.eW, "_side_alt");
      this.b
         .accept(
            lw.a(cvc.eW)
               .a(ma.a().a(mb.c, $$0))
               .a(lv.a().a(dhy.L, false).a(dhy.M, false).a(dhy.N, false).a(dhy.O, false), ma.a().a(mb.c, $$1))
               .a(lv.a().a(dhy.L, true).a(dhy.M, false).a(dhy.N, false).a(dhy.O, false), ma.a().a(mb.c, $$2))
               .a(lv.a().a(dhy.L, false).a(dhy.M, true).a(dhy.N, false).a(dhy.O, false), ma.a().a(mb.c, $$2).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.L, false).a(dhy.M, false).a(dhy.N, true).a(dhy.O, false), ma.a().a(mb.c, $$3))
               .a(lv.a().a(dhy.L, false).a(dhy.M, false).a(dhy.N, false).a(dhy.O, true), ma.a().a(mb.c, $$3).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.L, true), ma.a().a(mb.c, $$4))
               .a(lv.a().a(dhy.M, true), ma.a().a(mb.c, $$4).a(mb.b, mb.a.b))
               .a(lv.a().a(dhy.N, true), ma.a().a(mb.c, $$5))
               .a(lv.a().a(dhy.O, true), ma.a().a(mb.c, $$5).a(mb.b, mb.a.b))
         );
      this.d(cvc.eW);
   }

   private void E(cva $$0) {
      this.b.accept(lx.a($$0, ma.a().a(mb.c, mf.a($$0))).a(b()));
   }

   private void V() {
      agi $$0 = mf.a(cvc.dw);
      agi $$1 = mf.a(cvc.dw, "_on");
      this.d(cvc.dw);
      this.b
         .accept(
            lx.a(cvc.dw)
               .a(a(dhy.w, $$0, $$1))
               .a(
                  ly.a(dhy.U, dhy.R)
                     .a(dht.c, hx.c, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.c))
                     .a(dht.c, hx.f, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.d))
                     .a(dht.c, hx.d, ma.a().a(mb.a, mb.a.c))
                     .a(dht.c, hx.e, ma.a().a(mb.a, mb.a.c).a(mb.b, mb.a.b))
                     .a(dht.a, hx.c, ma.a())
                     .a(dht.a, hx.f, ma.a().a(mb.b, mb.a.b))
                     .a(dht.a, hx.d, ma.a().a(mb.b, mb.a.c))
                     .a(dht.a, hx.e, ma.a().a(mb.b, mb.a.d))
                     .a(dht.b, hx.c, ma.a().a(mb.a, mb.a.b))
                     .a(dht.b, hx.f, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.b))
                     .a(dht.b, hx.d, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.c))
                     .a(dht.b, hx.e, ma.a().a(mb.a, mb.a.b).a(mb.b, mb.a.d))
               )
         );
   }

   private void W() {
      this.d(cvc.fm);
      this.b.accept(b(cvc.fm, mf.a(cvc.fm)));
   }

   private void X() {
      this.d(cvc.tn);
      this.b.accept(c(cvc.tn, mf.a(cvc.tn)));
   }

   private void Y() {
      this.b.accept(lx.a(cvc.ed).a(ly.a(dhy.H).a(hx.a.a, ma.a().a(mb.c, mf.a(cvc.ed, "_ns"))).a(hx.a.c, ma.a().a(mb.c, mf.a(cvc.ed, "_ew")))));
   }

   private void Z() {
      agi $$0 = mk.a.create(cvc.dV, this.c);
      this.b
         .accept(
            lx.a(
               cvc.dV,
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
      agi $$0 = mf.a(cvc.kO);
      agi $$1 = mf.a(cvc.kO, "_on");
      this.b.accept(lx.a(cvc.kO).a(a(dhy.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mi $$0 = new mi().a(mj.e, mi.a(cvc.by, "_bottom")).a(mj.i, mi.a(cvc.by, "_side"));
      agi $$1 = mi.a(cvc.by, "_top_sticky");
      agi $$2 = mi.a(cvc.by, "_top");
      mi $$3 = $$0.c(mj.E, $$1);
      mi $$4 = $$0.c(mj.E, $$2);
      agi $$5 = mf.a(cvc.by, "_base");
      this.a(cvc.by, $$5, $$4);
      this.a(cvc.br, $$5, $$3);
      agi $$6 = mh.m.a(cvc.by, "_inventory", $$0.c(mj.f, $$2), this.c);
      agi $$7 = mh.m.a(cvc.br, "_inventory", $$0.c(mj.f, $$1), this.c);
      this.a(cvc.by, $$6);
      this.a(cvc.br, $$7);
   }

   private void a(cva $$0, agi $$1, mi $$2) {
      agi $$3 = mh.bf.a($$0, $$2, this.c);
      this.b.accept(lx.a($$0).a(a(dhy.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mi $$0 = new mi().a(mj.F, mi.a(cvc.by, "_top")).a(mj.i, mi.a(cvc.by, "_side"));
      mi $$1 = $$0.c(mj.E, mi.a(cvc.by, "_top_sticky"));
      mi $$2 = $$0.c(mj.E, mi.a(cvc.by, "_top"));
      this.b
         .accept(
            lx.a(cvc.bz)
               .a(
                  ly.a(dhy.x, dhy.bg)
                     .a(false, dik.a, ma.a().a(mb.c, mh.bg.a(cvc.by, "_head", $$2, this.c)))
                     .a(false, dik.b, ma.a().a(mb.c, mh.bg.a(cvc.by, "_head_sticky", $$1, this.c)))
                     .a(true, dik.a, ma.a().a(mb.c, mh.bh.a(cvc.by, "_head_short", $$2, this.c)))
                     .a(true, dik.b, ma.a().a(mb.c, mh.bh.a(cvc.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      agi $$0 = mf.a(cvc.qQ, "_inactive");
      agi $$1 = mf.a(cvc.qQ, "_active");
      this.a(cvc.qQ, $$0);
      this.b.accept(lx.a(cvc.qQ).a(ly.a(dhy.bo).a($$2 -> ma.a().a(mb.c, $$2 != dip.b && $$2 != dip.c ? $$0 : $$1))));
   }

   private void ae() {
      agi $$0 = mf.a(cvc.qR, "_inactive");
      agi $$1 = mf.a(cvc.qR, "_active");
      this.a(cvc.qR, $$0);
      this.b.accept(lx.a(cvc.qR).a(ly.a(dhy.bo).a($$2 -> ma.a().a(mb.c, $$2 != dip.b && $$2 != dip.c ? $$0 : $$1))).a(b()));
   }

   private void af() {
      agi $$0 = mh.bK.a(cvc.qV, mi.a(false), this.c);
      agi $$1 = mh.bK.a(cvc.qV, "_can_summon", mi.a(true), this.c);
      this.a(cvc.qV, $$0);
      this.b.accept(lx.a(cvc.qV).a(a(dhy.G, $$1, $$0)));
   }

   private void ag() {
      agi $$0 = mf.a(cvc.nS, "_stable");
      agi $$1 = mf.a(cvc.nS, "_unstable");
      this.a(cvc.nS, $$0);
      this.b.accept(lx.a(cvc.nS).a(a(dhy.b, $$1, $$0)));
   }

   private void ah() {
      agi $$0 = this.a(cvc.sv, "", mh.am, mi::c);
      agi $$1 = this.a(cvc.sv, "_lit", mh.am, mi::c);
      this.b.accept(lx.a(cvc.sv).a(a(dhy.D, $$1, $$0)));
      agi $$2 = this.a(cvc.sw, "", mh.am, mi::c);
      agi $$3 = this.a(cvc.sw, "_lit", mh.am, mi::c);
      this.b.accept(lx.a(cvc.sw).a(a(dhy.D, $$3, $$2)));
   }

   private void ai() {
      agi $$0 = mk.a.create(cvc.fB, this.c);
      agi $$1 = this.a(cvc.fB, "_on", mh.c, mi::b);
      this.b.accept(lx.a(cvc.fB).a(a(dhy.r, $$1, $$0)));
   }

   private void l(cva $$0, cva $$1) {
      mi $$2 = mi.y($$0);
      this.b.accept(c($$0, mh.bd.a($$0, $$2, this.c)));
      this.b.accept(lx.a($$1, ma.a().a(mb.c, mh.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void aj() {
      mi $$0 = mi.y(cvc.dK);
      mi $$1 = mi.i(mi.a(cvc.dK, "_off"));
      agi $$2 = mh.bd.a(cvc.dK, $$0, this.c);
      agi $$3 = mh.bd.a(cvc.dK, "_off", $$1, this.c);
      this.b.accept(lx.a(cvc.dK).a(a(dhy.r, $$2, $$3)));
      agi $$4 = mh.be.a(cvc.dL, $$0, this.c);
      agi $$5 = mh.be.a(cvc.dL, "_off", $$1, this.c);
      this.b.accept(lx.a(cvc.dL).a(a(dhy.r, $$4, $$5)).a(d()));
      this.d(cvc.dK);
      this.c(cvc.dL);
   }

   private void ak() {
      this.a(clm.lJ);
      this.b.accept(lx.a(cvc.eh).a(ly.a(dhy.aA, dhy.s, dhy.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return ma.a().a(mb.c, mi.a(cvc.eh, $$3.toString()));
      })).a(c()));
   }

   private void al() {
      this.a(clm.cS);
      this.b
         .accept(
            lx.a(cvc.mV)
               .a(
                  ly.a(dhy.aS, dhy.C)
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
      mi $$0 = mi.a(cvc.dN);
      agi $$1 = mh.c.a(cvc.dP, $$0, this.c);
      this.b.accept(lx.a(cvc.dN).a(ly.a(dhy.aF).a($$1x -> ma.a().a(mb.c, $$1x < 8 ? mf.a(cvc.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cvc.dN, mf.a(cvc.dN, "_height2"));
      this.b.accept(c(cvc.dP, $$1));
   }

   private void an() {
      this.b.accept(lx.a(cvc.oc, ma.a().a(mb.c, mf.a(cvc.oc))).a(b()));
   }

   private void ao() {
      agi $$0 = mk.a.create(cvc.pa, this.c);
      this.a(cvc.pa, $$0);
      this.b.accept(lx.a(cvc.pa).a(ly.a(dhy.bj).a($$0x -> ma.a().a(mb.c, this.a(cvc.pa, "_" + $$0x.c(), mh.c, mi::b)))));
   }

   private void ap() {
      this.a(clm.wh);
      this.b.accept(lx.a(cvc.oi).a(ly.a(dhy.as).a($$0 -> ma.a().a(mb.c, this.a(cvc.oi, "_stage" + $$0, mh.am, mi::c)))));
   }

   private void aq() {
      this.a(clm.pp);
      this.b
         .accept(
            lx.a(cvc.fI)
               .a(
                  ly.a(dhy.a, dhy.M, dhy.L, dhy.N, dhy.O)
                     .a(false, false, false, false, false, ma.a().a(mb.c, mf.a(cvc.fI, "_ns")))
                     .a(false, true, false, false, false, ma.a().a(mb.c, mf.a(cvc.fI, "_n")).a(mb.b, mb.a.b))
                     .a(false, false, true, false, false, ma.a().a(mb.c, mf.a(cvc.fI, "_n")))
                     .a(false, false, false, true, false, ma.a().a(mb.c, mf.a(cvc.fI, "_n")).a(mb.b, mb.a.c))
                     .a(false, false, false, false, true, ma.a().a(mb.c, mf.a(cvc.fI, "_n")).a(mb.b, mb.a.d))
                     .a(false, true, true, false, false, ma.a().a(mb.c, mf.a(cvc.fI, "_ne")))
                     .a(false, true, false, true, false, ma.a().a(mb.c, mf.a(cvc.fI, "_ne")).a(mb.b, mb.a.b))
                     .a(false, false, false, true, true, ma.a().a(mb.c, mf.a(cvc.fI, "_ne")).a(mb.b, mb.a.c))
                     .a(false, false, true, false, true, ma.a().a(mb.c, mf.a(cvc.fI, "_ne")).a(mb.b, mb.a.d))
                     .a(false, false, true, true, false, ma.a().a(mb.c, mf.a(cvc.fI, "_ns")))
                     .a(false, true, false, false, true, ma.a().a(mb.c, mf.a(cvc.fI, "_ns")).a(mb.b, mb.a.b))
                     .a(false, true, true, true, false, ma.a().a(mb.c, mf.a(cvc.fI, "_nse")))
                     .a(false, true, false, true, true, ma.a().a(mb.c, mf.a(cvc.fI, "_nse")).a(mb.b, mb.a.b))
                     .a(false, false, true, true, true, ma.a().a(mb.c, mf.a(cvc.fI, "_nse")).a(mb.b, mb.a.c))
                     .a(false, true, true, false, true, ma.a().a(mb.c, mf.a(cvc.fI, "_nse")).a(mb.b, mb.a.d))
                     .a(false, true, true, true, true, ma.a().a(mb.c, mf.a(cvc.fI, "_nsew")))
                     .a(true, false, false, false, false, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_ns")))
                     .a(true, false, true, false, false, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_n")))
                     .a(true, false, false, true, false, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_n")).a(mb.b, mb.a.c))
                     .a(true, true, false, false, false, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_n")).a(mb.b, mb.a.b))
                     .a(true, false, false, false, true, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_n")).a(mb.b, mb.a.d))
                     .a(true, true, true, false, false, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_ne")))
                     .a(true, true, false, true, false, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_ne")).a(mb.b, mb.a.b))
                     .a(true, false, false, true, true, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_ne")).a(mb.b, mb.a.c))
                     .a(true, false, true, false, true, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_ne")).a(mb.b, mb.a.d))
                     .a(true, false, true, true, false, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_ns")))
                     .a(true, true, false, false, true, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_ns")).a(mb.b, mb.a.b))
                     .a(true, true, true, true, false, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_nse")))
                     .a(true, true, false, true, true, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_nse")).a(mb.b, mb.a.b))
                     .a(true, false, true, true, true, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_nse")).a(mb.b, mb.a.c))
                     .a(true, true, true, false, true, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_nse")).a(mb.b, mb.a.d))
                     .a(true, true, true, true, true, ma.a().a(mb.c, mf.a(cvc.fI, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.d(cvc.fH);
      this.b.accept(lx.a(cvc.fH).a(ly.a(dhy.a, dhy.w).a(($$0, $$1) -> ma.a().a(mb.c, mi.a(cvc.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private agi a(int $$0, String $$1, mi $$2) {
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

   private agi a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mi.b(mi.G(cvc.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mi.b(mi.a(cvc.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mi.b(mi.a(cvc.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void as() {
      this.a(clm.ko);
      this.b.accept(lx.a(cvc.mf).a(ly.a(dhy.aD, dhy.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void at() {
      this.a(clm.kp);
      Function<Integer, agi> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mi $$2 = mi.a($$1);
         return mh.bu.a(cvc.mg, $$1, $$2, this.c);
      };
      this.b.accept(lx.a(cvc.mg).a(ly.a(dch.c).a($$1 -> ma.a().a(mb.c, $$0.apply($$1)))));
   }

   private void F(cva $$0) {
      this.d($$0);
      agi $$1 = mf.a($$0);
      lw $$2 = lw.a($$0);
      lv.c $$3 = ac.a(lv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dhz, Function<agi, ma>> $$4 : a) {
         dhz $$5 = (dhz)$$4.getFirst();
         Function<agi, ma> $$6 = (Function<agi, ma>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(lv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void au() {
      agi $$0 = mi.a(cvc.qU, "_bottom");
      mi $$1 = new mi().a(mj.e, $$0).a(mj.f, mi.a(cvc.qU, "_top")).a(mj.i, mi.a(cvc.qU, "_side"));
      mi $$2 = new mi().a(mj.e, $$0).a(mj.f, mi.a(cvc.qU, "_top_bloom")).a(mj.i, mi.a(cvc.qU, "_side_bloom"));
      agi $$3 = mh.m.a(cvc.qU, "", $$1, this.c);
      agi $$4 = mh.m.a(cvc.qU, "_bloom", $$2, this.c);
      this.b.accept(lx.a(cvc.qU).a(ly.a(dhy.E).a($$2x -> ma.a().a(mb.c, $$2x ? $$4 : $$3))));
      this.a(clm.gi, $$3);
   }

   private void av() {
      cva $$0 = cvc.cm;
      agi $$1 = mf.a($$0);
      lw $$2 = lw.a($$0);
      Map.of(hx.c, mb.a.a, hx.f, mb.a.b, hx.d, mb.a.c, hx.e, mb.a.d).forEach(($$2x, $$3) -> {
         lv.c $$4 = lv.a().a(dhy.R, $$2x);
         $$2.a($$4, ma.a().a(mb.c, $$1).a(mb.b, $$3).a(mb.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mf.a($$0, "_inventory"));
      i.clear();
   }

   private void a(lw $$0, lv.c $$1, mb.a $$2) {
      List.of(Pair.of(dhy.bp, mh.aK), Pair.of(dhy.bq, mh.aL), Pair.of(dhy.br, mh.aM), Pair.of(dhy.bs, mh.aN), Pair.of(dhy.bt, mh.aO), Pair.of(dhy.bu, mh.aP))
         .forEach($$3 -> {
            dhz $$4 = (dhz)$$3.getFirst();
            mg $$5 = (mg)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(lw $$0, lv.c $$1, mb.a $$2, dhz $$3, mg $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mi $$7 = new mi().a(mj.b, mi.a(cvc.cm, $$6));
      lr.d $$8 = new lr.d($$4, $$6);
      agi $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cvc.cm, $$6, $$7, this.c));
      $$0.a(lv.a($$1, lv.a().a($$3, $$5)), ma.a().a(mb.c, $$9).a(mb.b, $$2));
   }

   private void aw() {
      this.b.accept(c(cvc.kJ, mh.c.a(cvc.kJ, mi.b(mf.a("magma")), this.c)));
   }

   private void G(cva $$0) {
      this.b($$0, mk.p);
      mh.bB.a(mf.a($$0.k()), mi.u($$0), this.c);
   }

   private void b(cva $$0, cva $$1, lr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(cva $$0, cva $$1) {
      mh.bC.a(mf.a($$0.k()), mi.u($$1), this.c);
   }

   private void ax() {
      agi $$0 = mf.a(cvc.b);
      agi $$1 = mf.a(cvc.b, "_mirrored");
      this.b.accept(a(cvc.eN, $$0, $$1));
      this.a(cvc.eN, $$0);
   }

   private void ay() {
      agi $$0 = mf.a(cvc.sJ);
      agi $$1 = mf.a(cvc.sJ, "_mirrored");
      this.b.accept(a(cvc.td, $$0, $$1).a(f()));
      this.a(cvc.td, $$0);
   }

   private void n(cva $$0, cva $$1) {
      this.a($$0, lr.e.b);
      mi $$2 = mi.d(mi.a($$0, "_pot"));
      agi $$3 = lr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void az() {
      agi $$0 = mi.a(cvc.pl, "_bottom");
      agi $$1 = mi.a(cvc.pl, "_top_off");
      agi $$2 = mi.a(cvc.pl, "_top");
      agi[] $$3 = new agi[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mi $$5 = new mi().a(mj.e, $$0).a(mj.f, $$4 == 0 ? $$1 : $$2).a(mj.i, mi.a(cvc.pl, "_side" + $$4));
         $$3[$$4] = mh.m.a(cvc.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(lx.a(cvc.pl).a(ly.a(dhy.aZ).a($$1x -> ma.a().a(mb.c, $$3[$$1x]))));
      this.a(clm.wF, $$3[0]);
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
      agi $$0 = mi.a(cvc.pb, "_top");
      agi $$1 = mi.a(cvc.pb, "_bottom");
      agi $$2 = mi.a(cvc.pb, "_side");
      agi $$3 = mi.a(cvc.pb, "_lock");
      mi $$4 = new mi().a(mj.o, $$2).a(mj.m, $$2).a(mj.l, $$2).a(mj.c, $$0).a(mj.j, $$0).a(mj.k, $$1).a(mj.n, $$3);
      agi $$5 = mh.b.a(cvc.pb, $$4, this.c);
      this.b.accept(lx.a(cvc.pb, ma.a().a(mb.c, $$5)).a(ly.a(dhy.T).a($$0x -> this.a($$0x, ma.a()))));
   }

   private void aB() {
      cva $$0 = cvc.n;
      agi $$1 = mf.a($$0);
      mk $$2 = mk.a.get($$0);
      cva $$3 = cvc.jH;
      agi $$4 = mh.Z.a($$3, $$2.b(), this.c);
      agi $$5 = mh.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kb.a().filter(kc::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cvc.rf).a(kb.w).a(cvc.rf, cvc.rD).a(cvc.rj, cvc.rn).a(kb.y);
      this.h(cvc.re).a(kb.A).a(cvc.re, cvc.rC).a(cvc.ri, cvc.rm).a(kb.C);
      this.h(cvc.rd).a(kb.E).a(cvc.rd, cvc.rB).a(cvc.rh, cvc.rl).a(kb.G);
      this.h(cvc.rc).a(kb.I).a(cvc.rc, cvc.rA).a(cvc.rg, cvc.rk).a(kb.K);
      this.w(cvc.sk);
      this.w(cvc.sl);
      this.w(cvc.sm);
      this.w(cvc.sn);
      this.i(cvc.sk, cvc.so);
      this.i(cvc.sl, cvc.sp);
      this.i(cvc.sm, cvc.sq);
      this.i(cvc.sn, cvc.sr);
      this.m(cvc.a);
      this.c(cvc.nc, cvc.a);
      this.c(cvc.nb, cvc.a);
      this.m(cvc.fO);
      this.m(cvc.dQ);
      this.c(cvc.nd, cvc.G);
      this.m(cvc.fA);
      this.m(cvc.me);
      this.m(cvc.fr);
      this.m(cvc.fR);
      this.a(clm.tW);
      this.m(cvc.pg);
      this.m(cvc.G);
      this.m(cvc.H);
      this.m(cvc.hV);
      this.a(clm.fR);
      this.o(cvc.pM, cvc.qd);
      this.o(cvc.pN, cvc.qe);
      this.o(cvc.pO, cvc.qf);
      this.o(cvc.pP, cvc.qg);
      this.o(cvc.pQ, cvc.qh);
      this.o(cvc.pR, cvc.qi);
      this.o(cvc.pS, cvc.qj);
      this.o(cvc.pT, cvc.qk);
      this.o(cvc.pU, cvc.ql);
      this.o(cvc.pV, cvc.qm);
      this.o(cvc.pW, cvc.qn);
      this.o(cvc.pX, cvc.qo);
      this.o(cvc.pY, cvc.qp);
      this.o(cvc.pZ, cvc.qq);
      this.o(cvc.qa, cvc.qr);
      this.o(cvc.qb, cvc.qs);
      this.o(cvc.pL, cvc.qc);
      this.m(cvc.na);
      this.m(cvc.gs);
      this.m(cvc.qP);
      this.m(cvc.sx);
      this.s(cvc.sy);
      this.s(cvc.sz);
      this.t(cvc.ti);
      this.t(cvc.tj);
      this.ah();
      this.g(cvc.sC, cvc.sA);
      this.p(cvc.sB);
      this.a(cvc.hW, clm.hA);
      this.a(clm.hA);
      this.aC();
      this.a(cvc.kN, clm.ja);
      this.a(clm.ja);
      this.f(cvc.bQ, mi.a(cvc.by, "_side"));
      this.a(cvc.R);
      this.a(cvc.S);
      this.a(cvc.iB);
      this.a(cvc.cx);
      this.a(cvc.cy);
      this.a(cvc.cz);
      this.a(cvc.fE);
      this.a(cvc.fF);
      this.a(cvc.fJ);
      this.a(cvc.N);
      this.a(cvc.T);
      this.a(cvc.O);
      this.a(cvc.ch);
      this.a(cvc.P);
      this.a(cvc.Q);
      this.a(cvc.ci);
      this.b(cvc.pj, mk.c);
      this.a(cvc.pi);
      this.a(cvc.aR);
      this.a(cvc.aS);
      this.a(cvc.aT);
      this.a(cvc.hb);
      this.a(cvc.dI);
      this.a(cvc.dJ);
      this.a(cvc.ha);
      this.a(cvc.pC);
      this.a(cvc.mW);
      this.a(cvc.dR);
      this.a(cvc.k);
      this.a(cvc.pk);
      this.a(cvc.fz);
      this.a(cvc.ec);
      this.a(cvc.L);
      this.a(cvc.ph);
      this.a(cvc.dO);
      this.b(cvc.dT, mk.f);
      this.b(cvc.pq, mk.c);
      this.b(cvc.fa, mk.c);
      this.m(cvc.ac);
      this.m(cvc.ga);
      this.a(cvc.kK);
      this.a(cvc.aY);
      this.a(cvc.iC);
      this.a(cvc.co);
      this.a(cvc.pK);
      this.a(cvc.ii);
      this.a(cvc.oy);
      this.a(cvc.dW);
      this.a(cvc.dX);
      this.a(cvc.ct);
      this.a(cvc.aO);
      this.b(cvc.bw, mk.u);
      this.a(clm.cR);
      this.b(cvc.ck, mk.e);
      this.b(cvc.pd, mk.c);
      this.a(cvc.op);
      this.a(cvc.aP);
      this.a(cvc.qt);
      this.a(cvc.qu);
      this.a(cvc.qN);
      this.a(cvc.su);
      this.a(cvc.tf);
      this.a(cvc.tg);
      this.a(cvc.th);
      this.e(cvc.qS);
      this.aB();
      this.a(cvc.ra);
      this.a(cvc.rb);
      this.a(cvc.qZ);
      this.a(cvc.qY);
      this.a(cvc.qX);
      this.a(cvc.qW);
      this.k(cvc.qZ, cvc.rw);
      this.k(cvc.qY, cvc.ry);
      this.k(cvc.qX, cvc.rx);
      this.k(cvc.qW, cvc.rz);
      this.i(cvc.rM);
      this.i(cvc.rN);
      this.i(cvc.rP);
      this.i(cvc.rO);
      this.a(cvc.rM, cvc.rQ);
      this.a(cvc.rN, cvc.rR);
      this.a(cvc.rP, cvc.rT);
      this.a(cvc.rO, cvc.rS);
      this.k(cvc.rU);
      this.k(cvc.rV);
      this.k(cvc.rX);
      this.k(cvc.rW);
      this.b(cvc.rU, cvc.rY);
      this.b(cvc.rV, cvc.rZ);
      this.b(cvc.rX, cvc.sb);
      this.b(cvc.rW, cvc.sa);
      this.a(cvc.sc);
      this.a(cvc.sd);
      this.a(cvc.se);
      this.a(cvc.sf);
      this.k(cvc.sc, cvc.sg);
      this.k(cvc.sd, cvc.sh);
      this.k(cvc.se, cvc.si);
      this.k(cvc.sf, cvc.sj);
      this.j(cvc.gW, cvc.ch);
      this.j(cvc.gX, cvc.ci);
      this.G();
      this.r();
      this.av();
      this.v();
      this.w();
      this.a(cvc.og, cvc.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(cvc.kt);
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
      this.F(cvc.ff);
      this.F(cvc.fg);
      this.F(cvc.qT);
      this.aw();
      this.aA();
      this.ad();
      this.ae();
      this.af();
      this.X();
      this.O();
      this.N();
      this.E(cvc.cO);
      this.d(cvc.cO);
      this.E(cvc.oa);
      this.g();
      this.E(cvc.sE);
      this.l(cvc.cp, cvc.cq);
      this.l(cvc.ea, cvc.eb);
      this.a(cvc.cA, cvc.n, mi::c);
      this.a(cvc.nY, cvc.p, mi::d);
      this.y(cvc.ow);
      this.y(cvc.on);
      this.v(cvc.aU);
      this.v(cvc.hi);
      this.C();
      this.D(cvc.oe);
      this.D(cvc.of);
      this.e(cvc.eX, mf.a(cvc.eX));
      this.a(cvc.dY, mk.c);
      this.a(cvc.dZ, mk.c);
      this.a(cvc.te);
      this.a(cvc.kM, mk.c);
      this.f(cvc.j);
      this.f(cvc.sH);
      this.f(cvc.I);
      this.g(cvc.J);
      this.g(cvc.M);
      this.f(cvc.K);
      this.e(cvc.F);
      this.b(cvc.to, mk.e);
      this.a(cvc.ij, mk.c, mk.d);
      this.a(cvc.kx, mk.v, mk.w);
      this.a(cvc.hf, mk.v, mk.w);
      this.a(cvc.tk, mk.c, mk.d);
      this.a(cvc.tl, mk.c, mk.d);
      this.a(cvc.tm, mk.c, mk.d);
      this.c(cvc.nT, mk.h);
      this.z();
      this.a(cvc.pe, mi::A);
      this.a(cvc.pf, mi::C);
      this.a(cvc.kD, dhy.as, 0, 1, 2, 3);
      this.a(cvc.gt, dhy.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cvc.fq, dhy.as, 0, 1, 1, 2);
      this.a(cvc.gu, dhy.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cvc.cB, dhy.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cvc.kA, lr.e.b, dhy.aq, 0, 1);
      this.i();
      this.h();
      this.a(mf.a("decorated_pot"), cvc.iA).b(cvc.tp);
      this.a(mf.a("banner"), cvc.n)
         .a(mh.bD, cvc.iJ, cvc.iK, cvc.iL, cvc.iM, cvc.iN, cvc.iO, cvc.iP, cvc.iQ, cvc.iR, cvc.iS, cvc.iT, cvc.iU, cvc.iV, cvc.iW, cvc.iX, cvc.iY)
         .b(cvc.iZ, cvc.ja, cvc.jb, cvc.jc, cvc.jd, cvc.je, cvc.jf, cvc.jg, cvc.jh, cvc.ji, cvc.jj, cvc.jk, cvc.jl, cvc.jm, cvc.jn, cvc.jo);
      this.a(mf.a("bed"), cvc.n)
         .b(cvc.aZ, cvc.ba, cvc.bb, cvc.bc, cvc.bd, cvc.be, cvc.bf, cvc.bg, cvc.bh, cvc.bi, cvc.bj, cvc.bk, cvc.bl, cvc.bm, cvc.bn, cvc.bo);
      this.m(cvc.aZ, cvc.bA);
      this.m(cvc.ba, cvc.bB);
      this.m(cvc.bb, cvc.bC);
      this.m(cvc.bc, cvc.bD);
      this.m(cvc.bd, cvc.bE);
      this.m(cvc.be, cvc.bF);
      this.m(cvc.bf, cvc.bG);
      this.m(cvc.bg, cvc.bH);
      this.m(cvc.bh, cvc.bI);
      this.m(cvc.bi, cvc.bJ);
      this.m(cvc.bj, cvc.bK);
      this.m(cvc.bk, cvc.bL);
      this.m(cvc.bl, cvc.bM);
      this.m(cvc.bm, cvc.bN);
      this.m(cvc.bn, cvc.bO);
      this.m(cvc.bo, cvc.bP);
      this.a(mf.a("skull"), cvc.dW)
         .a(mh.bE, cvc.gM, cvc.gK, cvc.gI, cvc.gE, cvc.gG, cvc.gQ)
         .a(cvc.gO)
         .b(cvc.gN, cvc.gP, cvc.gL, cvc.gJ, cvc.gF, cvc.gH, cvc.gR);
      this.G(cvc.kP);
      this.G(cvc.kQ);
      this.G(cvc.kR);
      this.G(cvc.kS);
      this.G(cvc.kT);
      this.G(cvc.kU);
      this.G(cvc.kV);
      this.G(cvc.kW);
      this.G(cvc.kX);
      this.G(cvc.kY);
      this.G(cvc.kZ);
      this.G(cvc.la);
      this.G(cvc.lb);
      this.G(cvc.lc);
      this.G(cvc.ld);
      this.G(cvc.le);
      this.G(cvc.lf);
      this.b(cvc.mX, mk.p);
      this.c(cvc.mX);
      this.a(mf.a("chest"), cvc.n).b(cvc.cv, cvc.gV);
      this.a(mf.a("ender_chest"), cvc.co).b(cvc.fG);
      this.f(cvc.fx, cvc.co).a(cvc.fx, cvc.kF);
      this.a(cvc.aM);
      this.a(cvc.aN);
      this.a(cvc.lw);
      this.a(cvc.lx);
      this.a(cvc.ly);
      this.a(cvc.lz);
      this.a(cvc.lA);
      this.a(cvc.lB);
      this.a(cvc.lC);
      this.a(cvc.lD);
      this.a(cvc.lE);
      this.a(cvc.lF);
      this.a(cvc.lG);
      this.a(cvc.lH);
      this.a(cvc.lI);
      this.a(cvc.lJ);
      this.a(cvc.lK);
      this.a(cvc.lL);
      this.a(mk.a, cvc.lM, cvc.lN, cvc.lO, cvc.lP, cvc.lQ, cvc.lR, cvc.lS, cvc.lT, cvc.lU, cvc.lV, cvc.lW, cvc.lX, cvc.lY, cvc.lZ, cvc.ma, cvc.mb);
      this.a(cvc.iA);
      this.a(cvc.hj);
      this.a(cvc.hk);
      this.a(cvc.hl);
      this.a(cvc.hm);
      this.a(cvc.hn);
      this.a(cvc.ho);
      this.a(cvc.hp);
      this.a(cvc.hq);
      this.a(cvc.hr);
      this.a(cvc.hs);
      this.a(cvc.ht);
      this.a(cvc.hu);
      this.a(cvc.hv);
      this.a(cvc.hw);
      this.a(cvc.hx);
      this.a(cvc.hy);
      this.a(cvc.qO);
      this.h(cvc.aQ, cvc.eY);
      this.h(cvc.ei, cvc.hz);
      this.h(cvc.ej, cvc.hA);
      this.h(cvc.ek, cvc.hB);
      this.h(cvc.el, cvc.hC);
      this.h(cvc.em, cvc.hD);
      this.h(cvc.en, cvc.hE);
      this.h(cvc.eo, cvc.hF);
      this.h(cvc.ep, cvc.hG);
      this.h(cvc.eq, cvc.hH);
      this.h(cvc.er, cvc.hI);
      this.h(cvc.es, cvc.hJ);
      this.h(cvc.et, cvc.hK);
      this.h(cvc.eu, cvc.hL);
      this.h(cvc.ev, cvc.hM);
      this.h(cvc.ew, cvc.hN);
      this.h(cvc.ex, cvc.hO);
      this.b(mk.n, cvc.lg, cvc.lh, cvc.li, cvc.lj, cvc.lk, cvc.ll, cvc.lm, cvc.ln, cvc.lo, cvc.lp, cvc.lq, cvc.lr, cvc.ls, cvc.lt, cvc.lu, cvc.lv);
      this.g(cvc.bA, cvc.ik);
      this.g(cvc.bB, cvc.il);
      this.g(cvc.bC, cvc.im);
      this.g(cvc.bD, cvc.in);
      this.g(cvc.bE, cvc.io);
      this.g(cvc.bF, cvc.ip);
      this.g(cvc.bG, cvc.iq);
      this.g(cvc.bH, cvc.ir);
      this.g(cvc.bI, cvc.is);
      this.g(cvc.bJ, cvc.it);
      this.g(cvc.bK, cvc.iu);
      this.g(cvc.bL, cvc.iv);
      this.g(cvc.bM, cvc.iw);
      this.g(cvc.bN, cvc.ix);
      this.g(cvc.bO, cvc.iy);
      this.g(cvc.bP, cvc.iz);
      this.a(cvc.sI);
      this.a(cvc.eL);
      this.a(cvc.bu, cvc.gb, lr.e.a);
      this.a(cvc.bR, cvc.gc, lr.e.b);
      this.a(cvc.bT, cvc.gd, lr.e.b);
      this.a(cvc.bU, cvc.ge, lr.e.b);
      this.a(cvc.bV, cvc.gf, lr.e.b);
      this.a(cvc.bW, cvc.gg, lr.e.b);
      this.a(cvc.bX, cvc.gh, lr.e.b);
      this.a(cvc.bY, cvc.gi, lr.e.b);
      this.a(cvc.bZ, cvc.gj, lr.e.b);
      this.a(cvc.ca, cvc.gk, lr.e.b);
      this.a(cvc.cb, cvc.gl, lr.e.b);
      this.a(cvc.cc, cvc.gm, lr.e.b);
      this.a(cvc.ce, cvc.gn, lr.e.b);
      this.a(cvc.cd, cvc.go, lr.e.b);
      this.a(cvc.cg, cvc.gp, lr.e.b);
      this.a(cvc.cf, cvc.gq, lr.e.b);
      this.a(cvc.bv, cvc.gr, lr.e.b);
      this.a(cvc.bS, cvc.fS, lr.e.b);
      this.H();
      this.u(cvc.eT);
      this.u(cvc.eU);
      this.u(cvc.eV);
      this.a(cvc.bt, lr.e.a);
      this.b(cvc.dS, lr.e.a);
      this.a(clm.dI);
      this.b(cvc.mc, cvc.md, lr.e.b);
      this.a(clm.dJ);
      this.c(cvc.md);
      this.b(cvc.sG, lr.e.b);
      this.c(cvc.sG);
      this.c(cvc.sw);
      this.b(cvc.oz, cvc.oA, lr.e.b);
      this.b(cvc.oB, cvc.oC, lr.e.b);
      this.a(cvc.oz, "_plant");
      this.c(cvc.oA);
      this.a(cvc.oB, "_plant");
      this.c(cvc.oC);
      this.a(cvc.mY, lr.e.a, mi.c(mi.a(cvc.mZ, "_stage0")));
      this.m();
      this.a(cvc.bs, lr.e.b);
      this.c(cvc.iE, lr.e.b);
      this.c(cvc.iF, lr.e.b);
      this.c(cvc.iG, lr.e.b);
      this.c(cvc.iH, lr.e.a);
      this.c(cvc.iI, lr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cvc.mw, cvc.mr, cvc.mm, cvc.mh, cvc.mG, cvc.mB, cvc.mQ, cvc.mL);
      this.a(cvc.mx, cvc.ms, cvc.mn, cvc.mi, cvc.mH, cvc.mC, cvc.mR, cvc.mM);
      this.a(cvc.my, cvc.mt, cvc.mo, cvc.mj, cvc.mI, cvc.mD, cvc.mS, cvc.mN);
      this.a(cvc.mz, cvc.mu, cvc.mp, cvc.mk, cvc.mJ, cvc.mE, cvc.mT, cvc.mO);
      this.a(cvc.mA, cvc.mv, cvc.mq, cvc.ml, cvc.mK, cvc.mF, cvc.mU, cvc.mP);
      this.e(cvc.fe, cvc.fc);
      this.e(cvc.fd, cvc.fb);
      this.l(cvc.ab).c(cvc.ab).a(cvc.av);
      this.l(cvc.am).c(cvc.am).a(cvc.aD);
      this.a(cvc.am, cvc.dj, cvc.ds);
      this.b(cvc.aL, mk.r);
      this.l(cvc.Y).c(cvc.Y).a(cvc.as);
      this.l(cvc.ai).c(cvc.ai).a(cvc.aA);
      this.a(cvc.ai, cvc.dd, cvc.do);
      this.a(cvc.B, cvc.fX, lr.e.b);
      this.b(cvc.aI, mk.r);
      this.l(cvc.Z).d(cvc.Z).a(cvc.at);
      this.l(cvc.aj).d(cvc.aj).a(cvc.aB);
      this.a(cvc.aj, cvc.de, cvc.dp);
      this.a(cvc.C, cvc.fY, lr.e.b);
      this.b(cvc.aJ, mk.r);
      this.l(cvc.W).c(cvc.W).a(cvc.aq);
      this.l(cvc.ag).c(cvc.ag).a(cvc.ay);
      this.a(cvc.ag, cvc.dc, cvc.dn);
      this.a(cvc.z, cvc.fV, lr.e.b);
      this.b(cvc.aG, mk.r);
      this.l(cvc.U).c(cvc.U).a(cvc.ao);
      this.l(cvc.al).c(cvc.al).a(cvc.aw);
      this.a(cvc.al, cvc.da, cvc.dl);
      this.a(cvc.x, cvc.fT, lr.e.b);
      this.b(cvc.aE, mk.r);
      this.l(cvc.V).c(cvc.V).a(cvc.ap);
      this.l(cvc.af).c(cvc.af).a(cvc.ax);
      this.a(cvc.af, cvc.db, cvc.dm);
      this.a(cvc.y, cvc.fU, lr.e.b);
      this.b(cvc.aF, mk.r);
      this.l(cvc.aa).c(cvc.aa).a(cvc.au);
      this.l(cvc.ak).c(cvc.ak).a(cvc.aC);
      this.a(cvc.ak, cvc.dg, cvc.dr);
      this.a(cvc.D, cvc.fZ, lr.e.b);
      this.b(cvc.aK, mk.r);
      this.l(cvc.X).c(cvc.X).a(cvc.ar);
      this.l(cvc.ah).c(cvc.ah).a(cvc.az);
      this.a(cvc.ah, cvc.df, cvc.dq);
      this.a(cvc.A, cvc.fW, lr.e.b);
      this.b(cvc.aH, mk.r);
      this.l(cvc.os).b(cvc.os).a(cvc.ou);
      this.l(cvc.ot).b(cvc.ot).a(cvc.ov);
      this.a(cvc.ot, cvc.dh, cvc.dt);
      this.a(cvc.ox, cvc.pm, lr.e.b);
      this.n(cvc.oD, cvc.po);
      this.l(cvc.oj).b(cvc.oj).a(cvc.ol);
      this.l(cvc.ok).b(cvc.ok).a(cvc.om);
      this.a(cvc.ok, cvc.di, cvc.du);
      this.a(cvc.oo, cvc.pn, lr.e.b);
      this.n(cvc.oq, cvc.pp);
      this.l(cvc.ae).d(cvc.ae);
      this.l(cvc.an).d(cvc.an);
      this.a(cvc.v, cvc.dk, cvc.dv);
      this.b(cvc.or, lr.e.b);
      this.a(clm.dF);
      this.i(cvc.dy);
      this.k(cvc.hY);
      this.u();
      this.n(cvc.cP);
      this.o(cvc.bp);
      this.o(cvc.bq);
      this.o(cvc.hh);
      this.t();
      this.q(cvc.fN);
      this.q(cvc.kG);
      this.q(cvc.kH);
      this.r(cvc.gS);
      this.r(cvc.gT);
      this.r(cvc.gU);
      this.o();
      this.p();
      this.d(cvc.cD, mk.g);
      this.d(cvc.nW, mk.g);
      this.d(cvc.nV, mk.h);
      this.s();
      this.az();
      this.au();
      this.k(cvc.eK, cvc.eS);
      this.k(cvc.m, cvc.eO);
      this.k(cvc.eJ, cvc.eR);
      this.k(cvc.eI, cvc.eQ);
      this.ax();
      this.k(cvc.eH, cvc.eP);
      this.ay();
      cmo.h().forEach($$0 -> this.a($$0, mf.b("template_spawn_egg")));
   }

   private void aC() {
      this.c(cvc.hX);
      ly.a<Integer> $$0 = ly.a(dhy.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         agi $$3 = mi.a(clm.hB, $$2);
         $$0.a($$1, ma.a().a(mb.c, mh.Y.a(cvc.hX, $$2, mi.h($$3), this.c)));
         mh.bv.a(mf.a(clm.hB, $$2), mi.k($$3), this.c);
      }

      this.b.accept(lx.a(cvc.hX).a($$0));
   }

   private void o(cva $$0, cva $$1) {
      this.a($$0.k());
      mi $$2 = mi.b(mi.G($$0));
      mi $$3 = mi.b(mi.a($$0, "_lit"));
      agi $$4 = mh.bF.a($$0, "_one_candle", $$2, this.c);
      agi $$5 = mh.bG.a($$0, "_two_candles", $$2, this.c);
      agi $$6 = mh.bH.a($$0, "_three_candles", $$2, this.c);
      agi $$7 = mh.bI.a($$0, "_four_candles", $$2, this.c);
      agi $$8 = mh.bF.a($$0, "_one_candle_lit", $$3, this.c);
      agi $$9 = mh.bG.a($$0, "_two_candles_lit", $$3, this.c);
      agi $$10 = mh.bH.a($$0, "_three_candles_lit", $$3, this.c);
      agi $$11 = mh.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            lx.a($$0)
               .a(
                  ly.a(dhy.az, dhy.r)
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
      agi $$12 = mh.bJ.a($$1, mi.a($$0, false), this.c);
      agi $$13 = mh.bJ.a($$1, "_lit", mi.a($$0, true), this.c);
      this.b.accept(lx.a($$1).a(a(dhy.r, $$13, $$12)));
   }

   class a {
      private final agi b;

      public a(agi $$0, cva $$1) {
         this.b = mh.Y.a($$0, mi.u($$1), lr.this.c);
      }

      public lr.a a(cva... $$0) {
         for (cva $$1 : $$0) {
            lr.this.b.accept(lr.c($$1, this.b));
         }

         return this;
      }

      public lr.a b(cva... $$0) {
         for (cva $$1 : $$0) {
            lr.this.c($$1);
         }

         return this.a($$0);
      }

      public lr.a a(mg $$0, cva... $$1) {
         for (cva $$2 : $$1) {
            $$0.a(mf.a($$2.k()), mi.u($$2), lr.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mi b;
      private final Map<mg, agi> c = Maps.newHashMap();
      @Nullable
      private kc d;
      @Nullable
      private agi e;
      private final Set<cva> f = new HashSet<>();

      public b(mi $$0) {
         this.b = $$0;
      }

      public lr.b a(cva $$0, mg $$1) {
         this.e = $$1.a($$0, this.b, lr.this.c);
         if (lr.this.f.containsKey($$0)) {
            lr.this.b.accept(lr.this.f.get($$0).create($$0, this.e, this.b, lr.this.c));
         } else {
            lr.this.b.accept(lr.c($$0, this.e));
         }

         return this;
      }

      public lr.b a(cva $$0, cva $$1) {
         agi $$2 = mf.a($$0);
         lr.this.b.accept(lr.c($$1, $$2));
         lr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public lr.b a(cva $$0) {
         agi $$1 = mh.q.a($$0, this.b, lr.this.c);
         agi $$2 = mh.r.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.b($$0, $$1, $$2));
         agi $$3 = mh.s.a($$0, this.b, lr.this.c);
         lr.this.a($$0, $$3);
         return this;
      }

      public lr.b b(cva $$0) {
         agi $$1 = mh.K.a($$0, this.b, lr.this.c);
         agi $$2 = mh.L.a($$0, this.b, lr.this.c);
         agi $$3 = mh.M.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.a($$0, $$1, $$2, $$3));
         agi $$4 = mh.N.a($$0, this.b, lr.this.c);
         lr.this.a($$0, $$4);
         return this;
      }

      public lr.b c(cva $$0) {
         mi $$1 = mi.p($$0);
         agi $$2 = mh.B.a($$0, $$1, lr.this.c);
         agi $$3 = mh.C.a($$0, $$1, lr.this.c);
         agi $$4 = mh.D.a($$0, $$1, lr.this.c);
         agi $$5 = mh.E.a($$0, $$1, lr.this.c);
         agi $$6 = mh.F.a($$0, $$1, lr.this.c);
         lr.this.b.accept(lr.a($$0, $$2, $$3, $$4, $$5, $$6));
         agi $$7 = mh.G.a($$0, $$1, lr.this.c);
         lr.this.a($$0, $$7);
         return this;
      }

      public lr.b d(cva $$0) {
         agi $$1 = mh.H.a($$0, this.b, lr.this.c);
         agi $$2 = mh.I.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.c($$0, $$1, $$2));
         agi $$3 = mh.J.a($$0, this.b, lr.this.c);
         lr.this.a($$0, $$3);
         return this;
      }

      public lr.b e(cva $$0) {
         mi $$1 = mi.p($$0);
         agi $$2 = mh.P.a($$0, $$1, lr.this.c);
         agi $$3 = mh.O.a($$0, $$1, lr.this.c);
         agi $$4 = mh.R.a($$0, $$1, lr.this.c);
         agi $$5 = mh.Q.a($$0, $$1, lr.this.c);
         lr.this.b.accept(lr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public lr.b f(cva $$0) {
         agi $$1 = mh.T.a($$0, this.b, lr.this.c);
         agi $$2 = mh.S.a($$0, this.b, lr.this.c);
         agi $$3 = mh.V.a($$0, this.b, lr.this.c);
         agi $$4 = mh.U.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public lr.b g(cva $$0) {
         agi $$1 = mh.W.a($$0, this.b, lr.this.c);
         agi $$2 = mh.X.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.e($$0, $$1, $$2));
         return this;
      }

      public lr.b h(cva $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cva $$1 = this.d.b().get(kc.b.r);
            agi $$2 = mh.Y.a($$0, this.b, lr.this.c);
            lr.this.b.accept(lr.c($$0, $$2));
            lr.this.b.accept(lr.c($$1, $$2));
            lr.this.a($$0.k());
            lr.this.c($$1);
            return this;
         }
      }

      public lr.b i(cva $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            agi $$1 = this.a(mh.Z, $$0);
            agi $$2 = this.a(mh.aa, $$0);
            lr.this.b.accept(lr.e($$0, $$1, $$2, this.e));
            lr.this.a($$0, $$1);
            return this;
         }
      }

      public lr.b j(cva $$0) {
         agi $$1 = this.a(mh.ad, $$0);
         agi $$2 = this.a(mh.ac, $$0);
         agi $$3 = this.a(mh.ae, $$0);
         lr.this.b.accept(lr.b($$0, $$1, $$2, $$3));
         lr.this.a($$0, $$2);
         return this;
      }

      private lr.b k(cva $$0) {
         mk $$1 = lr.this.g.getOrDefault($$0, mk.a.get($$0));
         agi $$2 = $$1.a($$0, lr.this.c);
         lr.this.b.accept(lr.c($$0, $$2));
         return this;
      }

      private lr.b l(cva $$0) {
         lr.this.i($$0);
         return this;
      }

      private void m(cva $$0) {
         if (lr.this.e.contains($$0)) {
            lr.this.k($$0);
         } else {
            lr.this.j($$0);
         }
      }

      private agi a(mg $$0, cva $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, lr.this.c));
      }

      public lr.b a(kc $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<lr.b, cva> $$2 = lr.h.get($$0x);
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
      lu create(cva var1, agi var2, mi var3, BiConsumer<agi, Supplier<JsonElement>> var4);
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

      public lr.f a(cva $$0) {
         mi $$1 = this.b.c(mj.d, this.b.a(mj.i));
         agi $$2 = mh.i.a($$0, $$1, lr.this.c);
         lr.this.b.accept(lr.d($$0, $$2));
         return this;
      }

      public lr.f b(cva $$0) {
         agi $$1 = mh.i.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.d($$0, $$1));
         return this;
      }

      public lr.f c(cva $$0) {
         agi $$1 = mh.i.a($$0, this.b, lr.this.c);
         agi $$2 = mh.j.a($$0, this.b, lr.this.c);
         lr.this.b.accept(lr.d($$0, $$1, $$2));
         return this;
      }

      public lr.f d(cva $$0) {
         lr.this.b.accept(lr.a($$0, this.b, lr.this.c));
         return this;
      }
   }
}
