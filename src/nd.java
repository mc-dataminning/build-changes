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

public class nd {
   final Consumer<ng> b;
   final BiConsumer<akh, Supplier<JsonElement>> c;
   private final Consumer<csu> d;
   final List<dde> e = ImmutableList.of(ddg.ey, ddg.eE, ddg.hY);
   final Map<dde, nd.c> f = ImmutableMap.builder().put(ddg.b, nd::a).put(ddg.sJ, nd::c).put(ddg.eM, nd::b).build();
   final Map<dde, nw> g = ImmutableMap.builder()
      .put(ddg.aV, nw.y.get(ddg.aV))
      .put(ddg.jp, nw.y.get(ddg.jp))
      .put(ddg.jS, nw.a(nu.a(ddg.aV, "_top")))
      .put(ddg.jU, nw.a(nu.a(ddg.jp, "_top")))
      .put(ddg.aX, nw.d.get(ddg.aV).a($$0x -> $$0x.a(nv.i, nu.G(ddg.aX))))
      .put(ddg.jr, nw.d.get(ddg.jp).a($$0x -> $$0x.a(nv.i, nu.G(ddg.jr))))
      .put(ddg.hd, nw.d.get(ddg.hd))
      .put(ddg.jT, nw.a(nu.a(ddg.hd, "_bottom")))
      .put(ddg.pr, nw.z.get(ddg.pr))
      .put(ddg.sJ, nw.z.get(ddg.sJ))
      .put(ddg.he, nw.d.get(ddg.he).a($$0x -> $$0x.a(nv.i, nu.G(ddg.he))))
      .put(ddg.aW, nw.d.get(ddg.aW).a($$0x -> {
         $$0x.a(nv.d, nu.a(ddg.aV, "_top"));
         $$0x.a(nv.i, nu.G(ddg.aW));
      }))
      .put(ddg.jq, nw.d.get(ddg.jq).a($$0x -> {
         $$0x.a(nv.d, nu.a(ddg.jp, "_top"));
         $$0x.a(nv.i, nu.G(ddg.jq));
      }))
      .put(ddg.qM, nw.z.get(ddg.qM))
      .put(ddg.qH, nw.z.get(ddg.qH))
      .build();
   static final Map<lh.b, BiConsumer<nd.b, dde>> h = ImmutableMap.builder()
      .put(lh.b.a, nd.b::a)
      .put(lh.b.e, nd.b::l)
      .put(lh.b.b, nd.b::k)
      .put(lh.b.c, nd.b::k)
      .put(lh.b.f, nd.b::c)
      .put(lh.b.g, nd.b::d)
      .put(lh.b.h, nd.b::e)
      .put(lh.b.i, nd.b::f)
      .put(lh.b.k, nd.b::h)
      .put(lh.b.l, nd.b::i)
      .put(lh.b.m, nd.b::j)
      .put(lh.b.n, nd.b::g)
      .put(lh.b.p, nd.b::m)
      .put(lh.b.q, nd.b::b)
      .build();
   public static final List<Pair<dqy, Function<akh, nm>>> a = List.of(
      Pair.of(dqx.L, (Function<akh, nm>)$$0 -> nm.a().a(nn.c, $$0)),
      Pair.of(dqx.M, (Function<akh, nm>)$$0 -> nm.a().a(nn.c, $$0).a(nn.b, nn.a.b).a(nn.d, true)),
      Pair.of(dqx.N, (Function<akh, nm>)$$0 -> nm.a().a(nn.c, $$0).a(nn.b, nn.a.c).a(nn.d, true)),
      Pair.of(dqx.O, (Function<akh, nm>)$$0 -> nm.a().a(nn.c, $$0).a(nn.b, nn.a.d).a(nn.d, true)),
      Pair.of(dqx.J, (Function<akh, nm>)$$0 -> nm.a().a(nn.c, $$0).a(nn.a, nn.a.d).a(nn.d, true)),
      Pair.of(dqx.K, (Function<akh, nm>)$$0 -> nm.a().a(nn.c, $$0).a(nn.a, nn.a.b).a(nn.d, true))
   );
   private static final Map<nd.d, akh> i = new HashMap<>();

   private static ng a(dde $$0, akh $$1, nu $$2, BiConsumer<akh, Supplier<JsonElement>> $$3) {
      akh $$4 = nt.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static ng b(dde $$0, akh $$1, nu $$2, BiConsumer<akh, Supplier<JsonElement>> $$3) {
      akh $$4 = nt.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static ng c(dde $$0, akh $$1, nu $$2, BiConsumer<akh, Supplier<JsonElement>> $$3) {
      akh $$4 = nt.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nd(Consumer<ng> $$0, BiConsumer<akh, Supplier<JsonElement>> $$1, Consumer<csu> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dde $$0) {
      this.d.accept($$0.q());
   }

   void a(dde $$0, akh $$1) {
      this.c.accept(nr.a($$0.q()), new nq($$1));
   }

   private void a(csu $$0, akh $$1) {
      this.c.accept(nr.a($$0), new nq($$1));
   }

   void a(csu $$0) {
      nt.bx.a(nr.a($$0), nu.b($$0), this.c);
   }

   private void d(dde $$0) {
      csu $$1 = $$0.q();
      if ($$1 != ctc.a) {
         nt.bx.a(nr.a($$1), nu.F($$0), this.c);
      }
   }

   private void a(dde $$0, String $$1) {
      csu $$2 = $$0.q();
      nt.bx.a(nr.a($$2), nu.k(nu.a($$0, $$1)), this.c);
   }

   private static nk b() {
      return nk.a(dqx.R).a(is.f, nm.a().a(nn.b, nn.a.b)).a(is.d, nm.a().a(nn.b, nn.a.c)).a(is.e, nm.a().a(nn.b, nn.a.d)).a(is.c, nm.a());
   }

   private static nk c() {
      return nk.a(dqx.R).a(is.d, nm.a()).a(is.e, nm.a().a(nn.b, nn.a.b)).a(is.c, nm.a().a(nn.b, nn.a.c)).a(is.f, nm.a().a(nn.b, nn.a.d));
   }

   private static nk d() {
      return nk.a(dqx.R).a(is.f, nm.a()).a(is.d, nm.a().a(nn.b, nn.a.b)).a(is.e, nm.a().a(nn.b, nn.a.c)).a(is.c, nm.a().a(nn.b, nn.a.d));
   }

   private static nk e() {
      return nk.a(dqx.P)
         .a(is.a, nm.a().a(nn.a, nn.a.b))
         .a(is.b, nm.a().a(nn.a, nn.a.d))
         .a(is.c, nm.a())
         .a(is.d, nm.a().a(nn.b, nn.a.c))
         .a(is.e, nm.a().a(nn.b, nn.a.d))
         .a(is.f, nm.a().a(nn.b, nn.a.b));
   }

   private static nj b(dde $$0, akh $$1) {
      return nj.a($$0, a($$1));
   }

   private static nm[] a(akh $$0) {
      return new nm[]{nm.a().a(nn.c, $$0), nm.a().a(nn.c, $$0).a(nn.b, nn.a.b), nm.a().a(nn.c, $$0).a(nn.b, nn.a.c), nm.a().a(nn.c, $$0).a(nn.b, nn.a.d)};
   }

   private static nj a(dde $$0, akh $$1, akh $$2) {
      return nj.a($$0, nm.a().a(nn.c, $$1), nm.a().a(nn.c, $$2), nm.a().a(nn.c, $$1).a(nn.b, nn.a.c), nm.a().a(nn.c, $$2).a(nn.b, nn.a.c));
   }

   private static nk a(dqy $$0, akh $$1, akh $$2) {
      return nk.a($$0).a(true, nm.a().a(nn.c, $$1)).a(false, nm.a().a(nn.c, $$2));
   }

   private void e(dde $$0) {
      akh $$1 = nw.a.create($$0, this.c);
      akh $$2 = nw.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dde $$0) {
      akh $$1 = nw.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dde $$0) {
      this.b.accept(nj.a($$0).a(nk.a(dqx.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akh $$3 = nu.a($$0, $$2);
         return nm.a().a(nn.c, nt.c.a($$0, $$2, new nu().a(nv.a, $$3), this.c));
      })));
      this.a($$0, nu.a($$0, "_0"));
   }

   static ng b(dde $$0, akh $$1, akh $$2) {
      return nj.a($$0)
         .a(nk.a(dqx.w).a(false, nm.a().a(nn.c, $$1)).a(true, nm.a().a(nn.c, $$2)))
         .a(
            nk.a(dqx.U, dqx.R)
               .a(dqs.a, is.f, nm.a().a(nn.b, nn.a.b))
               .a(dqs.a, is.e, nm.a().a(nn.b, nn.a.d))
               .a(dqs.a, is.d, nm.a().a(nn.b, nn.a.c))
               .a(dqs.a, is.c, nm.a())
               .a(dqs.b, is.f, nm.a().a(nn.b, nn.a.b).a(nn.a, nn.a.b).a(nn.d, true))
               .a(dqs.b, is.e, nm.a().a(nn.b, nn.a.d).a(nn.a, nn.a.b).a(nn.d, true))
               .a(dqs.b, is.d, nm.a().a(nn.b, nn.a.c).a(nn.a, nn.a.b).a(nn.d, true))
               .a(dqs.b, is.c, nm.a().a(nn.a, nn.a.b).a(nn.d, true))
               .a(dqs.c, is.f, nm.a().a(nn.b, nn.a.d).a(nn.a, nn.a.c))
               .a(dqs.c, is.e, nm.a().a(nn.b, nn.a.b).a(nn.a, nn.a.c))
               .a(dqs.c, is.d, nm.a().a(nn.a, nn.a.c))
               .a(dqs.c, is.c, nm.a().a(nn.b, nn.a.c).a(nn.a, nn.a.c))
         );
   }

   private static nk.d<is, drd, drc, Boolean> a(nk.d<is, drd, drc, Boolean> $$0, drd $$1, akh $$2, akh $$3, akh $$4, akh $$5) {
      return $$0.a(is.f, $$1, drc.a, false, nm.a().a(nn.c, $$2))
         .a(is.d, $$1, drc.a, false, nm.a().a(nn.c, $$2).a(nn.b, nn.a.b))
         .a(is.e, $$1, drc.a, false, nm.a().a(nn.c, $$2).a(nn.b, nn.a.c))
         .a(is.c, $$1, drc.a, false, nm.a().a(nn.c, $$2).a(nn.b, nn.a.d))
         .a(is.f, $$1, drc.b, false, nm.a().a(nn.c, $$4))
         .a(is.d, $$1, drc.b, false, nm.a().a(nn.c, $$4).a(nn.b, nn.a.b))
         .a(is.e, $$1, drc.b, false, nm.a().a(nn.c, $$4).a(nn.b, nn.a.c))
         .a(is.c, $$1, drc.b, false, nm.a().a(nn.c, $$4).a(nn.b, nn.a.d))
         .a(is.f, $$1, drc.a, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.b))
         .a(is.d, $$1, drc.a, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.c))
         .a(is.e, $$1, drc.a, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.d))
         .a(is.c, $$1, drc.a, true, nm.a().a(nn.c, $$3))
         .a(is.f, $$1, drc.b, true, nm.a().a(nn.c, $$5).a(nn.b, nn.a.d))
         .a(is.d, $$1, drc.b, true, nm.a().a(nn.c, $$5))
         .a(is.e, $$1, drc.b, true, nm.a().a(nn.c, $$5).a(nn.b, nn.a.b))
         .a(is.c, $$1, drc.b, true, nm.a().a(nn.c, $$5).a(nn.b, nn.a.c));
   }

   private static ng a(dde $$0, akh $$1, akh $$2, akh $$3, akh $$4, akh $$5, akh $$6, akh $$7, akh $$8) {
      return nj.a($$0).a(a(a(nk.a(dqx.R, dqx.ae, dqx.be, dqx.u), drd.b, $$1, $$2, $$3, $$4), drd.a, $$5, $$6, $$7, $$8));
   }

   static ng a(dde $$0, akh $$1, akh $$2, akh $$3, akh $$4, akh $$5) {
      return ni.a($$0)
         .a(nm.a().a(nn.c, $$1))
         .a(nh.a().a(dqx.L, true), nm.a().a(nn.c, $$2).a(nn.d, false))
         .a(nh.a().a(dqx.M, true), nm.a().a(nn.c, $$3).a(nn.d, false))
         .a(nh.a().a(dqx.N, true), nm.a().a(nn.c, $$4).a(nn.d, false))
         .a(nh.a().a(dqx.O, true), nm.a().a(nn.c, $$5).a(nn.d, false));
   }

   static ng c(dde $$0, akh $$1, akh $$2) {
      return ni.a($$0)
         .a(nm.a().a(nn.c, $$1))
         .a(nh.a().a(dqx.L, true), nm.a().a(nn.c, $$2).a(nn.d, true))
         .a(nh.a().a(dqx.M, true), nm.a().a(nn.c, $$2).a(nn.b, nn.a.b).a(nn.d, true))
         .a(nh.a().a(dqx.N, true), nm.a().a(nn.c, $$2).a(nn.b, nn.a.c).a(nn.d, true))
         .a(nh.a().a(dqx.O, true), nm.a().a(nn.c, $$2).a(nn.b, nn.a.d).a(nn.d, true));
   }

   static ng a(dde $$0, akh $$1, akh $$2, akh $$3) {
      return ni.a($$0)
         .a(nh.a().a(dqx.J, true), nm.a().a(nn.c, $$1))
         .a(nh.a().a(dqx.X, drt.b), nm.a().a(nn.c, $$2).a(nn.d, true))
         .a(nh.a().a(dqx.W, drt.b), nm.a().a(nn.c, $$2).a(nn.b, nn.a.b).a(nn.d, true))
         .a(nh.a().a(dqx.Y, drt.b), nm.a().a(nn.c, $$2).a(nn.b, nn.a.c).a(nn.d, true))
         .a(nh.a().a(dqx.Z, drt.b), nm.a().a(nn.c, $$2).a(nn.b, nn.a.d).a(nn.d, true))
         .a(nh.a().a(dqx.X, drt.c), nm.a().a(nn.c, $$3).a(nn.d, true))
         .a(nh.a().a(dqx.W, drt.c), nm.a().a(nn.c, $$3).a(nn.b, nn.a.b).a(nn.d, true))
         .a(nh.a().a(dqx.Y, drt.c), nm.a().a(nn.c, $$3).a(nn.b, nn.a.c).a(nn.d, true))
         .a(nh.a().a(dqx.Z, drt.c), nm.a().a(nn.c, $$3).a(nn.b, nn.a.d).a(nn.d, true));
   }

   static ng a(dde $$0, akh $$1, akh $$2, akh $$3, akh $$4, boolean $$5) {
      return nj.a($$0, nm.a().a(nn.d, $$5))
         .a(c())
         .a(
            nk.a(dqx.q, dqx.u)
               .a(false, false, nm.a().a(nn.c, $$2))
               .a(true, false, nm.a().a(nn.c, $$4))
               .a(false, true, nm.a().a(nn.c, $$1))
               .a(true, true, nm.a().a(nn.c, $$3))
         );
   }

   static ng b(dde $$0, akh $$1, akh $$2, akh $$3) {
      return nj.a($$0)
         .a(
            nk.a(dqx.R, dqx.af, dqx.bi)
               .a(is.f, drg.b, drq.a, nm.a().a(nn.c, $$2))
               .a(is.e, drg.b, drq.a, nm.a().a(nn.c, $$2).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.d, drg.b, drq.a, nm.a().a(nn.c, $$2).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.c, drg.b, drq.a, nm.a().a(nn.c, $$2).a(nn.b, nn.a.d).a(nn.d, true))
               .a(is.f, drg.b, drq.e, nm.a().a(nn.c, $$3))
               .a(is.e, drg.b, drq.e, nm.a().a(nn.c, $$3).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.d, drg.b, drq.e, nm.a().a(nn.c, $$3).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.c, drg.b, drq.e, nm.a().a(nn.c, $$3).a(nn.b, nn.a.d).a(nn.d, true))
               .a(is.f, drg.b, drq.d, nm.a().a(nn.c, $$3).a(nn.b, nn.a.d).a(nn.d, true))
               .a(is.e, drg.b, drq.d, nm.a().a(nn.c, $$3).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.d, drg.b, drq.d, nm.a().a(nn.c, $$3))
               .a(is.c, drg.b, drq.d, nm.a().a(nn.c, $$3).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.f, drg.b, drq.c, nm.a().a(nn.c, $$1))
               .a(is.e, drg.b, drq.c, nm.a().a(nn.c, $$1).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.d, drg.b, drq.c, nm.a().a(nn.c, $$1).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.c, drg.b, drq.c, nm.a().a(nn.c, $$1).a(nn.b, nn.a.d).a(nn.d, true))
               .a(is.f, drg.b, drq.b, nm.a().a(nn.c, $$1).a(nn.b, nn.a.d).a(nn.d, true))
               .a(is.e, drg.b, drq.b, nm.a().a(nn.c, $$1).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.d, drg.b, drq.b, nm.a().a(nn.c, $$1))
               .a(is.c, drg.b, drq.b, nm.a().a(nn.c, $$1).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.f, drg.a, drq.a, nm.a().a(nn.c, $$2).a(nn.a, nn.a.c).a(nn.d, true))
               .a(is.e, drg.a, drq.a, nm.a().a(nn.c, $$2).a(nn.a, nn.a.c).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.d, drg.a, drq.a, nm.a().a(nn.c, $$2).a(nn.a, nn.a.c).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.c, drg.a, drq.a, nm.a().a(nn.c, $$2).a(nn.a, nn.a.c).a(nn.b, nn.a.d).a(nn.d, true))
               .a(is.f, drg.a, drq.e, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.e, drg.a, drq.e, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.d).a(nn.d, true))
               .a(is.d, drg.a, drq.e, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.c, drg.a, drq.e, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.d, true))
               .a(is.f, drg.a, drq.d, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.d, true))
               .a(is.e, drg.a, drq.d, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.d, drg.a, drq.d, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.c, drg.a, drq.d, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.d).a(nn.d, true))
               .a(is.f, drg.a, drq.c, nm.a().a(nn.c, $$1).a(nn.a, nn.a.c).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.e, drg.a, drq.c, nm.a().a(nn.c, $$1).a(nn.a, nn.a.c).a(nn.b, nn.a.d).a(nn.d, true))
               .a(is.d, drg.a, drq.c, nm.a().a(nn.c, $$1).a(nn.a, nn.a.c).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.c, drg.a, drq.c, nm.a().a(nn.c, $$1).a(nn.a, nn.a.c).a(nn.d, true))
               .a(is.f, drg.a, drq.b, nm.a().a(nn.c, $$1).a(nn.a, nn.a.c).a(nn.d, true))
               .a(is.e, drg.a, drq.b, nm.a().a(nn.c, $$1).a(nn.a, nn.a.c).a(nn.b, nn.a.c).a(nn.d, true))
               .a(is.d, drg.a, drq.b, nm.a().a(nn.c, $$1).a(nn.a, nn.a.c).a(nn.b, nn.a.b).a(nn.d, true))
               .a(is.c, drg.a, drq.b, nm.a().a(nn.c, $$1).a(nn.a, nn.a.c).a(nn.b, nn.a.d).a(nn.d, true))
         );
   }

   private static ng c(dde $$0, akh $$1, akh $$2, akh $$3) {
      return nj.a($$0)
         .a(
            nk.a(dqx.R, dqx.af, dqx.u)
               .a(is.c, drg.b, false, nm.a().a(nn.c, $$2))
               .a(is.d, drg.b, false, nm.a().a(nn.c, $$2).a(nn.b, nn.a.c))
               .a(is.f, drg.b, false, nm.a().a(nn.c, $$2).a(nn.b, nn.a.b))
               .a(is.e, drg.b, false, nm.a().a(nn.c, $$2).a(nn.b, nn.a.d))
               .a(is.c, drg.a, false, nm.a().a(nn.c, $$1))
               .a(is.d, drg.a, false, nm.a().a(nn.c, $$1).a(nn.b, nn.a.c))
               .a(is.f, drg.a, false, nm.a().a(nn.c, $$1).a(nn.b, nn.a.b))
               .a(is.e, drg.a, false, nm.a().a(nn.c, $$1).a(nn.b, nn.a.d))
               .a(is.c, drg.b, true, nm.a().a(nn.c, $$3))
               .a(is.d, drg.b, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.c))
               .a(is.f, drg.b, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.b))
               .a(is.e, drg.b, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.d))
               .a(is.c, drg.a, true, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.c))
               .a(is.d, drg.a, true, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.a))
               .a(is.f, drg.a, true, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.d))
               .a(is.e, drg.a, true, nm.a().a(nn.c, $$3).a(nn.a, nn.a.c).a(nn.b, nn.a.b))
         );
   }

   private static ng d(dde $$0, akh $$1, akh $$2, akh $$3) {
      return nj.a($$0)
         .a(
            nk.a(dqx.R, dqx.af, dqx.u)
               .a(is.c, drg.b, false, nm.a().a(nn.c, $$2))
               .a(is.d, drg.b, false, nm.a().a(nn.c, $$2))
               .a(is.f, drg.b, false, nm.a().a(nn.c, $$2))
               .a(is.e, drg.b, false, nm.a().a(nn.c, $$2))
               .a(is.c, drg.a, false, nm.a().a(nn.c, $$1))
               .a(is.d, drg.a, false, nm.a().a(nn.c, $$1))
               .a(is.f, drg.a, false, nm.a().a(nn.c, $$1))
               .a(is.e, drg.a, false, nm.a().a(nn.c, $$1))
               .a(is.c, drg.b, true, nm.a().a(nn.c, $$3))
               .a(is.d, drg.b, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.c))
               .a(is.f, drg.b, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.b))
               .a(is.e, drg.b, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.d))
               .a(is.c, drg.a, true, nm.a().a(nn.c, $$3))
               .a(is.d, drg.a, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.c))
               .a(is.f, drg.a, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.b))
               .a(is.e, drg.a, true, nm.a().a(nn.c, $$3).a(nn.b, nn.a.d))
         );
   }

   static nj c(dde $$0, akh $$1) {
      return nj.a($$0, nm.a().a(nn.c, $$1));
   }

   private static nk f() {
      return nk.a(dqx.I).a(is.a.b, nm.a()).a(is.a.c, nm.a().a(nn.a, nn.a.b)).a(is.a.a, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.b));
   }

   static ng a(dde $$0, nu $$1, BiConsumer<akh, Supplier<JsonElement>> $$2) {
      akh $$3 = nt.g.a($$0, $$1, $$2);
      akh $$4 = nt.h.a($$0, $$1, $$2);
      akh $$5 = nt.i.a($$0, $$1, $$2);
      akh $$6 = nt.j.a($$0, $$1, $$2);
      return nj.a($$0, nm.a().a(nn.c, $$6)).a(nk.a(dqx.I).a(is.a.a, nm.a().a(nn.c, $$3)).a(is.a.b, nm.a().a(nn.c, $$4)).a(is.a.c, nm.a().a(nn.c, $$5)));
   }

   static ng d(dde $$0, akh $$1) {
      return nj.a($$0, nm.a().a(nn.c, $$1)).a(f());
   }

   private void e(dde $$0, akh $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dde $$0, nw.a $$1) {
      akh $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dde $$0, nw.a $$1) {
      akh $$2 = $$1.create($$0, this.c);
      this.b.accept(nj.a($$0, nm.a().a(nn.c, $$2)).a(b()));
   }

   static ng d(dde $$0, akh $$1, akh $$2) {
      return nj.a($$0)
         .a(
            nk.a(dqx.I)
               .a(is.a.b, nm.a().a(nn.c, $$1))
               .a(is.a.c, nm.a().a(nn.c, $$2).a(nn.a, nn.a.b))
               .a(is.a.a, nm.a().a(nn.c, $$2).a(nn.a, nn.a.b).a(nn.b, nn.a.b))
         );
   }

   private void a(dde $$0, nw.a $$1, nw.a $$2) {
      akh $$3 = $$1.create($$0, this.c);
      akh $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akh a(dde $$0, String $$1, ns $$2, Function<akh, nu> $$3) {
      return $$2.a($$0, $$1, $$3.apply(nu.a($$0, $$1)), this.c);
   }

   static ng e(dde $$0, akh $$1, akh $$2) {
      return nj.a($$0).a(a(dqx.w, $$2, $$1));
   }

   static ng e(dde $$0, akh $$1, akh $$2, akh $$3) {
      return nj.a($$0).a(nk.a(dqx.bh).a(drp.b, nm.a().a(nn.c, $$1)).a(drp.a, nm.a().a(nn.c, $$2)).a(drp.c, nm.a().a(nn.c, $$3)));
   }

   public void a(dde $$0) {
      this.b($$0, nw.a);
   }

   public void b(dde $$0, nw.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dde $$0, nu $$1, ns $$2) {
      akh $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nd.b h(dde $$0) {
      nw $$1 = this.g.getOrDefault($$0, nw.a.get($$0));
      return new nd.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dde $$0, dde $$1, dde $$2) {
      nu $$3 = nu.u($$0);
      akh $$4 = nt.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.q());
      this.c($$2);
   }

   void i(dde $$0) {
      nu $$1 = nu.t($$0);
      akh $$2 = nt.v.a($$0, $$1, this.c);
      akh $$3 = nt.w.a($$0, $$1, this.c);
      akh $$4 = nt.x.a($$0, $$1, this.c);
      akh $$5 = nt.y.a($$0, $$1, this.c);
      akh $$6 = nt.z.a($$0, $$1, this.c);
      akh $$7 = nt.A.a($$0, $$1, this.c);
      akh $$8 = nt.B.a($$0, $$1, this.c);
      akh $$9 = nt.C.a($$0, $$1, this.c);
      this.a($$0.q());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dde $$0, dde $$1) {
      akh $$2 = nt.v.a($$0);
      akh $$3 = nt.w.a($$0);
      akh $$4 = nt.x.a($$0);
      akh $$5 = nt.y.a($$0);
      akh $$6 = nt.z.a($$0);
      akh $$7 = nt.A.a($$0);
      akh $$8 = nt.B.a($$0);
      akh $$9 = nt.C.a($$0);
      this.a($$1, nr.a($$0.q()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dde $$0) {
      nu $$1 = nu.b($$0);
      akh $$2 = nt.ak.a($$0, $$1, this.c);
      akh $$3 = nt.al.a($$0, $$1, this.c);
      akh $$4 = nt.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dde $$0) {
      nu $$1 = nu.b($$0);
      akh $$2 = nt.ah.a($$0, $$1, this.c);
      akh $$3 = nt.ai.a($$0, $$1, this.c);
      akh $$4 = nt.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dde $$0, dde $$1) {
      akh $$2 = nt.ah.a($$0);
      akh $$3 = nt.ai.a($$0);
      akh $$4 = nt.aj.a($$0);
      this.a($$1, nr.a($$0.q()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(ddg.sD);
      akh $$0 = nr.a(ddg.sD);
      akh $$1 = nr.a(ddg.sD, "_partial_tilt");
      akh $$2 = nr.a(ddg.sD, "_full_tilt");
      this.b
         .accept(
            nj.a(ddg.sD)
               .a(b())
               .a(nk.a(dqx.bl).a(drs.a, nm.a().a(nn.c, $$0)).a(drs.b, nm.a().a(nn.c, $$0)).a(drs.c, nm.a().a(nn.c, $$1)).a(drs.d, nm.a().a(nn.c, $$2)))
         );
   }

   private nd.f l(dde $$0) {
      return new nd.f(nu.n($$0));
   }

   private void m(dde $$0) {
      this.c($$0, $$0);
   }

   private void c(dde $$0, dde $$1) {
      this.b.accept(c($$0, nr.a($$1)));
   }

   private void a(dde $$0, nd.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dde $$0, nd.e $$1, nu $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dde $$0, nd.e $$1) {
      nu $$2 = nu.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dde $$0, nd.e $$1, nu $$2) {
      akh $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dde $$0, nd.e $$1, drk<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         nk $$4 = nk.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            nu $$5 = nu.c(nu.a($$0, $$4x));
            akh $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return nm.a().a(nn.c, $$6);
         });
         this.a($$0.q());
         this.b.accept(nj.a($$0).a($$4));
      }
   }

   private void a(dde $$0, dde $$1, nd.e $$2) {
      this.a($$0, $$2);
      nu $$3 = nu.d($$0);
      akh $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dde $$0, dde $$1) {
      nw $$2 = nw.p.get($$0);
      akh $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akh $$4 = nt.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nj.a($$1, nm.a().a(nn.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dde $$0, dde $$1) {
      this.a($$0.q());
      nu $$2 = nu.h($$0);
      nu $$3 = nu.a($$0, $$1);
      akh $$4 = nt.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nj.a($$1, nm.a().a(nn.c, $$4))
               .a(nk.a(dqx.R).a(is.e, nm.a()).a(is.d, nm.a().a(nn.b, nn.a.d)).a(is.c, nm.a().a(nn.b, nn.a.b)).a(is.f, nm.a().a(nn.b, nn.a.c)))
         );
      this.b.accept(nj.a($$0).a(nk.a(dqx.av).a($$2x -> nm.a().a(nn.c, nt.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dde $$0 = ddg.kC;
      this.a($$0.q());
      akh $$1 = nr.a($$0, "_top");
      akh $$2 = nr.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dde $$0 = ddg.kB;
      this.a($$0.q());
      nk $$1 = nk.a(dit.d, dqx.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> nm.a().a(nn.c, nr.a($$0, "_top_stage_" + $$1x));
            case b -> nm.a().a(nn.c, nr.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nj.a($$0).a($$1));
   }

   private void a(dde $$0, dde $$1, dde $$2, dde $$3, dde $$4, dde $$5, dde $$6, dde $$7) {
      this.a($$0, nd.e.b);
      this.a($$1, nd.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dde $$0, nd.e $$1) {
      this.a($$0, "_top");
      akh $$2 = this.a($$0, "_top", $$1.a(), nu::c);
      akh $$3 = this.a($$0, "_bottom", $$1.a(), nu::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(ddg.iD, "_front");
      akh $$0 = nr.a(ddg.iD, "_top");
      akh $$1 = this.a(ddg.iD, "_bottom", nd.e.b.a(), nu::c);
      this.f(ddg.iD, $$0, $$1);
   }

   private void k() {
      akh $$0 = this.a(ddg.bx, "_top", nt.bk, nu::a);
      akh $$1 = this.a(ddg.bx, "_bottom", nt.bk, nu::a);
      this.f(ddg.bx, $$0, $$1);
   }

   private void l() {
      this.c(ddg.sF);
      akh $$0 = nr.a(ddg.sF, "_top");
      akh $$1 = nr.a(ddg.sF, "_bottom");
      this.b.accept(nj.a(ddg.sF).a(b()).a(nk.a(dqx.ae).a(drd.b, nm.a().a(nn.c, $$1)).a(drd.a, nm.a().a(nn.c, $$0))));
   }

   private void f(dde $$0, akh $$1, akh $$2) {
      this.b.accept(nj.a($$0).a(nk.a(dqx.ae).a(drd.b, nm.a().a(nn.c, $$2)).a(drd.a, nm.a().a(nn.c, $$1))));
   }

   private void n(dde $$0) {
      nu $$1 = nu.e($$0);
      nu $$2 = nu.e(nu.a($$0, "_corner"));
      akh $$3 = nt.as.a($$0, $$1, this.c);
      akh $$4 = nt.at.a($$0, $$2, this.c);
      akh $$5 = nt.au.a($$0, $$1, this.c);
      akh $$6 = nt.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nj.a($$0)
               .a(
                  nk.a(dqx.ag)
                     .a(drl.a, nm.a().a(nn.c, $$3))
                     .a(drl.b, nm.a().a(nn.c, $$3).a(nn.b, nn.a.b))
                     .a(drl.c, nm.a().a(nn.c, $$5).a(nn.b, nn.a.b))
                     .a(drl.d, nm.a().a(nn.c, $$6).a(nn.b, nn.a.b))
                     .a(drl.e, nm.a().a(nn.c, $$5))
                     .a(drl.f, nm.a().a(nn.c, $$6))
                     .a(drl.g, nm.a().a(nn.c, $$4))
                     .a(drl.h, nm.a().a(nn.c, $$4).a(nn.b, nn.a.b))
                     .a(drl.i, nm.a().a(nn.c, $$4).a(nn.b, nn.a.c))
                     .a(drl.j, nm.a().a(nn.c, $$4).a(nn.b, nn.a.d))
               )
         );
   }

   private void o(dde $$0) {
      akh $$1 = this.a($$0, "", nt.as, nu::e);
      akh $$2 = this.a($$0, "", nt.au, nu::e);
      akh $$3 = this.a($$0, "", nt.av, nu::e);
      akh $$4 = this.a($$0, "_on", nt.as, nu::e);
      akh $$5 = this.a($$0, "_on", nt.au, nu::e);
      akh $$6 = this.a($$0, "_on", nt.av, nu::e);
      nk $$7 = nk.a(dqx.w, dqx.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return nm.a().a(nn.c, $$6x ? $$4 : $$1);
            case b:
               return nm.a().a(nn.c, $$6x ? $$4 : $$1).a(nn.b, nn.a.b);
            case c:
               return nm.a().a(nn.c, $$6x ? $$5 : $$2).a(nn.b, nn.a.b);
            case d:
               return nm.a().a(nn.c, $$6x ? $$6 : $$3).a(nn.b, nn.a.b);
            case e:
               return nm.a().a(nn.c, $$6x ? $$5 : $$2);
            case f:
               return nm.a().a(nn.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(nj.a($$0).a($$7));
   }

   private nd.a a(akh $$0, dde $$1) {
      return new nd.a($$0, $$1);
   }

   private nd.a f(dde $$0, dde $$1) {
      return new nd.a(nr.a($$0), $$1);
   }

   private void a(dde $$0, csu $$1) {
      akh $$2 = nt.aa.a($$0, nu.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dde $$0, akh $$1) {
      akh $$2 = nt.aa.a($$0, nu.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dde $$0, dde $$1) {
      this.a($$0);
      akh $$2 = nw.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dde $$0) {
      this.a($$0.q());
      akh $$1 = nw.k.create($$0, this.c);
      akh $$2 = nw.l.create($$0, this.c);
      akh $$3 = nw.m.create($$0, this.c);
      akh $$4 = nw.n.create($$0, this.c);
      this.b
         .accept(
            ni.a($$0)
               .a(nh.a().a(dqx.S, 1, 2, 3, 4).a(dqx.R, is.c), nm.a().a(nn.c, $$1))
               .a(nh.a().a(dqx.S, 1, 2, 3, 4).a(dqx.R, is.f), nm.a().a(nn.c, $$1).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.S, 1, 2, 3, 4).a(dqx.R, is.d), nm.a().a(nn.c, $$1).a(nn.b, nn.a.c))
               .a(nh.a().a(dqx.S, 1, 2, 3, 4).a(dqx.R, is.e), nm.a().a(nn.c, $$1).a(nn.b, nn.a.d))
               .a(nh.a().a(dqx.S, 2, 3, 4).a(dqx.R, is.c), nm.a().a(nn.c, $$2))
               .a(nh.a().a(dqx.S, 2, 3, 4).a(dqx.R, is.f), nm.a().a(nn.c, $$2).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.S, 2, 3, 4).a(dqx.R, is.d), nm.a().a(nn.c, $$2).a(nn.b, nn.a.c))
               .a(nh.a().a(dqx.S, 2, 3, 4).a(dqx.R, is.e), nm.a().a(nn.c, $$2).a(nn.b, nn.a.d))
               .a(nh.a().a(dqx.S, 3, 4).a(dqx.R, is.c), nm.a().a(nn.c, $$3))
               .a(nh.a().a(dqx.S, 3, 4).a(dqx.R, is.f), nm.a().a(nn.c, $$3).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.S, 3, 4).a(dqx.R, is.d), nm.a().a(nn.c, $$3).a(nn.b, nn.a.c))
               .a(nh.a().a(dqx.S, 3, 4).a(dqx.R, is.e), nm.a().a(nn.c, $$3).a(nn.b, nn.a.d))
               .a(nh.a().a(dqx.S, 4).a(dqx.R, is.c), nm.a().a(nn.c, $$4))
               .a(nh.a().a(dqx.S, 4).a(dqx.R, is.f), nm.a().a(nn.c, $$4).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.S, 4).a(dqx.R, is.d), nm.a().a(nn.c, $$4).a(nn.b, nn.a.c))
               .a(nh.a().a(dqx.S, 4).a(dqx.R, is.e), nm.a().a(nn.c, $$4).a(nn.b, nn.a.d))
         );
   }

   private void a(nw.a $$0, dde... $$1) {
      for (dde $$2 : $$1) {
         akh $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(nw.a $$0, dde... $$1) {
      for (dde $$2 : $$1) {
         akh $$3 = $$0.create($$2, this.c);
         this.b.accept(nj.a($$2, nm.a().a(nn.c, $$3)).a(c()));
      }
   }

   private void h(dde $$0, dde $$1) {
      this.a($$0);
      nu $$2 = nu.b($$0, $$1);
      akh $$3 = nt.aI.a($$1, $$2, this.c);
      akh $$4 = nt.aJ.a($$1, $$2, this.c);
      akh $$5 = nt.aK.a($$1, $$2, this.c);
      akh $$6 = nt.aG.a($$1, $$2, this.c);
      akh $$7 = nt.aH.a($$1, $$2, this.c);
      csu $$8 = $$1.q();
      nt.bx.a(nr.a($$8), nu.F($$0), this.c);
      this.b
         .accept(
            ni.a($$1)
               .a(nm.a().a(nn.c, $$3))
               .a(nh.a().a(dqx.L, true), nm.a().a(nn.c, $$4))
               .a(nh.a().a(dqx.M, true), nm.a().a(nn.c, $$4).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.N, true), nm.a().a(nn.c, $$5))
               .a(nh.a().a(dqx.O, true), nm.a().a(nn.c, $$5).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.L, false), nm.a().a(nn.c, $$6))
               .a(nh.a().a(dqx.M, false), nm.a().a(nn.c, $$7))
               .a(nh.a().a(dqx.N, false), nm.a().a(nn.c, $$7).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.O, false), nm.a().a(nn.c, $$6).a(nn.b, nn.a.d))
         );
   }

   private void q(dde $$0) {
      nu $$1 = nu.z($$0);
      akh $$2 = nt.aL.a($$0, $$1, this.c);
      akh $$3 = this.a($$0, "_conditional", nt.aL, $$1x -> $$1.c(nv.i, $$1x));
      this.b.accept(nj.a($$0).a(a(dqx.c, $$3, $$2)).a(e()));
   }

   private void r(dde $$0) {
      akh $$1 = nw.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<nm> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> nm.a().a(nn.c, nr.a(ddg.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(ddg.mZ);
      this.b
         .accept(
            ni.a(ddg.mZ)
               .a(nh.a().a(dqx.aq, 0), this.a(0))
               .a(nh.a().a(dqx.aq, 1), this.a(1))
               .a(nh.a().a(dqx.bk, dqt.b), nm.a().a(nn.c, nr.a(ddg.mZ, "_small_leaves")))
               .a(nh.a().a(dqx.bk, dqt.c), nm.a().a(nn.c, nr.a(ddg.mZ, "_large_leaves")))
         );
   }

   private nk n() {
      return nk.a(dqx.P)
         .a(is.a, nm.a().a(nn.a, nn.a.c))
         .a(is.b, nm.a())
         .a(is.c, nm.a().a(nn.a, nn.a.b))
         .a(is.d, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.c))
         .a(is.e, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.d))
         .a(is.f, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.b));
   }

   private void o() {
      akh $$0 = nu.a(ddg.nU, "_top_open");
      this.b
         .accept(
            nj.a(ddg.nU)
               .a(this.n())
               .a(
                  nk.a(dqx.u)
                     .a(false, nm.a().a(nn.c, nw.f.create(ddg.nU, this.c)))
                     .a(true, nm.a().a(nn.c, nw.f.get(ddg.nU).a($$1 -> $$1.a(nv.f, $$0)).a(ddg.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nk a(drk<T> $$0, T $$1, akh $$2, akh $$3) {
      nm $$4 = nm.a().a(nn.c, $$2);
      nm $$5 = nm.a().a(nn.c, $$3);
      return nk.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dde $$0, Function<dde, nu> $$1) {
      nu $$2 = $$1.apply($$0).b(nv.i, nv.c);
      nu $$3 = $$2.c(nv.g, nu.a($$0, "_front_honey"));
      akh $$4 = nt.q.a($$0, $$2, this.c);
      akh $$5 = nt.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nj.a($$0).a(b()).a(a(dqx.aN, 5, $$5, $$4)));
   }

   private void a(dde $$0, drk<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akh> $$3 = new Int2ObjectOpenHashMap();
         nk $$4 = nk.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akh $$5 = (akh)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, nt.aV, nu::g));
            return nm.a().a(nn.c, $$5);
         });
         this.a($$0.q());
         this.b.accept(nj.a($$0).a($$4));
      }
   }

   private void p() {
      akh $$0 = nr.a(ddg.od, "_floor");
      akh $$1 = nr.a(ddg.od, "_ceiling");
      akh $$2 = nr.a(ddg.od, "_wall");
      akh $$3 = nr.a(ddg.od, "_between_walls");
      this.a(ctc.wo);
      this.b
         .accept(
            nj.a(ddg.od)
               .a(
                  nk.a(dqx.R, dqx.V)
                     .a(is.c, dqv.a, nm.a().a(nn.c, $$0))
                     .a(is.d, dqv.a, nm.a().a(nn.c, $$0).a(nn.b, nn.a.c))
                     .a(is.f, dqv.a, nm.a().a(nn.c, $$0).a(nn.b, nn.a.b))
                     .a(is.e, dqv.a, nm.a().a(nn.c, $$0).a(nn.b, nn.a.d))
                     .a(is.c, dqv.b, nm.a().a(nn.c, $$1))
                     .a(is.d, dqv.b, nm.a().a(nn.c, $$1).a(nn.b, nn.a.c))
                     .a(is.f, dqv.b, nm.a().a(nn.c, $$1).a(nn.b, nn.a.b))
                     .a(is.e, dqv.b, nm.a().a(nn.c, $$1).a(nn.b, nn.a.d))
                     .a(is.c, dqv.c, nm.a().a(nn.c, $$2).a(nn.b, nn.a.d))
                     .a(is.d, dqv.c, nm.a().a(nn.c, $$2).a(nn.b, nn.a.b))
                     .a(is.f, dqv.c, nm.a().a(nn.c, $$2))
                     .a(is.e, dqv.c, nm.a().a(nn.c, $$2).a(nn.b, nn.a.c))
                     .a(is.d, dqv.d, nm.a().a(nn.c, $$3).a(nn.b, nn.a.b))
                     .a(is.c, dqv.d, nm.a().a(nn.c, $$3).a(nn.b, nn.a.d))
                     .a(is.f, dqv.d, nm.a().a(nn.c, $$3))
                     .a(is.e, dqv.d, nm.a().a(nn.c, $$3).a(nn.b, nn.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nj.a(ddg.nZ, nm.a().a(nn.c, nr.a(ddg.nZ)))
               .a(
                  nk.a(dqx.U, dqx.R)
                     .a(dqs.a, is.c, nm.a())
                     .a(dqs.a, is.f, nm.a().a(nn.b, nn.a.b))
                     .a(dqs.a, is.d, nm.a().a(nn.b, nn.a.c))
                     .a(dqs.a, is.e, nm.a().a(nn.b, nn.a.d))
                     .a(dqs.b, is.c, nm.a().a(nn.a, nn.a.b))
                     .a(dqs.b, is.f, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.b))
                     .a(dqs.b, is.d, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.c))
                     .a(dqs.b, is.e, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.d))
                     .a(dqs.c, is.d, nm.a().a(nn.a, nn.a.c))
                     .a(dqs.c, is.e, nm.a().a(nn.a, nn.a.c).a(nn.b, nn.a.b))
                     .a(dqs.c, is.c, nm.a().a(nn.a, nn.a.c).a(nn.b, nn.a.c))
                     .a(dqs.c, is.f, nm.a().a(nn.a, nn.a.c).a(nn.b, nn.a.d))
               )
         );
   }

   private void d(dde $$0, nw.a $$1) {
      akh $$2 = $$1.create($$0, this.c);
      akh $$3 = nu.a($$0, "_front_on");
      akh $$4 = $$1.get($$0).a($$1x -> $$1x.a(nv.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nj.a($$0).a(a(dqx.r, $$4, $$2)).a(b()));
   }

   private void a(dde... $$0) {
      akh $$1 = nr.a("campfire_off");

      for (dde $$2 : $$0) {
         akh $$3 = nt.bc.a($$2, nu.E($$2), this.c);
         this.a($$2.q());
         this.b.accept(nj.a($$2).a(a(dqx.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dde $$0) {
      akh $$1 = nt.bt.a($$0, nu.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dde $$0) {
      akh $$1;
      if ($$0 == ddg.tj) {
         $$1 = nt.bv.a($$0, nu.m($$0), this.c);
      } else {
         $$1 = nt.bu.a($$0, nu.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      nu $$0 = nu.a(nu.G(ddg.cl), nu.G(ddg.n));
      akh $$1 = nt.j.a(ddg.cl, $$0, this.c);
      this.b.accept(c(ddg.cl, $$1));
   }

   private void s() {
      this.a(ctc.lH);
      this.b
         .accept(
            ni.a(ddg.cw)
               .a(
                  nh.b(
                     nh.a().a(dqx.ab, drm.c).a(dqx.aa, drm.c).a(dqx.ac, drm.c).a(dqx.ad, drm.c),
                     nh.a().a(dqx.ab, drm.b, drm.a).a(dqx.aa, drm.b, drm.a),
                     nh.a().a(dqx.aa, drm.b, drm.a).a(dqx.ac, drm.b, drm.a),
                     nh.a().a(dqx.ac, drm.b, drm.a).a(dqx.ad, drm.b, drm.a),
                     nh.a().a(dqx.ad, drm.b, drm.a).a(dqx.ab, drm.b, drm.a)
                  ),
                  nm.a().a(nn.c, nr.a("redstone_dust_dot"))
               )
               .a(nh.a().a(dqx.ab, drm.b, drm.a), nm.a().a(nn.c, nr.a("redstone_dust_side0")))
               .a(nh.a().a(dqx.ac, drm.b, drm.a), nm.a().a(nn.c, nr.a("redstone_dust_side_alt0")))
               .a(nh.a().a(dqx.aa, drm.b, drm.a), nm.a().a(nn.c, nr.a("redstone_dust_side_alt1")).a(nn.b, nn.a.d))
               .a(nh.a().a(dqx.ad, drm.b, drm.a), nm.a().a(nn.c, nr.a("redstone_dust_side1")).a(nn.b, nn.a.d))
               .a(nh.a().a(dqx.ab, drm.a), nm.a().a(nn.c, nr.a("redstone_dust_up")))
               .a(nh.a().a(dqx.aa, drm.a), nm.a().a(nn.c, nr.a("redstone_dust_up")).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.ac, drm.a), nm.a().a(nn.c, nr.a("redstone_dust_up")).a(nn.b, nn.a.c))
               .a(nh.a().a(dqx.ad, drm.a), nm.a().a(nn.c, nr.a("redstone_dust_up")).a(nn.b, nn.a.d))
         );
   }

   private void t() {
      this.a(ctc.lL);
      this.b
         .accept(
            nj.a(ddg.gY)
               .a(c())
               .a(
                  nk.a(dqx.bd, dqx.w)
                     .a(dra.a, false, nm.a().a(nn.c, nr.a(ddg.gY)))
                     .a(dra.a, true, nm.a().a(nn.c, nr.a(ddg.gY, "_on")))
                     .a(dra.b, false, nm.a().a(nn.c, nr.a(ddg.gY, "_subtract")))
                     .a(dra.b, true, nm.a().a(nn.c, nr.a(ddg.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      nu $$0 = nu.a(ddg.jR);
      nu $$1 = nu.a(nu.a(ddg.jE, "_side"), $$0.a(nv.f));
      akh $$2 = nt.ab.a(ddg.jE, $$1, this.c);
      akh $$3 = nt.ac.a(ddg.jE, $$1, this.c);
      akh $$4 = nt.j.b(ddg.jE, "_double", $$1, this.c);
      this.b.accept(e(ddg.jE, $$2, $$3, $$4));
      this.b.accept(c(ddg.jR, nt.c.a(ddg.jR, $$0, this.c)));
   }

   private void v() {
      this.a(ctc.sq);
      this.b
         .accept(
            ni.a(ddg.fs)
               .a(nm.a().a(nn.c, nu.G(ddg.fs)))
               .a(nh.a().a(dqx.k, true), nm.a().a(nn.c, nu.a(ddg.fs, "_bottle0")))
               .a(nh.a().a(dqx.l, true), nm.a().a(nn.c, nu.a(ddg.fs, "_bottle1")))
               .a(nh.a().a(dqx.m, true), nm.a().a(nn.c, nu.a(ddg.fs, "_bottle2")))
               .a(nh.a().a(dqx.k, false), nm.a().a(nn.c, nu.a(ddg.fs, "_empty0")))
               .a(nh.a().a(dqx.l, false), nm.a().a(nn.c, nu.a(ddg.fs, "_empty1")))
               .a(nh.a().a(dqx.m, false), nm.a().a(nn.c, nu.a(ddg.fs, "_empty2")))
         );
   }

   private void u(dde $$0) {
      akh $$1 = nt.bp.a($$0, nu.b($$0), this.c);
      akh $$2 = nr.a("mushroom_block_inside");
      this.b
         .accept(
            ni.a($$0)
               .a(nh.a().a(dqx.L, true), nm.a().a(nn.c, $$1))
               .a(nh.a().a(dqx.M, true), nm.a().a(nn.c, $$1).a(nn.b, nn.a.b).a(nn.d, true))
               .a(nh.a().a(dqx.N, true), nm.a().a(nn.c, $$1).a(nn.b, nn.a.c).a(nn.d, true))
               .a(nh.a().a(dqx.O, true), nm.a().a(nn.c, $$1).a(nn.b, nn.a.d).a(nn.d, true))
               .a(nh.a().a(dqx.J, true), nm.a().a(nn.c, $$1).a(nn.a, nn.a.d).a(nn.d, true))
               .a(nh.a().a(dqx.K, true), nm.a().a(nn.c, $$1).a(nn.a, nn.a.b).a(nn.d, true))
               .a(nh.a().a(dqx.L, false), nm.a().a(nn.c, $$2))
               .a(nh.a().a(dqx.M, false), nm.a().a(nn.c, $$2).a(nn.b, nn.a.b).a(nn.d, false))
               .a(nh.a().a(dqx.N, false), nm.a().a(nn.c, $$2).a(nn.b, nn.a.c).a(nn.d, false))
               .a(nh.a().a(dqx.O, false), nm.a().a(nn.c, $$2).a(nn.b, nn.a.d).a(nn.d, false))
               .a(nh.a().a(dqx.J, false), nm.a().a(nn.c, $$2).a(nn.a, nn.a.d).a(nn.d, false))
               .a(nh.a().a(dqx.K, false), nm.a().a(nn.c, $$2).a(nn.a, nn.a.b).a(nn.d, false))
         );
      this.a($$0, nw.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(ctc.rB);
      this.b
         .accept(
            nj.a(ddg.eg)
               .a(
                  nk.a(dqx.ay)
                     .a(0, nm.a().a(nn.c, nr.a(ddg.eg)))
                     .a(1, nm.a().a(nn.c, nr.a(ddg.eg, "_slice1")))
                     .a(2, nm.a().a(nn.c, nr.a(ddg.eg, "_slice2")))
                     .a(3, nm.a().a(nn.c, nr.a(ddg.eg, "_slice3")))
                     .a(4, nm.a().a(nn.c, nr.a(ddg.eg, "_slice4")))
                     .a(5, nm.a().a(nn.c, nr.a(ddg.eg, "_slice5")))
                     .a(6, nm.a().a(nn.c, nr.a(ddg.eg, "_slice6")))
               )
         );
   }

   private void x() {
      nu $$0 = new nu()
         .a(nv.c, nu.a(ddg.nX, "_side3"))
         .a(nv.o, nu.G(ddg.t))
         .a(nv.n, nu.a(ddg.nX, "_top"))
         .a(nv.j, nu.a(ddg.nX, "_side3"))
         .a(nv.l, nu.a(ddg.nX, "_side3"))
         .a(nv.k, nu.a(ddg.nX, "_side1"))
         .a(nv.m, nu.a(ddg.nX, "_side2"));
      this.b.accept(c(ddg.nX, nt.a.a(ddg.nX, $$0, this.c)));
   }

   private void y() {
      nu $$0 = new nu()
         .a(nv.c, nu.a(ddg.ob, "_front"))
         .a(nv.o, nu.a(ddg.ob, "_bottom"))
         .a(nv.n, nu.a(ddg.ob, "_top"))
         .a(nv.j, nu.a(ddg.ob, "_front"))
         .a(nv.k, nu.a(ddg.ob, "_front"))
         .a(nv.l, nu.a(ddg.ob, "_side"))
         .a(nv.m, nu.a(ddg.ob, "_side"));
      this.b.accept(c(ddg.ob, nt.a.a(ddg.ob, $$0, this.c)));
   }

   private void a(dde $$0, dde $$1, BiFunction<dde, dde, nu> $$2) {
      nu $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, nt.a.a($$0, $$3, this.c)));
   }

   public void b(dde $$0) {
      nu $$1 = new nu()
         .a(nv.c, nu.a($$0, "_particle"))
         .a(nv.o, nu.a($$0, "_down"))
         .a(nv.n, nu.a($$0, "_up"))
         .a(nv.j, nu.a($$0, "_north"))
         .a(nv.k, nu.a($$0, "_south"))
         .a(nv.l, nu.a($$0, "_east"))
         .a(nv.m, nu.a($$0, "_west"));
      this.b.accept(c($$0, nt.a.a($$0, $$1, this.c)));
   }

   private void z() {
      nu $$0 = nu.k(ddg.eZ);
      this.b.accept(c(ddg.eZ, nr.a(ddg.eZ)));
      this.a(ddg.ee, $$0);
      this.a(ddg.ef, $$0);
   }

   private void a(dde $$0, nu $$1) {
      akh $$2 = nt.p.a($$0, $$1.c(nv.g, nu.G($$0)), this.c);
      this.b.accept(nj.a($$0, nm.a().a(nn.c, $$2)).a(b()));
   }

   private void A() {
      this.a(ctc.sr);
      this.m(ddg.ft);
      this.b.accept(c(ddg.fv, nt.bs.a(ddg.fv, nu.j(nu.a(ddg.H, "_still")), this.c)));
      this.b
         .accept(
            nj.a(ddg.fu)
               .a(
                  nk.a(dhn.g)
                     .a(1, nm.a().a(nn.c, nt.bq.a(ddg.fu, "_level1", nu.j(nu.a(ddg.G, "_still")), this.c)))
                     .a(2, nm.a().a(nn.c, nt.br.a(ddg.fu, "_level2", nu.j(nu.a(ddg.G, "_still")), this.c)))
                     .a(3, nm.a().a(nn.c, nt.bs.a(ddg.fu, "_full", nu.j(nu.a(ddg.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nj.a(ddg.fw)
               .a(
                  nk.a(dhn.g)
                     .a(1, nm.a().a(nn.c, nt.bq.a(ddg.fw, "_level1", nu.j(nu.G(ddg.qP)), this.c)))
                     .a(2, nm.a().a(nn.c, nt.br.a(ddg.fw, "_level2", nu.j(nu.G(ddg.qP)), this.c)))
                     .a(3, nm.a().a(nn.c, nt.bs.a(ddg.fw, "_full", nu.j(nu.G(ddg.qP)), this.c)))
               )
         );
   }

   private void B() {
      nu $$0 = nu.b(ddg.kv);
      akh $$1 = nt.aE.a(ddg.kv, $$0, this.c);
      akh $$2 = this.a(ddg.kv, "_dead", nt.aE, $$1x -> $$0.c(nv.b, $$1x));
      this.b.accept(nj.a(ddg.kv).a(a(dqx.au, 5, $$2, $$1)));
   }

   private void C() {
      akh $$0 = nr.a(ddg.tq);
      akh $$1 = nr.a(ddg.tq, "_triggered");
      akh $$2 = nr.a(ddg.tq, "_crafting");
      akh $$3 = nr.a(ddg.tq, "_crafting_triggered");
      this.b
         .accept(
            nj.a(ddg.tq)
               .a(nk.a(dqx.T).a($$0x -> this.a($$0x, nm.a())))
               .a(
                  nk.a(dqx.A, dex.b)
                     .a(false, false, nm.a().a(nn.c, $$0))
                     .a(true, true, nm.a().a(nn.c, $$3))
                     .a(true, false, nm.a().a(nn.c, $$1))
                     .a(false, true, nm.a().a(nn.c, $$2))
               )
         );
   }

   private void v(dde $$0) {
      nu $$1 = new nu().a(nv.f, nu.a(ddg.cD, "_top")).a(nv.i, nu.a(ddg.cD, "_side")).a(nv.g, nu.a($$0, "_front"));
      nu $$2 = new nu().a(nv.i, nu.a(ddg.cD, "_top")).a(nv.g, nu.a($$0, "_front_vertical"));
      akh $$3 = nt.p.a($$0, $$1, this.c);
      akh $$4 = nt.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nj.a($$0)
               .a(
                  nk.a(dqx.P)
                     .a(is.a, nm.a().a(nn.c, $$4).a(nn.a, nn.a.c))
                     .a(is.b, nm.a().a(nn.c, $$4))
                     .a(is.c, nm.a().a(nn.c, $$3))
                     .a(is.f, nm.a().a(nn.c, $$3).a(nn.b, nn.a.b))
                     .a(is.d, nm.a().a(nn.c, $$3).a(nn.b, nn.a.c))
                     .a(is.e, nm.a().a(nn.c, $$3).a(nn.b, nn.a.d))
               )
         );
   }

   private void D() {
      akh $$0 = nr.a(ddg.fy);
      akh $$1 = nr.a(ddg.fy, "_filled");
      this.b.accept(nj.a(ddg.fy).a(nk.a(dqx.h).a(false, nm.a().a(nn.c, $$0)).a(true, nm.a().a(nn.c, $$1))).a(c()));
   }

   private void E() {
      akh $$0 = nr.a(ddg.ku, "_side");
      akh $$1 = nr.a(ddg.ku, "_noside");
      akh $$2 = nr.a(ddg.ku, "_noside1");
      akh $$3 = nr.a(ddg.ku, "_noside2");
      akh $$4 = nr.a(ddg.ku, "_noside3");
      this.b
         .accept(
            ni.a(ddg.ku)
               .a(nh.a().a(dqx.L, true), nm.a().a(nn.c, $$0))
               .a(nh.a().a(dqx.M, true), nm.a().a(nn.c, $$0).a(nn.b, nn.a.b).a(nn.d, true))
               .a(nh.a().a(dqx.N, true), nm.a().a(nn.c, $$0).a(nn.b, nn.a.c).a(nn.d, true))
               .a(nh.a().a(dqx.O, true), nm.a().a(nn.c, $$0).a(nn.b, nn.a.d).a(nn.d, true))
               .a(nh.a().a(dqx.J, true), nm.a().a(nn.c, $$0).a(nn.a, nn.a.d).a(nn.d, true))
               .a(nh.a().a(dqx.K, true), nm.a().a(nn.c, $$0).a(nn.a, nn.a.b).a(nn.d, true))
               .a(nh.a().a(dqx.L, false), nm.a().a(nn.c, $$1).a(nn.e, 2), nm.a().a(nn.c, $$2), nm.a().a(nn.c, $$3), nm.a().a(nn.c, $$4))
               .a(
                  nh.a().a(dqx.M, false),
                  nm.a().a(nn.c, $$2).a(nn.b, nn.a.b).a(nn.d, true),
                  nm.a().a(nn.c, $$3).a(nn.b, nn.a.b).a(nn.d, true),
                  nm.a().a(nn.c, $$4).a(nn.b, nn.a.b).a(nn.d, true),
                  nm.a().a(nn.c, $$1).a(nn.e, 2).a(nn.b, nn.a.b).a(nn.d, true)
               )
               .a(
                  nh.a().a(dqx.N, false),
                  nm.a().a(nn.c, $$3).a(nn.b, nn.a.c).a(nn.d, true),
                  nm.a().a(nn.c, $$4).a(nn.b, nn.a.c).a(nn.d, true),
                  nm.a().a(nn.c, $$1).a(nn.e, 2).a(nn.b, nn.a.c).a(nn.d, true),
                  nm.a().a(nn.c, $$2).a(nn.b, nn.a.c).a(nn.d, true)
               )
               .a(
                  nh.a().a(dqx.O, false),
                  nm.a().a(nn.c, $$4).a(nn.b, nn.a.d).a(nn.d, true),
                  nm.a().a(nn.c, $$1).a(nn.e, 2).a(nn.b, nn.a.d).a(nn.d, true),
                  nm.a().a(nn.c, $$2).a(nn.b, nn.a.d).a(nn.d, true),
                  nm.a().a(nn.c, $$3).a(nn.b, nn.a.d).a(nn.d, true)
               )
               .a(
                  nh.a().a(dqx.J, false),
                  nm.a().a(nn.c, $$1).a(nn.e, 2).a(nn.a, nn.a.d).a(nn.d, true),
                  nm.a().a(nn.c, $$4).a(nn.a, nn.a.d).a(nn.d, true),
                  nm.a().a(nn.c, $$2).a(nn.a, nn.a.d).a(nn.d, true),
                  nm.a().a(nn.c, $$3).a(nn.a, nn.a.d).a(nn.d, true)
               )
               .a(
                  nh.a().a(dqx.K, false),
                  nm.a().a(nn.c, $$4).a(nn.a, nn.a.b).a(nn.d, true),
                  nm.a().a(nn.c, $$3).a(nn.a, nn.a.b).a(nn.d, true),
                  nm.a().a(nn.c, $$2).a(nn.a, nn.a.b).a(nn.d, true),
                  nm.a().a(nn.c, $$1).a(nn.e, 2).a(nn.a, nn.a.b).a(nn.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            ni.a(ddg.pc)
               .a(nm.a().a(nn.c, nu.G(ddg.pc)))
               .a(nh.a().a(dqx.aL, 1), nm.a().a(nn.c, nu.a(ddg.pc, "_contents1")))
               .a(nh.a().a(dqx.aL, 2), nm.a().a(nn.c, nu.a(ddg.pc, "_contents2")))
               .a(nh.a().a(dqx.aL, 3), nm.a().a(nn.c, nu.a(ddg.pc, "_contents3")))
               .a(nh.a().a(dqx.aL, 4), nm.a().a(nn.c, nu.a(ddg.pc, "_contents4")))
               .a(nh.a().a(dqx.aL, 5), nm.a().a(nn.c, nu.a(ddg.pc, "_contents5")))
               .a(nh.a().a(dqx.aL, 6), nm.a().a(nn.c, nu.a(ddg.pc, "_contents6")))
               .a(nh.a().a(dqx.aL, 7), nm.a().a(nn.c, nu.a(ddg.pc, "_contents7")))
               .a(nh.a().a(dqx.aL, 8), nm.a().a(nn.c, nu.a(ddg.pc, "_contents_ready")))
         );
   }

   private void w(dde $$0) {
      akh $$1 = nt.c.a($$0, nu.a($$0), this.c);
      akh $$2 = this.a($$0, "_powered", nt.c, nu::b);
      akh $$3 = this.a($$0, "_lit", nt.c, nu::b);
      akh $$4 = this.a($$0, "_lit_powered", nt.c, nu::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private ng a(dde $$0, akh $$1, akh $$2, akh $$3, akh $$4) {
      return nj.a($$0).a(nk.a(dqx.r, dqx.w).a(($$4x, $$5) -> $$4x ? nm.a().a(nn.c, $$5 ? $$4 : $$2) : nm.a().a(nn.c, $$5 ? $$3 : $$1)));
   }

   private void i(dde $$0, dde $$1) {
      akh $$2 = nr.a($$0);
      akh $$3 = nr.a($$0, "_powered");
      akh $$4 = nr.a($$0, "_lit");
      akh $$5 = nr.a($$0, "_lit_powered");
      this.a($$1, nr.a($$0.q()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dde $$0) {
      this.c($$0);
      this.b.accept(nj.a($$0, nm.a().a(nn.c, nt.ao.a($$0, nu.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(ddg.qy);
      this.x(ddg.qx);
      this.x(ddg.qw);
      this.x(ddg.qv);
   }

   private void H() {
      this.c(ddg.st);
      nk.b<is, dre> $$0 = nk.a(dqx.bm, dqx.bn);

      for (dre $$1 : dre.values()) {
         $$0.a(is.b, $$1, this.a(is.b, $$1));
      }

      for (dre $$2 : dre.values()) {
         $$0.a(is.a, $$2, this.a(is.a, $$2));
      }

      this.b.accept(nj.a(ddg.st).a($$0));
   }

   private nm a(is $$0, dre $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      nu $$3 = nu.c(nu.a(ddg.st, $$2));
      return nm.a().a(nn.c, nt.an.a(ddg.st, $$2, $$3, this.c));
   }

   private void y(dde $$0) {
      nu $$1 = new nu().a(nv.e, nu.G(ddg.dV)).a(nv.f, nu.G($$0)).a(nv.i, nu.a($$0, "_side"));
      this.b.accept(c($$0, nt.n.a($$0, $$1, this.c)));
   }

   private void I() {
      akh $$0 = nu.a(ddg.gZ, "_side");
      nu $$1 = new nu().a(nv.f, nu.a(ddg.gZ, "_top")).a(nv.i, $$0);
      nu $$2 = new nu().a(nv.f, nu.a(ddg.gZ, "_inverted_top")).a(nv.i, $$0);
      this.b
         .accept(
            nj.a(ddg.gZ)
               .a(nk.a(dqx.p).a(false, nm.a().a(nn.c, nt.aF.a(ddg.gZ, $$1, this.c))).a(true, nm.a().a(nn.c, nt.aF.a(nr.a(ddg.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dde $$0) {
      this.b.accept(nj.a($$0, nm.a().a(nn.c, nr.a($$0))).a(this.n()));
   }

   private void J() {
      dde $$0 = ddg.ss;
      akh $$1 = nr.a($$0, "_on");
      akh $$2 = nr.a($$0);
      this.b.accept(nj.a($$0, nm.a().a(nn.c, nr.a($$0))).a(this.n()).a(a(dqx.w, $$1, $$2)));
   }

   private void K() {
      nu $$0 = new nu().a(nv.B, nu.G(ddg.j)).a(nv.f, nu.G(ddg.cC));
      nu $$1 = new nu().a(nv.B, nu.G(ddg.j)).a(nv.f, nu.a(ddg.cC, "_moist"));
      akh $$2 = nt.aW.a(ddg.cC, $$0, this.c);
      akh $$3 = nt.aW.a(nu.a(ddg.cC, "_moist"), $$1, this.c);
      this.b.accept(nj.a(ddg.cC).a(a(dqx.aQ, 7, $$3, $$2)));
   }

   private List<akh> A(dde $$0) {
      akh $$1 = nt.aX.a(nr.a($$0, "_floor0"), nu.v($$0), this.c);
      akh $$2 = nt.aX.a(nr.a($$0, "_floor1"), nu.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akh> B(dde $$0) {
      akh $$1 = nt.aY.a(nr.a($$0, "_side0"), nu.v($$0), this.c);
      akh $$2 = nt.aY.a(nr.a($$0, "_side1"), nu.w($$0), this.c);
      akh $$3 = nt.aZ.a(nr.a($$0, "_side_alt0"), nu.v($$0), this.c);
      akh $$4 = nt.aZ.a(nr.a($$0, "_side_alt1"), nu.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akh> C(dde $$0) {
      akh $$1 = nt.ba.a(nr.a($$0, "_up0"), nu.v($$0), this.c);
      akh $$2 = nt.ba.a(nr.a($$0, "_up1"), nu.w($$0), this.c);
      akh $$3 = nt.bb.a(nr.a($$0, "_up_alt0"), nu.v($$0), this.c);
      akh $$4 = nt.bb.a(nr.a($$0, "_up_alt1"), nu.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<nm> a(List<akh> $$0, UnaryOperator<nm> $$1) {
      return $$0.stream().map($$0x -> nm.a().a(nn.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nh $$0 = nh.a().a(dqx.L, false).a(dqx.M, false).a(dqx.N, false).a(dqx.O, false).a(dqx.J, false);
      List<akh> $$1 = this.A(ddg.cr);
      List<akh> $$2 = this.B(ddg.cr);
      List<akh> $$3 = this.C(ddg.cr);
      this.b
         .accept(
            ni.a(ddg.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nh.b(nh.a().a(dqx.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nh.b(nh.a().a(dqx.M, true), $$0), a($$2, $$0x -> $$0x.a(nn.b, nn.a.b)))
               .a(nh.b(nh.a().a(dqx.N, true), $$0), a($$2, $$0x -> $$0x.a(nn.b, nn.a.c)))
               .a(nh.b(nh.a().a(dqx.O, true), $$0), a($$2, $$0x -> $$0x.a(nn.b, nn.a.d)))
               .a(nh.a().a(dqx.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<akh> $$0 = this.A(ddg.cs);
      List<akh> $$1 = this.B(ddg.cs);
      this.b
         .accept(
            ni.a(ddg.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nn.b, nn.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nn.b, nn.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nn.b, nn.a.d)))
         );
   }

   private void D(dde $$0) {
      akh $$1 = nw.t.create($$0, this.c);
      akh $$2 = nw.u.create($$0, this.c);
      this.a($$0.q());
      this.b.accept(nj.a($$0).a(a(dqx.j, $$2, $$1)));
   }

   private void N() {
      nu $$0 = nu.a(nu.a(ddg.ad, "_side"), nu.a(ddg.ad, "_top"));
      akh $$1 = nt.j.a(ddg.ad, $$0, this.c);
      this.b.accept(d(ddg.ad, $$1));
   }

   private void O() {
      this.a(ctc.ad);
      dde $$0 = ddg.E;
      nk.b<Boolean, Integer> $$1 = nk.a(dhz.d, dhz.b);
      akh $$2 = nr.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akh $$4 = nr.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, nm.a().a(nn.c, $$4));
         $$1.a(false, $$3, nm.a().a(nn.c, $$2));
      }

      this.b.accept(nj.a(ddg.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nj.a(ddg.kI)
               .a(
                  nk.a(dqx.as)
                     .a(0, nm.a().a(nn.c, this.a(ddg.kI, "_0", nt.c, nu::b)))
                     .a(1, nm.a().a(nn.c, this.a(ddg.kI, "_1", nt.c, nu::b)))
                     .a(2, nm.a().a(nn.c, this.a(ddg.kI, "_2", nt.c, nu::b)))
                     .a(3, nm.a().a(nn.c, this.a(ddg.kI, "_3", nt.c, nu::b)))
               )
         );
   }

   private void Q() {
      akh $$0 = nu.G(ddg.j);
      nu $$1 = new nu().a(nv.e, $$0).b(nv.e, nv.c).a(nv.f, nu.a(ddg.i, "_top")).a(nv.i, nu.a(ddg.i, "_snow"));
      nm $$2 = nm.a().a(nn.c, nt.n.a(ddg.i, "_snow", $$1, this.c));
      this.a(ddg.i, nr.a(ddg.i), $$2);
      akh $$3 = nw.f.get(ddg.fl).a($$1x -> $$1x.a(nv.e, $$0)).a(ddg.fl, this.c);
      this.a(ddg.fl, $$3, $$2);
      akh $$4 = nw.f.get(ddg.l).a($$1x -> $$1x.a(nv.e, $$0)).a(ddg.l, this.c);
      this.a(ddg.l, $$4, $$2);
   }

   private void a(dde $$0, akh $$1, nm $$2) {
      List<nm> $$3 = Arrays.asList(a($$1));
      this.b.accept(nj.a($$0).a(nk.a(dqx.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(ctc.rh);
      this.b
         .accept(
            nj.a(ddg.fC)
               .a(
                  nk.a(dqx.ar)
                     .a(0, nm.a().a(nn.c, nr.a(ddg.fC, "_stage0")))
                     .a(1, nm.a().a(nn.c, nr.a(ddg.fC, "_stage1")))
                     .a(2, nm.a().a(nn.c, nr.a(ddg.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(ddg.kE, nr.a(ddg.kE)));
   }

   private void j(dde $$0, dde $$1) {
      nu $$2 = nu.b($$1);
      akh $$3 = nt.Y.a($$0, $$2, this.c);
      akh $$4 = nt.Z.a($$0, $$2, this.c);
      this.b.accept(nj.a($$0).a(a(dqx.aT, 1, $$4, $$3)));
   }

   private void T() {
      akh $$0 = nr.a(ddg.hc);
      akh $$1 = nr.a(ddg.hc, "_side");
      this.a(ctc.lR);
      this.b
         .accept(
            nj.a(ddg.hc)
               .a(
                  nk.a(dqx.Q)
                     .a(is.a, nm.a().a(nn.c, $$0))
                     .a(is.c, nm.a().a(nn.c, $$1))
                     .a(is.f, nm.a().a(nn.c, $$1).a(nn.b, nn.a.b))
                     .a(is.d, nm.a().a(nn.c, $$1).a(nn.b, nn.a.c))
                     .a(is.e, nm.a().a(nn.c, $$1).a(nn.b, nn.a.d))
               )
         );
   }

   private void k(dde $$0, dde $$1) {
      akh $$2 = nr.a($$0);
      this.b.accept(nj.a($$1, nm.a().a(nn.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      akh $$0 = nr.a(ddg.eW, "_post_ends");
      akh $$1 = nr.a(ddg.eW, "_post");
      akh $$2 = nr.a(ddg.eW, "_cap");
      akh $$3 = nr.a(ddg.eW, "_cap_alt");
      akh $$4 = nr.a(ddg.eW, "_side");
      akh $$5 = nr.a(ddg.eW, "_side_alt");
      this.b
         .accept(
            ni.a(ddg.eW)
               .a(nm.a().a(nn.c, $$0))
               .a(nh.a().a(dqx.L, false).a(dqx.M, false).a(dqx.N, false).a(dqx.O, false), nm.a().a(nn.c, $$1))
               .a(nh.a().a(dqx.L, true).a(dqx.M, false).a(dqx.N, false).a(dqx.O, false), nm.a().a(nn.c, $$2))
               .a(nh.a().a(dqx.L, false).a(dqx.M, true).a(dqx.N, false).a(dqx.O, false), nm.a().a(nn.c, $$2).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.L, false).a(dqx.M, false).a(dqx.N, true).a(dqx.O, false), nm.a().a(nn.c, $$3))
               .a(nh.a().a(dqx.L, false).a(dqx.M, false).a(dqx.N, false).a(dqx.O, true), nm.a().a(nn.c, $$3).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.L, true), nm.a().a(nn.c, $$4))
               .a(nh.a().a(dqx.M, true), nm.a().a(nn.c, $$4).a(nn.b, nn.a.b))
               .a(nh.a().a(dqx.N, true), nm.a().a(nn.c, $$5))
               .a(nh.a().a(dqx.O, true), nm.a().a(nn.c, $$5).a(nn.b, nn.a.b))
         );
      this.d(ddg.eW);
   }

   private void E(dde $$0) {
      this.b.accept(nj.a($$0, nm.a().a(nn.c, nr.a($$0))).a(b()));
   }

   private void V() {
      akh $$0 = nr.a(ddg.dw);
      akh $$1 = nr.a(ddg.dw, "_on");
      this.d(ddg.dw);
      this.b
         .accept(
            nj.a(ddg.dw)
               .a(a(dqx.w, $$0, $$1))
               .a(
                  nk.a(dqx.U, dqx.R)
                     .a(dqs.c, is.c, nm.a().a(nn.a, nn.a.c).a(nn.b, nn.a.c))
                     .a(dqs.c, is.f, nm.a().a(nn.a, nn.a.c).a(nn.b, nn.a.d))
                     .a(dqs.c, is.d, nm.a().a(nn.a, nn.a.c))
                     .a(dqs.c, is.e, nm.a().a(nn.a, nn.a.c).a(nn.b, nn.a.b))
                     .a(dqs.a, is.c, nm.a())
                     .a(dqs.a, is.f, nm.a().a(nn.b, nn.a.b))
                     .a(dqs.a, is.d, nm.a().a(nn.b, nn.a.c))
                     .a(dqs.a, is.e, nm.a().a(nn.b, nn.a.d))
                     .a(dqs.b, is.c, nm.a().a(nn.a, nn.a.b))
                     .a(dqs.b, is.f, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.b))
                     .a(dqs.b, is.d, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.c))
                     .a(dqs.b, is.e, nm.a().a(nn.a, nn.a.b).a(nn.b, nn.a.d))
               )
         );
   }

   private void W() {
      this.d(ddg.fm);
      this.b.accept(b(ddg.fm, nr.a(ddg.fm)));
   }

   private void X() {
      this.d(ddg.tn);
      this.b.accept(c(ddg.tn, nr.a(ddg.tn)));
   }

   private void Y() {
      this.b.accept(nj.a(ddg.ed).a(nk.a(dqx.H).a(is.a.a, nm.a().a(nn.c, nr.a(ddg.ed, "_ns"))).a(is.a.c, nm.a().a(nn.c, nr.a(ddg.ed, "_ew")))));
   }

   private void Z() {
      akh $$0 = nw.a.create(ddg.dV, this.c);
      this.b
         .accept(
            nj.a(
               ddg.dV,
               nm.a().a(nn.c, $$0),
               nm.a().a(nn.c, $$0).a(nn.a, nn.a.b),
               nm.a().a(nn.c, $$0).a(nn.a, nn.a.c),
               nm.a().a(nn.c, $$0).a(nn.a, nn.a.d),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.b),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.b).a(nn.a, nn.a.b),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.b).a(nn.a, nn.a.c),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.b).a(nn.a, nn.a.d),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.c),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.c).a(nn.a, nn.a.b),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.c).a(nn.a, nn.a.c),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.c).a(nn.a, nn.a.d),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.d),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.d).a(nn.a, nn.a.b),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.d).a(nn.a, nn.a.c),
               nm.a().a(nn.c, $$0).a(nn.b, nn.a.d).a(nn.a, nn.a.d)
            )
         );
   }

   private void aa() {
      akh $$0 = nr.a(ddg.kO);
      akh $$1 = nr.a(ddg.kO, "_on");
      this.b.accept(nj.a(ddg.kO).a(a(dqx.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      nu $$0 = new nu().a(nv.e, nu.a(ddg.by, "_bottom")).a(nv.i, nu.a(ddg.by, "_side"));
      akh $$1 = nu.a(ddg.by, "_top_sticky");
      akh $$2 = nu.a(ddg.by, "_top");
      nu $$3 = $$0.c(nv.E, $$1);
      nu $$4 = $$0.c(nv.E, $$2);
      akh $$5 = nr.a(ddg.by, "_base");
      this.a(ddg.by, $$5, $$4);
      this.a(ddg.br, $$5, $$3);
      akh $$6 = nt.n.a(ddg.by, "_inventory", $$0.c(nv.f, $$2), this.c);
      akh $$7 = nt.n.a(ddg.br, "_inventory", $$0.c(nv.f, $$1), this.c);
      this.a(ddg.by, $$6);
      this.a(ddg.br, $$7);
   }

   private void a(dde $$0, akh $$1, nu $$2) {
      akh $$3 = nt.bh.a($$0, $$2, this.c);
      this.b.accept(nj.a($$0).a(a(dqx.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      nu $$0 = new nu().a(nv.F, nu.a(ddg.by, "_top")).a(nv.i, nu.a(ddg.by, "_side"));
      nu $$1 = $$0.c(nv.E, nu.a(ddg.by, "_top_sticky"));
      nu $$2 = $$0.c(nv.E, nu.a(ddg.by, "_top"));
      this.b
         .accept(
            nj.a(ddg.bz)
               .a(
                  nk.a(dqx.x, dqx.bg)
                     .a(false, drj.a, nm.a().a(nn.c, nt.bi.a(ddg.by, "_head", $$2, this.c)))
                     .a(false, drj.b, nm.a().a(nn.c, nt.bi.a(ddg.by, "_head_sticky", $$1, this.c)))
                     .a(true, drj.a, nm.a().a(nn.c, nt.bj.a(ddg.by, "_head_short", $$2, this.c)))
                     .a(true, drj.b, nm.a().a(nn.c, nt.bj.a(ddg.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dde $$0 = ddg.tr;
      nu $$1 = nu.a($$0, "_side_inactive", "_top_inactive");
      nu $$2 = nu.a($$0, "_side_active", "_top_active");
      nu $$3 = nu.a($$0, "_side_active", "_top_ejecting_reward");
      akh $$4 = nt.o.a($$0, $$1, this.c);
      akh $$5 = nt.o.a($$0, "_active", $$2, this.c);
      akh $$6 = nt.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(nj.a($$0).a(nk.a(dqx.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> nm.a().a(nn.c, $$4);
            case b, c, d -> nm.a().a(nn.c, $$5);
            case e -> nm.a().a(nn.c, $$6);
         };
      })));
   }

   private void ae() {
      dde $$0 = ddg.ts;
      nu $$1 = nu.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      nu $$2 = nu.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      nu $$3 = nu.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      nu $$4 = nu.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akh $$5 = nt.bN.a($$0, $$1, this.c);
      akh $$6 = nt.bN.a($$0, "_active", $$2, this.c);
      akh $$7 = nt.bN.a($$0, "_unlocking", $$3, this.c);
      akh $$8 = nt.bN.a($$0, "_ejecting_reward", $$4, this.c);
      this.a($$0, $$5);
      this.b.accept(nj.a($$0).a(b()).a(nk.a(dlz.b).a($$4x -> {
         return switch ($$4x) {
            case a -> nm.a().a(nn.c, $$5);
            case b -> nm.a().a(nn.c, $$6);
            case c -> nm.a().a(nn.c, $$7);
            case d -> nm.a().a(nn.c, $$8);
         };
      })));
   }

   private void af() {
      akh $$0 = nr.a(ddg.qQ, "_inactive");
      akh $$1 = nr.a(ddg.qQ, "_active");
      this.a(ddg.qQ, $$0);
      this.b.accept(nj.a(ddg.qQ).a(nk.a(dqx.bo).a($$2 -> nm.a().a(nn.c, $$2 != dro.b && $$2 != dro.c ? $$0 : $$1))));
   }

   private void ag() {
      akh $$0 = nr.a(ddg.qR, "_inactive");
      akh $$1 = nr.a(ddg.qR, "_active");
      this.a(ddg.qR, $$0);
      this.b.accept(nj.a(ddg.qR).a(nk.a(dqx.bo).a($$2 -> nm.a().a(nn.c, $$2 != dro.b && $$2 != dro.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      akh $$0 = nt.bM.a(ddg.qV, nu.a(false), this.c);
      akh $$1 = nt.bM.a(ddg.qV, "_can_summon", nu.a(true), this.c);
      this.a(ddg.qV, $$0);
      this.b.accept(nj.a(ddg.qV).a(a(dqx.G, $$1, $$0)));
   }

   private void ai() {
      akh $$0 = nr.a(ddg.nS, "_stable");
      akh $$1 = nr.a(ddg.nS, "_unstable");
      this.a(ddg.nS, $$0);
      this.b.accept(nj.a(ddg.nS).a(a(dqx.b, $$1, $$0)));
   }

   private void aj() {
      akh $$0 = this.a(ddg.sv, "", nt.ao, nu::c);
      akh $$1 = this.a(ddg.sv, "_lit", nt.ao, nu::c);
      this.b.accept(nj.a(ddg.sv).a(a(dqx.D, $$1, $$0)));
      akh $$2 = this.a(ddg.sw, "", nt.ao, nu::c);
      akh $$3 = this.a(ddg.sw, "_lit", nt.ao, nu::c);
      this.b.accept(nj.a(ddg.sw).a(a(dqx.D, $$3, $$2)));
   }

   private void ak() {
      akh $$0 = nw.a.create(ddg.fB, this.c);
      akh $$1 = this.a(ddg.fB, "_on", nt.c, nu::b);
      this.b.accept(nj.a(ddg.fB).a(a(dqx.r, $$1, $$0)));
   }

   private void l(dde $$0, dde $$1) {
      nu $$2 = nu.y($$0);
      this.b.accept(c($$0, nt.bf.a($$0, $$2, this.c)));
      this.b.accept(nj.a($$1, nm.a().a(nn.c, nt.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      nu $$0 = nu.y(ddg.dK);
      nu $$1 = nu.i(nu.a(ddg.dK, "_off"));
      akh $$2 = nt.bf.a(ddg.dK, $$0, this.c);
      akh $$3 = nt.bf.a(ddg.dK, "_off", $$1, this.c);
      this.b.accept(nj.a(ddg.dK).a(a(dqx.r, $$2, $$3)));
      akh $$4 = nt.bg.a(ddg.dL, $$0, this.c);
      akh $$5 = nt.bg.a(ddg.dL, "_off", $$1, this.c);
      this.b.accept(nj.a(ddg.dL).a(a(dqx.r, $$4, $$5)).a(d()));
      this.d(ddg.dK);
      this.c(ddg.dL);
   }

   private void am() {
      this.a(ctc.lK);
      this.b.accept(nj.a(ddg.eh).a(nk.a(dqx.aA, dqx.s, dqx.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return nm.a().a(nn.c, nu.a(ddg.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(ctc.cT);
      this.b
         .accept(
            nj.a(ddg.mV)
               .a(
                  nk.a(dqx.aS, dqx.C)
                     .a(1, false, Arrays.asList(a(nr.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(nr.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(nr.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(nr.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(nr.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(nr.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(nr.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(nr.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      nu $$0 = nu.a(ddg.dN);
      akh $$1 = nt.c.a(ddg.dP, $$0, this.c);
      this.b.accept(nj.a(ddg.dN).a(nk.a(dqx.aF).a($$1x -> nm.a().a(nn.c, $$1x < 8 ? nr.a(ddg.dN, "_height" + $$1x * 2) : $$1))));
      this.a(ddg.dN, nr.a(ddg.dN, "_height2"));
      this.b.accept(c(ddg.dP, $$1));
   }

   private void ap() {
      this.b.accept(nj.a(ddg.oc, nm.a().a(nn.c, nr.a(ddg.oc))).a(b()));
   }

   private void aq() {
      akh $$0 = nw.a.create(ddg.pa, this.c);
      this.a(ddg.pa, $$0);
      this.b.accept(nj.a(ddg.pa).a(nk.a(dqx.bj).a($$0x -> nm.a().a(nn.c, this.a(ddg.pa, "_" + $$0x.c(), nt.c, nu::b)))));
   }

   private void ar() {
      this.a(ctc.wr);
      this.b.accept(nj.a(ddg.oi).a(nk.a(dqx.as).a($$0 -> nm.a().a(nn.c, this.a(ddg.oi, "_stage" + $$0, nt.ao, nu::c)))));
   }

   private void as() {
      this.a(ctc.ps);
      this.b
         .accept(
            nj.a(ddg.fI)
               .a(
                  nk.a(dqx.a, dqx.M, dqx.L, dqx.N, dqx.O)
                     .a(false, false, false, false, false, nm.a().a(nn.c, nr.a(ddg.fI, "_ns")))
                     .a(false, true, false, false, false, nm.a().a(nn.c, nr.a(ddg.fI, "_n")).a(nn.b, nn.a.b))
                     .a(false, false, true, false, false, nm.a().a(nn.c, nr.a(ddg.fI, "_n")))
                     .a(false, false, false, true, false, nm.a().a(nn.c, nr.a(ddg.fI, "_n")).a(nn.b, nn.a.c))
                     .a(false, false, false, false, true, nm.a().a(nn.c, nr.a(ddg.fI, "_n")).a(nn.b, nn.a.d))
                     .a(false, true, true, false, false, nm.a().a(nn.c, nr.a(ddg.fI, "_ne")))
                     .a(false, true, false, true, false, nm.a().a(nn.c, nr.a(ddg.fI, "_ne")).a(nn.b, nn.a.b))
                     .a(false, false, false, true, true, nm.a().a(nn.c, nr.a(ddg.fI, "_ne")).a(nn.b, nn.a.c))
                     .a(false, false, true, false, true, nm.a().a(nn.c, nr.a(ddg.fI, "_ne")).a(nn.b, nn.a.d))
                     .a(false, false, true, true, false, nm.a().a(nn.c, nr.a(ddg.fI, "_ns")))
                     .a(false, true, false, false, true, nm.a().a(nn.c, nr.a(ddg.fI, "_ns")).a(nn.b, nn.a.b))
                     .a(false, true, true, true, false, nm.a().a(nn.c, nr.a(ddg.fI, "_nse")))
                     .a(false, true, false, true, true, nm.a().a(nn.c, nr.a(ddg.fI, "_nse")).a(nn.b, nn.a.b))
                     .a(false, false, true, true, true, nm.a().a(nn.c, nr.a(ddg.fI, "_nse")).a(nn.b, nn.a.c))
                     .a(false, true, true, false, true, nm.a().a(nn.c, nr.a(ddg.fI, "_nse")).a(nn.b, nn.a.d))
                     .a(false, true, true, true, true, nm.a().a(nn.c, nr.a(ddg.fI, "_nsew")))
                     .a(true, false, false, false, false, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_ns")))
                     .a(true, false, true, false, false, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_n")))
                     .a(true, false, false, true, false, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_n")).a(nn.b, nn.a.c))
                     .a(true, true, false, false, false, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_n")).a(nn.b, nn.a.b))
                     .a(true, false, false, false, true, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_n")).a(nn.b, nn.a.d))
                     .a(true, true, true, false, false, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_ne")))
                     .a(true, true, false, true, false, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_ne")).a(nn.b, nn.a.b))
                     .a(true, false, false, true, true, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_ne")).a(nn.b, nn.a.c))
                     .a(true, false, true, false, true, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_ne")).a(nn.b, nn.a.d))
                     .a(true, false, true, true, false, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_ns")))
                     .a(true, true, false, false, true, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_ns")).a(nn.b, nn.a.b))
                     .a(true, true, true, true, false, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_nse")))
                     .a(true, true, false, true, true, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_nse")).a(nn.b, nn.a.b))
                     .a(true, false, true, true, true, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_nse")).a(nn.b, nn.a.c))
                     .a(true, true, true, false, true, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_nse")).a(nn.b, nn.a.d))
                     .a(true, true, true, true, true, nm.a().a(nn.c, nr.a(ddg.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(ddg.fH);
      this.b.accept(nj.a(ddg.fH).a(nk.a(dqx.a, dqx.w).a(($$0, $$1) -> nm.a().a(nn.c, nu.a(ddg.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akh a(int $$0, String $$1, nu $$2) {
      switch ($$0) {
         case 1:
            return nt.bl.a(nr.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return nt.bm.a(nr.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return nt.bn.a(nr.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return nt.bo.a(nr.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akh a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", nu.b(nu.G(ddg.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", nu.b(nu.a(ddg.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", nu.b(nu.a(ddg.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(ctc.kp);
      this.b.accept(nj.a(ddg.mf).a(nk.a(dqx.aD, dqx.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(ctc.kq);
      Function<Integer, akh> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         nu $$2 = nu.a($$1);
         return nt.bw.a(ddg.mg, $$1, $$2, this.c);
      };
      this.b.accept(nj.a(ddg.mg).a(nk.a(dkm.c).a($$1 -> nm.a().a(nn.c, $$0.apply($$1)))));
   }

   private void F(dde $$0) {
      this.d($$0);
      akh $$1 = nr.a($$0);
      ni $$2 = ni.a($$0);
      nh.c $$3 = ac.a(nh.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dqy, Function<akh, nm>> $$4 : a) {
         dqy $$5 = (dqy)$$4.getFirst();
         Function<akh, nm> $$6 = (Function<akh, nm>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(nh.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      akh $$0 = nu.a(ddg.qU, "_bottom");
      nu $$1 = new nu().a(nv.e, $$0).a(nv.f, nu.a(ddg.qU, "_top")).a(nv.i, nu.a(ddg.qU, "_side"));
      nu $$2 = new nu().a(nv.e, $$0).a(nv.f, nu.a(ddg.qU, "_top_bloom")).a(nv.i, nu.a(ddg.qU, "_side_bloom"));
      akh $$3 = nt.n.a(ddg.qU, "", $$1, this.c);
      akh $$4 = nt.n.a(ddg.qU, "_bloom", $$2, this.c);
      this.b.accept(nj.a(ddg.qU).a(nk.a(dqx.E).a($$2x -> nm.a().a(nn.c, $$2x ? $$4 : $$3))));
      this.a(ctc.gj, $$3);
   }

   private void ax() {
      dde $$0 = ddg.cm;
      akh $$1 = nr.a($$0);
      ni $$2 = ni.a($$0);
      List.of(Pair.of(is.c, nn.a.a), Pair.of(is.f, nn.a.b), Pair.of(is.d, nn.a.c), Pair.of(is.e, nn.a.d)).forEach($$2x -> {
         is $$3 = (is)$$2x.getFirst();
         nn.a $$4 = (nn.a)$$2x.getSecond();
         nh.c $$5 = nh.a().a(dqx.R, $$3);
         $$2.a($$5, nm.a().a(nn.c, $$1).a(nn.b, $$4).a(nn.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, nr.a($$0, "_inventory"));
      i.clear();
   }

   private void a(ni $$0, nh.c $$1, nn.a $$2) {
      List.of(Pair.of(dqx.bp, nt.aM), Pair.of(dqx.bq, nt.aN), Pair.of(dqx.br, nt.aO), Pair.of(dqx.bs, nt.aP), Pair.of(dqx.bt, nt.aQ), Pair.of(dqx.bu, nt.aR))
         .forEach($$3 -> {
            dqy $$4 = (dqy)$$3.getFirst();
            ns $$5 = (ns)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(ni $$0, nh.c $$1, nn.a $$2, dqy $$3, ns $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      nu $$7 = new nu().a(nv.b, nu.a(ddg.cm, $$6));
      nd.d $$8 = new nd.d($$4, $$6);
      akh $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(ddg.cm, $$6, $$7, this.c));
      $$0.a(nh.a($$1, nh.a().a($$3, $$5)), nm.a().a(nn.c, $$9).a(nn.b, $$2));
   }

   private void ay() {
      this.b.accept(c(ddg.kJ, nt.c.a(ddg.kJ, nu.b(nr.a("magma")), this.c)));
   }

   private void G(dde $$0) {
      this.b($$0, nw.q);
      nt.bD.a(nr.a($$0.q()), nu.u($$0), this.c);
   }

   private void b(dde $$0, dde $$1, nd.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dde $$0, dde $$1) {
      nt.bE.a(nr.a($$0.q()), nu.u($$1), this.c);
   }

   private void az() {
      akh $$0 = nr.a(ddg.b);
      akh $$1 = nr.a(ddg.b, "_mirrored");
      this.b.accept(a(ddg.eN, $$0, $$1));
      this.a(ddg.eN, $$0);
   }

   private void aA() {
      akh $$0 = nr.a(ddg.sJ);
      akh $$1 = nr.a(ddg.sJ, "_mirrored");
      this.b.accept(a(ddg.td, $$0, $$1).a(f()));
      this.a(ddg.td, $$0);
   }

   private void n(dde $$0, dde $$1) {
      this.a($$0, nd.e.b);
      nu $$2 = nu.d(nu.a($$0, "_pot"));
      akh $$3 = nd.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      akh $$0 = nu.a(ddg.pl, "_bottom");
      akh $$1 = nu.a(ddg.pl, "_top_off");
      akh $$2 = nu.a(ddg.pl, "_top");
      akh[] $$3 = new akh[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         nu $$5 = new nu().a(nv.e, $$0).a(nv.f, $$4 == 0 ? $$1 : $$2).a(nv.i, nu.a(ddg.pl, "_side" + $$4));
         $$3[$$4] = nt.n.a(ddg.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nj.a(ddg.pl).a(nk.a(dqx.aZ).a($$1x -> nm.a().a(nn.c, $$3[$$1x]))));
      this.a(ctc.wP, $$3[0]);
   }

   private nm a(iu $$0, nm $$1) {
      switch ($$0) {
         case b:
            return $$1.a(nn.a, nn.a.b);
         case c:
            return $$1.a(nn.a, nn.a.b).a(nn.b, nn.a.c);
         case d:
            return $$1.a(nn.a, nn.a.b).a(nn.b, nn.a.d);
         case a:
            return $$1.a(nn.a, nn.a.b).a(nn.b, nn.a.b);
         case f:
            return $$1.a(nn.a, nn.a.d).a(nn.b, nn.a.c);
         case g:
            return $$1.a(nn.a, nn.a.d);
         case h:
            return $$1.a(nn.a, nn.a.d).a(nn.b, nn.a.b);
         case e:
            return $$1.a(nn.a, nn.a.d).a(nn.b, nn.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(nn.b, nn.a.c);
         case i:
            return $$1.a(nn.b, nn.a.d);
         case j:
            return $$1.a(nn.b, nn.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      akh $$0 = nu.a(ddg.pb, "_top");
      akh $$1 = nu.a(ddg.pb, "_bottom");
      akh $$2 = nu.a(ddg.pb, "_side");
      akh $$3 = nu.a(ddg.pb, "_lock");
      nu $$4 = new nu().a(nv.o, $$2).a(nv.m, $$2).a(nv.l, $$2).a(nv.c, $$0).a(nv.j, $$0).a(nv.k, $$1).a(nv.n, $$3);
      akh $$5 = nt.b.a(ddg.pb, $$4, this.c);
      this.b.accept(nj.a(ddg.pb, nm.a().a(nn.c, $$5)).a(nk.a(dqx.T).a($$0x -> this.a($$0x, nm.a()))));
   }

   private void aD() {
      dde $$0 = ddg.n;
      akh $$1 = nr.a($$0);
      nw $$2 = nw.a.get($$0);
      dde $$3 = ddg.jH;
      akh $$4 = nt.ab.a($$3, $$2.b(), this.c);
      akh $$5 = nt.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lg.a().filter(lh::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(ddg.rf).a(lg.w).a(ddg.rf, ddg.rD).a(ddg.rj, ddg.rn).a(lg.y);
      this.h(ddg.re).a(lg.A).a(ddg.re, ddg.rC).a(ddg.ri, ddg.rm).a(lg.C);
      this.h(ddg.rd).a(lg.E).a(ddg.rd, ddg.rB).a(ddg.rh, ddg.rl).a(lg.G);
      this.h(ddg.rc).a(lg.I).a(ddg.rc, ddg.rA).a(ddg.rg, ddg.rk).a(lg.K);
      this.w(ddg.sk);
      this.w(ddg.sl);
      this.w(ddg.sm);
      this.w(ddg.sn);
      this.i(ddg.sk, ddg.so);
      this.i(ddg.sl, ddg.sp);
      this.i(ddg.sm, ddg.sq);
      this.i(ddg.sn, ddg.sr);
      this.m(ddg.a);
      this.c(ddg.nc, ddg.a);
      this.c(ddg.nb, ddg.a);
      this.m(ddg.fO);
      this.m(ddg.dQ);
      this.c(ddg.nd, ddg.G);
      this.m(ddg.fA);
      this.m(ddg.me);
      this.m(ddg.fr);
      this.m(ddg.fR);
      this.a(ctc.ue);
      this.m(ddg.pg);
      this.m(ddg.G);
      this.m(ddg.H);
      this.m(ddg.hV);
      this.a(ctc.fS);
      this.o(ddg.pM, ddg.qd);
      this.o(ddg.pN, ddg.qe);
      this.o(ddg.pO, ddg.qf);
      this.o(ddg.pP, ddg.qg);
      this.o(ddg.pQ, ddg.qh);
      this.o(ddg.pR, ddg.qi);
      this.o(ddg.pS, ddg.qj);
      this.o(ddg.pT, ddg.qk);
      this.o(ddg.pU, ddg.ql);
      this.o(ddg.pV, ddg.qm);
      this.o(ddg.pW, ddg.qn);
      this.o(ddg.pX, ddg.qo);
      this.o(ddg.pY, ddg.qp);
      this.o(ddg.pZ, ddg.qq);
      this.o(ddg.qa, ddg.qr);
      this.o(ddg.qb, ddg.qs);
      this.o(ddg.pL, ddg.qc);
      this.m(ddg.na);
      this.m(ddg.gs);
      this.m(ddg.qP);
      this.m(ddg.sx);
      this.s(ddg.sy);
      this.s(ddg.sz);
      this.t(ddg.ti);
      this.t(ddg.tj);
      this.aj();
      this.g(ddg.sC, ddg.sA);
      this.p(ddg.sB);
      this.a(ddg.hW, ctc.hB);
      this.a(ctc.hB);
      this.aE();
      this.a(ddg.kN, ctc.jb);
      this.a(ctc.jb);
      this.f(ddg.bQ, nu.a(ddg.by, "_side"));
      this.a(ddg.R);
      this.a(ddg.S);
      this.a(ddg.iB);
      this.a(ddg.cx);
      this.a(ddg.cy);
      this.a(ddg.cz);
      this.a(ddg.fE);
      this.a(ddg.fF);
      this.a(ddg.fJ);
      this.a(ddg.N);
      this.a(ddg.T);
      this.a(ddg.O);
      this.a(ddg.ch);
      this.a(ddg.P);
      this.a(ddg.Q);
      this.a(ddg.ci);
      this.b(ddg.pj, nw.d);
      this.a(ddg.pi);
      this.a(ddg.aR);
      this.a(ddg.aS);
      this.a(ddg.aT);
      this.a(ddg.hb);
      this.a(ddg.dI);
      this.a(ddg.dJ);
      this.a(ddg.ha);
      this.a(ddg.pC);
      this.a(ddg.mW);
      this.a(ddg.dR);
      this.a(ddg.k);
      this.a(ddg.pk);
      this.a(ddg.fz);
      this.a(ddg.ec);
      this.a(ddg.L);
      this.a(ddg.ph);
      this.a(ddg.dO);
      this.b(ddg.dT, nw.g);
      this.b(ddg.pq, nw.d);
      this.b(ddg.fa, nw.d);
      this.m(ddg.ac);
      this.m(ddg.ga);
      this.a(ddg.kK);
      this.a(ddg.aY);
      this.a(ddg.iC);
      this.a(ddg.co);
      this.a(ddg.pK);
      this.a(ddg.ii);
      this.a(ddg.oy);
      this.a(ddg.dW);
      this.a(ddg.dX);
      this.b(ddg.ct, nw.b);
      this.a(ddg.aO);
      this.b(ddg.bw, nw.v);
      this.a(ctc.cS);
      this.b(ddg.ck, nw.f);
      this.b(ddg.pd, nw.d);
      this.a(ddg.op);
      this.a(ddg.aP);
      this.a(ddg.qt);
      this.a(ddg.qu);
      this.a(ddg.qN);
      this.a(ddg.su);
      this.a(ddg.tf);
      this.a(ddg.tg);
      this.a(ddg.th);
      this.e(ddg.qS);
      this.m(ddg.tt);
      this.aD();
      this.a(ddg.ra);
      this.a(ddg.rb);
      this.a(ddg.qW);
      this.a(ddg.qX);
      this.a(ddg.qY);
      this.a(ddg.qZ);
      this.k(ddg.qW, ddg.rw);
      this.k(ddg.qX, ddg.ry);
      this.k(ddg.qY, ddg.rx);
      this.k(ddg.qZ, ddg.rz);
      this.i(ddg.rM);
      this.i(ddg.rN);
      this.i(ddg.rP);
      this.i(ddg.rO);
      this.a(ddg.rM, ddg.rQ);
      this.a(ddg.rN, ddg.rR);
      this.a(ddg.rP, ddg.rT);
      this.a(ddg.rO, ddg.rS);
      this.k(ddg.rU);
      this.k(ddg.rV);
      this.k(ddg.rX);
      this.k(ddg.rW);
      this.b(ddg.rU, ddg.rY);
      this.b(ddg.rV, ddg.rZ);
      this.b(ddg.rX, ddg.sb);
      this.b(ddg.rW, ddg.sa);
      this.a(ddg.sc);
      this.a(ddg.sd);
      this.a(ddg.se);
      this.a(ddg.sf);
      this.k(ddg.sc, ddg.sg);
      this.k(ddg.sd, ddg.sh);
      this.k(ddg.se, ddg.si);
      this.k(ddg.sf, ddg.sj);
      this.j(ddg.gW, ddg.ch);
      this.j(ddg.gX, ddg.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(ddg.og, ddg.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(ddg.kt);
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
      this.F(ddg.ff);
      this.F(ddg.fg);
      this.F(ddg.qT);
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
      this.E(ddg.cO);
      this.d(ddg.cO);
      this.E(ddg.oa);
      this.g();
      this.E(ddg.sE);
      this.l(ddg.cp, ddg.cq);
      this.l(ddg.ea, ddg.eb);
      this.a(ddg.cA, ddg.n, nu::c);
      this.a(ddg.nY, ddg.p, nu::d);
      this.y(ddg.ow);
      this.y(ddg.on);
      this.v(ddg.aU);
      this.v(ddg.hi);
      this.C();
      this.D(ddg.oe);
      this.D(ddg.of);
      this.e(ddg.eX, nr.a(ddg.eX));
      this.a(ddg.dY, nw.d);
      this.a(ddg.dZ, nw.d);
      this.a(ddg.te);
      this.a(ddg.kM, nw.d);
      this.f(ddg.j);
      this.f(ddg.sH);
      this.f(ddg.I);
      this.g(ddg.J);
      this.g(ddg.M);
      this.f(ddg.K);
      this.e(ddg.F);
      this.b(ddg.to, nw.f);
      this.a(ddg.ij, nw.d, nw.e);
      this.a(ddg.kx, nw.w, nw.x);
      this.a(ddg.hf, nw.w, nw.x);
      this.a(ddg.tk, nw.d, nw.e);
      this.a(ddg.tl, nw.d, nw.e);
      this.a(ddg.tm, nw.d, nw.e);
      this.c(ddg.nT, nw.i);
      this.z();
      this.a(ddg.pe, nu::A);
      this.a(ddg.pf, nu::C);
      this.a(ddg.kD, dqx.as, 0, 1, 2, 3);
      this.a(ddg.gt, dqx.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(ddg.fq, dqx.as, 0, 1, 1, 2);
      this.a(ddg.gu, dqx.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(ddg.cB, dqx.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(ddg.kA, nd.e.b, dqx.aq, 0, 1);
      this.i();
      this.h();
      this.a(nr.a("decorated_pot"), ddg.iA).b(ddg.tp);
      this.a(nr.a("banner"), ddg.n)
         .a(nt.bF, ddg.iJ, ddg.iK, ddg.iL, ddg.iM, ddg.iN, ddg.iO, ddg.iP, ddg.iQ, ddg.iR, ddg.iS, ddg.iT, ddg.iU, ddg.iV, ddg.iW, ddg.iX, ddg.iY)
         .b(ddg.iZ, ddg.ja, ddg.jb, ddg.jc, ddg.jd, ddg.je, ddg.jf, ddg.jg, ddg.jh, ddg.ji, ddg.jj, ddg.jk, ddg.jl, ddg.jm, ddg.jn, ddg.jo);
      this.a(nr.a("bed"), ddg.n)
         .b(ddg.aZ, ddg.ba, ddg.bb, ddg.bc, ddg.bd, ddg.be, ddg.bf, ddg.bg, ddg.bh, ddg.bi, ddg.bj, ddg.bk, ddg.bl, ddg.bm, ddg.bn, ddg.bo);
      this.m(ddg.aZ, ddg.bA);
      this.m(ddg.ba, ddg.bB);
      this.m(ddg.bb, ddg.bC);
      this.m(ddg.bc, ddg.bD);
      this.m(ddg.bd, ddg.bE);
      this.m(ddg.be, ddg.bF);
      this.m(ddg.bf, ddg.bG);
      this.m(ddg.bg, ddg.bH);
      this.m(ddg.bh, ddg.bI);
      this.m(ddg.bi, ddg.bJ);
      this.m(ddg.bj, ddg.bK);
      this.m(ddg.bk, ddg.bL);
      this.m(ddg.bl, ddg.bM);
      this.m(ddg.bm, ddg.bN);
      this.m(ddg.bn, ddg.bO);
      this.m(ddg.bo, ddg.bP);
      this.a(nr.a("skull"), ddg.dW)
         .a(nt.bG, ddg.gM, ddg.gK, ddg.gI, ddg.gE, ddg.gG, ddg.gQ)
         .a(ddg.gO)
         .b(ddg.gN, ddg.gP, ddg.gL, ddg.gJ, ddg.gF, ddg.gH, ddg.gR);
      this.G(ddg.kP);
      this.G(ddg.kQ);
      this.G(ddg.kR);
      this.G(ddg.kS);
      this.G(ddg.kT);
      this.G(ddg.kU);
      this.G(ddg.kV);
      this.G(ddg.kW);
      this.G(ddg.kX);
      this.G(ddg.kY);
      this.G(ddg.kZ);
      this.G(ddg.la);
      this.G(ddg.lb);
      this.G(ddg.lc);
      this.G(ddg.ld);
      this.G(ddg.le);
      this.G(ddg.lf);
      this.b(ddg.mX, nw.q);
      this.c(ddg.mX);
      this.a(nr.a("chest"), ddg.n).b(ddg.cv, ddg.gV);
      this.a(nr.a("ender_chest"), ddg.co).b(ddg.fG);
      this.f(ddg.fx, ddg.co).a(ddg.fx, ddg.kF);
      this.a(ddg.aM);
      this.a(ddg.aN);
      this.a(ddg.lw);
      this.a(ddg.lx);
      this.a(ddg.ly);
      this.a(ddg.lz);
      this.a(ddg.lA);
      this.a(ddg.lB);
      this.a(ddg.lC);
      this.a(ddg.lD);
      this.a(ddg.lE);
      this.a(ddg.lF);
      this.a(ddg.lG);
      this.a(ddg.lH);
      this.a(ddg.lI);
      this.a(ddg.lJ);
      this.a(ddg.lK);
      this.a(ddg.lL);
      this.a(nw.a, ddg.lM, ddg.lN, ddg.lO, ddg.lP, ddg.lQ, ddg.lR, ddg.lS, ddg.lT, ddg.lU, ddg.lV, ddg.lW, ddg.lX, ddg.lY, ddg.lZ, ddg.ma, ddg.mb);
      this.a(ddg.iA);
      this.a(ddg.hj);
      this.a(ddg.hk);
      this.a(ddg.hl);
      this.a(ddg.hm);
      this.a(ddg.hn);
      this.a(ddg.ho);
      this.a(ddg.hp);
      this.a(ddg.hq);
      this.a(ddg.hr);
      this.a(ddg.hs);
      this.a(ddg.ht);
      this.a(ddg.hu);
      this.a(ddg.hv);
      this.a(ddg.hw);
      this.a(ddg.hx);
      this.a(ddg.hy);
      this.a(ddg.qO);
      this.h(ddg.aQ, ddg.eY);
      this.h(ddg.ei, ddg.hz);
      this.h(ddg.ej, ddg.hA);
      this.h(ddg.ek, ddg.hB);
      this.h(ddg.el, ddg.hC);
      this.h(ddg.em, ddg.hD);
      this.h(ddg.en, ddg.hE);
      this.h(ddg.eo, ddg.hF);
      this.h(ddg.ep, ddg.hG);
      this.h(ddg.eq, ddg.hH);
      this.h(ddg.er, ddg.hI);
      this.h(ddg.es, ddg.hJ);
      this.h(ddg.et, ddg.hK);
      this.h(ddg.eu, ddg.hL);
      this.h(ddg.ev, ddg.hM);
      this.h(ddg.ew, ddg.hN);
      this.h(ddg.ex, ddg.hO);
      this.b(nw.o, ddg.lg, ddg.lh, ddg.li, ddg.lj, ddg.lk, ddg.ll, ddg.lm, ddg.ln, ddg.lo, ddg.lp, ddg.lq, ddg.lr, ddg.ls, ddg.lt, ddg.lu, ddg.lv);
      this.g(ddg.bA, ddg.ik);
      this.g(ddg.bB, ddg.il);
      this.g(ddg.bC, ddg.im);
      this.g(ddg.bD, ddg.in);
      this.g(ddg.bE, ddg.io);
      this.g(ddg.bF, ddg.ip);
      this.g(ddg.bG, ddg.iq);
      this.g(ddg.bH, ddg.ir);
      this.g(ddg.bI, ddg.is);
      this.g(ddg.bJ, ddg.it);
      this.g(ddg.bK, ddg.iu);
      this.g(ddg.bL, ddg.iv);
      this.g(ddg.bM, ddg.iw);
      this.g(ddg.bN, ddg.ix);
      this.g(ddg.bO, ddg.iy);
      this.g(ddg.bP, ddg.iz);
      this.a(ddg.sI);
      this.a(ddg.eL);
      this.a(ddg.bu, ddg.gb, nd.e.a);
      this.a(ddg.bR, ddg.gc, nd.e.b);
      this.a(ddg.bT, ddg.gd, nd.e.b);
      this.a(ddg.bU, ddg.ge, nd.e.b);
      this.a(ddg.bV, ddg.gf, nd.e.b);
      this.a(ddg.bW, ddg.gg, nd.e.b);
      this.a(ddg.bX, ddg.gh, nd.e.b);
      this.a(ddg.bY, ddg.gi, nd.e.b);
      this.a(ddg.bZ, ddg.gj, nd.e.b);
      this.a(ddg.ca, ddg.gk, nd.e.b);
      this.a(ddg.cb, ddg.gl, nd.e.b);
      this.a(ddg.cc, ddg.gm, nd.e.b);
      this.a(ddg.ce, ddg.gn, nd.e.b);
      this.a(ddg.cd, ddg.go, nd.e.b);
      this.a(ddg.cg, ddg.gp, nd.e.b);
      this.a(ddg.cf, ddg.gq, nd.e.b);
      this.a(ddg.bv, ddg.gr, nd.e.b);
      this.a(ddg.bS, ddg.fS, nd.e.b);
      this.H();
      this.u(ddg.eT);
      this.u(ddg.eU);
      this.u(ddg.eV);
      this.a(ddg.bt, nd.e.a);
      this.b(ddg.dS, nd.e.a);
      this.a(ctc.dJ);
      this.b(ddg.mc, ddg.md, nd.e.b);
      this.a(ctc.dK);
      this.c(ddg.md);
      this.b(ddg.sG, nd.e.b);
      this.c(ddg.sG);
      this.c(ddg.sw);
      this.b(ddg.oz, ddg.oA, nd.e.b);
      this.b(ddg.oB, ddg.oC, nd.e.b);
      this.a(ddg.oz, "_plant");
      this.c(ddg.oA);
      this.a(ddg.oB, "_plant");
      this.c(ddg.oC);
      this.a(ddg.mY, nd.e.a, nu.c(nu.a(ddg.mZ, "_stage0")));
      this.m();
      this.a(ddg.bs, nd.e.b);
      this.c(ddg.iE, nd.e.b);
      this.c(ddg.iF, nd.e.b);
      this.c(ddg.iG, nd.e.b);
      this.c(ddg.iH, nd.e.a);
      this.c(ddg.iI, nd.e.a);
      this.j();
      this.k();
      this.l();
      this.a(ddg.mw, ddg.mr, ddg.mm, ddg.mh, ddg.mG, ddg.mB, ddg.mQ, ddg.mL);
      this.a(ddg.mx, ddg.ms, ddg.mn, ddg.mi, ddg.mH, ddg.mC, ddg.mR, ddg.mM);
      this.a(ddg.my, ddg.mt, ddg.mo, ddg.mj, ddg.mI, ddg.mD, ddg.mS, ddg.mN);
      this.a(ddg.mz, ddg.mu, ddg.mp, ddg.mk, ddg.mJ, ddg.mE, ddg.mT, ddg.mO);
      this.a(ddg.mA, ddg.mv, ddg.mq, ddg.ml, ddg.mK, ddg.mF, ddg.mU, ddg.mP);
      this.e(ddg.fe, ddg.fc);
      this.e(ddg.fd, ddg.fb);
      this.l(ddg.ab).c(ddg.ab).a(ddg.av);
      this.l(ddg.am).c(ddg.am).a(ddg.aD);
      this.a(ddg.am, ddg.dj, ddg.ds);
      this.b(ddg.aL, nw.s);
      this.l(ddg.Y).c(ddg.Y).a(ddg.as);
      this.l(ddg.ai).c(ddg.ai).a(ddg.aA);
      this.a(ddg.ai, ddg.dd, ddg.do);
      this.a(ddg.B, ddg.fX, nd.e.b);
      this.b(ddg.aI, nw.s);
      this.l(ddg.Z).d(ddg.Z).a(ddg.at);
      this.l(ddg.aj).d(ddg.aj).a(ddg.aB);
      this.a(ddg.aj, ddg.de, ddg.dp);
      this.a(ddg.C, ddg.fY, nd.e.b);
      this.b(ddg.aJ, nw.s);
      this.l(ddg.W).c(ddg.W).a(ddg.aq);
      this.l(ddg.ag).c(ddg.ag).a(ddg.ay);
      this.a(ddg.ag, ddg.dc, ddg.dn);
      this.a(ddg.z, ddg.fV, nd.e.b);
      this.b(ddg.aG, nw.s);
      this.l(ddg.U).c(ddg.U).a(ddg.ao);
      this.l(ddg.al).c(ddg.al).a(ddg.aw);
      this.a(ddg.al, ddg.da, ddg.dl);
      this.a(ddg.x, ddg.fT, nd.e.b);
      this.b(ddg.aE, nw.s);
      this.l(ddg.V).c(ddg.V).a(ddg.ap);
      this.l(ddg.af).c(ddg.af).a(ddg.ax);
      this.a(ddg.af, ddg.db, ddg.dm);
      this.a(ddg.y, ddg.fU, nd.e.b);
      this.b(ddg.aF, nw.s);
      this.l(ddg.aa).c(ddg.aa).a(ddg.au);
      this.l(ddg.ak).c(ddg.ak).a(ddg.aC);
      this.a(ddg.ak, ddg.dg, ddg.dr);
      this.a(ddg.D, ddg.fZ, nd.e.b);
      this.b(ddg.aK, nw.s);
      this.l(ddg.X).c(ddg.X).a(ddg.ar);
      this.l(ddg.ah).c(ddg.ah).a(ddg.az);
      this.a(ddg.ah, ddg.df, ddg.dq);
      this.a(ddg.A, ddg.fW, nd.e.b);
      this.b(ddg.aH, nw.s);
      this.l(ddg.os).b(ddg.os).a(ddg.ou);
      this.l(ddg.ot).b(ddg.ot).a(ddg.ov);
      this.a(ddg.ot, ddg.dh, ddg.dt);
      this.a(ddg.ox, ddg.pm, nd.e.b);
      this.n(ddg.oD, ddg.po);
      this.l(ddg.oj).b(ddg.oj).a(ddg.ol);
      this.l(ddg.ok).b(ddg.ok).a(ddg.om);
      this.a(ddg.ok, ddg.di, ddg.du);
      this.a(ddg.oo, ddg.pn, nd.e.b);
      this.n(ddg.oq, ddg.pp);
      this.l(ddg.ae).d(ddg.ae);
      this.l(ddg.an).d(ddg.an);
      this.a(ddg.v, ddg.dk, ddg.dv);
      this.b(ddg.or, nd.e.b);
      this.a(ctc.dG);
      this.i(ddg.dy);
      this.k(ddg.hY);
      this.u();
      this.n(ddg.cP);
      this.o(ddg.bp);
      this.o(ddg.bq);
      this.o(ddg.hh);
      this.t();
      this.q(ddg.fN);
      this.q(ddg.kG);
      this.q(ddg.kH);
      this.r(ddg.gS);
      this.r(ddg.gT);
      this.r(ddg.gU);
      this.o();
      this.p();
      this.d(ddg.cD, nw.h);
      this.d(ddg.nW, nw.h);
      this.d(ddg.nV, nw.i);
      this.s();
      this.aB();
      this.aw();
      this.k(ddg.eK, ddg.eS);
      this.k(ddg.m, ddg.eO);
      this.k(ddg.eJ, ddg.eR);
      this.k(ddg.eI, ddg.eQ);
      this.az();
      this.k(ddg.eH, ddg.eP);
      this.aA();
      cue.h().forEach($$0 -> this.a($$0, nr.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(ddg.hX);
      nk.a<Integer> $$0 = nk.a(dqx.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akh $$3 = nu.a(ctc.hC, $$2);
         $$0.a($$1, nm.a().a(nn.c, nt.aa.a(ddg.hX, $$2, nu.h($$3), this.c)));
         nt.bx.a(nr.a(ctc.hC, $$2), nu.k($$3), this.c);
      }

      this.b.accept(nj.a(ddg.hX).a($$0));
   }

   private void o(dde $$0, dde $$1) {
      this.a($$0.q());
      nu $$2 = nu.b(nu.G($$0));
      nu $$3 = nu.b(nu.a($$0, "_lit"));
      akh $$4 = nt.bH.a($$0, "_one_candle", $$2, this.c);
      akh $$5 = nt.bI.a($$0, "_two_candles", $$2, this.c);
      akh $$6 = nt.bJ.a($$0, "_three_candles", $$2, this.c);
      akh $$7 = nt.bK.a($$0, "_four_candles", $$2, this.c);
      akh $$8 = nt.bH.a($$0, "_one_candle_lit", $$3, this.c);
      akh $$9 = nt.bI.a($$0, "_two_candles_lit", $$3, this.c);
      akh $$10 = nt.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      akh $$11 = nt.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nj.a($$0)
               .a(
                  nk.a(dqx.az, dqx.r)
                     .a(1, false, nm.a().a(nn.c, $$4))
                     .a(2, false, nm.a().a(nn.c, $$5))
                     .a(3, false, nm.a().a(nn.c, $$6))
                     .a(4, false, nm.a().a(nn.c, $$7))
                     .a(1, true, nm.a().a(nn.c, $$8))
                     .a(2, true, nm.a().a(nn.c, $$9))
                     .a(3, true, nm.a().a(nn.c, $$10))
                     .a(4, true, nm.a().a(nn.c, $$11))
               )
         );
      akh $$12 = nt.bL.a($$1, nu.a($$0, false), this.c);
      akh $$13 = nt.bL.a($$1, "_lit", nu.a($$0, true), this.c);
      this.b.accept(nj.a($$1).a(a(dqx.r, $$13, $$12)));
   }

   class a {
      private final akh b;

      public a(akh $$0, dde $$1) {
         this.b = nt.aa.a($$0, nu.u($$1), nd.this.c);
      }

      public nd.a a(dde... $$0) {
         for (dde $$1 : $$0) {
            nd.this.b.accept(nd.c($$1, this.b));
         }

         return this;
      }

      public nd.a b(dde... $$0) {
         for (dde $$1 : $$0) {
            nd.this.c($$1);
         }

         return this.a($$0);
      }

      public nd.a a(ns $$0, dde... $$1) {
         for (dde $$2 : $$1) {
            $$0.a(nr.a($$2.q()), nu.u($$2), nd.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final nu b;
      private final Map<ns, akh> c = Maps.newHashMap();
      @Nullable
      private lh d;
      @Nullable
      private akh e;
      private final Set<dde> f = new HashSet<>();

      public b(nu $$0) {
         this.b = $$0;
      }

      public nd.b a(dde $$0, ns $$1) {
         this.e = $$1.a($$0, this.b, nd.this.c);
         if (nd.this.f.containsKey($$0)) {
            nd.this.b.accept(nd.this.f.get($$0).create($$0, this.e, this.b, nd.this.c));
         } else {
            nd.this.b.accept(nd.c($$0, this.e));
         }

         return this;
      }

      public nd.b a(dde $$0, dde $$1) {
         akh $$2 = nr.a($$0);
         nd.this.b.accept(nd.c($$1, $$2));
         nd.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nd.b a(dde $$0) {
         akh $$1 = nt.s.a($$0, this.b, nd.this.c);
         akh $$2 = nt.t.a($$0, this.b, nd.this.c);
         nd.this.b.accept(nd.b($$0, $$1, $$2));
         akh $$3 = nt.u.a($$0, this.b, nd.this.c);
         nd.this.a($$0, $$3);
         return this;
      }

      public nd.b b(dde $$0) {
         akh $$1 = nt.M.a($$0, this.b, nd.this.c);
         akh $$2 = nt.N.a($$0, this.b, nd.this.c);
         akh $$3 = nt.O.a($$0, this.b, nd.this.c);
         nd.this.b.accept(nd.a($$0, $$1, $$2, $$3));
         akh $$4 = nt.P.a($$0, this.b, nd.this.c);
         nd.this.a($$0, $$4);
         return this;
      }

      public nd.b c(dde $$0) {
         nu $$1 = nu.p($$0);
         akh $$2 = nt.D.a($$0, $$1, nd.this.c);
         akh $$3 = nt.E.a($$0, $$1, nd.this.c);
         akh $$4 = nt.F.a($$0, $$1, nd.this.c);
         akh $$5 = nt.G.a($$0, $$1, nd.this.c);
         akh $$6 = nt.H.a($$0, $$1, nd.this.c);
         nd.this.b.accept(nd.a($$0, $$2, $$3, $$4, $$5, $$6));
         akh $$7 = nt.I.a($$0, $$1, nd.this.c);
         nd.this.a($$0, $$7);
         return this;
      }

      public nd.b d(dde $$0) {
         akh $$1 = nt.J.a($$0, this.b, nd.this.c);
         akh $$2 = nt.K.a($$0, this.b, nd.this.c);
         nd.this.b.accept(nd.c($$0, $$1, $$2));
         akh $$3 = nt.L.a($$0, this.b, nd.this.c);
         nd.this.a($$0, $$3);
         return this;
      }

      public nd.b e(dde $$0) {
         nu $$1 = nu.p($$0);
         akh $$2 = nt.R.a($$0, $$1, nd.this.c);
         akh $$3 = nt.Q.a($$0, $$1, nd.this.c);
         akh $$4 = nt.T.a($$0, $$1, nd.this.c);
         akh $$5 = nt.S.a($$0, $$1, nd.this.c);
         nd.this.b.accept(nd.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nd.b f(dde $$0) {
         akh $$1 = nt.V.a($$0, this.b, nd.this.c);
         akh $$2 = nt.U.a($$0, this.b, nd.this.c);
         akh $$3 = nt.X.a($$0, this.b, nd.this.c);
         akh $$4 = nt.W.a($$0, this.b, nd.this.c);
         nd.this.b.accept(nd.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nd.b g(dde $$0) {
         akh $$1 = nt.Y.a($$0, this.b, nd.this.c);
         akh $$2 = nt.Z.a($$0, this.b, nd.this.c);
         nd.this.b.accept(nd.e($$0, $$1, $$2));
         return this;
      }

      public nd.b h(dde $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dde $$1 = this.d.b().get(lh.b.r);
            akh $$2 = nt.aa.a($$0, this.b, nd.this.c);
            nd.this.b.accept(nd.c($$0, $$2));
            nd.this.b.accept(nd.c($$1, $$2));
            nd.this.a($$0.q());
            nd.this.c($$1);
            return this;
         }
      }

      public nd.b i(dde $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akh $$1 = this.a(nt.ab, $$0);
            akh $$2 = this.a(nt.ac, $$0);
            nd.this.b.accept(nd.e($$0, $$1, $$2, this.e));
            nd.this.a($$0, $$1);
            return this;
         }
      }

      public nd.b j(dde $$0) {
         akh $$1 = this.a(nt.af, $$0);
         akh $$2 = this.a(nt.ae, $$0);
         akh $$3 = this.a(nt.ag, $$0);
         nd.this.b.accept(nd.b($$0, $$1, $$2, $$3));
         nd.this.a($$0, $$2);
         return this;
      }

      private nd.b k(dde $$0) {
         nw $$1 = nd.this.g.getOrDefault($$0, nw.a.get($$0));
         akh $$2 = $$1.a($$0, nd.this.c);
         nd.this.b.accept(nd.c($$0, $$2));
         return this;
      }

      private nd.b l(dde $$0) {
         nd.this.i($$0);
         return this;
      }

      private void m(dde $$0) {
         if (nd.this.e.contains($$0)) {
            nd.this.k($$0);
         } else {
            nd.this.j($$0);
         }
      }

      private akh a(ns $$0, dde $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nd.this.c));
      }

      public nd.b a(lh $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nd.b, dde> $$2 = nd.h.get($$0x);
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
      ng create(dde var1, akh var2, nu var3, BiConsumer<akh, Supplier<JsonElement>> var4);
   }

   static record d(ns a, String b) {
   }

   static enum e {
      a,
      b;

      public ns a() {
         return this == a ? nt.ap : nt.ao;
      }

      public ns b() {
         return this == a ? nt.ar : nt.aq;
      }
   }

   class f {
      private final nu b;

      public f(nu $$0) {
         this.b = $$0;
      }

      public nd.f a(dde $$0) {
         nu $$1 = this.b.c(nv.d, this.b.a(nv.i));
         akh $$2 = nt.j.a($$0, $$1, nd.this.c);
         nd.this.b.accept(nd.d($$0, $$2));
         return this;
      }

      public nd.f b(dde $$0) {
         akh $$1 = nt.j.a($$0, this.b, nd.this.c);
         nd.this.b.accept(nd.d($$0, $$1));
         return this;
      }

      public nd.f c(dde $$0) {
         akh $$1 = nt.j.a($$0, this.b, nd.this.c);
         akh $$2 = nt.k.a($$0, this.b, nd.this.c);
         nd.this.b.accept(nd.d($$0, $$1, $$2));
         return this;
      }

      public nd.f d(dde $$0) {
         nd.this.b.accept(nd.a($$0, this.b, nd.this.c));
         return this;
      }
   }
}
