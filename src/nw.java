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
   final BiConsumer<all, Supplier<JsonElement>> c;
   private final Consumer<cwb> d;
   final List<dij> e = ImmutableList.of(dil.ey, dil.eE, dil.hY);
   final Map<dij, nw.c> f = ImmutableMap.builder().put(dil.b, nw::a).put(dil.sJ, nw::c).put(dil.eM, nw::b).build();
   final Map<dij, oq> g = ImmutableMap.builder()
      .put(dil.aV, oq.y.get(dil.aV))
      .put(dil.jp, oq.y.get(dil.jp))
      .put(dil.jS, oq.a(oo.a(dil.aV, "_top")))
      .put(dil.jU, oq.a(oo.a(dil.jp, "_top")))
      .put(dil.aX, oq.d.get(dil.aV).a($$0x -> $$0x.a(op.i, oo.G(dil.aX))))
      .put(dil.jr, oq.d.get(dil.jp).a($$0x -> $$0x.a(op.i, oo.G(dil.jr))))
      .put(dil.hd, oq.d.get(dil.hd))
      .put(dil.jT, oq.a(oo.a(dil.hd, "_bottom")))
      .put(dil.pr, oq.z.get(dil.pr))
      .put(dil.sJ, oq.z.get(dil.sJ))
      .put(dil.he, oq.d.get(dil.he).a($$0x -> $$0x.a(op.i, oo.G(dil.he))))
      .put(dil.aW, oq.d.get(dil.aW).a($$0x -> {
         $$0x.a(op.d, oo.a(dil.aV, "_top"));
         $$0x.a(op.i, oo.G(dil.aW));
      }))
      .put(dil.jq, oq.d.get(dil.jq).a($$0x -> {
         $$0x.a(op.d, oo.a(dil.jp, "_top"));
         $$0x.a(op.i, oo.G(dil.jq));
      }))
      .put(dil.qM, oq.z.get(dil.qM))
      .put(dil.qH, oq.z.get(dil.qH))
      .build();
   static final Map<md.b, BiConsumer<nw.b, dij>> h = ImmutableMap.builder()
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
   public static final List<Pair<dwf, Function<all, og>>> a = List.of(
      Pair.of(dwe.L, (Function<all, og>)$$0 -> og.a().a(oh.c, $$0)),
      Pair.of(dwe.M, (Function<all, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.b, oh.a.b).a(oh.d, true)),
      Pair.of(dwe.N, (Function<all, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.b, oh.a.c).a(oh.d, true)),
      Pair.of(dwe.O, (Function<all, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.b, oh.a.d).a(oh.d, true)),
      Pair.of(dwe.J, (Function<all, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.a, oh.a.d).a(oh.d, true)),
      Pair.of(dwe.K, (Function<all, og>)$$0 -> og.a().a(oh.c, $$0).a(oh.a, oh.a.b).a(oh.d, true))
   );
   private static final Map<nw.d, all> i = new HashMap<>();

   private static oa a(dij $$0, all $$1, oo $$2, BiConsumer<all, Supplier<JsonElement>> $$3) {
      all $$4 = on.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static oa b(dij $$0, all $$1, oo $$2, BiConsumer<all, Supplier<JsonElement>> $$3) {
      all $$4 = on.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static oa c(dij $$0, all $$1, oo $$2, BiConsumer<all, Supplier<JsonElement>> $$3) {
      all $$4 = on.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nw(Consumer<oa> $$0, BiConsumer<all, Supplier<JsonElement>> $$1, Consumer<cwb> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dij $$0) {
      this.d.accept($$0.j());
   }

   void a(dij $$0, all $$1) {
      this.c.accept(ol.a($$0.j()), new ok($$1));
   }

   private void a(cwb $$0, all $$1) {
      this.c.accept(ol.a($$0), new ok($$1));
   }

   void a(cwb $$0) {
      on.bB.a(ol.a($$0), oo.b($$0), this.c);
   }

   private void d(dij $$0) {
      cwb $$1 = $$0.j();
      if ($$1 != cwj.a) {
         on.bB.a(ol.a($$1), oo.F($$0), this.c);
      }
   }

   private void a(dij $$0, String $$1) {
      cwb $$2 = $$0.j();
      on.bB.a(ol.a($$2), oo.k(oo.a($$0, $$1)), this.c);
   }

   private static oe b() {
      return oe.a(dwe.R).a(jm.f, og.a().a(oh.b, oh.a.b)).a(jm.d, og.a().a(oh.b, oh.a.c)).a(jm.e, og.a().a(oh.b, oh.a.d)).a(jm.c, og.a());
   }

   private static oe c() {
      return oe.a(dwe.R).a(jm.d, og.a()).a(jm.e, og.a().a(oh.b, oh.a.b)).a(jm.c, og.a().a(oh.b, oh.a.c)).a(jm.f, og.a().a(oh.b, oh.a.d));
   }

   private static oe d() {
      return oe.a(dwe.R).a(jm.f, og.a()).a(jm.d, og.a().a(oh.b, oh.a.b)).a(jm.e, og.a().a(oh.b, oh.a.c)).a(jm.c, og.a().a(oh.b, oh.a.d));
   }

   private static oe e() {
      return oe.a(dwe.P)
         .a(jm.a, og.a().a(oh.a, oh.a.b))
         .a(jm.b, og.a().a(oh.a, oh.a.d))
         .a(jm.c, og.a())
         .a(jm.d, og.a().a(oh.b, oh.a.c))
         .a(jm.e, og.a().a(oh.b, oh.a.d))
         .a(jm.f, og.a().a(oh.b, oh.a.b));
   }

   private static od b(dij $$0, all $$1) {
      return od.a($$0, a($$1));
   }

   private static og[] a(all $$0) {
      return new og[]{og.a().a(oh.c, $$0), og.a().a(oh.c, $$0).a(oh.b, oh.a.b), og.a().a(oh.c, $$0).a(oh.b, oh.a.c), og.a().a(oh.c, $$0).a(oh.b, oh.a.d)};
   }

   private static od a(dij $$0, all $$1, all $$2) {
      return od.a($$0, og.a().a(oh.c, $$1), og.a().a(oh.c, $$2), og.a().a(oh.c, $$1).a(oh.b, oh.a.c), og.a().a(oh.c, $$2).a(oh.b, oh.a.c));
   }

   private static oe a(dwf $$0, all $$1, all $$2) {
      return oe.a($$0).a(true, og.a().a(oh.c, $$1)).a(false, og.a().a(oh.c, $$2));
   }

   private void e(dij $$0) {
      all $$1 = oq.a.create($$0, this.c);
      all $$2 = oq.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dij $$0) {
      all $$1 = oq.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dij $$0) {
      this.b.accept(od.a($$0).a(oe.a(dwe.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         all $$3 = oo.a($$0, $$2);
         return og.a().a(oh.c, on.c.a($$0, $$2, new oo().a(op.a, $$3), this.c));
      })));
      this.a($$0, oo.a($$0, "_0"));
   }

   static oa b(dij $$0, all $$1, all $$2) {
      return od.a($$0)
         .a(oe.a(dwe.w).a(false, og.a().a(oh.c, $$1)).a(true, og.a().a(oh.c, $$2)))
         .a(
            oe.a(dwe.U, dwe.R)
               .a(dvz.a, jm.f, og.a().a(oh.b, oh.a.b))
               .a(dvz.a, jm.e, og.a().a(oh.b, oh.a.d))
               .a(dvz.a, jm.d, og.a().a(oh.b, oh.a.c))
               .a(dvz.a, jm.c, og.a())
               .a(dvz.b, jm.f, og.a().a(oh.b, oh.a.b).a(oh.a, oh.a.b).a(oh.d, true))
               .a(dvz.b, jm.e, og.a().a(oh.b, oh.a.d).a(oh.a, oh.a.b).a(oh.d, true))
               .a(dvz.b, jm.d, og.a().a(oh.b, oh.a.c).a(oh.a, oh.a.b).a(oh.d, true))
               .a(dvz.b, jm.c, og.a().a(oh.a, oh.a.b).a(oh.d, true))
               .a(dvz.c, jm.f, og.a().a(oh.b, oh.a.d).a(oh.a, oh.a.c))
               .a(dvz.c, jm.e, og.a().a(oh.b, oh.a.b).a(oh.a, oh.a.c))
               .a(dvz.c, jm.d, og.a().a(oh.a, oh.a.c))
               .a(dvz.c, jm.c, og.a().a(oh.b, oh.a.c).a(oh.a, oh.a.c))
         );
   }

   private static oe.d<jm, dwj, dwi, Boolean> a(oe.d<jm, dwj, dwi, Boolean> $$0, dwj $$1, all $$2, all $$3, all $$4, all $$5) {
      return $$0.a(jm.f, $$1, dwi.a, false, og.a().a(oh.c, $$2))
         .a(jm.d, $$1, dwi.a, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
         .a(jm.e, $$1, dwi.a, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.c))
         .a(jm.c, $$1, dwi.a, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.d))
         .a(jm.f, $$1, dwi.b, false, og.a().a(oh.c, $$4))
         .a(jm.d, $$1, dwi.b, false, og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
         .a(jm.e, $$1, dwi.b, false, og.a().a(oh.c, $$4).a(oh.b, oh.a.c))
         .a(jm.c, $$1, dwi.b, false, og.a().a(oh.c, $$4).a(oh.b, oh.a.d))
         .a(jm.f, $$1, dwi.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
         .a(jm.d, $$1, dwi.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
         .a(jm.e, $$1, dwi.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
         .a(jm.c, $$1, dwi.a, true, og.a().a(oh.c, $$3))
         .a(jm.f, $$1, dwi.b, true, og.a().a(oh.c, $$5).a(oh.b, oh.a.d))
         .a(jm.d, $$1, dwi.b, true, og.a().a(oh.c, $$5))
         .a(jm.e, $$1, dwi.b, true, og.a().a(oh.c, $$5).a(oh.b, oh.a.b))
         .a(jm.c, $$1, dwi.b, true, og.a().a(oh.c, $$5).a(oh.b, oh.a.c));
   }

   private static oa a(dij $$0, all $$1, all $$2, all $$3, all $$4, all $$5, all $$6, all $$7, all $$8) {
      return od.a($$0).a(a(a(oe.a(dwe.R, dwe.ae, dwe.be, dwe.u), dwj.b, $$1, $$2, $$3, $$4), dwj.a, $$5, $$6, $$7, $$8));
   }

   static oa a(dij $$0, all $$1, all $$2, all $$3, all $$4, all $$5) {
      return oc.a($$0)
         .a(og.a().a(oh.c, $$1))
         .a(ob.a().a(dwe.L, true), og.a().a(oh.c, $$2).a(oh.d, false))
         .a(ob.a().a(dwe.M, true), og.a().a(oh.c, $$3).a(oh.d, false))
         .a(ob.a().a(dwe.N, true), og.a().a(oh.c, $$4).a(oh.d, false))
         .a(ob.a().a(dwe.O, true), og.a().a(oh.c, $$5).a(oh.d, false));
   }

   static oa c(dij $$0, all $$1, all $$2) {
      return oc.a($$0)
         .a(og.a().a(oh.c, $$1))
         .a(ob.a().a(dwe.L, true), og.a().a(oh.c, $$2).a(oh.d, true))
         .a(ob.a().a(dwe.M, true), og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, true))
         .a(ob.a().a(dwe.N, true), og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, true))
         .a(ob.a().a(dwe.O, true), og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, true));
   }

   static oa a(dij $$0, all $$1, all $$2, all $$3) {
      return oc.a($$0)
         .a(ob.a().a(dwe.J, true), og.a().a(oh.c, $$1))
         .a(ob.a().a(dwe.X, dwz.b), og.a().a(oh.c, $$2).a(oh.d, true))
         .a(ob.a().a(dwe.W, dwz.b), og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, true))
         .a(ob.a().a(dwe.Y, dwz.b), og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, true))
         .a(ob.a().a(dwe.Z, dwz.b), og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, true))
         .a(ob.a().a(dwe.X, dwz.c), og.a().a(oh.c, $$3).a(oh.d, true))
         .a(ob.a().a(dwe.W, dwz.c), og.a().a(oh.c, $$3).a(oh.b, oh.a.b).a(oh.d, true))
         .a(ob.a().a(dwe.Y, dwz.c), og.a().a(oh.c, $$3).a(oh.b, oh.a.c).a(oh.d, true))
         .a(ob.a().a(dwe.Z, dwz.c), og.a().a(oh.c, $$3).a(oh.b, oh.a.d).a(oh.d, true));
   }

   static oa a(dij $$0, all $$1, all $$2, all $$3, all $$4, boolean $$5) {
      return od.a($$0, og.a().a(oh.d, $$5))
         .a(c())
         .a(
            oe.a(dwe.q, dwe.u)
               .a(false, false, og.a().a(oh.c, $$2))
               .a(true, false, og.a().a(oh.c, $$4))
               .a(false, true, og.a().a(oh.c, $$1))
               .a(true, true, og.a().a(oh.c, $$3))
         );
   }

   static oa b(dij $$0, all $$1, all $$2, all $$3) {
      return od.a($$0)
         .a(
            oe.a(dwe.R, dwe.af, dwe.bi)
               .a(jm.f, dwm.b, dww.a, og.a().a(oh.c, $$2))
               .a(jm.e, dwm.b, dww.a, og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwm.b, dww.a, og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwm.b, dww.a, og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwm.b, dww.e, og.a().a(oh.c, $$3))
               .a(jm.e, dwm.b, dww.e, og.a().a(oh.c, $$3).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwm.b, dww.e, og.a().a(oh.c, $$3).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwm.b, dww.e, og.a().a(oh.c, $$3).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwm.b, dww.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.e, dwm.b, dww.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.d, dwm.b, dww.d, og.a().a(oh.c, $$3))
               .a(jm.c, dwm.b, dww.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.f, dwm.b, dww.c, og.a().a(oh.c, $$1))
               .a(jm.e, dwm.b, dww.c, og.a().a(oh.c, $$1).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwm.b, dww.c, og.a().a(oh.c, $$1).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwm.b, dww.c, og.a().a(oh.c, $$1).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwm.b, dww.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.e, dwm.b, dww.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.d, dwm.b, dww.b, og.a().a(oh.c, $$1))
               .a(jm.c, dwm.b, dww.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.f, dwm.a, dww.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.e, dwm.a, dww.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwm.a, dww.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwm.a, dww.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwm.a, dww.e, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.e, dwm.a, dww.e, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.d, dwm.a, dww.e, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.c, dwm.a, dww.e, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.f, dwm.a, dww.d, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.e, dwm.a, dww.d, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwm.a, dww.d, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwm.a, dww.d, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.f, dwm.a, dww.c, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.e, dwm.a, dww.c, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
               .a(jm.d, dwm.a, dww.c, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.c, dwm.a, dww.c, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.f, dwm.a, dww.b, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.d, true))
               .a(jm.e, dwm.a, dww.b, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.c).a(oh.d, true))
               .a(jm.d, dwm.a, dww.b, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.b).a(oh.d, true))
               .a(jm.c, dwm.a, dww.b, og.a().a(oh.c, $$1).a(oh.a, oh.a.c).a(oh.b, oh.a.d).a(oh.d, true))
         );
   }

   private static oa c(dij $$0, all $$1, all $$2, all $$3) {
      return od.a($$0)
         .a(
            oe.a(dwe.R, dwe.af, dwe.u)
               .a(jm.c, dwm.b, false, og.a().a(oh.c, $$2))
               .a(jm.d, dwm.b, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.c))
               .a(jm.f, dwm.b, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
               .a(jm.e, dwm.b, false, og.a().a(oh.c, $$2).a(oh.b, oh.a.d))
               .a(jm.c, dwm.a, false, og.a().a(oh.c, $$1))
               .a(jm.d, dwm.a, false, og.a().a(oh.c, $$1).a(oh.b, oh.a.c))
               .a(jm.f, dwm.a, false, og.a().a(oh.c, $$1).a(oh.b, oh.a.b))
               .a(jm.e, dwm.a, false, og.a().a(oh.c, $$1).a(oh.b, oh.a.d))
               .a(jm.c, dwm.b, true, og.a().a(oh.c, $$3))
               .a(jm.d, dwm.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               .a(jm.f, dwm.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(jm.e, dwm.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
               .a(jm.c, dwm.a, true, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.c))
               .a(jm.d, dwm.a, true, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.a))
               .a(jm.f, dwm.a, true, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.d))
               .a(jm.e, dwm.a, true, og.a().a(oh.c, $$3).a(oh.a, oh.a.c).a(oh.b, oh.a.b))
         );
   }

   private static oa d(dij $$0, all $$1, all $$2, all $$3) {
      return od.a($$0)
         .a(
            oe.a(dwe.R, dwe.af, dwe.u)
               .a(jm.c, dwm.b, false, og.a().a(oh.c, $$2))
               .a(jm.d, dwm.b, false, og.a().a(oh.c, $$2))
               .a(jm.f, dwm.b, false, og.a().a(oh.c, $$2))
               .a(jm.e, dwm.b, false, og.a().a(oh.c, $$2))
               .a(jm.c, dwm.a, false, og.a().a(oh.c, $$1))
               .a(jm.d, dwm.a, false, og.a().a(oh.c, $$1))
               .a(jm.f, dwm.a, false, og.a().a(oh.c, $$1))
               .a(jm.e, dwm.a, false, og.a().a(oh.c, $$1))
               .a(jm.c, dwm.b, true, og.a().a(oh.c, $$3))
               .a(jm.d, dwm.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               .a(jm.f, dwm.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(jm.e, dwm.b, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
               .a(jm.c, dwm.a, true, og.a().a(oh.c, $$3))
               .a(jm.d, dwm.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               .a(jm.f, dwm.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(jm.e, dwm.a, true, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
         );
   }

   static od c(dij $$0, all $$1) {
      return od.a($$0, og.a().a(oh.c, $$1));
   }

   private static oe f() {
      return oe.a(dwe.I).a(jm.a.b, og.a()).a(jm.a.c, og.a().a(oh.a, oh.a.b)).a(jm.a.a, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.b));
   }

   static oa a(dij $$0, oo $$1, BiConsumer<all, Supplier<JsonElement>> $$2) {
      all $$3 = on.g.a($$0, $$1, $$2);
      all $$4 = on.h.a($$0, $$1, $$2);
      all $$5 = on.i.a($$0, $$1, $$2);
      all $$6 = on.j.a($$0, $$1, $$2);
      return od.a($$0, og.a().a(oh.c, $$6)).a(oe.a(dwe.I).a(jm.a.a, og.a().a(oh.c, $$3)).a(jm.a.b, og.a().a(oh.c, $$4)).a(jm.a.c, og.a().a(oh.c, $$5)));
   }

   static oa d(dij $$0, all $$1) {
      return od.a($$0, og.a().a(oh.c, $$1)).a(f());
   }

   private void e(dij $$0, all $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dij $$0, oq.a $$1) {
      all $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dij $$0, oq.a $$1) {
      all $$2 = $$1.create($$0, this.c);
      this.b.accept(od.a($$0, og.a().a(oh.c, $$2)).a(b()));
   }

   static oa d(dij $$0, all $$1, all $$2) {
      return od.a($$0)
         .a(
            oe.a(dwe.I)
               .a(jm.a.b, og.a().a(oh.c, $$1))
               .a(jm.a.c, og.a().a(oh.c, $$2).a(oh.a, oh.a.b))
               .a(jm.a.a, og.a().a(oh.c, $$2).a(oh.a, oh.a.b).a(oh.b, oh.a.b))
         );
   }

   private void a(dij $$0, oq.a $$1, oq.a $$2) {
      all $$3 = $$1.create($$0, this.c);
      all $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private all a(dij $$0, String $$1, om $$2, Function<all, oo> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oo.a($$0, $$1)), this.c);
   }

   static oa e(dij $$0, all $$1, all $$2) {
      return od.a($$0).a(a(dwe.w, $$2, $$1));
   }

   static oa e(dij $$0, all $$1, all $$2, all $$3) {
      return od.a($$0).a(oe.a(dwe.bh).a(dwv.b, og.a().a(oh.c, $$1)).a(dwv.a, og.a().a(oh.c, $$2)).a(dwv.c, og.a().a(oh.c, $$3)));
   }

   public void a(dij $$0) {
      this.b($$0, oq.a);
   }

   public void b(dij $$0, oq.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dij $$0, oo $$1, om $$2) {
      all $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nw.b h(dij $$0) {
      oq $$1 = this.g.getOrDefault($$0, oq.a.get($$0));
      return new nw.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dij $$0, dij $$1, dij $$2) {
      oo $$3 = oo.u($$0);
      all $$4 = on.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void i(dij $$0) {
      oo $$1 = oo.t($$0);
      all $$2 = on.v.a($$0, $$1, this.c);
      all $$3 = on.w.a($$0, $$1, this.c);
      all $$4 = on.x.a($$0, $$1, this.c);
      all $$5 = on.y.a($$0, $$1, this.c);
      all $$6 = on.z.a($$0, $$1, this.c);
      all $$7 = on.A.a($$0, $$1, this.c);
      all $$8 = on.B.a($$0, $$1, this.c);
      all $$9 = on.C.a($$0, $$1, this.c);
      this.a($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dij $$0, dij $$1) {
      all $$2 = on.v.a($$0);
      all $$3 = on.w.a($$0);
      all $$4 = on.x.a($$0);
      all $$5 = on.y.a($$0);
      all $$6 = on.z.a($$0);
      all $$7 = on.A.a($$0);
      all $$8 = on.B.a($$0);
      all $$9 = on.C.a($$0);
      this.a($$1, ol.a($$0.j()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dij $$0) {
      oo $$1 = oo.b($$0);
      all $$2 = on.ak.a($$0, $$1, this.c);
      all $$3 = on.al.a($$0, $$1, this.c);
      all $$4 = on.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dij $$0) {
      oo $$1 = oo.b($$0);
      all $$2 = on.ah.a($$0, $$1, this.c);
      all $$3 = on.ai.a($$0, $$1, this.c);
      all $$4 = on.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dij $$0, dij $$1) {
      all $$2 = on.ah.a($$0);
      all $$3 = on.ai.a($$0);
      all $$4 = on.aj.a($$0);
      this.a($$1, ol.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dil.sD);
      all $$0 = ol.a(dil.sD);
      all $$1 = ol.a(dil.sD, "_partial_tilt");
      all $$2 = ol.a(dil.sD, "_full_tilt");
      this.b
         .accept(
            od.a(dil.sD)
               .a(b())
               .a(oe.a(dwe.bl).a(dwy.a, og.a().a(oh.c, $$0)).a(dwy.b, og.a().a(oh.c, $$0)).a(dwy.c, og.a().a(oh.c, $$1)).a(dwy.d, og.a().a(oh.c, $$2)))
         );
   }

   private nw.f l(dij $$0) {
      return new nw.f(oo.n($$0));
   }

   private void m(dij $$0) {
      this.c($$0, $$0);
   }

   private void c(dij $$0, dij $$1) {
      this.b.accept(c($$0, ol.a($$1)));
   }

   private void a(dij $$0, nw.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dij $$0, nw.e $$1, oo $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dij $$0, nw.e $$1) {
      oo $$2 = oo.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dij $$0, nw.e $$1, oo $$2) {
      all $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dij $$0, nw.e $$1, dwq<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         oe $$4 = oe.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            oo $$5 = oo.c(oo.a($$0, $$4x));
            all $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return og.a().a(oh.c, $$6);
         });
         this.a($$0.j());
         this.b.accept(od.a($$0).a($$4));
      }
   }

   private void a(dij $$0, dij $$1, nw.e $$2) {
      this.a($$0, $$2);
      oo $$3 = oo.d($$0);
      all $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dij $$0, dij $$1) {
      oq $$2 = oq.p.get($$0);
      all $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      all $$4 = on.aC.a($$1, $$2.b(), this.c);
      this.b.accept(od.a($$1, og.a().a(oh.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dij $$0, dij $$1) {
      this.a($$0.j());
      oo $$2 = oo.h($$0);
      oo $$3 = oo.a($$0, $$1);
      all $$4 = on.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            od.a($$1, og.a().a(oh.c, $$4))
               .a(oe.a(dwe.R).a(jm.e, og.a()).a(jm.d, og.a().a(oh.b, oh.a.d)).a(jm.c, og.a().a(oh.b, oh.a.b)).a(jm.f, og.a().a(oh.b, oh.a.c)))
         );
      this.b.accept(od.a($$0).a(oe.a(dwe.av).a($$2x -> og.a().a(oh.c, on.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dij $$0 = dil.kC;
      this.a($$0.j());
      all $$1 = ol.a($$0, "_top");
      all $$2 = ol.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dij $$0 = dil.kB;
      this.a($$0.j());
      oe $$1 = oe.a(dnx.d, dwe.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> og.a().a(oh.c, ol.a($$0, "_top_stage_" + $$1x));
            case b -> og.a().a(oh.c, ol.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(od.a($$0).a($$1));
   }

   private void a(dij $$0, dij $$1, dij $$2, dij $$3, dij $$4, dij $$5, dij $$6, dij $$7) {
      this.a($$0, nw.e.b);
      this.a($$1, nw.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dij $$0, nw.e $$1) {
      this.a($$0, "_top");
      all $$2 = this.a($$0, "_top", $$1.a(), oo::c);
      all $$3 = this.a($$0, "_bottom", $$1.a(), oo::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dil.iD, "_front");
      all $$0 = ol.a(dil.iD, "_top");
      all $$1 = this.a(dil.iD, "_bottom", nw.e.b.a(), oo::c);
      this.f(dil.iD, $$0, $$1);
   }

   private void k() {
      all $$0 = this.a(dil.bx, "_top", on.bo, oo::a);
      all $$1 = this.a(dil.bx, "_bottom", on.bo, oo::a);
      this.f(dil.bx, $$0, $$1);
   }

   private void l() {
      this.c(dil.sF);
      all $$0 = ol.a(dil.sF, "_top");
      all $$1 = ol.a(dil.sF, "_bottom");
      this.b.accept(od.a(dil.sF).a(b()).a(oe.a(dwe.ae).a(dwj.b, og.a().a(oh.c, $$1)).a(dwj.a, og.a().a(oh.c, $$0))));
   }

   private void f(dij $$0, all $$1, all $$2) {
      this.b.accept(od.a($$0).a(oe.a(dwe.ae).a(dwj.b, og.a().a(oh.c, $$2)).a(dwj.a, og.a().a(oh.c, $$1))));
   }

   private void n(dij $$0) {
      oo $$1 = oo.e($$0);
      oo $$2 = oo.e(oo.a($$0, "_corner"));
      all $$3 = on.as.a($$0, $$1, this.c);
      all $$4 = on.at.a($$0, $$2, this.c);
      all $$5 = on.au.a($$0, $$1, this.c);
      all $$6 = on.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            od.a($$0)
               .a(
                  oe.a(dwe.ag)
                     .a(dwr.a, og.a().a(oh.c, $$3))
                     .a(dwr.b, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
                     .a(dwr.c, og.a().a(oh.c, $$5).a(oh.b, oh.a.b))
                     .a(dwr.d, og.a().a(oh.c, $$6).a(oh.b, oh.a.b))
                     .a(dwr.e, og.a().a(oh.c, $$5))
                     .a(dwr.f, og.a().a(oh.c, $$6))
                     .a(dwr.g, og.a().a(oh.c, $$4))
                     .a(dwr.h, og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
                     .a(dwr.i, og.a().a(oh.c, $$4).a(oh.b, oh.a.c))
                     .a(dwr.j, og.a().a(oh.c, $$4).a(oh.b, oh.a.d))
               )
         );
   }

   private void o(dij $$0) {
      all $$1 = this.a($$0, "", on.as, oo::e);
      all $$2 = this.a($$0, "", on.au, oo::e);
      all $$3 = this.a($$0, "", on.av, oo::e);
      all $$4 = this.a($$0, "_on", on.as, oo::e);
      all $$5 = this.a($$0, "_on", on.au, oo::e);
      all $$6 = this.a($$0, "_on", on.av, oo::e);
      oe $$7 = oe.a(dwe.w, dwe.ah).a(($$6x, $$7x) -> {
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

   private nw.a a(all $$0, dij $$1) {
      return new nw.a($$0, $$1);
   }

   private nw.a f(dij $$0, dij $$1) {
      return new nw.a(ol.a($$0), $$1);
   }

   private void a(dij $$0, cwb $$1) {
      all $$2 = on.aa.a($$0, oo.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dij $$0, all $$1) {
      all $$2 = on.aa.a($$0, oo.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dij $$0, dij $$1) {
      this.a($$0);
      all $$2 = oq.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dij $$0) {
      this.a($$0.j());
      all $$1 = oq.k.create($$0, this.c);
      all $$2 = oq.l.create($$0, this.c);
      all $$3 = oq.m.create($$0, this.c);
      all $$4 = oq.n.create($$0, this.c);
      this.b
         .accept(
            oc.a($$0)
               .a(ob.a().a(dwe.S, 1, 2, 3, 4).a(dwe.R, jm.c), og.a().a(oh.c, $$1))
               .a(ob.a().a(dwe.S, 1, 2, 3, 4).a(dwe.R, jm.f), og.a().a(oh.c, $$1).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.S, 1, 2, 3, 4).a(dwe.R, jm.d), og.a().a(oh.c, $$1).a(oh.b, oh.a.c))
               .a(ob.a().a(dwe.S, 1, 2, 3, 4).a(dwe.R, jm.e), og.a().a(oh.c, $$1).a(oh.b, oh.a.d))
               .a(ob.a().a(dwe.S, 2, 3, 4).a(dwe.R, jm.c), og.a().a(oh.c, $$2))
               .a(ob.a().a(dwe.S, 2, 3, 4).a(dwe.R, jm.f), og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.S, 2, 3, 4).a(dwe.R, jm.d), og.a().a(oh.c, $$2).a(oh.b, oh.a.c))
               .a(ob.a().a(dwe.S, 2, 3, 4).a(dwe.R, jm.e), og.a().a(oh.c, $$2).a(oh.b, oh.a.d))
               .a(ob.a().a(dwe.S, 3, 4).a(dwe.R, jm.c), og.a().a(oh.c, $$3))
               .a(ob.a().a(dwe.S, 3, 4).a(dwe.R, jm.f), og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.S, 3, 4).a(dwe.R, jm.d), og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               .a(ob.a().a(dwe.S, 3, 4).a(dwe.R, jm.e), og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
               .a(ob.a().a(dwe.S, 4).a(dwe.R, jm.c), og.a().a(oh.c, $$4))
               .a(ob.a().a(dwe.S, 4).a(dwe.R, jm.f), og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.S, 4).a(dwe.R, jm.d), og.a().a(oh.c, $$4).a(oh.b, oh.a.c))
               .a(ob.a().a(dwe.S, 4).a(dwe.R, jm.e), og.a().a(oh.c, $$4).a(oh.b, oh.a.d))
         );
   }

   private void a(oq.a $$0, dij... $$1) {
      for (dij $$2 : $$1) {
         all $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(oq.a $$0, dij... $$1) {
      for (dij $$2 : $$1) {
         all $$3 = $$0.create($$2, this.c);
         this.b.accept(od.a($$2, og.a().a(oh.c, $$3)).a(c()));
      }
   }

   private void h(dij $$0, dij $$1) {
      this.a($$0);
      oo $$2 = oo.b($$0, $$1);
      all $$3 = on.aI.a($$1, $$2, this.c);
      all $$4 = on.aJ.a($$1, $$2, this.c);
      all $$5 = on.aK.a($$1, $$2, this.c);
      all $$6 = on.aG.a($$1, $$2, this.c);
      all $$7 = on.aH.a($$1, $$2, this.c);
      cwb $$8 = $$1.j();
      on.bB.a(ol.a($$8), oo.F($$0), this.c);
      this.b
         .accept(
            oc.a($$1)
               .a(og.a().a(oh.c, $$3))
               .a(ob.a().a(dwe.L, true), og.a().a(oh.c, $$4))
               .a(ob.a().a(dwe.M, true), og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.N, true), og.a().a(oh.c, $$5))
               .a(ob.a().a(dwe.O, true), og.a().a(oh.c, $$5).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.L, false), og.a().a(oh.c, $$6))
               .a(ob.a().a(dwe.M, false), og.a().a(oh.c, $$7))
               .a(ob.a().a(dwe.N, false), og.a().a(oh.c, $$7).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.O, false), og.a().a(oh.c, $$6).a(oh.b, oh.a.d))
         );
   }

   private void q(dij $$0) {
      oo $$1 = oo.z($$0);
      all $$2 = on.aL.a($$0, $$1, this.c);
      all $$3 = this.a($$0, "_conditional", on.aL, $$1x -> $$1.c(op.i, $$1x));
      this.b.accept(od.a($$0).a(a(dwe.c, $$3, $$2)).a(e()));
   }

   private void r(dij $$0) {
      all $$1 = oq.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<og> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> og.a().a(oh.c, ol.a(dil.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dil.mZ);
      this.b
         .accept(
            oc.a(dil.mZ)
               .a(ob.a().a(dwe.aq, 0), this.a(0))
               .a(ob.a().a(dwe.aq, 1), this.a(1))
               .a(ob.a().a(dwe.bk, dwa.b), og.a().a(oh.c, ol.a(dil.mZ, "_small_leaves")))
               .a(ob.a().a(dwe.bk, dwa.c), og.a().a(oh.c, ol.a(dil.mZ, "_large_leaves")))
         );
   }

   private oe n() {
      return oe.a(dwe.P)
         .a(jm.a, og.a().a(oh.a, oh.a.c))
         .a(jm.b, og.a())
         .a(jm.c, og.a().a(oh.a, oh.a.b))
         .a(jm.d, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.c))
         .a(jm.e, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.d))
         .a(jm.f, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.b));
   }

   private void o() {
      all $$0 = oo.a(dil.nU, "_top_open");
      this.b
         .accept(
            od.a(dil.nU)
               .a(this.n())
               .a(
                  oe.a(dwe.u)
                     .a(false, og.a().a(oh.c, oq.f.create(dil.nU, this.c)))
                     .a(true, og.a().a(oh.c, oq.f.get(dil.nU).a($$1 -> $$1.a(op.f, $$0)).a(dil.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> oe a(dwq<T> $$0, T $$1, all $$2, all $$3) {
      og $$4 = og.a().a(oh.c, $$2);
      og $$5 = og.a().a(oh.c, $$3);
      return oe.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dij $$0, Function<dij, oo> $$1) {
      oo $$2 = $$1.apply($$0).b(op.i, op.c);
      oo $$3 = $$2.c(op.g, oo.a($$0, "_front_honey"));
      all $$4 = on.q.a($$0, "_empty", $$2, this.c);
      all $$5 = on.q.a($$0, "_honey", $$3, this.c);
      this.c($$0);
      on.q.a(ol.a($$0.j(), "_empty"), $$2, this.c);
      on.q.a(ol.a($$0.j(), "_honey"), $$3, this.c);
      this.b.accept(od.a($$0).a(b()).a(a(dwe.aN, 5, $$5, $$4)));
   }

   private void a(dij $$0, dwq<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<all> $$3 = new Int2ObjectOpenHashMap();
         oe $$4 = oe.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            all $$5 = (all)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, on.aV, oo::g));
            return og.a().a(oh.c, $$5);
         });
         this.a($$0.j());
         this.b.accept(od.a($$0).a($$4));
      }
   }

   private void p() {
      all $$0 = ol.a(dil.od, "_floor");
      all $$1 = ol.a(dil.od, "_ceiling");
      all $$2 = ol.a(dil.od, "_wall");
      all $$3 = ol.a(dil.od, "_between_walls");
      this.a(cwj.wK);
      this.b
         .accept(
            od.a(dil.od)
               .a(
                  oe.a(dwe.R, dwe.V)
                     .a(jm.c, dwc.a, og.a().a(oh.c, $$0))
                     .a(jm.d, dwc.a, og.a().a(oh.c, $$0).a(oh.b, oh.a.c))
                     .a(jm.f, dwc.a, og.a().a(oh.c, $$0).a(oh.b, oh.a.b))
                     .a(jm.e, dwc.a, og.a().a(oh.c, $$0).a(oh.b, oh.a.d))
                     .a(jm.c, dwc.b, og.a().a(oh.c, $$1))
                     .a(jm.d, dwc.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.c))
                     .a(jm.f, dwc.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.b))
                     .a(jm.e, dwc.b, og.a().a(oh.c, $$1).a(oh.b, oh.a.d))
                     .a(jm.c, dwc.c, og.a().a(oh.c, $$2).a(oh.b, oh.a.d))
                     .a(jm.d, dwc.c, og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
                     .a(jm.f, dwc.c, og.a().a(oh.c, $$2))
                     .a(jm.e, dwc.c, og.a().a(oh.c, $$2).a(oh.b, oh.a.c))
                     .a(jm.d, dwc.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
                     .a(jm.c, dwc.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.d))
                     .a(jm.f, dwc.d, og.a().a(oh.c, $$3))
                     .a(jm.e, dwc.d, og.a().a(oh.c, $$3).a(oh.b, oh.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            od.a(dil.nZ, og.a().a(oh.c, ol.a(dil.nZ)))
               .a(
                  oe.a(dwe.U, dwe.R)
                     .a(dvz.a, jm.c, og.a())
                     .a(dvz.a, jm.f, og.a().a(oh.b, oh.a.b))
                     .a(dvz.a, jm.d, og.a().a(oh.b, oh.a.c))
                     .a(dvz.a, jm.e, og.a().a(oh.b, oh.a.d))
                     .a(dvz.b, jm.c, og.a().a(oh.a, oh.a.b))
                     .a(dvz.b, jm.f, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.b))
                     .a(dvz.b, jm.d, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.c))
                     .a(dvz.b, jm.e, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.d))
                     .a(dvz.c, jm.d, og.a().a(oh.a, oh.a.c))
                     .a(dvz.c, jm.e, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.b))
                     .a(dvz.c, jm.c, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.c))
                     .a(dvz.c, jm.f, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.d))
               )
         );
   }

   private void d(dij $$0, oq.a $$1) {
      all $$2 = $$1.create($$0, this.c);
      all $$3 = oo.a($$0, "_front_on");
      all $$4 = $$1.get($$0).a($$1x -> $$1x.a(op.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(od.a($$0).a(a(dwe.r, $$4, $$2)).a(b()));
   }

   private void a(dij... $$0) {
      all $$1 = ol.a("campfire_off");

      for (dij $$2 : $$0) {
         all $$3 = on.bc.a($$2, oo.E($$2), this.c);
         this.a($$2.j());
         this.b.accept(od.a($$2).a(a(dwe.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dij $$0) {
      all $$1 = on.bx.a($$0, oo.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dij $$0) {
      all $$1;
      if ($$0 == dil.tj) {
         $$1 = on.bz.a($$0, oo.m($$0), this.c);
      } else {
         $$1 = on.by.a($$0, oo.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oo $$0 = oo.a(oo.G(dil.cl), oo.G(dil.n));
      all $$1 = on.j.a(dil.cl, $$0, this.c);
      this.b.accept(c(dil.cl, $$1));
   }

   private void s() {
      this.a(cwj.lH);
      this.b
         .accept(
            oc.a(dil.cw)
               .a(
                  ob.b(
                     ob.a().a(dwe.ab, dws.c).a(dwe.aa, dws.c).a(dwe.ac, dws.c).a(dwe.ad, dws.c),
                     ob.a().a(dwe.ab, dws.b, dws.a).a(dwe.aa, dws.b, dws.a),
                     ob.a().a(dwe.aa, dws.b, dws.a).a(dwe.ac, dws.b, dws.a),
                     ob.a().a(dwe.ac, dws.b, dws.a).a(dwe.ad, dws.b, dws.a),
                     ob.a().a(dwe.ad, dws.b, dws.a).a(dwe.ab, dws.b, dws.a)
                  ),
                  og.a().a(oh.c, ol.a("redstone_dust_dot"))
               )
               .a(ob.a().a(dwe.ab, dws.b, dws.a), og.a().a(oh.c, ol.a("redstone_dust_side0")))
               .a(ob.a().a(dwe.ac, dws.b, dws.a), og.a().a(oh.c, ol.a("redstone_dust_side_alt0")))
               .a(ob.a().a(dwe.aa, dws.b, dws.a), og.a().a(oh.c, ol.a("redstone_dust_side_alt1")).a(oh.b, oh.a.d))
               .a(ob.a().a(dwe.ad, dws.b, dws.a), og.a().a(oh.c, ol.a("redstone_dust_side1")).a(oh.b, oh.a.d))
               .a(ob.a().a(dwe.ab, dws.a), og.a().a(oh.c, ol.a("redstone_dust_up")))
               .a(ob.a().a(dwe.aa, dws.a), og.a().a(oh.c, ol.a("redstone_dust_up")).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.ac, dws.a), og.a().a(oh.c, ol.a("redstone_dust_up")).a(oh.b, oh.a.c))
               .a(ob.a().a(dwe.ad, dws.a), og.a().a(oh.c, ol.a("redstone_dust_up")).a(oh.b, oh.a.d))
         );
   }

   private void t() {
      this.a(cwj.lL);
      this.b
         .accept(
            od.a(dil.gY)
               .a(c())
               .a(
                  oe.a(dwe.bd, dwe.w)
                     .a(dwh.a, false, og.a().a(oh.c, ol.a(dil.gY)))
                     .a(dwh.a, true, og.a().a(oh.c, ol.a(dil.gY, "_on")))
                     .a(dwh.b, false, og.a().a(oh.c, ol.a(dil.gY, "_subtract")))
                     .a(dwh.b, true, og.a().a(oh.c, ol.a(dil.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oo $$0 = oo.a(dil.jR);
      oo $$1 = oo.a(oo.a(dil.jE, "_side"), $$0.a(op.f));
      all $$2 = on.ab.a(dil.jE, $$1, this.c);
      all $$3 = on.ac.a(dil.jE, $$1, this.c);
      all $$4 = on.j.b(dil.jE, "_double", $$1, this.c);
      this.b.accept(e(dil.jE, $$2, $$3, $$4));
      this.b.accept(c(dil.jR, on.c.a(dil.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cwj.sH);
      this.b
         .accept(
            oc.a(dil.fs)
               .a(og.a().a(oh.c, oo.G(dil.fs)))
               .a(ob.a().a(dwe.k, true), og.a().a(oh.c, oo.a(dil.fs, "_bottle0")))
               .a(ob.a().a(dwe.l, true), og.a().a(oh.c, oo.a(dil.fs, "_bottle1")))
               .a(ob.a().a(dwe.m, true), og.a().a(oh.c, oo.a(dil.fs, "_bottle2")))
               .a(ob.a().a(dwe.k, false), og.a().a(oh.c, oo.a(dil.fs, "_empty0")))
               .a(ob.a().a(dwe.l, false), og.a().a(oh.c, oo.a(dil.fs, "_empty1")))
               .a(ob.a().a(dwe.m, false), og.a().a(oh.c, oo.a(dil.fs, "_empty2")))
         );
   }

   private void u(dij $$0) {
      all $$1 = on.bt.a($$0, oo.b($$0), this.c);
      all $$2 = ol.a("mushroom_block_inside");
      this.b
         .accept(
            oc.a($$0)
               .a(ob.a().a(dwe.L, true), og.a().a(oh.c, $$1))
               .a(ob.a().a(dwe.M, true), og.a().a(oh.c, $$1).a(oh.b, oh.a.b).a(oh.d, true))
               .a(ob.a().a(dwe.N, true), og.a().a(oh.c, $$1).a(oh.b, oh.a.c).a(oh.d, true))
               .a(ob.a().a(dwe.O, true), og.a().a(oh.c, $$1).a(oh.b, oh.a.d).a(oh.d, true))
               .a(ob.a().a(dwe.J, true), og.a().a(oh.c, $$1).a(oh.a, oh.a.d).a(oh.d, true))
               .a(ob.a().a(dwe.K, true), og.a().a(oh.c, $$1).a(oh.a, oh.a.b).a(oh.d, true))
               .a(ob.a().a(dwe.L, false), og.a().a(oh.c, $$2))
               .a(ob.a().a(dwe.M, false), og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, false))
               .a(ob.a().a(dwe.N, false), og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, false))
               .a(ob.a().a(dwe.O, false), og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, false))
               .a(ob.a().a(dwe.J, false), og.a().a(oh.c, $$2).a(oh.a, oh.a.d).a(oh.d, false))
               .a(ob.a().a(dwe.K, false), og.a().a(oh.c, $$2).a(oh.a, oh.a.b).a(oh.d, false))
         );
      this.a($$0, oq.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cwj.rS);
      this.b
         .accept(
            od.a(dil.eg)
               .a(
                  oe.a(dwe.ay)
                     .a(0, og.a().a(oh.c, ol.a(dil.eg)))
                     .a(1, og.a().a(oh.c, ol.a(dil.eg, "_slice1")))
                     .a(2, og.a().a(oh.c, ol.a(dil.eg, "_slice2")))
                     .a(3, og.a().a(oh.c, ol.a(dil.eg, "_slice3")))
                     .a(4, og.a().a(oh.c, ol.a(dil.eg, "_slice4")))
                     .a(5, og.a().a(oh.c, ol.a(dil.eg, "_slice5")))
                     .a(6, og.a().a(oh.c, ol.a(dil.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oo $$0 = new oo()
         .a(op.c, oo.a(dil.nX, "_side3"))
         .a(op.o, oo.G(dil.t))
         .a(op.n, oo.a(dil.nX, "_top"))
         .a(op.j, oo.a(dil.nX, "_side3"))
         .a(op.l, oo.a(dil.nX, "_side3"))
         .a(op.k, oo.a(dil.nX, "_side1"))
         .a(op.m, oo.a(dil.nX, "_side2"));
      this.b.accept(c(dil.nX, on.a.a(dil.nX, $$0, this.c)));
   }

   private void y() {
      oo $$0 = new oo()
         .a(op.c, oo.a(dil.ob, "_front"))
         .a(op.o, oo.a(dil.ob, "_bottom"))
         .a(op.n, oo.a(dil.ob, "_top"))
         .a(op.j, oo.a(dil.ob, "_front"))
         .a(op.k, oo.a(dil.ob, "_front"))
         .a(op.l, oo.a(dil.ob, "_side"))
         .a(op.m, oo.a(dil.ob, "_side"));
      this.b.accept(c(dil.ob, on.a.a(dil.ob, $$0, this.c)));
   }

   private void a(dij $$0, dij $$1, BiFunction<dij, dij, oo> $$2) {
      oo $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, on.a.a($$0, $$3, this.c)));
   }

   public void b(dij $$0) {
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
      oo $$0 = oo.k(dil.eZ);
      this.b.accept(c(dil.eZ, ol.a(dil.eZ)));
      this.a(dil.ee, $$0);
      this.a(dil.ef, $$0);
   }

   private void a(dij $$0, oo $$1) {
      all $$2 = on.p.a($$0, $$1.c(op.g, oo.G($$0)), this.c);
      this.b.accept(od.a($$0, og.a().a(oh.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cwj.sI);
      this.m(dil.ft);
      this.b.accept(c(dil.fv, on.bw.a(dil.fv, oo.j(oo.a(dil.H, "_still")), this.c)));
      this.b
         .accept(
            od.a(dil.fu)
               .a(
                  oe.a(dmr.g)
                     .a(1, og.a().a(oh.c, on.bu.a(dil.fu, "_level1", oo.j(oo.a(dil.G, "_still")), this.c)))
                     .a(2, og.a().a(oh.c, on.bv.a(dil.fu, "_level2", oo.j(oo.a(dil.G, "_still")), this.c)))
                     .a(3, og.a().a(oh.c, on.bw.a(dil.fu, "_full", oo.j(oo.a(dil.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            od.a(dil.fw)
               .a(
                  oe.a(dmr.g)
                     .a(1, og.a().a(oh.c, on.bu.a(dil.fw, "_level1", oo.j(oo.G(dil.qP)), this.c)))
                     .a(2, og.a().a(oh.c, on.bv.a(dil.fw, "_level2", oo.j(oo.G(dil.qP)), this.c)))
                     .a(3, og.a().a(oh.c, on.bw.a(dil.fw, "_full", oo.j(oo.G(dil.qP)), this.c)))
               )
         );
   }

   private void B() {
      oo $$0 = oo.b(dil.kv);
      all $$1 = on.aE.a(dil.kv, $$0, this.c);
      all $$2 = this.a(dil.kv, "_dead", on.aE, $$1x -> $$0.c(op.b, $$1x));
      this.b.accept(od.a(dil.kv).a(a(dwe.au, 5, $$2, $$1)));
   }

   private void C() {
      all $$0 = ol.a(dil.tq);
      all $$1 = ol.a(dil.tq, "_triggered");
      all $$2 = ol.a(dil.tq, "_crafting");
      all $$3 = ol.a(dil.tq, "_crafting_triggered");
      this.b
         .accept(
            od.a(dil.tq)
               .a(oe.a(dwe.T).a($$0x -> this.a($$0x, og.a())))
               .a(
                  oe.a(dwe.A, dkc.b)
                     .a(false, false, og.a().a(oh.c, $$0))
                     .a(true, true, og.a().a(oh.c, $$3))
                     .a(true, false, og.a().a(oh.c, $$1))
                     .a(false, true, og.a().a(oh.c, $$2))
               )
         );
   }

   private void v(dij $$0) {
      oo $$1 = new oo().a(op.f, oo.a(dil.cD, "_top")).a(op.i, oo.a(dil.cD, "_side")).a(op.g, oo.a($$0, "_front"));
      oo $$2 = new oo().a(op.i, oo.a(dil.cD, "_top")).a(op.g, oo.a($$0, "_front_vertical"));
      all $$3 = on.p.a($$0, $$1, this.c);
      all $$4 = on.r.a($$0, $$2, this.c);
      this.b
         .accept(
            od.a($$0)
               .a(
                  oe.a(dwe.P)
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
      all $$0 = ol.a(dil.fy);
      all $$1 = ol.a(dil.fy, "_filled");
      this.b.accept(od.a(dil.fy).a(oe.a(dwe.h).a(false, og.a().a(oh.c, $$0)).a(true, og.a().a(oh.c, $$1))).a(c()));
   }

   private void E() {
      all $$0 = ol.a(dil.ku, "_side");
      all $$1 = ol.a(dil.ku, "_noside");
      all $$2 = ol.a(dil.ku, "_noside1");
      all $$3 = ol.a(dil.ku, "_noside2");
      all $$4 = ol.a(dil.ku, "_noside3");
      this.b
         .accept(
            oc.a(dil.ku)
               .a(ob.a().a(dwe.L, true), og.a().a(oh.c, $$0))
               .a(ob.a().a(dwe.M, true), og.a().a(oh.c, $$0).a(oh.b, oh.a.b).a(oh.d, true))
               .a(ob.a().a(dwe.N, true), og.a().a(oh.c, $$0).a(oh.b, oh.a.c).a(oh.d, true))
               .a(ob.a().a(dwe.O, true), og.a().a(oh.c, $$0).a(oh.b, oh.a.d).a(oh.d, true))
               .a(ob.a().a(dwe.J, true), og.a().a(oh.c, $$0).a(oh.a, oh.a.d).a(oh.d, true))
               .a(ob.a().a(dwe.K, true), og.a().a(oh.c, $$0).a(oh.a, oh.a.b).a(oh.d, true))
               .a(ob.a().a(dwe.L, false), og.a().a(oh.c, $$1).a(oh.e, 2), og.a().a(oh.c, $$2), og.a().a(oh.c, $$3), og.a().a(oh.c, $$4))
               .a(
                  ob.a().a(dwe.M, false),
                  og.a().a(oh.c, $$2).a(oh.b, oh.a.b).a(oh.d, true),
                  og.a().a(oh.c, $$3).a(oh.b, oh.a.b).a(oh.d, true),
                  og.a().a(oh.c, $$4).a(oh.b, oh.a.b).a(oh.d, true),
                  og.a().a(oh.c, $$1).a(oh.e, 2).a(oh.b, oh.a.b).a(oh.d, true)
               )
               .a(
                  ob.a().a(dwe.N, false),
                  og.a().a(oh.c, $$3).a(oh.b, oh.a.c).a(oh.d, true),
                  og.a().a(oh.c, $$4).a(oh.b, oh.a.c).a(oh.d, true),
                  og.a().a(oh.c, $$1).a(oh.e, 2).a(oh.b, oh.a.c).a(oh.d, true),
                  og.a().a(oh.c, $$2).a(oh.b, oh.a.c).a(oh.d, true)
               )
               .a(
                  ob.a().a(dwe.O, false),
                  og.a().a(oh.c, $$4).a(oh.b, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$1).a(oh.e, 2).a(oh.b, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$2).a(oh.b, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$3).a(oh.b, oh.a.d).a(oh.d, true)
               )
               .a(
                  ob.a().a(dwe.J, false),
                  og.a().a(oh.c, $$1).a(oh.e, 2).a(oh.a, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$4).a(oh.a, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$2).a(oh.a, oh.a.d).a(oh.d, true),
                  og.a().a(oh.c, $$3).a(oh.a, oh.a.d).a(oh.d, true)
               )
               .a(
                  ob.a().a(dwe.K, false),
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
            oc.a(dil.pc)
               .a(og.a().a(oh.c, oo.G(dil.pc)))
               .a(ob.a().a(dwe.aL, 1), og.a().a(oh.c, oo.a(dil.pc, "_contents1")))
               .a(ob.a().a(dwe.aL, 2), og.a().a(oh.c, oo.a(dil.pc, "_contents2")))
               .a(ob.a().a(dwe.aL, 3), og.a().a(oh.c, oo.a(dil.pc, "_contents3")))
               .a(ob.a().a(dwe.aL, 4), og.a().a(oh.c, oo.a(dil.pc, "_contents4")))
               .a(ob.a().a(dwe.aL, 5), og.a().a(oh.c, oo.a(dil.pc, "_contents5")))
               .a(ob.a().a(dwe.aL, 6), og.a().a(oh.c, oo.a(dil.pc, "_contents6")))
               .a(ob.a().a(dwe.aL, 7), og.a().a(oh.c, oo.a(dil.pc, "_contents7")))
               .a(ob.a().a(dwe.aL, 8), og.a().a(oh.c, oo.a(dil.pc, "_contents_ready")))
         );
   }

   private void w(dij $$0) {
      all $$1 = on.c.a($$0, oo.a($$0), this.c);
      all $$2 = this.a($$0, "_powered", on.c, oo::b);
      all $$3 = this.a($$0, "_lit", on.c, oo::b);
      all $$4 = this.a($$0, "_lit_powered", on.c, oo::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private oa a(dij $$0, all $$1, all $$2, all $$3, all $$4) {
      return od.a($$0).a(oe.a(dwe.r, dwe.w).a(($$4x, $$5) -> $$4x ? og.a().a(oh.c, $$5 ? $$4 : $$2) : og.a().a(oh.c, $$5 ? $$3 : $$1)));
   }

   private void i(dij $$0, dij $$1) {
      all $$2 = ol.a($$0);
      all $$3 = ol.a($$0, "_powered");
      all $$4 = ol.a($$0, "_lit");
      all $$5 = ol.a($$0, "_lit_powered");
      this.a($$1, ol.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dij $$0) {
      this.c($$0);
      this.b.accept(od.a($$0, og.a().a(oh.c, on.ao.a($$0, oo.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dil.qy);
      this.x(dil.qx);
      this.x(dil.qw);
      this.x(dil.qv);
   }

   private void H() {
      this.c(dil.st);
      oe.b<jm, dwk> $$0 = oe.a(dwe.bm, dwe.bn);

      for (dwk $$1 : dwk.values()) {
         $$0.a(jm.b, $$1, this.a(jm.b, $$1));
      }

      for (dwk $$2 : dwk.values()) {
         $$0.a(jm.a, $$2, this.a(jm.a, $$2));
      }

      this.b.accept(od.a(dil.st).a($$0));
   }

   private og a(jm $$0, dwk $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oo $$3 = oo.c(oo.a(dil.st, $$2));
      return og.a().a(oh.c, on.an.a(dil.st, $$2, $$3, this.c));
   }

   private void y(dij $$0) {
      oo $$1 = new oo().a(op.e, oo.G(dil.dV)).a(op.f, oo.G($$0)).a(op.i, oo.a($$0, "_side"));
      this.b.accept(c($$0, on.n.a($$0, $$1, this.c)));
   }

   private void I() {
      all $$0 = oo.a(dil.gZ, "_side");
      oo $$1 = new oo().a(op.f, oo.a(dil.gZ, "_top")).a(op.i, $$0);
      oo $$2 = new oo().a(op.f, oo.a(dil.gZ, "_inverted_top")).a(op.i, $$0);
      this.b
         .accept(
            od.a(dil.gZ)
               .a(oe.a(dwe.p).a(false, og.a().a(oh.c, on.aF.a(dil.gZ, $$1, this.c))).a(true, og.a().a(oh.c, on.aF.a(ol.a(dil.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dij $$0) {
      this.b.accept(od.a($$0, og.a().a(oh.c, ol.a($$0))).a(this.n()));
   }

   private void J() {
      dij $$0 = dil.ss;
      all $$1 = ol.a($$0, "_on");
      all $$2 = ol.a($$0);
      this.b.accept(od.a($$0, og.a().a(oh.c, ol.a($$0))).a(this.n()).a(a(dwe.w, $$1, $$2)));
   }

   private void K() {
      oo $$0 = new oo().a(op.B, oo.G(dil.j)).a(op.f, oo.G(dil.cC));
      oo $$1 = new oo().a(op.B, oo.G(dil.j)).a(op.f, oo.a(dil.cC, "_moist"));
      all $$2 = on.aW.a(dil.cC, $$0, this.c);
      all $$3 = on.aW.a(oo.a(dil.cC, "_moist"), $$1, this.c);
      this.b.accept(od.a(dil.cC).a(a(dwe.aQ, 7, $$3, $$2)));
   }

   private List<all> A(dij $$0) {
      all $$1 = on.aX.a(ol.a($$0, "_floor0"), oo.v($$0), this.c);
      all $$2 = on.aX.a(ol.a($$0, "_floor1"), oo.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<all> B(dij $$0) {
      all $$1 = on.aY.a(ol.a($$0, "_side0"), oo.v($$0), this.c);
      all $$2 = on.aY.a(ol.a($$0, "_side1"), oo.w($$0), this.c);
      all $$3 = on.aZ.a(ol.a($$0, "_side_alt0"), oo.v($$0), this.c);
      all $$4 = on.aZ.a(ol.a($$0, "_side_alt1"), oo.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<all> C(dij $$0) {
      all $$1 = on.ba.a(ol.a($$0, "_up0"), oo.v($$0), this.c);
      all $$2 = on.ba.a(ol.a($$0, "_up1"), oo.w($$0), this.c);
      all $$3 = on.bb.a(ol.a($$0, "_up_alt0"), oo.v($$0), this.c);
      all $$4 = on.bb.a(ol.a($$0, "_up_alt1"), oo.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<og> a(List<all> $$0, UnaryOperator<og> $$1) {
      return $$0.stream().map($$0x -> og.a().a(oh.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      ob $$0 = ob.a().a(dwe.L, false).a(dwe.M, false).a(dwe.N, false).a(dwe.O, false).a(dwe.J, false);
      List<all> $$1 = this.A(dil.cr);
      List<all> $$2 = this.B(dil.cr);
      List<all> $$3 = this.C(dil.cr);
      this.b
         .accept(
            oc.a(dil.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(ob.b(ob.a().a(dwe.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(ob.b(ob.a().a(dwe.M, true), $$0), a($$2, $$0x -> $$0x.a(oh.b, oh.a.b)))
               .a(ob.b(ob.a().a(dwe.N, true), $$0), a($$2, $$0x -> $$0x.a(oh.b, oh.a.c)))
               .a(ob.b(ob.a().a(dwe.O, true), $$0), a($$2, $$0x -> $$0x.a(oh.b, oh.a.d)))
               .a(ob.a().a(dwe.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<all> $$0 = this.A(dil.cs);
      List<all> $$1 = this.B(dil.cs);
      this.b
         .accept(
            oc.a(dil.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(oh.b, oh.a.b)))
               .a(a($$1, $$0x -> $$0x.a(oh.b, oh.a.c)))
               .a(a($$1, $$0x -> $$0x.a(oh.b, oh.a.d)))
         );
   }

   private void D(dij $$0) {
      all $$1 = oq.t.create($$0, this.c);
      all $$2 = oq.u.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(od.a($$0).a(a(dwe.j, $$2, $$1)));
   }

   private void N() {
      oo $$0 = oo.a(oo.a(dil.ad, "_side"), oo.a(dil.ad, "_top"));
      all $$1 = on.j.a(dil.ad, $$0, this.c);
      this.b.accept(d(dil.ad, $$1));
   }

   private void O() {
      this.a(cwj.ad);
      dij $$0 = dil.E;
      oe.b<Boolean, Integer> $$1 = oe.a(dnd.d, dnd.b);
      all $$2 = ol.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         all $$4 = ol.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, og.a().a(oh.c, $$4));
         $$1.a(false, $$3, og.a().a(oh.c, $$2));
      }

      this.b.accept(od.a(dil.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            od.a(dil.kI)
               .a(
                  oe.a(dwe.as)
                     .a(0, og.a().a(oh.c, this.a(dil.kI, "_0", on.c, oo::b)))
                     .a(1, og.a().a(oh.c, this.a(dil.kI, "_1", on.c, oo::b)))
                     .a(2, og.a().a(oh.c, this.a(dil.kI, "_2", on.c, oo::b)))
                     .a(3, og.a().a(oh.c, this.a(dil.kI, "_3", on.c, oo::b)))
               )
         );
   }

   private void Q() {
      all $$0 = oo.G(dil.j);
      oo $$1 = new oo().a(op.e, $$0).b(op.e, op.c).a(op.f, oo.a(dil.i, "_top")).a(op.i, oo.a(dil.i, "_snow"));
      og $$2 = og.a().a(oh.c, on.n.a(dil.i, "_snow", $$1, this.c));
      this.a(dil.i, ol.a(dil.i), $$2);
      all $$3 = oq.f.get(dil.fl).a($$1x -> $$1x.a(op.e, $$0)).a(dil.fl, this.c);
      this.a(dil.fl, $$3, $$2);
      all $$4 = oq.f.get(dil.l).a($$1x -> $$1x.a(op.e, $$0)).a(dil.l, this.c);
      this.a(dil.l, $$4, $$2);
   }

   private void a(dij $$0, all $$1, og $$2) {
      List<og> $$3 = Arrays.asList(a($$1));
      this.b.accept(od.a($$0).a(oe.a(dwe.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cwj.ry);
      this.b
         .accept(
            od.a(dil.fC)
               .a(
                  oe.a(dwe.ar)
                     .a(0, og.a().a(oh.c, ol.a(dil.fC, "_stage0")))
                     .a(1, og.a().a(oh.c, ol.a(dil.fC, "_stage1")))
                     .a(2, og.a().a(oh.c, ol.a(dil.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dil.kE, ol.a(dil.kE)));
   }

   private void j(dij $$0, dij $$1) {
      oo $$2 = oo.b($$1);
      all $$3 = on.Y.a($$0, $$2, this.c);
      all $$4 = on.Z.a($$0, $$2, this.c);
      this.b.accept(od.a($$0).a(a(dwe.aT, 1, $$4, $$3)));
   }

   private void T() {
      all $$0 = ol.a(dil.hc);
      all $$1 = ol.a(dil.hc, "_side");
      this.a(cwj.lR);
      this.b
         .accept(
            od.a(dil.hc)
               .a(
                  oe.a(dwe.Q)
                     .a(jm.a, og.a().a(oh.c, $$0))
                     .a(jm.c, og.a().a(oh.c, $$1))
                     .a(jm.f, og.a().a(oh.c, $$1).a(oh.b, oh.a.b))
                     .a(jm.d, og.a().a(oh.c, $$1).a(oh.b, oh.a.c))
                     .a(jm.e, og.a().a(oh.c, $$1).a(oh.b, oh.a.d))
               )
         );
   }

   private void k(dij $$0, dij $$1) {
      all $$2 = ol.a($$0);
      this.b.accept(od.a($$1, og.a().a(oh.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      all $$0 = ol.a(dil.eW, "_post_ends");
      all $$1 = ol.a(dil.eW, "_post");
      all $$2 = ol.a(dil.eW, "_cap");
      all $$3 = ol.a(dil.eW, "_cap_alt");
      all $$4 = ol.a(dil.eW, "_side");
      all $$5 = ol.a(dil.eW, "_side_alt");
      this.b
         .accept(
            oc.a(dil.eW)
               .a(og.a().a(oh.c, $$0))
               .a(ob.a().a(dwe.L, false).a(dwe.M, false).a(dwe.N, false).a(dwe.O, false), og.a().a(oh.c, $$1))
               .a(ob.a().a(dwe.L, true).a(dwe.M, false).a(dwe.N, false).a(dwe.O, false), og.a().a(oh.c, $$2))
               .a(ob.a().a(dwe.L, false).a(dwe.M, true).a(dwe.N, false).a(dwe.O, false), og.a().a(oh.c, $$2).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.L, false).a(dwe.M, false).a(dwe.N, true).a(dwe.O, false), og.a().a(oh.c, $$3))
               .a(ob.a().a(dwe.L, false).a(dwe.M, false).a(dwe.N, false).a(dwe.O, true), og.a().a(oh.c, $$3).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.L, true), og.a().a(oh.c, $$4))
               .a(ob.a().a(dwe.M, true), og.a().a(oh.c, $$4).a(oh.b, oh.a.b))
               .a(ob.a().a(dwe.N, true), og.a().a(oh.c, $$5))
               .a(ob.a().a(dwe.O, true), og.a().a(oh.c, $$5).a(oh.b, oh.a.b))
         );
      this.d(dil.eW);
   }

   private void E(dij $$0) {
      this.b.accept(od.a($$0, og.a().a(oh.c, ol.a($$0))).a(b()));
   }

   private void V() {
      all $$0 = ol.a(dil.dw);
      all $$1 = ol.a(dil.dw, "_on");
      this.d(dil.dw);
      this.b
         .accept(
            od.a(dil.dw)
               .a(a(dwe.w, $$0, $$1))
               .a(
                  oe.a(dwe.U, dwe.R)
                     .a(dvz.c, jm.c, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.c))
                     .a(dvz.c, jm.f, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.d))
                     .a(dvz.c, jm.d, og.a().a(oh.a, oh.a.c))
                     .a(dvz.c, jm.e, og.a().a(oh.a, oh.a.c).a(oh.b, oh.a.b))
                     .a(dvz.a, jm.c, og.a())
                     .a(dvz.a, jm.f, og.a().a(oh.b, oh.a.b))
                     .a(dvz.a, jm.d, og.a().a(oh.b, oh.a.c))
                     .a(dvz.a, jm.e, og.a().a(oh.b, oh.a.d))
                     .a(dvz.b, jm.c, og.a().a(oh.a, oh.a.b))
                     .a(dvz.b, jm.f, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.b))
                     .a(dvz.b, jm.d, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.c))
                     .a(dvz.b, jm.e, og.a().a(oh.a, oh.a.b).a(oh.b, oh.a.d))
               )
         );
   }

   private void W() {
      this.d(dil.fm);
      this.b.accept(b(dil.fm, ol.a(dil.fm)));
   }

   private void X() {
      this.d(dil.tn);
      this.b.accept(c(dil.tn, ol.a(dil.tn)));
   }

   private void Y() {
      this.b.accept(od.a(dil.ed).a(oe.a(dwe.H).a(jm.a.a, og.a().a(oh.c, ol.a(dil.ed, "_ns"))).a(jm.a.c, og.a().a(oh.c, ol.a(dil.ed, "_ew")))));
   }

   private void Z() {
      all $$0 = oq.a.create(dil.dV, this.c);
      this.b
         .accept(
            od.a(
               dil.dV,
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
      all $$0 = ol.a(dil.kO);
      all $$1 = ol.a(dil.kO, "_on");
      this.b.accept(od.a(dil.kO).a(a(dwe.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oo $$0 = new oo().a(op.e, oo.a(dil.by, "_bottom")).a(op.i, oo.a(dil.by, "_side"));
      all $$1 = oo.a(dil.by, "_top_sticky");
      all $$2 = oo.a(dil.by, "_top");
      oo $$3 = $$0.c(op.E, $$1);
      oo $$4 = $$0.c(op.E, $$2);
      all $$5 = ol.a(dil.by, "_base");
      this.a(dil.by, $$5, $$4);
      this.a(dil.br, $$5, $$3);
      all $$6 = on.n.a(dil.by, "_inventory", $$0.c(op.f, $$2), this.c);
      all $$7 = on.n.a(dil.br, "_inventory", $$0.c(op.f, $$1), this.c);
      this.a(dil.by, $$6);
      this.a(dil.br, $$7);
   }

   private void a(dij $$0, all $$1, oo $$2) {
      all $$3 = on.bl.a($$0, $$2, this.c);
      this.b.accept(od.a($$0).a(a(dwe.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oo $$0 = new oo().a(op.F, oo.a(dil.by, "_top")).a(op.i, oo.a(dil.by, "_side"));
      oo $$1 = $$0.c(op.E, oo.a(dil.by, "_top_sticky"));
      oo $$2 = $$0.c(op.E, oo.a(dil.by, "_top"));
      this.b
         .accept(
            od.a(dil.bz)
               .a(
                  oe.a(dwe.x, dwe.bg)
                     .a(false, dwp.a, og.a().a(oh.c, on.bm.a(dil.by, "_head", $$2, this.c)))
                     .a(false, dwp.b, og.a().a(oh.c, on.bm.a(dil.by, "_head_sticky", $$1, this.c)))
                     .a(true, dwp.a, og.a().a(oh.c, on.bn.a(dil.by, "_head_short", $$2, this.c)))
                     .a(true, dwp.b, og.a().a(oh.c, on.bn.a(dil.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dij $$0 = dil.tr;
      oo $$1 = oo.a($$0, "_side_inactive", "_top_inactive");
      oo $$2 = oo.a($$0, "_side_active", "_top_active");
      oo $$3 = oo.a($$0, "_side_active", "_top_ejecting_reward");
      oo $$4 = oo.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      oo $$5 = oo.a($$0, "_side_active_ominous", "_top_active_ominous");
      oo $$6 = oo.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      all $$7 = on.o.a($$0, $$1, this.c);
      all $$8 = on.o.a($$0, "_active", $$2, this.c);
      all $$9 = on.o.a($$0, "_ejecting_reward", $$3, this.c);
      all $$10 = on.o.a($$0, "_inactive_ominous", $$4, this.c);
      all $$11 = on.o.a($$0, "_active_ominous", $$5, this.c);
      all $$12 = on.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(od.a($$0).a(oe.a(dwe.by, dwe.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> og.a().a(oh.c, $$7x ? $$10 : $$7);
            case b, c, d -> og.a().a(oh.c, $$7x ? $$11 : $$8);
            case e -> og.a().a(oh.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dij $$0 = dil.ts;
      oo $$1 = oo.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      oo $$2 = oo.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      oo $$3 = oo.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      oo $$4 = oo.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      all $$5 = on.bR.a($$0, $$1, this.c);
      all $$6 = on.bR.a($$0, "_active", $$2, this.c);
      all $$7 = on.bR.a($$0, "_unlocking", $$3, this.c);
      all $$8 = on.bR.a($$0, "_ejecting_reward", $$4, this.c);
      oo $$9 = oo.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      oo $$10 = oo.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oo $$11 = oo.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oo $$12 = oo.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      all $$13 = on.bR.a($$0, "_ominous", $$9, this.c);
      all $$14 = on.bR.a($$0, "_active_ominous", $$10, this.c);
      all $$15 = on.bR.a($$0, "_unlocking_ominous", $$11, this.c);
      all $$16 = on.bR.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(od.a($$0).a(b()).a(oe.a(dre.b, dre.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> og.a().a(oh.c, $$9x ? $$13 : $$5);
            case b -> og.a().a(oh.c, $$9x ? $$14 : $$6);
            case c -> og.a().a(oh.c, $$9x ? $$15 : $$7);
            case d -> og.a().a(oh.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      all $$0 = ol.a(dil.qQ, "_inactive");
      all $$1 = ol.a(dil.qQ, "_active");
      this.a(dil.qQ, $$0);
      this.b.accept(od.a(dil.qQ).a(oe.a(dwe.bo).a($$2 -> og.a().a(oh.c, $$2 != dwu.b && $$2 != dwu.c ? $$0 : $$1))));
   }

   private void ag() {
      all $$0 = ol.a(dil.qR, "_inactive");
      all $$1 = ol.a(dil.qR, "_active");
      this.a(dil.qR, $$0);
      this.b.accept(od.a(dil.qR).a(oe.a(dwe.bo).a($$2 -> og.a().a(oh.c, $$2 != dwu.b && $$2 != dwu.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      all $$0 = on.bQ.a(dil.qV, oo.a(false), this.c);
      all $$1 = on.bQ.a(dil.qV, "_can_summon", oo.a(true), this.c);
      this.a(dil.qV, $$0);
      this.b.accept(od.a(dil.qV).a(a(dwe.G, $$1, $$0)));
   }

   private void ai() {
      all $$0 = ol.a(dil.nS, "_stable");
      all $$1 = ol.a(dil.nS, "_unstable");
      this.a(dil.nS, $$0);
      this.b.accept(od.a(dil.nS).a(a(dwe.b, $$1, $$0)));
   }

   private void aj() {
      all $$0 = this.a(dil.sv, "", on.ao, oo::c);
      all $$1 = this.a(dil.sv, "_lit", on.ao, oo::c);
      this.b.accept(od.a(dil.sv).a(a(dwe.D, $$1, $$0)));
      all $$2 = this.a(dil.sw, "", on.ao, oo::c);
      all $$3 = this.a(dil.sw, "_lit", on.ao, oo::c);
      this.b.accept(od.a(dil.sw).a(a(dwe.D, $$3, $$2)));
   }

   private void ak() {
      all $$0 = oq.a.create(dil.fB, this.c);
      all $$1 = this.a(dil.fB, "_on", on.c, oo::b);
      this.b.accept(od.a(dil.fB).a(a(dwe.r, $$1, $$0)));
   }

   private void l(dij $$0, dij $$1) {
      oo $$2 = oo.y($$0);
      this.b.accept(c($$0, on.bf.a($$0, $$2, this.c)));
      this.b.accept(od.a($$1, og.a().a(oh.c, on.bh.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oo $$0 = oo.y(dil.dK);
      oo $$1 = oo.i(oo.a(dil.dK, "_off"));
      all $$2 = on.bj.a(dil.dK, $$0, this.c);
      all $$3 = on.bg.a(dil.dK, "_off", $$1, this.c);
      this.b.accept(od.a(dil.dK).a(a(dwe.r, $$2, $$3)));
      all $$4 = on.bk.a(dil.dL, $$0, this.c);
      all $$5 = on.bi.a(dil.dL, "_off", $$1, this.c);
      this.b.accept(od.a(dil.dL).a(a(dwe.r, $$4, $$5)).a(d()));
      this.d(dil.dK);
      this.c(dil.dL);
   }

   private void am() {
      this.a(cwj.lK);
      this.b.accept(od.a(dil.eh).a(oe.a(dwe.aA, dwe.s, dwe.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return og.a().a(oh.c, oo.a(dil.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cwj.cT);
      this.b
         .accept(
            od.a(dil.mV)
               .a(
                  oe.a(dwe.aS, dwe.C)
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
      oo $$0 = oo.a(dil.dN);
      all $$1 = on.c.a(dil.dP, $$0, this.c);
      this.b.accept(od.a(dil.dN).a(oe.a(dwe.aF).a($$1x -> og.a().a(oh.c, $$1x < 8 ? ol.a(dil.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dil.dN, ol.a(dil.dN, "_height2"));
      this.b.accept(c(dil.dP, $$1));
   }

   private void ap() {
      this.b.accept(od.a(dil.oc, og.a().a(oh.c, ol.a(dil.oc))).a(b()));
   }

   private void aq() {
      all $$0 = oq.a.create(dil.pa, this.c);
      this.a(dil.pa, $$0);
      this.b.accept(od.a(dil.pa).a(oe.a(dwe.bj).a($$0x -> og.a().a(oh.c, this.a(dil.pa, "_" + $$0x.c(), on.c, oo::b)))));
   }

   private void ar() {
      this.a(cwj.wN);
      this.b.accept(od.a(dil.oi).a(oe.a(dwe.as).a($$0 -> og.a().a(oh.c, this.a(dil.oi, "_stage" + $$0, on.ao, oo::c)))));
   }

   private void as() {
      this.a(cwj.pt);
      this.b
         .accept(
            od.a(dil.fI)
               .a(
                  oe.a(dwe.a, dwe.M, dwe.L, dwe.N, dwe.O)
                     .a(false, false, false, false, false, og.a().a(oh.c, ol.a(dil.fI, "_ns")))
                     .a(false, true, false, false, false, og.a().a(oh.c, ol.a(dil.fI, "_n")).a(oh.b, oh.a.b))
                     .a(false, false, true, false, false, og.a().a(oh.c, ol.a(dil.fI, "_n")))
                     .a(false, false, false, true, false, og.a().a(oh.c, ol.a(dil.fI, "_n")).a(oh.b, oh.a.c))
                     .a(false, false, false, false, true, og.a().a(oh.c, ol.a(dil.fI, "_n")).a(oh.b, oh.a.d))
                     .a(false, true, true, false, false, og.a().a(oh.c, ol.a(dil.fI, "_ne")))
                     .a(false, true, false, true, false, og.a().a(oh.c, ol.a(dil.fI, "_ne")).a(oh.b, oh.a.b))
                     .a(false, false, false, true, true, og.a().a(oh.c, ol.a(dil.fI, "_ne")).a(oh.b, oh.a.c))
                     .a(false, false, true, false, true, og.a().a(oh.c, ol.a(dil.fI, "_ne")).a(oh.b, oh.a.d))
                     .a(false, false, true, true, false, og.a().a(oh.c, ol.a(dil.fI, "_ns")))
                     .a(false, true, false, false, true, og.a().a(oh.c, ol.a(dil.fI, "_ns")).a(oh.b, oh.a.b))
                     .a(false, true, true, true, false, og.a().a(oh.c, ol.a(dil.fI, "_nse")))
                     .a(false, true, false, true, true, og.a().a(oh.c, ol.a(dil.fI, "_nse")).a(oh.b, oh.a.b))
                     .a(false, false, true, true, true, og.a().a(oh.c, ol.a(dil.fI, "_nse")).a(oh.b, oh.a.c))
                     .a(false, true, true, false, true, og.a().a(oh.c, ol.a(dil.fI, "_nse")).a(oh.b, oh.a.d))
                     .a(false, true, true, true, true, og.a().a(oh.c, ol.a(dil.fI, "_nsew")))
                     .a(true, false, false, false, false, og.a().a(oh.c, ol.a(dil.fI, "_attached_ns")))
                     .a(true, false, true, false, false, og.a().a(oh.c, ol.a(dil.fI, "_attached_n")))
                     .a(true, false, false, true, false, og.a().a(oh.c, ol.a(dil.fI, "_attached_n")).a(oh.b, oh.a.c))
                     .a(true, true, false, false, false, og.a().a(oh.c, ol.a(dil.fI, "_attached_n")).a(oh.b, oh.a.b))
                     .a(true, false, false, false, true, og.a().a(oh.c, ol.a(dil.fI, "_attached_n")).a(oh.b, oh.a.d))
                     .a(true, true, true, false, false, og.a().a(oh.c, ol.a(dil.fI, "_attached_ne")))
                     .a(true, true, false, true, false, og.a().a(oh.c, ol.a(dil.fI, "_attached_ne")).a(oh.b, oh.a.b))
                     .a(true, false, false, true, true, og.a().a(oh.c, ol.a(dil.fI, "_attached_ne")).a(oh.b, oh.a.c))
                     .a(true, false, true, false, true, og.a().a(oh.c, ol.a(dil.fI, "_attached_ne")).a(oh.b, oh.a.d))
                     .a(true, false, true, true, false, og.a().a(oh.c, ol.a(dil.fI, "_attached_ns")))
                     .a(true, true, false, false, true, og.a().a(oh.c, ol.a(dil.fI, "_attached_ns")).a(oh.b, oh.a.b))
                     .a(true, true, true, true, false, og.a().a(oh.c, ol.a(dil.fI, "_attached_nse")))
                     .a(true, true, false, true, true, og.a().a(oh.c, ol.a(dil.fI, "_attached_nse")).a(oh.b, oh.a.b))
                     .a(true, false, true, true, true, og.a().a(oh.c, ol.a(dil.fI, "_attached_nse")).a(oh.b, oh.a.c))
                     .a(true, true, true, false, true, og.a().a(oh.c, ol.a(dil.fI, "_attached_nse")).a(oh.b, oh.a.d))
                     .a(true, true, true, true, true, og.a().a(oh.c, ol.a(dil.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dil.fH);
      this.b.accept(od.a(dil.fH).a(oe.a(dwe.a, dwe.w).a(($$0, $$1) -> og.a().a(oh.c, oo.a(dil.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private all a(int $$0, String $$1, oo $$2) {
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

   private all a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", oo.b(oo.G(dil.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oo.b(oo.a(dil.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oo.b(oo.a(dil.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cwj.kp);
      this.b.accept(od.a(dil.mf).a(oe.a(dwe.aD, dwe.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cwj.kq);
      Function<Integer, all> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oo $$2 = oo.a($$1);
         return on.bA.a(dil.mg, $$1, $$2, this.c);
      };
      this.b.accept(od.a(dil.mg).a(oe.a(dpr.c).a($$1 -> og.a().a(oh.c, $$0.apply($$1)))));
   }

   private void F(dij $$0) {
      this.d($$0);
      all $$1 = ol.a($$0);
      oc $$2 = oc.a($$0);
      ob.c $$3 = ae.a(ob.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dwf, Function<all, og>> $$4 : a) {
         dwf $$5 = (dwf)$$4.getFirst();
         Function<all, og> $$6 = (Function<all, og>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(ob.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      all $$0 = oo.a(dil.qU, "_bottom");
      oo $$1 = new oo().a(op.e, $$0).a(op.f, oo.a(dil.qU, "_top")).a(op.i, oo.a(dil.qU, "_side"));
      oo $$2 = new oo().a(op.e, $$0).a(op.f, oo.a(dil.qU, "_top_bloom")).a(op.i, oo.a(dil.qU, "_side_bloom"));
      all $$3 = on.n.a(dil.qU, "", $$1, this.c);
      all $$4 = on.n.a(dil.qU, "_bloom", $$2, this.c);
      this.b.accept(od.a(dil.qU).a(oe.a(dwe.E).a($$2x -> og.a().a(oh.c, $$2x ? $$4 : $$3))));
      this.a(cwj.gj, $$3);
   }

   private void ax() {
      dij $$0 = dil.cm;
      all $$1 = ol.a($$0);
      oc $$2 = oc.a($$0);
      List.of(Pair.of(jm.c, oh.a.a), Pair.of(jm.f, oh.a.b), Pair.of(jm.d, oh.a.c), Pair.of(jm.e, oh.a.d)).forEach($$2x -> {
         jm $$3 = (jm)$$2x.getFirst();
         oh.a $$4 = (oh.a)$$2x.getSecond();
         ob.c $$5 = ob.a().a(dwe.R, $$3);
         $$2.a($$5, og.a().a(oh.c, $$1).a(oh.b, $$4).a(oh.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, ol.a($$0, "_inventory"));
      i.clear();
   }

   private void a(oc $$0, ob.c $$1, oh.a $$2) {
      List.of(Pair.of(dwe.bp, on.aM), Pair.of(dwe.bq, on.aN), Pair.of(dwe.br, on.aO), Pair.of(dwe.bs, on.aP), Pair.of(dwe.bt, on.aQ), Pair.of(dwe.bu, on.aR))
         .forEach($$3 -> {
            dwf $$4 = (dwf)$$3.getFirst();
            om $$5 = (om)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(oc $$0, ob.c $$1, oh.a $$2, dwf $$3, om $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oo $$7 = new oo().a(op.b, oo.a(dil.cm, $$6));
      nw.d $$8 = new nw.d($$4, $$6);
      all $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dil.cm, $$6, $$7, this.c));
      $$0.a(ob.a($$1, ob.a().a($$3, $$5)), og.a().a(oh.c, $$9).a(oh.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dil.kJ, on.c.a(dil.kJ, oo.b(ol.a("magma")), this.c)));
   }

   private void G(dij $$0) {
      this.b($$0, oq.q);
      on.bH.a(ol.a($$0.j()), oo.u($$0), this.c);
   }

   private void b(dij $$0, dij $$1, nw.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dij $$0, dij $$1) {
      on.bI.a(ol.a($$0.j()), oo.u($$1), this.c);
   }

   private void az() {
      all $$0 = ol.a(dil.b);
      all $$1 = ol.a(dil.b, "_mirrored");
      this.b.accept(a(dil.eN, $$0, $$1));
      this.a(dil.eN, $$0);
   }

   private void aA() {
      all $$0 = ol.a(dil.sJ);
      all $$1 = ol.a(dil.sJ, "_mirrored");
      this.b.accept(a(dil.td, $$0, $$1).a(f()));
      this.a(dil.td, $$0);
   }

   private void n(dij $$0, dij $$1) {
      this.a($$0, nw.e.b);
      oo $$2 = oo.d(oo.a($$0, "_pot"));
      all $$3 = nw.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      all $$0 = oo.a(dil.pl, "_bottom");
      all $$1 = oo.a(dil.pl, "_top_off");
      all $$2 = oo.a(dil.pl, "_top");
      all[] $$3 = new all[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oo $$5 = new oo().a(op.e, $$0).a(op.f, $$4 == 0 ? $$1 : $$2).a(op.i, oo.a(dil.pl, "_side" + $$4));
         $$3[$$4] = on.n.a(dil.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(od.a(dil.pl).a(oe.a(dwe.aZ).a($$1x -> og.a().a(oh.c, $$3[$$1x]))));
      this.a(cwj.xl, $$3[0]);
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
      all $$0 = oo.a(dil.pb, "_top");
      all $$1 = oo.a(dil.pb, "_bottom");
      all $$2 = oo.a(dil.pb, "_side");
      all $$3 = oo.a(dil.pb, "_lock");
      oo $$4 = new oo().a(op.o, $$2).a(op.m, $$2).a(op.l, $$2).a(op.c, $$0).a(op.j, $$0).a(op.k, $$1).a(op.n, $$3);
      all $$5 = on.b.a(dil.pb, $$4, this.c);
      this.b.accept(od.a(dil.pb, og.a().a(oh.c, $$5)).a(oe.a(dwe.T).a($$0x -> this.a($$0x, og.a()))));
   }

   private void aD() {
      dij $$0 = dil.n;
      all $$1 = ol.a($$0);
      oq $$2 = oq.a.get($$0);
      dij $$3 = dil.jH;
      all $$4 = on.ab.a($$3, $$2.b(), this.c);
      all $$5 = on.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      mc.a().filter(md::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dil.rf).a(mc.w).a(dil.rf, dil.rD).a(dil.rj, dil.rn).a(mc.y);
      this.h(dil.re).a(mc.A).a(dil.re, dil.rC).a(dil.ri, dil.rm).a(mc.C);
      this.h(dil.rd).a(mc.E).a(dil.rd, dil.rB).a(dil.rh, dil.rl).a(mc.G);
      this.h(dil.rc).a(mc.I).a(dil.rc, dil.rA).a(dil.rg, dil.rk).a(mc.K);
      this.w(dil.sk);
      this.w(dil.sl);
      this.w(dil.sm);
      this.w(dil.sn);
      this.i(dil.sk, dil.so);
      this.i(dil.sl, dil.sp);
      this.i(dil.sm, dil.sq);
      this.i(dil.sn, dil.sr);
      this.m(dil.a);
      this.c(dil.nc, dil.a);
      this.c(dil.nb, dil.a);
      this.m(dil.fO);
      this.m(dil.dQ);
      this.c(dil.nd, dil.G);
      this.m(dil.fA);
      this.m(dil.me);
      this.m(dil.fr);
      this.m(dil.fR);
      this.a(cwj.uw);
      this.m(dil.pg);
      this.m(dil.G);
      this.m(dil.H);
      this.m(dil.hV);
      this.a(cwj.fS);
      this.o(dil.pM, dil.qd);
      this.o(dil.pN, dil.qe);
      this.o(dil.pO, dil.qf);
      this.o(dil.pP, dil.qg);
      this.o(dil.pQ, dil.qh);
      this.o(dil.pR, dil.qi);
      this.o(dil.pS, dil.qj);
      this.o(dil.pT, dil.qk);
      this.o(dil.pU, dil.ql);
      this.o(dil.pV, dil.qm);
      this.o(dil.pW, dil.qn);
      this.o(dil.pX, dil.qo);
      this.o(dil.pY, dil.qp);
      this.o(dil.pZ, dil.qq);
      this.o(dil.qa, dil.qr);
      this.o(dil.qb, dil.qs);
      this.o(dil.pL, dil.qc);
      this.m(dil.na);
      this.m(dil.gs);
      this.m(dil.qP);
      this.m(dil.sx);
      this.s(dil.sy);
      this.s(dil.sz);
      this.t(dil.ti);
      this.t(dil.tj);
      this.aj();
      this.g(dil.sC, dil.sA);
      this.p(dil.sB);
      this.a(dil.hW, cwj.hB);
      this.a(cwj.hB);
      this.aE();
      this.a(dil.kN, cwj.jb);
      this.a(cwj.jb);
      this.f(dil.bQ, oo.a(dil.by, "_side"));
      this.a(dil.R);
      this.a(dil.S);
      this.a(dil.iB);
      this.a(dil.cx);
      this.a(dil.cy);
      this.a(dil.cz);
      this.a(dil.fE);
      this.a(dil.fF);
      this.a(dil.fJ);
      this.a(dil.N);
      this.a(dil.T);
      this.a(dil.O);
      this.a(dil.ch);
      this.a(dil.P);
      this.a(dil.Q);
      this.a(dil.ci);
      this.b(dil.pj, oq.d);
      this.a(dil.pi);
      this.a(dil.aR);
      this.a(dil.aS);
      this.a(dil.aT);
      this.a(dil.hb);
      this.a(dil.dI);
      this.a(dil.dJ);
      this.a(dil.ha);
      this.a(dil.pC);
      this.a(dil.mW);
      this.a(dil.dR);
      this.a(dil.k);
      this.a(dil.pk);
      this.a(dil.fz);
      this.a(dil.ec);
      this.a(dil.L);
      this.a(dil.ph);
      this.a(dil.dO);
      this.b(dil.dT, oq.g);
      this.b(dil.pq, oq.d);
      this.b(dil.fa, oq.d);
      this.m(dil.ac);
      this.m(dil.ga);
      this.a(dil.kK);
      this.a(dil.aY);
      this.a(dil.iC);
      this.a(dil.co);
      this.a(dil.pK);
      this.a(dil.ii);
      this.a(dil.oy);
      this.a(dil.dW);
      this.a(dil.dX);
      this.b(dil.ct, oq.b);
      this.a(dil.aO);
      this.b(dil.bw, oq.v);
      this.a(cwj.cS);
      this.b(dil.ck, oq.f);
      this.b(dil.pd, oq.d);
      this.a(dil.op);
      this.a(dil.aP);
      this.a(dil.qt);
      this.a(dil.qu);
      this.a(dil.qN);
      this.a(dil.su);
      this.a(dil.tf);
      this.a(dil.tg);
      this.a(dil.th);
      this.e(dil.qS);
      this.m(dil.tt);
      this.aD();
      this.a(dil.ra);
      this.a(dil.rb);
      this.a(dil.qW);
      this.a(dil.qX);
      this.a(dil.qY);
      this.a(dil.qZ);
      this.k(dil.qW, dil.rw);
      this.k(dil.qX, dil.ry);
      this.k(dil.qY, dil.rx);
      this.k(dil.qZ, dil.rz);
      this.i(dil.rM);
      this.i(dil.rN);
      this.i(dil.rP);
      this.i(dil.rO);
      this.a(dil.rM, dil.rQ);
      this.a(dil.rN, dil.rR);
      this.a(dil.rP, dil.rT);
      this.a(dil.rO, dil.rS);
      this.k(dil.rU);
      this.k(dil.rV);
      this.k(dil.rX);
      this.k(dil.rW);
      this.b(dil.rU, dil.rY);
      this.b(dil.rV, dil.rZ);
      this.b(dil.rX, dil.sb);
      this.b(dil.rW, dil.sa);
      this.a(dil.sc);
      this.a(dil.sd);
      this.a(dil.se);
      this.a(dil.sf);
      this.k(dil.sc, dil.sg);
      this.k(dil.sd, dil.sh);
      this.k(dil.se, dil.si);
      this.k(dil.sf, dil.sj);
      this.j(dil.gW, dil.ch);
      this.j(dil.gX, dil.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dil.og, dil.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dil.kt);
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
      this.F(dil.ff);
      this.F(dil.fg);
      this.F(dil.qT);
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
      this.E(dil.cO);
      this.d(dil.cO);
      this.E(dil.oa);
      this.g();
      this.E(dil.sE);
      this.l(dil.cp, dil.cq);
      this.l(dil.ea, dil.eb);
      this.a(dil.cA, dil.n, oo::c);
      this.a(dil.nY, dil.p, oo::d);
      this.y(dil.ow);
      this.y(dil.on);
      this.v(dil.aU);
      this.v(dil.hi);
      this.C();
      this.D(dil.oe);
      this.D(dil.of);
      this.e(dil.eX, ol.a(dil.eX));
      this.a(dil.dY, oq.d);
      this.a(dil.dZ, oq.d);
      this.a(dil.te);
      this.a(dil.kM, oq.d);
      this.f(dil.j);
      this.f(dil.sH);
      this.f(dil.I);
      this.g(dil.J);
      this.g(dil.M);
      this.f(dil.K);
      this.e(dil.F);
      this.b(dil.to, oq.f);
      this.a(dil.ij, oq.d, oq.e);
      this.a(dil.kx, oq.w, oq.x);
      this.a(dil.hf, oq.w, oq.x);
      this.a(dil.tk, oq.d, oq.e);
      this.a(dil.tl, oq.d, oq.e);
      this.a(dil.tm, oq.d, oq.e);
      this.c(dil.nT, oq.i);
      this.z();
      this.a(dil.pe, oo::A);
      this.a(dil.pf, oo::C);
      this.a(dil.kD, dwe.as, 0, 1, 2, 3);
      this.a(dil.gt, dwe.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dil.fq, dwe.as, 0, 1, 1, 2);
      this.a(dil.gu, dwe.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dil.cB, dwe.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dil.kA, nw.e.b, dwe.aq, 0, 1);
      this.i();
      this.h();
      this.a(ol.a("decorated_pot"), dil.iA).b(dil.tp);
      this.a(ol.a("banner"), dil.n)
         .a(on.bJ, dil.iJ, dil.iK, dil.iL, dil.iM, dil.iN, dil.iO, dil.iP, dil.iQ, dil.iR, dil.iS, dil.iT, dil.iU, dil.iV, dil.iW, dil.iX, dil.iY)
         .b(dil.iZ, dil.ja, dil.jb, dil.jc, dil.jd, dil.je, dil.jf, dil.jg, dil.jh, dil.ji, dil.jj, dil.jk, dil.jl, dil.jm, dil.jn, dil.jo);
      this.a(ol.a("bed"), dil.n)
         .b(dil.aZ, dil.ba, dil.bb, dil.bc, dil.bd, dil.be, dil.bf, dil.bg, dil.bh, dil.bi, dil.bj, dil.bk, dil.bl, dil.bm, dil.bn, dil.bo);
      this.m(dil.aZ, dil.bA);
      this.m(dil.ba, dil.bB);
      this.m(dil.bb, dil.bC);
      this.m(dil.bc, dil.bD);
      this.m(dil.bd, dil.bE);
      this.m(dil.be, dil.bF);
      this.m(dil.bf, dil.bG);
      this.m(dil.bg, dil.bH);
      this.m(dil.bh, dil.bI);
      this.m(dil.bi, dil.bJ);
      this.m(dil.bj, dil.bK);
      this.m(dil.bk, dil.bL);
      this.m(dil.bl, dil.bM);
      this.m(dil.bm, dil.bN);
      this.m(dil.bn, dil.bO);
      this.m(dil.bo, dil.bP);
      this.a(ol.a("skull"), dil.dW)
         .a(on.bK, dil.gM, dil.gK, dil.gI, dil.gE, dil.gG, dil.gQ)
         .a(dil.gO)
         .b(dil.gN, dil.gP, dil.gL, dil.gJ, dil.gF, dil.gH, dil.gR);
      this.G(dil.kP);
      this.G(dil.kQ);
      this.G(dil.kR);
      this.G(dil.kS);
      this.G(dil.kT);
      this.G(dil.kU);
      this.G(dil.kV);
      this.G(dil.kW);
      this.G(dil.kX);
      this.G(dil.kY);
      this.G(dil.kZ);
      this.G(dil.la);
      this.G(dil.lb);
      this.G(dil.lc);
      this.G(dil.ld);
      this.G(dil.le);
      this.G(dil.lf);
      this.b(dil.mX, oq.q);
      this.c(dil.mX);
      this.a(ol.a("chest"), dil.n).b(dil.cv, dil.gV);
      this.a(ol.a("ender_chest"), dil.co).b(dil.fG);
      this.f(dil.fx, dil.co).a(dil.fx, dil.kF);
      this.a(dil.aM);
      this.a(dil.aN);
      this.a(dil.lw);
      this.a(dil.lx);
      this.a(dil.ly);
      this.a(dil.lz);
      this.a(dil.lA);
      this.a(dil.lB);
      this.a(dil.lC);
      this.a(dil.lD);
      this.a(dil.lE);
      this.a(dil.lF);
      this.a(dil.lG);
      this.a(dil.lH);
      this.a(dil.lI);
      this.a(dil.lJ);
      this.a(dil.lK);
      this.a(dil.lL);
      this.a(oq.a, dil.lM, dil.lN, dil.lO, dil.lP, dil.lQ, dil.lR, dil.lS, dil.lT, dil.lU, dil.lV, dil.lW, dil.lX, dil.lY, dil.lZ, dil.ma, dil.mb);
      this.a(dil.iA);
      this.a(dil.hj);
      this.a(dil.hk);
      this.a(dil.hl);
      this.a(dil.hm);
      this.a(dil.hn);
      this.a(dil.ho);
      this.a(dil.hp);
      this.a(dil.hq);
      this.a(dil.hr);
      this.a(dil.hs);
      this.a(dil.ht);
      this.a(dil.hu);
      this.a(dil.hv);
      this.a(dil.hw);
      this.a(dil.hx);
      this.a(dil.hy);
      this.a(dil.qO);
      this.h(dil.aQ, dil.eY);
      this.h(dil.ei, dil.hz);
      this.h(dil.ej, dil.hA);
      this.h(dil.ek, dil.hB);
      this.h(dil.el, dil.hC);
      this.h(dil.em, dil.hD);
      this.h(dil.en, dil.hE);
      this.h(dil.eo, dil.hF);
      this.h(dil.ep, dil.hG);
      this.h(dil.eq, dil.hH);
      this.h(dil.er, dil.hI);
      this.h(dil.es, dil.hJ);
      this.h(dil.et, dil.hK);
      this.h(dil.eu, dil.hL);
      this.h(dil.ev, dil.hM);
      this.h(dil.ew, dil.hN);
      this.h(dil.ex, dil.hO);
      this.b(oq.o, dil.lg, dil.lh, dil.li, dil.lj, dil.lk, dil.ll, dil.lm, dil.ln, dil.lo, dil.lp, dil.lq, dil.lr, dil.ls, dil.lt, dil.lu, dil.lv);
      this.g(dil.bA, dil.ik);
      this.g(dil.bB, dil.il);
      this.g(dil.bC, dil.im);
      this.g(dil.bD, dil.in);
      this.g(dil.bE, dil.io);
      this.g(dil.bF, dil.ip);
      this.g(dil.bG, dil.iq);
      this.g(dil.bH, dil.ir);
      this.g(dil.bI, dil.is);
      this.g(dil.bJ, dil.it);
      this.g(dil.bK, dil.iu);
      this.g(dil.bL, dil.iv);
      this.g(dil.bM, dil.iw);
      this.g(dil.bN, dil.ix);
      this.g(dil.bO, dil.iy);
      this.g(dil.bP, dil.iz);
      this.a(dil.sI);
      this.a(dil.eL);
      this.a(dil.bu, dil.gb, nw.e.a);
      this.a(dil.bR, dil.gc, nw.e.b);
      this.a(dil.bT, dil.gd, nw.e.b);
      this.a(dil.bU, dil.ge, nw.e.b);
      this.a(dil.bV, dil.gf, nw.e.b);
      this.a(dil.bW, dil.gg, nw.e.b);
      this.a(dil.bX, dil.gh, nw.e.b);
      this.a(dil.bY, dil.gi, nw.e.b);
      this.a(dil.bZ, dil.gj, nw.e.b);
      this.a(dil.ca, dil.gk, nw.e.b);
      this.a(dil.cb, dil.gl, nw.e.b);
      this.a(dil.cc, dil.gm, nw.e.b);
      this.a(dil.ce, dil.gn, nw.e.b);
      this.a(dil.cd, dil.go, nw.e.b);
      this.a(dil.cg, dil.gp, nw.e.b);
      this.a(dil.cf, dil.gq, nw.e.b);
      this.a(dil.bv, dil.gr, nw.e.b);
      this.a(dil.bS, dil.fS, nw.e.b);
      this.H();
      this.u(dil.eT);
      this.u(dil.eU);
      this.u(dil.eV);
      this.a(dil.bt, nw.e.a);
      this.b(dil.dS, nw.e.a);
      this.a(cwj.dJ);
      this.b(dil.mc, dil.md, nw.e.b);
      this.a(cwj.dK);
      this.c(dil.md);
      this.b(dil.sG, nw.e.b);
      this.c(dil.sG);
      this.c(dil.sw);
      this.b(dil.oz, dil.oA, nw.e.b);
      this.b(dil.oB, dil.oC, nw.e.b);
      this.a(dil.oz, "_plant");
      this.c(dil.oA);
      this.a(dil.oB, "_plant");
      this.c(dil.oC);
      this.a(dil.mY, nw.e.a, oo.c(oo.a(dil.mZ, "_stage0")));
      this.m();
      this.a(dil.bs, nw.e.b);
      this.c(dil.iE, nw.e.b);
      this.c(dil.iF, nw.e.b);
      this.c(dil.iG, nw.e.b);
      this.c(dil.iH, nw.e.a);
      this.c(dil.iI, nw.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dil.mw, dil.mr, dil.mm, dil.mh, dil.mG, dil.mB, dil.mQ, dil.mL);
      this.a(dil.mx, dil.ms, dil.mn, dil.mi, dil.mH, dil.mC, dil.mR, dil.mM);
      this.a(dil.my, dil.mt, dil.mo, dil.mj, dil.mI, dil.mD, dil.mS, dil.mN);
      this.a(dil.mz, dil.mu, dil.mp, dil.mk, dil.mJ, dil.mE, dil.mT, dil.mO);
      this.a(dil.mA, dil.mv, dil.mq, dil.ml, dil.mK, dil.mF, dil.mU, dil.mP);
      this.e(dil.fe, dil.fc);
      this.e(dil.fd, dil.fb);
      this.l(dil.ab).c(dil.ab).a(dil.av);
      this.l(dil.am).c(dil.am).a(dil.aD);
      this.a(dil.am, dil.dj, dil.ds);
      this.b(dil.aL, oq.s);
      this.l(dil.Y).c(dil.Y).a(dil.as);
      this.l(dil.ai).c(dil.ai).a(dil.aA);
      this.a(dil.ai, dil.dd, dil.do);
      this.a(dil.B, dil.fX, nw.e.b);
      this.b(dil.aI, oq.s);
      this.l(dil.Z).d(dil.Z).a(dil.at);
      this.l(dil.aj).d(dil.aj).a(dil.aB);
      this.a(dil.aj, dil.de, dil.dp);
      this.a(dil.C, dil.fY, nw.e.b);
      this.b(dil.aJ, oq.s);
      this.l(dil.W).c(dil.W).a(dil.aq);
      this.l(dil.ag).c(dil.ag).a(dil.ay);
      this.a(dil.ag, dil.dc, dil.dn);
      this.a(dil.z, dil.fV, nw.e.b);
      this.b(dil.aG, oq.s);
      this.l(dil.U).c(dil.U).a(dil.ao);
      this.l(dil.al).c(dil.al).a(dil.aw);
      this.a(dil.al, dil.da, dil.dl);
      this.a(dil.x, dil.fT, nw.e.b);
      this.b(dil.aE, oq.s);
      this.l(dil.V).c(dil.V).a(dil.ap);
      this.l(dil.af).c(dil.af).a(dil.ax);
      this.a(dil.af, dil.db, dil.dm);
      this.a(dil.y, dil.fU, nw.e.b);
      this.b(dil.aF, oq.s);
      this.l(dil.aa).c(dil.aa).a(dil.au);
      this.l(dil.ak).c(dil.ak).a(dil.aC);
      this.a(dil.ak, dil.dg, dil.dr);
      this.a(dil.D, dil.fZ, nw.e.b);
      this.b(dil.aK, oq.s);
      this.l(dil.X).c(dil.X).a(dil.ar);
      this.l(dil.ah).c(dil.ah).a(dil.az);
      this.a(dil.ah, dil.df, dil.dq);
      this.a(dil.A, dil.fW, nw.e.b);
      this.b(dil.aH, oq.s);
      this.l(dil.os).b(dil.os).a(dil.ou);
      this.l(dil.ot).b(dil.ot).a(dil.ov);
      this.a(dil.ot, dil.dh, dil.dt);
      this.a(dil.ox, dil.pm, nw.e.b);
      this.n(dil.oD, dil.po);
      this.l(dil.oj).b(dil.oj).a(dil.ol);
      this.l(dil.ok).b(dil.ok).a(dil.om);
      this.a(dil.ok, dil.di, dil.du);
      this.a(dil.oo, dil.pn, nw.e.b);
      this.n(dil.oq, dil.pp);
      this.l(dil.ae).d(dil.ae);
      this.l(dil.an).d(dil.an);
      this.a(dil.v, dil.dk, dil.dv);
      this.b(dil.or, nw.e.b);
      this.a(cwj.dG);
      this.i(dil.dy);
      this.k(dil.hY);
      this.u();
      this.n(dil.cP);
      this.o(dil.bp);
      this.o(dil.bq);
      this.o(dil.hh);
      this.t();
      this.q(dil.fN);
      this.q(dil.kG);
      this.q(dil.kH);
      this.r(dil.gS);
      this.r(dil.gT);
      this.r(dil.gU);
      this.o();
      this.p();
      this.d(dil.cD, oq.h);
      this.d(dil.nW, oq.h);
      this.d(dil.nV, oq.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dil.eK, dil.eS);
      this.k(dil.m, dil.eO);
      this.k(dil.eJ, dil.eR);
      this.k(dil.eI, dil.eQ);
      this.az();
      this.k(dil.eH, dil.eP);
      this.aA();
      cxo.b().forEach($$0 -> this.a($$0, ol.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dil.hX);
      oe.a<Integer> $$0 = oe.a(dwe.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         all $$3 = oo.a(cwj.hC, $$2);
         $$0.a($$1, og.a().a(oh.c, on.aa.a(dil.hX, $$2, oo.h($$3), this.c)));
         on.bB.a(ol.a(cwj.hC, $$2), oo.k($$3), this.c);
      }

      this.b.accept(od.a(dil.hX).a($$0));
   }

   private void o(dij $$0, dij $$1) {
      this.a($$0.j());
      oo $$2 = oo.b(oo.G($$0));
      oo $$3 = oo.b(oo.a($$0, "_lit"));
      all $$4 = on.bL.a($$0, "_one_candle", $$2, this.c);
      all $$5 = on.bM.a($$0, "_two_candles", $$2, this.c);
      all $$6 = on.bN.a($$0, "_three_candles", $$2, this.c);
      all $$7 = on.bO.a($$0, "_four_candles", $$2, this.c);
      all $$8 = on.bL.a($$0, "_one_candle_lit", $$3, this.c);
      all $$9 = on.bM.a($$0, "_two_candles_lit", $$3, this.c);
      all $$10 = on.bN.a($$0, "_three_candles_lit", $$3, this.c);
      all $$11 = on.bO.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            od.a($$0)
               .a(
                  oe.a(dwe.az, dwe.r)
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
      all $$12 = on.bP.a($$1, oo.a($$0, false), this.c);
      all $$13 = on.bP.a($$1, "_lit", oo.a($$0, true), this.c);
      this.b.accept(od.a($$1).a(a(dwe.r, $$13, $$12)));
   }

   class a {
      private final all b;

      public a(final all $$0, final dij $$1) {
         this.b = on.aa.a($$0, oo.u($$1), nw.this.c);
      }

      public nw.a a(dij... $$0) {
         for (dij $$1 : $$0) {
            nw.this.b.accept(nw.c($$1, this.b));
         }

         return this;
      }

      public nw.a b(dij... $$0) {
         for (dij $$1 : $$0) {
            nw.this.c($$1);
         }

         return this.a($$0);
      }

      public nw.a a(om $$0, dij... $$1) {
         for (dij $$2 : $$1) {
            $$0.a(ol.a($$2.j()), oo.u($$2), nw.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final oo b;
      private final Map<om, all> c = Maps.newHashMap();
      @Nullable
      private md d;
      @Nullable
      private all e;
      private final Set<dij> f = new HashSet<>();

      public b(final oo $$0) {
         this.b = $$0;
      }

      public nw.b a(dij $$0, om $$1) {
         this.e = $$1.a($$0, this.b, nw.this.c);
         if (nw.this.f.containsKey($$0)) {
            nw.this.b.accept(nw.this.f.get($$0).create($$0, this.e, this.b, nw.this.c));
         } else {
            nw.this.b.accept(nw.c($$0, this.e));
         }

         return this;
      }

      public nw.b a(dij $$0, dij $$1) {
         all $$2 = ol.a($$0);
         nw.this.b.accept(nw.c($$1, $$2));
         nw.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nw.b a(dij $$0) {
         all $$1 = on.s.a($$0, this.b, nw.this.c);
         all $$2 = on.t.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.b($$0, $$1, $$2));
         all $$3 = on.u.a($$0, this.b, nw.this.c);
         nw.this.a($$0, $$3);
         return this;
      }

      public nw.b b(dij $$0) {
         all $$1 = on.M.a($$0, this.b, nw.this.c);
         all $$2 = on.N.a($$0, this.b, nw.this.c);
         all $$3 = on.O.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.a($$0, $$1, $$2, $$3));
         all $$4 = on.P.a($$0, this.b, nw.this.c);
         nw.this.a($$0, $$4);
         return this;
      }

      public nw.b c(dij $$0) {
         oo $$1 = oo.p($$0);
         all $$2 = on.D.a($$0, $$1, nw.this.c);
         all $$3 = on.E.a($$0, $$1, nw.this.c);
         all $$4 = on.F.a($$0, $$1, nw.this.c);
         all $$5 = on.G.a($$0, $$1, nw.this.c);
         all $$6 = on.H.a($$0, $$1, nw.this.c);
         nw.this.b.accept(nw.a($$0, $$2, $$3, $$4, $$5, $$6));
         all $$7 = on.I.a($$0, $$1, nw.this.c);
         nw.this.a($$0, $$7);
         return this;
      }

      public nw.b d(dij $$0) {
         all $$1 = on.J.a($$0, this.b, nw.this.c);
         all $$2 = on.K.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.c($$0, $$1, $$2));
         all $$3 = on.L.a($$0, this.b, nw.this.c);
         nw.this.a($$0, $$3);
         return this;
      }

      public nw.b e(dij $$0) {
         oo $$1 = oo.p($$0);
         all $$2 = on.R.a($$0, $$1, nw.this.c);
         all $$3 = on.Q.a($$0, $$1, nw.this.c);
         all $$4 = on.T.a($$0, $$1, nw.this.c);
         all $$5 = on.S.a($$0, $$1, nw.this.c);
         nw.this.b.accept(nw.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nw.b f(dij $$0) {
         all $$1 = on.V.a($$0, this.b, nw.this.c);
         all $$2 = on.U.a($$0, this.b, nw.this.c);
         all $$3 = on.X.a($$0, this.b, nw.this.c);
         all $$4 = on.W.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nw.b g(dij $$0) {
         all $$1 = on.Y.a($$0, this.b, nw.this.c);
         all $$2 = on.Z.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.e($$0, $$1, $$2));
         return this;
      }

      public nw.b h(dij $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dij $$1 = this.d.b().get(md.b.r);
            all $$2 = on.aa.a($$0, this.b, nw.this.c);
            nw.this.b.accept(nw.c($$0, $$2));
            nw.this.b.accept(nw.c($$1, $$2));
            nw.this.a($$0.j());
            nw.this.c($$1);
            return this;
         }
      }

      public nw.b i(dij $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            all $$1 = this.a(on.ab, $$0);
            all $$2 = this.a(on.ac, $$0);
            nw.this.b.accept(nw.e($$0, $$1, $$2, this.e));
            nw.this.a($$0, $$1);
            return this;
         }
      }

      public nw.b j(dij $$0) {
         all $$1 = this.a(on.af, $$0);
         all $$2 = this.a(on.ae, $$0);
         all $$3 = this.a(on.ag, $$0);
         nw.this.b.accept(nw.b($$0, $$1, $$2, $$3));
         nw.this.a($$0, $$2);
         return this;
      }

      private nw.b k(dij $$0) {
         oq $$1 = nw.this.g.getOrDefault($$0, oq.a.get($$0));
         all $$2 = $$1.a($$0, nw.this.c);
         nw.this.b.accept(nw.c($$0, $$2));
         return this;
      }

      private nw.b l(dij $$0) {
         nw.this.i($$0);
         return this;
      }

      private void m(dij $$0) {
         if (nw.this.e.contains($$0)) {
            nw.this.k($$0);
         } else {
            nw.this.j($$0);
         }
      }

      private all a(om $$0, dij $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nw.this.c));
      }

      public nw.b a(md $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nw.b, dij> $$2 = nw.h.get($$0x);
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
      oa create(dij var1, all var2, oo var3, BiConsumer<all, Supplier<JsonElement>> var4);
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

      public nw.f a(dij $$0) {
         oo $$1 = this.b.c(op.d, this.b.a(op.i));
         all $$2 = on.j.a($$0, $$1, nw.this.c);
         nw.this.b.accept(nw.d($$0, $$2));
         return this;
      }

      public nw.f b(dij $$0) {
         all $$1 = on.j.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.d($$0, $$1));
         return this;
      }

      public nw.f c(dij $$0) {
         all $$1 = on.j.a($$0, this.b, nw.this.c);
         all $$2 = on.k.a($$0, this.b, nw.this.c);
         nw.this.b.accept(nw.d($$0, $$1, $$2));
         return this;
      }

      public nw.f d(dij $$0) {
         nw.this.b.accept(nw.a($$0, this.b, nw.this.c));
         return this;
      }
   }
}
