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

public class kq {
   final Consumer<kt> b;
   final BiConsumer<aer, Supplier<JsonElement>> c;
   private final Consumer<cit> d;
   final List<csm> e = ImmutableList.of(csn.ez, csn.eF, csn.hY);
   final Map<csm, kq.c> f = ImmutableMap.builder().put(csn.b, kq::a).put(csn.rI, kq::c).put(csn.eN, kq::b).build();
   final Map<csm, lj> g = ImmutableMap.builder()
      .put(csn.aV, lj.x.get(csn.aV))
      .put(csn.jp, lj.x.get(csn.jp))
      .put(csn.jS, lj.a(lh.a(csn.aV, "_top")))
      .put(csn.jU, lj.a(lh.a(csn.jp, "_top")))
      .put(csn.aX, lj.c.get(csn.aV).a($$0x -> $$0x.a(li.i, lh.G(csn.aX))))
      .put(csn.jr, lj.c.get(csn.jp).a($$0x -> $$0x.a(li.i, lh.G(csn.jr))))
      .put(csn.hd, lj.c.get(csn.hd))
      .put(csn.jT, lj.a(lh.a(csn.hd, "_bottom")))
      .put(csn.pr, lj.y.get(csn.pr))
      .put(csn.rI, lj.y.get(csn.rI))
      .put(csn.he, lj.c.get(csn.he).a($$0x -> $$0x.a(li.i, lh.G(csn.he))))
      .put(csn.aW, lj.c.get(csn.aW).a($$0x -> {
         $$0x.a(li.d, lh.a(csn.aV, "_top"));
         $$0x.a(li.i, lh.G(csn.aW));
      }))
      .put(csn.jq, lj.c.get(csn.jq).a($$0x -> {
         $$0x.a(li.d, lh.a(csn.jp, "_top"));
         $$0x.a(li.i, lh.G(csn.jq));
      }))
      .build();
   static final Map<jf.b, BiConsumer<kq.b, csm>> h = ImmutableMap.builder()
      .put(jf.b.a, kq.b::a)
      .put(jf.b.e, kq.b::l)
      .put(jf.b.b, kq.b::k)
      .put(jf.b.c, kq.b::k)
      .put(jf.b.f, kq.b::c)
      .put(jf.b.g, kq.b::d)
      .put(jf.b.h, kq.b::e)
      .put(jf.b.i, kq.b::f)
      .put(jf.b.k, kq.b::h)
      .put(jf.b.l, kq.b::i)
      .put(jf.b.m, kq.b::j)
      .put(jf.b.n, kq.b::g)
      .put(jf.b.p, kq.b::m)
      .put(jf.b.q, kq.b::b)
      .build();
   public static final List<Pair<dfr, Function<aer, kz>>> a = List.of(
      Pair.of(dfq.L, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0)),
      Pair.of(dfq.M, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.d, true)),
      Pair.of(dfq.N, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.d, true)),
      Pair.of(dfq.O, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.d, true)),
      Pair.of(dfq.J, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.a, la.a.d).a(la.d, true)),
      Pair.of(dfq.K, (Function<aer, kz>)$$0 -> kz.a().a(la.c, $$0).a(la.a, la.a.b).a(la.d, true))
   );
   private static final Map<kq.d, aer> i = new HashMap<>();

   private static kt a(csm $$0, aer $$1, lh $$2, BiConsumer<aer, Supplier<JsonElement>> $$3) {
      aer $$4 = lg.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static kt b(csm $$0, aer $$1, lh $$2, BiConsumer<aer, Supplier<JsonElement>> $$3) {
      aer $$4 = lg.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static kt c(csm $$0, aer $$1, lh $$2, BiConsumer<aer, Supplier<JsonElement>> $$3) {
      aer $$4 = lg.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public kq(Consumer<kt> $$0, BiConsumer<aer, Supplier<JsonElement>> $$1, Consumer<cit> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(csm $$0) {
      this.d.accept($$0.k());
   }

   void a(csm $$0, aer $$1) {
      this.c.accept(le.a($$0.k()), new ld($$1));
   }

   private void a(cit $$0, aer $$1) {
      this.c.accept(le.a($$0), new ld($$1));
   }

   void a(cit $$0) {
      lg.bv.a(le.a($$0), lh.b($$0), this.c);
   }

   private void d(csm $$0) {
      cit $$1 = $$0.k();
      if ($$1 != cjb.a) {
         lg.bv.a(le.a($$1), lh.F($$0), this.c);
      }
   }

   private void a(csm $$0, String $$1) {
      cit $$2 = $$0.k();
      lg.bv.a(le.a($$2), lh.k(lh.a($$0, $$1)), this.c);
   }

   private static kx b() {
      return kx.a(dfq.R).a(ha.f, kz.a().a(la.b, la.a.b)).a(ha.d, kz.a().a(la.b, la.a.c)).a(ha.e, kz.a().a(la.b, la.a.d)).a(ha.c, kz.a());
   }

   private static kx c() {
      return kx.a(dfq.R).a(ha.d, kz.a()).a(ha.e, kz.a().a(la.b, la.a.b)).a(ha.c, kz.a().a(la.b, la.a.c)).a(ha.f, kz.a().a(la.b, la.a.d));
   }

   private static kx d() {
      return kx.a(dfq.R).a(ha.f, kz.a()).a(ha.d, kz.a().a(la.b, la.a.b)).a(ha.e, kz.a().a(la.b, la.a.c)).a(ha.c, kz.a().a(la.b, la.a.d));
   }

   private static kx e() {
      return kx.a(dfq.P)
         .a(ha.a, kz.a().a(la.a, la.a.b))
         .a(ha.b, kz.a().a(la.a, la.a.d))
         .a(ha.c, kz.a())
         .a(ha.d, kz.a().a(la.b, la.a.c))
         .a(ha.e, kz.a().a(la.b, la.a.d))
         .a(ha.f, kz.a().a(la.b, la.a.b));
   }

   private static kw b(csm $$0, aer $$1) {
      return kw.a($$0, a($$1));
   }

   private static kz[] a(aer $$0) {
      return new kz[]{kz.a().a(la.c, $$0), kz.a().a(la.c, $$0).a(la.b, la.a.b), kz.a().a(la.c, $$0).a(la.b, la.a.c), kz.a().a(la.c, $$0).a(la.b, la.a.d)};
   }

   private static kw a(csm $$0, aer $$1, aer $$2) {
      return kw.a($$0, kz.a().a(la.c, $$1), kz.a().a(la.c, $$2), kz.a().a(la.c, $$1).a(la.b, la.a.c), kz.a().a(la.c, $$2).a(la.b, la.a.c));
   }

   private static kx a(dfr $$0, aer $$1, aer $$2) {
      return kx.a($$0).a(true, kz.a().a(la.c, $$1)).a(false, kz.a().a(la.c, $$2));
   }

   private void e(csm $$0) {
      aer $$1 = lj.a.create($$0, this.c);
      aer $$2 = lj.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(csm $$0) {
      aer $$1 = lj.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(csm $$0) {
      this.b.accept(kw.a($$0).a(kx.a(dfq.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aer $$3 = lh.a($$0, $$2);
         return kz.a().a(la.c, lg.c.a($$0, $$2, new lh().a(li.a, $$3), this.c));
      })));
      this.a($$0, lh.a($$0, "_0"));
   }

   static kt b(csm $$0, aer $$1, aer $$2) {
      return kw.a($$0)
         .a(kx.a(dfq.w).a(false, kz.a().a(la.c, $$1)).a(true, kz.a().a(la.c, $$2)))
         .a(
            kx.a(dfq.U, dfq.R)
               .a(dfl.a, ha.f, kz.a().a(la.b, la.a.b))
               .a(dfl.a, ha.e, kz.a().a(la.b, la.a.d))
               .a(dfl.a, ha.d, kz.a().a(la.b, la.a.c))
               .a(dfl.a, ha.c, kz.a())
               .a(dfl.b, ha.f, kz.a().a(la.b, la.a.b).a(la.a, la.a.b).a(la.d, true))
               .a(dfl.b, ha.e, kz.a().a(la.b, la.a.d).a(la.a, la.a.b).a(la.d, true))
               .a(dfl.b, ha.d, kz.a().a(la.b, la.a.c).a(la.a, la.a.b).a(la.d, true))
               .a(dfl.b, ha.c, kz.a().a(la.a, la.a.b).a(la.d, true))
               .a(dfl.c, ha.f, kz.a().a(la.b, la.a.d).a(la.a, la.a.c))
               .a(dfl.c, ha.e, kz.a().a(la.b, la.a.b).a(la.a, la.a.c))
               .a(dfl.c, ha.d, kz.a().a(la.a, la.a.c))
               .a(dfl.c, ha.c, kz.a().a(la.b, la.a.c).a(la.a, la.a.c))
         );
   }

   private static kx.d<ha, dfw, dfv, Boolean> a(kx.d<ha, dfw, dfv, Boolean> $$0, dfw $$1, aer $$2, aer $$3, aer $$4, aer $$5) {
      return $$0.a(ha.f, $$1, dfv.a, false, kz.a().a(la.c, $$2))
         .a(ha.d, $$1, dfv.a, false, kz.a().a(la.c, $$2).a(la.b, la.a.b))
         .a(ha.e, $$1, dfv.a, false, kz.a().a(la.c, $$2).a(la.b, la.a.c))
         .a(ha.c, $$1, dfv.a, false, kz.a().a(la.c, $$2).a(la.b, la.a.d))
         .a(ha.f, $$1, dfv.b, false, kz.a().a(la.c, $$4))
         .a(ha.d, $$1, dfv.b, false, kz.a().a(la.c, $$4).a(la.b, la.a.b))
         .a(ha.e, $$1, dfv.b, false, kz.a().a(la.c, $$4).a(la.b, la.a.c))
         .a(ha.c, $$1, dfv.b, false, kz.a().a(la.c, $$4).a(la.b, la.a.d))
         .a(ha.f, $$1, dfv.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.b))
         .a(ha.d, $$1, dfv.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.c))
         .a(ha.e, $$1, dfv.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.d))
         .a(ha.c, $$1, dfv.a, true, kz.a().a(la.c, $$3))
         .a(ha.f, $$1, dfv.b, true, kz.a().a(la.c, $$5).a(la.b, la.a.d))
         .a(ha.d, $$1, dfv.b, true, kz.a().a(la.c, $$5))
         .a(ha.e, $$1, dfv.b, true, kz.a().a(la.c, $$5).a(la.b, la.a.b))
         .a(ha.c, $$1, dfv.b, true, kz.a().a(la.c, $$5).a(la.b, la.a.c));
   }

   private static kt a(csm $$0, aer $$1, aer $$2, aer $$3, aer $$4, aer $$5, aer $$6, aer $$7, aer $$8) {
      return kw.a($$0).a(a(a(kx.a(dfq.R, dfq.ae, dfq.be, dfq.u), dfw.b, $$1, $$2, $$3, $$4), dfw.a, $$5, $$6, $$7, $$8));
   }

   static kt a(csm $$0, aer $$1, aer $$2, aer $$3, aer $$4, aer $$5) {
      return kv.a($$0)
         .a(kz.a().a(la.c, $$1))
         .a(ku.a().a(dfq.L, true), kz.a().a(la.c, $$2).a(la.d, false))
         .a(ku.a().a(dfq.M, true), kz.a().a(la.c, $$3).a(la.d, false))
         .a(ku.a().a(dfq.N, true), kz.a().a(la.c, $$4).a(la.d, false))
         .a(ku.a().a(dfq.O, true), kz.a().a(la.c, $$5).a(la.d, false));
   }

   static kt c(csm $$0, aer $$1, aer $$2) {
      return kv.a($$0)
         .a(kz.a().a(la.c, $$1))
         .a(ku.a().a(dfq.L, true), kz.a().a(la.c, $$2).a(la.d, true))
         .a(ku.a().a(dfq.M, true), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true))
         .a(ku.a().a(dfq.N, true), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true))
         .a(ku.a().a(dfq.O, true), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true));
   }

   static kt a(csm $$0, aer $$1, aer $$2, aer $$3) {
      return kv.a($$0)
         .a(ku.a().a(dfq.J, true), kz.a().a(la.c, $$1))
         .a(ku.a().a(dfq.X, dgm.b), kz.a().a(la.c, $$2).a(la.d, true))
         .a(ku.a().a(dfq.W, dgm.b), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true))
         .a(ku.a().a(dfq.Y, dgm.b), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true))
         .a(ku.a().a(dfq.Z, dgm.b), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true))
         .a(ku.a().a(dfq.X, dgm.c), kz.a().a(la.c, $$3).a(la.d, true))
         .a(ku.a().a(dfq.W, dgm.c), kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true))
         .a(ku.a().a(dfq.Y, dgm.c), kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true))
         .a(ku.a().a(dfq.Z, dgm.c), kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true));
   }

   static kt a(csm $$0, aer $$1, aer $$2, aer $$3, aer $$4, boolean $$5) {
      return kw.a($$0, kz.a().a(la.d, $$5))
         .a(c())
         .a(
            kx.a(dfq.q, dfq.u)
               .a(false, false, kz.a().a(la.c, $$2))
               .a(true, false, kz.a().a(la.c, $$4))
               .a(false, true, kz.a().a(la.c, $$1))
               .a(true, true, kz.a().a(la.c, $$3))
         );
   }

   static kt b(csm $$0, aer $$1, aer $$2, aer $$3) {
      return kw.a($$0)
         .a(
            kx.a(dfq.R, dfq.af, dfq.bi)
               .a(ha.f, dfz.b, dgj.a, kz.a().a(la.c, $$2))
               .a(ha.e, dfz.b, dgj.a, kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfz.b, dgj.a, kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfz.b, dgj.a, kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfz.b, dgj.e, kz.a().a(la.c, $$3))
               .a(ha.e, dfz.b, dgj.e, kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfz.b, dgj.e, kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfz.b, dgj.e, kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfz.b, dgj.d, kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true))
               .a(ha.e, dfz.b, dgj.d, kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true))
               .a(ha.d, dfz.b, dgj.d, kz.a().a(la.c, $$3))
               .a(ha.c, dfz.b, dgj.d, kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true))
               .a(ha.f, dfz.b, dgj.c, kz.a().a(la.c, $$1))
               .a(ha.e, dfz.b, dgj.c, kz.a().a(la.c, $$1).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfz.b, dgj.c, kz.a().a(la.c, $$1).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfz.b, dgj.c, kz.a().a(la.c, $$1).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfz.b, dgj.b, kz.a().a(la.c, $$1).a(la.b, la.a.d).a(la.d, true))
               .a(ha.e, dfz.b, dgj.b, kz.a().a(la.c, $$1).a(la.b, la.a.b).a(la.d, true))
               .a(ha.d, dfz.b, dgj.b, kz.a().a(la.c, $$1))
               .a(ha.c, dfz.b, dgj.b, kz.a().a(la.c, $$1).a(la.b, la.a.c).a(la.d, true))
               .a(ha.f, dfz.a, dgj.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.d, true))
               .a(ha.e, dfz.a, dgj.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfz.a, dgj.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfz.a, dgj.a, kz.a().a(la.c, $$2).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfz.a, dgj.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.e, dfz.a, dgj.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
               .a(ha.d, dfz.a, dgj.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.c, dfz.a, dgj.e, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.d, true))
               .a(ha.f, dfz.a, dgj.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.d, true))
               .a(ha.e, dfz.a, dgj.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfz.a, dgj.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfz.a, dgj.d, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
               .a(ha.f, dfz.a, dgj.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.e, dfz.a, dgj.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
               .a(ha.d, dfz.a, dgj.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.c, dfz.a, dgj.c, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.d, true))
               .a(ha.f, dfz.a, dgj.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.d, true))
               .a(ha.e, dfz.a, dgj.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.c).a(la.d, true))
               .a(ha.d, dfz.a, dgj.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.b).a(la.d, true))
               .a(ha.c, dfz.a, dgj.b, kz.a().a(la.c, $$1).a(la.a, la.a.c).a(la.b, la.a.d).a(la.d, true))
         );
   }

   private static kt c(csm $$0, aer $$1, aer $$2, aer $$3) {
      return kw.a($$0)
         .a(
            kx.a(dfq.R, dfq.af, dfq.u)
               .a(ha.c, dfz.b, false, kz.a().a(la.c, $$2))
               .a(ha.d, dfz.b, false, kz.a().a(la.c, $$2).a(la.b, la.a.c))
               .a(ha.f, dfz.b, false, kz.a().a(la.c, $$2).a(la.b, la.a.b))
               .a(ha.e, dfz.b, false, kz.a().a(la.c, $$2).a(la.b, la.a.d))
               .a(ha.c, dfz.a, false, kz.a().a(la.c, $$1))
               .a(ha.d, dfz.a, false, kz.a().a(la.c, $$1).a(la.b, la.a.c))
               .a(ha.f, dfz.a, false, kz.a().a(la.c, $$1).a(la.b, la.a.b))
               .a(ha.e, dfz.a, false, kz.a().a(la.c, $$1).a(la.b, la.a.d))
               .a(ha.c, dfz.b, true, kz.a().a(la.c, $$3))
               .a(ha.d, dfz.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.c))
               .a(ha.f, dfz.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ha.e, dfz.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.d))
               .a(ha.c, dfz.a, true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.c))
               .a(ha.d, dfz.a, true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.a))
               .a(ha.f, dfz.a, true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.d))
               .a(ha.e, dfz.a, true, kz.a().a(la.c, $$3).a(la.a, la.a.c).a(la.b, la.a.b))
         );
   }

   private static kt d(csm $$0, aer $$1, aer $$2, aer $$3) {
      return kw.a($$0)
         .a(
            kx.a(dfq.R, dfq.af, dfq.u)
               .a(ha.c, dfz.b, false, kz.a().a(la.c, $$2))
               .a(ha.d, dfz.b, false, kz.a().a(la.c, $$2))
               .a(ha.f, dfz.b, false, kz.a().a(la.c, $$2))
               .a(ha.e, dfz.b, false, kz.a().a(la.c, $$2))
               .a(ha.c, dfz.a, false, kz.a().a(la.c, $$1))
               .a(ha.d, dfz.a, false, kz.a().a(la.c, $$1))
               .a(ha.f, dfz.a, false, kz.a().a(la.c, $$1))
               .a(ha.e, dfz.a, false, kz.a().a(la.c, $$1))
               .a(ha.c, dfz.b, true, kz.a().a(la.c, $$3))
               .a(ha.d, dfz.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.c))
               .a(ha.f, dfz.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ha.e, dfz.b, true, kz.a().a(la.c, $$3).a(la.b, la.a.d))
               .a(ha.c, dfz.a, true, kz.a().a(la.c, $$3))
               .a(ha.d, dfz.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.c))
               .a(ha.f, dfz.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ha.e, dfz.a, true, kz.a().a(la.c, $$3).a(la.b, la.a.d))
         );
   }

   static kw c(csm $$0, aer $$1) {
      return kw.a($$0, kz.a().a(la.c, $$1));
   }

   private static kx f() {
      return kx.a(dfq.I).a(ha.a.b, kz.a()).a(ha.a.c, kz.a().a(la.a, la.a.b)).a(ha.a.a, kz.a().a(la.a, la.a.b).a(la.b, la.a.b));
   }

   static kt a(csm $$0, lh $$1, BiConsumer<aer, Supplier<JsonElement>> $$2) {
      aer $$3 = lg.f.a($$0, $$1, $$2);
      aer $$4 = lg.g.a($$0, $$1, $$2);
      aer $$5 = lg.h.a($$0, $$1, $$2);
      aer $$6 = lg.i.a($$0, $$1, $$2);
      return kw.a($$0, kz.a().a(la.c, $$6)).a(kx.a(dfq.I).a(ha.a.a, kz.a().a(la.c, $$3)).a(ha.a.b, kz.a().a(la.c, $$4)).a(ha.a.c, kz.a().a(la.c, $$5)));
   }

   static kt d(csm $$0, aer $$1) {
      return kw.a($$0, kz.a().a(la.c, $$1)).a(f());
   }

   private void e(csm $$0, aer $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(csm $$0, lj.a $$1) {
      aer $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(csm $$0, lj.a $$1) {
      aer $$2 = $$1.create($$0, this.c);
      this.b.accept(kw.a($$0, kz.a().a(la.c, $$2)).a(b()));
   }

   static kt d(csm $$0, aer $$1, aer $$2) {
      return kw.a($$0)
         .a(
            kx.a(dfq.I)
               .a(ha.a.b, kz.a().a(la.c, $$1))
               .a(ha.a.c, kz.a().a(la.c, $$2).a(la.a, la.a.b))
               .a(ha.a.a, kz.a().a(la.c, $$2).a(la.a, la.a.b).a(la.b, la.a.b))
         );
   }

   private void a(csm $$0, lj.a $$1, lj.a $$2) {
      aer $$3 = $$1.create($$0, this.c);
      aer $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aer a(csm $$0, String $$1, lf $$2, Function<aer, lh> $$3) {
      return $$2.a($$0, $$1, $$3.apply(lh.a($$0, $$1)), this.c);
   }

   static kt e(csm $$0, aer $$1, aer $$2) {
      return kw.a($$0).a(a(dfq.w, $$2, $$1));
   }

   static kt e(csm $$0, aer $$1, aer $$2, aer $$3) {
      return kw.a($$0).a(kx.a(dfq.bh).a(dgi.b, kz.a().a(la.c, $$1)).a(dgi.a, kz.a().a(la.c, $$2)).a(dgi.c, kz.a().a(la.c, $$3)));
   }

   public void a(csm $$0) {
      this.b($$0, lj.a);
   }

   public void b(csm $$0, lj.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(csm $$0, lh $$1, lf $$2) {
      aer $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private kq.b h(csm $$0) {
      lj $$1 = this.g.getOrDefault($$0, lj.a.get($$0));
      return new kq.b($$1.b()).a($$0, $$1.a());
   }

   public void a(csm $$0, csm $$1, csm $$2) {
      lh $$3 = lh.u($$0);
      aer $$4 = lg.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(csm $$0) {
      lh $$1 = lh.t($$0);
      aer $$2 = lg.t.a($$0, $$1, this.c);
      aer $$3 = lg.u.a($$0, $$1, this.c);
      aer $$4 = lg.v.a($$0, $$1, this.c);
      aer $$5 = lg.w.a($$0, $$1, this.c);
      aer $$6 = lg.x.a($$0, $$1, this.c);
      aer $$7 = lg.y.a($$0, $$1, this.c);
      aer $$8 = lg.z.a($$0, $$1, this.c);
      aer $$9 = lg.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(csm $$0) {
      lh $$1 = lh.b($$0);
      aer $$2 = lg.ai.a($$0, $$1, this.c);
      aer $$3 = lg.aj.a($$0, $$1, this.c);
      aer $$4 = lg.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(csm $$0) {
      lh $$1 = lh.b($$0);
      aer $$2 = lg.af.a($$0, $$1, this.c);
      aer $$3 = lg.ag.a($$0, $$1, this.c);
      aer $$4 = lg.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(csn.rC);
      aer $$0 = le.a(csn.rC);
      aer $$1 = le.a(csn.rC, "_partial_tilt");
      aer $$2 = le.a(csn.rC, "_full_tilt");
      this.b
         .accept(
            kw.a(csn.rC)
               .a(b())
               .a(kx.a(dfq.bl).a(dgl.a, kz.a().a(la.c, $$0)).a(dgl.b, kz.a().a(la.c, $$0)).a(dgl.c, kz.a().a(la.c, $$1)).a(dgl.d, kz.a().a(la.c, $$2)))
         );
   }

   private kq.f l(csm $$0) {
      return new kq.f(lh.n($$0));
   }

   private void m(csm $$0) {
      this.a($$0, $$0);
   }

   private void a(csm $$0, csm $$1) {
      this.b.accept(c($$0, le.a($$1)));
   }

   private void a(csm $$0, kq.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(csm $$0, kq.e $$1, lh $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csm $$0, kq.e $$1) {
      lh $$2 = lh.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csm $$0, kq.e $$1, lh $$2) {
      aer $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(csm $$0, kq.e $$1, dgd<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         kx $$4 = kx.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            lh $$5 = lh.c(lh.a($$0, $$4x));
            aer $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return kz.a().a(la.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(kw.a($$0).a($$4));
      }
   }

   private void a(csm $$0, csm $$1, kq.e $$2) {
      this.a($$0, $$2);
      lh $$3 = lh.d($$0);
      aer $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(csm $$0, csm $$1) {
      lj $$2 = lj.o.get($$0);
      aer $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aer $$4 = lg.aA.a($$1, $$2.b(), this.c);
      this.b.accept(kw.a($$1, kz.a().a(la.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(csm $$0, csm $$1) {
      this.a($$0.k());
      lh $$2 = lh.h($$0);
      lh $$3 = lh.a($$0, $$1);
      aer $$4 = lg.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            kw.a($$1, kz.a().a(la.c, $$4))
               .a(kx.a(dfq.R).a(ha.e, kz.a()).a(ha.d, kz.a().a(la.b, la.a.d)).a(ha.c, kz.a().a(la.b, la.a.b)).a(ha.f, kz.a().a(la.b, la.a.c)))
         );
      this.b.accept(kw.a($$0).a(kx.a(dfq.av).a($$2x -> kz.a().a(la.c, lg.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      csm $$0 = csn.kC;
      this.a($$0.k());
      aer $$1 = le.a($$0, "_top");
      aer $$2 = le.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      csm $$0 = csn.kB;
      this.a($$0.k());
      kx $$1 = kx.a(cxz.b, dfq.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> kz.a().a(la.c, le.a($$0, "_top_stage_" + $$1x));
            case b -> kz.a().a(la.c, le.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(kw.a($$0).a($$1));
   }

   private void a(csm $$0, csm $$1, csm $$2, csm $$3, csm $$4, csm $$5, csm $$6, csm $$7) {
      this.a($$0, kq.e.b);
      this.a($$1, kq.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(csm $$0, kq.e $$1) {
      this.a($$0, "_top");
      aer $$2 = this.a($$0, "_top", $$1.a(), lh::c);
      aer $$3 = this.a($$0, "_bottom", $$1.a(), lh::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(csn.iD, "_front");
      aer $$0 = le.a(csn.iD, "_top");
      aer $$1 = this.a(csn.iD, "_bottom", kq.e.b.a(), lh::c);
      this.f(csn.iD, $$0, $$1);
   }

   private void k() {
      aer $$0 = this.a(csn.bx, "_top", lg.bi, lh::a);
      aer $$1 = this.a(csn.bx, "_bottom", lg.bi, lh::a);
      this.f(csn.bx, $$0, $$1);
   }

   private void l() {
      this.c(csn.rE);
      aer $$0 = le.a(csn.rE, "_top");
      aer $$1 = le.a(csn.rE, "_bottom");
      this.b.accept(kw.a(csn.rE).a(b()).a(kx.a(dfq.ae).a(dfw.b, kz.a().a(la.c, $$1)).a(dfw.a, kz.a().a(la.c, $$0))));
   }

   private void f(csm $$0, aer $$1, aer $$2) {
      this.b.accept(kw.a($$0).a(kx.a(dfq.ae).a(dfw.b, kz.a().a(la.c, $$2)).a(dfw.a, kz.a().a(la.c, $$1))));
   }

   private void n(csm $$0) {
      lh $$1 = lh.e($$0);
      lh $$2 = lh.e(lh.a($$0, "_corner"));
      aer $$3 = lg.aq.a($$0, $$1, this.c);
      aer $$4 = lg.ar.a($$0, $$2, this.c);
      aer $$5 = lg.as.a($$0, $$1, this.c);
      aer $$6 = lg.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            kw.a($$0)
               .a(
                  kx.a(dfq.ag)
                     .a(dge.a, kz.a().a(la.c, $$3))
                     .a(dge.b, kz.a().a(la.c, $$3).a(la.b, la.a.b))
                     .a(dge.c, kz.a().a(la.c, $$5).a(la.b, la.a.b))
                     .a(dge.d, kz.a().a(la.c, $$6).a(la.b, la.a.b))
                     .a(dge.e, kz.a().a(la.c, $$5))
                     .a(dge.f, kz.a().a(la.c, $$6))
                     .a(dge.g, kz.a().a(la.c, $$4))
                     .a(dge.h, kz.a().a(la.c, $$4).a(la.b, la.a.b))
                     .a(dge.i, kz.a().a(la.c, $$4).a(la.b, la.a.c))
                     .a(dge.j, kz.a().a(la.c, $$4).a(la.b, la.a.d))
               )
         );
   }

   private void o(csm $$0) {
      aer $$1 = this.a($$0, "", lg.aq, lh::e);
      aer $$2 = this.a($$0, "", lg.as, lh::e);
      aer $$3 = this.a($$0, "", lg.at, lh::e);
      aer $$4 = this.a($$0, "_on", lg.aq, lh::e);
      aer $$5 = this.a($$0, "_on", lg.as, lh::e);
      aer $$6 = this.a($$0, "_on", lg.at, lh::e);
      kx $$7 = kx.a(dfq.w, dfq.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return kz.a().a(la.c, $$6x ? $$4 : $$1);
            case b:
               return kz.a().a(la.c, $$6x ? $$4 : $$1).a(la.b, la.a.b);
            case c:
               return kz.a().a(la.c, $$6x ? $$5 : $$2).a(la.b, la.a.b);
            case d:
               return kz.a().a(la.c, $$6x ? $$6 : $$3).a(la.b, la.a.b);
            case e:
               return kz.a().a(la.c, $$6x ? $$5 : $$2);
            case f:
               return kz.a().a(la.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(kw.a($$0).a($$7));
   }

   private kq.a a(aer $$0, csm $$1) {
      return new kq.a($$0, $$1);
   }

   private kq.a d(csm $$0, csm $$1) {
      return new kq.a(le.a($$0), $$1);
   }

   private void a(csm $$0, cit $$1) {
      aer $$2 = lg.Y.a($$0, lh.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(csm $$0, aer $$1) {
      aer $$2 = lg.Y.a($$0, lh.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(csm $$0, csm $$1) {
      this.a($$0);
      aer $$2 = lj.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(csm $$0) {
      this.a($$0.k());
      aer $$1 = lj.j.create($$0, this.c);
      aer $$2 = lj.k.create($$0, this.c);
      aer $$3 = lj.l.create($$0, this.c);
      aer $$4 = lj.m.create($$0, this.c);
      this.b
         .accept(
            kv.a($$0)
               .a(ku.a().a(dfq.S, 1, 2, 3, 4).a(dfq.R, ha.c), kz.a().a(la.c, $$1))
               .a(ku.a().a(dfq.S, 1, 2, 3, 4).a(dfq.R, ha.f), kz.a().a(la.c, $$1).a(la.b, la.a.b))
               .a(ku.a().a(dfq.S, 1, 2, 3, 4).a(dfq.R, ha.d), kz.a().a(la.c, $$1).a(la.b, la.a.c))
               .a(ku.a().a(dfq.S, 1, 2, 3, 4).a(dfq.R, ha.e), kz.a().a(la.c, $$1).a(la.b, la.a.d))
               .a(ku.a().a(dfq.S, 2, 3, 4).a(dfq.R, ha.c), kz.a().a(la.c, $$2))
               .a(ku.a().a(dfq.S, 2, 3, 4).a(dfq.R, ha.f), kz.a().a(la.c, $$2).a(la.b, la.a.b))
               .a(ku.a().a(dfq.S, 2, 3, 4).a(dfq.R, ha.d), kz.a().a(la.c, $$2).a(la.b, la.a.c))
               .a(ku.a().a(dfq.S, 2, 3, 4).a(dfq.R, ha.e), kz.a().a(la.c, $$2).a(la.b, la.a.d))
               .a(ku.a().a(dfq.S, 3, 4).a(dfq.R, ha.c), kz.a().a(la.c, $$3))
               .a(ku.a().a(dfq.S, 3, 4).a(dfq.R, ha.f), kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ku.a().a(dfq.S, 3, 4).a(dfq.R, ha.d), kz.a().a(la.c, $$3).a(la.b, la.a.c))
               .a(ku.a().a(dfq.S, 3, 4).a(dfq.R, ha.e), kz.a().a(la.c, $$3).a(la.b, la.a.d))
               .a(ku.a().a(dfq.S, 4).a(dfq.R, ha.c), kz.a().a(la.c, $$4))
               .a(ku.a().a(dfq.S, 4).a(dfq.R, ha.f), kz.a().a(la.c, $$4).a(la.b, la.a.b))
               .a(ku.a().a(dfq.S, 4).a(dfq.R, ha.d), kz.a().a(la.c, $$4).a(la.b, la.a.c))
               .a(ku.a().a(dfq.S, 4).a(dfq.R, ha.e), kz.a().a(la.c, $$4).a(la.b, la.a.d))
         );
   }

   private void a(lj.a $$0, csm... $$1) {
      for (csm $$2 : $$1) {
         aer $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(lj.a $$0, csm... $$1) {
      for (csm $$2 : $$1) {
         aer $$3 = $$0.create($$2, this.c);
         this.b.accept(kw.a($$2, kz.a().a(la.c, $$3)).a(c()));
      }
   }

   private void f(csm $$0, csm $$1) {
      this.a($$0);
      lh $$2 = lh.b($$0, $$1);
      aer $$3 = lg.aG.a($$1, $$2, this.c);
      aer $$4 = lg.aH.a($$1, $$2, this.c);
      aer $$5 = lg.aI.a($$1, $$2, this.c);
      aer $$6 = lg.aE.a($$1, $$2, this.c);
      aer $$7 = lg.aF.a($$1, $$2, this.c);
      cit $$8 = $$1.k();
      lg.bv.a(le.a($$8), lh.F($$0), this.c);
      this.b
         .accept(
            kv.a($$1)
               .a(kz.a().a(la.c, $$3))
               .a(ku.a().a(dfq.L, true), kz.a().a(la.c, $$4))
               .a(ku.a().a(dfq.M, true), kz.a().a(la.c, $$4).a(la.b, la.a.b))
               .a(ku.a().a(dfq.N, true), kz.a().a(la.c, $$5))
               .a(ku.a().a(dfq.O, true), kz.a().a(la.c, $$5).a(la.b, la.a.b))
               .a(ku.a().a(dfq.L, false), kz.a().a(la.c, $$6))
               .a(ku.a().a(dfq.M, false), kz.a().a(la.c, $$7))
               .a(ku.a().a(dfq.N, false), kz.a().a(la.c, $$7).a(la.b, la.a.b))
               .a(ku.a().a(dfq.O, false), kz.a().a(la.c, $$6).a(la.b, la.a.d))
         );
   }

   private void q(csm $$0) {
      lh $$1 = lh.z($$0);
      aer $$2 = lg.aJ.a($$0, $$1, this.c);
      aer $$3 = this.a($$0, "_conditional", lg.aJ, $$1x -> $$1.c(li.i, $$1x));
      this.b.accept(kw.a($$0).a(a(dfq.c, $$3, $$2)).a(e()));
   }

   private void r(csm $$0) {
      aer $$1 = lj.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<kz> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> kz.a().a(la.c, le.a(csn.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(csn.mZ);
      this.b
         .accept(
            kv.a(csn.mZ)
               .a(ku.a().a(dfq.aq, 0), this.a(0))
               .a(ku.a().a(dfq.aq, 1), this.a(1))
               .a(ku.a().a(dfq.bk, dfm.b), kz.a().a(la.c, le.a(csn.mZ, "_small_leaves")))
               .a(ku.a().a(dfq.bk, dfm.c), kz.a().a(la.c, le.a(csn.mZ, "_large_leaves")))
         );
   }

   private kx n() {
      return kx.a(dfq.P)
         .a(ha.a, kz.a().a(la.a, la.a.c))
         .a(ha.b, kz.a())
         .a(ha.c, kz.a().a(la.a, la.a.b))
         .a(ha.d, kz.a().a(la.a, la.a.b).a(la.b, la.a.c))
         .a(ha.e, kz.a().a(la.a, la.a.b).a(la.b, la.a.d))
         .a(ha.f, kz.a().a(la.a, la.a.b).a(la.b, la.a.b));
   }

   private void o() {
      aer $$0 = lh.a(csn.nU, "_top_open");
      this.b
         .accept(
            kw.a(csn.nU)
               .a(this.n())
               .a(
                  kx.a(dfq.u)
                     .a(false, kz.a().a(la.c, lj.e.create(csn.nU, this.c)))
                     .a(true, kz.a().a(la.c, lj.e.get(csn.nU).a($$1 -> $$1.a(li.f, $$0)).a(csn.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> kx a(dgd<T> $$0, T $$1, aer $$2, aer $$3) {
      kz $$4 = kz.a().a(la.c, $$2);
      kz $$5 = kz.a().a(la.c, $$3);
      return kx.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(csm $$0, Function<csm, lh> $$1) {
      lh $$2 = $$1.apply($$0).b(li.i, li.c);
      lh $$3 = $$2.c(li.g, lh.a($$0, "_front_honey"));
      aer $$4 = lg.o.a($$0, $$2, this.c);
      aer $$5 = lg.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(kw.a($$0).a(b()).a(a(dfq.aN, 5, $$5, $$4)));
   }

   private void a(csm $$0, dgd<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aer> $$3 = new Int2ObjectOpenHashMap();
         kx $$4 = kx.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aer $$5 = (aer)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, lg.aT, lh::g));
            return kz.a().a(la.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(kw.a($$0).a($$4));
      }
   }

   private void p() {
      aer $$0 = le.a(csn.od, "_floor");
      aer $$1 = le.a(csn.od, "_ceiling");
      aer $$2 = le.a(csn.od, "_wall");
      aer $$3 = le.a(csn.od, "_between_walls");
      this.a(cjb.vs);
      this.b
         .accept(
            kw.a(csn.od)
               .a(
                  kx.a(dfq.R, dfq.V)
                     .a(ha.c, dfo.a, kz.a().a(la.c, $$0))
                     .a(ha.d, dfo.a, kz.a().a(la.c, $$0).a(la.b, la.a.c))
                     .a(ha.f, dfo.a, kz.a().a(la.c, $$0).a(la.b, la.a.b))
                     .a(ha.e, dfo.a, kz.a().a(la.c, $$0).a(la.b, la.a.d))
                     .a(ha.c, dfo.b, kz.a().a(la.c, $$1))
                     .a(ha.d, dfo.b, kz.a().a(la.c, $$1).a(la.b, la.a.c))
                     .a(ha.f, dfo.b, kz.a().a(la.c, $$1).a(la.b, la.a.b))
                     .a(ha.e, dfo.b, kz.a().a(la.c, $$1).a(la.b, la.a.d))
                     .a(ha.c, dfo.c, kz.a().a(la.c, $$2).a(la.b, la.a.d))
                     .a(ha.d, dfo.c, kz.a().a(la.c, $$2).a(la.b, la.a.b))
                     .a(ha.f, dfo.c, kz.a().a(la.c, $$2))
                     .a(ha.e, dfo.c, kz.a().a(la.c, $$2).a(la.b, la.a.c))
                     .a(ha.d, dfo.d, kz.a().a(la.c, $$3).a(la.b, la.a.b))
                     .a(ha.c, dfo.d, kz.a().a(la.c, $$3).a(la.b, la.a.d))
                     .a(ha.f, dfo.d, kz.a().a(la.c, $$3))
                     .a(ha.e, dfo.d, kz.a().a(la.c, $$3).a(la.b, la.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            kw.a(csn.nZ, kz.a().a(la.c, le.a(csn.nZ)))
               .a(
                  kx.a(dfq.U, dfq.R)
                     .a(dfl.a, ha.c, kz.a())
                     .a(dfl.a, ha.f, kz.a().a(la.b, la.a.b))
                     .a(dfl.a, ha.d, kz.a().a(la.b, la.a.c))
                     .a(dfl.a, ha.e, kz.a().a(la.b, la.a.d))
                     .a(dfl.b, ha.c, kz.a().a(la.a, la.a.b))
                     .a(dfl.b, ha.f, kz.a().a(la.a, la.a.b).a(la.b, la.a.b))
                     .a(dfl.b, ha.d, kz.a().a(la.a, la.a.b).a(la.b, la.a.c))
                     .a(dfl.b, ha.e, kz.a().a(la.a, la.a.b).a(la.b, la.a.d))
                     .a(dfl.c, ha.d, kz.a().a(la.a, la.a.c))
                     .a(dfl.c, ha.e, kz.a().a(la.a, la.a.c).a(la.b, la.a.b))
                     .a(dfl.c, ha.c, kz.a().a(la.a, la.a.c).a(la.b, la.a.c))
                     .a(dfl.c, ha.f, kz.a().a(la.a, la.a.c).a(la.b, la.a.d))
               )
         );
   }

   private void d(csm $$0, lj.a $$1) {
      aer $$2 = $$1.create($$0, this.c);
      aer $$3 = lh.a($$0, "_front_on");
      aer $$4 = $$1.get($$0).a($$1x -> $$1x.a(li.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(kw.a($$0).a(a(dfq.r, $$4, $$2)).a(b()));
   }

   private void a(csm... $$0) {
      aer $$1 = le.a("campfire_off");

      for (csm $$2 : $$0) {
         aer $$3 = lg.ba.a($$2, lh.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(kw.a($$2).a(a(dfq.r, $$3, $$1)).a(c()));
      }
   }

   private void s(csm $$0) {
      aer $$1 = lg.br.a($$0, lh.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(csm $$0) {
      aer $$1;
      if ($$0 == csn.si) {
         $$1 = lg.bt.a($$0, lh.m($$0), this.c);
      } else {
         $$1 = lg.bs.a($$0, lh.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      lh $$0 = lh.a(lh.G(csn.cl), lh.G(csn.n));
      aer $$1 = lg.i.a(csn.cl, $$0, this.c);
      this.b.accept(c(csn.cl, $$1));
   }

   private void s() {
      this.a(cjb.ll);
      this.b
         .accept(
            kv.a(csn.cw)
               .a(
                  ku.b(
                     ku.a().a(dfq.ab, dgf.c).a(dfq.aa, dgf.c).a(dfq.ac, dgf.c).a(dfq.ad, dgf.c),
                     ku.a().a(dfq.ab, dgf.b, dgf.a).a(dfq.aa, dgf.b, dgf.a),
                     ku.a().a(dfq.aa, dgf.b, dgf.a).a(dfq.ac, dgf.b, dgf.a),
                     ku.a().a(dfq.ac, dgf.b, dgf.a).a(dfq.ad, dgf.b, dgf.a),
                     ku.a().a(dfq.ad, dgf.b, dgf.a).a(dfq.ab, dgf.b, dgf.a)
                  ),
                  kz.a().a(la.c, le.a("redstone_dust_dot"))
               )
               .a(ku.a().a(dfq.ab, dgf.b, dgf.a), kz.a().a(la.c, le.a("redstone_dust_side0")))
               .a(ku.a().a(dfq.ac, dgf.b, dgf.a), kz.a().a(la.c, le.a("redstone_dust_side_alt0")))
               .a(ku.a().a(dfq.aa, dgf.b, dgf.a), kz.a().a(la.c, le.a("redstone_dust_side_alt1")).a(la.b, la.a.d))
               .a(ku.a().a(dfq.ad, dgf.b, dgf.a), kz.a().a(la.c, le.a("redstone_dust_side1")).a(la.b, la.a.d))
               .a(ku.a().a(dfq.ab, dgf.a), kz.a().a(la.c, le.a("redstone_dust_up")))
               .a(ku.a().a(dfq.aa, dgf.a), kz.a().a(la.c, le.a("redstone_dust_up")).a(la.b, la.a.b))
               .a(ku.a().a(dfq.ac, dgf.a), kz.a().a(la.c, le.a("redstone_dust_up")).a(la.b, la.a.c))
               .a(ku.a().a(dfq.ad, dgf.a), kz.a().a(la.c, le.a("redstone_dust_up")).a(la.b, la.a.d))
         );
   }

   private void t() {
      this.a(cjb.lp);
      this.b
         .accept(
            kw.a(csn.gY)
               .a(c())
               .a(
                  kx.a(dfq.bd, dfq.w)
                     .a(dft.a, false, kz.a().a(la.c, le.a(csn.gY)))
                     .a(dft.a, true, kz.a().a(la.c, le.a(csn.gY, "_on")))
                     .a(dft.b, false, kz.a().a(la.c, le.a(csn.gY, "_subtract")))
                     .a(dft.b, true, kz.a().a(la.c, le.a(csn.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      lh $$0 = lh.a(csn.jR);
      lh $$1 = lh.a(lh.a(csn.jE, "_side"), $$0.a(li.f));
      aer $$2 = lg.Z.a(csn.jE, $$1, this.c);
      aer $$3 = lg.aa.a(csn.jE, $$1, this.c);
      aer $$4 = lg.i.b(csn.jE, "_double", $$1, this.c);
      this.b.accept(e(csn.jE, $$2, $$3, $$4));
      this.b.accept(c(csn.jR, lg.c.a(csn.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cjb.rB);
      this.b
         .accept(
            kv.a(csn.fs)
               .a(kz.a().a(la.c, lh.G(csn.fs)))
               .a(ku.a().a(dfq.k, true), kz.a().a(la.c, lh.a(csn.fs, "_bottle0")))
               .a(ku.a().a(dfq.l, true), kz.a().a(la.c, lh.a(csn.fs, "_bottle1")))
               .a(ku.a().a(dfq.m, true), kz.a().a(la.c, lh.a(csn.fs, "_bottle2")))
               .a(ku.a().a(dfq.k, false), kz.a().a(la.c, lh.a(csn.fs, "_empty0")))
               .a(ku.a().a(dfq.l, false), kz.a().a(la.c, lh.a(csn.fs, "_empty1")))
               .a(ku.a().a(dfq.m, false), kz.a().a(la.c, lh.a(csn.fs, "_empty2")))
         );
   }

   private void u(csm $$0) {
      aer $$1 = lg.bn.a($$0, lh.b($$0), this.c);
      aer $$2 = le.a("mushroom_block_inside");
      this.b
         .accept(
            kv.a($$0)
               .a(ku.a().a(dfq.L, true), kz.a().a(la.c, $$1))
               .a(ku.a().a(dfq.M, true), kz.a().a(la.c, $$1).a(la.b, la.a.b).a(la.d, true))
               .a(ku.a().a(dfq.N, true), kz.a().a(la.c, $$1).a(la.b, la.a.c).a(la.d, true))
               .a(ku.a().a(dfq.O, true), kz.a().a(la.c, $$1).a(la.b, la.a.d).a(la.d, true))
               .a(ku.a().a(dfq.J, true), kz.a().a(la.c, $$1).a(la.a, la.a.d).a(la.d, true))
               .a(ku.a().a(dfq.K, true), kz.a().a(la.c, $$1).a(la.a, la.a.b).a(la.d, true))
               .a(ku.a().a(dfq.L, false), kz.a().a(la.c, $$2))
               .a(ku.a().a(dfq.M, false), kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, false))
               .a(ku.a().a(dfq.N, false), kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, false))
               .a(ku.a().a(dfq.O, false), kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, false))
               .a(ku.a().a(dfq.J, false), kz.a().a(la.c, $$2).a(la.a, la.a.d).a(la.d, false))
               .a(ku.a().a(dfq.K, false), kz.a().a(la.c, $$2).a(la.a, la.a.b).a(la.d, false))
         );
      this.a($$0, lj.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cjb.qN);
      this.b
         .accept(
            kw.a(csn.eh)
               .a(
                  kx.a(dfq.ay)
                     .a(0, kz.a().a(la.c, le.a(csn.eh)))
                     .a(1, kz.a().a(la.c, le.a(csn.eh, "_slice1")))
                     .a(2, kz.a().a(la.c, le.a(csn.eh, "_slice2")))
                     .a(3, kz.a().a(la.c, le.a(csn.eh, "_slice3")))
                     .a(4, kz.a().a(la.c, le.a(csn.eh, "_slice4")))
                     .a(5, kz.a().a(la.c, le.a(csn.eh, "_slice5")))
                     .a(6, kz.a().a(la.c, le.a(csn.eh, "_slice6")))
               )
         );
   }

   private void x() {
      lh $$0 = new lh()
         .a(li.c, lh.a(csn.nX, "_side3"))
         .a(li.o, lh.G(csn.t))
         .a(li.n, lh.a(csn.nX, "_top"))
         .a(li.j, lh.a(csn.nX, "_side3"))
         .a(li.l, lh.a(csn.nX, "_side3"))
         .a(li.k, lh.a(csn.nX, "_side1"))
         .a(li.m, lh.a(csn.nX, "_side2"));
      this.b.accept(c(csn.nX, lg.a.a(csn.nX, $$0, this.c)));
   }

   private void y() {
      lh $$0 = new lh()
         .a(li.c, lh.a(csn.ob, "_front"))
         .a(li.o, lh.a(csn.ob, "_bottom"))
         .a(li.n, lh.a(csn.ob, "_top"))
         .a(li.j, lh.a(csn.ob, "_front"))
         .a(li.k, lh.a(csn.ob, "_front"))
         .a(li.l, lh.a(csn.ob, "_side"))
         .a(li.m, lh.a(csn.ob, "_side"));
      this.b.accept(c(csn.ob, lg.a.a(csn.ob, $$0, this.c)));
   }

   private void a(csm $$0, csm $$1, BiFunction<csm, csm, lh> $$2) {
      lh $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, lg.a.a($$0, $$3, this.c)));
   }

   public void b(csm $$0) {
      lh $$1 = new lh()
         .a(li.c, lh.a($$0, "_particle"))
         .a(li.o, lh.a($$0, "_down"))
         .a(li.n, lh.a($$0, "_up"))
         .a(li.j, lh.a($$0, "_north"))
         .a(li.k, lh.a($$0, "_south"))
         .a(li.l, lh.a($$0, "_east"))
         .a(li.m, lh.a($$0, "_west"));
      this.b.accept(c($$0, lg.a.a($$0, $$1, this.c)));
   }

   private void z() {
      lh $$0 = lh.k(csn.dV);
      this.b.accept(c(csn.dV, le.a(csn.dV)));
      this.a(csn.ef, $$0);
      this.a(csn.eg, $$0);
   }

   private void a(csm $$0, lh $$1) {
      aer $$2 = lg.n.a($$0, $$1.c(li.g, lh.G($$0)), this.c);
      this.b.accept(kw.a($$0, kz.a().a(la.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cjb.rC);
      this.m(csn.ft);
      this.b.accept(c(csn.fv, lg.bq.a(csn.fv, lh.j(lh.a(csn.H, "_still")), this.c)));
      this.b
         .accept(
            kw.a(csn.fu)
               .a(
                  kx.a(cws.e)
                     .a(1, kz.a().a(la.c, lg.bo.a(csn.fu, "_level1", lh.j(lh.a(csn.G, "_still")), this.c)))
                     .a(2, kz.a().a(la.c, lg.bp.a(csn.fu, "_level2", lh.j(lh.a(csn.G, "_still")), this.c)))
                     .a(3, kz.a().a(la.c, lg.bq.a(csn.fu, "_full", lh.j(lh.a(csn.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            kw.a(csn.fw)
               .a(
                  kx.a(cws.e)
                     .a(1, kz.a().a(la.c, lg.bo.a(csn.fw, "_level1", lh.j(lh.G(csn.qC)), this.c)))
                     .a(2, kz.a().a(la.c, lg.bp.a(csn.fw, "_level2", lh.j(lh.G(csn.qC)), this.c)))
                     .a(3, kz.a().a(la.c, lg.bq.a(csn.fw, "_full", lh.j(lh.G(csn.qC)), this.c)))
               )
         );
   }

   private void B() {
      lh $$0 = lh.b(csn.kv);
      aer $$1 = lg.aC.a(csn.kv, $$0, this.c);
      aer $$2 = this.a(csn.kv, "_dead", lg.aC, $$1x -> $$0.c(li.b, $$1x));
      this.b.accept(kw.a(csn.kv).a(a(dfq.au, 5, $$2, $$1)));
   }

   private void v(csm $$0) {
      lh $$1 = new lh().a(li.f, lh.a(csn.cD, "_top")).a(li.i, lh.a(csn.cD, "_side")).a(li.g, lh.a($$0, "_front"));
      lh $$2 = new lh().a(li.i, lh.a(csn.cD, "_top")).a(li.g, lh.a($$0, "_front_vertical"));
      aer $$3 = lg.n.a($$0, $$1, this.c);
      aer $$4 = lg.p.a($$0, $$2, this.c);
      this.b
         .accept(
            kw.a($$0)
               .a(
                  kx.a(dfq.P)
                     .a(ha.a, kz.a().a(la.c, $$4).a(la.a, la.a.c))
                     .a(ha.b, kz.a().a(la.c, $$4))
                     .a(ha.c, kz.a().a(la.c, $$3))
                     .a(ha.f, kz.a().a(la.c, $$3).a(la.b, la.a.b))
                     .a(ha.d, kz.a().a(la.c, $$3).a(la.b, la.a.c))
                     .a(ha.e, kz.a().a(la.c, $$3).a(la.b, la.a.d))
               )
         );
   }

   private void C() {
      aer $$0 = le.a(csn.fy);
      aer $$1 = le.a(csn.fy, "_filled");
      this.b.accept(kw.a(csn.fy).a(kx.a(dfq.h).a(false, kz.a().a(la.c, $$0)).a(true, kz.a().a(la.c, $$1))).a(c()));
   }

   private void D() {
      aer $$0 = le.a(csn.ku, "_side");
      aer $$1 = le.a(csn.ku, "_noside");
      aer $$2 = le.a(csn.ku, "_noside1");
      aer $$3 = le.a(csn.ku, "_noside2");
      aer $$4 = le.a(csn.ku, "_noside3");
      this.b
         .accept(
            kv.a(csn.ku)
               .a(ku.a().a(dfq.L, true), kz.a().a(la.c, $$0))
               .a(ku.a().a(dfq.M, true), kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.d, true))
               .a(ku.a().a(dfq.N, true), kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.d, true))
               .a(ku.a().a(dfq.O, true), kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.d, true))
               .a(ku.a().a(dfq.J, true), kz.a().a(la.c, $$0).a(la.a, la.a.d).a(la.d, true))
               .a(ku.a().a(dfq.K, true), kz.a().a(la.c, $$0).a(la.a, la.a.b).a(la.d, true))
               .a(ku.a().a(dfq.L, false), kz.a().a(la.c, $$1).a(la.e, 2), kz.a().a(la.c, $$2), kz.a().a(la.c, $$3), kz.a().a(la.c, $$4))
               .a(
                  ku.a().a(dfq.M, false),
                  kz.a().a(la.c, $$2).a(la.b, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$3).a(la.b, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$4).a(la.b, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.b, la.a.b).a(la.d, true)
               )
               .a(
                  ku.a().a(dfq.N, false),
                  kz.a().a(la.c, $$3).a(la.b, la.a.c).a(la.d, true),
                  kz.a().a(la.c, $$4).a(la.b, la.a.c).a(la.d, true),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.b, la.a.c).a(la.d, true),
                  kz.a().a(la.c, $$2).a(la.b, la.a.c).a(la.d, true)
               )
               .a(
                  ku.a().a(dfq.O, false),
                  kz.a().a(la.c, $$4).a(la.b, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.b, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$2).a(la.b, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$3).a(la.b, la.a.d).a(la.d, true)
               )
               .a(
                  ku.a().a(dfq.J, false),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.a, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$4).a(la.a, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$2).a(la.a, la.a.d).a(la.d, true),
                  kz.a().a(la.c, $$3).a(la.a, la.a.d).a(la.d, true)
               )
               .a(
                  ku.a().a(dfq.K, false),
                  kz.a().a(la.c, $$4).a(la.a, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$3).a(la.a, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$2).a(la.a, la.a.b).a(la.d, true),
                  kz.a().a(la.c, $$1).a(la.e, 2).a(la.a, la.a.b).a(la.d, true)
               )
         );
   }

   private void E() {
      this.b
         .accept(
            kv.a(csn.pc)
               .a(kz.a().a(la.c, lh.G(csn.pc)))
               .a(ku.a().a(dfq.aL, 1), kz.a().a(la.c, lh.a(csn.pc, "_contents1")))
               .a(ku.a().a(dfq.aL, 2), kz.a().a(la.c, lh.a(csn.pc, "_contents2")))
               .a(ku.a().a(dfq.aL, 3), kz.a().a(la.c, lh.a(csn.pc, "_contents3")))
               .a(ku.a().a(dfq.aL, 4), kz.a().a(la.c, lh.a(csn.pc, "_contents4")))
               .a(ku.a().a(dfq.aL, 5), kz.a().a(la.c, lh.a(csn.pc, "_contents5")))
               .a(ku.a().a(dfq.aL, 6), kz.a().a(la.c, lh.a(csn.pc, "_contents6")))
               .a(ku.a().a(dfq.aL, 7), kz.a().a(la.c, lh.a(csn.pc, "_contents7")))
               .a(ku.a().a(dfq.aL, 8), kz.a().a(la.c, lh.a(csn.pc, "_contents_ready")))
         );
   }

   private void w(csm $$0) {
      this.c($$0);
      this.b.accept(kw.a($$0, kz.a().a(la.c, lg.am.a($$0, lh.c($$0), this.c))).a(this.n()));
   }

   private void F() {
      this.w(csn.qy);
      this.w(csn.qx);
      this.w(csn.qw);
      this.w(csn.qv);
   }

   private void G() {
      this.c(csn.rs);
      kx.b<ha, dfx> $$0 = kx.a(dfq.bm, dfq.bn);

      for (dfx $$1 : dfx.values()) {
         $$0.a(ha.b, $$1, this.a(ha.b, $$1));
      }

      for (dfx $$2 : dfx.values()) {
         $$0.a(ha.a, $$2, this.a(ha.a, $$2));
      }

      this.b.accept(kw.a(csn.rs).a($$0));
   }

   private kz a(ha $$0, dfx $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      lh $$3 = lh.c(lh.a(csn.rs, $$2));
      return kz.a().a(la.c, lg.al.a(csn.rs, $$2, $$3, this.c));
   }

   private void x(csm $$0) {
      lh $$1 = new lh().a(li.e, lh.G(csn.dW)).a(li.f, lh.G($$0)).a(li.i, lh.a($$0, "_side"));
      this.b.accept(c($$0, lg.m.a($$0, $$1, this.c)));
   }

   private void H() {
      aer $$0 = lh.a(csn.gZ, "_side");
      lh $$1 = new lh().a(li.f, lh.a(csn.gZ, "_top")).a(li.i, $$0);
      lh $$2 = new lh().a(li.f, lh.a(csn.gZ, "_inverted_top")).a(li.i, $$0);
      this.b
         .accept(
            kw.a(csn.gZ)
               .a(kx.a(dfq.p).a(false, kz.a().a(la.c, lg.aD.a(csn.gZ, $$1, this.c))).a(true, kz.a().a(la.c, lg.aD.a(le.a(csn.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(csm $$0) {
      this.b.accept(kw.a($$0, kz.a().a(la.c, le.a($$0))).a(this.n()));
   }

   private void I() {
      csm $$0 = csn.rr;
      aer $$1 = le.a($$0, "_on");
      aer $$2 = le.a($$0);
      this.b.accept(kw.a($$0, kz.a().a(la.c, le.a($$0))).a(this.n()).a(a(dfq.w, $$1, $$2)));
   }

   private void J() {
      lh $$0 = new lh().a(li.B, lh.G(csn.j)).a(li.f, lh.G(csn.cC));
      lh $$1 = new lh().a(li.B, lh.G(csn.j)).a(li.f, lh.a(csn.cC, "_moist"));
      aer $$2 = lg.aU.a(csn.cC, $$0, this.c);
      aer $$3 = lg.aU.a(lh.a(csn.cC, "_moist"), $$1, this.c);
      this.b.accept(kw.a(csn.cC).a(a(dfq.aQ, 7, $$3, $$2)));
   }

   private List<aer> z(csm $$0) {
      aer $$1 = lg.aV.a(le.a($$0, "_floor0"), lh.v($$0), this.c);
      aer $$2 = lg.aV.a(le.a($$0, "_floor1"), lh.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aer> A(csm $$0) {
      aer $$1 = lg.aW.a(le.a($$0, "_side0"), lh.v($$0), this.c);
      aer $$2 = lg.aW.a(le.a($$0, "_side1"), lh.w($$0), this.c);
      aer $$3 = lg.aX.a(le.a($$0, "_side_alt0"), lh.v($$0), this.c);
      aer $$4 = lg.aX.a(le.a($$0, "_side_alt1"), lh.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aer> B(csm $$0) {
      aer $$1 = lg.aY.a(le.a($$0, "_up0"), lh.v($$0), this.c);
      aer $$2 = lg.aY.a(le.a($$0, "_up1"), lh.w($$0), this.c);
      aer $$3 = lg.aZ.a(le.a($$0, "_up_alt0"), lh.v($$0), this.c);
      aer $$4 = lg.aZ.a(le.a($$0, "_up_alt1"), lh.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<kz> a(List<aer> $$0, UnaryOperator<kz> $$1) {
      return $$0.stream().map($$0x -> kz.a().a(la.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void K() {
      ku $$0 = ku.a().a(dfq.L, false).a(dfq.M, false).a(dfq.N, false).a(dfq.O, false).a(dfq.J, false);
      List<aer> $$1 = this.z(csn.cr);
      List<aer> $$2 = this.A(csn.cr);
      List<aer> $$3 = this.B(csn.cr);
      this.b
         .accept(
            kv.a(csn.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(ku.b(ku.a().a(dfq.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(ku.b(ku.a().a(dfq.M, true), $$0), a($$2, $$0x -> $$0x.a(la.b, la.a.b)))
               .a(ku.b(ku.a().a(dfq.N, true), $$0), a($$2, $$0x -> $$0x.a(la.b, la.a.c)))
               .a(ku.b(ku.a().a(dfq.O, true), $$0), a($$2, $$0x -> $$0x.a(la.b, la.a.d)))
               .a(ku.a().a(dfq.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void L() {
      List<aer> $$0 = this.z(csn.cs);
      List<aer> $$1 = this.A(csn.cs);
      this.b
         .accept(
            kv.a(csn.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(la.b, la.a.b)))
               .a(a($$1, $$0x -> $$0x.a(la.b, la.a.c)))
               .a(a($$1, $$0x -> $$0x.a(la.b, la.a.d)))
         );
   }

   private void C(csm $$0) {
      aer $$1 = lj.s.create($$0, this.c);
      aer $$2 = lj.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(kw.a($$0).a(a(dfq.j, $$2, $$1)));
   }

   private void M() {
      lh $$0 = lh.a(lh.a(csn.ad, "_side"), lh.a(csn.ad, "_top"));
      aer $$1 = lg.i.a(csn.ad, $$0, this.c);
      this.b.accept(d(csn.ad, $$1));
   }

   private void N() {
      this.a(cjb.Q);
      csm $$0 = csn.E;
      kx.b<Boolean, Integer> $$1 = kx.a(cxe.c, cxe.a);
      aer $$2 = le.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aer $$4 = le.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, kz.a().a(la.c, $$4));
         $$1.a(false, $$3, kz.a().a(la.c, $$2));
      }

      this.b.accept(kw.a(csn.E).a($$1));
   }

   private void O() {
      this.b
         .accept(
            kw.a(csn.kI)
               .a(
                  kx.a(dfq.as)
                     .a(0, kz.a().a(la.c, this.a(csn.kI, "_0", lg.c, lh::b)))
                     .a(1, kz.a().a(la.c, this.a(csn.kI, "_1", lg.c, lh::b)))
                     .a(2, kz.a().a(la.c, this.a(csn.kI, "_2", lg.c, lh::b)))
                     .a(3, kz.a().a(la.c, this.a(csn.kI, "_3", lg.c, lh::b)))
               )
         );
   }

   private void P() {
      aer $$0 = lh.G(csn.j);
      lh $$1 = new lh().a(li.e, $$0).b(li.e, li.c).a(li.f, lh.a(csn.i, "_top")).a(li.i, lh.a(csn.i, "_snow"));
      kz $$2 = kz.a().a(la.c, lg.m.a(csn.i, "_snow", $$1, this.c));
      this.a(csn.i, le.a(csn.i), $$2);
      aer $$3 = lj.e.get(csn.fl).a($$1x -> $$1x.a(li.e, $$0)).a(csn.fl, this.c);
      this.a(csn.fl, $$3, $$2);
      aer $$4 = lj.e.get(csn.l).a($$1x -> $$1x.a(li.e, $$0)).a(csn.l, this.c);
      this.a(csn.l, $$4, $$2);
   }

   private void a(csm $$0, aer $$1, kz $$2) {
      List<kz> $$3 = Arrays.asList(a($$1));
      this.b.accept(kw.a($$0).a(kx.a(dfq.z).a(true, $$2).a(false, $$3)));
   }

   private void Q() {
      this.a(cjb.qt);
      this.b
         .accept(
            kw.a(csn.fC)
               .a(
                  kx.a(dfq.ar)
                     .a(0, kz.a().a(la.c, le.a(csn.fC, "_stage0")))
                     .a(1, kz.a().a(la.c, le.a(csn.fC, "_stage1")))
                     .a(2, kz.a().a(la.c, le.a(csn.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void R() {
      this.b.accept(b(csn.kE, le.a(csn.kE)));
   }

   private void g(csm $$0, csm $$1) {
      lh $$2 = lh.b($$1);
      aer $$3 = lg.W.a($$0, $$2, this.c);
      aer $$4 = lg.X.a($$0, $$2, this.c);
      this.b.accept(kw.a($$0).a(a(dfq.aT, 1, $$4, $$3)));
   }

   private void S() {
      aer $$0 = le.a(csn.hc);
      aer $$1 = le.a(csn.hc, "_side");
      this.a(cjb.lv);
      this.b
         .accept(
            kw.a(csn.hc)
               .a(
                  kx.a(dfq.Q)
                     .a(ha.a, kz.a().a(la.c, $$0))
                     .a(ha.c, kz.a().a(la.c, $$1))
                     .a(ha.f, kz.a().a(la.c, $$1).a(la.b, la.a.b))
                     .a(ha.d, kz.a().a(la.c, $$1).a(la.b, la.a.c))
                     .a(ha.e, kz.a().a(la.c, $$1).a(la.b, la.a.d))
               )
         );
   }

   private void h(csm $$0, csm $$1) {
      aer $$2 = le.a($$0);
      this.b.accept(kw.a($$1, kz.a().a(la.c, $$2)));
      this.a($$1, $$2);
   }

   private void T() {
      aer $$0 = le.a(csn.eX, "_post_ends");
      aer $$1 = le.a(csn.eX, "_post");
      aer $$2 = le.a(csn.eX, "_cap");
      aer $$3 = le.a(csn.eX, "_cap_alt");
      aer $$4 = le.a(csn.eX, "_side");
      aer $$5 = le.a(csn.eX, "_side_alt");
      this.b
         .accept(
            kv.a(csn.eX)
               .a(kz.a().a(la.c, $$0))
               .a(ku.a().a(dfq.L, false).a(dfq.M, false).a(dfq.N, false).a(dfq.O, false), kz.a().a(la.c, $$1))
               .a(ku.a().a(dfq.L, true).a(dfq.M, false).a(dfq.N, false).a(dfq.O, false), kz.a().a(la.c, $$2))
               .a(ku.a().a(dfq.L, false).a(dfq.M, true).a(dfq.N, false).a(dfq.O, false), kz.a().a(la.c, $$2).a(la.b, la.a.b))
               .a(ku.a().a(dfq.L, false).a(dfq.M, false).a(dfq.N, true).a(dfq.O, false), kz.a().a(la.c, $$3))
               .a(ku.a().a(dfq.L, false).a(dfq.M, false).a(dfq.N, false).a(dfq.O, true), kz.a().a(la.c, $$3).a(la.b, la.a.b))
               .a(ku.a().a(dfq.L, true), kz.a().a(la.c, $$4))
               .a(ku.a().a(dfq.M, true), kz.a().a(la.c, $$4).a(la.b, la.a.b))
               .a(ku.a().a(dfq.N, true), kz.a().a(la.c, $$5))
               .a(ku.a().a(dfq.O, true), kz.a().a(la.c, $$5).a(la.b, la.a.b))
         );
      this.d(csn.eX);
   }

   private void D(csm $$0) {
      this.b.accept(kw.a($$0, kz.a().a(la.c, le.a($$0))).a(b()));
   }

   private void U() {
      aer $$0 = le.a(csn.dw);
      aer $$1 = le.a(csn.dw, "_on");
      this.d(csn.dw);
      this.b
         .accept(
            kw.a(csn.dw)
               .a(a(dfq.w, $$0, $$1))
               .a(
                  kx.a(dfq.U, dfq.R)
                     .a(dfl.c, ha.c, kz.a().a(la.a, la.a.c).a(la.b, la.a.c))
                     .a(dfl.c, ha.f, kz.a().a(la.a, la.a.c).a(la.b, la.a.d))
                     .a(dfl.c, ha.d, kz.a().a(la.a, la.a.c))
                     .a(dfl.c, ha.e, kz.a().a(la.a, la.a.c).a(la.b, la.a.b))
                     .a(dfl.a, ha.c, kz.a())
                     .a(dfl.a, ha.f, kz.a().a(la.b, la.a.b))
                     .a(dfl.a, ha.d, kz.a().a(la.b, la.a.c))
                     .a(dfl.a, ha.e, kz.a().a(la.b, la.a.d))
                     .a(dfl.b, ha.c, kz.a().a(la.a, la.a.b))
                     .a(dfl.b, ha.f, kz.a().a(la.a, la.a.b).a(la.b, la.a.b))
                     .a(dfl.b, ha.d, kz.a().a(la.a, la.a.b).a(la.b, la.a.c))
                     .a(dfl.b, ha.e, kz.a().a(la.a, la.a.b).a(la.b, la.a.d))
               )
         );
   }

   private void V() {
      this.d(csn.fm);
      this.b.accept(b(csn.fm, le.a(csn.fm)));
   }

   private void W() {
      this.d(csn.sm);
      this.b.accept(c(csn.sm, le.a(csn.sm)));
   }

   private void X() {
      this.b.accept(kw.a(csn.ee).a(kx.a(dfq.H).a(ha.a.a, kz.a().a(la.c, le.a(csn.ee, "_ns"))).a(ha.a.c, kz.a().a(la.c, le.a(csn.ee, "_ew")))));
   }

   private void Y() {
      aer $$0 = lj.a.create(csn.dW, this.c);
      this.b
         .accept(
            kw.a(
               csn.dW,
               kz.a().a(la.c, $$0),
               kz.a().a(la.c, $$0).a(la.a, la.a.b),
               kz.a().a(la.c, $$0).a(la.a, la.a.c),
               kz.a().a(la.c, $$0).a(la.a, la.a.d),
               kz.a().a(la.c, $$0).a(la.b, la.a.b),
               kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.a, la.a.b),
               kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.a, la.a.c),
               kz.a().a(la.c, $$0).a(la.b, la.a.b).a(la.a, la.a.d),
               kz.a().a(la.c, $$0).a(la.b, la.a.c),
               kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.a, la.a.b),
               kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.a, la.a.c),
               kz.a().a(la.c, $$0).a(la.b, la.a.c).a(la.a, la.a.d),
               kz.a().a(la.c, $$0).a(la.b, la.a.d),
               kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.a, la.a.b),
               kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.a, la.a.c),
               kz.a().a(la.c, $$0).a(la.b, la.a.d).a(la.a, la.a.d)
            )
         );
   }

   private void Z() {
      aer $$0 = le.a(csn.kO);
      aer $$1 = le.a(csn.kO, "_on");
      this.b.accept(kw.a(csn.kO).a(a(dfq.w, $$1, $$0)).a(e()));
   }

   private void aa() {
      lh $$0 = new lh().a(li.e, lh.a(csn.by, "_bottom")).a(li.i, lh.a(csn.by, "_side"));
      aer $$1 = lh.a(csn.by, "_top_sticky");
      aer $$2 = lh.a(csn.by, "_top");
      lh $$3 = $$0.c(li.E, $$1);
      lh $$4 = $$0.c(li.E, $$2);
      aer $$5 = le.a(csn.by, "_base");
      this.a(csn.by, $$5, $$4);
      this.a(csn.br, $$5, $$3);
      aer $$6 = lg.m.a(csn.by, "_inventory", $$0.c(li.f, $$2), this.c);
      aer $$7 = lg.m.a(csn.br, "_inventory", $$0.c(li.f, $$1), this.c);
      this.a(csn.by, $$6);
      this.a(csn.br, $$7);
   }

   private void a(csm $$0, aer $$1, lh $$2) {
      aer $$3 = lg.bf.a($$0, $$2, this.c);
      this.b.accept(kw.a($$0).a(a(dfq.g, $$1, $$3)).a(e()));
   }

   private void ab() {
      lh $$0 = new lh().a(li.F, lh.a(csn.by, "_top")).a(li.i, lh.a(csn.by, "_side"));
      lh $$1 = $$0.c(li.E, lh.a(csn.by, "_top_sticky"));
      lh $$2 = $$0.c(li.E, lh.a(csn.by, "_top"));
      this.b
         .accept(
            kw.a(csn.bz)
               .a(
                  kx.a(dfq.x, dfq.bg)
                     .a(false, dgc.a, kz.a().a(la.c, lg.bg.a(csn.by, "_head", $$2, this.c)))
                     .a(false, dgc.b, kz.a().a(la.c, lg.bg.a(csn.by, "_head_sticky", $$1, this.c)))
                     .a(true, dgc.a, kz.a().a(la.c, lg.bh.a(csn.by, "_head_short", $$2, this.c)))
                     .a(true, dgc.b, kz.a().a(la.c, lg.bh.a(csn.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ac() {
      aer $$0 = le.a(csn.qD, "_inactive");
      aer $$1 = le.a(csn.qD, "_active");
      this.a(csn.qD, $$0);
      this.b.accept(kw.a(csn.qD).a(kx.a(dfq.bo).a($$2 -> kz.a().a(la.c, $$2 != dgh.b && $$2 != dgh.c ? $$0 : $$1))));
   }

   private void ad() {
      aer $$0 = le.a(csn.qE, "_inactive");
      aer $$1 = le.a(csn.qE, "_active");
      this.a(csn.qE, $$0);
      this.b.accept(kw.a(csn.qE).a(kx.a(dfq.bo).a($$2 -> kz.a().a(la.c, $$2 != dgh.b && $$2 != dgh.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      aer $$0 = lg.bK.a(csn.qI, lh.a(false), this.c);
      aer $$1 = lg.bK.a(csn.qI, "_can_summon", lh.a(true), this.c);
      this.a(csn.qI, $$0);
      this.b.accept(kw.a(csn.qI).a(a(dfq.G, $$1, $$0)));
   }

   private void af() {
      aer $$0 = le.a(csn.nS, "_stable");
      aer $$1 = le.a(csn.nS, "_unstable");
      this.a(csn.nS, $$0);
      this.b.accept(kw.a(csn.nS).a(a(dfq.b, $$1, $$0)));
   }

   private void ag() {
      aer $$0 = this.a(csn.ru, "", lg.am, lh::c);
      aer $$1 = this.a(csn.ru, "_lit", lg.am, lh::c);
      this.b.accept(kw.a(csn.ru).a(a(dfq.D, $$1, $$0)));
      aer $$2 = this.a(csn.rv, "", lg.am, lh::c);
      aer $$3 = this.a(csn.rv, "_lit", lg.am, lh::c);
      this.b.accept(kw.a(csn.rv).a(a(dfq.D, $$3, $$2)));
   }

   private void ah() {
      aer $$0 = lj.a.create(csn.fB, this.c);
      aer $$1 = this.a(csn.fB, "_on", lg.c, lh::b);
      this.b.accept(kw.a(csn.fB).a(a(dfq.r, $$1, $$0)));
   }

   private void i(csm $$0, csm $$1) {
      lh $$2 = lh.y($$0);
      this.b.accept(c($$0, lg.bd.a($$0, $$2, this.c)));
      this.b.accept(kw.a($$1, kz.a().a(la.c, lg.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      lh $$0 = lh.y(csn.dK);
      lh $$1 = lh.i(lh.a(csn.dK, "_off"));
      aer $$2 = lg.bd.a(csn.dK, $$0, this.c);
      aer $$3 = lg.bd.a(csn.dK, "_off", $$1, this.c);
      this.b.accept(kw.a(csn.dK).a(a(dfq.r, $$2, $$3)));
      aer $$4 = lg.be.a(csn.dL, $$0, this.c);
      aer $$5 = lg.be.a(csn.dL, "_off", $$1, this.c);
      this.b.accept(kw.a(csn.dL).a(a(dfq.r, $$4, $$5)).a(d()));
      this.d(csn.dK);
      this.c(csn.dL);
   }

   private void aj() {
      this.a(cjb.lo);
      this.b.accept(kw.a(csn.ei).a(kx.a(dfq.aA, dfq.s, dfq.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return kz.a().a(la.c, lh.a(csn.ei, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(cjb.cx);
      this.b
         .accept(
            kw.a(csn.mV)
               .a(
                  kx.a(dfq.aS, dfq.C)
                     .a(1, false, Arrays.asList(a(le.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(le.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(le.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(le.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(le.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(le.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(le.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(le.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      lh $$0 = lh.a(csn.dN);
      aer $$1 = lg.c.a(csn.dP, $$0, this.c);
      this.b.accept(kw.a(csn.dN).a(kx.a(dfq.aF).a($$1x -> kz.a().a(la.c, $$1x < 8 ? le.a(csn.dN, "_height" + $$1x * 2) : $$1))));
      this.a(csn.dN, le.a(csn.dN, "_height2"));
      this.b.accept(c(csn.dP, $$1));
   }

   private void am() {
      this.b.accept(kw.a(csn.oc, kz.a().a(la.c, le.a(csn.oc))).a(b()));
   }

   private void an() {
      aer $$0 = lj.a.create(csn.pa, this.c);
      this.a(csn.pa, $$0);
      this.b.accept(kw.a(csn.pa).a(kx.a(dfq.bj).a($$0x -> kz.a().a(la.c, this.a(csn.pa, "_" + $$0x.c(), lg.c, lh::b)))));
   }

   private void ao() {
      this.a(cjb.vv);
      this.b.accept(kw.a(csn.oi).a(kx.a(dfq.as).a($$0 -> kz.a().a(la.c, this.a(csn.oi, "_stage" + $$0, lg.am, lh::c)))));
   }

   private void ap() {
      this.a(cjb.oE);
      this.b
         .accept(
            kw.a(csn.fI)
               .a(
                  kx.a(dfq.a, dfq.M, dfq.L, dfq.N, dfq.O)
                     .a(false, false, false, false, false, kz.a().a(la.c, le.a(csn.fI, "_ns")))
                     .a(false, true, false, false, false, kz.a().a(la.c, le.a(csn.fI, "_n")).a(la.b, la.a.b))
                     .a(false, false, true, false, false, kz.a().a(la.c, le.a(csn.fI, "_n")))
                     .a(false, false, false, true, false, kz.a().a(la.c, le.a(csn.fI, "_n")).a(la.b, la.a.c))
                     .a(false, false, false, false, true, kz.a().a(la.c, le.a(csn.fI, "_n")).a(la.b, la.a.d))
                     .a(false, true, true, false, false, kz.a().a(la.c, le.a(csn.fI, "_ne")))
                     .a(false, true, false, true, false, kz.a().a(la.c, le.a(csn.fI, "_ne")).a(la.b, la.a.b))
                     .a(false, false, false, true, true, kz.a().a(la.c, le.a(csn.fI, "_ne")).a(la.b, la.a.c))
                     .a(false, false, true, false, true, kz.a().a(la.c, le.a(csn.fI, "_ne")).a(la.b, la.a.d))
                     .a(false, false, true, true, false, kz.a().a(la.c, le.a(csn.fI, "_ns")))
                     .a(false, true, false, false, true, kz.a().a(la.c, le.a(csn.fI, "_ns")).a(la.b, la.a.b))
                     .a(false, true, true, true, false, kz.a().a(la.c, le.a(csn.fI, "_nse")))
                     .a(false, true, false, true, true, kz.a().a(la.c, le.a(csn.fI, "_nse")).a(la.b, la.a.b))
                     .a(false, false, true, true, true, kz.a().a(la.c, le.a(csn.fI, "_nse")).a(la.b, la.a.c))
                     .a(false, true, true, false, true, kz.a().a(la.c, le.a(csn.fI, "_nse")).a(la.b, la.a.d))
                     .a(false, true, true, true, true, kz.a().a(la.c, le.a(csn.fI, "_nsew")))
                     .a(true, false, false, false, false, kz.a().a(la.c, le.a(csn.fI, "_attached_ns")))
                     .a(true, false, true, false, false, kz.a().a(la.c, le.a(csn.fI, "_attached_n")))
                     .a(true, false, false, true, false, kz.a().a(la.c, le.a(csn.fI, "_attached_n")).a(la.b, la.a.c))
                     .a(true, true, false, false, false, kz.a().a(la.c, le.a(csn.fI, "_attached_n")).a(la.b, la.a.b))
                     .a(true, false, false, false, true, kz.a().a(la.c, le.a(csn.fI, "_attached_n")).a(la.b, la.a.d))
                     .a(true, true, true, false, false, kz.a().a(la.c, le.a(csn.fI, "_attached_ne")))
                     .a(true, true, false, true, false, kz.a().a(la.c, le.a(csn.fI, "_attached_ne")).a(la.b, la.a.b))
                     .a(true, false, false, true, true, kz.a().a(la.c, le.a(csn.fI, "_attached_ne")).a(la.b, la.a.c))
                     .a(true, false, true, false, true, kz.a().a(la.c, le.a(csn.fI, "_attached_ne")).a(la.b, la.a.d))
                     .a(true, false, true, true, false, kz.a().a(la.c, le.a(csn.fI, "_attached_ns")))
                     .a(true, true, false, false, true, kz.a().a(la.c, le.a(csn.fI, "_attached_ns")).a(la.b, la.a.b))
                     .a(true, true, true, true, false, kz.a().a(la.c, le.a(csn.fI, "_attached_nse")))
                     .a(true, true, false, true, true, kz.a().a(la.c, le.a(csn.fI, "_attached_nse")).a(la.b, la.a.b))
                     .a(true, false, true, true, true, kz.a().a(la.c, le.a(csn.fI, "_attached_nse")).a(la.b, la.a.c))
                     .a(true, true, true, false, true, kz.a().a(la.c, le.a(csn.fI, "_attached_nse")).a(la.b, la.a.d))
                     .a(true, true, true, true, true, kz.a().a(la.c, le.a(csn.fI, "_attached_nsew")))
               )
         );
   }

   private void aq() {
      this.d(csn.fH);
      this.b.accept(kw.a(csn.fH).a(kx.a(dfq.a, dfq.w).a(($$0, $$1) -> kz.a().a(la.c, lh.a(csn.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aer a(int $$0, String $$1, lh $$2) {
      switch ($$0) {
         case 1:
            return lg.bj.a(le.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return lg.bk.a(le.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return lg.bl.a(le.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return lg.bm.a(le.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private aer a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", lh.b(lh.G(csn.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", lh.b(lh.a(csn.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", lh.b(lh.a(csn.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ar() {
      this.a(cjb.jT);
      this.b.accept(kw.a(csn.mf).a(kx.a(dfq.aD, dfq.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void as() {
      this.a(cjb.jU);
      Function<Integer, aer> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         lh $$2 = lh.a($$1);
         return lg.bu.a(csn.mg, $$1, $$2, this.c);
      };
      this.b.accept(kw.a(csn.mg).a(kx.a(czu.b).a($$1 -> kz.a().a(la.c, $$0.apply($$1)))));
   }

   private void E(csm $$0) {
      this.d($$0);
      aer $$1 = le.a($$0);
      kv $$2 = kv.a($$0);
      ku.c $$3 = ac.a(ku.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dfr, Function<aer, kz>> $$4 : a) {
         dfr $$5 = (dfr)$$4.getFirst();
         Function<aer, kz> $$6 = (Function<aer, kz>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(ku.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void at() {
      aer $$0 = lh.a(csn.qH, "_bottom");
      lh $$1 = new lh().a(li.e, $$0).a(li.f, lh.a(csn.qH, "_top")).a(li.i, lh.a(csn.qH, "_side"));
      lh $$2 = new lh().a(li.e, $$0).a(li.f, lh.a(csn.qH, "_top_bloom")).a(li.i, lh.a(csn.qH, "_side_bloom"));
      aer $$3 = lg.m.a(csn.qH, "", $$1, this.c);
      aer $$4 = lg.m.a(csn.qH, "_bloom", $$2, this.c);
      this.b.accept(kw.a(csn.qH).a(kx.a(dfq.E).a($$2x -> kz.a().a(la.c, $$2x ? $$4 : $$3))));
      this.a(cjb.fN, $$3);
   }

   private void au() {
      csm $$0 = csn.cm;
      aer $$1 = le.a($$0);
      kv $$2 = kv.a($$0);
      Map.of(ha.c, la.a.a, ha.f, la.a.b, ha.d, la.a.c, ha.e, la.a.d).forEach(($$2x, $$3) -> {
         ku.c $$4 = ku.a().a(dfq.R, $$2x);
         $$2.a($$4, kz.a().a(la.c, $$1).a(la.b, $$3).a(la.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, le.a($$0, "_inventory"));
      i.clear();
   }

   private void a(kv $$0, ku.c $$1, la.a $$2) {
      Map.of(dfq.bp, lg.aK, dfq.bq, lg.aL, dfq.br, lg.aM, dfq.bs, lg.aN, dfq.bt, lg.aO, dfq.bu, lg.aP).forEach(($$3, $$4) -> {
         this.a($$0, $$1, $$2, $$3, $$4, true);
         this.a($$0, $$1, $$2, $$3, $$4, false);
      });
   }

   private void a(kv $$0, ku.c $$1, la.a $$2, dfr $$3, lf $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      lh $$7 = new lh().a(li.b, lh.a(csn.cm, $$6));
      kq.d $$8 = new kq.d($$4, $$6);
      aer $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(csn.cm, $$6, $$7, this.c));
      $$0.a(ku.a($$1, ku.a().a($$3, $$5)), kz.a().a(la.c, $$9).a(la.b, $$2));
   }

   private void av() {
      this.b.accept(c(csn.kJ, lg.c.a(csn.kJ, lh.b(le.a("magma")), this.c)));
   }

   private void F(csm $$0) {
      this.b($$0, lj.p);
      lg.bB.a(le.a($$0.k()), lh.u($$0), this.c);
   }

   private void b(csm $$0, csm $$1, kq.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(csm $$0, csm $$1) {
      lg.bC.a(le.a($$0.k()), lh.u($$1), this.c);
   }

   private void aw() {
      aer $$0 = le.a(csn.b);
      aer $$1 = le.a(csn.b, "_mirrored");
      this.b.accept(a(csn.eO, $$0, $$1));
      this.a(csn.eO, $$0);
   }

   private void ax() {
      aer $$0 = le.a(csn.rI);
      aer $$1 = le.a(csn.rI, "_mirrored");
      this.b.accept(a(csn.sc, $$0, $$1).a(f()));
      this.a(csn.sc, $$0);
   }

   private void k(csm $$0, csm $$1) {
      this.a($$0, kq.e.b);
      lh $$2 = lh.d(lh.a($$0, "_pot"));
      aer $$3 = kq.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void ay() {
      aer $$0 = lh.a(csn.pl, "_bottom");
      aer $$1 = lh.a(csn.pl, "_top_off");
      aer $$2 = lh.a(csn.pl, "_top");
      aer[] $$3 = new aer[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         lh $$5 = new lh().a(li.e, $$0).a(li.f, $$4 == 0 ? $$1 : $$2).a(li.i, lh.a(csn.pl, "_side" + $$4));
         $$3[$$4] = lg.m.a(csn.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(kw.a(csn.pl).a(kx.a(dfq.aZ).a($$1x -> kz.a().a(la.c, $$3[$$1x]))));
      this.a(cjb.vT, $$3[0]);
   }

   private kz a(hc $$0, kz $$1) {
      switch ($$0) {
         case b:
            return $$1.a(la.a, la.a.b);
         case c:
            return $$1.a(la.a, la.a.b).a(la.b, la.a.c);
         case d:
            return $$1.a(la.a, la.a.b).a(la.b, la.a.d);
         case a:
            return $$1.a(la.a, la.a.b).a(la.b, la.a.b);
         case f:
            return $$1.a(la.a, la.a.d).a(la.b, la.a.c);
         case g:
            return $$1.a(la.a, la.a.d);
         case h:
            return $$1.a(la.a, la.a.d).a(la.b, la.a.b);
         case e:
            return $$1.a(la.a, la.a.d).a(la.b, la.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(la.b, la.a.c);
         case i:
            return $$1.a(la.b, la.a.d);
         case j:
            return $$1.a(la.b, la.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void az() {
      aer $$0 = lh.a(csn.pb, "_top");
      aer $$1 = lh.a(csn.pb, "_bottom");
      aer $$2 = lh.a(csn.pb, "_side");
      aer $$3 = lh.a(csn.pb, "_lock");
      lh $$4 = new lh().a(li.o, $$2).a(li.m, $$2).a(li.l, $$2).a(li.c, $$0).a(li.j, $$0).a(li.k, $$1).a(li.n, $$3);
      aer $$5 = lg.b.a(csn.pb, $$4, this.c);
      this.b.accept(kw.a(csn.pb, kz.a().a(la.c, $$5)).a(kx.a(dfq.T).a($$0x -> this.a($$0x, kz.a()))));
   }

   private void aA() {
      csm $$0 = csn.n;
      aer $$1 = le.a($$0);
      lj $$2 = lj.a.get($$0);
      csm $$3 = csn.jH;
      aer $$4 = lg.Z.a($$3, $$2.b(), this.c);
      aer $$5 = lg.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      je.a().filter(jf::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(csn.qS).a(je.w).a(csn.ri).a(je.y);
      this.h(csn.qR).a(je.A).a(csn.rh).a(je.C);
      this.h(csn.qQ).a(je.E).a(csn.rg).a(je.G);
      this.h(csn.qP).a(je.I).a(csn.rf).a(je.K);
      this.m(csn.a);
      this.a(csn.nc, csn.a);
      this.a(csn.nb, csn.a);
      this.m(csn.fO);
      this.m(csn.dQ);
      this.a(csn.nd, csn.G);
      this.m(csn.fA);
      this.m(csn.me);
      this.m(csn.fr);
      this.m(csn.fR);
      this.a(cjb.tk);
      this.m(csn.pg);
      this.m(csn.G);
      this.m(csn.H);
      this.m(csn.hV);
      this.a(cjb.fw);
      this.l(csn.pM, csn.qd);
      this.l(csn.pN, csn.qe);
      this.l(csn.pO, csn.qf);
      this.l(csn.pP, csn.qg);
      this.l(csn.pQ, csn.qh);
      this.l(csn.pR, csn.qi);
      this.l(csn.pS, csn.qj);
      this.l(csn.pT, csn.qk);
      this.l(csn.pU, csn.ql);
      this.l(csn.pV, csn.qm);
      this.l(csn.pW, csn.qn);
      this.l(csn.pX, csn.qo);
      this.l(csn.pY, csn.qp);
      this.l(csn.pZ, csn.qq);
      this.l(csn.qa, csn.qr);
      this.l(csn.qb, csn.qs);
      this.l(csn.pL, csn.qc);
      this.m(csn.na);
      this.m(csn.gs);
      this.m(csn.qC);
      this.m(csn.rw);
      this.s(csn.rx);
      this.s(csn.ry);
      this.t(csn.sh);
      this.t(csn.si);
      this.ag();
      this.e(csn.rB, csn.rz);
      this.p(csn.rA);
      this.a(csn.hW, cjb.hf);
      this.a(cjb.hf);
      this.aB();
      this.a(csn.kN, cjb.iF);
      this.a(cjb.iF);
      this.f(csn.bQ, lh.a(csn.by, "_side"));
      this.a(csn.R);
      this.a(csn.S);
      this.a(csn.iB);
      this.a(csn.cx);
      this.a(csn.cy);
      this.a(csn.cz);
      this.a(csn.fE);
      this.a(csn.fF);
      this.a(csn.fJ);
      this.a(csn.N);
      this.a(csn.T);
      this.a(csn.O);
      this.a(csn.ch);
      this.a(csn.P);
      this.a(csn.Q);
      this.a(csn.ci);
      this.b(csn.pj, lj.c);
      this.a(csn.pi);
      this.a(csn.aR);
      this.a(csn.aS);
      this.a(csn.aT);
      this.a(csn.hb);
      this.a(csn.dI);
      this.a(csn.dJ);
      this.a(csn.ha);
      this.a(csn.pC);
      this.a(csn.mW);
      this.a(csn.dR);
      this.a(csn.k);
      this.a(csn.pk);
      this.a(csn.fz);
      this.a(csn.ed);
      this.a(csn.L);
      this.a(csn.ph);
      this.a(csn.dO);
      this.b(csn.dT, lj.f);
      this.b(csn.pq, lj.c);
      this.b(csn.fa, lj.c);
      this.m(csn.ac);
      this.m(csn.ga);
      this.a(csn.kK);
      this.a(csn.aY);
      this.a(csn.iC);
      this.a(csn.co);
      this.a(csn.pK);
      this.a(csn.ii);
      this.a(csn.oy);
      this.a(csn.dX);
      this.a(csn.dY);
      this.a(csn.ct);
      this.a(csn.aO);
      this.b(csn.bw, lj.u);
      this.a(cjb.cw);
      this.b(csn.ck, lj.e);
      this.b(csn.pd, lj.c);
      this.a(csn.op);
      this.a(csn.aP);
      this.a(csn.qt);
      this.a(csn.qu);
      this.a(csn.qA);
      this.a(csn.qz);
      this.a(csn.rt);
      this.a(csn.se);
      this.a(csn.sf);
      this.a(csn.sg);
      this.e(csn.qF);
      this.aA();
      this.a(csn.qN);
      this.a(csn.qO);
      this.a(csn.qM);
      this.a(csn.qL);
      this.a(csn.qK);
      this.a(csn.qJ);
      this.h(csn.qM, csn.rb);
      this.h(csn.qL, csn.rd);
      this.h(csn.qK, csn.rc);
      this.h(csn.qJ, csn.re);
      this.g(csn.gW, csn.ch);
      this.g(csn.gX, csn.ci);
      this.F();
      this.r();
      this.au();
      this.v();
      this.w();
      this.a(csn.og, csn.oh);
      this.x();
      this.A();
      this.B();
      this.D();
      this.E();
      this.H();
      this.C();
      this.y(csn.kt);
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
      this.E(csn.ff);
      this.E(csn.fg);
      this.E(csn.qG);
      this.av();
      this.az();
      this.ac();
      this.ad();
      this.ae();
      this.W();
      this.N();
      this.M();
      this.D(csn.cO);
      this.d(csn.cO);
      this.D(csn.oa);
      this.g();
      this.D(csn.rD);
      this.i(csn.cp, csn.cq);
      this.i(csn.eb, csn.ec);
      this.a(csn.cA, csn.n, lh::c);
      this.a(csn.nY, csn.p, lh::d);
      this.x(csn.ow);
      this.x(csn.on);
      this.v(csn.aU);
      this.v(csn.hi);
      this.C(csn.oe);
      this.C(csn.of);
      this.e(csn.eY, le.a(csn.eY));
      this.a(csn.dZ, lj.c);
      this.a(csn.ea, lj.c);
      this.a(csn.sd);
      this.a(csn.kM, lj.c);
      this.f(csn.j);
      this.f(csn.rG);
      this.f(csn.I);
      this.g(csn.J);
      this.g(csn.M);
      this.f(csn.K);
      this.e(csn.F);
      this.b(csn.sn, lj.e);
      this.a(csn.ij, lj.c, lj.d);
      this.a(csn.kx, lj.v, lj.w);
      this.a(csn.hf, lj.v, lj.w);
      this.a(csn.sj, lj.c, lj.d);
      this.a(csn.sk, lj.c, lj.d);
      this.a(csn.sl, lj.c, lj.d);
      this.c(csn.nT, lj.h);
      this.z();
      this.a(csn.pe, lh::A);
      this.a(csn.pf, lh::C);
      this.a(csn.kD, dfq.as, 0, 1, 2, 3);
      this.a(csn.gt, dfq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csn.fq, dfq.as, 0, 1, 1, 2);
      this.a(csn.gu, dfq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csn.cB, dfq.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(csn.kA, kq.e.b, dfq.aq, 0, 1);
      this.i();
      this.h();
      this.a(le.a("decorated_pot"), csn.iA).b(csn.so);
      this.a(le.a("banner"), csn.n)
         .a(lg.bD, csn.iJ, csn.iK, csn.iL, csn.iM, csn.iN, csn.iO, csn.iP, csn.iQ, csn.iR, csn.iS, csn.iT, csn.iU, csn.iV, csn.iW, csn.iX, csn.iY)
         .b(csn.iZ, csn.ja, csn.jb, csn.jc, csn.jd, csn.je, csn.jf, csn.jg, csn.jh, csn.ji, csn.jj, csn.jk, csn.jl, csn.jm, csn.jn, csn.jo);
      this.a(le.a("bed"), csn.n)
         .b(csn.aZ, csn.ba, csn.bb, csn.bc, csn.bd, csn.be, csn.bf, csn.bg, csn.bh, csn.bi, csn.bj, csn.bk, csn.bl, csn.bm, csn.bn, csn.bo);
      this.j(csn.aZ, csn.bA);
      this.j(csn.ba, csn.bB);
      this.j(csn.bb, csn.bC);
      this.j(csn.bc, csn.bD);
      this.j(csn.bd, csn.bE);
      this.j(csn.be, csn.bF);
      this.j(csn.bf, csn.bG);
      this.j(csn.bg, csn.bH);
      this.j(csn.bh, csn.bI);
      this.j(csn.bi, csn.bJ);
      this.j(csn.bj, csn.bK);
      this.j(csn.bk, csn.bL);
      this.j(csn.bl, csn.bM);
      this.j(csn.bm, csn.bN);
      this.j(csn.bn, csn.bO);
      this.j(csn.bo, csn.bP);
      this.a(le.a("skull"), csn.dX)
         .a(lg.bE, csn.gM, csn.gK, csn.gI, csn.gE, csn.gG, csn.gQ)
         .a(csn.gO)
         .b(csn.gN, csn.gP, csn.gL, csn.gJ, csn.gF, csn.gH, csn.gR);
      this.F(csn.kP);
      this.F(csn.kQ);
      this.F(csn.kR);
      this.F(csn.kS);
      this.F(csn.kT);
      this.F(csn.kU);
      this.F(csn.kV);
      this.F(csn.kW);
      this.F(csn.kX);
      this.F(csn.kY);
      this.F(csn.kZ);
      this.F(csn.la);
      this.F(csn.lb);
      this.F(csn.lc);
      this.F(csn.ld);
      this.F(csn.le);
      this.F(csn.lf);
      this.b(csn.mX, lj.p);
      this.c(csn.mX);
      this.a(le.a("chest"), csn.n).b(csn.cv, csn.gV);
      this.a(le.a("ender_chest"), csn.co).b(csn.fG);
      this.d(csn.fx, csn.co).a(csn.fx, csn.kF);
      this.a(csn.aM);
      this.a(csn.aN);
      this.a(csn.lw);
      this.a(csn.lx);
      this.a(csn.ly);
      this.a(csn.lz);
      this.a(csn.lA);
      this.a(csn.lB);
      this.a(csn.lC);
      this.a(csn.lD);
      this.a(csn.lE);
      this.a(csn.lF);
      this.a(csn.lG);
      this.a(csn.lH);
      this.a(csn.lI);
      this.a(csn.lJ);
      this.a(csn.lK);
      this.a(csn.lL);
      this.a(lj.a, csn.lM, csn.lN, csn.lO, csn.lP, csn.lQ, csn.lR, csn.lS, csn.lT, csn.lU, csn.lV, csn.lW, csn.lX, csn.lY, csn.lZ, csn.ma, csn.mb);
      this.a(csn.iA);
      this.a(csn.hj);
      this.a(csn.hk);
      this.a(csn.hl);
      this.a(csn.hm);
      this.a(csn.hn);
      this.a(csn.ho);
      this.a(csn.hp);
      this.a(csn.hq);
      this.a(csn.hr);
      this.a(csn.hs);
      this.a(csn.ht);
      this.a(csn.hu);
      this.a(csn.hv);
      this.a(csn.hw);
      this.a(csn.hx);
      this.a(csn.hy);
      this.a(csn.qB);
      this.f(csn.aQ, csn.eZ);
      this.f(csn.ej, csn.hz);
      this.f(csn.ek, csn.hA);
      this.f(csn.el, csn.hB);
      this.f(csn.em, csn.hC);
      this.f(csn.en, csn.hD);
      this.f(csn.eo, csn.hE);
      this.f(csn.ep, csn.hF);
      this.f(csn.eq, csn.hG);
      this.f(csn.er, csn.hH);
      this.f(csn.es, csn.hI);
      this.f(csn.et, csn.hJ);
      this.f(csn.eu, csn.hK);
      this.f(csn.ev, csn.hL);
      this.f(csn.ew, csn.hM);
      this.f(csn.ex, csn.hN);
      this.f(csn.ey, csn.hO);
      this.b(lj.n, csn.lg, csn.lh, csn.li, csn.lj, csn.lk, csn.ll, csn.lm, csn.ln, csn.lo, csn.lp, csn.lq, csn.lr, csn.ls, csn.lt, csn.lu, csn.lv);
      this.e(csn.bA, csn.ik);
      this.e(csn.bB, csn.il);
      this.e(csn.bC, csn.im);
      this.e(csn.bD, csn.in);
      this.e(csn.bE, csn.io);
      this.e(csn.bF, csn.ip);
      this.e(csn.bG, csn.iq);
      this.e(csn.bH, csn.ir);
      this.e(csn.bI, csn.is);
      this.e(csn.bJ, csn.it);
      this.e(csn.bK, csn.iu);
      this.e(csn.bL, csn.iv);
      this.e(csn.bM, csn.iw);
      this.e(csn.bN, csn.ix);
      this.e(csn.bO, csn.iy);
      this.e(csn.bP, csn.iz);
      this.a(csn.rH);
      this.a(csn.eM);
      this.a(csn.bu, csn.gb, kq.e.a);
      this.a(csn.bR, csn.gc, kq.e.b);
      this.a(csn.bT, csn.gd, kq.e.b);
      this.a(csn.bU, csn.ge, kq.e.b);
      this.a(csn.bV, csn.gf, kq.e.b);
      this.a(csn.bW, csn.gg, kq.e.b);
      this.a(csn.bX, csn.gh, kq.e.b);
      this.a(csn.bY, csn.gi, kq.e.b);
      this.a(csn.bZ, csn.gj, kq.e.b);
      this.a(csn.ca, csn.gk, kq.e.b);
      this.a(csn.cb, csn.gl, kq.e.b);
      this.a(csn.cc, csn.gm, kq.e.b);
      this.a(csn.ce, csn.gn, kq.e.b);
      this.a(csn.cd, csn.go, kq.e.b);
      this.a(csn.cg, csn.gp, kq.e.b);
      this.a(csn.cf, csn.gq, kq.e.b);
      this.a(csn.bv, csn.gr, kq.e.b);
      this.a(csn.bS, csn.fS, kq.e.b);
      this.G();
      this.u(csn.eU);
      this.u(csn.eV);
      this.u(csn.eW);
      this.a(csn.bt, kq.e.a);
      this.b(csn.dS, kq.e.a);
      this.a(cjb.dn);
      this.b(csn.mc, csn.md, kq.e.b);
      this.a(cjb.do);
      this.c(csn.md);
      this.b(csn.rF, kq.e.b);
      this.c(csn.rF);
      this.c(csn.rv);
      this.b(csn.oz, csn.oA, kq.e.b);
      this.b(csn.oB, csn.oC, kq.e.b);
      this.a(csn.oz, "_plant");
      this.c(csn.oA);
      this.a(csn.oB, "_plant");
      this.c(csn.oC);
      this.a(csn.mY, kq.e.a, lh.c(lh.a(csn.mZ, "_stage0")));
      this.m();
      this.a(csn.bs, kq.e.b);
      this.c(csn.iE, kq.e.b);
      this.c(csn.iF, kq.e.b);
      this.c(csn.iG, kq.e.b);
      this.c(csn.iH, kq.e.a);
      this.c(csn.iI, kq.e.a);
      this.j();
      this.k();
      this.l();
      this.a(csn.mw, csn.mr, csn.mm, csn.mh, csn.mG, csn.mB, csn.mQ, csn.mL);
      this.a(csn.mx, csn.ms, csn.mn, csn.mi, csn.mH, csn.mC, csn.mR, csn.mM);
      this.a(csn.my, csn.mt, csn.mo, csn.mj, csn.mI, csn.mD, csn.mS, csn.mN);
      this.a(csn.mz, csn.mu, csn.mp, csn.mk, csn.mJ, csn.mE, csn.mT, csn.mO);
      this.a(csn.mA, csn.mv, csn.mq, csn.ml, csn.mK, csn.mF, csn.mU, csn.mP);
      this.c(csn.fe, csn.fc);
      this.c(csn.fd, csn.fb);
      this.l(csn.ab).c(csn.ab).a(csn.av);
      this.l(csn.am).c(csn.am).a(csn.aD);
      this.a(csn.am, csn.dj, csn.ds);
      this.b(csn.aL, lj.r);
      this.l(csn.Y).c(csn.Y).a(csn.as);
      this.l(csn.ai).c(csn.ai).a(csn.aA);
      this.a(csn.ai, csn.dd, csn.do);
      this.a(csn.B, csn.fX, kq.e.b);
      this.b(csn.aI, lj.r);
      this.l(csn.Z).d(csn.Z).a(csn.at);
      this.l(csn.aj).d(csn.aj).a(csn.aB);
      this.a(csn.aj, csn.de, csn.dp);
      this.a(csn.C, csn.fY, kq.e.b);
      this.b(csn.aJ, lj.r);
      this.l(csn.W).c(csn.W).a(csn.aq);
      this.l(csn.ag).c(csn.ag).a(csn.ay);
      this.a(csn.ag, csn.dc, csn.dn);
      this.a(csn.z, csn.fV, kq.e.b);
      this.b(csn.aG, lj.r);
      this.l(csn.U).c(csn.U).a(csn.ao);
      this.l(csn.al).c(csn.al).a(csn.aw);
      this.a(csn.al, csn.da, csn.dl);
      this.a(csn.x, csn.fT, kq.e.b);
      this.b(csn.aE, lj.r);
      this.l(csn.V).c(csn.V).a(csn.ap);
      this.l(csn.af).c(csn.af).a(csn.ax);
      this.a(csn.af, csn.db, csn.dm);
      this.a(csn.y, csn.fU, kq.e.b);
      this.b(csn.aF, lj.r);
      this.l(csn.aa).c(csn.aa).a(csn.au);
      this.l(csn.ak).c(csn.ak).a(csn.aC);
      this.a(csn.ak, csn.dg, csn.dr);
      this.a(csn.D, csn.fZ, kq.e.b);
      this.b(csn.aK, lj.r);
      this.l(csn.X).c(csn.X).a(csn.ar);
      this.l(csn.ah).c(csn.ah).a(csn.az);
      this.a(csn.ah, csn.df, csn.dq);
      this.a(csn.A, csn.fW, kq.e.b);
      this.b(csn.aH, lj.r);
      this.l(csn.os).b(csn.os).a(csn.ou);
      this.l(csn.ot).b(csn.ot).a(csn.ov);
      this.a(csn.ot, csn.dh, csn.dt);
      this.a(csn.ox, csn.pm, kq.e.b);
      this.k(csn.oD, csn.po);
      this.l(csn.oj).b(csn.oj).a(csn.ol);
      this.l(csn.ok).b(csn.ok).a(csn.om);
      this.a(csn.ok, csn.di, csn.du);
      this.a(csn.oo, csn.pn, kq.e.b);
      this.k(csn.oq, csn.pp);
      this.l(csn.ae).d(csn.ae);
      this.l(csn.an).d(csn.an);
      this.a(csn.v, csn.dk, csn.dv);
      this.b(csn.or, kq.e.b);
      this.a(cjb.dk);
      this.i(csn.dy);
      this.k(csn.hY);
      this.u();
      this.n(csn.cP);
      this.o(csn.bp);
      this.o(csn.bq);
      this.o(csn.hh);
      this.t();
      this.q(csn.fN);
      this.q(csn.kG);
      this.q(csn.kH);
      this.r(csn.gS);
      this.r(csn.gT);
      this.r(csn.gU);
      this.o();
      this.p();
      this.d(csn.cD, lj.g);
      this.d(csn.nW, lj.g);
      this.d(csn.nV, lj.h);
      this.s();
      this.ay();
      this.at();
      this.h(csn.eL, csn.eT);
      this.h(csn.m, csn.eP);
      this.h(csn.eK, csn.eS);
      this.h(csn.eJ, csn.eR);
      this.aw();
      this.h(csn.eI, csn.eQ);
      this.ax();
      ckd.h().forEach($$0 -> this.a($$0, le.b("template_spawn_egg")));
   }

   private void aB() {
      this.c(csn.hX);
      kx.a<Integer> $$0 = kx.a(dfq.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aer $$3 = lh.a(cjb.hg, $$2);
         $$0.a($$1, kz.a().a(la.c, lg.Y.a(csn.hX, $$2, lh.h($$3), this.c)));
         lg.bv.a(le.a(cjb.hg, $$2), lh.k($$3), this.c);
      }

      this.b.accept(kw.a(csn.hX).a($$0));
   }

   private void l(csm $$0, csm $$1) {
      this.a($$0.k());
      lh $$2 = lh.b(lh.G($$0));
      lh $$3 = lh.b(lh.a($$0, "_lit"));
      aer $$4 = lg.bF.a($$0, "_one_candle", $$2, this.c);
      aer $$5 = lg.bG.a($$0, "_two_candles", $$2, this.c);
      aer $$6 = lg.bH.a($$0, "_three_candles", $$2, this.c);
      aer $$7 = lg.bI.a($$0, "_four_candles", $$2, this.c);
      aer $$8 = lg.bF.a($$0, "_one_candle_lit", $$3, this.c);
      aer $$9 = lg.bG.a($$0, "_two_candles_lit", $$3, this.c);
      aer $$10 = lg.bH.a($$0, "_three_candles_lit", $$3, this.c);
      aer $$11 = lg.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            kw.a($$0)
               .a(
                  kx.a(dfq.az, dfq.r)
                     .a(1, false, kz.a().a(la.c, $$4))
                     .a(2, false, kz.a().a(la.c, $$5))
                     .a(3, false, kz.a().a(la.c, $$6))
                     .a(4, false, kz.a().a(la.c, $$7))
                     .a(1, true, kz.a().a(la.c, $$8))
                     .a(2, true, kz.a().a(la.c, $$9))
                     .a(3, true, kz.a().a(la.c, $$10))
                     .a(4, true, kz.a().a(la.c, $$11))
               )
         );
      aer $$12 = lg.bJ.a($$1, lh.a($$0, false), this.c);
      aer $$13 = lg.bJ.a($$1, "_lit", lh.a($$0, true), this.c);
      this.b.accept(kw.a($$1).a(a(dfq.r, $$13, $$12)));
   }

   class a {
      private final aer b;

      public a(aer $$0, csm $$1) {
         this.b = lg.Y.a($$0, lh.u($$1), kq.this.c);
      }

      public kq.a a(csm... $$0) {
         for (csm $$1 : $$0) {
            kq.this.b.accept(kq.c($$1, this.b));
         }

         return this;
      }

      public kq.a b(csm... $$0) {
         for (csm $$1 : $$0) {
            kq.this.c($$1);
         }

         return this.a($$0);
      }

      public kq.a a(lf $$0, csm... $$1) {
         for (csm $$2 : $$1) {
            $$0.a(le.a($$2.k()), lh.u($$2), kq.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final lh b;
      private final Map<lf, aer> c = Maps.newHashMap();
      @Nullable
      private jf d;
      @Nullable
      private aer e;

      public b(lh $$0) {
         this.b = $$0;
      }

      public kq.b a(csm $$0, lf $$1) {
         this.e = $$1.a($$0, this.b, kq.this.c);
         if (kq.this.f.containsKey($$0)) {
            kq.this.b.accept(kq.this.f.get($$0).create($$0, this.e, this.b, kq.this.c));
         } else {
            kq.this.b.accept(kq.c($$0, this.e));
         }

         return this;
      }

      public kq.b a(csm... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (csm $$1 : $$0) {
               kq.this.b.accept(kq.c($$1, this.e));
               kq.this.a($$1, this.e);
            }

            return this;
         }
      }

      public kq.b a(csm $$0) {
         aer $$1 = lg.q.a($$0, this.b, kq.this.c);
         aer $$2 = lg.r.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.b($$0, $$1, $$2));
         aer $$3 = lg.s.a($$0, this.b, kq.this.c);
         kq.this.a($$0, $$3);
         return this;
      }

      public kq.b b(csm $$0) {
         aer $$1 = lg.K.a($$0, this.b, kq.this.c);
         aer $$2 = lg.L.a($$0, this.b, kq.this.c);
         aer $$3 = lg.M.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.a($$0, $$1, $$2, $$3));
         aer $$4 = lg.N.a($$0, this.b, kq.this.c);
         kq.this.a($$0, $$4);
         return this;
      }

      public kq.b c(csm $$0) {
         lh $$1 = lh.p($$0);
         aer $$2 = lg.B.a($$0, $$1, kq.this.c);
         aer $$3 = lg.C.a($$0, $$1, kq.this.c);
         aer $$4 = lg.D.a($$0, $$1, kq.this.c);
         aer $$5 = lg.E.a($$0, $$1, kq.this.c);
         aer $$6 = lg.F.a($$0, $$1, kq.this.c);
         kq.this.b.accept(kq.a($$0, $$2, $$3, $$4, $$5, $$6));
         aer $$7 = lg.G.a($$0, $$1, kq.this.c);
         kq.this.a($$0, $$7);
         return this;
      }

      public kq.b d(csm $$0) {
         aer $$1 = lg.H.a($$0, this.b, kq.this.c);
         aer $$2 = lg.I.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.c($$0, $$1, $$2));
         aer $$3 = lg.J.a($$0, this.b, kq.this.c);
         kq.this.a($$0, $$3);
         return this;
      }

      public kq.b e(csm $$0) {
         lh $$1 = lh.p($$0);
         aer $$2 = lg.P.a($$0, $$1, kq.this.c);
         aer $$3 = lg.O.a($$0, $$1, kq.this.c);
         aer $$4 = lg.R.a($$0, $$1, kq.this.c);
         aer $$5 = lg.Q.a($$0, $$1, kq.this.c);
         kq.this.b.accept(kq.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public kq.b f(csm $$0) {
         aer $$1 = lg.T.a($$0, this.b, kq.this.c);
         aer $$2 = lg.S.a($$0, this.b, kq.this.c);
         aer $$3 = lg.V.a($$0, this.b, kq.this.c);
         aer $$4 = lg.U.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public kq.b g(csm $$0) {
         aer $$1 = lg.W.a($$0, this.b, kq.this.c);
         aer $$2 = lg.X.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.e($$0, $$1, $$2));
         return this;
      }

      public kq.b h(csm $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            csm $$1 = this.d.b().get(jf.b.r);
            aer $$2 = lg.Y.a($$0, this.b, kq.this.c);
            kq.this.b.accept(kq.c($$0, $$2));
            kq.this.b.accept(kq.c($$1, $$2));
            kq.this.a($$0.k());
            kq.this.c($$1);
            return this;
         }
      }

      public kq.b i(csm $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aer $$1 = this.a(lg.Z, $$0);
            aer $$2 = this.a(lg.aa, $$0);
            kq.this.b.accept(kq.e($$0, $$1, $$2, this.e));
            kq.this.a($$0, $$1);
            return this;
         }
      }

      public kq.b j(csm $$0) {
         aer $$1 = this.a(lg.ad, $$0);
         aer $$2 = this.a(lg.ac, $$0);
         aer $$3 = this.a(lg.ae, $$0);
         kq.this.b.accept(kq.b($$0, $$1, $$2, $$3));
         kq.this.a($$0, $$2);
         return this;
      }

      private kq.b k(csm $$0) {
         lj $$1 = kq.this.g.getOrDefault($$0, lj.a.get($$0));
         kq.this.b.accept(kq.c($$0, $$1.a($$0, kq.this.c)));
         return this;
      }

      private kq.b l(csm $$0) {
         kq.this.i($$0);
         return this;
      }

      private void m(csm $$0) {
         if (kq.this.e.contains($$0)) {
            kq.this.k($$0);
         } else {
            kq.this.j($$0);
         }
      }

      private aer a(lf $$0, csm $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, kq.this.c));
      }

      public kq.b a(jf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<kq.b, csm> $$2 = kq.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      kt create(csm var1, aer var2, lh var3, BiConsumer<aer, Supplier<JsonElement>> var4);
   }

   static record d(lf a, String b) {
   }

   static enum e {
      a,
      b;

      public lf a() {
         return this == a ? lg.an : lg.am;
      }

      public lf b() {
         return this == a ? lg.ap : lg.ao;
      }
   }

   class f {
      private final lh b;

      public f(lh $$0) {
         this.b = $$0;
      }

      public kq.f a(csm $$0) {
         lh $$1 = this.b.c(li.d, this.b.a(li.i));
         aer $$2 = lg.i.a($$0, $$1, kq.this.c);
         kq.this.b.accept(kq.d($$0, $$2));
         return this;
      }

      public kq.f b(csm $$0) {
         aer $$1 = lg.i.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.d($$0, $$1));
         return this;
      }

      public kq.f c(csm $$0) {
         aer $$1 = lg.i.a($$0, this.b, kq.this.c);
         aer $$2 = lg.j.a($$0, this.b, kq.this.c);
         kq.this.b.accept(kq.d($$0, $$1, $$2));
         return this;
      }

      public kq.f d(csm $$0) {
         kq.this.b.accept(kq.a($$0, this.b, kq.this.c));
         return this;
      }
   }
}
