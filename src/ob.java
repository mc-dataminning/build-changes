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
   private final Consumer<cxk> d;
   final List<dkl> e = ImmutableList.of(dkn.eL, dkn.eR, dkn.ip);
   final Map<dkl, ob.c> f = ImmutableMap.builder().put(dkn.b, ob::a).put(dkn.te, ob::c).put(dkn.fa, ob::b).build();
   final Map<dkl, ov> g = ImmutableMap.builder()
      .put(dkn.bc, ov.z.get(dkn.bc))
      .put(dkn.jG, ov.z.get(dkn.jG))
      .put(dkn.kk, ov.a(ot.a(dkn.bc, "_top")))
      .put(dkn.km, ov.a(ot.a(dkn.jG, "_top")))
      .put(dkn.be, ov.d.get(dkn.bc).a($$0x -> $$0x.a(ou.i, ot.H(dkn.be))))
      .put(dkn.jI, ov.d.get(dkn.jG).a($$0x -> $$0x.a(ou.i, ot.H(dkn.jI))))
      .put(dkn.ht, ov.d.get(dkn.ht))
      .put(dkn.kl, ov.a(ot.a(dkn.ht, "_bottom")))
      .put(dkn.pM, ov.A.get(dkn.pM))
      .put(dkn.te, ov.A.get(dkn.te))
      .put(dkn.hu, ov.d.get(dkn.hu).a($$0x -> $$0x.a(ou.i, ot.H(dkn.hu))))
      .put(dkn.bd, ov.d.get(dkn.bd).a($$0x -> {
         $$0x.a(ou.d, ot.a(dkn.bc, "_top"));
         $$0x.a(ou.i, ot.H(dkn.bd));
      }))
      .put(dkn.jH, ov.d.get(dkn.jH).a($$0x -> {
         $$0x.a(ou.d, ot.a(dkn.jG, "_top"));
         $$0x.a(ou.i, ot.H(dkn.jH));
      }))
      .put(dkn.rh, ov.A.get(dkn.rh))
      .put(dkn.rc, ov.A.get(dkn.rc))
      .build();
   static final Map<me.b, BiConsumer<ob.b, dkl>> h = ImmutableMap.builder()
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

   private static of a(dkl $$0, alz $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      alz $$4 = os.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static of b(dkl $$0, alz $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      alz $$4 = os.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static of c(dkl $$0, alz $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      alz $$4 = os.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ob(Consumer<of> $$0, BiConsumer<alz, Supplier<JsonElement>> $$1, Consumer<cxk> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dkl $$0) {
      this.d.accept($$0.j());
   }

   void a(dkl $$0, alz $$1) {
      this.c.accept(oq.a($$0.j()), new op($$1));
   }

   private void a(cxk $$0, alz $$1) {
      this.c.accept(oq.a($$0), new op($$1));
   }

   void a(cxk $$0) {
      os.bC.a(oq.a($$0), ot.b($$0), this.c);
   }

   private void d(dkl $$0) {
      cxk $$1 = $$0.j();
      if ($$1 != cxs.a) {
         os.bC.a(oq.a($$1), ot.G($$0), this.c);
      }
   }

   private void a(dkl $$0, String $$1) {
      cxk $$2 = $$0.j();
      os.bC.a(oq.a($$2), ot.k(ot.a($$0, $$1)), this.c);
   }

   private static oj b() {
      return oj.a(dyk.S).a(jm.f, ol.a().a(om.b, om.a.b)).a(jm.d, ol.a().a(om.b, om.a.c)).a(jm.e, ol.a().a(om.b, om.a.d)).a(jm.c, ol.a());
   }

   private static oj c() {
      return oj.a(dyk.S).a(jm.d, ol.a()).a(jm.e, ol.a().a(om.b, om.a.b)).a(jm.c, ol.a().a(om.b, om.a.c)).a(jm.f, ol.a().a(om.b, om.a.d));
   }

   private static oj d() {
      return oj.a(dyk.S).a(jm.f, ol.a()).a(jm.d, ol.a().a(om.b, om.a.b)).a(jm.e, ol.a().a(om.b, om.a.c)).a(jm.c, ol.a().a(om.b, om.a.d));
   }

   private static oj e() {
      return oj.a(dyk.Q)
         .a(jm.a, ol.a().a(om.a, om.a.b))
         .a(jm.b, ol.a().a(om.a, om.a.d))
         .a(jm.c, ol.a())
         .a(jm.d, ol.a().a(om.b, om.a.c))
         .a(jm.e, ol.a().a(om.b, om.a.d))
         .a(jm.f, ol.a().a(om.b, om.a.b));
   }

   private static oi b(dkl $$0, alz $$1) {
      return oi.a($$0, a($$1));
   }

   private static ol[] a(alz $$0) {
      return new ol[]{ol.a().a(om.c, $$0), ol.a().a(om.c, $$0).a(om.b, om.a.b), ol.a().a(om.c, $$0).a(om.b, om.a.c), ol.a().a(om.c, $$0).a(om.b, om.a.d)};
   }

   private static oi a(dkl $$0, alz $$1, alz $$2) {
      return oi.a($$0, ol.a().a(om.c, $$1), ol.a().a(om.c, $$2), ol.a().a(om.c, $$1).a(om.b, om.a.c), ol.a().a(om.c, $$2).a(om.b, om.a.c));
   }

   private static oj a(dyl $$0, alz $$1, alz $$2) {
      return oj.a($$0).a(true, ol.a().a(om.c, $$1)).a(false, ol.a().a(om.c, $$2));
   }

   private void e(dkl $$0) {
      alz $$1 = ov.a.create($$0, this.c);
      alz $$2 = ov.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dkl $$0) {
      alz $$1 = ov.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dkl $$0) {
      this.b.accept(oi.a($$0).a(oj.a(dyk.bw).a($$1 -> {
         String $$2 = "_" + $$1;
         alz $$3 = ot.a($$0, $$2);
         return ol.a().a(om.c, os.c.a($$0, $$2, new ot().a(ou.a, $$3), this.c));
      })));
      this.a($$0, ot.a($$0, "_0"));
   }

   static of b(dkl $$0, alz $$1, alz $$2) {
      return oi.a($$0)
         .a(oj.a(dyk.x).a(false, ol.a().a(om.c, $$1)).a(true, ol.a().a(om.c, $$2)))
         .a(
            oj.a(dyk.V, dyk.S)
               .a(dyf.a, jm.f, ol.a().a(om.b, om.a.b))
               .a(dyf.a, jm.e, ol.a().a(om.b, om.a.d))
               .a(dyf.a, jm.d, ol.a().a(om.b, om.a.c))
               .a(dyf.a, jm.c, ol.a())
               .a(dyf.b, jm.f, ol.a().a(om.b, om.a.b).a(om.a, om.a.b).a(om.d, true))
               .a(dyf.b, jm.e, ol.a().a(om.b, om.a.d).a(om.a, om.a.b).a(om.d, true))
               .a(dyf.b, jm.d, ol.a().a(om.b, om.a.c).a(om.a, om.a.b).a(om.d, true))
               .a(dyf.b, jm.c, ol.a().a(om.a, om.a.b).a(om.d, true))
               .a(dyf.c, jm.f, ol.a().a(om.b, om.a.d).a(om.a, om.a.c))
               .a(dyf.c, jm.e, ol.a().a(om.b, om.a.b).a(om.a, om.a.c))
               .a(dyf.c, jm.d, ol.a().a(om.a, om.a.c))
               .a(dyf.c, jm.c, ol.a().a(om.b, om.a.c).a(om.a, om.a.c))
         );
   }

   private static oj.d<jm, dyp, dyo, Boolean> a(oj.d<jm, dyp, dyo, Boolean> $$0, dyp $$1, alz $$2, alz $$3, alz $$4, alz $$5) {
      return $$0.a(jm.f, $$1, dyo.a, false, ol.a().a(om.c, $$2))
         .a(jm.d, $$1, dyo.a, false, ol.a().a(om.c, $$2).a(om.b, om.a.b))
         .a(jm.e, $$1, dyo.a, false, ol.a().a(om.c, $$2).a(om.b, om.a.c))
         .a(jm.c, $$1, dyo.a, false, ol.a().a(om.c, $$2).a(om.b, om.a.d))
         .a(jm.f, $$1, dyo.b, false, ol.a().a(om.c, $$4))
         .a(jm.d, $$1, dyo.b, false, ol.a().a(om.c, $$4).a(om.b, om.a.b))
         .a(jm.e, $$1, dyo.b, false, ol.a().a(om.c, $$4).a(om.b, om.a.c))
         .a(jm.c, $$1, dyo.b, false, ol.a().a(om.c, $$4).a(om.b, om.a.d))
         .a(jm.f, $$1, dyo.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
         .a(jm.d, $$1, dyo.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
         .a(jm.e, $$1, dyo.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
         .a(jm.c, $$1, dyo.a, true, ol.a().a(om.c, $$3))
         .a(jm.f, $$1, dyo.b, true, ol.a().a(om.c, $$5).a(om.b, om.a.d))
         .a(jm.d, $$1, dyo.b, true, ol.a().a(om.c, $$5))
         .a(jm.e, $$1, dyo.b, true, ol.a().a(om.c, $$5).a(om.b, om.a.b))
         .a(jm.c, $$1, dyo.b, true, ol.a().a(om.c, $$5).a(om.b, om.a.c));
   }

   private static of a(dkl $$0, alz $$1, alz $$2, alz $$3, alz $$4, alz $$5, alz $$6, alz $$7, alz $$8) {
      return oi.a($$0).a(a(a(oj.a(dyk.S, dyk.af, dyk.bf, dyk.v), dyp.b, $$1, $$2, $$3, $$4), dyp.a, $$5, $$6, $$7, $$8));
   }

   static of a(dkl $$0, alz $$1, alz $$2, alz $$3, alz $$4, alz $$5) {
      return oh.a($$0)
         .a(ol.a().a(om.c, $$1))
         .a(og.a().a(dyk.M, true), ol.a().a(om.c, $$2).a(om.d, false))
         .a(og.a().a(dyk.N, true), ol.a().a(om.c, $$3).a(om.d, false))
         .a(og.a().a(dyk.O, true), ol.a().a(om.c, $$4).a(om.d, false))
         .a(og.a().a(dyk.P, true), ol.a().a(om.c, $$5).a(om.d, false));
   }

   static of c(dkl $$0, alz $$1, alz $$2) {
      return oh.a($$0)
         .a(ol.a().a(om.c, $$1))
         .a(og.a().a(dyk.M, true), ol.a().a(om.c, $$2).a(om.d, true))
         .a(og.a().a(dyk.N, true), ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true))
         .a(og.a().a(dyk.O, true), ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true))
         .a(og.a().a(dyk.P, true), ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true));
   }

   static of a(dkl $$0, alz $$1, alz $$2, alz $$3) {
      return oh.a($$0)
         .a(og.a().a(dyk.K, true), ol.a().a(om.c, $$1))
         .a(og.a().a(dyk.Y, dzf.b), ol.a().a(om.c, $$2).a(om.d, true))
         .a(og.a().a(dyk.X, dzf.b), ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true))
         .a(og.a().a(dyk.Z, dzf.b), ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true))
         .a(og.a().a(dyk.aa, dzf.b), ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true))
         .a(og.a().a(dyk.Y, dzf.c), ol.a().a(om.c, $$3).a(om.d, true))
         .a(og.a().a(dyk.X, dzf.c), ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true))
         .a(og.a().a(dyk.Z, dzf.c), ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true))
         .a(og.a().a(dyk.aa, dzf.c), ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true));
   }

   static of a(dkl $$0, alz $$1, alz $$2, alz $$3, alz $$4, boolean $$5) {
      return oi.a($$0, ol.a().a(om.d, $$5))
         .a(c())
         .a(
            oj.a(dyk.q, dyk.v)
               .a(false, false, ol.a().a(om.c, $$2))
               .a(true, false, ol.a().a(om.c, $$4))
               .a(false, true, ol.a().a(om.c, $$1))
               .a(true, true, ol.a().a(om.c, $$3))
         );
   }

   static of b(dkl $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0)
         .a(
            oj.a(dyk.S, dyk.ag, dyk.bj)
               .a(jm.f, dys.b, dzc.a, ol.a().a(om.c, $$2))
               .a(jm.e, dys.b, dzc.a, ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dys.b, dzc.a, ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dys.b, dzc.a, ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dys.b, dzc.e, ol.a().a(om.c, $$3))
               .a(jm.e, dys.b, dzc.e, ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dys.b, dzc.e, ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dys.b, dzc.e, ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dys.b, dzc.d, ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true))
               .a(jm.e, dys.b, dzc.d, ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true))
               .a(jm.d, dys.b, dzc.d, ol.a().a(om.c, $$3))
               .a(jm.c, dys.b, dzc.d, ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true))
               .a(jm.f, dys.b, dzc.c, ol.a().a(om.c, $$1))
               .a(jm.e, dys.b, dzc.c, ol.a().a(om.c, $$1).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dys.b, dzc.c, ol.a().a(om.c, $$1).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dys.b, dzc.c, ol.a().a(om.c, $$1).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dys.b, dzc.b, ol.a().a(om.c, $$1).a(om.b, om.a.d).a(om.d, true))
               .a(jm.e, dys.b, dzc.b, ol.a().a(om.c, $$1).a(om.b, om.a.b).a(om.d, true))
               .a(jm.d, dys.b, dzc.b, ol.a().a(om.c, $$1))
               .a(jm.c, dys.b, dzc.b, ol.a().a(om.c, $$1).a(om.b, om.a.c).a(om.d, true))
               .a(jm.f, dys.a, dzc.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.d, true))
               .a(jm.e, dys.a, dzc.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dys.a, dzc.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dys.a, dzc.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dys.a, dzc.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.e, dys.a, dzc.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.d, dys.a, dzc.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.c, dys.a, dzc.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.d, true))
               .a(jm.f, dys.a, dzc.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.d, true))
               .a(jm.e, dys.a, dzc.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dys.a, dzc.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dys.a, dzc.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dys.a, dzc.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.e, dys.a, dzc.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.d, dys.a, dzc.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.c, dys.a, dzc.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.d, true))
               .a(jm.f, dys.a, dzc.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.d, true))
               .a(jm.e, dys.a, dzc.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dys.a, dzc.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dys.a, dzc.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
         );
   }

   private static of c(dkl $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0)
         .a(
            oj.a(dyk.S, dyk.ag, dyk.v)
               .a(jm.c, dys.b, false, ol.a().a(om.c, $$2))
               .a(jm.d, dys.b, false, ol.a().a(om.c, $$2).a(om.b, om.a.c))
               .a(jm.f, dys.b, false, ol.a().a(om.c, $$2).a(om.b, om.a.b))
               .a(jm.e, dys.b, false, ol.a().a(om.c, $$2).a(om.b, om.a.d))
               .a(jm.c, dys.a, false, ol.a().a(om.c, $$1))
               .a(jm.d, dys.a, false, ol.a().a(om.c, $$1).a(om.b, om.a.c))
               .a(jm.f, dys.a, false, ol.a().a(om.c, $$1).a(om.b, om.a.b))
               .a(jm.e, dys.a, false, ol.a().a(om.c, $$1).a(om.b, om.a.d))
               .a(jm.c, dys.b, true, ol.a().a(om.c, $$3))
               .a(jm.d, dys.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(jm.f, dys.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(jm.e, dys.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
               .a(jm.c, dys.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.c))
               .a(jm.d, dys.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.a))
               .a(jm.f, dys.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.d))
               .a(jm.e, dys.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.b))
         );
   }

   private static of d(dkl $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0)
         .a(
            oj.a(dyk.S, dyk.ag, dyk.v)
               .a(jm.c, dys.b, false, ol.a().a(om.c, $$2))
               .a(jm.d, dys.b, false, ol.a().a(om.c, $$2))
               .a(jm.f, dys.b, false, ol.a().a(om.c, $$2))
               .a(jm.e, dys.b, false, ol.a().a(om.c, $$2))
               .a(jm.c, dys.a, false, ol.a().a(om.c, $$1))
               .a(jm.d, dys.a, false, ol.a().a(om.c, $$1))
               .a(jm.f, dys.a, false, ol.a().a(om.c, $$1))
               .a(jm.e, dys.a, false, ol.a().a(om.c, $$1))
               .a(jm.c, dys.b, true, ol.a().a(om.c, $$3))
               .a(jm.d, dys.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(jm.f, dys.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(jm.e, dys.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
               .a(jm.c, dys.a, true, ol.a().a(om.c, $$3))
               .a(jm.d, dys.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(jm.f, dys.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(jm.e, dys.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
         );
   }

   static oi c(dkl $$0, alz $$1) {
      return oi.a($$0, ol.a().a(om.c, $$1));
   }

   private static oj f() {
      return oj.a(dyk.J).a(jm.a.b, ol.a()).a(jm.a.c, ol.a().a(om.a, om.a.b)).a(jm.a.a, ol.a().a(om.a, om.a.b).a(om.b, om.a.b));
   }

   static of a(dkl $$0, ot $$1, BiConsumer<alz, Supplier<JsonElement>> $$2) {
      alz $$3 = os.g.a($$0, $$1, $$2);
      alz $$4 = os.h.a($$0, $$1, $$2);
      alz $$5 = os.i.a($$0, $$1, $$2);
      alz $$6 = os.j.a($$0, $$1, $$2);
      return oi.a($$0, ol.a().a(om.c, $$6)).a(oj.a(dyk.J).a(jm.a.a, ol.a().a(om.c, $$3)).a(jm.a.b, ol.a().a(om.c, $$4)).a(jm.a.c, ol.a().a(om.c, $$5)));
   }

   static of d(dkl $$0, alz $$1) {
      return oi.a($$0, ol.a().a(om.c, $$1)).a(f());
   }

   private void e(dkl $$0, alz $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dkl $$0, ov.a $$1) {
      alz $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dkl $$0, ov.a $$1) {
      alz $$2 = $$1.create($$0, this.c);
      this.b.accept(oi.a($$0, ol.a().a(om.c, $$2)).a(b()));
   }

   static of d(dkl $$0, alz $$1, alz $$2) {
      return oi.a($$0)
         .a(
            oj.a(dyk.J)
               .a(jm.a.b, ol.a().a(om.c, $$1))
               .a(jm.a.c, ol.a().a(om.c, $$2).a(om.a, om.a.b))
               .a(jm.a.a, ol.a().a(om.c, $$2).a(om.a, om.a.b).a(om.b, om.a.b))
         );
   }

   private void a(dkl $$0, ov.a $$1, ov.a $$2) {
      alz $$3 = $$1.create($$0, this.c);
      alz $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void h(dkl $$0) {
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
                  oj.a(dyk.J, dmh.c)
                     .a(jm.a.b, dmh.a.a, ol.a().a(om.c, $$2))
                     .a(jm.a.c, dmh.a.a, ol.a().a(om.c, $$3).a(om.a, om.a.b))
                     .a(jm.a.a, dmh.a.a, ol.a().a(om.c, $$3).a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(jm.a.b, dmh.a.b, ol.a().a(om.c, $$4))
                     .a(jm.a.c, dmh.a.b, ol.a().a(om.c, $$5).a(om.a, om.a.b))
                     .a(jm.a.a, dmh.a.b, ol.a().a(om.c, $$5).a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(jm.a.b, dmh.a.c, ol.a().a(om.c, $$4))
                     .a(jm.a.c, dmh.a.c, ol.a().a(om.c, $$5).a(om.a, om.a.b))
                     .a(jm.a.a, dmh.a.c, ol.a().a(om.c, $$5).a(om.a, om.a.b).a(om.b, om.a.b))
               )
         );
   }

   private alz a(dkl $$0, String $$1, or $$2, Function<alz, ot> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ot.a($$0, $$1)), this.c);
   }

   static of e(dkl $$0, alz $$1, alz $$2) {
      return oi.a($$0).a(a(dyk.x, $$2, $$1));
   }

   static of e(dkl $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0).a(oj.a(dyk.bi).a(dzb.b, ol.a().a(om.c, $$1)).a(dzb.a, ol.a().a(om.c, $$2)).a(dzb.c, ol.a().a(om.c, $$3)));
   }

   public void a(dkl $$0) {
      this.b($$0, ov.a);
   }

   public void b(dkl $$0, ov.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dkl $$0, ot $$1, or $$2) {
      alz $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ob.b i(dkl $$0) {
      ov $$1 = this.g.getOrDefault($$0, ov.a.get($$0));
      return new ob.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dkl $$0, dkl $$1, dkl $$2) {
      ot $$3 = ot.v($$0);
      alz $$4 = os.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void j(dkl $$0) {
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

   private void a(dkl $$0, dkl $$1) {
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

   void k(dkl $$0) {
      ot $$1 = ot.b($$0);
      alz $$2 = os.ak.a($$0, $$1, this.c);
      alz $$3 = os.al.a($$0, $$1, this.c);
      alz $$4 = os.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(dkl $$0) {
      ot $$1 = ot.b($$0);
      alz $$2 = os.ah.a($$0, $$1, this.c);
      alz $$3 = os.ai.a($$0, $$1, this.c);
      alz $$4 = os.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dkl $$0, dkl $$1) {
      alz $$2 = os.ah.a($$0);
      alz $$3 = os.ai.a($$0);
      alz $$4 = os.aj.a($$0);
      this.a($$1, oq.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dkn.sY);
      alz $$0 = oq.a(dkn.sY);
      alz $$1 = oq.a(dkn.sY, "_partial_tilt");
      alz $$2 = oq.a(dkn.sY, "_full_tilt");
      this.b
         .accept(
            oi.a(dkn.sY)
               .a(b())
               .a(oj.a(dyk.bm).a(dze.a, ol.a().a(om.c, $$0)).a(dze.b, ol.a().a(om.c, $$0)).a(dze.c, ol.a().a(om.c, $$1)).a(dze.d, ol.a().a(om.c, $$2)))
         );
   }

   private ob.f m(dkl $$0) {
      return new ob.f(ot.o($$0));
   }

   private void n(dkl $$0) {
      this.c($$0, $$0);
   }

   private void c(dkl $$0, dkl $$1) {
      this.b.accept(c($$0, oq.a($$1)));
   }

   private void a(dkl $$0, ob.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dkl $$0, ob.e $$1, ot $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dkl $$0, ob.e $$1) {
      ot $$2 = ot.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dkl $$0, ob.e $$1, ot $$2) {
      alz $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dkl $$0, ob.e $$1, dyw<Integer> $$2, int... $$3) {
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

   private void a(dkl $$0, dkl $$1, ob.e $$2) {
      this.a($$0, $$2);
      ot $$3 = ot.e($$0);
      alz $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dkl $$0, dkl $$1) {
      ov $$2 = ov.q.get($$0);
      alz $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alz $$4 = os.aD.a($$1, $$2.b(), this.c);
      this.b.accept(oi.a($$1, ol.a().a(om.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dkl $$0, dkl $$1) {
      this.a($$0.j());
      ot $$2 = ot.i($$0);
      ot $$3 = ot.a($$0, $$1);
      alz $$4 = os.aV.a($$1, $$3, this.c);
      this.b
         .accept(
            oi.a($$1, ol.a().a(om.c, $$4))
               .a(oj.a(dyk.S).a(jm.e, ol.a()).a(jm.d, ol.a().a(om.b, om.a.d)).a(jm.c, ol.a().a(om.b, om.a.b)).a(jm.f, ol.a().a(om.b, om.a.c)))
         );
      this.b.accept(oi.a($$0).a(oj.a(dyk.aw).a($$2x -> ol.a().a(om.c, os.aU[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dkl $$0 = dkn.kX;
      this.a($$0.j());
      alz $$1 = oq.a($$0, "_top");
      alz $$2 = oq.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dkl $$0 = dkn.kW;
      this.a($$0.j());
      oj $$1 = oj.a(dqc.d, dyk.af).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> ol.a().a(om.c, oq.a($$0, "_top_stage_" + $$1x));
            case b -> ol.a().a(om.c, oq.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(oi.a($$0).a($$1));
   }

   private void a(dkl $$0, dkl $$1, dkl $$2, dkl $$3, dkl $$4, dkl $$5, dkl $$6, dkl $$7) {
      this.a($$0, ob.e.b);
      this.a($$1, ob.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dkl $$0, ob.e $$1) {
      this.a($$0, "_top");
      alz $$2 = this.a($$0, "_top", $$1.a(), ot::c);
      alz $$3 = this.a($$0, "_bottom", $$1.a(), ot::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dkn.iU, "_front");
      alz $$0 = oq.a(dkn.iU, "_top");
      alz $$1 = this.a(dkn.iU, "_bottom", ob.e.b.a(), ot::c);
      this.f(dkn.iU, $$0, $$1);
   }

   private void k() {
      alz $$0 = this.a(dkn.bE, "_top", os.bp, ot::a);
      alz $$1 = this.a(dkn.bE, "_bottom", os.bp, ot::a);
      this.f(dkn.bE, $$0, $$1);
   }

   private void l() {
      this.c(dkn.ta);
      alz $$0 = oq.a(dkn.ta, "_top");
      alz $$1 = oq.a(dkn.ta, "_bottom");
      this.b.accept(oi.a(dkn.ta).a(b()).a(oj.a(dyk.af).a(dyp.b, ol.a().a(om.c, $$1)).a(dyp.a, ol.a().a(om.c, $$0))));
   }

   private void f(dkl $$0, alz $$1, alz $$2) {
      this.b.accept(oi.a($$0).a(oj.a(dyk.af).a(dyp.b, ol.a().a(om.c, $$2)).a(dyp.a, ol.a().a(om.c, $$1))));
   }

   private void o(dkl $$0) {
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
                  oj.a(dyk.ah)
                     .a(dyx.a, ol.a().a(om.c, $$3))
                     .a(dyx.b, ol.a().a(om.c, $$3).a(om.b, om.a.b))
                     .a(dyx.c, ol.a().a(om.c, $$5).a(om.b, om.a.b))
                     .a(dyx.d, ol.a().a(om.c, $$6).a(om.b, om.a.b))
                     .a(dyx.e, ol.a().a(om.c, $$5))
                     .a(dyx.f, ol.a().a(om.c, $$6))
                     .a(dyx.g, ol.a().a(om.c, $$4))
                     .a(dyx.h, ol.a().a(om.c, $$4).a(om.b, om.a.b))
                     .a(dyx.i, ol.a().a(om.c, $$4).a(om.b, om.a.c))
                     .a(dyx.j, ol.a().a(om.c, $$4).a(om.b, om.a.d))
               )
         );
   }

   private void p(dkl $$0) {
      alz $$1 = this.a($$0, "", os.as, ot::e);
      alz $$2 = this.a($$0, "", os.au, ot::e);
      alz $$3 = this.a($$0, "", os.av, ot::e);
      alz $$4 = this.a($$0, "_on", os.as, ot::e);
      alz $$5 = this.a($$0, "_on", os.au, ot::e);
      alz $$6 = this.a($$0, "_on", os.av, ot::e);
      oj $$7 = oj.a(dyk.x, dyk.ai).a(($$6x, $$7x) -> {
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

   private ob.a a(alz $$0, dkl $$1) {
      return new ob.a($$0, $$1);
   }

   private ob.a f(dkl $$0, dkl $$1) {
      return new ob.a(oq.a($$0), $$1);
   }

   private void a(dkl $$0, cxk $$1) {
      alz $$2 = os.aa.a($$0, ot.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dkl $$0, alz $$1) {
      alz $$2 = os.aa.a($$0, ot.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dkl $$0, dkl $$1) {
      this.a($$0);
      alz $$2 = ov.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void q(dkl $$0) {
      this.a($$0.j());
      alz $$1 = ov.l.create($$0, this.c);
      alz $$2 = ov.m.create($$0, this.c);
      alz $$3 = ov.n.create($$0, this.c);
      alz $$4 = ov.o.create($$0, this.c);
      this.b
         .accept(
            oh.a($$0)
               .a(og.a().a(dyk.T, 1, 2, 3, 4).a(dyk.S, jm.c), ol.a().a(om.c, $$1))
               .a(og.a().a(dyk.T, 1, 2, 3, 4).a(dyk.S, jm.f), ol.a().a(om.c, $$1).a(om.b, om.a.b))
               .a(og.a().a(dyk.T, 1, 2, 3, 4).a(dyk.S, jm.d), ol.a().a(om.c, $$1).a(om.b, om.a.c))
               .a(og.a().a(dyk.T, 1, 2, 3, 4).a(dyk.S, jm.e), ol.a().a(om.c, $$1).a(om.b, om.a.d))
               .a(og.a().a(dyk.T, 2, 3, 4).a(dyk.S, jm.c), ol.a().a(om.c, $$2))
               .a(og.a().a(dyk.T, 2, 3, 4).a(dyk.S, jm.f), ol.a().a(om.c, $$2).a(om.b, om.a.b))
               .a(og.a().a(dyk.T, 2, 3, 4).a(dyk.S, jm.d), ol.a().a(om.c, $$2).a(om.b, om.a.c))
               .a(og.a().a(dyk.T, 2, 3, 4).a(dyk.S, jm.e), ol.a().a(om.c, $$2).a(om.b, om.a.d))
               .a(og.a().a(dyk.T, 3, 4).a(dyk.S, jm.c), ol.a().a(om.c, $$3))
               .a(og.a().a(dyk.T, 3, 4).a(dyk.S, jm.f), ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(og.a().a(dyk.T, 3, 4).a(dyk.S, jm.d), ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(og.a().a(dyk.T, 3, 4).a(dyk.S, jm.e), ol.a().a(om.c, $$3).a(om.b, om.a.d))
               .a(og.a().a(dyk.T, 4).a(dyk.S, jm.c), ol.a().a(om.c, $$4))
               .a(og.a().a(dyk.T, 4).a(dyk.S, jm.f), ol.a().a(om.c, $$4).a(om.b, om.a.b))
               .a(og.a().a(dyk.T, 4).a(dyk.S, jm.d), ol.a().a(om.c, $$4).a(om.b, om.a.c))
               .a(og.a().a(dyk.T, 4).a(dyk.S, jm.e), ol.a().a(om.c, $$4).a(om.b, om.a.d))
         );
   }

   private void a(ov.a $$0, dkl... $$1) {
      for (dkl $$2 : $$1) {
         alz $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ov.a $$0, dkl... $$1) {
      for (dkl $$2 : $$1) {
         alz $$3 = $$0.create($$2, this.c);
         this.b.accept(oi.a($$2, ol.a().a(om.c, $$3)).a(c()));
      }
   }

   private void h(dkl $$0, dkl $$1) {
      this.a($$0);
      ot $$2 = ot.b($$0, $$1);
      alz $$3 = os.aJ.a($$1, $$2, this.c);
      alz $$4 = os.aK.a($$1, $$2, this.c);
      alz $$5 = os.aL.a($$1, $$2, this.c);
      alz $$6 = os.aH.a($$1, $$2, this.c);
      alz $$7 = os.aI.a($$1, $$2, this.c);
      cxk $$8 = $$1.j();
      os.bC.a(oq.a($$8), ot.G($$0), this.c);
      this.b
         .accept(
            oh.a($$1)
               .a(ol.a().a(om.c, $$3))
               .a(og.a().a(dyk.M, true), ol.a().a(om.c, $$4))
               .a(og.a().a(dyk.N, true), ol.a().a(om.c, $$4).a(om.b, om.a.b))
               .a(og.a().a(dyk.O, true), ol.a().a(om.c, $$5))
               .a(og.a().a(dyk.P, true), ol.a().a(om.c, $$5).a(om.b, om.a.b))
               .a(og.a().a(dyk.M, false), ol.a().a(om.c, $$6))
               .a(og.a().a(dyk.N, false), ol.a().a(om.c, $$7))
               .a(og.a().a(dyk.O, false), ol.a().a(om.c, $$7).a(om.b, om.a.b))
               .a(og.a().a(dyk.P, false), ol.a().a(om.c, $$6).a(om.b, om.a.d))
         );
   }

   private void r(dkl $$0) {
      ot $$1 = ot.A($$0);
      alz $$2 = os.aM.a($$0, $$1, this.c);
      alz $$3 = this.a($$0, "_conditional", os.aM, $$1x -> $$1.c(ou.i, $$1x));
      this.b.accept(oi.a($$0).a(a(dyk.c, $$3, $$2)).a(e()));
   }

   private void s(dkl $$0) {
      alz $$1 = ov.s.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<ol> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> ol.a().a(om.c, oq.a(dkn.nu, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dkn.nu);
      this.b
         .accept(
            oh.a(dkn.nu)
               .a(og.a().a(dyk.ar, 0), this.a(0))
               .a(og.a().a(dyk.ar, 1), this.a(1))
               .a(og.a().a(dyk.bl, dyg.b), ol.a().a(om.c, oq.a(dkn.nu, "_small_leaves")))
               .a(og.a().a(dyk.bl, dyg.c), ol.a().a(om.c, oq.a(dkn.nu, "_large_leaves")))
         );
   }

   private oj n() {
      return oj.a(dyk.Q)
         .a(jm.a, ol.a().a(om.a, om.a.c))
         .a(jm.b, ol.a())
         .a(jm.c, ol.a().a(om.a, om.a.b))
         .a(jm.d, ol.a().a(om.a, om.a.b).a(om.b, om.a.c))
         .a(jm.e, ol.a().a(om.a, om.a.b).a(om.b, om.a.d))
         .a(jm.f, ol.a().a(om.a, om.a.b).a(om.b, om.a.b));
   }

   private void o() {
      alz $$0 = ot.a(dkn.op, "_top_open");
      this.b
         .accept(
            oi.a(dkn.op)
               .a(this.n())
               .a(
                  oj.a(dyk.v)
                     .a(false, ol.a().a(om.c, ov.f.create(dkn.op, this.c)))
                     .a(true, ol.a().a(om.c, ov.f.get(dkn.op).a($$1 -> $$1.a(ou.f, $$0)).a(dkn.op, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> oj a(dyw<T> $$0, T $$1, alz $$2, alz $$3) {
      ol $$4 = ol.a().a(om.c, $$2);
      ol $$5 = ol.a().a(om.c, $$3);
      return oj.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dkl $$0, Function<dkl, ot> $$1) {
      ot $$2 = $$1.apply($$0).b(ou.i, ou.c);
      ot $$3 = $$2.c(ou.g, ot.a($$0, "_front_honey"));
      alz $$4 = os.q.a($$0, "_empty", $$2, this.c);
      alz $$5 = os.q.a($$0, "_honey", $$3, this.c);
      this.c($$0);
      os.q.a(oq.a($$0.j(), "_empty"), $$2, this.c);
      os.q.a(oq.a($$0.j(), "_honey"), $$3, this.c);
      this.b.accept(oi.a($$0).a(b()).a(a(dyk.aO, 5, $$5, $$4)));
   }

   private void a(dkl $$0, dyw<Integer> $$1, int... $$2) {
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
      alz $$0 = oq.a(dkn.oy, "_floor");
      alz $$1 = oq.a(dkn.oy, "_ceiling");
      alz $$2 = oq.a(dkn.oy, "_wall");
      alz $$3 = oq.a(dkn.oy, "_between_walls");
      this.a(cxs.xi);
      this.b
         .accept(
            oi.a(dkn.oy)
               .a(
                  oj.a(dyk.S, dyk.W)
                     .a(jm.c, dyi.a, ol.a().a(om.c, $$0))
                     .a(jm.d, dyi.a, ol.a().a(om.c, $$0).a(om.b, om.a.c))
                     .a(jm.f, dyi.a, ol.a().a(om.c, $$0).a(om.b, om.a.b))
                     .a(jm.e, dyi.a, ol.a().a(om.c, $$0).a(om.b, om.a.d))
                     .a(jm.c, dyi.b, ol.a().a(om.c, $$1))
                     .a(jm.d, dyi.b, ol.a().a(om.c, $$1).a(om.b, om.a.c))
                     .a(jm.f, dyi.b, ol.a().a(om.c, $$1).a(om.b, om.a.b))
                     .a(jm.e, dyi.b, ol.a().a(om.c, $$1).a(om.b, om.a.d))
                     .a(jm.c, dyi.c, ol.a().a(om.c, $$2).a(om.b, om.a.d))
                     .a(jm.d, dyi.c, ol.a().a(om.c, $$2).a(om.b, om.a.b))
                     .a(jm.f, dyi.c, ol.a().a(om.c, $$2))
                     .a(jm.e, dyi.c, ol.a().a(om.c, $$2).a(om.b, om.a.c))
                     .a(jm.d, dyi.d, ol.a().a(om.c, $$3).a(om.b, om.a.b))
                     .a(jm.c, dyi.d, ol.a().a(om.c, $$3).a(om.b, om.a.d))
                     .a(jm.f, dyi.d, ol.a().a(om.c, $$3))
                     .a(jm.e, dyi.d, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            oi.a(dkn.ou, ol.a().a(om.c, oq.a(dkn.ou)))
               .a(
                  oj.a(dyk.V, dyk.S)
                     .a(dyf.a, jm.c, ol.a())
                     .a(dyf.a, jm.f, ol.a().a(om.b, om.a.b))
                     .a(dyf.a, jm.d, ol.a().a(om.b, om.a.c))
                     .a(dyf.a, jm.e, ol.a().a(om.b, om.a.d))
                     .a(dyf.b, jm.c, ol.a().a(om.a, om.a.b))
                     .a(dyf.b, jm.f, ol.a().a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(dyf.b, jm.d, ol.a().a(om.a, om.a.b).a(om.b, om.a.c))
                     .a(dyf.b, jm.e, ol.a().a(om.a, om.a.b).a(om.b, om.a.d))
                     .a(dyf.c, jm.d, ol.a().a(om.a, om.a.c))
                     .a(dyf.c, jm.e, ol.a().a(om.a, om.a.c).a(om.b, om.a.b))
                     .a(dyf.c, jm.c, ol.a().a(om.a, om.a.c).a(om.b, om.a.c))
                     .a(dyf.c, jm.f, ol.a().a(om.a, om.a.c).a(om.b, om.a.d))
               )
         );
   }

   private void d(dkl $$0, ov.a $$1) {
      alz $$2 = $$1.create($$0, this.c);
      alz $$3 = ot.a($$0, "_front_on");
      alz $$4 = $$1.get($$0).a($$1x -> $$1x.a(ou.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(oi.a($$0).a(a(dyk.r, $$4, $$2)).a(b()));
   }

   private void a(dkl... $$0) {
      alz $$1 = oq.a("campfire_off");

      for (dkl $$2 : $$0) {
         alz $$3 = os.bd.a($$2, ot.F($$2), this.c);
         this.a($$2.j());
         this.b.accept(oi.a($$2).a(a(dyk.r, $$3, $$1)).a(c()));
      }
   }

   private void t(dkl $$0) {
      alz $$1 = os.by.a($$0, ot.m($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void u(dkl $$0) {
      alz $$1;
      if ($$0 == dkn.tE) {
         $$1 = os.bA.a($$0, ot.n($$0), this.c);
      } else {
         $$1 = os.bz.a($$0, ot.n($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ot $$0 = ot.a(ot.H(dkn.cs), ot.H(dkn.n));
      alz $$1 = os.j.a(dkn.cs, $$0, this.c);
      this.b.accept(c(dkn.cs, $$1));
   }

   private void s() {
      this.a(cxs.lV);
      this.b
         .accept(
            oh.a(dkn.cE)
               .a(
                  og.b(
                     og.a().a(dyk.ac, dyy.c).a(dyk.ab, dyy.c).a(dyk.ad, dyy.c).a(dyk.ae, dyy.c),
                     og.a().a(dyk.ac, dyy.b, dyy.a).a(dyk.ab, dyy.b, dyy.a),
                     og.a().a(dyk.ab, dyy.b, dyy.a).a(dyk.ad, dyy.b, dyy.a),
                     og.a().a(dyk.ad, dyy.b, dyy.a).a(dyk.ae, dyy.b, dyy.a),
                     og.a().a(dyk.ae, dyy.b, dyy.a).a(dyk.ac, dyy.b, dyy.a)
                  ),
                  ol.a().a(om.c, oq.a("redstone_dust_dot"))
               )
               .a(og.a().a(dyk.ac, dyy.b, dyy.a), ol.a().a(om.c, oq.a("redstone_dust_side0")))
               .a(og.a().a(dyk.ad, dyy.b, dyy.a), ol.a().a(om.c, oq.a("redstone_dust_side_alt0")))
               .a(og.a().a(dyk.ab, dyy.b, dyy.a), ol.a().a(om.c, oq.a("redstone_dust_side_alt1")).a(om.b, om.a.d))
               .a(og.a().a(dyk.ae, dyy.b, dyy.a), ol.a().a(om.c, oq.a("redstone_dust_side1")).a(om.b, om.a.d))
               .a(og.a().a(dyk.ac, dyy.a), ol.a().a(om.c, oq.a("redstone_dust_up")))
               .a(og.a().a(dyk.ab, dyy.a), ol.a().a(om.c, oq.a("redstone_dust_up")).a(om.b, om.a.b))
               .a(og.a().a(dyk.ad, dyy.a), ol.a().a(om.c, oq.a("redstone_dust_up")).a(om.b, om.a.c))
               .a(og.a().a(dyk.ae, dyy.a), ol.a().a(om.c, oq.a("redstone_dust_up")).a(om.b, om.a.d))
         );
   }

   private void t() {
      this.a(cxs.lZ);
      this.b
         .accept(
            oi.a(dkn.ho)
               .a(c())
               .a(
                  oj.a(dyk.be, dyk.x)
                     .a(dyn.a, false, ol.a().a(om.c, oq.a(dkn.ho)))
                     .a(dyn.a, true, ol.a().a(om.c, oq.a(dkn.ho, "_on")))
                     .a(dyn.b, false, ol.a().a(om.c, oq.a(dkn.ho, "_subtract")))
                     .a(dyn.b, true, ol.a().a(om.c, oq.a(dkn.ho, "_on_subtract")))
               )
         );
   }

   private void u() {
      ot $$0 = ot.a(dkn.kj);
      ot $$1 = ot.a(ot.a(dkn.jW, "_side"), $$0.a(ou.f));
      alz $$2 = os.ab.a(dkn.jW, $$1, this.c);
      alz $$3 = os.ac.a(dkn.jW, $$1, this.c);
      alz $$4 = os.j.b(dkn.jW, "_double", $$1, this.c);
      this.b.accept(e(dkn.jW, $$2, $$3, $$4));
      this.b.accept(c(dkn.kj, os.c.a(dkn.kj, $$0, this.c)));
   }

   private void v() {
      this.a(cxs.te);
      this.b
         .accept(
            oh.a(dkn.fG)
               .a(ol.a().a(om.c, ot.H(dkn.fG)))
               .a(og.a().a(dyk.k, true), ol.a().a(om.c, ot.a(dkn.fG, "_bottle0")))
               .a(og.a().a(dyk.l, true), ol.a().a(om.c, ot.a(dkn.fG, "_bottle1")))
               .a(og.a().a(dyk.m, true), ol.a().a(om.c, ot.a(dkn.fG, "_bottle2")))
               .a(og.a().a(dyk.k, false), ol.a().a(om.c, ot.a(dkn.fG, "_empty0")))
               .a(og.a().a(dyk.l, false), ol.a().a(om.c, ot.a(dkn.fG, "_empty1")))
               .a(og.a().a(dyk.m, false), ol.a().a(om.c, ot.a(dkn.fG, "_empty2")))
         );
   }

   private void v(dkl $$0) {
      alz $$1 = os.bu.a($$0, ot.b($$0), this.c);
      alz $$2 = oq.a("mushroom_block_inside");
      this.b
         .accept(
            oh.a($$0)
               .a(og.a().a(dyk.M, true), ol.a().a(om.c, $$1))
               .a(og.a().a(dyk.N, true), ol.a().a(om.c, $$1).a(om.b, om.a.b).a(om.d, true))
               .a(og.a().a(dyk.O, true), ol.a().a(om.c, $$1).a(om.b, om.a.c).a(om.d, true))
               .a(og.a().a(dyk.P, true), ol.a().a(om.c, $$1).a(om.b, om.a.d).a(om.d, true))
               .a(og.a().a(dyk.K, true), ol.a().a(om.c, $$1).a(om.a, om.a.d).a(om.d, true))
               .a(og.a().a(dyk.L, true), ol.a().a(om.c, $$1).a(om.a, om.a.b).a(om.d, true))
               .a(og.a().a(dyk.M, false), ol.a().a(om.c, $$2))
               .a(og.a().a(dyk.N, false), ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, false))
               .a(og.a().a(dyk.O, false), ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, false))
               .a(og.a().a(dyk.P, false), ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, false))
               .a(og.a().a(dyk.K, false), ol.a().a(om.c, $$2).a(om.a, om.a.d).a(om.d, false))
               .a(og.a().a(dyk.L, false), ol.a().a(om.c, $$2).a(om.a, om.a.b).a(om.d, false))
         );
      this.a($$0, ov.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cxs.sp);
      this.b
         .accept(
            oi.a(dkn.et)
               .a(
                  oj.a(dyk.az)
                     .a(0, ol.a().a(om.c, oq.a(dkn.et)))
                     .a(1, ol.a().a(om.c, oq.a(dkn.et, "_slice1")))
                     .a(2, ol.a().a(om.c, oq.a(dkn.et, "_slice2")))
                     .a(3, ol.a().a(om.c, oq.a(dkn.et, "_slice3")))
                     .a(4, ol.a().a(om.c, oq.a(dkn.et, "_slice4")))
                     .a(5, ol.a().a(om.c, oq.a(dkn.et, "_slice5")))
                     .a(6, ol.a().a(om.c, oq.a(dkn.et, "_slice6")))
               )
         );
   }

   private void x() {
      ot $$0 = new ot()
         .a(ou.c, ot.a(dkn.os, "_side3"))
         .a(ou.o, ot.H(dkn.t))
         .a(ou.n, ot.a(dkn.os, "_top"))
         .a(ou.j, ot.a(dkn.os, "_side3"))
         .a(ou.l, ot.a(dkn.os, "_side3"))
         .a(ou.k, ot.a(dkn.os, "_side1"))
         .a(ou.m, ot.a(dkn.os, "_side2"));
      this.b.accept(c(dkn.os, os.a.a(dkn.os, $$0, this.c)));
   }

   private void y() {
      ot $$0 = new ot()
         .a(ou.c, ot.a(dkn.ow, "_front"))
         .a(ou.o, ot.a(dkn.ow, "_bottom"))
         .a(ou.n, ot.a(dkn.ow, "_top"))
         .a(ou.j, ot.a(dkn.ow, "_front"))
         .a(ou.k, ot.a(dkn.ow, "_front"))
         .a(ou.l, ot.a(dkn.ow, "_side"))
         .a(ou.m, ot.a(dkn.ow, "_side"));
      this.b.accept(c(dkn.ow, os.a.a(dkn.ow, $$0, this.c)));
   }

   private void a(dkl $$0, dkl $$1, BiFunction<dkl, dkl, ot> $$2) {
      ot $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, os.a.a($$0, $$3, this.c)));
   }

   public void b(dkl $$0) {
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
      ot $$0 = ot.l(dkn.fn);
      this.b.accept(c(dkn.fn, oq.a(dkn.fn)));
      this.a(dkn.er, $$0);
      this.a(dkn.es, $$0);
   }

   private void a(dkl $$0, ot $$1) {
      alz $$2 = os.p.a($$0, $$1.c(ou.g, ot.H($$0)), this.c);
      this.b.accept(oi.a($$0, ol.a().a(om.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cxs.tf);
      this.n(dkn.fH);
      this.b.accept(c(dkn.fJ, os.bx.a(dkn.fJ, ot.j(ot.a(dkn.K, "_still")), this.c)));
      this.b
         .accept(
            oi.a(dkn.fI)
               .a(
                  oj.a(dow.g)
                     .a(1, ol.a().a(om.c, os.bv.a(dkn.fI, "_level1", ot.j(ot.a(dkn.J, "_still")), this.c)))
                     .a(2, ol.a().a(om.c, os.bw.a(dkn.fI, "_level2", ot.j(ot.a(dkn.J, "_still")), this.c)))
                     .a(3, ol.a().a(om.c, os.bx.a(dkn.fI, "_full", ot.j(ot.a(dkn.J, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            oi.a(dkn.fK)
               .a(
                  oj.a(dow.g)
                     .a(1, ol.a().a(om.c, os.bv.a(dkn.fK, "_level1", ot.j(ot.H(dkn.rk)), this.c)))
                     .a(2, ol.a().a(om.c, os.bw.a(dkn.fK, "_level2", ot.j(ot.H(dkn.rk)), this.c)))
                     .a(3, ol.a().a(om.c, os.bx.a(dkn.fK, "_full", ot.j(ot.H(dkn.rk)), this.c)))
               )
         );
   }

   private void B() {
      ot $$0 = ot.b(dkn.kQ);
      alz $$1 = os.aF.a(dkn.kQ, $$0, this.c);
      alz $$2 = this.a(dkn.kQ, "_dead", os.aF, $$1x -> $$0.c(ou.b, $$1x));
      this.b.accept(oi.a(dkn.kQ).a(a(dyk.av, 5, $$2, $$1)));
   }

   private void C() {
      alz $$0 = oq.a(dkn.tL);
      alz $$1 = oq.a(dkn.tL, "_triggered");
      alz $$2 = oq.a(dkn.tL, "_crafting");
      alz $$3 = oq.a(dkn.tL, "_crafting_triggered");
      this.b
         .accept(
            oi.a(dkn.tL)
               .a(oj.a(dyk.U).a($$0x -> this.a($$0x, ol.a())))
               .a(
                  oj.a(dyk.B, dmf.b)
                     .a(false, false, ol.a().a(om.c, $$0))
                     .a(true, true, ol.a().a(om.c, $$3))
                     .a(true, false, ol.a().a(om.c, $$1))
                     .a(false, true, ol.a().a(om.c, $$2))
               )
         );
   }

   private void w(dkl $$0) {
      ot $$1 = new ot().a(ou.f, ot.a(dkn.cL, "_top")).a(ou.i, ot.a(dkn.cL, "_side")).a(ou.g, ot.a($$0, "_front"));
      ot $$2 = new ot().a(ou.i, ot.a(dkn.cL, "_top")).a(ou.g, ot.a($$0, "_front_vertical"));
      alz $$3 = os.p.a($$0, $$1, this.c);
      alz $$4 = os.r.a($$0, $$2, this.c);
      this.b
         .accept(
            oi.a($$0)
               .a(
                  oj.a(dyk.Q)
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
      alz $$0 = oq.a(dkn.fM);
      alz $$1 = oq.a(dkn.fM, "_filled");
      this.b.accept(oi.a(dkn.fM).a(oj.a(dyk.h).a(false, ol.a().a(om.c, $$0)).a(true, ol.a().a(om.c, $$1))).a(c()));
   }

   private void E() {
      alz $$0 = oq.a(dkn.kP, "_side");
      alz $$1 = oq.a(dkn.kP, "_noside");
      alz $$2 = oq.a(dkn.kP, "_noside1");
      alz $$3 = oq.a(dkn.kP, "_noside2");
      alz $$4 = oq.a(dkn.kP, "_noside3");
      this.b
         .accept(
            oh.a(dkn.kP)
               .a(og.a().a(dyk.M, true), ol.a().a(om.c, $$0))
               .a(og.a().a(dyk.N, true), ol.a().a(om.c, $$0).a(om.b, om.a.b).a(om.d, true))
               .a(og.a().a(dyk.O, true), ol.a().a(om.c, $$0).a(om.b, om.a.c).a(om.d, true))
               .a(og.a().a(dyk.P, true), ol.a().a(om.c, $$0).a(om.b, om.a.d).a(om.d, true))
               .a(og.a().a(dyk.K, true), ol.a().a(om.c, $$0).a(om.a, om.a.d).a(om.d, true))
               .a(og.a().a(dyk.L, true), ol.a().a(om.c, $$0).a(om.a, om.a.b).a(om.d, true))
               .a(og.a().a(dyk.M, false), ol.a().a(om.c, $$1).a(om.e, 2), ol.a().a(om.c, $$2), ol.a().a(om.c, $$3), ol.a().a(om.c, $$4))
               .a(
                  og.a().a(dyk.N, false),
                  ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$4).a(om.b, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.b, om.a.b).a(om.d, true)
               )
               .a(
                  og.a().a(dyk.O, false),
                  ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true),
                  ol.a().a(om.c, $$4).a(om.b, om.a.c).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.b, om.a.c).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true)
               )
               .a(
                  og.a().a(dyk.P, false),
                  ol.a().a(om.c, $$4).a(om.b, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.b, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true)
               )
               .a(
                  og.a().a(dyk.K, false),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.a, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$4).a(om.a, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.a, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.a, om.a.d).a(om.d, true)
               )
               .a(
                  og.a().a(dyk.L, false),
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
            oh.a(dkn.px)
               .a(ol.a().a(om.c, ot.H(dkn.px)))
               .a(og.a().a(dyk.aM, 1), ol.a().a(om.c, ot.a(dkn.px, "_contents1")))
               .a(og.a().a(dyk.aM, 2), ol.a().a(om.c, ot.a(dkn.px, "_contents2")))
               .a(og.a().a(dyk.aM, 3), ol.a().a(om.c, ot.a(dkn.px, "_contents3")))
               .a(og.a().a(dyk.aM, 4), ol.a().a(om.c, ot.a(dkn.px, "_contents4")))
               .a(og.a().a(dyk.aM, 5), ol.a().a(om.c, ot.a(dkn.px, "_contents5")))
               .a(og.a().a(dyk.aM, 6), ol.a().a(om.c, ot.a(dkn.px, "_contents6")))
               .a(og.a().a(dyk.aM, 7), ol.a().a(om.c, ot.a(dkn.px, "_contents7")))
               .a(og.a().a(dyk.aM, 8), ol.a().a(om.c, ot.a(dkn.px, "_contents_ready")))
         );
   }

   private void x(dkl $$0) {
      alz $$1 = os.c.a($$0, ot.a($$0), this.c);
      alz $$2 = this.a($$0, "_powered", os.c, ot::b);
      alz $$3 = this.a($$0, "_lit", os.c, ot::b);
      alz $$4 = this.a($$0, "_lit_powered", os.c, ot::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private of a(dkl $$0, alz $$1, alz $$2, alz $$3, alz $$4) {
      return oi.a($$0).a(oj.a(dyk.r, dyk.x).a(($$4x, $$5) -> $$4x ? ol.a().a(om.c, $$5 ? $$4 : $$2) : ol.a().a(om.c, $$5 ? $$3 : $$1)));
   }

   private void i(dkl $$0, dkl $$1) {
      alz $$2 = oq.a($$0);
      alz $$3 = oq.a($$0, "_powered");
      alz $$4 = oq.a($$0, "_lit");
      alz $$5 = oq.a($$0, "_lit_powered");
      this.a($$1, oq.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void y(dkl $$0) {
      this.c($$0);
      this.b.accept(oi.a($$0, ol.a().a(om.c, os.ao.a($$0, ot.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.y(dkn.qT);
      this.y(dkn.qS);
      this.y(dkn.qR);
      this.y(dkn.qQ);
   }

   private void H() {
      this.c(dkn.sO);
      oj.b<jm, dyq> $$0 = oj.a(dyk.bn, dyk.bo);

      for (dyq $$1 : dyq.values()) {
         $$0.a(jm.b, $$1, this.a(jm.b, $$1));
      }

      for (dyq $$2 : dyq.values()) {
         $$0.a(jm.a, $$2, this.a(jm.a, $$2));
      }

      this.b.accept(oi.a(dkn.sO).a($$0));
   }

   private ol a(jm $$0, dyq $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ot $$3 = ot.c(ot.a(dkn.sO, $$2));
      return ol.a().a(om.c, os.an.a(dkn.sO, $$2, $$3, this.c));
   }

   private void z(dkl $$0) {
      ot $$1 = new ot().a(ou.e, ot.H(dkn.ei)).a(ou.f, ot.H($$0)).a(ou.i, ot.a($$0, "_side"));
      this.b.accept(c($$0, os.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alz $$0 = ot.a(dkn.hp, "_side");
      ot $$1 = new ot().a(ou.f, ot.a(dkn.hp, "_top")).a(ou.i, $$0);
      ot $$2 = new ot().a(ou.f, ot.a(dkn.hp, "_inverted_top")).a(ou.i, $$0);
      this.b
         .accept(
            oi.a(dkn.hp)
               .a(oj.a(dyk.p).a(false, ol.a().a(om.c, os.aG.a(dkn.hp, $$1, this.c))).a(true, ol.a().a(om.c, os.aG.a(oq.a(dkn.hp, "_inverted"), $$2, this.c))))
         );
   }

   private void A(dkl $$0) {
      this.b.accept(oi.a($$0, ol.a().a(om.c, oq.a($$0))).a(this.n()));
   }

   private void J() {
      dkl $$0 = dkn.sN;
      alz $$1 = oq.a($$0, "_on");
      alz $$2 = oq.a($$0);
      this.b.accept(oi.a($$0, ol.a().a(om.c, oq.a($$0))).a(this.n()).a(a(dyk.x, $$1, $$2)));
   }

   private void K() {
      ot $$0 = new ot().a(ou.B, ot.H(dkn.j)).a(ou.f, ot.H(dkn.cK));
      ot $$1 = new ot().a(ou.B, ot.H(dkn.j)).a(ou.f, ot.a(dkn.cK, "_moist"));
      alz $$2 = os.aX.a(dkn.cK, $$0, this.c);
      alz $$3 = os.aX.a(ot.a(dkn.cK, "_moist"), $$1, this.c);
      this.b.accept(oi.a(dkn.cK).a(a(dyk.aR, 7, $$3, $$2)));
   }

   private List<alz> B(dkl $$0) {
      alz $$1 = os.aY.a(oq.a($$0, "_floor0"), ot.w($$0), this.c);
      alz $$2 = os.aY.a(oq.a($$0, "_floor1"), ot.x($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alz> C(dkl $$0) {
      alz $$1 = os.aZ.a(oq.a($$0, "_side0"), ot.w($$0), this.c);
      alz $$2 = os.aZ.a(oq.a($$0, "_side1"), ot.x($$0), this.c);
      alz $$3 = os.ba.a(oq.a($$0, "_side_alt0"), ot.w($$0), this.c);
      alz $$4 = os.ba.a(oq.a($$0, "_side_alt1"), ot.x($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alz> D(dkl $$0) {
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
      og $$0 = og.a().a(dyk.M, false).a(dyk.N, false).a(dyk.O, false).a(dyk.P, false).a(dyk.K, false);
      List<alz> $$1 = this.B(dkn.cy);
      List<alz> $$2 = this.C(dkn.cy);
      List<alz> $$3 = this.D(dkn.cy);
      this.b
         .accept(
            oh.a(dkn.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(og.b(og.a().a(dyk.M, true), $$0), a($$2, $$0x -> $$0x))
               .a(og.b(og.a().a(dyk.N, true), $$0), a($$2, $$0x -> $$0x.a(om.b, om.a.b)))
               .a(og.b(og.a().a(dyk.O, true), $$0), a($$2, $$0x -> $$0x.a(om.b, om.a.c)))
               .a(og.b(og.a().a(dyk.P, true), $$0), a($$2, $$0x -> $$0x.a(om.b, om.a.d)))
               .a(og.a().a(dyk.K, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alz> $$0 = this.B(dkn.cz);
      List<alz> $$1 = this.C(dkn.cz);
      this.b
         .accept(
            oh.a(dkn.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(om.b, om.a.b)))
               .a(a($$1, $$0x -> $$0x.a(om.b, om.a.c)))
               .a(a($$1, $$0x -> $$0x.a(om.b, om.a.d)))
         );
   }

   private void E(dkl $$0) {
      alz $$1 = ov.u.create($$0, this.c);
      alz $$2 = ov.v.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(oi.a($$0).a(a(dyk.j, $$2, $$1)));
   }

   private void N() {
      ot $$0 = ot.a(ot.a(dkn.ah, "_side"), ot.a(dkn.ah, "_top"));
      alz $$1 = os.j.a(dkn.ah, $$0, this.c);
      this.b.accept(d(dkn.ah, $$1));
   }

   private void O() {
      this.a(cxs.af);
      dkl $$0 = dkn.H;
      oj.b<Boolean, Integer> $$1 = oj.a(dpi.d, dpi.b);
      alz $$2 = oq.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alz $$4 = oq.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, ol.a().a(om.c, $$4));
         $$1.a(false, $$3, ol.a().a(om.c, $$2));
      }

      this.b.accept(oi.a(dkn.H).a($$1));
   }

   private void P() {
      this.b
         .accept(
            oi.a(dkn.ld)
               .a(
                  oj.a(dyk.at)
                     .a(0, ol.a().a(om.c, this.a(dkn.ld, "_0", os.c, ot::b)))
                     .a(1, ol.a().a(om.c, this.a(dkn.ld, "_1", os.c, ot::b)))
                     .a(2, ol.a().a(om.c, this.a(dkn.ld, "_2", os.c, ot::b)))
                     .a(3, ol.a().a(om.c, this.a(dkn.ld, "_3", os.c, ot::b)))
               )
         );
   }

   private void Q() {
      alz $$0 = ot.H(dkn.j);
      ot $$1 = new ot().a(ou.e, $$0).b(ou.e, ou.c).a(ou.f, ot.a(dkn.i, "_top")).a(ou.i, ot.a(dkn.i, "_snow"));
      ol $$2 = ol.a().a(om.c, os.n.a(dkn.i, "_snow", $$1, this.c));
      this.a(dkn.i, oq.a(dkn.i), $$2);
      alz $$3 = ov.f.get(dkn.fz).a($$1x -> $$1x.a(ou.e, $$0)).a(dkn.fz, this.c);
      this.a(dkn.fz, $$3, $$2);
      alz $$4 = ov.f.get(dkn.l).a($$1x -> $$1x.a(ou.e, $$0)).a(dkn.l, this.c);
      this.a(dkn.l, $$4, $$2);
   }

   private void a(dkl $$0, alz $$1, ol $$2) {
      List<ol> $$3 = Arrays.asList(a($$1));
      this.b.accept(oi.a($$0).a(oj.a(dyk.A).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cxs.rV);
      this.b
         .accept(
            oi.a(dkn.fQ)
               .a(
                  oj.a(dyk.as)
                     .a(0, ol.a().a(om.c, oq.a(dkn.fQ, "_stage0")))
                     .a(1, ol.a().a(om.c, oq.a(dkn.fQ, "_stage1")))
                     .a(2, ol.a().a(om.c, oq.a(dkn.fQ, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dkn.kZ, oq.a(dkn.kZ)));
   }

   private void j(dkl $$0, dkl $$1) {
      ot $$2 = ot.b($$1);
      alz $$3 = os.Y.a($$0, $$2, this.c);
      alz $$4 = os.Z.a($$0, $$2, this.c);
      this.b.accept(oi.a($$0).a(a(dyk.aU, 1, $$4, $$3)));
   }

   private void T() {
      alz $$0 = oq.a(dkn.hs);
      alz $$1 = oq.a(dkn.hs, "_side");
      this.a(cxs.mf);
      this.b
         .accept(
            oi.a(dkn.hs)
               .a(
                  oj.a(dyk.R)
                     .a(jm.a, ol.a().a(om.c, $$0))
                     .a(jm.c, ol.a().a(om.c, $$1))
                     .a(jm.f, ol.a().a(om.c, $$1).a(om.b, om.a.b))
                     .a(jm.d, ol.a().a(om.c, $$1).a(om.b, om.a.c))
                     .a(jm.e, ol.a().a(om.c, $$1).a(om.b, om.a.d))
               )
         );
   }

   private void k(dkl $$0, dkl $$1) {
      alz $$2 = oq.a($$0);
      this.b.accept(oi.a($$1, ol.a().a(om.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alz $$0 = oq.a(dkn.fk, "_post_ends");
      alz $$1 = oq.a(dkn.fk, "_post");
      alz $$2 = oq.a(dkn.fk, "_cap");
      alz $$3 = oq.a(dkn.fk, "_cap_alt");
      alz $$4 = oq.a(dkn.fk, "_side");
      alz $$5 = oq.a(dkn.fk, "_side_alt");
      this.b
         .accept(
            oh.a(dkn.fk)
               .a(ol.a().a(om.c, $$0))
               .a(og.a().a(dyk.M, false).a(dyk.N, false).a(dyk.O, false).a(dyk.P, false), ol.a().a(om.c, $$1))
               .a(og.a().a(dyk.M, true).a(dyk.N, false).a(dyk.O, false).a(dyk.P, false), ol.a().a(om.c, $$2))
               .a(og.a().a(dyk.M, false).a(dyk.N, true).a(dyk.O, false).a(dyk.P, false), ol.a().a(om.c, $$2).a(om.b, om.a.b))
               .a(og.a().a(dyk.M, false).a(dyk.N, false).a(dyk.O, true).a(dyk.P, false), ol.a().a(om.c, $$3))
               .a(og.a().a(dyk.M, false).a(dyk.N, false).a(dyk.O, false).a(dyk.P, true), ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(og.a().a(dyk.M, true), ol.a().a(om.c, $$4))
               .a(og.a().a(dyk.N, true), ol.a().a(om.c, $$4).a(om.b, om.a.b))
               .a(og.a().a(dyk.O, true), ol.a().a(om.c, $$5))
               .a(og.a().a(dyk.P, true), ol.a().a(om.c, $$5).a(om.b, om.a.b))
         );
      this.d(dkn.fk);
   }

   private void F(dkl $$0) {
      this.b.accept(oi.a($$0, ol.a().a(om.c, oq.a($$0))).a(b()));
   }

   private void V() {
      alz $$0 = oq.a(dkn.dI);
      alz $$1 = oq.a(dkn.dI, "_on");
      this.d(dkn.dI);
      this.b
         .accept(
            oi.a(dkn.dI)
               .a(a(dyk.x, $$0, $$1))
               .a(
                  oj.a(dyk.V, dyk.S)
                     .a(dyf.c, jm.c, ol.a().a(om.a, om.a.c).a(om.b, om.a.c))
                     .a(dyf.c, jm.f, ol.a().a(om.a, om.a.c).a(om.b, om.a.d))
                     .a(dyf.c, jm.d, ol.a().a(om.a, om.a.c))
                     .a(dyf.c, jm.e, ol.a().a(om.a, om.a.c).a(om.b, om.a.b))
                     .a(dyf.a, jm.c, ol.a())
                     .a(dyf.a, jm.f, ol.a().a(om.b, om.a.b))
                     .a(dyf.a, jm.d, ol.a().a(om.b, om.a.c))
                     .a(dyf.a, jm.e, ol.a().a(om.b, om.a.d))
                     .a(dyf.b, jm.c, ol.a().a(om.a, om.a.b))
                     .a(dyf.b, jm.f, ol.a().a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(dyf.b, jm.d, ol.a().a(om.a, om.a.b).a(om.b, om.a.c))
                     .a(dyf.b, jm.e, ol.a().a(om.a, om.a.b).a(om.b, om.a.d))
               )
         );
   }

   private void W() {
      this.d(dkn.fA);
      this.b.accept(b(dkn.fA, oq.a(dkn.fA)));
   }

   private void X() {
      this.d(dkn.tI);
      this.b.accept(c(dkn.tI, oq.a(dkn.tI)));
   }

   private void Y() {
      this.b.accept(oi.a(dkn.eq).a(oj.a(dyk.I).a(jm.a.a, ol.a().a(om.c, oq.a(dkn.eq, "_ns"))).a(jm.a.c, ol.a().a(om.c, oq.a(dkn.eq, "_ew")))));
   }

   private void Z() {
      alz $$0 = ov.a.create(dkn.ei, this.c);
      this.b
         .accept(
            oi.a(
               dkn.ei,
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
      alz $$0 = oq.a(dkn.lj);
      alz $$1 = oq.a(dkn.lj, "_on");
      this.b.accept(oi.a(dkn.lj).a(a(dyk.x, $$1, $$0)).a(e()));
   }

   private void ab() {
      ot $$0 = new ot().a(ou.e, ot.a(dkn.bF, "_bottom")).a(ou.i, ot.a(dkn.bF, "_side"));
      alz $$1 = ot.a(dkn.bF, "_top_sticky");
      alz $$2 = ot.a(dkn.bF, "_top");
      ot $$3 = $$0.c(ou.E, $$1);
      ot $$4 = $$0.c(ou.E, $$2);
      alz $$5 = oq.a(dkn.bF, "_base");
      this.a(dkn.bF, $$5, $$4);
      this.a(dkn.by, $$5, $$3);
      alz $$6 = os.n.a(dkn.bF, "_inventory", $$0.c(ou.f, $$2), this.c);
      alz $$7 = os.n.a(dkn.by, "_inventory", $$0.c(ou.f, $$1), this.c);
      this.a(dkn.bF, $$6);
      this.a(dkn.by, $$7);
   }

   private void a(dkl $$0, alz $$1, ot $$2) {
      alz $$3 = os.bm.a($$0, $$2, this.c);
      this.b.accept(oi.a($$0).a(a(dyk.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      ot $$0 = new ot().a(ou.F, ot.a(dkn.bF, "_top")).a(ou.i, ot.a(dkn.bF, "_side"));
      ot $$1 = $$0.c(ou.E, ot.a(dkn.bF, "_top_sticky"));
      ot $$2 = $$0.c(ou.E, ot.a(dkn.bF, "_top"));
      this.b
         .accept(
            oi.a(dkn.bG)
               .a(
                  oj.a(dyk.y, dyk.bh)
                     .a(false, dyv.a, ol.a().a(om.c, os.bn.a(dkn.bF, "_head", $$2, this.c)))
                     .a(false, dyv.b, ol.a().a(om.c, os.bn.a(dkn.bF, "_head_sticky", $$1, this.c)))
                     .a(true, dyv.a, ol.a().a(om.c, os.bo.a(dkn.bF, "_head_short", $$2, this.c)))
                     .a(true, dyv.b, ol.a().a(om.c, os.bo.a(dkn.bF, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dkl $$0 = dkn.tM;
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
      this.b.accept(oi.a($$0).a(oj.a(dyk.bz, dyk.bC).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> ol.a().a(om.c, $$7x ? $$10 : $$7);
            case b, c, d -> ol.a().a(om.c, $$7x ? $$11 : $$8);
            case e -> ol.a().a(om.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dkl $$0 = dkn.tN;
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
      this.b.accept(oi.a($$0).a(b()).a(oj.a(dtj.b, dtj.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> ol.a().a(om.c, $$9x ? $$13 : $$5);
            case b -> ol.a().a(om.c, $$9x ? $$14 : $$6);
            case c -> ol.a().a(om.c, $$9x ? $$15 : $$7);
            case d -> ol.a().a(om.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alz $$0 = oq.a(dkn.rl, "_inactive");
      alz $$1 = oq.a(dkn.rl, "_active");
      this.a(dkn.rl, $$0);
      this.b.accept(oi.a(dkn.rl).a(oj.a(dyk.bp).a($$2 -> ol.a().a(om.c, $$2 != dza.b && $$2 != dza.c ? $$0 : $$1))));
   }

   private void ag() {
      alz $$0 = oq.a(dkn.rm, "_inactive");
      alz $$1 = oq.a(dkn.rm, "_active");
      this.a(dkn.rm, $$0);
      this.b.accept(oi.a(dkn.rm).a(oj.a(dyk.bp).a($$2 -> ol.a().a(om.c, $$2 != dza.b && $$2 != dza.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alz $$0 = os.bR.a(dkn.rq, ot.a(false), this.c);
      alz $$1 = os.bR.a(dkn.rq, "_can_summon", ot.a(true), this.c);
      this.a(dkn.rq, $$0);
      this.b.accept(oi.a(dkn.rq).a(a(dyk.H, $$1, $$0)));
   }

   private void ai() {
      alz $$0 = oq.a(dkn.on, "_stable");
      alz $$1 = oq.a(dkn.on, "_unstable");
      this.a(dkn.on, $$0);
      this.b.accept(oi.a(dkn.on).a(a(dyk.b, $$1, $$0)));
   }

   private void aj() {
      alz $$0 = this.a(dkn.sQ, "", os.ao, ot::c);
      alz $$1 = this.a(dkn.sQ, "_lit", os.ao, ot::c);
      this.b.accept(oi.a(dkn.sQ).a(a(dyk.E, $$1, $$0)));
      alz $$2 = this.a(dkn.sR, "", os.ao, ot::c);
      alz $$3 = this.a(dkn.sR, "_lit", os.ao, ot::c);
      this.b.accept(oi.a(dkn.sR).a(a(dyk.E, $$3, $$2)));
   }

   private void ak() {
      alz $$0 = ov.a.create(dkn.fP, this.c);
      alz $$1 = this.a(dkn.fP, "_on", os.c, ot::b);
      this.b.accept(oi.a(dkn.fP).a(a(dyk.r, $$1, $$0)));
   }

   private void l(dkl $$0, dkl $$1) {
      ot $$2 = ot.z($$0);
      this.b.accept(c($$0, os.bg.a($$0, $$2, this.c)));
      this.b.accept(oi.a($$1, ol.a().a(om.c, os.bi.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      ot $$0 = ot.z(dkn.dX);
      ot $$1 = ot.i(ot.a(dkn.dX, "_off"));
      alz $$2 = os.bk.a(dkn.dX, $$0, this.c);
      alz $$3 = os.bh.a(dkn.dX, "_off", $$1, this.c);
      this.b.accept(oi.a(dkn.dX).a(a(dyk.r, $$2, $$3)));
      alz $$4 = os.bl.a(dkn.dY, $$0, this.c);
      alz $$5 = os.bj.a(dkn.dY, "_off", $$1, this.c);
      this.b.accept(oi.a(dkn.dY).a(a(dyk.r, $$4, $$5)).a(d()));
      this.d(dkn.dX);
      this.c(dkn.dY);
   }

   private void am() {
      this.a(cxs.lY);
      this.b.accept(oi.a(dkn.eu).a(oj.a(dyk.aB, dyk.t, dyk.x).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return ol.a().a(om.c, ot.a(dkn.eu, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cxs.da);
      this.b
         .accept(
            oi.a(dkn.nq)
               .a(
                  oj.a(dyk.aT, dyk.D)
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
      ot $$0 = ot.a(dkn.ea);
      alz $$1 = os.c.a(dkn.ec, $$0, this.c);
      this.b.accept(oi.a(dkn.ea).a(oj.a(dyk.aG).a($$1x -> ol.a().a(om.c, $$1x < 8 ? oq.a(dkn.ea, "_height" + $$1x * 2) : $$1))));
      this.a(dkn.ea, oq.a(dkn.ea, "_height2"));
      this.b.accept(c(dkn.ec, $$1));
   }

   private void ap() {
      this.b.accept(oi.a(dkn.ox, ol.a().a(om.c, oq.a(dkn.ox))).a(b()));
   }

   private void aq() {
      alz $$0 = ov.a.create(dkn.pv, this.c);
      this.a(dkn.pv, $$0);
      this.b.accept(oi.a(dkn.pv).a(oj.a(dyk.bk).a($$0x -> ol.a().a(om.c, this.a(dkn.pv, "_" + $$0x.c(), os.c, ot::b)))));
   }

   private void ar() {
      this.a(cxs.xl);
      this.b.accept(oi.a(dkn.oD).a(oj.a(dyk.at).a($$0 -> ol.a().a(om.c, this.a(dkn.oD, "_stage" + $$0, os.ao, ot::c)))));
   }

   private void as() {
      this.a(cxs.pO);
      this.b
         .accept(
            oi.a(dkn.fW)
               .a(
                  oj.a(dyk.a, dyk.N, dyk.M, dyk.O, dyk.P)
                     .a(false, false, false, false, false, ol.a().a(om.c, oq.a(dkn.fW, "_ns")))
                     .a(false, true, false, false, false, ol.a().a(om.c, oq.a(dkn.fW, "_n")).a(om.b, om.a.b))
                     .a(false, false, true, false, false, ol.a().a(om.c, oq.a(dkn.fW, "_n")))
                     .a(false, false, false, true, false, ol.a().a(om.c, oq.a(dkn.fW, "_n")).a(om.b, om.a.c))
                     .a(false, false, false, false, true, ol.a().a(om.c, oq.a(dkn.fW, "_n")).a(om.b, om.a.d))
                     .a(false, true, true, false, false, ol.a().a(om.c, oq.a(dkn.fW, "_ne")))
                     .a(false, true, false, true, false, ol.a().a(om.c, oq.a(dkn.fW, "_ne")).a(om.b, om.a.b))
                     .a(false, false, false, true, true, ol.a().a(om.c, oq.a(dkn.fW, "_ne")).a(om.b, om.a.c))
                     .a(false, false, true, false, true, ol.a().a(om.c, oq.a(dkn.fW, "_ne")).a(om.b, om.a.d))
                     .a(false, false, true, true, false, ol.a().a(om.c, oq.a(dkn.fW, "_ns")))
                     .a(false, true, false, false, true, ol.a().a(om.c, oq.a(dkn.fW, "_ns")).a(om.b, om.a.b))
                     .a(false, true, true, true, false, ol.a().a(om.c, oq.a(dkn.fW, "_nse")))
                     .a(false, true, false, true, true, ol.a().a(om.c, oq.a(dkn.fW, "_nse")).a(om.b, om.a.b))
                     .a(false, false, true, true, true, ol.a().a(om.c, oq.a(dkn.fW, "_nse")).a(om.b, om.a.c))
                     .a(false, true, true, false, true, ol.a().a(om.c, oq.a(dkn.fW, "_nse")).a(om.b, om.a.d))
                     .a(false, true, true, true, true, ol.a().a(om.c, oq.a(dkn.fW, "_nsew")))
                     .a(true, false, false, false, false, ol.a().a(om.c, oq.a(dkn.fW, "_attached_ns")))
                     .a(true, false, true, false, false, ol.a().a(om.c, oq.a(dkn.fW, "_attached_n")))
                     .a(true, false, false, true, false, ol.a().a(om.c, oq.a(dkn.fW, "_attached_n")).a(om.b, om.a.c))
                     .a(true, true, false, false, false, ol.a().a(om.c, oq.a(dkn.fW, "_attached_n")).a(om.b, om.a.b))
                     .a(true, false, false, false, true, ol.a().a(om.c, oq.a(dkn.fW, "_attached_n")).a(om.b, om.a.d))
                     .a(true, true, true, false, false, ol.a().a(om.c, oq.a(dkn.fW, "_attached_ne")))
                     .a(true, true, false, true, false, ol.a().a(om.c, oq.a(dkn.fW, "_attached_ne")).a(om.b, om.a.b))
                     .a(true, false, false, true, true, ol.a().a(om.c, oq.a(dkn.fW, "_attached_ne")).a(om.b, om.a.c))
                     .a(true, false, true, false, true, ol.a().a(om.c, oq.a(dkn.fW, "_attached_ne")).a(om.b, om.a.d))
                     .a(true, false, true, true, false, ol.a().a(om.c, oq.a(dkn.fW, "_attached_ns")))
                     .a(true, true, false, false, true, ol.a().a(om.c, oq.a(dkn.fW, "_attached_ns")).a(om.b, om.a.b))
                     .a(true, true, true, true, false, ol.a().a(om.c, oq.a(dkn.fW, "_attached_nse")))
                     .a(true, true, false, true, true, ol.a().a(om.c, oq.a(dkn.fW, "_attached_nse")).a(om.b, om.a.b))
                     .a(true, false, true, true, true, ol.a().a(om.c, oq.a(dkn.fW, "_attached_nse")).a(om.b, om.a.c))
                     .a(true, true, true, false, true, ol.a().a(om.c, oq.a(dkn.fW, "_attached_nse")).a(om.b, om.a.d))
                     .a(true, true, true, true, true, ol.a().a(om.c, oq.a(dkn.fW, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dkn.fV);
      this.b.accept(oi.a(dkn.fV).a(oj.a(dyk.a, dyk.x).a(($$0, $$1) -> ol.a().a(om.c, ot.a(dkn.fV, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
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
            return this.a($$0.intValue(), "", ot.b(ot.H(dkn.mA)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ot.b(ot.a(dkn.mA, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ot.b(ot.a(dkn.mA, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cxs.kD);
      this.b.accept(oi.a(dkn.mA).a(oj.a(dyk.aE, dyk.aF).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cxs.kE);
      Function<Integer, alz> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ot $$2 = ot.a($$1);
         return os.bB.a(dkn.mB, $$1, $$2, this.c);
      };
      this.b.accept(oi.a(dkn.mB).a(oj.a(drw.c).a($$1 -> ol.a().a(om.c, $$0.apply($$1)))));
   }

   private void G(dkl $$0) {
      this.d($$0);
      alz $$1 = oq.a($$0);
      oh $$2 = oh.a($$0);
      og.c $$3 = ae.a(og.a(), $$1x -> a.stream().<jm>map(Pair::getFirst).map(dpn::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jm, Function<alz, ol>> $$4 : a) {
         dyl $$5 = dpn.b((jm)$$4.getFirst());
         Function<alz, ol> $$6 = (Function<alz, ol>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(og.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void H(dkl $$0) {
      alz $$1 = ov.j.create($$0, this.c);
      alz $$2 = ov.k.get($$0).a($$1x -> $$1x.a(ou.i, ot.a($$0, "_side_tall"))).a($$0, "_side_tall", this.c);
      alz $$3 = ov.k.get($$0).a($$1x -> $$1x.a(ou.i, ot.a($$0, "_side_small"))).a($$0, "_side_small", this.c);
      oh $$4 = oh.a($$0);
      og.c $$5 = og.a().a(dpl.b, false);
      $$4.a(og.a().a(dpl.b, true), ol.a().a(om.c, $$1));
      $$4.a($$5, ol.a().a(om.c, $$1));
      a.stream().<jm>map(Pair::getFirst).forEach($$2x -> {
         dyr<dzf> $$3x = dpl.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dzf.a);
         }
      });

      for (Pair<jm, Function<alz, ol>> $$6 : a) {
         jm $$7 = (jm)$$6.getFirst();
         dyr<dzf> $$8 = dpl.a($$7);
         if ($$8 != null) {
            Function<alz, ol> $$9 = (Function<alz, ol>)$$6.getSecond();
            $$4.a(og.a().a($$8, dzf.c), $$9.apply($$2));
            $$4.a(og.a().a($$8, dzf.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void I(dkl $$0) {
      oj $$1 = oj.a(dod.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         ot $$3 = ot.c(ot.a($$0, $$2));
         alz $$4 = ob.e.b.a().a($$0, $$2, $$3, this.c);
         return ol.a().a(om.c, $$4);
      });
      this.d($$0);
      this.b.accept(oi.a($$0).a($$1));
   }

   private void aw() {
      alz $$0 = ot.a(dkn.rp, "_bottom");
      ot $$1 = new ot().a(ou.e, $$0).a(ou.f, ot.a(dkn.rp, "_top")).a(ou.i, ot.a(dkn.rp, "_side"));
      ot $$2 = new ot().a(ou.e, $$0).a(ou.f, ot.a(dkn.rp, "_top_bloom")).a(ou.i, ot.a(dkn.rp, "_side_bloom"));
      alz $$3 = os.n.a(dkn.rp, "", $$1, this.c);
      alz $$4 = os.n.a(dkn.rp, "_bloom", $$2, this.c);
      this.b.accept(oi.a(dkn.rp).a(oj.a(dyk.F).a($$2x -> ol.a().a(om.c, $$2x ? $$4 : $$3))));
      this.a(cxs.gw, $$3);
   }

   private void ax() {
      dkl $$0 = dkn.ct;
      alz $$1 = oq.a($$0);
      oh $$2 = oh.a($$0);
      List.of(Pair.of(jm.c, om.a.a), Pair.of(jm.f, om.a.b), Pair.of(jm.d, om.a.c), Pair.of(jm.e, om.a.d)).forEach($$2x -> {
         jm $$3 = (jm)$$2x.getFirst();
         om.a $$4 = (om.a)$$2x.getSecond();
         og.c $$5 = og.a().a(dyk.S, $$3);
         $$2.a($$5, ol.a().a(om.c, $$1).a(om.b, $$4).a(om.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, oq.a($$0, "_inventory"));
      i.clear();
   }

   private void a(oh $$0, og.c $$1, om.a $$2) {
      List.of(Pair.of(dyk.bq, os.aN), Pair.of(dyk.br, os.aO), Pair.of(dyk.bs, os.aP), Pair.of(dyk.bt, os.aQ), Pair.of(dyk.bu, os.aR), Pair.of(dyk.bv, os.aS))
         .forEach($$3 -> {
            dyl $$4 = (dyl)$$3.getFirst();
            or $$5 = (or)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(oh $$0, og.c $$1, om.a $$2, dyl $$3, or $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ot $$7 = new ot().a(ou.b, ot.a(dkn.ct, $$6));
      ob.d $$8 = new ob.d($$4, $$6);
      alz $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dkn.ct, $$6, $$7, this.c));
      $$0.a(og.a($$1, og.a().a($$3, $$5)), ol.a().a(om.c, $$9).a(om.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dkn.le, os.c.a(dkn.le, ot.b(oq.a("magma")), this.c)));
   }

   private void J(dkl $$0) {
      this.b($$0, ov.r);
      os.bI.a(oq.a($$0.j()), ot.v($$0), this.c);
   }

   private void b(dkl $$0, dkl $$1, ob.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dkl $$0, dkl $$1) {
      os.bJ.a(oq.a($$0.j()), ot.v($$1), this.c);
   }

   private void az() {
      alz $$0 = oq.a(dkn.b);
      alz $$1 = oq.a(dkn.b, "_mirrored");
      this.b.accept(a(dkn.fb, $$0, $$1));
      this.a(dkn.fb, $$0);
   }

   private void aA() {
      alz $$0 = oq.a(dkn.te);
      alz $$1 = oq.a(dkn.te, "_mirrored");
      this.b.accept(a(dkn.ty, $$0, $$1).a(f()));
      this.a(dkn.ty, $$0);
   }

   private void n(dkl $$0, dkl $$1) {
      this.a($$0, ob.e.b);
      ot $$2 = ot.d(ot.a($$0, "_pot"));
      alz $$3 = ob.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alz $$0 = ot.a(dkn.pG, "_bottom");
      alz $$1 = ot.a(dkn.pG, "_top_off");
      alz $$2 = ot.a(dkn.pG, "_top");
      alz[] $$3 = new alz[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ot $$5 = new ot().a(ou.e, $$0).a(ou.f, $$4 == 0 ? $$1 : $$2).a(ou.i, ot.a(dkn.pG, "_side" + $$4));
         $$3[$$4] = os.n.a(dkn.pG, "_" + $$4, $$5, this.c);
      }

      this.b.accept(oi.a(dkn.pG).a(oj.a(dyk.ba).a($$1x -> ol.a().a(om.c, $$3[$$1x]))));
      this.a(cxs.xJ, $$3[0]);
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
      alz $$0 = ot.a(dkn.pw, "_top");
      alz $$1 = ot.a(dkn.pw, "_bottom");
      alz $$2 = ot.a(dkn.pw, "_side");
      alz $$3 = ot.a(dkn.pw, "_lock");
      ot $$4 = new ot().a(ou.o, $$2).a(ou.m, $$2).a(ou.l, $$2).a(ou.c, $$0).a(ou.j, $$0).a(ou.k, $$1).a(ou.n, $$3);
      alz $$5 = os.b.a(dkn.pw, $$4, this.c);
      this.b.accept(oi.a(dkn.pw, ol.a().a(om.c, $$5)).a(oj.a(dyk.U).a($$0x -> this.a($$0x, ol.a()))));
   }

   private void aD() {
      dkl $$0 = dkn.n;
      alz $$1 = oq.a($$0);
      ov $$2 = ov.a.get($$0);
      dkl $$3 = dkn.jZ;
      alz $$4 = os.ab.a($$3, $$2.b(), this.c);
      alz $$5 = os.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      md.a().filter(me::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dkn.rA).a(md.x).a(dkn.rA, dkn.rY).a(dkn.rE, dkn.rI).a(md.z);
      this.i(dkn.rz).a(md.B).a(dkn.rz, dkn.rX).a(dkn.rD, dkn.rH).a(md.D);
      this.i(dkn.ry).a(md.F).a(dkn.ry, dkn.rW).a(dkn.rC, dkn.rG).a(md.H);
      this.i(dkn.rx).a(md.J).a(dkn.rx, dkn.rV).a(dkn.rB, dkn.rF).a(md.L);
      this.x(dkn.sF);
      this.x(dkn.sG);
      this.x(dkn.sH);
      this.x(dkn.sI);
      this.i(dkn.sF, dkn.sJ);
      this.i(dkn.sG, dkn.sK);
      this.i(dkn.sH, dkn.sL);
      this.i(dkn.sI, dkn.sM);
      this.n(dkn.a);
      this.c(dkn.nx, dkn.a);
      this.c(dkn.nw, dkn.a);
      this.n(dkn.gc);
      this.n(dkn.ed);
      this.c(dkn.ny, dkn.J);
      this.n(dkn.fO);
      this.n(dkn.mz);
      this.n(dkn.fF);
      this.n(dkn.gf);
      this.a(cxs.uU);
      this.n(dkn.pB);
      this.n(dkn.J);
      this.n(dkn.K);
      this.n(dkn.im);
      this.a(cxs.gf);
      this.o(dkn.qh, dkn.qy);
      this.o(dkn.qi, dkn.qz);
      this.o(dkn.qj, dkn.qA);
      this.o(dkn.qk, dkn.qB);
      this.o(dkn.ql, dkn.qC);
      this.o(dkn.qm, dkn.qD);
      this.o(dkn.qn, dkn.qE);
      this.o(dkn.qo, dkn.qF);
      this.o(dkn.qp, dkn.qG);
      this.o(dkn.qq, dkn.qH);
      this.o(dkn.qr, dkn.qI);
      this.o(dkn.qs, dkn.qJ);
      this.o(dkn.qt, dkn.qK);
      this.o(dkn.qu, dkn.qL);
      this.o(dkn.qv, dkn.qM);
      this.o(dkn.qw, dkn.qN);
      this.o(dkn.qg, dkn.qx);
      this.n(dkn.nv);
      this.n(dkn.gH);
      this.n(dkn.rk);
      this.n(dkn.sS);
      this.t(dkn.sT);
      this.t(dkn.sU);
      this.u(dkn.tD);
      this.u(dkn.tE);
      this.aj();
      this.g(dkn.sX, dkn.sV);
      this.H(dkn.tQ);
      this.I(dkn.tR);
      this.a(dkn.tP);
      this.q(dkn.sW);
      this.a(dkn.in, cxs.hP);
      this.a(cxs.hP);
      this.aE();
      this.a(dkn.li, cxs.jp);
      this.a(cxs.jp);
      this.f(dkn.bX, ot.a(dkn.bF, "_side"));
      this.a(dkn.U);
      this.a(dkn.V);
      this.a(dkn.iS);
      this.a(dkn.cF);
      this.a(dkn.cG);
      this.a(dkn.cH);
      this.a(dkn.fS);
      this.a(dkn.fT);
      this.a(dkn.fX);
      this.a(dkn.Q);
      this.a(dkn.W);
      this.a(dkn.R);
      this.a(dkn.co);
      this.a(dkn.S);
      this.a(dkn.T);
      this.a(dkn.cp);
      this.b(dkn.pE, ov.d);
      this.a(dkn.pD);
      this.a(dkn.aY);
      this.a(dkn.aZ);
      this.a(dkn.ba);
      this.a(dkn.hr);
      this.a(dkn.dV);
      this.a(dkn.dW);
      this.a(dkn.hq);
      this.a(dkn.pX);
      this.a(dkn.nr);
      this.a(dkn.ee);
      this.a(dkn.k);
      this.a(dkn.pF);
      this.a(dkn.fN);
      this.a(dkn.ep);
      this.a(dkn.O);
      this.a(dkn.pC);
      this.a(dkn.eb);
      this.b(dkn.eg, ov.g);
      this.b(dkn.pL, ov.d);
      this.b(dkn.fo, ov.d);
      this.n(dkn.ag);
      this.n(dkn.gp);
      this.a(dkn.lf);
      this.a(dkn.bf);
      this.a(dkn.iT);
      this.a(dkn.cv);
      this.a(dkn.qf);
      this.a(dkn.iz);
      this.a(dkn.oT);
      this.a(dkn.ej);
      this.a(dkn.ek);
      this.b(dkn.cA, ov.b);
      this.h(dkn.cB);
      this.a(dkn.aV);
      this.b(dkn.bD, ov.w);
      this.a(cxs.cZ);
      this.b(dkn.cr, ov.f);
      this.b(dkn.py, ov.d);
      this.a(dkn.oK);
      this.a(dkn.aW);
      this.a(dkn.qO);
      this.a(dkn.qP);
      this.a(dkn.ri);
      this.a(dkn.sP);
      this.a(dkn.tA);
      this.a(dkn.tB);
      this.a(dkn.tC);
      this.e(dkn.rn);
      this.n(dkn.tO);
      this.aD();
      this.a(dkn.rv);
      this.a(dkn.rw);
      this.a(dkn.rr);
      this.a(dkn.rs);
      this.a(dkn.rt);
      this.a(dkn.ru);
      this.k(dkn.rr, dkn.rR);
      this.k(dkn.rs, dkn.rT);
      this.k(dkn.rt, dkn.rS);
      this.k(dkn.ru, dkn.rU);
      this.j(dkn.sh);
      this.j(dkn.si);
      this.j(dkn.sk);
      this.j(dkn.sj);
      this.a(dkn.sh, dkn.sl);
      this.a(dkn.si, dkn.sm);
      this.a(dkn.sk, dkn.so);
      this.a(dkn.sj, dkn.sn);
      this.l(dkn.sp);
      this.l(dkn.sq);
      this.l(dkn.ss);
      this.l(dkn.sr);
      this.b(dkn.sp, dkn.st);
      this.b(dkn.sq, dkn.su);
      this.b(dkn.ss, dkn.sw);
      this.b(dkn.sr, dkn.sv);
      this.a(dkn.sx);
      this.a(dkn.sy);
      this.a(dkn.sz);
      this.a(dkn.sA);
      this.k(dkn.sx, dkn.sB);
      this.k(dkn.sy, dkn.sC);
      this.k(dkn.sz, dkn.sD);
      this.k(dkn.sA, dkn.sE);
      this.j(dkn.hm, dkn.co);
      this.j(dkn.hn, dkn.cp);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dkn.oB, dkn.oC);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.A(dkn.kO);
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
      this.G(dkn.ft);
      this.G(dkn.fu);
      this.G(dkn.ro);
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
      this.F(dkn.cX);
      this.d(dkn.cX);
      this.F(dkn.ov);
      this.g();
      this.F(dkn.sZ);
      this.l(dkn.cw, dkn.cx);
      this.l(dkn.en, dkn.eo);
      this.a(dkn.cI, dkn.n, ot::c);
      this.a(dkn.ot, dkn.p, ot::d);
      this.z(dkn.oR);
      this.z(dkn.oI);
      this.w(dkn.bb);
      this.w(dkn.hy);
      this.C();
      this.E(dkn.oz);
      this.E(dkn.oA);
      this.e(dkn.fl, oq.a(dkn.fl));
      this.a(dkn.el, ov.d);
      this.a(dkn.em, ov.d);
      this.a(dkn.tz);
      this.a(dkn.lh, ov.d);
      this.f(dkn.j);
      this.f(dkn.tc);
      this.f(dkn.L);
      this.g(dkn.M);
      this.g(dkn.P);
      this.f(dkn.N);
      this.e(dkn.I);
      this.b(dkn.tJ, ov.f);
      this.a(dkn.iA, ov.d, ov.e);
      this.a(dkn.kS, ov.x, ov.y);
      this.a(dkn.hv, ov.x, ov.y);
      this.a(dkn.tF, ov.d, ov.e);
      this.a(dkn.tG, ov.d, ov.e);
      this.a(dkn.tH, ov.d, ov.e);
      this.c(dkn.oo, ov.i);
      this.z();
      this.a(dkn.pz, ot::B);
      this.a(dkn.pA, ot::D);
      this.a(dkn.kY, dyk.at, 0, 1, 2, 3);
      this.a(dkn.gI, dyk.aw, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkn.fE, dyk.at, 0, 1, 1, 2);
      this.a(dkn.gJ, dyk.aw, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkn.cJ, dyk.aw, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dkn.kV, ob.e.b, dyk.ar, 0, 1);
      this.i();
      this.h();
      this.a(oq.a("decorated_pot"), dkn.iR).b(dkn.tK);
      this.a(oq.a("banner"), dkn.n)
         .a(os.bK, dkn.ja, dkn.jb, dkn.jc, dkn.jd, dkn.je, dkn.jf, dkn.jg, dkn.jh, dkn.ji, dkn.jj, dkn.jk, dkn.jl, dkn.jm, dkn.jn, dkn.jo, dkn.jp)
         .b(dkn.jq, dkn.jr, dkn.js, dkn.jt, dkn.ju, dkn.jv, dkn.jw, dkn.jx, dkn.jy, dkn.jz, dkn.jA, dkn.jB, dkn.jC, dkn.jD, dkn.jE, dkn.jF);
      this.a(oq.a("bed"), dkn.n)
         .b(dkn.bg, dkn.bh, dkn.bi, dkn.bj, dkn.bk, dkn.bl, dkn.bm, dkn.bn, dkn.bo, dkn.bp, dkn.bq, dkn.br, dkn.bs, dkn.bt, dkn.bu, dkn.bv);
      this.m(dkn.bg, dkn.bH);
      this.m(dkn.bh, dkn.bI);
      this.m(dkn.bi, dkn.bJ);
      this.m(dkn.bj, dkn.bK);
      this.m(dkn.bk, dkn.bL);
      this.m(dkn.bl, dkn.bM);
      this.m(dkn.bm, dkn.bN);
      this.m(dkn.bn, dkn.bO);
      this.m(dkn.bo, dkn.bP);
      this.m(dkn.bp, dkn.bQ);
      this.m(dkn.bq, dkn.bR);
      this.m(dkn.br, dkn.bS);
      this.m(dkn.bs, dkn.bT);
      this.m(dkn.bt, dkn.bU);
      this.m(dkn.bu, dkn.bV);
      this.m(dkn.bv, dkn.bW);
      this.a(oq.a("skull"), dkn.ej)
         .a(os.bL, dkn.hc, dkn.ha, dkn.gY, dkn.gU, dkn.gW, dkn.hg)
         .a(dkn.he)
         .b(dkn.hd, dkn.hf, dkn.hb, dkn.gZ, dkn.gV, dkn.gX, dkn.hh);
      this.J(dkn.lk);
      this.J(dkn.ll);
      this.J(dkn.lm);
      this.J(dkn.ln);
      this.J(dkn.lo);
      this.J(dkn.lp);
      this.J(dkn.lq);
      this.J(dkn.lr);
      this.J(dkn.ls);
      this.J(dkn.lt);
      this.J(dkn.lu);
      this.J(dkn.lv);
      this.J(dkn.lw);
      this.J(dkn.lx);
      this.J(dkn.ly);
      this.J(dkn.lz);
      this.J(dkn.lA);
      this.b(dkn.ns, ov.r);
      this.c(dkn.ns);
      this.a(oq.a("chest"), dkn.n).b(dkn.cD, dkn.hl);
      this.a(oq.a("ender_chest"), dkn.cv).b(dkn.fU);
      this.f(dkn.fL, dkn.cv).a(dkn.fL, dkn.la);
      this.a(dkn.aT);
      this.a(dkn.aU);
      this.a(dkn.lR);
      this.a(dkn.lS);
      this.a(dkn.lT);
      this.a(dkn.lU);
      this.a(dkn.lV);
      this.a(dkn.lW);
      this.a(dkn.lX);
      this.a(dkn.lY);
      this.a(dkn.lZ);
      this.a(dkn.ma);
      this.a(dkn.mb);
      this.a(dkn.mc);
      this.a(dkn.md);
      this.a(dkn.me);
      this.a(dkn.mf);
      this.a(dkn.mg);
      this.a(ov.a, dkn.mh, dkn.mi, dkn.mj, dkn.mk, dkn.ml, dkn.mm, dkn.mn, dkn.mo, dkn.mp, dkn.mq, dkn.mr, dkn.ms, dkn.mt, dkn.mu, dkn.mv, dkn.mw);
      this.a(dkn.iR);
      this.a(dkn.hz);
      this.a(dkn.hA);
      this.a(dkn.hB);
      this.a(dkn.hC);
      this.a(dkn.hD);
      this.a(dkn.hE);
      this.a(dkn.hF);
      this.a(dkn.hG);
      this.a(dkn.hH);
      this.a(dkn.hI);
      this.a(dkn.hJ);
      this.a(dkn.hK);
      this.a(dkn.hL);
      this.a(dkn.hM);
      this.a(dkn.hN);
      this.a(dkn.hO);
      this.a(dkn.rj);
      this.h(dkn.aX, dkn.fm);
      this.h(dkn.ev, dkn.hP);
      this.h(dkn.ew, dkn.hQ);
      this.h(dkn.ex, dkn.hR);
      this.h(dkn.ey, dkn.hS);
      this.h(dkn.ez, dkn.hT);
      this.h(dkn.eA, dkn.hU);
      this.h(dkn.eB, dkn.hV);
      this.h(dkn.eC, dkn.hW);
      this.h(dkn.eD, dkn.hX);
      this.h(dkn.eE, dkn.hY);
      this.h(dkn.eF, dkn.hZ);
      this.h(dkn.eG, dkn.ia);
      this.h(dkn.eH, dkn.ib);
      this.h(dkn.eI, dkn.ic);
      this.h(dkn.eJ, dkn.id);
      this.h(dkn.eK, dkn.ie);
      this.b(ov.p, dkn.lB, dkn.lC, dkn.lD, dkn.lE, dkn.lF, dkn.lG, dkn.lH, dkn.lI, dkn.lJ, dkn.lK, dkn.lL, dkn.lM, dkn.lN, dkn.lO, dkn.lP, dkn.lQ);
      this.g(dkn.bH, dkn.iB);
      this.g(dkn.bI, dkn.iC);
      this.g(dkn.bJ, dkn.iD);
      this.g(dkn.bK, dkn.iE);
      this.g(dkn.bL, dkn.iF);
      this.g(dkn.bM, dkn.iG);
      this.g(dkn.bN, dkn.iH);
      this.g(dkn.bO, dkn.iI);
      this.g(dkn.bP, dkn.iJ);
      this.g(dkn.bQ, dkn.iK);
      this.g(dkn.bR, dkn.iL);
      this.g(dkn.bS, dkn.iM);
      this.g(dkn.bT, dkn.iN);
      this.g(dkn.bU, dkn.iO);
      this.g(dkn.bV, dkn.iP);
      this.g(dkn.bW, dkn.iQ);
      this.a(dkn.td);
      this.a(dkn.eZ);
      this.a(dkn.bB, dkn.gq, ob.e.a);
      this.a(dkn.bY, dkn.gr, ob.e.b);
      this.a(dkn.ca, dkn.gs, ob.e.b);
      this.a(dkn.cb, dkn.gt, ob.e.b);
      this.a(dkn.cc, dkn.gu, ob.e.b);
      this.a(dkn.cd, dkn.gv, ob.e.b);
      this.a(dkn.ce, dkn.gw, ob.e.b);
      this.a(dkn.cf, dkn.gx, ob.e.b);
      this.a(dkn.cg, dkn.gy, ob.e.b);
      this.a(dkn.ch, dkn.gz, ob.e.b);
      this.a(dkn.ci, dkn.gA, ob.e.b);
      this.a(dkn.cj, dkn.gB, ob.e.b);
      this.a(dkn.cl, dkn.gC, ob.e.b);
      this.a(dkn.ck, dkn.gD, ob.e.b);
      this.a(dkn.cn, dkn.gE, ob.e.b);
      this.a(dkn.cm, dkn.gF, ob.e.b);
      this.a(dkn.bC, dkn.gG, ob.e.b);
      this.a(dkn.bZ, dkn.gg, ob.e.b);
      this.H();
      this.v(dkn.fh);
      this.v(dkn.fi);
      this.v(dkn.fj);
      this.a(dkn.bA, ob.e.a);
      this.b(dkn.ef, ob.e.a);
      this.a(cxs.dQ);
      this.b(dkn.mx, dkn.my, ob.e.b);
      this.a(cxs.dR);
      this.c(dkn.my);
      this.b(dkn.tb, ob.e.b);
      this.c(dkn.tb);
      this.c(dkn.sR);
      this.b(dkn.oU, dkn.oV, ob.e.b);
      this.b(dkn.oW, dkn.oX, ob.e.b);
      this.a(dkn.oU, "_plant");
      this.c(dkn.oV);
      this.a(dkn.oW, "_plant");
      this.c(dkn.oX);
      this.a(dkn.nt, ob.e.a, ot.c(ot.a(dkn.nu, "_stage0")));
      this.m();
      this.a(dkn.bz, ob.e.b);
      this.c(dkn.iV, ob.e.b);
      this.c(dkn.iW, ob.e.b);
      this.c(dkn.iX, ob.e.b);
      this.c(dkn.iY, ob.e.a);
      this.c(dkn.iZ, ob.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dkn.mR, dkn.mM, dkn.mH, dkn.mC, dkn.nb, dkn.mW, dkn.nl, dkn.ng);
      this.a(dkn.mS, dkn.mN, dkn.mI, dkn.mD, dkn.nc, dkn.mX, dkn.nm, dkn.nh);
      this.a(dkn.mT, dkn.mO, dkn.mJ, dkn.mE, dkn.nd, dkn.mY, dkn.nn, dkn.ni);
      this.a(dkn.mU, dkn.mP, dkn.mK, dkn.mF, dkn.ne, dkn.mZ, dkn.no, dkn.nj);
      this.a(dkn.mV, dkn.mQ, dkn.mL, dkn.mG, dkn.nf, dkn.na, dkn.np, dkn.nk);
      this.e(dkn.fs, dkn.fq);
      this.e(dkn.fr, dkn.fp);
      this.m(dkn.af).c(dkn.af).a(dkn.aA);
      this.m(dkn.ar).c(dkn.ar).a(dkn.aJ);
      this.a(dkn.ar, dkn.du, dkn.dE);
      this.b(dkn.aS, ov.t);
      this.m(dkn.ab).c(dkn.ab).a(dkn.ax);
      this.m(dkn.am).c(dkn.am).a(dkn.aF);
      this.a(dkn.am, dkn.dn, dkn.dz);
      this.a(dkn.D, dkn.gl, ob.e.b);
      this.b(dkn.aO, ov.t);
      this.m(dkn.ac).d(dkn.ac).a(dkn.ay);
      this.m(dkn.an).d(dkn.an).a(dkn.aG);
      this.a(dkn.an, dkn.do, dkn.dA);
      this.a(dkn.E, dkn.gm, ob.e.b);
      this.b(dkn.aP, ov.t);
      this.m(dkn.Z).c(dkn.Z).a(dkn.av);
      this.m(dkn.ak).c(dkn.ak).a(dkn.aD);
      this.a(dkn.ak, dkn.dm, dkn.dy);
      this.a(dkn.B, dkn.gj, ob.e.b);
      this.b(dkn.aM, ov.t);
      this.m(dkn.X).c(dkn.X).a(dkn.at);
      this.m(dkn.aq).c(dkn.aq).a(dkn.aB);
      this.a(dkn.aq, dkn.dk, dkn.dw);
      this.a(dkn.z, dkn.gh, ob.e.b);
      this.b(dkn.aK, ov.t);
      this.m(dkn.Y).c(dkn.Y).a(dkn.au);
      this.m(dkn.aj).c(dkn.aj).a(dkn.aC);
      this.a(dkn.aj, dkn.dl, dkn.dx);
      this.a(dkn.A, dkn.gi, ob.e.b);
      this.b(dkn.aL, ov.t);
      this.m(dkn.ad).c(dkn.ad).a(dkn.az);
      this.m(dkn.ao).c(dkn.ao).a(dkn.aH);
      this.a(dkn.ao, dkn.dq, dkn.dC);
      this.a(dkn.F, dkn.gn, ob.e.b);
      this.b(dkn.aQ, ov.t);
      this.m(dkn.ae).c(dkn.ae).a(dkn.u);
      this.m(dkn.ap).c(dkn.ap).a(dkn.aI);
      this.a(dkn.ap, dkn.dr, dkn.dD);
      this.a(dkn.G, dkn.go, ob.e.b);
      this.b(dkn.aR, ov.t);
      this.m(dkn.aa).c(dkn.aa).a(dkn.aw);
      this.m(dkn.al).c(dkn.al).a(dkn.aE);
      this.a(dkn.al, dkn.dp, dkn.dB);
      this.a(dkn.C, dkn.gk, ob.e.b);
      this.b(dkn.aN, ov.t);
      this.m(dkn.oN).b(dkn.oN).a(dkn.oP);
      this.m(dkn.oO).b(dkn.oO).a(dkn.oQ);
      this.a(dkn.oO, dkn.ds, dkn.dF);
      this.a(dkn.oS, dkn.pH, ob.e.b);
      this.n(dkn.oY, dkn.pJ);
      this.m(dkn.oE).b(dkn.oE).a(dkn.oG);
      this.m(dkn.oF).b(dkn.oF).a(dkn.oH);
      this.a(dkn.oF, dkn.dt, dkn.dG);
      this.a(dkn.oJ, dkn.pI, ob.e.b);
      this.n(dkn.oL, dkn.pK);
      this.m(dkn.ai).d(dkn.ai);
      this.m(dkn.as).d(dkn.as);
      this.a(dkn.x, dkn.dv, dkn.dH);
      this.b(dkn.oM, ob.e.b);
      this.a(cxs.dN);
      this.j(dkn.dK);
      this.l(dkn.ip);
      this.u();
      this.o(dkn.cY);
      this.p(dkn.bw);
      this.p(dkn.bx);
      this.p(dkn.hx);
      this.t();
      this.r(dkn.gb);
      this.r(dkn.lb);
      this.r(dkn.lc);
      this.s(dkn.hi);
      this.s(dkn.hj);
      this.s(dkn.hk);
      this.o();
      this.p();
      this.d(dkn.cL, ov.h);
      this.d(dkn.or, ov.h);
      this.d(dkn.oq, ov.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dkn.eY, dkn.fg);
      this.k(dkn.m, dkn.fc);
      this.k(dkn.eX, dkn.ff);
      this.k(dkn.eW, dkn.fe);
      this.az();
      this.k(dkn.eV, dkn.fd);
      this.aA();
      cyx.b().forEach($$0 -> this.a($$0, oq.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dkn.io);
      oj.a<Integer> $$0 = oj.a(dyk.aQ);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alz $$3 = ot.a(cxs.hQ, $$2);
         $$0.a($$1, ol.a().a(om.c, os.aa.a(dkn.io, $$2, ot.h($$3), this.c)));
         os.bC.a(oq.a(cxs.hQ, $$2), ot.k($$3), this.c);
      }

      this.b.accept(oi.a(dkn.io).a($$0));
   }

   private void o(dkl $$0, dkl $$1) {
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
                  oj.a(dyk.aA, dyk.r)
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
      this.b.accept(oi.a($$1).a(a(dyk.r, $$13, $$12)));
   }

   class a {
      private final alz b;

      public a(final alz $$0, final dkl $$1) {
         this.b = os.aa.a($$0, ot.v($$1), ob.this.c);
      }

      public ob.a a(dkl... $$0) {
         for (dkl $$1 : $$0) {
            ob.this.b.accept(ob.c($$1, this.b));
         }

         return this;
      }

      public ob.a b(dkl... $$0) {
         for (dkl $$1 : $$0) {
            ob.this.c($$1);
         }

         return this.a($$0);
      }

      public ob.a a(or $$0, dkl... $$1) {
         for (dkl $$2 : $$1) {
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
      private final Set<dkl> f = new HashSet<>();

      public b(final ot $$0) {
         this.b = $$0;
      }

      public ob.b a(dkl $$0, or $$1) {
         this.e = $$1.a($$0, this.b, ob.this.c);
         if (ob.this.f.containsKey($$0)) {
            ob.this.b.accept(ob.this.f.get($$0).create($$0, this.e, this.b, ob.this.c));
         } else {
            ob.this.b.accept(ob.c($$0, this.e));
         }

         return this;
      }

      public ob.b a(dkl $$0, dkl $$1) {
         alz $$2 = oq.a($$0);
         ob.this.b.accept(ob.c($$1, $$2));
         ob.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public ob.b a(dkl $$0) {
         alz $$1 = os.s.a($$0, this.b, ob.this.c);
         alz $$2 = os.t.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.b($$0, $$1, $$2));
         alz $$3 = os.u.a($$0, this.b, ob.this.c);
         ob.this.a($$0, $$3);
         return this;
      }

      public ob.b b(dkl $$0) {
         alz $$1 = os.M.a($$0, this.b, ob.this.c);
         alz $$2 = os.N.a($$0, this.b, ob.this.c);
         alz $$3 = os.O.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$1, $$2, $$3));
         alz $$4 = os.P.a($$0, this.b, ob.this.c);
         ob.this.a($$0, $$4);
         return this;
      }

      public ob.b c(dkl $$0) {
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

      public ob.b d(dkl $$0) {
         alz $$1 = os.J.a($$0, this.b, ob.this.c);
         alz $$2 = os.K.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.c($$0, $$1, $$2));
         alz $$3 = os.L.a($$0, this.b, ob.this.c);
         ob.this.a($$0, $$3);
         return this;
      }

      public ob.b e(dkl $$0) {
         ot $$1 = ot.q($$0);
         alz $$2 = os.R.a($$0, $$1, ob.this.c);
         alz $$3 = os.Q.a($$0, $$1, ob.this.c);
         alz $$4 = os.T.a($$0, $$1, ob.this.c);
         alz $$5 = os.S.a($$0, $$1, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ob.b f(dkl $$0) {
         alz $$1 = os.V.a($$0, this.b, ob.this.c);
         alz $$2 = os.U.a($$0, this.b, ob.this.c);
         alz $$3 = os.X.a($$0, this.b, ob.this.c);
         alz $$4 = os.W.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ob.b g(dkl $$0) {
         alz $$1 = os.Y.a($$0, this.b, ob.this.c);
         alz $$2 = os.Z.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.e($$0, $$1, $$2));
         return this;
      }

      public ob.b h(dkl $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dkl $$1 = this.d.b().get(me.b.r);
            alz $$2 = os.aa.a($$0, this.b, ob.this.c);
            ob.this.b.accept(ob.c($$0, $$2));
            ob.this.b.accept(ob.c($$1, $$2));
            ob.this.a($$0.j());
            ob.this.c($$1);
            return this;
         }
      }

      public ob.b i(dkl $$0) {
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

      public ob.b j(dkl $$0) {
         alz $$1 = this.a(os.af, $$0);
         alz $$2 = this.a(os.ae, $$0);
         alz $$3 = this.a(os.ag, $$0);
         ob.this.b.accept(ob.b($$0, $$1, $$2, $$3));
         ob.this.a($$0, $$2);
         return this;
      }

      private ob.b k(dkl $$0) {
         ov $$1 = ob.this.g.getOrDefault($$0, ov.a.get($$0));
         alz $$2 = $$1.a($$0, ob.this.c);
         ob.this.b.accept(ob.c($$0, $$2));
         return this;
      }

      private ob.b l(dkl $$0) {
         ob.this.j($$0);
         return this;
      }

      private void m(dkl $$0) {
         if (ob.this.e.contains($$0)) {
            ob.this.l($$0);
         } else {
            ob.this.k($$0);
         }
      }

      private alz a(or $$0, dkl $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ob.this.c));
      }

      public ob.b a(me $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<ob.b, dkl> $$2 = ob.h.get($$0x);
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
      of create(dkl var1, alz var2, ot var3, BiConsumer<alz, Supplier<JsonElement>> var4);
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

      public ob.f a(dkl $$0) {
         ot $$1 = this.b.c(ou.d, this.b.a(ou.i));
         alz $$2 = os.j.a($$0, $$1, ob.this.c);
         ob.this.b.accept(ob.d($$0, $$2));
         return this;
      }

      public ob.f b(dkl $$0) {
         alz $$1 = os.j.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.d($$0, $$1));
         return this;
      }

      public ob.f c(dkl $$0) {
         alz $$1 = os.j.a($$0, this.b, ob.this.c);
         alz $$2 = os.k.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.d($$0, $$1, $$2));
         return this;
      }

      public ob.f d(dkl $$0) {
         ob.this.b.accept(ob.a($$0, this.b, ob.this.c));
         return this;
      }
   }
}
