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

public class nx {
   final Consumer<ob> b;
   final BiConsumer<alp, Supplier<JsonElement>> c;
   private final Consumer<cxc> d;
   final List<dkd> e = ImmutableList.of(dkf.eL, dkf.eR, dkf.iw);
   final Map<dkd, nx.c> f = ImmutableMap.builder().put(dkf.b, nx::a).put(dkf.tl, nx::c).put(dkf.fa, nx::b).build();
   final Map<dkd, or> g = ImmutableMap.builder()
      .put(dkf.bc, or.z.get(dkf.bc))
      .put(dkf.jN, or.z.get(dkf.jN))
      .put(dkf.kr, or.a(op.a(dkf.bc, "_top")))
      .put(dkf.kt, or.a(op.a(dkf.jN, "_top")))
      .put(dkf.be, or.d.get(dkf.bc).a($$0x -> $$0x.a(oq.i, op.J(dkf.be))))
      .put(dkf.jP, or.d.get(dkf.jN).a($$0x -> $$0x.a(oq.i, op.J(dkf.jP))))
      .put(dkf.hA, or.d.get(dkf.hA))
      .put(dkf.ks, or.a(op.a(dkf.hA, "_bottom")))
      .put(dkf.pT, or.A.get(dkf.pT))
      .put(dkf.tl, or.A.get(dkf.tl))
      .put(dkf.hB, or.d.get(dkf.hB).a($$0x -> $$0x.a(oq.i, op.J(dkf.hB))))
      .put(dkf.bd, or.d.get(dkf.bd).a($$0x -> {
         $$0x.a(oq.d, op.a(dkf.bc, "_top"));
         $$0x.a(oq.i, op.J(dkf.bd));
      }))
      .put(dkf.jO, or.d.get(dkf.jO).a($$0x -> {
         $$0x.a(oq.d, op.a(dkf.jN, "_top"));
         $$0x.a(oq.i, op.J(dkf.jO));
      }))
      .put(dkf.ro, or.A.get(dkf.ro))
      .put(dkf.rj, or.A.get(dkf.rj))
      .build();
   static final Map<me.b, BiConsumer<nx.b, dkd>> h = ImmutableMap.builder()
      .put(me.b.a, nx.b::a)
      .put(me.b.e, nx.b::l)
      .put(me.b.b, nx.b::k)
      .put(me.b.c, nx.b::k)
      .put(me.b.f, nx.b::c)
      .put(me.b.g, nx.b::d)
      .put(me.b.h, nx.b::e)
      .put(me.b.i, nx.b::f)
      .put(me.b.k, nx.b::h)
      .put(me.b.l, nx.b::i)
      .put(me.b.m, nx.b::j)
      .put(me.b.n, nx.b::g)
      .put(me.b.p, nx.b::m)
      .put(me.b.q, nx.b::b)
      .build();
   public static final List<Pair<jm, Function<alp, oh>>> a = List.of(
      Pair.of(jm.c, (Function<alp, oh>)$$0 -> oh.a().a(oi.c, $$0)),
      Pair.of(jm.f, (Function<alp, oh>)$$0 -> oh.a().a(oi.c, $$0).a(oi.b, oi.a.b).a(oi.d, true)),
      Pair.of(jm.d, (Function<alp, oh>)$$0 -> oh.a().a(oi.c, $$0).a(oi.b, oi.a.c).a(oi.d, true)),
      Pair.of(jm.e, (Function<alp, oh>)$$0 -> oh.a().a(oi.c, $$0).a(oi.b, oi.a.d).a(oi.d, true)),
      Pair.of(jm.b, (Function<alp, oh>)$$0 -> oh.a().a(oi.c, $$0).a(oi.a, oi.a.d).a(oi.d, true)),
      Pair.of(jm.a, (Function<alp, oh>)$$0 -> oh.a().a(oi.c, $$0).a(oi.a, oi.a.b).a(oi.d, true))
   );
   private static final Map<nx.d, alp> i = new HashMap<>();

   private static ob a(dkd $$0, alp $$1, op $$2, BiConsumer<alp, Supplier<JsonElement>> $$3) {
      alp $$4 = oo.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static ob b(dkd $$0, alp $$1, op $$2, BiConsumer<alp, Supplier<JsonElement>> $$3) {
      alp $$4 = oo.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static ob c(dkd $$0, alp $$1, op $$2, BiConsumer<alp, Supplier<JsonElement>> $$3) {
      alp $$4 = oo.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nx(Consumer<ob> $$0, BiConsumer<alp, Supplier<JsonElement>> $$1, Consumer<cxc> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dkd $$0) {
      this.d.accept($$0.j());
   }

   void a(dkd $$0, alp $$1) {
      this.c.accept(om.a($$0.j()), new ol($$1));
   }

   private void a(cxc $$0, alp $$1) {
      this.c.accept(om.a($$0), new ol($$1));
   }

   void a(cxc $$0) {
      oo.bE.a(om.a($$0), op.b($$0), this.c);
   }

   void d(dkd $$0) {
      cxc $$1 = $$0.j();
      if ($$1 != cxk.a) {
         oo.bE.a(om.a($$1), op.I($$0), this.c);
      }
   }

   void a(dkd $$0, String $$1) {
      cxc $$2 = $$0.j();
      alp $$3 = op.J($$0);
      alp $$4 = op.a($$0, $$1);
      if ($$2 != cxk.a) {
         oo.bI.a(om.a($$2), op.c($$3, $$4), this.c);
      }
   }

   private void b(dkd $$0, String $$1) {
      cxc $$2 = $$0.j();
      oo.bE.a(om.a($$2), op.k(op.a($$0, $$1)), this.c);
   }

   private static of b() {
      return of.a(dye.U).a(jm.f, oh.a().a(oi.b, oi.a.b)).a(jm.d, oh.a().a(oi.b, oi.a.c)).a(jm.e, oh.a().a(oi.b, oi.a.d)).a(jm.c, oh.a());
   }

   private static of c() {
      return of.a(dye.U).a(jm.d, oh.a()).a(jm.e, oh.a().a(oi.b, oi.a.b)).a(jm.c, oh.a().a(oi.b, oi.a.c)).a(jm.f, oh.a().a(oi.b, oi.a.d));
   }

   private static of d() {
      return of.a(dye.U).a(jm.f, oh.a()).a(jm.d, oh.a().a(oi.b, oi.a.b)).a(jm.e, oh.a().a(oi.b, oi.a.c)).a(jm.c, oh.a().a(oi.b, oi.a.d));
   }

   private static of e() {
      return of.a(dye.S)
         .a(jm.a, oh.a().a(oi.a, oi.a.b))
         .a(jm.b, oh.a().a(oi.a, oi.a.d))
         .a(jm.c, oh.a())
         .a(jm.d, oh.a().a(oi.b, oi.a.c))
         .a(jm.e, oh.a().a(oi.b, oi.a.d))
         .a(jm.f, oh.a().a(oi.b, oi.a.b));
   }

   private static oe b(dkd $$0, alp $$1) {
      return oe.a($$0, a($$1));
   }

   private static oh[] a(alp $$0) {
      return new oh[]{oh.a().a(oi.c, $$0), oh.a().a(oi.c, $$0).a(oi.b, oi.a.b), oh.a().a(oi.c, $$0).a(oi.b, oi.a.c), oh.a().a(oi.c, $$0).a(oi.b, oi.a.d)};
   }

   private static oe a(dkd $$0, alp $$1, alp $$2) {
      return oe.a($$0, oh.a().a(oi.c, $$1), oh.a().a(oi.c, $$2), oh.a().a(oi.c, $$1).a(oi.b, oi.a.c), oh.a().a(oi.c, $$2).a(oi.b, oi.a.c));
   }

   private static of a(dyf $$0, alp $$1, alp $$2) {
      return of.a($$0).a(true, oh.a().a(oi.c, $$1)).a(false, oh.a().a(oi.c, $$2));
   }

   private void e(dkd $$0) {
      alp $$1 = or.a.create($$0, this.c);
      alp $$2 = or.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dkd $$0) {
      alp $$1 = or.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dkd $$0) {
      this.b.accept(oe.a($$0).a(of.a(dye.by).a($$1 -> {
         String $$2 = "_" + $$1;
         alp $$3 = op.a($$0, $$2);
         return oh.a().a(oi.c, oo.c.a($$0, $$2, new op().a(oq.a, $$3), this.c));
      })));
      this.a($$0, op.a($$0, "_0"));
   }

   static ob b(dkd $$0, alp $$1, alp $$2) {
      return oe.a($$0)
         .a(of.a(dye.B).a(false, oh.a().a(oi.c, $$1)).a(true, oh.a().a(oi.c, $$2)))
         .a(
            of.a(dye.X, dye.U)
               .a(dxz.a, jm.f, oh.a().a(oi.b, oi.a.b))
               .a(dxz.a, jm.e, oh.a().a(oi.b, oi.a.d))
               .a(dxz.a, jm.d, oh.a().a(oi.b, oi.a.c))
               .a(dxz.a, jm.c, oh.a())
               .a(dxz.b, jm.f, oh.a().a(oi.b, oi.a.b).a(oi.a, oi.a.b).a(oi.d, true))
               .a(dxz.b, jm.e, oh.a().a(oi.b, oi.a.d).a(oi.a, oi.a.b).a(oi.d, true))
               .a(dxz.b, jm.d, oh.a().a(oi.b, oi.a.c).a(oi.a, oi.a.b).a(oi.d, true))
               .a(dxz.b, jm.c, oh.a().a(oi.a, oi.a.b).a(oi.d, true))
               .a(dxz.c, jm.f, oh.a().a(oi.b, oi.a.d).a(oi.a, oi.a.c))
               .a(dxz.c, jm.e, oh.a().a(oi.b, oi.a.b).a(oi.a, oi.a.c))
               .a(dxz.c, jm.d, oh.a().a(oi.a, oi.a.c))
               .a(dxz.c, jm.c, oh.a().a(oi.b, oi.a.c).a(oi.a, oi.a.c))
         );
   }

   private static of.d<jm, dyj, dyi, Boolean> a(of.d<jm, dyj, dyi, Boolean> $$0, dyj $$1, alp $$2, alp $$3, alp $$4, alp $$5) {
      return $$0.a(jm.f, $$1, dyi.a, false, oh.a().a(oi.c, $$2))
         .a(jm.d, $$1, dyi.a, false, oh.a().a(oi.c, $$2).a(oi.b, oi.a.b))
         .a(jm.e, $$1, dyi.a, false, oh.a().a(oi.c, $$2).a(oi.b, oi.a.c))
         .a(jm.c, $$1, dyi.a, false, oh.a().a(oi.c, $$2).a(oi.b, oi.a.d))
         .a(jm.f, $$1, dyi.b, false, oh.a().a(oi.c, $$4))
         .a(jm.d, $$1, dyi.b, false, oh.a().a(oi.c, $$4).a(oi.b, oi.a.b))
         .a(jm.e, $$1, dyi.b, false, oh.a().a(oi.c, $$4).a(oi.b, oi.a.c))
         .a(jm.c, $$1, dyi.b, false, oh.a().a(oi.c, $$4).a(oi.b, oi.a.d))
         .a(jm.f, $$1, dyi.a, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.b))
         .a(jm.d, $$1, dyi.a, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.c))
         .a(jm.e, $$1, dyi.a, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.d))
         .a(jm.c, $$1, dyi.a, true, oh.a().a(oi.c, $$3))
         .a(jm.f, $$1, dyi.b, true, oh.a().a(oi.c, $$5).a(oi.b, oi.a.d))
         .a(jm.d, $$1, dyi.b, true, oh.a().a(oi.c, $$5))
         .a(jm.e, $$1, dyi.b, true, oh.a().a(oi.c, $$5).a(oi.b, oi.a.b))
         .a(jm.c, $$1, dyi.b, true, oh.a().a(oi.c, $$5).a(oi.b, oi.a.c));
   }

   private static ob a(dkd $$0, alp $$1, alp $$2, alp $$3, alp $$4, alp $$5, alp $$6, alp $$7, alp $$8) {
      return oe.a($$0).a(a(a(of.a(dye.U, dye.ah, dye.bh, dye.z), dyj.b, $$1, $$2, $$3, $$4), dyj.a, $$5, $$6, $$7, $$8));
   }

   static ob a(dkd $$0, alp $$1, alp $$2, alp $$3, alp $$4, alp $$5) {
      return od.a($$0)
         .a(oh.a().a(oi.c, $$1))
         .a(oc.a().a(dye.O, true), oh.a().a(oi.c, $$2).a(oi.d, false))
         .a(oc.a().a(dye.P, true), oh.a().a(oi.c, $$3).a(oi.d, false))
         .a(oc.a().a(dye.Q, true), oh.a().a(oi.c, $$4).a(oi.d, false))
         .a(oc.a().a(dye.R, true), oh.a().a(oi.c, $$5).a(oi.d, false));
   }

   static ob c(dkd $$0, alp $$1, alp $$2) {
      return od.a($$0)
         .a(oh.a().a(oi.c, $$1))
         .a(oc.a().a(dye.O, true), oh.a().a(oi.c, $$2).a(oi.d, true))
         .a(oc.a().a(dye.P, true), oh.a().a(oi.c, $$2).a(oi.b, oi.a.b).a(oi.d, true))
         .a(oc.a().a(dye.Q, true), oh.a().a(oi.c, $$2).a(oi.b, oi.a.c).a(oi.d, true))
         .a(oc.a().a(dye.R, true), oh.a().a(oi.c, $$2).a(oi.b, oi.a.d).a(oi.d, true));
   }

   static ob a(dkd $$0, alp $$1, alp $$2, alp $$3) {
      return od.a($$0)
         .a(oc.a().a(dye.M, true), oh.a().a(oi.c, $$1))
         .a(oc.a().a(dye.aa, dyz.b), oh.a().a(oi.c, $$2).a(oi.d, true))
         .a(oc.a().a(dye.Z, dyz.b), oh.a().a(oi.c, $$2).a(oi.b, oi.a.b).a(oi.d, true))
         .a(oc.a().a(dye.ab, dyz.b), oh.a().a(oi.c, $$2).a(oi.b, oi.a.c).a(oi.d, true))
         .a(oc.a().a(dye.ac, dyz.b), oh.a().a(oi.c, $$2).a(oi.b, oi.a.d).a(oi.d, true))
         .a(oc.a().a(dye.aa, dyz.c), oh.a().a(oi.c, $$3).a(oi.d, true))
         .a(oc.a().a(dye.Z, dyz.c), oh.a().a(oi.c, $$3).a(oi.b, oi.a.b).a(oi.d, true))
         .a(oc.a().a(dye.ab, dyz.c), oh.a().a(oi.c, $$3).a(oi.b, oi.a.c).a(oi.d, true))
         .a(oc.a().a(dye.ac, dyz.c), oh.a().a(oi.c, $$3).a(oi.b, oi.a.d).a(oi.d, true));
   }

   static ob a(dkd $$0, alp $$1, alp $$2, alp $$3, alp $$4, boolean $$5) {
      return oe.a($$0, oh.a().a(oi.d, $$5))
         .a(c())
         .a(
            of.a(dye.u, dye.z)
               .a(false, false, oh.a().a(oi.c, $$2))
               .a(true, false, oh.a().a(oi.c, $$4))
               .a(false, true, oh.a().a(oi.c, $$1))
               .a(true, true, oh.a().a(oi.c, $$3))
         );
   }

   static ob b(dkd $$0, alp $$1, alp $$2, alp $$3) {
      return oe.a($$0)
         .a(
            of.a(dye.U, dye.ai, dye.bl)
               .a(jm.f, dym.b, dyw.a, oh.a().a(oi.c, $$2))
               .a(jm.e, dym.b, dyw.a, oh.a().a(oi.c, $$2).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.d, dym.b, dyw.a, oh.a().a(oi.c, $$2).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.c, dym.b, dyw.a, oh.a().a(oi.c, $$2).a(oi.b, oi.a.d).a(oi.d, true))
               .a(jm.f, dym.b, dyw.e, oh.a().a(oi.c, $$3))
               .a(jm.e, dym.b, dyw.e, oh.a().a(oi.c, $$3).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.d, dym.b, dyw.e, oh.a().a(oi.c, $$3).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.c, dym.b, dyw.e, oh.a().a(oi.c, $$3).a(oi.b, oi.a.d).a(oi.d, true))
               .a(jm.f, dym.b, dyw.d, oh.a().a(oi.c, $$3).a(oi.b, oi.a.d).a(oi.d, true))
               .a(jm.e, dym.b, dyw.d, oh.a().a(oi.c, $$3).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.d, dym.b, dyw.d, oh.a().a(oi.c, $$3))
               .a(jm.c, dym.b, dyw.d, oh.a().a(oi.c, $$3).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.f, dym.b, dyw.c, oh.a().a(oi.c, $$1))
               .a(jm.e, dym.b, dyw.c, oh.a().a(oi.c, $$1).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.d, dym.b, dyw.c, oh.a().a(oi.c, $$1).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.c, dym.b, dyw.c, oh.a().a(oi.c, $$1).a(oi.b, oi.a.d).a(oi.d, true))
               .a(jm.f, dym.b, dyw.b, oh.a().a(oi.c, $$1).a(oi.b, oi.a.d).a(oi.d, true))
               .a(jm.e, dym.b, dyw.b, oh.a().a(oi.c, $$1).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.d, dym.b, dyw.b, oh.a().a(oi.c, $$1))
               .a(jm.c, dym.b, dyw.b, oh.a().a(oi.c, $$1).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.f, dym.a, dyw.a, oh.a().a(oi.c, $$2).a(oi.a, oi.a.c).a(oi.d, true))
               .a(jm.e, dym.a, dyw.a, oh.a().a(oi.c, $$2).a(oi.a, oi.a.c).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.d, dym.a, dyw.a, oh.a().a(oi.c, $$2).a(oi.a, oi.a.c).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.c, dym.a, dyw.a, oh.a().a(oi.c, $$2).a(oi.a, oi.a.c).a(oi.b, oi.a.d).a(oi.d, true))
               .a(jm.f, dym.a, dyw.e, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.e, dym.a, dyw.e, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.d).a(oi.d, true))
               .a(jm.d, dym.a, dyw.e, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.c, dym.a, dyw.e, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.d, true))
               .a(jm.f, dym.a, dyw.d, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.d, true))
               .a(jm.e, dym.a, dyw.d, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.d, dym.a, dyw.d, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.c, dym.a, dyw.d, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.d).a(oi.d, true))
               .a(jm.f, dym.a, dyw.c, oh.a().a(oi.c, $$1).a(oi.a, oi.a.c).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.e, dym.a, dyw.c, oh.a().a(oi.c, $$1).a(oi.a, oi.a.c).a(oi.b, oi.a.d).a(oi.d, true))
               .a(jm.d, dym.a, dyw.c, oh.a().a(oi.c, $$1).a(oi.a, oi.a.c).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.c, dym.a, dyw.c, oh.a().a(oi.c, $$1).a(oi.a, oi.a.c).a(oi.d, true))
               .a(jm.f, dym.a, dyw.b, oh.a().a(oi.c, $$1).a(oi.a, oi.a.c).a(oi.d, true))
               .a(jm.e, dym.a, dyw.b, oh.a().a(oi.c, $$1).a(oi.a, oi.a.c).a(oi.b, oi.a.c).a(oi.d, true))
               .a(jm.d, dym.a, dyw.b, oh.a().a(oi.c, $$1).a(oi.a, oi.a.c).a(oi.b, oi.a.b).a(oi.d, true))
               .a(jm.c, dym.a, dyw.b, oh.a().a(oi.c, $$1).a(oi.a, oi.a.c).a(oi.b, oi.a.d).a(oi.d, true))
         );
   }

   private static ob c(dkd $$0, alp $$1, alp $$2, alp $$3) {
      return oe.a($$0)
         .a(
            of.a(dye.U, dye.ai, dye.z)
               .a(jm.c, dym.b, false, oh.a().a(oi.c, $$2))
               .a(jm.d, dym.b, false, oh.a().a(oi.c, $$2).a(oi.b, oi.a.c))
               .a(jm.f, dym.b, false, oh.a().a(oi.c, $$2).a(oi.b, oi.a.b))
               .a(jm.e, dym.b, false, oh.a().a(oi.c, $$2).a(oi.b, oi.a.d))
               .a(jm.c, dym.a, false, oh.a().a(oi.c, $$1))
               .a(jm.d, dym.a, false, oh.a().a(oi.c, $$1).a(oi.b, oi.a.c))
               .a(jm.f, dym.a, false, oh.a().a(oi.c, $$1).a(oi.b, oi.a.b))
               .a(jm.e, dym.a, false, oh.a().a(oi.c, $$1).a(oi.b, oi.a.d))
               .a(jm.c, dym.b, true, oh.a().a(oi.c, $$3))
               .a(jm.d, dym.b, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.c))
               .a(jm.f, dym.b, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.b))
               .a(jm.e, dym.b, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.d))
               .a(jm.c, dym.a, true, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.c))
               .a(jm.d, dym.a, true, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.a))
               .a(jm.f, dym.a, true, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.d))
               .a(jm.e, dym.a, true, oh.a().a(oi.c, $$3).a(oi.a, oi.a.c).a(oi.b, oi.a.b))
         );
   }

   private static ob d(dkd $$0, alp $$1, alp $$2, alp $$3) {
      return oe.a($$0)
         .a(
            of.a(dye.U, dye.ai, dye.z)
               .a(jm.c, dym.b, false, oh.a().a(oi.c, $$2))
               .a(jm.d, dym.b, false, oh.a().a(oi.c, $$2))
               .a(jm.f, dym.b, false, oh.a().a(oi.c, $$2))
               .a(jm.e, dym.b, false, oh.a().a(oi.c, $$2))
               .a(jm.c, dym.a, false, oh.a().a(oi.c, $$1))
               .a(jm.d, dym.a, false, oh.a().a(oi.c, $$1))
               .a(jm.f, dym.a, false, oh.a().a(oi.c, $$1))
               .a(jm.e, dym.a, false, oh.a().a(oi.c, $$1))
               .a(jm.c, dym.b, true, oh.a().a(oi.c, $$3))
               .a(jm.d, dym.b, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.c))
               .a(jm.f, dym.b, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.b))
               .a(jm.e, dym.b, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.d))
               .a(jm.c, dym.a, true, oh.a().a(oi.c, $$3))
               .a(jm.d, dym.a, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.c))
               .a(jm.f, dym.a, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.b))
               .a(jm.e, dym.a, true, oh.a().a(oi.c, $$3).a(oi.b, oi.a.d))
         );
   }

   static oe c(dkd $$0, alp $$1) {
      return oe.a($$0, oh.a().a(oi.c, $$1));
   }

   private static of f() {
      return of.a(dye.L).a(jm.a.b, oh.a()).a(jm.a.c, oh.a().a(oi.a, oi.a.b)).a(jm.a.a, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.b));
   }

   static ob a(dkd $$0, op $$1, BiConsumer<alp, Supplier<JsonElement>> $$2) {
      alp $$3 = oo.g.a($$0, $$1, $$2);
      alp $$4 = oo.h.a($$0, $$1, $$2);
      alp $$5 = oo.i.a($$0, $$1, $$2);
      alp $$6 = oo.j.a($$0, $$1, $$2);
      return oe.a($$0, oh.a().a(oi.c, $$6)).a(of.a(dye.L).a(jm.a.a, oh.a().a(oi.c, $$3)).a(jm.a.b, oh.a().a(oi.c, $$4)).a(jm.a.c, oh.a().a(oi.c, $$5)));
   }

   static ob d(dkd $$0, alp $$1) {
      return oe.a($$0, oh.a().a(oi.c, $$1)).a(f());
   }

   private void e(dkd $$0, alp $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dkd $$0, or.a $$1) {
      alp $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dkd $$0, or.a $$1) {
      alp $$2 = $$1.create($$0, this.c);
      this.b.accept(oe.a($$0, oh.a().a(oi.c, $$2)).a(b()));
   }

   static ob d(dkd $$0, alp $$1, alp $$2) {
      return oe.a($$0)
         .a(
            of.a(dye.L)
               .a(jm.a.b, oh.a().a(oi.c, $$1))
               .a(jm.a.c, oh.a().a(oi.c, $$2).a(oi.a, oi.a.b))
               .a(jm.a.a, oh.a().a(oi.c, $$2).a(oi.a, oi.a.b).a(oi.b, oi.a.b))
         );
   }

   private void a(dkd $$0, or.a $$1, or.a $$2) {
      alp $$3 = $$1.create($$0, this.c);
      alp $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void h(dkd $$0) {
      Function<or.a, alp> $$1 = $$1x -> $$1x.updateTexture($$1xx -> $$1xx.a(oq.i, op.a($$0, "_active")))
            .updateTexture($$1xx -> $$1xx.a(oq.d, op.a($$0, "_top_active")))
            .createWithSuffix($$0, "_active", this.c);
      alp $$2 = or.x.create($$0, this.c);
      alp $$3 = or.y.create($$0, this.c);
      alp $$4 = $$1.apply(or.x);
      alp $$5 = $$1.apply(or.y);
      this.b
         .accept(
            oe.a($$0)
               .a(
                  of.a(dye.L, dly.c)
                     .a(jm.a.b, false, oh.a().a(oi.c, $$2))
                     .a(jm.a.c, false, oh.a().a(oi.c, $$3).a(oi.a, oi.a.b))
                     .a(jm.a.a, false, oh.a().a(oi.c, $$3).a(oi.a, oi.a.b).a(oi.b, oi.a.b))
                     .a(jm.a.b, true, oh.a().a(oi.c, $$4))
                     .a(jm.a.c, true, oh.a().a(oi.c, $$5).a(oi.a, oi.a.b))
                     .a(jm.a.a, true, oh.a().a(oi.c, $$5).a(oi.a, oi.a.b).a(oi.b, oi.a.b))
               )
         );
   }

   private alp a(dkd $$0, String $$1, on $$2, Function<alp, op> $$3) {
      return $$2.a($$0, $$1, $$3.apply(op.a($$0, $$1)), this.c);
   }

   static ob e(dkd $$0, alp $$1, alp $$2) {
      return oe.a($$0).a(a(dye.B, $$2, $$1));
   }

   static ob e(dkd $$0, alp $$1, alp $$2, alp $$3) {
      return oe.a($$0).a(of.a(dye.bk).a(dyv.b, oh.a().a(oi.c, $$1)).a(dyv.a, oh.a().a(oi.c, $$2)).a(dyv.c, oh.a().a(oi.c, $$3)));
   }

   public void a(dkd $$0) {
      this.b($$0, or.a);
   }

   public void b(dkd $$0, or.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dkd $$0, op $$1, on $$2) {
      alp $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nx.b i(dkd $$0) {
      or $$1 = this.g.getOrDefault($$0, or.a.get($$0));
      return new nx.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dkd $$0, dkd $$1, dkd $$2) {
      op $$3 = op.x($$0);
      alp $$4 = oo.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void j(dkd $$0) {
      op $$1 = op.w($$0);
      alp $$2 = oo.v.a($$0, $$1, this.c);
      alp $$3 = oo.w.a($$0, $$1, this.c);
      alp $$4 = oo.x.a($$0, $$1, this.c);
      alp $$5 = oo.y.a($$0, $$1, this.c);
      alp $$6 = oo.z.a($$0, $$1, this.c);
      alp $$7 = oo.A.a($$0, $$1, this.c);
      alp $$8 = oo.B.a($$0, $$1, this.c);
      alp $$9 = oo.C.a($$0, $$1, this.c);
      this.a($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dkd $$0, dkd $$1) {
      alp $$2 = oo.v.a($$0);
      alp $$3 = oo.w.a($$0);
      alp $$4 = oo.x.a($$0);
      alp $$5 = oo.y.a($$0);
      alp $$6 = oo.z.a($$0);
      alp $$7 = oo.A.a($$0);
      alp $$8 = oo.B.a($$0);
      alp $$9 = oo.C.a($$0);
      this.a($$1, om.a($$0.j()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dkd $$0) {
      op $$1 = op.b($$0);
      alp $$2 = oo.ak.a($$0, $$1, this.c);
      alp $$3 = oo.al.a($$0, $$1, this.c);
      alp $$4 = oo.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(dkd $$0) {
      op $$1 = op.b($$0);
      alp $$2 = oo.ah.a($$0, $$1, this.c);
      alp $$3 = oo.ai.a($$0, $$1, this.c);
      alp $$4 = oo.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dkd $$0, dkd $$1) {
      alp $$2 = oo.ah.a($$0);
      alp $$3 = oo.ai.a($$0);
      alp $$4 = oo.aj.a($$0);
      this.a($$1, om.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dkf.tf);
      alp $$0 = om.a(dkf.tf);
      alp $$1 = om.a(dkf.tf, "_partial_tilt");
      alp $$2 = om.a(dkf.tf, "_full_tilt");
      this.b
         .accept(
            oe.a(dkf.tf)
               .a(b())
               .a(of.a(dye.bo).a(dyy.a, oh.a().a(oi.c, $$0)).a(dyy.b, oh.a().a(oi.c, $$0)).a(dyy.c, oh.a().a(oi.c, $$1)).a(dyy.d, oh.a().a(oi.c, $$2)))
         );
   }

   private nx.f m(dkd $$0) {
      return new nx.f(op.q($$0));
   }

   private void n(dkd $$0) {
      this.c($$0, $$0);
   }

   private void c(dkd $$0, dkd $$1) {
      this.b.accept(c($$0, om.a($$1)));
   }

   private void a(dkd $$0, nx.e $$1) {
      $$1.a(this, $$0);
      this.b($$0, $$1);
   }

   private void a(dkd $$0, nx.e $$1, op $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dkd $$0, nx.e $$1) {
      op $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dkd $$0, nx.e $$1, op $$2) {
      alp $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dkd $$0, nx.e $$1, dyq<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         of $$4 = of.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            op $$5 = op.c(op.a($$0, $$4x));
            alp $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return oh.a().a(oi.c, $$6);
         });
         this.a($$0.j());
         this.b.accept(oe.a($$0).a($$4));
      }
   }

   private void a(dkd $$0, dkd $$1, nx.e $$2) {
      this.a($$0, $$2);
      op $$3 = $$2.b($$0);
      alp $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dkd $$0, dkd $$1) {
      or $$2 = or.q.get($$0);
      alp $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alp $$4 = oo.aF.a($$1, $$2.b(), this.c);
      this.b.accept(oe.a($$1, oh.a().a(oi.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dkd $$0, dkd $$1) {
      this.a($$0.j());
      op $$2 = op.k($$0);
      op $$3 = op.a($$0, $$1);
      alp $$4 = oo.aX.a($$1, $$3, this.c);
      this.b
         .accept(
            oe.a($$1, oh.a().a(oi.c, $$4))
               .a(of.a(dye.U).a(jm.e, oh.a()).a(jm.d, oh.a().a(oi.b, oi.a.d)).a(jm.c, oh.a().a(oi.b, oi.a.b)).a(jm.f, oh.a().a(oi.b, oi.a.c)))
         );
      this.b.accept(oe.a($$0).a(of.a(dye.ay).a($$2x -> oh.a().a(oi.c, oo.aW[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dkd $$0 = dkf.le;
      this.a($$0.j());
      alp $$1 = om.a($$0, "_top");
      alp $$2 = om.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dkd $$0 = dkf.ld;
      this.a($$0.j());
      of $$1 = of.a(dpw.d, dye.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oh.a().a(oi.c, om.a($$0, "_top_stage_" + $$1x));
            case b -> oh.a().a(oi.c, om.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(oe.a($$0).a($$1));
   }

   private void a(dkd $$0, dkd $$1, dkd $$2, dkd $$3, dkd $$4, dkd $$5, dkd $$6, dkd $$7) {
      this.a($$0, nx.e.b);
      this.a($$1, nx.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dkd $$0, nx.e $$1) {
      this.b($$0, "_top");
      alp $$2 = this.a($$0, "_top", $$1.a(), op::c);
      alp $$3 = this.a($$0, "_bottom", $$1.a(), op::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.b(dkf.jb, "_front");
      alp $$0 = om.a(dkf.jb, "_top");
      alp $$1 = this.a(dkf.jb, "_bottom", nx.e.b.a(), op::c);
      this.f(dkf.jb, $$0, $$1);
   }

   private void k() {
      alp $$0 = this.a(dkf.bE, "_top", oo.br, op::a);
      alp $$1 = this.a(dkf.bE, "_bottom", oo.br, op::a);
      this.f(dkf.bE, $$0, $$1);
   }

   private void l() {
      this.c(dkf.th);
      alp $$0 = om.a(dkf.th, "_top");
      alp $$1 = om.a(dkf.th, "_bottom");
      this.b.accept(oe.a(dkf.th).a(b()).a(of.a(dye.ah).a(dyj.b, oh.a().a(oi.c, $$1)).a(dyj.a, oh.a().a(oi.c, $$0))));
   }

   private void f(dkd $$0, alp $$1, alp $$2) {
      this.b.accept(oe.a($$0).a(of.a(dye.ah).a(dyj.b, oh.a().a(oi.c, $$2)).a(dyj.a, oh.a().a(oi.c, $$1))));
   }

   private void o(dkd $$0) {
      op $$1 = op.h($$0);
      op $$2 = op.e(op.a($$0, "_corner"));
      alp $$3 = oo.au.a($$0, $$1, this.c);
      alp $$4 = oo.av.a($$0, $$2, this.c);
      alp $$5 = oo.aw.a($$0, $$1, this.c);
      alp $$6 = oo.ax.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            oe.a($$0)
               .a(
                  of.a(dye.aj)
                     .a(dyr.a, oh.a().a(oi.c, $$3))
                     .a(dyr.b, oh.a().a(oi.c, $$3).a(oi.b, oi.a.b))
                     .a(dyr.c, oh.a().a(oi.c, $$5).a(oi.b, oi.a.b))
                     .a(dyr.d, oh.a().a(oi.c, $$6).a(oi.b, oi.a.b))
                     .a(dyr.e, oh.a().a(oi.c, $$5))
                     .a(dyr.f, oh.a().a(oi.c, $$6))
                     .a(dyr.g, oh.a().a(oi.c, $$4))
                     .a(dyr.h, oh.a().a(oi.c, $$4).a(oi.b, oi.a.b))
                     .a(dyr.i, oh.a().a(oi.c, $$4).a(oi.b, oi.a.c))
                     .a(dyr.j, oh.a().a(oi.c, $$4).a(oi.b, oi.a.d))
               )
         );
   }

   private void p(dkd $$0) {
      alp $$1 = this.a($$0, "", oo.au, op::e);
      alp $$2 = this.a($$0, "", oo.aw, op::e);
      alp $$3 = this.a($$0, "", oo.ax, op::e);
      alp $$4 = this.a($$0, "_on", oo.au, op::e);
      alp $$5 = this.a($$0, "_on", oo.aw, op::e);
      alp $$6 = this.a($$0, "_on", oo.ax, op::e);
      of $$7 = of.a(dye.B, dye.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return oh.a().a(oi.c, $$6x ? $$4 : $$1);
            case b:
               return oh.a().a(oi.c, $$6x ? $$4 : $$1).a(oi.b, oi.a.b);
            case c:
               return oh.a().a(oi.c, $$6x ? $$5 : $$2).a(oi.b, oi.a.b);
            case d:
               return oh.a().a(oi.c, $$6x ? $$6 : $$3).a(oi.b, oi.a.b);
            case e:
               return oh.a().a(oi.c, $$6x ? $$5 : $$2);
            case f:
               return oh.a().a(oi.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(oe.a($$0).a($$7));
   }

   private nx.a a(alp $$0, dkd $$1) {
      return new nx.a($$0, $$1);
   }

   private nx.a f(dkd $$0, dkd $$1) {
      return new nx.a(om.a($$0), $$1);
   }

   private void a(dkd $$0, cxc $$1) {
      alp $$2 = oo.aa.a($$0, op.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dkd $$0, alp $$1) {
      alp $$2 = oo.aa.a($$0, op.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dkd $$0, dkd $$1) {
      this.a($$0);
      alp $$2 = or.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void q(dkd $$0) {
      this.a($$0.j());
      alp $$1 = or.l.create($$0, this.c);
      alp $$2 = or.m.create($$0, this.c);
      alp $$3 = or.n.create($$0, this.c);
      alp $$4 = or.o.create($$0, this.c);
      this.b
         .accept(
            od.a($$0)
               .a(oc.a().a(dye.V, 1, 2, 3, 4).a(dye.U, jm.c), oh.a().a(oi.c, $$1))
               .a(oc.a().a(dye.V, 1, 2, 3, 4).a(dye.U, jm.f), oh.a().a(oi.c, $$1).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.V, 1, 2, 3, 4).a(dye.U, jm.d), oh.a().a(oi.c, $$1).a(oi.b, oi.a.c))
               .a(oc.a().a(dye.V, 1, 2, 3, 4).a(dye.U, jm.e), oh.a().a(oi.c, $$1).a(oi.b, oi.a.d))
               .a(oc.a().a(dye.V, 2, 3, 4).a(dye.U, jm.c), oh.a().a(oi.c, $$2))
               .a(oc.a().a(dye.V, 2, 3, 4).a(dye.U, jm.f), oh.a().a(oi.c, $$2).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.V, 2, 3, 4).a(dye.U, jm.d), oh.a().a(oi.c, $$2).a(oi.b, oi.a.c))
               .a(oc.a().a(dye.V, 2, 3, 4).a(dye.U, jm.e), oh.a().a(oi.c, $$2).a(oi.b, oi.a.d))
               .a(oc.a().a(dye.V, 3, 4).a(dye.U, jm.c), oh.a().a(oi.c, $$3))
               .a(oc.a().a(dye.V, 3, 4).a(dye.U, jm.f), oh.a().a(oi.c, $$3).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.V, 3, 4).a(dye.U, jm.d), oh.a().a(oi.c, $$3).a(oi.b, oi.a.c))
               .a(oc.a().a(dye.V, 3, 4).a(dye.U, jm.e), oh.a().a(oi.c, $$3).a(oi.b, oi.a.d))
               .a(oc.a().a(dye.V, 4).a(dye.U, jm.c), oh.a().a(oi.c, $$4))
               .a(oc.a().a(dye.V, 4).a(dye.U, jm.f), oh.a().a(oi.c, $$4).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.V, 4).a(dye.U, jm.d), oh.a().a(oi.c, $$4).a(oi.b, oi.a.c))
               .a(oc.a().a(dye.V, 4).a(dye.U, jm.e), oh.a().a(oi.c, $$4).a(oi.b, oi.a.d))
         );
   }

   private void a(or.a $$0, dkd... $$1) {
      for (dkd $$2 : $$1) {
         alp $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(or.a $$0, dkd... $$1) {
      for (dkd $$2 : $$1) {
         alp $$3 = $$0.create($$2, this.c);
         this.b.accept(oe.a($$2, oh.a().a(oi.c, $$3)).a(c()));
      }
   }

   private void h(dkd $$0, dkd $$1) {
      this.a($$0);
      op $$2 = op.b($$0, $$1);
      alp $$3 = oo.aL.a($$1, $$2, this.c);
      alp $$4 = oo.aM.a($$1, $$2, this.c);
      alp $$5 = oo.aN.a($$1, $$2, this.c);
      alp $$6 = oo.aJ.a($$1, $$2, this.c);
      alp $$7 = oo.aK.a($$1, $$2, this.c);
      cxc $$8 = $$1.j();
      oo.bE.a(om.a($$8), op.I($$0), this.c);
      this.b
         .accept(
            od.a($$1)
               .a(oh.a().a(oi.c, $$3))
               .a(oc.a().a(dye.O, true), oh.a().a(oi.c, $$4))
               .a(oc.a().a(dye.P, true), oh.a().a(oi.c, $$4).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.Q, true), oh.a().a(oi.c, $$5))
               .a(oc.a().a(dye.R, true), oh.a().a(oi.c, $$5).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.O, false), oh.a().a(oi.c, $$6))
               .a(oc.a().a(dye.P, false), oh.a().a(oi.c, $$7))
               .a(oc.a().a(dye.Q, false), oh.a().a(oi.c, $$7).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.R, false), oh.a().a(oi.c, $$6).a(oi.b, oi.a.d))
         );
   }

   private void r(dkd $$0) {
      op $$1 = op.C($$0);
      alp $$2 = oo.aO.a($$0, $$1, this.c);
      alp $$3 = this.a($$0, "_conditional", oo.aO, $$1x -> $$1.c(oq.i, $$1x));
      this.b.accept(oe.a($$0).a(a(dye.g, $$3, $$2)).a(e()));
   }

   private void s(dkd $$0) {
      alp $$1 = or.s.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oh> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oh.a().a(oi.c, om.a(dkf.nB, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dkf.nB);
      this.b
         .accept(
            od.a(dkf.nB)
               .a(oc.a().a(dye.at, 0), this.a(0))
               .a(oc.a().a(dye.at, 1), this.a(1))
               .a(oc.a().a(dye.bn, dya.b), oh.a().a(oi.c, om.a(dkf.nB, "_small_leaves")))
               .a(oc.a().a(dye.bn, dya.c), oh.a().a(oi.c, om.a(dkf.nB, "_large_leaves")))
         );
   }

   private of n() {
      return of.a(dye.S)
         .a(jm.a, oh.a().a(oi.a, oi.a.c))
         .a(jm.b, oh.a())
         .a(jm.c, oh.a().a(oi.a, oi.a.b))
         .a(jm.d, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.c))
         .a(jm.e, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.d))
         .a(jm.f, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.b));
   }

   private void o() {
      alp $$0 = op.a(dkf.ow, "_top_open");
      this.b
         .accept(
            oe.a(dkf.ow)
               .a(this.n())
               .a(
                  of.a(dye.z)
                     .a(false, oh.a().a(oi.c, or.f.create(dkf.ow, this.c)))
                     .a(true, oh.a().a(oi.c, or.f.get(dkf.ow).a($$1 -> $$1.a(oq.f, $$0)).a(dkf.ow, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> of a(dyq<T> $$0, T $$1, alp $$2, alp $$3) {
      oh $$4 = oh.a().a(oi.c, $$2);
      oh $$5 = oh.a().a(oi.c, $$3);
      return of.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dkd $$0, Function<dkd, op> $$1) {
      op $$2 = $$1.apply($$0).b(oq.i, oq.c);
      op $$3 = $$2.c(oq.g, op.a($$0, "_front_honey"));
      alp $$4 = oo.q.a($$0, "_empty", $$2, this.c);
      alp $$5 = oo.q.a($$0, "_honey", $$3, this.c);
      this.c($$0);
      oo.q.a(om.a($$0.j(), "_empty"), $$2, this.c);
      oo.q.a(om.a($$0.j(), "_honey"), $$3, this.c);
      this.b.accept(oe.a($$0).a(b()).a(a(dye.aQ, 5, $$5, $$4)));
   }

   private void a(dkd $$0, dyq<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alp> $$3 = new Int2ObjectOpenHashMap();
         of $$4 = of.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alp $$5 = (alp)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, oo.aY, op::g));
            return oh.a().a(oi.c, $$5);
         });
         this.a($$0.j());
         this.b.accept(oe.a($$0).a($$4));
      }
   }

   private void p() {
      alp $$0 = om.a(dkf.oF, "_floor");
      alp $$1 = om.a(dkf.oF, "_ceiling");
      alp $$2 = om.a(dkf.oF, "_wall");
      alp $$3 = om.a(dkf.oF, "_between_walls");
      this.a(cxk.xs);
      this.b
         .accept(
            oe.a(dkf.oF)
               .a(
                  of.a(dye.U, dye.Y)
                     .a(jm.c, dyc.a, oh.a().a(oi.c, $$0))
                     .a(jm.d, dyc.a, oh.a().a(oi.c, $$0).a(oi.b, oi.a.c))
                     .a(jm.f, dyc.a, oh.a().a(oi.c, $$0).a(oi.b, oi.a.b))
                     .a(jm.e, dyc.a, oh.a().a(oi.c, $$0).a(oi.b, oi.a.d))
                     .a(jm.c, dyc.b, oh.a().a(oi.c, $$1))
                     .a(jm.d, dyc.b, oh.a().a(oi.c, $$1).a(oi.b, oi.a.c))
                     .a(jm.f, dyc.b, oh.a().a(oi.c, $$1).a(oi.b, oi.a.b))
                     .a(jm.e, dyc.b, oh.a().a(oi.c, $$1).a(oi.b, oi.a.d))
                     .a(jm.c, dyc.c, oh.a().a(oi.c, $$2).a(oi.b, oi.a.d))
                     .a(jm.d, dyc.c, oh.a().a(oi.c, $$2).a(oi.b, oi.a.b))
                     .a(jm.f, dyc.c, oh.a().a(oi.c, $$2))
                     .a(jm.e, dyc.c, oh.a().a(oi.c, $$2).a(oi.b, oi.a.c))
                     .a(jm.d, dyc.d, oh.a().a(oi.c, $$3).a(oi.b, oi.a.b))
                     .a(jm.c, dyc.d, oh.a().a(oi.c, $$3).a(oi.b, oi.a.d))
                     .a(jm.f, dyc.d, oh.a().a(oi.c, $$3))
                     .a(jm.e, dyc.d, oh.a().a(oi.c, $$3).a(oi.b, oi.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            oe.a(dkf.oB, oh.a().a(oi.c, om.a(dkf.oB)))
               .a(
                  of.a(dye.X, dye.U)
                     .a(dxz.a, jm.c, oh.a())
                     .a(dxz.a, jm.f, oh.a().a(oi.b, oi.a.b))
                     .a(dxz.a, jm.d, oh.a().a(oi.b, oi.a.c))
                     .a(dxz.a, jm.e, oh.a().a(oi.b, oi.a.d))
                     .a(dxz.b, jm.c, oh.a().a(oi.a, oi.a.b))
                     .a(dxz.b, jm.f, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.b))
                     .a(dxz.b, jm.d, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.c))
                     .a(dxz.b, jm.e, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.d))
                     .a(dxz.c, jm.d, oh.a().a(oi.a, oi.a.c))
                     .a(dxz.c, jm.e, oh.a().a(oi.a, oi.a.c).a(oi.b, oi.a.b))
                     .a(dxz.c, jm.c, oh.a().a(oi.a, oi.a.c).a(oi.b, oi.a.c))
                     .a(dxz.c, jm.f, oh.a().a(oi.a, oi.a.c).a(oi.b, oi.a.d))
               )
         );
   }

   private void d(dkd $$0, or.a $$1) {
      alp $$2 = $$1.create($$0, this.c);
      alp $$3 = op.a($$0, "_front_on");
      alp $$4 = $$1.get($$0).a($$1x -> $$1x.a(oq.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(oe.a($$0).a(a(dye.v, $$4, $$2)).a(b()));
   }

   private void a(dkd... $$0) {
      alp $$1 = om.a("campfire_off");

      for (dkd $$2 : $$0) {
         alp $$3 = oo.bf.a($$2, op.H($$2), this.c);
         this.a($$2.j());
         this.b.accept(oe.a($$2).a(a(dye.v, $$3, $$1)).a(c()));
      }
   }

   private void t(dkd $$0) {
      alp $$1 = oo.bA.a($$0, op.o($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void u(dkd $$0) {
      alp $$1;
      if ($$0 == dkf.tL) {
         $$1 = oo.bC.a($$0, op.p($$0), this.c);
      } else {
         $$1 = oo.bB.a($$0, op.p($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      op $$0 = op.a(op.J(dkf.cs), op.J(dkf.n));
      alp $$1 = oo.j.a(dkf.cs, $$0, this.c);
      this.b.accept(c(dkf.cs, $$1));
   }

   private void s() {
      this.a(cxk.me);
      this.b
         .accept(
            od.a(dkf.cE)
               .a(
                  oc.b(
                     oc.a().a(dye.ae, dys.c).a(dye.ad, dys.c).a(dye.af, dys.c).a(dye.ag, dys.c),
                     oc.a().a(dye.ae, dys.b, dys.a).a(dye.ad, dys.b, dys.a),
                     oc.a().a(dye.ad, dys.b, dys.a).a(dye.af, dys.b, dys.a),
                     oc.a().a(dye.af, dys.b, dys.a).a(dye.ag, dys.b, dys.a),
                     oc.a().a(dye.ag, dys.b, dys.a).a(dye.ae, dys.b, dys.a)
                  ),
                  oh.a().a(oi.c, om.a("redstone_dust_dot"))
               )
               .a(oc.a().a(dye.ae, dys.b, dys.a), oh.a().a(oi.c, om.a("redstone_dust_side0")))
               .a(oc.a().a(dye.af, dys.b, dys.a), oh.a().a(oi.c, om.a("redstone_dust_side_alt0")))
               .a(oc.a().a(dye.ad, dys.b, dys.a), oh.a().a(oi.c, om.a("redstone_dust_side_alt1")).a(oi.b, oi.a.d))
               .a(oc.a().a(dye.ag, dys.b, dys.a), oh.a().a(oi.c, om.a("redstone_dust_side1")).a(oi.b, oi.a.d))
               .a(oc.a().a(dye.ae, dys.a), oh.a().a(oi.c, om.a("redstone_dust_up")))
               .a(oc.a().a(dye.ad, dys.a), oh.a().a(oi.c, om.a("redstone_dust_up")).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.af, dys.a), oh.a().a(oi.c, om.a("redstone_dust_up")).a(oi.b, oi.a.c))
               .a(oc.a().a(dye.ag, dys.a), oh.a().a(oi.c, om.a("redstone_dust_up")).a(oi.b, oi.a.d))
         );
   }

   private void t() {
      this.a(cxk.mi);
      this.b
         .accept(
            oe.a(dkf.hv)
               .a(c())
               .a(
                  of.a(dye.bg, dye.B)
                     .a(dyh.a, false, oh.a().a(oi.c, om.a(dkf.hv)))
                     .a(dyh.a, true, oh.a().a(oi.c, om.a(dkf.hv, "_on")))
                     .a(dyh.b, false, oh.a().a(oi.c, om.a(dkf.hv, "_subtract")))
                     .a(dyh.b, true, oh.a().a(oi.c, om.a(dkf.hv, "_on_subtract")))
               )
         );
   }

   private void u() {
      op $$0 = op.a(dkf.kq);
      op $$1 = op.a(op.a(dkf.kd, "_side"), $$0.a(oq.f));
      alp $$2 = oo.ab.a(dkf.kd, $$1, this.c);
      alp $$3 = oo.ac.a(dkf.kd, $$1, this.c);
      alp $$4 = oo.j.b(dkf.kd, "_double", $$1, this.c);
      this.b.accept(e(dkf.kd, $$2, $$3, $$4));
      this.b.accept(c(dkf.kq, oo.c.a(dkf.kq, $$0, this.c)));
   }

   private void v() {
      this.a(cxk.tn);
      this.b
         .accept(
            od.a(dkf.fN)
               .a(oh.a().a(oi.c, op.J(dkf.fN)))
               .a(oc.a().a(dye.o, true), oh.a().a(oi.c, op.a(dkf.fN, "_bottle0")))
               .a(oc.a().a(dye.p, true), oh.a().a(oi.c, op.a(dkf.fN, "_bottle1")))
               .a(oc.a().a(dye.q, true), oh.a().a(oi.c, op.a(dkf.fN, "_bottle2")))
               .a(oc.a().a(dye.o, false), oh.a().a(oi.c, op.a(dkf.fN, "_empty0")))
               .a(oc.a().a(dye.p, false), oh.a().a(oi.c, op.a(dkf.fN, "_empty1")))
               .a(oc.a().a(dye.q, false), oh.a().a(oi.c, op.a(dkf.fN, "_empty2")))
         );
   }

   private void v(dkd $$0) {
      alp $$1 = oo.bw.a($$0, op.b($$0), this.c);
      alp $$2 = om.a("mushroom_block_inside");
      this.b
         .accept(
            od.a($$0)
               .a(oc.a().a(dye.O, true), oh.a().a(oi.c, $$1))
               .a(oc.a().a(dye.P, true), oh.a().a(oi.c, $$1).a(oi.b, oi.a.b).a(oi.d, true))
               .a(oc.a().a(dye.Q, true), oh.a().a(oi.c, $$1).a(oi.b, oi.a.c).a(oi.d, true))
               .a(oc.a().a(dye.R, true), oh.a().a(oi.c, $$1).a(oi.b, oi.a.d).a(oi.d, true))
               .a(oc.a().a(dye.M, true), oh.a().a(oi.c, $$1).a(oi.a, oi.a.d).a(oi.d, true))
               .a(oc.a().a(dye.N, true), oh.a().a(oi.c, $$1).a(oi.a, oi.a.b).a(oi.d, true))
               .a(oc.a().a(dye.O, false), oh.a().a(oi.c, $$2))
               .a(oc.a().a(dye.P, false), oh.a().a(oi.c, $$2).a(oi.b, oi.a.b).a(oi.d, false))
               .a(oc.a().a(dye.Q, false), oh.a().a(oi.c, $$2).a(oi.b, oi.a.c).a(oi.d, false))
               .a(oc.a().a(dye.R, false), oh.a().a(oi.c, $$2).a(oi.b, oi.a.d).a(oi.d, false))
               .a(oc.a().a(dye.M, false), oh.a().a(oi.c, $$2).a(oi.a, oi.a.d).a(oi.d, false))
               .a(oc.a().a(dye.N, false), oh.a().a(oi.c, $$2).a(oi.a, oi.a.b).a(oi.d, false))
         );
      this.a($$0, or.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cxk.sy);
      this.b
         .accept(
            oe.a(dkf.et)
               .a(
                  of.a(dye.aB)
                     .a(0, oh.a().a(oi.c, om.a(dkf.et)))
                     .a(1, oh.a().a(oi.c, om.a(dkf.et, "_slice1")))
                     .a(2, oh.a().a(oi.c, om.a(dkf.et, "_slice2")))
                     .a(3, oh.a().a(oi.c, om.a(dkf.et, "_slice3")))
                     .a(4, oh.a().a(oi.c, om.a(dkf.et, "_slice4")))
                     .a(5, oh.a().a(oi.c, om.a(dkf.et, "_slice5")))
                     .a(6, oh.a().a(oi.c, om.a(dkf.et, "_slice6")))
               )
         );
   }

   private void x() {
      op $$0 = new op()
         .a(oq.c, op.a(dkf.oz, "_side3"))
         .a(oq.o, op.J(dkf.t))
         .a(oq.n, op.a(dkf.oz, "_top"))
         .a(oq.j, op.a(dkf.oz, "_side3"))
         .a(oq.l, op.a(dkf.oz, "_side3"))
         .a(oq.k, op.a(dkf.oz, "_side1"))
         .a(oq.m, op.a(dkf.oz, "_side2"));
      this.b.accept(c(dkf.oz, oo.a.a(dkf.oz, $$0, this.c)));
   }

   private void y() {
      op $$0 = new op()
         .a(oq.c, op.a(dkf.oD, "_front"))
         .a(oq.o, op.a(dkf.oD, "_bottom"))
         .a(oq.n, op.a(dkf.oD, "_top"))
         .a(oq.j, op.a(dkf.oD, "_front"))
         .a(oq.k, op.a(dkf.oD, "_front"))
         .a(oq.l, op.a(dkf.oD, "_side"))
         .a(oq.m, op.a(dkf.oD, "_side"));
      this.b.accept(c(dkf.oD, oo.a.a(dkf.oD, $$0, this.c)));
   }

   private void a(dkd $$0, dkd $$1, BiFunction<dkd, dkd, op> $$2) {
      op $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oo.a.a($$0, $$3, this.c)));
   }

   public void b(dkd $$0) {
      op $$1 = new op()
         .a(oq.c, op.a($$0, "_particle"))
         .a(oq.o, op.a($$0, "_down"))
         .a(oq.n, op.a($$0, "_up"))
         .a(oq.j, op.a($$0, "_north"))
         .a(oq.k, op.a($$0, "_south"))
         .a(oq.l, op.a($$0, "_east"))
         .a(oq.m, op.a($$0, "_west"));
      this.b.accept(c($$0, oo.a.a($$0, $$1, this.c)));
   }

   private void z() {
      op $$0 = op.n(dkf.fn);
      this.b.accept(c(dkf.fn, om.a(dkf.fn)));
      this.a(dkf.er, $$0);
      this.a(dkf.es, $$0);
   }

   private void a(dkd $$0, op $$1) {
      alp $$2 = oo.p.a($$0, $$1.c(oq.g, op.J($$0)), this.c);
      this.b.accept(oe.a($$0, oh.a().a(oi.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cxk.to);
      this.n(dkf.fO);
      this.b.accept(c(dkf.fQ, oo.bz.a(dkf.fQ, op.j(op.a(dkf.K, "_still")), this.c)));
      this.b
         .accept(
            oe.a(dkf.fP)
               .a(
                  of.a(doo.g)
                     .a(1, oh.a().a(oi.c, oo.bx.a(dkf.fP, "_level1", op.j(op.a(dkf.J, "_still")), this.c)))
                     .a(2, oh.a().a(oi.c, oo.by.a(dkf.fP, "_level2", op.j(op.a(dkf.J, "_still")), this.c)))
                     .a(3, oh.a().a(oi.c, oo.bz.a(dkf.fP, "_full", op.j(op.a(dkf.J, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            oe.a(dkf.fR)
               .a(
                  of.a(doo.g)
                     .a(1, oh.a().a(oi.c, oo.bx.a(dkf.fR, "_level1", op.j(op.J(dkf.rr)), this.c)))
                     .a(2, oh.a().a(oi.c, oo.by.a(dkf.fR, "_level2", op.j(op.J(dkf.rr)), this.c)))
                     .a(3, oh.a().a(oi.c, oo.bz.a(dkf.fR, "_full", op.j(op.J(dkf.rr)), this.c)))
               )
         );
   }

   private void B() {
      op $$0 = op.b(dkf.kX);
      alp $$1 = oo.aH.a(dkf.kX, $$0, this.c);
      alp $$2 = this.a(dkf.kX, "_dead", oo.aH, $$1x -> $$0.c(oq.b, $$1x));
      this.b.accept(oe.a(dkf.kX).a(a(dye.ax, 5, $$2, $$1)));
   }

   private void C() {
      alp $$0 = om.a(dkf.tS);
      alp $$1 = om.a(dkf.tS, "_triggered");
      alp $$2 = om.a(dkf.tS, "_crafting");
      alp $$3 = om.a(dkf.tS, "_crafting_triggered");
      this.b
         .accept(
            oe.a(dkf.tS)
               .a(of.a(dye.W).a($$0x -> this.a($$0x, oh.a())))
               .a(
                  of.a(dye.H, dlw.b)
                     .a(false, false, oh.a().a(oi.c, $$0))
                     .a(true, true, oh.a().a(oi.c, $$3))
                     .a(true, false, oh.a().a(oi.c, $$1))
                     .a(false, true, oh.a().a(oi.c, $$2))
               )
         );
   }

   private void w(dkd $$0) {
      op $$1 = new op().a(oq.f, op.a(dkf.cL, "_top")).a(oq.i, op.a(dkf.cL, "_side")).a(oq.g, op.a($$0, "_front"));
      op $$2 = new op().a(oq.i, op.a(dkf.cL, "_top")).a(oq.g, op.a($$0, "_front_vertical"));
      alp $$3 = oo.p.a($$0, $$1, this.c);
      alp $$4 = oo.r.a($$0, $$2, this.c);
      this.b
         .accept(
            oe.a($$0)
               .a(
                  of.a(dye.S)
                     .a(jm.a, oh.a().a(oi.c, $$4).a(oi.a, oi.a.c))
                     .a(jm.b, oh.a().a(oi.c, $$4))
                     .a(jm.c, oh.a().a(oi.c, $$3))
                     .a(jm.f, oh.a().a(oi.c, $$3).a(oi.b, oi.a.b))
                     .a(jm.d, oh.a().a(oi.c, $$3).a(oi.b, oi.a.c))
                     .a(jm.e, oh.a().a(oi.c, $$3).a(oi.b, oi.a.d))
               )
         );
   }

   private void D() {
      alp $$0 = om.a(dkf.fT);
      alp $$1 = om.a(dkf.fT, "_filled");
      this.b.accept(oe.a(dkf.fT).a(of.a(dye.l).a(false, oh.a().a(oi.c, $$0)).a(true, oh.a().a(oi.c, $$1))).a(c()));
   }

   private void E() {
      alp $$0 = om.a(dkf.kW, "_side");
      alp $$1 = om.a(dkf.kW, "_noside");
      alp $$2 = om.a(dkf.kW, "_noside1");
      alp $$3 = om.a(dkf.kW, "_noside2");
      alp $$4 = om.a(dkf.kW, "_noside3");
      this.b
         .accept(
            od.a(dkf.kW)
               .a(oc.a().a(dye.O, true), oh.a().a(oi.c, $$0))
               .a(oc.a().a(dye.P, true), oh.a().a(oi.c, $$0).a(oi.b, oi.a.b).a(oi.d, true))
               .a(oc.a().a(dye.Q, true), oh.a().a(oi.c, $$0).a(oi.b, oi.a.c).a(oi.d, true))
               .a(oc.a().a(dye.R, true), oh.a().a(oi.c, $$0).a(oi.b, oi.a.d).a(oi.d, true))
               .a(oc.a().a(dye.M, true), oh.a().a(oi.c, $$0).a(oi.a, oi.a.d).a(oi.d, true))
               .a(oc.a().a(dye.N, true), oh.a().a(oi.c, $$0).a(oi.a, oi.a.b).a(oi.d, true))
               .a(oc.a().a(dye.O, false), oh.a().a(oi.c, $$1).a(oi.e, 2), oh.a().a(oi.c, $$2), oh.a().a(oi.c, $$3), oh.a().a(oi.c, $$4))
               .a(
                  oc.a().a(dye.P, false),
                  oh.a().a(oi.c, $$2).a(oi.b, oi.a.b).a(oi.d, true),
                  oh.a().a(oi.c, $$3).a(oi.b, oi.a.b).a(oi.d, true),
                  oh.a().a(oi.c, $$4).a(oi.b, oi.a.b).a(oi.d, true),
                  oh.a().a(oi.c, $$1).a(oi.e, 2).a(oi.b, oi.a.b).a(oi.d, true)
               )
               .a(
                  oc.a().a(dye.Q, false),
                  oh.a().a(oi.c, $$3).a(oi.b, oi.a.c).a(oi.d, true),
                  oh.a().a(oi.c, $$4).a(oi.b, oi.a.c).a(oi.d, true),
                  oh.a().a(oi.c, $$1).a(oi.e, 2).a(oi.b, oi.a.c).a(oi.d, true),
                  oh.a().a(oi.c, $$2).a(oi.b, oi.a.c).a(oi.d, true)
               )
               .a(
                  oc.a().a(dye.R, false),
                  oh.a().a(oi.c, $$4).a(oi.b, oi.a.d).a(oi.d, true),
                  oh.a().a(oi.c, $$1).a(oi.e, 2).a(oi.b, oi.a.d).a(oi.d, true),
                  oh.a().a(oi.c, $$2).a(oi.b, oi.a.d).a(oi.d, true),
                  oh.a().a(oi.c, $$3).a(oi.b, oi.a.d).a(oi.d, true)
               )
               .a(
                  oc.a().a(dye.M, false),
                  oh.a().a(oi.c, $$1).a(oi.e, 2).a(oi.a, oi.a.d).a(oi.d, true),
                  oh.a().a(oi.c, $$4).a(oi.a, oi.a.d).a(oi.d, true),
                  oh.a().a(oi.c, $$2).a(oi.a, oi.a.d).a(oi.d, true),
                  oh.a().a(oi.c, $$3).a(oi.a, oi.a.d).a(oi.d, true)
               )
               .a(
                  oc.a().a(dye.N, false),
                  oh.a().a(oi.c, $$4).a(oi.a, oi.a.b).a(oi.d, true),
                  oh.a().a(oi.c, $$3).a(oi.a, oi.a.b).a(oi.d, true),
                  oh.a().a(oi.c, $$2).a(oi.a, oi.a.b).a(oi.d, true),
                  oh.a().a(oi.c, $$1).a(oi.e, 2).a(oi.a, oi.a.b).a(oi.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            od.a(dkf.pE)
               .a(oh.a().a(oi.c, op.J(dkf.pE)))
               .a(oc.a().a(dye.aO, 1), oh.a().a(oi.c, op.a(dkf.pE, "_contents1")))
               .a(oc.a().a(dye.aO, 2), oh.a().a(oi.c, op.a(dkf.pE, "_contents2")))
               .a(oc.a().a(dye.aO, 3), oh.a().a(oi.c, op.a(dkf.pE, "_contents3")))
               .a(oc.a().a(dye.aO, 4), oh.a().a(oi.c, op.a(dkf.pE, "_contents4")))
               .a(oc.a().a(dye.aO, 5), oh.a().a(oi.c, op.a(dkf.pE, "_contents5")))
               .a(oc.a().a(dye.aO, 6), oh.a().a(oi.c, op.a(dkf.pE, "_contents6")))
               .a(oc.a().a(dye.aO, 7), oh.a().a(oi.c, op.a(dkf.pE, "_contents7")))
               .a(oc.a().a(dye.aO, 8), oh.a().a(oi.c, op.a(dkf.pE, "_contents_ready")))
         );
   }

   private void x(dkd $$0) {
      alp $$1 = oo.c.a($$0, op.a($$0), this.c);
      alp $$2 = this.a($$0, "_powered", oo.c, op::b);
      alp $$3 = this.a($$0, "_lit", oo.c, op::b);
      alp $$4 = this.a($$0, "_lit_powered", oo.c, op::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private ob a(dkd $$0, alp $$1, alp $$2, alp $$3, alp $$4) {
      return oe.a($$0).a(of.a(dye.v, dye.B).a(($$4x, $$5) -> $$4x ? oh.a().a(oi.c, $$5 ? $$4 : $$2) : oh.a().a(oi.c, $$5 ? $$3 : $$1)));
   }

   private void i(dkd $$0, dkd $$1) {
      alp $$2 = om.a($$0);
      alp $$3 = om.a($$0, "_powered");
      alp $$4 = om.a($$0, "_lit");
      alp $$5 = om.a($$0, "_lit_powered");
      this.a($$1, om.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void y(dkd $$0) {
      this.c($$0);
      this.b.accept(oe.a($$0, oh.a().a(oi.c, oo.ao.a($$0, op.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.y(dkf.ra);
      this.y(dkf.qZ);
      this.y(dkf.qY);
      this.y(dkf.qX);
   }

   private void H() {
      this.c(dkf.sV);
      of.b<jm, dyk> $$0 = of.a(dye.bp, dye.bq);

      for (dyk $$1 : dyk.values()) {
         $$0.a(jm.b, $$1, this.a(jm.b, $$1));
      }

      for (dyk $$2 : dyk.values()) {
         $$0.a(jm.a, $$2, this.a(jm.a, $$2));
      }

      this.b.accept(oe.a(dkf.sV).a($$0));
   }

   private oh a(jm $$0, dyk $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      op $$3 = op.c(op.a(dkf.sV, $$2));
      return oh.a().a(oi.c, oo.an.a(dkf.sV, $$2, $$3, this.c));
   }

   private void z(dkd $$0) {
      op $$1 = new op().a(oq.e, op.J(dkf.ei)).a(oq.f, op.J($$0)).a(oq.i, op.a($$0, "_side"));
      this.b.accept(c($$0, oo.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alp $$0 = op.a(dkf.hw, "_side");
      op $$1 = new op().a(oq.f, op.a(dkf.hw, "_top")).a(oq.i, $$0);
      op $$2 = new op().a(oq.f, op.a(dkf.hw, "_inverted_top")).a(oq.i, $$0);
      this.b
         .accept(
            oe.a(dkf.hw)
               .a(of.a(dye.t).a(false, oh.a().a(oi.c, oo.aI.a(dkf.hw, $$1, this.c))).a(true, oh.a().a(oi.c, oo.aI.a(om.a(dkf.hw, "_inverted"), $$2, this.c))))
         );
   }

   private void A(dkd $$0) {
      this.b.accept(oe.a($$0, oh.a().a(oi.c, om.a($$0))).a(this.n()));
   }

   private void J() {
      dkd $$0 = dkf.sU;
      alp $$1 = om.a($$0, "_on");
      alp $$2 = om.a($$0);
      this.b.accept(oe.a($$0, oh.a().a(oi.c, om.a($$0))).a(this.n()).a(a(dye.B, $$1, $$2)));
   }

   private void K() {
      op $$0 = new op().a(oq.C, op.J(dkf.j)).a(oq.f, op.J(dkf.cK));
      op $$1 = new op().a(oq.C, op.J(dkf.j)).a(oq.f, op.a(dkf.cK, "_moist"));
      alp $$2 = oo.aZ.a(dkf.cK, $$0, this.c);
      alp $$3 = oo.aZ.a(op.a(dkf.cK, "_moist"), $$1, this.c);
      this.b.accept(oe.a(dkf.cK).a(a(dye.aT, 7, $$3, $$2)));
   }

   private List<alp> B(dkd $$0) {
      alp $$1 = oo.ba.a(om.a($$0, "_floor0"), op.y($$0), this.c);
      alp $$2 = oo.ba.a(om.a($$0, "_floor1"), op.z($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alp> C(dkd $$0) {
      alp $$1 = oo.bb.a(om.a($$0, "_side0"), op.y($$0), this.c);
      alp $$2 = oo.bb.a(om.a($$0, "_side1"), op.z($$0), this.c);
      alp $$3 = oo.bc.a(om.a($$0, "_side_alt0"), op.y($$0), this.c);
      alp $$4 = oo.bc.a(om.a($$0, "_side_alt1"), op.z($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alp> D(dkd $$0) {
      alp $$1 = oo.bd.a(om.a($$0, "_up0"), op.y($$0), this.c);
      alp $$2 = oo.bd.a(om.a($$0, "_up1"), op.z($$0), this.c);
      alp $$3 = oo.be.a(om.a($$0, "_up_alt0"), op.y($$0), this.c);
      alp $$4 = oo.be.a(om.a($$0, "_up_alt1"), op.z($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<oh> a(List<alp> $$0, UnaryOperator<oh> $$1) {
      return $$0.stream().map($$0x -> oh.a().a(oi.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      oc $$0 = oc.a().a(dye.O, false).a(dye.P, false).a(dye.Q, false).a(dye.R, false).a(dye.M, false);
      List<alp> $$1 = this.B(dkf.cy);
      List<alp> $$2 = this.C(dkf.cy);
      List<alp> $$3 = this.D(dkf.cy);
      this.b
         .accept(
            od.a(dkf.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(oc.b(oc.a().a(dye.O, true), $$0), a($$2, $$0x -> $$0x))
               .a(oc.b(oc.a().a(dye.P, true), $$0), a($$2, $$0x -> $$0x.a(oi.b, oi.a.b)))
               .a(oc.b(oc.a().a(dye.Q, true), $$0), a($$2, $$0x -> $$0x.a(oi.b, oi.a.c)))
               .a(oc.b(oc.a().a(dye.R, true), $$0), a($$2, $$0x -> $$0x.a(oi.b, oi.a.d)))
               .a(oc.a().a(dye.M, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alp> $$0 = this.B(dkf.cz);
      List<alp> $$1 = this.C(dkf.cz);
      this.b
         .accept(
            od.a(dkf.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(oi.b, oi.a.b)))
               .a(a($$1, $$0x -> $$0x.a(oi.b, oi.a.c)))
               .a(a($$1, $$0x -> $$0x.a(oi.b, oi.a.d)))
         );
   }

   private void E(dkd $$0) {
      alp $$1 = or.u.create($$0, this.c);
      alp $$2 = or.v.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(oe.a($$0).a(a(dye.n, $$2, $$1)));
   }

   private void N() {
      op $$0 = op.a(op.a(dkf.ah, "_side"), op.a(dkf.ah, "_top"));
      alp $$1 = oo.j.a(dkf.ah, $$0, this.c);
      this.b.accept(d(dkf.ah, $$1));
   }

   private void O() {
      this.a(cxk.af);
      dkd $$0 = dkf.H;
      of.b<Boolean, Integer> $$1 = of.a(dpa.d, dpa.b);
      alp $$2 = om.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alp $$4 = om.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oh.a().a(oi.c, $$4));
         $$1.a(false, $$3, oh.a().a(oi.c, $$2));
      }

      this.b.accept(oe.a(dkf.H).a($$1));
   }

   private void P() {
      this.b
         .accept(
            oe.a(dkf.lk)
               .a(
                  of.a(dye.av)
                     .a(0, oh.a().a(oi.c, this.a(dkf.lk, "_0", oo.c, op::b)))
                     .a(1, oh.a().a(oi.c, this.a(dkf.lk, "_1", oo.c, op::b)))
                     .a(2, oh.a().a(oi.c, this.a(dkf.lk, "_2", oo.c, op::b)))
                     .a(3, oh.a().a(oi.c, this.a(dkf.lk, "_3", oo.c, op::b)))
               )
         );
   }

   private void Q() {
      alp $$0 = op.J(dkf.j);
      op $$1 = new op().a(oq.e, $$0).b(oq.e, oq.c).a(oq.f, op.a(dkf.i, "_top")).a(oq.i, op.a(dkf.i, "_snow"));
      oh $$2 = oh.a().a(oi.c, oo.n.a(dkf.i, "_snow", $$1, this.c));
      this.a(dkf.i, om.a(dkf.i), $$2);
      alp $$3 = or.f.get(dkf.fA).a($$1x -> $$1x.a(oq.e, $$0)).a(dkf.fA, this.c);
      this.a(dkf.fA, $$3, $$2);
      alp $$4 = or.f.get(dkf.l).a($$1x -> $$1x.a(oq.e, $$0)).a(dkf.l, this.c);
      this.a(dkf.l, $$4, $$2);
   }

   private void a(dkd $$0, alp $$1, oh $$2) {
      List<oh> $$3 = Arrays.asList(a($$1));
      this.b.accept(oe.a($$0).a(of.a(dye.F).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cxk.se);
      this.b
         .accept(
            oe.a(dkf.fX)
               .a(
                  of.a(dye.au)
                     .a(0, oh.a().a(oi.c, om.a(dkf.fX, "_stage0")))
                     .a(1, oh.a().a(oi.c, om.a(dkf.fX, "_stage1")))
                     .a(2, oh.a().a(oi.c, om.a(dkf.fX, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dkf.lg, om.a(dkf.lg)));
   }

   private void j(dkd $$0, dkd $$1) {
      op $$2 = op.b($$1);
      alp $$3 = oo.Y.a($$0, $$2, this.c);
      alp $$4 = oo.Z.a($$0, $$2, this.c);
      this.b.accept(oe.a($$0).a(a(dye.aW, 1, $$4, $$3)));
   }

   private void T() {
      alp $$0 = om.a(dkf.hz);
      alp $$1 = om.a(dkf.hz, "_side");
      this.a(cxk.mo);
      this.b
         .accept(
            oe.a(dkf.hz)
               .a(
                  of.a(dye.T)
                     .a(jm.a, oh.a().a(oi.c, $$0))
                     .a(jm.c, oh.a().a(oi.c, $$1))
                     .a(jm.f, oh.a().a(oi.c, $$1).a(oi.b, oi.a.b))
                     .a(jm.d, oh.a().a(oi.c, $$1).a(oi.b, oi.a.c))
                     .a(jm.e, oh.a().a(oi.c, $$1).a(oi.b, oi.a.d))
               )
         );
   }

   private void k(dkd $$0, dkd $$1) {
      alp $$2 = om.a($$0);
      this.b.accept(oe.a($$1, oh.a().a(oi.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alp $$0 = om.a(dkf.fk, "_post_ends");
      alp $$1 = om.a(dkf.fk, "_post");
      alp $$2 = om.a(dkf.fk, "_cap");
      alp $$3 = om.a(dkf.fk, "_cap_alt");
      alp $$4 = om.a(dkf.fk, "_side");
      alp $$5 = om.a(dkf.fk, "_side_alt");
      this.b
         .accept(
            od.a(dkf.fk)
               .a(oh.a().a(oi.c, $$0))
               .a(oc.a().a(dye.O, false).a(dye.P, false).a(dye.Q, false).a(dye.R, false), oh.a().a(oi.c, $$1))
               .a(oc.a().a(dye.O, true).a(dye.P, false).a(dye.Q, false).a(dye.R, false), oh.a().a(oi.c, $$2))
               .a(oc.a().a(dye.O, false).a(dye.P, true).a(dye.Q, false).a(dye.R, false), oh.a().a(oi.c, $$2).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.O, false).a(dye.P, false).a(dye.Q, true).a(dye.R, false), oh.a().a(oi.c, $$3))
               .a(oc.a().a(dye.O, false).a(dye.P, false).a(dye.Q, false).a(dye.R, true), oh.a().a(oi.c, $$3).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.O, true), oh.a().a(oi.c, $$4))
               .a(oc.a().a(dye.P, true), oh.a().a(oi.c, $$4).a(oi.b, oi.a.b))
               .a(oc.a().a(dye.Q, true), oh.a().a(oi.c, $$5))
               .a(oc.a().a(dye.R, true), oh.a().a(oi.c, $$5).a(oi.b, oi.a.b))
         );
      this.d(dkf.fk);
   }

   private void F(dkd $$0) {
      this.b.accept(oe.a($$0, oh.a().a(oi.c, om.a($$0))).a(b()));
   }

   private void V() {
      alp $$0 = om.a(dkf.dI);
      alp $$1 = om.a(dkf.dI, "_on");
      this.d(dkf.dI);
      this.b
         .accept(
            oe.a(dkf.dI)
               .a(a(dye.B, $$0, $$1))
               .a(
                  of.a(dye.X, dye.U)
                     .a(dxz.c, jm.c, oh.a().a(oi.a, oi.a.c).a(oi.b, oi.a.c))
                     .a(dxz.c, jm.f, oh.a().a(oi.a, oi.a.c).a(oi.b, oi.a.d))
                     .a(dxz.c, jm.d, oh.a().a(oi.a, oi.a.c))
                     .a(dxz.c, jm.e, oh.a().a(oi.a, oi.a.c).a(oi.b, oi.a.b))
                     .a(dxz.a, jm.c, oh.a())
                     .a(dxz.a, jm.f, oh.a().a(oi.b, oi.a.b))
                     .a(dxz.a, jm.d, oh.a().a(oi.b, oi.a.c))
                     .a(dxz.a, jm.e, oh.a().a(oi.b, oi.a.d))
                     .a(dxz.b, jm.c, oh.a().a(oi.a, oi.a.b))
                     .a(dxz.b, jm.f, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.b))
                     .a(dxz.b, jm.d, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.c))
                     .a(dxz.b, jm.e, oh.a().a(oi.a, oi.a.b).a(oi.b, oi.a.d))
               )
         );
   }

   private void W() {
      this.d(dkf.fB);
      this.b.accept(b(dkf.fB, om.a(dkf.fB)));
   }

   private void X() {
      this.d(dkf.tP);
      this.b.accept(c(dkf.tP, om.a(dkf.tP)));
   }

   private void Y() {
      this.b.accept(oe.a(dkf.eq).a(of.a(dye.K).a(jm.a.a, oh.a().a(oi.c, om.a(dkf.eq, "_ns"))).a(jm.a.c, oh.a().a(oi.c, om.a(dkf.eq, "_ew")))));
   }

   private void Z() {
      alp $$0 = or.a.create(dkf.ei, this.c);
      this.b
         .accept(
            oe.a(
               dkf.ei,
               oh.a().a(oi.c, $$0),
               oh.a().a(oi.c, $$0).a(oi.a, oi.a.b),
               oh.a().a(oi.c, $$0).a(oi.a, oi.a.c),
               oh.a().a(oi.c, $$0).a(oi.a, oi.a.d),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.b),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.b).a(oi.a, oi.a.b),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.b).a(oi.a, oi.a.c),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.b).a(oi.a, oi.a.d),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.c),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.c).a(oi.a, oi.a.b),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.c).a(oi.a, oi.a.c),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.c).a(oi.a, oi.a.d),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.d),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.d).a(oi.a, oi.a.b),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.d).a(oi.a, oi.a.c),
               oh.a().a(oi.c, $$0).a(oi.b, oi.a.d).a(oi.a, oi.a.d)
            )
         );
   }

   private void aa() {
      alp $$0 = om.a(dkf.lq);
      alp $$1 = om.a(dkf.lq, "_on");
      this.b.accept(oe.a(dkf.lq).a(a(dye.B, $$1, $$0)).a(e()));
   }

   private void ab() {
      op $$0 = new op().a(oq.e, op.a(dkf.bF, "_bottom")).a(oq.i, op.a(dkf.bF, "_side"));
      alp $$1 = op.a(dkf.bF, "_top_sticky");
      alp $$2 = op.a(dkf.bF, "_top");
      op $$3 = $$0.c(oq.F, $$1);
      op $$4 = $$0.c(oq.F, $$2);
      alp $$5 = om.a(dkf.bF, "_base");
      this.a(dkf.bF, $$5, $$4);
      this.a(dkf.by, $$5, $$3);
      alp $$6 = oo.n.a(dkf.bF, "_inventory", $$0.c(oq.f, $$2), this.c);
      alp $$7 = oo.n.a(dkf.by, "_inventory", $$0.c(oq.f, $$1), this.c);
      this.a(dkf.bF, $$6);
      this.a(dkf.by, $$7);
   }

   private void a(dkd $$0, alp $$1, op $$2) {
      alp $$3 = oo.bo.a($$0, $$2, this.c);
      this.b.accept(oe.a($$0).a(a(dye.k, $$1, $$3)).a(e()));
   }

   private void ac() {
      op $$0 = new op().a(oq.G, op.a(dkf.bF, "_top")).a(oq.i, op.a(dkf.bF, "_side"));
      op $$1 = $$0.c(oq.F, op.a(dkf.bF, "_top_sticky"));
      op $$2 = $$0.c(oq.F, op.a(dkf.bF, "_top"));
      this.b
         .accept(
            oe.a(dkf.bG)
               .a(
                  of.a(dye.C, dye.bj)
                     .a(false, dyp.a, oh.a().a(oi.c, oo.bp.a(dkf.bF, "_head", $$2, this.c)))
                     .a(false, dyp.b, oh.a().a(oi.c, oo.bp.a(dkf.bF, "_head_sticky", $$1, this.c)))
                     .a(true, dyp.a, oh.a().a(oi.c, oo.bq.a(dkf.bF, "_head_short", $$2, this.c)))
                     .a(true, dyp.b, oh.a().a(oi.c, oo.bq.a(dkf.bF, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dkd $$0 = dkf.tT;
      op $$1 = op.a($$0, "_side_inactive", "_top_inactive");
      op $$2 = op.a($$0, "_side_active", "_top_active");
      op $$3 = op.a($$0, "_side_active", "_top_ejecting_reward");
      op $$4 = op.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      op $$5 = op.a($$0, "_side_active_ominous", "_top_active_ominous");
      op $$6 = op.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alp $$7 = oo.o.a($$0, $$1, this.c);
      alp $$8 = oo.o.a($$0, "_active", $$2, this.c);
      alp $$9 = oo.o.a($$0, "_ejecting_reward", $$3, this.c);
      alp $$10 = oo.o.a($$0, "_inactive_ominous", $$4, this.c);
      alp $$11 = oo.o.a($$0, "_active_ominous", $$5, this.c);
      alp $$12 = oo.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(oe.a($$0).a(of.a(dye.bB, dye.bD).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oh.a().a(oi.c, $$7x ? $$10 : $$7);
            case b, c, d -> oh.a().a(oi.c, $$7x ? $$11 : $$8);
            case e -> oh.a().a(oi.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dkd $$0 = dkf.tU;
      op $$1 = op.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      op $$2 = op.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      op $$3 = op.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      op $$4 = op.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alp $$5 = oo.bU.a($$0, $$1, this.c);
      alp $$6 = oo.bU.a($$0, "_active", $$2, this.c);
      alp $$7 = oo.bU.a($$0, "_unlocking", $$3, this.c);
      alp $$8 = oo.bU.a($$0, "_ejecting_reward", $$4, this.c);
      op $$9 = op.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      op $$10 = op.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      op $$11 = op.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      op $$12 = op.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alp $$13 = oo.bU.a($$0, "_ominous", $$9, this.c);
      alp $$14 = oo.bU.a($$0, "_active_ominous", $$10, this.c);
      alp $$15 = oo.bU.a($$0, "_unlocking_ominous", $$11, this.c);
      alp $$16 = oo.bU.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(oe.a($$0).a(b()).a(of.a(dtd.b, dtd.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oh.a().a(oi.c, $$9x ? $$13 : $$5);
            case b -> oh.a().a(oi.c, $$9x ? $$14 : $$6);
            case c -> oh.a().a(oi.c, $$9x ? $$15 : $$7);
            case d -> oh.a().a(oi.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alp $$0 = om.a(dkf.rs, "_inactive");
      alp $$1 = om.a(dkf.rs, "_active");
      this.a(dkf.rs, $$0);
      this.b.accept(oe.a(dkf.rs).a(of.a(dye.br).a($$2 -> oh.a().a(oi.c, $$2 != dyu.b && $$2 != dyu.c ? $$0 : $$1))));
   }

   private void ag() {
      alp $$0 = om.a(dkf.rt, "_inactive");
      alp $$1 = om.a(dkf.rt, "_active");
      this.a(dkf.rt, $$0);
      this.b.accept(oe.a(dkf.rt).a(of.a(dye.br).a($$2 -> oh.a().a(oi.c, $$2 != dyu.b && $$2 != dyu.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alp $$0 = oo.bT.a(dkf.rx, op.a(false), this.c);
      alp $$1 = oo.bT.a(dkf.rx, "_can_summon", op.a(true), this.c);
      this.a(dkf.rx, $$0);
      this.b.accept(oe.a(dkf.rx).a(a(dye.f, $$1, $$0)));
   }

   private void ai() {
      alp $$0 = om.a(dkf.ou, "_stable");
      alp $$1 = om.a(dkf.ou, "_unstable");
      this.a(dkf.ou, $$0);
      this.b.accept(oe.a(dkf.ou).a(a(dye.e, $$1, $$0)));
   }

   private void aj() {
      alp $$0 = this.a(dkf.sX, "", oo.ao, op::c);
      alp $$1 = this.a(dkf.sX, "_lit", oo.ao, op::c);
      this.b.accept(oe.a(dkf.sX).a(a(dye.c, $$1, $$0)));
      alp $$2 = this.a(dkf.sY, "", oo.ao, op::c);
      alp $$3 = this.a(dkf.sY, "_lit", oo.ao, op::c);
      this.b.accept(oe.a(dkf.sY).a(a(dye.c, $$3, $$2)));
   }

   private void ak() {
      alp $$0 = or.a.create(dkf.fW, this.c);
      alp $$1 = this.a(dkf.fW, "_on", oo.c, op::b);
      this.b.accept(oe.a(dkf.fW).a(a(dye.v, $$1, $$0)));
   }

   private void l(dkd $$0, dkd $$1) {
      op $$2 = op.B($$0);
      this.b.accept(c($$0, oo.bi.a($$0, $$2, this.c)));
      this.b.accept(oe.a($$1, oh.a().a(oi.c, oo.bk.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      op $$0 = op.B(dkf.dX);
      op $$1 = op.i(op.a(dkf.dX, "_off"));
      alp $$2 = oo.bm.a(dkf.dX, $$0, this.c);
      alp $$3 = oo.bj.a(dkf.dX, "_off", $$1, this.c);
      this.b.accept(oe.a(dkf.dX).a(a(dye.v, $$2, $$3)));
      alp $$4 = oo.bn.a(dkf.dY, $$0, this.c);
      alp $$5 = oo.bl.a(dkf.dY, "_off", $$1, this.c);
      this.b.accept(oe.a(dkf.dY).a(a(dye.v, $$4, $$5)).a(d()));
      this.d(dkf.dX);
      this.c(dkf.dY);
   }

   private void am() {
      this.a(cxk.mh);
      this.b.accept(oe.a(dkf.eu).a(of.a(dye.aD, dye.w, dye.B).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oh.a().a(oi.c, op.a(dkf.eu, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cxk.da);
      this.b
         .accept(
            oe.a(dkf.nx)
               .a(
                  of.a(dye.aV, dye.J)
                     .a(1, false, Arrays.asList(a(om.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(om.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(om.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(om.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(om.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(om.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(om.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(om.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      op $$0 = op.a(dkf.ea);
      alp $$1 = oo.c.a(dkf.ec, $$0, this.c);
      this.b.accept(oe.a(dkf.ea).a(of.a(dye.aI).a($$1x -> oh.a().a(oi.c, $$1x < 8 ? om.a(dkf.ea, "_height" + $$1x * 2) : $$1))));
      this.a(dkf.ea, om.a(dkf.ea, "_height2"));
      this.b.accept(c(dkf.ec, $$1));
   }

   private void ap() {
      this.b.accept(oe.a(dkf.oE, oh.a().a(oi.c, om.a(dkf.oE))).a(b()));
   }

   private void aq() {
      alp $$0 = or.a.create(dkf.pC, this.c);
      this.a(dkf.pC, $$0);
      this.b.accept(oe.a(dkf.pC).a(of.a(dye.bm).a($$0x -> oh.a().a(oi.c, this.a(dkf.pC, "_" + $$0x.c(), oo.c, op::b)))));
   }

   private void ar() {
      this.a(cxk.xv);
      this.b.accept(oe.a(dkf.oK).a(of.a(dye.av).a($$0 -> oh.a().a(oi.c, this.a(dkf.oK, "_stage" + $$0, oo.ao, op::c)))));
   }

   private void as() {
      this.a(cxk.pX);
      this.b
         .accept(
            oe.a(dkf.gd)
               .a(
                  of.a(dye.b, dye.P, dye.O, dye.Q, dye.R)
                     .a(false, false, false, false, false, oh.a().a(oi.c, om.a(dkf.gd, "_ns")))
                     .a(false, true, false, false, false, oh.a().a(oi.c, om.a(dkf.gd, "_n")).a(oi.b, oi.a.b))
                     .a(false, false, true, false, false, oh.a().a(oi.c, om.a(dkf.gd, "_n")))
                     .a(false, false, false, true, false, oh.a().a(oi.c, om.a(dkf.gd, "_n")).a(oi.b, oi.a.c))
                     .a(false, false, false, false, true, oh.a().a(oi.c, om.a(dkf.gd, "_n")).a(oi.b, oi.a.d))
                     .a(false, true, true, false, false, oh.a().a(oi.c, om.a(dkf.gd, "_ne")))
                     .a(false, true, false, true, false, oh.a().a(oi.c, om.a(dkf.gd, "_ne")).a(oi.b, oi.a.b))
                     .a(false, false, false, true, true, oh.a().a(oi.c, om.a(dkf.gd, "_ne")).a(oi.b, oi.a.c))
                     .a(false, false, true, false, true, oh.a().a(oi.c, om.a(dkf.gd, "_ne")).a(oi.b, oi.a.d))
                     .a(false, false, true, true, false, oh.a().a(oi.c, om.a(dkf.gd, "_ns")))
                     .a(false, true, false, false, true, oh.a().a(oi.c, om.a(dkf.gd, "_ns")).a(oi.b, oi.a.b))
                     .a(false, true, true, true, false, oh.a().a(oi.c, om.a(dkf.gd, "_nse")))
                     .a(false, true, false, true, true, oh.a().a(oi.c, om.a(dkf.gd, "_nse")).a(oi.b, oi.a.b))
                     .a(false, false, true, true, true, oh.a().a(oi.c, om.a(dkf.gd, "_nse")).a(oi.b, oi.a.c))
                     .a(false, true, true, false, true, oh.a().a(oi.c, om.a(dkf.gd, "_nse")).a(oi.b, oi.a.d))
                     .a(false, true, true, true, true, oh.a().a(oi.c, om.a(dkf.gd, "_nsew")))
                     .a(true, false, false, false, false, oh.a().a(oi.c, om.a(dkf.gd, "_attached_ns")))
                     .a(true, false, true, false, false, oh.a().a(oi.c, om.a(dkf.gd, "_attached_n")))
                     .a(true, false, false, true, false, oh.a().a(oi.c, om.a(dkf.gd, "_attached_n")).a(oi.b, oi.a.c))
                     .a(true, true, false, false, false, oh.a().a(oi.c, om.a(dkf.gd, "_attached_n")).a(oi.b, oi.a.b))
                     .a(true, false, false, false, true, oh.a().a(oi.c, om.a(dkf.gd, "_attached_n")).a(oi.b, oi.a.d))
                     .a(true, true, true, false, false, oh.a().a(oi.c, om.a(dkf.gd, "_attached_ne")))
                     .a(true, true, false, true, false, oh.a().a(oi.c, om.a(dkf.gd, "_attached_ne")).a(oi.b, oi.a.b))
                     .a(true, false, false, true, true, oh.a().a(oi.c, om.a(dkf.gd, "_attached_ne")).a(oi.b, oi.a.c))
                     .a(true, false, true, false, true, oh.a().a(oi.c, om.a(dkf.gd, "_attached_ne")).a(oi.b, oi.a.d))
                     .a(true, false, true, true, false, oh.a().a(oi.c, om.a(dkf.gd, "_attached_ns")))
                     .a(true, true, false, false, true, oh.a().a(oi.c, om.a(dkf.gd, "_attached_ns")).a(oi.b, oi.a.b))
                     .a(true, true, true, true, false, oh.a().a(oi.c, om.a(dkf.gd, "_attached_nse")))
                     .a(true, true, false, true, true, oh.a().a(oi.c, om.a(dkf.gd, "_attached_nse")).a(oi.b, oi.a.b))
                     .a(true, false, true, true, true, oh.a().a(oi.c, om.a(dkf.gd, "_attached_nse")).a(oi.b, oi.a.c))
                     .a(true, true, true, false, true, oh.a().a(oi.c, om.a(dkf.gd, "_attached_nse")).a(oi.b, oi.a.d))
                     .a(true, true, true, true, true, oh.a().a(oi.c, om.a(dkf.gd, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dkf.gc);
      this.b.accept(oe.a(dkf.gc).a(of.a(dye.b, dye.B).a(($$0, $$1) -> oh.a().a(oi.c, op.a(dkf.gc, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alp a(int $$0, String $$1, op $$2) {
      switch ($$0) {
         case 1:
            return oo.bs.a(om.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return oo.bt.a(om.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return oo.bu.a(om.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return oo.bv.a(om.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private alp a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", op.b(op.J(dkf.mH)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", op.b(op.a(dkf.mH, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", op.b(op.a(dkf.mH, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cxk.kM);
      this.b.accept(oe.a(dkf.mH).a(of.a(dye.aG, dye.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cxk.kN);
      Function<Integer, alp> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         op $$2 = op.a($$1);
         return oo.bD.a(dkf.mI, $$1, $$2, this.c);
      };
      this.b.accept(oe.a(dkf.mI).a(of.a(drq.c).a($$1 -> oh.a().a(oi.c, $$0.apply($$1)))));
   }

   private void G(dkd $$0) {
      this.d($$0);
      this.H($$0);
   }

   private void b(dkd $$0, cxc $$1) {
      this.a($$1);
      this.H($$0);
   }

   private void H(dkd $$0) {
      alp $$1 = om.a($$0);
      od $$2 = od.a($$0);
      oc.c $$3 = ae.a(oc.a(), $$1x -> a.stream().<jm>map(Pair::getFirst).map(dpf::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jm, Function<alp, oh>> $$4 : a) {
         dyf $$5 = dpf.b((jm)$$4.getFirst());
         Function<alp, oh> $$6 = (Function<alp, oh>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(oc.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void I(dkd $$0) {
      alp $$1 = or.j.create($$0, this.c);
      alp $$2 = or.k.get($$0).a($$1x -> $$1x.a(oq.i, op.a($$0, "_side_tall"))).a($$0, "_side_tall", this.c);
      alp $$3 = or.k.get($$0).a($$1x -> $$1x.a(oq.i, op.a($$0, "_side_small"))).a($$0, "_side_small", this.c);
      od $$4 = od.a($$0);
      oc.c $$5 = oc.a().a(dpd.b, false);
      $$4.a(oc.a().a(dpd.b, true), oh.a().a(oi.c, $$1));
      $$4.a($$5, oh.a().a(oi.c, $$1));
      a.stream().<jm>map(Pair::getFirst).forEach($$2x -> {
         dyl<dyz> $$3x = dpd.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dyz.a);
         }
      });

      for (Pair<jm, Function<alp, oh>> $$6 : a) {
         jm $$7 = (jm)$$6.getFirst();
         dyl<dyz> $$8 = dpd.a($$7);
         if ($$8 != null) {
            Function<alp, oh> $$9 = (Function<alp, oh>)$$6.getSecond();
            $$4.a(oc.a().a($$8, dyz.c), $$9.apply($$2));
            $$4.a(oc.a().a($$8, dyz.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void J(dkd $$0) {
      of $$1 = of.a(dnv.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         op $$3 = op.c(op.a($$0, $$2));
         alp $$4 = nx.e.b.a().a($$0, $$2, $$3, this.c);
         return oh.a().a(oi.c, $$4);
      });
      this.d($$0);
      this.b.accept(oe.a($$0).a($$1));
   }

   private void aw() {
      alp $$0 = op.a(dkf.rw, "_bottom");
      op $$1 = new op().a(oq.e, $$0).a(oq.f, op.a(dkf.rw, "_top")).a(oq.i, op.a(dkf.rw, "_side"));
      op $$2 = new op().a(oq.e, $$0).a(oq.f, op.a(dkf.rw, "_top_bloom")).a(oq.i, op.a(dkf.rw, "_side_bloom"));
      alp $$3 = oo.n.a(dkf.rw, "", $$1, this.c);
      alp $$4 = oo.n.a(dkf.rw, "_bloom", $$2, this.c);
      this.b.accept(oe.a(dkf.rw).a(of.a(dye.d).a($$2x -> oh.a().a(oi.c, $$2x ? $$4 : $$3))));
      this.a(cxk.gF, $$3);
   }

   private void ax() {
      dkd $$0 = dkf.ct;
      alp $$1 = om.a($$0);
      od $$2 = od.a($$0);
      List.of(Pair.of(jm.c, oi.a.a), Pair.of(jm.f, oi.a.b), Pair.of(jm.d, oi.a.c), Pair.of(jm.e, oi.a.d)).forEach($$2x -> {
         jm $$3 = (jm)$$2x.getFirst();
         oi.a $$4 = (oi.a)$$2x.getSecond();
         oc.c $$5 = oc.a().a(dye.U, $$3);
         $$2.a($$5, oh.a().a(oi.c, $$1).a(oi.b, $$4).a(oi.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, om.a($$0, "_inventory"));
      i.clear();
   }

   private void a(od $$0, oc.c $$1, oi.a $$2) {
      List.of(Pair.of(dye.bs, oo.aP), Pair.of(dye.bt, oo.aQ), Pair.of(dye.bu, oo.aR), Pair.of(dye.bv, oo.aS), Pair.of(dye.bw, oo.aT), Pair.of(dye.bx, oo.aU))
         .forEach($$3 -> {
            dyf $$4 = (dyf)$$3.getFirst();
            on $$5 = (on)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(od $$0, oc.c $$1, oi.a $$2, dyf $$3, on $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      op $$7 = new op().a(oq.b, op.a(dkf.ct, $$6));
      nx.d $$8 = new nx.d($$4, $$6);
      alp $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dkf.ct, $$6, $$7, this.c));
      $$0.a(oc.a($$1, oc.a().a($$3, $$5)), oh.a().a(oi.c, $$9).a(oi.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dkf.ll, oo.c.a(dkf.ll, op.b(om.a("magma")), this.c)));
   }

   private void K(dkd $$0) {
      this.b($$0, or.r);
      oo.bK.a(om.a($$0.j()), op.x($$0), this.c);
   }

   private void b(dkd $$0, dkd $$1, nx.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dkd $$0, dkd $$1) {
      oo.bL.a(om.a($$0.j()), op.x($$1), this.c);
   }

   private void az() {
      alp $$0 = om.a(dkf.b);
      alp $$1 = om.a(dkf.b, "_mirrored");
      this.b.accept(a(dkf.fb, $$0, $$1));
      this.a(dkf.fb, $$0);
   }

   private void aA() {
      alp $$0 = om.a(dkf.tl);
      alp $$1 = om.a(dkf.tl, "_mirrored");
      this.b.accept(a(dkf.tF, $$0, $$1).a(f()));
      this.a(dkf.tF, $$0);
   }

   private void n(dkd $$0, dkd $$1) {
      this.a($$0, nx.e.b);
      op $$2 = op.d(op.a($$0, "_pot"));
      alp $$3 = nx.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alp $$0 = op.a(dkf.pN, "_bottom");
      alp $$1 = op.a(dkf.pN, "_top_off");
      alp $$2 = op.a(dkf.pN, "_top");
      alp[] $$3 = new alp[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         op $$5 = new op().a(oq.e, $$0).a(oq.f, $$4 == 0 ? $$1 : $$2).a(oq.i, op.a(dkf.pN, "_side" + $$4));
         $$3[$$4] = oo.n.a(dkf.pN, "_" + $$4, $$5, this.c);
      }

      this.b.accept(oe.a(dkf.pN).a(of.a(dye.bc).a($$1x -> oh.a().a(oi.c, $$3[$$1x]))));
      this.a(cxk.xT, $$3[0]);
   }

   private oh a(jo $$0, oh $$1) {
      switch ($$0) {
         case b:
            return $$1.a(oi.a, oi.a.b);
         case c:
            return $$1.a(oi.a, oi.a.b).a(oi.b, oi.a.c);
         case d:
            return $$1.a(oi.a, oi.a.b).a(oi.b, oi.a.d);
         case a:
            return $$1.a(oi.a, oi.a.b).a(oi.b, oi.a.b);
         case f:
            return $$1.a(oi.a, oi.a.d).a(oi.b, oi.a.c);
         case g:
            return $$1.a(oi.a, oi.a.d);
         case h:
            return $$1.a(oi.a, oi.a.d).a(oi.b, oi.a.b);
         case e:
            return $$1.a(oi.a, oi.a.d).a(oi.b, oi.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(oi.b, oi.a.c);
         case i:
            return $$1.a(oi.b, oi.a.d);
         case j:
            return $$1.a(oi.b, oi.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      alp $$0 = op.a(dkf.pD, "_top");
      alp $$1 = op.a(dkf.pD, "_bottom");
      alp $$2 = op.a(dkf.pD, "_side");
      alp $$3 = op.a(dkf.pD, "_lock");
      op $$4 = new op().a(oq.o, $$2).a(oq.m, $$2).a(oq.l, $$2).a(oq.c, $$0).a(oq.j, $$0).a(oq.k, $$1).a(oq.n, $$3);
      alp $$5 = oo.b.a(dkf.pD, $$4, this.c);
      this.b.accept(oe.a(dkf.pD, oh.a().a(oi.c, $$5)).a(of.a(dye.W).a($$0x -> this.a($$0x, oh.a()))));
   }

   private void aD() {
      dkd $$0 = dkf.n;
      alp $$1 = om.a($$0);
      or $$2 = or.a.get($$0);
      dkd $$3 = dkf.kg;
      alp $$4 = oo.ab.a($$3, $$2.b(), this.c);
      alp $$5 = oo.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      md.a().filter(me::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dkf.rH).a(md.x).a(dkf.rH, dkf.sf).a(dkf.rL, dkf.rP).a(md.z);
      this.i(dkf.rG).a(md.B).a(dkf.rG, dkf.se).a(dkf.rK, dkf.rO).a(md.D);
      this.i(dkf.rF).a(md.F).a(dkf.rF, dkf.sd).a(dkf.rJ, dkf.rN).a(md.H);
      this.i(dkf.rE).a(md.J).a(dkf.rE, dkf.sc).a(dkf.rI, dkf.rM).a(md.L);
      this.x(dkf.sM);
      this.x(dkf.sN);
      this.x(dkf.sO);
      this.x(dkf.sP);
      this.i(dkf.sM, dkf.sQ);
      this.i(dkf.sN, dkf.sR);
      this.i(dkf.sO, dkf.sS);
      this.i(dkf.sP, dkf.sT);
      this.n(dkf.a);
      this.c(dkf.nE, dkf.a);
      this.c(dkf.nD, dkf.a);
      this.n(dkf.gj);
      this.n(dkf.ed);
      this.c(dkf.nF, dkf.J);
      this.n(dkf.fV);
      this.n(dkf.mG);
      this.n(dkf.fM);
      this.n(dkf.gm);
      this.a(cxk.vd);
      this.n(dkf.pI);
      this.n(dkf.J);
      this.n(dkf.K);
      this.n(dkf.it);
      this.a(cxk.gh);
      this.o(dkf.qo, dkf.qF);
      this.o(dkf.qp, dkf.qG);
      this.o(dkf.qq, dkf.qH);
      this.o(dkf.qr, dkf.qI);
      this.o(dkf.qs, dkf.qJ);
      this.o(dkf.qt, dkf.qK);
      this.o(dkf.qu, dkf.qL);
      this.o(dkf.qv, dkf.qM);
      this.o(dkf.qw, dkf.qN);
      this.o(dkf.qx, dkf.qO);
      this.o(dkf.qy, dkf.qP);
      this.o(dkf.qz, dkf.qQ);
      this.o(dkf.qA, dkf.qR);
      this.o(dkf.qB, dkf.qS);
      this.o(dkf.qC, dkf.qT);
      this.o(dkf.qD, dkf.qU);
      this.o(dkf.qn, dkf.qE);
      this.n(dkf.nC);
      this.n(dkf.gO);
      this.n(dkf.rr);
      this.n(dkf.sZ);
      this.t(dkf.ta);
      this.t(dkf.tb);
      this.u(dkf.tK);
      this.u(dkf.tL);
      this.aj();
      this.g(dkf.te, dkf.tc);
      this.I(dkf.tX);
      this.J(dkf.tY);
      this.a(dkf.tW);
      this.q(dkf.td);
      this.a(dkf.iu, cxk.hY);
      this.a(cxk.hY);
      this.aE();
      this.a(dkf.lp, cxk.jy);
      this.a(cxk.jy);
      this.f(dkf.bX, op.a(dkf.bF, "_side"));
      this.a(dkf.U);
      this.a(dkf.V);
      this.a(dkf.iZ);
      this.a(dkf.cF);
      this.a(dkf.cG);
      this.a(dkf.cH);
      this.a(dkf.fZ);
      this.a(dkf.ga);
      this.a(dkf.ge);
      this.a(dkf.Q);
      this.a(dkf.W);
      this.a(dkf.R);
      this.a(dkf.co);
      this.a(dkf.S);
      this.a(dkf.T);
      this.a(dkf.cp);
      this.b(dkf.pL, or.d);
      this.a(dkf.pK);
      this.a(dkf.aY);
      this.a(dkf.aZ);
      this.a(dkf.ba);
      this.a(dkf.fC);
      this.a(dkf.hy);
      this.a(dkf.dV);
      this.a(dkf.dW);
      this.a(dkf.hx);
      this.a(dkf.qe);
      this.a(dkf.ny);
      this.a(dkf.ee);
      this.a(dkf.k);
      this.a(dkf.pM);
      this.a(dkf.fU);
      this.a(dkf.ep);
      this.a(dkf.O);
      this.a(dkf.pJ);
      this.a(dkf.eb);
      this.b(dkf.eg, or.g);
      this.b(dkf.pS, or.d);
      this.b(dkf.fo, or.d);
      this.n(dkf.ag);
      this.n(dkf.gw);
      this.a(dkf.lm);
      this.a(dkf.bf);
      this.a(dkf.ja);
      this.a(dkf.cv);
      this.a(dkf.qm);
      this.a(dkf.iG);
      this.a(dkf.pa);
      this.a(dkf.ej);
      this.a(dkf.ek);
      this.b(dkf.cA, or.b);
      this.h(dkf.cB);
      this.a(dkf.aV);
      this.b(dkf.bD, or.w);
      this.a(cxk.cZ);
      this.b(dkf.cr, or.f);
      this.b(dkf.pF, or.d);
      this.a(dkf.oR);
      this.a(dkf.aW);
      this.a(dkf.qV);
      this.a(dkf.qW);
      this.a(dkf.rp);
      this.a(dkf.sW);
      this.a(dkf.tH);
      this.a(dkf.tI);
      this.a(dkf.tJ);
      this.e(dkf.ru);
      this.n(dkf.tV);
      this.aD();
      this.a(dkf.rC);
      this.a(dkf.rD);
      this.a(dkf.ry);
      this.a(dkf.rz);
      this.a(dkf.rA);
      this.a(dkf.rB);
      this.k(dkf.ry, dkf.rY);
      this.k(dkf.rz, dkf.sa);
      this.k(dkf.rA, dkf.rZ);
      this.k(dkf.rB, dkf.sb);
      this.j(dkf.so);
      this.j(dkf.sp);
      this.j(dkf.sr);
      this.j(dkf.sq);
      this.a(dkf.so, dkf.ss);
      this.a(dkf.sp, dkf.st);
      this.a(dkf.sr, dkf.sv);
      this.a(dkf.sq, dkf.su);
      this.l(dkf.sw);
      this.l(dkf.sx);
      this.l(dkf.sz);
      this.l(dkf.sy);
      this.b(dkf.sw, dkf.sA);
      this.b(dkf.sx, dkf.sB);
      this.b(dkf.sz, dkf.sD);
      this.b(dkf.sy, dkf.sC);
      this.a(dkf.sE);
      this.a(dkf.sF);
      this.a(dkf.sG);
      this.a(dkf.sH);
      this.k(dkf.sE, dkf.sI);
      this.k(dkf.sF, dkf.sJ);
      this.k(dkf.sG, dkf.sK);
      this.k(dkf.sH, dkf.sL);
      this.j(dkf.ht, dkf.co);
      this.j(dkf.hu, dkf.cp);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dkf.oI, dkf.oJ);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.A(dkf.kV);
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
      this.G(dkf.ft);
      this.G(dkf.fu);
      this.G(dkf.rv);
      this.b(dkf.fv, cxk.gm);
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
      this.F(dkf.cX);
      this.d(dkf.cX);
      this.F(dkf.oC);
      this.g();
      this.F(dkf.tg);
      this.l(dkf.cw, dkf.cx);
      this.l(dkf.en, dkf.eo);
      this.a(dkf.cI, dkf.n, op::c);
      this.a(dkf.oA, dkf.p, op::d);
      this.z(dkf.oY);
      this.z(dkf.oP);
      this.w(dkf.bb);
      this.w(dkf.hF);
      this.C();
      this.E(dkf.oG);
      this.E(dkf.oH);
      this.e(dkf.fl, om.a(dkf.fl));
      this.a(dkf.el, or.d);
      this.a(dkf.em, or.d);
      this.a(dkf.tG);
      this.a(dkf.lo, or.d);
      this.f(dkf.j);
      this.f(dkf.tj);
      this.f(dkf.L);
      this.g(dkf.M);
      this.g(dkf.P);
      this.f(dkf.N);
      this.e(dkf.I);
      this.b(dkf.tQ, or.f);
      this.a(dkf.iH, or.d, or.e);
      this.a(dkf.kZ, or.x, or.y);
      this.a(dkf.hC, or.x, or.y);
      this.a(dkf.tM, or.d, or.e);
      this.a(dkf.tN, or.d, or.e);
      this.a(dkf.tO, or.d, or.e);
      this.c(dkf.ov, or.i);
      this.z();
      this.a(dkf.pG, op::D);
      this.a(dkf.pH, op::F);
      this.a(dkf.lf, dye.av, 0, 1, 2, 3);
      this.a(dkf.gP, dye.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkf.fL, dye.av, 0, 1, 1, 2);
      this.a(dkf.gQ, dye.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkf.cJ, dye.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dkf.lc, nx.e.b, dye.at, 0, 1);
      this.i();
      this.h();
      this.a(om.a("decorated_pot"), dkf.iY).b(dkf.tR);
      this.a(om.a("banner"), dkf.n)
         .a(oo.bM, dkf.jh, dkf.ji, dkf.jj, dkf.jk, dkf.jl, dkf.jm, dkf.jn, dkf.jo, dkf.jp, dkf.jq, dkf.jr, dkf.js, dkf.jt, dkf.ju, dkf.jv, dkf.jw)
         .b(dkf.jx, dkf.jy, dkf.jz, dkf.jA, dkf.jB, dkf.jC, dkf.jD, dkf.jE, dkf.jF, dkf.jG, dkf.jH, dkf.jI, dkf.jJ, dkf.jK, dkf.jL, dkf.jM);
      this.a(om.a("bed"), dkf.n)
         .b(dkf.bg, dkf.bh, dkf.bi, dkf.bj, dkf.bk, dkf.bl, dkf.bm, dkf.bn, dkf.bo, dkf.bp, dkf.bq, dkf.br, dkf.bs, dkf.bt, dkf.bu, dkf.bv);
      this.m(dkf.bg, dkf.bH);
      this.m(dkf.bh, dkf.bI);
      this.m(dkf.bi, dkf.bJ);
      this.m(dkf.bj, dkf.bK);
      this.m(dkf.bk, dkf.bL);
      this.m(dkf.bl, dkf.bM);
      this.m(dkf.bm, dkf.bN);
      this.m(dkf.bn, dkf.bO);
      this.m(dkf.bo, dkf.bP);
      this.m(dkf.bp, dkf.bQ);
      this.m(dkf.bq, dkf.bR);
      this.m(dkf.br, dkf.bS);
      this.m(dkf.bs, dkf.bT);
      this.m(dkf.bt, dkf.bU);
      this.m(dkf.bu, dkf.bV);
      this.m(dkf.bv, dkf.bW);
      this.a(om.a("skull"), dkf.ej)
         .a(oo.bN, dkf.hj, dkf.hh, dkf.hf, dkf.hb, dkf.hd, dkf.hn)
         .a(dkf.hl)
         .b(dkf.hk, dkf.hm, dkf.hi, dkf.hg, dkf.hc, dkf.he, dkf.ho);
      this.K(dkf.lr);
      this.K(dkf.ls);
      this.K(dkf.lt);
      this.K(dkf.lu);
      this.K(dkf.lv);
      this.K(dkf.lw);
      this.K(dkf.lx);
      this.K(dkf.ly);
      this.K(dkf.lz);
      this.K(dkf.lA);
      this.K(dkf.lB);
      this.K(dkf.lC);
      this.K(dkf.lD);
      this.K(dkf.lE);
      this.K(dkf.lF);
      this.K(dkf.lG);
      this.K(dkf.lH);
      this.b(dkf.nz, or.r);
      this.c(dkf.nz);
      this.a(om.a("chest"), dkf.n).b(dkf.cD, dkf.hs);
      this.a(om.a("ender_chest"), dkf.cv).b(dkf.gb);
      this.f(dkf.fS, dkf.cv).a(dkf.fS, dkf.lh);
      this.a(dkf.aT);
      this.a(dkf.aU);
      this.a(dkf.lY);
      this.a(dkf.lZ);
      this.a(dkf.ma);
      this.a(dkf.mb);
      this.a(dkf.mc);
      this.a(dkf.md);
      this.a(dkf.me);
      this.a(dkf.mf);
      this.a(dkf.mg);
      this.a(dkf.mh);
      this.a(dkf.mi);
      this.a(dkf.mj);
      this.a(dkf.mk);
      this.a(dkf.ml);
      this.a(dkf.mm);
      this.a(dkf.mn);
      this.a(or.a, dkf.mo, dkf.mp, dkf.mq, dkf.mr, dkf.ms, dkf.mt, dkf.mu, dkf.mv, dkf.mw, dkf.mx, dkf.my, dkf.mz, dkf.mA, dkf.mB, dkf.mC, dkf.mD);
      this.a(dkf.iY);
      this.a(dkf.hG);
      this.a(dkf.hH);
      this.a(dkf.hI);
      this.a(dkf.hJ);
      this.a(dkf.hK);
      this.a(dkf.hL);
      this.a(dkf.hM);
      this.a(dkf.hN);
      this.a(dkf.hO);
      this.a(dkf.hP);
      this.a(dkf.hQ);
      this.a(dkf.hR);
      this.a(dkf.hS);
      this.a(dkf.hT);
      this.a(dkf.hU);
      this.a(dkf.hV);
      this.a(dkf.rq);
      this.h(dkf.aX, dkf.fm);
      this.h(dkf.ev, dkf.hW);
      this.h(dkf.ew, dkf.hX);
      this.h(dkf.ex, dkf.hY);
      this.h(dkf.ey, dkf.hZ);
      this.h(dkf.ez, dkf.ia);
      this.h(dkf.eA, dkf.ib);
      this.h(dkf.eB, dkf.ic);
      this.h(dkf.eC, dkf.id);
      this.h(dkf.eD, dkf.ie);
      this.h(dkf.eE, dkf.if);
      this.h(dkf.eF, dkf.ig);
      this.h(dkf.eG, dkf.ih);
      this.h(dkf.eH, dkf.ii);
      this.h(dkf.eI, dkf.ij);
      this.h(dkf.eJ, dkf.ik);
      this.h(dkf.eK, dkf.il);
      this.b(or.p, dkf.lI, dkf.lJ, dkf.lK, dkf.lL, dkf.lM, dkf.lN, dkf.lO, dkf.lP, dkf.lQ, dkf.lR, dkf.lS, dkf.lT, dkf.lU, dkf.lV, dkf.lW, dkf.lX);
      this.g(dkf.bH, dkf.iI);
      this.g(dkf.bI, dkf.iJ);
      this.g(dkf.bJ, dkf.iK);
      this.g(dkf.bK, dkf.iL);
      this.g(dkf.bL, dkf.iM);
      this.g(dkf.bM, dkf.iN);
      this.g(dkf.bN, dkf.iO);
      this.g(dkf.bO, dkf.iP);
      this.g(dkf.bP, dkf.iQ);
      this.g(dkf.bQ, dkf.iR);
      this.g(dkf.bR, dkf.iS);
      this.g(dkf.bS, dkf.iT);
      this.g(dkf.bT, dkf.iU);
      this.g(dkf.bU, dkf.iV);
      this.g(dkf.bV, dkf.iW);
      this.g(dkf.bW, dkf.iX);
      this.a(dkf.tk);
      this.a(dkf.eZ);
      this.a(dkf.bB, dkf.gx, nx.e.a);
      this.a(dkf.bY, dkf.gy, nx.e.b);
      this.a(dkf.ca, dkf.gz, nx.e.b);
      this.a(dkf.tZ, dkf.ub, nx.e.c);
      this.a(dkf.ua, dkf.uc, nx.e.b);
      this.a(dkf.cb, dkf.gA, nx.e.b);
      this.a(dkf.cc, dkf.gB, nx.e.b);
      this.a(dkf.cd, dkf.gC, nx.e.b);
      this.a(dkf.ce, dkf.gD, nx.e.b);
      this.a(dkf.cf, dkf.gE, nx.e.b);
      this.a(dkf.cg, dkf.gF, nx.e.b);
      this.a(dkf.ch, dkf.gG, nx.e.b);
      this.a(dkf.ci, dkf.gH, nx.e.b);
      this.a(dkf.cj, dkf.gI, nx.e.b);
      this.a(dkf.cl, dkf.gJ, nx.e.b);
      this.a(dkf.ck, dkf.gK, nx.e.b);
      this.a(dkf.cn, dkf.gL, nx.e.b);
      this.a(dkf.cm, dkf.gM, nx.e.b);
      this.a(dkf.bC, dkf.gN, nx.e.b);
      this.a(dkf.bZ, dkf.gn, nx.e.b);
      this.H();
      this.v(dkf.fh);
      this.v(dkf.fi);
      this.v(dkf.fj);
      this.a(dkf.bA, nx.e.a);
      this.b(dkf.ef, nx.e.a);
      this.a(cxk.dS);
      this.b(dkf.mE, dkf.mF, nx.e.b);
      this.a(cxk.dT);
      this.c(dkf.mF);
      this.b(dkf.ti, nx.e.b);
      this.c(dkf.ti);
      this.c(dkf.sY);
      this.b(dkf.pb, dkf.pc, nx.e.b);
      this.b(dkf.pd, dkf.pe, nx.e.b);
      this.b(dkf.pb, "_plant");
      this.c(dkf.pc);
      this.b(dkf.pd, "_plant");
      this.c(dkf.pe);
      this.a(dkf.nA, nx.e.a, op.c(op.a(dkf.nB, "_stage0")));
      this.m();
      this.a(dkf.bz, nx.e.b);
      this.c(dkf.jc, nx.e.b);
      this.c(dkf.jd, nx.e.b);
      this.c(dkf.je, nx.e.b);
      this.c(dkf.jf, nx.e.a);
      this.c(dkf.jg, nx.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dkf.mY, dkf.mT, dkf.mO, dkf.mJ, dkf.ni, dkf.nd, dkf.ns, dkf.nn);
      this.a(dkf.mZ, dkf.mU, dkf.mP, dkf.mK, dkf.nj, dkf.ne, dkf.nt, dkf.no);
      this.a(dkf.na, dkf.mV, dkf.mQ, dkf.mL, dkf.nk, dkf.nf, dkf.nu, dkf.np);
      this.a(dkf.nb, dkf.mW, dkf.mR, dkf.mM, dkf.nl, dkf.ng, dkf.nv, dkf.nq);
      this.a(dkf.nc, dkf.mX, dkf.mS, dkf.mN, dkf.nm, dkf.nh, dkf.nw, dkf.nr);
      this.e(dkf.fs, dkf.fq);
      this.e(dkf.fr, dkf.fp);
      this.m(dkf.af).c(dkf.af).a(dkf.aA);
      this.m(dkf.ar).c(dkf.ar).a(dkf.aJ);
      this.a(dkf.ar, dkf.du, dkf.dE);
      this.b(dkf.aS, or.t);
      this.m(dkf.ab).c(dkf.ab).a(dkf.ax);
      this.m(dkf.am).c(dkf.am).a(dkf.aF);
      this.a(dkf.am, dkf.dn, dkf.dz);
      this.a(dkf.D, dkf.gs, nx.e.b);
      this.b(dkf.aO, or.t);
      this.m(dkf.ac).d(dkf.ac).a(dkf.ay);
      this.m(dkf.an).d(dkf.an).a(dkf.aG);
      this.a(dkf.an, dkf.do, dkf.dA);
      this.a(dkf.E, dkf.gt, nx.e.b);
      this.b(dkf.aP, or.t);
      this.m(dkf.Z).c(dkf.Z).a(dkf.av);
      this.m(dkf.ak).c(dkf.ak).a(dkf.aD);
      this.a(dkf.ak, dkf.dm, dkf.dy);
      this.a(dkf.B, dkf.gq, nx.e.b);
      this.b(dkf.aM, or.t);
      this.m(dkf.X).c(dkf.X).a(dkf.at);
      this.m(dkf.aq).c(dkf.aq).a(dkf.aB);
      this.a(dkf.aq, dkf.dk, dkf.dw);
      this.a(dkf.z, dkf.go, nx.e.b);
      this.b(dkf.aK, or.t);
      this.m(dkf.Y).c(dkf.Y).a(dkf.au);
      this.m(dkf.aj).c(dkf.aj).a(dkf.aC);
      this.a(dkf.aj, dkf.dl, dkf.dx);
      this.a(dkf.A, dkf.gp, nx.e.b);
      this.b(dkf.aL, or.t);
      this.m(dkf.ad).c(dkf.ad).a(dkf.az);
      this.m(dkf.ao).c(dkf.ao).a(dkf.aH);
      this.a(dkf.ao, dkf.dq, dkf.dC);
      this.a(dkf.F, dkf.gu, nx.e.b);
      this.b(dkf.aQ, or.t);
      this.m(dkf.ae).c(dkf.ae).a(dkf.u);
      this.m(dkf.ap).c(dkf.ap).a(dkf.aI);
      this.a(dkf.ap, dkf.dr, dkf.dD);
      this.a(dkf.G, dkf.gv, nx.e.b);
      this.b(dkf.aR, or.t);
      this.m(dkf.aa).c(dkf.aa).a(dkf.aw);
      this.m(dkf.al).c(dkf.al).a(dkf.aE);
      this.a(dkf.al, dkf.dp, dkf.dB);
      this.a(dkf.C, dkf.gr, nx.e.b);
      this.b(dkf.aN, or.t);
      this.m(dkf.oU).b(dkf.oU).a(dkf.oW);
      this.m(dkf.oV).b(dkf.oV).a(dkf.oX);
      this.a(dkf.oV, dkf.ds, dkf.dF);
      this.a(dkf.oZ, dkf.pO, nx.e.b);
      this.n(dkf.pf, dkf.pQ);
      this.m(dkf.oL).b(dkf.oL).a(dkf.oN);
      this.m(dkf.oM).b(dkf.oM).a(dkf.oO);
      this.a(dkf.oM, dkf.dt, dkf.dG);
      this.a(dkf.oQ, dkf.pP, nx.e.b);
      this.n(dkf.oS, dkf.pR);
      this.m(dkf.ai).d(dkf.ai);
      this.m(dkf.as).d(dkf.as);
      this.a(dkf.x, dkf.dv, dkf.dH);
      this.b(dkf.oT, nx.e.b);
      this.a(cxk.dP);
      this.j(dkf.dK);
      this.l(dkf.iw);
      this.u();
      this.o(dkf.cY);
      this.p(dkf.bw);
      this.p(dkf.bx);
      this.p(dkf.hE);
      this.t();
      this.r(dkf.gi);
      this.r(dkf.li);
      this.r(dkf.lj);
      this.s(dkf.hp);
      this.s(dkf.hq);
      this.s(dkf.hr);
      this.o();
      this.p();
      this.d(dkf.cL, or.h);
      this.d(dkf.oy, or.h);
      this.d(dkf.ox, or.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dkf.eY, dkf.fg);
      this.k(dkf.m, dkf.fc);
      this.k(dkf.eX, dkf.ff);
      this.k(dkf.eW, dkf.fe);
      this.az();
      this.k(dkf.eV, dkf.fd);
      this.aA();
      cyp.b().forEach($$0 -> this.a($$0, om.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dkf.iv);
      of.a<Integer> $$0 = of.a(dye.aS);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alp $$3 = op.a(cxk.hZ, $$2);
         $$0.a($$1, oh.a().a(oi.c, oo.aa.a(dkf.iv, $$2, op.h($$3), this.c)));
         oo.bE.a(om.a(cxk.hZ, $$2), op.k($$3), this.c);
      }

      this.b.accept(oe.a(dkf.iv).a($$0));
   }

   private void o(dkd $$0, dkd $$1) {
      this.a($$0.j());
      op $$2 = op.b(op.J($$0));
      op $$3 = op.b(op.a($$0, "_lit"));
      alp $$4 = oo.bO.a($$0, "_one_candle", $$2, this.c);
      alp $$5 = oo.bP.a($$0, "_two_candles", $$2, this.c);
      alp $$6 = oo.bQ.a($$0, "_three_candles", $$2, this.c);
      alp $$7 = oo.bR.a($$0, "_four_candles", $$2, this.c);
      alp $$8 = oo.bO.a($$0, "_one_candle_lit", $$3, this.c);
      alp $$9 = oo.bP.a($$0, "_two_candles_lit", $$3, this.c);
      alp $$10 = oo.bQ.a($$0, "_three_candles_lit", $$3, this.c);
      alp $$11 = oo.bR.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            oe.a($$0)
               .a(
                  of.a(dye.aC, dye.v)
                     .a(1, false, oh.a().a(oi.c, $$4))
                     .a(2, false, oh.a().a(oi.c, $$5))
                     .a(3, false, oh.a().a(oi.c, $$6))
                     .a(4, false, oh.a().a(oi.c, $$7))
                     .a(1, true, oh.a().a(oi.c, $$8))
                     .a(2, true, oh.a().a(oi.c, $$9))
                     .a(3, true, oh.a().a(oi.c, $$10))
                     .a(4, true, oh.a().a(oi.c, $$11))
               )
         );
      alp $$12 = oo.bS.a($$1, op.a($$0, false), this.c);
      alp $$13 = oo.bS.a($$1, "_lit", op.a($$0, true), this.c);
      this.b.accept(oe.a($$1).a(a(dye.v, $$13, $$12)));
   }

   class a {
      private final alp b;

      public a(final alp $$0, final dkd $$1) {
         this.b = oo.aa.a($$0, op.x($$1), nx.this.c);
      }

      public nx.a a(dkd... $$0) {
         for (dkd $$1 : $$0) {
            nx.this.b.accept(nx.c($$1, this.b));
         }

         return this;
      }

      public nx.a b(dkd... $$0) {
         for (dkd $$1 : $$0) {
            nx.this.c($$1);
         }

         return this.a($$0);
      }

      public nx.a a(on $$0, dkd... $$1) {
         for (dkd $$2 : $$1) {
            $$0.a(om.a($$2.j()), op.x($$2), nx.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final op b;
      private final Map<on, alp> c = Maps.newHashMap();
      @Nullable
      private me d;
      @Nullable
      private alp e;
      private final Set<dkd> f = new HashSet<>();

      public b(final op $$0) {
         this.b = $$0;
      }

      public nx.b a(dkd $$0, on $$1) {
         this.e = $$1.a($$0, this.b, nx.this.c);
         if (nx.this.f.containsKey($$0)) {
            nx.this.b.accept(nx.this.f.get($$0).create($$0, this.e, this.b, nx.this.c));
         } else {
            nx.this.b.accept(nx.c($$0, this.e));
         }

         return this;
      }

      public nx.b a(dkd $$0, dkd $$1) {
         alp $$2 = om.a($$0);
         nx.this.b.accept(nx.c($$1, $$2));
         nx.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nx.b a(dkd $$0) {
         alp $$1 = oo.s.a($$0, this.b, nx.this.c);
         alp $$2 = oo.t.a($$0, this.b, nx.this.c);
         nx.this.b.accept(nx.b($$0, $$1, $$2));
         alp $$3 = oo.u.a($$0, this.b, nx.this.c);
         nx.this.a($$0, $$3);
         return this;
      }

      public nx.b b(dkd $$0) {
         alp $$1 = oo.M.a($$0, this.b, nx.this.c);
         alp $$2 = oo.N.a($$0, this.b, nx.this.c);
         alp $$3 = oo.O.a($$0, this.b, nx.this.c);
         nx.this.b.accept(nx.a($$0, $$1, $$2, $$3));
         alp $$4 = oo.P.a($$0, this.b, nx.this.c);
         nx.this.a($$0, $$4);
         return this;
      }

      public nx.b c(dkd $$0) {
         op $$1 = op.s($$0);
         alp $$2 = oo.D.a($$0, $$1, nx.this.c);
         alp $$3 = oo.E.a($$0, $$1, nx.this.c);
         alp $$4 = oo.F.a($$0, $$1, nx.this.c);
         alp $$5 = oo.G.a($$0, $$1, nx.this.c);
         alp $$6 = oo.H.a($$0, $$1, nx.this.c);
         nx.this.b.accept(nx.a($$0, $$2, $$3, $$4, $$5, $$6));
         alp $$7 = oo.I.a($$0, $$1, nx.this.c);
         nx.this.a($$0, $$7);
         return this;
      }

      public nx.b d(dkd $$0) {
         alp $$1 = oo.J.a($$0, this.b, nx.this.c);
         alp $$2 = oo.K.a($$0, this.b, nx.this.c);
         nx.this.b.accept(nx.c($$0, $$1, $$2));
         alp $$3 = oo.L.a($$0, this.b, nx.this.c);
         nx.this.a($$0, $$3);
         return this;
      }

      public nx.b e(dkd $$0) {
         op $$1 = op.s($$0);
         alp $$2 = oo.R.a($$0, $$1, nx.this.c);
         alp $$3 = oo.Q.a($$0, $$1, nx.this.c);
         alp $$4 = oo.T.a($$0, $$1, nx.this.c);
         alp $$5 = oo.S.a($$0, $$1, nx.this.c);
         nx.this.b.accept(nx.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nx.b f(dkd $$0) {
         alp $$1 = oo.V.a($$0, this.b, nx.this.c);
         alp $$2 = oo.U.a($$0, this.b, nx.this.c);
         alp $$3 = oo.X.a($$0, this.b, nx.this.c);
         alp $$4 = oo.W.a($$0, this.b, nx.this.c);
         nx.this.b.accept(nx.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nx.b g(dkd $$0) {
         alp $$1 = oo.Y.a($$0, this.b, nx.this.c);
         alp $$2 = oo.Z.a($$0, this.b, nx.this.c);
         nx.this.b.accept(nx.e($$0, $$1, $$2));
         return this;
      }

      public nx.b h(dkd $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dkd $$1 = this.d.b().get(me.b.r);
            alp $$2 = oo.aa.a($$0, this.b, nx.this.c);
            nx.this.b.accept(nx.c($$0, $$2));
            nx.this.b.accept(nx.c($$1, $$2));
            nx.this.a($$0.j());
            nx.this.c($$1);
            return this;
         }
      }

      public nx.b i(dkd $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alp $$1 = this.a(oo.ab, $$0);
            alp $$2 = this.a(oo.ac, $$0);
            nx.this.b.accept(nx.e($$0, $$1, $$2, this.e));
            nx.this.a($$0, $$1);
            return this;
         }
      }

      public nx.b j(dkd $$0) {
         alp $$1 = this.a(oo.af, $$0);
         alp $$2 = this.a(oo.ae, $$0);
         alp $$3 = this.a(oo.ag, $$0);
         nx.this.b.accept(nx.b($$0, $$1, $$2, $$3));
         nx.this.a($$0, $$2);
         return this;
      }

      private nx.b k(dkd $$0) {
         or $$1 = nx.this.g.getOrDefault($$0, or.a.get($$0));
         alp $$2 = $$1.a($$0, nx.this.c);
         nx.this.b.accept(nx.c($$0, $$2));
         return this;
      }

      private nx.b l(dkd $$0) {
         nx.this.j($$0);
         return this;
      }

      private void m(dkd $$0) {
         if (nx.this.e.contains($$0)) {
            nx.this.l($$0);
         } else {
            nx.this.k($$0);
         }
      }

      private alp a(on $$0, dkd $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nx.this.c));
      }

      public nx.b a(me $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nx.b, dkd> $$2 = nx.h.get($$0x);
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
      ob create(dkd var1, alp var2, op var3, BiConsumer<alp, Supplier<JsonElement>> var4);
   }

   static record d(on a, String b) {
   }

   static enum e {
      a(oo.ap, oo.as, false),
      b(oo.ao, oo.ar, false),
      c(oo.aq, oo.at, true);

      private final on d;
      private final on e;
      private final boolean f;

      private e(final on $$0, final on $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public on a() {
         return this.d;
      }

      public on b() {
         return this.e;
      }

      public void a(nx $$0, dkd $$1) {
         if (this.f) {
            $$0.a($$1, "_emissive");
         } else {
            $$0.d($$1);
         }
      }

      public op a(dkd $$0) {
         return this.f ? op.e($$0) : op.c($$0);
      }

      public op b(dkd $$0) {
         return this.f ? op.g($$0) : op.f($$0);
      }
   }

   class f {
      private final op b;

      public f(final op $$0) {
         this.b = $$0;
      }

      public nx.f a(dkd $$0) {
         op $$1 = this.b.c(oq.d, this.b.a(oq.i));
         alp $$2 = oo.j.a($$0, $$1, nx.this.c);
         nx.this.b.accept(nx.d($$0, $$2));
         return this;
      }

      public nx.f b(dkd $$0) {
         alp $$1 = oo.j.a($$0, this.b, nx.this.c);
         nx.this.b.accept(nx.d($$0, $$1));
         return this;
      }

      public nx.f c(dkd $$0) {
         alp $$1 = oo.j.a($$0, this.b, nx.this.c);
         alp $$2 = oo.k.a($$0, this.b, nx.this.c);
         nx.this.b.accept(nx.d($$0, $$1, $$2));
         return this;
      }

      public nx.f d(dkd $$0) {
         nx.this.b.accept(nx.a($$0, this.b, nx.this.c));
         return this;
      }
   }
}
