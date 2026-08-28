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
   private final Consumer<cxg> d;
   final List<dke> e = ImmutableList.of(dkg.eL, dkg.eR, dkg.ip);
   final Map<dke, ob.c> f = ImmutableMap.builder().put(dkg.b, ob::a).put(dkg.te, ob::c).put(dkg.fa, ob::b).build();
   final Map<dke, ov> g = ImmutableMap.builder()
      .put(dkg.bc, ov.z.get(dkg.bc))
      .put(dkg.jG, ov.z.get(dkg.jG))
      .put(dkg.kk, ov.a(ot.a(dkg.bc, "_top")))
      .put(dkg.km, ov.a(ot.a(dkg.jG, "_top")))
      .put(dkg.be, ov.d.get(dkg.bc).a($$0x -> $$0x.a(ou.i, ot.H(dkg.be))))
      .put(dkg.jI, ov.d.get(dkg.jG).a($$0x -> $$0x.a(ou.i, ot.H(dkg.jI))))
      .put(dkg.ht, ov.d.get(dkg.ht))
      .put(dkg.kl, ov.a(ot.a(dkg.ht, "_bottom")))
      .put(dkg.pM, ov.A.get(dkg.pM))
      .put(dkg.te, ov.A.get(dkg.te))
      .put(dkg.hu, ov.d.get(dkg.hu).a($$0x -> $$0x.a(ou.i, ot.H(dkg.hu))))
      .put(dkg.bd, ov.d.get(dkg.bd).a($$0x -> {
         $$0x.a(ou.d, ot.a(dkg.bc, "_top"));
         $$0x.a(ou.i, ot.H(dkg.bd));
      }))
      .put(dkg.jH, ov.d.get(dkg.jH).a($$0x -> {
         $$0x.a(ou.d, ot.a(dkg.jG, "_top"));
         $$0x.a(ou.i, ot.H(dkg.jH));
      }))
      .put(dkg.rh, ov.A.get(dkg.rh))
      .put(dkg.rc, ov.A.get(dkg.rc))
      .build();
   static final Map<me.b, BiConsumer<ob.b, dke>> h = ImmutableMap.builder()
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

   private static of a(dke $$0, alz $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      alz $$4 = os.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static of b(dke $$0, alz $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      alz $$4 = os.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static of c(dke $$0, alz $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      alz $$4 = os.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ob(Consumer<of> $$0, BiConsumer<alz, Supplier<JsonElement>> $$1, Consumer<cxg> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dke $$0) {
      this.d.accept($$0.j());
   }

   void a(dke $$0, alz $$1) {
      this.c.accept(oq.a($$0.j()), new op($$1));
   }

   private void a(cxg $$0, alz $$1) {
      this.c.accept(oq.a($$0), new op($$1));
   }

   void a(cxg $$0) {
      os.bC.a(oq.a($$0), ot.b($$0), this.c);
   }

   private void d(dke $$0) {
      cxg $$1 = $$0.j();
      if ($$1 != cxo.a) {
         os.bC.a(oq.a($$1), ot.G($$0), this.c);
      }
   }

   private void a(dke $$0, String $$1) {
      cxg $$2 = $$0.j();
      os.bC.a(oq.a($$2), ot.k(ot.a($$0, $$1)), this.c);
   }

   private static oj b() {
      return oj.a(dyd.S).a(jm.f, ol.a().a(om.b, om.a.b)).a(jm.d, ol.a().a(om.b, om.a.c)).a(jm.e, ol.a().a(om.b, om.a.d)).a(jm.c, ol.a());
   }

   private static oj c() {
      return oj.a(dyd.S).a(jm.d, ol.a()).a(jm.e, ol.a().a(om.b, om.a.b)).a(jm.c, ol.a().a(om.b, om.a.c)).a(jm.f, ol.a().a(om.b, om.a.d));
   }

   private static oj d() {
      return oj.a(dyd.S).a(jm.f, ol.a()).a(jm.d, ol.a().a(om.b, om.a.b)).a(jm.e, ol.a().a(om.b, om.a.c)).a(jm.c, ol.a().a(om.b, om.a.d));
   }

   private static oj e() {
      return oj.a(dyd.Q)
         .a(jm.a, ol.a().a(om.a, om.a.b))
         .a(jm.b, ol.a().a(om.a, om.a.d))
         .a(jm.c, ol.a())
         .a(jm.d, ol.a().a(om.b, om.a.c))
         .a(jm.e, ol.a().a(om.b, om.a.d))
         .a(jm.f, ol.a().a(om.b, om.a.b));
   }

   private static oi b(dke $$0, alz $$1) {
      return oi.a($$0, a($$1));
   }

   private static ol[] a(alz $$0) {
      return new ol[]{ol.a().a(om.c, $$0), ol.a().a(om.c, $$0).a(om.b, om.a.b), ol.a().a(om.c, $$0).a(om.b, om.a.c), ol.a().a(om.c, $$0).a(om.b, om.a.d)};
   }

   private static oi a(dke $$0, alz $$1, alz $$2) {
      return oi.a($$0, ol.a().a(om.c, $$1), ol.a().a(om.c, $$2), ol.a().a(om.c, $$1).a(om.b, om.a.c), ol.a().a(om.c, $$2).a(om.b, om.a.c));
   }

   private static oj a(dye $$0, alz $$1, alz $$2) {
      return oj.a($$0).a(true, ol.a().a(om.c, $$1)).a(false, ol.a().a(om.c, $$2));
   }

   private void e(dke $$0) {
      alz $$1 = ov.a.create($$0, this.c);
      alz $$2 = ov.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dke $$0) {
      alz $$1 = ov.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dke $$0) {
      this.b.accept(oi.a($$0).a(oj.a(dyd.bw).a($$1 -> {
         String $$2 = "_" + $$1;
         alz $$3 = ot.a($$0, $$2);
         return ol.a().a(om.c, os.c.a($$0, $$2, new ot().a(ou.a, $$3), this.c));
      })));
      this.a($$0, ot.a($$0, "_0"));
   }

   static of b(dke $$0, alz $$1, alz $$2) {
      return oi.a($$0)
         .a(oj.a(dyd.x).a(false, ol.a().a(om.c, $$1)).a(true, ol.a().a(om.c, $$2)))
         .a(
            oj.a(dyd.V, dyd.S)
               .a(dxy.a, jm.f, ol.a().a(om.b, om.a.b))
               .a(dxy.a, jm.e, ol.a().a(om.b, om.a.d))
               .a(dxy.a, jm.d, ol.a().a(om.b, om.a.c))
               .a(dxy.a, jm.c, ol.a())
               .a(dxy.b, jm.f, ol.a().a(om.b, om.a.b).a(om.a, om.a.b).a(om.d, true))
               .a(dxy.b, jm.e, ol.a().a(om.b, om.a.d).a(om.a, om.a.b).a(om.d, true))
               .a(dxy.b, jm.d, ol.a().a(om.b, om.a.c).a(om.a, om.a.b).a(om.d, true))
               .a(dxy.b, jm.c, ol.a().a(om.a, om.a.b).a(om.d, true))
               .a(dxy.c, jm.f, ol.a().a(om.b, om.a.d).a(om.a, om.a.c))
               .a(dxy.c, jm.e, ol.a().a(om.b, om.a.b).a(om.a, om.a.c))
               .a(dxy.c, jm.d, ol.a().a(om.a, om.a.c))
               .a(dxy.c, jm.c, ol.a().a(om.b, om.a.c).a(om.a, om.a.c))
         );
   }

   private static oj.d<jm, dyi, dyh, Boolean> a(oj.d<jm, dyi, dyh, Boolean> $$0, dyi $$1, alz $$2, alz $$3, alz $$4, alz $$5) {
      return $$0.a(jm.f, $$1, dyh.a, false, ol.a().a(om.c, $$2))
         .a(jm.d, $$1, dyh.a, false, ol.a().a(om.c, $$2).a(om.b, om.a.b))
         .a(jm.e, $$1, dyh.a, false, ol.a().a(om.c, $$2).a(om.b, om.a.c))
         .a(jm.c, $$1, dyh.a, false, ol.a().a(om.c, $$2).a(om.b, om.a.d))
         .a(jm.f, $$1, dyh.b, false, ol.a().a(om.c, $$4))
         .a(jm.d, $$1, dyh.b, false, ol.a().a(om.c, $$4).a(om.b, om.a.b))
         .a(jm.e, $$1, dyh.b, false, ol.a().a(om.c, $$4).a(om.b, om.a.c))
         .a(jm.c, $$1, dyh.b, false, ol.a().a(om.c, $$4).a(om.b, om.a.d))
         .a(jm.f, $$1, dyh.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
         .a(jm.d, $$1, dyh.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
         .a(jm.e, $$1, dyh.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
         .a(jm.c, $$1, dyh.a, true, ol.a().a(om.c, $$3))
         .a(jm.f, $$1, dyh.b, true, ol.a().a(om.c, $$5).a(om.b, om.a.d))
         .a(jm.d, $$1, dyh.b, true, ol.a().a(om.c, $$5))
         .a(jm.e, $$1, dyh.b, true, ol.a().a(om.c, $$5).a(om.b, om.a.b))
         .a(jm.c, $$1, dyh.b, true, ol.a().a(om.c, $$5).a(om.b, om.a.c));
   }

   private static of a(dke $$0, alz $$1, alz $$2, alz $$3, alz $$4, alz $$5, alz $$6, alz $$7, alz $$8) {
      return oi.a($$0).a(a(a(oj.a(dyd.S, dyd.af, dyd.bf, dyd.v), dyi.b, $$1, $$2, $$3, $$4), dyi.a, $$5, $$6, $$7, $$8));
   }

   static of a(dke $$0, alz $$1, alz $$2, alz $$3, alz $$4, alz $$5) {
      return oh.a($$0)
         .a(ol.a().a(om.c, $$1))
         .a(og.a().a(dyd.M, true), ol.a().a(om.c, $$2).a(om.d, false))
         .a(og.a().a(dyd.N, true), ol.a().a(om.c, $$3).a(om.d, false))
         .a(og.a().a(dyd.O, true), ol.a().a(om.c, $$4).a(om.d, false))
         .a(og.a().a(dyd.P, true), ol.a().a(om.c, $$5).a(om.d, false));
   }

   static of c(dke $$0, alz $$1, alz $$2) {
      return oh.a($$0)
         .a(ol.a().a(om.c, $$1))
         .a(og.a().a(dyd.M, true), ol.a().a(om.c, $$2).a(om.d, true))
         .a(og.a().a(dyd.N, true), ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true))
         .a(og.a().a(dyd.O, true), ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true))
         .a(og.a().a(dyd.P, true), ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true));
   }

   static of a(dke $$0, alz $$1, alz $$2, alz $$3) {
      return oh.a($$0)
         .a(og.a().a(dyd.K, true), ol.a().a(om.c, $$1))
         .a(og.a().a(dyd.Y, dyy.b), ol.a().a(om.c, $$2).a(om.d, true))
         .a(og.a().a(dyd.X, dyy.b), ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true))
         .a(og.a().a(dyd.Z, dyy.b), ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true))
         .a(og.a().a(dyd.aa, dyy.b), ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true))
         .a(og.a().a(dyd.Y, dyy.c), ol.a().a(om.c, $$3).a(om.d, true))
         .a(og.a().a(dyd.X, dyy.c), ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true))
         .a(og.a().a(dyd.Z, dyy.c), ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true))
         .a(og.a().a(dyd.aa, dyy.c), ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true));
   }

   static of a(dke $$0, alz $$1, alz $$2, alz $$3, alz $$4, boolean $$5) {
      return oi.a($$0, ol.a().a(om.d, $$5))
         .a(c())
         .a(
            oj.a(dyd.q, dyd.v)
               .a(false, false, ol.a().a(om.c, $$2))
               .a(true, false, ol.a().a(om.c, $$4))
               .a(false, true, ol.a().a(om.c, $$1))
               .a(true, true, ol.a().a(om.c, $$3))
         );
   }

   static of b(dke $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0)
         .a(
            oj.a(dyd.S, dyd.ag, dyd.bj)
               .a(jm.f, dyl.b, dyv.a, ol.a().a(om.c, $$2))
               .a(jm.e, dyl.b, dyv.a, ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyl.b, dyv.a, ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyl.b, dyv.a, ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyl.b, dyv.e, ol.a().a(om.c, $$3))
               .a(jm.e, dyl.b, dyv.e, ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyl.b, dyv.e, ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyl.b, dyv.e, ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyl.b, dyv.d, ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true))
               .a(jm.e, dyl.b, dyv.d, ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true))
               .a(jm.d, dyl.b, dyv.d, ol.a().a(om.c, $$3))
               .a(jm.c, dyl.b, dyv.d, ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true))
               .a(jm.f, dyl.b, dyv.c, ol.a().a(om.c, $$1))
               .a(jm.e, dyl.b, dyv.c, ol.a().a(om.c, $$1).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyl.b, dyv.c, ol.a().a(om.c, $$1).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyl.b, dyv.c, ol.a().a(om.c, $$1).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyl.b, dyv.b, ol.a().a(om.c, $$1).a(om.b, om.a.d).a(om.d, true))
               .a(jm.e, dyl.b, dyv.b, ol.a().a(om.c, $$1).a(om.b, om.a.b).a(om.d, true))
               .a(jm.d, dyl.b, dyv.b, ol.a().a(om.c, $$1))
               .a(jm.c, dyl.b, dyv.b, ol.a().a(om.c, $$1).a(om.b, om.a.c).a(om.d, true))
               .a(jm.f, dyl.a, dyv.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.d, true))
               .a(jm.e, dyl.a, dyv.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyl.a, dyv.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyl.a, dyv.a, ol.a().a(om.c, $$2).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyl.a, dyv.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.e, dyl.a, dyv.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.d, dyl.a, dyv.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.c, dyl.a, dyv.e, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.d, true))
               .a(jm.f, dyl.a, dyv.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.d, true))
               .a(jm.e, dyl.a, dyv.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyl.a, dyv.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyl.a, dyv.d, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.f, dyl.a, dyv.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.e, dyl.a, dyv.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
               .a(jm.d, dyl.a, dyv.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.c, dyl.a, dyv.c, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.d, true))
               .a(jm.f, dyl.a, dyv.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.d, true))
               .a(jm.e, dyl.a, dyv.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.c).a(om.d, true))
               .a(jm.d, dyl.a, dyv.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.b).a(om.d, true))
               .a(jm.c, dyl.a, dyv.b, ol.a().a(om.c, $$1).a(om.a, om.a.c).a(om.b, om.a.d).a(om.d, true))
         );
   }

   private static of c(dke $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0)
         .a(
            oj.a(dyd.S, dyd.ag, dyd.v)
               .a(jm.c, dyl.b, false, ol.a().a(om.c, $$2))
               .a(jm.d, dyl.b, false, ol.a().a(om.c, $$2).a(om.b, om.a.c))
               .a(jm.f, dyl.b, false, ol.a().a(om.c, $$2).a(om.b, om.a.b))
               .a(jm.e, dyl.b, false, ol.a().a(om.c, $$2).a(om.b, om.a.d))
               .a(jm.c, dyl.a, false, ol.a().a(om.c, $$1))
               .a(jm.d, dyl.a, false, ol.a().a(om.c, $$1).a(om.b, om.a.c))
               .a(jm.f, dyl.a, false, ol.a().a(om.c, $$1).a(om.b, om.a.b))
               .a(jm.e, dyl.a, false, ol.a().a(om.c, $$1).a(om.b, om.a.d))
               .a(jm.c, dyl.b, true, ol.a().a(om.c, $$3))
               .a(jm.d, dyl.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(jm.f, dyl.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(jm.e, dyl.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
               .a(jm.c, dyl.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.c))
               .a(jm.d, dyl.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.a))
               .a(jm.f, dyl.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.d))
               .a(jm.e, dyl.a, true, ol.a().a(om.c, $$3).a(om.a, om.a.c).a(om.b, om.a.b))
         );
   }

   private static of d(dke $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0)
         .a(
            oj.a(dyd.S, dyd.ag, dyd.v)
               .a(jm.c, dyl.b, false, ol.a().a(om.c, $$2))
               .a(jm.d, dyl.b, false, ol.a().a(om.c, $$2))
               .a(jm.f, dyl.b, false, ol.a().a(om.c, $$2))
               .a(jm.e, dyl.b, false, ol.a().a(om.c, $$2))
               .a(jm.c, dyl.a, false, ol.a().a(om.c, $$1))
               .a(jm.d, dyl.a, false, ol.a().a(om.c, $$1))
               .a(jm.f, dyl.a, false, ol.a().a(om.c, $$1))
               .a(jm.e, dyl.a, false, ol.a().a(om.c, $$1))
               .a(jm.c, dyl.b, true, ol.a().a(om.c, $$3))
               .a(jm.d, dyl.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(jm.f, dyl.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(jm.e, dyl.b, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
               .a(jm.c, dyl.a, true, ol.a().a(om.c, $$3))
               .a(jm.d, dyl.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(jm.f, dyl.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(jm.e, dyl.a, true, ol.a().a(om.c, $$3).a(om.b, om.a.d))
         );
   }

   static oi c(dke $$0, alz $$1) {
      return oi.a($$0, ol.a().a(om.c, $$1));
   }

   private static oj f() {
      return oj.a(dyd.J).a(jm.a.b, ol.a()).a(jm.a.c, ol.a().a(om.a, om.a.b)).a(jm.a.a, ol.a().a(om.a, om.a.b).a(om.b, om.a.b));
   }

   static of a(dke $$0, ot $$1, BiConsumer<alz, Supplier<JsonElement>> $$2) {
      alz $$3 = os.g.a($$0, $$1, $$2);
      alz $$4 = os.h.a($$0, $$1, $$2);
      alz $$5 = os.i.a($$0, $$1, $$2);
      alz $$6 = os.j.a($$0, $$1, $$2);
      return oi.a($$0, ol.a().a(om.c, $$6)).a(oj.a(dyd.J).a(jm.a.a, ol.a().a(om.c, $$3)).a(jm.a.b, ol.a().a(om.c, $$4)).a(jm.a.c, ol.a().a(om.c, $$5)));
   }

   static of d(dke $$0, alz $$1) {
      return oi.a($$0, ol.a().a(om.c, $$1)).a(f());
   }

   private void e(dke $$0, alz $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dke $$0, ov.a $$1) {
      alz $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dke $$0, ov.a $$1) {
      alz $$2 = $$1.create($$0, this.c);
      this.b.accept(oi.a($$0, ol.a().a(om.c, $$2)).a(b()));
   }

   static of d(dke $$0, alz $$1, alz $$2) {
      return oi.a($$0)
         .a(
            oj.a(dyd.J)
               .a(jm.a.b, ol.a().a(om.c, $$1))
               .a(jm.a.c, ol.a().a(om.c, $$2).a(om.a, om.a.b))
               .a(jm.a.a, ol.a().a(om.c, $$2).a(om.a, om.a.b).a(om.b, om.a.b))
         );
   }

   private void a(dke $$0, ov.a $$1, ov.a $$2) {
      alz $$3 = $$1.create($$0, this.c);
      alz $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void h(dke $$0) {
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
                  oj.a(dyd.J, dma.c)
                     .a(jm.a.b, dma.a.a, ol.a().a(om.c, $$2))
                     .a(jm.a.c, dma.a.a, ol.a().a(om.c, $$3).a(om.a, om.a.b))
                     .a(jm.a.a, dma.a.a, ol.a().a(om.c, $$3).a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(jm.a.b, dma.a.b, ol.a().a(om.c, $$4))
                     .a(jm.a.c, dma.a.b, ol.a().a(om.c, $$5).a(om.a, om.a.b))
                     .a(jm.a.a, dma.a.b, ol.a().a(om.c, $$5).a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(jm.a.b, dma.a.c, ol.a().a(om.c, $$4))
                     .a(jm.a.c, dma.a.c, ol.a().a(om.c, $$5).a(om.a, om.a.b))
                     .a(jm.a.a, dma.a.c, ol.a().a(om.c, $$5).a(om.a, om.a.b).a(om.b, om.a.b))
               )
         );
   }

   private alz a(dke $$0, String $$1, or $$2, Function<alz, ot> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ot.a($$0, $$1)), this.c);
   }

   static of e(dke $$0, alz $$1, alz $$2) {
      return oi.a($$0).a(a(dyd.x, $$2, $$1));
   }

   static of e(dke $$0, alz $$1, alz $$2, alz $$3) {
      return oi.a($$0).a(oj.a(dyd.bi).a(dyu.b, ol.a().a(om.c, $$1)).a(dyu.a, ol.a().a(om.c, $$2)).a(dyu.c, ol.a().a(om.c, $$3)));
   }

   public void a(dke $$0) {
      this.b($$0, ov.a);
   }

   public void b(dke $$0, ov.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dke $$0, ot $$1, or $$2) {
      alz $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ob.b i(dke $$0) {
      ov $$1 = this.g.getOrDefault($$0, ov.a.get($$0));
      return new ob.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dke $$0, dke $$1, dke $$2) {
      ot $$3 = ot.v($$0);
      alz $$4 = os.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void j(dke $$0) {
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

   private void a(dke $$0, dke $$1) {
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

   void k(dke $$0) {
      ot $$1 = ot.b($$0);
      alz $$2 = os.ak.a($$0, $$1, this.c);
      alz $$3 = os.al.a($$0, $$1, this.c);
      alz $$4 = os.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(dke $$0) {
      ot $$1 = ot.b($$0);
      alz $$2 = os.ah.a($$0, $$1, this.c);
      alz $$3 = os.ai.a($$0, $$1, this.c);
      alz $$4 = os.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dke $$0, dke $$1) {
      alz $$2 = os.ah.a($$0);
      alz $$3 = os.ai.a($$0);
      alz $$4 = os.aj.a($$0);
      this.a($$1, oq.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dkg.sY);
      alz $$0 = oq.a(dkg.sY);
      alz $$1 = oq.a(dkg.sY, "_partial_tilt");
      alz $$2 = oq.a(dkg.sY, "_full_tilt");
      this.b
         .accept(
            oi.a(dkg.sY)
               .a(b())
               .a(oj.a(dyd.bm).a(dyx.a, ol.a().a(om.c, $$0)).a(dyx.b, ol.a().a(om.c, $$0)).a(dyx.c, ol.a().a(om.c, $$1)).a(dyx.d, ol.a().a(om.c, $$2)))
         );
   }

   private ob.f m(dke $$0) {
      return new ob.f(ot.o($$0));
   }

   private void n(dke $$0) {
      this.c($$0, $$0);
   }

   private void c(dke $$0, dke $$1) {
      this.b.accept(c($$0, oq.a($$1)));
   }

   private void a(dke $$0, ob.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dke $$0, ob.e $$1, ot $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dke $$0, ob.e $$1) {
      ot $$2 = ot.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dke $$0, ob.e $$1, ot $$2) {
      alz $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dke $$0, ob.e $$1, dyp<Integer> $$2, int... $$3) {
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

   private void a(dke $$0, dke $$1, ob.e $$2) {
      this.a($$0, $$2);
      ot $$3 = ot.e($$0);
      alz $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dke $$0, dke $$1) {
      ov $$2 = ov.q.get($$0);
      alz $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alz $$4 = os.aD.a($$1, $$2.b(), this.c);
      this.b.accept(oi.a($$1, ol.a().a(om.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dke $$0, dke $$1) {
      this.a($$0.j());
      ot $$2 = ot.i($$0);
      ot $$3 = ot.a($$0, $$1);
      alz $$4 = os.aV.a($$1, $$3, this.c);
      this.b
         .accept(
            oi.a($$1, ol.a().a(om.c, $$4))
               .a(oj.a(dyd.S).a(jm.e, ol.a()).a(jm.d, ol.a().a(om.b, om.a.d)).a(jm.c, ol.a().a(om.b, om.a.b)).a(jm.f, ol.a().a(om.b, om.a.c)))
         );
      this.b.accept(oi.a($$0).a(oj.a(dyd.aw).a($$2x -> ol.a().a(om.c, os.aU[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dke $$0 = dkg.kX;
      this.a($$0.j());
      alz $$1 = oq.a($$0, "_top");
      alz $$2 = oq.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dke $$0 = dkg.kW;
      this.a($$0.j());
      oj $$1 = oj.a(dpv.d, dyd.af).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> ol.a().a(om.c, oq.a($$0, "_top_stage_" + $$1x));
            case b -> ol.a().a(om.c, oq.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(oi.a($$0).a($$1));
   }

   private void a(dke $$0, dke $$1, dke $$2, dke $$3, dke $$4, dke $$5, dke $$6, dke $$7) {
      this.a($$0, ob.e.b);
      this.a($$1, ob.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dke $$0, ob.e $$1) {
      this.a($$0, "_top");
      alz $$2 = this.a($$0, "_top", $$1.a(), ot::c);
      alz $$3 = this.a($$0, "_bottom", $$1.a(), ot::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dkg.iU, "_front");
      alz $$0 = oq.a(dkg.iU, "_top");
      alz $$1 = this.a(dkg.iU, "_bottom", ob.e.b.a(), ot::c);
      this.f(dkg.iU, $$0, $$1);
   }

   private void k() {
      alz $$0 = this.a(dkg.bE, "_top", os.bp, ot::a);
      alz $$1 = this.a(dkg.bE, "_bottom", os.bp, ot::a);
      this.f(dkg.bE, $$0, $$1);
   }

   private void l() {
      this.c(dkg.ta);
      alz $$0 = oq.a(dkg.ta, "_top");
      alz $$1 = oq.a(dkg.ta, "_bottom");
      this.b.accept(oi.a(dkg.ta).a(b()).a(oj.a(dyd.af).a(dyi.b, ol.a().a(om.c, $$1)).a(dyi.a, ol.a().a(om.c, $$0))));
   }

   private void f(dke $$0, alz $$1, alz $$2) {
      this.b.accept(oi.a($$0).a(oj.a(dyd.af).a(dyi.b, ol.a().a(om.c, $$2)).a(dyi.a, ol.a().a(om.c, $$1))));
   }

   private void o(dke $$0) {
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
                  oj.a(dyd.ah)
                     .a(dyq.a, ol.a().a(om.c, $$3))
                     .a(dyq.b, ol.a().a(om.c, $$3).a(om.b, om.a.b))
                     .a(dyq.c, ol.a().a(om.c, $$5).a(om.b, om.a.b))
                     .a(dyq.d, ol.a().a(om.c, $$6).a(om.b, om.a.b))
                     .a(dyq.e, ol.a().a(om.c, $$5))
                     .a(dyq.f, ol.a().a(om.c, $$6))
                     .a(dyq.g, ol.a().a(om.c, $$4))
                     .a(dyq.h, ol.a().a(om.c, $$4).a(om.b, om.a.b))
                     .a(dyq.i, ol.a().a(om.c, $$4).a(om.b, om.a.c))
                     .a(dyq.j, ol.a().a(om.c, $$4).a(om.b, om.a.d))
               )
         );
   }

   private void p(dke $$0) {
      alz $$1 = this.a($$0, "", os.as, ot::e);
      alz $$2 = this.a($$0, "", os.au, ot::e);
      alz $$3 = this.a($$0, "", os.av, ot::e);
      alz $$4 = this.a($$0, "_on", os.as, ot::e);
      alz $$5 = this.a($$0, "_on", os.au, ot::e);
      alz $$6 = this.a($$0, "_on", os.av, ot::e);
      oj $$7 = oj.a(dyd.x, dyd.ai).a(($$6x, $$7x) -> {
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

   private ob.a a(alz $$0, dke $$1) {
      return new ob.a($$0, $$1);
   }

   private ob.a f(dke $$0, dke $$1) {
      return new ob.a(oq.a($$0), $$1);
   }

   private void a(dke $$0, cxg $$1) {
      alz $$2 = os.aa.a($$0, ot.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dke $$0, alz $$1) {
      alz $$2 = os.aa.a($$0, ot.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dke $$0, dke $$1) {
      this.a($$0);
      alz $$2 = ov.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void q(dke $$0) {
      this.a($$0.j());
      alz $$1 = ov.l.create($$0, this.c);
      alz $$2 = ov.m.create($$0, this.c);
      alz $$3 = ov.n.create($$0, this.c);
      alz $$4 = ov.o.create($$0, this.c);
      this.b
         .accept(
            oh.a($$0)
               .a(og.a().a(dyd.T, 1, 2, 3, 4).a(dyd.S, jm.c), ol.a().a(om.c, $$1))
               .a(og.a().a(dyd.T, 1, 2, 3, 4).a(dyd.S, jm.f), ol.a().a(om.c, $$1).a(om.b, om.a.b))
               .a(og.a().a(dyd.T, 1, 2, 3, 4).a(dyd.S, jm.d), ol.a().a(om.c, $$1).a(om.b, om.a.c))
               .a(og.a().a(dyd.T, 1, 2, 3, 4).a(dyd.S, jm.e), ol.a().a(om.c, $$1).a(om.b, om.a.d))
               .a(og.a().a(dyd.T, 2, 3, 4).a(dyd.S, jm.c), ol.a().a(om.c, $$2))
               .a(og.a().a(dyd.T, 2, 3, 4).a(dyd.S, jm.f), ol.a().a(om.c, $$2).a(om.b, om.a.b))
               .a(og.a().a(dyd.T, 2, 3, 4).a(dyd.S, jm.d), ol.a().a(om.c, $$2).a(om.b, om.a.c))
               .a(og.a().a(dyd.T, 2, 3, 4).a(dyd.S, jm.e), ol.a().a(om.c, $$2).a(om.b, om.a.d))
               .a(og.a().a(dyd.T, 3, 4).a(dyd.S, jm.c), ol.a().a(om.c, $$3))
               .a(og.a().a(dyd.T, 3, 4).a(dyd.S, jm.f), ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(og.a().a(dyd.T, 3, 4).a(dyd.S, jm.d), ol.a().a(om.c, $$3).a(om.b, om.a.c))
               .a(og.a().a(dyd.T, 3, 4).a(dyd.S, jm.e), ol.a().a(om.c, $$3).a(om.b, om.a.d))
               .a(og.a().a(dyd.T, 4).a(dyd.S, jm.c), ol.a().a(om.c, $$4))
               .a(og.a().a(dyd.T, 4).a(dyd.S, jm.f), ol.a().a(om.c, $$4).a(om.b, om.a.b))
               .a(og.a().a(dyd.T, 4).a(dyd.S, jm.d), ol.a().a(om.c, $$4).a(om.b, om.a.c))
               .a(og.a().a(dyd.T, 4).a(dyd.S, jm.e), ol.a().a(om.c, $$4).a(om.b, om.a.d))
         );
   }

   private void a(ov.a $$0, dke... $$1) {
      for (dke $$2 : $$1) {
         alz $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ov.a $$0, dke... $$1) {
      for (dke $$2 : $$1) {
         alz $$3 = $$0.create($$2, this.c);
         this.b.accept(oi.a($$2, ol.a().a(om.c, $$3)).a(c()));
      }
   }

   private void h(dke $$0, dke $$1) {
      this.a($$0);
      ot $$2 = ot.b($$0, $$1);
      alz $$3 = os.aJ.a($$1, $$2, this.c);
      alz $$4 = os.aK.a($$1, $$2, this.c);
      alz $$5 = os.aL.a($$1, $$2, this.c);
      alz $$6 = os.aH.a($$1, $$2, this.c);
      alz $$7 = os.aI.a($$1, $$2, this.c);
      cxg $$8 = $$1.j();
      os.bC.a(oq.a($$8), ot.G($$0), this.c);
      this.b
         .accept(
            oh.a($$1)
               .a(ol.a().a(om.c, $$3))
               .a(og.a().a(dyd.M, true), ol.a().a(om.c, $$4))
               .a(og.a().a(dyd.N, true), ol.a().a(om.c, $$4).a(om.b, om.a.b))
               .a(og.a().a(dyd.O, true), ol.a().a(om.c, $$5))
               .a(og.a().a(dyd.P, true), ol.a().a(om.c, $$5).a(om.b, om.a.b))
               .a(og.a().a(dyd.M, false), ol.a().a(om.c, $$6))
               .a(og.a().a(dyd.N, false), ol.a().a(om.c, $$7))
               .a(og.a().a(dyd.O, false), ol.a().a(om.c, $$7).a(om.b, om.a.b))
               .a(og.a().a(dyd.P, false), ol.a().a(om.c, $$6).a(om.b, om.a.d))
         );
   }

   private void r(dke $$0) {
      ot $$1 = ot.A($$0);
      alz $$2 = os.aM.a($$0, $$1, this.c);
      alz $$3 = this.a($$0, "_conditional", os.aM, $$1x -> $$1.c(ou.i, $$1x));
      this.b.accept(oi.a($$0).a(a(dyd.c, $$3, $$2)).a(e()));
   }

   private void s(dke $$0) {
      alz $$1 = ov.s.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<ol> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> ol.a().a(om.c, oq.a(dkg.nu, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dkg.nu);
      this.b
         .accept(
            oh.a(dkg.nu)
               .a(og.a().a(dyd.ar, 0), this.a(0))
               .a(og.a().a(dyd.ar, 1), this.a(1))
               .a(og.a().a(dyd.bl, dxz.b), ol.a().a(om.c, oq.a(dkg.nu, "_small_leaves")))
               .a(og.a().a(dyd.bl, dxz.c), ol.a().a(om.c, oq.a(dkg.nu, "_large_leaves")))
         );
   }

   private oj n() {
      return oj.a(dyd.Q)
         .a(jm.a, ol.a().a(om.a, om.a.c))
         .a(jm.b, ol.a())
         .a(jm.c, ol.a().a(om.a, om.a.b))
         .a(jm.d, ol.a().a(om.a, om.a.b).a(om.b, om.a.c))
         .a(jm.e, ol.a().a(om.a, om.a.b).a(om.b, om.a.d))
         .a(jm.f, ol.a().a(om.a, om.a.b).a(om.b, om.a.b));
   }

   private void o() {
      alz $$0 = ot.a(dkg.op, "_top_open");
      this.b
         .accept(
            oi.a(dkg.op)
               .a(this.n())
               .a(
                  oj.a(dyd.v)
                     .a(false, ol.a().a(om.c, ov.f.create(dkg.op, this.c)))
                     .a(true, ol.a().a(om.c, ov.f.get(dkg.op).a($$1 -> $$1.a(ou.f, $$0)).a(dkg.op, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> oj a(dyp<T> $$0, T $$1, alz $$2, alz $$3) {
      ol $$4 = ol.a().a(om.c, $$2);
      ol $$5 = ol.a().a(om.c, $$3);
      return oj.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dke $$0, Function<dke, ot> $$1) {
      ot $$2 = $$1.apply($$0).b(ou.i, ou.c);
      ot $$3 = $$2.c(ou.g, ot.a($$0, "_front_honey"));
      alz $$4 = os.q.a($$0, "_empty", $$2, this.c);
      alz $$5 = os.q.a($$0, "_honey", $$3, this.c);
      this.c($$0);
      os.q.a(oq.a($$0.j(), "_empty"), $$2, this.c);
      os.q.a(oq.a($$0.j(), "_honey"), $$3, this.c);
      this.b.accept(oi.a($$0).a(b()).a(a(dyd.aO, 5, $$5, $$4)));
   }

   private void a(dke $$0, dyp<Integer> $$1, int... $$2) {
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
      alz $$0 = oq.a(dkg.oy, "_floor");
      alz $$1 = oq.a(dkg.oy, "_ceiling");
      alz $$2 = oq.a(dkg.oy, "_wall");
      alz $$3 = oq.a(dkg.oy, "_between_walls");
      this.a(cxo.xi);
      this.b
         .accept(
            oi.a(dkg.oy)
               .a(
                  oj.a(dyd.S, dyd.W)
                     .a(jm.c, dyb.a, ol.a().a(om.c, $$0))
                     .a(jm.d, dyb.a, ol.a().a(om.c, $$0).a(om.b, om.a.c))
                     .a(jm.f, dyb.a, ol.a().a(om.c, $$0).a(om.b, om.a.b))
                     .a(jm.e, dyb.a, ol.a().a(om.c, $$0).a(om.b, om.a.d))
                     .a(jm.c, dyb.b, ol.a().a(om.c, $$1))
                     .a(jm.d, dyb.b, ol.a().a(om.c, $$1).a(om.b, om.a.c))
                     .a(jm.f, dyb.b, ol.a().a(om.c, $$1).a(om.b, om.a.b))
                     .a(jm.e, dyb.b, ol.a().a(om.c, $$1).a(om.b, om.a.d))
                     .a(jm.c, dyb.c, ol.a().a(om.c, $$2).a(om.b, om.a.d))
                     .a(jm.d, dyb.c, ol.a().a(om.c, $$2).a(om.b, om.a.b))
                     .a(jm.f, dyb.c, ol.a().a(om.c, $$2))
                     .a(jm.e, dyb.c, ol.a().a(om.c, $$2).a(om.b, om.a.c))
                     .a(jm.d, dyb.d, ol.a().a(om.c, $$3).a(om.b, om.a.b))
                     .a(jm.c, dyb.d, ol.a().a(om.c, $$3).a(om.b, om.a.d))
                     .a(jm.f, dyb.d, ol.a().a(om.c, $$3))
                     .a(jm.e, dyb.d, ol.a().a(om.c, $$3).a(om.b, om.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            oi.a(dkg.ou, ol.a().a(om.c, oq.a(dkg.ou)))
               .a(
                  oj.a(dyd.V, dyd.S)
                     .a(dxy.a, jm.c, ol.a())
                     .a(dxy.a, jm.f, ol.a().a(om.b, om.a.b))
                     .a(dxy.a, jm.d, ol.a().a(om.b, om.a.c))
                     .a(dxy.a, jm.e, ol.a().a(om.b, om.a.d))
                     .a(dxy.b, jm.c, ol.a().a(om.a, om.a.b))
                     .a(dxy.b, jm.f, ol.a().a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(dxy.b, jm.d, ol.a().a(om.a, om.a.b).a(om.b, om.a.c))
                     .a(dxy.b, jm.e, ol.a().a(om.a, om.a.b).a(om.b, om.a.d))
                     .a(dxy.c, jm.d, ol.a().a(om.a, om.a.c))
                     .a(dxy.c, jm.e, ol.a().a(om.a, om.a.c).a(om.b, om.a.b))
                     .a(dxy.c, jm.c, ol.a().a(om.a, om.a.c).a(om.b, om.a.c))
                     .a(dxy.c, jm.f, ol.a().a(om.a, om.a.c).a(om.b, om.a.d))
               )
         );
   }

   private void d(dke $$0, ov.a $$1) {
      alz $$2 = $$1.create($$0, this.c);
      alz $$3 = ot.a($$0, "_front_on");
      alz $$4 = $$1.get($$0).a($$1x -> $$1x.a(ou.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(oi.a($$0).a(a(dyd.r, $$4, $$2)).a(b()));
   }

   private void a(dke... $$0) {
      alz $$1 = oq.a("campfire_off");

      for (dke $$2 : $$0) {
         alz $$3 = os.bd.a($$2, ot.F($$2), this.c);
         this.a($$2.j());
         this.b.accept(oi.a($$2).a(a(dyd.r, $$3, $$1)).a(c()));
      }
   }

   private void t(dke $$0) {
      alz $$1 = os.by.a($$0, ot.m($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void u(dke $$0) {
      alz $$1;
      if ($$0 == dkg.tE) {
         $$1 = os.bA.a($$0, ot.n($$0), this.c);
      } else {
         $$1 = os.bz.a($$0, ot.n($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ot $$0 = ot.a(ot.H(dkg.cs), ot.H(dkg.n));
      alz $$1 = os.j.a(dkg.cs, $$0, this.c);
      this.b.accept(c(dkg.cs, $$1));
   }

   private void s() {
      this.a(cxo.lV);
      this.b
         .accept(
            oh.a(dkg.cE)
               .a(
                  og.b(
                     og.a().a(dyd.ac, dyr.c).a(dyd.ab, dyr.c).a(dyd.ad, dyr.c).a(dyd.ae, dyr.c),
                     og.a().a(dyd.ac, dyr.b, dyr.a).a(dyd.ab, dyr.b, dyr.a),
                     og.a().a(dyd.ab, dyr.b, dyr.a).a(dyd.ad, dyr.b, dyr.a),
                     og.a().a(dyd.ad, dyr.b, dyr.a).a(dyd.ae, dyr.b, dyr.a),
                     og.a().a(dyd.ae, dyr.b, dyr.a).a(dyd.ac, dyr.b, dyr.a)
                  ),
                  ol.a().a(om.c, oq.a("redstone_dust_dot"))
               )
               .a(og.a().a(dyd.ac, dyr.b, dyr.a), ol.a().a(om.c, oq.a("redstone_dust_side0")))
               .a(og.a().a(dyd.ad, dyr.b, dyr.a), ol.a().a(om.c, oq.a("redstone_dust_side_alt0")))
               .a(og.a().a(dyd.ab, dyr.b, dyr.a), ol.a().a(om.c, oq.a("redstone_dust_side_alt1")).a(om.b, om.a.d))
               .a(og.a().a(dyd.ae, dyr.b, dyr.a), ol.a().a(om.c, oq.a("redstone_dust_side1")).a(om.b, om.a.d))
               .a(og.a().a(dyd.ac, dyr.a), ol.a().a(om.c, oq.a("redstone_dust_up")))
               .a(og.a().a(dyd.ab, dyr.a), ol.a().a(om.c, oq.a("redstone_dust_up")).a(om.b, om.a.b))
               .a(og.a().a(dyd.ad, dyr.a), ol.a().a(om.c, oq.a("redstone_dust_up")).a(om.b, om.a.c))
               .a(og.a().a(dyd.ae, dyr.a), ol.a().a(om.c, oq.a("redstone_dust_up")).a(om.b, om.a.d))
         );
   }

   private void t() {
      this.a(cxo.lZ);
      this.b
         .accept(
            oi.a(dkg.ho)
               .a(c())
               .a(
                  oj.a(dyd.be, dyd.x)
                     .a(dyg.a, false, ol.a().a(om.c, oq.a(dkg.ho)))
                     .a(dyg.a, true, ol.a().a(om.c, oq.a(dkg.ho, "_on")))
                     .a(dyg.b, false, ol.a().a(om.c, oq.a(dkg.ho, "_subtract")))
                     .a(dyg.b, true, ol.a().a(om.c, oq.a(dkg.ho, "_on_subtract")))
               )
         );
   }

   private void u() {
      ot $$0 = ot.a(dkg.kj);
      ot $$1 = ot.a(ot.a(dkg.jW, "_side"), $$0.a(ou.f));
      alz $$2 = os.ab.a(dkg.jW, $$1, this.c);
      alz $$3 = os.ac.a(dkg.jW, $$1, this.c);
      alz $$4 = os.j.b(dkg.jW, "_double", $$1, this.c);
      this.b.accept(e(dkg.jW, $$2, $$3, $$4));
      this.b.accept(c(dkg.kj, os.c.a(dkg.kj, $$0, this.c)));
   }

   private void v() {
      this.a(cxo.te);
      this.b
         .accept(
            oh.a(dkg.fG)
               .a(ol.a().a(om.c, ot.H(dkg.fG)))
               .a(og.a().a(dyd.k, true), ol.a().a(om.c, ot.a(dkg.fG, "_bottle0")))
               .a(og.a().a(dyd.l, true), ol.a().a(om.c, ot.a(dkg.fG, "_bottle1")))
               .a(og.a().a(dyd.m, true), ol.a().a(om.c, ot.a(dkg.fG, "_bottle2")))
               .a(og.a().a(dyd.k, false), ol.a().a(om.c, ot.a(dkg.fG, "_empty0")))
               .a(og.a().a(dyd.l, false), ol.a().a(om.c, ot.a(dkg.fG, "_empty1")))
               .a(og.a().a(dyd.m, false), ol.a().a(om.c, ot.a(dkg.fG, "_empty2")))
         );
   }

   private void v(dke $$0) {
      alz $$1 = os.bu.a($$0, ot.b($$0), this.c);
      alz $$2 = oq.a("mushroom_block_inside");
      this.b
         .accept(
            oh.a($$0)
               .a(og.a().a(dyd.M, true), ol.a().a(om.c, $$1))
               .a(og.a().a(dyd.N, true), ol.a().a(om.c, $$1).a(om.b, om.a.b).a(om.d, true))
               .a(og.a().a(dyd.O, true), ol.a().a(om.c, $$1).a(om.b, om.a.c).a(om.d, true))
               .a(og.a().a(dyd.P, true), ol.a().a(om.c, $$1).a(om.b, om.a.d).a(om.d, true))
               .a(og.a().a(dyd.K, true), ol.a().a(om.c, $$1).a(om.a, om.a.d).a(om.d, true))
               .a(og.a().a(dyd.L, true), ol.a().a(om.c, $$1).a(om.a, om.a.b).a(om.d, true))
               .a(og.a().a(dyd.M, false), ol.a().a(om.c, $$2))
               .a(og.a().a(dyd.N, false), ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, false))
               .a(og.a().a(dyd.O, false), ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, false))
               .a(og.a().a(dyd.P, false), ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, false))
               .a(og.a().a(dyd.K, false), ol.a().a(om.c, $$2).a(om.a, om.a.d).a(om.d, false))
               .a(og.a().a(dyd.L, false), ol.a().a(om.c, $$2).a(om.a, om.a.b).a(om.d, false))
         );
      this.a($$0, ov.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cxo.sp);
      this.b
         .accept(
            oi.a(dkg.et)
               .a(
                  oj.a(dyd.az)
                     .a(0, ol.a().a(om.c, oq.a(dkg.et)))
                     .a(1, ol.a().a(om.c, oq.a(dkg.et, "_slice1")))
                     .a(2, ol.a().a(om.c, oq.a(dkg.et, "_slice2")))
                     .a(3, ol.a().a(om.c, oq.a(dkg.et, "_slice3")))
                     .a(4, ol.a().a(om.c, oq.a(dkg.et, "_slice4")))
                     .a(5, ol.a().a(om.c, oq.a(dkg.et, "_slice5")))
                     .a(6, ol.a().a(om.c, oq.a(dkg.et, "_slice6")))
               )
         );
   }

   private void x() {
      ot $$0 = new ot()
         .a(ou.c, ot.a(dkg.os, "_side3"))
         .a(ou.o, ot.H(dkg.t))
         .a(ou.n, ot.a(dkg.os, "_top"))
         .a(ou.j, ot.a(dkg.os, "_side3"))
         .a(ou.l, ot.a(dkg.os, "_side3"))
         .a(ou.k, ot.a(dkg.os, "_side1"))
         .a(ou.m, ot.a(dkg.os, "_side2"));
      this.b.accept(c(dkg.os, os.a.a(dkg.os, $$0, this.c)));
   }

   private void y() {
      ot $$0 = new ot()
         .a(ou.c, ot.a(dkg.ow, "_front"))
         .a(ou.o, ot.a(dkg.ow, "_bottom"))
         .a(ou.n, ot.a(dkg.ow, "_top"))
         .a(ou.j, ot.a(dkg.ow, "_front"))
         .a(ou.k, ot.a(dkg.ow, "_front"))
         .a(ou.l, ot.a(dkg.ow, "_side"))
         .a(ou.m, ot.a(dkg.ow, "_side"));
      this.b.accept(c(dkg.ow, os.a.a(dkg.ow, $$0, this.c)));
   }

   private void a(dke $$0, dke $$1, BiFunction<dke, dke, ot> $$2) {
      ot $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, os.a.a($$0, $$3, this.c)));
   }

   public void b(dke $$0) {
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
      ot $$0 = ot.l(dkg.fn);
      this.b.accept(c(dkg.fn, oq.a(dkg.fn)));
      this.a(dkg.er, $$0);
      this.a(dkg.es, $$0);
   }

   private void a(dke $$0, ot $$1) {
      alz $$2 = os.p.a($$0, $$1.c(ou.g, ot.H($$0)), this.c);
      this.b.accept(oi.a($$0, ol.a().a(om.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cxo.tf);
      this.n(dkg.fH);
      this.b.accept(c(dkg.fJ, os.bx.a(dkg.fJ, ot.j(ot.a(dkg.K, "_still")), this.c)));
      this.b
         .accept(
            oi.a(dkg.fI)
               .a(
                  oj.a(dop.g)
                     .a(1, ol.a().a(om.c, os.bv.a(dkg.fI, "_level1", ot.j(ot.a(dkg.J, "_still")), this.c)))
                     .a(2, ol.a().a(om.c, os.bw.a(dkg.fI, "_level2", ot.j(ot.a(dkg.J, "_still")), this.c)))
                     .a(3, ol.a().a(om.c, os.bx.a(dkg.fI, "_full", ot.j(ot.a(dkg.J, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            oi.a(dkg.fK)
               .a(
                  oj.a(dop.g)
                     .a(1, ol.a().a(om.c, os.bv.a(dkg.fK, "_level1", ot.j(ot.H(dkg.rk)), this.c)))
                     .a(2, ol.a().a(om.c, os.bw.a(dkg.fK, "_level2", ot.j(ot.H(dkg.rk)), this.c)))
                     .a(3, ol.a().a(om.c, os.bx.a(dkg.fK, "_full", ot.j(ot.H(dkg.rk)), this.c)))
               )
         );
   }

   private void B() {
      ot $$0 = ot.b(dkg.kQ);
      alz $$1 = os.aF.a(dkg.kQ, $$0, this.c);
      alz $$2 = this.a(dkg.kQ, "_dead", os.aF, $$1x -> $$0.c(ou.b, $$1x));
      this.b.accept(oi.a(dkg.kQ).a(a(dyd.av, 5, $$2, $$1)));
   }

   private void C() {
      alz $$0 = oq.a(dkg.tL);
      alz $$1 = oq.a(dkg.tL, "_triggered");
      alz $$2 = oq.a(dkg.tL, "_crafting");
      alz $$3 = oq.a(dkg.tL, "_crafting_triggered");
      this.b
         .accept(
            oi.a(dkg.tL)
               .a(oj.a(dyd.U).a($$0x -> this.a($$0x, ol.a())))
               .a(
                  oj.a(dyd.B, dly.b)
                     .a(false, false, ol.a().a(om.c, $$0))
                     .a(true, true, ol.a().a(om.c, $$3))
                     .a(true, false, ol.a().a(om.c, $$1))
                     .a(false, true, ol.a().a(om.c, $$2))
               )
         );
   }

   private void w(dke $$0) {
      ot $$1 = new ot().a(ou.f, ot.a(dkg.cL, "_top")).a(ou.i, ot.a(dkg.cL, "_side")).a(ou.g, ot.a($$0, "_front"));
      ot $$2 = new ot().a(ou.i, ot.a(dkg.cL, "_top")).a(ou.g, ot.a($$0, "_front_vertical"));
      alz $$3 = os.p.a($$0, $$1, this.c);
      alz $$4 = os.r.a($$0, $$2, this.c);
      this.b
         .accept(
            oi.a($$0)
               .a(
                  oj.a(dyd.Q)
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
      alz $$0 = oq.a(dkg.fM);
      alz $$1 = oq.a(dkg.fM, "_filled");
      this.b.accept(oi.a(dkg.fM).a(oj.a(dyd.h).a(false, ol.a().a(om.c, $$0)).a(true, ol.a().a(om.c, $$1))).a(c()));
   }

   private void E() {
      alz $$0 = oq.a(dkg.kP, "_side");
      alz $$1 = oq.a(dkg.kP, "_noside");
      alz $$2 = oq.a(dkg.kP, "_noside1");
      alz $$3 = oq.a(dkg.kP, "_noside2");
      alz $$4 = oq.a(dkg.kP, "_noside3");
      this.b
         .accept(
            oh.a(dkg.kP)
               .a(og.a().a(dyd.M, true), ol.a().a(om.c, $$0))
               .a(og.a().a(dyd.N, true), ol.a().a(om.c, $$0).a(om.b, om.a.b).a(om.d, true))
               .a(og.a().a(dyd.O, true), ol.a().a(om.c, $$0).a(om.b, om.a.c).a(om.d, true))
               .a(og.a().a(dyd.P, true), ol.a().a(om.c, $$0).a(om.b, om.a.d).a(om.d, true))
               .a(og.a().a(dyd.K, true), ol.a().a(om.c, $$0).a(om.a, om.a.d).a(om.d, true))
               .a(og.a().a(dyd.L, true), ol.a().a(om.c, $$0).a(om.a, om.a.b).a(om.d, true))
               .a(og.a().a(dyd.M, false), ol.a().a(om.c, $$1).a(om.e, 2), ol.a().a(om.c, $$2), ol.a().a(om.c, $$3), ol.a().a(om.c, $$4))
               .a(
                  og.a().a(dyd.N, false),
                  ol.a().a(om.c, $$2).a(om.b, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.b, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$4).a(om.b, om.a.b).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.b, om.a.b).a(om.d, true)
               )
               .a(
                  og.a().a(dyd.O, false),
                  ol.a().a(om.c, $$3).a(om.b, om.a.c).a(om.d, true),
                  ol.a().a(om.c, $$4).a(om.b, om.a.c).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.b, om.a.c).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.b, om.a.c).a(om.d, true)
               )
               .a(
                  og.a().a(dyd.P, false),
                  ol.a().a(om.c, $$4).a(om.b, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.b, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.b, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.b, om.a.d).a(om.d, true)
               )
               .a(
                  og.a().a(dyd.K, false),
                  ol.a().a(om.c, $$1).a(om.e, 2).a(om.a, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$4).a(om.a, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$2).a(om.a, om.a.d).a(om.d, true),
                  ol.a().a(om.c, $$3).a(om.a, om.a.d).a(om.d, true)
               )
               .a(
                  og.a().a(dyd.L, false),
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
            oh.a(dkg.px)
               .a(ol.a().a(om.c, ot.H(dkg.px)))
               .a(og.a().a(dyd.aM, 1), ol.a().a(om.c, ot.a(dkg.px, "_contents1")))
               .a(og.a().a(dyd.aM, 2), ol.a().a(om.c, ot.a(dkg.px, "_contents2")))
               .a(og.a().a(dyd.aM, 3), ol.a().a(om.c, ot.a(dkg.px, "_contents3")))
               .a(og.a().a(dyd.aM, 4), ol.a().a(om.c, ot.a(dkg.px, "_contents4")))
               .a(og.a().a(dyd.aM, 5), ol.a().a(om.c, ot.a(dkg.px, "_contents5")))
               .a(og.a().a(dyd.aM, 6), ol.a().a(om.c, ot.a(dkg.px, "_contents6")))
               .a(og.a().a(dyd.aM, 7), ol.a().a(om.c, ot.a(dkg.px, "_contents7")))
               .a(og.a().a(dyd.aM, 8), ol.a().a(om.c, ot.a(dkg.px, "_contents_ready")))
         );
   }

   private void x(dke $$0) {
      alz $$1 = os.c.a($$0, ot.a($$0), this.c);
      alz $$2 = this.a($$0, "_powered", os.c, ot::b);
      alz $$3 = this.a($$0, "_lit", os.c, ot::b);
      alz $$4 = this.a($$0, "_lit_powered", os.c, ot::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private of a(dke $$0, alz $$1, alz $$2, alz $$3, alz $$4) {
      return oi.a($$0).a(oj.a(dyd.r, dyd.x).a(($$4x, $$5) -> $$4x ? ol.a().a(om.c, $$5 ? $$4 : $$2) : ol.a().a(om.c, $$5 ? $$3 : $$1)));
   }

   private void i(dke $$0, dke $$1) {
      alz $$2 = oq.a($$0);
      alz $$3 = oq.a($$0, "_powered");
      alz $$4 = oq.a($$0, "_lit");
      alz $$5 = oq.a($$0, "_lit_powered");
      this.a($$1, oq.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void y(dke $$0) {
      this.c($$0);
      this.b.accept(oi.a($$0, ol.a().a(om.c, os.ao.a($$0, ot.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.y(dkg.qT);
      this.y(dkg.qS);
      this.y(dkg.qR);
      this.y(dkg.qQ);
   }

   private void H() {
      this.c(dkg.sO);
      oj.b<jm, dyj> $$0 = oj.a(dyd.bn, dyd.bo);

      for (dyj $$1 : dyj.values()) {
         $$0.a(jm.b, $$1, this.a(jm.b, $$1));
      }

      for (dyj $$2 : dyj.values()) {
         $$0.a(jm.a, $$2, this.a(jm.a, $$2));
      }

      this.b.accept(oi.a(dkg.sO).a($$0));
   }

   private ol a(jm $$0, dyj $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ot $$3 = ot.c(ot.a(dkg.sO, $$2));
      return ol.a().a(om.c, os.an.a(dkg.sO, $$2, $$3, this.c));
   }

   private void z(dke $$0) {
      ot $$1 = new ot().a(ou.e, ot.H(dkg.ei)).a(ou.f, ot.H($$0)).a(ou.i, ot.a($$0, "_side"));
      this.b.accept(c($$0, os.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alz $$0 = ot.a(dkg.hp, "_side");
      ot $$1 = new ot().a(ou.f, ot.a(dkg.hp, "_top")).a(ou.i, $$0);
      ot $$2 = new ot().a(ou.f, ot.a(dkg.hp, "_inverted_top")).a(ou.i, $$0);
      this.b
         .accept(
            oi.a(dkg.hp)
               .a(oj.a(dyd.p).a(false, ol.a().a(om.c, os.aG.a(dkg.hp, $$1, this.c))).a(true, ol.a().a(om.c, os.aG.a(oq.a(dkg.hp, "_inverted"), $$2, this.c))))
         );
   }

   private void A(dke $$0) {
      this.b.accept(oi.a($$0, ol.a().a(om.c, oq.a($$0))).a(this.n()));
   }

   private void J() {
      dke $$0 = dkg.sN;
      alz $$1 = oq.a($$0, "_on");
      alz $$2 = oq.a($$0);
      this.b.accept(oi.a($$0, ol.a().a(om.c, oq.a($$0))).a(this.n()).a(a(dyd.x, $$1, $$2)));
   }

   private void K() {
      ot $$0 = new ot().a(ou.B, ot.H(dkg.j)).a(ou.f, ot.H(dkg.cK));
      ot $$1 = new ot().a(ou.B, ot.H(dkg.j)).a(ou.f, ot.a(dkg.cK, "_moist"));
      alz $$2 = os.aX.a(dkg.cK, $$0, this.c);
      alz $$3 = os.aX.a(ot.a(dkg.cK, "_moist"), $$1, this.c);
      this.b.accept(oi.a(dkg.cK).a(a(dyd.aR, 7, $$3, $$2)));
   }

   private List<alz> B(dke $$0) {
      alz $$1 = os.aY.a(oq.a($$0, "_floor0"), ot.w($$0), this.c);
      alz $$2 = os.aY.a(oq.a($$0, "_floor1"), ot.x($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alz> C(dke $$0) {
      alz $$1 = os.aZ.a(oq.a($$0, "_side0"), ot.w($$0), this.c);
      alz $$2 = os.aZ.a(oq.a($$0, "_side1"), ot.x($$0), this.c);
      alz $$3 = os.ba.a(oq.a($$0, "_side_alt0"), ot.w($$0), this.c);
      alz $$4 = os.ba.a(oq.a($$0, "_side_alt1"), ot.x($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alz> D(dke $$0) {
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
      og $$0 = og.a().a(dyd.M, false).a(dyd.N, false).a(dyd.O, false).a(dyd.P, false).a(dyd.K, false);
      List<alz> $$1 = this.B(dkg.cy);
      List<alz> $$2 = this.C(dkg.cy);
      List<alz> $$3 = this.D(dkg.cy);
      this.b
         .accept(
            oh.a(dkg.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(og.b(og.a().a(dyd.M, true), $$0), a($$2, $$0x -> $$0x))
               .a(og.b(og.a().a(dyd.N, true), $$0), a($$2, $$0x -> $$0x.a(om.b, om.a.b)))
               .a(og.b(og.a().a(dyd.O, true), $$0), a($$2, $$0x -> $$0x.a(om.b, om.a.c)))
               .a(og.b(og.a().a(dyd.P, true), $$0), a($$2, $$0x -> $$0x.a(om.b, om.a.d)))
               .a(og.a().a(dyd.K, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alz> $$0 = this.B(dkg.cz);
      List<alz> $$1 = this.C(dkg.cz);
      this.b
         .accept(
            oh.a(dkg.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(om.b, om.a.b)))
               .a(a($$1, $$0x -> $$0x.a(om.b, om.a.c)))
               .a(a($$1, $$0x -> $$0x.a(om.b, om.a.d)))
         );
   }

   private void E(dke $$0) {
      alz $$1 = ov.u.create($$0, this.c);
      alz $$2 = ov.v.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(oi.a($$0).a(a(dyd.j, $$2, $$1)));
   }

   private void N() {
      ot $$0 = ot.a(ot.a(dkg.ah, "_side"), ot.a(dkg.ah, "_top"));
      alz $$1 = os.j.a(dkg.ah, $$0, this.c);
      this.b.accept(d(dkg.ah, $$1));
   }

   private void O() {
      this.a(cxo.af);
      dke $$0 = dkg.H;
      oj.b<Boolean, Integer> $$1 = oj.a(dpb.d, dpb.b);
      alz $$2 = oq.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alz $$4 = oq.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, ol.a().a(om.c, $$4));
         $$1.a(false, $$3, ol.a().a(om.c, $$2));
      }

      this.b.accept(oi.a(dkg.H).a($$1));
   }

   private void P() {
      this.b
         .accept(
            oi.a(dkg.ld)
               .a(
                  oj.a(dyd.at)
                     .a(0, ol.a().a(om.c, this.a(dkg.ld, "_0", os.c, ot::b)))
                     .a(1, ol.a().a(om.c, this.a(dkg.ld, "_1", os.c, ot::b)))
                     .a(2, ol.a().a(om.c, this.a(dkg.ld, "_2", os.c, ot::b)))
                     .a(3, ol.a().a(om.c, this.a(dkg.ld, "_3", os.c, ot::b)))
               )
         );
   }

   private void Q() {
      alz $$0 = ot.H(dkg.j);
      ot $$1 = new ot().a(ou.e, $$0).b(ou.e, ou.c).a(ou.f, ot.a(dkg.i, "_top")).a(ou.i, ot.a(dkg.i, "_snow"));
      ol $$2 = ol.a().a(om.c, os.n.a(dkg.i, "_snow", $$1, this.c));
      this.a(dkg.i, oq.a(dkg.i), $$2);
      alz $$3 = ov.f.get(dkg.fz).a($$1x -> $$1x.a(ou.e, $$0)).a(dkg.fz, this.c);
      this.a(dkg.fz, $$3, $$2);
      alz $$4 = ov.f.get(dkg.l).a($$1x -> $$1x.a(ou.e, $$0)).a(dkg.l, this.c);
      this.a(dkg.l, $$4, $$2);
   }

   private void a(dke $$0, alz $$1, ol $$2) {
      List<ol> $$3 = Arrays.asList(a($$1));
      this.b.accept(oi.a($$0).a(oj.a(dyd.A).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cxo.rV);
      this.b
         .accept(
            oi.a(dkg.fQ)
               .a(
                  oj.a(dyd.as)
                     .a(0, ol.a().a(om.c, oq.a(dkg.fQ, "_stage0")))
                     .a(1, ol.a().a(om.c, oq.a(dkg.fQ, "_stage1")))
                     .a(2, ol.a().a(om.c, oq.a(dkg.fQ, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dkg.kZ, oq.a(dkg.kZ)));
   }

   private void j(dke $$0, dke $$1) {
      ot $$2 = ot.b($$1);
      alz $$3 = os.Y.a($$0, $$2, this.c);
      alz $$4 = os.Z.a($$0, $$2, this.c);
      this.b.accept(oi.a($$0).a(a(dyd.aU, 1, $$4, $$3)));
   }

   private void T() {
      alz $$0 = oq.a(dkg.hs);
      alz $$1 = oq.a(dkg.hs, "_side");
      this.a(cxo.mf);
      this.b
         .accept(
            oi.a(dkg.hs)
               .a(
                  oj.a(dyd.R)
                     .a(jm.a, ol.a().a(om.c, $$0))
                     .a(jm.c, ol.a().a(om.c, $$1))
                     .a(jm.f, ol.a().a(om.c, $$1).a(om.b, om.a.b))
                     .a(jm.d, ol.a().a(om.c, $$1).a(om.b, om.a.c))
                     .a(jm.e, ol.a().a(om.c, $$1).a(om.b, om.a.d))
               )
         );
   }

   private void k(dke $$0, dke $$1) {
      alz $$2 = oq.a($$0);
      this.b.accept(oi.a($$1, ol.a().a(om.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alz $$0 = oq.a(dkg.fk, "_post_ends");
      alz $$1 = oq.a(dkg.fk, "_post");
      alz $$2 = oq.a(dkg.fk, "_cap");
      alz $$3 = oq.a(dkg.fk, "_cap_alt");
      alz $$4 = oq.a(dkg.fk, "_side");
      alz $$5 = oq.a(dkg.fk, "_side_alt");
      this.b
         .accept(
            oh.a(dkg.fk)
               .a(ol.a().a(om.c, $$0))
               .a(og.a().a(dyd.M, false).a(dyd.N, false).a(dyd.O, false).a(dyd.P, false), ol.a().a(om.c, $$1))
               .a(og.a().a(dyd.M, true).a(dyd.N, false).a(dyd.O, false).a(dyd.P, false), ol.a().a(om.c, $$2))
               .a(og.a().a(dyd.M, false).a(dyd.N, true).a(dyd.O, false).a(dyd.P, false), ol.a().a(om.c, $$2).a(om.b, om.a.b))
               .a(og.a().a(dyd.M, false).a(dyd.N, false).a(dyd.O, true).a(dyd.P, false), ol.a().a(om.c, $$3))
               .a(og.a().a(dyd.M, false).a(dyd.N, false).a(dyd.O, false).a(dyd.P, true), ol.a().a(om.c, $$3).a(om.b, om.a.b))
               .a(og.a().a(dyd.M, true), ol.a().a(om.c, $$4))
               .a(og.a().a(dyd.N, true), ol.a().a(om.c, $$4).a(om.b, om.a.b))
               .a(og.a().a(dyd.O, true), ol.a().a(om.c, $$5))
               .a(og.a().a(dyd.P, true), ol.a().a(om.c, $$5).a(om.b, om.a.b))
         );
      this.d(dkg.fk);
   }

   private void F(dke $$0) {
      this.b.accept(oi.a($$0, ol.a().a(om.c, oq.a($$0))).a(b()));
   }

   private void V() {
      alz $$0 = oq.a(dkg.dI);
      alz $$1 = oq.a(dkg.dI, "_on");
      this.d(dkg.dI);
      this.b
         .accept(
            oi.a(dkg.dI)
               .a(a(dyd.x, $$0, $$1))
               .a(
                  oj.a(dyd.V, dyd.S)
                     .a(dxy.c, jm.c, ol.a().a(om.a, om.a.c).a(om.b, om.a.c))
                     .a(dxy.c, jm.f, ol.a().a(om.a, om.a.c).a(om.b, om.a.d))
                     .a(dxy.c, jm.d, ol.a().a(om.a, om.a.c))
                     .a(dxy.c, jm.e, ol.a().a(om.a, om.a.c).a(om.b, om.a.b))
                     .a(dxy.a, jm.c, ol.a())
                     .a(dxy.a, jm.f, ol.a().a(om.b, om.a.b))
                     .a(dxy.a, jm.d, ol.a().a(om.b, om.a.c))
                     .a(dxy.a, jm.e, ol.a().a(om.b, om.a.d))
                     .a(dxy.b, jm.c, ol.a().a(om.a, om.a.b))
                     .a(dxy.b, jm.f, ol.a().a(om.a, om.a.b).a(om.b, om.a.b))
                     .a(dxy.b, jm.d, ol.a().a(om.a, om.a.b).a(om.b, om.a.c))
                     .a(dxy.b, jm.e, ol.a().a(om.a, om.a.b).a(om.b, om.a.d))
               )
         );
   }

   private void W() {
      this.d(dkg.fA);
      this.b.accept(b(dkg.fA, oq.a(dkg.fA)));
   }

   private void X() {
      this.d(dkg.tI);
      this.b.accept(c(dkg.tI, oq.a(dkg.tI)));
   }

   private void Y() {
      this.b.accept(oi.a(dkg.eq).a(oj.a(dyd.I).a(jm.a.a, ol.a().a(om.c, oq.a(dkg.eq, "_ns"))).a(jm.a.c, ol.a().a(om.c, oq.a(dkg.eq, "_ew")))));
   }

   private void Z() {
      alz $$0 = ov.a.create(dkg.ei, this.c);
      this.b
         .accept(
            oi.a(
               dkg.ei,
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
      alz $$0 = oq.a(dkg.lj);
      alz $$1 = oq.a(dkg.lj, "_on");
      this.b.accept(oi.a(dkg.lj).a(a(dyd.x, $$1, $$0)).a(e()));
   }

   private void ab() {
      ot $$0 = new ot().a(ou.e, ot.a(dkg.bF, "_bottom")).a(ou.i, ot.a(dkg.bF, "_side"));
      alz $$1 = ot.a(dkg.bF, "_top_sticky");
      alz $$2 = ot.a(dkg.bF, "_top");
      ot $$3 = $$0.c(ou.E, $$1);
      ot $$4 = $$0.c(ou.E, $$2);
      alz $$5 = oq.a(dkg.bF, "_base");
      this.a(dkg.bF, $$5, $$4);
      this.a(dkg.by, $$5, $$3);
      alz $$6 = os.n.a(dkg.bF, "_inventory", $$0.c(ou.f, $$2), this.c);
      alz $$7 = os.n.a(dkg.by, "_inventory", $$0.c(ou.f, $$1), this.c);
      this.a(dkg.bF, $$6);
      this.a(dkg.by, $$7);
   }

   private void a(dke $$0, alz $$1, ot $$2) {
      alz $$3 = os.bm.a($$0, $$2, this.c);
      this.b.accept(oi.a($$0).a(a(dyd.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      ot $$0 = new ot().a(ou.F, ot.a(dkg.bF, "_top")).a(ou.i, ot.a(dkg.bF, "_side"));
      ot $$1 = $$0.c(ou.E, ot.a(dkg.bF, "_top_sticky"));
      ot $$2 = $$0.c(ou.E, ot.a(dkg.bF, "_top"));
      this.b
         .accept(
            oi.a(dkg.bG)
               .a(
                  oj.a(dyd.y, dyd.bh)
                     .a(false, dyo.a, ol.a().a(om.c, os.bn.a(dkg.bF, "_head", $$2, this.c)))
                     .a(false, dyo.b, ol.a().a(om.c, os.bn.a(dkg.bF, "_head_sticky", $$1, this.c)))
                     .a(true, dyo.a, ol.a().a(om.c, os.bo.a(dkg.bF, "_head_short", $$2, this.c)))
                     .a(true, dyo.b, ol.a().a(om.c, os.bo.a(dkg.bF, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dke $$0 = dkg.tM;
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
      this.b.accept(oi.a($$0).a(oj.a(dyd.bz, dyd.bC).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> ol.a().a(om.c, $$7x ? $$10 : $$7);
            case b, c, d -> ol.a().a(om.c, $$7x ? $$11 : $$8);
            case e -> ol.a().a(om.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dke $$0 = dkg.tN;
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
      this.b.accept(oi.a($$0).a(b()).a(oj.a(dtc.b, dtc.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> ol.a().a(om.c, $$9x ? $$13 : $$5);
            case b -> ol.a().a(om.c, $$9x ? $$14 : $$6);
            case c -> ol.a().a(om.c, $$9x ? $$15 : $$7);
            case d -> ol.a().a(om.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alz $$0 = oq.a(dkg.rl, "_inactive");
      alz $$1 = oq.a(dkg.rl, "_active");
      this.a(dkg.rl, $$0);
      this.b.accept(oi.a(dkg.rl).a(oj.a(dyd.bp).a($$2 -> ol.a().a(om.c, $$2 != dyt.b && $$2 != dyt.c ? $$0 : $$1))));
   }

   private void ag() {
      alz $$0 = oq.a(dkg.rm, "_inactive");
      alz $$1 = oq.a(dkg.rm, "_active");
      this.a(dkg.rm, $$0);
      this.b.accept(oi.a(dkg.rm).a(oj.a(dyd.bp).a($$2 -> ol.a().a(om.c, $$2 != dyt.b && $$2 != dyt.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alz $$0 = os.bR.a(dkg.rq, ot.a(false), this.c);
      alz $$1 = os.bR.a(dkg.rq, "_can_summon", ot.a(true), this.c);
      this.a(dkg.rq, $$0);
      this.b.accept(oi.a(dkg.rq).a(a(dyd.H, $$1, $$0)));
   }

   private void ai() {
      alz $$0 = oq.a(dkg.on, "_stable");
      alz $$1 = oq.a(dkg.on, "_unstable");
      this.a(dkg.on, $$0);
      this.b.accept(oi.a(dkg.on).a(a(dyd.b, $$1, $$0)));
   }

   private void aj() {
      alz $$0 = this.a(dkg.sQ, "", os.ao, ot::c);
      alz $$1 = this.a(dkg.sQ, "_lit", os.ao, ot::c);
      this.b.accept(oi.a(dkg.sQ).a(a(dyd.E, $$1, $$0)));
      alz $$2 = this.a(dkg.sR, "", os.ao, ot::c);
      alz $$3 = this.a(dkg.sR, "_lit", os.ao, ot::c);
      this.b.accept(oi.a(dkg.sR).a(a(dyd.E, $$3, $$2)));
   }

   private void ak() {
      alz $$0 = ov.a.create(dkg.fP, this.c);
      alz $$1 = this.a(dkg.fP, "_on", os.c, ot::b);
      this.b.accept(oi.a(dkg.fP).a(a(dyd.r, $$1, $$0)));
   }

   private void l(dke $$0, dke $$1) {
      ot $$2 = ot.z($$0);
      this.b.accept(c($$0, os.bg.a($$0, $$2, this.c)));
      this.b.accept(oi.a($$1, ol.a().a(om.c, os.bi.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      ot $$0 = ot.z(dkg.dX);
      ot $$1 = ot.i(ot.a(dkg.dX, "_off"));
      alz $$2 = os.bk.a(dkg.dX, $$0, this.c);
      alz $$3 = os.bh.a(dkg.dX, "_off", $$1, this.c);
      this.b.accept(oi.a(dkg.dX).a(a(dyd.r, $$2, $$3)));
      alz $$4 = os.bl.a(dkg.dY, $$0, this.c);
      alz $$5 = os.bj.a(dkg.dY, "_off", $$1, this.c);
      this.b.accept(oi.a(dkg.dY).a(a(dyd.r, $$4, $$5)).a(d()));
      this.d(dkg.dX);
      this.c(dkg.dY);
   }

   private void am() {
      this.a(cxo.lY);
      this.b.accept(oi.a(dkg.eu).a(oj.a(dyd.aB, dyd.t, dyd.x).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return ol.a().a(om.c, ot.a(dkg.eu, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cxo.da);
      this.b
         .accept(
            oi.a(dkg.nq)
               .a(
                  oj.a(dyd.aT, dyd.D)
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
      ot $$0 = ot.a(dkg.ea);
      alz $$1 = os.c.a(dkg.ec, $$0, this.c);
      this.b.accept(oi.a(dkg.ea).a(oj.a(dyd.aG).a($$1x -> ol.a().a(om.c, $$1x < 8 ? oq.a(dkg.ea, "_height" + $$1x * 2) : $$1))));
      this.a(dkg.ea, oq.a(dkg.ea, "_height2"));
      this.b.accept(c(dkg.ec, $$1));
   }

   private void ap() {
      this.b.accept(oi.a(dkg.ox, ol.a().a(om.c, oq.a(dkg.ox))).a(b()));
   }

   private void aq() {
      alz $$0 = ov.a.create(dkg.pv, this.c);
      this.a(dkg.pv, $$0);
      this.b.accept(oi.a(dkg.pv).a(oj.a(dyd.bk).a($$0x -> ol.a().a(om.c, this.a(dkg.pv, "_" + $$0x.c(), os.c, ot::b)))));
   }

   private void ar() {
      this.a(cxo.xl);
      this.b.accept(oi.a(dkg.oD).a(oj.a(dyd.at).a($$0 -> ol.a().a(om.c, this.a(dkg.oD, "_stage" + $$0, os.ao, ot::c)))));
   }

   private void as() {
      this.a(cxo.pO);
      this.b
         .accept(
            oi.a(dkg.fW)
               .a(
                  oj.a(dyd.a, dyd.N, dyd.M, dyd.O, dyd.P)
                     .a(false, false, false, false, false, ol.a().a(om.c, oq.a(dkg.fW, "_ns")))
                     .a(false, true, false, false, false, ol.a().a(om.c, oq.a(dkg.fW, "_n")).a(om.b, om.a.b))
                     .a(false, false, true, false, false, ol.a().a(om.c, oq.a(dkg.fW, "_n")))
                     .a(false, false, false, true, false, ol.a().a(om.c, oq.a(dkg.fW, "_n")).a(om.b, om.a.c))
                     .a(false, false, false, false, true, ol.a().a(om.c, oq.a(dkg.fW, "_n")).a(om.b, om.a.d))
                     .a(false, true, true, false, false, ol.a().a(om.c, oq.a(dkg.fW, "_ne")))
                     .a(false, true, false, true, false, ol.a().a(om.c, oq.a(dkg.fW, "_ne")).a(om.b, om.a.b))
                     .a(false, false, false, true, true, ol.a().a(om.c, oq.a(dkg.fW, "_ne")).a(om.b, om.a.c))
                     .a(false, false, true, false, true, ol.a().a(om.c, oq.a(dkg.fW, "_ne")).a(om.b, om.a.d))
                     .a(false, false, true, true, false, ol.a().a(om.c, oq.a(dkg.fW, "_ns")))
                     .a(false, true, false, false, true, ol.a().a(om.c, oq.a(dkg.fW, "_ns")).a(om.b, om.a.b))
                     .a(false, true, true, true, false, ol.a().a(om.c, oq.a(dkg.fW, "_nse")))
                     .a(false, true, false, true, true, ol.a().a(om.c, oq.a(dkg.fW, "_nse")).a(om.b, om.a.b))
                     .a(false, false, true, true, true, ol.a().a(om.c, oq.a(dkg.fW, "_nse")).a(om.b, om.a.c))
                     .a(false, true, true, false, true, ol.a().a(om.c, oq.a(dkg.fW, "_nse")).a(om.b, om.a.d))
                     .a(false, true, true, true, true, ol.a().a(om.c, oq.a(dkg.fW, "_nsew")))
                     .a(true, false, false, false, false, ol.a().a(om.c, oq.a(dkg.fW, "_attached_ns")))
                     .a(true, false, true, false, false, ol.a().a(om.c, oq.a(dkg.fW, "_attached_n")))
                     .a(true, false, false, true, false, ol.a().a(om.c, oq.a(dkg.fW, "_attached_n")).a(om.b, om.a.c))
                     .a(true, true, false, false, false, ol.a().a(om.c, oq.a(dkg.fW, "_attached_n")).a(om.b, om.a.b))
                     .a(true, false, false, false, true, ol.a().a(om.c, oq.a(dkg.fW, "_attached_n")).a(om.b, om.a.d))
                     .a(true, true, true, false, false, ol.a().a(om.c, oq.a(dkg.fW, "_attached_ne")))
                     .a(true, true, false, true, false, ol.a().a(om.c, oq.a(dkg.fW, "_attached_ne")).a(om.b, om.a.b))
                     .a(true, false, false, true, true, ol.a().a(om.c, oq.a(dkg.fW, "_attached_ne")).a(om.b, om.a.c))
                     .a(true, false, true, false, true, ol.a().a(om.c, oq.a(dkg.fW, "_attached_ne")).a(om.b, om.a.d))
                     .a(true, false, true, true, false, ol.a().a(om.c, oq.a(dkg.fW, "_attached_ns")))
                     .a(true, true, false, false, true, ol.a().a(om.c, oq.a(dkg.fW, "_attached_ns")).a(om.b, om.a.b))
                     .a(true, true, true, true, false, ol.a().a(om.c, oq.a(dkg.fW, "_attached_nse")))
                     .a(true, true, false, true, true, ol.a().a(om.c, oq.a(dkg.fW, "_attached_nse")).a(om.b, om.a.b))
                     .a(true, false, true, true, true, ol.a().a(om.c, oq.a(dkg.fW, "_attached_nse")).a(om.b, om.a.c))
                     .a(true, true, true, false, true, ol.a().a(om.c, oq.a(dkg.fW, "_attached_nse")).a(om.b, om.a.d))
                     .a(true, true, true, true, true, ol.a().a(om.c, oq.a(dkg.fW, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dkg.fV);
      this.b.accept(oi.a(dkg.fV).a(oj.a(dyd.a, dyd.x).a(($$0, $$1) -> ol.a().a(om.c, ot.a(dkg.fV, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
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
            return this.a($$0.intValue(), "", ot.b(ot.H(dkg.mA)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ot.b(ot.a(dkg.mA, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ot.b(ot.a(dkg.mA, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cxo.kD);
      this.b.accept(oi.a(dkg.mA).a(oj.a(dyd.aE, dyd.aF).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cxo.kE);
      Function<Integer, alz> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ot $$2 = ot.a($$1);
         return os.bB.a(dkg.mB, $$1, $$2, this.c);
      };
      this.b.accept(oi.a(dkg.mB).a(oj.a(drp.c).a($$1 -> ol.a().a(om.c, $$0.apply($$1)))));
   }

   private void G(dke $$0) {
      this.d($$0);
      alz $$1 = oq.a($$0);
      oh $$2 = oh.a($$0);
      og.c $$3 = ae.a(og.a(), $$1x -> a.stream().<jm>map(Pair::getFirst).map(dpg::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jm, Function<alz, ol>> $$4 : a) {
         dye $$5 = dpg.b((jm)$$4.getFirst());
         Function<alz, ol> $$6 = (Function<alz, ol>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(og.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void H(dke $$0) {
      alz $$1 = ov.j.create($$0, this.c);
      alz $$2 = ov.k.get($$0).a($$1x -> $$1x.a(ou.i, ot.a($$0, "_side_tall"))).a($$0, "_side_tall", this.c);
      alz $$3 = ov.k.get($$0).a($$1x -> $$1x.a(ou.i, ot.a($$0, "_side_small"))).a($$0, "_side_small", this.c);
      oh $$4 = oh.a($$0);
      og.c $$5 = og.a().a(dpe.b, false);
      $$4.a(og.a().a(dpe.b, true), ol.a().a(om.c, $$1));
      $$4.a($$5, ol.a().a(om.c, $$1));
      a.stream().<jm>map(Pair::getFirst).forEach($$2x -> {
         dyk<dyy> $$3x = dpe.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dyy.a);
         }
      });

      for (Pair<jm, Function<alz, ol>> $$6 : a) {
         jm $$7 = (jm)$$6.getFirst();
         dyk<dyy> $$8 = dpe.a($$7);
         if ($$8 != null) {
            Function<alz, ol> $$9 = (Function<alz, ol>)$$6.getSecond();
            $$4.a(og.a().a($$8, dyy.c), $$9.apply($$2));
            $$4.a(og.a().a($$8, dyy.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void I(dke $$0) {
      oj $$1 = oj.a(dnw.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         ot $$3 = ot.c(ot.a($$0, $$2));
         alz $$4 = ob.e.b.a().a($$0, $$2, $$3, this.c);
         return ol.a().a(om.c, $$4);
      });
      this.a($$0, "_tip");
      this.b.accept(oi.a($$0).a($$1));
   }

   private void aw() {
      alz $$0 = ot.a(dkg.rp, "_bottom");
      ot $$1 = new ot().a(ou.e, $$0).a(ou.f, ot.a(dkg.rp, "_top")).a(ou.i, ot.a(dkg.rp, "_side"));
      ot $$2 = new ot().a(ou.e, $$0).a(ou.f, ot.a(dkg.rp, "_top_bloom")).a(ou.i, ot.a(dkg.rp, "_side_bloom"));
      alz $$3 = os.n.a(dkg.rp, "", $$1, this.c);
      alz $$4 = os.n.a(dkg.rp, "_bloom", $$2, this.c);
      this.b.accept(oi.a(dkg.rp).a(oj.a(dyd.F).a($$2x -> ol.a().a(om.c, $$2x ? $$4 : $$3))));
      this.a(cxo.gw, $$3);
   }

   private void ax() {
      dke $$0 = dkg.ct;
      alz $$1 = oq.a($$0);
      oh $$2 = oh.a($$0);
      List.of(Pair.of(jm.c, om.a.a), Pair.of(jm.f, om.a.b), Pair.of(jm.d, om.a.c), Pair.of(jm.e, om.a.d)).forEach($$2x -> {
         jm $$3 = (jm)$$2x.getFirst();
         om.a $$4 = (om.a)$$2x.getSecond();
         og.c $$5 = og.a().a(dyd.S, $$3);
         $$2.a($$5, ol.a().a(om.c, $$1).a(om.b, $$4).a(om.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, oq.a($$0, "_inventory"));
      i.clear();
   }

   private void a(oh $$0, og.c $$1, om.a $$2) {
      List.of(Pair.of(dyd.bq, os.aN), Pair.of(dyd.br, os.aO), Pair.of(dyd.bs, os.aP), Pair.of(dyd.bt, os.aQ), Pair.of(dyd.bu, os.aR), Pair.of(dyd.bv, os.aS))
         .forEach($$3 -> {
            dye $$4 = (dye)$$3.getFirst();
            or $$5 = (or)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(oh $$0, og.c $$1, om.a $$2, dye $$3, or $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ot $$7 = new ot().a(ou.b, ot.a(dkg.ct, $$6));
      ob.d $$8 = new ob.d($$4, $$6);
      alz $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dkg.ct, $$6, $$7, this.c));
      $$0.a(og.a($$1, og.a().a($$3, $$5)), ol.a().a(om.c, $$9).a(om.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dkg.le, os.c.a(dkg.le, ot.b(oq.a("magma")), this.c)));
   }

   private void J(dke $$0) {
      this.b($$0, ov.r);
      os.bI.a(oq.a($$0.j()), ot.v($$0), this.c);
   }

   private void b(dke $$0, dke $$1, ob.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dke $$0, dke $$1) {
      os.bJ.a(oq.a($$0.j()), ot.v($$1), this.c);
   }

   private void az() {
      alz $$0 = oq.a(dkg.b);
      alz $$1 = oq.a(dkg.b, "_mirrored");
      this.b.accept(a(dkg.fb, $$0, $$1));
      this.a(dkg.fb, $$0);
   }

   private void aA() {
      alz $$0 = oq.a(dkg.te);
      alz $$1 = oq.a(dkg.te, "_mirrored");
      this.b.accept(a(dkg.ty, $$0, $$1).a(f()));
      this.a(dkg.ty, $$0);
   }

   private void n(dke $$0, dke $$1) {
      this.a($$0, ob.e.b);
      ot $$2 = ot.d(ot.a($$0, "_pot"));
      alz $$3 = ob.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alz $$0 = ot.a(dkg.pG, "_bottom");
      alz $$1 = ot.a(dkg.pG, "_top_off");
      alz $$2 = ot.a(dkg.pG, "_top");
      alz[] $$3 = new alz[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ot $$5 = new ot().a(ou.e, $$0).a(ou.f, $$4 == 0 ? $$1 : $$2).a(ou.i, ot.a(dkg.pG, "_side" + $$4));
         $$3[$$4] = os.n.a(dkg.pG, "_" + $$4, $$5, this.c);
      }

      this.b.accept(oi.a(dkg.pG).a(oj.a(dyd.ba).a($$1x -> ol.a().a(om.c, $$3[$$1x]))));
      this.a(cxo.xJ, $$3[0]);
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
      alz $$0 = ot.a(dkg.pw, "_top");
      alz $$1 = ot.a(dkg.pw, "_bottom");
      alz $$2 = ot.a(dkg.pw, "_side");
      alz $$3 = ot.a(dkg.pw, "_lock");
      ot $$4 = new ot().a(ou.o, $$2).a(ou.m, $$2).a(ou.l, $$2).a(ou.c, $$0).a(ou.j, $$0).a(ou.k, $$1).a(ou.n, $$3);
      alz $$5 = os.b.a(dkg.pw, $$4, this.c);
      this.b.accept(oi.a(dkg.pw, ol.a().a(om.c, $$5)).a(oj.a(dyd.U).a($$0x -> this.a($$0x, ol.a()))));
   }

   private void aD() {
      dke $$0 = dkg.n;
      alz $$1 = oq.a($$0);
      ov $$2 = ov.a.get($$0);
      dke $$3 = dkg.jZ;
      alz $$4 = os.ab.a($$3, $$2.b(), this.c);
      alz $$5 = os.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      md.a().filter(me::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dkg.rA).a(md.x).a(dkg.rA, dkg.rY).a(dkg.rE, dkg.rI).a(md.z);
      this.i(dkg.rz).a(md.B).a(dkg.rz, dkg.rX).a(dkg.rD, dkg.rH).a(md.D);
      this.i(dkg.ry).a(md.F).a(dkg.ry, dkg.rW).a(dkg.rC, dkg.rG).a(md.H);
      this.i(dkg.rx).a(md.J).a(dkg.rx, dkg.rV).a(dkg.rB, dkg.rF).a(md.L);
      this.x(dkg.sF);
      this.x(dkg.sG);
      this.x(dkg.sH);
      this.x(dkg.sI);
      this.i(dkg.sF, dkg.sJ);
      this.i(dkg.sG, dkg.sK);
      this.i(dkg.sH, dkg.sL);
      this.i(dkg.sI, dkg.sM);
      this.n(dkg.a);
      this.c(dkg.nx, dkg.a);
      this.c(dkg.nw, dkg.a);
      this.n(dkg.gc);
      this.n(dkg.ed);
      this.c(dkg.ny, dkg.J);
      this.n(dkg.fO);
      this.n(dkg.mz);
      this.n(dkg.fF);
      this.n(dkg.gf);
      this.a(cxo.uU);
      this.n(dkg.pB);
      this.n(dkg.J);
      this.n(dkg.K);
      this.n(dkg.im);
      this.a(cxo.gf);
      this.o(dkg.qh, dkg.qy);
      this.o(dkg.qi, dkg.qz);
      this.o(dkg.qj, dkg.qA);
      this.o(dkg.qk, dkg.qB);
      this.o(dkg.ql, dkg.qC);
      this.o(dkg.qm, dkg.qD);
      this.o(dkg.qn, dkg.qE);
      this.o(dkg.qo, dkg.qF);
      this.o(dkg.qp, dkg.qG);
      this.o(dkg.qq, dkg.qH);
      this.o(dkg.qr, dkg.qI);
      this.o(dkg.qs, dkg.qJ);
      this.o(dkg.qt, dkg.qK);
      this.o(dkg.qu, dkg.qL);
      this.o(dkg.qv, dkg.qM);
      this.o(dkg.qw, dkg.qN);
      this.o(dkg.qg, dkg.qx);
      this.n(dkg.nv);
      this.n(dkg.gH);
      this.n(dkg.rk);
      this.n(dkg.sS);
      this.t(dkg.sT);
      this.t(dkg.sU);
      this.u(dkg.tD);
      this.u(dkg.tE);
      this.aj();
      this.g(dkg.sX, dkg.sV);
      this.H(dkg.tQ);
      this.I(dkg.tR);
      this.a(dkg.tP);
      this.q(dkg.sW);
      this.a(dkg.in, cxo.hP);
      this.a(cxo.hP);
      this.aE();
      this.a(dkg.li, cxo.jp);
      this.a(cxo.jp);
      this.f(dkg.bX, ot.a(dkg.bF, "_side"));
      this.a(dkg.U);
      this.a(dkg.V);
      this.a(dkg.iS);
      this.a(dkg.cF);
      this.a(dkg.cG);
      this.a(dkg.cH);
      this.a(dkg.fS);
      this.a(dkg.fT);
      this.a(dkg.fX);
      this.a(dkg.Q);
      this.a(dkg.W);
      this.a(dkg.R);
      this.a(dkg.co);
      this.a(dkg.S);
      this.a(dkg.T);
      this.a(dkg.cp);
      this.b(dkg.pE, ov.d);
      this.a(dkg.pD);
      this.a(dkg.aY);
      this.a(dkg.aZ);
      this.a(dkg.ba);
      this.a(dkg.hr);
      this.a(dkg.dV);
      this.a(dkg.dW);
      this.a(dkg.hq);
      this.a(dkg.pX);
      this.a(dkg.nr);
      this.a(dkg.ee);
      this.a(dkg.k);
      this.a(dkg.pF);
      this.a(dkg.fN);
      this.a(dkg.ep);
      this.a(dkg.O);
      this.a(dkg.pC);
      this.a(dkg.eb);
      this.b(dkg.eg, ov.g);
      this.b(dkg.pL, ov.d);
      this.b(dkg.fo, ov.d);
      this.n(dkg.ag);
      this.n(dkg.gp);
      this.a(dkg.lf);
      this.a(dkg.bf);
      this.a(dkg.iT);
      this.a(dkg.cv);
      this.a(dkg.qf);
      this.a(dkg.iz);
      this.a(dkg.oT);
      this.a(dkg.ej);
      this.a(dkg.ek);
      this.b(dkg.cA, ov.b);
      this.h(dkg.cB);
      this.a(dkg.aV);
      this.b(dkg.bD, ov.w);
      this.a(cxo.cZ);
      this.b(dkg.cr, ov.f);
      this.b(dkg.py, ov.d);
      this.a(dkg.oK);
      this.a(dkg.aW);
      this.a(dkg.qO);
      this.a(dkg.qP);
      this.a(dkg.ri);
      this.a(dkg.sP);
      this.a(dkg.tA);
      this.a(dkg.tB);
      this.a(dkg.tC);
      this.e(dkg.rn);
      this.n(dkg.tO);
      this.aD();
      this.a(dkg.rv);
      this.a(dkg.rw);
      this.a(dkg.rr);
      this.a(dkg.rs);
      this.a(dkg.rt);
      this.a(dkg.ru);
      this.k(dkg.rr, dkg.rR);
      this.k(dkg.rs, dkg.rT);
      this.k(dkg.rt, dkg.rS);
      this.k(dkg.ru, dkg.rU);
      this.j(dkg.sh);
      this.j(dkg.si);
      this.j(dkg.sk);
      this.j(dkg.sj);
      this.a(dkg.sh, dkg.sl);
      this.a(dkg.si, dkg.sm);
      this.a(dkg.sk, dkg.so);
      this.a(dkg.sj, dkg.sn);
      this.l(dkg.sp);
      this.l(dkg.sq);
      this.l(dkg.ss);
      this.l(dkg.sr);
      this.b(dkg.sp, dkg.st);
      this.b(dkg.sq, dkg.su);
      this.b(dkg.ss, dkg.sw);
      this.b(dkg.sr, dkg.sv);
      this.a(dkg.sx);
      this.a(dkg.sy);
      this.a(dkg.sz);
      this.a(dkg.sA);
      this.k(dkg.sx, dkg.sB);
      this.k(dkg.sy, dkg.sC);
      this.k(dkg.sz, dkg.sD);
      this.k(dkg.sA, dkg.sE);
      this.j(dkg.hm, dkg.co);
      this.j(dkg.hn, dkg.cp);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dkg.oB, dkg.oC);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.A(dkg.kO);
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
      this.G(dkg.ft);
      this.G(dkg.fu);
      this.G(dkg.ro);
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
      this.F(dkg.cX);
      this.d(dkg.cX);
      this.F(dkg.ov);
      this.g();
      this.F(dkg.sZ);
      this.l(dkg.cw, dkg.cx);
      this.l(dkg.en, dkg.eo);
      this.a(dkg.cI, dkg.n, ot::c);
      this.a(dkg.ot, dkg.p, ot::d);
      this.z(dkg.oR);
      this.z(dkg.oI);
      this.w(dkg.bb);
      this.w(dkg.hy);
      this.C();
      this.E(dkg.oz);
      this.E(dkg.oA);
      this.e(dkg.fl, oq.a(dkg.fl));
      this.a(dkg.el, ov.d);
      this.a(dkg.em, ov.d);
      this.a(dkg.tz);
      this.a(dkg.lh, ov.d);
      this.f(dkg.j);
      this.f(dkg.tc);
      this.f(dkg.L);
      this.g(dkg.M);
      this.g(dkg.P);
      this.f(dkg.N);
      this.e(dkg.I);
      this.b(dkg.tJ, ov.f);
      this.a(dkg.iA, ov.d, ov.e);
      this.a(dkg.kS, ov.x, ov.y);
      this.a(dkg.hv, ov.x, ov.y);
      this.a(dkg.tF, ov.d, ov.e);
      this.a(dkg.tG, ov.d, ov.e);
      this.a(dkg.tH, ov.d, ov.e);
      this.c(dkg.oo, ov.i);
      this.z();
      this.a(dkg.pz, ot::B);
      this.a(dkg.pA, ot::D);
      this.a(dkg.kY, dyd.at, 0, 1, 2, 3);
      this.a(dkg.gI, dyd.aw, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkg.fE, dyd.at, 0, 1, 1, 2);
      this.a(dkg.gJ, dyd.aw, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkg.cJ, dyd.aw, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dkg.kV, ob.e.b, dyd.ar, 0, 1);
      this.i();
      this.h();
      this.a(oq.a("decorated_pot"), dkg.iR).b(dkg.tK);
      this.a(oq.a("banner"), dkg.n)
         .a(os.bK, dkg.ja, dkg.jb, dkg.jc, dkg.jd, dkg.je, dkg.jf, dkg.jg, dkg.jh, dkg.ji, dkg.jj, dkg.jk, dkg.jl, dkg.jm, dkg.jn, dkg.jo, dkg.jp)
         .b(dkg.jq, dkg.jr, dkg.js, dkg.jt, dkg.ju, dkg.jv, dkg.jw, dkg.jx, dkg.jy, dkg.jz, dkg.jA, dkg.jB, dkg.jC, dkg.jD, dkg.jE, dkg.jF);
      this.a(oq.a("bed"), dkg.n)
         .b(dkg.bg, dkg.bh, dkg.bi, dkg.bj, dkg.bk, dkg.bl, dkg.bm, dkg.bn, dkg.bo, dkg.bp, dkg.bq, dkg.br, dkg.bs, dkg.bt, dkg.bu, dkg.bv);
      this.m(dkg.bg, dkg.bH);
      this.m(dkg.bh, dkg.bI);
      this.m(dkg.bi, dkg.bJ);
      this.m(dkg.bj, dkg.bK);
      this.m(dkg.bk, dkg.bL);
      this.m(dkg.bl, dkg.bM);
      this.m(dkg.bm, dkg.bN);
      this.m(dkg.bn, dkg.bO);
      this.m(dkg.bo, dkg.bP);
      this.m(dkg.bp, dkg.bQ);
      this.m(dkg.bq, dkg.bR);
      this.m(dkg.br, dkg.bS);
      this.m(dkg.bs, dkg.bT);
      this.m(dkg.bt, dkg.bU);
      this.m(dkg.bu, dkg.bV);
      this.m(dkg.bv, dkg.bW);
      this.a(oq.a("skull"), dkg.ej)
         .a(os.bL, dkg.hc, dkg.ha, dkg.gY, dkg.gU, dkg.gW, dkg.hg)
         .a(dkg.he)
         .b(dkg.hd, dkg.hf, dkg.hb, dkg.gZ, dkg.gV, dkg.gX, dkg.hh);
      this.J(dkg.lk);
      this.J(dkg.ll);
      this.J(dkg.lm);
      this.J(dkg.ln);
      this.J(dkg.lo);
      this.J(dkg.lp);
      this.J(dkg.lq);
      this.J(dkg.lr);
      this.J(dkg.ls);
      this.J(dkg.lt);
      this.J(dkg.lu);
      this.J(dkg.lv);
      this.J(dkg.lw);
      this.J(dkg.lx);
      this.J(dkg.ly);
      this.J(dkg.lz);
      this.J(dkg.lA);
      this.b(dkg.ns, ov.r);
      this.c(dkg.ns);
      this.a(oq.a("chest"), dkg.n).b(dkg.cD, dkg.hl);
      this.a(oq.a("ender_chest"), dkg.cv).b(dkg.fU);
      this.f(dkg.fL, dkg.cv).a(dkg.fL, dkg.la);
      this.a(dkg.aT);
      this.a(dkg.aU);
      this.a(dkg.lR);
      this.a(dkg.lS);
      this.a(dkg.lT);
      this.a(dkg.lU);
      this.a(dkg.lV);
      this.a(dkg.lW);
      this.a(dkg.lX);
      this.a(dkg.lY);
      this.a(dkg.lZ);
      this.a(dkg.ma);
      this.a(dkg.mb);
      this.a(dkg.mc);
      this.a(dkg.md);
      this.a(dkg.me);
      this.a(dkg.mf);
      this.a(dkg.mg);
      this.a(ov.a, dkg.mh, dkg.mi, dkg.mj, dkg.mk, dkg.ml, dkg.mm, dkg.mn, dkg.mo, dkg.mp, dkg.mq, dkg.mr, dkg.ms, dkg.mt, dkg.mu, dkg.mv, dkg.mw);
      this.a(dkg.iR);
      this.a(dkg.hz);
      this.a(dkg.hA);
      this.a(dkg.hB);
      this.a(dkg.hC);
      this.a(dkg.hD);
      this.a(dkg.hE);
      this.a(dkg.hF);
      this.a(dkg.hG);
      this.a(dkg.hH);
      this.a(dkg.hI);
      this.a(dkg.hJ);
      this.a(dkg.hK);
      this.a(dkg.hL);
      this.a(dkg.hM);
      this.a(dkg.hN);
      this.a(dkg.hO);
      this.a(dkg.rj);
      this.h(dkg.aX, dkg.fm);
      this.h(dkg.ev, dkg.hP);
      this.h(dkg.ew, dkg.hQ);
      this.h(dkg.ex, dkg.hR);
      this.h(dkg.ey, dkg.hS);
      this.h(dkg.ez, dkg.hT);
      this.h(dkg.eA, dkg.hU);
      this.h(dkg.eB, dkg.hV);
      this.h(dkg.eC, dkg.hW);
      this.h(dkg.eD, dkg.hX);
      this.h(dkg.eE, dkg.hY);
      this.h(dkg.eF, dkg.hZ);
      this.h(dkg.eG, dkg.ia);
      this.h(dkg.eH, dkg.ib);
      this.h(dkg.eI, dkg.ic);
      this.h(dkg.eJ, dkg.id);
      this.h(dkg.eK, dkg.ie);
      this.b(ov.p, dkg.lB, dkg.lC, dkg.lD, dkg.lE, dkg.lF, dkg.lG, dkg.lH, dkg.lI, dkg.lJ, dkg.lK, dkg.lL, dkg.lM, dkg.lN, dkg.lO, dkg.lP, dkg.lQ);
      this.g(dkg.bH, dkg.iB);
      this.g(dkg.bI, dkg.iC);
      this.g(dkg.bJ, dkg.iD);
      this.g(dkg.bK, dkg.iE);
      this.g(dkg.bL, dkg.iF);
      this.g(dkg.bM, dkg.iG);
      this.g(dkg.bN, dkg.iH);
      this.g(dkg.bO, dkg.iI);
      this.g(dkg.bP, dkg.iJ);
      this.g(dkg.bQ, dkg.iK);
      this.g(dkg.bR, dkg.iL);
      this.g(dkg.bS, dkg.iM);
      this.g(dkg.bT, dkg.iN);
      this.g(dkg.bU, dkg.iO);
      this.g(dkg.bV, dkg.iP);
      this.g(dkg.bW, dkg.iQ);
      this.a(dkg.td);
      this.a(dkg.eZ);
      this.a(dkg.bB, dkg.gq, ob.e.a);
      this.a(dkg.bY, dkg.gr, ob.e.b);
      this.a(dkg.ca, dkg.gs, ob.e.b);
      this.a(dkg.cb, dkg.gt, ob.e.b);
      this.a(dkg.cc, dkg.gu, ob.e.b);
      this.a(dkg.cd, dkg.gv, ob.e.b);
      this.a(dkg.ce, dkg.gw, ob.e.b);
      this.a(dkg.cf, dkg.gx, ob.e.b);
      this.a(dkg.cg, dkg.gy, ob.e.b);
      this.a(dkg.ch, dkg.gz, ob.e.b);
      this.a(dkg.ci, dkg.gA, ob.e.b);
      this.a(dkg.cj, dkg.gB, ob.e.b);
      this.a(dkg.cl, dkg.gC, ob.e.b);
      this.a(dkg.ck, dkg.gD, ob.e.b);
      this.a(dkg.cn, dkg.gE, ob.e.b);
      this.a(dkg.cm, dkg.gF, ob.e.b);
      this.a(dkg.bC, dkg.gG, ob.e.b);
      this.a(dkg.bZ, dkg.gg, ob.e.b);
      this.H();
      this.v(dkg.fh);
      this.v(dkg.fi);
      this.v(dkg.fj);
      this.a(dkg.bA, ob.e.a);
      this.b(dkg.ef, ob.e.a);
      this.a(cxo.dQ);
      this.b(dkg.mx, dkg.my, ob.e.b);
      this.a(cxo.dR);
      this.c(dkg.my);
      this.b(dkg.tb, ob.e.b);
      this.c(dkg.tb);
      this.c(dkg.sR);
      this.b(dkg.oU, dkg.oV, ob.e.b);
      this.b(dkg.oW, dkg.oX, ob.e.b);
      this.a(dkg.oU, "_plant");
      this.c(dkg.oV);
      this.a(dkg.oW, "_plant");
      this.c(dkg.oX);
      this.a(dkg.nt, ob.e.a, ot.c(ot.a(dkg.nu, "_stage0")));
      this.m();
      this.a(dkg.bz, ob.e.b);
      this.c(dkg.iV, ob.e.b);
      this.c(dkg.iW, ob.e.b);
      this.c(dkg.iX, ob.e.b);
      this.c(dkg.iY, ob.e.a);
      this.c(dkg.iZ, ob.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dkg.mR, dkg.mM, dkg.mH, dkg.mC, dkg.nb, dkg.mW, dkg.nl, dkg.ng);
      this.a(dkg.mS, dkg.mN, dkg.mI, dkg.mD, dkg.nc, dkg.mX, dkg.nm, dkg.nh);
      this.a(dkg.mT, dkg.mO, dkg.mJ, dkg.mE, dkg.nd, dkg.mY, dkg.nn, dkg.ni);
      this.a(dkg.mU, dkg.mP, dkg.mK, dkg.mF, dkg.ne, dkg.mZ, dkg.no, dkg.nj);
      this.a(dkg.mV, dkg.mQ, dkg.mL, dkg.mG, dkg.nf, dkg.na, dkg.np, dkg.nk);
      this.e(dkg.fs, dkg.fq);
      this.e(dkg.fr, dkg.fp);
      this.m(dkg.af).c(dkg.af).a(dkg.aA);
      this.m(dkg.ar).c(dkg.ar).a(dkg.aJ);
      this.a(dkg.ar, dkg.du, dkg.dE);
      this.b(dkg.aS, ov.t);
      this.m(dkg.ab).c(dkg.ab).a(dkg.ax);
      this.m(dkg.am).c(dkg.am).a(dkg.aF);
      this.a(dkg.am, dkg.dn, dkg.dz);
      this.a(dkg.D, dkg.gl, ob.e.b);
      this.b(dkg.aO, ov.t);
      this.m(dkg.ac).d(dkg.ac).a(dkg.ay);
      this.m(dkg.an).d(dkg.an).a(dkg.aG);
      this.a(dkg.an, dkg.do, dkg.dA);
      this.a(dkg.E, dkg.gm, ob.e.b);
      this.b(dkg.aP, ov.t);
      this.m(dkg.Z).c(dkg.Z).a(dkg.av);
      this.m(dkg.ak).c(dkg.ak).a(dkg.aD);
      this.a(dkg.ak, dkg.dm, dkg.dy);
      this.a(dkg.B, dkg.gj, ob.e.b);
      this.b(dkg.aM, ov.t);
      this.m(dkg.X).c(dkg.X).a(dkg.at);
      this.m(dkg.aq).c(dkg.aq).a(dkg.aB);
      this.a(dkg.aq, dkg.dk, dkg.dw);
      this.a(dkg.z, dkg.gh, ob.e.b);
      this.b(dkg.aK, ov.t);
      this.m(dkg.Y).c(dkg.Y).a(dkg.au);
      this.m(dkg.aj).c(dkg.aj).a(dkg.aC);
      this.a(dkg.aj, dkg.dl, dkg.dx);
      this.a(dkg.A, dkg.gi, ob.e.b);
      this.b(dkg.aL, ov.t);
      this.m(dkg.ad).c(dkg.ad).a(dkg.az);
      this.m(dkg.ao).c(dkg.ao).a(dkg.aH);
      this.a(dkg.ao, dkg.dq, dkg.dC);
      this.a(dkg.F, dkg.gn, ob.e.b);
      this.b(dkg.aQ, ov.t);
      this.m(dkg.ae).c(dkg.ae).a(dkg.u);
      this.m(dkg.ap).c(dkg.ap).a(dkg.aI);
      this.a(dkg.ap, dkg.dr, dkg.dD);
      this.a(dkg.G, dkg.go, ob.e.b);
      this.b(dkg.aR, ov.t);
      this.m(dkg.aa).c(dkg.aa).a(dkg.aw);
      this.m(dkg.al).c(dkg.al).a(dkg.aE);
      this.a(dkg.al, dkg.dp, dkg.dB);
      this.a(dkg.C, dkg.gk, ob.e.b);
      this.b(dkg.aN, ov.t);
      this.m(dkg.oN).b(dkg.oN).a(dkg.oP);
      this.m(dkg.oO).b(dkg.oO).a(dkg.oQ);
      this.a(dkg.oO, dkg.ds, dkg.dF);
      this.a(dkg.oS, dkg.pH, ob.e.b);
      this.n(dkg.oY, dkg.pJ);
      this.m(dkg.oE).b(dkg.oE).a(dkg.oG);
      this.m(dkg.oF).b(dkg.oF).a(dkg.oH);
      this.a(dkg.oF, dkg.dt, dkg.dG);
      this.a(dkg.oJ, dkg.pI, ob.e.b);
      this.n(dkg.oL, dkg.pK);
      this.m(dkg.ai).d(dkg.ai);
      this.m(dkg.as).d(dkg.as);
      this.a(dkg.x, dkg.dv, dkg.dH);
      this.b(dkg.oM, ob.e.b);
      this.a(cxo.dN);
      this.j(dkg.dK);
      this.l(dkg.ip);
      this.u();
      this.o(dkg.cY);
      this.p(dkg.bw);
      this.p(dkg.bx);
      this.p(dkg.hx);
      this.t();
      this.r(dkg.gb);
      this.r(dkg.lb);
      this.r(dkg.lc);
      this.s(dkg.hi);
      this.s(dkg.hj);
      this.s(dkg.hk);
      this.o();
      this.p();
      this.d(dkg.cL, ov.h);
      this.d(dkg.or, ov.h);
      this.d(dkg.oq, ov.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dkg.eY, dkg.fg);
      this.k(dkg.m, dkg.fc);
      this.k(dkg.eX, dkg.ff);
      this.k(dkg.eW, dkg.fe);
      this.az();
      this.k(dkg.eV, dkg.fd);
      this.aA();
      cyt.b().forEach($$0 -> this.a($$0, oq.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dkg.io);
      oj.a<Integer> $$0 = oj.a(dyd.aQ);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alz $$3 = ot.a(cxo.hQ, $$2);
         $$0.a($$1, ol.a().a(om.c, os.aa.a(dkg.io, $$2, ot.h($$3), this.c)));
         os.bC.a(oq.a(cxo.hQ, $$2), ot.k($$3), this.c);
      }

      this.b.accept(oi.a(dkg.io).a($$0));
   }

   private void o(dke $$0, dke $$1) {
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
                  oj.a(dyd.aA, dyd.r)
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
      this.b.accept(oi.a($$1).a(a(dyd.r, $$13, $$12)));
   }

   class a {
      private final alz b;

      public a(final alz $$0, final dke $$1) {
         this.b = os.aa.a($$0, ot.v($$1), ob.this.c);
      }

      public ob.a a(dke... $$0) {
         for (dke $$1 : $$0) {
            ob.this.b.accept(ob.c($$1, this.b));
         }

         return this;
      }

      public ob.a b(dke... $$0) {
         for (dke $$1 : $$0) {
            ob.this.c($$1);
         }

         return this.a($$0);
      }

      public ob.a a(or $$0, dke... $$1) {
         for (dke $$2 : $$1) {
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
      private final Set<dke> f = new HashSet<>();

      public b(final ot $$0) {
         this.b = $$0;
      }

      public ob.b a(dke $$0, or $$1) {
         this.e = $$1.a($$0, this.b, ob.this.c);
         if (ob.this.f.containsKey($$0)) {
            ob.this.b.accept(ob.this.f.get($$0).create($$0, this.e, this.b, ob.this.c));
         } else {
            ob.this.b.accept(ob.c($$0, this.e));
         }

         return this;
      }

      public ob.b a(dke $$0, dke $$1) {
         alz $$2 = oq.a($$0);
         ob.this.b.accept(ob.c($$1, $$2));
         ob.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public ob.b a(dke $$0) {
         alz $$1 = os.s.a($$0, this.b, ob.this.c);
         alz $$2 = os.t.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.b($$0, $$1, $$2));
         alz $$3 = os.u.a($$0, this.b, ob.this.c);
         ob.this.a($$0, $$3);
         return this;
      }

      public ob.b b(dke $$0) {
         alz $$1 = os.M.a($$0, this.b, ob.this.c);
         alz $$2 = os.N.a($$0, this.b, ob.this.c);
         alz $$3 = os.O.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$1, $$2, $$3));
         alz $$4 = os.P.a($$0, this.b, ob.this.c);
         ob.this.a($$0, $$4);
         return this;
      }

      public ob.b c(dke $$0) {
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

      public ob.b d(dke $$0) {
         alz $$1 = os.J.a($$0, this.b, ob.this.c);
         alz $$2 = os.K.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.c($$0, $$1, $$2));
         alz $$3 = os.L.a($$0, this.b, ob.this.c);
         ob.this.a($$0, $$3);
         return this;
      }

      public ob.b e(dke $$0) {
         ot $$1 = ot.q($$0);
         alz $$2 = os.R.a($$0, $$1, ob.this.c);
         alz $$3 = os.Q.a($$0, $$1, ob.this.c);
         alz $$4 = os.T.a($$0, $$1, ob.this.c);
         alz $$5 = os.S.a($$0, $$1, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ob.b f(dke $$0) {
         alz $$1 = os.V.a($$0, this.b, ob.this.c);
         alz $$2 = os.U.a($$0, this.b, ob.this.c);
         alz $$3 = os.X.a($$0, this.b, ob.this.c);
         alz $$4 = os.W.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ob.b g(dke $$0) {
         alz $$1 = os.Y.a($$0, this.b, ob.this.c);
         alz $$2 = os.Z.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.e($$0, $$1, $$2));
         return this;
      }

      public ob.b h(dke $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dke $$1 = this.d.b().get(me.b.r);
            alz $$2 = os.aa.a($$0, this.b, ob.this.c);
            ob.this.b.accept(ob.c($$0, $$2));
            ob.this.b.accept(ob.c($$1, $$2));
            ob.this.a($$0.j());
            ob.this.c($$1);
            return this;
         }
      }

      public ob.b i(dke $$0) {
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

      public ob.b j(dke $$0) {
         alz $$1 = this.a(os.af, $$0);
         alz $$2 = this.a(os.ae, $$0);
         alz $$3 = this.a(os.ag, $$0);
         ob.this.b.accept(ob.b($$0, $$1, $$2, $$3));
         ob.this.a($$0, $$2);
         return this;
      }

      private ob.b k(dke $$0) {
         ov $$1 = ob.this.g.getOrDefault($$0, ov.a.get($$0));
         alz $$2 = $$1.a($$0, ob.this.c);
         ob.this.b.accept(ob.c($$0, $$2));
         return this;
      }

      private ob.b l(dke $$0) {
         ob.this.j($$0);
         return this;
      }

      private void m(dke $$0) {
         if (ob.this.e.contains($$0)) {
            ob.this.l($$0);
         } else {
            ob.this.k($$0);
         }
      }

      private alz a(or $$0, dke $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ob.this.c));
      }

      public ob.b a(me $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<ob.b, dke> $$2 = ob.h.get($$0x);
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
      of create(dke var1, alz var2, ot var3, BiConsumer<alz, Supplier<JsonElement>> var4);
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

      public ob.f a(dke $$0) {
         ot $$1 = this.b.c(ou.d, this.b.a(ou.i));
         alz $$2 = os.j.a($$0, $$1, ob.this.c);
         ob.this.b.accept(ob.d($$0, $$2));
         return this;
      }

      public ob.f b(dke $$0) {
         alz $$1 = os.j.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.d($$0, $$1));
         return this;
      }

      public ob.f c(dke $$0) {
         alz $$1 = os.j.a($$0, this.b, ob.this.c);
         alz $$2 = os.k.a($$0, this.b, ob.this.c);
         ob.this.b.accept(ob.d($$0, $$1, $$2));
         return this;
      }

      public ob.f d(dke $$0) {
         ob.this.b.accept(ob.a($$0, this.b, ob.this.c));
         return this;
      }
   }
}
