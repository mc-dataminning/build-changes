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

public class nu {
   final Consumer<ny> b;
   final BiConsumer<alh, Supplier<JsonElement>> c;
   private final Consumer<cvt> d;
   final List<dhy> e = ImmutableList.of(dia.ey, dia.eE, dia.hY);
   final Map<dhy, nu.c> f = ImmutableMap.builder().put(dia.b, nu::a).put(dia.sJ, nu::c).put(dia.eM, nu::b).build();
   final Map<dhy, oo> g = ImmutableMap.builder()
      .put(dia.aV, oo.y.get(dia.aV))
      .put(dia.jp, oo.y.get(dia.jp))
      .put(dia.jS, oo.a(om.a(dia.aV, "_top")))
      .put(dia.jU, oo.a(om.a(dia.jp, "_top")))
      .put(dia.aX, oo.d.get(dia.aV).a($$0x -> $$0x.a(on.i, om.G(dia.aX))))
      .put(dia.jr, oo.d.get(dia.jp).a($$0x -> $$0x.a(on.i, om.G(dia.jr))))
      .put(dia.hd, oo.d.get(dia.hd))
      .put(dia.jT, oo.a(om.a(dia.hd, "_bottom")))
      .put(dia.pr, oo.z.get(dia.pr))
      .put(dia.sJ, oo.z.get(dia.sJ))
      .put(dia.he, oo.d.get(dia.he).a($$0x -> $$0x.a(on.i, om.G(dia.he))))
      .put(dia.aW, oo.d.get(dia.aW).a($$0x -> {
         $$0x.a(on.d, om.a(dia.aV, "_top"));
         $$0x.a(on.i, om.G(dia.aW));
      }))
      .put(dia.jq, oo.d.get(dia.jq).a($$0x -> {
         $$0x.a(on.d, om.a(dia.jp, "_top"));
         $$0x.a(on.i, om.G(dia.jq));
      }))
      .put(dia.qM, oo.z.get(dia.qM))
      .put(dia.qH, oo.z.get(dia.qH))
      .build();
   static final Map<mb.b, BiConsumer<nu.b, dhy>> h = ImmutableMap.builder()
      .put(mb.b.a, nu.b::a)
      .put(mb.b.e, nu.b::l)
      .put(mb.b.b, nu.b::k)
      .put(mb.b.c, nu.b::k)
      .put(mb.b.f, nu.b::c)
      .put(mb.b.g, nu.b::d)
      .put(mb.b.h, nu.b::e)
      .put(mb.b.i, nu.b::f)
      .put(mb.b.k, nu.b::h)
      .put(mb.b.l, nu.b::i)
      .put(mb.b.m, nu.b::j)
      .put(mb.b.n, nu.b::g)
      .put(mb.b.p, nu.b::m)
      .put(mb.b.q, nu.b::b)
      .build();
   public static final List<Pair<dvu, Function<alh, oe>>> a = List.of(
      Pair.of(dvt.L, (Function<alh, oe>)$$0 -> oe.a().a(of.c, $$0)),
      Pair.of(dvt.M, (Function<alh, oe>)$$0 -> oe.a().a(of.c, $$0).a(of.b, of.a.b).a(of.d, true)),
      Pair.of(dvt.N, (Function<alh, oe>)$$0 -> oe.a().a(of.c, $$0).a(of.b, of.a.c).a(of.d, true)),
      Pair.of(dvt.O, (Function<alh, oe>)$$0 -> oe.a().a(of.c, $$0).a(of.b, of.a.d).a(of.d, true)),
      Pair.of(dvt.J, (Function<alh, oe>)$$0 -> oe.a().a(of.c, $$0).a(of.a, of.a.d).a(of.d, true)),
      Pair.of(dvt.K, (Function<alh, oe>)$$0 -> oe.a().a(of.c, $$0).a(of.a, of.a.b).a(of.d, true))
   );
   private static final Map<nu.d, alh> i = new HashMap<>();

   private static ny a(dhy $$0, alh $$1, om $$2, BiConsumer<alh, Supplier<JsonElement>> $$3) {
      alh $$4 = ol.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static ny b(dhy $$0, alh $$1, om $$2, BiConsumer<alh, Supplier<JsonElement>> $$3) {
      alh $$4 = ol.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static ny c(dhy $$0, alh $$1, om $$2, BiConsumer<alh, Supplier<JsonElement>> $$3) {
      alh $$4 = ol.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nu(Consumer<ny> $$0, BiConsumer<alh, Supplier<JsonElement>> $$1, Consumer<cvt> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dhy $$0) {
      this.d.accept($$0.j());
   }

   void a(dhy $$0, alh $$1) {
      this.c.accept(oj.a($$0.j()), new oi($$1));
   }

   private void a(cvt $$0, alh $$1) {
      this.c.accept(oj.a($$0), new oi($$1));
   }

   void a(cvt $$0) {
      ol.bz.a(oj.a($$0), om.b($$0), this.c);
   }

   private void d(dhy $$0) {
      cvt $$1 = $$0.j();
      if ($$1 != cwb.a) {
         ol.bz.a(oj.a($$1), om.F($$0), this.c);
      }
   }

   private void a(dhy $$0, String $$1) {
      cvt $$2 = $$0.j();
      ol.bz.a(oj.a($$2), om.k(om.a($$0, $$1)), this.c);
   }

   private static oc b() {
      return oc.a(dvt.R).a(jl.f, oe.a().a(of.b, of.a.b)).a(jl.d, oe.a().a(of.b, of.a.c)).a(jl.e, oe.a().a(of.b, of.a.d)).a(jl.c, oe.a());
   }

   private static oc c() {
      return oc.a(dvt.R).a(jl.d, oe.a()).a(jl.e, oe.a().a(of.b, of.a.b)).a(jl.c, oe.a().a(of.b, of.a.c)).a(jl.f, oe.a().a(of.b, of.a.d));
   }

   private static oc d() {
      return oc.a(dvt.R).a(jl.f, oe.a()).a(jl.d, oe.a().a(of.b, of.a.b)).a(jl.e, oe.a().a(of.b, of.a.c)).a(jl.c, oe.a().a(of.b, of.a.d));
   }

   private static oc e() {
      return oc.a(dvt.P)
         .a(jl.a, oe.a().a(of.a, of.a.b))
         .a(jl.b, oe.a().a(of.a, of.a.d))
         .a(jl.c, oe.a())
         .a(jl.d, oe.a().a(of.b, of.a.c))
         .a(jl.e, oe.a().a(of.b, of.a.d))
         .a(jl.f, oe.a().a(of.b, of.a.b));
   }

   private static ob b(dhy $$0, alh $$1) {
      return ob.a($$0, a($$1));
   }

   private static oe[] a(alh $$0) {
      return new oe[]{oe.a().a(of.c, $$0), oe.a().a(of.c, $$0).a(of.b, of.a.b), oe.a().a(of.c, $$0).a(of.b, of.a.c), oe.a().a(of.c, $$0).a(of.b, of.a.d)};
   }

   private static ob a(dhy $$0, alh $$1, alh $$2) {
      return ob.a($$0, oe.a().a(of.c, $$1), oe.a().a(of.c, $$2), oe.a().a(of.c, $$1).a(of.b, of.a.c), oe.a().a(of.c, $$2).a(of.b, of.a.c));
   }

   private static oc a(dvu $$0, alh $$1, alh $$2) {
      return oc.a($$0).a(true, oe.a().a(of.c, $$1)).a(false, oe.a().a(of.c, $$2));
   }

   private void e(dhy $$0) {
      alh $$1 = oo.a.create($$0, this.c);
      alh $$2 = oo.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dhy $$0) {
      alh $$1 = oo.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dhy $$0) {
      this.b.accept(ob.a($$0).a(oc.a(dvt.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         alh $$3 = om.a($$0, $$2);
         return oe.a().a(of.c, ol.c.a($$0, $$2, new om().a(on.a, $$3), this.c));
      })));
      this.a($$0, om.a($$0, "_0"));
   }

   static ny b(dhy $$0, alh $$1, alh $$2) {
      return ob.a($$0)
         .a(oc.a(dvt.w).a(false, oe.a().a(of.c, $$1)).a(true, oe.a().a(of.c, $$2)))
         .a(
            oc.a(dvt.U, dvt.R)
               .a(dvo.a, jl.f, oe.a().a(of.b, of.a.b))
               .a(dvo.a, jl.e, oe.a().a(of.b, of.a.d))
               .a(dvo.a, jl.d, oe.a().a(of.b, of.a.c))
               .a(dvo.a, jl.c, oe.a())
               .a(dvo.b, jl.f, oe.a().a(of.b, of.a.b).a(of.a, of.a.b).a(of.d, true))
               .a(dvo.b, jl.e, oe.a().a(of.b, of.a.d).a(of.a, of.a.b).a(of.d, true))
               .a(dvo.b, jl.d, oe.a().a(of.b, of.a.c).a(of.a, of.a.b).a(of.d, true))
               .a(dvo.b, jl.c, oe.a().a(of.a, of.a.b).a(of.d, true))
               .a(dvo.c, jl.f, oe.a().a(of.b, of.a.d).a(of.a, of.a.c))
               .a(dvo.c, jl.e, oe.a().a(of.b, of.a.b).a(of.a, of.a.c))
               .a(dvo.c, jl.d, oe.a().a(of.a, of.a.c))
               .a(dvo.c, jl.c, oe.a().a(of.b, of.a.c).a(of.a, of.a.c))
         );
   }

   private static oc.d<jl, dvz, dvy, Boolean> a(oc.d<jl, dvz, dvy, Boolean> $$0, dvz $$1, alh $$2, alh $$3, alh $$4, alh $$5) {
      return $$0.a(jl.f, $$1, dvy.a, false, oe.a().a(of.c, $$2))
         .a(jl.d, $$1, dvy.a, false, oe.a().a(of.c, $$2).a(of.b, of.a.b))
         .a(jl.e, $$1, dvy.a, false, oe.a().a(of.c, $$2).a(of.b, of.a.c))
         .a(jl.c, $$1, dvy.a, false, oe.a().a(of.c, $$2).a(of.b, of.a.d))
         .a(jl.f, $$1, dvy.b, false, oe.a().a(of.c, $$4))
         .a(jl.d, $$1, dvy.b, false, oe.a().a(of.c, $$4).a(of.b, of.a.b))
         .a(jl.e, $$1, dvy.b, false, oe.a().a(of.c, $$4).a(of.b, of.a.c))
         .a(jl.c, $$1, dvy.b, false, oe.a().a(of.c, $$4).a(of.b, of.a.d))
         .a(jl.f, $$1, dvy.a, true, oe.a().a(of.c, $$3).a(of.b, of.a.b))
         .a(jl.d, $$1, dvy.a, true, oe.a().a(of.c, $$3).a(of.b, of.a.c))
         .a(jl.e, $$1, dvy.a, true, oe.a().a(of.c, $$3).a(of.b, of.a.d))
         .a(jl.c, $$1, dvy.a, true, oe.a().a(of.c, $$3))
         .a(jl.f, $$1, dvy.b, true, oe.a().a(of.c, $$5).a(of.b, of.a.d))
         .a(jl.d, $$1, dvy.b, true, oe.a().a(of.c, $$5))
         .a(jl.e, $$1, dvy.b, true, oe.a().a(of.c, $$5).a(of.b, of.a.b))
         .a(jl.c, $$1, dvy.b, true, oe.a().a(of.c, $$5).a(of.b, of.a.c));
   }

   private static ny a(dhy $$0, alh $$1, alh $$2, alh $$3, alh $$4, alh $$5, alh $$6, alh $$7, alh $$8) {
      return ob.a($$0).a(a(a(oc.a(dvt.R, dvt.ae, dvt.be, dvt.u), dvz.b, $$1, $$2, $$3, $$4), dvz.a, $$5, $$6, $$7, $$8));
   }

   static ny a(dhy $$0, alh $$1, alh $$2, alh $$3, alh $$4, alh $$5) {
      return oa.a($$0)
         .a(oe.a().a(of.c, $$1))
         .a(nz.a().a(dvt.L, true), oe.a().a(of.c, $$2).a(of.d, false))
         .a(nz.a().a(dvt.M, true), oe.a().a(of.c, $$3).a(of.d, false))
         .a(nz.a().a(dvt.N, true), oe.a().a(of.c, $$4).a(of.d, false))
         .a(nz.a().a(dvt.O, true), oe.a().a(of.c, $$5).a(of.d, false));
   }

   static ny c(dhy $$0, alh $$1, alh $$2) {
      return oa.a($$0)
         .a(oe.a().a(of.c, $$1))
         .a(nz.a().a(dvt.L, true), oe.a().a(of.c, $$2).a(of.d, true))
         .a(nz.a().a(dvt.M, true), oe.a().a(of.c, $$2).a(of.b, of.a.b).a(of.d, true))
         .a(nz.a().a(dvt.N, true), oe.a().a(of.c, $$2).a(of.b, of.a.c).a(of.d, true))
         .a(nz.a().a(dvt.O, true), oe.a().a(of.c, $$2).a(of.b, of.a.d).a(of.d, true));
   }

   static ny a(dhy $$0, alh $$1, alh $$2, alh $$3) {
      return oa.a($$0)
         .a(nz.a().a(dvt.J, true), oe.a().a(of.c, $$1))
         .a(nz.a().a(dvt.X, dwp.b), oe.a().a(of.c, $$2).a(of.d, true))
         .a(nz.a().a(dvt.W, dwp.b), oe.a().a(of.c, $$2).a(of.b, of.a.b).a(of.d, true))
         .a(nz.a().a(dvt.Y, dwp.b), oe.a().a(of.c, $$2).a(of.b, of.a.c).a(of.d, true))
         .a(nz.a().a(dvt.Z, dwp.b), oe.a().a(of.c, $$2).a(of.b, of.a.d).a(of.d, true))
         .a(nz.a().a(dvt.X, dwp.c), oe.a().a(of.c, $$3).a(of.d, true))
         .a(nz.a().a(dvt.W, dwp.c), oe.a().a(of.c, $$3).a(of.b, of.a.b).a(of.d, true))
         .a(nz.a().a(dvt.Y, dwp.c), oe.a().a(of.c, $$3).a(of.b, of.a.c).a(of.d, true))
         .a(nz.a().a(dvt.Z, dwp.c), oe.a().a(of.c, $$3).a(of.b, of.a.d).a(of.d, true));
   }

   static ny a(dhy $$0, alh $$1, alh $$2, alh $$3, alh $$4, boolean $$5) {
      return ob.a($$0, oe.a().a(of.d, $$5))
         .a(c())
         .a(
            oc.a(dvt.q, dvt.u)
               .a(false, false, oe.a().a(of.c, $$2))
               .a(true, false, oe.a().a(of.c, $$4))
               .a(false, true, oe.a().a(of.c, $$1))
               .a(true, true, oe.a().a(of.c, $$3))
         );
   }

   static ny b(dhy $$0, alh $$1, alh $$2, alh $$3) {
      return ob.a($$0)
         .a(
            oc.a(dvt.R, dvt.af, dvt.bi)
               .a(jl.f, dwc.b, dwm.a, oe.a().a(of.c, $$2))
               .a(jl.e, dwc.b, dwm.a, oe.a().a(of.c, $$2).a(of.b, of.a.c).a(of.d, true))
               .a(jl.d, dwc.b, dwm.a, oe.a().a(of.c, $$2).a(of.b, of.a.b).a(of.d, true))
               .a(jl.c, dwc.b, dwm.a, oe.a().a(of.c, $$2).a(of.b, of.a.d).a(of.d, true))
               .a(jl.f, dwc.b, dwm.e, oe.a().a(of.c, $$3))
               .a(jl.e, dwc.b, dwm.e, oe.a().a(of.c, $$3).a(of.b, of.a.c).a(of.d, true))
               .a(jl.d, dwc.b, dwm.e, oe.a().a(of.c, $$3).a(of.b, of.a.b).a(of.d, true))
               .a(jl.c, dwc.b, dwm.e, oe.a().a(of.c, $$3).a(of.b, of.a.d).a(of.d, true))
               .a(jl.f, dwc.b, dwm.d, oe.a().a(of.c, $$3).a(of.b, of.a.d).a(of.d, true))
               .a(jl.e, dwc.b, dwm.d, oe.a().a(of.c, $$3).a(of.b, of.a.b).a(of.d, true))
               .a(jl.d, dwc.b, dwm.d, oe.a().a(of.c, $$3))
               .a(jl.c, dwc.b, dwm.d, oe.a().a(of.c, $$3).a(of.b, of.a.c).a(of.d, true))
               .a(jl.f, dwc.b, dwm.c, oe.a().a(of.c, $$1))
               .a(jl.e, dwc.b, dwm.c, oe.a().a(of.c, $$1).a(of.b, of.a.c).a(of.d, true))
               .a(jl.d, dwc.b, dwm.c, oe.a().a(of.c, $$1).a(of.b, of.a.b).a(of.d, true))
               .a(jl.c, dwc.b, dwm.c, oe.a().a(of.c, $$1).a(of.b, of.a.d).a(of.d, true))
               .a(jl.f, dwc.b, dwm.b, oe.a().a(of.c, $$1).a(of.b, of.a.d).a(of.d, true))
               .a(jl.e, dwc.b, dwm.b, oe.a().a(of.c, $$1).a(of.b, of.a.b).a(of.d, true))
               .a(jl.d, dwc.b, dwm.b, oe.a().a(of.c, $$1))
               .a(jl.c, dwc.b, dwm.b, oe.a().a(of.c, $$1).a(of.b, of.a.c).a(of.d, true))
               .a(jl.f, dwc.a, dwm.a, oe.a().a(of.c, $$2).a(of.a, of.a.c).a(of.d, true))
               .a(jl.e, dwc.a, dwm.a, oe.a().a(of.c, $$2).a(of.a, of.a.c).a(of.b, of.a.c).a(of.d, true))
               .a(jl.d, dwc.a, dwm.a, oe.a().a(of.c, $$2).a(of.a, of.a.c).a(of.b, of.a.b).a(of.d, true))
               .a(jl.c, dwc.a, dwm.a, oe.a().a(of.c, $$2).a(of.a, of.a.c).a(of.b, of.a.d).a(of.d, true))
               .a(jl.f, dwc.a, dwm.e, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.b).a(of.d, true))
               .a(jl.e, dwc.a, dwm.e, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.d).a(of.d, true))
               .a(jl.d, dwc.a, dwm.e, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.c).a(of.d, true))
               .a(jl.c, dwc.a, dwm.e, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.d, true))
               .a(jl.f, dwc.a, dwm.d, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.d, true))
               .a(jl.e, dwc.a, dwm.d, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.c).a(of.d, true))
               .a(jl.d, dwc.a, dwm.d, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.b).a(of.d, true))
               .a(jl.c, dwc.a, dwm.d, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.d).a(of.d, true))
               .a(jl.f, dwc.a, dwm.c, oe.a().a(of.c, $$1).a(of.a, of.a.c).a(of.b, of.a.b).a(of.d, true))
               .a(jl.e, dwc.a, dwm.c, oe.a().a(of.c, $$1).a(of.a, of.a.c).a(of.b, of.a.d).a(of.d, true))
               .a(jl.d, dwc.a, dwm.c, oe.a().a(of.c, $$1).a(of.a, of.a.c).a(of.b, of.a.c).a(of.d, true))
               .a(jl.c, dwc.a, dwm.c, oe.a().a(of.c, $$1).a(of.a, of.a.c).a(of.d, true))
               .a(jl.f, dwc.a, dwm.b, oe.a().a(of.c, $$1).a(of.a, of.a.c).a(of.d, true))
               .a(jl.e, dwc.a, dwm.b, oe.a().a(of.c, $$1).a(of.a, of.a.c).a(of.b, of.a.c).a(of.d, true))
               .a(jl.d, dwc.a, dwm.b, oe.a().a(of.c, $$1).a(of.a, of.a.c).a(of.b, of.a.b).a(of.d, true))
               .a(jl.c, dwc.a, dwm.b, oe.a().a(of.c, $$1).a(of.a, of.a.c).a(of.b, of.a.d).a(of.d, true))
         );
   }

   private static ny c(dhy $$0, alh $$1, alh $$2, alh $$3) {
      return ob.a($$0)
         .a(
            oc.a(dvt.R, dvt.af, dvt.u)
               .a(jl.c, dwc.b, false, oe.a().a(of.c, $$2))
               .a(jl.d, dwc.b, false, oe.a().a(of.c, $$2).a(of.b, of.a.c))
               .a(jl.f, dwc.b, false, oe.a().a(of.c, $$2).a(of.b, of.a.b))
               .a(jl.e, dwc.b, false, oe.a().a(of.c, $$2).a(of.b, of.a.d))
               .a(jl.c, dwc.a, false, oe.a().a(of.c, $$1))
               .a(jl.d, dwc.a, false, oe.a().a(of.c, $$1).a(of.b, of.a.c))
               .a(jl.f, dwc.a, false, oe.a().a(of.c, $$1).a(of.b, of.a.b))
               .a(jl.e, dwc.a, false, oe.a().a(of.c, $$1).a(of.b, of.a.d))
               .a(jl.c, dwc.b, true, oe.a().a(of.c, $$3))
               .a(jl.d, dwc.b, true, oe.a().a(of.c, $$3).a(of.b, of.a.c))
               .a(jl.f, dwc.b, true, oe.a().a(of.c, $$3).a(of.b, of.a.b))
               .a(jl.e, dwc.b, true, oe.a().a(of.c, $$3).a(of.b, of.a.d))
               .a(jl.c, dwc.a, true, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.c))
               .a(jl.d, dwc.a, true, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.a))
               .a(jl.f, dwc.a, true, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.d))
               .a(jl.e, dwc.a, true, oe.a().a(of.c, $$3).a(of.a, of.a.c).a(of.b, of.a.b))
         );
   }

   private static ny d(dhy $$0, alh $$1, alh $$2, alh $$3) {
      return ob.a($$0)
         .a(
            oc.a(dvt.R, dvt.af, dvt.u)
               .a(jl.c, dwc.b, false, oe.a().a(of.c, $$2))
               .a(jl.d, dwc.b, false, oe.a().a(of.c, $$2))
               .a(jl.f, dwc.b, false, oe.a().a(of.c, $$2))
               .a(jl.e, dwc.b, false, oe.a().a(of.c, $$2))
               .a(jl.c, dwc.a, false, oe.a().a(of.c, $$1))
               .a(jl.d, dwc.a, false, oe.a().a(of.c, $$1))
               .a(jl.f, dwc.a, false, oe.a().a(of.c, $$1))
               .a(jl.e, dwc.a, false, oe.a().a(of.c, $$1))
               .a(jl.c, dwc.b, true, oe.a().a(of.c, $$3))
               .a(jl.d, dwc.b, true, oe.a().a(of.c, $$3).a(of.b, of.a.c))
               .a(jl.f, dwc.b, true, oe.a().a(of.c, $$3).a(of.b, of.a.b))
               .a(jl.e, dwc.b, true, oe.a().a(of.c, $$3).a(of.b, of.a.d))
               .a(jl.c, dwc.a, true, oe.a().a(of.c, $$3))
               .a(jl.d, dwc.a, true, oe.a().a(of.c, $$3).a(of.b, of.a.c))
               .a(jl.f, dwc.a, true, oe.a().a(of.c, $$3).a(of.b, of.a.b))
               .a(jl.e, dwc.a, true, oe.a().a(of.c, $$3).a(of.b, of.a.d))
         );
   }

   static ob c(dhy $$0, alh $$1) {
      return ob.a($$0, oe.a().a(of.c, $$1));
   }

   private static oc f() {
      return oc.a(dvt.I).a(jl.a.b, oe.a()).a(jl.a.c, oe.a().a(of.a, of.a.b)).a(jl.a.a, oe.a().a(of.a, of.a.b).a(of.b, of.a.b));
   }

   static ny a(dhy $$0, om $$1, BiConsumer<alh, Supplier<JsonElement>> $$2) {
      alh $$3 = ol.g.a($$0, $$1, $$2);
      alh $$4 = ol.h.a($$0, $$1, $$2);
      alh $$5 = ol.i.a($$0, $$1, $$2);
      alh $$6 = ol.j.a($$0, $$1, $$2);
      return ob.a($$0, oe.a().a(of.c, $$6)).a(oc.a(dvt.I).a(jl.a.a, oe.a().a(of.c, $$3)).a(jl.a.b, oe.a().a(of.c, $$4)).a(jl.a.c, oe.a().a(of.c, $$5)));
   }

   static ny d(dhy $$0, alh $$1) {
      return ob.a($$0, oe.a().a(of.c, $$1)).a(f());
   }

   private void e(dhy $$0, alh $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dhy $$0, oo.a $$1) {
      alh $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dhy $$0, oo.a $$1) {
      alh $$2 = $$1.create($$0, this.c);
      this.b.accept(ob.a($$0, oe.a().a(of.c, $$2)).a(b()));
   }

   static ny d(dhy $$0, alh $$1, alh $$2) {
      return ob.a($$0)
         .a(
            oc.a(dvt.I)
               .a(jl.a.b, oe.a().a(of.c, $$1))
               .a(jl.a.c, oe.a().a(of.c, $$2).a(of.a, of.a.b))
               .a(jl.a.a, oe.a().a(of.c, $$2).a(of.a, of.a.b).a(of.b, of.a.b))
         );
   }

   private void a(dhy $$0, oo.a $$1, oo.a $$2) {
      alh $$3 = $$1.create($$0, this.c);
      alh $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private alh a(dhy $$0, String $$1, ok $$2, Function<alh, om> $$3) {
      return $$2.a($$0, $$1, $$3.apply(om.a($$0, $$1)), this.c);
   }

   static ny e(dhy $$0, alh $$1, alh $$2) {
      return ob.a($$0).a(a(dvt.w, $$2, $$1));
   }

   static ny e(dhy $$0, alh $$1, alh $$2, alh $$3) {
      return ob.a($$0).a(oc.a(dvt.bh).a(dwl.b, oe.a().a(of.c, $$1)).a(dwl.a, oe.a().a(of.c, $$2)).a(dwl.c, oe.a().a(of.c, $$3)));
   }

   public void a(dhy $$0) {
      this.b($$0, oo.a);
   }

   public void b(dhy $$0, oo.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dhy $$0, om $$1, ok $$2) {
      alh $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nu.b h(dhy $$0) {
      oo $$1 = this.g.getOrDefault($$0, oo.a.get($$0));
      return new nu.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dhy $$0, dhy $$1, dhy $$2) {
      om $$3 = om.u($$0);
      alh $$4 = ol.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void i(dhy $$0) {
      om $$1 = om.t($$0);
      alh $$2 = ol.v.a($$0, $$1, this.c);
      alh $$3 = ol.w.a($$0, $$1, this.c);
      alh $$4 = ol.x.a($$0, $$1, this.c);
      alh $$5 = ol.y.a($$0, $$1, this.c);
      alh $$6 = ol.z.a($$0, $$1, this.c);
      alh $$7 = ol.A.a($$0, $$1, this.c);
      alh $$8 = ol.B.a($$0, $$1, this.c);
      alh $$9 = ol.C.a($$0, $$1, this.c);
      this.a($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dhy $$0, dhy $$1) {
      alh $$2 = ol.v.a($$0);
      alh $$3 = ol.w.a($$0);
      alh $$4 = ol.x.a($$0);
      alh $$5 = ol.y.a($$0);
      alh $$6 = ol.z.a($$0);
      alh $$7 = ol.A.a($$0);
      alh $$8 = ol.B.a($$0);
      alh $$9 = ol.C.a($$0);
      this.a($$1, oj.a($$0.j()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dhy $$0) {
      om $$1 = om.b($$0);
      alh $$2 = ol.ak.a($$0, $$1, this.c);
      alh $$3 = ol.al.a($$0, $$1, this.c);
      alh $$4 = ol.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dhy $$0) {
      om $$1 = om.b($$0);
      alh $$2 = ol.ah.a($$0, $$1, this.c);
      alh $$3 = ol.ai.a($$0, $$1, this.c);
      alh $$4 = ol.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dhy $$0, dhy $$1) {
      alh $$2 = ol.ah.a($$0);
      alh $$3 = ol.ai.a($$0);
      alh $$4 = ol.aj.a($$0);
      this.a($$1, oj.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dia.sD);
      alh $$0 = oj.a(dia.sD);
      alh $$1 = oj.a(dia.sD, "_partial_tilt");
      alh $$2 = oj.a(dia.sD, "_full_tilt");
      this.b
         .accept(
            ob.a(dia.sD)
               .a(b())
               .a(oc.a(dvt.bl).a(dwo.a, oe.a().a(of.c, $$0)).a(dwo.b, oe.a().a(of.c, $$0)).a(dwo.c, oe.a().a(of.c, $$1)).a(dwo.d, oe.a().a(of.c, $$2)))
         );
   }

   private nu.f l(dhy $$0) {
      return new nu.f(om.n($$0));
   }

   private void m(dhy $$0) {
      this.c($$0, $$0);
   }

   private void c(dhy $$0, dhy $$1) {
      this.b.accept(c($$0, oj.a($$1)));
   }

   private void a(dhy $$0, nu.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dhy $$0, nu.e $$1, om $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dhy $$0, nu.e $$1) {
      om $$2 = om.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dhy $$0, nu.e $$1, om $$2) {
      alh $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dhy $$0, nu.e $$1, dwg<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         oc $$4 = oc.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            om $$5 = om.c(om.a($$0, $$4x));
            alh $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return oe.a().a(of.c, $$6);
         });
         this.a($$0.j());
         this.b.accept(ob.a($$0).a($$4));
      }
   }

   private void a(dhy $$0, dhy $$1, nu.e $$2) {
      this.a($$0, $$2);
      om $$3 = om.d($$0);
      alh $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dhy $$0, dhy $$1) {
      oo $$2 = oo.p.get($$0);
      alh $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alh $$4 = ol.aC.a($$1, $$2.b(), this.c);
      this.b.accept(ob.a($$1, oe.a().a(of.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dhy $$0, dhy $$1) {
      this.a($$0.j());
      om $$2 = om.h($$0);
      om $$3 = om.a($$0, $$1);
      alh $$4 = ol.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            ob.a($$1, oe.a().a(of.c, $$4))
               .a(oc.a(dvt.R).a(jl.e, oe.a()).a(jl.d, oe.a().a(of.b, of.a.d)).a(jl.c, oe.a().a(of.b, of.a.b)).a(jl.f, oe.a().a(of.b, of.a.c)))
         );
      this.b.accept(ob.a($$0).a(oc.a(dvt.av).a($$2x -> oe.a().a(of.c, ol.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dhy $$0 = dia.kC;
      this.a($$0.j());
      alh $$1 = oj.a($$0, "_top");
      alh $$2 = oj.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dhy $$0 = dia.kB;
      this.a($$0.j());
      oc $$1 = oc.a(dnm.d, dvt.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oe.a().a(of.c, oj.a($$0, "_top_stage_" + $$1x));
            case b -> oe.a().a(of.c, oj.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(ob.a($$0).a($$1));
   }

   private void a(dhy $$0, dhy $$1, dhy $$2, dhy $$3, dhy $$4, dhy $$5, dhy $$6, dhy $$7) {
      this.a($$0, nu.e.b);
      this.a($$1, nu.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dhy $$0, nu.e $$1) {
      this.a($$0, "_top");
      alh $$2 = this.a($$0, "_top", $$1.a(), om::c);
      alh $$3 = this.a($$0, "_bottom", $$1.a(), om::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dia.iD, "_front");
      alh $$0 = oj.a(dia.iD, "_top");
      alh $$1 = this.a(dia.iD, "_bottom", nu.e.b.a(), om::c);
      this.f(dia.iD, $$0, $$1);
   }

   private void k() {
      alh $$0 = this.a(dia.bx, "_top", ol.bm, om::a);
      alh $$1 = this.a(dia.bx, "_bottom", ol.bm, om::a);
      this.f(dia.bx, $$0, $$1);
   }

   private void l() {
      this.c(dia.sF);
      alh $$0 = oj.a(dia.sF, "_top");
      alh $$1 = oj.a(dia.sF, "_bottom");
      this.b.accept(ob.a(dia.sF).a(b()).a(oc.a(dvt.ae).a(dvz.b, oe.a().a(of.c, $$1)).a(dvz.a, oe.a().a(of.c, $$0))));
   }

   private void f(dhy $$0, alh $$1, alh $$2) {
      this.b.accept(ob.a($$0).a(oc.a(dvt.ae).a(dvz.b, oe.a().a(of.c, $$2)).a(dvz.a, oe.a().a(of.c, $$1))));
   }

   private void n(dhy $$0) {
      om $$1 = om.e($$0);
      om $$2 = om.e(om.a($$0, "_corner"));
      alh $$3 = ol.as.a($$0, $$1, this.c);
      alh $$4 = ol.at.a($$0, $$2, this.c);
      alh $$5 = ol.au.a($$0, $$1, this.c);
      alh $$6 = ol.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            ob.a($$0)
               .a(
                  oc.a(dvt.ag)
                     .a(dwh.a, oe.a().a(of.c, $$3))
                     .a(dwh.b, oe.a().a(of.c, $$3).a(of.b, of.a.b))
                     .a(dwh.c, oe.a().a(of.c, $$5).a(of.b, of.a.b))
                     .a(dwh.d, oe.a().a(of.c, $$6).a(of.b, of.a.b))
                     .a(dwh.e, oe.a().a(of.c, $$5))
                     .a(dwh.f, oe.a().a(of.c, $$6))
                     .a(dwh.g, oe.a().a(of.c, $$4))
                     .a(dwh.h, oe.a().a(of.c, $$4).a(of.b, of.a.b))
                     .a(dwh.i, oe.a().a(of.c, $$4).a(of.b, of.a.c))
                     .a(dwh.j, oe.a().a(of.c, $$4).a(of.b, of.a.d))
               )
         );
   }

   private void o(dhy $$0) {
      alh $$1 = this.a($$0, "", ol.as, om::e);
      alh $$2 = this.a($$0, "", ol.au, om::e);
      alh $$3 = this.a($$0, "", ol.av, om::e);
      alh $$4 = this.a($$0, "_on", ol.as, om::e);
      alh $$5 = this.a($$0, "_on", ol.au, om::e);
      alh $$6 = this.a($$0, "_on", ol.av, om::e);
      oc $$7 = oc.a(dvt.w, dvt.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return oe.a().a(of.c, $$6x ? $$4 : $$1);
            case b:
               return oe.a().a(of.c, $$6x ? $$4 : $$1).a(of.b, of.a.b);
            case c:
               return oe.a().a(of.c, $$6x ? $$5 : $$2).a(of.b, of.a.b);
            case d:
               return oe.a().a(of.c, $$6x ? $$6 : $$3).a(of.b, of.a.b);
            case e:
               return oe.a().a(of.c, $$6x ? $$5 : $$2);
            case f:
               return oe.a().a(of.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(ob.a($$0).a($$7));
   }

   private nu.a a(alh $$0, dhy $$1) {
      return new nu.a($$0, $$1);
   }

   private nu.a f(dhy $$0, dhy $$1) {
      return new nu.a(oj.a($$0), $$1);
   }

   private void a(dhy $$0, cvt $$1) {
      alh $$2 = ol.aa.a($$0, om.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dhy $$0, alh $$1) {
      alh $$2 = ol.aa.a($$0, om.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dhy $$0, dhy $$1) {
      this.a($$0);
      alh $$2 = oo.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dhy $$0) {
      this.a($$0.j());
      alh $$1 = oo.k.create($$0, this.c);
      alh $$2 = oo.l.create($$0, this.c);
      alh $$3 = oo.m.create($$0, this.c);
      alh $$4 = oo.n.create($$0, this.c);
      this.b
         .accept(
            oa.a($$0)
               .a(nz.a().a(dvt.S, 1, 2, 3, 4).a(dvt.R, jl.c), oe.a().a(of.c, $$1))
               .a(nz.a().a(dvt.S, 1, 2, 3, 4).a(dvt.R, jl.f), oe.a().a(of.c, $$1).a(of.b, of.a.b))
               .a(nz.a().a(dvt.S, 1, 2, 3, 4).a(dvt.R, jl.d), oe.a().a(of.c, $$1).a(of.b, of.a.c))
               .a(nz.a().a(dvt.S, 1, 2, 3, 4).a(dvt.R, jl.e), oe.a().a(of.c, $$1).a(of.b, of.a.d))
               .a(nz.a().a(dvt.S, 2, 3, 4).a(dvt.R, jl.c), oe.a().a(of.c, $$2))
               .a(nz.a().a(dvt.S, 2, 3, 4).a(dvt.R, jl.f), oe.a().a(of.c, $$2).a(of.b, of.a.b))
               .a(nz.a().a(dvt.S, 2, 3, 4).a(dvt.R, jl.d), oe.a().a(of.c, $$2).a(of.b, of.a.c))
               .a(nz.a().a(dvt.S, 2, 3, 4).a(dvt.R, jl.e), oe.a().a(of.c, $$2).a(of.b, of.a.d))
               .a(nz.a().a(dvt.S, 3, 4).a(dvt.R, jl.c), oe.a().a(of.c, $$3))
               .a(nz.a().a(dvt.S, 3, 4).a(dvt.R, jl.f), oe.a().a(of.c, $$3).a(of.b, of.a.b))
               .a(nz.a().a(dvt.S, 3, 4).a(dvt.R, jl.d), oe.a().a(of.c, $$3).a(of.b, of.a.c))
               .a(nz.a().a(dvt.S, 3, 4).a(dvt.R, jl.e), oe.a().a(of.c, $$3).a(of.b, of.a.d))
               .a(nz.a().a(dvt.S, 4).a(dvt.R, jl.c), oe.a().a(of.c, $$4))
               .a(nz.a().a(dvt.S, 4).a(dvt.R, jl.f), oe.a().a(of.c, $$4).a(of.b, of.a.b))
               .a(nz.a().a(dvt.S, 4).a(dvt.R, jl.d), oe.a().a(of.c, $$4).a(of.b, of.a.c))
               .a(nz.a().a(dvt.S, 4).a(dvt.R, jl.e), oe.a().a(of.c, $$4).a(of.b, of.a.d))
         );
   }

   private void a(oo.a $$0, dhy... $$1) {
      for (dhy $$2 : $$1) {
         alh $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(oo.a $$0, dhy... $$1) {
      for (dhy $$2 : $$1) {
         alh $$3 = $$0.create($$2, this.c);
         this.b.accept(ob.a($$2, oe.a().a(of.c, $$3)).a(c()));
      }
   }

   private void h(dhy $$0, dhy $$1) {
      this.a($$0);
      om $$2 = om.b($$0, $$1);
      alh $$3 = ol.aI.a($$1, $$2, this.c);
      alh $$4 = ol.aJ.a($$1, $$2, this.c);
      alh $$5 = ol.aK.a($$1, $$2, this.c);
      alh $$6 = ol.aG.a($$1, $$2, this.c);
      alh $$7 = ol.aH.a($$1, $$2, this.c);
      cvt $$8 = $$1.j();
      ol.bz.a(oj.a($$8), om.F($$0), this.c);
      this.b
         .accept(
            oa.a($$1)
               .a(oe.a().a(of.c, $$3))
               .a(nz.a().a(dvt.L, true), oe.a().a(of.c, $$4))
               .a(nz.a().a(dvt.M, true), oe.a().a(of.c, $$4).a(of.b, of.a.b))
               .a(nz.a().a(dvt.N, true), oe.a().a(of.c, $$5))
               .a(nz.a().a(dvt.O, true), oe.a().a(of.c, $$5).a(of.b, of.a.b))
               .a(nz.a().a(dvt.L, false), oe.a().a(of.c, $$6))
               .a(nz.a().a(dvt.M, false), oe.a().a(of.c, $$7))
               .a(nz.a().a(dvt.N, false), oe.a().a(of.c, $$7).a(of.b, of.a.b))
               .a(nz.a().a(dvt.O, false), oe.a().a(of.c, $$6).a(of.b, of.a.d))
         );
   }

   private void q(dhy $$0) {
      om $$1 = om.z($$0);
      alh $$2 = ol.aL.a($$0, $$1, this.c);
      alh $$3 = this.a($$0, "_conditional", ol.aL, $$1x -> $$1.c(on.i, $$1x));
      this.b.accept(ob.a($$0).a(a(dvt.c, $$3, $$2)).a(e()));
   }

   private void r(dhy $$0) {
      alh $$1 = oo.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oe> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oe.a().a(of.c, oj.a(dia.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dia.mZ);
      this.b
         .accept(
            oa.a(dia.mZ)
               .a(nz.a().a(dvt.aq, 0), this.a(0))
               .a(nz.a().a(dvt.aq, 1), this.a(1))
               .a(nz.a().a(dvt.bk, dvp.b), oe.a().a(of.c, oj.a(dia.mZ, "_small_leaves")))
               .a(nz.a().a(dvt.bk, dvp.c), oe.a().a(of.c, oj.a(dia.mZ, "_large_leaves")))
         );
   }

   private oc n() {
      return oc.a(dvt.P)
         .a(jl.a, oe.a().a(of.a, of.a.c))
         .a(jl.b, oe.a())
         .a(jl.c, oe.a().a(of.a, of.a.b))
         .a(jl.d, oe.a().a(of.a, of.a.b).a(of.b, of.a.c))
         .a(jl.e, oe.a().a(of.a, of.a.b).a(of.b, of.a.d))
         .a(jl.f, oe.a().a(of.a, of.a.b).a(of.b, of.a.b));
   }

   private void o() {
      alh $$0 = om.a(dia.nU, "_top_open");
      this.b
         .accept(
            ob.a(dia.nU)
               .a(this.n())
               .a(
                  oc.a(dvt.u)
                     .a(false, oe.a().a(of.c, oo.f.create(dia.nU, this.c)))
                     .a(true, oe.a().a(of.c, oo.f.get(dia.nU).a($$1 -> $$1.a(on.f, $$0)).a(dia.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> oc a(dwg<T> $$0, T $$1, alh $$2, alh $$3) {
      oe $$4 = oe.a().a(of.c, $$2);
      oe $$5 = oe.a().a(of.c, $$3);
      return oc.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dhy $$0, Function<dhy, om> $$1) {
      om $$2 = $$1.apply($$0).b(on.i, on.c);
      om $$3 = $$2.c(on.g, om.a($$0, "_front_honey"));
      alh $$4 = ol.q.a($$0, "_empty", $$2, this.c);
      alh $$5 = ol.q.a($$0, "_honey", $$3, this.c);
      this.c($$0);
      ol.q.a(oj.a($$0.j(), "_empty"), $$2, this.c);
      ol.q.a(oj.a($$0.j(), "_honey"), $$3, this.c);
      this.b.accept(ob.a($$0).a(b()).a(a(dvt.aN, 5, $$5, $$4)));
   }

   private void a(dhy $$0, dwg<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alh> $$3 = new Int2ObjectOpenHashMap();
         oc $$4 = oc.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alh $$5 = (alh)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, ol.aV, om::g));
            return oe.a().a(of.c, $$5);
         });
         this.a($$0.j());
         this.b.accept(ob.a($$0).a($$4));
      }
   }

   private void p() {
      alh $$0 = oj.a(dia.od, "_floor");
      alh $$1 = oj.a(dia.od, "_ceiling");
      alh $$2 = oj.a(dia.od, "_wall");
      alh $$3 = oj.a(dia.od, "_between_walls");
      this.a(cwb.wu);
      this.b
         .accept(
            ob.a(dia.od)
               .a(
                  oc.a(dvt.R, dvt.V)
                     .a(jl.c, dvr.a, oe.a().a(of.c, $$0))
                     .a(jl.d, dvr.a, oe.a().a(of.c, $$0).a(of.b, of.a.c))
                     .a(jl.f, dvr.a, oe.a().a(of.c, $$0).a(of.b, of.a.b))
                     .a(jl.e, dvr.a, oe.a().a(of.c, $$0).a(of.b, of.a.d))
                     .a(jl.c, dvr.b, oe.a().a(of.c, $$1))
                     .a(jl.d, dvr.b, oe.a().a(of.c, $$1).a(of.b, of.a.c))
                     .a(jl.f, dvr.b, oe.a().a(of.c, $$1).a(of.b, of.a.b))
                     .a(jl.e, dvr.b, oe.a().a(of.c, $$1).a(of.b, of.a.d))
                     .a(jl.c, dvr.c, oe.a().a(of.c, $$2).a(of.b, of.a.d))
                     .a(jl.d, dvr.c, oe.a().a(of.c, $$2).a(of.b, of.a.b))
                     .a(jl.f, dvr.c, oe.a().a(of.c, $$2))
                     .a(jl.e, dvr.c, oe.a().a(of.c, $$2).a(of.b, of.a.c))
                     .a(jl.d, dvr.d, oe.a().a(of.c, $$3).a(of.b, of.a.b))
                     .a(jl.c, dvr.d, oe.a().a(of.c, $$3).a(of.b, of.a.d))
                     .a(jl.f, dvr.d, oe.a().a(of.c, $$3))
                     .a(jl.e, dvr.d, oe.a().a(of.c, $$3).a(of.b, of.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            ob.a(dia.nZ, oe.a().a(of.c, oj.a(dia.nZ)))
               .a(
                  oc.a(dvt.U, dvt.R)
                     .a(dvo.a, jl.c, oe.a())
                     .a(dvo.a, jl.f, oe.a().a(of.b, of.a.b))
                     .a(dvo.a, jl.d, oe.a().a(of.b, of.a.c))
                     .a(dvo.a, jl.e, oe.a().a(of.b, of.a.d))
                     .a(dvo.b, jl.c, oe.a().a(of.a, of.a.b))
                     .a(dvo.b, jl.f, oe.a().a(of.a, of.a.b).a(of.b, of.a.b))
                     .a(dvo.b, jl.d, oe.a().a(of.a, of.a.b).a(of.b, of.a.c))
                     .a(dvo.b, jl.e, oe.a().a(of.a, of.a.b).a(of.b, of.a.d))
                     .a(dvo.c, jl.d, oe.a().a(of.a, of.a.c))
                     .a(dvo.c, jl.e, oe.a().a(of.a, of.a.c).a(of.b, of.a.b))
                     .a(dvo.c, jl.c, oe.a().a(of.a, of.a.c).a(of.b, of.a.c))
                     .a(dvo.c, jl.f, oe.a().a(of.a, of.a.c).a(of.b, of.a.d))
               )
         );
   }

   private void d(dhy $$0, oo.a $$1) {
      alh $$2 = $$1.create($$0, this.c);
      alh $$3 = om.a($$0, "_front_on");
      alh $$4 = $$1.get($$0).a($$1x -> $$1x.a(on.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(ob.a($$0).a(a(dvt.r, $$4, $$2)).a(b()));
   }

   private void a(dhy... $$0) {
      alh $$1 = oj.a("campfire_off");

      for (dhy $$2 : $$0) {
         alh $$3 = ol.bc.a($$2, om.E($$2), this.c);
         this.a($$2.j());
         this.b.accept(ob.a($$2).a(a(dvt.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dhy $$0) {
      alh $$1 = ol.bv.a($$0, om.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dhy $$0) {
      alh $$1;
      if ($$0 == dia.tj) {
         $$1 = ol.bx.a($$0, om.m($$0), this.c);
      } else {
         $$1 = ol.bw.a($$0, om.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      om $$0 = om.a(om.G(dia.cl), om.G(dia.n));
      alh $$1 = ol.j.a(dia.cl, $$0, this.c);
      this.b.accept(c(dia.cl, $$1));
   }

   private void s() {
      this.a(cwb.lH);
      this.b
         .accept(
            oa.a(dia.cw)
               .a(
                  nz.b(
                     nz.a().a(dvt.ab, dwi.c).a(dvt.aa, dwi.c).a(dvt.ac, dwi.c).a(dvt.ad, dwi.c),
                     nz.a().a(dvt.ab, dwi.b, dwi.a).a(dvt.aa, dwi.b, dwi.a),
                     nz.a().a(dvt.aa, dwi.b, dwi.a).a(dvt.ac, dwi.b, dwi.a),
                     nz.a().a(dvt.ac, dwi.b, dwi.a).a(dvt.ad, dwi.b, dwi.a),
                     nz.a().a(dvt.ad, dwi.b, dwi.a).a(dvt.ab, dwi.b, dwi.a)
                  ),
                  oe.a().a(of.c, oj.a("redstone_dust_dot"))
               )
               .a(nz.a().a(dvt.ab, dwi.b, dwi.a), oe.a().a(of.c, oj.a("redstone_dust_side0")))
               .a(nz.a().a(dvt.ac, dwi.b, dwi.a), oe.a().a(of.c, oj.a("redstone_dust_side_alt0")))
               .a(nz.a().a(dvt.aa, dwi.b, dwi.a), oe.a().a(of.c, oj.a("redstone_dust_side_alt1")).a(of.b, of.a.d))
               .a(nz.a().a(dvt.ad, dwi.b, dwi.a), oe.a().a(of.c, oj.a("redstone_dust_side1")).a(of.b, of.a.d))
               .a(nz.a().a(dvt.ab, dwi.a), oe.a().a(of.c, oj.a("redstone_dust_up")))
               .a(nz.a().a(dvt.aa, dwi.a), oe.a().a(of.c, oj.a("redstone_dust_up")).a(of.b, of.a.b))
               .a(nz.a().a(dvt.ac, dwi.a), oe.a().a(of.c, oj.a("redstone_dust_up")).a(of.b, of.a.c))
               .a(nz.a().a(dvt.ad, dwi.a), oe.a().a(of.c, oj.a("redstone_dust_up")).a(of.b, of.a.d))
         );
   }

   private void t() {
      this.a(cwb.lL);
      this.b
         .accept(
            ob.a(dia.gY)
               .a(c())
               .a(
                  oc.a(dvt.bd, dvt.w)
                     .a(dvw.a, false, oe.a().a(of.c, oj.a(dia.gY)))
                     .a(dvw.a, true, oe.a().a(of.c, oj.a(dia.gY, "_on")))
                     .a(dvw.b, false, oe.a().a(of.c, oj.a(dia.gY, "_subtract")))
                     .a(dvw.b, true, oe.a().a(of.c, oj.a(dia.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      om $$0 = om.a(dia.jR);
      om $$1 = om.a(om.a(dia.jE, "_side"), $$0.a(on.f));
      alh $$2 = ol.ab.a(dia.jE, $$1, this.c);
      alh $$3 = ol.ac.a(dia.jE, $$1, this.c);
      alh $$4 = ol.j.b(dia.jE, "_double", $$1, this.c);
      this.b.accept(e(dia.jE, $$2, $$3, $$4));
      this.b.accept(c(dia.jR, ol.c.a(dia.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cwb.sr);
      this.b
         .accept(
            oa.a(dia.fs)
               .a(oe.a().a(of.c, om.G(dia.fs)))
               .a(nz.a().a(dvt.k, true), oe.a().a(of.c, om.a(dia.fs, "_bottle0")))
               .a(nz.a().a(dvt.l, true), oe.a().a(of.c, om.a(dia.fs, "_bottle1")))
               .a(nz.a().a(dvt.m, true), oe.a().a(of.c, om.a(dia.fs, "_bottle2")))
               .a(nz.a().a(dvt.k, false), oe.a().a(of.c, om.a(dia.fs, "_empty0")))
               .a(nz.a().a(dvt.l, false), oe.a().a(of.c, om.a(dia.fs, "_empty1")))
               .a(nz.a().a(dvt.m, false), oe.a().a(of.c, om.a(dia.fs, "_empty2")))
         );
   }

   private void u(dhy $$0) {
      alh $$1 = ol.br.a($$0, om.b($$0), this.c);
      alh $$2 = oj.a("mushroom_block_inside");
      this.b
         .accept(
            oa.a($$0)
               .a(nz.a().a(dvt.L, true), oe.a().a(of.c, $$1))
               .a(nz.a().a(dvt.M, true), oe.a().a(of.c, $$1).a(of.b, of.a.b).a(of.d, true))
               .a(nz.a().a(dvt.N, true), oe.a().a(of.c, $$1).a(of.b, of.a.c).a(of.d, true))
               .a(nz.a().a(dvt.O, true), oe.a().a(of.c, $$1).a(of.b, of.a.d).a(of.d, true))
               .a(nz.a().a(dvt.J, true), oe.a().a(of.c, $$1).a(of.a, of.a.d).a(of.d, true))
               .a(nz.a().a(dvt.K, true), oe.a().a(of.c, $$1).a(of.a, of.a.b).a(of.d, true))
               .a(nz.a().a(dvt.L, false), oe.a().a(of.c, $$2))
               .a(nz.a().a(dvt.M, false), oe.a().a(of.c, $$2).a(of.b, of.a.b).a(of.d, false))
               .a(nz.a().a(dvt.N, false), oe.a().a(of.c, $$2).a(of.b, of.a.c).a(of.d, false))
               .a(nz.a().a(dvt.O, false), oe.a().a(of.c, $$2).a(of.b, of.a.d).a(of.d, false))
               .a(nz.a().a(dvt.J, false), oe.a().a(of.c, $$2).a(of.a, of.a.d).a(of.d, false))
               .a(nz.a().a(dvt.K, false), oe.a().a(of.c, $$2).a(of.a, of.a.b).a(of.d, false))
         );
      this.a($$0, oo.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cwb.rC);
      this.b
         .accept(
            ob.a(dia.eg)
               .a(
                  oc.a(dvt.ay)
                     .a(0, oe.a().a(of.c, oj.a(dia.eg)))
                     .a(1, oe.a().a(of.c, oj.a(dia.eg, "_slice1")))
                     .a(2, oe.a().a(of.c, oj.a(dia.eg, "_slice2")))
                     .a(3, oe.a().a(of.c, oj.a(dia.eg, "_slice3")))
                     .a(4, oe.a().a(of.c, oj.a(dia.eg, "_slice4")))
                     .a(5, oe.a().a(of.c, oj.a(dia.eg, "_slice5")))
                     .a(6, oe.a().a(of.c, oj.a(dia.eg, "_slice6")))
               )
         );
   }

   private void x() {
      om $$0 = new om()
         .a(on.c, om.a(dia.nX, "_side3"))
         .a(on.o, om.G(dia.t))
         .a(on.n, om.a(dia.nX, "_top"))
         .a(on.j, om.a(dia.nX, "_side3"))
         .a(on.l, om.a(dia.nX, "_side3"))
         .a(on.k, om.a(dia.nX, "_side1"))
         .a(on.m, om.a(dia.nX, "_side2"));
      this.b.accept(c(dia.nX, ol.a.a(dia.nX, $$0, this.c)));
   }

   private void y() {
      om $$0 = new om()
         .a(on.c, om.a(dia.ob, "_front"))
         .a(on.o, om.a(dia.ob, "_bottom"))
         .a(on.n, om.a(dia.ob, "_top"))
         .a(on.j, om.a(dia.ob, "_front"))
         .a(on.k, om.a(dia.ob, "_front"))
         .a(on.l, om.a(dia.ob, "_side"))
         .a(on.m, om.a(dia.ob, "_side"));
      this.b.accept(c(dia.ob, ol.a.a(dia.ob, $$0, this.c)));
   }

   private void a(dhy $$0, dhy $$1, BiFunction<dhy, dhy, om> $$2) {
      om $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, ol.a.a($$0, $$3, this.c)));
   }

   public void b(dhy $$0) {
      om $$1 = new om()
         .a(on.c, om.a($$0, "_particle"))
         .a(on.o, om.a($$0, "_down"))
         .a(on.n, om.a($$0, "_up"))
         .a(on.j, om.a($$0, "_north"))
         .a(on.k, om.a($$0, "_south"))
         .a(on.l, om.a($$0, "_east"))
         .a(on.m, om.a($$0, "_west"));
      this.b.accept(c($$0, ol.a.a($$0, $$1, this.c)));
   }

   private void z() {
      om $$0 = om.k(dia.eZ);
      this.b.accept(c(dia.eZ, oj.a(dia.eZ)));
      this.a(dia.ee, $$0);
      this.a(dia.ef, $$0);
   }

   private void a(dhy $$0, om $$1) {
      alh $$2 = ol.p.a($$0, $$1.c(on.g, om.G($$0)), this.c);
      this.b.accept(ob.a($$0, oe.a().a(of.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cwb.ss);
      this.m(dia.ft);
      this.b.accept(c(dia.fv, ol.bu.a(dia.fv, om.j(om.a(dia.H, "_still")), this.c)));
      this.b
         .accept(
            ob.a(dia.fu)
               .a(
                  oc.a(dmg.g)
                     .a(1, oe.a().a(of.c, ol.bs.a(dia.fu, "_level1", om.j(om.a(dia.G, "_still")), this.c)))
                     .a(2, oe.a().a(of.c, ol.bt.a(dia.fu, "_level2", om.j(om.a(dia.G, "_still")), this.c)))
                     .a(3, oe.a().a(of.c, ol.bu.a(dia.fu, "_full", om.j(om.a(dia.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            ob.a(dia.fw)
               .a(
                  oc.a(dmg.g)
                     .a(1, oe.a().a(of.c, ol.bs.a(dia.fw, "_level1", om.j(om.G(dia.qP)), this.c)))
                     .a(2, oe.a().a(of.c, ol.bt.a(dia.fw, "_level2", om.j(om.G(dia.qP)), this.c)))
                     .a(3, oe.a().a(of.c, ol.bu.a(dia.fw, "_full", om.j(om.G(dia.qP)), this.c)))
               )
         );
   }

   private void B() {
      om $$0 = om.b(dia.kv);
      alh $$1 = ol.aE.a(dia.kv, $$0, this.c);
      alh $$2 = this.a(dia.kv, "_dead", ol.aE, $$1x -> $$0.c(on.b, $$1x));
      this.b.accept(ob.a(dia.kv).a(a(dvt.au, 5, $$2, $$1)));
   }

   private void C() {
      alh $$0 = oj.a(dia.tq);
      alh $$1 = oj.a(dia.tq, "_triggered");
      alh $$2 = oj.a(dia.tq, "_crafting");
      alh $$3 = oj.a(dia.tq, "_crafting_triggered");
      this.b
         .accept(
            ob.a(dia.tq)
               .a(oc.a(dvt.T).a($$0x -> this.a($$0x, oe.a())))
               .a(
                  oc.a(dvt.A, djr.b)
                     .a(false, false, oe.a().a(of.c, $$0))
                     .a(true, true, oe.a().a(of.c, $$3))
                     .a(true, false, oe.a().a(of.c, $$1))
                     .a(false, true, oe.a().a(of.c, $$2))
               )
         );
   }

   private void v(dhy $$0) {
      om $$1 = new om().a(on.f, om.a(dia.cD, "_top")).a(on.i, om.a(dia.cD, "_side")).a(on.g, om.a($$0, "_front"));
      om $$2 = new om().a(on.i, om.a(dia.cD, "_top")).a(on.g, om.a($$0, "_front_vertical"));
      alh $$3 = ol.p.a($$0, $$1, this.c);
      alh $$4 = ol.r.a($$0, $$2, this.c);
      this.b
         .accept(
            ob.a($$0)
               .a(
                  oc.a(dvt.P)
                     .a(jl.a, oe.a().a(of.c, $$4).a(of.a, of.a.c))
                     .a(jl.b, oe.a().a(of.c, $$4))
                     .a(jl.c, oe.a().a(of.c, $$3))
                     .a(jl.f, oe.a().a(of.c, $$3).a(of.b, of.a.b))
                     .a(jl.d, oe.a().a(of.c, $$3).a(of.b, of.a.c))
                     .a(jl.e, oe.a().a(of.c, $$3).a(of.b, of.a.d))
               )
         );
   }

   private void D() {
      alh $$0 = oj.a(dia.fy);
      alh $$1 = oj.a(dia.fy, "_filled");
      this.b.accept(ob.a(dia.fy).a(oc.a(dvt.h).a(false, oe.a().a(of.c, $$0)).a(true, oe.a().a(of.c, $$1))).a(c()));
   }

   private void E() {
      alh $$0 = oj.a(dia.ku, "_side");
      alh $$1 = oj.a(dia.ku, "_noside");
      alh $$2 = oj.a(dia.ku, "_noside1");
      alh $$3 = oj.a(dia.ku, "_noside2");
      alh $$4 = oj.a(dia.ku, "_noside3");
      this.b
         .accept(
            oa.a(dia.ku)
               .a(nz.a().a(dvt.L, true), oe.a().a(of.c, $$0))
               .a(nz.a().a(dvt.M, true), oe.a().a(of.c, $$0).a(of.b, of.a.b).a(of.d, true))
               .a(nz.a().a(dvt.N, true), oe.a().a(of.c, $$0).a(of.b, of.a.c).a(of.d, true))
               .a(nz.a().a(dvt.O, true), oe.a().a(of.c, $$0).a(of.b, of.a.d).a(of.d, true))
               .a(nz.a().a(dvt.J, true), oe.a().a(of.c, $$0).a(of.a, of.a.d).a(of.d, true))
               .a(nz.a().a(dvt.K, true), oe.a().a(of.c, $$0).a(of.a, of.a.b).a(of.d, true))
               .a(nz.a().a(dvt.L, false), oe.a().a(of.c, $$1).a(of.e, 2), oe.a().a(of.c, $$2), oe.a().a(of.c, $$3), oe.a().a(of.c, $$4))
               .a(
                  nz.a().a(dvt.M, false),
                  oe.a().a(of.c, $$2).a(of.b, of.a.b).a(of.d, true),
                  oe.a().a(of.c, $$3).a(of.b, of.a.b).a(of.d, true),
                  oe.a().a(of.c, $$4).a(of.b, of.a.b).a(of.d, true),
                  oe.a().a(of.c, $$1).a(of.e, 2).a(of.b, of.a.b).a(of.d, true)
               )
               .a(
                  nz.a().a(dvt.N, false),
                  oe.a().a(of.c, $$3).a(of.b, of.a.c).a(of.d, true),
                  oe.a().a(of.c, $$4).a(of.b, of.a.c).a(of.d, true),
                  oe.a().a(of.c, $$1).a(of.e, 2).a(of.b, of.a.c).a(of.d, true),
                  oe.a().a(of.c, $$2).a(of.b, of.a.c).a(of.d, true)
               )
               .a(
                  nz.a().a(dvt.O, false),
                  oe.a().a(of.c, $$4).a(of.b, of.a.d).a(of.d, true),
                  oe.a().a(of.c, $$1).a(of.e, 2).a(of.b, of.a.d).a(of.d, true),
                  oe.a().a(of.c, $$2).a(of.b, of.a.d).a(of.d, true),
                  oe.a().a(of.c, $$3).a(of.b, of.a.d).a(of.d, true)
               )
               .a(
                  nz.a().a(dvt.J, false),
                  oe.a().a(of.c, $$1).a(of.e, 2).a(of.a, of.a.d).a(of.d, true),
                  oe.a().a(of.c, $$4).a(of.a, of.a.d).a(of.d, true),
                  oe.a().a(of.c, $$2).a(of.a, of.a.d).a(of.d, true),
                  oe.a().a(of.c, $$3).a(of.a, of.a.d).a(of.d, true)
               )
               .a(
                  nz.a().a(dvt.K, false),
                  oe.a().a(of.c, $$4).a(of.a, of.a.b).a(of.d, true),
                  oe.a().a(of.c, $$3).a(of.a, of.a.b).a(of.d, true),
                  oe.a().a(of.c, $$2).a(of.a, of.a.b).a(of.d, true),
                  oe.a().a(of.c, $$1).a(of.e, 2).a(of.a, of.a.b).a(of.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            oa.a(dia.pc)
               .a(oe.a().a(of.c, om.G(dia.pc)))
               .a(nz.a().a(dvt.aL, 1), oe.a().a(of.c, om.a(dia.pc, "_contents1")))
               .a(nz.a().a(dvt.aL, 2), oe.a().a(of.c, om.a(dia.pc, "_contents2")))
               .a(nz.a().a(dvt.aL, 3), oe.a().a(of.c, om.a(dia.pc, "_contents3")))
               .a(nz.a().a(dvt.aL, 4), oe.a().a(of.c, om.a(dia.pc, "_contents4")))
               .a(nz.a().a(dvt.aL, 5), oe.a().a(of.c, om.a(dia.pc, "_contents5")))
               .a(nz.a().a(dvt.aL, 6), oe.a().a(of.c, om.a(dia.pc, "_contents6")))
               .a(nz.a().a(dvt.aL, 7), oe.a().a(of.c, om.a(dia.pc, "_contents7")))
               .a(nz.a().a(dvt.aL, 8), oe.a().a(of.c, om.a(dia.pc, "_contents_ready")))
         );
   }

   private void w(dhy $$0) {
      alh $$1 = ol.c.a($$0, om.a($$0), this.c);
      alh $$2 = this.a($$0, "_powered", ol.c, om::b);
      alh $$3 = this.a($$0, "_lit", ol.c, om::b);
      alh $$4 = this.a($$0, "_lit_powered", ol.c, om::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private ny a(dhy $$0, alh $$1, alh $$2, alh $$3, alh $$4) {
      return ob.a($$0).a(oc.a(dvt.r, dvt.w).a(($$4x, $$5) -> $$4x ? oe.a().a(of.c, $$5 ? $$4 : $$2) : oe.a().a(of.c, $$5 ? $$3 : $$1)));
   }

   private void i(dhy $$0, dhy $$1) {
      alh $$2 = oj.a($$0);
      alh $$3 = oj.a($$0, "_powered");
      alh $$4 = oj.a($$0, "_lit");
      alh $$5 = oj.a($$0, "_lit_powered");
      this.a($$1, oj.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dhy $$0) {
      this.c($$0);
      this.b.accept(ob.a($$0, oe.a().a(of.c, ol.ao.a($$0, om.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dia.qy);
      this.x(dia.qx);
      this.x(dia.qw);
      this.x(dia.qv);
   }

   private void H() {
      this.c(dia.st);
      oc.b<jl, dwa> $$0 = oc.a(dvt.bm, dvt.bn);

      for (dwa $$1 : dwa.values()) {
         $$0.a(jl.b, $$1, this.a(jl.b, $$1));
      }

      for (dwa $$2 : dwa.values()) {
         $$0.a(jl.a, $$2, this.a(jl.a, $$2));
      }

      this.b.accept(ob.a(dia.st).a($$0));
   }

   private oe a(jl $$0, dwa $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      om $$3 = om.c(om.a(dia.st, $$2));
      return oe.a().a(of.c, ol.an.a(dia.st, $$2, $$3, this.c));
   }

   private void y(dhy $$0) {
      om $$1 = new om().a(on.e, om.G(dia.dV)).a(on.f, om.G($$0)).a(on.i, om.a($$0, "_side"));
      this.b.accept(c($$0, ol.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alh $$0 = om.a(dia.gZ, "_side");
      om $$1 = new om().a(on.f, om.a(dia.gZ, "_top")).a(on.i, $$0);
      om $$2 = new om().a(on.f, om.a(dia.gZ, "_inverted_top")).a(on.i, $$0);
      this.b
         .accept(
            ob.a(dia.gZ)
               .a(oc.a(dvt.p).a(false, oe.a().a(of.c, ol.aF.a(dia.gZ, $$1, this.c))).a(true, oe.a().a(of.c, ol.aF.a(oj.a(dia.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dhy $$0) {
      this.b.accept(ob.a($$0, oe.a().a(of.c, oj.a($$0))).a(this.n()));
   }

   private void J() {
      dhy $$0 = dia.ss;
      alh $$1 = oj.a($$0, "_on");
      alh $$2 = oj.a($$0);
      this.b.accept(ob.a($$0, oe.a().a(of.c, oj.a($$0))).a(this.n()).a(a(dvt.w, $$1, $$2)));
   }

   private void K() {
      om $$0 = new om().a(on.B, om.G(dia.j)).a(on.f, om.G(dia.cC));
      om $$1 = new om().a(on.B, om.G(dia.j)).a(on.f, om.a(dia.cC, "_moist"));
      alh $$2 = ol.aW.a(dia.cC, $$0, this.c);
      alh $$3 = ol.aW.a(om.a(dia.cC, "_moist"), $$1, this.c);
      this.b.accept(ob.a(dia.cC).a(a(dvt.aQ, 7, $$3, $$2)));
   }

   private List<alh> A(dhy $$0) {
      alh $$1 = ol.aX.a(oj.a($$0, "_floor0"), om.v($$0), this.c);
      alh $$2 = ol.aX.a(oj.a($$0, "_floor1"), om.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alh> B(dhy $$0) {
      alh $$1 = ol.aY.a(oj.a($$0, "_side0"), om.v($$0), this.c);
      alh $$2 = ol.aY.a(oj.a($$0, "_side1"), om.w($$0), this.c);
      alh $$3 = ol.aZ.a(oj.a($$0, "_side_alt0"), om.v($$0), this.c);
      alh $$4 = ol.aZ.a(oj.a($$0, "_side_alt1"), om.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alh> C(dhy $$0) {
      alh $$1 = ol.ba.a(oj.a($$0, "_up0"), om.v($$0), this.c);
      alh $$2 = ol.ba.a(oj.a($$0, "_up1"), om.w($$0), this.c);
      alh $$3 = ol.bb.a(oj.a($$0, "_up_alt0"), om.v($$0), this.c);
      alh $$4 = ol.bb.a(oj.a($$0, "_up_alt1"), om.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<oe> a(List<alh> $$0, UnaryOperator<oe> $$1) {
      return $$0.stream().map($$0x -> oe.a().a(of.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nz $$0 = nz.a().a(dvt.L, false).a(dvt.M, false).a(dvt.N, false).a(dvt.O, false).a(dvt.J, false);
      List<alh> $$1 = this.A(dia.cr);
      List<alh> $$2 = this.B(dia.cr);
      List<alh> $$3 = this.C(dia.cr);
      this.b
         .accept(
            oa.a(dia.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nz.b(nz.a().a(dvt.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nz.b(nz.a().a(dvt.M, true), $$0), a($$2, $$0x -> $$0x.a(of.b, of.a.b)))
               .a(nz.b(nz.a().a(dvt.N, true), $$0), a($$2, $$0x -> $$0x.a(of.b, of.a.c)))
               .a(nz.b(nz.a().a(dvt.O, true), $$0), a($$2, $$0x -> $$0x.a(of.b, of.a.d)))
               .a(nz.a().a(dvt.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alh> $$0 = this.A(dia.cs);
      List<alh> $$1 = this.B(dia.cs);
      this.b
         .accept(
            oa.a(dia.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(of.b, of.a.b)))
               .a(a($$1, $$0x -> $$0x.a(of.b, of.a.c)))
               .a(a($$1, $$0x -> $$0x.a(of.b, of.a.d)))
         );
   }

   private void D(dhy $$0) {
      alh $$1 = oo.t.create($$0, this.c);
      alh $$2 = oo.u.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(ob.a($$0).a(a(dvt.j, $$2, $$1)));
   }

   private void N() {
      om $$0 = om.a(om.a(dia.ad, "_side"), om.a(dia.ad, "_top"));
      alh $$1 = ol.j.a(dia.ad, $$0, this.c);
      this.b.accept(d(dia.ad, $$1));
   }

   private void O() {
      this.a(cwb.ad);
      dhy $$0 = dia.E;
      oc.b<Boolean, Integer> $$1 = oc.a(dms.d, dms.b);
      alh $$2 = oj.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alh $$4 = oj.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oe.a().a(of.c, $$4));
         $$1.a(false, $$3, oe.a().a(of.c, $$2));
      }

      this.b.accept(ob.a(dia.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            ob.a(dia.kI)
               .a(
                  oc.a(dvt.as)
                     .a(0, oe.a().a(of.c, this.a(dia.kI, "_0", ol.c, om::b)))
                     .a(1, oe.a().a(of.c, this.a(dia.kI, "_1", ol.c, om::b)))
                     .a(2, oe.a().a(of.c, this.a(dia.kI, "_2", ol.c, om::b)))
                     .a(3, oe.a().a(of.c, this.a(dia.kI, "_3", ol.c, om::b)))
               )
         );
   }

   private void Q() {
      alh $$0 = om.G(dia.j);
      om $$1 = new om().a(on.e, $$0).b(on.e, on.c).a(on.f, om.a(dia.i, "_top")).a(on.i, om.a(dia.i, "_snow"));
      oe $$2 = oe.a().a(of.c, ol.n.a(dia.i, "_snow", $$1, this.c));
      this.a(dia.i, oj.a(dia.i), $$2);
      alh $$3 = oo.f.get(dia.fl).a($$1x -> $$1x.a(on.e, $$0)).a(dia.fl, this.c);
      this.a(dia.fl, $$3, $$2);
      alh $$4 = oo.f.get(dia.l).a($$1x -> $$1x.a(on.e, $$0)).a(dia.l, this.c);
      this.a(dia.l, $$4, $$2);
   }

   private void a(dhy $$0, alh $$1, oe $$2) {
      List<oe> $$3 = Arrays.asList(a($$1));
      this.b.accept(ob.a($$0).a(oc.a(dvt.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cwb.ri);
      this.b
         .accept(
            ob.a(dia.fC)
               .a(
                  oc.a(dvt.ar)
                     .a(0, oe.a().a(of.c, oj.a(dia.fC, "_stage0")))
                     .a(1, oe.a().a(of.c, oj.a(dia.fC, "_stage1")))
                     .a(2, oe.a().a(of.c, oj.a(dia.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dia.kE, oj.a(dia.kE)));
   }

   private void j(dhy $$0, dhy $$1) {
      om $$2 = om.b($$1);
      alh $$3 = ol.Y.a($$0, $$2, this.c);
      alh $$4 = ol.Z.a($$0, $$2, this.c);
      this.b.accept(ob.a($$0).a(a(dvt.aT, 1, $$4, $$3)));
   }

   private void T() {
      alh $$0 = oj.a(dia.hc);
      alh $$1 = oj.a(dia.hc, "_side");
      this.a(cwb.lR);
      this.b
         .accept(
            ob.a(dia.hc)
               .a(
                  oc.a(dvt.Q)
                     .a(jl.a, oe.a().a(of.c, $$0))
                     .a(jl.c, oe.a().a(of.c, $$1))
                     .a(jl.f, oe.a().a(of.c, $$1).a(of.b, of.a.b))
                     .a(jl.d, oe.a().a(of.c, $$1).a(of.b, of.a.c))
                     .a(jl.e, oe.a().a(of.c, $$1).a(of.b, of.a.d))
               )
         );
   }

   private void k(dhy $$0, dhy $$1) {
      alh $$2 = oj.a($$0);
      this.b.accept(ob.a($$1, oe.a().a(of.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alh $$0 = oj.a(dia.eW, "_post_ends");
      alh $$1 = oj.a(dia.eW, "_post");
      alh $$2 = oj.a(dia.eW, "_cap");
      alh $$3 = oj.a(dia.eW, "_cap_alt");
      alh $$4 = oj.a(dia.eW, "_side");
      alh $$5 = oj.a(dia.eW, "_side_alt");
      this.b
         .accept(
            oa.a(dia.eW)
               .a(oe.a().a(of.c, $$0))
               .a(nz.a().a(dvt.L, false).a(dvt.M, false).a(dvt.N, false).a(dvt.O, false), oe.a().a(of.c, $$1))
               .a(nz.a().a(dvt.L, true).a(dvt.M, false).a(dvt.N, false).a(dvt.O, false), oe.a().a(of.c, $$2))
               .a(nz.a().a(dvt.L, false).a(dvt.M, true).a(dvt.N, false).a(dvt.O, false), oe.a().a(of.c, $$2).a(of.b, of.a.b))
               .a(nz.a().a(dvt.L, false).a(dvt.M, false).a(dvt.N, true).a(dvt.O, false), oe.a().a(of.c, $$3))
               .a(nz.a().a(dvt.L, false).a(dvt.M, false).a(dvt.N, false).a(dvt.O, true), oe.a().a(of.c, $$3).a(of.b, of.a.b))
               .a(nz.a().a(dvt.L, true), oe.a().a(of.c, $$4))
               .a(nz.a().a(dvt.M, true), oe.a().a(of.c, $$4).a(of.b, of.a.b))
               .a(nz.a().a(dvt.N, true), oe.a().a(of.c, $$5))
               .a(nz.a().a(dvt.O, true), oe.a().a(of.c, $$5).a(of.b, of.a.b))
         );
      this.d(dia.eW);
   }

   private void E(dhy $$0) {
      this.b.accept(ob.a($$0, oe.a().a(of.c, oj.a($$0))).a(b()));
   }

   private void V() {
      alh $$0 = oj.a(dia.dw);
      alh $$1 = oj.a(dia.dw, "_on");
      this.d(dia.dw);
      this.b
         .accept(
            ob.a(dia.dw)
               .a(a(dvt.w, $$0, $$1))
               .a(
                  oc.a(dvt.U, dvt.R)
                     .a(dvo.c, jl.c, oe.a().a(of.a, of.a.c).a(of.b, of.a.c))
                     .a(dvo.c, jl.f, oe.a().a(of.a, of.a.c).a(of.b, of.a.d))
                     .a(dvo.c, jl.d, oe.a().a(of.a, of.a.c))
                     .a(dvo.c, jl.e, oe.a().a(of.a, of.a.c).a(of.b, of.a.b))
                     .a(dvo.a, jl.c, oe.a())
                     .a(dvo.a, jl.f, oe.a().a(of.b, of.a.b))
                     .a(dvo.a, jl.d, oe.a().a(of.b, of.a.c))
                     .a(dvo.a, jl.e, oe.a().a(of.b, of.a.d))
                     .a(dvo.b, jl.c, oe.a().a(of.a, of.a.b))
                     .a(dvo.b, jl.f, oe.a().a(of.a, of.a.b).a(of.b, of.a.b))
                     .a(dvo.b, jl.d, oe.a().a(of.a, of.a.b).a(of.b, of.a.c))
                     .a(dvo.b, jl.e, oe.a().a(of.a, of.a.b).a(of.b, of.a.d))
               )
         );
   }

   private void W() {
      this.d(dia.fm);
      this.b.accept(b(dia.fm, oj.a(dia.fm)));
   }

   private void X() {
      this.d(dia.tn);
      this.b.accept(c(dia.tn, oj.a(dia.tn)));
   }

   private void Y() {
      this.b.accept(ob.a(dia.ed).a(oc.a(dvt.H).a(jl.a.a, oe.a().a(of.c, oj.a(dia.ed, "_ns"))).a(jl.a.c, oe.a().a(of.c, oj.a(dia.ed, "_ew")))));
   }

   private void Z() {
      alh $$0 = oo.a.create(dia.dV, this.c);
      this.b
         .accept(
            ob.a(
               dia.dV,
               oe.a().a(of.c, $$0),
               oe.a().a(of.c, $$0).a(of.a, of.a.b),
               oe.a().a(of.c, $$0).a(of.a, of.a.c),
               oe.a().a(of.c, $$0).a(of.a, of.a.d),
               oe.a().a(of.c, $$0).a(of.b, of.a.b),
               oe.a().a(of.c, $$0).a(of.b, of.a.b).a(of.a, of.a.b),
               oe.a().a(of.c, $$0).a(of.b, of.a.b).a(of.a, of.a.c),
               oe.a().a(of.c, $$0).a(of.b, of.a.b).a(of.a, of.a.d),
               oe.a().a(of.c, $$0).a(of.b, of.a.c),
               oe.a().a(of.c, $$0).a(of.b, of.a.c).a(of.a, of.a.b),
               oe.a().a(of.c, $$0).a(of.b, of.a.c).a(of.a, of.a.c),
               oe.a().a(of.c, $$0).a(of.b, of.a.c).a(of.a, of.a.d),
               oe.a().a(of.c, $$0).a(of.b, of.a.d),
               oe.a().a(of.c, $$0).a(of.b, of.a.d).a(of.a, of.a.b),
               oe.a().a(of.c, $$0).a(of.b, of.a.d).a(of.a, of.a.c),
               oe.a().a(of.c, $$0).a(of.b, of.a.d).a(of.a, of.a.d)
            )
         );
   }

   private void aa() {
      alh $$0 = oj.a(dia.kO);
      alh $$1 = oj.a(dia.kO, "_on");
      this.b.accept(ob.a(dia.kO).a(a(dvt.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      om $$0 = new om().a(on.e, om.a(dia.by, "_bottom")).a(on.i, om.a(dia.by, "_side"));
      alh $$1 = om.a(dia.by, "_top_sticky");
      alh $$2 = om.a(dia.by, "_top");
      om $$3 = $$0.c(on.E, $$1);
      om $$4 = $$0.c(on.E, $$2);
      alh $$5 = oj.a(dia.by, "_base");
      this.a(dia.by, $$5, $$4);
      this.a(dia.br, $$5, $$3);
      alh $$6 = ol.n.a(dia.by, "_inventory", $$0.c(on.f, $$2), this.c);
      alh $$7 = ol.n.a(dia.br, "_inventory", $$0.c(on.f, $$1), this.c);
      this.a(dia.by, $$6);
      this.a(dia.br, $$7);
   }

   private void a(dhy $$0, alh $$1, om $$2) {
      alh $$3 = ol.bj.a($$0, $$2, this.c);
      this.b.accept(ob.a($$0).a(a(dvt.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      om $$0 = new om().a(on.F, om.a(dia.by, "_top")).a(on.i, om.a(dia.by, "_side"));
      om $$1 = $$0.c(on.E, om.a(dia.by, "_top_sticky"));
      om $$2 = $$0.c(on.E, om.a(dia.by, "_top"));
      this.b
         .accept(
            ob.a(dia.bz)
               .a(
                  oc.a(dvt.x, dvt.bg)
                     .a(false, dwf.a, oe.a().a(of.c, ol.bk.a(dia.by, "_head", $$2, this.c)))
                     .a(false, dwf.b, oe.a().a(of.c, ol.bk.a(dia.by, "_head_sticky", $$1, this.c)))
                     .a(true, dwf.a, oe.a().a(of.c, ol.bl.a(dia.by, "_head_short", $$2, this.c)))
                     .a(true, dwf.b, oe.a().a(of.c, ol.bl.a(dia.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dhy $$0 = dia.tr;
      om $$1 = om.a($$0, "_side_inactive", "_top_inactive");
      om $$2 = om.a($$0, "_side_active", "_top_active");
      om $$3 = om.a($$0, "_side_active", "_top_ejecting_reward");
      om $$4 = om.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      om $$5 = om.a($$0, "_side_active_ominous", "_top_active_ominous");
      om $$6 = om.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alh $$7 = ol.o.a($$0, $$1, this.c);
      alh $$8 = ol.o.a($$0, "_active", $$2, this.c);
      alh $$9 = ol.o.a($$0, "_ejecting_reward", $$3, this.c);
      alh $$10 = ol.o.a($$0, "_inactive_ominous", $$4, this.c);
      alh $$11 = ol.o.a($$0, "_active_ominous", $$5, this.c);
      alh $$12 = ol.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(ob.a($$0).a(oc.a(dvt.by, dvt.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oe.a().a(of.c, $$7x ? $$10 : $$7);
            case b, c, d -> oe.a().a(of.c, $$7x ? $$11 : $$8);
            case e -> oe.a().a(of.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dhy $$0 = dia.ts;
      om $$1 = om.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      om $$2 = om.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      om $$3 = om.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      om $$4 = om.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alh $$5 = ol.bP.a($$0, $$1, this.c);
      alh $$6 = ol.bP.a($$0, "_active", $$2, this.c);
      alh $$7 = ol.bP.a($$0, "_unlocking", $$3, this.c);
      alh $$8 = ol.bP.a($$0, "_ejecting_reward", $$4, this.c);
      om $$9 = om.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      om $$10 = om.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      om $$11 = om.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      om $$12 = om.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alh $$13 = ol.bP.a($$0, "_ominous", $$9, this.c);
      alh $$14 = ol.bP.a($$0, "_active_ominous", $$10, this.c);
      alh $$15 = ol.bP.a($$0, "_unlocking_ominous", $$11, this.c);
      alh $$16 = ol.bP.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(ob.a($$0).a(b()).a(oc.a(dqt.b, dqt.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oe.a().a(of.c, $$9x ? $$13 : $$5);
            case b -> oe.a().a(of.c, $$9x ? $$14 : $$6);
            case c -> oe.a().a(of.c, $$9x ? $$15 : $$7);
            case d -> oe.a().a(of.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alh $$0 = oj.a(dia.qQ, "_inactive");
      alh $$1 = oj.a(dia.qQ, "_active");
      this.a(dia.qQ, $$0);
      this.b.accept(ob.a(dia.qQ).a(oc.a(dvt.bo).a($$2 -> oe.a().a(of.c, $$2 != dwk.b && $$2 != dwk.c ? $$0 : $$1))));
   }

   private void ag() {
      alh $$0 = oj.a(dia.qR, "_inactive");
      alh $$1 = oj.a(dia.qR, "_active");
      this.a(dia.qR, $$0);
      this.b.accept(ob.a(dia.qR).a(oc.a(dvt.bo).a($$2 -> oe.a().a(of.c, $$2 != dwk.b && $$2 != dwk.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alh $$0 = ol.bO.a(dia.qV, om.a(false), this.c);
      alh $$1 = ol.bO.a(dia.qV, "_can_summon", om.a(true), this.c);
      this.a(dia.qV, $$0);
      this.b.accept(ob.a(dia.qV).a(a(dvt.G, $$1, $$0)));
   }

   private void ai() {
      alh $$0 = oj.a(dia.nS, "_stable");
      alh $$1 = oj.a(dia.nS, "_unstable");
      this.a(dia.nS, $$0);
      this.b.accept(ob.a(dia.nS).a(a(dvt.b, $$1, $$0)));
   }

   private void aj() {
      alh $$0 = this.a(dia.sv, "", ol.ao, om::c);
      alh $$1 = this.a(dia.sv, "_lit", ol.ao, om::c);
      this.b.accept(ob.a(dia.sv).a(a(dvt.D, $$1, $$0)));
      alh $$2 = this.a(dia.sw, "", ol.ao, om::c);
      alh $$3 = this.a(dia.sw, "_lit", ol.ao, om::c);
      this.b.accept(ob.a(dia.sw).a(a(dvt.D, $$3, $$2)));
   }

   private void ak() {
      alh $$0 = oo.a.create(dia.fB, this.c);
      alh $$1 = this.a(dia.fB, "_on", ol.c, om::b);
      this.b.accept(ob.a(dia.fB).a(a(dvt.r, $$1, $$0)));
   }

   private void l(dhy $$0, dhy $$1) {
      om $$2 = om.y($$0);
      this.b.accept(c($$0, ol.bf.a($$0, $$2, this.c)));
      this.b.accept(ob.a($$1, oe.a().a(of.c, ol.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      om $$0 = om.y(dia.dK);
      om $$1 = om.i(om.a(dia.dK, "_off"));
      alh $$2 = ol.bh.a(dia.dK, $$0, this.c);
      alh $$3 = ol.bh.a(dia.dK, "_off", $$1, this.c);
      this.b.accept(ob.a(dia.dK).a(a(dvt.r, $$2, $$3)));
      alh $$4 = ol.bi.a(dia.dL, $$0, this.c);
      alh $$5 = ol.bi.a(dia.dL, "_off", $$1, this.c);
      this.b.accept(ob.a(dia.dL).a(a(dvt.r, $$4, $$5)).a(d()));
      this.d(dia.dK);
      this.c(dia.dL);
   }

   private void am() {
      this.a(cwb.lK);
      this.b.accept(ob.a(dia.eh).a(oc.a(dvt.aA, dvt.s, dvt.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oe.a().a(of.c, om.a(dia.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cwb.cT);
      this.b
         .accept(
            ob.a(dia.mV)
               .a(
                  oc.a(dvt.aS, dvt.C)
                     .a(1, false, Arrays.asList(a(oj.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(oj.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(oj.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(oj.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(oj.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(oj.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(oj.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(oj.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      om $$0 = om.a(dia.dN);
      alh $$1 = ol.c.a(dia.dP, $$0, this.c);
      this.b.accept(ob.a(dia.dN).a(oc.a(dvt.aF).a($$1x -> oe.a().a(of.c, $$1x < 8 ? oj.a(dia.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dia.dN, oj.a(dia.dN, "_height2"));
      this.b.accept(c(dia.dP, $$1));
   }

   private void ap() {
      this.b.accept(ob.a(dia.oc, oe.a().a(of.c, oj.a(dia.oc))).a(b()));
   }

   private void aq() {
      alh $$0 = oo.a.create(dia.pa, this.c);
      this.a(dia.pa, $$0);
      this.b.accept(ob.a(dia.pa).a(oc.a(dvt.bj).a($$0x -> oe.a().a(of.c, this.a(dia.pa, "_" + $$0x.c(), ol.c, om::b)))));
   }

   private void ar() {
      this.a(cwb.wx);
      this.b.accept(ob.a(dia.oi).a(oc.a(dvt.as).a($$0 -> oe.a().a(of.c, this.a(dia.oi, "_stage" + $$0, ol.ao, om::c)))));
   }

   private void as() {
      this.a(cwb.pt);
      this.b
         .accept(
            ob.a(dia.fI)
               .a(
                  oc.a(dvt.a, dvt.M, dvt.L, dvt.N, dvt.O)
                     .a(false, false, false, false, false, oe.a().a(of.c, oj.a(dia.fI, "_ns")))
                     .a(false, true, false, false, false, oe.a().a(of.c, oj.a(dia.fI, "_n")).a(of.b, of.a.b))
                     .a(false, false, true, false, false, oe.a().a(of.c, oj.a(dia.fI, "_n")))
                     .a(false, false, false, true, false, oe.a().a(of.c, oj.a(dia.fI, "_n")).a(of.b, of.a.c))
                     .a(false, false, false, false, true, oe.a().a(of.c, oj.a(dia.fI, "_n")).a(of.b, of.a.d))
                     .a(false, true, true, false, false, oe.a().a(of.c, oj.a(dia.fI, "_ne")))
                     .a(false, true, false, true, false, oe.a().a(of.c, oj.a(dia.fI, "_ne")).a(of.b, of.a.b))
                     .a(false, false, false, true, true, oe.a().a(of.c, oj.a(dia.fI, "_ne")).a(of.b, of.a.c))
                     .a(false, false, true, false, true, oe.a().a(of.c, oj.a(dia.fI, "_ne")).a(of.b, of.a.d))
                     .a(false, false, true, true, false, oe.a().a(of.c, oj.a(dia.fI, "_ns")))
                     .a(false, true, false, false, true, oe.a().a(of.c, oj.a(dia.fI, "_ns")).a(of.b, of.a.b))
                     .a(false, true, true, true, false, oe.a().a(of.c, oj.a(dia.fI, "_nse")))
                     .a(false, true, false, true, true, oe.a().a(of.c, oj.a(dia.fI, "_nse")).a(of.b, of.a.b))
                     .a(false, false, true, true, true, oe.a().a(of.c, oj.a(dia.fI, "_nse")).a(of.b, of.a.c))
                     .a(false, true, true, false, true, oe.a().a(of.c, oj.a(dia.fI, "_nse")).a(of.b, of.a.d))
                     .a(false, true, true, true, true, oe.a().a(of.c, oj.a(dia.fI, "_nsew")))
                     .a(true, false, false, false, false, oe.a().a(of.c, oj.a(dia.fI, "_attached_ns")))
                     .a(true, false, true, false, false, oe.a().a(of.c, oj.a(dia.fI, "_attached_n")))
                     .a(true, false, false, true, false, oe.a().a(of.c, oj.a(dia.fI, "_attached_n")).a(of.b, of.a.c))
                     .a(true, true, false, false, false, oe.a().a(of.c, oj.a(dia.fI, "_attached_n")).a(of.b, of.a.b))
                     .a(true, false, false, false, true, oe.a().a(of.c, oj.a(dia.fI, "_attached_n")).a(of.b, of.a.d))
                     .a(true, true, true, false, false, oe.a().a(of.c, oj.a(dia.fI, "_attached_ne")))
                     .a(true, true, false, true, false, oe.a().a(of.c, oj.a(dia.fI, "_attached_ne")).a(of.b, of.a.b))
                     .a(true, false, false, true, true, oe.a().a(of.c, oj.a(dia.fI, "_attached_ne")).a(of.b, of.a.c))
                     .a(true, false, true, false, true, oe.a().a(of.c, oj.a(dia.fI, "_attached_ne")).a(of.b, of.a.d))
                     .a(true, false, true, true, false, oe.a().a(of.c, oj.a(dia.fI, "_attached_ns")))
                     .a(true, true, false, false, true, oe.a().a(of.c, oj.a(dia.fI, "_attached_ns")).a(of.b, of.a.b))
                     .a(true, true, true, true, false, oe.a().a(of.c, oj.a(dia.fI, "_attached_nse")))
                     .a(true, true, false, true, true, oe.a().a(of.c, oj.a(dia.fI, "_attached_nse")).a(of.b, of.a.b))
                     .a(true, false, true, true, true, oe.a().a(of.c, oj.a(dia.fI, "_attached_nse")).a(of.b, of.a.c))
                     .a(true, true, true, false, true, oe.a().a(of.c, oj.a(dia.fI, "_attached_nse")).a(of.b, of.a.d))
                     .a(true, true, true, true, true, oe.a().a(of.c, oj.a(dia.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dia.fH);
      this.b.accept(ob.a(dia.fH).a(oc.a(dvt.a, dvt.w).a(($$0, $$1) -> oe.a().a(of.c, om.a(dia.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alh a(int $$0, String $$1, om $$2) {
      switch ($$0) {
         case 1:
            return ol.bn.a(oj.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return ol.bo.a(oj.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return ol.bp.a(oj.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return ol.bq.a(oj.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private alh a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", om.b(om.G(dia.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", om.b(om.a(dia.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", om.b(om.a(dia.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cwb.kp);
      this.b.accept(ob.a(dia.mf).a(oc.a(dvt.aD, dvt.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cwb.kq);
      Function<Integer, alh> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         om $$2 = om.a($$1);
         return ol.by.a(dia.mg, $$1, $$2, this.c);
      };
      this.b.accept(ob.a(dia.mg).a(oc.a(dpg.c).a($$1 -> oe.a().a(of.c, $$0.apply($$1)))));
   }

   private void F(dhy $$0) {
      this.d($$0);
      alh $$1 = oj.a($$0);
      oa $$2 = oa.a($$0);
      nz.c $$3 = ad.a(nz.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dvu, Function<alh, oe>> $$4 : a) {
         dvu $$5 = (dvu)$$4.getFirst();
         Function<alh, oe> $$6 = (Function<alh, oe>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(nz.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      alh $$0 = om.a(dia.qU, "_bottom");
      om $$1 = new om().a(on.e, $$0).a(on.f, om.a(dia.qU, "_top")).a(on.i, om.a(dia.qU, "_side"));
      om $$2 = new om().a(on.e, $$0).a(on.f, om.a(dia.qU, "_top_bloom")).a(on.i, om.a(dia.qU, "_side_bloom"));
      alh $$3 = ol.n.a(dia.qU, "", $$1, this.c);
      alh $$4 = ol.n.a(dia.qU, "_bloom", $$2, this.c);
      this.b.accept(ob.a(dia.qU).a(oc.a(dvt.E).a($$2x -> oe.a().a(of.c, $$2x ? $$4 : $$3))));
      this.a(cwb.gj, $$3);
   }

   private void ax() {
      dhy $$0 = dia.cm;
      alh $$1 = oj.a($$0);
      oa $$2 = oa.a($$0);
      List.of(Pair.of(jl.c, of.a.a), Pair.of(jl.f, of.a.b), Pair.of(jl.d, of.a.c), Pair.of(jl.e, of.a.d)).forEach($$2x -> {
         jl $$3 = (jl)$$2x.getFirst();
         of.a $$4 = (of.a)$$2x.getSecond();
         nz.c $$5 = nz.a().a(dvt.R, $$3);
         $$2.a($$5, oe.a().a(of.c, $$1).a(of.b, $$4).a(of.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, oj.a($$0, "_inventory"));
      i.clear();
   }

   private void a(oa $$0, nz.c $$1, of.a $$2) {
      List.of(Pair.of(dvt.bp, ol.aM), Pair.of(dvt.bq, ol.aN), Pair.of(dvt.br, ol.aO), Pair.of(dvt.bs, ol.aP), Pair.of(dvt.bt, ol.aQ), Pair.of(dvt.bu, ol.aR))
         .forEach($$3 -> {
            dvu $$4 = (dvu)$$3.getFirst();
            ok $$5 = (ok)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(oa $$0, nz.c $$1, of.a $$2, dvu $$3, ok $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      om $$7 = new om().a(on.b, om.a(dia.cm, $$6));
      nu.d $$8 = new nu.d($$4, $$6);
      alh $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dia.cm, $$6, $$7, this.c));
      $$0.a(nz.a($$1, nz.a().a($$3, $$5)), oe.a().a(of.c, $$9).a(of.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dia.kJ, ol.c.a(dia.kJ, om.b(oj.a("magma")), this.c)));
   }

   private void G(dhy $$0) {
      this.b($$0, oo.q);
      ol.bF.a(oj.a($$0.j()), om.u($$0), this.c);
   }

   private void b(dhy $$0, dhy $$1, nu.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dhy $$0, dhy $$1) {
      ol.bG.a(oj.a($$0.j()), om.u($$1), this.c);
   }

   private void az() {
      alh $$0 = oj.a(dia.b);
      alh $$1 = oj.a(dia.b, "_mirrored");
      this.b.accept(a(dia.eN, $$0, $$1));
      this.a(dia.eN, $$0);
   }

   private void aA() {
      alh $$0 = oj.a(dia.sJ);
      alh $$1 = oj.a(dia.sJ, "_mirrored");
      this.b.accept(a(dia.td, $$0, $$1).a(f()));
      this.a(dia.td, $$0);
   }

   private void n(dhy $$0, dhy $$1) {
      this.a($$0, nu.e.b);
      om $$2 = om.d(om.a($$0, "_pot"));
      alh $$3 = nu.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alh $$0 = om.a(dia.pl, "_bottom");
      alh $$1 = om.a(dia.pl, "_top_off");
      alh $$2 = om.a(dia.pl, "_top");
      alh[] $$3 = new alh[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         om $$5 = new om().a(on.e, $$0).a(on.f, $$4 == 0 ? $$1 : $$2).a(on.i, om.a(dia.pl, "_side" + $$4));
         $$3[$$4] = ol.n.a(dia.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(ob.a(dia.pl).a(oc.a(dvt.aZ).a($$1x -> oe.a().a(of.c, $$3[$$1x]))));
      this.a(cwb.wV, $$3[0]);
   }

   private oe a(jn $$0, oe $$1) {
      switch ($$0) {
         case b:
            return $$1.a(of.a, of.a.b);
         case c:
            return $$1.a(of.a, of.a.b).a(of.b, of.a.c);
         case d:
            return $$1.a(of.a, of.a.b).a(of.b, of.a.d);
         case a:
            return $$1.a(of.a, of.a.b).a(of.b, of.a.b);
         case f:
            return $$1.a(of.a, of.a.d).a(of.b, of.a.c);
         case g:
            return $$1.a(of.a, of.a.d);
         case h:
            return $$1.a(of.a, of.a.d).a(of.b, of.a.b);
         case e:
            return $$1.a(of.a, of.a.d).a(of.b, of.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(of.b, of.a.c);
         case i:
            return $$1.a(of.b, of.a.d);
         case j:
            return $$1.a(of.b, of.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      alh $$0 = om.a(dia.pb, "_top");
      alh $$1 = om.a(dia.pb, "_bottom");
      alh $$2 = om.a(dia.pb, "_side");
      alh $$3 = om.a(dia.pb, "_lock");
      om $$4 = new om().a(on.o, $$2).a(on.m, $$2).a(on.l, $$2).a(on.c, $$0).a(on.j, $$0).a(on.k, $$1).a(on.n, $$3);
      alh $$5 = ol.b.a(dia.pb, $$4, this.c);
      this.b.accept(ob.a(dia.pb, oe.a().a(of.c, $$5)).a(oc.a(dvt.T).a($$0x -> this.a($$0x, oe.a()))));
   }

   private void aD() {
      dhy $$0 = dia.n;
      alh $$1 = oj.a($$0);
      oo $$2 = oo.a.get($$0);
      dhy $$3 = dia.jH;
      alh $$4 = ol.ab.a($$3, $$2.b(), this.c);
      alh $$5 = ol.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ma.a().filter(mb::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dia.rf).a(ma.w).a(dia.rf, dia.rD).a(dia.rj, dia.rn).a(ma.y);
      this.h(dia.re).a(ma.A).a(dia.re, dia.rC).a(dia.ri, dia.rm).a(ma.C);
      this.h(dia.rd).a(ma.E).a(dia.rd, dia.rB).a(dia.rh, dia.rl).a(ma.G);
      this.h(dia.rc).a(ma.I).a(dia.rc, dia.rA).a(dia.rg, dia.rk).a(ma.K);
      this.w(dia.sk);
      this.w(dia.sl);
      this.w(dia.sm);
      this.w(dia.sn);
      this.i(dia.sk, dia.so);
      this.i(dia.sl, dia.sp);
      this.i(dia.sm, dia.sq);
      this.i(dia.sn, dia.sr);
      this.m(dia.a);
      this.c(dia.nc, dia.a);
      this.c(dia.nb, dia.a);
      this.m(dia.fO);
      this.m(dia.dQ);
      this.c(dia.nd, dia.G);
      this.m(dia.fA);
      this.m(dia.me);
      this.m(dia.fr);
      this.m(dia.fR);
      this.a(cwb.ug);
      this.m(dia.pg);
      this.m(dia.G);
      this.m(dia.H);
      this.m(dia.hV);
      this.a(cwb.fS);
      this.o(dia.pM, dia.qd);
      this.o(dia.pN, dia.qe);
      this.o(dia.pO, dia.qf);
      this.o(dia.pP, dia.qg);
      this.o(dia.pQ, dia.qh);
      this.o(dia.pR, dia.qi);
      this.o(dia.pS, dia.qj);
      this.o(dia.pT, dia.qk);
      this.o(dia.pU, dia.ql);
      this.o(dia.pV, dia.qm);
      this.o(dia.pW, dia.qn);
      this.o(dia.pX, dia.qo);
      this.o(dia.pY, dia.qp);
      this.o(dia.pZ, dia.qq);
      this.o(dia.qa, dia.qr);
      this.o(dia.qb, dia.qs);
      this.o(dia.pL, dia.qc);
      this.m(dia.na);
      this.m(dia.gs);
      this.m(dia.qP);
      this.m(dia.sx);
      this.s(dia.sy);
      this.s(dia.sz);
      this.t(dia.ti);
      this.t(dia.tj);
      this.aj();
      this.g(dia.sC, dia.sA);
      this.p(dia.sB);
      this.a(dia.hW, cwb.hB);
      this.a(cwb.hB);
      this.aE();
      this.a(dia.kN, cwb.jb);
      this.a(cwb.jb);
      this.f(dia.bQ, om.a(dia.by, "_side"));
      this.a(dia.R);
      this.a(dia.S);
      this.a(dia.iB);
      this.a(dia.cx);
      this.a(dia.cy);
      this.a(dia.cz);
      this.a(dia.fE);
      this.a(dia.fF);
      this.a(dia.fJ);
      this.a(dia.N);
      this.a(dia.T);
      this.a(dia.O);
      this.a(dia.ch);
      this.a(dia.P);
      this.a(dia.Q);
      this.a(dia.ci);
      this.b(dia.pj, oo.d);
      this.a(dia.pi);
      this.a(dia.aR);
      this.a(dia.aS);
      this.a(dia.aT);
      this.a(dia.hb);
      this.a(dia.dI);
      this.a(dia.dJ);
      this.a(dia.ha);
      this.a(dia.pC);
      this.a(dia.mW);
      this.a(dia.dR);
      this.a(dia.k);
      this.a(dia.pk);
      this.a(dia.fz);
      this.a(dia.ec);
      this.a(dia.L);
      this.a(dia.ph);
      this.a(dia.dO);
      this.b(dia.dT, oo.g);
      this.b(dia.pq, oo.d);
      this.b(dia.fa, oo.d);
      this.m(dia.ac);
      this.m(dia.ga);
      this.a(dia.kK);
      this.a(dia.aY);
      this.a(dia.iC);
      this.a(dia.co);
      this.a(dia.pK);
      this.a(dia.ii);
      this.a(dia.oy);
      this.a(dia.dW);
      this.a(dia.dX);
      this.b(dia.ct, oo.b);
      this.a(dia.aO);
      this.b(dia.bw, oo.v);
      this.a(cwb.cS);
      this.b(dia.ck, oo.f);
      this.b(dia.pd, oo.d);
      this.a(dia.op);
      this.a(dia.aP);
      this.a(dia.qt);
      this.a(dia.qu);
      this.a(dia.qN);
      this.a(dia.su);
      this.a(dia.tf);
      this.a(dia.tg);
      this.a(dia.th);
      this.e(dia.qS);
      this.m(dia.tt);
      this.aD();
      this.a(dia.ra);
      this.a(dia.rb);
      this.a(dia.qW);
      this.a(dia.qX);
      this.a(dia.qY);
      this.a(dia.qZ);
      this.k(dia.qW, dia.rw);
      this.k(dia.qX, dia.ry);
      this.k(dia.qY, dia.rx);
      this.k(dia.qZ, dia.rz);
      this.i(dia.rM);
      this.i(dia.rN);
      this.i(dia.rP);
      this.i(dia.rO);
      this.a(dia.rM, dia.rQ);
      this.a(dia.rN, dia.rR);
      this.a(dia.rP, dia.rT);
      this.a(dia.rO, dia.rS);
      this.k(dia.rU);
      this.k(dia.rV);
      this.k(dia.rX);
      this.k(dia.rW);
      this.b(dia.rU, dia.rY);
      this.b(dia.rV, dia.rZ);
      this.b(dia.rX, dia.sb);
      this.b(dia.rW, dia.sa);
      this.a(dia.sc);
      this.a(dia.sd);
      this.a(dia.se);
      this.a(dia.sf);
      this.k(dia.sc, dia.sg);
      this.k(dia.sd, dia.sh);
      this.k(dia.se, dia.si);
      this.k(dia.sf, dia.sj);
      this.j(dia.gW, dia.ch);
      this.j(dia.gX, dia.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dia.og, dia.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dia.kt);
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
      this.F(dia.ff);
      this.F(dia.fg);
      this.F(dia.qT);
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
      this.E(dia.cO);
      this.d(dia.cO);
      this.E(dia.oa);
      this.g();
      this.E(dia.sE);
      this.l(dia.cp, dia.cq);
      this.l(dia.ea, dia.eb);
      this.a(dia.cA, dia.n, om::c);
      this.a(dia.nY, dia.p, om::d);
      this.y(dia.ow);
      this.y(dia.on);
      this.v(dia.aU);
      this.v(dia.hi);
      this.C();
      this.D(dia.oe);
      this.D(dia.of);
      this.e(dia.eX, oj.a(dia.eX));
      this.a(dia.dY, oo.d);
      this.a(dia.dZ, oo.d);
      this.a(dia.te);
      this.a(dia.kM, oo.d);
      this.f(dia.j);
      this.f(dia.sH);
      this.f(dia.I);
      this.g(dia.J);
      this.g(dia.M);
      this.f(dia.K);
      this.e(dia.F);
      this.b(dia.to, oo.f);
      this.a(dia.ij, oo.d, oo.e);
      this.a(dia.kx, oo.w, oo.x);
      this.a(dia.hf, oo.w, oo.x);
      this.a(dia.tk, oo.d, oo.e);
      this.a(dia.tl, oo.d, oo.e);
      this.a(dia.tm, oo.d, oo.e);
      this.c(dia.nT, oo.i);
      this.z();
      this.a(dia.pe, om::A);
      this.a(dia.pf, om::C);
      this.a(dia.kD, dvt.as, 0, 1, 2, 3);
      this.a(dia.gt, dvt.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dia.fq, dvt.as, 0, 1, 1, 2);
      this.a(dia.gu, dvt.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dia.cB, dvt.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dia.kA, nu.e.b, dvt.aq, 0, 1);
      this.i();
      this.h();
      this.a(oj.a("decorated_pot"), dia.iA).b(dia.tp);
      this.a(oj.a("banner"), dia.n)
         .a(ol.bH, dia.iJ, dia.iK, dia.iL, dia.iM, dia.iN, dia.iO, dia.iP, dia.iQ, dia.iR, dia.iS, dia.iT, dia.iU, dia.iV, dia.iW, dia.iX, dia.iY)
         .b(dia.iZ, dia.ja, dia.jb, dia.jc, dia.jd, dia.je, dia.jf, dia.jg, dia.jh, dia.ji, dia.jj, dia.jk, dia.jl, dia.jm, dia.jn, dia.jo);
      this.a(oj.a("bed"), dia.n)
         .b(dia.aZ, dia.ba, dia.bb, dia.bc, dia.bd, dia.be, dia.bf, dia.bg, dia.bh, dia.bi, dia.bj, dia.bk, dia.bl, dia.bm, dia.bn, dia.bo);
      this.m(dia.aZ, dia.bA);
      this.m(dia.ba, dia.bB);
      this.m(dia.bb, dia.bC);
      this.m(dia.bc, dia.bD);
      this.m(dia.bd, dia.bE);
      this.m(dia.be, dia.bF);
      this.m(dia.bf, dia.bG);
      this.m(dia.bg, dia.bH);
      this.m(dia.bh, dia.bI);
      this.m(dia.bi, dia.bJ);
      this.m(dia.bj, dia.bK);
      this.m(dia.bk, dia.bL);
      this.m(dia.bl, dia.bM);
      this.m(dia.bm, dia.bN);
      this.m(dia.bn, dia.bO);
      this.m(dia.bo, dia.bP);
      this.a(oj.a("skull"), dia.dW)
         .a(ol.bI, dia.gM, dia.gK, dia.gI, dia.gE, dia.gG, dia.gQ)
         .a(dia.gO)
         .b(dia.gN, dia.gP, dia.gL, dia.gJ, dia.gF, dia.gH, dia.gR);
      this.G(dia.kP);
      this.G(dia.kQ);
      this.G(dia.kR);
      this.G(dia.kS);
      this.G(dia.kT);
      this.G(dia.kU);
      this.G(dia.kV);
      this.G(dia.kW);
      this.G(dia.kX);
      this.G(dia.kY);
      this.G(dia.kZ);
      this.G(dia.la);
      this.G(dia.lb);
      this.G(dia.lc);
      this.G(dia.ld);
      this.G(dia.le);
      this.G(dia.lf);
      this.b(dia.mX, oo.q);
      this.c(dia.mX);
      this.a(oj.a("chest"), dia.n).b(dia.cv, dia.gV);
      this.a(oj.a("ender_chest"), dia.co).b(dia.fG);
      this.f(dia.fx, dia.co).a(dia.fx, dia.kF);
      this.a(dia.aM);
      this.a(dia.aN);
      this.a(dia.lw);
      this.a(dia.lx);
      this.a(dia.ly);
      this.a(dia.lz);
      this.a(dia.lA);
      this.a(dia.lB);
      this.a(dia.lC);
      this.a(dia.lD);
      this.a(dia.lE);
      this.a(dia.lF);
      this.a(dia.lG);
      this.a(dia.lH);
      this.a(dia.lI);
      this.a(dia.lJ);
      this.a(dia.lK);
      this.a(dia.lL);
      this.a(oo.a, dia.lM, dia.lN, dia.lO, dia.lP, dia.lQ, dia.lR, dia.lS, dia.lT, dia.lU, dia.lV, dia.lW, dia.lX, dia.lY, dia.lZ, dia.ma, dia.mb);
      this.a(dia.iA);
      this.a(dia.hj);
      this.a(dia.hk);
      this.a(dia.hl);
      this.a(dia.hm);
      this.a(dia.hn);
      this.a(dia.ho);
      this.a(dia.hp);
      this.a(dia.hq);
      this.a(dia.hr);
      this.a(dia.hs);
      this.a(dia.ht);
      this.a(dia.hu);
      this.a(dia.hv);
      this.a(dia.hw);
      this.a(dia.hx);
      this.a(dia.hy);
      this.a(dia.qO);
      this.h(dia.aQ, dia.eY);
      this.h(dia.ei, dia.hz);
      this.h(dia.ej, dia.hA);
      this.h(dia.ek, dia.hB);
      this.h(dia.el, dia.hC);
      this.h(dia.em, dia.hD);
      this.h(dia.en, dia.hE);
      this.h(dia.eo, dia.hF);
      this.h(dia.ep, dia.hG);
      this.h(dia.eq, dia.hH);
      this.h(dia.er, dia.hI);
      this.h(dia.es, dia.hJ);
      this.h(dia.et, dia.hK);
      this.h(dia.eu, dia.hL);
      this.h(dia.ev, dia.hM);
      this.h(dia.ew, dia.hN);
      this.h(dia.ex, dia.hO);
      this.b(oo.o, dia.lg, dia.lh, dia.li, dia.lj, dia.lk, dia.ll, dia.lm, dia.ln, dia.lo, dia.lp, dia.lq, dia.lr, dia.ls, dia.lt, dia.lu, dia.lv);
      this.g(dia.bA, dia.ik);
      this.g(dia.bB, dia.il);
      this.g(dia.bC, dia.im);
      this.g(dia.bD, dia.in);
      this.g(dia.bE, dia.io);
      this.g(dia.bF, dia.ip);
      this.g(dia.bG, dia.iq);
      this.g(dia.bH, dia.ir);
      this.g(dia.bI, dia.is);
      this.g(dia.bJ, dia.it);
      this.g(dia.bK, dia.iu);
      this.g(dia.bL, dia.iv);
      this.g(dia.bM, dia.iw);
      this.g(dia.bN, dia.ix);
      this.g(dia.bO, dia.iy);
      this.g(dia.bP, dia.iz);
      this.a(dia.sI);
      this.a(dia.eL);
      this.a(dia.bu, dia.gb, nu.e.a);
      this.a(dia.bR, dia.gc, nu.e.b);
      this.a(dia.bT, dia.gd, nu.e.b);
      this.a(dia.bU, dia.ge, nu.e.b);
      this.a(dia.bV, dia.gf, nu.e.b);
      this.a(dia.bW, dia.gg, nu.e.b);
      this.a(dia.bX, dia.gh, nu.e.b);
      this.a(dia.bY, dia.gi, nu.e.b);
      this.a(dia.bZ, dia.gj, nu.e.b);
      this.a(dia.ca, dia.gk, nu.e.b);
      this.a(dia.cb, dia.gl, nu.e.b);
      this.a(dia.cc, dia.gm, nu.e.b);
      this.a(dia.ce, dia.gn, nu.e.b);
      this.a(dia.cd, dia.go, nu.e.b);
      this.a(dia.cg, dia.gp, nu.e.b);
      this.a(dia.cf, dia.gq, nu.e.b);
      this.a(dia.bv, dia.gr, nu.e.b);
      this.a(dia.bS, dia.fS, nu.e.b);
      this.H();
      this.u(dia.eT);
      this.u(dia.eU);
      this.u(dia.eV);
      this.a(dia.bt, nu.e.a);
      this.b(dia.dS, nu.e.a);
      this.a(cwb.dJ);
      this.b(dia.mc, dia.md, nu.e.b);
      this.a(cwb.dK);
      this.c(dia.md);
      this.b(dia.sG, nu.e.b);
      this.c(dia.sG);
      this.c(dia.sw);
      this.b(dia.oz, dia.oA, nu.e.b);
      this.b(dia.oB, dia.oC, nu.e.b);
      this.a(dia.oz, "_plant");
      this.c(dia.oA);
      this.a(dia.oB, "_plant");
      this.c(dia.oC);
      this.a(dia.mY, nu.e.a, om.c(om.a(dia.mZ, "_stage0")));
      this.m();
      this.a(dia.bs, nu.e.b);
      this.c(dia.iE, nu.e.b);
      this.c(dia.iF, nu.e.b);
      this.c(dia.iG, nu.e.b);
      this.c(dia.iH, nu.e.a);
      this.c(dia.iI, nu.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dia.mw, dia.mr, dia.mm, dia.mh, dia.mG, dia.mB, dia.mQ, dia.mL);
      this.a(dia.mx, dia.ms, dia.mn, dia.mi, dia.mH, dia.mC, dia.mR, dia.mM);
      this.a(dia.my, dia.mt, dia.mo, dia.mj, dia.mI, dia.mD, dia.mS, dia.mN);
      this.a(dia.mz, dia.mu, dia.mp, dia.mk, dia.mJ, dia.mE, dia.mT, dia.mO);
      this.a(dia.mA, dia.mv, dia.mq, dia.ml, dia.mK, dia.mF, dia.mU, dia.mP);
      this.e(dia.fe, dia.fc);
      this.e(dia.fd, dia.fb);
      this.l(dia.ab).c(dia.ab).a(dia.av);
      this.l(dia.am).c(dia.am).a(dia.aD);
      this.a(dia.am, dia.dj, dia.ds);
      this.b(dia.aL, oo.s);
      this.l(dia.Y).c(dia.Y).a(dia.as);
      this.l(dia.ai).c(dia.ai).a(dia.aA);
      this.a(dia.ai, dia.dd, dia.do);
      this.a(dia.B, dia.fX, nu.e.b);
      this.b(dia.aI, oo.s);
      this.l(dia.Z).d(dia.Z).a(dia.at);
      this.l(dia.aj).d(dia.aj).a(dia.aB);
      this.a(dia.aj, dia.de, dia.dp);
      this.a(dia.C, dia.fY, nu.e.b);
      this.b(dia.aJ, oo.s);
      this.l(dia.W).c(dia.W).a(dia.aq);
      this.l(dia.ag).c(dia.ag).a(dia.ay);
      this.a(dia.ag, dia.dc, dia.dn);
      this.a(dia.z, dia.fV, nu.e.b);
      this.b(dia.aG, oo.s);
      this.l(dia.U).c(dia.U).a(dia.ao);
      this.l(dia.al).c(dia.al).a(dia.aw);
      this.a(dia.al, dia.da, dia.dl);
      this.a(dia.x, dia.fT, nu.e.b);
      this.b(dia.aE, oo.s);
      this.l(dia.V).c(dia.V).a(dia.ap);
      this.l(dia.af).c(dia.af).a(dia.ax);
      this.a(dia.af, dia.db, dia.dm);
      this.a(dia.y, dia.fU, nu.e.b);
      this.b(dia.aF, oo.s);
      this.l(dia.aa).c(dia.aa).a(dia.au);
      this.l(dia.ak).c(dia.ak).a(dia.aC);
      this.a(dia.ak, dia.dg, dia.dr);
      this.a(dia.D, dia.fZ, nu.e.b);
      this.b(dia.aK, oo.s);
      this.l(dia.X).c(dia.X).a(dia.ar);
      this.l(dia.ah).c(dia.ah).a(dia.az);
      this.a(dia.ah, dia.df, dia.dq);
      this.a(dia.A, dia.fW, nu.e.b);
      this.b(dia.aH, oo.s);
      this.l(dia.os).b(dia.os).a(dia.ou);
      this.l(dia.ot).b(dia.ot).a(dia.ov);
      this.a(dia.ot, dia.dh, dia.dt);
      this.a(dia.ox, dia.pm, nu.e.b);
      this.n(dia.oD, dia.po);
      this.l(dia.oj).b(dia.oj).a(dia.ol);
      this.l(dia.ok).b(dia.ok).a(dia.om);
      this.a(dia.ok, dia.di, dia.du);
      this.a(dia.oo, dia.pn, nu.e.b);
      this.n(dia.oq, dia.pp);
      this.l(dia.ae).d(dia.ae);
      this.l(dia.an).d(dia.an);
      this.a(dia.v, dia.dk, dia.dv);
      this.b(dia.or, nu.e.b);
      this.a(cwb.dG);
      this.i(dia.dy);
      this.k(dia.hY);
      this.u();
      this.n(dia.cP);
      this.o(dia.bp);
      this.o(dia.bq);
      this.o(dia.hh);
      this.t();
      this.q(dia.fN);
      this.q(dia.kG);
      this.q(dia.kH);
      this.r(dia.gS);
      this.r(dia.gT);
      this.r(dia.gU);
      this.o();
      this.p();
      this.d(dia.cD, oo.h);
      this.d(dia.nW, oo.h);
      this.d(dia.nV, oo.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dia.eK, dia.eS);
      this.k(dia.m, dia.eO);
      this.k(dia.eJ, dia.eR);
      this.k(dia.eI, dia.eQ);
      this.az();
      this.k(dia.eH, dia.eP);
      this.aA();
      cxg.c().forEach($$0 -> this.a($$0, oj.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dia.hX);
      oc.a<Integer> $$0 = oc.a(dvt.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alh $$3 = om.a(cwb.hC, $$2);
         $$0.a($$1, oe.a().a(of.c, ol.aa.a(dia.hX, $$2, om.h($$3), this.c)));
         ol.bz.a(oj.a(cwb.hC, $$2), om.k($$3), this.c);
      }

      this.b.accept(ob.a(dia.hX).a($$0));
   }

   private void o(dhy $$0, dhy $$1) {
      this.a($$0.j());
      om $$2 = om.b(om.G($$0));
      om $$3 = om.b(om.a($$0, "_lit"));
      alh $$4 = ol.bJ.a($$0, "_one_candle", $$2, this.c);
      alh $$5 = ol.bK.a($$0, "_two_candles", $$2, this.c);
      alh $$6 = ol.bL.a($$0, "_three_candles", $$2, this.c);
      alh $$7 = ol.bM.a($$0, "_four_candles", $$2, this.c);
      alh $$8 = ol.bJ.a($$0, "_one_candle_lit", $$3, this.c);
      alh $$9 = ol.bK.a($$0, "_two_candles_lit", $$3, this.c);
      alh $$10 = ol.bL.a($$0, "_three_candles_lit", $$3, this.c);
      alh $$11 = ol.bM.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            ob.a($$0)
               .a(
                  oc.a(dvt.az, dvt.r)
                     .a(1, false, oe.a().a(of.c, $$4))
                     .a(2, false, oe.a().a(of.c, $$5))
                     .a(3, false, oe.a().a(of.c, $$6))
                     .a(4, false, oe.a().a(of.c, $$7))
                     .a(1, true, oe.a().a(of.c, $$8))
                     .a(2, true, oe.a().a(of.c, $$9))
                     .a(3, true, oe.a().a(of.c, $$10))
                     .a(4, true, oe.a().a(of.c, $$11))
               )
         );
      alh $$12 = ol.bN.a($$1, om.a($$0, false), this.c);
      alh $$13 = ol.bN.a($$1, "_lit", om.a($$0, true), this.c);
      this.b.accept(ob.a($$1).a(a(dvt.r, $$13, $$12)));
   }

   class a {
      private final alh b;

      public a(final alh $$0, final dhy $$1) {
         this.b = ol.aa.a($$0, om.u($$1), nu.this.c);
      }

      public nu.a a(dhy... $$0) {
         for (dhy $$1 : $$0) {
            nu.this.b.accept(nu.c($$1, this.b));
         }

         return this;
      }

      public nu.a b(dhy... $$0) {
         for (dhy $$1 : $$0) {
            nu.this.c($$1);
         }

         return this.a($$0);
      }

      public nu.a a(ok $$0, dhy... $$1) {
         for (dhy $$2 : $$1) {
            $$0.a(oj.a($$2.j()), om.u($$2), nu.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final om b;
      private final Map<ok, alh> c = Maps.newHashMap();
      @Nullable
      private mb d;
      @Nullable
      private alh e;
      private final Set<dhy> f = new HashSet<>();

      public b(final om $$0) {
         this.b = $$0;
      }

      public nu.b a(dhy $$0, ok $$1) {
         this.e = $$1.a($$0, this.b, nu.this.c);
         if (nu.this.f.containsKey($$0)) {
            nu.this.b.accept(nu.this.f.get($$0).create($$0, this.e, this.b, nu.this.c));
         } else {
            nu.this.b.accept(nu.c($$0, this.e));
         }

         return this;
      }

      public nu.b a(dhy $$0, dhy $$1) {
         alh $$2 = oj.a($$0);
         nu.this.b.accept(nu.c($$1, $$2));
         nu.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nu.b a(dhy $$0) {
         alh $$1 = ol.s.a($$0, this.b, nu.this.c);
         alh $$2 = ol.t.a($$0, this.b, nu.this.c);
         nu.this.b.accept(nu.b($$0, $$1, $$2));
         alh $$3 = ol.u.a($$0, this.b, nu.this.c);
         nu.this.a($$0, $$3);
         return this;
      }

      public nu.b b(dhy $$0) {
         alh $$1 = ol.M.a($$0, this.b, nu.this.c);
         alh $$2 = ol.N.a($$0, this.b, nu.this.c);
         alh $$3 = ol.O.a($$0, this.b, nu.this.c);
         nu.this.b.accept(nu.a($$0, $$1, $$2, $$3));
         alh $$4 = ol.P.a($$0, this.b, nu.this.c);
         nu.this.a($$0, $$4);
         return this;
      }

      public nu.b c(dhy $$0) {
         om $$1 = om.p($$0);
         alh $$2 = ol.D.a($$0, $$1, nu.this.c);
         alh $$3 = ol.E.a($$0, $$1, nu.this.c);
         alh $$4 = ol.F.a($$0, $$1, nu.this.c);
         alh $$5 = ol.G.a($$0, $$1, nu.this.c);
         alh $$6 = ol.H.a($$0, $$1, nu.this.c);
         nu.this.b.accept(nu.a($$0, $$2, $$3, $$4, $$5, $$6));
         alh $$7 = ol.I.a($$0, $$1, nu.this.c);
         nu.this.a($$0, $$7);
         return this;
      }

      public nu.b d(dhy $$0) {
         alh $$1 = ol.J.a($$0, this.b, nu.this.c);
         alh $$2 = ol.K.a($$0, this.b, nu.this.c);
         nu.this.b.accept(nu.c($$0, $$1, $$2));
         alh $$3 = ol.L.a($$0, this.b, nu.this.c);
         nu.this.a($$0, $$3);
         return this;
      }

      public nu.b e(dhy $$0) {
         om $$1 = om.p($$0);
         alh $$2 = ol.R.a($$0, $$1, nu.this.c);
         alh $$3 = ol.Q.a($$0, $$1, nu.this.c);
         alh $$4 = ol.T.a($$0, $$1, nu.this.c);
         alh $$5 = ol.S.a($$0, $$1, nu.this.c);
         nu.this.b.accept(nu.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nu.b f(dhy $$0) {
         alh $$1 = ol.V.a($$0, this.b, nu.this.c);
         alh $$2 = ol.U.a($$0, this.b, nu.this.c);
         alh $$3 = ol.X.a($$0, this.b, nu.this.c);
         alh $$4 = ol.W.a($$0, this.b, nu.this.c);
         nu.this.b.accept(nu.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nu.b g(dhy $$0) {
         alh $$1 = ol.Y.a($$0, this.b, nu.this.c);
         alh $$2 = ol.Z.a($$0, this.b, nu.this.c);
         nu.this.b.accept(nu.e($$0, $$1, $$2));
         return this;
      }

      public nu.b h(dhy $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dhy $$1 = this.d.b().get(mb.b.r);
            alh $$2 = ol.aa.a($$0, this.b, nu.this.c);
            nu.this.b.accept(nu.c($$0, $$2));
            nu.this.b.accept(nu.c($$1, $$2));
            nu.this.a($$0.j());
            nu.this.c($$1);
            return this;
         }
      }

      public nu.b i(dhy $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alh $$1 = this.a(ol.ab, $$0);
            alh $$2 = this.a(ol.ac, $$0);
            nu.this.b.accept(nu.e($$0, $$1, $$2, this.e));
            nu.this.a($$0, $$1);
            return this;
         }
      }

      public nu.b j(dhy $$0) {
         alh $$1 = this.a(ol.af, $$0);
         alh $$2 = this.a(ol.ae, $$0);
         alh $$3 = this.a(ol.ag, $$0);
         nu.this.b.accept(nu.b($$0, $$1, $$2, $$3));
         nu.this.a($$0, $$2);
         return this;
      }

      private nu.b k(dhy $$0) {
         oo $$1 = nu.this.g.getOrDefault($$0, oo.a.get($$0));
         alh $$2 = $$1.a($$0, nu.this.c);
         nu.this.b.accept(nu.c($$0, $$2));
         return this;
      }

      private nu.b l(dhy $$0) {
         nu.this.i($$0);
         return this;
      }

      private void m(dhy $$0) {
         if (nu.this.e.contains($$0)) {
            nu.this.k($$0);
         } else {
            nu.this.j($$0);
         }
      }

      private alh a(ok $$0, dhy $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nu.this.c));
      }

      public nu.b a(mb $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nu.b, dhy> $$2 = nu.h.get($$0x);
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
      ny create(dhy var1, alh var2, om var3, BiConsumer<alh, Supplier<JsonElement>> var4);
   }

   static record d(ok a, String b) {
   }

   static enum e {
      a,
      b;

      public ok a() {
         return this == a ? ol.ap : ol.ao;
      }

      public ok b() {
         return this == a ? ol.ar : ol.aq;
      }
   }

   class f {
      private final om b;

      public f(final om $$0) {
         this.b = $$0;
      }

      public nu.f a(dhy $$0) {
         om $$1 = this.b.c(on.d, this.b.a(on.i));
         alh $$2 = ol.j.a($$0, $$1, nu.this.c);
         nu.this.b.accept(nu.d($$0, $$2));
         return this;
      }

      public nu.f b(dhy $$0) {
         alh $$1 = ol.j.a($$0, this.b, nu.this.c);
         nu.this.b.accept(nu.d($$0, $$1));
         return this;
      }

      public nu.f c(dhy $$0) {
         alh $$1 = ol.j.a($$0, this.b, nu.this.c);
         alh $$2 = ol.k.a($$0, this.b, nu.this.c);
         nu.this.b.accept(nu.d($$0, $$1, $$2));
         return this;
      }

      public nu.f d(dhy $$0) {
         nu.this.b.accept(nu.a($$0, this.b, nu.this.c));
         return this;
      }
   }
}
