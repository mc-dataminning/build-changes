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

public class nr {
   final Consumer<nu> b;
   final BiConsumer<alc, Supplier<JsonElement>> c;
   private final Consumer<cvk> d;
   final List<dhj> e = ImmutableList.of(dhl.ey, dhl.eE, dhl.hY);
   final Map<dhj, nr.c> f = ImmutableMap.builder().put(dhl.b, nr::a).put(dhl.sJ, nr::c).put(dhl.eM, nr::b).build();
   final Map<dhj, ok> g = ImmutableMap.builder()
      .put(dhl.aV, ok.y.get(dhl.aV))
      .put(dhl.jp, ok.y.get(dhl.jp))
      .put(dhl.jS, ok.a(oi.a(dhl.aV, "_top")))
      .put(dhl.jU, ok.a(oi.a(dhl.jp, "_top")))
      .put(dhl.aX, ok.d.get(dhl.aV).a($$0x -> $$0x.a(oj.i, oi.G(dhl.aX))))
      .put(dhl.jr, ok.d.get(dhl.jp).a($$0x -> $$0x.a(oj.i, oi.G(dhl.jr))))
      .put(dhl.hd, ok.d.get(dhl.hd))
      .put(dhl.jT, ok.a(oi.a(dhl.hd, "_bottom")))
      .put(dhl.pr, ok.z.get(dhl.pr))
      .put(dhl.sJ, ok.z.get(dhl.sJ))
      .put(dhl.he, ok.d.get(dhl.he).a($$0x -> $$0x.a(oj.i, oi.G(dhl.he))))
      .put(dhl.aW, ok.d.get(dhl.aW).a($$0x -> {
         $$0x.a(oj.d, oi.a(dhl.aV, "_top"));
         $$0x.a(oj.i, oi.G(dhl.aW));
      }))
      .put(dhl.jq, ok.d.get(dhl.jq).a($$0x -> {
         $$0x.a(oj.d, oi.a(dhl.jp, "_top"));
         $$0x.a(oj.i, oi.G(dhl.jq));
      }))
      .put(dhl.qM, ok.z.get(dhl.qM))
      .put(dhl.qH, ok.z.get(dhl.qH))
      .build();
   static final Map<ly.b, BiConsumer<nr.b, dhj>> h = ImmutableMap.builder()
      .put(ly.b.a, nr.b::a)
      .put(ly.b.e, nr.b::l)
      .put(ly.b.b, nr.b::k)
      .put(ly.b.c, nr.b::k)
      .put(ly.b.f, nr.b::c)
      .put(ly.b.g, nr.b::d)
      .put(ly.b.h, nr.b::e)
      .put(ly.b.i, nr.b::f)
      .put(ly.b.k, nr.b::h)
      .put(ly.b.l, nr.b::i)
      .put(ly.b.m, nr.b::j)
      .put(ly.b.n, nr.b::g)
      .put(ly.b.p, nr.b::m)
      .put(ly.b.q, nr.b::b)
      .build();
   public static final List<Pair<dvf, Function<alc, oa>>> a = List.of(
      Pair.of(dve.L, (Function<alc, oa>)$$0 -> oa.a().a(ob.c, $$0)),
      Pair.of(dve.M, (Function<alc, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true)),
      Pair.of(dve.N, (Function<alc, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true)),
      Pair.of(dve.O, (Function<alc, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true)),
      Pair.of(dve.J, (Function<alc, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true)),
      Pair.of(dve.K, (Function<alc, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
   );
   private static final Map<nr.d, alc> i = new HashMap<>();

   private static nu a(dhj $$0, alc $$1, oi $$2, BiConsumer<alc, Supplier<JsonElement>> $$3) {
      alc $$4 = oh.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nu b(dhj $$0, alc $$1, oi $$2, BiConsumer<alc, Supplier<JsonElement>> $$3) {
      alc $$4 = oh.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nu c(dhj $$0, alc $$1, oi $$2, BiConsumer<alc, Supplier<JsonElement>> $$3) {
      alc $$4 = oh.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nr(Consumer<nu> $$0, BiConsumer<alc, Supplier<JsonElement>> $$1, Consumer<cvk> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dhj $$0) {
      this.d.accept($$0.q());
   }

   void a(dhj $$0, alc $$1) {
      this.c.accept(of.a($$0.q()), new oe($$1));
   }

   private void a(cvk $$0, alc $$1) {
      this.c.accept(of.a($$0), new oe($$1));
   }

   void a(cvk $$0) {
      oh.bz.a(of.a($$0), oi.b($$0), this.c);
   }

   private void d(dhj $$0) {
      cvk $$1 = $$0.q();
      if ($$1 != cvt.a) {
         oh.bz.a(of.a($$1), oi.F($$0), this.c);
      }
   }

   private void a(dhj $$0, String $$1) {
      cvk $$2 = $$0.q();
      oh.bz.a(of.a($$2), oi.k(oi.a($$0, $$1)), this.c);
   }

   private static ny b() {
      return ny.a(dve.R).a(jj.f, oa.a().a(ob.b, ob.a.b)).a(jj.d, oa.a().a(ob.b, ob.a.c)).a(jj.e, oa.a().a(ob.b, ob.a.d)).a(jj.c, oa.a());
   }

   private static ny c() {
      return ny.a(dve.R).a(jj.d, oa.a()).a(jj.e, oa.a().a(ob.b, ob.a.b)).a(jj.c, oa.a().a(ob.b, ob.a.c)).a(jj.f, oa.a().a(ob.b, ob.a.d));
   }

   private static ny d() {
      return ny.a(dve.R).a(jj.f, oa.a()).a(jj.d, oa.a().a(ob.b, ob.a.b)).a(jj.e, oa.a().a(ob.b, ob.a.c)).a(jj.c, oa.a().a(ob.b, ob.a.d));
   }

   private static ny e() {
      return ny.a(dve.P)
         .a(jj.a, oa.a().a(ob.a, ob.a.b))
         .a(jj.b, oa.a().a(ob.a, ob.a.d))
         .a(jj.c, oa.a())
         .a(jj.d, oa.a().a(ob.b, ob.a.c))
         .a(jj.e, oa.a().a(ob.b, ob.a.d))
         .a(jj.f, oa.a().a(ob.b, ob.a.b));
   }

   private static nx b(dhj $$0, alc $$1) {
      return nx.a($$0, a($$1));
   }

   private static oa[] a(alc $$0) {
      return new oa[]{oa.a().a(ob.c, $$0), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d)};
   }

   private static nx a(dhj $$0, alc $$1, alc $$2) {
      return nx.a($$0, oa.a().a(ob.c, $$1), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c));
   }

   private static ny a(dvf $$0, alc $$1, alc $$2) {
      return ny.a($$0).a(true, oa.a().a(ob.c, $$1)).a(false, oa.a().a(ob.c, $$2));
   }

   private void e(dhj $$0) {
      alc $$1 = ok.a.create($$0, this.c);
      alc $$2 = ok.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dhj $$0) {
      alc $$1 = ok.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dhj $$0) {
      this.b.accept(nx.a($$0).a(ny.a(dve.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         alc $$3 = oi.a($$0, $$2);
         return oa.a().a(ob.c, oh.c.a($$0, $$2, new oi().a(oj.a, $$3), this.c));
      })));
      this.a($$0, oi.a($$0, "_0"));
   }

   static nu b(dhj $$0, alc $$1, alc $$2) {
      return nx.a($$0)
         .a(ny.a(dve.w).a(false, oa.a().a(ob.c, $$1)).a(true, oa.a().a(ob.c, $$2)))
         .a(
            ny.a(dve.U, dve.R)
               .a(duz.a, jj.f, oa.a().a(ob.b, ob.a.b))
               .a(duz.a, jj.e, oa.a().a(ob.b, ob.a.d))
               .a(duz.a, jj.d, oa.a().a(ob.b, ob.a.c))
               .a(duz.a, jj.c, oa.a())
               .a(duz.b, jj.f, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.b).a(ob.d, true))
               .a(duz.b, jj.e, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.b).a(ob.d, true))
               .a(duz.b, jj.d, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.b).a(ob.d, true))
               .a(duz.b, jj.c, oa.a().a(ob.a, ob.a.b).a(ob.d, true))
               .a(duz.c, jj.f, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.c))
               .a(duz.c, jj.e, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.c))
               .a(duz.c, jj.d, oa.a().a(ob.a, ob.a.c))
               .a(duz.c, jj.c, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.c))
         );
   }

   private static ny.d<jj, dvk, dvj, Boolean> a(ny.d<jj, dvk, dvj, Boolean> $$0, dvk $$1, alc $$2, alc $$3, alc $$4, alc $$5) {
      return $$0.a(jj.f, $$1, dvj.a, false, oa.a().a(ob.c, $$2))
         .a(jj.d, $$1, dvj.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
         .a(jj.e, $$1, dvj.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
         .a(jj.c, $$1, dvj.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
         .a(jj.f, $$1, dvj.b, false, oa.a().a(ob.c, $$4))
         .a(jj.d, $$1, dvj.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
         .a(jj.e, $$1, dvj.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
         .a(jj.c, $$1, dvj.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         .a(jj.f, $$1, dvj.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
         .a(jj.d, $$1, dvj.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
         .a(jj.e, $$1, dvj.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         .a(jj.c, $$1, dvj.a, true, oa.a().a(ob.c, $$3))
         .a(jj.f, $$1, dvj.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.d))
         .a(jj.d, $$1, dvj.b, true, oa.a().a(ob.c, $$5))
         .a(jj.e, $$1, dvj.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         .a(jj.c, $$1, dvj.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.c));
   }

   private static nu a(dhj $$0, alc $$1, alc $$2, alc $$3, alc $$4, alc $$5, alc $$6, alc $$7, alc $$8) {
      return nx.a($$0).a(a(a(ny.a(dve.R, dve.ae, dve.be, dve.u), dvk.b, $$1, $$2, $$3, $$4), dvk.a, $$5, $$6, $$7, $$8));
   }

   static nu a(dhj $$0, alc $$1, alc $$2, alc $$3, alc $$4, alc $$5) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dve.L, true), oa.a().a(ob.c, $$2).a(ob.d, false))
         .a(nv.a().a(dve.M, true), oa.a().a(ob.c, $$3).a(ob.d, false))
         .a(nv.a().a(dve.N, true), oa.a().a(ob.c, $$4).a(ob.d, false))
         .a(nv.a().a(dve.O, true), oa.a().a(ob.c, $$5).a(ob.d, false));
   }

   static nu c(dhj $$0, alc $$1, alc $$2) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dve.L, true), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dve.M, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dve.N, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dve.O, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dhj $$0, alc $$1, alc $$2, alc $$3) {
      return nw.a($$0)
         .a(nv.a().a(dve.J, true), oa.a().a(ob.c, $$1))
         .a(nv.a().a(dve.X, dwa.b), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dve.W, dwa.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dve.Y, dwa.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dve.Z, dwa.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
         .a(nv.a().a(dve.X, dwa.c), oa.a().a(ob.c, $$3).a(ob.d, true))
         .a(nv.a().a(dve.W, dwa.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dve.Y, dwa.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dve.Z, dwa.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dhj $$0, alc $$1, alc $$2, alc $$3, alc $$4, boolean $$5) {
      return nx.a($$0, oa.a().a(ob.d, $$5))
         .a(c())
         .a(
            ny.a(dve.q, dve.u)
               .a(false, false, oa.a().a(ob.c, $$2))
               .a(true, false, oa.a().a(ob.c, $$4))
               .a(false, true, oa.a().a(ob.c, $$1))
               .a(true, true, oa.a().a(ob.c, $$3))
         );
   }

   static nu b(dhj $$0, alc $$1, alc $$2, alc $$3) {
      return nx.a($$0)
         .a(
            ny.a(dve.R, dve.af, dve.bi)
               .a(jj.f, dvn.b, dvx.a, oa.a().a(ob.c, $$2))
               .a(jj.e, dvn.b, dvx.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, dvn.b, dvx.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, dvn.b, dvx.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, dvn.b, dvx.e, oa.a().a(ob.c, $$3))
               .a(jj.e, dvn.b, dvx.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, dvn.b, dvx.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, dvn.b, dvx.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, dvn.b, dvx.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.e, dvn.b, dvx.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.d, dvn.b, dvx.d, oa.a().a(ob.c, $$3))
               .a(jj.c, dvn.b, dvx.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.f, dvn.b, dvx.c, oa.a().a(ob.c, $$1))
               .a(jj.e, dvn.b, dvx.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, dvn.b, dvx.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, dvn.b, dvx.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, dvn.b, dvx.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.e, dvn.b, dvx.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.d, dvn.b, dvx.b, oa.a().a(ob.c, $$1))
               .a(jj.c, dvn.b, dvx.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.f, dvn.a, dvx.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.e, dvn.a, dvx.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, dvn.a, dvx.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, dvn.a, dvx.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, dvn.a, dvx.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.e, dvn.a, dvx.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.d, dvn.a, dvx.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.c, dvn.a, dvx.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.f, dvn.a, dvx.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.e, dvn.a, dvx.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, dvn.a, dvx.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, dvn.a, dvx.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, dvn.a, dvx.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.e, dvn.a, dvx.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.d, dvn.a, dvx.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.c, dvn.a, dvx.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.f, dvn.a, dvx.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.e, dvn.a, dvx.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, dvn.a, dvx.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, dvn.a, dvx.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
         );
   }

   private static nu c(dhj $$0, alc $$1, alc $$2, alc $$3) {
      return nx.a($$0)
         .a(
            ny.a(dve.R, dve.af, dve.u)
               .a(jj.c, dvn.b, false, oa.a().a(ob.c, $$2))
               .a(jj.d, dvn.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(jj.f, dvn.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(jj.e, dvn.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(jj.c, dvn.a, false, oa.a().a(ob.c, $$1))
               .a(jj.d, dvn.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(jj.f, dvn.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(jj.e, dvn.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(jj.c, dvn.b, true, oa.a().a(ob.c, $$3))
               .a(jj.d, dvn.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(jj.f, dvn.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(jj.e, dvn.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(jj.c, dvn.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c))
               .a(jj.d, dvn.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.a))
               .a(jj.f, dvn.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               .a(jj.e, dvn.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b))
         );
   }

   private static nu d(dhj $$0, alc $$1, alc $$2, alc $$3) {
      return nx.a($$0)
         .a(
            ny.a(dve.R, dve.af, dve.u)
               .a(jj.c, dvn.b, false, oa.a().a(ob.c, $$2))
               .a(jj.d, dvn.b, false, oa.a().a(ob.c, $$2))
               .a(jj.f, dvn.b, false, oa.a().a(ob.c, $$2))
               .a(jj.e, dvn.b, false, oa.a().a(ob.c, $$2))
               .a(jj.c, dvn.a, false, oa.a().a(ob.c, $$1))
               .a(jj.d, dvn.a, false, oa.a().a(ob.c, $$1))
               .a(jj.f, dvn.a, false, oa.a().a(ob.c, $$1))
               .a(jj.e, dvn.a, false, oa.a().a(ob.c, $$1))
               .a(jj.c, dvn.b, true, oa.a().a(ob.c, $$3))
               .a(jj.d, dvn.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(jj.f, dvn.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(jj.e, dvn.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(jj.c, dvn.a, true, oa.a().a(ob.c, $$3))
               .a(jj.d, dvn.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(jj.f, dvn.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(jj.e, dvn.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         );
   }

   static nx c(dhj $$0, alc $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1));
   }

   private static ny f() {
      return ny.a(dve.I).a(jj.a.b, oa.a()).a(jj.a.c, oa.a().a(ob.a, ob.a.b)).a(jj.a.a, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   static nu a(dhj $$0, oi $$1, BiConsumer<alc, Supplier<JsonElement>> $$2) {
      alc $$3 = oh.g.a($$0, $$1, $$2);
      alc $$4 = oh.h.a($$0, $$1, $$2);
      alc $$5 = oh.i.a($$0, $$1, $$2);
      alc $$6 = oh.j.a($$0, $$1, $$2);
      return nx.a($$0, oa.a().a(ob.c, $$6)).a(ny.a(dve.I).a(jj.a.a, oa.a().a(ob.c, $$3)).a(jj.a.b, oa.a().a(ob.c, $$4)).a(jj.a.c, oa.a().a(ob.c, $$5)));
   }

   static nu d(dhj $$0, alc $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1)).a(f());
   }

   private void e(dhj $$0, alc $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dhj $$0, ok.a $$1) {
      alc $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dhj $$0, ok.a $$1) {
      alc $$2 = $$1.create($$0, this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   static nu d(dhj $$0, alc $$1, alc $$2) {
      return nx.a($$0)
         .a(
            ny.a(dve.I)
               .a(jj.a.b, oa.a().a(ob.c, $$1))
               .a(jj.a.c, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b))
               .a(jj.a.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.b, ob.a.b))
         );
   }

   private void a(dhj $$0, ok.a $$1, ok.a $$2) {
      alc $$3 = $$1.create($$0, this.c);
      alc $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private alc a(dhj $$0, String $$1, og $$2, Function<alc, oi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oi.a($$0, $$1)), this.c);
   }

   static nu e(dhj $$0, alc $$1, alc $$2) {
      return nx.a($$0).a(a(dve.w, $$2, $$1));
   }

   static nu e(dhj $$0, alc $$1, alc $$2, alc $$3) {
      return nx.a($$0).a(ny.a(dve.bh).a(dvw.b, oa.a().a(ob.c, $$1)).a(dvw.a, oa.a().a(ob.c, $$2)).a(dvw.c, oa.a().a(ob.c, $$3)));
   }

   public void a(dhj $$0) {
      this.b($$0, ok.a);
   }

   public void b(dhj $$0, ok.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dhj $$0, oi $$1, og $$2) {
      alc $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nr.b h(dhj $$0) {
      ok $$1 = this.g.getOrDefault($$0, ok.a.get($$0));
      return new nr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dhj $$0, dhj $$1, dhj $$2) {
      oi $$3 = oi.u($$0);
      alc $$4 = oh.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.q());
      this.c($$2);
   }

   void i(dhj $$0) {
      oi $$1 = oi.t($$0);
      alc $$2 = oh.v.a($$0, $$1, this.c);
      alc $$3 = oh.w.a($$0, $$1, this.c);
      alc $$4 = oh.x.a($$0, $$1, this.c);
      alc $$5 = oh.y.a($$0, $$1, this.c);
      alc $$6 = oh.z.a($$0, $$1, this.c);
      alc $$7 = oh.A.a($$0, $$1, this.c);
      alc $$8 = oh.B.a($$0, $$1, this.c);
      alc $$9 = oh.C.a($$0, $$1, this.c);
      this.a($$0.q());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dhj $$0, dhj $$1) {
      alc $$2 = oh.v.a($$0);
      alc $$3 = oh.w.a($$0);
      alc $$4 = oh.x.a($$0);
      alc $$5 = oh.y.a($$0);
      alc $$6 = oh.z.a($$0);
      alc $$7 = oh.A.a($$0);
      alc $$8 = oh.B.a($$0);
      alc $$9 = oh.C.a($$0);
      this.a($$1, of.a($$0.q()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dhj $$0) {
      oi $$1 = oi.b($$0);
      alc $$2 = oh.ak.a($$0, $$1, this.c);
      alc $$3 = oh.al.a($$0, $$1, this.c);
      alc $$4 = oh.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dhj $$0) {
      oi $$1 = oi.b($$0);
      alc $$2 = oh.ah.a($$0, $$1, this.c);
      alc $$3 = oh.ai.a($$0, $$1, this.c);
      alc $$4 = oh.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dhj $$0, dhj $$1) {
      alc $$2 = oh.ah.a($$0);
      alc $$3 = oh.ai.a($$0);
      alc $$4 = oh.aj.a($$0);
      this.a($$1, of.a($$0.q()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dhl.sD);
      alc $$0 = of.a(dhl.sD);
      alc $$1 = of.a(dhl.sD, "_partial_tilt");
      alc $$2 = of.a(dhl.sD, "_full_tilt");
      this.b
         .accept(
            nx.a(dhl.sD)
               .a(b())
               .a(ny.a(dve.bl).a(dvz.a, oa.a().a(ob.c, $$0)).a(dvz.b, oa.a().a(ob.c, $$0)).a(dvz.c, oa.a().a(ob.c, $$1)).a(dvz.d, oa.a().a(ob.c, $$2)))
         );
   }

   private nr.f l(dhj $$0) {
      return new nr.f(oi.n($$0));
   }

   private void m(dhj $$0) {
      this.c($$0, $$0);
   }

   private void c(dhj $$0, dhj $$1) {
      this.b.accept(c($$0, of.a($$1)));
   }

   private void a(dhj $$0, nr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dhj $$0, nr.e $$1, oi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dhj $$0, nr.e $$1) {
      oi $$2 = oi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dhj $$0, nr.e $$1, oi $$2) {
      alc $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dhj $$0, nr.e $$1, dvr<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         ny $$4 = ny.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            oi $$5 = oi.c(oi.a($$0, $$4x));
            alc $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return oa.a().a(ob.c, $$6);
         });
         this.a($$0.q());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void a(dhj $$0, dhj $$1, nr.e $$2) {
      this.a($$0, $$2);
      oi $$3 = oi.d($$0);
      alc $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dhj $$0, dhj $$1) {
      ok $$2 = ok.p.get($$0);
      alc $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alc $$4 = oh.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dhj $$0, dhj $$1) {
      this.a($$0.q());
      oi $$2 = oi.h($$0);
      oi $$3 = oi.a($$0, $$1);
      alc $$4 = oh.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nx.a($$1, oa.a().a(ob.c, $$4))
               .a(ny.a(dve.R).a(jj.e, oa.a()).a(jj.d, oa.a().a(ob.b, ob.a.d)).a(jj.c, oa.a().a(ob.b, ob.a.b)).a(jj.f, oa.a().a(ob.b, ob.a.c)))
         );
      this.b.accept(nx.a($$0).a(ny.a(dve.av).a($$2x -> oa.a().a(ob.c, oh.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dhj $$0 = dhl.kC;
      this.a($$0.q());
      alc $$1 = of.a($$0, "_top");
      alc $$2 = of.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dhj $$0 = dhl.kB;
      this.a($$0.q());
      ny $$1 = ny.a(dmy.d, dve.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oa.a().a(ob.c, of.a($$0, "_top_stage_" + $$1x));
            case b -> oa.a().a(ob.c, of.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nx.a($$0).a($$1));
   }

   private void a(dhj $$0, dhj $$1, dhj $$2, dhj $$3, dhj $$4, dhj $$5, dhj $$6, dhj $$7) {
      this.a($$0, nr.e.b);
      this.a($$1, nr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dhj $$0, nr.e $$1) {
      this.a($$0, "_top");
      alc $$2 = this.a($$0, "_top", $$1.a(), oi::c);
      alc $$3 = this.a($$0, "_bottom", $$1.a(), oi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dhl.iD, "_front");
      alc $$0 = of.a(dhl.iD, "_top");
      alc $$1 = this.a(dhl.iD, "_bottom", nr.e.b.a(), oi::c);
      this.f(dhl.iD, $$0, $$1);
   }

   private void k() {
      alc $$0 = this.a(dhl.bx, "_top", oh.bm, oi::a);
      alc $$1 = this.a(dhl.bx, "_bottom", oh.bm, oi::a);
      this.f(dhl.bx, $$0, $$1);
   }

   private void l() {
      this.c(dhl.sF);
      alc $$0 = of.a(dhl.sF, "_top");
      alc $$1 = of.a(dhl.sF, "_bottom");
      this.b.accept(nx.a(dhl.sF).a(b()).a(ny.a(dve.ae).a(dvk.b, oa.a().a(ob.c, $$1)).a(dvk.a, oa.a().a(ob.c, $$0))));
   }

   private void f(dhj $$0, alc $$1, alc $$2) {
      this.b.accept(nx.a($$0).a(ny.a(dve.ae).a(dvk.b, oa.a().a(ob.c, $$2)).a(dvk.a, oa.a().a(ob.c, $$1))));
   }

   private void n(dhj $$0) {
      oi $$1 = oi.e($$0);
      oi $$2 = oi.e(oi.a($$0, "_corner"));
      alc $$3 = oh.as.a($$0, $$1, this.c);
      alc $$4 = oh.at.a($$0, $$2, this.c);
      alc $$5 = oh.au.a($$0, $$1, this.c);
      alc $$6 = oh.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dve.ag)
                     .a(dvs.a, oa.a().a(ob.c, $$3))
                     .a(dvs.b, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(dvs.c, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
                     .a(dvs.d, oa.a().a(ob.c, $$6).a(ob.b, ob.a.b))
                     .a(dvs.e, oa.a().a(ob.c, $$5))
                     .a(dvs.f, oa.a().a(ob.c, $$6))
                     .a(dvs.g, oa.a().a(ob.c, $$4))
                     .a(dvs.h, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
                     .a(dvs.i, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
                     .a(dvs.j, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
               )
         );
   }

   private void o(dhj $$0) {
      alc $$1 = this.a($$0, "", oh.as, oi::e);
      alc $$2 = this.a($$0, "", oh.au, oi::e);
      alc $$3 = this.a($$0, "", oh.av, oi::e);
      alc $$4 = this.a($$0, "_on", oh.as, oi::e);
      alc $$5 = this.a($$0, "_on", oh.au, oi::e);
      alc $$6 = this.a($$0, "_on", oh.av, oi::e);
      ny $$7 = ny.a(dve.w, dve.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return oa.a().a(ob.c, $$6x ? $$4 : $$1);
            case b:
               return oa.a().a(ob.c, $$6x ? $$4 : $$1).a(ob.b, ob.a.b);
            case c:
               return oa.a().a(ob.c, $$6x ? $$5 : $$2).a(ob.b, ob.a.b);
            case d:
               return oa.a().a(ob.c, $$6x ? $$6 : $$3).a(ob.b, ob.a.b);
            case e:
               return oa.a().a(ob.c, $$6x ? $$5 : $$2);
            case f:
               return oa.a().a(ob.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(nx.a($$0).a($$7));
   }

   private nr.a a(alc $$0, dhj $$1) {
      return new nr.a($$0, $$1);
   }

   private nr.a f(dhj $$0, dhj $$1) {
      return new nr.a(of.a($$0), $$1);
   }

   private void a(dhj $$0, cvk $$1) {
      alc $$2 = oh.aa.a($$0, oi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dhj $$0, alc $$1) {
      alc $$2 = oh.aa.a($$0, oi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dhj $$0, dhj $$1) {
      this.a($$0);
      alc $$2 = ok.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dhj $$0) {
      this.a($$0.q());
      alc $$1 = ok.k.create($$0, this.c);
      alc $$2 = ok.l.create($$0, this.c);
      alc $$3 = ok.m.create($$0, this.c);
      alc $$4 = ok.n.create($$0, this.c);
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dve.S, 1, 2, 3, 4).a(dve.R, jj.c), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dve.S, 1, 2, 3, 4).a(dve.R, jj.f), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.S, 1, 2, 3, 4).a(dve.R, jj.d), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(nv.a().a(dve.S, 1, 2, 3, 4).a(dve.R, jj.e), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(nv.a().a(dve.S, 2, 3, 4).a(dve.R, jj.c), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dve.S, 2, 3, 4).a(dve.R, jj.f), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.S, 2, 3, 4).a(dve.R, jj.d), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(nv.a().a(dve.S, 2, 3, 4).a(dve.R, jj.e), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(nv.a().a(dve.S, 3, 4).a(dve.R, jj.c), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dve.S, 3, 4).a(dve.R, jj.f), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.S, 3, 4).a(dve.R, jj.d), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(nv.a().a(dve.S, 3, 4).a(dve.R, jj.e), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(nv.a().a(dve.S, 4).a(dve.R, jj.c), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dve.S, 4).a(dve.R, jj.f), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.S, 4).a(dve.R, jj.d), oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
               .a(nv.a().a(dve.S, 4).a(dve.R, jj.e), oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         );
   }

   private void a(ok.a $$0, dhj... $$1) {
      for (dhj $$2 : $$1) {
         alc $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ok.a $$0, dhj... $$1) {
      for (dhj $$2 : $$1) {
         alc $$3 = $$0.create($$2, this.c);
         this.b.accept(nx.a($$2, oa.a().a(ob.c, $$3)).a(c()));
      }
   }

   private void h(dhj $$0, dhj $$1) {
      this.a($$0);
      oi $$2 = oi.b($$0, $$1);
      alc $$3 = oh.aI.a($$1, $$2, this.c);
      alc $$4 = oh.aJ.a($$1, $$2, this.c);
      alc $$5 = oh.aK.a($$1, $$2, this.c);
      alc $$6 = oh.aG.a($$1, $$2, this.c);
      alc $$7 = oh.aH.a($$1, $$2, this.c);
      cvk $$8 = $$1.q();
      oh.bz.a(of.a($$8), oi.F($$0), this.c);
      this.b
         .accept(
            nw.a($$1)
               .a(oa.a().a(ob.c, $$3))
               .a(nv.a().a(dve.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dve.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dve.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.L, false), oa.a().a(ob.c, $$6))
               .a(nv.a().a(dve.M, false), oa.a().a(ob.c, $$7))
               .a(nv.a().a(dve.N, false), oa.a().a(ob.c, $$7).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.O, false), oa.a().a(ob.c, $$6).a(ob.b, ob.a.d))
         );
   }

   private void q(dhj $$0) {
      oi $$1 = oi.z($$0);
      alc $$2 = oh.aL.a($$0, $$1, this.c);
      alc $$3 = this.a($$0, "_conditional", oh.aL, $$1x -> $$1.c(oj.i, $$1x));
      this.b.accept(nx.a($$0).a(a(dve.c, $$3, $$2)).a(e()));
   }

   private void r(dhj $$0) {
      alc $$1 = ok.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oa> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oa.a().a(ob.c, of.a(dhl.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dhl.mZ);
      this.b
         .accept(
            nw.a(dhl.mZ)
               .a(nv.a().a(dve.aq, 0), this.a(0))
               .a(nv.a().a(dve.aq, 1), this.a(1))
               .a(nv.a().a(dve.bk, dva.b), oa.a().a(ob.c, of.a(dhl.mZ, "_small_leaves")))
               .a(nv.a().a(dve.bk, dva.c), oa.a().a(ob.c, of.a(dhl.mZ, "_large_leaves")))
         );
   }

   private ny n() {
      return ny.a(dve.P)
         .a(jj.a, oa.a().a(ob.a, ob.a.c))
         .a(jj.b, oa.a())
         .a(jj.c, oa.a().a(ob.a, ob.a.b))
         .a(jj.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
         .a(jj.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
         .a(jj.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   private void o() {
      alc $$0 = oi.a(dhl.nU, "_top_open");
      this.b
         .accept(
            nx.a(dhl.nU)
               .a(this.n())
               .a(
                  ny.a(dve.u)
                     .a(false, oa.a().a(ob.c, ok.f.create(dhl.nU, this.c)))
                     .a(true, oa.a().a(ob.c, ok.f.get(dhl.nU).a($$1 -> $$1.a(oj.f, $$0)).a(dhl.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ny a(dvr<T> $$0, T $$1, alc $$2, alc $$3) {
      oa $$4 = oa.a().a(ob.c, $$2);
      oa $$5 = oa.a().a(ob.c, $$3);
      return ny.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dhj $$0, Function<dhj, oi> $$1) {
      oi $$2 = $$1.apply($$0).b(oj.i, oj.c);
      oi $$3 = $$2.c(oj.g, oi.a($$0, "_front_honey"));
      alc $$4 = oh.q.a($$0, $$2, this.c);
      alc $$5 = oh.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nx.a($$0).a(b()).a(a(dve.aN, 5, $$5, $$4)));
   }

   private void a(dhj $$0, dvr<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alc> $$3 = new Int2ObjectOpenHashMap();
         ny $$4 = ny.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alc $$5 = (alc)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, oh.aV, oi::g));
            return oa.a().a(ob.c, $$5);
         });
         this.a($$0.q());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void p() {
      alc $$0 = of.a(dhl.od, "_floor");
      alc $$1 = of.a(dhl.od, "_ceiling");
      alc $$2 = of.a(dhl.od, "_wall");
      alc $$3 = of.a(dhl.od, "_between_walls");
      this.a(cvt.wu);
      this.b
         .accept(
            nx.a(dhl.od)
               .a(
                  ny.a(dve.R, dve.V)
                     .a(jj.c, dvc.a, oa.a().a(ob.c, $$0))
                     .a(jj.d, dvc.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.c))
                     .a(jj.f, dvc.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.b))
                     .a(jj.e, dvc.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.d))
                     .a(jj.c, dvc.b, oa.a().a(ob.c, $$1))
                     .a(jj.d, dvc.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(jj.f, dvc.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(jj.e, dvc.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
                     .a(jj.c, dvc.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
                     .a(jj.d, dvc.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
                     .a(jj.f, dvc.c, oa.a().a(ob.c, $$2))
                     .a(jj.e, dvc.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
                     .a(jj.d, dvc.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(jj.c, dvc.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
                     .a(jj.f, dvc.d, oa.a().a(ob.c, $$3))
                     .a(jj.e, dvc.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nx.a(dhl.nZ, oa.a().a(ob.c, of.a(dhl.nZ)))
               .a(
                  ny.a(dve.U, dve.R)
                     .a(duz.a, jj.c, oa.a())
                     .a(duz.a, jj.f, oa.a().a(ob.b, ob.a.b))
                     .a(duz.a, jj.d, oa.a().a(ob.b, ob.a.c))
                     .a(duz.a, jj.e, oa.a().a(ob.b, ob.a.d))
                     .a(duz.b, jj.c, oa.a().a(ob.a, ob.a.b))
                     .a(duz.b, jj.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(duz.b, jj.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(duz.b, jj.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
                     .a(duz.c, jj.d, oa.a().a(ob.a, ob.a.c))
                     .a(duz.c, jj.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(duz.c, jj.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(duz.c, jj.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               )
         );
   }

   private void d(dhj $$0, ok.a $$1) {
      alc $$2 = $$1.create($$0, this.c);
      alc $$3 = oi.a($$0, "_front_on");
      alc $$4 = $$1.get($$0).a($$1x -> $$1x.a(oj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nx.a($$0).a(a(dve.r, $$4, $$2)).a(b()));
   }

   private void a(dhj... $$0) {
      alc $$1 = of.a("campfire_off");

      for (dhj $$2 : $$0) {
         alc $$3 = oh.bc.a($$2, oi.E($$2), this.c);
         this.a($$2.q());
         this.b.accept(nx.a($$2).a(a(dve.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dhj $$0) {
      alc $$1 = oh.bv.a($$0, oi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dhj $$0) {
      alc $$1;
      if ($$0 == dhl.tj) {
         $$1 = oh.bx.a($$0, oi.m($$0), this.c);
      } else {
         $$1 = oh.bw.a($$0, oi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oi $$0 = oi.a(oi.G(dhl.cl), oi.G(dhl.n));
      alc $$1 = oh.j.a(dhl.cl, $$0, this.c);
      this.b.accept(c(dhl.cl, $$1));
   }

   private void s() {
      this.a(cvt.lH);
      this.b
         .accept(
            nw.a(dhl.cw)
               .a(
                  nv.b(
                     nv.a().a(dve.ab, dvt.c).a(dve.aa, dvt.c).a(dve.ac, dvt.c).a(dve.ad, dvt.c),
                     nv.a().a(dve.ab, dvt.b, dvt.a).a(dve.aa, dvt.b, dvt.a),
                     nv.a().a(dve.aa, dvt.b, dvt.a).a(dve.ac, dvt.b, dvt.a),
                     nv.a().a(dve.ac, dvt.b, dvt.a).a(dve.ad, dvt.b, dvt.a),
                     nv.a().a(dve.ad, dvt.b, dvt.a).a(dve.ab, dvt.b, dvt.a)
                  ),
                  oa.a().a(ob.c, of.a("redstone_dust_dot"))
               )
               .a(nv.a().a(dve.ab, dvt.b, dvt.a), oa.a().a(ob.c, of.a("redstone_dust_side0")))
               .a(nv.a().a(dve.ac, dvt.b, dvt.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt0")))
               .a(nv.a().a(dve.aa, dvt.b, dvt.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dve.ad, dvt.b, dvt.a), oa.a().a(ob.c, of.a("redstone_dust_side1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dve.ab, dvt.a), oa.a().a(ob.c, of.a("redstone_dust_up")))
               .a(nv.a().a(dve.aa, dvt.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.ac, dvt.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.c))
               .a(nv.a().a(dve.ad, dvt.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.d))
         );
   }

   private void t() {
      this.a(cvt.lL);
      this.b
         .accept(
            nx.a(dhl.gY)
               .a(c())
               .a(
                  ny.a(dve.bd, dve.w)
                     .a(dvh.a, false, oa.a().a(ob.c, of.a(dhl.gY)))
                     .a(dvh.a, true, oa.a().a(ob.c, of.a(dhl.gY, "_on")))
                     .a(dvh.b, false, oa.a().a(ob.c, of.a(dhl.gY, "_subtract")))
                     .a(dvh.b, true, oa.a().a(ob.c, of.a(dhl.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oi $$0 = oi.a(dhl.jR);
      oi $$1 = oi.a(oi.a(dhl.jE, "_side"), $$0.a(oj.f));
      alc $$2 = oh.ab.a(dhl.jE, $$1, this.c);
      alc $$3 = oh.ac.a(dhl.jE, $$1, this.c);
      alc $$4 = oh.j.b(dhl.jE, "_double", $$1, this.c);
      this.b.accept(e(dhl.jE, $$2, $$3, $$4));
      this.b.accept(c(dhl.jR, oh.c.a(dhl.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cvt.sr);
      this.b
         .accept(
            nw.a(dhl.fs)
               .a(oa.a().a(ob.c, oi.G(dhl.fs)))
               .a(nv.a().a(dve.k, true), oa.a().a(ob.c, oi.a(dhl.fs, "_bottle0")))
               .a(nv.a().a(dve.l, true), oa.a().a(ob.c, oi.a(dhl.fs, "_bottle1")))
               .a(nv.a().a(dve.m, true), oa.a().a(ob.c, oi.a(dhl.fs, "_bottle2")))
               .a(nv.a().a(dve.k, false), oa.a().a(ob.c, oi.a(dhl.fs, "_empty0")))
               .a(nv.a().a(dve.l, false), oa.a().a(ob.c, oi.a(dhl.fs, "_empty1")))
               .a(nv.a().a(dve.m, false), oa.a().a(ob.c, oi.a(dhl.fs, "_empty2")))
         );
   }

   private void u(dhj $$0) {
      alc $$1 = oh.br.a($$0, oi.b($$0), this.c);
      alc $$2 = of.a("mushroom_block_inside");
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dve.L, true), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dve.M, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dve.N, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dve.O, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dve.J, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dve.K, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dve.L, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dve.M, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, false))
               .a(nv.a().a(dve.N, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, false))
               .a(nv.a().a(dve.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dve.J, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dve.K, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, false))
         );
      this.a($$0, ok.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cvt.rC);
      this.b
         .accept(
            nx.a(dhl.eg)
               .a(
                  ny.a(dve.ay)
                     .a(0, oa.a().a(ob.c, of.a(dhl.eg)))
                     .a(1, oa.a().a(ob.c, of.a(dhl.eg, "_slice1")))
                     .a(2, oa.a().a(ob.c, of.a(dhl.eg, "_slice2")))
                     .a(3, oa.a().a(ob.c, of.a(dhl.eg, "_slice3")))
                     .a(4, oa.a().a(ob.c, of.a(dhl.eg, "_slice4")))
                     .a(5, oa.a().a(ob.c, of.a(dhl.eg, "_slice5")))
                     .a(6, oa.a().a(ob.c, of.a(dhl.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dhl.nX, "_side3"))
         .a(oj.o, oi.G(dhl.t))
         .a(oj.n, oi.a(dhl.nX, "_top"))
         .a(oj.j, oi.a(dhl.nX, "_side3"))
         .a(oj.l, oi.a(dhl.nX, "_side3"))
         .a(oj.k, oi.a(dhl.nX, "_side1"))
         .a(oj.m, oi.a(dhl.nX, "_side2"));
      this.b.accept(c(dhl.nX, oh.a.a(dhl.nX, $$0, this.c)));
   }

   private void y() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dhl.ob, "_front"))
         .a(oj.o, oi.a(dhl.ob, "_bottom"))
         .a(oj.n, oi.a(dhl.ob, "_top"))
         .a(oj.j, oi.a(dhl.ob, "_front"))
         .a(oj.k, oi.a(dhl.ob, "_front"))
         .a(oj.l, oi.a(dhl.ob, "_side"))
         .a(oj.m, oi.a(dhl.ob, "_side"));
      this.b.accept(c(dhl.ob, oh.a.a(dhl.ob, $$0, this.c)));
   }

   private void a(dhj $$0, dhj $$1, BiFunction<dhj, dhj, oi> $$2) {
      oi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oh.a.a($$0, $$3, this.c)));
   }

   public void b(dhj $$0) {
      oi $$1 = new oi()
         .a(oj.c, oi.a($$0, "_particle"))
         .a(oj.o, oi.a($$0, "_down"))
         .a(oj.n, oi.a($$0, "_up"))
         .a(oj.j, oi.a($$0, "_north"))
         .a(oj.k, oi.a($$0, "_south"))
         .a(oj.l, oi.a($$0, "_east"))
         .a(oj.m, oi.a($$0, "_west"));
      this.b.accept(c($$0, oh.a.a($$0, $$1, this.c)));
   }

   private void z() {
      oi $$0 = oi.k(dhl.eZ);
      this.b.accept(c(dhl.eZ, of.a(dhl.eZ)));
      this.a(dhl.ee, $$0);
      this.a(dhl.ef, $$0);
   }

   private void a(dhj $$0, oi $$1) {
      alc $$2 = oh.p.a($$0, $$1.c(oj.g, oi.G($$0)), this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cvt.ss);
      this.m(dhl.ft);
      this.b.accept(c(dhl.fv, oh.bu.a(dhl.fv, oi.j(oi.a(dhl.H, "_still")), this.c)));
      this.b
         .accept(
            nx.a(dhl.fu)
               .a(
                  ny.a(dls.g)
                     .a(1, oa.a().a(ob.c, oh.bs.a(dhl.fu, "_level1", oi.j(oi.a(dhl.G, "_still")), this.c)))
                     .a(2, oa.a().a(ob.c, oh.bt.a(dhl.fu, "_level2", oi.j(oi.a(dhl.G, "_still")), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bu.a(dhl.fu, "_full", oi.j(oi.a(dhl.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nx.a(dhl.fw)
               .a(
                  ny.a(dls.g)
                     .a(1, oa.a().a(ob.c, oh.bs.a(dhl.fw, "_level1", oi.j(oi.G(dhl.qP)), this.c)))
                     .a(2, oa.a().a(ob.c, oh.bt.a(dhl.fw, "_level2", oi.j(oi.G(dhl.qP)), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bu.a(dhl.fw, "_full", oi.j(oi.G(dhl.qP)), this.c)))
               )
         );
   }

   private void B() {
      oi $$0 = oi.b(dhl.kv);
      alc $$1 = oh.aE.a(dhl.kv, $$0, this.c);
      alc $$2 = this.a(dhl.kv, "_dead", oh.aE, $$1x -> $$0.c(oj.b, $$1x));
      this.b.accept(nx.a(dhl.kv).a(a(dve.au, 5, $$2, $$1)));
   }

   private void C() {
      alc $$0 = of.a(dhl.tq);
      alc $$1 = of.a(dhl.tq, "_triggered");
      alc $$2 = of.a(dhl.tq, "_crafting");
      alc $$3 = of.a(dhl.tq, "_crafting_triggered");
      this.b
         .accept(
            nx.a(dhl.tq)
               .a(ny.a(dve.T).a($$0x -> this.a($$0x, oa.a())))
               .a(
                  ny.a(dve.A, djc.b)
                     .a(false, false, oa.a().a(ob.c, $$0))
                     .a(true, true, oa.a().a(ob.c, $$3))
                     .a(true, false, oa.a().a(ob.c, $$1))
                     .a(false, true, oa.a().a(ob.c, $$2))
               )
         );
   }

   private void v(dhj $$0) {
      oi $$1 = new oi().a(oj.f, oi.a(dhl.cD, "_top")).a(oj.i, oi.a(dhl.cD, "_side")).a(oj.g, oi.a($$0, "_front"));
      oi $$2 = new oi().a(oj.i, oi.a(dhl.cD, "_top")).a(oj.g, oi.a($$0, "_front_vertical"));
      alc $$3 = oh.p.a($$0, $$1, this.c);
      alc $$4 = oh.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dve.P)
                     .a(jj.a, oa.a().a(ob.c, $$4).a(ob.a, ob.a.c))
                     .a(jj.b, oa.a().a(ob.c, $$4))
                     .a(jj.c, oa.a().a(ob.c, $$3))
                     .a(jj.f, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(jj.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
                     .a(jj.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               )
         );
   }

   private void D() {
      alc $$0 = of.a(dhl.fy);
      alc $$1 = of.a(dhl.fy, "_filled");
      this.b.accept(nx.a(dhl.fy).a(ny.a(dve.h).a(false, oa.a().a(ob.c, $$0)).a(true, oa.a().a(ob.c, $$1))).a(c()));
   }

   private void E() {
      alc $$0 = of.a(dhl.ku, "_side");
      alc $$1 = of.a(dhl.ku, "_noside");
      alc $$2 = of.a(dhl.ku, "_noside1");
      alc $$3 = of.a(dhl.ku, "_noside2");
      alc $$4 = of.a(dhl.ku, "_noside3");
      this.b
         .accept(
            nw.a(dhl.ku)
               .a(nv.a().a(dve.L, true), oa.a().a(ob.c, $$0))
               .a(nv.a().a(dve.M, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dve.N, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dve.O, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dve.J, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dve.K, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dve.L, false), oa.a().a(ob.c, $$1).a(ob.e, 2), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$3), oa.a().a(ob.c, $$4))
               .a(
                  nv.a().a(dve.M, false),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.b).a(ob.d, true)
               )
               .a(
                  nv.a().a(dve.N, false),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true)
               )
               .a(
                  nv.a().a(dve.O, false),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dve.J, false),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dve.K, false),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.b).a(ob.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            nw.a(dhl.pc)
               .a(oa.a().a(ob.c, oi.G(dhl.pc)))
               .a(nv.a().a(dve.aL, 1), oa.a().a(ob.c, oi.a(dhl.pc, "_contents1")))
               .a(nv.a().a(dve.aL, 2), oa.a().a(ob.c, oi.a(dhl.pc, "_contents2")))
               .a(nv.a().a(dve.aL, 3), oa.a().a(ob.c, oi.a(dhl.pc, "_contents3")))
               .a(nv.a().a(dve.aL, 4), oa.a().a(ob.c, oi.a(dhl.pc, "_contents4")))
               .a(nv.a().a(dve.aL, 5), oa.a().a(ob.c, oi.a(dhl.pc, "_contents5")))
               .a(nv.a().a(dve.aL, 6), oa.a().a(ob.c, oi.a(dhl.pc, "_contents6")))
               .a(nv.a().a(dve.aL, 7), oa.a().a(ob.c, oi.a(dhl.pc, "_contents7")))
               .a(nv.a().a(dve.aL, 8), oa.a().a(ob.c, oi.a(dhl.pc, "_contents_ready")))
         );
   }

   private void w(dhj $$0) {
      alc $$1 = oh.c.a($$0, oi.a($$0), this.c);
      alc $$2 = this.a($$0, "_powered", oh.c, oi::b);
      alc $$3 = this.a($$0, "_lit", oh.c, oi::b);
      alc $$4 = this.a($$0, "_lit_powered", oh.c, oi::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nu a(dhj $$0, alc $$1, alc $$2, alc $$3, alc $$4) {
      return nx.a($$0).a(ny.a(dve.r, dve.w).a(($$4x, $$5) -> $$4x ? oa.a().a(ob.c, $$5 ? $$4 : $$2) : oa.a().a(ob.c, $$5 ? $$3 : $$1)));
   }

   private void i(dhj $$0, dhj $$1) {
      alc $$2 = of.a($$0);
      alc $$3 = of.a($$0, "_powered");
      alc $$4 = of.a($$0, "_lit");
      alc $$5 = of.a($$0, "_lit_powered");
      this.a($$1, of.a($$0.q()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dhj $$0) {
      this.c($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, oh.ao.a($$0, oi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dhl.qy);
      this.x(dhl.qx);
      this.x(dhl.qw);
      this.x(dhl.qv);
   }

   private void H() {
      this.c(dhl.st);
      ny.b<jj, dvl> $$0 = ny.a(dve.bm, dve.bn);

      for (dvl $$1 : dvl.values()) {
         $$0.a(jj.b, $$1, this.a(jj.b, $$1));
      }

      for (dvl $$2 : dvl.values()) {
         $$0.a(jj.a, $$2, this.a(jj.a, $$2));
      }

      this.b.accept(nx.a(dhl.st).a($$0));
   }

   private oa a(jj $$0, dvl $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oi $$3 = oi.c(oi.a(dhl.st, $$2));
      return oa.a().a(ob.c, oh.an.a(dhl.st, $$2, $$3, this.c));
   }

   private void y(dhj $$0) {
      oi $$1 = new oi().a(oj.e, oi.G(dhl.dV)).a(oj.f, oi.G($$0)).a(oj.i, oi.a($$0, "_side"));
      this.b.accept(c($$0, oh.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alc $$0 = oi.a(dhl.gZ, "_side");
      oi $$1 = new oi().a(oj.f, oi.a(dhl.gZ, "_top")).a(oj.i, $$0);
      oi $$2 = new oi().a(oj.f, oi.a(dhl.gZ, "_inverted_top")).a(oj.i, $$0);
      this.b
         .accept(
            nx.a(dhl.gZ)
               .a(ny.a(dve.p).a(false, oa.a().a(ob.c, oh.aF.a(dhl.gZ, $$1, this.c))).a(true, oa.a().a(ob.c, oh.aF.a(of.a(dhl.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dhj $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()));
   }

   private void J() {
      dhj $$0 = dhl.ss;
      alc $$1 = of.a($$0, "_on");
      alc $$2 = of.a($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()).a(a(dve.w, $$1, $$2)));
   }

   private void K() {
      oi $$0 = new oi().a(oj.B, oi.G(dhl.j)).a(oj.f, oi.G(dhl.cC));
      oi $$1 = new oi().a(oj.B, oi.G(dhl.j)).a(oj.f, oi.a(dhl.cC, "_moist"));
      alc $$2 = oh.aW.a(dhl.cC, $$0, this.c);
      alc $$3 = oh.aW.a(oi.a(dhl.cC, "_moist"), $$1, this.c);
      this.b.accept(nx.a(dhl.cC).a(a(dve.aQ, 7, $$3, $$2)));
   }

   private List<alc> A(dhj $$0) {
      alc $$1 = oh.aX.a(of.a($$0, "_floor0"), oi.v($$0), this.c);
      alc $$2 = oh.aX.a(of.a($$0, "_floor1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alc> B(dhj $$0) {
      alc $$1 = oh.aY.a(of.a($$0, "_side0"), oi.v($$0), this.c);
      alc $$2 = oh.aY.a(of.a($$0, "_side1"), oi.w($$0), this.c);
      alc $$3 = oh.aZ.a(of.a($$0, "_side_alt0"), oi.v($$0), this.c);
      alc $$4 = oh.aZ.a(of.a($$0, "_side_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alc> C(dhj $$0) {
      alc $$1 = oh.ba.a(of.a($$0, "_up0"), oi.v($$0), this.c);
      alc $$2 = oh.ba.a(of.a($$0, "_up1"), oi.w($$0), this.c);
      alc $$3 = oh.bb.a(of.a($$0, "_up_alt0"), oi.v($$0), this.c);
      alc $$4 = oh.bb.a(of.a($$0, "_up_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<oa> a(List<alc> $$0, UnaryOperator<oa> $$1) {
      return $$0.stream().map($$0x -> oa.a().a(ob.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nv $$0 = nv.a().a(dve.L, false).a(dve.M, false).a(dve.N, false).a(dve.O, false).a(dve.J, false);
      List<alc> $$1 = this.A(dhl.cr);
      List<alc> $$2 = this.B(dhl.cr);
      List<alc> $$3 = this.C(dhl.cr);
      this.b
         .accept(
            nw.a(dhl.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dve.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dve.M, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(nv.b(nv.a().a(dve.N, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(nv.b(nv.a().a(dve.O, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.d)))
               .a(nv.a().a(dve.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alc> $$0 = this.A(dhl.cs);
      List<alc> $$1 = this.B(dhl.cs);
      this.b
         .accept(
            nw.a(dhl.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.d)))
         );
   }

   private void D(dhj $$0) {
      alc $$1 = ok.t.create($$0, this.c);
      alc $$2 = ok.u.create($$0, this.c);
      this.a($$0.q());
      this.b.accept(nx.a($$0).a(a(dve.j, $$2, $$1)));
   }

   private void N() {
      oi $$0 = oi.a(oi.a(dhl.ad, "_side"), oi.a(dhl.ad, "_top"));
      alc $$1 = oh.j.a(dhl.ad, $$0, this.c);
      this.b.accept(d(dhl.ad, $$1));
   }

   private void O() {
      this.a(cvt.ad);
      dhj $$0 = dhl.E;
      ny.b<Boolean, Integer> $$1 = ny.a(dme.d, dme.b);
      alc $$2 = of.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alc $$4 = of.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oa.a().a(ob.c, $$4));
         $$1.a(false, $$3, oa.a().a(ob.c, $$2));
      }

      this.b.accept(nx.a(dhl.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nx.a(dhl.kI)
               .a(
                  ny.a(dve.as)
                     .a(0, oa.a().a(ob.c, this.a(dhl.kI, "_0", oh.c, oi::b)))
                     .a(1, oa.a().a(ob.c, this.a(dhl.kI, "_1", oh.c, oi::b)))
                     .a(2, oa.a().a(ob.c, this.a(dhl.kI, "_2", oh.c, oi::b)))
                     .a(3, oa.a().a(ob.c, this.a(dhl.kI, "_3", oh.c, oi::b)))
               )
         );
   }

   private void Q() {
      alc $$0 = oi.G(dhl.j);
      oi $$1 = new oi().a(oj.e, $$0).b(oj.e, oj.c).a(oj.f, oi.a(dhl.i, "_top")).a(oj.i, oi.a(dhl.i, "_snow"));
      oa $$2 = oa.a().a(ob.c, oh.n.a(dhl.i, "_snow", $$1, this.c));
      this.a(dhl.i, of.a(dhl.i), $$2);
      alc $$3 = ok.f.get(dhl.fl).a($$1x -> $$1x.a(oj.e, $$0)).a(dhl.fl, this.c);
      this.a(dhl.fl, $$3, $$2);
      alc $$4 = ok.f.get(dhl.l).a($$1x -> $$1x.a(oj.e, $$0)).a(dhl.l, this.c);
      this.a(dhl.l, $$4, $$2);
   }

   private void a(dhj $$0, alc $$1, oa $$2) {
      List<oa> $$3 = Arrays.asList(a($$1));
      this.b.accept(nx.a($$0).a(ny.a(dve.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cvt.ri);
      this.b
         .accept(
            nx.a(dhl.fC)
               .a(
                  ny.a(dve.ar)
                     .a(0, oa.a().a(ob.c, of.a(dhl.fC, "_stage0")))
                     .a(1, oa.a().a(ob.c, of.a(dhl.fC, "_stage1")))
                     .a(2, oa.a().a(ob.c, of.a(dhl.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dhl.kE, of.a(dhl.kE)));
   }

   private void j(dhj $$0, dhj $$1) {
      oi $$2 = oi.b($$1);
      alc $$3 = oh.Y.a($$0, $$2, this.c);
      alc $$4 = oh.Z.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dve.aT, 1, $$4, $$3)));
   }

   private void T() {
      alc $$0 = of.a(dhl.hc);
      alc $$1 = of.a(dhl.hc, "_side");
      this.a(cvt.lR);
      this.b
         .accept(
            nx.a(dhl.hc)
               .a(
                  ny.a(dve.Q)
                     .a(jj.a, oa.a().a(ob.c, $$0))
                     .a(jj.c, oa.a().a(ob.c, $$1))
                     .a(jj.f, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(jj.d, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(jj.e, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               )
         );
   }

   private void k(dhj $$0, dhj $$1) {
      alc $$2 = of.a($$0);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alc $$0 = of.a(dhl.eW, "_post_ends");
      alc $$1 = of.a(dhl.eW, "_post");
      alc $$2 = of.a(dhl.eW, "_cap");
      alc $$3 = of.a(dhl.eW, "_cap_alt");
      alc $$4 = of.a(dhl.eW, "_side");
      alc $$5 = of.a(dhl.eW, "_side_alt");
      this.b
         .accept(
            nw.a(dhl.eW)
               .a(oa.a().a(ob.c, $$0))
               .a(nv.a().a(dve.L, false).a(dve.M, false).a(dve.N, false).a(dve.O, false), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dve.L, true).a(dve.M, false).a(dve.N, false).a(dve.O, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dve.L, false).a(dve.M, true).a(dve.N, false).a(dve.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.L, false).a(dve.M, false).a(dve.N, true).a(dve.O, false), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dve.L, false).a(dve.M, false).a(dve.N, false).a(dve.O, true), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dve.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dve.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dve.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         );
      this.d(dhl.eW);
   }

   private void E(dhj $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(b()));
   }

   private void V() {
      alc $$0 = of.a(dhl.dw);
      alc $$1 = of.a(dhl.dw, "_on");
      this.d(dhl.dw);
      this.b
         .accept(
            nx.a(dhl.dw)
               .a(a(dve.w, $$0, $$1))
               .a(
                  ny.a(dve.U, dve.R)
                     .a(duz.c, jj.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(duz.c, jj.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
                     .a(duz.c, jj.d, oa.a().a(ob.a, ob.a.c))
                     .a(duz.c, jj.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(duz.a, jj.c, oa.a())
                     .a(duz.a, jj.f, oa.a().a(ob.b, ob.a.b))
                     .a(duz.a, jj.d, oa.a().a(ob.b, ob.a.c))
                     .a(duz.a, jj.e, oa.a().a(ob.b, ob.a.d))
                     .a(duz.b, jj.c, oa.a().a(ob.a, ob.a.b))
                     .a(duz.b, jj.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(duz.b, jj.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(duz.b, jj.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
               )
         );
   }

   private void W() {
      this.d(dhl.fm);
      this.b.accept(b(dhl.fm, of.a(dhl.fm)));
   }

   private void X() {
      this.d(dhl.tn);
      this.b.accept(c(dhl.tn, of.a(dhl.tn)));
   }

   private void Y() {
      this.b.accept(nx.a(dhl.ed).a(ny.a(dve.H).a(jj.a.a, oa.a().a(ob.c, of.a(dhl.ed, "_ns"))).a(jj.a.c, oa.a().a(ob.c, of.a(dhl.ed, "_ew")))));
   }

   private void Z() {
      alc $$0 = ok.a.create(dhl.dV, this.c);
      this.b
         .accept(
            nx.a(
               dhl.dV,
               oa.a().a(ob.c, $$0),
               oa.a().a(ob.c, $$0).a(ob.a, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.a, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.a, ob.a.d),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.a, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.a, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.a, ob.a.d),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.a, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.a, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.a, ob.a.d),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.d),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.a, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.a, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.a, ob.a.d)
            )
         );
   }

   private void aa() {
      alc $$0 = of.a(dhl.kO);
      alc $$1 = of.a(dhl.kO, "_on");
      this.b.accept(nx.a(dhl.kO).a(a(dve.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oi $$0 = new oi().a(oj.e, oi.a(dhl.by, "_bottom")).a(oj.i, oi.a(dhl.by, "_side"));
      alc $$1 = oi.a(dhl.by, "_top_sticky");
      alc $$2 = oi.a(dhl.by, "_top");
      oi $$3 = $$0.c(oj.E, $$1);
      oi $$4 = $$0.c(oj.E, $$2);
      alc $$5 = of.a(dhl.by, "_base");
      this.a(dhl.by, $$5, $$4);
      this.a(dhl.br, $$5, $$3);
      alc $$6 = oh.n.a(dhl.by, "_inventory", $$0.c(oj.f, $$2), this.c);
      alc $$7 = oh.n.a(dhl.br, "_inventory", $$0.c(oj.f, $$1), this.c);
      this.a(dhl.by, $$6);
      this.a(dhl.br, $$7);
   }

   private void a(dhj $$0, alc $$1, oi $$2) {
      alc $$3 = oh.bj.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dve.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oi $$0 = new oi().a(oj.F, oi.a(dhl.by, "_top")).a(oj.i, oi.a(dhl.by, "_side"));
      oi $$1 = $$0.c(oj.E, oi.a(dhl.by, "_top_sticky"));
      oi $$2 = $$0.c(oj.E, oi.a(dhl.by, "_top"));
      this.b
         .accept(
            nx.a(dhl.bz)
               .a(
                  ny.a(dve.x, dve.bg)
                     .a(false, dvq.a, oa.a().a(ob.c, oh.bk.a(dhl.by, "_head", $$2, this.c)))
                     .a(false, dvq.b, oa.a().a(ob.c, oh.bk.a(dhl.by, "_head_sticky", $$1, this.c)))
                     .a(true, dvq.a, oa.a().a(ob.c, oh.bl.a(dhl.by, "_head_short", $$2, this.c)))
                     .a(true, dvq.b, oa.a().a(ob.c, oh.bl.a(dhl.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dhj $$0 = dhl.tr;
      oi $$1 = oi.a($$0, "_side_inactive", "_top_inactive");
      oi $$2 = oi.a($$0, "_side_active", "_top_active");
      oi $$3 = oi.a($$0, "_side_active", "_top_ejecting_reward");
      oi $$4 = oi.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      oi $$5 = oi.a($$0, "_side_active_ominous", "_top_active_ominous");
      oi $$6 = oi.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alc $$7 = oh.o.a($$0, $$1, this.c);
      alc $$8 = oh.o.a($$0, "_active", $$2, this.c);
      alc $$9 = oh.o.a($$0, "_ejecting_reward", $$3, this.c);
      alc $$10 = oh.o.a($$0, "_inactive_ominous", $$4, this.c);
      alc $$11 = oh.o.a($$0, "_active_ominous", $$5, this.c);
      alc $$12 = oh.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nx.a($$0).a(ny.a(dve.by, dve.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oa.a().a(ob.c, $$7x ? $$10 : $$7);
            case b, c, d -> oa.a().a(ob.c, $$7x ? $$11 : $$8);
            case e -> oa.a().a(ob.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dhj $$0 = dhl.ts;
      oi $$1 = oi.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      oi $$2 = oi.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      oi $$3 = oi.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      oi $$4 = oi.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alc $$5 = oh.bP.a($$0, $$1, this.c);
      alc $$6 = oh.bP.a($$0, "_active", $$2, this.c);
      alc $$7 = oh.bP.a($$0, "_unlocking", $$3, this.c);
      alc $$8 = oh.bP.a($$0, "_ejecting_reward", $$4, this.c);
      oi $$9 = oi.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      oi $$10 = oi.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$11 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$12 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alc $$13 = oh.bP.a($$0, "_ominous", $$9, this.c);
      alc $$14 = oh.bP.a($$0, "_active_ominous", $$10, this.c);
      alc $$15 = oh.bP.a($$0, "_unlocking_ominous", $$11, this.c);
      alc $$16 = oh.bP.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nx.a($$0).a(b()).a(ny.a(dqf.b, dqf.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oa.a().a(ob.c, $$9x ? $$13 : $$5);
            case b -> oa.a().a(ob.c, $$9x ? $$14 : $$6);
            case c -> oa.a().a(ob.c, $$9x ? $$15 : $$7);
            case d -> oa.a().a(ob.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alc $$0 = of.a(dhl.qQ, "_inactive");
      alc $$1 = of.a(dhl.qQ, "_active");
      this.a(dhl.qQ, $$0);
      this.b.accept(nx.a(dhl.qQ).a(ny.a(dve.bo).a($$2 -> oa.a().a(ob.c, $$2 != dvv.b && $$2 != dvv.c ? $$0 : $$1))));
   }

   private void ag() {
      alc $$0 = of.a(dhl.qR, "_inactive");
      alc $$1 = of.a(dhl.qR, "_active");
      this.a(dhl.qR, $$0);
      this.b.accept(nx.a(dhl.qR).a(ny.a(dve.bo).a($$2 -> oa.a().a(ob.c, $$2 != dvv.b && $$2 != dvv.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alc $$0 = oh.bO.a(dhl.qV, oi.a(false), this.c);
      alc $$1 = oh.bO.a(dhl.qV, "_can_summon", oi.a(true), this.c);
      this.a(dhl.qV, $$0);
      this.b.accept(nx.a(dhl.qV).a(a(dve.G, $$1, $$0)));
   }

   private void ai() {
      alc $$0 = of.a(dhl.nS, "_stable");
      alc $$1 = of.a(dhl.nS, "_unstable");
      this.a(dhl.nS, $$0);
      this.b.accept(nx.a(dhl.nS).a(a(dve.b, $$1, $$0)));
   }

   private void aj() {
      alc $$0 = this.a(dhl.sv, "", oh.ao, oi::c);
      alc $$1 = this.a(dhl.sv, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dhl.sv).a(a(dve.D, $$1, $$0)));
      alc $$2 = this.a(dhl.sw, "", oh.ao, oi::c);
      alc $$3 = this.a(dhl.sw, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dhl.sw).a(a(dve.D, $$3, $$2)));
   }

   private void ak() {
      alc $$0 = ok.a.create(dhl.fB, this.c);
      alc $$1 = this.a(dhl.fB, "_on", oh.c, oi::b);
      this.b.accept(nx.a(dhl.fB).a(a(dve.r, $$1, $$0)));
   }

   private void l(dhj $$0, dhj $$1) {
      oi $$2 = oi.y($$0);
      this.b.accept(c($$0, oh.bf.a($$0, $$2, this.c)));
      this.b.accept(nx.a($$1, oa.a().a(ob.c, oh.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oi $$0 = oi.y(dhl.dK);
      oi $$1 = oi.i(oi.a(dhl.dK, "_off"));
      alc $$2 = oh.bh.a(dhl.dK, $$0, this.c);
      alc $$3 = oh.bh.a(dhl.dK, "_off", $$1, this.c);
      this.b.accept(nx.a(dhl.dK).a(a(dve.r, $$2, $$3)));
      alc $$4 = oh.bi.a(dhl.dL, $$0, this.c);
      alc $$5 = oh.bi.a(dhl.dL, "_off", $$1, this.c);
      this.b.accept(nx.a(dhl.dL).a(a(dve.r, $$4, $$5)).a(d()));
      this.d(dhl.dK);
      this.c(dhl.dL);
   }

   private void am() {
      this.a(cvt.lK);
      this.b.accept(nx.a(dhl.eh).a(ny.a(dve.aA, dve.s, dve.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oa.a().a(ob.c, oi.a(dhl.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cvt.cT);
      this.b
         .accept(
            nx.a(dhl.mV)
               .a(
                  ny.a(dve.aS, dve.C)
                     .a(1, false, Arrays.asList(a(of.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(of.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(of.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(of.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(of.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(of.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(of.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(of.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      oi $$0 = oi.a(dhl.dN);
      alc $$1 = oh.c.a(dhl.dP, $$0, this.c);
      this.b.accept(nx.a(dhl.dN).a(ny.a(dve.aF).a($$1x -> oa.a().a(ob.c, $$1x < 8 ? of.a(dhl.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dhl.dN, of.a(dhl.dN, "_height2"));
      this.b.accept(c(dhl.dP, $$1));
   }

   private void ap() {
      this.b.accept(nx.a(dhl.oc, oa.a().a(ob.c, of.a(dhl.oc))).a(b()));
   }

   private void aq() {
      alc $$0 = ok.a.create(dhl.pa, this.c);
      this.a(dhl.pa, $$0);
      this.b.accept(nx.a(dhl.pa).a(ny.a(dve.bj).a($$0x -> oa.a().a(ob.c, this.a(dhl.pa, "_" + $$0x.c(), oh.c, oi::b)))));
   }

   private void ar() {
      this.a(cvt.wx);
      this.b.accept(nx.a(dhl.oi).a(ny.a(dve.as).a($$0 -> oa.a().a(ob.c, this.a(dhl.oi, "_stage" + $$0, oh.ao, oi::c)))));
   }

   private void as() {
      this.a(cvt.pt);
      this.b
         .accept(
            nx.a(dhl.fI)
               .a(
                  ny.a(dve.a, dve.M, dve.L, dve.N, dve.O)
                     .a(false, false, false, false, false, oa.a().a(ob.c, of.a(dhl.fI, "_ns")))
                     .a(false, true, false, false, false, oa.a().a(ob.c, of.a(dhl.fI, "_n")).a(ob.b, ob.a.b))
                     .a(false, false, true, false, false, oa.a().a(ob.c, of.a(dhl.fI, "_n")))
                     .a(false, false, false, true, false, oa.a().a(ob.c, of.a(dhl.fI, "_n")).a(ob.b, ob.a.c))
                     .a(false, false, false, false, true, oa.a().a(ob.c, of.a(dhl.fI, "_n")).a(ob.b, ob.a.d))
                     .a(false, true, true, false, false, oa.a().a(ob.c, of.a(dhl.fI, "_ne")))
                     .a(false, true, false, true, false, oa.a().a(ob.c, of.a(dhl.fI, "_ne")).a(ob.b, ob.a.b))
                     .a(false, false, false, true, true, oa.a().a(ob.c, of.a(dhl.fI, "_ne")).a(ob.b, ob.a.c))
                     .a(false, false, true, false, true, oa.a().a(ob.c, of.a(dhl.fI, "_ne")).a(ob.b, ob.a.d))
                     .a(false, false, true, true, false, oa.a().a(ob.c, of.a(dhl.fI, "_ns")))
                     .a(false, true, false, false, true, oa.a().a(ob.c, of.a(dhl.fI, "_ns")).a(ob.b, ob.a.b))
                     .a(false, true, true, true, false, oa.a().a(ob.c, of.a(dhl.fI, "_nse")))
                     .a(false, true, false, true, true, oa.a().a(ob.c, of.a(dhl.fI, "_nse")).a(ob.b, ob.a.b))
                     .a(false, false, true, true, true, oa.a().a(ob.c, of.a(dhl.fI, "_nse")).a(ob.b, ob.a.c))
                     .a(false, true, true, false, true, oa.a().a(ob.c, of.a(dhl.fI, "_nse")).a(ob.b, ob.a.d))
                     .a(false, true, true, true, true, oa.a().a(ob.c, of.a(dhl.fI, "_nsew")))
                     .a(true, false, false, false, false, oa.a().a(ob.c, of.a(dhl.fI, "_attached_ns")))
                     .a(true, false, true, false, false, oa.a().a(ob.c, of.a(dhl.fI, "_attached_n")))
                     .a(true, false, false, true, false, oa.a().a(ob.c, of.a(dhl.fI, "_attached_n")).a(ob.b, ob.a.c))
                     .a(true, true, false, false, false, oa.a().a(ob.c, of.a(dhl.fI, "_attached_n")).a(ob.b, ob.a.b))
                     .a(true, false, false, false, true, oa.a().a(ob.c, of.a(dhl.fI, "_attached_n")).a(ob.b, ob.a.d))
                     .a(true, true, true, false, false, oa.a().a(ob.c, of.a(dhl.fI, "_attached_ne")))
                     .a(true, true, false, true, false, oa.a().a(ob.c, of.a(dhl.fI, "_attached_ne")).a(ob.b, ob.a.b))
                     .a(true, false, false, true, true, oa.a().a(ob.c, of.a(dhl.fI, "_attached_ne")).a(ob.b, ob.a.c))
                     .a(true, false, true, false, true, oa.a().a(ob.c, of.a(dhl.fI, "_attached_ne")).a(ob.b, ob.a.d))
                     .a(true, false, true, true, false, oa.a().a(ob.c, of.a(dhl.fI, "_attached_ns")))
                     .a(true, true, false, false, true, oa.a().a(ob.c, of.a(dhl.fI, "_attached_ns")).a(ob.b, ob.a.b))
                     .a(true, true, true, true, false, oa.a().a(ob.c, of.a(dhl.fI, "_attached_nse")))
                     .a(true, true, false, true, true, oa.a().a(ob.c, of.a(dhl.fI, "_attached_nse")).a(ob.b, ob.a.b))
                     .a(true, false, true, true, true, oa.a().a(ob.c, of.a(dhl.fI, "_attached_nse")).a(ob.b, ob.a.c))
                     .a(true, true, true, false, true, oa.a().a(ob.c, of.a(dhl.fI, "_attached_nse")).a(ob.b, ob.a.d))
                     .a(true, true, true, true, true, oa.a().a(ob.c, of.a(dhl.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dhl.fH);
      this.b.accept(nx.a(dhl.fH).a(ny.a(dve.a, dve.w).a(($$0, $$1) -> oa.a().a(ob.c, oi.a(dhl.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alc a(int $$0, String $$1, oi $$2) {
      switch ($$0) {
         case 1:
            return oh.bn.a(of.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return oh.bo.a(of.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return oh.bp.a(of.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return oh.bq.a(of.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private alc a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", oi.b(oi.G(dhl.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oi.b(oi.a(dhl.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oi.b(oi.a(dhl.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cvt.kp);
      this.b.accept(nx.a(dhl.mf).a(ny.a(dve.aD, dve.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cvt.kq);
      Function<Integer, alc> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oi $$2 = oi.a($$1);
         return oh.by.a(dhl.mg, $$1, $$2, this.c);
      };
      this.b.accept(nx.a(dhl.mg).a(ny.a(dos.c).a($$1 -> oa.a().a(ob.c, $$0.apply($$1)))));
   }

   private void F(dhj $$0) {
      this.d($$0);
      alc $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      nv.c $$3 = ad.a(nv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dvf, Function<alc, oa>> $$4 : a) {
         dvf $$5 = (dvf)$$4.getFirst();
         Function<alc, oa> $$6 = (Function<alc, oa>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(nv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      alc $$0 = oi.a(dhl.qU, "_bottom");
      oi $$1 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dhl.qU, "_top")).a(oj.i, oi.a(dhl.qU, "_side"));
      oi $$2 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dhl.qU, "_top_bloom")).a(oj.i, oi.a(dhl.qU, "_side_bloom"));
      alc $$3 = oh.n.a(dhl.qU, "", $$1, this.c);
      alc $$4 = oh.n.a(dhl.qU, "_bloom", $$2, this.c);
      this.b.accept(nx.a(dhl.qU).a(ny.a(dve.E).a($$2x -> oa.a().a(ob.c, $$2x ? $$4 : $$3))));
      this.a(cvt.gj, $$3);
   }

   private void ax() {
      dhj $$0 = dhl.cm;
      alc $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      List.of(Pair.of(jj.c, ob.a.a), Pair.of(jj.f, ob.a.b), Pair.of(jj.d, ob.a.c), Pair.of(jj.e, ob.a.d)).forEach($$2x -> {
         jj $$3 = (jj)$$2x.getFirst();
         ob.a $$4 = (ob.a)$$2x.getSecond();
         nv.c $$5 = nv.a().a(dve.R, $$3);
         $$2.a($$5, oa.a().a(ob.c, $$1).a(ob.b, $$4).a(ob.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, of.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2) {
      List.of(Pair.of(dve.bp, oh.aM), Pair.of(dve.bq, oh.aN), Pair.of(dve.br, oh.aO), Pair.of(dve.bs, oh.aP), Pair.of(dve.bt, oh.aQ), Pair.of(dve.bu, oh.aR))
         .forEach($$3 -> {
            dvf $$4 = (dvf)$$3.getFirst();
            og $$5 = (og)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2, dvf $$3, og $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oi $$7 = new oi().a(oj.b, oi.a(dhl.cm, $$6));
      nr.d $$8 = new nr.d($$4, $$6);
      alc $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dhl.cm, $$6, $$7, this.c));
      $$0.a(nv.a($$1, nv.a().a($$3, $$5)), oa.a().a(ob.c, $$9).a(ob.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dhl.kJ, oh.c.a(dhl.kJ, oi.b(of.a("magma")), this.c)));
   }

   private void G(dhj $$0) {
      this.b($$0, ok.q);
      oh.bF.a(of.a($$0.q()), oi.u($$0), this.c);
   }

   private void b(dhj $$0, dhj $$1, nr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dhj $$0, dhj $$1) {
      oh.bG.a(of.a($$0.q()), oi.u($$1), this.c);
   }

   private void az() {
      alc $$0 = of.a(dhl.b);
      alc $$1 = of.a(dhl.b, "_mirrored");
      this.b.accept(a(dhl.eN, $$0, $$1));
      this.a(dhl.eN, $$0);
   }

   private void aA() {
      alc $$0 = of.a(dhl.sJ);
      alc $$1 = of.a(dhl.sJ, "_mirrored");
      this.b.accept(a(dhl.td, $$0, $$1).a(f()));
      this.a(dhl.td, $$0);
   }

   private void n(dhj $$0, dhj $$1) {
      this.a($$0, nr.e.b);
      oi $$2 = oi.d(oi.a($$0, "_pot"));
      alc $$3 = nr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alc $$0 = oi.a(dhl.pl, "_bottom");
      alc $$1 = oi.a(dhl.pl, "_top_off");
      alc $$2 = oi.a(dhl.pl, "_top");
      alc[] $$3 = new alc[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oi $$5 = new oi().a(oj.e, $$0).a(oj.f, $$4 == 0 ? $$1 : $$2).a(oj.i, oi.a(dhl.pl, "_side" + $$4));
         $$3[$$4] = oh.n.a(dhl.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nx.a(dhl.pl).a(ny.a(dve.aZ).a($$1x -> oa.a().a(ob.c, $$3[$$1x]))));
      this.a(cvt.wV, $$3[0]);
   }

   private oa a(jl $$0, oa $$1) {
      switch ($$0) {
         case b:
            return $$1.a(ob.a, ob.a.b);
         case c:
            return $$1.a(ob.a, ob.a.b).a(ob.b, ob.a.c);
         case d:
            return $$1.a(ob.a, ob.a.b).a(ob.b, ob.a.d);
         case a:
            return $$1.a(ob.a, ob.a.b).a(ob.b, ob.a.b);
         case f:
            return $$1.a(ob.a, ob.a.d).a(ob.b, ob.a.c);
         case g:
            return $$1.a(ob.a, ob.a.d);
         case h:
            return $$1.a(ob.a, ob.a.d).a(ob.b, ob.a.b);
         case e:
            return $$1.a(ob.a, ob.a.d).a(ob.b, ob.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(ob.b, ob.a.c);
         case i:
            return $$1.a(ob.b, ob.a.d);
         case j:
            return $$1.a(ob.b, ob.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      alc $$0 = oi.a(dhl.pb, "_top");
      alc $$1 = oi.a(dhl.pb, "_bottom");
      alc $$2 = oi.a(dhl.pb, "_side");
      alc $$3 = oi.a(dhl.pb, "_lock");
      oi $$4 = new oi().a(oj.o, $$2).a(oj.m, $$2).a(oj.l, $$2).a(oj.c, $$0).a(oj.j, $$0).a(oj.k, $$1).a(oj.n, $$3);
      alc $$5 = oh.b.a(dhl.pb, $$4, this.c);
      this.b.accept(nx.a(dhl.pb, oa.a().a(ob.c, $$5)).a(ny.a(dve.T).a($$0x -> this.a($$0x, oa.a()))));
   }

   private void aD() {
      dhj $$0 = dhl.n;
      alc $$1 = of.a($$0);
      ok $$2 = ok.a.get($$0);
      dhj $$3 = dhl.jH;
      alc $$4 = oh.ab.a($$3, $$2.b(), this.c);
      alc $$5 = oh.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lx.a().filter(ly::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dhl.rf).a(lx.w).a(dhl.rf, dhl.rD).a(dhl.rj, dhl.rn).a(lx.y);
      this.h(dhl.re).a(lx.A).a(dhl.re, dhl.rC).a(dhl.ri, dhl.rm).a(lx.C);
      this.h(dhl.rd).a(lx.E).a(dhl.rd, dhl.rB).a(dhl.rh, dhl.rl).a(lx.G);
      this.h(dhl.rc).a(lx.I).a(dhl.rc, dhl.rA).a(dhl.rg, dhl.rk).a(lx.K);
      this.w(dhl.sk);
      this.w(dhl.sl);
      this.w(dhl.sm);
      this.w(dhl.sn);
      this.i(dhl.sk, dhl.so);
      this.i(dhl.sl, dhl.sp);
      this.i(dhl.sm, dhl.sq);
      this.i(dhl.sn, dhl.sr);
      this.m(dhl.a);
      this.c(dhl.nc, dhl.a);
      this.c(dhl.nb, dhl.a);
      this.m(dhl.fO);
      this.m(dhl.dQ);
      this.c(dhl.nd, dhl.G);
      this.m(dhl.fA);
      this.m(dhl.me);
      this.m(dhl.fr);
      this.m(dhl.fR);
      this.a(cvt.ug);
      this.m(dhl.pg);
      this.m(dhl.G);
      this.m(dhl.H);
      this.m(dhl.hV);
      this.a(cvt.fS);
      this.o(dhl.pM, dhl.qd);
      this.o(dhl.pN, dhl.qe);
      this.o(dhl.pO, dhl.qf);
      this.o(dhl.pP, dhl.qg);
      this.o(dhl.pQ, dhl.qh);
      this.o(dhl.pR, dhl.qi);
      this.o(dhl.pS, dhl.qj);
      this.o(dhl.pT, dhl.qk);
      this.o(dhl.pU, dhl.ql);
      this.o(dhl.pV, dhl.qm);
      this.o(dhl.pW, dhl.qn);
      this.o(dhl.pX, dhl.qo);
      this.o(dhl.pY, dhl.qp);
      this.o(dhl.pZ, dhl.qq);
      this.o(dhl.qa, dhl.qr);
      this.o(dhl.qb, dhl.qs);
      this.o(dhl.pL, dhl.qc);
      this.m(dhl.na);
      this.m(dhl.gs);
      this.m(dhl.qP);
      this.m(dhl.sx);
      this.s(dhl.sy);
      this.s(dhl.sz);
      this.t(dhl.ti);
      this.t(dhl.tj);
      this.aj();
      this.g(dhl.sC, dhl.sA);
      this.p(dhl.sB);
      this.a(dhl.hW, cvt.hB);
      this.a(cvt.hB);
      this.aE();
      this.a(dhl.kN, cvt.jb);
      this.a(cvt.jb);
      this.f(dhl.bQ, oi.a(dhl.by, "_side"));
      this.a(dhl.R);
      this.a(dhl.S);
      this.a(dhl.iB);
      this.a(dhl.cx);
      this.a(dhl.cy);
      this.a(dhl.cz);
      this.a(dhl.fE);
      this.a(dhl.fF);
      this.a(dhl.fJ);
      this.a(dhl.N);
      this.a(dhl.T);
      this.a(dhl.O);
      this.a(dhl.ch);
      this.a(dhl.P);
      this.a(dhl.Q);
      this.a(dhl.ci);
      this.b(dhl.pj, ok.d);
      this.a(dhl.pi);
      this.a(dhl.aR);
      this.a(dhl.aS);
      this.a(dhl.aT);
      this.a(dhl.hb);
      this.a(dhl.dI);
      this.a(dhl.dJ);
      this.a(dhl.ha);
      this.a(dhl.pC);
      this.a(dhl.mW);
      this.a(dhl.dR);
      this.a(dhl.k);
      this.a(dhl.pk);
      this.a(dhl.fz);
      this.a(dhl.ec);
      this.a(dhl.L);
      this.a(dhl.ph);
      this.a(dhl.dO);
      this.b(dhl.dT, ok.g);
      this.b(dhl.pq, ok.d);
      this.b(dhl.fa, ok.d);
      this.m(dhl.ac);
      this.m(dhl.ga);
      this.a(dhl.kK);
      this.a(dhl.aY);
      this.a(dhl.iC);
      this.a(dhl.co);
      this.a(dhl.pK);
      this.a(dhl.ii);
      this.a(dhl.oy);
      this.a(dhl.dW);
      this.a(dhl.dX);
      this.b(dhl.ct, ok.b);
      this.a(dhl.aO);
      this.b(dhl.bw, ok.v);
      this.a(cvt.cS);
      this.b(dhl.ck, ok.f);
      this.b(dhl.pd, ok.d);
      this.a(dhl.op);
      this.a(dhl.aP);
      this.a(dhl.qt);
      this.a(dhl.qu);
      this.a(dhl.qN);
      this.a(dhl.su);
      this.a(dhl.tf);
      this.a(dhl.tg);
      this.a(dhl.th);
      this.e(dhl.qS);
      this.m(dhl.tt);
      this.aD();
      this.a(dhl.ra);
      this.a(dhl.rb);
      this.a(dhl.qW);
      this.a(dhl.qX);
      this.a(dhl.qY);
      this.a(dhl.qZ);
      this.k(dhl.qW, dhl.rw);
      this.k(dhl.qX, dhl.ry);
      this.k(dhl.qY, dhl.rx);
      this.k(dhl.qZ, dhl.rz);
      this.i(dhl.rM);
      this.i(dhl.rN);
      this.i(dhl.rP);
      this.i(dhl.rO);
      this.a(dhl.rM, dhl.rQ);
      this.a(dhl.rN, dhl.rR);
      this.a(dhl.rP, dhl.rT);
      this.a(dhl.rO, dhl.rS);
      this.k(dhl.rU);
      this.k(dhl.rV);
      this.k(dhl.rX);
      this.k(dhl.rW);
      this.b(dhl.rU, dhl.rY);
      this.b(dhl.rV, dhl.rZ);
      this.b(dhl.rX, dhl.sb);
      this.b(dhl.rW, dhl.sa);
      this.a(dhl.sc);
      this.a(dhl.sd);
      this.a(dhl.se);
      this.a(dhl.sf);
      this.k(dhl.sc, dhl.sg);
      this.k(dhl.sd, dhl.sh);
      this.k(dhl.se, dhl.si);
      this.k(dhl.sf, dhl.sj);
      this.j(dhl.gW, dhl.ch);
      this.j(dhl.gX, dhl.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dhl.og, dhl.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dhl.kt);
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
      this.F(dhl.ff);
      this.F(dhl.fg);
      this.F(dhl.qT);
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
      this.E(dhl.cO);
      this.d(dhl.cO);
      this.E(dhl.oa);
      this.g();
      this.E(dhl.sE);
      this.l(dhl.cp, dhl.cq);
      this.l(dhl.ea, dhl.eb);
      this.a(dhl.cA, dhl.n, oi::c);
      this.a(dhl.nY, dhl.p, oi::d);
      this.y(dhl.ow);
      this.y(dhl.on);
      this.v(dhl.aU);
      this.v(dhl.hi);
      this.C();
      this.D(dhl.oe);
      this.D(dhl.of);
      this.e(dhl.eX, of.a(dhl.eX));
      this.a(dhl.dY, ok.d);
      this.a(dhl.dZ, ok.d);
      this.a(dhl.te);
      this.a(dhl.kM, ok.d);
      this.f(dhl.j);
      this.f(dhl.sH);
      this.f(dhl.I);
      this.g(dhl.J);
      this.g(dhl.M);
      this.f(dhl.K);
      this.e(dhl.F);
      this.b(dhl.to, ok.f);
      this.a(dhl.ij, ok.d, ok.e);
      this.a(dhl.kx, ok.w, ok.x);
      this.a(dhl.hf, ok.w, ok.x);
      this.a(dhl.tk, ok.d, ok.e);
      this.a(dhl.tl, ok.d, ok.e);
      this.a(dhl.tm, ok.d, ok.e);
      this.c(dhl.nT, ok.i);
      this.z();
      this.a(dhl.pe, oi::A);
      this.a(dhl.pf, oi::C);
      this.a(dhl.kD, dve.as, 0, 1, 2, 3);
      this.a(dhl.gt, dve.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dhl.fq, dve.as, 0, 1, 1, 2);
      this.a(dhl.gu, dve.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dhl.cB, dve.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dhl.kA, nr.e.b, dve.aq, 0, 1);
      this.i();
      this.h();
      this.a(of.a("decorated_pot"), dhl.iA).b(dhl.tp);
      this.a(of.a("banner"), dhl.n)
         .a(oh.bH, dhl.iJ, dhl.iK, dhl.iL, dhl.iM, dhl.iN, dhl.iO, dhl.iP, dhl.iQ, dhl.iR, dhl.iS, dhl.iT, dhl.iU, dhl.iV, dhl.iW, dhl.iX, dhl.iY)
         .b(dhl.iZ, dhl.ja, dhl.jb, dhl.jc, dhl.jd, dhl.je, dhl.jf, dhl.jg, dhl.jh, dhl.ji, dhl.jj, dhl.jk, dhl.jl, dhl.jm, dhl.jn, dhl.jo);
      this.a(of.a("bed"), dhl.n)
         .b(dhl.aZ, dhl.ba, dhl.bb, dhl.bc, dhl.bd, dhl.be, dhl.bf, dhl.bg, dhl.bh, dhl.bi, dhl.bj, dhl.bk, dhl.bl, dhl.bm, dhl.bn, dhl.bo);
      this.m(dhl.aZ, dhl.bA);
      this.m(dhl.ba, dhl.bB);
      this.m(dhl.bb, dhl.bC);
      this.m(dhl.bc, dhl.bD);
      this.m(dhl.bd, dhl.bE);
      this.m(dhl.be, dhl.bF);
      this.m(dhl.bf, dhl.bG);
      this.m(dhl.bg, dhl.bH);
      this.m(dhl.bh, dhl.bI);
      this.m(dhl.bi, dhl.bJ);
      this.m(dhl.bj, dhl.bK);
      this.m(dhl.bk, dhl.bL);
      this.m(dhl.bl, dhl.bM);
      this.m(dhl.bm, dhl.bN);
      this.m(dhl.bn, dhl.bO);
      this.m(dhl.bo, dhl.bP);
      this.a(of.a("skull"), dhl.dW)
         .a(oh.bI, dhl.gM, dhl.gK, dhl.gI, dhl.gE, dhl.gG, dhl.gQ)
         .a(dhl.gO)
         .b(dhl.gN, dhl.gP, dhl.gL, dhl.gJ, dhl.gF, dhl.gH, dhl.gR);
      this.G(dhl.kP);
      this.G(dhl.kQ);
      this.G(dhl.kR);
      this.G(dhl.kS);
      this.G(dhl.kT);
      this.G(dhl.kU);
      this.G(dhl.kV);
      this.G(dhl.kW);
      this.G(dhl.kX);
      this.G(dhl.kY);
      this.G(dhl.kZ);
      this.G(dhl.la);
      this.G(dhl.lb);
      this.G(dhl.lc);
      this.G(dhl.ld);
      this.G(dhl.le);
      this.G(dhl.lf);
      this.b(dhl.mX, ok.q);
      this.c(dhl.mX);
      this.a(of.a("chest"), dhl.n).b(dhl.cv, dhl.gV);
      this.a(of.a("ender_chest"), dhl.co).b(dhl.fG);
      this.f(dhl.fx, dhl.co).a(dhl.fx, dhl.kF);
      this.a(dhl.aM);
      this.a(dhl.aN);
      this.a(dhl.lw);
      this.a(dhl.lx);
      this.a(dhl.ly);
      this.a(dhl.lz);
      this.a(dhl.lA);
      this.a(dhl.lB);
      this.a(dhl.lC);
      this.a(dhl.lD);
      this.a(dhl.lE);
      this.a(dhl.lF);
      this.a(dhl.lG);
      this.a(dhl.lH);
      this.a(dhl.lI);
      this.a(dhl.lJ);
      this.a(dhl.lK);
      this.a(dhl.lL);
      this.a(ok.a, dhl.lM, dhl.lN, dhl.lO, dhl.lP, dhl.lQ, dhl.lR, dhl.lS, dhl.lT, dhl.lU, dhl.lV, dhl.lW, dhl.lX, dhl.lY, dhl.lZ, dhl.ma, dhl.mb);
      this.a(dhl.iA);
      this.a(dhl.hj);
      this.a(dhl.hk);
      this.a(dhl.hl);
      this.a(dhl.hm);
      this.a(dhl.hn);
      this.a(dhl.ho);
      this.a(dhl.hp);
      this.a(dhl.hq);
      this.a(dhl.hr);
      this.a(dhl.hs);
      this.a(dhl.ht);
      this.a(dhl.hu);
      this.a(dhl.hv);
      this.a(dhl.hw);
      this.a(dhl.hx);
      this.a(dhl.hy);
      this.a(dhl.qO);
      this.h(dhl.aQ, dhl.eY);
      this.h(dhl.ei, dhl.hz);
      this.h(dhl.ej, dhl.hA);
      this.h(dhl.ek, dhl.hB);
      this.h(dhl.el, dhl.hC);
      this.h(dhl.em, dhl.hD);
      this.h(dhl.en, dhl.hE);
      this.h(dhl.eo, dhl.hF);
      this.h(dhl.ep, dhl.hG);
      this.h(dhl.eq, dhl.hH);
      this.h(dhl.er, dhl.hI);
      this.h(dhl.es, dhl.hJ);
      this.h(dhl.et, dhl.hK);
      this.h(dhl.eu, dhl.hL);
      this.h(dhl.ev, dhl.hM);
      this.h(dhl.ew, dhl.hN);
      this.h(dhl.ex, dhl.hO);
      this.b(ok.o, dhl.lg, dhl.lh, dhl.li, dhl.lj, dhl.lk, dhl.ll, dhl.lm, dhl.ln, dhl.lo, dhl.lp, dhl.lq, dhl.lr, dhl.ls, dhl.lt, dhl.lu, dhl.lv);
      this.g(dhl.bA, dhl.ik);
      this.g(dhl.bB, dhl.il);
      this.g(dhl.bC, dhl.im);
      this.g(dhl.bD, dhl.in);
      this.g(dhl.bE, dhl.io);
      this.g(dhl.bF, dhl.ip);
      this.g(dhl.bG, dhl.iq);
      this.g(dhl.bH, dhl.ir);
      this.g(dhl.bI, dhl.is);
      this.g(dhl.bJ, dhl.it);
      this.g(dhl.bK, dhl.iu);
      this.g(dhl.bL, dhl.iv);
      this.g(dhl.bM, dhl.iw);
      this.g(dhl.bN, dhl.ix);
      this.g(dhl.bO, dhl.iy);
      this.g(dhl.bP, dhl.iz);
      this.a(dhl.sI);
      this.a(dhl.eL);
      this.a(dhl.bu, dhl.gb, nr.e.a);
      this.a(dhl.bR, dhl.gc, nr.e.b);
      this.a(dhl.bT, dhl.gd, nr.e.b);
      this.a(dhl.bU, dhl.ge, nr.e.b);
      this.a(dhl.bV, dhl.gf, nr.e.b);
      this.a(dhl.bW, dhl.gg, nr.e.b);
      this.a(dhl.bX, dhl.gh, nr.e.b);
      this.a(dhl.bY, dhl.gi, nr.e.b);
      this.a(dhl.bZ, dhl.gj, nr.e.b);
      this.a(dhl.ca, dhl.gk, nr.e.b);
      this.a(dhl.cb, dhl.gl, nr.e.b);
      this.a(dhl.cc, dhl.gm, nr.e.b);
      this.a(dhl.ce, dhl.gn, nr.e.b);
      this.a(dhl.cd, dhl.go, nr.e.b);
      this.a(dhl.cg, dhl.gp, nr.e.b);
      this.a(dhl.cf, dhl.gq, nr.e.b);
      this.a(dhl.bv, dhl.gr, nr.e.b);
      this.a(dhl.bS, dhl.fS, nr.e.b);
      this.H();
      this.u(dhl.eT);
      this.u(dhl.eU);
      this.u(dhl.eV);
      this.a(dhl.bt, nr.e.a);
      this.b(dhl.dS, nr.e.a);
      this.a(cvt.dJ);
      this.b(dhl.mc, dhl.md, nr.e.b);
      this.a(cvt.dK);
      this.c(dhl.md);
      this.b(dhl.sG, nr.e.b);
      this.c(dhl.sG);
      this.c(dhl.sw);
      this.b(dhl.oz, dhl.oA, nr.e.b);
      this.b(dhl.oB, dhl.oC, nr.e.b);
      this.a(dhl.oz, "_plant");
      this.c(dhl.oA);
      this.a(dhl.oB, "_plant");
      this.c(dhl.oC);
      this.a(dhl.mY, nr.e.a, oi.c(oi.a(dhl.mZ, "_stage0")));
      this.m();
      this.a(dhl.bs, nr.e.b);
      this.c(dhl.iE, nr.e.b);
      this.c(dhl.iF, nr.e.b);
      this.c(dhl.iG, nr.e.b);
      this.c(dhl.iH, nr.e.a);
      this.c(dhl.iI, nr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dhl.mw, dhl.mr, dhl.mm, dhl.mh, dhl.mG, dhl.mB, dhl.mQ, dhl.mL);
      this.a(dhl.mx, dhl.ms, dhl.mn, dhl.mi, dhl.mH, dhl.mC, dhl.mR, dhl.mM);
      this.a(dhl.my, dhl.mt, dhl.mo, dhl.mj, dhl.mI, dhl.mD, dhl.mS, dhl.mN);
      this.a(dhl.mz, dhl.mu, dhl.mp, dhl.mk, dhl.mJ, dhl.mE, dhl.mT, dhl.mO);
      this.a(dhl.mA, dhl.mv, dhl.mq, dhl.ml, dhl.mK, dhl.mF, dhl.mU, dhl.mP);
      this.e(dhl.fe, dhl.fc);
      this.e(dhl.fd, dhl.fb);
      this.l(dhl.ab).c(dhl.ab).a(dhl.av);
      this.l(dhl.am).c(dhl.am).a(dhl.aD);
      this.a(dhl.am, dhl.dj, dhl.ds);
      this.b(dhl.aL, ok.s);
      this.l(dhl.Y).c(dhl.Y).a(dhl.as);
      this.l(dhl.ai).c(dhl.ai).a(dhl.aA);
      this.a(dhl.ai, dhl.dd, dhl.do);
      this.a(dhl.B, dhl.fX, nr.e.b);
      this.b(dhl.aI, ok.s);
      this.l(dhl.Z).d(dhl.Z).a(dhl.at);
      this.l(dhl.aj).d(dhl.aj).a(dhl.aB);
      this.a(dhl.aj, dhl.de, dhl.dp);
      this.a(dhl.C, dhl.fY, nr.e.b);
      this.b(dhl.aJ, ok.s);
      this.l(dhl.W).c(dhl.W).a(dhl.aq);
      this.l(dhl.ag).c(dhl.ag).a(dhl.ay);
      this.a(dhl.ag, dhl.dc, dhl.dn);
      this.a(dhl.z, dhl.fV, nr.e.b);
      this.b(dhl.aG, ok.s);
      this.l(dhl.U).c(dhl.U).a(dhl.ao);
      this.l(dhl.al).c(dhl.al).a(dhl.aw);
      this.a(dhl.al, dhl.da, dhl.dl);
      this.a(dhl.x, dhl.fT, nr.e.b);
      this.b(dhl.aE, ok.s);
      this.l(dhl.V).c(dhl.V).a(dhl.ap);
      this.l(dhl.af).c(dhl.af).a(dhl.ax);
      this.a(dhl.af, dhl.db, dhl.dm);
      this.a(dhl.y, dhl.fU, nr.e.b);
      this.b(dhl.aF, ok.s);
      this.l(dhl.aa).c(dhl.aa).a(dhl.au);
      this.l(dhl.ak).c(dhl.ak).a(dhl.aC);
      this.a(dhl.ak, dhl.dg, dhl.dr);
      this.a(dhl.D, dhl.fZ, nr.e.b);
      this.b(dhl.aK, ok.s);
      this.l(dhl.X).c(dhl.X).a(dhl.ar);
      this.l(dhl.ah).c(dhl.ah).a(dhl.az);
      this.a(dhl.ah, dhl.df, dhl.dq);
      this.a(dhl.A, dhl.fW, nr.e.b);
      this.b(dhl.aH, ok.s);
      this.l(dhl.os).b(dhl.os).a(dhl.ou);
      this.l(dhl.ot).b(dhl.ot).a(dhl.ov);
      this.a(dhl.ot, dhl.dh, dhl.dt);
      this.a(dhl.ox, dhl.pm, nr.e.b);
      this.n(dhl.oD, dhl.po);
      this.l(dhl.oj).b(dhl.oj).a(dhl.ol);
      this.l(dhl.ok).b(dhl.ok).a(dhl.om);
      this.a(dhl.ok, dhl.di, dhl.du);
      this.a(dhl.oo, dhl.pn, nr.e.b);
      this.n(dhl.oq, dhl.pp);
      this.l(dhl.ae).d(dhl.ae);
      this.l(dhl.an).d(dhl.an);
      this.a(dhl.v, dhl.dk, dhl.dv);
      this.b(dhl.or, nr.e.b);
      this.a(cvt.dG);
      this.i(dhl.dy);
      this.k(dhl.hY);
      this.u();
      this.n(dhl.cP);
      this.o(dhl.bp);
      this.o(dhl.bq);
      this.o(dhl.hh);
      this.t();
      this.q(dhl.fN);
      this.q(dhl.kG);
      this.q(dhl.kH);
      this.r(dhl.gS);
      this.r(dhl.gT);
      this.r(dhl.gU);
      this.o();
      this.p();
      this.d(dhl.cD, ok.h);
      this.d(dhl.nW, ok.h);
      this.d(dhl.nV, ok.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dhl.eK, dhl.eS);
      this.k(dhl.m, dhl.eO);
      this.k(dhl.eJ, dhl.eR);
      this.k(dhl.eI, dhl.eQ);
      this.az();
      this.k(dhl.eH, dhl.eP);
      this.aA();
      cwy.c().forEach($$0 -> this.a($$0, of.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dhl.hX);
      ny.a<Integer> $$0 = ny.a(dve.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alc $$3 = oi.a(cvt.hC, $$2);
         $$0.a($$1, oa.a().a(ob.c, oh.aa.a(dhl.hX, $$2, oi.h($$3), this.c)));
         oh.bz.a(of.a(cvt.hC, $$2), oi.k($$3), this.c);
      }

      this.b.accept(nx.a(dhl.hX).a($$0));
   }

   private void o(dhj $$0, dhj $$1) {
      this.a($$0.q());
      oi $$2 = oi.b(oi.G($$0));
      oi $$3 = oi.b(oi.a($$0, "_lit"));
      alc $$4 = oh.bJ.a($$0, "_one_candle", $$2, this.c);
      alc $$5 = oh.bK.a($$0, "_two_candles", $$2, this.c);
      alc $$6 = oh.bL.a($$0, "_three_candles", $$2, this.c);
      alc $$7 = oh.bM.a($$0, "_four_candles", $$2, this.c);
      alc $$8 = oh.bJ.a($$0, "_one_candle_lit", $$3, this.c);
      alc $$9 = oh.bK.a($$0, "_two_candles_lit", $$3, this.c);
      alc $$10 = oh.bL.a($$0, "_three_candles_lit", $$3, this.c);
      alc $$11 = oh.bM.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dve.az, dve.r)
                     .a(1, false, oa.a().a(ob.c, $$4))
                     .a(2, false, oa.a().a(ob.c, $$5))
                     .a(3, false, oa.a().a(ob.c, $$6))
                     .a(4, false, oa.a().a(ob.c, $$7))
                     .a(1, true, oa.a().a(ob.c, $$8))
                     .a(2, true, oa.a().a(ob.c, $$9))
                     .a(3, true, oa.a().a(ob.c, $$10))
                     .a(4, true, oa.a().a(ob.c, $$11))
               )
         );
      alc $$12 = oh.bN.a($$1, oi.a($$0, false), this.c);
      alc $$13 = oh.bN.a($$1, "_lit", oi.a($$0, true), this.c);
      this.b.accept(nx.a($$1).a(a(dve.r, $$13, $$12)));
   }

   class a {
      private final alc b;

      public a(final alc $$0, final dhj $$1) {
         this.b = oh.aa.a($$0, oi.u($$1), nr.this.c);
      }

      public nr.a a(dhj... $$0) {
         for (dhj $$1 : $$0) {
            nr.this.b.accept(nr.c($$1, this.b));
         }

         return this;
      }

      public nr.a b(dhj... $$0) {
         for (dhj $$1 : $$0) {
            nr.this.c($$1);
         }

         return this.a($$0);
      }

      public nr.a a(og $$0, dhj... $$1) {
         for (dhj $$2 : $$1) {
            $$0.a(of.a($$2.q()), oi.u($$2), nr.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final oi b;
      private final Map<og, alc> c = Maps.newHashMap();
      @Nullable
      private ly d;
      @Nullable
      private alc e;
      private final Set<dhj> f = new HashSet<>();

      public b(final oi $$0) {
         this.b = $$0;
      }

      public nr.b a(dhj $$0, og $$1) {
         this.e = $$1.a($$0, this.b, nr.this.c);
         if (nr.this.f.containsKey($$0)) {
            nr.this.b.accept(nr.this.f.get($$0).create($$0, this.e, this.b, nr.this.c));
         } else {
            nr.this.b.accept(nr.c($$0, this.e));
         }

         return this;
      }

      public nr.b a(dhj $$0, dhj $$1) {
         alc $$2 = of.a($$0);
         nr.this.b.accept(nr.c($$1, $$2));
         nr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nr.b a(dhj $$0) {
         alc $$1 = oh.s.a($$0, this.b, nr.this.c);
         alc $$2 = oh.t.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.b($$0, $$1, $$2));
         alc $$3 = oh.u.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b b(dhj $$0) {
         alc $$1 = oh.M.a($$0, this.b, nr.this.c);
         alc $$2 = oh.N.a($$0, this.b, nr.this.c);
         alc $$3 = oh.O.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3));
         alc $$4 = oh.P.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$4);
         return this;
      }

      public nr.b c(dhj $$0) {
         oi $$1 = oi.p($$0);
         alc $$2 = oh.D.a($$0, $$1, nr.this.c);
         alc $$3 = oh.E.a($$0, $$1, nr.this.c);
         alc $$4 = oh.F.a($$0, $$1, nr.this.c);
         alc $$5 = oh.G.a($$0, $$1, nr.this.c);
         alc $$6 = oh.H.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, $$6));
         alc $$7 = oh.I.a($$0, $$1, nr.this.c);
         nr.this.a($$0, $$7);
         return this;
      }

      public nr.b d(dhj $$0) {
         alc $$1 = oh.J.a($$0, this.b, nr.this.c);
         alc $$2 = oh.K.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$1, $$2));
         alc $$3 = oh.L.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b e(dhj $$0) {
         oi $$1 = oi.p($$0);
         alc $$2 = oh.R.a($$0, $$1, nr.this.c);
         alc $$3 = oh.Q.a($$0, $$1, nr.this.c);
         alc $$4 = oh.T.a($$0, $$1, nr.this.c);
         alc $$5 = oh.S.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nr.b f(dhj $$0) {
         alc $$1 = oh.V.a($$0, this.b, nr.this.c);
         alc $$2 = oh.U.a($$0, this.b, nr.this.c);
         alc $$3 = oh.X.a($$0, this.b, nr.this.c);
         alc $$4 = oh.W.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nr.b g(dhj $$0) {
         alc $$1 = oh.Y.a($$0, this.b, nr.this.c);
         alc $$2 = oh.Z.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.e($$0, $$1, $$2));
         return this;
      }

      public nr.b h(dhj $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dhj $$1 = this.d.b().get(ly.b.r);
            alc $$2 = oh.aa.a($$0, this.b, nr.this.c);
            nr.this.b.accept(nr.c($$0, $$2));
            nr.this.b.accept(nr.c($$1, $$2));
            nr.this.a($$0.q());
            nr.this.c($$1);
            return this;
         }
      }

      public nr.b i(dhj $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alc $$1 = this.a(oh.ab, $$0);
            alc $$2 = this.a(oh.ac, $$0);
            nr.this.b.accept(nr.e($$0, $$1, $$2, this.e));
            nr.this.a($$0, $$1);
            return this;
         }
      }

      public nr.b j(dhj $$0) {
         alc $$1 = this.a(oh.af, $$0);
         alc $$2 = this.a(oh.ae, $$0);
         alc $$3 = this.a(oh.ag, $$0);
         nr.this.b.accept(nr.b($$0, $$1, $$2, $$3));
         nr.this.a($$0, $$2);
         return this;
      }

      private nr.b k(dhj $$0) {
         ok $$1 = nr.this.g.getOrDefault($$0, ok.a.get($$0));
         alc $$2 = $$1.a($$0, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$2));
         return this;
      }

      private nr.b l(dhj $$0) {
         nr.this.i($$0);
         return this;
      }

      private void m(dhj $$0) {
         if (nr.this.e.contains($$0)) {
            nr.this.k($$0);
         } else {
            nr.this.j($$0);
         }
      }

      private alc a(og $$0, dhj $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nr.this.c));
      }

      public nr.b a(ly $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nr.b, dhj> $$2 = nr.h.get($$0x);
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
      nu create(dhj var1, alc var2, oi var3, BiConsumer<alc, Supplier<JsonElement>> var4);
   }

   static record d(og a, String b) {
   }

   static enum e {
      a,
      b;

      public og a() {
         return this == a ? oh.ap : oh.ao;
      }

      public og b() {
         return this == a ? oh.ar : oh.aq;
      }
   }

   class f {
      private final oi b;

      public f(final oi $$0) {
         this.b = $$0;
      }

      public nr.f a(dhj $$0) {
         oi $$1 = this.b.c(oj.d, this.b.a(oj.i));
         alc $$2 = oh.j.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$2));
         return this;
      }

      public nr.f b(dhj $$0) {
         alc $$1 = oh.j.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1));
         return this;
      }

      public nr.f c(dhj $$0) {
         alc $$1 = oh.j.a($$0, this.b, nr.this.c);
         alc $$2 = oh.k.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1, $$2));
         return this;
      }

      public nr.f d(dhj $$0) {
         nr.this.b.accept(nr.a($$0, this.b, nr.this.c));
         return this;
      }
   }
}
