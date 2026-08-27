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
   final BiConsumer<ahh, Supplier<JsonElement>> c;
   private final Consumer<cnb> d;
   final List<cwy> e = ImmutableList.of(cxa.ey, cxa.eE, cxa.hY);
   final Map<cwy, lz.c> f = ImmutableMap.builder().put(cxa.b, lz::a).put(cxa.sJ, lz::c).put(cxa.eM, lz::b).build();
   final Map<cwy, ms> g = ImmutableMap.builder()
      .put(cxa.aV, ms.y.get(cxa.aV))
      .put(cxa.jp, ms.y.get(cxa.jp))
      .put(cxa.jS, ms.a(mq.a(cxa.aV, "_top")))
      .put(cxa.jU, ms.a(mq.a(cxa.jp, "_top")))
      .put(cxa.aX, ms.d.get(cxa.aV).a($$0x -> $$0x.a(mr.i, mq.G(cxa.aX))))
      .put(cxa.jr, ms.d.get(cxa.jp).a($$0x -> $$0x.a(mr.i, mq.G(cxa.jr))))
      .put(cxa.hd, ms.d.get(cxa.hd))
      .put(cxa.jT, ms.a(mq.a(cxa.hd, "_bottom")))
      .put(cxa.pr, ms.z.get(cxa.pr))
      .put(cxa.sJ, ms.z.get(cxa.sJ))
      .put(cxa.he, ms.d.get(cxa.he).a($$0x -> $$0x.a(mr.i, mq.G(cxa.he))))
      .put(cxa.aW, ms.d.get(cxa.aW).a($$0x -> {
         $$0x.a(mr.d, mq.a(cxa.aV, "_top"));
         $$0x.a(mr.i, mq.G(cxa.aW));
      }))
      .put(cxa.jq, ms.d.get(cxa.jq).a($$0x -> {
         $$0x.a(mr.d, mq.a(cxa.jp, "_top"));
         $$0x.a(mr.i, mq.G(cxa.jq));
      }))
      .put(cxa.qM, ms.z.get(cxa.qM))
      .put(cxa.qH, ms.z.get(cxa.qH))
      .build();
   static final Map<kh.b, BiConsumer<lz.b, cwy>> h = ImmutableMap.builder()
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
   public static final List<Pair<dkg, Function<ahh, mi>>> a = List.of(
      Pair.of(dkf.L, (Function<ahh, mi>)$$0 -> mi.a().a(mj.c, $$0)),
      Pair.of(dkf.M, (Function<ahh, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.b, mj.a.b).a(mj.d, true)),
      Pair.of(dkf.N, (Function<ahh, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.b, mj.a.c).a(mj.d, true)),
      Pair.of(dkf.O, (Function<ahh, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.b, mj.a.d).a(mj.d, true)),
      Pair.of(dkf.J, (Function<ahh, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.a, mj.a.d).a(mj.d, true)),
      Pair.of(dkf.K, (Function<ahh, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.a, mj.a.b).a(mj.d, true))
   );
   private static final Map<lz.d, ahh> i = new HashMap<>();

   private static mc a(cwy $$0, ahh $$1, mq $$2, BiConsumer<ahh, Supplier<JsonElement>> $$3) {
      ahh $$4 = mp.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static mc b(cwy $$0, ahh $$1, mq $$2, BiConsumer<ahh, Supplier<JsonElement>> $$3) {
      ahh $$4 = mp.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static mc c(cwy $$0, ahh $$1, mq $$2, BiConsumer<ahh, Supplier<JsonElement>> $$3) {
      ahh $$4 = mp.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public lz(Consumer<mc> $$0, BiConsumer<ahh, Supplier<JsonElement>> $$1, Consumer<cnb> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cwy $$0) {
      this.d.accept($$0.j());
   }

   void a(cwy $$0, ahh $$1) {
      this.c.accept(mn.a($$0.j()), new mm($$1));
   }

   private void a(cnb $$0, ahh $$1) {
      this.c.accept(mn.a($$0), new mm($$1));
   }

   void a(cnb $$0) {
      mp.bx.a(mn.a($$0), mq.b($$0), this.c);
   }

   private void d(cwy $$0) {
      cnb $$1 = $$0.j();
      if ($$1 != cnj.a) {
         mp.bx.a(mn.a($$1), mq.F($$0), this.c);
      }
   }

   private void a(cwy $$0, String $$1) {
      cnb $$2 = $$0.j();
      mp.bx.a(mn.a($$2), mq.k(mq.a($$0, $$1)), this.c);
   }

   private static mg b() {
      return mg.a(dkf.R).a(ic.f, mi.a().a(mj.b, mj.a.b)).a(ic.d, mi.a().a(mj.b, mj.a.c)).a(ic.e, mi.a().a(mj.b, mj.a.d)).a(ic.c, mi.a());
   }

   private static mg c() {
      return mg.a(dkf.R).a(ic.d, mi.a()).a(ic.e, mi.a().a(mj.b, mj.a.b)).a(ic.c, mi.a().a(mj.b, mj.a.c)).a(ic.f, mi.a().a(mj.b, mj.a.d));
   }

   private static mg d() {
      return mg.a(dkf.R).a(ic.f, mi.a()).a(ic.d, mi.a().a(mj.b, mj.a.b)).a(ic.e, mi.a().a(mj.b, mj.a.c)).a(ic.c, mi.a().a(mj.b, mj.a.d));
   }

   private static mg e() {
      return mg.a(dkf.P)
         .a(ic.a, mi.a().a(mj.a, mj.a.b))
         .a(ic.b, mi.a().a(mj.a, mj.a.d))
         .a(ic.c, mi.a())
         .a(ic.d, mi.a().a(mj.b, mj.a.c))
         .a(ic.e, mi.a().a(mj.b, mj.a.d))
         .a(ic.f, mi.a().a(mj.b, mj.a.b));
   }

   private static mf b(cwy $$0, ahh $$1) {
      return mf.a($$0, a($$1));
   }

   private static mi[] a(ahh $$0) {
      return new mi[]{mi.a().a(mj.c, $$0), mi.a().a(mj.c, $$0).a(mj.b, mj.a.b), mi.a().a(mj.c, $$0).a(mj.b, mj.a.c), mi.a().a(mj.c, $$0).a(mj.b, mj.a.d)};
   }

   private static mf a(cwy $$0, ahh $$1, ahh $$2) {
      return mf.a($$0, mi.a().a(mj.c, $$1), mi.a().a(mj.c, $$2), mi.a().a(mj.c, $$1).a(mj.b, mj.a.c), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c));
   }

   private static mg a(dkg $$0, ahh $$1, ahh $$2) {
      return mg.a($$0).a(true, mi.a().a(mj.c, $$1)).a(false, mi.a().a(mj.c, $$2));
   }

   private void e(cwy $$0) {
      ahh $$1 = ms.a.create($$0, this.c);
      ahh $$2 = ms.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cwy $$0) {
      ahh $$1 = ms.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cwy $$0) {
      this.b.accept(mf.a($$0).a(mg.a(dkf.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ahh $$3 = mq.a($$0, $$2);
         return mi.a().a(mj.c, mp.c.a($$0, $$2, new mq().a(mr.a, $$3), this.c));
      })));
      this.a($$0, mq.a($$0, "_0"));
   }

   static mc b(cwy $$0, ahh $$1, ahh $$2) {
      return mf.a($$0)
         .a(mg.a(dkf.w).a(false, mi.a().a(mj.c, $$1)).a(true, mi.a().a(mj.c, $$2)))
         .a(
            mg.a(dkf.U, dkf.R)
               .a(dka.a, ic.f, mi.a().a(mj.b, mj.a.b))
               .a(dka.a, ic.e, mi.a().a(mj.b, mj.a.d))
               .a(dka.a, ic.d, mi.a().a(mj.b, mj.a.c))
               .a(dka.a, ic.c, mi.a())
               .a(dka.b, ic.f, mi.a().a(mj.b, mj.a.b).a(mj.a, mj.a.b).a(mj.d, true))
               .a(dka.b, ic.e, mi.a().a(mj.b, mj.a.d).a(mj.a, mj.a.b).a(mj.d, true))
               .a(dka.b, ic.d, mi.a().a(mj.b, mj.a.c).a(mj.a, mj.a.b).a(mj.d, true))
               .a(dka.b, ic.c, mi.a().a(mj.a, mj.a.b).a(mj.d, true))
               .a(dka.c, ic.f, mi.a().a(mj.b, mj.a.d).a(mj.a, mj.a.c))
               .a(dka.c, ic.e, mi.a().a(mj.b, mj.a.b).a(mj.a, mj.a.c))
               .a(dka.c, ic.d, mi.a().a(mj.a, mj.a.c))
               .a(dka.c, ic.c, mi.a().a(mj.b, mj.a.c).a(mj.a, mj.a.c))
         );
   }

   private static mg.d<ic, dkl, dkk, Boolean> a(mg.d<ic, dkl, dkk, Boolean> $$0, dkl $$1, ahh $$2, ahh $$3, ahh $$4, ahh $$5) {
      return $$0.a(ic.f, $$1, dkk.a, false, mi.a().a(mj.c, $$2))
         .a(ic.d, $$1, dkk.a, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
         .a(ic.e, $$1, dkk.a, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
         .a(ic.c, $$1, dkk.a, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
         .a(ic.f, $$1, dkk.b, false, mi.a().a(mj.c, $$4))
         .a(ic.d, $$1, dkk.b, false, mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
         .a(ic.e, $$1, dkk.b, false, mi.a().a(mj.c, $$4).a(mj.b, mj.a.c))
         .a(ic.c, $$1, dkk.b, false, mi.a().a(mj.c, $$4).a(mj.b, mj.a.d))
         .a(ic.f, $$1, dkk.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
         .a(ic.d, $$1, dkk.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
         .a(ic.e, $$1, dkk.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
         .a(ic.c, $$1, dkk.a, true, mi.a().a(mj.c, $$3))
         .a(ic.f, $$1, dkk.b, true, mi.a().a(mj.c, $$5).a(mj.b, mj.a.d))
         .a(ic.d, $$1, dkk.b, true, mi.a().a(mj.c, $$5))
         .a(ic.e, $$1, dkk.b, true, mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
         .a(ic.c, $$1, dkk.b, true, mi.a().a(mj.c, $$5).a(mj.b, mj.a.c));
   }

   private static mc a(cwy $$0, ahh $$1, ahh $$2, ahh $$3, ahh $$4, ahh $$5, ahh $$6, ahh $$7, ahh $$8) {
      return mf.a($$0).a(a(a(mg.a(dkf.R, dkf.ae, dkf.be, dkf.u), dkl.b, $$1, $$2, $$3, $$4), dkl.a, $$5, $$6, $$7, $$8));
   }

   static mc a(cwy $$0, ahh $$1, ahh $$2, ahh $$3, ahh $$4, ahh $$5) {
      return me.a($$0)
         .a(mi.a().a(mj.c, $$1))
         .a(md.a().a(dkf.L, true), mi.a().a(mj.c, $$2).a(mj.d, false))
         .a(md.a().a(dkf.M, true), mi.a().a(mj.c, $$3).a(mj.d, false))
         .a(md.a().a(dkf.N, true), mi.a().a(mj.c, $$4).a(mj.d, false))
         .a(md.a().a(dkf.O, true), mi.a().a(mj.c, $$5).a(mj.d, false));
   }

   static mc c(cwy $$0, ahh $$1, ahh $$2) {
      return me.a($$0)
         .a(mi.a().a(mj.c, $$1))
         .a(md.a().a(dkf.L, true), mi.a().a(mj.c, $$2).a(mj.d, true))
         .a(md.a().a(dkf.M, true), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true))
         .a(md.a().a(dkf.N, true), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true))
         .a(md.a().a(dkf.O, true), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true));
   }

   static mc a(cwy $$0, ahh $$1, ahh $$2, ahh $$3) {
      return me.a($$0)
         .a(md.a().a(dkf.J, true), mi.a().a(mj.c, $$1))
         .a(md.a().a(dkf.X, dlb.b), mi.a().a(mj.c, $$2).a(mj.d, true))
         .a(md.a().a(dkf.W, dlb.b), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true))
         .a(md.a().a(dkf.Y, dlb.b), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true))
         .a(md.a().a(dkf.Z, dlb.b), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true))
         .a(md.a().a(dkf.X, dlb.c), mi.a().a(mj.c, $$3).a(mj.d, true))
         .a(md.a().a(dkf.W, dlb.c), mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true))
         .a(md.a().a(dkf.Y, dlb.c), mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true))
         .a(md.a().a(dkf.Z, dlb.c), mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true));
   }

   static mc a(cwy $$0, ahh $$1, ahh $$2, ahh $$3, ahh $$4, boolean $$5) {
      return mf.a($$0, mi.a().a(mj.d, $$5))
         .a(c())
         .a(
            mg.a(dkf.q, dkf.u)
               .a(false, false, mi.a().a(mj.c, $$2))
               .a(true, false, mi.a().a(mj.c, $$4))
               .a(false, true, mi.a().a(mj.c, $$1))
               .a(true, true, mi.a().a(mj.c, $$3))
         );
   }

   static mc b(cwy $$0, ahh $$1, ahh $$2, ahh $$3) {
      return mf.a($$0)
         .a(
            mg.a(dkf.R, dkf.af, dkf.bi)
               .a(ic.f, dko.b, dky.a, mi.a().a(mj.c, $$2))
               .a(ic.e, dko.b, dky.a, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dko.b, dky.a, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dko.b, dky.a, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dko.b, dky.e, mi.a().a(mj.c, $$3))
               .a(ic.e, dko.b, dky.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dko.b, dky.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dko.b, dky.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dko.b, dky.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.e, dko.b, dky.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.d, dko.b, dky.d, mi.a().a(mj.c, $$3))
               .a(ic.c, dko.b, dky.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.f, dko.b, dky.c, mi.a().a(mj.c, $$1))
               .a(ic.e, dko.b, dky.c, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dko.b, dky.c, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dko.b, dky.c, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dko.b, dky.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.e, dko.b, dky.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.d, dko.b, dky.b, mi.a().a(mj.c, $$1))
               .a(ic.c, dko.b, dky.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.f, dko.a, dky.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.e, dko.a, dky.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dko.a, dky.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dko.a, dky.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dko.a, dky.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.e, dko.a, dky.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.d, dko.a, dky.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.c, dko.a, dky.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.f, dko.a, dky.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.e, dko.a, dky.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dko.a, dky.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dko.a, dky.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dko.a, dky.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.e, dko.a, dky.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.d, dko.a, dky.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.c, dko.a, dky.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.f, dko.a, dky.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.e, dko.a, dky.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dko.a, dky.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dko.a, dky.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
         );
   }

   private static mc c(cwy $$0, ahh $$1, ahh $$2, ahh $$3) {
      return mf.a($$0)
         .a(
            mg.a(dkf.R, dkf.af, dkf.u)
               .a(ic.c, dko.b, false, mi.a().a(mj.c, $$2))
               .a(ic.d, dko.b, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
               .a(ic.f, dko.b, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
               .a(ic.e, dko.b, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
               .a(ic.c, dko.a, false, mi.a().a(mj.c, $$1))
               .a(ic.d, dko.a, false, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
               .a(ic.f, dko.a, false, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
               .a(ic.e, dko.a, false, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
               .a(ic.c, dko.b, true, mi.a().a(mj.c, $$3))
               .a(ic.d, dko.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(ic.f, dko.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(ic.e, dko.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               .a(ic.c, dko.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.c))
               .a(ic.d, dko.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.a))
               .a(ic.f, dko.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.d))
               .a(ic.e, dko.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.b))
         );
   }

   private static mc d(cwy $$0, ahh $$1, ahh $$2, ahh $$3) {
      return mf.a($$0)
         .a(
            mg.a(dkf.R, dkf.af, dkf.u)
               .a(ic.c, dko.b, false, mi.a().a(mj.c, $$2))
               .a(ic.d, dko.b, false, mi.a().a(mj.c, $$2))
               .a(ic.f, dko.b, false, mi.a().a(mj.c, $$2))
               .a(ic.e, dko.b, false, mi.a().a(mj.c, $$2))
               .a(ic.c, dko.a, false, mi.a().a(mj.c, $$1))
               .a(ic.d, dko.a, false, mi.a().a(mj.c, $$1))
               .a(ic.f, dko.a, false, mi.a().a(mj.c, $$1))
               .a(ic.e, dko.a, false, mi.a().a(mj.c, $$1))
               .a(ic.c, dko.b, true, mi.a().a(mj.c, $$3))
               .a(ic.d, dko.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(ic.f, dko.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(ic.e, dko.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               .a(ic.c, dko.a, true, mi.a().a(mj.c, $$3))
               .a(ic.d, dko.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(ic.f, dko.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(ic.e, dko.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
         );
   }

   static mf c(cwy $$0, ahh $$1) {
      return mf.a($$0, mi.a().a(mj.c, $$1));
   }

   private static mg f() {
      return mg.a(dkf.I).a(ic.a.b, mi.a()).a(ic.a.c, mi.a().a(mj.a, mj.a.b)).a(ic.a.a, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b));
   }

   static mc a(cwy $$0, mq $$1, BiConsumer<ahh, Supplier<JsonElement>> $$2) {
      ahh $$3 = mp.g.a($$0, $$1, $$2);
      ahh $$4 = mp.h.a($$0, $$1, $$2);
      ahh $$5 = mp.i.a($$0, $$1, $$2);
      ahh $$6 = mp.j.a($$0, $$1, $$2);
      return mf.a($$0, mi.a().a(mj.c, $$6)).a(mg.a(dkf.I).a(ic.a.a, mi.a().a(mj.c, $$3)).a(ic.a.b, mi.a().a(mj.c, $$4)).a(ic.a.c, mi.a().a(mj.c, $$5)));
   }

   static mc d(cwy $$0, ahh $$1) {
      return mf.a($$0, mi.a().a(mj.c, $$1)).a(f());
   }

   private void e(cwy $$0, ahh $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cwy $$0, ms.a $$1) {
      ahh $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cwy $$0, ms.a $$1) {
      ahh $$2 = $$1.create($$0, this.c);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, $$2)).a(b()));
   }

   static mc d(cwy $$0, ahh $$1, ahh $$2) {
      return mf.a($$0)
         .a(
            mg.a(dkf.I)
               .a(ic.a.b, mi.a().a(mj.c, $$1))
               .a(ic.a.c, mi.a().a(mj.c, $$2).a(mj.a, mj.a.b))
               .a(ic.a.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.b).a(mj.b, mj.a.b))
         );
   }

   private void a(cwy $$0, ms.a $$1, ms.a $$2) {
      ahh $$3 = $$1.create($$0, this.c);
      ahh $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ahh a(cwy $$0, String $$1, mo $$2, Function<ahh, mq> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mq.a($$0, $$1)), this.c);
   }

   static mc e(cwy $$0, ahh $$1, ahh $$2) {
      return mf.a($$0).a(a(dkf.w, $$2, $$1));
   }

   static mc e(cwy $$0, ahh $$1, ahh $$2, ahh $$3) {
      return mf.a($$0).a(mg.a(dkf.bh).a(dkx.b, mi.a().a(mj.c, $$1)).a(dkx.a, mi.a().a(mj.c, $$2)).a(dkx.c, mi.a().a(mj.c, $$3)));
   }

   public void a(cwy $$0) {
      this.b($$0, ms.a);
   }

   public void b(cwy $$0, ms.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cwy $$0, mq $$1, mo $$2) {
      ahh $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private lz.b h(cwy $$0) {
      ms $$1 = this.g.getOrDefault($$0, ms.a.get($$0));
      return new lz.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cwy $$0, cwy $$1, cwy $$2) {
      mq $$3 = mq.u($$0);
      ahh $$4 = mp.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void i(cwy $$0) {
      mq $$1 = mq.t($$0);
      ahh $$2 = mp.v.a($$0, $$1, this.c);
      ahh $$3 = mp.w.a($$0, $$1, this.c);
      ahh $$4 = mp.x.a($$0, $$1, this.c);
      ahh $$5 = mp.y.a($$0, $$1, this.c);
      ahh $$6 = mp.z.a($$0, $$1, this.c);
      ahh $$7 = mp.A.a($$0, $$1, this.c);
      ahh $$8 = mp.B.a($$0, $$1, this.c);
      ahh $$9 = mp.C.a($$0, $$1, this.c);
      this.a($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(cwy $$0, cwy $$1) {
      ahh $$2 = mp.v.a($$0);
      ahh $$3 = mp.w.a($$0);
      ahh $$4 = mp.x.a($$0);
      ahh $$5 = mp.y.a($$0);
      ahh $$6 = mp.z.a($$0);
      ahh $$7 = mp.A.a($$0);
      ahh $$8 = mp.B.a($$0);
      ahh $$9 = mp.C.a($$0);
      this.a($$1, mn.a($$0.j()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cwy $$0) {
      mq $$1 = mq.b($$0);
      ahh $$2 = mp.ak.a($$0, $$1, this.c);
      ahh $$3 = mp.al.a($$0, $$1, this.c);
      ahh $$4 = mp.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cwy $$0) {
      mq $$1 = mq.b($$0);
      ahh $$2 = mp.ah.a($$0, $$1, this.c);
      ahh $$3 = mp.ai.a($$0, $$1, this.c);
      ahh $$4 = mp.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(cwy $$0, cwy $$1) {
      ahh $$2 = mp.ah.a($$0);
      ahh $$3 = mp.ai.a($$0);
      ahh $$4 = mp.aj.a($$0);
      this.a($$1, mn.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(cxa.sD);
      ahh $$0 = mn.a(cxa.sD);
      ahh $$1 = mn.a(cxa.sD, "_partial_tilt");
      ahh $$2 = mn.a(cxa.sD, "_full_tilt");
      this.b
         .accept(
            mf.a(cxa.sD)
               .a(b())
               .a(mg.a(dkf.bl).a(dla.a, mi.a().a(mj.c, $$0)).a(dla.b, mi.a().a(mj.c, $$0)).a(dla.c, mi.a().a(mj.c, $$1)).a(dla.d, mi.a().a(mj.c, $$2)))
         );
   }

   private lz.f l(cwy $$0) {
      return new lz.f(mq.n($$0));
   }

   private void m(cwy $$0) {
      this.c($$0, $$0);
   }

   private void c(cwy $$0, cwy $$1) {
      this.b.accept(c($$0, mn.a($$1)));
   }

   private void a(cwy $$0, lz.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cwy $$0, lz.e $$1, mq $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cwy $$0, lz.e $$1) {
      mq $$2 = mq.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cwy $$0, lz.e $$1, mq $$2) {
      ahh $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cwy $$0, lz.e $$1, dks<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         mg $$4 = mg.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mq $$5 = mq.c(mq.a($$0, $$4x));
            ahh $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return mi.a().a(mj.c, $$6);
         });
         this.a($$0.j());
         this.b.accept(mf.a($$0).a($$4));
      }
   }

   private void a(cwy $$0, cwy $$1, lz.e $$2) {
      this.a($$0, $$2);
      mq $$3 = mq.d($$0);
      ahh $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(cwy $$0, cwy $$1) {
      ms $$2 = ms.p.get($$0);
      ahh $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ahh $$4 = mp.aC.a($$1, $$2.b(), this.c);
      this.b.accept(mf.a($$1, mi.a().a(mj.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(cwy $$0, cwy $$1) {
      this.a($$0.j());
      mq $$2 = mq.h($$0);
      mq $$3 = mq.a($$0, $$1);
      ahh $$4 = mp.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            mf.a($$1, mi.a().a(mj.c, $$4))
               .a(mg.a(dkf.R).a(ic.e, mi.a()).a(ic.d, mi.a().a(mj.b, mj.a.d)).a(ic.c, mi.a().a(mj.b, mj.a.b)).a(ic.f, mi.a().a(mj.b, mj.a.c)))
         );
      this.b.accept(mf.a($$0).a(mg.a(dkf.av).a($$2x -> mi.a().a(mj.c, mp.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cwy $$0 = cxa.kC;
      this.a($$0.j());
      ahh $$1 = mn.a($$0, "_top");
      ahh $$2 = mn.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cwy $$0 = cxa.kB;
      this.a($$0.j());
      mg $$1 = mg.a(dcm.d, dkf.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> mi.a().a(mj.c, mn.a($$0, "_top_stage_" + $$1x));
            case b -> mi.a().a(mj.c, mn.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mf.a($$0).a($$1));
   }

   private void a(cwy $$0, cwy $$1, cwy $$2, cwy $$3, cwy $$4, cwy $$5, cwy $$6, cwy $$7) {
      this.a($$0, lz.e.b);
      this.a($$1, lz.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(cwy $$0, lz.e $$1) {
      this.a($$0, "_top");
      ahh $$2 = this.a($$0, "_top", $$1.a(), mq::c);
      ahh $$3 = this.a($$0, "_bottom", $$1.a(), mq::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cxa.iD, "_front");
      ahh $$0 = mn.a(cxa.iD, "_top");
      ahh $$1 = this.a(cxa.iD, "_bottom", lz.e.b.a(), mq::c);
      this.f(cxa.iD, $$0, $$1);
   }

   private void k() {
      ahh $$0 = this.a(cxa.bx, "_top", mp.bk, mq::a);
      ahh $$1 = this.a(cxa.bx, "_bottom", mp.bk, mq::a);
      this.f(cxa.bx, $$0, $$1);
   }

   private void l() {
      this.c(cxa.sF);
      ahh $$0 = mn.a(cxa.sF, "_top");
      ahh $$1 = mn.a(cxa.sF, "_bottom");
      this.b.accept(mf.a(cxa.sF).a(b()).a(mg.a(dkf.ae).a(dkl.b, mi.a().a(mj.c, $$1)).a(dkl.a, mi.a().a(mj.c, $$0))));
   }

   private void f(cwy $$0, ahh $$1, ahh $$2) {
      this.b.accept(mf.a($$0).a(mg.a(dkf.ae).a(dkl.b, mi.a().a(mj.c, $$2)).a(dkl.a, mi.a().a(mj.c, $$1))));
   }

   private void n(cwy $$0) {
      mq $$1 = mq.e($$0);
      mq $$2 = mq.e(mq.a($$0, "_corner"));
      ahh $$3 = mp.as.a($$0, $$1, this.c);
      ahh $$4 = mp.at.a($$0, $$2, this.c);
      ahh $$5 = mp.au.a($$0, $$1, this.c);
      ahh $$6 = mp.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            mf.a($$0)
               .a(
                  mg.a(dkf.ag)
                     .a(dkt.a, mi.a().a(mj.c, $$3))
                     .a(dkt.b, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
                     .a(dkt.c, mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
                     .a(dkt.d, mi.a().a(mj.c, $$6).a(mj.b, mj.a.b))
                     .a(dkt.e, mi.a().a(mj.c, $$5))
                     .a(dkt.f, mi.a().a(mj.c, $$6))
                     .a(dkt.g, mi.a().a(mj.c, $$4))
                     .a(dkt.h, mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
                     .a(dkt.i, mi.a().a(mj.c, $$4).a(mj.b, mj.a.c))
                     .a(dkt.j, mi.a().a(mj.c, $$4).a(mj.b, mj.a.d))
               )
         );
   }

   private void o(cwy $$0) {
      ahh $$1 = this.a($$0, "", mp.as, mq::e);
      ahh $$2 = this.a($$0, "", mp.au, mq::e);
      ahh $$3 = this.a($$0, "", mp.av, mq::e);
      ahh $$4 = this.a($$0, "_on", mp.as, mq::e);
      ahh $$5 = this.a($$0, "_on", mp.au, mq::e);
      ahh $$6 = this.a($$0, "_on", mp.av, mq::e);
      mg $$7 = mg.a(dkf.w, dkf.ah).a(($$6x, $$7x) -> {
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

   private lz.a a(ahh $$0, cwy $$1) {
      return new lz.a($$0, $$1);
   }

   private lz.a f(cwy $$0, cwy $$1) {
      return new lz.a(mn.a($$0), $$1);
   }

   private void a(cwy $$0, cnb $$1) {
      ahh $$2 = mp.aa.a($$0, mq.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cwy $$0, ahh $$1) {
      ahh $$2 = mp.aa.a($$0, mq.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(cwy $$0, cwy $$1) {
      this.a($$0);
      ahh $$2 = ms.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cwy $$0) {
      this.a($$0.j());
      ahh $$1 = ms.k.create($$0, this.c);
      ahh $$2 = ms.l.create($$0, this.c);
      ahh $$3 = ms.m.create($$0, this.c);
      ahh $$4 = ms.n.create($$0, this.c);
      this.b
         .accept(
            me.a($$0)
               .a(md.a().a(dkf.S, 1, 2, 3, 4).a(dkf.R, ic.c), mi.a().a(mj.c, $$1))
               .a(md.a().a(dkf.S, 1, 2, 3, 4).a(dkf.R, ic.f), mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.S, 1, 2, 3, 4).a(dkf.R, ic.d), mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
               .a(md.a().a(dkf.S, 1, 2, 3, 4).a(dkf.R, ic.e), mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
               .a(md.a().a(dkf.S, 2, 3, 4).a(dkf.R, ic.c), mi.a().a(mj.c, $$2))
               .a(md.a().a(dkf.S, 2, 3, 4).a(dkf.R, ic.f), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.S, 2, 3, 4).a(dkf.R, ic.d), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
               .a(md.a().a(dkf.S, 2, 3, 4).a(dkf.R, ic.e), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
               .a(md.a().a(dkf.S, 3, 4).a(dkf.R, ic.c), mi.a().a(mj.c, $$3))
               .a(md.a().a(dkf.S, 3, 4).a(dkf.R, ic.f), mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.S, 3, 4).a(dkf.R, ic.d), mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(md.a().a(dkf.S, 3, 4).a(dkf.R, ic.e), mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               .a(md.a().a(dkf.S, 4).a(dkf.R, ic.c), mi.a().a(mj.c, $$4))
               .a(md.a().a(dkf.S, 4).a(dkf.R, ic.f), mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.S, 4).a(dkf.R, ic.d), mi.a().a(mj.c, $$4).a(mj.b, mj.a.c))
               .a(md.a().a(dkf.S, 4).a(dkf.R, ic.e), mi.a().a(mj.c, $$4).a(mj.b, mj.a.d))
         );
   }

   private void a(ms.a $$0, cwy... $$1) {
      for (cwy $$2 : $$1) {
         ahh $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ms.a $$0, cwy... $$1) {
      for (cwy $$2 : $$1) {
         ahh $$3 = $$0.create($$2, this.c);
         this.b.accept(mf.a($$2, mi.a().a(mj.c, $$3)).a(c()));
      }
   }

   private void h(cwy $$0, cwy $$1) {
      this.a($$0);
      mq $$2 = mq.b($$0, $$1);
      ahh $$3 = mp.aI.a($$1, $$2, this.c);
      ahh $$4 = mp.aJ.a($$1, $$2, this.c);
      ahh $$5 = mp.aK.a($$1, $$2, this.c);
      ahh $$6 = mp.aG.a($$1, $$2, this.c);
      ahh $$7 = mp.aH.a($$1, $$2, this.c);
      cnb $$8 = $$1.j();
      mp.bx.a(mn.a($$8), mq.F($$0), this.c);
      this.b
         .accept(
            me.a($$1)
               .a(mi.a().a(mj.c, $$3))
               .a(md.a().a(dkf.L, true), mi.a().a(mj.c, $$4))
               .a(md.a().a(dkf.M, true), mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.N, true), mi.a().a(mj.c, $$5))
               .a(md.a().a(dkf.O, true), mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.L, false), mi.a().a(mj.c, $$6))
               .a(md.a().a(dkf.M, false), mi.a().a(mj.c, $$7))
               .a(md.a().a(dkf.N, false), mi.a().a(mj.c, $$7).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.O, false), mi.a().a(mj.c, $$6).a(mj.b, mj.a.d))
         );
   }

   private void q(cwy $$0) {
      mq $$1 = mq.z($$0);
      ahh $$2 = mp.aL.a($$0, $$1, this.c);
      ahh $$3 = this.a($$0, "_conditional", mp.aL, $$1x -> $$1.c(mr.i, $$1x));
      this.b.accept(mf.a($$0).a(a(dkf.c, $$3, $$2)).a(e()));
   }

   private void r(cwy $$0) {
      ahh $$1 = ms.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<mi> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> mi.a().a(mj.c, mn.a(cxa.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cxa.mZ);
      this.b
         .accept(
            me.a(cxa.mZ)
               .a(md.a().a(dkf.aq, 0), this.a(0))
               .a(md.a().a(dkf.aq, 1), this.a(1))
               .a(md.a().a(dkf.bk, dkb.b), mi.a().a(mj.c, mn.a(cxa.mZ, "_small_leaves")))
               .a(md.a().a(dkf.bk, dkb.c), mi.a().a(mj.c, mn.a(cxa.mZ, "_large_leaves")))
         );
   }

   private mg n() {
      return mg.a(dkf.P)
         .a(ic.a, mi.a().a(mj.a, mj.a.c))
         .a(ic.b, mi.a())
         .a(ic.c, mi.a().a(mj.a, mj.a.b))
         .a(ic.d, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.c))
         .a(ic.e, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.d))
         .a(ic.f, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b));
   }

   private void o() {
      ahh $$0 = mq.a(cxa.nU, "_top_open");
      this.b
         .accept(
            mf.a(cxa.nU)
               .a(this.n())
               .a(
                  mg.a(dkf.u)
                     .a(false, mi.a().a(mj.c, ms.f.create(cxa.nU, this.c)))
                     .a(true, mi.a().a(mj.c, ms.f.get(cxa.nU).a($$1 -> $$1.a(mr.f, $$0)).a(cxa.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mg a(dks<T> $$0, T $$1, ahh $$2, ahh $$3) {
      mi $$4 = mi.a().a(mj.c, $$2);
      mi $$5 = mi.a().a(mj.c, $$3);
      return mg.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cwy $$0, Function<cwy, mq> $$1) {
      mq $$2 = $$1.apply($$0).b(mr.i, mr.c);
      mq $$3 = $$2.c(mr.g, mq.a($$0, "_front_honey"));
      ahh $$4 = mp.q.a($$0, $$2, this.c);
      ahh $$5 = mp.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(mf.a($$0).a(b()).a(a(dkf.aN, 5, $$5, $$4)));
   }

   private void a(cwy $$0, dks<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ahh> $$3 = new Int2ObjectOpenHashMap();
         mg $$4 = mg.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ahh $$5 = (ahh)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mp.aV, mq::g));
            return mi.a().a(mj.c, $$5);
         });
         this.a($$0.j());
         this.b.accept(mf.a($$0).a($$4));
      }
   }

   private void p() {
      ahh $$0 = mn.a(cxa.od, "_floor");
      ahh $$1 = mn.a(cxa.od, "_ceiling");
      ahh $$2 = mn.a(cxa.od, "_wall");
      ahh $$3 = mn.a(cxa.od, "_between_walls");
      this.a(cnj.wi);
      this.b
         .accept(
            mf.a(cxa.od)
               .a(
                  mg.a(dkf.R, dkf.V)
                     .a(ic.c, dkd.a, mi.a().a(mj.c, $$0))
                     .a(ic.d, dkd.a, mi.a().a(mj.c, $$0).a(mj.b, mj.a.c))
                     .a(ic.f, dkd.a, mi.a().a(mj.c, $$0).a(mj.b, mj.a.b))
                     .a(ic.e, dkd.a, mi.a().a(mj.c, $$0).a(mj.b, mj.a.d))
                     .a(ic.c, dkd.b, mi.a().a(mj.c, $$1))
                     .a(ic.d, dkd.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
                     .a(ic.f, dkd.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
                     .a(ic.e, dkd.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
                     .a(ic.c, dkd.c, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
                     .a(ic.d, dkd.c, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
                     .a(ic.f, dkd.c, mi.a().a(mj.c, $$2))
                     .a(ic.e, dkd.c, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
                     .a(ic.d, dkd.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
                     .a(ic.c, dkd.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
                     .a(ic.f, dkd.d, mi.a().a(mj.c, $$3))
                     .a(ic.e, dkd.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mf.a(cxa.nZ, mi.a().a(mj.c, mn.a(cxa.nZ)))
               .a(
                  mg.a(dkf.U, dkf.R)
                     .a(dka.a, ic.c, mi.a())
                     .a(dka.a, ic.f, mi.a().a(mj.b, mj.a.b))
                     .a(dka.a, ic.d, mi.a().a(mj.b, mj.a.c))
                     .a(dka.a, ic.e, mi.a().a(mj.b, mj.a.d))
                     .a(dka.b, ic.c, mi.a().a(mj.a, mj.a.b))
                     .a(dka.b, ic.f, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b))
                     .a(dka.b, ic.d, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.c))
                     .a(dka.b, ic.e, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.d))
                     .a(dka.c, ic.d, mi.a().a(mj.a, mj.a.c))
                     .a(dka.c, ic.e, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.b))
                     .a(dka.c, ic.c, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.c))
                     .a(dka.c, ic.f, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.d))
               )
         );
   }

   private void d(cwy $$0, ms.a $$1) {
      ahh $$2 = $$1.create($$0, this.c);
      ahh $$3 = mq.a($$0, "_front_on");
      ahh $$4 = $$1.get($$0).a($$1x -> $$1x.a(mr.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mf.a($$0).a(a(dkf.r, $$4, $$2)).a(b()));
   }

   private void a(cwy... $$0) {
      ahh $$1 = mn.a("campfire_off");

      for (cwy $$2 : $$0) {
         ahh $$3 = mp.bc.a($$2, mq.E($$2), this.c);
         this.a($$2.j());
         this.b.accept(mf.a($$2).a(a(dkf.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cwy $$0) {
      ahh $$1 = mp.bt.a($$0, mq.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cwy $$0) {
      ahh $$1;
      if ($$0 == cxa.tj) {
         $$1 = mp.bv.a($$0, mq.m($$0), this.c);
      } else {
         $$1 = mp.bu.a($$0, mq.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mq $$0 = mq.a(mq.G(cxa.cl), mq.G(cxa.n));
      ahh $$1 = mp.j.a(cxa.cl, $$0, this.c);
      this.b.accept(c(cxa.cl, $$1));
   }

   private void s() {
      this.a(cnj.lG);
      this.b
         .accept(
            me.a(cxa.cw)
               .a(
                  md.b(
                     md.a().a(dkf.ab, dku.c).a(dkf.aa, dku.c).a(dkf.ac, dku.c).a(dkf.ad, dku.c),
                     md.a().a(dkf.ab, dku.b, dku.a).a(dkf.aa, dku.b, dku.a),
                     md.a().a(dkf.aa, dku.b, dku.a).a(dkf.ac, dku.b, dku.a),
                     md.a().a(dkf.ac, dku.b, dku.a).a(dkf.ad, dku.b, dku.a),
                     md.a().a(dkf.ad, dku.b, dku.a).a(dkf.ab, dku.b, dku.a)
                  ),
                  mi.a().a(mj.c, mn.a("redstone_dust_dot"))
               )
               .a(md.a().a(dkf.ab, dku.b, dku.a), mi.a().a(mj.c, mn.a("redstone_dust_side0")))
               .a(md.a().a(dkf.ac, dku.b, dku.a), mi.a().a(mj.c, mn.a("redstone_dust_side_alt0")))
               .a(md.a().a(dkf.aa, dku.b, dku.a), mi.a().a(mj.c, mn.a("redstone_dust_side_alt1")).a(mj.b, mj.a.d))
               .a(md.a().a(dkf.ad, dku.b, dku.a), mi.a().a(mj.c, mn.a("redstone_dust_side1")).a(mj.b, mj.a.d))
               .a(md.a().a(dkf.ab, dku.a), mi.a().a(mj.c, mn.a("redstone_dust_up")))
               .a(md.a().a(dkf.aa, dku.a), mi.a().a(mj.c, mn.a("redstone_dust_up")).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.ac, dku.a), mi.a().a(mj.c, mn.a("redstone_dust_up")).a(mj.b, mj.a.c))
               .a(md.a().a(dkf.ad, dku.a), mi.a().a(mj.c, mn.a("redstone_dust_up")).a(mj.b, mj.a.d))
         );
   }

   private void t() {
      this.a(cnj.lK);
      this.b
         .accept(
            mf.a(cxa.gY)
               .a(c())
               .a(
                  mg.a(dkf.bd, dkf.w)
                     .a(dki.a, false, mi.a().a(mj.c, mn.a(cxa.gY)))
                     .a(dki.a, true, mi.a().a(mj.c, mn.a(cxa.gY, "_on")))
                     .a(dki.b, false, mi.a().a(mj.c, mn.a(cxa.gY, "_subtract")))
                     .a(dki.b, true, mi.a().a(mj.c, mn.a(cxa.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mq $$0 = mq.a(cxa.jR);
      mq $$1 = mq.a(mq.a(cxa.jE, "_side"), $$0.a(mr.f));
      ahh $$2 = mp.ab.a(cxa.jE, $$1, this.c);
      ahh $$3 = mp.ac.a(cxa.jE, $$1, this.c);
      ahh $$4 = mp.j.b(cxa.jE, "_double", $$1, this.c);
      this.b.accept(e(cxa.jE, $$2, $$3, $$4));
      this.b.accept(c(cxa.jR, mp.c.a(cxa.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cnj.sp);
      this.b
         .accept(
            me.a(cxa.fs)
               .a(mi.a().a(mj.c, mq.G(cxa.fs)))
               .a(md.a().a(dkf.k, true), mi.a().a(mj.c, mq.a(cxa.fs, "_bottle0")))
               .a(md.a().a(dkf.l, true), mi.a().a(mj.c, mq.a(cxa.fs, "_bottle1")))
               .a(md.a().a(dkf.m, true), mi.a().a(mj.c, mq.a(cxa.fs, "_bottle2")))
               .a(md.a().a(dkf.k, false), mi.a().a(mj.c, mq.a(cxa.fs, "_empty0")))
               .a(md.a().a(dkf.l, false), mi.a().a(mj.c, mq.a(cxa.fs, "_empty1")))
               .a(md.a().a(dkf.m, false), mi.a().a(mj.c, mq.a(cxa.fs, "_empty2")))
         );
   }

   private void u(cwy $$0) {
      ahh $$1 = mp.bp.a($$0, mq.b($$0), this.c);
      ahh $$2 = mn.a("mushroom_block_inside");
      this.b
         .accept(
            me.a($$0)
               .a(md.a().a(dkf.L, true), mi.a().a(mj.c, $$1))
               .a(md.a().a(dkf.M, true), mi.a().a(mj.c, $$1).a(mj.b, mj.a.b).a(mj.d, true))
               .a(md.a().a(dkf.N, true), mi.a().a(mj.c, $$1).a(mj.b, mj.a.c).a(mj.d, true))
               .a(md.a().a(dkf.O, true), mi.a().a(mj.c, $$1).a(mj.b, mj.a.d).a(mj.d, true))
               .a(md.a().a(dkf.J, true), mi.a().a(mj.c, $$1).a(mj.a, mj.a.d).a(mj.d, true))
               .a(md.a().a(dkf.K, true), mi.a().a(mj.c, $$1).a(mj.a, mj.a.b).a(mj.d, true))
               .a(md.a().a(dkf.L, false), mi.a().a(mj.c, $$2))
               .a(md.a().a(dkf.M, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, false))
               .a(md.a().a(dkf.N, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, false))
               .a(md.a().a(dkf.O, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, false))
               .a(md.a().a(dkf.J, false), mi.a().a(mj.c, $$2).a(mj.a, mj.a.d).a(mj.d, false))
               .a(md.a().a(dkf.K, false), mi.a().a(mj.c, $$2).a(mj.a, mj.a.b).a(mj.d, false))
         );
      this.a($$0, ms.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cnj.rA);
      this.b
         .accept(
            mf.a(cxa.eg)
               .a(
                  mg.a(dkf.ay)
                     .a(0, mi.a().a(mj.c, mn.a(cxa.eg)))
                     .a(1, mi.a().a(mj.c, mn.a(cxa.eg, "_slice1")))
                     .a(2, mi.a().a(mj.c, mn.a(cxa.eg, "_slice2")))
                     .a(3, mi.a().a(mj.c, mn.a(cxa.eg, "_slice3")))
                     .a(4, mi.a().a(mj.c, mn.a(cxa.eg, "_slice4")))
                     .a(5, mi.a().a(mj.c, mn.a(cxa.eg, "_slice5")))
                     .a(6, mi.a().a(mj.c, mn.a(cxa.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mq $$0 = new mq()
         .a(mr.c, mq.a(cxa.nX, "_side3"))
         .a(mr.o, mq.G(cxa.t))
         .a(mr.n, mq.a(cxa.nX, "_top"))
         .a(mr.j, mq.a(cxa.nX, "_side3"))
         .a(mr.l, mq.a(cxa.nX, "_side3"))
         .a(mr.k, mq.a(cxa.nX, "_side1"))
         .a(mr.m, mq.a(cxa.nX, "_side2"));
      this.b.accept(c(cxa.nX, mp.a.a(cxa.nX, $$0, this.c)));
   }

   private void y() {
      mq $$0 = new mq()
         .a(mr.c, mq.a(cxa.ob, "_front"))
         .a(mr.o, mq.a(cxa.ob, "_bottom"))
         .a(mr.n, mq.a(cxa.ob, "_top"))
         .a(mr.j, mq.a(cxa.ob, "_front"))
         .a(mr.k, mq.a(cxa.ob, "_front"))
         .a(mr.l, mq.a(cxa.ob, "_side"))
         .a(mr.m, mq.a(cxa.ob, "_side"));
      this.b.accept(c(cxa.ob, mp.a.a(cxa.ob, $$0, this.c)));
   }

   private void a(cwy $$0, cwy $$1, BiFunction<cwy, cwy, mq> $$2) {
      mq $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mp.a.a($$0, $$3, this.c)));
   }

   public void b(cwy $$0) {
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
      mq $$0 = mq.k(cxa.eZ);
      this.b.accept(c(cxa.eZ, mn.a(cxa.eZ)));
      this.a(cxa.ee, $$0);
      this.a(cxa.ef, $$0);
   }

   private void a(cwy $$0, mq $$1) {
      ahh $$2 = mp.p.a($$0, $$1.c(mr.g, mq.G($$0)), this.c);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cnj.sq);
      this.m(cxa.ft);
      this.b.accept(c(cxa.fv, mp.bs.a(cxa.fv, mq.j(mq.a(cxa.H, "_still")), this.c)));
      this.b
         .accept(
            mf.a(cxa.fu)
               .a(
                  mg.a(dbg.g)
                     .a(1, mi.a().a(mj.c, mp.bq.a(cxa.fu, "_level1", mq.j(mq.a(cxa.G, "_still")), this.c)))
                     .a(2, mi.a().a(mj.c, mp.br.a(cxa.fu, "_level2", mq.j(mq.a(cxa.G, "_still")), this.c)))
                     .a(3, mi.a().a(mj.c, mp.bs.a(cxa.fu, "_full", mq.j(mq.a(cxa.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mf.a(cxa.fw)
               .a(
                  mg.a(dbg.g)
                     .a(1, mi.a().a(mj.c, mp.bq.a(cxa.fw, "_level1", mq.j(mq.G(cxa.qP)), this.c)))
                     .a(2, mi.a().a(mj.c, mp.br.a(cxa.fw, "_level2", mq.j(mq.G(cxa.qP)), this.c)))
                     .a(3, mi.a().a(mj.c, mp.bs.a(cxa.fw, "_full", mq.j(mq.G(cxa.qP)), this.c)))
               )
         );
   }

   private void B() {
      mq $$0 = mq.b(cxa.kv);
      ahh $$1 = mp.aE.a(cxa.kv, $$0, this.c);
      ahh $$2 = this.a(cxa.kv, "_dead", mp.aE, $$1x -> $$0.c(mr.b, $$1x));
      this.b.accept(mf.a(cxa.kv).a(a(dkf.au, 5, $$2, $$1)));
   }

   private void C() {
      ahh $$0 = mn.a(cxa.tq);
      ahh $$1 = mn.a(cxa.tq, "_triggered");
      ahh $$2 = mn.a(cxa.tq, "_crafting");
      ahh $$3 = mn.a(cxa.tq, "_crafting_triggered");
      this.b
         .accept(
            mf.a(cxa.tq)
               .a(mg.a(dkf.T).a($$0x -> this.a($$0x, mi.a())))
               .a(
                  mg.a(dkf.A, cyr.b)
                     .a(false, false, mi.a().a(mj.c, $$0))
                     .a(true, true, mi.a().a(mj.c, $$3))
                     .a(true, false, mi.a().a(mj.c, $$1))
                     .a(false, true, mi.a().a(mj.c, $$2))
               )
         );
   }

   private void v(cwy $$0) {
      mq $$1 = new mq().a(mr.f, mq.a(cxa.cD, "_top")).a(mr.i, mq.a(cxa.cD, "_side")).a(mr.g, mq.a($$0, "_front"));
      mq $$2 = new mq().a(mr.i, mq.a(cxa.cD, "_top")).a(mr.g, mq.a($$0, "_front_vertical"));
      ahh $$3 = mp.p.a($$0, $$1, this.c);
      ahh $$4 = mp.r.a($$0, $$2, this.c);
      this.b
         .accept(
            mf.a($$0)
               .a(
                  mg.a(dkf.P)
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
      ahh $$0 = mn.a(cxa.fy);
      ahh $$1 = mn.a(cxa.fy, "_filled");
      this.b.accept(mf.a(cxa.fy).a(mg.a(dkf.h).a(false, mi.a().a(mj.c, $$0)).a(true, mi.a().a(mj.c, $$1))).a(c()));
   }

   private void E() {
      ahh $$0 = mn.a(cxa.ku, "_side");
      ahh $$1 = mn.a(cxa.ku, "_noside");
      ahh $$2 = mn.a(cxa.ku, "_noside1");
      ahh $$3 = mn.a(cxa.ku, "_noside2");
      ahh $$4 = mn.a(cxa.ku, "_noside3");
      this.b
         .accept(
            me.a(cxa.ku)
               .a(md.a().a(dkf.L, true), mi.a().a(mj.c, $$0))
               .a(md.a().a(dkf.M, true), mi.a().a(mj.c, $$0).a(mj.b, mj.a.b).a(mj.d, true))
               .a(md.a().a(dkf.N, true), mi.a().a(mj.c, $$0).a(mj.b, mj.a.c).a(mj.d, true))
               .a(md.a().a(dkf.O, true), mi.a().a(mj.c, $$0).a(mj.b, mj.a.d).a(mj.d, true))
               .a(md.a().a(dkf.J, true), mi.a().a(mj.c, $$0).a(mj.a, mj.a.d).a(mj.d, true))
               .a(md.a().a(dkf.K, true), mi.a().a(mj.c, $$0).a(mj.a, mj.a.b).a(mj.d, true))
               .a(md.a().a(dkf.L, false), mi.a().a(mj.c, $$1).a(mj.e, 2), mi.a().a(mj.c, $$2), mi.a().a(mj.c, $$3), mi.a().a(mj.c, $$4))
               .a(
                  md.a().a(dkf.M, false),
                  mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$4).a(mj.b, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.b, mj.a.b).a(mj.d, true)
               )
               .a(
                  md.a().a(dkf.N, false),
                  mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true),
                  mi.a().a(mj.c, $$4).a(mj.b, mj.a.c).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.b, mj.a.c).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true)
               )
               .a(
                  md.a().a(dkf.O, false),
                  mi.a().a(mj.c, $$4).a(mj.b, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.b, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true)
               )
               .a(
                  md.a().a(dkf.J, false),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.a, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$4).a(mj.a, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.a, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.a, mj.a.d).a(mj.d, true)
               )
               .a(
                  md.a().a(dkf.K, false),
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
            me.a(cxa.pc)
               .a(mi.a().a(mj.c, mq.G(cxa.pc)))
               .a(md.a().a(dkf.aL, 1), mi.a().a(mj.c, mq.a(cxa.pc, "_contents1")))
               .a(md.a().a(dkf.aL, 2), mi.a().a(mj.c, mq.a(cxa.pc, "_contents2")))
               .a(md.a().a(dkf.aL, 3), mi.a().a(mj.c, mq.a(cxa.pc, "_contents3")))
               .a(md.a().a(dkf.aL, 4), mi.a().a(mj.c, mq.a(cxa.pc, "_contents4")))
               .a(md.a().a(dkf.aL, 5), mi.a().a(mj.c, mq.a(cxa.pc, "_contents5")))
               .a(md.a().a(dkf.aL, 6), mi.a().a(mj.c, mq.a(cxa.pc, "_contents6")))
               .a(md.a().a(dkf.aL, 7), mi.a().a(mj.c, mq.a(cxa.pc, "_contents7")))
               .a(md.a().a(dkf.aL, 8), mi.a().a(mj.c, mq.a(cxa.pc, "_contents_ready")))
         );
   }

   private void w(cwy $$0) {
      ahh $$1 = mp.c.a($$0, mq.a($$0), this.c);
      ahh $$2 = this.a($$0, "_powered", mp.c, mq::b);
      ahh $$3 = this.a($$0, "_lit", mp.c, mq::b);
      ahh $$4 = this.a($$0, "_lit_powered", mp.c, mq::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private mc a(cwy $$0, ahh $$1, ahh $$2, ahh $$3, ahh $$4) {
      return mf.a($$0).a(mg.a(dkf.r, dkf.w).a(($$4x, $$5) -> $$4x ? mi.a().a(mj.c, $$5 ? $$4 : $$2) : mi.a().a(mj.c, $$5 ? $$3 : $$1)));
   }

   private void i(cwy $$0, cwy $$1) {
      ahh $$2 = mn.a($$0);
      ahh $$3 = mn.a($$0, "_powered");
      ahh $$4 = mn.a($$0, "_lit");
      ahh $$5 = mn.a($$0, "_lit_powered");
      this.a($$1, mn.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(cwy $$0) {
      this.c($$0);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mp.ao.a($$0, mq.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(cxa.qy);
      this.x(cxa.qx);
      this.x(cxa.qw);
      this.x(cxa.qv);
   }

   private void H() {
      this.c(cxa.st);
      mg.b<ic, dkm> $$0 = mg.a(dkf.bm, dkf.bn);

      for (dkm $$1 : dkm.values()) {
         $$0.a(ic.b, $$1, this.a(ic.b, $$1));
      }

      for (dkm $$2 : dkm.values()) {
         $$0.a(ic.a, $$2, this.a(ic.a, $$2));
      }

      this.b.accept(mf.a(cxa.st).a($$0));
   }

   private mi a(ic $$0, dkm $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mq $$3 = mq.c(mq.a(cxa.st, $$2));
      return mi.a().a(mj.c, mp.an.a(cxa.st, $$2, $$3, this.c));
   }

   private void y(cwy $$0) {
      mq $$1 = new mq().a(mr.e, mq.G(cxa.dV)).a(mr.f, mq.G($$0)).a(mr.i, mq.a($$0, "_side"));
      this.b.accept(c($$0, mp.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ahh $$0 = mq.a(cxa.gZ, "_side");
      mq $$1 = new mq().a(mr.f, mq.a(cxa.gZ, "_top")).a(mr.i, $$0);
      mq $$2 = new mq().a(mr.f, mq.a(cxa.gZ, "_inverted_top")).a(mr.i, $$0);
      this.b
         .accept(
            mf.a(cxa.gZ)
               .a(mg.a(dkf.p).a(false, mi.a().a(mj.c, mp.aF.a(cxa.gZ, $$1, this.c))).a(true, mi.a().a(mj.c, mp.aF.a(mn.a(cxa.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(cwy $$0) {
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mn.a($$0))).a(this.n()));
   }

   private void J() {
      cwy $$0 = cxa.ss;
      ahh $$1 = mn.a($$0, "_on");
      ahh $$2 = mn.a($$0);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mn.a($$0))).a(this.n()).a(a(dkf.w, $$1, $$2)));
   }

   private void K() {
      mq $$0 = new mq().a(mr.B, mq.G(cxa.j)).a(mr.f, mq.G(cxa.cC));
      mq $$1 = new mq().a(mr.B, mq.G(cxa.j)).a(mr.f, mq.a(cxa.cC, "_moist"));
      ahh $$2 = mp.aW.a(cxa.cC, $$0, this.c);
      ahh $$3 = mp.aW.a(mq.a(cxa.cC, "_moist"), $$1, this.c);
      this.b.accept(mf.a(cxa.cC).a(a(dkf.aQ, 7, $$3, $$2)));
   }

   private List<ahh> A(cwy $$0) {
      ahh $$1 = mp.aX.a(mn.a($$0, "_floor0"), mq.v($$0), this.c);
      ahh $$2 = mp.aX.a(mn.a($$0, "_floor1"), mq.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ahh> B(cwy $$0) {
      ahh $$1 = mp.aY.a(mn.a($$0, "_side0"), mq.v($$0), this.c);
      ahh $$2 = mp.aY.a(mn.a($$0, "_side1"), mq.w($$0), this.c);
      ahh $$3 = mp.aZ.a(mn.a($$0, "_side_alt0"), mq.v($$0), this.c);
      ahh $$4 = mp.aZ.a(mn.a($$0, "_side_alt1"), mq.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ahh> C(cwy $$0) {
      ahh $$1 = mp.ba.a(mn.a($$0, "_up0"), mq.v($$0), this.c);
      ahh $$2 = mp.ba.a(mn.a($$0, "_up1"), mq.w($$0), this.c);
      ahh $$3 = mp.bb.a(mn.a($$0, "_up_alt0"), mq.v($$0), this.c);
      ahh $$4 = mp.bb.a(mn.a($$0, "_up_alt1"), mq.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<mi> a(List<ahh> $$0, UnaryOperator<mi> $$1) {
      return $$0.stream().map($$0x -> mi.a().a(mj.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      md $$0 = md.a().a(dkf.L, false).a(dkf.M, false).a(dkf.N, false).a(dkf.O, false).a(dkf.J, false);
      List<ahh> $$1 = this.A(cxa.cr);
      List<ahh> $$2 = this.B(cxa.cr);
      List<ahh> $$3 = this.C(cxa.cr);
      this.b
         .accept(
            me.a(cxa.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(md.b(md.a().a(dkf.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(md.b(md.a().a(dkf.M, true), $$0), a($$2, $$0x -> $$0x.a(mj.b, mj.a.b)))
               .a(md.b(md.a().a(dkf.N, true), $$0), a($$2, $$0x -> $$0x.a(mj.b, mj.a.c)))
               .a(md.b(md.a().a(dkf.O, true), $$0), a($$2, $$0x -> $$0x.a(mj.b, mj.a.d)))
               .a(md.a().a(dkf.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ahh> $$0 = this.A(cxa.cs);
      List<ahh> $$1 = this.B(cxa.cs);
      this.b
         .accept(
            me.a(cxa.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mj.b, mj.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mj.b, mj.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mj.b, mj.a.d)))
         );
   }

   private void D(cwy $$0) {
      ahh $$1 = ms.t.create($$0, this.c);
      ahh $$2 = ms.u.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(mf.a($$0).a(a(dkf.j, $$2, $$1)));
   }

   private void N() {
      mq $$0 = mq.a(mq.a(cxa.ad, "_side"), mq.a(cxa.ad, "_top"));
      ahh $$1 = mp.j.a(cxa.ad, $$0, this.c);
      this.b.accept(d(cxa.ad, $$1));
   }

   private void O() {
      this.a(cnj.ad);
      cwy $$0 = cxa.E;
      mg.b<Boolean, Integer> $$1 = mg.a(dbs.d, dbs.b);
      ahh $$2 = mn.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ahh $$4 = mn.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, mi.a().a(mj.c, $$4));
         $$1.a(false, $$3, mi.a().a(mj.c, $$2));
      }

      this.b.accept(mf.a(cxa.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mf.a(cxa.kI)
               .a(
                  mg.a(dkf.as)
                     .a(0, mi.a().a(mj.c, this.a(cxa.kI, "_0", mp.c, mq::b)))
                     .a(1, mi.a().a(mj.c, this.a(cxa.kI, "_1", mp.c, mq::b)))
                     .a(2, mi.a().a(mj.c, this.a(cxa.kI, "_2", mp.c, mq::b)))
                     .a(3, mi.a().a(mj.c, this.a(cxa.kI, "_3", mp.c, mq::b)))
               )
         );
   }

   private void Q() {
      ahh $$0 = mq.G(cxa.j);
      mq $$1 = new mq().a(mr.e, $$0).b(mr.e, mr.c).a(mr.f, mq.a(cxa.i, "_top")).a(mr.i, mq.a(cxa.i, "_snow"));
      mi $$2 = mi.a().a(mj.c, mp.n.a(cxa.i, "_snow", $$1, this.c));
      this.a(cxa.i, mn.a(cxa.i), $$2);
      ahh $$3 = ms.f.get(cxa.fl).a($$1x -> $$1x.a(mr.e, $$0)).a(cxa.fl, this.c);
      this.a(cxa.fl, $$3, $$2);
      ahh $$4 = ms.f.get(cxa.l).a($$1x -> $$1x.a(mr.e, $$0)).a(cxa.l, this.c);
      this.a(cxa.l, $$4, $$2);
   }

   private void a(cwy $$0, ahh $$1, mi $$2) {
      List<mi> $$3 = Arrays.asList(a($$1));
      this.b.accept(mf.a($$0).a(mg.a(dkf.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cnj.rg);
      this.b
         .accept(
            mf.a(cxa.fC)
               .a(
                  mg.a(dkf.ar)
                     .a(0, mi.a().a(mj.c, mn.a(cxa.fC, "_stage0")))
                     .a(1, mi.a().a(mj.c, mn.a(cxa.fC, "_stage1")))
                     .a(2, mi.a().a(mj.c, mn.a(cxa.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cxa.kE, mn.a(cxa.kE)));
   }

   private void j(cwy $$0, cwy $$1) {
      mq $$2 = mq.b($$1);
      ahh $$3 = mp.Y.a($$0, $$2, this.c);
      ahh $$4 = mp.Z.a($$0, $$2, this.c);
      this.b.accept(mf.a($$0).a(a(dkf.aT, 1, $$4, $$3)));
   }

   private void T() {
      ahh $$0 = mn.a(cxa.hc);
      ahh $$1 = mn.a(cxa.hc, "_side");
      this.a(cnj.lQ);
      this.b
         .accept(
            mf.a(cxa.hc)
               .a(
                  mg.a(dkf.Q)
                     .a(ic.a, mi.a().a(mj.c, $$0))
                     .a(ic.c, mi.a().a(mj.c, $$1))
                     .a(ic.f, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
                     .a(ic.d, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
                     .a(ic.e, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
               )
         );
   }

   private void k(cwy $$0, cwy $$1) {
      ahh $$2 = mn.a($$0);
      this.b.accept(mf.a($$1, mi.a().a(mj.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ahh $$0 = mn.a(cxa.eW, "_post_ends");
      ahh $$1 = mn.a(cxa.eW, "_post");
      ahh $$2 = mn.a(cxa.eW, "_cap");
      ahh $$3 = mn.a(cxa.eW, "_cap_alt");
      ahh $$4 = mn.a(cxa.eW, "_side");
      ahh $$5 = mn.a(cxa.eW, "_side_alt");
      this.b
         .accept(
            me.a(cxa.eW)
               .a(mi.a().a(mj.c, $$0))
               .a(md.a().a(dkf.L, false).a(dkf.M, false).a(dkf.N, false).a(dkf.O, false), mi.a().a(mj.c, $$1))
               .a(md.a().a(dkf.L, true).a(dkf.M, false).a(dkf.N, false).a(dkf.O, false), mi.a().a(mj.c, $$2))
               .a(md.a().a(dkf.L, false).a(dkf.M, true).a(dkf.N, false).a(dkf.O, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.L, false).a(dkf.M, false).a(dkf.N, true).a(dkf.O, false), mi.a().a(mj.c, $$3))
               .a(md.a().a(dkf.L, false).a(dkf.M, false).a(dkf.N, false).a(dkf.O, true), mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.L, true), mi.a().a(mj.c, $$4))
               .a(md.a().a(dkf.M, true), mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
               .a(md.a().a(dkf.N, true), mi.a().a(mj.c, $$5))
               .a(md.a().a(dkf.O, true), mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
         );
      this.d(cxa.eW);
   }

   private void E(cwy $$0) {
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mn.a($$0))).a(b()));
   }

   private void V() {
      ahh $$0 = mn.a(cxa.dw);
      ahh $$1 = mn.a(cxa.dw, "_on");
      this.d(cxa.dw);
      this.b
         .accept(
            mf.a(cxa.dw)
               .a(a(dkf.w, $$0, $$1))
               .a(
                  mg.a(dkf.U, dkf.R)
                     .a(dka.c, ic.c, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.c))
                     .a(dka.c, ic.f, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.d))
                     .a(dka.c, ic.d, mi.a().a(mj.a, mj.a.c))
                     .a(dka.c, ic.e, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.b))
                     .a(dka.a, ic.c, mi.a())
                     .a(dka.a, ic.f, mi.a().a(mj.b, mj.a.b))
                     .a(dka.a, ic.d, mi.a().a(mj.b, mj.a.c))
                     .a(dka.a, ic.e, mi.a().a(mj.b, mj.a.d))
                     .a(dka.b, ic.c, mi.a().a(mj.a, mj.a.b))
                     .a(dka.b, ic.f, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b))
                     .a(dka.b, ic.d, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.c))
                     .a(dka.b, ic.e, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.d))
               )
         );
   }

   private void W() {
      this.d(cxa.fm);
      this.b.accept(b(cxa.fm, mn.a(cxa.fm)));
   }

   private void X() {
      this.d(cxa.tn);
      this.b.accept(c(cxa.tn, mn.a(cxa.tn)));
   }

   private void Y() {
      this.b.accept(mf.a(cxa.ed).a(mg.a(dkf.H).a(ic.a.a, mi.a().a(mj.c, mn.a(cxa.ed, "_ns"))).a(ic.a.c, mi.a().a(mj.c, mn.a(cxa.ed, "_ew")))));
   }

   private void Z() {
      ahh $$0 = ms.a.create(cxa.dV, this.c);
      this.b
         .accept(
            mf.a(
               cxa.dV,
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
      ahh $$0 = mn.a(cxa.kO);
      ahh $$1 = mn.a(cxa.kO, "_on");
      this.b.accept(mf.a(cxa.kO).a(a(dkf.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mq $$0 = new mq().a(mr.e, mq.a(cxa.by, "_bottom")).a(mr.i, mq.a(cxa.by, "_side"));
      ahh $$1 = mq.a(cxa.by, "_top_sticky");
      ahh $$2 = mq.a(cxa.by, "_top");
      mq $$3 = $$0.c(mr.E, $$1);
      mq $$4 = $$0.c(mr.E, $$2);
      ahh $$5 = mn.a(cxa.by, "_base");
      this.a(cxa.by, $$5, $$4);
      this.a(cxa.br, $$5, $$3);
      ahh $$6 = mp.n.a(cxa.by, "_inventory", $$0.c(mr.f, $$2), this.c);
      ahh $$7 = mp.n.a(cxa.br, "_inventory", $$0.c(mr.f, $$1), this.c);
      this.a(cxa.by, $$6);
      this.a(cxa.br, $$7);
   }

   private void a(cwy $$0, ahh $$1, mq $$2) {
      ahh $$3 = mp.bh.a($$0, $$2, this.c);
      this.b.accept(mf.a($$0).a(a(dkf.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mq $$0 = new mq().a(mr.F, mq.a(cxa.by, "_top")).a(mr.i, mq.a(cxa.by, "_side"));
      mq $$1 = $$0.c(mr.E, mq.a(cxa.by, "_top_sticky"));
      mq $$2 = $$0.c(mr.E, mq.a(cxa.by, "_top"));
      this.b
         .accept(
            mf.a(cxa.bz)
               .a(
                  mg.a(dkf.x, dkf.bg)
                     .a(false, dkr.a, mi.a().a(mj.c, mp.bi.a(cxa.by, "_head", $$2, this.c)))
                     .a(false, dkr.b, mi.a().a(mj.c, mp.bi.a(cxa.by, "_head_sticky", $$1, this.c)))
                     .a(true, dkr.a, mi.a().a(mj.c, mp.bj.a(cxa.by, "_head_short", $$2, this.c)))
                     .a(true, dkr.b, mi.a().a(mj.c, mp.bj.a(cxa.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      cwy $$0 = cxa.tr;
      mq $$1 = mq.a($$0, "_side_inactive", "_top_inactive");
      mq $$2 = mq.a($$0, "_side_active", "_top_active");
      mq $$3 = mq.a($$0, "_side_active", "_top_ejecting_reward");
      ahh $$4 = mp.o.a($$0, $$1, this.c);
      ahh $$5 = mp.o.a($$0, "_active", $$2, this.c);
      ahh $$6 = mp.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(mf.a($$0).a(mg.a(dkf.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> mi.a().a(mj.c, $$4);
            case b, c, d -> mi.a().a(mj.c, $$5);
            case e -> mi.a().a(mj.c, $$6);
         };
      })));
   }

   private void ae() {
      ahh $$0 = mn.a(cxa.qQ, "_inactive");
      ahh $$1 = mn.a(cxa.qQ, "_active");
      this.a(cxa.qQ, $$0);
      this.b.accept(mf.a(cxa.qQ).a(mg.a(dkf.bo).a($$2 -> mi.a().a(mj.c, $$2 != dkw.b && $$2 != dkw.c ? $$0 : $$1))));
   }

   private void af() {
      ahh $$0 = mn.a(cxa.qR, "_inactive");
      ahh $$1 = mn.a(cxa.qR, "_active");
      this.a(cxa.qR, $$0);
      this.b.accept(mf.a(cxa.qR).a(mg.a(dkf.bo).a($$2 -> mi.a().a(mj.c, $$2 != dkw.b && $$2 != dkw.c ? $$0 : $$1))).a(b()));
   }

   private void ag() {
      ahh $$0 = mp.bM.a(cxa.qV, mq.a(false), this.c);
      ahh $$1 = mp.bM.a(cxa.qV, "_can_summon", mq.a(true), this.c);
      this.a(cxa.qV, $$0);
      this.b.accept(mf.a(cxa.qV).a(a(dkf.G, $$1, $$0)));
   }

   private void ah() {
      ahh $$0 = mn.a(cxa.nS, "_stable");
      ahh $$1 = mn.a(cxa.nS, "_unstable");
      this.a(cxa.nS, $$0);
      this.b.accept(mf.a(cxa.nS).a(a(dkf.b, $$1, $$0)));
   }

   private void ai() {
      ahh $$0 = this.a(cxa.sv, "", mp.ao, mq::c);
      ahh $$1 = this.a(cxa.sv, "_lit", mp.ao, mq::c);
      this.b.accept(mf.a(cxa.sv).a(a(dkf.D, $$1, $$0)));
      ahh $$2 = this.a(cxa.sw, "", mp.ao, mq::c);
      ahh $$3 = this.a(cxa.sw, "_lit", mp.ao, mq::c);
      this.b.accept(mf.a(cxa.sw).a(a(dkf.D, $$3, $$2)));
   }

   private void aj() {
      ahh $$0 = ms.a.create(cxa.fB, this.c);
      ahh $$1 = this.a(cxa.fB, "_on", mp.c, mq::b);
      this.b.accept(mf.a(cxa.fB).a(a(dkf.r, $$1, $$0)));
   }

   private void l(cwy $$0, cwy $$1) {
      mq $$2 = mq.y($$0);
      this.b.accept(c($$0, mp.bf.a($$0, $$2, this.c)));
      this.b.accept(mf.a($$1, mi.a().a(mj.c, mp.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ak() {
      mq $$0 = mq.y(cxa.dK);
      mq $$1 = mq.i(mq.a(cxa.dK, "_off"));
      ahh $$2 = mp.bf.a(cxa.dK, $$0, this.c);
      ahh $$3 = mp.bf.a(cxa.dK, "_off", $$1, this.c);
      this.b.accept(mf.a(cxa.dK).a(a(dkf.r, $$2, $$3)));
      ahh $$4 = mp.bg.a(cxa.dL, $$0, this.c);
      ahh $$5 = mp.bg.a(cxa.dL, "_off", $$1, this.c);
      this.b.accept(mf.a(cxa.dL).a(a(dkf.r, $$4, $$5)).a(d()));
      this.d(cxa.dK);
      this.c(cxa.dL);
   }

   private void al() {
      this.a(cnj.lJ);
      this.b.accept(mf.a(cxa.eh).a(mg.a(dkf.aA, dkf.s, dkf.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return mi.a().a(mj.c, mq.a(cxa.eh, $$3.toString()));
      })).a(c()));
   }

   private void am() {
      this.a(cnj.cS);
      this.b
         .accept(
            mf.a(cxa.mV)
               .a(
                  mg.a(dkf.aS, dkf.C)
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
      mq $$0 = mq.a(cxa.dN);
      ahh $$1 = mp.c.a(cxa.dP, $$0, this.c);
      this.b.accept(mf.a(cxa.dN).a(mg.a(dkf.aF).a($$1x -> mi.a().a(mj.c, $$1x < 8 ? mn.a(cxa.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cxa.dN, mn.a(cxa.dN, "_height2"));
      this.b.accept(c(cxa.dP, $$1));
   }

   private void ao() {
      this.b.accept(mf.a(cxa.oc, mi.a().a(mj.c, mn.a(cxa.oc))).a(b()));
   }

   private void ap() {
      ahh $$0 = ms.a.create(cxa.pa, this.c);
      this.a(cxa.pa, $$0);
      this.b.accept(mf.a(cxa.pa).a(mg.a(dkf.bj).a($$0x -> mi.a().a(mj.c, this.a(cxa.pa, "_" + $$0x.c(), mp.c, mq::b)))));
   }

   private void aq() {
      this.a(cnj.wl);
      this.b.accept(mf.a(cxa.oi).a(mg.a(dkf.as).a($$0 -> mi.a().a(mj.c, this.a(cxa.oi, "_stage" + $$0, mp.ao, mq::c)))));
   }

   private void ar() {
      this.a(cnj.pr);
      this.b
         .accept(
            mf.a(cxa.fI)
               .a(
                  mg.a(dkf.a, dkf.M, dkf.L, dkf.N, dkf.O)
                     .a(false, false, false, false, false, mi.a().a(mj.c, mn.a(cxa.fI, "_ns")))
                     .a(false, true, false, false, false, mi.a().a(mj.c, mn.a(cxa.fI, "_n")).a(mj.b, mj.a.b))
                     .a(false, false, true, false, false, mi.a().a(mj.c, mn.a(cxa.fI, "_n")))
                     .a(false, false, false, true, false, mi.a().a(mj.c, mn.a(cxa.fI, "_n")).a(mj.b, mj.a.c))
                     .a(false, false, false, false, true, mi.a().a(mj.c, mn.a(cxa.fI, "_n")).a(mj.b, mj.a.d))
                     .a(false, true, true, false, false, mi.a().a(mj.c, mn.a(cxa.fI, "_ne")))
                     .a(false, true, false, true, false, mi.a().a(mj.c, mn.a(cxa.fI, "_ne")).a(mj.b, mj.a.b))
                     .a(false, false, false, true, true, mi.a().a(mj.c, mn.a(cxa.fI, "_ne")).a(mj.b, mj.a.c))
                     .a(false, false, true, false, true, mi.a().a(mj.c, mn.a(cxa.fI, "_ne")).a(mj.b, mj.a.d))
                     .a(false, false, true, true, false, mi.a().a(mj.c, mn.a(cxa.fI, "_ns")))
                     .a(false, true, false, false, true, mi.a().a(mj.c, mn.a(cxa.fI, "_ns")).a(mj.b, mj.a.b))
                     .a(false, true, true, true, false, mi.a().a(mj.c, mn.a(cxa.fI, "_nse")))
                     .a(false, true, false, true, true, mi.a().a(mj.c, mn.a(cxa.fI, "_nse")).a(mj.b, mj.a.b))
                     .a(false, false, true, true, true, mi.a().a(mj.c, mn.a(cxa.fI, "_nse")).a(mj.b, mj.a.c))
                     .a(false, true, true, false, true, mi.a().a(mj.c, mn.a(cxa.fI, "_nse")).a(mj.b, mj.a.d))
                     .a(false, true, true, true, true, mi.a().a(mj.c, mn.a(cxa.fI, "_nsew")))
                     .a(true, false, false, false, false, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_ns")))
                     .a(true, false, true, false, false, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_n")))
                     .a(true, false, false, true, false, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_n")).a(mj.b, mj.a.c))
                     .a(true, true, false, false, false, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_n")).a(mj.b, mj.a.b))
                     .a(true, false, false, false, true, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_n")).a(mj.b, mj.a.d))
                     .a(true, true, true, false, false, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_ne")))
                     .a(true, true, false, true, false, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_ne")).a(mj.b, mj.a.b))
                     .a(true, false, false, true, true, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_ne")).a(mj.b, mj.a.c))
                     .a(true, false, true, false, true, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_ne")).a(mj.b, mj.a.d))
                     .a(true, false, true, true, false, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_ns")))
                     .a(true, true, false, false, true, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_ns")).a(mj.b, mj.a.b))
                     .a(true, true, true, true, false, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_nse")))
                     .a(true, true, false, true, true, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_nse")).a(mj.b, mj.a.b))
                     .a(true, false, true, true, true, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_nse")).a(mj.b, mj.a.c))
                     .a(true, true, true, false, true, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_nse")).a(mj.b, mj.a.d))
                     .a(true, true, true, true, true, mi.a().a(mj.c, mn.a(cxa.fI, "_attached_nsew")))
               )
         );
   }

   private void as() {
      this.d(cxa.fH);
      this.b.accept(mf.a(cxa.fH).a(mg.a(dkf.a, dkf.w).a(($$0, $$1) -> mi.a().a(mj.c, mq.a(cxa.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ahh a(int $$0, String $$1, mq $$2) {
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

   private ahh a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mq.b(mq.G(cxa.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mq.b(mq.a(cxa.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mq.b(mq.a(cxa.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void at() {
      this.a(cnj.ko);
      this.b.accept(mf.a(cxa.mf).a(mg.a(dkf.aD, dkf.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void au() {
      this.a(cnj.kp);
      Function<Integer, ahh> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mq $$2 = mq.a($$1);
         return mp.bw.a(cxa.mg, $$1, $$2, this.c);
      };
      this.b.accept(mf.a(cxa.mg).a(mg.a(def.c).a($$1 -> mi.a().a(mj.c, $$0.apply($$1)))));
   }

   private void F(cwy $$0) {
      this.d($$0);
      ahh $$1 = mn.a($$0);
      me $$2 = me.a($$0);
      md.c $$3 = ac.a(md.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dkg, Function<ahh, mi>> $$4 : a) {
         dkg $$5 = (dkg)$$4.getFirst();
         Function<ahh, mi> $$6 = (Function<ahh, mi>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(md.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void av() {
      ahh $$0 = mq.a(cxa.qU, "_bottom");
      mq $$1 = new mq().a(mr.e, $$0).a(mr.f, mq.a(cxa.qU, "_top")).a(mr.i, mq.a(cxa.qU, "_side"));
      mq $$2 = new mq().a(mr.e, $$0).a(mr.f, mq.a(cxa.qU, "_top_bloom")).a(mr.i, mq.a(cxa.qU, "_side_bloom"));
      ahh $$3 = mp.n.a(cxa.qU, "", $$1, this.c);
      ahh $$4 = mp.n.a(cxa.qU, "_bloom", $$2, this.c);
      this.b.accept(mf.a(cxa.qU).a(mg.a(dkf.E).a($$2x -> mi.a().a(mj.c, $$2x ? $$4 : $$3))));
      this.a(cnj.gi, $$3);
   }

   private void aw() {
      cwy $$0 = cxa.cm;
      ahh $$1 = mn.a($$0);
      me $$2 = me.a($$0);
      Map.of(ic.c, mj.a.a, ic.f, mj.a.b, ic.d, mj.a.c, ic.e, mj.a.d).forEach(($$2x, $$3) -> {
         md.c $$4 = md.a().a(dkf.R, $$2x);
         $$2.a($$4, mi.a().a(mj.c, $$1).a(mj.b, $$3).a(mj.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mn.a($$0, "_inventory"));
      i.clear();
   }

   private void a(me $$0, md.c $$1, mj.a $$2) {
      List.of(Pair.of(dkf.bp, mp.aM), Pair.of(dkf.bq, mp.aN), Pair.of(dkf.br, mp.aO), Pair.of(dkf.bs, mp.aP), Pair.of(dkf.bt, mp.aQ), Pair.of(dkf.bu, mp.aR))
         .forEach($$3 -> {
            dkg $$4 = (dkg)$$3.getFirst();
            mo $$5 = (mo)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(me $$0, md.c $$1, mj.a $$2, dkg $$3, mo $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mq $$7 = new mq().a(mr.b, mq.a(cxa.cm, $$6));
      lz.d $$8 = new lz.d($$4, $$6);
      ahh $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cxa.cm, $$6, $$7, this.c));
      $$0.a(md.a($$1, md.a().a($$3, $$5)), mi.a().a(mj.c, $$9).a(mj.b, $$2));
   }

   private void ax() {
      this.b.accept(c(cxa.kJ, mp.c.a(cxa.kJ, mq.b(mn.a("magma")), this.c)));
   }

   private void G(cwy $$0) {
      this.b($$0, ms.q);
      mp.bD.a(mn.a($$0.j()), mq.u($$0), this.c);
   }

   private void b(cwy $$0, cwy $$1, lz.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(cwy $$0, cwy $$1) {
      mp.bE.a(mn.a($$0.j()), mq.u($$1), this.c);
   }

   private void ay() {
      ahh $$0 = mn.a(cxa.b);
      ahh $$1 = mn.a(cxa.b, "_mirrored");
      this.b.accept(a(cxa.eN, $$0, $$1));
      this.a(cxa.eN, $$0);
   }

   private void az() {
      ahh $$0 = mn.a(cxa.sJ);
      ahh $$1 = mn.a(cxa.sJ, "_mirrored");
      this.b.accept(a(cxa.td, $$0, $$1).a(f()));
      this.a(cxa.td, $$0);
   }

   private void n(cwy $$0, cwy $$1) {
      this.a($$0, lz.e.b);
      mq $$2 = mq.d(mq.a($$0, "_pot"));
      ahh $$3 = lz.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aA() {
      ahh $$0 = mq.a(cxa.pl, "_bottom");
      ahh $$1 = mq.a(cxa.pl, "_top_off");
      ahh $$2 = mq.a(cxa.pl, "_top");
      ahh[] $$3 = new ahh[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mq $$5 = new mq().a(mr.e, $$0).a(mr.f, $$4 == 0 ? $$1 : $$2).a(mr.i, mq.a(cxa.pl, "_side" + $$4));
         $$3[$$4] = mp.n.a(cxa.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mf.a(cxa.pl).a(mg.a(dkf.aZ).a($$1x -> mi.a().a(mj.c, $$3[$$1x]))));
      this.a(cnj.wJ, $$3[0]);
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
      ahh $$0 = mq.a(cxa.pb, "_top");
      ahh $$1 = mq.a(cxa.pb, "_bottom");
      ahh $$2 = mq.a(cxa.pb, "_side");
      ahh $$3 = mq.a(cxa.pb, "_lock");
      mq $$4 = new mq().a(mr.o, $$2).a(mr.m, $$2).a(mr.l, $$2).a(mr.c, $$0).a(mr.j, $$0).a(mr.k, $$1).a(mr.n, $$3);
      ahh $$5 = mp.b.a(cxa.pb, $$4, this.c);
      this.b.accept(mf.a(cxa.pb, mi.a().a(mj.c, $$5)).a(mg.a(dkf.T).a($$0x -> this.a($$0x, mi.a()))));
   }

   private void aC() {
      cwy $$0 = cxa.n;
      ahh $$1 = mn.a($$0);
      ms $$2 = ms.a.get($$0);
      cwy $$3 = cxa.jH;
      ahh $$4 = mp.ab.a($$3, $$2.b(), this.c);
      ahh $$5 = mp.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kg.a().filter(kh::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cxa.rf).a(kg.w).a(cxa.rf, cxa.rD).a(cxa.rj, cxa.rn).a(kg.y);
      this.h(cxa.re).a(kg.A).a(cxa.re, cxa.rC).a(cxa.ri, cxa.rm).a(kg.C);
      this.h(cxa.rd).a(kg.E).a(cxa.rd, cxa.rB).a(cxa.rh, cxa.rl).a(kg.G);
      this.h(cxa.rc).a(kg.I).a(cxa.rc, cxa.rA).a(cxa.rg, cxa.rk).a(kg.K);
      this.w(cxa.sk);
      this.w(cxa.sl);
      this.w(cxa.sm);
      this.w(cxa.sn);
      this.i(cxa.sk, cxa.so);
      this.i(cxa.sl, cxa.sp);
      this.i(cxa.sm, cxa.sq);
      this.i(cxa.sn, cxa.sr);
      this.m(cxa.a);
      this.c(cxa.nc, cxa.a);
      this.c(cxa.nb, cxa.a);
      this.m(cxa.fO);
      this.m(cxa.dQ);
      this.c(cxa.nd, cxa.G);
      this.m(cxa.fA);
      this.m(cxa.me);
      this.m(cxa.fr);
      this.m(cxa.fR);
      this.a(cnj.ua);
      this.m(cxa.pg);
      this.m(cxa.G);
      this.m(cxa.H);
      this.m(cxa.hV);
      this.a(cnj.fR);
      this.o(cxa.pM, cxa.qd);
      this.o(cxa.pN, cxa.qe);
      this.o(cxa.pO, cxa.qf);
      this.o(cxa.pP, cxa.qg);
      this.o(cxa.pQ, cxa.qh);
      this.o(cxa.pR, cxa.qi);
      this.o(cxa.pS, cxa.qj);
      this.o(cxa.pT, cxa.qk);
      this.o(cxa.pU, cxa.ql);
      this.o(cxa.pV, cxa.qm);
      this.o(cxa.pW, cxa.qn);
      this.o(cxa.pX, cxa.qo);
      this.o(cxa.pY, cxa.qp);
      this.o(cxa.pZ, cxa.qq);
      this.o(cxa.qa, cxa.qr);
      this.o(cxa.qb, cxa.qs);
      this.o(cxa.pL, cxa.qc);
      this.m(cxa.na);
      this.m(cxa.gs);
      this.m(cxa.qP);
      this.m(cxa.sx);
      this.s(cxa.sy);
      this.s(cxa.sz);
      this.t(cxa.ti);
      this.t(cxa.tj);
      this.ai();
      this.g(cxa.sC, cxa.sA);
      this.p(cxa.sB);
      this.a(cxa.hW, cnj.hA);
      this.a(cnj.hA);
      this.aD();
      this.a(cxa.kN, cnj.ja);
      this.a(cnj.ja);
      this.f(cxa.bQ, mq.a(cxa.by, "_side"));
      this.a(cxa.R);
      this.a(cxa.S);
      this.a(cxa.iB);
      this.a(cxa.cx);
      this.a(cxa.cy);
      this.a(cxa.cz);
      this.a(cxa.fE);
      this.a(cxa.fF);
      this.a(cxa.fJ);
      this.a(cxa.N);
      this.a(cxa.T);
      this.a(cxa.O);
      this.a(cxa.ch);
      this.a(cxa.P);
      this.a(cxa.Q);
      this.a(cxa.ci);
      this.b(cxa.pj, ms.d);
      this.a(cxa.pi);
      this.a(cxa.aR);
      this.a(cxa.aS);
      this.a(cxa.aT);
      this.a(cxa.hb);
      this.a(cxa.dI);
      this.a(cxa.dJ);
      this.a(cxa.ha);
      this.a(cxa.pC);
      this.a(cxa.mW);
      this.a(cxa.dR);
      this.a(cxa.k);
      this.a(cxa.pk);
      this.a(cxa.fz);
      this.a(cxa.ec);
      this.a(cxa.L);
      this.a(cxa.ph);
      this.a(cxa.dO);
      this.b(cxa.dT, ms.g);
      this.b(cxa.pq, ms.d);
      this.b(cxa.fa, ms.d);
      this.m(cxa.ac);
      this.m(cxa.ga);
      this.a(cxa.kK);
      this.a(cxa.aY);
      this.a(cxa.iC);
      this.a(cxa.co);
      this.a(cxa.pK);
      this.a(cxa.ii);
      this.a(cxa.oy);
      this.a(cxa.dW);
      this.a(cxa.dX);
      this.b(cxa.ct, ms.b);
      this.a(cxa.aO);
      this.b(cxa.bw, ms.v);
      this.a(cnj.cR);
      this.b(cxa.ck, ms.f);
      this.b(cxa.pd, ms.d);
      this.a(cxa.op);
      this.a(cxa.aP);
      this.a(cxa.qt);
      this.a(cxa.qu);
      this.a(cxa.qN);
      this.a(cxa.su);
      this.a(cxa.tf);
      this.a(cxa.tg);
      this.a(cxa.th);
      this.e(cxa.qS);
      this.aC();
      this.a(cxa.ra);
      this.a(cxa.rb);
      this.a(cxa.qW);
      this.a(cxa.qX);
      this.a(cxa.qY);
      this.a(cxa.qZ);
      this.k(cxa.qW, cxa.rw);
      this.k(cxa.qX, cxa.ry);
      this.k(cxa.qY, cxa.rx);
      this.k(cxa.qZ, cxa.rz);
      this.i(cxa.rM);
      this.i(cxa.rN);
      this.i(cxa.rP);
      this.i(cxa.rO);
      this.a(cxa.rM, cxa.rQ);
      this.a(cxa.rN, cxa.rR);
      this.a(cxa.rP, cxa.rT);
      this.a(cxa.rO, cxa.rS);
      this.k(cxa.rU);
      this.k(cxa.rV);
      this.k(cxa.rX);
      this.k(cxa.rW);
      this.b(cxa.rU, cxa.rY);
      this.b(cxa.rV, cxa.rZ);
      this.b(cxa.rX, cxa.sb);
      this.b(cxa.rW, cxa.sa);
      this.a(cxa.sc);
      this.a(cxa.sd);
      this.a(cxa.se);
      this.a(cxa.sf);
      this.k(cxa.sc, cxa.sg);
      this.k(cxa.sd, cxa.sh);
      this.k(cxa.se, cxa.si);
      this.k(cxa.sf, cxa.sj);
      this.j(cxa.gW, cxa.ch);
      this.j(cxa.gX, cxa.ci);
      this.G();
      this.r();
      this.aw();
      this.v();
      this.w();
      this.a(cxa.og, cxa.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(cxa.kt);
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
      this.F(cxa.ff);
      this.F(cxa.fg);
      this.F(cxa.qT);
      this.ax();
      this.aB();
      this.ae();
      this.af();
      this.ag();
      this.X();
      this.O();
      this.N();
      this.ad();
      this.E(cxa.cO);
      this.d(cxa.cO);
      this.E(cxa.oa);
      this.g();
      this.E(cxa.sE);
      this.l(cxa.cp, cxa.cq);
      this.l(cxa.ea, cxa.eb);
      this.a(cxa.cA, cxa.n, mq::c);
      this.a(cxa.nY, cxa.p, mq::d);
      this.y(cxa.ow);
      this.y(cxa.on);
      this.v(cxa.aU);
      this.v(cxa.hi);
      this.C();
      this.D(cxa.oe);
      this.D(cxa.of);
      this.e(cxa.eX, mn.a(cxa.eX));
      this.a(cxa.dY, ms.d);
      this.a(cxa.dZ, ms.d);
      this.a(cxa.te);
      this.a(cxa.kM, ms.d);
      this.f(cxa.j);
      this.f(cxa.sH);
      this.f(cxa.I);
      this.g(cxa.J);
      this.g(cxa.M);
      this.f(cxa.K);
      this.e(cxa.F);
      this.b(cxa.to, ms.f);
      this.a(cxa.ij, ms.d, ms.e);
      this.a(cxa.kx, ms.w, ms.x);
      this.a(cxa.hf, ms.w, ms.x);
      this.a(cxa.tk, ms.d, ms.e);
      this.a(cxa.tl, ms.d, ms.e);
      this.a(cxa.tm, ms.d, ms.e);
      this.c(cxa.nT, ms.i);
      this.z();
      this.a(cxa.pe, mq::A);
      this.a(cxa.pf, mq::C);
      this.a(cxa.kD, dkf.as, 0, 1, 2, 3);
      this.a(cxa.gt, dkf.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cxa.fq, dkf.as, 0, 1, 1, 2);
      this.a(cxa.gu, dkf.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cxa.cB, dkf.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cxa.kA, lz.e.b, dkf.aq, 0, 1);
      this.i();
      this.h();
      this.a(mn.a("decorated_pot"), cxa.iA).b(cxa.tp);
      this.a(mn.a("banner"), cxa.n)
         .a(mp.bF, cxa.iJ, cxa.iK, cxa.iL, cxa.iM, cxa.iN, cxa.iO, cxa.iP, cxa.iQ, cxa.iR, cxa.iS, cxa.iT, cxa.iU, cxa.iV, cxa.iW, cxa.iX, cxa.iY)
         .b(cxa.iZ, cxa.ja, cxa.jb, cxa.jc, cxa.jd, cxa.je, cxa.jf, cxa.jg, cxa.jh, cxa.ji, cxa.jj, cxa.jk, cxa.jl, cxa.jm, cxa.jn, cxa.jo);
      this.a(mn.a("bed"), cxa.n)
         .b(cxa.aZ, cxa.ba, cxa.bb, cxa.bc, cxa.bd, cxa.be, cxa.bf, cxa.bg, cxa.bh, cxa.bi, cxa.bj, cxa.bk, cxa.bl, cxa.bm, cxa.bn, cxa.bo);
      this.m(cxa.aZ, cxa.bA);
      this.m(cxa.ba, cxa.bB);
      this.m(cxa.bb, cxa.bC);
      this.m(cxa.bc, cxa.bD);
      this.m(cxa.bd, cxa.bE);
      this.m(cxa.be, cxa.bF);
      this.m(cxa.bf, cxa.bG);
      this.m(cxa.bg, cxa.bH);
      this.m(cxa.bh, cxa.bI);
      this.m(cxa.bi, cxa.bJ);
      this.m(cxa.bj, cxa.bK);
      this.m(cxa.bk, cxa.bL);
      this.m(cxa.bl, cxa.bM);
      this.m(cxa.bm, cxa.bN);
      this.m(cxa.bn, cxa.bO);
      this.m(cxa.bo, cxa.bP);
      this.a(mn.a("skull"), cxa.dW)
         .a(mp.bG, cxa.gM, cxa.gK, cxa.gI, cxa.gE, cxa.gG, cxa.gQ)
         .a(cxa.gO)
         .b(cxa.gN, cxa.gP, cxa.gL, cxa.gJ, cxa.gF, cxa.gH, cxa.gR);
      this.G(cxa.kP);
      this.G(cxa.kQ);
      this.G(cxa.kR);
      this.G(cxa.kS);
      this.G(cxa.kT);
      this.G(cxa.kU);
      this.G(cxa.kV);
      this.G(cxa.kW);
      this.G(cxa.kX);
      this.G(cxa.kY);
      this.G(cxa.kZ);
      this.G(cxa.la);
      this.G(cxa.lb);
      this.G(cxa.lc);
      this.G(cxa.ld);
      this.G(cxa.le);
      this.G(cxa.lf);
      this.b(cxa.mX, ms.q);
      this.c(cxa.mX);
      this.a(mn.a("chest"), cxa.n).b(cxa.cv, cxa.gV);
      this.a(mn.a("ender_chest"), cxa.co).b(cxa.fG);
      this.f(cxa.fx, cxa.co).a(cxa.fx, cxa.kF);
      this.a(cxa.aM);
      this.a(cxa.aN);
      this.a(cxa.lw);
      this.a(cxa.lx);
      this.a(cxa.ly);
      this.a(cxa.lz);
      this.a(cxa.lA);
      this.a(cxa.lB);
      this.a(cxa.lC);
      this.a(cxa.lD);
      this.a(cxa.lE);
      this.a(cxa.lF);
      this.a(cxa.lG);
      this.a(cxa.lH);
      this.a(cxa.lI);
      this.a(cxa.lJ);
      this.a(cxa.lK);
      this.a(cxa.lL);
      this.a(ms.a, cxa.lM, cxa.lN, cxa.lO, cxa.lP, cxa.lQ, cxa.lR, cxa.lS, cxa.lT, cxa.lU, cxa.lV, cxa.lW, cxa.lX, cxa.lY, cxa.lZ, cxa.ma, cxa.mb);
      this.a(cxa.iA);
      this.a(cxa.hj);
      this.a(cxa.hk);
      this.a(cxa.hl);
      this.a(cxa.hm);
      this.a(cxa.hn);
      this.a(cxa.ho);
      this.a(cxa.hp);
      this.a(cxa.hq);
      this.a(cxa.hr);
      this.a(cxa.hs);
      this.a(cxa.ht);
      this.a(cxa.hu);
      this.a(cxa.hv);
      this.a(cxa.hw);
      this.a(cxa.hx);
      this.a(cxa.hy);
      this.a(cxa.qO);
      this.h(cxa.aQ, cxa.eY);
      this.h(cxa.ei, cxa.hz);
      this.h(cxa.ej, cxa.hA);
      this.h(cxa.ek, cxa.hB);
      this.h(cxa.el, cxa.hC);
      this.h(cxa.em, cxa.hD);
      this.h(cxa.en, cxa.hE);
      this.h(cxa.eo, cxa.hF);
      this.h(cxa.ep, cxa.hG);
      this.h(cxa.eq, cxa.hH);
      this.h(cxa.er, cxa.hI);
      this.h(cxa.es, cxa.hJ);
      this.h(cxa.et, cxa.hK);
      this.h(cxa.eu, cxa.hL);
      this.h(cxa.ev, cxa.hM);
      this.h(cxa.ew, cxa.hN);
      this.h(cxa.ex, cxa.hO);
      this.b(ms.o, cxa.lg, cxa.lh, cxa.li, cxa.lj, cxa.lk, cxa.ll, cxa.lm, cxa.ln, cxa.lo, cxa.lp, cxa.lq, cxa.lr, cxa.ls, cxa.lt, cxa.lu, cxa.lv);
      this.g(cxa.bA, cxa.ik);
      this.g(cxa.bB, cxa.il);
      this.g(cxa.bC, cxa.im);
      this.g(cxa.bD, cxa.in);
      this.g(cxa.bE, cxa.io);
      this.g(cxa.bF, cxa.ip);
      this.g(cxa.bG, cxa.iq);
      this.g(cxa.bH, cxa.ir);
      this.g(cxa.bI, cxa.is);
      this.g(cxa.bJ, cxa.it);
      this.g(cxa.bK, cxa.iu);
      this.g(cxa.bL, cxa.iv);
      this.g(cxa.bM, cxa.iw);
      this.g(cxa.bN, cxa.ix);
      this.g(cxa.bO, cxa.iy);
      this.g(cxa.bP, cxa.iz);
      this.a(cxa.sI);
      this.a(cxa.eL);
      this.a(cxa.bu, cxa.gb, lz.e.a);
      this.a(cxa.bR, cxa.gc, lz.e.b);
      this.a(cxa.bT, cxa.gd, lz.e.b);
      this.a(cxa.bU, cxa.ge, lz.e.b);
      this.a(cxa.bV, cxa.gf, lz.e.b);
      this.a(cxa.bW, cxa.gg, lz.e.b);
      this.a(cxa.bX, cxa.gh, lz.e.b);
      this.a(cxa.bY, cxa.gi, lz.e.b);
      this.a(cxa.bZ, cxa.gj, lz.e.b);
      this.a(cxa.ca, cxa.gk, lz.e.b);
      this.a(cxa.cb, cxa.gl, lz.e.b);
      this.a(cxa.cc, cxa.gm, lz.e.b);
      this.a(cxa.ce, cxa.gn, lz.e.b);
      this.a(cxa.cd, cxa.go, lz.e.b);
      this.a(cxa.cg, cxa.gp, lz.e.b);
      this.a(cxa.cf, cxa.gq, lz.e.b);
      this.a(cxa.bv, cxa.gr, lz.e.b);
      this.a(cxa.bS, cxa.fS, lz.e.b);
      this.H();
      this.u(cxa.eT);
      this.u(cxa.eU);
      this.u(cxa.eV);
      this.a(cxa.bt, lz.e.a);
      this.b(cxa.dS, lz.e.a);
      this.a(cnj.dI);
      this.b(cxa.mc, cxa.md, lz.e.b);
      this.a(cnj.dJ);
      this.c(cxa.md);
      this.b(cxa.sG, lz.e.b);
      this.c(cxa.sG);
      this.c(cxa.sw);
      this.b(cxa.oz, cxa.oA, lz.e.b);
      this.b(cxa.oB, cxa.oC, lz.e.b);
      this.a(cxa.oz, "_plant");
      this.c(cxa.oA);
      this.a(cxa.oB, "_plant");
      this.c(cxa.oC);
      this.a(cxa.mY, lz.e.a, mq.c(mq.a(cxa.mZ, "_stage0")));
      this.m();
      this.a(cxa.bs, lz.e.b);
      this.c(cxa.iE, lz.e.b);
      this.c(cxa.iF, lz.e.b);
      this.c(cxa.iG, lz.e.b);
      this.c(cxa.iH, lz.e.a);
      this.c(cxa.iI, lz.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cxa.mw, cxa.mr, cxa.mm, cxa.mh, cxa.mG, cxa.mB, cxa.mQ, cxa.mL);
      this.a(cxa.mx, cxa.ms, cxa.mn, cxa.mi, cxa.mH, cxa.mC, cxa.mR, cxa.mM);
      this.a(cxa.my, cxa.mt, cxa.mo, cxa.mj, cxa.mI, cxa.mD, cxa.mS, cxa.mN);
      this.a(cxa.mz, cxa.mu, cxa.mp, cxa.mk, cxa.mJ, cxa.mE, cxa.mT, cxa.mO);
      this.a(cxa.mA, cxa.mv, cxa.mq, cxa.ml, cxa.mK, cxa.mF, cxa.mU, cxa.mP);
      this.e(cxa.fe, cxa.fc);
      this.e(cxa.fd, cxa.fb);
      this.l(cxa.ab).c(cxa.ab).a(cxa.av);
      this.l(cxa.am).c(cxa.am).a(cxa.aD);
      this.a(cxa.am, cxa.dj, cxa.ds);
      this.b(cxa.aL, ms.s);
      this.l(cxa.Y).c(cxa.Y).a(cxa.as);
      this.l(cxa.ai).c(cxa.ai).a(cxa.aA);
      this.a(cxa.ai, cxa.dd, cxa.do);
      this.a(cxa.B, cxa.fX, lz.e.b);
      this.b(cxa.aI, ms.s);
      this.l(cxa.Z).d(cxa.Z).a(cxa.at);
      this.l(cxa.aj).d(cxa.aj).a(cxa.aB);
      this.a(cxa.aj, cxa.de, cxa.dp);
      this.a(cxa.C, cxa.fY, lz.e.b);
      this.b(cxa.aJ, ms.s);
      this.l(cxa.W).c(cxa.W).a(cxa.aq);
      this.l(cxa.ag).c(cxa.ag).a(cxa.ay);
      this.a(cxa.ag, cxa.dc, cxa.dn);
      this.a(cxa.z, cxa.fV, lz.e.b);
      this.b(cxa.aG, ms.s);
      this.l(cxa.U).c(cxa.U).a(cxa.ao);
      this.l(cxa.al).c(cxa.al).a(cxa.aw);
      this.a(cxa.al, cxa.da, cxa.dl);
      this.a(cxa.x, cxa.fT, lz.e.b);
      this.b(cxa.aE, ms.s);
      this.l(cxa.V).c(cxa.V).a(cxa.ap);
      this.l(cxa.af).c(cxa.af).a(cxa.ax);
      this.a(cxa.af, cxa.db, cxa.dm);
      this.a(cxa.y, cxa.fU, lz.e.b);
      this.b(cxa.aF, ms.s);
      this.l(cxa.aa).c(cxa.aa).a(cxa.au);
      this.l(cxa.ak).c(cxa.ak).a(cxa.aC);
      this.a(cxa.ak, cxa.dg, cxa.dr);
      this.a(cxa.D, cxa.fZ, lz.e.b);
      this.b(cxa.aK, ms.s);
      this.l(cxa.X).c(cxa.X).a(cxa.ar);
      this.l(cxa.ah).c(cxa.ah).a(cxa.az);
      this.a(cxa.ah, cxa.df, cxa.dq);
      this.a(cxa.A, cxa.fW, lz.e.b);
      this.b(cxa.aH, ms.s);
      this.l(cxa.os).b(cxa.os).a(cxa.ou);
      this.l(cxa.ot).b(cxa.ot).a(cxa.ov);
      this.a(cxa.ot, cxa.dh, cxa.dt);
      this.a(cxa.ox, cxa.pm, lz.e.b);
      this.n(cxa.oD, cxa.po);
      this.l(cxa.oj).b(cxa.oj).a(cxa.ol);
      this.l(cxa.ok).b(cxa.ok).a(cxa.om);
      this.a(cxa.ok, cxa.di, cxa.du);
      this.a(cxa.oo, cxa.pn, lz.e.b);
      this.n(cxa.oq, cxa.pp);
      this.l(cxa.ae).d(cxa.ae);
      this.l(cxa.an).d(cxa.an);
      this.a(cxa.v, cxa.dk, cxa.dv);
      this.b(cxa.or, lz.e.b);
      this.a(cnj.dF);
      this.i(cxa.dy);
      this.k(cxa.hY);
      this.u();
      this.n(cxa.cP);
      this.o(cxa.bp);
      this.o(cxa.bq);
      this.o(cxa.hh);
      this.t();
      this.q(cxa.fN);
      this.q(cxa.kG);
      this.q(cxa.kH);
      this.r(cxa.gS);
      this.r(cxa.gT);
      this.r(cxa.gU);
      this.o();
      this.p();
      this.d(cxa.cD, ms.h);
      this.d(cxa.nW, ms.h);
      this.d(cxa.nV, ms.i);
      this.s();
      this.aA();
      this.av();
      this.k(cxa.eK, cxa.eS);
      this.k(cxa.m, cxa.eO);
      this.k(cxa.eJ, cxa.eR);
      this.k(cxa.eI, cxa.eQ);
      this.ay();
      this.k(cxa.eH, cxa.eP);
      this.az();
      col.h().forEach($$0 -> this.a($$0, mn.b("template_spawn_egg")));
   }

   private void aD() {
      this.c(cxa.hX);
      mg.a<Integer> $$0 = mg.a(dkf.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ahh $$3 = mq.a(cnj.hB, $$2);
         $$0.a($$1, mi.a().a(mj.c, mp.aa.a(cxa.hX, $$2, mq.h($$3), this.c)));
         mp.bx.a(mn.a(cnj.hB, $$2), mq.k($$3), this.c);
      }

      this.b.accept(mf.a(cxa.hX).a($$0));
   }

   private void o(cwy $$0, cwy $$1) {
      this.a($$0.j());
      mq $$2 = mq.b(mq.G($$0));
      mq $$3 = mq.b(mq.a($$0, "_lit"));
      ahh $$4 = mp.bH.a($$0, "_one_candle", $$2, this.c);
      ahh $$5 = mp.bI.a($$0, "_two_candles", $$2, this.c);
      ahh $$6 = mp.bJ.a($$0, "_three_candles", $$2, this.c);
      ahh $$7 = mp.bK.a($$0, "_four_candles", $$2, this.c);
      ahh $$8 = mp.bH.a($$0, "_one_candle_lit", $$3, this.c);
      ahh $$9 = mp.bI.a($$0, "_two_candles_lit", $$3, this.c);
      ahh $$10 = mp.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      ahh $$11 = mp.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            mf.a($$0)
               .a(
                  mg.a(dkf.az, dkf.r)
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
      ahh $$12 = mp.bL.a($$1, mq.a($$0, false), this.c);
      ahh $$13 = mp.bL.a($$1, "_lit", mq.a($$0, true), this.c);
      this.b.accept(mf.a($$1).a(a(dkf.r, $$13, $$12)));
   }

   class a {
      private final ahh b;

      public a(ahh $$0, cwy $$1) {
         this.b = mp.aa.a($$0, mq.u($$1), lz.this.c);
      }

      public lz.a a(cwy... $$0) {
         for (cwy $$1 : $$0) {
            lz.this.b.accept(lz.c($$1, this.b));
         }

         return this;
      }

      public lz.a b(cwy... $$0) {
         for (cwy $$1 : $$0) {
            lz.this.c($$1);
         }

         return this.a($$0);
      }

      public lz.a a(mo $$0, cwy... $$1) {
         for (cwy $$2 : $$1) {
            $$0.a(mn.a($$2.j()), mq.u($$2), lz.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mq b;
      private final Map<mo, ahh> c = Maps.newHashMap();
      @Nullable
      private kh d;
      @Nullable
      private ahh e;
      private final Set<cwy> f = new HashSet<>();

      public b(mq $$0) {
         this.b = $$0;
      }

      public lz.b a(cwy $$0, mo $$1) {
         this.e = $$1.a($$0, this.b, lz.this.c);
         if (lz.this.f.containsKey($$0)) {
            lz.this.b.accept(lz.this.f.get($$0).create($$0, this.e, this.b, lz.this.c));
         } else {
            lz.this.b.accept(lz.c($$0, this.e));
         }

         return this;
      }

      public lz.b a(cwy $$0, cwy $$1) {
         ahh $$2 = mn.a($$0);
         lz.this.b.accept(lz.c($$1, $$2));
         lz.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public lz.b a(cwy $$0) {
         ahh $$1 = mp.s.a($$0, this.b, lz.this.c);
         ahh $$2 = mp.t.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.b($$0, $$1, $$2));
         ahh $$3 = mp.u.a($$0, this.b, lz.this.c);
         lz.this.a($$0, $$3);
         return this;
      }

      public lz.b b(cwy $$0) {
         ahh $$1 = mp.M.a($$0, this.b, lz.this.c);
         ahh $$2 = mp.N.a($$0, this.b, lz.this.c);
         ahh $$3 = mp.O.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$1, $$2, $$3));
         ahh $$4 = mp.P.a($$0, this.b, lz.this.c);
         lz.this.a($$0, $$4);
         return this;
      }

      public lz.b c(cwy $$0) {
         mq $$1 = mq.p($$0);
         ahh $$2 = mp.D.a($$0, $$1, lz.this.c);
         ahh $$3 = mp.E.a($$0, $$1, lz.this.c);
         ahh $$4 = mp.F.a($$0, $$1, lz.this.c);
         ahh $$5 = mp.G.a($$0, $$1, lz.this.c);
         ahh $$6 = mp.H.a($$0, $$1, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$2, $$3, $$4, $$5, $$6));
         ahh $$7 = mp.I.a($$0, $$1, lz.this.c);
         lz.this.a($$0, $$7);
         return this;
      }

      public lz.b d(cwy $$0) {
         ahh $$1 = mp.J.a($$0, this.b, lz.this.c);
         ahh $$2 = mp.K.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.c($$0, $$1, $$2));
         ahh $$3 = mp.L.a($$0, this.b, lz.this.c);
         lz.this.a($$0, $$3);
         return this;
      }

      public lz.b e(cwy $$0) {
         mq $$1 = mq.p($$0);
         ahh $$2 = mp.R.a($$0, $$1, lz.this.c);
         ahh $$3 = mp.Q.a($$0, $$1, lz.this.c);
         ahh $$4 = mp.T.a($$0, $$1, lz.this.c);
         ahh $$5 = mp.S.a($$0, $$1, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public lz.b f(cwy $$0) {
         ahh $$1 = mp.V.a($$0, this.b, lz.this.c);
         ahh $$2 = mp.U.a($$0, this.b, lz.this.c);
         ahh $$3 = mp.X.a($$0, this.b, lz.this.c);
         ahh $$4 = mp.W.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public lz.b g(cwy $$0) {
         ahh $$1 = mp.Y.a($$0, this.b, lz.this.c);
         ahh $$2 = mp.Z.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.e($$0, $$1, $$2));
         return this;
      }

      public lz.b h(cwy $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cwy $$1 = this.d.b().get(kh.b.r);
            ahh $$2 = mp.aa.a($$0, this.b, lz.this.c);
            lz.this.b.accept(lz.c($$0, $$2));
            lz.this.b.accept(lz.c($$1, $$2));
            lz.this.a($$0.j());
            lz.this.c($$1);
            return this;
         }
      }

      public lz.b i(cwy $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ahh $$1 = this.a(mp.ab, $$0);
            ahh $$2 = this.a(mp.ac, $$0);
            lz.this.b.accept(lz.e($$0, $$1, $$2, this.e));
            lz.this.a($$0, $$1);
            return this;
         }
      }

      public lz.b j(cwy $$0) {
         ahh $$1 = this.a(mp.af, $$0);
         ahh $$2 = this.a(mp.ae, $$0);
         ahh $$3 = this.a(mp.ag, $$0);
         lz.this.b.accept(lz.b($$0, $$1, $$2, $$3));
         lz.this.a($$0, $$2);
         return this;
      }

      private lz.b k(cwy $$0) {
         ms $$1 = lz.this.g.getOrDefault($$0, ms.a.get($$0));
         ahh $$2 = $$1.a($$0, lz.this.c);
         lz.this.b.accept(lz.c($$0, $$2));
         return this;
      }

      private lz.b l(cwy $$0) {
         lz.this.i($$0);
         return this;
      }

      private void m(cwy $$0) {
         if (lz.this.e.contains($$0)) {
            lz.this.k($$0);
         } else {
            lz.this.j($$0);
         }
      }

      private ahh a(mo $$0, cwy $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, lz.this.c));
      }

      public lz.b a(kh $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<lz.b, cwy> $$2 = lz.h.get($$0x);
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
      mc create(cwy var1, ahh var2, mq var3, BiConsumer<ahh, Supplier<JsonElement>> var4);
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

      public lz.f a(cwy $$0) {
         mq $$1 = this.b.c(mr.d, this.b.a(mr.i));
         ahh $$2 = mp.j.a($$0, $$1, lz.this.c);
         lz.this.b.accept(lz.d($$0, $$2));
         return this;
      }

      public lz.f b(cwy $$0) {
         ahh $$1 = mp.j.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.d($$0, $$1));
         return this;
      }

      public lz.f c(cwy $$0) {
         ahh $$1 = mp.j.a($$0, this.b, lz.this.c);
         ahh $$2 = mp.k.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.d($$0, $$1, $$2));
         return this;
      }

      public lz.f d(cwy $$0) {
         lz.this.b.accept(lz.a($$0, this.b, lz.this.c));
         return this;
      }
   }
}
