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

public class no {
   final Consumer<nr> b;
   final BiConsumer<akr, Supplier<JsonElement>> c;
   private final Consumer<cul> d;
   final List<dfy> e = ImmutableList.of(dga.ey, dga.eE, dga.hY);
   final Map<dfy, no.c> f = ImmutableMap.builder().put(dga.b, no::a).put(dga.sJ, no::c).put(dga.eM, no::b).build();
   final Map<dfy, oh> g = ImmutableMap.builder()
      .put(dga.aV, oh.y.get(dga.aV))
      .put(dga.jp, oh.y.get(dga.jp))
      .put(dga.jS, oh.a(of.a(dga.aV, "_top")))
      .put(dga.jU, oh.a(of.a(dga.jp, "_top")))
      .put(dga.aX, oh.d.get(dga.aV).a($$0x -> $$0x.a(og.i, of.G(dga.aX))))
      .put(dga.jr, oh.d.get(dga.jp).a($$0x -> $$0x.a(og.i, of.G(dga.jr))))
      .put(dga.hd, oh.d.get(dga.hd))
      .put(dga.jT, oh.a(of.a(dga.hd, "_bottom")))
      .put(dga.pr, oh.z.get(dga.pr))
      .put(dga.sJ, oh.z.get(dga.sJ))
      .put(dga.he, oh.d.get(dga.he).a($$0x -> $$0x.a(og.i, of.G(dga.he))))
      .put(dga.aW, oh.d.get(dga.aW).a($$0x -> {
         $$0x.a(og.d, of.a(dga.aV, "_top"));
         $$0x.a(og.i, of.G(dga.aW));
      }))
      .put(dga.jq, oh.d.get(dga.jq).a($$0x -> {
         $$0x.a(og.d, of.a(dga.jp, "_top"));
         $$0x.a(og.i, of.G(dga.jq));
      }))
      .put(dga.qM, oh.z.get(dga.qM))
      .put(dga.qH, oh.z.get(dga.qH))
      .build();
   static final Map<lx.b, BiConsumer<no.b, dfy>> h = ImmutableMap.builder()
      .put(lx.b.a, no.b::a)
      .put(lx.b.e, no.b::l)
      .put(lx.b.b, no.b::k)
      .put(lx.b.c, no.b::k)
      .put(lx.b.f, no.b::c)
      .put(lx.b.g, no.b::d)
      .put(lx.b.h, no.b::e)
      .put(lx.b.i, no.b::f)
      .put(lx.b.k, no.b::h)
      .put(lx.b.l, no.b::i)
      .put(lx.b.m, no.b::j)
      .put(lx.b.n, no.b::g)
      .put(lx.b.p, no.b::m)
      .put(lx.b.q, no.b::b)
      .build();
   public static final List<Pair<dtt, Function<akr, nx>>> a = List.of(
      Pair.of(dts.L, (Function<akr, nx>)$$0 -> nx.a().a(ny.c, $$0)),
      Pair.of(dts.M, (Function<akr, nx>)$$0 -> nx.a().a(ny.c, $$0).a(ny.b, ny.a.b).a(ny.d, true)),
      Pair.of(dts.N, (Function<akr, nx>)$$0 -> nx.a().a(ny.c, $$0).a(ny.b, ny.a.c).a(ny.d, true)),
      Pair.of(dts.O, (Function<akr, nx>)$$0 -> nx.a().a(ny.c, $$0).a(ny.b, ny.a.d).a(ny.d, true)),
      Pair.of(dts.J, (Function<akr, nx>)$$0 -> nx.a().a(ny.c, $$0).a(ny.a, ny.a.d).a(ny.d, true)),
      Pair.of(dts.K, (Function<akr, nx>)$$0 -> nx.a().a(ny.c, $$0).a(ny.a, ny.a.b).a(ny.d, true))
   );
   private static final Map<no.d, akr> i = new HashMap<>();

   private static nr a(dfy $$0, akr $$1, of $$2, BiConsumer<akr, Supplier<JsonElement>> $$3) {
      akr $$4 = oe.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nr b(dfy $$0, akr $$1, of $$2, BiConsumer<akr, Supplier<JsonElement>> $$3) {
      akr $$4 = oe.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nr c(dfy $$0, akr $$1, of $$2, BiConsumer<akr, Supplier<JsonElement>> $$3) {
      akr $$4 = oe.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public no(Consumer<nr> $$0, BiConsumer<akr, Supplier<JsonElement>> $$1, Consumer<cul> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dfy $$0) {
      this.d.accept($$0.r());
   }

   void a(dfy $$0, akr $$1) {
      this.c.accept(oc.a($$0.r()), new ob($$1));
   }

   private void a(cul $$0, akr $$1) {
      this.c.accept(oc.a($$0), new ob($$1));
   }

   void a(cul $$0) {
      oe.bx.a(oc.a($$0), of.b($$0), this.c);
   }

   private void d(dfy $$0) {
      cul $$1 = $$0.r();
      if ($$1 != cut.a) {
         oe.bx.a(oc.a($$1), of.F($$0), this.c);
      }
   }

   private void a(dfy $$0, String $$1) {
      cul $$2 = $$0.r();
      oe.bx.a(oc.a($$2), of.k(of.a($$0, $$1)), this.c);
   }

   private static nv b() {
      return nv.a(dts.R).a(ji.f, nx.a().a(ny.b, ny.a.b)).a(ji.d, nx.a().a(ny.b, ny.a.c)).a(ji.e, nx.a().a(ny.b, ny.a.d)).a(ji.c, nx.a());
   }

   private static nv c() {
      return nv.a(dts.R).a(ji.d, nx.a()).a(ji.e, nx.a().a(ny.b, ny.a.b)).a(ji.c, nx.a().a(ny.b, ny.a.c)).a(ji.f, nx.a().a(ny.b, ny.a.d));
   }

   private static nv d() {
      return nv.a(dts.R).a(ji.f, nx.a()).a(ji.d, nx.a().a(ny.b, ny.a.b)).a(ji.e, nx.a().a(ny.b, ny.a.c)).a(ji.c, nx.a().a(ny.b, ny.a.d));
   }

   private static nv e() {
      return nv.a(dts.P)
         .a(ji.a, nx.a().a(ny.a, ny.a.b))
         .a(ji.b, nx.a().a(ny.a, ny.a.d))
         .a(ji.c, nx.a())
         .a(ji.d, nx.a().a(ny.b, ny.a.c))
         .a(ji.e, nx.a().a(ny.b, ny.a.d))
         .a(ji.f, nx.a().a(ny.b, ny.a.b));
   }

   private static nu b(dfy $$0, akr $$1) {
      return nu.a($$0, a($$1));
   }

   private static nx[] a(akr $$0) {
      return new nx[]{nx.a().a(ny.c, $$0), nx.a().a(ny.c, $$0).a(ny.b, ny.a.b), nx.a().a(ny.c, $$0).a(ny.b, ny.a.c), nx.a().a(ny.c, $$0).a(ny.b, ny.a.d)};
   }

   private static nu a(dfy $$0, akr $$1, akr $$2) {
      return nu.a($$0, nx.a().a(ny.c, $$1), nx.a().a(ny.c, $$2), nx.a().a(ny.c, $$1).a(ny.b, ny.a.c), nx.a().a(ny.c, $$2).a(ny.b, ny.a.c));
   }

   private static nv a(dtt $$0, akr $$1, akr $$2) {
      return nv.a($$0).a(true, nx.a().a(ny.c, $$1)).a(false, nx.a().a(ny.c, $$2));
   }

   private void e(dfy $$0) {
      akr $$1 = oh.a.create($$0, this.c);
      akr $$2 = oh.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dfy $$0) {
      akr $$1 = oh.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dfy $$0) {
      this.b.accept(nu.a($$0).a(nv.a(dts.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akr $$3 = of.a($$0, $$2);
         return nx.a().a(ny.c, oe.c.a($$0, $$2, new of().a(og.a, $$3), this.c));
      })));
      this.a($$0, of.a($$0, "_0"));
   }

   static nr b(dfy $$0, akr $$1, akr $$2) {
      return nu.a($$0)
         .a(nv.a(dts.w).a(false, nx.a().a(ny.c, $$1)).a(true, nx.a().a(ny.c, $$2)))
         .a(
            nv.a(dts.U, dts.R)
               .a(dtn.a, ji.f, nx.a().a(ny.b, ny.a.b))
               .a(dtn.a, ji.e, nx.a().a(ny.b, ny.a.d))
               .a(dtn.a, ji.d, nx.a().a(ny.b, ny.a.c))
               .a(dtn.a, ji.c, nx.a())
               .a(dtn.b, ji.f, nx.a().a(ny.b, ny.a.b).a(ny.a, ny.a.b).a(ny.d, true))
               .a(dtn.b, ji.e, nx.a().a(ny.b, ny.a.d).a(ny.a, ny.a.b).a(ny.d, true))
               .a(dtn.b, ji.d, nx.a().a(ny.b, ny.a.c).a(ny.a, ny.a.b).a(ny.d, true))
               .a(dtn.b, ji.c, nx.a().a(ny.a, ny.a.b).a(ny.d, true))
               .a(dtn.c, ji.f, nx.a().a(ny.b, ny.a.d).a(ny.a, ny.a.c))
               .a(dtn.c, ji.e, nx.a().a(ny.b, ny.a.b).a(ny.a, ny.a.c))
               .a(dtn.c, ji.d, nx.a().a(ny.a, ny.a.c))
               .a(dtn.c, ji.c, nx.a().a(ny.b, ny.a.c).a(ny.a, ny.a.c))
         );
   }

   private static nv.d<ji, dty, dtx, Boolean> a(nv.d<ji, dty, dtx, Boolean> $$0, dty $$1, akr $$2, akr $$3, akr $$4, akr $$5) {
      return $$0.a(ji.f, $$1, dtx.a, false, nx.a().a(ny.c, $$2))
         .a(ji.d, $$1, dtx.a, false, nx.a().a(ny.c, $$2).a(ny.b, ny.a.b))
         .a(ji.e, $$1, dtx.a, false, nx.a().a(ny.c, $$2).a(ny.b, ny.a.c))
         .a(ji.c, $$1, dtx.a, false, nx.a().a(ny.c, $$2).a(ny.b, ny.a.d))
         .a(ji.f, $$1, dtx.b, false, nx.a().a(ny.c, $$4))
         .a(ji.d, $$1, dtx.b, false, nx.a().a(ny.c, $$4).a(ny.b, ny.a.b))
         .a(ji.e, $$1, dtx.b, false, nx.a().a(ny.c, $$4).a(ny.b, ny.a.c))
         .a(ji.c, $$1, dtx.b, false, nx.a().a(ny.c, $$4).a(ny.b, ny.a.d))
         .a(ji.f, $$1, dtx.a, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.b))
         .a(ji.d, $$1, dtx.a, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.c))
         .a(ji.e, $$1, dtx.a, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.d))
         .a(ji.c, $$1, dtx.a, true, nx.a().a(ny.c, $$3))
         .a(ji.f, $$1, dtx.b, true, nx.a().a(ny.c, $$5).a(ny.b, ny.a.d))
         .a(ji.d, $$1, dtx.b, true, nx.a().a(ny.c, $$5))
         .a(ji.e, $$1, dtx.b, true, nx.a().a(ny.c, $$5).a(ny.b, ny.a.b))
         .a(ji.c, $$1, dtx.b, true, nx.a().a(ny.c, $$5).a(ny.b, ny.a.c));
   }

   private static nr a(dfy $$0, akr $$1, akr $$2, akr $$3, akr $$4, akr $$5, akr $$6, akr $$7, akr $$8) {
      return nu.a($$0).a(a(a(nv.a(dts.R, dts.ae, dts.be, dts.u), dty.b, $$1, $$2, $$3, $$4), dty.a, $$5, $$6, $$7, $$8));
   }

   static nr a(dfy $$0, akr $$1, akr $$2, akr $$3, akr $$4, akr $$5) {
      return nt.a($$0)
         .a(nx.a().a(ny.c, $$1))
         .a(ns.a().a(dts.L, true), nx.a().a(ny.c, $$2).a(ny.d, false))
         .a(ns.a().a(dts.M, true), nx.a().a(ny.c, $$3).a(ny.d, false))
         .a(ns.a().a(dts.N, true), nx.a().a(ny.c, $$4).a(ny.d, false))
         .a(ns.a().a(dts.O, true), nx.a().a(ny.c, $$5).a(ny.d, false));
   }

   static nr c(dfy $$0, akr $$1, akr $$2) {
      return nt.a($$0)
         .a(nx.a().a(ny.c, $$1))
         .a(ns.a().a(dts.L, true), nx.a().a(ny.c, $$2).a(ny.d, true))
         .a(ns.a().a(dts.M, true), nx.a().a(ny.c, $$2).a(ny.b, ny.a.b).a(ny.d, true))
         .a(ns.a().a(dts.N, true), nx.a().a(ny.c, $$2).a(ny.b, ny.a.c).a(ny.d, true))
         .a(ns.a().a(dts.O, true), nx.a().a(ny.c, $$2).a(ny.b, ny.a.d).a(ny.d, true));
   }

   static nr a(dfy $$0, akr $$1, akr $$2, akr $$3) {
      return nt.a($$0)
         .a(ns.a().a(dts.J, true), nx.a().a(ny.c, $$1))
         .a(ns.a().a(dts.X, duo.b), nx.a().a(ny.c, $$2).a(ny.d, true))
         .a(ns.a().a(dts.W, duo.b), nx.a().a(ny.c, $$2).a(ny.b, ny.a.b).a(ny.d, true))
         .a(ns.a().a(dts.Y, duo.b), nx.a().a(ny.c, $$2).a(ny.b, ny.a.c).a(ny.d, true))
         .a(ns.a().a(dts.Z, duo.b), nx.a().a(ny.c, $$2).a(ny.b, ny.a.d).a(ny.d, true))
         .a(ns.a().a(dts.X, duo.c), nx.a().a(ny.c, $$3).a(ny.d, true))
         .a(ns.a().a(dts.W, duo.c), nx.a().a(ny.c, $$3).a(ny.b, ny.a.b).a(ny.d, true))
         .a(ns.a().a(dts.Y, duo.c), nx.a().a(ny.c, $$3).a(ny.b, ny.a.c).a(ny.d, true))
         .a(ns.a().a(dts.Z, duo.c), nx.a().a(ny.c, $$3).a(ny.b, ny.a.d).a(ny.d, true));
   }

   static nr a(dfy $$0, akr $$1, akr $$2, akr $$3, akr $$4, boolean $$5) {
      return nu.a($$0, nx.a().a(ny.d, $$5))
         .a(c())
         .a(
            nv.a(dts.q, dts.u)
               .a(false, false, nx.a().a(ny.c, $$2))
               .a(true, false, nx.a().a(ny.c, $$4))
               .a(false, true, nx.a().a(ny.c, $$1))
               .a(true, true, nx.a().a(ny.c, $$3))
         );
   }

   static nr b(dfy $$0, akr $$1, akr $$2, akr $$3) {
      return nu.a($$0)
         .a(
            nv.a(dts.R, dts.af, dts.bi)
               .a(ji.f, dub.b, dul.a, nx.a().a(ny.c, $$2))
               .a(ji.e, dub.b, dul.a, nx.a().a(ny.c, $$2).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.d, dub.b, dul.a, nx.a().a(ny.c, $$2).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.c, dub.b, dul.a, nx.a().a(ny.c, $$2).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ji.f, dub.b, dul.e, nx.a().a(ny.c, $$3))
               .a(ji.e, dub.b, dul.e, nx.a().a(ny.c, $$3).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.d, dub.b, dul.e, nx.a().a(ny.c, $$3).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.c, dub.b, dul.e, nx.a().a(ny.c, $$3).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ji.f, dub.b, dul.d, nx.a().a(ny.c, $$3).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ji.e, dub.b, dul.d, nx.a().a(ny.c, $$3).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.d, dub.b, dul.d, nx.a().a(ny.c, $$3))
               .a(ji.c, dub.b, dul.d, nx.a().a(ny.c, $$3).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.f, dub.b, dul.c, nx.a().a(ny.c, $$1))
               .a(ji.e, dub.b, dul.c, nx.a().a(ny.c, $$1).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.d, dub.b, dul.c, nx.a().a(ny.c, $$1).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.c, dub.b, dul.c, nx.a().a(ny.c, $$1).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ji.f, dub.b, dul.b, nx.a().a(ny.c, $$1).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ji.e, dub.b, dul.b, nx.a().a(ny.c, $$1).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.d, dub.b, dul.b, nx.a().a(ny.c, $$1))
               .a(ji.c, dub.b, dul.b, nx.a().a(ny.c, $$1).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.f, dub.a, dul.a, nx.a().a(ny.c, $$2).a(ny.a, ny.a.c).a(ny.d, true))
               .a(ji.e, dub.a, dul.a, nx.a().a(ny.c, $$2).a(ny.a, ny.a.c).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.d, dub.a, dul.a, nx.a().a(ny.c, $$2).a(ny.a, ny.a.c).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.c, dub.a, dul.a, nx.a().a(ny.c, $$2).a(ny.a, ny.a.c).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ji.f, dub.a, dul.e, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.e, dub.a, dul.e, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ji.d, dub.a, dul.e, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.c, dub.a, dul.e, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.d, true))
               .a(ji.f, dub.a, dul.d, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.d, true))
               .a(ji.e, dub.a, dul.d, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.d, dub.a, dul.d, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.c, dub.a, dul.d, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ji.f, dub.a, dul.c, nx.a().a(ny.c, $$1).a(ny.a, ny.a.c).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.e, dub.a, dul.c, nx.a().a(ny.c, $$1).a(ny.a, ny.a.c).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ji.d, dub.a, dul.c, nx.a().a(ny.c, $$1).a(ny.a, ny.a.c).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.c, dub.a, dul.c, nx.a().a(ny.c, $$1).a(ny.a, ny.a.c).a(ny.d, true))
               .a(ji.f, dub.a, dul.b, nx.a().a(ny.c, $$1).a(ny.a, ny.a.c).a(ny.d, true))
               .a(ji.e, dub.a, dul.b, nx.a().a(ny.c, $$1).a(ny.a, ny.a.c).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ji.d, dub.a, dul.b, nx.a().a(ny.c, $$1).a(ny.a, ny.a.c).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ji.c, dub.a, dul.b, nx.a().a(ny.c, $$1).a(ny.a, ny.a.c).a(ny.b, ny.a.d).a(ny.d, true))
         );
   }

   private static nr c(dfy $$0, akr $$1, akr $$2, akr $$3) {
      return nu.a($$0)
         .a(
            nv.a(dts.R, dts.af, dts.u)
               .a(ji.c, dub.b, false, nx.a().a(ny.c, $$2))
               .a(ji.d, dub.b, false, nx.a().a(ny.c, $$2).a(ny.b, ny.a.c))
               .a(ji.f, dub.b, false, nx.a().a(ny.c, $$2).a(ny.b, ny.a.b))
               .a(ji.e, dub.b, false, nx.a().a(ny.c, $$2).a(ny.b, ny.a.d))
               .a(ji.c, dub.a, false, nx.a().a(ny.c, $$1))
               .a(ji.d, dub.a, false, nx.a().a(ny.c, $$1).a(ny.b, ny.a.c))
               .a(ji.f, dub.a, false, nx.a().a(ny.c, $$1).a(ny.b, ny.a.b))
               .a(ji.e, dub.a, false, nx.a().a(ny.c, $$1).a(ny.b, ny.a.d))
               .a(ji.c, dub.b, true, nx.a().a(ny.c, $$3))
               .a(ji.d, dub.b, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.c))
               .a(ji.f, dub.b, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.b))
               .a(ji.e, dub.b, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.d))
               .a(ji.c, dub.a, true, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.c))
               .a(ji.d, dub.a, true, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.a))
               .a(ji.f, dub.a, true, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.d))
               .a(ji.e, dub.a, true, nx.a().a(ny.c, $$3).a(ny.a, ny.a.c).a(ny.b, ny.a.b))
         );
   }

   private static nr d(dfy $$0, akr $$1, akr $$2, akr $$3) {
      return nu.a($$0)
         .a(
            nv.a(dts.R, dts.af, dts.u)
               .a(ji.c, dub.b, false, nx.a().a(ny.c, $$2))
               .a(ji.d, dub.b, false, nx.a().a(ny.c, $$2))
               .a(ji.f, dub.b, false, nx.a().a(ny.c, $$2))
               .a(ji.e, dub.b, false, nx.a().a(ny.c, $$2))
               .a(ji.c, dub.a, false, nx.a().a(ny.c, $$1))
               .a(ji.d, dub.a, false, nx.a().a(ny.c, $$1))
               .a(ji.f, dub.a, false, nx.a().a(ny.c, $$1))
               .a(ji.e, dub.a, false, nx.a().a(ny.c, $$1))
               .a(ji.c, dub.b, true, nx.a().a(ny.c, $$3))
               .a(ji.d, dub.b, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.c))
               .a(ji.f, dub.b, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.b))
               .a(ji.e, dub.b, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.d))
               .a(ji.c, dub.a, true, nx.a().a(ny.c, $$3))
               .a(ji.d, dub.a, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.c))
               .a(ji.f, dub.a, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.b))
               .a(ji.e, dub.a, true, nx.a().a(ny.c, $$3).a(ny.b, ny.a.d))
         );
   }

   static nu c(dfy $$0, akr $$1) {
      return nu.a($$0, nx.a().a(ny.c, $$1));
   }

   private static nv f() {
      return nv.a(dts.I).a(ji.a.b, nx.a()).a(ji.a.c, nx.a().a(ny.a, ny.a.b)).a(ji.a.a, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.b));
   }

   static nr a(dfy $$0, of $$1, BiConsumer<akr, Supplier<JsonElement>> $$2) {
      akr $$3 = oe.g.a($$0, $$1, $$2);
      akr $$4 = oe.h.a($$0, $$1, $$2);
      akr $$5 = oe.i.a($$0, $$1, $$2);
      akr $$6 = oe.j.a($$0, $$1, $$2);
      return nu.a($$0, nx.a().a(ny.c, $$6)).a(nv.a(dts.I).a(ji.a.a, nx.a().a(ny.c, $$3)).a(ji.a.b, nx.a().a(ny.c, $$4)).a(ji.a.c, nx.a().a(ny.c, $$5)));
   }

   static nr d(dfy $$0, akr $$1) {
      return nu.a($$0, nx.a().a(ny.c, $$1)).a(f());
   }

   private void e(dfy $$0, akr $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dfy $$0, oh.a $$1) {
      akr $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dfy $$0, oh.a $$1) {
      akr $$2 = $$1.create($$0, this.c);
      this.b.accept(nu.a($$0, nx.a().a(ny.c, $$2)).a(b()));
   }

   static nr d(dfy $$0, akr $$1, akr $$2) {
      return nu.a($$0)
         .a(
            nv.a(dts.I)
               .a(ji.a.b, nx.a().a(ny.c, $$1))
               .a(ji.a.c, nx.a().a(ny.c, $$2).a(ny.a, ny.a.b))
               .a(ji.a.a, nx.a().a(ny.c, $$2).a(ny.a, ny.a.b).a(ny.b, ny.a.b))
         );
   }

   private void a(dfy $$0, oh.a $$1, oh.a $$2) {
      akr $$3 = $$1.create($$0, this.c);
      akr $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akr a(dfy $$0, String $$1, od $$2, Function<akr, of> $$3) {
      return $$2.a($$0, $$1, $$3.apply(of.a($$0, $$1)), this.c);
   }

   static nr e(dfy $$0, akr $$1, akr $$2) {
      return nu.a($$0).a(a(dts.w, $$2, $$1));
   }

   static nr e(dfy $$0, akr $$1, akr $$2, akr $$3) {
      return nu.a($$0).a(nv.a(dts.bh).a(duk.b, nx.a().a(ny.c, $$1)).a(duk.a, nx.a().a(ny.c, $$2)).a(duk.c, nx.a().a(ny.c, $$3)));
   }

   public void a(dfy $$0) {
      this.b($$0, oh.a);
   }

   public void b(dfy $$0, oh.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dfy $$0, of $$1, od $$2) {
      akr $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private no.b h(dfy $$0) {
      oh $$1 = this.g.getOrDefault($$0, oh.a.get($$0));
      return new no.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dfy $$0, dfy $$1, dfy $$2) {
      of $$3 = of.u($$0);
      akr $$4 = oe.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dfy $$0) {
      of $$1 = of.t($$0);
      akr $$2 = oe.v.a($$0, $$1, this.c);
      akr $$3 = oe.w.a($$0, $$1, this.c);
      akr $$4 = oe.x.a($$0, $$1, this.c);
      akr $$5 = oe.y.a($$0, $$1, this.c);
      akr $$6 = oe.z.a($$0, $$1, this.c);
      akr $$7 = oe.A.a($$0, $$1, this.c);
      akr $$8 = oe.B.a($$0, $$1, this.c);
      akr $$9 = oe.C.a($$0, $$1, this.c);
      this.a($$0.r());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dfy $$0, dfy $$1) {
      akr $$2 = oe.v.a($$0);
      akr $$3 = oe.w.a($$0);
      akr $$4 = oe.x.a($$0);
      akr $$5 = oe.y.a($$0);
      akr $$6 = oe.z.a($$0);
      akr $$7 = oe.A.a($$0);
      akr $$8 = oe.B.a($$0);
      akr $$9 = oe.C.a($$0);
      this.a($$1, oc.a($$0.r()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dfy $$0) {
      of $$1 = of.b($$0);
      akr $$2 = oe.ak.a($$0, $$1, this.c);
      akr $$3 = oe.al.a($$0, $$1, this.c);
      akr $$4 = oe.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dfy $$0) {
      of $$1 = of.b($$0);
      akr $$2 = oe.ah.a($$0, $$1, this.c);
      akr $$3 = oe.ai.a($$0, $$1, this.c);
      akr $$4 = oe.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dfy $$0, dfy $$1) {
      akr $$2 = oe.ah.a($$0);
      akr $$3 = oe.ai.a($$0);
      akr $$4 = oe.aj.a($$0);
      this.a($$1, oc.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dga.sD);
      akr $$0 = oc.a(dga.sD);
      akr $$1 = oc.a(dga.sD, "_partial_tilt");
      akr $$2 = oc.a(dga.sD, "_full_tilt");
      this.b
         .accept(
            nu.a(dga.sD)
               .a(b())
               .a(nv.a(dts.bl).a(dun.a, nx.a().a(ny.c, $$0)).a(dun.b, nx.a().a(ny.c, $$0)).a(dun.c, nx.a().a(ny.c, $$1)).a(dun.d, nx.a().a(ny.c, $$2)))
         );
   }

   private no.f l(dfy $$0) {
      return new no.f(of.n($$0));
   }

   private void m(dfy $$0) {
      this.c($$0, $$0);
   }

   private void c(dfy $$0, dfy $$1) {
      this.b.accept(c($$0, oc.a($$1)));
   }

   private void a(dfy $$0, no.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dfy $$0, no.e $$1, of $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfy $$0, no.e $$1) {
      of $$2 = of.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfy $$0, no.e $$1, of $$2) {
      akr $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dfy $$0, no.e $$1, duf<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         nv $$4 = nv.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            of $$5 = of.c(of.a($$0, $$4x));
            akr $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return nx.a().a(ny.c, $$6);
         });
         this.a($$0.r());
         this.b.accept(nu.a($$0).a($$4));
      }
   }

   private void a(dfy $$0, dfy $$1, no.e $$2) {
      this.a($$0, $$2);
      of $$3 = of.d($$0);
      akr $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dfy $$0, dfy $$1) {
      oh $$2 = oh.p.get($$0);
      akr $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akr $$4 = oe.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nu.a($$1, nx.a().a(ny.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dfy $$0, dfy $$1) {
      this.a($$0.r());
      of $$2 = of.h($$0);
      of $$3 = of.a($$0, $$1);
      akr $$4 = oe.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nu.a($$1, nx.a().a(ny.c, $$4))
               .a(nv.a(dts.R).a(ji.e, nx.a()).a(ji.d, nx.a().a(ny.b, ny.a.d)).a(ji.c, nx.a().a(ny.b, ny.a.b)).a(ji.f, nx.a().a(ny.b, ny.a.c)))
         );
      this.b.accept(nu.a($$0).a(nv.a(dts.av).a($$2x -> nx.a().a(ny.c, oe.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dfy $$0 = dga.kC;
      this.a($$0.r());
      akr $$1 = oc.a($$0, "_top");
      akr $$2 = oc.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dfy $$0 = dga.kB;
      this.a($$0.r());
      nv $$1 = nv.a(dln.d, dts.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> nx.a().a(ny.c, oc.a($$0, "_top_stage_" + $$1x));
            case b -> nx.a().a(ny.c, oc.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nu.a($$0).a($$1));
   }

   private void a(dfy $$0, dfy $$1, dfy $$2, dfy $$3, dfy $$4, dfy $$5, dfy $$6, dfy $$7) {
      this.a($$0, no.e.b);
      this.a($$1, no.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dfy $$0, no.e $$1) {
      this.a($$0, "_top");
      akr $$2 = this.a($$0, "_top", $$1.a(), of::c);
      akr $$3 = this.a($$0, "_bottom", $$1.a(), of::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dga.iD, "_front");
      akr $$0 = oc.a(dga.iD, "_top");
      akr $$1 = this.a(dga.iD, "_bottom", no.e.b.a(), of::c);
      this.f(dga.iD, $$0, $$1);
   }

   private void k() {
      akr $$0 = this.a(dga.bx, "_top", oe.bk, of::a);
      akr $$1 = this.a(dga.bx, "_bottom", oe.bk, of::a);
      this.f(dga.bx, $$0, $$1);
   }

   private void l() {
      this.c(dga.sF);
      akr $$0 = oc.a(dga.sF, "_top");
      akr $$1 = oc.a(dga.sF, "_bottom");
      this.b.accept(nu.a(dga.sF).a(b()).a(nv.a(dts.ae).a(dty.b, nx.a().a(ny.c, $$1)).a(dty.a, nx.a().a(ny.c, $$0))));
   }

   private void f(dfy $$0, akr $$1, akr $$2) {
      this.b.accept(nu.a($$0).a(nv.a(dts.ae).a(dty.b, nx.a().a(ny.c, $$2)).a(dty.a, nx.a().a(ny.c, $$1))));
   }

   private void n(dfy $$0) {
      of $$1 = of.e($$0);
      of $$2 = of.e(of.a($$0, "_corner"));
      akr $$3 = oe.as.a($$0, $$1, this.c);
      akr $$4 = oe.at.a($$0, $$2, this.c);
      akr $$5 = oe.au.a($$0, $$1, this.c);
      akr $$6 = oe.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nu.a($$0)
               .a(
                  nv.a(dts.ag)
                     .a(dug.a, nx.a().a(ny.c, $$3))
                     .a(dug.b, nx.a().a(ny.c, $$3).a(ny.b, ny.a.b))
                     .a(dug.c, nx.a().a(ny.c, $$5).a(ny.b, ny.a.b))
                     .a(dug.d, nx.a().a(ny.c, $$6).a(ny.b, ny.a.b))
                     .a(dug.e, nx.a().a(ny.c, $$5))
                     .a(dug.f, nx.a().a(ny.c, $$6))
                     .a(dug.g, nx.a().a(ny.c, $$4))
                     .a(dug.h, nx.a().a(ny.c, $$4).a(ny.b, ny.a.b))
                     .a(dug.i, nx.a().a(ny.c, $$4).a(ny.b, ny.a.c))
                     .a(dug.j, nx.a().a(ny.c, $$4).a(ny.b, ny.a.d))
               )
         );
   }

   private void o(dfy $$0) {
      akr $$1 = this.a($$0, "", oe.as, of::e);
      akr $$2 = this.a($$0, "", oe.au, of::e);
      akr $$3 = this.a($$0, "", oe.av, of::e);
      akr $$4 = this.a($$0, "_on", oe.as, of::e);
      akr $$5 = this.a($$0, "_on", oe.au, of::e);
      akr $$6 = this.a($$0, "_on", oe.av, of::e);
      nv $$7 = nv.a(dts.w, dts.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return nx.a().a(ny.c, $$6x ? $$4 : $$1);
            case b:
               return nx.a().a(ny.c, $$6x ? $$4 : $$1).a(ny.b, ny.a.b);
            case c:
               return nx.a().a(ny.c, $$6x ? $$5 : $$2).a(ny.b, ny.a.b);
            case d:
               return nx.a().a(ny.c, $$6x ? $$6 : $$3).a(ny.b, ny.a.b);
            case e:
               return nx.a().a(ny.c, $$6x ? $$5 : $$2);
            case f:
               return nx.a().a(ny.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(nu.a($$0).a($$7));
   }

   private no.a a(akr $$0, dfy $$1) {
      return new no.a($$0, $$1);
   }

   private no.a f(dfy $$0, dfy $$1) {
      return new no.a(oc.a($$0), $$1);
   }

   private void a(dfy $$0, cul $$1) {
      akr $$2 = oe.aa.a($$0, of.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dfy $$0, akr $$1) {
      akr $$2 = oe.aa.a($$0, of.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dfy $$0, dfy $$1) {
      this.a($$0);
      akr $$2 = oh.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dfy $$0) {
      this.a($$0.r());
      akr $$1 = oh.k.create($$0, this.c);
      akr $$2 = oh.l.create($$0, this.c);
      akr $$3 = oh.m.create($$0, this.c);
      akr $$4 = oh.n.create($$0, this.c);
      this.b
         .accept(
            nt.a($$0)
               .a(ns.a().a(dts.S, 1, 2, 3, 4).a(dts.R, ji.c), nx.a().a(ny.c, $$1))
               .a(ns.a().a(dts.S, 1, 2, 3, 4).a(dts.R, ji.f), nx.a().a(ny.c, $$1).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.S, 1, 2, 3, 4).a(dts.R, ji.d), nx.a().a(ny.c, $$1).a(ny.b, ny.a.c))
               .a(ns.a().a(dts.S, 1, 2, 3, 4).a(dts.R, ji.e), nx.a().a(ny.c, $$1).a(ny.b, ny.a.d))
               .a(ns.a().a(dts.S, 2, 3, 4).a(dts.R, ji.c), nx.a().a(ny.c, $$2))
               .a(ns.a().a(dts.S, 2, 3, 4).a(dts.R, ji.f), nx.a().a(ny.c, $$2).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.S, 2, 3, 4).a(dts.R, ji.d), nx.a().a(ny.c, $$2).a(ny.b, ny.a.c))
               .a(ns.a().a(dts.S, 2, 3, 4).a(dts.R, ji.e), nx.a().a(ny.c, $$2).a(ny.b, ny.a.d))
               .a(ns.a().a(dts.S, 3, 4).a(dts.R, ji.c), nx.a().a(ny.c, $$3))
               .a(ns.a().a(dts.S, 3, 4).a(dts.R, ji.f), nx.a().a(ny.c, $$3).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.S, 3, 4).a(dts.R, ji.d), nx.a().a(ny.c, $$3).a(ny.b, ny.a.c))
               .a(ns.a().a(dts.S, 3, 4).a(dts.R, ji.e), nx.a().a(ny.c, $$3).a(ny.b, ny.a.d))
               .a(ns.a().a(dts.S, 4).a(dts.R, ji.c), nx.a().a(ny.c, $$4))
               .a(ns.a().a(dts.S, 4).a(dts.R, ji.f), nx.a().a(ny.c, $$4).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.S, 4).a(dts.R, ji.d), nx.a().a(ny.c, $$4).a(ny.b, ny.a.c))
               .a(ns.a().a(dts.S, 4).a(dts.R, ji.e), nx.a().a(ny.c, $$4).a(ny.b, ny.a.d))
         );
   }

   private void a(oh.a $$0, dfy... $$1) {
      for (dfy $$2 : $$1) {
         akr $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(oh.a $$0, dfy... $$1) {
      for (dfy $$2 : $$1) {
         akr $$3 = $$0.create($$2, this.c);
         this.b.accept(nu.a($$2, nx.a().a(ny.c, $$3)).a(c()));
      }
   }

   private void h(dfy $$0, dfy $$1) {
      this.a($$0);
      of $$2 = of.b($$0, $$1);
      akr $$3 = oe.aI.a($$1, $$2, this.c);
      akr $$4 = oe.aJ.a($$1, $$2, this.c);
      akr $$5 = oe.aK.a($$1, $$2, this.c);
      akr $$6 = oe.aG.a($$1, $$2, this.c);
      akr $$7 = oe.aH.a($$1, $$2, this.c);
      cul $$8 = $$1.r();
      oe.bx.a(oc.a($$8), of.F($$0), this.c);
      this.b
         .accept(
            nt.a($$1)
               .a(nx.a().a(ny.c, $$3))
               .a(ns.a().a(dts.L, true), nx.a().a(ny.c, $$4))
               .a(ns.a().a(dts.M, true), nx.a().a(ny.c, $$4).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.N, true), nx.a().a(ny.c, $$5))
               .a(ns.a().a(dts.O, true), nx.a().a(ny.c, $$5).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.L, false), nx.a().a(ny.c, $$6))
               .a(ns.a().a(dts.M, false), nx.a().a(ny.c, $$7))
               .a(ns.a().a(dts.N, false), nx.a().a(ny.c, $$7).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.O, false), nx.a().a(ny.c, $$6).a(ny.b, ny.a.d))
         );
   }

   private void q(dfy $$0) {
      of $$1 = of.z($$0);
      akr $$2 = oe.aL.a($$0, $$1, this.c);
      akr $$3 = this.a($$0, "_conditional", oe.aL, $$1x -> $$1.c(og.i, $$1x));
      this.b.accept(nu.a($$0).a(a(dts.c, $$3, $$2)).a(e()));
   }

   private void r(dfy $$0) {
      akr $$1 = oh.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<nx> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> nx.a().a(ny.c, oc.a(dga.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dga.mZ);
      this.b
         .accept(
            nt.a(dga.mZ)
               .a(ns.a().a(dts.aq, 0), this.a(0))
               .a(ns.a().a(dts.aq, 1), this.a(1))
               .a(ns.a().a(dts.bk, dto.b), nx.a().a(ny.c, oc.a(dga.mZ, "_small_leaves")))
               .a(ns.a().a(dts.bk, dto.c), nx.a().a(ny.c, oc.a(dga.mZ, "_large_leaves")))
         );
   }

   private nv n() {
      return nv.a(dts.P)
         .a(ji.a, nx.a().a(ny.a, ny.a.c))
         .a(ji.b, nx.a())
         .a(ji.c, nx.a().a(ny.a, ny.a.b))
         .a(ji.d, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.c))
         .a(ji.e, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.d))
         .a(ji.f, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.b));
   }

   private void o() {
      akr $$0 = of.a(dga.nU, "_top_open");
      this.b
         .accept(
            nu.a(dga.nU)
               .a(this.n())
               .a(
                  nv.a(dts.u)
                     .a(false, nx.a().a(ny.c, oh.f.create(dga.nU, this.c)))
                     .a(true, nx.a().a(ny.c, oh.f.get(dga.nU).a($$1 -> $$1.a(og.f, $$0)).a(dga.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nv a(duf<T> $$0, T $$1, akr $$2, akr $$3) {
      nx $$4 = nx.a().a(ny.c, $$2);
      nx $$5 = nx.a().a(ny.c, $$3);
      return nv.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dfy $$0, Function<dfy, of> $$1) {
      of $$2 = $$1.apply($$0).b(og.i, og.c);
      of $$3 = $$2.c(og.g, of.a($$0, "_front_honey"));
      akr $$4 = oe.q.a($$0, $$2, this.c);
      akr $$5 = oe.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nu.a($$0).a(b()).a(a(dts.aN, 5, $$5, $$4)));
   }

   private void a(dfy $$0, duf<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akr> $$3 = new Int2ObjectOpenHashMap();
         nv $$4 = nv.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akr $$5 = (akr)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, oe.aV, of::g));
            return nx.a().a(ny.c, $$5);
         });
         this.a($$0.r());
         this.b.accept(nu.a($$0).a($$4));
      }
   }

   private void p() {
      akr $$0 = oc.a(dga.od, "_floor");
      akr $$1 = oc.a(dga.od, "_ceiling");
      akr $$2 = oc.a(dga.od, "_wall");
      akr $$3 = oc.a(dga.od, "_between_walls");
      this.a(cut.wr);
      this.b
         .accept(
            nu.a(dga.od)
               .a(
                  nv.a(dts.R, dts.V)
                     .a(ji.c, dtq.a, nx.a().a(ny.c, $$0))
                     .a(ji.d, dtq.a, nx.a().a(ny.c, $$0).a(ny.b, ny.a.c))
                     .a(ji.f, dtq.a, nx.a().a(ny.c, $$0).a(ny.b, ny.a.b))
                     .a(ji.e, dtq.a, nx.a().a(ny.c, $$0).a(ny.b, ny.a.d))
                     .a(ji.c, dtq.b, nx.a().a(ny.c, $$1))
                     .a(ji.d, dtq.b, nx.a().a(ny.c, $$1).a(ny.b, ny.a.c))
                     .a(ji.f, dtq.b, nx.a().a(ny.c, $$1).a(ny.b, ny.a.b))
                     .a(ji.e, dtq.b, nx.a().a(ny.c, $$1).a(ny.b, ny.a.d))
                     .a(ji.c, dtq.c, nx.a().a(ny.c, $$2).a(ny.b, ny.a.d))
                     .a(ji.d, dtq.c, nx.a().a(ny.c, $$2).a(ny.b, ny.a.b))
                     .a(ji.f, dtq.c, nx.a().a(ny.c, $$2))
                     .a(ji.e, dtq.c, nx.a().a(ny.c, $$2).a(ny.b, ny.a.c))
                     .a(ji.d, dtq.d, nx.a().a(ny.c, $$3).a(ny.b, ny.a.b))
                     .a(ji.c, dtq.d, nx.a().a(ny.c, $$3).a(ny.b, ny.a.d))
                     .a(ji.f, dtq.d, nx.a().a(ny.c, $$3))
                     .a(ji.e, dtq.d, nx.a().a(ny.c, $$3).a(ny.b, ny.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nu.a(dga.nZ, nx.a().a(ny.c, oc.a(dga.nZ)))
               .a(
                  nv.a(dts.U, dts.R)
                     .a(dtn.a, ji.c, nx.a())
                     .a(dtn.a, ji.f, nx.a().a(ny.b, ny.a.b))
                     .a(dtn.a, ji.d, nx.a().a(ny.b, ny.a.c))
                     .a(dtn.a, ji.e, nx.a().a(ny.b, ny.a.d))
                     .a(dtn.b, ji.c, nx.a().a(ny.a, ny.a.b))
                     .a(dtn.b, ji.f, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.b))
                     .a(dtn.b, ji.d, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.c))
                     .a(dtn.b, ji.e, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.d))
                     .a(dtn.c, ji.d, nx.a().a(ny.a, ny.a.c))
                     .a(dtn.c, ji.e, nx.a().a(ny.a, ny.a.c).a(ny.b, ny.a.b))
                     .a(dtn.c, ji.c, nx.a().a(ny.a, ny.a.c).a(ny.b, ny.a.c))
                     .a(dtn.c, ji.f, nx.a().a(ny.a, ny.a.c).a(ny.b, ny.a.d))
               )
         );
   }

   private void d(dfy $$0, oh.a $$1) {
      akr $$2 = $$1.create($$0, this.c);
      akr $$3 = of.a($$0, "_front_on");
      akr $$4 = $$1.get($$0).a($$1x -> $$1x.a(og.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nu.a($$0).a(a(dts.r, $$4, $$2)).a(b()));
   }

   private void a(dfy... $$0) {
      akr $$1 = oc.a("campfire_off");

      for (dfy $$2 : $$0) {
         akr $$3 = oe.bc.a($$2, of.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nu.a($$2).a(a(dts.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dfy $$0) {
      akr $$1 = oe.bt.a($$0, of.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dfy $$0) {
      akr $$1;
      if ($$0 == dga.tj) {
         $$1 = oe.bv.a($$0, of.m($$0), this.c);
      } else {
         $$1 = oe.bu.a($$0, of.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      of $$0 = of.a(of.G(dga.cl), of.G(dga.n));
      akr $$1 = oe.j.a(dga.cl, $$0, this.c);
      this.b.accept(c(dga.cl, $$1));
   }

   private void s() {
      this.a(cut.lH);
      this.b
         .accept(
            nt.a(dga.cw)
               .a(
                  ns.b(
                     ns.a().a(dts.ab, duh.c).a(dts.aa, duh.c).a(dts.ac, duh.c).a(dts.ad, duh.c),
                     ns.a().a(dts.ab, duh.b, duh.a).a(dts.aa, duh.b, duh.a),
                     ns.a().a(dts.aa, duh.b, duh.a).a(dts.ac, duh.b, duh.a),
                     ns.a().a(dts.ac, duh.b, duh.a).a(dts.ad, duh.b, duh.a),
                     ns.a().a(dts.ad, duh.b, duh.a).a(dts.ab, duh.b, duh.a)
                  ),
                  nx.a().a(ny.c, oc.a("redstone_dust_dot"))
               )
               .a(ns.a().a(dts.ab, duh.b, duh.a), nx.a().a(ny.c, oc.a("redstone_dust_side0")))
               .a(ns.a().a(dts.ac, duh.b, duh.a), nx.a().a(ny.c, oc.a("redstone_dust_side_alt0")))
               .a(ns.a().a(dts.aa, duh.b, duh.a), nx.a().a(ny.c, oc.a("redstone_dust_side_alt1")).a(ny.b, ny.a.d))
               .a(ns.a().a(dts.ad, duh.b, duh.a), nx.a().a(ny.c, oc.a("redstone_dust_side1")).a(ny.b, ny.a.d))
               .a(ns.a().a(dts.ab, duh.a), nx.a().a(ny.c, oc.a("redstone_dust_up")))
               .a(ns.a().a(dts.aa, duh.a), nx.a().a(ny.c, oc.a("redstone_dust_up")).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.ac, duh.a), nx.a().a(ny.c, oc.a("redstone_dust_up")).a(ny.b, ny.a.c))
               .a(ns.a().a(dts.ad, duh.a), nx.a().a(ny.c, oc.a("redstone_dust_up")).a(ny.b, ny.a.d))
         );
   }

   private void t() {
      this.a(cut.lL);
      this.b
         .accept(
            nu.a(dga.gY)
               .a(c())
               .a(
                  nv.a(dts.bd, dts.w)
                     .a(dtv.a, false, nx.a().a(ny.c, oc.a(dga.gY)))
                     .a(dtv.a, true, nx.a().a(ny.c, oc.a(dga.gY, "_on")))
                     .a(dtv.b, false, nx.a().a(ny.c, oc.a(dga.gY, "_subtract")))
                     .a(dtv.b, true, nx.a().a(ny.c, oc.a(dga.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      of $$0 = of.a(dga.jR);
      of $$1 = of.a(of.a(dga.jE, "_side"), $$0.a(og.f));
      akr $$2 = oe.ab.a(dga.jE, $$1, this.c);
      akr $$3 = oe.ac.a(dga.jE, $$1, this.c);
      akr $$4 = oe.j.b(dga.jE, "_double", $$1, this.c);
      this.b.accept(e(dga.jE, $$2, $$3, $$4));
      this.b.accept(c(dga.jR, oe.c.a(dga.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cut.sq);
      this.b
         .accept(
            nt.a(dga.fs)
               .a(nx.a().a(ny.c, of.G(dga.fs)))
               .a(ns.a().a(dts.k, true), nx.a().a(ny.c, of.a(dga.fs, "_bottle0")))
               .a(ns.a().a(dts.l, true), nx.a().a(ny.c, of.a(dga.fs, "_bottle1")))
               .a(ns.a().a(dts.m, true), nx.a().a(ny.c, of.a(dga.fs, "_bottle2")))
               .a(ns.a().a(dts.k, false), nx.a().a(ny.c, of.a(dga.fs, "_empty0")))
               .a(ns.a().a(dts.l, false), nx.a().a(ny.c, of.a(dga.fs, "_empty1")))
               .a(ns.a().a(dts.m, false), nx.a().a(ny.c, of.a(dga.fs, "_empty2")))
         );
   }

   private void u(dfy $$0) {
      akr $$1 = oe.bp.a($$0, of.b($$0), this.c);
      akr $$2 = oc.a("mushroom_block_inside");
      this.b
         .accept(
            nt.a($$0)
               .a(ns.a().a(dts.L, true), nx.a().a(ny.c, $$1))
               .a(ns.a().a(dts.M, true), nx.a().a(ny.c, $$1).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ns.a().a(dts.N, true), nx.a().a(ny.c, $$1).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ns.a().a(dts.O, true), nx.a().a(ny.c, $$1).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ns.a().a(dts.J, true), nx.a().a(ny.c, $$1).a(ny.a, ny.a.d).a(ny.d, true))
               .a(ns.a().a(dts.K, true), nx.a().a(ny.c, $$1).a(ny.a, ny.a.b).a(ny.d, true))
               .a(ns.a().a(dts.L, false), nx.a().a(ny.c, $$2))
               .a(ns.a().a(dts.M, false), nx.a().a(ny.c, $$2).a(ny.b, ny.a.b).a(ny.d, false))
               .a(ns.a().a(dts.N, false), nx.a().a(ny.c, $$2).a(ny.b, ny.a.c).a(ny.d, false))
               .a(ns.a().a(dts.O, false), nx.a().a(ny.c, $$2).a(ny.b, ny.a.d).a(ny.d, false))
               .a(ns.a().a(dts.J, false), nx.a().a(ny.c, $$2).a(ny.a, ny.a.d).a(ny.d, false))
               .a(ns.a().a(dts.K, false), nx.a().a(ny.c, $$2).a(ny.a, ny.a.b).a(ny.d, false))
         );
      this.a($$0, oh.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cut.rB);
      this.b
         .accept(
            nu.a(dga.eg)
               .a(
                  nv.a(dts.ay)
                     .a(0, nx.a().a(ny.c, oc.a(dga.eg)))
                     .a(1, nx.a().a(ny.c, oc.a(dga.eg, "_slice1")))
                     .a(2, nx.a().a(ny.c, oc.a(dga.eg, "_slice2")))
                     .a(3, nx.a().a(ny.c, oc.a(dga.eg, "_slice3")))
                     .a(4, nx.a().a(ny.c, oc.a(dga.eg, "_slice4")))
                     .a(5, nx.a().a(ny.c, oc.a(dga.eg, "_slice5")))
                     .a(6, nx.a().a(ny.c, oc.a(dga.eg, "_slice6")))
               )
         );
   }

   private void x() {
      of $$0 = new of()
         .a(og.c, of.a(dga.nX, "_side3"))
         .a(og.o, of.G(dga.t))
         .a(og.n, of.a(dga.nX, "_top"))
         .a(og.j, of.a(dga.nX, "_side3"))
         .a(og.l, of.a(dga.nX, "_side3"))
         .a(og.k, of.a(dga.nX, "_side1"))
         .a(og.m, of.a(dga.nX, "_side2"));
      this.b.accept(c(dga.nX, oe.a.a(dga.nX, $$0, this.c)));
   }

   private void y() {
      of $$0 = new of()
         .a(og.c, of.a(dga.ob, "_front"))
         .a(og.o, of.a(dga.ob, "_bottom"))
         .a(og.n, of.a(dga.ob, "_top"))
         .a(og.j, of.a(dga.ob, "_front"))
         .a(og.k, of.a(dga.ob, "_front"))
         .a(og.l, of.a(dga.ob, "_side"))
         .a(og.m, of.a(dga.ob, "_side"));
      this.b.accept(c(dga.ob, oe.a.a(dga.ob, $$0, this.c)));
   }

   private void a(dfy $$0, dfy $$1, BiFunction<dfy, dfy, of> $$2) {
      of $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oe.a.a($$0, $$3, this.c)));
   }

   public void b(dfy $$0) {
      of $$1 = new of()
         .a(og.c, of.a($$0, "_particle"))
         .a(og.o, of.a($$0, "_down"))
         .a(og.n, of.a($$0, "_up"))
         .a(og.j, of.a($$0, "_north"))
         .a(og.k, of.a($$0, "_south"))
         .a(og.l, of.a($$0, "_east"))
         .a(og.m, of.a($$0, "_west"));
      this.b.accept(c($$0, oe.a.a($$0, $$1, this.c)));
   }

   private void z() {
      of $$0 = of.k(dga.eZ);
      this.b.accept(c(dga.eZ, oc.a(dga.eZ)));
      this.a(dga.ee, $$0);
      this.a(dga.ef, $$0);
   }

   private void a(dfy $$0, of $$1) {
      akr $$2 = oe.p.a($$0, $$1.c(og.g, of.G($$0)), this.c);
      this.b.accept(nu.a($$0, nx.a().a(ny.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cut.sr);
      this.m(dga.ft);
      this.b.accept(c(dga.fv, oe.bs.a(dga.fv, of.j(of.a(dga.H, "_still")), this.c)));
      this.b
         .accept(
            nu.a(dga.fu)
               .a(
                  nv.a(dkh.g)
                     .a(1, nx.a().a(ny.c, oe.bq.a(dga.fu, "_level1", of.j(of.a(dga.G, "_still")), this.c)))
                     .a(2, nx.a().a(ny.c, oe.br.a(dga.fu, "_level2", of.j(of.a(dga.G, "_still")), this.c)))
                     .a(3, nx.a().a(ny.c, oe.bs.a(dga.fu, "_full", of.j(of.a(dga.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nu.a(dga.fw)
               .a(
                  nv.a(dkh.g)
                     .a(1, nx.a().a(ny.c, oe.bq.a(dga.fw, "_level1", of.j(of.G(dga.qP)), this.c)))
                     .a(2, nx.a().a(ny.c, oe.br.a(dga.fw, "_level2", of.j(of.G(dga.qP)), this.c)))
                     .a(3, nx.a().a(ny.c, oe.bs.a(dga.fw, "_full", of.j(of.G(dga.qP)), this.c)))
               )
         );
   }

   private void B() {
      of $$0 = of.b(dga.kv);
      akr $$1 = oe.aE.a(dga.kv, $$0, this.c);
      akr $$2 = this.a(dga.kv, "_dead", oe.aE, $$1x -> $$0.c(og.b, $$1x));
      this.b.accept(nu.a(dga.kv).a(a(dts.au, 5, $$2, $$1)));
   }

   private void C() {
      akr $$0 = oc.a(dga.tq);
      akr $$1 = oc.a(dga.tq, "_triggered");
      akr $$2 = oc.a(dga.tq, "_crafting");
      akr $$3 = oc.a(dga.tq, "_crafting_triggered");
      this.b
         .accept(
            nu.a(dga.tq)
               .a(nv.a(dts.T).a($$0x -> this.a($$0x, nx.a())))
               .a(
                  nv.a(dts.A, dhr.b)
                     .a(false, false, nx.a().a(ny.c, $$0))
                     .a(true, true, nx.a().a(ny.c, $$3))
                     .a(true, false, nx.a().a(ny.c, $$1))
                     .a(false, true, nx.a().a(ny.c, $$2))
               )
         );
   }

   private void v(dfy $$0) {
      of $$1 = new of().a(og.f, of.a(dga.cD, "_top")).a(og.i, of.a(dga.cD, "_side")).a(og.g, of.a($$0, "_front"));
      of $$2 = new of().a(og.i, of.a(dga.cD, "_top")).a(og.g, of.a($$0, "_front_vertical"));
      akr $$3 = oe.p.a($$0, $$1, this.c);
      akr $$4 = oe.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nu.a($$0)
               .a(
                  nv.a(dts.P)
                     .a(ji.a, nx.a().a(ny.c, $$4).a(ny.a, ny.a.c))
                     .a(ji.b, nx.a().a(ny.c, $$4))
                     .a(ji.c, nx.a().a(ny.c, $$3))
                     .a(ji.f, nx.a().a(ny.c, $$3).a(ny.b, ny.a.b))
                     .a(ji.d, nx.a().a(ny.c, $$3).a(ny.b, ny.a.c))
                     .a(ji.e, nx.a().a(ny.c, $$3).a(ny.b, ny.a.d))
               )
         );
   }

   private void D() {
      akr $$0 = oc.a(dga.fy);
      akr $$1 = oc.a(dga.fy, "_filled");
      this.b.accept(nu.a(dga.fy).a(nv.a(dts.h).a(false, nx.a().a(ny.c, $$0)).a(true, nx.a().a(ny.c, $$1))).a(c()));
   }

   private void E() {
      akr $$0 = oc.a(dga.ku, "_side");
      akr $$1 = oc.a(dga.ku, "_noside");
      akr $$2 = oc.a(dga.ku, "_noside1");
      akr $$3 = oc.a(dga.ku, "_noside2");
      akr $$4 = oc.a(dga.ku, "_noside3");
      this.b
         .accept(
            nt.a(dga.ku)
               .a(ns.a().a(dts.L, true), nx.a().a(ny.c, $$0))
               .a(ns.a().a(dts.M, true), nx.a().a(ny.c, $$0).a(ny.b, ny.a.b).a(ny.d, true))
               .a(ns.a().a(dts.N, true), nx.a().a(ny.c, $$0).a(ny.b, ny.a.c).a(ny.d, true))
               .a(ns.a().a(dts.O, true), nx.a().a(ny.c, $$0).a(ny.b, ny.a.d).a(ny.d, true))
               .a(ns.a().a(dts.J, true), nx.a().a(ny.c, $$0).a(ny.a, ny.a.d).a(ny.d, true))
               .a(ns.a().a(dts.K, true), nx.a().a(ny.c, $$0).a(ny.a, ny.a.b).a(ny.d, true))
               .a(ns.a().a(dts.L, false), nx.a().a(ny.c, $$1).a(ny.e, 2), nx.a().a(ny.c, $$2), nx.a().a(ny.c, $$3), nx.a().a(ny.c, $$4))
               .a(
                  ns.a().a(dts.M, false),
                  nx.a().a(ny.c, $$2).a(ny.b, ny.a.b).a(ny.d, true),
                  nx.a().a(ny.c, $$3).a(ny.b, ny.a.b).a(ny.d, true),
                  nx.a().a(ny.c, $$4).a(ny.b, ny.a.b).a(ny.d, true),
                  nx.a().a(ny.c, $$1).a(ny.e, 2).a(ny.b, ny.a.b).a(ny.d, true)
               )
               .a(
                  ns.a().a(dts.N, false),
                  nx.a().a(ny.c, $$3).a(ny.b, ny.a.c).a(ny.d, true),
                  nx.a().a(ny.c, $$4).a(ny.b, ny.a.c).a(ny.d, true),
                  nx.a().a(ny.c, $$1).a(ny.e, 2).a(ny.b, ny.a.c).a(ny.d, true),
                  nx.a().a(ny.c, $$2).a(ny.b, ny.a.c).a(ny.d, true)
               )
               .a(
                  ns.a().a(dts.O, false),
                  nx.a().a(ny.c, $$4).a(ny.b, ny.a.d).a(ny.d, true),
                  nx.a().a(ny.c, $$1).a(ny.e, 2).a(ny.b, ny.a.d).a(ny.d, true),
                  nx.a().a(ny.c, $$2).a(ny.b, ny.a.d).a(ny.d, true),
                  nx.a().a(ny.c, $$3).a(ny.b, ny.a.d).a(ny.d, true)
               )
               .a(
                  ns.a().a(dts.J, false),
                  nx.a().a(ny.c, $$1).a(ny.e, 2).a(ny.a, ny.a.d).a(ny.d, true),
                  nx.a().a(ny.c, $$4).a(ny.a, ny.a.d).a(ny.d, true),
                  nx.a().a(ny.c, $$2).a(ny.a, ny.a.d).a(ny.d, true),
                  nx.a().a(ny.c, $$3).a(ny.a, ny.a.d).a(ny.d, true)
               )
               .a(
                  ns.a().a(dts.K, false),
                  nx.a().a(ny.c, $$4).a(ny.a, ny.a.b).a(ny.d, true),
                  nx.a().a(ny.c, $$3).a(ny.a, ny.a.b).a(ny.d, true),
                  nx.a().a(ny.c, $$2).a(ny.a, ny.a.b).a(ny.d, true),
                  nx.a().a(ny.c, $$1).a(ny.e, 2).a(ny.a, ny.a.b).a(ny.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            nt.a(dga.pc)
               .a(nx.a().a(ny.c, of.G(dga.pc)))
               .a(ns.a().a(dts.aL, 1), nx.a().a(ny.c, of.a(dga.pc, "_contents1")))
               .a(ns.a().a(dts.aL, 2), nx.a().a(ny.c, of.a(dga.pc, "_contents2")))
               .a(ns.a().a(dts.aL, 3), nx.a().a(ny.c, of.a(dga.pc, "_contents3")))
               .a(ns.a().a(dts.aL, 4), nx.a().a(ny.c, of.a(dga.pc, "_contents4")))
               .a(ns.a().a(dts.aL, 5), nx.a().a(ny.c, of.a(dga.pc, "_contents5")))
               .a(ns.a().a(dts.aL, 6), nx.a().a(ny.c, of.a(dga.pc, "_contents6")))
               .a(ns.a().a(dts.aL, 7), nx.a().a(ny.c, of.a(dga.pc, "_contents7")))
               .a(ns.a().a(dts.aL, 8), nx.a().a(ny.c, of.a(dga.pc, "_contents_ready")))
         );
   }

   private void w(dfy $$0) {
      akr $$1 = oe.c.a($$0, of.a($$0), this.c);
      akr $$2 = this.a($$0, "_powered", oe.c, of::b);
      akr $$3 = this.a($$0, "_lit", oe.c, of::b);
      akr $$4 = this.a($$0, "_lit_powered", oe.c, of::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nr a(dfy $$0, akr $$1, akr $$2, akr $$3, akr $$4) {
      return nu.a($$0).a(nv.a(dts.r, dts.w).a(($$4x, $$5) -> $$4x ? nx.a().a(ny.c, $$5 ? $$4 : $$2) : nx.a().a(ny.c, $$5 ? $$3 : $$1)));
   }

   private void i(dfy $$0, dfy $$1) {
      akr $$2 = oc.a($$0);
      akr $$3 = oc.a($$0, "_powered");
      akr $$4 = oc.a($$0, "_lit");
      akr $$5 = oc.a($$0, "_lit_powered");
      this.a($$1, oc.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dfy $$0) {
      this.c($$0);
      this.b.accept(nu.a($$0, nx.a().a(ny.c, oe.ao.a($$0, of.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dga.qy);
      this.x(dga.qx);
      this.x(dga.qw);
      this.x(dga.qv);
   }

   private void H() {
      this.c(dga.st);
      nv.b<ji, dtz> $$0 = nv.a(dts.bm, dts.bn);

      for (dtz $$1 : dtz.values()) {
         $$0.a(ji.b, $$1, this.a(ji.b, $$1));
      }

      for (dtz $$2 : dtz.values()) {
         $$0.a(ji.a, $$2, this.a(ji.a, $$2));
      }

      this.b.accept(nu.a(dga.st).a($$0));
   }

   private nx a(ji $$0, dtz $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      of $$3 = of.c(of.a(dga.st, $$2));
      return nx.a().a(ny.c, oe.an.a(dga.st, $$2, $$3, this.c));
   }

   private void y(dfy $$0) {
      of $$1 = new of().a(og.e, of.G(dga.dV)).a(og.f, of.G($$0)).a(og.i, of.a($$0, "_side"));
      this.b.accept(c($$0, oe.n.a($$0, $$1, this.c)));
   }

   private void I() {
      akr $$0 = of.a(dga.gZ, "_side");
      of $$1 = new of().a(og.f, of.a(dga.gZ, "_top")).a(og.i, $$0);
      of $$2 = new of().a(og.f, of.a(dga.gZ, "_inverted_top")).a(og.i, $$0);
      this.b
         .accept(
            nu.a(dga.gZ)
               .a(nv.a(dts.p).a(false, nx.a().a(ny.c, oe.aF.a(dga.gZ, $$1, this.c))).a(true, nx.a().a(ny.c, oe.aF.a(oc.a(dga.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dfy $$0) {
      this.b.accept(nu.a($$0, nx.a().a(ny.c, oc.a($$0))).a(this.n()));
   }

   private void J() {
      dfy $$0 = dga.ss;
      akr $$1 = oc.a($$0, "_on");
      akr $$2 = oc.a($$0);
      this.b.accept(nu.a($$0, nx.a().a(ny.c, oc.a($$0))).a(this.n()).a(a(dts.w, $$1, $$2)));
   }

   private void K() {
      of $$0 = new of().a(og.B, of.G(dga.j)).a(og.f, of.G(dga.cC));
      of $$1 = new of().a(og.B, of.G(dga.j)).a(og.f, of.a(dga.cC, "_moist"));
      akr $$2 = oe.aW.a(dga.cC, $$0, this.c);
      akr $$3 = oe.aW.a(of.a(dga.cC, "_moist"), $$1, this.c);
      this.b.accept(nu.a(dga.cC).a(a(dts.aQ, 7, $$3, $$2)));
   }

   private List<akr> A(dfy $$0) {
      akr $$1 = oe.aX.a(oc.a($$0, "_floor0"), of.v($$0), this.c);
      akr $$2 = oe.aX.a(oc.a($$0, "_floor1"), of.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akr> B(dfy $$0) {
      akr $$1 = oe.aY.a(oc.a($$0, "_side0"), of.v($$0), this.c);
      akr $$2 = oe.aY.a(oc.a($$0, "_side1"), of.w($$0), this.c);
      akr $$3 = oe.aZ.a(oc.a($$0, "_side_alt0"), of.v($$0), this.c);
      akr $$4 = oe.aZ.a(oc.a($$0, "_side_alt1"), of.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akr> C(dfy $$0) {
      akr $$1 = oe.ba.a(oc.a($$0, "_up0"), of.v($$0), this.c);
      akr $$2 = oe.ba.a(oc.a($$0, "_up1"), of.w($$0), this.c);
      akr $$3 = oe.bb.a(oc.a($$0, "_up_alt0"), of.v($$0), this.c);
      akr $$4 = oe.bb.a(oc.a($$0, "_up_alt1"), of.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<nx> a(List<akr> $$0, UnaryOperator<nx> $$1) {
      return $$0.stream().map($$0x -> nx.a().a(ny.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      ns $$0 = ns.a().a(dts.L, false).a(dts.M, false).a(dts.N, false).a(dts.O, false).a(dts.J, false);
      List<akr> $$1 = this.A(dga.cr);
      List<akr> $$2 = this.B(dga.cr);
      List<akr> $$3 = this.C(dga.cr);
      this.b
         .accept(
            nt.a(dga.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(ns.b(ns.a().a(dts.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(ns.b(ns.a().a(dts.M, true), $$0), a($$2, $$0x -> $$0x.a(ny.b, ny.a.b)))
               .a(ns.b(ns.a().a(dts.N, true), $$0), a($$2, $$0x -> $$0x.a(ny.b, ny.a.c)))
               .a(ns.b(ns.a().a(dts.O, true), $$0), a($$2, $$0x -> $$0x.a(ny.b, ny.a.d)))
               .a(ns.a().a(dts.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<akr> $$0 = this.A(dga.cs);
      List<akr> $$1 = this.B(dga.cs);
      this.b
         .accept(
            nt.a(dga.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ny.b, ny.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ny.b, ny.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ny.b, ny.a.d)))
         );
   }

   private void D(dfy $$0) {
      akr $$1 = oh.t.create($$0, this.c);
      akr $$2 = oh.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nu.a($$0).a(a(dts.j, $$2, $$1)));
   }

   private void N() {
      of $$0 = of.a(of.a(dga.ad, "_side"), of.a(dga.ad, "_top"));
      akr $$1 = oe.j.a(dga.ad, $$0, this.c);
      this.b.accept(d(dga.ad, $$1));
   }

   private void O() {
      this.a(cut.ad);
      dfy $$0 = dga.E;
      nv.b<Boolean, Integer> $$1 = nv.a(dkt.d, dkt.b);
      akr $$2 = oc.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akr $$4 = oc.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, nx.a().a(ny.c, $$4));
         $$1.a(false, $$3, nx.a().a(ny.c, $$2));
      }

      this.b.accept(nu.a(dga.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nu.a(dga.kI)
               .a(
                  nv.a(dts.as)
                     .a(0, nx.a().a(ny.c, this.a(dga.kI, "_0", oe.c, of::b)))
                     .a(1, nx.a().a(ny.c, this.a(dga.kI, "_1", oe.c, of::b)))
                     .a(2, nx.a().a(ny.c, this.a(dga.kI, "_2", oe.c, of::b)))
                     .a(3, nx.a().a(ny.c, this.a(dga.kI, "_3", oe.c, of::b)))
               )
         );
   }

   private void Q() {
      akr $$0 = of.G(dga.j);
      of $$1 = new of().a(og.e, $$0).b(og.e, og.c).a(og.f, of.a(dga.i, "_top")).a(og.i, of.a(dga.i, "_snow"));
      nx $$2 = nx.a().a(ny.c, oe.n.a(dga.i, "_snow", $$1, this.c));
      this.a(dga.i, oc.a(dga.i), $$2);
      akr $$3 = oh.f.get(dga.fl).a($$1x -> $$1x.a(og.e, $$0)).a(dga.fl, this.c);
      this.a(dga.fl, $$3, $$2);
      akr $$4 = oh.f.get(dga.l).a($$1x -> $$1x.a(og.e, $$0)).a(dga.l, this.c);
      this.a(dga.l, $$4, $$2);
   }

   private void a(dfy $$0, akr $$1, nx $$2) {
      List<nx> $$3 = Arrays.asList(a($$1));
      this.b.accept(nu.a($$0).a(nv.a(dts.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cut.rh);
      this.b
         .accept(
            nu.a(dga.fC)
               .a(
                  nv.a(dts.ar)
                     .a(0, nx.a().a(ny.c, oc.a(dga.fC, "_stage0")))
                     .a(1, nx.a().a(ny.c, oc.a(dga.fC, "_stage1")))
                     .a(2, nx.a().a(ny.c, oc.a(dga.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dga.kE, oc.a(dga.kE)));
   }

   private void j(dfy $$0, dfy $$1) {
      of $$2 = of.b($$1);
      akr $$3 = oe.Y.a($$0, $$2, this.c);
      akr $$4 = oe.Z.a($$0, $$2, this.c);
      this.b.accept(nu.a($$0).a(a(dts.aT, 1, $$4, $$3)));
   }

   private void T() {
      akr $$0 = oc.a(dga.hc);
      akr $$1 = oc.a(dga.hc, "_side");
      this.a(cut.lR);
      this.b
         .accept(
            nu.a(dga.hc)
               .a(
                  nv.a(dts.Q)
                     .a(ji.a, nx.a().a(ny.c, $$0))
                     .a(ji.c, nx.a().a(ny.c, $$1))
                     .a(ji.f, nx.a().a(ny.c, $$1).a(ny.b, ny.a.b))
                     .a(ji.d, nx.a().a(ny.c, $$1).a(ny.b, ny.a.c))
                     .a(ji.e, nx.a().a(ny.c, $$1).a(ny.b, ny.a.d))
               )
         );
   }

   private void k(dfy $$0, dfy $$1) {
      akr $$2 = oc.a($$0);
      this.b.accept(nu.a($$1, nx.a().a(ny.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      akr $$0 = oc.a(dga.eW, "_post_ends");
      akr $$1 = oc.a(dga.eW, "_post");
      akr $$2 = oc.a(dga.eW, "_cap");
      akr $$3 = oc.a(dga.eW, "_cap_alt");
      akr $$4 = oc.a(dga.eW, "_side");
      akr $$5 = oc.a(dga.eW, "_side_alt");
      this.b
         .accept(
            nt.a(dga.eW)
               .a(nx.a().a(ny.c, $$0))
               .a(ns.a().a(dts.L, false).a(dts.M, false).a(dts.N, false).a(dts.O, false), nx.a().a(ny.c, $$1))
               .a(ns.a().a(dts.L, true).a(dts.M, false).a(dts.N, false).a(dts.O, false), nx.a().a(ny.c, $$2))
               .a(ns.a().a(dts.L, false).a(dts.M, true).a(dts.N, false).a(dts.O, false), nx.a().a(ny.c, $$2).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.L, false).a(dts.M, false).a(dts.N, true).a(dts.O, false), nx.a().a(ny.c, $$3))
               .a(ns.a().a(dts.L, false).a(dts.M, false).a(dts.N, false).a(dts.O, true), nx.a().a(ny.c, $$3).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.L, true), nx.a().a(ny.c, $$4))
               .a(ns.a().a(dts.M, true), nx.a().a(ny.c, $$4).a(ny.b, ny.a.b))
               .a(ns.a().a(dts.N, true), nx.a().a(ny.c, $$5))
               .a(ns.a().a(dts.O, true), nx.a().a(ny.c, $$5).a(ny.b, ny.a.b))
         );
      this.d(dga.eW);
   }

   private void E(dfy $$0) {
      this.b.accept(nu.a($$0, nx.a().a(ny.c, oc.a($$0))).a(b()));
   }

   private void V() {
      akr $$0 = oc.a(dga.dw);
      akr $$1 = oc.a(dga.dw, "_on");
      this.d(dga.dw);
      this.b
         .accept(
            nu.a(dga.dw)
               .a(a(dts.w, $$0, $$1))
               .a(
                  nv.a(dts.U, dts.R)
                     .a(dtn.c, ji.c, nx.a().a(ny.a, ny.a.c).a(ny.b, ny.a.c))
                     .a(dtn.c, ji.f, nx.a().a(ny.a, ny.a.c).a(ny.b, ny.a.d))
                     .a(dtn.c, ji.d, nx.a().a(ny.a, ny.a.c))
                     .a(dtn.c, ji.e, nx.a().a(ny.a, ny.a.c).a(ny.b, ny.a.b))
                     .a(dtn.a, ji.c, nx.a())
                     .a(dtn.a, ji.f, nx.a().a(ny.b, ny.a.b))
                     .a(dtn.a, ji.d, nx.a().a(ny.b, ny.a.c))
                     .a(dtn.a, ji.e, nx.a().a(ny.b, ny.a.d))
                     .a(dtn.b, ji.c, nx.a().a(ny.a, ny.a.b))
                     .a(dtn.b, ji.f, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.b))
                     .a(dtn.b, ji.d, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.c))
                     .a(dtn.b, ji.e, nx.a().a(ny.a, ny.a.b).a(ny.b, ny.a.d))
               )
         );
   }

   private void W() {
      this.d(dga.fm);
      this.b.accept(b(dga.fm, oc.a(dga.fm)));
   }

   private void X() {
      this.d(dga.tn);
      this.b.accept(c(dga.tn, oc.a(dga.tn)));
   }

   private void Y() {
      this.b.accept(nu.a(dga.ed).a(nv.a(dts.H).a(ji.a.a, nx.a().a(ny.c, oc.a(dga.ed, "_ns"))).a(ji.a.c, nx.a().a(ny.c, oc.a(dga.ed, "_ew")))));
   }

   private void Z() {
      akr $$0 = oh.a.create(dga.dV, this.c);
      this.b
         .accept(
            nu.a(
               dga.dV,
               nx.a().a(ny.c, $$0),
               nx.a().a(ny.c, $$0).a(ny.a, ny.a.b),
               nx.a().a(ny.c, $$0).a(ny.a, ny.a.c),
               nx.a().a(ny.c, $$0).a(ny.a, ny.a.d),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.b),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.b).a(ny.a, ny.a.b),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.b).a(ny.a, ny.a.c),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.b).a(ny.a, ny.a.d),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.c),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.c).a(ny.a, ny.a.b),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.c).a(ny.a, ny.a.c),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.c).a(ny.a, ny.a.d),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.d),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.d).a(ny.a, ny.a.b),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.d).a(ny.a, ny.a.c),
               nx.a().a(ny.c, $$0).a(ny.b, ny.a.d).a(ny.a, ny.a.d)
            )
         );
   }

   private void aa() {
      akr $$0 = oc.a(dga.kO);
      akr $$1 = oc.a(dga.kO, "_on");
      this.b.accept(nu.a(dga.kO).a(a(dts.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      of $$0 = new of().a(og.e, of.a(dga.by, "_bottom")).a(og.i, of.a(dga.by, "_side"));
      akr $$1 = of.a(dga.by, "_top_sticky");
      akr $$2 = of.a(dga.by, "_top");
      of $$3 = $$0.c(og.E, $$1);
      of $$4 = $$0.c(og.E, $$2);
      akr $$5 = oc.a(dga.by, "_base");
      this.a(dga.by, $$5, $$4);
      this.a(dga.br, $$5, $$3);
      akr $$6 = oe.n.a(dga.by, "_inventory", $$0.c(og.f, $$2), this.c);
      akr $$7 = oe.n.a(dga.br, "_inventory", $$0.c(og.f, $$1), this.c);
      this.a(dga.by, $$6);
      this.a(dga.br, $$7);
   }

   private void a(dfy $$0, akr $$1, of $$2) {
      akr $$3 = oe.bh.a($$0, $$2, this.c);
      this.b.accept(nu.a($$0).a(a(dts.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      of $$0 = new of().a(og.F, of.a(dga.by, "_top")).a(og.i, of.a(dga.by, "_side"));
      of $$1 = $$0.c(og.E, of.a(dga.by, "_top_sticky"));
      of $$2 = $$0.c(og.E, of.a(dga.by, "_top"));
      this.b
         .accept(
            nu.a(dga.bz)
               .a(
                  nv.a(dts.x, dts.bg)
                     .a(false, due.a, nx.a().a(ny.c, oe.bi.a(dga.by, "_head", $$2, this.c)))
                     .a(false, due.b, nx.a().a(ny.c, oe.bi.a(dga.by, "_head_sticky", $$1, this.c)))
                     .a(true, due.a, nx.a().a(ny.c, oe.bj.a(dga.by, "_head_short", $$2, this.c)))
                     .a(true, due.b, nx.a().a(ny.c, oe.bj.a(dga.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dfy $$0 = dga.tr;
      of $$1 = of.a($$0, "_side_inactive", "_top_inactive");
      of $$2 = of.a($$0, "_side_active", "_top_active");
      of $$3 = of.a($$0, "_side_active", "_top_ejecting_reward");
      of $$4 = of.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      of $$5 = of.a($$0, "_side_active_ominous", "_top_active_ominous");
      of $$6 = of.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      akr $$7 = oe.o.a($$0, $$1, this.c);
      akr $$8 = oe.o.a($$0, "_active", $$2, this.c);
      akr $$9 = oe.o.a($$0, "_ejecting_reward", $$3, this.c);
      akr $$10 = oe.o.a($$0, "_inactive_ominous", $$4, this.c);
      akr $$11 = oe.o.a($$0, "_active_ominous", $$5, this.c);
      akr $$12 = oe.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nu.a($$0).a(nv.a(dts.by, dts.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> nx.a().a(ny.c, $$7x ? $$10 : $$7);
            case b, c, d -> nx.a().a(ny.c, $$7x ? $$11 : $$8);
            case e -> nx.a().a(ny.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dfy $$0 = dga.ts;
      of $$1 = of.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      of $$2 = of.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      of $$3 = of.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      of $$4 = of.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akr $$5 = oe.bN.a($$0, $$1, this.c);
      akr $$6 = oe.bN.a($$0, "_active", $$2, this.c);
      akr $$7 = oe.bN.a($$0, "_unlocking", $$3, this.c);
      akr $$8 = oe.bN.a($$0, "_ejecting_reward", $$4, this.c);
      of $$9 = of.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      of $$10 = of.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      of $$11 = of.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      of $$12 = of.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      akr $$13 = oe.bN.a($$0, "_ominous", $$9, this.c);
      akr $$14 = oe.bN.a($$0, "_active_ominous", $$10, this.c);
      akr $$15 = oe.bN.a($$0, "_unlocking_ominous", $$11, this.c);
      akr $$16 = oe.bN.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nu.a($$0).a(b()).a(nv.a(dou.b, dou.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> nx.a().a(ny.c, $$9x ? $$13 : $$5);
            case b -> nx.a().a(ny.c, $$9x ? $$14 : $$6);
            case c -> nx.a().a(ny.c, $$9x ? $$15 : $$7);
            case d -> nx.a().a(ny.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      akr $$0 = oc.a(dga.qQ, "_inactive");
      akr $$1 = oc.a(dga.qQ, "_active");
      this.a(dga.qQ, $$0);
      this.b.accept(nu.a(dga.qQ).a(nv.a(dts.bo).a($$2 -> nx.a().a(ny.c, $$2 != duj.b && $$2 != duj.c ? $$0 : $$1))));
   }

   private void ag() {
      akr $$0 = oc.a(dga.qR, "_inactive");
      akr $$1 = oc.a(dga.qR, "_active");
      this.a(dga.qR, $$0);
      this.b.accept(nu.a(dga.qR).a(nv.a(dts.bo).a($$2 -> nx.a().a(ny.c, $$2 != duj.b && $$2 != duj.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      akr $$0 = oe.bM.a(dga.qV, of.a(false), this.c);
      akr $$1 = oe.bM.a(dga.qV, "_can_summon", of.a(true), this.c);
      this.a(dga.qV, $$0);
      this.b.accept(nu.a(dga.qV).a(a(dts.G, $$1, $$0)));
   }

   private void ai() {
      akr $$0 = oc.a(dga.nS, "_stable");
      akr $$1 = oc.a(dga.nS, "_unstable");
      this.a(dga.nS, $$0);
      this.b.accept(nu.a(dga.nS).a(a(dts.b, $$1, $$0)));
   }

   private void aj() {
      akr $$0 = this.a(dga.sv, "", oe.ao, of::c);
      akr $$1 = this.a(dga.sv, "_lit", oe.ao, of::c);
      this.b.accept(nu.a(dga.sv).a(a(dts.D, $$1, $$0)));
      akr $$2 = this.a(dga.sw, "", oe.ao, of::c);
      akr $$3 = this.a(dga.sw, "_lit", oe.ao, of::c);
      this.b.accept(nu.a(dga.sw).a(a(dts.D, $$3, $$2)));
   }

   private void ak() {
      akr $$0 = oh.a.create(dga.fB, this.c);
      akr $$1 = this.a(dga.fB, "_on", oe.c, of::b);
      this.b.accept(nu.a(dga.fB).a(a(dts.r, $$1, $$0)));
   }

   private void l(dfy $$0, dfy $$1) {
      of $$2 = of.y($$0);
      this.b.accept(c($$0, oe.bf.a($$0, $$2, this.c)));
      this.b.accept(nu.a($$1, nx.a().a(ny.c, oe.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      of $$0 = of.y(dga.dK);
      of $$1 = of.i(of.a(dga.dK, "_off"));
      akr $$2 = oe.bf.a(dga.dK, $$0, this.c);
      akr $$3 = oe.bf.a(dga.dK, "_off", $$1, this.c);
      this.b.accept(nu.a(dga.dK).a(a(dts.r, $$2, $$3)));
      akr $$4 = oe.bg.a(dga.dL, $$0, this.c);
      akr $$5 = oe.bg.a(dga.dL, "_off", $$1, this.c);
      this.b.accept(nu.a(dga.dL).a(a(dts.r, $$4, $$5)).a(d()));
      this.d(dga.dK);
      this.c(dga.dL);
   }

   private void am() {
      this.a(cut.lK);
      this.b.accept(nu.a(dga.eh).a(nv.a(dts.aA, dts.s, dts.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return nx.a().a(ny.c, of.a(dga.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cut.cT);
      this.b
         .accept(
            nu.a(dga.mV)
               .a(
                  nv.a(dts.aS, dts.C)
                     .a(1, false, Arrays.asList(a(oc.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(oc.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(oc.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(oc.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(oc.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(oc.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(oc.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(oc.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      of $$0 = of.a(dga.dN);
      akr $$1 = oe.c.a(dga.dP, $$0, this.c);
      this.b.accept(nu.a(dga.dN).a(nv.a(dts.aF).a($$1x -> nx.a().a(ny.c, $$1x < 8 ? oc.a(dga.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dga.dN, oc.a(dga.dN, "_height2"));
      this.b.accept(c(dga.dP, $$1));
   }

   private void ap() {
      this.b.accept(nu.a(dga.oc, nx.a().a(ny.c, oc.a(dga.oc))).a(b()));
   }

   private void aq() {
      akr $$0 = oh.a.create(dga.pa, this.c);
      this.a(dga.pa, $$0);
      this.b.accept(nu.a(dga.pa).a(nv.a(dts.bj).a($$0x -> nx.a().a(ny.c, this.a(dga.pa, "_" + $$0x.c(), oe.c, of::b)))));
   }

   private void ar() {
      this.a(cut.wu);
      this.b.accept(nu.a(dga.oi).a(nv.a(dts.as).a($$0 -> nx.a().a(ny.c, this.a(dga.oi, "_stage" + $$0, oe.ao, of::c)))));
   }

   private void as() {
      this.a(cut.ps);
      this.b
         .accept(
            nu.a(dga.fI)
               .a(
                  nv.a(dts.a, dts.M, dts.L, dts.N, dts.O)
                     .a(false, false, false, false, false, nx.a().a(ny.c, oc.a(dga.fI, "_ns")))
                     .a(false, true, false, false, false, nx.a().a(ny.c, oc.a(dga.fI, "_n")).a(ny.b, ny.a.b))
                     .a(false, false, true, false, false, nx.a().a(ny.c, oc.a(dga.fI, "_n")))
                     .a(false, false, false, true, false, nx.a().a(ny.c, oc.a(dga.fI, "_n")).a(ny.b, ny.a.c))
                     .a(false, false, false, false, true, nx.a().a(ny.c, oc.a(dga.fI, "_n")).a(ny.b, ny.a.d))
                     .a(false, true, true, false, false, nx.a().a(ny.c, oc.a(dga.fI, "_ne")))
                     .a(false, true, false, true, false, nx.a().a(ny.c, oc.a(dga.fI, "_ne")).a(ny.b, ny.a.b))
                     .a(false, false, false, true, true, nx.a().a(ny.c, oc.a(dga.fI, "_ne")).a(ny.b, ny.a.c))
                     .a(false, false, true, false, true, nx.a().a(ny.c, oc.a(dga.fI, "_ne")).a(ny.b, ny.a.d))
                     .a(false, false, true, true, false, nx.a().a(ny.c, oc.a(dga.fI, "_ns")))
                     .a(false, true, false, false, true, nx.a().a(ny.c, oc.a(dga.fI, "_ns")).a(ny.b, ny.a.b))
                     .a(false, true, true, true, false, nx.a().a(ny.c, oc.a(dga.fI, "_nse")))
                     .a(false, true, false, true, true, nx.a().a(ny.c, oc.a(dga.fI, "_nse")).a(ny.b, ny.a.b))
                     .a(false, false, true, true, true, nx.a().a(ny.c, oc.a(dga.fI, "_nse")).a(ny.b, ny.a.c))
                     .a(false, true, true, false, true, nx.a().a(ny.c, oc.a(dga.fI, "_nse")).a(ny.b, ny.a.d))
                     .a(false, true, true, true, true, nx.a().a(ny.c, oc.a(dga.fI, "_nsew")))
                     .a(true, false, false, false, false, nx.a().a(ny.c, oc.a(dga.fI, "_attached_ns")))
                     .a(true, false, true, false, false, nx.a().a(ny.c, oc.a(dga.fI, "_attached_n")))
                     .a(true, false, false, true, false, nx.a().a(ny.c, oc.a(dga.fI, "_attached_n")).a(ny.b, ny.a.c))
                     .a(true, true, false, false, false, nx.a().a(ny.c, oc.a(dga.fI, "_attached_n")).a(ny.b, ny.a.b))
                     .a(true, false, false, false, true, nx.a().a(ny.c, oc.a(dga.fI, "_attached_n")).a(ny.b, ny.a.d))
                     .a(true, true, true, false, false, nx.a().a(ny.c, oc.a(dga.fI, "_attached_ne")))
                     .a(true, true, false, true, false, nx.a().a(ny.c, oc.a(dga.fI, "_attached_ne")).a(ny.b, ny.a.b))
                     .a(true, false, false, true, true, nx.a().a(ny.c, oc.a(dga.fI, "_attached_ne")).a(ny.b, ny.a.c))
                     .a(true, false, true, false, true, nx.a().a(ny.c, oc.a(dga.fI, "_attached_ne")).a(ny.b, ny.a.d))
                     .a(true, false, true, true, false, nx.a().a(ny.c, oc.a(dga.fI, "_attached_ns")))
                     .a(true, true, false, false, true, nx.a().a(ny.c, oc.a(dga.fI, "_attached_ns")).a(ny.b, ny.a.b))
                     .a(true, true, true, true, false, nx.a().a(ny.c, oc.a(dga.fI, "_attached_nse")))
                     .a(true, true, false, true, true, nx.a().a(ny.c, oc.a(dga.fI, "_attached_nse")).a(ny.b, ny.a.b))
                     .a(true, false, true, true, true, nx.a().a(ny.c, oc.a(dga.fI, "_attached_nse")).a(ny.b, ny.a.c))
                     .a(true, true, true, false, true, nx.a().a(ny.c, oc.a(dga.fI, "_attached_nse")).a(ny.b, ny.a.d))
                     .a(true, true, true, true, true, nx.a().a(ny.c, oc.a(dga.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dga.fH);
      this.b.accept(nu.a(dga.fH).a(nv.a(dts.a, dts.w).a(($$0, $$1) -> nx.a().a(ny.c, of.a(dga.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akr a(int $$0, String $$1, of $$2) {
      switch ($$0) {
         case 1:
            return oe.bl.a(oc.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return oe.bm.a(oc.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return oe.bn.a(oc.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return oe.bo.a(oc.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akr a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", of.b(of.G(dga.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", of.b(of.a(dga.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", of.b(of.a(dga.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cut.kp);
      this.b.accept(nu.a(dga.mf).a(nv.a(dts.aD, dts.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cut.kq);
      Function<Integer, akr> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         of $$2 = of.a($$1);
         return oe.bw.a(dga.mg, $$1, $$2, this.c);
      };
      this.b.accept(nu.a(dga.mg).a(nv.a(dnh.c).a($$1 -> nx.a().a(ny.c, $$0.apply($$1)))));
   }

   private void F(dfy $$0) {
      this.d($$0);
      akr $$1 = oc.a($$0);
      nt $$2 = nt.a($$0);
      ns.c $$3 = ad.a(ns.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dtt, Function<akr, nx>> $$4 : a) {
         dtt $$5 = (dtt)$$4.getFirst();
         Function<akr, nx> $$6 = (Function<akr, nx>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(ns.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      akr $$0 = of.a(dga.qU, "_bottom");
      of $$1 = new of().a(og.e, $$0).a(og.f, of.a(dga.qU, "_top")).a(og.i, of.a(dga.qU, "_side"));
      of $$2 = new of().a(og.e, $$0).a(og.f, of.a(dga.qU, "_top_bloom")).a(og.i, of.a(dga.qU, "_side_bloom"));
      akr $$3 = oe.n.a(dga.qU, "", $$1, this.c);
      akr $$4 = oe.n.a(dga.qU, "_bloom", $$2, this.c);
      this.b.accept(nu.a(dga.qU).a(nv.a(dts.E).a($$2x -> nx.a().a(ny.c, $$2x ? $$4 : $$3))));
      this.a(cut.gj, $$3);
   }

   private void ax() {
      dfy $$0 = dga.cm;
      akr $$1 = oc.a($$0);
      nt $$2 = nt.a($$0);
      List.of(Pair.of(ji.c, ny.a.a), Pair.of(ji.f, ny.a.b), Pair.of(ji.d, ny.a.c), Pair.of(ji.e, ny.a.d)).forEach($$2x -> {
         ji $$3 = (ji)$$2x.getFirst();
         ny.a $$4 = (ny.a)$$2x.getSecond();
         ns.c $$5 = ns.a().a(dts.R, $$3);
         $$2.a($$5, nx.a().a(ny.c, $$1).a(ny.b, $$4).a(ny.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, oc.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nt $$0, ns.c $$1, ny.a $$2) {
      List.of(Pair.of(dts.bp, oe.aM), Pair.of(dts.bq, oe.aN), Pair.of(dts.br, oe.aO), Pair.of(dts.bs, oe.aP), Pair.of(dts.bt, oe.aQ), Pair.of(dts.bu, oe.aR))
         .forEach($$3 -> {
            dtt $$4 = (dtt)$$3.getFirst();
            od $$5 = (od)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nt $$0, ns.c $$1, ny.a $$2, dtt $$3, od $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      of $$7 = new of().a(og.b, of.a(dga.cm, $$6));
      no.d $$8 = new no.d($$4, $$6);
      akr $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dga.cm, $$6, $$7, this.c));
      $$0.a(ns.a($$1, ns.a().a($$3, $$5)), nx.a().a(ny.c, $$9).a(ny.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dga.kJ, oe.c.a(dga.kJ, of.b(oc.a("magma")), this.c)));
   }

   private void G(dfy $$0) {
      this.b($$0, oh.q);
      oe.bD.a(oc.a($$0.r()), of.u($$0), this.c);
   }

   private void b(dfy $$0, dfy $$1, no.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dfy $$0, dfy $$1) {
      oe.bE.a(oc.a($$0.r()), of.u($$1), this.c);
   }

   private void az() {
      akr $$0 = oc.a(dga.b);
      akr $$1 = oc.a(dga.b, "_mirrored");
      this.b.accept(a(dga.eN, $$0, $$1));
      this.a(dga.eN, $$0);
   }

   private void aA() {
      akr $$0 = oc.a(dga.sJ);
      akr $$1 = oc.a(dga.sJ, "_mirrored");
      this.b.accept(a(dga.td, $$0, $$1).a(f()));
      this.a(dga.td, $$0);
   }

   private void n(dfy $$0, dfy $$1) {
      this.a($$0, no.e.b);
      of $$2 = of.d(of.a($$0, "_pot"));
      akr $$3 = no.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      akr $$0 = of.a(dga.pl, "_bottom");
      akr $$1 = of.a(dga.pl, "_top_off");
      akr $$2 = of.a(dga.pl, "_top");
      akr[] $$3 = new akr[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         of $$5 = new of().a(og.e, $$0).a(og.f, $$4 == 0 ? $$1 : $$2).a(og.i, of.a(dga.pl, "_side" + $$4));
         $$3[$$4] = oe.n.a(dga.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nu.a(dga.pl).a(nv.a(dts.aZ).a($$1x -> nx.a().a(ny.c, $$3[$$1x]))));
      this.a(cut.wS, $$3[0]);
   }

   private nx a(jk $$0, nx $$1) {
      switch ($$0) {
         case b:
            return $$1.a(ny.a, ny.a.b);
         case c:
            return $$1.a(ny.a, ny.a.b).a(ny.b, ny.a.c);
         case d:
            return $$1.a(ny.a, ny.a.b).a(ny.b, ny.a.d);
         case a:
            return $$1.a(ny.a, ny.a.b).a(ny.b, ny.a.b);
         case f:
            return $$1.a(ny.a, ny.a.d).a(ny.b, ny.a.c);
         case g:
            return $$1.a(ny.a, ny.a.d);
         case h:
            return $$1.a(ny.a, ny.a.d).a(ny.b, ny.a.b);
         case e:
            return $$1.a(ny.a, ny.a.d).a(ny.b, ny.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(ny.b, ny.a.c);
         case i:
            return $$1.a(ny.b, ny.a.d);
         case j:
            return $$1.a(ny.b, ny.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      akr $$0 = of.a(dga.pb, "_top");
      akr $$1 = of.a(dga.pb, "_bottom");
      akr $$2 = of.a(dga.pb, "_side");
      akr $$3 = of.a(dga.pb, "_lock");
      of $$4 = new of().a(og.o, $$2).a(og.m, $$2).a(og.l, $$2).a(og.c, $$0).a(og.j, $$0).a(og.k, $$1).a(og.n, $$3);
      akr $$5 = oe.b.a(dga.pb, $$4, this.c);
      this.b.accept(nu.a(dga.pb, nx.a().a(ny.c, $$5)).a(nv.a(dts.T).a($$0x -> this.a($$0x, nx.a()))));
   }

   private void aD() {
      dfy $$0 = dga.n;
      akr $$1 = oc.a($$0);
      oh $$2 = oh.a.get($$0);
      dfy $$3 = dga.jH;
      akr $$4 = oe.ab.a($$3, $$2.b(), this.c);
      akr $$5 = oe.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lw.a().filter(lx::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dga.rf).a(lw.w).a(dga.rf, dga.rD).a(dga.rj, dga.rn).a(lw.y);
      this.h(dga.re).a(lw.A).a(dga.re, dga.rC).a(dga.ri, dga.rm).a(lw.C);
      this.h(dga.rd).a(lw.E).a(dga.rd, dga.rB).a(dga.rh, dga.rl).a(lw.G);
      this.h(dga.rc).a(lw.I).a(dga.rc, dga.rA).a(dga.rg, dga.rk).a(lw.K);
      this.w(dga.sk);
      this.w(dga.sl);
      this.w(dga.sm);
      this.w(dga.sn);
      this.i(dga.sk, dga.so);
      this.i(dga.sl, dga.sp);
      this.i(dga.sm, dga.sq);
      this.i(dga.sn, dga.sr);
      this.m(dga.a);
      this.c(dga.nc, dga.a);
      this.c(dga.nb, dga.a);
      this.m(dga.fO);
      this.m(dga.dQ);
      this.c(dga.nd, dga.G);
      this.m(dga.fA);
      this.m(dga.me);
      this.m(dga.fr);
      this.m(dga.fR);
      this.a(cut.ue);
      this.m(dga.pg);
      this.m(dga.G);
      this.m(dga.H);
      this.m(dga.hV);
      this.a(cut.fS);
      this.o(dga.pM, dga.qd);
      this.o(dga.pN, dga.qe);
      this.o(dga.pO, dga.qf);
      this.o(dga.pP, dga.qg);
      this.o(dga.pQ, dga.qh);
      this.o(dga.pR, dga.qi);
      this.o(dga.pS, dga.qj);
      this.o(dga.pT, dga.qk);
      this.o(dga.pU, dga.ql);
      this.o(dga.pV, dga.qm);
      this.o(dga.pW, dga.qn);
      this.o(dga.pX, dga.qo);
      this.o(dga.pY, dga.qp);
      this.o(dga.pZ, dga.qq);
      this.o(dga.qa, dga.qr);
      this.o(dga.qb, dga.qs);
      this.o(dga.pL, dga.qc);
      this.m(dga.na);
      this.m(dga.gs);
      this.m(dga.qP);
      this.m(dga.sx);
      this.s(dga.sy);
      this.s(dga.sz);
      this.t(dga.ti);
      this.t(dga.tj);
      this.aj();
      this.g(dga.sC, dga.sA);
      this.p(dga.sB);
      this.a(dga.hW, cut.hB);
      this.a(cut.hB);
      this.aE();
      this.a(dga.kN, cut.jb);
      this.a(cut.jb);
      this.f(dga.bQ, of.a(dga.by, "_side"));
      this.a(dga.R);
      this.a(dga.S);
      this.a(dga.iB);
      this.a(dga.cx);
      this.a(dga.cy);
      this.a(dga.cz);
      this.a(dga.fE);
      this.a(dga.fF);
      this.a(dga.fJ);
      this.a(dga.N);
      this.a(dga.T);
      this.a(dga.O);
      this.a(dga.ch);
      this.a(dga.P);
      this.a(dga.Q);
      this.a(dga.ci);
      this.b(dga.pj, oh.d);
      this.a(dga.pi);
      this.a(dga.aR);
      this.a(dga.aS);
      this.a(dga.aT);
      this.a(dga.hb);
      this.a(dga.dI);
      this.a(dga.dJ);
      this.a(dga.ha);
      this.a(dga.pC);
      this.a(dga.mW);
      this.a(dga.dR);
      this.a(dga.k);
      this.a(dga.pk);
      this.a(dga.fz);
      this.a(dga.ec);
      this.a(dga.L);
      this.a(dga.ph);
      this.a(dga.dO);
      this.b(dga.dT, oh.g);
      this.b(dga.pq, oh.d);
      this.b(dga.fa, oh.d);
      this.m(dga.ac);
      this.m(dga.ga);
      this.a(dga.kK);
      this.a(dga.aY);
      this.a(dga.iC);
      this.a(dga.co);
      this.a(dga.pK);
      this.a(dga.ii);
      this.a(dga.oy);
      this.a(dga.dW);
      this.a(dga.dX);
      this.b(dga.ct, oh.b);
      this.a(dga.aO);
      this.b(dga.bw, oh.v);
      this.a(cut.cS);
      this.b(dga.ck, oh.f);
      this.b(dga.pd, oh.d);
      this.a(dga.op);
      this.a(dga.aP);
      this.a(dga.qt);
      this.a(dga.qu);
      this.a(dga.qN);
      this.a(dga.su);
      this.a(dga.tf);
      this.a(dga.tg);
      this.a(dga.th);
      this.e(dga.qS);
      this.m(dga.tt);
      this.aD();
      this.a(dga.ra);
      this.a(dga.rb);
      this.a(dga.qW);
      this.a(dga.qX);
      this.a(dga.qY);
      this.a(dga.qZ);
      this.k(dga.qW, dga.rw);
      this.k(dga.qX, dga.ry);
      this.k(dga.qY, dga.rx);
      this.k(dga.qZ, dga.rz);
      this.i(dga.rM);
      this.i(dga.rN);
      this.i(dga.rP);
      this.i(dga.rO);
      this.a(dga.rM, dga.rQ);
      this.a(dga.rN, dga.rR);
      this.a(dga.rP, dga.rT);
      this.a(dga.rO, dga.rS);
      this.k(dga.rU);
      this.k(dga.rV);
      this.k(dga.rX);
      this.k(dga.rW);
      this.b(dga.rU, dga.rY);
      this.b(dga.rV, dga.rZ);
      this.b(dga.rX, dga.sb);
      this.b(dga.rW, dga.sa);
      this.a(dga.sc);
      this.a(dga.sd);
      this.a(dga.se);
      this.a(dga.sf);
      this.k(dga.sc, dga.sg);
      this.k(dga.sd, dga.sh);
      this.k(dga.se, dga.si);
      this.k(dga.sf, dga.sj);
      this.j(dga.gW, dga.ch);
      this.j(dga.gX, dga.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dga.og, dga.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dga.kt);
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
      this.F(dga.ff);
      this.F(dga.fg);
      this.F(dga.qT);
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
      this.E(dga.cO);
      this.d(dga.cO);
      this.E(dga.oa);
      this.g();
      this.E(dga.sE);
      this.l(dga.cp, dga.cq);
      this.l(dga.ea, dga.eb);
      this.a(dga.cA, dga.n, of::c);
      this.a(dga.nY, dga.p, of::d);
      this.y(dga.ow);
      this.y(dga.on);
      this.v(dga.aU);
      this.v(dga.hi);
      this.C();
      this.D(dga.oe);
      this.D(dga.of);
      this.e(dga.eX, oc.a(dga.eX));
      this.a(dga.dY, oh.d);
      this.a(dga.dZ, oh.d);
      this.a(dga.te);
      this.a(dga.kM, oh.d);
      this.f(dga.j);
      this.f(dga.sH);
      this.f(dga.I);
      this.g(dga.J);
      this.g(dga.M);
      this.f(dga.K);
      this.e(dga.F);
      this.b(dga.to, oh.f);
      this.a(dga.ij, oh.d, oh.e);
      this.a(dga.kx, oh.w, oh.x);
      this.a(dga.hf, oh.w, oh.x);
      this.a(dga.tk, oh.d, oh.e);
      this.a(dga.tl, oh.d, oh.e);
      this.a(dga.tm, oh.d, oh.e);
      this.c(dga.nT, oh.i);
      this.z();
      this.a(dga.pe, of::A);
      this.a(dga.pf, of::C);
      this.a(dga.kD, dts.as, 0, 1, 2, 3);
      this.a(dga.gt, dts.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dga.fq, dts.as, 0, 1, 1, 2);
      this.a(dga.gu, dts.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dga.cB, dts.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dga.kA, no.e.b, dts.aq, 0, 1);
      this.i();
      this.h();
      this.a(oc.a("decorated_pot"), dga.iA).b(dga.tp);
      this.a(oc.a("banner"), dga.n)
         .a(oe.bF, dga.iJ, dga.iK, dga.iL, dga.iM, dga.iN, dga.iO, dga.iP, dga.iQ, dga.iR, dga.iS, dga.iT, dga.iU, dga.iV, dga.iW, dga.iX, dga.iY)
         .b(dga.iZ, dga.ja, dga.jb, dga.jc, dga.jd, dga.je, dga.jf, dga.jg, dga.jh, dga.ji, dga.jj, dga.jk, dga.jl, dga.jm, dga.jn, dga.jo);
      this.a(oc.a("bed"), dga.n)
         .b(dga.aZ, dga.ba, dga.bb, dga.bc, dga.bd, dga.be, dga.bf, dga.bg, dga.bh, dga.bi, dga.bj, dga.bk, dga.bl, dga.bm, dga.bn, dga.bo);
      this.m(dga.aZ, dga.bA);
      this.m(dga.ba, dga.bB);
      this.m(dga.bb, dga.bC);
      this.m(dga.bc, dga.bD);
      this.m(dga.bd, dga.bE);
      this.m(dga.be, dga.bF);
      this.m(dga.bf, dga.bG);
      this.m(dga.bg, dga.bH);
      this.m(dga.bh, dga.bI);
      this.m(dga.bi, dga.bJ);
      this.m(dga.bj, dga.bK);
      this.m(dga.bk, dga.bL);
      this.m(dga.bl, dga.bM);
      this.m(dga.bm, dga.bN);
      this.m(dga.bn, dga.bO);
      this.m(dga.bo, dga.bP);
      this.a(oc.a("skull"), dga.dW)
         .a(oe.bG, dga.gM, dga.gK, dga.gI, dga.gE, dga.gG, dga.gQ)
         .a(dga.gO)
         .b(dga.gN, dga.gP, dga.gL, dga.gJ, dga.gF, dga.gH, dga.gR);
      this.G(dga.kP);
      this.G(dga.kQ);
      this.G(dga.kR);
      this.G(dga.kS);
      this.G(dga.kT);
      this.G(dga.kU);
      this.G(dga.kV);
      this.G(dga.kW);
      this.G(dga.kX);
      this.G(dga.kY);
      this.G(dga.kZ);
      this.G(dga.la);
      this.G(dga.lb);
      this.G(dga.lc);
      this.G(dga.ld);
      this.G(dga.le);
      this.G(dga.lf);
      this.b(dga.mX, oh.q);
      this.c(dga.mX);
      this.a(oc.a("chest"), dga.n).b(dga.cv, dga.gV);
      this.a(oc.a("ender_chest"), dga.co).b(dga.fG);
      this.f(dga.fx, dga.co).a(dga.fx, dga.kF);
      this.a(dga.aM);
      this.a(dga.aN);
      this.a(dga.lw);
      this.a(dga.lx);
      this.a(dga.ly);
      this.a(dga.lz);
      this.a(dga.lA);
      this.a(dga.lB);
      this.a(dga.lC);
      this.a(dga.lD);
      this.a(dga.lE);
      this.a(dga.lF);
      this.a(dga.lG);
      this.a(dga.lH);
      this.a(dga.lI);
      this.a(dga.lJ);
      this.a(dga.lK);
      this.a(dga.lL);
      this.a(oh.a, dga.lM, dga.lN, dga.lO, dga.lP, dga.lQ, dga.lR, dga.lS, dga.lT, dga.lU, dga.lV, dga.lW, dga.lX, dga.lY, dga.lZ, dga.ma, dga.mb);
      this.a(dga.iA);
      this.a(dga.hj);
      this.a(dga.hk);
      this.a(dga.hl);
      this.a(dga.hm);
      this.a(dga.hn);
      this.a(dga.ho);
      this.a(dga.hp);
      this.a(dga.hq);
      this.a(dga.hr);
      this.a(dga.hs);
      this.a(dga.ht);
      this.a(dga.hu);
      this.a(dga.hv);
      this.a(dga.hw);
      this.a(dga.hx);
      this.a(dga.hy);
      this.a(dga.qO);
      this.h(dga.aQ, dga.eY);
      this.h(dga.ei, dga.hz);
      this.h(dga.ej, dga.hA);
      this.h(dga.ek, dga.hB);
      this.h(dga.el, dga.hC);
      this.h(dga.em, dga.hD);
      this.h(dga.en, dga.hE);
      this.h(dga.eo, dga.hF);
      this.h(dga.ep, dga.hG);
      this.h(dga.eq, dga.hH);
      this.h(dga.er, dga.hI);
      this.h(dga.es, dga.hJ);
      this.h(dga.et, dga.hK);
      this.h(dga.eu, dga.hL);
      this.h(dga.ev, dga.hM);
      this.h(dga.ew, dga.hN);
      this.h(dga.ex, dga.hO);
      this.b(oh.o, dga.lg, dga.lh, dga.li, dga.lj, dga.lk, dga.ll, dga.lm, dga.ln, dga.lo, dga.lp, dga.lq, dga.lr, dga.ls, dga.lt, dga.lu, dga.lv);
      this.g(dga.bA, dga.ik);
      this.g(dga.bB, dga.il);
      this.g(dga.bC, dga.im);
      this.g(dga.bD, dga.in);
      this.g(dga.bE, dga.io);
      this.g(dga.bF, dga.ip);
      this.g(dga.bG, dga.iq);
      this.g(dga.bH, dga.ir);
      this.g(dga.bI, dga.is);
      this.g(dga.bJ, dga.it);
      this.g(dga.bK, dga.iu);
      this.g(dga.bL, dga.iv);
      this.g(dga.bM, dga.iw);
      this.g(dga.bN, dga.ix);
      this.g(dga.bO, dga.iy);
      this.g(dga.bP, dga.iz);
      this.a(dga.sI);
      this.a(dga.eL);
      this.a(dga.bu, dga.gb, no.e.a);
      this.a(dga.bR, dga.gc, no.e.b);
      this.a(dga.bT, dga.gd, no.e.b);
      this.a(dga.bU, dga.ge, no.e.b);
      this.a(dga.bV, dga.gf, no.e.b);
      this.a(dga.bW, dga.gg, no.e.b);
      this.a(dga.bX, dga.gh, no.e.b);
      this.a(dga.bY, dga.gi, no.e.b);
      this.a(dga.bZ, dga.gj, no.e.b);
      this.a(dga.ca, dga.gk, no.e.b);
      this.a(dga.cb, dga.gl, no.e.b);
      this.a(dga.cc, dga.gm, no.e.b);
      this.a(dga.ce, dga.gn, no.e.b);
      this.a(dga.cd, dga.go, no.e.b);
      this.a(dga.cg, dga.gp, no.e.b);
      this.a(dga.cf, dga.gq, no.e.b);
      this.a(dga.bv, dga.gr, no.e.b);
      this.a(dga.bS, dga.fS, no.e.b);
      this.H();
      this.u(dga.eT);
      this.u(dga.eU);
      this.u(dga.eV);
      this.a(dga.bt, no.e.a);
      this.b(dga.dS, no.e.a);
      this.a(cut.dJ);
      this.b(dga.mc, dga.md, no.e.b);
      this.a(cut.dK);
      this.c(dga.md);
      this.b(dga.sG, no.e.b);
      this.c(dga.sG);
      this.c(dga.sw);
      this.b(dga.oz, dga.oA, no.e.b);
      this.b(dga.oB, dga.oC, no.e.b);
      this.a(dga.oz, "_plant");
      this.c(dga.oA);
      this.a(dga.oB, "_plant");
      this.c(dga.oC);
      this.a(dga.mY, no.e.a, of.c(of.a(dga.mZ, "_stage0")));
      this.m();
      this.a(dga.bs, no.e.b);
      this.c(dga.iE, no.e.b);
      this.c(dga.iF, no.e.b);
      this.c(dga.iG, no.e.b);
      this.c(dga.iH, no.e.a);
      this.c(dga.iI, no.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dga.mw, dga.mr, dga.mm, dga.mh, dga.mG, dga.mB, dga.mQ, dga.mL);
      this.a(dga.mx, dga.ms, dga.mn, dga.mi, dga.mH, dga.mC, dga.mR, dga.mM);
      this.a(dga.my, dga.mt, dga.mo, dga.mj, dga.mI, dga.mD, dga.mS, dga.mN);
      this.a(dga.mz, dga.mu, dga.mp, dga.mk, dga.mJ, dga.mE, dga.mT, dga.mO);
      this.a(dga.mA, dga.mv, dga.mq, dga.ml, dga.mK, dga.mF, dga.mU, dga.mP);
      this.e(dga.fe, dga.fc);
      this.e(dga.fd, dga.fb);
      this.l(dga.ab).c(dga.ab).a(dga.av);
      this.l(dga.am).c(dga.am).a(dga.aD);
      this.a(dga.am, dga.dj, dga.ds);
      this.b(dga.aL, oh.s);
      this.l(dga.Y).c(dga.Y).a(dga.as);
      this.l(dga.ai).c(dga.ai).a(dga.aA);
      this.a(dga.ai, dga.dd, dga.do);
      this.a(dga.B, dga.fX, no.e.b);
      this.b(dga.aI, oh.s);
      this.l(dga.Z).d(dga.Z).a(dga.at);
      this.l(dga.aj).d(dga.aj).a(dga.aB);
      this.a(dga.aj, dga.de, dga.dp);
      this.a(dga.C, dga.fY, no.e.b);
      this.b(dga.aJ, oh.s);
      this.l(dga.W).c(dga.W).a(dga.aq);
      this.l(dga.ag).c(dga.ag).a(dga.ay);
      this.a(dga.ag, dga.dc, dga.dn);
      this.a(dga.z, dga.fV, no.e.b);
      this.b(dga.aG, oh.s);
      this.l(dga.U).c(dga.U).a(dga.ao);
      this.l(dga.al).c(dga.al).a(dga.aw);
      this.a(dga.al, dga.da, dga.dl);
      this.a(dga.x, dga.fT, no.e.b);
      this.b(dga.aE, oh.s);
      this.l(dga.V).c(dga.V).a(dga.ap);
      this.l(dga.af).c(dga.af).a(dga.ax);
      this.a(dga.af, dga.db, dga.dm);
      this.a(dga.y, dga.fU, no.e.b);
      this.b(dga.aF, oh.s);
      this.l(dga.aa).c(dga.aa).a(dga.au);
      this.l(dga.ak).c(dga.ak).a(dga.aC);
      this.a(dga.ak, dga.dg, dga.dr);
      this.a(dga.D, dga.fZ, no.e.b);
      this.b(dga.aK, oh.s);
      this.l(dga.X).c(dga.X).a(dga.ar);
      this.l(dga.ah).c(dga.ah).a(dga.az);
      this.a(dga.ah, dga.df, dga.dq);
      this.a(dga.A, dga.fW, no.e.b);
      this.b(dga.aH, oh.s);
      this.l(dga.os).b(dga.os).a(dga.ou);
      this.l(dga.ot).b(dga.ot).a(dga.ov);
      this.a(dga.ot, dga.dh, dga.dt);
      this.a(dga.ox, dga.pm, no.e.b);
      this.n(dga.oD, dga.po);
      this.l(dga.oj).b(dga.oj).a(dga.ol);
      this.l(dga.ok).b(dga.ok).a(dga.om);
      this.a(dga.ok, dga.di, dga.du);
      this.a(dga.oo, dga.pn, no.e.b);
      this.n(dga.oq, dga.pp);
      this.l(dga.ae).d(dga.ae);
      this.l(dga.an).d(dga.an);
      this.a(dga.v, dga.dk, dga.dv);
      this.b(dga.or, no.e.b);
      this.a(cut.dG);
      this.i(dga.dy);
      this.k(dga.hY);
      this.u();
      this.n(dga.cP);
      this.o(dga.bp);
      this.o(dga.bq);
      this.o(dga.hh);
      this.t();
      this.q(dga.fN);
      this.q(dga.kG);
      this.q(dga.kH);
      this.r(dga.gS);
      this.r(dga.gT);
      this.r(dga.gU);
      this.o();
      this.p();
      this.d(dga.cD, oh.h);
      this.d(dga.nW, oh.h);
      this.d(dga.nV, oh.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dga.eK, dga.eS);
      this.k(dga.m, dga.eO);
      this.k(dga.eJ, dga.eR);
      this.k(dga.eI, dga.eQ);
      this.az();
      this.k(dga.eH, dga.eP);
      this.aA();
      cwa.h().forEach($$0 -> this.a($$0, oc.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dga.hX);
      nv.a<Integer> $$0 = nv.a(dts.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akr $$3 = of.a(cut.hC, $$2);
         $$0.a($$1, nx.a().a(ny.c, oe.aa.a(dga.hX, $$2, of.h($$3), this.c)));
         oe.bx.a(oc.a(cut.hC, $$2), of.k($$3), this.c);
      }

      this.b.accept(nu.a(dga.hX).a($$0));
   }

   private void o(dfy $$0, dfy $$1) {
      this.a($$0.r());
      of $$2 = of.b(of.G($$0));
      of $$3 = of.b(of.a($$0, "_lit"));
      akr $$4 = oe.bH.a($$0, "_one_candle", $$2, this.c);
      akr $$5 = oe.bI.a($$0, "_two_candles", $$2, this.c);
      akr $$6 = oe.bJ.a($$0, "_three_candles", $$2, this.c);
      akr $$7 = oe.bK.a($$0, "_four_candles", $$2, this.c);
      akr $$8 = oe.bH.a($$0, "_one_candle_lit", $$3, this.c);
      akr $$9 = oe.bI.a($$0, "_two_candles_lit", $$3, this.c);
      akr $$10 = oe.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      akr $$11 = oe.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nu.a($$0)
               .a(
                  nv.a(dts.az, dts.r)
                     .a(1, false, nx.a().a(ny.c, $$4))
                     .a(2, false, nx.a().a(ny.c, $$5))
                     .a(3, false, nx.a().a(ny.c, $$6))
                     .a(4, false, nx.a().a(ny.c, $$7))
                     .a(1, true, nx.a().a(ny.c, $$8))
                     .a(2, true, nx.a().a(ny.c, $$9))
                     .a(3, true, nx.a().a(ny.c, $$10))
                     .a(4, true, nx.a().a(ny.c, $$11))
               )
         );
      akr $$12 = oe.bL.a($$1, of.a($$0, false), this.c);
      akr $$13 = oe.bL.a($$1, "_lit", of.a($$0, true), this.c);
      this.b.accept(nu.a($$1).a(a(dts.r, $$13, $$12)));
   }

   class a {
      private final akr b;

      public a(final akr $$0, final dfy $$1) {
         this.b = oe.aa.a($$0, of.u($$1), no.this.c);
      }

      public no.a a(dfy... $$0) {
         for (dfy $$1 : $$0) {
            no.this.b.accept(no.c($$1, this.b));
         }

         return this;
      }

      public no.a b(dfy... $$0) {
         for (dfy $$1 : $$0) {
            no.this.c($$1);
         }

         return this.a($$0);
      }

      public no.a a(od $$0, dfy... $$1) {
         for (dfy $$2 : $$1) {
            $$0.a(oc.a($$2.r()), of.u($$2), no.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final of b;
      private final Map<od, akr> c = Maps.newHashMap();
      @Nullable
      private lx d;
      @Nullable
      private akr e;
      private final Set<dfy> f = new HashSet<>();

      public b(final of $$0) {
         this.b = $$0;
      }

      public no.b a(dfy $$0, od $$1) {
         this.e = $$1.a($$0, this.b, no.this.c);
         if (no.this.f.containsKey($$0)) {
            no.this.b.accept(no.this.f.get($$0).create($$0, this.e, this.b, no.this.c));
         } else {
            no.this.b.accept(no.c($$0, this.e));
         }

         return this;
      }

      public no.b a(dfy $$0, dfy $$1) {
         akr $$2 = oc.a($$0);
         no.this.b.accept(no.c($$1, $$2));
         no.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public no.b a(dfy $$0) {
         akr $$1 = oe.s.a($$0, this.b, no.this.c);
         akr $$2 = oe.t.a($$0, this.b, no.this.c);
         no.this.b.accept(no.b($$0, $$1, $$2));
         akr $$3 = oe.u.a($$0, this.b, no.this.c);
         no.this.a($$0, $$3);
         return this;
      }

      public no.b b(dfy $$0) {
         akr $$1 = oe.M.a($$0, this.b, no.this.c);
         akr $$2 = oe.N.a($$0, this.b, no.this.c);
         akr $$3 = oe.O.a($$0, this.b, no.this.c);
         no.this.b.accept(no.a($$0, $$1, $$2, $$3));
         akr $$4 = oe.P.a($$0, this.b, no.this.c);
         no.this.a($$0, $$4);
         return this;
      }

      public no.b c(dfy $$0) {
         of $$1 = of.p($$0);
         akr $$2 = oe.D.a($$0, $$1, no.this.c);
         akr $$3 = oe.E.a($$0, $$1, no.this.c);
         akr $$4 = oe.F.a($$0, $$1, no.this.c);
         akr $$5 = oe.G.a($$0, $$1, no.this.c);
         akr $$6 = oe.H.a($$0, $$1, no.this.c);
         no.this.b.accept(no.a($$0, $$2, $$3, $$4, $$5, $$6));
         akr $$7 = oe.I.a($$0, $$1, no.this.c);
         no.this.a($$0, $$7);
         return this;
      }

      public no.b d(dfy $$0) {
         akr $$1 = oe.J.a($$0, this.b, no.this.c);
         akr $$2 = oe.K.a($$0, this.b, no.this.c);
         no.this.b.accept(no.c($$0, $$1, $$2));
         akr $$3 = oe.L.a($$0, this.b, no.this.c);
         no.this.a($$0, $$3);
         return this;
      }

      public no.b e(dfy $$0) {
         of $$1 = of.p($$0);
         akr $$2 = oe.R.a($$0, $$1, no.this.c);
         akr $$3 = oe.Q.a($$0, $$1, no.this.c);
         akr $$4 = oe.T.a($$0, $$1, no.this.c);
         akr $$5 = oe.S.a($$0, $$1, no.this.c);
         no.this.b.accept(no.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public no.b f(dfy $$0) {
         akr $$1 = oe.V.a($$0, this.b, no.this.c);
         akr $$2 = oe.U.a($$0, this.b, no.this.c);
         akr $$3 = oe.X.a($$0, this.b, no.this.c);
         akr $$4 = oe.W.a($$0, this.b, no.this.c);
         no.this.b.accept(no.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public no.b g(dfy $$0) {
         akr $$1 = oe.Y.a($$0, this.b, no.this.c);
         akr $$2 = oe.Z.a($$0, this.b, no.this.c);
         no.this.b.accept(no.e($$0, $$1, $$2));
         return this;
      }

      public no.b h(dfy $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dfy $$1 = this.d.b().get(lx.b.r);
            akr $$2 = oe.aa.a($$0, this.b, no.this.c);
            no.this.b.accept(no.c($$0, $$2));
            no.this.b.accept(no.c($$1, $$2));
            no.this.a($$0.r());
            no.this.c($$1);
            return this;
         }
      }

      public no.b i(dfy $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akr $$1 = this.a(oe.ab, $$0);
            akr $$2 = this.a(oe.ac, $$0);
            no.this.b.accept(no.e($$0, $$1, $$2, this.e));
            no.this.a($$0, $$1);
            return this;
         }
      }

      public no.b j(dfy $$0) {
         akr $$1 = this.a(oe.af, $$0);
         akr $$2 = this.a(oe.ae, $$0);
         akr $$3 = this.a(oe.ag, $$0);
         no.this.b.accept(no.b($$0, $$1, $$2, $$3));
         no.this.a($$0, $$2);
         return this;
      }

      private no.b k(dfy $$0) {
         oh $$1 = no.this.g.getOrDefault($$0, oh.a.get($$0));
         akr $$2 = $$1.a($$0, no.this.c);
         no.this.b.accept(no.c($$0, $$2));
         return this;
      }

      private no.b l(dfy $$0) {
         no.this.i($$0);
         return this;
      }

      private void m(dfy $$0) {
         if (no.this.e.contains($$0)) {
            no.this.k($$0);
         } else {
            no.this.j($$0);
         }
      }

      private akr a(od $$0, dfy $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, no.this.c));
      }

      public no.b a(lx $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<no.b, dfy> $$2 = no.h.get($$0x);
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
      nr create(dfy var1, akr var2, of var3, BiConsumer<akr, Supplier<JsonElement>> var4);
   }

   static record d(od a, String b) {
   }

   static enum e {
      a,
      b;

      public od a() {
         return this == a ? oe.ap : oe.ao;
      }

      public od b() {
         return this == a ? oe.ar : oe.aq;
      }
   }

   class f {
      private final of b;

      public f(final of $$0) {
         this.b = $$0;
      }

      public no.f a(dfy $$0) {
         of $$1 = this.b.c(og.d, this.b.a(og.i));
         akr $$2 = oe.j.a($$0, $$1, no.this.c);
         no.this.b.accept(no.d($$0, $$2));
         return this;
      }

      public no.f b(dfy $$0) {
         akr $$1 = oe.j.a($$0, this.b, no.this.c);
         no.this.b.accept(no.d($$0, $$1));
         return this;
      }

      public no.f c(dfy $$0) {
         akr $$1 = oe.j.a($$0, this.b, no.this.c);
         akr $$2 = oe.k.a($$0, this.b, no.this.c);
         no.this.b.accept(no.d($$0, $$1, $$2));
         return this;
      }

      public no.f d(dfy $$0) {
         no.this.b.accept(no.a($$0, this.b, no.this.c));
         return this;
      }
   }
}
