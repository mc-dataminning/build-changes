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

public class lz {
   final Consumer<mc> b;
   final BiConsumer<ahg, Supplier<JsonElement>> c;
   private final Consumer<cms> d;
   final List<cwp> e = ImmutableList.of(cwr.ey, cwr.eE, cwr.hY);
   final Map<cwp, lz.c> f = ImmutableMap.builder().put(cwr.b, lz::a).put(cwr.sJ, lz::c).put(cwr.eM, lz::b).build();
   final Map<cwp, ms> g = ImmutableMap.builder()
      .put(cwr.aV, ms.y.get(cwr.aV))
      .put(cwr.jp, ms.y.get(cwr.jp))
      .put(cwr.jS, ms.a(mq.a(cwr.aV, "_top")))
      .put(cwr.jU, ms.a(mq.a(cwr.jp, "_top")))
      .put(cwr.aX, ms.d.get(cwr.aV).a($$0x -> $$0x.a(mr.i, mq.G(cwr.aX))))
      .put(cwr.jr, ms.d.get(cwr.jp).a($$0x -> $$0x.a(mr.i, mq.G(cwr.jr))))
      .put(cwr.hd, ms.d.get(cwr.hd))
      .put(cwr.jT, ms.a(mq.a(cwr.hd, "_bottom")))
      .put(cwr.pr, ms.z.get(cwr.pr))
      .put(cwr.sJ, ms.z.get(cwr.sJ))
      .put(cwr.he, ms.d.get(cwr.he).a($$0x -> $$0x.a(mr.i, mq.G(cwr.he))))
      .put(cwr.aW, ms.d.get(cwr.aW).a($$0x -> {
         $$0x.a(mr.d, mq.a(cwr.aV, "_top"));
         $$0x.a(mr.i, mq.G(cwr.aW));
      }))
      .put(cwr.jq, ms.d.get(cwr.jq).a($$0x -> {
         $$0x.a(mr.d, mq.a(cwr.jp, "_top"));
         $$0x.a(mr.i, mq.G(cwr.jq));
      }))
      .put(cwr.qM, ms.z.get(cwr.qM))
      .put(cwr.qH, ms.z.get(cwr.qH))
      .build();
   static final Map<kh.b, BiConsumer<lz.b, cwp>> h = ImmutableMap.builder()
      .put(kh.b.a, lz.b::a)
      .put(kh.b.e, lz.b::l)
      .put(kh.b.b, lz.b::k)
      .put(kh.b.c, lz.b::k)
      .put(kh.b.f, lz.b::c)
      .put(kh.b.g, lz.b::d)
      .put(kh.b.h, lz.b::e)
      .put(kh.b.i, lz.b::f)
      .put(kh.b.k, lz.b::h)
      .put(kh.b.l, lz.b::i)
      .put(kh.b.m, lz.b::j)
      .put(kh.b.n, lz.b::g)
      .put(kh.b.p, lz.b::m)
      .put(kh.b.q, lz.b::b)
      .build();
   public static final List<Pair<djx, Function<ahg, mi>>> a = List.of(
      Pair.of(djw.L, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0)),
      Pair.of(djw.M, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.b, mj.a.b).a(mj.d, true)),
      Pair.of(djw.N, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.b, mj.a.c).a(mj.d, true)),
      Pair.of(djw.O, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.b, mj.a.d).a(mj.d, true)),
      Pair.of(djw.J, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.a, mj.a.d).a(mj.d, true)),
      Pair.of(djw.K, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.a, mj.a.b).a(mj.d, true))
   );
   private static final Map<lz.d, ahg> i = new HashMap<>();

   private static mc a(cwp $$0, ahg $$1, mq $$2, BiConsumer<ahg, Supplier<JsonElement>> $$3) {
      ahg $$4 = mp.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static mc b(cwp $$0, ahg $$1, mq $$2, BiConsumer<ahg, Supplier<JsonElement>> $$3) {
      ahg $$4 = mp.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static mc c(cwp $$0, ahg $$1, mq $$2, BiConsumer<ahg, Supplier<JsonElement>> $$3) {
      ahg $$4 = mp.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public lz(Consumer<mc> $$0, BiConsumer<ahg, Supplier<JsonElement>> $$1, Consumer<cms> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cwp $$0) {
      this.d.accept($$0.k());
   }

   void a(cwp $$0, ahg $$1) {
      this.c.accept(mn.a($$0.k()), new mm($$1));
   }

   private void a(cms $$0, ahg $$1) {
      this.c.accept(mn.a($$0), new mm($$1));
   }

   void a(cms $$0) {
      mp.bx.a(mn.a($$0), mq.b($$0), this.c);
   }

   private void d(cwp $$0) {
      cms $$1 = $$0.k();
      if ($$1 != cna.a) {
         mp.bx.a(mn.a($$1), mq.F($$0), this.c);
      }
   }

   private void a(cwp $$0, String $$1) {
      cms $$2 = $$0.k();
      mp.bx.a(mn.a($$2), mq.k(mq.a($$0, $$1)), this.c);
   }

   private static mg b() {
      return mg.a(djw.R).a(ic.f, mi.a().a(mj.b, mj.a.b)).a(ic.d, mi.a().a(mj.b, mj.a.c)).a(ic.e, mi.a().a(mj.b, mj.a.d)).a(ic.c, mi.a());
   }

   private static mg c() {
      return mg.a(djw.R).a(ic.d, mi.a()).a(ic.e, mi.a().a(mj.b, mj.a.b)).a(ic.c, mi.a().a(mj.b, mj.a.c)).a(ic.f, mi.a().a(mj.b, mj.a.d));
   }

   private static mg d() {
      return mg.a(djw.R).a(ic.f, mi.a()).a(ic.d, mi.a().a(mj.b, mj.a.b)).a(ic.e, mi.a().a(mj.b, mj.a.c)).a(ic.c, mi.a().a(mj.b, mj.a.d));
   }

   private static mg e() {
      return mg.a(djw.P)
         .a(ic.a, mi.a().a(mj.a, mj.a.b))
         .a(ic.b, mi.a().a(mj.a, mj.a.d))
         .a(ic.c, mi.a())
         .a(ic.d, mi.a().a(mj.b, mj.a.c))
         .a(ic.e, mi.a().a(mj.b, mj.a.d))
         .a(ic.f, mi.a().a(mj.b, mj.a.b));
   }

   private static mf b(cwp $$0, ahg $$1) {
      return mf.a($$0, a($$1));
   }

   private static mi[] a(ahg $$0) {
      return new mi[]{mi.a().a(mj.c, $$0), mi.a().a(mj.c, $$0).a(mj.b, mj.a.b), mi.a().a(mj.c, $$0).a(mj.b, mj.a.c), mi.a().a(mj.c, $$0).a(mj.b, mj.a.d)};
   }

   private static mf a(cwp $$0, ahg $$1, ahg $$2) {
      return mf.a($$0, mi.a().a(mj.c, $$1), mi.a().a(mj.c, $$2), mi.a().a(mj.c, $$1).a(mj.b, mj.a.c), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c));
   }

   private static mg a(djx $$0, ahg $$1, ahg $$2) {
      return mg.a($$0).a(true, mi.a().a(mj.c, $$1)).a(false, mi.a().a(mj.c, $$2));
   }

   private void e(cwp $$0) {
      ahg $$1 = ms.a.create($$0, this.c);
      ahg $$2 = ms.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cwp $$0) {
      ahg $$1 = ms.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cwp $$0) {
      this.b.accept(mf.a($$0).a(mg.a(djw.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ahg $$3 = mq.a($$0, $$2);
         return mi.a().a(mj.c, mp.c.a($$0, $$2, new mq().a(mr.a, $$3), this.c));
      })));
      this.a($$0, mq.a($$0, "_0"));
   }

   static mc b(cwp $$0, ahg $$1, ahg $$2) {
      return mf.a($$0)
         .a(mg.a(djw.w).a(false, mi.a().a(mj.c, $$1)).a(true, mi.a().a(mj.c, $$2)))
         .a(
            mg.a(djw.U, djw.R)
               .a(djr.a, ic.f, mi.a().a(mj.b, mj.a.b))
               .a(djr.a, ic.e, mi.a().a(mj.b, mj.a.d))
               .a(djr.a, ic.d, mi.a().a(mj.b, mj.a.c))
               .a(djr.a, ic.c, mi.a())
               .a(djr.b, ic.f, mi.a().a(mj.b, mj.a.b).a(mj.a, mj.a.b).a(mj.d, true))
               .a(djr.b, ic.e, mi.a().a(mj.b, mj.a.d).a(mj.a, mj.a.b).a(mj.d, true))
               .a(djr.b, ic.d, mi.a().a(mj.b, mj.a.c).a(mj.a, mj.a.b).a(mj.d, true))
               .a(djr.b, ic.c, mi.a().a(mj.a, mj.a.b).a(mj.d, true))
               .a(djr.c, ic.f, mi.a().a(mj.b, mj.a.d).a(mj.a, mj.a.c))
               .a(djr.c, ic.e, mi.a().a(mj.b, mj.a.b).a(mj.a, mj.a.c))
               .a(djr.c, ic.d, mi.a().a(mj.a, mj.a.c))
               .a(djr.c, ic.c, mi.a().a(mj.b, mj.a.c).a(mj.a, mj.a.c))
         );
   }

   private static mg.d<ic, dkc, dkb, Boolean> a(mg.d<ic, dkc, dkb, Boolean> $$0, dkc $$1, ahg $$2, ahg $$3, ahg $$4, ahg $$5) {
      return $$0.a(ic.f, $$1, dkb.a, false, mi.a().a(mj.c, $$2))
         .a(ic.d, $$1, dkb.a, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
         .a(ic.e, $$1, dkb.a, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
         .a(ic.c, $$1, dkb.a, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
         .a(ic.f, $$1, dkb.b, false, mi.a().a(mj.c, $$4))
         .a(ic.d, $$1, dkb.b, false, mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
         .a(ic.e, $$1, dkb.b, false, mi.a().a(mj.c, $$4).a(mj.b, mj.a.c))
         .a(ic.c, $$1, dkb.b, false, mi.a().a(mj.c, $$4).a(mj.b, mj.a.d))
         .a(ic.f, $$1, dkb.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
         .a(ic.d, $$1, dkb.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
         .a(ic.e, $$1, dkb.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
         .a(ic.c, $$1, dkb.a, true, mi.a().a(mj.c, $$3))
         .a(ic.f, $$1, dkb.b, true, mi.a().a(mj.c, $$5).a(mj.b, mj.a.d))
         .a(ic.d, $$1, dkb.b, true, mi.a().a(mj.c, $$5))
         .a(ic.e, $$1, dkb.b, true, mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
         .a(ic.c, $$1, dkb.b, true, mi.a().a(mj.c, $$5).a(mj.b, mj.a.c));
   }

   private static mc a(cwp $$0, ahg $$1, ahg $$2, ahg $$3, ahg $$4, ahg $$5, ahg $$6, ahg $$7, ahg $$8) {
      return mf.a($$0).a(a(a(mg.a(djw.R, djw.ae, djw.be, djw.u), dkc.b, $$1, $$2, $$3, $$4), dkc.a, $$5, $$6, $$7, $$8));
   }

   static mc a(cwp $$0, ahg $$1, ahg $$2, ahg $$3, ahg $$4, ahg $$5) {
      return me.a($$0)
         .a(mi.a().a(mj.c, $$1))
         .a(md.a().a(djw.L, true), mi.a().a(mj.c, $$2).a(mj.d, false))
         .a(md.a().a(djw.M, true), mi.a().a(mj.c, $$3).a(mj.d, false))
         .a(md.a().a(djw.N, true), mi.a().a(mj.c, $$4).a(mj.d, false))
         .a(md.a().a(djw.O, true), mi.a().a(mj.c, $$5).a(mj.d, false));
   }

   static mc c(cwp $$0, ahg $$1, ahg $$2) {
      return me.a($$0)
         .a(mi.a().a(mj.c, $$1))
         .a(md.a().a(djw.L, true), mi.a().a(mj.c, $$2).a(mj.d, true))
         .a(md.a().a(djw.M, true), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true))
         .a(md.a().a(djw.N, true), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true))
         .a(md.a().a(djw.O, true), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true));
   }

   static mc a(cwp $$0, ahg $$1, ahg $$2, ahg $$3) {
      return me.a($$0)
         .a(md.a().a(djw.J, true), mi.a().a(mj.c, $$1))
         .a(md.a().a(djw.X, dks.b), mi.a().a(mj.c, $$2).a(mj.d, true))
         .a(md.a().a(djw.W, dks.b), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true))
         .a(md.a().a(djw.Y, dks.b), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true))
         .a(md.a().a(djw.Z, dks.b), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true))
         .a(md.a().a(djw.X, dks.c), mi.a().a(mj.c, $$3).a(mj.d, true))
         .a(md.a().a(djw.W, dks.c), mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true))
         .a(md.a().a(djw.Y, dks.c), mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true))
         .a(md.a().a(djw.Z, dks.c), mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true));
   }

   static mc a(cwp $$0, ahg $$1, ahg $$2, ahg $$3, ahg $$4, boolean $$5) {
      return mf.a($$0, mi.a().a(mj.d, $$5))
         .a(c())
         .a(
            mg.a(djw.q, djw.u)
               .a(false, false, mi.a().a(mj.c, $$2))
               .a(true, false, mi.a().a(mj.c, $$4))
               .a(false, true, mi.a().a(mj.c, $$1))
               .a(true, true, mi.a().a(mj.c, $$3))
         );
   }

   static mc b(cwp $$0, ahg $$1, ahg $$2, ahg $$3) {
      return mf.a($$0)
         .a(
            mg.a(djw.R, djw.af, djw.bi)
               .a(ic.f, dkf.b, dkp.a, mi.a().a(mj.c, $$2))
               .a(ic.e, dkf.b, dkp.a, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkf.b, dkp.a, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkf.b, dkp.a, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkf.b, dkp.e, mi.a().a(mj.c, $$3))
               .a(ic.e, dkf.b, dkp.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkf.b, dkp.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkf.b, dkp.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkf.b, dkp.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.e, dkf.b, dkp.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.d, dkf.b, dkp.d, mi.a().a(mj.c, $$3))
               .a(ic.c, dkf.b, dkp.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.f, dkf.b, dkp.c, mi.a().a(mj.c, $$1))
               .a(ic.e, dkf.b, dkp.c, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkf.b, dkp.c, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkf.b, dkp.c, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkf.b, dkp.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.e, dkf.b, dkp.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.d, dkf.b, dkp.b, mi.a().a(mj.c, $$1))
               .a(ic.c, dkf.b, dkp.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.f, dkf.a, dkp.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.e, dkf.a, dkp.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkf.a, dkp.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkf.a, dkp.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkf.a, dkp.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.e, dkf.a, dkp.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.d, dkf.a, dkp.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.c, dkf.a, dkp.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.f, dkf.a, dkp.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.e, dkf.a, dkp.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkf.a, dkp.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkf.a, dkp.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkf.a, dkp.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.e, dkf.a, dkp.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.d, dkf.a, dkp.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.c, dkf.a, dkp.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.f, dkf.a, dkp.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.e, dkf.a, dkp.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkf.a, dkp.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkf.a, dkp.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
         );
   }

   private static mc c(cwp $$0, ahg $$1, ahg $$2, ahg $$3) {
      return mf.a($$0)
         .a(
            mg.a(djw.R, djw.af, djw.u)
               .a(ic.c, dkf.b, false, mi.a().a(mj.c, $$2))
               .a(ic.d, dkf.b, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
               .a(ic.f, dkf.b, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
               .a(ic.e, dkf.b, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
               .a(ic.c, dkf.a, false, mi.a().a(mj.c, $$1))
               .a(ic.d, dkf.a, false, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
               .a(ic.f, dkf.a, false, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
               .a(ic.e, dkf.a, false, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
               .a(ic.c, dkf.b, true, mi.a().a(mj.c, $$3))
               .a(ic.d, dkf.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(ic.f, dkf.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(ic.e, dkf.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               .a(ic.c, dkf.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.c))
               .a(ic.d, dkf.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.a))
               .a(ic.f, dkf.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.d))
               .a(ic.e, dkf.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.b))
         );
   }

   private static mc d(cwp $$0, ahg $$1, ahg $$2, ahg $$3) {
      return mf.a($$0)
         .a(
            mg.a(djw.R, djw.af, djw.u)
               .a(ic.c, dkf.b, false, mi.a().a(mj.c, $$2))
               .a(ic.d, dkf.b, false, mi.a().a(mj.c, $$2))
               .a(ic.f, dkf.b, false, mi.a().a(mj.c, $$2))
               .a(ic.e, dkf.b, false, mi.a().a(mj.c, $$2))
               .a(ic.c, dkf.a, false, mi.a().a(mj.c, $$1))
               .a(ic.d, dkf.a, false, mi.a().a(mj.c, $$1))
               .a(ic.f, dkf.a, false, mi.a().a(mj.c, $$1))
               .a(ic.e, dkf.a, false, mi.a().a(mj.c, $$1))
               .a(ic.c, dkf.b, true, mi.a().a(mj.c, $$3))
               .a(ic.d, dkf.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(ic.f, dkf.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(ic.e, dkf.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               .a(ic.c, dkf.a, true, mi.a().a(mj.c, $$3))
               .a(ic.d, dkf.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(ic.f, dkf.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(ic.e, dkf.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
         );
   }

   static mf c(cwp $$0, ahg $$1) {
      return mf.a($$0, mi.a().a(mj.c, $$1));
   }

   private static mg f() {
      return mg.a(djw.I).a(ic.a.b, mi.a()).a(ic.a.c, mi.a().a(mj.a, mj.a.b)).a(ic.a.a, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b));
   }

   static mc a(cwp $$0, mq $$1, BiConsumer<ahg, Supplier<JsonElement>> $$2) {
      ahg $$3 = mp.g.a($$0, $$1, $$2);
      ahg $$4 = mp.h.a($$0, $$1, $$2);
      ahg $$5 = mp.i.a($$0, $$1, $$2);
      ahg $$6 = mp.j.a($$0, $$1, $$2);
      return mf.a($$0, mi.a().a(mj.c, $$6)).a(mg.a(djw.I).a(ic.a.a, mi.a().a(mj.c, $$3)).a(ic.a.b, mi.a().a(mj.c, $$4)).a(ic.a.c, mi.a().a(mj.c, $$5)));
   }

   static mc d(cwp $$0, ahg $$1) {
      return mf.a($$0, mi.a().a(mj.c, $$1)).a(f());
   }

   private void e(cwp $$0, ahg $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cwp $$0, ms.a $$1) {
      ahg $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cwp $$0, ms.a $$1) {
      ahg $$2 = $$1.create($$0, this.c);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, $$2)).a(b()));
   }

   static mc d(cwp $$0, ahg $$1, ahg $$2) {
      return mf.a($$0)
         .a(
            mg.a(djw.I)
               .a(ic.a.b, mi.a().a(mj.c, $$1))
               .a(ic.a.c, mi.a().a(mj.c, $$2).a(mj.a, mj.a.b))
               .a(ic.a.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.b).a(mj.b, mj.a.b))
         );
   }

   private void a(cwp $$0, ms.a $$1, ms.a $$2) {
      ahg $$3 = $$1.create($$0, this.c);
      ahg $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ahg a(cwp $$0, String $$1, mo $$2, Function<ahg, mq> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mq.a($$0, $$1)), this.c);
   }

   static mc e(cwp $$0, ahg $$1, ahg $$2) {
      return mf.a($$0).a(a(djw.w, $$2, $$1));
   }

   static mc e(cwp $$0, ahg $$1, ahg $$2, ahg $$3) {
      return mf.a($$0).a(mg.a(djw.bh).a(dko.b, mi.a().a(mj.c, $$1)).a(dko.a, mi.a().a(mj.c, $$2)).a(dko.c, mi.a().a(mj.c, $$3)));
   }

   public void a(cwp $$0) {
      this.b($$0, ms.a);
   }

   public void b(cwp $$0, ms.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cwp $$0, mq $$1, mo $$2) {
      ahg $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private lz.b h(cwp $$0) {
      ms $$1 = this.g.getOrDefault($$0, ms.a.get($$0));
      return new lz.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cwp $$0, cwp $$1, cwp $$2) {
      mq $$3 = mq.u($$0);
      ahg $$4 = mp.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(cwp $$0) {
      mq $$1 = mq.t($$0);
      ahg $$2 = mp.v.a($$0, $$1, this.c);
      ahg $$3 = mp.w.a($$0, $$1, this.c);
      ahg $$4 = mp.x.a($$0, $$1, this.c);
      ahg $$5 = mp.y.a($$0, $$1, this.c);
      ahg $$6 = mp.z.a($$0, $$1, this.c);
      ahg $$7 = mp.A.a($$0, $$1, this.c);
      ahg $$8 = mp.B.a($$0, $$1, this.c);
      ahg $$9 = mp.C.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(cwp $$0, cwp $$1) {
      ahg $$2 = mp.v.a($$0);
      ahg $$3 = mp.w.a($$0);
      ahg $$4 = mp.x.a($$0);
      ahg $$5 = mp.y.a($$0);
      ahg $$6 = mp.z.a($$0);
      ahg $$7 = mp.A.a($$0);
      ahg $$8 = mp.B.a($$0);
      ahg $$9 = mp.C.a($$0);
      this.a($$1, mn.a($$0.k()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cwp $$0) {
      mq $$1 = mq.b($$0);
      ahg $$2 = mp.ak.a($$0, $$1, this.c);
      ahg $$3 = mp.al.a($$0, $$1, this.c);
      ahg $$4 = mp.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cwp $$0) {
      mq $$1 = mq.b($$0);
      ahg $$2 = mp.ah.a($$0, $$1, this.c);
      ahg $$3 = mp.ai.a($$0, $$1, this.c);
      ahg $$4 = mp.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(cwp $$0, cwp $$1) {
      ahg $$2 = mp.ah.a($$0);
      ahg $$3 = mp.ai.a($$0);
      ahg $$4 = mp.aj.a($$0);
      this.a($$1, mn.a($$0.k()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(cwr.sD);
      ahg $$0 = mn.a(cwr.sD);
      ahg $$1 = mn.a(cwr.sD, "_partial_tilt");
      ahg $$2 = mn.a(cwr.sD, "_full_tilt");
      this.b
         .accept(
            mf.a(cwr.sD)
               .a(b())
               .a(mg.a(djw.bl).a(dkr.a, mi.a().a(mj.c, $$0)).a(dkr.b, mi.a().a(mj.c, $$0)).a(dkr.c, mi.a().a(mj.c, $$1)).a(dkr.d, mi.a().a(mj.c, $$2)))
         );
   }

   private lz.f l(cwp $$0) {
      return new lz.f(mq.n($$0));
   }

   private void m(cwp $$0) {
      this.c($$0, $$0);
   }

   private void c(cwp $$0, cwp $$1) {
      this.b.accept(c($$0, mn.a($$1)));
   }

   private void a(cwp $$0, lz.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cwp $$0, lz.e $$1, mq $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cwp $$0, lz.e $$1) {
      mq $$2 = mq.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cwp $$0, lz.e $$1, mq $$2) {
      ahg $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cwp $$0, lz.e $$1, dkj<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         mg $$4 = mg.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mq $$5 = mq.c(mq.a($$0, $$4x));
            ahg $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return mi.a().a(mj.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(mf.a($$0).a($$4));
      }
   }

   private void a(cwp $$0, cwp $$1, lz.e $$2) {
      this.a($$0, $$2);
      mq $$3 = mq.d($$0);
      ahg $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(cwp $$0, cwp $$1) {
      ms $$2 = ms.p.get($$0);
      ahg $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ahg $$4 = mp.aC.a($$1, $$2.b(), this.c);
      this.b.accept(mf.a($$1, mi.a().a(mj.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(cwp $$0, cwp $$1) {
      this.a($$0.k());
      mq $$2 = mq.h($$0);
      mq $$3 = mq.a($$0, $$1);
      ahg $$4 = mp.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            mf.a($$1, mi.a().a(mj.c, $$4))
               .a(mg.a(djw.R).a(ic.e, mi.a()).a(ic.d, mi.a().a(mj.b, mj.a.d)).a(ic.c, mi.a().a(mj.b, mj.a.b)).a(ic.f, mi.a().a(mj.b, mj.a.c)))
         );
      this.b.accept(mf.a($$0).a(mg.a(djw.av).a($$2x -> mi.a().a(mj.c, mp.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cwp $$0 = cwr.kC;
      this.a($$0.k());
      ahg $$1 = mn.a($$0, "_top");
      ahg $$2 = mn.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cwp $$0 = cwr.kB;
      this.a($$0.k());
      mg $$1 = mg.a(dcd.d, djw.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> mi.a().a(mj.c, mn.a($$0, "_top_stage_" + $$1x));
            case b -> mi.a().a(mj.c, mn.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mf.a($$0).a($$1));
   }

   private void a(cwp $$0, cwp $$1, cwp $$2, cwp $$3, cwp $$4, cwp $$5, cwp $$6, cwp $$7) {
      this.a($$0, lz.e.b);
      this.a($$1, lz.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(cwp $$0, lz.e $$1) {
      this.a($$0, "_top");
      ahg $$2 = this.a($$0, "_top", $$1.a(), mq::c);
      ahg $$3 = this.a($$0, "_bottom", $$1.a(), mq::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cwr.iD, "_front");
      ahg $$0 = mn.a(cwr.iD, "_top");
      ahg $$1 = this.a(cwr.iD, "_bottom", lz.e.b.a(), mq::c);
      this.f(cwr.iD, $$0, $$1);
   }

   private void k() {
      ahg $$0 = this.a(cwr.bx, "_top", mp.bk, mq::a);
      ahg $$1 = this.a(cwr.bx, "_bottom", mp.bk, mq::a);
      this.f(cwr.bx, $$0, $$1);
   }

   private void l() {
      this.c(cwr.sF);
      ahg $$0 = mn.a(cwr.sF, "_top");
      ahg $$1 = mn.a(cwr.sF, "_bottom");
      this.b.accept(mf.a(cwr.sF).a(b()).a(mg.a(djw.ae).a(dkc.b, mi.a().a(mj.c, $$1)).a(dkc.a, mi.a().a(mj.c, $$0))));
   }

   private void f(cwp $$0, ahg $$1, ahg $$2) {
      this.b.accept(mf.a($$0).a(mg.a(djw.ae).a(dkc.b, mi.a().a(mj.c, $$2)).a(dkc.a, mi.a().a(mj.c, $$1))));
   }

   private void n(cwp $$0) {
      mq $$1 = mq.e($$0);
      mq $$2 = mq.e(mq.a($$0, "_corner"));
      ahg $$3 = mp.as.a($$0, $$1, this.c);
      ahg $$4 = mp.at.a($$0, $$2, this.c);
      ahg $$5 = mp.au.a($$0, $$1, this.c);
      ahg $$6 = mp.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            mf.a($$0)
               .a(
                  mg.a(djw.ag)
                     .a(dkk.a, mi.a().a(mj.c, $$3))
                     .a(dkk.b, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
                     .a(dkk.c, mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
                     .a(dkk.d, mi.a().a(mj.c, $$6).a(mj.b, mj.a.b))
                     .a(dkk.e, mi.a().a(mj.c, $$5))
                     .a(dkk.f, mi.a().a(mj.c, $$6))
                     .a(dkk.g, mi.a().a(mj.c, $$4))
                     .a(dkk.h, mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
                     .a(dkk.i, mi.a().a(mj.c, $$4).a(mj.b, mj.a.c))
                     .a(dkk.j, mi.a().a(mj.c, $$4).a(mj.b, mj.a.d))
               )
         );
   }

   private void o(cwp $$0) {
      ahg $$1 = this.a($$0, "", mp.as, mq::e);
      ahg $$2 = this.a($$0, "", mp.au, mq::e);
      ahg $$3 = this.a($$0, "", mp.av, mq::e);
      ahg $$4 = this.a($$0, "_on", mp.as, mq::e);
      ahg $$5 = this.a($$0, "_on", mp.au, mq::e);
      ahg $$6 = this.a($$0, "_on", mp.av, mq::e);
      mg $$7 = mg.a(djw.w, djw.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return mi.a().a(mj.c, $$6x ? $$4 : $$1);
            case b:
               return mi.a().a(mj.c, $$6x ? $$4 : $$1).a(mj.b, mj.a.b);
            case c:
               return mi.a().a(mj.c, $$6x ? $$5 : $$2).a(mj.b, mj.a.b);
            case d:
               return mi.a().a(mj.c, $$6x ? $$6 : $$3).a(mj.b, mj.a.b);
            case e:
               return mi.a().a(mj.c, $$6x ? $$5 : $$2);
            case f:
               return mi.a().a(mj.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(mf.a($$0).a($$7));
   }

   private lz.a a(ahg $$0, cwp $$1) {
      return new lz.a($$0, $$1);
   }

   private lz.a f(cwp $$0, cwp $$1) {
      return new lz.a(mn.a($$0), $$1);
   }

   private void a(cwp $$0, cms $$1) {
      ahg $$2 = mp.aa.a($$0, mq.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cwp $$0, ahg $$1) {
      ahg $$2 = mp.aa.a($$0, mq.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(cwp $$0, cwp $$1) {
      this.a($$0);
      ahg $$2 = ms.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cwp $$0) {
      this.a($$0.k());
      ahg $$1 = ms.k.create($$0, this.c);
      ahg $$2 = ms.l.create($$0, this.c);
      ahg $$3 = ms.m.create($$0, this.c);
      ahg $$4 = ms.n.create($$0, this.c);
      this.b
         .accept(
            me.a($$0)
               .a(md.a().a(djw.S, 1, 2, 3, 4).a(djw.R, ic.c), mi.a().a(mj.c, $$1))
               .a(md.a().a(djw.S, 1, 2, 3, 4).a(djw.R, ic.f), mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
               .a(md.a().a(djw.S, 1, 2, 3, 4).a(djw.R, ic.d), mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
               .a(md.a().a(djw.S, 1, 2, 3, 4).a(djw.R, ic.e), mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
               .a(md.a().a(djw.S, 2, 3, 4).a(djw.R, ic.c), mi.a().a(mj.c, $$2))
               .a(md.a().a(djw.S, 2, 3, 4).a(djw.R, ic.f), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
               .a(md.a().a(djw.S, 2, 3, 4).a(djw.R, ic.d), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
               .a(md.a().a(djw.S, 2, 3, 4).a(djw.R, ic.e), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
               .a(md.a().a(djw.S, 3, 4).a(djw.R, ic.c), mi.a().a(mj.c, $$3))
               .a(md.a().a(djw.S, 3, 4).a(djw.R, ic.f), mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(md.a().a(djw.S, 3, 4).a(djw.R, ic.d), mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(md.a().a(djw.S, 3, 4).a(djw.R, ic.e), mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               .a(md.a().a(djw.S, 4).a(djw.R, ic.c), mi.a().a(mj.c, $$4))
               .a(md.a().a(djw.S, 4).a(djw.R, ic.f), mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
               .a(md.a().a(djw.S, 4).a(djw.R, ic.d), mi.a().a(mj.c, $$4).a(mj.b, mj.a.c))
               .a(md.a().a(djw.S, 4).a(djw.R, ic.e), mi.a().a(mj.c, $$4).a(mj.b, mj.a.d))
         );
   }

   private void a(ms.a $$0, cwp... $$1) {
      for (cwp $$2 : $$1) {
         ahg $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ms.a $$0, cwp... $$1) {
      for (cwp $$2 : $$1) {
         ahg $$3 = $$0.create($$2, this.c);
         this.b.accept(mf.a($$2, mi.a().a(mj.c, $$3)).a(c()));
      }
   }

   private void h(cwp $$0, cwp $$1) {
      this.a($$0);
      mq $$2 = mq.b($$0, $$1);
      ahg $$3 = mp.aI.a($$1, $$2, this.c);
      ahg $$4 = mp.aJ.a($$1, $$2, this.c);
      ahg $$5 = mp.aK.a($$1, $$2, this.c);
      ahg $$6 = mp.aG.a($$1, $$2, this.c);
      ahg $$7 = mp.aH.a($$1, $$2, this.c);
      cms $$8 = $$1.k();
      mp.bx.a(mn.a($$8), mq.F($$0), this.c);
      this.b
         .accept(
            me.a($$1)
               .a(mi.a().a(mj.c, $$3))
               .a(md.a().a(djw.L, true), mi.a().a(mj.c, $$4))
               .a(md.a().a(djw.M, true), mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
               .a(md.a().a(djw.N, true), mi.a().a(mj.c, $$5))
               .a(md.a().a(djw.O, true), mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
               .a(md.a().a(djw.L, false), mi.a().a(mj.c, $$6))
               .a(md.a().a(djw.M, false), mi.a().a(mj.c, $$7))
               .a(md.a().a(djw.N, false), mi.a().a(mj.c, $$7).a(mj.b, mj.a.b))
               .a(md.a().a(djw.O, false), mi.a().a(mj.c, $$6).a(mj.b, mj.a.d))
         );
   }

   private void q(cwp $$0) {
      mq $$1 = mq.z($$0);
      ahg $$2 = mp.aL.a($$0, $$1, this.c);
      ahg $$3 = this.a($$0, "_conditional", mp.aL, $$1x -> $$1.c(mr.i, $$1x));
      this.b.accept(mf.a($$0).a(a(djw.c, $$3, $$2)).a(e()));
   }

   private void r(cwp $$0) {
      ahg $$1 = ms.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<mi> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> mi.a().a(mj.c, mn.a(cwr.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cwr.mZ);
      this.b
         .accept(
            me.a(cwr.mZ)
               .a(md.a().a(djw.aq, 0), this.a(0))
               .a(md.a().a(djw.aq, 1), this.a(1))
               .a(md.a().a(djw.bk, djs.b), mi.a().a(mj.c, mn.a(cwr.mZ, "_small_leaves")))
               .a(md.a().a(djw.bk, djs.c), mi.a().a(mj.c, mn.a(cwr.mZ, "_large_leaves")))
         );
   }

   private mg n() {
      return mg.a(djw.P)
         .a(ic.a, mi.a().a(mj.a, mj.a.c))
         .a(ic.b, mi.a())
         .a(ic.c, mi.a().a(mj.a, mj.a.b))
         .a(ic.d, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.c))
         .a(ic.e, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.d))
         .a(ic.f, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b));
   }

   private void o() {
      ahg $$0 = mq.a(cwr.nU, "_top_open");
      this.b
         .accept(
            mf.a(cwr.nU)
               .a(this.n())
               .a(
                  mg.a(djw.u)
                     .a(false, mi.a().a(mj.c, ms.f.create(cwr.nU, this.c)))
                     .a(true, mi.a().a(mj.c, ms.f.get(cwr.nU).a($$1 -> $$1.a(mr.f, $$0)).a(cwr.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mg a(dkj<T> $$0, T $$1, ahg $$2, ahg $$3) {
      mi $$4 = mi.a().a(mj.c, $$2);
      mi $$5 = mi.a().a(mj.c, $$3);
      return mg.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cwp $$0, Function<cwp, mq> $$1) {
      mq $$2 = $$1.apply($$0).b(mr.i, mr.c);
      mq $$3 = $$2.c(mr.g, mq.a($$0, "_front_honey"));
      ahg $$4 = mp.q.a($$0, $$2, this.c);
      ahg $$5 = mp.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(mf.a($$0).a(b()).a(a(djw.aN, 5, $$5, $$4)));
   }

   private void a(cwp $$0, dkj<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ahg> $$3 = new Int2ObjectOpenHashMap();
         mg $$4 = mg.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ahg $$5 = (ahg)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mp.aV, mq::g));
            return mi.a().a(mj.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(mf.a($$0).a($$4));
      }
   }

   private void p() {
      ahg $$0 = mn.a(cwr.od, "_floor");
      ahg $$1 = mn.a(cwr.od, "_ceiling");
      ahg $$2 = mn.a(cwr.od, "_wall");
      ahg $$3 = mn.a(cwr.od, "_between_walls");
      this.a(cna.wf);
      this.b
         .accept(
            mf.a(cwr.od)
               .a(
                  mg.a(djw.R, djw.V)
                     .a(ic.c, dju.a, mi.a().a(mj.c, $$0))
                     .a(ic.d, dju.a, mi.a().a(mj.c, $$0).a(mj.b, mj.a.c))
                     .a(ic.f, dju.a, mi.a().a(mj.c, $$0).a(mj.b, mj.a.b))
                     .a(ic.e, dju.a, mi.a().a(mj.c, $$0).a(mj.b, mj.a.d))
                     .a(ic.c, dju.b, mi.a().a(mj.c, $$1))
                     .a(ic.d, dju.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
                     .a(ic.f, dju.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
                     .a(ic.e, dju.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
                     .a(ic.c, dju.c, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
                     .a(ic.d, dju.c, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
                     .a(ic.f, dju.c, mi.a().a(mj.c, $$2))
                     .a(ic.e, dju.c, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
                     .a(ic.d, dju.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
                     .a(ic.c, dju.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
                     .a(ic.f, dju.d, mi.a().a(mj.c, $$3))
                     .a(ic.e, dju.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mf.a(cwr.nZ, mi.a().a(mj.c, mn.a(cwr.nZ)))
               .a(
                  mg.a(djw.U, djw.R)
                     .a(djr.a, ic.c, mi.a())
                     .a(djr.a, ic.f, mi.a().a(mj.b, mj.a.b))
                     .a(djr.a, ic.d, mi.a().a(mj.b, mj.a.c))
                     .a(djr.a, ic.e, mi.a().a(mj.b, mj.a.d))
                     .a(djr.b, ic.c, mi.a().a(mj.a, mj.a.b))
                     .a(djr.b, ic.f, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b))
                     .a(djr.b, ic.d, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.c))
                     .a(djr.b, ic.e, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.d))
                     .a(djr.c, ic.d, mi.a().a(mj.a, mj.a.c))
                     .a(djr.c, ic.e, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.b))
                     .a(djr.c, ic.c, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.c))
                     .a(djr.c, ic.f, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.d))
               )
         );
   }

   private void d(cwp $$0, ms.a $$1) {
      ahg $$2 = $$1.create($$0, this.c);
      ahg $$3 = mq.a($$0, "_front_on");
      ahg $$4 = $$1.get($$0).a($$1x -> $$1x.a(mr.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mf.a($$0).a(a(djw.r, $$4, $$2)).a(b()));
   }

   private void a(cwp... $$0) {
      ahg $$1 = mn.a("campfire_off");

      for (cwp $$2 : $$0) {
         ahg $$3 = mp.bc.a($$2, mq.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(mf.a($$2).a(a(djw.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cwp $$0) {
      ahg $$1 = mp.bt.a($$0, mq.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cwp $$0) {
      ahg $$1;
      if ($$0 == cwr.tj) {
         $$1 = mp.bv.a($$0, mq.m($$0), this.c);
      } else {
         $$1 = mp.bu.a($$0, mq.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mq $$0 = mq.a(mq.G(cwr.cl), mq.G(cwr.n));
      ahg $$1 = mp.j.a(cwr.cl, $$0, this.c);
      this.b.accept(c(cwr.cl, $$1));
   }

   private void s() {
      this.a(cna.lG);
      this.b
         .accept(
            me.a(cwr.cw)
               .a(
                  md.b(
                     md.a().a(djw.ab, dkl.c).a(djw.aa, dkl.c).a(djw.ac, dkl.c).a(djw.ad, dkl.c),
                     md.a().a(djw.ab, dkl.b, dkl.a).a(djw.aa, dkl.b, dkl.a),
                     md.a().a(djw.aa, dkl.b, dkl.a).a(djw.ac, dkl.b, dkl.a),
                     md.a().a(djw.ac, dkl.b, dkl.a).a(djw.ad, dkl.b, dkl.a),
                     md.a().a(djw.ad, dkl.b, dkl.a).a(djw.ab, dkl.b, dkl.a)
                  ),
                  mi.a().a(mj.c, mn.a("redstone_dust_dot"))
               )
               .a(md.a().a(djw.ab, dkl.b, dkl.a), mi.a().a(mj.c, mn.a("redstone_dust_side0")))
               .a(md.a().a(djw.ac, dkl.b, dkl.a), mi.a().a(mj.c, mn.a("redstone_dust_side_alt0")))
               .a(md.a().a(djw.aa, dkl.b, dkl.a), mi.a().a(mj.c, mn.a("redstone_dust_side_alt1")).a(mj.b, mj.a.d))
               .a(md.a().a(djw.ad, dkl.b, dkl.a), mi.a().a(mj.c, mn.a("redstone_dust_side1")).a(mj.b, mj.a.d))
               .a(md.a().a(djw.ab, dkl.a), mi.a().a(mj.c, mn.a("redstone_dust_up")))
               .a(md.a().a(djw.aa, dkl.a), mi.a().a(mj.c, mn.a("redstone_dust_up")).a(mj.b, mj.a.b))
               .a(md.a().a(djw.ac, dkl.a), mi.a().a(mj.c, mn.a("redstone_dust_up")).a(mj.b, mj.a.c))
               .a(md.a().a(djw.ad, dkl.a), mi.a().a(mj.c, mn.a("redstone_dust_up")).a(mj.b, mj.a.d))
         );
   }

   private void t() {
      this.a(cna.lK);
      this.b
         .accept(
            mf.a(cwr.gY)
               .a(c())
               .a(
                  mg.a(djw.bd, djw.w)
                     .a(djz.a, false, mi.a().a(mj.c, mn.a(cwr.gY)))
                     .a(djz.a, true, mi.a().a(mj.c, mn.a(cwr.gY, "_on")))
                     .a(djz.b, false, mi.a().a(mj.c, mn.a(cwr.gY, "_subtract")))
                     .a(djz.b, true, mi.a().a(mj.c, mn.a(cwr.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mq $$0 = mq.a(cwr.jR);
      mq $$1 = mq.a(mq.a(cwr.jE, "_side"), $$0.a(mr.f));
      ahg $$2 = mp.ab.a(cwr.jE, $$1, this.c);
      ahg $$3 = mp.ac.a(cwr.jE, $$1, this.c);
      ahg $$4 = mp.j.b(cwr.jE, "_double", $$1, this.c);
      this.b.accept(e(cwr.jE, $$2, $$3, $$4));
      this.b.accept(c(cwr.jR, mp.c.a(cwr.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cna.sn);
      this.b
         .accept(
            me.a(cwr.fs)
               .a(mi.a().a(mj.c, mq.G(cwr.fs)))
               .a(md.a().a(djw.k, true), mi.a().a(mj.c, mq.a(cwr.fs, "_bottle0")))
               .a(md.a().a(djw.l, true), mi.a().a(mj.c, mq.a(cwr.fs, "_bottle1")))
               .a(md.a().a(djw.m, true), mi.a().a(mj.c, mq.a(cwr.fs, "_bottle2")))
               .a(md.a().a(djw.k, false), mi.a().a(mj.c, mq.a(cwr.fs, "_empty0")))
               .a(md.a().a(djw.l, false), mi.a().a(mj.c, mq.a(cwr.fs, "_empty1")))
               .a(md.a().a(djw.m, false), mi.a().a(mj.c, mq.a(cwr.fs, "_empty2")))
         );
   }

   private void u(cwp $$0) {
      ahg $$1 = mp.bp.a($$0, mq.b($$0), this.c);
      ahg $$2 = mn.a("mushroom_block_inside");
      this.b
         .accept(
            me.a($$0)
               .a(md.a().a(djw.L, true), mi.a().a(mj.c, $$1))
               .a(md.a().a(djw.M, true), mi.a().a(mj.c, $$1).a(mj.b, mj.a.b).a(mj.d, true))
               .a(md.a().a(djw.N, true), mi.a().a(mj.c, $$1).a(mj.b, mj.a.c).a(mj.d, true))
               .a(md.a().a(djw.O, true), mi.a().a(mj.c, $$1).a(mj.b, mj.a.d).a(mj.d, true))
               .a(md.a().a(djw.J, true), mi.a().a(mj.c, $$1).a(mj.a, mj.a.d).a(mj.d, true))
               .a(md.a().a(djw.K, true), mi.a().a(mj.c, $$1).a(mj.a, mj.a.b).a(mj.d, true))
               .a(md.a().a(djw.L, false), mi.a().a(mj.c, $$2))
               .a(md.a().a(djw.M, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, false))
               .a(md.a().a(djw.N, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, false))
               .a(md.a().a(djw.O, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, false))
               .a(md.a().a(djw.J, false), mi.a().a(mj.c, $$2).a(mj.a, mj.a.d).a(mj.d, false))
               .a(md.a().a(djw.K, false), mi.a().a(mj.c, $$2).a(mj.a, mj.a.b).a(mj.d, false))
         );
      this.a($$0, ms.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cna.ry);
      this.b
         .accept(
            mf.a(cwr.eg)
               .a(
                  mg.a(djw.ay)
                     .a(0, mi.a().a(mj.c, mn.a(cwr.eg)))
                     .a(1, mi.a().a(mj.c, mn.a(cwr.eg, "_slice1")))
                     .a(2, mi.a().a(mj.c, mn.a(cwr.eg, "_slice2")))
                     .a(3, mi.a().a(mj.c, mn.a(cwr.eg, "_slice3")))
                     .a(4, mi.a().a(mj.c, mn.a(cwr.eg, "_slice4")))
                     .a(5, mi.a().a(mj.c, mn.a(cwr.eg, "_slice5")))
                     .a(6, mi.a().a(mj.c, mn.a(cwr.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mq $$0 = new mq()
         .a(mr.c, mq.a(cwr.nX, "_side3"))
         .a(mr.o, mq.G(cwr.t))
         .a(mr.n, mq.a(cwr.nX, "_top"))
         .a(mr.j, mq.a(cwr.nX, "_side3"))
         .a(mr.l, mq.a(cwr.nX, "_side3"))
         .a(mr.k, mq.a(cwr.nX, "_side1"))
         .a(mr.m, mq.a(cwr.nX, "_side2"));
      this.b.accept(c(cwr.nX, mp.a.a(cwr.nX, $$0, this.c)));
   }

   private void y() {
      mq $$0 = new mq()
         .a(mr.c, mq.a(cwr.ob, "_front"))
         .a(mr.o, mq.a(cwr.ob, "_bottom"))
         .a(mr.n, mq.a(cwr.ob, "_top"))
         .a(mr.j, mq.a(cwr.ob, "_front"))
         .a(mr.k, mq.a(cwr.ob, "_front"))
         .a(mr.l, mq.a(cwr.ob, "_side"))
         .a(mr.m, mq.a(cwr.ob, "_side"));
      this.b.accept(c(cwr.ob, mp.a.a(cwr.ob, $$0, this.c)));
   }

   private void a(cwp $$0, cwp $$1, BiFunction<cwp, cwp, mq> $$2) {
      mq $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mp.a.a($$0, $$3, this.c)));
   }

   public void b(cwp $$0) {
      mq $$1 = new mq()
         .a(mr.c, mq.a($$0, "_particle"))
         .a(mr.o, mq.a($$0, "_down"))
         .a(mr.n, mq.a($$0, "_up"))
         .a(mr.j, mq.a($$0, "_north"))
         .a(mr.k, mq.a($$0, "_south"))
         .a(mr.l, mq.a($$0, "_east"))
         .a(mr.m, mq.a($$0, "_west"));
      this.b.accept(c($$0, mp.a.a($$0, $$1, this.c)));
   }

   private void z() {
      mq $$0 = mq.k(cwr.eZ);
      this.b.accept(c(cwr.eZ, mn.a(cwr.eZ)));
      this.a(cwr.ee, $$0);
      this.a(cwr.ef, $$0);
   }

   private void a(cwp $$0, mq $$1) {
      ahg $$2 = mp.p.a($$0, $$1.c(mr.g, mq.G($$0)), this.c);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cna.so);
      this.m(cwr.ft);
      this.b.accept(c(cwr.fv, mp.bs.a(cwr.fv, mq.j(mq.a(cwr.H, "_still")), this.c)));
      this.b
         .accept(
            mf.a(cwr.fu)
               .a(
                  mg.a(dax.g)
                     .a(1, mi.a().a(mj.c, mp.bq.a(cwr.fu, "_level1", mq.j(mq.a(cwr.G, "_still")), this.c)))
                     .a(2, mi.a().a(mj.c, mp.br.a(cwr.fu, "_level2", mq.j(mq.a(cwr.G, "_still")), this.c)))
                     .a(3, mi.a().a(mj.c, mp.bs.a(cwr.fu, "_full", mq.j(mq.a(cwr.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mf.a(cwr.fw)
               .a(
                  mg.a(dax.g)
                     .a(1, mi.a().a(mj.c, mp.bq.a(cwr.fw, "_level1", mq.j(mq.G(cwr.qP)), this.c)))
                     .a(2, mi.a().a(mj.c, mp.br.a(cwr.fw, "_level2", mq.j(mq.G(cwr.qP)), this.c)))
                     .a(3, mi.a().a(mj.c, mp.bs.a(cwr.fw, "_full", mq.j(mq.G(cwr.qP)), this.c)))
               )
         );
   }

   private void B() {
      mq $$0 = mq.b(cwr.kv);
      ahg $$1 = mp.aE.a(cwr.kv, $$0, this.c);
      ahg $$2 = this.a(cwr.kv, "_dead", mp.aE, $$1x -> $$0.c(mr.b, $$1x));
      this.b.accept(mf.a(cwr.kv).a(a(djw.au, 5, $$2, $$1)));
   }

   private void C() {
      ahg $$0 = mn.a(cwr.tq);
      ahg $$1 = mn.a(cwr.tq, "_triggered");
      ahg $$2 = mn.a(cwr.tq, "_crafting");
      ahg $$3 = mn.a(cwr.tq, "_crafting_triggered");
      this.b
         .accept(
            mf.a(cwr.tq)
               .a(mg.a(djw.T).a($$0x -> this.a($$0x, mi.a())))
               .a(
                  mg.a(djw.A, cyi.b)
                     .a(false, false, mi.a().a(mj.c, $$0))
                     .a(true, true, mi.a().a(mj.c, $$3))
                     .a(true, false, mi.a().a(mj.c, $$1))
                     .a(false, true, mi.a().a(mj.c, $$2))
               )
         );
   }

   private void v(cwp $$0) {
      mq $$1 = new mq().a(mr.f, mq.a(cwr.cD, "_top")).a(mr.i, mq.a(cwr.cD, "_side")).a(mr.g, mq.a($$0, "_front"));
      mq $$2 = new mq().a(mr.i, mq.a(cwr.cD, "_top")).a(mr.g, mq.a($$0, "_front_vertical"));
      ahg $$3 = mp.p.a($$0, $$1, this.c);
      ahg $$4 = mp.r.a($$0, $$2, this.c);
      this.b
         .accept(
            mf.a($$0)
               .a(
                  mg.a(djw.P)
                     .a(ic.a, mi.a().a(mj.c, $$4).a(mj.a, mj.a.c))
                     .a(ic.b, mi.a().a(mj.c, $$4))
                     .a(ic.c, mi.a().a(mj.c, $$3))
                     .a(ic.f, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
                     .a(ic.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
                     .a(ic.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               )
         );
   }

   private void D() {
      ahg $$0 = mn.a(cwr.fy);
      ahg $$1 = mn.a(cwr.fy, "_filled");
      this.b.accept(mf.a(cwr.fy).a(mg.a(djw.h).a(false, mi.a().a(mj.c, $$0)).a(true, mi.a().a(mj.c, $$1))).a(c()));
   }

   private void E() {
      ahg $$0 = mn.a(cwr.ku, "_side");
      ahg $$1 = mn.a(cwr.ku, "_noside");
      ahg $$2 = mn.a(cwr.ku, "_noside1");
      ahg $$3 = mn.a(cwr.ku, "_noside2");
      ahg $$4 = mn.a(cwr.ku, "_noside3");
      this.b
         .accept(
            me.a(cwr.ku)
               .a(md.a().a(djw.L, true), mi.a().a(mj.c, $$0))
               .a(md.a().a(djw.M, true), mi.a().a(mj.c, $$0).a(mj.b, mj.a.b).a(mj.d, true))
               .a(md.a().a(djw.N, true), mi.a().a(mj.c, $$0).a(mj.b, mj.a.c).a(mj.d, true))
               .a(md.a().a(djw.O, true), mi.a().a(mj.c, $$0).a(mj.b, mj.a.d).a(mj.d, true))
               .a(md.a().a(djw.J, true), mi.a().a(mj.c, $$0).a(mj.a, mj.a.d).a(mj.d, true))
               .a(md.a().a(djw.K, true), mi.a().a(mj.c, $$0).a(mj.a, mj.a.b).a(mj.d, true))
               .a(md.a().a(djw.L, false), mi.a().a(mj.c, $$1).a(mj.e, 2), mi.a().a(mj.c, $$2), mi.a().a(mj.c, $$3), mi.a().a(mj.c, $$4))
               .a(
                  md.a().a(djw.M, false),
                  mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$4).a(mj.b, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.b, mj.a.b).a(mj.d, true)
               )
               .a(
                  md.a().a(djw.N, false),
                  mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true),
                  mi.a().a(mj.c, $$4).a(mj.b, mj.a.c).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.b, mj.a.c).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true)
               )
               .a(
                  md.a().a(djw.O, false),
                  mi.a().a(mj.c, $$4).a(mj.b, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.b, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true)
               )
               .a(
                  md.a().a(djw.J, false),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.a, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$4).a(mj.a, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.a, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.a, mj.a.d).a(mj.d, true)
               )
               .a(
                  md.a().a(djw.K, false),
                  mi.a().a(mj.c, $$4).a(mj.a, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.a, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.a, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.a, mj.a.b).a(mj.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            me.a(cwr.pc)
               .a(mi.a().a(mj.c, mq.G(cwr.pc)))
               .a(md.a().a(djw.aL, 1), mi.a().a(mj.c, mq.a(cwr.pc, "_contents1")))
               .a(md.a().a(djw.aL, 2), mi.a().a(mj.c, mq.a(cwr.pc, "_contents2")))
               .a(md.a().a(djw.aL, 3), mi.a().a(mj.c, mq.a(cwr.pc, "_contents3")))
               .a(md.a().a(djw.aL, 4), mi.a().a(mj.c, mq.a(cwr.pc, "_contents4")))
               .a(md.a().a(djw.aL, 5), mi.a().a(mj.c, mq.a(cwr.pc, "_contents5")))
               .a(md.a().a(djw.aL, 6), mi.a().a(mj.c, mq.a(cwr.pc, "_contents6")))
               .a(md.a().a(djw.aL, 7), mi.a().a(mj.c, mq.a(cwr.pc, "_contents7")))
               .a(md.a().a(djw.aL, 8), mi.a().a(mj.c, mq.a(cwr.pc, "_contents_ready")))
         );
   }

   private void w(cwp $$0) {
      ahg $$1 = mp.c.a($$0, mq.a($$0), this.c);
      ahg $$2 = this.a($$0, "_powered", mp.c, mq::b);
      ahg $$3 = this.a($$0, "_lit", mp.c, mq::b);
      ahg $$4 = this.a($$0, "_lit_powered", mp.c, mq::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private mc a(cwp $$0, ahg $$1, ahg $$2, ahg $$3, ahg $$4) {
      return mf.a($$0).a(mg.a(djw.r, djw.w).a(($$4x, $$5) -> $$4x ? mi.a().a(mj.c, $$5 ? $$4 : $$2) : mi.a().a(mj.c, $$5 ? $$3 : $$1)));
   }

   private void i(cwp $$0, cwp $$1) {
      ahg $$2 = mn.a($$0);
      ahg $$3 = mn.a($$0, "_powered");
      ahg $$4 = mn.a($$0, "_lit");
      ahg $$5 = mn.a($$0, "_lit_powered");
      this.a($$1, mn.a($$0.k()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(cwp $$0) {
      this.c($$0);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mp.ao.a($$0, mq.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(cwr.qy);
      this.x(cwr.qx);
      this.x(cwr.qw);
      this.x(cwr.qv);
   }

   private void H() {
      this.c(cwr.st);
      mg.b<ic, dkd> $$0 = mg.a(djw.bm, djw.bn);

      for (dkd $$1 : dkd.values()) {
         $$0.a(ic.b, $$1, this.a(ic.b, $$1));
      }

      for (dkd $$2 : dkd.values()) {
         $$0.a(ic.a, $$2, this.a(ic.a, $$2));
      }

      this.b.accept(mf.a(cwr.st).a($$0));
   }

   private mi a(ic $$0, dkd $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mq $$3 = mq.c(mq.a(cwr.st, $$2));
      return mi.a().a(mj.c, mp.an.a(cwr.st, $$2, $$3, this.c));
   }

   private void y(cwp $$0) {
      mq $$1 = new mq().a(mr.e, mq.G(cwr.dV)).a(mr.f, mq.G($$0)).a(mr.i, mq.a($$0, "_side"));
      this.b.accept(c($$0, mp.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ahg $$0 = mq.a(cwr.gZ, "_side");
      mq $$1 = new mq().a(mr.f, mq.a(cwr.gZ, "_top")).a(mr.i, $$0);
      mq $$2 = new mq().a(mr.f, mq.a(cwr.gZ, "_inverted_top")).a(mr.i, $$0);
      this.b
         .accept(
            mf.a(cwr.gZ)
               .a(mg.a(djw.p).a(false, mi.a().a(mj.c, mp.aF.a(cwr.gZ, $$1, this.c))).a(true, mi.a().a(mj.c, mp.aF.a(mn.a(cwr.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(cwp $$0) {
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mn.a($$0))).a(this.n()));
   }

   private void J() {
      cwp $$0 = cwr.ss;
      ahg $$1 = mn.a($$0, "_on");
      ahg $$2 = mn.a($$0);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mn.a($$0))).a(this.n()).a(a(djw.w, $$1, $$2)));
   }

   private void K() {
      mq $$0 = new mq().a(mr.B, mq.G(cwr.j)).a(mr.f, mq.G(cwr.cC));
      mq $$1 = new mq().a(mr.B, mq.G(cwr.j)).a(mr.f, mq.a(cwr.cC, "_moist"));
      ahg $$2 = mp.aW.a(cwr.cC, $$0, this.c);
      ahg $$3 = mp.aW.a(mq.a(cwr.cC, "_moist"), $$1, this.c);
      this.b.accept(mf.a(cwr.cC).a(a(djw.aQ, 7, $$3, $$2)));
   }

   private List<ahg> A(cwp $$0) {
      ahg $$1 = mp.aX.a(mn.a($$0, "_floor0"), mq.v($$0), this.c);
      ahg $$2 = mp.aX.a(mn.a($$0, "_floor1"), mq.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ahg> B(cwp $$0) {
      ahg $$1 = mp.aY.a(mn.a($$0, "_side0"), mq.v($$0), this.c);
      ahg $$2 = mp.aY.a(mn.a($$0, "_side1"), mq.w($$0), this.c);
      ahg $$3 = mp.aZ.a(mn.a($$0, "_side_alt0"), mq.v($$0), this.c);
      ahg $$4 = mp.aZ.a(mn.a($$0, "_side_alt1"), mq.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ahg> C(cwp $$0) {
      ahg $$1 = mp.ba.a(mn.a($$0, "_up0"), mq.v($$0), this.c);
      ahg $$2 = mp.ba.a(mn.a($$0, "_up1"), mq.w($$0), this.c);
      ahg $$3 = mp.bb.a(mn.a($$0, "_up_alt0"), mq.v($$0), this.c);
      ahg $$4 = mp.bb.a(mn.a($$0, "_up_alt1"), mq.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<mi> a(List<ahg> $$0, UnaryOperator<mi> $$1) {
      return $$0.stream().map($$0x -> mi.a().a(mj.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      md $$0 = md.a().a(djw.L, false).a(djw.M, false).a(djw.N, false).a(djw.O, false).a(djw.J, false);
      List<ahg> $$1 = this.A(cwr.cr);
      List<ahg> $$2 = this.B(cwr.cr);
      List<ahg> $$3 = this.C(cwr.cr);
      this.b
         .accept(
            me.a(cwr.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(md.b(md.a().a(djw.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(md.b(md.a().a(djw.M, true), $$0), a($$2, $$0x -> $$0x.a(mj.b, mj.a.b)))
               .a(md.b(md.a().a(djw.N, true), $$0), a($$2, $$0x -> $$0x.a(mj.b, mj.a.c)))
               .a(md.b(md.a().a(djw.O, true), $$0), a($$2, $$0x -> $$0x.a(mj.b, mj.a.d)))
               .a(md.a().a(djw.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ahg> $$0 = this.A(cwr.cs);
      List<ahg> $$1 = this.B(cwr.cs);
      this.b
         .accept(
            me.a(cwr.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mj.b, mj.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mj.b, mj.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mj.b, mj.a.d)))
         );
   }

   private void D(cwp $$0) {
      ahg $$1 = ms.t.create($$0, this.c);
      ahg $$2 = ms.u.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(mf.a($$0).a(a(djw.j, $$2, $$1)));
   }

   private void N() {
      mq $$0 = mq.a(mq.a(cwr.ad, "_side"), mq.a(cwr.ad, "_top"));
      ahg $$1 = mp.j.a(cwr.ad, $$0, this.c);
      this.b.accept(d(cwr.ad, $$1));
   }

   private void O() {
      this.a(cna.ad);
      cwp $$0 = cwr.E;
      mg.b<Boolean, Integer> $$1 = mg.a(dbj.d, dbj.b);
      ahg $$2 = mn.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ahg $$4 = mn.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, mi.a().a(mj.c, $$4));
         $$1.a(false, $$3, mi.a().a(mj.c, $$2));
      }

      this.b.accept(mf.a(cwr.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mf.a(cwr.kI)
               .a(
                  mg.a(djw.as)
                     .a(0, mi.a().a(mj.c, this.a(cwr.kI, "_0", mp.c, mq::b)))
                     .a(1, mi.a().a(mj.c, this.a(cwr.kI, "_1", mp.c, mq::b)))
                     .a(2, mi.a().a(mj.c, this.a(cwr.kI, "_2", mp.c, mq::b)))
                     .a(3, mi.a().a(mj.c, this.a(cwr.kI, "_3", mp.c, mq::b)))
               )
         );
   }

   private void Q() {
      ahg $$0 = mq.G(cwr.j);
      mq $$1 = new mq().a(mr.e, $$0).b(mr.e, mr.c).a(mr.f, mq.a(cwr.i, "_top")).a(mr.i, mq.a(cwr.i, "_snow"));
      mi $$2 = mi.a().a(mj.c, mp.n.a(cwr.i, "_snow", $$1, this.c));
      this.a(cwr.i, mn.a(cwr.i), $$2);
      ahg $$3 = ms.f.get(cwr.fl).a($$1x -> $$1x.a(mr.e, $$0)).a(cwr.fl, this.c);
      this.a(cwr.fl, $$3, $$2);
      ahg $$4 = ms.f.get(cwr.l).a($$1x -> $$1x.a(mr.e, $$0)).a(cwr.l, this.c);
      this.a(cwr.l, $$4, $$2);
   }

   private void a(cwp $$0, ahg $$1, mi $$2) {
      List<mi> $$3 = Arrays.asList(a($$1));
      this.b.accept(mf.a($$0).a(mg.a(djw.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cna.re);
      this.b
         .accept(
            mf.a(cwr.fC)
               .a(
                  mg.a(djw.ar)
                     .a(0, mi.a().a(mj.c, mn.a(cwr.fC, "_stage0")))
                     .a(1, mi.a().a(mj.c, mn.a(cwr.fC, "_stage1")))
                     .a(2, mi.a().a(mj.c, mn.a(cwr.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cwr.kE, mn.a(cwr.kE)));
   }

   private void j(cwp $$0, cwp $$1) {
      mq $$2 = mq.b($$1);
      ahg $$3 = mp.Y.a($$0, $$2, this.c);
      ahg $$4 = mp.Z.a($$0, $$2, this.c);
      this.b.accept(mf.a($$0).a(a(djw.aT, 1, $$4, $$3)));
   }

   private void T() {
      ahg $$0 = mn.a(cwr.hc);
      ahg $$1 = mn.a(cwr.hc, "_side");
      this.a(cna.lQ);
      this.b
         .accept(
            mf.a(cwr.hc)
               .a(
                  mg.a(djw.Q)
                     .a(ic.a, mi.a().a(mj.c, $$0))
                     .a(ic.c, mi.a().a(mj.c, $$1))
                     .a(ic.f, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
                     .a(ic.d, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
                     .a(ic.e, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
               )
         );
   }

   private void k(cwp $$0, cwp $$1) {
      ahg $$2 = mn.a($$0);
      this.b.accept(mf.a($$1, mi.a().a(mj.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ahg $$0 = mn.a(cwr.eW, "_post_ends");
      ahg $$1 = mn.a(cwr.eW, "_post");
      ahg $$2 = mn.a(cwr.eW, "_cap");
      ahg $$3 = mn.a(cwr.eW, "_cap_alt");
      ahg $$4 = mn.a(cwr.eW, "_side");
      ahg $$5 = mn.a(cwr.eW, "_side_alt");
      this.b
         .accept(
            me.a(cwr.eW)
               .a(mi.a().a(mj.c, $$0))
               .a(md.a().a(djw.L, false).a(djw.M, false).a(djw.N, false).a(djw.O, false), mi.a().a(mj.c, $$1))
               .a(md.a().a(djw.L, true).a(djw.M, false).a(djw.N, false).a(djw.O, false), mi.a().a(mj.c, $$2))
               .a(md.a().a(djw.L, false).a(djw.M, true).a(djw.N, false).a(djw.O, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
               .a(md.a().a(djw.L, false).a(djw.M, false).a(djw.N, true).a(djw.O, false), mi.a().a(mj.c, $$3))
               .a(md.a().a(djw.L, false).a(djw.M, false).a(djw.N, false).a(djw.O, true), mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(md.a().a(djw.L, true), mi.a().a(mj.c, $$4))
               .a(md.a().a(djw.M, true), mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
               .a(md.a().a(djw.N, true), mi.a().a(mj.c, $$5))
               .a(md.a().a(djw.O, true), mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
         );
      this.d(cwr.eW);
   }

   private void E(cwp $$0) {
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mn.a($$0))).a(b()));
   }

   private void V() {
      ahg $$0 = mn.a(cwr.dw);
      ahg $$1 = mn.a(cwr.dw, "_on");
      this.d(cwr.dw);
      this.b
         .accept(
            mf.a(cwr.dw)
               .a(a(djw.w, $$0, $$1))
               .a(
                  mg.a(djw.U, djw.R)
                     .a(djr.c, ic.c, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.c))
                     .a(djr.c, ic.f, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.d))
                     .a(djr.c, ic.d, mi.a().a(mj.a, mj.a.c))
                     .a(djr.c, ic.e, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.b))
                     .a(djr.a, ic.c, mi.a())
                     .a(djr.a, ic.f, mi.a().a(mj.b, mj.a.b))
                     .a(djr.a, ic.d, mi.a().a(mj.b, mj.a.c))
                     .a(djr.a, ic.e, mi.a().a(mj.b, mj.a.d))
                     .a(djr.b, ic.c, mi.a().a(mj.a, mj.a.b))
                     .a(djr.b, ic.f, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b))
                     .a(djr.b, ic.d, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.c))
                     .a(djr.b, ic.e, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.d))
               )
         );
   }

   private void W() {
      this.d(cwr.fm);
      this.b.accept(b(cwr.fm, mn.a(cwr.fm)));
   }

   private void X() {
      this.d(cwr.tn);
      this.b.accept(c(cwr.tn, mn.a(cwr.tn)));
   }

   private void Y() {
      this.b.accept(mf.a(cwr.ed).a(mg.a(djw.H).a(ic.a.a, mi.a().a(mj.c, mn.a(cwr.ed, "_ns"))).a(ic.a.c, mi.a().a(mj.c, mn.a(cwr.ed, "_ew")))));
   }

   private void Z() {
      ahg $$0 = ms.a.create(cwr.dV, this.c);
      this.b
         .accept(
            mf.a(
               cwr.dV,
               mi.a().a(mj.c, $$0),
               mi.a().a(mj.c, $$0).a(mj.a, mj.a.b),
               mi.a().a(mj.c, $$0).a(mj.a, mj.a.c),
               mi.a().a(mj.c, $$0).a(mj.a, mj.a.d),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.b),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.b).a(mj.a, mj.a.b),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.b).a(mj.a, mj.a.c),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.b).a(mj.a, mj.a.d),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.c),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.c).a(mj.a, mj.a.b),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.c).a(mj.a, mj.a.c),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.c).a(mj.a, mj.a.d),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.d),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.d).a(mj.a, mj.a.b),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.d).a(mj.a, mj.a.c),
               mi.a().a(mj.c, $$0).a(mj.b, mj.a.d).a(mj.a, mj.a.d)
            )
         );
   }

   private void aa() {
      ahg $$0 = mn.a(cwr.kO);
      ahg $$1 = mn.a(cwr.kO, "_on");
      this.b.accept(mf.a(cwr.kO).a(a(djw.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mq $$0 = new mq().a(mr.e, mq.a(cwr.by, "_bottom")).a(mr.i, mq.a(cwr.by, "_side"));
      ahg $$1 = mq.a(cwr.by, "_top_sticky");
      ahg $$2 = mq.a(cwr.by, "_top");
      mq $$3 = $$0.c(mr.E, $$1);
      mq $$4 = $$0.c(mr.E, $$2);
      ahg $$5 = mn.a(cwr.by, "_base");
      this.a(cwr.by, $$5, $$4);
      this.a(cwr.br, $$5, $$3);
      ahg $$6 = mp.n.a(cwr.by, "_inventory", $$0.c(mr.f, $$2), this.c);
      ahg $$7 = mp.n.a(cwr.br, "_inventory", $$0.c(mr.f, $$1), this.c);
      this.a(cwr.by, $$6);
      this.a(cwr.br, $$7);
   }

   private void a(cwp $$0, ahg $$1, mq $$2) {
      ahg $$3 = mp.bh.a($$0, $$2, this.c);
      this.b.accept(mf.a($$0).a(a(djw.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mq $$0 = new mq().a(mr.F, mq.a(cwr.by, "_top")).a(mr.i, mq.a(cwr.by, "_side"));
      mq $$1 = $$0.c(mr.E, mq.a(cwr.by, "_top_sticky"));
      mq $$2 = $$0.c(mr.E, mq.a(cwr.by, "_top"));
      this.b
         .accept(
            mf.a(cwr.bz)
               .a(
                  mg.a(djw.x, djw.bg)
                     .a(false, dki.a, mi.a().a(mj.c, mp.bi.a(cwr.by, "_head", $$2, this.c)))
                     .a(false, dki.b, mi.a().a(mj.c, mp.bi.a(cwr.by, "_head_sticky", $$1, this.c)))
                     .a(true, dki.a, mi.a().a(mj.c, mp.bj.a(cwr.by, "_head_short", $$2, this.c)))
                     .a(true, dki.b, mi.a().a(mj.c, mp.bj.a(cwr.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      cwp $$0 = cwr.tr;
      mq $$1 = mq.a($$0, "_side_inactive", "_top_inactive");
      mq $$2 = mq.a($$0, "_side_active", "_top_active");
      mq $$3 = mq.a($$0, "_side_active", "_top_ejecting_reward");
      ahg $$4 = mp.o.a($$0, $$1, this.c);
      ahg $$5 = mp.o.a($$0, "_active", $$2, this.c);
      ahg $$6 = mp.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(mf.a($$0).a(mg.a(djw.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> mi.a().a(mj.c, $$4);
            case b, c, d -> mi.a().a(mj.c, $$5);
            case e -> mi.a().a(mj.c, $$6);
         };
      })));
   }

   private void ae() {
      ahg $$0 = mn.a(cwr.qQ, "_inactive");
      ahg $$1 = mn.a(cwr.qQ, "_active");
      this.a(cwr.qQ, $$0);
      this.b.accept(mf.a(cwr.qQ).a(mg.a(djw.bo).a($$2 -> mi.a().a(mj.c, $$2 != dkn.b && $$2 != dkn.c ? $$0 : $$1))));
   }

   private void af() {
      ahg $$0 = mn.a(cwr.qR, "_inactive");
      ahg $$1 = mn.a(cwr.qR, "_active");
      this.a(cwr.qR, $$0);
      this.b.accept(mf.a(cwr.qR).a(mg.a(djw.bo).a($$2 -> mi.a().a(mj.c, $$2 != dkn.b && $$2 != dkn.c ? $$0 : $$1))).a(b()));
   }

   private void ag() {
      ahg $$0 = mp.bM.a(cwr.qV, mq.a(false), this.c);
      ahg $$1 = mp.bM.a(cwr.qV, "_can_summon", mq.a(true), this.c);
      this.a(cwr.qV, $$0);
      this.b.accept(mf.a(cwr.qV).a(a(djw.G, $$1, $$0)));
   }

   private void ah() {
      ahg $$0 = mn.a(cwr.nS, "_stable");
      ahg $$1 = mn.a(cwr.nS, "_unstable");
      this.a(cwr.nS, $$0);
      this.b.accept(mf.a(cwr.nS).a(a(djw.b, $$1, $$0)));
   }

   private void ai() {
      ahg $$0 = this.a(cwr.sv, "", mp.ao, mq::c);
      ahg $$1 = this.a(cwr.sv, "_lit", mp.ao, mq::c);
      this.b.accept(mf.a(cwr.sv).a(a(djw.D, $$1, $$0)));
      ahg $$2 = this.a(cwr.sw, "", mp.ao, mq::c);
      ahg $$3 = this.a(cwr.sw, "_lit", mp.ao, mq::c);
      this.b.accept(mf.a(cwr.sw).a(a(djw.D, $$3, $$2)));
   }

   private void aj() {
      ahg $$0 = ms.a.create(cwr.fB, this.c);
      ahg $$1 = this.a(cwr.fB, "_on", mp.c, mq::b);
      this.b.accept(mf.a(cwr.fB).a(a(djw.r, $$1, $$0)));
   }

   private void l(cwp $$0, cwp $$1) {
      mq $$2 = mq.y($$0);
      this.b.accept(c($$0, mp.bf.a($$0, $$2, this.c)));
      this.b.accept(mf.a($$1, mi.a().a(mj.c, mp.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ak() {
      mq $$0 = mq.y(cwr.dK);
      mq $$1 = mq.i(mq.a(cwr.dK, "_off"));
      ahg $$2 = mp.bf.a(cwr.dK, $$0, this.c);
      ahg $$3 = mp.bf.a(cwr.dK, "_off", $$1, this.c);
      this.b.accept(mf.a(cwr.dK).a(a(djw.r, $$2, $$3)));
      ahg $$4 = mp.bg.a(cwr.dL, $$0, this.c);
      ahg $$5 = mp.bg.a(cwr.dL, "_off", $$1, this.c);
      this.b.accept(mf.a(cwr.dL).a(a(djw.r, $$4, $$5)).a(d()));
      this.d(cwr.dK);
      this.c(cwr.dL);
   }

   private void al() {
      this.a(cna.lJ);
      this.b.accept(mf.a(cwr.eh).a(mg.a(djw.aA, djw.s, djw.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return mi.a().a(mj.c, mq.a(cwr.eh, $$3.toString()));
      })).a(c()));
   }

   private void am() {
      this.a(cna.cS);
      this.b
         .accept(
            mf.a(cwr.mV)
               .a(
                  mg.a(djw.aS, djw.C)
                     .a(1, false, Arrays.asList(a(mn.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(mn.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(mn.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(mn.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(mn.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(mn.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(mn.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(mn.a("four_sea_pickles"))))
               )
         );
   }

   private void an() {
      mq $$0 = mq.a(cwr.dN);
      ahg $$1 = mp.c.a(cwr.dP, $$0, this.c);
      this.b.accept(mf.a(cwr.dN).a(mg.a(djw.aF).a($$1x -> mi.a().a(mj.c, $$1x < 8 ? mn.a(cwr.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cwr.dN, mn.a(cwr.dN, "_height2"));
      this.b.accept(c(cwr.dP, $$1));
   }

   private void ao() {
      this.b.accept(mf.a(cwr.oc, mi.a().a(mj.c, mn.a(cwr.oc))).a(b()));
   }

   private void ap() {
      ahg $$0 = ms.a.create(cwr.pa, this.c);
      this.a(cwr.pa, $$0);
      this.b.accept(mf.a(cwr.pa).a(mg.a(djw.bj).a($$0x -> mi.a().a(mj.c, this.a(cwr.pa, "_" + $$0x.c(), mp.c, mq::b)))));
   }

   private void aq() {
      this.a(cna.wi);
      this.b.accept(mf.a(cwr.oi).a(mg.a(djw.as).a($$0 -> mi.a().a(mj.c, this.a(cwr.oi, "_stage" + $$0, mp.ao, mq::c)))));
   }

   private void ar() {
      this.a(cna.pp);
      this.b
         .accept(
            mf.a(cwr.fI)
               .a(
                  mg.a(djw.a, djw.M, djw.L, djw.N, djw.O)
                     .a(false, false, false, false, false, mi.a().a(mj.c, mn.a(cwr.fI, "_ns")))
                     .a(false, true, false, false, false, mi.a().a(mj.c, mn.a(cwr.fI, "_n")).a(mj.b, mj.a.b))
                     .a(false, false, true, false, false, mi.a().a(mj.c, mn.a(cwr.fI, "_n")))
                     .a(false, false, false, true, false, mi.a().a(mj.c, mn.a(cwr.fI, "_n")).a(mj.b, mj.a.c))
                     .a(false, false, false, false, true, mi.a().a(mj.c, mn.a(cwr.fI, "_n")).a(mj.b, mj.a.d))
                     .a(false, true, true, false, false, mi.a().a(mj.c, mn.a(cwr.fI, "_ne")))
                     .a(false, true, false, true, false, mi.a().a(mj.c, mn.a(cwr.fI, "_ne")).a(mj.b, mj.a.b))
                     .a(false, false, false, true, true, mi.a().a(mj.c, mn.a(cwr.fI, "_ne")).a(mj.b, mj.a.c))
                     .a(false, false, true, false, true, mi.a().a(mj.c, mn.a(cwr.fI, "_ne")).a(mj.b, mj.a.d))
                     .a(false, false, true, true, false, mi.a().a(mj.c, mn.a(cwr.fI, "_ns")))
                     .a(false, true, false, false, true, mi.a().a(mj.c, mn.a(cwr.fI, "_ns")).a(mj.b, mj.a.b))
                     .a(false, true, true, true, false, mi.a().a(mj.c, mn.a(cwr.fI, "_nse")))
                     .a(false, true, false, true, true, mi.a().a(mj.c, mn.a(cwr.fI, "_nse")).a(mj.b, mj.a.b))
                     .a(false, false, true, true, true, mi.a().a(mj.c, mn.a(cwr.fI, "_nse")).a(mj.b, mj.a.c))
                     .a(false, true, true, false, true, mi.a().a(mj.c, mn.a(cwr.fI, "_nse")).a(mj.b, mj.a.d))
                     .a(false, true, true, true, true, mi.a().a(mj.c, mn.a(cwr.fI, "_nsew")))
                     .a(true, false, false, false, false, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_ns")))
                     .a(true, false, true, false, false, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_n")))
                     .a(true, false, false, true, false, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_n")).a(mj.b, mj.a.c))
                     .a(true, true, false, false, false, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_n")).a(mj.b, mj.a.b))
                     .a(true, false, false, false, true, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_n")).a(mj.b, mj.a.d))
                     .a(true, true, true, false, false, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_ne")))
                     .a(true, true, false, true, false, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_ne")).a(mj.b, mj.a.b))
                     .a(true, false, false, true, true, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_ne")).a(mj.b, mj.a.c))
                     .a(true, false, true, false, true, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_ne")).a(mj.b, mj.a.d))
                     .a(true, false, true, true, false, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_ns")))
                     .a(true, true, false, false, true, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_ns")).a(mj.b, mj.a.b))
                     .a(true, true, true, true, false, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_nse")))
                     .a(true, true, false, true, true, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_nse")).a(mj.b, mj.a.b))
                     .a(true, false, true, true, true, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_nse")).a(mj.b, mj.a.c))
                     .a(true, true, true, false, true, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_nse")).a(mj.b, mj.a.d))
                     .a(true, true, true, true, true, mi.a().a(mj.c, mn.a(cwr.fI, "_attached_nsew")))
               )
         );
   }

   private void as() {
      this.d(cwr.fH);
      this.b.accept(mf.a(cwr.fH).a(mg.a(djw.a, djw.w).a(($$0, $$1) -> mi.a().a(mj.c, mq.a(cwr.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ahg a(int $$0, String $$1, mq $$2) {
      switch ($$0) {
         case 1:
            return mp.bl.a(mn.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return mp.bm.a(mn.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return mp.bn.a(mn.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return mp.bo.a(mn.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ahg a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mq.b(mq.G(cwr.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mq.b(mq.a(cwr.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mq.b(mq.a(cwr.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void at() {
      this.a(cna.ko);
      this.b.accept(mf.a(cwr.mf).a(mg.a(djw.aD, djw.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void au() {
      this.a(cna.kp);
      Function<Integer, ahg> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mq $$2 = mq.a($$1);
         return mp.bw.a(cwr.mg, $$1, $$2, this.c);
      };
      this.b.accept(mf.a(cwr.mg).a(mg.a(ddw.c).a($$1 -> mi.a().a(mj.c, $$0.apply($$1)))));
   }

   private void F(cwp $$0) {
      this.d($$0);
      ahg $$1 = mn.a($$0);
      me $$2 = me.a($$0);
      md.c $$3 = ac.a(md.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<djx, Function<ahg, mi>> $$4 : a) {
         djx $$5 = (djx)$$4.getFirst();
         Function<ahg, mi> $$6 = (Function<ahg, mi>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(md.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void av() {
      ahg $$0 = mq.a(cwr.qU, "_bottom");
      mq $$1 = new mq().a(mr.e, $$0).a(mr.f, mq.a(cwr.qU, "_top")).a(mr.i, mq.a(cwr.qU, "_side"));
      mq $$2 = new mq().a(mr.e, $$0).a(mr.f, mq.a(cwr.qU, "_top_bloom")).a(mr.i, mq.a(cwr.qU, "_side_bloom"));
      ahg $$3 = mp.n.a(cwr.qU, "", $$1, this.c);
      ahg $$4 = mp.n.a(cwr.qU, "_bloom", $$2, this.c);
      this.b.accept(mf.a(cwr.qU).a(mg.a(djw.E).a($$2x -> mi.a().a(mj.c, $$2x ? $$4 : $$3))));
      this.a(cna.gi, $$3);
   }

   private void aw() {
      cwp $$0 = cwr.cm;
      ahg $$1 = mn.a($$0);
      me $$2 = me.a($$0);
      Map.of(ic.c, mj.a.a, ic.f, mj.a.b, ic.d, mj.a.c, ic.e, mj.a.d).forEach(($$2x, $$3) -> {
         md.c $$4 = md.a().a(djw.R, $$2x);
         $$2.a($$4, mi.a().a(mj.c, $$1).a(mj.b, $$3).a(mj.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mn.a($$0, "_inventory"));
      i.clear();
   }

   private void a(me $$0, md.c $$1, mj.a $$2) {
      List.of(Pair.of(djw.bp, mp.aM), Pair.of(djw.bq, mp.aN), Pair.of(djw.br, mp.aO), Pair.of(djw.bs, mp.aP), Pair.of(djw.bt, mp.aQ), Pair.of(djw.bu, mp.aR))
         .forEach($$3 -> {
            djx $$4 = (djx)$$3.getFirst();
            mo $$5 = (mo)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(me $$0, md.c $$1, mj.a $$2, djx $$3, mo $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mq $$7 = new mq().a(mr.b, mq.a(cwr.cm, $$6));
      lz.d $$8 = new lz.d($$4, $$6);
      ahg $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cwr.cm, $$6, $$7, this.c));
      $$0.a(md.a($$1, md.a().a($$3, $$5)), mi.a().a(mj.c, $$9).a(mj.b, $$2));
   }

   private void ax() {
      this.b.accept(c(cwr.kJ, mp.c.a(cwr.kJ, mq.b(mn.a("magma")), this.c)));
   }

   private void G(cwp $$0) {
      this.b($$0, ms.q);
      mp.bD.a(mn.a($$0.k()), mq.u($$0), this.c);
   }

   private void b(cwp $$0, cwp $$1, lz.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(cwp $$0, cwp $$1) {
      mp.bE.a(mn.a($$0.k()), mq.u($$1), this.c);
   }

   private void ay() {
      ahg $$0 = mn.a(cwr.b);
      ahg $$1 = mn.a(cwr.b, "_mirrored");
      this.b.accept(a(cwr.eN, $$0, $$1));
      this.a(cwr.eN, $$0);
   }

   private void az() {
      ahg $$0 = mn.a(cwr.sJ);
      ahg $$1 = mn.a(cwr.sJ, "_mirrored");
      this.b.accept(a(cwr.td, $$0, $$1).a(f()));
      this.a(cwr.td, $$0);
   }

   private void n(cwp $$0, cwp $$1) {
      this.a($$0, lz.e.b);
      mq $$2 = mq.d(mq.a($$0, "_pot"));
      ahg $$3 = lz.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aA() {
      ahg $$0 = mq.a(cwr.pl, "_bottom");
      ahg $$1 = mq.a(cwr.pl, "_top_off");
      ahg $$2 = mq.a(cwr.pl, "_top");
      ahg[] $$3 = new ahg[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mq $$5 = new mq().a(mr.e, $$0).a(mr.f, $$4 == 0 ? $$1 : $$2).a(mr.i, mq.a(cwr.pl, "_side" + $$4));
         $$3[$$4] = mp.n.a(cwr.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mf.a(cwr.pl).a(mg.a(djw.aZ).a($$1x -> mi.a().a(mj.c, $$3[$$1x]))));
      this.a(cna.wG, $$3[0]);
   }

   private mi a(ie $$0, mi $$1) {
      switch ($$0) {
         case b:
            return $$1.a(mj.a, mj.a.b);
         case c:
            return $$1.a(mj.a, mj.a.b).a(mj.b, mj.a.c);
         case d:
            return $$1.a(mj.a, mj.a.b).a(mj.b, mj.a.d);
         case a:
            return $$1.a(mj.a, mj.a.b).a(mj.b, mj.a.b);
         case f:
            return $$1.a(mj.a, mj.a.d).a(mj.b, mj.a.c);
         case g:
            return $$1.a(mj.a, mj.a.d);
         case h:
            return $$1.a(mj.a, mj.a.d).a(mj.b, mj.a.b);
         case e:
            return $$1.a(mj.a, mj.a.d).a(mj.b, mj.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(mj.b, mj.a.c);
         case i:
            return $$1.a(mj.b, mj.a.d);
         case j:
            return $$1.a(mj.b, mj.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aB() {
      ahg $$0 = mq.a(cwr.pb, "_top");
      ahg $$1 = mq.a(cwr.pb, "_bottom");
      ahg $$2 = mq.a(cwr.pb, "_side");
      ahg $$3 = mq.a(cwr.pb, "_lock");
      mq $$4 = new mq().a(mr.o, $$2).a(mr.m, $$2).a(mr.l, $$2).a(mr.c, $$0).a(mr.j, $$0).a(mr.k, $$1).a(mr.n, $$3);
      ahg $$5 = mp.b.a(cwr.pb, $$4, this.c);
      this.b.accept(mf.a(cwr.pb, mi.a().a(mj.c, $$5)).a(mg.a(djw.T).a($$0x -> this.a($$0x, mi.a()))));
   }

   private void aC() {
      cwp $$0 = cwr.n;
      ahg $$1 = mn.a($$0);
      ms $$2 = ms.a.get($$0);
      cwp $$3 = cwr.jH;
      ahg $$4 = mp.ab.a($$3, $$2.b(), this.c);
      ahg $$5 = mp.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kg.a().filter(kh::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cwr.rf).a(kg.w).a(cwr.rf, cwr.rD).a(cwr.rj, cwr.rn).a(kg.y);
      this.h(cwr.re).a(kg.A).a(cwr.re, cwr.rC).a(cwr.ri, cwr.rm).a(kg.C);
      this.h(cwr.rd).a(kg.E).a(cwr.rd, cwr.rB).a(cwr.rh, cwr.rl).a(kg.G);
      this.h(cwr.rc).a(kg.I).a(cwr.rc, cwr.rA).a(cwr.rg, cwr.rk).a(kg.K);
      this.w(cwr.sk);
      this.w(cwr.sl);
      this.w(cwr.sm);
      this.w(cwr.sn);
      this.i(cwr.sk, cwr.so);
      this.i(cwr.sl, cwr.sp);
      this.i(cwr.sm, cwr.sq);
      this.i(cwr.sn, cwr.sr);
      this.m(cwr.a);
      this.c(cwr.nc, cwr.a);
      this.c(cwr.nb, cwr.a);
      this.m(cwr.fO);
      this.m(cwr.dQ);
      this.c(cwr.nd, cwr.G);
      this.m(cwr.fA);
      this.m(cwr.me);
      this.m(cwr.fr);
      this.m(cwr.fR);
      this.a(cna.tX);
      this.m(cwr.pg);
      this.m(cwr.G);
      this.m(cwr.H);
      this.m(cwr.hV);
      this.a(cna.fR);
      this.o(cwr.pM, cwr.qd);
      this.o(cwr.pN, cwr.qe);
      this.o(cwr.pO, cwr.qf);
      this.o(cwr.pP, cwr.qg);
      this.o(cwr.pQ, cwr.qh);
      this.o(cwr.pR, cwr.qi);
      this.o(cwr.pS, cwr.qj);
      this.o(cwr.pT, cwr.qk);
      this.o(cwr.pU, cwr.ql);
      this.o(cwr.pV, cwr.qm);
      this.o(cwr.pW, cwr.qn);
      this.o(cwr.pX, cwr.qo);
      this.o(cwr.pY, cwr.qp);
      this.o(cwr.pZ, cwr.qq);
      this.o(cwr.qa, cwr.qr);
      this.o(cwr.qb, cwr.qs);
      this.o(cwr.pL, cwr.qc);
      this.m(cwr.na);
      this.m(cwr.gs);
      this.m(cwr.qP);
      this.m(cwr.sx);
      this.s(cwr.sy);
      this.s(cwr.sz);
      this.t(cwr.ti);
      this.t(cwr.tj);
      this.ai();
      this.g(cwr.sC, cwr.sA);
      this.p(cwr.sB);
      this.a(cwr.hW, cna.hA);
      this.a(cna.hA);
      this.aD();
      this.a(cwr.kN, cna.ja);
      this.a(cna.ja);
      this.f(cwr.bQ, mq.a(cwr.by, "_side"));
      this.a(cwr.R);
      this.a(cwr.S);
      this.a(cwr.iB);
      this.a(cwr.cx);
      this.a(cwr.cy);
      this.a(cwr.cz);
      this.a(cwr.fE);
      this.a(cwr.fF);
      this.a(cwr.fJ);
      this.a(cwr.N);
      this.a(cwr.T);
      this.a(cwr.O);
      this.a(cwr.ch);
      this.a(cwr.P);
      this.a(cwr.Q);
      this.a(cwr.ci);
      this.b(cwr.pj, ms.d);
      this.a(cwr.pi);
      this.a(cwr.aR);
      this.a(cwr.aS);
      this.a(cwr.aT);
      this.a(cwr.hb);
      this.a(cwr.dI);
      this.a(cwr.dJ);
      this.a(cwr.ha);
      this.a(cwr.pC);
      this.a(cwr.mW);
      this.a(cwr.dR);
      this.a(cwr.k);
      this.a(cwr.pk);
      this.a(cwr.fz);
      this.a(cwr.ec);
      this.a(cwr.L);
      this.a(cwr.ph);
      this.a(cwr.dO);
      this.b(cwr.dT, ms.g);
      this.b(cwr.pq, ms.d);
      this.b(cwr.fa, ms.d);
      this.m(cwr.ac);
      this.m(cwr.ga);
      this.a(cwr.kK);
      this.a(cwr.aY);
      this.a(cwr.iC);
      this.a(cwr.co);
      this.a(cwr.pK);
      this.a(cwr.ii);
      this.a(cwr.oy);
      this.a(cwr.dW);
      this.a(cwr.dX);
      this.b(cwr.ct, ms.b);
      this.a(cwr.aO);
      this.b(cwr.bw, ms.v);
      this.a(cna.cR);
      this.b(cwr.ck, ms.f);
      this.b(cwr.pd, ms.d);
      this.a(cwr.op);
      this.a(cwr.aP);
      this.a(cwr.qt);
      this.a(cwr.qu);
      this.a(cwr.qN);
      this.a(cwr.su);
      this.a(cwr.tf);
      this.a(cwr.tg);
      this.a(cwr.th);
      this.e(cwr.qS);
      this.aC();
      this.a(cwr.ra);
      this.a(cwr.rb);
      this.a(cwr.qW);
      this.a(cwr.qX);
      this.a(cwr.qY);
      this.a(cwr.qZ);
      this.k(cwr.qW, cwr.rw);
      this.k(cwr.qX, cwr.ry);
      this.k(cwr.qY, cwr.rx);
      this.k(cwr.qZ, cwr.rz);
      this.i(cwr.rM);
      this.i(cwr.rN);
      this.i(cwr.rP);
      this.i(cwr.rO);
      this.a(cwr.rM, cwr.rQ);
      this.a(cwr.rN, cwr.rR);
      this.a(cwr.rP, cwr.rT);
      this.a(cwr.rO, cwr.rS);
      this.k(cwr.rU);
      this.k(cwr.rV);
      this.k(cwr.rX);
      this.k(cwr.rW);
      this.b(cwr.rU, cwr.rY);
      this.b(cwr.rV, cwr.rZ);
      this.b(cwr.rX, cwr.sb);
      this.b(cwr.rW, cwr.sa);
      this.a(cwr.sc);
      this.a(cwr.sd);
      this.a(cwr.se);
      this.a(cwr.sf);
      this.k(cwr.sc, cwr.sg);
      this.k(cwr.sd, cwr.sh);
      this.k(cwr.se, cwr.si);
      this.k(cwr.sf, cwr.sj);
      this.j(cwr.gW, cwr.ch);
      this.j(cwr.gX, cwr.ci);
      this.G();
      this.r();
      this.aw();
      this.v();
      this.w();
      this.a(cwr.og, cwr.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(cwr.kt);
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
      this.F(cwr.ff);
      this.F(cwr.fg);
      this.F(cwr.qT);
      this.ax();
      this.aB();
      this.ae();
      this.af();
      this.ag();
      this.X();
      this.O();
      this.N();
      this.ad();
      this.E(cwr.cO);
      this.d(cwr.cO);
      this.E(cwr.oa);
      this.g();
      this.E(cwr.sE);
      this.l(cwr.cp, cwr.cq);
      this.l(cwr.ea, cwr.eb);
      this.a(cwr.cA, cwr.n, mq::c);
      this.a(cwr.nY, cwr.p, mq::d);
      this.y(cwr.ow);
      this.y(cwr.on);
      this.v(cwr.aU);
      this.v(cwr.hi);
      this.C();
      this.D(cwr.oe);
      this.D(cwr.of);
      this.e(cwr.eX, mn.a(cwr.eX));
      this.a(cwr.dY, ms.d);
      this.a(cwr.dZ, ms.d);
      this.a(cwr.te);
      this.a(cwr.kM, ms.d);
      this.f(cwr.j);
      this.f(cwr.sH);
      this.f(cwr.I);
      this.g(cwr.J);
      this.g(cwr.M);
      this.f(cwr.K);
      this.e(cwr.F);
      this.b(cwr.to, ms.f);
      this.a(cwr.ij, ms.d, ms.e);
      this.a(cwr.kx, ms.w, ms.x);
      this.a(cwr.hf, ms.w, ms.x);
      this.a(cwr.tk, ms.d, ms.e);
      this.a(cwr.tl, ms.d, ms.e);
      this.a(cwr.tm, ms.d, ms.e);
      this.c(cwr.nT, ms.i);
      this.z();
      this.a(cwr.pe, mq::A);
      this.a(cwr.pf, mq::C);
      this.a(cwr.kD, djw.as, 0, 1, 2, 3);
      this.a(cwr.gt, djw.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cwr.fq, djw.as, 0, 1, 1, 2);
      this.a(cwr.gu, djw.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cwr.cB, djw.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cwr.kA, lz.e.b, djw.aq, 0, 1);
      this.i();
      this.h();
      this.a(mn.a("decorated_pot"), cwr.iA).b(cwr.tp);
      this.a(mn.a("banner"), cwr.n)
         .a(mp.bF, cwr.iJ, cwr.iK, cwr.iL, cwr.iM, cwr.iN, cwr.iO, cwr.iP, cwr.iQ, cwr.iR, cwr.iS, cwr.iT, cwr.iU, cwr.iV, cwr.iW, cwr.iX, cwr.iY)
         .b(cwr.iZ, cwr.ja, cwr.jb, cwr.jc, cwr.jd, cwr.je, cwr.jf, cwr.jg, cwr.jh, cwr.ji, cwr.jj, cwr.jk, cwr.jl, cwr.jm, cwr.jn, cwr.jo);
      this.a(mn.a("bed"), cwr.n)
         .b(cwr.aZ, cwr.ba, cwr.bb, cwr.bc, cwr.bd, cwr.be, cwr.bf, cwr.bg, cwr.bh, cwr.bi, cwr.bj, cwr.bk, cwr.bl, cwr.bm, cwr.bn, cwr.bo);
      this.m(cwr.aZ, cwr.bA);
      this.m(cwr.ba, cwr.bB);
      this.m(cwr.bb, cwr.bC);
      this.m(cwr.bc, cwr.bD);
      this.m(cwr.bd, cwr.bE);
      this.m(cwr.be, cwr.bF);
      this.m(cwr.bf, cwr.bG);
      this.m(cwr.bg, cwr.bH);
      this.m(cwr.bh, cwr.bI);
      this.m(cwr.bi, cwr.bJ);
      this.m(cwr.bj, cwr.bK);
      this.m(cwr.bk, cwr.bL);
      this.m(cwr.bl, cwr.bM);
      this.m(cwr.bm, cwr.bN);
      this.m(cwr.bn, cwr.bO);
      this.m(cwr.bo, cwr.bP);
      this.a(mn.a("skull"), cwr.dW)
         .a(mp.bG, cwr.gM, cwr.gK, cwr.gI, cwr.gE, cwr.gG, cwr.gQ)
         .a(cwr.gO)
         .b(cwr.gN, cwr.gP, cwr.gL, cwr.gJ, cwr.gF, cwr.gH, cwr.gR);
      this.G(cwr.kP);
      this.G(cwr.kQ);
      this.G(cwr.kR);
      this.G(cwr.kS);
      this.G(cwr.kT);
      this.G(cwr.kU);
      this.G(cwr.kV);
      this.G(cwr.kW);
      this.G(cwr.kX);
      this.G(cwr.kY);
      this.G(cwr.kZ);
      this.G(cwr.la);
      this.G(cwr.lb);
      this.G(cwr.lc);
      this.G(cwr.ld);
      this.G(cwr.le);
      this.G(cwr.lf);
      this.b(cwr.mX, ms.q);
      this.c(cwr.mX);
      this.a(mn.a("chest"), cwr.n).b(cwr.cv, cwr.gV);
      this.a(mn.a("ender_chest"), cwr.co).b(cwr.fG);
      this.f(cwr.fx, cwr.co).a(cwr.fx, cwr.kF);
      this.a(cwr.aM);
      this.a(cwr.aN);
      this.a(cwr.lw);
      this.a(cwr.lx);
      this.a(cwr.ly);
      this.a(cwr.lz);
      this.a(cwr.lA);
      this.a(cwr.lB);
      this.a(cwr.lC);
      this.a(cwr.lD);
      this.a(cwr.lE);
      this.a(cwr.lF);
      this.a(cwr.lG);
      this.a(cwr.lH);
      this.a(cwr.lI);
      this.a(cwr.lJ);
      this.a(cwr.lK);
      this.a(cwr.lL);
      this.a(ms.a, cwr.lM, cwr.lN, cwr.lO, cwr.lP, cwr.lQ, cwr.lR, cwr.lS, cwr.lT, cwr.lU, cwr.lV, cwr.lW, cwr.lX, cwr.lY, cwr.lZ, cwr.ma, cwr.mb);
      this.a(cwr.iA);
      this.a(cwr.hj);
      this.a(cwr.hk);
      this.a(cwr.hl);
      this.a(cwr.hm);
      this.a(cwr.hn);
      this.a(cwr.ho);
      this.a(cwr.hp);
      this.a(cwr.hq);
      this.a(cwr.hr);
      this.a(cwr.hs);
      this.a(cwr.ht);
      this.a(cwr.hu);
      this.a(cwr.hv);
      this.a(cwr.hw);
      this.a(cwr.hx);
      this.a(cwr.hy);
      this.a(cwr.qO);
      this.h(cwr.aQ, cwr.eY);
      this.h(cwr.ei, cwr.hz);
      this.h(cwr.ej, cwr.hA);
      this.h(cwr.ek, cwr.hB);
      this.h(cwr.el, cwr.hC);
      this.h(cwr.em, cwr.hD);
      this.h(cwr.en, cwr.hE);
      this.h(cwr.eo, cwr.hF);
      this.h(cwr.ep, cwr.hG);
      this.h(cwr.eq, cwr.hH);
      this.h(cwr.er, cwr.hI);
      this.h(cwr.es, cwr.hJ);
      this.h(cwr.et, cwr.hK);
      this.h(cwr.eu, cwr.hL);
      this.h(cwr.ev, cwr.hM);
      this.h(cwr.ew, cwr.hN);
      this.h(cwr.ex, cwr.hO);
      this.b(ms.o, cwr.lg, cwr.lh, cwr.li, cwr.lj, cwr.lk, cwr.ll, cwr.lm, cwr.ln, cwr.lo, cwr.lp, cwr.lq, cwr.lr, cwr.ls, cwr.lt, cwr.lu, cwr.lv);
      this.g(cwr.bA, cwr.ik);
      this.g(cwr.bB, cwr.il);
      this.g(cwr.bC, cwr.im);
      this.g(cwr.bD, cwr.in);
      this.g(cwr.bE, cwr.io);
      this.g(cwr.bF, cwr.ip);
      this.g(cwr.bG, cwr.iq);
      this.g(cwr.bH, cwr.ir);
      this.g(cwr.bI, cwr.is);
      this.g(cwr.bJ, cwr.it);
      this.g(cwr.bK, cwr.iu);
      this.g(cwr.bL, cwr.iv);
      this.g(cwr.bM, cwr.iw);
      this.g(cwr.bN, cwr.ix);
      this.g(cwr.bO, cwr.iy);
      this.g(cwr.bP, cwr.iz);
      this.a(cwr.sI);
      this.a(cwr.eL);
      this.a(cwr.bu, cwr.gb, lz.e.a);
      this.a(cwr.bR, cwr.gc, lz.e.b);
      this.a(cwr.bT, cwr.gd, lz.e.b);
      this.a(cwr.bU, cwr.ge, lz.e.b);
      this.a(cwr.bV, cwr.gf, lz.e.b);
      this.a(cwr.bW, cwr.gg, lz.e.b);
      this.a(cwr.bX, cwr.gh, lz.e.b);
      this.a(cwr.bY, cwr.gi, lz.e.b);
      this.a(cwr.bZ, cwr.gj, lz.e.b);
      this.a(cwr.ca, cwr.gk, lz.e.b);
      this.a(cwr.cb, cwr.gl, lz.e.b);
      this.a(cwr.cc, cwr.gm, lz.e.b);
      this.a(cwr.ce, cwr.gn, lz.e.b);
      this.a(cwr.cd, cwr.go, lz.e.b);
      this.a(cwr.cg, cwr.gp, lz.e.b);
      this.a(cwr.cf, cwr.gq, lz.e.b);
      this.a(cwr.bv, cwr.gr, lz.e.b);
      this.a(cwr.bS, cwr.fS, lz.e.b);
      this.H();
      this.u(cwr.eT);
      this.u(cwr.eU);
      this.u(cwr.eV);
      this.a(cwr.bt, lz.e.a);
      this.b(cwr.dS, lz.e.a);
      this.a(cna.dI);
      this.b(cwr.mc, cwr.md, lz.e.b);
      this.a(cna.dJ);
      this.c(cwr.md);
      this.b(cwr.sG, lz.e.b);
      this.c(cwr.sG);
      this.c(cwr.sw);
      this.b(cwr.oz, cwr.oA, lz.e.b);
      this.b(cwr.oB, cwr.oC, lz.e.b);
      this.a(cwr.oz, "_plant");
      this.c(cwr.oA);
      this.a(cwr.oB, "_plant");
      this.c(cwr.oC);
      this.a(cwr.mY, lz.e.a, mq.c(mq.a(cwr.mZ, "_stage0")));
      this.m();
      this.a(cwr.bs, lz.e.b);
      this.c(cwr.iE, lz.e.b);
      this.c(cwr.iF, lz.e.b);
      this.c(cwr.iG, lz.e.b);
      this.c(cwr.iH, lz.e.a);
      this.c(cwr.iI, lz.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cwr.mw, cwr.mr, cwr.mm, cwr.mh, cwr.mG, cwr.mB, cwr.mQ, cwr.mL);
      this.a(cwr.mx, cwr.ms, cwr.mn, cwr.mi, cwr.mH, cwr.mC, cwr.mR, cwr.mM);
      this.a(cwr.my, cwr.mt, cwr.mo, cwr.mj, cwr.mI, cwr.mD, cwr.mS, cwr.mN);
      this.a(cwr.mz, cwr.mu, cwr.mp, cwr.mk, cwr.mJ, cwr.mE, cwr.mT, cwr.mO);
      this.a(cwr.mA, cwr.mv, cwr.mq, cwr.ml, cwr.mK, cwr.mF, cwr.mU, cwr.mP);
      this.e(cwr.fe, cwr.fc);
      this.e(cwr.fd, cwr.fb);
      this.l(cwr.ab).c(cwr.ab).a(cwr.av);
      this.l(cwr.am).c(cwr.am).a(cwr.aD);
      this.a(cwr.am, cwr.dj, cwr.ds);
      this.b(cwr.aL, ms.s);
      this.l(cwr.Y).c(cwr.Y).a(cwr.as);
      this.l(cwr.ai).c(cwr.ai).a(cwr.aA);
      this.a(cwr.ai, cwr.dd, cwr.do);
      this.a(cwr.B, cwr.fX, lz.e.b);
      this.b(cwr.aI, ms.s);
      this.l(cwr.Z).d(cwr.Z).a(cwr.at);
      this.l(cwr.aj).d(cwr.aj).a(cwr.aB);
      this.a(cwr.aj, cwr.de, cwr.dp);
      this.a(cwr.C, cwr.fY, lz.e.b);
      this.b(cwr.aJ, ms.s);
      this.l(cwr.W).c(cwr.W).a(cwr.aq);
      this.l(cwr.ag).c(cwr.ag).a(cwr.ay);
      this.a(cwr.ag, cwr.dc, cwr.dn);
      this.a(cwr.z, cwr.fV, lz.e.b);
      this.b(cwr.aG, ms.s);
      this.l(cwr.U).c(cwr.U).a(cwr.ao);
      this.l(cwr.al).c(cwr.al).a(cwr.aw);
      this.a(cwr.al, cwr.da, cwr.dl);
      this.a(cwr.x, cwr.fT, lz.e.b);
      this.b(cwr.aE, ms.s);
      this.l(cwr.V).c(cwr.V).a(cwr.ap);
      this.l(cwr.af).c(cwr.af).a(cwr.ax);
      this.a(cwr.af, cwr.db, cwr.dm);
      this.a(cwr.y, cwr.fU, lz.e.b);
      this.b(cwr.aF, ms.s);
      this.l(cwr.aa).c(cwr.aa).a(cwr.au);
      this.l(cwr.ak).c(cwr.ak).a(cwr.aC);
      this.a(cwr.ak, cwr.dg, cwr.dr);
      this.a(cwr.D, cwr.fZ, lz.e.b);
      this.b(cwr.aK, ms.s);
      this.l(cwr.X).c(cwr.X).a(cwr.ar);
      this.l(cwr.ah).c(cwr.ah).a(cwr.az);
      this.a(cwr.ah, cwr.df, cwr.dq);
      this.a(cwr.A, cwr.fW, lz.e.b);
      this.b(cwr.aH, ms.s);
      this.l(cwr.os).b(cwr.os).a(cwr.ou);
      this.l(cwr.ot).b(cwr.ot).a(cwr.ov);
      this.a(cwr.ot, cwr.dh, cwr.dt);
      this.a(cwr.ox, cwr.pm, lz.e.b);
      this.n(cwr.oD, cwr.po);
      this.l(cwr.oj).b(cwr.oj).a(cwr.ol);
      this.l(cwr.ok).b(cwr.ok).a(cwr.om);
      this.a(cwr.ok, cwr.di, cwr.du);
      this.a(cwr.oo, cwr.pn, lz.e.b);
      this.n(cwr.oq, cwr.pp);
      this.l(cwr.ae).d(cwr.ae);
      this.l(cwr.an).d(cwr.an);
      this.a(cwr.v, cwr.dk, cwr.dv);
      this.b(cwr.or, lz.e.b);
      this.a(cna.dF);
      this.i(cwr.dy);
      this.k(cwr.hY);
      this.u();
      this.n(cwr.cP);
      this.o(cwr.bp);
      this.o(cwr.bq);
      this.o(cwr.hh);
      this.t();
      this.q(cwr.fN);
      this.q(cwr.kG);
      this.q(cwr.kH);
      this.r(cwr.gS);
      this.r(cwr.gT);
      this.r(cwr.gU);
      this.o();
      this.p();
      this.d(cwr.cD, ms.h);
      this.d(cwr.nW, ms.h);
      this.d(cwr.nV, ms.i);
      this.s();
      this.aA();
      this.av();
      this.k(cwr.eK, cwr.eS);
      this.k(cwr.m, cwr.eO);
      this.k(cwr.eJ, cwr.eR);
      this.k(cwr.eI, cwr.eQ);
      this.ay();
      this.k(cwr.eH, cwr.eP);
      this.az();
      coc.h().forEach($$0 -> this.a($$0, mn.b("template_spawn_egg")));
   }

   private void aD() {
      this.c(cwr.hX);
      mg.a<Integer> $$0 = mg.a(djw.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ahg $$3 = mq.a(cna.hB, $$2);
         $$0.a($$1, mi.a().a(mj.c, mp.aa.a(cwr.hX, $$2, mq.h($$3), this.c)));
         mp.bx.a(mn.a(cna.hB, $$2), mq.k($$3), this.c);
      }

      this.b.accept(mf.a(cwr.hX).a($$0));
   }

   private void o(cwp $$0, cwp $$1) {
      this.a($$0.k());
      mq $$2 = mq.b(mq.G($$0));
      mq $$3 = mq.b(mq.a($$0, "_lit"));
      ahg $$4 = mp.bH.a($$0, "_one_candle", $$2, this.c);
      ahg $$5 = mp.bI.a($$0, "_two_candles", $$2, this.c);
      ahg $$6 = mp.bJ.a($$0, "_three_candles", $$2, this.c);
      ahg $$7 = mp.bK.a($$0, "_four_candles", $$2, this.c);
      ahg $$8 = mp.bH.a($$0, "_one_candle_lit", $$3, this.c);
      ahg $$9 = mp.bI.a($$0, "_two_candles_lit", $$3, this.c);
      ahg $$10 = mp.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      ahg $$11 = mp.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            mf.a($$0)
               .a(
                  mg.a(djw.az, djw.r)
                     .a(1, false, mi.a().a(mj.c, $$4))
                     .a(2, false, mi.a().a(mj.c, $$5))
                     .a(3, false, mi.a().a(mj.c, $$6))
                     .a(4, false, mi.a().a(mj.c, $$7))
                     .a(1, true, mi.a().a(mj.c, $$8))
                     .a(2, true, mi.a().a(mj.c, $$9))
                     .a(3, true, mi.a().a(mj.c, $$10))
                     .a(4, true, mi.a().a(mj.c, $$11))
               )
         );
      ahg $$12 = mp.bL.a($$1, mq.a($$0, false), this.c);
      ahg $$13 = mp.bL.a($$1, "_lit", mq.a($$0, true), this.c);
      this.b.accept(mf.a($$1).a(a(djw.r, $$13, $$12)));
   }

   class a {
      private final ahg b;

      public a(ahg $$0, cwp $$1) {
         this.b = mp.aa.a($$0, mq.u($$1), lz.this.c);
      }

      public lz.a a(cwp... $$0) {
         for (cwp $$1 : $$0) {
            lz.this.b.accept(lz.c($$1, this.b));
         }

         return this;
      }

      public lz.a b(cwp... $$0) {
         for (cwp $$1 : $$0) {
            lz.this.c($$1);
         }

         return this.a($$0);
      }

      public lz.a a(mo $$0, cwp... $$1) {
         for (cwp $$2 : $$1) {
            $$0.a(mn.a($$2.k()), mq.u($$2), lz.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mq b;
      private final Map<mo, ahg> c = Maps.newHashMap();
      @Nullable
      private kh d;
      @Nullable
      private ahg e;
      private final Set<cwp> f = new HashSet<>();

      public b(mq $$0) {
         this.b = $$0;
      }

      public lz.b a(cwp $$0, mo $$1) {
         this.e = $$1.a($$0, this.b, lz.this.c);
         if (lz.this.f.containsKey($$0)) {
            lz.this.b.accept(lz.this.f.get($$0).create($$0, this.e, this.b, lz.this.c));
         } else {
            lz.this.b.accept(lz.c($$0, this.e));
         }

         return this;
      }

      public lz.b a(cwp $$0, cwp $$1) {
         ahg $$2 = mn.a($$0);
         lz.this.b.accept(lz.c($$1, $$2));
         lz.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public lz.b a(cwp $$0) {
         ahg $$1 = mp.s.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.t.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.b($$0, $$1, $$2));
         ahg $$3 = mp.u.a($$0, this.b, lz.this.c);
         lz.this.a($$0, $$3);
         return this;
      }

      public lz.b b(cwp $$0) {
         ahg $$1 = mp.M.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.N.a($$0, this.b, lz.this.c);
         ahg $$3 = mp.O.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$1, $$2, $$3));
         ahg $$4 = mp.P.a($$0, this.b, lz.this.c);
         lz.this.a($$0, $$4);
         return this;
      }

      public lz.b c(cwp $$0) {
         mq $$1 = mq.p($$0);
         ahg $$2 = mp.D.a($$0, $$1, lz.this.c);
         ahg $$3 = mp.E.a($$0, $$1, lz.this.c);
         ahg $$4 = mp.F.a($$0, $$1, lz.this.c);
         ahg $$5 = mp.G.a($$0, $$1, lz.this.c);
         ahg $$6 = mp.H.a($$0, $$1, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$2, $$3, $$4, $$5, $$6));
         ahg $$7 = mp.I.a($$0, $$1, lz.this.c);
         lz.this.a($$0, $$7);
         return this;
      }

      public lz.b d(cwp $$0) {
         ahg $$1 = mp.J.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.K.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.c($$0, $$1, $$2));
         ahg $$3 = mp.L.a($$0, this.b, lz.this.c);
         lz.this.a($$0, $$3);
         return this;
      }

      public lz.b e(cwp $$0) {
         mq $$1 = mq.p($$0);
         ahg $$2 = mp.R.a($$0, $$1, lz.this.c);
         ahg $$3 = mp.Q.a($$0, $$1, lz.this.c);
         ahg $$4 = mp.T.a($$0, $$1, lz.this.c);
         ahg $$5 = mp.S.a($$0, $$1, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public lz.b f(cwp $$0) {
         ahg $$1 = mp.V.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.U.a($$0, this.b, lz.this.c);
         ahg $$3 = mp.X.a($$0, this.b, lz.this.c);
         ahg $$4 = mp.W.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public lz.b g(cwp $$0) {
         ahg $$1 = mp.Y.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.Z.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.e($$0, $$1, $$2));
         return this;
      }

      public lz.b h(cwp $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cwp $$1 = this.d.b().get(kh.b.r);
            ahg $$2 = mp.aa.a($$0, this.b, lz.this.c);
            lz.this.b.accept(lz.c($$0, $$2));
            lz.this.b.accept(lz.c($$1, $$2));
            lz.this.a($$0.k());
            lz.this.c($$1);
            return this;
         }
      }

      public lz.b i(cwp $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ahg $$1 = this.a(mp.ab, $$0);
            ahg $$2 = this.a(mp.ac, $$0);
            lz.this.b.accept(lz.e($$0, $$1, $$2, this.e));
            lz.this.a($$0, $$1);
            return this;
         }
      }

      public lz.b j(cwp $$0) {
         ahg $$1 = this.a(mp.af, $$0);
         ahg $$2 = this.a(mp.ae, $$0);
         ahg $$3 = this.a(mp.ag, $$0);
         lz.this.b.accept(lz.b($$0, $$1, $$2, $$3));
         lz.this.a($$0, $$2);
         return this;
      }

      private lz.b k(cwp $$0) {
         ms $$1 = lz.this.g.getOrDefault($$0, ms.a.get($$0));
         ahg $$2 = $$1.a($$0, lz.this.c);
         lz.this.b.accept(lz.c($$0, $$2));
         return this;
      }

      private lz.b l(cwp $$0) {
         lz.this.i($$0);
         return this;
      }

      private void m(cwp $$0) {
         if (lz.this.e.contains($$0)) {
            lz.this.k($$0);
         } else {
            lz.this.j($$0);
         }
      }

      private ahg a(mo $$0, cwp $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, lz.this.c));
      }

      public lz.b a(kh $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<lz.b, cwp> $$2 = lz.h.get($$0x);
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
      mc create(cwp var1, ahg var2, mq var3, BiConsumer<ahg, Supplier<JsonElement>> var4);
   }

   static record d(mo a, String b) {
   }

   static enum e {
      a,
      b;

      public mo a() {
         return this == a ? mp.ap : mp.ao;
      }

      public mo b() {
         return this == a ? mp.ar : mp.aq;
      }
   }

   class f {
      private final mq b;

      public f(mq $$0) {
         this.b = $$0;
      }

      public lz.f a(cwp $$0) {
         mq $$1 = this.b.c(mr.d, this.b.a(mr.i));
         ahg $$2 = mp.j.a($$0, $$1, lz.this.c);
         lz.this.b.accept(lz.d($$0, $$2));
         return this;
      }

      public lz.f b(cwp $$0) {
         ahg $$1 = mp.j.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.d($$0, $$1));
         return this;
      }

      public lz.f c(cwp $$0) {
         ahg $$1 = mp.j.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.k.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.d($$0, $$1, $$2));
         return this;
      }

      public lz.f d(cwp $$0) {
         lz.this.b.accept(lz.a($$0, this.b, lz.this.c));
         return this;
      }
   }
}
