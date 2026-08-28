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

public class ob {
   final Consumer<of> b;
   final BiConsumer<alz, Supplier<JsonElement>> c;
   private final Consumer<cxl> d;
   final List<dkm> e = ImmutableList.of(dko.eL, dko.eR, dko.ip);
   final Map<dkm, ob.c> f = ImmutableMap.builder().put(dko.b, ob::a).put(dko.te, ob::c).put(dko.fa, ob::b).build();
   final Map<dkm, ov> g = ImmutableMap.builder()
      .put(dko.bc, ov.z.get(dko.bc))
      .put(dko.jG, ov.z.get(dko.jG))
      .put(dko.kk, ov.a(ot.a(dko.bc, "_top")))
      .put(dko.km, ov.a(ot.a(dko.jG, "_top")))
      .put(dko.be, ov.d.get(dko.bc).a($$0x -> $$0x.a(ou.i, ot.H(dko.be))))
      .put(dko.jI, ov.d.get(dko.jG).a($$0x -> $$0x.a(ou.i, ot.H(dko.jI))))
      .put(dko.ht, ov.d.get(dko.ht))
      .put(dko.kl, ov.a(ot.a(dko.ht, "_bottom")))
      .put(dko.pM, ov.A.get(dko.pM))
      .put(dko.te, ov.A.get(dko.te))
      .put(dko.hu, ov.d.get(dko.hu).a($$0x -> $$0x.a(ou.i, ot.H(dko.hu))))
      .put(dko.bd, ov.d.get(dko.bd).a($$0x -> {
         $$0x.a(ou.d, ot.a(dko.bc, "_top"));
         $$0x.a(ou.i, ot.H(dko.bd));
      }))
      .put(dko.jH, ov.d.get(dko.jH).a($$0x -> {
         $$0x.a(ou.d, ot.a(dko.jG, "_top"));
         $$0x.a(ou.i, ot.H(dko.jH));
      }))
      .put(dko.rh, ov.A.get(dko.rh))
      .put(dko.rc, ov.A.get(dko.rc))
      .build();
   static final Map<me.b, BiConsumer<ob.b, dkm>> h = ImmutableMap.builder()
      .put(me.b.a, ob.b::a)
      .put(me.b.e, ob.b::l)
      .put(me.b.b, ob.b::k)
      .put(me.b.c, ob.b::k)
      .put(me.b.f, ob.b::c)
      .put(me.b.g, ob.b::d)
      .put(me.b.h, ob.b::e)
      .put(me.b.i, ob.b::f)
      .put(me.b.k, ob.b::h)
      .put(me.b.l, ob.b::i)
      .put(me.b.m, ob.b::j)
      .put(me.b.n, ob.b::g)
      .put(me.b.p, ob.b::m)
      .put(me.b.q, ob.b::b)
      .build();
   public static final List<Pair<jm, Function<alz, ol>>> a = List.of(
      Pair.of(jm.c, (Function<alz, ol>)$$0 -> ol.a().a(om.c, $$0)),
      Pair.of(jm.f, (Function<alz, ol>)$$0 -> ol.a().a(om.c, $$0).a(om.b, om.a.b).a(om.d, true)),
      Pair.of(jm.d, (Function<alz, ol>)$$0 -> ol.a().a(om.c, $$0).a(om.b, om.a.c).a(om.d, true)),
      Pair.of(jm.e, (Function<alz, ol>)$$0 -> ol.a().a(om.c, $$0).a(om.b, om.a.d).a(om.d, true)),
      Pair.of(jm.b, (Function<alz, ol>)$$0 -> ol.a().a(om.c, $$0).a(om.a, om.a.d).a(om.d, true)),
      Pair.of(jm.a, (Function<alz, ol>)$$0 -> ol.a().a(om.c, $$0).a(om.a, om.a.b).a(om.d, true))
   );
   private static final Map<ob.d, alz> i = new HashMap<>();

   private static of a(dkm $$0, alz $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      alz $$4 = os.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static of b(dkm $$0, alz $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      alz $$4 = os.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static of c(dkm $$0, alz $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      alz $$4 = os.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ob(Consumer<of> $$0, BiConsumer<alz, Supplier<JsonElement>> $$1, Consumer<cxl> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dkm $$0) {
      this.d.accept($$0.j());
   }

   void a(dkm $$0, alz $$1) {
      this.c.accept(oq.a($$0.j()), new op($$1));
   }

   private void a(cxl $$0, alz $$1) {
      this.c.accept(oq.a($$0), new op($$1));
   }

   void a(cxl $$0) {
      os.bC.a(oq.a($$0), ot.b($$0), this.c);
   }

   private void d(dkm $$0) {
      cxl $$1 = $$0.j();
      if ($$1 != cxt.a) {
         os.bC.a(oq.a($$1), ot.G($$0), this.c);
      }
   }

   private void a(dkm $$0, String $$1) {
      cxl $$2 = $$0.j();
      os.bC.a(oq.a($$2), ot.k(ot.a($$0, $$1)), this.c);
   }

   private static oj b() {
      return oj.a(dyl.S).a(jm.f, ol.a().a(om.b, om.a.b)).a(jm.d, ol.a().a(om.b, om.a.c)).a(jm.e, ol.a().a(om.b, om.a.d)).a(jm.c, ol.a());
   }

   private static oj c() {
      return oj.a(dyl.S).a(jm.d, ol.a()).a(jm.e, ol.a().a(om.b, om.a.b)).a(jm.c, ol.a().a(om.b, om.a.c)).a(jm.f, ol.a().a(om.b, om.a.d));
   }

   private static oj d() {
      return oj.a(dyl.S).a(jm.f, ol.a()).a(jm.d, ol.a().a(om.b, om.a.b)).a(jm.e, ol.a().a(om.b, om.a.c)).a(jm.c, ol.a().a(om.b, om.a.d));
   }

   private static oj e() {
      return oj.a(dyl.Q)
         .a(jm.a, ol.a().a(om.a, om.a.b))
         .a(jm.b, ol.a().a(om.a, om.a.d))
         .a(jm.c, ol.a())
         .a(jm.d, ol.a().a(om.b, om.a.c))
         .a(jm.e, ol.a().a(om.b, om.a.d))
         .a(jm.f, ol.a().a(om.b, om.a.b));
   }

   private static oi b(dkm $$0, alz $$1) {
      return oi.a($$0, a($$1));
   }

   private static ol[] a(alz $$0) {
      return new ol[]{ol.a().a(om.c, $$0), ol.a().a(om.c, $$0).a(om.b, om.a.b), ol.a().a(om.c, $$0).a(om.b, om.a.c), ol.a().a(om.c, $$0).a(om.b, om.a.d)};
   }

   private static oi a(dkm $$0, alz $$1, alz $$2) {
      return oi.a($$0, ol.a().a(om.c, $$1), ol.a().a(om.c, $$2), ol.a().a(om.c, $$1).a(om.b, om.a.c), ol.a().a(om.c, $$2).a(om.b, om.a.c));
   }

   private static oj a(dym $$0, alz $$1, alz $$2) {
      return oj.a($$0).a(true, ol.a().a(om.c, $$1)).a(false, ol.a().a(om.c, $$2));
   }

   private void e(dkm $$0) {
      alz $$1 = ov.a.create($$0, this.c);
      alz $$2 = ov.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dkm $$0) {
      alz $$1 = ov.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dkm $$0) {
      this.b.accept(oi.a($$0).a(oj.a(dyl.bw).a($$1 -> {
         String $$2 = "_" + $$1;
         alz $$3 = ot.a($$0, $$2);
         return ol.a().a(om.c, os.c.a($$0, $$2, new ot().a(ou.a, $$3), this.c));
      })));
      this.a($$0, ot.a($$0, "_0"));
   }

   static of b(dkm $$0, alz $$1, alz $$2) {
      return oi.a($$0)
         .a(oj.a(dyl.x).a(false, ol.a().a(om.c, $$1)).a(true, ol.a().a(om.c, $$2)))
         .a(
            oj.a(dyl.V, dyl.S)
               .a(dyg.a, jm.f, ol.a().a(om.b, om.a.b))
               .a(dyg.a, jm.e, ol.a().a(om.b, om.a.d))
               .a(dyg.a, jm.d, ol.a().a(om.b, om.a.c))
               .a(dyg.a, jm.c, ol.a())
               .a(dyg.b, jm.f, ol.a().a(om.b, om.a.b).a(om.a, om.a.b).a(om.d, true))
               .a(dyg.b, jm.e, ol.a().a(om.b, om.a.d).a(om.a, om.a.b).a(om.d, true))
               .a(dyg.b, jm.d, ol.a().a(om.b, om.a.c).a(om.a, om.a.b).a(om.d, true))
               .a(dyg.b, jm.c, ol.a().a(om.a, om.a.b).a(om.d, true))
               .a(dyg.c, jm.f, ol.a().a(om.b, om.a.d).a(om.a, om.a.c))
               .a(dyg.c, jm.e, ol.a().a(om.b, om.a.b).a(om.a, om.a.c))
               .a(dyg.c, jm.d, ol.a().a(om.a, om.a.c))
               .a(dyg.c, jm.c, ol.a().a(om.b, om.a.c).a(om.a, om.a.c))
         );
   }

   private static oj.d<jm, dyq, dyp, Boolean> a(oj.d<jm, dyq, dyp, Boolean> $$0, dyq $$1, alz $$2, alz $$3, alz $$4, alz $$5) {
      return $$0.a(jm.f, $$1, dyp.a, false, ol.a().a(om.c, $$2))
         .a(jm.d, $$1, dyp.a, false, ol.a().a(om.c, $$2).a(om.b, om.a.b))
         .a(jm.e, $$1, dyp.a, false, ol.a().a(om.c, $$2).a(om.b, om.a.c))
         .a(jm.c, $$1, dyp.a, false, ol.a().a(om.c, $$2).a(om.b, om.a.d))
         .a(jm.f, $$1, dyp.b, false, ol.a().a(om.c, $$4))
         .a(jm.d, $$1, dyp.b, false, ol.a().a(om.c, $$4).a(om.b, om.a.b))
         .a(jm.e, $$1, dyp.b, false, ol.a().a(om.c, $$4).a(om.b, om.a.c))
         .a(jm.c, $$1, dyp.b, false, ol.a().a(om.c, $$4).a(om.b, om.a.d))
         .a(jm.f, $$1, dyp.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
         .a(jm.d, $$1, dyp.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
         .a(jm.e, $$1, dyp.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
         .a(jm.c, $$1, dyp.a, true, ol.a().a(om.c, $$3))
         .a(jm.f, $$1, dyp.b, true, ol.a().a(om.c, $$5).a(om.b, om.a.d))
         .a(jm.d, $$1, dyp.b, true, ol.a().a(om.c, $$5))
         .a(jm.e, $$1, dyp.b, true, ol.a().a(om.c, $$5).a(om.b, om.a.b))
         .a(jm.c, $$1, dyp.b, true, ol.a().a(om.c, $$5).a(om.b, om.a.c));
   }

   private static of a(dkm $$0, alz $$1, alz $$2, alz $$3, alz $$4, alz $$5, alz $$6, alz $$7, alz $$8) {
      return oi.a($$0).a(a(a(oj.a(dyl.S, dyl.af, dyl.bf, dyl.v), dyq.b, $$1, $$2, $$3, $$4), dyq.a, $$5, $$6, $$7, $$8));
   }

   static of a(dkm $$0, alz $$1, alz $$2, alz $$3, alz $$4, alz $$5) {
      return oh.a($$0)
         .a(ol.a().a(om.c, $$1))
         .a(og.a().a(dyl.M, true), ol.a().a(om.c, $$2).a(om.d, false))
         .a(og.a().a(dyl.N, true), ol.a().a(om.c, $$3).a(om.d, false))
         .a(og.a().a(dyl.O, true), ol.a().a(om.c, $$4).a(om.d, false))
         .a(og.a().a(dyl.P, true), ol.a().a(om.c, $$5).a(om.d, false));
   }

   static of c(dkm $$0, alz $$1, alz $$2) {
      return oh.a($$0)
         .a(ol.a().a(om.c, $$1))
         .a(og.a().a(dyl.M, true), ol.a().a(om.c, $$2).a(om.d, true))
         .a(og.a().a(dyl.N, true), ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true))
         .a(og.a().a(dyl.O, true), ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true))
         .a(og.a().a(dyl.P, true), ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true));
   }

   static of a(dkm $$0, alz $$1, alz $$2, alz $$3) {
      return oh.a($$0)
         .a(og.a().a(dyl.K, true), ol.a().a(om.c, $$1))
         .a(og.a().a(dyl.Y, dzg.b), ol.a().a(om.c, $$2).a(om.d, true))
         .a(og.a().a(dyl.X, dzg.b), ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true))
         .a(og.a().a(dyl.Z, dzg.b), ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true))
         .a(og.a().a(dyl.aa, dzg.b), ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true))
         .a(og.a().a(dyl.Y, dzg.c), ol.a().a(om.c, $$3).a(om.d, true))
         .a(og.a().a(dyl.X, dzg.c), ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true))
         .a(og.a().a(dyl.Z, dzg.c), ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true))
         .a(og.a().a(dyl.aa, dzg.c), ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true));
   }

   static of a(dkm $$0, alz $$1, alz $$2, alz $$3, alz $$4, boolean $$5) {
      return oi.a($$0, ol.a().a(om.d, $$5))
         .a(c())
         .a(
            oj.a(dyl.q, dyl.v)
               .a(false, false, ol.a().a(om.c, $$2))
               .a(true, false, ol.a().a(om.c, $$4))
               .a(false, true, ol.a().a(om.c, $$1))
               .a(true, true, ol.a().a(om.c, $$3))
         );
   }

   static of b(dkm $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0)
         .a(
            oj.a(dyl.S, dyl.ag, dyl.bj)
               .a(jm.f, dyt.b, dzd.a, ol.a().a(om.c, $$2))
               .a(jm.e, dyt.b, dzd.a, ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyt.b, dzd.a, ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyt.b, dzd.a, ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyt.b, dzd.e, ol.a().a(om.c, $$3))
               .a(jm.e, dyt.b, dzd.e, ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyt.b, dzd.e, ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyt.b, dzd.e, ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyt.b, dzd.d, ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true))
               .a(jm.e, dyt.b, dzd.d, ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true))
               .a(jm.d, dyt.b, dzd.d, ol.a().a(om.c, $$3))
               .a(jm.c, dyt.b, dzd.d, ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true))
               .a(jm.f, dyt.b, dzd.c, ol.a().a(om.c, $$1))
               .a(jm.e, dyt.b, dzd.c, ol.a().a(om.c, $$1).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyt.b, dzd.c, ol.a().a(om.c, $$1).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyt.b, dzd.c, ol.a().a(om.c, $$1).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyt.b, dzd.b, ol.a().a(om.c, $$1).a(om.b, om.a.d).a(om.d, true))
               .a(jm.e, dyt.b, dzd.b, ol.a().a(om.c, $$1).a(om.b, om.a.b).a(om.d, true))
               .a(jm.d, dyt.b, dzd.b, ol.a().a(om.c, $$1))
               .a(jm.c, dyt.b, dzd.b, ol.a().a(om.c, $$1).a(om.b, om.a.c).a(om.d, true))
               .a(jm.f, dyt.a, dzd.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.d, true))
               .a(jm.e, dyt.a, dzd.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyt.a, dzd.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyt.a, dzd.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyt.a, dzd.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.e, dyt.a, dzd.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.d, dyt.a, dzd.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.c, dyt.a, dzd.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.d, true))
               .a(jm.f, dyt.a, dzd.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.d, true))
               .a(jm.e, dyt.a, dzd.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyt.a, dzd.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyt.a, dzd.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyt.a, dzd.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.e, dyt.a, dzd.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.d, dyt.a, dzd.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.c, dyt.a, dzd.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.d, true))
               .a(jm.f, dyt.a, dzd.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.d, true))
               .a(jm.e, dyt.a, dzd.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyt.a, dzd.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyt.a, dzd.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
         );
   }

   private static of c(dkm $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0)
         .a(
            oj.a(dyl.S, dyl.ag, dyl.v)
               .a(jm.c, dyt.b, false, ol.a().a(om.c, $$2))
               .a(jm.d, dyt.b, false, ol.a().a(om.c, $$2).a(om.b, om.a.c))
               .a(jm.f, dyt.b, false, ol.a().a(om.c, $$2).a(om.b, om.a.b))
               .a(jm.e, dyt.b, false, ol.a().a(om.c, $$2).a(om.b, om.a.d))
               .a(jm.c, dyt.a, false, ol.a().a(om.c, $$1))
               .a(jm.d, dyt.a, false, ol.a().a(om.c, $$1).a(om.b, om.a.c))
               .a(jm.f, dyt.a, false, ol.a().a(om.c, $$1).a(om.b, om.a.b))
               .a(jm.e, dyt.a, false, ol.a().a(om.c, $$1).a(om.b, om.a.d))
               .a(jm.c, dyt.b, true, ol.a().a(om.c, $$3))
               .a(jm.d, dyt.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(jm.f, dyt.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(jm.e, dyt.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
               .a(jm.c, dyt.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.c))
               .a(jm.d, dyt.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.a))
               .a(jm.f, dyt.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.d))
               .a(jm.e, dyt.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.b))
         );
   }

   private static of d(dkm $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0)
         .a(
            oj.a(dyl.S, dyl.ag, dyl.v)
               .a(jm.c, dyt.b, false, ol.a().a(om.c, $$2))
               .a(jm.d, dyt.b, false, ol.a().a(om.c, $$2))
               .a(jm.f, dyt.b, false, ol.a().a(om.c, $$2))
               .a(jm.e, dyt.b, false, ol.a().a(om.c, $$2))
               .a(jm.c, dyt.a, false, ol.a().a(om.c, $$1))
               .a(jm.d, dyt.a, false, ol.a().a(om.c, $$1))
               .a(jm.f, dyt.a, false, ol.a().a(om.c, $$1))
               .a(jm.e, dyt.a, false, ol.a().a(om.c, $$1))
               .a(jm.c, dyt.b, true, ol.a().a(om.c, $$3))
               .a(jm.d, dyt.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(jm.f, dyt.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(jm.e, dyt.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
               .a(jm.c, dyt.a, true, ol.a().a(om.c, $$3))
               .a(jm.d, dyt.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(jm.f, dyt.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(jm.e, dyt.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
         );
   }

   static oi c(dkm $$0, alz $$1) {
      return oi.a($$0, ol.a().a(om.c, $$1));
   }

   private static oj f() {
      return oj.a(dyl.J).a(jm.a.b, ol.a()).a(jm.a.c, ol.a().a(om.a, om.a.b)).a(jm.a.a, ol.a().a(om.a, om.a.b).a(om.b, om.a.b));
   }

   static of a(dkm $$0, ot $$1, BiConsumer<alz, Supplier<JsonElement>> $$2) {
      alz $$3 = os.g.a($$0, $$1, $$2);
      alz $$4 = os.h.a($$0, $$1, $$2);
      alz $$5 = os.i.a($$0, $$1, $$2);
      alz $$6 = os.j.a($$0, $$1, $$2);
      return oi.a($$0, ol.a().a(om.c, $$6)).a(oj.a(dyl.J).a(jm.a.a, ol.a().a(om.c, $$3)).a(jm.a.b, ol.a().a(om.c, $$4)).a(jm.a.c, ol.a().a(om.c, $$5)));
   }

   static of d(dkm $$0, alz $$1) {
      return oi.a($$0, ol.a().a(om.c, $$1)).a(f());
   }

   private void e(dkm $$0, alz $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dkm $$0, ov.a $$1) {
      alz $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dkm $$0, ov.a $$1) {
      alz $$2 = $$1.create($$0, this.c);
      this.b.accept(oi.a($$0, ol.a().a(om.c, $$2)).a(b()));
   }

   static of d(dkm $$0, alz $$1, alz $$2) {
      return oi.a($$0)
         .a(
            oj.a(dyl.J)
               .a(jm.a.b, ol.a().a(om.c, $$1))
               .a(jm.a.c, ol.a().a(om.c, $$2).a(om.a, om.a.b))
               .a(jm.a.a, ol.a().a(om.c, $$2).a(om.a, om.a.b).a(om.b, om.a.b))
         );
   }

   private void a(dkm $$0, ov.a $$1, ov.a $$2) {
      alz $$3 = $$1.create($$0, this.c);
      alz $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void h(dkm $$0) {
      Function<ov.a, alz> $$1 = $$1x -> $$1x.updateTexture($$1xx -> $$1xx.a(ou.i, ot.a($$0, "_active")))
            .updateTexture($$1xx -> $$1xx.a(ou.d, ot.a($$0, "_top_active")))
            .createWithSuffix($$0, "_active", this.c);
      alz $$2 = ov.x.create($$0, this.c);
      alz $$3 = ov.y.create($$0, this.c);
      alz $$4 = $$1.apply(ov.x);
      alz $$5 = $$1.apply(ov.y);
      this.b
         .accept(
            oi.a($$0)
               .a(
                  oj.a(dyl.J, dmi.c)
                     .a(jm.a.b, dmi.a.a, ol.a().a(om.c, $$2))
                     .a(jm.a.c, dmi.a.a, ol.a().a(om.c, $$3).a(om.a, om.a.b))
                     .a(jm.a.a, dmi.a.a, ol.a().a(om.c, $$3).a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(jm.a.b, dmi.a.b, ol.a().a(om.c, $$4))
                     .a(jm.a.c, dmi.a.b, ol.a().a(om.c, $$5).a(om.a, om.a.b))
                     .a(jm.a.a, dmi.a.b, ol.a().a(om.c, $$5).a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(jm.a.b, dmi.a.c, ol.a().a(om.c, $$4))
                     .a(jm.a.c, dmi.a.c, ol.a().a(om.c, $$5).a(om.a, om.a.b))
                     .a(jm.a.a, dmi.a.c, ol.a().a(om.c, $$5).a(om.a, om.a.b).a(om.b, om.a.b))
               )
         );
   }

   private alz a(dkm $$0, String $$1, or $$2, Function<alz, ot> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ot.a($$0, $$1)), this.c);
   }

   static of e(dkm $$0, alz $$1, alz $$2) {
      return oi.a($$0).a(a(dyl.x, $$2, $$1));
   }

   static of e(dkm $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0).a(oj.a(dyl.bi).a(dzc.b, ol.a().a(om.c, $$1)).a(dzc.a, ol.a().a(om.c, $$2)).a(dzc.c, ol.a().a(om.c, $$3)));
   }

   public void a(dkm $$0) {
      this.b($$0, ov.a);
   }

   public void b(dkm $$0, ov.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dkm $$0, ot $$1, or $$2) {
      alz $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ob.b i(dkm $$0) {
      ov $$1 = this.g.getOrDefault($$0, ov.a.get($$0));
      return new ob.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dkm $$0, dkm $$1, dkm $$2) {
      ot $$3 = ot.v($$0);
      alz $$4 = os.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void j(dkm $$0) {
      ot $$1 = ot.u($$0);
      alz $$2 = os.v.a($$0, $$1, this.c);
      alz $$3 = os.w.a($$0, $$1, this.c);
      alz $$4 = os.x.a($$0, $$1, this.c);
      alz $$5 = os.y.a($$0, $$1, this.c);
      alz $$6 = os.z.a($$0, $$1, this.c);
      alz $$7 = os.A.a($$0, $$1, this.c);
      alz $$8 = os.B.a($$0, $$1, this.c);
      alz $$9 = os.C.a($$0, $$1, this.c);
      this.a($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dkm $$0, dkm $$1) {
      alz $$2 = os.v.a($$0);
      alz $$3 = os.w.a($$0);
      alz $$4 = os.x.a($$0);
      alz $$5 = os.y.a($$0);
      alz $$6 = os.z.a($$0);
      alz $$7 = os.A.a($$0);
      alz $$8 = os.B.a($$0);
      alz $$9 = os.C.a($$0);
      this.a($$1, oq.a($$0.j()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dkm $$0) {
      ot $$1 = ot.b($$0);
      alz $$2 = os.ak.a($$0, $$1, this.c);
      alz $$3 = os.al.a($$0, $$1, this.c);
      alz $$4 = os.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(dkm $$0) {
      ot $$1 = ot.b($$0);
      alz $$2 = os.ah.a($$0, $$1, this.c);
      alz $$3 = os.ai.a($$0, $$1, this.c);
      alz $$4 = os.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dkm $$0, dkm $$1) {
      alz $$2 = os.ah.a($$0);
      alz $$3 = os.ai.a($$0);
      alz $$4 = os.aj.a($$0);
      this.a($$1, oq.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dko.sY);
      alz $$0 = oq.a(dko.sY);
      alz $$1 = oq.a(dko.sY, "_partial_tilt");
      alz $$2 = oq.a(dko.sY, "_full_tilt");
      this.b
         .accept(
            oi.a(dko.sY)
               .a(b())
               .a(oj.a(dyl.bm).a(dzf.a, ol.a().a(om.c, $$0)).a(dzf.b, ol.a().a(om.c, $$0)).a(dzf.c, ol.a().a(om.c, $$1)).a(dzf.d, ol.a().a(om.c, $$2)))
         );
   }

   private ob.f m(dkm $$0) {
      return new ob.f(ot.o($$0));
   }

   private void n(dkm $$0) {
      this.c($$0, $$0);
   }

   private void c(dkm $$0, dkm $$1) {
      this.b.accept(c($$0, oq.a($$1)));
   }

   private void a(dkm $$0, ob.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dkm $$0, ob.e $$1, ot $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dkm $$0, ob.e $$1) {
      ot $$2 = ot.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dkm $$0, ob.e $$1, ot $$2) {
      alz $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dkm $$0, ob.e $$1, dyx<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         oj $$4 = oj.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            ot $$5 = ot.c(ot.a($$0, $$4x));
            alz $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return ol.a().a(om.c, $$6);
         });
         this.a($$0.j());
         this.b.accept(oi.a($$0).a($$4));
      }
   }

   private void a(dkm $$0, dkm $$1, ob.e $$2) {
      this.a($$0, $$2);
      ot $$3 = ot.e($$0);
      alz $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dkm $$0, dkm $$1) {
      ov $$2 = ov.q.get($$0);
      alz $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alz $$4 = os.aD.a($$1, $$2.b(), this.c);
      this.b.accept(oi.a($$1, ol.a().a(om.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dkm $$0, dkm $$1) {
      this.a($$0.j());
      ot $$2 = ot.i($$0);
      ot $$3 = ot.a($$0, $$1);
      alz $$4 = os.aV.a($$1, $$3, this.c);
      this.b
         .accept(
            oi.a($$1, ol.a().a(om.c, $$4))
               .a(oj.a(dyl.S).a(jm.e, ol.a()).a(jm.d, ol.a().a(om.b, om.a.d)).a(jm.c, ol.a().a(om.b, om.a.b)).a(jm.f, ol.a().a(om.b, om.a.c)))
         );
      this.b.accept(oi.a($$0).a(oj.a(dyl.aw).a($$2x -> ol.a().a(om.c, os.aU[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dkm $$0 = dko.kX;
      this.a($$0.j());
      alz $$1 = oq.a($$0, "_top");
      alz $$2 = oq.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dkm $$0 = dko.kW;
      this.a($$0.j());
      oj $$1 = oj.a(dqd.d, dyl.af).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> ol.a().a(om.c, oq.a($$0, "_top_stage_" + $$1x));
            case b -> ol.a().a(om.c, oq.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(oi.a($$0).a($$1));
   }

   private void a(dkm $$0, dkm $$1, dkm $$2, dkm $$3, dkm $$4, dkm $$5, dkm $$6, dkm $$7) {
      this.a($$0, ob.e.b);
      this.a($$1, ob.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dkm $$0, ob.e $$1) {
      this.a($$0, "_top");
      alz $$2 = this.a($$0, "_top", $$1.a(), ot::c);
      alz $$3 = this.a($$0, "_bottom", $$1.a(), ot::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dko.iU, "_front");
      alz $$0 = oq.a(dko.iU, "_top");
      alz $$1 = this.a(dko.iU, "_bottom", ob.e.b.a(), ot::c);
      this.f(dko.iU, $$0, $$1);
   }

   private void k() {
      alz $$0 = this.a(dko.bE, "_top", os.bp, ot::a);
      alz $$1 = this.a(dko.bE, "_bottom", os.bp, ot::a);
      this.f(dko.bE, $$0, $$1);
   }

   private void l() {
      this.c(dko.ta);
      alz $$0 = oq.a(dko.ta, "_top");
      alz $$1 = oq.a(dko.ta, "_bottom");
      this.b.accept(oi.a(dko.ta).a(b()).a(oj.a(dyl.af).a(dyq.b, ol.a().a(om.c, $$1)).a(dyq.a, ol.a().a(om.c, $$0))));
   }

   private void f(dkm $$0, alz $$1, alz $$2) {
      this.b.accept(oi.a($$0).a(oj.a(dyl.af).a(dyq.b, ol.a().a(om.c, $$2)).a(dyq.a, ol.a().a(om.c, $$1))));
   }

   private void o(dkm $$0) {
      ot $$1 = ot.f($$0);
      ot $$2 = ot.e(ot.a($$0, "_corner"));
      alz $$3 = os.as.a($$0, $$1, this.c);
      alz $$4 = os.at.a($$0, $$2, this.c);
      alz $$5 = os.au.a($$0, $$1, this.c);
      alz $$6 = os.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            oi.a($$0)
               .a(
                  oj.a(dyl.ah)
                     .a(dyy.a, ol.a().a(om.c, $$3))
                     .a(dyy.b, ol.a().a(om.c, $$3).a(om.b, om.a.b))
                     .a(dyy.c, ol.a().a(om.c, $$5).a(om.b, om.a.b))
                     .a(dyy.d, ol.a().a(om.c, $$6).a(om.b, om.a.b))
                     .a(dyy.e, ol.a().a(om.c, $$5))
                     .a(dyy.f, ol.a().a(om.c, $$6))
                     .a(dyy.g, ol.a().a(om.c, $$4))
                     .a(dyy.h, ol.a().a(om.c, $$4).a(om.b, om.a.b))
                     .a(dyy.i, ol.a().a(om.c, $$4).a(om.b, om.a.c))
                     .a(dyy.j, ol.a().a(om.c, $$4).a(om.b, om.a.d))
               )
         );
   }

   private void p(dkm $$0) {
      alz $$1 = this.a($$0, "", os.as, ot::e);
      alz $$2 = this.a($$0, "", os.au, ot::e);
      alz $$3 = this.a($$0, "", os.av, ot::e);
      alz $$4 = this.a($$0, "_on", os.as, ot::e);
      alz $$5 = this.a($$0, "_on", os.au, ot::e);
      alz $$6 = this.a($$0, "_on", os.av, ot::e);
      oj $$7 = oj.a(dyl.x, dyl.ai).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return ol.a().a(om.c, $$6x ? $$4 : $$1);
            case b:
               return ol.a().a(om.c, $$6x ? $$4 : $$1).a(om.b, om.a.b);
            case c:
               return ol.a().a(om.c, $$6x ? $$5 : $$2).a(om.b, om.a.b);
            case d:
               return ol.a().a(om.c, $$6x ? $$6 : $$3).a(om.b, om.a.b);
            case e:
               return ol.a().a(om.c, $$6x ? $$5 : $$2);
            case f:
               return ol.a().a(om.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(oi.a($$0).a($$7));
   }

   private ob.a a(alz $$0, dkm $$1) {
      return new ob.a($$0, $$1);
   }

   private ob.a f(dkm $$0, dkm $$1) {
      return new ob.a(oq.a($$0), $$1);
   }

   private void a(dkm $$0, cxl $$1) {
      alz $$2 = os.aa.a($$0, ot.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dkm $$0, alz $$1) {
      alz $$2 = os.aa.a($$0, ot.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dkm $$0, dkm $$1) {
      this.a($$0);
      alz $$2 = ov.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void q(dkm $$0) {
      this.a($$0.j());
      alz $$1 = ov.l.create($$0, this.c);
      alz $$2 = ov.m.create($$0, this.c);
      alz $$3 = ov.n.create($$0, this.c);
      alz $$4 = ov.o.create($$0, this.c);
      this.b
         .accept(
            oh.a($$0)
               .a(og.a().a(dyl.T, 1, 2, 3, 4).a(dyl.S, jm.c), ol.a().a(om.c, $$1))
               .a(og.a().a(dyl.T, 1, 2, 3, 4).a(dyl.S, jm.f), ol.a().a(om.c, $$1).a(om.b, om.a.b))
               .a(og.a().a(dyl.T, 1, 2, 3, 4).a(dyl.S, jm.d), ol.a().a(om.c, $$1).a(om.b, om.a.c))
               .a(og.a().a(dyl.T, 1, 2, 3, 4).a(dyl.S, jm.e), ol.a().a(om.c, $$1).a(om.b, om.a.d))
               .a(og.a().a(dyl.T, 2, 3, 4).a(dyl.S, jm.c), ol.a().a(om.c, $$2))
               .a(og.a().a(dyl.T, 2, 3, 4).a(dyl.S, jm.f), ol.a().a(om.c, $$2).a(om.b, om.a.b))
               .a(og.a().a(dyl.T, 2, 3, 4).a(dyl.S, jm.d), ol.a().a(om.c, $$2).a(om.b, om.a.c))
               .a(og.a().a(dyl.T, 2, 3, 4).a(dyl.S, jm.e), ol.a().a(om.c, $$2).a(om.b, om.a.d))
               .a(og.a().a(dyl.T, 3, 4).a(dyl.S, jm.c), ol.a().a(om.c, $$3))
               .a(og.a().a(dyl.T, 3, 4).a(dyl.S, jm.f), ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(og.a().a(dyl.T, 3, 4).a(dyl.S, jm.d), ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(og.a().a(dyl.T, 3, 4).a(dyl.S, jm.e), ol.a().a(om.c, $$3).a(om.b, om.a.d))
               .a(og.a().a(dyl.T, 4).a(dyl.S, jm.c), ol.a().a(om.c, $$4))
               .a(og.a().a(dyl.T, 4).a(dyl.S, jm.f), ol.a().a(om.c, $$4).a(om.b, om.a.b))
               .a(og.a().a(dyl.T, 4).a(dyl.S, jm.d), ol.a().a(om.c, $$4).a(om.b, om.a.c))
               .a(og.a().a(dyl.T, 4).a(dyl.S, jm.e), ol.a().a(om.c, $$4).a(om.b, om.a.d))
         );
   }

   private void a(ov.a $$0, dkm... $$1) {
      for (dkm $$2 : $$1) {
         alz $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ov.a $$0, dkm... $$1) {
      for (dkm $$2 : $$1) {
         alz $$3 = $$0.create($$2, this.c);
         this.b.accept(oi.a($$2, ol.a().a(om.c, $$3)).a(c()));
      }
   }

   private void h(dkm $$0, dkm $$1) {
      this.a($$0);
      ot $$2 = ot.b($$0, $$1);
      alz $$3 = os.aJ.a($$1, $$2, this.c);
      alz $$4 = os.aK.a($$1, $$2, this.c);
      alz $$5 = os.aL.a($$1, $$2, this.c);
      alz $$6 = os.aH.a($$1, $$2, this.c);
      alz $$7 = os.aI.a($$1, $$2, this.c);
      cxl $$8 = $$1.j();
      os.bC.a(oq.a($$8), ot.G($$0), this.c);
      this.b
         .accept(
            oh.a($$1)
               .a(ol.a().a(om.c, $$3))
               .a(og.a().a(dyl.M, true), ol.a().a(om.c, $$4))
               .a(og.a().a(dyl.N, true), ol.a().a(om.c, $$4).a(om.b, om.a.b))
               .a(og.a().a(dyl.O, true), ol.a().a(om.c, $$5))
               .a(og.a().a(dyl.P, true), ol.a().a(om.c, $$5).a(om.b, om.a.b))
               .a(og.a().a(dyl.M, false), ol.a().a(om.c, $$6))
               .a(og.a().a(dyl.N, false), ol.a().a(om.c, $$7))
               .a(og.a().a(dyl.O, false), ol.a().a(om.c, $$7).a(om.b, om.a.b))
               .a(og.a().a(dyl.P, false), ol.a().a(om.c, $$6).a(om.b, om.a.d))
         );
   }

   private void r(dkm $$0) {
      ot $$1 = ot.A($$0);
      alz $$2 = os.aM.a($$0, $$1, this.c);
      alz $$3 = this.a($$0, "_conditional", os.aM, $$1x -> $$1.c(ou.i, $$1x));
      this.b.accept(oi.a($$0).a(a(dyl.c, $$3, $$2)).a(e()));
   }

   private void s(dkm $$0) {
      alz $$1 = ov.s.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<ol> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> ol.a().a(om.c, oq.a(dko.nu, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dko.nu);
      this.b
         .accept(
            oh.a(dko.nu)
               .a(og.a().a(dyl.ar, 0), this.a(0))
               .a(og.a().a(dyl.ar, 1), this.a(1))
               .a(og.a().a(dyl.bl, dyh.b), ol.a().a(om.c, oq.a(dko.nu, "_small_leaves")))
               .a(og.a().a(dyl.bl, dyh.c), ol.a().a(om.c, oq.a(dko.nu, "_large_leaves")))
         );
   }

   private oj n() {
      return oj.a(dyl.Q)
         .a(jm.a, ol.a().a(om.a, om.a.c))
         .a(jm.b, ol.a())
         .a(jm.c, ol.a().a(om.a, om.a.b))
         .a(jm.d, ol.a().a(om.a, om.a.b).a(om.b, om.a.c))
         .a(jm.e, ol.a().a(om.a, om.a.b).a(om.b, om.a.d))
         .a(jm.f, ol.a().a(om.a, om.a.b).a(om.b, om.a.b));
   }

   private void o() {
      alz $$0 = ot.a(dko.op, "_top_open");
      this.b
         .accept(
            oi.a(dko.op)
               .a(this.n())
               .a(
                  oj.a(dyl.v)
                     .a(false, ol.a().a(om.c, ov.f.create(dko.op, this.c)))
                     .a(true, ol.a().a(om.c, ov.f.get(dko.op).a($$1 -> $$1.a(ou.f, $$0)).a(dko.op, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> oj a(dyx<T> $$0, T $$1, alz $$2, alz $$3) {
      ol $$4 = ol.a().a(om.c, $$2);
      ol $$5 = ol.a().a(om.c, $$3);
      return oj.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dkm $$0, Function<dkm, ot> $$1) {
      ot $$2 = $$1.apply($$0).b(ou.i, ou.c);
      ot $$3 = $$2.c(ou.g, ot.a($$0, "_front_honey"));
      alz $$4 = os.q.a($$0, "_empty", $$2, this.c);
      alz $$5 = os.q.a($$0, "_honey", $$3, this.c);
      this.c($$0);
      os.q.a(oq.a($$0.j(), "_empty"), $$2, this.c);
      os.q.a(oq.a($$0.j(), "_honey"), $$3, this.c);
      this.b.accept(oi.a($$0).a(b()).a(a(dyl.aO, 5, $$5, $$4)));
   }

   private void a(dkm $$0, dyx<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alz> $$3 = new Int2ObjectOpenHashMap();
         oj $$4 = oj.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alz $$5 = (alz)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, os.aW, ot::g));
            return ol.a().a(om.c, $$5);
         });
         this.a($$0.j());
         this.b.accept(oi.a($$0).a($$4));
      }
   }

   private void p() {
      alz $$0 = oq.a(dko.oy, "_floor");
      alz $$1 = oq.a(dko.oy, "_ceiling");
      alz $$2 = oq.a(dko.oy, "_wall");
      alz $$3 = oq.a(dko.oy, "_between_walls");
      this.a(cxt.xi);
      this.b
         .accept(
            oi.a(dko.oy)
               .a(
                  oj.a(dyl.S, dyl.W)
                     .a(jm.c, dyj.a, ol.a().a(om.c, $$0))
                     .a(jm.d, dyj.a, ol.a().a(om.c, $$0).a(om.b, om.a.c))
                     .a(jm.f, dyj.a, ol.a().a(om.c, $$0).a(om.b, om.a.b))
                     .a(jm.e, dyj.a, ol.a().a(om.c, $$0).a(om.b, om.a.d))
                     .a(jm.c, dyj.b, ol.a().a(om.c, $$1))
                     .a(jm.d, dyj.b, ol.a().a(om.c, $$1).a(om.b, om.a.c))
                     .a(jm.f, dyj.b, ol.a().a(om.c, $$1).a(om.b, om.a.b))
                     .a(jm.e, dyj.b, ol.a().a(om.c, $$1).a(om.b, om.a.d))
                     .a(jm.c, dyj.c, ol.a().a(om.c, $$2).a(om.b, om.a.d))
                     .a(jm.d, dyj.c, ol.a().a(om.c, $$2).a(om.b, om.a.b))
                     .a(jm.f, dyj.c, ol.a().a(om.c, $$2))
                     .a(jm.e, dyj.c, ol.a().a(om.c, $$2).a(om.b, om.a.c))
                     .a(jm.d, dyj.d, ol.a().a(om.c, $$3).a(om.b, om.a.b))
                     .a(jm.c, dyj.d, ol.a().a(om.c, $$3).a(om.b, om.a.d))
                     .a(jm.f, dyj.d, ol.a().a(om.c, $$3))
                     .a(jm.e, dyj.d, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            oi.a(dko.ou, ol.a().a(om.c, oq.a(dko.ou)))
               .a(
                  oj.a(dyl.V, dyl.S)
                     .a(dyg.a, jm.c, ol.a())
                     .a(dyg.a, jm.f, ol.a().a(om.b, om.a.b))
                     .a(dyg.a, jm.d, ol.a().a(om.b, om.a.c))
                     .a(dyg.a, jm.e, ol.a().a(om.b, om.a.d))
                     .a(dyg.b, jm.c, ol.a().a(om.a, om.a.b))
                     .a(dyg.b, jm.f, ol.a().a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(dyg.b, jm.d, ol.a().a(om.a, om.a.b).a(om.b, om.a.c))
                     .a(dyg.b, jm.e, ol.a().a(om.a, om.a.b).a(om.b, om.a.d))
                     .a(dyg.c, jm.d, ol.a().a(om.a, om.a.c))
                     .a(dyg.c, jm.e, ol.a().a(om.a, om.a.c).a(om.b, om.a.b))
                     .a(dyg.c, jm.c, ol.a().a(om.a, om.a.c).a(om.b, om.a.c))
                     .a(dyg.c, jm.f, ol.a().a(om.a, om.a.c).a(om.b, om.a.d))
               )
         );
   }

   private void d(dkm $$0, ov.a $$1) {
      alz $$2 = $$1.create($$0, this.c);
      alz $$3 = ot.a($$0, "_front_on");
      alz $$4 = $$1.get($$0).a($$1x -> $$1x.a(ou.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(oi.a($$0).a(a(dyl.r, $$4, $$2)).a(b()));
   }

   private void a(dkm... $$0) {
      alz $$1 = oq.a("campfire_off");

      for (dkm $$2 : $$0) {
         alz $$3 = os.bd.a($$2, ot.F($$2), this.c);
         this.a($$2.j());
         this.b.accept(oi.a($$2).a(a(dyl.r, $$3, $$1)).a(c()));
      }
   }

   private void t(dkm $$0) {
      alz $$1 = os.by.a($$0, ot.m($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void u(dkm $$0) {
      alz $$1;
      if ($$0 == dko.tE) {
         $$1 = os.bA.a($$0, ot.n($$0), this.c);
      } else {
         $$1 = os.bz.a($$0, ot.n($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ot $$0 = ot.a(ot.H(dko.cs), ot.H(dko.n));
      alz $$1 = os.j.a(dko.cs, $$0, this.c);
      this.b.accept(c(dko.cs, $$1));
   }

   private void s() {
      this.a(cxt.lV);
      this.b
         .accept(
            oh.a(dko.cE)
               .a(
                  og.b(
                     og.a().a(dyl.ac, dyz.c).a(dyl.ab, dyz.c).a(dyl.ad, dyz.c).a(dyl.ae, dyz.c),
                     og.a().a(dyl.ac, dyz.b, dyz.a).a(dyl.ab, dyz.b, dyz.a),
                     og.a().a(dyl.ab, dyz.b, dyz.a).a(dyl.ad, dyz.b, dyz.a),
                     og.a().a(dyl.ad, dyz.b, dyz.a).a(dyl.ae, dyz.b, dyz.a),
                     og.a().a(dyl.ae, dyz.b, dyz.a).a(dyl.ac, dyz.b, dyz.a)
                  ),
                  ol.a().a(om.c, oq.a("redstone_dust_dot"))
               )
               .a(og.a().a(dyl.ac, dyz.b, dyz.a), ol.a().a(om.c, oq.a("redstone_dust_side0")))
               .a(og.a().a(dyl.ad, dyz.b, dyz.a), ol.a().a(om.c, oq.a("redstone_dust_side_alt0")))
               .a(og.a().a(dyl.ab, dyz.b, dyz.a), ol.a().a(om.c, oq.a("redstone_dust_side_alt1")).a(om.b, om.a.d))
               .a(og.a().a(dyl.ae, dyz.b, dyz.a), ol.a().a(om.c, oq.a("redstone_dust_side1")).a(om.b, om.a.d))
               .a(og.a().a(dyl.ac, dyz.a), ol.a().a(om.c, oq.a("redstone_dust_up")))
               .a(og.a().a(dyl.ab, dyz.a), ol.a().a(om.c, oq.a("redstone_dust_up")).a(om.b, om.a.b))
               .a(og.a().a(dyl.ad, dyz.a), ol.a().a(om.c, oq.a("redstone_dust_up")).a(om.b, om.a.c))
               .a(og.a().a(dyl.ae, dyz.a), ol.a().a(om.c, oq.a("redstone_dust_up")).a(om.b, om.a.d))
         );
   }

   private void t() {
      this.a(cxt.lZ);
      this.b
         .accept(
            oi.a(dko.ho)
               .a(c())
               .a(
                  oj.a(dyl.be, dyl.x)
                     .a(dyo.a, false, ol.a().a(om.c, oq.a(dko.ho)))
                     .a(dyo.a, true, ol.a().a(om.c, oq.a(dko.ho, "_on")))
                     .a(dyo.b, false, ol.a().a(om.c, oq.a(dko.ho, "_subtract")))
                     .a(dyo.b, true, ol.a().a(om.c, oq.a(dko.ho, "_on_subtract")))
               )
         );
   }

   private void u() {
      ot $$0 = ot.a(dko.kj);
      ot $$1 = ot.a(ot.a(dko.jW, "_side"), $$0.a(ou.f));
      alz $$2 = os.ab.a(dko.jW, $$1, this.c);
      alz $$3 = os.ac.a(dko.jW, $$1, this.c);
      alz $$4 = os.j.b(dko.jW, "_double", $$1, this.c);
      this.b.accept(e(dko.jW, $$2, $$3, $$4));
      this.b.accept(c(dko.kj, os.c.a(dko.kj, $$0, this.c)));
   }

   private void v() {
      this.a(cxt.te);
      this.b
         .accept(
            oh.a(dko.fG)
               .a(ol.a().a(om.c, ot.H(dko.fG)))
               .a(og.a().a(dyl.k, true), ol.a().a(om.c, ot.a(dko.fG, "_bottle0")))
               .a(og.a().a(dyl.l, true), ol.a().a(om.c, ot.a(dko.fG, "_bottle1")))
               .a(og.a().a(dyl.m, true), ol.a().a(om.c, ot.a(dko.fG, "_bottle2")))
               .a(og.a().a(dyl.k, false), ol.a().a(om.c, ot.a(dko.fG, "_empty0")))
               .a(og.a().a(dyl.l, false), ol.a().a(om.c, ot.a(dko.fG, "_empty1")))
               .a(og.a().a(dyl.m, false), ol.a().a(om.c, ot.a(dko.fG, "_empty2")))
         );
   }

   private void v(dkm $$0) {
      alz $$1 = os.bu.a($$0, ot.b($$0), this.c);
      alz $$2 = oq.a("mushroom_block_inside");
      this.b
         .accept(
            oh.a($$0)
               .a(og.a().a(dyl.M, true), ol.a().a(om.c, $$1))
               .a(og.a().a(dyl.N, true), ol.a().a(om.c, $$1).a(om.b, om.a.b).a(om.d, true))
               .a(og.a().a(dyl.O, true), ol.a().a(om.c, $$1).a(om.b, om.a.c).a(om.d, true))
               .a(og.a().a(dyl.P, true), ol.a().a(om.c, $$1).a(om.b, om.a.d).a(om.d, true))
               .a(og.a().a(dyl.K, true), ol.a().a(om.c, $$1).a(om.a, om.a.d).a(om.d, true))
               .a(og.a().a(dyl.L, true), ol.a().a(om.c, $$1).a(om.a, om.a.b).a(om.d, true))
               .a(og.a().a(dyl.M, false), ol.a().a(om.c, $$2))
               .a(og.a().a(dyl.N, false), ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, false))
               .a(og.a().a(dyl.O, false), ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, false))
               .a(og.a().a(dyl.P, false), ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, false))
               .a(og.a().a(dyl.K, false), ol.a().a(om.c, $$2).a(om.a, om.a.d).a(om.d, false))
               .a(og.a().a(dyl.L, false), ol.a().a(om.c, $$2).a(om.a, om.a.b).a(om.d, false))
         );
      this.a($$0, ov.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cxt.sp);
      this.b
         .accept(
            oi.a(dko.et)
               .a(
                  oj.a(dyl.az)
                     .a(0, ol.a().a(om.c, oq.a(dko.et)))
                     .a(1, ol.a().a(om.c, oq.a(dko.et, "_slice1")))
                     .a(2, ol.a().a(om.c, oq.a(dko.et, "_slice2")))
                     .a(3, ol.a().a(om.c, oq.a(dko.et, "_slice3")))
                     .a(4, ol.a().a(om.c, oq.a(dko.et, "_slice4")))
                     .a(5, ol.a().a(om.c, oq.a(dko.et, "_slice5")))
                     .a(6, ol.a().a(om.c, oq.a(dko.et, "_slice6")))
               )
         );
   }

   private void x() {
      ot $$0 = new ot()
         .a(ou.c, ot.a(dko.os, "_side3"))
         .a(ou.o, ot.H(dko.t))
         .a(ou.n, ot.a(dko.os, "_top"))
         .a(ou.j, ot.a(dko.os, "_side3"))
         .a(ou.l, ot.a(dko.os, "_side3"))
         .a(ou.k, ot.a(dko.os, "_side1"))
         .a(ou.m, ot.a(dko.os, "_side2"));
      this.b.accept(c(dko.os, os.a.a(dko.os, $$0, this.c)));
   }

   private void y() {
      ot $$0 = new ot()
         .a(ou.c, ot.a(dko.ow, "_front"))
         .a(ou.o, ot.a(dko.ow, "_bottom"))
         .a(ou.n, ot.a(dko.ow, "_top"))
         .a(ou.j, ot.a(dko.ow, "_front"))
         .a(ou.k, ot.a(dko.ow, "_front"))
         .a(ou.l, ot.a(dko.ow, "_side"))
         .a(ou.m, ot.a(dko.ow, "_side"));
      this.b.accept(c(dko.ow, os.a.a(dko.ow, $$0, this.c)));
   }

   private void a(dkm $$0, dkm $$1, BiFunction<dkm, dkm, ot> $$2) {
      ot $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, os.a.a($$0, $$3, this.c)));
   }

   public void b(dkm $$0) {
      ot $$1 = new ot()
         .a(ou.c, ot.a($$0, "_particle"))
         .a(ou.o, ot.a($$0, "_down"))
         .a(ou.n, ot.a($$0, "_up"))
         .a(ou.j, ot.a($$0, "_north"))
         .a(ou.k, ot.a($$0, "_south"))
         .a(ou.l, ot.a($$0, "_east"))
         .a(ou.m, ot.a($$0, "_west"));
      this.b.accept(c($$0, os.a.a($$0, $$1, this.c)));
   }

   private void z() {
      ot $$0 = ot.l(dko.fn);
      this.b.accept(c(dko.fn, oq.a(dko.fn)));
      this.a(dko.er, $$0);
      this.a(dko.es, $$0);
   }

   private void a(dkm $$0, ot $$1) {
      alz $$2 = os.p.a($$0, $$1.c(ou.g, ot.H($$0)), this.c);
      this.b.accept(oi.a($$0, ol.a().a(om.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cxt.tf);
      this.n(dko.fH);
      this.b.accept(c(dko.fJ, os.bx.a(dko.fJ, ot.j(ot.a(dko.K, "_still")), this.c)));
      this.b
         .accept(
            oi.a(dko.fI)
               .a(
                  oj.a(dox.g)
                     .a(1, ol.a().a(om.c, os.bv.a(dko.fI, "_level1", ot.j(ot.a(dko.J, "_still")), this.c)))
                     .a(2, ol.a().a(om.c, os.bw.a(dko.fI, "_level2", ot.j(ot.a(dko.J, "_still")), this.c)))
                     .a(3, ol.a().a(om.c, os.bx.a(dko.fI, "_full", ot.j(ot.a(dko.J, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            oi.a(dko.fK)
               .a(
                  oj.a(dox.g)
                     .a(1, ol.a().a(om.c, os.bv.a(dko.fK, "_level1", ot.j(ot.H(dko.rk)), this.c)))
                     .a(2, ol.a().a(om.c, os.bw.a(dko.fK, "_level2", ot.j(ot.H(dko.rk)), this.c)))
                     .a(3, ol.a().a(om.c, os.bx.a(dko.fK, "_full", ot.j(ot.H(dko.rk)), this.c)))
               )
         );
   }

   private void B() {
      ot $$0 = ot.b(dko.kQ);
      alz $$1 = os.aF.a(dko.kQ, $$0, this.c);
      alz $$2 = this.a(dko.kQ, "_dead", os.aF, $$1x -> $$0.c(ou.b, $$1x));
      this.b.accept(oi.a(dko.kQ).a(a(dyl.av, 5, $$2, $$1)));
   }

   private void C() {
      alz $$0 = oq.a(dko.tL);
      alz $$1 = oq.a(dko.tL, "_triggered");
      alz $$2 = oq.a(dko.tL, "_crafting");
      alz $$3 = oq.a(dko.tL, "_crafting_triggered");
      this.b
         .accept(
            oi.a(dko.tL)
               .a(oj.a(dyl.U).a($$0x -> this.a($$0x, ol.a())))
               .a(
                  oj.a(dyl.B, dmg.b)
                     .a(false, false, ol.a().a(om.c, $$0))
                     .a(true, true, ol.a().a(om.c, $$3))
                     .a(true, false, ol.a().a(om.c, $$1))
                     .a(false, true, ol.a().a(om.c, $$2))
               )
         );
   }

   private void w(dkm $$0) {
      ot $$1 = new ot().a(ou.f, ot.a(dko.cL, "_top")).a(ou.i, ot.a(dko.cL, "_side")).a(ou.g, ot.a($$0, "_front"));
      ot $$2 = new ot().a(ou.i, ot.a(dko.cL, "_top")).a(ou.g, ot.a($$0, "_front_vertical"));
      alz $$3 = os.p.a($$0, $$1, this.c);
      alz $$4 = os.r.a($$0, $$2, this.c);
      this.b
         .accept(
            oi.a($$0)
               .a(
                  oj.a(dyl.Q)
                     .a(jm.a, ol.a().a(om.c, $$4).a(om.a, om.a.c))
                     .a(jm.b, ol.a().a(om.c, $$4))
                     .a(jm.c, ol.a().a(om.c, $$3))
                     .a(jm.f, ol.a().a(om.c, $$3).a(om.b, om.a.b))
                     .a(jm.d, ol.a().a(om.c, $$3).a(om.b, om.a.c))
                     .a(jm.e, ol.a().a(om.c, $$3).a(om.b, om.a.d))
               )
         );
   }

   private void D() {
      alz $$0 = oq.a(dko.fM);
      alz $$1 = oq.a(dko.fM, "_filled");
      this.b.accept(oi.a(dko.fM).a(oj.a(dyl.h).a(false, ol.a().a(om.c, $$0)).a(true, ol.a().a(om.c, $$1))).a(c()));
   }

   private void E() {
      alz $$0 = oq.a(dko.kP, "_side");
      alz $$1 = oq.a(dko.kP, "_noside");
      alz $$2 = oq.a(dko.kP, "_noside1");
      alz $$3 = oq.a(dko.kP, "_noside2");
      alz $$4 = oq.a(dko.kP, "_noside3");
      this.b
         .accept(
            oh.a(dko.kP)
               .a(og.a().a(dyl.M, true), ol.a().a(om.c, $$0))
               .a(og.a().a(dyl.N, true), ol.a().a(om.c, $$0).a(om.b, om.a.b).a(om.d, true))
               .a(og.a().a(dyl.O, true), ol.a().a(om.c, $$0).a(om.b, om.a.c).a(om.d, true))
               .a(og.a().a(dyl.P, true), ol.a().a(om.c, $$0).a(om.b, om.a.d).a(om.d, true))
               .a(og.a().a(dyl.K, true), ol.a().a(om.c, $$0).a(om.a, om.a.d).a(om.d, true))
               .a(og.a().a(dyl.L, true), ol.a().a(om.c, $$0).a(om.a, om.a.b).a(om.d, true))
               .a(og.a().a(dyl.M, false), ol.a().a(om.c, $$1).a(om.e, 2), ol.a().a(om.c, $$2), ol.a().a(om.c, $$3), ol.a().a(om.c, $$4))
               .a(
                  og.a().a(dyl.N, false),
                  ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$4).a(om.b, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.b, om.a.b).a(om.d, true)
               )
               .a(
                  og.a().a(dyl.O, false),
                  ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true),
                  ol.a().a(om.c, $$4).a(om.b, om.a.c).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.b, om.a.c).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true)
               )
               .a(
                  og.a().a(dyl.P, false),
                  ol.a().a(om.c, $$4).a(om.b, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.b, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true)
               )
               .a(
                  og.a().a(dyl.K, false),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.a, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$4).a(om.a, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.a, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.a, om.a.d).a(om.d, true)
               )
               .a(
                  og.a().a(dyl.L, false),
                  ol.a().a(om.c, $$4).a(om.a, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.a, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.a, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.a, om.a.b).a(om.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            oh.a(dko.px)
               .a(ol.a().a(om.c, ot.H(dko.px)))
               .a(og.a().a(dyl.aM, 1), ol.a().a(om.c, ot.a(dko.px, "_contents1")))
               .a(og.a().a(dyl.aM, 2), ol.a().a(om.c, ot.a(dko.px, "_contents2")))
               .a(og.a().a(dyl.aM, 3), ol.a().a(om.c, ot.a(dko.px, "_contents3")))
               .a(og.a().a(dyl.aM, 4), ol.a().a(om.c, ot.a(dko.px, "_contents4")))
               .a(og.a().a(dyl.aM, 5), ol.a().a(om.c, ot.a(dko.px, "_contents5")))
               .a(og.a().a(dyl.aM, 6), ol.a().a(om.c, ot.a(dko.px, "_contents6")))
               .a(og.a().a(dyl.aM, 7), ol.a().a(om.c, ot.a(dko.px, "_contents7")))
               .a(og.a().a(dyl.aM, 8), ol.a().a(om.c, ot.a(dko.px, "_contents_ready")))
         );
   }

   private void x(dkm $$0) {
      alz $$1 = os.c.a($$0, ot.a($$0), this.c);
      alz $$2 = this.a($$0, "_powered", os.c, ot::b);
      alz $$3 = this.a($$0, "_lit", os.c, ot::b);
      alz $$4 = this.a($$0, "_lit_powered", os.c, ot::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private of a(dkm $$0, alz $$1, alz $$2, alz $$3, alz $$4) {
      return oi.a($$0).a(oj.a(dyl.r, dyl.x).a(($$4x, $$5) -> $$4x ? ol.a().a(om.c, $$5 ? $$4 : $$2) : ol.a().a(om.c, $$5 ? $$3 : $$1)));
   }

   private void i(dkm $$0, dkm $$1) {
      alz $$2 = oq.a($$0);
      alz $$3 = oq.a($$0, "_powered");
      alz $$4 = oq.a($$0, "_lit");
      alz $$5 = oq.a($$0, "_lit_powered");
      this.a($$1, oq.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void y(dkm $$0) {
      this.c($$0);
      this.b.accept(oi.a($$0, ol.a().a(om.c, os.ao.a($$0, ot.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.y(dko.qT);
      this.y(dko.qS);
      this.y(dko.qR);
      this.y(dko.qQ);
   }

   private void H() {
      this.c(dko.sO);
      oj.b<jm, dyr> $$0 = oj.a(dyl.bn, dyl.bo);

      for (dyr $$1 : dyr.values()) {
         $$0.a(jm.b, $$1, this.a(jm.b, $$1));
      }

      for (dyr $$2 : dyr.values()) {
         $$0.a(jm.a, $$2, this.a(jm.a, $$2));
      }

      this.b.accept(oi.a(dko.sO).a($$0));
   }

   private ol a(jm $$0, dyr $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ot $$3 = ot.c(ot.a(dko.sO, $$2));
      return ol.a().a(om.c, os.an.a(dko.sO, $$2, $$3, this.c));
   }

   private void z(dkm $$0) {
      ot $$1 = new ot().a(ou.e, ot.H(dko.ei)).a(ou.f, ot.H($$0)).a(ou.i, ot.a($$0, "_side"));
      this.b.accept(c($$0, os.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alz $$0 = ot.a(dko.hp, "_side");
      ot $$1 = new ot().a(ou.f, ot.a(dko.hp, "_top")).a(ou.i, $$0);
      ot $$2 = new ot().a(ou.f, ot.a(dko.hp, "_inverted_top")).a(ou.i, $$0);
      this.b
         .accept(
            oi.a(dko.hp)
               .a(oj.a(dyl.p).a(false, ol.a().a(om.c, os.aG.a(dko.hp, $$1, this.c))).a(true, ol.a().a(om.c, os.aG.a(oq.a(dko.hp, "_inverted"), $$2, this.c))))
         );
   }

   private void A(dkm $$0) {
      this.b.accept(oi.a($$0, ol.a().a(om.c, oq.a($$0))).a(this.n()));
   }

   private void J() {
      dkm $$0 = dko.sN;
      alz $$1 = oq.a($$0, "_on");
      alz $$2 = oq.a($$0);
      this.b.accept(oi.a($$0, ol.a().a(om.c, oq.a($$0))).a(this.n()).a(a(dyl.x, $$1, $$2)));
   }

   private void K() {
      ot $$0 = new ot().a(ou.B, ot.H(dko.j)).a(ou.f, ot.H(dko.cK));
      ot $$1 = new ot().a(ou.B, ot.H(dko.j)).a(ou.f, ot.a(dko.cK, "_moist"));
      alz $$2 = os.aX.a(dko.cK, $$0, this.c);
      alz $$3 = os.aX.a(ot.a(dko.cK, "_moist"), $$1, this.c);
      this.b.accept(oi.a(dko.cK).a(a(dyl.aR, 7, $$3, $$2)));
   }

   private List<alz> B(dkm $$0) {
      alz $$1 = os.aY.a(oq.a($$0, "_floor0"), ot.w($$0), this.c);
      alz $$2 = os.aY.a(oq.a($$0, "_floor1"), ot.x($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alz> C(dkm $$0) {
      alz $$1 = os.aZ.a(oq.a($$0, "_side0"), ot.w($$0), this.c);
      alz $$2 = os.aZ.a(oq.a($$0, "_side1"), ot.x($$0), this.c);
      alz $$3 = os.ba.a(oq.a($$0, "_side_alt0"), ot.w($$0), this.c);
      alz $$4 = os.ba.a(oq.a($$0, "_side_alt1"), ot.x($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alz> D(dkm $$0) {
      alz $$1 = os.bb.a(oq.a($$0, "_up0"), ot.w($$0), this.c);
      alz $$2 = os.bb.a(oq.a($$0, "_up1"), ot.x($$0), this.c);
      alz $$3 = os.bc.a(oq.a($$0, "_up_alt0"), ot.w($$0), this.c);
      alz $$4 = os.bc.a(oq.a($$0, "_up_alt1"), ot.x($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<ol> a(List<alz> $$0, UnaryOperator<ol> $$1) {
      return $$0.stream().map($$0x -> ol.a().a(om.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      og $$0 = og.a().a(dyl.M, false).a(dyl.N, false).a(dyl.O, false).a(dyl.P, false).a(dyl.K, false);
      List<alz> $$1 = this.B(dko.cy);
      List<alz> $$2 = this.C(dko.cy);
      List<alz> $$3 = this.D(dko.cy);
      this.b
         .accept(
            oh.a(dko.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(og.b(og.a().a(dyl.M, true), $$0), a($$2, $$0x -> $$0x))
               .a(og.b(og.a().a(dyl.N, true), $$0), a($$2, $$0x -> $$0x.a(om.b, om.a.b)))
               .a(og.b(og.a().a(dyl.O, true), $$0), a($$2, $$0x -> $$0x.a(om.b, om.a.c)))
               .a(og.b(og.a().a(dyl.P, true), $$0), a($$2, $$0x -> $$0x.a(om.b, om.a.d)))
               .a(og.a().a(dyl.K, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alz> $$0 = this.B(dko.cz);
      List<alz> $$1 = this.C(dko.cz);
      this.b
         .accept(
            oh.a(dko.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(om.b, om.a.b)))
               .a(a($$1, $$0x -> $$0x.a(om.b, om.a.c)))
               .a(a($$1, $$0x -> $$0x.a(om.b, om.a.d)))
         );
   }

   private void E(dkm $$0) {
      alz $$1 = ov.u.create($$0, this.c);
      alz $$2 = ov.v.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(oi.a($$0).a(a(dyl.j, $$2, $$1)));
   }

   private void N() {
      ot $$0 = ot.a(ot.a(dko.ah, "_side"), ot.a(dko.ah, "_top"));
      alz $$1 = os.j.a(dko.ah, $$0, this.c);
      this.b.accept(d(dko.ah, $$1));
   }

   private void O() {
      this.a(cxt.af);
      dkm $$0 = dko.H;
      oj.b<Boolean, Integer> $$1 = oj.a(dpj.d, dpj.b);
      alz $$2 = oq.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alz $$4 = oq.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, ol.a().a(om.c, $$4));
         $$1.a(false, $$3, ol.a().a(om.c, $$2));
      }

      this.b.accept(oi.a(dko.H).a($$1));
   }

   private void P() {
      this.b
         .accept(
            oi.a(dko.ld)
               .a(
                  oj.a(dyl.at)
                     .a(0, ol.a().a(om.c, this.a(dko.ld, "_0", os.c, ot::b)))
                     .a(1, ol.a().a(om.c, this.a(dko.ld, "_1", os.c, ot::b)))
                     .a(2, ol.a().a(om.c, this.a(dko.ld, "_2", os.c, ot::b)))
                     .a(3, ol.a().a(om.c, this.a(dko.ld, "_3", os.c, ot::b)))
               )
         );
   }

   private void Q() {
      alz $$0 = ot.H(dko.j);
      ot $$1 = new ot().a(ou.e, $$0).b(ou.e, ou.c).a(ou.f, ot.a(dko.i, "_top")).a(ou.i, ot.a(dko.i, "_snow"));
      ol $$2 = ol.a().a(om.c, os.n.a(dko.i, "_snow", $$1, this.c));
      this.a(dko.i, oq.a(dko.i), $$2);
      alz $$3 = ov.f.get(dko.fz).a($$1x -> $$1x.a(ou.e, $$0)).a(dko.fz, this.c);
      this.a(dko.fz, $$3, $$2);
      alz $$4 = ov.f.get(dko.l).a($$1x -> $$1x.a(ou.e, $$0)).a(dko.l, this.c);
      this.a(dko.l, $$4, $$2);
   }

   private void a(dkm $$0, alz $$1, ol $$2) {
      List<ol> $$3 = Arrays.asList(a($$1));
      this.b.accept(oi.a($$0).a(oj.a(dyl.A).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cxt.rV);
      this.b
         .accept(
            oi.a(dko.fQ)
               .a(
                  oj.a(dyl.as)
                     .a(0, ol.a().a(om.c, oq.a(dko.fQ, "_stage0")))
                     .a(1, ol.a().a(om.c, oq.a(dko.fQ, "_stage1")))
                     .a(2, ol.a().a(om.c, oq.a(dko.fQ, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dko.kZ, oq.a(dko.kZ)));
   }

   private void j(dkm $$0, dkm $$1) {
      ot $$2 = ot.b($$1);
      alz $$3 = os.Y.a($$0, $$2, this.c);
      alz $$4 = os.Z.a($$0, $$2, this.c);
      this.b.accept(oi.a($$0).a(a(dyl.aU, 1, $$4, $$3)));
   }

   private void T() {
      alz $$0 = oq.a(dko.hs);
      alz $$1 = oq.a(dko.hs, "_side");
      this.a(cxt.mf);
      this.b
         .accept(
            oi.a(dko.hs)
               .a(
                  oj.a(dyl.R)
                     .a(jm.a, ol.a().a(om.c, $$0))
                     .a(jm.c, ol.a().a(om.c, $$1))
                     .a(jm.f, ol.a().a(om.c, $$1).a(om.b, om.a.b))
                     .a(jm.d, ol.a().a(om.c, $$1).a(om.b, om.a.c))
                     .a(jm.e, ol.a().a(om.c, $$1).a(om.b, om.a.d))
               )
         );
   }

   private void k(dkm $$0, dkm $$1) {
      alz $$2 = oq.a($$0);
      this.b.accept(oi.a($$1, ol.a().a(om.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alz $$0 = oq.a(dko.fk, "_post_ends");
      alz $$1 = oq.a(dko.fk, "_post");
      alz $$2 = oq.a(dko.fk, "_cap");
      alz $$3 = oq.a(dko.fk, "_cap_alt");
      alz $$4 = oq.a(dko.fk, "_side");
      alz $$5 = oq.a(dko.fk, "_side_alt");
      this.b
         .accept(
            oh.a(dko.fk)
               .a(ol.a().a(om.c, $$0))
               .a(og.a().a(dyl.M, false).a(dyl.N, false).a(dyl.O, false).a(dyl.P, false), ol.a().a(om.c, $$1))
               .a(og.a().a(dyl.M, true).a(dyl.N, false).a(dyl.O, false).a(dyl.P, false), ol.a().a(om.c, $$2))
               .a(og.a().a(dyl.M, false).a(dyl.N, true).a(dyl.O, false).a(dyl.P, false), ol.a().a(om.c, $$2).a(om.b, om.a.b))
               .a(og.a().a(dyl.M, false).a(dyl.N, false).a(dyl.O, true).a(dyl.P, false), ol.a().a(om.c, $$3))
               .a(og.a().a(dyl.M, false).a(dyl.N, false).a(dyl.O, false).a(dyl.P, true), ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(og.a().a(dyl.M, true), ol.a().a(om.c, $$4))
               .a(og.a().a(dyl.N, true), ol.a().a(om.c, $$4).a(om.b, om.a.b))
               .a(og.a().a(dyl.O, true), ol.a().a(om.c, $$5))
               .a(og.a().a(dyl.P, true), ol.a().a(om.c, $$5).a(om.b, om.a.b))
         );
      this.d(dko.fk);
   }

   private void F(dkm $$0) {
      this.b.accept(oi.a($$0, ol.a().a(om.c, oq.a($$0))).a(b()));
   }

   private void V() {
      alz $$0 = oq.a(dko.dI);
      alz $$1 = oq.a(dko.dI, "_on");
      this.d(dko.dI);
      this.b
         .accept(
            oi.a(dko.dI)
               .a(a(dyl.x, $$0, $$1))
               .a(
                  oj.a(dyl.V, dyl.S)
                     .a(dyg.c, jm.c, ol.a().a(om.a, om.a.c).a(om.b, om.a.c))
                     .a(dyg.c, jm.f, ol.a().a(om.a, om.a.c).a(om.b, om.a.d))
                     .a(dyg.c, jm.d, ol.a().a(om.a, om.a.c))
                     .a(dyg.c, jm.e, ol.a().a(om.a, om.a.c).a(om.b, om.a.b))
                     .a(dyg.a, jm.c, ol.a())
                     .a(dyg.a, jm.f, ol.a().a(om.b, om.a.b))
                     .a(dyg.a, jm.d, ol.a().a(om.b, om.a.c))
                     .a(dyg.a, jm.e, ol.a().a(om.b, om.a.d))
                     .a(dyg.b, jm.c, ol.a().a(om.a, om.a.b))
                     .a(dyg.b, jm.f, ol.a().a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(dyg.b, jm.d, ol.a().a(om.a, om.a.b).a(om.b, om.a.c))
                     .a(dyg.b, jm.e, ol.a().a(om.a, om.a.b).a(om.b, om.a.d))
               )
         );
   }

   private void W() {
      this.d(dko.fA);
      this.b.accept(b(dko.fA, oq.a(dko.fA)));
   }

   private void X() {
      this.d(dko.tI);
      this.b.accept(c(dko.tI, oq.a(dko.tI)));
   }

   private void Y() {
      this.b.accept(oi.a(dko.eq).a(oj.a(dyl.I).a(jm.a.a, ol.a().a(om.c, oq.a(dko.eq, "_ns"))).a(jm.a.c, ol.a().a(om.c, oq.a(dko.eq, "_ew")))));
   }

   private void Z() {
      alz $$0 = ov.a.create(dko.ei, this.c);
      this.b
         .accept(
            oi.a(
               dko.ei,
               ol.a().a(om.c, $$0),
               ol.a().a(om.c, $$0).a(om.a, om.a.b),
               ol.a().a(om.c, $$0).a(om.a, om.a.c),
               ol.a().a(om.c, $$0).a(om.a, om.a.d),
               ol.a().a(om.c, $$0).a(om.b, om.a.b),
               ol.a().a(om.c, $$0).a(om.b, om.a.b).a(om.a, om.a.b),
               ol.a().a(om.c, $$0).a(om.b, om.a.b).a(om.a, om.a.c),
               ol.a().a(om.c, $$0).a(om.b, om.a.b).a(om.a, om.a.d),
               ol.a().a(om.c, $$0).a(om.b, om.a.c),
               ol.a().a(om.c, $$0).a(om.b, om.a.c).a(om.a, om.a.b),
               ol.a().a(om.c, $$0).a(om.b, om.a.c).a(om.a, om.a.c),
               ol.a().a(om.c, $$0).a(om.b, om.a.c).a(om.a, om.a.d),
               ol.a().a(om.c, $$0).a(om.b, om.a.d),
               ol.a().a(om.c, $$0).a(om.b, om.a.d).a(om.a, om.a.b),
               ol.a().a(om.c, $$0).a(om.b, om.a.d).a(om.a, om.a.c),
               ol.a().a(om.c, $$0).a(om.b, om.a.d).a(om.a, om.a.d)
            )
         );
   }

   private void aa() {
      alz $$0 = oq.a(dko.lj);
      alz $$1 = oq.a(dko.lj, "_on");
      this.b.accept(oi.a(dko.lj).a(a(dyl.x, $$1, $$0)).a(e()));
   }

   private void ab() {
      ot $$0 = new ot().a(ou.e, ot.a(dko.bF, "_bottom")).a(ou.i, ot.a(dko.bF, "_side"));
      alz $$1 = ot.a(dko.bF, "_top_sticky");
      alz $$2 = ot.a(dko.bF, "_top");
      ot $$3 = $$0.c(ou.E, $$1);
      ot $$4 = $$0.c(ou.E, $$2);
      alz $$5 = oq.a(dko.bF, "_base");
      this.a(dko.bF, $$5, $$4);
      this.a(dko.by, $$5, $$3);
      alz $$6 = os.n.a(dko.bF, "_inventory", $$0.c(ou.f, $$2), this.c);
      alz $$7 = os.n.a(dko.by, "_inventory", $$0.c(ou.f, $$1), this.c);
      this.a(dko.bF, $$6);
      this.a(dko.by, $$7);
   }

   private void a(dkm $$0, alz $$1, ot $$2) {
      alz $$3 = os.bm.a($$0, $$2, this.c);
      this.b.accept(oi.a($$0).a(a(dyl.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      ot $$0 = new ot().a(ou.F, ot.a(dko.bF, "_top")).a(ou.i, ot.a(dko.bF, "_side"));
      ot $$1 = $$0.c(ou.E, ot.a(dko.bF, "_top_sticky"));
      ot $$2 = $$0.c(ou.E, ot.a(dko.bF, "_top"));
      this.b
         .accept(
            oi.a(dko.bG)
               .a(
                  oj.a(dyl.y, dyl.bh)
                     .a(false, dyw.a, ol.a().a(om.c, os.bn.a(dko.bF, "_head", $$2, this.c)))
                     .a(false, dyw.b, ol.a().a(om.c, os.bn.a(dko.bF, "_head_sticky", $$1, this.c)))
                     .a(true, dyw.a, ol.a().a(om.c, os.bo.a(dko.bF, "_head_short", $$2, this.c)))
                     .a(true, dyw.b, ol.a().a(om.c, os.bo.a(dko.bF, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dkm $$0 = dko.tM;
      ot $$1 = ot.a($$0, "_side_inactive", "_top_inactive");
      ot $$2 = ot.a($$0, "_side_active", "_top_active");
      ot $$3 = ot.a($$0, "_side_active", "_top_ejecting_reward");
      ot $$4 = ot.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      ot $$5 = ot.a($$0, "_side_active_ominous", "_top_active_ominous");
      ot $$6 = ot.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alz $$7 = os.o.a($$0, $$1, this.c);
      alz $$8 = os.o.a($$0, "_active", $$2, this.c);
      alz $$9 = os.o.a($$0, "_ejecting_reward", $$3, this.c);
      alz $$10 = os.o.a($$0, "_inactive_ominous", $$4, this.c);
      alz $$11 = os.o.a($$0, "_active_ominous", $$5, this.c);
      alz $$12 = os.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(oi.a($$0).a(oj.a(dyl.bz, dyl.bC).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> ol.a().a(om.c, $$7x ? $$10 : $$7);
            case b, c, d -> ol.a().a(om.c, $$7x ? $$11 : $$8);
            case e -> ol.a().a(om.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dkm $$0 = dko.tN;
      ot $$1 = ot.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      ot $$2 = ot.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      ot $$3 = ot.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      ot $$4 = ot.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alz $$5 = os.bS.a($$0, $$1, this.c);
      alz $$6 = os.bS.a($$0, "_active", $$2, this.c);
      alz $$7 = os.bS.a($$0, "_unlocking", $$3, this.c);
      alz $$8 = os.bS.a($$0, "_ejecting_reward", $$4, this.c);
      ot $$9 = ot.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      ot $$10 = ot.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      ot $$11 = ot.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      ot $$12 = ot.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alz $$13 = os.bS.a($$0, "_ominous", $$9, this.c);
      alz $$14 = os.bS.a($$0, "_active_ominous", $$10, this.c);
      alz $$15 = os.bS.a($$0, "_unlocking_ominous", $$11, this.c);
      alz $$16 = os.bS.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(oi.a($$0).a(b()).a(oj.a(dtk.b, dtk.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> ol.a().a(om.c, $$9x ? $$13 : $$5);
            case b -> ol.a().a(om.c, $$9x ? $$14 : $$6);
            case c -> ol.a().a(om.c, $$9x ? $$15 : $$7);
            case d -> ol.a().a(om.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alz $$0 = oq.a(dko.rl, "_inactive");
      alz $$1 = oq.a(dko.rl, "_active");
      this.a(dko.rl, $$0);
      this.b.accept(oi.a(dko.rl).a(oj.a(dyl.bp).a($$2 -> ol.a().a(om.c, $$2 != dzb.b && $$2 != dzb.c ? $$0 : $$1))));
   }

   private void ag() {
      alz $$0 = oq.a(dko.rm, "_inactive");
      alz $$1 = oq.a(dko.rm, "_active");
      this.a(dko.rm, $$0);
      this.b.accept(oi.a(dko.rm).a(oj.a(dyl.bp).a($$2 -> ol.a().a(om.c, $$2 != dzb.b && $$2 != dzb.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alz $$0 = os.bR.a(dko.rq, ot.a(false), this.c);
      alz $$1 = os.bR.a(dko.rq, "_can_summon", ot.a(true), this.c);
      this.a(dko.rq, $$0);
      this.b.accept(oi.a(dko.rq).a(a(dyl.H, $$1, $$0)));
   }

   private void ai() {
      alz $$0 = oq.a(dko.on, "_stable");
      alz $$1 = oq.a(dko.on, "_unstable");
      this.a(dko.on, $$0);
      this.b.accept(oi.a(dko.on).a(a(dyl.b, $$1, $$0)));
   }

   private void aj() {
      alz $$0 = this.a(dko.sQ, "", os.ao, ot::c);
      alz $$1 = this.a(dko.sQ, "_lit", os.ao, ot::c);
      this.b.accept(oi.a(dko.sQ).a(a(dyl.E, $$1, $$0)));
      alz $$2 = this.a(dko.sR, "", os.ao, ot::c);
      alz $$3 = this.a(dko.sR, "_lit", os.ao, ot::c);
      this.b.accept(oi.a(dko.sR).a(a(dyl.E, $$3, $$2)));
   }

   private void ak() {
      alz $$0 = ov.a.create(dko.fP, this.c);
      alz $$1 = this.a(dko.fP, "_on", os.c, ot::b);
      this.b.accept(oi.a(dko.fP).a(a(dyl.r, $$1, $$0)));
   }

   private void l(dkm $$0, dkm $$1) {
      ot $$2 = ot.z($$0);
      this.b.accept(c($$0, os.bg.a($$0, $$2, this.c)));
      this.b.accept(oi.a($$1, ol.a().a(om.c, os.bi.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      ot $$0 = ot.z(dko.dX);
      ot $$1 = ot.i(ot.a(dko.dX, "_off"));
      alz $$2 = os.bk.a(dko.dX, $$0, this.c);
      alz $$3 = os.bh.a(dko.dX, "_off", $$1, this.c);
      this.b.accept(oi.a(dko.dX).a(a(dyl.r, $$2, $$3)));
      alz $$4 = os.bl.a(dko.dY, $$0, this.c);
      alz $$5 = os.bj.a(dko.dY, "_off", $$1, this.c);
      this.b.accept(oi.a(dko.dY).a(a(dyl.r, $$4, $$5)).a(d()));
      this.d(dko.dX);
      this.c(dko.dY);
   }

   private void am() {
      this.a(cxt.lY);
      this.b.accept(oi.a(dko.eu).a(oj.a(dyl.aB, dyl.t, dyl.x).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return ol.a().a(om.c, ot.a(dko.eu, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cxt.da);
      this.b
         .accept(
            oi.a(dko.nq)
               .a(
                  oj.a(dyl.aT, dyl.D)
                     .a(1, false, Arrays.asList(a(oq.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(oq.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(oq.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(oq.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(oq.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(oq.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(oq.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(oq.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      ot $$0 = ot.a(dko.ea);
      alz $$1 = os.c.a(dko.ec, $$0, this.c);
      this.b.accept(oi.a(dko.ea).a(oj.a(dyl.aG).a($$1x -> ol.a().a(om.c, $$1x < 8 ? oq.a(dko.ea, "_height" + $$1x * 2) : $$1))));
      this.a(dko.ea, oq.a(dko.ea, "_height2"));
      this.b.accept(c(dko.ec, $$1));
   }

   private void ap() {
      this.b.accept(oi.a(dko.ox, ol.a().a(om.c, oq.a(dko.ox))).a(b()));
   }

   private void aq() {
      alz $$0 = ov.a.create(dko.pv, this.c);
      this.a(dko.pv, $$0);
      this.b.accept(oi.a(dko.pv).a(oj.a(dyl.bk).a($$0x -> ol.a().a(om.c, this.a(dko.pv, "_" + $$0x.c(), os.c, ot::b)))));
   }

   private void ar() {
      this.a(cxt.xl);
      this.b.accept(oi.a(dko.oD).a(oj.a(dyl.at).a($$0 -> ol.a().a(om.c, this.a(dko.oD, "_stage" + $$0, os.ao, ot::c)))));
   }

   private void as() {
      this.a(cxt.pO);
      this.b
         .accept(
            oi.a(dko.fW)
               .a(
                  oj.a(dyl.a, dyl.N, dyl.M, dyl.O, dyl.P)
                     .a(false, false, false, false, false, ol.a().a(om.c, oq.a(dko.fW, "_ns")))
                     .a(false, true, false, false, false, ol.a().a(om.c, oq.a(dko.fW, "_n")).a(om.b, om.a.b))
                     .a(false, false, true, false, false, ol.a().a(om.c, oq.a(dko.fW, "_n")))
                     .a(false, false, false, true, false, ol.a().a(om.c, oq.a(dko.fW, "_n")).a(om.b, om.a.c))
                     .a(false, false, false, false, true, ol.a().a(om.c, oq.a(dko.fW, "_n")).a(om.b, om.a.d))
                     .a(false, true, true, false, false, ol.a().a(om.c, oq.a(dko.fW, "_ne")))
                     .a(false, true, false, true, false, ol.a().a(om.c, oq.a(dko.fW, "_ne")).a(om.b, om.a.b))
                     .a(false, false, false, true, true, ol.a().a(om.c, oq.a(dko.fW, "_ne")).a(om.b, om.a.c))
                     .a(false, false, true, false, true, ol.a().a(om.c, oq.a(dko.fW, "_ne")).a(om.b, om.a.d))
                     .a(false, false, true, true, false, ol.a().a(om.c, oq.a(dko.fW, "_ns")))
                     .a(false, true, false, false, true, ol.a().a(om.c, oq.a(dko.fW, "_ns")).a(om.b, om.a.b))
                     .a(false, true, true, true, false, ol.a().a(om.c, oq.a(dko.fW, "_nse")))
                     .a(false, true, false, true, true, ol.a().a(om.c, oq.a(dko.fW, "_nse")).a(om.b, om.a.b))
                     .a(false, false, true, true, true, ol.a().a(om.c, oq.a(dko.fW, "_nse")).a(om.b, om.a.c))
                     .a(false, true, true, false, true, ol.a().a(om.c, oq.a(dko.fW, "_nse")).a(om.b, om.a.d))
                     .a(false, true, true, true, true, ol.a().a(om.c, oq.a(dko.fW, "_nsew")))
                     .a(true, false, false, false, false, ol.a().a(om.c, oq.a(dko.fW, "_attached_ns")))
                     .a(true, false, true, false, false, ol.a().a(om.c, oq.a(dko.fW, "_attached_n")))
                     .a(true, false, false, true, false, ol.a().a(om.c, oq.a(dko.fW, "_attached_n")).a(om.b, om.a.c))
                     .a(true, true, false, false, false, ol.a().a(om.c, oq.a(dko.fW, "_attached_n")).a(om.b, om.a.b))
                     .a(true, false, false, false, true, ol.a().a(om.c, oq.a(dko.fW, "_attached_n")).a(om.b, om.a.d))
                     .a(true, true, true, false, false, ol.a().a(om.c, oq.a(dko.fW, "_attached_ne")))
                     .a(true, true, false, true, false, ol.a().a(om.c, oq.a(dko.fW, "_attached_ne")).a(om.b, om.a.b))
                     .a(true, false, false, true, true, ol.a().a(om.c, oq.a(dko.fW, "_attached_ne")).a(om.b, om.a.c))
                     .a(true, false, true, false, true, ol.a().a(om.c, oq.a(dko.fW, "_attached_ne")).a(om.b, om.a.d))
                     .a(true, false, true, true, false, ol.a().a(om.c, oq.a(dko.fW, "_attached_ns")))
                     .a(true, true, false, false, true, ol.a().a(om.c, oq.a(dko.fW, "_attached_ns")).a(om.b, om.a.b))
                     .a(true, true, true, true, false, ol.a().a(om.c, oq.a(dko.fW, "_attached_nse")))
                     .a(true, true, false, true, true, ol.a().a(om.c, oq.a(dko.fW, "_attached_nse")).a(om.b, om.a.b))
                     .a(true, false, true, true, true, ol.a().a(om.c, oq.a(dko.fW, "_attached_nse")).a(om.b, om.a.c))
                     .a(true, true, true, false, true, ol.a().a(om.c, oq.a(dko.fW, "_attached_nse")).a(om.b, om.a.d))
                     .a(true, true, true, true, true, ol.a().a(om.c, oq.a(dko.fW, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dko.fV);
      this.b.accept(oi.a(dko.fV).a(oj.a(dyl.a, dyl.x).a(($$0, $$1) -> ol.a().a(om.c, ot.a(dko.fV, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alz a(int $$0, String $$1, ot $$2) {
      switch ($$0) {
         case 1:
            return os.bq.a(oq.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return os.br.a(oq.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return os.bs.a(oq.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return os.bt.a(oq.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private alz a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", ot.b(ot.H(dko.mA)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ot.b(ot.a(dko.mA, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ot.b(ot.a(dko.mA, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cxt.kD);
      this.b.accept(oi.a(dko.mA).a(oj.a(dyl.aE, dyl.aF).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cxt.kE);
      Function<Integer, alz> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ot $$2 = ot.a($$1);
         return os.bB.a(dko.mB, $$1, $$2, this.c);
      };
      this.b.accept(oi.a(dko.mB).a(oj.a(drx.c).a($$1 -> ol.a().a(om.c, $$0.apply($$1)))));
   }

   private void G(dkm $$0) {
      this.d($$0);
      alz $$1 = oq.a($$0);
      oh $$2 = oh.a($$0);
      og.c $$3 = ae.a(og.a(), $$1x -> a.stream().<jm>map(Pair::getFirst).map(dpo::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jm, Function<alz, ol>> $$4 : a) {
         dym $$5 = dpo.b((jm)$$4.getFirst());
         Function<alz, ol> $$6 = (Function<alz, ol>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(og.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void H(dkm $$0) {
      alz $$1 = ov.j.create($$0, this.c);
      alz $$2 = ov.k.get($$0).a($$1x -> $$1x.a(ou.i, ot.a($$0, "_side_tall"))).a($$0, "_side_tall", this.c);
      alz $$3 = ov.k.get($$0).a($$1x -> $$1x.a(ou.i, ot.a($$0, "_side_small"))).a($$0, "_side_small", this.c);
      oh $$4 = oh.a($$0);
      og.c $$5 = og.a().a(dpm.b, false);
      $$4.a(og.a().a(dpm.b, true), ol.a().a(om.c, $$1));
      $$4.a($$5, ol.a().a(om.c, $$1));
      a.stream().<jm>map(Pair::getFirst).forEach($$2x -> {
         dys<dzg> $$3x = dpm.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dzg.a);
         }
      });

      for (Pair<jm, Function<alz, ol>> $$6 : a) {
         jm $$7 = (jm)$$6.getFirst();
         dys<dzg> $$8 = dpm.a($$7);
         if ($$8 != null) {
            Function<alz, ol> $$9 = (Function<alz, ol>)$$6.getSecond();
            $$4.a(og.a().a($$8, dzg.c), $$9.apply($$2));
            $$4.a(og.a().a($$8, dzg.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void I(dkm $$0) {
      oj $$1 = oj.a(doe.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         ot $$3 = ot.c(ot.a($$0, $$2));
         alz $$4 = ob.e.b.a().a($$0, $$2, $$3, this.c);
         return ol.a().a(om.c, $$4);
      });
      this.d($$0);
      this.b.accept(oi.a($$0).a($$1));
   }

   private void aw() {
      alz $$0 = ot.a(dko.rp, "_bottom");
      ot $$1 = new ot().a(ou.e, $$0).a(ou.f, ot.a(dko.rp, "_top")).a(ou.i, ot.a(dko.rp, "_side"));
      ot $$2 = new ot().a(ou.e, $$0).a(ou.f, ot.a(dko.rp, "_top_bloom")).a(ou.i, ot.a(dko.rp, "_side_bloom"));
      alz $$3 = os.n.a(dko.rp, "", $$1, this.c);
      alz $$4 = os.n.a(dko.rp, "_bloom", $$2, this.c);
      this.b.accept(oi.a(dko.rp).a(oj.a(dyl.F).a($$2x -> ol.a().a(om.c, $$2x ? $$4 : $$3))));
      this.a(cxt.gw, $$3);
   }

   private void ax() {
      dkm $$0 = dko.ct;
      alz $$1 = oq.a($$0);
      oh $$2 = oh.a($$0);
      List.of(Pair.of(jm.c, om.a.a), Pair.of(jm.f, om.a.b), Pair.of(jm.d, om.a.c), Pair.of(jm.e, om.a.d)).forEach($$2x -> {
         jm $$3 = (jm)$$2x.getFirst();
         om.a $$4 = (om.a)$$2x.getSecond();
         og.c $$5 = og.a().a(dyl.S, $$3);
         $$2.a($$5, ol.a().a(om.c, $$1).a(om.b, $$4).a(om.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, oq.a($$0, "_inventory"));
      i.clear();
   }

   private void a(oh $$0, og.c $$1, om.a $$2) {
      List.of(Pair.of(dyl.bq, os.aN), Pair.of(dyl.br, os.aO), Pair.of(dyl.bs, os.aP), Pair.of(dyl.bt, os.aQ), Pair.of(dyl.bu, os.aR), Pair.of(dyl.bv, os.aS))
         .forEach($$3 -> {
            dym $$4 = (dym)$$3.getFirst();
            or $$5 = (or)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(oh $$0, og.c $$1, om.a $$2, dym $$3, or $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ot $$7 = new ot().a(ou.b, ot.a(dko.ct, $$6));
      ob.d $$8 = new ob.d($$4, $$6);
      alz $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dko.ct, $$6, $$7, this.c));
      $$0.a(og.a($$1, og.a().a($$3, $$5)), ol.a().a(om.c, $$9).a(om.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dko.le, os.c.a(dko.le, ot.b(oq.a("magma")), this.c)));
   }

   private void J(dkm $$0) {
      this.b($$0, ov.r);
      os.bI.a(oq.a($$0.j()), ot.v($$0), this.c);
   }

   private void b(dkm $$0, dkm $$1, ob.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dkm $$0, dkm $$1) {
      os.bJ.a(oq.a($$0.j()), ot.v($$1), this.c);
   }

   private void az() {
      alz $$0 = oq.a(dko.b);
      alz $$1 = oq.a(dko.b, "_mirrored");
      this.b.accept(a(dko.fb, $$0, $$1));
      this.a(dko.fb, $$0);
   }

   private void aA() {
      alz $$0 = oq.a(dko.te);
      alz $$1 = oq.a(dko.te, "_mirrored");
      this.b.accept(a(dko.ty, $$0, $$1).a(f()));
      this.a(dko.ty, $$0);
   }

   private void n(dkm $$0, dkm $$1) {
      this.a($$0, ob.e.b);
      ot $$2 = ot.d(ot.a($$0, "_pot"));
      alz $$3 = ob.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alz $$0 = ot.a(dko.pG, "_bottom");
      alz $$1 = ot.a(dko.pG, "_top_off");
      alz $$2 = ot.a(dko.pG, "_top");
      alz[] $$3 = new alz[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ot $$5 = new ot().a(ou.e, $$0).a(ou.f, $$4 == 0 ? $$1 : $$2).a(ou.i, ot.a(dko.pG, "_side" + $$4));
         $$3[$$4] = os.n.a(dko.pG, "_" + $$4, $$5, this.c);
      }

      this.b.accept(oi.a(dko.pG).a(oj.a(dyl.ba).a($$1x -> ol.a().a(om.c, $$3[$$1x]))));
      this.a(cxt.xJ, $$3[0]);
   }

   private ol a(jo $$0, ol $$1) {
      switch ($$0) {
         case b:
            return $$1.a(om.a, om.a.b);
         case c:
            return $$1.a(om.a, om.a.b).a(om.b, om.a.c);
         case d:
            return $$1.a(om.a, om.a.b).a(om.b, om.a.d);
         case a:
            return $$1.a(om.a, om.a.b).a(om.b, om.a.b);
         case f:
            return $$1.a(om.a, om.a.d).a(om.b, om.a.c);
         case g:
            return $$1.a(om.a, om.a.d);
         case h:
            return $$1.a(om.a, om.a.d).a(om.b, om.a.b);
         case e:
            return $$1.a(om.a, om.a.d).a(om.b, om.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(om.b, om.a.c);
         case i:
            return $$1.a(om.b, om.a.d);
         case j:
            return $$1.a(om.b, om.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      alz $$0 = ot.a(dko.pw, "_top");
      alz $$1 = ot.a(dko.pw, "_bottom");
      alz $$2 = ot.a(dko.pw, "_side");
      alz $$3 = ot.a(dko.pw, "_lock");
      ot $$4 = new ot().a(ou.o, $$2).a(ou.m, $$2).a(ou.l, $$2).a(ou.c, $$0).a(ou.j, $$0).a(ou.k, $$1).a(ou.n, $$3);
      alz $$5 = os.b.a(dko.pw, $$4, this.c);
      this.b.accept(oi.a(dko.pw, ol.a().a(om.c, $$5)).a(oj.a(dyl.U).a($$0x -> this.a($$0x, ol.a()))));
   }

   private void aD() {
      dkm $$0 = dko.n;
      alz $$1 = oq.a($$0);
      ov $$2 = ov.a.get($$0);
      dkm $$3 = dko.jZ;
      alz $$4 = os.ab.a($$3, $$2.b(), this.c);
      alz $$5 = os.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      md.a().filter(me::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dko.rA).a(md.x).a(dko.rA, dko.rY).a(dko.rE, dko.rI).a(md.z);
      this.i(dko.rz).a(md.B).a(dko.rz, dko.rX).a(dko.rD, dko.rH).a(md.D);
      this.i(dko.ry).a(md.F).a(dko.ry, dko.rW).a(dko.rC, dko.rG).a(md.H);
      this.i(dko.rx).a(md.J).a(dko.rx, dko.rV).a(dko.rB, dko.rF).a(md.L);
      this.x(dko.sF);
      this.x(dko.sG);
      this.x(dko.sH);
      this.x(dko.sI);
      this.i(dko.sF, dko.sJ);
      this.i(dko.sG, dko.sK);
      this.i(dko.sH, dko.sL);
      this.i(dko.sI, dko.sM);
      this.n(dko.a);
      this.c(dko.nx, dko.a);
      this.c(dko.nw, dko.a);
      this.n(dko.gc);
      this.n(dko.ed);
      this.c(dko.ny, dko.J);
      this.n(dko.fO);
      this.n(dko.mz);
      this.n(dko.fF);
      this.n(dko.gf);
      this.a(cxt.uU);
      this.n(dko.pB);
      this.n(dko.J);
      this.n(dko.K);
      this.n(dko.im);
      this.a(cxt.gf);
      this.o(dko.qh, dko.qy);
      this.o(dko.qi, dko.qz);
      this.o(dko.qj, dko.qA);
      this.o(dko.qk, dko.qB);
      this.o(dko.ql, dko.qC);
      this.o(dko.qm, dko.qD);
      this.o(dko.qn, dko.qE);
      this.o(dko.qo, dko.qF);
      this.o(dko.qp, dko.qG);
      this.o(dko.qq, dko.qH);
      this.o(dko.qr, dko.qI);
      this.o(dko.qs, dko.qJ);
      this.o(dko.qt, dko.qK);
      this.o(dko.qu, dko.qL);
      this.o(dko.qv, dko.qM);
      this.o(dko.qw, dko.qN);
      this.o(dko.qg, dko.qx);
      this.n(dko.nv);
      this.n(dko.gH);
      this.n(dko.rk);
      this.n(dko.sS);
      this.t(dko.sT);
      this.t(dko.sU);
      this.u(dko.tD);
      this.u(dko.tE);
      this.aj();
      this.g(dko.sX, dko.sV);
      this.H(dko.tQ);
      this.I(dko.tR);
      this.a(dko.tP);
      this.q(dko.sW);
      this.a(dko.in, cxt.hP);
      this.a(cxt.hP);
      this.aE();
      this.a(dko.li, cxt.jp);
      this.a(cxt.jp);
      this.f(dko.bX, ot.a(dko.bF, "_side"));
      this.a(dko.U);
      this.a(dko.V);
      this.a(dko.iS);
      this.a(dko.cF);
      this.a(dko.cG);
      this.a(dko.cH);
      this.a(dko.fS);
      this.a(dko.fT);
      this.a(dko.fX);
      this.a(dko.Q);
      this.a(dko.W);
      this.a(dko.R);
      this.a(dko.co);
      this.a(dko.S);
      this.a(dko.T);
      this.a(dko.cp);
      this.b(dko.pE, ov.d);
      this.a(dko.pD);
      this.a(dko.aY);
      this.a(dko.aZ);
      this.a(dko.ba);
      this.a(dko.hr);
      this.a(dko.dV);
      this.a(dko.dW);
      this.a(dko.hq);
      this.a(dko.pX);
      this.a(dko.nr);
      this.a(dko.ee);
      this.a(dko.k);
      this.a(dko.pF);
      this.a(dko.fN);
      this.a(dko.ep);
      this.a(dko.O);
      this.a(dko.pC);
      this.a(dko.eb);
      this.b(dko.eg, ov.g);
      this.b(dko.pL, ov.d);
      this.b(dko.fo, ov.d);
      this.n(dko.ag);
      this.n(dko.gp);
      this.a(dko.lf);
      this.a(dko.bf);
      this.a(dko.iT);
      this.a(dko.cv);
      this.a(dko.qf);
      this.a(dko.iz);
      this.a(dko.oT);
      this.a(dko.ej);
      this.a(dko.ek);
      this.b(dko.cA, ov.b);
      this.h(dko.cB);
      this.a(dko.aV);
      this.b(dko.bD, ov.w);
      this.a(cxt.cZ);
      this.b(dko.cr, ov.f);
      this.b(dko.py, ov.d);
      this.a(dko.oK);
      this.a(dko.aW);
      this.a(dko.qO);
      this.a(dko.qP);
      this.a(dko.ri);
      this.a(dko.sP);
      this.a(dko.tA);
      this.a(dko.tB);
      this.a(dko.tC);
      this.e(dko.rn);
      this.n(dko.tO);
      this.aD();
      this.a(dko.rv);
      this.a(dko.rw);
      this.a(dko.rr);
      this.a(dko.rs);
      this.a(dko.rt);
      this.a(dko.ru);
      this.k(dko.rr, dko.rR);
      this.k(dko.rs, dko.rT);
      this.k(dko.rt, dko.rS);
      this.k(dko.ru, dko.rU);
      this.j(dko.sh);
      this.j(dko.si);
      this.j(dko.sk);
      this.j(dko.sj);
      this.a(dko.sh, dko.sl);
      this.a(dko.si, dko.sm);
      this.a(dko.sk, dko.so);
      this.a(dko.sj, dko.sn);
      this.l(dko.sp);
      this.l(dko.sq);
      this.l(dko.ss);
      this.l(dko.sr);
      this.b(dko.sp, dko.st);
      this.b(dko.sq, dko.su);
      this.b(dko.ss, dko.sw);
      this.b(dko.sr, dko.sv);
      this.a(dko.sx);
      this.a(dko.sy);
      this.a(dko.sz);
      this.a(dko.sA);
      this.k(dko.sx, dko.sB);
      this.k(dko.sy, dko.sC);
      this.k(dko.sz, dko.sD);
      this.k(dko.sA, dko.sE);
      this.j(dko.hm, dko.co);
      this.j(dko.hn, dko.cp);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dko.oB, dko.oC);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.A(dko.kO);
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
      this.G(dko.ft);
      this.G(dko.fu);
      this.G(dko.ro);
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
      this.F(dko.cX);
      this.d(dko.cX);
      this.F(dko.ov);
      this.g();
      this.F(dko.sZ);
      this.l(dko.cw, dko.cx);
      this.l(dko.en, dko.eo);
      this.a(dko.cI, dko.n, ot::c);
      this.a(dko.ot, dko.p, ot::d);
      this.z(dko.oR);
      this.z(dko.oI);
      this.w(dko.bb);
      this.w(dko.hy);
      this.C();
      this.E(dko.oz);
      this.E(dko.oA);
      this.e(dko.fl, oq.a(dko.fl));
      this.a(dko.el, ov.d);
      this.a(dko.em, ov.d);
      this.a(dko.tz);
      this.a(dko.lh, ov.d);
      this.f(dko.j);
      this.f(dko.tc);
      this.f(dko.L);
      this.g(dko.M);
      this.g(dko.P);
      this.f(dko.N);
      this.e(dko.I);
      this.b(dko.tJ, ov.f);
      this.a(dko.iA, ov.d, ov.e);
      this.a(dko.kS, ov.x, ov.y);
      this.a(dko.hv, ov.x, ov.y);
      this.a(dko.tF, ov.d, ov.e);
      this.a(dko.tG, ov.d, ov.e);
      this.a(dko.tH, ov.d, ov.e);
      this.c(dko.oo, ov.i);
      this.z();
      this.a(dko.pz, ot::B);
      this.a(dko.pA, ot::D);
      this.a(dko.kY, dyl.at, 0, 1, 2, 3);
      this.a(dko.gI, dyl.aw, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dko.fE, dyl.at, 0, 1, 1, 2);
      this.a(dko.gJ, dyl.aw, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dko.cJ, dyl.aw, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dko.kV, ob.e.b, dyl.ar, 0, 1);
      this.i();
      this.h();
      this.a(oq.a("decorated_pot"), dko.iR).b(dko.tK);
      this.a(oq.a("banner"), dko.n)
         .a(os.bK, dko.ja, dko.jb, dko.jc, dko.jd, dko.je, dko.jf, dko.jg, dko.jh, dko.ji, dko.jj, dko.jk, dko.jl, dko.jm, dko.jn, dko.jo, dko.jp)
         .b(dko.jq, dko.jr, dko.js, dko.jt, dko.ju, dko.jv, dko.jw, dko.jx, dko.jy, dko.jz, dko.jA, dko.jB, dko.jC, dko.jD, dko.jE, dko.jF);
      this.a(oq.a("bed"), dko.n)
         .b(dko.bg, dko.bh, dko.bi, dko.bj, dko.bk, dko.bl, dko.bm, dko.bn, dko.bo, dko.bp, dko.bq, dko.br, dko.bs, dko.bt, dko.bu, dko.bv);
      this.m(dko.bg, dko.bH);
      this.m(dko.bh, dko.bI);
      this.m(dko.bi, dko.bJ);
      this.m(dko.bj, dko.bK);
      this.m(dko.bk, dko.bL);
      this.m(dko.bl, dko.bM);
      this.m(dko.bm, dko.bN);
      this.m(dko.bn, dko.bO);
      this.m(dko.bo, dko.bP);
      this.m(dko.bp, dko.bQ);
      this.m(dko.bq, dko.bR);
      this.m(dko.br, dko.bS);
      this.m(dko.bs, dko.bT);
      this.m(dko.bt, dko.bU);
      this.m(dko.bu, dko.bV);
      this.m(dko.bv, dko.bW);
      this.a(oq.a("skull"), dko.ej)
         .a(os.bL, dko.hc, dko.ha, dko.gY, dko.gU, dko.gW, dko.hg)
         .a(dko.he)
         .b(dko.hd, dko.hf, dko.hb, dko.gZ, dko.gV, dko.gX, dko.hh);
      this.J(dko.lk);
      this.J(dko.ll);
      this.J(dko.lm);
      this.J(dko.ln);
      this.J(dko.lo);
      this.J(dko.lp);
      this.J(dko.lq);
      this.J(dko.lr);
      this.J(dko.ls);
      this.J(dko.lt);
      this.J(dko.lu);
      this.J(dko.lv);
      this.J(dko.lw);
      this.J(dko.lx);
      this.J(dko.ly);
      this.J(dko.lz);
      this.J(dko.lA);
      this.b(dko.ns, ov.r);
      this.c(dko.ns);
      this.a(oq.a("chest"), dko.n).b(dko.cD, dko.hl);
      this.a(oq.a("ender_chest"), dko.cv).b(dko.fU);
      this.f(dko.fL, dko.cv).a(dko.fL, dko.la);
      this.a(dko.aT);
      this.a(dko.aU);
      this.a(dko.lR);
      this.a(dko.lS);
      this.a(dko.lT);
      this.a(dko.lU);
      this.a(dko.lV);
      this.a(dko.lW);
      this.a(dko.lX);
      this.a(dko.lY);
      this.a(dko.lZ);
      this.a(dko.ma);
      this.a(dko.mb);
      this.a(dko.mc);
      this.a(dko.md);
      this.a(dko.me);
      this.a(dko.mf);
      this.a(dko.mg);
      this.a(ov.a, dko.mh, dko.mi, dko.mj, dko.mk, dko.ml, dko.mm, dko.mn, dko.mo, dko.mp, dko.mq, dko.mr, dko.ms, dko.mt, dko.mu, dko.mv, dko.mw);
      this.a(dko.iR);
      this.a(dko.hz);
      this.a(dko.hA);
      this.a(dko.hB);
      this.a(dko.hC);
      this.a(dko.hD);
      this.a(dko.hE);
      this.a(dko.hF);
      this.a(dko.hG);
      this.a(dko.hH);
      this.a(dko.hI);
      this.a(dko.hJ);
      this.a(dko.hK);
      this.a(dko.hL);
      this.a(dko.hM);
      this.a(dko.hN);
      this.a(dko.hO);
      this.a(dko.rj);
      this.h(dko.aX, dko.fm);
      this.h(dko.ev, dko.hP);
      this.h(dko.ew, dko.hQ);
      this.h(dko.ex, dko.hR);
      this.h(dko.ey, dko.hS);
      this.h(dko.ez, dko.hT);
      this.h(dko.eA, dko.hU);
      this.h(dko.eB, dko.hV);
      this.h(dko.eC, dko.hW);
      this.h(dko.eD, dko.hX);
      this.h(dko.eE, dko.hY);
      this.h(dko.eF, dko.hZ);
      this.h(dko.eG, dko.ia);
      this.h(dko.eH, dko.ib);
      this.h(dko.eI, dko.ic);
      this.h(dko.eJ, dko.id);
      this.h(dko.eK, dko.ie);
      this.b(ov.p, dko.lB, dko.lC, dko.lD, dko.lE, dko.lF, dko.lG, dko.lH, dko.lI, dko.lJ, dko.lK, dko.lL, dko.lM, dko.lN, dko.lO, dko.lP, dko.lQ);
      this.g(dko.bH, dko.iB);
      this.g(dko.bI, dko.iC);
      this.g(dko.bJ, dko.iD);
      this.g(dko.bK, dko.iE);
      this.g(dko.bL, dko.iF);
      this.g(dko.bM, dko.iG);
      this.g(dko.bN, dko.iH);
      this.g(dko.bO, dko.iI);
      this.g(dko.bP, dko.iJ);
      this.g(dko.bQ, dko.iK);
      this.g(dko.bR, dko.iL);
      this.g(dko.bS, dko.iM);
      this.g(dko.bT, dko.iN);
      this.g(dko.bU, dko.iO);
      this.g(dko.bV, dko.iP);
      this.g(dko.bW, dko.iQ);
      this.a(dko.td);
      this.a(dko.eZ);
      this.a(dko.bB, dko.gq, ob.e.a);
      this.a(dko.bY, dko.gr, ob.e.b);
      this.a(dko.ca, dko.gs, ob.e.b);
      this.a(dko.cb, dko.gt, ob.e.b);
      this.a(dko.cc, dko.gu, ob.e.b);
      this.a(dko.cd, dko.gv, ob.e.b);
      this.a(dko.ce, dko.gw, ob.e.b);
      this.a(dko.cf, dko.gx, ob.e.b);
      this.a(dko.cg, dko.gy, ob.e.b);
      this.a(dko.ch, dko.gz, ob.e.b);
      this.a(dko.ci, dko.gA, ob.e.b);
      this.a(dko.cj, dko.gB, ob.e.b);
      this.a(dko.cl, dko.gC, ob.e.b);
      this.a(dko.ck, dko.gD, ob.e.b);
      this.a(dko.cn, dko.gE, ob.e.b);
      this.a(dko.cm, dko.gF, ob.e.b);
      this.a(dko.bC, dko.gG, ob.e.b);
      this.a(dko.bZ, dko.gg, ob.e.b);
      this.H();
      this.v(dko.fh);
      this.v(dko.fi);
      this.v(dko.fj);
      this.a(dko.bA, ob.e.a);
      this.b(dko.ef, ob.e.a);
      this.a(cxt.dQ);
      this.b(dko.mx, dko.my, ob.e.b);
      this.a(cxt.dR);
      this.c(dko.my);
      this.b(dko.tb, ob.e.b);
      this.c(dko.tb);
      this.c(dko.sR);
      this.b(dko.oU, dko.oV, ob.e.b);
      this.b(dko.oW, dko.oX, ob.e.b);
      this.a(dko.oU, "_plant");
      this.c(dko.oV);
      this.a(dko.oW, "_plant");
      this.c(dko.oX);
      this.a(dko.nt, ob.e.a, ot.c(ot.a(dko.nu, "_stage0")));
      this.m();
      this.a(dko.bz, ob.e.b);
      this.c(dko.iV, ob.e.b);
      this.c(dko.iW, ob.e.b);
      this.c(dko.iX, ob.e.b);
      this.c(dko.iY, ob.e.a);
      this.c(dko.iZ, ob.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dko.mR, dko.mM, dko.mH, dko.mC, dko.nb, dko.mW, dko.nl, dko.ng);
      this.a(dko.mS, dko.mN, dko.mI, dko.mD, dko.nc, dko.mX, dko.nm, dko.nh);
      this.a(dko.mT, dko.mO, dko.mJ, dko.mE, dko.nd, dko.mY, dko.nn, dko.ni);
      this.a(dko.mU, dko.mP, dko.mK, dko.mF, dko.ne, dko.mZ, dko.no, dko.nj);
      this.a(dko.mV, dko.mQ, dko.mL, dko.mG, dko.nf, dko.na, dko.np, dko.nk);
      this.e(dko.fs, dko.fq);
      this.e(dko.fr, dko.fp);
      this.m(dko.af).c(dko.af).a(dko.aA);
      this.m(dko.ar).c(dko.ar).a(dko.aJ);
      this.a(dko.ar, dko.du, dko.dE);
      this.b(dko.aS, ov.t);
      this.m(dko.ab).c(dko.ab).a(dko.ax);
      this.m(dko.am).c(dko.am).a(dko.aF);
      this.a(dko.am, dko.dn, dko.dz);
      this.a(dko.D, dko.gl, ob.e.b);
      this.b(dko.aO, ov.t);
      this.m(dko.ac).d(dko.ac).a(dko.ay);
      this.m(dko.an).d(dko.an).a(dko.aG);
      this.a(dko.an, dko.do, dko.dA);
      this.a(dko.E, dko.gm, ob.e.b);
      this.b(dko.aP, ov.t);
      this.m(dko.Z).c(dko.Z).a(dko.av);
      this.m(dko.ak).c(dko.ak).a(dko.aD);
      this.a(dko.ak, dko.dm, dko.dy);
      this.a(dko.B, dko.gj, ob.e.b);
      this.b(dko.aM, ov.t);
      this.m(dko.X).c(dko.X).a(dko.at);
      this.m(dko.aq).c(dko.aq).a(dko.aB);
      this.a(dko.aq, dko.dk, dko.dw);
      this.a(dko.z, dko.gh, ob.e.b);
      this.b(dko.aK, ov.t);
      this.m(dko.Y).c(dko.Y).a(dko.au);
      this.m(dko.aj).c(dko.aj).a(dko.aC);
      this.a(dko.aj, dko.dl, dko.dx);
      this.a(dko.A, dko.gi, ob.e.b);
      this.b(dko.aL, ov.t);
      this.m(dko.ad).c(dko.ad).a(dko.az);
      this.m(dko.ao).c(dko.ao).a(dko.aH);
      this.a(dko.ao, dko.dq, dko.dC);
      this.a(dko.F, dko.gn, ob.e.b);
      this.b(dko.aQ, ov.t);
      this.m(dko.ae).c(dko.ae).a(dko.u);
      this.m(dko.ap).c(dko.ap).a(dko.aI);
      this.a(dko.ap, dko.dr, dko.dD);
      this.a(dko.G, dko.go, ob.e.b);
      this.b(dko.aR, ov.t);
      this.m(dko.aa).c(dko.aa).a(dko.aw);
      this.m(dko.al).c(dko.al).a(dko.aE);
      this.a(dko.al, dko.dp, dko.dB);
      this.a(dko.C, dko.gk, ob.e.b);
      this.b(dko.aN, ov.t);
      this.m(dko.oN).b(dko.oN).a(dko.oP);
      this.m(dko.oO).b(dko.oO).a(dko.oQ);
      this.a(dko.oO, dko.ds, dko.dF);
      this.a(dko.oS, dko.pH, ob.e.b);
      this.n(dko.oY, dko.pJ);
      this.m(dko.oE).b(dko.oE).a(dko.oG);
      this.m(dko.oF).b(dko.oF).a(dko.oH);
      this.a(dko.oF, dko.dt, dko.dG);
      this.a(dko.oJ, dko.pI, ob.e.b);
      this.n(dko.oL, dko.pK);
      this.m(dko.ai).d(dko.ai);
      this.m(dko.as).d(dko.as);
      this.a(dko.x, dko.dv, dko.dH);
      this.b(dko.oM, ob.e.b);
      this.a(cxt.dN);
      this.j(dko.dK);
      this.l(dko.ip);
      this.u();
      this.o(dko.cY);
      this.p(dko.bw);
      this.p(dko.bx);
      this.p(dko.hx);
      this.t();
      this.r(dko.gb);
      this.r(dko.lb);
      this.r(dko.lc);
      this.s(dko.hi);
      this.s(dko.hj);
      this.s(dko.hk);
      this.o();
      this.p();
      this.d(dko.cL, ov.h);
      this.d(dko.or, ov.h);
      this.d(dko.oq, ov.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dko.eY, dko.fg);
      this.k(dko.m, dko.fc);
      this.k(dko.eX, dko.ff);
      this.k(dko.eW, dko.fe);
      this.az();
      this.k(dko.eV, dko.fd);
      this.aA();
      cyy.b().forEach($$0 -> this.a($$0, oq.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dko.io);
      oj.a<Integer> $$0 = oj.a(dyl.aQ);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alz $$3 = ot.a(cxt.hQ, $$2);
         $$0.a($$1, ol.a().a(om.c, os.aa.a(dko.io, $$2, ot.h($$3), this.c)));
         os.bC.a(oq.a(cxt.hQ, $$2), ot.k($$3), this.c);
      }

      this.b.accept(oi.a(dko.io).a($$0));
   }

   private void o(dkm $$0, dkm $$1) {
      this.a($$0.j());
      ot $$2 = ot.b(ot.H($$0));
      ot $$3 = ot.b(ot.a($$0, "_lit"));
      alz $$4 = os.bM.a($$0, "_one_candle", $$2, this.c);
      alz $$5 = os.bN.a($$0, "_two_candles", $$2, this.c);
      alz $$6 = os.bO.a($$0, "_three_candles", $$2, this.c);
      alz $$7 = os.bP.a($$0, "_four_candles", $$2, this.c);
      alz $$8 = os.bM.a($$0, "_one_candle_lit", $$3, this.c);
      alz $$9 = os.bN.a($$0, "_two_candles_lit", $$3, this.c);
      alz $$10 = os.bO.a($$0, "_three_candles_lit", $$3, this.c);
      alz $$11 = os.bP.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            oi.a($$0)
               .a(
                  oj.a(dyl.aA, dyl.r)
                     .a(1, false, ol.a().a(om.c, $$4))
                     .a(2, false, ol.a().a(om.c, $$5))
                     .a(3, false, ol.a().a(om.c, $$6))
                     .a(4, false, ol.a().a(om.c, $$7))
                     .a(1, true, ol.a().a(om.c, $$8))
                     .a(2, true, ol.a().a(om.c, $$9))
                     .a(3, true, ol.a().a(om.c, $$10))
                     .a(4, true, ol.a().a(om.c, $$11))
               )
         );
      alz $$12 = os.bQ.a($$1, ot.a($$0, false), this.c);
      alz $$13 = os.bQ.a($$1, "_lit", ot.a($$0, true), this.c);
      this.b.accept(oi.a($$1).a(a(dyl.r, $$13, $$12)));
   }

   class a {
      private final alz b;

      public a(final alz $$0, final dkm $$1) {
         this.b = os.aa.a($$0, ot.v($$1), ob.this.c);
      }

      public ob.a a(dkm... $$0) {
         for (dkm $$1 : $$0) {
            ob.this.b.accept(ob.c($$1, this.b));
         }

         return this;
      }

      public ob.a b(dkm... $$0) {
         for (dkm $$1 : $$0) {
            ob.this.c($$1);
         }

         return this.a($$0);
      }

      public ob.a a(or $$0, dkm... $$1) {
         for (dkm $$2 : $$1) {
            $$0.a(oq.a($$2.j()), ot.v($$2), ob.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final ot b;
      private final Map<or, alz> c = Maps.newHashMap();
      @Nullable
      private me d;
      @Nullable
      private alz e;
      private final Set<dkm> f = new HashSet<>();

      public b(final ot $$0) {
         this.b = $$0;
      }

      public ob.b a(dkm $$0, or $$1) {
         this.e = $$1.a($$0, this.b, ob.this.c);
         if (ob.this.f.containsKey($$0)) {
            ob.this.b.accept(ob.this.f.get($$0).create($$0, this.e, this.b, ob.this.c));
         } else {
            ob.this.b.accept(ob.c($$0, this.e));
         }

         return this;
      }

      public ob.b a(dkm $$0, dkm $$1) {
         alz $$2 = oq.a($$0);
         ob.this.b.accept(ob.c($$1, $$2));
         ob.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public ob.b a(dkm $$0) {
         alz $$1 = os.s.a($$0, this.b, ob.this.c);
         alz $$2 = os.t.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.b($$0, $$1, $$2));
         alz $$3 = os.u.a($$0, this.b, ob.this.c);
         ob.this.a($$0, $$3);
         return this;
      }

      public ob.b b(dkm $$0) {
         alz $$1 = os.M.a($$0, this.b, ob.this.c);
         alz $$2 = os.N.a($$0, this.b, ob.this.c);
         alz $$3 = os.O.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$1, $$2, $$3));
         alz $$4 = os.P.a($$0, this.b, ob.this.c);
         ob.this.a($$0, $$4);
         return this;
      }

      public ob.b c(dkm $$0) {
         ot $$1 = ot.q($$0);
         alz $$2 = os.D.a($$0, $$1, ob.this.c);
         alz $$3 = os.E.a($$0, $$1, ob.this.c);
         alz $$4 = os.F.a($$0, $$1, ob.this.c);
         alz $$5 = os.G.a($$0, $$1, ob.this.c);
         alz $$6 = os.H.a($$0, $$1, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$2, $$3, $$4, $$5, $$6));
         alz $$7 = os.I.a($$0, $$1, ob.this.c);
         ob.this.a($$0, $$7);
         return this;
      }

      public ob.b d(dkm $$0) {
         alz $$1 = os.J.a($$0, this.b, ob.this.c);
         alz $$2 = os.K.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.c($$0, $$1, $$2));
         alz $$3 = os.L.a($$0, this.b, ob.this.c);
         ob.this.a($$0, $$3);
         return this;
      }

      public ob.b e(dkm $$0) {
         ot $$1 = ot.q($$0);
         alz $$2 = os.R.a($$0, $$1, ob.this.c);
         alz $$3 = os.Q.a($$0, $$1, ob.this.c);
         alz $$4 = os.T.a($$0, $$1, ob.this.c);
         alz $$5 = os.S.a($$0, $$1, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ob.b f(dkm $$0) {
         alz $$1 = os.V.a($$0, this.b, ob.this.c);
         alz $$2 = os.U.a($$0, this.b, ob.this.c);
         alz $$3 = os.X.a($$0, this.b, ob.this.c);
         alz $$4 = os.W.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ob.b g(dkm $$0) {
         alz $$1 = os.Y.a($$0, this.b, ob.this.c);
         alz $$2 = os.Z.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.e($$0, $$1, $$2));
         return this;
      }

      public ob.b h(dkm $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dkm $$1 = this.d.b().get(me.b.r);
            alz $$2 = os.aa.a($$0, this.b, ob.this.c);
            ob.this.b.accept(ob.c($$0, $$2));
            ob.this.b.accept(ob.c($$1, $$2));
            ob.this.a($$0.j());
            ob.this.c($$1);
            return this;
         }
      }

      public ob.b i(dkm $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alz $$1 = this.a(os.ab, $$0);
            alz $$2 = this.a(os.ac, $$0);
            ob.this.b.accept(ob.e($$0, $$1, $$2, this.e));
            ob.this.a($$0, $$1);
            return this;
         }
      }

      public ob.b j(dkm $$0) {
         alz $$1 = this.a(os.af, $$0);
         alz $$2 = this.a(os.ae, $$0);
         alz $$3 = this.a(os.ag, $$0);
         ob.this.b.accept(ob.b($$0, $$1, $$2, $$3));
         ob.this.a($$0, $$2);
         return this;
      }

      private ob.b k(dkm $$0) {
         ov $$1 = ob.this.g.getOrDefault($$0, ov.a.get($$0));
         alz $$2 = $$1.a($$0, ob.this.c);
         ob.this.b.accept(ob.c($$0, $$2));
         return this;
      }

      private ob.b l(dkm $$0) {
         ob.this.j($$0);
         return this;
      }

      private void m(dkm $$0) {
         if (ob.this.e.contains($$0)) {
            ob.this.l($$0);
         } else {
            ob.this.k($$0);
         }
      }

      private alz a(or $$0, dkm $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ob.this.c));
      }

      public ob.b a(me $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<ob.b, dkm> $$2 = ob.h.get($$0x);
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
      of create(dkm var1, alz var2, ot var3, BiConsumer<alz, Supplier<JsonElement>> var4);
   }

   static record d(or a, String b) {
   }

   static enum e {
      a,
      b;

      public or a() {
         return this == a ? os.ap : os.ao;
      }

      public or b() {
         return this == a ? os.ar : os.aq;
      }
   }

   class f {
      private final ot b;

      public f(final ot $$0) {
         this.b = $$0;
      }

      public ob.f a(dkm $$0) {
         ot $$1 = this.b.c(ou.d, this.b.a(ou.i));
         alz $$2 = os.j.a($$0, $$1, ob.this.c);
         ob.this.b.accept(ob.d($$0, $$2));
         return this;
      }

      public ob.f b(dkm $$0) {
         alz $$1 = os.j.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.d($$0, $$1));
         return this;
      }

      public ob.f c(dkm $$0) {
         alz $$1 = os.j.a($$0, this.b, ob.this.c);
         alz $$2 = os.k.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.d($$0, $$1, $$2));
         return this;
      }

      public ob.f d(dkm $$0) {
         ob.this.b.accept(ob.a($$0, this.b, ob.this.c));
         return this;
      }
   }
}
