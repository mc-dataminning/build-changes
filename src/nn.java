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

public class nn {
   final Consumer<nq> b;
   final BiConsumer<akq, Supplier<JsonElement>> c;
   private final Consumer<cuj> d;
   final List<dfw> e = ImmutableList.of(dfy.ey, dfy.eE, dfy.hY);
   final Map<dfw, nn.c> f = ImmutableMap.builder().put(dfy.b, nn::a).put(dfy.sJ, nn::c).put(dfy.eM, nn::b).build();
   final Map<dfw, og> g = ImmutableMap.builder()
      .put(dfy.aV, og.y.get(dfy.aV))
      .put(dfy.jp, og.y.get(dfy.jp))
      .put(dfy.jS, og.a(oe.a(dfy.aV, "_top")))
      .put(dfy.jU, og.a(oe.a(dfy.jp, "_top")))
      .put(dfy.aX, og.d.get(dfy.aV).a($$0x -> $$0x.a(of.i, oe.G(dfy.aX))))
      .put(dfy.jr, og.d.get(dfy.jp).a($$0x -> $$0x.a(of.i, oe.G(dfy.jr))))
      .put(dfy.hd, og.d.get(dfy.hd))
      .put(dfy.jT, og.a(oe.a(dfy.hd, "_bottom")))
      .put(dfy.pr, og.z.get(dfy.pr))
      .put(dfy.sJ, og.z.get(dfy.sJ))
      .put(dfy.he, og.d.get(dfy.he).a($$0x -> $$0x.a(of.i, oe.G(dfy.he))))
      .put(dfy.aW, og.d.get(dfy.aW).a($$0x -> {
         $$0x.a(of.d, oe.a(dfy.aV, "_top"));
         $$0x.a(of.i, oe.G(dfy.aW));
      }))
      .put(dfy.jq, og.d.get(dfy.jq).a($$0x -> {
         $$0x.a(of.d, oe.a(dfy.jp, "_top"));
         $$0x.a(of.i, oe.G(dfy.jq));
      }))
      .put(dfy.qM, og.z.get(dfy.qM))
      .put(dfy.qH, og.z.get(dfy.qH))
      .build();
   static final Map<lx.b, BiConsumer<nn.b, dfw>> h = ImmutableMap.builder()
      .put(lx.b.a, nn.b::a)
      .put(lx.b.e, nn.b::l)
      .put(lx.b.b, nn.b::k)
      .put(lx.b.c, nn.b::k)
      .put(lx.b.f, nn.b::c)
      .put(lx.b.g, nn.b::d)
      .put(lx.b.h, nn.b::e)
      .put(lx.b.i, nn.b::f)
      .put(lx.b.k, nn.b::h)
      .put(lx.b.l, nn.b::i)
      .put(lx.b.m, nn.b::j)
      .put(lx.b.n, nn.b::g)
      .put(lx.b.p, nn.b::m)
      .put(lx.b.q, nn.b::b)
      .build();
   public static final List<Pair<dtr, Function<akq, nw>>> a = List.of(
      Pair.of(dtq.L, (Function<akq, nw>)$$0 -> nw.a().a(nx.c, $$0)),
      Pair.of(dtq.M, (Function<akq, nw>)$$0 -> nw.a().a(nx.c, $$0).a(nx.b, nx.a.b).a(nx.d, true)),
      Pair.of(dtq.N, (Function<akq, nw>)$$0 -> nw.a().a(nx.c, $$0).a(nx.b, nx.a.c).a(nx.d, true)),
      Pair.of(dtq.O, (Function<akq, nw>)$$0 -> nw.a().a(nx.c, $$0).a(nx.b, nx.a.d).a(nx.d, true)),
      Pair.of(dtq.J, (Function<akq, nw>)$$0 -> nw.a().a(nx.c, $$0).a(nx.a, nx.a.d).a(nx.d, true)),
      Pair.of(dtq.K, (Function<akq, nw>)$$0 -> nw.a().a(nx.c, $$0).a(nx.a, nx.a.b).a(nx.d, true))
   );
   private static final Map<nn.d, akq> i = new HashMap<>();

   private static nq a(dfw $$0, akq $$1, oe $$2, BiConsumer<akq, Supplier<JsonElement>> $$3) {
      akq $$4 = od.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nq b(dfw $$0, akq $$1, oe $$2, BiConsumer<akq, Supplier<JsonElement>> $$3) {
      akq $$4 = od.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nq c(dfw $$0, akq $$1, oe $$2, BiConsumer<akq, Supplier<JsonElement>> $$3) {
      akq $$4 = od.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nn(Consumer<nq> $$0, BiConsumer<akq, Supplier<JsonElement>> $$1, Consumer<cuj> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dfw $$0) {
      this.d.accept($$0.r());
   }

   void a(dfw $$0, akq $$1) {
      this.c.accept(ob.a($$0.r()), new oa($$1));
   }

   private void a(cuj $$0, akq $$1) {
      this.c.accept(ob.a($$0), new oa($$1));
   }

   void a(cuj $$0) {
      od.bx.a(ob.a($$0), oe.b($$0), this.c);
   }

   private void d(dfw $$0) {
      cuj $$1 = $$0.r();
      if ($$1 != cur.a) {
         od.bx.a(ob.a($$1), oe.F($$0), this.c);
      }
   }

   private void a(dfw $$0, String $$1) {
      cuj $$2 = $$0.r();
      od.bx.a(ob.a($$2), oe.k(oe.a($$0, $$1)), this.c);
   }

   private static nu b() {
      return nu.a(dtq.R).a(ji.f, nw.a().a(nx.b, nx.a.b)).a(ji.d, nw.a().a(nx.b, nx.a.c)).a(ji.e, nw.a().a(nx.b, nx.a.d)).a(ji.c, nw.a());
   }

   private static nu c() {
      return nu.a(dtq.R).a(ji.d, nw.a()).a(ji.e, nw.a().a(nx.b, nx.a.b)).a(ji.c, nw.a().a(nx.b, nx.a.c)).a(ji.f, nw.a().a(nx.b, nx.a.d));
   }

   private static nu d() {
      return nu.a(dtq.R).a(ji.f, nw.a()).a(ji.d, nw.a().a(nx.b, nx.a.b)).a(ji.e, nw.a().a(nx.b, nx.a.c)).a(ji.c, nw.a().a(nx.b, nx.a.d));
   }

   private static nu e() {
      return nu.a(dtq.P)
         .a(ji.a, nw.a().a(nx.a, nx.a.b))
         .a(ji.b, nw.a().a(nx.a, nx.a.d))
         .a(ji.c, nw.a())
         .a(ji.d, nw.a().a(nx.b, nx.a.c))
         .a(ji.e, nw.a().a(nx.b, nx.a.d))
         .a(ji.f, nw.a().a(nx.b, nx.a.b));
   }

   private static nt b(dfw $$0, akq $$1) {
      return nt.a($$0, a($$1));
   }

   private static nw[] a(akq $$0) {
      return new nw[]{nw.a().a(nx.c, $$0), nw.a().a(nx.c, $$0).a(nx.b, nx.a.b), nw.a().a(nx.c, $$0).a(nx.b, nx.a.c), nw.a().a(nx.c, $$0).a(nx.b, nx.a.d)};
   }

   private static nt a(dfw $$0, akq $$1, akq $$2) {
      return nt.a($$0, nw.a().a(nx.c, $$1), nw.a().a(nx.c, $$2), nw.a().a(nx.c, $$1).a(nx.b, nx.a.c), nw.a().a(nx.c, $$2).a(nx.b, nx.a.c));
   }

   private static nu a(dtr $$0, akq $$1, akq $$2) {
      return nu.a($$0).a(true, nw.a().a(nx.c, $$1)).a(false, nw.a().a(nx.c, $$2));
   }

   private void e(dfw $$0) {
      akq $$1 = og.a.create($$0, this.c);
      akq $$2 = og.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dfw $$0) {
      akq $$1 = og.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dfw $$0) {
      this.b.accept(nt.a($$0).a(nu.a(dtq.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akq $$3 = oe.a($$0, $$2);
         return nw.a().a(nx.c, od.c.a($$0, $$2, new oe().a(of.a, $$3), this.c));
      })));
      this.a($$0, oe.a($$0, "_0"));
   }

   static nq b(dfw $$0, akq $$1, akq $$2) {
      return nt.a($$0)
         .a(nu.a(dtq.w).a(false, nw.a().a(nx.c, $$1)).a(true, nw.a().a(nx.c, $$2)))
         .a(
            nu.a(dtq.U, dtq.R)
               .a(dtl.a, ji.f, nw.a().a(nx.b, nx.a.b))
               .a(dtl.a, ji.e, nw.a().a(nx.b, nx.a.d))
               .a(dtl.a, ji.d, nw.a().a(nx.b, nx.a.c))
               .a(dtl.a, ji.c, nw.a())
               .a(dtl.b, ji.f, nw.a().a(nx.b, nx.a.b).a(nx.a, nx.a.b).a(nx.d, true))
               .a(dtl.b, ji.e, nw.a().a(nx.b, nx.a.d).a(nx.a, nx.a.b).a(nx.d, true))
               .a(dtl.b, ji.d, nw.a().a(nx.b, nx.a.c).a(nx.a, nx.a.b).a(nx.d, true))
               .a(dtl.b, ji.c, nw.a().a(nx.a, nx.a.b).a(nx.d, true))
               .a(dtl.c, ji.f, nw.a().a(nx.b, nx.a.d).a(nx.a, nx.a.c))
               .a(dtl.c, ji.e, nw.a().a(nx.b, nx.a.b).a(nx.a, nx.a.c))
               .a(dtl.c, ji.d, nw.a().a(nx.a, nx.a.c))
               .a(dtl.c, ji.c, nw.a().a(nx.b, nx.a.c).a(nx.a, nx.a.c))
         );
   }

   private static nu.d<ji, dtw, dtv, Boolean> a(nu.d<ji, dtw, dtv, Boolean> $$0, dtw $$1, akq $$2, akq $$3, akq $$4, akq $$5) {
      return $$0.a(ji.f, $$1, dtv.a, false, nw.a().a(nx.c, $$2))
         .a(ji.d, $$1, dtv.a, false, nw.a().a(nx.c, $$2).a(nx.b, nx.a.b))
         .a(ji.e, $$1, dtv.a, false, nw.a().a(nx.c, $$2).a(nx.b, nx.a.c))
         .a(ji.c, $$1, dtv.a, false, nw.a().a(nx.c, $$2).a(nx.b, nx.a.d))
         .a(ji.f, $$1, dtv.b, false, nw.a().a(nx.c, $$4))
         .a(ji.d, $$1, dtv.b, false, nw.a().a(nx.c, $$4).a(nx.b, nx.a.b))
         .a(ji.e, $$1, dtv.b, false, nw.a().a(nx.c, $$4).a(nx.b, nx.a.c))
         .a(ji.c, $$1, dtv.b, false, nw.a().a(nx.c, $$4).a(nx.b, nx.a.d))
         .a(ji.f, $$1, dtv.a, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.b))
         .a(ji.d, $$1, dtv.a, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.c))
         .a(ji.e, $$1, dtv.a, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.d))
         .a(ji.c, $$1, dtv.a, true, nw.a().a(nx.c, $$3))
         .a(ji.f, $$1, dtv.b, true, nw.a().a(nx.c, $$5).a(nx.b, nx.a.d))
         .a(ji.d, $$1, dtv.b, true, nw.a().a(nx.c, $$5))
         .a(ji.e, $$1, dtv.b, true, nw.a().a(nx.c, $$5).a(nx.b, nx.a.b))
         .a(ji.c, $$1, dtv.b, true, nw.a().a(nx.c, $$5).a(nx.b, nx.a.c));
   }

   private static nq a(dfw $$0, akq $$1, akq $$2, akq $$3, akq $$4, akq $$5, akq $$6, akq $$7, akq $$8) {
      return nt.a($$0).a(a(a(nu.a(dtq.R, dtq.ae, dtq.be, dtq.u), dtw.b, $$1, $$2, $$3, $$4), dtw.a, $$5, $$6, $$7, $$8));
   }

   static nq a(dfw $$0, akq $$1, akq $$2, akq $$3, akq $$4, akq $$5) {
      return ns.a($$0)
         .a(nw.a().a(nx.c, $$1))
         .a(nr.a().a(dtq.L, true), nw.a().a(nx.c, $$2).a(nx.d, false))
         .a(nr.a().a(dtq.M, true), nw.a().a(nx.c, $$3).a(nx.d, false))
         .a(nr.a().a(dtq.N, true), nw.a().a(nx.c, $$4).a(nx.d, false))
         .a(nr.a().a(dtq.O, true), nw.a().a(nx.c, $$5).a(nx.d, false));
   }

   static nq c(dfw $$0, akq $$1, akq $$2) {
      return ns.a($$0)
         .a(nw.a().a(nx.c, $$1))
         .a(nr.a().a(dtq.L, true), nw.a().a(nx.c, $$2).a(nx.d, true))
         .a(nr.a().a(dtq.M, true), nw.a().a(nx.c, $$2).a(nx.b, nx.a.b).a(nx.d, true))
         .a(nr.a().a(dtq.N, true), nw.a().a(nx.c, $$2).a(nx.b, nx.a.c).a(nx.d, true))
         .a(nr.a().a(dtq.O, true), nw.a().a(nx.c, $$2).a(nx.b, nx.a.d).a(nx.d, true));
   }

   static nq a(dfw $$0, akq $$1, akq $$2, akq $$3) {
      return ns.a($$0)
         .a(nr.a().a(dtq.J, true), nw.a().a(nx.c, $$1))
         .a(nr.a().a(dtq.X, dum.b), nw.a().a(nx.c, $$2).a(nx.d, true))
         .a(nr.a().a(dtq.W, dum.b), nw.a().a(nx.c, $$2).a(nx.b, nx.a.b).a(nx.d, true))
         .a(nr.a().a(dtq.Y, dum.b), nw.a().a(nx.c, $$2).a(nx.b, nx.a.c).a(nx.d, true))
         .a(nr.a().a(dtq.Z, dum.b), nw.a().a(nx.c, $$2).a(nx.b, nx.a.d).a(nx.d, true))
         .a(nr.a().a(dtq.X, dum.c), nw.a().a(nx.c, $$3).a(nx.d, true))
         .a(nr.a().a(dtq.W, dum.c), nw.a().a(nx.c, $$3).a(nx.b, nx.a.b).a(nx.d, true))
         .a(nr.a().a(dtq.Y, dum.c), nw.a().a(nx.c, $$3).a(nx.b, nx.a.c).a(nx.d, true))
         .a(nr.a().a(dtq.Z, dum.c), nw.a().a(nx.c, $$3).a(nx.b, nx.a.d).a(nx.d, true));
   }

   static nq a(dfw $$0, akq $$1, akq $$2, akq $$3, akq $$4, boolean $$5) {
      return nt.a($$0, nw.a().a(nx.d, $$5))
         .a(c())
         .a(
            nu.a(dtq.q, dtq.u)
               .a(false, false, nw.a().a(nx.c, $$2))
               .a(true, false, nw.a().a(nx.c, $$4))
               .a(false, true, nw.a().a(nx.c, $$1))
               .a(true, true, nw.a().a(nx.c, $$3))
         );
   }

   static nq b(dfw $$0, akq $$1, akq $$2, akq $$3) {
      return nt.a($$0)
         .a(
            nu.a(dtq.R, dtq.af, dtq.bi)
               .a(ji.f, dtz.b, duj.a, nw.a().a(nx.c, $$2))
               .a(ji.e, dtz.b, duj.a, nw.a().a(nx.c, $$2).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.d, dtz.b, duj.a, nw.a().a(nx.c, $$2).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.c, dtz.b, duj.a, nw.a().a(nx.c, $$2).a(nx.b, nx.a.d).a(nx.d, true))
               .a(ji.f, dtz.b, duj.e, nw.a().a(nx.c, $$3))
               .a(ji.e, dtz.b, duj.e, nw.a().a(nx.c, $$3).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.d, dtz.b, duj.e, nw.a().a(nx.c, $$3).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.c, dtz.b, duj.e, nw.a().a(nx.c, $$3).a(nx.b, nx.a.d).a(nx.d, true))
               .a(ji.f, dtz.b, duj.d, nw.a().a(nx.c, $$3).a(nx.b, nx.a.d).a(nx.d, true))
               .a(ji.e, dtz.b, duj.d, nw.a().a(nx.c, $$3).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.d, dtz.b, duj.d, nw.a().a(nx.c, $$3))
               .a(ji.c, dtz.b, duj.d, nw.a().a(nx.c, $$3).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.f, dtz.b, duj.c, nw.a().a(nx.c, $$1))
               .a(ji.e, dtz.b, duj.c, nw.a().a(nx.c, $$1).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.d, dtz.b, duj.c, nw.a().a(nx.c, $$1).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.c, dtz.b, duj.c, nw.a().a(nx.c, $$1).a(nx.b, nx.a.d).a(nx.d, true))
               .a(ji.f, dtz.b, duj.b, nw.a().a(nx.c, $$1).a(nx.b, nx.a.d).a(nx.d, true))
               .a(ji.e, dtz.b, duj.b, nw.a().a(nx.c, $$1).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.d, dtz.b, duj.b, nw.a().a(nx.c, $$1))
               .a(ji.c, dtz.b, duj.b, nw.a().a(nx.c, $$1).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.f, dtz.a, duj.a, nw.a().a(nx.c, $$2).a(nx.a, nx.a.c).a(nx.d, true))
               .a(ji.e, dtz.a, duj.a, nw.a().a(nx.c, $$2).a(nx.a, nx.a.c).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.d, dtz.a, duj.a, nw.a().a(nx.c, $$2).a(nx.a, nx.a.c).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.c, dtz.a, duj.a, nw.a().a(nx.c, $$2).a(nx.a, nx.a.c).a(nx.b, nx.a.d).a(nx.d, true))
               .a(ji.f, dtz.a, duj.e, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.e, dtz.a, duj.e, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.d).a(nx.d, true))
               .a(ji.d, dtz.a, duj.e, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.c, dtz.a, duj.e, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.d, true))
               .a(ji.f, dtz.a, duj.d, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.d, true))
               .a(ji.e, dtz.a, duj.d, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.d, dtz.a, duj.d, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.c, dtz.a, duj.d, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.d).a(nx.d, true))
               .a(ji.f, dtz.a, duj.c, nw.a().a(nx.c, $$1).a(nx.a, nx.a.c).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.e, dtz.a, duj.c, nw.a().a(nx.c, $$1).a(nx.a, nx.a.c).a(nx.b, nx.a.d).a(nx.d, true))
               .a(ji.d, dtz.a, duj.c, nw.a().a(nx.c, $$1).a(nx.a, nx.a.c).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.c, dtz.a, duj.c, nw.a().a(nx.c, $$1).a(nx.a, nx.a.c).a(nx.d, true))
               .a(ji.f, dtz.a, duj.b, nw.a().a(nx.c, $$1).a(nx.a, nx.a.c).a(nx.d, true))
               .a(ji.e, dtz.a, duj.b, nw.a().a(nx.c, $$1).a(nx.a, nx.a.c).a(nx.b, nx.a.c).a(nx.d, true))
               .a(ji.d, dtz.a, duj.b, nw.a().a(nx.c, $$1).a(nx.a, nx.a.c).a(nx.b, nx.a.b).a(nx.d, true))
               .a(ji.c, dtz.a, duj.b, nw.a().a(nx.c, $$1).a(nx.a, nx.a.c).a(nx.b, nx.a.d).a(nx.d, true))
         );
   }

   private static nq c(dfw $$0, akq $$1, akq $$2, akq $$3) {
      return nt.a($$0)
         .a(
            nu.a(dtq.R, dtq.af, dtq.u)
               .a(ji.c, dtz.b, false, nw.a().a(nx.c, $$2))
               .a(ji.d, dtz.b, false, nw.a().a(nx.c, $$2).a(nx.b, nx.a.c))
               .a(ji.f, dtz.b, false, nw.a().a(nx.c, $$2).a(nx.b, nx.a.b))
               .a(ji.e, dtz.b, false, nw.a().a(nx.c, $$2).a(nx.b, nx.a.d))
               .a(ji.c, dtz.a, false, nw.a().a(nx.c, $$1))
               .a(ji.d, dtz.a, false, nw.a().a(nx.c, $$1).a(nx.b, nx.a.c))
               .a(ji.f, dtz.a, false, nw.a().a(nx.c, $$1).a(nx.b, nx.a.b))
               .a(ji.e, dtz.a, false, nw.a().a(nx.c, $$1).a(nx.b, nx.a.d))
               .a(ji.c, dtz.b, true, nw.a().a(nx.c, $$3))
               .a(ji.d, dtz.b, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.c))
               .a(ji.f, dtz.b, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.b))
               .a(ji.e, dtz.b, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.d))
               .a(ji.c, dtz.a, true, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.c))
               .a(ji.d, dtz.a, true, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.a))
               .a(ji.f, dtz.a, true, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.d))
               .a(ji.e, dtz.a, true, nw.a().a(nx.c, $$3).a(nx.a, nx.a.c).a(nx.b, nx.a.b))
         );
   }

   private static nq d(dfw $$0, akq $$1, akq $$2, akq $$3) {
      return nt.a($$0)
         .a(
            nu.a(dtq.R, dtq.af, dtq.u)
               .a(ji.c, dtz.b, false, nw.a().a(nx.c, $$2))
               .a(ji.d, dtz.b, false, nw.a().a(nx.c, $$2))
               .a(ji.f, dtz.b, false, nw.a().a(nx.c, $$2))
               .a(ji.e, dtz.b, false, nw.a().a(nx.c, $$2))
               .a(ji.c, dtz.a, false, nw.a().a(nx.c, $$1))
               .a(ji.d, dtz.a, false, nw.a().a(nx.c, $$1))
               .a(ji.f, dtz.a, false, nw.a().a(nx.c, $$1))
               .a(ji.e, dtz.a, false, nw.a().a(nx.c, $$1))
               .a(ji.c, dtz.b, true, nw.a().a(nx.c, $$3))
               .a(ji.d, dtz.b, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.c))
               .a(ji.f, dtz.b, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.b))
               .a(ji.e, dtz.b, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.d))
               .a(ji.c, dtz.a, true, nw.a().a(nx.c, $$3))
               .a(ji.d, dtz.a, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.c))
               .a(ji.f, dtz.a, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.b))
               .a(ji.e, dtz.a, true, nw.a().a(nx.c, $$3).a(nx.b, nx.a.d))
         );
   }

   static nt c(dfw $$0, akq $$1) {
      return nt.a($$0, nw.a().a(nx.c, $$1));
   }

   private static nu f() {
      return nu.a(dtq.I).a(ji.a.b, nw.a()).a(ji.a.c, nw.a().a(nx.a, nx.a.b)).a(ji.a.a, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.b));
   }

   static nq a(dfw $$0, oe $$1, BiConsumer<akq, Supplier<JsonElement>> $$2) {
      akq $$3 = od.g.a($$0, $$1, $$2);
      akq $$4 = od.h.a($$0, $$1, $$2);
      akq $$5 = od.i.a($$0, $$1, $$2);
      akq $$6 = od.j.a($$0, $$1, $$2);
      return nt.a($$0, nw.a().a(nx.c, $$6)).a(nu.a(dtq.I).a(ji.a.a, nw.a().a(nx.c, $$3)).a(ji.a.b, nw.a().a(nx.c, $$4)).a(ji.a.c, nw.a().a(nx.c, $$5)));
   }

   static nq d(dfw $$0, akq $$1) {
      return nt.a($$0, nw.a().a(nx.c, $$1)).a(f());
   }

   private void e(dfw $$0, akq $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dfw $$0, og.a $$1) {
      akq $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dfw $$0, og.a $$1) {
      akq $$2 = $$1.create($$0, this.c);
      this.b.accept(nt.a($$0, nw.a().a(nx.c, $$2)).a(b()));
   }

   static nq d(dfw $$0, akq $$1, akq $$2) {
      return nt.a($$0)
         .a(
            nu.a(dtq.I)
               .a(ji.a.b, nw.a().a(nx.c, $$1))
               .a(ji.a.c, nw.a().a(nx.c, $$2).a(nx.a, nx.a.b))
               .a(ji.a.a, nw.a().a(nx.c, $$2).a(nx.a, nx.a.b).a(nx.b, nx.a.b))
         );
   }

   private void a(dfw $$0, og.a $$1, og.a $$2) {
      akq $$3 = $$1.create($$0, this.c);
      akq $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akq a(dfw $$0, String $$1, oc $$2, Function<akq, oe> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oe.a($$0, $$1)), this.c);
   }

   static nq e(dfw $$0, akq $$1, akq $$2) {
      return nt.a($$0).a(a(dtq.w, $$2, $$1));
   }

   static nq e(dfw $$0, akq $$1, akq $$2, akq $$3) {
      return nt.a($$0).a(nu.a(dtq.bh).a(dui.b, nw.a().a(nx.c, $$1)).a(dui.a, nw.a().a(nx.c, $$2)).a(dui.c, nw.a().a(nx.c, $$3)));
   }

   public void a(dfw $$0) {
      this.b($$0, og.a);
   }

   public void b(dfw $$0, og.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dfw $$0, oe $$1, oc $$2) {
      akq $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nn.b h(dfw $$0) {
      og $$1 = this.g.getOrDefault($$0, og.a.get($$0));
      return new nn.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dfw $$0, dfw $$1, dfw $$2) {
      oe $$3 = oe.u($$0);
      akq $$4 = od.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dfw $$0) {
      oe $$1 = oe.t($$0);
      akq $$2 = od.v.a($$0, $$1, this.c);
      akq $$3 = od.w.a($$0, $$1, this.c);
      akq $$4 = od.x.a($$0, $$1, this.c);
      akq $$5 = od.y.a($$0, $$1, this.c);
      akq $$6 = od.z.a($$0, $$1, this.c);
      akq $$7 = od.A.a($$0, $$1, this.c);
      akq $$8 = od.B.a($$0, $$1, this.c);
      akq $$9 = od.C.a($$0, $$1, this.c);
      this.a($$0.r());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dfw $$0, dfw $$1) {
      akq $$2 = od.v.a($$0);
      akq $$3 = od.w.a($$0);
      akq $$4 = od.x.a($$0);
      akq $$5 = od.y.a($$0);
      akq $$6 = od.z.a($$0);
      akq $$7 = od.A.a($$0);
      akq $$8 = od.B.a($$0);
      akq $$9 = od.C.a($$0);
      this.a($$1, ob.a($$0.r()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dfw $$0) {
      oe $$1 = oe.b($$0);
      akq $$2 = od.ak.a($$0, $$1, this.c);
      akq $$3 = od.al.a($$0, $$1, this.c);
      akq $$4 = od.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dfw $$0) {
      oe $$1 = oe.b($$0);
      akq $$2 = od.ah.a($$0, $$1, this.c);
      akq $$3 = od.ai.a($$0, $$1, this.c);
      akq $$4 = od.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dfw $$0, dfw $$1) {
      akq $$2 = od.ah.a($$0);
      akq $$3 = od.ai.a($$0);
      akq $$4 = od.aj.a($$0);
      this.a($$1, ob.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dfy.sD);
      akq $$0 = ob.a(dfy.sD);
      akq $$1 = ob.a(dfy.sD, "_partial_tilt");
      akq $$2 = ob.a(dfy.sD, "_full_tilt");
      this.b
         .accept(
            nt.a(dfy.sD)
               .a(b())
               .a(nu.a(dtq.bl).a(dul.a, nw.a().a(nx.c, $$0)).a(dul.b, nw.a().a(nx.c, $$0)).a(dul.c, nw.a().a(nx.c, $$1)).a(dul.d, nw.a().a(nx.c, $$2)))
         );
   }

   private nn.f l(dfw $$0) {
      return new nn.f(oe.n($$0));
   }

   private void m(dfw $$0) {
      this.c($$0, $$0);
   }

   private void c(dfw $$0, dfw $$1) {
      this.b.accept(c($$0, ob.a($$1)));
   }

   private void a(dfw $$0, nn.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dfw $$0, nn.e $$1, oe $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfw $$0, nn.e $$1) {
      oe $$2 = oe.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfw $$0, nn.e $$1, oe $$2) {
      akq $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dfw $$0, nn.e $$1, dud<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         nu $$4 = nu.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            oe $$5 = oe.c(oe.a($$0, $$4x));
            akq $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return nw.a().a(nx.c, $$6);
         });
         this.a($$0.r());
         this.b.accept(nt.a($$0).a($$4));
      }
   }

   private void a(dfw $$0, dfw $$1, nn.e $$2) {
      this.a($$0, $$2);
      oe $$3 = oe.d($$0);
      akq $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dfw $$0, dfw $$1) {
      og $$2 = og.p.get($$0);
      akq $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akq $$4 = od.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nt.a($$1, nw.a().a(nx.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dfw $$0, dfw $$1) {
      this.a($$0.r());
      oe $$2 = oe.h($$0);
      oe $$3 = oe.a($$0, $$1);
      akq $$4 = od.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nt.a($$1, nw.a().a(nx.c, $$4))
               .a(nu.a(dtq.R).a(ji.e, nw.a()).a(ji.d, nw.a().a(nx.b, nx.a.d)).a(ji.c, nw.a().a(nx.b, nx.a.b)).a(ji.f, nw.a().a(nx.b, nx.a.c)))
         );
      this.b.accept(nt.a($$0).a(nu.a(dtq.av).a($$2x -> nw.a().a(nx.c, od.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dfw $$0 = dfy.kC;
      this.a($$0.r());
      akq $$1 = ob.a($$0, "_top");
      akq $$2 = ob.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dfw $$0 = dfy.kB;
      this.a($$0.r());
      nu $$1 = nu.a(dll.d, dtq.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> nw.a().a(nx.c, ob.a($$0, "_top_stage_" + $$1x));
            case b -> nw.a().a(nx.c, ob.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nt.a($$0).a($$1));
   }

   private void a(dfw $$0, dfw $$1, dfw $$2, dfw $$3, dfw $$4, dfw $$5, dfw $$6, dfw $$7) {
      this.a($$0, nn.e.b);
      this.a($$1, nn.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dfw $$0, nn.e $$1) {
      this.a($$0, "_top");
      akq $$2 = this.a($$0, "_top", $$1.a(), oe::c);
      akq $$3 = this.a($$0, "_bottom", $$1.a(), oe::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dfy.iD, "_front");
      akq $$0 = ob.a(dfy.iD, "_top");
      akq $$1 = this.a(dfy.iD, "_bottom", nn.e.b.a(), oe::c);
      this.f(dfy.iD, $$0, $$1);
   }

   private void k() {
      akq $$0 = this.a(dfy.bx, "_top", od.bk, oe::a);
      akq $$1 = this.a(dfy.bx, "_bottom", od.bk, oe::a);
      this.f(dfy.bx, $$0, $$1);
   }

   private void l() {
      this.c(dfy.sF);
      akq $$0 = ob.a(dfy.sF, "_top");
      akq $$1 = ob.a(dfy.sF, "_bottom");
      this.b.accept(nt.a(dfy.sF).a(b()).a(nu.a(dtq.ae).a(dtw.b, nw.a().a(nx.c, $$1)).a(dtw.a, nw.a().a(nx.c, $$0))));
   }

   private void f(dfw $$0, akq $$1, akq $$2) {
      this.b.accept(nt.a($$0).a(nu.a(dtq.ae).a(dtw.b, nw.a().a(nx.c, $$2)).a(dtw.a, nw.a().a(nx.c, $$1))));
   }

   private void n(dfw $$0) {
      oe $$1 = oe.e($$0);
      oe $$2 = oe.e(oe.a($$0, "_corner"));
      akq $$3 = od.as.a($$0, $$1, this.c);
      akq $$4 = od.at.a($$0, $$2, this.c);
      akq $$5 = od.au.a($$0, $$1, this.c);
      akq $$6 = od.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nt.a($$0)
               .a(
                  nu.a(dtq.ag)
                     .a(due.a, nw.a().a(nx.c, $$3))
                     .a(due.b, nw.a().a(nx.c, $$3).a(nx.b, nx.a.b))
                     .a(due.c, nw.a().a(nx.c, $$5).a(nx.b, nx.a.b))
                     .a(due.d, nw.a().a(nx.c, $$6).a(nx.b, nx.a.b))
                     .a(due.e, nw.a().a(nx.c, $$5))
                     .a(due.f, nw.a().a(nx.c, $$6))
                     .a(due.g, nw.a().a(nx.c, $$4))
                     .a(due.h, nw.a().a(nx.c, $$4).a(nx.b, nx.a.b))
                     .a(due.i, nw.a().a(nx.c, $$4).a(nx.b, nx.a.c))
                     .a(due.j, nw.a().a(nx.c, $$4).a(nx.b, nx.a.d))
               )
         );
   }

   private void o(dfw $$0) {
      akq $$1 = this.a($$0, "", od.as, oe::e);
      akq $$2 = this.a($$0, "", od.au, oe::e);
      akq $$3 = this.a($$0, "", od.av, oe::e);
      akq $$4 = this.a($$0, "_on", od.as, oe::e);
      akq $$5 = this.a($$0, "_on", od.au, oe::e);
      akq $$6 = this.a($$0, "_on", od.av, oe::e);
      nu $$7 = nu.a(dtq.w, dtq.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return nw.a().a(nx.c, $$6x ? $$4 : $$1);
            case b:
               return nw.a().a(nx.c, $$6x ? $$4 : $$1).a(nx.b, nx.a.b);
            case c:
               return nw.a().a(nx.c, $$6x ? $$5 : $$2).a(nx.b, nx.a.b);
            case d:
               return nw.a().a(nx.c, $$6x ? $$6 : $$3).a(nx.b, nx.a.b);
            case e:
               return nw.a().a(nx.c, $$6x ? $$5 : $$2);
            case f:
               return nw.a().a(nx.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(nt.a($$0).a($$7));
   }

   private nn.a a(akq $$0, dfw $$1) {
      return new nn.a($$0, $$1);
   }

   private nn.a f(dfw $$0, dfw $$1) {
      return new nn.a(ob.a($$0), $$1);
   }

   private void a(dfw $$0, cuj $$1) {
      akq $$2 = od.aa.a($$0, oe.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dfw $$0, akq $$1) {
      akq $$2 = od.aa.a($$0, oe.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dfw $$0, dfw $$1) {
      this.a($$0);
      akq $$2 = og.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dfw $$0) {
      this.a($$0.r());
      akq $$1 = og.k.create($$0, this.c);
      akq $$2 = og.l.create($$0, this.c);
      akq $$3 = og.m.create($$0, this.c);
      akq $$4 = og.n.create($$0, this.c);
      this.b
         .accept(
            ns.a($$0)
               .a(nr.a().a(dtq.S, 1, 2, 3, 4).a(dtq.R, ji.c), nw.a().a(nx.c, $$1))
               .a(nr.a().a(dtq.S, 1, 2, 3, 4).a(dtq.R, ji.f), nw.a().a(nx.c, $$1).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.S, 1, 2, 3, 4).a(dtq.R, ji.d), nw.a().a(nx.c, $$1).a(nx.b, nx.a.c))
               .a(nr.a().a(dtq.S, 1, 2, 3, 4).a(dtq.R, ji.e), nw.a().a(nx.c, $$1).a(nx.b, nx.a.d))
               .a(nr.a().a(dtq.S, 2, 3, 4).a(dtq.R, ji.c), nw.a().a(nx.c, $$2))
               .a(nr.a().a(dtq.S, 2, 3, 4).a(dtq.R, ji.f), nw.a().a(nx.c, $$2).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.S, 2, 3, 4).a(dtq.R, ji.d), nw.a().a(nx.c, $$2).a(nx.b, nx.a.c))
               .a(nr.a().a(dtq.S, 2, 3, 4).a(dtq.R, ji.e), nw.a().a(nx.c, $$2).a(nx.b, nx.a.d))
               .a(nr.a().a(dtq.S, 3, 4).a(dtq.R, ji.c), nw.a().a(nx.c, $$3))
               .a(nr.a().a(dtq.S, 3, 4).a(dtq.R, ji.f), nw.a().a(nx.c, $$3).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.S, 3, 4).a(dtq.R, ji.d), nw.a().a(nx.c, $$3).a(nx.b, nx.a.c))
               .a(nr.a().a(dtq.S, 3, 4).a(dtq.R, ji.e), nw.a().a(nx.c, $$3).a(nx.b, nx.a.d))
               .a(nr.a().a(dtq.S, 4).a(dtq.R, ji.c), nw.a().a(nx.c, $$4))
               .a(nr.a().a(dtq.S, 4).a(dtq.R, ji.f), nw.a().a(nx.c, $$4).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.S, 4).a(dtq.R, ji.d), nw.a().a(nx.c, $$4).a(nx.b, nx.a.c))
               .a(nr.a().a(dtq.S, 4).a(dtq.R, ji.e), nw.a().a(nx.c, $$4).a(nx.b, nx.a.d))
         );
   }

   private void a(og.a $$0, dfw... $$1) {
      for (dfw $$2 : $$1) {
         akq $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(og.a $$0, dfw... $$1) {
      for (dfw $$2 : $$1) {
         akq $$3 = $$0.create($$2, this.c);
         this.b.accept(nt.a($$2, nw.a().a(nx.c, $$3)).a(c()));
      }
   }

   private void h(dfw $$0, dfw $$1) {
      this.a($$0);
      oe $$2 = oe.b($$0, $$1);
      akq $$3 = od.aI.a($$1, $$2, this.c);
      akq $$4 = od.aJ.a($$1, $$2, this.c);
      akq $$5 = od.aK.a($$1, $$2, this.c);
      akq $$6 = od.aG.a($$1, $$2, this.c);
      akq $$7 = od.aH.a($$1, $$2, this.c);
      cuj $$8 = $$1.r();
      od.bx.a(ob.a($$8), oe.F($$0), this.c);
      this.b
         .accept(
            ns.a($$1)
               .a(nw.a().a(nx.c, $$3))
               .a(nr.a().a(dtq.L, true), nw.a().a(nx.c, $$4))
               .a(nr.a().a(dtq.M, true), nw.a().a(nx.c, $$4).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.N, true), nw.a().a(nx.c, $$5))
               .a(nr.a().a(dtq.O, true), nw.a().a(nx.c, $$5).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.L, false), nw.a().a(nx.c, $$6))
               .a(nr.a().a(dtq.M, false), nw.a().a(nx.c, $$7))
               .a(nr.a().a(dtq.N, false), nw.a().a(nx.c, $$7).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.O, false), nw.a().a(nx.c, $$6).a(nx.b, nx.a.d))
         );
   }

   private void q(dfw $$0) {
      oe $$1 = oe.z($$0);
      akq $$2 = od.aL.a($$0, $$1, this.c);
      akq $$3 = this.a($$0, "_conditional", od.aL, $$1x -> $$1.c(of.i, $$1x));
      this.b.accept(nt.a($$0).a(a(dtq.c, $$3, $$2)).a(e()));
   }

   private void r(dfw $$0) {
      akq $$1 = og.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<nw> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> nw.a().a(nx.c, ob.a(dfy.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dfy.mZ);
      this.b
         .accept(
            ns.a(dfy.mZ)
               .a(nr.a().a(dtq.aq, 0), this.a(0))
               .a(nr.a().a(dtq.aq, 1), this.a(1))
               .a(nr.a().a(dtq.bk, dtm.b), nw.a().a(nx.c, ob.a(dfy.mZ, "_small_leaves")))
               .a(nr.a().a(dtq.bk, dtm.c), nw.a().a(nx.c, ob.a(dfy.mZ, "_large_leaves")))
         );
   }

   private nu n() {
      return nu.a(dtq.P)
         .a(ji.a, nw.a().a(nx.a, nx.a.c))
         .a(ji.b, nw.a())
         .a(ji.c, nw.a().a(nx.a, nx.a.b))
         .a(ji.d, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.c))
         .a(ji.e, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.d))
         .a(ji.f, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.b));
   }

   private void o() {
      akq $$0 = oe.a(dfy.nU, "_top_open");
      this.b
         .accept(
            nt.a(dfy.nU)
               .a(this.n())
               .a(
                  nu.a(dtq.u)
                     .a(false, nw.a().a(nx.c, og.f.create(dfy.nU, this.c)))
                     .a(true, nw.a().a(nx.c, og.f.get(dfy.nU).a($$1 -> $$1.a(of.f, $$0)).a(dfy.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nu a(dud<T> $$0, T $$1, akq $$2, akq $$3) {
      nw $$4 = nw.a().a(nx.c, $$2);
      nw $$5 = nw.a().a(nx.c, $$3);
      return nu.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dfw $$0, Function<dfw, oe> $$1) {
      oe $$2 = $$1.apply($$0).b(of.i, of.c);
      oe $$3 = $$2.c(of.g, oe.a($$0, "_front_honey"));
      akq $$4 = od.q.a($$0, $$2, this.c);
      akq $$5 = od.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nt.a($$0).a(b()).a(a(dtq.aN, 5, $$5, $$4)));
   }

   private void a(dfw $$0, dud<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akq> $$3 = new Int2ObjectOpenHashMap();
         nu $$4 = nu.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akq $$5 = (akq)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, od.aV, oe::g));
            return nw.a().a(nx.c, $$5);
         });
         this.a($$0.r());
         this.b.accept(nt.a($$0).a($$4));
      }
   }

   private void p() {
      akq $$0 = ob.a(dfy.od, "_floor");
      akq $$1 = ob.a(dfy.od, "_ceiling");
      akq $$2 = ob.a(dfy.od, "_wall");
      akq $$3 = ob.a(dfy.od, "_between_walls");
      this.a(cur.wr);
      this.b
         .accept(
            nt.a(dfy.od)
               .a(
                  nu.a(dtq.R, dtq.V)
                     .a(ji.c, dto.a, nw.a().a(nx.c, $$0))
                     .a(ji.d, dto.a, nw.a().a(nx.c, $$0).a(nx.b, nx.a.c))
                     .a(ji.f, dto.a, nw.a().a(nx.c, $$0).a(nx.b, nx.a.b))
                     .a(ji.e, dto.a, nw.a().a(nx.c, $$0).a(nx.b, nx.a.d))
                     .a(ji.c, dto.b, nw.a().a(nx.c, $$1))
                     .a(ji.d, dto.b, nw.a().a(nx.c, $$1).a(nx.b, nx.a.c))
                     .a(ji.f, dto.b, nw.a().a(nx.c, $$1).a(nx.b, nx.a.b))
                     .a(ji.e, dto.b, nw.a().a(nx.c, $$1).a(nx.b, nx.a.d))
                     .a(ji.c, dto.c, nw.a().a(nx.c, $$2).a(nx.b, nx.a.d))
                     .a(ji.d, dto.c, nw.a().a(nx.c, $$2).a(nx.b, nx.a.b))
                     .a(ji.f, dto.c, nw.a().a(nx.c, $$2))
                     .a(ji.e, dto.c, nw.a().a(nx.c, $$2).a(nx.b, nx.a.c))
                     .a(ji.d, dto.d, nw.a().a(nx.c, $$3).a(nx.b, nx.a.b))
                     .a(ji.c, dto.d, nw.a().a(nx.c, $$3).a(nx.b, nx.a.d))
                     .a(ji.f, dto.d, nw.a().a(nx.c, $$3))
                     .a(ji.e, dto.d, nw.a().a(nx.c, $$3).a(nx.b, nx.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nt.a(dfy.nZ, nw.a().a(nx.c, ob.a(dfy.nZ)))
               .a(
                  nu.a(dtq.U, dtq.R)
                     .a(dtl.a, ji.c, nw.a())
                     .a(dtl.a, ji.f, nw.a().a(nx.b, nx.a.b))
                     .a(dtl.a, ji.d, nw.a().a(nx.b, nx.a.c))
                     .a(dtl.a, ji.e, nw.a().a(nx.b, nx.a.d))
                     .a(dtl.b, ji.c, nw.a().a(nx.a, nx.a.b))
                     .a(dtl.b, ji.f, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.b))
                     .a(dtl.b, ji.d, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.c))
                     .a(dtl.b, ji.e, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.d))
                     .a(dtl.c, ji.d, nw.a().a(nx.a, nx.a.c))
                     .a(dtl.c, ji.e, nw.a().a(nx.a, nx.a.c).a(nx.b, nx.a.b))
                     .a(dtl.c, ji.c, nw.a().a(nx.a, nx.a.c).a(nx.b, nx.a.c))
                     .a(dtl.c, ji.f, nw.a().a(nx.a, nx.a.c).a(nx.b, nx.a.d))
               )
         );
   }

   private void d(dfw $$0, og.a $$1) {
      akq $$2 = $$1.create($$0, this.c);
      akq $$3 = oe.a($$0, "_front_on");
      akq $$4 = $$1.get($$0).a($$1x -> $$1x.a(of.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nt.a($$0).a(a(dtq.r, $$4, $$2)).a(b()));
   }

   private void a(dfw... $$0) {
      akq $$1 = ob.a("campfire_off");

      for (dfw $$2 : $$0) {
         akq $$3 = od.bc.a($$2, oe.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nt.a($$2).a(a(dtq.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dfw $$0) {
      akq $$1 = od.bt.a($$0, oe.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dfw $$0) {
      akq $$1;
      if ($$0 == dfy.tj) {
         $$1 = od.bv.a($$0, oe.m($$0), this.c);
      } else {
         $$1 = od.bu.a($$0, oe.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oe $$0 = oe.a(oe.G(dfy.cl), oe.G(dfy.n));
      akq $$1 = od.j.a(dfy.cl, $$0, this.c);
      this.b.accept(c(dfy.cl, $$1));
   }

   private void s() {
      this.a(cur.lH);
      this.b
         .accept(
            ns.a(dfy.cw)
               .a(
                  nr.b(
                     nr.a().a(dtq.ab, duf.c).a(dtq.aa, duf.c).a(dtq.ac, duf.c).a(dtq.ad, duf.c),
                     nr.a().a(dtq.ab, duf.b, duf.a).a(dtq.aa, duf.b, duf.a),
                     nr.a().a(dtq.aa, duf.b, duf.a).a(dtq.ac, duf.b, duf.a),
                     nr.a().a(dtq.ac, duf.b, duf.a).a(dtq.ad, duf.b, duf.a),
                     nr.a().a(dtq.ad, duf.b, duf.a).a(dtq.ab, duf.b, duf.a)
                  ),
                  nw.a().a(nx.c, ob.a("redstone_dust_dot"))
               )
               .a(nr.a().a(dtq.ab, duf.b, duf.a), nw.a().a(nx.c, ob.a("redstone_dust_side0")))
               .a(nr.a().a(dtq.ac, duf.b, duf.a), nw.a().a(nx.c, ob.a("redstone_dust_side_alt0")))
               .a(nr.a().a(dtq.aa, duf.b, duf.a), nw.a().a(nx.c, ob.a("redstone_dust_side_alt1")).a(nx.b, nx.a.d))
               .a(nr.a().a(dtq.ad, duf.b, duf.a), nw.a().a(nx.c, ob.a("redstone_dust_side1")).a(nx.b, nx.a.d))
               .a(nr.a().a(dtq.ab, duf.a), nw.a().a(nx.c, ob.a("redstone_dust_up")))
               .a(nr.a().a(dtq.aa, duf.a), nw.a().a(nx.c, ob.a("redstone_dust_up")).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.ac, duf.a), nw.a().a(nx.c, ob.a("redstone_dust_up")).a(nx.b, nx.a.c))
               .a(nr.a().a(dtq.ad, duf.a), nw.a().a(nx.c, ob.a("redstone_dust_up")).a(nx.b, nx.a.d))
         );
   }

   private void t() {
      this.a(cur.lL);
      this.b
         .accept(
            nt.a(dfy.gY)
               .a(c())
               .a(
                  nu.a(dtq.bd, dtq.w)
                     .a(dtt.a, false, nw.a().a(nx.c, ob.a(dfy.gY)))
                     .a(dtt.a, true, nw.a().a(nx.c, ob.a(dfy.gY, "_on")))
                     .a(dtt.b, false, nw.a().a(nx.c, ob.a(dfy.gY, "_subtract")))
                     .a(dtt.b, true, nw.a().a(nx.c, ob.a(dfy.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oe $$0 = oe.a(dfy.jR);
      oe $$1 = oe.a(oe.a(dfy.jE, "_side"), $$0.a(of.f));
      akq $$2 = od.ab.a(dfy.jE, $$1, this.c);
      akq $$3 = od.ac.a(dfy.jE, $$1, this.c);
      akq $$4 = od.j.b(dfy.jE, "_double", $$1, this.c);
      this.b.accept(e(dfy.jE, $$2, $$3, $$4));
      this.b.accept(c(dfy.jR, od.c.a(dfy.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cur.sq);
      this.b
         .accept(
            ns.a(dfy.fs)
               .a(nw.a().a(nx.c, oe.G(dfy.fs)))
               .a(nr.a().a(dtq.k, true), nw.a().a(nx.c, oe.a(dfy.fs, "_bottle0")))
               .a(nr.a().a(dtq.l, true), nw.a().a(nx.c, oe.a(dfy.fs, "_bottle1")))
               .a(nr.a().a(dtq.m, true), nw.a().a(nx.c, oe.a(dfy.fs, "_bottle2")))
               .a(nr.a().a(dtq.k, false), nw.a().a(nx.c, oe.a(dfy.fs, "_empty0")))
               .a(nr.a().a(dtq.l, false), nw.a().a(nx.c, oe.a(dfy.fs, "_empty1")))
               .a(nr.a().a(dtq.m, false), nw.a().a(nx.c, oe.a(dfy.fs, "_empty2")))
         );
   }

   private void u(dfw $$0) {
      akq $$1 = od.bp.a($$0, oe.b($$0), this.c);
      akq $$2 = ob.a("mushroom_block_inside");
      this.b
         .accept(
            ns.a($$0)
               .a(nr.a().a(dtq.L, true), nw.a().a(nx.c, $$1))
               .a(nr.a().a(dtq.M, true), nw.a().a(nx.c, $$1).a(nx.b, nx.a.b).a(nx.d, true))
               .a(nr.a().a(dtq.N, true), nw.a().a(nx.c, $$1).a(nx.b, nx.a.c).a(nx.d, true))
               .a(nr.a().a(dtq.O, true), nw.a().a(nx.c, $$1).a(nx.b, nx.a.d).a(nx.d, true))
               .a(nr.a().a(dtq.J, true), nw.a().a(nx.c, $$1).a(nx.a, nx.a.d).a(nx.d, true))
               .a(nr.a().a(dtq.K, true), nw.a().a(nx.c, $$1).a(nx.a, nx.a.b).a(nx.d, true))
               .a(nr.a().a(dtq.L, false), nw.a().a(nx.c, $$2))
               .a(nr.a().a(dtq.M, false), nw.a().a(nx.c, $$2).a(nx.b, nx.a.b).a(nx.d, false))
               .a(nr.a().a(dtq.N, false), nw.a().a(nx.c, $$2).a(nx.b, nx.a.c).a(nx.d, false))
               .a(nr.a().a(dtq.O, false), nw.a().a(nx.c, $$2).a(nx.b, nx.a.d).a(nx.d, false))
               .a(nr.a().a(dtq.J, false), nw.a().a(nx.c, $$2).a(nx.a, nx.a.d).a(nx.d, false))
               .a(nr.a().a(dtq.K, false), nw.a().a(nx.c, $$2).a(nx.a, nx.a.b).a(nx.d, false))
         );
      this.a($$0, og.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cur.rB);
      this.b
         .accept(
            nt.a(dfy.eg)
               .a(
                  nu.a(dtq.ay)
                     .a(0, nw.a().a(nx.c, ob.a(dfy.eg)))
                     .a(1, nw.a().a(nx.c, ob.a(dfy.eg, "_slice1")))
                     .a(2, nw.a().a(nx.c, ob.a(dfy.eg, "_slice2")))
                     .a(3, nw.a().a(nx.c, ob.a(dfy.eg, "_slice3")))
                     .a(4, nw.a().a(nx.c, ob.a(dfy.eg, "_slice4")))
                     .a(5, nw.a().a(nx.c, ob.a(dfy.eg, "_slice5")))
                     .a(6, nw.a().a(nx.c, ob.a(dfy.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oe $$0 = new oe()
         .a(of.c, oe.a(dfy.nX, "_side3"))
         .a(of.o, oe.G(dfy.t))
         .a(of.n, oe.a(dfy.nX, "_top"))
         .a(of.j, oe.a(dfy.nX, "_side3"))
         .a(of.l, oe.a(dfy.nX, "_side3"))
         .a(of.k, oe.a(dfy.nX, "_side1"))
         .a(of.m, oe.a(dfy.nX, "_side2"));
      this.b.accept(c(dfy.nX, od.a.a(dfy.nX, $$0, this.c)));
   }

   private void y() {
      oe $$0 = new oe()
         .a(of.c, oe.a(dfy.ob, "_front"))
         .a(of.o, oe.a(dfy.ob, "_bottom"))
         .a(of.n, oe.a(dfy.ob, "_top"))
         .a(of.j, oe.a(dfy.ob, "_front"))
         .a(of.k, oe.a(dfy.ob, "_front"))
         .a(of.l, oe.a(dfy.ob, "_side"))
         .a(of.m, oe.a(dfy.ob, "_side"));
      this.b.accept(c(dfy.ob, od.a.a(dfy.ob, $$0, this.c)));
   }

   private void a(dfw $$0, dfw $$1, BiFunction<dfw, dfw, oe> $$2) {
      oe $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, od.a.a($$0, $$3, this.c)));
   }

   public void b(dfw $$0) {
      oe $$1 = new oe()
         .a(of.c, oe.a($$0, "_particle"))
         .a(of.o, oe.a($$0, "_down"))
         .a(of.n, oe.a($$0, "_up"))
         .a(of.j, oe.a($$0, "_north"))
         .a(of.k, oe.a($$0, "_south"))
         .a(of.l, oe.a($$0, "_east"))
         .a(of.m, oe.a($$0, "_west"));
      this.b.accept(c($$0, od.a.a($$0, $$1, this.c)));
   }

   private void z() {
      oe $$0 = oe.k(dfy.eZ);
      this.b.accept(c(dfy.eZ, ob.a(dfy.eZ)));
      this.a(dfy.ee, $$0);
      this.a(dfy.ef, $$0);
   }

   private void a(dfw $$0, oe $$1) {
      akq $$2 = od.p.a($$0, $$1.c(of.g, oe.G($$0)), this.c);
      this.b.accept(nt.a($$0, nw.a().a(nx.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cur.sr);
      this.m(dfy.ft);
      this.b.accept(c(dfy.fv, od.bs.a(dfy.fv, oe.j(oe.a(dfy.H, "_still")), this.c)));
      this.b
         .accept(
            nt.a(dfy.fu)
               .a(
                  nu.a(dkf.g)
                     .a(1, nw.a().a(nx.c, od.bq.a(dfy.fu, "_level1", oe.j(oe.a(dfy.G, "_still")), this.c)))
                     .a(2, nw.a().a(nx.c, od.br.a(dfy.fu, "_level2", oe.j(oe.a(dfy.G, "_still")), this.c)))
                     .a(3, nw.a().a(nx.c, od.bs.a(dfy.fu, "_full", oe.j(oe.a(dfy.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nt.a(dfy.fw)
               .a(
                  nu.a(dkf.g)
                     .a(1, nw.a().a(nx.c, od.bq.a(dfy.fw, "_level1", oe.j(oe.G(dfy.qP)), this.c)))
                     .a(2, nw.a().a(nx.c, od.br.a(dfy.fw, "_level2", oe.j(oe.G(dfy.qP)), this.c)))
                     .a(3, nw.a().a(nx.c, od.bs.a(dfy.fw, "_full", oe.j(oe.G(dfy.qP)), this.c)))
               )
         );
   }

   private void B() {
      oe $$0 = oe.b(dfy.kv);
      akq $$1 = od.aE.a(dfy.kv, $$0, this.c);
      akq $$2 = this.a(dfy.kv, "_dead", od.aE, $$1x -> $$0.c(of.b, $$1x));
      this.b.accept(nt.a(dfy.kv).a(a(dtq.au, 5, $$2, $$1)));
   }

   private void C() {
      akq $$0 = ob.a(dfy.tq);
      akq $$1 = ob.a(dfy.tq, "_triggered");
      akq $$2 = ob.a(dfy.tq, "_crafting");
      akq $$3 = ob.a(dfy.tq, "_crafting_triggered");
      this.b
         .accept(
            nt.a(dfy.tq)
               .a(nu.a(dtq.T).a($$0x -> this.a($$0x, nw.a())))
               .a(
                  nu.a(dtq.A, dhp.b)
                     .a(false, false, nw.a().a(nx.c, $$0))
                     .a(true, true, nw.a().a(nx.c, $$3))
                     .a(true, false, nw.a().a(nx.c, $$1))
                     .a(false, true, nw.a().a(nx.c, $$2))
               )
         );
   }

   private void v(dfw $$0) {
      oe $$1 = new oe().a(of.f, oe.a(dfy.cD, "_top")).a(of.i, oe.a(dfy.cD, "_side")).a(of.g, oe.a($$0, "_front"));
      oe $$2 = new oe().a(of.i, oe.a(dfy.cD, "_top")).a(of.g, oe.a($$0, "_front_vertical"));
      akq $$3 = od.p.a($$0, $$1, this.c);
      akq $$4 = od.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nt.a($$0)
               .a(
                  nu.a(dtq.P)
                     .a(ji.a, nw.a().a(nx.c, $$4).a(nx.a, nx.a.c))
                     .a(ji.b, nw.a().a(nx.c, $$4))
                     .a(ji.c, nw.a().a(nx.c, $$3))
                     .a(ji.f, nw.a().a(nx.c, $$3).a(nx.b, nx.a.b))
                     .a(ji.d, nw.a().a(nx.c, $$3).a(nx.b, nx.a.c))
                     .a(ji.e, nw.a().a(nx.c, $$3).a(nx.b, nx.a.d))
               )
         );
   }

   private void D() {
      akq $$0 = ob.a(dfy.fy);
      akq $$1 = ob.a(dfy.fy, "_filled");
      this.b.accept(nt.a(dfy.fy).a(nu.a(dtq.h).a(false, nw.a().a(nx.c, $$0)).a(true, nw.a().a(nx.c, $$1))).a(c()));
   }

   private void E() {
      akq $$0 = ob.a(dfy.ku, "_side");
      akq $$1 = ob.a(dfy.ku, "_noside");
      akq $$2 = ob.a(dfy.ku, "_noside1");
      akq $$3 = ob.a(dfy.ku, "_noside2");
      akq $$4 = ob.a(dfy.ku, "_noside3");
      this.b
         .accept(
            ns.a(dfy.ku)
               .a(nr.a().a(dtq.L, true), nw.a().a(nx.c, $$0))
               .a(nr.a().a(dtq.M, true), nw.a().a(nx.c, $$0).a(nx.b, nx.a.b).a(nx.d, true))
               .a(nr.a().a(dtq.N, true), nw.a().a(nx.c, $$0).a(nx.b, nx.a.c).a(nx.d, true))
               .a(nr.a().a(dtq.O, true), nw.a().a(nx.c, $$0).a(nx.b, nx.a.d).a(nx.d, true))
               .a(nr.a().a(dtq.J, true), nw.a().a(nx.c, $$0).a(nx.a, nx.a.d).a(nx.d, true))
               .a(nr.a().a(dtq.K, true), nw.a().a(nx.c, $$0).a(nx.a, nx.a.b).a(nx.d, true))
               .a(nr.a().a(dtq.L, false), nw.a().a(nx.c, $$1).a(nx.e, 2), nw.a().a(nx.c, $$2), nw.a().a(nx.c, $$3), nw.a().a(nx.c, $$4))
               .a(
                  nr.a().a(dtq.M, false),
                  nw.a().a(nx.c, $$2).a(nx.b, nx.a.b).a(nx.d, true),
                  nw.a().a(nx.c, $$3).a(nx.b, nx.a.b).a(nx.d, true),
                  nw.a().a(nx.c, $$4).a(nx.b, nx.a.b).a(nx.d, true),
                  nw.a().a(nx.c, $$1).a(nx.e, 2).a(nx.b, nx.a.b).a(nx.d, true)
               )
               .a(
                  nr.a().a(dtq.N, false),
                  nw.a().a(nx.c, $$3).a(nx.b, nx.a.c).a(nx.d, true),
                  nw.a().a(nx.c, $$4).a(nx.b, nx.a.c).a(nx.d, true),
                  nw.a().a(nx.c, $$1).a(nx.e, 2).a(nx.b, nx.a.c).a(nx.d, true),
                  nw.a().a(nx.c, $$2).a(nx.b, nx.a.c).a(nx.d, true)
               )
               .a(
                  nr.a().a(dtq.O, false),
                  nw.a().a(nx.c, $$4).a(nx.b, nx.a.d).a(nx.d, true),
                  nw.a().a(nx.c, $$1).a(nx.e, 2).a(nx.b, nx.a.d).a(nx.d, true),
                  nw.a().a(nx.c, $$2).a(nx.b, nx.a.d).a(nx.d, true),
                  nw.a().a(nx.c, $$3).a(nx.b, nx.a.d).a(nx.d, true)
               )
               .a(
                  nr.a().a(dtq.J, false),
                  nw.a().a(nx.c, $$1).a(nx.e, 2).a(nx.a, nx.a.d).a(nx.d, true),
                  nw.a().a(nx.c, $$4).a(nx.a, nx.a.d).a(nx.d, true),
                  nw.a().a(nx.c, $$2).a(nx.a, nx.a.d).a(nx.d, true),
                  nw.a().a(nx.c, $$3).a(nx.a, nx.a.d).a(nx.d, true)
               )
               .a(
                  nr.a().a(dtq.K, false),
                  nw.a().a(nx.c, $$4).a(nx.a, nx.a.b).a(nx.d, true),
                  nw.a().a(nx.c, $$3).a(nx.a, nx.a.b).a(nx.d, true),
                  nw.a().a(nx.c, $$2).a(nx.a, nx.a.b).a(nx.d, true),
                  nw.a().a(nx.c, $$1).a(nx.e, 2).a(nx.a, nx.a.b).a(nx.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            ns.a(dfy.pc)
               .a(nw.a().a(nx.c, oe.G(dfy.pc)))
               .a(nr.a().a(dtq.aL, 1), nw.a().a(nx.c, oe.a(dfy.pc, "_contents1")))
               .a(nr.a().a(dtq.aL, 2), nw.a().a(nx.c, oe.a(dfy.pc, "_contents2")))
               .a(nr.a().a(dtq.aL, 3), nw.a().a(nx.c, oe.a(dfy.pc, "_contents3")))
               .a(nr.a().a(dtq.aL, 4), nw.a().a(nx.c, oe.a(dfy.pc, "_contents4")))
               .a(nr.a().a(dtq.aL, 5), nw.a().a(nx.c, oe.a(dfy.pc, "_contents5")))
               .a(nr.a().a(dtq.aL, 6), nw.a().a(nx.c, oe.a(dfy.pc, "_contents6")))
               .a(nr.a().a(dtq.aL, 7), nw.a().a(nx.c, oe.a(dfy.pc, "_contents7")))
               .a(nr.a().a(dtq.aL, 8), nw.a().a(nx.c, oe.a(dfy.pc, "_contents_ready")))
         );
   }

   private void w(dfw $$0) {
      akq $$1 = od.c.a($$0, oe.a($$0), this.c);
      akq $$2 = this.a($$0, "_powered", od.c, oe::b);
      akq $$3 = this.a($$0, "_lit", od.c, oe::b);
      akq $$4 = this.a($$0, "_lit_powered", od.c, oe::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nq a(dfw $$0, akq $$1, akq $$2, akq $$3, akq $$4) {
      return nt.a($$0).a(nu.a(dtq.r, dtq.w).a(($$4x, $$5) -> $$4x ? nw.a().a(nx.c, $$5 ? $$4 : $$2) : nw.a().a(nx.c, $$5 ? $$3 : $$1)));
   }

   private void i(dfw $$0, dfw $$1) {
      akq $$2 = ob.a($$0);
      akq $$3 = ob.a($$0, "_powered");
      akq $$4 = ob.a($$0, "_lit");
      akq $$5 = ob.a($$0, "_lit_powered");
      this.a($$1, ob.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dfw $$0) {
      this.c($$0);
      this.b.accept(nt.a($$0, nw.a().a(nx.c, od.ao.a($$0, oe.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dfy.qy);
      this.x(dfy.qx);
      this.x(dfy.qw);
      this.x(dfy.qv);
   }

   private void H() {
      this.c(dfy.st);
      nu.b<ji, dtx> $$0 = nu.a(dtq.bm, dtq.bn);

      for (dtx $$1 : dtx.values()) {
         $$0.a(ji.b, $$1, this.a(ji.b, $$1));
      }

      for (dtx $$2 : dtx.values()) {
         $$0.a(ji.a, $$2, this.a(ji.a, $$2));
      }

      this.b.accept(nt.a(dfy.st).a($$0));
   }

   private nw a(ji $$0, dtx $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oe $$3 = oe.c(oe.a(dfy.st, $$2));
      return nw.a().a(nx.c, od.an.a(dfy.st, $$2, $$3, this.c));
   }

   private void y(dfw $$0) {
      oe $$1 = new oe().a(of.e, oe.G(dfy.dV)).a(of.f, oe.G($$0)).a(of.i, oe.a($$0, "_side"));
      this.b.accept(c($$0, od.n.a($$0, $$1, this.c)));
   }

   private void I() {
      akq $$0 = oe.a(dfy.gZ, "_side");
      oe $$1 = new oe().a(of.f, oe.a(dfy.gZ, "_top")).a(of.i, $$0);
      oe $$2 = new oe().a(of.f, oe.a(dfy.gZ, "_inverted_top")).a(of.i, $$0);
      this.b
         .accept(
            nt.a(dfy.gZ)
               .a(nu.a(dtq.p).a(false, nw.a().a(nx.c, od.aF.a(dfy.gZ, $$1, this.c))).a(true, nw.a().a(nx.c, od.aF.a(ob.a(dfy.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dfw $$0) {
      this.b.accept(nt.a($$0, nw.a().a(nx.c, ob.a($$0))).a(this.n()));
   }

   private void J() {
      dfw $$0 = dfy.ss;
      akq $$1 = ob.a($$0, "_on");
      akq $$2 = ob.a($$0);
      this.b.accept(nt.a($$0, nw.a().a(nx.c, ob.a($$0))).a(this.n()).a(a(dtq.w, $$1, $$2)));
   }

   private void K() {
      oe $$0 = new oe().a(of.B, oe.G(dfy.j)).a(of.f, oe.G(dfy.cC));
      oe $$1 = new oe().a(of.B, oe.G(dfy.j)).a(of.f, oe.a(dfy.cC, "_moist"));
      akq $$2 = od.aW.a(dfy.cC, $$0, this.c);
      akq $$3 = od.aW.a(oe.a(dfy.cC, "_moist"), $$1, this.c);
      this.b.accept(nt.a(dfy.cC).a(a(dtq.aQ, 7, $$3, $$2)));
   }

   private List<akq> A(dfw $$0) {
      akq $$1 = od.aX.a(ob.a($$0, "_floor0"), oe.v($$0), this.c);
      akq $$2 = od.aX.a(ob.a($$0, "_floor1"), oe.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akq> B(dfw $$0) {
      akq $$1 = od.aY.a(ob.a($$0, "_side0"), oe.v($$0), this.c);
      akq $$2 = od.aY.a(ob.a($$0, "_side1"), oe.w($$0), this.c);
      akq $$3 = od.aZ.a(ob.a($$0, "_side_alt0"), oe.v($$0), this.c);
      akq $$4 = od.aZ.a(ob.a($$0, "_side_alt1"), oe.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akq> C(dfw $$0) {
      akq $$1 = od.ba.a(ob.a($$0, "_up0"), oe.v($$0), this.c);
      akq $$2 = od.ba.a(ob.a($$0, "_up1"), oe.w($$0), this.c);
      akq $$3 = od.bb.a(ob.a($$0, "_up_alt0"), oe.v($$0), this.c);
      akq $$4 = od.bb.a(ob.a($$0, "_up_alt1"), oe.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<nw> a(List<akq> $$0, UnaryOperator<nw> $$1) {
      return $$0.stream().map($$0x -> nw.a().a(nx.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nr $$0 = nr.a().a(dtq.L, false).a(dtq.M, false).a(dtq.N, false).a(dtq.O, false).a(dtq.J, false);
      List<akq> $$1 = this.A(dfy.cr);
      List<akq> $$2 = this.B(dfy.cr);
      List<akq> $$3 = this.C(dfy.cr);
      this.b
         .accept(
            ns.a(dfy.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nr.b(nr.a().a(dtq.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nr.b(nr.a().a(dtq.M, true), $$0), a($$2, $$0x -> $$0x.a(nx.b, nx.a.b)))
               .a(nr.b(nr.a().a(dtq.N, true), $$0), a($$2, $$0x -> $$0x.a(nx.b, nx.a.c)))
               .a(nr.b(nr.a().a(dtq.O, true), $$0), a($$2, $$0x -> $$0x.a(nx.b, nx.a.d)))
               .a(nr.a().a(dtq.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<akq> $$0 = this.A(dfy.cs);
      List<akq> $$1 = this.B(dfy.cs);
      this.b
         .accept(
            ns.a(dfy.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nx.b, nx.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nx.b, nx.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nx.b, nx.a.d)))
         );
   }

   private void D(dfw $$0) {
      akq $$1 = og.t.create($$0, this.c);
      akq $$2 = og.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nt.a($$0).a(a(dtq.j, $$2, $$1)));
   }

   private void N() {
      oe $$0 = oe.a(oe.a(dfy.ad, "_side"), oe.a(dfy.ad, "_top"));
      akq $$1 = od.j.a(dfy.ad, $$0, this.c);
      this.b.accept(d(dfy.ad, $$1));
   }

   private void O() {
      this.a(cur.ad);
      dfw $$0 = dfy.E;
      nu.b<Boolean, Integer> $$1 = nu.a(dkr.d, dkr.b);
      akq $$2 = ob.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akq $$4 = ob.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, nw.a().a(nx.c, $$4));
         $$1.a(false, $$3, nw.a().a(nx.c, $$2));
      }

      this.b.accept(nt.a(dfy.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nt.a(dfy.kI)
               .a(
                  nu.a(dtq.as)
                     .a(0, nw.a().a(nx.c, this.a(dfy.kI, "_0", od.c, oe::b)))
                     .a(1, nw.a().a(nx.c, this.a(dfy.kI, "_1", od.c, oe::b)))
                     .a(2, nw.a().a(nx.c, this.a(dfy.kI, "_2", od.c, oe::b)))
                     .a(3, nw.a().a(nx.c, this.a(dfy.kI, "_3", od.c, oe::b)))
               )
         );
   }

   private void Q() {
      akq $$0 = oe.G(dfy.j);
      oe $$1 = new oe().a(of.e, $$0).b(of.e, of.c).a(of.f, oe.a(dfy.i, "_top")).a(of.i, oe.a(dfy.i, "_snow"));
      nw $$2 = nw.a().a(nx.c, od.n.a(dfy.i, "_snow", $$1, this.c));
      this.a(dfy.i, ob.a(dfy.i), $$2);
      akq $$3 = og.f.get(dfy.fl).a($$1x -> $$1x.a(of.e, $$0)).a(dfy.fl, this.c);
      this.a(dfy.fl, $$3, $$2);
      akq $$4 = og.f.get(dfy.l).a($$1x -> $$1x.a(of.e, $$0)).a(dfy.l, this.c);
      this.a(dfy.l, $$4, $$2);
   }

   private void a(dfw $$0, akq $$1, nw $$2) {
      List<nw> $$3 = Arrays.asList(a($$1));
      this.b.accept(nt.a($$0).a(nu.a(dtq.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cur.rh);
      this.b
         .accept(
            nt.a(dfy.fC)
               .a(
                  nu.a(dtq.ar)
                     .a(0, nw.a().a(nx.c, ob.a(dfy.fC, "_stage0")))
                     .a(1, nw.a().a(nx.c, ob.a(dfy.fC, "_stage1")))
                     .a(2, nw.a().a(nx.c, ob.a(dfy.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dfy.kE, ob.a(dfy.kE)));
   }

   private void j(dfw $$0, dfw $$1) {
      oe $$2 = oe.b($$1);
      akq $$3 = od.Y.a($$0, $$2, this.c);
      akq $$4 = od.Z.a($$0, $$2, this.c);
      this.b.accept(nt.a($$0).a(a(dtq.aT, 1, $$4, $$3)));
   }

   private void T() {
      akq $$0 = ob.a(dfy.hc);
      akq $$1 = ob.a(dfy.hc, "_side");
      this.a(cur.lR);
      this.b
         .accept(
            nt.a(dfy.hc)
               .a(
                  nu.a(dtq.Q)
                     .a(ji.a, nw.a().a(nx.c, $$0))
                     .a(ji.c, nw.a().a(nx.c, $$1))
                     .a(ji.f, nw.a().a(nx.c, $$1).a(nx.b, nx.a.b))
                     .a(ji.d, nw.a().a(nx.c, $$1).a(nx.b, nx.a.c))
                     .a(ji.e, nw.a().a(nx.c, $$1).a(nx.b, nx.a.d))
               )
         );
   }

   private void k(dfw $$0, dfw $$1) {
      akq $$2 = ob.a($$0);
      this.b.accept(nt.a($$1, nw.a().a(nx.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      akq $$0 = ob.a(dfy.eW, "_post_ends");
      akq $$1 = ob.a(dfy.eW, "_post");
      akq $$2 = ob.a(dfy.eW, "_cap");
      akq $$3 = ob.a(dfy.eW, "_cap_alt");
      akq $$4 = ob.a(dfy.eW, "_side");
      akq $$5 = ob.a(dfy.eW, "_side_alt");
      this.b
         .accept(
            ns.a(dfy.eW)
               .a(nw.a().a(nx.c, $$0))
               .a(nr.a().a(dtq.L, false).a(dtq.M, false).a(dtq.N, false).a(dtq.O, false), nw.a().a(nx.c, $$1))
               .a(nr.a().a(dtq.L, true).a(dtq.M, false).a(dtq.N, false).a(dtq.O, false), nw.a().a(nx.c, $$2))
               .a(nr.a().a(dtq.L, false).a(dtq.M, true).a(dtq.N, false).a(dtq.O, false), nw.a().a(nx.c, $$2).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.L, false).a(dtq.M, false).a(dtq.N, true).a(dtq.O, false), nw.a().a(nx.c, $$3))
               .a(nr.a().a(dtq.L, false).a(dtq.M, false).a(dtq.N, false).a(dtq.O, true), nw.a().a(nx.c, $$3).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.L, true), nw.a().a(nx.c, $$4))
               .a(nr.a().a(dtq.M, true), nw.a().a(nx.c, $$4).a(nx.b, nx.a.b))
               .a(nr.a().a(dtq.N, true), nw.a().a(nx.c, $$5))
               .a(nr.a().a(dtq.O, true), nw.a().a(nx.c, $$5).a(nx.b, nx.a.b))
         );
      this.d(dfy.eW);
   }

   private void E(dfw $$0) {
      this.b.accept(nt.a($$0, nw.a().a(nx.c, ob.a($$0))).a(b()));
   }

   private void V() {
      akq $$0 = ob.a(dfy.dw);
      akq $$1 = ob.a(dfy.dw, "_on");
      this.d(dfy.dw);
      this.b
         .accept(
            nt.a(dfy.dw)
               .a(a(dtq.w, $$0, $$1))
               .a(
                  nu.a(dtq.U, dtq.R)
                     .a(dtl.c, ji.c, nw.a().a(nx.a, nx.a.c).a(nx.b, nx.a.c))
                     .a(dtl.c, ji.f, nw.a().a(nx.a, nx.a.c).a(nx.b, nx.a.d))
                     .a(dtl.c, ji.d, nw.a().a(nx.a, nx.a.c))
                     .a(dtl.c, ji.e, nw.a().a(nx.a, nx.a.c).a(nx.b, nx.a.b))
                     .a(dtl.a, ji.c, nw.a())
                     .a(dtl.a, ji.f, nw.a().a(nx.b, nx.a.b))
                     .a(dtl.a, ji.d, nw.a().a(nx.b, nx.a.c))
                     .a(dtl.a, ji.e, nw.a().a(nx.b, nx.a.d))
                     .a(dtl.b, ji.c, nw.a().a(nx.a, nx.a.b))
                     .a(dtl.b, ji.f, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.b))
                     .a(dtl.b, ji.d, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.c))
                     .a(dtl.b, ji.e, nw.a().a(nx.a, nx.a.b).a(nx.b, nx.a.d))
               )
         );
   }

   private void W() {
      this.d(dfy.fm);
      this.b.accept(b(dfy.fm, ob.a(dfy.fm)));
   }

   private void X() {
      this.d(dfy.tn);
      this.b.accept(c(dfy.tn, ob.a(dfy.tn)));
   }

   private void Y() {
      this.b.accept(nt.a(dfy.ed).a(nu.a(dtq.H).a(ji.a.a, nw.a().a(nx.c, ob.a(dfy.ed, "_ns"))).a(ji.a.c, nw.a().a(nx.c, ob.a(dfy.ed, "_ew")))));
   }

   private void Z() {
      akq $$0 = og.a.create(dfy.dV, this.c);
      this.b
         .accept(
            nt.a(
               dfy.dV,
               nw.a().a(nx.c, $$0),
               nw.a().a(nx.c, $$0).a(nx.a, nx.a.b),
               nw.a().a(nx.c, $$0).a(nx.a, nx.a.c),
               nw.a().a(nx.c, $$0).a(nx.a, nx.a.d),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.b),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.b).a(nx.a, nx.a.b),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.b).a(nx.a, nx.a.c),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.b).a(nx.a, nx.a.d),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.c),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.c).a(nx.a, nx.a.b),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.c).a(nx.a, nx.a.c),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.c).a(nx.a, nx.a.d),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.d),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.d).a(nx.a, nx.a.b),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.d).a(nx.a, nx.a.c),
               nw.a().a(nx.c, $$0).a(nx.b, nx.a.d).a(nx.a, nx.a.d)
            )
         );
   }

   private void aa() {
      akq $$0 = ob.a(dfy.kO);
      akq $$1 = ob.a(dfy.kO, "_on");
      this.b.accept(nt.a(dfy.kO).a(a(dtq.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oe $$0 = new oe().a(of.e, oe.a(dfy.by, "_bottom")).a(of.i, oe.a(dfy.by, "_side"));
      akq $$1 = oe.a(dfy.by, "_top_sticky");
      akq $$2 = oe.a(dfy.by, "_top");
      oe $$3 = $$0.c(of.E, $$1);
      oe $$4 = $$0.c(of.E, $$2);
      akq $$5 = ob.a(dfy.by, "_base");
      this.a(dfy.by, $$5, $$4);
      this.a(dfy.br, $$5, $$3);
      akq $$6 = od.n.a(dfy.by, "_inventory", $$0.c(of.f, $$2), this.c);
      akq $$7 = od.n.a(dfy.br, "_inventory", $$0.c(of.f, $$1), this.c);
      this.a(dfy.by, $$6);
      this.a(dfy.br, $$7);
   }

   private void a(dfw $$0, akq $$1, oe $$2) {
      akq $$3 = od.bh.a($$0, $$2, this.c);
      this.b.accept(nt.a($$0).a(a(dtq.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oe $$0 = new oe().a(of.F, oe.a(dfy.by, "_top")).a(of.i, oe.a(dfy.by, "_side"));
      oe $$1 = $$0.c(of.E, oe.a(dfy.by, "_top_sticky"));
      oe $$2 = $$0.c(of.E, oe.a(dfy.by, "_top"));
      this.b
         .accept(
            nt.a(dfy.bz)
               .a(
                  nu.a(dtq.x, dtq.bg)
                     .a(false, duc.a, nw.a().a(nx.c, od.bi.a(dfy.by, "_head", $$2, this.c)))
                     .a(false, duc.b, nw.a().a(nx.c, od.bi.a(dfy.by, "_head_sticky", $$1, this.c)))
                     .a(true, duc.a, nw.a().a(nx.c, od.bj.a(dfy.by, "_head_short", $$2, this.c)))
                     .a(true, duc.b, nw.a().a(nx.c, od.bj.a(dfy.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dfw $$0 = dfy.tr;
      oe $$1 = oe.a($$0, "_side_inactive", "_top_inactive");
      oe $$2 = oe.a($$0, "_side_active", "_top_active");
      oe $$3 = oe.a($$0, "_side_active", "_top_ejecting_reward");
      oe $$4 = oe.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      oe $$5 = oe.a($$0, "_side_active_ominous", "_top_active_ominous");
      oe $$6 = oe.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      akq $$7 = od.o.a($$0, $$1, this.c);
      akq $$8 = od.o.a($$0, "_active", $$2, this.c);
      akq $$9 = od.o.a($$0, "_ejecting_reward", $$3, this.c);
      akq $$10 = od.o.a($$0, "_inactive_ominous", $$4, this.c);
      akq $$11 = od.o.a($$0, "_active_ominous", $$5, this.c);
      akq $$12 = od.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nt.a($$0).a(nu.a(dtq.by, dtq.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> nw.a().a(nx.c, $$7x ? $$10 : $$7);
            case b, c, d -> nw.a().a(nx.c, $$7x ? $$11 : $$8);
            case e -> nw.a().a(nx.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dfw $$0 = dfy.ts;
      oe $$1 = oe.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      oe $$2 = oe.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      oe $$3 = oe.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      oe $$4 = oe.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akq $$5 = od.bN.a($$0, $$1, this.c);
      akq $$6 = od.bN.a($$0, "_active", $$2, this.c);
      akq $$7 = od.bN.a($$0, "_unlocking", $$3, this.c);
      akq $$8 = od.bN.a($$0, "_ejecting_reward", $$4, this.c);
      oe $$9 = oe.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      oe $$10 = oe.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oe $$11 = oe.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oe $$12 = oe.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      akq $$13 = od.bN.a($$0, "_ominous", $$9, this.c);
      akq $$14 = od.bN.a($$0, "_active_ominous", $$10, this.c);
      akq $$15 = od.bN.a($$0, "_unlocking_ominous", $$11, this.c);
      akq $$16 = od.bN.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nt.a($$0).a(b()).a(nu.a(dos.b, dos.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> nw.a().a(nx.c, $$9x ? $$13 : $$5);
            case b -> nw.a().a(nx.c, $$9x ? $$14 : $$6);
            case c -> nw.a().a(nx.c, $$9x ? $$15 : $$7);
            case d -> nw.a().a(nx.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      akq $$0 = ob.a(dfy.qQ, "_inactive");
      akq $$1 = ob.a(dfy.qQ, "_active");
      this.a(dfy.qQ, $$0);
      this.b.accept(nt.a(dfy.qQ).a(nu.a(dtq.bo).a($$2 -> nw.a().a(nx.c, $$2 != duh.b && $$2 != duh.c ? $$0 : $$1))));
   }

   private void ag() {
      akq $$0 = ob.a(dfy.qR, "_inactive");
      akq $$1 = ob.a(dfy.qR, "_active");
      this.a(dfy.qR, $$0);
      this.b.accept(nt.a(dfy.qR).a(nu.a(dtq.bo).a($$2 -> nw.a().a(nx.c, $$2 != duh.b && $$2 != duh.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      akq $$0 = od.bM.a(dfy.qV, oe.a(false), this.c);
      akq $$1 = od.bM.a(dfy.qV, "_can_summon", oe.a(true), this.c);
      this.a(dfy.qV, $$0);
      this.b.accept(nt.a(dfy.qV).a(a(dtq.G, $$1, $$0)));
   }

   private void ai() {
      akq $$0 = ob.a(dfy.nS, "_stable");
      akq $$1 = ob.a(dfy.nS, "_unstable");
      this.a(dfy.nS, $$0);
      this.b.accept(nt.a(dfy.nS).a(a(dtq.b, $$1, $$0)));
   }

   private void aj() {
      akq $$0 = this.a(dfy.sv, "", od.ao, oe::c);
      akq $$1 = this.a(dfy.sv, "_lit", od.ao, oe::c);
      this.b.accept(nt.a(dfy.sv).a(a(dtq.D, $$1, $$0)));
      akq $$2 = this.a(dfy.sw, "", od.ao, oe::c);
      akq $$3 = this.a(dfy.sw, "_lit", od.ao, oe::c);
      this.b.accept(nt.a(dfy.sw).a(a(dtq.D, $$3, $$2)));
   }

   private void ak() {
      akq $$0 = og.a.create(dfy.fB, this.c);
      akq $$1 = this.a(dfy.fB, "_on", od.c, oe::b);
      this.b.accept(nt.a(dfy.fB).a(a(dtq.r, $$1, $$0)));
   }

   private void l(dfw $$0, dfw $$1) {
      oe $$2 = oe.y($$0);
      this.b.accept(c($$0, od.bf.a($$0, $$2, this.c)));
      this.b.accept(nt.a($$1, nw.a().a(nx.c, od.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oe $$0 = oe.y(dfy.dK);
      oe $$1 = oe.i(oe.a(dfy.dK, "_off"));
      akq $$2 = od.bf.a(dfy.dK, $$0, this.c);
      akq $$3 = od.bf.a(dfy.dK, "_off", $$1, this.c);
      this.b.accept(nt.a(dfy.dK).a(a(dtq.r, $$2, $$3)));
      akq $$4 = od.bg.a(dfy.dL, $$0, this.c);
      akq $$5 = od.bg.a(dfy.dL, "_off", $$1, this.c);
      this.b.accept(nt.a(dfy.dL).a(a(dtq.r, $$4, $$5)).a(d()));
      this.d(dfy.dK);
      this.c(dfy.dL);
   }

   private void am() {
      this.a(cur.lK);
      this.b.accept(nt.a(dfy.eh).a(nu.a(dtq.aA, dtq.s, dtq.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return nw.a().a(nx.c, oe.a(dfy.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cur.cT);
      this.b
         .accept(
            nt.a(dfy.mV)
               .a(
                  nu.a(dtq.aS, dtq.C)
                     .a(1, false, Arrays.asList(a(ob.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(ob.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(ob.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(ob.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(ob.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(ob.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(ob.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(ob.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      oe $$0 = oe.a(dfy.dN);
      akq $$1 = od.c.a(dfy.dP, $$0, this.c);
      this.b.accept(nt.a(dfy.dN).a(nu.a(dtq.aF).a($$1x -> nw.a().a(nx.c, $$1x < 8 ? ob.a(dfy.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dfy.dN, ob.a(dfy.dN, "_height2"));
      this.b.accept(c(dfy.dP, $$1));
   }

   private void ap() {
      this.b.accept(nt.a(dfy.oc, nw.a().a(nx.c, ob.a(dfy.oc))).a(b()));
   }

   private void aq() {
      akq $$0 = og.a.create(dfy.pa, this.c);
      this.a(dfy.pa, $$0);
      this.b.accept(nt.a(dfy.pa).a(nu.a(dtq.bj).a($$0x -> nw.a().a(nx.c, this.a(dfy.pa, "_" + $$0x.c(), od.c, oe::b)))));
   }

   private void ar() {
      this.a(cur.wu);
      this.b.accept(nt.a(dfy.oi).a(nu.a(dtq.as).a($$0 -> nw.a().a(nx.c, this.a(dfy.oi, "_stage" + $$0, od.ao, oe::c)))));
   }

   private void as() {
      this.a(cur.ps);
      this.b
         .accept(
            nt.a(dfy.fI)
               .a(
                  nu.a(dtq.a, dtq.M, dtq.L, dtq.N, dtq.O)
                     .a(false, false, false, false, false, nw.a().a(nx.c, ob.a(dfy.fI, "_ns")))
                     .a(false, true, false, false, false, nw.a().a(nx.c, ob.a(dfy.fI, "_n")).a(nx.b, nx.a.b))
                     .a(false, false, true, false, false, nw.a().a(nx.c, ob.a(dfy.fI, "_n")))
                     .a(false, false, false, true, false, nw.a().a(nx.c, ob.a(dfy.fI, "_n")).a(nx.b, nx.a.c))
                     .a(false, false, false, false, true, nw.a().a(nx.c, ob.a(dfy.fI, "_n")).a(nx.b, nx.a.d))
                     .a(false, true, true, false, false, nw.a().a(nx.c, ob.a(dfy.fI, "_ne")))
                     .a(false, true, false, true, false, nw.a().a(nx.c, ob.a(dfy.fI, "_ne")).a(nx.b, nx.a.b))
                     .a(false, false, false, true, true, nw.a().a(nx.c, ob.a(dfy.fI, "_ne")).a(nx.b, nx.a.c))
                     .a(false, false, true, false, true, nw.a().a(nx.c, ob.a(dfy.fI, "_ne")).a(nx.b, nx.a.d))
                     .a(false, false, true, true, false, nw.a().a(nx.c, ob.a(dfy.fI, "_ns")))
                     .a(false, true, false, false, true, nw.a().a(nx.c, ob.a(dfy.fI, "_ns")).a(nx.b, nx.a.b))
                     .a(false, true, true, true, false, nw.a().a(nx.c, ob.a(dfy.fI, "_nse")))
                     .a(false, true, false, true, true, nw.a().a(nx.c, ob.a(dfy.fI, "_nse")).a(nx.b, nx.a.b))
                     .a(false, false, true, true, true, nw.a().a(nx.c, ob.a(dfy.fI, "_nse")).a(nx.b, nx.a.c))
                     .a(false, true, true, false, true, nw.a().a(nx.c, ob.a(dfy.fI, "_nse")).a(nx.b, nx.a.d))
                     .a(false, true, true, true, true, nw.a().a(nx.c, ob.a(dfy.fI, "_nsew")))
                     .a(true, false, false, false, false, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_ns")))
                     .a(true, false, true, false, false, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_n")))
                     .a(true, false, false, true, false, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_n")).a(nx.b, nx.a.c))
                     .a(true, true, false, false, false, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_n")).a(nx.b, nx.a.b))
                     .a(true, false, false, false, true, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_n")).a(nx.b, nx.a.d))
                     .a(true, true, true, false, false, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_ne")))
                     .a(true, true, false, true, false, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_ne")).a(nx.b, nx.a.b))
                     .a(true, false, false, true, true, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_ne")).a(nx.b, nx.a.c))
                     .a(true, false, true, false, true, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_ne")).a(nx.b, nx.a.d))
                     .a(true, false, true, true, false, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_ns")))
                     .a(true, true, false, false, true, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_ns")).a(nx.b, nx.a.b))
                     .a(true, true, true, true, false, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_nse")))
                     .a(true, true, false, true, true, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_nse")).a(nx.b, nx.a.b))
                     .a(true, false, true, true, true, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_nse")).a(nx.b, nx.a.c))
                     .a(true, true, true, false, true, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_nse")).a(nx.b, nx.a.d))
                     .a(true, true, true, true, true, nw.a().a(nx.c, ob.a(dfy.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dfy.fH);
      this.b.accept(nt.a(dfy.fH).a(nu.a(dtq.a, dtq.w).a(($$0, $$1) -> nw.a().a(nx.c, oe.a(dfy.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akq a(int $$0, String $$1, oe $$2) {
      switch ($$0) {
         case 1:
            return od.bl.a(ob.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return od.bm.a(ob.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return od.bn.a(ob.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return od.bo.a(ob.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akq a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", oe.b(oe.G(dfy.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oe.b(oe.a(dfy.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oe.b(oe.a(dfy.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cur.kp);
      this.b.accept(nt.a(dfy.mf).a(nu.a(dtq.aD, dtq.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cur.kq);
      Function<Integer, akq> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oe $$2 = oe.a($$1);
         return od.bw.a(dfy.mg, $$1, $$2, this.c);
      };
      this.b.accept(nt.a(dfy.mg).a(nu.a(dnf.c).a($$1 -> nw.a().a(nx.c, $$0.apply($$1)))));
   }

   private void F(dfw $$0) {
      this.d($$0);
      akq $$1 = ob.a($$0);
      ns $$2 = ns.a($$0);
      nr.c $$3 = ad.a(nr.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dtr, Function<akq, nw>> $$4 : a) {
         dtr $$5 = (dtr)$$4.getFirst();
         Function<akq, nw> $$6 = (Function<akq, nw>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(nr.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      akq $$0 = oe.a(dfy.qU, "_bottom");
      oe $$1 = new oe().a(of.e, $$0).a(of.f, oe.a(dfy.qU, "_top")).a(of.i, oe.a(dfy.qU, "_side"));
      oe $$2 = new oe().a(of.e, $$0).a(of.f, oe.a(dfy.qU, "_top_bloom")).a(of.i, oe.a(dfy.qU, "_side_bloom"));
      akq $$3 = od.n.a(dfy.qU, "", $$1, this.c);
      akq $$4 = od.n.a(dfy.qU, "_bloom", $$2, this.c);
      this.b.accept(nt.a(dfy.qU).a(nu.a(dtq.E).a($$2x -> nw.a().a(nx.c, $$2x ? $$4 : $$3))));
      this.a(cur.gj, $$3);
   }

   private void ax() {
      dfw $$0 = dfy.cm;
      akq $$1 = ob.a($$0);
      ns $$2 = ns.a($$0);
      List.of(Pair.of(ji.c, nx.a.a), Pair.of(ji.f, nx.a.b), Pair.of(ji.d, nx.a.c), Pair.of(ji.e, nx.a.d)).forEach($$2x -> {
         ji $$3 = (ji)$$2x.getFirst();
         nx.a $$4 = (nx.a)$$2x.getSecond();
         nr.c $$5 = nr.a().a(dtq.R, $$3);
         $$2.a($$5, nw.a().a(nx.c, $$1).a(nx.b, $$4).a(nx.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, ob.a($$0, "_inventory"));
      i.clear();
   }

   private void a(ns $$0, nr.c $$1, nx.a $$2) {
      List.of(Pair.of(dtq.bp, od.aM), Pair.of(dtq.bq, od.aN), Pair.of(dtq.br, od.aO), Pair.of(dtq.bs, od.aP), Pair.of(dtq.bt, od.aQ), Pair.of(dtq.bu, od.aR))
         .forEach($$3 -> {
            dtr $$4 = (dtr)$$3.getFirst();
            oc $$5 = (oc)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(ns $$0, nr.c $$1, nx.a $$2, dtr $$3, oc $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oe $$7 = new oe().a(of.b, oe.a(dfy.cm, $$6));
      nn.d $$8 = new nn.d($$4, $$6);
      akq $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dfy.cm, $$6, $$7, this.c));
      $$0.a(nr.a($$1, nr.a().a($$3, $$5)), nw.a().a(nx.c, $$9).a(nx.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dfy.kJ, od.c.a(dfy.kJ, oe.b(ob.a("magma")), this.c)));
   }

   private void G(dfw $$0) {
      this.b($$0, og.q);
      od.bD.a(ob.a($$0.r()), oe.u($$0), this.c);
   }

   private void b(dfw $$0, dfw $$1, nn.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dfw $$0, dfw $$1) {
      od.bE.a(ob.a($$0.r()), oe.u($$1), this.c);
   }

   private void az() {
      akq $$0 = ob.a(dfy.b);
      akq $$1 = ob.a(dfy.b, "_mirrored");
      this.b.accept(a(dfy.eN, $$0, $$1));
      this.a(dfy.eN, $$0);
   }

   private void aA() {
      akq $$0 = ob.a(dfy.sJ);
      akq $$1 = ob.a(dfy.sJ, "_mirrored");
      this.b.accept(a(dfy.td, $$0, $$1).a(f()));
      this.a(dfy.td, $$0);
   }

   private void n(dfw $$0, dfw $$1) {
      this.a($$0, nn.e.b);
      oe $$2 = oe.d(oe.a($$0, "_pot"));
      akq $$3 = nn.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      akq $$0 = oe.a(dfy.pl, "_bottom");
      akq $$1 = oe.a(dfy.pl, "_top_off");
      akq $$2 = oe.a(dfy.pl, "_top");
      akq[] $$3 = new akq[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oe $$5 = new oe().a(of.e, $$0).a(of.f, $$4 == 0 ? $$1 : $$2).a(of.i, oe.a(dfy.pl, "_side" + $$4));
         $$3[$$4] = od.n.a(dfy.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nt.a(dfy.pl).a(nu.a(dtq.aZ).a($$1x -> nw.a().a(nx.c, $$3[$$1x]))));
      this.a(cur.wS, $$3[0]);
   }

   private nw a(jk $$0, nw $$1) {
      switch ($$0) {
         case b:
            return $$1.a(nx.a, nx.a.b);
         case c:
            return $$1.a(nx.a, nx.a.b).a(nx.b, nx.a.c);
         case d:
            return $$1.a(nx.a, nx.a.b).a(nx.b, nx.a.d);
         case a:
            return $$1.a(nx.a, nx.a.b).a(nx.b, nx.a.b);
         case f:
            return $$1.a(nx.a, nx.a.d).a(nx.b, nx.a.c);
         case g:
            return $$1.a(nx.a, nx.a.d);
         case h:
            return $$1.a(nx.a, nx.a.d).a(nx.b, nx.a.b);
         case e:
            return $$1.a(nx.a, nx.a.d).a(nx.b, nx.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(nx.b, nx.a.c);
         case i:
            return $$1.a(nx.b, nx.a.d);
         case j:
            return $$1.a(nx.b, nx.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      akq $$0 = oe.a(dfy.pb, "_top");
      akq $$1 = oe.a(dfy.pb, "_bottom");
      akq $$2 = oe.a(dfy.pb, "_side");
      akq $$3 = oe.a(dfy.pb, "_lock");
      oe $$4 = new oe().a(of.o, $$2).a(of.m, $$2).a(of.l, $$2).a(of.c, $$0).a(of.j, $$0).a(of.k, $$1).a(of.n, $$3);
      akq $$5 = od.b.a(dfy.pb, $$4, this.c);
      this.b.accept(nt.a(dfy.pb, nw.a().a(nx.c, $$5)).a(nu.a(dtq.T).a($$0x -> this.a($$0x, nw.a()))));
   }

   private void aD() {
      dfw $$0 = dfy.n;
      akq $$1 = ob.a($$0);
      og $$2 = og.a.get($$0);
      dfw $$3 = dfy.jH;
      akq $$4 = od.ab.a($$3, $$2.b(), this.c);
      akq $$5 = od.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lw.a().filter(lx::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dfy.rf).a(lw.w).a(dfy.rf, dfy.rD).a(dfy.rj, dfy.rn).a(lw.y);
      this.h(dfy.re).a(lw.A).a(dfy.re, dfy.rC).a(dfy.ri, dfy.rm).a(lw.C);
      this.h(dfy.rd).a(lw.E).a(dfy.rd, dfy.rB).a(dfy.rh, dfy.rl).a(lw.G);
      this.h(dfy.rc).a(lw.I).a(dfy.rc, dfy.rA).a(dfy.rg, dfy.rk).a(lw.K);
      this.w(dfy.sk);
      this.w(dfy.sl);
      this.w(dfy.sm);
      this.w(dfy.sn);
      this.i(dfy.sk, dfy.so);
      this.i(dfy.sl, dfy.sp);
      this.i(dfy.sm, dfy.sq);
      this.i(dfy.sn, dfy.sr);
      this.m(dfy.a);
      this.c(dfy.nc, dfy.a);
      this.c(dfy.nb, dfy.a);
      this.m(dfy.fO);
      this.m(dfy.dQ);
      this.c(dfy.nd, dfy.G);
      this.m(dfy.fA);
      this.m(dfy.me);
      this.m(dfy.fr);
      this.m(dfy.fR);
      this.a(cur.ue);
      this.m(dfy.pg);
      this.m(dfy.G);
      this.m(dfy.H);
      this.m(dfy.hV);
      this.a(cur.fS);
      this.o(dfy.pM, dfy.qd);
      this.o(dfy.pN, dfy.qe);
      this.o(dfy.pO, dfy.qf);
      this.o(dfy.pP, dfy.qg);
      this.o(dfy.pQ, dfy.qh);
      this.o(dfy.pR, dfy.qi);
      this.o(dfy.pS, dfy.qj);
      this.o(dfy.pT, dfy.qk);
      this.o(dfy.pU, dfy.ql);
      this.o(dfy.pV, dfy.qm);
      this.o(dfy.pW, dfy.qn);
      this.o(dfy.pX, dfy.qo);
      this.o(dfy.pY, dfy.qp);
      this.o(dfy.pZ, dfy.qq);
      this.o(dfy.qa, dfy.qr);
      this.o(dfy.qb, dfy.qs);
      this.o(dfy.pL, dfy.qc);
      this.m(dfy.na);
      this.m(dfy.gs);
      this.m(dfy.qP);
      this.m(dfy.sx);
      this.s(dfy.sy);
      this.s(dfy.sz);
      this.t(dfy.ti);
      this.t(dfy.tj);
      this.aj();
      this.g(dfy.sC, dfy.sA);
      this.p(dfy.sB);
      this.a(dfy.hW, cur.hB);
      this.a(cur.hB);
      this.aE();
      this.a(dfy.kN, cur.jb);
      this.a(cur.jb);
      this.f(dfy.bQ, oe.a(dfy.by, "_side"));
      this.a(dfy.R);
      this.a(dfy.S);
      this.a(dfy.iB);
      this.a(dfy.cx);
      this.a(dfy.cy);
      this.a(dfy.cz);
      this.a(dfy.fE);
      this.a(dfy.fF);
      this.a(dfy.fJ);
      this.a(dfy.N);
      this.a(dfy.T);
      this.a(dfy.O);
      this.a(dfy.ch);
      this.a(dfy.P);
      this.a(dfy.Q);
      this.a(dfy.ci);
      this.b(dfy.pj, og.d);
      this.a(dfy.pi);
      this.a(dfy.aR);
      this.a(dfy.aS);
      this.a(dfy.aT);
      this.a(dfy.hb);
      this.a(dfy.dI);
      this.a(dfy.dJ);
      this.a(dfy.ha);
      this.a(dfy.pC);
      this.a(dfy.mW);
      this.a(dfy.dR);
      this.a(dfy.k);
      this.a(dfy.pk);
      this.a(dfy.fz);
      this.a(dfy.ec);
      this.a(dfy.L);
      this.a(dfy.ph);
      this.a(dfy.dO);
      this.b(dfy.dT, og.g);
      this.b(dfy.pq, og.d);
      this.b(dfy.fa, og.d);
      this.m(dfy.ac);
      this.m(dfy.ga);
      this.a(dfy.kK);
      this.a(dfy.aY);
      this.a(dfy.iC);
      this.a(dfy.co);
      this.a(dfy.pK);
      this.a(dfy.ii);
      this.a(dfy.oy);
      this.a(dfy.dW);
      this.a(dfy.dX);
      this.b(dfy.ct, og.b);
      this.a(dfy.aO);
      this.b(dfy.bw, og.v);
      this.a(cur.cS);
      this.b(dfy.ck, og.f);
      this.b(dfy.pd, og.d);
      this.a(dfy.op);
      this.a(dfy.aP);
      this.a(dfy.qt);
      this.a(dfy.qu);
      this.a(dfy.qN);
      this.a(dfy.su);
      this.a(dfy.tf);
      this.a(dfy.tg);
      this.a(dfy.th);
      this.e(dfy.qS);
      this.m(dfy.tt);
      this.aD();
      this.a(dfy.ra);
      this.a(dfy.rb);
      this.a(dfy.qW);
      this.a(dfy.qX);
      this.a(dfy.qY);
      this.a(dfy.qZ);
      this.k(dfy.qW, dfy.rw);
      this.k(dfy.qX, dfy.ry);
      this.k(dfy.qY, dfy.rx);
      this.k(dfy.qZ, dfy.rz);
      this.i(dfy.rM);
      this.i(dfy.rN);
      this.i(dfy.rP);
      this.i(dfy.rO);
      this.a(dfy.rM, dfy.rQ);
      this.a(dfy.rN, dfy.rR);
      this.a(dfy.rP, dfy.rT);
      this.a(dfy.rO, dfy.rS);
      this.k(dfy.rU);
      this.k(dfy.rV);
      this.k(dfy.rX);
      this.k(dfy.rW);
      this.b(dfy.rU, dfy.rY);
      this.b(dfy.rV, dfy.rZ);
      this.b(dfy.rX, dfy.sb);
      this.b(dfy.rW, dfy.sa);
      this.a(dfy.sc);
      this.a(dfy.sd);
      this.a(dfy.se);
      this.a(dfy.sf);
      this.k(dfy.sc, dfy.sg);
      this.k(dfy.sd, dfy.sh);
      this.k(dfy.se, dfy.si);
      this.k(dfy.sf, dfy.sj);
      this.j(dfy.gW, dfy.ch);
      this.j(dfy.gX, dfy.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dfy.og, dfy.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dfy.kt);
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
      this.F(dfy.ff);
      this.F(dfy.fg);
      this.F(dfy.qT);
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
      this.E(dfy.cO);
      this.d(dfy.cO);
      this.E(dfy.oa);
      this.g();
      this.E(dfy.sE);
      this.l(dfy.cp, dfy.cq);
      this.l(dfy.ea, dfy.eb);
      this.a(dfy.cA, dfy.n, oe::c);
      this.a(dfy.nY, dfy.p, oe::d);
      this.y(dfy.ow);
      this.y(dfy.on);
      this.v(dfy.aU);
      this.v(dfy.hi);
      this.C();
      this.D(dfy.oe);
      this.D(dfy.of);
      this.e(dfy.eX, ob.a(dfy.eX));
      this.a(dfy.dY, og.d);
      this.a(dfy.dZ, og.d);
      this.a(dfy.te);
      this.a(dfy.kM, og.d);
      this.f(dfy.j);
      this.f(dfy.sH);
      this.f(dfy.I);
      this.g(dfy.J);
      this.g(dfy.M);
      this.f(dfy.K);
      this.e(dfy.F);
      this.b(dfy.to, og.f);
      this.a(dfy.ij, og.d, og.e);
      this.a(dfy.kx, og.w, og.x);
      this.a(dfy.hf, og.w, og.x);
      this.a(dfy.tk, og.d, og.e);
      this.a(dfy.tl, og.d, og.e);
      this.a(dfy.tm, og.d, og.e);
      this.c(dfy.nT, og.i);
      this.z();
      this.a(dfy.pe, oe::A);
      this.a(dfy.pf, oe::C);
      this.a(dfy.kD, dtq.as, 0, 1, 2, 3);
      this.a(dfy.gt, dtq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfy.fq, dtq.as, 0, 1, 1, 2);
      this.a(dfy.gu, dtq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfy.cB, dtq.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dfy.kA, nn.e.b, dtq.aq, 0, 1);
      this.i();
      this.h();
      this.a(ob.a("decorated_pot"), dfy.iA).b(dfy.tp);
      this.a(ob.a("banner"), dfy.n)
         .a(od.bF, dfy.iJ, dfy.iK, dfy.iL, dfy.iM, dfy.iN, dfy.iO, dfy.iP, dfy.iQ, dfy.iR, dfy.iS, dfy.iT, dfy.iU, dfy.iV, dfy.iW, dfy.iX, dfy.iY)
         .b(dfy.iZ, dfy.ja, dfy.jb, dfy.jc, dfy.jd, dfy.je, dfy.jf, dfy.jg, dfy.jh, dfy.ji, dfy.jj, dfy.jk, dfy.jl, dfy.jm, dfy.jn, dfy.jo);
      this.a(ob.a("bed"), dfy.n)
         .b(dfy.aZ, dfy.ba, dfy.bb, dfy.bc, dfy.bd, dfy.be, dfy.bf, dfy.bg, dfy.bh, dfy.bi, dfy.bj, dfy.bk, dfy.bl, dfy.bm, dfy.bn, dfy.bo);
      this.m(dfy.aZ, dfy.bA);
      this.m(dfy.ba, dfy.bB);
      this.m(dfy.bb, dfy.bC);
      this.m(dfy.bc, dfy.bD);
      this.m(dfy.bd, dfy.bE);
      this.m(dfy.be, dfy.bF);
      this.m(dfy.bf, dfy.bG);
      this.m(dfy.bg, dfy.bH);
      this.m(dfy.bh, dfy.bI);
      this.m(dfy.bi, dfy.bJ);
      this.m(dfy.bj, dfy.bK);
      this.m(dfy.bk, dfy.bL);
      this.m(dfy.bl, dfy.bM);
      this.m(dfy.bm, dfy.bN);
      this.m(dfy.bn, dfy.bO);
      this.m(dfy.bo, dfy.bP);
      this.a(ob.a("skull"), dfy.dW)
         .a(od.bG, dfy.gM, dfy.gK, dfy.gI, dfy.gE, dfy.gG, dfy.gQ)
         .a(dfy.gO)
         .b(dfy.gN, dfy.gP, dfy.gL, dfy.gJ, dfy.gF, dfy.gH, dfy.gR);
      this.G(dfy.kP);
      this.G(dfy.kQ);
      this.G(dfy.kR);
      this.G(dfy.kS);
      this.G(dfy.kT);
      this.G(dfy.kU);
      this.G(dfy.kV);
      this.G(dfy.kW);
      this.G(dfy.kX);
      this.G(dfy.kY);
      this.G(dfy.kZ);
      this.G(dfy.la);
      this.G(dfy.lb);
      this.G(dfy.lc);
      this.G(dfy.ld);
      this.G(dfy.le);
      this.G(dfy.lf);
      this.b(dfy.mX, og.q);
      this.c(dfy.mX);
      this.a(ob.a("chest"), dfy.n).b(dfy.cv, dfy.gV);
      this.a(ob.a("ender_chest"), dfy.co).b(dfy.fG);
      this.f(dfy.fx, dfy.co).a(dfy.fx, dfy.kF);
      this.a(dfy.aM);
      this.a(dfy.aN);
      this.a(dfy.lw);
      this.a(dfy.lx);
      this.a(dfy.ly);
      this.a(dfy.lz);
      this.a(dfy.lA);
      this.a(dfy.lB);
      this.a(dfy.lC);
      this.a(dfy.lD);
      this.a(dfy.lE);
      this.a(dfy.lF);
      this.a(dfy.lG);
      this.a(dfy.lH);
      this.a(dfy.lI);
      this.a(dfy.lJ);
      this.a(dfy.lK);
      this.a(dfy.lL);
      this.a(og.a, dfy.lM, dfy.lN, dfy.lO, dfy.lP, dfy.lQ, dfy.lR, dfy.lS, dfy.lT, dfy.lU, dfy.lV, dfy.lW, dfy.lX, dfy.lY, dfy.lZ, dfy.ma, dfy.mb);
      this.a(dfy.iA);
      this.a(dfy.hj);
      this.a(dfy.hk);
      this.a(dfy.hl);
      this.a(dfy.hm);
      this.a(dfy.hn);
      this.a(dfy.ho);
      this.a(dfy.hp);
      this.a(dfy.hq);
      this.a(dfy.hr);
      this.a(dfy.hs);
      this.a(dfy.ht);
      this.a(dfy.hu);
      this.a(dfy.hv);
      this.a(dfy.hw);
      this.a(dfy.hx);
      this.a(dfy.hy);
      this.a(dfy.qO);
      this.h(dfy.aQ, dfy.eY);
      this.h(dfy.ei, dfy.hz);
      this.h(dfy.ej, dfy.hA);
      this.h(dfy.ek, dfy.hB);
      this.h(dfy.el, dfy.hC);
      this.h(dfy.em, dfy.hD);
      this.h(dfy.en, dfy.hE);
      this.h(dfy.eo, dfy.hF);
      this.h(dfy.ep, dfy.hG);
      this.h(dfy.eq, dfy.hH);
      this.h(dfy.er, dfy.hI);
      this.h(dfy.es, dfy.hJ);
      this.h(dfy.et, dfy.hK);
      this.h(dfy.eu, dfy.hL);
      this.h(dfy.ev, dfy.hM);
      this.h(dfy.ew, dfy.hN);
      this.h(dfy.ex, dfy.hO);
      this.b(og.o, dfy.lg, dfy.lh, dfy.li, dfy.lj, dfy.lk, dfy.ll, dfy.lm, dfy.ln, dfy.lo, dfy.lp, dfy.lq, dfy.lr, dfy.ls, dfy.lt, dfy.lu, dfy.lv);
      this.g(dfy.bA, dfy.ik);
      this.g(dfy.bB, dfy.il);
      this.g(dfy.bC, dfy.im);
      this.g(dfy.bD, dfy.in);
      this.g(dfy.bE, dfy.io);
      this.g(dfy.bF, dfy.ip);
      this.g(dfy.bG, dfy.iq);
      this.g(dfy.bH, dfy.ir);
      this.g(dfy.bI, dfy.is);
      this.g(dfy.bJ, dfy.it);
      this.g(dfy.bK, dfy.iu);
      this.g(dfy.bL, dfy.iv);
      this.g(dfy.bM, dfy.iw);
      this.g(dfy.bN, dfy.ix);
      this.g(dfy.bO, dfy.iy);
      this.g(dfy.bP, dfy.iz);
      this.a(dfy.sI);
      this.a(dfy.eL);
      this.a(dfy.bu, dfy.gb, nn.e.a);
      this.a(dfy.bR, dfy.gc, nn.e.b);
      this.a(dfy.bT, dfy.gd, nn.e.b);
      this.a(dfy.bU, dfy.ge, nn.e.b);
      this.a(dfy.bV, dfy.gf, nn.e.b);
      this.a(dfy.bW, dfy.gg, nn.e.b);
      this.a(dfy.bX, dfy.gh, nn.e.b);
      this.a(dfy.bY, dfy.gi, nn.e.b);
      this.a(dfy.bZ, dfy.gj, nn.e.b);
      this.a(dfy.ca, dfy.gk, nn.e.b);
      this.a(dfy.cb, dfy.gl, nn.e.b);
      this.a(dfy.cc, dfy.gm, nn.e.b);
      this.a(dfy.ce, dfy.gn, nn.e.b);
      this.a(dfy.cd, dfy.go, nn.e.b);
      this.a(dfy.cg, dfy.gp, nn.e.b);
      this.a(dfy.cf, dfy.gq, nn.e.b);
      this.a(dfy.bv, dfy.gr, nn.e.b);
      this.a(dfy.bS, dfy.fS, nn.e.b);
      this.H();
      this.u(dfy.eT);
      this.u(dfy.eU);
      this.u(dfy.eV);
      this.a(dfy.bt, nn.e.a);
      this.b(dfy.dS, nn.e.a);
      this.a(cur.dJ);
      this.b(dfy.mc, dfy.md, nn.e.b);
      this.a(cur.dK);
      this.c(dfy.md);
      this.b(dfy.sG, nn.e.b);
      this.c(dfy.sG);
      this.c(dfy.sw);
      this.b(dfy.oz, dfy.oA, nn.e.b);
      this.b(dfy.oB, dfy.oC, nn.e.b);
      this.a(dfy.oz, "_plant");
      this.c(dfy.oA);
      this.a(dfy.oB, "_plant");
      this.c(dfy.oC);
      this.a(dfy.mY, nn.e.a, oe.c(oe.a(dfy.mZ, "_stage0")));
      this.m();
      this.a(dfy.bs, nn.e.b);
      this.c(dfy.iE, nn.e.b);
      this.c(dfy.iF, nn.e.b);
      this.c(dfy.iG, nn.e.b);
      this.c(dfy.iH, nn.e.a);
      this.c(dfy.iI, nn.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dfy.mw, dfy.mr, dfy.mm, dfy.mh, dfy.mG, dfy.mB, dfy.mQ, dfy.mL);
      this.a(dfy.mx, dfy.ms, dfy.mn, dfy.mi, dfy.mH, dfy.mC, dfy.mR, dfy.mM);
      this.a(dfy.my, dfy.mt, dfy.mo, dfy.mj, dfy.mI, dfy.mD, dfy.mS, dfy.mN);
      this.a(dfy.mz, dfy.mu, dfy.mp, dfy.mk, dfy.mJ, dfy.mE, dfy.mT, dfy.mO);
      this.a(dfy.mA, dfy.mv, dfy.mq, dfy.ml, dfy.mK, dfy.mF, dfy.mU, dfy.mP);
      this.e(dfy.fe, dfy.fc);
      this.e(dfy.fd, dfy.fb);
      this.l(dfy.ab).c(dfy.ab).a(dfy.av);
      this.l(dfy.am).c(dfy.am).a(dfy.aD);
      this.a(dfy.am, dfy.dj, dfy.ds);
      this.b(dfy.aL, og.s);
      this.l(dfy.Y).c(dfy.Y).a(dfy.as);
      this.l(dfy.ai).c(dfy.ai).a(dfy.aA);
      this.a(dfy.ai, dfy.dd, dfy.do);
      this.a(dfy.B, dfy.fX, nn.e.b);
      this.b(dfy.aI, og.s);
      this.l(dfy.Z).d(dfy.Z).a(dfy.at);
      this.l(dfy.aj).d(dfy.aj).a(dfy.aB);
      this.a(dfy.aj, dfy.de, dfy.dp);
      this.a(dfy.C, dfy.fY, nn.e.b);
      this.b(dfy.aJ, og.s);
      this.l(dfy.W).c(dfy.W).a(dfy.aq);
      this.l(dfy.ag).c(dfy.ag).a(dfy.ay);
      this.a(dfy.ag, dfy.dc, dfy.dn);
      this.a(dfy.z, dfy.fV, nn.e.b);
      this.b(dfy.aG, og.s);
      this.l(dfy.U).c(dfy.U).a(dfy.ao);
      this.l(dfy.al).c(dfy.al).a(dfy.aw);
      this.a(dfy.al, dfy.da, dfy.dl);
      this.a(dfy.x, dfy.fT, nn.e.b);
      this.b(dfy.aE, og.s);
      this.l(dfy.V).c(dfy.V).a(dfy.ap);
      this.l(dfy.af).c(dfy.af).a(dfy.ax);
      this.a(dfy.af, dfy.db, dfy.dm);
      this.a(dfy.y, dfy.fU, nn.e.b);
      this.b(dfy.aF, og.s);
      this.l(dfy.aa).c(dfy.aa).a(dfy.au);
      this.l(dfy.ak).c(dfy.ak).a(dfy.aC);
      this.a(dfy.ak, dfy.dg, dfy.dr);
      this.a(dfy.D, dfy.fZ, nn.e.b);
      this.b(dfy.aK, og.s);
      this.l(dfy.X).c(dfy.X).a(dfy.ar);
      this.l(dfy.ah).c(dfy.ah).a(dfy.az);
      this.a(dfy.ah, dfy.df, dfy.dq);
      this.a(dfy.A, dfy.fW, nn.e.b);
      this.b(dfy.aH, og.s);
      this.l(dfy.os).b(dfy.os).a(dfy.ou);
      this.l(dfy.ot).b(dfy.ot).a(dfy.ov);
      this.a(dfy.ot, dfy.dh, dfy.dt);
      this.a(dfy.ox, dfy.pm, nn.e.b);
      this.n(dfy.oD, dfy.po);
      this.l(dfy.oj).b(dfy.oj).a(dfy.ol);
      this.l(dfy.ok).b(dfy.ok).a(dfy.om);
      this.a(dfy.ok, dfy.di, dfy.du);
      this.a(dfy.oo, dfy.pn, nn.e.b);
      this.n(dfy.oq, dfy.pp);
      this.l(dfy.ae).d(dfy.ae);
      this.l(dfy.an).d(dfy.an);
      this.a(dfy.v, dfy.dk, dfy.dv);
      this.b(dfy.or, nn.e.b);
      this.a(cur.dG);
      this.i(dfy.dy);
      this.k(dfy.hY);
      this.u();
      this.n(dfy.cP);
      this.o(dfy.bp);
      this.o(dfy.bq);
      this.o(dfy.hh);
      this.t();
      this.q(dfy.fN);
      this.q(dfy.kG);
      this.q(dfy.kH);
      this.r(dfy.gS);
      this.r(dfy.gT);
      this.r(dfy.gU);
      this.o();
      this.p();
      this.d(dfy.cD, og.h);
      this.d(dfy.nW, og.h);
      this.d(dfy.nV, og.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dfy.eK, dfy.eS);
      this.k(dfy.m, dfy.eO);
      this.k(dfy.eJ, dfy.eR);
      this.k(dfy.eI, dfy.eQ);
      this.az();
      this.k(dfy.eH, dfy.eP);
      this.aA();
      cvy.h().forEach($$0 -> this.a($$0, ob.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dfy.hX);
      nu.a<Integer> $$0 = nu.a(dtq.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akq $$3 = oe.a(cur.hC, $$2);
         $$0.a($$1, nw.a().a(nx.c, od.aa.a(dfy.hX, $$2, oe.h($$3), this.c)));
         od.bx.a(ob.a(cur.hC, $$2), oe.k($$3), this.c);
      }

      this.b.accept(nt.a(dfy.hX).a($$0));
   }

   private void o(dfw $$0, dfw $$1) {
      this.a($$0.r());
      oe $$2 = oe.b(oe.G($$0));
      oe $$3 = oe.b(oe.a($$0, "_lit"));
      akq $$4 = od.bH.a($$0, "_one_candle", $$2, this.c);
      akq $$5 = od.bI.a($$0, "_two_candles", $$2, this.c);
      akq $$6 = od.bJ.a($$0, "_three_candles", $$2, this.c);
      akq $$7 = od.bK.a($$0, "_four_candles", $$2, this.c);
      akq $$8 = od.bH.a($$0, "_one_candle_lit", $$3, this.c);
      akq $$9 = od.bI.a($$0, "_two_candles_lit", $$3, this.c);
      akq $$10 = od.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      akq $$11 = od.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nt.a($$0)
               .a(
                  nu.a(dtq.az, dtq.r)
                     .a(1, false, nw.a().a(nx.c, $$4))
                     .a(2, false, nw.a().a(nx.c, $$5))
                     .a(3, false, nw.a().a(nx.c, $$6))
                     .a(4, false, nw.a().a(nx.c, $$7))
                     .a(1, true, nw.a().a(nx.c, $$8))
                     .a(2, true, nw.a().a(nx.c, $$9))
                     .a(3, true, nw.a().a(nx.c, $$10))
                     .a(4, true, nw.a().a(nx.c, $$11))
               )
         );
      akq $$12 = od.bL.a($$1, oe.a($$0, false), this.c);
      akq $$13 = od.bL.a($$1, "_lit", oe.a($$0, true), this.c);
      this.b.accept(nt.a($$1).a(a(dtq.r, $$13, $$12)));
   }

   class a {
      private final akq b;

      public a(final akq $$0, final dfw $$1) {
         this.b = od.aa.a($$0, oe.u($$1), nn.this.c);
      }

      public nn.a a(dfw... $$0) {
         for (dfw $$1 : $$0) {
            nn.this.b.accept(nn.c($$1, this.b));
         }

         return this;
      }

      public nn.a b(dfw... $$0) {
         for (dfw $$1 : $$0) {
            nn.this.c($$1);
         }

         return this.a($$0);
      }

      public nn.a a(oc $$0, dfw... $$1) {
         for (dfw $$2 : $$1) {
            $$0.a(ob.a($$2.r()), oe.u($$2), nn.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final oe b;
      private final Map<oc, akq> c = Maps.newHashMap();
      @Nullable
      private lx d;
      @Nullable
      private akq e;
      private final Set<dfw> f = new HashSet<>();

      public b(final oe $$0) {
         this.b = $$0;
      }

      public nn.b a(dfw $$0, oc $$1) {
         this.e = $$1.a($$0, this.b, nn.this.c);
         if (nn.this.f.containsKey($$0)) {
            nn.this.b.accept(nn.this.f.get($$0).create($$0, this.e, this.b, nn.this.c));
         } else {
            nn.this.b.accept(nn.c($$0, this.e));
         }

         return this;
      }

      public nn.b a(dfw $$0, dfw $$1) {
         akq $$2 = ob.a($$0);
         nn.this.b.accept(nn.c($$1, $$2));
         nn.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nn.b a(dfw $$0) {
         akq $$1 = od.s.a($$0, this.b, nn.this.c);
         akq $$2 = od.t.a($$0, this.b, nn.this.c);
         nn.this.b.accept(nn.b($$0, $$1, $$2));
         akq $$3 = od.u.a($$0, this.b, nn.this.c);
         nn.this.a($$0, $$3);
         return this;
      }

      public nn.b b(dfw $$0) {
         akq $$1 = od.M.a($$0, this.b, nn.this.c);
         akq $$2 = od.N.a($$0, this.b, nn.this.c);
         akq $$3 = od.O.a($$0, this.b, nn.this.c);
         nn.this.b.accept(nn.a($$0, $$1, $$2, $$3));
         akq $$4 = od.P.a($$0, this.b, nn.this.c);
         nn.this.a($$0, $$4);
         return this;
      }

      public nn.b c(dfw $$0) {
         oe $$1 = oe.p($$0);
         akq $$2 = od.D.a($$0, $$1, nn.this.c);
         akq $$3 = od.E.a($$0, $$1, nn.this.c);
         akq $$4 = od.F.a($$0, $$1, nn.this.c);
         akq $$5 = od.G.a($$0, $$1, nn.this.c);
         akq $$6 = od.H.a($$0, $$1, nn.this.c);
         nn.this.b.accept(nn.a($$0, $$2, $$3, $$4, $$5, $$6));
         akq $$7 = od.I.a($$0, $$1, nn.this.c);
         nn.this.a($$0, $$7);
         return this;
      }

      public nn.b d(dfw $$0) {
         akq $$1 = od.J.a($$0, this.b, nn.this.c);
         akq $$2 = od.K.a($$0, this.b, nn.this.c);
         nn.this.b.accept(nn.c($$0, $$1, $$2));
         akq $$3 = od.L.a($$0, this.b, nn.this.c);
         nn.this.a($$0, $$3);
         return this;
      }

      public nn.b e(dfw $$0) {
         oe $$1 = oe.p($$0);
         akq $$2 = od.R.a($$0, $$1, nn.this.c);
         akq $$3 = od.Q.a($$0, $$1, nn.this.c);
         akq $$4 = od.T.a($$0, $$1, nn.this.c);
         akq $$5 = od.S.a($$0, $$1, nn.this.c);
         nn.this.b.accept(nn.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nn.b f(dfw $$0) {
         akq $$1 = od.V.a($$0, this.b, nn.this.c);
         akq $$2 = od.U.a($$0, this.b, nn.this.c);
         akq $$3 = od.X.a($$0, this.b, nn.this.c);
         akq $$4 = od.W.a($$0, this.b, nn.this.c);
         nn.this.b.accept(nn.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nn.b g(dfw $$0) {
         akq $$1 = od.Y.a($$0, this.b, nn.this.c);
         akq $$2 = od.Z.a($$0, this.b, nn.this.c);
         nn.this.b.accept(nn.e($$0, $$1, $$2));
         return this;
      }

      public nn.b h(dfw $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dfw $$1 = this.d.b().get(lx.b.r);
            akq $$2 = od.aa.a($$0, this.b, nn.this.c);
            nn.this.b.accept(nn.c($$0, $$2));
            nn.this.b.accept(nn.c($$1, $$2));
            nn.this.a($$0.r());
            nn.this.c($$1);
            return this;
         }
      }

      public nn.b i(dfw $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akq $$1 = this.a(od.ab, $$0);
            akq $$2 = this.a(od.ac, $$0);
            nn.this.b.accept(nn.e($$0, $$1, $$2, this.e));
            nn.this.a($$0, $$1);
            return this;
         }
      }

      public nn.b j(dfw $$0) {
         akq $$1 = this.a(od.af, $$0);
         akq $$2 = this.a(od.ae, $$0);
         akq $$3 = this.a(od.ag, $$0);
         nn.this.b.accept(nn.b($$0, $$1, $$2, $$3));
         nn.this.a($$0, $$2);
         return this;
      }

      private nn.b k(dfw $$0) {
         og $$1 = nn.this.g.getOrDefault($$0, og.a.get($$0));
         akq $$2 = $$1.a($$0, nn.this.c);
         nn.this.b.accept(nn.c($$0, $$2));
         return this;
      }

      private nn.b l(dfw $$0) {
         nn.this.i($$0);
         return this;
      }

      private void m(dfw $$0) {
         if (nn.this.e.contains($$0)) {
            nn.this.k($$0);
         } else {
            nn.this.j($$0);
         }
      }

      private akq a(oc $$0, dfw $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nn.this.c));
      }

      public nn.b a(lx $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nn.b, dfw> $$2 = nn.h.get($$0x);
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
      nq create(dfw var1, akq var2, oe var3, BiConsumer<akq, Supplier<JsonElement>> var4);
   }

   static record d(oc a, String b) {
   }

   static enum e {
      a,
      b;

      public oc a() {
         return this == a ? od.ap : od.ao;
      }

      public oc b() {
         return this == a ? od.ar : od.aq;
      }
   }

   class f {
      private final oe b;

      public f(final oe $$0) {
         this.b = $$0;
      }

      public nn.f a(dfw $$0) {
         oe $$1 = this.b.c(of.d, this.b.a(of.i));
         akq $$2 = od.j.a($$0, $$1, nn.this.c);
         nn.this.b.accept(nn.d($$0, $$2));
         return this;
      }

      public nn.f b(dfw $$0) {
         akq $$1 = od.j.a($$0, this.b, nn.this.c);
         nn.this.b.accept(nn.d($$0, $$1));
         return this;
      }

      public nn.f c(dfw $$0) {
         akq $$1 = od.j.a($$0, this.b, nn.this.c);
         akq $$2 = od.k.a($$0, this.b, nn.this.c);
         nn.this.b.accept(nn.d($$0, $$1, $$2));
         return this;
      }

      public nn.f d(dfw $$0) {
         nn.this.b.accept(nn.a($$0, this.b, nn.this.c));
         return this;
      }
   }
}
