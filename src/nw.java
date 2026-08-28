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

public class nw {
   final Consumer<oa> b;
   final BiConsumer<alj, Supplier<JsonElement>> c;
   private final Consumer<cwi> d;
   final List<diq> e = ImmutableList.of(dis.ey, dis.eE, dis.hY);
   final Map<diq, nw.c> f = ImmutableMap.builder().put(dis.b, nw::a).put(dis.sJ, nw::c).put(dis.eM, nw::b).build();
   final Map<diq, oq> g = ImmutableMap.builder()
      .put(dis.aV, oq.y.get(dis.aV))
      .put(dis.jp, oq.y.get(dis.jp))
      .put(dis.jS, oq.a(oo.a(dis.aV, "_top")))
      .put(dis.jU, oq.a(oo.a(dis.jp, "_top")))
      .put(dis.aX, oq.d.get(dis.aV).a($$0x -> $$0x.a(op.i, oo.G(dis.aX))))
      .put(dis.jr, oq.d.get(dis.jp).a($$0x -> $$0x.a(op.i, oo.G(dis.jr))))
      .put(dis.hd, oq.d.get(dis.hd))
      .put(dis.jT, oq.a(oo.a(dis.hd, "_bottom")))
      .put(dis.pr, oq.z.get(dis.pr))
      .put(dis.sJ, oq.z.get(dis.sJ))
      .put(dis.he, oq.d.get(dis.he).a($$0x -> $$0x.a(op.i, oo.G(dis.he))))
      .put(dis.aW, oq.d.get(dis.aW).a($$0x -> {
         $$0x.a(op.d, oo.a(dis.aV, "_top"));
         $$0x.a(op.i, oo.G(dis.aW));
      }))
      .put(dis.jq, oq.d.get(dis.jq).a($$0x -> {
         $$0x.a(op.d, oo.a(dis.jp, "_top"));
         $$0x.a(op.i, oo.G(dis.jq));
      }))
      .put(dis.qM, oq.z.get(dis.qM))
      .put(dis.qH, oq.z.get(dis.qH))
      .build();
   static final Map<md.b, BiConsumer<nw.b, diq>> h = ImmutableMap.builder()
      .put(md.b.a, nw.b::a)
      .put(md.b.e, nw.b::l)
      .put(md.b.b, nw.b::k)
      .put(md.b.c, nw.b::k)
      .put(md.b.f, nw.b::c)
      .put(md.b.g, nw.b::d)
      .put(md.b.h, nw.b::e)
      .put(md.b.i, nw.b::f)
      .put(md.b.k, nw.b::h)
      .put(md.b.l, nw.b::i)
      .put(md.b.m, nw.b::j)
      .put(md.b.n, nw.b::g)
      .put(md.b.p, nw.b::m)
      .put(md.b.q, nw.b::b)
      .build();
   public static final List<Pair<dwm, Function<alj, og>>> a = List.of(
      Pair.of(dwl.L, (Function<alj, og>)$$0 -> og.a().a(oh.c, $$0)),
      Pair.of(dwl.M, (Function<alj, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.b, oh.a.b).a(oh.d, true)),
      Pair.of(dwl.N, (Function<alj, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.b, oh.a.c).a(oh.d, true)),
      Pair.of(dwl.O, (Function<alj, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.b, oh.a.d).a(oh.d, true)),
      Pair.of(dwl.J, (Function<alj, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.a, oh.a.d).a(oh.d, true)),
      Pair.of(dwl.K, (Function<alj, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.a, oh.a.b).a(oh.d, true))
   );
   private static final Map<nw.d, alj> i = new HashMap<>();

   private static oa a(diq $$0, alj $$1, oo $$2, BiConsumer<alj, Supplier<JsonElement>> $$3) {
      alj $$4 = on.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static oa b(diq $$0, alj $$1, oo $$2, BiConsumer<alj, Supplier<JsonElement>> $$3) {
      alj $$4 = on.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static oa c(diq $$0, alj $$1, oo $$2, BiConsumer<alj, Supplier<JsonElement>> $$3) {
      alj $$4 = on.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nw(Consumer<oa> $$0, BiConsumer<alj, Supplier<JsonElement>> $$1, Consumer<cwi> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(diq $$0) {
      this.d.accept($$0.j());
   }

   void a(diq $$0, alj $$1) {
      this.c.accept(ol.a($$0.j()), new ok($$1));
   }

   private void a(cwi $$0, alj $$1) {
      this.c.accept(ol.a($$0), new ok($$1));
   }

   void a(cwi $$0) {
      on.bB.a(ol.a($$0), oo.b($$0), this.c);
   }

   private void d(diq $$0) {
      cwi $$1 = $$0.j();
      if ($$1 != cwq.a) {
         on.bB.a(ol.a($$1), oo.F($$0), this.c);
      }
   }

   private void a(diq $$0, String $$1) {
      cwi $$2 = $$0.j();
      on.bB.a(ol.a($$2), oo.k(oo.a($$0, $$1)), this.c);
   }

   private static oe b() {
      return oe.a(dwl.R).a(jm.f, og.a().a(oh.b, oh.a.b)).a(jm.d, og.a().a(oh.b, oh.a.c)).a(jm.e, og.a().a(oh.b, oh.a.d)).a(jm.c, og.a());
   }

   private static oe c() {
      return oe.a(dwl.R).a(jm.d, og.a()).a(jm.e, og.a().a(oh.b, oh.a.b)).a(jm.c, og.a().a(oh.b, oh.a.c)).a(jm.f, og.a().a(oh.b, oh.a.d));
   }

   private static oe d() {
      return oe.a(dwl.R).a(jm.f, og.a()).a(jm.d, og.a().a(oh.b, oh.a.b)).a(jm.e, og.a().a(oh.b, oh.a.c)).a(jm.c, og.a().a(oh.b, oh.a.d));
   }

   private static oe e() {
      return oe.a(dwl.P)
         .a(jm.a, og.a().a(oh.a, oh.a.b))
         .a(jm.b, og.a().a(oh.a, oh.a.d))
         .a(jm.c, og.a())
         .a(jm.d, og.a().a(oh.b, oh.a.c))
         .a(jm.e, og.a().a(oh.b, oh.a.d))
         .a(jm.f, og.a().a(oh.b, oh.a.b));
   }

   private static od b(diq $$0, alj $$1) {
      return od.a($$0, a($$1));
   }

   private static og[] a(alj $$0) {
      return new og[]{og.a().a(oh.c, $$0), og.a().a(oh.c, $$0).a(oh.b, oh.a.b), og.a().a(oh.c, $$0).a(oh.b, oh.a.c), og.a().a(oh.c, $$0).a(oh.b, oh.a.d)};
   }

   private static od a(diq $$0, alj $$1, alj $$2) {
      return od.a($$0, og.a().a(oh.c, $$1), og.a().a(oh.c, $$2), og.a().a(oh.c, $$1).a(oh.b, oh.a.c), og.a().a(oh.c, $$2).a(oh.b, oh.a.c));
   }

   private static oe a(dwm $$0, alj $$1, alj $$2) {
      return oe.a($$0).a(true, og.a().a(oh.c, $$1)).a(false, og.a().a(oh.c, $$2));
   }

   private void e(diq $$0) {
      alj $$1 = oq.a.create($$0, this.c);
      alj $$2 = oq.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(diq $$0) {
      alj $$1 = oq.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(diq $$0) {
      this.b.accept(od.a($$0).a(oe.a(dwl.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         alj $$3 = oo.a($$0, $$2);
         return og.a().a(oh.c, on.c.a($$0, $$2, new oo().a(op.a, $$3), this.c));
      })));
      this.a($$0, oo.a($$0, "_0"));
   }

   static oa b(diq $$0, alj $$1, alj $$2) {
      return od.a($$0)
         .a(oe.a(dwl.w).a(false, og.a().a(oh.c, $$1)).a(true, og.a().a(oh.c, $$2)))
         .a(
            oe.a(dwl.U, dwl.R)
               .a(dwg.a, jm.f, og.a().a(oh.b, oh.a.b))
               .a(dwg.a, jm.e, og.a().a(oh.b, oh.a.d))
               .a(dwg.a, jm.d, og.a().a(oh.b, oh.a.c))
               .a(dwg.a, jm.c, og.a())
               .a(dwg.b, jm.f, og.a().a(oh.b, oh.a.b).a(oh.a, oh.a.b).a(oh.d, true))
               .a(dwg.b, jm.e, og.a().a(oh.b, oh.a.d).a(oh.a, oh.a.b).a(oh.d, true))
               .a(dwg.b, jm.d, og.a().a(oh.b, oh.a.c).a(oh.a, oh.a.b).a(oh.d, true))
               .a(dwg.b, jm.c, og.a().a(oh.a, oh.a.b).a(oh.d, true))
               .a(dwg.c, jm.f, og.a().a(oh.b, oh.a.d).a(oh.a, oh.a.c))
               .a(dwg.c, jm.e, og.a().a(oh.b, oh.a.b).a(oh.a, oh.a.c))
               .a(dwg.c, jm.d, og.a().a(oh.a, oh.a.c))
               .a(dwg.c, jm.c, og.a().a(oh.b, oh.a.c).a(oh.a, oh.a.c))
         );
   }

   private static oe.d<jm, dwq, dwp, Boolean> a(oe.d<jm, dwq, dwp, Boolean> $$0, dwq $$1, alj $$2, alj $$3, alj $$4, alj $$5) {
      return $$0.a(jm.f, $$1, dwp.a, false, og.a().a(oh.c, $$2))
         .a(jm.d, $$1, dwp.a, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
         .a(jm.e, $$1, dwp.a, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.c))
         .a(jm.c, $$1, dwp.a, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.d))
         .a(jm.f, $$1, dwp.b, false, og.a().a(oh.c, $$4))
         .a(jm.d, $$1, dwp.b, false, og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
         .a(jm.e, $$1, dwp.b, false, og.a().a(oh.c, $$4).a(oh.b, oh.a.c))
         .a(jm.c, $$1, dwp.b, false, og.a().a(oh.c, $$4).a(oh.b, oh.a.d))
         .a(jm.f, $$1, dwp.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
         .a(jm.d, $$1, dwp.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
         .a(jm.e, $$1, dwp.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
         .a(jm.c, $$1, dwp.a, true, og.a().a(oh.c, $$3))
         .a(jm.f, $$1, dwp.b, true, og.a().a(oh.c, $$5).a(oh.b, oh.a.d))
         .a(jm.d, $$1, dwp.b, true, og.a().a(oh.c, $$5))
         .a(jm.e, $$1, dwp.b, true, og.a().a(oh.c, $$5).a(oh.b, oh.a.b))
         .a(jm.c, $$1, dwp.b, true, og.a().a(oh.c, $$5).a(oh.b, oh.a.c));
   }

   private static oa a(diq $$0, alj $$1, alj $$2, alj $$3, alj $$4, alj $$5, alj $$6, alj $$7, alj $$8) {
      return od.a($$0).a(a(a(oe.a(dwl.R, dwl.ae, dwl.be, dwl.u), dwq.b, $$1, $$2, $$3, $$4), dwq.a, $$5, $$6, $$7, $$8));
   }

   static oa a(diq $$0, alj $$1, alj $$2, alj $$3, alj $$4, alj $$5) {
      return oc.a($$0)
         .a(og.a().a(oh.c, $$1))
         .a(ob.a().a(dwl.L, true), og.a().a(oh.c, $$2).a(oh.d, false))
         .a(ob.a().a(dwl.M, true), og.a().a(oh.c, $$3).a(oh.d, false))
         .a(ob.a().a(dwl.N, true), og.a().a(oh.c, $$4).a(oh.d, false))
         .a(ob.a().a(dwl.O, true), og.a().a(oh.c, $$5).a(oh.d, false));
   }

   static oa c(diq $$0, alj $$1, alj $$2) {
      return oc.a($$0)
         .a(og.a().a(oh.c, $$1))
         .a(ob.a().a(dwl.L, true), og.a().a(oh.c, $$2).a(oh.d, true))
         .a(ob.a().a(dwl.M, true), og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, true))
         .a(ob.a().a(dwl.N, true), og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, true))
         .a(ob.a().a(dwl.O, true), og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, true));
   }

   static oa a(diq $$0, alj $$1, alj $$2, alj $$3) {
      return oc.a($$0)
         .a(ob.a().a(dwl.J, true), og.a().a(oh.c, $$1))
         .a(ob.a().a(dwl.X, dxg.b), og.a().a(oh.c, $$2).a(oh.d, true))
         .a(ob.a().a(dwl.W, dxg.b), og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, true))
         .a(ob.a().a(dwl.Y, dxg.b), og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, true))
         .a(ob.a().a(dwl.Z, dxg.b), og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, true))
         .a(ob.a().a(dwl.X, dxg.c), og.a().a(oh.c, $$3).a(oh.d, true))
         .a(ob.a().a(dwl.W, dxg.c), og.a().a(oh.c, $$3).a(oh.b, oh.a.b).a(oh.d, true))
         .a(ob.a().a(dwl.Y, dxg.c), og.a().a(oh.c, $$3).a(oh.b, oh.a.c).a(oh.d, true))
         .a(ob.a().a(dwl.Z, dxg.c), og.a().a(oh.c, $$3).a(oh.b, oh.a.d).a(oh.d, true));
   }

   static oa a(diq $$0, alj $$1, alj $$2, alj $$3, alj $$4, boolean $$5) {
      return od.a($$0, og.a().a(oh.d, $$5))
         .a(c())
         .a(
            oe.a(dwl.q, dwl.u)
               .a(false, false, og.a().a(oh.c, $$2))
               .a(true, false, og.a().a(oh.c, $$4))
               .a(false, true, og.a().a(oh.c, $$1))
               .a(true, true, og.a().a(oh.c, $$3))
         );
   }

   static oa b(diq $$0, alj $$1, alj $$2, alj $$3) {
      return od.a($$0)
         .a(
            oe.a(dwl.R, dwl.af, dwl.bi)
               .a(jm.f, dwt.b, dxd.a, og.a().a(oh.c, $$2))
               .a(jm.e, dwt.b, dxd.a, og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwt.b, dxd.a, og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwt.b, dxd.a, og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwt.b, dxd.e, og.a().a(oh.c, $$3))
               .a(jm.e, dwt.b, dxd.e, og.a().a(oh.c, $$3).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwt.b, dxd.e, og.a().a(oh.c, $$3).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwt.b, dxd.e, og.a().a(oh.c, $$3).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwt.b, dxd.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.e, dwt.b, dxd.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.d, dwt.b, dxd.d, og.a().a(oh.c, $$3))
               .a(jm.c, dwt.b, dxd.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.f, dwt.b, dxd.c, og.a().a(oh.c, $$1))
               .a(jm.e, dwt.b, dxd.c, og.a().a(oh.c, $$1).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwt.b, dxd.c, og.a().a(oh.c, $$1).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwt.b, dxd.c, og.a().a(oh.c, $$1).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwt.b, dxd.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.e, dwt.b, dxd.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.d, dwt.b, dxd.b, og.a().a(oh.c, $$1))
               .a(jm.c, dwt.b, dxd.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.f, dwt.a, dxd.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.e, dwt.a, dxd.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwt.a, dxd.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwt.a, dxd.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwt.a, dxd.e, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.e, dwt.a, dxd.e, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.d, dwt.a, dxd.e, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.c, dwt.a, dxd.e, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.f, dwt.a, dxd.d, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.e, dwt.a, dxd.d, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwt.a, dxd.d, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwt.a, dxd.d, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwt.a, dxd.c, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.e, dwt.a, dxd.c, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.d, dwt.a, dxd.c, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.c, dwt.a, dxd.c, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.f, dwt.a, dxd.b, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.e, dwt.a, dxd.b, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwt.a, dxd.b, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwt.a, dxd.b, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
         );
   }

   private static oa c(diq $$0, alj $$1, alj $$2, alj $$3) {
      return od.a($$0)
         .a(
            oe.a(dwl.R, dwl.af, dwl.u)
               .a(jm.c, dwt.b, false, og.a().a(oh.c, $$2))
               .a(jm.d, dwt.b, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.c))
               .a(jm.f, dwt.b, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
               .a(jm.e, dwt.b, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.d))
               .a(jm.c, dwt.a, false, og.a().a(oh.c, $$1))
               .a(jm.d, dwt.a, false, og.a().a(oh.c, $$1).a(oh.b, oh.a.c))
               .a(jm.f, dwt.a, false, og.a().a(oh.c, $$1).a(oh.b, oh.a.b))
               .a(jm.e, dwt.a, false, og.a().a(oh.c, $$1).a(oh.b, oh.a.d))
               .a(jm.c, dwt.b, true, og.a().a(oh.c, $$3))
               .a(jm.d, dwt.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               .a(jm.f, dwt.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(jm.e, dwt.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
               .a(jm.c, dwt.a, true, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.c))
               .a(jm.d, dwt.a, true, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.a))
               .a(jm.f, dwt.a, true, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.d))
               .a(jm.e, dwt.a, true, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.b))
         );
   }

   private static oa d(diq $$0, alj $$1, alj $$2, alj $$3) {
      return od.a($$0)
         .a(
            oe.a(dwl.R, dwl.af, dwl.u)
               .a(jm.c, dwt.b, false, og.a().a(oh.c, $$2))
               .a(jm.d, dwt.b, false, og.a().a(oh.c, $$2))
               .a(jm.f, dwt.b, false, og.a().a(oh.c, $$2))
               .a(jm.e, dwt.b, false, og.a().a(oh.c, $$2))
               .a(jm.c, dwt.a, false, og.a().a(oh.c, $$1))
               .a(jm.d, dwt.a, false, og.a().a(oh.c, $$1))
               .a(jm.f, dwt.a, false, og.a().a(oh.c, $$1))
               .a(jm.e, dwt.a, false, og.a().a(oh.c, $$1))
               .a(jm.c, dwt.b, true, og.a().a(oh.c, $$3))
               .a(jm.d, dwt.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               .a(jm.f, dwt.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(jm.e, dwt.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
               .a(jm.c, dwt.a, true, og.a().a(oh.c, $$3))
               .a(jm.d, dwt.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               .a(jm.f, dwt.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(jm.e, dwt.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
         );
   }

   static od c(diq $$0, alj $$1) {
      return od.a($$0, og.a().a(oh.c, $$1));
   }

   private static oe f() {
      return oe.a(dwl.I).a(jm.a.b, og.a()).a(jm.a.c, og.a().a(oh.a, oh.a.b)).a(jm.a.a, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.b));
   }

   static oa a(diq $$0, oo $$1, BiConsumer<alj, Supplier<JsonElement>> $$2) {
      alj $$3 = on.g.a($$0, $$1, $$2);
      alj $$4 = on.h.a($$0, $$1, $$2);
      alj $$5 = on.i.a($$0, $$1, $$2);
      alj $$6 = on.j.a($$0, $$1, $$2);
      return od.a($$0, og.a().a(oh.c, $$6)).a(oe.a(dwl.I).a(jm.a.a, og.a().a(oh.c, $$3)).a(jm.a.b, og.a().a(oh.c, $$4)).a(jm.a.c, og.a().a(oh.c, $$5)));
   }

   static oa d(diq $$0, alj $$1) {
      return od.a($$0, og.a().a(oh.c, $$1)).a(f());
   }

   private void e(diq $$0, alj $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(diq $$0, oq.a $$1) {
      alj $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(diq $$0, oq.a $$1) {
      alj $$2 = $$1.create($$0, this.c);
      this.b.accept(od.a($$0, og.a().a(oh.c, $$2)).a(b()));
   }

   static oa d(diq $$0, alj $$1, alj $$2) {
      return od.a($$0)
         .a(
            oe.a(dwl.I)
               .a(jm.a.b, og.a().a(oh.c, $$1))
               .a(jm.a.c, og.a().a(oh.c, $$2).a(oh.a, oh.a.b))
               .a(jm.a.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.b).a(oh.b, oh.a.b))
         );
   }

   private void a(diq $$0, oq.a $$1, oq.a $$2) {
      alj $$3 = $$1.create($$0, this.c);
      alj $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private alj a(diq $$0, String $$1, om $$2, Function<alj, oo> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oo.a($$0, $$1)), this.c);
   }

   static oa e(diq $$0, alj $$1, alj $$2) {
      return od.a($$0).a(a(dwl.w, $$2, $$1));
   }

   static oa e(diq $$0, alj $$1, alj $$2, alj $$3) {
      return od.a($$0).a(oe.a(dwl.bh).a(dxc.b, og.a().a(oh.c, $$1)).a(dxc.a, og.a().a(oh.c, $$2)).a(dxc.c, og.a().a(oh.c, $$3)));
   }

   public void a(diq $$0) {
      this.b($$0, oq.a);
   }

   public void b(diq $$0, oq.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(diq $$0, oo $$1, om $$2) {
      alj $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nw.b h(diq $$0) {
      oq $$1 = this.g.getOrDefault($$0, oq.a.get($$0));
      return new nw.b($$1.b()).a($$0, $$1.a());
   }

   public void a(diq $$0, diq $$1, diq $$2) {
      oo $$3 = oo.u($$0);
      alj $$4 = on.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void i(diq $$0) {
      oo $$1 = oo.t($$0);
      alj $$2 = on.v.a($$0, $$1, this.c);
      alj $$3 = on.w.a($$0, $$1, this.c);
      alj $$4 = on.x.a($$0, $$1, this.c);
      alj $$5 = on.y.a($$0, $$1, this.c);
      alj $$6 = on.z.a($$0, $$1, this.c);
      alj $$7 = on.A.a($$0, $$1, this.c);
      alj $$8 = on.B.a($$0, $$1, this.c);
      alj $$9 = on.C.a($$0, $$1, this.c);
      this.a($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(diq $$0, diq $$1) {
      alj $$2 = on.v.a($$0);
      alj $$3 = on.w.a($$0);
      alj $$4 = on.x.a($$0);
      alj $$5 = on.y.a($$0);
      alj $$6 = on.z.a($$0);
      alj $$7 = on.A.a($$0);
      alj $$8 = on.B.a($$0);
      alj $$9 = on.C.a($$0);
      this.a($$1, ol.a($$0.j()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(diq $$0) {
      oo $$1 = oo.b($$0);
      alj $$2 = on.ak.a($$0, $$1, this.c);
      alj $$3 = on.al.a($$0, $$1, this.c);
      alj $$4 = on.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(diq $$0) {
      oo $$1 = oo.b($$0);
      alj $$2 = on.ah.a($$0, $$1, this.c);
      alj $$3 = on.ai.a($$0, $$1, this.c);
      alj $$4 = on.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(diq $$0, diq $$1) {
      alj $$2 = on.ah.a($$0);
      alj $$3 = on.ai.a($$0);
      alj $$4 = on.aj.a($$0);
      this.a($$1, ol.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dis.sD);
      alj $$0 = ol.a(dis.sD);
      alj $$1 = ol.a(dis.sD, "_partial_tilt");
      alj $$2 = ol.a(dis.sD, "_full_tilt");
      this.b
         .accept(
            od.a(dis.sD)
               .a(b())
               .a(oe.a(dwl.bl).a(dxf.a, og.a().a(oh.c, $$0)).a(dxf.b, og.a().a(oh.c, $$0)).a(dxf.c, og.a().a(oh.c, $$1)).a(dxf.d, og.a().a(oh.c, $$2)))
         );
   }

   private nw.f l(diq $$0) {
      return new nw.f(oo.n($$0));
   }

   private void m(diq $$0) {
      this.c($$0, $$0);
   }

   private void c(diq $$0, diq $$1) {
      this.b.accept(c($$0, ol.a($$1)));
   }

   private void a(diq $$0, nw.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(diq $$0, nw.e $$1, oo $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(diq $$0, nw.e $$1) {
      oo $$2 = oo.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(diq $$0, nw.e $$1, oo $$2) {
      alj $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(diq $$0, nw.e $$1, dwx<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         oe $$4 = oe.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            oo $$5 = oo.c(oo.a($$0, $$4x));
            alj $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return og.a().a(oh.c, $$6);
         });
         this.a($$0.j());
         this.b.accept(od.a($$0).a($$4));
      }
   }

   private void a(diq $$0, diq $$1, nw.e $$2) {
      this.a($$0, $$2);
      oo $$3 = oo.d($$0);
      alj $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(diq $$0, diq $$1) {
      oq $$2 = oq.p.get($$0);
      alj $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alj $$4 = on.aC.a($$1, $$2.b(), this.c);
      this.b.accept(od.a($$1, og.a().a(oh.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(diq $$0, diq $$1) {
      this.a($$0.j());
      oo $$2 = oo.h($$0);
      oo $$3 = oo.a($$0, $$1);
      alj $$4 = on.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            od.a($$1, og.a().a(oh.c, $$4))
               .a(oe.a(dwl.R).a(jm.e, og.a()).a(jm.d, og.a().a(oh.b, oh.a.d)).a(jm.c, og.a().a(oh.b, oh.a.b)).a(jm.f, og.a().a(oh.b, oh.a.c)))
         );
      this.b.accept(od.a($$0).a(oe.a(dwl.av).a($$2x -> og.a().a(oh.c, on.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      diq $$0 = dis.kC;
      this.a($$0.j());
      alj $$1 = ol.a($$0, "_top");
      alj $$2 = ol.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      diq $$0 = dis.kB;
      this.a($$0.j());
      oe $$1 = oe.a(doe.d, dwl.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> og.a().a(oh.c, ol.a($$0, "_top_stage_" + $$1x));
            case b -> og.a().a(oh.c, ol.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(od.a($$0).a($$1));
   }

   private void a(diq $$0, diq $$1, diq $$2, diq $$3, diq $$4, diq $$5, diq $$6, diq $$7) {
      this.a($$0, nw.e.b);
      this.a($$1, nw.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(diq $$0, nw.e $$1) {
      this.a($$0, "_top");
      alj $$2 = this.a($$0, "_top", $$1.a(), oo::c);
      alj $$3 = this.a($$0, "_bottom", $$1.a(), oo::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dis.iD, "_front");
      alj $$0 = ol.a(dis.iD, "_top");
      alj $$1 = this.a(dis.iD, "_bottom", nw.e.b.a(), oo::c);
      this.f(dis.iD, $$0, $$1);
   }

   private void k() {
      alj $$0 = this.a(dis.bx, "_top", on.bo, oo::a);
      alj $$1 = this.a(dis.bx, "_bottom", on.bo, oo::a);
      this.f(dis.bx, $$0, $$1);
   }

   private void l() {
      this.c(dis.sF);
      alj $$0 = ol.a(dis.sF, "_top");
      alj $$1 = ol.a(dis.sF, "_bottom");
      this.b.accept(od.a(dis.sF).a(b()).a(oe.a(dwl.ae).a(dwq.b, og.a().a(oh.c, $$1)).a(dwq.a, og.a().a(oh.c, $$0))));
   }

   private void f(diq $$0, alj $$1, alj $$2) {
      this.b.accept(od.a($$0).a(oe.a(dwl.ae).a(dwq.b, og.a().a(oh.c, $$2)).a(dwq.a, og.a().a(oh.c, $$1))));
   }

   private void n(diq $$0) {
      oo $$1 = oo.e($$0);
      oo $$2 = oo.e(oo.a($$0, "_corner"));
      alj $$3 = on.as.a($$0, $$1, this.c);
      alj $$4 = on.at.a($$0, $$2, this.c);
      alj $$5 = on.au.a($$0, $$1, this.c);
      alj $$6 = on.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            od.a($$0)
               .a(
                  oe.a(dwl.ag)
                     .a(dwy.a, og.a().a(oh.c, $$3))
                     .a(dwy.b, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
                     .a(dwy.c, og.a().a(oh.c, $$5).a(oh.b, oh.a.b))
                     .a(dwy.d, og.a().a(oh.c, $$6).a(oh.b, oh.a.b))
                     .a(dwy.e, og.a().a(oh.c, $$5))
                     .a(dwy.f, og.a().a(oh.c, $$6))
                     .a(dwy.g, og.a().a(oh.c, $$4))
                     .a(dwy.h, og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
                     .a(dwy.i, og.a().a(oh.c, $$4).a(oh.b, oh.a.c))
                     .a(dwy.j, og.a().a(oh.c, $$4).a(oh.b, oh.a.d))
               )
         );
   }

   private void o(diq $$0) {
      alj $$1 = this.a($$0, "", on.as, oo::e);
      alj $$2 = this.a($$0, "", on.au, oo::e);
      alj $$3 = this.a($$0, "", on.av, oo::e);
      alj $$4 = this.a($$0, "_on", on.as, oo::e);
      alj $$5 = this.a($$0, "_on", on.au, oo::e);
      alj $$6 = this.a($$0, "_on", on.av, oo::e);
      oe $$7 = oe.a(dwl.w, dwl.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return og.a().a(oh.c, $$6x ? $$4 : $$1);
            case b:
               return og.a().a(oh.c, $$6x ? $$4 : $$1).a(oh.b, oh.a.b);
            case c:
               return og.a().a(oh.c, $$6x ? $$5 : $$2).a(oh.b, oh.a.b);
            case d:
               return og.a().a(oh.c, $$6x ? $$6 : $$3).a(oh.b, oh.a.b);
            case e:
               return og.a().a(oh.c, $$6x ? $$5 : $$2);
            case f:
               return og.a().a(oh.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(od.a($$0).a($$7));
   }

   private nw.a a(alj $$0, diq $$1) {
      return new nw.a($$0, $$1);
   }

   private nw.a f(diq $$0, diq $$1) {
      return new nw.a(ol.a($$0), $$1);
   }

   private void a(diq $$0, cwi $$1) {
      alj $$2 = on.aa.a($$0, oo.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(diq $$0, alj $$1) {
      alj $$2 = on.aa.a($$0, oo.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(diq $$0, diq $$1) {
      this.a($$0);
      alj $$2 = oq.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(diq $$0) {
      this.a($$0.j());
      alj $$1 = oq.k.create($$0, this.c);
      alj $$2 = oq.l.create($$0, this.c);
      alj $$3 = oq.m.create($$0, this.c);
      alj $$4 = oq.n.create($$0, this.c);
      this.b
         .accept(
            oc.a($$0)
               .a(ob.a().a(dwl.S, 1, 2, 3, 4).a(dwl.R, jm.c), og.a().a(oh.c, $$1))
               .a(ob.a().a(dwl.S, 1, 2, 3, 4).a(dwl.R, jm.f), og.a().a(oh.c, $$1).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.S, 1, 2, 3, 4).a(dwl.R, jm.d), og.a().a(oh.c, $$1).a(oh.b, oh.a.c))
               .a(ob.a().a(dwl.S, 1, 2, 3, 4).a(dwl.R, jm.e), og.a().a(oh.c, $$1).a(oh.b, oh.a.d))
               .a(ob.a().a(dwl.S, 2, 3, 4).a(dwl.R, jm.c), og.a().a(oh.c, $$2))
               .a(ob.a().a(dwl.S, 2, 3, 4).a(dwl.R, jm.f), og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.S, 2, 3, 4).a(dwl.R, jm.d), og.a().a(oh.c, $$2).a(oh.b, oh.a.c))
               .a(ob.a().a(dwl.S, 2, 3, 4).a(dwl.R, jm.e), og.a().a(oh.c, $$2).a(oh.b, oh.a.d))
               .a(ob.a().a(dwl.S, 3, 4).a(dwl.R, jm.c), og.a().a(oh.c, $$3))
               .a(ob.a().a(dwl.S, 3, 4).a(dwl.R, jm.f), og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.S, 3, 4).a(dwl.R, jm.d), og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               .a(ob.a().a(dwl.S, 3, 4).a(dwl.R, jm.e), og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
               .a(ob.a().a(dwl.S, 4).a(dwl.R, jm.c), og.a().a(oh.c, $$4))
               .a(ob.a().a(dwl.S, 4).a(dwl.R, jm.f), og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.S, 4).a(dwl.R, jm.d), og.a().a(oh.c, $$4).a(oh.b, oh.a.c))
               .a(ob.a().a(dwl.S, 4).a(dwl.R, jm.e), og.a().a(oh.c, $$4).a(oh.b, oh.a.d))
         );
   }

   private void a(oq.a $$0, diq... $$1) {
      for (diq $$2 : $$1) {
         alj $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(oq.a $$0, diq... $$1) {
      for (diq $$2 : $$1) {
         alj $$3 = $$0.create($$2, this.c);
         this.b.accept(od.a($$2, og.a().a(oh.c, $$3)).a(c()));
      }
   }

   private void h(diq $$0, diq $$1) {
      this.a($$0);
      oo $$2 = oo.b($$0, $$1);
      alj $$3 = on.aI.a($$1, $$2, this.c);
      alj $$4 = on.aJ.a($$1, $$2, this.c);
      alj $$5 = on.aK.a($$1, $$2, this.c);
      alj $$6 = on.aG.a($$1, $$2, this.c);
      alj $$7 = on.aH.a($$1, $$2, this.c);
      cwi $$8 = $$1.j();
      on.bB.a(ol.a($$8), oo.F($$0), this.c);
      this.b
         .accept(
            oc.a($$1)
               .a(og.a().a(oh.c, $$3))
               .a(ob.a().a(dwl.L, true), og.a().a(oh.c, $$4))
               .a(ob.a().a(dwl.M, true), og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.N, true), og.a().a(oh.c, $$5))
               .a(ob.a().a(dwl.O, true), og.a().a(oh.c, $$5).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.L, false), og.a().a(oh.c, $$6))
               .a(ob.a().a(dwl.M, false), og.a().a(oh.c, $$7))
               .a(ob.a().a(dwl.N, false), og.a().a(oh.c, $$7).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.O, false), og.a().a(oh.c, $$6).a(oh.b, oh.a.d))
         );
   }

   private void q(diq $$0) {
      oo $$1 = oo.z($$0);
      alj $$2 = on.aL.a($$0, $$1, this.c);
      alj $$3 = this.a($$0, "_conditional", on.aL, $$1x -> $$1.c(op.i, $$1x));
      this.b.accept(od.a($$0).a(a(dwl.c, $$3, $$2)).a(e()));
   }

   private void r(diq $$0) {
      alj $$1 = oq.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<og> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> og.a().a(oh.c, ol.a(dis.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dis.mZ);
      this.b
         .accept(
            oc.a(dis.mZ)
               .a(ob.a().a(dwl.aq, 0), this.a(0))
               .a(ob.a().a(dwl.aq, 1), this.a(1))
               .a(ob.a().a(dwl.bk, dwh.b), og.a().a(oh.c, ol.a(dis.mZ, "_small_leaves")))
               .a(ob.a().a(dwl.bk, dwh.c), og.a().a(oh.c, ol.a(dis.mZ, "_large_leaves")))
         );
   }

   private oe n() {
      return oe.a(dwl.P)
         .a(jm.a, og.a().a(oh.a, oh.a.c))
         .a(jm.b, og.a())
         .a(jm.c, og.a().a(oh.a, oh.a.b))
         .a(jm.d, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.c))
         .a(jm.e, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.d))
         .a(jm.f, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.b));
   }

   private void o() {
      alj $$0 = oo.a(dis.nU, "_top_open");
      this.b
         .accept(
            od.a(dis.nU)
               .a(this.n())
               .a(
                  oe.a(dwl.u)
                     .a(false, og.a().a(oh.c, oq.f.create(dis.nU, this.c)))
                     .a(true, og.a().a(oh.c, oq.f.get(dis.nU).a($$1 -> $$1.a(op.f, $$0)).a(dis.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> oe a(dwx<T> $$0, T $$1, alj $$2, alj $$3) {
      og $$4 = og.a().a(oh.c, $$2);
      og $$5 = og.a().a(oh.c, $$3);
      return oe.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(diq $$0, Function<diq, oo> $$1) {
      oo $$2 = $$1.apply($$0).b(op.i, op.c);
      oo $$3 = $$2.c(op.g, oo.a($$0, "_front_honey"));
      alj $$4 = on.q.a($$0, "_empty", $$2, this.c);
      alj $$5 = on.q.a($$0, "_honey", $$3, this.c);
      this.c($$0);
      on.q.a(ol.a($$0.j(), "_empty"), $$2, this.c);
      on.q.a(ol.a($$0.j(), "_honey"), $$3, this.c);
      this.b.accept(od.a($$0).a(b()).a(a(dwl.aN, 5, $$5, $$4)));
   }

   private void a(diq $$0, dwx<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alj> $$3 = new Int2ObjectOpenHashMap();
         oe $$4 = oe.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alj $$5 = (alj)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, on.aV, oo::g));
            return og.a().a(oh.c, $$5);
         });
         this.a($$0.j());
         this.b.accept(od.a($$0).a($$4));
      }
   }

   private void p() {
      alj $$0 = ol.a(dis.od, "_floor");
      alj $$1 = ol.a(dis.od, "_ceiling");
      alj $$2 = ol.a(dis.od, "_wall");
      alj $$3 = ol.a(dis.od, "_between_walls");
      this.a(cwq.wK);
      this.b
         .accept(
            od.a(dis.od)
               .a(
                  oe.a(dwl.R, dwl.V)
                     .a(jm.c, dwj.a, og.a().a(oh.c, $$0))
                     .a(jm.d, dwj.a, og.a().a(oh.c, $$0).a(oh.b, oh.a.c))
                     .a(jm.f, dwj.a, og.a().a(oh.c, $$0).a(oh.b, oh.a.b))
                     .a(jm.e, dwj.a, og.a().a(oh.c, $$0).a(oh.b, oh.a.d))
                     .a(jm.c, dwj.b, og.a().a(oh.c, $$1))
                     .a(jm.d, dwj.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.c))
                     .a(jm.f, dwj.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.b))
                     .a(jm.e, dwj.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.d))
                     .a(jm.c, dwj.c, og.a().a(oh.c, $$2).a(oh.b, oh.a.d))
                     .a(jm.d, dwj.c, og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
                     .a(jm.f, dwj.c, og.a().a(oh.c, $$2))
                     .a(jm.e, dwj.c, og.a().a(oh.c, $$2).a(oh.b, oh.a.c))
                     .a(jm.d, dwj.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
                     .a(jm.c, dwj.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
                     .a(jm.f, dwj.d, og.a().a(oh.c, $$3))
                     .a(jm.e, dwj.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            od.a(dis.nZ, og.a().a(oh.c, ol.a(dis.nZ)))
               .a(
                  oe.a(dwl.U, dwl.R)
                     .a(dwg.a, jm.c, og.a())
                     .a(dwg.a, jm.f, og.a().a(oh.b, oh.a.b))
                     .a(dwg.a, jm.d, og.a().a(oh.b, oh.a.c))
                     .a(dwg.a, jm.e, og.a().a(oh.b, oh.a.d))
                     .a(dwg.b, jm.c, og.a().a(oh.a, oh.a.b))
                     .a(dwg.b, jm.f, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.b))
                     .a(dwg.b, jm.d, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.c))
                     .a(dwg.b, jm.e, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.d))
                     .a(dwg.c, jm.d, og.a().a(oh.a, oh.a.c))
                     .a(dwg.c, jm.e, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.b))
                     .a(dwg.c, jm.c, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.c))
                     .a(dwg.c, jm.f, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.d))
               )
         );
   }

   private void d(diq $$0, oq.a $$1) {
      alj $$2 = $$1.create($$0, this.c);
      alj $$3 = oo.a($$0, "_front_on");
      alj $$4 = $$1.get($$0).a($$1x -> $$1x.a(op.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(od.a($$0).a(a(dwl.r, $$4, $$2)).a(b()));
   }

   private void a(diq... $$0) {
      alj $$1 = ol.a("campfire_off");

      for (diq $$2 : $$0) {
         alj $$3 = on.bc.a($$2, oo.E($$2), this.c);
         this.a($$2.j());
         this.b.accept(od.a($$2).a(a(dwl.r, $$3, $$1)).a(c()));
      }
   }

   private void s(diq $$0) {
      alj $$1 = on.bx.a($$0, oo.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(diq $$0) {
      alj $$1;
      if ($$0 == dis.tj) {
         $$1 = on.bz.a($$0, oo.m($$0), this.c);
      } else {
         $$1 = on.by.a($$0, oo.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oo $$0 = oo.a(oo.G(dis.cl), oo.G(dis.n));
      alj $$1 = on.j.a(dis.cl, $$0, this.c);
      this.b.accept(c(dis.cl, $$1));
   }

   private void s() {
      this.a(cwq.lH);
      this.b
         .accept(
            oc.a(dis.cw)
               .a(
                  ob.b(
                     ob.a().a(dwl.ab, dwz.c).a(dwl.aa, dwz.c).a(dwl.ac, dwz.c).a(dwl.ad, dwz.c),
                     ob.a().a(dwl.ab, dwz.b, dwz.a).a(dwl.aa, dwz.b, dwz.a),
                     ob.a().a(dwl.aa, dwz.b, dwz.a).a(dwl.ac, dwz.b, dwz.a),
                     ob.a().a(dwl.ac, dwz.b, dwz.a).a(dwl.ad, dwz.b, dwz.a),
                     ob.a().a(dwl.ad, dwz.b, dwz.a).a(dwl.ab, dwz.b, dwz.a)
                  ),
                  og.a().a(oh.c, ol.a("redstone_dust_dot"))
               )
               .a(ob.a().a(dwl.ab, dwz.b, dwz.a), og.a().a(oh.c, ol.a("redstone_dust_side0")))
               .a(ob.a().a(dwl.ac, dwz.b, dwz.a), og.a().a(oh.c, ol.a("redstone_dust_side_alt0")))
               .a(ob.a().a(dwl.aa, dwz.b, dwz.a), og.a().a(oh.c, ol.a("redstone_dust_side_alt1")).a(oh.b, oh.a.d))
               .a(ob.a().a(dwl.ad, dwz.b, dwz.a), og.a().a(oh.c, ol.a("redstone_dust_side1")).a(oh.b, oh.a.d))
               .a(ob.a().a(dwl.ab, dwz.a), og.a().a(oh.c, ol.a("redstone_dust_up")))
               .a(ob.a().a(dwl.aa, dwz.a), og.a().a(oh.c, ol.a("redstone_dust_up")).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.ac, dwz.a), og.a().a(oh.c, ol.a("redstone_dust_up")).a(oh.b, oh.a.c))
               .a(ob.a().a(dwl.ad, dwz.a), og.a().a(oh.c, ol.a("redstone_dust_up")).a(oh.b, oh.a.d))
         );
   }

   private void t() {
      this.a(cwq.lL);
      this.b
         .accept(
            od.a(dis.gY)
               .a(c())
               .a(
                  oe.a(dwl.bd, dwl.w)
                     .a(dwo.a, false, og.a().a(oh.c, ol.a(dis.gY)))
                     .a(dwo.a, true, og.a().a(oh.c, ol.a(dis.gY, "_on")))
                     .a(dwo.b, false, og.a().a(oh.c, ol.a(dis.gY, "_subtract")))
                     .a(dwo.b, true, og.a().a(oh.c, ol.a(dis.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oo $$0 = oo.a(dis.jR);
      oo $$1 = oo.a(oo.a(dis.jE, "_side"), $$0.a(op.f));
      alj $$2 = on.ab.a(dis.jE, $$1, this.c);
      alj $$3 = on.ac.a(dis.jE, $$1, this.c);
      alj $$4 = on.j.b(dis.jE, "_double", $$1, this.c);
      this.b.accept(e(dis.jE, $$2, $$3, $$4));
      this.b.accept(c(dis.jR, on.c.a(dis.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cwq.sH);
      this.b
         .accept(
            oc.a(dis.fs)
               .a(og.a().a(oh.c, oo.G(dis.fs)))
               .a(ob.a().a(dwl.k, true), og.a().a(oh.c, oo.a(dis.fs, "_bottle0")))
               .a(ob.a().a(dwl.l, true), og.a().a(oh.c, oo.a(dis.fs, "_bottle1")))
               .a(ob.a().a(dwl.m, true), og.a().a(oh.c, oo.a(dis.fs, "_bottle2")))
               .a(ob.a().a(dwl.k, false), og.a().a(oh.c, oo.a(dis.fs, "_empty0")))
               .a(ob.a().a(dwl.l, false), og.a().a(oh.c, oo.a(dis.fs, "_empty1")))
               .a(ob.a().a(dwl.m, false), og.a().a(oh.c, oo.a(dis.fs, "_empty2")))
         );
   }

   private void u(diq $$0) {
      alj $$1 = on.bt.a($$0, oo.b($$0), this.c);
      alj $$2 = ol.a("mushroom_block_inside");
      this.b
         .accept(
            oc.a($$0)
               .a(ob.a().a(dwl.L, true), og.a().a(oh.c, $$1))
               .a(ob.a().a(dwl.M, true), og.a().a(oh.c, $$1).a(oh.b, oh.a.b).a(oh.d, true))
               .a(ob.a().a(dwl.N, true), og.a().a(oh.c, $$1).a(oh.b, oh.a.c).a(oh.d, true))
               .a(ob.a().a(dwl.O, true), og.a().a(oh.c, $$1).a(oh.b, oh.a.d).a(oh.d, true))
               .a(ob.a().a(dwl.J, true), og.a().a(oh.c, $$1).a(oh.a, oh.a.d).a(oh.d, true))
               .a(ob.a().a(dwl.K, true), og.a().a(oh.c, $$1).a(oh.a, oh.a.b).a(oh.d, true))
               .a(ob.a().a(dwl.L, false), og.a().a(oh.c, $$2))
               .a(ob.a().a(dwl.M, false), og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, false))
               .a(ob.a().a(dwl.N, false), og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, false))
               .a(ob.a().a(dwl.O, false), og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, false))
               .a(ob.a().a(dwl.J, false), og.a().a(oh.c, $$2).a(oh.a, oh.a.d).a(oh.d, false))
               .a(ob.a().a(dwl.K, false), og.a().a(oh.c, $$2).a(oh.a, oh.a.b).a(oh.d, false))
         );
      this.a($$0, oq.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cwq.rS);
      this.b
         .accept(
            od.a(dis.eg)
               .a(
                  oe.a(dwl.ay)
                     .a(0, og.a().a(oh.c, ol.a(dis.eg)))
                     .a(1, og.a().a(oh.c, ol.a(dis.eg, "_slice1")))
                     .a(2, og.a().a(oh.c, ol.a(dis.eg, "_slice2")))
                     .a(3, og.a().a(oh.c, ol.a(dis.eg, "_slice3")))
                     .a(4, og.a().a(oh.c, ol.a(dis.eg, "_slice4")))
                     .a(5, og.a().a(oh.c, ol.a(dis.eg, "_slice5")))
                     .a(6, og.a().a(oh.c, ol.a(dis.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oo $$0 = new oo()
         .a(op.c, oo.a(dis.nX, "_side3"))
         .a(op.o, oo.G(dis.t))
         .a(op.n, oo.a(dis.nX, "_top"))
         .a(op.j, oo.a(dis.nX, "_side3"))
         .a(op.l, oo.a(dis.nX, "_side3"))
         .a(op.k, oo.a(dis.nX, "_side1"))
         .a(op.m, oo.a(dis.nX, "_side2"));
      this.b.accept(c(dis.nX, on.a.a(dis.nX, $$0, this.c)));
   }

   private void y() {
      oo $$0 = new oo()
         .a(op.c, oo.a(dis.ob, "_front"))
         .a(op.o, oo.a(dis.ob, "_bottom"))
         .a(op.n, oo.a(dis.ob, "_top"))
         .a(op.j, oo.a(dis.ob, "_front"))
         .a(op.k, oo.a(dis.ob, "_front"))
         .a(op.l, oo.a(dis.ob, "_side"))
         .a(op.m, oo.a(dis.ob, "_side"));
      this.b.accept(c(dis.ob, on.a.a(dis.ob, $$0, this.c)));
   }

   private void a(diq $$0, diq $$1, BiFunction<diq, diq, oo> $$2) {
      oo $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, on.a.a($$0, $$3, this.c)));
   }

   public void b(diq $$0) {
      oo $$1 = new oo()
         .a(op.c, oo.a($$0, "_particle"))
         .a(op.o, oo.a($$0, "_down"))
         .a(op.n, oo.a($$0, "_up"))
         .a(op.j, oo.a($$0, "_north"))
         .a(op.k, oo.a($$0, "_south"))
         .a(op.l, oo.a($$0, "_east"))
         .a(op.m, oo.a($$0, "_west"));
      this.b.accept(c($$0, on.a.a($$0, $$1, this.c)));
   }

   private void z() {
      oo $$0 = oo.k(dis.eZ);
      this.b.accept(c(dis.eZ, ol.a(dis.eZ)));
      this.a(dis.ee, $$0);
      this.a(dis.ef, $$0);
   }

   private void a(diq $$0, oo $$1) {
      alj $$2 = on.p.a($$0, $$1.c(op.g, oo.G($$0)), this.c);
      this.b.accept(od.a($$0, og.a().a(oh.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cwq.sI);
      this.m(dis.ft);
      this.b.accept(c(dis.fv, on.bw.a(dis.fv, oo.j(oo.a(dis.H, "_still")), this.c)));
      this.b
         .accept(
            od.a(dis.fu)
               .a(
                  oe.a(dmy.g)
                     .a(1, og.a().a(oh.c, on.bu.a(dis.fu, "_level1", oo.j(oo.a(dis.G, "_still")), this.c)))
                     .a(2, og.a().a(oh.c, on.bv.a(dis.fu, "_level2", oo.j(oo.a(dis.G, "_still")), this.c)))
                     .a(3, og.a().a(oh.c, on.bw.a(dis.fu, "_full", oo.j(oo.a(dis.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            od.a(dis.fw)
               .a(
                  oe.a(dmy.g)
                     .a(1, og.a().a(oh.c, on.bu.a(dis.fw, "_level1", oo.j(oo.G(dis.qP)), this.c)))
                     .a(2, og.a().a(oh.c, on.bv.a(dis.fw, "_level2", oo.j(oo.G(dis.qP)), this.c)))
                     .a(3, og.a().a(oh.c, on.bw.a(dis.fw, "_full", oo.j(oo.G(dis.qP)), this.c)))
               )
         );
   }

   private void B() {
      oo $$0 = oo.b(dis.kv);
      alj $$1 = on.aE.a(dis.kv, $$0, this.c);
      alj $$2 = this.a(dis.kv, "_dead", on.aE, $$1x -> $$0.c(op.b, $$1x));
      this.b.accept(od.a(dis.kv).a(a(dwl.au, 5, $$2, $$1)));
   }

   private void C() {
      alj $$0 = ol.a(dis.tq);
      alj $$1 = ol.a(dis.tq, "_triggered");
      alj $$2 = ol.a(dis.tq, "_crafting");
      alj $$3 = ol.a(dis.tq, "_crafting_triggered");
      this.b
         .accept(
            od.a(dis.tq)
               .a(oe.a(dwl.T).a($$0x -> this.a($$0x, og.a())))
               .a(
                  oe.a(dwl.A, dkj.b)
                     .a(false, false, og.a().a(oh.c, $$0))
                     .a(true, true, og.a().a(oh.c, $$3))
                     .a(true, false, og.a().a(oh.c, $$1))
                     .a(false, true, og.a().a(oh.c, $$2))
               )
         );
   }

   private void v(diq $$0) {
      oo $$1 = new oo().a(op.f, oo.a(dis.cD, "_top")).a(op.i, oo.a(dis.cD, "_side")).a(op.g, oo.a($$0, "_front"));
      oo $$2 = new oo().a(op.i, oo.a(dis.cD, "_top")).a(op.g, oo.a($$0, "_front_vertical"));
      alj $$3 = on.p.a($$0, $$1, this.c);
      alj $$4 = on.r.a($$0, $$2, this.c);
      this.b
         .accept(
            od.a($$0)
               .a(
                  oe.a(dwl.P)
                     .a(jm.a, og.a().a(oh.c, $$4).a(oh.a, oh.a.c))
                     .a(jm.b, og.a().a(oh.c, $$4))
                     .a(jm.c, og.a().a(oh.c, $$3))
                     .a(jm.f, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
                     .a(jm.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
                     .a(jm.e, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
               )
         );
   }

   private void D() {
      alj $$0 = ol.a(dis.fy);
      alj $$1 = ol.a(dis.fy, "_filled");
      this.b.accept(od.a(dis.fy).a(oe.a(dwl.h).a(false, og.a().a(oh.c, $$0)).a(true, og.a().a(oh.c, $$1))).a(c()));
   }

   private void E() {
      alj $$0 = ol.a(dis.ku, "_side");
      alj $$1 = ol.a(dis.ku, "_noside");
      alj $$2 = ol.a(dis.ku, "_noside1");
      alj $$3 = ol.a(dis.ku, "_noside2");
      alj $$4 = ol.a(dis.ku, "_noside3");
      this.b
         .accept(
            oc.a(dis.ku)
               .a(ob.a().a(dwl.L, true), og.a().a(oh.c, $$0))
               .a(ob.a().a(dwl.M, true), og.a().a(oh.c, $$0).a(oh.b, oh.a.b).a(oh.d, true))
               .a(ob.a().a(dwl.N, true), og.a().a(oh.c, $$0).a(oh.b, oh.a.c).a(oh.d, true))
               .a(ob.a().a(dwl.O, true), og.a().a(oh.c, $$0).a(oh.b, oh.a.d).a(oh.d, true))
               .a(ob.a().a(dwl.J, true), og.a().a(oh.c, $$0).a(oh.a, oh.a.d).a(oh.d, true))
               .a(ob.a().a(dwl.K, true), og.a().a(oh.c, $$0).a(oh.a, oh.a.b).a(oh.d, true))
               .a(ob.a().a(dwl.L, false), og.a().a(oh.c, $$1).a(oh.e, 2), og.a().a(oh.c, $$2), og.a().a(oh.c, $$3), og.a().a(oh.c, $$4))
               .a(
                  ob.a().a(dwl.M, false),
                  og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, true),
                  og.a().a(oh.c, $$3).a(oh.b, oh.a.b).a(oh.d, true),
                  og.a().a(oh.c, $$4).a(oh.b, oh.a.b).a(oh.d, true),
                  og.a().a(oh.c, $$1).a(oh.e, 2).a(oh.b, oh.a.b).a(oh.d, true)
               )
               .a(
                  ob.a().a(dwl.N, false),
                  og.a().a(oh.c, $$3).a(oh.b, oh.a.c).a(oh.d, true),
                  og.a().a(oh.c, $$4).a(oh.b, oh.a.c).a(oh.d, true),
                  og.a().a(oh.c, $$1).a(oh.e, 2).a(oh.b, oh.a.c).a(oh.d, true),
                  og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, true)
               )
               .a(
                  ob.a().a(dwl.O, false),
                  og.a().a(oh.c, $$4).a(oh.b, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$1).a(oh.e, 2).a(oh.b, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$3).a(oh.b, oh.a.d).a(oh.d, true)
               )
               .a(
                  ob.a().a(dwl.J, false),
                  og.a().a(oh.c, $$1).a(oh.e, 2).a(oh.a, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$4).a(oh.a, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$2).a(oh.a, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$3).a(oh.a, oh.a.d).a(oh.d, true)
               )
               .a(
                  ob.a().a(dwl.K, false),
                  og.a().a(oh.c, $$4).a(oh.a, oh.a.b).a(oh.d, true),
                  og.a().a(oh.c, $$3).a(oh.a, oh.a.b).a(oh.d, true),
                  og.a().a(oh.c, $$2).a(oh.a, oh.a.b).a(oh.d, true),
                  og.a().a(oh.c, $$1).a(oh.e, 2).a(oh.a, oh.a.b).a(oh.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            oc.a(dis.pc)
               .a(og.a().a(oh.c, oo.G(dis.pc)))
               .a(ob.a().a(dwl.aL, 1), og.a().a(oh.c, oo.a(dis.pc, "_contents1")))
               .a(ob.a().a(dwl.aL, 2), og.a().a(oh.c, oo.a(dis.pc, "_contents2")))
               .a(ob.a().a(dwl.aL, 3), og.a().a(oh.c, oo.a(dis.pc, "_contents3")))
               .a(ob.a().a(dwl.aL, 4), og.a().a(oh.c, oo.a(dis.pc, "_contents4")))
               .a(ob.a().a(dwl.aL, 5), og.a().a(oh.c, oo.a(dis.pc, "_contents5")))
               .a(ob.a().a(dwl.aL, 6), og.a().a(oh.c, oo.a(dis.pc, "_contents6")))
               .a(ob.a().a(dwl.aL, 7), og.a().a(oh.c, oo.a(dis.pc, "_contents7")))
               .a(ob.a().a(dwl.aL, 8), og.a().a(oh.c, oo.a(dis.pc, "_contents_ready")))
         );
   }

   private void w(diq $$0) {
      alj $$1 = on.c.a($$0, oo.a($$0), this.c);
      alj $$2 = this.a($$0, "_powered", on.c, oo::b);
      alj $$3 = this.a($$0, "_lit", on.c, oo::b);
      alj $$4 = this.a($$0, "_lit_powered", on.c, oo::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private oa a(diq $$0, alj $$1, alj $$2, alj $$3, alj $$4) {
      return od.a($$0).a(oe.a(dwl.r, dwl.w).a(($$4x, $$5) -> $$4x ? og.a().a(oh.c, $$5 ? $$4 : $$2) : og.a().a(oh.c, $$5 ? $$3 : $$1)));
   }

   private void i(diq $$0, diq $$1) {
      alj $$2 = ol.a($$0);
      alj $$3 = ol.a($$0, "_powered");
      alj $$4 = ol.a($$0, "_lit");
      alj $$5 = ol.a($$0, "_lit_powered");
      this.a($$1, ol.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(diq $$0) {
      this.c($$0);
      this.b.accept(od.a($$0, og.a().a(oh.c, on.ao.a($$0, oo.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dis.qy);
      this.x(dis.qx);
      this.x(dis.qw);
      this.x(dis.qv);
   }

   private void H() {
      this.c(dis.st);
      oe.b<jm, dwr> $$0 = oe.a(dwl.bm, dwl.bn);

      for (dwr $$1 : dwr.values()) {
         $$0.a(jm.b, $$1, this.a(jm.b, $$1));
      }

      for (dwr $$2 : dwr.values()) {
         $$0.a(jm.a, $$2, this.a(jm.a, $$2));
      }

      this.b.accept(od.a(dis.st).a($$0));
   }

   private og a(jm $$0, dwr $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oo $$3 = oo.c(oo.a(dis.st, $$2));
      return og.a().a(oh.c, on.an.a(dis.st, $$2, $$3, this.c));
   }

   private void y(diq $$0) {
      oo $$1 = new oo().a(op.e, oo.G(dis.dV)).a(op.f, oo.G($$0)).a(op.i, oo.a($$0, "_side"));
      this.b.accept(c($$0, on.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alj $$0 = oo.a(dis.gZ, "_side");
      oo $$1 = new oo().a(op.f, oo.a(dis.gZ, "_top")).a(op.i, $$0);
      oo $$2 = new oo().a(op.f, oo.a(dis.gZ, "_inverted_top")).a(op.i, $$0);
      this.b
         .accept(
            od.a(dis.gZ)
               .a(oe.a(dwl.p).a(false, og.a().a(oh.c, on.aF.a(dis.gZ, $$1, this.c))).a(true, og.a().a(oh.c, on.aF.a(ol.a(dis.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(diq $$0) {
      this.b.accept(od.a($$0, og.a().a(oh.c, ol.a($$0))).a(this.n()));
   }

   private void J() {
      diq $$0 = dis.ss;
      alj $$1 = ol.a($$0, "_on");
      alj $$2 = ol.a($$0);
      this.b.accept(od.a($$0, og.a().a(oh.c, ol.a($$0))).a(this.n()).a(a(dwl.w, $$1, $$2)));
   }

   private void K() {
      oo $$0 = new oo().a(op.B, oo.G(dis.j)).a(op.f, oo.G(dis.cC));
      oo $$1 = new oo().a(op.B, oo.G(dis.j)).a(op.f, oo.a(dis.cC, "_moist"));
      alj $$2 = on.aW.a(dis.cC, $$0, this.c);
      alj $$3 = on.aW.a(oo.a(dis.cC, "_moist"), $$1, this.c);
      this.b.accept(od.a(dis.cC).a(a(dwl.aQ, 7, $$3, $$2)));
   }

   private List<alj> A(diq $$0) {
      alj $$1 = on.aX.a(ol.a($$0, "_floor0"), oo.v($$0), this.c);
      alj $$2 = on.aX.a(ol.a($$0, "_floor1"), oo.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alj> B(diq $$0) {
      alj $$1 = on.aY.a(ol.a($$0, "_side0"), oo.v($$0), this.c);
      alj $$2 = on.aY.a(ol.a($$0, "_side1"), oo.w($$0), this.c);
      alj $$3 = on.aZ.a(ol.a($$0, "_side_alt0"), oo.v($$0), this.c);
      alj $$4 = on.aZ.a(ol.a($$0, "_side_alt1"), oo.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alj> C(diq $$0) {
      alj $$1 = on.ba.a(ol.a($$0, "_up0"), oo.v($$0), this.c);
      alj $$2 = on.ba.a(ol.a($$0, "_up1"), oo.w($$0), this.c);
      alj $$3 = on.bb.a(ol.a($$0, "_up_alt0"), oo.v($$0), this.c);
      alj $$4 = on.bb.a(ol.a($$0, "_up_alt1"), oo.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<og> a(List<alj> $$0, UnaryOperator<og> $$1) {
      return $$0.stream().map($$0x -> og.a().a(oh.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      ob $$0 = ob.a().a(dwl.L, false).a(dwl.M, false).a(dwl.N, false).a(dwl.O, false).a(dwl.J, false);
      List<alj> $$1 = this.A(dis.cr);
      List<alj> $$2 = this.B(dis.cr);
      List<alj> $$3 = this.C(dis.cr);
      this.b
         .accept(
            oc.a(dis.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(ob.b(ob.a().a(dwl.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(ob.b(ob.a().a(dwl.M, true), $$0), a($$2, $$0x -> $$0x.a(oh.b, oh.a.b)))
               .a(ob.b(ob.a().a(dwl.N, true), $$0), a($$2, $$0x -> $$0x.a(oh.b, oh.a.c)))
               .a(ob.b(ob.a().a(dwl.O, true), $$0), a($$2, $$0x -> $$0x.a(oh.b, oh.a.d)))
               .a(ob.a().a(dwl.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alj> $$0 = this.A(dis.cs);
      List<alj> $$1 = this.B(dis.cs);
      this.b
         .accept(
            oc.a(dis.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(oh.b, oh.a.b)))
               .a(a($$1, $$0x -> $$0x.a(oh.b, oh.a.c)))
               .a(a($$1, $$0x -> $$0x.a(oh.b, oh.a.d)))
         );
   }

   private void D(diq $$0) {
      alj $$1 = oq.t.create($$0, this.c);
      alj $$2 = oq.u.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(od.a($$0).a(a(dwl.j, $$2, $$1)));
   }

   private void N() {
      oo $$0 = oo.a(oo.a(dis.ad, "_side"), oo.a(dis.ad, "_top"));
      alj $$1 = on.j.a(dis.ad, $$0, this.c);
      this.b.accept(d(dis.ad, $$1));
   }

   private void O() {
      this.a(cwq.ad);
      diq $$0 = dis.E;
      oe.b<Boolean, Integer> $$1 = oe.a(dnk.d, dnk.b);
      alj $$2 = ol.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alj $$4 = ol.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, og.a().a(oh.c, $$4));
         $$1.a(false, $$3, og.a().a(oh.c, $$2));
      }

      this.b.accept(od.a(dis.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            od.a(dis.kI)
               .a(
                  oe.a(dwl.as)
                     .a(0, og.a().a(oh.c, this.a(dis.kI, "_0", on.c, oo::b)))
                     .a(1, og.a().a(oh.c, this.a(dis.kI, "_1", on.c, oo::b)))
                     .a(2, og.a().a(oh.c, this.a(dis.kI, "_2", on.c, oo::b)))
                     .a(3, og.a().a(oh.c, this.a(dis.kI, "_3", on.c, oo::b)))
               )
         );
   }

   private void Q() {
      alj $$0 = oo.G(dis.j);
      oo $$1 = new oo().a(op.e, $$0).b(op.e, op.c).a(op.f, oo.a(dis.i, "_top")).a(op.i, oo.a(dis.i, "_snow"));
      og $$2 = og.a().a(oh.c, on.n.a(dis.i, "_snow", $$1, this.c));
      this.a(dis.i, ol.a(dis.i), $$2);
      alj $$3 = oq.f.get(dis.fl).a($$1x -> $$1x.a(op.e, $$0)).a(dis.fl, this.c);
      this.a(dis.fl, $$3, $$2);
      alj $$4 = oq.f.get(dis.l).a($$1x -> $$1x.a(op.e, $$0)).a(dis.l, this.c);
      this.a(dis.l, $$4, $$2);
   }

   private void a(diq $$0, alj $$1, og $$2) {
      List<og> $$3 = Arrays.asList(a($$1));
      this.b.accept(od.a($$0).a(oe.a(dwl.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cwq.ry);
      this.b
         .accept(
            od.a(dis.fC)
               .a(
                  oe.a(dwl.ar)
                     .a(0, og.a().a(oh.c, ol.a(dis.fC, "_stage0")))
                     .a(1, og.a().a(oh.c, ol.a(dis.fC, "_stage1")))
                     .a(2, og.a().a(oh.c, ol.a(dis.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dis.kE, ol.a(dis.kE)));
   }

   private void j(diq $$0, diq $$1) {
      oo $$2 = oo.b($$1);
      alj $$3 = on.Y.a($$0, $$2, this.c);
      alj $$4 = on.Z.a($$0, $$2, this.c);
      this.b.accept(od.a($$0).a(a(dwl.aT, 1, $$4, $$3)));
   }

   private void T() {
      alj $$0 = ol.a(dis.hc);
      alj $$1 = ol.a(dis.hc, "_side");
      this.a(cwq.lR);
      this.b
         .accept(
            od.a(dis.hc)
               .a(
                  oe.a(dwl.Q)
                     .a(jm.a, og.a().a(oh.c, $$0))
                     .a(jm.c, og.a().a(oh.c, $$1))
                     .a(jm.f, og.a().a(oh.c, $$1).a(oh.b, oh.a.b))
                     .a(jm.d, og.a().a(oh.c, $$1).a(oh.b, oh.a.c))
                     .a(jm.e, og.a().a(oh.c, $$1).a(oh.b, oh.a.d))
               )
         );
   }

   private void k(diq $$0, diq $$1) {
      alj $$2 = ol.a($$0);
      this.b.accept(od.a($$1, og.a().a(oh.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alj $$0 = ol.a(dis.eW, "_post_ends");
      alj $$1 = ol.a(dis.eW, "_post");
      alj $$2 = ol.a(dis.eW, "_cap");
      alj $$3 = ol.a(dis.eW, "_cap_alt");
      alj $$4 = ol.a(dis.eW, "_side");
      alj $$5 = ol.a(dis.eW, "_side_alt");
      this.b
         .accept(
            oc.a(dis.eW)
               .a(og.a().a(oh.c, $$0))
               .a(ob.a().a(dwl.L, false).a(dwl.M, false).a(dwl.N, false).a(dwl.O, false), og.a().a(oh.c, $$1))
               .a(ob.a().a(dwl.L, true).a(dwl.M, false).a(dwl.N, false).a(dwl.O, false), og.a().a(oh.c, $$2))
               .a(ob.a().a(dwl.L, false).a(dwl.M, true).a(dwl.N, false).a(dwl.O, false), og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.L, false).a(dwl.M, false).a(dwl.N, true).a(dwl.O, false), og.a().a(oh.c, $$3))
               .a(ob.a().a(dwl.L, false).a(dwl.M, false).a(dwl.N, false).a(dwl.O, true), og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.L, true), og.a().a(oh.c, $$4))
               .a(ob.a().a(dwl.M, true), og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
               .a(ob.a().a(dwl.N, true), og.a().a(oh.c, $$5))
               .a(ob.a().a(dwl.O, true), og.a().a(oh.c, $$5).a(oh.b, oh.a.b))
         );
      this.d(dis.eW);
   }

   private void E(diq $$0) {
      this.b.accept(od.a($$0, og.a().a(oh.c, ol.a($$0))).a(b()));
   }

   private void V() {
      alj $$0 = ol.a(dis.dw);
      alj $$1 = ol.a(dis.dw, "_on");
      this.d(dis.dw);
      this.b
         .accept(
            od.a(dis.dw)
               .a(a(dwl.w, $$0, $$1))
               .a(
                  oe.a(dwl.U, dwl.R)
                     .a(dwg.c, jm.c, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.c))
                     .a(dwg.c, jm.f, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.d))
                     .a(dwg.c, jm.d, og.a().a(oh.a, oh.a.c))
                     .a(dwg.c, jm.e, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.b))
                     .a(dwg.a, jm.c, og.a())
                     .a(dwg.a, jm.f, og.a().a(oh.b, oh.a.b))
                     .a(dwg.a, jm.d, og.a().a(oh.b, oh.a.c))
                     .a(dwg.a, jm.e, og.a().a(oh.b, oh.a.d))
                     .a(dwg.b, jm.c, og.a().a(oh.a, oh.a.b))
                     .a(dwg.b, jm.f, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.b))
                     .a(dwg.b, jm.d, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.c))
                     .a(dwg.b, jm.e, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.d))
               )
         );
   }

   private void W() {
      this.d(dis.fm);
      this.b.accept(b(dis.fm, ol.a(dis.fm)));
   }

   private void X() {
      this.d(dis.tn);
      this.b.accept(c(dis.tn, ol.a(dis.tn)));
   }

   private void Y() {
      this.b.accept(od.a(dis.ed).a(oe.a(dwl.H).a(jm.a.a, og.a().a(oh.c, ol.a(dis.ed, "_ns"))).a(jm.a.c, og.a().a(oh.c, ol.a(dis.ed, "_ew")))));
   }

   private void Z() {
      alj $$0 = oq.a.create(dis.dV, this.c);
      this.b
         .accept(
            od.a(
               dis.dV,
               og.a().a(oh.c, $$0),
               og.a().a(oh.c, $$0).a(oh.a, oh.a.b),
               og.a().a(oh.c, $$0).a(oh.a, oh.a.c),
               og.a().a(oh.c, $$0).a(oh.a, oh.a.d),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.b),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.b).a(oh.a, oh.a.b),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.b).a(oh.a, oh.a.c),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.b).a(oh.a, oh.a.d),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.c),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.c).a(oh.a, oh.a.b),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.c).a(oh.a, oh.a.c),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.c).a(oh.a, oh.a.d),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.d),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.d).a(oh.a, oh.a.b),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.d).a(oh.a, oh.a.c),
               og.a().a(oh.c, $$0).a(oh.b, oh.a.d).a(oh.a, oh.a.d)
            )
         );
   }

   private void aa() {
      alj $$0 = ol.a(dis.kO);
      alj $$1 = ol.a(dis.kO, "_on");
      this.b.accept(od.a(dis.kO).a(a(dwl.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oo $$0 = new oo().a(op.e, oo.a(dis.by, "_bottom")).a(op.i, oo.a(dis.by, "_side"));
      alj $$1 = oo.a(dis.by, "_top_sticky");
      alj $$2 = oo.a(dis.by, "_top");
      oo $$3 = $$0.c(op.E, $$1);
      oo $$4 = $$0.c(op.E, $$2);
      alj $$5 = ol.a(dis.by, "_base");
      this.a(dis.by, $$5, $$4);
      this.a(dis.br, $$5, $$3);
      alj $$6 = on.n.a(dis.by, "_inventory", $$0.c(op.f, $$2), this.c);
      alj $$7 = on.n.a(dis.br, "_inventory", $$0.c(op.f, $$1), this.c);
      this.a(dis.by, $$6);
      this.a(dis.br, $$7);
   }

   private void a(diq $$0, alj $$1, oo $$2) {
      alj $$3 = on.bl.a($$0, $$2, this.c);
      this.b.accept(od.a($$0).a(a(dwl.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oo $$0 = new oo().a(op.F, oo.a(dis.by, "_top")).a(op.i, oo.a(dis.by, "_side"));
      oo $$1 = $$0.c(op.E, oo.a(dis.by, "_top_sticky"));
      oo $$2 = $$0.c(op.E, oo.a(dis.by, "_top"));
      this.b
         .accept(
            od.a(dis.bz)
               .a(
                  oe.a(dwl.x, dwl.bg)
                     .a(false, dww.a, og.a().a(oh.c, on.bm.a(dis.by, "_head", $$2, this.c)))
                     .a(false, dww.b, og.a().a(oh.c, on.bm.a(dis.by, "_head_sticky", $$1, this.c)))
                     .a(true, dww.a, og.a().a(oh.c, on.bn.a(dis.by, "_head_short", $$2, this.c)))
                     .a(true, dww.b, og.a().a(oh.c, on.bn.a(dis.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      diq $$0 = dis.tr;
      oo $$1 = oo.a($$0, "_side_inactive", "_top_inactive");
      oo $$2 = oo.a($$0, "_side_active", "_top_active");
      oo $$3 = oo.a($$0, "_side_active", "_top_ejecting_reward");
      oo $$4 = oo.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      oo $$5 = oo.a($$0, "_side_active_ominous", "_top_active_ominous");
      oo $$6 = oo.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alj $$7 = on.o.a($$0, $$1, this.c);
      alj $$8 = on.o.a($$0, "_active", $$2, this.c);
      alj $$9 = on.o.a($$0, "_ejecting_reward", $$3, this.c);
      alj $$10 = on.o.a($$0, "_inactive_ominous", $$4, this.c);
      alj $$11 = on.o.a($$0, "_active_ominous", $$5, this.c);
      alj $$12 = on.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(od.a($$0).a(oe.a(dwl.by, dwl.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> og.a().a(oh.c, $$7x ? $$10 : $$7);
            case b, c, d -> og.a().a(oh.c, $$7x ? $$11 : $$8);
            case e -> og.a().a(oh.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      diq $$0 = dis.ts;
      oo $$1 = oo.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      oo $$2 = oo.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      oo $$3 = oo.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      oo $$4 = oo.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alj $$5 = on.bR.a($$0, $$1, this.c);
      alj $$6 = on.bR.a($$0, "_active", $$2, this.c);
      alj $$7 = on.bR.a($$0, "_unlocking", $$3, this.c);
      alj $$8 = on.bR.a($$0, "_ejecting_reward", $$4, this.c);
      oo $$9 = oo.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      oo $$10 = oo.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oo $$11 = oo.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oo $$12 = oo.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alj $$13 = on.bR.a($$0, "_ominous", $$9, this.c);
      alj $$14 = on.bR.a($$0, "_active_ominous", $$10, this.c);
      alj $$15 = on.bR.a($$0, "_unlocking_ominous", $$11, this.c);
      alj $$16 = on.bR.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(od.a($$0).a(b()).a(oe.a(drl.b, drl.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> og.a().a(oh.c, $$9x ? $$13 : $$5);
            case b -> og.a().a(oh.c, $$9x ? $$14 : $$6);
            case c -> og.a().a(oh.c, $$9x ? $$15 : $$7);
            case d -> og.a().a(oh.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alj $$0 = ol.a(dis.qQ, "_inactive");
      alj $$1 = ol.a(dis.qQ, "_active");
      this.a(dis.qQ, $$0);
      this.b.accept(od.a(dis.qQ).a(oe.a(dwl.bo).a($$2 -> og.a().a(oh.c, $$2 != dxb.b && $$2 != dxb.c ? $$0 : $$1))));
   }

   private void ag() {
      alj $$0 = ol.a(dis.qR, "_inactive");
      alj $$1 = ol.a(dis.qR, "_active");
      this.a(dis.qR, $$0);
      this.b.accept(od.a(dis.qR).a(oe.a(dwl.bo).a($$2 -> og.a().a(oh.c, $$2 != dxb.b && $$2 != dxb.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alj $$0 = on.bQ.a(dis.qV, oo.a(false), this.c);
      alj $$1 = on.bQ.a(dis.qV, "_can_summon", oo.a(true), this.c);
      this.a(dis.qV, $$0);
      this.b.accept(od.a(dis.qV).a(a(dwl.G, $$1, $$0)));
   }

   private void ai() {
      alj $$0 = ol.a(dis.nS, "_stable");
      alj $$1 = ol.a(dis.nS, "_unstable");
      this.a(dis.nS, $$0);
      this.b.accept(od.a(dis.nS).a(a(dwl.b, $$1, $$0)));
   }

   private void aj() {
      alj $$0 = this.a(dis.sv, "", on.ao, oo::c);
      alj $$1 = this.a(dis.sv, "_lit", on.ao, oo::c);
      this.b.accept(od.a(dis.sv).a(a(dwl.D, $$1, $$0)));
      alj $$2 = this.a(dis.sw, "", on.ao, oo::c);
      alj $$3 = this.a(dis.sw, "_lit", on.ao, oo::c);
      this.b.accept(od.a(dis.sw).a(a(dwl.D, $$3, $$2)));
   }

   private void ak() {
      alj $$0 = oq.a.create(dis.fB, this.c);
      alj $$1 = this.a(dis.fB, "_on", on.c, oo::b);
      this.b.accept(od.a(dis.fB).a(a(dwl.r, $$1, $$0)));
   }

   private void l(diq $$0, diq $$1) {
      oo $$2 = oo.y($$0);
      this.b.accept(c($$0, on.bf.a($$0, $$2, this.c)));
      this.b.accept(od.a($$1, og.a().a(oh.c, on.bh.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oo $$0 = oo.y(dis.dK);
      oo $$1 = oo.i(oo.a(dis.dK, "_off"));
      alj $$2 = on.bj.a(dis.dK, $$0, this.c);
      alj $$3 = on.bg.a(dis.dK, "_off", $$1, this.c);
      this.b.accept(od.a(dis.dK).a(a(dwl.r, $$2, $$3)));
      alj $$4 = on.bk.a(dis.dL, $$0, this.c);
      alj $$5 = on.bi.a(dis.dL, "_off", $$1, this.c);
      this.b.accept(od.a(dis.dL).a(a(dwl.r, $$4, $$5)).a(d()));
      this.d(dis.dK);
      this.c(dis.dL);
   }

   private void am() {
      this.a(cwq.lK);
      this.b.accept(od.a(dis.eh).a(oe.a(dwl.aA, dwl.s, dwl.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return og.a().a(oh.c, oo.a(dis.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cwq.cT);
      this.b
         .accept(
            od.a(dis.mV)
               .a(
                  oe.a(dwl.aS, dwl.C)
                     .a(1, false, Arrays.asList(a(ol.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(ol.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(ol.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(ol.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(ol.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(ol.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(ol.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(ol.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      oo $$0 = oo.a(dis.dN);
      alj $$1 = on.c.a(dis.dP, $$0, this.c);
      this.b.accept(od.a(dis.dN).a(oe.a(dwl.aF).a($$1x -> og.a().a(oh.c, $$1x < 8 ? ol.a(dis.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dis.dN, ol.a(dis.dN, "_height2"));
      this.b.accept(c(dis.dP, $$1));
   }

   private void ap() {
      this.b.accept(od.a(dis.oc, og.a().a(oh.c, ol.a(dis.oc))).a(b()));
   }

   private void aq() {
      alj $$0 = oq.a.create(dis.pa, this.c);
      this.a(dis.pa, $$0);
      this.b.accept(od.a(dis.pa).a(oe.a(dwl.bj).a($$0x -> og.a().a(oh.c, this.a(dis.pa, "_" + $$0x.c(), on.c, oo::b)))));
   }

   private void ar() {
      this.a(cwq.wN);
      this.b.accept(od.a(dis.oi).a(oe.a(dwl.as).a($$0 -> og.a().a(oh.c, this.a(dis.oi, "_stage" + $$0, on.ao, oo::c)))));
   }

   private void as() {
      this.a(cwq.pt);
      this.b
         .accept(
            od.a(dis.fI)
               .a(
                  oe.a(dwl.a, dwl.M, dwl.L, dwl.N, dwl.O)
                     .a(false, false, false, false, false, og.a().a(oh.c, ol.a(dis.fI, "_ns")))
                     .a(false, true, false, false, false, og.a().a(oh.c, ol.a(dis.fI, "_n")).a(oh.b, oh.a.b))
                     .a(false, false, true, false, false, og.a().a(oh.c, ol.a(dis.fI, "_n")))
                     .a(false, false, false, true, false, og.a().a(oh.c, ol.a(dis.fI, "_n")).a(oh.b, oh.a.c))
                     .a(false, false, false, false, true, og.a().a(oh.c, ol.a(dis.fI, "_n")).a(oh.b, oh.a.d))
                     .a(false, true, true, false, false, og.a().a(oh.c, ol.a(dis.fI, "_ne")))
                     .a(false, true, false, true, false, og.a().a(oh.c, ol.a(dis.fI, "_ne")).a(oh.b, oh.a.b))
                     .a(false, false, false, true, true, og.a().a(oh.c, ol.a(dis.fI, "_ne")).a(oh.b, oh.a.c))
                     .a(false, false, true, false, true, og.a().a(oh.c, ol.a(dis.fI, "_ne")).a(oh.b, oh.a.d))
                     .a(false, false, true, true, false, og.a().a(oh.c, ol.a(dis.fI, "_ns")))
                     .a(false, true, false, false, true, og.a().a(oh.c, ol.a(dis.fI, "_ns")).a(oh.b, oh.a.b))
                     .a(false, true, true, true, false, og.a().a(oh.c, ol.a(dis.fI, "_nse")))
                     .a(false, true, false, true, true, og.a().a(oh.c, ol.a(dis.fI, "_nse")).a(oh.b, oh.a.b))
                     .a(false, false, true, true, true, og.a().a(oh.c, ol.a(dis.fI, "_nse")).a(oh.b, oh.a.c))
                     .a(false, true, true, false, true, og.a().a(oh.c, ol.a(dis.fI, "_nse")).a(oh.b, oh.a.d))
                     .a(false, true, true, true, true, og.a().a(oh.c, ol.a(dis.fI, "_nsew")))
                     .a(true, false, false, false, false, og.a().a(oh.c, ol.a(dis.fI, "_attached_ns")))
                     .a(true, false, true, false, false, og.a().a(oh.c, ol.a(dis.fI, "_attached_n")))
                     .a(true, false, false, true, false, og.a().a(oh.c, ol.a(dis.fI, "_attached_n")).a(oh.b, oh.a.c))
                     .a(true, true, false, false, false, og.a().a(oh.c, ol.a(dis.fI, "_attached_n")).a(oh.b, oh.a.b))
                     .a(true, false, false, false, true, og.a().a(oh.c, ol.a(dis.fI, "_attached_n")).a(oh.b, oh.a.d))
                     .a(true, true, true, false, false, og.a().a(oh.c, ol.a(dis.fI, "_attached_ne")))
                     .a(true, true, false, true, false, og.a().a(oh.c, ol.a(dis.fI, "_attached_ne")).a(oh.b, oh.a.b))
                     .a(true, false, false, true, true, og.a().a(oh.c, ol.a(dis.fI, "_attached_ne")).a(oh.b, oh.a.c))
                     .a(true, false, true, false, true, og.a().a(oh.c, ol.a(dis.fI, "_attached_ne")).a(oh.b, oh.a.d))
                     .a(true, false, true, true, false, og.a().a(oh.c, ol.a(dis.fI, "_attached_ns")))
                     .a(true, true, false, false, true, og.a().a(oh.c, ol.a(dis.fI, "_attached_ns")).a(oh.b, oh.a.b))
                     .a(true, true, true, true, false, og.a().a(oh.c, ol.a(dis.fI, "_attached_nse")))
                     .a(true, true, false, true, true, og.a().a(oh.c, ol.a(dis.fI, "_attached_nse")).a(oh.b, oh.a.b))
                     .a(true, false, true, true, true, og.a().a(oh.c, ol.a(dis.fI, "_attached_nse")).a(oh.b, oh.a.c))
                     .a(true, true, true, false, true, og.a().a(oh.c, ol.a(dis.fI, "_attached_nse")).a(oh.b, oh.a.d))
                     .a(true, true, true, true, true, og.a().a(oh.c, ol.a(dis.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dis.fH);
      this.b.accept(od.a(dis.fH).a(oe.a(dwl.a, dwl.w).a(($$0, $$1) -> og.a().a(oh.c, oo.a(dis.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alj a(int $$0, String $$1, oo $$2) {
      switch ($$0) {
         case 1:
            return on.bp.a(ol.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return on.bq.a(ol.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return on.br.a(ol.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return on.bs.a(ol.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private alj a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", oo.b(oo.G(dis.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oo.b(oo.a(dis.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oo.b(oo.a(dis.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cwq.kp);
      this.b.accept(od.a(dis.mf).a(oe.a(dwl.aD, dwl.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cwq.kq);
      Function<Integer, alj> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oo $$2 = oo.a($$1);
         return on.bA.a(dis.mg, $$1, $$2, this.c);
      };
      this.b.accept(od.a(dis.mg).a(oe.a(dpy.c).a($$1 -> og.a().a(oh.c, $$0.apply($$1)))));
   }

   private void F(diq $$0) {
      this.d($$0);
      alj $$1 = ol.a($$0);
      oc $$2 = oc.a($$0);
      ob.c $$3 = ae.a(ob.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dwm, Function<alj, og>> $$4 : a) {
         dwm $$5 = (dwm)$$4.getFirst();
         Function<alj, og> $$6 = (Function<alj, og>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(ob.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      alj $$0 = oo.a(dis.qU, "_bottom");
      oo $$1 = new oo().a(op.e, $$0).a(op.f, oo.a(dis.qU, "_top")).a(op.i, oo.a(dis.qU, "_side"));
      oo $$2 = new oo().a(op.e, $$0).a(op.f, oo.a(dis.qU, "_top_bloom")).a(op.i, oo.a(dis.qU, "_side_bloom"));
      alj $$3 = on.n.a(dis.qU, "", $$1, this.c);
      alj $$4 = on.n.a(dis.qU, "_bloom", $$2, this.c);
      this.b.accept(od.a(dis.qU).a(oe.a(dwl.E).a($$2x -> og.a().a(oh.c, $$2x ? $$4 : $$3))));
      this.a(cwq.gj, $$3);
   }

   private void ax() {
      diq $$0 = dis.cm;
      alj $$1 = ol.a($$0);
      oc $$2 = oc.a($$0);
      List.of(Pair.of(jm.c, oh.a.a), Pair.of(jm.f, oh.a.b), Pair.of(jm.d, oh.a.c), Pair.of(jm.e, oh.a.d)).forEach($$2x -> {
         jm $$3 = (jm)$$2x.getFirst();
         oh.a $$4 = (oh.a)$$2x.getSecond();
         ob.c $$5 = ob.a().a(dwl.R, $$3);
         $$2.a($$5, og.a().a(oh.c, $$1).a(oh.b, $$4).a(oh.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, ol.a($$0, "_inventory"));
      i.clear();
   }

   private void a(oc $$0, ob.c $$1, oh.a $$2) {
      List.of(Pair.of(dwl.bp, on.aM), Pair.of(dwl.bq, on.aN), Pair.of(dwl.br, on.aO), Pair.of(dwl.bs, on.aP), Pair.of(dwl.bt, on.aQ), Pair.of(dwl.bu, on.aR))
         .forEach($$3 -> {
            dwm $$4 = (dwm)$$3.getFirst();
            om $$5 = (om)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(oc $$0, ob.c $$1, oh.a $$2, dwm $$3, om $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oo $$7 = new oo().a(op.b, oo.a(dis.cm, $$6));
      nw.d $$8 = new nw.d($$4, $$6);
      alj $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dis.cm, $$6, $$7, this.c));
      $$0.a(ob.a($$1, ob.a().a($$3, $$5)), og.a().a(oh.c, $$9).a(oh.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dis.kJ, on.c.a(dis.kJ, oo.b(ol.a("magma")), this.c)));
   }

   private void G(diq $$0) {
      this.b($$0, oq.q);
      on.bH.a(ol.a($$0.j()), oo.u($$0), this.c);
   }

   private void b(diq $$0, diq $$1, nw.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(diq $$0, diq $$1) {
      on.bI.a(ol.a($$0.j()), oo.u($$1), this.c);
   }

   private void az() {
      alj $$0 = ol.a(dis.b);
      alj $$1 = ol.a(dis.b, "_mirrored");
      this.b.accept(a(dis.eN, $$0, $$1));
      this.a(dis.eN, $$0);
   }

   private void aA() {
      alj $$0 = ol.a(dis.sJ);
      alj $$1 = ol.a(dis.sJ, "_mirrored");
      this.b.accept(a(dis.td, $$0, $$1).a(f()));
      this.a(dis.td, $$0);
   }

   private void n(diq $$0, diq $$1) {
      this.a($$0, nw.e.b);
      oo $$2 = oo.d(oo.a($$0, "_pot"));
      alj $$3 = nw.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alj $$0 = oo.a(dis.pl, "_bottom");
      alj $$1 = oo.a(dis.pl, "_top_off");
      alj $$2 = oo.a(dis.pl, "_top");
      alj[] $$3 = new alj[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oo $$5 = new oo().a(op.e, $$0).a(op.f, $$4 == 0 ? $$1 : $$2).a(op.i, oo.a(dis.pl, "_side" + $$4));
         $$3[$$4] = on.n.a(dis.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(od.a(dis.pl).a(oe.a(dwl.aZ).a($$1x -> og.a().a(oh.c, $$3[$$1x]))));
      this.a(cwq.xl, $$3[0]);
   }

   private og a(jo $$0, og $$1) {
      switch ($$0) {
         case b:
            return $$1.a(oh.a, oh.a.b);
         case c:
            return $$1.a(oh.a, oh.a.b).a(oh.b, oh.a.c);
         case d:
            return $$1.a(oh.a, oh.a.b).a(oh.b, oh.a.d);
         case a:
            return $$1.a(oh.a, oh.a.b).a(oh.b, oh.a.b);
         case f:
            return $$1.a(oh.a, oh.a.d).a(oh.b, oh.a.c);
         case g:
            return $$1.a(oh.a, oh.a.d);
         case h:
            return $$1.a(oh.a, oh.a.d).a(oh.b, oh.a.b);
         case e:
            return $$1.a(oh.a, oh.a.d).a(oh.b, oh.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(oh.b, oh.a.c);
         case i:
            return $$1.a(oh.b, oh.a.d);
         case j:
            return $$1.a(oh.b, oh.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      alj $$0 = oo.a(dis.pb, "_top");
      alj $$1 = oo.a(dis.pb, "_bottom");
      alj $$2 = oo.a(dis.pb, "_side");
      alj $$3 = oo.a(dis.pb, "_lock");
      oo $$4 = new oo().a(op.o, $$2).a(op.m, $$2).a(op.l, $$2).a(op.c, $$0).a(op.j, $$0).a(op.k, $$1).a(op.n, $$3);
      alj $$5 = on.b.a(dis.pb, $$4, this.c);
      this.b.accept(od.a(dis.pb, og.a().a(oh.c, $$5)).a(oe.a(dwl.T).a($$0x -> this.a($$0x, og.a()))));
   }

   private void aD() {
      diq $$0 = dis.n;
      alj $$1 = ol.a($$0);
      oq $$2 = oq.a.get($$0);
      diq $$3 = dis.jH;
      alj $$4 = on.ab.a($$3, $$2.b(), this.c);
      alj $$5 = on.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      mc.a().filter(md::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dis.rf).a(mc.w).a(dis.rf, dis.rD).a(dis.rj, dis.rn).a(mc.y);
      this.h(dis.re).a(mc.A).a(dis.re, dis.rC).a(dis.ri, dis.rm).a(mc.C);
      this.h(dis.rd).a(mc.E).a(dis.rd, dis.rB).a(dis.rh, dis.rl).a(mc.G);
      this.h(dis.rc).a(mc.I).a(dis.rc, dis.rA).a(dis.rg, dis.rk).a(mc.K);
      this.w(dis.sk);
      this.w(dis.sl);
      this.w(dis.sm);
      this.w(dis.sn);
      this.i(dis.sk, dis.so);
      this.i(dis.sl, dis.sp);
      this.i(dis.sm, dis.sq);
      this.i(dis.sn, dis.sr);
      this.m(dis.a);
      this.c(dis.nc, dis.a);
      this.c(dis.nb, dis.a);
      this.m(dis.fO);
      this.m(dis.dQ);
      this.c(dis.nd, dis.G);
      this.m(dis.fA);
      this.m(dis.me);
      this.m(dis.fr);
      this.m(dis.fR);
      this.a(cwq.uw);
      this.m(dis.pg);
      this.m(dis.G);
      this.m(dis.H);
      this.m(dis.hV);
      this.a(cwq.fS);
      this.o(dis.pM, dis.qd);
      this.o(dis.pN, dis.qe);
      this.o(dis.pO, dis.qf);
      this.o(dis.pP, dis.qg);
      this.o(dis.pQ, dis.qh);
      this.o(dis.pR, dis.qi);
      this.o(dis.pS, dis.qj);
      this.o(dis.pT, dis.qk);
      this.o(dis.pU, dis.ql);
      this.o(dis.pV, dis.qm);
      this.o(dis.pW, dis.qn);
      this.o(dis.pX, dis.qo);
      this.o(dis.pY, dis.qp);
      this.o(dis.pZ, dis.qq);
      this.o(dis.qa, dis.qr);
      this.o(dis.qb, dis.qs);
      this.o(dis.pL, dis.qc);
      this.m(dis.na);
      this.m(dis.gs);
      this.m(dis.qP);
      this.m(dis.sx);
      this.s(dis.sy);
      this.s(dis.sz);
      this.t(dis.ti);
      this.t(dis.tj);
      this.aj();
      this.g(dis.sC, dis.sA);
      this.p(dis.sB);
      this.a(dis.hW, cwq.hB);
      this.a(cwq.hB);
      this.aE();
      this.a(dis.kN, cwq.jb);
      this.a(cwq.jb);
      this.f(dis.bQ, oo.a(dis.by, "_side"));
      this.a(dis.R);
      this.a(dis.S);
      this.a(dis.iB);
      this.a(dis.cx);
      this.a(dis.cy);
      this.a(dis.cz);
      this.a(dis.fE);
      this.a(dis.fF);
      this.a(dis.fJ);
      this.a(dis.N);
      this.a(dis.T);
      this.a(dis.O);
      this.a(dis.ch);
      this.a(dis.P);
      this.a(dis.Q);
      this.a(dis.ci);
      this.b(dis.pj, oq.d);
      this.a(dis.pi);
      this.a(dis.aR);
      this.a(dis.aS);
      this.a(dis.aT);
      this.a(dis.hb);
      this.a(dis.dI);
      this.a(dis.dJ);
      this.a(dis.ha);
      this.a(dis.pC);
      this.a(dis.mW);
      this.a(dis.dR);
      this.a(dis.k);
      this.a(dis.pk);
      this.a(dis.fz);
      this.a(dis.ec);
      this.a(dis.L);
      this.a(dis.ph);
      this.a(dis.dO);
      this.b(dis.dT, oq.g);
      this.b(dis.pq, oq.d);
      this.b(dis.fa, oq.d);
      this.m(dis.ac);
      this.m(dis.ga);
      this.a(dis.kK);
      this.a(dis.aY);
      this.a(dis.iC);
      this.a(dis.co);
      this.a(dis.pK);
      this.a(dis.ii);
      this.a(dis.oy);
      this.a(dis.dW);
      this.a(dis.dX);
      this.b(dis.ct, oq.b);
      this.a(dis.aO);
      this.b(dis.bw, oq.v);
      this.a(cwq.cS);
      this.b(dis.ck, oq.f);
      this.b(dis.pd, oq.d);
      this.a(dis.op);
      this.a(dis.aP);
      this.a(dis.qt);
      this.a(dis.qu);
      this.a(dis.qN);
      this.a(dis.su);
      this.a(dis.tf);
      this.a(dis.tg);
      this.a(dis.th);
      this.e(dis.qS);
      this.m(dis.tt);
      this.aD();
      this.a(dis.ra);
      this.a(dis.rb);
      this.a(dis.qW);
      this.a(dis.qX);
      this.a(dis.qY);
      this.a(dis.qZ);
      this.k(dis.qW, dis.rw);
      this.k(dis.qX, dis.ry);
      this.k(dis.qY, dis.rx);
      this.k(dis.qZ, dis.rz);
      this.i(dis.rM);
      this.i(dis.rN);
      this.i(dis.rP);
      this.i(dis.rO);
      this.a(dis.rM, dis.rQ);
      this.a(dis.rN, dis.rR);
      this.a(dis.rP, dis.rT);
      this.a(dis.rO, dis.rS);
      this.k(dis.rU);
      this.k(dis.rV);
      this.k(dis.rX);
      this.k(dis.rW);
      this.b(dis.rU, dis.rY);
      this.b(dis.rV, dis.rZ);
      this.b(dis.rX, dis.sb);
      this.b(dis.rW, dis.sa);
      this.a(dis.sc);
      this.a(dis.sd);
      this.a(dis.se);
      this.a(dis.sf);
      this.k(dis.sc, dis.sg);
      this.k(dis.sd, dis.sh);
      this.k(dis.se, dis.si);
      this.k(dis.sf, dis.sj);
      this.j(dis.gW, dis.ch);
      this.j(dis.gX, dis.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dis.og, dis.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dis.kt);
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
      this.F(dis.ff);
      this.F(dis.fg);
      this.F(dis.qT);
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
      this.E(dis.cO);
      this.d(dis.cO);
      this.E(dis.oa);
      this.g();
      this.E(dis.sE);
      this.l(dis.cp, dis.cq);
      this.l(dis.ea, dis.eb);
      this.a(dis.cA, dis.n, oo::c);
      this.a(dis.nY, dis.p, oo::d);
      this.y(dis.ow);
      this.y(dis.on);
      this.v(dis.aU);
      this.v(dis.hi);
      this.C();
      this.D(dis.oe);
      this.D(dis.of);
      this.e(dis.eX, ol.a(dis.eX));
      this.a(dis.dY, oq.d);
      this.a(dis.dZ, oq.d);
      this.a(dis.te);
      this.a(dis.kM, oq.d);
      this.f(dis.j);
      this.f(dis.sH);
      this.f(dis.I);
      this.g(dis.J);
      this.g(dis.M);
      this.f(dis.K);
      this.e(dis.F);
      this.b(dis.to, oq.f);
      this.a(dis.ij, oq.d, oq.e);
      this.a(dis.kx, oq.w, oq.x);
      this.a(dis.hf, oq.w, oq.x);
      this.a(dis.tk, oq.d, oq.e);
      this.a(dis.tl, oq.d, oq.e);
      this.a(dis.tm, oq.d, oq.e);
      this.c(dis.nT, oq.i);
      this.z();
      this.a(dis.pe, oo::A);
      this.a(dis.pf, oo::C);
      this.a(dis.kD, dwl.as, 0, 1, 2, 3);
      this.a(dis.gt, dwl.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dis.fq, dwl.as, 0, 1, 1, 2);
      this.a(dis.gu, dwl.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dis.cB, dwl.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dis.kA, nw.e.b, dwl.aq, 0, 1);
      this.i();
      this.h();
      this.a(ol.a("decorated_pot"), dis.iA).b(dis.tp);
      this.a(ol.a("banner"), dis.n)
         .a(on.bJ, dis.iJ, dis.iK, dis.iL, dis.iM, dis.iN, dis.iO, dis.iP, dis.iQ, dis.iR, dis.iS, dis.iT, dis.iU, dis.iV, dis.iW, dis.iX, dis.iY)
         .b(dis.iZ, dis.ja, dis.jb, dis.jc, dis.jd, dis.je, dis.jf, dis.jg, dis.jh, dis.ji, dis.jj, dis.jk, dis.jl, dis.jm, dis.jn, dis.jo);
      this.a(ol.a("bed"), dis.n)
         .b(dis.aZ, dis.ba, dis.bb, dis.bc, dis.bd, dis.be, dis.bf, dis.bg, dis.bh, dis.bi, dis.bj, dis.bk, dis.bl, dis.bm, dis.bn, dis.bo);
      this.m(dis.aZ, dis.bA);
      this.m(dis.ba, dis.bB);
      this.m(dis.bb, dis.bC);
      this.m(dis.bc, dis.bD);
      this.m(dis.bd, dis.bE);
      this.m(dis.be, dis.bF);
      this.m(dis.bf, dis.bG);
      this.m(dis.bg, dis.bH);
      this.m(dis.bh, dis.bI);
      this.m(dis.bi, dis.bJ);
      this.m(dis.bj, dis.bK);
      this.m(dis.bk, dis.bL);
      this.m(dis.bl, dis.bM);
      this.m(dis.bm, dis.bN);
      this.m(dis.bn, dis.bO);
      this.m(dis.bo, dis.bP);
      this.a(ol.a("skull"), dis.dW)
         .a(on.bK, dis.gM, dis.gK, dis.gI, dis.gE, dis.gG, dis.gQ)
         .a(dis.gO)
         .b(dis.gN, dis.gP, dis.gL, dis.gJ, dis.gF, dis.gH, dis.gR);
      this.G(dis.kP);
      this.G(dis.kQ);
      this.G(dis.kR);
      this.G(dis.kS);
      this.G(dis.kT);
      this.G(dis.kU);
      this.G(dis.kV);
      this.G(dis.kW);
      this.G(dis.kX);
      this.G(dis.kY);
      this.G(dis.kZ);
      this.G(dis.la);
      this.G(dis.lb);
      this.G(dis.lc);
      this.G(dis.ld);
      this.G(dis.le);
      this.G(dis.lf);
      this.b(dis.mX, oq.q);
      this.c(dis.mX);
      this.a(ol.a("chest"), dis.n).b(dis.cv, dis.gV);
      this.a(ol.a("ender_chest"), dis.co).b(dis.fG);
      this.f(dis.fx, dis.co).a(dis.fx, dis.kF);
      this.a(dis.aM);
      this.a(dis.aN);
      this.a(dis.lw);
      this.a(dis.lx);
      this.a(dis.ly);
      this.a(dis.lz);
      this.a(dis.lA);
      this.a(dis.lB);
      this.a(dis.lC);
      this.a(dis.lD);
      this.a(dis.lE);
      this.a(dis.lF);
      this.a(dis.lG);
      this.a(dis.lH);
      this.a(dis.lI);
      this.a(dis.lJ);
      this.a(dis.lK);
      this.a(dis.lL);
      this.a(oq.a, dis.lM, dis.lN, dis.lO, dis.lP, dis.lQ, dis.lR, dis.lS, dis.lT, dis.lU, dis.lV, dis.lW, dis.lX, dis.lY, dis.lZ, dis.ma, dis.mb);
      this.a(dis.iA);
      this.a(dis.hj);
      this.a(dis.hk);
      this.a(dis.hl);
      this.a(dis.hm);
      this.a(dis.hn);
      this.a(dis.ho);
      this.a(dis.hp);
      this.a(dis.hq);
      this.a(dis.hr);
      this.a(dis.hs);
      this.a(dis.ht);
      this.a(dis.hu);
      this.a(dis.hv);
      this.a(dis.hw);
      this.a(dis.hx);
      this.a(dis.hy);
      this.a(dis.qO);
      this.h(dis.aQ, dis.eY);
      this.h(dis.ei, dis.hz);
      this.h(dis.ej, dis.hA);
      this.h(dis.ek, dis.hB);
      this.h(dis.el, dis.hC);
      this.h(dis.em, dis.hD);
      this.h(dis.en, dis.hE);
      this.h(dis.eo, dis.hF);
      this.h(dis.ep, dis.hG);
      this.h(dis.eq, dis.hH);
      this.h(dis.er, dis.hI);
      this.h(dis.es, dis.hJ);
      this.h(dis.et, dis.hK);
      this.h(dis.eu, dis.hL);
      this.h(dis.ev, dis.hM);
      this.h(dis.ew, dis.hN);
      this.h(dis.ex, dis.hO);
      this.b(oq.o, dis.lg, dis.lh, dis.li, dis.lj, dis.lk, dis.ll, dis.lm, dis.ln, dis.lo, dis.lp, dis.lq, dis.lr, dis.ls, dis.lt, dis.lu, dis.lv);
      this.g(dis.bA, dis.ik);
      this.g(dis.bB, dis.il);
      this.g(dis.bC, dis.im);
      this.g(dis.bD, dis.in);
      this.g(dis.bE, dis.io);
      this.g(dis.bF, dis.ip);
      this.g(dis.bG, dis.iq);
      this.g(dis.bH, dis.ir);
      this.g(dis.bI, dis.is);
      this.g(dis.bJ, dis.it);
      this.g(dis.bK, dis.iu);
      this.g(dis.bL, dis.iv);
      this.g(dis.bM, dis.iw);
      this.g(dis.bN, dis.ix);
      this.g(dis.bO, dis.iy);
      this.g(dis.bP, dis.iz);
      this.a(dis.sI);
      this.a(dis.eL);
      this.a(dis.bu, dis.gb, nw.e.a);
      this.a(dis.bR, dis.gc, nw.e.b);
      this.a(dis.bT, dis.gd, nw.e.b);
      this.a(dis.bU, dis.ge, nw.e.b);
      this.a(dis.bV, dis.gf, nw.e.b);
      this.a(dis.bW, dis.gg, nw.e.b);
      this.a(dis.bX, dis.gh, nw.e.b);
      this.a(dis.bY, dis.gi, nw.e.b);
      this.a(dis.bZ, dis.gj, nw.e.b);
      this.a(dis.ca, dis.gk, nw.e.b);
      this.a(dis.cb, dis.gl, nw.e.b);
      this.a(dis.cc, dis.gm, nw.e.b);
      this.a(dis.ce, dis.gn, nw.e.b);
      this.a(dis.cd, dis.go, nw.e.b);
      this.a(dis.cg, dis.gp, nw.e.b);
      this.a(dis.cf, dis.gq, nw.e.b);
      this.a(dis.bv, dis.gr, nw.e.b);
      this.a(dis.bS, dis.fS, nw.e.b);
      this.H();
      this.u(dis.eT);
      this.u(dis.eU);
      this.u(dis.eV);
      this.a(dis.bt, nw.e.a);
      this.b(dis.dS, nw.e.a);
      this.a(cwq.dJ);
      this.b(dis.mc, dis.md, nw.e.b);
      this.a(cwq.dK);
      this.c(dis.md);
      this.b(dis.sG, nw.e.b);
      this.c(dis.sG);
      this.c(dis.sw);
      this.b(dis.oz, dis.oA, nw.e.b);
      this.b(dis.oB, dis.oC, nw.e.b);
      this.a(dis.oz, "_plant");
      this.c(dis.oA);
      this.a(dis.oB, "_plant");
      this.c(dis.oC);
      this.a(dis.mY, nw.e.a, oo.c(oo.a(dis.mZ, "_stage0")));
      this.m();
      this.a(dis.bs, nw.e.b);
      this.c(dis.iE, nw.e.b);
      this.c(dis.iF, nw.e.b);
      this.c(dis.iG, nw.e.b);
      this.c(dis.iH, nw.e.a);
      this.c(dis.iI, nw.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dis.mw, dis.mr, dis.mm, dis.mh, dis.mG, dis.mB, dis.mQ, dis.mL);
      this.a(dis.mx, dis.ms, dis.mn, dis.mi, dis.mH, dis.mC, dis.mR, dis.mM);
      this.a(dis.my, dis.mt, dis.mo, dis.mj, dis.mI, dis.mD, dis.mS, dis.mN);
      this.a(dis.mz, dis.mu, dis.mp, dis.mk, dis.mJ, dis.mE, dis.mT, dis.mO);
      this.a(dis.mA, dis.mv, dis.mq, dis.ml, dis.mK, dis.mF, dis.mU, dis.mP);
      this.e(dis.fe, dis.fc);
      this.e(dis.fd, dis.fb);
      this.l(dis.ab).c(dis.ab).a(dis.av);
      this.l(dis.am).c(dis.am).a(dis.aD);
      this.a(dis.am, dis.dj, dis.ds);
      this.b(dis.aL, oq.s);
      this.l(dis.Y).c(dis.Y).a(dis.as);
      this.l(dis.ai).c(dis.ai).a(dis.aA);
      this.a(dis.ai, dis.dd, dis.do);
      this.a(dis.B, dis.fX, nw.e.b);
      this.b(dis.aI, oq.s);
      this.l(dis.Z).d(dis.Z).a(dis.at);
      this.l(dis.aj).d(dis.aj).a(dis.aB);
      this.a(dis.aj, dis.de, dis.dp);
      this.a(dis.C, dis.fY, nw.e.b);
      this.b(dis.aJ, oq.s);
      this.l(dis.W).c(dis.W).a(dis.aq);
      this.l(dis.ag).c(dis.ag).a(dis.ay);
      this.a(dis.ag, dis.dc, dis.dn);
      this.a(dis.z, dis.fV, nw.e.b);
      this.b(dis.aG, oq.s);
      this.l(dis.U).c(dis.U).a(dis.ao);
      this.l(dis.al).c(dis.al).a(dis.aw);
      this.a(dis.al, dis.da, dis.dl);
      this.a(dis.x, dis.fT, nw.e.b);
      this.b(dis.aE, oq.s);
      this.l(dis.V).c(dis.V).a(dis.ap);
      this.l(dis.af).c(dis.af).a(dis.ax);
      this.a(dis.af, dis.db, dis.dm);
      this.a(dis.y, dis.fU, nw.e.b);
      this.b(dis.aF, oq.s);
      this.l(dis.aa).c(dis.aa).a(dis.au);
      this.l(dis.ak).c(dis.ak).a(dis.aC);
      this.a(dis.ak, dis.dg, dis.dr);
      this.a(dis.D, dis.fZ, nw.e.b);
      this.b(dis.aK, oq.s);
      this.l(dis.X).c(dis.X).a(dis.ar);
      this.l(dis.ah).c(dis.ah).a(dis.az);
      this.a(dis.ah, dis.df, dis.dq);
      this.a(dis.A, dis.fW, nw.e.b);
      this.b(dis.aH, oq.s);
      this.l(dis.os).b(dis.os).a(dis.ou);
      this.l(dis.ot).b(dis.ot).a(dis.ov);
      this.a(dis.ot, dis.dh, dis.dt);
      this.a(dis.ox, dis.pm, nw.e.b);
      this.n(dis.oD, dis.po);
      this.l(dis.oj).b(dis.oj).a(dis.ol);
      this.l(dis.ok).b(dis.ok).a(dis.om);
      this.a(dis.ok, dis.di, dis.du);
      this.a(dis.oo, dis.pn, nw.e.b);
      this.n(dis.oq, dis.pp);
      this.l(dis.ae).d(dis.ae);
      this.l(dis.an).d(dis.an);
      this.a(dis.v, dis.dk, dis.dv);
      this.b(dis.or, nw.e.b);
      this.a(cwq.dG);
      this.i(dis.dy);
      this.k(dis.hY);
      this.u();
      this.n(dis.cP);
      this.o(dis.bp);
      this.o(dis.bq);
      this.o(dis.hh);
      this.t();
      this.q(dis.fN);
      this.q(dis.kG);
      this.q(dis.kH);
      this.r(dis.gS);
      this.r(dis.gT);
      this.r(dis.gU);
      this.o();
      this.p();
      this.d(dis.cD, oq.h);
      this.d(dis.nW, oq.h);
      this.d(dis.nV, oq.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dis.eK, dis.eS);
      this.k(dis.m, dis.eO);
      this.k(dis.eJ, dis.eR);
      this.k(dis.eI, dis.eQ);
      this.az();
      this.k(dis.eH, dis.eP);
      this.aA();
      cxv.b().forEach($$0 -> this.a($$0, ol.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dis.hX);
      oe.a<Integer> $$0 = oe.a(dwl.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alj $$3 = oo.a(cwq.hC, $$2);
         $$0.a($$1, og.a().a(oh.c, on.aa.a(dis.hX, $$2, oo.h($$3), this.c)));
         on.bB.a(ol.a(cwq.hC, $$2), oo.k($$3), this.c);
      }

      this.b.accept(od.a(dis.hX).a($$0));
   }

   private void o(diq $$0, diq $$1) {
      this.a($$0.j());
      oo $$2 = oo.b(oo.G($$0));
      oo $$3 = oo.b(oo.a($$0, "_lit"));
      alj $$4 = on.bL.a($$0, "_one_candle", $$2, this.c);
      alj $$5 = on.bM.a($$0, "_two_candles", $$2, this.c);
      alj $$6 = on.bN.a($$0, "_three_candles", $$2, this.c);
      alj $$7 = on.bO.a($$0, "_four_candles", $$2, this.c);
      alj $$8 = on.bL.a($$0, "_one_candle_lit", $$3, this.c);
      alj $$9 = on.bM.a($$0, "_two_candles_lit", $$3, this.c);
      alj $$10 = on.bN.a($$0, "_three_candles_lit", $$3, this.c);
      alj $$11 = on.bO.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            od.a($$0)
               .a(
                  oe.a(dwl.az, dwl.r)
                     .a(1, false, og.a().a(oh.c, $$4))
                     .a(2, false, og.a().a(oh.c, $$5))
                     .a(3, false, og.a().a(oh.c, $$6))
                     .a(4, false, og.a().a(oh.c, $$7))
                     .a(1, true, og.a().a(oh.c, $$8))
                     .a(2, true, og.a().a(oh.c, $$9))
                     .a(3, true, og.a().a(oh.c, $$10))
                     .a(4, true, og.a().a(oh.c, $$11))
               )
         );
      alj $$12 = on.bP.a($$1, oo.a($$0, false), this.c);
      alj $$13 = on.bP.a($$1, "_lit", oo.a($$0, true), this.c);
      this.b.accept(od.a($$1).a(a(dwl.r, $$13, $$12)));
   }

   class a {
      private final alj b;

      public a(final alj $$0, final diq $$1) {
         this.b = on.aa.a($$0, oo.u($$1), nw.this.c);
      }

      public nw.a a(diq... $$0) {
         for (diq $$1 : $$0) {
            nw.this.b.accept(nw.c($$1, this.b));
         }

         return this;
      }

      public nw.a b(diq... $$0) {
         for (diq $$1 : $$0) {
            nw.this.c($$1);
         }

         return this.a($$0);
      }

      public nw.a a(om $$0, diq... $$1) {
         for (diq $$2 : $$1) {
            $$0.a(ol.a($$2.j()), oo.u($$2), nw.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final oo b;
      private final Map<om, alj> c = Maps.newHashMap();
      @Nullable
      private md d;
      @Nullable
      private alj e;
      private final Set<diq> f = new HashSet<>();

      public b(final oo $$0) {
         this.b = $$0;
      }

      public nw.b a(diq $$0, om $$1) {
         this.e = $$1.a($$0, this.b, nw.this.c);
         if (nw.this.f.containsKey($$0)) {
            nw.this.b.accept(nw.this.f.get($$0).create($$0, this.e, this.b, nw.this.c));
         } else {
            nw.this.b.accept(nw.c($$0, this.e));
         }

         return this;
      }

      public nw.b a(diq $$0, diq $$1) {
         alj $$2 = ol.a($$0);
         nw.this.b.accept(nw.c($$1, $$2));
         nw.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nw.b a(diq $$0) {
         alj $$1 = on.s.a($$0, this.b, nw.this.c);
         alj $$2 = on.t.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.b($$0, $$1, $$2));
         alj $$3 = on.u.a($$0, this.b, nw.this.c);
         nw.this.a($$0, $$3);
         return this;
      }

      public nw.b b(diq $$0) {
         alj $$1 = on.M.a($$0, this.b, nw.this.c);
         alj $$2 = on.N.a($$0, this.b, nw.this.c);
         alj $$3 = on.O.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.a($$0, $$1, $$2, $$3));
         alj $$4 = on.P.a($$0, this.b, nw.this.c);
         nw.this.a($$0, $$4);
         return this;
      }

      public nw.b c(diq $$0) {
         oo $$1 = oo.p($$0);
         alj $$2 = on.D.a($$0, $$1, nw.this.c);
         alj $$3 = on.E.a($$0, $$1, nw.this.c);
         alj $$4 = on.F.a($$0, $$1, nw.this.c);
         alj $$5 = on.G.a($$0, $$1, nw.this.c);
         alj $$6 = on.H.a($$0, $$1, nw.this.c);
         nw.this.b.accept(nw.a($$0, $$2, $$3, $$4, $$5, $$6));
         alj $$7 = on.I.a($$0, $$1, nw.this.c);
         nw.this.a($$0, $$7);
         return this;
      }

      public nw.b d(diq $$0) {
         alj $$1 = on.J.a($$0, this.b, nw.this.c);
         alj $$2 = on.K.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.c($$0, $$1, $$2));
         alj $$3 = on.L.a($$0, this.b, nw.this.c);
         nw.this.a($$0, $$3);
         return this;
      }

      public nw.b e(diq $$0) {
         oo $$1 = oo.p($$0);
         alj $$2 = on.R.a($$0, $$1, nw.this.c);
         alj $$3 = on.Q.a($$0, $$1, nw.this.c);
         alj $$4 = on.T.a($$0, $$1, nw.this.c);
         alj $$5 = on.S.a($$0, $$1, nw.this.c);
         nw.this.b.accept(nw.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nw.b f(diq $$0) {
         alj $$1 = on.V.a($$0, this.b, nw.this.c);
         alj $$2 = on.U.a($$0, this.b, nw.this.c);
         alj $$3 = on.X.a($$0, this.b, nw.this.c);
         alj $$4 = on.W.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nw.b g(diq $$0) {
         alj $$1 = on.Y.a($$0, this.b, nw.this.c);
         alj $$2 = on.Z.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.e($$0, $$1, $$2));
         return this;
      }

      public nw.b h(diq $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            diq $$1 = this.d.b().get(md.b.r);
            alj $$2 = on.aa.a($$0, this.b, nw.this.c);
            nw.this.b.accept(nw.c($$0, $$2));
            nw.this.b.accept(nw.c($$1, $$2));
            nw.this.a($$0.j());
            nw.this.c($$1);
            return this;
         }
      }

      public nw.b i(diq $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alj $$1 = this.a(on.ab, $$0);
            alj $$2 = this.a(on.ac, $$0);
            nw.this.b.accept(nw.e($$0, $$1, $$2, this.e));
            nw.this.a($$0, $$1);
            return this;
         }
      }

      public nw.b j(diq $$0) {
         alj $$1 = this.a(on.af, $$0);
         alj $$2 = this.a(on.ae, $$0);
         alj $$3 = this.a(on.ag, $$0);
         nw.this.b.accept(nw.b($$0, $$1, $$2, $$3));
         nw.this.a($$0, $$2);
         return this;
      }

      private nw.b k(diq $$0) {
         oq $$1 = nw.this.g.getOrDefault($$0, oq.a.get($$0));
         alj $$2 = $$1.a($$0, nw.this.c);
         nw.this.b.accept(nw.c($$0, $$2));
         return this;
      }

      private nw.b l(diq $$0) {
         nw.this.i($$0);
         return this;
      }

      private void m(diq $$0) {
         if (nw.this.e.contains($$0)) {
            nw.this.k($$0);
         } else {
            nw.this.j($$0);
         }
      }

      private alj a(om $$0, diq $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nw.this.c));
      }

      public nw.b a(md $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nw.b, diq> $$2 = nw.h.get($$0x);
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
      oa create(diq var1, alj var2, oo var3, BiConsumer<alj, Supplier<JsonElement>> var4);
   }

   static record d(om a, String b) {
   }

   static enum e {
      a,
      b;

      public om a() {
         return this == a ? on.ap : on.ao;
      }

      public om b() {
         return this == a ? on.ar : on.aq;
      }
   }

   class f {
      private final oo b;

      public f(final oo $$0) {
         this.b = $$0;
      }

      public nw.f a(diq $$0) {
         oo $$1 = this.b.c(op.d, this.b.a(op.i));
         alj $$2 = on.j.a($$0, $$1, nw.this.c);
         nw.this.b.accept(nw.d($$0, $$2));
         return this;
      }

      public nw.f b(diq $$0) {
         alj $$1 = on.j.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.d($$0, $$1));
         return this;
      }

      public nw.f c(diq $$0) {
         alj $$1 = on.j.a($$0, this.b, nw.this.c);
         alj $$2 = on.k.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.d($$0, $$1, $$2));
         return this;
      }

      public nw.f d(diq $$0) {
         nw.this.b.accept(nw.a($$0, this.b, nw.this.c));
         return this;
      }
   }
}
