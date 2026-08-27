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

public class mt {
   final Consumer<mw> b;
   final BiConsumer<ajv, Supplier<JsonElement>> c;
   private final Consumer<crn> d;
   final List<dch> e = ImmutableList.of(dcj.ey, dcj.eE, dcj.hY);
   final Map<dch, mt.c> f = ImmutableMap.builder().put(dcj.b, mt::a).put(dcj.sJ, mt::c).put(dcj.eM, mt::b).build();
   final Map<dch, nm> g = ImmutableMap.builder()
      .put(dcj.aV, nm.y.get(dcj.aV))
      .put(dcj.jp, nm.y.get(dcj.jp))
      .put(dcj.jS, nm.a(nk.a(dcj.aV, "_top")))
      .put(dcj.jU, nm.a(nk.a(dcj.jp, "_top")))
      .put(dcj.aX, nm.d.get(dcj.aV).a($$0x -> $$0x.a(nl.i, nk.G(dcj.aX))))
      .put(dcj.jr, nm.d.get(dcj.jp).a($$0x -> $$0x.a(nl.i, nk.G(dcj.jr))))
      .put(dcj.hd, nm.d.get(dcj.hd))
      .put(dcj.jT, nm.a(nk.a(dcj.hd, "_bottom")))
      .put(dcj.pr, nm.z.get(dcj.pr))
      .put(dcj.sJ, nm.z.get(dcj.sJ))
      .put(dcj.he, nm.d.get(dcj.he).a($$0x -> $$0x.a(nl.i, nk.G(dcj.he))))
      .put(dcj.aW, nm.d.get(dcj.aW).a($$0x -> {
         $$0x.a(nl.d, nk.a(dcj.aV, "_top"));
         $$0x.a(nl.i, nk.G(dcj.aW));
      }))
      .put(dcj.jq, nm.d.get(dcj.jq).a($$0x -> {
         $$0x.a(nl.d, nk.a(dcj.jp, "_top"));
         $$0x.a(nl.i, nk.G(dcj.jq));
      }))
      .put(dcj.qM, nm.z.get(dcj.qM))
      .put(dcj.qH, nm.z.get(dcj.qH))
      .build();
   static final Map<kx.b, BiConsumer<mt.b, dch>> h = ImmutableMap.builder()
      .put(kx.b.a, mt.b::a)
      .put(kx.b.e, mt.b::l)
      .put(kx.b.b, mt.b::k)
      .put(kx.b.c, mt.b::k)
      .put(kx.b.f, mt.b::c)
      .put(kx.b.g, mt.b::d)
      .put(kx.b.h, mt.b::e)
      .put(kx.b.i, mt.b::f)
      .put(kx.b.k, mt.b::h)
      .put(kx.b.l, mt.b::i)
      .put(kx.b.m, mt.b::j)
      .put(kx.b.n, mt.b::g)
      .put(kx.b.p, mt.b::m)
      .put(kx.b.q, mt.b::b)
      .build();
   public static final List<Pair<dpz, Function<ajv, nc>>> a = List.of(
      Pair.of(dpy.L, (Function<ajv, nc>)$$0 -> nc.a().a(nd.c, $$0)),
      Pair.of(dpy.M, (Function<ajv, nc>)$$0 -> nc.a().a(nd.c, $$0).a(nd.b, nd.a.b).a(nd.d, true)),
      Pair.of(dpy.N, (Function<ajv, nc>)$$0 -> nc.a().a(nd.c, $$0).a(nd.b, nd.a.c).a(nd.d, true)),
      Pair.of(dpy.O, (Function<ajv, nc>)$$0 -> nc.a().a(nd.c, $$0).a(nd.b, nd.a.d).a(nd.d, true)),
      Pair.of(dpy.J, (Function<ajv, nc>)$$0 -> nc.a().a(nd.c, $$0).a(nd.a, nd.a.d).a(nd.d, true)),
      Pair.of(dpy.K, (Function<ajv, nc>)$$0 -> nc.a().a(nd.c, $$0).a(nd.a, nd.a.b).a(nd.d, true))
   );
   private static final Map<mt.d, ajv> i = new HashMap<>();

   private static mw a(dch $$0, ajv $$1, nk $$2, BiConsumer<ajv, Supplier<JsonElement>> $$3) {
      ajv $$4 = nj.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static mw b(dch $$0, ajv $$1, nk $$2, BiConsumer<ajv, Supplier<JsonElement>> $$3) {
      ajv $$4 = nj.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static mw c(dch $$0, ajv $$1, nk $$2, BiConsumer<ajv, Supplier<JsonElement>> $$3) {
      ajv $$4 = nj.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public mt(Consumer<mw> $$0, BiConsumer<ajv, Supplier<JsonElement>> $$1, Consumer<crn> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dch $$0) {
      this.d.accept($$0.p());
   }

   void a(dch $$0, ajv $$1) {
      this.c.accept(nh.a($$0.p()), new ng($$1));
   }

   private void a(crn $$0, ajv $$1) {
      this.c.accept(nh.a($$0), new ng($$1));
   }

   void a(crn $$0) {
      nj.bx.a(nh.a($$0), nk.b($$0), this.c);
   }

   private void d(dch $$0) {
      crn $$1 = $$0.p();
      if ($$1 != crv.a) {
         nj.bx.a(nh.a($$1), nk.F($$0), this.c);
      }
   }

   private void a(dch $$0, String $$1) {
      crn $$2 = $$0.p();
      nj.bx.a(nh.a($$2), nk.k(nk.a($$0, $$1)), this.c);
   }

   private static na b() {
      return na.a(dpy.R).a(ij.f, nc.a().a(nd.b, nd.a.b)).a(ij.d, nc.a().a(nd.b, nd.a.c)).a(ij.e, nc.a().a(nd.b, nd.a.d)).a(ij.c, nc.a());
   }

   private static na c() {
      return na.a(dpy.R).a(ij.d, nc.a()).a(ij.e, nc.a().a(nd.b, nd.a.b)).a(ij.c, nc.a().a(nd.b, nd.a.c)).a(ij.f, nc.a().a(nd.b, nd.a.d));
   }

   private static na d() {
      return na.a(dpy.R).a(ij.f, nc.a()).a(ij.d, nc.a().a(nd.b, nd.a.b)).a(ij.e, nc.a().a(nd.b, nd.a.c)).a(ij.c, nc.a().a(nd.b, nd.a.d));
   }

   private static na e() {
      return na.a(dpy.P)
         .a(ij.a, nc.a().a(nd.a, nd.a.b))
         .a(ij.b, nc.a().a(nd.a, nd.a.d))
         .a(ij.c, nc.a())
         .a(ij.d, nc.a().a(nd.b, nd.a.c))
         .a(ij.e, nc.a().a(nd.b, nd.a.d))
         .a(ij.f, nc.a().a(nd.b, nd.a.b));
   }

   private static mz b(dch $$0, ajv $$1) {
      return mz.a($$0, a($$1));
   }

   private static nc[] a(ajv $$0) {
      return new nc[]{nc.a().a(nd.c, $$0), nc.a().a(nd.c, $$0).a(nd.b, nd.a.b), nc.a().a(nd.c, $$0).a(nd.b, nd.a.c), nc.a().a(nd.c, $$0).a(nd.b, nd.a.d)};
   }

   private static mz a(dch $$0, ajv $$1, ajv $$2) {
      return mz.a($$0, nc.a().a(nd.c, $$1), nc.a().a(nd.c, $$2), nc.a().a(nd.c, $$1).a(nd.b, nd.a.c), nc.a().a(nd.c, $$2).a(nd.b, nd.a.c));
   }

   private static na a(dpz $$0, ajv $$1, ajv $$2) {
      return na.a($$0).a(true, nc.a().a(nd.c, $$1)).a(false, nc.a().a(nd.c, $$2));
   }

   private void e(dch $$0) {
      ajv $$1 = nm.a.create($$0, this.c);
      ajv $$2 = nm.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dch $$0) {
      ajv $$1 = nm.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dch $$0) {
      this.b.accept(mz.a($$0).a(na.a(dpy.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ajv $$3 = nk.a($$0, $$2);
         return nc.a().a(nd.c, nj.c.a($$0, $$2, new nk().a(nl.a, $$3), this.c));
      })));
      this.a($$0, nk.a($$0, "_0"));
   }

   static mw b(dch $$0, ajv $$1, ajv $$2) {
      return mz.a($$0)
         .a(na.a(dpy.w).a(false, nc.a().a(nd.c, $$1)).a(true, nc.a().a(nd.c, $$2)))
         .a(
            na.a(dpy.U, dpy.R)
               .a(dpt.a, ij.f, nc.a().a(nd.b, nd.a.b))
               .a(dpt.a, ij.e, nc.a().a(nd.b, nd.a.d))
               .a(dpt.a, ij.d, nc.a().a(nd.b, nd.a.c))
               .a(dpt.a, ij.c, nc.a())
               .a(dpt.b, ij.f, nc.a().a(nd.b, nd.a.b).a(nd.a, nd.a.b).a(nd.d, true))
               .a(dpt.b, ij.e, nc.a().a(nd.b, nd.a.d).a(nd.a, nd.a.b).a(nd.d, true))
               .a(dpt.b, ij.d, nc.a().a(nd.b, nd.a.c).a(nd.a, nd.a.b).a(nd.d, true))
               .a(dpt.b, ij.c, nc.a().a(nd.a, nd.a.b).a(nd.d, true))
               .a(dpt.c, ij.f, nc.a().a(nd.b, nd.a.d).a(nd.a, nd.a.c))
               .a(dpt.c, ij.e, nc.a().a(nd.b, nd.a.b).a(nd.a, nd.a.c))
               .a(dpt.c, ij.d, nc.a().a(nd.a, nd.a.c))
               .a(dpt.c, ij.c, nc.a().a(nd.b, nd.a.c).a(nd.a, nd.a.c))
         );
   }

   private static na.d<ij, dqe, dqd, Boolean> a(na.d<ij, dqe, dqd, Boolean> $$0, dqe $$1, ajv $$2, ajv $$3, ajv $$4, ajv $$5) {
      return $$0.a(ij.f, $$1, dqd.a, false, nc.a().a(nd.c, $$2))
         .a(ij.d, $$1, dqd.a, false, nc.a().a(nd.c, $$2).a(nd.b, nd.a.b))
         .a(ij.e, $$1, dqd.a, false, nc.a().a(nd.c, $$2).a(nd.b, nd.a.c))
         .a(ij.c, $$1, dqd.a, false, nc.a().a(nd.c, $$2).a(nd.b, nd.a.d))
         .a(ij.f, $$1, dqd.b, false, nc.a().a(nd.c, $$4))
         .a(ij.d, $$1, dqd.b, false, nc.a().a(nd.c, $$4).a(nd.b, nd.a.b))
         .a(ij.e, $$1, dqd.b, false, nc.a().a(nd.c, $$4).a(nd.b, nd.a.c))
         .a(ij.c, $$1, dqd.b, false, nc.a().a(nd.c, $$4).a(nd.b, nd.a.d))
         .a(ij.f, $$1, dqd.a, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.b))
         .a(ij.d, $$1, dqd.a, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.c))
         .a(ij.e, $$1, dqd.a, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.d))
         .a(ij.c, $$1, dqd.a, true, nc.a().a(nd.c, $$3))
         .a(ij.f, $$1, dqd.b, true, nc.a().a(nd.c, $$5).a(nd.b, nd.a.d))
         .a(ij.d, $$1, dqd.b, true, nc.a().a(nd.c, $$5))
         .a(ij.e, $$1, dqd.b, true, nc.a().a(nd.c, $$5).a(nd.b, nd.a.b))
         .a(ij.c, $$1, dqd.b, true, nc.a().a(nd.c, $$5).a(nd.b, nd.a.c));
   }

   private static mw a(dch $$0, ajv $$1, ajv $$2, ajv $$3, ajv $$4, ajv $$5, ajv $$6, ajv $$7, ajv $$8) {
      return mz.a($$0).a(a(a(na.a(dpy.R, dpy.ae, dpy.be, dpy.u), dqe.b, $$1, $$2, $$3, $$4), dqe.a, $$5, $$6, $$7, $$8));
   }

   static mw a(dch $$0, ajv $$1, ajv $$2, ajv $$3, ajv $$4, ajv $$5) {
      return my.a($$0)
         .a(nc.a().a(nd.c, $$1))
         .a(mx.a().a(dpy.L, true), nc.a().a(nd.c, $$2).a(nd.d, false))
         .a(mx.a().a(dpy.M, true), nc.a().a(nd.c, $$3).a(nd.d, false))
         .a(mx.a().a(dpy.N, true), nc.a().a(nd.c, $$4).a(nd.d, false))
         .a(mx.a().a(dpy.O, true), nc.a().a(nd.c, $$5).a(nd.d, false));
   }

   static mw c(dch $$0, ajv $$1, ajv $$2) {
      return my.a($$0)
         .a(nc.a().a(nd.c, $$1))
         .a(mx.a().a(dpy.L, true), nc.a().a(nd.c, $$2).a(nd.d, true))
         .a(mx.a().a(dpy.M, true), nc.a().a(nd.c, $$2).a(nd.b, nd.a.b).a(nd.d, true))
         .a(mx.a().a(dpy.N, true), nc.a().a(nd.c, $$2).a(nd.b, nd.a.c).a(nd.d, true))
         .a(mx.a().a(dpy.O, true), nc.a().a(nd.c, $$2).a(nd.b, nd.a.d).a(nd.d, true));
   }

   static mw a(dch $$0, ajv $$1, ajv $$2, ajv $$3) {
      return my.a($$0)
         .a(mx.a().a(dpy.J, true), nc.a().a(nd.c, $$1))
         .a(mx.a().a(dpy.X, dqu.b), nc.a().a(nd.c, $$2).a(nd.d, true))
         .a(mx.a().a(dpy.W, dqu.b), nc.a().a(nd.c, $$2).a(nd.b, nd.a.b).a(nd.d, true))
         .a(mx.a().a(dpy.Y, dqu.b), nc.a().a(nd.c, $$2).a(nd.b, nd.a.c).a(nd.d, true))
         .a(mx.a().a(dpy.Z, dqu.b), nc.a().a(nd.c, $$2).a(nd.b, nd.a.d).a(nd.d, true))
         .a(mx.a().a(dpy.X, dqu.c), nc.a().a(nd.c, $$3).a(nd.d, true))
         .a(mx.a().a(dpy.W, dqu.c), nc.a().a(nd.c, $$3).a(nd.b, nd.a.b).a(nd.d, true))
         .a(mx.a().a(dpy.Y, dqu.c), nc.a().a(nd.c, $$3).a(nd.b, nd.a.c).a(nd.d, true))
         .a(mx.a().a(dpy.Z, dqu.c), nc.a().a(nd.c, $$3).a(nd.b, nd.a.d).a(nd.d, true));
   }

   static mw a(dch $$0, ajv $$1, ajv $$2, ajv $$3, ajv $$4, boolean $$5) {
      return mz.a($$0, nc.a().a(nd.d, $$5))
         .a(c())
         .a(
            na.a(dpy.q, dpy.u)
               .a(false, false, nc.a().a(nd.c, $$2))
               .a(true, false, nc.a().a(nd.c, $$4))
               .a(false, true, nc.a().a(nd.c, $$1))
               .a(true, true, nc.a().a(nd.c, $$3))
         );
   }

   static mw b(dch $$0, ajv $$1, ajv $$2, ajv $$3) {
      return mz.a($$0)
         .a(
            na.a(dpy.R, dpy.af, dpy.bi)
               .a(ij.f, dqh.b, dqr.a, nc.a().a(nd.c, $$2))
               .a(ij.e, dqh.b, dqr.a, nc.a().a(nd.c, $$2).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.d, dqh.b, dqr.a, nc.a().a(nd.c, $$2).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.c, dqh.b, dqr.a, nc.a().a(nd.c, $$2).a(nd.b, nd.a.d).a(nd.d, true))
               .a(ij.f, dqh.b, dqr.e, nc.a().a(nd.c, $$3))
               .a(ij.e, dqh.b, dqr.e, nc.a().a(nd.c, $$3).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.d, dqh.b, dqr.e, nc.a().a(nd.c, $$3).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.c, dqh.b, dqr.e, nc.a().a(nd.c, $$3).a(nd.b, nd.a.d).a(nd.d, true))
               .a(ij.f, dqh.b, dqr.d, nc.a().a(nd.c, $$3).a(nd.b, nd.a.d).a(nd.d, true))
               .a(ij.e, dqh.b, dqr.d, nc.a().a(nd.c, $$3).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.d, dqh.b, dqr.d, nc.a().a(nd.c, $$3))
               .a(ij.c, dqh.b, dqr.d, nc.a().a(nd.c, $$3).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.f, dqh.b, dqr.c, nc.a().a(nd.c, $$1))
               .a(ij.e, dqh.b, dqr.c, nc.a().a(nd.c, $$1).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.d, dqh.b, dqr.c, nc.a().a(nd.c, $$1).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.c, dqh.b, dqr.c, nc.a().a(nd.c, $$1).a(nd.b, nd.a.d).a(nd.d, true))
               .a(ij.f, dqh.b, dqr.b, nc.a().a(nd.c, $$1).a(nd.b, nd.a.d).a(nd.d, true))
               .a(ij.e, dqh.b, dqr.b, nc.a().a(nd.c, $$1).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.d, dqh.b, dqr.b, nc.a().a(nd.c, $$1))
               .a(ij.c, dqh.b, dqr.b, nc.a().a(nd.c, $$1).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.f, dqh.a, dqr.a, nc.a().a(nd.c, $$2).a(nd.a, nd.a.c).a(nd.d, true))
               .a(ij.e, dqh.a, dqr.a, nc.a().a(nd.c, $$2).a(nd.a, nd.a.c).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.d, dqh.a, dqr.a, nc.a().a(nd.c, $$2).a(nd.a, nd.a.c).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.c, dqh.a, dqr.a, nc.a().a(nd.c, $$2).a(nd.a, nd.a.c).a(nd.b, nd.a.d).a(nd.d, true))
               .a(ij.f, dqh.a, dqr.e, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.e, dqh.a, dqr.e, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.d).a(nd.d, true))
               .a(ij.d, dqh.a, dqr.e, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.c, dqh.a, dqr.e, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.d, true))
               .a(ij.f, dqh.a, dqr.d, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.d, true))
               .a(ij.e, dqh.a, dqr.d, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.d, dqh.a, dqr.d, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.c, dqh.a, dqr.d, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.d).a(nd.d, true))
               .a(ij.f, dqh.a, dqr.c, nc.a().a(nd.c, $$1).a(nd.a, nd.a.c).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.e, dqh.a, dqr.c, nc.a().a(nd.c, $$1).a(nd.a, nd.a.c).a(nd.b, nd.a.d).a(nd.d, true))
               .a(ij.d, dqh.a, dqr.c, nc.a().a(nd.c, $$1).a(nd.a, nd.a.c).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.c, dqh.a, dqr.c, nc.a().a(nd.c, $$1).a(nd.a, nd.a.c).a(nd.d, true))
               .a(ij.f, dqh.a, dqr.b, nc.a().a(nd.c, $$1).a(nd.a, nd.a.c).a(nd.d, true))
               .a(ij.e, dqh.a, dqr.b, nc.a().a(nd.c, $$1).a(nd.a, nd.a.c).a(nd.b, nd.a.c).a(nd.d, true))
               .a(ij.d, dqh.a, dqr.b, nc.a().a(nd.c, $$1).a(nd.a, nd.a.c).a(nd.b, nd.a.b).a(nd.d, true))
               .a(ij.c, dqh.a, dqr.b, nc.a().a(nd.c, $$1).a(nd.a, nd.a.c).a(nd.b, nd.a.d).a(nd.d, true))
         );
   }

   private static mw c(dch $$0, ajv $$1, ajv $$2, ajv $$3) {
      return mz.a($$0)
         .a(
            na.a(dpy.R, dpy.af, dpy.u)
               .a(ij.c, dqh.b, false, nc.a().a(nd.c, $$2))
               .a(ij.d, dqh.b, false, nc.a().a(nd.c, $$2).a(nd.b, nd.a.c))
               .a(ij.f, dqh.b, false, nc.a().a(nd.c, $$2).a(nd.b, nd.a.b))
               .a(ij.e, dqh.b, false, nc.a().a(nd.c, $$2).a(nd.b, nd.a.d))
               .a(ij.c, dqh.a, false, nc.a().a(nd.c, $$1))
               .a(ij.d, dqh.a, false, nc.a().a(nd.c, $$1).a(nd.b, nd.a.c))
               .a(ij.f, dqh.a, false, nc.a().a(nd.c, $$1).a(nd.b, nd.a.b))
               .a(ij.e, dqh.a, false, nc.a().a(nd.c, $$1).a(nd.b, nd.a.d))
               .a(ij.c, dqh.b, true, nc.a().a(nd.c, $$3))
               .a(ij.d, dqh.b, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.c))
               .a(ij.f, dqh.b, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.b))
               .a(ij.e, dqh.b, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.d))
               .a(ij.c, dqh.a, true, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.c))
               .a(ij.d, dqh.a, true, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.a))
               .a(ij.f, dqh.a, true, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.d))
               .a(ij.e, dqh.a, true, nc.a().a(nd.c, $$3).a(nd.a, nd.a.c).a(nd.b, nd.a.b))
         );
   }

   private static mw d(dch $$0, ajv $$1, ajv $$2, ajv $$3) {
      return mz.a($$0)
         .a(
            na.a(dpy.R, dpy.af, dpy.u)
               .a(ij.c, dqh.b, false, nc.a().a(nd.c, $$2))
               .a(ij.d, dqh.b, false, nc.a().a(nd.c, $$2))
               .a(ij.f, dqh.b, false, nc.a().a(nd.c, $$2))
               .a(ij.e, dqh.b, false, nc.a().a(nd.c, $$2))
               .a(ij.c, dqh.a, false, nc.a().a(nd.c, $$1))
               .a(ij.d, dqh.a, false, nc.a().a(nd.c, $$1))
               .a(ij.f, dqh.a, false, nc.a().a(nd.c, $$1))
               .a(ij.e, dqh.a, false, nc.a().a(nd.c, $$1))
               .a(ij.c, dqh.b, true, nc.a().a(nd.c, $$3))
               .a(ij.d, dqh.b, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.c))
               .a(ij.f, dqh.b, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.b))
               .a(ij.e, dqh.b, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.d))
               .a(ij.c, dqh.a, true, nc.a().a(nd.c, $$3))
               .a(ij.d, dqh.a, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.c))
               .a(ij.f, dqh.a, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.b))
               .a(ij.e, dqh.a, true, nc.a().a(nd.c, $$3).a(nd.b, nd.a.d))
         );
   }

   static mz c(dch $$0, ajv $$1) {
      return mz.a($$0, nc.a().a(nd.c, $$1));
   }

   private static na f() {
      return na.a(dpy.I).a(ij.a.b, nc.a()).a(ij.a.c, nc.a().a(nd.a, nd.a.b)).a(ij.a.a, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.b));
   }

   static mw a(dch $$0, nk $$1, BiConsumer<ajv, Supplier<JsonElement>> $$2) {
      ajv $$3 = nj.g.a($$0, $$1, $$2);
      ajv $$4 = nj.h.a($$0, $$1, $$2);
      ajv $$5 = nj.i.a($$0, $$1, $$2);
      ajv $$6 = nj.j.a($$0, $$1, $$2);
      return mz.a($$0, nc.a().a(nd.c, $$6)).a(na.a(dpy.I).a(ij.a.a, nc.a().a(nd.c, $$3)).a(ij.a.b, nc.a().a(nd.c, $$4)).a(ij.a.c, nc.a().a(nd.c, $$5)));
   }

   static mw d(dch $$0, ajv $$1) {
      return mz.a($$0, nc.a().a(nd.c, $$1)).a(f());
   }

   private void e(dch $$0, ajv $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dch $$0, nm.a $$1) {
      ajv $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dch $$0, nm.a $$1) {
      ajv $$2 = $$1.create($$0, this.c);
      this.b.accept(mz.a($$0, nc.a().a(nd.c, $$2)).a(b()));
   }

   static mw d(dch $$0, ajv $$1, ajv $$2) {
      return mz.a($$0)
         .a(
            na.a(dpy.I)
               .a(ij.a.b, nc.a().a(nd.c, $$1))
               .a(ij.a.c, nc.a().a(nd.c, $$2).a(nd.a, nd.a.b))
               .a(ij.a.a, nc.a().a(nd.c, $$2).a(nd.a, nd.a.b).a(nd.b, nd.a.b))
         );
   }

   private void a(dch $$0, nm.a $$1, nm.a $$2) {
      ajv $$3 = $$1.create($$0, this.c);
      ajv $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ajv a(dch $$0, String $$1, ni $$2, Function<ajv, nk> $$3) {
      return $$2.a($$0, $$1, $$3.apply(nk.a($$0, $$1)), this.c);
   }

   static mw e(dch $$0, ajv $$1, ajv $$2) {
      return mz.a($$0).a(a(dpy.w, $$2, $$1));
   }

   static mw e(dch $$0, ajv $$1, ajv $$2, ajv $$3) {
      return mz.a($$0).a(na.a(dpy.bh).a(dqq.b, nc.a().a(nd.c, $$1)).a(dqq.a, nc.a().a(nd.c, $$2)).a(dqq.c, nc.a().a(nd.c, $$3)));
   }

   public void a(dch $$0) {
      this.b($$0, nm.a);
   }

   public void b(dch $$0, nm.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dch $$0, nk $$1, ni $$2) {
      ajv $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private mt.b h(dch $$0) {
      nm $$1 = this.g.getOrDefault($$0, nm.a.get($$0));
      return new mt.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dch $$0, dch $$1, dch $$2) {
      nk $$3 = nk.u($$0);
      ajv $$4 = nj.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.p());
      this.c($$2);
   }

   void i(dch $$0) {
      nk $$1 = nk.t($$0);
      ajv $$2 = nj.v.a($$0, $$1, this.c);
      ajv $$3 = nj.w.a($$0, $$1, this.c);
      ajv $$4 = nj.x.a($$0, $$1, this.c);
      ajv $$5 = nj.y.a($$0, $$1, this.c);
      ajv $$6 = nj.z.a($$0, $$1, this.c);
      ajv $$7 = nj.A.a($$0, $$1, this.c);
      ajv $$8 = nj.B.a($$0, $$1, this.c);
      ajv $$9 = nj.C.a($$0, $$1, this.c);
      this.a($$0.p());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dch $$0, dch $$1) {
      ajv $$2 = nj.v.a($$0);
      ajv $$3 = nj.w.a($$0);
      ajv $$4 = nj.x.a($$0);
      ajv $$5 = nj.y.a($$0);
      ajv $$6 = nj.z.a($$0);
      ajv $$7 = nj.A.a($$0);
      ajv $$8 = nj.B.a($$0);
      ajv $$9 = nj.C.a($$0);
      this.a($$1, nh.a($$0.p()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dch $$0) {
      nk $$1 = nk.b($$0);
      ajv $$2 = nj.ak.a($$0, $$1, this.c);
      ajv $$3 = nj.al.a($$0, $$1, this.c);
      ajv $$4 = nj.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dch $$0) {
      nk $$1 = nk.b($$0);
      ajv $$2 = nj.ah.a($$0, $$1, this.c);
      ajv $$3 = nj.ai.a($$0, $$1, this.c);
      ajv $$4 = nj.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dch $$0, dch $$1) {
      ajv $$2 = nj.ah.a($$0);
      ajv $$3 = nj.ai.a($$0);
      ajv $$4 = nj.aj.a($$0);
      this.a($$1, nh.a($$0.p()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dcj.sD);
      ajv $$0 = nh.a(dcj.sD);
      ajv $$1 = nh.a(dcj.sD, "_partial_tilt");
      ajv $$2 = nh.a(dcj.sD, "_full_tilt");
      this.b
         .accept(
            mz.a(dcj.sD)
               .a(b())
               .a(na.a(dpy.bl).a(dqt.a, nc.a().a(nd.c, $$0)).a(dqt.b, nc.a().a(nd.c, $$0)).a(dqt.c, nc.a().a(nd.c, $$1)).a(dqt.d, nc.a().a(nd.c, $$2)))
         );
   }

   private mt.f l(dch $$0) {
      return new mt.f(nk.n($$0));
   }

   private void m(dch $$0) {
      this.c($$0, $$0);
   }

   private void c(dch $$0, dch $$1) {
      this.b.accept(c($$0, nh.a($$1)));
   }

   private void a(dch $$0, mt.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dch $$0, mt.e $$1, nk $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dch $$0, mt.e $$1) {
      nk $$2 = nk.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dch $$0, mt.e $$1, nk $$2) {
      ajv $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dch $$0, mt.e $$1, dql<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         na $$4 = na.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            nk $$5 = nk.c(nk.a($$0, $$4x));
            ajv $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return nc.a().a(nd.c, $$6);
         });
         this.a($$0.p());
         this.b.accept(mz.a($$0).a($$4));
      }
   }

   private void a(dch $$0, dch $$1, mt.e $$2) {
      this.a($$0, $$2);
      nk $$3 = nk.d($$0);
      ajv $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dch $$0, dch $$1) {
      nm $$2 = nm.p.get($$0);
      ajv $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ajv $$4 = nj.aC.a($$1, $$2.b(), this.c);
      this.b.accept(mz.a($$1, nc.a().a(nd.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dch $$0, dch $$1) {
      this.a($$0.p());
      nk $$2 = nk.h($$0);
      nk $$3 = nk.a($$0, $$1);
      ajv $$4 = nj.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            mz.a($$1, nc.a().a(nd.c, $$4))
               .a(na.a(dpy.R).a(ij.e, nc.a()).a(ij.d, nc.a().a(nd.b, nd.a.d)).a(ij.c, nc.a().a(nd.b, nd.a.b)).a(ij.f, nc.a().a(nd.b, nd.a.c)))
         );
      this.b.accept(mz.a($$0).a(na.a(dpy.av).a($$2x -> nc.a().a(nd.c, nj.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dch $$0 = dcj.kC;
      this.a($$0.p());
      ajv $$1 = nh.a($$0, "_top");
      ajv $$2 = nh.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dch $$0 = dcj.kB;
      this.a($$0.p());
      na $$1 = na.a(dhv.d, dpy.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> nc.a().a(nd.c, nh.a($$0, "_top_stage_" + $$1x));
            case b -> nc.a().a(nd.c, nh.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mz.a($$0).a($$1));
   }

   private void a(dch $$0, dch $$1, dch $$2, dch $$3, dch $$4, dch $$5, dch $$6, dch $$7) {
      this.a($$0, mt.e.b);
      this.a($$1, mt.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dch $$0, mt.e $$1) {
      this.a($$0, "_top");
      ajv $$2 = this.a($$0, "_top", $$1.a(), nk::c);
      ajv $$3 = this.a($$0, "_bottom", $$1.a(), nk::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dcj.iD, "_front");
      ajv $$0 = nh.a(dcj.iD, "_top");
      ajv $$1 = this.a(dcj.iD, "_bottom", mt.e.b.a(), nk::c);
      this.f(dcj.iD, $$0, $$1);
   }

   private void k() {
      ajv $$0 = this.a(dcj.bx, "_top", nj.bk, nk::a);
      ajv $$1 = this.a(dcj.bx, "_bottom", nj.bk, nk::a);
      this.f(dcj.bx, $$0, $$1);
   }

   private void l() {
      this.c(dcj.sF);
      ajv $$0 = nh.a(dcj.sF, "_top");
      ajv $$1 = nh.a(dcj.sF, "_bottom");
      this.b.accept(mz.a(dcj.sF).a(b()).a(na.a(dpy.ae).a(dqe.b, nc.a().a(nd.c, $$1)).a(dqe.a, nc.a().a(nd.c, $$0))));
   }

   private void f(dch $$0, ajv $$1, ajv $$2) {
      this.b.accept(mz.a($$0).a(na.a(dpy.ae).a(dqe.b, nc.a().a(nd.c, $$2)).a(dqe.a, nc.a().a(nd.c, $$1))));
   }

   private void n(dch $$0) {
      nk $$1 = nk.e($$0);
      nk $$2 = nk.e(nk.a($$0, "_corner"));
      ajv $$3 = nj.as.a($$0, $$1, this.c);
      ajv $$4 = nj.at.a($$0, $$2, this.c);
      ajv $$5 = nj.au.a($$0, $$1, this.c);
      ajv $$6 = nj.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            mz.a($$0)
               .a(
                  na.a(dpy.ag)
                     .a(dqm.a, nc.a().a(nd.c, $$3))
                     .a(dqm.b, nc.a().a(nd.c, $$3).a(nd.b, nd.a.b))
                     .a(dqm.c, nc.a().a(nd.c, $$5).a(nd.b, nd.a.b))
                     .a(dqm.d, nc.a().a(nd.c, $$6).a(nd.b, nd.a.b))
                     .a(dqm.e, nc.a().a(nd.c, $$5))
                     .a(dqm.f, nc.a().a(nd.c, $$6))
                     .a(dqm.g, nc.a().a(nd.c, $$4))
                     .a(dqm.h, nc.a().a(nd.c, $$4).a(nd.b, nd.a.b))
                     .a(dqm.i, nc.a().a(nd.c, $$4).a(nd.b, nd.a.c))
                     .a(dqm.j, nc.a().a(nd.c, $$4).a(nd.b, nd.a.d))
               )
         );
   }

   private void o(dch $$0) {
      ajv $$1 = this.a($$0, "", nj.as, nk::e);
      ajv $$2 = this.a($$0, "", nj.au, nk::e);
      ajv $$3 = this.a($$0, "", nj.av, nk::e);
      ajv $$4 = this.a($$0, "_on", nj.as, nk::e);
      ajv $$5 = this.a($$0, "_on", nj.au, nk::e);
      ajv $$6 = this.a($$0, "_on", nj.av, nk::e);
      na $$7 = na.a(dpy.w, dpy.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return nc.a().a(nd.c, $$6x ? $$4 : $$1);
            case b:
               return nc.a().a(nd.c, $$6x ? $$4 : $$1).a(nd.b, nd.a.b);
            case c:
               return nc.a().a(nd.c, $$6x ? $$5 : $$2).a(nd.b, nd.a.b);
            case d:
               return nc.a().a(nd.c, $$6x ? $$6 : $$3).a(nd.b, nd.a.b);
            case e:
               return nc.a().a(nd.c, $$6x ? $$5 : $$2);
            case f:
               return nc.a().a(nd.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(mz.a($$0).a($$7));
   }

   private mt.a a(ajv $$0, dch $$1) {
      return new mt.a($$0, $$1);
   }

   private mt.a f(dch $$0, dch $$1) {
      return new mt.a(nh.a($$0), $$1);
   }

   private void a(dch $$0, crn $$1) {
      ajv $$2 = nj.aa.a($$0, nk.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dch $$0, ajv $$1) {
      ajv $$2 = nj.aa.a($$0, nk.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dch $$0, dch $$1) {
      this.a($$0);
      ajv $$2 = nm.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dch $$0) {
      this.a($$0.p());
      ajv $$1 = nm.k.create($$0, this.c);
      ajv $$2 = nm.l.create($$0, this.c);
      ajv $$3 = nm.m.create($$0, this.c);
      ajv $$4 = nm.n.create($$0, this.c);
      this.b
         .accept(
            my.a($$0)
               .a(mx.a().a(dpy.S, 1, 2, 3, 4).a(dpy.R, ij.c), nc.a().a(nd.c, $$1))
               .a(mx.a().a(dpy.S, 1, 2, 3, 4).a(dpy.R, ij.f), nc.a().a(nd.c, $$1).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.S, 1, 2, 3, 4).a(dpy.R, ij.d), nc.a().a(nd.c, $$1).a(nd.b, nd.a.c))
               .a(mx.a().a(dpy.S, 1, 2, 3, 4).a(dpy.R, ij.e), nc.a().a(nd.c, $$1).a(nd.b, nd.a.d))
               .a(mx.a().a(dpy.S, 2, 3, 4).a(dpy.R, ij.c), nc.a().a(nd.c, $$2))
               .a(mx.a().a(dpy.S, 2, 3, 4).a(dpy.R, ij.f), nc.a().a(nd.c, $$2).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.S, 2, 3, 4).a(dpy.R, ij.d), nc.a().a(nd.c, $$2).a(nd.b, nd.a.c))
               .a(mx.a().a(dpy.S, 2, 3, 4).a(dpy.R, ij.e), nc.a().a(nd.c, $$2).a(nd.b, nd.a.d))
               .a(mx.a().a(dpy.S, 3, 4).a(dpy.R, ij.c), nc.a().a(nd.c, $$3))
               .a(mx.a().a(dpy.S, 3, 4).a(dpy.R, ij.f), nc.a().a(nd.c, $$3).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.S, 3, 4).a(dpy.R, ij.d), nc.a().a(nd.c, $$3).a(nd.b, nd.a.c))
               .a(mx.a().a(dpy.S, 3, 4).a(dpy.R, ij.e), nc.a().a(nd.c, $$3).a(nd.b, nd.a.d))
               .a(mx.a().a(dpy.S, 4).a(dpy.R, ij.c), nc.a().a(nd.c, $$4))
               .a(mx.a().a(dpy.S, 4).a(dpy.R, ij.f), nc.a().a(nd.c, $$4).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.S, 4).a(dpy.R, ij.d), nc.a().a(nd.c, $$4).a(nd.b, nd.a.c))
               .a(mx.a().a(dpy.S, 4).a(dpy.R, ij.e), nc.a().a(nd.c, $$4).a(nd.b, nd.a.d))
         );
   }

   private void a(nm.a $$0, dch... $$1) {
      for (dch $$2 : $$1) {
         ajv $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(nm.a $$0, dch... $$1) {
      for (dch $$2 : $$1) {
         ajv $$3 = $$0.create($$2, this.c);
         this.b.accept(mz.a($$2, nc.a().a(nd.c, $$3)).a(c()));
      }
   }

   private void h(dch $$0, dch $$1) {
      this.a($$0);
      nk $$2 = nk.b($$0, $$1);
      ajv $$3 = nj.aI.a($$1, $$2, this.c);
      ajv $$4 = nj.aJ.a($$1, $$2, this.c);
      ajv $$5 = nj.aK.a($$1, $$2, this.c);
      ajv $$6 = nj.aG.a($$1, $$2, this.c);
      ajv $$7 = nj.aH.a($$1, $$2, this.c);
      crn $$8 = $$1.p();
      nj.bx.a(nh.a($$8), nk.F($$0), this.c);
      this.b
         .accept(
            my.a($$1)
               .a(nc.a().a(nd.c, $$3))
               .a(mx.a().a(dpy.L, true), nc.a().a(nd.c, $$4))
               .a(mx.a().a(dpy.M, true), nc.a().a(nd.c, $$4).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.N, true), nc.a().a(nd.c, $$5))
               .a(mx.a().a(dpy.O, true), nc.a().a(nd.c, $$5).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.L, false), nc.a().a(nd.c, $$6))
               .a(mx.a().a(dpy.M, false), nc.a().a(nd.c, $$7))
               .a(mx.a().a(dpy.N, false), nc.a().a(nd.c, $$7).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.O, false), nc.a().a(nd.c, $$6).a(nd.b, nd.a.d))
         );
   }

   private void q(dch $$0) {
      nk $$1 = nk.z($$0);
      ajv $$2 = nj.aL.a($$0, $$1, this.c);
      ajv $$3 = this.a($$0, "_conditional", nj.aL, $$1x -> $$1.c(nl.i, $$1x));
      this.b.accept(mz.a($$0).a(a(dpy.c, $$3, $$2)).a(e()));
   }

   private void r(dch $$0) {
      ajv $$1 = nm.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<nc> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> nc.a().a(nd.c, nh.a(dcj.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dcj.mZ);
      this.b
         .accept(
            my.a(dcj.mZ)
               .a(mx.a().a(dpy.aq, 0), this.a(0))
               .a(mx.a().a(dpy.aq, 1), this.a(1))
               .a(mx.a().a(dpy.bk, dpu.b), nc.a().a(nd.c, nh.a(dcj.mZ, "_small_leaves")))
               .a(mx.a().a(dpy.bk, dpu.c), nc.a().a(nd.c, nh.a(dcj.mZ, "_large_leaves")))
         );
   }

   private na n() {
      return na.a(dpy.P)
         .a(ij.a, nc.a().a(nd.a, nd.a.c))
         .a(ij.b, nc.a())
         .a(ij.c, nc.a().a(nd.a, nd.a.b))
         .a(ij.d, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.c))
         .a(ij.e, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.d))
         .a(ij.f, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.b));
   }

   private void o() {
      ajv $$0 = nk.a(dcj.nU, "_top_open");
      this.b
         .accept(
            mz.a(dcj.nU)
               .a(this.n())
               .a(
                  na.a(dpy.u)
                     .a(false, nc.a().a(nd.c, nm.f.create(dcj.nU, this.c)))
                     .a(true, nc.a().a(nd.c, nm.f.get(dcj.nU).a($$1 -> $$1.a(nl.f, $$0)).a(dcj.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> na a(dql<T> $$0, T $$1, ajv $$2, ajv $$3) {
      nc $$4 = nc.a().a(nd.c, $$2);
      nc $$5 = nc.a().a(nd.c, $$3);
      return na.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dch $$0, Function<dch, nk> $$1) {
      nk $$2 = $$1.apply($$0).b(nl.i, nl.c);
      nk $$3 = $$2.c(nl.g, nk.a($$0, "_front_honey"));
      ajv $$4 = nj.q.a($$0, $$2, this.c);
      ajv $$5 = nj.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(mz.a($$0).a(b()).a(a(dpy.aN, 5, $$5, $$4)));
   }

   private void a(dch $$0, dql<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ajv> $$3 = new Int2ObjectOpenHashMap();
         na $$4 = na.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ajv $$5 = (ajv)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, nj.aV, nk::g));
            return nc.a().a(nd.c, $$5);
         });
         this.a($$0.p());
         this.b.accept(mz.a($$0).a($$4));
      }
   }

   private void p() {
      ajv $$0 = nh.a(dcj.od, "_floor");
      ajv $$1 = nh.a(dcj.od, "_ceiling");
      ajv $$2 = nh.a(dcj.od, "_wall");
      ajv $$3 = nh.a(dcj.od, "_between_walls");
      this.a(crv.wk);
      this.b
         .accept(
            mz.a(dcj.od)
               .a(
                  na.a(dpy.R, dpy.V)
                     .a(ij.c, dpw.a, nc.a().a(nd.c, $$0))
                     .a(ij.d, dpw.a, nc.a().a(nd.c, $$0).a(nd.b, nd.a.c))
                     .a(ij.f, dpw.a, nc.a().a(nd.c, $$0).a(nd.b, nd.a.b))
                     .a(ij.e, dpw.a, nc.a().a(nd.c, $$0).a(nd.b, nd.a.d))
                     .a(ij.c, dpw.b, nc.a().a(nd.c, $$1))
                     .a(ij.d, dpw.b, nc.a().a(nd.c, $$1).a(nd.b, nd.a.c))
                     .a(ij.f, dpw.b, nc.a().a(nd.c, $$1).a(nd.b, nd.a.b))
                     .a(ij.e, dpw.b, nc.a().a(nd.c, $$1).a(nd.b, nd.a.d))
                     .a(ij.c, dpw.c, nc.a().a(nd.c, $$2).a(nd.b, nd.a.d))
                     .a(ij.d, dpw.c, nc.a().a(nd.c, $$2).a(nd.b, nd.a.b))
                     .a(ij.f, dpw.c, nc.a().a(nd.c, $$2))
                     .a(ij.e, dpw.c, nc.a().a(nd.c, $$2).a(nd.b, nd.a.c))
                     .a(ij.d, dpw.d, nc.a().a(nd.c, $$3).a(nd.b, nd.a.b))
                     .a(ij.c, dpw.d, nc.a().a(nd.c, $$3).a(nd.b, nd.a.d))
                     .a(ij.f, dpw.d, nc.a().a(nd.c, $$3))
                     .a(ij.e, dpw.d, nc.a().a(nd.c, $$3).a(nd.b, nd.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mz.a(dcj.nZ, nc.a().a(nd.c, nh.a(dcj.nZ)))
               .a(
                  na.a(dpy.U, dpy.R)
                     .a(dpt.a, ij.c, nc.a())
                     .a(dpt.a, ij.f, nc.a().a(nd.b, nd.a.b))
                     .a(dpt.a, ij.d, nc.a().a(nd.b, nd.a.c))
                     .a(dpt.a, ij.e, nc.a().a(nd.b, nd.a.d))
                     .a(dpt.b, ij.c, nc.a().a(nd.a, nd.a.b))
                     .a(dpt.b, ij.f, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.b))
                     .a(dpt.b, ij.d, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.c))
                     .a(dpt.b, ij.e, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.d))
                     .a(dpt.c, ij.d, nc.a().a(nd.a, nd.a.c))
                     .a(dpt.c, ij.e, nc.a().a(nd.a, nd.a.c).a(nd.b, nd.a.b))
                     .a(dpt.c, ij.c, nc.a().a(nd.a, nd.a.c).a(nd.b, nd.a.c))
                     .a(dpt.c, ij.f, nc.a().a(nd.a, nd.a.c).a(nd.b, nd.a.d))
               )
         );
   }

   private void d(dch $$0, nm.a $$1) {
      ajv $$2 = $$1.create($$0, this.c);
      ajv $$3 = nk.a($$0, "_front_on");
      ajv $$4 = $$1.get($$0).a($$1x -> $$1x.a(nl.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mz.a($$0).a(a(dpy.r, $$4, $$2)).a(b()));
   }

   private void a(dch... $$0) {
      ajv $$1 = nh.a("campfire_off");

      for (dch $$2 : $$0) {
         ajv $$3 = nj.bc.a($$2, nk.E($$2), this.c);
         this.a($$2.p());
         this.b.accept(mz.a($$2).a(a(dpy.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dch $$0) {
      ajv $$1 = nj.bt.a($$0, nk.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dch $$0) {
      ajv $$1;
      if ($$0 == dcj.tj) {
         $$1 = nj.bv.a($$0, nk.m($$0), this.c);
      } else {
         $$1 = nj.bu.a($$0, nk.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      nk $$0 = nk.a(nk.G(dcj.cl), nk.G(dcj.n));
      ajv $$1 = nj.j.a(dcj.cl, $$0, this.c);
      this.b.accept(c(dcj.cl, $$1));
   }

   private void s() {
      this.a(crv.lG);
      this.b
         .accept(
            my.a(dcj.cw)
               .a(
                  mx.b(
                     mx.a().a(dpy.ab, dqn.c).a(dpy.aa, dqn.c).a(dpy.ac, dqn.c).a(dpy.ad, dqn.c),
                     mx.a().a(dpy.ab, dqn.b, dqn.a).a(dpy.aa, dqn.b, dqn.a),
                     mx.a().a(dpy.aa, dqn.b, dqn.a).a(dpy.ac, dqn.b, dqn.a),
                     mx.a().a(dpy.ac, dqn.b, dqn.a).a(dpy.ad, dqn.b, dqn.a),
                     mx.a().a(dpy.ad, dqn.b, dqn.a).a(dpy.ab, dqn.b, dqn.a)
                  ),
                  nc.a().a(nd.c, nh.a("redstone_dust_dot"))
               )
               .a(mx.a().a(dpy.ab, dqn.b, dqn.a), nc.a().a(nd.c, nh.a("redstone_dust_side0")))
               .a(mx.a().a(dpy.ac, dqn.b, dqn.a), nc.a().a(nd.c, nh.a("redstone_dust_side_alt0")))
               .a(mx.a().a(dpy.aa, dqn.b, dqn.a), nc.a().a(nd.c, nh.a("redstone_dust_side_alt1")).a(nd.b, nd.a.d))
               .a(mx.a().a(dpy.ad, dqn.b, dqn.a), nc.a().a(nd.c, nh.a("redstone_dust_side1")).a(nd.b, nd.a.d))
               .a(mx.a().a(dpy.ab, dqn.a), nc.a().a(nd.c, nh.a("redstone_dust_up")))
               .a(mx.a().a(dpy.aa, dqn.a), nc.a().a(nd.c, nh.a("redstone_dust_up")).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.ac, dqn.a), nc.a().a(nd.c, nh.a("redstone_dust_up")).a(nd.b, nd.a.c))
               .a(mx.a().a(dpy.ad, dqn.a), nc.a().a(nd.c, nh.a("redstone_dust_up")).a(nd.b, nd.a.d))
         );
   }

   private void t() {
      this.a(crv.lK);
      this.b
         .accept(
            mz.a(dcj.gY)
               .a(c())
               .a(
                  na.a(dpy.bd, dpy.w)
                     .a(dqb.a, false, nc.a().a(nd.c, nh.a(dcj.gY)))
                     .a(dqb.a, true, nc.a().a(nd.c, nh.a(dcj.gY, "_on")))
                     .a(dqb.b, false, nc.a().a(nd.c, nh.a(dcj.gY, "_subtract")))
                     .a(dqb.b, true, nc.a().a(nd.c, nh.a(dcj.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      nk $$0 = nk.a(dcj.jR);
      nk $$1 = nk.a(nk.a(dcj.jE, "_side"), $$0.a(nl.f));
      ajv $$2 = nj.ab.a(dcj.jE, $$1, this.c);
      ajv $$3 = nj.ac.a(dcj.jE, $$1, this.c);
      ajv $$4 = nj.j.b(dcj.jE, "_double", $$1, this.c);
      this.b.accept(e(dcj.jE, $$2, $$3, $$4));
      this.b.accept(c(dcj.jR, nj.c.a(dcj.jR, $$0, this.c)));
   }

   private void v() {
      this.a(crv.sp);
      this.b
         .accept(
            my.a(dcj.fs)
               .a(nc.a().a(nd.c, nk.G(dcj.fs)))
               .a(mx.a().a(dpy.k, true), nc.a().a(nd.c, nk.a(dcj.fs, "_bottle0")))
               .a(mx.a().a(dpy.l, true), nc.a().a(nd.c, nk.a(dcj.fs, "_bottle1")))
               .a(mx.a().a(dpy.m, true), nc.a().a(nd.c, nk.a(dcj.fs, "_bottle2")))
               .a(mx.a().a(dpy.k, false), nc.a().a(nd.c, nk.a(dcj.fs, "_empty0")))
               .a(mx.a().a(dpy.l, false), nc.a().a(nd.c, nk.a(dcj.fs, "_empty1")))
               .a(mx.a().a(dpy.m, false), nc.a().a(nd.c, nk.a(dcj.fs, "_empty2")))
         );
   }

   private void u(dch $$0) {
      ajv $$1 = nj.bp.a($$0, nk.b($$0), this.c);
      ajv $$2 = nh.a("mushroom_block_inside");
      this.b
         .accept(
            my.a($$0)
               .a(mx.a().a(dpy.L, true), nc.a().a(nd.c, $$1))
               .a(mx.a().a(dpy.M, true), nc.a().a(nd.c, $$1).a(nd.b, nd.a.b).a(nd.d, true))
               .a(mx.a().a(dpy.N, true), nc.a().a(nd.c, $$1).a(nd.b, nd.a.c).a(nd.d, true))
               .a(mx.a().a(dpy.O, true), nc.a().a(nd.c, $$1).a(nd.b, nd.a.d).a(nd.d, true))
               .a(mx.a().a(dpy.J, true), nc.a().a(nd.c, $$1).a(nd.a, nd.a.d).a(nd.d, true))
               .a(mx.a().a(dpy.K, true), nc.a().a(nd.c, $$1).a(nd.a, nd.a.b).a(nd.d, true))
               .a(mx.a().a(dpy.L, false), nc.a().a(nd.c, $$2))
               .a(mx.a().a(dpy.M, false), nc.a().a(nd.c, $$2).a(nd.b, nd.a.b).a(nd.d, false))
               .a(mx.a().a(dpy.N, false), nc.a().a(nd.c, $$2).a(nd.b, nd.a.c).a(nd.d, false))
               .a(mx.a().a(dpy.O, false), nc.a().a(nd.c, $$2).a(nd.b, nd.a.d).a(nd.d, false))
               .a(mx.a().a(dpy.J, false), nc.a().a(nd.c, $$2).a(nd.a, nd.a.d).a(nd.d, false))
               .a(mx.a().a(dpy.K, false), nc.a().a(nd.c, $$2).a(nd.a, nd.a.b).a(nd.d, false))
         );
      this.a($$0, nm.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(crv.rA);
      this.b
         .accept(
            mz.a(dcj.eg)
               .a(
                  na.a(dpy.ay)
                     .a(0, nc.a().a(nd.c, nh.a(dcj.eg)))
                     .a(1, nc.a().a(nd.c, nh.a(dcj.eg, "_slice1")))
                     .a(2, nc.a().a(nd.c, nh.a(dcj.eg, "_slice2")))
                     .a(3, nc.a().a(nd.c, nh.a(dcj.eg, "_slice3")))
                     .a(4, nc.a().a(nd.c, nh.a(dcj.eg, "_slice4")))
                     .a(5, nc.a().a(nd.c, nh.a(dcj.eg, "_slice5")))
                     .a(6, nc.a().a(nd.c, nh.a(dcj.eg, "_slice6")))
               )
         );
   }

   private void x() {
      nk $$0 = new nk()
         .a(nl.c, nk.a(dcj.nX, "_side3"))
         .a(nl.o, nk.G(dcj.t))
         .a(nl.n, nk.a(dcj.nX, "_top"))
         .a(nl.j, nk.a(dcj.nX, "_side3"))
         .a(nl.l, nk.a(dcj.nX, "_side3"))
         .a(nl.k, nk.a(dcj.nX, "_side1"))
         .a(nl.m, nk.a(dcj.nX, "_side2"));
      this.b.accept(c(dcj.nX, nj.a.a(dcj.nX, $$0, this.c)));
   }

   private void y() {
      nk $$0 = new nk()
         .a(nl.c, nk.a(dcj.ob, "_front"))
         .a(nl.o, nk.a(dcj.ob, "_bottom"))
         .a(nl.n, nk.a(dcj.ob, "_top"))
         .a(nl.j, nk.a(dcj.ob, "_front"))
         .a(nl.k, nk.a(dcj.ob, "_front"))
         .a(nl.l, nk.a(dcj.ob, "_side"))
         .a(nl.m, nk.a(dcj.ob, "_side"));
      this.b.accept(c(dcj.ob, nj.a.a(dcj.ob, $$0, this.c)));
   }

   private void a(dch $$0, dch $$1, BiFunction<dch, dch, nk> $$2) {
      nk $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, nj.a.a($$0, $$3, this.c)));
   }

   public void b(dch $$0) {
      nk $$1 = new nk()
         .a(nl.c, nk.a($$0, "_particle"))
         .a(nl.o, nk.a($$0, "_down"))
         .a(nl.n, nk.a($$0, "_up"))
         .a(nl.j, nk.a($$0, "_north"))
         .a(nl.k, nk.a($$0, "_south"))
         .a(nl.l, nk.a($$0, "_east"))
         .a(nl.m, nk.a($$0, "_west"));
      this.b.accept(c($$0, nj.a.a($$0, $$1, this.c)));
   }

   private void z() {
      nk $$0 = nk.k(dcj.eZ);
      this.b.accept(c(dcj.eZ, nh.a(dcj.eZ)));
      this.a(dcj.ee, $$0);
      this.a(dcj.ef, $$0);
   }

   private void a(dch $$0, nk $$1) {
      ajv $$2 = nj.p.a($$0, $$1.c(nl.g, nk.G($$0)), this.c);
      this.b.accept(mz.a($$0, nc.a().a(nd.c, $$2)).a(b()));
   }

   private void A() {
      this.a(crv.sq);
      this.m(dcj.ft);
      this.b.accept(c(dcj.fv, nj.bs.a(dcj.fv, nk.j(nk.a(dcj.H, "_still")), this.c)));
      this.b
         .accept(
            mz.a(dcj.fu)
               .a(
                  na.a(dgp.g)
                     .a(1, nc.a().a(nd.c, nj.bq.a(dcj.fu, "_level1", nk.j(nk.a(dcj.G, "_still")), this.c)))
                     .a(2, nc.a().a(nd.c, nj.br.a(dcj.fu, "_level2", nk.j(nk.a(dcj.G, "_still")), this.c)))
                     .a(3, nc.a().a(nd.c, nj.bs.a(dcj.fu, "_full", nk.j(nk.a(dcj.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mz.a(dcj.fw)
               .a(
                  na.a(dgp.g)
                     .a(1, nc.a().a(nd.c, nj.bq.a(dcj.fw, "_level1", nk.j(nk.G(dcj.qP)), this.c)))
                     .a(2, nc.a().a(nd.c, nj.br.a(dcj.fw, "_level2", nk.j(nk.G(dcj.qP)), this.c)))
                     .a(3, nc.a().a(nd.c, nj.bs.a(dcj.fw, "_full", nk.j(nk.G(dcj.qP)), this.c)))
               )
         );
   }

   private void B() {
      nk $$0 = nk.b(dcj.kv);
      ajv $$1 = nj.aE.a(dcj.kv, $$0, this.c);
      ajv $$2 = this.a(dcj.kv, "_dead", nj.aE, $$1x -> $$0.c(nl.b, $$1x));
      this.b.accept(mz.a(dcj.kv).a(a(dpy.au, 5, $$2, $$1)));
   }

   private void C() {
      ajv $$0 = nh.a(dcj.tq);
      ajv $$1 = nh.a(dcj.tq, "_triggered");
      ajv $$2 = nh.a(dcj.tq, "_crafting");
      ajv $$3 = nh.a(dcj.tq, "_crafting_triggered");
      this.b
         .accept(
            mz.a(dcj.tq)
               .a(na.a(dpy.T).a($$0x -> this.a($$0x, nc.a())))
               .a(
                  na.a(dpy.A, dea.b)
                     .a(false, false, nc.a().a(nd.c, $$0))
                     .a(true, true, nc.a().a(nd.c, $$3))
                     .a(true, false, nc.a().a(nd.c, $$1))
                     .a(false, true, nc.a().a(nd.c, $$2))
               )
         );
   }

   private void v(dch $$0) {
      nk $$1 = new nk().a(nl.f, nk.a(dcj.cD, "_top")).a(nl.i, nk.a(dcj.cD, "_side")).a(nl.g, nk.a($$0, "_front"));
      nk $$2 = new nk().a(nl.i, nk.a(dcj.cD, "_top")).a(nl.g, nk.a($$0, "_front_vertical"));
      ajv $$3 = nj.p.a($$0, $$1, this.c);
      ajv $$4 = nj.r.a($$0, $$2, this.c);
      this.b
         .accept(
            mz.a($$0)
               .a(
                  na.a(dpy.P)
                     .a(ij.a, nc.a().a(nd.c, $$4).a(nd.a, nd.a.c))
                     .a(ij.b, nc.a().a(nd.c, $$4))
                     .a(ij.c, nc.a().a(nd.c, $$3))
                     .a(ij.f, nc.a().a(nd.c, $$3).a(nd.b, nd.a.b))
                     .a(ij.d, nc.a().a(nd.c, $$3).a(nd.b, nd.a.c))
                     .a(ij.e, nc.a().a(nd.c, $$3).a(nd.b, nd.a.d))
               )
         );
   }

   private void D() {
      ajv $$0 = nh.a(dcj.fy);
      ajv $$1 = nh.a(dcj.fy, "_filled");
      this.b.accept(mz.a(dcj.fy).a(na.a(dpy.h).a(false, nc.a().a(nd.c, $$0)).a(true, nc.a().a(nd.c, $$1))).a(c()));
   }

   private void E() {
      ajv $$0 = nh.a(dcj.ku, "_side");
      ajv $$1 = nh.a(dcj.ku, "_noside");
      ajv $$2 = nh.a(dcj.ku, "_noside1");
      ajv $$3 = nh.a(dcj.ku, "_noside2");
      ajv $$4 = nh.a(dcj.ku, "_noside3");
      this.b
         .accept(
            my.a(dcj.ku)
               .a(mx.a().a(dpy.L, true), nc.a().a(nd.c, $$0))
               .a(mx.a().a(dpy.M, true), nc.a().a(nd.c, $$0).a(nd.b, nd.a.b).a(nd.d, true))
               .a(mx.a().a(dpy.N, true), nc.a().a(nd.c, $$0).a(nd.b, nd.a.c).a(nd.d, true))
               .a(mx.a().a(dpy.O, true), nc.a().a(nd.c, $$0).a(nd.b, nd.a.d).a(nd.d, true))
               .a(mx.a().a(dpy.J, true), nc.a().a(nd.c, $$0).a(nd.a, nd.a.d).a(nd.d, true))
               .a(mx.a().a(dpy.K, true), nc.a().a(nd.c, $$0).a(nd.a, nd.a.b).a(nd.d, true))
               .a(mx.a().a(dpy.L, false), nc.a().a(nd.c, $$1).a(nd.e, 2), nc.a().a(nd.c, $$2), nc.a().a(nd.c, $$3), nc.a().a(nd.c, $$4))
               .a(
                  mx.a().a(dpy.M, false),
                  nc.a().a(nd.c, $$2).a(nd.b, nd.a.b).a(nd.d, true),
                  nc.a().a(nd.c, $$3).a(nd.b, nd.a.b).a(nd.d, true),
                  nc.a().a(nd.c, $$4).a(nd.b, nd.a.b).a(nd.d, true),
                  nc.a().a(nd.c, $$1).a(nd.e, 2).a(nd.b, nd.a.b).a(nd.d, true)
               )
               .a(
                  mx.a().a(dpy.N, false),
                  nc.a().a(nd.c, $$3).a(nd.b, nd.a.c).a(nd.d, true),
                  nc.a().a(nd.c, $$4).a(nd.b, nd.a.c).a(nd.d, true),
                  nc.a().a(nd.c, $$1).a(nd.e, 2).a(nd.b, nd.a.c).a(nd.d, true),
                  nc.a().a(nd.c, $$2).a(nd.b, nd.a.c).a(nd.d, true)
               )
               .a(
                  mx.a().a(dpy.O, false),
                  nc.a().a(nd.c, $$4).a(nd.b, nd.a.d).a(nd.d, true),
                  nc.a().a(nd.c, $$1).a(nd.e, 2).a(nd.b, nd.a.d).a(nd.d, true),
                  nc.a().a(nd.c, $$2).a(nd.b, nd.a.d).a(nd.d, true),
                  nc.a().a(nd.c, $$3).a(nd.b, nd.a.d).a(nd.d, true)
               )
               .a(
                  mx.a().a(dpy.J, false),
                  nc.a().a(nd.c, $$1).a(nd.e, 2).a(nd.a, nd.a.d).a(nd.d, true),
                  nc.a().a(nd.c, $$4).a(nd.a, nd.a.d).a(nd.d, true),
                  nc.a().a(nd.c, $$2).a(nd.a, nd.a.d).a(nd.d, true),
                  nc.a().a(nd.c, $$3).a(nd.a, nd.a.d).a(nd.d, true)
               )
               .a(
                  mx.a().a(dpy.K, false),
                  nc.a().a(nd.c, $$4).a(nd.a, nd.a.b).a(nd.d, true),
                  nc.a().a(nd.c, $$3).a(nd.a, nd.a.b).a(nd.d, true),
                  nc.a().a(nd.c, $$2).a(nd.a, nd.a.b).a(nd.d, true),
                  nc.a().a(nd.c, $$1).a(nd.e, 2).a(nd.a, nd.a.b).a(nd.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            my.a(dcj.pc)
               .a(nc.a().a(nd.c, nk.G(dcj.pc)))
               .a(mx.a().a(dpy.aL, 1), nc.a().a(nd.c, nk.a(dcj.pc, "_contents1")))
               .a(mx.a().a(dpy.aL, 2), nc.a().a(nd.c, nk.a(dcj.pc, "_contents2")))
               .a(mx.a().a(dpy.aL, 3), nc.a().a(nd.c, nk.a(dcj.pc, "_contents3")))
               .a(mx.a().a(dpy.aL, 4), nc.a().a(nd.c, nk.a(dcj.pc, "_contents4")))
               .a(mx.a().a(dpy.aL, 5), nc.a().a(nd.c, nk.a(dcj.pc, "_contents5")))
               .a(mx.a().a(dpy.aL, 6), nc.a().a(nd.c, nk.a(dcj.pc, "_contents6")))
               .a(mx.a().a(dpy.aL, 7), nc.a().a(nd.c, nk.a(dcj.pc, "_contents7")))
               .a(mx.a().a(dpy.aL, 8), nc.a().a(nd.c, nk.a(dcj.pc, "_contents_ready")))
         );
   }

   private void w(dch $$0) {
      ajv $$1 = nj.c.a($$0, nk.a($$0), this.c);
      ajv $$2 = this.a($$0, "_powered", nj.c, nk::b);
      ajv $$3 = this.a($$0, "_lit", nj.c, nk::b);
      ajv $$4 = this.a($$0, "_lit_powered", nj.c, nk::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private mw a(dch $$0, ajv $$1, ajv $$2, ajv $$3, ajv $$4) {
      return mz.a($$0).a(na.a(dpy.r, dpy.w).a(($$4x, $$5) -> $$4x ? nc.a().a(nd.c, $$5 ? $$4 : $$2) : nc.a().a(nd.c, $$5 ? $$3 : $$1)));
   }

   private void i(dch $$0, dch $$1) {
      ajv $$2 = nh.a($$0);
      ajv $$3 = nh.a($$0, "_powered");
      ajv $$4 = nh.a($$0, "_lit");
      ajv $$5 = nh.a($$0, "_lit_powered");
      this.a($$1, nh.a($$0.p()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dch $$0) {
      this.c($$0);
      this.b.accept(mz.a($$0, nc.a().a(nd.c, nj.ao.a($$0, nk.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dcj.qy);
      this.x(dcj.qx);
      this.x(dcj.qw);
      this.x(dcj.qv);
   }

   private void H() {
      this.c(dcj.st);
      na.b<ij, dqf> $$0 = na.a(dpy.bm, dpy.bn);

      for (dqf $$1 : dqf.values()) {
         $$0.a(ij.b, $$1, this.a(ij.b, $$1));
      }

      for (dqf $$2 : dqf.values()) {
         $$0.a(ij.a, $$2, this.a(ij.a, $$2));
      }

      this.b.accept(mz.a(dcj.st).a($$0));
   }

   private nc a(ij $$0, dqf $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      nk $$3 = nk.c(nk.a(dcj.st, $$2));
      return nc.a().a(nd.c, nj.an.a(dcj.st, $$2, $$3, this.c));
   }

   private void y(dch $$0) {
      nk $$1 = new nk().a(nl.e, nk.G(dcj.dV)).a(nl.f, nk.G($$0)).a(nl.i, nk.a($$0, "_side"));
      this.b.accept(c($$0, nj.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ajv $$0 = nk.a(dcj.gZ, "_side");
      nk $$1 = new nk().a(nl.f, nk.a(dcj.gZ, "_top")).a(nl.i, $$0);
      nk $$2 = new nk().a(nl.f, nk.a(dcj.gZ, "_inverted_top")).a(nl.i, $$0);
      this.b
         .accept(
            mz.a(dcj.gZ)
               .a(na.a(dpy.p).a(false, nc.a().a(nd.c, nj.aF.a(dcj.gZ, $$1, this.c))).a(true, nc.a().a(nd.c, nj.aF.a(nh.a(dcj.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dch $$0) {
      this.b.accept(mz.a($$0, nc.a().a(nd.c, nh.a($$0))).a(this.n()));
   }

   private void J() {
      dch $$0 = dcj.ss;
      ajv $$1 = nh.a($$0, "_on");
      ajv $$2 = nh.a($$0);
      this.b.accept(mz.a($$0, nc.a().a(nd.c, nh.a($$0))).a(this.n()).a(a(dpy.w, $$1, $$2)));
   }

   private void K() {
      nk $$0 = new nk().a(nl.B, nk.G(dcj.j)).a(nl.f, nk.G(dcj.cC));
      nk $$1 = new nk().a(nl.B, nk.G(dcj.j)).a(nl.f, nk.a(dcj.cC, "_moist"));
      ajv $$2 = nj.aW.a(dcj.cC, $$0, this.c);
      ajv $$3 = nj.aW.a(nk.a(dcj.cC, "_moist"), $$1, this.c);
      this.b.accept(mz.a(dcj.cC).a(a(dpy.aQ, 7, $$3, $$2)));
   }

   private List<ajv> A(dch $$0) {
      ajv $$1 = nj.aX.a(nh.a($$0, "_floor0"), nk.v($$0), this.c);
      ajv $$2 = nj.aX.a(nh.a($$0, "_floor1"), nk.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ajv> B(dch $$0) {
      ajv $$1 = nj.aY.a(nh.a($$0, "_side0"), nk.v($$0), this.c);
      ajv $$2 = nj.aY.a(nh.a($$0, "_side1"), nk.w($$0), this.c);
      ajv $$3 = nj.aZ.a(nh.a($$0, "_side_alt0"), nk.v($$0), this.c);
      ajv $$4 = nj.aZ.a(nh.a($$0, "_side_alt1"), nk.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ajv> C(dch $$0) {
      ajv $$1 = nj.ba.a(nh.a($$0, "_up0"), nk.v($$0), this.c);
      ajv $$2 = nj.ba.a(nh.a($$0, "_up1"), nk.w($$0), this.c);
      ajv $$3 = nj.bb.a(nh.a($$0, "_up_alt0"), nk.v($$0), this.c);
      ajv $$4 = nj.bb.a(nh.a($$0, "_up_alt1"), nk.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<nc> a(List<ajv> $$0, UnaryOperator<nc> $$1) {
      return $$0.stream().map($$0x -> nc.a().a(nd.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      mx $$0 = mx.a().a(dpy.L, false).a(dpy.M, false).a(dpy.N, false).a(dpy.O, false).a(dpy.J, false);
      List<ajv> $$1 = this.A(dcj.cr);
      List<ajv> $$2 = this.B(dcj.cr);
      List<ajv> $$3 = this.C(dcj.cr);
      this.b
         .accept(
            my.a(dcj.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(mx.b(mx.a().a(dpy.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(mx.b(mx.a().a(dpy.M, true), $$0), a($$2, $$0x -> $$0x.a(nd.b, nd.a.b)))
               .a(mx.b(mx.a().a(dpy.N, true), $$0), a($$2, $$0x -> $$0x.a(nd.b, nd.a.c)))
               .a(mx.b(mx.a().a(dpy.O, true), $$0), a($$2, $$0x -> $$0x.a(nd.b, nd.a.d)))
               .a(mx.a().a(dpy.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ajv> $$0 = this.A(dcj.cs);
      List<ajv> $$1 = this.B(dcj.cs);
      this.b
         .accept(
            my.a(dcj.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nd.b, nd.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nd.b, nd.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nd.b, nd.a.d)))
         );
   }

   private void D(dch $$0) {
      ajv $$1 = nm.t.create($$0, this.c);
      ajv $$2 = nm.u.create($$0, this.c);
      this.a($$0.p());
      this.b.accept(mz.a($$0).a(a(dpy.j, $$2, $$1)));
   }

   private void N() {
      nk $$0 = nk.a(nk.a(dcj.ad, "_side"), nk.a(dcj.ad, "_top"));
      ajv $$1 = nj.j.a(dcj.ad, $$0, this.c);
      this.b.accept(d(dcj.ad, $$1));
   }

   private void O() {
      this.a(crv.ad);
      dch $$0 = dcj.E;
      na.b<Boolean, Integer> $$1 = na.a(dhb.d, dhb.b);
      ajv $$2 = nh.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ajv $$4 = nh.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, nc.a().a(nd.c, $$4));
         $$1.a(false, $$3, nc.a().a(nd.c, $$2));
      }

      this.b.accept(mz.a(dcj.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mz.a(dcj.kI)
               .a(
                  na.a(dpy.as)
                     .a(0, nc.a().a(nd.c, this.a(dcj.kI, "_0", nj.c, nk::b)))
                     .a(1, nc.a().a(nd.c, this.a(dcj.kI, "_1", nj.c, nk::b)))
                     .a(2, nc.a().a(nd.c, this.a(dcj.kI, "_2", nj.c, nk::b)))
                     .a(3, nc.a().a(nd.c, this.a(dcj.kI, "_3", nj.c, nk::b)))
               )
         );
   }

   private void Q() {
      ajv $$0 = nk.G(dcj.j);
      nk $$1 = new nk().a(nl.e, $$0).b(nl.e, nl.c).a(nl.f, nk.a(dcj.i, "_top")).a(nl.i, nk.a(dcj.i, "_snow"));
      nc $$2 = nc.a().a(nd.c, nj.n.a(dcj.i, "_snow", $$1, this.c));
      this.a(dcj.i, nh.a(dcj.i), $$2);
      ajv $$3 = nm.f.get(dcj.fl).a($$1x -> $$1x.a(nl.e, $$0)).a(dcj.fl, this.c);
      this.a(dcj.fl, $$3, $$2);
      ajv $$4 = nm.f.get(dcj.l).a($$1x -> $$1x.a(nl.e, $$0)).a(dcj.l, this.c);
      this.a(dcj.l, $$4, $$2);
   }

   private void a(dch $$0, ajv $$1, nc $$2) {
      List<nc> $$3 = Arrays.asList(a($$1));
      this.b.accept(mz.a($$0).a(na.a(dpy.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(crv.rg);
      this.b
         .accept(
            mz.a(dcj.fC)
               .a(
                  na.a(dpy.ar)
                     .a(0, nc.a().a(nd.c, nh.a(dcj.fC, "_stage0")))
                     .a(1, nc.a().a(nd.c, nh.a(dcj.fC, "_stage1")))
                     .a(2, nc.a().a(nd.c, nh.a(dcj.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dcj.kE, nh.a(dcj.kE)));
   }

   private void j(dch $$0, dch $$1) {
      nk $$2 = nk.b($$1);
      ajv $$3 = nj.Y.a($$0, $$2, this.c);
      ajv $$4 = nj.Z.a($$0, $$2, this.c);
      this.b.accept(mz.a($$0).a(a(dpy.aT, 1, $$4, $$3)));
   }

   private void T() {
      ajv $$0 = nh.a(dcj.hc);
      ajv $$1 = nh.a(dcj.hc, "_side");
      this.a(crv.lQ);
      this.b
         .accept(
            mz.a(dcj.hc)
               .a(
                  na.a(dpy.Q)
                     .a(ij.a, nc.a().a(nd.c, $$0))
                     .a(ij.c, nc.a().a(nd.c, $$1))
                     .a(ij.f, nc.a().a(nd.c, $$1).a(nd.b, nd.a.b))
                     .a(ij.d, nc.a().a(nd.c, $$1).a(nd.b, nd.a.c))
                     .a(ij.e, nc.a().a(nd.c, $$1).a(nd.b, nd.a.d))
               )
         );
   }

   private void k(dch $$0, dch $$1) {
      ajv $$2 = nh.a($$0);
      this.b.accept(mz.a($$1, nc.a().a(nd.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ajv $$0 = nh.a(dcj.eW, "_post_ends");
      ajv $$1 = nh.a(dcj.eW, "_post");
      ajv $$2 = nh.a(dcj.eW, "_cap");
      ajv $$3 = nh.a(dcj.eW, "_cap_alt");
      ajv $$4 = nh.a(dcj.eW, "_side");
      ajv $$5 = nh.a(dcj.eW, "_side_alt");
      this.b
         .accept(
            my.a(dcj.eW)
               .a(nc.a().a(nd.c, $$0))
               .a(mx.a().a(dpy.L, false).a(dpy.M, false).a(dpy.N, false).a(dpy.O, false), nc.a().a(nd.c, $$1))
               .a(mx.a().a(dpy.L, true).a(dpy.M, false).a(dpy.N, false).a(dpy.O, false), nc.a().a(nd.c, $$2))
               .a(mx.a().a(dpy.L, false).a(dpy.M, true).a(dpy.N, false).a(dpy.O, false), nc.a().a(nd.c, $$2).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.L, false).a(dpy.M, false).a(dpy.N, true).a(dpy.O, false), nc.a().a(nd.c, $$3))
               .a(mx.a().a(dpy.L, false).a(dpy.M, false).a(dpy.N, false).a(dpy.O, true), nc.a().a(nd.c, $$3).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.L, true), nc.a().a(nd.c, $$4))
               .a(mx.a().a(dpy.M, true), nc.a().a(nd.c, $$4).a(nd.b, nd.a.b))
               .a(mx.a().a(dpy.N, true), nc.a().a(nd.c, $$5))
               .a(mx.a().a(dpy.O, true), nc.a().a(nd.c, $$5).a(nd.b, nd.a.b))
         );
      this.d(dcj.eW);
   }

   private void E(dch $$0) {
      this.b.accept(mz.a($$0, nc.a().a(nd.c, nh.a($$0))).a(b()));
   }

   private void V() {
      ajv $$0 = nh.a(dcj.dw);
      ajv $$1 = nh.a(dcj.dw, "_on");
      this.d(dcj.dw);
      this.b
         .accept(
            mz.a(dcj.dw)
               .a(a(dpy.w, $$0, $$1))
               .a(
                  na.a(dpy.U, dpy.R)
                     .a(dpt.c, ij.c, nc.a().a(nd.a, nd.a.c).a(nd.b, nd.a.c))
                     .a(dpt.c, ij.f, nc.a().a(nd.a, nd.a.c).a(nd.b, nd.a.d))
                     .a(dpt.c, ij.d, nc.a().a(nd.a, nd.a.c))
                     .a(dpt.c, ij.e, nc.a().a(nd.a, nd.a.c).a(nd.b, nd.a.b))
                     .a(dpt.a, ij.c, nc.a())
                     .a(dpt.a, ij.f, nc.a().a(nd.b, nd.a.b))
                     .a(dpt.a, ij.d, nc.a().a(nd.b, nd.a.c))
                     .a(dpt.a, ij.e, nc.a().a(nd.b, nd.a.d))
                     .a(dpt.b, ij.c, nc.a().a(nd.a, nd.a.b))
                     .a(dpt.b, ij.f, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.b))
                     .a(dpt.b, ij.d, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.c))
                     .a(dpt.b, ij.e, nc.a().a(nd.a, nd.a.b).a(nd.b, nd.a.d))
               )
         );
   }

   private void W() {
      this.d(dcj.fm);
      this.b.accept(b(dcj.fm, nh.a(dcj.fm)));
   }

   private void X() {
      this.d(dcj.tn);
      this.b.accept(c(dcj.tn, nh.a(dcj.tn)));
   }

   private void Y() {
      this.b.accept(mz.a(dcj.ed).a(na.a(dpy.H).a(ij.a.a, nc.a().a(nd.c, nh.a(dcj.ed, "_ns"))).a(ij.a.c, nc.a().a(nd.c, nh.a(dcj.ed, "_ew")))));
   }

   private void Z() {
      ajv $$0 = nm.a.create(dcj.dV, this.c);
      this.b
         .accept(
            mz.a(
               dcj.dV,
               nc.a().a(nd.c, $$0),
               nc.a().a(nd.c, $$0).a(nd.a, nd.a.b),
               nc.a().a(nd.c, $$0).a(nd.a, nd.a.c),
               nc.a().a(nd.c, $$0).a(nd.a, nd.a.d),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.b),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.b).a(nd.a, nd.a.b),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.b).a(nd.a, nd.a.c),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.b).a(nd.a, nd.a.d),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.c),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.c).a(nd.a, nd.a.b),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.c).a(nd.a, nd.a.c),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.c).a(nd.a, nd.a.d),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.d),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.d).a(nd.a, nd.a.b),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.d).a(nd.a, nd.a.c),
               nc.a().a(nd.c, $$0).a(nd.b, nd.a.d).a(nd.a, nd.a.d)
            )
         );
   }

   private void aa() {
      ajv $$0 = nh.a(dcj.kO);
      ajv $$1 = nh.a(dcj.kO, "_on");
      this.b.accept(mz.a(dcj.kO).a(a(dpy.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      nk $$0 = new nk().a(nl.e, nk.a(dcj.by, "_bottom")).a(nl.i, nk.a(dcj.by, "_side"));
      ajv $$1 = nk.a(dcj.by, "_top_sticky");
      ajv $$2 = nk.a(dcj.by, "_top");
      nk $$3 = $$0.c(nl.E, $$1);
      nk $$4 = $$0.c(nl.E, $$2);
      ajv $$5 = nh.a(dcj.by, "_base");
      this.a(dcj.by, $$5, $$4);
      this.a(dcj.br, $$5, $$3);
      ajv $$6 = nj.n.a(dcj.by, "_inventory", $$0.c(nl.f, $$2), this.c);
      ajv $$7 = nj.n.a(dcj.br, "_inventory", $$0.c(nl.f, $$1), this.c);
      this.a(dcj.by, $$6);
      this.a(dcj.br, $$7);
   }

   private void a(dch $$0, ajv $$1, nk $$2) {
      ajv $$3 = nj.bh.a($$0, $$2, this.c);
      this.b.accept(mz.a($$0).a(a(dpy.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      nk $$0 = new nk().a(nl.F, nk.a(dcj.by, "_top")).a(nl.i, nk.a(dcj.by, "_side"));
      nk $$1 = $$0.c(nl.E, nk.a(dcj.by, "_top_sticky"));
      nk $$2 = $$0.c(nl.E, nk.a(dcj.by, "_top"));
      this.b
         .accept(
            mz.a(dcj.bz)
               .a(
                  na.a(dpy.x, dpy.bg)
                     .a(false, dqk.a, nc.a().a(nd.c, nj.bi.a(dcj.by, "_head", $$2, this.c)))
                     .a(false, dqk.b, nc.a().a(nd.c, nj.bi.a(dcj.by, "_head_sticky", $$1, this.c)))
                     .a(true, dqk.a, nc.a().a(nd.c, nj.bj.a(dcj.by, "_head_short", $$2, this.c)))
                     .a(true, dqk.b, nc.a().a(nd.c, nj.bj.a(dcj.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dch $$0 = dcj.tr;
      nk $$1 = nk.a($$0, "_side_inactive", "_top_inactive");
      nk $$2 = nk.a($$0, "_side_active", "_top_active");
      nk $$3 = nk.a($$0, "_side_active", "_top_ejecting_reward");
      ajv $$4 = nj.o.a($$0, $$1, this.c);
      ajv $$5 = nj.o.a($$0, "_active", $$2, this.c);
      ajv $$6 = nj.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(mz.a($$0).a(na.a(dpy.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> nc.a().a(nd.c, $$4);
            case b, c, d -> nc.a().a(nd.c, $$5);
            case e -> nc.a().a(nd.c, $$6);
         };
      })));
   }

   private void ae() {
      dch $$0 = dcj.ts;
      nk $$1 = nk.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      nk $$2 = nk.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      nk $$3 = nk.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      nk $$4 = nk.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ajv $$5 = nj.bN.a($$0, $$1, this.c);
      ajv $$6 = nj.bN.a($$0, "_active", $$2, this.c);
      ajv $$7 = nj.bN.a($$0, "_unlocking", $$3, this.c);
      ajv $$8 = nj.bN.a($$0, "_ejecting_reward", $$4, this.c);
      this.a($$0, $$5);
      this.b.accept(mz.a($$0).a(b()).a(na.a(dlb.b).a($$4x -> {
         return switch ($$4x) {
            case a -> nc.a().a(nd.c, $$5);
            case b -> nc.a().a(nd.c, $$6);
            case c -> nc.a().a(nd.c, $$7);
            case d -> nc.a().a(nd.c, $$8);
         };
      })));
   }

   private void af() {
      ajv $$0 = nh.a(dcj.qQ, "_inactive");
      ajv $$1 = nh.a(dcj.qQ, "_active");
      this.a(dcj.qQ, $$0);
      this.b.accept(mz.a(dcj.qQ).a(na.a(dpy.bo).a($$2 -> nc.a().a(nd.c, $$2 != dqp.b && $$2 != dqp.c ? $$0 : $$1))));
   }

   private void ag() {
      ajv $$0 = nh.a(dcj.qR, "_inactive");
      ajv $$1 = nh.a(dcj.qR, "_active");
      this.a(dcj.qR, $$0);
      this.b.accept(mz.a(dcj.qR).a(na.a(dpy.bo).a($$2 -> nc.a().a(nd.c, $$2 != dqp.b && $$2 != dqp.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      ajv $$0 = nj.bM.a(dcj.qV, nk.a(false), this.c);
      ajv $$1 = nj.bM.a(dcj.qV, "_can_summon", nk.a(true), this.c);
      this.a(dcj.qV, $$0);
      this.b.accept(mz.a(dcj.qV).a(a(dpy.G, $$1, $$0)));
   }

   private void ai() {
      ajv $$0 = nh.a(dcj.nS, "_stable");
      ajv $$1 = nh.a(dcj.nS, "_unstable");
      this.a(dcj.nS, $$0);
      this.b.accept(mz.a(dcj.nS).a(a(dpy.b, $$1, $$0)));
   }

   private void aj() {
      ajv $$0 = this.a(dcj.sv, "", nj.ao, nk::c);
      ajv $$1 = this.a(dcj.sv, "_lit", nj.ao, nk::c);
      this.b.accept(mz.a(dcj.sv).a(a(dpy.D, $$1, $$0)));
      ajv $$2 = this.a(dcj.sw, "", nj.ao, nk::c);
      ajv $$3 = this.a(dcj.sw, "_lit", nj.ao, nk::c);
      this.b.accept(mz.a(dcj.sw).a(a(dpy.D, $$3, $$2)));
   }

   private void ak() {
      ajv $$0 = nm.a.create(dcj.fB, this.c);
      ajv $$1 = this.a(dcj.fB, "_on", nj.c, nk::b);
      this.b.accept(mz.a(dcj.fB).a(a(dpy.r, $$1, $$0)));
   }

   private void l(dch $$0, dch $$1) {
      nk $$2 = nk.y($$0);
      this.b.accept(c($$0, nj.bf.a($$0, $$2, this.c)));
      this.b.accept(mz.a($$1, nc.a().a(nd.c, nj.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      nk $$0 = nk.y(dcj.dK);
      nk $$1 = nk.i(nk.a(dcj.dK, "_off"));
      ajv $$2 = nj.bf.a(dcj.dK, $$0, this.c);
      ajv $$3 = nj.bf.a(dcj.dK, "_off", $$1, this.c);
      this.b.accept(mz.a(dcj.dK).a(a(dpy.r, $$2, $$3)));
      ajv $$4 = nj.bg.a(dcj.dL, $$0, this.c);
      ajv $$5 = nj.bg.a(dcj.dL, "_off", $$1, this.c);
      this.b.accept(mz.a(dcj.dL).a(a(dpy.r, $$4, $$5)).a(d()));
      this.d(dcj.dK);
      this.c(dcj.dL);
   }

   private void am() {
      this.a(crv.lJ);
      this.b.accept(mz.a(dcj.eh).a(na.a(dpy.aA, dpy.s, dpy.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return nc.a().a(nd.c, nk.a(dcj.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(crv.cS);
      this.b
         .accept(
            mz.a(dcj.mV)
               .a(
                  na.a(dpy.aS, dpy.C)
                     .a(1, false, Arrays.asList(a(nh.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(nh.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(nh.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(nh.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(nh.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(nh.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(nh.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(nh.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      nk $$0 = nk.a(dcj.dN);
      ajv $$1 = nj.c.a(dcj.dP, $$0, this.c);
      this.b.accept(mz.a(dcj.dN).a(na.a(dpy.aF).a($$1x -> nc.a().a(nd.c, $$1x < 8 ? nh.a(dcj.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dcj.dN, nh.a(dcj.dN, "_height2"));
      this.b.accept(c(dcj.dP, $$1));
   }

   private void ap() {
      this.b.accept(mz.a(dcj.oc, nc.a().a(nd.c, nh.a(dcj.oc))).a(b()));
   }

   private void aq() {
      ajv $$0 = nm.a.create(dcj.pa, this.c);
      this.a(dcj.pa, $$0);
      this.b.accept(mz.a(dcj.pa).a(na.a(dpy.bj).a($$0x -> nc.a().a(nd.c, this.a(dcj.pa, "_" + $$0x.c(), nj.c, nk::b)))));
   }

   private void ar() {
      this.a(crv.wn);
      this.b.accept(mz.a(dcj.oi).a(na.a(dpy.as).a($$0 -> nc.a().a(nd.c, this.a(dcj.oi, "_stage" + $$0, nj.ao, nk::c)))));
   }

   private void as() {
      this.a(crv.pr);
      this.b
         .accept(
            mz.a(dcj.fI)
               .a(
                  na.a(dpy.a, dpy.M, dpy.L, dpy.N, dpy.O)
                     .a(false, false, false, false, false, nc.a().a(nd.c, nh.a(dcj.fI, "_ns")))
                     .a(false, true, false, false, false, nc.a().a(nd.c, nh.a(dcj.fI, "_n")).a(nd.b, nd.a.b))
                     .a(false, false, true, false, false, nc.a().a(nd.c, nh.a(dcj.fI, "_n")))
                     .a(false, false, false, true, false, nc.a().a(nd.c, nh.a(dcj.fI, "_n")).a(nd.b, nd.a.c))
                     .a(false, false, false, false, true, nc.a().a(nd.c, nh.a(dcj.fI, "_n")).a(nd.b, nd.a.d))
                     .a(false, true, true, false, false, nc.a().a(nd.c, nh.a(dcj.fI, "_ne")))
                     .a(false, true, false, true, false, nc.a().a(nd.c, nh.a(dcj.fI, "_ne")).a(nd.b, nd.a.b))
                     .a(false, false, false, true, true, nc.a().a(nd.c, nh.a(dcj.fI, "_ne")).a(nd.b, nd.a.c))
                     .a(false, false, true, false, true, nc.a().a(nd.c, nh.a(dcj.fI, "_ne")).a(nd.b, nd.a.d))
                     .a(false, false, true, true, false, nc.a().a(nd.c, nh.a(dcj.fI, "_ns")))
                     .a(false, true, false, false, true, nc.a().a(nd.c, nh.a(dcj.fI, "_ns")).a(nd.b, nd.a.b))
                     .a(false, true, true, true, false, nc.a().a(nd.c, nh.a(dcj.fI, "_nse")))
                     .a(false, true, false, true, true, nc.a().a(nd.c, nh.a(dcj.fI, "_nse")).a(nd.b, nd.a.b))
                     .a(false, false, true, true, true, nc.a().a(nd.c, nh.a(dcj.fI, "_nse")).a(nd.b, nd.a.c))
                     .a(false, true, true, false, true, nc.a().a(nd.c, nh.a(dcj.fI, "_nse")).a(nd.b, nd.a.d))
                     .a(false, true, true, true, true, nc.a().a(nd.c, nh.a(dcj.fI, "_nsew")))
                     .a(true, false, false, false, false, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_ns")))
                     .a(true, false, true, false, false, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_n")))
                     .a(true, false, false, true, false, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_n")).a(nd.b, nd.a.c))
                     .a(true, true, false, false, false, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_n")).a(nd.b, nd.a.b))
                     .a(true, false, false, false, true, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_n")).a(nd.b, nd.a.d))
                     .a(true, true, true, false, false, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_ne")))
                     .a(true, true, false, true, false, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_ne")).a(nd.b, nd.a.b))
                     .a(true, false, false, true, true, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_ne")).a(nd.b, nd.a.c))
                     .a(true, false, true, false, true, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_ne")).a(nd.b, nd.a.d))
                     .a(true, false, true, true, false, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_ns")))
                     .a(true, true, false, false, true, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_ns")).a(nd.b, nd.a.b))
                     .a(true, true, true, true, false, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_nse")))
                     .a(true, true, false, true, true, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_nse")).a(nd.b, nd.a.b))
                     .a(true, false, true, true, true, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_nse")).a(nd.b, nd.a.c))
                     .a(true, true, true, false, true, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_nse")).a(nd.b, nd.a.d))
                     .a(true, true, true, true, true, nc.a().a(nd.c, nh.a(dcj.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dcj.fH);
      this.b.accept(mz.a(dcj.fH).a(na.a(dpy.a, dpy.w).a(($$0, $$1) -> nc.a().a(nd.c, nk.a(dcj.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ajv a(int $$0, String $$1, nk $$2) {
      switch ($$0) {
         case 1:
            return nj.bl.a(nh.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return nj.bm.a(nh.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return nj.bn.a(nh.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return nj.bo.a(nh.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ajv a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", nk.b(nk.G(dcj.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", nk.b(nk.a(dcj.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", nk.b(nk.a(dcj.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(crv.ko);
      this.b.accept(mz.a(dcj.mf).a(na.a(dpy.aD, dpy.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(crv.kp);
      Function<Integer, ajv> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         nk $$2 = nk.a($$1);
         return nj.bw.a(dcj.mg, $$1, $$2, this.c);
      };
      this.b.accept(mz.a(dcj.mg).a(na.a(djo.c).a($$1 -> nc.a().a(nd.c, $$0.apply($$1)))));
   }

   private void F(dch $$0) {
      this.d($$0);
      ajv $$1 = nh.a($$0);
      my $$2 = my.a($$0);
      mx.c $$3 = ac.a(mx.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dpz, Function<ajv, nc>> $$4 : a) {
         dpz $$5 = (dpz)$$4.getFirst();
         Function<ajv, nc> $$6 = (Function<ajv, nc>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(mx.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      ajv $$0 = nk.a(dcj.qU, "_bottom");
      nk $$1 = new nk().a(nl.e, $$0).a(nl.f, nk.a(dcj.qU, "_top")).a(nl.i, nk.a(dcj.qU, "_side"));
      nk $$2 = new nk().a(nl.e, $$0).a(nl.f, nk.a(dcj.qU, "_top_bloom")).a(nl.i, nk.a(dcj.qU, "_side_bloom"));
      ajv $$3 = nj.n.a(dcj.qU, "", $$1, this.c);
      ajv $$4 = nj.n.a(dcj.qU, "_bloom", $$2, this.c);
      this.b.accept(mz.a(dcj.qU).a(na.a(dpy.E).a($$2x -> nc.a().a(nd.c, $$2x ? $$4 : $$3))));
      this.a(crv.gi, $$3);
   }

   private void ax() {
      dch $$0 = dcj.cm;
      ajv $$1 = nh.a($$0);
      my $$2 = my.a($$0);
      List.of(Pair.of(ij.c, nd.a.a), Pair.of(ij.f, nd.a.b), Pair.of(ij.d, nd.a.c), Pair.of(ij.e, nd.a.d)).forEach($$2x -> {
         ij $$3 = (ij)$$2x.getFirst();
         nd.a $$4 = (nd.a)$$2x.getSecond();
         mx.c $$5 = mx.a().a(dpy.R, $$3);
         $$2.a($$5, nc.a().a(nd.c, $$1).a(nd.b, $$4).a(nd.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, nh.a($$0, "_inventory"));
      i.clear();
   }

   private void a(my $$0, mx.c $$1, nd.a $$2) {
      List.of(Pair.of(dpy.bp, nj.aM), Pair.of(dpy.bq, nj.aN), Pair.of(dpy.br, nj.aO), Pair.of(dpy.bs, nj.aP), Pair.of(dpy.bt, nj.aQ), Pair.of(dpy.bu, nj.aR))
         .forEach($$3 -> {
            dpz $$4 = (dpz)$$3.getFirst();
            ni $$5 = (ni)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(my $$0, mx.c $$1, nd.a $$2, dpz $$3, ni $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      nk $$7 = new nk().a(nl.b, nk.a(dcj.cm, $$6));
      mt.d $$8 = new mt.d($$4, $$6);
      ajv $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dcj.cm, $$6, $$7, this.c));
      $$0.a(mx.a($$1, mx.a().a($$3, $$5)), nc.a().a(nd.c, $$9).a(nd.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dcj.kJ, nj.c.a(dcj.kJ, nk.b(nh.a("magma")), this.c)));
   }

   private void G(dch $$0) {
      this.b($$0, nm.q);
      nj.bD.a(nh.a($$0.p()), nk.u($$0), this.c);
   }

   private void b(dch $$0, dch $$1, mt.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dch $$0, dch $$1) {
      nj.bE.a(nh.a($$0.p()), nk.u($$1), this.c);
   }

   private void az() {
      ajv $$0 = nh.a(dcj.b);
      ajv $$1 = nh.a(dcj.b, "_mirrored");
      this.b.accept(a(dcj.eN, $$0, $$1));
      this.a(dcj.eN, $$0);
   }

   private void aA() {
      ajv $$0 = nh.a(dcj.sJ);
      ajv $$1 = nh.a(dcj.sJ, "_mirrored");
      this.b.accept(a(dcj.td, $$0, $$1).a(f()));
      this.a(dcj.td, $$0);
   }

   private void n(dch $$0, dch $$1) {
      this.a($$0, mt.e.b);
      nk $$2 = nk.d(nk.a($$0, "_pot"));
      ajv $$3 = mt.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      ajv $$0 = nk.a(dcj.pl, "_bottom");
      ajv $$1 = nk.a(dcj.pl, "_top_off");
      ajv $$2 = nk.a(dcj.pl, "_top");
      ajv[] $$3 = new ajv[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         nk $$5 = new nk().a(nl.e, $$0).a(nl.f, $$4 == 0 ? $$1 : $$2).a(nl.i, nk.a(dcj.pl, "_side" + $$4));
         $$3[$$4] = nj.n.a(dcj.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mz.a(dcj.pl).a(na.a(dpy.aZ).a($$1x -> nc.a().a(nd.c, $$3[$$1x]))));
      this.a(crv.wL, $$3[0]);
   }

   private nc a(il $$0, nc $$1) {
      switch ($$0) {
         case b:
            return $$1.a(nd.a, nd.a.b);
         case c:
            return $$1.a(nd.a, nd.a.b).a(nd.b, nd.a.c);
         case d:
            return $$1.a(nd.a, nd.a.b).a(nd.b, nd.a.d);
         case a:
            return $$1.a(nd.a, nd.a.b).a(nd.b, nd.a.b);
         case f:
            return $$1.a(nd.a, nd.a.d).a(nd.b, nd.a.c);
         case g:
            return $$1.a(nd.a, nd.a.d);
         case h:
            return $$1.a(nd.a, nd.a.d).a(nd.b, nd.a.b);
         case e:
            return $$1.a(nd.a, nd.a.d).a(nd.b, nd.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(nd.b, nd.a.c);
         case i:
            return $$1.a(nd.b, nd.a.d);
         case j:
            return $$1.a(nd.b, nd.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      ajv $$0 = nk.a(dcj.pb, "_top");
      ajv $$1 = nk.a(dcj.pb, "_bottom");
      ajv $$2 = nk.a(dcj.pb, "_side");
      ajv $$3 = nk.a(dcj.pb, "_lock");
      nk $$4 = new nk().a(nl.o, $$2).a(nl.m, $$2).a(nl.l, $$2).a(nl.c, $$0).a(nl.j, $$0).a(nl.k, $$1).a(nl.n, $$3);
      ajv $$5 = nj.b.a(dcj.pb, $$4, this.c);
      this.b.accept(mz.a(dcj.pb, nc.a().a(nd.c, $$5)).a(na.a(dpy.T).a($$0x -> this.a($$0x, nc.a()))));
   }

   private void aD() {
      dch $$0 = dcj.n;
      ajv $$1 = nh.a($$0);
      nm $$2 = nm.a.get($$0);
      dch $$3 = dcj.jH;
      ajv $$4 = nj.ab.a($$3, $$2.b(), this.c);
      ajv $$5 = nj.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kw.a().filter(kx::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dcj.rf).a(kw.w).a(dcj.rf, dcj.rD).a(dcj.rj, dcj.rn).a(kw.y);
      this.h(dcj.re).a(kw.A).a(dcj.re, dcj.rC).a(dcj.ri, dcj.rm).a(kw.C);
      this.h(dcj.rd).a(kw.E).a(dcj.rd, dcj.rB).a(dcj.rh, dcj.rl).a(kw.G);
      this.h(dcj.rc).a(kw.I).a(dcj.rc, dcj.rA).a(dcj.rg, dcj.rk).a(kw.K);
      this.w(dcj.sk);
      this.w(dcj.sl);
      this.w(dcj.sm);
      this.w(dcj.sn);
      this.i(dcj.sk, dcj.so);
      this.i(dcj.sl, dcj.sp);
      this.i(dcj.sm, dcj.sq);
      this.i(dcj.sn, dcj.sr);
      this.m(dcj.a);
      this.c(dcj.nc, dcj.a);
      this.c(dcj.nb, dcj.a);
      this.m(dcj.fO);
      this.m(dcj.dQ);
      this.c(dcj.nd, dcj.G);
      this.m(dcj.fA);
      this.m(dcj.me);
      this.m(dcj.fr);
      this.m(dcj.fR);
      this.a(crv.uc);
      this.m(dcj.pg);
      this.m(dcj.G);
      this.m(dcj.H);
      this.m(dcj.hV);
      this.a(crv.fR);
      this.o(dcj.pM, dcj.qd);
      this.o(dcj.pN, dcj.qe);
      this.o(dcj.pO, dcj.qf);
      this.o(dcj.pP, dcj.qg);
      this.o(dcj.pQ, dcj.qh);
      this.o(dcj.pR, dcj.qi);
      this.o(dcj.pS, dcj.qj);
      this.o(dcj.pT, dcj.qk);
      this.o(dcj.pU, dcj.ql);
      this.o(dcj.pV, dcj.qm);
      this.o(dcj.pW, dcj.qn);
      this.o(dcj.pX, dcj.qo);
      this.o(dcj.pY, dcj.qp);
      this.o(dcj.pZ, dcj.qq);
      this.o(dcj.qa, dcj.qr);
      this.o(dcj.qb, dcj.qs);
      this.o(dcj.pL, dcj.qc);
      this.m(dcj.na);
      this.m(dcj.gs);
      this.m(dcj.qP);
      this.m(dcj.sx);
      this.s(dcj.sy);
      this.s(dcj.sz);
      this.t(dcj.ti);
      this.t(dcj.tj);
      this.aj();
      this.g(dcj.sC, dcj.sA);
      this.p(dcj.sB);
      this.a(dcj.hW, crv.hA);
      this.a(crv.hA);
      this.aE();
      this.a(dcj.kN, crv.ja);
      this.a(crv.ja);
      this.f(dcj.bQ, nk.a(dcj.by, "_side"));
      this.a(dcj.R);
      this.a(dcj.S);
      this.a(dcj.iB);
      this.a(dcj.cx);
      this.a(dcj.cy);
      this.a(dcj.cz);
      this.a(dcj.fE);
      this.a(dcj.fF);
      this.a(dcj.fJ);
      this.a(dcj.N);
      this.a(dcj.T);
      this.a(dcj.O);
      this.a(dcj.ch);
      this.a(dcj.P);
      this.a(dcj.Q);
      this.a(dcj.ci);
      this.b(dcj.pj, nm.d);
      this.a(dcj.pi);
      this.a(dcj.aR);
      this.a(dcj.aS);
      this.a(dcj.aT);
      this.a(dcj.hb);
      this.a(dcj.dI);
      this.a(dcj.dJ);
      this.a(dcj.ha);
      this.a(dcj.pC);
      this.a(dcj.mW);
      this.a(dcj.dR);
      this.a(dcj.k);
      this.a(dcj.pk);
      this.a(dcj.fz);
      this.a(dcj.ec);
      this.a(dcj.L);
      this.a(dcj.ph);
      this.a(dcj.dO);
      this.b(dcj.dT, nm.g);
      this.b(dcj.pq, nm.d);
      this.b(dcj.fa, nm.d);
      this.m(dcj.ac);
      this.m(dcj.ga);
      this.a(dcj.kK);
      this.a(dcj.aY);
      this.a(dcj.iC);
      this.a(dcj.co);
      this.a(dcj.pK);
      this.a(dcj.ii);
      this.a(dcj.oy);
      this.a(dcj.dW);
      this.a(dcj.dX);
      this.b(dcj.ct, nm.b);
      this.a(dcj.aO);
      this.b(dcj.bw, nm.v);
      this.a(crv.cR);
      this.b(dcj.ck, nm.f);
      this.b(dcj.pd, nm.d);
      this.a(dcj.op);
      this.a(dcj.aP);
      this.a(dcj.qt);
      this.a(dcj.qu);
      this.a(dcj.qN);
      this.a(dcj.su);
      this.a(dcj.tf);
      this.a(dcj.tg);
      this.a(dcj.th);
      this.e(dcj.qS);
      this.aD();
      this.a(dcj.ra);
      this.a(dcj.rb);
      this.a(dcj.qW);
      this.a(dcj.qX);
      this.a(dcj.qY);
      this.a(dcj.qZ);
      this.k(dcj.qW, dcj.rw);
      this.k(dcj.qX, dcj.ry);
      this.k(dcj.qY, dcj.rx);
      this.k(dcj.qZ, dcj.rz);
      this.i(dcj.rM);
      this.i(dcj.rN);
      this.i(dcj.rP);
      this.i(dcj.rO);
      this.a(dcj.rM, dcj.rQ);
      this.a(dcj.rN, dcj.rR);
      this.a(dcj.rP, dcj.rT);
      this.a(dcj.rO, dcj.rS);
      this.k(dcj.rU);
      this.k(dcj.rV);
      this.k(dcj.rX);
      this.k(dcj.rW);
      this.b(dcj.rU, dcj.rY);
      this.b(dcj.rV, dcj.rZ);
      this.b(dcj.rX, dcj.sb);
      this.b(dcj.rW, dcj.sa);
      this.a(dcj.sc);
      this.a(dcj.sd);
      this.a(dcj.se);
      this.a(dcj.sf);
      this.k(dcj.sc, dcj.sg);
      this.k(dcj.sd, dcj.sh);
      this.k(dcj.se, dcj.si);
      this.k(dcj.sf, dcj.sj);
      this.j(dcj.gW, dcj.ch);
      this.j(dcj.gX, dcj.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dcj.og, dcj.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dcj.kt);
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
      this.F(dcj.ff);
      this.F(dcj.fg);
      this.F(dcj.qT);
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
      this.E(dcj.cO);
      this.d(dcj.cO);
      this.E(dcj.oa);
      this.g();
      this.E(dcj.sE);
      this.l(dcj.cp, dcj.cq);
      this.l(dcj.ea, dcj.eb);
      this.a(dcj.cA, dcj.n, nk::c);
      this.a(dcj.nY, dcj.p, nk::d);
      this.y(dcj.ow);
      this.y(dcj.on);
      this.v(dcj.aU);
      this.v(dcj.hi);
      this.C();
      this.D(dcj.oe);
      this.D(dcj.of);
      this.e(dcj.eX, nh.a(dcj.eX));
      this.a(dcj.dY, nm.d);
      this.a(dcj.dZ, nm.d);
      this.a(dcj.te);
      this.a(dcj.kM, nm.d);
      this.f(dcj.j);
      this.f(dcj.sH);
      this.f(dcj.I);
      this.g(dcj.J);
      this.g(dcj.M);
      this.f(dcj.K);
      this.e(dcj.F);
      this.b(dcj.to, nm.f);
      this.a(dcj.ij, nm.d, nm.e);
      this.a(dcj.kx, nm.w, nm.x);
      this.a(dcj.hf, nm.w, nm.x);
      this.a(dcj.tk, nm.d, nm.e);
      this.a(dcj.tl, nm.d, nm.e);
      this.a(dcj.tm, nm.d, nm.e);
      this.c(dcj.nT, nm.i);
      this.z();
      this.a(dcj.pe, nk::A);
      this.a(dcj.pf, nk::C);
      this.a(dcj.kD, dpy.as, 0, 1, 2, 3);
      this.a(dcj.gt, dpy.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dcj.fq, dpy.as, 0, 1, 1, 2);
      this.a(dcj.gu, dpy.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dcj.cB, dpy.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dcj.kA, mt.e.b, dpy.aq, 0, 1);
      this.i();
      this.h();
      this.a(nh.a("decorated_pot"), dcj.iA).b(dcj.tp);
      this.a(nh.a("banner"), dcj.n)
         .a(nj.bF, dcj.iJ, dcj.iK, dcj.iL, dcj.iM, dcj.iN, dcj.iO, dcj.iP, dcj.iQ, dcj.iR, dcj.iS, dcj.iT, dcj.iU, dcj.iV, dcj.iW, dcj.iX, dcj.iY)
         .b(dcj.iZ, dcj.ja, dcj.jb, dcj.jc, dcj.jd, dcj.je, dcj.jf, dcj.jg, dcj.jh, dcj.ji, dcj.jj, dcj.jk, dcj.jl, dcj.jm, dcj.jn, dcj.jo);
      this.a(nh.a("bed"), dcj.n)
         .b(dcj.aZ, dcj.ba, dcj.bb, dcj.bc, dcj.bd, dcj.be, dcj.bf, dcj.bg, dcj.bh, dcj.bi, dcj.bj, dcj.bk, dcj.bl, dcj.bm, dcj.bn, dcj.bo);
      this.m(dcj.aZ, dcj.bA);
      this.m(dcj.ba, dcj.bB);
      this.m(dcj.bb, dcj.bC);
      this.m(dcj.bc, dcj.bD);
      this.m(dcj.bd, dcj.bE);
      this.m(dcj.be, dcj.bF);
      this.m(dcj.bf, dcj.bG);
      this.m(dcj.bg, dcj.bH);
      this.m(dcj.bh, dcj.bI);
      this.m(dcj.bi, dcj.bJ);
      this.m(dcj.bj, dcj.bK);
      this.m(dcj.bk, dcj.bL);
      this.m(dcj.bl, dcj.bM);
      this.m(dcj.bm, dcj.bN);
      this.m(dcj.bn, dcj.bO);
      this.m(dcj.bo, dcj.bP);
      this.a(nh.a("skull"), dcj.dW)
         .a(nj.bG, dcj.gM, dcj.gK, dcj.gI, dcj.gE, dcj.gG, dcj.gQ)
         .a(dcj.gO)
         .b(dcj.gN, dcj.gP, dcj.gL, dcj.gJ, dcj.gF, dcj.gH, dcj.gR);
      this.G(dcj.kP);
      this.G(dcj.kQ);
      this.G(dcj.kR);
      this.G(dcj.kS);
      this.G(dcj.kT);
      this.G(dcj.kU);
      this.G(dcj.kV);
      this.G(dcj.kW);
      this.G(dcj.kX);
      this.G(dcj.kY);
      this.G(dcj.kZ);
      this.G(dcj.la);
      this.G(dcj.lb);
      this.G(dcj.lc);
      this.G(dcj.ld);
      this.G(dcj.le);
      this.G(dcj.lf);
      this.b(dcj.mX, nm.q);
      this.c(dcj.mX);
      this.a(nh.a("chest"), dcj.n).b(dcj.cv, dcj.gV);
      this.a(nh.a("ender_chest"), dcj.co).b(dcj.fG);
      this.f(dcj.fx, dcj.co).a(dcj.fx, dcj.kF);
      this.a(dcj.aM);
      this.a(dcj.aN);
      this.a(dcj.lw);
      this.a(dcj.lx);
      this.a(dcj.ly);
      this.a(dcj.lz);
      this.a(dcj.lA);
      this.a(dcj.lB);
      this.a(dcj.lC);
      this.a(dcj.lD);
      this.a(dcj.lE);
      this.a(dcj.lF);
      this.a(dcj.lG);
      this.a(dcj.lH);
      this.a(dcj.lI);
      this.a(dcj.lJ);
      this.a(dcj.lK);
      this.a(dcj.lL);
      this.a(nm.a, dcj.lM, dcj.lN, dcj.lO, dcj.lP, dcj.lQ, dcj.lR, dcj.lS, dcj.lT, dcj.lU, dcj.lV, dcj.lW, dcj.lX, dcj.lY, dcj.lZ, dcj.ma, dcj.mb);
      this.a(dcj.iA);
      this.a(dcj.hj);
      this.a(dcj.hk);
      this.a(dcj.hl);
      this.a(dcj.hm);
      this.a(dcj.hn);
      this.a(dcj.ho);
      this.a(dcj.hp);
      this.a(dcj.hq);
      this.a(dcj.hr);
      this.a(dcj.hs);
      this.a(dcj.ht);
      this.a(dcj.hu);
      this.a(dcj.hv);
      this.a(dcj.hw);
      this.a(dcj.hx);
      this.a(dcj.hy);
      this.a(dcj.qO);
      this.h(dcj.aQ, dcj.eY);
      this.h(dcj.ei, dcj.hz);
      this.h(dcj.ej, dcj.hA);
      this.h(dcj.ek, dcj.hB);
      this.h(dcj.el, dcj.hC);
      this.h(dcj.em, dcj.hD);
      this.h(dcj.en, dcj.hE);
      this.h(dcj.eo, dcj.hF);
      this.h(dcj.ep, dcj.hG);
      this.h(dcj.eq, dcj.hH);
      this.h(dcj.er, dcj.hI);
      this.h(dcj.es, dcj.hJ);
      this.h(dcj.et, dcj.hK);
      this.h(dcj.eu, dcj.hL);
      this.h(dcj.ev, dcj.hM);
      this.h(dcj.ew, dcj.hN);
      this.h(dcj.ex, dcj.hO);
      this.b(nm.o, dcj.lg, dcj.lh, dcj.li, dcj.lj, dcj.lk, dcj.ll, dcj.lm, dcj.ln, dcj.lo, dcj.lp, dcj.lq, dcj.lr, dcj.ls, dcj.lt, dcj.lu, dcj.lv);
      this.g(dcj.bA, dcj.ik);
      this.g(dcj.bB, dcj.il);
      this.g(dcj.bC, dcj.im);
      this.g(dcj.bD, dcj.in);
      this.g(dcj.bE, dcj.io);
      this.g(dcj.bF, dcj.ip);
      this.g(dcj.bG, dcj.iq);
      this.g(dcj.bH, dcj.ir);
      this.g(dcj.bI, dcj.is);
      this.g(dcj.bJ, dcj.it);
      this.g(dcj.bK, dcj.iu);
      this.g(dcj.bL, dcj.iv);
      this.g(dcj.bM, dcj.iw);
      this.g(dcj.bN, dcj.ix);
      this.g(dcj.bO, dcj.iy);
      this.g(dcj.bP, dcj.iz);
      this.a(dcj.sI);
      this.a(dcj.eL);
      this.a(dcj.bu, dcj.gb, mt.e.a);
      this.a(dcj.bR, dcj.gc, mt.e.b);
      this.a(dcj.bT, dcj.gd, mt.e.b);
      this.a(dcj.bU, dcj.ge, mt.e.b);
      this.a(dcj.bV, dcj.gf, mt.e.b);
      this.a(dcj.bW, dcj.gg, mt.e.b);
      this.a(dcj.bX, dcj.gh, mt.e.b);
      this.a(dcj.bY, dcj.gi, mt.e.b);
      this.a(dcj.bZ, dcj.gj, mt.e.b);
      this.a(dcj.ca, dcj.gk, mt.e.b);
      this.a(dcj.cb, dcj.gl, mt.e.b);
      this.a(dcj.cc, dcj.gm, mt.e.b);
      this.a(dcj.ce, dcj.gn, mt.e.b);
      this.a(dcj.cd, dcj.go, mt.e.b);
      this.a(dcj.cg, dcj.gp, mt.e.b);
      this.a(dcj.cf, dcj.gq, mt.e.b);
      this.a(dcj.bv, dcj.gr, mt.e.b);
      this.a(dcj.bS, dcj.fS, mt.e.b);
      this.H();
      this.u(dcj.eT);
      this.u(dcj.eU);
      this.u(dcj.eV);
      this.a(dcj.bt, mt.e.a);
      this.b(dcj.dS, mt.e.a);
      this.a(crv.dI);
      this.b(dcj.mc, dcj.md, mt.e.b);
      this.a(crv.dJ);
      this.c(dcj.md);
      this.b(dcj.sG, mt.e.b);
      this.c(dcj.sG);
      this.c(dcj.sw);
      this.b(dcj.oz, dcj.oA, mt.e.b);
      this.b(dcj.oB, dcj.oC, mt.e.b);
      this.a(dcj.oz, "_plant");
      this.c(dcj.oA);
      this.a(dcj.oB, "_plant");
      this.c(dcj.oC);
      this.a(dcj.mY, mt.e.a, nk.c(nk.a(dcj.mZ, "_stage0")));
      this.m();
      this.a(dcj.bs, mt.e.b);
      this.c(dcj.iE, mt.e.b);
      this.c(dcj.iF, mt.e.b);
      this.c(dcj.iG, mt.e.b);
      this.c(dcj.iH, mt.e.a);
      this.c(dcj.iI, mt.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dcj.mw, dcj.mr, dcj.mm, dcj.mh, dcj.mG, dcj.mB, dcj.mQ, dcj.mL);
      this.a(dcj.mx, dcj.ms, dcj.mn, dcj.mi, dcj.mH, dcj.mC, dcj.mR, dcj.mM);
      this.a(dcj.my, dcj.mt, dcj.mo, dcj.mj, dcj.mI, dcj.mD, dcj.mS, dcj.mN);
      this.a(dcj.mz, dcj.mu, dcj.mp, dcj.mk, dcj.mJ, dcj.mE, dcj.mT, dcj.mO);
      this.a(dcj.mA, dcj.mv, dcj.mq, dcj.ml, dcj.mK, dcj.mF, dcj.mU, dcj.mP);
      this.e(dcj.fe, dcj.fc);
      this.e(dcj.fd, dcj.fb);
      this.l(dcj.ab).c(dcj.ab).a(dcj.av);
      this.l(dcj.am).c(dcj.am).a(dcj.aD);
      this.a(dcj.am, dcj.dj, dcj.ds);
      this.b(dcj.aL, nm.s);
      this.l(dcj.Y).c(dcj.Y).a(dcj.as);
      this.l(dcj.ai).c(dcj.ai).a(dcj.aA);
      this.a(dcj.ai, dcj.dd, dcj.do);
      this.a(dcj.B, dcj.fX, mt.e.b);
      this.b(dcj.aI, nm.s);
      this.l(dcj.Z).d(dcj.Z).a(dcj.at);
      this.l(dcj.aj).d(dcj.aj).a(dcj.aB);
      this.a(dcj.aj, dcj.de, dcj.dp);
      this.a(dcj.C, dcj.fY, mt.e.b);
      this.b(dcj.aJ, nm.s);
      this.l(dcj.W).c(dcj.W).a(dcj.aq);
      this.l(dcj.ag).c(dcj.ag).a(dcj.ay);
      this.a(dcj.ag, dcj.dc, dcj.dn);
      this.a(dcj.z, dcj.fV, mt.e.b);
      this.b(dcj.aG, nm.s);
      this.l(dcj.U).c(dcj.U).a(dcj.ao);
      this.l(dcj.al).c(dcj.al).a(dcj.aw);
      this.a(dcj.al, dcj.da, dcj.dl);
      this.a(dcj.x, dcj.fT, mt.e.b);
      this.b(dcj.aE, nm.s);
      this.l(dcj.V).c(dcj.V).a(dcj.ap);
      this.l(dcj.af).c(dcj.af).a(dcj.ax);
      this.a(dcj.af, dcj.db, dcj.dm);
      this.a(dcj.y, dcj.fU, mt.e.b);
      this.b(dcj.aF, nm.s);
      this.l(dcj.aa).c(dcj.aa).a(dcj.au);
      this.l(dcj.ak).c(dcj.ak).a(dcj.aC);
      this.a(dcj.ak, dcj.dg, dcj.dr);
      this.a(dcj.D, dcj.fZ, mt.e.b);
      this.b(dcj.aK, nm.s);
      this.l(dcj.X).c(dcj.X).a(dcj.ar);
      this.l(dcj.ah).c(dcj.ah).a(dcj.az);
      this.a(dcj.ah, dcj.df, dcj.dq);
      this.a(dcj.A, dcj.fW, mt.e.b);
      this.b(dcj.aH, nm.s);
      this.l(dcj.os).b(dcj.os).a(dcj.ou);
      this.l(dcj.ot).b(dcj.ot).a(dcj.ov);
      this.a(dcj.ot, dcj.dh, dcj.dt);
      this.a(dcj.ox, dcj.pm, mt.e.b);
      this.n(dcj.oD, dcj.po);
      this.l(dcj.oj).b(dcj.oj).a(dcj.ol);
      this.l(dcj.ok).b(dcj.ok).a(dcj.om);
      this.a(dcj.ok, dcj.di, dcj.du);
      this.a(dcj.oo, dcj.pn, mt.e.b);
      this.n(dcj.oq, dcj.pp);
      this.l(dcj.ae).d(dcj.ae);
      this.l(dcj.an).d(dcj.an);
      this.a(dcj.v, dcj.dk, dcj.dv);
      this.b(dcj.or, mt.e.b);
      this.a(crv.dF);
      this.i(dcj.dy);
      this.k(dcj.hY);
      this.u();
      this.n(dcj.cP);
      this.o(dcj.bp);
      this.o(dcj.bq);
      this.o(dcj.hh);
      this.t();
      this.q(dcj.fN);
      this.q(dcj.kG);
      this.q(dcj.kH);
      this.r(dcj.gS);
      this.r(dcj.gT);
      this.r(dcj.gU);
      this.o();
      this.p();
      this.d(dcj.cD, nm.h);
      this.d(dcj.nW, nm.h);
      this.d(dcj.nV, nm.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dcj.eK, dcj.eS);
      this.k(dcj.m, dcj.eO);
      this.k(dcj.eJ, dcj.eR);
      this.k(dcj.eI, dcj.eQ);
      this.az();
      this.k(dcj.eH, dcj.eP);
      this.aA();
      csw.h().forEach($$0 -> this.a($$0, nh.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dcj.hX);
      na.a<Integer> $$0 = na.a(dpy.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ajv $$3 = nk.a(crv.hB, $$2);
         $$0.a($$1, nc.a().a(nd.c, nj.aa.a(dcj.hX, $$2, nk.h($$3), this.c)));
         nj.bx.a(nh.a(crv.hB, $$2), nk.k($$3), this.c);
      }

      this.b.accept(mz.a(dcj.hX).a($$0));
   }

   private void o(dch $$0, dch $$1) {
      this.a($$0.p());
      nk $$2 = nk.b(nk.G($$0));
      nk $$3 = nk.b(nk.a($$0, "_lit"));
      ajv $$4 = nj.bH.a($$0, "_one_candle", $$2, this.c);
      ajv $$5 = nj.bI.a($$0, "_two_candles", $$2, this.c);
      ajv $$6 = nj.bJ.a($$0, "_three_candles", $$2, this.c);
      ajv $$7 = nj.bK.a($$0, "_four_candles", $$2, this.c);
      ajv $$8 = nj.bH.a($$0, "_one_candle_lit", $$3, this.c);
      ajv $$9 = nj.bI.a($$0, "_two_candles_lit", $$3, this.c);
      ajv $$10 = nj.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      ajv $$11 = nj.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            mz.a($$0)
               .a(
                  na.a(dpy.az, dpy.r)
                     .a(1, false, nc.a().a(nd.c, $$4))
                     .a(2, false, nc.a().a(nd.c, $$5))
                     .a(3, false, nc.a().a(nd.c, $$6))
                     .a(4, false, nc.a().a(nd.c, $$7))
                     .a(1, true, nc.a().a(nd.c, $$8))
                     .a(2, true, nc.a().a(nd.c, $$9))
                     .a(3, true, nc.a().a(nd.c, $$10))
                     .a(4, true, nc.a().a(nd.c, $$11))
               )
         );
      ajv $$12 = nj.bL.a($$1, nk.a($$0, false), this.c);
      ajv $$13 = nj.bL.a($$1, "_lit", nk.a($$0, true), this.c);
      this.b.accept(mz.a($$1).a(a(dpy.r, $$13, $$12)));
   }

   class a {
      private final ajv b;

      public a(ajv $$0, dch $$1) {
         this.b = nj.aa.a($$0, nk.u($$1), mt.this.c);
      }

      public mt.a a(dch... $$0) {
         for (dch $$1 : $$0) {
            mt.this.b.accept(mt.c($$1, this.b));
         }

         return this;
      }

      public mt.a b(dch... $$0) {
         for (dch $$1 : $$0) {
            mt.this.c($$1);
         }

         return this.a($$0);
      }

      public mt.a a(ni $$0, dch... $$1) {
         for (dch $$2 : $$1) {
            $$0.a(nh.a($$2.p()), nk.u($$2), mt.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final nk b;
      private final Map<ni, ajv> c = Maps.newHashMap();
      @Nullable
      private kx d;
      @Nullable
      private ajv e;
      private final Set<dch> f = new HashSet<>();

      public b(nk $$0) {
         this.b = $$0;
      }

      public mt.b a(dch $$0, ni $$1) {
         this.e = $$1.a($$0, this.b, mt.this.c);
         if (mt.this.f.containsKey($$0)) {
            mt.this.b.accept(mt.this.f.get($$0).create($$0, this.e, this.b, mt.this.c));
         } else {
            mt.this.b.accept(mt.c($$0, this.e));
         }

         return this;
      }

      public mt.b a(dch $$0, dch $$1) {
         ajv $$2 = nh.a($$0);
         mt.this.b.accept(mt.c($$1, $$2));
         mt.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public mt.b a(dch $$0) {
         ajv $$1 = nj.s.a($$0, this.b, mt.this.c);
         ajv $$2 = nj.t.a($$0, this.b, mt.this.c);
         mt.this.b.accept(mt.b($$0, $$1, $$2));
         ajv $$3 = nj.u.a($$0, this.b, mt.this.c);
         mt.this.a($$0, $$3);
         return this;
      }

      public mt.b b(dch $$0) {
         ajv $$1 = nj.M.a($$0, this.b, mt.this.c);
         ajv $$2 = nj.N.a($$0, this.b, mt.this.c);
         ajv $$3 = nj.O.a($$0, this.b, mt.this.c);
         mt.this.b.accept(mt.a($$0, $$1, $$2, $$3));
         ajv $$4 = nj.P.a($$0, this.b, mt.this.c);
         mt.this.a($$0, $$4);
         return this;
      }

      public mt.b c(dch $$0) {
         nk $$1 = nk.p($$0);
         ajv $$2 = nj.D.a($$0, $$1, mt.this.c);
         ajv $$3 = nj.E.a($$0, $$1, mt.this.c);
         ajv $$4 = nj.F.a($$0, $$1, mt.this.c);
         ajv $$5 = nj.G.a($$0, $$1, mt.this.c);
         ajv $$6 = nj.H.a($$0, $$1, mt.this.c);
         mt.this.b.accept(mt.a($$0, $$2, $$3, $$4, $$5, $$6));
         ajv $$7 = nj.I.a($$0, $$1, mt.this.c);
         mt.this.a($$0, $$7);
         return this;
      }

      public mt.b d(dch $$0) {
         ajv $$1 = nj.J.a($$0, this.b, mt.this.c);
         ajv $$2 = nj.K.a($$0, this.b, mt.this.c);
         mt.this.b.accept(mt.c($$0, $$1, $$2));
         ajv $$3 = nj.L.a($$0, this.b, mt.this.c);
         mt.this.a($$0, $$3);
         return this;
      }

      public mt.b e(dch $$0) {
         nk $$1 = nk.p($$0);
         ajv $$2 = nj.R.a($$0, $$1, mt.this.c);
         ajv $$3 = nj.Q.a($$0, $$1, mt.this.c);
         ajv $$4 = nj.T.a($$0, $$1, mt.this.c);
         ajv $$5 = nj.S.a($$0, $$1, mt.this.c);
         mt.this.b.accept(mt.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public mt.b f(dch $$0) {
         ajv $$1 = nj.V.a($$0, this.b, mt.this.c);
         ajv $$2 = nj.U.a($$0, this.b, mt.this.c);
         ajv $$3 = nj.X.a($$0, this.b, mt.this.c);
         ajv $$4 = nj.W.a($$0, this.b, mt.this.c);
         mt.this.b.accept(mt.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public mt.b g(dch $$0) {
         ajv $$1 = nj.Y.a($$0, this.b, mt.this.c);
         ajv $$2 = nj.Z.a($$0, this.b, mt.this.c);
         mt.this.b.accept(mt.e($$0, $$1, $$2));
         return this;
      }

      public mt.b h(dch $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dch $$1 = this.d.b().get(kx.b.r);
            ajv $$2 = nj.aa.a($$0, this.b, mt.this.c);
            mt.this.b.accept(mt.c($$0, $$2));
            mt.this.b.accept(mt.c($$1, $$2));
            mt.this.a($$0.p());
            mt.this.c($$1);
            return this;
         }
      }

      public mt.b i(dch $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ajv $$1 = this.a(nj.ab, $$0);
            ajv $$2 = this.a(nj.ac, $$0);
            mt.this.b.accept(mt.e($$0, $$1, $$2, this.e));
            mt.this.a($$0, $$1);
            return this;
         }
      }

      public mt.b j(dch $$0) {
         ajv $$1 = this.a(nj.af, $$0);
         ajv $$2 = this.a(nj.ae, $$0);
         ajv $$3 = this.a(nj.ag, $$0);
         mt.this.b.accept(mt.b($$0, $$1, $$2, $$3));
         mt.this.a($$0, $$2);
         return this;
      }

      private mt.b k(dch $$0) {
         nm $$1 = mt.this.g.getOrDefault($$0, nm.a.get($$0));
         ajv $$2 = $$1.a($$0, mt.this.c);
         mt.this.b.accept(mt.c($$0, $$2));
         return this;
      }

      private mt.b l(dch $$0) {
         mt.this.i($$0);
         return this;
      }

      private void m(dch $$0) {
         if (mt.this.e.contains($$0)) {
            mt.this.k($$0);
         } else {
            mt.this.j($$0);
         }
      }

      private ajv a(ni $$0, dch $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, mt.this.c));
      }

      public mt.b a(kx $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<mt.b, dch> $$2 = mt.h.get($$0x);
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
      mw create(dch var1, ajv var2, nk var3, BiConsumer<ajv, Supplier<JsonElement>> var4);
   }

   static record d(ni a, String b) {
   }

   static enum e {
      a,
      b;

      public ni a() {
         return this == a ? nj.ap : nj.ao;
      }

      public ni b() {
         return this == a ? nj.ar : nj.aq;
      }
   }

   class f {
      private final nk b;

      public f(nk $$0) {
         this.b = $$0;
      }

      public mt.f a(dch $$0) {
         nk $$1 = this.b.c(nl.d, this.b.a(nl.i));
         ajv $$2 = nj.j.a($$0, $$1, mt.this.c);
         mt.this.b.accept(mt.d($$0, $$2));
         return this;
      }

      public mt.f b(dch $$0) {
         ajv $$1 = nj.j.a($$0, this.b, mt.this.c);
         mt.this.b.accept(mt.d($$0, $$1));
         return this;
      }

      public mt.f c(dch $$0) {
         ajv $$1 = nj.j.a($$0, this.b, mt.this.c);
         ajv $$2 = nj.k.a($$0, this.b, mt.this.c);
         mt.this.b.accept(mt.d($$0, $$1, $$2));
         return this;
      }

      public mt.f d(dch $$0) {
         mt.this.b.accept(mt.a($$0, this.b, mt.this.c));
         return this;
      }
   }
}
