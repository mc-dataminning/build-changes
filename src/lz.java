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
   private final Consumer<cmt> d;
   final List<cwq> e = ImmutableList.of(cws.ey, cws.eE, cws.hY);
   final Map<cwq, lz.c> f = ImmutableMap.builder().put(cws.b, lz::a).put(cws.sJ, lz::c).put(cws.eM, lz::b).build();
   final Map<cwq, ms> g = ImmutableMap.builder()
      .put(cws.aV, ms.y.get(cws.aV))
      .put(cws.jp, ms.y.get(cws.jp))
      .put(cws.jS, ms.a(mq.a(cws.aV, "_top")))
      .put(cws.jU, ms.a(mq.a(cws.jp, "_top")))
      .put(cws.aX, ms.d.get(cws.aV).a($$0x -> $$0x.a(mr.i, mq.G(cws.aX))))
      .put(cws.jr, ms.d.get(cws.jp).a($$0x -> $$0x.a(mr.i, mq.G(cws.jr))))
      .put(cws.hd, ms.d.get(cws.hd))
      .put(cws.jT, ms.a(mq.a(cws.hd, "_bottom")))
      .put(cws.pr, ms.z.get(cws.pr))
      .put(cws.sJ, ms.z.get(cws.sJ))
      .put(cws.he, ms.d.get(cws.he).a($$0x -> $$0x.a(mr.i, mq.G(cws.he))))
      .put(cws.aW, ms.d.get(cws.aW).a($$0x -> {
         $$0x.a(mr.d, mq.a(cws.aV, "_top"));
         $$0x.a(mr.i, mq.G(cws.aW));
      }))
      .put(cws.jq, ms.d.get(cws.jq).a($$0x -> {
         $$0x.a(mr.d, mq.a(cws.jp, "_top"));
         $$0x.a(mr.i, mq.G(cws.jq));
      }))
      .put(cws.qM, ms.z.get(cws.qM))
      .put(cws.qH, ms.z.get(cws.qH))
      .build();
   static final Map<kh.b, BiConsumer<lz.b, cwq>> h = ImmutableMap.builder()
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
   public static final List<Pair<djy, Function<ahg, mi>>> a = List.of(
      Pair.of(djx.L, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0)),
      Pair.of(djx.M, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.b, mj.a.b).a(mj.d, true)),
      Pair.of(djx.N, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.b, mj.a.c).a(mj.d, true)),
      Pair.of(djx.O, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.b, mj.a.d).a(mj.d, true)),
      Pair.of(djx.J, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.a, mj.a.d).a(mj.d, true)),
      Pair.of(djx.K, (Function<ahg, mi>)$$0 -> mi.a().a(mj.c, $$0).a(mj.a, mj.a.b).a(mj.d, true))
   );
   private static final Map<lz.d, ahg> i = new HashMap<>();

   private static mc a(cwq $$0, ahg $$1, mq $$2, BiConsumer<ahg, Supplier<JsonElement>> $$3) {
      ahg $$4 = mp.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static mc b(cwq $$0, ahg $$1, mq $$2, BiConsumer<ahg, Supplier<JsonElement>> $$3) {
      ahg $$4 = mp.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static mc c(cwq $$0, ahg $$1, mq $$2, BiConsumer<ahg, Supplier<JsonElement>> $$3) {
      ahg $$4 = mp.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public lz(Consumer<mc> $$0, BiConsumer<ahg, Supplier<JsonElement>> $$1, Consumer<cmt> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cwq $$0) {
      this.d.accept($$0.k());
   }

   void a(cwq $$0, ahg $$1) {
      this.c.accept(mn.a($$0.k()), new mm($$1));
   }

   private void a(cmt $$0, ahg $$1) {
      this.c.accept(mn.a($$0), new mm($$1));
   }

   void a(cmt $$0) {
      mp.bx.a(mn.a($$0), mq.b($$0), this.c);
   }

   private void d(cwq $$0) {
      cmt $$1 = $$0.k();
      if ($$1 != cnb.a) {
         mp.bx.a(mn.a($$1), mq.F($$0), this.c);
      }
   }

   private void a(cwq $$0, String $$1) {
      cmt $$2 = $$0.k();
      mp.bx.a(mn.a($$2), mq.k(mq.a($$0, $$1)), this.c);
   }

   private static mg b() {
      return mg.a(djx.R).a(ic.f, mi.a().a(mj.b, mj.a.b)).a(ic.d, mi.a().a(mj.b, mj.a.c)).a(ic.e, mi.a().a(mj.b, mj.a.d)).a(ic.c, mi.a());
   }

   private static mg c() {
      return mg.a(djx.R).a(ic.d, mi.a()).a(ic.e, mi.a().a(mj.b, mj.a.b)).a(ic.c, mi.a().a(mj.b, mj.a.c)).a(ic.f, mi.a().a(mj.b, mj.a.d));
   }

   private static mg d() {
      return mg.a(djx.R).a(ic.f, mi.a()).a(ic.d, mi.a().a(mj.b, mj.a.b)).a(ic.e, mi.a().a(mj.b, mj.a.c)).a(ic.c, mi.a().a(mj.b, mj.a.d));
   }

   private static mg e() {
      return mg.a(djx.P)
         .a(ic.a, mi.a().a(mj.a, mj.a.b))
         .a(ic.b, mi.a().a(mj.a, mj.a.d))
         .a(ic.c, mi.a())
         .a(ic.d, mi.a().a(mj.b, mj.a.c))
         .a(ic.e, mi.a().a(mj.b, mj.a.d))
         .a(ic.f, mi.a().a(mj.b, mj.a.b));
   }

   private static mf b(cwq $$0, ahg $$1) {
      return mf.a($$0, a($$1));
   }

   private static mi[] a(ahg $$0) {
      return new mi[]{mi.a().a(mj.c, $$0), mi.a().a(mj.c, $$0).a(mj.b, mj.a.b), mi.a().a(mj.c, $$0).a(mj.b, mj.a.c), mi.a().a(mj.c, $$0).a(mj.b, mj.a.d)};
   }

   private static mf a(cwq $$0, ahg $$1, ahg $$2) {
      return mf.a($$0, mi.a().a(mj.c, $$1), mi.a().a(mj.c, $$2), mi.a().a(mj.c, $$1).a(mj.b, mj.a.c), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c));
   }

   private static mg a(djy $$0, ahg $$1, ahg $$2) {
      return mg.a($$0).a(true, mi.a().a(mj.c, $$1)).a(false, mi.a().a(mj.c, $$2));
   }

   private void e(cwq $$0) {
      ahg $$1 = ms.a.create($$0, this.c);
      ahg $$2 = ms.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cwq $$0) {
      ahg $$1 = ms.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cwq $$0) {
      this.b.accept(mf.a($$0).a(mg.a(djx.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ahg $$3 = mq.a($$0, $$2);
         return mi.a().a(mj.c, mp.c.a($$0, $$2, new mq().a(mr.a, $$3), this.c));
      })));
      this.a($$0, mq.a($$0, "_0"));
   }

   static mc b(cwq $$0, ahg $$1, ahg $$2) {
      return mf.a($$0)
         .a(mg.a(djx.w).a(false, mi.a().a(mj.c, $$1)).a(true, mi.a().a(mj.c, $$2)))
         .a(
            mg.a(djx.U, djx.R)
               .a(djs.a, ic.f, mi.a().a(mj.b, mj.a.b))
               .a(djs.a, ic.e, mi.a().a(mj.b, mj.a.d))
               .a(djs.a, ic.d, mi.a().a(mj.b, mj.a.c))
               .a(djs.a, ic.c, mi.a())
               .a(djs.b, ic.f, mi.a().a(mj.b, mj.a.b).a(mj.a, mj.a.b).a(mj.d, true))
               .a(djs.b, ic.e, mi.a().a(mj.b, mj.a.d).a(mj.a, mj.a.b).a(mj.d, true))
               .a(djs.b, ic.d, mi.a().a(mj.b, mj.a.c).a(mj.a, mj.a.b).a(mj.d, true))
               .a(djs.b, ic.c, mi.a().a(mj.a, mj.a.b).a(mj.d, true))
               .a(djs.c, ic.f, mi.a().a(mj.b, mj.a.d).a(mj.a, mj.a.c))
               .a(djs.c, ic.e, mi.a().a(mj.b, mj.a.b).a(mj.a, mj.a.c))
               .a(djs.c, ic.d, mi.a().a(mj.a, mj.a.c))
               .a(djs.c, ic.c, mi.a().a(mj.b, mj.a.c).a(mj.a, mj.a.c))
         );
   }

   private static mg.d<ic, dkd, dkc, Boolean> a(mg.d<ic, dkd, dkc, Boolean> $$0, dkd $$1, ahg $$2, ahg $$3, ahg $$4, ahg $$5) {
      return $$0.a(ic.f, $$1, dkc.a, false, mi.a().a(mj.c, $$2))
         .a(ic.d, $$1, dkc.a, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
         .a(ic.e, $$1, dkc.a, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
         .a(ic.c, $$1, dkc.a, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
         .a(ic.f, $$1, dkc.b, false, mi.a().a(mj.c, $$4))
         .a(ic.d, $$1, dkc.b, false, mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
         .a(ic.e, $$1, dkc.b, false, mi.a().a(mj.c, $$4).a(mj.b, mj.a.c))
         .a(ic.c, $$1, dkc.b, false, mi.a().a(mj.c, $$4).a(mj.b, mj.a.d))
         .a(ic.f, $$1, dkc.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
         .a(ic.d, $$1, dkc.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
         .a(ic.e, $$1, dkc.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
         .a(ic.c, $$1, dkc.a, true, mi.a().a(mj.c, $$3))
         .a(ic.f, $$1, dkc.b, true, mi.a().a(mj.c, $$5).a(mj.b, mj.a.d))
         .a(ic.d, $$1, dkc.b, true, mi.a().a(mj.c, $$5))
         .a(ic.e, $$1, dkc.b, true, mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
         .a(ic.c, $$1, dkc.b, true, mi.a().a(mj.c, $$5).a(mj.b, mj.a.c));
   }

   private static mc a(cwq $$0, ahg $$1, ahg $$2, ahg $$3, ahg $$4, ahg $$5, ahg $$6, ahg $$7, ahg $$8) {
      return mf.a($$0).a(a(a(mg.a(djx.R, djx.ae, djx.be, djx.u), dkd.b, $$1, $$2, $$3, $$4), dkd.a, $$5, $$6, $$7, $$8));
   }

   static mc a(cwq $$0, ahg $$1, ahg $$2, ahg $$3, ahg $$4, ahg $$5) {
      return me.a($$0)
         .a(mi.a().a(mj.c, $$1))
         .a(md.a().a(djx.L, true), mi.a().a(mj.c, $$2).a(mj.d, false))
         .a(md.a().a(djx.M, true), mi.a().a(mj.c, $$3).a(mj.d, false))
         .a(md.a().a(djx.N, true), mi.a().a(mj.c, $$4).a(mj.d, false))
         .a(md.a().a(djx.O, true), mi.a().a(mj.c, $$5).a(mj.d, false));
   }

   static mc c(cwq $$0, ahg $$1, ahg $$2) {
      return me.a($$0)
         .a(mi.a().a(mj.c, $$1))
         .a(md.a().a(djx.L, true), mi.a().a(mj.c, $$2).a(mj.d, true))
         .a(md.a().a(djx.M, true), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true))
         .a(md.a().a(djx.N, true), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true))
         .a(md.a().a(djx.O, true), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true));
   }

   static mc a(cwq $$0, ahg $$1, ahg $$2, ahg $$3) {
      return me.a($$0)
         .a(md.a().a(djx.J, true), mi.a().a(mj.c, $$1))
         .a(md.a().a(djx.X, dkt.b), mi.a().a(mj.c, $$2).a(mj.d, true))
         .a(md.a().a(djx.W, dkt.b), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true))
         .a(md.a().a(djx.Y, dkt.b), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true))
         .a(md.a().a(djx.Z, dkt.b), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true))
         .a(md.a().a(djx.X, dkt.c), mi.a().a(mj.c, $$3).a(mj.d, true))
         .a(md.a().a(djx.W, dkt.c), mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true))
         .a(md.a().a(djx.Y, dkt.c), mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true))
         .a(md.a().a(djx.Z, dkt.c), mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true));
   }

   static mc a(cwq $$0, ahg $$1, ahg $$2, ahg $$3, ahg $$4, boolean $$5) {
      return mf.a($$0, mi.a().a(mj.d, $$5))
         .a(c())
         .a(
            mg.a(djx.q, djx.u)
               .a(false, false, mi.a().a(mj.c, $$2))
               .a(true, false, mi.a().a(mj.c, $$4))
               .a(false, true, mi.a().a(mj.c, $$1))
               .a(true, true, mi.a().a(mj.c, $$3))
         );
   }

   static mc b(cwq $$0, ahg $$1, ahg $$2, ahg $$3) {
      return mf.a($$0)
         .a(
            mg.a(djx.R, djx.af, djx.bi)
               .a(ic.f, dkg.b, dkq.a, mi.a().a(mj.c, $$2))
               .a(ic.e, dkg.b, dkq.a, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkg.b, dkq.a, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkg.b, dkq.a, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkg.b, dkq.e, mi.a().a(mj.c, $$3))
               .a(ic.e, dkg.b, dkq.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkg.b, dkq.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkg.b, dkq.e, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkg.b, dkq.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.e, dkg.b, dkq.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.d, dkg.b, dkq.d, mi.a().a(mj.c, $$3))
               .a(ic.c, dkg.b, dkq.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.f, dkg.b, dkq.c, mi.a().a(mj.c, $$1))
               .a(ic.e, dkg.b, dkq.c, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkg.b, dkq.c, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkg.b, dkq.c, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkg.b, dkq.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.e, dkg.b, dkq.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.d, dkg.b, dkq.b, mi.a().a(mj.c, $$1))
               .a(ic.c, dkg.b, dkq.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.f, dkg.a, dkq.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.e, dkg.a, dkq.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkg.a, dkq.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkg.a, dkq.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkg.a, dkq.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.e, dkg.a, dkq.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.d, dkg.a, dkq.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.c, dkg.a, dkq.e, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.f, dkg.a, dkq.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.e, dkg.a, dkq.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkg.a, dkq.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkg.a, dkq.d, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.f, dkg.a, dkq.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.e, dkg.a, dkq.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
               .a(ic.d, dkg.a, dkq.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.c, dkg.a, dkq.c, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.f, dkg.a, dkq.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.d, true))
               .a(ic.e, dkg.a, dkq.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.c).a(mj.d, true))
               .a(ic.d, dkg.a, dkq.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.b).a(mj.d, true))
               .a(ic.c, dkg.a, dkq.b, mi.a().a(mj.c, $$1).a(mj.a, mj.a.c).a(mj.b, mj.a.d).a(mj.d, true))
         );
   }

   private static mc c(cwq $$0, ahg $$1, ahg $$2, ahg $$3) {
      return mf.a($$0)
         .a(
            mg.a(djx.R, djx.af, djx.u)
               .a(ic.c, dkg.b, false, mi.a().a(mj.c, $$2))
               .a(ic.d, dkg.b, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
               .a(ic.f, dkg.b, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
               .a(ic.e, dkg.b, false, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
               .a(ic.c, dkg.a, false, mi.a().a(mj.c, $$1))
               .a(ic.d, dkg.a, false, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
               .a(ic.f, dkg.a, false, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
               .a(ic.e, dkg.a, false, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
               .a(ic.c, dkg.b, true, mi.a().a(mj.c, $$3))
               .a(ic.d, dkg.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(ic.f, dkg.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(ic.e, dkg.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               .a(ic.c, dkg.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.c))
               .a(ic.d, dkg.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.a))
               .a(ic.f, dkg.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.d))
               .a(ic.e, dkg.a, true, mi.a().a(mj.c, $$3).a(mj.a, mj.a.c).a(mj.b, mj.a.b))
         );
   }

   private static mc d(cwq $$0, ahg $$1, ahg $$2, ahg $$3) {
      return mf.a($$0)
         .a(
            mg.a(djx.R, djx.af, djx.u)
               .a(ic.c, dkg.b, false, mi.a().a(mj.c, $$2))
               .a(ic.d, dkg.b, false, mi.a().a(mj.c, $$2))
               .a(ic.f, dkg.b, false, mi.a().a(mj.c, $$2))
               .a(ic.e, dkg.b, false, mi.a().a(mj.c, $$2))
               .a(ic.c, dkg.a, false, mi.a().a(mj.c, $$1))
               .a(ic.d, dkg.a, false, mi.a().a(mj.c, $$1))
               .a(ic.f, dkg.a, false, mi.a().a(mj.c, $$1))
               .a(ic.e, dkg.a, false, mi.a().a(mj.c, $$1))
               .a(ic.c, dkg.b, true, mi.a().a(mj.c, $$3))
               .a(ic.d, dkg.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(ic.f, dkg.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(ic.e, dkg.b, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               .a(ic.c, dkg.a, true, mi.a().a(mj.c, $$3))
               .a(ic.d, dkg.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(ic.f, dkg.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(ic.e, dkg.a, true, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
         );
   }

   static mf c(cwq $$0, ahg $$1) {
      return mf.a($$0, mi.a().a(mj.c, $$1));
   }

   private static mg f() {
      return mg.a(djx.I).a(ic.a.b, mi.a()).a(ic.a.c, mi.a().a(mj.a, mj.a.b)).a(ic.a.a, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b));
   }

   static mc a(cwq $$0, mq $$1, BiConsumer<ahg, Supplier<JsonElement>> $$2) {
      ahg $$3 = mp.g.a($$0, $$1, $$2);
      ahg $$4 = mp.h.a($$0, $$1, $$2);
      ahg $$5 = mp.i.a($$0, $$1, $$2);
      ahg $$6 = mp.j.a($$0, $$1, $$2);
      return mf.a($$0, mi.a().a(mj.c, $$6)).a(mg.a(djx.I).a(ic.a.a, mi.a().a(mj.c, $$3)).a(ic.a.b, mi.a().a(mj.c, $$4)).a(ic.a.c, mi.a().a(mj.c, $$5)));
   }

   static mc d(cwq $$0, ahg $$1) {
      return mf.a($$0, mi.a().a(mj.c, $$1)).a(f());
   }

   private void e(cwq $$0, ahg $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cwq $$0, ms.a $$1) {
      ahg $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cwq $$0, ms.a $$1) {
      ahg $$2 = $$1.create($$0, this.c);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, $$2)).a(b()));
   }

   static mc d(cwq $$0, ahg $$1, ahg $$2) {
      return mf.a($$0)
         .a(
            mg.a(djx.I)
               .a(ic.a.b, mi.a().a(mj.c, $$1))
               .a(ic.a.c, mi.a().a(mj.c, $$2).a(mj.a, mj.a.b))
               .a(ic.a.a, mi.a().a(mj.c, $$2).a(mj.a, mj.a.b).a(mj.b, mj.a.b))
         );
   }

   private void a(cwq $$0, ms.a $$1, ms.a $$2) {
      ahg $$3 = $$1.create($$0, this.c);
      ahg $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ahg a(cwq $$0, String $$1, mo $$2, Function<ahg, mq> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mq.a($$0, $$1)), this.c);
   }

   static mc e(cwq $$0, ahg $$1, ahg $$2) {
      return mf.a($$0).a(a(djx.w, $$2, $$1));
   }

   static mc e(cwq $$0, ahg $$1, ahg $$2, ahg $$3) {
      return mf.a($$0).a(mg.a(djx.bh).a(dkp.b, mi.a().a(mj.c, $$1)).a(dkp.a, mi.a().a(mj.c, $$2)).a(dkp.c, mi.a().a(mj.c, $$3)));
   }

   public void a(cwq $$0) {
      this.b($$0, ms.a);
   }

   public void b(cwq $$0, ms.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cwq $$0, mq $$1, mo $$2) {
      ahg $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private lz.b h(cwq $$0) {
      ms $$1 = this.g.getOrDefault($$0, ms.a.get($$0));
      return new lz.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cwq $$0, cwq $$1, cwq $$2) {
      mq $$3 = mq.u($$0);
      ahg $$4 = mp.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(cwq $$0) {
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

   private void a(cwq $$0, cwq $$1) {
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

   void j(cwq $$0) {
      mq $$1 = mq.b($$0);
      ahg $$2 = mp.ak.a($$0, $$1, this.c);
      ahg $$3 = mp.al.a($$0, $$1, this.c);
      ahg $$4 = mp.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cwq $$0) {
      mq $$1 = mq.b($$0);
      ahg $$2 = mp.ah.a($$0, $$1, this.c);
      ahg $$3 = mp.ai.a($$0, $$1, this.c);
      ahg $$4 = mp.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(cwq $$0, cwq $$1) {
      ahg $$2 = mp.ah.a($$0);
      ahg $$3 = mp.ai.a($$0);
      ahg $$4 = mp.aj.a($$0);
      this.a($$1, mn.a($$0.k()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(cws.sD);
      ahg $$0 = mn.a(cws.sD);
      ahg $$1 = mn.a(cws.sD, "_partial_tilt");
      ahg $$2 = mn.a(cws.sD, "_full_tilt");
      this.b
         .accept(
            mf.a(cws.sD)
               .a(b())
               .a(mg.a(djx.bl).a(dks.a, mi.a().a(mj.c, $$0)).a(dks.b, mi.a().a(mj.c, $$0)).a(dks.c, mi.a().a(mj.c, $$1)).a(dks.d, mi.a().a(mj.c, $$2)))
         );
   }

   private lz.f l(cwq $$0) {
      return new lz.f(mq.n($$0));
   }

   private void m(cwq $$0) {
      this.c($$0, $$0);
   }

   private void c(cwq $$0, cwq $$1) {
      this.b.accept(c($$0, mn.a($$1)));
   }

   private void a(cwq $$0, lz.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cwq $$0, lz.e $$1, mq $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cwq $$0, lz.e $$1) {
      mq $$2 = mq.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cwq $$0, lz.e $$1, mq $$2) {
      ahg $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cwq $$0, lz.e $$1, dkk<Integer> $$2, int... $$3) {
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

   private void a(cwq $$0, cwq $$1, lz.e $$2) {
      this.a($$0, $$2);
      mq $$3 = mq.d($$0);
      ahg $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(cwq $$0, cwq $$1) {
      ms $$2 = ms.p.get($$0);
      ahg $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ahg $$4 = mp.aC.a($$1, $$2.b(), this.c);
      this.b.accept(mf.a($$1, mi.a().a(mj.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(cwq $$0, cwq $$1) {
      this.a($$0.k());
      mq $$2 = mq.h($$0);
      mq $$3 = mq.a($$0, $$1);
      ahg $$4 = mp.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            mf.a($$1, mi.a().a(mj.c, $$4))
               .a(mg.a(djx.R).a(ic.e, mi.a()).a(ic.d, mi.a().a(mj.b, mj.a.d)).a(ic.c, mi.a().a(mj.b, mj.a.b)).a(ic.f, mi.a().a(mj.b, mj.a.c)))
         );
      this.b.accept(mf.a($$0).a(mg.a(djx.av).a($$2x -> mi.a().a(mj.c, mp.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cwq $$0 = cws.kC;
      this.a($$0.k());
      ahg $$1 = mn.a($$0, "_top");
      ahg $$2 = mn.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cwq $$0 = cws.kB;
      this.a($$0.k());
      mg $$1 = mg.a(dce.d, djx.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> mi.a().a(mj.c, mn.a($$0, "_top_stage_" + $$1x));
            case b -> mi.a().a(mj.c, mn.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mf.a($$0).a($$1));
   }

   private void a(cwq $$0, cwq $$1, cwq $$2, cwq $$3, cwq $$4, cwq $$5, cwq $$6, cwq $$7) {
      this.a($$0, lz.e.b);
      this.a($$1, lz.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(cwq $$0, lz.e $$1) {
      this.a($$0, "_top");
      ahg $$2 = this.a($$0, "_top", $$1.a(), mq::c);
      ahg $$3 = this.a($$0, "_bottom", $$1.a(), mq::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cws.iD, "_front");
      ahg $$0 = mn.a(cws.iD, "_top");
      ahg $$1 = this.a(cws.iD, "_bottom", lz.e.b.a(), mq::c);
      this.f(cws.iD, $$0, $$1);
   }

   private void k() {
      ahg $$0 = this.a(cws.bx, "_top", mp.bk, mq::a);
      ahg $$1 = this.a(cws.bx, "_bottom", mp.bk, mq::a);
      this.f(cws.bx, $$0, $$1);
   }

   private void l() {
      this.c(cws.sF);
      ahg $$0 = mn.a(cws.sF, "_top");
      ahg $$1 = mn.a(cws.sF, "_bottom");
      this.b.accept(mf.a(cws.sF).a(b()).a(mg.a(djx.ae).a(dkd.b, mi.a().a(mj.c, $$1)).a(dkd.a, mi.a().a(mj.c, $$0))));
   }

   private void f(cwq $$0, ahg $$1, ahg $$2) {
      this.b.accept(mf.a($$0).a(mg.a(djx.ae).a(dkd.b, mi.a().a(mj.c, $$2)).a(dkd.a, mi.a().a(mj.c, $$1))));
   }

   private void n(cwq $$0) {
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
                  mg.a(djx.ag)
                     .a(dkl.a, mi.a().a(mj.c, $$3))
                     .a(dkl.b, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
                     .a(dkl.c, mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
                     .a(dkl.d, mi.a().a(mj.c, $$6).a(mj.b, mj.a.b))
                     .a(dkl.e, mi.a().a(mj.c, $$5))
                     .a(dkl.f, mi.a().a(mj.c, $$6))
                     .a(dkl.g, mi.a().a(mj.c, $$4))
                     .a(dkl.h, mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
                     .a(dkl.i, mi.a().a(mj.c, $$4).a(mj.b, mj.a.c))
                     .a(dkl.j, mi.a().a(mj.c, $$4).a(mj.b, mj.a.d))
               )
         );
   }

   private void o(cwq $$0) {
      ahg $$1 = this.a($$0, "", mp.as, mq::e);
      ahg $$2 = this.a($$0, "", mp.au, mq::e);
      ahg $$3 = this.a($$0, "", mp.av, mq::e);
      ahg $$4 = this.a($$0, "_on", mp.as, mq::e);
      ahg $$5 = this.a($$0, "_on", mp.au, mq::e);
      ahg $$6 = this.a($$0, "_on", mp.av, mq::e);
      mg $$7 = mg.a(djx.w, djx.ah).a(($$6x, $$7x) -> {
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

   private lz.a a(ahg $$0, cwq $$1) {
      return new lz.a($$0, $$1);
   }

   private lz.a f(cwq $$0, cwq $$1) {
      return new lz.a(mn.a($$0), $$1);
   }

   private void a(cwq $$0, cmt $$1) {
      ahg $$2 = mp.aa.a($$0, mq.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cwq $$0, ahg $$1) {
      ahg $$2 = mp.aa.a($$0, mq.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(cwq $$0, cwq $$1) {
      this.a($$0);
      ahg $$2 = ms.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cwq $$0) {
      this.a($$0.k());
      ahg $$1 = ms.k.create($$0, this.c);
      ahg $$2 = ms.l.create($$0, this.c);
      ahg $$3 = ms.m.create($$0, this.c);
      ahg $$4 = ms.n.create($$0, this.c);
      this.b
         .accept(
            me.a($$0)
               .a(md.a().a(djx.S, 1, 2, 3, 4).a(djx.R, ic.c), mi.a().a(mj.c, $$1))
               .a(md.a().a(djx.S, 1, 2, 3, 4).a(djx.R, ic.f), mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
               .a(md.a().a(djx.S, 1, 2, 3, 4).a(djx.R, ic.d), mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
               .a(md.a().a(djx.S, 1, 2, 3, 4).a(djx.R, ic.e), mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
               .a(md.a().a(djx.S, 2, 3, 4).a(djx.R, ic.c), mi.a().a(mj.c, $$2))
               .a(md.a().a(djx.S, 2, 3, 4).a(djx.R, ic.f), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
               .a(md.a().a(djx.S, 2, 3, 4).a(djx.R, ic.d), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
               .a(md.a().a(djx.S, 2, 3, 4).a(djx.R, ic.e), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
               .a(md.a().a(djx.S, 3, 4).a(djx.R, ic.c), mi.a().a(mj.c, $$3))
               .a(md.a().a(djx.S, 3, 4).a(djx.R, ic.f), mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(md.a().a(djx.S, 3, 4).a(djx.R, ic.d), mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               .a(md.a().a(djx.S, 3, 4).a(djx.R, ic.e), mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
               .a(md.a().a(djx.S, 4).a(djx.R, ic.c), mi.a().a(mj.c, $$4))
               .a(md.a().a(djx.S, 4).a(djx.R, ic.f), mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
               .a(md.a().a(djx.S, 4).a(djx.R, ic.d), mi.a().a(mj.c, $$4).a(mj.b, mj.a.c))
               .a(md.a().a(djx.S, 4).a(djx.R, ic.e), mi.a().a(mj.c, $$4).a(mj.b, mj.a.d))
         );
   }

   private void a(ms.a $$0, cwq... $$1) {
      for (cwq $$2 : $$1) {
         ahg $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ms.a $$0, cwq... $$1) {
      for (cwq $$2 : $$1) {
         ahg $$3 = $$0.create($$2, this.c);
         this.b.accept(mf.a($$2, mi.a().a(mj.c, $$3)).a(c()));
      }
   }

   private void h(cwq $$0, cwq $$1) {
      this.a($$0);
      mq $$2 = mq.b($$0, $$1);
      ahg $$3 = mp.aI.a($$1, $$2, this.c);
      ahg $$4 = mp.aJ.a($$1, $$2, this.c);
      ahg $$5 = mp.aK.a($$1, $$2, this.c);
      ahg $$6 = mp.aG.a($$1, $$2, this.c);
      ahg $$7 = mp.aH.a($$1, $$2, this.c);
      cmt $$8 = $$1.k();
      mp.bx.a(mn.a($$8), mq.F($$0), this.c);
      this.b
         .accept(
            me.a($$1)
               .a(mi.a().a(mj.c, $$3))
               .a(md.a().a(djx.L, true), mi.a().a(mj.c, $$4))
               .a(md.a().a(djx.M, true), mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
               .a(md.a().a(djx.N, true), mi.a().a(mj.c, $$5))
               .a(md.a().a(djx.O, true), mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
               .a(md.a().a(djx.L, false), mi.a().a(mj.c, $$6))
               .a(md.a().a(djx.M, false), mi.a().a(mj.c, $$7))
               .a(md.a().a(djx.N, false), mi.a().a(mj.c, $$7).a(mj.b, mj.a.b))
               .a(md.a().a(djx.O, false), mi.a().a(mj.c, $$6).a(mj.b, mj.a.d))
         );
   }

   private void q(cwq $$0) {
      mq $$1 = mq.z($$0);
      ahg $$2 = mp.aL.a($$0, $$1, this.c);
      ahg $$3 = this.a($$0, "_conditional", mp.aL, $$1x -> $$1.c(mr.i, $$1x));
      this.b.accept(mf.a($$0).a(a(djx.c, $$3, $$2)).a(e()));
   }

   private void r(cwq $$0) {
      ahg $$1 = ms.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<mi> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> mi.a().a(mj.c, mn.a(cws.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cws.mZ);
      this.b
         .accept(
            me.a(cws.mZ)
               .a(md.a().a(djx.aq, 0), this.a(0))
               .a(md.a().a(djx.aq, 1), this.a(1))
               .a(md.a().a(djx.bk, djt.b), mi.a().a(mj.c, mn.a(cws.mZ, "_small_leaves")))
               .a(md.a().a(djx.bk, djt.c), mi.a().a(mj.c, mn.a(cws.mZ, "_large_leaves")))
         );
   }

   private mg n() {
      return mg.a(djx.P)
         .a(ic.a, mi.a().a(mj.a, mj.a.c))
         .a(ic.b, mi.a())
         .a(ic.c, mi.a().a(mj.a, mj.a.b))
         .a(ic.d, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.c))
         .a(ic.e, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.d))
         .a(ic.f, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b));
   }

   private void o() {
      ahg $$0 = mq.a(cws.nU, "_top_open");
      this.b
         .accept(
            mf.a(cws.nU)
               .a(this.n())
               .a(
                  mg.a(djx.u)
                     .a(false, mi.a().a(mj.c, ms.f.create(cws.nU, this.c)))
                     .a(true, mi.a().a(mj.c, ms.f.get(cws.nU).a($$1 -> $$1.a(mr.f, $$0)).a(cws.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mg a(dkk<T> $$0, T $$1, ahg $$2, ahg $$3) {
      mi $$4 = mi.a().a(mj.c, $$2);
      mi $$5 = mi.a().a(mj.c, $$3);
      return mg.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cwq $$0, Function<cwq, mq> $$1) {
      mq $$2 = $$1.apply($$0).b(mr.i, mr.c);
      mq $$3 = $$2.c(mr.g, mq.a($$0, "_front_honey"));
      ahg $$4 = mp.q.a($$0, $$2, this.c);
      ahg $$5 = mp.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(mf.a($$0).a(b()).a(a(djx.aN, 5, $$5, $$4)));
   }

   private void a(cwq $$0, dkk<Integer> $$1, int... $$2) {
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
      ahg $$0 = mn.a(cws.od, "_floor");
      ahg $$1 = mn.a(cws.od, "_ceiling");
      ahg $$2 = mn.a(cws.od, "_wall");
      ahg $$3 = mn.a(cws.od, "_between_walls");
      this.a(cnb.wf);
      this.b
         .accept(
            mf.a(cws.od)
               .a(
                  mg.a(djx.R, djx.V)
                     .a(ic.c, djv.a, mi.a().a(mj.c, $$0))
                     .a(ic.d, djv.a, mi.a().a(mj.c, $$0).a(mj.b, mj.a.c))
                     .a(ic.f, djv.a, mi.a().a(mj.c, $$0).a(mj.b, mj.a.b))
                     .a(ic.e, djv.a, mi.a().a(mj.c, $$0).a(mj.b, mj.a.d))
                     .a(ic.c, djv.b, mi.a().a(mj.c, $$1))
                     .a(ic.d, djv.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
                     .a(ic.f, djv.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
                     .a(ic.e, djv.b, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
                     .a(ic.c, djv.c, mi.a().a(mj.c, $$2).a(mj.b, mj.a.d))
                     .a(ic.d, djv.c, mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
                     .a(ic.f, djv.c, mi.a().a(mj.c, $$2))
                     .a(ic.e, djv.c, mi.a().a(mj.c, $$2).a(mj.b, mj.a.c))
                     .a(ic.d, djv.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
                     .a(ic.c, djv.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.d))
                     .a(ic.f, djv.d, mi.a().a(mj.c, $$3))
                     .a(ic.e, djv.d, mi.a().a(mj.c, $$3).a(mj.b, mj.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mf.a(cws.nZ, mi.a().a(mj.c, mn.a(cws.nZ)))
               .a(
                  mg.a(djx.U, djx.R)
                     .a(djs.a, ic.c, mi.a())
                     .a(djs.a, ic.f, mi.a().a(mj.b, mj.a.b))
                     .a(djs.a, ic.d, mi.a().a(mj.b, mj.a.c))
                     .a(djs.a, ic.e, mi.a().a(mj.b, mj.a.d))
                     .a(djs.b, ic.c, mi.a().a(mj.a, mj.a.b))
                     .a(djs.b, ic.f, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b))
                     .a(djs.b, ic.d, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.c))
                     .a(djs.b, ic.e, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.d))
                     .a(djs.c, ic.d, mi.a().a(mj.a, mj.a.c))
                     .a(djs.c, ic.e, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.b))
                     .a(djs.c, ic.c, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.c))
                     .a(djs.c, ic.f, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.d))
               )
         );
   }

   private void d(cwq $$0, ms.a $$1) {
      ahg $$2 = $$1.create($$0, this.c);
      ahg $$3 = mq.a($$0, "_front_on");
      ahg $$4 = $$1.get($$0).a($$1x -> $$1x.a(mr.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mf.a($$0).a(a(djx.r, $$4, $$2)).a(b()));
   }

   private void a(cwq... $$0) {
      ahg $$1 = mn.a("campfire_off");

      for (cwq $$2 : $$0) {
         ahg $$3 = mp.bc.a($$2, mq.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(mf.a($$2).a(a(djx.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cwq $$0) {
      ahg $$1 = mp.bt.a($$0, mq.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cwq $$0) {
      ahg $$1;
      if ($$0 == cws.tj) {
         $$1 = mp.bv.a($$0, mq.m($$0), this.c);
      } else {
         $$1 = mp.bu.a($$0, mq.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mq $$0 = mq.a(mq.G(cws.cl), mq.G(cws.n));
      ahg $$1 = mp.j.a(cws.cl, $$0, this.c);
      this.b.accept(c(cws.cl, $$1));
   }

   private void s() {
      this.a(cnb.lG);
      this.b
         .accept(
            me.a(cws.cw)
               .a(
                  md.b(
                     md.a().a(djx.ab, dkm.c).a(djx.aa, dkm.c).a(djx.ac, dkm.c).a(djx.ad, dkm.c),
                     md.a().a(djx.ab, dkm.b, dkm.a).a(djx.aa, dkm.b, dkm.a),
                     md.a().a(djx.aa, dkm.b, dkm.a).a(djx.ac, dkm.b, dkm.a),
                     md.a().a(djx.ac, dkm.b, dkm.a).a(djx.ad, dkm.b, dkm.a),
                     md.a().a(djx.ad, dkm.b, dkm.a).a(djx.ab, dkm.b, dkm.a)
                  ),
                  mi.a().a(mj.c, mn.a("redstone_dust_dot"))
               )
               .a(md.a().a(djx.ab, dkm.b, dkm.a), mi.a().a(mj.c, mn.a("redstone_dust_side0")))
               .a(md.a().a(djx.ac, dkm.b, dkm.a), mi.a().a(mj.c, mn.a("redstone_dust_side_alt0")))
               .a(md.a().a(djx.aa, dkm.b, dkm.a), mi.a().a(mj.c, mn.a("redstone_dust_side_alt1")).a(mj.b, mj.a.d))
               .a(md.a().a(djx.ad, dkm.b, dkm.a), mi.a().a(mj.c, mn.a("redstone_dust_side1")).a(mj.b, mj.a.d))
               .a(md.a().a(djx.ab, dkm.a), mi.a().a(mj.c, mn.a("redstone_dust_up")))
               .a(md.a().a(djx.aa, dkm.a), mi.a().a(mj.c, mn.a("redstone_dust_up")).a(mj.b, mj.a.b))
               .a(md.a().a(djx.ac, dkm.a), mi.a().a(mj.c, mn.a("redstone_dust_up")).a(mj.b, mj.a.c))
               .a(md.a().a(djx.ad, dkm.a), mi.a().a(mj.c, mn.a("redstone_dust_up")).a(mj.b, mj.a.d))
         );
   }

   private void t() {
      this.a(cnb.lK);
      this.b
         .accept(
            mf.a(cws.gY)
               .a(c())
               .a(
                  mg.a(djx.bd, djx.w)
                     .a(dka.a, false, mi.a().a(mj.c, mn.a(cws.gY)))
                     .a(dka.a, true, mi.a().a(mj.c, mn.a(cws.gY, "_on")))
                     .a(dka.b, false, mi.a().a(mj.c, mn.a(cws.gY, "_subtract")))
                     .a(dka.b, true, mi.a().a(mj.c, mn.a(cws.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mq $$0 = mq.a(cws.jR);
      mq $$1 = mq.a(mq.a(cws.jE, "_side"), $$0.a(mr.f));
      ahg $$2 = mp.ab.a(cws.jE, $$1, this.c);
      ahg $$3 = mp.ac.a(cws.jE, $$1, this.c);
      ahg $$4 = mp.j.b(cws.jE, "_double", $$1, this.c);
      this.b.accept(e(cws.jE, $$2, $$3, $$4));
      this.b.accept(c(cws.jR, mp.c.a(cws.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cnb.sn);
      this.b
         .accept(
            me.a(cws.fs)
               .a(mi.a().a(mj.c, mq.G(cws.fs)))
               .a(md.a().a(djx.k, true), mi.a().a(mj.c, mq.a(cws.fs, "_bottle0")))
               .a(md.a().a(djx.l, true), mi.a().a(mj.c, mq.a(cws.fs, "_bottle1")))
               .a(md.a().a(djx.m, true), mi.a().a(mj.c, mq.a(cws.fs, "_bottle2")))
               .a(md.a().a(djx.k, false), mi.a().a(mj.c, mq.a(cws.fs, "_empty0")))
               .a(md.a().a(djx.l, false), mi.a().a(mj.c, mq.a(cws.fs, "_empty1")))
               .a(md.a().a(djx.m, false), mi.a().a(mj.c, mq.a(cws.fs, "_empty2")))
         );
   }

   private void u(cwq $$0) {
      ahg $$1 = mp.bp.a($$0, mq.b($$0), this.c);
      ahg $$2 = mn.a("mushroom_block_inside");
      this.b
         .accept(
            me.a($$0)
               .a(md.a().a(djx.L, true), mi.a().a(mj.c, $$1))
               .a(md.a().a(djx.M, true), mi.a().a(mj.c, $$1).a(mj.b, mj.a.b).a(mj.d, true))
               .a(md.a().a(djx.N, true), mi.a().a(mj.c, $$1).a(mj.b, mj.a.c).a(mj.d, true))
               .a(md.a().a(djx.O, true), mi.a().a(mj.c, $$1).a(mj.b, mj.a.d).a(mj.d, true))
               .a(md.a().a(djx.J, true), mi.a().a(mj.c, $$1).a(mj.a, mj.a.d).a(mj.d, true))
               .a(md.a().a(djx.K, true), mi.a().a(mj.c, $$1).a(mj.a, mj.a.b).a(mj.d, true))
               .a(md.a().a(djx.L, false), mi.a().a(mj.c, $$2))
               .a(md.a().a(djx.M, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, false))
               .a(md.a().a(djx.N, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, false))
               .a(md.a().a(djx.O, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, false))
               .a(md.a().a(djx.J, false), mi.a().a(mj.c, $$2).a(mj.a, mj.a.d).a(mj.d, false))
               .a(md.a().a(djx.K, false), mi.a().a(mj.c, $$2).a(mj.a, mj.a.b).a(mj.d, false))
         );
      this.a($$0, ms.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cnb.ry);
      this.b
         .accept(
            mf.a(cws.eg)
               .a(
                  mg.a(djx.ay)
                     .a(0, mi.a().a(mj.c, mn.a(cws.eg)))
                     .a(1, mi.a().a(mj.c, mn.a(cws.eg, "_slice1")))
                     .a(2, mi.a().a(mj.c, mn.a(cws.eg, "_slice2")))
                     .a(3, mi.a().a(mj.c, mn.a(cws.eg, "_slice3")))
                     .a(4, mi.a().a(mj.c, mn.a(cws.eg, "_slice4")))
                     .a(5, mi.a().a(mj.c, mn.a(cws.eg, "_slice5")))
                     .a(6, mi.a().a(mj.c, mn.a(cws.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mq $$0 = new mq()
         .a(mr.c, mq.a(cws.nX, "_side3"))
         .a(mr.o, mq.G(cws.t))
         .a(mr.n, mq.a(cws.nX, "_top"))
         .a(mr.j, mq.a(cws.nX, "_side3"))
         .a(mr.l, mq.a(cws.nX, "_side3"))
         .a(mr.k, mq.a(cws.nX, "_side1"))
         .a(mr.m, mq.a(cws.nX, "_side2"));
      this.b.accept(c(cws.nX, mp.a.a(cws.nX, $$0, this.c)));
   }

   private void y() {
      mq $$0 = new mq()
         .a(mr.c, mq.a(cws.ob, "_front"))
         .a(mr.o, mq.a(cws.ob, "_bottom"))
         .a(mr.n, mq.a(cws.ob, "_top"))
         .a(mr.j, mq.a(cws.ob, "_front"))
         .a(mr.k, mq.a(cws.ob, "_front"))
         .a(mr.l, mq.a(cws.ob, "_side"))
         .a(mr.m, mq.a(cws.ob, "_side"));
      this.b.accept(c(cws.ob, mp.a.a(cws.ob, $$0, this.c)));
   }

   private void a(cwq $$0, cwq $$1, BiFunction<cwq, cwq, mq> $$2) {
      mq $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mp.a.a($$0, $$3, this.c)));
   }

   public void b(cwq $$0) {
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
      mq $$0 = mq.k(cws.eZ);
      this.b.accept(c(cws.eZ, mn.a(cws.eZ)));
      this.a(cws.ee, $$0);
      this.a(cws.ef, $$0);
   }

   private void a(cwq $$0, mq $$1) {
      ahg $$2 = mp.p.a($$0, $$1.c(mr.g, mq.G($$0)), this.c);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cnb.so);
      this.m(cws.ft);
      this.b.accept(c(cws.fv, mp.bs.a(cws.fv, mq.j(mq.a(cws.H, "_still")), this.c)));
      this.b
         .accept(
            mf.a(cws.fu)
               .a(
                  mg.a(day.g)
                     .a(1, mi.a().a(mj.c, mp.bq.a(cws.fu, "_level1", mq.j(mq.a(cws.G, "_still")), this.c)))
                     .a(2, mi.a().a(mj.c, mp.br.a(cws.fu, "_level2", mq.j(mq.a(cws.G, "_still")), this.c)))
                     .a(3, mi.a().a(mj.c, mp.bs.a(cws.fu, "_full", mq.j(mq.a(cws.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mf.a(cws.fw)
               .a(
                  mg.a(day.g)
                     .a(1, mi.a().a(mj.c, mp.bq.a(cws.fw, "_level1", mq.j(mq.G(cws.qP)), this.c)))
                     .a(2, mi.a().a(mj.c, mp.br.a(cws.fw, "_level2", mq.j(mq.G(cws.qP)), this.c)))
                     .a(3, mi.a().a(mj.c, mp.bs.a(cws.fw, "_full", mq.j(mq.G(cws.qP)), this.c)))
               )
         );
   }

   private void B() {
      mq $$0 = mq.b(cws.kv);
      ahg $$1 = mp.aE.a(cws.kv, $$0, this.c);
      ahg $$2 = this.a(cws.kv, "_dead", mp.aE, $$1x -> $$0.c(mr.b, $$1x));
      this.b.accept(mf.a(cws.kv).a(a(djx.au, 5, $$2, $$1)));
   }

   private void C() {
      ahg $$0 = mn.a(cws.tq);
      ahg $$1 = mn.a(cws.tq, "_triggered");
      ahg $$2 = mn.a(cws.tq, "_crafting");
      ahg $$3 = mn.a(cws.tq, "_crafting_triggered");
      this.b
         .accept(
            mf.a(cws.tq)
               .a(mg.a(djx.T).a($$0x -> this.a($$0x, mi.a())))
               .a(
                  mg.a(djx.A, cyj.b)
                     .a(false, false, mi.a().a(mj.c, $$0))
                     .a(true, true, mi.a().a(mj.c, $$3))
                     .a(true, false, mi.a().a(mj.c, $$1))
                     .a(false, true, mi.a().a(mj.c, $$2))
               )
         );
   }

   private void v(cwq $$0) {
      mq $$1 = new mq().a(mr.f, mq.a(cws.cD, "_top")).a(mr.i, mq.a(cws.cD, "_side")).a(mr.g, mq.a($$0, "_front"));
      mq $$2 = new mq().a(mr.i, mq.a(cws.cD, "_top")).a(mr.g, mq.a($$0, "_front_vertical"));
      ahg $$3 = mp.p.a($$0, $$1, this.c);
      ahg $$4 = mp.r.a($$0, $$2, this.c);
      this.b
         .accept(
            mf.a($$0)
               .a(
                  mg.a(djx.P)
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
      ahg $$0 = mn.a(cws.fy);
      ahg $$1 = mn.a(cws.fy, "_filled");
      this.b.accept(mf.a(cws.fy).a(mg.a(djx.h).a(false, mi.a().a(mj.c, $$0)).a(true, mi.a().a(mj.c, $$1))).a(c()));
   }

   private void E() {
      ahg $$0 = mn.a(cws.ku, "_side");
      ahg $$1 = mn.a(cws.ku, "_noside");
      ahg $$2 = mn.a(cws.ku, "_noside1");
      ahg $$3 = mn.a(cws.ku, "_noside2");
      ahg $$4 = mn.a(cws.ku, "_noside3");
      this.b
         .accept(
            me.a(cws.ku)
               .a(md.a().a(djx.L, true), mi.a().a(mj.c, $$0))
               .a(md.a().a(djx.M, true), mi.a().a(mj.c, $$0).a(mj.b, mj.a.b).a(mj.d, true))
               .a(md.a().a(djx.N, true), mi.a().a(mj.c, $$0).a(mj.b, mj.a.c).a(mj.d, true))
               .a(md.a().a(djx.O, true), mi.a().a(mj.c, $$0).a(mj.b, mj.a.d).a(mj.d, true))
               .a(md.a().a(djx.J, true), mi.a().a(mj.c, $$0).a(mj.a, mj.a.d).a(mj.d, true))
               .a(md.a().a(djx.K, true), mi.a().a(mj.c, $$0).a(mj.a, mj.a.b).a(mj.d, true))
               .a(md.a().a(djx.L, false), mi.a().a(mj.c, $$1).a(mj.e, 2), mi.a().a(mj.c, $$2), mi.a().a(mj.c, $$3), mi.a().a(mj.c, $$4))
               .a(
                  md.a().a(djx.M, false),
                  mi.a().a(mj.c, $$2).a(mj.b, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.b, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$4).a(mj.b, mj.a.b).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.b, mj.a.b).a(mj.d, true)
               )
               .a(
                  md.a().a(djx.N, false),
                  mi.a().a(mj.c, $$3).a(mj.b, mj.a.c).a(mj.d, true),
                  mi.a().a(mj.c, $$4).a(mj.b, mj.a.c).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.b, mj.a.c).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.b, mj.a.c).a(mj.d, true)
               )
               .a(
                  md.a().a(djx.O, false),
                  mi.a().a(mj.c, $$4).a(mj.b, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.b, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.b, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.b, mj.a.d).a(mj.d, true)
               )
               .a(
                  md.a().a(djx.J, false),
                  mi.a().a(mj.c, $$1).a(mj.e, 2).a(mj.a, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$4).a(mj.a, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$2).a(mj.a, mj.a.d).a(mj.d, true),
                  mi.a().a(mj.c, $$3).a(mj.a, mj.a.d).a(mj.d, true)
               )
               .a(
                  md.a().a(djx.K, false),
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
            me.a(cws.pc)
               .a(mi.a().a(mj.c, mq.G(cws.pc)))
               .a(md.a().a(djx.aL, 1), mi.a().a(mj.c, mq.a(cws.pc, "_contents1")))
               .a(md.a().a(djx.aL, 2), mi.a().a(mj.c, mq.a(cws.pc, "_contents2")))
               .a(md.a().a(djx.aL, 3), mi.a().a(mj.c, mq.a(cws.pc, "_contents3")))
               .a(md.a().a(djx.aL, 4), mi.a().a(mj.c, mq.a(cws.pc, "_contents4")))
               .a(md.a().a(djx.aL, 5), mi.a().a(mj.c, mq.a(cws.pc, "_contents5")))
               .a(md.a().a(djx.aL, 6), mi.a().a(mj.c, mq.a(cws.pc, "_contents6")))
               .a(md.a().a(djx.aL, 7), mi.a().a(mj.c, mq.a(cws.pc, "_contents7")))
               .a(md.a().a(djx.aL, 8), mi.a().a(mj.c, mq.a(cws.pc, "_contents_ready")))
         );
   }

   private void w(cwq $$0) {
      ahg $$1 = mp.c.a($$0, mq.a($$0), this.c);
      ahg $$2 = this.a($$0, "_powered", mp.c, mq::b);
      ahg $$3 = this.a($$0, "_lit", mp.c, mq::b);
      ahg $$4 = this.a($$0, "_lit_powered", mp.c, mq::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private mc a(cwq $$0, ahg $$1, ahg $$2, ahg $$3, ahg $$4) {
      return mf.a($$0).a(mg.a(djx.r, djx.w).a(($$4x, $$5) -> $$4x ? mi.a().a(mj.c, $$5 ? $$4 : $$2) : mi.a().a(mj.c, $$5 ? $$3 : $$1)));
   }

   private void i(cwq $$0, cwq $$1) {
      ahg $$2 = mn.a($$0);
      ahg $$3 = mn.a($$0, "_powered");
      ahg $$4 = mn.a($$0, "_lit");
      ahg $$5 = mn.a($$0, "_lit_powered");
      this.a($$1, mn.a($$0.k()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(cwq $$0) {
      this.c($$0);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mp.ao.a($$0, mq.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(cws.qy);
      this.x(cws.qx);
      this.x(cws.qw);
      this.x(cws.qv);
   }

   private void H() {
      this.c(cws.st);
      mg.b<ic, dke> $$0 = mg.a(djx.bm, djx.bn);

      for (dke $$1 : dke.values()) {
         $$0.a(ic.b, $$1, this.a(ic.b, $$1));
      }

      for (dke $$2 : dke.values()) {
         $$0.a(ic.a, $$2, this.a(ic.a, $$2));
      }

      this.b.accept(mf.a(cws.st).a($$0));
   }

   private mi a(ic $$0, dke $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mq $$3 = mq.c(mq.a(cws.st, $$2));
      return mi.a().a(mj.c, mp.an.a(cws.st, $$2, $$3, this.c));
   }

   private void y(cwq $$0) {
      mq $$1 = new mq().a(mr.e, mq.G(cws.dV)).a(mr.f, mq.G($$0)).a(mr.i, mq.a($$0, "_side"));
      this.b.accept(c($$0, mp.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ahg $$0 = mq.a(cws.gZ, "_side");
      mq $$1 = new mq().a(mr.f, mq.a(cws.gZ, "_top")).a(mr.i, $$0);
      mq $$2 = new mq().a(mr.f, mq.a(cws.gZ, "_inverted_top")).a(mr.i, $$0);
      this.b
         .accept(
            mf.a(cws.gZ)
               .a(mg.a(djx.p).a(false, mi.a().a(mj.c, mp.aF.a(cws.gZ, $$1, this.c))).a(true, mi.a().a(mj.c, mp.aF.a(mn.a(cws.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(cwq $$0) {
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mn.a($$0))).a(this.n()));
   }

   private void J() {
      cwq $$0 = cws.ss;
      ahg $$1 = mn.a($$0, "_on");
      ahg $$2 = mn.a($$0);
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mn.a($$0))).a(this.n()).a(a(djx.w, $$1, $$2)));
   }

   private void K() {
      mq $$0 = new mq().a(mr.B, mq.G(cws.j)).a(mr.f, mq.G(cws.cC));
      mq $$1 = new mq().a(mr.B, mq.G(cws.j)).a(mr.f, mq.a(cws.cC, "_moist"));
      ahg $$2 = mp.aW.a(cws.cC, $$0, this.c);
      ahg $$3 = mp.aW.a(mq.a(cws.cC, "_moist"), $$1, this.c);
      this.b.accept(mf.a(cws.cC).a(a(djx.aQ, 7, $$3, $$2)));
   }

   private List<ahg> A(cwq $$0) {
      ahg $$1 = mp.aX.a(mn.a($$0, "_floor0"), mq.v($$0), this.c);
      ahg $$2 = mp.aX.a(mn.a($$0, "_floor1"), mq.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ahg> B(cwq $$0) {
      ahg $$1 = mp.aY.a(mn.a($$0, "_side0"), mq.v($$0), this.c);
      ahg $$2 = mp.aY.a(mn.a($$0, "_side1"), mq.w($$0), this.c);
      ahg $$3 = mp.aZ.a(mn.a($$0, "_side_alt0"), mq.v($$0), this.c);
      ahg $$4 = mp.aZ.a(mn.a($$0, "_side_alt1"), mq.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ahg> C(cwq $$0) {
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
      md $$0 = md.a().a(djx.L, false).a(djx.M, false).a(djx.N, false).a(djx.O, false).a(djx.J, false);
      List<ahg> $$1 = this.A(cws.cr);
      List<ahg> $$2 = this.B(cws.cr);
      List<ahg> $$3 = this.C(cws.cr);
      this.b
         .accept(
            me.a(cws.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(md.b(md.a().a(djx.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(md.b(md.a().a(djx.M, true), $$0), a($$2, $$0x -> $$0x.a(mj.b, mj.a.b)))
               .a(md.b(md.a().a(djx.N, true), $$0), a($$2, $$0x -> $$0x.a(mj.b, mj.a.c)))
               .a(md.b(md.a().a(djx.O, true), $$0), a($$2, $$0x -> $$0x.a(mj.b, mj.a.d)))
               .a(md.a().a(djx.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ahg> $$0 = this.A(cws.cs);
      List<ahg> $$1 = this.B(cws.cs);
      this.b
         .accept(
            me.a(cws.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mj.b, mj.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mj.b, mj.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mj.b, mj.a.d)))
         );
   }

   private void D(cwq $$0) {
      ahg $$1 = ms.t.create($$0, this.c);
      ahg $$2 = ms.u.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(mf.a($$0).a(a(djx.j, $$2, $$1)));
   }

   private void N() {
      mq $$0 = mq.a(mq.a(cws.ad, "_side"), mq.a(cws.ad, "_top"));
      ahg $$1 = mp.j.a(cws.ad, $$0, this.c);
      this.b.accept(d(cws.ad, $$1));
   }

   private void O() {
      this.a(cnb.ad);
      cwq $$0 = cws.E;
      mg.b<Boolean, Integer> $$1 = mg.a(dbk.d, dbk.b);
      ahg $$2 = mn.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ahg $$4 = mn.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, mi.a().a(mj.c, $$4));
         $$1.a(false, $$3, mi.a().a(mj.c, $$2));
      }

      this.b.accept(mf.a(cws.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mf.a(cws.kI)
               .a(
                  mg.a(djx.as)
                     .a(0, mi.a().a(mj.c, this.a(cws.kI, "_0", mp.c, mq::b)))
                     .a(1, mi.a().a(mj.c, this.a(cws.kI, "_1", mp.c, mq::b)))
                     .a(2, mi.a().a(mj.c, this.a(cws.kI, "_2", mp.c, mq::b)))
                     .a(3, mi.a().a(mj.c, this.a(cws.kI, "_3", mp.c, mq::b)))
               )
         );
   }

   private void Q() {
      ahg $$0 = mq.G(cws.j);
      mq $$1 = new mq().a(mr.e, $$0).b(mr.e, mr.c).a(mr.f, mq.a(cws.i, "_top")).a(mr.i, mq.a(cws.i, "_snow"));
      mi $$2 = mi.a().a(mj.c, mp.n.a(cws.i, "_snow", $$1, this.c));
      this.a(cws.i, mn.a(cws.i), $$2);
      ahg $$3 = ms.f.get(cws.fl).a($$1x -> $$1x.a(mr.e, $$0)).a(cws.fl, this.c);
      this.a(cws.fl, $$3, $$2);
      ahg $$4 = ms.f.get(cws.l).a($$1x -> $$1x.a(mr.e, $$0)).a(cws.l, this.c);
      this.a(cws.l, $$4, $$2);
   }

   private void a(cwq $$0, ahg $$1, mi $$2) {
      List<mi> $$3 = Arrays.asList(a($$1));
      this.b.accept(mf.a($$0).a(mg.a(djx.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cnb.re);
      this.b
         .accept(
            mf.a(cws.fC)
               .a(
                  mg.a(djx.ar)
                     .a(0, mi.a().a(mj.c, mn.a(cws.fC, "_stage0")))
                     .a(1, mi.a().a(mj.c, mn.a(cws.fC, "_stage1")))
                     .a(2, mi.a().a(mj.c, mn.a(cws.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cws.kE, mn.a(cws.kE)));
   }

   private void j(cwq $$0, cwq $$1) {
      mq $$2 = mq.b($$1);
      ahg $$3 = mp.Y.a($$0, $$2, this.c);
      ahg $$4 = mp.Z.a($$0, $$2, this.c);
      this.b.accept(mf.a($$0).a(a(djx.aT, 1, $$4, $$3)));
   }

   private void T() {
      ahg $$0 = mn.a(cws.hc);
      ahg $$1 = mn.a(cws.hc, "_side");
      this.a(cnb.lQ);
      this.b
         .accept(
            mf.a(cws.hc)
               .a(
                  mg.a(djx.Q)
                     .a(ic.a, mi.a().a(mj.c, $$0))
                     .a(ic.c, mi.a().a(mj.c, $$1))
                     .a(ic.f, mi.a().a(mj.c, $$1).a(mj.b, mj.a.b))
                     .a(ic.d, mi.a().a(mj.c, $$1).a(mj.b, mj.a.c))
                     .a(ic.e, mi.a().a(mj.c, $$1).a(mj.b, mj.a.d))
               )
         );
   }

   private void k(cwq $$0, cwq $$1) {
      ahg $$2 = mn.a($$0);
      this.b.accept(mf.a($$1, mi.a().a(mj.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ahg $$0 = mn.a(cws.eW, "_post_ends");
      ahg $$1 = mn.a(cws.eW, "_post");
      ahg $$2 = mn.a(cws.eW, "_cap");
      ahg $$3 = mn.a(cws.eW, "_cap_alt");
      ahg $$4 = mn.a(cws.eW, "_side");
      ahg $$5 = mn.a(cws.eW, "_side_alt");
      this.b
         .accept(
            me.a(cws.eW)
               .a(mi.a().a(mj.c, $$0))
               .a(md.a().a(djx.L, false).a(djx.M, false).a(djx.N, false).a(djx.O, false), mi.a().a(mj.c, $$1))
               .a(md.a().a(djx.L, true).a(djx.M, false).a(djx.N, false).a(djx.O, false), mi.a().a(mj.c, $$2))
               .a(md.a().a(djx.L, false).a(djx.M, true).a(djx.N, false).a(djx.O, false), mi.a().a(mj.c, $$2).a(mj.b, mj.a.b))
               .a(md.a().a(djx.L, false).a(djx.M, false).a(djx.N, true).a(djx.O, false), mi.a().a(mj.c, $$3))
               .a(md.a().a(djx.L, false).a(djx.M, false).a(djx.N, false).a(djx.O, true), mi.a().a(mj.c, $$3).a(mj.b, mj.a.b))
               .a(md.a().a(djx.L, true), mi.a().a(mj.c, $$4))
               .a(md.a().a(djx.M, true), mi.a().a(mj.c, $$4).a(mj.b, mj.a.b))
               .a(md.a().a(djx.N, true), mi.a().a(mj.c, $$5))
               .a(md.a().a(djx.O, true), mi.a().a(mj.c, $$5).a(mj.b, mj.a.b))
         );
      this.d(cws.eW);
   }

   private void E(cwq $$0) {
      this.b.accept(mf.a($$0, mi.a().a(mj.c, mn.a($$0))).a(b()));
   }

   private void V() {
      ahg $$0 = mn.a(cws.dw);
      ahg $$1 = mn.a(cws.dw, "_on");
      this.d(cws.dw);
      this.b
         .accept(
            mf.a(cws.dw)
               .a(a(djx.w, $$0, $$1))
               .a(
                  mg.a(djx.U, djx.R)
                     .a(djs.c, ic.c, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.c))
                     .a(djs.c, ic.f, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.d))
                     .a(djs.c, ic.d, mi.a().a(mj.a, mj.a.c))
                     .a(djs.c, ic.e, mi.a().a(mj.a, mj.a.c).a(mj.b, mj.a.b))
                     .a(djs.a, ic.c, mi.a())
                     .a(djs.a, ic.f, mi.a().a(mj.b, mj.a.b))
                     .a(djs.a, ic.d, mi.a().a(mj.b, mj.a.c))
                     .a(djs.a, ic.e, mi.a().a(mj.b, mj.a.d))
                     .a(djs.b, ic.c, mi.a().a(mj.a, mj.a.b))
                     .a(djs.b, ic.f, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.b))
                     .a(djs.b, ic.d, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.c))
                     .a(djs.b, ic.e, mi.a().a(mj.a, mj.a.b).a(mj.b, mj.a.d))
               )
         );
   }

   private void W() {
      this.d(cws.fm);
      this.b.accept(b(cws.fm, mn.a(cws.fm)));
   }

   private void X() {
      this.d(cws.tn);
      this.b.accept(c(cws.tn, mn.a(cws.tn)));
   }

   private void Y() {
      this.b.accept(mf.a(cws.ed).a(mg.a(djx.H).a(ic.a.a, mi.a().a(mj.c, mn.a(cws.ed, "_ns"))).a(ic.a.c, mi.a().a(mj.c, mn.a(cws.ed, "_ew")))));
   }

   private void Z() {
      ahg $$0 = ms.a.create(cws.dV, this.c);
      this.b
         .accept(
            mf.a(
               cws.dV,
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
      ahg $$0 = mn.a(cws.kO);
      ahg $$1 = mn.a(cws.kO, "_on");
      this.b.accept(mf.a(cws.kO).a(a(djx.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mq $$0 = new mq().a(mr.e, mq.a(cws.by, "_bottom")).a(mr.i, mq.a(cws.by, "_side"));
      ahg $$1 = mq.a(cws.by, "_top_sticky");
      ahg $$2 = mq.a(cws.by, "_top");
      mq $$3 = $$0.c(mr.E, $$1);
      mq $$4 = $$0.c(mr.E, $$2);
      ahg $$5 = mn.a(cws.by, "_base");
      this.a(cws.by, $$5, $$4);
      this.a(cws.br, $$5, $$3);
      ahg $$6 = mp.n.a(cws.by, "_inventory", $$0.c(mr.f, $$2), this.c);
      ahg $$7 = mp.n.a(cws.br, "_inventory", $$0.c(mr.f, $$1), this.c);
      this.a(cws.by, $$6);
      this.a(cws.br, $$7);
   }

   private void a(cwq $$0, ahg $$1, mq $$2) {
      ahg $$3 = mp.bh.a($$0, $$2, this.c);
      this.b.accept(mf.a($$0).a(a(djx.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mq $$0 = new mq().a(mr.F, mq.a(cws.by, "_top")).a(mr.i, mq.a(cws.by, "_side"));
      mq $$1 = $$0.c(mr.E, mq.a(cws.by, "_top_sticky"));
      mq $$2 = $$0.c(mr.E, mq.a(cws.by, "_top"));
      this.b
         .accept(
            mf.a(cws.bz)
               .a(
                  mg.a(djx.x, djx.bg)
                     .a(false, dkj.a, mi.a().a(mj.c, mp.bi.a(cws.by, "_head", $$2, this.c)))
                     .a(false, dkj.b, mi.a().a(mj.c, mp.bi.a(cws.by, "_head_sticky", $$1, this.c)))
                     .a(true, dkj.a, mi.a().a(mj.c, mp.bj.a(cws.by, "_head_short", $$2, this.c)))
                     .a(true, dkj.b, mi.a().a(mj.c, mp.bj.a(cws.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      cwq $$0 = cws.tr;
      mq $$1 = mq.a($$0, "_side_inactive", "_top_inactive");
      mq $$2 = mq.a($$0, "_side_active", "_top_active");
      mq $$3 = mq.a($$0, "_side_active", "_top_ejecting_reward");
      ahg $$4 = mp.o.a($$0, $$1, this.c);
      ahg $$5 = mp.o.a($$0, "_active", $$2, this.c);
      ahg $$6 = mp.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(mf.a($$0).a(mg.a(djx.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> mi.a().a(mj.c, $$4);
            case b, c, d -> mi.a().a(mj.c, $$5);
            case e -> mi.a().a(mj.c, $$6);
         };
      })));
   }

   private void ae() {
      ahg $$0 = mn.a(cws.qQ, "_inactive");
      ahg $$1 = mn.a(cws.qQ, "_active");
      this.a(cws.qQ, $$0);
      this.b.accept(mf.a(cws.qQ).a(mg.a(djx.bo).a($$2 -> mi.a().a(mj.c, $$2 != dko.b && $$2 != dko.c ? $$0 : $$1))));
   }

   private void af() {
      ahg $$0 = mn.a(cws.qR, "_inactive");
      ahg $$1 = mn.a(cws.qR, "_active");
      this.a(cws.qR, $$0);
      this.b.accept(mf.a(cws.qR).a(mg.a(djx.bo).a($$2 -> mi.a().a(mj.c, $$2 != dko.b && $$2 != dko.c ? $$0 : $$1))).a(b()));
   }

   private void ag() {
      ahg $$0 = mp.bM.a(cws.qV, mq.a(false), this.c);
      ahg $$1 = mp.bM.a(cws.qV, "_can_summon", mq.a(true), this.c);
      this.a(cws.qV, $$0);
      this.b.accept(mf.a(cws.qV).a(a(djx.G, $$1, $$0)));
   }

   private void ah() {
      ahg $$0 = mn.a(cws.nS, "_stable");
      ahg $$1 = mn.a(cws.nS, "_unstable");
      this.a(cws.nS, $$0);
      this.b.accept(mf.a(cws.nS).a(a(djx.b, $$1, $$0)));
   }

   private void ai() {
      ahg $$0 = this.a(cws.sv, "", mp.ao, mq::c);
      ahg $$1 = this.a(cws.sv, "_lit", mp.ao, mq::c);
      this.b.accept(mf.a(cws.sv).a(a(djx.D, $$1, $$0)));
      ahg $$2 = this.a(cws.sw, "", mp.ao, mq::c);
      ahg $$3 = this.a(cws.sw, "_lit", mp.ao, mq::c);
      this.b.accept(mf.a(cws.sw).a(a(djx.D, $$3, $$2)));
   }

   private void aj() {
      ahg $$0 = ms.a.create(cws.fB, this.c);
      ahg $$1 = this.a(cws.fB, "_on", mp.c, mq::b);
      this.b.accept(mf.a(cws.fB).a(a(djx.r, $$1, $$0)));
   }

   private void l(cwq $$0, cwq $$1) {
      mq $$2 = mq.y($$0);
      this.b.accept(c($$0, mp.bf.a($$0, $$2, this.c)));
      this.b.accept(mf.a($$1, mi.a().a(mj.c, mp.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ak() {
      mq $$0 = mq.y(cws.dK);
      mq $$1 = mq.i(mq.a(cws.dK, "_off"));
      ahg $$2 = mp.bf.a(cws.dK, $$0, this.c);
      ahg $$3 = mp.bf.a(cws.dK, "_off", $$1, this.c);
      this.b.accept(mf.a(cws.dK).a(a(djx.r, $$2, $$3)));
      ahg $$4 = mp.bg.a(cws.dL, $$0, this.c);
      ahg $$5 = mp.bg.a(cws.dL, "_off", $$1, this.c);
      this.b.accept(mf.a(cws.dL).a(a(djx.r, $$4, $$5)).a(d()));
      this.d(cws.dK);
      this.c(cws.dL);
   }

   private void al() {
      this.a(cnb.lJ);
      this.b.accept(mf.a(cws.eh).a(mg.a(djx.aA, djx.s, djx.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return mi.a().a(mj.c, mq.a(cws.eh, $$3.toString()));
      })).a(c()));
   }

   private void am() {
      this.a(cnb.cS);
      this.b
         .accept(
            mf.a(cws.mV)
               .a(
                  mg.a(djx.aS, djx.C)
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
      mq $$0 = mq.a(cws.dN);
      ahg $$1 = mp.c.a(cws.dP, $$0, this.c);
      this.b.accept(mf.a(cws.dN).a(mg.a(djx.aF).a($$1x -> mi.a().a(mj.c, $$1x < 8 ? mn.a(cws.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cws.dN, mn.a(cws.dN, "_height2"));
      this.b.accept(c(cws.dP, $$1));
   }

   private void ao() {
      this.b.accept(mf.a(cws.oc, mi.a().a(mj.c, mn.a(cws.oc))).a(b()));
   }

   private void ap() {
      ahg $$0 = ms.a.create(cws.pa, this.c);
      this.a(cws.pa, $$0);
      this.b.accept(mf.a(cws.pa).a(mg.a(djx.bj).a($$0x -> mi.a().a(mj.c, this.a(cws.pa, "_" + $$0x.c(), mp.c, mq::b)))));
   }

   private void aq() {
      this.a(cnb.wi);
      this.b.accept(mf.a(cws.oi).a(mg.a(djx.as).a($$0 -> mi.a().a(mj.c, this.a(cws.oi, "_stage" + $$0, mp.ao, mq::c)))));
   }

   private void ar() {
      this.a(cnb.pp);
      this.b
         .accept(
            mf.a(cws.fI)
               .a(
                  mg.a(djx.a, djx.M, djx.L, djx.N, djx.O)
                     .a(false, false, false, false, false, mi.a().a(mj.c, mn.a(cws.fI, "_ns")))
                     .a(false, true, false, false, false, mi.a().a(mj.c, mn.a(cws.fI, "_n")).a(mj.b, mj.a.b))
                     .a(false, false, true, false, false, mi.a().a(mj.c, mn.a(cws.fI, "_n")))
                     .a(false, false, false, true, false, mi.a().a(mj.c, mn.a(cws.fI, "_n")).a(mj.b, mj.a.c))
                     .a(false, false, false, false, true, mi.a().a(mj.c, mn.a(cws.fI, "_n")).a(mj.b, mj.a.d))
                     .a(false, true, true, false, false, mi.a().a(mj.c, mn.a(cws.fI, "_ne")))
                     .a(false, true, false, true, false, mi.a().a(mj.c, mn.a(cws.fI, "_ne")).a(mj.b, mj.a.b))
                     .a(false, false, false, true, true, mi.a().a(mj.c, mn.a(cws.fI, "_ne")).a(mj.b, mj.a.c))
                     .a(false, false, true, false, true, mi.a().a(mj.c, mn.a(cws.fI, "_ne")).a(mj.b, mj.a.d))
                     .a(false, false, true, true, false, mi.a().a(mj.c, mn.a(cws.fI, "_ns")))
                     .a(false, true, false, false, true, mi.a().a(mj.c, mn.a(cws.fI, "_ns")).a(mj.b, mj.a.b))
                     .a(false, true, true, true, false, mi.a().a(mj.c, mn.a(cws.fI, "_nse")))
                     .a(false, true, false, true, true, mi.a().a(mj.c, mn.a(cws.fI, "_nse")).a(mj.b, mj.a.b))
                     .a(false, false, true, true, true, mi.a().a(mj.c, mn.a(cws.fI, "_nse")).a(mj.b, mj.a.c))
                     .a(false, true, true, false, true, mi.a().a(mj.c, mn.a(cws.fI, "_nse")).a(mj.b, mj.a.d))
                     .a(false, true, true, true, true, mi.a().a(mj.c, mn.a(cws.fI, "_nsew")))
                     .a(true, false, false, false, false, mi.a().a(mj.c, mn.a(cws.fI, "_attached_ns")))
                     .a(true, false, true, false, false, mi.a().a(mj.c, mn.a(cws.fI, "_attached_n")))
                     .a(true, false, false, true, false, mi.a().a(mj.c, mn.a(cws.fI, "_attached_n")).a(mj.b, mj.a.c))
                     .a(true, true, false, false, false, mi.a().a(mj.c, mn.a(cws.fI, "_attached_n")).a(mj.b, mj.a.b))
                     .a(true, false, false, false, true, mi.a().a(mj.c, mn.a(cws.fI, "_attached_n")).a(mj.b, mj.a.d))
                     .a(true, true, true, false, false, mi.a().a(mj.c, mn.a(cws.fI, "_attached_ne")))
                     .a(true, true, false, true, false, mi.a().a(mj.c, mn.a(cws.fI, "_attached_ne")).a(mj.b, mj.a.b))
                     .a(true, false, false, true, true, mi.a().a(mj.c, mn.a(cws.fI, "_attached_ne")).a(mj.b, mj.a.c))
                     .a(true, false, true, false, true, mi.a().a(mj.c, mn.a(cws.fI, "_attached_ne")).a(mj.b, mj.a.d))
                     .a(true, false, true, true, false, mi.a().a(mj.c, mn.a(cws.fI, "_attached_ns")))
                     .a(true, true, false, false, true, mi.a().a(mj.c, mn.a(cws.fI, "_attached_ns")).a(mj.b, mj.a.b))
                     .a(true, true, true, true, false, mi.a().a(mj.c, mn.a(cws.fI, "_attached_nse")))
                     .a(true, true, false, true, true, mi.a().a(mj.c, mn.a(cws.fI, "_attached_nse")).a(mj.b, mj.a.b))
                     .a(true, false, true, true, true, mi.a().a(mj.c, mn.a(cws.fI, "_attached_nse")).a(mj.b, mj.a.c))
                     .a(true, true, true, false, true, mi.a().a(mj.c, mn.a(cws.fI, "_attached_nse")).a(mj.b, mj.a.d))
                     .a(true, true, true, true, true, mi.a().a(mj.c, mn.a(cws.fI, "_attached_nsew")))
               )
         );
   }

   private void as() {
      this.d(cws.fH);
      this.b.accept(mf.a(cws.fH).a(mg.a(djx.a, djx.w).a(($$0, $$1) -> mi.a().a(mj.c, mq.a(cws.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
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
            return this.a($$0.intValue(), "", mq.b(mq.G(cws.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mq.b(mq.a(cws.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mq.b(mq.a(cws.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void at() {
      this.a(cnb.ko);
      this.b.accept(mf.a(cws.mf).a(mg.a(djx.aD, djx.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void au() {
      this.a(cnb.kp);
      Function<Integer, ahg> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mq $$2 = mq.a($$1);
         return mp.bw.a(cws.mg, $$1, $$2, this.c);
      };
      this.b.accept(mf.a(cws.mg).a(mg.a(ddx.c).a($$1 -> mi.a().a(mj.c, $$0.apply($$1)))));
   }

   private void F(cwq $$0) {
      this.d($$0);
      ahg $$1 = mn.a($$0);
      me $$2 = me.a($$0);
      md.c $$3 = ac.a(md.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<djy, Function<ahg, mi>> $$4 : a) {
         djy $$5 = (djy)$$4.getFirst();
         Function<ahg, mi> $$6 = (Function<ahg, mi>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(md.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void av() {
      ahg $$0 = mq.a(cws.qU, "_bottom");
      mq $$1 = new mq().a(mr.e, $$0).a(mr.f, mq.a(cws.qU, "_top")).a(mr.i, mq.a(cws.qU, "_side"));
      mq $$2 = new mq().a(mr.e, $$0).a(mr.f, mq.a(cws.qU, "_top_bloom")).a(mr.i, mq.a(cws.qU, "_side_bloom"));
      ahg $$3 = mp.n.a(cws.qU, "", $$1, this.c);
      ahg $$4 = mp.n.a(cws.qU, "_bloom", $$2, this.c);
      this.b.accept(mf.a(cws.qU).a(mg.a(djx.E).a($$2x -> mi.a().a(mj.c, $$2x ? $$4 : $$3))));
      this.a(cnb.gi, $$3);
   }

   private void aw() {
      cwq $$0 = cws.cm;
      ahg $$1 = mn.a($$0);
      me $$2 = me.a($$0);
      Map.of(ic.c, mj.a.a, ic.f, mj.a.b, ic.d, mj.a.c, ic.e, mj.a.d).forEach(($$2x, $$3) -> {
         md.c $$4 = md.a().a(djx.R, $$2x);
         $$2.a($$4, mi.a().a(mj.c, $$1).a(mj.b, $$3).a(mj.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mn.a($$0, "_inventory"));
      i.clear();
   }

   private void a(me $$0, md.c $$1, mj.a $$2) {
      List.of(Pair.of(djx.bp, mp.aM), Pair.of(djx.bq, mp.aN), Pair.of(djx.br, mp.aO), Pair.of(djx.bs, mp.aP), Pair.of(djx.bt, mp.aQ), Pair.of(djx.bu, mp.aR))
         .forEach($$3 -> {
            djy $$4 = (djy)$$3.getFirst();
            mo $$5 = (mo)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(me $$0, md.c $$1, mj.a $$2, djy $$3, mo $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mq $$7 = new mq().a(mr.b, mq.a(cws.cm, $$6));
      lz.d $$8 = new lz.d($$4, $$6);
      ahg $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cws.cm, $$6, $$7, this.c));
      $$0.a(md.a($$1, md.a().a($$3, $$5)), mi.a().a(mj.c, $$9).a(mj.b, $$2));
   }

   private void ax() {
      this.b.accept(c(cws.kJ, mp.c.a(cws.kJ, mq.b(mn.a("magma")), this.c)));
   }

   private void G(cwq $$0) {
      this.b($$0, ms.q);
      mp.bD.a(mn.a($$0.k()), mq.u($$0), this.c);
   }

   private void b(cwq $$0, cwq $$1, lz.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(cwq $$0, cwq $$1) {
      mp.bE.a(mn.a($$0.k()), mq.u($$1), this.c);
   }

   private void ay() {
      ahg $$0 = mn.a(cws.b);
      ahg $$1 = mn.a(cws.b, "_mirrored");
      this.b.accept(a(cws.eN, $$0, $$1));
      this.a(cws.eN, $$0);
   }

   private void az() {
      ahg $$0 = mn.a(cws.sJ);
      ahg $$1 = mn.a(cws.sJ, "_mirrored");
      this.b.accept(a(cws.td, $$0, $$1).a(f()));
      this.a(cws.td, $$0);
   }

   private void n(cwq $$0, cwq $$1) {
      this.a($$0, lz.e.b);
      mq $$2 = mq.d(mq.a($$0, "_pot"));
      ahg $$3 = lz.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aA() {
      ahg $$0 = mq.a(cws.pl, "_bottom");
      ahg $$1 = mq.a(cws.pl, "_top_off");
      ahg $$2 = mq.a(cws.pl, "_top");
      ahg[] $$3 = new ahg[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mq $$5 = new mq().a(mr.e, $$0).a(mr.f, $$4 == 0 ? $$1 : $$2).a(mr.i, mq.a(cws.pl, "_side" + $$4));
         $$3[$$4] = mp.n.a(cws.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mf.a(cws.pl).a(mg.a(djx.aZ).a($$1x -> mi.a().a(mj.c, $$3[$$1x]))));
      this.a(cnb.wG, $$3[0]);
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
      ahg $$0 = mq.a(cws.pb, "_top");
      ahg $$1 = mq.a(cws.pb, "_bottom");
      ahg $$2 = mq.a(cws.pb, "_side");
      ahg $$3 = mq.a(cws.pb, "_lock");
      mq $$4 = new mq().a(mr.o, $$2).a(mr.m, $$2).a(mr.l, $$2).a(mr.c, $$0).a(mr.j, $$0).a(mr.k, $$1).a(mr.n, $$3);
      ahg $$5 = mp.b.a(cws.pb, $$4, this.c);
      this.b.accept(mf.a(cws.pb, mi.a().a(mj.c, $$5)).a(mg.a(djx.T).a($$0x -> this.a($$0x, mi.a()))));
   }

   private void aC() {
      cwq $$0 = cws.n;
      ahg $$1 = mn.a($$0);
      ms $$2 = ms.a.get($$0);
      cwq $$3 = cws.jH;
      ahg $$4 = mp.ab.a($$3, $$2.b(), this.c);
      ahg $$5 = mp.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kg.a().filter(kh::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cws.rf).a(kg.w).a(cws.rf, cws.rD).a(cws.rj, cws.rn).a(kg.y);
      this.h(cws.re).a(kg.A).a(cws.re, cws.rC).a(cws.ri, cws.rm).a(kg.C);
      this.h(cws.rd).a(kg.E).a(cws.rd, cws.rB).a(cws.rh, cws.rl).a(kg.G);
      this.h(cws.rc).a(kg.I).a(cws.rc, cws.rA).a(cws.rg, cws.rk).a(kg.K);
      this.w(cws.sk);
      this.w(cws.sl);
      this.w(cws.sm);
      this.w(cws.sn);
      this.i(cws.sk, cws.so);
      this.i(cws.sl, cws.sp);
      this.i(cws.sm, cws.sq);
      this.i(cws.sn, cws.sr);
      this.m(cws.a);
      this.c(cws.nc, cws.a);
      this.c(cws.nb, cws.a);
      this.m(cws.fO);
      this.m(cws.dQ);
      this.c(cws.nd, cws.G);
      this.m(cws.fA);
      this.m(cws.me);
      this.m(cws.fr);
      this.m(cws.fR);
      this.a(cnb.tX);
      this.m(cws.pg);
      this.m(cws.G);
      this.m(cws.H);
      this.m(cws.hV);
      this.a(cnb.fR);
      this.o(cws.pM, cws.qd);
      this.o(cws.pN, cws.qe);
      this.o(cws.pO, cws.qf);
      this.o(cws.pP, cws.qg);
      this.o(cws.pQ, cws.qh);
      this.o(cws.pR, cws.qi);
      this.o(cws.pS, cws.qj);
      this.o(cws.pT, cws.qk);
      this.o(cws.pU, cws.ql);
      this.o(cws.pV, cws.qm);
      this.o(cws.pW, cws.qn);
      this.o(cws.pX, cws.qo);
      this.o(cws.pY, cws.qp);
      this.o(cws.pZ, cws.qq);
      this.o(cws.qa, cws.qr);
      this.o(cws.qb, cws.qs);
      this.o(cws.pL, cws.qc);
      this.m(cws.na);
      this.m(cws.gs);
      this.m(cws.qP);
      this.m(cws.sx);
      this.s(cws.sy);
      this.s(cws.sz);
      this.t(cws.ti);
      this.t(cws.tj);
      this.ai();
      this.g(cws.sC, cws.sA);
      this.p(cws.sB);
      this.a(cws.hW, cnb.hA);
      this.a(cnb.hA);
      this.aD();
      this.a(cws.kN, cnb.ja);
      this.a(cnb.ja);
      this.f(cws.bQ, mq.a(cws.by, "_side"));
      this.a(cws.R);
      this.a(cws.S);
      this.a(cws.iB);
      this.a(cws.cx);
      this.a(cws.cy);
      this.a(cws.cz);
      this.a(cws.fE);
      this.a(cws.fF);
      this.a(cws.fJ);
      this.a(cws.N);
      this.a(cws.T);
      this.a(cws.O);
      this.a(cws.ch);
      this.a(cws.P);
      this.a(cws.Q);
      this.a(cws.ci);
      this.b(cws.pj, ms.d);
      this.a(cws.pi);
      this.a(cws.aR);
      this.a(cws.aS);
      this.a(cws.aT);
      this.a(cws.hb);
      this.a(cws.dI);
      this.a(cws.dJ);
      this.a(cws.ha);
      this.a(cws.pC);
      this.a(cws.mW);
      this.a(cws.dR);
      this.a(cws.k);
      this.a(cws.pk);
      this.a(cws.fz);
      this.a(cws.ec);
      this.a(cws.L);
      this.a(cws.ph);
      this.a(cws.dO);
      this.b(cws.dT, ms.g);
      this.b(cws.pq, ms.d);
      this.b(cws.fa, ms.d);
      this.m(cws.ac);
      this.m(cws.ga);
      this.a(cws.kK);
      this.a(cws.aY);
      this.a(cws.iC);
      this.a(cws.co);
      this.a(cws.pK);
      this.a(cws.ii);
      this.a(cws.oy);
      this.a(cws.dW);
      this.a(cws.dX);
      this.b(cws.ct, ms.b);
      this.a(cws.aO);
      this.b(cws.bw, ms.v);
      this.a(cnb.cR);
      this.b(cws.ck, ms.f);
      this.b(cws.pd, ms.d);
      this.a(cws.op);
      this.a(cws.aP);
      this.a(cws.qt);
      this.a(cws.qu);
      this.a(cws.qN);
      this.a(cws.su);
      this.a(cws.tf);
      this.a(cws.tg);
      this.a(cws.th);
      this.e(cws.qS);
      this.aC();
      this.a(cws.ra);
      this.a(cws.rb);
      this.a(cws.qW);
      this.a(cws.qX);
      this.a(cws.qY);
      this.a(cws.qZ);
      this.k(cws.qW, cws.rw);
      this.k(cws.qX, cws.ry);
      this.k(cws.qY, cws.rx);
      this.k(cws.qZ, cws.rz);
      this.i(cws.rM);
      this.i(cws.rN);
      this.i(cws.rP);
      this.i(cws.rO);
      this.a(cws.rM, cws.rQ);
      this.a(cws.rN, cws.rR);
      this.a(cws.rP, cws.rT);
      this.a(cws.rO, cws.rS);
      this.k(cws.rU);
      this.k(cws.rV);
      this.k(cws.rX);
      this.k(cws.rW);
      this.b(cws.rU, cws.rY);
      this.b(cws.rV, cws.rZ);
      this.b(cws.rX, cws.sb);
      this.b(cws.rW, cws.sa);
      this.a(cws.sc);
      this.a(cws.sd);
      this.a(cws.se);
      this.a(cws.sf);
      this.k(cws.sc, cws.sg);
      this.k(cws.sd, cws.sh);
      this.k(cws.se, cws.si);
      this.k(cws.sf, cws.sj);
      this.j(cws.gW, cws.ch);
      this.j(cws.gX, cws.ci);
      this.G();
      this.r();
      this.aw();
      this.v();
      this.w();
      this.a(cws.og, cws.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(cws.kt);
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
      this.F(cws.ff);
      this.F(cws.fg);
      this.F(cws.qT);
      this.ax();
      this.aB();
      this.ae();
      this.af();
      this.ag();
      this.X();
      this.O();
      this.N();
      this.ad();
      this.E(cws.cO);
      this.d(cws.cO);
      this.E(cws.oa);
      this.g();
      this.E(cws.sE);
      this.l(cws.cp, cws.cq);
      this.l(cws.ea, cws.eb);
      this.a(cws.cA, cws.n, mq::c);
      this.a(cws.nY, cws.p, mq::d);
      this.y(cws.ow);
      this.y(cws.on);
      this.v(cws.aU);
      this.v(cws.hi);
      this.C();
      this.D(cws.oe);
      this.D(cws.of);
      this.e(cws.eX, mn.a(cws.eX));
      this.a(cws.dY, ms.d);
      this.a(cws.dZ, ms.d);
      this.a(cws.te);
      this.a(cws.kM, ms.d);
      this.f(cws.j);
      this.f(cws.sH);
      this.f(cws.I);
      this.g(cws.J);
      this.g(cws.M);
      this.f(cws.K);
      this.e(cws.F);
      this.b(cws.to, ms.f);
      this.a(cws.ij, ms.d, ms.e);
      this.a(cws.kx, ms.w, ms.x);
      this.a(cws.hf, ms.w, ms.x);
      this.a(cws.tk, ms.d, ms.e);
      this.a(cws.tl, ms.d, ms.e);
      this.a(cws.tm, ms.d, ms.e);
      this.c(cws.nT, ms.i);
      this.z();
      this.a(cws.pe, mq::A);
      this.a(cws.pf, mq::C);
      this.a(cws.kD, djx.as, 0, 1, 2, 3);
      this.a(cws.gt, djx.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cws.fq, djx.as, 0, 1, 1, 2);
      this.a(cws.gu, djx.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cws.cB, djx.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cws.kA, lz.e.b, djx.aq, 0, 1);
      this.i();
      this.h();
      this.a(mn.a("decorated_pot"), cws.iA).b(cws.tp);
      this.a(mn.a("banner"), cws.n)
         .a(mp.bF, cws.iJ, cws.iK, cws.iL, cws.iM, cws.iN, cws.iO, cws.iP, cws.iQ, cws.iR, cws.iS, cws.iT, cws.iU, cws.iV, cws.iW, cws.iX, cws.iY)
         .b(cws.iZ, cws.ja, cws.jb, cws.jc, cws.jd, cws.je, cws.jf, cws.jg, cws.jh, cws.ji, cws.jj, cws.jk, cws.jl, cws.jm, cws.jn, cws.jo);
      this.a(mn.a("bed"), cws.n)
         .b(cws.aZ, cws.ba, cws.bb, cws.bc, cws.bd, cws.be, cws.bf, cws.bg, cws.bh, cws.bi, cws.bj, cws.bk, cws.bl, cws.bm, cws.bn, cws.bo);
      this.m(cws.aZ, cws.bA);
      this.m(cws.ba, cws.bB);
      this.m(cws.bb, cws.bC);
      this.m(cws.bc, cws.bD);
      this.m(cws.bd, cws.bE);
      this.m(cws.be, cws.bF);
      this.m(cws.bf, cws.bG);
      this.m(cws.bg, cws.bH);
      this.m(cws.bh, cws.bI);
      this.m(cws.bi, cws.bJ);
      this.m(cws.bj, cws.bK);
      this.m(cws.bk, cws.bL);
      this.m(cws.bl, cws.bM);
      this.m(cws.bm, cws.bN);
      this.m(cws.bn, cws.bO);
      this.m(cws.bo, cws.bP);
      this.a(mn.a("skull"), cws.dW)
         .a(mp.bG, cws.gM, cws.gK, cws.gI, cws.gE, cws.gG, cws.gQ)
         .a(cws.gO)
         .b(cws.gN, cws.gP, cws.gL, cws.gJ, cws.gF, cws.gH, cws.gR);
      this.G(cws.kP);
      this.G(cws.kQ);
      this.G(cws.kR);
      this.G(cws.kS);
      this.G(cws.kT);
      this.G(cws.kU);
      this.G(cws.kV);
      this.G(cws.kW);
      this.G(cws.kX);
      this.G(cws.kY);
      this.G(cws.kZ);
      this.G(cws.la);
      this.G(cws.lb);
      this.G(cws.lc);
      this.G(cws.ld);
      this.G(cws.le);
      this.G(cws.lf);
      this.b(cws.mX, ms.q);
      this.c(cws.mX);
      this.a(mn.a("chest"), cws.n).b(cws.cv, cws.gV);
      this.a(mn.a("ender_chest"), cws.co).b(cws.fG);
      this.f(cws.fx, cws.co).a(cws.fx, cws.kF);
      this.a(cws.aM);
      this.a(cws.aN);
      this.a(cws.lw);
      this.a(cws.lx);
      this.a(cws.ly);
      this.a(cws.lz);
      this.a(cws.lA);
      this.a(cws.lB);
      this.a(cws.lC);
      this.a(cws.lD);
      this.a(cws.lE);
      this.a(cws.lF);
      this.a(cws.lG);
      this.a(cws.lH);
      this.a(cws.lI);
      this.a(cws.lJ);
      this.a(cws.lK);
      this.a(cws.lL);
      this.a(ms.a, cws.lM, cws.lN, cws.lO, cws.lP, cws.lQ, cws.lR, cws.lS, cws.lT, cws.lU, cws.lV, cws.lW, cws.lX, cws.lY, cws.lZ, cws.ma, cws.mb);
      this.a(cws.iA);
      this.a(cws.hj);
      this.a(cws.hk);
      this.a(cws.hl);
      this.a(cws.hm);
      this.a(cws.hn);
      this.a(cws.ho);
      this.a(cws.hp);
      this.a(cws.hq);
      this.a(cws.hr);
      this.a(cws.hs);
      this.a(cws.ht);
      this.a(cws.hu);
      this.a(cws.hv);
      this.a(cws.hw);
      this.a(cws.hx);
      this.a(cws.hy);
      this.a(cws.qO);
      this.h(cws.aQ, cws.eY);
      this.h(cws.ei, cws.hz);
      this.h(cws.ej, cws.hA);
      this.h(cws.ek, cws.hB);
      this.h(cws.el, cws.hC);
      this.h(cws.em, cws.hD);
      this.h(cws.en, cws.hE);
      this.h(cws.eo, cws.hF);
      this.h(cws.ep, cws.hG);
      this.h(cws.eq, cws.hH);
      this.h(cws.er, cws.hI);
      this.h(cws.es, cws.hJ);
      this.h(cws.et, cws.hK);
      this.h(cws.eu, cws.hL);
      this.h(cws.ev, cws.hM);
      this.h(cws.ew, cws.hN);
      this.h(cws.ex, cws.hO);
      this.b(ms.o, cws.lg, cws.lh, cws.li, cws.lj, cws.lk, cws.ll, cws.lm, cws.ln, cws.lo, cws.lp, cws.lq, cws.lr, cws.ls, cws.lt, cws.lu, cws.lv);
      this.g(cws.bA, cws.ik);
      this.g(cws.bB, cws.il);
      this.g(cws.bC, cws.im);
      this.g(cws.bD, cws.in);
      this.g(cws.bE, cws.io);
      this.g(cws.bF, cws.ip);
      this.g(cws.bG, cws.iq);
      this.g(cws.bH, cws.ir);
      this.g(cws.bI, cws.is);
      this.g(cws.bJ, cws.it);
      this.g(cws.bK, cws.iu);
      this.g(cws.bL, cws.iv);
      this.g(cws.bM, cws.iw);
      this.g(cws.bN, cws.ix);
      this.g(cws.bO, cws.iy);
      this.g(cws.bP, cws.iz);
      this.a(cws.sI);
      this.a(cws.eL);
      this.a(cws.bu, cws.gb, lz.e.a);
      this.a(cws.bR, cws.gc, lz.e.b);
      this.a(cws.bT, cws.gd, lz.e.b);
      this.a(cws.bU, cws.ge, lz.e.b);
      this.a(cws.bV, cws.gf, lz.e.b);
      this.a(cws.bW, cws.gg, lz.e.b);
      this.a(cws.bX, cws.gh, lz.e.b);
      this.a(cws.bY, cws.gi, lz.e.b);
      this.a(cws.bZ, cws.gj, lz.e.b);
      this.a(cws.ca, cws.gk, lz.e.b);
      this.a(cws.cb, cws.gl, lz.e.b);
      this.a(cws.cc, cws.gm, lz.e.b);
      this.a(cws.ce, cws.gn, lz.e.b);
      this.a(cws.cd, cws.go, lz.e.b);
      this.a(cws.cg, cws.gp, lz.e.b);
      this.a(cws.cf, cws.gq, lz.e.b);
      this.a(cws.bv, cws.gr, lz.e.b);
      this.a(cws.bS, cws.fS, lz.e.b);
      this.H();
      this.u(cws.eT);
      this.u(cws.eU);
      this.u(cws.eV);
      this.a(cws.bt, lz.e.a);
      this.b(cws.dS, lz.e.a);
      this.a(cnb.dI);
      this.b(cws.mc, cws.md, lz.e.b);
      this.a(cnb.dJ);
      this.c(cws.md);
      this.b(cws.sG, lz.e.b);
      this.c(cws.sG);
      this.c(cws.sw);
      this.b(cws.oz, cws.oA, lz.e.b);
      this.b(cws.oB, cws.oC, lz.e.b);
      this.a(cws.oz, "_plant");
      this.c(cws.oA);
      this.a(cws.oB, "_plant");
      this.c(cws.oC);
      this.a(cws.mY, lz.e.a, mq.c(mq.a(cws.mZ, "_stage0")));
      this.m();
      this.a(cws.bs, lz.e.b);
      this.c(cws.iE, lz.e.b);
      this.c(cws.iF, lz.e.b);
      this.c(cws.iG, lz.e.b);
      this.c(cws.iH, lz.e.a);
      this.c(cws.iI, lz.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cws.mw, cws.mr, cws.mm, cws.mh, cws.mG, cws.mB, cws.mQ, cws.mL);
      this.a(cws.mx, cws.ms, cws.mn, cws.mi, cws.mH, cws.mC, cws.mR, cws.mM);
      this.a(cws.my, cws.mt, cws.mo, cws.mj, cws.mI, cws.mD, cws.mS, cws.mN);
      this.a(cws.mz, cws.mu, cws.mp, cws.mk, cws.mJ, cws.mE, cws.mT, cws.mO);
      this.a(cws.mA, cws.mv, cws.mq, cws.ml, cws.mK, cws.mF, cws.mU, cws.mP);
      this.e(cws.fe, cws.fc);
      this.e(cws.fd, cws.fb);
      this.l(cws.ab).c(cws.ab).a(cws.av);
      this.l(cws.am).c(cws.am).a(cws.aD);
      this.a(cws.am, cws.dj, cws.ds);
      this.b(cws.aL, ms.s);
      this.l(cws.Y).c(cws.Y).a(cws.as);
      this.l(cws.ai).c(cws.ai).a(cws.aA);
      this.a(cws.ai, cws.dd, cws.do);
      this.a(cws.B, cws.fX, lz.e.b);
      this.b(cws.aI, ms.s);
      this.l(cws.Z).d(cws.Z).a(cws.at);
      this.l(cws.aj).d(cws.aj).a(cws.aB);
      this.a(cws.aj, cws.de, cws.dp);
      this.a(cws.C, cws.fY, lz.e.b);
      this.b(cws.aJ, ms.s);
      this.l(cws.W).c(cws.W).a(cws.aq);
      this.l(cws.ag).c(cws.ag).a(cws.ay);
      this.a(cws.ag, cws.dc, cws.dn);
      this.a(cws.z, cws.fV, lz.e.b);
      this.b(cws.aG, ms.s);
      this.l(cws.U).c(cws.U).a(cws.ao);
      this.l(cws.al).c(cws.al).a(cws.aw);
      this.a(cws.al, cws.da, cws.dl);
      this.a(cws.x, cws.fT, lz.e.b);
      this.b(cws.aE, ms.s);
      this.l(cws.V).c(cws.V).a(cws.ap);
      this.l(cws.af).c(cws.af).a(cws.ax);
      this.a(cws.af, cws.db, cws.dm);
      this.a(cws.y, cws.fU, lz.e.b);
      this.b(cws.aF, ms.s);
      this.l(cws.aa).c(cws.aa).a(cws.au);
      this.l(cws.ak).c(cws.ak).a(cws.aC);
      this.a(cws.ak, cws.dg, cws.dr);
      this.a(cws.D, cws.fZ, lz.e.b);
      this.b(cws.aK, ms.s);
      this.l(cws.X).c(cws.X).a(cws.ar);
      this.l(cws.ah).c(cws.ah).a(cws.az);
      this.a(cws.ah, cws.df, cws.dq);
      this.a(cws.A, cws.fW, lz.e.b);
      this.b(cws.aH, ms.s);
      this.l(cws.os).b(cws.os).a(cws.ou);
      this.l(cws.ot).b(cws.ot).a(cws.ov);
      this.a(cws.ot, cws.dh, cws.dt);
      this.a(cws.ox, cws.pm, lz.e.b);
      this.n(cws.oD, cws.po);
      this.l(cws.oj).b(cws.oj).a(cws.ol);
      this.l(cws.ok).b(cws.ok).a(cws.om);
      this.a(cws.ok, cws.di, cws.du);
      this.a(cws.oo, cws.pn, lz.e.b);
      this.n(cws.oq, cws.pp);
      this.l(cws.ae).d(cws.ae);
      this.l(cws.an).d(cws.an);
      this.a(cws.v, cws.dk, cws.dv);
      this.b(cws.or, lz.e.b);
      this.a(cnb.dF);
      this.i(cws.dy);
      this.k(cws.hY);
      this.u();
      this.n(cws.cP);
      this.o(cws.bp);
      this.o(cws.bq);
      this.o(cws.hh);
      this.t();
      this.q(cws.fN);
      this.q(cws.kG);
      this.q(cws.kH);
      this.r(cws.gS);
      this.r(cws.gT);
      this.r(cws.gU);
      this.o();
      this.p();
      this.d(cws.cD, ms.h);
      this.d(cws.nW, ms.h);
      this.d(cws.nV, ms.i);
      this.s();
      this.aA();
      this.av();
      this.k(cws.eK, cws.eS);
      this.k(cws.m, cws.eO);
      this.k(cws.eJ, cws.eR);
      this.k(cws.eI, cws.eQ);
      this.ay();
      this.k(cws.eH, cws.eP);
      this.az();
      cod.h().forEach($$0 -> this.a($$0, mn.b("template_spawn_egg")));
   }

   private void aD() {
      this.c(cws.hX);
      mg.a<Integer> $$0 = mg.a(djx.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ahg $$3 = mq.a(cnb.hB, $$2);
         $$0.a($$1, mi.a().a(mj.c, mp.aa.a(cws.hX, $$2, mq.h($$3), this.c)));
         mp.bx.a(mn.a(cnb.hB, $$2), mq.k($$3), this.c);
      }

      this.b.accept(mf.a(cws.hX).a($$0));
   }

   private void o(cwq $$0, cwq $$1) {
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
                  mg.a(djx.az, djx.r)
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
      this.b.accept(mf.a($$1).a(a(djx.r, $$13, $$12)));
   }

   class a {
      private final ahg b;

      public a(ahg $$0, cwq $$1) {
         this.b = mp.aa.a($$0, mq.u($$1), lz.this.c);
      }

      public lz.a a(cwq... $$0) {
         for (cwq $$1 : $$0) {
            lz.this.b.accept(lz.c($$1, this.b));
         }

         return this;
      }

      public lz.a b(cwq... $$0) {
         for (cwq $$1 : $$0) {
            lz.this.c($$1);
         }

         return this.a($$0);
      }

      public lz.a a(mo $$0, cwq... $$1) {
         for (cwq $$2 : $$1) {
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
      private final Set<cwq> f = new HashSet<>();

      public b(mq $$0) {
         this.b = $$0;
      }

      public lz.b a(cwq $$0, mo $$1) {
         this.e = $$1.a($$0, this.b, lz.this.c);
         if (lz.this.f.containsKey($$0)) {
            lz.this.b.accept(lz.this.f.get($$0).create($$0, this.e, this.b, lz.this.c));
         } else {
            lz.this.b.accept(lz.c($$0, this.e));
         }

         return this;
      }

      public lz.b a(cwq $$0, cwq $$1) {
         ahg $$2 = mn.a($$0);
         lz.this.b.accept(lz.c($$1, $$2));
         lz.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public lz.b a(cwq $$0) {
         ahg $$1 = mp.s.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.t.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.b($$0, $$1, $$2));
         ahg $$3 = mp.u.a($$0, this.b, lz.this.c);
         lz.this.a($$0, $$3);
         return this;
      }

      public lz.b b(cwq $$0) {
         ahg $$1 = mp.M.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.N.a($$0, this.b, lz.this.c);
         ahg $$3 = mp.O.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$1, $$2, $$3));
         ahg $$4 = mp.P.a($$0, this.b, lz.this.c);
         lz.this.a($$0, $$4);
         return this;
      }

      public lz.b c(cwq $$0) {
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

      public lz.b d(cwq $$0) {
         ahg $$1 = mp.J.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.K.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.c($$0, $$1, $$2));
         ahg $$3 = mp.L.a($$0, this.b, lz.this.c);
         lz.this.a($$0, $$3);
         return this;
      }

      public lz.b e(cwq $$0) {
         mq $$1 = mq.p($$0);
         ahg $$2 = mp.R.a($$0, $$1, lz.this.c);
         ahg $$3 = mp.Q.a($$0, $$1, lz.this.c);
         ahg $$4 = mp.T.a($$0, $$1, lz.this.c);
         ahg $$5 = mp.S.a($$0, $$1, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public lz.b f(cwq $$0) {
         ahg $$1 = mp.V.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.U.a($$0, this.b, lz.this.c);
         ahg $$3 = mp.X.a($$0, this.b, lz.this.c);
         ahg $$4 = mp.W.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public lz.b g(cwq $$0) {
         ahg $$1 = mp.Y.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.Z.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.e($$0, $$1, $$2));
         return this;
      }

      public lz.b h(cwq $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cwq $$1 = this.d.b().get(kh.b.r);
            ahg $$2 = mp.aa.a($$0, this.b, lz.this.c);
            lz.this.b.accept(lz.c($$0, $$2));
            lz.this.b.accept(lz.c($$1, $$2));
            lz.this.a($$0.k());
            lz.this.c($$1);
            return this;
         }
      }

      public lz.b i(cwq $$0) {
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

      public lz.b j(cwq $$0) {
         ahg $$1 = this.a(mp.af, $$0);
         ahg $$2 = this.a(mp.ae, $$0);
         ahg $$3 = this.a(mp.ag, $$0);
         lz.this.b.accept(lz.b($$0, $$1, $$2, $$3));
         lz.this.a($$0, $$2);
         return this;
      }

      private lz.b k(cwq $$0) {
         ms $$1 = lz.this.g.getOrDefault($$0, ms.a.get($$0));
         ahg $$2 = $$1.a($$0, lz.this.c);
         lz.this.b.accept(lz.c($$0, $$2));
         return this;
      }

      private lz.b l(cwq $$0) {
         lz.this.i($$0);
         return this;
      }

      private void m(cwq $$0) {
         if (lz.this.e.contains($$0)) {
            lz.this.k($$0);
         } else {
            lz.this.j($$0);
         }
      }

      private ahg a(mo $$0, cwq $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, lz.this.c));
      }

      public lz.b a(kh $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<lz.b, cwq> $$2 = lz.h.get($$0x);
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
      mc create(cwq var1, ahg var2, mq var3, BiConsumer<ahg, Supplier<JsonElement>> var4);
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

      public lz.f a(cwq $$0) {
         mq $$1 = this.b.c(mr.d, this.b.a(mr.i));
         ahg $$2 = mp.j.a($$0, $$1, lz.this.c);
         lz.this.b.accept(lz.d($$0, $$2));
         return this;
      }

      public lz.f b(cwq $$0) {
         ahg $$1 = mp.j.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.d($$0, $$1));
         return this;
      }

      public lz.f c(cwq $$0) {
         ahg $$1 = mp.j.a($$0, this.b, lz.this.c);
         ahg $$2 = mp.k.a($$0, this.b, lz.this.c);
         lz.this.b.accept(lz.d($$0, $$1, $$2));
         return this;
      }

      public lz.f d(cwq $$0) {
         lz.this.b.accept(lz.a($$0, this.b, lz.this.c));
         return this;
      }
   }
}
