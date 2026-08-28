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
   final BiConsumer<alb, Supplier<JsonElement>> c;
   private final Consumer<cvg> d;
   final List<dgv> e = ImmutableList.of(dgx.ey, dgx.eE, dgx.hY);
   final Map<dgv, nr.c> f = ImmutableMap.builder().put(dgx.b, nr::a).put(dgx.sJ, nr::c).put(dgx.eM, nr::b).build();
   final Map<dgv, ok> g = ImmutableMap.builder()
      .put(dgx.aV, ok.y.get(dgx.aV))
      .put(dgx.jp, ok.y.get(dgx.jp))
      .put(dgx.jS, ok.a(oi.a(dgx.aV, "_top")))
      .put(dgx.jU, ok.a(oi.a(dgx.jp, "_top")))
      .put(dgx.aX, ok.d.get(dgx.aV).a($$0x -> $$0x.a(oj.i, oi.G(dgx.aX))))
      .put(dgx.jr, ok.d.get(dgx.jp).a($$0x -> $$0x.a(oj.i, oi.G(dgx.jr))))
      .put(dgx.hd, ok.d.get(dgx.hd))
      .put(dgx.jT, ok.a(oi.a(dgx.hd, "_bottom")))
      .put(dgx.pr, ok.z.get(dgx.pr))
      .put(dgx.sJ, ok.z.get(dgx.sJ))
      .put(dgx.he, ok.d.get(dgx.he).a($$0x -> $$0x.a(oj.i, oi.G(dgx.he))))
      .put(dgx.aW, ok.d.get(dgx.aW).a($$0x -> {
         $$0x.a(oj.d, oi.a(dgx.aV, "_top"));
         $$0x.a(oj.i, oi.G(dgx.aW));
      }))
      .put(dgx.jq, ok.d.get(dgx.jq).a($$0x -> {
         $$0x.a(oj.d, oi.a(dgx.jp, "_top"));
         $$0x.a(oj.i, oi.G(dgx.jq));
      }))
      .put(dgx.qM, ok.z.get(dgx.qM))
      .put(dgx.qH, ok.z.get(dgx.qH))
      .build();
   static final Map<ly.b, BiConsumer<nr.b, dgv>> h = ImmutableMap.builder()
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
   public static final List<Pair<dur, Function<alb, oa>>> a = List.of(
      Pair.of(duq.L, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0)),
      Pair.of(duq.M, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true)),
      Pair.of(duq.N, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true)),
      Pair.of(duq.O, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true)),
      Pair.of(duq.J, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true)),
      Pair.of(duq.K, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
   );
   private static final Map<nr.d, alb> i = new HashMap<>();

   private static nu a(dgv $$0, alb $$1, oi $$2, BiConsumer<alb, Supplier<JsonElement>> $$3) {
      alb $$4 = oh.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nu b(dgv $$0, alb $$1, oi $$2, BiConsumer<alb, Supplier<JsonElement>> $$3) {
      alb $$4 = oh.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nu c(dgv $$0, alb $$1, oi $$2, BiConsumer<alb, Supplier<JsonElement>> $$3) {
      alb $$4 = oh.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nr(Consumer<nu> $$0, BiConsumer<alb, Supplier<JsonElement>> $$1, Consumer<cvg> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dgv $$0) {
      this.d.accept($$0.r());
   }

   void a(dgv $$0, alb $$1) {
      this.c.accept(of.a($$0.r()), new oe($$1));
   }

   private void a(cvg $$0, alb $$1) {
      this.c.accept(of.a($$0), new oe($$1));
   }

   void a(cvg $$0) {
      oh.bz.a(of.a($$0), oi.b($$0), this.c);
   }

   private void d(dgv $$0) {
      cvg $$1 = $$0.r();
      if ($$1 != cvo.a) {
         oh.bz.a(of.a($$1), oi.F($$0), this.c);
      }
   }

   private void a(dgv $$0, String $$1) {
      cvg $$2 = $$0.r();
      oh.bz.a(of.a($$2), oi.k(oi.a($$0, $$1)), this.c);
   }

   private static ny b() {
      return ny.a(duq.R).a(jj.f, oa.a().a(ob.b, ob.a.b)).a(jj.d, oa.a().a(ob.b, ob.a.c)).a(jj.e, oa.a().a(ob.b, ob.a.d)).a(jj.c, oa.a());
   }

   private static ny c() {
      return ny.a(duq.R).a(jj.d, oa.a()).a(jj.e, oa.a().a(ob.b, ob.a.b)).a(jj.c, oa.a().a(ob.b, ob.a.c)).a(jj.f, oa.a().a(ob.b, ob.a.d));
   }

   private static ny d() {
      return ny.a(duq.R).a(jj.f, oa.a()).a(jj.d, oa.a().a(ob.b, ob.a.b)).a(jj.e, oa.a().a(ob.b, ob.a.c)).a(jj.c, oa.a().a(ob.b, ob.a.d));
   }

   private static ny e() {
      return ny.a(duq.P)
         .a(jj.a, oa.a().a(ob.a, ob.a.b))
         .a(jj.b, oa.a().a(ob.a, ob.a.d))
         .a(jj.c, oa.a())
         .a(jj.d, oa.a().a(ob.b, ob.a.c))
         .a(jj.e, oa.a().a(ob.b, ob.a.d))
         .a(jj.f, oa.a().a(ob.b, ob.a.b));
   }

   private static nx b(dgv $$0, alb $$1) {
      return nx.a($$0, a($$1));
   }

   private static oa[] a(alb $$0) {
      return new oa[]{oa.a().a(ob.c, $$0), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d)};
   }

   private static nx a(dgv $$0, alb $$1, alb $$2) {
      return nx.a($$0, oa.a().a(ob.c, $$1), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c));
   }

   private static ny a(dur $$0, alb $$1, alb $$2) {
      return ny.a($$0).a(true, oa.a().a(ob.c, $$1)).a(false, oa.a().a(ob.c, $$2));
   }

   private void e(dgv $$0) {
      alb $$1 = ok.a.create($$0, this.c);
      alb $$2 = ok.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dgv $$0) {
      alb $$1 = ok.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dgv $$0) {
      this.b.accept(nx.a($$0).a(ny.a(duq.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         alb $$3 = oi.a($$0, $$2);
         return oa.a().a(ob.c, oh.c.a($$0, $$2, new oi().a(oj.a, $$3), this.c));
      })));
      this.a($$0, oi.a($$0, "_0"));
   }

   static nu b(dgv $$0, alb $$1, alb $$2) {
      return nx.a($$0)
         .a(ny.a(duq.w).a(false, oa.a().a(ob.c, $$1)).a(true, oa.a().a(ob.c, $$2)))
         .a(
            ny.a(duq.U, duq.R)
               .a(dul.a, jj.f, oa.a().a(ob.b, ob.a.b))
               .a(dul.a, jj.e, oa.a().a(ob.b, ob.a.d))
               .a(dul.a, jj.d, oa.a().a(ob.b, ob.a.c))
               .a(dul.a, jj.c, oa.a())
               .a(dul.b, jj.f, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dul.b, jj.e, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dul.b, jj.d, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dul.b, jj.c, oa.a().a(ob.a, ob.a.b).a(ob.d, true))
               .a(dul.c, jj.f, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.c))
               .a(dul.c, jj.e, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.c))
               .a(dul.c, jj.d, oa.a().a(ob.a, ob.a.c))
               .a(dul.c, jj.c, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.c))
         );
   }

   private static ny.d<jj, duw, duv, Boolean> a(ny.d<jj, duw, duv, Boolean> $$0, duw $$1, alb $$2, alb $$3, alb $$4, alb $$5) {
      return $$0.a(jj.f, $$1, duv.a, false, oa.a().a(ob.c, $$2))
         .a(jj.d, $$1, duv.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
         .a(jj.e, $$1, duv.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
         .a(jj.c, $$1, duv.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
         .a(jj.f, $$1, duv.b, false, oa.a().a(ob.c, $$4))
         .a(jj.d, $$1, duv.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
         .a(jj.e, $$1, duv.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
         .a(jj.c, $$1, duv.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         .a(jj.f, $$1, duv.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
         .a(jj.d, $$1, duv.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
         .a(jj.e, $$1, duv.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         .a(jj.c, $$1, duv.a, true, oa.a().a(ob.c, $$3))
         .a(jj.f, $$1, duv.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.d))
         .a(jj.d, $$1, duv.b, true, oa.a().a(ob.c, $$5))
         .a(jj.e, $$1, duv.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         .a(jj.c, $$1, duv.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.c));
   }

   private static nu a(dgv $$0, alb $$1, alb $$2, alb $$3, alb $$4, alb $$5, alb $$6, alb $$7, alb $$8) {
      return nx.a($$0).a(a(a(ny.a(duq.R, duq.ae, duq.be, duq.u), duw.b, $$1, $$2, $$3, $$4), duw.a, $$5, $$6, $$7, $$8));
   }

   static nu a(dgv $$0, alb $$1, alb $$2, alb $$3, alb $$4, alb $$5) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(duq.L, true), oa.a().a(ob.c, $$2).a(ob.d, false))
         .a(nv.a().a(duq.M, true), oa.a().a(ob.c, $$3).a(ob.d, false))
         .a(nv.a().a(duq.N, true), oa.a().a(ob.c, $$4).a(ob.d, false))
         .a(nv.a().a(duq.O, true), oa.a().a(ob.c, $$5).a(ob.d, false));
   }

   static nu c(dgv $$0, alb $$1, alb $$2) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(duq.L, true), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(duq.M, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(duq.N, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(duq.O, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dgv $$0, alb $$1, alb $$2, alb $$3) {
      return nw.a($$0)
         .a(nv.a().a(duq.J, true), oa.a().a(ob.c, $$1))
         .a(nv.a().a(duq.X, dvm.b), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(duq.W, dvm.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(duq.Y, dvm.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(duq.Z, dvm.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
         .a(nv.a().a(duq.X, dvm.c), oa.a().a(ob.c, $$3).a(ob.d, true))
         .a(nv.a().a(duq.W, dvm.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(duq.Y, dvm.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(duq.Z, dvm.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dgv $$0, alb $$1, alb $$2, alb $$3, alb $$4, boolean $$5) {
      return nx.a($$0, oa.a().a(ob.d, $$5))
         .a(c())
         .a(
            ny.a(duq.q, duq.u)
               .a(false, false, oa.a().a(ob.c, $$2))
               .a(true, false, oa.a().a(ob.c, $$4))
               .a(false, true, oa.a().a(ob.c, $$1))
               .a(true, true, oa.a().a(ob.c, $$3))
         );
   }

   static nu b(dgv $$0, alb $$1, alb $$2, alb $$3) {
      return nx.a($$0)
         .a(
            ny.a(duq.R, duq.af, duq.bi)
               .a(jj.f, duz.b, dvj.a, oa.a().a(ob.c, $$2))
               .a(jj.e, duz.b, dvj.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, duz.b, dvj.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, duz.b, dvj.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, duz.b, dvj.e, oa.a().a(ob.c, $$3))
               .a(jj.e, duz.b, dvj.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, duz.b, dvj.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, duz.b, dvj.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, duz.b, dvj.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.e, duz.b, dvj.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.d, duz.b, dvj.d, oa.a().a(ob.c, $$3))
               .a(jj.c, duz.b, dvj.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.f, duz.b, dvj.c, oa.a().a(ob.c, $$1))
               .a(jj.e, duz.b, dvj.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, duz.b, dvj.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, duz.b, dvj.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, duz.b, dvj.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.e, duz.b, dvj.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.d, duz.b, dvj.b, oa.a().a(ob.c, $$1))
               .a(jj.c, duz.b, dvj.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.f, duz.a, dvj.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.e, duz.a, dvj.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, duz.a, dvj.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, duz.a, dvj.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, duz.a, dvj.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.e, duz.a, dvj.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.d, duz.a, dvj.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.c, duz.a, dvj.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.f, duz.a, dvj.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.e, duz.a, dvj.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, duz.a, dvj.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, duz.a, dvj.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.f, duz.a, dvj.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.e, duz.a, dvj.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(jj.d, duz.a, dvj.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.c, duz.a, dvj.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.f, duz.a, dvj.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(jj.e, duz.a, dvj.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(jj.d, duz.a, dvj.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(jj.c, duz.a, dvj.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
         );
   }

   private static nu c(dgv $$0, alb $$1, alb $$2, alb $$3) {
      return nx.a($$0)
         .a(
            ny.a(duq.R, duq.af, duq.u)
               .a(jj.c, duz.b, false, oa.a().a(ob.c, $$2))
               .a(jj.d, duz.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(jj.f, duz.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(jj.e, duz.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(jj.c, duz.a, false, oa.a().a(ob.c, $$1))
               .a(jj.d, duz.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(jj.f, duz.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(jj.e, duz.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(jj.c, duz.b, true, oa.a().a(ob.c, $$3))
               .a(jj.d, duz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(jj.f, duz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(jj.e, duz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(jj.c, duz.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c))
               .a(jj.d, duz.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.a))
               .a(jj.f, duz.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               .a(jj.e, duz.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b))
         );
   }

   private static nu d(dgv $$0, alb $$1, alb $$2, alb $$3) {
      return nx.a($$0)
         .a(
            ny.a(duq.R, duq.af, duq.u)
               .a(jj.c, duz.b, false, oa.a().a(ob.c, $$2))
               .a(jj.d, duz.b, false, oa.a().a(ob.c, $$2))
               .a(jj.f, duz.b, false, oa.a().a(ob.c, $$2))
               .a(jj.e, duz.b, false, oa.a().a(ob.c, $$2))
               .a(jj.c, duz.a, false, oa.a().a(ob.c, $$1))
               .a(jj.d, duz.a, false, oa.a().a(ob.c, $$1))
               .a(jj.f, duz.a, false, oa.a().a(ob.c, $$1))
               .a(jj.e, duz.a, false, oa.a().a(ob.c, $$1))
               .a(jj.c, duz.b, true, oa.a().a(ob.c, $$3))
               .a(jj.d, duz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(jj.f, duz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(jj.e, duz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(jj.c, duz.a, true, oa.a().a(ob.c, $$3))
               .a(jj.d, duz.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(jj.f, duz.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(jj.e, duz.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         );
   }

   static nx c(dgv $$0, alb $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1));
   }

   private static ny f() {
      return ny.a(duq.I).a(jj.a.b, oa.a()).a(jj.a.c, oa.a().a(ob.a, ob.a.b)).a(jj.a.a, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   static nu a(dgv $$0, oi $$1, BiConsumer<alb, Supplier<JsonElement>> $$2) {
      alb $$3 = oh.g.a($$0, $$1, $$2);
      alb $$4 = oh.h.a($$0, $$1, $$2);
      alb $$5 = oh.i.a($$0, $$1, $$2);
      alb $$6 = oh.j.a($$0, $$1, $$2);
      return nx.a($$0, oa.a().a(ob.c, $$6)).a(ny.a(duq.I).a(jj.a.a, oa.a().a(ob.c, $$3)).a(jj.a.b, oa.a().a(ob.c, $$4)).a(jj.a.c, oa.a().a(ob.c, $$5)));
   }

   static nu d(dgv $$0, alb $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1)).a(f());
   }

   private void e(dgv $$0, alb $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dgv $$0, ok.a $$1) {
      alb $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dgv $$0, ok.a $$1) {
      alb $$2 = $$1.create($$0, this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   static nu d(dgv $$0, alb $$1, alb $$2) {
      return nx.a($$0)
         .a(
            ny.a(duq.I)
               .a(jj.a.b, oa.a().a(ob.c, $$1))
               .a(jj.a.c, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b))
               .a(jj.a.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.b, ob.a.b))
         );
   }

   private void a(dgv $$0, ok.a $$1, ok.a $$2) {
      alb $$3 = $$1.create($$0, this.c);
      alb $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private alb a(dgv $$0, String $$1, og $$2, Function<alb, oi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oi.a($$0, $$1)), this.c);
   }

   static nu e(dgv $$0, alb $$1, alb $$2) {
      return nx.a($$0).a(a(duq.w, $$2, $$1));
   }

   static nu e(dgv $$0, alb $$1, alb $$2, alb $$3) {
      return nx.a($$0).a(ny.a(duq.bh).a(dvi.b, oa.a().a(ob.c, $$1)).a(dvi.a, oa.a().a(ob.c, $$2)).a(dvi.c, oa.a().a(ob.c, $$3)));
   }

   public void a(dgv $$0) {
      this.b($$0, ok.a);
   }

   public void b(dgv $$0, ok.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dgv $$0, oi $$1, og $$2) {
      alb $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nr.b h(dgv $$0) {
      ok $$1 = this.g.getOrDefault($$0, ok.a.get($$0));
      return new nr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dgv $$0, dgv $$1, dgv $$2) {
      oi $$3 = oi.u($$0);
      alb $$4 = oh.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dgv $$0) {
      oi $$1 = oi.t($$0);
      alb $$2 = oh.v.a($$0, $$1, this.c);
      alb $$3 = oh.w.a($$0, $$1, this.c);
      alb $$4 = oh.x.a($$0, $$1, this.c);
      alb $$5 = oh.y.a($$0, $$1, this.c);
      alb $$6 = oh.z.a($$0, $$1, this.c);
      alb $$7 = oh.A.a($$0, $$1, this.c);
      alb $$8 = oh.B.a($$0, $$1, this.c);
      alb $$9 = oh.C.a($$0, $$1, this.c);
      this.a($$0.r());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dgv $$0, dgv $$1) {
      alb $$2 = oh.v.a($$0);
      alb $$3 = oh.w.a($$0);
      alb $$4 = oh.x.a($$0);
      alb $$5 = oh.y.a($$0);
      alb $$6 = oh.z.a($$0);
      alb $$7 = oh.A.a($$0);
      alb $$8 = oh.B.a($$0);
      alb $$9 = oh.C.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dgv $$0) {
      oi $$1 = oi.b($$0);
      alb $$2 = oh.ak.a($$0, $$1, this.c);
      alb $$3 = oh.al.a($$0, $$1, this.c);
      alb $$4 = oh.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dgv $$0) {
      oi $$1 = oi.b($$0);
      alb $$2 = oh.ah.a($$0, $$1, this.c);
      alb $$3 = oh.ai.a($$0, $$1, this.c);
      alb $$4 = oh.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dgv $$0, dgv $$1) {
      alb $$2 = oh.ah.a($$0);
      alb $$3 = oh.ai.a($$0);
      alb $$4 = oh.aj.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dgx.sD);
      alb $$0 = of.a(dgx.sD);
      alb $$1 = of.a(dgx.sD, "_partial_tilt");
      alb $$2 = of.a(dgx.sD, "_full_tilt");
      this.b
         .accept(
            nx.a(dgx.sD)
               .a(b())
               .a(ny.a(duq.bl).a(dvl.a, oa.a().a(ob.c, $$0)).a(dvl.b, oa.a().a(ob.c, $$0)).a(dvl.c, oa.a().a(ob.c, $$1)).a(dvl.d, oa.a().a(ob.c, $$2)))
         );
   }

   private nr.f l(dgv $$0) {
      return new nr.f(oi.n($$0));
   }

   private void m(dgv $$0) {
      this.c($$0, $$0);
   }

   private void c(dgv $$0, dgv $$1) {
      this.b.accept(c($$0, of.a($$1)));
   }

   private void a(dgv $$0, nr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dgv $$0, nr.e $$1, oi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dgv $$0, nr.e $$1) {
      oi $$2 = oi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dgv $$0, nr.e $$1, oi $$2) {
      alb $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dgv $$0, nr.e $$1, dvd<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         ny $$4 = ny.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            oi $$5 = oi.c(oi.a($$0, $$4x));
            alb $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return oa.a().a(ob.c, $$6);
         });
         this.a($$0.r());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void a(dgv $$0, dgv $$1, nr.e $$2) {
      this.a($$0, $$2);
      oi $$3 = oi.d($$0);
      alb $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dgv $$0, dgv $$1) {
      ok $$2 = ok.p.get($$0);
      alb $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alb $$4 = oh.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dgv $$0, dgv $$1) {
      this.a($$0.r());
      oi $$2 = oi.h($$0);
      oi $$3 = oi.a($$0, $$1);
      alb $$4 = oh.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nx.a($$1, oa.a().a(ob.c, $$4))
               .a(ny.a(duq.R).a(jj.e, oa.a()).a(jj.d, oa.a().a(ob.b, ob.a.d)).a(jj.c, oa.a().a(ob.b, ob.a.b)).a(jj.f, oa.a().a(ob.b, ob.a.c)))
         );
      this.b.accept(nx.a($$0).a(ny.a(duq.av).a($$2x -> oa.a().a(ob.c, oh.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dgv $$0 = dgx.kC;
      this.a($$0.r());
      alb $$1 = of.a($$0, "_top");
      alb $$2 = of.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dgv $$0 = dgx.kB;
      this.a($$0.r());
      ny $$1 = ny.a(dmk.d, duq.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oa.a().a(ob.c, of.a($$0, "_top_stage_" + $$1x));
            case b -> oa.a().a(ob.c, of.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nx.a($$0).a($$1));
   }

   private void a(dgv $$0, dgv $$1, dgv $$2, dgv $$3, dgv $$4, dgv $$5, dgv $$6, dgv $$7) {
      this.a($$0, nr.e.b);
      this.a($$1, nr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dgv $$0, nr.e $$1) {
      this.a($$0, "_top");
      alb $$2 = this.a($$0, "_top", $$1.a(), oi::c);
      alb $$3 = this.a($$0, "_bottom", $$1.a(), oi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dgx.iD, "_front");
      alb $$0 = of.a(dgx.iD, "_top");
      alb $$1 = this.a(dgx.iD, "_bottom", nr.e.b.a(), oi::c);
      this.f(dgx.iD, $$0, $$1);
   }

   private void k() {
      alb $$0 = this.a(dgx.bx, "_top", oh.bm, oi::a);
      alb $$1 = this.a(dgx.bx, "_bottom", oh.bm, oi::a);
      this.f(dgx.bx, $$0, $$1);
   }

   private void l() {
      this.c(dgx.sF);
      alb $$0 = of.a(dgx.sF, "_top");
      alb $$1 = of.a(dgx.sF, "_bottom");
      this.b.accept(nx.a(dgx.sF).a(b()).a(ny.a(duq.ae).a(duw.b, oa.a().a(ob.c, $$1)).a(duw.a, oa.a().a(ob.c, $$0))));
   }

   private void f(dgv $$0, alb $$1, alb $$2) {
      this.b.accept(nx.a($$0).a(ny.a(duq.ae).a(duw.b, oa.a().a(ob.c, $$2)).a(duw.a, oa.a().a(ob.c, $$1))));
   }

   private void n(dgv $$0) {
      oi $$1 = oi.e($$0);
      oi $$2 = oi.e(oi.a($$0, "_corner"));
      alb $$3 = oh.as.a($$0, $$1, this.c);
      alb $$4 = oh.at.a($$0, $$2, this.c);
      alb $$5 = oh.au.a($$0, $$1, this.c);
      alb $$6 = oh.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(duq.ag)
                     .a(dve.a, oa.a().a(ob.c, $$3))
                     .a(dve.b, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(dve.c, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
                     .a(dve.d, oa.a().a(ob.c, $$6).a(ob.b, ob.a.b))
                     .a(dve.e, oa.a().a(ob.c, $$5))
                     .a(dve.f, oa.a().a(ob.c, $$6))
                     .a(dve.g, oa.a().a(ob.c, $$4))
                     .a(dve.h, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
                     .a(dve.i, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
                     .a(dve.j, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
               )
         );
   }

   private void o(dgv $$0) {
      alb $$1 = this.a($$0, "", oh.as, oi::e);
      alb $$2 = this.a($$0, "", oh.au, oi::e);
      alb $$3 = this.a($$0, "", oh.av, oi::e);
      alb $$4 = this.a($$0, "_on", oh.as, oi::e);
      alb $$5 = this.a($$0, "_on", oh.au, oi::e);
      alb $$6 = this.a($$0, "_on", oh.av, oi::e);
      ny $$7 = ny.a(duq.w, duq.ah).a(($$6x, $$7x) -> {
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

   private nr.a a(alb $$0, dgv $$1) {
      return new nr.a($$0, $$1);
   }

   private nr.a f(dgv $$0, dgv $$1) {
      return new nr.a(of.a($$0), $$1);
   }

   private void a(dgv $$0, cvg $$1) {
      alb $$2 = oh.aa.a($$0, oi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dgv $$0, alb $$1) {
      alb $$2 = oh.aa.a($$0, oi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dgv $$0, dgv $$1) {
      this.a($$0);
      alb $$2 = ok.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dgv $$0) {
      this.a($$0.r());
      alb $$1 = ok.k.create($$0, this.c);
      alb $$2 = ok.l.create($$0, this.c);
      alb $$3 = ok.m.create($$0, this.c);
      alb $$4 = ok.n.create($$0, this.c);
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(duq.S, 1, 2, 3, 4).a(duq.R, jj.c), oa.a().a(ob.c, $$1))
               .a(nv.a().a(duq.S, 1, 2, 3, 4).a(duq.R, jj.f), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.S, 1, 2, 3, 4).a(duq.R, jj.d), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(nv.a().a(duq.S, 1, 2, 3, 4).a(duq.R, jj.e), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(nv.a().a(duq.S, 2, 3, 4).a(duq.R, jj.c), oa.a().a(ob.c, $$2))
               .a(nv.a().a(duq.S, 2, 3, 4).a(duq.R, jj.f), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.S, 2, 3, 4).a(duq.R, jj.d), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(nv.a().a(duq.S, 2, 3, 4).a(duq.R, jj.e), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(nv.a().a(duq.S, 3, 4).a(duq.R, jj.c), oa.a().a(ob.c, $$3))
               .a(nv.a().a(duq.S, 3, 4).a(duq.R, jj.f), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.S, 3, 4).a(duq.R, jj.d), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(nv.a().a(duq.S, 3, 4).a(duq.R, jj.e), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(nv.a().a(duq.S, 4).a(duq.R, jj.c), oa.a().a(ob.c, $$4))
               .a(nv.a().a(duq.S, 4).a(duq.R, jj.f), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.S, 4).a(duq.R, jj.d), oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
               .a(nv.a().a(duq.S, 4).a(duq.R, jj.e), oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         );
   }

   private void a(ok.a $$0, dgv... $$1) {
      for (dgv $$2 : $$1) {
         alb $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ok.a $$0, dgv... $$1) {
      for (dgv $$2 : $$1) {
         alb $$3 = $$0.create($$2, this.c);
         this.b.accept(nx.a($$2, oa.a().a(ob.c, $$3)).a(c()));
      }
   }

   private void h(dgv $$0, dgv $$1) {
      this.a($$0);
      oi $$2 = oi.b($$0, $$1);
      alb $$3 = oh.aI.a($$1, $$2, this.c);
      alb $$4 = oh.aJ.a($$1, $$2, this.c);
      alb $$5 = oh.aK.a($$1, $$2, this.c);
      alb $$6 = oh.aG.a($$1, $$2, this.c);
      alb $$7 = oh.aH.a($$1, $$2, this.c);
      cvg $$8 = $$1.r();
      oh.bz.a(of.a($$8), oi.F($$0), this.c);
      this.b
         .accept(
            nw.a($$1)
               .a(oa.a().a(ob.c, $$3))
               .a(nv.a().a(duq.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(duq.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(duq.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.L, false), oa.a().a(ob.c, $$6))
               .a(nv.a().a(duq.M, false), oa.a().a(ob.c, $$7))
               .a(nv.a().a(duq.N, false), oa.a().a(ob.c, $$7).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.O, false), oa.a().a(ob.c, $$6).a(ob.b, ob.a.d))
         );
   }

   private void q(dgv $$0) {
      oi $$1 = oi.z($$0);
      alb $$2 = oh.aL.a($$0, $$1, this.c);
      alb $$3 = this.a($$0, "_conditional", oh.aL, $$1x -> $$1.c(oj.i, $$1x));
      this.b.accept(nx.a($$0).a(a(duq.c, $$3, $$2)).a(e()));
   }

   private void r(dgv $$0) {
      alb $$1 = ok.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oa> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oa.a().a(ob.c, of.a(dgx.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dgx.mZ);
      this.b
         .accept(
            nw.a(dgx.mZ)
               .a(nv.a().a(duq.aq, 0), this.a(0))
               .a(nv.a().a(duq.aq, 1), this.a(1))
               .a(nv.a().a(duq.bk, dum.b), oa.a().a(ob.c, of.a(dgx.mZ, "_small_leaves")))
               .a(nv.a().a(duq.bk, dum.c), oa.a().a(ob.c, of.a(dgx.mZ, "_large_leaves")))
         );
   }

   private ny n() {
      return ny.a(duq.P)
         .a(jj.a, oa.a().a(ob.a, ob.a.c))
         .a(jj.b, oa.a())
         .a(jj.c, oa.a().a(ob.a, ob.a.b))
         .a(jj.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
         .a(jj.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
         .a(jj.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   private void o() {
      alb $$0 = oi.a(dgx.nU, "_top_open");
      this.b
         .accept(
            nx.a(dgx.nU)
               .a(this.n())
               .a(
                  ny.a(duq.u)
                     .a(false, oa.a().a(ob.c, ok.f.create(dgx.nU, this.c)))
                     .a(true, oa.a().a(ob.c, ok.f.get(dgx.nU).a($$1 -> $$1.a(oj.f, $$0)).a(dgx.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ny a(dvd<T> $$0, T $$1, alb $$2, alb $$3) {
      oa $$4 = oa.a().a(ob.c, $$2);
      oa $$5 = oa.a().a(ob.c, $$3);
      return ny.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dgv $$0, Function<dgv, oi> $$1) {
      oi $$2 = $$1.apply($$0).b(oj.i, oj.c);
      oi $$3 = $$2.c(oj.g, oi.a($$0, "_front_honey"));
      alb $$4 = oh.q.a($$0, $$2, this.c);
      alb $$5 = oh.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nx.a($$0).a(b()).a(a(duq.aN, 5, $$5, $$4)));
   }

   private void a(dgv $$0, dvd<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alb> $$3 = new Int2ObjectOpenHashMap();
         ny $$4 = ny.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alb $$5 = (alb)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, oh.aV, oi::g));
            return oa.a().a(ob.c, $$5);
         });
         this.a($$0.r());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void p() {
      alb $$0 = of.a(dgx.od, "_floor");
      alb $$1 = of.a(dgx.od, "_ceiling");
      alb $$2 = of.a(dgx.od, "_wall");
      alb $$3 = of.a(dgx.od, "_between_walls");
      this.a(cvo.wu);
      this.b
         .accept(
            nx.a(dgx.od)
               .a(
                  ny.a(duq.R, duq.V)
                     .a(jj.c, duo.a, oa.a().a(ob.c, $$0))
                     .a(jj.d, duo.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.c))
                     .a(jj.f, duo.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.b))
                     .a(jj.e, duo.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.d))
                     .a(jj.c, duo.b, oa.a().a(ob.c, $$1))
                     .a(jj.d, duo.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(jj.f, duo.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(jj.e, duo.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
                     .a(jj.c, duo.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
                     .a(jj.d, duo.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
                     .a(jj.f, duo.c, oa.a().a(ob.c, $$2))
                     .a(jj.e, duo.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
                     .a(jj.d, duo.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(jj.c, duo.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
                     .a(jj.f, duo.d, oa.a().a(ob.c, $$3))
                     .a(jj.e, duo.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nx.a(dgx.nZ, oa.a().a(ob.c, of.a(dgx.nZ)))
               .a(
                  ny.a(duq.U, duq.R)
                     .a(dul.a, jj.c, oa.a())
                     .a(dul.a, jj.f, oa.a().a(ob.b, ob.a.b))
                     .a(dul.a, jj.d, oa.a().a(ob.b, ob.a.c))
                     .a(dul.a, jj.e, oa.a().a(ob.b, ob.a.d))
                     .a(dul.b, jj.c, oa.a().a(ob.a, ob.a.b))
                     .a(dul.b, jj.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dul.b, jj.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dul.b, jj.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
                     .a(dul.c, jj.d, oa.a().a(ob.a, ob.a.c))
                     .a(dul.c, jj.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dul.c, jj.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dul.c, jj.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               )
         );
   }

   private void d(dgv $$0, ok.a $$1) {
      alb $$2 = $$1.create($$0, this.c);
      alb $$3 = oi.a($$0, "_front_on");
      alb $$4 = $$1.get($$0).a($$1x -> $$1x.a(oj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nx.a($$0).a(a(duq.r, $$4, $$2)).a(b()));
   }

   private void a(dgv... $$0) {
      alb $$1 = of.a("campfire_off");

      for (dgv $$2 : $$0) {
         alb $$3 = oh.bc.a($$2, oi.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nx.a($$2).a(a(duq.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dgv $$0) {
      alb $$1 = oh.bv.a($$0, oi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dgv $$0) {
      alb $$1;
      if ($$0 == dgx.tj) {
         $$1 = oh.bx.a($$0, oi.m($$0), this.c);
      } else {
         $$1 = oh.bw.a($$0, oi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oi $$0 = oi.a(oi.G(dgx.cl), oi.G(dgx.n));
      alb $$1 = oh.j.a(dgx.cl, $$0, this.c);
      this.b.accept(c(dgx.cl, $$1));
   }

   private void s() {
      this.a(cvo.lH);
      this.b
         .accept(
            nw.a(dgx.cw)
               .a(
                  nv.b(
                     nv.a().a(duq.ab, dvf.c).a(duq.aa, dvf.c).a(duq.ac, dvf.c).a(duq.ad, dvf.c),
                     nv.a().a(duq.ab, dvf.b, dvf.a).a(duq.aa, dvf.b, dvf.a),
                     nv.a().a(duq.aa, dvf.b, dvf.a).a(duq.ac, dvf.b, dvf.a),
                     nv.a().a(duq.ac, dvf.b, dvf.a).a(duq.ad, dvf.b, dvf.a),
                     nv.a().a(duq.ad, dvf.b, dvf.a).a(duq.ab, dvf.b, dvf.a)
                  ),
                  oa.a().a(ob.c, of.a("redstone_dust_dot"))
               )
               .a(nv.a().a(duq.ab, dvf.b, dvf.a), oa.a().a(ob.c, of.a("redstone_dust_side0")))
               .a(nv.a().a(duq.ac, dvf.b, dvf.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt0")))
               .a(nv.a().a(duq.aa, dvf.b, dvf.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt1")).a(ob.b, ob.a.d))
               .a(nv.a().a(duq.ad, dvf.b, dvf.a), oa.a().a(ob.c, of.a("redstone_dust_side1")).a(ob.b, ob.a.d))
               .a(nv.a().a(duq.ab, dvf.a), oa.a().a(ob.c, of.a("redstone_dust_up")))
               .a(nv.a().a(duq.aa, dvf.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.ac, dvf.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.c))
               .a(nv.a().a(duq.ad, dvf.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.d))
         );
   }

   private void t() {
      this.a(cvo.lL);
      this.b
         .accept(
            nx.a(dgx.gY)
               .a(c())
               .a(
                  ny.a(duq.bd, duq.w)
                     .a(dut.a, false, oa.a().a(ob.c, of.a(dgx.gY)))
                     .a(dut.a, true, oa.a().a(ob.c, of.a(dgx.gY, "_on")))
                     .a(dut.b, false, oa.a().a(ob.c, of.a(dgx.gY, "_subtract")))
                     .a(dut.b, true, oa.a().a(ob.c, of.a(dgx.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oi $$0 = oi.a(dgx.jR);
      oi $$1 = oi.a(oi.a(dgx.jE, "_side"), $$0.a(oj.f));
      alb $$2 = oh.ab.a(dgx.jE, $$1, this.c);
      alb $$3 = oh.ac.a(dgx.jE, $$1, this.c);
      alb $$4 = oh.j.b(dgx.jE, "_double", $$1, this.c);
      this.b.accept(e(dgx.jE, $$2, $$3, $$4));
      this.b.accept(c(dgx.jR, oh.c.a(dgx.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cvo.sr);
      this.b
         .accept(
            nw.a(dgx.fs)
               .a(oa.a().a(ob.c, oi.G(dgx.fs)))
               .a(nv.a().a(duq.k, true), oa.a().a(ob.c, oi.a(dgx.fs, "_bottle0")))
               .a(nv.a().a(duq.l, true), oa.a().a(ob.c, oi.a(dgx.fs, "_bottle1")))
               .a(nv.a().a(duq.m, true), oa.a().a(ob.c, oi.a(dgx.fs, "_bottle2")))
               .a(nv.a().a(duq.k, false), oa.a().a(ob.c, oi.a(dgx.fs, "_empty0")))
               .a(nv.a().a(duq.l, false), oa.a().a(ob.c, oi.a(dgx.fs, "_empty1")))
               .a(nv.a().a(duq.m, false), oa.a().a(ob.c, oi.a(dgx.fs, "_empty2")))
         );
   }

   private void u(dgv $$0) {
      alb $$1 = oh.br.a($$0, oi.b($$0), this.c);
      alb $$2 = of.a("mushroom_block_inside");
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(duq.L, true), oa.a().a(ob.c, $$1))
               .a(nv.a().a(duq.M, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(duq.N, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(duq.O, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(duq.J, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(duq.K, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(duq.L, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(duq.M, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, false))
               .a(nv.a().a(duq.N, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, false))
               .a(nv.a().a(duq.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, false))
               .a(nv.a().a(duq.J, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, false))
               .a(nv.a().a(duq.K, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, false))
         );
      this.a($$0, ok.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cvo.rC);
      this.b
         .accept(
            nx.a(dgx.eg)
               .a(
                  ny.a(duq.ay)
                     .a(0, oa.a().a(ob.c, of.a(dgx.eg)))
                     .a(1, oa.a().a(ob.c, of.a(dgx.eg, "_slice1")))
                     .a(2, oa.a().a(ob.c, of.a(dgx.eg, "_slice2")))
                     .a(3, oa.a().a(ob.c, of.a(dgx.eg, "_slice3")))
                     .a(4, oa.a().a(ob.c, of.a(dgx.eg, "_slice4")))
                     .a(5, oa.a().a(ob.c, of.a(dgx.eg, "_slice5")))
                     .a(6, oa.a().a(ob.c, of.a(dgx.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dgx.nX, "_side3"))
         .a(oj.o, oi.G(dgx.t))
         .a(oj.n, oi.a(dgx.nX, "_top"))
         .a(oj.j, oi.a(dgx.nX, "_side3"))
         .a(oj.l, oi.a(dgx.nX, "_side3"))
         .a(oj.k, oi.a(dgx.nX, "_side1"))
         .a(oj.m, oi.a(dgx.nX, "_side2"));
      this.b.accept(c(dgx.nX, oh.a.a(dgx.nX, $$0, this.c)));
   }

   private void y() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dgx.ob, "_front"))
         .a(oj.o, oi.a(dgx.ob, "_bottom"))
         .a(oj.n, oi.a(dgx.ob, "_top"))
         .a(oj.j, oi.a(dgx.ob, "_front"))
         .a(oj.k, oi.a(dgx.ob, "_front"))
         .a(oj.l, oi.a(dgx.ob, "_side"))
         .a(oj.m, oi.a(dgx.ob, "_side"));
      this.b.accept(c(dgx.ob, oh.a.a(dgx.ob, $$0, this.c)));
   }

   private void a(dgv $$0, dgv $$1, BiFunction<dgv, dgv, oi> $$2) {
      oi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oh.a.a($$0, $$3, this.c)));
   }

   public void b(dgv $$0) {
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
      oi $$0 = oi.k(dgx.eZ);
      this.b.accept(c(dgx.eZ, of.a(dgx.eZ)));
      this.a(dgx.ee, $$0);
      this.a(dgx.ef, $$0);
   }

   private void a(dgv $$0, oi $$1) {
      alb $$2 = oh.p.a($$0, $$1.c(oj.g, oi.G($$0)), this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cvo.ss);
      this.m(dgx.ft);
      this.b.accept(c(dgx.fv, oh.bu.a(dgx.fv, oi.j(oi.a(dgx.H, "_still")), this.c)));
      this.b
         .accept(
            nx.a(dgx.fu)
               .a(
                  ny.a(dle.g)
                     .a(1, oa.a().a(ob.c, oh.bs.a(dgx.fu, "_level1", oi.j(oi.a(dgx.G, "_still")), this.c)))
                     .a(2, oa.a().a(ob.c, oh.bt.a(dgx.fu, "_level2", oi.j(oi.a(dgx.G, "_still")), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bu.a(dgx.fu, "_full", oi.j(oi.a(dgx.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nx.a(dgx.fw)
               .a(
                  ny.a(dle.g)
                     .a(1, oa.a().a(ob.c, oh.bs.a(dgx.fw, "_level1", oi.j(oi.G(dgx.qP)), this.c)))
                     .a(2, oa.a().a(ob.c, oh.bt.a(dgx.fw, "_level2", oi.j(oi.G(dgx.qP)), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bu.a(dgx.fw, "_full", oi.j(oi.G(dgx.qP)), this.c)))
               )
         );
   }

   private void B() {
      oi $$0 = oi.b(dgx.kv);
      alb $$1 = oh.aE.a(dgx.kv, $$0, this.c);
      alb $$2 = this.a(dgx.kv, "_dead", oh.aE, $$1x -> $$0.c(oj.b, $$1x));
      this.b.accept(nx.a(dgx.kv).a(a(duq.au, 5, $$2, $$1)));
   }

   private void C() {
      alb $$0 = of.a(dgx.tq);
      alb $$1 = of.a(dgx.tq, "_triggered");
      alb $$2 = of.a(dgx.tq, "_crafting");
      alb $$3 = of.a(dgx.tq, "_crafting_triggered");
      this.b
         .accept(
            nx.a(dgx.tq)
               .a(ny.a(duq.T).a($$0x -> this.a($$0x, oa.a())))
               .a(
                  ny.a(duq.A, dio.b)
                     .a(false, false, oa.a().a(ob.c, $$0))
                     .a(true, true, oa.a().a(ob.c, $$3))
                     .a(true, false, oa.a().a(ob.c, $$1))
                     .a(false, true, oa.a().a(ob.c, $$2))
               )
         );
   }

   private void v(dgv $$0) {
      oi $$1 = new oi().a(oj.f, oi.a(dgx.cD, "_top")).a(oj.i, oi.a(dgx.cD, "_side")).a(oj.g, oi.a($$0, "_front"));
      oi $$2 = new oi().a(oj.i, oi.a(dgx.cD, "_top")).a(oj.g, oi.a($$0, "_front_vertical"));
      alb $$3 = oh.p.a($$0, $$1, this.c);
      alb $$4 = oh.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(duq.P)
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
      alb $$0 = of.a(dgx.fy);
      alb $$1 = of.a(dgx.fy, "_filled");
      this.b.accept(nx.a(dgx.fy).a(ny.a(duq.h).a(false, oa.a().a(ob.c, $$0)).a(true, oa.a().a(ob.c, $$1))).a(c()));
   }

   private void E() {
      alb $$0 = of.a(dgx.ku, "_side");
      alb $$1 = of.a(dgx.ku, "_noside");
      alb $$2 = of.a(dgx.ku, "_noside1");
      alb $$3 = of.a(dgx.ku, "_noside2");
      alb $$4 = of.a(dgx.ku, "_noside3");
      this.b
         .accept(
            nw.a(dgx.ku)
               .a(nv.a().a(duq.L, true), oa.a().a(ob.c, $$0))
               .a(nv.a().a(duq.M, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(duq.N, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(duq.O, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(duq.J, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(duq.K, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(duq.L, false), oa.a().a(ob.c, $$1).a(ob.e, 2), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$3), oa.a().a(ob.c, $$4))
               .a(
                  nv.a().a(duq.M, false),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.b).a(ob.d, true)
               )
               .a(
                  nv.a().a(duq.N, false),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true)
               )
               .a(
                  nv.a().a(duq.O, false),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(duq.J, false),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(duq.K, false),
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
            nw.a(dgx.pc)
               .a(oa.a().a(ob.c, oi.G(dgx.pc)))
               .a(nv.a().a(duq.aL, 1), oa.a().a(ob.c, oi.a(dgx.pc, "_contents1")))
               .a(nv.a().a(duq.aL, 2), oa.a().a(ob.c, oi.a(dgx.pc, "_contents2")))
               .a(nv.a().a(duq.aL, 3), oa.a().a(ob.c, oi.a(dgx.pc, "_contents3")))
               .a(nv.a().a(duq.aL, 4), oa.a().a(ob.c, oi.a(dgx.pc, "_contents4")))
               .a(nv.a().a(duq.aL, 5), oa.a().a(ob.c, oi.a(dgx.pc, "_contents5")))
               .a(nv.a().a(duq.aL, 6), oa.a().a(ob.c, oi.a(dgx.pc, "_contents6")))
               .a(nv.a().a(duq.aL, 7), oa.a().a(ob.c, oi.a(dgx.pc, "_contents7")))
               .a(nv.a().a(duq.aL, 8), oa.a().a(ob.c, oi.a(dgx.pc, "_contents_ready")))
         );
   }

   private void w(dgv $$0) {
      alb $$1 = oh.c.a($$0, oi.a($$0), this.c);
      alb $$2 = this.a($$0, "_powered", oh.c, oi::b);
      alb $$3 = this.a($$0, "_lit", oh.c, oi::b);
      alb $$4 = this.a($$0, "_lit_powered", oh.c, oi::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nu a(dgv $$0, alb $$1, alb $$2, alb $$3, alb $$4) {
      return nx.a($$0).a(ny.a(duq.r, duq.w).a(($$4x, $$5) -> $$4x ? oa.a().a(ob.c, $$5 ? $$4 : $$2) : oa.a().a(ob.c, $$5 ? $$3 : $$1)));
   }

   private void i(dgv $$0, dgv $$1) {
      alb $$2 = of.a($$0);
      alb $$3 = of.a($$0, "_powered");
      alb $$4 = of.a($$0, "_lit");
      alb $$5 = of.a($$0, "_lit_powered");
      this.a($$1, of.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dgv $$0) {
      this.c($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, oh.ao.a($$0, oi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dgx.qy);
      this.x(dgx.qx);
      this.x(dgx.qw);
      this.x(dgx.qv);
   }

   private void H() {
      this.c(dgx.st);
      ny.b<jj, dux> $$0 = ny.a(duq.bm, duq.bn);

      for (dux $$1 : dux.values()) {
         $$0.a(jj.b, $$1, this.a(jj.b, $$1));
      }

      for (dux $$2 : dux.values()) {
         $$0.a(jj.a, $$2, this.a(jj.a, $$2));
      }

      this.b.accept(nx.a(dgx.st).a($$0));
   }

   private oa a(jj $$0, dux $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oi $$3 = oi.c(oi.a(dgx.st, $$2));
      return oa.a().a(ob.c, oh.an.a(dgx.st, $$2, $$3, this.c));
   }

   private void y(dgv $$0) {
      oi $$1 = new oi().a(oj.e, oi.G(dgx.dV)).a(oj.f, oi.G($$0)).a(oj.i, oi.a($$0, "_side"));
      this.b.accept(c($$0, oh.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alb $$0 = oi.a(dgx.gZ, "_side");
      oi $$1 = new oi().a(oj.f, oi.a(dgx.gZ, "_top")).a(oj.i, $$0);
      oi $$2 = new oi().a(oj.f, oi.a(dgx.gZ, "_inverted_top")).a(oj.i, $$0);
      this.b
         .accept(
            nx.a(dgx.gZ)
               .a(ny.a(duq.p).a(false, oa.a().a(ob.c, oh.aF.a(dgx.gZ, $$1, this.c))).a(true, oa.a().a(ob.c, oh.aF.a(of.a(dgx.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dgv $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()));
   }

   private void J() {
      dgv $$0 = dgx.ss;
      alb $$1 = of.a($$0, "_on");
      alb $$2 = of.a($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()).a(a(duq.w, $$1, $$2)));
   }

   private void K() {
      oi $$0 = new oi().a(oj.B, oi.G(dgx.j)).a(oj.f, oi.G(dgx.cC));
      oi $$1 = new oi().a(oj.B, oi.G(dgx.j)).a(oj.f, oi.a(dgx.cC, "_moist"));
      alb $$2 = oh.aW.a(dgx.cC, $$0, this.c);
      alb $$3 = oh.aW.a(oi.a(dgx.cC, "_moist"), $$1, this.c);
      this.b.accept(nx.a(dgx.cC).a(a(duq.aQ, 7, $$3, $$2)));
   }

   private List<alb> A(dgv $$0) {
      alb $$1 = oh.aX.a(of.a($$0, "_floor0"), oi.v($$0), this.c);
      alb $$2 = oh.aX.a(of.a($$0, "_floor1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alb> B(dgv $$0) {
      alb $$1 = oh.aY.a(of.a($$0, "_side0"), oi.v($$0), this.c);
      alb $$2 = oh.aY.a(of.a($$0, "_side1"), oi.w($$0), this.c);
      alb $$3 = oh.aZ.a(of.a($$0, "_side_alt0"), oi.v($$0), this.c);
      alb $$4 = oh.aZ.a(of.a($$0, "_side_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alb> C(dgv $$0) {
      alb $$1 = oh.ba.a(of.a($$0, "_up0"), oi.v($$0), this.c);
      alb $$2 = oh.ba.a(of.a($$0, "_up1"), oi.w($$0), this.c);
      alb $$3 = oh.bb.a(of.a($$0, "_up_alt0"), oi.v($$0), this.c);
      alb $$4 = oh.bb.a(of.a($$0, "_up_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<oa> a(List<alb> $$0, UnaryOperator<oa> $$1) {
      return $$0.stream().map($$0x -> oa.a().a(ob.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nv $$0 = nv.a().a(duq.L, false).a(duq.M, false).a(duq.N, false).a(duq.O, false).a(duq.J, false);
      List<alb> $$1 = this.A(dgx.cr);
      List<alb> $$2 = this.B(dgx.cr);
      List<alb> $$3 = this.C(dgx.cr);
      this.b
         .accept(
            nw.a(dgx.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nv.b(nv.a().a(duq.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nv.b(nv.a().a(duq.M, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(nv.b(nv.a().a(duq.N, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(nv.b(nv.a().a(duq.O, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.d)))
               .a(nv.a().a(duq.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alb> $$0 = this.A(dgx.cs);
      List<alb> $$1 = this.B(dgx.cs);
      this.b
         .accept(
            nw.a(dgx.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.d)))
         );
   }

   private void D(dgv $$0) {
      alb $$1 = ok.t.create($$0, this.c);
      alb $$2 = ok.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nx.a($$0).a(a(duq.j, $$2, $$1)));
   }

   private void N() {
      oi $$0 = oi.a(oi.a(dgx.ad, "_side"), oi.a(dgx.ad, "_top"));
      alb $$1 = oh.j.a(dgx.ad, $$0, this.c);
      this.b.accept(d(dgx.ad, $$1));
   }

   private void O() {
      this.a(cvo.ad);
      dgv $$0 = dgx.E;
      ny.b<Boolean, Integer> $$1 = ny.a(dlq.d, dlq.b);
      alb $$2 = of.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alb $$4 = of.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oa.a().a(ob.c, $$4));
         $$1.a(false, $$3, oa.a().a(ob.c, $$2));
      }

      this.b.accept(nx.a(dgx.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nx.a(dgx.kI)
               .a(
                  ny.a(duq.as)
                     .a(0, oa.a().a(ob.c, this.a(dgx.kI, "_0", oh.c, oi::b)))
                     .a(1, oa.a().a(ob.c, this.a(dgx.kI, "_1", oh.c, oi::b)))
                     .a(2, oa.a().a(ob.c, this.a(dgx.kI, "_2", oh.c, oi::b)))
                     .a(3, oa.a().a(ob.c, this.a(dgx.kI, "_3", oh.c, oi::b)))
               )
         );
   }

   private void Q() {
      alb $$0 = oi.G(dgx.j);
      oi $$1 = new oi().a(oj.e, $$0).b(oj.e, oj.c).a(oj.f, oi.a(dgx.i, "_top")).a(oj.i, oi.a(dgx.i, "_snow"));
      oa $$2 = oa.a().a(ob.c, oh.n.a(dgx.i, "_snow", $$1, this.c));
      this.a(dgx.i, of.a(dgx.i), $$2);
      alb $$3 = ok.f.get(dgx.fl).a($$1x -> $$1x.a(oj.e, $$0)).a(dgx.fl, this.c);
      this.a(dgx.fl, $$3, $$2);
      alb $$4 = ok.f.get(dgx.l).a($$1x -> $$1x.a(oj.e, $$0)).a(dgx.l, this.c);
      this.a(dgx.l, $$4, $$2);
   }

   private void a(dgv $$0, alb $$1, oa $$2) {
      List<oa> $$3 = Arrays.asList(a($$1));
      this.b.accept(nx.a($$0).a(ny.a(duq.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cvo.ri);
      this.b
         .accept(
            nx.a(dgx.fC)
               .a(
                  ny.a(duq.ar)
                     .a(0, oa.a().a(ob.c, of.a(dgx.fC, "_stage0")))
                     .a(1, oa.a().a(ob.c, of.a(dgx.fC, "_stage1")))
                     .a(2, oa.a().a(ob.c, of.a(dgx.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dgx.kE, of.a(dgx.kE)));
   }

   private void j(dgv $$0, dgv $$1) {
      oi $$2 = oi.b($$1);
      alb $$3 = oh.Y.a($$0, $$2, this.c);
      alb $$4 = oh.Z.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(duq.aT, 1, $$4, $$3)));
   }

   private void T() {
      alb $$0 = of.a(dgx.hc);
      alb $$1 = of.a(dgx.hc, "_side");
      this.a(cvo.lR);
      this.b
         .accept(
            nx.a(dgx.hc)
               .a(
                  ny.a(duq.Q)
                     .a(jj.a, oa.a().a(ob.c, $$0))
                     .a(jj.c, oa.a().a(ob.c, $$1))
                     .a(jj.f, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(jj.d, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(jj.e, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               )
         );
   }

   private void k(dgv $$0, dgv $$1) {
      alb $$2 = of.a($$0);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alb $$0 = of.a(dgx.eW, "_post_ends");
      alb $$1 = of.a(dgx.eW, "_post");
      alb $$2 = of.a(dgx.eW, "_cap");
      alb $$3 = of.a(dgx.eW, "_cap_alt");
      alb $$4 = of.a(dgx.eW, "_side");
      alb $$5 = of.a(dgx.eW, "_side_alt");
      this.b
         .accept(
            nw.a(dgx.eW)
               .a(oa.a().a(ob.c, $$0))
               .a(nv.a().a(duq.L, false).a(duq.M, false).a(duq.N, false).a(duq.O, false), oa.a().a(ob.c, $$1))
               .a(nv.a().a(duq.L, true).a(duq.M, false).a(duq.N, false).a(duq.O, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(duq.L, false).a(duq.M, true).a(duq.N, false).a(duq.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.L, false).a(duq.M, false).a(duq.N, true).a(duq.O, false), oa.a().a(ob.c, $$3))
               .a(nv.a().a(duq.L, false).a(duq.M, false).a(duq.N, false).a(duq.O, true), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(duq.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(duq.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(duq.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         );
      this.d(dgx.eW);
   }

   private void E(dgv $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(b()));
   }

   private void V() {
      alb $$0 = of.a(dgx.dw);
      alb $$1 = of.a(dgx.dw, "_on");
      this.d(dgx.dw);
      this.b
         .accept(
            nx.a(dgx.dw)
               .a(a(duq.w, $$0, $$1))
               .a(
                  ny.a(duq.U, duq.R)
                     .a(dul.c, jj.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dul.c, jj.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
                     .a(dul.c, jj.d, oa.a().a(ob.a, ob.a.c))
                     .a(dul.c, jj.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dul.a, jj.c, oa.a())
                     .a(dul.a, jj.f, oa.a().a(ob.b, ob.a.b))
                     .a(dul.a, jj.d, oa.a().a(ob.b, ob.a.c))
                     .a(dul.a, jj.e, oa.a().a(ob.b, ob.a.d))
                     .a(dul.b, jj.c, oa.a().a(ob.a, ob.a.b))
                     .a(dul.b, jj.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dul.b, jj.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dul.b, jj.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
               )
         );
   }

   private void W() {
      this.d(dgx.fm);
      this.b.accept(b(dgx.fm, of.a(dgx.fm)));
   }

   private void X() {
      this.d(dgx.tn);
      this.b.accept(c(dgx.tn, of.a(dgx.tn)));
   }

   private void Y() {
      this.b.accept(nx.a(dgx.ed).a(ny.a(duq.H).a(jj.a.a, oa.a().a(ob.c, of.a(dgx.ed, "_ns"))).a(jj.a.c, oa.a().a(ob.c, of.a(dgx.ed, "_ew")))));
   }

   private void Z() {
      alb $$0 = ok.a.create(dgx.dV, this.c);
      this.b
         .accept(
            nx.a(
               dgx.dV,
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
      alb $$0 = of.a(dgx.kO);
      alb $$1 = of.a(dgx.kO, "_on");
      this.b.accept(nx.a(dgx.kO).a(a(duq.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oi $$0 = new oi().a(oj.e, oi.a(dgx.by, "_bottom")).a(oj.i, oi.a(dgx.by, "_side"));
      alb $$1 = oi.a(dgx.by, "_top_sticky");
      alb $$2 = oi.a(dgx.by, "_top");
      oi $$3 = $$0.c(oj.E, $$1);
      oi $$4 = $$0.c(oj.E, $$2);
      alb $$5 = of.a(dgx.by, "_base");
      this.a(dgx.by, $$5, $$4);
      this.a(dgx.br, $$5, $$3);
      alb $$6 = oh.n.a(dgx.by, "_inventory", $$0.c(oj.f, $$2), this.c);
      alb $$7 = oh.n.a(dgx.br, "_inventory", $$0.c(oj.f, $$1), this.c);
      this.a(dgx.by, $$6);
      this.a(dgx.br, $$7);
   }

   private void a(dgv $$0, alb $$1, oi $$2) {
      alb $$3 = oh.bj.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(duq.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oi $$0 = new oi().a(oj.F, oi.a(dgx.by, "_top")).a(oj.i, oi.a(dgx.by, "_side"));
      oi $$1 = $$0.c(oj.E, oi.a(dgx.by, "_top_sticky"));
      oi $$2 = $$0.c(oj.E, oi.a(dgx.by, "_top"));
      this.b
         .accept(
            nx.a(dgx.bz)
               .a(
                  ny.a(duq.x, duq.bg)
                     .a(false, dvc.a, oa.a().a(ob.c, oh.bk.a(dgx.by, "_head", $$2, this.c)))
                     .a(false, dvc.b, oa.a().a(ob.c, oh.bk.a(dgx.by, "_head_sticky", $$1, this.c)))
                     .a(true, dvc.a, oa.a().a(ob.c, oh.bl.a(dgx.by, "_head_short", $$2, this.c)))
                     .a(true, dvc.b, oa.a().a(ob.c, oh.bl.a(dgx.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dgv $$0 = dgx.tr;
      oi $$1 = oi.a($$0, "_side_inactive", "_top_inactive");
      oi $$2 = oi.a($$0, "_side_active", "_top_active");
      oi $$3 = oi.a($$0, "_side_active", "_top_ejecting_reward");
      oi $$4 = oi.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      oi $$5 = oi.a($$0, "_side_active_ominous", "_top_active_ominous");
      oi $$6 = oi.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alb $$7 = oh.o.a($$0, $$1, this.c);
      alb $$8 = oh.o.a($$0, "_active", $$2, this.c);
      alb $$9 = oh.o.a($$0, "_ejecting_reward", $$3, this.c);
      alb $$10 = oh.o.a($$0, "_inactive_ominous", $$4, this.c);
      alb $$11 = oh.o.a($$0, "_active_ominous", $$5, this.c);
      alb $$12 = oh.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nx.a($$0).a(ny.a(duq.by, duq.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oa.a().a(ob.c, $$7x ? $$10 : $$7);
            case b, c, d -> oa.a().a(ob.c, $$7x ? $$11 : $$8);
            case e -> oa.a().a(ob.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dgv $$0 = dgx.ts;
      oi $$1 = oi.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      oi $$2 = oi.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      oi $$3 = oi.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      oi $$4 = oi.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alb $$5 = oh.bP.a($$0, $$1, this.c);
      alb $$6 = oh.bP.a($$0, "_active", $$2, this.c);
      alb $$7 = oh.bP.a($$0, "_unlocking", $$3, this.c);
      alb $$8 = oh.bP.a($$0, "_ejecting_reward", $$4, this.c);
      oi $$9 = oi.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      oi $$10 = oi.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$11 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$12 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alb $$13 = oh.bP.a($$0, "_ominous", $$9, this.c);
      alb $$14 = oh.bP.a($$0, "_active_ominous", $$10, this.c);
      alb $$15 = oh.bP.a($$0, "_unlocking_ominous", $$11, this.c);
      alb $$16 = oh.bP.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nx.a($$0).a(b()).a(ny.a(dpr.b, dpr.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oa.a().a(ob.c, $$9x ? $$13 : $$5);
            case b -> oa.a().a(ob.c, $$9x ? $$14 : $$6);
            case c -> oa.a().a(ob.c, $$9x ? $$15 : $$7);
            case d -> oa.a().a(ob.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alb $$0 = of.a(dgx.qQ, "_inactive");
      alb $$1 = of.a(dgx.qQ, "_active");
      this.a(dgx.qQ, $$0);
      this.b.accept(nx.a(dgx.qQ).a(ny.a(duq.bo).a($$2 -> oa.a().a(ob.c, $$2 != dvh.b && $$2 != dvh.c ? $$0 : $$1))));
   }

   private void ag() {
      alb $$0 = of.a(dgx.qR, "_inactive");
      alb $$1 = of.a(dgx.qR, "_active");
      this.a(dgx.qR, $$0);
      this.b.accept(nx.a(dgx.qR).a(ny.a(duq.bo).a($$2 -> oa.a().a(ob.c, $$2 != dvh.b && $$2 != dvh.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alb $$0 = oh.bO.a(dgx.qV, oi.a(false), this.c);
      alb $$1 = oh.bO.a(dgx.qV, "_can_summon", oi.a(true), this.c);
      this.a(dgx.qV, $$0);
      this.b.accept(nx.a(dgx.qV).a(a(duq.G, $$1, $$0)));
   }

   private void ai() {
      alb $$0 = of.a(dgx.nS, "_stable");
      alb $$1 = of.a(dgx.nS, "_unstable");
      this.a(dgx.nS, $$0);
      this.b.accept(nx.a(dgx.nS).a(a(duq.b, $$1, $$0)));
   }

   private void aj() {
      alb $$0 = this.a(dgx.sv, "", oh.ao, oi::c);
      alb $$1 = this.a(dgx.sv, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dgx.sv).a(a(duq.D, $$1, $$0)));
      alb $$2 = this.a(dgx.sw, "", oh.ao, oi::c);
      alb $$3 = this.a(dgx.sw, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dgx.sw).a(a(duq.D, $$3, $$2)));
   }

   private void ak() {
      alb $$0 = ok.a.create(dgx.fB, this.c);
      alb $$1 = this.a(dgx.fB, "_on", oh.c, oi::b);
      this.b.accept(nx.a(dgx.fB).a(a(duq.r, $$1, $$0)));
   }

   private void l(dgv $$0, dgv $$1) {
      oi $$2 = oi.y($$0);
      this.b.accept(c($$0, oh.bf.a($$0, $$2, this.c)));
      this.b.accept(nx.a($$1, oa.a().a(ob.c, oh.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oi $$0 = oi.y(dgx.dK);
      oi $$1 = oi.i(oi.a(dgx.dK, "_off"));
      alb $$2 = oh.bh.a(dgx.dK, $$0, this.c);
      alb $$3 = oh.bh.a(dgx.dK, "_off", $$1, this.c);
      this.b.accept(nx.a(dgx.dK).a(a(duq.r, $$2, $$3)));
      alb $$4 = oh.bi.a(dgx.dL, $$0, this.c);
      alb $$5 = oh.bi.a(dgx.dL, "_off", $$1, this.c);
      this.b.accept(nx.a(dgx.dL).a(a(duq.r, $$4, $$5)).a(d()));
      this.d(dgx.dK);
      this.c(dgx.dL);
   }

   private void am() {
      this.a(cvo.lK);
      this.b.accept(nx.a(dgx.eh).a(ny.a(duq.aA, duq.s, duq.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oa.a().a(ob.c, oi.a(dgx.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cvo.cT);
      this.b
         .accept(
            nx.a(dgx.mV)
               .a(
                  ny.a(duq.aS, duq.C)
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
      oi $$0 = oi.a(dgx.dN);
      alb $$1 = oh.c.a(dgx.dP, $$0, this.c);
      this.b.accept(nx.a(dgx.dN).a(ny.a(duq.aF).a($$1x -> oa.a().a(ob.c, $$1x < 8 ? of.a(dgx.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dgx.dN, of.a(dgx.dN, "_height2"));
      this.b.accept(c(dgx.dP, $$1));
   }

   private void ap() {
      this.b.accept(nx.a(dgx.oc, oa.a().a(ob.c, of.a(dgx.oc))).a(b()));
   }

   private void aq() {
      alb $$0 = ok.a.create(dgx.pa, this.c);
      this.a(dgx.pa, $$0);
      this.b.accept(nx.a(dgx.pa).a(ny.a(duq.bj).a($$0x -> oa.a().a(ob.c, this.a(dgx.pa, "_" + $$0x.c(), oh.c, oi::b)))));
   }

   private void ar() {
      this.a(cvo.wx);
      this.b.accept(nx.a(dgx.oi).a(ny.a(duq.as).a($$0 -> oa.a().a(ob.c, this.a(dgx.oi, "_stage" + $$0, oh.ao, oi::c)))));
   }

   private void as() {
      this.a(cvo.pt);
      this.b
         .accept(
            nx.a(dgx.fI)
               .a(
                  ny.a(duq.a, duq.M, duq.L, duq.N, duq.O)
                     .a(false, false, false, false, false, oa.a().a(ob.c, of.a(dgx.fI, "_ns")))
                     .a(false, true, false, false, false, oa.a().a(ob.c, of.a(dgx.fI, "_n")).a(ob.b, ob.a.b))
                     .a(false, false, true, false, false, oa.a().a(ob.c, of.a(dgx.fI, "_n")))
                     .a(false, false, false, true, false, oa.a().a(ob.c, of.a(dgx.fI, "_n")).a(ob.b, ob.a.c))
                     .a(false, false, false, false, true, oa.a().a(ob.c, of.a(dgx.fI, "_n")).a(ob.b, ob.a.d))
                     .a(false, true, true, false, false, oa.a().a(ob.c, of.a(dgx.fI, "_ne")))
                     .a(false, true, false, true, false, oa.a().a(ob.c, of.a(dgx.fI, "_ne")).a(ob.b, ob.a.b))
                     .a(false, false, false, true, true, oa.a().a(ob.c, of.a(dgx.fI, "_ne")).a(ob.b, ob.a.c))
                     .a(false, false, true, false, true, oa.a().a(ob.c, of.a(dgx.fI, "_ne")).a(ob.b, ob.a.d))
                     .a(false, false, true, true, false, oa.a().a(ob.c, of.a(dgx.fI, "_ns")))
                     .a(false, true, false, false, true, oa.a().a(ob.c, of.a(dgx.fI, "_ns")).a(ob.b, ob.a.b))
                     .a(false, true, true, true, false, oa.a().a(ob.c, of.a(dgx.fI, "_nse")))
                     .a(false, true, false, true, true, oa.a().a(ob.c, of.a(dgx.fI, "_nse")).a(ob.b, ob.a.b))
                     .a(false, false, true, true, true, oa.a().a(ob.c, of.a(dgx.fI, "_nse")).a(ob.b, ob.a.c))
                     .a(false, true, true, false, true, oa.a().a(ob.c, of.a(dgx.fI, "_nse")).a(ob.b, ob.a.d))
                     .a(false, true, true, true, true, oa.a().a(ob.c, of.a(dgx.fI, "_nsew")))
                     .a(true, false, false, false, false, oa.a().a(ob.c, of.a(dgx.fI, "_attached_ns")))
                     .a(true, false, true, false, false, oa.a().a(ob.c, of.a(dgx.fI, "_attached_n")))
                     .a(true, false, false, true, false, oa.a().a(ob.c, of.a(dgx.fI, "_attached_n")).a(ob.b, ob.a.c))
                     .a(true, true, false, false, false, oa.a().a(ob.c, of.a(dgx.fI, "_attached_n")).a(ob.b, ob.a.b))
                     .a(true, false, false, false, true, oa.a().a(ob.c, of.a(dgx.fI, "_attached_n")).a(ob.b, ob.a.d))
                     .a(true, true, true, false, false, oa.a().a(ob.c, of.a(dgx.fI, "_attached_ne")))
                     .a(true, true, false, true, false, oa.a().a(ob.c, of.a(dgx.fI, "_attached_ne")).a(ob.b, ob.a.b))
                     .a(true, false, false, true, true, oa.a().a(ob.c, of.a(dgx.fI, "_attached_ne")).a(ob.b, ob.a.c))
                     .a(true, false, true, false, true, oa.a().a(ob.c, of.a(dgx.fI, "_attached_ne")).a(ob.b, ob.a.d))
                     .a(true, false, true, true, false, oa.a().a(ob.c, of.a(dgx.fI, "_attached_ns")))
                     .a(true, true, false, false, true, oa.a().a(ob.c, of.a(dgx.fI, "_attached_ns")).a(ob.b, ob.a.b))
                     .a(true, true, true, true, false, oa.a().a(ob.c, of.a(dgx.fI, "_attached_nse")))
                     .a(true, true, false, true, true, oa.a().a(ob.c, of.a(dgx.fI, "_attached_nse")).a(ob.b, ob.a.b))
                     .a(true, false, true, true, true, oa.a().a(ob.c, of.a(dgx.fI, "_attached_nse")).a(ob.b, ob.a.c))
                     .a(true, true, true, false, true, oa.a().a(ob.c, of.a(dgx.fI, "_attached_nse")).a(ob.b, ob.a.d))
                     .a(true, true, true, true, true, oa.a().a(ob.c, of.a(dgx.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dgx.fH);
      this.b.accept(nx.a(dgx.fH).a(ny.a(duq.a, duq.w).a(($$0, $$1) -> oa.a().a(ob.c, oi.a(dgx.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alb a(int $$0, String $$1, oi $$2) {
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

   private alb a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", oi.b(oi.G(dgx.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oi.b(oi.a(dgx.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oi.b(oi.a(dgx.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cvo.kp);
      this.b.accept(nx.a(dgx.mf).a(ny.a(duq.aD, duq.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cvo.kq);
      Function<Integer, alb> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oi $$2 = oi.a($$1);
         return oh.by.a(dgx.mg, $$1, $$2, this.c);
      };
      this.b.accept(nx.a(dgx.mg).a(ny.a(doe.c).a($$1 -> oa.a().a(ob.c, $$0.apply($$1)))));
   }

   private void F(dgv $$0) {
      this.d($$0);
      alb $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      nv.c $$3 = ad.a(nv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dur, Function<alb, oa>> $$4 : a) {
         dur $$5 = (dur)$$4.getFirst();
         Function<alb, oa> $$6 = (Function<alb, oa>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(nv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      alb $$0 = oi.a(dgx.qU, "_bottom");
      oi $$1 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dgx.qU, "_top")).a(oj.i, oi.a(dgx.qU, "_side"));
      oi $$2 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dgx.qU, "_top_bloom")).a(oj.i, oi.a(dgx.qU, "_side_bloom"));
      alb $$3 = oh.n.a(dgx.qU, "", $$1, this.c);
      alb $$4 = oh.n.a(dgx.qU, "_bloom", $$2, this.c);
      this.b.accept(nx.a(dgx.qU).a(ny.a(duq.E).a($$2x -> oa.a().a(ob.c, $$2x ? $$4 : $$3))));
      this.a(cvo.gj, $$3);
   }

   private void ax() {
      dgv $$0 = dgx.cm;
      alb $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      List.of(Pair.of(jj.c, ob.a.a), Pair.of(jj.f, ob.a.b), Pair.of(jj.d, ob.a.c), Pair.of(jj.e, ob.a.d)).forEach($$2x -> {
         jj $$3 = (jj)$$2x.getFirst();
         ob.a $$4 = (ob.a)$$2x.getSecond();
         nv.c $$5 = nv.a().a(duq.R, $$3);
         $$2.a($$5, oa.a().a(ob.c, $$1).a(ob.b, $$4).a(ob.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, of.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2) {
      List.of(Pair.of(duq.bp, oh.aM), Pair.of(duq.bq, oh.aN), Pair.of(duq.br, oh.aO), Pair.of(duq.bs, oh.aP), Pair.of(duq.bt, oh.aQ), Pair.of(duq.bu, oh.aR))
         .forEach($$3 -> {
            dur $$4 = (dur)$$3.getFirst();
            og $$5 = (og)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2, dur $$3, og $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oi $$7 = new oi().a(oj.b, oi.a(dgx.cm, $$6));
      nr.d $$8 = new nr.d($$4, $$6);
      alb $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dgx.cm, $$6, $$7, this.c));
      $$0.a(nv.a($$1, nv.a().a($$3, $$5)), oa.a().a(ob.c, $$9).a(ob.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dgx.kJ, oh.c.a(dgx.kJ, oi.b(of.a("magma")), this.c)));
   }

   private void G(dgv $$0) {
      this.b($$0, ok.q);
      oh.bF.a(of.a($$0.r()), oi.u($$0), this.c);
   }

   private void b(dgv $$0, dgv $$1, nr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dgv $$0, dgv $$1) {
      oh.bG.a(of.a($$0.r()), oi.u($$1), this.c);
   }

   private void az() {
      alb $$0 = of.a(dgx.b);
      alb $$1 = of.a(dgx.b, "_mirrored");
      this.b.accept(a(dgx.eN, $$0, $$1));
      this.a(dgx.eN, $$0);
   }

   private void aA() {
      alb $$0 = of.a(dgx.sJ);
      alb $$1 = of.a(dgx.sJ, "_mirrored");
      this.b.accept(a(dgx.td, $$0, $$1).a(f()));
      this.a(dgx.td, $$0);
   }

   private void n(dgv $$0, dgv $$1) {
      this.a($$0, nr.e.b);
      oi $$2 = oi.d(oi.a($$0, "_pot"));
      alb $$3 = nr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alb $$0 = oi.a(dgx.pl, "_bottom");
      alb $$1 = oi.a(dgx.pl, "_top_off");
      alb $$2 = oi.a(dgx.pl, "_top");
      alb[] $$3 = new alb[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oi $$5 = new oi().a(oj.e, $$0).a(oj.f, $$4 == 0 ? $$1 : $$2).a(oj.i, oi.a(dgx.pl, "_side" + $$4));
         $$3[$$4] = oh.n.a(dgx.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nx.a(dgx.pl).a(ny.a(duq.aZ).a($$1x -> oa.a().a(ob.c, $$3[$$1x]))));
      this.a(cvo.wV, $$3[0]);
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
      alb $$0 = oi.a(dgx.pb, "_top");
      alb $$1 = oi.a(dgx.pb, "_bottom");
      alb $$2 = oi.a(dgx.pb, "_side");
      alb $$3 = oi.a(dgx.pb, "_lock");
      oi $$4 = new oi().a(oj.o, $$2).a(oj.m, $$2).a(oj.l, $$2).a(oj.c, $$0).a(oj.j, $$0).a(oj.k, $$1).a(oj.n, $$3);
      alb $$5 = oh.b.a(dgx.pb, $$4, this.c);
      this.b.accept(nx.a(dgx.pb, oa.a().a(ob.c, $$5)).a(ny.a(duq.T).a($$0x -> this.a($$0x, oa.a()))));
   }

   private void aD() {
      dgv $$0 = dgx.n;
      alb $$1 = of.a($$0);
      ok $$2 = ok.a.get($$0);
      dgv $$3 = dgx.jH;
      alb $$4 = oh.ab.a($$3, $$2.b(), this.c);
      alb $$5 = oh.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lx.a().filter(ly::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dgx.rf).a(lx.w).a(dgx.rf, dgx.rD).a(dgx.rj, dgx.rn).a(lx.y);
      this.h(dgx.re).a(lx.A).a(dgx.re, dgx.rC).a(dgx.ri, dgx.rm).a(lx.C);
      this.h(dgx.rd).a(lx.E).a(dgx.rd, dgx.rB).a(dgx.rh, dgx.rl).a(lx.G);
      this.h(dgx.rc).a(lx.I).a(dgx.rc, dgx.rA).a(dgx.rg, dgx.rk).a(lx.K);
      this.w(dgx.sk);
      this.w(dgx.sl);
      this.w(dgx.sm);
      this.w(dgx.sn);
      this.i(dgx.sk, dgx.so);
      this.i(dgx.sl, dgx.sp);
      this.i(dgx.sm, dgx.sq);
      this.i(dgx.sn, dgx.sr);
      this.m(dgx.a);
      this.c(dgx.nc, dgx.a);
      this.c(dgx.nb, dgx.a);
      this.m(dgx.fO);
      this.m(dgx.dQ);
      this.c(dgx.nd, dgx.G);
      this.m(dgx.fA);
      this.m(dgx.me);
      this.m(dgx.fr);
      this.m(dgx.fR);
      this.a(cvo.ug);
      this.m(dgx.pg);
      this.m(dgx.G);
      this.m(dgx.H);
      this.m(dgx.hV);
      this.a(cvo.fS);
      this.o(dgx.pM, dgx.qd);
      this.o(dgx.pN, dgx.qe);
      this.o(dgx.pO, dgx.qf);
      this.o(dgx.pP, dgx.qg);
      this.o(dgx.pQ, dgx.qh);
      this.o(dgx.pR, dgx.qi);
      this.o(dgx.pS, dgx.qj);
      this.o(dgx.pT, dgx.qk);
      this.o(dgx.pU, dgx.ql);
      this.o(dgx.pV, dgx.qm);
      this.o(dgx.pW, dgx.qn);
      this.o(dgx.pX, dgx.qo);
      this.o(dgx.pY, dgx.qp);
      this.o(dgx.pZ, dgx.qq);
      this.o(dgx.qa, dgx.qr);
      this.o(dgx.qb, dgx.qs);
      this.o(dgx.pL, dgx.qc);
      this.m(dgx.na);
      this.m(dgx.gs);
      this.m(dgx.qP);
      this.m(dgx.sx);
      this.s(dgx.sy);
      this.s(dgx.sz);
      this.t(dgx.ti);
      this.t(dgx.tj);
      this.aj();
      this.g(dgx.sC, dgx.sA);
      this.p(dgx.sB);
      this.a(dgx.hW, cvo.hB);
      this.a(cvo.hB);
      this.aE();
      this.a(dgx.kN, cvo.jb);
      this.a(cvo.jb);
      this.f(dgx.bQ, oi.a(dgx.by, "_side"));
      this.a(dgx.R);
      this.a(dgx.S);
      this.a(dgx.iB);
      this.a(dgx.cx);
      this.a(dgx.cy);
      this.a(dgx.cz);
      this.a(dgx.fE);
      this.a(dgx.fF);
      this.a(dgx.fJ);
      this.a(dgx.N);
      this.a(dgx.T);
      this.a(dgx.O);
      this.a(dgx.ch);
      this.a(dgx.P);
      this.a(dgx.Q);
      this.a(dgx.ci);
      this.b(dgx.pj, ok.d);
      this.a(dgx.pi);
      this.a(dgx.aR);
      this.a(dgx.aS);
      this.a(dgx.aT);
      this.a(dgx.hb);
      this.a(dgx.dI);
      this.a(dgx.dJ);
      this.a(dgx.ha);
      this.a(dgx.pC);
      this.a(dgx.mW);
      this.a(dgx.dR);
      this.a(dgx.k);
      this.a(dgx.pk);
      this.a(dgx.fz);
      this.a(dgx.ec);
      this.a(dgx.L);
      this.a(dgx.ph);
      this.a(dgx.dO);
      this.b(dgx.dT, ok.g);
      this.b(dgx.pq, ok.d);
      this.b(dgx.fa, ok.d);
      this.m(dgx.ac);
      this.m(dgx.ga);
      this.a(dgx.kK);
      this.a(dgx.aY);
      this.a(dgx.iC);
      this.a(dgx.co);
      this.a(dgx.pK);
      this.a(dgx.ii);
      this.a(dgx.oy);
      this.a(dgx.dW);
      this.a(dgx.dX);
      this.b(dgx.ct, ok.b);
      this.a(dgx.aO);
      this.b(dgx.bw, ok.v);
      this.a(cvo.cS);
      this.b(dgx.ck, ok.f);
      this.b(dgx.pd, ok.d);
      this.a(dgx.op);
      this.a(dgx.aP);
      this.a(dgx.qt);
      this.a(dgx.qu);
      this.a(dgx.qN);
      this.a(dgx.su);
      this.a(dgx.tf);
      this.a(dgx.tg);
      this.a(dgx.th);
      this.e(dgx.qS);
      this.m(dgx.tt);
      this.aD();
      this.a(dgx.ra);
      this.a(dgx.rb);
      this.a(dgx.qW);
      this.a(dgx.qX);
      this.a(dgx.qY);
      this.a(dgx.qZ);
      this.k(dgx.qW, dgx.rw);
      this.k(dgx.qX, dgx.ry);
      this.k(dgx.qY, dgx.rx);
      this.k(dgx.qZ, dgx.rz);
      this.i(dgx.rM);
      this.i(dgx.rN);
      this.i(dgx.rP);
      this.i(dgx.rO);
      this.a(dgx.rM, dgx.rQ);
      this.a(dgx.rN, dgx.rR);
      this.a(dgx.rP, dgx.rT);
      this.a(dgx.rO, dgx.rS);
      this.k(dgx.rU);
      this.k(dgx.rV);
      this.k(dgx.rX);
      this.k(dgx.rW);
      this.b(dgx.rU, dgx.rY);
      this.b(dgx.rV, dgx.rZ);
      this.b(dgx.rX, dgx.sb);
      this.b(dgx.rW, dgx.sa);
      this.a(dgx.sc);
      this.a(dgx.sd);
      this.a(dgx.se);
      this.a(dgx.sf);
      this.k(dgx.sc, dgx.sg);
      this.k(dgx.sd, dgx.sh);
      this.k(dgx.se, dgx.si);
      this.k(dgx.sf, dgx.sj);
      this.j(dgx.gW, dgx.ch);
      this.j(dgx.gX, dgx.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dgx.og, dgx.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dgx.kt);
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
      this.F(dgx.ff);
      this.F(dgx.fg);
      this.F(dgx.qT);
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
      this.E(dgx.cO);
      this.d(dgx.cO);
      this.E(dgx.oa);
      this.g();
      this.E(dgx.sE);
      this.l(dgx.cp, dgx.cq);
      this.l(dgx.ea, dgx.eb);
      this.a(dgx.cA, dgx.n, oi::c);
      this.a(dgx.nY, dgx.p, oi::d);
      this.y(dgx.ow);
      this.y(dgx.on);
      this.v(dgx.aU);
      this.v(dgx.hi);
      this.C();
      this.D(dgx.oe);
      this.D(dgx.of);
      this.e(dgx.eX, of.a(dgx.eX));
      this.a(dgx.dY, ok.d);
      this.a(dgx.dZ, ok.d);
      this.a(dgx.te);
      this.a(dgx.kM, ok.d);
      this.f(dgx.j);
      this.f(dgx.sH);
      this.f(dgx.I);
      this.g(dgx.J);
      this.g(dgx.M);
      this.f(dgx.K);
      this.e(dgx.F);
      this.b(dgx.to, ok.f);
      this.a(dgx.ij, ok.d, ok.e);
      this.a(dgx.kx, ok.w, ok.x);
      this.a(dgx.hf, ok.w, ok.x);
      this.a(dgx.tk, ok.d, ok.e);
      this.a(dgx.tl, ok.d, ok.e);
      this.a(dgx.tm, ok.d, ok.e);
      this.c(dgx.nT, ok.i);
      this.z();
      this.a(dgx.pe, oi::A);
      this.a(dgx.pf, oi::C);
      this.a(dgx.kD, duq.as, 0, 1, 2, 3);
      this.a(dgx.gt, duq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dgx.fq, duq.as, 0, 1, 1, 2);
      this.a(dgx.gu, duq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dgx.cB, duq.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dgx.kA, nr.e.b, duq.aq, 0, 1);
      this.i();
      this.h();
      this.a(of.a("decorated_pot"), dgx.iA).b(dgx.tp);
      this.a(of.a("banner"), dgx.n)
         .a(oh.bH, dgx.iJ, dgx.iK, dgx.iL, dgx.iM, dgx.iN, dgx.iO, dgx.iP, dgx.iQ, dgx.iR, dgx.iS, dgx.iT, dgx.iU, dgx.iV, dgx.iW, dgx.iX, dgx.iY)
         .b(dgx.iZ, dgx.ja, dgx.jb, dgx.jc, dgx.jd, dgx.je, dgx.jf, dgx.jg, dgx.jh, dgx.ji, dgx.jj, dgx.jk, dgx.jl, dgx.jm, dgx.jn, dgx.jo);
      this.a(of.a("bed"), dgx.n)
         .b(dgx.aZ, dgx.ba, dgx.bb, dgx.bc, dgx.bd, dgx.be, dgx.bf, dgx.bg, dgx.bh, dgx.bi, dgx.bj, dgx.bk, dgx.bl, dgx.bm, dgx.bn, dgx.bo);
      this.m(dgx.aZ, dgx.bA);
      this.m(dgx.ba, dgx.bB);
      this.m(dgx.bb, dgx.bC);
      this.m(dgx.bc, dgx.bD);
      this.m(dgx.bd, dgx.bE);
      this.m(dgx.be, dgx.bF);
      this.m(dgx.bf, dgx.bG);
      this.m(dgx.bg, dgx.bH);
      this.m(dgx.bh, dgx.bI);
      this.m(dgx.bi, dgx.bJ);
      this.m(dgx.bj, dgx.bK);
      this.m(dgx.bk, dgx.bL);
      this.m(dgx.bl, dgx.bM);
      this.m(dgx.bm, dgx.bN);
      this.m(dgx.bn, dgx.bO);
      this.m(dgx.bo, dgx.bP);
      this.a(of.a("skull"), dgx.dW)
         .a(oh.bI, dgx.gM, dgx.gK, dgx.gI, dgx.gE, dgx.gG, dgx.gQ)
         .a(dgx.gO)
         .b(dgx.gN, dgx.gP, dgx.gL, dgx.gJ, dgx.gF, dgx.gH, dgx.gR);
      this.G(dgx.kP);
      this.G(dgx.kQ);
      this.G(dgx.kR);
      this.G(dgx.kS);
      this.G(dgx.kT);
      this.G(dgx.kU);
      this.G(dgx.kV);
      this.G(dgx.kW);
      this.G(dgx.kX);
      this.G(dgx.kY);
      this.G(dgx.kZ);
      this.G(dgx.la);
      this.G(dgx.lb);
      this.G(dgx.lc);
      this.G(dgx.ld);
      this.G(dgx.le);
      this.G(dgx.lf);
      this.b(dgx.mX, ok.q);
      this.c(dgx.mX);
      this.a(of.a("chest"), dgx.n).b(dgx.cv, dgx.gV);
      this.a(of.a("ender_chest"), dgx.co).b(dgx.fG);
      this.f(dgx.fx, dgx.co).a(dgx.fx, dgx.kF);
      this.a(dgx.aM);
      this.a(dgx.aN);
      this.a(dgx.lw);
      this.a(dgx.lx);
      this.a(dgx.ly);
      this.a(dgx.lz);
      this.a(dgx.lA);
      this.a(dgx.lB);
      this.a(dgx.lC);
      this.a(dgx.lD);
      this.a(dgx.lE);
      this.a(dgx.lF);
      this.a(dgx.lG);
      this.a(dgx.lH);
      this.a(dgx.lI);
      this.a(dgx.lJ);
      this.a(dgx.lK);
      this.a(dgx.lL);
      this.a(ok.a, dgx.lM, dgx.lN, dgx.lO, dgx.lP, dgx.lQ, dgx.lR, dgx.lS, dgx.lT, dgx.lU, dgx.lV, dgx.lW, dgx.lX, dgx.lY, dgx.lZ, dgx.ma, dgx.mb);
      this.a(dgx.iA);
      this.a(dgx.hj);
      this.a(dgx.hk);
      this.a(dgx.hl);
      this.a(dgx.hm);
      this.a(dgx.hn);
      this.a(dgx.ho);
      this.a(dgx.hp);
      this.a(dgx.hq);
      this.a(dgx.hr);
      this.a(dgx.hs);
      this.a(dgx.ht);
      this.a(dgx.hu);
      this.a(dgx.hv);
      this.a(dgx.hw);
      this.a(dgx.hx);
      this.a(dgx.hy);
      this.a(dgx.qO);
      this.h(dgx.aQ, dgx.eY);
      this.h(dgx.ei, dgx.hz);
      this.h(dgx.ej, dgx.hA);
      this.h(dgx.ek, dgx.hB);
      this.h(dgx.el, dgx.hC);
      this.h(dgx.em, dgx.hD);
      this.h(dgx.en, dgx.hE);
      this.h(dgx.eo, dgx.hF);
      this.h(dgx.ep, dgx.hG);
      this.h(dgx.eq, dgx.hH);
      this.h(dgx.er, dgx.hI);
      this.h(dgx.es, dgx.hJ);
      this.h(dgx.et, dgx.hK);
      this.h(dgx.eu, dgx.hL);
      this.h(dgx.ev, dgx.hM);
      this.h(dgx.ew, dgx.hN);
      this.h(dgx.ex, dgx.hO);
      this.b(ok.o, dgx.lg, dgx.lh, dgx.li, dgx.lj, dgx.lk, dgx.ll, dgx.lm, dgx.ln, dgx.lo, dgx.lp, dgx.lq, dgx.lr, dgx.ls, dgx.lt, dgx.lu, dgx.lv);
      this.g(dgx.bA, dgx.ik);
      this.g(dgx.bB, dgx.il);
      this.g(dgx.bC, dgx.im);
      this.g(dgx.bD, dgx.in);
      this.g(dgx.bE, dgx.io);
      this.g(dgx.bF, dgx.ip);
      this.g(dgx.bG, dgx.iq);
      this.g(dgx.bH, dgx.ir);
      this.g(dgx.bI, dgx.is);
      this.g(dgx.bJ, dgx.it);
      this.g(dgx.bK, dgx.iu);
      this.g(dgx.bL, dgx.iv);
      this.g(dgx.bM, dgx.iw);
      this.g(dgx.bN, dgx.ix);
      this.g(dgx.bO, dgx.iy);
      this.g(dgx.bP, dgx.iz);
      this.a(dgx.sI);
      this.a(dgx.eL);
      this.a(dgx.bu, dgx.gb, nr.e.a);
      this.a(dgx.bR, dgx.gc, nr.e.b);
      this.a(dgx.bT, dgx.gd, nr.e.b);
      this.a(dgx.bU, dgx.ge, nr.e.b);
      this.a(dgx.bV, dgx.gf, nr.e.b);
      this.a(dgx.bW, dgx.gg, nr.e.b);
      this.a(dgx.bX, dgx.gh, nr.e.b);
      this.a(dgx.bY, dgx.gi, nr.e.b);
      this.a(dgx.bZ, dgx.gj, nr.e.b);
      this.a(dgx.ca, dgx.gk, nr.e.b);
      this.a(dgx.cb, dgx.gl, nr.e.b);
      this.a(dgx.cc, dgx.gm, nr.e.b);
      this.a(dgx.ce, dgx.gn, nr.e.b);
      this.a(dgx.cd, dgx.go, nr.e.b);
      this.a(dgx.cg, dgx.gp, nr.e.b);
      this.a(dgx.cf, dgx.gq, nr.e.b);
      this.a(dgx.bv, dgx.gr, nr.e.b);
      this.a(dgx.bS, dgx.fS, nr.e.b);
      this.H();
      this.u(dgx.eT);
      this.u(dgx.eU);
      this.u(dgx.eV);
      this.a(dgx.bt, nr.e.a);
      this.b(dgx.dS, nr.e.a);
      this.a(cvo.dJ);
      this.b(dgx.mc, dgx.md, nr.e.b);
      this.a(cvo.dK);
      this.c(dgx.md);
      this.b(dgx.sG, nr.e.b);
      this.c(dgx.sG);
      this.c(dgx.sw);
      this.b(dgx.oz, dgx.oA, nr.e.b);
      this.b(dgx.oB, dgx.oC, nr.e.b);
      this.a(dgx.oz, "_plant");
      this.c(dgx.oA);
      this.a(dgx.oB, "_plant");
      this.c(dgx.oC);
      this.a(dgx.mY, nr.e.a, oi.c(oi.a(dgx.mZ, "_stage0")));
      this.m();
      this.a(dgx.bs, nr.e.b);
      this.c(dgx.iE, nr.e.b);
      this.c(dgx.iF, nr.e.b);
      this.c(dgx.iG, nr.e.b);
      this.c(dgx.iH, nr.e.a);
      this.c(dgx.iI, nr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dgx.mw, dgx.mr, dgx.mm, dgx.mh, dgx.mG, dgx.mB, dgx.mQ, dgx.mL);
      this.a(dgx.mx, dgx.ms, dgx.mn, dgx.mi, dgx.mH, dgx.mC, dgx.mR, dgx.mM);
      this.a(dgx.my, dgx.mt, dgx.mo, dgx.mj, dgx.mI, dgx.mD, dgx.mS, dgx.mN);
      this.a(dgx.mz, dgx.mu, dgx.mp, dgx.mk, dgx.mJ, dgx.mE, dgx.mT, dgx.mO);
      this.a(dgx.mA, dgx.mv, dgx.mq, dgx.ml, dgx.mK, dgx.mF, dgx.mU, dgx.mP);
      this.e(dgx.fe, dgx.fc);
      this.e(dgx.fd, dgx.fb);
      this.l(dgx.ab).c(dgx.ab).a(dgx.av);
      this.l(dgx.am).c(dgx.am).a(dgx.aD);
      this.a(dgx.am, dgx.dj, dgx.ds);
      this.b(dgx.aL, ok.s);
      this.l(dgx.Y).c(dgx.Y).a(dgx.as);
      this.l(dgx.ai).c(dgx.ai).a(dgx.aA);
      this.a(dgx.ai, dgx.dd, dgx.do);
      this.a(dgx.B, dgx.fX, nr.e.b);
      this.b(dgx.aI, ok.s);
      this.l(dgx.Z).d(dgx.Z).a(dgx.at);
      this.l(dgx.aj).d(dgx.aj).a(dgx.aB);
      this.a(dgx.aj, dgx.de, dgx.dp);
      this.a(dgx.C, dgx.fY, nr.e.b);
      this.b(dgx.aJ, ok.s);
      this.l(dgx.W).c(dgx.W).a(dgx.aq);
      this.l(dgx.ag).c(dgx.ag).a(dgx.ay);
      this.a(dgx.ag, dgx.dc, dgx.dn);
      this.a(dgx.z, dgx.fV, nr.e.b);
      this.b(dgx.aG, ok.s);
      this.l(dgx.U).c(dgx.U).a(dgx.ao);
      this.l(dgx.al).c(dgx.al).a(dgx.aw);
      this.a(dgx.al, dgx.da, dgx.dl);
      this.a(dgx.x, dgx.fT, nr.e.b);
      this.b(dgx.aE, ok.s);
      this.l(dgx.V).c(dgx.V).a(dgx.ap);
      this.l(dgx.af).c(dgx.af).a(dgx.ax);
      this.a(dgx.af, dgx.db, dgx.dm);
      this.a(dgx.y, dgx.fU, nr.e.b);
      this.b(dgx.aF, ok.s);
      this.l(dgx.aa).c(dgx.aa).a(dgx.au);
      this.l(dgx.ak).c(dgx.ak).a(dgx.aC);
      this.a(dgx.ak, dgx.dg, dgx.dr);
      this.a(dgx.D, dgx.fZ, nr.e.b);
      this.b(dgx.aK, ok.s);
      this.l(dgx.X).c(dgx.X).a(dgx.ar);
      this.l(dgx.ah).c(dgx.ah).a(dgx.az);
      this.a(dgx.ah, dgx.df, dgx.dq);
      this.a(dgx.A, dgx.fW, nr.e.b);
      this.b(dgx.aH, ok.s);
      this.l(dgx.os).b(dgx.os).a(dgx.ou);
      this.l(dgx.ot).b(dgx.ot).a(dgx.ov);
      this.a(dgx.ot, dgx.dh, dgx.dt);
      this.a(dgx.ox, dgx.pm, nr.e.b);
      this.n(dgx.oD, dgx.po);
      this.l(dgx.oj).b(dgx.oj).a(dgx.ol);
      this.l(dgx.ok).b(dgx.ok).a(dgx.om);
      this.a(dgx.ok, dgx.di, dgx.du);
      this.a(dgx.oo, dgx.pn, nr.e.b);
      this.n(dgx.oq, dgx.pp);
      this.l(dgx.ae).d(dgx.ae);
      this.l(dgx.an).d(dgx.an);
      this.a(dgx.v, dgx.dk, dgx.dv);
      this.b(dgx.or, nr.e.b);
      this.a(cvo.dG);
      this.i(dgx.dy);
      this.k(dgx.hY);
      this.u();
      this.n(dgx.cP);
      this.o(dgx.bp);
      this.o(dgx.bq);
      this.o(dgx.hh);
      this.t();
      this.q(dgx.fN);
      this.q(dgx.kG);
      this.q(dgx.kH);
      this.r(dgx.gS);
      this.r(dgx.gT);
      this.r(dgx.gU);
      this.o();
      this.p();
      this.d(dgx.cD, ok.h);
      this.d(dgx.nW, ok.h);
      this.d(dgx.nV, ok.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dgx.eK, dgx.eS);
      this.k(dgx.m, dgx.eO);
      this.k(dgx.eJ, dgx.eR);
      this.k(dgx.eI, dgx.eQ);
      this.az();
      this.k(dgx.eH, dgx.eP);
      this.aA();
      cwv.h().forEach($$0 -> this.a($$0, of.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dgx.hX);
      ny.a<Integer> $$0 = ny.a(duq.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alb $$3 = oi.a(cvo.hC, $$2);
         $$0.a($$1, oa.a().a(ob.c, oh.aa.a(dgx.hX, $$2, oi.h($$3), this.c)));
         oh.bz.a(of.a(cvo.hC, $$2), oi.k($$3), this.c);
      }

      this.b.accept(nx.a(dgx.hX).a($$0));
   }

   private void o(dgv $$0, dgv $$1) {
      this.a($$0.r());
      oi $$2 = oi.b(oi.G($$0));
      oi $$3 = oi.b(oi.a($$0, "_lit"));
      alb $$4 = oh.bJ.a($$0, "_one_candle", $$2, this.c);
      alb $$5 = oh.bK.a($$0, "_two_candles", $$2, this.c);
      alb $$6 = oh.bL.a($$0, "_three_candles", $$2, this.c);
      alb $$7 = oh.bM.a($$0, "_four_candles", $$2, this.c);
      alb $$8 = oh.bJ.a($$0, "_one_candle_lit", $$3, this.c);
      alb $$9 = oh.bK.a($$0, "_two_candles_lit", $$3, this.c);
      alb $$10 = oh.bL.a($$0, "_three_candles_lit", $$3, this.c);
      alb $$11 = oh.bM.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(duq.az, duq.r)
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
      alb $$12 = oh.bN.a($$1, oi.a($$0, false), this.c);
      alb $$13 = oh.bN.a($$1, "_lit", oi.a($$0, true), this.c);
      this.b.accept(nx.a($$1).a(a(duq.r, $$13, $$12)));
   }

   class a {
      private final alb b;

      public a(final alb $$0, final dgv $$1) {
         this.b = oh.aa.a($$0, oi.u($$1), nr.this.c);
      }

      public nr.a a(dgv... $$0) {
         for (dgv $$1 : $$0) {
            nr.this.b.accept(nr.c($$1, this.b));
         }

         return this;
      }

      public nr.a b(dgv... $$0) {
         for (dgv $$1 : $$0) {
            nr.this.c($$1);
         }

         return this.a($$0);
      }

      public nr.a a(og $$0, dgv... $$1) {
         for (dgv $$2 : $$1) {
            $$0.a(of.a($$2.r()), oi.u($$2), nr.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final oi b;
      private final Map<og, alb> c = Maps.newHashMap();
      @Nullable
      private ly d;
      @Nullable
      private alb e;
      private final Set<dgv> f = new HashSet<>();

      public b(final oi $$0) {
         this.b = $$0;
      }

      public nr.b a(dgv $$0, og $$1) {
         this.e = $$1.a($$0, this.b, nr.this.c);
         if (nr.this.f.containsKey($$0)) {
            nr.this.b.accept(nr.this.f.get($$0).create($$0, this.e, this.b, nr.this.c));
         } else {
            nr.this.b.accept(nr.c($$0, this.e));
         }

         return this;
      }

      public nr.b a(dgv $$0, dgv $$1) {
         alb $$2 = of.a($$0);
         nr.this.b.accept(nr.c($$1, $$2));
         nr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nr.b a(dgv $$0) {
         alb $$1 = oh.s.a($$0, this.b, nr.this.c);
         alb $$2 = oh.t.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.b($$0, $$1, $$2));
         alb $$3 = oh.u.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b b(dgv $$0) {
         alb $$1 = oh.M.a($$0, this.b, nr.this.c);
         alb $$2 = oh.N.a($$0, this.b, nr.this.c);
         alb $$3 = oh.O.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3));
         alb $$4 = oh.P.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$4);
         return this;
      }

      public nr.b c(dgv $$0) {
         oi $$1 = oi.p($$0);
         alb $$2 = oh.D.a($$0, $$1, nr.this.c);
         alb $$3 = oh.E.a($$0, $$1, nr.this.c);
         alb $$4 = oh.F.a($$0, $$1, nr.this.c);
         alb $$5 = oh.G.a($$0, $$1, nr.this.c);
         alb $$6 = oh.H.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, $$6));
         alb $$7 = oh.I.a($$0, $$1, nr.this.c);
         nr.this.a($$0, $$7);
         return this;
      }

      public nr.b d(dgv $$0) {
         alb $$1 = oh.J.a($$0, this.b, nr.this.c);
         alb $$2 = oh.K.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$1, $$2));
         alb $$3 = oh.L.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b e(dgv $$0) {
         oi $$1 = oi.p($$0);
         alb $$2 = oh.R.a($$0, $$1, nr.this.c);
         alb $$3 = oh.Q.a($$0, $$1, nr.this.c);
         alb $$4 = oh.T.a($$0, $$1, nr.this.c);
         alb $$5 = oh.S.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nr.b f(dgv $$0) {
         alb $$1 = oh.V.a($$0, this.b, nr.this.c);
         alb $$2 = oh.U.a($$0, this.b, nr.this.c);
         alb $$3 = oh.X.a($$0, this.b, nr.this.c);
         alb $$4 = oh.W.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nr.b g(dgv $$0) {
         alb $$1 = oh.Y.a($$0, this.b, nr.this.c);
         alb $$2 = oh.Z.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.e($$0, $$1, $$2));
         return this;
      }

      public nr.b h(dgv $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dgv $$1 = this.d.b().get(ly.b.r);
            alb $$2 = oh.aa.a($$0, this.b, nr.this.c);
            nr.this.b.accept(nr.c($$0, $$2));
            nr.this.b.accept(nr.c($$1, $$2));
            nr.this.a($$0.r());
            nr.this.c($$1);
            return this;
         }
      }

      public nr.b i(dgv $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alb $$1 = this.a(oh.ab, $$0);
            alb $$2 = this.a(oh.ac, $$0);
            nr.this.b.accept(nr.e($$0, $$1, $$2, this.e));
            nr.this.a($$0, $$1);
            return this;
         }
      }

      public nr.b j(dgv $$0) {
         alb $$1 = this.a(oh.af, $$0);
         alb $$2 = this.a(oh.ae, $$0);
         alb $$3 = this.a(oh.ag, $$0);
         nr.this.b.accept(nr.b($$0, $$1, $$2, $$3));
         nr.this.a($$0, $$2);
         return this;
      }

      private nr.b k(dgv $$0) {
         ok $$1 = nr.this.g.getOrDefault($$0, ok.a.get($$0));
         alb $$2 = $$1.a($$0, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$2));
         return this;
      }

      private nr.b l(dgv $$0) {
         nr.this.i($$0);
         return this;
      }

      private void m(dgv $$0) {
         if (nr.this.e.contains($$0)) {
            nr.this.k($$0);
         } else {
            nr.this.j($$0);
         }
      }

      private alb a(og $$0, dgv $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nr.this.c));
      }

      public nr.b a(ly $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nr.b, dgv> $$2 = nr.h.get($$0x);
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
      nu create(dgv var1, alb var2, oi var3, BiConsumer<alb, Supplier<JsonElement>> var4);
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

      public nr.f a(dgv $$0) {
         oi $$1 = this.b.c(oj.d, this.b.a(oj.i));
         alb $$2 = oh.j.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$2));
         return this;
      }

      public nr.f b(dgv $$0) {
         alb $$1 = oh.j.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1));
         return this;
      }

      public nr.f c(dgv $$0) {
         alb $$1 = oh.j.a($$0, this.b, nr.this.c);
         alb $$2 = oh.k.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1, $$2));
         return this;
      }

      public nr.f d(dgv $$0) {
         nr.this.b.accept(nr.a($$0, this.b, nr.this.c));
         return this;
      }
   }
}
