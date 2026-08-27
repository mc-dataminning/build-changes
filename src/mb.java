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

public class mb {
   final Consumer<me> b;
   final BiConsumer<aiy, Supplier<JsonElement>> c;
   private final Consumer<coy> d;
   final List<cys> e = ImmutableList.of(cyu.ey, cyu.eE, cyu.hY);
   final Map<cys, mb.c> f = ImmutableMap.builder().put(cyu.b, mb::a).put(cyu.sJ, mb::c).put(cyu.eM, mb::b).build();
   final Map<cys, mu> g = ImmutableMap.builder()
      .put(cyu.aV, mu.y.get(cyu.aV))
      .put(cyu.jp, mu.y.get(cyu.jp))
      .put(cyu.jS, mu.a(ms.a(cyu.aV, "_top")))
      .put(cyu.jU, mu.a(ms.a(cyu.jp, "_top")))
      .put(cyu.aX, mu.d.get(cyu.aV).a($$0x -> $$0x.a(mt.i, ms.G(cyu.aX))))
      .put(cyu.jr, mu.d.get(cyu.jp).a($$0x -> $$0x.a(mt.i, ms.G(cyu.jr))))
      .put(cyu.hd, mu.d.get(cyu.hd))
      .put(cyu.jT, mu.a(ms.a(cyu.hd, "_bottom")))
      .put(cyu.pr, mu.z.get(cyu.pr))
      .put(cyu.sJ, mu.z.get(cyu.sJ))
      .put(cyu.he, mu.d.get(cyu.he).a($$0x -> $$0x.a(mt.i, ms.G(cyu.he))))
      .put(cyu.aW, mu.d.get(cyu.aW).a($$0x -> {
         $$0x.a(mt.d, ms.a(cyu.aV, "_top"));
         $$0x.a(mt.i, ms.G(cyu.aW));
      }))
      .put(cyu.jq, mu.d.get(cyu.jq).a($$0x -> {
         $$0x.a(mt.d, ms.a(cyu.jp, "_top"));
         $$0x.a(mt.i, ms.G(cyu.jq));
      }))
      .put(cyu.qM, mu.z.get(cyu.qM))
      .put(cyu.qH, mu.z.get(cyu.qH))
      .build();
   static final Map<kj.b, BiConsumer<mb.b, cys>> h = ImmutableMap.builder()
      .put(kj.b.a, mb.b::a)
      .put(kj.b.e, mb.b::l)
      .put(kj.b.b, mb.b::k)
      .put(kj.b.c, mb.b::k)
      .put(kj.b.f, mb.b::c)
      .put(kj.b.g, mb.b::d)
      .put(kj.b.h, mb.b::e)
      .put(kj.b.i, mb.b::f)
      .put(kj.b.k, mb.b::h)
      .put(kj.b.l, mb.b::i)
      .put(kj.b.m, mb.b::j)
      .put(kj.b.n, mb.b::g)
      .put(kj.b.p, mb.b::m)
      .put(kj.b.q, mb.b::b)
      .build();
   public static final List<Pair<dma, Function<aiy, mk>>> a = List.of(
      Pair.of(dlz.L, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0)),
      Pair.of(dlz.M, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.d, true)),
      Pair.of(dlz.N, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.d, true)),
      Pair.of(dlz.O, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.d, true)),
      Pair.of(dlz.J, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.a, ml.a.d).a(ml.d, true)),
      Pair.of(dlz.K, (Function<aiy, mk>)$$0 -> mk.a().a(ml.c, $$0).a(ml.a, ml.a.b).a(ml.d, true))
   );
   private static final Map<mb.d, aiy> i = new HashMap<>();

   private static me a(cys $$0, aiy $$1, ms $$2, BiConsumer<aiy, Supplier<JsonElement>> $$3) {
      aiy $$4 = mr.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static me b(cys $$0, aiy $$1, ms $$2, BiConsumer<aiy, Supplier<JsonElement>> $$3) {
      aiy $$4 = mr.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static me c(cys $$0, aiy $$1, ms $$2, BiConsumer<aiy, Supplier<JsonElement>> $$3) {
      aiy $$4 = mr.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public mb(Consumer<me> $$0, BiConsumer<aiy, Supplier<JsonElement>> $$1, Consumer<coy> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cys $$0) {
      this.d.accept($$0.j());
   }

   void a(cys $$0, aiy $$1) {
      this.c.accept(mp.a($$0.j()), new mo($$1));
   }

   private void a(coy $$0, aiy $$1) {
      this.c.accept(mp.a($$0), new mo($$1));
   }

   void a(coy $$0) {
      mr.bx.a(mp.a($$0), ms.b($$0), this.c);
   }

   private void d(cys $$0) {
      coy $$1 = $$0.j();
      if ($$1 != cpg.a) {
         mr.bx.a(mp.a($$1), ms.F($$0), this.c);
      }
   }

   private void a(cys $$0, String $$1) {
      coy $$2 = $$0.j();
      mr.bx.a(mp.a($$2), ms.k(ms.a($$0, $$1)), this.c);
   }

   private static mi b() {
      return mi.a(dlz.R).a(ie.f, mk.a().a(ml.b, ml.a.b)).a(ie.d, mk.a().a(ml.b, ml.a.c)).a(ie.e, mk.a().a(ml.b, ml.a.d)).a(ie.c, mk.a());
   }

   private static mi c() {
      return mi.a(dlz.R).a(ie.d, mk.a()).a(ie.e, mk.a().a(ml.b, ml.a.b)).a(ie.c, mk.a().a(ml.b, ml.a.c)).a(ie.f, mk.a().a(ml.b, ml.a.d));
   }

   private static mi d() {
      return mi.a(dlz.R).a(ie.f, mk.a()).a(ie.d, mk.a().a(ml.b, ml.a.b)).a(ie.e, mk.a().a(ml.b, ml.a.c)).a(ie.c, mk.a().a(ml.b, ml.a.d));
   }

   private static mi e() {
      return mi.a(dlz.P)
         .a(ie.a, mk.a().a(ml.a, ml.a.b))
         .a(ie.b, mk.a().a(ml.a, ml.a.d))
         .a(ie.c, mk.a())
         .a(ie.d, mk.a().a(ml.b, ml.a.c))
         .a(ie.e, mk.a().a(ml.b, ml.a.d))
         .a(ie.f, mk.a().a(ml.b, ml.a.b));
   }

   private static mh b(cys $$0, aiy $$1) {
      return mh.a($$0, a($$1));
   }

   private static mk[] a(aiy $$0) {
      return new mk[]{mk.a().a(ml.c, $$0), mk.a().a(ml.c, $$0).a(ml.b, ml.a.b), mk.a().a(ml.c, $$0).a(ml.b, ml.a.c), mk.a().a(ml.c, $$0).a(ml.b, ml.a.d)};
   }

   private static mh a(cys $$0, aiy $$1, aiy $$2) {
      return mh.a($$0, mk.a().a(ml.c, $$1), mk.a().a(ml.c, $$2), mk.a().a(ml.c, $$1).a(ml.b, ml.a.c), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c));
   }

   private static mi a(dma $$0, aiy $$1, aiy $$2) {
      return mi.a($$0).a(true, mk.a().a(ml.c, $$1)).a(false, mk.a().a(ml.c, $$2));
   }

   private void e(cys $$0) {
      aiy $$1 = mu.a.create($$0, this.c);
      aiy $$2 = mu.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cys $$0) {
      aiy $$1 = mu.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cys $$0) {
      this.b.accept(mh.a($$0).a(mi.a(dlz.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aiy $$3 = ms.a($$0, $$2);
         return mk.a().a(ml.c, mr.c.a($$0, $$2, new ms().a(mt.a, $$3), this.c));
      })));
      this.a($$0, ms.a($$0, "_0"));
   }

   static me b(cys $$0, aiy $$1, aiy $$2) {
      return mh.a($$0)
         .a(mi.a(dlz.w).a(false, mk.a().a(ml.c, $$1)).a(true, mk.a().a(ml.c, $$2)))
         .a(
            mi.a(dlz.U, dlz.R)
               .a(dlu.a, ie.f, mk.a().a(ml.b, ml.a.b))
               .a(dlu.a, ie.e, mk.a().a(ml.b, ml.a.d))
               .a(dlu.a, ie.d, mk.a().a(ml.b, ml.a.c))
               .a(dlu.a, ie.c, mk.a())
               .a(dlu.b, ie.f, mk.a().a(ml.b, ml.a.b).a(ml.a, ml.a.b).a(ml.d, true))
               .a(dlu.b, ie.e, mk.a().a(ml.b, ml.a.d).a(ml.a, ml.a.b).a(ml.d, true))
               .a(dlu.b, ie.d, mk.a().a(ml.b, ml.a.c).a(ml.a, ml.a.b).a(ml.d, true))
               .a(dlu.b, ie.c, mk.a().a(ml.a, ml.a.b).a(ml.d, true))
               .a(dlu.c, ie.f, mk.a().a(ml.b, ml.a.d).a(ml.a, ml.a.c))
               .a(dlu.c, ie.e, mk.a().a(ml.b, ml.a.b).a(ml.a, ml.a.c))
               .a(dlu.c, ie.d, mk.a().a(ml.a, ml.a.c))
               .a(dlu.c, ie.c, mk.a().a(ml.b, ml.a.c).a(ml.a, ml.a.c))
         );
   }

   private static mi.d<ie, dmf, dme, Boolean> a(mi.d<ie, dmf, dme, Boolean> $$0, dmf $$1, aiy $$2, aiy $$3, aiy $$4, aiy $$5) {
      return $$0.a(ie.f, $$1, dme.a, false, mk.a().a(ml.c, $$2))
         .a(ie.d, $$1, dme.a, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
         .a(ie.e, $$1, dme.a, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.c))
         .a(ie.c, $$1, dme.a, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.d))
         .a(ie.f, $$1, dme.b, false, mk.a().a(ml.c, $$4))
         .a(ie.d, $$1, dme.b, false, mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
         .a(ie.e, $$1, dme.b, false, mk.a().a(ml.c, $$4).a(ml.b, ml.a.c))
         .a(ie.c, $$1, dme.b, false, mk.a().a(ml.c, $$4).a(ml.b, ml.a.d))
         .a(ie.f, $$1, dme.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
         .a(ie.d, $$1, dme.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
         .a(ie.e, $$1, dme.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
         .a(ie.c, $$1, dme.a, true, mk.a().a(ml.c, $$3))
         .a(ie.f, $$1, dme.b, true, mk.a().a(ml.c, $$5).a(ml.b, ml.a.d))
         .a(ie.d, $$1, dme.b, true, mk.a().a(ml.c, $$5))
         .a(ie.e, $$1, dme.b, true, mk.a().a(ml.c, $$5).a(ml.b, ml.a.b))
         .a(ie.c, $$1, dme.b, true, mk.a().a(ml.c, $$5).a(ml.b, ml.a.c));
   }

   private static me a(cys $$0, aiy $$1, aiy $$2, aiy $$3, aiy $$4, aiy $$5, aiy $$6, aiy $$7, aiy $$8) {
      return mh.a($$0).a(a(a(mi.a(dlz.R, dlz.ae, dlz.be, dlz.u), dmf.b, $$1, $$2, $$3, $$4), dmf.a, $$5, $$6, $$7, $$8));
   }

   static me a(cys $$0, aiy $$1, aiy $$2, aiy $$3, aiy $$4, aiy $$5) {
      return mg.a($$0)
         .a(mk.a().a(ml.c, $$1))
         .a(mf.a().a(dlz.L, true), mk.a().a(ml.c, $$2).a(ml.d, false))
         .a(mf.a().a(dlz.M, true), mk.a().a(ml.c, $$3).a(ml.d, false))
         .a(mf.a().a(dlz.N, true), mk.a().a(ml.c, $$4).a(ml.d, false))
         .a(mf.a().a(dlz.O, true), mk.a().a(ml.c, $$5).a(ml.d, false));
   }

   static me c(cys $$0, aiy $$1, aiy $$2) {
      return mg.a($$0)
         .a(mk.a().a(ml.c, $$1))
         .a(mf.a().a(dlz.L, true), mk.a().a(ml.c, $$2).a(ml.d, true))
         .a(mf.a().a(dlz.M, true), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, true))
         .a(mf.a().a(dlz.N, true), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, true))
         .a(mf.a().a(dlz.O, true), mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, true));
   }

   static me a(cys $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mg.a($$0)
         .a(mf.a().a(dlz.J, true), mk.a().a(ml.c, $$1))
         .a(mf.a().a(dlz.X, dmv.b), mk.a().a(ml.c, $$2).a(ml.d, true))
         .a(mf.a().a(dlz.W, dmv.b), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, true))
         .a(mf.a().a(dlz.Y, dmv.b), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, true))
         .a(mf.a().a(dlz.Z, dmv.b), mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, true))
         .a(mf.a().a(dlz.X, dmv.c), mk.a().a(ml.c, $$3).a(ml.d, true))
         .a(mf.a().a(dlz.W, dmv.c), mk.a().a(ml.c, $$3).a(ml.b, ml.a.b).a(ml.d, true))
         .a(mf.a().a(dlz.Y, dmv.c), mk.a().a(ml.c, $$3).a(ml.b, ml.a.c).a(ml.d, true))
         .a(mf.a().a(dlz.Z, dmv.c), mk.a().a(ml.c, $$3).a(ml.b, ml.a.d).a(ml.d, true));
   }

   static me a(cys $$0, aiy $$1, aiy $$2, aiy $$3, aiy $$4, boolean $$5) {
      return mh.a($$0, mk.a().a(ml.d, $$5))
         .a(c())
         .a(
            mi.a(dlz.q, dlz.u)
               .a(false, false, mk.a().a(ml.c, $$2))
               .a(true, false, mk.a().a(ml.c, $$4))
               .a(false, true, mk.a().a(ml.c, $$1))
               .a(true, true, mk.a().a(ml.c, $$3))
         );
   }

   static me b(cys $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mh.a($$0)
         .a(
            mi.a(dlz.R, dlz.af, dlz.bi)
               .a(ie.f, dmi.b, dms.a, mk.a().a(ml.c, $$2))
               .a(ie.e, dmi.b, dms.a, mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dmi.b, dms.a, mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dmi.b, dms.a, mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dmi.b, dms.e, mk.a().a(ml.c, $$3))
               .a(ie.e, dmi.b, dms.e, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dmi.b, dms.e, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dmi.b, dms.e, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dmi.b, dms.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.e, dmi.b, dms.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.d, dmi.b, dms.d, mk.a().a(ml.c, $$3))
               .a(ie.c, dmi.b, dms.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.f, dmi.b, dms.c, mk.a().a(ml.c, $$1))
               .a(ie.e, dmi.b, dms.c, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dmi.b, dms.c, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dmi.b, dms.c, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dmi.b, dms.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.e, dmi.b, dms.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.d, dmi.b, dms.b, mk.a().a(ml.c, $$1))
               .a(ie.c, dmi.b, dms.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.f, dmi.a, dms.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.e, dmi.a, dms.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dmi.a, dms.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dmi.a, dms.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dmi.a, dms.e, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.e, dmi.a, dms.e, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.d, dmi.a, dms.e, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.c, dmi.a, dms.e, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.f, dmi.a, dms.d, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.e, dmi.a, dms.d, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dmi.a, dms.d, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dmi.a, dms.d, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.f, dmi.a, dms.c, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.e, dmi.a, dms.c, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
               .a(ie.d, dmi.a, dms.c, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.c, dmi.a, dms.c, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.f, dmi.a, dms.b, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.d, true))
               .a(ie.e, dmi.a, dms.b, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.c).a(ml.d, true))
               .a(ie.d, dmi.a, dms.b, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.b).a(ml.d, true))
               .a(ie.c, dmi.a, dms.b, mk.a().a(ml.c, $$1).a(ml.a, ml.a.c).a(ml.b, ml.a.d).a(ml.d, true))
         );
   }

   private static me c(cys $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mh.a($$0)
         .a(
            mi.a(dlz.R, dlz.af, dlz.u)
               .a(ie.c, dmi.b, false, mk.a().a(ml.c, $$2))
               .a(ie.d, dmi.b, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.c))
               .a(ie.f, dmi.b, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
               .a(ie.e, dmi.b, false, mk.a().a(ml.c, $$2).a(ml.b, ml.a.d))
               .a(ie.c, dmi.a, false, mk.a().a(ml.c, $$1))
               .a(ie.d, dmi.a, false, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c))
               .a(ie.f, dmi.a, false, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b))
               .a(ie.e, dmi.a, false, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d))
               .a(ie.c, dmi.b, true, mk.a().a(ml.c, $$3))
               .a(ie.d, dmi.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               .a(ie.f, dmi.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(ie.e, dmi.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
               .a(ie.c, dmi.a, true, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.c))
               .a(ie.d, dmi.a, true, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.a))
               .a(ie.f, dmi.a, true, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.d))
               .a(ie.e, dmi.a, true, mk.a().a(ml.c, $$3).a(ml.a, ml.a.c).a(ml.b, ml.a.b))
         );
   }

   private static me d(cys $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mh.a($$0)
         .a(
            mi.a(dlz.R, dlz.af, dlz.u)
               .a(ie.c, dmi.b, false, mk.a().a(ml.c, $$2))
               .a(ie.d, dmi.b, false, mk.a().a(ml.c, $$2))
               .a(ie.f, dmi.b, false, mk.a().a(ml.c, $$2))
               .a(ie.e, dmi.b, false, mk.a().a(ml.c, $$2))
               .a(ie.c, dmi.a, false, mk.a().a(ml.c, $$1))
               .a(ie.d, dmi.a, false, mk.a().a(ml.c, $$1))
               .a(ie.f, dmi.a, false, mk.a().a(ml.c, $$1))
               .a(ie.e, dmi.a, false, mk.a().a(ml.c, $$1))
               .a(ie.c, dmi.b, true, mk.a().a(ml.c, $$3))
               .a(ie.d, dmi.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               .a(ie.f, dmi.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(ie.e, dmi.b, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
               .a(ie.c, dmi.a, true, mk.a().a(ml.c, $$3))
               .a(ie.d, dmi.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               .a(ie.f, dmi.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(ie.e, dmi.a, true, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
         );
   }

   static mh c(cys $$0, aiy $$1) {
      return mh.a($$0, mk.a().a(ml.c, $$1));
   }

   private static mi f() {
      return mi.a(dlz.I).a(ie.a.b, mk.a()).a(ie.a.c, mk.a().a(ml.a, ml.a.b)).a(ie.a.a, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.b));
   }

   static me a(cys $$0, ms $$1, BiConsumer<aiy, Supplier<JsonElement>> $$2) {
      aiy $$3 = mr.g.a($$0, $$1, $$2);
      aiy $$4 = mr.h.a($$0, $$1, $$2);
      aiy $$5 = mr.i.a($$0, $$1, $$2);
      aiy $$6 = mr.j.a($$0, $$1, $$2);
      return mh.a($$0, mk.a().a(ml.c, $$6)).a(mi.a(dlz.I).a(ie.a.a, mk.a().a(ml.c, $$3)).a(ie.a.b, mk.a().a(ml.c, $$4)).a(ie.a.c, mk.a().a(ml.c, $$5)));
   }

   static me d(cys $$0, aiy $$1) {
      return mh.a($$0, mk.a().a(ml.c, $$1)).a(f());
   }

   private void e(cys $$0, aiy $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cys $$0, mu.a $$1) {
      aiy $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cys $$0, mu.a $$1) {
      aiy $$2 = $$1.create($$0, this.c);
      this.b.accept(mh.a($$0, mk.a().a(ml.c, $$2)).a(b()));
   }

   static me d(cys $$0, aiy $$1, aiy $$2) {
      return mh.a($$0)
         .a(
            mi.a(dlz.I)
               .a(ie.a.b, mk.a().a(ml.c, $$1))
               .a(ie.a.c, mk.a().a(ml.c, $$2).a(ml.a, ml.a.b))
               .a(ie.a.a, mk.a().a(ml.c, $$2).a(ml.a, ml.a.b).a(ml.b, ml.a.b))
         );
   }

   private void a(cys $$0, mu.a $$1, mu.a $$2) {
      aiy $$3 = $$1.create($$0, this.c);
      aiy $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aiy a(cys $$0, String $$1, mq $$2, Function<aiy, ms> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ms.a($$0, $$1)), this.c);
   }

   static me e(cys $$0, aiy $$1, aiy $$2) {
      return mh.a($$0).a(a(dlz.w, $$2, $$1));
   }

   static me e(cys $$0, aiy $$1, aiy $$2, aiy $$3) {
      return mh.a($$0).a(mi.a(dlz.bh).a(dmr.b, mk.a().a(ml.c, $$1)).a(dmr.a, mk.a().a(ml.c, $$2)).a(dmr.c, mk.a().a(ml.c, $$3)));
   }

   public void a(cys $$0) {
      this.b($$0, mu.a);
   }

   public void b(cys $$0, mu.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cys $$0, ms $$1, mq $$2) {
      aiy $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private mb.b h(cys $$0) {
      mu $$1 = this.g.getOrDefault($$0, mu.a.get($$0));
      return new mb.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cys $$0, cys $$1, cys $$2) {
      ms $$3 = ms.u($$0);
      aiy $$4 = mr.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void i(cys $$0) {
      ms $$1 = ms.t($$0);
      aiy $$2 = mr.v.a($$0, $$1, this.c);
      aiy $$3 = mr.w.a($$0, $$1, this.c);
      aiy $$4 = mr.x.a($$0, $$1, this.c);
      aiy $$5 = mr.y.a($$0, $$1, this.c);
      aiy $$6 = mr.z.a($$0, $$1, this.c);
      aiy $$7 = mr.A.a($$0, $$1, this.c);
      aiy $$8 = mr.B.a($$0, $$1, this.c);
      aiy $$9 = mr.C.a($$0, $$1, this.c);
      this.a($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(cys $$0, cys $$1) {
      aiy $$2 = mr.v.a($$0);
      aiy $$3 = mr.w.a($$0);
      aiy $$4 = mr.x.a($$0);
      aiy $$5 = mr.y.a($$0);
      aiy $$6 = mr.z.a($$0);
      aiy $$7 = mr.A.a($$0);
      aiy $$8 = mr.B.a($$0);
      aiy $$9 = mr.C.a($$0);
      this.a($$1, mp.a($$0.j()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cys $$0) {
      ms $$1 = ms.b($$0);
      aiy $$2 = mr.ak.a($$0, $$1, this.c);
      aiy $$3 = mr.al.a($$0, $$1, this.c);
      aiy $$4 = mr.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cys $$0) {
      ms $$1 = ms.b($$0);
      aiy $$2 = mr.ah.a($$0, $$1, this.c);
      aiy $$3 = mr.ai.a($$0, $$1, this.c);
      aiy $$4 = mr.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(cys $$0, cys $$1) {
      aiy $$2 = mr.ah.a($$0);
      aiy $$3 = mr.ai.a($$0);
      aiy $$4 = mr.aj.a($$0);
      this.a($$1, mp.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(cyu.sD);
      aiy $$0 = mp.a(cyu.sD);
      aiy $$1 = mp.a(cyu.sD, "_partial_tilt");
      aiy $$2 = mp.a(cyu.sD, "_full_tilt");
      this.b
         .accept(
            mh.a(cyu.sD)
               .a(b())
               .a(mi.a(dlz.bl).a(dmu.a, mk.a().a(ml.c, $$0)).a(dmu.b, mk.a().a(ml.c, $$0)).a(dmu.c, mk.a().a(ml.c, $$1)).a(dmu.d, mk.a().a(ml.c, $$2)))
         );
   }

   private mb.f l(cys $$0) {
      return new mb.f(ms.n($$0));
   }

   private void m(cys $$0) {
      this.c($$0, $$0);
   }

   private void c(cys $$0, cys $$1) {
      this.b.accept(c($$0, mp.a($$1)));
   }

   private void a(cys $$0, mb.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cys $$0, mb.e $$1, ms $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cys $$0, mb.e $$1) {
      ms $$2 = ms.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cys $$0, mb.e $$1, ms $$2) {
      aiy $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cys $$0, mb.e $$1, dmm<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         mi $$4 = mi.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            ms $$5 = ms.c(ms.a($$0, $$4x));
            aiy $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return mk.a().a(ml.c, $$6);
         });
         this.a($$0.j());
         this.b.accept(mh.a($$0).a($$4));
      }
   }

   private void a(cys $$0, cys $$1, mb.e $$2) {
      this.a($$0, $$2);
      ms $$3 = ms.d($$0);
      aiy $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(cys $$0, cys $$1) {
      mu $$2 = mu.p.get($$0);
      aiy $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aiy $$4 = mr.aC.a($$1, $$2.b(), this.c);
      this.b.accept(mh.a($$1, mk.a().a(ml.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(cys $$0, cys $$1) {
      this.a($$0.j());
      ms $$2 = ms.h($$0);
      ms $$3 = ms.a($$0, $$1);
      aiy $$4 = mr.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            mh.a($$1, mk.a().a(ml.c, $$4))
               .a(mi.a(dlz.R).a(ie.e, mk.a()).a(ie.d, mk.a().a(ml.b, ml.a.d)).a(ie.c, mk.a().a(ml.b, ml.a.b)).a(ie.f, mk.a().a(ml.b, ml.a.c)))
         );
      this.b.accept(mh.a($$0).a(mi.a(dlz.av).a($$2x -> mk.a().a(ml.c, mr.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cys $$0 = cyu.kC;
      this.a($$0.j());
      aiy $$1 = mp.a($$0, "_top");
      aiy $$2 = mp.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cys $$0 = cyu.kB;
      this.a($$0.j());
      mi $$1 = mi.a(deg.d, dlz.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> mk.a().a(ml.c, mp.a($$0, "_top_stage_" + $$1x));
            case b -> mk.a().a(ml.c, mp.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mh.a($$0).a($$1));
   }

   private void a(cys $$0, cys $$1, cys $$2, cys $$3, cys $$4, cys $$5, cys $$6, cys $$7) {
      this.a($$0, mb.e.b);
      this.a($$1, mb.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(cys $$0, mb.e $$1) {
      this.a($$0, "_top");
      aiy $$2 = this.a($$0, "_top", $$1.a(), ms::c);
      aiy $$3 = this.a($$0, "_bottom", $$1.a(), ms::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cyu.iD, "_front");
      aiy $$0 = mp.a(cyu.iD, "_top");
      aiy $$1 = this.a(cyu.iD, "_bottom", mb.e.b.a(), ms::c);
      this.f(cyu.iD, $$0, $$1);
   }

   private void k() {
      aiy $$0 = this.a(cyu.bx, "_top", mr.bk, ms::a);
      aiy $$1 = this.a(cyu.bx, "_bottom", mr.bk, ms::a);
      this.f(cyu.bx, $$0, $$1);
   }

   private void l() {
      this.c(cyu.sF);
      aiy $$0 = mp.a(cyu.sF, "_top");
      aiy $$1 = mp.a(cyu.sF, "_bottom");
      this.b.accept(mh.a(cyu.sF).a(b()).a(mi.a(dlz.ae).a(dmf.b, mk.a().a(ml.c, $$1)).a(dmf.a, mk.a().a(ml.c, $$0))));
   }

   private void f(cys $$0, aiy $$1, aiy $$2) {
      this.b.accept(mh.a($$0).a(mi.a(dlz.ae).a(dmf.b, mk.a().a(ml.c, $$2)).a(dmf.a, mk.a().a(ml.c, $$1))));
   }

   private void n(cys $$0) {
      ms $$1 = ms.e($$0);
      ms $$2 = ms.e(ms.a($$0, "_corner"));
      aiy $$3 = mr.as.a($$0, $$1, this.c);
      aiy $$4 = mr.at.a($$0, $$2, this.c);
      aiy $$5 = mr.au.a($$0, $$1, this.c);
      aiy $$6 = mr.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            mh.a($$0)
               .a(
                  mi.a(dlz.ag)
                     .a(dmn.a, mk.a().a(ml.c, $$3))
                     .a(dmn.b, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
                     .a(dmn.c, mk.a().a(ml.c, $$5).a(ml.b, ml.a.b))
                     .a(dmn.d, mk.a().a(ml.c, $$6).a(ml.b, ml.a.b))
                     .a(dmn.e, mk.a().a(ml.c, $$5))
                     .a(dmn.f, mk.a().a(ml.c, $$6))
                     .a(dmn.g, mk.a().a(ml.c, $$4))
                     .a(dmn.h, mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
                     .a(dmn.i, mk.a().a(ml.c, $$4).a(ml.b, ml.a.c))
                     .a(dmn.j, mk.a().a(ml.c, $$4).a(ml.b, ml.a.d))
               )
         );
   }

   private void o(cys $$0) {
      aiy $$1 = this.a($$0, "", mr.as, ms::e);
      aiy $$2 = this.a($$0, "", mr.au, ms::e);
      aiy $$3 = this.a($$0, "", mr.av, ms::e);
      aiy $$4 = this.a($$0, "_on", mr.as, ms::e);
      aiy $$5 = this.a($$0, "_on", mr.au, ms::e);
      aiy $$6 = this.a($$0, "_on", mr.av, ms::e);
      mi $$7 = mi.a(dlz.w, dlz.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return mk.a().a(ml.c, $$6x ? $$4 : $$1);
            case b:
               return mk.a().a(ml.c, $$6x ? $$4 : $$1).a(ml.b, ml.a.b);
            case c:
               return mk.a().a(ml.c, $$6x ? $$5 : $$2).a(ml.b, ml.a.b);
            case d:
               return mk.a().a(ml.c, $$6x ? $$6 : $$3).a(ml.b, ml.a.b);
            case e:
               return mk.a().a(ml.c, $$6x ? $$5 : $$2);
            case f:
               return mk.a().a(ml.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(mh.a($$0).a($$7));
   }

   private mb.a a(aiy $$0, cys $$1) {
      return new mb.a($$0, $$1);
   }

   private mb.a f(cys $$0, cys $$1) {
      return new mb.a(mp.a($$0), $$1);
   }

   private void a(cys $$0, coy $$1) {
      aiy $$2 = mr.aa.a($$0, ms.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cys $$0, aiy $$1) {
      aiy $$2 = mr.aa.a($$0, ms.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(cys $$0, cys $$1) {
      this.a($$0);
      aiy $$2 = mu.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cys $$0) {
      this.a($$0.j());
      aiy $$1 = mu.k.create($$0, this.c);
      aiy $$2 = mu.l.create($$0, this.c);
      aiy $$3 = mu.m.create($$0, this.c);
      aiy $$4 = mu.n.create($$0, this.c);
      this.b
         .accept(
            mg.a($$0)
               .a(mf.a().a(dlz.S, 1, 2, 3, 4).a(dlz.R, ie.c), mk.a().a(ml.c, $$1))
               .a(mf.a().a(dlz.S, 1, 2, 3, 4).a(dlz.R, ie.f), mk.a().a(ml.c, $$1).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.S, 1, 2, 3, 4).a(dlz.R, ie.d), mk.a().a(ml.c, $$1).a(ml.b, ml.a.c))
               .a(mf.a().a(dlz.S, 1, 2, 3, 4).a(dlz.R, ie.e), mk.a().a(ml.c, $$1).a(ml.b, ml.a.d))
               .a(mf.a().a(dlz.S, 2, 3, 4).a(dlz.R, ie.c), mk.a().a(ml.c, $$2))
               .a(mf.a().a(dlz.S, 2, 3, 4).a(dlz.R, ie.f), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.S, 2, 3, 4).a(dlz.R, ie.d), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c))
               .a(mf.a().a(dlz.S, 2, 3, 4).a(dlz.R, ie.e), mk.a().a(ml.c, $$2).a(ml.b, ml.a.d))
               .a(mf.a().a(dlz.S, 3, 4).a(dlz.R, ie.c), mk.a().a(ml.c, $$3))
               .a(mf.a().a(dlz.S, 3, 4).a(dlz.R, ie.f), mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.S, 3, 4).a(dlz.R, ie.d), mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               .a(mf.a().a(dlz.S, 3, 4).a(dlz.R, ie.e), mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
               .a(mf.a().a(dlz.S, 4).a(dlz.R, ie.c), mk.a().a(ml.c, $$4))
               .a(mf.a().a(dlz.S, 4).a(dlz.R, ie.f), mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.S, 4).a(dlz.R, ie.d), mk.a().a(ml.c, $$4).a(ml.b, ml.a.c))
               .a(mf.a().a(dlz.S, 4).a(dlz.R, ie.e), mk.a().a(ml.c, $$4).a(ml.b, ml.a.d))
         );
   }

   private void a(mu.a $$0, cys... $$1) {
      for (cys $$2 : $$1) {
         aiy $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(mu.a $$0, cys... $$1) {
      for (cys $$2 : $$1) {
         aiy $$3 = $$0.create($$2, this.c);
         this.b.accept(mh.a($$2, mk.a().a(ml.c, $$3)).a(c()));
      }
   }

   private void h(cys $$0, cys $$1) {
      this.a($$0);
      ms $$2 = ms.b($$0, $$1);
      aiy $$3 = mr.aI.a($$1, $$2, this.c);
      aiy $$4 = mr.aJ.a($$1, $$2, this.c);
      aiy $$5 = mr.aK.a($$1, $$2, this.c);
      aiy $$6 = mr.aG.a($$1, $$2, this.c);
      aiy $$7 = mr.aH.a($$1, $$2, this.c);
      coy $$8 = $$1.j();
      mr.bx.a(mp.a($$8), ms.F($$0), this.c);
      this.b
         .accept(
            mg.a($$1)
               .a(mk.a().a(ml.c, $$3))
               .a(mf.a().a(dlz.L, true), mk.a().a(ml.c, $$4))
               .a(mf.a().a(dlz.M, true), mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.N, true), mk.a().a(ml.c, $$5))
               .a(mf.a().a(dlz.O, true), mk.a().a(ml.c, $$5).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.L, false), mk.a().a(ml.c, $$6))
               .a(mf.a().a(dlz.M, false), mk.a().a(ml.c, $$7))
               .a(mf.a().a(dlz.N, false), mk.a().a(ml.c, $$7).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.O, false), mk.a().a(ml.c, $$6).a(ml.b, ml.a.d))
         );
   }

   private void q(cys $$0) {
      ms $$1 = ms.z($$0);
      aiy $$2 = mr.aL.a($$0, $$1, this.c);
      aiy $$3 = this.a($$0, "_conditional", mr.aL, $$1x -> $$1.c(mt.i, $$1x));
      this.b.accept(mh.a($$0).a(a(dlz.c, $$3, $$2)).a(e()));
   }

   private void r(cys $$0) {
      aiy $$1 = mu.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<mk> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> mk.a().a(ml.c, mp.a(cyu.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cyu.mZ);
      this.b
         .accept(
            mg.a(cyu.mZ)
               .a(mf.a().a(dlz.aq, 0), this.a(0))
               .a(mf.a().a(dlz.aq, 1), this.a(1))
               .a(mf.a().a(dlz.bk, dlv.b), mk.a().a(ml.c, mp.a(cyu.mZ, "_small_leaves")))
               .a(mf.a().a(dlz.bk, dlv.c), mk.a().a(ml.c, mp.a(cyu.mZ, "_large_leaves")))
         );
   }

   private mi n() {
      return mi.a(dlz.P)
         .a(ie.a, mk.a().a(ml.a, ml.a.c))
         .a(ie.b, mk.a())
         .a(ie.c, mk.a().a(ml.a, ml.a.b))
         .a(ie.d, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.c))
         .a(ie.e, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.d))
         .a(ie.f, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.b));
   }

   private void o() {
      aiy $$0 = ms.a(cyu.nU, "_top_open");
      this.b
         .accept(
            mh.a(cyu.nU)
               .a(this.n())
               .a(
                  mi.a(dlz.u)
                     .a(false, mk.a().a(ml.c, mu.f.create(cyu.nU, this.c)))
                     .a(true, mk.a().a(ml.c, mu.f.get(cyu.nU).a($$1 -> $$1.a(mt.f, $$0)).a(cyu.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mi a(dmm<T> $$0, T $$1, aiy $$2, aiy $$3) {
      mk $$4 = mk.a().a(ml.c, $$2);
      mk $$5 = mk.a().a(ml.c, $$3);
      return mi.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cys $$0, Function<cys, ms> $$1) {
      ms $$2 = $$1.apply($$0).b(mt.i, mt.c);
      ms $$3 = $$2.c(mt.g, ms.a($$0, "_front_honey"));
      aiy $$4 = mr.q.a($$0, $$2, this.c);
      aiy $$5 = mr.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(mh.a($$0).a(b()).a(a(dlz.aN, 5, $$5, $$4)));
   }

   private void a(cys $$0, dmm<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aiy> $$3 = new Int2ObjectOpenHashMap();
         mi $$4 = mi.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aiy $$5 = (aiy)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mr.aV, ms::g));
            return mk.a().a(ml.c, $$5);
         });
         this.a($$0.j());
         this.b.accept(mh.a($$0).a($$4));
      }
   }

   private void p() {
      aiy $$0 = mp.a(cyu.od, "_floor");
      aiy $$1 = mp.a(cyu.od, "_ceiling");
      aiy $$2 = mp.a(cyu.od, "_wall");
      aiy $$3 = mp.a(cyu.od, "_between_walls");
      this.a(cpg.wi);
      this.b
         .accept(
            mh.a(cyu.od)
               .a(
                  mi.a(dlz.R, dlz.V)
                     .a(ie.c, dlx.a, mk.a().a(ml.c, $$0))
                     .a(ie.d, dlx.a, mk.a().a(ml.c, $$0).a(ml.b, ml.a.c))
                     .a(ie.f, dlx.a, mk.a().a(ml.c, $$0).a(ml.b, ml.a.b))
                     .a(ie.e, dlx.a, mk.a().a(ml.c, $$0).a(ml.b, ml.a.d))
                     .a(ie.c, dlx.b, mk.a().a(ml.c, $$1))
                     .a(ie.d, dlx.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c))
                     .a(ie.f, dlx.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b))
                     .a(ie.e, dlx.b, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d))
                     .a(ie.c, dlx.c, mk.a().a(ml.c, $$2).a(ml.b, ml.a.d))
                     .a(ie.d, dlx.c, mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
                     .a(ie.f, dlx.c, mk.a().a(ml.c, $$2))
                     .a(ie.e, dlx.c, mk.a().a(ml.c, $$2).a(ml.b, ml.a.c))
                     .a(ie.d, dlx.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
                     .a(ie.c, dlx.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
                     .a(ie.f, dlx.d, mk.a().a(ml.c, $$3))
                     .a(ie.e, dlx.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mh.a(cyu.nZ, mk.a().a(ml.c, mp.a(cyu.nZ)))
               .a(
                  mi.a(dlz.U, dlz.R)
                     .a(dlu.a, ie.c, mk.a())
                     .a(dlu.a, ie.f, mk.a().a(ml.b, ml.a.b))
                     .a(dlu.a, ie.d, mk.a().a(ml.b, ml.a.c))
                     .a(dlu.a, ie.e, mk.a().a(ml.b, ml.a.d))
                     .a(dlu.b, ie.c, mk.a().a(ml.a, ml.a.b))
                     .a(dlu.b, ie.f, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.b))
                     .a(dlu.b, ie.d, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.c))
                     .a(dlu.b, ie.e, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.d))
                     .a(dlu.c, ie.d, mk.a().a(ml.a, ml.a.c))
                     .a(dlu.c, ie.e, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.b))
                     .a(dlu.c, ie.c, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.c))
                     .a(dlu.c, ie.f, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.d))
               )
         );
   }

   private void d(cys $$0, mu.a $$1) {
      aiy $$2 = $$1.create($$0, this.c);
      aiy $$3 = ms.a($$0, "_front_on");
      aiy $$4 = $$1.get($$0).a($$1x -> $$1x.a(mt.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mh.a($$0).a(a(dlz.r, $$4, $$2)).a(b()));
   }

   private void a(cys... $$0) {
      aiy $$1 = mp.a("campfire_off");

      for (cys $$2 : $$0) {
         aiy $$3 = mr.bc.a($$2, ms.E($$2), this.c);
         this.a($$2.j());
         this.b.accept(mh.a($$2).a(a(dlz.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cys $$0) {
      aiy $$1 = mr.bt.a($$0, ms.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cys $$0) {
      aiy $$1;
      if ($$0 == cyu.tj) {
         $$1 = mr.bv.a($$0, ms.m($$0), this.c);
      } else {
         $$1 = mr.bu.a($$0, ms.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ms $$0 = ms.a(ms.G(cyu.cl), ms.G(cyu.n));
      aiy $$1 = mr.j.a(cyu.cl, $$0, this.c);
      this.b.accept(c(cyu.cl, $$1));
   }

   private void s() {
      this.a(cpg.lG);
      this.b
         .accept(
            mg.a(cyu.cw)
               .a(
                  mf.b(
                     mf.a().a(dlz.ab, dmo.c).a(dlz.aa, dmo.c).a(dlz.ac, dmo.c).a(dlz.ad, dmo.c),
                     mf.a().a(dlz.ab, dmo.b, dmo.a).a(dlz.aa, dmo.b, dmo.a),
                     mf.a().a(dlz.aa, dmo.b, dmo.a).a(dlz.ac, dmo.b, dmo.a),
                     mf.a().a(dlz.ac, dmo.b, dmo.a).a(dlz.ad, dmo.b, dmo.a),
                     mf.a().a(dlz.ad, dmo.b, dmo.a).a(dlz.ab, dmo.b, dmo.a)
                  ),
                  mk.a().a(ml.c, mp.a("redstone_dust_dot"))
               )
               .a(mf.a().a(dlz.ab, dmo.b, dmo.a), mk.a().a(ml.c, mp.a("redstone_dust_side0")))
               .a(mf.a().a(dlz.ac, dmo.b, dmo.a), mk.a().a(ml.c, mp.a("redstone_dust_side_alt0")))
               .a(mf.a().a(dlz.aa, dmo.b, dmo.a), mk.a().a(ml.c, mp.a("redstone_dust_side_alt1")).a(ml.b, ml.a.d))
               .a(mf.a().a(dlz.ad, dmo.b, dmo.a), mk.a().a(ml.c, mp.a("redstone_dust_side1")).a(ml.b, ml.a.d))
               .a(mf.a().a(dlz.ab, dmo.a), mk.a().a(ml.c, mp.a("redstone_dust_up")))
               .a(mf.a().a(dlz.aa, dmo.a), mk.a().a(ml.c, mp.a("redstone_dust_up")).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.ac, dmo.a), mk.a().a(ml.c, mp.a("redstone_dust_up")).a(ml.b, ml.a.c))
               .a(mf.a().a(dlz.ad, dmo.a), mk.a().a(ml.c, mp.a("redstone_dust_up")).a(ml.b, ml.a.d))
         );
   }

   private void t() {
      this.a(cpg.lK);
      this.b
         .accept(
            mh.a(cyu.gY)
               .a(c())
               .a(
                  mi.a(dlz.bd, dlz.w)
                     .a(dmc.a, false, mk.a().a(ml.c, mp.a(cyu.gY)))
                     .a(dmc.a, true, mk.a().a(ml.c, mp.a(cyu.gY, "_on")))
                     .a(dmc.b, false, mk.a().a(ml.c, mp.a(cyu.gY, "_subtract")))
                     .a(dmc.b, true, mk.a().a(ml.c, mp.a(cyu.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      ms $$0 = ms.a(cyu.jR);
      ms $$1 = ms.a(ms.a(cyu.jE, "_side"), $$0.a(mt.f));
      aiy $$2 = mr.ab.a(cyu.jE, $$1, this.c);
      aiy $$3 = mr.ac.a(cyu.jE, $$1, this.c);
      aiy $$4 = mr.j.b(cyu.jE, "_double", $$1, this.c);
      this.b.accept(e(cyu.jE, $$2, $$3, $$4));
      this.b.accept(c(cyu.jR, mr.c.a(cyu.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cpg.sp);
      this.b
         .accept(
            mg.a(cyu.fs)
               .a(mk.a().a(ml.c, ms.G(cyu.fs)))
               .a(mf.a().a(dlz.k, true), mk.a().a(ml.c, ms.a(cyu.fs, "_bottle0")))
               .a(mf.a().a(dlz.l, true), mk.a().a(ml.c, ms.a(cyu.fs, "_bottle1")))
               .a(mf.a().a(dlz.m, true), mk.a().a(ml.c, ms.a(cyu.fs, "_bottle2")))
               .a(mf.a().a(dlz.k, false), mk.a().a(ml.c, ms.a(cyu.fs, "_empty0")))
               .a(mf.a().a(dlz.l, false), mk.a().a(ml.c, ms.a(cyu.fs, "_empty1")))
               .a(mf.a().a(dlz.m, false), mk.a().a(ml.c, ms.a(cyu.fs, "_empty2")))
         );
   }

   private void u(cys $$0) {
      aiy $$1 = mr.bp.a($$0, ms.b($$0), this.c);
      aiy $$2 = mp.a("mushroom_block_inside");
      this.b
         .accept(
            mg.a($$0)
               .a(mf.a().a(dlz.L, true), mk.a().a(ml.c, $$1))
               .a(mf.a().a(dlz.M, true), mk.a().a(ml.c, $$1).a(ml.b, ml.a.b).a(ml.d, true))
               .a(mf.a().a(dlz.N, true), mk.a().a(ml.c, $$1).a(ml.b, ml.a.c).a(ml.d, true))
               .a(mf.a().a(dlz.O, true), mk.a().a(ml.c, $$1).a(ml.b, ml.a.d).a(ml.d, true))
               .a(mf.a().a(dlz.J, true), mk.a().a(ml.c, $$1).a(ml.a, ml.a.d).a(ml.d, true))
               .a(mf.a().a(dlz.K, true), mk.a().a(ml.c, $$1).a(ml.a, ml.a.b).a(ml.d, true))
               .a(mf.a().a(dlz.L, false), mk.a().a(ml.c, $$2))
               .a(mf.a().a(dlz.M, false), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, false))
               .a(mf.a().a(dlz.N, false), mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, false))
               .a(mf.a().a(dlz.O, false), mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, false))
               .a(mf.a().a(dlz.J, false), mk.a().a(ml.c, $$2).a(ml.a, ml.a.d).a(ml.d, false))
               .a(mf.a().a(dlz.K, false), mk.a().a(ml.c, $$2).a(ml.a, ml.a.b).a(ml.d, false))
         );
      this.a($$0, mu.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cpg.rA);
      this.b
         .accept(
            mh.a(cyu.eg)
               .a(
                  mi.a(dlz.ay)
                     .a(0, mk.a().a(ml.c, mp.a(cyu.eg)))
                     .a(1, mk.a().a(ml.c, mp.a(cyu.eg, "_slice1")))
                     .a(2, mk.a().a(ml.c, mp.a(cyu.eg, "_slice2")))
                     .a(3, mk.a().a(ml.c, mp.a(cyu.eg, "_slice3")))
                     .a(4, mk.a().a(ml.c, mp.a(cyu.eg, "_slice4")))
                     .a(5, mk.a().a(ml.c, mp.a(cyu.eg, "_slice5")))
                     .a(6, mk.a().a(ml.c, mp.a(cyu.eg, "_slice6")))
               )
         );
   }

   private void x() {
      ms $$0 = new ms()
         .a(mt.c, ms.a(cyu.nX, "_side3"))
         .a(mt.o, ms.G(cyu.t))
         .a(mt.n, ms.a(cyu.nX, "_top"))
         .a(mt.j, ms.a(cyu.nX, "_side3"))
         .a(mt.l, ms.a(cyu.nX, "_side3"))
         .a(mt.k, ms.a(cyu.nX, "_side1"))
         .a(mt.m, ms.a(cyu.nX, "_side2"));
      this.b.accept(c(cyu.nX, mr.a.a(cyu.nX, $$0, this.c)));
   }

   private void y() {
      ms $$0 = new ms()
         .a(mt.c, ms.a(cyu.ob, "_front"))
         .a(mt.o, ms.a(cyu.ob, "_bottom"))
         .a(mt.n, ms.a(cyu.ob, "_top"))
         .a(mt.j, ms.a(cyu.ob, "_front"))
         .a(mt.k, ms.a(cyu.ob, "_front"))
         .a(mt.l, ms.a(cyu.ob, "_side"))
         .a(mt.m, ms.a(cyu.ob, "_side"));
      this.b.accept(c(cyu.ob, mr.a.a(cyu.ob, $$0, this.c)));
   }

   private void a(cys $$0, cys $$1, BiFunction<cys, cys, ms> $$2) {
      ms $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mr.a.a($$0, $$3, this.c)));
   }

   public void b(cys $$0) {
      ms $$1 = new ms()
         .a(mt.c, ms.a($$0, "_particle"))
         .a(mt.o, ms.a($$0, "_down"))
         .a(mt.n, ms.a($$0, "_up"))
         .a(mt.j, ms.a($$0, "_north"))
         .a(mt.k, ms.a($$0, "_south"))
         .a(mt.l, ms.a($$0, "_east"))
         .a(mt.m, ms.a($$0, "_west"));
      this.b.accept(c($$0, mr.a.a($$0, $$1, this.c)));
   }

   private void z() {
      ms $$0 = ms.k(cyu.eZ);
      this.b.accept(c(cyu.eZ, mp.a(cyu.eZ)));
      this.a(cyu.ee, $$0);
      this.a(cyu.ef, $$0);
   }

   private void a(cys $$0, ms $$1) {
      aiy $$2 = mr.p.a($$0, $$1.c(mt.g, ms.G($$0)), this.c);
      this.b.accept(mh.a($$0, mk.a().a(ml.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cpg.sq);
      this.m(cyu.ft);
      this.b.accept(c(cyu.fv, mr.bs.a(cyu.fv, ms.j(ms.a(cyu.H, "_still")), this.c)));
      this.b
         .accept(
            mh.a(cyu.fu)
               .a(
                  mi.a(dda.g)
                     .a(1, mk.a().a(ml.c, mr.bq.a(cyu.fu, "_level1", ms.j(ms.a(cyu.G, "_still")), this.c)))
                     .a(2, mk.a().a(ml.c, mr.br.a(cyu.fu, "_level2", ms.j(ms.a(cyu.G, "_still")), this.c)))
                     .a(3, mk.a().a(ml.c, mr.bs.a(cyu.fu, "_full", ms.j(ms.a(cyu.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mh.a(cyu.fw)
               .a(
                  mi.a(dda.g)
                     .a(1, mk.a().a(ml.c, mr.bq.a(cyu.fw, "_level1", ms.j(ms.G(cyu.qP)), this.c)))
                     .a(2, mk.a().a(ml.c, mr.br.a(cyu.fw, "_level2", ms.j(ms.G(cyu.qP)), this.c)))
                     .a(3, mk.a().a(ml.c, mr.bs.a(cyu.fw, "_full", ms.j(ms.G(cyu.qP)), this.c)))
               )
         );
   }

   private void B() {
      ms $$0 = ms.b(cyu.kv);
      aiy $$1 = mr.aE.a(cyu.kv, $$0, this.c);
      aiy $$2 = this.a(cyu.kv, "_dead", mr.aE, $$1x -> $$0.c(mt.b, $$1x));
      this.b.accept(mh.a(cyu.kv).a(a(dlz.au, 5, $$2, $$1)));
   }

   private void C() {
      aiy $$0 = mp.a(cyu.tq);
      aiy $$1 = mp.a(cyu.tq, "_triggered");
      aiy $$2 = mp.a(cyu.tq, "_crafting");
      aiy $$3 = mp.a(cyu.tq, "_crafting_triggered");
      this.b
         .accept(
            mh.a(cyu.tq)
               .a(mi.a(dlz.T).a($$0x -> this.a($$0x, mk.a())))
               .a(
                  mi.a(dlz.A, dal.b)
                     .a(false, false, mk.a().a(ml.c, $$0))
                     .a(true, true, mk.a().a(ml.c, $$3))
                     .a(true, false, mk.a().a(ml.c, $$1))
                     .a(false, true, mk.a().a(ml.c, $$2))
               )
         );
   }

   private void v(cys $$0) {
      ms $$1 = new ms().a(mt.f, ms.a(cyu.cD, "_top")).a(mt.i, ms.a(cyu.cD, "_side")).a(mt.g, ms.a($$0, "_front"));
      ms $$2 = new ms().a(mt.i, ms.a(cyu.cD, "_top")).a(mt.g, ms.a($$0, "_front_vertical"));
      aiy $$3 = mr.p.a($$0, $$1, this.c);
      aiy $$4 = mr.r.a($$0, $$2, this.c);
      this.b
         .accept(
            mh.a($$0)
               .a(
                  mi.a(dlz.P)
                     .a(ie.a, mk.a().a(ml.c, $$4).a(ml.a, ml.a.c))
                     .a(ie.b, mk.a().a(ml.c, $$4))
                     .a(ie.c, mk.a().a(ml.c, $$3))
                     .a(ie.f, mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
                     .a(ie.d, mk.a().a(ml.c, $$3).a(ml.b, ml.a.c))
                     .a(ie.e, mk.a().a(ml.c, $$3).a(ml.b, ml.a.d))
               )
         );
   }

   private void D() {
      aiy $$0 = mp.a(cyu.fy);
      aiy $$1 = mp.a(cyu.fy, "_filled");
      this.b.accept(mh.a(cyu.fy).a(mi.a(dlz.h).a(false, mk.a().a(ml.c, $$0)).a(true, mk.a().a(ml.c, $$1))).a(c()));
   }

   private void E() {
      aiy $$0 = mp.a(cyu.ku, "_side");
      aiy $$1 = mp.a(cyu.ku, "_noside");
      aiy $$2 = mp.a(cyu.ku, "_noside1");
      aiy $$3 = mp.a(cyu.ku, "_noside2");
      aiy $$4 = mp.a(cyu.ku, "_noside3");
      this.b
         .accept(
            mg.a(cyu.ku)
               .a(mf.a().a(dlz.L, true), mk.a().a(ml.c, $$0))
               .a(mf.a().a(dlz.M, true), mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.d, true))
               .a(mf.a().a(dlz.N, true), mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.d, true))
               .a(mf.a().a(dlz.O, true), mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.d, true))
               .a(mf.a().a(dlz.J, true), mk.a().a(ml.c, $$0).a(ml.a, ml.a.d).a(ml.d, true))
               .a(mf.a().a(dlz.K, true), mk.a().a(ml.c, $$0).a(ml.a, ml.a.b).a(ml.d, true))
               .a(mf.a().a(dlz.L, false), mk.a().a(ml.c, $$1).a(ml.e, 2), mk.a().a(ml.c, $$2), mk.a().a(ml.c, $$3), mk.a().a(ml.c, $$4))
               .a(
                  mf.a().a(dlz.M, false),
                  mk.a().a(ml.c, $$2).a(ml.b, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$3).a(ml.b, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$4).a(ml.b, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.b, ml.a.b).a(ml.d, true)
               )
               .a(
                  mf.a().a(dlz.N, false),
                  mk.a().a(ml.c, $$3).a(ml.b, ml.a.c).a(ml.d, true),
                  mk.a().a(ml.c, $$4).a(ml.b, ml.a.c).a(ml.d, true),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.b, ml.a.c).a(ml.d, true),
                  mk.a().a(ml.c, $$2).a(ml.b, ml.a.c).a(ml.d, true)
               )
               .a(
                  mf.a().a(dlz.O, false),
                  mk.a().a(ml.c, $$4).a(ml.b, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.b, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$2).a(ml.b, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$3).a(ml.b, ml.a.d).a(ml.d, true)
               )
               .a(
                  mf.a().a(dlz.J, false),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.a, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$4).a(ml.a, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$2).a(ml.a, ml.a.d).a(ml.d, true),
                  mk.a().a(ml.c, $$3).a(ml.a, ml.a.d).a(ml.d, true)
               )
               .a(
                  mf.a().a(dlz.K, false),
                  mk.a().a(ml.c, $$4).a(ml.a, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$3).a(ml.a, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$2).a(ml.a, ml.a.b).a(ml.d, true),
                  mk.a().a(ml.c, $$1).a(ml.e, 2).a(ml.a, ml.a.b).a(ml.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            mg.a(cyu.pc)
               .a(mk.a().a(ml.c, ms.G(cyu.pc)))
               .a(mf.a().a(dlz.aL, 1), mk.a().a(ml.c, ms.a(cyu.pc, "_contents1")))
               .a(mf.a().a(dlz.aL, 2), mk.a().a(ml.c, ms.a(cyu.pc, "_contents2")))
               .a(mf.a().a(dlz.aL, 3), mk.a().a(ml.c, ms.a(cyu.pc, "_contents3")))
               .a(mf.a().a(dlz.aL, 4), mk.a().a(ml.c, ms.a(cyu.pc, "_contents4")))
               .a(mf.a().a(dlz.aL, 5), mk.a().a(ml.c, ms.a(cyu.pc, "_contents5")))
               .a(mf.a().a(dlz.aL, 6), mk.a().a(ml.c, ms.a(cyu.pc, "_contents6")))
               .a(mf.a().a(dlz.aL, 7), mk.a().a(ml.c, ms.a(cyu.pc, "_contents7")))
               .a(mf.a().a(dlz.aL, 8), mk.a().a(ml.c, ms.a(cyu.pc, "_contents_ready")))
         );
   }

   private void w(cys $$0) {
      aiy $$1 = mr.c.a($$0, ms.a($$0), this.c);
      aiy $$2 = this.a($$0, "_powered", mr.c, ms::b);
      aiy $$3 = this.a($$0, "_lit", mr.c, ms::b);
      aiy $$4 = this.a($$0, "_lit_powered", mr.c, ms::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private me a(cys $$0, aiy $$1, aiy $$2, aiy $$3, aiy $$4) {
      return mh.a($$0).a(mi.a(dlz.r, dlz.w).a(($$4x, $$5) -> $$4x ? mk.a().a(ml.c, $$5 ? $$4 : $$2) : mk.a().a(ml.c, $$5 ? $$3 : $$1)));
   }

   private void i(cys $$0, cys $$1) {
      aiy $$2 = mp.a($$0);
      aiy $$3 = mp.a($$0, "_powered");
      aiy $$4 = mp.a($$0, "_lit");
      aiy $$5 = mp.a($$0, "_lit_powered");
      this.a($$1, mp.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(cys $$0) {
      this.c($$0);
      this.b.accept(mh.a($$0, mk.a().a(ml.c, mr.ao.a($$0, ms.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(cyu.qy);
      this.x(cyu.qx);
      this.x(cyu.qw);
      this.x(cyu.qv);
   }

   private void H() {
      this.c(cyu.st);
      mi.b<ie, dmg> $$0 = mi.a(dlz.bm, dlz.bn);

      for (dmg $$1 : dmg.values()) {
         $$0.a(ie.b, $$1, this.a(ie.b, $$1));
      }

      for (dmg $$2 : dmg.values()) {
         $$0.a(ie.a, $$2, this.a(ie.a, $$2));
      }

      this.b.accept(mh.a(cyu.st).a($$0));
   }

   private mk a(ie $$0, dmg $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ms $$3 = ms.c(ms.a(cyu.st, $$2));
      return mk.a().a(ml.c, mr.an.a(cyu.st, $$2, $$3, this.c));
   }

   private void y(cys $$0) {
      ms $$1 = new ms().a(mt.e, ms.G(cyu.dV)).a(mt.f, ms.G($$0)).a(mt.i, ms.a($$0, "_side"));
      this.b.accept(c($$0, mr.n.a($$0, $$1, this.c)));
   }

   private void I() {
      aiy $$0 = ms.a(cyu.gZ, "_side");
      ms $$1 = new ms().a(mt.f, ms.a(cyu.gZ, "_top")).a(mt.i, $$0);
      ms $$2 = new ms().a(mt.f, ms.a(cyu.gZ, "_inverted_top")).a(mt.i, $$0);
      this.b
         .accept(
            mh.a(cyu.gZ)
               .a(mi.a(dlz.p).a(false, mk.a().a(ml.c, mr.aF.a(cyu.gZ, $$1, this.c))).a(true, mk.a().a(ml.c, mr.aF.a(mp.a(cyu.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(cys $$0) {
      this.b.accept(mh.a($$0, mk.a().a(ml.c, mp.a($$0))).a(this.n()));
   }

   private void J() {
      cys $$0 = cyu.ss;
      aiy $$1 = mp.a($$0, "_on");
      aiy $$2 = mp.a($$0);
      this.b.accept(mh.a($$0, mk.a().a(ml.c, mp.a($$0))).a(this.n()).a(a(dlz.w, $$1, $$2)));
   }

   private void K() {
      ms $$0 = new ms().a(mt.B, ms.G(cyu.j)).a(mt.f, ms.G(cyu.cC));
      ms $$1 = new ms().a(mt.B, ms.G(cyu.j)).a(mt.f, ms.a(cyu.cC, "_moist"));
      aiy $$2 = mr.aW.a(cyu.cC, $$0, this.c);
      aiy $$3 = mr.aW.a(ms.a(cyu.cC, "_moist"), $$1, this.c);
      this.b.accept(mh.a(cyu.cC).a(a(dlz.aQ, 7, $$3, $$2)));
   }

   private List<aiy> A(cys $$0) {
      aiy $$1 = mr.aX.a(mp.a($$0, "_floor0"), ms.v($$0), this.c);
      aiy $$2 = mr.aX.a(mp.a($$0, "_floor1"), ms.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aiy> B(cys $$0) {
      aiy $$1 = mr.aY.a(mp.a($$0, "_side0"), ms.v($$0), this.c);
      aiy $$2 = mr.aY.a(mp.a($$0, "_side1"), ms.w($$0), this.c);
      aiy $$3 = mr.aZ.a(mp.a($$0, "_side_alt0"), ms.v($$0), this.c);
      aiy $$4 = mr.aZ.a(mp.a($$0, "_side_alt1"), ms.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aiy> C(cys $$0) {
      aiy $$1 = mr.ba.a(mp.a($$0, "_up0"), ms.v($$0), this.c);
      aiy $$2 = mr.ba.a(mp.a($$0, "_up1"), ms.w($$0), this.c);
      aiy $$3 = mr.bb.a(mp.a($$0, "_up_alt0"), ms.v($$0), this.c);
      aiy $$4 = mr.bb.a(mp.a($$0, "_up_alt1"), ms.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<mk> a(List<aiy> $$0, UnaryOperator<mk> $$1) {
      return $$0.stream().map($$0x -> mk.a().a(ml.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      mf $$0 = mf.a().a(dlz.L, false).a(dlz.M, false).a(dlz.N, false).a(dlz.O, false).a(dlz.J, false);
      List<aiy> $$1 = this.A(cyu.cr);
      List<aiy> $$2 = this.B(cyu.cr);
      List<aiy> $$3 = this.C(cyu.cr);
      this.b
         .accept(
            mg.a(cyu.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(mf.b(mf.a().a(dlz.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(mf.b(mf.a().a(dlz.M, true), $$0), a($$2, $$0x -> $$0x.a(ml.b, ml.a.b)))
               .a(mf.b(mf.a().a(dlz.N, true), $$0), a($$2, $$0x -> $$0x.a(ml.b, ml.a.c)))
               .a(mf.b(mf.a().a(dlz.O, true), $$0), a($$2, $$0x -> $$0x.a(ml.b, ml.a.d)))
               .a(mf.a().a(dlz.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<aiy> $$0 = this.A(cyu.cs);
      List<aiy> $$1 = this.B(cyu.cs);
      this.b
         .accept(
            mg.a(cyu.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ml.b, ml.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ml.b, ml.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ml.b, ml.a.d)))
         );
   }

   private void D(cys $$0) {
      aiy $$1 = mu.t.create($$0, this.c);
      aiy $$2 = mu.u.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(mh.a($$0).a(a(dlz.j, $$2, $$1)));
   }

   private void N() {
      ms $$0 = ms.a(ms.a(cyu.ad, "_side"), ms.a(cyu.ad, "_top"));
      aiy $$1 = mr.j.a(cyu.ad, $$0, this.c);
      this.b.accept(d(cyu.ad, $$1));
   }

   private void O() {
      this.a(cpg.ad);
      cys $$0 = cyu.E;
      mi.b<Boolean, Integer> $$1 = mi.a(ddm.d, ddm.b);
      aiy $$2 = mp.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aiy $$4 = mp.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, mk.a().a(ml.c, $$4));
         $$1.a(false, $$3, mk.a().a(ml.c, $$2));
      }

      this.b.accept(mh.a(cyu.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mh.a(cyu.kI)
               .a(
                  mi.a(dlz.as)
                     .a(0, mk.a().a(ml.c, this.a(cyu.kI, "_0", mr.c, ms::b)))
                     .a(1, mk.a().a(ml.c, this.a(cyu.kI, "_1", mr.c, ms::b)))
                     .a(2, mk.a().a(ml.c, this.a(cyu.kI, "_2", mr.c, ms::b)))
                     .a(3, mk.a().a(ml.c, this.a(cyu.kI, "_3", mr.c, ms::b)))
               )
         );
   }

   private void Q() {
      aiy $$0 = ms.G(cyu.j);
      ms $$1 = new ms().a(mt.e, $$0).b(mt.e, mt.c).a(mt.f, ms.a(cyu.i, "_top")).a(mt.i, ms.a(cyu.i, "_snow"));
      mk $$2 = mk.a().a(ml.c, mr.n.a(cyu.i, "_snow", $$1, this.c));
      this.a(cyu.i, mp.a(cyu.i), $$2);
      aiy $$3 = mu.f.get(cyu.fl).a($$1x -> $$1x.a(mt.e, $$0)).a(cyu.fl, this.c);
      this.a(cyu.fl, $$3, $$2);
      aiy $$4 = mu.f.get(cyu.l).a($$1x -> $$1x.a(mt.e, $$0)).a(cyu.l, this.c);
      this.a(cyu.l, $$4, $$2);
   }

   private void a(cys $$0, aiy $$1, mk $$2) {
      List<mk> $$3 = Arrays.asList(a($$1));
      this.b.accept(mh.a($$0).a(mi.a(dlz.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cpg.rg);
      this.b
         .accept(
            mh.a(cyu.fC)
               .a(
                  mi.a(dlz.ar)
                     .a(0, mk.a().a(ml.c, mp.a(cyu.fC, "_stage0")))
                     .a(1, mk.a().a(ml.c, mp.a(cyu.fC, "_stage1")))
                     .a(2, mk.a().a(ml.c, mp.a(cyu.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cyu.kE, mp.a(cyu.kE)));
   }

   private void j(cys $$0, cys $$1) {
      ms $$2 = ms.b($$1);
      aiy $$3 = mr.Y.a($$0, $$2, this.c);
      aiy $$4 = mr.Z.a($$0, $$2, this.c);
      this.b.accept(mh.a($$0).a(a(dlz.aT, 1, $$4, $$3)));
   }

   private void T() {
      aiy $$0 = mp.a(cyu.hc);
      aiy $$1 = mp.a(cyu.hc, "_side");
      this.a(cpg.lQ);
      this.b
         .accept(
            mh.a(cyu.hc)
               .a(
                  mi.a(dlz.Q)
                     .a(ie.a, mk.a().a(ml.c, $$0))
                     .a(ie.c, mk.a().a(ml.c, $$1))
                     .a(ie.f, mk.a().a(ml.c, $$1).a(ml.b, ml.a.b))
                     .a(ie.d, mk.a().a(ml.c, $$1).a(ml.b, ml.a.c))
                     .a(ie.e, mk.a().a(ml.c, $$1).a(ml.b, ml.a.d))
               )
         );
   }

   private void k(cys $$0, cys $$1) {
      aiy $$2 = mp.a($$0);
      this.b.accept(mh.a($$1, mk.a().a(ml.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      aiy $$0 = mp.a(cyu.eW, "_post_ends");
      aiy $$1 = mp.a(cyu.eW, "_post");
      aiy $$2 = mp.a(cyu.eW, "_cap");
      aiy $$3 = mp.a(cyu.eW, "_cap_alt");
      aiy $$4 = mp.a(cyu.eW, "_side");
      aiy $$5 = mp.a(cyu.eW, "_side_alt");
      this.b
         .accept(
            mg.a(cyu.eW)
               .a(mk.a().a(ml.c, $$0))
               .a(mf.a().a(dlz.L, false).a(dlz.M, false).a(dlz.N, false).a(dlz.O, false), mk.a().a(ml.c, $$1))
               .a(mf.a().a(dlz.L, true).a(dlz.M, false).a(dlz.N, false).a(dlz.O, false), mk.a().a(ml.c, $$2))
               .a(mf.a().a(dlz.L, false).a(dlz.M, true).a(dlz.N, false).a(dlz.O, false), mk.a().a(ml.c, $$2).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.L, false).a(dlz.M, false).a(dlz.N, true).a(dlz.O, false), mk.a().a(ml.c, $$3))
               .a(mf.a().a(dlz.L, false).a(dlz.M, false).a(dlz.N, false).a(dlz.O, true), mk.a().a(ml.c, $$3).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.L, true), mk.a().a(ml.c, $$4))
               .a(mf.a().a(dlz.M, true), mk.a().a(ml.c, $$4).a(ml.b, ml.a.b))
               .a(mf.a().a(dlz.N, true), mk.a().a(ml.c, $$5))
               .a(mf.a().a(dlz.O, true), mk.a().a(ml.c, $$5).a(ml.b, ml.a.b))
         );
      this.d(cyu.eW);
   }

   private void E(cys $$0) {
      this.b.accept(mh.a($$0, mk.a().a(ml.c, mp.a($$0))).a(b()));
   }

   private void V() {
      aiy $$0 = mp.a(cyu.dw);
      aiy $$1 = mp.a(cyu.dw, "_on");
      this.d(cyu.dw);
      this.b
         .accept(
            mh.a(cyu.dw)
               .a(a(dlz.w, $$0, $$1))
               .a(
                  mi.a(dlz.U, dlz.R)
                     .a(dlu.c, ie.c, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.c))
                     .a(dlu.c, ie.f, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.d))
                     .a(dlu.c, ie.d, mk.a().a(ml.a, ml.a.c))
                     .a(dlu.c, ie.e, mk.a().a(ml.a, ml.a.c).a(ml.b, ml.a.b))
                     .a(dlu.a, ie.c, mk.a())
                     .a(dlu.a, ie.f, mk.a().a(ml.b, ml.a.b))
                     .a(dlu.a, ie.d, mk.a().a(ml.b, ml.a.c))
                     .a(dlu.a, ie.e, mk.a().a(ml.b, ml.a.d))
                     .a(dlu.b, ie.c, mk.a().a(ml.a, ml.a.b))
                     .a(dlu.b, ie.f, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.b))
                     .a(dlu.b, ie.d, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.c))
                     .a(dlu.b, ie.e, mk.a().a(ml.a, ml.a.b).a(ml.b, ml.a.d))
               )
         );
   }

   private void W() {
      this.d(cyu.fm);
      this.b.accept(b(cyu.fm, mp.a(cyu.fm)));
   }

   private void X() {
      this.d(cyu.tn);
      this.b.accept(c(cyu.tn, mp.a(cyu.tn)));
   }

   private void Y() {
      this.b.accept(mh.a(cyu.ed).a(mi.a(dlz.H).a(ie.a.a, mk.a().a(ml.c, mp.a(cyu.ed, "_ns"))).a(ie.a.c, mk.a().a(ml.c, mp.a(cyu.ed, "_ew")))));
   }

   private void Z() {
      aiy $$0 = mu.a.create(cyu.dV, this.c);
      this.b
         .accept(
            mh.a(
               cyu.dV,
               mk.a().a(ml.c, $$0),
               mk.a().a(ml.c, $$0).a(ml.a, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.a, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.a, ml.a.d),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.a, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.a, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.b).a(ml.a, ml.a.d),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.a, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.a, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.c).a(ml.a, ml.a.d),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.d),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.a, ml.a.b),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.a, ml.a.c),
               mk.a().a(ml.c, $$0).a(ml.b, ml.a.d).a(ml.a, ml.a.d)
            )
         );
   }

   private void aa() {
      aiy $$0 = mp.a(cyu.kO);
      aiy $$1 = mp.a(cyu.kO, "_on");
      this.b.accept(mh.a(cyu.kO).a(a(dlz.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      ms $$0 = new ms().a(mt.e, ms.a(cyu.by, "_bottom")).a(mt.i, ms.a(cyu.by, "_side"));
      aiy $$1 = ms.a(cyu.by, "_top_sticky");
      aiy $$2 = ms.a(cyu.by, "_top");
      ms $$3 = $$0.c(mt.E, $$1);
      ms $$4 = $$0.c(mt.E, $$2);
      aiy $$5 = mp.a(cyu.by, "_base");
      this.a(cyu.by, $$5, $$4);
      this.a(cyu.br, $$5, $$3);
      aiy $$6 = mr.n.a(cyu.by, "_inventory", $$0.c(mt.f, $$2), this.c);
      aiy $$7 = mr.n.a(cyu.br, "_inventory", $$0.c(mt.f, $$1), this.c);
      this.a(cyu.by, $$6);
      this.a(cyu.br, $$7);
   }

   private void a(cys $$0, aiy $$1, ms $$2) {
      aiy $$3 = mr.bh.a($$0, $$2, this.c);
      this.b.accept(mh.a($$0).a(a(dlz.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      ms $$0 = new ms().a(mt.F, ms.a(cyu.by, "_top")).a(mt.i, ms.a(cyu.by, "_side"));
      ms $$1 = $$0.c(mt.E, ms.a(cyu.by, "_top_sticky"));
      ms $$2 = $$0.c(mt.E, ms.a(cyu.by, "_top"));
      this.b
         .accept(
            mh.a(cyu.bz)
               .a(
                  mi.a(dlz.x, dlz.bg)
                     .a(false, dml.a, mk.a().a(ml.c, mr.bi.a(cyu.by, "_head", $$2, this.c)))
                     .a(false, dml.b, mk.a().a(ml.c, mr.bi.a(cyu.by, "_head_sticky", $$1, this.c)))
                     .a(true, dml.a, mk.a().a(ml.c, mr.bj.a(cyu.by, "_head_short", $$2, this.c)))
                     .a(true, dml.b, mk.a().a(ml.c, mr.bj.a(cyu.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      cys $$0 = cyu.tr;
      ms $$1 = ms.a($$0, "_side_inactive", "_top_inactive");
      ms $$2 = ms.a($$0, "_side_active", "_top_active");
      ms $$3 = ms.a($$0, "_side_active", "_top_ejecting_reward");
      aiy $$4 = mr.o.a($$0, $$1, this.c);
      aiy $$5 = mr.o.a($$0, "_active", $$2, this.c);
      aiy $$6 = mr.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(mh.a($$0).a(mi.a(dlz.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> mk.a().a(ml.c, $$4);
            case b, c, d -> mk.a().a(ml.c, $$5);
            case e -> mk.a().a(ml.c, $$6);
         };
      })));
   }

   private void ae() {
      aiy $$0 = mp.a(cyu.qQ, "_inactive");
      aiy $$1 = mp.a(cyu.qQ, "_active");
      this.a(cyu.qQ, $$0);
      this.b.accept(mh.a(cyu.qQ).a(mi.a(dlz.bo).a($$2 -> mk.a().a(ml.c, $$2 != dmq.b && $$2 != dmq.c ? $$0 : $$1))));
   }

   private void af() {
      aiy $$0 = mp.a(cyu.qR, "_inactive");
      aiy $$1 = mp.a(cyu.qR, "_active");
      this.a(cyu.qR, $$0);
      this.b.accept(mh.a(cyu.qR).a(mi.a(dlz.bo).a($$2 -> mk.a().a(ml.c, $$2 != dmq.b && $$2 != dmq.c ? $$0 : $$1))).a(b()));
   }

   private void ag() {
      aiy $$0 = mr.bM.a(cyu.qV, ms.a(false), this.c);
      aiy $$1 = mr.bM.a(cyu.qV, "_can_summon", ms.a(true), this.c);
      this.a(cyu.qV, $$0);
      this.b.accept(mh.a(cyu.qV).a(a(dlz.G, $$1, $$0)));
   }

   private void ah() {
      aiy $$0 = mp.a(cyu.nS, "_stable");
      aiy $$1 = mp.a(cyu.nS, "_unstable");
      this.a(cyu.nS, $$0);
      this.b.accept(mh.a(cyu.nS).a(a(dlz.b, $$1, $$0)));
   }

   private void ai() {
      aiy $$0 = this.a(cyu.sv, "", mr.ao, ms::c);
      aiy $$1 = this.a(cyu.sv, "_lit", mr.ao, ms::c);
      this.b.accept(mh.a(cyu.sv).a(a(dlz.D, $$1, $$0)));
      aiy $$2 = this.a(cyu.sw, "", mr.ao, ms::c);
      aiy $$3 = this.a(cyu.sw, "_lit", mr.ao, ms::c);
      this.b.accept(mh.a(cyu.sw).a(a(dlz.D, $$3, $$2)));
   }

   private void aj() {
      aiy $$0 = mu.a.create(cyu.fB, this.c);
      aiy $$1 = this.a(cyu.fB, "_on", mr.c, ms::b);
      this.b.accept(mh.a(cyu.fB).a(a(dlz.r, $$1, $$0)));
   }

   private void l(cys $$0, cys $$1) {
      ms $$2 = ms.y($$0);
      this.b.accept(c($$0, mr.bf.a($$0, $$2, this.c)));
      this.b.accept(mh.a($$1, mk.a().a(ml.c, mr.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ak() {
      ms $$0 = ms.y(cyu.dK);
      ms $$1 = ms.i(ms.a(cyu.dK, "_off"));
      aiy $$2 = mr.bf.a(cyu.dK, $$0, this.c);
      aiy $$3 = mr.bf.a(cyu.dK, "_off", $$1, this.c);
      this.b.accept(mh.a(cyu.dK).a(a(dlz.r, $$2, $$3)));
      aiy $$4 = mr.bg.a(cyu.dL, $$0, this.c);
      aiy $$5 = mr.bg.a(cyu.dL, "_off", $$1, this.c);
      this.b.accept(mh.a(cyu.dL).a(a(dlz.r, $$4, $$5)).a(d()));
      this.d(cyu.dK);
      this.c(cyu.dL);
   }

   private void al() {
      this.a(cpg.lJ);
      this.b.accept(mh.a(cyu.eh).a(mi.a(dlz.aA, dlz.s, dlz.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return mk.a().a(ml.c, ms.a(cyu.eh, $$3.toString()));
      })).a(c()));
   }

   private void am() {
      this.a(cpg.cS);
      this.b
         .accept(
            mh.a(cyu.mV)
               .a(
                  mi.a(dlz.aS, dlz.C)
                     .a(1, false, Arrays.asList(a(mp.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(mp.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(mp.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(mp.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(mp.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(mp.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(mp.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(mp.a("four_sea_pickles"))))
               )
         );
   }

   private void an() {
      ms $$0 = ms.a(cyu.dN);
      aiy $$1 = mr.c.a(cyu.dP, $$0, this.c);
      this.b.accept(mh.a(cyu.dN).a(mi.a(dlz.aF).a($$1x -> mk.a().a(ml.c, $$1x < 8 ? mp.a(cyu.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cyu.dN, mp.a(cyu.dN, "_height2"));
      this.b.accept(c(cyu.dP, $$1));
   }

   private void ao() {
      this.b.accept(mh.a(cyu.oc, mk.a().a(ml.c, mp.a(cyu.oc))).a(b()));
   }

   private void ap() {
      aiy $$0 = mu.a.create(cyu.pa, this.c);
      this.a(cyu.pa, $$0);
      this.b.accept(mh.a(cyu.pa).a(mi.a(dlz.bj).a($$0x -> mk.a().a(ml.c, this.a(cyu.pa, "_" + $$0x.c(), mr.c, ms::b)))));
   }

   private void aq() {
      this.a(cpg.wl);
      this.b.accept(mh.a(cyu.oi).a(mi.a(dlz.as).a($$0 -> mk.a().a(ml.c, this.a(cyu.oi, "_stage" + $$0, mr.ao, ms::c)))));
   }

   private void ar() {
      this.a(cpg.pr);
      this.b
         .accept(
            mh.a(cyu.fI)
               .a(
                  mi.a(dlz.a, dlz.M, dlz.L, dlz.N, dlz.O)
                     .a(false, false, false, false, false, mk.a().a(ml.c, mp.a(cyu.fI, "_ns")))
                     .a(false, true, false, false, false, mk.a().a(ml.c, mp.a(cyu.fI, "_n")).a(ml.b, ml.a.b))
                     .a(false, false, true, false, false, mk.a().a(ml.c, mp.a(cyu.fI, "_n")))
                     .a(false, false, false, true, false, mk.a().a(ml.c, mp.a(cyu.fI, "_n")).a(ml.b, ml.a.c))
                     .a(false, false, false, false, true, mk.a().a(ml.c, mp.a(cyu.fI, "_n")).a(ml.b, ml.a.d))
                     .a(false, true, true, false, false, mk.a().a(ml.c, mp.a(cyu.fI, "_ne")))
                     .a(false, true, false, true, false, mk.a().a(ml.c, mp.a(cyu.fI, "_ne")).a(ml.b, ml.a.b))
                     .a(false, false, false, true, true, mk.a().a(ml.c, mp.a(cyu.fI, "_ne")).a(ml.b, ml.a.c))
                     .a(false, false, true, false, true, mk.a().a(ml.c, mp.a(cyu.fI, "_ne")).a(ml.b, ml.a.d))
                     .a(false, false, true, true, false, mk.a().a(ml.c, mp.a(cyu.fI, "_ns")))
                     .a(false, true, false, false, true, mk.a().a(ml.c, mp.a(cyu.fI, "_ns")).a(ml.b, ml.a.b))
                     .a(false, true, true, true, false, mk.a().a(ml.c, mp.a(cyu.fI, "_nse")))
                     .a(false, true, false, true, true, mk.a().a(ml.c, mp.a(cyu.fI, "_nse")).a(ml.b, ml.a.b))
                     .a(false, false, true, true, true, mk.a().a(ml.c, mp.a(cyu.fI, "_nse")).a(ml.b, ml.a.c))
                     .a(false, true, true, false, true, mk.a().a(ml.c, mp.a(cyu.fI, "_nse")).a(ml.b, ml.a.d))
                     .a(false, true, true, true, true, mk.a().a(ml.c, mp.a(cyu.fI, "_nsew")))
                     .a(true, false, false, false, false, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_ns")))
                     .a(true, false, true, false, false, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_n")))
                     .a(true, false, false, true, false, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_n")).a(ml.b, ml.a.c))
                     .a(true, true, false, false, false, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_n")).a(ml.b, ml.a.b))
                     .a(true, false, false, false, true, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_n")).a(ml.b, ml.a.d))
                     .a(true, true, true, false, false, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_ne")))
                     .a(true, true, false, true, false, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_ne")).a(ml.b, ml.a.b))
                     .a(true, false, false, true, true, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_ne")).a(ml.b, ml.a.c))
                     .a(true, false, true, false, true, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_ne")).a(ml.b, ml.a.d))
                     .a(true, false, true, true, false, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_ns")))
                     .a(true, true, false, false, true, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_ns")).a(ml.b, ml.a.b))
                     .a(true, true, true, true, false, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_nse")))
                     .a(true, true, false, true, true, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_nse")).a(ml.b, ml.a.b))
                     .a(true, false, true, true, true, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_nse")).a(ml.b, ml.a.c))
                     .a(true, true, true, false, true, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_nse")).a(ml.b, ml.a.d))
                     .a(true, true, true, true, true, mk.a().a(ml.c, mp.a(cyu.fI, "_attached_nsew")))
               )
         );
   }

   private void as() {
      this.d(cyu.fH);
      this.b.accept(mh.a(cyu.fH).a(mi.a(dlz.a, dlz.w).a(($$0, $$1) -> mk.a().a(ml.c, ms.a(cyu.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aiy a(int $$0, String $$1, ms $$2) {
      switch ($$0) {
         case 1:
            return mr.bl.a(mp.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return mr.bm.a(mp.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return mr.bn.a(mp.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return mr.bo.a(mp.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private aiy a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", ms.b(ms.G(cyu.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ms.b(ms.a(cyu.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ms.b(ms.a(cyu.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void at() {
      this.a(cpg.ko);
      this.b.accept(mh.a(cyu.mf).a(mi.a(dlz.aD, dlz.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void au() {
      this.a(cpg.kp);
      Function<Integer, aiy> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ms $$2 = ms.a($$1);
         return mr.bw.a(cyu.mg, $$1, $$2, this.c);
      };
      this.b.accept(mh.a(cyu.mg).a(mi.a(dfz.c).a($$1 -> mk.a().a(ml.c, $$0.apply($$1)))));
   }

   private void F(cys $$0) {
      this.d($$0);
      aiy $$1 = mp.a($$0);
      mg $$2 = mg.a($$0);
      mf.c $$3 = ac.a(mf.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dma, Function<aiy, mk>> $$4 : a) {
         dma $$5 = (dma)$$4.getFirst();
         Function<aiy, mk> $$6 = (Function<aiy, mk>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(mf.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void av() {
      aiy $$0 = ms.a(cyu.qU, "_bottom");
      ms $$1 = new ms().a(mt.e, $$0).a(mt.f, ms.a(cyu.qU, "_top")).a(mt.i, ms.a(cyu.qU, "_side"));
      ms $$2 = new ms().a(mt.e, $$0).a(mt.f, ms.a(cyu.qU, "_top_bloom")).a(mt.i, ms.a(cyu.qU, "_side_bloom"));
      aiy $$3 = mr.n.a(cyu.qU, "", $$1, this.c);
      aiy $$4 = mr.n.a(cyu.qU, "_bloom", $$2, this.c);
      this.b.accept(mh.a(cyu.qU).a(mi.a(dlz.E).a($$2x -> mk.a().a(ml.c, $$2x ? $$4 : $$3))));
      this.a(cpg.gi, $$3);
   }

   private void aw() {
      cys $$0 = cyu.cm;
      aiy $$1 = mp.a($$0);
      mg $$2 = mg.a($$0);
      Map.of(ie.c, ml.a.a, ie.f, ml.a.b, ie.d, ml.a.c, ie.e, ml.a.d).forEach(($$2x, $$3) -> {
         mf.c $$4 = mf.a().a(dlz.R, $$2x);
         $$2.a($$4, mk.a().a(ml.c, $$1).a(ml.b, $$3).a(ml.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mp.a($$0, "_inventory"));
      i.clear();
   }

   private void a(mg $$0, mf.c $$1, ml.a $$2) {
      List.of(Pair.of(dlz.bp, mr.aM), Pair.of(dlz.bq, mr.aN), Pair.of(dlz.br, mr.aO), Pair.of(dlz.bs, mr.aP), Pair.of(dlz.bt, mr.aQ), Pair.of(dlz.bu, mr.aR))
         .forEach($$3 -> {
            dma $$4 = (dma)$$3.getFirst();
            mq $$5 = (mq)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(mg $$0, mf.c $$1, ml.a $$2, dma $$3, mq $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ms $$7 = new ms().a(mt.b, ms.a(cyu.cm, $$6));
      mb.d $$8 = new mb.d($$4, $$6);
      aiy $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cyu.cm, $$6, $$7, this.c));
      $$0.a(mf.a($$1, mf.a().a($$3, $$5)), mk.a().a(ml.c, $$9).a(ml.b, $$2));
   }

   private void ax() {
      this.b.accept(c(cyu.kJ, mr.c.a(cyu.kJ, ms.b(mp.a("magma")), this.c)));
   }

   private void G(cys $$0) {
      this.b($$0, mu.q);
      mr.bD.a(mp.a($$0.j()), ms.u($$0), this.c);
   }

   private void b(cys $$0, cys $$1, mb.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(cys $$0, cys $$1) {
      mr.bE.a(mp.a($$0.j()), ms.u($$1), this.c);
   }

   private void ay() {
      aiy $$0 = mp.a(cyu.b);
      aiy $$1 = mp.a(cyu.b, "_mirrored");
      this.b.accept(a(cyu.eN, $$0, $$1));
      this.a(cyu.eN, $$0);
   }

   private void az() {
      aiy $$0 = mp.a(cyu.sJ);
      aiy $$1 = mp.a(cyu.sJ, "_mirrored");
      this.b.accept(a(cyu.td, $$0, $$1).a(f()));
      this.a(cyu.td, $$0);
   }

   private void n(cys $$0, cys $$1) {
      this.a($$0, mb.e.b);
      ms $$2 = ms.d(ms.a($$0, "_pot"));
      aiy $$3 = mb.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aA() {
      aiy $$0 = ms.a(cyu.pl, "_bottom");
      aiy $$1 = ms.a(cyu.pl, "_top_off");
      aiy $$2 = ms.a(cyu.pl, "_top");
      aiy[] $$3 = new aiy[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ms $$5 = new ms().a(mt.e, $$0).a(mt.f, $$4 == 0 ? $$1 : $$2).a(mt.i, ms.a(cyu.pl, "_side" + $$4));
         $$3[$$4] = mr.n.a(cyu.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mh.a(cyu.pl).a(mi.a(dlz.aZ).a($$1x -> mk.a().a(ml.c, $$3[$$1x]))));
      this.a(cpg.wJ, $$3[0]);
   }

   private mk a(ih $$0, mk $$1) {
      switch ($$0) {
         case b:
            return $$1.a(ml.a, ml.a.b);
         case c:
            return $$1.a(ml.a, ml.a.b).a(ml.b, ml.a.c);
         case d:
            return $$1.a(ml.a, ml.a.b).a(ml.b, ml.a.d);
         case a:
            return $$1.a(ml.a, ml.a.b).a(ml.b, ml.a.b);
         case f:
            return $$1.a(ml.a, ml.a.d).a(ml.b, ml.a.c);
         case g:
            return $$1.a(ml.a, ml.a.d);
         case h:
            return $$1.a(ml.a, ml.a.d).a(ml.b, ml.a.b);
         case e:
            return $$1.a(ml.a, ml.a.d).a(ml.b, ml.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(ml.b, ml.a.c);
         case i:
            return $$1.a(ml.b, ml.a.d);
         case j:
            return $$1.a(ml.b, ml.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aB() {
      aiy $$0 = ms.a(cyu.pb, "_top");
      aiy $$1 = ms.a(cyu.pb, "_bottom");
      aiy $$2 = ms.a(cyu.pb, "_side");
      aiy $$3 = ms.a(cyu.pb, "_lock");
      ms $$4 = new ms().a(mt.o, $$2).a(mt.m, $$2).a(mt.l, $$2).a(mt.c, $$0).a(mt.j, $$0).a(mt.k, $$1).a(mt.n, $$3);
      aiy $$5 = mr.b.a(cyu.pb, $$4, this.c);
      this.b.accept(mh.a(cyu.pb, mk.a().a(ml.c, $$5)).a(mi.a(dlz.T).a($$0x -> this.a($$0x, mk.a()))));
   }

   private void aC() {
      cys $$0 = cyu.n;
      aiy $$1 = mp.a($$0);
      mu $$2 = mu.a.get($$0);
      cys $$3 = cyu.jH;
      aiy $$4 = mr.ab.a($$3, $$2.b(), this.c);
      aiy $$5 = mr.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ki.a().filter(kj::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cyu.rf).a(ki.w).a(cyu.rf, cyu.rD).a(cyu.rj, cyu.rn).a(ki.y);
      this.h(cyu.re).a(ki.A).a(cyu.re, cyu.rC).a(cyu.ri, cyu.rm).a(ki.C);
      this.h(cyu.rd).a(ki.E).a(cyu.rd, cyu.rB).a(cyu.rh, cyu.rl).a(ki.G);
      this.h(cyu.rc).a(ki.I).a(cyu.rc, cyu.rA).a(cyu.rg, cyu.rk).a(ki.K);
      this.w(cyu.sk);
      this.w(cyu.sl);
      this.w(cyu.sm);
      this.w(cyu.sn);
      this.i(cyu.sk, cyu.so);
      this.i(cyu.sl, cyu.sp);
      this.i(cyu.sm, cyu.sq);
      this.i(cyu.sn, cyu.sr);
      this.m(cyu.a);
      this.c(cyu.nc, cyu.a);
      this.c(cyu.nb, cyu.a);
      this.m(cyu.fO);
      this.m(cyu.dQ);
      this.c(cyu.nd, cyu.G);
      this.m(cyu.fA);
      this.m(cyu.me);
      this.m(cyu.fr);
      this.m(cyu.fR);
      this.a(cpg.ua);
      this.m(cyu.pg);
      this.m(cyu.G);
      this.m(cyu.H);
      this.m(cyu.hV);
      this.a(cpg.fR);
      this.o(cyu.pM, cyu.qd);
      this.o(cyu.pN, cyu.qe);
      this.o(cyu.pO, cyu.qf);
      this.o(cyu.pP, cyu.qg);
      this.o(cyu.pQ, cyu.qh);
      this.o(cyu.pR, cyu.qi);
      this.o(cyu.pS, cyu.qj);
      this.o(cyu.pT, cyu.qk);
      this.o(cyu.pU, cyu.ql);
      this.o(cyu.pV, cyu.qm);
      this.o(cyu.pW, cyu.qn);
      this.o(cyu.pX, cyu.qo);
      this.o(cyu.pY, cyu.qp);
      this.o(cyu.pZ, cyu.qq);
      this.o(cyu.qa, cyu.qr);
      this.o(cyu.qb, cyu.qs);
      this.o(cyu.pL, cyu.qc);
      this.m(cyu.na);
      this.m(cyu.gs);
      this.m(cyu.qP);
      this.m(cyu.sx);
      this.s(cyu.sy);
      this.s(cyu.sz);
      this.t(cyu.ti);
      this.t(cyu.tj);
      this.ai();
      this.g(cyu.sC, cyu.sA);
      this.p(cyu.sB);
      this.a(cyu.hW, cpg.hA);
      this.a(cpg.hA);
      this.aD();
      this.a(cyu.kN, cpg.ja);
      this.a(cpg.ja);
      this.f(cyu.bQ, ms.a(cyu.by, "_side"));
      this.a(cyu.R);
      this.a(cyu.S);
      this.a(cyu.iB);
      this.a(cyu.cx);
      this.a(cyu.cy);
      this.a(cyu.cz);
      this.a(cyu.fE);
      this.a(cyu.fF);
      this.a(cyu.fJ);
      this.a(cyu.N);
      this.a(cyu.T);
      this.a(cyu.O);
      this.a(cyu.ch);
      this.a(cyu.P);
      this.a(cyu.Q);
      this.a(cyu.ci);
      this.b(cyu.pj, mu.d);
      this.a(cyu.pi);
      this.a(cyu.aR);
      this.a(cyu.aS);
      this.a(cyu.aT);
      this.a(cyu.hb);
      this.a(cyu.dI);
      this.a(cyu.dJ);
      this.a(cyu.ha);
      this.a(cyu.pC);
      this.a(cyu.mW);
      this.a(cyu.dR);
      this.a(cyu.k);
      this.a(cyu.pk);
      this.a(cyu.fz);
      this.a(cyu.ec);
      this.a(cyu.L);
      this.a(cyu.ph);
      this.a(cyu.dO);
      this.b(cyu.dT, mu.g);
      this.b(cyu.pq, mu.d);
      this.b(cyu.fa, mu.d);
      this.m(cyu.ac);
      this.m(cyu.ga);
      this.a(cyu.kK);
      this.a(cyu.aY);
      this.a(cyu.iC);
      this.a(cyu.co);
      this.a(cyu.pK);
      this.a(cyu.ii);
      this.a(cyu.oy);
      this.a(cyu.dW);
      this.a(cyu.dX);
      this.b(cyu.ct, mu.b);
      this.a(cyu.aO);
      this.b(cyu.bw, mu.v);
      this.a(cpg.cR);
      this.b(cyu.ck, mu.f);
      this.b(cyu.pd, mu.d);
      this.a(cyu.op);
      this.a(cyu.aP);
      this.a(cyu.qt);
      this.a(cyu.qu);
      this.a(cyu.qN);
      this.a(cyu.su);
      this.a(cyu.tf);
      this.a(cyu.tg);
      this.a(cyu.th);
      this.e(cyu.qS);
      this.aC();
      this.a(cyu.ra);
      this.a(cyu.rb);
      this.a(cyu.qW);
      this.a(cyu.qX);
      this.a(cyu.qY);
      this.a(cyu.qZ);
      this.k(cyu.qW, cyu.rw);
      this.k(cyu.qX, cyu.ry);
      this.k(cyu.qY, cyu.rx);
      this.k(cyu.qZ, cyu.rz);
      this.i(cyu.rM);
      this.i(cyu.rN);
      this.i(cyu.rP);
      this.i(cyu.rO);
      this.a(cyu.rM, cyu.rQ);
      this.a(cyu.rN, cyu.rR);
      this.a(cyu.rP, cyu.rT);
      this.a(cyu.rO, cyu.rS);
      this.k(cyu.rU);
      this.k(cyu.rV);
      this.k(cyu.rX);
      this.k(cyu.rW);
      this.b(cyu.rU, cyu.rY);
      this.b(cyu.rV, cyu.rZ);
      this.b(cyu.rX, cyu.sb);
      this.b(cyu.rW, cyu.sa);
      this.a(cyu.sc);
      this.a(cyu.sd);
      this.a(cyu.se);
      this.a(cyu.sf);
      this.k(cyu.sc, cyu.sg);
      this.k(cyu.sd, cyu.sh);
      this.k(cyu.se, cyu.si);
      this.k(cyu.sf, cyu.sj);
      this.j(cyu.gW, cyu.ch);
      this.j(cyu.gX, cyu.ci);
      this.G();
      this.r();
      this.aw();
      this.v();
      this.w();
      this.a(cyu.og, cyu.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(cyu.kt);
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
      this.ah();
      this.ak();
      this.aj();
      this.al();
      this.am();
      this.y();
      this.an();
      this.ao();
      this.ap();
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.au();
      this.F(cyu.ff);
      this.F(cyu.fg);
      this.F(cyu.qT);
      this.ax();
      this.aB();
      this.ae();
      this.af();
      this.ag();
      this.X();
      this.O();
      this.N();
      this.ad();
      this.E(cyu.cO);
      this.d(cyu.cO);
      this.E(cyu.oa);
      this.g();
      this.E(cyu.sE);
      this.l(cyu.cp, cyu.cq);
      this.l(cyu.ea, cyu.eb);
      this.a(cyu.cA, cyu.n, ms::c);
      this.a(cyu.nY, cyu.p, ms::d);
      this.y(cyu.ow);
      this.y(cyu.on);
      this.v(cyu.aU);
      this.v(cyu.hi);
      this.C();
      this.D(cyu.oe);
      this.D(cyu.of);
      this.e(cyu.eX, mp.a(cyu.eX));
      this.a(cyu.dY, mu.d);
      this.a(cyu.dZ, mu.d);
      this.a(cyu.te);
      this.a(cyu.kM, mu.d);
      this.f(cyu.j);
      this.f(cyu.sH);
      this.f(cyu.I);
      this.g(cyu.J);
      this.g(cyu.M);
      this.f(cyu.K);
      this.e(cyu.F);
      this.b(cyu.to, mu.f);
      this.a(cyu.ij, mu.d, mu.e);
      this.a(cyu.kx, mu.w, mu.x);
      this.a(cyu.hf, mu.w, mu.x);
      this.a(cyu.tk, mu.d, mu.e);
      this.a(cyu.tl, mu.d, mu.e);
      this.a(cyu.tm, mu.d, mu.e);
      this.c(cyu.nT, mu.i);
      this.z();
      this.a(cyu.pe, ms::A);
      this.a(cyu.pf, ms::C);
      this.a(cyu.kD, dlz.as, 0, 1, 2, 3);
      this.a(cyu.gt, dlz.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cyu.fq, dlz.as, 0, 1, 1, 2);
      this.a(cyu.gu, dlz.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cyu.cB, dlz.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cyu.kA, mb.e.b, dlz.aq, 0, 1);
      this.i();
      this.h();
      this.a(mp.a("decorated_pot"), cyu.iA).b(cyu.tp);
      this.a(mp.a("banner"), cyu.n)
         .a(mr.bF, cyu.iJ, cyu.iK, cyu.iL, cyu.iM, cyu.iN, cyu.iO, cyu.iP, cyu.iQ, cyu.iR, cyu.iS, cyu.iT, cyu.iU, cyu.iV, cyu.iW, cyu.iX, cyu.iY)
         .b(cyu.iZ, cyu.ja, cyu.jb, cyu.jc, cyu.jd, cyu.je, cyu.jf, cyu.jg, cyu.jh, cyu.ji, cyu.jj, cyu.jk, cyu.jl, cyu.jm, cyu.jn, cyu.jo);
      this.a(mp.a("bed"), cyu.n)
         .b(cyu.aZ, cyu.ba, cyu.bb, cyu.bc, cyu.bd, cyu.be, cyu.bf, cyu.bg, cyu.bh, cyu.bi, cyu.bj, cyu.bk, cyu.bl, cyu.bm, cyu.bn, cyu.bo);
      this.m(cyu.aZ, cyu.bA);
      this.m(cyu.ba, cyu.bB);
      this.m(cyu.bb, cyu.bC);
      this.m(cyu.bc, cyu.bD);
      this.m(cyu.bd, cyu.bE);
      this.m(cyu.be, cyu.bF);
      this.m(cyu.bf, cyu.bG);
      this.m(cyu.bg, cyu.bH);
      this.m(cyu.bh, cyu.bI);
      this.m(cyu.bi, cyu.bJ);
      this.m(cyu.bj, cyu.bK);
      this.m(cyu.bk, cyu.bL);
      this.m(cyu.bl, cyu.bM);
      this.m(cyu.bm, cyu.bN);
      this.m(cyu.bn, cyu.bO);
      this.m(cyu.bo, cyu.bP);
      this.a(mp.a("skull"), cyu.dW)
         .a(mr.bG, cyu.gM, cyu.gK, cyu.gI, cyu.gE, cyu.gG, cyu.gQ)
         .a(cyu.gO)
         .b(cyu.gN, cyu.gP, cyu.gL, cyu.gJ, cyu.gF, cyu.gH, cyu.gR);
      this.G(cyu.kP);
      this.G(cyu.kQ);
      this.G(cyu.kR);
      this.G(cyu.kS);
      this.G(cyu.kT);
      this.G(cyu.kU);
      this.G(cyu.kV);
      this.G(cyu.kW);
      this.G(cyu.kX);
      this.G(cyu.kY);
      this.G(cyu.kZ);
      this.G(cyu.la);
      this.G(cyu.lb);
      this.G(cyu.lc);
      this.G(cyu.ld);
      this.G(cyu.le);
      this.G(cyu.lf);
      this.b(cyu.mX, mu.q);
      this.c(cyu.mX);
      this.a(mp.a("chest"), cyu.n).b(cyu.cv, cyu.gV);
      this.a(mp.a("ender_chest"), cyu.co).b(cyu.fG);
      this.f(cyu.fx, cyu.co).a(cyu.fx, cyu.kF);
      this.a(cyu.aM);
      this.a(cyu.aN);
      this.a(cyu.lw);
      this.a(cyu.lx);
      this.a(cyu.ly);
      this.a(cyu.lz);
      this.a(cyu.lA);
      this.a(cyu.lB);
      this.a(cyu.lC);
      this.a(cyu.lD);
      this.a(cyu.lE);
      this.a(cyu.lF);
      this.a(cyu.lG);
      this.a(cyu.lH);
      this.a(cyu.lI);
      this.a(cyu.lJ);
      this.a(cyu.lK);
      this.a(cyu.lL);
      this.a(mu.a, cyu.lM, cyu.lN, cyu.lO, cyu.lP, cyu.lQ, cyu.lR, cyu.lS, cyu.lT, cyu.lU, cyu.lV, cyu.lW, cyu.lX, cyu.lY, cyu.lZ, cyu.ma, cyu.mb);
      this.a(cyu.iA);
      this.a(cyu.hj);
      this.a(cyu.hk);
      this.a(cyu.hl);
      this.a(cyu.hm);
      this.a(cyu.hn);
      this.a(cyu.ho);
      this.a(cyu.hp);
      this.a(cyu.hq);
      this.a(cyu.hr);
      this.a(cyu.hs);
      this.a(cyu.ht);
      this.a(cyu.hu);
      this.a(cyu.hv);
      this.a(cyu.hw);
      this.a(cyu.hx);
      this.a(cyu.hy);
      this.a(cyu.qO);
      this.h(cyu.aQ, cyu.eY);
      this.h(cyu.ei, cyu.hz);
      this.h(cyu.ej, cyu.hA);
      this.h(cyu.ek, cyu.hB);
      this.h(cyu.el, cyu.hC);
      this.h(cyu.em, cyu.hD);
      this.h(cyu.en, cyu.hE);
      this.h(cyu.eo, cyu.hF);
      this.h(cyu.ep, cyu.hG);
      this.h(cyu.eq, cyu.hH);
      this.h(cyu.er, cyu.hI);
      this.h(cyu.es, cyu.hJ);
      this.h(cyu.et, cyu.hK);
      this.h(cyu.eu, cyu.hL);
      this.h(cyu.ev, cyu.hM);
      this.h(cyu.ew, cyu.hN);
      this.h(cyu.ex, cyu.hO);
      this.b(mu.o, cyu.lg, cyu.lh, cyu.li, cyu.lj, cyu.lk, cyu.ll, cyu.lm, cyu.ln, cyu.lo, cyu.lp, cyu.lq, cyu.lr, cyu.ls, cyu.lt, cyu.lu, cyu.lv);
      this.g(cyu.bA, cyu.ik);
      this.g(cyu.bB, cyu.il);
      this.g(cyu.bC, cyu.im);
      this.g(cyu.bD, cyu.in);
      this.g(cyu.bE, cyu.io);
      this.g(cyu.bF, cyu.ip);
      this.g(cyu.bG, cyu.iq);
      this.g(cyu.bH, cyu.ir);
      this.g(cyu.bI, cyu.is);
      this.g(cyu.bJ, cyu.it);
      this.g(cyu.bK, cyu.iu);
      this.g(cyu.bL, cyu.iv);
      this.g(cyu.bM, cyu.iw);
      this.g(cyu.bN, cyu.ix);
      this.g(cyu.bO, cyu.iy);
      this.g(cyu.bP, cyu.iz);
      this.a(cyu.sI);
      this.a(cyu.eL);
      this.a(cyu.bu, cyu.gb, mb.e.a);
      this.a(cyu.bR, cyu.gc, mb.e.b);
      this.a(cyu.bT, cyu.gd, mb.e.b);
      this.a(cyu.bU, cyu.ge, mb.e.b);
      this.a(cyu.bV, cyu.gf, mb.e.b);
      this.a(cyu.bW, cyu.gg, mb.e.b);
      this.a(cyu.bX, cyu.gh, mb.e.b);
      this.a(cyu.bY, cyu.gi, mb.e.b);
      this.a(cyu.bZ, cyu.gj, mb.e.b);
      this.a(cyu.ca, cyu.gk, mb.e.b);
      this.a(cyu.cb, cyu.gl, mb.e.b);
      this.a(cyu.cc, cyu.gm, mb.e.b);
      this.a(cyu.ce, cyu.gn, mb.e.b);
      this.a(cyu.cd, cyu.go, mb.e.b);
      this.a(cyu.cg, cyu.gp, mb.e.b);
      this.a(cyu.cf, cyu.gq, mb.e.b);
      this.a(cyu.bv, cyu.gr, mb.e.b);
      this.a(cyu.bS, cyu.fS, mb.e.b);
      this.H();
      this.u(cyu.eT);
      this.u(cyu.eU);
      this.u(cyu.eV);
      this.a(cyu.bt, mb.e.a);
      this.b(cyu.dS, mb.e.a);
      this.a(cpg.dI);
      this.b(cyu.mc, cyu.md, mb.e.b);
      this.a(cpg.dJ);
      this.c(cyu.md);
      this.b(cyu.sG, mb.e.b);
      this.c(cyu.sG);
      this.c(cyu.sw);
      this.b(cyu.oz, cyu.oA, mb.e.b);
      this.b(cyu.oB, cyu.oC, mb.e.b);
      this.a(cyu.oz, "_plant");
      this.c(cyu.oA);
      this.a(cyu.oB, "_plant");
      this.c(cyu.oC);
      this.a(cyu.mY, mb.e.a, ms.c(ms.a(cyu.mZ, "_stage0")));
      this.m();
      this.a(cyu.bs, mb.e.b);
      this.c(cyu.iE, mb.e.b);
      this.c(cyu.iF, mb.e.b);
      this.c(cyu.iG, mb.e.b);
      this.c(cyu.iH, mb.e.a);
      this.c(cyu.iI, mb.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cyu.mw, cyu.mr, cyu.mm, cyu.mh, cyu.mG, cyu.mB, cyu.mQ, cyu.mL);
      this.a(cyu.mx, cyu.ms, cyu.mn, cyu.mi, cyu.mH, cyu.mC, cyu.mR, cyu.mM);
      this.a(cyu.my, cyu.mt, cyu.mo, cyu.mj, cyu.mI, cyu.mD, cyu.mS, cyu.mN);
      this.a(cyu.mz, cyu.mu, cyu.mp, cyu.mk, cyu.mJ, cyu.mE, cyu.mT, cyu.mO);
      this.a(cyu.mA, cyu.mv, cyu.mq, cyu.ml, cyu.mK, cyu.mF, cyu.mU, cyu.mP);
      this.e(cyu.fe, cyu.fc);
      this.e(cyu.fd, cyu.fb);
      this.l(cyu.ab).c(cyu.ab).a(cyu.av);
      this.l(cyu.am).c(cyu.am).a(cyu.aD);
      this.a(cyu.am, cyu.dj, cyu.ds);
      this.b(cyu.aL, mu.s);
      this.l(cyu.Y).c(cyu.Y).a(cyu.as);
      this.l(cyu.ai).c(cyu.ai).a(cyu.aA);
      this.a(cyu.ai, cyu.dd, cyu.do);
      this.a(cyu.B, cyu.fX, mb.e.b);
      this.b(cyu.aI, mu.s);
      this.l(cyu.Z).d(cyu.Z).a(cyu.at);
      this.l(cyu.aj).d(cyu.aj).a(cyu.aB);
      this.a(cyu.aj, cyu.de, cyu.dp);
      this.a(cyu.C, cyu.fY, mb.e.b);
      this.b(cyu.aJ, mu.s);
      this.l(cyu.W).c(cyu.W).a(cyu.aq);
      this.l(cyu.ag).c(cyu.ag).a(cyu.ay);
      this.a(cyu.ag, cyu.dc, cyu.dn);
      this.a(cyu.z, cyu.fV, mb.e.b);
      this.b(cyu.aG, mu.s);
      this.l(cyu.U).c(cyu.U).a(cyu.ao);
      this.l(cyu.al).c(cyu.al).a(cyu.aw);
      this.a(cyu.al, cyu.da, cyu.dl);
      this.a(cyu.x, cyu.fT, mb.e.b);
      this.b(cyu.aE, mu.s);
      this.l(cyu.V).c(cyu.V).a(cyu.ap);
      this.l(cyu.af).c(cyu.af).a(cyu.ax);
      this.a(cyu.af, cyu.db, cyu.dm);
      this.a(cyu.y, cyu.fU, mb.e.b);
      this.b(cyu.aF, mu.s);
      this.l(cyu.aa).c(cyu.aa).a(cyu.au);
      this.l(cyu.ak).c(cyu.ak).a(cyu.aC);
      this.a(cyu.ak, cyu.dg, cyu.dr);
      this.a(cyu.D, cyu.fZ, mb.e.b);
      this.b(cyu.aK, mu.s);
      this.l(cyu.X).c(cyu.X).a(cyu.ar);
      this.l(cyu.ah).c(cyu.ah).a(cyu.az);
      this.a(cyu.ah, cyu.df, cyu.dq);
      this.a(cyu.A, cyu.fW, mb.e.b);
      this.b(cyu.aH, mu.s);
      this.l(cyu.os).b(cyu.os).a(cyu.ou);
      this.l(cyu.ot).b(cyu.ot).a(cyu.ov);
      this.a(cyu.ot, cyu.dh, cyu.dt);
      this.a(cyu.ox, cyu.pm, mb.e.b);
      this.n(cyu.oD, cyu.po);
      this.l(cyu.oj).b(cyu.oj).a(cyu.ol);
      this.l(cyu.ok).b(cyu.ok).a(cyu.om);
      this.a(cyu.ok, cyu.di, cyu.du);
      this.a(cyu.oo, cyu.pn, mb.e.b);
      this.n(cyu.oq, cyu.pp);
      this.l(cyu.ae).d(cyu.ae);
      this.l(cyu.an).d(cyu.an);
      this.a(cyu.v, cyu.dk, cyu.dv);
      this.b(cyu.or, mb.e.b);
      this.a(cpg.dF);
      this.i(cyu.dy);
      this.k(cyu.hY);
      this.u();
      this.n(cyu.cP);
      this.o(cyu.bp);
      this.o(cyu.bq);
      this.o(cyu.hh);
      this.t();
      this.q(cyu.fN);
      this.q(cyu.kG);
      this.q(cyu.kH);
      this.r(cyu.gS);
      this.r(cyu.gT);
      this.r(cyu.gU);
      this.o();
      this.p();
      this.d(cyu.cD, mu.h);
      this.d(cyu.nW, mu.h);
      this.d(cyu.nV, mu.i);
      this.s();
      this.aA();
      this.av();
      this.k(cyu.eK, cyu.eS);
      this.k(cyu.m, cyu.eO);
      this.k(cyu.eJ, cyu.eR);
      this.k(cyu.eI, cyu.eQ);
      this.ay();
      this.k(cyu.eH, cyu.eP);
      this.az();
      cqi.h().forEach($$0 -> this.a($$0, mp.b("template_spawn_egg")));
   }

   private void aD() {
      this.c(cyu.hX);
      mi.a<Integer> $$0 = mi.a(dlz.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aiy $$3 = ms.a(cpg.hB, $$2);
         $$0.a($$1, mk.a().a(ml.c, mr.aa.a(cyu.hX, $$2, ms.h($$3), this.c)));
         mr.bx.a(mp.a(cpg.hB, $$2), ms.k($$3), this.c);
      }

      this.b.accept(mh.a(cyu.hX).a($$0));
   }

   private void o(cys $$0, cys $$1) {
      this.a($$0.j());
      ms $$2 = ms.b(ms.G($$0));
      ms $$3 = ms.b(ms.a($$0, "_lit"));
      aiy $$4 = mr.bH.a($$0, "_one_candle", $$2, this.c);
      aiy $$5 = mr.bI.a($$0, "_two_candles", $$2, this.c);
      aiy $$6 = mr.bJ.a($$0, "_three_candles", $$2, this.c);
      aiy $$7 = mr.bK.a($$0, "_four_candles", $$2, this.c);
      aiy $$8 = mr.bH.a($$0, "_one_candle_lit", $$3, this.c);
      aiy $$9 = mr.bI.a($$0, "_two_candles_lit", $$3, this.c);
      aiy $$10 = mr.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      aiy $$11 = mr.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            mh.a($$0)
               .a(
                  mi.a(dlz.az, dlz.r)
                     .a(1, false, mk.a().a(ml.c, $$4))
                     .a(2, false, mk.a().a(ml.c, $$5))
                     .a(3, false, mk.a().a(ml.c, $$6))
                     .a(4, false, mk.a().a(ml.c, $$7))
                     .a(1, true, mk.a().a(ml.c, $$8))
                     .a(2, true, mk.a().a(ml.c, $$9))
                     .a(3, true, mk.a().a(ml.c, $$10))
                     .a(4, true, mk.a().a(ml.c, $$11))
               )
         );
      aiy $$12 = mr.bL.a($$1, ms.a($$0, false), this.c);
      aiy $$13 = mr.bL.a($$1, "_lit", ms.a($$0, true), this.c);
      this.b.accept(mh.a($$1).a(a(dlz.r, $$13, $$12)));
   }

   class a {
      private final aiy b;

      public a(aiy $$0, cys $$1) {
         this.b = mr.aa.a($$0, ms.u($$1), mb.this.c);
      }

      public mb.a a(cys... $$0) {
         for (cys $$1 : $$0) {
            mb.this.b.accept(mb.c($$1, this.b));
         }

         return this;
      }

      public mb.a b(cys... $$0) {
         for (cys $$1 : $$0) {
            mb.this.c($$1);
         }

         return this.a($$0);
      }

      public mb.a a(mq $$0, cys... $$1) {
         for (cys $$2 : $$1) {
            $$0.a(mp.a($$2.j()), ms.u($$2), mb.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final ms b;
      private final Map<mq, aiy> c = Maps.newHashMap();
      @Nullable
      private kj d;
      @Nullable
      private aiy e;
      private final Set<cys> f = new HashSet<>();

      public b(ms $$0) {
         this.b = $$0;
      }

      public mb.b a(cys $$0, mq $$1) {
         this.e = $$1.a($$0, this.b, mb.this.c);
         if (mb.this.f.containsKey($$0)) {
            mb.this.b.accept(mb.this.f.get($$0).create($$0, this.e, this.b, mb.this.c));
         } else {
            mb.this.b.accept(mb.c($$0, this.e));
         }

         return this;
      }

      public mb.b a(cys $$0, cys $$1) {
         aiy $$2 = mp.a($$0);
         mb.this.b.accept(mb.c($$1, $$2));
         mb.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public mb.b a(cys $$0) {
         aiy $$1 = mr.s.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.t.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.b($$0, $$1, $$2));
         aiy $$3 = mr.u.a($$0, this.b, mb.this.c);
         mb.this.a($$0, $$3);
         return this;
      }

      public mb.b b(cys $$0) {
         aiy $$1 = mr.M.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.N.a($$0, this.b, mb.this.c);
         aiy $$3 = mr.O.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.a($$0, $$1, $$2, $$3));
         aiy $$4 = mr.P.a($$0, this.b, mb.this.c);
         mb.this.a($$0, $$4);
         return this;
      }

      public mb.b c(cys $$0) {
         ms $$1 = ms.p($$0);
         aiy $$2 = mr.D.a($$0, $$1, mb.this.c);
         aiy $$3 = mr.E.a($$0, $$1, mb.this.c);
         aiy $$4 = mr.F.a($$0, $$1, mb.this.c);
         aiy $$5 = mr.G.a($$0, $$1, mb.this.c);
         aiy $$6 = mr.H.a($$0, $$1, mb.this.c);
         mb.this.b.accept(mb.a($$0, $$2, $$3, $$4, $$5, $$6));
         aiy $$7 = mr.I.a($$0, $$1, mb.this.c);
         mb.this.a($$0, $$7);
         return this;
      }

      public mb.b d(cys $$0) {
         aiy $$1 = mr.J.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.K.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.c($$0, $$1, $$2));
         aiy $$3 = mr.L.a($$0, this.b, mb.this.c);
         mb.this.a($$0, $$3);
         return this;
      }

      public mb.b e(cys $$0) {
         ms $$1 = ms.p($$0);
         aiy $$2 = mr.R.a($$0, $$1, mb.this.c);
         aiy $$3 = mr.Q.a($$0, $$1, mb.this.c);
         aiy $$4 = mr.T.a($$0, $$1, mb.this.c);
         aiy $$5 = mr.S.a($$0, $$1, mb.this.c);
         mb.this.b.accept(mb.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public mb.b f(cys $$0) {
         aiy $$1 = mr.V.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.U.a($$0, this.b, mb.this.c);
         aiy $$3 = mr.X.a($$0, this.b, mb.this.c);
         aiy $$4 = mr.W.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public mb.b g(cys $$0) {
         aiy $$1 = mr.Y.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.Z.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.e($$0, $$1, $$2));
         return this;
      }

      public mb.b h(cys $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cys $$1 = this.d.b().get(kj.b.r);
            aiy $$2 = mr.aa.a($$0, this.b, mb.this.c);
            mb.this.b.accept(mb.c($$0, $$2));
            mb.this.b.accept(mb.c($$1, $$2));
            mb.this.a($$0.j());
            mb.this.c($$1);
            return this;
         }
      }

      public mb.b i(cys $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aiy $$1 = this.a(mr.ab, $$0);
            aiy $$2 = this.a(mr.ac, $$0);
            mb.this.b.accept(mb.e($$0, $$1, $$2, this.e));
            mb.this.a($$0, $$1);
            return this;
         }
      }

      public mb.b j(cys $$0) {
         aiy $$1 = this.a(mr.af, $$0);
         aiy $$2 = this.a(mr.ae, $$0);
         aiy $$3 = this.a(mr.ag, $$0);
         mb.this.b.accept(mb.b($$0, $$1, $$2, $$3));
         mb.this.a($$0, $$2);
         return this;
      }

      private mb.b k(cys $$0) {
         mu $$1 = mb.this.g.getOrDefault($$0, mu.a.get($$0));
         aiy $$2 = $$1.a($$0, mb.this.c);
         mb.this.b.accept(mb.c($$0, $$2));
         return this;
      }

      private mb.b l(cys $$0) {
         mb.this.i($$0);
         return this;
      }

      private void m(cys $$0) {
         if (mb.this.e.contains($$0)) {
            mb.this.k($$0);
         } else {
            mb.this.j($$0);
         }
      }

      private aiy a(mq $$0, cys $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, mb.this.c));
      }

      public mb.b a(kj $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<mb.b, cys> $$2 = mb.h.get($$0x);
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
      me create(cys var1, aiy var2, ms var3, BiConsumer<aiy, Supplier<JsonElement>> var4);
   }

   static record d(mq a, String b) {
   }

   static enum e {
      a,
      b;

      public mq a() {
         return this == a ? mr.ap : mr.ao;
      }

      public mq b() {
         return this == a ? mr.ar : mr.aq;
      }
   }

   class f {
      private final ms b;

      public f(ms $$0) {
         this.b = $$0;
      }

      public mb.f a(cys $$0) {
         ms $$1 = this.b.c(mt.d, this.b.a(mt.i));
         aiy $$2 = mr.j.a($$0, $$1, mb.this.c);
         mb.this.b.accept(mb.d($$0, $$2));
         return this;
      }

      public mb.f b(cys $$0) {
         aiy $$1 = mr.j.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.d($$0, $$1));
         return this;
      }

      public mb.f c(cys $$0) {
         aiy $$1 = mr.j.a($$0, this.b, mb.this.c);
         aiy $$2 = mr.k.a($$0, this.b, mb.this.c);
         mb.this.b.accept(mb.d($$0, $$1, $$2));
         return this;
      }

      public mb.f d(cys $$0) {
         mb.this.b.accept(mb.a($$0, this.b, mb.this.c));
         return this;
      }
   }
}
