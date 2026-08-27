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

public class mf {
   final Consumer<mi> b;
   final BiConsumer<ajh, Supplier<JsonElement>> c;
   private final Consumer<cqh> d;
   final List<dac> e = ImmutableList.of(dae.ey, dae.eE, dae.hY);
   final Map<dac, mf.c> f = ImmutableMap.builder().put(dae.b, mf::a).put(dae.sJ, mf::c).put(dae.eM, mf::b).build();
   final Map<dac, my> g = ImmutableMap.builder()
      .put(dae.aV, my.y.get(dae.aV))
      .put(dae.jp, my.y.get(dae.jp))
      .put(dae.jS, my.a(mw.a(dae.aV, "_top")))
      .put(dae.jU, my.a(mw.a(dae.jp, "_top")))
      .put(dae.aX, my.d.get(dae.aV).a($$0x -> $$0x.a(mx.i, mw.G(dae.aX))))
      .put(dae.jr, my.d.get(dae.jp).a($$0x -> $$0x.a(mx.i, mw.G(dae.jr))))
      .put(dae.hd, my.d.get(dae.hd))
      .put(dae.jT, my.a(mw.a(dae.hd, "_bottom")))
      .put(dae.pr, my.z.get(dae.pr))
      .put(dae.sJ, my.z.get(dae.sJ))
      .put(dae.he, my.d.get(dae.he).a($$0x -> $$0x.a(mx.i, mw.G(dae.he))))
      .put(dae.aW, my.d.get(dae.aW).a($$0x -> {
         $$0x.a(mx.d, mw.a(dae.aV, "_top"));
         $$0x.a(mx.i, mw.G(dae.aW));
      }))
      .put(dae.jq, my.d.get(dae.jq).a($$0x -> {
         $$0x.a(mx.d, mw.a(dae.jp, "_top"));
         $$0x.a(mx.i, mw.G(dae.jq));
      }))
      .put(dae.qM, my.z.get(dae.qM))
      .put(dae.qH, my.z.get(dae.qH))
      .build();
   static final Map<km.b, BiConsumer<mf.b, dac>> h = ImmutableMap.builder()
      .put(km.b.a, mf.b::a)
      .put(km.b.e, mf.b::l)
      .put(km.b.b, mf.b::k)
      .put(km.b.c, mf.b::k)
      .put(km.b.f, mf.b::c)
      .put(km.b.g, mf.b::d)
      .put(km.b.h, mf.b::e)
      .put(km.b.i, mf.b::f)
      .put(km.b.k, mf.b::h)
      .put(km.b.l, mf.b::i)
      .put(km.b.m, mf.b::j)
      .put(km.b.n, mf.b::g)
      .put(km.b.p, mf.b::m)
      .put(km.b.q, mf.b::b)
      .build();
   public static final List<Pair<dns, Function<ajh, mo>>> a = List.of(
      Pair.of(dnr.L, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0)),
      Pair.of(dnr.M, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.b, mp.a.b).a(mp.d, true)),
      Pair.of(dnr.N, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.b, mp.a.c).a(mp.d, true)),
      Pair.of(dnr.O, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.b, mp.a.d).a(mp.d, true)),
      Pair.of(dnr.J, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.a, mp.a.d).a(mp.d, true)),
      Pair.of(dnr.K, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.a, mp.a.b).a(mp.d, true))
   );
   private static final Map<mf.d, ajh> i = new HashMap<>();

   private static mi a(dac $$0, ajh $$1, mw $$2, BiConsumer<ajh, Supplier<JsonElement>> $$3) {
      ajh $$4 = mv.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static mi b(dac $$0, ajh $$1, mw $$2, BiConsumer<ajh, Supplier<JsonElement>> $$3) {
      ajh $$4 = mv.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static mi c(dac $$0, ajh $$1, mw $$2, BiConsumer<ajh, Supplier<JsonElement>> $$3) {
      ajh $$4 = mv.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public mf(Consumer<mi> $$0, BiConsumer<ajh, Supplier<JsonElement>> $$1, Consumer<cqh> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dac $$0) {
      this.d.accept($$0.l());
   }

   void a(dac $$0, ajh $$1) {
      this.c.accept(mt.a($$0.l()), new ms($$1));
   }

   private void a(cqh $$0, ajh $$1) {
      this.c.accept(mt.a($$0), new ms($$1));
   }

   void a(cqh $$0) {
      mv.bx.a(mt.a($$0), mw.b($$0), this.c);
   }

   private void d(dac $$0) {
      cqh $$1 = $$0.l();
      if ($$1 != cqp.a) {
         mv.bx.a(mt.a($$1), mw.F($$0), this.c);
      }
   }

   private void a(dac $$0, String $$1) {
      cqh $$2 = $$0.l();
      mv.bx.a(mt.a($$2), mw.k(mw.a($$0, $$1)), this.c);
   }

   private static mm b() {
      return mm.a(dnr.R).a(ih.f, mo.a().a(mp.b, mp.a.b)).a(ih.d, mo.a().a(mp.b, mp.a.c)).a(ih.e, mo.a().a(mp.b, mp.a.d)).a(ih.c, mo.a());
   }

   private static mm c() {
      return mm.a(dnr.R).a(ih.d, mo.a()).a(ih.e, mo.a().a(mp.b, mp.a.b)).a(ih.c, mo.a().a(mp.b, mp.a.c)).a(ih.f, mo.a().a(mp.b, mp.a.d));
   }

   private static mm d() {
      return mm.a(dnr.R).a(ih.f, mo.a()).a(ih.d, mo.a().a(mp.b, mp.a.b)).a(ih.e, mo.a().a(mp.b, mp.a.c)).a(ih.c, mo.a().a(mp.b, mp.a.d));
   }

   private static mm e() {
      return mm.a(dnr.P)
         .a(ih.a, mo.a().a(mp.a, mp.a.b))
         .a(ih.b, mo.a().a(mp.a, mp.a.d))
         .a(ih.c, mo.a())
         .a(ih.d, mo.a().a(mp.b, mp.a.c))
         .a(ih.e, mo.a().a(mp.b, mp.a.d))
         .a(ih.f, mo.a().a(mp.b, mp.a.b));
   }

   private static ml b(dac $$0, ajh $$1) {
      return ml.a($$0, a($$1));
   }

   private static mo[] a(ajh $$0) {
      return new mo[]{mo.a().a(mp.c, $$0), mo.a().a(mp.c, $$0).a(mp.b, mp.a.b), mo.a().a(mp.c, $$0).a(mp.b, mp.a.c), mo.a().a(mp.c, $$0).a(mp.b, mp.a.d)};
   }

   private static ml a(dac $$0, ajh $$1, ajh $$2) {
      return ml.a($$0, mo.a().a(mp.c, $$1), mo.a().a(mp.c, $$2), mo.a().a(mp.c, $$1).a(mp.b, mp.a.c), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c));
   }

   private static mm a(dns $$0, ajh $$1, ajh $$2) {
      return mm.a($$0).a(true, mo.a().a(mp.c, $$1)).a(false, mo.a().a(mp.c, $$2));
   }

   private void e(dac $$0) {
      ajh $$1 = my.a.create($$0, this.c);
      ajh $$2 = my.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dac $$0) {
      ajh $$1 = my.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dac $$0) {
      this.b.accept(ml.a($$0).a(mm.a(dnr.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ajh $$3 = mw.a($$0, $$2);
         return mo.a().a(mp.c, mv.c.a($$0, $$2, new mw().a(mx.a, $$3), this.c));
      })));
      this.a($$0, mw.a($$0, "_0"));
   }

   static mi b(dac $$0, ajh $$1, ajh $$2) {
      return ml.a($$0)
         .a(mm.a(dnr.w).a(false, mo.a().a(mp.c, $$1)).a(true, mo.a().a(mp.c, $$2)))
         .a(
            mm.a(dnr.U, dnr.R)
               .a(dnm.a, ih.f, mo.a().a(mp.b, mp.a.b))
               .a(dnm.a, ih.e, mo.a().a(mp.b, mp.a.d))
               .a(dnm.a, ih.d, mo.a().a(mp.b, mp.a.c))
               .a(dnm.a, ih.c, mo.a())
               .a(dnm.b, ih.f, mo.a().a(mp.b, mp.a.b).a(mp.a, mp.a.b).a(mp.d, true))
               .a(dnm.b, ih.e, mo.a().a(mp.b, mp.a.d).a(mp.a, mp.a.b).a(mp.d, true))
               .a(dnm.b, ih.d, mo.a().a(mp.b, mp.a.c).a(mp.a, mp.a.b).a(mp.d, true))
               .a(dnm.b, ih.c, mo.a().a(mp.a, mp.a.b).a(mp.d, true))
               .a(dnm.c, ih.f, mo.a().a(mp.b, mp.a.d).a(mp.a, mp.a.c))
               .a(dnm.c, ih.e, mo.a().a(mp.b, mp.a.b).a(mp.a, mp.a.c))
               .a(dnm.c, ih.d, mo.a().a(mp.a, mp.a.c))
               .a(dnm.c, ih.c, mo.a().a(mp.b, mp.a.c).a(mp.a, mp.a.c))
         );
   }

   private static mm.d<ih, dnx, dnw, Boolean> a(mm.d<ih, dnx, dnw, Boolean> $$0, dnx $$1, ajh $$2, ajh $$3, ajh $$4, ajh $$5) {
      return $$0.a(ih.f, $$1, dnw.a, false, mo.a().a(mp.c, $$2))
         .a(ih.d, $$1, dnw.a, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
         .a(ih.e, $$1, dnw.a, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.c))
         .a(ih.c, $$1, dnw.a, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.d))
         .a(ih.f, $$1, dnw.b, false, mo.a().a(mp.c, $$4))
         .a(ih.d, $$1, dnw.b, false, mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
         .a(ih.e, $$1, dnw.b, false, mo.a().a(mp.c, $$4).a(mp.b, mp.a.c))
         .a(ih.c, $$1, dnw.b, false, mo.a().a(mp.c, $$4).a(mp.b, mp.a.d))
         .a(ih.f, $$1, dnw.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
         .a(ih.d, $$1, dnw.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
         .a(ih.e, $$1, dnw.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
         .a(ih.c, $$1, dnw.a, true, mo.a().a(mp.c, $$3))
         .a(ih.f, $$1, dnw.b, true, mo.a().a(mp.c, $$5).a(mp.b, mp.a.d))
         .a(ih.d, $$1, dnw.b, true, mo.a().a(mp.c, $$5))
         .a(ih.e, $$1, dnw.b, true, mo.a().a(mp.c, $$5).a(mp.b, mp.a.b))
         .a(ih.c, $$1, dnw.b, true, mo.a().a(mp.c, $$5).a(mp.b, mp.a.c));
   }

   private static mi a(dac $$0, ajh $$1, ajh $$2, ajh $$3, ajh $$4, ajh $$5, ajh $$6, ajh $$7, ajh $$8) {
      return ml.a($$0).a(a(a(mm.a(dnr.R, dnr.ae, dnr.be, dnr.u), dnx.b, $$1, $$2, $$3, $$4), dnx.a, $$5, $$6, $$7, $$8));
   }

   static mi a(dac $$0, ajh $$1, ajh $$2, ajh $$3, ajh $$4, ajh $$5) {
      return mk.a($$0)
         .a(mo.a().a(mp.c, $$1))
         .a(mj.a().a(dnr.L, true), mo.a().a(mp.c, $$2).a(mp.d, false))
         .a(mj.a().a(dnr.M, true), mo.a().a(mp.c, $$3).a(mp.d, false))
         .a(mj.a().a(dnr.N, true), mo.a().a(mp.c, $$4).a(mp.d, false))
         .a(mj.a().a(dnr.O, true), mo.a().a(mp.c, $$5).a(mp.d, false));
   }

   static mi c(dac $$0, ajh $$1, ajh $$2) {
      return mk.a($$0)
         .a(mo.a().a(mp.c, $$1))
         .a(mj.a().a(dnr.L, true), mo.a().a(mp.c, $$2).a(mp.d, true))
         .a(mj.a().a(dnr.M, true), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, true))
         .a(mj.a().a(dnr.N, true), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, true))
         .a(mj.a().a(dnr.O, true), mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, true));
   }

   static mi a(dac $$0, ajh $$1, ajh $$2, ajh $$3) {
      return mk.a($$0)
         .a(mj.a().a(dnr.J, true), mo.a().a(mp.c, $$1))
         .a(mj.a().a(dnr.X, don.b), mo.a().a(mp.c, $$2).a(mp.d, true))
         .a(mj.a().a(dnr.W, don.b), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, true))
         .a(mj.a().a(dnr.Y, don.b), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, true))
         .a(mj.a().a(dnr.Z, don.b), mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, true))
         .a(mj.a().a(dnr.X, don.c), mo.a().a(mp.c, $$3).a(mp.d, true))
         .a(mj.a().a(dnr.W, don.c), mo.a().a(mp.c, $$3).a(mp.b, mp.a.b).a(mp.d, true))
         .a(mj.a().a(dnr.Y, don.c), mo.a().a(mp.c, $$3).a(mp.b, mp.a.c).a(mp.d, true))
         .a(mj.a().a(dnr.Z, don.c), mo.a().a(mp.c, $$3).a(mp.b, mp.a.d).a(mp.d, true));
   }

   static mi a(dac $$0, ajh $$1, ajh $$2, ajh $$3, ajh $$4, boolean $$5) {
      return ml.a($$0, mo.a().a(mp.d, $$5))
         .a(c())
         .a(
            mm.a(dnr.q, dnr.u)
               .a(false, false, mo.a().a(mp.c, $$2))
               .a(true, false, mo.a().a(mp.c, $$4))
               .a(false, true, mo.a().a(mp.c, $$1))
               .a(true, true, mo.a().a(mp.c, $$3))
         );
   }

   static mi b(dac $$0, ajh $$1, ajh $$2, ajh $$3) {
      return ml.a($$0)
         .a(
            mm.a(dnr.R, dnr.af, dnr.bi)
               .a(ih.f, doa.b, dok.a, mo.a().a(mp.c, $$2))
               .a(ih.e, doa.b, dok.a, mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, doa.b, dok.a, mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, doa.b, dok.a, mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, doa.b, dok.e, mo.a().a(mp.c, $$3))
               .a(ih.e, doa.b, dok.e, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, doa.b, dok.e, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, doa.b, dok.e, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, doa.b, dok.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.e, doa.b, dok.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.d, doa.b, dok.d, mo.a().a(mp.c, $$3))
               .a(ih.c, doa.b, dok.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.f, doa.b, dok.c, mo.a().a(mp.c, $$1))
               .a(ih.e, doa.b, dok.c, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, doa.b, dok.c, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, doa.b, dok.c, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, doa.b, dok.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.e, doa.b, dok.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.d, doa.b, dok.b, mo.a().a(mp.c, $$1))
               .a(ih.c, doa.b, dok.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.f, doa.a, dok.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.e, doa.a, dok.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, doa.a, dok.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, doa.a, dok.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, doa.a, dok.e, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.e, doa.a, dok.e, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.d, doa.a, dok.e, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.c, doa.a, dok.e, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.f, doa.a, dok.d, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.e, doa.a, dok.d, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, doa.a, dok.d, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, doa.a, dok.d, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, doa.a, dok.c, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.e, doa.a, dok.c, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.d, doa.a, dok.c, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.c, doa.a, dok.c, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.f, doa.a, dok.b, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.e, doa.a, dok.b, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, doa.a, dok.b, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, doa.a, dok.b, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
         );
   }

   private static mi c(dac $$0, ajh $$1, ajh $$2, ajh $$3) {
      return ml.a($$0)
         .a(
            mm.a(dnr.R, dnr.af, dnr.u)
               .a(ih.c, doa.b, false, mo.a().a(mp.c, $$2))
               .a(ih.d, doa.b, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.c))
               .a(ih.f, doa.b, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
               .a(ih.e, doa.b, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.d))
               .a(ih.c, doa.a, false, mo.a().a(mp.c, $$1))
               .a(ih.d, doa.a, false, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c))
               .a(ih.f, doa.a, false, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b))
               .a(ih.e, doa.a, false, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d))
               .a(ih.c, doa.b, true, mo.a().a(mp.c, $$3))
               .a(ih.d, doa.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               .a(ih.f, doa.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(ih.e, doa.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
               .a(ih.c, doa.a, true, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.c))
               .a(ih.d, doa.a, true, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.a))
               .a(ih.f, doa.a, true, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.d))
               .a(ih.e, doa.a, true, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.b))
         );
   }

   private static mi d(dac $$0, ajh $$1, ajh $$2, ajh $$3) {
      return ml.a($$0)
         .a(
            mm.a(dnr.R, dnr.af, dnr.u)
               .a(ih.c, doa.b, false, mo.a().a(mp.c, $$2))
               .a(ih.d, doa.b, false, mo.a().a(mp.c, $$2))
               .a(ih.f, doa.b, false, mo.a().a(mp.c, $$2))
               .a(ih.e, doa.b, false, mo.a().a(mp.c, $$2))
               .a(ih.c, doa.a, false, mo.a().a(mp.c, $$1))
               .a(ih.d, doa.a, false, mo.a().a(mp.c, $$1))
               .a(ih.f, doa.a, false, mo.a().a(mp.c, $$1))
               .a(ih.e, doa.a, false, mo.a().a(mp.c, $$1))
               .a(ih.c, doa.b, true, mo.a().a(mp.c, $$3))
               .a(ih.d, doa.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               .a(ih.f, doa.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(ih.e, doa.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
               .a(ih.c, doa.a, true, mo.a().a(mp.c, $$3))
               .a(ih.d, doa.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               .a(ih.f, doa.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(ih.e, doa.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
         );
   }

   static ml c(dac $$0, ajh $$1) {
      return ml.a($$0, mo.a().a(mp.c, $$1));
   }

   private static mm f() {
      return mm.a(dnr.I).a(ih.a.b, mo.a()).a(ih.a.c, mo.a().a(mp.a, mp.a.b)).a(ih.a.a, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.b));
   }

   static mi a(dac $$0, mw $$1, BiConsumer<ajh, Supplier<JsonElement>> $$2) {
      ajh $$3 = mv.g.a($$0, $$1, $$2);
      ajh $$4 = mv.h.a($$0, $$1, $$2);
      ajh $$5 = mv.i.a($$0, $$1, $$2);
      ajh $$6 = mv.j.a($$0, $$1, $$2);
      return ml.a($$0, mo.a().a(mp.c, $$6)).a(mm.a(dnr.I).a(ih.a.a, mo.a().a(mp.c, $$3)).a(ih.a.b, mo.a().a(mp.c, $$4)).a(ih.a.c, mo.a().a(mp.c, $$5)));
   }

   static mi d(dac $$0, ajh $$1) {
      return ml.a($$0, mo.a().a(mp.c, $$1)).a(f());
   }

   private void e(dac $$0, ajh $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dac $$0, my.a $$1) {
      ajh $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dac $$0, my.a $$1) {
      ajh $$2 = $$1.create($$0, this.c);
      this.b.accept(ml.a($$0, mo.a().a(mp.c, $$2)).a(b()));
   }

   static mi d(dac $$0, ajh $$1, ajh $$2) {
      return ml.a($$0)
         .a(
            mm.a(dnr.I)
               .a(ih.a.b, mo.a().a(mp.c, $$1))
               .a(ih.a.c, mo.a().a(mp.c, $$2).a(mp.a, mp.a.b))
               .a(ih.a.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.b).a(mp.b, mp.a.b))
         );
   }

   private void a(dac $$0, my.a $$1, my.a $$2) {
      ajh $$3 = $$1.create($$0, this.c);
      ajh $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ajh a(dac $$0, String $$1, mu $$2, Function<ajh, mw> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mw.a($$0, $$1)), this.c);
   }

   static mi e(dac $$0, ajh $$1, ajh $$2) {
      return ml.a($$0).a(a(dnr.w, $$2, $$1));
   }

   static mi e(dac $$0, ajh $$1, ajh $$2, ajh $$3) {
      return ml.a($$0).a(mm.a(dnr.bh).a(doj.b, mo.a().a(mp.c, $$1)).a(doj.a, mo.a().a(mp.c, $$2)).a(doj.c, mo.a().a(mp.c, $$3)));
   }

   public void a(dac $$0) {
      this.b($$0, my.a);
   }

   public void b(dac $$0, my.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dac $$0, mw $$1, mu $$2) {
      ajh $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private mf.b h(dac $$0) {
      my $$1 = this.g.getOrDefault($$0, my.a.get($$0));
      return new mf.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dac $$0, dac $$1, dac $$2) {
      mw $$3 = mw.u($$0);
      ajh $$4 = mv.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.l());
      this.c($$2);
   }

   void i(dac $$0) {
      mw $$1 = mw.t($$0);
      ajh $$2 = mv.v.a($$0, $$1, this.c);
      ajh $$3 = mv.w.a($$0, $$1, this.c);
      ajh $$4 = mv.x.a($$0, $$1, this.c);
      ajh $$5 = mv.y.a($$0, $$1, this.c);
      ajh $$6 = mv.z.a($$0, $$1, this.c);
      ajh $$7 = mv.A.a($$0, $$1, this.c);
      ajh $$8 = mv.B.a($$0, $$1, this.c);
      ajh $$9 = mv.C.a($$0, $$1, this.c);
      this.a($$0.l());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dac $$0, dac $$1) {
      ajh $$2 = mv.v.a($$0);
      ajh $$3 = mv.w.a($$0);
      ajh $$4 = mv.x.a($$0);
      ajh $$5 = mv.y.a($$0);
      ajh $$6 = mv.z.a($$0);
      ajh $$7 = mv.A.a($$0);
      ajh $$8 = mv.B.a($$0);
      ajh $$9 = mv.C.a($$0);
      this.a($$1, mt.a($$0.l()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dac $$0) {
      mw $$1 = mw.b($$0);
      ajh $$2 = mv.ak.a($$0, $$1, this.c);
      ajh $$3 = mv.al.a($$0, $$1, this.c);
      ajh $$4 = mv.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dac $$0) {
      mw $$1 = mw.b($$0);
      ajh $$2 = mv.ah.a($$0, $$1, this.c);
      ajh $$3 = mv.ai.a($$0, $$1, this.c);
      ajh $$4 = mv.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dac $$0, dac $$1) {
      ajh $$2 = mv.ah.a($$0);
      ajh $$3 = mv.ai.a($$0);
      ajh $$4 = mv.aj.a($$0);
      this.a($$1, mt.a($$0.l()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dae.sD);
      ajh $$0 = mt.a(dae.sD);
      ajh $$1 = mt.a(dae.sD, "_partial_tilt");
      ajh $$2 = mt.a(dae.sD, "_full_tilt");
      this.b
         .accept(
            ml.a(dae.sD)
               .a(b())
               .a(mm.a(dnr.bl).a(dom.a, mo.a().a(mp.c, $$0)).a(dom.b, mo.a().a(mp.c, $$0)).a(dom.c, mo.a().a(mp.c, $$1)).a(dom.d, mo.a().a(mp.c, $$2)))
         );
   }

   private mf.f l(dac $$0) {
      return new mf.f(mw.n($$0));
   }

   private void m(dac $$0) {
      this.c($$0, $$0);
   }

   private void c(dac $$0, dac $$1) {
      this.b.accept(c($$0, mt.a($$1)));
   }

   private void a(dac $$0, mf.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dac $$0, mf.e $$1, mw $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dac $$0, mf.e $$1) {
      mw $$2 = mw.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dac $$0, mf.e $$1, mw $$2) {
      ajh $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dac $$0, mf.e $$1, doe<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         mm $$4 = mm.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mw $$5 = mw.c(mw.a($$0, $$4x));
            ajh $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return mo.a().a(mp.c, $$6);
         });
         this.a($$0.l());
         this.b.accept(ml.a($$0).a($$4));
      }
   }

   private void a(dac $$0, dac $$1, mf.e $$2) {
      this.a($$0, $$2);
      mw $$3 = mw.d($$0);
      ajh $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dac $$0, dac $$1) {
      my $$2 = my.p.get($$0);
      ajh $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ajh $$4 = mv.aC.a($$1, $$2.b(), this.c);
      this.b.accept(ml.a($$1, mo.a().a(mp.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dac $$0, dac $$1) {
      this.a($$0.l());
      mw $$2 = mw.h($$0);
      mw $$3 = mw.a($$0, $$1);
      ajh $$4 = mv.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            ml.a($$1, mo.a().a(mp.c, $$4))
               .a(mm.a(dnr.R).a(ih.e, mo.a()).a(ih.d, mo.a().a(mp.b, mp.a.d)).a(ih.c, mo.a().a(mp.b, mp.a.b)).a(ih.f, mo.a().a(mp.b, mp.a.c)))
         );
      this.b.accept(ml.a($$0).a(mm.a(dnr.av).a($$2x -> mo.a().a(mp.c, mv.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dac $$0 = dae.kC;
      this.a($$0.l());
      ajh $$1 = mt.a($$0, "_top");
      ajh $$2 = mt.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dac $$0 = dae.kB;
      this.a($$0.l());
      mm $$1 = mm.a(dfq.d, dnr.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> mo.a().a(mp.c, mt.a($$0, "_top_stage_" + $$1x));
            case b -> mo.a().a(mp.c, mt.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(ml.a($$0).a($$1));
   }

   private void a(dac $$0, dac $$1, dac $$2, dac $$3, dac $$4, dac $$5, dac $$6, dac $$7) {
      this.a($$0, mf.e.b);
      this.a($$1, mf.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dac $$0, mf.e $$1) {
      this.a($$0, "_top");
      ajh $$2 = this.a($$0, "_top", $$1.a(), mw::c);
      ajh $$3 = this.a($$0, "_bottom", $$1.a(), mw::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dae.iD, "_front");
      ajh $$0 = mt.a(dae.iD, "_top");
      ajh $$1 = this.a(dae.iD, "_bottom", mf.e.b.a(), mw::c);
      this.f(dae.iD, $$0, $$1);
   }

   private void k() {
      ajh $$0 = this.a(dae.bx, "_top", mv.bk, mw::a);
      ajh $$1 = this.a(dae.bx, "_bottom", mv.bk, mw::a);
      this.f(dae.bx, $$0, $$1);
   }

   private void l() {
      this.c(dae.sF);
      ajh $$0 = mt.a(dae.sF, "_top");
      ajh $$1 = mt.a(dae.sF, "_bottom");
      this.b.accept(ml.a(dae.sF).a(b()).a(mm.a(dnr.ae).a(dnx.b, mo.a().a(mp.c, $$1)).a(dnx.a, mo.a().a(mp.c, $$0))));
   }

   private void f(dac $$0, ajh $$1, ajh $$2) {
      this.b.accept(ml.a($$0).a(mm.a(dnr.ae).a(dnx.b, mo.a().a(mp.c, $$2)).a(dnx.a, mo.a().a(mp.c, $$1))));
   }

   private void n(dac $$0) {
      mw $$1 = mw.e($$0);
      mw $$2 = mw.e(mw.a($$0, "_corner"));
      ajh $$3 = mv.as.a($$0, $$1, this.c);
      ajh $$4 = mv.at.a($$0, $$2, this.c);
      ajh $$5 = mv.au.a($$0, $$1, this.c);
      ajh $$6 = mv.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            ml.a($$0)
               .a(
                  mm.a(dnr.ag)
                     .a(dof.a, mo.a().a(mp.c, $$3))
                     .a(dof.b, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
                     .a(dof.c, mo.a().a(mp.c, $$5).a(mp.b, mp.a.b))
                     .a(dof.d, mo.a().a(mp.c, $$6).a(mp.b, mp.a.b))
                     .a(dof.e, mo.a().a(mp.c, $$5))
                     .a(dof.f, mo.a().a(mp.c, $$6))
                     .a(dof.g, mo.a().a(mp.c, $$4))
                     .a(dof.h, mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
                     .a(dof.i, mo.a().a(mp.c, $$4).a(mp.b, mp.a.c))
                     .a(dof.j, mo.a().a(mp.c, $$4).a(mp.b, mp.a.d))
               )
         );
   }

   private void o(dac $$0) {
      ajh $$1 = this.a($$0, "", mv.as, mw::e);
      ajh $$2 = this.a($$0, "", mv.au, mw::e);
      ajh $$3 = this.a($$0, "", mv.av, mw::e);
      ajh $$4 = this.a($$0, "_on", mv.as, mw::e);
      ajh $$5 = this.a($$0, "_on", mv.au, mw::e);
      ajh $$6 = this.a($$0, "_on", mv.av, mw::e);
      mm $$7 = mm.a(dnr.w, dnr.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return mo.a().a(mp.c, $$6x ? $$4 : $$1);
            case b:
               return mo.a().a(mp.c, $$6x ? $$4 : $$1).a(mp.b, mp.a.b);
            case c:
               return mo.a().a(mp.c, $$6x ? $$5 : $$2).a(mp.b, mp.a.b);
            case d:
               return mo.a().a(mp.c, $$6x ? $$6 : $$3).a(mp.b, mp.a.b);
            case e:
               return mo.a().a(mp.c, $$6x ? $$5 : $$2);
            case f:
               return mo.a().a(mp.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(ml.a($$0).a($$7));
   }

   private mf.a a(ajh $$0, dac $$1) {
      return new mf.a($$0, $$1);
   }

   private mf.a f(dac $$0, dac $$1) {
      return new mf.a(mt.a($$0), $$1);
   }

   private void a(dac $$0, cqh $$1) {
      ajh $$2 = mv.aa.a($$0, mw.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dac $$0, ajh $$1) {
      ajh $$2 = mv.aa.a($$0, mw.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dac $$0, dac $$1) {
      this.a($$0);
      ajh $$2 = my.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dac $$0) {
      this.a($$0.l());
      ajh $$1 = my.k.create($$0, this.c);
      ajh $$2 = my.l.create($$0, this.c);
      ajh $$3 = my.m.create($$0, this.c);
      ajh $$4 = my.n.create($$0, this.c);
      this.b
         .accept(
            mk.a($$0)
               .a(mj.a().a(dnr.S, 1, 2, 3, 4).a(dnr.R, ih.c), mo.a().a(mp.c, $$1))
               .a(mj.a().a(dnr.S, 1, 2, 3, 4).a(dnr.R, ih.f), mo.a().a(mp.c, $$1).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.S, 1, 2, 3, 4).a(dnr.R, ih.d), mo.a().a(mp.c, $$1).a(mp.b, mp.a.c))
               .a(mj.a().a(dnr.S, 1, 2, 3, 4).a(dnr.R, ih.e), mo.a().a(mp.c, $$1).a(mp.b, mp.a.d))
               .a(mj.a().a(dnr.S, 2, 3, 4).a(dnr.R, ih.c), mo.a().a(mp.c, $$2))
               .a(mj.a().a(dnr.S, 2, 3, 4).a(dnr.R, ih.f), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.S, 2, 3, 4).a(dnr.R, ih.d), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c))
               .a(mj.a().a(dnr.S, 2, 3, 4).a(dnr.R, ih.e), mo.a().a(mp.c, $$2).a(mp.b, mp.a.d))
               .a(mj.a().a(dnr.S, 3, 4).a(dnr.R, ih.c), mo.a().a(mp.c, $$3))
               .a(mj.a().a(dnr.S, 3, 4).a(dnr.R, ih.f), mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.S, 3, 4).a(dnr.R, ih.d), mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               .a(mj.a().a(dnr.S, 3, 4).a(dnr.R, ih.e), mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
               .a(mj.a().a(dnr.S, 4).a(dnr.R, ih.c), mo.a().a(mp.c, $$4))
               .a(mj.a().a(dnr.S, 4).a(dnr.R, ih.f), mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.S, 4).a(dnr.R, ih.d), mo.a().a(mp.c, $$4).a(mp.b, mp.a.c))
               .a(mj.a().a(dnr.S, 4).a(dnr.R, ih.e), mo.a().a(mp.c, $$4).a(mp.b, mp.a.d))
         );
   }

   private void a(my.a $$0, dac... $$1) {
      for (dac $$2 : $$1) {
         ajh $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(my.a $$0, dac... $$1) {
      for (dac $$2 : $$1) {
         ajh $$3 = $$0.create($$2, this.c);
         this.b.accept(ml.a($$2, mo.a().a(mp.c, $$3)).a(c()));
      }
   }

   private void h(dac $$0, dac $$1) {
      this.a($$0);
      mw $$2 = mw.b($$0, $$1);
      ajh $$3 = mv.aI.a($$1, $$2, this.c);
      ajh $$4 = mv.aJ.a($$1, $$2, this.c);
      ajh $$5 = mv.aK.a($$1, $$2, this.c);
      ajh $$6 = mv.aG.a($$1, $$2, this.c);
      ajh $$7 = mv.aH.a($$1, $$2, this.c);
      cqh $$8 = $$1.l();
      mv.bx.a(mt.a($$8), mw.F($$0), this.c);
      this.b
         .accept(
            mk.a($$1)
               .a(mo.a().a(mp.c, $$3))
               .a(mj.a().a(dnr.L, true), mo.a().a(mp.c, $$4))
               .a(mj.a().a(dnr.M, true), mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.N, true), mo.a().a(mp.c, $$5))
               .a(mj.a().a(dnr.O, true), mo.a().a(mp.c, $$5).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.L, false), mo.a().a(mp.c, $$6))
               .a(mj.a().a(dnr.M, false), mo.a().a(mp.c, $$7))
               .a(mj.a().a(dnr.N, false), mo.a().a(mp.c, $$7).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.O, false), mo.a().a(mp.c, $$6).a(mp.b, mp.a.d))
         );
   }

   private void q(dac $$0) {
      mw $$1 = mw.z($$0);
      ajh $$2 = mv.aL.a($$0, $$1, this.c);
      ajh $$3 = this.a($$0, "_conditional", mv.aL, $$1x -> $$1.c(mx.i, $$1x));
      this.b.accept(ml.a($$0).a(a(dnr.c, $$3, $$2)).a(e()));
   }

   private void r(dac $$0) {
      ajh $$1 = my.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<mo> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> mo.a().a(mp.c, mt.a(dae.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dae.mZ);
      this.b
         .accept(
            mk.a(dae.mZ)
               .a(mj.a().a(dnr.aq, 0), this.a(0))
               .a(mj.a().a(dnr.aq, 1), this.a(1))
               .a(mj.a().a(dnr.bk, dnn.b), mo.a().a(mp.c, mt.a(dae.mZ, "_small_leaves")))
               .a(mj.a().a(dnr.bk, dnn.c), mo.a().a(mp.c, mt.a(dae.mZ, "_large_leaves")))
         );
   }

   private mm n() {
      return mm.a(dnr.P)
         .a(ih.a, mo.a().a(mp.a, mp.a.c))
         .a(ih.b, mo.a())
         .a(ih.c, mo.a().a(mp.a, mp.a.b))
         .a(ih.d, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.c))
         .a(ih.e, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.d))
         .a(ih.f, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.b));
   }

   private void o() {
      ajh $$0 = mw.a(dae.nU, "_top_open");
      this.b
         .accept(
            ml.a(dae.nU)
               .a(this.n())
               .a(
                  mm.a(dnr.u)
                     .a(false, mo.a().a(mp.c, my.f.create(dae.nU, this.c)))
                     .a(true, mo.a().a(mp.c, my.f.get(dae.nU).a($$1 -> $$1.a(mx.f, $$0)).a(dae.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mm a(doe<T> $$0, T $$1, ajh $$2, ajh $$3) {
      mo $$4 = mo.a().a(mp.c, $$2);
      mo $$5 = mo.a().a(mp.c, $$3);
      return mm.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dac $$0, Function<dac, mw> $$1) {
      mw $$2 = $$1.apply($$0).b(mx.i, mx.c);
      mw $$3 = $$2.c(mx.g, mw.a($$0, "_front_honey"));
      ajh $$4 = mv.q.a($$0, $$2, this.c);
      ajh $$5 = mv.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(ml.a($$0).a(b()).a(a(dnr.aN, 5, $$5, $$4)));
   }

   private void a(dac $$0, doe<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ajh> $$3 = new Int2ObjectOpenHashMap();
         mm $$4 = mm.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ajh $$5 = (ajh)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mv.aV, mw::g));
            return mo.a().a(mp.c, $$5);
         });
         this.a($$0.l());
         this.b.accept(ml.a($$0).a($$4));
      }
   }

   private void p() {
      ajh $$0 = mt.a(dae.od, "_floor");
      ajh $$1 = mt.a(dae.od, "_ceiling");
      ajh $$2 = mt.a(dae.od, "_wall");
      ajh $$3 = mt.a(dae.od, "_between_walls");
      this.a(cqp.wk);
      this.b
         .accept(
            ml.a(dae.od)
               .a(
                  mm.a(dnr.R, dnr.V)
                     .a(ih.c, dnp.a, mo.a().a(mp.c, $$0))
                     .a(ih.d, dnp.a, mo.a().a(mp.c, $$0).a(mp.b, mp.a.c))
                     .a(ih.f, dnp.a, mo.a().a(mp.c, $$0).a(mp.b, mp.a.b))
                     .a(ih.e, dnp.a, mo.a().a(mp.c, $$0).a(mp.b, mp.a.d))
                     .a(ih.c, dnp.b, mo.a().a(mp.c, $$1))
                     .a(ih.d, dnp.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c))
                     .a(ih.f, dnp.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b))
                     .a(ih.e, dnp.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d))
                     .a(ih.c, dnp.c, mo.a().a(mp.c, $$2).a(mp.b, mp.a.d))
                     .a(ih.d, dnp.c, mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
                     .a(ih.f, dnp.c, mo.a().a(mp.c, $$2))
                     .a(ih.e, dnp.c, mo.a().a(mp.c, $$2).a(mp.b, mp.a.c))
                     .a(ih.d, dnp.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
                     .a(ih.c, dnp.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
                     .a(ih.f, dnp.d, mo.a().a(mp.c, $$3))
                     .a(ih.e, dnp.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            ml.a(dae.nZ, mo.a().a(mp.c, mt.a(dae.nZ)))
               .a(
                  mm.a(dnr.U, dnr.R)
                     .a(dnm.a, ih.c, mo.a())
                     .a(dnm.a, ih.f, mo.a().a(mp.b, mp.a.b))
                     .a(dnm.a, ih.d, mo.a().a(mp.b, mp.a.c))
                     .a(dnm.a, ih.e, mo.a().a(mp.b, mp.a.d))
                     .a(dnm.b, ih.c, mo.a().a(mp.a, mp.a.b))
                     .a(dnm.b, ih.f, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.b))
                     .a(dnm.b, ih.d, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.c))
                     .a(dnm.b, ih.e, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.d))
                     .a(dnm.c, ih.d, mo.a().a(mp.a, mp.a.c))
                     .a(dnm.c, ih.e, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.b))
                     .a(dnm.c, ih.c, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.c))
                     .a(dnm.c, ih.f, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.d))
               )
         );
   }

   private void d(dac $$0, my.a $$1) {
      ajh $$2 = $$1.create($$0, this.c);
      ajh $$3 = mw.a($$0, "_front_on");
      ajh $$4 = $$1.get($$0).a($$1x -> $$1x.a(mx.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(ml.a($$0).a(a(dnr.r, $$4, $$2)).a(b()));
   }

   private void a(dac... $$0) {
      ajh $$1 = mt.a("campfire_off");

      for (dac $$2 : $$0) {
         ajh $$3 = mv.bc.a($$2, mw.E($$2), this.c);
         this.a($$2.l());
         this.b.accept(ml.a($$2).a(a(dnr.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dac $$0) {
      ajh $$1 = mv.bt.a($$0, mw.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dac $$0) {
      ajh $$1;
      if ($$0 == dae.tj) {
         $$1 = mv.bv.a($$0, mw.m($$0), this.c);
      } else {
         $$1 = mv.bu.a($$0, mw.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mw $$0 = mw.a(mw.G(dae.cl), mw.G(dae.n));
      ajh $$1 = mv.j.a(dae.cl, $$0, this.c);
      this.b.accept(c(dae.cl, $$1));
   }

   private void s() {
      this.a(cqp.lG);
      this.b
         .accept(
            mk.a(dae.cw)
               .a(
                  mj.b(
                     mj.a().a(dnr.ab, dog.c).a(dnr.aa, dog.c).a(dnr.ac, dog.c).a(dnr.ad, dog.c),
                     mj.a().a(dnr.ab, dog.b, dog.a).a(dnr.aa, dog.b, dog.a),
                     mj.a().a(dnr.aa, dog.b, dog.a).a(dnr.ac, dog.b, dog.a),
                     mj.a().a(dnr.ac, dog.b, dog.a).a(dnr.ad, dog.b, dog.a),
                     mj.a().a(dnr.ad, dog.b, dog.a).a(dnr.ab, dog.b, dog.a)
                  ),
                  mo.a().a(mp.c, mt.a("redstone_dust_dot"))
               )
               .a(mj.a().a(dnr.ab, dog.b, dog.a), mo.a().a(mp.c, mt.a("redstone_dust_side0")))
               .a(mj.a().a(dnr.ac, dog.b, dog.a), mo.a().a(mp.c, mt.a("redstone_dust_side_alt0")))
               .a(mj.a().a(dnr.aa, dog.b, dog.a), mo.a().a(mp.c, mt.a("redstone_dust_side_alt1")).a(mp.b, mp.a.d))
               .a(mj.a().a(dnr.ad, dog.b, dog.a), mo.a().a(mp.c, mt.a("redstone_dust_side1")).a(mp.b, mp.a.d))
               .a(mj.a().a(dnr.ab, dog.a), mo.a().a(mp.c, mt.a("redstone_dust_up")))
               .a(mj.a().a(dnr.aa, dog.a), mo.a().a(mp.c, mt.a("redstone_dust_up")).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.ac, dog.a), mo.a().a(mp.c, mt.a("redstone_dust_up")).a(mp.b, mp.a.c))
               .a(mj.a().a(dnr.ad, dog.a), mo.a().a(mp.c, mt.a("redstone_dust_up")).a(mp.b, mp.a.d))
         );
   }

   private void t() {
      this.a(cqp.lK);
      this.b
         .accept(
            ml.a(dae.gY)
               .a(c())
               .a(
                  mm.a(dnr.bd, dnr.w)
                     .a(dnu.a, false, mo.a().a(mp.c, mt.a(dae.gY)))
                     .a(dnu.a, true, mo.a().a(mp.c, mt.a(dae.gY, "_on")))
                     .a(dnu.b, false, mo.a().a(mp.c, mt.a(dae.gY, "_subtract")))
                     .a(dnu.b, true, mo.a().a(mp.c, mt.a(dae.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mw $$0 = mw.a(dae.jR);
      mw $$1 = mw.a(mw.a(dae.jE, "_side"), $$0.a(mx.f));
      ajh $$2 = mv.ab.a(dae.jE, $$1, this.c);
      ajh $$3 = mv.ac.a(dae.jE, $$1, this.c);
      ajh $$4 = mv.j.b(dae.jE, "_double", $$1, this.c);
      this.b.accept(e(dae.jE, $$2, $$3, $$4));
      this.b.accept(c(dae.jR, mv.c.a(dae.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cqp.sp);
      this.b
         .accept(
            mk.a(dae.fs)
               .a(mo.a().a(mp.c, mw.G(dae.fs)))
               .a(mj.a().a(dnr.k, true), mo.a().a(mp.c, mw.a(dae.fs, "_bottle0")))
               .a(mj.a().a(dnr.l, true), mo.a().a(mp.c, mw.a(dae.fs, "_bottle1")))
               .a(mj.a().a(dnr.m, true), mo.a().a(mp.c, mw.a(dae.fs, "_bottle2")))
               .a(mj.a().a(dnr.k, false), mo.a().a(mp.c, mw.a(dae.fs, "_empty0")))
               .a(mj.a().a(dnr.l, false), mo.a().a(mp.c, mw.a(dae.fs, "_empty1")))
               .a(mj.a().a(dnr.m, false), mo.a().a(mp.c, mw.a(dae.fs, "_empty2")))
         );
   }

   private void u(dac $$0) {
      ajh $$1 = mv.bp.a($$0, mw.b($$0), this.c);
      ajh $$2 = mt.a("mushroom_block_inside");
      this.b
         .accept(
            mk.a($$0)
               .a(mj.a().a(dnr.L, true), mo.a().a(mp.c, $$1))
               .a(mj.a().a(dnr.M, true), mo.a().a(mp.c, $$1).a(mp.b, mp.a.b).a(mp.d, true))
               .a(mj.a().a(dnr.N, true), mo.a().a(mp.c, $$1).a(mp.b, mp.a.c).a(mp.d, true))
               .a(mj.a().a(dnr.O, true), mo.a().a(mp.c, $$1).a(mp.b, mp.a.d).a(mp.d, true))
               .a(mj.a().a(dnr.J, true), mo.a().a(mp.c, $$1).a(mp.a, mp.a.d).a(mp.d, true))
               .a(mj.a().a(dnr.K, true), mo.a().a(mp.c, $$1).a(mp.a, mp.a.b).a(mp.d, true))
               .a(mj.a().a(dnr.L, false), mo.a().a(mp.c, $$2))
               .a(mj.a().a(dnr.M, false), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, false))
               .a(mj.a().a(dnr.N, false), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, false))
               .a(mj.a().a(dnr.O, false), mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, false))
               .a(mj.a().a(dnr.J, false), mo.a().a(mp.c, $$2).a(mp.a, mp.a.d).a(mp.d, false))
               .a(mj.a().a(dnr.K, false), mo.a().a(mp.c, $$2).a(mp.a, mp.a.b).a(mp.d, false))
         );
      this.a($$0, my.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cqp.rA);
      this.b
         .accept(
            ml.a(dae.eg)
               .a(
                  mm.a(dnr.ay)
                     .a(0, mo.a().a(mp.c, mt.a(dae.eg)))
                     .a(1, mo.a().a(mp.c, mt.a(dae.eg, "_slice1")))
                     .a(2, mo.a().a(mp.c, mt.a(dae.eg, "_slice2")))
                     .a(3, mo.a().a(mp.c, mt.a(dae.eg, "_slice3")))
                     .a(4, mo.a().a(mp.c, mt.a(dae.eg, "_slice4")))
                     .a(5, mo.a().a(mp.c, mt.a(dae.eg, "_slice5")))
                     .a(6, mo.a().a(mp.c, mt.a(dae.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mw $$0 = new mw()
         .a(mx.c, mw.a(dae.nX, "_side3"))
         .a(mx.o, mw.G(dae.t))
         .a(mx.n, mw.a(dae.nX, "_top"))
         .a(mx.j, mw.a(dae.nX, "_side3"))
         .a(mx.l, mw.a(dae.nX, "_side3"))
         .a(mx.k, mw.a(dae.nX, "_side1"))
         .a(mx.m, mw.a(dae.nX, "_side2"));
      this.b.accept(c(dae.nX, mv.a.a(dae.nX, $$0, this.c)));
   }

   private void y() {
      mw $$0 = new mw()
         .a(mx.c, mw.a(dae.ob, "_front"))
         .a(mx.o, mw.a(dae.ob, "_bottom"))
         .a(mx.n, mw.a(dae.ob, "_top"))
         .a(mx.j, mw.a(dae.ob, "_front"))
         .a(mx.k, mw.a(dae.ob, "_front"))
         .a(mx.l, mw.a(dae.ob, "_side"))
         .a(mx.m, mw.a(dae.ob, "_side"));
      this.b.accept(c(dae.ob, mv.a.a(dae.ob, $$0, this.c)));
   }

   private void a(dac $$0, dac $$1, BiFunction<dac, dac, mw> $$2) {
      mw $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mv.a.a($$0, $$3, this.c)));
   }

   public void b(dac $$0) {
      mw $$1 = new mw()
         .a(mx.c, mw.a($$0, "_particle"))
         .a(mx.o, mw.a($$0, "_down"))
         .a(mx.n, mw.a($$0, "_up"))
         .a(mx.j, mw.a($$0, "_north"))
         .a(mx.k, mw.a($$0, "_south"))
         .a(mx.l, mw.a($$0, "_east"))
         .a(mx.m, mw.a($$0, "_west"));
      this.b.accept(c($$0, mv.a.a($$0, $$1, this.c)));
   }

   private void z() {
      mw $$0 = mw.k(dae.eZ);
      this.b.accept(c(dae.eZ, mt.a(dae.eZ)));
      this.a(dae.ee, $$0);
      this.a(dae.ef, $$0);
   }

   private void a(dac $$0, mw $$1) {
      ajh $$2 = mv.p.a($$0, $$1.c(mx.g, mw.G($$0)), this.c);
      this.b.accept(ml.a($$0, mo.a().a(mp.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cqp.sq);
      this.m(dae.ft);
      this.b.accept(c(dae.fv, mv.bs.a(dae.fv, mw.j(mw.a(dae.H, "_still")), this.c)));
      this.b
         .accept(
            ml.a(dae.fu)
               .a(
                  mm.a(dek.g)
                     .a(1, mo.a().a(mp.c, mv.bq.a(dae.fu, "_level1", mw.j(mw.a(dae.G, "_still")), this.c)))
                     .a(2, mo.a().a(mp.c, mv.br.a(dae.fu, "_level2", mw.j(mw.a(dae.G, "_still")), this.c)))
                     .a(3, mo.a().a(mp.c, mv.bs.a(dae.fu, "_full", mw.j(mw.a(dae.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            ml.a(dae.fw)
               .a(
                  mm.a(dek.g)
                     .a(1, mo.a().a(mp.c, mv.bq.a(dae.fw, "_level1", mw.j(mw.G(dae.qP)), this.c)))
                     .a(2, mo.a().a(mp.c, mv.br.a(dae.fw, "_level2", mw.j(mw.G(dae.qP)), this.c)))
                     .a(3, mo.a().a(mp.c, mv.bs.a(dae.fw, "_full", mw.j(mw.G(dae.qP)), this.c)))
               )
         );
   }

   private void B() {
      mw $$0 = mw.b(dae.kv);
      ajh $$1 = mv.aE.a(dae.kv, $$0, this.c);
      ajh $$2 = this.a(dae.kv, "_dead", mv.aE, $$1x -> $$0.c(mx.b, $$1x));
      this.b.accept(ml.a(dae.kv).a(a(dnr.au, 5, $$2, $$1)));
   }

   private void C() {
      ajh $$0 = mt.a(dae.tq);
      ajh $$1 = mt.a(dae.tq, "_triggered");
      ajh $$2 = mt.a(dae.tq, "_crafting");
      ajh $$3 = mt.a(dae.tq, "_crafting_triggered");
      this.b
         .accept(
            ml.a(dae.tq)
               .a(mm.a(dnr.T).a($$0x -> this.a($$0x, mo.a())))
               .a(
                  mm.a(dnr.A, dbv.b)
                     .a(false, false, mo.a().a(mp.c, $$0))
                     .a(true, true, mo.a().a(mp.c, $$3))
                     .a(true, false, mo.a().a(mp.c, $$1))
                     .a(false, true, mo.a().a(mp.c, $$2))
               )
         );
   }

   private void v(dac $$0) {
      mw $$1 = new mw().a(mx.f, mw.a(dae.cD, "_top")).a(mx.i, mw.a(dae.cD, "_side")).a(mx.g, mw.a($$0, "_front"));
      mw $$2 = new mw().a(mx.i, mw.a(dae.cD, "_top")).a(mx.g, mw.a($$0, "_front_vertical"));
      ajh $$3 = mv.p.a($$0, $$1, this.c);
      ajh $$4 = mv.r.a($$0, $$2, this.c);
      this.b
         .accept(
            ml.a($$0)
               .a(
                  mm.a(dnr.P)
                     .a(ih.a, mo.a().a(mp.c, $$4).a(mp.a, mp.a.c))
                     .a(ih.b, mo.a().a(mp.c, $$4))
                     .a(ih.c, mo.a().a(mp.c, $$3))
                     .a(ih.f, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
                     .a(ih.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
                     .a(ih.e, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
               )
         );
   }

   private void D() {
      ajh $$0 = mt.a(dae.fy);
      ajh $$1 = mt.a(dae.fy, "_filled");
      this.b.accept(ml.a(dae.fy).a(mm.a(dnr.h).a(false, mo.a().a(mp.c, $$0)).a(true, mo.a().a(mp.c, $$1))).a(c()));
   }

   private void E() {
      ajh $$0 = mt.a(dae.ku, "_side");
      ajh $$1 = mt.a(dae.ku, "_noside");
      ajh $$2 = mt.a(dae.ku, "_noside1");
      ajh $$3 = mt.a(dae.ku, "_noside2");
      ajh $$4 = mt.a(dae.ku, "_noside3");
      this.b
         .accept(
            mk.a(dae.ku)
               .a(mj.a().a(dnr.L, true), mo.a().a(mp.c, $$0))
               .a(mj.a().a(dnr.M, true), mo.a().a(mp.c, $$0).a(mp.b, mp.a.b).a(mp.d, true))
               .a(mj.a().a(dnr.N, true), mo.a().a(mp.c, $$0).a(mp.b, mp.a.c).a(mp.d, true))
               .a(mj.a().a(dnr.O, true), mo.a().a(mp.c, $$0).a(mp.b, mp.a.d).a(mp.d, true))
               .a(mj.a().a(dnr.J, true), mo.a().a(mp.c, $$0).a(mp.a, mp.a.d).a(mp.d, true))
               .a(mj.a().a(dnr.K, true), mo.a().a(mp.c, $$0).a(mp.a, mp.a.b).a(mp.d, true))
               .a(mj.a().a(dnr.L, false), mo.a().a(mp.c, $$1).a(mp.e, 2), mo.a().a(mp.c, $$2), mo.a().a(mp.c, $$3), mo.a().a(mp.c, $$4))
               .a(
                  mj.a().a(dnr.M, false),
                  mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, true),
                  mo.a().a(mp.c, $$3).a(mp.b, mp.a.b).a(mp.d, true),
                  mo.a().a(mp.c, $$4).a(mp.b, mp.a.b).a(mp.d, true),
                  mo.a().a(mp.c, $$1).a(mp.e, 2).a(mp.b, mp.a.b).a(mp.d, true)
               )
               .a(
                  mj.a().a(dnr.N, false),
                  mo.a().a(mp.c, $$3).a(mp.b, mp.a.c).a(mp.d, true),
                  mo.a().a(mp.c, $$4).a(mp.b, mp.a.c).a(mp.d, true),
                  mo.a().a(mp.c, $$1).a(mp.e, 2).a(mp.b, mp.a.c).a(mp.d, true),
                  mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, true)
               )
               .a(
                  mj.a().a(dnr.O, false),
                  mo.a().a(mp.c, $$4).a(mp.b, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$1).a(mp.e, 2).a(mp.b, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$3).a(mp.b, mp.a.d).a(mp.d, true)
               )
               .a(
                  mj.a().a(dnr.J, false),
                  mo.a().a(mp.c, $$1).a(mp.e, 2).a(mp.a, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$4).a(mp.a, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$2).a(mp.a, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$3).a(mp.a, mp.a.d).a(mp.d, true)
               )
               .a(
                  mj.a().a(dnr.K, false),
                  mo.a().a(mp.c, $$4).a(mp.a, mp.a.b).a(mp.d, true),
                  mo.a().a(mp.c, $$3).a(mp.a, mp.a.b).a(mp.d, true),
                  mo.a().a(mp.c, $$2).a(mp.a, mp.a.b).a(mp.d, true),
                  mo.a().a(mp.c, $$1).a(mp.e, 2).a(mp.a, mp.a.b).a(mp.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            mk.a(dae.pc)
               .a(mo.a().a(mp.c, mw.G(dae.pc)))
               .a(mj.a().a(dnr.aL, 1), mo.a().a(mp.c, mw.a(dae.pc, "_contents1")))
               .a(mj.a().a(dnr.aL, 2), mo.a().a(mp.c, mw.a(dae.pc, "_contents2")))
               .a(mj.a().a(dnr.aL, 3), mo.a().a(mp.c, mw.a(dae.pc, "_contents3")))
               .a(mj.a().a(dnr.aL, 4), mo.a().a(mp.c, mw.a(dae.pc, "_contents4")))
               .a(mj.a().a(dnr.aL, 5), mo.a().a(mp.c, mw.a(dae.pc, "_contents5")))
               .a(mj.a().a(dnr.aL, 6), mo.a().a(mp.c, mw.a(dae.pc, "_contents6")))
               .a(mj.a().a(dnr.aL, 7), mo.a().a(mp.c, mw.a(dae.pc, "_contents7")))
               .a(mj.a().a(dnr.aL, 8), mo.a().a(mp.c, mw.a(dae.pc, "_contents_ready")))
         );
   }

   private void w(dac $$0) {
      ajh $$1 = mv.c.a($$0, mw.a($$0), this.c);
      ajh $$2 = this.a($$0, "_powered", mv.c, mw::b);
      ajh $$3 = this.a($$0, "_lit", mv.c, mw::b);
      ajh $$4 = this.a($$0, "_lit_powered", mv.c, mw::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private mi a(dac $$0, ajh $$1, ajh $$2, ajh $$3, ajh $$4) {
      return ml.a($$0).a(mm.a(dnr.r, dnr.w).a(($$4x, $$5) -> $$4x ? mo.a().a(mp.c, $$5 ? $$4 : $$2) : mo.a().a(mp.c, $$5 ? $$3 : $$1)));
   }

   private void i(dac $$0, dac $$1) {
      ajh $$2 = mt.a($$0);
      ajh $$3 = mt.a($$0, "_powered");
      ajh $$4 = mt.a($$0, "_lit");
      ajh $$5 = mt.a($$0, "_lit_powered");
      this.a($$1, mt.a($$0.l()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dac $$0) {
      this.c($$0);
      this.b.accept(ml.a($$0, mo.a().a(mp.c, mv.ao.a($$0, mw.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dae.qy);
      this.x(dae.qx);
      this.x(dae.qw);
      this.x(dae.qv);
   }

   private void H() {
      this.c(dae.st);
      mm.b<ih, dny> $$0 = mm.a(dnr.bm, dnr.bn);

      for (dny $$1 : dny.values()) {
         $$0.a(ih.b, $$1, this.a(ih.b, $$1));
      }

      for (dny $$2 : dny.values()) {
         $$0.a(ih.a, $$2, this.a(ih.a, $$2));
      }

      this.b.accept(ml.a(dae.st).a($$0));
   }

   private mo a(ih $$0, dny $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mw $$3 = mw.c(mw.a(dae.st, $$2));
      return mo.a().a(mp.c, mv.an.a(dae.st, $$2, $$3, this.c));
   }

   private void y(dac $$0) {
      mw $$1 = new mw().a(mx.e, mw.G(dae.dV)).a(mx.f, mw.G($$0)).a(mx.i, mw.a($$0, "_side"));
      this.b.accept(c($$0, mv.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ajh $$0 = mw.a(dae.gZ, "_side");
      mw $$1 = new mw().a(mx.f, mw.a(dae.gZ, "_top")).a(mx.i, $$0);
      mw $$2 = new mw().a(mx.f, mw.a(dae.gZ, "_inverted_top")).a(mx.i, $$0);
      this.b
         .accept(
            ml.a(dae.gZ)
               .a(mm.a(dnr.p).a(false, mo.a().a(mp.c, mv.aF.a(dae.gZ, $$1, this.c))).a(true, mo.a().a(mp.c, mv.aF.a(mt.a(dae.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dac $$0) {
      this.b.accept(ml.a($$0, mo.a().a(mp.c, mt.a($$0))).a(this.n()));
   }

   private void J() {
      dac $$0 = dae.ss;
      ajh $$1 = mt.a($$0, "_on");
      ajh $$2 = mt.a($$0);
      this.b.accept(ml.a($$0, mo.a().a(mp.c, mt.a($$0))).a(this.n()).a(a(dnr.w, $$1, $$2)));
   }

   private void K() {
      mw $$0 = new mw().a(mx.B, mw.G(dae.j)).a(mx.f, mw.G(dae.cC));
      mw $$1 = new mw().a(mx.B, mw.G(dae.j)).a(mx.f, mw.a(dae.cC, "_moist"));
      ajh $$2 = mv.aW.a(dae.cC, $$0, this.c);
      ajh $$3 = mv.aW.a(mw.a(dae.cC, "_moist"), $$1, this.c);
      this.b.accept(ml.a(dae.cC).a(a(dnr.aQ, 7, $$3, $$2)));
   }

   private List<ajh> A(dac $$0) {
      ajh $$1 = mv.aX.a(mt.a($$0, "_floor0"), mw.v($$0), this.c);
      ajh $$2 = mv.aX.a(mt.a($$0, "_floor1"), mw.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ajh> B(dac $$0) {
      ajh $$1 = mv.aY.a(mt.a($$0, "_side0"), mw.v($$0), this.c);
      ajh $$2 = mv.aY.a(mt.a($$0, "_side1"), mw.w($$0), this.c);
      ajh $$3 = mv.aZ.a(mt.a($$0, "_side_alt0"), mw.v($$0), this.c);
      ajh $$4 = mv.aZ.a(mt.a($$0, "_side_alt1"), mw.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ajh> C(dac $$0) {
      ajh $$1 = mv.ba.a(mt.a($$0, "_up0"), mw.v($$0), this.c);
      ajh $$2 = mv.ba.a(mt.a($$0, "_up1"), mw.w($$0), this.c);
      ajh $$3 = mv.bb.a(mt.a($$0, "_up_alt0"), mw.v($$0), this.c);
      ajh $$4 = mv.bb.a(mt.a($$0, "_up_alt1"), mw.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<mo> a(List<ajh> $$0, UnaryOperator<mo> $$1) {
      return $$0.stream().map($$0x -> mo.a().a(mp.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      mj $$0 = mj.a().a(dnr.L, false).a(dnr.M, false).a(dnr.N, false).a(dnr.O, false).a(dnr.J, false);
      List<ajh> $$1 = this.A(dae.cr);
      List<ajh> $$2 = this.B(dae.cr);
      List<ajh> $$3 = this.C(dae.cr);
      this.b
         .accept(
            mk.a(dae.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(mj.b(mj.a().a(dnr.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(mj.b(mj.a().a(dnr.M, true), $$0), a($$2, $$0x -> $$0x.a(mp.b, mp.a.b)))
               .a(mj.b(mj.a().a(dnr.N, true), $$0), a($$2, $$0x -> $$0x.a(mp.b, mp.a.c)))
               .a(mj.b(mj.a().a(dnr.O, true), $$0), a($$2, $$0x -> $$0x.a(mp.b, mp.a.d)))
               .a(mj.a().a(dnr.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ajh> $$0 = this.A(dae.cs);
      List<ajh> $$1 = this.B(dae.cs);
      this.b
         .accept(
            mk.a(dae.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mp.b, mp.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mp.b, mp.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mp.b, mp.a.d)))
         );
   }

   private void D(dac $$0) {
      ajh $$1 = my.t.create($$0, this.c);
      ajh $$2 = my.u.create($$0, this.c);
      this.a($$0.l());
      this.b.accept(ml.a($$0).a(a(dnr.j, $$2, $$1)));
   }

   private void N() {
      mw $$0 = mw.a(mw.a(dae.ad, "_side"), mw.a(dae.ad, "_top"));
      ajh $$1 = mv.j.a(dae.ad, $$0, this.c);
      this.b.accept(d(dae.ad, $$1));
   }

   private void O() {
      this.a(cqp.ad);
      dac $$0 = dae.E;
      mm.b<Boolean, Integer> $$1 = mm.a(dew.d, dew.b);
      ajh $$2 = mt.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ajh $$4 = mt.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, mo.a().a(mp.c, $$4));
         $$1.a(false, $$3, mo.a().a(mp.c, $$2));
      }

      this.b.accept(ml.a(dae.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            ml.a(dae.kI)
               .a(
                  mm.a(dnr.as)
                     .a(0, mo.a().a(mp.c, this.a(dae.kI, "_0", mv.c, mw::b)))
                     .a(1, mo.a().a(mp.c, this.a(dae.kI, "_1", mv.c, mw::b)))
                     .a(2, mo.a().a(mp.c, this.a(dae.kI, "_2", mv.c, mw::b)))
                     .a(3, mo.a().a(mp.c, this.a(dae.kI, "_3", mv.c, mw::b)))
               )
         );
   }

   private void Q() {
      ajh $$0 = mw.G(dae.j);
      mw $$1 = new mw().a(mx.e, $$0).b(mx.e, mx.c).a(mx.f, mw.a(dae.i, "_top")).a(mx.i, mw.a(dae.i, "_snow"));
      mo $$2 = mo.a().a(mp.c, mv.n.a(dae.i, "_snow", $$1, this.c));
      this.a(dae.i, mt.a(dae.i), $$2);
      ajh $$3 = my.f.get(dae.fl).a($$1x -> $$1x.a(mx.e, $$0)).a(dae.fl, this.c);
      this.a(dae.fl, $$3, $$2);
      ajh $$4 = my.f.get(dae.l).a($$1x -> $$1x.a(mx.e, $$0)).a(dae.l, this.c);
      this.a(dae.l, $$4, $$2);
   }

   private void a(dac $$0, ajh $$1, mo $$2) {
      List<mo> $$3 = Arrays.asList(a($$1));
      this.b.accept(ml.a($$0).a(mm.a(dnr.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cqp.rg);
      this.b
         .accept(
            ml.a(dae.fC)
               .a(
                  mm.a(dnr.ar)
                     .a(0, mo.a().a(mp.c, mt.a(dae.fC, "_stage0")))
                     .a(1, mo.a().a(mp.c, mt.a(dae.fC, "_stage1")))
                     .a(2, mo.a().a(mp.c, mt.a(dae.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dae.kE, mt.a(dae.kE)));
   }

   private void j(dac $$0, dac $$1) {
      mw $$2 = mw.b($$1);
      ajh $$3 = mv.Y.a($$0, $$2, this.c);
      ajh $$4 = mv.Z.a($$0, $$2, this.c);
      this.b.accept(ml.a($$0).a(a(dnr.aT, 1, $$4, $$3)));
   }

   private void T() {
      ajh $$0 = mt.a(dae.hc);
      ajh $$1 = mt.a(dae.hc, "_side");
      this.a(cqp.lQ);
      this.b
         .accept(
            ml.a(dae.hc)
               .a(
                  mm.a(dnr.Q)
                     .a(ih.a, mo.a().a(mp.c, $$0))
                     .a(ih.c, mo.a().a(mp.c, $$1))
                     .a(ih.f, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b))
                     .a(ih.d, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c))
                     .a(ih.e, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d))
               )
         );
   }

   private void k(dac $$0, dac $$1) {
      ajh $$2 = mt.a($$0);
      this.b.accept(ml.a($$1, mo.a().a(mp.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ajh $$0 = mt.a(dae.eW, "_post_ends");
      ajh $$1 = mt.a(dae.eW, "_post");
      ajh $$2 = mt.a(dae.eW, "_cap");
      ajh $$3 = mt.a(dae.eW, "_cap_alt");
      ajh $$4 = mt.a(dae.eW, "_side");
      ajh $$5 = mt.a(dae.eW, "_side_alt");
      this.b
         .accept(
            mk.a(dae.eW)
               .a(mo.a().a(mp.c, $$0))
               .a(mj.a().a(dnr.L, false).a(dnr.M, false).a(dnr.N, false).a(dnr.O, false), mo.a().a(mp.c, $$1))
               .a(mj.a().a(dnr.L, true).a(dnr.M, false).a(dnr.N, false).a(dnr.O, false), mo.a().a(mp.c, $$2))
               .a(mj.a().a(dnr.L, false).a(dnr.M, true).a(dnr.N, false).a(dnr.O, false), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.L, false).a(dnr.M, false).a(dnr.N, true).a(dnr.O, false), mo.a().a(mp.c, $$3))
               .a(mj.a().a(dnr.L, false).a(dnr.M, false).a(dnr.N, false).a(dnr.O, true), mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.L, true), mo.a().a(mp.c, $$4))
               .a(mj.a().a(dnr.M, true), mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
               .a(mj.a().a(dnr.N, true), mo.a().a(mp.c, $$5))
               .a(mj.a().a(dnr.O, true), mo.a().a(mp.c, $$5).a(mp.b, mp.a.b))
         );
      this.d(dae.eW);
   }

   private void E(dac $$0) {
      this.b.accept(ml.a($$0, mo.a().a(mp.c, mt.a($$0))).a(b()));
   }

   private void V() {
      ajh $$0 = mt.a(dae.dw);
      ajh $$1 = mt.a(dae.dw, "_on");
      this.d(dae.dw);
      this.b
         .accept(
            ml.a(dae.dw)
               .a(a(dnr.w, $$0, $$1))
               .a(
                  mm.a(dnr.U, dnr.R)
                     .a(dnm.c, ih.c, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.c))
                     .a(dnm.c, ih.f, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.d))
                     .a(dnm.c, ih.d, mo.a().a(mp.a, mp.a.c))
                     .a(dnm.c, ih.e, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.b))
                     .a(dnm.a, ih.c, mo.a())
                     .a(dnm.a, ih.f, mo.a().a(mp.b, mp.a.b))
                     .a(dnm.a, ih.d, mo.a().a(mp.b, mp.a.c))
                     .a(dnm.a, ih.e, mo.a().a(mp.b, mp.a.d))
                     .a(dnm.b, ih.c, mo.a().a(mp.a, mp.a.b))
                     .a(dnm.b, ih.f, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.b))
                     .a(dnm.b, ih.d, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.c))
                     .a(dnm.b, ih.e, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.d))
               )
         );
   }

   private void W() {
      this.d(dae.fm);
      this.b.accept(b(dae.fm, mt.a(dae.fm)));
   }

   private void X() {
      this.d(dae.tn);
      this.b.accept(c(dae.tn, mt.a(dae.tn)));
   }

   private void Y() {
      this.b.accept(ml.a(dae.ed).a(mm.a(dnr.H).a(ih.a.a, mo.a().a(mp.c, mt.a(dae.ed, "_ns"))).a(ih.a.c, mo.a().a(mp.c, mt.a(dae.ed, "_ew")))));
   }

   private void Z() {
      ajh $$0 = my.a.create(dae.dV, this.c);
      this.b
         .accept(
            ml.a(
               dae.dV,
               mo.a().a(mp.c, $$0),
               mo.a().a(mp.c, $$0).a(mp.a, mp.a.b),
               mo.a().a(mp.c, $$0).a(mp.a, mp.a.c),
               mo.a().a(mp.c, $$0).a(mp.a, mp.a.d),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.b),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.b).a(mp.a, mp.a.b),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.b).a(mp.a, mp.a.c),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.b).a(mp.a, mp.a.d),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.c),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.c).a(mp.a, mp.a.b),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.c).a(mp.a, mp.a.c),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.c).a(mp.a, mp.a.d),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.d),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.d).a(mp.a, mp.a.b),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.d).a(mp.a, mp.a.c),
               mo.a().a(mp.c, $$0).a(mp.b, mp.a.d).a(mp.a, mp.a.d)
            )
         );
   }

   private void aa() {
      ajh $$0 = mt.a(dae.kO);
      ajh $$1 = mt.a(dae.kO, "_on");
      this.b.accept(ml.a(dae.kO).a(a(dnr.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mw $$0 = new mw().a(mx.e, mw.a(dae.by, "_bottom")).a(mx.i, mw.a(dae.by, "_side"));
      ajh $$1 = mw.a(dae.by, "_top_sticky");
      ajh $$2 = mw.a(dae.by, "_top");
      mw $$3 = $$0.c(mx.E, $$1);
      mw $$4 = $$0.c(mx.E, $$2);
      ajh $$5 = mt.a(dae.by, "_base");
      this.a(dae.by, $$5, $$4);
      this.a(dae.br, $$5, $$3);
      ajh $$6 = mv.n.a(dae.by, "_inventory", $$0.c(mx.f, $$2), this.c);
      ajh $$7 = mv.n.a(dae.br, "_inventory", $$0.c(mx.f, $$1), this.c);
      this.a(dae.by, $$6);
      this.a(dae.br, $$7);
   }

   private void a(dac $$0, ajh $$1, mw $$2) {
      ajh $$3 = mv.bh.a($$0, $$2, this.c);
      this.b.accept(ml.a($$0).a(a(dnr.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mw $$0 = new mw().a(mx.F, mw.a(dae.by, "_top")).a(mx.i, mw.a(dae.by, "_side"));
      mw $$1 = $$0.c(mx.E, mw.a(dae.by, "_top_sticky"));
      mw $$2 = $$0.c(mx.E, mw.a(dae.by, "_top"));
      this.b
         .accept(
            ml.a(dae.bz)
               .a(
                  mm.a(dnr.x, dnr.bg)
                     .a(false, dod.a, mo.a().a(mp.c, mv.bi.a(dae.by, "_head", $$2, this.c)))
                     .a(false, dod.b, mo.a().a(mp.c, mv.bi.a(dae.by, "_head_sticky", $$1, this.c)))
                     .a(true, dod.a, mo.a().a(mp.c, mv.bj.a(dae.by, "_head_short", $$2, this.c)))
                     .a(true, dod.b, mo.a().a(mp.c, mv.bj.a(dae.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dac $$0 = dae.tr;
      mw $$1 = mw.a($$0, "_side_inactive", "_top_inactive");
      mw $$2 = mw.a($$0, "_side_active", "_top_active");
      mw $$3 = mw.a($$0, "_side_active", "_top_ejecting_reward");
      ajh $$4 = mv.o.a($$0, $$1, this.c);
      ajh $$5 = mv.o.a($$0, "_active", $$2, this.c);
      ajh $$6 = mv.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(ml.a($$0).a(mm.a(dnr.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> mo.a().a(mp.c, $$4);
            case b, c, d -> mo.a().a(mp.c, $$5);
            case e -> mo.a().a(mp.c, $$6);
         };
      })));
   }

   private void ae() {
      dac $$0 = dae.ts;
      mw $$1 = mw.a($$0, "_front_off", "_side_off", "_top_off", "_bottom");
      mw $$2 = mw.a($$0, "_front_on", "_side_on", "_top_on", "_bottom");
      mw $$3 = mw.a($$0, "_front_ejecting", "_side_on", "_top_on", "_bottom");
      mw $$4 = mw.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ajh $$5 = mv.bN.a($$0, $$1, this.c);
      ajh $$6 = mv.bN.a($$0, "_active", $$2, this.c);
      ajh $$7 = mv.bN.a($$0, "_unlocking", $$3, this.c);
      ajh $$8 = mv.bN.a($$0, "_ejecting_reward", $$4, this.c);
      this.a($$0, $$5);
      this.b.accept(ml.a($$0).a(b()).a(mm.a(diw.b).a($$4x -> {
         return switch ($$4x) {
            case a -> mo.a().a(mp.c, $$5);
            case b -> mo.a().a(mp.c, $$6);
            case c -> mo.a().a(mp.c, $$7);
            case d -> mo.a().a(mp.c, $$8);
         };
      })));
   }

   private void af() {
      ajh $$0 = mt.a(dae.qQ, "_inactive");
      ajh $$1 = mt.a(dae.qQ, "_active");
      this.a(dae.qQ, $$0);
      this.b.accept(ml.a(dae.qQ).a(mm.a(dnr.bo).a($$2 -> mo.a().a(mp.c, $$2 != doi.b && $$2 != doi.c ? $$0 : $$1))));
   }

   private void ag() {
      ajh $$0 = mt.a(dae.qR, "_inactive");
      ajh $$1 = mt.a(dae.qR, "_active");
      this.a(dae.qR, $$0);
      this.b.accept(ml.a(dae.qR).a(mm.a(dnr.bo).a($$2 -> mo.a().a(mp.c, $$2 != doi.b && $$2 != doi.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      ajh $$0 = mv.bM.a(dae.qV, mw.a(false), this.c);
      ajh $$1 = mv.bM.a(dae.qV, "_can_summon", mw.a(true), this.c);
      this.a(dae.qV, $$0);
      this.b.accept(ml.a(dae.qV).a(a(dnr.G, $$1, $$0)));
   }

   private void ai() {
      ajh $$0 = mt.a(dae.nS, "_stable");
      ajh $$1 = mt.a(dae.nS, "_unstable");
      this.a(dae.nS, $$0);
      this.b.accept(ml.a(dae.nS).a(a(dnr.b, $$1, $$0)));
   }

   private void aj() {
      ajh $$0 = this.a(dae.sv, "", mv.ao, mw::c);
      ajh $$1 = this.a(dae.sv, "_lit", mv.ao, mw::c);
      this.b.accept(ml.a(dae.sv).a(a(dnr.D, $$1, $$0)));
      ajh $$2 = this.a(dae.sw, "", mv.ao, mw::c);
      ajh $$3 = this.a(dae.sw, "_lit", mv.ao, mw::c);
      this.b.accept(ml.a(dae.sw).a(a(dnr.D, $$3, $$2)));
   }

   private void ak() {
      ajh $$0 = my.a.create(dae.fB, this.c);
      ajh $$1 = this.a(dae.fB, "_on", mv.c, mw::b);
      this.b.accept(ml.a(dae.fB).a(a(dnr.r, $$1, $$0)));
   }

   private void l(dac $$0, dac $$1) {
      mw $$2 = mw.y($$0);
      this.b.accept(c($$0, mv.bf.a($$0, $$2, this.c)));
      this.b.accept(ml.a($$1, mo.a().a(mp.c, mv.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      mw $$0 = mw.y(dae.dK);
      mw $$1 = mw.i(mw.a(dae.dK, "_off"));
      ajh $$2 = mv.bf.a(dae.dK, $$0, this.c);
      ajh $$3 = mv.bf.a(dae.dK, "_off", $$1, this.c);
      this.b.accept(ml.a(dae.dK).a(a(dnr.r, $$2, $$3)));
      ajh $$4 = mv.bg.a(dae.dL, $$0, this.c);
      ajh $$5 = mv.bg.a(dae.dL, "_off", $$1, this.c);
      this.b.accept(ml.a(dae.dL).a(a(dnr.r, $$4, $$5)).a(d()));
      this.d(dae.dK);
      this.c(dae.dL);
   }

   private void am() {
      this.a(cqp.lJ);
      this.b.accept(ml.a(dae.eh).a(mm.a(dnr.aA, dnr.s, dnr.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return mo.a().a(mp.c, mw.a(dae.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cqp.cS);
      this.b
         .accept(
            ml.a(dae.mV)
               .a(
                  mm.a(dnr.aS, dnr.C)
                     .a(1, false, Arrays.asList(a(mt.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(mt.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(mt.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(mt.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(mt.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(mt.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(mt.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(mt.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      mw $$0 = mw.a(dae.dN);
      ajh $$1 = mv.c.a(dae.dP, $$0, this.c);
      this.b.accept(ml.a(dae.dN).a(mm.a(dnr.aF).a($$1x -> mo.a().a(mp.c, $$1x < 8 ? mt.a(dae.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dae.dN, mt.a(dae.dN, "_height2"));
      this.b.accept(c(dae.dP, $$1));
   }

   private void ap() {
      this.b.accept(ml.a(dae.oc, mo.a().a(mp.c, mt.a(dae.oc))).a(b()));
   }

   private void aq() {
      ajh $$0 = my.a.create(dae.pa, this.c);
      this.a(dae.pa, $$0);
      this.b.accept(ml.a(dae.pa).a(mm.a(dnr.bj).a($$0x -> mo.a().a(mp.c, this.a(dae.pa, "_" + $$0x.c(), mv.c, mw::b)))));
   }

   private void ar() {
      this.a(cqp.wn);
      this.b.accept(ml.a(dae.oi).a(mm.a(dnr.as).a($$0 -> mo.a().a(mp.c, this.a(dae.oi, "_stage" + $$0, mv.ao, mw::c)))));
   }

   private void as() {
      this.a(cqp.pr);
      this.b
         .accept(
            ml.a(dae.fI)
               .a(
                  mm.a(dnr.a, dnr.M, dnr.L, dnr.N, dnr.O)
                     .a(false, false, false, false, false, mo.a().a(mp.c, mt.a(dae.fI, "_ns")))
                     .a(false, true, false, false, false, mo.a().a(mp.c, mt.a(dae.fI, "_n")).a(mp.b, mp.a.b))
                     .a(false, false, true, false, false, mo.a().a(mp.c, mt.a(dae.fI, "_n")))
                     .a(false, false, false, true, false, mo.a().a(mp.c, mt.a(dae.fI, "_n")).a(mp.b, mp.a.c))
                     .a(false, false, false, false, true, mo.a().a(mp.c, mt.a(dae.fI, "_n")).a(mp.b, mp.a.d))
                     .a(false, true, true, false, false, mo.a().a(mp.c, mt.a(dae.fI, "_ne")))
                     .a(false, true, false, true, false, mo.a().a(mp.c, mt.a(dae.fI, "_ne")).a(mp.b, mp.a.b))
                     .a(false, false, false, true, true, mo.a().a(mp.c, mt.a(dae.fI, "_ne")).a(mp.b, mp.a.c))
                     .a(false, false, true, false, true, mo.a().a(mp.c, mt.a(dae.fI, "_ne")).a(mp.b, mp.a.d))
                     .a(false, false, true, true, false, mo.a().a(mp.c, mt.a(dae.fI, "_ns")))
                     .a(false, true, false, false, true, mo.a().a(mp.c, mt.a(dae.fI, "_ns")).a(mp.b, mp.a.b))
                     .a(false, true, true, true, false, mo.a().a(mp.c, mt.a(dae.fI, "_nse")))
                     .a(false, true, false, true, true, mo.a().a(mp.c, mt.a(dae.fI, "_nse")).a(mp.b, mp.a.b))
                     .a(false, false, true, true, true, mo.a().a(mp.c, mt.a(dae.fI, "_nse")).a(mp.b, mp.a.c))
                     .a(false, true, true, false, true, mo.a().a(mp.c, mt.a(dae.fI, "_nse")).a(mp.b, mp.a.d))
                     .a(false, true, true, true, true, mo.a().a(mp.c, mt.a(dae.fI, "_nsew")))
                     .a(true, false, false, false, false, mo.a().a(mp.c, mt.a(dae.fI, "_attached_ns")))
                     .a(true, false, true, false, false, mo.a().a(mp.c, mt.a(dae.fI, "_attached_n")))
                     .a(true, false, false, true, false, mo.a().a(mp.c, mt.a(dae.fI, "_attached_n")).a(mp.b, mp.a.c))
                     .a(true, true, false, false, false, mo.a().a(mp.c, mt.a(dae.fI, "_attached_n")).a(mp.b, mp.a.b))
                     .a(true, false, false, false, true, mo.a().a(mp.c, mt.a(dae.fI, "_attached_n")).a(mp.b, mp.a.d))
                     .a(true, true, true, false, false, mo.a().a(mp.c, mt.a(dae.fI, "_attached_ne")))
                     .a(true, true, false, true, false, mo.a().a(mp.c, mt.a(dae.fI, "_attached_ne")).a(mp.b, mp.a.b))
                     .a(true, false, false, true, true, mo.a().a(mp.c, mt.a(dae.fI, "_attached_ne")).a(mp.b, mp.a.c))
                     .a(true, false, true, false, true, mo.a().a(mp.c, mt.a(dae.fI, "_attached_ne")).a(mp.b, mp.a.d))
                     .a(true, false, true, true, false, mo.a().a(mp.c, mt.a(dae.fI, "_attached_ns")))
                     .a(true, true, false, false, true, mo.a().a(mp.c, mt.a(dae.fI, "_attached_ns")).a(mp.b, mp.a.b))
                     .a(true, true, true, true, false, mo.a().a(mp.c, mt.a(dae.fI, "_attached_nse")))
                     .a(true, true, false, true, true, mo.a().a(mp.c, mt.a(dae.fI, "_attached_nse")).a(mp.b, mp.a.b))
                     .a(true, false, true, true, true, mo.a().a(mp.c, mt.a(dae.fI, "_attached_nse")).a(mp.b, mp.a.c))
                     .a(true, true, true, false, true, mo.a().a(mp.c, mt.a(dae.fI, "_attached_nse")).a(mp.b, mp.a.d))
                     .a(true, true, true, true, true, mo.a().a(mp.c, mt.a(dae.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dae.fH);
      this.b.accept(ml.a(dae.fH).a(mm.a(dnr.a, dnr.w).a(($$0, $$1) -> mo.a().a(mp.c, mw.a(dae.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ajh a(int $$0, String $$1, mw $$2) {
      switch ($$0) {
         case 1:
            return mv.bl.a(mt.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return mv.bm.a(mt.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return mv.bn.a(mt.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return mv.bo.a(mt.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ajh a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mw.b(mw.G(dae.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mw.b(mw.a(dae.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mw.b(mw.a(dae.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cqp.ko);
      this.b.accept(ml.a(dae.mf).a(mm.a(dnr.aD, dnr.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cqp.kp);
      Function<Integer, ajh> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mw $$2 = mw.a($$1);
         return mv.bw.a(dae.mg, $$1, $$2, this.c);
      };
      this.b.accept(ml.a(dae.mg).a(mm.a(dhj.c).a($$1 -> mo.a().a(mp.c, $$0.apply($$1)))));
   }

   private void F(dac $$0) {
      this.d($$0);
      ajh $$1 = mt.a($$0);
      mk $$2 = mk.a($$0);
      mj.c $$3 = ac.a(mj.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dns, Function<ajh, mo>> $$4 : a) {
         dns $$5 = (dns)$$4.getFirst();
         Function<ajh, mo> $$6 = (Function<ajh, mo>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(mj.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      ajh $$0 = mw.a(dae.qU, "_bottom");
      mw $$1 = new mw().a(mx.e, $$0).a(mx.f, mw.a(dae.qU, "_top")).a(mx.i, mw.a(dae.qU, "_side"));
      mw $$2 = new mw().a(mx.e, $$0).a(mx.f, mw.a(dae.qU, "_top_bloom")).a(mx.i, mw.a(dae.qU, "_side_bloom"));
      ajh $$3 = mv.n.a(dae.qU, "", $$1, this.c);
      ajh $$4 = mv.n.a(dae.qU, "_bloom", $$2, this.c);
      this.b.accept(ml.a(dae.qU).a(mm.a(dnr.E).a($$2x -> mo.a().a(mp.c, $$2x ? $$4 : $$3))));
      this.a(cqp.gi, $$3);
   }

   private void ax() {
      dac $$0 = dae.cm;
      ajh $$1 = mt.a($$0);
      mk $$2 = mk.a($$0);
      Map.of(ih.c, mp.a.a, ih.f, mp.a.b, ih.d, mp.a.c, ih.e, mp.a.d).forEach(($$2x, $$3) -> {
         mj.c $$4 = mj.a().a(dnr.R, $$2x);
         $$2.a($$4, mo.a().a(mp.c, $$1).a(mp.b, $$3).a(mp.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mt.a($$0, "_inventory"));
      i.clear();
   }

   private void a(mk $$0, mj.c $$1, mp.a $$2) {
      List.of(Pair.of(dnr.bp, mv.aM), Pair.of(dnr.bq, mv.aN), Pair.of(dnr.br, mv.aO), Pair.of(dnr.bs, mv.aP), Pair.of(dnr.bt, mv.aQ), Pair.of(dnr.bu, mv.aR))
         .forEach($$3 -> {
            dns $$4 = (dns)$$3.getFirst();
            mu $$5 = (mu)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(mk $$0, mj.c $$1, mp.a $$2, dns $$3, mu $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mw $$7 = new mw().a(mx.b, mw.a(dae.cm, $$6));
      mf.d $$8 = new mf.d($$4, $$6);
      ajh $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dae.cm, $$6, $$7, this.c));
      $$0.a(mj.a($$1, mj.a().a($$3, $$5)), mo.a().a(mp.c, $$9).a(mp.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dae.kJ, mv.c.a(dae.kJ, mw.b(mt.a("magma")), this.c)));
   }

   private void G(dac $$0) {
      this.b($$0, my.q);
      mv.bD.a(mt.a($$0.l()), mw.u($$0), this.c);
   }

   private void b(dac $$0, dac $$1, mf.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dac $$0, dac $$1) {
      mv.bE.a(mt.a($$0.l()), mw.u($$1), this.c);
   }

   private void az() {
      ajh $$0 = mt.a(dae.b);
      ajh $$1 = mt.a(dae.b, "_mirrored");
      this.b.accept(a(dae.eN, $$0, $$1));
      this.a(dae.eN, $$0);
   }

   private void aA() {
      ajh $$0 = mt.a(dae.sJ);
      ajh $$1 = mt.a(dae.sJ, "_mirrored");
      this.b.accept(a(dae.td, $$0, $$1).a(f()));
      this.a(dae.td, $$0);
   }

   private void n(dac $$0, dac $$1) {
      this.a($$0, mf.e.b);
      mw $$2 = mw.d(mw.a($$0, "_pot"));
      ajh $$3 = mf.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      ajh $$0 = mw.a(dae.pl, "_bottom");
      ajh $$1 = mw.a(dae.pl, "_top_off");
      ajh $$2 = mw.a(dae.pl, "_top");
      ajh[] $$3 = new ajh[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mw $$5 = new mw().a(mx.e, $$0).a(mx.f, $$4 == 0 ? $$1 : $$2).a(mx.i, mw.a(dae.pl, "_side" + $$4));
         $$3[$$4] = mv.n.a(dae.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(ml.a(dae.pl).a(mm.a(dnr.aZ).a($$1x -> mo.a().a(mp.c, $$3[$$1x]))));
      this.a(cqp.wL, $$3[0]);
   }

   private mo a(ij $$0, mo $$1) {
      switch ($$0) {
         case b:
            return $$1.a(mp.a, mp.a.b);
         case c:
            return $$1.a(mp.a, mp.a.b).a(mp.b, mp.a.c);
         case d:
            return $$1.a(mp.a, mp.a.b).a(mp.b, mp.a.d);
         case a:
            return $$1.a(mp.a, mp.a.b).a(mp.b, mp.a.b);
         case f:
            return $$1.a(mp.a, mp.a.d).a(mp.b, mp.a.c);
         case g:
            return $$1.a(mp.a, mp.a.d);
         case h:
            return $$1.a(mp.a, mp.a.d).a(mp.b, mp.a.b);
         case e:
            return $$1.a(mp.a, mp.a.d).a(mp.b, mp.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(mp.b, mp.a.c);
         case i:
            return $$1.a(mp.b, mp.a.d);
         case j:
            return $$1.a(mp.b, mp.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      ajh $$0 = mw.a(dae.pb, "_top");
      ajh $$1 = mw.a(dae.pb, "_bottom");
      ajh $$2 = mw.a(dae.pb, "_side");
      ajh $$3 = mw.a(dae.pb, "_lock");
      mw $$4 = new mw().a(mx.o, $$2).a(mx.m, $$2).a(mx.l, $$2).a(mx.c, $$0).a(mx.j, $$0).a(mx.k, $$1).a(mx.n, $$3);
      ajh $$5 = mv.b.a(dae.pb, $$4, this.c);
      this.b.accept(ml.a(dae.pb, mo.a().a(mp.c, $$5)).a(mm.a(dnr.T).a($$0x -> this.a($$0x, mo.a()))));
   }

   private void aD() {
      dac $$0 = dae.n;
      ajh $$1 = mt.a($$0);
      my $$2 = my.a.get($$0);
      dac $$3 = dae.jH;
      ajh $$4 = mv.ab.a($$3, $$2.b(), this.c);
      ajh $$5 = mv.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kl.a().filter(km::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dae.rf).a(kl.w).a(dae.rf, dae.rD).a(dae.rj, dae.rn).a(kl.y);
      this.h(dae.re).a(kl.A).a(dae.re, dae.rC).a(dae.ri, dae.rm).a(kl.C);
      this.h(dae.rd).a(kl.E).a(dae.rd, dae.rB).a(dae.rh, dae.rl).a(kl.G);
      this.h(dae.rc).a(kl.I).a(dae.rc, dae.rA).a(dae.rg, dae.rk).a(kl.K);
      this.w(dae.sk);
      this.w(dae.sl);
      this.w(dae.sm);
      this.w(dae.sn);
      this.i(dae.sk, dae.so);
      this.i(dae.sl, dae.sp);
      this.i(dae.sm, dae.sq);
      this.i(dae.sn, dae.sr);
      this.m(dae.a);
      this.c(dae.nc, dae.a);
      this.c(dae.nb, dae.a);
      this.m(dae.fO);
      this.m(dae.dQ);
      this.c(dae.nd, dae.G);
      this.m(dae.fA);
      this.m(dae.me);
      this.m(dae.fr);
      this.m(dae.fR);
      this.a(cqp.uc);
      this.m(dae.pg);
      this.m(dae.G);
      this.m(dae.H);
      this.m(dae.hV);
      this.a(cqp.fR);
      this.o(dae.pM, dae.qd);
      this.o(dae.pN, dae.qe);
      this.o(dae.pO, dae.qf);
      this.o(dae.pP, dae.qg);
      this.o(dae.pQ, dae.qh);
      this.o(dae.pR, dae.qi);
      this.o(dae.pS, dae.qj);
      this.o(dae.pT, dae.qk);
      this.o(dae.pU, dae.ql);
      this.o(dae.pV, dae.qm);
      this.o(dae.pW, dae.qn);
      this.o(dae.pX, dae.qo);
      this.o(dae.pY, dae.qp);
      this.o(dae.pZ, dae.qq);
      this.o(dae.qa, dae.qr);
      this.o(dae.qb, dae.qs);
      this.o(dae.pL, dae.qc);
      this.m(dae.na);
      this.m(dae.gs);
      this.m(dae.qP);
      this.m(dae.sx);
      this.s(dae.sy);
      this.s(dae.sz);
      this.t(dae.ti);
      this.t(dae.tj);
      this.aj();
      this.g(dae.sC, dae.sA);
      this.p(dae.sB);
      this.a(dae.hW, cqp.hA);
      this.a(cqp.hA);
      this.aE();
      this.a(dae.kN, cqp.ja);
      this.a(cqp.ja);
      this.f(dae.bQ, mw.a(dae.by, "_side"));
      this.a(dae.R);
      this.a(dae.S);
      this.a(dae.iB);
      this.a(dae.cx);
      this.a(dae.cy);
      this.a(dae.cz);
      this.a(dae.fE);
      this.a(dae.fF);
      this.a(dae.fJ);
      this.a(dae.N);
      this.a(dae.T);
      this.a(dae.O);
      this.a(dae.ch);
      this.a(dae.P);
      this.a(dae.Q);
      this.a(dae.ci);
      this.b(dae.pj, my.d);
      this.a(dae.pi);
      this.a(dae.aR);
      this.a(dae.aS);
      this.a(dae.aT);
      this.a(dae.hb);
      this.a(dae.dI);
      this.a(dae.dJ);
      this.a(dae.ha);
      this.a(dae.pC);
      this.a(dae.mW);
      this.a(dae.dR);
      this.a(dae.k);
      this.a(dae.pk);
      this.a(dae.fz);
      this.a(dae.ec);
      this.a(dae.L);
      this.a(dae.ph);
      this.a(dae.dO);
      this.b(dae.dT, my.g);
      this.b(dae.pq, my.d);
      this.b(dae.fa, my.d);
      this.m(dae.ac);
      this.m(dae.ga);
      this.a(dae.kK);
      this.a(dae.aY);
      this.a(dae.iC);
      this.a(dae.co);
      this.a(dae.pK);
      this.a(dae.ii);
      this.a(dae.oy);
      this.a(dae.dW);
      this.a(dae.dX);
      this.b(dae.ct, my.b);
      this.a(dae.aO);
      this.b(dae.bw, my.v);
      this.a(cqp.cR);
      this.b(dae.ck, my.f);
      this.b(dae.pd, my.d);
      this.a(dae.op);
      this.a(dae.aP);
      this.a(dae.qt);
      this.a(dae.qu);
      this.a(dae.qN);
      this.a(dae.su);
      this.a(dae.tf);
      this.a(dae.tg);
      this.a(dae.th);
      this.e(dae.qS);
      this.aD();
      this.a(dae.ra);
      this.a(dae.rb);
      this.a(dae.qW);
      this.a(dae.qX);
      this.a(dae.qY);
      this.a(dae.qZ);
      this.k(dae.qW, dae.rw);
      this.k(dae.qX, dae.ry);
      this.k(dae.qY, dae.rx);
      this.k(dae.qZ, dae.rz);
      this.i(dae.rM);
      this.i(dae.rN);
      this.i(dae.rP);
      this.i(dae.rO);
      this.a(dae.rM, dae.rQ);
      this.a(dae.rN, dae.rR);
      this.a(dae.rP, dae.rT);
      this.a(dae.rO, dae.rS);
      this.k(dae.rU);
      this.k(dae.rV);
      this.k(dae.rX);
      this.k(dae.rW);
      this.b(dae.rU, dae.rY);
      this.b(dae.rV, dae.rZ);
      this.b(dae.rX, dae.sb);
      this.b(dae.rW, dae.sa);
      this.a(dae.sc);
      this.a(dae.sd);
      this.a(dae.se);
      this.a(dae.sf);
      this.k(dae.sc, dae.sg);
      this.k(dae.sd, dae.sh);
      this.k(dae.se, dae.si);
      this.k(dae.sf, dae.sj);
      this.j(dae.gW, dae.ch);
      this.j(dae.gX, dae.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dae.og, dae.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dae.kt);
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
      this.F(dae.ff);
      this.F(dae.fg);
      this.F(dae.qT);
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
      this.E(dae.cO);
      this.d(dae.cO);
      this.E(dae.oa);
      this.g();
      this.E(dae.sE);
      this.l(dae.cp, dae.cq);
      this.l(dae.ea, dae.eb);
      this.a(dae.cA, dae.n, mw::c);
      this.a(dae.nY, dae.p, mw::d);
      this.y(dae.ow);
      this.y(dae.on);
      this.v(dae.aU);
      this.v(dae.hi);
      this.C();
      this.D(dae.oe);
      this.D(dae.of);
      this.e(dae.eX, mt.a(dae.eX));
      this.a(dae.dY, my.d);
      this.a(dae.dZ, my.d);
      this.a(dae.te);
      this.a(dae.kM, my.d);
      this.f(dae.j);
      this.f(dae.sH);
      this.f(dae.I);
      this.g(dae.J);
      this.g(dae.M);
      this.f(dae.K);
      this.e(dae.F);
      this.b(dae.to, my.f);
      this.a(dae.ij, my.d, my.e);
      this.a(dae.kx, my.w, my.x);
      this.a(dae.hf, my.w, my.x);
      this.a(dae.tk, my.d, my.e);
      this.a(dae.tl, my.d, my.e);
      this.a(dae.tm, my.d, my.e);
      this.c(dae.nT, my.i);
      this.z();
      this.a(dae.pe, mw::A);
      this.a(dae.pf, mw::C);
      this.a(dae.kD, dnr.as, 0, 1, 2, 3);
      this.a(dae.gt, dnr.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dae.fq, dnr.as, 0, 1, 1, 2);
      this.a(dae.gu, dnr.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dae.cB, dnr.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dae.kA, mf.e.b, dnr.aq, 0, 1);
      this.i();
      this.h();
      this.a(mt.a("decorated_pot"), dae.iA).b(dae.tp);
      this.a(mt.a("banner"), dae.n)
         .a(mv.bF, dae.iJ, dae.iK, dae.iL, dae.iM, dae.iN, dae.iO, dae.iP, dae.iQ, dae.iR, dae.iS, dae.iT, dae.iU, dae.iV, dae.iW, dae.iX, dae.iY)
         .b(dae.iZ, dae.ja, dae.jb, dae.jc, dae.jd, dae.je, dae.jf, dae.jg, dae.jh, dae.ji, dae.jj, dae.jk, dae.jl, dae.jm, dae.jn, dae.jo);
      this.a(mt.a("bed"), dae.n)
         .b(dae.aZ, dae.ba, dae.bb, dae.bc, dae.bd, dae.be, dae.bf, dae.bg, dae.bh, dae.bi, dae.bj, dae.bk, dae.bl, dae.bm, dae.bn, dae.bo);
      this.m(dae.aZ, dae.bA);
      this.m(dae.ba, dae.bB);
      this.m(dae.bb, dae.bC);
      this.m(dae.bc, dae.bD);
      this.m(dae.bd, dae.bE);
      this.m(dae.be, dae.bF);
      this.m(dae.bf, dae.bG);
      this.m(dae.bg, dae.bH);
      this.m(dae.bh, dae.bI);
      this.m(dae.bi, dae.bJ);
      this.m(dae.bj, dae.bK);
      this.m(dae.bk, dae.bL);
      this.m(dae.bl, dae.bM);
      this.m(dae.bm, dae.bN);
      this.m(dae.bn, dae.bO);
      this.m(dae.bo, dae.bP);
      this.a(mt.a("skull"), dae.dW)
         .a(mv.bG, dae.gM, dae.gK, dae.gI, dae.gE, dae.gG, dae.gQ)
         .a(dae.gO)
         .b(dae.gN, dae.gP, dae.gL, dae.gJ, dae.gF, dae.gH, dae.gR);
      this.G(dae.kP);
      this.G(dae.kQ);
      this.G(dae.kR);
      this.G(dae.kS);
      this.G(dae.kT);
      this.G(dae.kU);
      this.G(dae.kV);
      this.G(dae.kW);
      this.G(dae.kX);
      this.G(dae.kY);
      this.G(dae.kZ);
      this.G(dae.la);
      this.G(dae.lb);
      this.G(dae.lc);
      this.G(dae.ld);
      this.G(dae.le);
      this.G(dae.lf);
      this.b(dae.mX, my.q);
      this.c(dae.mX);
      this.a(mt.a("chest"), dae.n).b(dae.cv, dae.gV);
      this.a(mt.a("ender_chest"), dae.co).b(dae.fG);
      this.f(dae.fx, dae.co).a(dae.fx, dae.kF);
      this.a(dae.aM);
      this.a(dae.aN);
      this.a(dae.lw);
      this.a(dae.lx);
      this.a(dae.ly);
      this.a(dae.lz);
      this.a(dae.lA);
      this.a(dae.lB);
      this.a(dae.lC);
      this.a(dae.lD);
      this.a(dae.lE);
      this.a(dae.lF);
      this.a(dae.lG);
      this.a(dae.lH);
      this.a(dae.lI);
      this.a(dae.lJ);
      this.a(dae.lK);
      this.a(dae.lL);
      this.a(my.a, dae.lM, dae.lN, dae.lO, dae.lP, dae.lQ, dae.lR, dae.lS, dae.lT, dae.lU, dae.lV, dae.lW, dae.lX, dae.lY, dae.lZ, dae.ma, dae.mb);
      this.a(dae.iA);
      this.a(dae.hj);
      this.a(dae.hk);
      this.a(dae.hl);
      this.a(dae.hm);
      this.a(dae.hn);
      this.a(dae.ho);
      this.a(dae.hp);
      this.a(dae.hq);
      this.a(dae.hr);
      this.a(dae.hs);
      this.a(dae.ht);
      this.a(dae.hu);
      this.a(dae.hv);
      this.a(dae.hw);
      this.a(dae.hx);
      this.a(dae.hy);
      this.a(dae.qO);
      this.h(dae.aQ, dae.eY);
      this.h(dae.ei, dae.hz);
      this.h(dae.ej, dae.hA);
      this.h(dae.ek, dae.hB);
      this.h(dae.el, dae.hC);
      this.h(dae.em, dae.hD);
      this.h(dae.en, dae.hE);
      this.h(dae.eo, dae.hF);
      this.h(dae.ep, dae.hG);
      this.h(dae.eq, dae.hH);
      this.h(dae.er, dae.hI);
      this.h(dae.es, dae.hJ);
      this.h(dae.et, dae.hK);
      this.h(dae.eu, dae.hL);
      this.h(dae.ev, dae.hM);
      this.h(dae.ew, dae.hN);
      this.h(dae.ex, dae.hO);
      this.b(my.o, dae.lg, dae.lh, dae.li, dae.lj, dae.lk, dae.ll, dae.lm, dae.ln, dae.lo, dae.lp, dae.lq, dae.lr, dae.ls, dae.lt, dae.lu, dae.lv);
      this.g(dae.bA, dae.ik);
      this.g(dae.bB, dae.il);
      this.g(dae.bC, dae.im);
      this.g(dae.bD, dae.in);
      this.g(dae.bE, dae.io);
      this.g(dae.bF, dae.ip);
      this.g(dae.bG, dae.iq);
      this.g(dae.bH, dae.ir);
      this.g(dae.bI, dae.is);
      this.g(dae.bJ, dae.it);
      this.g(dae.bK, dae.iu);
      this.g(dae.bL, dae.iv);
      this.g(dae.bM, dae.iw);
      this.g(dae.bN, dae.ix);
      this.g(dae.bO, dae.iy);
      this.g(dae.bP, dae.iz);
      this.a(dae.sI);
      this.a(dae.eL);
      this.a(dae.bu, dae.gb, mf.e.a);
      this.a(dae.bR, dae.gc, mf.e.b);
      this.a(dae.bT, dae.gd, mf.e.b);
      this.a(dae.bU, dae.ge, mf.e.b);
      this.a(dae.bV, dae.gf, mf.e.b);
      this.a(dae.bW, dae.gg, mf.e.b);
      this.a(dae.bX, dae.gh, mf.e.b);
      this.a(dae.bY, dae.gi, mf.e.b);
      this.a(dae.bZ, dae.gj, mf.e.b);
      this.a(dae.ca, dae.gk, mf.e.b);
      this.a(dae.cb, dae.gl, mf.e.b);
      this.a(dae.cc, dae.gm, mf.e.b);
      this.a(dae.ce, dae.gn, mf.e.b);
      this.a(dae.cd, dae.go, mf.e.b);
      this.a(dae.cg, dae.gp, mf.e.b);
      this.a(dae.cf, dae.gq, mf.e.b);
      this.a(dae.bv, dae.gr, mf.e.b);
      this.a(dae.bS, dae.fS, mf.e.b);
      this.H();
      this.u(dae.eT);
      this.u(dae.eU);
      this.u(dae.eV);
      this.a(dae.bt, mf.e.a);
      this.b(dae.dS, mf.e.a);
      this.a(cqp.dI);
      this.b(dae.mc, dae.md, mf.e.b);
      this.a(cqp.dJ);
      this.c(dae.md);
      this.b(dae.sG, mf.e.b);
      this.c(dae.sG);
      this.c(dae.sw);
      this.b(dae.oz, dae.oA, mf.e.b);
      this.b(dae.oB, dae.oC, mf.e.b);
      this.a(dae.oz, "_plant");
      this.c(dae.oA);
      this.a(dae.oB, "_plant");
      this.c(dae.oC);
      this.a(dae.mY, mf.e.a, mw.c(mw.a(dae.mZ, "_stage0")));
      this.m();
      this.a(dae.bs, mf.e.b);
      this.c(dae.iE, mf.e.b);
      this.c(dae.iF, mf.e.b);
      this.c(dae.iG, mf.e.b);
      this.c(dae.iH, mf.e.a);
      this.c(dae.iI, mf.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dae.mw, dae.mr, dae.mm, dae.mh, dae.mG, dae.mB, dae.mQ, dae.mL);
      this.a(dae.mx, dae.ms, dae.mn, dae.mi, dae.mH, dae.mC, dae.mR, dae.mM);
      this.a(dae.my, dae.mt, dae.mo, dae.mj, dae.mI, dae.mD, dae.mS, dae.mN);
      this.a(dae.mz, dae.mu, dae.mp, dae.mk, dae.mJ, dae.mE, dae.mT, dae.mO);
      this.a(dae.mA, dae.mv, dae.mq, dae.ml, dae.mK, dae.mF, dae.mU, dae.mP);
      this.e(dae.fe, dae.fc);
      this.e(dae.fd, dae.fb);
      this.l(dae.ab).c(dae.ab).a(dae.av);
      this.l(dae.am).c(dae.am).a(dae.aD);
      this.a(dae.am, dae.dj, dae.ds);
      this.b(dae.aL, my.s);
      this.l(dae.Y).c(dae.Y).a(dae.as);
      this.l(dae.ai).c(dae.ai).a(dae.aA);
      this.a(dae.ai, dae.dd, dae.do);
      this.a(dae.B, dae.fX, mf.e.b);
      this.b(dae.aI, my.s);
      this.l(dae.Z).d(dae.Z).a(dae.at);
      this.l(dae.aj).d(dae.aj).a(dae.aB);
      this.a(dae.aj, dae.de, dae.dp);
      this.a(dae.C, dae.fY, mf.e.b);
      this.b(dae.aJ, my.s);
      this.l(dae.W).c(dae.W).a(dae.aq);
      this.l(dae.ag).c(dae.ag).a(dae.ay);
      this.a(dae.ag, dae.dc, dae.dn);
      this.a(dae.z, dae.fV, mf.e.b);
      this.b(dae.aG, my.s);
      this.l(dae.U).c(dae.U).a(dae.ao);
      this.l(dae.al).c(dae.al).a(dae.aw);
      this.a(dae.al, dae.da, dae.dl);
      this.a(dae.x, dae.fT, mf.e.b);
      this.b(dae.aE, my.s);
      this.l(dae.V).c(dae.V).a(dae.ap);
      this.l(dae.af).c(dae.af).a(dae.ax);
      this.a(dae.af, dae.db, dae.dm);
      this.a(dae.y, dae.fU, mf.e.b);
      this.b(dae.aF, my.s);
      this.l(dae.aa).c(dae.aa).a(dae.au);
      this.l(dae.ak).c(dae.ak).a(dae.aC);
      this.a(dae.ak, dae.dg, dae.dr);
      this.a(dae.D, dae.fZ, mf.e.b);
      this.b(dae.aK, my.s);
      this.l(dae.X).c(dae.X).a(dae.ar);
      this.l(dae.ah).c(dae.ah).a(dae.az);
      this.a(dae.ah, dae.df, dae.dq);
      this.a(dae.A, dae.fW, mf.e.b);
      this.b(dae.aH, my.s);
      this.l(dae.os).b(dae.os).a(dae.ou);
      this.l(dae.ot).b(dae.ot).a(dae.ov);
      this.a(dae.ot, dae.dh, dae.dt);
      this.a(dae.ox, dae.pm, mf.e.b);
      this.n(dae.oD, dae.po);
      this.l(dae.oj).b(dae.oj).a(dae.ol);
      this.l(dae.ok).b(dae.ok).a(dae.om);
      this.a(dae.ok, dae.di, dae.du);
      this.a(dae.oo, dae.pn, mf.e.b);
      this.n(dae.oq, dae.pp);
      this.l(dae.ae).d(dae.ae);
      this.l(dae.an).d(dae.an);
      this.a(dae.v, dae.dk, dae.dv);
      this.b(dae.or, mf.e.b);
      this.a(cqp.dF);
      this.i(dae.dy);
      this.k(dae.hY);
      this.u();
      this.n(dae.cP);
      this.o(dae.bp);
      this.o(dae.bq);
      this.o(dae.hh);
      this.t();
      this.q(dae.fN);
      this.q(dae.kG);
      this.q(dae.kH);
      this.r(dae.gS);
      this.r(dae.gT);
      this.r(dae.gU);
      this.o();
      this.p();
      this.d(dae.cD, my.h);
      this.d(dae.nW, my.h);
      this.d(dae.nV, my.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dae.eK, dae.eS);
      this.k(dae.m, dae.eO);
      this.k(dae.eJ, dae.eR);
      this.k(dae.eI, dae.eQ);
      this.az();
      this.k(dae.eH, dae.eP);
      this.aA();
      crr.h().forEach($$0 -> this.a($$0, mt.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dae.hX);
      mm.a<Integer> $$0 = mm.a(dnr.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ajh $$3 = mw.a(cqp.hB, $$2);
         $$0.a($$1, mo.a().a(mp.c, mv.aa.a(dae.hX, $$2, mw.h($$3), this.c)));
         mv.bx.a(mt.a(cqp.hB, $$2), mw.k($$3), this.c);
      }

      this.b.accept(ml.a(dae.hX).a($$0));
   }

   private void o(dac $$0, dac $$1) {
      this.a($$0.l());
      mw $$2 = mw.b(mw.G($$0));
      mw $$3 = mw.b(mw.a($$0, "_lit"));
      ajh $$4 = mv.bH.a($$0, "_one_candle", $$2, this.c);
      ajh $$5 = mv.bI.a($$0, "_two_candles", $$2, this.c);
      ajh $$6 = mv.bJ.a($$0, "_three_candles", $$2, this.c);
      ajh $$7 = mv.bK.a($$0, "_four_candles", $$2, this.c);
      ajh $$8 = mv.bH.a($$0, "_one_candle_lit", $$3, this.c);
      ajh $$9 = mv.bI.a($$0, "_two_candles_lit", $$3, this.c);
      ajh $$10 = mv.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      ajh $$11 = mv.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            ml.a($$0)
               .a(
                  mm.a(dnr.az, dnr.r)
                     .a(1, false, mo.a().a(mp.c, $$4))
                     .a(2, false, mo.a().a(mp.c, $$5))
                     .a(3, false, mo.a().a(mp.c, $$6))
                     .a(4, false, mo.a().a(mp.c, $$7))
                     .a(1, true, mo.a().a(mp.c, $$8))
                     .a(2, true, mo.a().a(mp.c, $$9))
                     .a(3, true, mo.a().a(mp.c, $$10))
                     .a(4, true, mo.a().a(mp.c, $$11))
               )
         );
      ajh $$12 = mv.bL.a($$1, mw.a($$0, false), this.c);
      ajh $$13 = mv.bL.a($$1, "_lit", mw.a($$0, true), this.c);
      this.b.accept(ml.a($$1).a(a(dnr.r, $$13, $$12)));
   }

   class a {
      private final ajh b;

      public a(ajh $$0, dac $$1) {
         this.b = mv.aa.a($$0, mw.u($$1), mf.this.c);
      }

      public mf.a a(dac... $$0) {
         for (dac $$1 : $$0) {
            mf.this.b.accept(mf.c($$1, this.b));
         }

         return this;
      }

      public mf.a b(dac... $$0) {
         for (dac $$1 : $$0) {
            mf.this.c($$1);
         }

         return this.a($$0);
      }

      public mf.a a(mu $$0, dac... $$1) {
         for (dac $$2 : $$1) {
            $$0.a(mt.a($$2.l()), mw.u($$2), mf.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mw b;
      private final Map<mu, ajh> c = Maps.newHashMap();
      @Nullable
      private km d;
      @Nullable
      private ajh e;
      private final Set<dac> f = new HashSet<>();

      public b(mw $$0) {
         this.b = $$0;
      }

      public mf.b a(dac $$0, mu $$1) {
         this.e = $$1.a($$0, this.b, mf.this.c);
         if (mf.this.f.containsKey($$0)) {
            mf.this.b.accept(mf.this.f.get($$0).create($$0, this.e, this.b, mf.this.c));
         } else {
            mf.this.b.accept(mf.c($$0, this.e));
         }

         return this;
      }

      public mf.b a(dac $$0, dac $$1) {
         ajh $$2 = mt.a($$0);
         mf.this.b.accept(mf.c($$1, $$2));
         mf.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public mf.b a(dac $$0) {
         ajh $$1 = mv.s.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.t.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.b($$0, $$1, $$2));
         ajh $$3 = mv.u.a($$0, this.b, mf.this.c);
         mf.this.a($$0, $$3);
         return this;
      }

      public mf.b b(dac $$0) {
         ajh $$1 = mv.M.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.N.a($$0, this.b, mf.this.c);
         ajh $$3 = mv.O.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.a($$0, $$1, $$2, $$3));
         ajh $$4 = mv.P.a($$0, this.b, mf.this.c);
         mf.this.a($$0, $$4);
         return this;
      }

      public mf.b c(dac $$0) {
         mw $$1 = mw.p($$0);
         ajh $$2 = mv.D.a($$0, $$1, mf.this.c);
         ajh $$3 = mv.E.a($$0, $$1, mf.this.c);
         ajh $$4 = mv.F.a($$0, $$1, mf.this.c);
         ajh $$5 = mv.G.a($$0, $$1, mf.this.c);
         ajh $$6 = mv.H.a($$0, $$1, mf.this.c);
         mf.this.b.accept(mf.a($$0, $$2, $$3, $$4, $$5, $$6));
         ajh $$7 = mv.I.a($$0, $$1, mf.this.c);
         mf.this.a($$0, $$7);
         return this;
      }

      public mf.b d(dac $$0) {
         ajh $$1 = mv.J.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.K.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.c($$0, $$1, $$2));
         ajh $$3 = mv.L.a($$0, this.b, mf.this.c);
         mf.this.a($$0, $$3);
         return this;
      }

      public mf.b e(dac $$0) {
         mw $$1 = mw.p($$0);
         ajh $$2 = mv.R.a($$0, $$1, mf.this.c);
         ajh $$3 = mv.Q.a($$0, $$1, mf.this.c);
         ajh $$4 = mv.T.a($$0, $$1, mf.this.c);
         ajh $$5 = mv.S.a($$0, $$1, mf.this.c);
         mf.this.b.accept(mf.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public mf.b f(dac $$0) {
         ajh $$1 = mv.V.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.U.a($$0, this.b, mf.this.c);
         ajh $$3 = mv.X.a($$0, this.b, mf.this.c);
         ajh $$4 = mv.W.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public mf.b g(dac $$0) {
         ajh $$1 = mv.Y.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.Z.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.e($$0, $$1, $$2));
         return this;
      }

      public mf.b h(dac $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dac $$1 = this.d.b().get(km.b.r);
            ajh $$2 = mv.aa.a($$0, this.b, mf.this.c);
            mf.this.b.accept(mf.c($$0, $$2));
            mf.this.b.accept(mf.c($$1, $$2));
            mf.this.a($$0.l());
            mf.this.c($$1);
            return this;
         }
      }

      public mf.b i(dac $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ajh $$1 = this.a(mv.ab, $$0);
            ajh $$2 = this.a(mv.ac, $$0);
            mf.this.b.accept(mf.e($$0, $$1, $$2, this.e));
            mf.this.a($$0, $$1);
            return this;
         }
      }

      public mf.b j(dac $$0) {
         ajh $$1 = this.a(mv.af, $$0);
         ajh $$2 = this.a(mv.ae, $$0);
         ajh $$3 = this.a(mv.ag, $$0);
         mf.this.b.accept(mf.b($$0, $$1, $$2, $$3));
         mf.this.a($$0, $$2);
         return this;
      }

      private mf.b k(dac $$0) {
         my $$1 = mf.this.g.getOrDefault($$0, my.a.get($$0));
         ajh $$2 = $$1.a($$0, mf.this.c);
         mf.this.b.accept(mf.c($$0, $$2));
         return this;
      }

      private mf.b l(dac $$0) {
         mf.this.i($$0);
         return this;
      }

      private void m(dac $$0) {
         if (mf.this.e.contains($$0)) {
            mf.this.k($$0);
         } else {
            mf.this.j($$0);
         }
      }

      private ajh a(mu $$0, dac $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, mf.this.c));
      }

      public mf.b a(km $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<mf.b, dac> $$2 = mf.h.get($$0x);
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
      mi create(dac var1, ajh var2, mw var3, BiConsumer<ajh, Supplier<JsonElement>> var4);
   }

   static record d(mu a, String b) {
   }

   static enum e {
      a,
      b;

      public mu a() {
         return this == a ? mv.ap : mv.ao;
      }

      public mu b() {
         return this == a ? mv.ar : mv.aq;
      }
   }

   class f {
      private final mw b;

      public f(mw $$0) {
         this.b = $$0;
      }

      public mf.f a(dac $$0) {
         mw $$1 = this.b.c(mx.d, this.b.a(mx.i));
         ajh $$2 = mv.j.a($$0, $$1, mf.this.c);
         mf.this.b.accept(mf.d($$0, $$2));
         return this;
      }

      public mf.f b(dac $$0) {
         ajh $$1 = mv.j.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.d($$0, $$1));
         return this;
      }

      public mf.f c(dac $$0) {
         ajh $$1 = mv.j.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.k.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.d($$0, $$1, $$2));
         return this;
      }

      public mf.f d(dac $$0) {
         mf.this.b.accept(mf.a($$0, this.b, mf.this.c));
         return this;
      }
   }
}
