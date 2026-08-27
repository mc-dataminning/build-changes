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
   private final Consumer<cqf> d;
   final List<daa> e = ImmutableList.of(dac.ey, dac.eE, dac.hY);
   final Map<daa, mf.c> f = ImmutableMap.builder().put(dac.b, mf::a).put(dac.sJ, mf::c).put(dac.eM, mf::b).build();
   final Map<daa, my> g = ImmutableMap.builder()
      .put(dac.aV, my.y.get(dac.aV))
      .put(dac.jp, my.y.get(dac.jp))
      .put(dac.jS, my.a(mw.a(dac.aV, "_top")))
      .put(dac.jU, my.a(mw.a(dac.jp, "_top")))
      .put(dac.aX, my.d.get(dac.aV).a($$0x -> $$0x.a(mx.i, mw.G(dac.aX))))
      .put(dac.jr, my.d.get(dac.jp).a($$0x -> $$0x.a(mx.i, mw.G(dac.jr))))
      .put(dac.hd, my.d.get(dac.hd))
      .put(dac.jT, my.a(mw.a(dac.hd, "_bottom")))
      .put(dac.pr, my.z.get(dac.pr))
      .put(dac.sJ, my.z.get(dac.sJ))
      .put(dac.he, my.d.get(dac.he).a($$0x -> $$0x.a(mx.i, mw.G(dac.he))))
      .put(dac.aW, my.d.get(dac.aW).a($$0x -> {
         $$0x.a(mx.d, mw.a(dac.aV, "_top"));
         $$0x.a(mx.i, mw.G(dac.aW));
      }))
      .put(dac.jq, my.d.get(dac.jq).a($$0x -> {
         $$0x.a(mx.d, mw.a(dac.jp, "_top"));
         $$0x.a(mx.i, mw.G(dac.jq));
      }))
      .put(dac.qM, my.z.get(dac.qM))
      .put(dac.qH, my.z.get(dac.qH))
      .build();
   static final Map<km.b, BiConsumer<mf.b, daa>> h = ImmutableMap.builder()
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
   public static final List<Pair<dnq, Function<ajh, mo>>> a = List.of(
      Pair.of(dnp.L, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0)),
      Pair.of(dnp.M, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.b, mp.a.b).a(mp.d, true)),
      Pair.of(dnp.N, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.b, mp.a.c).a(mp.d, true)),
      Pair.of(dnp.O, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.b, mp.a.d).a(mp.d, true)),
      Pair.of(dnp.J, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.a, mp.a.d).a(mp.d, true)),
      Pair.of(dnp.K, (Function<ajh, mo>)$$0 -> mo.a().a(mp.c, $$0).a(mp.a, mp.a.b).a(mp.d, true))
   );
   private static final Map<mf.d, ajh> i = new HashMap<>();

   private static mi a(daa $$0, ajh $$1, mw $$2, BiConsumer<ajh, Supplier<JsonElement>> $$3) {
      ajh $$4 = mv.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static mi b(daa $$0, ajh $$1, mw $$2, BiConsumer<ajh, Supplier<JsonElement>> $$3) {
      ajh $$4 = mv.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static mi c(daa $$0, ajh $$1, mw $$2, BiConsumer<ajh, Supplier<JsonElement>> $$3) {
      ajh $$4 = mv.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public mf(Consumer<mi> $$0, BiConsumer<ajh, Supplier<JsonElement>> $$1, Consumer<cqf> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(daa $$0) {
      this.d.accept($$0.l());
   }

   void a(daa $$0, ajh $$1) {
      this.c.accept(mt.a($$0.l()), new ms($$1));
   }

   private void a(cqf $$0, ajh $$1) {
      this.c.accept(mt.a($$0), new ms($$1));
   }

   void a(cqf $$0) {
      mv.bx.a(mt.a($$0), mw.b($$0), this.c);
   }

   private void d(daa $$0) {
      cqf $$1 = $$0.l();
      if ($$1 != cqn.a) {
         mv.bx.a(mt.a($$1), mw.F($$0), this.c);
      }
   }

   private void a(daa $$0, String $$1) {
      cqf $$2 = $$0.l();
      mv.bx.a(mt.a($$2), mw.k(mw.a($$0, $$1)), this.c);
   }

   private static mm b() {
      return mm.a(dnp.R).a(ih.f, mo.a().a(mp.b, mp.a.b)).a(ih.d, mo.a().a(mp.b, mp.a.c)).a(ih.e, mo.a().a(mp.b, mp.a.d)).a(ih.c, mo.a());
   }

   private static mm c() {
      return mm.a(dnp.R).a(ih.d, mo.a()).a(ih.e, mo.a().a(mp.b, mp.a.b)).a(ih.c, mo.a().a(mp.b, mp.a.c)).a(ih.f, mo.a().a(mp.b, mp.a.d));
   }

   private static mm d() {
      return mm.a(dnp.R).a(ih.f, mo.a()).a(ih.d, mo.a().a(mp.b, mp.a.b)).a(ih.e, mo.a().a(mp.b, mp.a.c)).a(ih.c, mo.a().a(mp.b, mp.a.d));
   }

   private static mm e() {
      return mm.a(dnp.P)
         .a(ih.a, mo.a().a(mp.a, mp.a.b))
         .a(ih.b, mo.a().a(mp.a, mp.a.d))
         .a(ih.c, mo.a())
         .a(ih.d, mo.a().a(mp.b, mp.a.c))
         .a(ih.e, mo.a().a(mp.b, mp.a.d))
         .a(ih.f, mo.a().a(mp.b, mp.a.b));
   }

   private static ml b(daa $$0, ajh $$1) {
      return ml.a($$0, a($$1));
   }

   private static mo[] a(ajh $$0) {
      return new mo[]{mo.a().a(mp.c, $$0), mo.a().a(mp.c, $$0).a(mp.b, mp.a.b), mo.a().a(mp.c, $$0).a(mp.b, mp.a.c), mo.a().a(mp.c, $$0).a(mp.b, mp.a.d)};
   }

   private static ml a(daa $$0, ajh $$1, ajh $$2) {
      return ml.a($$0, mo.a().a(mp.c, $$1), mo.a().a(mp.c, $$2), mo.a().a(mp.c, $$1).a(mp.b, mp.a.c), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c));
   }

   private static mm a(dnq $$0, ajh $$1, ajh $$2) {
      return mm.a($$0).a(true, mo.a().a(mp.c, $$1)).a(false, mo.a().a(mp.c, $$2));
   }

   private void e(daa $$0) {
      ajh $$1 = my.a.create($$0, this.c);
      ajh $$2 = my.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(daa $$0) {
      ajh $$1 = my.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(daa $$0) {
      this.b.accept(ml.a($$0).a(mm.a(dnp.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ajh $$3 = mw.a($$0, $$2);
         return mo.a().a(mp.c, mv.c.a($$0, $$2, new mw().a(mx.a, $$3), this.c));
      })));
      this.a($$0, mw.a($$0, "_0"));
   }

   static mi b(daa $$0, ajh $$1, ajh $$2) {
      return ml.a($$0)
         .a(mm.a(dnp.w).a(false, mo.a().a(mp.c, $$1)).a(true, mo.a().a(mp.c, $$2)))
         .a(
            mm.a(dnp.U, dnp.R)
               .a(dnk.a, ih.f, mo.a().a(mp.b, mp.a.b))
               .a(dnk.a, ih.e, mo.a().a(mp.b, mp.a.d))
               .a(dnk.a, ih.d, mo.a().a(mp.b, mp.a.c))
               .a(dnk.a, ih.c, mo.a())
               .a(dnk.b, ih.f, mo.a().a(mp.b, mp.a.b).a(mp.a, mp.a.b).a(mp.d, true))
               .a(dnk.b, ih.e, mo.a().a(mp.b, mp.a.d).a(mp.a, mp.a.b).a(mp.d, true))
               .a(dnk.b, ih.d, mo.a().a(mp.b, mp.a.c).a(mp.a, mp.a.b).a(mp.d, true))
               .a(dnk.b, ih.c, mo.a().a(mp.a, mp.a.b).a(mp.d, true))
               .a(dnk.c, ih.f, mo.a().a(mp.b, mp.a.d).a(mp.a, mp.a.c))
               .a(dnk.c, ih.e, mo.a().a(mp.b, mp.a.b).a(mp.a, mp.a.c))
               .a(dnk.c, ih.d, mo.a().a(mp.a, mp.a.c))
               .a(dnk.c, ih.c, mo.a().a(mp.b, mp.a.c).a(mp.a, mp.a.c))
         );
   }

   private static mm.d<ih, dnv, dnu, Boolean> a(mm.d<ih, dnv, dnu, Boolean> $$0, dnv $$1, ajh $$2, ajh $$3, ajh $$4, ajh $$5) {
      return $$0.a(ih.f, $$1, dnu.a, false, mo.a().a(mp.c, $$2))
         .a(ih.d, $$1, dnu.a, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
         .a(ih.e, $$1, dnu.a, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.c))
         .a(ih.c, $$1, dnu.a, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.d))
         .a(ih.f, $$1, dnu.b, false, mo.a().a(mp.c, $$4))
         .a(ih.d, $$1, dnu.b, false, mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
         .a(ih.e, $$1, dnu.b, false, mo.a().a(mp.c, $$4).a(mp.b, mp.a.c))
         .a(ih.c, $$1, dnu.b, false, mo.a().a(mp.c, $$4).a(mp.b, mp.a.d))
         .a(ih.f, $$1, dnu.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
         .a(ih.d, $$1, dnu.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
         .a(ih.e, $$1, dnu.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
         .a(ih.c, $$1, dnu.a, true, mo.a().a(mp.c, $$3))
         .a(ih.f, $$1, dnu.b, true, mo.a().a(mp.c, $$5).a(mp.b, mp.a.d))
         .a(ih.d, $$1, dnu.b, true, mo.a().a(mp.c, $$5))
         .a(ih.e, $$1, dnu.b, true, mo.a().a(mp.c, $$5).a(mp.b, mp.a.b))
         .a(ih.c, $$1, dnu.b, true, mo.a().a(mp.c, $$5).a(mp.b, mp.a.c));
   }

   private static mi a(daa $$0, ajh $$1, ajh $$2, ajh $$3, ajh $$4, ajh $$5, ajh $$6, ajh $$7, ajh $$8) {
      return ml.a($$0).a(a(a(mm.a(dnp.R, dnp.ae, dnp.be, dnp.u), dnv.b, $$1, $$2, $$3, $$4), dnv.a, $$5, $$6, $$7, $$8));
   }

   static mi a(daa $$0, ajh $$1, ajh $$2, ajh $$3, ajh $$4, ajh $$5) {
      return mk.a($$0)
         .a(mo.a().a(mp.c, $$1))
         .a(mj.a().a(dnp.L, true), mo.a().a(mp.c, $$2).a(mp.d, false))
         .a(mj.a().a(dnp.M, true), mo.a().a(mp.c, $$3).a(mp.d, false))
         .a(mj.a().a(dnp.N, true), mo.a().a(mp.c, $$4).a(mp.d, false))
         .a(mj.a().a(dnp.O, true), mo.a().a(mp.c, $$5).a(mp.d, false));
   }

   static mi c(daa $$0, ajh $$1, ajh $$2) {
      return mk.a($$0)
         .a(mo.a().a(mp.c, $$1))
         .a(mj.a().a(dnp.L, true), mo.a().a(mp.c, $$2).a(mp.d, true))
         .a(mj.a().a(dnp.M, true), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, true))
         .a(mj.a().a(dnp.N, true), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, true))
         .a(mj.a().a(dnp.O, true), mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, true));
   }

   static mi a(daa $$0, ajh $$1, ajh $$2, ajh $$3) {
      return mk.a($$0)
         .a(mj.a().a(dnp.J, true), mo.a().a(mp.c, $$1))
         .a(mj.a().a(dnp.X, dol.b), mo.a().a(mp.c, $$2).a(mp.d, true))
         .a(mj.a().a(dnp.W, dol.b), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, true))
         .a(mj.a().a(dnp.Y, dol.b), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, true))
         .a(mj.a().a(dnp.Z, dol.b), mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, true))
         .a(mj.a().a(dnp.X, dol.c), mo.a().a(mp.c, $$3).a(mp.d, true))
         .a(mj.a().a(dnp.W, dol.c), mo.a().a(mp.c, $$3).a(mp.b, mp.a.b).a(mp.d, true))
         .a(mj.a().a(dnp.Y, dol.c), mo.a().a(mp.c, $$3).a(mp.b, mp.a.c).a(mp.d, true))
         .a(mj.a().a(dnp.Z, dol.c), mo.a().a(mp.c, $$3).a(mp.b, mp.a.d).a(mp.d, true));
   }

   static mi a(daa $$0, ajh $$1, ajh $$2, ajh $$3, ajh $$4, boolean $$5) {
      return ml.a($$0, mo.a().a(mp.d, $$5))
         .a(c())
         .a(
            mm.a(dnp.q, dnp.u)
               .a(false, false, mo.a().a(mp.c, $$2))
               .a(true, false, mo.a().a(mp.c, $$4))
               .a(false, true, mo.a().a(mp.c, $$1))
               .a(true, true, mo.a().a(mp.c, $$3))
         );
   }

   static mi b(daa $$0, ajh $$1, ajh $$2, ajh $$3) {
      return ml.a($$0)
         .a(
            mm.a(dnp.R, dnp.af, dnp.bi)
               .a(ih.f, dny.b, doi.a, mo.a().a(mp.c, $$2))
               .a(ih.e, dny.b, doi.a, mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, dny.b, doi.a, mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, dny.b, doi.a, mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, dny.b, doi.e, mo.a().a(mp.c, $$3))
               .a(ih.e, dny.b, doi.e, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, dny.b, doi.e, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, dny.b, doi.e, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, dny.b, doi.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.e, dny.b, doi.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.d, dny.b, doi.d, mo.a().a(mp.c, $$3))
               .a(ih.c, dny.b, doi.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.f, dny.b, doi.c, mo.a().a(mp.c, $$1))
               .a(ih.e, dny.b, doi.c, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, dny.b, doi.c, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, dny.b, doi.c, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, dny.b, doi.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.e, dny.b, doi.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.d, dny.b, doi.b, mo.a().a(mp.c, $$1))
               .a(ih.c, dny.b, doi.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.f, dny.a, doi.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.e, dny.a, doi.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, dny.a, doi.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, dny.a, doi.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, dny.a, doi.e, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.e, dny.a, doi.e, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.d, dny.a, doi.e, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.c, dny.a, doi.e, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.f, dny.a, doi.d, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.e, dny.a, doi.d, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, dny.a, doi.d, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, dny.a, doi.d, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.f, dny.a, doi.c, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.e, dny.a, doi.c, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
               .a(ih.d, dny.a, doi.c, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.c, dny.a, doi.c, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.f, dny.a, doi.b, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.d, true))
               .a(ih.e, dny.a, doi.b, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.c).a(mp.d, true))
               .a(ih.d, dny.a, doi.b, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.b).a(mp.d, true))
               .a(ih.c, dny.a, doi.b, mo.a().a(mp.c, $$1).a(mp.a, mp.a.c).a(mp.b, mp.a.d).a(mp.d, true))
         );
   }

   private static mi c(daa $$0, ajh $$1, ajh $$2, ajh $$3) {
      return ml.a($$0)
         .a(
            mm.a(dnp.R, dnp.af, dnp.u)
               .a(ih.c, dny.b, false, mo.a().a(mp.c, $$2))
               .a(ih.d, dny.b, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.c))
               .a(ih.f, dny.b, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
               .a(ih.e, dny.b, false, mo.a().a(mp.c, $$2).a(mp.b, mp.a.d))
               .a(ih.c, dny.a, false, mo.a().a(mp.c, $$1))
               .a(ih.d, dny.a, false, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c))
               .a(ih.f, dny.a, false, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b))
               .a(ih.e, dny.a, false, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d))
               .a(ih.c, dny.b, true, mo.a().a(mp.c, $$3))
               .a(ih.d, dny.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               .a(ih.f, dny.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(ih.e, dny.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
               .a(ih.c, dny.a, true, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.c))
               .a(ih.d, dny.a, true, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.a))
               .a(ih.f, dny.a, true, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.d))
               .a(ih.e, dny.a, true, mo.a().a(mp.c, $$3).a(mp.a, mp.a.c).a(mp.b, mp.a.b))
         );
   }

   private static mi d(daa $$0, ajh $$1, ajh $$2, ajh $$3) {
      return ml.a($$0)
         .a(
            mm.a(dnp.R, dnp.af, dnp.u)
               .a(ih.c, dny.b, false, mo.a().a(mp.c, $$2))
               .a(ih.d, dny.b, false, mo.a().a(mp.c, $$2))
               .a(ih.f, dny.b, false, mo.a().a(mp.c, $$2))
               .a(ih.e, dny.b, false, mo.a().a(mp.c, $$2))
               .a(ih.c, dny.a, false, mo.a().a(mp.c, $$1))
               .a(ih.d, dny.a, false, mo.a().a(mp.c, $$1))
               .a(ih.f, dny.a, false, mo.a().a(mp.c, $$1))
               .a(ih.e, dny.a, false, mo.a().a(mp.c, $$1))
               .a(ih.c, dny.b, true, mo.a().a(mp.c, $$3))
               .a(ih.d, dny.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               .a(ih.f, dny.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(ih.e, dny.b, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
               .a(ih.c, dny.a, true, mo.a().a(mp.c, $$3))
               .a(ih.d, dny.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               .a(ih.f, dny.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(ih.e, dny.a, true, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
         );
   }

   static ml c(daa $$0, ajh $$1) {
      return ml.a($$0, mo.a().a(mp.c, $$1));
   }

   private static mm f() {
      return mm.a(dnp.I).a(ih.a.b, mo.a()).a(ih.a.c, mo.a().a(mp.a, mp.a.b)).a(ih.a.a, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.b));
   }

   static mi a(daa $$0, mw $$1, BiConsumer<ajh, Supplier<JsonElement>> $$2) {
      ajh $$3 = mv.g.a($$0, $$1, $$2);
      ajh $$4 = mv.h.a($$0, $$1, $$2);
      ajh $$5 = mv.i.a($$0, $$1, $$2);
      ajh $$6 = mv.j.a($$0, $$1, $$2);
      return ml.a($$0, mo.a().a(mp.c, $$6)).a(mm.a(dnp.I).a(ih.a.a, mo.a().a(mp.c, $$3)).a(ih.a.b, mo.a().a(mp.c, $$4)).a(ih.a.c, mo.a().a(mp.c, $$5)));
   }

   static mi d(daa $$0, ajh $$1) {
      return ml.a($$0, mo.a().a(mp.c, $$1)).a(f());
   }

   private void e(daa $$0, ajh $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(daa $$0, my.a $$1) {
      ajh $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(daa $$0, my.a $$1) {
      ajh $$2 = $$1.create($$0, this.c);
      this.b.accept(ml.a($$0, mo.a().a(mp.c, $$2)).a(b()));
   }

   static mi d(daa $$0, ajh $$1, ajh $$2) {
      return ml.a($$0)
         .a(
            mm.a(dnp.I)
               .a(ih.a.b, mo.a().a(mp.c, $$1))
               .a(ih.a.c, mo.a().a(mp.c, $$2).a(mp.a, mp.a.b))
               .a(ih.a.a, mo.a().a(mp.c, $$2).a(mp.a, mp.a.b).a(mp.b, mp.a.b))
         );
   }

   private void a(daa $$0, my.a $$1, my.a $$2) {
      ajh $$3 = $$1.create($$0, this.c);
      ajh $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ajh a(daa $$0, String $$1, mu $$2, Function<ajh, mw> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mw.a($$0, $$1)), this.c);
   }

   static mi e(daa $$0, ajh $$1, ajh $$2) {
      return ml.a($$0).a(a(dnp.w, $$2, $$1));
   }

   static mi e(daa $$0, ajh $$1, ajh $$2, ajh $$3) {
      return ml.a($$0).a(mm.a(dnp.bh).a(doh.b, mo.a().a(mp.c, $$1)).a(doh.a, mo.a().a(mp.c, $$2)).a(doh.c, mo.a().a(mp.c, $$3)));
   }

   public void a(daa $$0) {
      this.b($$0, my.a);
   }

   public void b(daa $$0, my.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(daa $$0, mw $$1, mu $$2) {
      ajh $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private mf.b h(daa $$0) {
      my $$1 = this.g.getOrDefault($$0, my.a.get($$0));
      return new mf.b($$1.b()).a($$0, $$1.a());
   }

   public void a(daa $$0, daa $$1, daa $$2) {
      mw $$3 = mw.u($$0);
      ajh $$4 = mv.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.l());
      this.c($$2);
   }

   void i(daa $$0) {
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

   private void a(daa $$0, daa $$1) {
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

   void j(daa $$0) {
      mw $$1 = mw.b($$0);
      ajh $$2 = mv.ak.a($$0, $$1, this.c);
      ajh $$3 = mv.al.a($$0, $$1, this.c);
      ajh $$4 = mv.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(daa $$0) {
      mw $$1 = mw.b($$0);
      ajh $$2 = mv.ah.a($$0, $$1, this.c);
      ajh $$3 = mv.ai.a($$0, $$1, this.c);
      ajh $$4 = mv.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(daa $$0, daa $$1) {
      ajh $$2 = mv.ah.a($$0);
      ajh $$3 = mv.ai.a($$0);
      ajh $$4 = mv.aj.a($$0);
      this.a($$1, mt.a($$0.l()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dac.sD);
      ajh $$0 = mt.a(dac.sD);
      ajh $$1 = mt.a(dac.sD, "_partial_tilt");
      ajh $$2 = mt.a(dac.sD, "_full_tilt");
      this.b
         .accept(
            ml.a(dac.sD)
               .a(b())
               .a(mm.a(dnp.bl).a(dok.a, mo.a().a(mp.c, $$0)).a(dok.b, mo.a().a(mp.c, $$0)).a(dok.c, mo.a().a(mp.c, $$1)).a(dok.d, mo.a().a(mp.c, $$2)))
         );
   }

   private mf.f l(daa $$0) {
      return new mf.f(mw.n($$0));
   }

   private void m(daa $$0) {
      this.c($$0, $$0);
   }

   private void c(daa $$0, daa $$1) {
      this.b.accept(c($$0, mt.a($$1)));
   }

   private void a(daa $$0, mf.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(daa $$0, mf.e $$1, mw $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(daa $$0, mf.e $$1) {
      mw $$2 = mw.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(daa $$0, mf.e $$1, mw $$2) {
      ajh $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(daa $$0, mf.e $$1, doc<Integer> $$2, int... $$3) {
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

   private void a(daa $$0, daa $$1, mf.e $$2) {
      this.a($$0, $$2);
      mw $$3 = mw.d($$0);
      ajh $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(daa $$0, daa $$1) {
      my $$2 = my.p.get($$0);
      ajh $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ajh $$4 = mv.aC.a($$1, $$2.b(), this.c);
      this.b.accept(ml.a($$1, mo.a().a(mp.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(daa $$0, daa $$1) {
      this.a($$0.l());
      mw $$2 = mw.h($$0);
      mw $$3 = mw.a($$0, $$1);
      ajh $$4 = mv.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            ml.a($$1, mo.a().a(mp.c, $$4))
               .a(mm.a(dnp.R).a(ih.e, mo.a()).a(ih.d, mo.a().a(mp.b, mp.a.d)).a(ih.c, mo.a().a(mp.b, mp.a.b)).a(ih.f, mo.a().a(mp.b, mp.a.c)))
         );
      this.b.accept(ml.a($$0).a(mm.a(dnp.av).a($$2x -> mo.a().a(mp.c, mv.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      daa $$0 = dac.kC;
      this.a($$0.l());
      ajh $$1 = mt.a($$0, "_top");
      ajh $$2 = mt.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      daa $$0 = dac.kB;
      this.a($$0.l());
      mm $$1 = mm.a(dfo.d, dnp.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> mo.a().a(mp.c, mt.a($$0, "_top_stage_" + $$1x));
            case b -> mo.a().a(mp.c, mt.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(ml.a($$0).a($$1));
   }

   private void a(daa $$0, daa $$1, daa $$2, daa $$3, daa $$4, daa $$5, daa $$6, daa $$7) {
      this.a($$0, mf.e.b);
      this.a($$1, mf.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(daa $$0, mf.e $$1) {
      this.a($$0, "_top");
      ajh $$2 = this.a($$0, "_top", $$1.a(), mw::c);
      ajh $$3 = this.a($$0, "_bottom", $$1.a(), mw::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dac.iD, "_front");
      ajh $$0 = mt.a(dac.iD, "_top");
      ajh $$1 = this.a(dac.iD, "_bottom", mf.e.b.a(), mw::c);
      this.f(dac.iD, $$0, $$1);
   }

   private void k() {
      ajh $$0 = this.a(dac.bx, "_top", mv.bk, mw::a);
      ajh $$1 = this.a(dac.bx, "_bottom", mv.bk, mw::a);
      this.f(dac.bx, $$0, $$1);
   }

   private void l() {
      this.c(dac.sF);
      ajh $$0 = mt.a(dac.sF, "_top");
      ajh $$1 = mt.a(dac.sF, "_bottom");
      this.b.accept(ml.a(dac.sF).a(b()).a(mm.a(dnp.ae).a(dnv.b, mo.a().a(mp.c, $$1)).a(dnv.a, mo.a().a(mp.c, $$0))));
   }

   private void f(daa $$0, ajh $$1, ajh $$2) {
      this.b.accept(ml.a($$0).a(mm.a(dnp.ae).a(dnv.b, mo.a().a(mp.c, $$2)).a(dnv.a, mo.a().a(mp.c, $$1))));
   }

   private void n(daa $$0) {
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
                  mm.a(dnp.ag)
                     .a(dod.a, mo.a().a(mp.c, $$3))
                     .a(dod.b, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
                     .a(dod.c, mo.a().a(mp.c, $$5).a(mp.b, mp.a.b))
                     .a(dod.d, mo.a().a(mp.c, $$6).a(mp.b, mp.a.b))
                     .a(dod.e, mo.a().a(mp.c, $$5))
                     .a(dod.f, mo.a().a(mp.c, $$6))
                     .a(dod.g, mo.a().a(mp.c, $$4))
                     .a(dod.h, mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
                     .a(dod.i, mo.a().a(mp.c, $$4).a(mp.b, mp.a.c))
                     .a(dod.j, mo.a().a(mp.c, $$4).a(mp.b, mp.a.d))
               )
         );
   }

   private void o(daa $$0) {
      ajh $$1 = this.a($$0, "", mv.as, mw::e);
      ajh $$2 = this.a($$0, "", mv.au, mw::e);
      ajh $$3 = this.a($$0, "", mv.av, mw::e);
      ajh $$4 = this.a($$0, "_on", mv.as, mw::e);
      ajh $$5 = this.a($$0, "_on", mv.au, mw::e);
      ajh $$6 = this.a($$0, "_on", mv.av, mw::e);
      mm $$7 = mm.a(dnp.w, dnp.ah).a(($$6x, $$7x) -> {
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

   private mf.a a(ajh $$0, daa $$1) {
      return new mf.a($$0, $$1);
   }

   private mf.a f(daa $$0, daa $$1) {
      return new mf.a(mt.a($$0), $$1);
   }

   private void a(daa $$0, cqf $$1) {
      ajh $$2 = mv.aa.a($$0, mw.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(daa $$0, ajh $$1) {
      ajh $$2 = mv.aa.a($$0, mw.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(daa $$0, daa $$1) {
      this.a($$0);
      ajh $$2 = my.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(daa $$0) {
      this.a($$0.l());
      ajh $$1 = my.k.create($$0, this.c);
      ajh $$2 = my.l.create($$0, this.c);
      ajh $$3 = my.m.create($$0, this.c);
      ajh $$4 = my.n.create($$0, this.c);
      this.b
         .accept(
            mk.a($$0)
               .a(mj.a().a(dnp.S, 1, 2, 3, 4).a(dnp.R, ih.c), mo.a().a(mp.c, $$1))
               .a(mj.a().a(dnp.S, 1, 2, 3, 4).a(dnp.R, ih.f), mo.a().a(mp.c, $$1).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.S, 1, 2, 3, 4).a(dnp.R, ih.d), mo.a().a(mp.c, $$1).a(mp.b, mp.a.c))
               .a(mj.a().a(dnp.S, 1, 2, 3, 4).a(dnp.R, ih.e), mo.a().a(mp.c, $$1).a(mp.b, mp.a.d))
               .a(mj.a().a(dnp.S, 2, 3, 4).a(dnp.R, ih.c), mo.a().a(mp.c, $$2))
               .a(mj.a().a(dnp.S, 2, 3, 4).a(dnp.R, ih.f), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.S, 2, 3, 4).a(dnp.R, ih.d), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c))
               .a(mj.a().a(dnp.S, 2, 3, 4).a(dnp.R, ih.e), mo.a().a(mp.c, $$2).a(mp.b, mp.a.d))
               .a(mj.a().a(dnp.S, 3, 4).a(dnp.R, ih.c), mo.a().a(mp.c, $$3))
               .a(mj.a().a(dnp.S, 3, 4).a(dnp.R, ih.f), mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.S, 3, 4).a(dnp.R, ih.d), mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               .a(mj.a().a(dnp.S, 3, 4).a(dnp.R, ih.e), mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
               .a(mj.a().a(dnp.S, 4).a(dnp.R, ih.c), mo.a().a(mp.c, $$4))
               .a(mj.a().a(dnp.S, 4).a(dnp.R, ih.f), mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.S, 4).a(dnp.R, ih.d), mo.a().a(mp.c, $$4).a(mp.b, mp.a.c))
               .a(mj.a().a(dnp.S, 4).a(dnp.R, ih.e), mo.a().a(mp.c, $$4).a(mp.b, mp.a.d))
         );
   }

   private void a(my.a $$0, daa... $$1) {
      for (daa $$2 : $$1) {
         ajh $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(my.a $$0, daa... $$1) {
      for (daa $$2 : $$1) {
         ajh $$3 = $$0.create($$2, this.c);
         this.b.accept(ml.a($$2, mo.a().a(mp.c, $$3)).a(c()));
      }
   }

   private void h(daa $$0, daa $$1) {
      this.a($$0);
      mw $$2 = mw.b($$0, $$1);
      ajh $$3 = mv.aI.a($$1, $$2, this.c);
      ajh $$4 = mv.aJ.a($$1, $$2, this.c);
      ajh $$5 = mv.aK.a($$1, $$2, this.c);
      ajh $$6 = mv.aG.a($$1, $$2, this.c);
      ajh $$7 = mv.aH.a($$1, $$2, this.c);
      cqf $$8 = $$1.l();
      mv.bx.a(mt.a($$8), mw.F($$0), this.c);
      this.b
         .accept(
            mk.a($$1)
               .a(mo.a().a(mp.c, $$3))
               .a(mj.a().a(dnp.L, true), mo.a().a(mp.c, $$4))
               .a(mj.a().a(dnp.M, true), mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.N, true), mo.a().a(mp.c, $$5))
               .a(mj.a().a(dnp.O, true), mo.a().a(mp.c, $$5).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.L, false), mo.a().a(mp.c, $$6))
               .a(mj.a().a(dnp.M, false), mo.a().a(mp.c, $$7))
               .a(mj.a().a(dnp.N, false), mo.a().a(mp.c, $$7).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.O, false), mo.a().a(mp.c, $$6).a(mp.b, mp.a.d))
         );
   }

   private void q(daa $$0) {
      mw $$1 = mw.z($$0);
      ajh $$2 = mv.aL.a($$0, $$1, this.c);
      ajh $$3 = this.a($$0, "_conditional", mv.aL, $$1x -> $$1.c(mx.i, $$1x));
      this.b.accept(ml.a($$0).a(a(dnp.c, $$3, $$2)).a(e()));
   }

   private void r(daa $$0) {
      ajh $$1 = my.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<mo> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> mo.a().a(mp.c, mt.a(dac.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dac.mZ);
      this.b
         .accept(
            mk.a(dac.mZ)
               .a(mj.a().a(dnp.aq, 0), this.a(0))
               .a(mj.a().a(dnp.aq, 1), this.a(1))
               .a(mj.a().a(dnp.bk, dnl.b), mo.a().a(mp.c, mt.a(dac.mZ, "_small_leaves")))
               .a(mj.a().a(dnp.bk, dnl.c), mo.a().a(mp.c, mt.a(dac.mZ, "_large_leaves")))
         );
   }

   private mm n() {
      return mm.a(dnp.P)
         .a(ih.a, mo.a().a(mp.a, mp.a.c))
         .a(ih.b, mo.a())
         .a(ih.c, mo.a().a(mp.a, mp.a.b))
         .a(ih.d, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.c))
         .a(ih.e, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.d))
         .a(ih.f, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.b));
   }

   private void o() {
      ajh $$0 = mw.a(dac.nU, "_top_open");
      this.b
         .accept(
            ml.a(dac.nU)
               .a(this.n())
               .a(
                  mm.a(dnp.u)
                     .a(false, mo.a().a(mp.c, my.f.create(dac.nU, this.c)))
                     .a(true, mo.a().a(mp.c, my.f.get(dac.nU).a($$1 -> $$1.a(mx.f, $$0)).a(dac.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mm a(doc<T> $$0, T $$1, ajh $$2, ajh $$3) {
      mo $$4 = mo.a().a(mp.c, $$2);
      mo $$5 = mo.a().a(mp.c, $$3);
      return mm.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(daa $$0, Function<daa, mw> $$1) {
      mw $$2 = $$1.apply($$0).b(mx.i, mx.c);
      mw $$3 = $$2.c(mx.g, mw.a($$0, "_front_honey"));
      ajh $$4 = mv.q.a($$0, $$2, this.c);
      ajh $$5 = mv.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(ml.a($$0).a(b()).a(a(dnp.aN, 5, $$5, $$4)));
   }

   private void a(daa $$0, doc<Integer> $$1, int... $$2) {
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
      ajh $$0 = mt.a(dac.od, "_floor");
      ajh $$1 = mt.a(dac.od, "_ceiling");
      ajh $$2 = mt.a(dac.od, "_wall");
      ajh $$3 = mt.a(dac.od, "_between_walls");
      this.a(cqn.wj);
      this.b
         .accept(
            ml.a(dac.od)
               .a(
                  mm.a(dnp.R, dnp.V)
                     .a(ih.c, dnn.a, mo.a().a(mp.c, $$0))
                     .a(ih.d, dnn.a, mo.a().a(mp.c, $$0).a(mp.b, mp.a.c))
                     .a(ih.f, dnn.a, mo.a().a(mp.c, $$0).a(mp.b, mp.a.b))
                     .a(ih.e, dnn.a, mo.a().a(mp.c, $$0).a(mp.b, mp.a.d))
                     .a(ih.c, dnn.b, mo.a().a(mp.c, $$1))
                     .a(ih.d, dnn.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c))
                     .a(ih.f, dnn.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b))
                     .a(ih.e, dnn.b, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d))
                     .a(ih.c, dnn.c, mo.a().a(mp.c, $$2).a(mp.b, mp.a.d))
                     .a(ih.d, dnn.c, mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
                     .a(ih.f, dnn.c, mo.a().a(mp.c, $$2))
                     .a(ih.e, dnn.c, mo.a().a(mp.c, $$2).a(mp.b, mp.a.c))
                     .a(ih.d, dnn.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
                     .a(ih.c, dnn.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.d))
                     .a(ih.f, dnn.d, mo.a().a(mp.c, $$3))
                     .a(ih.e, dnn.d, mo.a().a(mp.c, $$3).a(mp.b, mp.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            ml.a(dac.nZ, mo.a().a(mp.c, mt.a(dac.nZ)))
               .a(
                  mm.a(dnp.U, dnp.R)
                     .a(dnk.a, ih.c, mo.a())
                     .a(dnk.a, ih.f, mo.a().a(mp.b, mp.a.b))
                     .a(dnk.a, ih.d, mo.a().a(mp.b, mp.a.c))
                     .a(dnk.a, ih.e, mo.a().a(mp.b, mp.a.d))
                     .a(dnk.b, ih.c, mo.a().a(mp.a, mp.a.b))
                     .a(dnk.b, ih.f, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.b))
                     .a(dnk.b, ih.d, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.c))
                     .a(dnk.b, ih.e, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.d))
                     .a(dnk.c, ih.d, mo.a().a(mp.a, mp.a.c))
                     .a(dnk.c, ih.e, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.b))
                     .a(dnk.c, ih.c, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.c))
                     .a(dnk.c, ih.f, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.d))
               )
         );
   }

   private void d(daa $$0, my.a $$1) {
      ajh $$2 = $$1.create($$0, this.c);
      ajh $$3 = mw.a($$0, "_front_on");
      ajh $$4 = $$1.get($$0).a($$1x -> $$1x.a(mx.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(ml.a($$0).a(a(dnp.r, $$4, $$2)).a(b()));
   }

   private void a(daa... $$0) {
      ajh $$1 = mt.a("campfire_off");

      for (daa $$2 : $$0) {
         ajh $$3 = mv.bc.a($$2, mw.E($$2), this.c);
         this.a($$2.l());
         this.b.accept(ml.a($$2).a(a(dnp.r, $$3, $$1)).a(c()));
      }
   }

   private void s(daa $$0) {
      ajh $$1 = mv.bt.a($$0, mw.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(daa $$0) {
      ajh $$1;
      if ($$0 == dac.tj) {
         $$1 = mv.bv.a($$0, mw.m($$0), this.c);
      } else {
         $$1 = mv.bu.a($$0, mw.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mw $$0 = mw.a(mw.G(dac.cl), mw.G(dac.n));
      ajh $$1 = mv.j.a(dac.cl, $$0, this.c);
      this.b.accept(c(dac.cl, $$1));
   }

   private void s() {
      this.a(cqn.lG);
      this.b
         .accept(
            mk.a(dac.cw)
               .a(
                  mj.b(
                     mj.a().a(dnp.ab, doe.c).a(dnp.aa, doe.c).a(dnp.ac, doe.c).a(dnp.ad, doe.c),
                     mj.a().a(dnp.ab, doe.b, doe.a).a(dnp.aa, doe.b, doe.a),
                     mj.a().a(dnp.aa, doe.b, doe.a).a(dnp.ac, doe.b, doe.a),
                     mj.a().a(dnp.ac, doe.b, doe.a).a(dnp.ad, doe.b, doe.a),
                     mj.a().a(dnp.ad, doe.b, doe.a).a(dnp.ab, doe.b, doe.a)
                  ),
                  mo.a().a(mp.c, mt.a("redstone_dust_dot"))
               )
               .a(mj.a().a(dnp.ab, doe.b, doe.a), mo.a().a(mp.c, mt.a("redstone_dust_side0")))
               .a(mj.a().a(dnp.ac, doe.b, doe.a), mo.a().a(mp.c, mt.a("redstone_dust_side_alt0")))
               .a(mj.a().a(dnp.aa, doe.b, doe.a), mo.a().a(mp.c, mt.a("redstone_dust_side_alt1")).a(mp.b, mp.a.d))
               .a(mj.a().a(dnp.ad, doe.b, doe.a), mo.a().a(mp.c, mt.a("redstone_dust_side1")).a(mp.b, mp.a.d))
               .a(mj.a().a(dnp.ab, doe.a), mo.a().a(mp.c, mt.a("redstone_dust_up")))
               .a(mj.a().a(dnp.aa, doe.a), mo.a().a(mp.c, mt.a("redstone_dust_up")).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.ac, doe.a), mo.a().a(mp.c, mt.a("redstone_dust_up")).a(mp.b, mp.a.c))
               .a(mj.a().a(dnp.ad, doe.a), mo.a().a(mp.c, mt.a("redstone_dust_up")).a(mp.b, mp.a.d))
         );
   }

   private void t() {
      this.a(cqn.lK);
      this.b
         .accept(
            ml.a(dac.gY)
               .a(c())
               .a(
                  mm.a(dnp.bd, dnp.w)
                     .a(dns.a, false, mo.a().a(mp.c, mt.a(dac.gY)))
                     .a(dns.a, true, mo.a().a(mp.c, mt.a(dac.gY, "_on")))
                     .a(dns.b, false, mo.a().a(mp.c, mt.a(dac.gY, "_subtract")))
                     .a(dns.b, true, mo.a().a(mp.c, mt.a(dac.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mw $$0 = mw.a(dac.jR);
      mw $$1 = mw.a(mw.a(dac.jE, "_side"), $$0.a(mx.f));
      ajh $$2 = mv.ab.a(dac.jE, $$1, this.c);
      ajh $$3 = mv.ac.a(dac.jE, $$1, this.c);
      ajh $$4 = mv.j.b(dac.jE, "_double", $$1, this.c);
      this.b.accept(e(dac.jE, $$2, $$3, $$4));
      this.b.accept(c(dac.jR, mv.c.a(dac.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cqn.sp);
      this.b
         .accept(
            mk.a(dac.fs)
               .a(mo.a().a(mp.c, mw.G(dac.fs)))
               .a(mj.a().a(dnp.k, true), mo.a().a(mp.c, mw.a(dac.fs, "_bottle0")))
               .a(mj.a().a(dnp.l, true), mo.a().a(mp.c, mw.a(dac.fs, "_bottle1")))
               .a(mj.a().a(dnp.m, true), mo.a().a(mp.c, mw.a(dac.fs, "_bottle2")))
               .a(mj.a().a(dnp.k, false), mo.a().a(mp.c, mw.a(dac.fs, "_empty0")))
               .a(mj.a().a(dnp.l, false), mo.a().a(mp.c, mw.a(dac.fs, "_empty1")))
               .a(mj.a().a(dnp.m, false), mo.a().a(mp.c, mw.a(dac.fs, "_empty2")))
         );
   }

   private void u(daa $$0) {
      ajh $$1 = mv.bp.a($$0, mw.b($$0), this.c);
      ajh $$2 = mt.a("mushroom_block_inside");
      this.b
         .accept(
            mk.a($$0)
               .a(mj.a().a(dnp.L, true), mo.a().a(mp.c, $$1))
               .a(mj.a().a(dnp.M, true), mo.a().a(mp.c, $$1).a(mp.b, mp.a.b).a(mp.d, true))
               .a(mj.a().a(dnp.N, true), mo.a().a(mp.c, $$1).a(mp.b, mp.a.c).a(mp.d, true))
               .a(mj.a().a(dnp.O, true), mo.a().a(mp.c, $$1).a(mp.b, mp.a.d).a(mp.d, true))
               .a(mj.a().a(dnp.J, true), mo.a().a(mp.c, $$1).a(mp.a, mp.a.d).a(mp.d, true))
               .a(mj.a().a(dnp.K, true), mo.a().a(mp.c, $$1).a(mp.a, mp.a.b).a(mp.d, true))
               .a(mj.a().a(dnp.L, false), mo.a().a(mp.c, $$2))
               .a(mj.a().a(dnp.M, false), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, false))
               .a(mj.a().a(dnp.N, false), mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, false))
               .a(mj.a().a(dnp.O, false), mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, false))
               .a(mj.a().a(dnp.J, false), mo.a().a(mp.c, $$2).a(mp.a, mp.a.d).a(mp.d, false))
               .a(mj.a().a(dnp.K, false), mo.a().a(mp.c, $$2).a(mp.a, mp.a.b).a(mp.d, false))
         );
      this.a($$0, my.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cqn.rA);
      this.b
         .accept(
            ml.a(dac.eg)
               .a(
                  mm.a(dnp.ay)
                     .a(0, mo.a().a(mp.c, mt.a(dac.eg)))
                     .a(1, mo.a().a(mp.c, mt.a(dac.eg, "_slice1")))
                     .a(2, mo.a().a(mp.c, mt.a(dac.eg, "_slice2")))
                     .a(3, mo.a().a(mp.c, mt.a(dac.eg, "_slice3")))
                     .a(4, mo.a().a(mp.c, mt.a(dac.eg, "_slice4")))
                     .a(5, mo.a().a(mp.c, mt.a(dac.eg, "_slice5")))
                     .a(6, mo.a().a(mp.c, mt.a(dac.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mw $$0 = new mw()
         .a(mx.c, mw.a(dac.nX, "_side3"))
         .a(mx.o, mw.G(dac.t))
         .a(mx.n, mw.a(dac.nX, "_top"))
         .a(mx.j, mw.a(dac.nX, "_side3"))
         .a(mx.l, mw.a(dac.nX, "_side3"))
         .a(mx.k, mw.a(dac.nX, "_side1"))
         .a(mx.m, mw.a(dac.nX, "_side2"));
      this.b.accept(c(dac.nX, mv.a.a(dac.nX, $$0, this.c)));
   }

   private void y() {
      mw $$0 = new mw()
         .a(mx.c, mw.a(dac.ob, "_front"))
         .a(mx.o, mw.a(dac.ob, "_bottom"))
         .a(mx.n, mw.a(dac.ob, "_top"))
         .a(mx.j, mw.a(dac.ob, "_front"))
         .a(mx.k, mw.a(dac.ob, "_front"))
         .a(mx.l, mw.a(dac.ob, "_side"))
         .a(mx.m, mw.a(dac.ob, "_side"));
      this.b.accept(c(dac.ob, mv.a.a(dac.ob, $$0, this.c)));
   }

   private void a(daa $$0, daa $$1, BiFunction<daa, daa, mw> $$2) {
      mw $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mv.a.a($$0, $$3, this.c)));
   }

   public void b(daa $$0) {
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
      mw $$0 = mw.k(dac.eZ);
      this.b.accept(c(dac.eZ, mt.a(dac.eZ)));
      this.a(dac.ee, $$0);
      this.a(dac.ef, $$0);
   }

   private void a(daa $$0, mw $$1) {
      ajh $$2 = mv.p.a($$0, $$1.c(mx.g, mw.G($$0)), this.c);
      this.b.accept(ml.a($$0, mo.a().a(mp.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cqn.sq);
      this.m(dac.ft);
      this.b.accept(c(dac.fv, mv.bs.a(dac.fv, mw.j(mw.a(dac.H, "_still")), this.c)));
      this.b
         .accept(
            ml.a(dac.fu)
               .a(
                  mm.a(dei.g)
                     .a(1, mo.a().a(mp.c, mv.bq.a(dac.fu, "_level1", mw.j(mw.a(dac.G, "_still")), this.c)))
                     .a(2, mo.a().a(mp.c, mv.br.a(dac.fu, "_level2", mw.j(mw.a(dac.G, "_still")), this.c)))
                     .a(3, mo.a().a(mp.c, mv.bs.a(dac.fu, "_full", mw.j(mw.a(dac.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            ml.a(dac.fw)
               .a(
                  mm.a(dei.g)
                     .a(1, mo.a().a(mp.c, mv.bq.a(dac.fw, "_level1", mw.j(mw.G(dac.qP)), this.c)))
                     .a(2, mo.a().a(mp.c, mv.br.a(dac.fw, "_level2", mw.j(mw.G(dac.qP)), this.c)))
                     .a(3, mo.a().a(mp.c, mv.bs.a(dac.fw, "_full", mw.j(mw.G(dac.qP)), this.c)))
               )
         );
   }

   private void B() {
      mw $$0 = mw.b(dac.kv);
      ajh $$1 = mv.aE.a(dac.kv, $$0, this.c);
      ajh $$2 = this.a(dac.kv, "_dead", mv.aE, $$1x -> $$0.c(mx.b, $$1x));
      this.b.accept(ml.a(dac.kv).a(a(dnp.au, 5, $$2, $$1)));
   }

   private void C() {
      ajh $$0 = mt.a(dac.tq);
      ajh $$1 = mt.a(dac.tq, "_triggered");
      ajh $$2 = mt.a(dac.tq, "_crafting");
      ajh $$3 = mt.a(dac.tq, "_crafting_triggered");
      this.b
         .accept(
            ml.a(dac.tq)
               .a(mm.a(dnp.T).a($$0x -> this.a($$0x, mo.a())))
               .a(
                  mm.a(dnp.A, dbt.b)
                     .a(false, false, mo.a().a(mp.c, $$0))
                     .a(true, true, mo.a().a(mp.c, $$3))
                     .a(true, false, mo.a().a(mp.c, $$1))
                     .a(false, true, mo.a().a(mp.c, $$2))
               )
         );
   }

   private void v(daa $$0) {
      mw $$1 = new mw().a(mx.f, mw.a(dac.cD, "_top")).a(mx.i, mw.a(dac.cD, "_side")).a(mx.g, mw.a($$0, "_front"));
      mw $$2 = new mw().a(mx.i, mw.a(dac.cD, "_top")).a(mx.g, mw.a($$0, "_front_vertical"));
      ajh $$3 = mv.p.a($$0, $$1, this.c);
      ajh $$4 = mv.r.a($$0, $$2, this.c);
      this.b
         .accept(
            ml.a($$0)
               .a(
                  mm.a(dnp.P)
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
      ajh $$0 = mt.a(dac.fy);
      ajh $$1 = mt.a(dac.fy, "_filled");
      this.b.accept(ml.a(dac.fy).a(mm.a(dnp.h).a(false, mo.a().a(mp.c, $$0)).a(true, mo.a().a(mp.c, $$1))).a(c()));
   }

   private void E() {
      ajh $$0 = mt.a(dac.ku, "_side");
      ajh $$1 = mt.a(dac.ku, "_noside");
      ajh $$2 = mt.a(dac.ku, "_noside1");
      ajh $$3 = mt.a(dac.ku, "_noside2");
      ajh $$4 = mt.a(dac.ku, "_noside3");
      this.b
         .accept(
            mk.a(dac.ku)
               .a(mj.a().a(dnp.L, true), mo.a().a(mp.c, $$0))
               .a(mj.a().a(dnp.M, true), mo.a().a(mp.c, $$0).a(mp.b, mp.a.b).a(mp.d, true))
               .a(mj.a().a(dnp.N, true), mo.a().a(mp.c, $$0).a(mp.b, mp.a.c).a(mp.d, true))
               .a(mj.a().a(dnp.O, true), mo.a().a(mp.c, $$0).a(mp.b, mp.a.d).a(mp.d, true))
               .a(mj.a().a(dnp.J, true), mo.a().a(mp.c, $$0).a(mp.a, mp.a.d).a(mp.d, true))
               .a(mj.a().a(dnp.K, true), mo.a().a(mp.c, $$0).a(mp.a, mp.a.b).a(mp.d, true))
               .a(mj.a().a(dnp.L, false), mo.a().a(mp.c, $$1).a(mp.e, 2), mo.a().a(mp.c, $$2), mo.a().a(mp.c, $$3), mo.a().a(mp.c, $$4))
               .a(
                  mj.a().a(dnp.M, false),
                  mo.a().a(mp.c, $$2).a(mp.b, mp.a.b).a(mp.d, true),
                  mo.a().a(mp.c, $$3).a(mp.b, mp.a.b).a(mp.d, true),
                  mo.a().a(mp.c, $$4).a(mp.b, mp.a.b).a(mp.d, true),
                  mo.a().a(mp.c, $$1).a(mp.e, 2).a(mp.b, mp.a.b).a(mp.d, true)
               )
               .a(
                  mj.a().a(dnp.N, false),
                  mo.a().a(mp.c, $$3).a(mp.b, mp.a.c).a(mp.d, true),
                  mo.a().a(mp.c, $$4).a(mp.b, mp.a.c).a(mp.d, true),
                  mo.a().a(mp.c, $$1).a(mp.e, 2).a(mp.b, mp.a.c).a(mp.d, true),
                  mo.a().a(mp.c, $$2).a(mp.b, mp.a.c).a(mp.d, true)
               )
               .a(
                  mj.a().a(dnp.O, false),
                  mo.a().a(mp.c, $$4).a(mp.b, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$1).a(mp.e, 2).a(mp.b, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$2).a(mp.b, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$3).a(mp.b, mp.a.d).a(mp.d, true)
               )
               .a(
                  mj.a().a(dnp.J, false),
                  mo.a().a(mp.c, $$1).a(mp.e, 2).a(mp.a, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$4).a(mp.a, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$2).a(mp.a, mp.a.d).a(mp.d, true),
                  mo.a().a(mp.c, $$3).a(mp.a, mp.a.d).a(mp.d, true)
               )
               .a(
                  mj.a().a(dnp.K, false),
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
            mk.a(dac.pc)
               .a(mo.a().a(mp.c, mw.G(dac.pc)))
               .a(mj.a().a(dnp.aL, 1), mo.a().a(mp.c, mw.a(dac.pc, "_contents1")))
               .a(mj.a().a(dnp.aL, 2), mo.a().a(mp.c, mw.a(dac.pc, "_contents2")))
               .a(mj.a().a(dnp.aL, 3), mo.a().a(mp.c, mw.a(dac.pc, "_contents3")))
               .a(mj.a().a(dnp.aL, 4), mo.a().a(mp.c, mw.a(dac.pc, "_contents4")))
               .a(mj.a().a(dnp.aL, 5), mo.a().a(mp.c, mw.a(dac.pc, "_contents5")))
               .a(mj.a().a(dnp.aL, 6), mo.a().a(mp.c, mw.a(dac.pc, "_contents6")))
               .a(mj.a().a(dnp.aL, 7), mo.a().a(mp.c, mw.a(dac.pc, "_contents7")))
               .a(mj.a().a(dnp.aL, 8), mo.a().a(mp.c, mw.a(dac.pc, "_contents_ready")))
         );
   }

   private void w(daa $$0) {
      ajh $$1 = mv.c.a($$0, mw.a($$0), this.c);
      ajh $$2 = this.a($$0, "_powered", mv.c, mw::b);
      ajh $$3 = this.a($$0, "_lit", mv.c, mw::b);
      ajh $$4 = this.a($$0, "_lit_powered", mv.c, mw::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private mi a(daa $$0, ajh $$1, ajh $$2, ajh $$3, ajh $$4) {
      return ml.a($$0).a(mm.a(dnp.r, dnp.w).a(($$4x, $$5) -> $$4x ? mo.a().a(mp.c, $$5 ? $$4 : $$2) : mo.a().a(mp.c, $$5 ? $$3 : $$1)));
   }

   private void i(daa $$0, daa $$1) {
      ajh $$2 = mt.a($$0);
      ajh $$3 = mt.a($$0, "_powered");
      ajh $$4 = mt.a($$0, "_lit");
      ajh $$5 = mt.a($$0, "_lit_powered");
      this.a($$1, mt.a($$0.l()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(daa $$0) {
      this.c($$0);
      this.b.accept(ml.a($$0, mo.a().a(mp.c, mv.ao.a($$0, mw.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dac.qy);
      this.x(dac.qx);
      this.x(dac.qw);
      this.x(dac.qv);
   }

   private void H() {
      this.c(dac.st);
      mm.b<ih, dnw> $$0 = mm.a(dnp.bm, dnp.bn);

      for (dnw $$1 : dnw.values()) {
         $$0.a(ih.b, $$1, this.a(ih.b, $$1));
      }

      for (dnw $$2 : dnw.values()) {
         $$0.a(ih.a, $$2, this.a(ih.a, $$2));
      }

      this.b.accept(ml.a(dac.st).a($$0));
   }

   private mo a(ih $$0, dnw $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mw $$3 = mw.c(mw.a(dac.st, $$2));
      return mo.a().a(mp.c, mv.an.a(dac.st, $$2, $$3, this.c));
   }

   private void y(daa $$0) {
      mw $$1 = new mw().a(mx.e, mw.G(dac.dV)).a(mx.f, mw.G($$0)).a(mx.i, mw.a($$0, "_side"));
      this.b.accept(c($$0, mv.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ajh $$0 = mw.a(dac.gZ, "_side");
      mw $$1 = new mw().a(mx.f, mw.a(dac.gZ, "_top")).a(mx.i, $$0);
      mw $$2 = new mw().a(mx.f, mw.a(dac.gZ, "_inverted_top")).a(mx.i, $$0);
      this.b
         .accept(
            ml.a(dac.gZ)
               .a(mm.a(dnp.p).a(false, mo.a().a(mp.c, mv.aF.a(dac.gZ, $$1, this.c))).a(true, mo.a().a(mp.c, mv.aF.a(mt.a(dac.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(daa $$0) {
      this.b.accept(ml.a($$0, mo.a().a(mp.c, mt.a($$0))).a(this.n()));
   }

   private void J() {
      daa $$0 = dac.ss;
      ajh $$1 = mt.a($$0, "_on");
      ajh $$2 = mt.a($$0);
      this.b.accept(ml.a($$0, mo.a().a(mp.c, mt.a($$0))).a(this.n()).a(a(dnp.w, $$1, $$2)));
   }

   private void K() {
      mw $$0 = new mw().a(mx.B, mw.G(dac.j)).a(mx.f, mw.G(dac.cC));
      mw $$1 = new mw().a(mx.B, mw.G(dac.j)).a(mx.f, mw.a(dac.cC, "_moist"));
      ajh $$2 = mv.aW.a(dac.cC, $$0, this.c);
      ajh $$3 = mv.aW.a(mw.a(dac.cC, "_moist"), $$1, this.c);
      this.b.accept(ml.a(dac.cC).a(a(dnp.aQ, 7, $$3, $$2)));
   }

   private List<ajh> A(daa $$0) {
      ajh $$1 = mv.aX.a(mt.a($$0, "_floor0"), mw.v($$0), this.c);
      ajh $$2 = mv.aX.a(mt.a($$0, "_floor1"), mw.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ajh> B(daa $$0) {
      ajh $$1 = mv.aY.a(mt.a($$0, "_side0"), mw.v($$0), this.c);
      ajh $$2 = mv.aY.a(mt.a($$0, "_side1"), mw.w($$0), this.c);
      ajh $$3 = mv.aZ.a(mt.a($$0, "_side_alt0"), mw.v($$0), this.c);
      ajh $$4 = mv.aZ.a(mt.a($$0, "_side_alt1"), mw.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ajh> C(daa $$0) {
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
      mj $$0 = mj.a().a(dnp.L, false).a(dnp.M, false).a(dnp.N, false).a(dnp.O, false).a(dnp.J, false);
      List<ajh> $$1 = this.A(dac.cr);
      List<ajh> $$2 = this.B(dac.cr);
      List<ajh> $$3 = this.C(dac.cr);
      this.b
         .accept(
            mk.a(dac.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(mj.b(mj.a().a(dnp.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(mj.b(mj.a().a(dnp.M, true), $$0), a($$2, $$0x -> $$0x.a(mp.b, mp.a.b)))
               .a(mj.b(mj.a().a(dnp.N, true), $$0), a($$2, $$0x -> $$0x.a(mp.b, mp.a.c)))
               .a(mj.b(mj.a().a(dnp.O, true), $$0), a($$2, $$0x -> $$0x.a(mp.b, mp.a.d)))
               .a(mj.a().a(dnp.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ajh> $$0 = this.A(dac.cs);
      List<ajh> $$1 = this.B(dac.cs);
      this.b
         .accept(
            mk.a(dac.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mp.b, mp.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mp.b, mp.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mp.b, mp.a.d)))
         );
   }

   private void D(daa $$0) {
      ajh $$1 = my.t.create($$0, this.c);
      ajh $$2 = my.u.create($$0, this.c);
      this.a($$0.l());
      this.b.accept(ml.a($$0).a(a(dnp.j, $$2, $$1)));
   }

   private void N() {
      mw $$0 = mw.a(mw.a(dac.ad, "_side"), mw.a(dac.ad, "_top"));
      ajh $$1 = mv.j.a(dac.ad, $$0, this.c);
      this.b.accept(d(dac.ad, $$1));
   }

   private void O() {
      this.a(cqn.ad);
      daa $$0 = dac.E;
      mm.b<Boolean, Integer> $$1 = mm.a(deu.d, deu.b);
      ajh $$2 = mt.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ajh $$4 = mt.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, mo.a().a(mp.c, $$4));
         $$1.a(false, $$3, mo.a().a(mp.c, $$2));
      }

      this.b.accept(ml.a(dac.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            ml.a(dac.kI)
               .a(
                  mm.a(dnp.as)
                     .a(0, mo.a().a(mp.c, this.a(dac.kI, "_0", mv.c, mw::b)))
                     .a(1, mo.a().a(mp.c, this.a(dac.kI, "_1", mv.c, mw::b)))
                     .a(2, mo.a().a(mp.c, this.a(dac.kI, "_2", mv.c, mw::b)))
                     .a(3, mo.a().a(mp.c, this.a(dac.kI, "_3", mv.c, mw::b)))
               )
         );
   }

   private void Q() {
      ajh $$0 = mw.G(dac.j);
      mw $$1 = new mw().a(mx.e, $$0).b(mx.e, mx.c).a(mx.f, mw.a(dac.i, "_top")).a(mx.i, mw.a(dac.i, "_snow"));
      mo $$2 = mo.a().a(mp.c, mv.n.a(dac.i, "_snow", $$1, this.c));
      this.a(dac.i, mt.a(dac.i), $$2);
      ajh $$3 = my.f.get(dac.fl).a($$1x -> $$1x.a(mx.e, $$0)).a(dac.fl, this.c);
      this.a(dac.fl, $$3, $$2);
      ajh $$4 = my.f.get(dac.l).a($$1x -> $$1x.a(mx.e, $$0)).a(dac.l, this.c);
      this.a(dac.l, $$4, $$2);
   }

   private void a(daa $$0, ajh $$1, mo $$2) {
      List<mo> $$3 = Arrays.asList(a($$1));
      this.b.accept(ml.a($$0).a(mm.a(dnp.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cqn.rg);
      this.b
         .accept(
            ml.a(dac.fC)
               .a(
                  mm.a(dnp.ar)
                     .a(0, mo.a().a(mp.c, mt.a(dac.fC, "_stage0")))
                     .a(1, mo.a().a(mp.c, mt.a(dac.fC, "_stage1")))
                     .a(2, mo.a().a(mp.c, mt.a(dac.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dac.kE, mt.a(dac.kE)));
   }

   private void j(daa $$0, daa $$1) {
      mw $$2 = mw.b($$1);
      ajh $$3 = mv.Y.a($$0, $$2, this.c);
      ajh $$4 = mv.Z.a($$0, $$2, this.c);
      this.b.accept(ml.a($$0).a(a(dnp.aT, 1, $$4, $$3)));
   }

   private void T() {
      ajh $$0 = mt.a(dac.hc);
      ajh $$1 = mt.a(dac.hc, "_side");
      this.a(cqn.lQ);
      this.b
         .accept(
            ml.a(dac.hc)
               .a(
                  mm.a(dnp.Q)
                     .a(ih.a, mo.a().a(mp.c, $$0))
                     .a(ih.c, mo.a().a(mp.c, $$1))
                     .a(ih.f, mo.a().a(mp.c, $$1).a(mp.b, mp.a.b))
                     .a(ih.d, mo.a().a(mp.c, $$1).a(mp.b, mp.a.c))
                     .a(ih.e, mo.a().a(mp.c, $$1).a(mp.b, mp.a.d))
               )
         );
   }

   private void k(daa $$0, daa $$1) {
      ajh $$2 = mt.a($$0);
      this.b.accept(ml.a($$1, mo.a().a(mp.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ajh $$0 = mt.a(dac.eW, "_post_ends");
      ajh $$1 = mt.a(dac.eW, "_post");
      ajh $$2 = mt.a(dac.eW, "_cap");
      ajh $$3 = mt.a(dac.eW, "_cap_alt");
      ajh $$4 = mt.a(dac.eW, "_side");
      ajh $$5 = mt.a(dac.eW, "_side_alt");
      this.b
         .accept(
            mk.a(dac.eW)
               .a(mo.a().a(mp.c, $$0))
               .a(mj.a().a(dnp.L, false).a(dnp.M, false).a(dnp.N, false).a(dnp.O, false), mo.a().a(mp.c, $$1))
               .a(mj.a().a(dnp.L, true).a(dnp.M, false).a(dnp.N, false).a(dnp.O, false), mo.a().a(mp.c, $$2))
               .a(mj.a().a(dnp.L, false).a(dnp.M, true).a(dnp.N, false).a(dnp.O, false), mo.a().a(mp.c, $$2).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.L, false).a(dnp.M, false).a(dnp.N, true).a(dnp.O, false), mo.a().a(mp.c, $$3))
               .a(mj.a().a(dnp.L, false).a(dnp.M, false).a(dnp.N, false).a(dnp.O, true), mo.a().a(mp.c, $$3).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.L, true), mo.a().a(mp.c, $$4))
               .a(mj.a().a(dnp.M, true), mo.a().a(mp.c, $$4).a(mp.b, mp.a.b))
               .a(mj.a().a(dnp.N, true), mo.a().a(mp.c, $$5))
               .a(mj.a().a(dnp.O, true), mo.a().a(mp.c, $$5).a(mp.b, mp.a.b))
         );
      this.d(dac.eW);
   }

   private void E(daa $$0) {
      this.b.accept(ml.a($$0, mo.a().a(mp.c, mt.a($$0))).a(b()));
   }

   private void V() {
      ajh $$0 = mt.a(dac.dw);
      ajh $$1 = mt.a(dac.dw, "_on");
      this.d(dac.dw);
      this.b
         .accept(
            ml.a(dac.dw)
               .a(a(dnp.w, $$0, $$1))
               .a(
                  mm.a(dnp.U, dnp.R)
                     .a(dnk.c, ih.c, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.c))
                     .a(dnk.c, ih.f, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.d))
                     .a(dnk.c, ih.d, mo.a().a(mp.a, mp.a.c))
                     .a(dnk.c, ih.e, mo.a().a(mp.a, mp.a.c).a(mp.b, mp.a.b))
                     .a(dnk.a, ih.c, mo.a())
                     .a(dnk.a, ih.f, mo.a().a(mp.b, mp.a.b))
                     .a(dnk.a, ih.d, mo.a().a(mp.b, mp.a.c))
                     .a(dnk.a, ih.e, mo.a().a(mp.b, mp.a.d))
                     .a(dnk.b, ih.c, mo.a().a(mp.a, mp.a.b))
                     .a(dnk.b, ih.f, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.b))
                     .a(dnk.b, ih.d, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.c))
                     .a(dnk.b, ih.e, mo.a().a(mp.a, mp.a.b).a(mp.b, mp.a.d))
               )
         );
   }

   private void W() {
      this.d(dac.fm);
      this.b.accept(b(dac.fm, mt.a(dac.fm)));
   }

   private void X() {
      this.d(dac.tn);
      this.b.accept(c(dac.tn, mt.a(dac.tn)));
   }

   private void Y() {
      this.b.accept(ml.a(dac.ed).a(mm.a(dnp.H).a(ih.a.a, mo.a().a(mp.c, mt.a(dac.ed, "_ns"))).a(ih.a.c, mo.a().a(mp.c, mt.a(dac.ed, "_ew")))));
   }

   private void Z() {
      ajh $$0 = my.a.create(dac.dV, this.c);
      this.b
         .accept(
            ml.a(
               dac.dV,
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
      ajh $$0 = mt.a(dac.kO);
      ajh $$1 = mt.a(dac.kO, "_on");
      this.b.accept(ml.a(dac.kO).a(a(dnp.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mw $$0 = new mw().a(mx.e, mw.a(dac.by, "_bottom")).a(mx.i, mw.a(dac.by, "_side"));
      ajh $$1 = mw.a(dac.by, "_top_sticky");
      ajh $$2 = mw.a(dac.by, "_top");
      mw $$3 = $$0.c(mx.E, $$1);
      mw $$4 = $$0.c(mx.E, $$2);
      ajh $$5 = mt.a(dac.by, "_base");
      this.a(dac.by, $$5, $$4);
      this.a(dac.br, $$5, $$3);
      ajh $$6 = mv.n.a(dac.by, "_inventory", $$0.c(mx.f, $$2), this.c);
      ajh $$7 = mv.n.a(dac.br, "_inventory", $$0.c(mx.f, $$1), this.c);
      this.a(dac.by, $$6);
      this.a(dac.br, $$7);
   }

   private void a(daa $$0, ajh $$1, mw $$2) {
      ajh $$3 = mv.bh.a($$0, $$2, this.c);
      this.b.accept(ml.a($$0).a(a(dnp.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mw $$0 = new mw().a(mx.F, mw.a(dac.by, "_top")).a(mx.i, mw.a(dac.by, "_side"));
      mw $$1 = $$0.c(mx.E, mw.a(dac.by, "_top_sticky"));
      mw $$2 = $$0.c(mx.E, mw.a(dac.by, "_top"));
      this.b
         .accept(
            ml.a(dac.bz)
               .a(
                  mm.a(dnp.x, dnp.bg)
                     .a(false, dob.a, mo.a().a(mp.c, mv.bi.a(dac.by, "_head", $$2, this.c)))
                     .a(false, dob.b, mo.a().a(mp.c, mv.bi.a(dac.by, "_head_sticky", $$1, this.c)))
                     .a(true, dob.a, mo.a().a(mp.c, mv.bj.a(dac.by, "_head_short", $$2, this.c)))
                     .a(true, dob.b, mo.a().a(mp.c, mv.bj.a(dac.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      daa $$0 = dac.tr;
      mw $$1 = mw.a($$0, "_side_inactive", "_top_inactive");
      mw $$2 = mw.a($$0, "_side_active", "_top_active");
      mw $$3 = mw.a($$0, "_side_active", "_top_ejecting_reward");
      ajh $$4 = mv.o.a($$0, $$1, this.c);
      ajh $$5 = mv.o.a($$0, "_active", $$2, this.c);
      ajh $$6 = mv.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(ml.a($$0).a(mm.a(dnp.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> mo.a().a(mp.c, $$4);
            case b, c, d -> mo.a().a(mp.c, $$5);
            case e -> mo.a().a(mp.c, $$6);
         };
      })));
   }

   private void ae() {
      daa $$0 = dac.ts;
      mw $$1 = mw.a($$0, "_front_off", "_side_off", "_top_off", "_bottom");
      mw $$2 = mw.a($$0, "_front_on", "_side_on", "_top_on", "_bottom");
      mw $$3 = mw.a($$0, "_front_ejecting", "_side_on", "_top_on", "_bottom");
      mw $$4 = mw.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ajh $$5 = mv.bN.a($$0, $$1, this.c);
      ajh $$6 = mv.bN.a($$0, "_active", $$2, this.c);
      ajh $$7 = mv.bN.a($$0, "_unlocking", $$3, this.c);
      ajh $$8 = mv.bN.a($$0, "_ejecting_reward", $$4, this.c);
      this.a($$0, $$5);
      this.b.accept(ml.a($$0).a(b()).a(mm.a(diu.b).a($$4x -> {
         return switch ($$4x) {
            case a -> mo.a().a(mp.c, $$5);
            case b -> mo.a().a(mp.c, $$6);
            case c -> mo.a().a(mp.c, $$7);
            case d -> mo.a().a(mp.c, $$8);
         };
      })));
   }

   private void af() {
      ajh $$0 = mt.a(dac.qQ, "_inactive");
      ajh $$1 = mt.a(dac.qQ, "_active");
      this.a(dac.qQ, $$0);
      this.b.accept(ml.a(dac.qQ).a(mm.a(dnp.bo).a($$2 -> mo.a().a(mp.c, $$2 != dog.b && $$2 != dog.c ? $$0 : $$1))));
   }

   private void ag() {
      ajh $$0 = mt.a(dac.qR, "_inactive");
      ajh $$1 = mt.a(dac.qR, "_active");
      this.a(dac.qR, $$0);
      this.b.accept(ml.a(dac.qR).a(mm.a(dnp.bo).a($$2 -> mo.a().a(mp.c, $$2 != dog.b && $$2 != dog.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      ajh $$0 = mv.bM.a(dac.qV, mw.a(false), this.c);
      ajh $$1 = mv.bM.a(dac.qV, "_can_summon", mw.a(true), this.c);
      this.a(dac.qV, $$0);
      this.b.accept(ml.a(dac.qV).a(a(dnp.G, $$1, $$0)));
   }

   private void ai() {
      ajh $$0 = mt.a(dac.nS, "_stable");
      ajh $$1 = mt.a(dac.nS, "_unstable");
      this.a(dac.nS, $$0);
      this.b.accept(ml.a(dac.nS).a(a(dnp.b, $$1, $$0)));
   }

   private void aj() {
      ajh $$0 = this.a(dac.sv, "", mv.ao, mw::c);
      ajh $$1 = this.a(dac.sv, "_lit", mv.ao, mw::c);
      this.b.accept(ml.a(dac.sv).a(a(dnp.D, $$1, $$0)));
      ajh $$2 = this.a(dac.sw, "", mv.ao, mw::c);
      ajh $$3 = this.a(dac.sw, "_lit", mv.ao, mw::c);
      this.b.accept(ml.a(dac.sw).a(a(dnp.D, $$3, $$2)));
   }

   private void ak() {
      ajh $$0 = my.a.create(dac.fB, this.c);
      ajh $$1 = this.a(dac.fB, "_on", mv.c, mw::b);
      this.b.accept(ml.a(dac.fB).a(a(dnp.r, $$1, $$0)));
   }

   private void l(daa $$0, daa $$1) {
      mw $$2 = mw.y($$0);
      this.b.accept(c($$0, mv.bf.a($$0, $$2, this.c)));
      this.b.accept(ml.a($$1, mo.a().a(mp.c, mv.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      mw $$0 = mw.y(dac.dK);
      mw $$1 = mw.i(mw.a(dac.dK, "_off"));
      ajh $$2 = mv.bf.a(dac.dK, $$0, this.c);
      ajh $$3 = mv.bf.a(dac.dK, "_off", $$1, this.c);
      this.b.accept(ml.a(dac.dK).a(a(dnp.r, $$2, $$3)));
      ajh $$4 = mv.bg.a(dac.dL, $$0, this.c);
      ajh $$5 = mv.bg.a(dac.dL, "_off", $$1, this.c);
      this.b.accept(ml.a(dac.dL).a(a(dnp.r, $$4, $$5)).a(d()));
      this.d(dac.dK);
      this.c(dac.dL);
   }

   private void am() {
      this.a(cqn.lJ);
      this.b.accept(ml.a(dac.eh).a(mm.a(dnp.aA, dnp.s, dnp.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return mo.a().a(mp.c, mw.a(dac.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cqn.cS);
      this.b
         .accept(
            ml.a(dac.mV)
               .a(
                  mm.a(dnp.aS, dnp.C)
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
      mw $$0 = mw.a(dac.dN);
      ajh $$1 = mv.c.a(dac.dP, $$0, this.c);
      this.b.accept(ml.a(dac.dN).a(mm.a(dnp.aF).a($$1x -> mo.a().a(mp.c, $$1x < 8 ? mt.a(dac.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dac.dN, mt.a(dac.dN, "_height2"));
      this.b.accept(c(dac.dP, $$1));
   }

   private void ap() {
      this.b.accept(ml.a(dac.oc, mo.a().a(mp.c, mt.a(dac.oc))).a(b()));
   }

   private void aq() {
      ajh $$0 = my.a.create(dac.pa, this.c);
      this.a(dac.pa, $$0);
      this.b.accept(ml.a(dac.pa).a(mm.a(dnp.bj).a($$0x -> mo.a().a(mp.c, this.a(dac.pa, "_" + $$0x.c(), mv.c, mw::b)))));
   }

   private void ar() {
      this.a(cqn.wm);
      this.b.accept(ml.a(dac.oi).a(mm.a(dnp.as).a($$0 -> mo.a().a(mp.c, this.a(dac.oi, "_stage" + $$0, mv.ao, mw::c)))));
   }

   private void as() {
      this.a(cqn.pr);
      this.b
         .accept(
            ml.a(dac.fI)
               .a(
                  mm.a(dnp.a, dnp.M, dnp.L, dnp.N, dnp.O)
                     .a(false, false, false, false, false, mo.a().a(mp.c, mt.a(dac.fI, "_ns")))
                     .a(false, true, false, false, false, mo.a().a(mp.c, mt.a(dac.fI, "_n")).a(mp.b, mp.a.b))
                     .a(false, false, true, false, false, mo.a().a(mp.c, mt.a(dac.fI, "_n")))
                     .a(false, false, false, true, false, mo.a().a(mp.c, mt.a(dac.fI, "_n")).a(mp.b, mp.a.c))
                     .a(false, false, false, false, true, mo.a().a(mp.c, mt.a(dac.fI, "_n")).a(mp.b, mp.a.d))
                     .a(false, true, true, false, false, mo.a().a(mp.c, mt.a(dac.fI, "_ne")))
                     .a(false, true, false, true, false, mo.a().a(mp.c, mt.a(dac.fI, "_ne")).a(mp.b, mp.a.b))
                     .a(false, false, false, true, true, mo.a().a(mp.c, mt.a(dac.fI, "_ne")).a(mp.b, mp.a.c))
                     .a(false, false, true, false, true, mo.a().a(mp.c, mt.a(dac.fI, "_ne")).a(mp.b, mp.a.d))
                     .a(false, false, true, true, false, mo.a().a(mp.c, mt.a(dac.fI, "_ns")))
                     .a(false, true, false, false, true, mo.a().a(mp.c, mt.a(dac.fI, "_ns")).a(mp.b, mp.a.b))
                     .a(false, true, true, true, false, mo.a().a(mp.c, mt.a(dac.fI, "_nse")))
                     .a(false, true, false, true, true, mo.a().a(mp.c, mt.a(dac.fI, "_nse")).a(mp.b, mp.a.b))
                     .a(false, false, true, true, true, mo.a().a(mp.c, mt.a(dac.fI, "_nse")).a(mp.b, mp.a.c))
                     .a(false, true, true, false, true, mo.a().a(mp.c, mt.a(dac.fI, "_nse")).a(mp.b, mp.a.d))
                     .a(false, true, true, true, true, mo.a().a(mp.c, mt.a(dac.fI, "_nsew")))
                     .a(true, false, false, false, false, mo.a().a(mp.c, mt.a(dac.fI, "_attached_ns")))
                     .a(true, false, true, false, false, mo.a().a(mp.c, mt.a(dac.fI, "_attached_n")))
                     .a(true, false, false, true, false, mo.a().a(mp.c, mt.a(dac.fI, "_attached_n")).a(mp.b, mp.a.c))
                     .a(true, true, false, false, false, mo.a().a(mp.c, mt.a(dac.fI, "_attached_n")).a(mp.b, mp.a.b))
                     .a(true, false, false, false, true, mo.a().a(mp.c, mt.a(dac.fI, "_attached_n")).a(mp.b, mp.a.d))
                     .a(true, true, true, false, false, mo.a().a(mp.c, mt.a(dac.fI, "_attached_ne")))
                     .a(true, true, false, true, false, mo.a().a(mp.c, mt.a(dac.fI, "_attached_ne")).a(mp.b, mp.a.b))
                     .a(true, false, false, true, true, mo.a().a(mp.c, mt.a(dac.fI, "_attached_ne")).a(mp.b, mp.a.c))
                     .a(true, false, true, false, true, mo.a().a(mp.c, mt.a(dac.fI, "_attached_ne")).a(mp.b, mp.a.d))
                     .a(true, false, true, true, false, mo.a().a(mp.c, mt.a(dac.fI, "_attached_ns")))
                     .a(true, true, false, false, true, mo.a().a(mp.c, mt.a(dac.fI, "_attached_ns")).a(mp.b, mp.a.b))
                     .a(true, true, true, true, false, mo.a().a(mp.c, mt.a(dac.fI, "_attached_nse")))
                     .a(true, true, false, true, true, mo.a().a(mp.c, mt.a(dac.fI, "_attached_nse")).a(mp.b, mp.a.b))
                     .a(true, false, true, true, true, mo.a().a(mp.c, mt.a(dac.fI, "_attached_nse")).a(mp.b, mp.a.c))
                     .a(true, true, true, false, true, mo.a().a(mp.c, mt.a(dac.fI, "_attached_nse")).a(mp.b, mp.a.d))
                     .a(true, true, true, true, true, mo.a().a(mp.c, mt.a(dac.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dac.fH);
      this.b.accept(ml.a(dac.fH).a(mm.a(dnp.a, dnp.w).a(($$0, $$1) -> mo.a().a(mp.c, mw.a(dac.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
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
            return this.a($$0.intValue(), "", mw.b(mw.G(dac.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mw.b(mw.a(dac.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mw.b(mw.a(dac.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cqn.ko);
      this.b.accept(ml.a(dac.mf).a(mm.a(dnp.aD, dnp.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cqn.kp);
      Function<Integer, ajh> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mw $$2 = mw.a($$1);
         return mv.bw.a(dac.mg, $$1, $$2, this.c);
      };
      this.b.accept(ml.a(dac.mg).a(mm.a(dhh.c).a($$1 -> mo.a().a(mp.c, $$0.apply($$1)))));
   }

   private void F(daa $$0) {
      this.d($$0);
      ajh $$1 = mt.a($$0);
      mk $$2 = mk.a($$0);
      mj.c $$3 = ac.a(mj.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dnq, Function<ajh, mo>> $$4 : a) {
         dnq $$5 = (dnq)$$4.getFirst();
         Function<ajh, mo> $$6 = (Function<ajh, mo>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(mj.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      ajh $$0 = mw.a(dac.qU, "_bottom");
      mw $$1 = new mw().a(mx.e, $$0).a(mx.f, mw.a(dac.qU, "_top")).a(mx.i, mw.a(dac.qU, "_side"));
      mw $$2 = new mw().a(mx.e, $$0).a(mx.f, mw.a(dac.qU, "_top_bloom")).a(mx.i, mw.a(dac.qU, "_side_bloom"));
      ajh $$3 = mv.n.a(dac.qU, "", $$1, this.c);
      ajh $$4 = mv.n.a(dac.qU, "_bloom", $$2, this.c);
      this.b.accept(ml.a(dac.qU).a(mm.a(dnp.E).a($$2x -> mo.a().a(mp.c, $$2x ? $$4 : $$3))));
      this.a(cqn.gi, $$3);
   }

   private void ax() {
      daa $$0 = dac.cm;
      ajh $$1 = mt.a($$0);
      mk $$2 = mk.a($$0);
      Map.of(ih.c, mp.a.a, ih.f, mp.a.b, ih.d, mp.a.c, ih.e, mp.a.d).forEach(($$2x, $$3) -> {
         mj.c $$4 = mj.a().a(dnp.R, $$2x);
         $$2.a($$4, mo.a().a(mp.c, $$1).a(mp.b, $$3).a(mp.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mt.a($$0, "_inventory"));
      i.clear();
   }

   private void a(mk $$0, mj.c $$1, mp.a $$2) {
      List.of(Pair.of(dnp.bp, mv.aM), Pair.of(dnp.bq, mv.aN), Pair.of(dnp.br, mv.aO), Pair.of(dnp.bs, mv.aP), Pair.of(dnp.bt, mv.aQ), Pair.of(dnp.bu, mv.aR))
         .forEach($$3 -> {
            dnq $$4 = (dnq)$$3.getFirst();
            mu $$5 = (mu)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(mk $$0, mj.c $$1, mp.a $$2, dnq $$3, mu $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mw $$7 = new mw().a(mx.b, mw.a(dac.cm, $$6));
      mf.d $$8 = new mf.d($$4, $$6);
      ajh $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dac.cm, $$6, $$7, this.c));
      $$0.a(mj.a($$1, mj.a().a($$3, $$5)), mo.a().a(mp.c, $$9).a(mp.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dac.kJ, mv.c.a(dac.kJ, mw.b(mt.a("magma")), this.c)));
   }

   private void G(daa $$0) {
      this.b($$0, my.q);
      mv.bD.a(mt.a($$0.l()), mw.u($$0), this.c);
   }

   private void b(daa $$0, daa $$1, mf.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(daa $$0, daa $$1) {
      mv.bE.a(mt.a($$0.l()), mw.u($$1), this.c);
   }

   private void az() {
      ajh $$0 = mt.a(dac.b);
      ajh $$1 = mt.a(dac.b, "_mirrored");
      this.b.accept(a(dac.eN, $$0, $$1));
      this.a(dac.eN, $$0);
   }

   private void aA() {
      ajh $$0 = mt.a(dac.sJ);
      ajh $$1 = mt.a(dac.sJ, "_mirrored");
      this.b.accept(a(dac.td, $$0, $$1).a(f()));
      this.a(dac.td, $$0);
   }

   private void n(daa $$0, daa $$1) {
      this.a($$0, mf.e.b);
      mw $$2 = mw.d(mw.a($$0, "_pot"));
      ajh $$3 = mf.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      ajh $$0 = mw.a(dac.pl, "_bottom");
      ajh $$1 = mw.a(dac.pl, "_top_off");
      ajh $$2 = mw.a(dac.pl, "_top");
      ajh[] $$3 = new ajh[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mw $$5 = new mw().a(mx.e, $$0).a(mx.f, $$4 == 0 ? $$1 : $$2).a(mx.i, mw.a(dac.pl, "_side" + $$4));
         $$3[$$4] = mv.n.a(dac.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(ml.a(dac.pl).a(mm.a(dnp.aZ).a($$1x -> mo.a().a(mp.c, $$3[$$1x]))));
      this.a(cqn.wK, $$3[0]);
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
      ajh $$0 = mw.a(dac.pb, "_top");
      ajh $$1 = mw.a(dac.pb, "_bottom");
      ajh $$2 = mw.a(dac.pb, "_side");
      ajh $$3 = mw.a(dac.pb, "_lock");
      mw $$4 = new mw().a(mx.o, $$2).a(mx.m, $$2).a(mx.l, $$2).a(mx.c, $$0).a(mx.j, $$0).a(mx.k, $$1).a(mx.n, $$3);
      ajh $$5 = mv.b.a(dac.pb, $$4, this.c);
      this.b.accept(ml.a(dac.pb, mo.a().a(mp.c, $$5)).a(mm.a(dnp.T).a($$0x -> this.a($$0x, mo.a()))));
   }

   private void aD() {
      daa $$0 = dac.n;
      ajh $$1 = mt.a($$0);
      my $$2 = my.a.get($$0);
      daa $$3 = dac.jH;
      ajh $$4 = mv.ab.a($$3, $$2.b(), this.c);
      ajh $$5 = mv.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kl.a().filter(km::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dac.rf).a(kl.w).a(dac.rf, dac.rD).a(dac.rj, dac.rn).a(kl.y);
      this.h(dac.re).a(kl.A).a(dac.re, dac.rC).a(dac.ri, dac.rm).a(kl.C);
      this.h(dac.rd).a(kl.E).a(dac.rd, dac.rB).a(dac.rh, dac.rl).a(kl.G);
      this.h(dac.rc).a(kl.I).a(dac.rc, dac.rA).a(dac.rg, dac.rk).a(kl.K);
      this.w(dac.sk);
      this.w(dac.sl);
      this.w(dac.sm);
      this.w(dac.sn);
      this.i(dac.sk, dac.so);
      this.i(dac.sl, dac.sp);
      this.i(dac.sm, dac.sq);
      this.i(dac.sn, dac.sr);
      this.m(dac.a);
      this.c(dac.nc, dac.a);
      this.c(dac.nb, dac.a);
      this.m(dac.fO);
      this.m(dac.dQ);
      this.c(dac.nd, dac.G);
      this.m(dac.fA);
      this.m(dac.me);
      this.m(dac.fr);
      this.m(dac.fR);
      this.a(cqn.ub);
      this.m(dac.pg);
      this.m(dac.G);
      this.m(dac.H);
      this.m(dac.hV);
      this.a(cqn.fR);
      this.o(dac.pM, dac.qd);
      this.o(dac.pN, dac.qe);
      this.o(dac.pO, dac.qf);
      this.o(dac.pP, dac.qg);
      this.o(dac.pQ, dac.qh);
      this.o(dac.pR, dac.qi);
      this.o(dac.pS, dac.qj);
      this.o(dac.pT, dac.qk);
      this.o(dac.pU, dac.ql);
      this.o(dac.pV, dac.qm);
      this.o(dac.pW, dac.qn);
      this.o(dac.pX, dac.qo);
      this.o(dac.pY, dac.qp);
      this.o(dac.pZ, dac.qq);
      this.o(dac.qa, dac.qr);
      this.o(dac.qb, dac.qs);
      this.o(dac.pL, dac.qc);
      this.m(dac.na);
      this.m(dac.gs);
      this.m(dac.qP);
      this.m(dac.sx);
      this.s(dac.sy);
      this.s(dac.sz);
      this.t(dac.ti);
      this.t(dac.tj);
      this.aj();
      this.g(dac.sC, dac.sA);
      this.p(dac.sB);
      this.a(dac.hW, cqn.hA);
      this.a(cqn.hA);
      this.aE();
      this.a(dac.kN, cqn.ja);
      this.a(cqn.ja);
      this.f(dac.bQ, mw.a(dac.by, "_side"));
      this.a(dac.R);
      this.a(dac.S);
      this.a(dac.iB);
      this.a(dac.cx);
      this.a(dac.cy);
      this.a(dac.cz);
      this.a(dac.fE);
      this.a(dac.fF);
      this.a(dac.fJ);
      this.a(dac.N);
      this.a(dac.T);
      this.a(dac.O);
      this.a(dac.ch);
      this.a(dac.P);
      this.a(dac.Q);
      this.a(dac.ci);
      this.b(dac.pj, my.d);
      this.a(dac.pi);
      this.a(dac.aR);
      this.a(dac.aS);
      this.a(dac.aT);
      this.a(dac.hb);
      this.a(dac.dI);
      this.a(dac.dJ);
      this.a(dac.ha);
      this.a(dac.pC);
      this.a(dac.mW);
      this.a(dac.dR);
      this.a(dac.k);
      this.a(dac.pk);
      this.a(dac.fz);
      this.a(dac.ec);
      this.a(dac.L);
      this.a(dac.ph);
      this.a(dac.dO);
      this.b(dac.dT, my.g);
      this.b(dac.pq, my.d);
      this.b(dac.fa, my.d);
      this.m(dac.ac);
      this.m(dac.ga);
      this.a(dac.kK);
      this.a(dac.aY);
      this.a(dac.iC);
      this.a(dac.co);
      this.a(dac.pK);
      this.a(dac.ii);
      this.a(dac.oy);
      this.a(dac.dW);
      this.a(dac.dX);
      this.b(dac.ct, my.b);
      this.a(dac.aO);
      this.b(dac.bw, my.v);
      this.a(cqn.cR);
      this.b(dac.ck, my.f);
      this.b(dac.pd, my.d);
      this.a(dac.op);
      this.a(dac.aP);
      this.a(dac.qt);
      this.a(dac.qu);
      this.a(dac.qN);
      this.a(dac.su);
      this.a(dac.tf);
      this.a(dac.tg);
      this.a(dac.th);
      this.e(dac.qS);
      this.aD();
      this.a(dac.ra);
      this.a(dac.rb);
      this.a(dac.qW);
      this.a(dac.qX);
      this.a(dac.qY);
      this.a(dac.qZ);
      this.k(dac.qW, dac.rw);
      this.k(dac.qX, dac.ry);
      this.k(dac.qY, dac.rx);
      this.k(dac.qZ, dac.rz);
      this.i(dac.rM);
      this.i(dac.rN);
      this.i(dac.rP);
      this.i(dac.rO);
      this.a(dac.rM, dac.rQ);
      this.a(dac.rN, dac.rR);
      this.a(dac.rP, dac.rT);
      this.a(dac.rO, dac.rS);
      this.k(dac.rU);
      this.k(dac.rV);
      this.k(dac.rX);
      this.k(dac.rW);
      this.b(dac.rU, dac.rY);
      this.b(dac.rV, dac.rZ);
      this.b(dac.rX, dac.sb);
      this.b(dac.rW, dac.sa);
      this.a(dac.sc);
      this.a(dac.sd);
      this.a(dac.se);
      this.a(dac.sf);
      this.k(dac.sc, dac.sg);
      this.k(dac.sd, dac.sh);
      this.k(dac.se, dac.si);
      this.k(dac.sf, dac.sj);
      this.j(dac.gW, dac.ch);
      this.j(dac.gX, dac.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dac.og, dac.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dac.kt);
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
      this.F(dac.ff);
      this.F(dac.fg);
      this.F(dac.qT);
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
      this.E(dac.cO);
      this.d(dac.cO);
      this.E(dac.oa);
      this.g();
      this.E(dac.sE);
      this.l(dac.cp, dac.cq);
      this.l(dac.ea, dac.eb);
      this.a(dac.cA, dac.n, mw::c);
      this.a(dac.nY, dac.p, mw::d);
      this.y(dac.ow);
      this.y(dac.on);
      this.v(dac.aU);
      this.v(dac.hi);
      this.C();
      this.D(dac.oe);
      this.D(dac.of);
      this.e(dac.eX, mt.a(dac.eX));
      this.a(dac.dY, my.d);
      this.a(dac.dZ, my.d);
      this.a(dac.te);
      this.a(dac.kM, my.d);
      this.f(dac.j);
      this.f(dac.sH);
      this.f(dac.I);
      this.g(dac.J);
      this.g(dac.M);
      this.f(dac.K);
      this.e(dac.F);
      this.b(dac.to, my.f);
      this.a(dac.ij, my.d, my.e);
      this.a(dac.kx, my.w, my.x);
      this.a(dac.hf, my.w, my.x);
      this.a(dac.tk, my.d, my.e);
      this.a(dac.tl, my.d, my.e);
      this.a(dac.tm, my.d, my.e);
      this.c(dac.nT, my.i);
      this.z();
      this.a(dac.pe, mw::A);
      this.a(dac.pf, mw::C);
      this.a(dac.kD, dnp.as, 0, 1, 2, 3);
      this.a(dac.gt, dnp.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dac.fq, dnp.as, 0, 1, 1, 2);
      this.a(dac.gu, dnp.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dac.cB, dnp.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dac.kA, mf.e.b, dnp.aq, 0, 1);
      this.i();
      this.h();
      this.a(mt.a("decorated_pot"), dac.iA).b(dac.tp);
      this.a(mt.a("banner"), dac.n)
         .a(mv.bF, dac.iJ, dac.iK, dac.iL, dac.iM, dac.iN, dac.iO, dac.iP, dac.iQ, dac.iR, dac.iS, dac.iT, dac.iU, dac.iV, dac.iW, dac.iX, dac.iY)
         .b(dac.iZ, dac.ja, dac.jb, dac.jc, dac.jd, dac.je, dac.jf, dac.jg, dac.jh, dac.ji, dac.jj, dac.jk, dac.jl, dac.jm, dac.jn, dac.jo);
      this.a(mt.a("bed"), dac.n)
         .b(dac.aZ, dac.ba, dac.bb, dac.bc, dac.bd, dac.be, dac.bf, dac.bg, dac.bh, dac.bi, dac.bj, dac.bk, dac.bl, dac.bm, dac.bn, dac.bo);
      this.m(dac.aZ, dac.bA);
      this.m(dac.ba, dac.bB);
      this.m(dac.bb, dac.bC);
      this.m(dac.bc, dac.bD);
      this.m(dac.bd, dac.bE);
      this.m(dac.be, dac.bF);
      this.m(dac.bf, dac.bG);
      this.m(dac.bg, dac.bH);
      this.m(dac.bh, dac.bI);
      this.m(dac.bi, dac.bJ);
      this.m(dac.bj, dac.bK);
      this.m(dac.bk, dac.bL);
      this.m(dac.bl, dac.bM);
      this.m(dac.bm, dac.bN);
      this.m(dac.bn, dac.bO);
      this.m(dac.bo, dac.bP);
      this.a(mt.a("skull"), dac.dW)
         .a(mv.bG, dac.gM, dac.gK, dac.gI, dac.gE, dac.gG, dac.gQ)
         .a(dac.gO)
         .b(dac.gN, dac.gP, dac.gL, dac.gJ, dac.gF, dac.gH, dac.gR);
      this.G(dac.kP);
      this.G(dac.kQ);
      this.G(dac.kR);
      this.G(dac.kS);
      this.G(dac.kT);
      this.G(dac.kU);
      this.G(dac.kV);
      this.G(dac.kW);
      this.G(dac.kX);
      this.G(dac.kY);
      this.G(dac.kZ);
      this.G(dac.la);
      this.G(dac.lb);
      this.G(dac.lc);
      this.G(dac.ld);
      this.G(dac.le);
      this.G(dac.lf);
      this.b(dac.mX, my.q);
      this.c(dac.mX);
      this.a(mt.a("chest"), dac.n).b(dac.cv, dac.gV);
      this.a(mt.a("ender_chest"), dac.co).b(dac.fG);
      this.f(dac.fx, dac.co).a(dac.fx, dac.kF);
      this.a(dac.aM);
      this.a(dac.aN);
      this.a(dac.lw);
      this.a(dac.lx);
      this.a(dac.ly);
      this.a(dac.lz);
      this.a(dac.lA);
      this.a(dac.lB);
      this.a(dac.lC);
      this.a(dac.lD);
      this.a(dac.lE);
      this.a(dac.lF);
      this.a(dac.lG);
      this.a(dac.lH);
      this.a(dac.lI);
      this.a(dac.lJ);
      this.a(dac.lK);
      this.a(dac.lL);
      this.a(my.a, dac.lM, dac.lN, dac.lO, dac.lP, dac.lQ, dac.lR, dac.lS, dac.lT, dac.lU, dac.lV, dac.lW, dac.lX, dac.lY, dac.lZ, dac.ma, dac.mb);
      this.a(dac.iA);
      this.a(dac.hj);
      this.a(dac.hk);
      this.a(dac.hl);
      this.a(dac.hm);
      this.a(dac.hn);
      this.a(dac.ho);
      this.a(dac.hp);
      this.a(dac.hq);
      this.a(dac.hr);
      this.a(dac.hs);
      this.a(dac.ht);
      this.a(dac.hu);
      this.a(dac.hv);
      this.a(dac.hw);
      this.a(dac.hx);
      this.a(dac.hy);
      this.a(dac.qO);
      this.h(dac.aQ, dac.eY);
      this.h(dac.ei, dac.hz);
      this.h(dac.ej, dac.hA);
      this.h(dac.ek, dac.hB);
      this.h(dac.el, dac.hC);
      this.h(dac.em, dac.hD);
      this.h(dac.en, dac.hE);
      this.h(dac.eo, dac.hF);
      this.h(dac.ep, dac.hG);
      this.h(dac.eq, dac.hH);
      this.h(dac.er, dac.hI);
      this.h(dac.es, dac.hJ);
      this.h(dac.et, dac.hK);
      this.h(dac.eu, dac.hL);
      this.h(dac.ev, dac.hM);
      this.h(dac.ew, dac.hN);
      this.h(dac.ex, dac.hO);
      this.b(my.o, dac.lg, dac.lh, dac.li, dac.lj, dac.lk, dac.ll, dac.lm, dac.ln, dac.lo, dac.lp, dac.lq, dac.lr, dac.ls, dac.lt, dac.lu, dac.lv);
      this.g(dac.bA, dac.ik);
      this.g(dac.bB, dac.il);
      this.g(dac.bC, dac.im);
      this.g(dac.bD, dac.in);
      this.g(dac.bE, dac.io);
      this.g(dac.bF, dac.ip);
      this.g(dac.bG, dac.iq);
      this.g(dac.bH, dac.ir);
      this.g(dac.bI, dac.is);
      this.g(dac.bJ, dac.it);
      this.g(dac.bK, dac.iu);
      this.g(dac.bL, dac.iv);
      this.g(dac.bM, dac.iw);
      this.g(dac.bN, dac.ix);
      this.g(dac.bO, dac.iy);
      this.g(dac.bP, dac.iz);
      this.a(dac.sI);
      this.a(dac.eL);
      this.a(dac.bu, dac.gb, mf.e.a);
      this.a(dac.bR, dac.gc, mf.e.b);
      this.a(dac.bT, dac.gd, mf.e.b);
      this.a(dac.bU, dac.ge, mf.e.b);
      this.a(dac.bV, dac.gf, mf.e.b);
      this.a(dac.bW, dac.gg, mf.e.b);
      this.a(dac.bX, dac.gh, mf.e.b);
      this.a(dac.bY, dac.gi, mf.e.b);
      this.a(dac.bZ, dac.gj, mf.e.b);
      this.a(dac.ca, dac.gk, mf.e.b);
      this.a(dac.cb, dac.gl, mf.e.b);
      this.a(dac.cc, dac.gm, mf.e.b);
      this.a(dac.ce, dac.gn, mf.e.b);
      this.a(dac.cd, dac.go, mf.e.b);
      this.a(dac.cg, dac.gp, mf.e.b);
      this.a(dac.cf, dac.gq, mf.e.b);
      this.a(dac.bv, dac.gr, mf.e.b);
      this.a(dac.bS, dac.fS, mf.e.b);
      this.H();
      this.u(dac.eT);
      this.u(dac.eU);
      this.u(dac.eV);
      this.a(dac.bt, mf.e.a);
      this.b(dac.dS, mf.e.a);
      this.a(cqn.dI);
      this.b(dac.mc, dac.md, mf.e.b);
      this.a(cqn.dJ);
      this.c(dac.md);
      this.b(dac.sG, mf.e.b);
      this.c(dac.sG);
      this.c(dac.sw);
      this.b(dac.oz, dac.oA, mf.e.b);
      this.b(dac.oB, dac.oC, mf.e.b);
      this.a(dac.oz, "_plant");
      this.c(dac.oA);
      this.a(dac.oB, "_plant");
      this.c(dac.oC);
      this.a(dac.mY, mf.e.a, mw.c(mw.a(dac.mZ, "_stage0")));
      this.m();
      this.a(dac.bs, mf.e.b);
      this.c(dac.iE, mf.e.b);
      this.c(dac.iF, mf.e.b);
      this.c(dac.iG, mf.e.b);
      this.c(dac.iH, mf.e.a);
      this.c(dac.iI, mf.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dac.mw, dac.mr, dac.mm, dac.mh, dac.mG, dac.mB, dac.mQ, dac.mL);
      this.a(dac.mx, dac.ms, dac.mn, dac.mi, dac.mH, dac.mC, dac.mR, dac.mM);
      this.a(dac.my, dac.mt, dac.mo, dac.mj, dac.mI, dac.mD, dac.mS, dac.mN);
      this.a(dac.mz, dac.mu, dac.mp, dac.mk, dac.mJ, dac.mE, dac.mT, dac.mO);
      this.a(dac.mA, dac.mv, dac.mq, dac.ml, dac.mK, dac.mF, dac.mU, dac.mP);
      this.e(dac.fe, dac.fc);
      this.e(dac.fd, dac.fb);
      this.l(dac.ab).c(dac.ab).a(dac.av);
      this.l(dac.am).c(dac.am).a(dac.aD);
      this.a(dac.am, dac.dj, dac.ds);
      this.b(dac.aL, my.s);
      this.l(dac.Y).c(dac.Y).a(dac.as);
      this.l(dac.ai).c(dac.ai).a(dac.aA);
      this.a(dac.ai, dac.dd, dac.do);
      this.a(dac.B, dac.fX, mf.e.b);
      this.b(dac.aI, my.s);
      this.l(dac.Z).d(dac.Z).a(dac.at);
      this.l(dac.aj).d(dac.aj).a(dac.aB);
      this.a(dac.aj, dac.de, dac.dp);
      this.a(dac.C, dac.fY, mf.e.b);
      this.b(dac.aJ, my.s);
      this.l(dac.W).c(dac.W).a(dac.aq);
      this.l(dac.ag).c(dac.ag).a(dac.ay);
      this.a(dac.ag, dac.dc, dac.dn);
      this.a(dac.z, dac.fV, mf.e.b);
      this.b(dac.aG, my.s);
      this.l(dac.U).c(dac.U).a(dac.ao);
      this.l(dac.al).c(dac.al).a(dac.aw);
      this.a(dac.al, dac.da, dac.dl);
      this.a(dac.x, dac.fT, mf.e.b);
      this.b(dac.aE, my.s);
      this.l(dac.V).c(dac.V).a(dac.ap);
      this.l(dac.af).c(dac.af).a(dac.ax);
      this.a(dac.af, dac.db, dac.dm);
      this.a(dac.y, dac.fU, mf.e.b);
      this.b(dac.aF, my.s);
      this.l(dac.aa).c(dac.aa).a(dac.au);
      this.l(dac.ak).c(dac.ak).a(dac.aC);
      this.a(dac.ak, dac.dg, dac.dr);
      this.a(dac.D, dac.fZ, mf.e.b);
      this.b(dac.aK, my.s);
      this.l(dac.X).c(dac.X).a(dac.ar);
      this.l(dac.ah).c(dac.ah).a(dac.az);
      this.a(dac.ah, dac.df, dac.dq);
      this.a(dac.A, dac.fW, mf.e.b);
      this.b(dac.aH, my.s);
      this.l(dac.os).b(dac.os).a(dac.ou);
      this.l(dac.ot).b(dac.ot).a(dac.ov);
      this.a(dac.ot, dac.dh, dac.dt);
      this.a(dac.ox, dac.pm, mf.e.b);
      this.n(dac.oD, dac.po);
      this.l(dac.oj).b(dac.oj).a(dac.ol);
      this.l(dac.ok).b(dac.ok).a(dac.om);
      this.a(dac.ok, dac.di, dac.du);
      this.a(dac.oo, dac.pn, mf.e.b);
      this.n(dac.oq, dac.pp);
      this.l(dac.ae).d(dac.ae);
      this.l(dac.an).d(dac.an);
      this.a(dac.v, dac.dk, dac.dv);
      this.b(dac.or, mf.e.b);
      this.a(cqn.dF);
      this.i(dac.dy);
      this.k(dac.hY);
      this.u();
      this.n(dac.cP);
      this.o(dac.bp);
      this.o(dac.bq);
      this.o(dac.hh);
      this.t();
      this.q(dac.fN);
      this.q(dac.kG);
      this.q(dac.kH);
      this.r(dac.gS);
      this.r(dac.gT);
      this.r(dac.gU);
      this.o();
      this.p();
      this.d(dac.cD, my.h);
      this.d(dac.nW, my.h);
      this.d(dac.nV, my.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dac.eK, dac.eS);
      this.k(dac.m, dac.eO);
      this.k(dac.eJ, dac.eR);
      this.k(dac.eI, dac.eQ);
      this.az();
      this.k(dac.eH, dac.eP);
      this.aA();
      crp.h().forEach($$0 -> this.a($$0, mt.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dac.hX);
      mm.a<Integer> $$0 = mm.a(dnp.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ajh $$3 = mw.a(cqn.hB, $$2);
         $$0.a($$1, mo.a().a(mp.c, mv.aa.a(dac.hX, $$2, mw.h($$3), this.c)));
         mv.bx.a(mt.a(cqn.hB, $$2), mw.k($$3), this.c);
      }

      this.b.accept(ml.a(dac.hX).a($$0));
   }

   private void o(daa $$0, daa $$1) {
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
                  mm.a(dnp.az, dnp.r)
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
      this.b.accept(ml.a($$1).a(a(dnp.r, $$13, $$12)));
   }

   class a {
      private final ajh b;

      public a(ajh $$0, daa $$1) {
         this.b = mv.aa.a($$0, mw.u($$1), mf.this.c);
      }

      public mf.a a(daa... $$0) {
         for (daa $$1 : $$0) {
            mf.this.b.accept(mf.c($$1, this.b));
         }

         return this;
      }

      public mf.a b(daa... $$0) {
         for (daa $$1 : $$0) {
            mf.this.c($$1);
         }

         return this.a($$0);
      }

      public mf.a a(mu $$0, daa... $$1) {
         for (daa $$2 : $$1) {
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
      private final Set<daa> f = new HashSet<>();

      public b(mw $$0) {
         this.b = $$0;
      }

      public mf.b a(daa $$0, mu $$1) {
         this.e = $$1.a($$0, this.b, mf.this.c);
         if (mf.this.f.containsKey($$0)) {
            mf.this.b.accept(mf.this.f.get($$0).create($$0, this.e, this.b, mf.this.c));
         } else {
            mf.this.b.accept(mf.c($$0, this.e));
         }

         return this;
      }

      public mf.b a(daa $$0, daa $$1) {
         ajh $$2 = mt.a($$0);
         mf.this.b.accept(mf.c($$1, $$2));
         mf.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public mf.b a(daa $$0) {
         ajh $$1 = mv.s.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.t.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.b($$0, $$1, $$2));
         ajh $$3 = mv.u.a($$0, this.b, mf.this.c);
         mf.this.a($$0, $$3);
         return this;
      }

      public mf.b b(daa $$0) {
         ajh $$1 = mv.M.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.N.a($$0, this.b, mf.this.c);
         ajh $$3 = mv.O.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.a($$0, $$1, $$2, $$3));
         ajh $$4 = mv.P.a($$0, this.b, mf.this.c);
         mf.this.a($$0, $$4);
         return this;
      }

      public mf.b c(daa $$0) {
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

      public mf.b d(daa $$0) {
         ajh $$1 = mv.J.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.K.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.c($$0, $$1, $$2));
         ajh $$3 = mv.L.a($$0, this.b, mf.this.c);
         mf.this.a($$0, $$3);
         return this;
      }

      public mf.b e(daa $$0) {
         mw $$1 = mw.p($$0);
         ajh $$2 = mv.R.a($$0, $$1, mf.this.c);
         ajh $$3 = mv.Q.a($$0, $$1, mf.this.c);
         ajh $$4 = mv.T.a($$0, $$1, mf.this.c);
         ajh $$5 = mv.S.a($$0, $$1, mf.this.c);
         mf.this.b.accept(mf.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public mf.b f(daa $$0) {
         ajh $$1 = mv.V.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.U.a($$0, this.b, mf.this.c);
         ajh $$3 = mv.X.a($$0, this.b, mf.this.c);
         ajh $$4 = mv.W.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public mf.b g(daa $$0) {
         ajh $$1 = mv.Y.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.Z.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.e($$0, $$1, $$2));
         return this;
      }

      public mf.b h(daa $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            daa $$1 = this.d.b().get(km.b.r);
            ajh $$2 = mv.aa.a($$0, this.b, mf.this.c);
            mf.this.b.accept(mf.c($$0, $$2));
            mf.this.b.accept(mf.c($$1, $$2));
            mf.this.a($$0.l());
            mf.this.c($$1);
            return this;
         }
      }

      public mf.b i(daa $$0) {
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

      public mf.b j(daa $$0) {
         ajh $$1 = this.a(mv.af, $$0);
         ajh $$2 = this.a(mv.ae, $$0);
         ajh $$3 = this.a(mv.ag, $$0);
         mf.this.b.accept(mf.b($$0, $$1, $$2, $$3));
         mf.this.a($$0, $$2);
         return this;
      }

      private mf.b k(daa $$0) {
         my $$1 = mf.this.g.getOrDefault($$0, my.a.get($$0));
         ajh $$2 = $$1.a($$0, mf.this.c);
         mf.this.b.accept(mf.c($$0, $$2));
         return this;
      }

      private mf.b l(daa $$0) {
         mf.this.i($$0);
         return this;
      }

      private void m(daa $$0) {
         if (mf.this.e.contains($$0)) {
            mf.this.k($$0);
         } else {
            mf.this.j($$0);
         }
      }

      private ajh a(mu $$0, daa $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, mf.this.c));
      }

      public mf.b a(km $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<mf.b, daa> $$2 = mf.h.get($$0x);
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
      mi create(daa var1, ajh var2, mw var3, BiConsumer<ajh, Supplier<JsonElement>> var4);
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

      public mf.f a(daa $$0) {
         mw $$1 = this.b.c(mx.d, this.b.a(mx.i));
         ajh $$2 = mv.j.a($$0, $$1, mf.this.c);
         mf.this.b.accept(mf.d($$0, $$2));
         return this;
      }

      public mf.f b(daa $$0) {
         ajh $$1 = mv.j.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.d($$0, $$1));
         return this;
      }

      public mf.f c(daa $$0) {
         ajh $$1 = mv.j.a($$0, this.b, mf.this.c);
         ajh $$2 = mv.k.a($$0, this.b, mf.this.c);
         mf.this.b.accept(mf.d($$0, $$1, $$2));
         return this;
      }

      public mf.f d(daa $$0) {
         mf.this.b.accept(mf.a($$0, this.b, mf.this.c));
         return this;
      }
   }
}
