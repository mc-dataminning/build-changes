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

public class ns {
   final Consumer<nv> b;
   final BiConsumer<ale, Supplier<JsonElement>> c;
   private final Consumer<cvn> d;
   final List<dhm> e = ImmutableList.of(dho.ey, dho.eE, dho.hY);
   final Map<dhm, ns.c> f = ImmutableMap.builder().put(dho.b, ns::a).put(dho.sJ, ns::c).put(dho.eM, ns::b).build();
   final Map<dhm, ol> g = ImmutableMap.builder()
      .put(dho.aV, ol.y.get(dho.aV))
      .put(dho.jp, ol.y.get(dho.jp))
      .put(dho.jS, ol.a(oj.a(dho.aV, "_top")))
      .put(dho.jU, ol.a(oj.a(dho.jp, "_top")))
      .put(dho.aX, ol.d.get(dho.aV).a($$0x -> $$0x.a(ok.i, oj.G(dho.aX))))
      .put(dho.jr, ol.d.get(dho.jp).a($$0x -> $$0x.a(ok.i, oj.G(dho.jr))))
      .put(dho.hd, ol.d.get(dho.hd))
      .put(dho.jT, ol.a(oj.a(dho.hd, "_bottom")))
      .put(dho.pr, ol.z.get(dho.pr))
      .put(dho.sJ, ol.z.get(dho.sJ))
      .put(dho.he, ol.d.get(dho.he).a($$0x -> $$0x.a(ok.i, oj.G(dho.he))))
      .put(dho.aW, ol.d.get(dho.aW).a($$0x -> {
         $$0x.a(ok.d, oj.a(dho.aV, "_top"));
         $$0x.a(ok.i, oj.G(dho.aW));
      }))
      .put(dho.jq, ol.d.get(dho.jq).a($$0x -> {
         $$0x.a(ok.d, oj.a(dho.jp, "_top"));
         $$0x.a(ok.i, oj.G(dho.jq));
      }))
      .put(dho.qM, ol.z.get(dho.qM))
      .put(dho.qH, ol.z.get(dho.qH))
      .build();
   static final Map<lz.b, BiConsumer<ns.b, dhm>> h = ImmutableMap.builder()
      .put(lz.b.a, ns.b::a)
      .put(lz.b.e, ns.b::l)
      .put(lz.b.b, ns.b::k)
      .put(lz.b.c, ns.b::k)
      .put(lz.b.f, ns.b::c)
      .put(lz.b.g, ns.b::d)
      .put(lz.b.h, ns.b::e)
      .put(lz.b.i, ns.b::f)
      .put(lz.b.k, ns.b::h)
      .put(lz.b.l, ns.b::i)
      .put(lz.b.m, ns.b::j)
      .put(lz.b.n, ns.b::g)
      .put(lz.b.p, ns.b::m)
      .put(lz.b.q, ns.b::b)
      .build();
   public static final List<Pair<dvj, Function<ale, ob>>> a = List.of(
      Pair.of(dvi.L, (Function<ale, ob>)$$0 -> ob.a().a(oc.c, $$0)),
      Pair.of(dvi.M, (Function<ale, ob>)$$0 -> ob.a().a(oc.c, $$0).a(oc.b, oc.a.b).a(oc.d, true)),
      Pair.of(dvi.N, (Function<ale, ob>)$$0 -> ob.a().a(oc.c, $$0).a(oc.b, oc.a.c).a(oc.d, true)),
      Pair.of(dvi.O, (Function<ale, ob>)$$0 -> ob.a().a(oc.c, $$0).a(oc.b, oc.a.d).a(oc.d, true)),
      Pair.of(dvi.J, (Function<ale, ob>)$$0 -> ob.a().a(oc.c, $$0).a(oc.a, oc.a.d).a(oc.d, true)),
      Pair.of(dvi.K, (Function<ale, ob>)$$0 -> ob.a().a(oc.c, $$0).a(oc.a, oc.a.b).a(oc.d, true))
   );
   private static final Map<ns.d, ale> i = new HashMap<>();

   private static nv a(dhm $$0, ale $$1, oj $$2, BiConsumer<ale, Supplier<JsonElement>> $$3) {
      ale $$4 = oi.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nv b(dhm $$0, ale $$1, oj $$2, BiConsumer<ale, Supplier<JsonElement>> $$3) {
      ale $$4 = oi.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nv c(dhm $$0, ale $$1, oj $$2, BiConsumer<ale, Supplier<JsonElement>> $$3) {
      ale $$4 = oi.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ns(Consumer<nv> $$0, BiConsumer<ale, Supplier<JsonElement>> $$1, Consumer<cvn> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dhm $$0) {
      this.d.accept($$0.q());
   }

   void a(dhm $$0, ale $$1) {
      this.c.accept(og.a($$0.q()), new of($$1));
   }

   private void a(cvn $$0, ale $$1) {
      this.c.accept(og.a($$0), new of($$1));
   }

   void a(cvn $$0) {
      oi.bz.a(og.a($$0), oj.b($$0), this.c);
   }

   private void d(dhm $$0) {
      cvn $$1 = $$0.q();
      if ($$1 != cvw.a) {
         oi.bz.a(og.a($$1), oj.F($$0), this.c);
      }
   }

   private void a(dhm $$0, String $$1) {
      cvn $$2 = $$0.q();
      oi.bz.a(og.a($$2), oj.k(oj.a($$0, $$1)), this.c);
   }

   private static nz b() {
      return nz.a(dvi.R).a(jk.f, ob.a().a(oc.b, oc.a.b)).a(jk.d, ob.a().a(oc.b, oc.a.c)).a(jk.e, ob.a().a(oc.b, oc.a.d)).a(jk.c, ob.a());
   }

   private static nz c() {
      return nz.a(dvi.R).a(jk.d, ob.a()).a(jk.e, ob.a().a(oc.b, oc.a.b)).a(jk.c, ob.a().a(oc.b, oc.a.c)).a(jk.f, ob.a().a(oc.b, oc.a.d));
   }

   private static nz d() {
      return nz.a(dvi.R).a(jk.f, ob.a()).a(jk.d, ob.a().a(oc.b, oc.a.b)).a(jk.e, ob.a().a(oc.b, oc.a.c)).a(jk.c, ob.a().a(oc.b, oc.a.d));
   }

   private static nz e() {
      return nz.a(dvi.P)
         .a(jk.a, ob.a().a(oc.a, oc.a.b))
         .a(jk.b, ob.a().a(oc.a, oc.a.d))
         .a(jk.c, ob.a())
         .a(jk.d, ob.a().a(oc.b, oc.a.c))
         .a(jk.e, ob.a().a(oc.b, oc.a.d))
         .a(jk.f, ob.a().a(oc.b, oc.a.b));
   }

   private static ny b(dhm $$0, ale $$1) {
      return ny.a($$0, a($$1));
   }

   private static ob[] a(ale $$0) {
      return new ob[]{ob.a().a(oc.c, $$0), ob.a().a(oc.c, $$0).a(oc.b, oc.a.b), ob.a().a(oc.c, $$0).a(oc.b, oc.a.c), ob.a().a(oc.c, $$0).a(oc.b, oc.a.d)};
   }

   private static ny a(dhm $$0, ale $$1, ale $$2) {
      return ny.a($$0, ob.a().a(oc.c, $$1), ob.a().a(oc.c, $$2), ob.a().a(oc.c, $$1).a(oc.b, oc.a.c), ob.a().a(oc.c, $$2).a(oc.b, oc.a.c));
   }

   private static nz a(dvj $$0, ale $$1, ale $$2) {
      return nz.a($$0).a(true, ob.a().a(oc.c, $$1)).a(false, ob.a().a(oc.c, $$2));
   }

   private void e(dhm $$0) {
      ale $$1 = ol.a.create($$0, this.c);
      ale $$2 = ol.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dhm $$0) {
      ale $$1 = ol.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dhm $$0) {
      this.b.accept(ny.a($$0).a(nz.a(dvi.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ale $$3 = oj.a($$0, $$2);
         return ob.a().a(oc.c, oi.c.a($$0, $$2, new oj().a(ok.a, $$3), this.c));
      })));
      this.a($$0, oj.a($$0, "_0"));
   }

   static nv b(dhm $$0, ale $$1, ale $$2) {
      return ny.a($$0)
         .a(nz.a(dvi.w).a(false, ob.a().a(oc.c, $$1)).a(true, ob.a().a(oc.c, $$2)))
         .a(
            nz.a(dvi.U, dvi.R)
               .a(dvd.a, jk.f, ob.a().a(oc.b, oc.a.b))
               .a(dvd.a, jk.e, ob.a().a(oc.b, oc.a.d))
               .a(dvd.a, jk.d, ob.a().a(oc.b, oc.a.c))
               .a(dvd.a, jk.c, ob.a())
               .a(dvd.b, jk.f, ob.a().a(oc.b, oc.a.b).a(oc.a, oc.a.b).a(oc.d, true))
               .a(dvd.b, jk.e, ob.a().a(oc.b, oc.a.d).a(oc.a, oc.a.b).a(oc.d, true))
               .a(dvd.b, jk.d, ob.a().a(oc.b, oc.a.c).a(oc.a, oc.a.b).a(oc.d, true))
               .a(dvd.b, jk.c, ob.a().a(oc.a, oc.a.b).a(oc.d, true))
               .a(dvd.c, jk.f, ob.a().a(oc.b, oc.a.d).a(oc.a, oc.a.c))
               .a(dvd.c, jk.e, ob.a().a(oc.b, oc.a.b).a(oc.a, oc.a.c))
               .a(dvd.c, jk.d, ob.a().a(oc.a, oc.a.c))
               .a(dvd.c, jk.c, ob.a().a(oc.b, oc.a.c).a(oc.a, oc.a.c))
         );
   }

   private static nz.d<jk, dvo, dvn, Boolean> a(nz.d<jk, dvo, dvn, Boolean> $$0, dvo $$1, ale $$2, ale $$3, ale $$4, ale $$5) {
      return $$0.a(jk.f, $$1, dvn.a, false, ob.a().a(oc.c, $$2))
         .a(jk.d, $$1, dvn.a, false, ob.a().a(oc.c, $$2).a(oc.b, oc.a.b))
         .a(jk.e, $$1, dvn.a, false, ob.a().a(oc.c, $$2).a(oc.b, oc.a.c))
         .a(jk.c, $$1, dvn.a, false, ob.a().a(oc.c, $$2).a(oc.b, oc.a.d))
         .a(jk.f, $$1, dvn.b, false, ob.a().a(oc.c, $$4))
         .a(jk.d, $$1, dvn.b, false, ob.a().a(oc.c, $$4).a(oc.b, oc.a.b))
         .a(jk.e, $$1, dvn.b, false, ob.a().a(oc.c, $$4).a(oc.b, oc.a.c))
         .a(jk.c, $$1, dvn.b, false, ob.a().a(oc.c, $$4).a(oc.b, oc.a.d))
         .a(jk.f, $$1, dvn.a, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.b))
         .a(jk.d, $$1, dvn.a, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.c))
         .a(jk.e, $$1, dvn.a, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.d))
         .a(jk.c, $$1, dvn.a, true, ob.a().a(oc.c, $$3))
         .a(jk.f, $$1, dvn.b, true, ob.a().a(oc.c, $$5).a(oc.b, oc.a.d))
         .a(jk.d, $$1, dvn.b, true, ob.a().a(oc.c, $$5))
         .a(jk.e, $$1, dvn.b, true, ob.a().a(oc.c, $$5).a(oc.b, oc.a.b))
         .a(jk.c, $$1, dvn.b, true, ob.a().a(oc.c, $$5).a(oc.b, oc.a.c));
   }

   private static nv a(dhm $$0, ale $$1, ale $$2, ale $$3, ale $$4, ale $$5, ale $$6, ale $$7, ale $$8) {
      return ny.a($$0).a(a(a(nz.a(dvi.R, dvi.ae, dvi.be, dvi.u), dvo.b, $$1, $$2, $$3, $$4), dvo.a, $$5, $$6, $$7, $$8));
   }

   static nv a(dhm $$0, ale $$1, ale $$2, ale $$3, ale $$4, ale $$5) {
      return nx.a($$0)
         .a(ob.a().a(oc.c, $$1))
         .a(nw.a().a(dvi.L, true), ob.a().a(oc.c, $$2).a(oc.d, false))
         .a(nw.a().a(dvi.M, true), ob.a().a(oc.c, $$3).a(oc.d, false))
         .a(nw.a().a(dvi.N, true), ob.a().a(oc.c, $$4).a(oc.d, false))
         .a(nw.a().a(dvi.O, true), ob.a().a(oc.c, $$5).a(oc.d, false));
   }

   static nv c(dhm $$0, ale $$1, ale $$2) {
      return nx.a($$0)
         .a(ob.a().a(oc.c, $$1))
         .a(nw.a().a(dvi.L, true), ob.a().a(oc.c, $$2).a(oc.d, true))
         .a(nw.a().a(dvi.M, true), ob.a().a(oc.c, $$2).a(oc.b, oc.a.b).a(oc.d, true))
         .a(nw.a().a(dvi.N, true), ob.a().a(oc.c, $$2).a(oc.b, oc.a.c).a(oc.d, true))
         .a(nw.a().a(dvi.O, true), ob.a().a(oc.c, $$2).a(oc.b, oc.a.d).a(oc.d, true));
   }

   static nv a(dhm $$0, ale $$1, ale $$2, ale $$3) {
      return nx.a($$0)
         .a(nw.a().a(dvi.J, true), ob.a().a(oc.c, $$1))
         .a(nw.a().a(dvi.X, dwe.b), ob.a().a(oc.c, $$2).a(oc.d, true))
         .a(nw.a().a(dvi.W, dwe.b), ob.a().a(oc.c, $$2).a(oc.b, oc.a.b).a(oc.d, true))
         .a(nw.a().a(dvi.Y, dwe.b), ob.a().a(oc.c, $$2).a(oc.b, oc.a.c).a(oc.d, true))
         .a(nw.a().a(dvi.Z, dwe.b), ob.a().a(oc.c, $$2).a(oc.b, oc.a.d).a(oc.d, true))
         .a(nw.a().a(dvi.X, dwe.c), ob.a().a(oc.c, $$3).a(oc.d, true))
         .a(nw.a().a(dvi.W, dwe.c), ob.a().a(oc.c, $$3).a(oc.b, oc.a.b).a(oc.d, true))
         .a(nw.a().a(dvi.Y, dwe.c), ob.a().a(oc.c, $$3).a(oc.b, oc.a.c).a(oc.d, true))
         .a(nw.a().a(dvi.Z, dwe.c), ob.a().a(oc.c, $$3).a(oc.b, oc.a.d).a(oc.d, true));
   }

   static nv a(dhm $$0, ale $$1, ale $$2, ale $$3, ale $$4, boolean $$5) {
      return ny.a($$0, ob.a().a(oc.d, $$5))
         .a(c())
         .a(
            nz.a(dvi.q, dvi.u)
               .a(false, false, ob.a().a(oc.c, $$2))
               .a(true, false, ob.a().a(oc.c, $$4))
               .a(false, true, ob.a().a(oc.c, $$1))
               .a(true, true, ob.a().a(oc.c, $$3))
         );
   }

   static nv b(dhm $$0, ale $$1, ale $$2, ale $$3) {
      return ny.a($$0)
         .a(
            nz.a(dvi.R, dvi.af, dvi.bi)
               .a(jk.f, dvr.b, dwb.a, ob.a().a(oc.c, $$2))
               .a(jk.e, dvr.b, dwb.a, ob.a().a(oc.c, $$2).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.d, dvr.b, dwb.a, ob.a().a(oc.c, $$2).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.c, dvr.b, dwb.a, ob.a().a(oc.c, $$2).a(oc.b, oc.a.d).a(oc.d, true))
               .a(jk.f, dvr.b, dwb.e, ob.a().a(oc.c, $$3))
               .a(jk.e, dvr.b, dwb.e, ob.a().a(oc.c, $$3).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.d, dvr.b, dwb.e, ob.a().a(oc.c, $$3).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.c, dvr.b, dwb.e, ob.a().a(oc.c, $$3).a(oc.b, oc.a.d).a(oc.d, true))
               .a(jk.f, dvr.b, dwb.d, ob.a().a(oc.c, $$3).a(oc.b, oc.a.d).a(oc.d, true))
               .a(jk.e, dvr.b, dwb.d, ob.a().a(oc.c, $$3).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.d, dvr.b, dwb.d, ob.a().a(oc.c, $$3))
               .a(jk.c, dvr.b, dwb.d, ob.a().a(oc.c, $$3).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.f, dvr.b, dwb.c, ob.a().a(oc.c, $$1))
               .a(jk.e, dvr.b, dwb.c, ob.a().a(oc.c, $$1).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.d, dvr.b, dwb.c, ob.a().a(oc.c, $$1).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.c, dvr.b, dwb.c, ob.a().a(oc.c, $$1).a(oc.b, oc.a.d).a(oc.d, true))
               .a(jk.f, dvr.b, dwb.b, ob.a().a(oc.c, $$1).a(oc.b, oc.a.d).a(oc.d, true))
               .a(jk.e, dvr.b, dwb.b, ob.a().a(oc.c, $$1).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.d, dvr.b, dwb.b, ob.a().a(oc.c, $$1))
               .a(jk.c, dvr.b, dwb.b, ob.a().a(oc.c, $$1).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.f, dvr.a, dwb.a, ob.a().a(oc.c, $$2).a(oc.a, oc.a.c).a(oc.d, true))
               .a(jk.e, dvr.a, dwb.a, ob.a().a(oc.c, $$2).a(oc.a, oc.a.c).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.d, dvr.a, dwb.a, ob.a().a(oc.c, $$2).a(oc.a, oc.a.c).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.c, dvr.a, dwb.a, ob.a().a(oc.c, $$2).a(oc.a, oc.a.c).a(oc.b, oc.a.d).a(oc.d, true))
               .a(jk.f, dvr.a, dwb.e, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.e, dvr.a, dwb.e, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.d).a(oc.d, true))
               .a(jk.d, dvr.a, dwb.e, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.c, dvr.a, dwb.e, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.d, true))
               .a(jk.f, dvr.a, dwb.d, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.d, true))
               .a(jk.e, dvr.a, dwb.d, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.d, dvr.a, dwb.d, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.c, dvr.a, dwb.d, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.d).a(oc.d, true))
               .a(jk.f, dvr.a, dwb.c, ob.a().a(oc.c, $$1).a(oc.a, oc.a.c).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.e, dvr.a, dwb.c, ob.a().a(oc.c, $$1).a(oc.a, oc.a.c).a(oc.b, oc.a.d).a(oc.d, true))
               .a(jk.d, dvr.a, dwb.c, ob.a().a(oc.c, $$1).a(oc.a, oc.a.c).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.c, dvr.a, dwb.c, ob.a().a(oc.c, $$1).a(oc.a, oc.a.c).a(oc.d, true))
               .a(jk.f, dvr.a, dwb.b, ob.a().a(oc.c, $$1).a(oc.a, oc.a.c).a(oc.d, true))
               .a(jk.e, dvr.a, dwb.b, ob.a().a(oc.c, $$1).a(oc.a, oc.a.c).a(oc.b, oc.a.c).a(oc.d, true))
               .a(jk.d, dvr.a, dwb.b, ob.a().a(oc.c, $$1).a(oc.a, oc.a.c).a(oc.b, oc.a.b).a(oc.d, true))
               .a(jk.c, dvr.a, dwb.b, ob.a().a(oc.c, $$1).a(oc.a, oc.a.c).a(oc.b, oc.a.d).a(oc.d, true))
         );
   }

   private static nv c(dhm $$0, ale $$1, ale $$2, ale $$3) {
      return ny.a($$0)
         .a(
            nz.a(dvi.R, dvi.af, dvi.u)
               .a(jk.c, dvr.b, false, ob.a().a(oc.c, $$2))
               .a(jk.d, dvr.b, false, ob.a().a(oc.c, $$2).a(oc.b, oc.a.c))
               .a(jk.f, dvr.b, false, ob.a().a(oc.c, $$2).a(oc.b, oc.a.b))
               .a(jk.e, dvr.b, false, ob.a().a(oc.c, $$2).a(oc.b, oc.a.d))
               .a(jk.c, dvr.a, false, ob.a().a(oc.c, $$1))
               .a(jk.d, dvr.a, false, ob.a().a(oc.c, $$1).a(oc.b, oc.a.c))
               .a(jk.f, dvr.a, false, ob.a().a(oc.c, $$1).a(oc.b, oc.a.b))
               .a(jk.e, dvr.a, false, ob.a().a(oc.c, $$1).a(oc.b, oc.a.d))
               .a(jk.c, dvr.b, true, ob.a().a(oc.c, $$3))
               .a(jk.d, dvr.b, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.c))
               .a(jk.f, dvr.b, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.b))
               .a(jk.e, dvr.b, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.d))
               .a(jk.c, dvr.a, true, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.c))
               .a(jk.d, dvr.a, true, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.a))
               .a(jk.f, dvr.a, true, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.d))
               .a(jk.e, dvr.a, true, ob.a().a(oc.c, $$3).a(oc.a, oc.a.c).a(oc.b, oc.a.b))
         );
   }

   private static nv d(dhm $$0, ale $$1, ale $$2, ale $$3) {
      return ny.a($$0)
         .a(
            nz.a(dvi.R, dvi.af, dvi.u)
               .a(jk.c, dvr.b, false, ob.a().a(oc.c, $$2))
               .a(jk.d, dvr.b, false, ob.a().a(oc.c, $$2))
               .a(jk.f, dvr.b, false, ob.a().a(oc.c, $$2))
               .a(jk.e, dvr.b, false, ob.a().a(oc.c, $$2))
               .a(jk.c, dvr.a, false, ob.a().a(oc.c, $$1))
               .a(jk.d, dvr.a, false, ob.a().a(oc.c, $$1))
               .a(jk.f, dvr.a, false, ob.a().a(oc.c, $$1))
               .a(jk.e, dvr.a, false, ob.a().a(oc.c, $$1))
               .a(jk.c, dvr.b, true, ob.a().a(oc.c, $$3))
               .a(jk.d, dvr.b, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.c))
               .a(jk.f, dvr.b, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.b))
               .a(jk.e, dvr.b, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.d))
               .a(jk.c, dvr.a, true, ob.a().a(oc.c, $$3))
               .a(jk.d, dvr.a, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.c))
               .a(jk.f, dvr.a, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.b))
               .a(jk.e, dvr.a, true, ob.a().a(oc.c, $$3).a(oc.b, oc.a.d))
         );
   }

   static ny c(dhm $$0, ale $$1) {
      return ny.a($$0, ob.a().a(oc.c, $$1));
   }

   private static nz f() {
      return nz.a(dvi.I).a(jk.a.b, ob.a()).a(jk.a.c, ob.a().a(oc.a, oc.a.b)).a(jk.a.a, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.b));
   }

   static nv a(dhm $$0, oj $$1, BiConsumer<ale, Supplier<JsonElement>> $$2) {
      ale $$3 = oi.g.a($$0, $$1, $$2);
      ale $$4 = oi.h.a($$0, $$1, $$2);
      ale $$5 = oi.i.a($$0, $$1, $$2);
      ale $$6 = oi.j.a($$0, $$1, $$2);
      return ny.a($$0, ob.a().a(oc.c, $$6)).a(nz.a(dvi.I).a(jk.a.a, ob.a().a(oc.c, $$3)).a(jk.a.b, ob.a().a(oc.c, $$4)).a(jk.a.c, ob.a().a(oc.c, $$5)));
   }

   static nv d(dhm $$0, ale $$1) {
      return ny.a($$0, ob.a().a(oc.c, $$1)).a(f());
   }

   private void e(dhm $$0, ale $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dhm $$0, ol.a $$1) {
      ale $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dhm $$0, ol.a $$1) {
      ale $$2 = $$1.create($$0, this.c);
      this.b.accept(ny.a($$0, ob.a().a(oc.c, $$2)).a(b()));
   }

   static nv d(dhm $$0, ale $$1, ale $$2) {
      return ny.a($$0)
         .a(
            nz.a(dvi.I)
               .a(jk.a.b, ob.a().a(oc.c, $$1))
               .a(jk.a.c, ob.a().a(oc.c, $$2).a(oc.a, oc.a.b))
               .a(jk.a.a, ob.a().a(oc.c, $$2).a(oc.a, oc.a.b).a(oc.b, oc.a.b))
         );
   }

   private void a(dhm $$0, ol.a $$1, ol.a $$2) {
      ale $$3 = $$1.create($$0, this.c);
      ale $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ale a(dhm $$0, String $$1, oh $$2, Function<ale, oj> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oj.a($$0, $$1)), this.c);
   }

   static nv e(dhm $$0, ale $$1, ale $$2) {
      return ny.a($$0).a(a(dvi.w, $$2, $$1));
   }

   static nv e(dhm $$0, ale $$1, ale $$2, ale $$3) {
      return ny.a($$0).a(nz.a(dvi.bh).a(dwa.b, ob.a().a(oc.c, $$1)).a(dwa.a, ob.a().a(oc.c, $$2)).a(dwa.c, ob.a().a(oc.c, $$3)));
   }

   public void a(dhm $$0) {
      this.b($$0, ol.a);
   }

   public void b(dhm $$0, ol.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dhm $$0, oj $$1, oh $$2) {
      ale $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ns.b h(dhm $$0) {
      ol $$1 = this.g.getOrDefault($$0, ol.a.get($$0));
      return new ns.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dhm $$0, dhm $$1, dhm $$2) {
      oj $$3 = oj.u($$0);
      ale $$4 = oi.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.q());
      this.c($$2);
   }

   void i(dhm $$0) {
      oj $$1 = oj.t($$0);
      ale $$2 = oi.v.a($$0, $$1, this.c);
      ale $$3 = oi.w.a($$0, $$1, this.c);
      ale $$4 = oi.x.a($$0, $$1, this.c);
      ale $$5 = oi.y.a($$0, $$1, this.c);
      ale $$6 = oi.z.a($$0, $$1, this.c);
      ale $$7 = oi.A.a($$0, $$1, this.c);
      ale $$8 = oi.B.a($$0, $$1, this.c);
      ale $$9 = oi.C.a($$0, $$1, this.c);
      this.a($$0.q());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dhm $$0, dhm $$1) {
      ale $$2 = oi.v.a($$0);
      ale $$3 = oi.w.a($$0);
      ale $$4 = oi.x.a($$0);
      ale $$5 = oi.y.a($$0);
      ale $$6 = oi.z.a($$0);
      ale $$7 = oi.A.a($$0);
      ale $$8 = oi.B.a($$0);
      ale $$9 = oi.C.a($$0);
      this.a($$1, og.a($$0.q()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dhm $$0) {
      oj $$1 = oj.b($$0);
      ale $$2 = oi.ak.a($$0, $$1, this.c);
      ale $$3 = oi.al.a($$0, $$1, this.c);
      ale $$4 = oi.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dhm $$0) {
      oj $$1 = oj.b($$0);
      ale $$2 = oi.ah.a($$0, $$1, this.c);
      ale $$3 = oi.ai.a($$0, $$1, this.c);
      ale $$4 = oi.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dhm $$0, dhm $$1) {
      ale $$2 = oi.ah.a($$0);
      ale $$3 = oi.ai.a($$0);
      ale $$4 = oi.aj.a($$0);
      this.a($$1, og.a($$0.q()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dho.sD);
      ale $$0 = og.a(dho.sD);
      ale $$1 = og.a(dho.sD, "_partial_tilt");
      ale $$2 = og.a(dho.sD, "_full_tilt");
      this.b
         .accept(
            ny.a(dho.sD)
               .a(b())
               .a(nz.a(dvi.bl).a(dwd.a, ob.a().a(oc.c, $$0)).a(dwd.b, ob.a().a(oc.c, $$0)).a(dwd.c, ob.a().a(oc.c, $$1)).a(dwd.d, ob.a().a(oc.c, $$2)))
         );
   }

   private ns.f l(dhm $$0) {
      return new ns.f(oj.n($$0));
   }

   private void m(dhm $$0) {
      this.c($$0, $$0);
   }

   private void c(dhm $$0, dhm $$1) {
      this.b.accept(c($$0, og.a($$1)));
   }

   private void a(dhm $$0, ns.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dhm $$0, ns.e $$1, oj $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dhm $$0, ns.e $$1) {
      oj $$2 = oj.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dhm $$0, ns.e $$1, oj $$2) {
      ale $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dhm $$0, ns.e $$1, dvv<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         nz $$4 = nz.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            oj $$5 = oj.c(oj.a($$0, $$4x));
            ale $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return ob.a().a(oc.c, $$6);
         });
         this.a($$0.q());
         this.b.accept(ny.a($$0).a($$4));
      }
   }

   private void a(dhm $$0, dhm $$1, ns.e $$2) {
      this.a($$0, $$2);
      oj $$3 = oj.d($$0);
      ale $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dhm $$0, dhm $$1) {
      ol $$2 = ol.p.get($$0);
      ale $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ale $$4 = oi.aC.a($$1, $$2.b(), this.c);
      this.b.accept(ny.a($$1, ob.a().a(oc.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dhm $$0, dhm $$1) {
      this.a($$0.q());
      oj $$2 = oj.h($$0);
      oj $$3 = oj.a($$0, $$1);
      ale $$4 = oi.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            ny.a($$1, ob.a().a(oc.c, $$4))
               .a(nz.a(dvi.R).a(jk.e, ob.a()).a(jk.d, ob.a().a(oc.b, oc.a.d)).a(jk.c, ob.a().a(oc.b, oc.a.b)).a(jk.f, ob.a().a(oc.b, oc.a.c)))
         );
      this.b.accept(ny.a($$0).a(nz.a(dvi.av).a($$2x -> ob.a().a(oc.c, oi.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dhm $$0 = dho.kC;
      this.a($$0.q());
      ale $$1 = og.a($$0, "_top");
      ale $$2 = og.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dhm $$0 = dho.kB;
      this.a($$0.q());
      nz $$1 = nz.a(dnb.d, dvi.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> ob.a().a(oc.c, og.a($$0, "_top_stage_" + $$1x));
            case b -> ob.a().a(oc.c, og.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(ny.a($$0).a($$1));
   }

   private void a(dhm $$0, dhm $$1, dhm $$2, dhm $$3, dhm $$4, dhm $$5, dhm $$6, dhm $$7) {
      this.a($$0, ns.e.b);
      this.a($$1, ns.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dhm $$0, ns.e $$1) {
      this.a($$0, "_top");
      ale $$2 = this.a($$0, "_top", $$1.a(), oj::c);
      ale $$3 = this.a($$0, "_bottom", $$1.a(), oj::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dho.iD, "_front");
      ale $$0 = og.a(dho.iD, "_top");
      ale $$1 = this.a(dho.iD, "_bottom", ns.e.b.a(), oj::c);
      this.f(dho.iD, $$0, $$1);
   }

   private void k() {
      ale $$0 = this.a(dho.bx, "_top", oi.bm, oj::a);
      ale $$1 = this.a(dho.bx, "_bottom", oi.bm, oj::a);
      this.f(dho.bx, $$0, $$1);
   }

   private void l() {
      this.c(dho.sF);
      ale $$0 = og.a(dho.sF, "_top");
      ale $$1 = og.a(dho.sF, "_bottom");
      this.b.accept(ny.a(dho.sF).a(b()).a(nz.a(dvi.ae).a(dvo.b, ob.a().a(oc.c, $$1)).a(dvo.a, ob.a().a(oc.c, $$0))));
   }

   private void f(dhm $$0, ale $$1, ale $$2) {
      this.b.accept(ny.a($$0).a(nz.a(dvi.ae).a(dvo.b, ob.a().a(oc.c, $$2)).a(dvo.a, ob.a().a(oc.c, $$1))));
   }

   private void n(dhm $$0) {
      oj $$1 = oj.e($$0);
      oj $$2 = oj.e(oj.a($$0, "_corner"));
      ale $$3 = oi.as.a($$0, $$1, this.c);
      ale $$4 = oi.at.a($$0, $$2, this.c);
      ale $$5 = oi.au.a($$0, $$1, this.c);
      ale $$6 = oi.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            ny.a($$0)
               .a(
                  nz.a(dvi.ag)
                     .a(dvw.a, ob.a().a(oc.c, $$3))
                     .a(dvw.b, ob.a().a(oc.c, $$3).a(oc.b, oc.a.b))
                     .a(dvw.c, ob.a().a(oc.c, $$5).a(oc.b, oc.a.b))
                     .a(dvw.d, ob.a().a(oc.c, $$6).a(oc.b, oc.a.b))
                     .a(dvw.e, ob.a().a(oc.c, $$5))
                     .a(dvw.f, ob.a().a(oc.c, $$6))
                     .a(dvw.g, ob.a().a(oc.c, $$4))
                     .a(dvw.h, ob.a().a(oc.c, $$4).a(oc.b, oc.a.b))
                     .a(dvw.i, ob.a().a(oc.c, $$4).a(oc.b, oc.a.c))
                     .a(dvw.j, ob.a().a(oc.c, $$4).a(oc.b, oc.a.d))
               )
         );
   }

   private void o(dhm $$0) {
      ale $$1 = this.a($$0, "", oi.as, oj::e);
      ale $$2 = this.a($$0, "", oi.au, oj::e);
      ale $$3 = this.a($$0, "", oi.av, oj::e);
      ale $$4 = this.a($$0, "_on", oi.as, oj::e);
      ale $$5 = this.a($$0, "_on", oi.au, oj::e);
      ale $$6 = this.a($$0, "_on", oi.av, oj::e);
      nz $$7 = nz.a(dvi.w, dvi.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return ob.a().a(oc.c, $$6x ? $$4 : $$1);
            case b:
               return ob.a().a(oc.c, $$6x ? $$4 : $$1).a(oc.b, oc.a.b);
            case c:
               return ob.a().a(oc.c, $$6x ? $$5 : $$2).a(oc.b, oc.a.b);
            case d:
               return ob.a().a(oc.c, $$6x ? $$6 : $$3).a(oc.b, oc.a.b);
            case e:
               return ob.a().a(oc.c, $$6x ? $$5 : $$2);
            case f:
               return ob.a().a(oc.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(ny.a($$0).a($$7));
   }

   private ns.a a(ale $$0, dhm $$1) {
      return new ns.a($$0, $$1);
   }

   private ns.a f(dhm $$0, dhm $$1) {
      return new ns.a(og.a($$0), $$1);
   }

   private void a(dhm $$0, cvn $$1) {
      ale $$2 = oi.aa.a($$0, oj.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dhm $$0, ale $$1) {
      ale $$2 = oi.aa.a($$0, oj.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dhm $$0, dhm $$1) {
      this.a($$0);
      ale $$2 = ol.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dhm $$0) {
      this.a($$0.q());
      ale $$1 = ol.k.create($$0, this.c);
      ale $$2 = ol.l.create($$0, this.c);
      ale $$3 = ol.m.create($$0, this.c);
      ale $$4 = ol.n.create($$0, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(nw.a().a(dvi.S, 1, 2, 3, 4).a(dvi.R, jk.c), ob.a().a(oc.c, $$1))
               .a(nw.a().a(dvi.S, 1, 2, 3, 4).a(dvi.R, jk.f), ob.a().a(oc.c, $$1).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.S, 1, 2, 3, 4).a(dvi.R, jk.d), ob.a().a(oc.c, $$1).a(oc.b, oc.a.c))
               .a(nw.a().a(dvi.S, 1, 2, 3, 4).a(dvi.R, jk.e), ob.a().a(oc.c, $$1).a(oc.b, oc.a.d))
               .a(nw.a().a(dvi.S, 2, 3, 4).a(dvi.R, jk.c), ob.a().a(oc.c, $$2))
               .a(nw.a().a(dvi.S, 2, 3, 4).a(dvi.R, jk.f), ob.a().a(oc.c, $$2).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.S, 2, 3, 4).a(dvi.R, jk.d), ob.a().a(oc.c, $$2).a(oc.b, oc.a.c))
               .a(nw.a().a(dvi.S, 2, 3, 4).a(dvi.R, jk.e), ob.a().a(oc.c, $$2).a(oc.b, oc.a.d))
               .a(nw.a().a(dvi.S, 3, 4).a(dvi.R, jk.c), ob.a().a(oc.c, $$3))
               .a(nw.a().a(dvi.S, 3, 4).a(dvi.R, jk.f), ob.a().a(oc.c, $$3).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.S, 3, 4).a(dvi.R, jk.d), ob.a().a(oc.c, $$3).a(oc.b, oc.a.c))
               .a(nw.a().a(dvi.S, 3, 4).a(dvi.R, jk.e), ob.a().a(oc.c, $$3).a(oc.b, oc.a.d))
               .a(nw.a().a(dvi.S, 4).a(dvi.R, jk.c), ob.a().a(oc.c, $$4))
               .a(nw.a().a(dvi.S, 4).a(dvi.R, jk.f), ob.a().a(oc.c, $$4).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.S, 4).a(dvi.R, jk.d), ob.a().a(oc.c, $$4).a(oc.b, oc.a.c))
               .a(nw.a().a(dvi.S, 4).a(dvi.R, jk.e), ob.a().a(oc.c, $$4).a(oc.b, oc.a.d))
         );
   }

   private void a(ol.a $$0, dhm... $$1) {
      for (dhm $$2 : $$1) {
         ale $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ol.a $$0, dhm... $$1) {
      for (dhm $$2 : $$1) {
         ale $$3 = $$0.create($$2, this.c);
         this.b.accept(ny.a($$2, ob.a().a(oc.c, $$3)).a(c()));
      }
   }

   private void h(dhm $$0, dhm $$1) {
      this.a($$0);
      oj $$2 = oj.b($$0, $$1);
      ale $$3 = oi.aI.a($$1, $$2, this.c);
      ale $$4 = oi.aJ.a($$1, $$2, this.c);
      ale $$5 = oi.aK.a($$1, $$2, this.c);
      ale $$6 = oi.aG.a($$1, $$2, this.c);
      ale $$7 = oi.aH.a($$1, $$2, this.c);
      cvn $$8 = $$1.q();
      oi.bz.a(og.a($$8), oj.F($$0), this.c);
      this.b
         .accept(
            nx.a($$1)
               .a(ob.a().a(oc.c, $$3))
               .a(nw.a().a(dvi.L, true), ob.a().a(oc.c, $$4))
               .a(nw.a().a(dvi.M, true), ob.a().a(oc.c, $$4).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.N, true), ob.a().a(oc.c, $$5))
               .a(nw.a().a(dvi.O, true), ob.a().a(oc.c, $$5).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.L, false), ob.a().a(oc.c, $$6))
               .a(nw.a().a(dvi.M, false), ob.a().a(oc.c, $$7))
               .a(nw.a().a(dvi.N, false), ob.a().a(oc.c, $$7).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.O, false), ob.a().a(oc.c, $$6).a(oc.b, oc.a.d))
         );
   }

   private void q(dhm $$0) {
      oj $$1 = oj.z($$0);
      ale $$2 = oi.aL.a($$0, $$1, this.c);
      ale $$3 = this.a($$0, "_conditional", oi.aL, $$1x -> $$1.c(ok.i, $$1x));
      this.b.accept(ny.a($$0).a(a(dvi.c, $$3, $$2)).a(e()));
   }

   private void r(dhm $$0) {
      ale $$1 = ol.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<ob> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> ob.a().a(oc.c, og.a(dho.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dho.mZ);
      this.b
         .accept(
            nx.a(dho.mZ)
               .a(nw.a().a(dvi.aq, 0), this.a(0))
               .a(nw.a().a(dvi.aq, 1), this.a(1))
               .a(nw.a().a(dvi.bk, dve.b), ob.a().a(oc.c, og.a(dho.mZ, "_small_leaves")))
               .a(nw.a().a(dvi.bk, dve.c), ob.a().a(oc.c, og.a(dho.mZ, "_large_leaves")))
         );
   }

   private nz n() {
      return nz.a(dvi.P)
         .a(jk.a, ob.a().a(oc.a, oc.a.c))
         .a(jk.b, ob.a())
         .a(jk.c, ob.a().a(oc.a, oc.a.b))
         .a(jk.d, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.c))
         .a(jk.e, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.d))
         .a(jk.f, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.b));
   }

   private void o() {
      ale $$0 = oj.a(dho.nU, "_top_open");
      this.b
         .accept(
            ny.a(dho.nU)
               .a(this.n())
               .a(
                  nz.a(dvi.u)
                     .a(false, ob.a().a(oc.c, ol.f.create(dho.nU, this.c)))
                     .a(true, ob.a().a(oc.c, ol.f.get(dho.nU).a($$1 -> $$1.a(ok.f, $$0)).a(dho.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nz a(dvv<T> $$0, T $$1, ale $$2, ale $$3) {
      ob $$4 = ob.a().a(oc.c, $$2);
      ob $$5 = ob.a().a(oc.c, $$3);
      return nz.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dhm $$0, Function<dhm, oj> $$1) {
      oj $$2 = $$1.apply($$0).b(ok.i, ok.c);
      oj $$3 = $$2.c(ok.g, oj.a($$0, "_front_honey"));
      ale $$4 = oi.q.a($$0, "_empty", $$2, this.c);
      ale $$5 = oi.q.a($$0, "_honey", $$3, this.c);
      this.c($$0);
      oi.q.a(og.a($$0.q(), "_empty"), $$2, this.c);
      oi.q.a(og.a($$0.q(), "_honey"), $$3, this.c);
      this.b.accept(ny.a($$0).a(b()).a(a(dvi.aN, 5, $$5, $$4)));
   }

   private void a(dhm $$0, dvv<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ale> $$3 = new Int2ObjectOpenHashMap();
         nz $$4 = nz.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ale $$5 = (ale)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, oi.aV, oj::g));
            return ob.a().a(oc.c, $$5);
         });
         this.a($$0.q());
         this.b.accept(ny.a($$0).a($$4));
      }
   }

   private void p() {
      ale $$0 = og.a(dho.od, "_floor");
      ale $$1 = og.a(dho.od, "_ceiling");
      ale $$2 = og.a(dho.od, "_wall");
      ale $$3 = og.a(dho.od, "_between_walls");
      this.a(cvw.wu);
      this.b
         .accept(
            ny.a(dho.od)
               .a(
                  nz.a(dvi.R, dvi.V)
                     .a(jk.c, dvg.a, ob.a().a(oc.c, $$0))
                     .a(jk.d, dvg.a, ob.a().a(oc.c, $$0).a(oc.b, oc.a.c))
                     .a(jk.f, dvg.a, ob.a().a(oc.c, $$0).a(oc.b, oc.a.b))
                     .a(jk.e, dvg.a, ob.a().a(oc.c, $$0).a(oc.b, oc.a.d))
                     .a(jk.c, dvg.b, ob.a().a(oc.c, $$1))
                     .a(jk.d, dvg.b, ob.a().a(oc.c, $$1).a(oc.b, oc.a.c))
                     .a(jk.f, dvg.b, ob.a().a(oc.c, $$1).a(oc.b, oc.a.b))
                     .a(jk.e, dvg.b, ob.a().a(oc.c, $$1).a(oc.b, oc.a.d))
                     .a(jk.c, dvg.c, ob.a().a(oc.c, $$2).a(oc.b, oc.a.d))
                     .a(jk.d, dvg.c, ob.a().a(oc.c, $$2).a(oc.b, oc.a.b))
                     .a(jk.f, dvg.c, ob.a().a(oc.c, $$2))
                     .a(jk.e, dvg.c, ob.a().a(oc.c, $$2).a(oc.b, oc.a.c))
                     .a(jk.d, dvg.d, ob.a().a(oc.c, $$3).a(oc.b, oc.a.b))
                     .a(jk.c, dvg.d, ob.a().a(oc.c, $$3).a(oc.b, oc.a.d))
                     .a(jk.f, dvg.d, ob.a().a(oc.c, $$3))
                     .a(jk.e, dvg.d, ob.a().a(oc.c, $$3).a(oc.b, oc.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            ny.a(dho.nZ, ob.a().a(oc.c, og.a(dho.nZ)))
               .a(
                  nz.a(dvi.U, dvi.R)
                     .a(dvd.a, jk.c, ob.a())
                     .a(dvd.a, jk.f, ob.a().a(oc.b, oc.a.b))
                     .a(dvd.a, jk.d, ob.a().a(oc.b, oc.a.c))
                     .a(dvd.a, jk.e, ob.a().a(oc.b, oc.a.d))
                     .a(dvd.b, jk.c, ob.a().a(oc.a, oc.a.b))
                     .a(dvd.b, jk.f, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.b))
                     .a(dvd.b, jk.d, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.c))
                     .a(dvd.b, jk.e, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.d))
                     .a(dvd.c, jk.d, ob.a().a(oc.a, oc.a.c))
                     .a(dvd.c, jk.e, ob.a().a(oc.a, oc.a.c).a(oc.b, oc.a.b))
                     .a(dvd.c, jk.c, ob.a().a(oc.a, oc.a.c).a(oc.b, oc.a.c))
                     .a(dvd.c, jk.f, ob.a().a(oc.a, oc.a.c).a(oc.b, oc.a.d))
               )
         );
   }

   private void d(dhm $$0, ol.a $$1) {
      ale $$2 = $$1.create($$0, this.c);
      ale $$3 = oj.a($$0, "_front_on");
      ale $$4 = $$1.get($$0).a($$1x -> $$1x.a(ok.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(ny.a($$0).a(a(dvi.r, $$4, $$2)).a(b()));
   }

   private void a(dhm... $$0) {
      ale $$1 = og.a("campfire_off");

      for (dhm $$2 : $$0) {
         ale $$3 = oi.bc.a($$2, oj.E($$2), this.c);
         this.a($$2.q());
         this.b.accept(ny.a($$2).a(a(dvi.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dhm $$0) {
      ale $$1 = oi.bv.a($$0, oj.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dhm $$0) {
      ale $$1;
      if ($$0 == dho.tj) {
         $$1 = oi.bx.a($$0, oj.m($$0), this.c);
      } else {
         $$1 = oi.bw.a($$0, oj.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oj $$0 = oj.a(oj.G(dho.cl), oj.G(dho.n));
      ale $$1 = oi.j.a(dho.cl, $$0, this.c);
      this.b.accept(c(dho.cl, $$1));
   }

   private void s() {
      this.a(cvw.lH);
      this.b
         .accept(
            nx.a(dho.cw)
               .a(
                  nw.b(
                     nw.a().a(dvi.ab, dvx.c).a(dvi.aa, dvx.c).a(dvi.ac, dvx.c).a(dvi.ad, dvx.c),
                     nw.a().a(dvi.ab, dvx.b, dvx.a).a(dvi.aa, dvx.b, dvx.a),
                     nw.a().a(dvi.aa, dvx.b, dvx.a).a(dvi.ac, dvx.b, dvx.a),
                     nw.a().a(dvi.ac, dvx.b, dvx.a).a(dvi.ad, dvx.b, dvx.a),
                     nw.a().a(dvi.ad, dvx.b, dvx.a).a(dvi.ab, dvx.b, dvx.a)
                  ),
                  ob.a().a(oc.c, og.a("redstone_dust_dot"))
               )
               .a(nw.a().a(dvi.ab, dvx.b, dvx.a), ob.a().a(oc.c, og.a("redstone_dust_side0")))
               .a(nw.a().a(dvi.ac, dvx.b, dvx.a), ob.a().a(oc.c, og.a("redstone_dust_side_alt0")))
               .a(nw.a().a(dvi.aa, dvx.b, dvx.a), ob.a().a(oc.c, og.a("redstone_dust_side_alt1")).a(oc.b, oc.a.d))
               .a(nw.a().a(dvi.ad, dvx.b, dvx.a), ob.a().a(oc.c, og.a("redstone_dust_side1")).a(oc.b, oc.a.d))
               .a(nw.a().a(dvi.ab, dvx.a), ob.a().a(oc.c, og.a("redstone_dust_up")))
               .a(nw.a().a(dvi.aa, dvx.a), ob.a().a(oc.c, og.a("redstone_dust_up")).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.ac, dvx.a), ob.a().a(oc.c, og.a("redstone_dust_up")).a(oc.b, oc.a.c))
               .a(nw.a().a(dvi.ad, dvx.a), ob.a().a(oc.c, og.a("redstone_dust_up")).a(oc.b, oc.a.d))
         );
   }

   private void t() {
      this.a(cvw.lL);
      this.b
         .accept(
            ny.a(dho.gY)
               .a(c())
               .a(
                  nz.a(dvi.bd, dvi.w)
                     .a(dvl.a, false, ob.a().a(oc.c, og.a(dho.gY)))
                     .a(dvl.a, true, ob.a().a(oc.c, og.a(dho.gY, "_on")))
                     .a(dvl.b, false, ob.a().a(oc.c, og.a(dho.gY, "_subtract")))
                     .a(dvl.b, true, ob.a().a(oc.c, og.a(dho.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oj $$0 = oj.a(dho.jR);
      oj $$1 = oj.a(oj.a(dho.jE, "_side"), $$0.a(ok.f));
      ale $$2 = oi.ab.a(dho.jE, $$1, this.c);
      ale $$3 = oi.ac.a(dho.jE, $$1, this.c);
      ale $$4 = oi.j.b(dho.jE, "_double", $$1, this.c);
      this.b.accept(e(dho.jE, $$2, $$3, $$4));
      this.b.accept(c(dho.jR, oi.c.a(dho.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cvw.sr);
      this.b
         .accept(
            nx.a(dho.fs)
               .a(ob.a().a(oc.c, oj.G(dho.fs)))
               .a(nw.a().a(dvi.k, true), ob.a().a(oc.c, oj.a(dho.fs, "_bottle0")))
               .a(nw.a().a(dvi.l, true), ob.a().a(oc.c, oj.a(dho.fs, "_bottle1")))
               .a(nw.a().a(dvi.m, true), ob.a().a(oc.c, oj.a(dho.fs, "_bottle2")))
               .a(nw.a().a(dvi.k, false), ob.a().a(oc.c, oj.a(dho.fs, "_empty0")))
               .a(nw.a().a(dvi.l, false), ob.a().a(oc.c, oj.a(dho.fs, "_empty1")))
               .a(nw.a().a(dvi.m, false), ob.a().a(oc.c, oj.a(dho.fs, "_empty2")))
         );
   }

   private void u(dhm $$0) {
      ale $$1 = oi.br.a($$0, oj.b($$0), this.c);
      ale $$2 = og.a("mushroom_block_inside");
      this.b
         .accept(
            nx.a($$0)
               .a(nw.a().a(dvi.L, true), ob.a().a(oc.c, $$1))
               .a(nw.a().a(dvi.M, true), ob.a().a(oc.c, $$1).a(oc.b, oc.a.b).a(oc.d, true))
               .a(nw.a().a(dvi.N, true), ob.a().a(oc.c, $$1).a(oc.b, oc.a.c).a(oc.d, true))
               .a(nw.a().a(dvi.O, true), ob.a().a(oc.c, $$1).a(oc.b, oc.a.d).a(oc.d, true))
               .a(nw.a().a(dvi.J, true), ob.a().a(oc.c, $$1).a(oc.a, oc.a.d).a(oc.d, true))
               .a(nw.a().a(dvi.K, true), ob.a().a(oc.c, $$1).a(oc.a, oc.a.b).a(oc.d, true))
               .a(nw.a().a(dvi.L, false), ob.a().a(oc.c, $$2))
               .a(nw.a().a(dvi.M, false), ob.a().a(oc.c, $$2).a(oc.b, oc.a.b).a(oc.d, false))
               .a(nw.a().a(dvi.N, false), ob.a().a(oc.c, $$2).a(oc.b, oc.a.c).a(oc.d, false))
               .a(nw.a().a(dvi.O, false), ob.a().a(oc.c, $$2).a(oc.b, oc.a.d).a(oc.d, false))
               .a(nw.a().a(dvi.J, false), ob.a().a(oc.c, $$2).a(oc.a, oc.a.d).a(oc.d, false))
               .a(nw.a().a(dvi.K, false), ob.a().a(oc.c, $$2).a(oc.a, oc.a.b).a(oc.d, false))
         );
      this.a($$0, ol.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cvw.rC);
      this.b
         .accept(
            ny.a(dho.eg)
               .a(
                  nz.a(dvi.ay)
                     .a(0, ob.a().a(oc.c, og.a(dho.eg)))
                     .a(1, ob.a().a(oc.c, og.a(dho.eg, "_slice1")))
                     .a(2, ob.a().a(oc.c, og.a(dho.eg, "_slice2")))
                     .a(3, ob.a().a(oc.c, og.a(dho.eg, "_slice3")))
                     .a(4, ob.a().a(oc.c, og.a(dho.eg, "_slice4")))
                     .a(5, ob.a().a(oc.c, og.a(dho.eg, "_slice5")))
                     .a(6, ob.a().a(oc.c, og.a(dho.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oj $$0 = new oj()
         .a(ok.c, oj.a(dho.nX, "_side3"))
         .a(ok.o, oj.G(dho.t))
         .a(ok.n, oj.a(dho.nX, "_top"))
         .a(ok.j, oj.a(dho.nX, "_side3"))
         .a(ok.l, oj.a(dho.nX, "_side3"))
         .a(ok.k, oj.a(dho.nX, "_side1"))
         .a(ok.m, oj.a(dho.nX, "_side2"));
      this.b.accept(c(dho.nX, oi.a.a(dho.nX, $$0, this.c)));
   }

   private void y() {
      oj $$0 = new oj()
         .a(ok.c, oj.a(dho.ob, "_front"))
         .a(ok.o, oj.a(dho.ob, "_bottom"))
         .a(ok.n, oj.a(dho.ob, "_top"))
         .a(ok.j, oj.a(dho.ob, "_front"))
         .a(ok.k, oj.a(dho.ob, "_front"))
         .a(ok.l, oj.a(dho.ob, "_side"))
         .a(ok.m, oj.a(dho.ob, "_side"));
      this.b.accept(c(dho.ob, oi.a.a(dho.ob, $$0, this.c)));
   }

   private void a(dhm $$0, dhm $$1, BiFunction<dhm, dhm, oj> $$2) {
      oj $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oi.a.a($$0, $$3, this.c)));
   }

   public void b(dhm $$0) {
      oj $$1 = new oj()
         .a(ok.c, oj.a($$0, "_particle"))
         .a(ok.o, oj.a($$0, "_down"))
         .a(ok.n, oj.a($$0, "_up"))
         .a(ok.j, oj.a($$0, "_north"))
         .a(ok.k, oj.a($$0, "_south"))
         .a(ok.l, oj.a($$0, "_east"))
         .a(ok.m, oj.a($$0, "_west"));
      this.b.accept(c($$0, oi.a.a($$0, $$1, this.c)));
   }

   private void z() {
      oj $$0 = oj.k(dho.eZ);
      this.b.accept(c(dho.eZ, og.a(dho.eZ)));
      this.a(dho.ee, $$0);
      this.a(dho.ef, $$0);
   }

   private void a(dhm $$0, oj $$1) {
      ale $$2 = oi.p.a($$0, $$1.c(ok.g, oj.G($$0)), this.c);
      this.b.accept(ny.a($$0, ob.a().a(oc.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cvw.ss);
      this.m(dho.ft);
      this.b.accept(c(dho.fv, oi.bu.a(dho.fv, oj.j(oj.a(dho.H, "_still")), this.c)));
      this.b
         .accept(
            ny.a(dho.fu)
               .a(
                  nz.a(dlv.g)
                     .a(1, ob.a().a(oc.c, oi.bs.a(dho.fu, "_level1", oj.j(oj.a(dho.G, "_still")), this.c)))
                     .a(2, ob.a().a(oc.c, oi.bt.a(dho.fu, "_level2", oj.j(oj.a(dho.G, "_still")), this.c)))
                     .a(3, ob.a().a(oc.c, oi.bu.a(dho.fu, "_full", oj.j(oj.a(dho.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            ny.a(dho.fw)
               .a(
                  nz.a(dlv.g)
                     .a(1, ob.a().a(oc.c, oi.bs.a(dho.fw, "_level1", oj.j(oj.G(dho.qP)), this.c)))
                     .a(2, ob.a().a(oc.c, oi.bt.a(dho.fw, "_level2", oj.j(oj.G(dho.qP)), this.c)))
                     .a(3, ob.a().a(oc.c, oi.bu.a(dho.fw, "_full", oj.j(oj.G(dho.qP)), this.c)))
               )
         );
   }

   private void B() {
      oj $$0 = oj.b(dho.kv);
      ale $$1 = oi.aE.a(dho.kv, $$0, this.c);
      ale $$2 = this.a(dho.kv, "_dead", oi.aE, $$1x -> $$0.c(ok.b, $$1x));
      this.b.accept(ny.a(dho.kv).a(a(dvi.au, 5, $$2, $$1)));
   }

   private void C() {
      ale $$0 = og.a(dho.tq);
      ale $$1 = og.a(dho.tq, "_triggered");
      ale $$2 = og.a(dho.tq, "_crafting");
      ale $$3 = og.a(dho.tq, "_crafting_triggered");
      this.b
         .accept(
            ny.a(dho.tq)
               .a(nz.a(dvi.T).a($$0x -> this.a($$0x, ob.a())))
               .a(
                  nz.a(dvi.A, djf.b)
                     .a(false, false, ob.a().a(oc.c, $$0))
                     .a(true, true, ob.a().a(oc.c, $$3))
                     .a(true, false, ob.a().a(oc.c, $$1))
                     .a(false, true, ob.a().a(oc.c, $$2))
               )
         );
   }

   private void v(dhm $$0) {
      oj $$1 = new oj().a(ok.f, oj.a(dho.cD, "_top")).a(ok.i, oj.a(dho.cD, "_side")).a(ok.g, oj.a($$0, "_front"));
      oj $$2 = new oj().a(ok.i, oj.a(dho.cD, "_top")).a(ok.g, oj.a($$0, "_front_vertical"));
      ale $$3 = oi.p.a($$0, $$1, this.c);
      ale $$4 = oi.r.a($$0, $$2, this.c);
      this.b
         .accept(
            ny.a($$0)
               .a(
                  nz.a(dvi.P)
                     .a(jk.a, ob.a().a(oc.c, $$4).a(oc.a, oc.a.c))
                     .a(jk.b, ob.a().a(oc.c, $$4))
                     .a(jk.c, ob.a().a(oc.c, $$3))
                     .a(jk.f, ob.a().a(oc.c, $$3).a(oc.b, oc.a.b))
                     .a(jk.d, ob.a().a(oc.c, $$3).a(oc.b, oc.a.c))
                     .a(jk.e, ob.a().a(oc.c, $$3).a(oc.b, oc.a.d))
               )
         );
   }

   private void D() {
      ale $$0 = og.a(dho.fy);
      ale $$1 = og.a(dho.fy, "_filled");
      this.b.accept(ny.a(dho.fy).a(nz.a(dvi.h).a(false, ob.a().a(oc.c, $$0)).a(true, ob.a().a(oc.c, $$1))).a(c()));
   }

   private void E() {
      ale $$0 = og.a(dho.ku, "_side");
      ale $$1 = og.a(dho.ku, "_noside");
      ale $$2 = og.a(dho.ku, "_noside1");
      ale $$3 = og.a(dho.ku, "_noside2");
      ale $$4 = og.a(dho.ku, "_noside3");
      this.b
         .accept(
            nx.a(dho.ku)
               .a(nw.a().a(dvi.L, true), ob.a().a(oc.c, $$0))
               .a(nw.a().a(dvi.M, true), ob.a().a(oc.c, $$0).a(oc.b, oc.a.b).a(oc.d, true))
               .a(nw.a().a(dvi.N, true), ob.a().a(oc.c, $$0).a(oc.b, oc.a.c).a(oc.d, true))
               .a(nw.a().a(dvi.O, true), ob.a().a(oc.c, $$0).a(oc.b, oc.a.d).a(oc.d, true))
               .a(nw.a().a(dvi.J, true), ob.a().a(oc.c, $$0).a(oc.a, oc.a.d).a(oc.d, true))
               .a(nw.a().a(dvi.K, true), ob.a().a(oc.c, $$0).a(oc.a, oc.a.b).a(oc.d, true))
               .a(nw.a().a(dvi.L, false), ob.a().a(oc.c, $$1).a(oc.e, 2), ob.a().a(oc.c, $$2), ob.a().a(oc.c, $$3), ob.a().a(oc.c, $$4))
               .a(
                  nw.a().a(dvi.M, false),
                  ob.a().a(oc.c, $$2).a(oc.b, oc.a.b).a(oc.d, true),
                  ob.a().a(oc.c, $$3).a(oc.b, oc.a.b).a(oc.d, true),
                  ob.a().a(oc.c, $$4).a(oc.b, oc.a.b).a(oc.d, true),
                  ob.a().a(oc.c, $$1).a(oc.e, 2).a(oc.b, oc.a.b).a(oc.d, true)
               )
               .a(
                  nw.a().a(dvi.N, false),
                  ob.a().a(oc.c, $$3).a(oc.b, oc.a.c).a(oc.d, true),
                  ob.a().a(oc.c, $$4).a(oc.b, oc.a.c).a(oc.d, true),
                  ob.a().a(oc.c, $$1).a(oc.e, 2).a(oc.b, oc.a.c).a(oc.d, true),
                  ob.a().a(oc.c, $$2).a(oc.b, oc.a.c).a(oc.d, true)
               )
               .a(
                  nw.a().a(dvi.O, false),
                  ob.a().a(oc.c, $$4).a(oc.b, oc.a.d).a(oc.d, true),
                  ob.a().a(oc.c, $$1).a(oc.e, 2).a(oc.b, oc.a.d).a(oc.d, true),
                  ob.a().a(oc.c, $$2).a(oc.b, oc.a.d).a(oc.d, true),
                  ob.a().a(oc.c, $$3).a(oc.b, oc.a.d).a(oc.d, true)
               )
               .a(
                  nw.a().a(dvi.J, false),
                  ob.a().a(oc.c, $$1).a(oc.e, 2).a(oc.a, oc.a.d).a(oc.d, true),
                  ob.a().a(oc.c, $$4).a(oc.a, oc.a.d).a(oc.d, true),
                  ob.a().a(oc.c, $$2).a(oc.a, oc.a.d).a(oc.d, true),
                  ob.a().a(oc.c, $$3).a(oc.a, oc.a.d).a(oc.d, true)
               )
               .a(
                  nw.a().a(dvi.K, false),
                  ob.a().a(oc.c, $$4).a(oc.a, oc.a.b).a(oc.d, true),
                  ob.a().a(oc.c, $$3).a(oc.a, oc.a.b).a(oc.d, true),
                  ob.a().a(oc.c, $$2).a(oc.a, oc.a.b).a(oc.d, true),
                  ob.a().a(oc.c, $$1).a(oc.e, 2).a(oc.a, oc.a.b).a(oc.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            nx.a(dho.pc)
               .a(ob.a().a(oc.c, oj.G(dho.pc)))
               .a(nw.a().a(dvi.aL, 1), ob.a().a(oc.c, oj.a(dho.pc, "_contents1")))
               .a(nw.a().a(dvi.aL, 2), ob.a().a(oc.c, oj.a(dho.pc, "_contents2")))
               .a(nw.a().a(dvi.aL, 3), ob.a().a(oc.c, oj.a(dho.pc, "_contents3")))
               .a(nw.a().a(dvi.aL, 4), ob.a().a(oc.c, oj.a(dho.pc, "_contents4")))
               .a(nw.a().a(dvi.aL, 5), ob.a().a(oc.c, oj.a(dho.pc, "_contents5")))
               .a(nw.a().a(dvi.aL, 6), ob.a().a(oc.c, oj.a(dho.pc, "_contents6")))
               .a(nw.a().a(dvi.aL, 7), ob.a().a(oc.c, oj.a(dho.pc, "_contents7")))
               .a(nw.a().a(dvi.aL, 8), ob.a().a(oc.c, oj.a(dho.pc, "_contents_ready")))
         );
   }

   private void w(dhm $$0) {
      ale $$1 = oi.c.a($$0, oj.a($$0), this.c);
      ale $$2 = this.a($$0, "_powered", oi.c, oj::b);
      ale $$3 = this.a($$0, "_lit", oi.c, oj::b);
      ale $$4 = this.a($$0, "_lit_powered", oi.c, oj::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nv a(dhm $$0, ale $$1, ale $$2, ale $$3, ale $$4) {
      return ny.a($$0).a(nz.a(dvi.r, dvi.w).a(($$4x, $$5) -> $$4x ? ob.a().a(oc.c, $$5 ? $$4 : $$2) : ob.a().a(oc.c, $$5 ? $$3 : $$1)));
   }

   private void i(dhm $$0, dhm $$1) {
      ale $$2 = og.a($$0);
      ale $$3 = og.a($$0, "_powered");
      ale $$4 = og.a($$0, "_lit");
      ale $$5 = og.a($$0, "_lit_powered");
      this.a($$1, og.a($$0.q()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dhm $$0) {
      this.c($$0);
      this.b.accept(ny.a($$0, ob.a().a(oc.c, oi.ao.a($$0, oj.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dho.qy);
      this.x(dho.qx);
      this.x(dho.qw);
      this.x(dho.qv);
   }

   private void H() {
      this.c(dho.st);
      nz.b<jk, dvp> $$0 = nz.a(dvi.bm, dvi.bn);

      for (dvp $$1 : dvp.values()) {
         $$0.a(jk.b, $$1, this.a(jk.b, $$1));
      }

      for (dvp $$2 : dvp.values()) {
         $$0.a(jk.a, $$2, this.a(jk.a, $$2));
      }

      this.b.accept(ny.a(dho.st).a($$0));
   }

   private ob a(jk $$0, dvp $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oj $$3 = oj.c(oj.a(dho.st, $$2));
      return ob.a().a(oc.c, oi.an.a(dho.st, $$2, $$3, this.c));
   }

   private void y(dhm $$0) {
      oj $$1 = new oj().a(ok.e, oj.G(dho.dV)).a(ok.f, oj.G($$0)).a(ok.i, oj.a($$0, "_side"));
      this.b.accept(c($$0, oi.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ale $$0 = oj.a(dho.gZ, "_side");
      oj $$1 = new oj().a(ok.f, oj.a(dho.gZ, "_top")).a(ok.i, $$0);
      oj $$2 = new oj().a(ok.f, oj.a(dho.gZ, "_inverted_top")).a(ok.i, $$0);
      this.b
         .accept(
            ny.a(dho.gZ)
               .a(nz.a(dvi.p).a(false, ob.a().a(oc.c, oi.aF.a(dho.gZ, $$1, this.c))).a(true, ob.a().a(oc.c, oi.aF.a(og.a(dho.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dhm $$0) {
      this.b.accept(ny.a($$0, ob.a().a(oc.c, og.a($$0))).a(this.n()));
   }

   private void J() {
      dhm $$0 = dho.ss;
      ale $$1 = og.a($$0, "_on");
      ale $$2 = og.a($$0);
      this.b.accept(ny.a($$0, ob.a().a(oc.c, og.a($$0))).a(this.n()).a(a(dvi.w, $$1, $$2)));
   }

   private void K() {
      oj $$0 = new oj().a(ok.B, oj.G(dho.j)).a(ok.f, oj.G(dho.cC));
      oj $$1 = new oj().a(ok.B, oj.G(dho.j)).a(ok.f, oj.a(dho.cC, "_moist"));
      ale $$2 = oi.aW.a(dho.cC, $$0, this.c);
      ale $$3 = oi.aW.a(oj.a(dho.cC, "_moist"), $$1, this.c);
      this.b.accept(ny.a(dho.cC).a(a(dvi.aQ, 7, $$3, $$2)));
   }

   private List<ale> A(dhm $$0) {
      ale $$1 = oi.aX.a(og.a($$0, "_floor0"), oj.v($$0), this.c);
      ale $$2 = oi.aX.a(og.a($$0, "_floor1"), oj.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ale> B(dhm $$0) {
      ale $$1 = oi.aY.a(og.a($$0, "_side0"), oj.v($$0), this.c);
      ale $$2 = oi.aY.a(og.a($$0, "_side1"), oj.w($$0), this.c);
      ale $$3 = oi.aZ.a(og.a($$0, "_side_alt0"), oj.v($$0), this.c);
      ale $$4 = oi.aZ.a(og.a($$0, "_side_alt1"), oj.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ale> C(dhm $$0) {
      ale $$1 = oi.ba.a(og.a($$0, "_up0"), oj.v($$0), this.c);
      ale $$2 = oi.ba.a(og.a($$0, "_up1"), oj.w($$0), this.c);
      ale $$3 = oi.bb.a(og.a($$0, "_up_alt0"), oj.v($$0), this.c);
      ale $$4 = oi.bb.a(og.a($$0, "_up_alt1"), oj.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<ob> a(List<ale> $$0, UnaryOperator<ob> $$1) {
      return $$0.stream().map($$0x -> ob.a().a(oc.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nw $$0 = nw.a().a(dvi.L, false).a(dvi.M, false).a(dvi.N, false).a(dvi.O, false).a(dvi.J, false);
      List<ale> $$1 = this.A(dho.cr);
      List<ale> $$2 = this.B(dho.cr);
      List<ale> $$3 = this.C(dho.cr);
      this.b
         .accept(
            nx.a(dho.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nw.b(nw.a().a(dvi.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nw.b(nw.a().a(dvi.M, true), $$0), a($$2, $$0x -> $$0x.a(oc.b, oc.a.b)))
               .a(nw.b(nw.a().a(dvi.N, true), $$0), a($$2, $$0x -> $$0x.a(oc.b, oc.a.c)))
               .a(nw.b(nw.a().a(dvi.O, true), $$0), a($$2, $$0x -> $$0x.a(oc.b, oc.a.d)))
               .a(nw.a().a(dvi.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ale> $$0 = this.A(dho.cs);
      List<ale> $$1 = this.B(dho.cs);
      this.b
         .accept(
            nx.a(dho.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(oc.b, oc.a.b)))
               .a(a($$1, $$0x -> $$0x.a(oc.b, oc.a.c)))
               .a(a($$1, $$0x -> $$0x.a(oc.b, oc.a.d)))
         );
   }

   private void D(dhm $$0) {
      ale $$1 = ol.t.create($$0, this.c);
      ale $$2 = ol.u.create($$0, this.c);
      this.a($$0.q());
      this.b.accept(ny.a($$0).a(a(dvi.j, $$2, $$1)));
   }

   private void N() {
      oj $$0 = oj.a(oj.a(dho.ad, "_side"), oj.a(dho.ad, "_top"));
      ale $$1 = oi.j.a(dho.ad, $$0, this.c);
      this.b.accept(d(dho.ad, $$1));
   }

   private void O() {
      this.a(cvw.ad);
      dhm $$0 = dho.E;
      nz.b<Boolean, Integer> $$1 = nz.a(dmh.d, dmh.b);
      ale $$2 = og.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ale $$4 = og.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, ob.a().a(oc.c, $$4));
         $$1.a(false, $$3, ob.a().a(oc.c, $$2));
      }

      this.b.accept(ny.a(dho.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            ny.a(dho.kI)
               .a(
                  nz.a(dvi.as)
                     .a(0, ob.a().a(oc.c, this.a(dho.kI, "_0", oi.c, oj::b)))
                     .a(1, ob.a().a(oc.c, this.a(dho.kI, "_1", oi.c, oj::b)))
                     .a(2, ob.a().a(oc.c, this.a(dho.kI, "_2", oi.c, oj::b)))
                     .a(3, ob.a().a(oc.c, this.a(dho.kI, "_3", oi.c, oj::b)))
               )
         );
   }

   private void Q() {
      ale $$0 = oj.G(dho.j);
      oj $$1 = new oj().a(ok.e, $$0).b(ok.e, ok.c).a(ok.f, oj.a(dho.i, "_top")).a(ok.i, oj.a(dho.i, "_snow"));
      ob $$2 = ob.a().a(oc.c, oi.n.a(dho.i, "_snow", $$1, this.c));
      this.a(dho.i, og.a(dho.i), $$2);
      ale $$3 = ol.f.get(dho.fl).a($$1x -> $$1x.a(ok.e, $$0)).a(dho.fl, this.c);
      this.a(dho.fl, $$3, $$2);
      ale $$4 = ol.f.get(dho.l).a($$1x -> $$1x.a(ok.e, $$0)).a(dho.l, this.c);
      this.a(dho.l, $$4, $$2);
   }

   private void a(dhm $$0, ale $$1, ob $$2) {
      List<ob> $$3 = Arrays.asList(a($$1));
      this.b.accept(ny.a($$0).a(nz.a(dvi.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cvw.ri);
      this.b
         .accept(
            ny.a(dho.fC)
               .a(
                  nz.a(dvi.ar)
                     .a(0, ob.a().a(oc.c, og.a(dho.fC, "_stage0")))
                     .a(1, ob.a().a(oc.c, og.a(dho.fC, "_stage1")))
                     .a(2, ob.a().a(oc.c, og.a(dho.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dho.kE, og.a(dho.kE)));
   }

   private void j(dhm $$0, dhm $$1) {
      oj $$2 = oj.b($$1);
      ale $$3 = oi.Y.a($$0, $$2, this.c);
      ale $$4 = oi.Z.a($$0, $$2, this.c);
      this.b.accept(ny.a($$0).a(a(dvi.aT, 1, $$4, $$3)));
   }

   private void T() {
      ale $$0 = og.a(dho.hc);
      ale $$1 = og.a(dho.hc, "_side");
      this.a(cvw.lR);
      this.b
         .accept(
            ny.a(dho.hc)
               .a(
                  nz.a(dvi.Q)
                     .a(jk.a, ob.a().a(oc.c, $$0))
                     .a(jk.c, ob.a().a(oc.c, $$1))
                     .a(jk.f, ob.a().a(oc.c, $$1).a(oc.b, oc.a.b))
                     .a(jk.d, ob.a().a(oc.c, $$1).a(oc.b, oc.a.c))
                     .a(jk.e, ob.a().a(oc.c, $$1).a(oc.b, oc.a.d))
               )
         );
   }

   private void k(dhm $$0, dhm $$1) {
      ale $$2 = og.a($$0);
      this.b.accept(ny.a($$1, ob.a().a(oc.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ale $$0 = og.a(dho.eW, "_post_ends");
      ale $$1 = og.a(dho.eW, "_post");
      ale $$2 = og.a(dho.eW, "_cap");
      ale $$3 = og.a(dho.eW, "_cap_alt");
      ale $$4 = og.a(dho.eW, "_side");
      ale $$5 = og.a(dho.eW, "_side_alt");
      this.b
         .accept(
            nx.a(dho.eW)
               .a(ob.a().a(oc.c, $$0))
               .a(nw.a().a(dvi.L, false).a(dvi.M, false).a(dvi.N, false).a(dvi.O, false), ob.a().a(oc.c, $$1))
               .a(nw.a().a(dvi.L, true).a(dvi.M, false).a(dvi.N, false).a(dvi.O, false), ob.a().a(oc.c, $$2))
               .a(nw.a().a(dvi.L, false).a(dvi.M, true).a(dvi.N, false).a(dvi.O, false), ob.a().a(oc.c, $$2).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.L, false).a(dvi.M, false).a(dvi.N, true).a(dvi.O, false), ob.a().a(oc.c, $$3))
               .a(nw.a().a(dvi.L, false).a(dvi.M, false).a(dvi.N, false).a(dvi.O, true), ob.a().a(oc.c, $$3).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.L, true), ob.a().a(oc.c, $$4))
               .a(nw.a().a(dvi.M, true), ob.a().a(oc.c, $$4).a(oc.b, oc.a.b))
               .a(nw.a().a(dvi.N, true), ob.a().a(oc.c, $$5))
               .a(nw.a().a(dvi.O, true), ob.a().a(oc.c, $$5).a(oc.b, oc.a.b))
         );
      this.d(dho.eW);
   }

   private void E(dhm $$0) {
      this.b.accept(ny.a($$0, ob.a().a(oc.c, og.a($$0))).a(b()));
   }

   private void V() {
      ale $$0 = og.a(dho.dw);
      ale $$1 = og.a(dho.dw, "_on");
      this.d(dho.dw);
      this.b
         .accept(
            ny.a(dho.dw)
               .a(a(dvi.w, $$0, $$1))
               .a(
                  nz.a(dvi.U, dvi.R)
                     .a(dvd.c, jk.c, ob.a().a(oc.a, oc.a.c).a(oc.b, oc.a.c))
                     .a(dvd.c, jk.f, ob.a().a(oc.a, oc.a.c).a(oc.b, oc.a.d))
                     .a(dvd.c, jk.d, ob.a().a(oc.a, oc.a.c))
                     .a(dvd.c, jk.e, ob.a().a(oc.a, oc.a.c).a(oc.b, oc.a.b))
                     .a(dvd.a, jk.c, ob.a())
                     .a(dvd.a, jk.f, ob.a().a(oc.b, oc.a.b))
                     .a(dvd.a, jk.d, ob.a().a(oc.b, oc.a.c))
                     .a(dvd.a, jk.e, ob.a().a(oc.b, oc.a.d))
                     .a(dvd.b, jk.c, ob.a().a(oc.a, oc.a.b))
                     .a(dvd.b, jk.f, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.b))
                     .a(dvd.b, jk.d, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.c))
                     .a(dvd.b, jk.e, ob.a().a(oc.a, oc.a.b).a(oc.b, oc.a.d))
               )
         );
   }

   private void W() {
      this.d(dho.fm);
      this.b.accept(b(dho.fm, og.a(dho.fm)));
   }

   private void X() {
      this.d(dho.tn);
      this.b.accept(c(dho.tn, og.a(dho.tn)));
   }

   private void Y() {
      this.b.accept(ny.a(dho.ed).a(nz.a(dvi.H).a(jk.a.a, ob.a().a(oc.c, og.a(dho.ed, "_ns"))).a(jk.a.c, ob.a().a(oc.c, og.a(dho.ed, "_ew")))));
   }

   private void Z() {
      ale $$0 = ol.a.create(dho.dV, this.c);
      this.b
         .accept(
            ny.a(
               dho.dV,
               ob.a().a(oc.c, $$0),
               ob.a().a(oc.c, $$0).a(oc.a, oc.a.b),
               ob.a().a(oc.c, $$0).a(oc.a, oc.a.c),
               ob.a().a(oc.c, $$0).a(oc.a, oc.a.d),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.b),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.b).a(oc.a, oc.a.b),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.b).a(oc.a, oc.a.c),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.b).a(oc.a, oc.a.d),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.c),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.c).a(oc.a, oc.a.b),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.c).a(oc.a, oc.a.c),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.c).a(oc.a, oc.a.d),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.d),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.d).a(oc.a, oc.a.b),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.d).a(oc.a, oc.a.c),
               ob.a().a(oc.c, $$0).a(oc.b, oc.a.d).a(oc.a, oc.a.d)
            )
         );
   }

   private void aa() {
      ale $$0 = og.a(dho.kO);
      ale $$1 = og.a(dho.kO, "_on");
      this.b.accept(ny.a(dho.kO).a(a(dvi.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oj $$0 = new oj().a(ok.e, oj.a(dho.by, "_bottom")).a(ok.i, oj.a(dho.by, "_side"));
      ale $$1 = oj.a(dho.by, "_top_sticky");
      ale $$2 = oj.a(dho.by, "_top");
      oj $$3 = $$0.c(ok.E, $$1);
      oj $$4 = $$0.c(ok.E, $$2);
      ale $$5 = og.a(dho.by, "_base");
      this.a(dho.by, $$5, $$4);
      this.a(dho.br, $$5, $$3);
      ale $$6 = oi.n.a(dho.by, "_inventory", $$0.c(ok.f, $$2), this.c);
      ale $$7 = oi.n.a(dho.br, "_inventory", $$0.c(ok.f, $$1), this.c);
      this.a(dho.by, $$6);
      this.a(dho.br, $$7);
   }

   private void a(dhm $$0, ale $$1, oj $$2) {
      ale $$3 = oi.bj.a($$0, $$2, this.c);
      this.b.accept(ny.a($$0).a(a(dvi.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oj $$0 = new oj().a(ok.F, oj.a(dho.by, "_top")).a(ok.i, oj.a(dho.by, "_side"));
      oj $$1 = $$0.c(ok.E, oj.a(dho.by, "_top_sticky"));
      oj $$2 = $$0.c(ok.E, oj.a(dho.by, "_top"));
      this.b
         .accept(
            ny.a(dho.bz)
               .a(
                  nz.a(dvi.x, dvi.bg)
                     .a(false, dvu.a, ob.a().a(oc.c, oi.bk.a(dho.by, "_head", $$2, this.c)))
                     .a(false, dvu.b, ob.a().a(oc.c, oi.bk.a(dho.by, "_head_sticky", $$1, this.c)))
                     .a(true, dvu.a, ob.a().a(oc.c, oi.bl.a(dho.by, "_head_short", $$2, this.c)))
                     .a(true, dvu.b, ob.a().a(oc.c, oi.bl.a(dho.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dhm $$0 = dho.tr;
      oj $$1 = oj.a($$0, "_side_inactive", "_top_inactive");
      oj $$2 = oj.a($$0, "_side_active", "_top_active");
      oj $$3 = oj.a($$0, "_side_active", "_top_ejecting_reward");
      oj $$4 = oj.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      oj $$5 = oj.a($$0, "_side_active_ominous", "_top_active_ominous");
      oj $$6 = oj.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      ale $$7 = oi.o.a($$0, $$1, this.c);
      ale $$8 = oi.o.a($$0, "_active", $$2, this.c);
      ale $$9 = oi.o.a($$0, "_ejecting_reward", $$3, this.c);
      ale $$10 = oi.o.a($$0, "_inactive_ominous", $$4, this.c);
      ale $$11 = oi.o.a($$0, "_active_ominous", $$5, this.c);
      ale $$12 = oi.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(ny.a($$0).a(nz.a(dvi.by, dvi.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> ob.a().a(oc.c, $$7x ? $$10 : $$7);
            case b, c, d -> ob.a().a(oc.c, $$7x ? $$11 : $$8);
            case e -> ob.a().a(oc.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dhm $$0 = dho.ts;
      oj $$1 = oj.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      oj $$2 = oj.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      oj $$3 = oj.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      oj $$4 = oj.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ale $$5 = oi.bP.a($$0, $$1, this.c);
      ale $$6 = oi.bP.a($$0, "_active", $$2, this.c);
      ale $$7 = oi.bP.a($$0, "_unlocking", $$3, this.c);
      ale $$8 = oi.bP.a($$0, "_ejecting_reward", $$4, this.c);
      oj $$9 = oj.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      oj $$10 = oj.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oj $$11 = oj.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oj $$12 = oj.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      ale $$13 = oi.bP.a($$0, "_ominous", $$9, this.c);
      ale $$14 = oi.bP.a($$0, "_active_ominous", $$10, this.c);
      ale $$15 = oi.bP.a($$0, "_unlocking_ominous", $$11, this.c);
      ale $$16 = oi.bP.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(ny.a($$0).a(b()).a(nz.a(dqi.b, dqi.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> ob.a().a(oc.c, $$9x ? $$13 : $$5);
            case b -> ob.a().a(oc.c, $$9x ? $$14 : $$6);
            case c -> ob.a().a(oc.c, $$9x ? $$15 : $$7);
            case d -> ob.a().a(oc.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      ale $$0 = og.a(dho.qQ, "_inactive");
      ale $$1 = og.a(dho.qQ, "_active");
      this.a(dho.qQ, $$0);
      this.b.accept(ny.a(dho.qQ).a(nz.a(dvi.bo).a($$2 -> ob.a().a(oc.c, $$2 != dvz.b && $$2 != dvz.c ? $$0 : $$1))));
   }

   private void ag() {
      ale $$0 = og.a(dho.qR, "_inactive");
      ale $$1 = og.a(dho.qR, "_active");
      this.a(dho.qR, $$0);
      this.b.accept(ny.a(dho.qR).a(nz.a(dvi.bo).a($$2 -> ob.a().a(oc.c, $$2 != dvz.b && $$2 != dvz.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      ale $$0 = oi.bO.a(dho.qV, oj.a(false), this.c);
      ale $$1 = oi.bO.a(dho.qV, "_can_summon", oj.a(true), this.c);
      this.a(dho.qV, $$0);
      this.b.accept(ny.a(dho.qV).a(a(dvi.G, $$1, $$0)));
   }

   private void ai() {
      ale $$0 = og.a(dho.nS, "_stable");
      ale $$1 = og.a(dho.nS, "_unstable");
      this.a(dho.nS, $$0);
      this.b.accept(ny.a(dho.nS).a(a(dvi.b, $$1, $$0)));
   }

   private void aj() {
      ale $$0 = this.a(dho.sv, "", oi.ao, oj::c);
      ale $$1 = this.a(dho.sv, "_lit", oi.ao, oj::c);
      this.b.accept(ny.a(dho.sv).a(a(dvi.D, $$1, $$0)));
      ale $$2 = this.a(dho.sw, "", oi.ao, oj::c);
      ale $$3 = this.a(dho.sw, "_lit", oi.ao, oj::c);
      this.b.accept(ny.a(dho.sw).a(a(dvi.D, $$3, $$2)));
   }

   private void ak() {
      ale $$0 = ol.a.create(dho.fB, this.c);
      ale $$1 = this.a(dho.fB, "_on", oi.c, oj::b);
      this.b.accept(ny.a(dho.fB).a(a(dvi.r, $$1, $$0)));
   }

   private void l(dhm $$0, dhm $$1) {
      oj $$2 = oj.y($$0);
      this.b.accept(c($$0, oi.bf.a($$0, $$2, this.c)));
      this.b.accept(ny.a($$1, ob.a().a(oc.c, oi.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oj $$0 = oj.y(dho.dK);
      oj $$1 = oj.i(oj.a(dho.dK, "_off"));
      ale $$2 = oi.bh.a(dho.dK, $$0, this.c);
      ale $$3 = oi.bh.a(dho.dK, "_off", $$1, this.c);
      this.b.accept(ny.a(dho.dK).a(a(dvi.r, $$2, $$3)));
      ale $$4 = oi.bi.a(dho.dL, $$0, this.c);
      ale $$5 = oi.bi.a(dho.dL, "_off", $$1, this.c);
      this.b.accept(ny.a(dho.dL).a(a(dvi.r, $$4, $$5)).a(d()));
      this.d(dho.dK);
      this.c(dho.dL);
   }

   private void am() {
      this.a(cvw.lK);
      this.b.accept(ny.a(dho.eh).a(nz.a(dvi.aA, dvi.s, dvi.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return ob.a().a(oc.c, oj.a(dho.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cvw.cT);
      this.b
         .accept(
            ny.a(dho.mV)
               .a(
                  nz.a(dvi.aS, dvi.C)
                     .a(1, false, Arrays.asList(a(og.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(og.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(og.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(og.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(og.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(og.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(og.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(og.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      oj $$0 = oj.a(dho.dN);
      ale $$1 = oi.c.a(dho.dP, $$0, this.c);
      this.b.accept(ny.a(dho.dN).a(nz.a(dvi.aF).a($$1x -> ob.a().a(oc.c, $$1x < 8 ? og.a(dho.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dho.dN, og.a(dho.dN, "_height2"));
      this.b.accept(c(dho.dP, $$1));
   }

   private void ap() {
      this.b.accept(ny.a(dho.oc, ob.a().a(oc.c, og.a(dho.oc))).a(b()));
   }

   private void aq() {
      ale $$0 = ol.a.create(dho.pa, this.c);
      this.a(dho.pa, $$0);
      this.b.accept(ny.a(dho.pa).a(nz.a(dvi.bj).a($$0x -> ob.a().a(oc.c, this.a(dho.pa, "_" + $$0x.c(), oi.c, oj::b)))));
   }

   private void ar() {
      this.a(cvw.wx);
      this.b.accept(ny.a(dho.oi).a(nz.a(dvi.as).a($$0 -> ob.a().a(oc.c, this.a(dho.oi, "_stage" + $$0, oi.ao, oj::c)))));
   }

   private void as() {
      this.a(cvw.pt);
      this.b
         .accept(
            ny.a(dho.fI)
               .a(
                  nz.a(dvi.a, dvi.M, dvi.L, dvi.N, dvi.O)
                     .a(false, false, false, false, false, ob.a().a(oc.c, og.a(dho.fI, "_ns")))
                     .a(false, true, false, false, false, ob.a().a(oc.c, og.a(dho.fI, "_n")).a(oc.b, oc.a.b))
                     .a(false, false, true, false, false, ob.a().a(oc.c, og.a(dho.fI, "_n")))
                     .a(false, false, false, true, false, ob.a().a(oc.c, og.a(dho.fI, "_n")).a(oc.b, oc.a.c))
                     .a(false, false, false, false, true, ob.a().a(oc.c, og.a(dho.fI, "_n")).a(oc.b, oc.a.d))
                     .a(false, true, true, false, false, ob.a().a(oc.c, og.a(dho.fI, "_ne")))
                     .a(false, true, false, true, false, ob.a().a(oc.c, og.a(dho.fI, "_ne")).a(oc.b, oc.a.b))
                     .a(false, false, false, true, true, ob.a().a(oc.c, og.a(dho.fI, "_ne")).a(oc.b, oc.a.c))
                     .a(false, false, true, false, true, ob.a().a(oc.c, og.a(dho.fI, "_ne")).a(oc.b, oc.a.d))
                     .a(false, false, true, true, false, ob.a().a(oc.c, og.a(dho.fI, "_ns")))
                     .a(false, true, false, false, true, ob.a().a(oc.c, og.a(dho.fI, "_ns")).a(oc.b, oc.a.b))
                     .a(false, true, true, true, false, ob.a().a(oc.c, og.a(dho.fI, "_nse")))
                     .a(false, true, false, true, true, ob.a().a(oc.c, og.a(dho.fI, "_nse")).a(oc.b, oc.a.b))
                     .a(false, false, true, true, true, ob.a().a(oc.c, og.a(dho.fI, "_nse")).a(oc.b, oc.a.c))
                     .a(false, true, true, false, true, ob.a().a(oc.c, og.a(dho.fI, "_nse")).a(oc.b, oc.a.d))
                     .a(false, true, true, true, true, ob.a().a(oc.c, og.a(dho.fI, "_nsew")))
                     .a(true, false, false, false, false, ob.a().a(oc.c, og.a(dho.fI, "_attached_ns")))
                     .a(true, false, true, false, false, ob.a().a(oc.c, og.a(dho.fI, "_attached_n")))
                     .a(true, false, false, true, false, ob.a().a(oc.c, og.a(dho.fI, "_attached_n")).a(oc.b, oc.a.c))
                     .a(true, true, false, false, false, ob.a().a(oc.c, og.a(dho.fI, "_attached_n")).a(oc.b, oc.a.b))
                     .a(true, false, false, false, true, ob.a().a(oc.c, og.a(dho.fI, "_attached_n")).a(oc.b, oc.a.d))
                     .a(true, true, true, false, false, ob.a().a(oc.c, og.a(dho.fI, "_attached_ne")))
                     .a(true, true, false, true, false, ob.a().a(oc.c, og.a(dho.fI, "_attached_ne")).a(oc.b, oc.a.b))
                     .a(true, false, false, true, true, ob.a().a(oc.c, og.a(dho.fI, "_attached_ne")).a(oc.b, oc.a.c))
                     .a(true, false, true, false, true, ob.a().a(oc.c, og.a(dho.fI, "_attached_ne")).a(oc.b, oc.a.d))
                     .a(true, false, true, true, false, ob.a().a(oc.c, og.a(dho.fI, "_attached_ns")))
                     .a(true, true, false, false, true, ob.a().a(oc.c, og.a(dho.fI, "_attached_ns")).a(oc.b, oc.a.b))
                     .a(true, true, true, true, false, ob.a().a(oc.c, og.a(dho.fI, "_attached_nse")))
                     .a(true, true, false, true, true, ob.a().a(oc.c, og.a(dho.fI, "_attached_nse")).a(oc.b, oc.a.b))
                     .a(true, false, true, true, true, ob.a().a(oc.c, og.a(dho.fI, "_attached_nse")).a(oc.b, oc.a.c))
                     .a(true, true, true, false, true, ob.a().a(oc.c, og.a(dho.fI, "_attached_nse")).a(oc.b, oc.a.d))
                     .a(true, true, true, true, true, ob.a().a(oc.c, og.a(dho.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dho.fH);
      this.b.accept(ny.a(dho.fH).a(nz.a(dvi.a, dvi.w).a(($$0, $$1) -> ob.a().a(oc.c, oj.a(dho.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ale a(int $$0, String $$1, oj $$2) {
      switch ($$0) {
         case 1:
            return oi.bn.a(og.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return oi.bo.a(og.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return oi.bp.a(og.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return oi.bq.a(og.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ale a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", oj.b(oj.G(dho.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oj.b(oj.a(dho.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oj.b(oj.a(dho.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cvw.kp);
      this.b.accept(ny.a(dho.mf).a(nz.a(dvi.aD, dvi.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cvw.kq);
      Function<Integer, ale> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oj $$2 = oj.a($$1);
         return oi.by.a(dho.mg, $$1, $$2, this.c);
      };
      this.b.accept(ny.a(dho.mg).a(nz.a(dov.c).a($$1 -> ob.a().a(oc.c, $$0.apply($$1)))));
   }

   private void F(dhm $$0) {
      this.d($$0);
      ale $$1 = og.a($$0);
      nx $$2 = nx.a($$0);
      nw.c $$3 = ad.a(nw.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dvj, Function<ale, ob>> $$4 : a) {
         dvj $$5 = (dvj)$$4.getFirst();
         Function<ale, ob> $$6 = (Function<ale, ob>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(nw.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      ale $$0 = oj.a(dho.qU, "_bottom");
      oj $$1 = new oj().a(ok.e, $$0).a(ok.f, oj.a(dho.qU, "_top")).a(ok.i, oj.a(dho.qU, "_side"));
      oj $$2 = new oj().a(ok.e, $$0).a(ok.f, oj.a(dho.qU, "_top_bloom")).a(ok.i, oj.a(dho.qU, "_side_bloom"));
      ale $$3 = oi.n.a(dho.qU, "", $$1, this.c);
      ale $$4 = oi.n.a(dho.qU, "_bloom", $$2, this.c);
      this.b.accept(ny.a(dho.qU).a(nz.a(dvi.E).a($$2x -> ob.a().a(oc.c, $$2x ? $$4 : $$3))));
      this.a(cvw.gj, $$3);
   }

   private void ax() {
      dhm $$0 = dho.cm;
      ale $$1 = og.a($$0);
      nx $$2 = nx.a($$0);
      List.of(Pair.of(jk.c, oc.a.a), Pair.of(jk.f, oc.a.b), Pair.of(jk.d, oc.a.c), Pair.of(jk.e, oc.a.d)).forEach($$2x -> {
         jk $$3 = (jk)$$2x.getFirst();
         oc.a $$4 = (oc.a)$$2x.getSecond();
         nw.c $$5 = nw.a().a(dvi.R, $$3);
         $$2.a($$5, ob.a().a(oc.c, $$1).a(oc.b, $$4).a(oc.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, og.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nx $$0, nw.c $$1, oc.a $$2) {
      List.of(Pair.of(dvi.bp, oi.aM), Pair.of(dvi.bq, oi.aN), Pair.of(dvi.br, oi.aO), Pair.of(dvi.bs, oi.aP), Pair.of(dvi.bt, oi.aQ), Pair.of(dvi.bu, oi.aR))
         .forEach($$3 -> {
            dvj $$4 = (dvj)$$3.getFirst();
            oh $$5 = (oh)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nx $$0, nw.c $$1, oc.a $$2, dvj $$3, oh $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oj $$7 = new oj().a(ok.b, oj.a(dho.cm, $$6));
      ns.d $$8 = new ns.d($$4, $$6);
      ale $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dho.cm, $$6, $$7, this.c));
      $$0.a(nw.a($$1, nw.a().a($$3, $$5)), ob.a().a(oc.c, $$9).a(oc.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dho.kJ, oi.c.a(dho.kJ, oj.b(og.a("magma")), this.c)));
   }

   private void G(dhm $$0) {
      this.b($$0, ol.q);
      oi.bF.a(og.a($$0.q()), oj.u($$0), this.c);
   }

   private void b(dhm $$0, dhm $$1, ns.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dhm $$0, dhm $$1) {
      oi.bG.a(og.a($$0.q()), oj.u($$1), this.c);
   }

   private void az() {
      ale $$0 = og.a(dho.b);
      ale $$1 = og.a(dho.b, "_mirrored");
      this.b.accept(a(dho.eN, $$0, $$1));
      this.a(dho.eN, $$0);
   }

   private void aA() {
      ale $$0 = og.a(dho.sJ);
      ale $$1 = og.a(dho.sJ, "_mirrored");
      this.b.accept(a(dho.td, $$0, $$1).a(f()));
      this.a(dho.td, $$0);
   }

   private void n(dhm $$0, dhm $$1) {
      this.a($$0, ns.e.b);
      oj $$2 = oj.d(oj.a($$0, "_pot"));
      ale $$3 = ns.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      ale $$0 = oj.a(dho.pl, "_bottom");
      ale $$1 = oj.a(dho.pl, "_top_off");
      ale $$2 = oj.a(dho.pl, "_top");
      ale[] $$3 = new ale[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oj $$5 = new oj().a(ok.e, $$0).a(ok.f, $$4 == 0 ? $$1 : $$2).a(ok.i, oj.a(dho.pl, "_side" + $$4));
         $$3[$$4] = oi.n.a(dho.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(ny.a(dho.pl).a(nz.a(dvi.aZ).a($$1x -> ob.a().a(oc.c, $$3[$$1x]))));
      this.a(cvw.wV, $$3[0]);
   }

   private ob a(jm $$0, ob $$1) {
      switch ($$0) {
         case b:
            return $$1.a(oc.a, oc.a.b);
         case c:
            return $$1.a(oc.a, oc.a.b).a(oc.b, oc.a.c);
         case d:
            return $$1.a(oc.a, oc.a.b).a(oc.b, oc.a.d);
         case a:
            return $$1.a(oc.a, oc.a.b).a(oc.b, oc.a.b);
         case f:
            return $$1.a(oc.a, oc.a.d).a(oc.b, oc.a.c);
         case g:
            return $$1.a(oc.a, oc.a.d);
         case h:
            return $$1.a(oc.a, oc.a.d).a(oc.b, oc.a.b);
         case e:
            return $$1.a(oc.a, oc.a.d).a(oc.b, oc.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(oc.b, oc.a.c);
         case i:
            return $$1.a(oc.b, oc.a.d);
         case j:
            return $$1.a(oc.b, oc.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      ale $$0 = oj.a(dho.pb, "_top");
      ale $$1 = oj.a(dho.pb, "_bottom");
      ale $$2 = oj.a(dho.pb, "_side");
      ale $$3 = oj.a(dho.pb, "_lock");
      oj $$4 = new oj().a(ok.o, $$2).a(ok.m, $$2).a(ok.l, $$2).a(ok.c, $$0).a(ok.j, $$0).a(ok.k, $$1).a(ok.n, $$3);
      ale $$5 = oi.b.a(dho.pb, $$4, this.c);
      this.b.accept(ny.a(dho.pb, ob.a().a(oc.c, $$5)).a(nz.a(dvi.T).a($$0x -> this.a($$0x, ob.a()))));
   }

   private void aD() {
      dhm $$0 = dho.n;
      ale $$1 = og.a($$0);
      ol $$2 = ol.a.get($$0);
      dhm $$3 = dho.jH;
      ale $$4 = oi.ab.a($$3, $$2.b(), this.c);
      ale $$5 = oi.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ly.a().filter(lz::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dho.rf).a(ly.w).a(dho.rf, dho.rD).a(dho.rj, dho.rn).a(ly.y);
      this.h(dho.re).a(ly.A).a(dho.re, dho.rC).a(dho.ri, dho.rm).a(ly.C);
      this.h(dho.rd).a(ly.E).a(dho.rd, dho.rB).a(dho.rh, dho.rl).a(ly.G);
      this.h(dho.rc).a(ly.I).a(dho.rc, dho.rA).a(dho.rg, dho.rk).a(ly.K);
      this.w(dho.sk);
      this.w(dho.sl);
      this.w(dho.sm);
      this.w(dho.sn);
      this.i(dho.sk, dho.so);
      this.i(dho.sl, dho.sp);
      this.i(dho.sm, dho.sq);
      this.i(dho.sn, dho.sr);
      this.m(dho.a);
      this.c(dho.nc, dho.a);
      this.c(dho.nb, dho.a);
      this.m(dho.fO);
      this.m(dho.dQ);
      this.c(dho.nd, dho.G);
      this.m(dho.fA);
      this.m(dho.me);
      this.m(dho.fr);
      this.m(dho.fR);
      this.a(cvw.ug);
      this.m(dho.pg);
      this.m(dho.G);
      this.m(dho.H);
      this.m(dho.hV);
      this.a(cvw.fS);
      this.o(dho.pM, dho.qd);
      this.o(dho.pN, dho.qe);
      this.o(dho.pO, dho.qf);
      this.o(dho.pP, dho.qg);
      this.o(dho.pQ, dho.qh);
      this.o(dho.pR, dho.qi);
      this.o(dho.pS, dho.qj);
      this.o(dho.pT, dho.qk);
      this.o(dho.pU, dho.ql);
      this.o(dho.pV, dho.qm);
      this.o(dho.pW, dho.qn);
      this.o(dho.pX, dho.qo);
      this.o(dho.pY, dho.qp);
      this.o(dho.pZ, dho.qq);
      this.o(dho.qa, dho.qr);
      this.o(dho.qb, dho.qs);
      this.o(dho.pL, dho.qc);
      this.m(dho.na);
      this.m(dho.gs);
      this.m(dho.qP);
      this.m(dho.sx);
      this.s(dho.sy);
      this.s(dho.sz);
      this.t(dho.ti);
      this.t(dho.tj);
      this.aj();
      this.g(dho.sC, dho.sA);
      this.p(dho.sB);
      this.a(dho.hW, cvw.hB);
      this.a(cvw.hB);
      this.aE();
      this.a(dho.kN, cvw.jb);
      this.a(cvw.jb);
      this.f(dho.bQ, oj.a(dho.by, "_side"));
      this.a(dho.R);
      this.a(dho.S);
      this.a(dho.iB);
      this.a(dho.cx);
      this.a(dho.cy);
      this.a(dho.cz);
      this.a(dho.fE);
      this.a(dho.fF);
      this.a(dho.fJ);
      this.a(dho.N);
      this.a(dho.T);
      this.a(dho.O);
      this.a(dho.ch);
      this.a(dho.P);
      this.a(dho.Q);
      this.a(dho.ci);
      this.b(dho.pj, ol.d);
      this.a(dho.pi);
      this.a(dho.aR);
      this.a(dho.aS);
      this.a(dho.aT);
      this.a(dho.hb);
      this.a(dho.dI);
      this.a(dho.dJ);
      this.a(dho.ha);
      this.a(dho.pC);
      this.a(dho.mW);
      this.a(dho.dR);
      this.a(dho.k);
      this.a(dho.pk);
      this.a(dho.fz);
      this.a(dho.ec);
      this.a(dho.L);
      this.a(dho.ph);
      this.a(dho.dO);
      this.b(dho.dT, ol.g);
      this.b(dho.pq, ol.d);
      this.b(dho.fa, ol.d);
      this.m(dho.ac);
      this.m(dho.ga);
      this.a(dho.kK);
      this.a(dho.aY);
      this.a(dho.iC);
      this.a(dho.co);
      this.a(dho.pK);
      this.a(dho.ii);
      this.a(dho.oy);
      this.a(dho.dW);
      this.a(dho.dX);
      this.b(dho.ct, ol.b);
      this.a(dho.aO);
      this.b(dho.bw, ol.v);
      this.a(cvw.cS);
      this.b(dho.ck, ol.f);
      this.b(dho.pd, ol.d);
      this.a(dho.op);
      this.a(dho.aP);
      this.a(dho.qt);
      this.a(dho.qu);
      this.a(dho.qN);
      this.a(dho.su);
      this.a(dho.tf);
      this.a(dho.tg);
      this.a(dho.th);
      this.e(dho.qS);
      this.m(dho.tt);
      this.aD();
      this.a(dho.ra);
      this.a(dho.rb);
      this.a(dho.qW);
      this.a(dho.qX);
      this.a(dho.qY);
      this.a(dho.qZ);
      this.k(dho.qW, dho.rw);
      this.k(dho.qX, dho.ry);
      this.k(dho.qY, dho.rx);
      this.k(dho.qZ, dho.rz);
      this.i(dho.rM);
      this.i(dho.rN);
      this.i(dho.rP);
      this.i(dho.rO);
      this.a(dho.rM, dho.rQ);
      this.a(dho.rN, dho.rR);
      this.a(dho.rP, dho.rT);
      this.a(dho.rO, dho.rS);
      this.k(dho.rU);
      this.k(dho.rV);
      this.k(dho.rX);
      this.k(dho.rW);
      this.b(dho.rU, dho.rY);
      this.b(dho.rV, dho.rZ);
      this.b(dho.rX, dho.sb);
      this.b(dho.rW, dho.sa);
      this.a(dho.sc);
      this.a(dho.sd);
      this.a(dho.se);
      this.a(dho.sf);
      this.k(dho.sc, dho.sg);
      this.k(dho.sd, dho.sh);
      this.k(dho.se, dho.si);
      this.k(dho.sf, dho.sj);
      this.j(dho.gW, dho.ch);
      this.j(dho.gX, dho.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dho.og, dho.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dho.kt);
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
      this.F(dho.ff);
      this.F(dho.fg);
      this.F(dho.qT);
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
      this.E(dho.cO);
      this.d(dho.cO);
      this.E(dho.oa);
      this.g();
      this.E(dho.sE);
      this.l(dho.cp, dho.cq);
      this.l(dho.ea, dho.eb);
      this.a(dho.cA, dho.n, oj::c);
      this.a(dho.nY, dho.p, oj::d);
      this.y(dho.ow);
      this.y(dho.on);
      this.v(dho.aU);
      this.v(dho.hi);
      this.C();
      this.D(dho.oe);
      this.D(dho.of);
      this.e(dho.eX, og.a(dho.eX));
      this.a(dho.dY, ol.d);
      this.a(dho.dZ, ol.d);
      this.a(dho.te);
      this.a(dho.kM, ol.d);
      this.f(dho.j);
      this.f(dho.sH);
      this.f(dho.I);
      this.g(dho.J);
      this.g(dho.M);
      this.f(dho.K);
      this.e(dho.F);
      this.b(dho.to, ol.f);
      this.a(dho.ij, ol.d, ol.e);
      this.a(dho.kx, ol.w, ol.x);
      this.a(dho.hf, ol.w, ol.x);
      this.a(dho.tk, ol.d, ol.e);
      this.a(dho.tl, ol.d, ol.e);
      this.a(dho.tm, ol.d, ol.e);
      this.c(dho.nT, ol.i);
      this.z();
      this.a(dho.pe, oj::A);
      this.a(dho.pf, oj::C);
      this.a(dho.kD, dvi.as, 0, 1, 2, 3);
      this.a(dho.gt, dvi.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dho.fq, dvi.as, 0, 1, 1, 2);
      this.a(dho.gu, dvi.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dho.cB, dvi.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dho.kA, ns.e.b, dvi.aq, 0, 1);
      this.i();
      this.h();
      this.a(og.a("decorated_pot"), dho.iA).b(dho.tp);
      this.a(og.a("banner"), dho.n)
         .a(oi.bH, dho.iJ, dho.iK, dho.iL, dho.iM, dho.iN, dho.iO, dho.iP, dho.iQ, dho.iR, dho.iS, dho.iT, dho.iU, dho.iV, dho.iW, dho.iX, dho.iY)
         .b(dho.iZ, dho.ja, dho.jb, dho.jc, dho.jd, dho.je, dho.jf, dho.jg, dho.jh, dho.ji, dho.jj, dho.jk, dho.jl, dho.jm, dho.jn, dho.jo);
      this.a(og.a("bed"), dho.n)
         .b(dho.aZ, dho.ba, dho.bb, dho.bc, dho.bd, dho.be, dho.bf, dho.bg, dho.bh, dho.bi, dho.bj, dho.bk, dho.bl, dho.bm, dho.bn, dho.bo);
      this.m(dho.aZ, dho.bA);
      this.m(dho.ba, dho.bB);
      this.m(dho.bb, dho.bC);
      this.m(dho.bc, dho.bD);
      this.m(dho.bd, dho.bE);
      this.m(dho.be, dho.bF);
      this.m(dho.bf, dho.bG);
      this.m(dho.bg, dho.bH);
      this.m(dho.bh, dho.bI);
      this.m(dho.bi, dho.bJ);
      this.m(dho.bj, dho.bK);
      this.m(dho.bk, dho.bL);
      this.m(dho.bl, dho.bM);
      this.m(dho.bm, dho.bN);
      this.m(dho.bn, dho.bO);
      this.m(dho.bo, dho.bP);
      this.a(og.a("skull"), dho.dW)
         .a(oi.bI, dho.gM, dho.gK, dho.gI, dho.gE, dho.gG, dho.gQ)
         .a(dho.gO)
         .b(dho.gN, dho.gP, dho.gL, dho.gJ, dho.gF, dho.gH, dho.gR);
      this.G(dho.kP);
      this.G(dho.kQ);
      this.G(dho.kR);
      this.G(dho.kS);
      this.G(dho.kT);
      this.G(dho.kU);
      this.G(dho.kV);
      this.G(dho.kW);
      this.G(dho.kX);
      this.G(dho.kY);
      this.G(dho.kZ);
      this.G(dho.la);
      this.G(dho.lb);
      this.G(dho.lc);
      this.G(dho.ld);
      this.G(dho.le);
      this.G(dho.lf);
      this.b(dho.mX, ol.q);
      this.c(dho.mX);
      this.a(og.a("chest"), dho.n).b(dho.cv, dho.gV);
      this.a(og.a("ender_chest"), dho.co).b(dho.fG);
      this.f(dho.fx, dho.co).a(dho.fx, dho.kF);
      this.a(dho.aM);
      this.a(dho.aN);
      this.a(dho.lw);
      this.a(dho.lx);
      this.a(dho.ly);
      this.a(dho.lz);
      this.a(dho.lA);
      this.a(dho.lB);
      this.a(dho.lC);
      this.a(dho.lD);
      this.a(dho.lE);
      this.a(dho.lF);
      this.a(dho.lG);
      this.a(dho.lH);
      this.a(dho.lI);
      this.a(dho.lJ);
      this.a(dho.lK);
      this.a(dho.lL);
      this.a(ol.a, dho.lM, dho.lN, dho.lO, dho.lP, dho.lQ, dho.lR, dho.lS, dho.lT, dho.lU, dho.lV, dho.lW, dho.lX, dho.lY, dho.lZ, dho.ma, dho.mb);
      this.a(dho.iA);
      this.a(dho.hj);
      this.a(dho.hk);
      this.a(dho.hl);
      this.a(dho.hm);
      this.a(dho.hn);
      this.a(dho.ho);
      this.a(dho.hp);
      this.a(dho.hq);
      this.a(dho.hr);
      this.a(dho.hs);
      this.a(dho.ht);
      this.a(dho.hu);
      this.a(dho.hv);
      this.a(dho.hw);
      this.a(dho.hx);
      this.a(dho.hy);
      this.a(dho.qO);
      this.h(dho.aQ, dho.eY);
      this.h(dho.ei, dho.hz);
      this.h(dho.ej, dho.hA);
      this.h(dho.ek, dho.hB);
      this.h(dho.el, dho.hC);
      this.h(dho.em, dho.hD);
      this.h(dho.en, dho.hE);
      this.h(dho.eo, dho.hF);
      this.h(dho.ep, dho.hG);
      this.h(dho.eq, dho.hH);
      this.h(dho.er, dho.hI);
      this.h(dho.es, dho.hJ);
      this.h(dho.et, dho.hK);
      this.h(dho.eu, dho.hL);
      this.h(dho.ev, dho.hM);
      this.h(dho.ew, dho.hN);
      this.h(dho.ex, dho.hO);
      this.b(ol.o, dho.lg, dho.lh, dho.li, dho.lj, dho.lk, dho.ll, dho.lm, dho.ln, dho.lo, dho.lp, dho.lq, dho.lr, dho.ls, dho.lt, dho.lu, dho.lv);
      this.g(dho.bA, dho.ik);
      this.g(dho.bB, dho.il);
      this.g(dho.bC, dho.im);
      this.g(dho.bD, dho.in);
      this.g(dho.bE, dho.io);
      this.g(dho.bF, dho.ip);
      this.g(dho.bG, dho.iq);
      this.g(dho.bH, dho.ir);
      this.g(dho.bI, dho.is);
      this.g(dho.bJ, dho.it);
      this.g(dho.bK, dho.iu);
      this.g(dho.bL, dho.iv);
      this.g(dho.bM, dho.iw);
      this.g(dho.bN, dho.ix);
      this.g(dho.bO, dho.iy);
      this.g(dho.bP, dho.iz);
      this.a(dho.sI);
      this.a(dho.eL);
      this.a(dho.bu, dho.gb, ns.e.a);
      this.a(dho.bR, dho.gc, ns.e.b);
      this.a(dho.bT, dho.gd, ns.e.b);
      this.a(dho.bU, dho.ge, ns.e.b);
      this.a(dho.bV, dho.gf, ns.e.b);
      this.a(dho.bW, dho.gg, ns.e.b);
      this.a(dho.bX, dho.gh, ns.e.b);
      this.a(dho.bY, dho.gi, ns.e.b);
      this.a(dho.bZ, dho.gj, ns.e.b);
      this.a(dho.ca, dho.gk, ns.e.b);
      this.a(dho.cb, dho.gl, ns.e.b);
      this.a(dho.cc, dho.gm, ns.e.b);
      this.a(dho.ce, dho.gn, ns.e.b);
      this.a(dho.cd, dho.go, ns.e.b);
      this.a(dho.cg, dho.gp, ns.e.b);
      this.a(dho.cf, dho.gq, ns.e.b);
      this.a(dho.bv, dho.gr, ns.e.b);
      this.a(dho.bS, dho.fS, ns.e.b);
      this.H();
      this.u(dho.eT);
      this.u(dho.eU);
      this.u(dho.eV);
      this.a(dho.bt, ns.e.a);
      this.b(dho.dS, ns.e.a);
      this.a(cvw.dJ);
      this.b(dho.mc, dho.md, ns.e.b);
      this.a(cvw.dK);
      this.c(dho.md);
      this.b(dho.sG, ns.e.b);
      this.c(dho.sG);
      this.c(dho.sw);
      this.b(dho.oz, dho.oA, ns.e.b);
      this.b(dho.oB, dho.oC, ns.e.b);
      this.a(dho.oz, "_plant");
      this.c(dho.oA);
      this.a(dho.oB, "_plant");
      this.c(dho.oC);
      this.a(dho.mY, ns.e.a, oj.c(oj.a(dho.mZ, "_stage0")));
      this.m();
      this.a(dho.bs, ns.e.b);
      this.c(dho.iE, ns.e.b);
      this.c(dho.iF, ns.e.b);
      this.c(dho.iG, ns.e.b);
      this.c(dho.iH, ns.e.a);
      this.c(dho.iI, ns.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dho.mw, dho.mr, dho.mm, dho.mh, dho.mG, dho.mB, dho.mQ, dho.mL);
      this.a(dho.mx, dho.ms, dho.mn, dho.mi, dho.mH, dho.mC, dho.mR, dho.mM);
      this.a(dho.my, dho.mt, dho.mo, dho.mj, dho.mI, dho.mD, dho.mS, dho.mN);
      this.a(dho.mz, dho.mu, dho.mp, dho.mk, dho.mJ, dho.mE, dho.mT, dho.mO);
      this.a(dho.mA, dho.mv, dho.mq, dho.ml, dho.mK, dho.mF, dho.mU, dho.mP);
      this.e(dho.fe, dho.fc);
      this.e(dho.fd, dho.fb);
      this.l(dho.ab).c(dho.ab).a(dho.av);
      this.l(dho.am).c(dho.am).a(dho.aD);
      this.a(dho.am, dho.dj, dho.ds);
      this.b(dho.aL, ol.s);
      this.l(dho.Y).c(dho.Y).a(dho.as);
      this.l(dho.ai).c(dho.ai).a(dho.aA);
      this.a(dho.ai, dho.dd, dho.do);
      this.a(dho.B, dho.fX, ns.e.b);
      this.b(dho.aI, ol.s);
      this.l(dho.Z).d(dho.Z).a(dho.at);
      this.l(dho.aj).d(dho.aj).a(dho.aB);
      this.a(dho.aj, dho.de, dho.dp);
      this.a(dho.C, dho.fY, ns.e.b);
      this.b(dho.aJ, ol.s);
      this.l(dho.W).c(dho.W).a(dho.aq);
      this.l(dho.ag).c(dho.ag).a(dho.ay);
      this.a(dho.ag, dho.dc, dho.dn);
      this.a(dho.z, dho.fV, ns.e.b);
      this.b(dho.aG, ol.s);
      this.l(dho.U).c(dho.U).a(dho.ao);
      this.l(dho.al).c(dho.al).a(dho.aw);
      this.a(dho.al, dho.da, dho.dl);
      this.a(dho.x, dho.fT, ns.e.b);
      this.b(dho.aE, ol.s);
      this.l(dho.V).c(dho.V).a(dho.ap);
      this.l(dho.af).c(dho.af).a(dho.ax);
      this.a(dho.af, dho.db, dho.dm);
      this.a(dho.y, dho.fU, ns.e.b);
      this.b(dho.aF, ol.s);
      this.l(dho.aa).c(dho.aa).a(dho.au);
      this.l(dho.ak).c(dho.ak).a(dho.aC);
      this.a(dho.ak, dho.dg, dho.dr);
      this.a(dho.D, dho.fZ, ns.e.b);
      this.b(dho.aK, ol.s);
      this.l(dho.X).c(dho.X).a(dho.ar);
      this.l(dho.ah).c(dho.ah).a(dho.az);
      this.a(dho.ah, dho.df, dho.dq);
      this.a(dho.A, dho.fW, ns.e.b);
      this.b(dho.aH, ol.s);
      this.l(dho.os).b(dho.os).a(dho.ou);
      this.l(dho.ot).b(dho.ot).a(dho.ov);
      this.a(dho.ot, dho.dh, dho.dt);
      this.a(dho.ox, dho.pm, ns.e.b);
      this.n(dho.oD, dho.po);
      this.l(dho.oj).b(dho.oj).a(dho.ol);
      this.l(dho.ok).b(dho.ok).a(dho.om);
      this.a(dho.ok, dho.di, dho.du);
      this.a(dho.oo, dho.pn, ns.e.b);
      this.n(dho.oq, dho.pp);
      this.l(dho.ae).d(dho.ae);
      this.l(dho.an).d(dho.an);
      this.a(dho.v, dho.dk, dho.dv);
      this.b(dho.or, ns.e.b);
      this.a(cvw.dG);
      this.i(dho.dy);
      this.k(dho.hY);
      this.u();
      this.n(dho.cP);
      this.o(dho.bp);
      this.o(dho.bq);
      this.o(dho.hh);
      this.t();
      this.q(dho.fN);
      this.q(dho.kG);
      this.q(dho.kH);
      this.r(dho.gS);
      this.r(dho.gT);
      this.r(dho.gU);
      this.o();
      this.p();
      this.d(dho.cD, ol.h);
      this.d(dho.nW, ol.h);
      this.d(dho.nV, ol.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dho.eK, dho.eS);
      this.k(dho.m, dho.eO);
      this.k(dho.eJ, dho.eR);
      this.k(dho.eI, dho.eQ);
      this.az();
      this.k(dho.eH, dho.eP);
      this.aA();
      cxb.c().forEach($$0 -> this.a($$0, og.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dho.hX);
      nz.a<Integer> $$0 = nz.a(dvi.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ale $$3 = oj.a(cvw.hC, $$2);
         $$0.a($$1, ob.a().a(oc.c, oi.aa.a(dho.hX, $$2, oj.h($$3), this.c)));
         oi.bz.a(og.a(cvw.hC, $$2), oj.k($$3), this.c);
      }

      this.b.accept(ny.a(dho.hX).a($$0));
   }

   private void o(dhm $$0, dhm $$1) {
      this.a($$0.q());
      oj $$2 = oj.b(oj.G($$0));
      oj $$3 = oj.b(oj.a($$0, "_lit"));
      ale $$4 = oi.bJ.a($$0, "_one_candle", $$2, this.c);
      ale $$5 = oi.bK.a($$0, "_two_candles", $$2, this.c);
      ale $$6 = oi.bL.a($$0, "_three_candles", $$2, this.c);
      ale $$7 = oi.bM.a($$0, "_four_candles", $$2, this.c);
      ale $$8 = oi.bJ.a($$0, "_one_candle_lit", $$3, this.c);
      ale $$9 = oi.bK.a($$0, "_two_candles_lit", $$3, this.c);
      ale $$10 = oi.bL.a($$0, "_three_candles_lit", $$3, this.c);
      ale $$11 = oi.bM.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            ny.a($$0)
               .a(
                  nz.a(dvi.az, dvi.r)
                     .a(1, false, ob.a().a(oc.c, $$4))
                     .a(2, false, ob.a().a(oc.c, $$5))
                     .a(3, false, ob.a().a(oc.c, $$6))
                     .a(4, false, ob.a().a(oc.c, $$7))
                     .a(1, true, ob.a().a(oc.c, $$8))
                     .a(2, true, ob.a().a(oc.c, $$9))
                     .a(3, true, ob.a().a(oc.c, $$10))
                     .a(4, true, ob.a().a(oc.c, $$11))
               )
         );
      ale $$12 = oi.bN.a($$1, oj.a($$0, false), this.c);
      ale $$13 = oi.bN.a($$1, "_lit", oj.a($$0, true), this.c);
      this.b.accept(ny.a($$1).a(a(dvi.r, $$13, $$12)));
   }

   class a {
      private final ale b;

      public a(final ale $$0, final dhm $$1) {
         this.b = oi.aa.a($$0, oj.u($$1), ns.this.c);
      }

      public ns.a a(dhm... $$0) {
         for (dhm $$1 : $$0) {
            ns.this.b.accept(ns.c($$1, this.b));
         }

         return this;
      }

      public ns.a b(dhm... $$0) {
         for (dhm $$1 : $$0) {
            ns.this.c($$1);
         }

         return this.a($$0);
      }

      public ns.a a(oh $$0, dhm... $$1) {
         for (dhm $$2 : $$1) {
            $$0.a(og.a($$2.q()), oj.u($$2), ns.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final oj b;
      private final Map<oh, ale> c = Maps.newHashMap();
      @Nullable
      private lz d;
      @Nullable
      private ale e;
      private final Set<dhm> f = new HashSet<>();

      public b(final oj $$0) {
         this.b = $$0;
      }

      public ns.b a(dhm $$0, oh $$1) {
         this.e = $$1.a($$0, this.b, ns.this.c);
         if (ns.this.f.containsKey($$0)) {
            ns.this.b.accept(ns.this.f.get($$0).create($$0, this.e, this.b, ns.this.c));
         } else {
            ns.this.b.accept(ns.c($$0, this.e));
         }

         return this;
      }

      public ns.b a(dhm $$0, dhm $$1) {
         ale $$2 = og.a($$0);
         ns.this.b.accept(ns.c($$1, $$2));
         ns.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public ns.b a(dhm $$0) {
         ale $$1 = oi.s.a($$0, this.b, ns.this.c);
         ale $$2 = oi.t.a($$0, this.b, ns.this.c);
         ns.this.b.accept(ns.b($$0, $$1, $$2));
         ale $$3 = oi.u.a($$0, this.b, ns.this.c);
         ns.this.a($$0, $$3);
         return this;
      }

      public ns.b b(dhm $$0) {
         ale $$1 = oi.M.a($$0, this.b, ns.this.c);
         ale $$2 = oi.N.a($$0, this.b, ns.this.c);
         ale $$3 = oi.O.a($$0, this.b, ns.this.c);
         ns.this.b.accept(ns.a($$0, $$1, $$2, $$3));
         ale $$4 = oi.P.a($$0, this.b, ns.this.c);
         ns.this.a($$0, $$4);
         return this;
      }

      public ns.b c(dhm $$0) {
         oj $$1 = oj.p($$0);
         ale $$2 = oi.D.a($$0, $$1, ns.this.c);
         ale $$3 = oi.E.a($$0, $$1, ns.this.c);
         ale $$4 = oi.F.a($$0, $$1, ns.this.c);
         ale $$5 = oi.G.a($$0, $$1, ns.this.c);
         ale $$6 = oi.H.a($$0, $$1, ns.this.c);
         ns.this.b.accept(ns.a($$0, $$2, $$3, $$4, $$5, $$6));
         ale $$7 = oi.I.a($$0, $$1, ns.this.c);
         ns.this.a($$0, $$7);
         return this;
      }

      public ns.b d(dhm $$0) {
         ale $$1 = oi.J.a($$0, this.b, ns.this.c);
         ale $$2 = oi.K.a($$0, this.b, ns.this.c);
         ns.this.b.accept(ns.c($$0, $$1, $$2));
         ale $$3 = oi.L.a($$0, this.b, ns.this.c);
         ns.this.a($$0, $$3);
         return this;
      }

      public ns.b e(dhm $$0) {
         oj $$1 = oj.p($$0);
         ale $$2 = oi.R.a($$0, $$1, ns.this.c);
         ale $$3 = oi.Q.a($$0, $$1, ns.this.c);
         ale $$4 = oi.T.a($$0, $$1, ns.this.c);
         ale $$5 = oi.S.a($$0, $$1, ns.this.c);
         ns.this.b.accept(ns.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ns.b f(dhm $$0) {
         ale $$1 = oi.V.a($$0, this.b, ns.this.c);
         ale $$2 = oi.U.a($$0, this.b, ns.this.c);
         ale $$3 = oi.X.a($$0, this.b, ns.this.c);
         ale $$4 = oi.W.a($$0, this.b, ns.this.c);
         ns.this.b.accept(ns.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ns.b g(dhm $$0) {
         ale $$1 = oi.Y.a($$0, this.b, ns.this.c);
         ale $$2 = oi.Z.a($$0, this.b, ns.this.c);
         ns.this.b.accept(ns.e($$0, $$1, $$2));
         return this;
      }

      public ns.b h(dhm $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dhm $$1 = this.d.b().get(lz.b.r);
            ale $$2 = oi.aa.a($$0, this.b, ns.this.c);
            ns.this.b.accept(ns.c($$0, $$2));
            ns.this.b.accept(ns.c($$1, $$2));
            ns.this.a($$0.q());
            ns.this.c($$1);
            return this;
         }
      }

      public ns.b i(dhm $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ale $$1 = this.a(oi.ab, $$0);
            ale $$2 = this.a(oi.ac, $$0);
            ns.this.b.accept(ns.e($$0, $$1, $$2, this.e));
            ns.this.a($$0, $$1);
            return this;
         }
      }

      public ns.b j(dhm $$0) {
         ale $$1 = this.a(oi.af, $$0);
         ale $$2 = this.a(oi.ae, $$0);
         ale $$3 = this.a(oi.ag, $$0);
         ns.this.b.accept(ns.b($$0, $$1, $$2, $$3));
         ns.this.a($$0, $$2);
         return this;
      }

      private ns.b k(dhm $$0) {
         ol $$1 = ns.this.g.getOrDefault($$0, ol.a.get($$0));
         ale $$2 = $$1.a($$0, ns.this.c);
         ns.this.b.accept(ns.c($$0, $$2));
         return this;
      }

      private ns.b l(dhm $$0) {
         ns.this.i($$0);
         return this;
      }

      private void m(dhm $$0) {
         if (ns.this.e.contains($$0)) {
            ns.this.k($$0);
         } else {
            ns.this.j($$0);
         }
      }

      private ale a(oh $$0, dhm $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ns.this.c));
      }

      public ns.b a(lz $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<ns.b, dhm> $$2 = ns.h.get($$0x);
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
      nv create(dhm var1, ale var2, oj var3, BiConsumer<ale, Supplier<JsonElement>> var4);
   }

   static record d(oh a, String b) {
   }

   static enum e {
      a,
      b;

      public oh a() {
         return this == a ? oi.ap : oi.ao;
      }

      public oh b() {
         return this == a ? oi.ar : oi.aq;
      }
   }

   class f {
      private final oj b;

      public f(final oj $$0) {
         this.b = $$0;
      }

      public ns.f a(dhm $$0) {
         oj $$1 = this.b.c(ok.d, this.b.a(ok.i));
         ale $$2 = oi.j.a($$0, $$1, ns.this.c);
         ns.this.b.accept(ns.d($$0, $$2));
         return this;
      }

      public ns.f b(dhm $$0) {
         ale $$1 = oi.j.a($$0, this.b, ns.this.c);
         ns.this.b.accept(ns.d($$0, $$1));
         return this;
      }

      public ns.f c(dhm $$0) {
         ale $$1 = oi.j.a($$0, this.b, ns.this.c);
         ale $$2 = oi.k.a($$0, this.b, ns.this.c);
         ns.this.b.accept(ns.d($$0, $$1, $$2));
         return this;
      }

      public ns.f d(dhm $$0) {
         ns.this.b.accept(ns.a($$0, this.b, ns.this.c));
         return this;
      }
   }
}
