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

public class ni {
   final Consumer<nl> b;
   final BiConsumer<akt, Supplier<JsonElement>> c;
   private final Consumer<cuc> d;
   final List<dfc> e = ImmutableList.of(dfe.fq, dfe.fw, dfe.iS);
   final Map<dfc, ni.c> f = ImmutableMap.builder().put(dfe.b, ni::a).put(dfe.c, ni::a).put(dfe.ug, ni::c).put(dfe.fE, ni::b).build();
   final Map<dfc, ob> g = ImmutableMap.builder()
      .put(dfe.bF, ob.y.get(dfe.bF))
      .put(dfe.kj, ob.y.get(dfe.kj))
      .put(dfe.kM, ob.a(nz.a(dfe.bF, "_top")))
      .put(dfe.kO, ob.a(nz.a(dfe.kj, "_top")))
      .put(dfe.bH, ob.d.get(dfe.bF).a($$0x -> $$0x.a(oa.i, nz.H(dfe.bH))))
      .put(dfe.kl, ob.d.get(dfe.kj).a($$0x -> $$0x.a(oa.i, nz.H(dfe.kl))))
      .put(dfe.hX, ob.d.get(dfe.hX))
      .put(dfe.kN, ob.a(nz.a(dfe.hX, "_bottom")))
      .put(dfe.qC, ob.z.get(dfe.qC))
      .put(dfe.ug, ob.z.get(dfe.ug))
      .put(dfe.hY, ob.d.get(dfe.hY).a($$0x -> $$0x.a(oa.i, nz.H(dfe.hY))))
      .put(dfe.bG, ob.d.get(dfe.bG).a($$0x -> {
         $$0x.a(oa.d, nz.a(dfe.bF, "_top"));
         $$0x.a(oa.i, nz.H(dfe.bG));
      }))
      .put(dfe.kk, ob.d.get(dfe.kk).a($$0x -> {
         $$0x.a(oa.d, nz.a(dfe.kj, "_top"));
         $$0x.a(oa.i, nz.H(dfe.kk));
      }))
      .put(dfe.rX, ob.z.get(dfe.rX))
      .put(dfe.rS, ob.z.get(dfe.rS))
      .build();
   static final Map<ll.b, BiConsumer<ni.b, dfc>> h = ImmutableMap.builder()
      .put(ll.b.a, ni.b::a)
      .put(ll.b.e, ni.b::l)
      .put(ll.b.b, ni.b::k)
      .put(ll.b.c, ni.b::k)
      .put(ll.b.f, ni.b::c)
      .put(ll.b.g, ni.b::d)
      .put(ll.b.h, ni.b::e)
      .put(ll.b.i, ni.b::f)
      .put(ll.b.k, ni.b::h)
      .put(ll.b.l, ni.b::i)
      .put(ll.b.m, ni.b::j)
      .put(ll.b.n, ni.b::g)
      .put(ll.b.p, ni.b::m)
      .put(ll.b.q, ni.b::b)
      .build();
   public static final List<Pair<dtt, Function<akt, nr>>> a = List.of(
      Pair.of(dts.L, (Function<akt, nr>)$$0 -> nr.a().a(ns.c, $$0)),
      Pair.of(dts.M, (Function<akt, nr>)$$0 -> nr.a().a(ns.c, $$0).a(ns.b, ns.a.b).a(ns.d, true)),
      Pair.of(dts.N, (Function<akt, nr>)$$0 -> nr.a().a(ns.c, $$0).a(ns.b, ns.a.c).a(ns.d, true)),
      Pair.of(dts.O, (Function<akt, nr>)$$0 -> nr.a().a(ns.c, $$0).a(ns.b, ns.a.d).a(ns.d, true)),
      Pair.of(dts.J, (Function<akt, nr>)$$0 -> nr.a().a(ns.c, $$0).a(ns.a, ns.a.d).a(ns.d, true)),
      Pair.of(dts.K, (Function<akt, nr>)$$0 -> nr.a().a(ns.c, $$0).a(ns.a, ns.a.b).a(ns.d, true))
   );
   private static final Map<ni.d, akt> i = new HashMap<>();

   private static nl a(dfc $$0, akt $$1, nz $$2, BiConsumer<akt, Supplier<JsonElement>> $$3) {
      akt $$4 = ny.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nl b(dfc $$0, akt $$1, nz $$2, BiConsumer<akt, Supplier<JsonElement>> $$3) {
      akt $$4 = ny.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nl c(dfc $$0, akt $$1, nz $$2, BiConsumer<akt, Supplier<JsonElement>> $$3) {
      akt $$4 = ny.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ni(Consumer<nl> $$0, BiConsumer<akt, Supplier<JsonElement>> $$1, Consumer<cuc> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dfc $$0) {
      this.d.accept($$0.q());
   }

   void a(dfc $$0, akt $$1) {
      this.c.accept(nw.a($$0.q()), new nv($$1));
   }

   private void a(cuc $$0, akt $$1) {
      this.c.accept(nw.a($$0), new nv($$1));
   }

   void a(cuc $$0) {
      ny.bB.a(nw.a($$0), nz.b($$0), this.c);
   }

   private void d(dfc $$0) {
      cuc $$1 = $$0.q();
      if ($$1 != cuk.a) {
         ny.bB.a(nw.a($$1), nz.G($$0), this.c);
      }
   }

   private void a(dfc $$0, String $$1) {
      cuc $$2 = $$0.q();
      ny.bB.a(nw.a($$2), nz.k(nz.a($$0, $$1)), this.c);
   }

   private static np b() {
      return np.a(dts.R).a(iw.f, nr.a().a(ns.b, ns.a.b)).a(iw.d, nr.a().a(ns.b, ns.a.c)).a(iw.e, nr.a().a(ns.b, ns.a.d)).a(iw.c, nr.a());
   }

   private static np c() {
      return np.a(dts.R).a(iw.d, nr.a()).a(iw.e, nr.a().a(ns.b, ns.a.b)).a(iw.c, nr.a().a(ns.b, ns.a.c)).a(iw.f, nr.a().a(ns.b, ns.a.d));
   }

   private static np d() {
      return np.a(dts.R).a(iw.f, nr.a()).a(iw.d, nr.a().a(ns.b, ns.a.b)).a(iw.e, nr.a().a(ns.b, ns.a.c)).a(iw.c, nr.a().a(ns.b, ns.a.d));
   }

   private static np e() {
      return np.a(dts.P)
         .a(iw.a, nr.a().a(ns.a, ns.a.b))
         .a(iw.b, nr.a().a(ns.a, ns.a.d))
         .a(iw.c, nr.a())
         .a(iw.d, nr.a().a(ns.b, ns.a.c))
         .a(iw.e, nr.a().a(ns.b, ns.a.d))
         .a(iw.f, nr.a().a(ns.b, ns.a.b));
   }

   private static no b(dfc $$0, akt $$1) {
      return no.a($$0, a($$1));
   }

   private static nr[] a(akt $$0) {
      return new nr[]{nr.a().a(ns.c, $$0), nr.a().a(ns.c, $$0).a(ns.b, ns.a.b), nr.a().a(ns.c, $$0).a(ns.b, ns.a.c), nr.a().a(ns.c, $$0).a(ns.b, ns.a.d)};
   }

   private static no a(dfc $$0, akt $$1, akt $$2) {
      return no.a($$0, nr.a().a(ns.c, $$1), nr.a().a(ns.c, $$2), nr.a().a(ns.c, $$1).a(ns.b, ns.a.c), nr.a().a(ns.c, $$2).a(ns.b, ns.a.c));
   }

   private static np a(dtt $$0, akt $$1, akt $$2) {
      return np.a($$0).a(true, nr.a().a(ns.c, $$1)).a(false, nr.a().a(ns.c, $$2));
   }

   private void e(dfc $$0) {
      akt $$1 = ob.a.create($$0, this.c);
      akt $$2 = ob.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dfc $$0) {
      akt $$1 = ob.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dfc $$0) {
      this.b.accept(no.a($$0).a(np.a(dts.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akt $$3 = nz.a($$0, $$2);
         return nr.a().a(ns.c, ny.c.a($$0, $$2, new nz().a(oa.a, $$3), this.c));
      })));
      this.a($$0, nz.a($$0, "_0"));
   }

   static nl b(dfc $$0, akt $$1, akt $$2) {
      return no.a($$0)
         .a(np.a(dts.w).a(false, nr.a().a(ns.c, $$1)).a(true, nr.a().a(ns.c, $$2)))
         .a(
            np.a(dts.U, dts.R)
               .a(dtn.a, iw.f, nr.a().a(ns.b, ns.a.b))
               .a(dtn.a, iw.e, nr.a().a(ns.b, ns.a.d))
               .a(dtn.a, iw.d, nr.a().a(ns.b, ns.a.c))
               .a(dtn.a, iw.c, nr.a())
               .a(dtn.b, iw.f, nr.a().a(ns.b, ns.a.b).a(ns.a, ns.a.b).a(ns.d, true))
               .a(dtn.b, iw.e, nr.a().a(ns.b, ns.a.d).a(ns.a, ns.a.b).a(ns.d, true))
               .a(dtn.b, iw.d, nr.a().a(ns.b, ns.a.c).a(ns.a, ns.a.b).a(ns.d, true))
               .a(dtn.b, iw.c, nr.a().a(ns.a, ns.a.b).a(ns.d, true))
               .a(dtn.c, iw.f, nr.a().a(ns.b, ns.a.d).a(ns.a, ns.a.c))
               .a(dtn.c, iw.e, nr.a().a(ns.b, ns.a.b).a(ns.a, ns.a.c))
               .a(dtn.c, iw.d, nr.a().a(ns.a, ns.a.c))
               .a(dtn.c, iw.c, nr.a().a(ns.b, ns.a.c).a(ns.a, ns.a.c))
         );
   }

   private static np.d<iw, dty, dtx, Boolean> a(np.d<iw, dty, dtx, Boolean> $$0, dty $$1, akt $$2, akt $$3, akt $$4, akt $$5) {
      return $$0.a(iw.f, $$1, dtx.a, false, nr.a().a(ns.c, $$2))
         .a(iw.d, $$1, dtx.a, false, nr.a().a(ns.c, $$2).a(ns.b, ns.a.b))
         .a(iw.e, $$1, dtx.a, false, nr.a().a(ns.c, $$2).a(ns.b, ns.a.c))
         .a(iw.c, $$1, dtx.a, false, nr.a().a(ns.c, $$2).a(ns.b, ns.a.d))
         .a(iw.f, $$1, dtx.b, false, nr.a().a(ns.c, $$4))
         .a(iw.d, $$1, dtx.b, false, nr.a().a(ns.c, $$4).a(ns.b, ns.a.b))
         .a(iw.e, $$1, dtx.b, false, nr.a().a(ns.c, $$4).a(ns.b, ns.a.c))
         .a(iw.c, $$1, dtx.b, false, nr.a().a(ns.c, $$4).a(ns.b, ns.a.d))
         .a(iw.f, $$1, dtx.a, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.b))
         .a(iw.d, $$1, dtx.a, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.c))
         .a(iw.e, $$1, dtx.a, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.d))
         .a(iw.c, $$1, dtx.a, true, nr.a().a(ns.c, $$3))
         .a(iw.f, $$1, dtx.b, true, nr.a().a(ns.c, $$5).a(ns.b, ns.a.d))
         .a(iw.d, $$1, dtx.b, true, nr.a().a(ns.c, $$5))
         .a(iw.e, $$1, dtx.b, true, nr.a().a(ns.c, $$5).a(ns.b, ns.a.b))
         .a(iw.c, $$1, dtx.b, true, nr.a().a(ns.c, $$5).a(ns.b, ns.a.c));
   }

   private static nl a(dfc $$0, akt $$1, akt $$2, akt $$3, akt $$4, akt $$5, akt $$6, akt $$7, akt $$8) {
      return no.a($$0).a(a(a(np.a(dts.R, dts.ae, dts.be, dts.u), dty.b, $$1, $$2, $$3, $$4), dty.a, $$5, $$6, $$7, $$8));
   }

   static nl a(dfc $$0, akt $$1, akt $$2, akt $$3, akt $$4, akt $$5) {
      return nn.a($$0)
         .a(nr.a().a(ns.c, $$1))
         .a(nm.a().a(dts.L, true), nr.a().a(ns.c, $$2).a(ns.d, false))
         .a(nm.a().a(dts.M, true), nr.a().a(ns.c, $$3).a(ns.d, false))
         .a(nm.a().a(dts.N, true), nr.a().a(ns.c, $$4).a(ns.d, false))
         .a(nm.a().a(dts.O, true), nr.a().a(ns.c, $$5).a(ns.d, false));
   }

   static nl c(dfc $$0, akt $$1, akt $$2) {
      return nn.a($$0)
         .a(nr.a().a(ns.c, $$1))
         .a(nm.a().a(dts.L, true), nr.a().a(ns.c, $$2).a(ns.d, true))
         .a(nm.a().a(dts.M, true), nr.a().a(ns.c, $$2).a(ns.b, ns.a.b).a(ns.d, true))
         .a(nm.a().a(dts.N, true), nr.a().a(ns.c, $$2).a(ns.b, ns.a.c).a(ns.d, true))
         .a(nm.a().a(dts.O, true), nr.a().a(ns.c, $$2).a(ns.b, ns.a.d).a(ns.d, true));
   }

   static nl a(dfc $$0, akt $$1, akt $$2, akt $$3) {
      return nn.a($$0)
         .a(nm.a().a(dts.J, true), nr.a().a(ns.c, $$1))
         .a(nm.a().a(dts.X, duo.b), nr.a().a(ns.c, $$2).a(ns.d, true))
         .a(nm.a().a(dts.W, duo.b), nr.a().a(ns.c, $$2).a(ns.b, ns.a.b).a(ns.d, true))
         .a(nm.a().a(dts.Y, duo.b), nr.a().a(ns.c, $$2).a(ns.b, ns.a.c).a(ns.d, true))
         .a(nm.a().a(dts.Z, duo.b), nr.a().a(ns.c, $$2).a(ns.b, ns.a.d).a(ns.d, true))
         .a(nm.a().a(dts.X, duo.c), nr.a().a(ns.c, $$3).a(ns.d, true))
         .a(nm.a().a(dts.W, duo.c), nr.a().a(ns.c, $$3).a(ns.b, ns.a.b).a(ns.d, true))
         .a(nm.a().a(dts.Y, duo.c), nr.a().a(ns.c, $$3).a(ns.b, ns.a.c).a(ns.d, true))
         .a(nm.a().a(dts.Z, duo.c), nr.a().a(ns.c, $$3).a(ns.b, ns.a.d).a(ns.d, true));
   }

   static nl a(dfc $$0, akt $$1, akt $$2, akt $$3, akt $$4, boolean $$5) {
      return no.a($$0, nr.a().a(ns.d, $$5))
         .a(c())
         .a(
            np.a(dts.q, dts.u)
               .a(false, false, nr.a().a(ns.c, $$2))
               .a(true, false, nr.a().a(ns.c, $$4))
               .a(false, true, nr.a().a(ns.c, $$1))
               .a(true, true, nr.a().a(ns.c, $$3))
         );
   }

   static nl b(dfc $$0, akt $$1, akt $$2, akt $$3) {
      return no.a($$0)
         .a(
            np.a(dts.R, dts.af, dts.bi)
               .a(iw.f, dub.b, dul.a, nr.a().a(ns.c, $$2))
               .a(iw.e, dub.b, dul.a, nr.a().a(ns.c, $$2).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.d, dub.b, dul.a, nr.a().a(ns.c, $$2).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.c, dub.b, dul.a, nr.a().a(ns.c, $$2).a(ns.b, ns.a.d).a(ns.d, true))
               .a(iw.f, dub.b, dul.e, nr.a().a(ns.c, $$3))
               .a(iw.e, dub.b, dul.e, nr.a().a(ns.c, $$3).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.d, dub.b, dul.e, nr.a().a(ns.c, $$3).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.c, dub.b, dul.e, nr.a().a(ns.c, $$3).a(ns.b, ns.a.d).a(ns.d, true))
               .a(iw.f, dub.b, dul.d, nr.a().a(ns.c, $$3).a(ns.b, ns.a.d).a(ns.d, true))
               .a(iw.e, dub.b, dul.d, nr.a().a(ns.c, $$3).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.d, dub.b, dul.d, nr.a().a(ns.c, $$3))
               .a(iw.c, dub.b, dul.d, nr.a().a(ns.c, $$3).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.f, dub.b, dul.c, nr.a().a(ns.c, $$1))
               .a(iw.e, dub.b, dul.c, nr.a().a(ns.c, $$1).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.d, dub.b, dul.c, nr.a().a(ns.c, $$1).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.c, dub.b, dul.c, nr.a().a(ns.c, $$1).a(ns.b, ns.a.d).a(ns.d, true))
               .a(iw.f, dub.b, dul.b, nr.a().a(ns.c, $$1).a(ns.b, ns.a.d).a(ns.d, true))
               .a(iw.e, dub.b, dul.b, nr.a().a(ns.c, $$1).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.d, dub.b, dul.b, nr.a().a(ns.c, $$1))
               .a(iw.c, dub.b, dul.b, nr.a().a(ns.c, $$1).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.f, dub.a, dul.a, nr.a().a(ns.c, $$2).a(ns.a, ns.a.c).a(ns.d, true))
               .a(iw.e, dub.a, dul.a, nr.a().a(ns.c, $$2).a(ns.a, ns.a.c).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.d, dub.a, dul.a, nr.a().a(ns.c, $$2).a(ns.a, ns.a.c).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.c, dub.a, dul.a, nr.a().a(ns.c, $$2).a(ns.a, ns.a.c).a(ns.b, ns.a.d).a(ns.d, true))
               .a(iw.f, dub.a, dul.e, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.e, dub.a, dul.e, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.d).a(ns.d, true))
               .a(iw.d, dub.a, dul.e, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.c, dub.a, dul.e, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.d, true))
               .a(iw.f, dub.a, dul.d, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.d, true))
               .a(iw.e, dub.a, dul.d, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.d, dub.a, dul.d, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.c, dub.a, dul.d, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.d).a(ns.d, true))
               .a(iw.f, dub.a, dul.c, nr.a().a(ns.c, $$1).a(ns.a, ns.a.c).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.e, dub.a, dul.c, nr.a().a(ns.c, $$1).a(ns.a, ns.a.c).a(ns.b, ns.a.d).a(ns.d, true))
               .a(iw.d, dub.a, dul.c, nr.a().a(ns.c, $$1).a(ns.a, ns.a.c).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.c, dub.a, dul.c, nr.a().a(ns.c, $$1).a(ns.a, ns.a.c).a(ns.d, true))
               .a(iw.f, dub.a, dul.b, nr.a().a(ns.c, $$1).a(ns.a, ns.a.c).a(ns.d, true))
               .a(iw.e, dub.a, dul.b, nr.a().a(ns.c, $$1).a(ns.a, ns.a.c).a(ns.b, ns.a.c).a(ns.d, true))
               .a(iw.d, dub.a, dul.b, nr.a().a(ns.c, $$1).a(ns.a, ns.a.c).a(ns.b, ns.a.b).a(ns.d, true))
               .a(iw.c, dub.a, dul.b, nr.a().a(ns.c, $$1).a(ns.a, ns.a.c).a(ns.b, ns.a.d).a(ns.d, true))
         );
   }

   private static nl c(dfc $$0, akt $$1, akt $$2, akt $$3) {
      return no.a($$0)
         .a(
            np.a(dts.R, dts.af, dts.u)
               .a(iw.c, dub.b, false, nr.a().a(ns.c, $$2))
               .a(iw.d, dub.b, false, nr.a().a(ns.c, $$2).a(ns.b, ns.a.c))
               .a(iw.f, dub.b, false, nr.a().a(ns.c, $$2).a(ns.b, ns.a.b))
               .a(iw.e, dub.b, false, nr.a().a(ns.c, $$2).a(ns.b, ns.a.d))
               .a(iw.c, dub.a, false, nr.a().a(ns.c, $$1))
               .a(iw.d, dub.a, false, nr.a().a(ns.c, $$1).a(ns.b, ns.a.c))
               .a(iw.f, dub.a, false, nr.a().a(ns.c, $$1).a(ns.b, ns.a.b))
               .a(iw.e, dub.a, false, nr.a().a(ns.c, $$1).a(ns.b, ns.a.d))
               .a(iw.c, dub.b, true, nr.a().a(ns.c, $$3))
               .a(iw.d, dub.b, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.c))
               .a(iw.f, dub.b, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.b))
               .a(iw.e, dub.b, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.d))
               .a(iw.c, dub.a, true, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.c))
               .a(iw.d, dub.a, true, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.a))
               .a(iw.f, dub.a, true, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.d))
               .a(iw.e, dub.a, true, nr.a().a(ns.c, $$3).a(ns.a, ns.a.c).a(ns.b, ns.a.b))
         );
   }

   private static nl d(dfc $$0, akt $$1, akt $$2, akt $$3) {
      return no.a($$0)
         .a(
            np.a(dts.R, dts.af, dts.u)
               .a(iw.c, dub.b, false, nr.a().a(ns.c, $$2))
               .a(iw.d, dub.b, false, nr.a().a(ns.c, $$2))
               .a(iw.f, dub.b, false, nr.a().a(ns.c, $$2))
               .a(iw.e, dub.b, false, nr.a().a(ns.c, $$2))
               .a(iw.c, dub.a, false, nr.a().a(ns.c, $$1))
               .a(iw.d, dub.a, false, nr.a().a(ns.c, $$1))
               .a(iw.f, dub.a, false, nr.a().a(ns.c, $$1))
               .a(iw.e, dub.a, false, nr.a().a(ns.c, $$1))
               .a(iw.c, dub.b, true, nr.a().a(ns.c, $$3))
               .a(iw.d, dub.b, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.c))
               .a(iw.f, dub.b, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.b))
               .a(iw.e, dub.b, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.d))
               .a(iw.c, dub.a, true, nr.a().a(ns.c, $$3))
               .a(iw.d, dub.a, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.c))
               .a(iw.f, dub.a, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.b))
               .a(iw.e, dub.a, true, nr.a().a(ns.c, $$3).a(ns.b, ns.a.d))
         );
   }

   static no c(dfc $$0, akt $$1) {
      return no.a($$0, nr.a().a(ns.c, $$1));
   }

   private static np f() {
      return np.a(dts.I).a(iw.a.b, nr.a()).a(iw.a.c, nr.a().a(ns.a, ns.a.b)).a(iw.a.a, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.b));
   }

   static nl a(dfc $$0, nz $$1, BiConsumer<akt, Supplier<JsonElement>> $$2) {
      akt $$3 = ny.g.a($$0, $$1, $$2);
      akt $$4 = ny.h.a($$0, $$1, $$2);
      akt $$5 = ny.i.a($$0, $$1, $$2);
      akt $$6 = ny.j.a($$0, $$1, $$2);
      return no.a($$0, nr.a().a(ns.c, $$6)).a(np.a(dts.I).a(iw.a.a, nr.a().a(ns.c, $$3)).a(iw.a.b, nr.a().a(ns.c, $$4)).a(iw.a.c, nr.a().a(ns.c, $$5)));
   }

   static nl d(dfc $$0, akt $$1) {
      return no.a($$0, nr.a().a(ns.c, $$1)).a(f());
   }

   private void e(dfc $$0, akt $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dfc $$0, ob.a $$1) {
      akt $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dfc $$0, ob.a $$1) {
      akt $$2 = $$1.create($$0, this.c);
      this.b.accept(no.a($$0, nr.a().a(ns.c, $$2)).a(b()));
   }

   static nl d(dfc $$0, akt $$1, akt $$2) {
      return no.a($$0)
         .a(
            np.a(dts.I)
               .a(iw.a.b, nr.a().a(ns.c, $$1))
               .a(iw.a.c, nr.a().a(ns.c, $$2).a(ns.a, ns.a.b))
               .a(iw.a.a, nr.a().a(ns.c, $$2).a(ns.a, ns.a.b).a(ns.b, ns.a.b))
         );
   }

   private void a(dfc $$0, ob.a $$1, ob.a $$2) {
      akt $$3 = $$1.create($$0, this.c);
      akt $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akt a(dfc $$0, String $$1, nx $$2, Function<akt, nz> $$3) {
      return $$2.a($$0, $$1, $$3.apply(nz.a($$0, $$1)), this.c);
   }

   static nl e(dfc $$0, akt $$1, akt $$2) {
      return no.a($$0).a(a(dts.w, $$2, $$1));
   }

   static nl e(dfc $$0, akt $$1, akt $$2, akt $$3) {
      return no.a($$0).a(np.a(dts.bh).a(duk.b, nr.a().a(ns.c, $$1)).a(duk.a, nr.a().a(ns.c, $$2)).a(duk.c, nr.a().a(ns.c, $$3)));
   }

   public void a(dfc $$0) {
      this.b($$0, ob.a);
   }

   public void b(dfc $$0, ob.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dfc $$0, nz $$1, nx $$2) {
      akt $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ni.b h(dfc $$0) {
      ob $$1 = this.g.getOrDefault($$0, ob.a.get($$0));
      return new ni.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dfc $$0, dfc $$1, dfc $$2) {
      nz $$3 = nz.u($$0);
      akt $$4 = ny.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.q());
      this.c($$2);
   }

   void i(dfc $$0) {
      nz $$1 = nz.t($$0);
      akt $$2 = ny.v.a($$0, $$1, this.c);
      akt $$3 = ny.w.a($$0, $$1, this.c);
      akt $$4 = ny.x.a($$0, $$1, this.c);
      akt $$5 = ny.y.a($$0, $$1, this.c);
      akt $$6 = ny.z.a($$0, $$1, this.c);
      akt $$7 = ny.A.a($$0, $$1, this.c);
      akt $$8 = ny.B.a($$0, $$1, this.c);
      akt $$9 = ny.C.a($$0, $$1, this.c);
      this.a($$0.q());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dfc $$0, dfc $$1) {
      akt $$2 = ny.v.a($$0);
      akt $$3 = ny.w.a($$0);
      akt $$4 = ny.x.a($$0);
      akt $$5 = ny.y.a($$0);
      akt $$6 = ny.z.a($$0);
      akt $$7 = ny.A.a($$0);
      akt $$8 = ny.B.a($$0);
      akt $$9 = ny.C.a($$0);
      this.a($$1, nw.a($$0.q()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dfc $$0) {
      nz $$1 = nz.b($$0);
      akt $$2 = ny.ak.a($$0, $$1, this.c);
      akt $$3 = ny.al.a($$0, $$1, this.c);
      akt $$4 = ny.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dfc $$0) {
      nz $$1 = nz.b($$0);
      akt $$2 = ny.ah.a($$0, $$1, this.c);
      akt $$3 = ny.ai.a($$0, $$1, this.c);
      akt $$4 = ny.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dfc $$0, dfc $$1) {
      akt $$2 = ny.ah.a($$0);
      akt $$3 = ny.ai.a($$0);
      akt $$4 = ny.aj.a($$0);
      this.a($$1, nw.a($$0.q()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dfe.ua);
      akt $$0 = nw.a(dfe.ua);
      akt $$1 = nw.a(dfe.ua, "_partial_tilt");
      akt $$2 = nw.a(dfe.ua, "_full_tilt");
      this.b
         .accept(
            no.a(dfe.ua)
               .a(b())
               .a(np.a(dts.bl).a(dun.a, nr.a().a(ns.c, $$0)).a(dun.b, nr.a().a(ns.c, $$0)).a(dun.c, nr.a().a(ns.c, $$1)).a(dun.d, nr.a().a(ns.c, $$2)))
         );
   }

   private ni.f l(dfc $$0) {
      return new ni.f(nz.n($$0));
   }

   private void m(dfc $$0) {
      this.c($$0, $$0);
   }

   private void c(dfc $$0, dfc $$1) {
      this.b.accept(c($$0, nw.a($$1)));
   }

   private void a(dfc $$0, ni.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dfc $$0, ni.e $$1, nz $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfc $$0, ni.e $$1) {
      nz $$2 = nz.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfc $$0, ni.e $$1, nz $$2) {
      akt $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dfc $$0, ni.e $$1, duf<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         np $$4 = np.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            nz $$5 = nz.c(nz.a($$0, $$4x));
            akt $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return nr.a().a(ns.c, $$6);
         });
         this.a($$0.q());
         this.b.accept(no.a($$0).a($$4));
      }
   }

   private void a(dfc $$0, dfc $$1, ni.e $$2) {
      this.a($$0, $$2);
      nz $$3 = nz.d($$0);
      akt $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dfc $$0, dfc $$1) {
      ob $$2 = ob.p.get($$0);
      akt $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akt $$4 = ny.aC.a($$1, $$2.b(), this.c);
      this.b.accept(no.a($$1, nr.a().a(ns.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dfc $$0, dfc $$1) {
      this.a($$0.q());
      nz $$2 = nz.h($$0);
      nz $$3 = nz.a($$0, $$1);
      akt $$4 = ny.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            no.a($$1, nr.a().a(ns.c, $$4))
               .a(np.a(dts.R).a(iw.e, nr.a()).a(iw.d, nr.a().a(ns.b, ns.a.d)).a(iw.c, nr.a().a(ns.b, ns.a.b)).a(iw.f, nr.a().a(ns.b, ns.a.c)))
         );
      this.b.accept(no.a($$0).a(np.a(dts.av).a($$2x -> nr.a().a(ns.c, ny.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dfc $$0 = dfe.lz;
      this.a($$0.q());
      akt $$1 = nw.a($$0, "_top");
      akt $$2 = nw.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dfc $$0 = dfe.ly;
      this.a($$0.q());
      np $$1 = np.a(dkx.d, dts.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> nr.a().a(ns.c, nw.a($$0, "_top_stage_" + $$1x));
            case b -> nr.a().a(ns.c, nw.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(no.a($$0).a($$1));
   }

   private void a(dfc $$0, dfc $$1, dfc $$2, dfc $$3, dfc $$4, dfc $$5, dfc $$6, dfc $$7) {
      this.a($$0, ni.e.b);
      this.a($$1, ni.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dfc $$0, ni.e $$1) {
      this.a($$0, "_top");
      akt $$2 = this.a($$0, "_top", $$1.a(), nz::c);
      akt $$3 = this.a($$0, "_bottom", $$1.a(), nz::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dfe.jx, "_front");
      akt $$0 = nw.a(dfe.jx, "_top");
      akt $$1 = this.a(dfe.jx, "_bottom", ni.e.b.a(), nz::c);
      this.f(dfe.jx, $$0, $$1);
   }

   private void k() {
      akt $$0 = this.a(dfe.ch, "_top", ny.bo, nz::a);
      akt $$1 = this.a(dfe.ch, "_bottom", ny.bo, nz::a);
      this.f(dfe.ch, $$0, $$1);
   }

   private void l() {
      this.c(dfe.uc);
      akt $$0 = nw.a(dfe.uc, "_top");
      akt $$1 = nw.a(dfe.uc, "_bottom");
      this.b.accept(no.a(dfe.uc).a(b()).a(np.a(dts.ae).a(dty.b, nr.a().a(ns.c, $$1)).a(dty.a, nr.a().a(ns.c, $$0))));
   }

   private void f(dfc $$0, akt $$1, akt $$2) {
      this.b.accept(no.a($$0).a(np.a(dts.ae).a(dty.b, nr.a().a(ns.c, $$2)).a(dty.a, nr.a().a(ns.c, $$1))));
   }

   private void n(dfc $$0) {
      nz $$1 = nz.e($$0);
      nz $$2 = nz.e(nz.a($$0, "_corner"));
      akt $$3 = ny.as.a($$0, $$1, this.c);
      akt $$4 = ny.at.a($$0, $$2, this.c);
      akt $$5 = ny.au.a($$0, $$1, this.c);
      akt $$6 = ny.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            no.a($$0)
               .a(
                  np.a(dts.ag)
                     .a(dug.a, nr.a().a(ns.c, $$3))
                     .a(dug.b, nr.a().a(ns.c, $$3).a(ns.b, ns.a.b))
                     .a(dug.c, nr.a().a(ns.c, $$5).a(ns.b, ns.a.b))
                     .a(dug.d, nr.a().a(ns.c, $$6).a(ns.b, ns.a.b))
                     .a(dug.e, nr.a().a(ns.c, $$5))
                     .a(dug.f, nr.a().a(ns.c, $$6))
                     .a(dug.g, nr.a().a(ns.c, $$4))
                     .a(dug.h, nr.a().a(ns.c, $$4).a(ns.b, ns.a.b))
                     .a(dug.i, nr.a().a(ns.c, $$4).a(ns.b, ns.a.c))
                     .a(dug.j, nr.a().a(ns.c, $$4).a(ns.b, ns.a.d))
               )
         );
   }

   private void o(dfc $$0) {
      akt $$1 = this.a($$0, "", ny.as, nz::e);
      akt $$2 = this.a($$0, "", ny.au, nz::e);
      akt $$3 = this.a($$0, "", ny.av, nz::e);
      akt $$4 = this.a($$0, "_on", ny.as, nz::e);
      akt $$5 = this.a($$0, "_on", ny.au, nz::e);
      akt $$6 = this.a($$0, "_on", ny.av, nz::e);
      np $$7 = np.a(dts.w, dts.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return nr.a().a(ns.c, $$6x ? $$4 : $$1);
            case b:
               return nr.a().a(ns.c, $$6x ? $$4 : $$1).a(ns.b, ns.a.b);
            case c:
               return nr.a().a(ns.c, $$6x ? $$5 : $$2).a(ns.b, ns.a.b);
            case d:
               return nr.a().a(ns.c, $$6x ? $$6 : $$3).a(ns.b, ns.a.b);
            case e:
               return nr.a().a(ns.c, $$6x ? $$5 : $$2);
            case f:
               return nr.a().a(ns.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(no.a($$0).a($$7));
   }

   private ni.a a(akt $$0, dfc $$1) {
      return new ni.a($$0, $$1);
   }

   private ni.a f(dfc $$0, dfc $$1) {
      return new ni.a(nw.a($$0), $$1);
   }

   private void a(dfc $$0, cuc $$1) {
      akt $$2 = ny.aa.a($$0, nz.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dfc $$0, akt $$1) {
      akt $$2 = ny.aa.a($$0, nz.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dfc $$0, dfc $$1) {
      this.a($$0);
      akt $$2 = ob.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dfc $$0) {
      this.a($$0.q());
      akt $$1 = ob.k.create($$0, this.c);
      akt $$2 = ob.l.create($$0, this.c);
      akt $$3 = ob.m.create($$0, this.c);
      akt $$4 = ob.n.create($$0, this.c);
      this.b
         .accept(
            nn.a($$0)
               .a(nm.a().a(dts.S, 1, 2, 3, 4).a(dts.R, iw.c), nr.a().a(ns.c, $$1))
               .a(nm.a().a(dts.S, 1, 2, 3, 4).a(dts.R, iw.f), nr.a().a(ns.c, $$1).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.S, 1, 2, 3, 4).a(dts.R, iw.d), nr.a().a(ns.c, $$1).a(ns.b, ns.a.c))
               .a(nm.a().a(dts.S, 1, 2, 3, 4).a(dts.R, iw.e), nr.a().a(ns.c, $$1).a(ns.b, ns.a.d))
               .a(nm.a().a(dts.S, 2, 3, 4).a(dts.R, iw.c), nr.a().a(ns.c, $$2))
               .a(nm.a().a(dts.S, 2, 3, 4).a(dts.R, iw.f), nr.a().a(ns.c, $$2).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.S, 2, 3, 4).a(dts.R, iw.d), nr.a().a(ns.c, $$2).a(ns.b, ns.a.c))
               .a(nm.a().a(dts.S, 2, 3, 4).a(dts.R, iw.e), nr.a().a(ns.c, $$2).a(ns.b, ns.a.d))
               .a(nm.a().a(dts.S, 3, 4).a(dts.R, iw.c), nr.a().a(ns.c, $$3))
               .a(nm.a().a(dts.S, 3, 4).a(dts.R, iw.f), nr.a().a(ns.c, $$3).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.S, 3, 4).a(dts.R, iw.d), nr.a().a(ns.c, $$3).a(ns.b, ns.a.c))
               .a(nm.a().a(dts.S, 3, 4).a(dts.R, iw.e), nr.a().a(ns.c, $$3).a(ns.b, ns.a.d))
               .a(nm.a().a(dts.S, 4).a(dts.R, iw.c), nr.a().a(ns.c, $$4))
               .a(nm.a().a(dts.S, 4).a(dts.R, iw.f), nr.a().a(ns.c, $$4).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.S, 4).a(dts.R, iw.d), nr.a().a(ns.c, $$4).a(ns.b, ns.a.c))
               .a(nm.a().a(dts.S, 4).a(dts.R, iw.e), nr.a().a(ns.c, $$4).a(ns.b, ns.a.d))
         );
   }

   private void a(ob.a $$0, dfc... $$1) {
      for (dfc $$2 : $$1) {
         akt $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ob.a $$0, dfc... $$1) {
      for (dfc $$2 : $$1) {
         akt $$3 = $$0.create($$2, this.c);
         this.b.accept(no.a($$2, nr.a().a(ns.c, $$3)).a(c()));
      }
   }

   private void h(dfc $$0, dfc $$1) {
      this.a($$0);
      nz $$2 = nz.b($$0, $$1);
      akt $$3 = ny.aI.a($$1, $$2, this.c);
      akt $$4 = ny.aJ.a($$1, $$2, this.c);
      akt $$5 = ny.aK.a($$1, $$2, this.c);
      akt $$6 = ny.aG.a($$1, $$2, this.c);
      akt $$7 = ny.aH.a($$1, $$2, this.c);
      cuc $$8 = $$1.q();
      ny.bB.a(nw.a($$8), nz.G($$0), this.c);
      this.b
         .accept(
            nn.a($$1)
               .a(nr.a().a(ns.c, $$3))
               .a(nm.a().a(dts.L, true), nr.a().a(ns.c, $$4))
               .a(nm.a().a(dts.M, true), nr.a().a(ns.c, $$4).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.N, true), nr.a().a(ns.c, $$5))
               .a(nm.a().a(dts.O, true), nr.a().a(ns.c, $$5).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.L, false), nr.a().a(ns.c, $$6))
               .a(nm.a().a(dts.M, false), nr.a().a(ns.c, $$7))
               .a(nm.a().a(dts.N, false), nr.a().a(ns.c, $$7).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.O, false), nr.a().a(ns.c, $$6).a(ns.b, ns.a.d))
         );
   }

   private void q(dfc $$0) {
      nz $$1 = nz.z($$0);
      akt $$2 = ny.aL.a($$0, $$1, this.c);
      akt $$3 = this.a($$0, "_conditional", ny.aL, $$1x -> $$1.c(oa.i, $$1x));
      this.b.accept(no.a($$0).a(a(dts.c, $$3, $$2)).a(e()));
   }

   private void r(dfc $$0) {
      akt $$1 = ob.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private void s(dfc $$0) {
      akt $$1 = nw.a($$0);
      this.b.accept(c($$0, $$1).a(b()));
   }

   private List<nr> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> nr.a().a(ns.c, nw.a(dfe.nX, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dfe.nX);
      this.b
         .accept(
            nn.a(dfe.nX)
               .a(nm.a().a(dts.aq, 0), this.a(0))
               .a(nm.a().a(dts.aq, 1), this.a(1))
               .a(nm.a().a(dts.bk, dto.b), nr.a().a(ns.c, nw.a(dfe.nX, "_small_leaves")))
               .a(nm.a().a(dts.bk, dto.c), nr.a().a(ns.c, nw.a(dfe.nX, "_large_leaves")))
         );
   }

   private np n() {
      return np.a(dts.P)
         .a(iw.a, nr.a().a(ns.a, ns.a.c))
         .a(iw.b, nr.a())
         .a(iw.c, nr.a().a(ns.a, ns.a.b))
         .a(iw.d, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.c))
         .a(iw.e, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.d))
         .a(iw.f, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.b));
   }

   private void o() {
      akt $$0 = nz.a(dfe.oS, "_top_open");
      this.b
         .accept(
            no.a(dfe.oS)
               .a(this.n())
               .a(
                  np.a(dts.u)
                     .a(false, nr.a().a(ns.c, ob.f.create(dfe.oS, this.c)))
                     .a(true, nr.a().a(ns.c, ob.f.get(dfe.oS).a($$1 -> $$1.a(oa.f, $$0)).a(dfe.oS, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> np a(duf<T> $$0, T $$1, akt $$2, akt $$3) {
      nr $$4 = nr.a().a(ns.c, $$2);
      nr $$5 = nr.a().a(ns.c, $$3);
      return np.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dfc $$0, Function<dfc, nz> $$1) {
      nz $$2 = $$1.apply($$0).b(oa.i, oa.c);
      nz $$3 = $$2.c(oa.g, nz.a($$0, "_front_honey"));
      akt $$4 = ny.q.a($$0, $$2, this.c);
      akt $$5 = ny.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(no.a($$0).a(b()).a(a(dts.aN, 5, $$5, $$4)));
   }

   private void a(dfc $$0, duf<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akt> $$3 = new Int2ObjectOpenHashMap();
         np $$4 = np.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akt $$5 = (akt)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, ny.aV, nz::g));
            return nr.a().a(ns.c, $$5);
         });
         this.a($$0.q());
         this.b.accept(no.a($$0).a($$4));
      }
   }

   private void p() {
      akt $$0 = nw.a(dfe.pc, "_floor");
      akt $$1 = nw.a(dfe.pc, "_ceiling");
      akt $$2 = nw.a(dfe.pc, "_wall");
      akt $$3 = nw.a(dfe.pc, "_between_walls");
      this.a(cuk.ya);
      this.b
         .accept(
            no.a(dfe.pc)
               .a(
                  np.a(dts.R, dts.V)
                     .a(iw.c, dtq.a, nr.a().a(ns.c, $$0))
                     .a(iw.d, dtq.a, nr.a().a(ns.c, $$0).a(ns.b, ns.a.c))
                     .a(iw.f, dtq.a, nr.a().a(ns.c, $$0).a(ns.b, ns.a.b))
                     .a(iw.e, dtq.a, nr.a().a(ns.c, $$0).a(ns.b, ns.a.d))
                     .a(iw.c, dtq.b, nr.a().a(ns.c, $$1))
                     .a(iw.d, dtq.b, nr.a().a(ns.c, $$1).a(ns.b, ns.a.c))
                     .a(iw.f, dtq.b, nr.a().a(ns.c, $$1).a(ns.b, ns.a.b))
                     .a(iw.e, dtq.b, nr.a().a(ns.c, $$1).a(ns.b, ns.a.d))
                     .a(iw.c, dtq.c, nr.a().a(ns.c, $$2).a(ns.b, ns.a.d))
                     .a(iw.d, dtq.c, nr.a().a(ns.c, $$2).a(ns.b, ns.a.b))
                     .a(iw.f, dtq.c, nr.a().a(ns.c, $$2))
                     .a(iw.e, dtq.c, nr.a().a(ns.c, $$2).a(ns.b, ns.a.c))
                     .a(iw.d, dtq.d, nr.a().a(ns.c, $$3).a(ns.b, ns.a.b))
                     .a(iw.c, dtq.d, nr.a().a(ns.c, $$3).a(ns.b, ns.a.d))
                     .a(iw.f, dtq.d, nr.a().a(ns.c, $$3))
                     .a(iw.e, dtq.d, nr.a().a(ns.c, $$3).a(ns.b, ns.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            no.a(dfe.oX, nr.a().a(ns.c, nw.a(dfe.oX)))
               .a(
                  np.a(dts.U, dts.R)
                     .a(dtn.a, iw.c, nr.a())
                     .a(dtn.a, iw.f, nr.a().a(ns.b, ns.a.b))
                     .a(dtn.a, iw.d, nr.a().a(ns.b, ns.a.c))
                     .a(dtn.a, iw.e, nr.a().a(ns.b, ns.a.d))
                     .a(dtn.b, iw.c, nr.a().a(ns.a, ns.a.b))
                     .a(dtn.b, iw.f, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.b))
                     .a(dtn.b, iw.d, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.c))
                     .a(dtn.b, iw.e, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.d))
                     .a(dtn.c, iw.d, nr.a().a(ns.a, ns.a.c))
                     .a(dtn.c, iw.e, nr.a().a(ns.a, ns.a.c).a(ns.b, ns.a.b))
                     .a(dtn.c, iw.c, nr.a().a(ns.a, ns.a.c).a(ns.b, ns.a.c))
                     .a(dtn.c, iw.f, nr.a().a(ns.a, ns.a.c).a(ns.b, ns.a.d))
               )
         );
   }

   private void d(dfc $$0, ob.a $$1) {
      akt $$2 = $$1.create($$0, this.c);
      akt $$3 = nz.a($$0, "_front_on");
      akt $$4 = $$1.get($$0).a($$1x -> $$1x.a(oa.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(no.a($$0).a(a(dts.r, $$4, $$2)).a(b()));
   }

   private void a(dfc $$0, dfc... $$1) {
      akt $$2 = nw.a("campfire_off");

      for (dfc $$3 : $$1) {
         akt $$4 = ny.bc.a($$3, nz.E($$3), this.c);
         this.a($$3.q());
         this.b.accept(no.a($$3).a(a(dts.r, $$4, $$2)).a(c()));
      }

      akt $$5 = ny.bd.a($$0, "_lit", nz.F($$0), this.c);
      akt $$6 = nw.a($$0);
      this.a($$0, $$6);
      this.b.accept(no.a($$0).a(a(dts.r, $$5, $$6)).a(c()));
   }

   private void t(dfc $$0) {
      akt $$1 = ny.bx.a($$0, nz.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void u(dfc $$0) {
      akt $$1;
      if ($$0 == dfe.uH) {
         $$1 = ny.bz.a($$0, nz.m($$0), this.c);
      } else {
         $$1 = ny.by.a($$0, nz.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      nz $$0 = nz.a(nz.H(dfe.cW), nz.H(dfe.S));
      akt $$1 = ny.j.a(dfe.cW, $$0, this.c);
      this.b.accept(c(dfe.cW, $$1));
   }

   private void s() {
      this.a(cuk.mW);
      this.b
         .accept(
            nn.a(dfe.dh)
               .a(
                  nm.b(
                     nm.a().a(dts.ab, duh.c).a(dts.aa, duh.c).a(dts.ac, duh.c).a(dts.ad, duh.c),
                     nm.a().a(dts.ab, duh.b, duh.a).a(dts.aa, duh.b, duh.a),
                     nm.a().a(dts.aa, duh.b, duh.a).a(dts.ac, duh.b, duh.a),
                     nm.a().a(dts.ac, duh.b, duh.a).a(dts.ad, duh.b, duh.a),
                     nm.a().a(dts.ad, duh.b, duh.a).a(dts.ab, duh.b, duh.a)
                  ),
                  nr.a().a(ns.c, nw.a("redstone_dust_dot"))
               )
               .a(nm.a().a(dts.ab, duh.b, duh.a), nr.a().a(ns.c, nw.a("redstone_dust_side0")))
               .a(nm.a().a(dts.ac, duh.b, duh.a), nr.a().a(ns.c, nw.a("redstone_dust_side_alt0")))
               .a(nm.a().a(dts.aa, duh.b, duh.a), nr.a().a(ns.c, nw.a("redstone_dust_side_alt1")).a(ns.b, ns.a.d))
               .a(nm.a().a(dts.ad, duh.b, duh.a), nr.a().a(ns.c, nw.a("redstone_dust_side1")).a(ns.b, ns.a.d))
               .a(nm.a().a(dts.ab, duh.a), nr.a().a(ns.c, nw.a("redstone_dust_up")))
               .a(nm.a().a(dts.aa, duh.a), nr.a().a(ns.c, nw.a("redstone_dust_up")).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.ac, duh.a), nr.a().a(ns.c, nw.a("redstone_dust_up")).a(ns.b, ns.a.c))
               .a(nm.a().a(dts.ad, duh.a), nr.a().a(ns.c, nw.a("redstone_dust_up")).a(ns.b, ns.a.d))
         );
   }

   private void t() {
      this.a(cuk.na);
      this.b
         .accept(
            no.a(dfe.hS)
               .a(c())
               .a(
                  np.a(dts.bd, dts.w)
                     .a(dtv.a, false, nr.a().a(ns.c, nw.a(dfe.hS)))
                     .a(dtv.a, true, nr.a().a(ns.c, nw.a(dfe.hS, "_on")))
                     .a(dtv.b, false, nr.a().a(ns.c, nw.a(dfe.hS, "_subtract")))
                     .a(dtv.b, true, nr.a().a(ns.c, nw.a(dfe.hS, "_on_subtract")))
               )
         );
   }

   private void u() {
      nz $$0 = nz.a(dfe.kL);
      nz $$1 = nz.a(nz.a(dfe.ky, "_side"), $$0.a(oa.f));
      akt $$2 = ny.ab.a(dfe.ky, $$1, this.c);
      akt $$3 = ny.ac.a(dfe.ky, $$1, this.c);
      akt $$4 = ny.j.b(dfe.ky, "_double", $$1, this.c);
      this.b.accept(e(dfe.ky, $$2, $$3, $$4));
      this.b.accept(c(dfe.kL, ny.c.a(dfe.kL, $$0, this.c)));
   }

   private void v() {
      this.a(cuk.tN);
      this.b
         .accept(
            nn.a(dfe.gk)
               .a(nr.a().a(ns.c, nz.H(dfe.gk)))
               .a(nm.a().a(dts.k, true), nr.a().a(ns.c, nz.a(dfe.gk, "_bottle0")))
               .a(nm.a().a(dts.l, true), nr.a().a(ns.c, nz.a(dfe.gk, "_bottle1")))
               .a(nm.a().a(dts.m, true), nr.a().a(ns.c, nz.a(dfe.gk, "_bottle2")))
               .a(nm.a().a(dts.k, false), nr.a().a(ns.c, nz.a(dfe.gk, "_empty0")))
               .a(nm.a().a(dts.l, false), nr.a().a(ns.c, nz.a(dfe.gk, "_empty1")))
               .a(nm.a().a(dts.m, false), nr.a().a(ns.c, nz.a(dfe.gk, "_empty2")))
         );
   }

   private void v(dfc $$0) {
      akt $$1 = ny.bt.a($$0, nz.b($$0), this.c);
      akt $$2 = nw.a("mushroom_block_inside");
      this.b
         .accept(
            nn.a($$0)
               .a(nm.a().a(dts.L, true), nr.a().a(ns.c, $$1))
               .a(nm.a().a(dts.M, true), nr.a().a(ns.c, $$1).a(ns.b, ns.a.b).a(ns.d, true))
               .a(nm.a().a(dts.N, true), nr.a().a(ns.c, $$1).a(ns.b, ns.a.c).a(ns.d, true))
               .a(nm.a().a(dts.O, true), nr.a().a(ns.c, $$1).a(ns.b, ns.a.d).a(ns.d, true))
               .a(nm.a().a(dts.J, true), nr.a().a(ns.c, $$1).a(ns.a, ns.a.d).a(ns.d, true))
               .a(nm.a().a(dts.K, true), nr.a().a(ns.c, $$1).a(ns.a, ns.a.b).a(ns.d, true))
               .a(nm.a().a(dts.L, false), nr.a().a(ns.c, $$2))
               .a(nm.a().a(dts.M, false), nr.a().a(ns.c, $$2).a(ns.b, ns.a.b).a(ns.d, false))
               .a(nm.a().a(dts.N, false), nr.a().a(ns.c, $$2).a(ns.b, ns.a.c).a(ns.d, false))
               .a(nm.a().a(dts.O, false), nr.a().a(ns.c, $$2).a(ns.b, ns.a.d).a(ns.d, false))
               .a(nm.a().a(dts.J, false), nr.a().a(ns.c, $$2).a(ns.a, ns.a.d).a(ns.d, false))
               .a(nm.a().a(dts.K, false), nr.a().a(ns.c, $$2).a(ns.a, ns.a.b).a(ns.d, false))
         );
      this.a($$0, ob.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cuk.sY);
      this.b
         .accept(
            no.a(dfe.eY)
               .a(
                  np.a(dts.ay)
                     .a(0, nr.a().a(ns.c, nw.a(dfe.eY)))
                     .a(1, nr.a().a(ns.c, nw.a(dfe.eY, "_slice1")))
                     .a(2, nr.a().a(ns.c, nw.a(dfe.eY, "_slice2")))
                     .a(3, nr.a().a(ns.c, nw.a(dfe.eY, "_slice3")))
                     .a(4, nr.a().a(ns.c, nw.a(dfe.eY, "_slice4")))
                     .a(5, nr.a().a(ns.c, nw.a(dfe.eY, "_slice5")))
                     .a(6, nr.a().a(ns.c, nw.a(dfe.eY, "_slice6")))
               )
         );
   }

   private void x() {
      nz $$0 = new nz()
         .a(oa.c, nz.a(dfe.oV, "_side3"))
         .a(oa.o, nz.H(dfe.Y))
         .a(oa.n, nz.a(dfe.oV, "_top"))
         .a(oa.j, nz.a(dfe.oV, "_side3"))
         .a(oa.l, nz.a(dfe.oV, "_side3"))
         .a(oa.k, nz.a(dfe.oV, "_side1"))
         .a(oa.m, nz.a(dfe.oV, "_side2"));
      this.b.accept(c(dfe.oV, ny.a.a(dfe.oV, $$0, this.c)));
   }

   private void y() {
      nz $$0 = new nz()
         .a(oa.c, nz.a(dfe.oZ, "_front"))
         .a(oa.o, nz.a(dfe.oZ, "_bottom"))
         .a(oa.n, nz.a(dfe.oZ, "_top"))
         .a(oa.j, nz.a(dfe.oZ, "_front"))
         .a(oa.k, nz.a(dfe.oZ, "_front"))
         .a(oa.l, nz.a(dfe.oZ, "_side"))
         .a(oa.m, nz.a(dfe.oZ, "_side"));
      this.b.accept(c(dfe.oZ, ny.a.a(dfe.oZ, $$0, this.c)));
   }

   private void a(dfc $$0, dfc $$1, BiFunction<dfc, dfc, nz> $$2) {
      nz $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, ny.a.a($$0, $$3, this.c)));
   }

   public void b(dfc $$0) {
      nz $$1 = new nz()
         .a(oa.c, nz.a($$0, "_particle"))
         .a(oa.o, nz.a($$0, "_down"))
         .a(oa.n, nz.a($$0, "_up"))
         .a(oa.j, nz.a($$0, "_north"))
         .a(oa.k, nz.a($$0, "_south"))
         .a(oa.l, nz.a($$0, "_east"))
         .a(oa.m, nz.a($$0, "_west"));
      this.b.accept(c($$0, ny.a.a($$0, $$1, this.c)));
   }

   private void z() {
      nz $$0 = nz.k(dfe.fR);
      this.b.accept(c(dfe.fR, nw.a(dfe.fR)));
      this.b(dfe.eU, $$0);
      this.b(dfe.eX, $$0);
   }

   private void A() {
      nz $$0 = nz.k(dfe.eW);
      this.b.accept(c(dfe.eW, nw.a(dfe.eW)));
      this.a(dfe.eV, $$0);
   }

   private void a(dfc $$0, nz $$1) {
      akt $$2 = ny.p.a($$0, $$1.c(oa.g, nz.H($$0)), this.c);
      this.b.accept(no.a($$0, nr.a().a(ns.c, $$2)).a(b()));
   }

   private void b(dfc $$0, nz $$1) {
      akt $$2 = ny.p.a($$0, $$1.c(oa.g, nz.H($$0)), this.c);
      this.b.accept(no.a($$0, nr.a().a(ns.c, $$2)).a(b()));
   }

   private void B() {
      this.a(cuk.tO);
      this.m(dfe.gl);
      this.b.accept(c(dfe.gn, ny.bw.a(dfe.gn, nz.j(nz.a(dfe.am, "_still")), this.c)));
      this.b
         .accept(
            no.a(dfe.gm)
               .a(
                  np.a(djp.g)
                     .a(1, nr.a().a(ns.c, ny.bu.a(dfe.gm, "_level1", nz.j(nz.a(dfe.al, "_still")), this.c)))
                     .a(2, nr.a().a(ns.c, ny.bv.a(dfe.gm, "_level2", nz.j(nz.a(dfe.al, "_still")), this.c)))
                     .a(3, nr.a().a(ns.c, ny.bw.a(dfe.gm, "_full", nz.j(nz.a(dfe.al, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            no.a(dfe.go)
               .a(
                  np.a(djp.g)
                     .a(1, nr.a().a(ns.c, ny.bu.a(dfe.go, "_level1", nz.j(nz.H(dfe.sa)), this.c)))
                     .a(2, nr.a().a(ns.c, ny.bv.a(dfe.go, "_level2", nz.j(nz.H(dfe.sa)), this.c)))
                     .a(3, nr.a().a(ns.c, ny.bw.a(dfe.go, "_full", nz.j(nz.H(dfe.sa)), this.c)))
               )
         );
   }

   private void C() {
      nz $$0 = nz.b(dfe.lp);
      akt $$1 = ny.aE.a(dfe.lp, $$0, this.c);
      akt $$2 = this.a(dfe.lp, "_dead", ny.aE, $$1x -> $$0.c(oa.b, $$1x));
      this.b.accept(no.a(dfe.lp).a(a(dts.au, 5, $$2, $$1)));
   }

   private void D() {
      akt $$0 = nw.a(dfe.uO);
      akt $$1 = nw.a(dfe.uO, "_triggered");
      akt $$2 = nw.a(dfe.uO, "_crafting");
      akt $$3 = nw.a(dfe.uO, "_crafting_triggered");
      this.b
         .accept(
            no.a(dfe.uO)
               .a(np.a(dts.T).a($$0x -> this.a($$0x, nr.a())))
               .a(
                  np.a(dts.A, dgw.b)
                     .a(false, false, nr.a().a(ns.c, $$0))
                     .a(true, true, nr.a().a(ns.c, $$3))
                     .a(true, false, nr.a().a(ns.c, $$1))
                     .a(false, true, nr.a().a(ns.c, $$2))
               )
         );
   }

   private void w(dfc $$0) {
      nz $$1 = new nz().a(oa.f, nz.a(dfe.dp, "_top")).a(oa.i, nz.a(dfe.dp, "_side")).a(oa.g, nz.a($$0, "_front"));
      nz $$2 = new nz().a(oa.i, nz.a(dfe.dp, "_top")).a(oa.g, nz.a($$0, "_front_vertical"));
      akt $$3 = ny.p.a($$0, $$1, this.c);
      akt $$4 = ny.r.a($$0, $$2, this.c);
      this.b
         .accept(
            no.a($$0)
               .a(
                  np.a(dts.P)
                     .a(iw.a, nr.a().a(ns.c, $$4).a(ns.a, ns.a.c))
                     .a(iw.b, nr.a().a(ns.c, $$4))
                     .a(iw.c, nr.a().a(ns.c, $$3))
                     .a(iw.f, nr.a().a(ns.c, $$3).a(ns.b, ns.a.b))
                     .a(iw.d, nr.a().a(ns.c, $$3).a(ns.b, ns.a.c))
                     .a(iw.e, nr.a().a(ns.c, $$3).a(ns.b, ns.a.d))
               )
         );
   }

   private void E() {
      akt $$0 = nw.a(dfe.gq);
      akt $$1 = nw.a(dfe.gq, "_filled");
      this.b.accept(no.a(dfe.gq).a(np.a(dts.h).a(false, nr.a().a(ns.c, $$0)).a(true, nr.a().a(ns.c, $$1))).a(c()));
   }

   private void x(dfc $$0) {
      akt $$1 = nw.a($$0, "_side");
      akt $$2 = nw.a($$0, "_noside");
      akt $$3 = nw.a($$0, "_noside1");
      akt $$4 = nw.a($$0, "_noside2");
      akt $$5 = nw.a($$0, "_noside3");
      this.b
         .accept(
            nn.a($$0)
               .a(nm.a().a(dts.L, true), nr.a().a(ns.c, $$1))
               .a(nm.a().a(dts.M, true), nr.a().a(ns.c, $$1).a(ns.b, ns.a.b).a(ns.d, true))
               .a(nm.a().a(dts.N, true), nr.a().a(ns.c, $$1).a(ns.b, ns.a.c).a(ns.d, true))
               .a(nm.a().a(dts.O, true), nr.a().a(ns.c, $$1).a(ns.b, ns.a.d).a(ns.d, true))
               .a(nm.a().a(dts.J, true), nr.a().a(ns.c, $$1).a(ns.a, ns.a.d).a(ns.d, true))
               .a(nm.a().a(dts.K, true), nr.a().a(ns.c, $$1).a(ns.a, ns.a.b).a(ns.d, true))
               .a(nm.a().a(dts.L, false), nr.a().a(ns.c, $$2).a(ns.e, 2), nr.a().a(ns.c, $$3), nr.a().a(ns.c, $$4), nr.a().a(ns.c, $$5))
               .a(
                  nm.a().a(dts.M, false),
                  nr.a().a(ns.c, $$3).a(ns.b, ns.a.b).a(ns.d, true),
                  nr.a().a(ns.c, $$4).a(ns.b, ns.a.b).a(ns.d, true),
                  nr.a().a(ns.c, $$5).a(ns.b, ns.a.b).a(ns.d, true),
                  nr.a().a(ns.c, $$2).a(ns.e, 2).a(ns.b, ns.a.b).a(ns.d, true)
               )
               .a(
                  nm.a().a(dts.N, false),
                  nr.a().a(ns.c, $$4).a(ns.b, ns.a.c).a(ns.d, true),
                  nr.a().a(ns.c, $$5).a(ns.b, ns.a.c).a(ns.d, true),
                  nr.a().a(ns.c, $$2).a(ns.e, 2).a(ns.b, ns.a.c).a(ns.d, true),
                  nr.a().a(ns.c, $$3).a(ns.b, ns.a.c).a(ns.d, true)
               )
               .a(
                  nm.a().a(dts.O, false),
                  nr.a().a(ns.c, $$5).a(ns.b, ns.a.d).a(ns.d, true),
                  nr.a().a(ns.c, $$2).a(ns.e, 2).a(ns.b, ns.a.d).a(ns.d, true),
                  nr.a().a(ns.c, $$3).a(ns.b, ns.a.d).a(ns.d, true),
                  nr.a().a(ns.c, $$4).a(ns.b, ns.a.d).a(ns.d, true)
               )
               .a(
                  nm.a().a(dts.J, false),
                  nr.a().a(ns.c, $$2).a(ns.e, 2).a(ns.a, ns.a.d).a(ns.d, true),
                  nr.a().a(ns.c, $$5).a(ns.a, ns.a.d).a(ns.d, true),
                  nr.a().a(ns.c, $$3).a(ns.a, ns.a.d).a(ns.d, true),
                  nr.a().a(ns.c, $$4).a(ns.a, ns.a.d).a(ns.d, true)
               )
               .a(
                  nm.a().a(dts.K, false),
                  nr.a().a(ns.c, $$5).a(ns.a, ns.a.b).a(ns.d, true),
                  nr.a().a(ns.c, $$4).a(ns.a, ns.a.b).a(ns.d, true),
                  nr.a().a(ns.c, $$3).a(ns.a, ns.a.b).a(ns.d, true),
                  nr.a().a(ns.c, $$2).a(ns.e, 2).a(ns.a, ns.a.b).a(ns.d, true)
               )
         );
   }

   private void y(dfc $$0) {
      nz $$1 = nz.b($$0);
      akt $$2 = ny.bg.a($$0, $$1, this.c);
      akt $$3 = ny.bf.a($$0, $$1, this.c);
      akt $$4 = ny.be.a($$0, $$1, this.c);
      this.a($$0, $$4);
      this.b
         .accept(
            nn.a($$0)
               .a(nm.a().a(dts.L, true), nr.a().a(ns.c, $$2))
               .a(nm.a().a(dts.M, true), nr.a().a(ns.c, $$2).a(ns.b, ns.a.b).a(ns.d, true))
               .a(nm.a().a(dts.N, true), nr.a().a(ns.c, $$2).a(ns.b, ns.a.c).a(ns.d, true))
               .a(nm.a().a(dts.O, true), nr.a().a(ns.c, $$2).a(ns.b, ns.a.d).a(ns.d, true))
               .a(nm.a().a(dts.J, true), nr.a().a(ns.c, $$2).a(ns.a, ns.a.d).a(ns.d, true))
               .a(nm.a().a(dts.K, true), nr.a().a(ns.c, $$2).a(ns.a, ns.a.b).a(ns.d, true))
               .a(nm.a().a(dts.L, false), nr.a().a(ns.c, $$3))
               .a(nm.a().a(dts.M, false), nr.a().a(ns.c, $$3).a(ns.b, ns.a.b).a(ns.d, true))
               .a(nm.a().a(dts.N, false), nr.a().a(ns.c, $$3).a(ns.b, ns.a.c).a(ns.d, true))
               .a(nm.a().a(dts.O, false), nr.a().a(ns.c, $$3).a(ns.b, ns.a.d).a(ns.d, true))
               .a(nm.a().a(dts.J, false), nr.a().a(ns.c, $$3).a(ns.a, ns.a.d).a(ns.d, true))
               .a(nm.a().a(dts.K, false), nr.a().a(ns.c, $$3).a(ns.a, ns.a.b).a(ns.d, true))
         );
   }

   private void F() {
      this.b
         .accept(
            nn.a(dfe.qn)
               .a(nr.a().a(ns.c, nz.H(dfe.qn)))
               .a(nm.a().a(dts.aL, 1), nr.a().a(ns.c, nz.a(dfe.qn, "_contents1")))
               .a(nm.a().a(dts.aL, 2), nr.a().a(ns.c, nz.a(dfe.qn, "_contents2")))
               .a(nm.a().a(dts.aL, 3), nr.a().a(ns.c, nz.a(dfe.qn, "_contents3")))
               .a(nm.a().a(dts.aL, 4), nr.a().a(ns.c, nz.a(dfe.qn, "_contents4")))
               .a(nm.a().a(dts.aL, 5), nr.a().a(ns.c, nz.a(dfe.qn, "_contents5")))
               .a(nm.a().a(dts.aL, 6), nr.a().a(ns.c, nz.a(dfe.qn, "_contents6")))
               .a(nm.a().a(dts.aL, 7), nr.a().a(ns.c, nz.a(dfe.qn, "_contents7")))
               .a(nm.a().a(dts.aL, 8), nr.a().a(ns.c, nz.a(dfe.qn, "_contents_ready")))
         );
   }

   private void z(dfc $$0) {
      akt $$1 = ny.c.a($$0, nz.a($$0), this.c);
      akt $$2 = this.a($$0, "_powered", ny.c, nz::b);
      akt $$3 = this.a($$0, "_lit", ny.c, nz::b);
      akt $$4 = this.a($$0, "_lit_powered", ny.c, nz::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nl a(dfc $$0, akt $$1, akt $$2, akt $$3, akt $$4) {
      return no.a($$0).a(np.a(dts.r, dts.w).a(($$4x, $$5) -> $$4x ? nr.a().a(ns.c, $$5 ? $$4 : $$2) : nr.a().a(ns.c, $$5 ? $$3 : $$1)));
   }

   private void A(dfc $$0) {
      akt $$1 = ny.c.a($$0, nz.a($$0), this.c);
      akt $$2 = this.a($$0, "_powered", ny.c, nz::b);
      akt $$3 = this.a($$0, "_lit", ny.c, nz::b);
      akt $$4 = this.a($$0, "_lit_powered", ny.c, nz::b);
      this.b.accept(this.b($$0, $$1, $$3, $$2, $$4));
   }

   private nl b(dfc $$0, akt $$1, akt $$2, akt $$3, akt $$4) {
      return no.a($$0).a(np.a(dts.r, dts.w).a(($$4x, $$5) -> $$4x ? nr.a().a(ns.c, $$5 ? $$4 : $$2) : nr.a().a(ns.c, $$5 ? $$3 : $$1)));
   }

   private void B(dfc $$0) {
      akt $$1 = ny.c.a($$0, nz.a($$0), this.c);
      akt $$2 = this.a($$0, "_enabled", ny.c, nz::b);
      this.b.accept(no.a($$0).a(np.a(dts.f).a($$2x -> nr.a().a(ns.c, $$2x ? $$2 : $$1))));
   }

   private void i(dfc $$0, dfc $$1) {
      akt $$2 = nw.a($$0);
      akt $$3 = nw.a($$0, "_powered");
      akt $$4 = nw.a($$0, "_lit");
      akt $$5 = nw.a($$0, "_lit_powered");
      this.a($$1, nw.a($$0.q()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void C(dfc $$0) {
      this.c($$0);
      this.b.accept(no.a($$0, nr.a().a(ns.c, ny.ao.a($$0, nz.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.C(dfe.rJ);
      this.C(dfe.rI);
      this.C(dfe.rH);
      this.C(dfe.rG);
   }

   private void D(dfc $$0) {
      this.c($$0);
      np.b<iw, dtz> $$1 = np.a(dts.bm, dts.bn);

      for (dtz $$2 : dtz.values()) {
         $$1.a(iw.b, $$2, this.a($$0, iw.b, $$2));
      }

      for (dtz $$3 : dtz.values()) {
         $$1.a(iw.a, $$3, this.a($$0, iw.a, $$3));
      }

      this.b.accept(no.a($$0).a($$1));
   }

   private nr a(dfc $$0, iw $$1, dtz $$2) {
      String $$3 = "_" + $$1.c() + "_" + $$2.c();
      nz $$4 = nz.c(nz.a($$0, $$3));
      return nr.a().a(ns.c, ny.an.a($$0, $$3, $$4, this.c));
   }

   private void j(dfc $$0, dfc $$1) {
      nz $$2 = new nz().a(oa.e, nz.H($$1)).a(oa.f, nz.H($$0)).a(oa.i, nz.a($$0, "_side"));
      this.b.accept(c($$0, ny.n.a($$0, $$2, this.c)));
   }

   private void E(dfc $$0) {
      akt $$1 = nz.a($$0, "_side");
      nz $$2 = new nz().a(oa.f, nz.a($$0, "_top")).a(oa.i, $$1);
      nz $$3 = new nz().a(oa.f, nz.a($$0, "_inverted_top")).a(oa.i, $$1);
      this.b
         .accept(
            no.a($$0).a(np.a(dts.p).a(false, nr.a().a(ns.c, ny.aF.a($$0, $$2, this.c))).a(true, nr.a().a(ns.c, ny.aF.a(nw.a($$0, "_inverted"), $$3, this.c))))
         );
   }

   private void F(dfc $$0) {
      this.b.accept(no.a($$0, nr.a().a(ns.c, nw.a($$0))).a(this.n()));
   }

   private void H() {
      dfc $$0 = dfe.tD;
      akt $$1 = nw.a($$0, "_on");
      akt $$2 = nw.a($$0);
      this.b.accept(no.a($$0, nr.a().a(ns.c, nw.a($$0))).a(this.n()).a(a(dts.w, $$1, $$2)));
   }

   private void k(dfc $$0, dfc $$1) {
      nz $$2 = new nz().a(oa.B, nz.H($$0)).a(oa.f, nz.H($$1));
      nz $$3 = new nz().a(oa.B, nz.H($$0)).a(oa.f, nz.a($$1, "_moist"));
      akt $$4 = ny.aW.a($$1, $$2, this.c);
      akt $$5 = ny.aW.a(nz.a($$1, "_moist"), $$3, this.c);
      this.b.accept(no.a($$1).a(a(dts.aQ, 7, $$5, $$4)));
   }

   private List<akt> G(dfc $$0) {
      akt $$1 = ny.aX.a(nw.a($$0, "_floor0"), nz.v($$0), this.c);
      akt $$2 = ny.aX.a(nw.a($$0, "_floor1"), nz.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akt> H(dfc $$0) {
      akt $$1 = ny.aY.a(nw.a($$0, "_side0"), nz.v($$0), this.c);
      akt $$2 = ny.aY.a(nw.a($$0, "_side1"), nz.w($$0), this.c);
      akt $$3 = ny.aZ.a(nw.a($$0, "_side_alt0"), nz.v($$0), this.c);
      akt $$4 = ny.aZ.a(nw.a($$0, "_side_alt1"), nz.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akt> I(dfc $$0) {
      akt $$1 = ny.ba.a(nw.a($$0, "_up0"), nz.v($$0), this.c);
      akt $$2 = ny.ba.a(nw.a($$0, "_up1"), nz.w($$0), this.c);
      akt $$3 = ny.bb.a(nw.a($$0, "_up_alt0"), nz.v($$0), this.c);
      akt $$4 = ny.bb.a(nw.a($$0, "_up_alt1"), nz.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<nr> a(List<akt> $$0, UnaryOperator<nr> $$1) {
      return $$0.stream().map($$0x -> nr.a().a(ns.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void I() {
      nm $$0 = nm.a().a(dts.L, false).a(dts.M, false).a(dts.N, false).a(dts.O, false).a(dts.J, false);
      List<akt> $$1 = this.G(dfe.dc);
      List<akt> $$2 = this.H(dfe.dc);
      List<akt> $$3 = this.I(dfe.dc);
      this.b
         .accept(
            nn.a(dfe.dc)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nm.b(nm.a().a(dts.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nm.b(nm.a().a(dts.M, true), $$0), a($$2, $$0x -> $$0x.a(ns.b, ns.a.b)))
               .a(nm.b(nm.a().a(dts.N, true), $$0), a($$2, $$0x -> $$0x.a(ns.b, ns.a.c)))
               .a(nm.b(nm.a().a(dts.O, true), $$0), a($$2, $$0x -> $$0x.a(ns.b, ns.a.d)))
               .a(nm.a().a(dts.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void J() {
      List<akt> $$0 = this.G(dfe.dd);
      List<akt> $$1 = this.H(dfe.dd);
      this.b
         .accept(
            nn.a(dfe.dd)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ns.b, ns.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ns.b, ns.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ns.b, ns.a.d)))
         );
   }

   private void J(dfc $$0) {
      akt $$1 = ob.t.create($$0, this.c);
      akt $$2 = ob.u.create($$0, this.c);
      this.a($$0.q());
      this.b.accept(no.a($$0).a(a(dts.j, $$2, $$1)));
   }

   private void K() {
      nz $$0 = nz.a(nz.a(dfe.aL, "_side"), nz.a(dfe.aL, "_top"));
      akt $$1 = ny.j.a(dfe.aL, $$0, this.c);
      this.b.accept(d(dfe.aL, $$1));
   }

   private void L() {
      this.a(cuk.aJ);
      dfc $$0 = dfe.aj;
      np.b<Boolean, Integer> $$1 = np.a(dkb.d, dkb.b);
      akt $$2 = nw.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akt $$4 = nw.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, nr.a().a(ns.c, $$4));
         $$1.a(false, $$3, nr.a().a(ns.c, $$2));
      }

      this.b.accept(no.a(dfe.aj).a($$1));
   }

   private void M() {
      this.b
         .accept(
            no.a(dfe.lG)
               .a(
                  np.a(dts.as)
                     .a(0, nr.a().a(ns.c, this.a(dfe.lG, "_0", ny.c, nz::b)))
                     .a(1, nr.a().a(ns.c, this.a(dfe.lG, "_1", ny.c, nz::b)))
                     .a(2, nr.a().a(ns.c, this.a(dfe.lG, "_2", ny.c, nz::b)))
                     .a(3, nr.a().a(ns.c, this.a(dfe.lG, "_3", ny.c, nz::b)))
               )
         );
   }

   private void N() {
      akt $$0 = nz.H(dfe.m);
      akt $$1 = nz.H(dfe.n);
      nz $$2 = new nz().a(oa.e, $$0).b(oa.e, oa.c).a(oa.f, nz.a(dfe.j, "_top")).a(oa.i, nz.a(dfe.j, "_snow"));
      nz $$3 = new nz().a(oa.e, $$1).b(oa.e, oa.c).a(oa.f, nz.a(dfe.k, "_top")).a(oa.i, nz.a(dfe.k, "_snow"));
      nr $$4 = nr.a().a(ns.c, ny.n.a(dfe.j, "_snow", $$2, this.c));
      nr $$5 = nr.a().a(ns.c, ny.n.a(dfe.k, "_snow", $$3, this.c));
      this.a(dfe.j, nw.a(dfe.j), $$4);
      akt $$6 = ob.f.get(dfe.gd).a($$1x -> $$1x.a(oa.e, $$0)).a(dfe.gd, this.c);
      this.a(dfe.gd, $$6, $$4);
      akt $$7 = ob.f.get(dfe.p).a($$1x -> $$1x.a(oa.e, $$0)).a(dfe.p, this.c);
      this.a(dfe.p, $$7, $$4);
      akt $$8 = ob.f.get(dfe.k).a($$1x -> $$1x.a(oa.e, $$1)).a(dfe.k, this.c);
      this.a(dfe.k, $$8, $$5);
   }

   private void a(dfc $$0, akt $$1, nr $$2) {
      List<nr> $$3 = Arrays.asList(a($$1));
      this.b.accept(no.a($$0).a(np.a(dts.z).a(true, $$2).a(false, $$3)));
   }

   private void O() {
      this.a(cuk.sE);
      this.b
         .accept(
            no.a(dfe.gu)
               .a(
                  np.a(dts.ar)
                     .a(0, nr.a().a(ns.c, nw.a(dfe.gu, "_stage0")))
                     .a(1, nr.a().a(ns.c, nw.a(dfe.gu, "_stage1")))
                     .a(2, nr.a().a(ns.c, nw.a(dfe.gu, "_stage2")))
               )
               .a(c())
         );
   }

   private void K(dfc $$0) {
      this.b.accept(b($$0, nw.a($$0)));
   }

   private void l(dfc $$0, dfc $$1) {
      nz $$2 = nz.b($$1);
      akt $$3 = ny.Y.a($$0, $$2, this.c);
      akt $$4 = ny.Z.a($$0, $$2, this.c);
      this.b.accept(no.a($$0).a(a(dts.aT, 1, $$4, $$3)));
   }

   private void P() {
      akt $$0 = nw.a(dfe.hW);
      akt $$1 = nw.a(dfe.hW, "_side");
      this.a(cuk.ng);
      this.b
         .accept(
            no.a(dfe.hW)
               .a(
                  np.a(dts.Q)
                     .a(iw.a, nr.a().a(ns.c, $$0))
                     .a(iw.c, nr.a().a(ns.c, $$1))
                     .a(iw.f, nr.a().a(ns.c, $$1).a(ns.b, ns.a.b))
                     .a(iw.d, nr.a().a(ns.c, $$1).a(ns.b, ns.a.c))
                     .a(iw.e, nr.a().a(ns.c, $$1).a(ns.b, ns.a.d))
               )
         );
   }

   private void m(dfc $$0, dfc $$1) {
      akt $$2 = nw.a($$0);
      this.b.accept(no.a($$1, nr.a().a(ns.c, $$2)));
      this.a($$1, $$2);
   }

   private void Q() {
      akt $$0 = nw.a(dfe.fO, "_post_ends");
      akt $$1 = nw.a(dfe.fO, "_post");
      akt $$2 = nw.a(dfe.fO, "_cap");
      akt $$3 = nw.a(dfe.fO, "_cap_alt");
      akt $$4 = nw.a(dfe.fO, "_side");
      akt $$5 = nw.a(dfe.fO, "_side_alt");
      this.b
         .accept(
            nn.a(dfe.fO)
               .a(nr.a().a(ns.c, $$0))
               .a(nm.a().a(dts.L, false).a(dts.M, false).a(dts.N, false).a(dts.O, false), nr.a().a(ns.c, $$1))
               .a(nm.a().a(dts.L, true).a(dts.M, false).a(dts.N, false).a(dts.O, false), nr.a().a(ns.c, $$2))
               .a(nm.a().a(dts.L, false).a(dts.M, true).a(dts.N, false).a(dts.O, false), nr.a().a(ns.c, $$2).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.L, false).a(dts.M, false).a(dts.N, true).a(dts.O, false), nr.a().a(ns.c, $$3))
               .a(nm.a().a(dts.L, false).a(dts.M, false).a(dts.N, false).a(dts.O, true), nr.a().a(ns.c, $$3).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.L, true), nr.a().a(ns.c, $$4))
               .a(nm.a().a(dts.M, true), nr.a().a(ns.c, $$4).a(ns.b, ns.a.b))
               .a(nm.a().a(dts.N, true), nr.a().a(ns.c, $$5))
               .a(nm.a().a(dts.O, true), nr.a().a(ns.c, $$5).a(ns.b, ns.a.b))
         );
      this.d(dfe.fO);
   }

   private void L(dfc $$0) {
      this.b.accept(no.a($$0, nr.a().a(ns.c, nw.a($$0))).a(b()));
   }

   private void R() {
      akt $$0 = nw.a(dfe.ek);
      akt $$1 = nw.a(dfe.ek, "_on");
      this.d(dfe.ek);
      this.b
         .accept(
            no.a(dfe.ek)
               .a(a(dts.w, $$0, $$1))
               .a(
                  np.a(dts.U, dts.R)
                     .a(dtn.c, iw.c, nr.a().a(ns.a, ns.a.c).a(ns.b, ns.a.c))
                     .a(dtn.c, iw.f, nr.a().a(ns.a, ns.a.c).a(ns.b, ns.a.d))
                     .a(dtn.c, iw.d, nr.a().a(ns.a, ns.a.c))
                     .a(dtn.c, iw.e, nr.a().a(ns.a, ns.a.c).a(ns.b, ns.a.b))
                     .a(dtn.a, iw.c, nr.a())
                     .a(dtn.a, iw.f, nr.a().a(ns.b, ns.a.b))
                     .a(dtn.a, iw.d, nr.a().a(ns.b, ns.a.c))
                     .a(dtn.a, iw.e, nr.a().a(ns.b, ns.a.d))
                     .a(dtn.b, iw.c, nr.a().a(ns.a, ns.a.b))
                     .a(dtn.b, iw.f, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.b))
                     .a(dtn.b, iw.d, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.c))
                     .a(dtn.b, iw.e, nr.a().a(ns.a, ns.a.b).a(ns.b, ns.a.d))
               )
         );
   }

   private void S() {
      this.d(dfe.ge);
      this.b.accept(b(dfe.ge, nw.a(dfe.ge)));
   }

   private void T() {
      this.d(dfe.uL);
      this.b.accept(c(dfe.uL, nw.a(dfe.uL)));
   }

   private void U() {
      this.b.accept(no.a(dfe.eR).a(np.a(dts.H).a(iw.a.a, nr.a().a(ns.c, nw.a(dfe.eR, "_ns"))).a(iw.a.c, nr.a().a(ns.c, nw.a(dfe.eR, "_ew")))));
   }

   private void M(dfc $$0) {
      this.b.accept(no.a($$0, nr.a().a(ns.c, nw.a($$0))));
      this.a($$0, nw.a($$0));
   }

   private void V() {
      akt $$0 = ob.a.create(dfe.eJ, this.c);
      this.b
         .accept(
            no.a(
               dfe.eJ,
               nr.a().a(ns.c, $$0),
               nr.a().a(ns.c, $$0).a(ns.a, ns.a.b),
               nr.a().a(ns.c, $$0).a(ns.a, ns.a.c),
               nr.a().a(ns.c, $$0).a(ns.a, ns.a.d),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.b),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.b).a(ns.a, ns.a.b),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.b).a(ns.a, ns.a.c),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.b).a(ns.a, ns.a.d),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.c),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.c).a(ns.a, ns.a.b),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.c).a(ns.a, ns.a.c),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.c).a(ns.a, ns.a.d),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.d),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.d).a(ns.a, ns.a.b),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.d).a(ns.a, ns.a.c),
               nr.a().a(ns.c, $$0).a(ns.b, ns.a.d).a(ns.a, ns.a.d)
            )
         );
   }

   private void W() {
      akt $$0 = nw.a(dfe.lM);
      akt $$1 = nw.a(dfe.lM, "_on");
      this.b.accept(no.a(dfe.lM).a(a(dts.w, $$1, $$0)).a(e()));
   }

   private void X() {
      akt $$0 = nz.a(dfe.R, "_side");
      akt $$1 = nz.a(dfe.R, "_front");
      akt $$2 = nz.a(dfe.R, "_back");
      akt $$3 = nz.a(dfe.R, "_back_triggered");
      nz $$4 = new nz().a(oa.o, $$0).a(oa.m, $$0).a(oa.l, $$0).a(oa.c, $$1).a(oa.j, $$1).a(oa.k, $$2).a(oa.n, $$0);
      nz $$5 = $$4.c(oa.k, $$3);
      akt $$6 = ny.b.a(dfe.R, $$4, this.c);
      akt $$7 = ny.b.a(dfe.R, "_triggered", $$5, this.c);
      this.b.accept(no.a(dfe.R).a(a(dts.A, $$7, $$6)).a(e()));
      this.a(dfe.R, $$6);
   }

   private void Y() {
      nz $$0 = new nz().a(oa.e, nz.a(dfe.ci, "_bottom")).a(oa.i, nz.a(dfe.ci, "_side"));
      akt $$1 = nz.a(dfe.ci, "_top_sticky");
      akt $$2 = nz.a(dfe.ci, "_top");
      nz $$3 = $$0.c(oa.F, $$1);
      nz $$4 = $$0.c(oa.F, $$2);
      akt $$5 = nw.a(dfe.ci, "_base");
      this.a(dfe.ci, $$5, $$4);
      this.a(dfe.cb, $$5, $$3);
      akt $$6 = ny.n.a(dfe.ci, "_inventory", $$0.c(oa.f, $$2), this.c);
      akt $$7 = ny.n.a(dfe.cb, "_inventory", $$0.c(oa.f, $$1), this.c);
      this.a(dfe.ci, $$6);
      this.a(dfe.cb, $$7);
   }

   private void a(dfc $$0, akt $$1, nz $$2) {
      akt $$3 = ny.bl.a($$0, $$2, this.c);
      this.b.accept(no.a($$0).a(a(dts.g, $$1, $$3)).a(e()));
   }

   private void Z() {
      nz $$0 = new nz().a(oa.G, nz.a(dfe.ci, "_top")).a(oa.i, nz.a(dfe.ci, "_side"));
      nz $$1 = $$0.c(oa.F, nz.a(dfe.ci, "_top_sticky"));
      nz $$2 = $$0.c(oa.F, nz.a(dfe.ci, "_top"));
      this.b
         .accept(
            no.a(dfe.cj)
               .a(
                  np.a(dts.x, dts.bg)
                     .a(false, due.a, nr.a().a(ns.c, ny.bm.a(dfe.ci, "_head", $$2, this.c)))
                     .a(false, due.b, nr.a().a(ns.c, ny.bm.a(dfe.ci, "_head_sticky", $$1, this.c)))
                     .a(true, due.a, nr.a().a(ns.c, ny.bn.a(dfe.ci, "_head_short", $$2, this.c)))
                     .a(true, due.b, nr.a().a(ns.c, ny.bn.a(dfe.ci, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void aa() {
      dfc $$0 = dfe.uP;
      nz $$1 = nz.a($$0, "_side_inactive", "_top_inactive");
      nz $$2 = nz.a($$0, "_side_active", "_top_active");
      nz $$3 = nz.a($$0, "_side_active", "_top_ejecting_reward");
      akt $$4 = ny.o.a($$0, $$1, this.c);
      akt $$5 = ny.o.a($$0, "_active", $$2, this.c);
      akt $$6 = ny.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(no.a($$0).a(np.a(dts.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> nr.a().a(ns.c, $$4);
            case b, c, d -> nr.a().a(ns.c, $$5);
            case e -> nr.a().a(ns.c, $$6);
         };
      })));
   }

   private void ab() {
      dfc $$0 = dfe.uQ;
      nz $$1 = nz.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      nz $$2 = nz.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      nz $$3 = nz.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      nz $$4 = nz.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akt $$5 = ny.bR.a($$0, $$1, this.c);
      akt $$6 = ny.bR.a($$0, "_active", $$2, this.c);
      akt $$7 = ny.bR.a($$0, "_unlocking", $$3, this.c);
      akt $$8 = ny.bR.a($$0, "_ejecting_reward", $$4, this.c);
      this.a($$0, $$5);
      this.b.accept(no.a($$0).a(b()).a(np.a(dom.b).a($$4x -> {
         return switch ($$4x) {
            case a -> nr.a().a(ns.c, $$5);
            case b -> nr.a().a(ns.c, $$6);
            case c -> nr.a().a(ns.c, $$7);
            case d -> nr.a().a(ns.c, $$8);
         };
      })));
   }

   private void ac() {
      akt $$0 = nw.a(dfe.sb, "_inactive");
      akt $$1 = nw.a(dfe.sb, "_active");
      this.a(dfe.sb, $$0);
      this.b.accept(no.a(dfe.sb).a(np.a(dts.bo).a($$2 -> nr.a().a(ns.c, $$2 != duj.b && $$2 != duj.c ? $$0 : $$1))));
   }

   private void ad() {
      akt $$0 = nw.a(dfe.sc, "_inactive");
      akt $$1 = nw.a(dfe.sc, "_active");
      this.a(dfe.sc, $$0);
      this.b.accept(no.a(dfe.sc).a(np.a(dts.bo).a($$2 -> nr.a().a(ns.c, $$2 != duj.b && $$2 != duj.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      akt $$0 = ny.bQ.a(dfe.sg, nz.a(false), this.c);
      akt $$1 = ny.bQ.a(dfe.sg, "_can_summon", nz.a(true), this.c);
      this.a(dfe.sg, $$0);
      this.b.accept(no.a(dfe.sg).a(a(dts.G, $$1, $$0)));
   }

   private void af() {
      akt $$0 = nw.a(dfe.oQ, "_stable");
      akt $$1 = nw.a(dfe.oQ, "_unstable");
      this.a(dfe.oQ, $$0);
      this.b.accept(no.a(dfe.oQ).a(a(dts.b, $$1, $$0)));
   }

   private void ag() {
      akt $$0 = this.a(dfe.tS, "", ny.ao, nz::c);
      akt $$1 = this.a(dfe.tS, "_lit", ny.ao, nz::c);
      this.b.accept(no.a(dfe.tS).a(a(dts.D, $$1, $$0)));
      akt $$2 = this.a(dfe.tT, "", ny.ao, nz::c);
      akt $$3 = this.a(dfe.tT, "_lit", ny.ao, nz::c);
      this.b.accept(no.a(dfe.tT).a(a(dts.D, $$3, $$2)));
   }

   private void ah() {
      akt $$0 = ob.a.create(dfe.gt, this.c);
      akt $$1 = this.a(dfe.gt, "_on", ny.c, nz::b);
      this.b.accept(no.a(dfe.gt).a(a(dts.r, $$1, $$0)));
   }

   private void n(dfc $$0, dfc $$1) {
      nz $$2 = nz.y($$0);
      this.b.accept(c($$0, ny.bj.a($$0, $$2, this.c)));
      this.b.accept(no.a($$1, nr.a().a(ns.c, ny.bk.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      nz $$0 = nz.y(dfe.ey);
      nz $$1 = nz.i(nz.a(dfe.ey, "_off"));
      akt $$2 = ny.bj.a(dfe.ey, $$0, this.c);
      akt $$3 = ny.bj.a(dfe.ey, "_off", $$1, this.c);
      this.b.accept(no.a(dfe.ey).a(a(dts.r, $$2, $$3)));
      akt $$4 = ny.bk.a(dfe.ez, $$0, this.c);
      akt $$5 = ny.bk.a(dfe.ez, "_off", $$1, this.c);
      this.b.accept(no.a(dfe.ez).a(a(dts.r, $$4, $$5)).a(d()));
      this.d(dfe.ey);
      this.c(dfe.ez);
   }

   private void aj() {
      this.a(cuk.mZ);
      this.b.accept(no.a(dfe.eZ).a(np.a(dts.aA, dts.s, dts.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return nr.a().a(ns.c, nz.a(dfe.eZ, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(cuk.ea);
      this.b
         .accept(
            no.a(dfe.nT)
               .a(
                  np.a(dts.aS, dts.C)
                     .a(1, false, Arrays.asList(a(nw.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(nw.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(nw.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(nw.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(nw.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(nw.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(nw.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(nw.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      akt $$0 = this.b(dfe.eB, dfe.eB, dfe.eD);
      this.b.accept(c(dfe.eD, $$0));
   }

   private akt b(dfc $$0, dfc $$1, dfc $$2) {
      nz $$3 = nz.b($$1);
      akt $$4 = ny.c.a($$2, nz.a($$1), this.c);
      akt[] $$5 = IntStream.range(0, ny.bS.length).mapToObj($$2x -> ny.bS[$$2x].a($$0, "_height" + ($$2x + 1) * 2, $$3, this.c)).toArray(akt[]::new);
      this.b.accept(no.a($$0).a(np.a(dts.aF).a($$2x -> nr.a().a(ns.c, $$2x - 1 < $$5.length ? $$5[$$2x - 1] : $$4))));
      this.a($$0, $$5[0]);
      return $$4;
   }

   private void am() {
      this.b.accept(no.a(dfe.pa, nr.a().a(ns.c, nw.a(dfe.pa))).a(b()));
   }

   private void an() {
      this.b.accept(no.a(dfe.pb, nr.a().a(ns.c, nw.a(dfe.pb))).a(b()));
   }

   private void ao() {
      akt $$0 = ob.a.create(dfe.ql, this.c);
      this.a(dfe.ql, $$0);
      this.b.accept(no.a(dfe.ql).a(np.a(dts.bj).a($$0x -> nr.a().a(ns.c, this.a(dfe.ql, "_" + $$0x.c(), ny.c, nz::b)))));
   }

   private void ap() {
      this.a(cuk.yd);
      this.b.accept(no.a(dfe.pi).a(np.a(dts.as).a($$0 -> nr.a().a(ns.c, this.a(dfe.pi, "_stage" + $$0, ny.ao, nz::c)))));
   }

   private void aq() {
      this.a(cuk.qL);
      this.b
         .accept(
            no.a(dfe.gA)
               .a(
                  np.a(dts.a, dts.M, dts.L, dts.N, dts.O)
                     .a(false, false, false, false, false, nr.a().a(ns.c, nw.a(dfe.gA, "_ns")))
                     .a(false, true, false, false, false, nr.a().a(ns.c, nw.a(dfe.gA, "_n")).a(ns.b, ns.a.b))
                     .a(false, false, true, false, false, nr.a().a(ns.c, nw.a(dfe.gA, "_n")))
                     .a(false, false, false, true, false, nr.a().a(ns.c, nw.a(dfe.gA, "_n")).a(ns.b, ns.a.c))
                     .a(false, false, false, false, true, nr.a().a(ns.c, nw.a(dfe.gA, "_n")).a(ns.b, ns.a.d))
                     .a(false, true, true, false, false, nr.a().a(ns.c, nw.a(dfe.gA, "_ne")))
                     .a(false, true, false, true, false, nr.a().a(ns.c, nw.a(dfe.gA, "_ne")).a(ns.b, ns.a.b))
                     .a(false, false, false, true, true, nr.a().a(ns.c, nw.a(dfe.gA, "_ne")).a(ns.b, ns.a.c))
                     .a(false, false, true, false, true, nr.a().a(ns.c, nw.a(dfe.gA, "_ne")).a(ns.b, ns.a.d))
                     .a(false, false, true, true, false, nr.a().a(ns.c, nw.a(dfe.gA, "_ns")))
                     .a(false, true, false, false, true, nr.a().a(ns.c, nw.a(dfe.gA, "_ns")).a(ns.b, ns.a.b))
                     .a(false, true, true, true, false, nr.a().a(ns.c, nw.a(dfe.gA, "_nse")))
                     .a(false, true, false, true, true, nr.a().a(ns.c, nw.a(dfe.gA, "_nse")).a(ns.b, ns.a.b))
                     .a(false, false, true, true, true, nr.a().a(ns.c, nw.a(dfe.gA, "_nse")).a(ns.b, ns.a.c))
                     .a(false, true, true, false, true, nr.a().a(ns.c, nw.a(dfe.gA, "_nse")).a(ns.b, ns.a.d))
                     .a(false, true, true, true, true, nr.a().a(ns.c, nw.a(dfe.gA, "_nsew")))
                     .a(true, false, false, false, false, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_ns")))
                     .a(true, false, true, false, false, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_n")))
                     .a(true, false, false, true, false, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_n")).a(ns.b, ns.a.c))
                     .a(true, true, false, false, false, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_n")).a(ns.b, ns.a.b))
                     .a(true, false, false, false, true, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_n")).a(ns.b, ns.a.d))
                     .a(true, true, true, false, false, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_ne")))
                     .a(true, true, false, true, false, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_ne")).a(ns.b, ns.a.b))
                     .a(true, false, false, true, true, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_ne")).a(ns.b, ns.a.c))
                     .a(true, false, true, false, true, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_ne")).a(ns.b, ns.a.d))
                     .a(true, false, true, true, false, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_ns")))
                     .a(true, true, false, false, true, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_ns")).a(ns.b, ns.a.b))
                     .a(true, true, true, true, false, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_nse")))
                     .a(true, true, false, true, true, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_nse")).a(ns.b, ns.a.b))
                     .a(true, false, true, true, true, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_nse")).a(ns.b, ns.a.c))
                     .a(true, true, true, false, true, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_nse")).a(ns.b, ns.a.d))
                     .a(true, true, true, true, true, nr.a().a(ns.c, nw.a(dfe.gA, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.d(dfe.gz);
      this.b.accept(no.a(dfe.gz).a(np.a(dts.a, dts.w).a(($$0, $$1) -> nr.a().a(ns.c, nz.a(dfe.gz, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akt a(int $$0, String $$1, nz $$2) {
      switch ($$0) {
         case 1:
            return ny.bp.a(nw.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return ny.bq.a(nw.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return ny.br.a(nw.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return ny.bs.a(nw.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akt a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", nz.b(nz.H(dfe.nd)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", nz.b(nz.a(dfe.nd, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", nz.b(nz.a(dfe.nd, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void as() {
      this.a(cuk.lE);
      this.b.accept(no.a(dfe.nd).a(np.a(dts.aD, dts.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void at() {
      this.a(cuk.lF);
      Function<Integer, akt> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         nz $$2 = nz.a($$1);
         return ny.bA.a(dfe.ne, $$1, $$2, this.c);
      };
      this.b.accept(no.a(dfe.ne).a(np.a(dmy.c).a($$1 -> nr.a().a(ns.c, $$0.apply($$1)))));
   }

   private void N(dfc $$0) {
      this.d($$0);
      akt $$1 = nw.a($$0);
      nn $$2 = nn.a($$0);
      nm.c $$3 = ad.a(nm.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dtt, Function<akt, nr>> $$4 : a) {
         dtt $$5 = (dtt)$$4.getFirst();
         Function<akt, nr> $$6 = (Function<akt, nr>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(nm.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void au() {
      akt $$0 = nz.a(dfe.sf, "_bottom");
      nz $$1 = new nz().a(oa.e, $$0).a(oa.f, nz.a(dfe.sf, "_top")).a(oa.i, nz.a(dfe.sf, "_side"));
      nz $$2 = new nz().a(oa.e, $$0).a(oa.f, nz.a(dfe.sf, "_top_bloom")).a(oa.i, nz.a(dfe.sf, "_side_bloom"));
      akt $$3 = ny.n.a(dfe.sf, "", $$1, this.c);
      akt $$4 = ny.n.a(dfe.sf, "_bloom", $$2, this.c);
      this.b.accept(no.a(dfe.sf).a(np.a(dts.E).a($$2x -> nr.a().a(ns.c, $$2x ? $$4 : $$3))));
      this.a(cuk.hw, $$3);
   }

   private void av() {
      dfc $$0 = dfe.cX;
      akt $$1 = nw.a($$0);
      nn $$2 = nn.a($$0);
      List.of(Pair.of(iw.c, ns.a.a), Pair.of(iw.f, ns.a.b), Pair.of(iw.d, ns.a.c), Pair.of(iw.e, ns.a.d)).forEach($$2x -> {
         iw $$3 = (iw)$$2x.getFirst();
         ns.a $$4 = (ns.a)$$2x.getSecond();
         nm.c $$5 = nm.a().a(dts.R, $$3);
         $$2.a($$5, nr.a().a(ns.c, $$1).a(ns.b, $$4).a(ns.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, nw.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nn $$0, nm.c $$1, ns.a $$2) {
      List.of(Pair.of(dts.bp, ny.aM), Pair.of(dts.bq, ny.aN), Pair.of(dts.br, ny.aO), Pair.of(dts.bs, ny.aP), Pair.of(dts.bt, ny.aQ), Pair.of(dts.bu, ny.aR))
         .forEach($$3 -> {
            dtt $$4 = (dtt)$$3.getFirst();
            nx $$5 = (nx)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nn $$0, nm.c $$1, ns.a $$2, dtt $$3, nx $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      nz $$7 = new nz().a(oa.b, nz.a(dfe.cX, $$6));
      ni.d $$8 = new ni.d($$4, $$6);
      akt $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dfe.cX, $$6, $$7, this.c));
      $$0.a(nm.a($$1, nm.a().a($$3, $$5)), nr.a().a(ns.c, $$9).a(ns.b, $$2));
   }

   private void aw() {
      this.b.accept(c(dfe.lH, ny.c.a(dfe.lH, nz.b(nw.a("magma")), this.c)));
   }

   private void O(dfc $$0) {
      this.b($$0, ob.q);
      ny.bH.a(nw.a($$0.q()), nz.u($$0), this.c);
   }

   private void b(dfc $$0, dfc $$1, ni.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void o(dfc $$0, dfc $$1) {
      ny.bI.a(nw.a($$0.q()), nz.u($$1), this.c);
   }

   private void ax() {
      akt $$0 = nw.a(dfe.b);
      akt $$1 = nw.a(dfe.b, "_mirrored");
      this.b.accept(a(dfe.fF, $$0, $$1));
      this.a(dfe.fF, $$0);
   }

   private void ay() {
      akt $$0 = nw.a(dfe.ug);
      akt $$1 = nw.a(dfe.ug, "_mirrored");
      this.b.accept(a(dfe.uB, $$0, $$1).a(f()));
      this.a(dfe.uB, $$0);
   }

   private void p(dfc $$0, dfc $$1) {
      this.a($$0, ni.e.b);
      nz $$2 = nz.d(nz.a($$0, "_pot"));
      akt $$3 = ni.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void az() {
      akt $$0 = nz.a(dfe.qw, "_bottom");
      akt $$1 = nz.a(dfe.qw, "_top_off");
      akt $$2 = nz.a(dfe.qw, "_top");
      akt[] $$3 = new akt[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         nz $$5 = new nz().a(oa.e, $$0).a(oa.f, $$4 == 0 ? $$1 : $$2).a(oa.i, nz.a(dfe.qw, "_side" + $$4));
         $$3[$$4] = ny.n.a(dfe.qw, "_" + $$4, $$5, this.c);
      }

      this.b.accept(no.a(dfe.qw).a(np.a(dts.aZ).a($$1x -> nr.a().a(ns.c, $$3[$$1x]))));
      this.a(cuk.yC, $$3[0]);
   }

   private nr a(iy $$0, nr $$1) {
      switch ($$0) {
         case b:
            return $$1.a(ns.a, ns.a.b);
         case c:
            return $$1.a(ns.a, ns.a.b).a(ns.b, ns.a.c);
         case d:
            return $$1.a(ns.a, ns.a.b).a(ns.b, ns.a.d);
         case a:
            return $$1.a(ns.a, ns.a.b).a(ns.b, ns.a.b);
         case f:
            return $$1.a(ns.a, ns.a.d).a(ns.b, ns.a.c);
         case g:
            return $$1.a(ns.a, ns.a.d);
         case h:
            return $$1.a(ns.a, ns.a.d).a(ns.b, ns.a.b);
         case e:
            return $$1.a(ns.a, ns.a.d).a(ns.b, ns.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(ns.b, ns.a.c);
         case i:
            return $$1.a(ns.b, ns.a.d);
         case j:
            return $$1.a(ns.b, ns.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aA() {
      akt $$0 = nz.a(dfe.qm, "_top");
      akt $$1 = nz.a(dfe.qm, "_bottom");
      akt $$2 = nz.a(dfe.qm, "_side");
      akt $$3 = nz.a(dfe.qm, "_lock");
      nz $$4 = new nz().a(oa.o, $$2).a(oa.m, $$2).a(oa.l, $$2).a(oa.c, $$0).a(oa.j, $$0).a(oa.k, $$1).a(oa.n, $$3);
      akt $$5 = ny.b.a(dfe.qm, $$4, this.c);
      this.b.accept(no.a(dfe.qm, nr.a().a(ns.c, $$5)).a(np.a(dts.T).a($$0x -> this.a($$0x, nr.a()))));
   }

   private void aB() {
      dfc $$0 = dfe.S;
      akt $$1 = nw.a($$0);
      ob $$2 = ob.a.get($$0);
      dfc $$3 = dfe.kB;
      akt $$4 = ny.ab.a($$3, $$2.b(), this.c);
      akt $$5 = ny.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lk.a().filter(ll::c).forEach($$0x -> this.h($$0x.a()).a($$0x));
      this.h(dfe.sq).a(lk.x).a(dfe.sq, dfe.sO).a(dfe.su, dfe.sy).a(lk.z);
      this.h(dfe.sp).a(lk.B).a(dfe.sp, dfe.sN).a(dfe.st, dfe.sx).a(lk.D);
      this.h(dfe.so).a(lk.F).a(dfe.so, dfe.sM).a(dfe.ss, dfe.sw).a(lk.H);
      this.h(dfe.sn).a(lk.J).a(dfe.sn, dfe.sL).a(dfe.sr, dfe.sv).a(lk.L);
      this.z(dfe.tv);
      this.z(dfe.tw);
      this.z(dfe.tx);
      this.z(dfe.ty);
      this.i(dfe.tv, dfe.tz);
      this.i(dfe.tw, dfe.tA);
      this.i(dfe.tx, dfe.tB);
      this.i(dfe.ty, dfe.tC);
      this.m(dfe.a);
      this.c(dfe.oa, dfe.a);
      this.c(dfe.nZ, dfe.a);
      this.m(dfe.gH);
      this.m(dfe.eE);
      this.c(dfe.ob, dfe.al);
      this.m(dfe.gs);
      this.m(dfe.nc);
      this.m(dfe.gj);
      this.m(dfe.gK);
      this.a(cuk.vG);
      this.m(dfe.qr);
      this.m(dfe.al);
      this.m(dfe.am);
      this.m(dfe.iP);
      this.a(cuk.hf);
      this.q(dfe.qX, dfe.ro);
      this.q(dfe.qY, dfe.rp);
      this.q(dfe.qZ, dfe.rq);
      this.q(dfe.ra, dfe.rr);
      this.q(dfe.rb, dfe.rs);
      this.q(dfe.rc, dfe.rt);
      this.q(dfe.rd, dfe.ru);
      this.q(dfe.re, dfe.rv);
      this.q(dfe.rf, dfe.rw);
      this.q(dfe.rg, dfe.rx);
      this.q(dfe.rh, dfe.ry);
      this.q(dfe.ri, dfe.rz);
      this.q(dfe.rj, dfe.rA);
      this.q(dfe.rk, dfe.rB);
      this.q(dfe.rl, dfe.rC);
      this.q(dfe.rm, dfe.rD);
      this.q(dfe.qW, dfe.rn);
      this.m(dfe.nY);
      this.m(dfe.hm);
      this.m(dfe.sa);
      this.m(dfe.tU);
      this.t(dfe.tV);
      this.t(dfe.tW);
      this.u(dfe.uG);
      this.u(dfe.uH);
      this.ag();
      this.g(dfe.tZ, dfe.tX);
      this.p(dfe.tY);
      this.a(dfe.iQ, cuk.iP);
      this.a(cuk.iP);
      this.aC();
      this.a(dfe.lL, cuk.kq);
      this.a(cuk.kq);
      this.f(dfe.cA, nz.a(dfe.ci, "_side"));
      this.a(dfe.az);
      this.a(dfe.aA);
      this.a(dfe.jv);
      this.a(dfe.di);
      this.a(dfe.dj);
      this.a(dfe.dk);
      this.a(dfe.gw);
      this.a(dfe.gx);
      this.a(dfe.gB);
      this.a(dfe.gC);
      this.a(dfe.at);
      this.a(dfe.aB);
      this.a(dfe.au);
      this.a(dfe.cS);
      this.a(dfe.av);
      this.a(dfe.aw);
      this.a(dfe.ax);
      this.a(dfe.ay);
      this.a(dfe.cT);
      this.b(dfe.qu, ob.d);
      this.a(dfe.qt);
      this.a(dfe.bz);
      this.a(dfe.bA);
      this.a(dfe.bB);
      this.a(dfe.bC);
      this.a(dfe.hV);
      this.a(dfe.ew);
      this.a(dfe.ex);
      this.a(dfe.tL);
      this.a(dfe.tM);
      this.a(dfe.tN);
      this.a(dfe.tO);
      this.a(dfe.tP);
      this.a(dfe.tQ);
      this.a(dfe.hU);
      this.a(dfe.qN);
      this.s(dfe.uS);
      this.B(dfe.bE);
      this.a(dfe.nU);
      this.a(dfe.eF);
      this.a(dfe.o);
      this.a(dfe.qv);
      this.a(dfe.gr);
      this.a(dfe.eQ);
      this.a(dfe.ar);
      this.a(dfe.qs);
      this.a(dfe.eC);
      this.b(dfe.eH, ob.g);
      this.b(dfe.qB, ob.d);
      this.b(dfe.fS, ob.d);
      this.m(dfe.aK);
      this.m(dfe.gT);
      this.a(dfe.lI);
      this.a(dfe.bI);
      this.a(dfe.jw);
      this.a(dfe.cZ);
      this.a(dfe.qV);
      this.a(dfe.jc);
      this.a(dfe.py);
      this.a(dfe.eK);
      this.a(dfe.eL);
      this.b(dfe.de, ob.b);
      this.a(dfe.bw);
      this.b(dfe.cg, ob.v);
      this.a(cuk.dZ);
      this.b(dfe.cV, ob.f);
      this.b(dfe.qo, ob.d);
      this.a(dfe.pp);
      this.a(dfe.bx);
      this.a(dfe.rE);
      this.a(dfe.rF);
      this.a(dfe.rY);
      this.a(dfe.tR);
      this.a(dfe.uD);
      this.a(dfe.uE);
      this.a(dfe.uF);
      this.e(dfe.sd);
      this.m(dfe.uR);
      this.a(dfe.L);
      this.a(dfe.M);
      this.a(dfe.N);
      this.a(dfe.O);
      this.a(dfe.P);
      this.aB();
      this.a(dfe.lr);
      this.a(dfe.sl);
      this.a(dfe.sm);
      this.a(dfe.sh);
      this.a(dfe.si);
      this.a(dfe.sj);
      this.a(dfe.sk);
      this.m(dfe.sh, dfe.sH);
      this.m(dfe.si, dfe.sJ);
      this.m(dfe.sj, dfe.sI);
      this.m(dfe.sk, dfe.sK);
      this.i(dfe.sX);
      this.i(dfe.sY);
      this.i(dfe.ta);
      this.i(dfe.sZ);
      this.a(dfe.sX, dfe.tb);
      this.a(dfe.sY, dfe.tc);
      this.a(dfe.ta, dfe.te);
      this.a(dfe.sZ, dfe.td);
      this.k(dfe.tf);
      this.k(dfe.tg);
      this.k(dfe.ti);
      this.k(dfe.th);
      this.b(dfe.tf, dfe.tj);
      this.b(dfe.tg, dfe.tk);
      this.b(dfe.ti, dfe.tm);
      this.b(dfe.th, dfe.tl);
      this.a(dfe.tn);
      this.a(dfe.to);
      this.a(dfe.tp);
      this.a(dfe.tq);
      this.m(dfe.tn, dfe.tr);
      this.m(dfe.to, dfe.ts);
      this.m(dfe.tp, dfe.tt);
      this.m(dfe.tq, dfe.tu);
      this.l(dfe.hQ, dfe.cS);
      this.l(dfe.hR, dfe.cT);
      this.G();
      this.r();
      this.av();
      this.v();
      this.w();
      this.a(dfe.ph, dfe.pf, dfe.pg);
      this.x();
      this.B();
      this.C();
      this.x(dfe.lo);
      this.y(dfe.lq);
      this.y(dfe.ls);
      this.F();
      this.E(dfe.hT);
      this.E(dfe.uV);
      this.E();
      this.F(dfe.ln);
      this.H();
      this.k(dfe.m, dfe.dn);
      this.k(dfe.n, dfe.do);
      this.I();
      this.J();
      this.M();
      this.N();
      this.O();
      this.K(dfe.lB);
      this.K(dfe.lC);
      this.q();
      this.P();
      this.Q();
      this.R();
      this.S();
      this.U();
      this.M(dfe.eS);
      this.M(dfe.eT);
      this.V();
      this.W();
      this.a(dfe.Q);
      this.X();
      this.Y();
      this.Z();
      this.af();
      this.ai();
      this.ah();
      this.aj();
      this.ak();
      this.y();
      this.al();
      this.b(dfe.K, dfe.K, dfe.K);
      this.am();
      this.an();
      this.ao();
      this.ap();
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.N(dfe.fX);
      this.N(dfe.fY);
      this.N(dfe.se);
      this.aw();
      this.aA();
      this.ac();
      this.ad();
      this.ae();
      this.T();
      this.L();
      this.K();
      this.aa();
      this.ab();
      this.L(dfe.dA);
      this.d(dfe.dA);
      this.L(dfe.oY);
      this.g();
      this.L(dfe.ub);
      this.n(dfe.da, dfe.db);
      this.n(dfe.eO, dfe.eP);
      this.a(dfe.dl, dfe.S, nz::c);
      this.a(dfe.oW, dfe.U, nz::d);
      this.j(dfe.pw, dfe.eJ);
      this.j(dfe.pn, dfe.eJ);
      this.j(dfe.l, dfe.n);
      this.w(dfe.bD);
      this.w(dfe.ic);
      this.D();
      this.J(dfe.pd);
      this.J(dfe.pe);
      this.e(dfe.fP, nw.a(dfe.fP));
      this.e(dfe.tJ, nw.a(dfe.tJ));
      this.a(dfe.eM, ob.d);
      this.a(dfe.eN, ob.d);
      this.a(dfe.uC);
      this.a(dfe.lK, ob.d);
      this.f(dfe.m);
      this.f(dfe.n);
      this.f(dfe.ue);
      this.f(dfe.an);
      this.f(dfe.ao);
      this.g(dfe.ap);
      this.g(dfe.as);
      this.f(dfe.aq);
      this.e(dfe.ak);
      this.b(dfe.uM, ob.f);
      this.a(dfe.jd, ob.d, ob.e);
      this.a(dfe.lu, ob.w, ob.x);
      this.a(dfe.hZ, ob.w, ob.x);
      this.a(dfe.uI, ob.d, ob.e);
      this.a(dfe.uJ, ob.d, ob.e);
      this.a(dfe.uK, ob.d, ob.e);
      this.c(dfe.oR, ob.i);
      this.z();
      this.A();
      this.a(dfe.qp, nz::A);
      this.a(dfe.qq, nz::C);
      this.a(dfe.lA, dts.as, 0, 1, 2, 3);
      this.a(dfe.hn, dts.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfe.gi, dts.as, 0, 1, 1, 2);
      this.a(dfe.ho, dts.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfe.dm, dts.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dfe.lx, ni.e.b, dts.aq, 0, 1);
      this.i();
      this.h();
      this.a(nw.a("decorated_pot"), dfe.ju).b(dfe.uN);
      this.a(nw.a("banner"), dfe.S)
         .a(ny.bJ, dfe.jD, dfe.jE, dfe.jF, dfe.jG, dfe.jH, dfe.jI, dfe.jJ, dfe.jK, dfe.jL, dfe.jM, dfe.jN, dfe.jO, dfe.jP, dfe.jQ, dfe.jR, dfe.jS)
         .b(dfe.jT, dfe.jU, dfe.jV, dfe.jW, dfe.jX, dfe.jY, dfe.jZ, dfe.ka, dfe.kb, dfe.kc, dfe.kd, dfe.ke, dfe.kf, dfe.kg, dfe.kh, dfe.ki);
      this.a(nw.a("bed"), dfe.S)
         .b(dfe.bJ, dfe.bK, dfe.bL, dfe.bM, dfe.bN, dfe.bO, dfe.bP, dfe.bQ, dfe.bR, dfe.bS, dfe.bT, dfe.bU, dfe.bV, dfe.bW, dfe.bX, dfe.bY);
      this.o(dfe.bJ, dfe.ck);
      this.o(dfe.bK, dfe.cl);
      this.o(dfe.bL, dfe.cm);
      this.o(dfe.bM, dfe.cn);
      this.o(dfe.bN, dfe.co);
      this.o(dfe.bO, dfe.cp);
      this.o(dfe.bP, dfe.cq);
      this.o(dfe.bQ, dfe.cr);
      this.o(dfe.bR, dfe.cs);
      this.o(dfe.bS, dfe.ct);
      this.o(dfe.bT, dfe.cu);
      this.o(dfe.bU, dfe.cv);
      this.o(dfe.bV, dfe.cw);
      this.o(dfe.bW, dfe.cx);
      this.o(dfe.bX, dfe.cy);
      this.o(dfe.bY, dfe.cz);
      this.a(nw.a("skull"), dfe.eK)
         .a(ny.bK, dfe.hG, dfe.hE, dfe.hC, dfe.hy, dfe.hA, dfe.hK)
         .a(dfe.hI)
         .b(dfe.hH, dfe.hJ, dfe.hF, dfe.hD, dfe.hz, dfe.hB, dfe.hL);
      this.O(dfe.lN);
      this.O(dfe.lO);
      this.O(dfe.lP);
      this.O(dfe.lQ);
      this.O(dfe.lR);
      this.O(dfe.lS);
      this.O(dfe.lT);
      this.O(dfe.lU);
      this.O(dfe.lV);
      this.O(dfe.lW);
      this.O(dfe.lX);
      this.O(dfe.lY);
      this.O(dfe.lZ);
      this.O(dfe.ma);
      this.O(dfe.mb);
      this.O(dfe.mc);
      this.O(dfe.md);
      this.b(dfe.nV, ob.q);
      this.c(dfe.nV);
      this.a(nw.a("chest"), dfe.S).b(dfe.dg, dfe.hP);
      this.a(nw.a("ender_chest"), dfe.cZ).b(dfe.gy);
      this.f(dfe.gp, dfe.cZ).a(dfe.gp, dfe.lD);
      this.a(dfe.bu);
      this.a(dfe.bv);
      this.a(dfe.mu);
      this.a(dfe.mv);
      this.a(dfe.mw);
      this.a(dfe.mx);
      this.a(dfe.my);
      this.a(dfe.mz);
      this.a(dfe.mA);
      this.a(dfe.mB);
      this.a(dfe.mC);
      this.a(dfe.mD);
      this.a(dfe.mE);
      this.a(dfe.mF);
      this.a(dfe.mG);
      this.a(dfe.mH);
      this.a(dfe.mI);
      this.a(dfe.mJ);
      this.a(ob.a, dfe.mK, dfe.mL, dfe.mM, dfe.mN, dfe.mO, dfe.mP, dfe.mQ, dfe.mR, dfe.mS, dfe.mT, dfe.mU, dfe.mV, dfe.mW, dfe.mX, dfe.mY, dfe.mZ);
      this.a(dfe.ju);
      this.a(dfe.id);
      this.a(dfe.ie);
      this.a(dfe.if);
      this.a(dfe.ig);
      this.a(dfe.ih);
      this.a(dfe.ii);
      this.a(dfe.ij);
      this.a(dfe.ik);
      this.a(dfe.il);
      this.a(dfe.im);
      this.a(dfe.in);
      this.a(dfe.io);
      this.a(dfe.ip);
      this.a(dfe.iq);
      this.a(dfe.ir);
      this.a(dfe.is);
      this.a(dfe.rZ);
      this.h(dfe.by, dfe.fQ);
      this.h(dfe.fa, dfe.it);
      this.h(dfe.fb, dfe.iu);
      this.h(dfe.fc, dfe.iv);
      this.h(dfe.fd, dfe.iw);
      this.h(dfe.fe, dfe.ix);
      this.h(dfe.ff, dfe.iy);
      this.h(dfe.fg, dfe.iz);
      this.h(dfe.fh, dfe.iA);
      this.h(dfe.fi, dfe.iB);
      this.h(dfe.fj, dfe.iC);
      this.h(dfe.fk, dfe.iD);
      this.h(dfe.fl, dfe.iE);
      this.h(dfe.fm, dfe.iF);
      this.h(dfe.fn, dfe.iG);
      this.h(dfe.fo, dfe.iH);
      this.h(dfe.fp, dfe.iI);
      this.b(ob.o, dfe.me, dfe.mf, dfe.mg, dfe.mh, dfe.mi, dfe.mj, dfe.mk, dfe.ml, dfe.mm, dfe.mn, dfe.mo, dfe.mp, dfe.mq, dfe.mr, dfe.ms, dfe.mt);
      this.g(dfe.ck, dfe.je);
      this.g(dfe.cl, dfe.jf);
      this.g(dfe.cm, dfe.jg);
      this.g(dfe.cn, dfe.jh);
      this.g(dfe.co, dfe.ji);
      this.g(dfe.cp, dfe.jj);
      this.g(dfe.cq, dfe.jk);
      this.g(dfe.cr, dfe.jl);
      this.g(dfe.cs, dfe.jm);
      this.g(dfe.ct, dfe.jn);
      this.g(dfe.cu, dfe.jo);
      this.g(dfe.cv, dfe.jp);
      this.g(dfe.cw, dfe.jq);
      this.g(dfe.cx, dfe.jr);
      this.g(dfe.cy, dfe.js);
      this.g(dfe.cz, dfe.jt);
      this.a(dfe.uf);
      this.a(dfe.fD);
      this.a(dfe.ce, dfe.gU, ni.e.a);
      this.a(dfe.cB, dfe.gV, ni.e.b);
      this.a(dfe.cD, dfe.gW, ni.e.b);
      this.a(dfe.cE, dfe.gX, ni.e.b);
      this.a(dfe.cF, dfe.gY, ni.e.b);
      this.a(dfe.cG, dfe.gZ, ni.e.b);
      this.a(dfe.cH, dfe.ha, ni.e.b);
      this.a(dfe.cI, dfe.hb, ni.e.b);
      this.a(dfe.cJ, dfe.hc, ni.e.b);
      this.a(dfe.cK, dfe.hd, ni.e.b);
      this.a(dfe.cL, dfe.he, ni.e.b);
      this.a(dfe.cM, dfe.hf, ni.e.b);
      this.a(dfe.cO, dfe.hg, ni.e.b);
      this.a(dfe.cP, dfe.hh, ni.e.b);
      this.a(dfe.cN, dfe.hi, ni.e.b);
      this.a(dfe.cR, dfe.hj, ni.e.b);
      this.a(dfe.cQ, dfe.hk, ni.e.b);
      this.a(dfe.cf, dfe.hl, ni.e.b);
      this.a(dfe.cC, dfe.gL, ni.e.b);
      this.D(dfe.tE);
      this.D(dfe.tF);
      this.a(dfe.tK, ni.e.b);
      this.l(dfe.tG).b(dfe.tG);
      this.b(dfe.tI, ob.f);
      this.b(dfe.tH, ob.s);
      this.a(cuk.cH);
      this.v(dfe.fL);
      this.v(dfe.fM);
      this.v(dfe.fN);
      this.a(dfe.cd, ni.e.a);
      this.b(dfe.eG, ni.e.a);
      this.a(cuk.eR);
      this.b(dfe.na, dfe.nb, ni.e.b);
      this.a(cuk.eS);
      this.c(dfe.nb);
      this.b(dfe.ud, ni.e.b);
      this.c(dfe.ud);
      this.c(dfe.tT);
      this.b(dfe.pz, dfe.pA, ni.e.b);
      this.b(dfe.pB, dfe.pC, ni.e.b);
      this.a(dfe.pz, "_plant");
      this.c(dfe.pA);
      this.a(dfe.pB, "_plant");
      this.c(dfe.pC);
      this.a(dfe.nW, ni.e.a, nz.c(nz.a(dfe.nX, "_stage0")));
      this.m();
      this.a(dfe.cc, ni.e.b);
      this.c(dfe.jy, ni.e.b);
      this.c(dfe.jz, ni.e.b);
      this.c(dfe.jA, ni.e.b);
      this.c(dfe.jB, ni.e.a);
      this.c(dfe.jC, ni.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dfe.nu, dfe.np, dfe.nk, dfe.nf, dfe.nE, dfe.nz, dfe.nO, dfe.nJ);
      this.a(dfe.nv, dfe.nq, dfe.nl, dfe.ng, dfe.nF, dfe.nA, dfe.nP, dfe.nK);
      this.a(dfe.nw, dfe.nr, dfe.nm, dfe.nh, dfe.nG, dfe.nB, dfe.nQ, dfe.nL);
      this.a(dfe.nx, dfe.ns, dfe.nn, dfe.ni, dfe.nH, dfe.nC, dfe.nR, dfe.nM);
      this.a(dfe.ny, dfe.nt, dfe.no, dfe.nj, dfe.nI, dfe.nD, dfe.nS, dfe.nN);
      this.e(dfe.fW, dfe.fU);
      this.e(dfe.fV, dfe.fT);
      this.l(dfe.aJ).c(dfe.aJ).a(dfe.bd);
      this.l(dfe.aU).c(dfe.aU).a(dfe.bl);
      this.a(dfe.aU, dfe.dW, dfe.ef);
      this.b(dfe.bt, ob.s);
      this.l(dfe.aG).c(dfe.aG).a(dfe.ba);
      this.l(dfe.aQ).c(dfe.aQ).a(dfe.bi);
      this.a(dfe.aQ, dfe.dP, dfe.eb);
      this.a(dfe.ag, dfe.gQ, ni.e.b);
      this.b(dfe.bq, ob.s);
      this.l(dfe.aH).d(dfe.aH).a(dfe.bb);
      this.l(dfe.aR).d(dfe.aR).a(dfe.bj);
      this.a(dfe.aR, dfe.dQ, dfe.ec);
      this.a(dfe.ah, dfe.gR, ni.e.b);
      this.b(dfe.br, ob.s);
      this.l(dfe.aE).c(dfe.aE).a(dfe.aY);
      this.l(dfe.aO).c(dfe.aO).a(dfe.bg);
      this.a(dfe.aO, dfe.dO, dfe.ea);
      this.a(dfe.ae, dfe.gO, ni.e.b);
      this.b(dfe.bo, ob.s);
      this.l(dfe.aC).c(dfe.aC).a(dfe.aW);
      this.l(dfe.aT).c(dfe.aT).a(dfe.be);
      this.a(dfe.aT, dfe.dM, dfe.dY);
      this.a(dfe.ac, dfe.gM, ni.e.b);
      this.b(dfe.bm, ob.s);
      this.l(dfe.aD).c(dfe.aD).a(dfe.aX);
      this.l(dfe.aN).c(dfe.aN).a(dfe.bf);
      this.a(dfe.aN, dfe.dN, dfe.dZ);
      this.a(dfe.ad, dfe.gN, ni.e.b);
      this.b(dfe.bn, ob.s);
      this.l(dfe.aI).c(dfe.aI).a(dfe.bc);
      this.l(dfe.aS).c(dfe.aS).a(dfe.bk);
      this.a(dfe.aS, dfe.dS, dfe.ee);
      this.a(dfe.ai, dfe.gS, ni.e.b);
      this.b(dfe.bs, ob.s);
      this.l(dfe.aF).c(dfe.aF).a(dfe.aZ);
      this.l(dfe.aP).c(dfe.aP).a(dfe.bh);
      this.a(dfe.aP, dfe.dR, dfe.ed);
      this.a(dfe.af, dfe.gP, ni.e.b);
      this.b(dfe.bp, ob.s);
      this.l(dfe.ps).b(dfe.ps).a(dfe.pu);
      this.l(dfe.pt).b(dfe.pt).a(dfe.pv);
      this.a(dfe.pt, dfe.dT, dfe.eg);
      this.a(dfe.px, dfe.qx, ni.e.b);
      this.p(dfe.pD, dfe.qz);
      this.l(dfe.pj).b(dfe.pj).a(dfe.pl);
      this.l(dfe.pk).b(dfe.pk).a(dfe.pm);
      this.a(dfe.pk, dfe.dU, dfe.eh);
      this.a(dfe.tG, dfe.dV, dfe.ei);
      this.a(dfe.po, dfe.qy, ni.e.b);
      this.p(dfe.pq, dfe.qA);
      this.l(dfe.aM).d(dfe.aM);
      this.l(dfe.aV).d(dfe.aV);
      this.a(dfe.aa, dfe.dX, dfe.ej);
      this.b(dfe.pr, ni.e.b);
      this.a(cuk.eO);
      this.i(dfe.em);
      this.k(dfe.iS);
      this.u();
      this.n(dfe.dB);
      this.o(dfe.bZ);
      this.o(dfe.ca);
      this.o(dfe.ib);
      this.t();
      this.q(dfe.gG);
      this.q(dfe.lE);
      this.q(dfe.lF);
      this.r(dfe.hM);
      this.r(dfe.hN);
      this.r(dfe.hO);
      this.o();
      this.p();
      this.d(dfe.dp, ob.h);
      this.d(dfe.oU, ob.h);
      this.d(dfe.oT, ob.i);
      this.d(dfe.up, ob.h);
      this.s();
      this.az();
      this.au();
      this.m(dfe.fC, dfe.fK);
      this.m(dfe.q, dfe.fG);
      this.m(dfe.fB, dfe.fJ);
      this.m(dfe.fA, dfe.fI);
      this.ax();
      this.m(dfe.fz, dfe.fH);
      this.ay();

      for (dfc $$0 : dfe.uT.values()) {
         this.a($$0);
      }

      this.a(dfe.uU);
      cvw.d().forEach($$0x -> this.a($$0x, nw.b("template_spawn_egg")));
   }

   private void aC() {
      this.c(dfe.iR);
      np.a<Integer> $$0 = np.a(dts.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akt $$3 = nz.a(cuk.iQ, $$2);
         $$0.a($$1, nr.a().a(ns.c, ny.aa.a(dfe.iR, $$2, nz.h($$3), this.c)));
         ny.bB.a(nw.a(cuk.iQ, $$2), nz.k($$3), this.c);
      }

      this.b.accept(no.a(dfe.iR).a($$0));
   }

   private void q(dfc $$0, dfc $$1) {
      this.a($$0.q());
      nz $$2 = nz.b(nz.H($$0));
      nz $$3 = nz.b(nz.a($$0, "_lit"));
      akt $$4 = ny.bL.a($$0, "_one_candle", $$2, this.c);
      akt $$5 = ny.bM.a($$0, "_two_candles", $$2, this.c);
      akt $$6 = ny.bN.a($$0, "_three_candles", $$2, this.c);
      akt $$7 = ny.bO.a($$0, "_four_candles", $$2, this.c);
      akt $$8 = ny.bL.a($$0, "_one_candle_lit", $$3, this.c);
      akt $$9 = ny.bM.a($$0, "_two_candles_lit", $$3, this.c);
      akt $$10 = ny.bN.a($$0, "_three_candles_lit", $$3, this.c);
      akt $$11 = ny.bO.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            no.a($$0)
               .a(
                  np.a(dts.az, dts.r)
                     .a(1, false, nr.a().a(ns.c, $$4))
                     .a(2, false, nr.a().a(ns.c, $$5))
                     .a(3, false, nr.a().a(ns.c, $$6))
                     .a(4, false, nr.a().a(ns.c, $$7))
                     .a(1, true, nr.a().a(ns.c, $$8))
                     .a(2, true, nr.a().a(ns.c, $$9))
                     .a(3, true, nr.a().a(ns.c, $$10))
                     .a(4, true, nr.a().a(ns.c, $$11))
               )
         );
      akt $$12 = ny.bP.a($$1, nz.a($$0, false), this.c);
      akt $$13 = ny.bP.a($$1, "_lit", nz.a($$0, true), this.c);
      this.b.accept(no.a($$1).a(a(dts.r, $$13, $$12)));
   }

   class a {
      private final akt b;

      public a(akt $$0, dfc $$1) {
         this.b = ny.aa.a($$0, nz.u($$1), ni.this.c);
      }

      public ni.a a(dfc... $$0) {
         for (dfc $$1 : $$0) {
            ni.this.b.accept(ni.c($$1, this.b));
         }

         return this;
      }

      public ni.a b(dfc... $$0) {
         for (dfc $$1 : $$0) {
            ni.this.c($$1);
         }

         return this.a($$0);
      }

      public ni.a a(nx $$0, dfc... $$1) {
         for (dfc $$2 : $$1) {
            $$0.a(nw.a($$2.q()), nz.u($$2), ni.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final nz b;
      private final Map<nx, akt> c = Maps.newHashMap();
      @Nullable
      private ll d;
      @Nullable
      private akt e;
      private final Set<dfc> f = new HashSet<>();

      public b(nz $$0) {
         this.b = $$0;
      }

      public ni.b a(dfc $$0, nx $$1) {
         this.e = $$1.a($$0, this.b, ni.this.c);
         if (ni.this.f.containsKey($$0)) {
            ni.this.b.accept(ni.this.f.get($$0).create($$0, this.e, this.b, ni.this.c));
         } else {
            ni.this.b.accept(ni.c($$0, this.e));
         }

         return this;
      }

      public ni.b a(dfc $$0, dfc $$1) {
         akt $$2 = nw.a($$0);
         ni.this.b.accept(ni.c($$1, $$2));
         ni.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public ni.b a(dfc $$0) {
         akt $$1 = ny.s.a($$0, this.b, ni.this.c);
         akt $$2 = ny.t.a($$0, this.b, ni.this.c);
         ni.this.b.accept(ni.b($$0, $$1, $$2));
         akt $$3 = ny.u.a($$0, this.b, ni.this.c);
         ni.this.a($$0, $$3);
         return this;
      }

      public ni.b b(dfc $$0) {
         akt $$1 = ny.M.a($$0, this.b, ni.this.c);
         akt $$2 = ny.N.a($$0, this.b, ni.this.c);
         akt $$3 = ny.O.a($$0, this.b, ni.this.c);
         ni.this.b.accept(ni.a($$0, $$1, $$2, $$3));
         akt $$4 = ny.P.a($$0, this.b, ni.this.c);
         ni.this.a($$0, $$4);
         return this;
      }

      public ni.b c(dfc $$0) {
         nz $$1 = nz.p($$0);
         akt $$2 = ny.D.a($$0, $$1, ni.this.c);
         akt $$3 = ny.E.a($$0, $$1, ni.this.c);
         akt $$4 = ny.F.a($$0, $$1, ni.this.c);
         akt $$5 = ny.G.a($$0, $$1, ni.this.c);
         akt $$6 = ny.H.a($$0, $$1, ni.this.c);
         ni.this.b.accept(ni.a($$0, $$2, $$3, $$4, $$5, $$6));
         akt $$7 = ny.I.a($$0, $$1, ni.this.c);
         ni.this.a($$0, $$7);
         return this;
      }

      public ni.b d(dfc $$0) {
         akt $$1 = ny.J.a($$0, this.b, ni.this.c);
         akt $$2 = ny.K.a($$0, this.b, ni.this.c);
         ni.this.b.accept(ni.c($$0, $$1, $$2));
         akt $$3 = ny.L.a($$0, this.b, ni.this.c);
         ni.this.a($$0, $$3);
         return this;
      }

      public ni.b e(dfc $$0) {
         nz $$1 = nz.p($$0);
         akt $$2 = ny.R.a($$0, $$1, ni.this.c);
         akt $$3 = ny.Q.a($$0, $$1, ni.this.c);
         akt $$4 = ny.T.a($$0, $$1, ni.this.c);
         akt $$5 = ny.S.a($$0, $$1, ni.this.c);
         ni.this.b.accept(ni.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ni.b f(dfc $$0) {
         akt $$1 = ny.V.a($$0, this.b, ni.this.c);
         akt $$2 = ny.U.a($$0, this.b, ni.this.c);
         akt $$3 = ny.X.a($$0, this.b, ni.this.c);
         akt $$4 = ny.W.a($$0, this.b, ni.this.c);
         ni.this.b.accept(ni.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ni.b g(dfc $$0) {
         akt $$1 = ny.Y.a($$0, this.b, ni.this.c);
         akt $$2 = ny.Z.a($$0, this.b, ni.this.c);
         ni.this.b.accept(ni.e($$0, $$1, $$2));
         return this;
      }

      public ni.b h(dfc $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dfc $$1 = this.d.b().get(ll.b.r);
            akt $$2 = ny.aa.a($$0, this.b, ni.this.c);
            ni.this.b.accept(ni.c($$0, $$2));
            ni.this.b.accept(ni.c($$1, $$2));
            ni.this.a($$0.q());
            ni.this.c($$1);
            return this;
         }
      }

      public ni.b i(dfc $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akt $$1 = this.a(ny.ab, $$0);
            akt $$2 = this.a(ny.ac, $$0);
            ni.this.b.accept(ni.e($$0, $$1, $$2, this.e));
            ni.this.a($$0, $$1);
            return this;
         }
      }

      public ni.b j(dfc $$0) {
         akt $$1 = this.a(ny.af, $$0);
         akt $$2 = this.a(ny.ae, $$0);
         akt $$3 = this.a(ny.ag, $$0);
         ni.this.b.accept(ni.b($$0, $$1, $$2, $$3));
         ni.this.a($$0, $$2);
         return this;
      }

      private ni.b k(dfc $$0) {
         ob $$1 = ni.this.g.getOrDefault($$0, ob.a.get($$0));
         akt $$2 = $$1.a($$0, ni.this.c);
         ni.this.b.accept(ni.c($$0, $$2));
         return this;
      }

      private ni.b l(dfc $$0) {
         ni.this.i($$0);
         return this;
      }

      private void m(dfc $$0) {
         if (ni.this.e.contains($$0)) {
            ni.this.k($$0);
         } else {
            ni.this.j($$0);
         }
      }

      private akt a(nx $$0, dfc $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ni.this.c));
      }

      public ni.b a(ll $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<ni.b, dfc> $$2 = ni.h.get($$0x);
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
      nl create(dfc var1, akt var2, nz var3, BiConsumer<akt, Supplier<JsonElement>> var4);
   }

   static record d(nx a, String b) {
   }

   static enum e {
      a,
      b;

      public nx a() {
         return this == a ? ny.ap : ny.ao;
      }

      public nx b() {
         return this == a ? ny.ar : ny.aq;
      }
   }

   class f {
      private final nz b;

      public f(nz $$0) {
         this.b = $$0;
      }

      public ni.f a(dfc $$0) {
         nz $$1 = this.b.c(oa.d, this.b.a(oa.i));
         akt $$2 = ny.j.a($$0, $$1, ni.this.c);
         ni.this.b.accept(ni.d($$0, $$2));
         return this;
      }

      public ni.f b(dfc $$0) {
         akt $$1 = ny.j.a($$0, this.b, ni.this.c);
         ni.this.b.accept(ni.d($$0, $$1));
         return this;
      }

      public ni.f c(dfc $$0) {
         akt $$1 = ny.j.a($$0, this.b, ni.this.c);
         akt $$2 = ny.k.a($$0, this.b, ni.this.c);
         ni.this.b.accept(ni.d($$0, $$1, $$2));
         return this;
      }

      public ni.f d(dfc $$0) {
         ni.this.b.accept(ni.a($$0, this.b, ni.this.c));
         return this;
      }
   }
}
