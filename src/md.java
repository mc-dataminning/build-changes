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

public class md {
   final Consumer<mg> b;
   final BiConsumer<ajc, Supplier<JsonElement>> c;
   private final Consumer<cpl> d;
   final List<czf> e = ImmutableList.of(czh.ey, czh.eE, czh.hY);
   final Map<czf, md.c> f = ImmutableMap.builder().put(czh.b, md::a).put(czh.sJ, md::c).put(czh.eM, md::b).build();
   final Map<czf, mw> g = ImmutableMap.builder()
      .put(czh.aV, mw.y.get(czh.aV))
      .put(czh.jp, mw.y.get(czh.jp))
      .put(czh.jS, mw.a(mu.a(czh.aV, "_top")))
      .put(czh.jU, mw.a(mu.a(czh.jp, "_top")))
      .put(czh.aX, mw.d.get(czh.aV).a($$0x -> $$0x.a(mv.i, mu.G(czh.aX))))
      .put(czh.jr, mw.d.get(czh.jp).a($$0x -> $$0x.a(mv.i, mu.G(czh.jr))))
      .put(czh.hd, mw.d.get(czh.hd))
      .put(czh.jT, mw.a(mu.a(czh.hd, "_bottom")))
      .put(czh.pr, mw.z.get(czh.pr))
      .put(czh.sJ, mw.z.get(czh.sJ))
      .put(czh.he, mw.d.get(czh.he).a($$0x -> $$0x.a(mv.i, mu.G(czh.he))))
      .put(czh.aW, mw.d.get(czh.aW).a($$0x -> {
         $$0x.a(mv.d, mu.a(czh.aV, "_top"));
         $$0x.a(mv.i, mu.G(czh.aW));
      }))
      .put(czh.jq, mw.d.get(czh.jq).a($$0x -> {
         $$0x.a(mv.d, mu.a(czh.jp, "_top"));
         $$0x.a(mv.i, mu.G(czh.jq));
      }))
      .put(czh.qM, mw.z.get(czh.qM))
      .put(czh.qH, mw.z.get(czh.qH))
      .build();
   static final Map<kl.b, BiConsumer<md.b, czf>> h = ImmutableMap.builder()
      .put(kl.b.a, md.b::a)
      .put(kl.b.e, md.b::l)
      .put(kl.b.b, md.b::k)
      .put(kl.b.c, md.b::k)
      .put(kl.b.f, md.b::c)
      .put(kl.b.g, md.b::d)
      .put(kl.b.h, md.b::e)
      .put(kl.b.i, md.b::f)
      .put(kl.b.k, md.b::h)
      .put(kl.b.l, md.b::i)
      .put(kl.b.m, md.b::j)
      .put(kl.b.n, md.b::g)
      .put(kl.b.p, md.b::m)
      .put(kl.b.q, md.b::b)
      .build();
   public static final List<Pair<dmv, Function<ajc, mm>>> a = List.of(
      Pair.of(dmu.L, (Function<ajc, mm>)$$0 -> mm.a().a(mn.c, $$0)),
      Pair.of(dmu.M, (Function<ajc, mm>)$$0 -> mm.a().a(mn.c, $$0).a(mn.b, mn.a.b).a(mn.d, true)),
      Pair.of(dmu.N, (Function<ajc, mm>)$$0 -> mm.a().a(mn.c, $$0).a(mn.b, mn.a.c).a(mn.d, true)),
      Pair.of(dmu.O, (Function<ajc, mm>)$$0 -> mm.a().a(mn.c, $$0).a(mn.b, mn.a.d).a(mn.d, true)),
      Pair.of(dmu.J, (Function<ajc, mm>)$$0 -> mm.a().a(mn.c, $$0).a(mn.a, mn.a.d).a(mn.d, true)),
      Pair.of(dmu.K, (Function<ajc, mm>)$$0 -> mm.a().a(mn.c, $$0).a(mn.a, mn.a.b).a(mn.d, true))
   );
   private static final Map<md.d, ajc> i = new HashMap<>();

   private static mg a(czf $$0, ajc $$1, mu $$2, BiConsumer<ajc, Supplier<JsonElement>> $$3) {
      ajc $$4 = mt.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static mg b(czf $$0, ajc $$1, mu $$2, BiConsumer<ajc, Supplier<JsonElement>> $$3) {
      ajc $$4 = mt.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static mg c(czf $$0, ajc $$1, mu $$2, BiConsumer<ajc, Supplier<JsonElement>> $$3) {
      ajc $$4 = mt.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public md(Consumer<mg> $$0, BiConsumer<ajc, Supplier<JsonElement>> $$1, Consumer<cpl> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(czf $$0) {
      this.d.accept($$0.l());
   }

   void a(czf $$0, ajc $$1) {
      this.c.accept(mr.a($$0.l()), new mq($$1));
   }

   private void a(cpl $$0, ajc $$1) {
      this.c.accept(mr.a($$0), new mq($$1));
   }

   void a(cpl $$0) {
      mt.bx.a(mr.a($$0), mu.b($$0), this.c);
   }

   private void d(czf $$0) {
      cpl $$1 = $$0.l();
      if ($$1 != cpt.a) {
         mt.bx.a(mr.a($$1), mu.F($$0), this.c);
      }
   }

   private void a(czf $$0, String $$1) {
      cpl $$2 = $$0.l();
      mt.bx.a(mr.a($$2), mu.k(mu.a($$0, $$1)), this.c);
   }

   private static mk b() {
      return mk.a(dmu.R).a(ih.f, mm.a().a(mn.b, mn.a.b)).a(ih.d, mm.a().a(mn.b, mn.a.c)).a(ih.e, mm.a().a(mn.b, mn.a.d)).a(ih.c, mm.a());
   }

   private static mk c() {
      return mk.a(dmu.R).a(ih.d, mm.a()).a(ih.e, mm.a().a(mn.b, mn.a.b)).a(ih.c, mm.a().a(mn.b, mn.a.c)).a(ih.f, mm.a().a(mn.b, mn.a.d));
   }

   private static mk d() {
      return mk.a(dmu.R).a(ih.f, mm.a()).a(ih.d, mm.a().a(mn.b, mn.a.b)).a(ih.e, mm.a().a(mn.b, mn.a.c)).a(ih.c, mm.a().a(mn.b, mn.a.d));
   }

   private static mk e() {
      return mk.a(dmu.P)
         .a(ih.a, mm.a().a(mn.a, mn.a.b))
         .a(ih.b, mm.a().a(mn.a, mn.a.d))
         .a(ih.c, mm.a())
         .a(ih.d, mm.a().a(mn.b, mn.a.c))
         .a(ih.e, mm.a().a(mn.b, mn.a.d))
         .a(ih.f, mm.a().a(mn.b, mn.a.b));
   }

   private static mj b(czf $$0, ajc $$1) {
      return mj.a($$0, a($$1));
   }

   private static mm[] a(ajc $$0) {
      return new mm[]{mm.a().a(mn.c, $$0), mm.a().a(mn.c, $$0).a(mn.b, mn.a.b), mm.a().a(mn.c, $$0).a(mn.b, mn.a.c), mm.a().a(mn.c, $$0).a(mn.b, mn.a.d)};
   }

   private static mj a(czf $$0, ajc $$1, ajc $$2) {
      return mj.a($$0, mm.a().a(mn.c, $$1), mm.a().a(mn.c, $$2), mm.a().a(mn.c, $$1).a(mn.b, mn.a.c), mm.a().a(mn.c, $$2).a(mn.b, mn.a.c));
   }

   private static mk a(dmv $$0, ajc $$1, ajc $$2) {
      return mk.a($$0).a(true, mm.a().a(mn.c, $$1)).a(false, mm.a().a(mn.c, $$2));
   }

   private void e(czf $$0) {
      ajc $$1 = mw.a.create($$0, this.c);
      ajc $$2 = mw.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(czf $$0) {
      ajc $$1 = mw.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(czf $$0) {
      this.b.accept(mj.a($$0).a(mk.a(dmu.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ajc $$3 = mu.a($$0, $$2);
         return mm.a().a(mn.c, mt.c.a($$0, $$2, new mu().a(mv.a, $$3), this.c));
      })));
      this.a($$0, mu.a($$0, "_0"));
   }

   static mg b(czf $$0, ajc $$1, ajc $$2) {
      return mj.a($$0)
         .a(mk.a(dmu.w).a(false, mm.a().a(mn.c, $$1)).a(true, mm.a().a(mn.c, $$2)))
         .a(
            mk.a(dmu.U, dmu.R)
               .a(dmp.a, ih.f, mm.a().a(mn.b, mn.a.b))
               .a(dmp.a, ih.e, mm.a().a(mn.b, mn.a.d))
               .a(dmp.a, ih.d, mm.a().a(mn.b, mn.a.c))
               .a(dmp.a, ih.c, mm.a())
               .a(dmp.b, ih.f, mm.a().a(mn.b, mn.a.b).a(mn.a, mn.a.b).a(mn.d, true))
               .a(dmp.b, ih.e, mm.a().a(mn.b, mn.a.d).a(mn.a, mn.a.b).a(mn.d, true))
               .a(dmp.b, ih.d, mm.a().a(mn.b, mn.a.c).a(mn.a, mn.a.b).a(mn.d, true))
               .a(dmp.b, ih.c, mm.a().a(mn.a, mn.a.b).a(mn.d, true))
               .a(dmp.c, ih.f, mm.a().a(mn.b, mn.a.d).a(mn.a, mn.a.c))
               .a(dmp.c, ih.e, mm.a().a(mn.b, mn.a.b).a(mn.a, mn.a.c))
               .a(dmp.c, ih.d, mm.a().a(mn.a, mn.a.c))
               .a(dmp.c, ih.c, mm.a().a(mn.b, mn.a.c).a(mn.a, mn.a.c))
         );
   }

   private static mk.d<ih, dna, dmz, Boolean> a(mk.d<ih, dna, dmz, Boolean> $$0, dna $$1, ajc $$2, ajc $$3, ajc $$4, ajc $$5) {
      return $$0.a(ih.f, $$1, dmz.a, false, mm.a().a(mn.c, $$2))
         .a(ih.d, $$1, dmz.a, false, mm.a().a(mn.c, $$2).a(mn.b, mn.a.b))
         .a(ih.e, $$1, dmz.a, false, mm.a().a(mn.c, $$2).a(mn.b, mn.a.c))
         .a(ih.c, $$1, dmz.a, false, mm.a().a(mn.c, $$2).a(mn.b, mn.a.d))
         .a(ih.f, $$1, dmz.b, false, mm.a().a(mn.c, $$4))
         .a(ih.d, $$1, dmz.b, false, mm.a().a(mn.c, $$4).a(mn.b, mn.a.b))
         .a(ih.e, $$1, dmz.b, false, mm.a().a(mn.c, $$4).a(mn.b, mn.a.c))
         .a(ih.c, $$1, dmz.b, false, mm.a().a(mn.c, $$4).a(mn.b, mn.a.d))
         .a(ih.f, $$1, dmz.a, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.b))
         .a(ih.d, $$1, dmz.a, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.c))
         .a(ih.e, $$1, dmz.a, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.d))
         .a(ih.c, $$1, dmz.a, true, mm.a().a(mn.c, $$3))
         .a(ih.f, $$1, dmz.b, true, mm.a().a(mn.c, $$5).a(mn.b, mn.a.d))
         .a(ih.d, $$1, dmz.b, true, mm.a().a(mn.c, $$5))
         .a(ih.e, $$1, dmz.b, true, mm.a().a(mn.c, $$5).a(mn.b, mn.a.b))
         .a(ih.c, $$1, dmz.b, true, mm.a().a(mn.c, $$5).a(mn.b, mn.a.c));
   }

   private static mg a(czf $$0, ajc $$1, ajc $$2, ajc $$3, ajc $$4, ajc $$5, ajc $$6, ajc $$7, ajc $$8) {
      return mj.a($$0).a(a(a(mk.a(dmu.R, dmu.ae, dmu.be, dmu.u), dna.b, $$1, $$2, $$3, $$4), dna.a, $$5, $$6, $$7, $$8));
   }

   static mg a(czf $$0, ajc $$1, ajc $$2, ajc $$3, ajc $$4, ajc $$5) {
      return mi.a($$0)
         .a(mm.a().a(mn.c, $$1))
         .a(mh.a().a(dmu.L, true), mm.a().a(mn.c, $$2).a(mn.d, false))
         .a(mh.a().a(dmu.M, true), mm.a().a(mn.c, $$3).a(mn.d, false))
         .a(mh.a().a(dmu.N, true), mm.a().a(mn.c, $$4).a(mn.d, false))
         .a(mh.a().a(dmu.O, true), mm.a().a(mn.c, $$5).a(mn.d, false));
   }

   static mg c(czf $$0, ajc $$1, ajc $$2) {
      return mi.a($$0)
         .a(mm.a().a(mn.c, $$1))
         .a(mh.a().a(dmu.L, true), mm.a().a(mn.c, $$2).a(mn.d, true))
         .a(mh.a().a(dmu.M, true), mm.a().a(mn.c, $$2).a(mn.b, mn.a.b).a(mn.d, true))
         .a(mh.a().a(dmu.N, true), mm.a().a(mn.c, $$2).a(mn.b, mn.a.c).a(mn.d, true))
         .a(mh.a().a(dmu.O, true), mm.a().a(mn.c, $$2).a(mn.b, mn.a.d).a(mn.d, true));
   }

   static mg a(czf $$0, ajc $$1, ajc $$2, ajc $$3) {
      return mi.a($$0)
         .a(mh.a().a(dmu.J, true), mm.a().a(mn.c, $$1))
         .a(mh.a().a(dmu.X, dnq.b), mm.a().a(mn.c, $$2).a(mn.d, true))
         .a(mh.a().a(dmu.W, dnq.b), mm.a().a(mn.c, $$2).a(mn.b, mn.a.b).a(mn.d, true))
         .a(mh.a().a(dmu.Y, dnq.b), mm.a().a(mn.c, $$2).a(mn.b, mn.a.c).a(mn.d, true))
         .a(mh.a().a(dmu.Z, dnq.b), mm.a().a(mn.c, $$2).a(mn.b, mn.a.d).a(mn.d, true))
         .a(mh.a().a(dmu.X, dnq.c), mm.a().a(mn.c, $$3).a(mn.d, true))
         .a(mh.a().a(dmu.W, dnq.c), mm.a().a(mn.c, $$3).a(mn.b, mn.a.b).a(mn.d, true))
         .a(mh.a().a(dmu.Y, dnq.c), mm.a().a(mn.c, $$3).a(mn.b, mn.a.c).a(mn.d, true))
         .a(mh.a().a(dmu.Z, dnq.c), mm.a().a(mn.c, $$3).a(mn.b, mn.a.d).a(mn.d, true));
   }

   static mg a(czf $$0, ajc $$1, ajc $$2, ajc $$3, ajc $$4, boolean $$5) {
      return mj.a($$0, mm.a().a(mn.d, $$5))
         .a(c())
         .a(
            mk.a(dmu.q, dmu.u)
               .a(false, false, mm.a().a(mn.c, $$2))
               .a(true, false, mm.a().a(mn.c, $$4))
               .a(false, true, mm.a().a(mn.c, $$1))
               .a(true, true, mm.a().a(mn.c, $$3))
         );
   }

   static mg b(czf $$0, ajc $$1, ajc $$2, ajc $$3) {
      return mj.a($$0)
         .a(
            mk.a(dmu.R, dmu.af, dmu.bi)
               .a(ih.f, dnd.b, dnn.a, mm.a().a(mn.c, $$2))
               .a(ih.e, dnd.b, dnn.a, mm.a().a(mn.c, $$2).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.d, dnd.b, dnn.a, mm.a().a(mn.c, $$2).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.c, dnd.b, dnn.a, mm.a().a(mn.c, $$2).a(mn.b, mn.a.d).a(mn.d, true))
               .a(ih.f, dnd.b, dnn.e, mm.a().a(mn.c, $$3))
               .a(ih.e, dnd.b, dnn.e, mm.a().a(mn.c, $$3).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.d, dnd.b, dnn.e, mm.a().a(mn.c, $$3).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.c, dnd.b, dnn.e, mm.a().a(mn.c, $$3).a(mn.b, mn.a.d).a(mn.d, true))
               .a(ih.f, dnd.b, dnn.d, mm.a().a(mn.c, $$3).a(mn.b, mn.a.d).a(mn.d, true))
               .a(ih.e, dnd.b, dnn.d, mm.a().a(mn.c, $$3).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.d, dnd.b, dnn.d, mm.a().a(mn.c, $$3))
               .a(ih.c, dnd.b, dnn.d, mm.a().a(mn.c, $$3).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.f, dnd.b, dnn.c, mm.a().a(mn.c, $$1))
               .a(ih.e, dnd.b, dnn.c, mm.a().a(mn.c, $$1).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.d, dnd.b, dnn.c, mm.a().a(mn.c, $$1).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.c, dnd.b, dnn.c, mm.a().a(mn.c, $$1).a(mn.b, mn.a.d).a(mn.d, true))
               .a(ih.f, dnd.b, dnn.b, mm.a().a(mn.c, $$1).a(mn.b, mn.a.d).a(mn.d, true))
               .a(ih.e, dnd.b, dnn.b, mm.a().a(mn.c, $$1).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.d, dnd.b, dnn.b, mm.a().a(mn.c, $$1))
               .a(ih.c, dnd.b, dnn.b, mm.a().a(mn.c, $$1).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.f, dnd.a, dnn.a, mm.a().a(mn.c, $$2).a(mn.a, mn.a.c).a(mn.d, true))
               .a(ih.e, dnd.a, dnn.a, mm.a().a(mn.c, $$2).a(mn.a, mn.a.c).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.d, dnd.a, dnn.a, mm.a().a(mn.c, $$2).a(mn.a, mn.a.c).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.c, dnd.a, dnn.a, mm.a().a(mn.c, $$2).a(mn.a, mn.a.c).a(mn.b, mn.a.d).a(mn.d, true))
               .a(ih.f, dnd.a, dnn.e, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.e, dnd.a, dnn.e, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.d).a(mn.d, true))
               .a(ih.d, dnd.a, dnn.e, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.c, dnd.a, dnn.e, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.d, true))
               .a(ih.f, dnd.a, dnn.d, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.d, true))
               .a(ih.e, dnd.a, dnn.d, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.d, dnd.a, dnn.d, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.c, dnd.a, dnn.d, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.d).a(mn.d, true))
               .a(ih.f, dnd.a, dnn.c, mm.a().a(mn.c, $$1).a(mn.a, mn.a.c).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.e, dnd.a, dnn.c, mm.a().a(mn.c, $$1).a(mn.a, mn.a.c).a(mn.b, mn.a.d).a(mn.d, true))
               .a(ih.d, dnd.a, dnn.c, mm.a().a(mn.c, $$1).a(mn.a, mn.a.c).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.c, dnd.a, dnn.c, mm.a().a(mn.c, $$1).a(mn.a, mn.a.c).a(mn.d, true))
               .a(ih.f, dnd.a, dnn.b, mm.a().a(mn.c, $$1).a(mn.a, mn.a.c).a(mn.d, true))
               .a(ih.e, dnd.a, dnn.b, mm.a().a(mn.c, $$1).a(mn.a, mn.a.c).a(mn.b, mn.a.c).a(mn.d, true))
               .a(ih.d, dnd.a, dnn.b, mm.a().a(mn.c, $$1).a(mn.a, mn.a.c).a(mn.b, mn.a.b).a(mn.d, true))
               .a(ih.c, dnd.a, dnn.b, mm.a().a(mn.c, $$1).a(mn.a, mn.a.c).a(mn.b, mn.a.d).a(mn.d, true))
         );
   }

   private static mg c(czf $$0, ajc $$1, ajc $$2, ajc $$3) {
      return mj.a($$0)
         .a(
            mk.a(dmu.R, dmu.af, dmu.u)
               .a(ih.c, dnd.b, false, mm.a().a(mn.c, $$2))
               .a(ih.d, dnd.b, false, mm.a().a(mn.c, $$2).a(mn.b, mn.a.c))
               .a(ih.f, dnd.b, false, mm.a().a(mn.c, $$2).a(mn.b, mn.a.b))
               .a(ih.e, dnd.b, false, mm.a().a(mn.c, $$2).a(mn.b, mn.a.d))
               .a(ih.c, dnd.a, false, mm.a().a(mn.c, $$1))
               .a(ih.d, dnd.a, false, mm.a().a(mn.c, $$1).a(mn.b, mn.a.c))
               .a(ih.f, dnd.a, false, mm.a().a(mn.c, $$1).a(mn.b, mn.a.b))
               .a(ih.e, dnd.a, false, mm.a().a(mn.c, $$1).a(mn.b, mn.a.d))
               .a(ih.c, dnd.b, true, mm.a().a(mn.c, $$3))
               .a(ih.d, dnd.b, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.c))
               .a(ih.f, dnd.b, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.b))
               .a(ih.e, dnd.b, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.d))
               .a(ih.c, dnd.a, true, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.c))
               .a(ih.d, dnd.a, true, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.a))
               .a(ih.f, dnd.a, true, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.d))
               .a(ih.e, dnd.a, true, mm.a().a(mn.c, $$3).a(mn.a, mn.a.c).a(mn.b, mn.a.b))
         );
   }

   private static mg d(czf $$0, ajc $$1, ajc $$2, ajc $$3) {
      return mj.a($$0)
         .a(
            mk.a(dmu.R, dmu.af, dmu.u)
               .a(ih.c, dnd.b, false, mm.a().a(mn.c, $$2))
               .a(ih.d, dnd.b, false, mm.a().a(mn.c, $$2))
               .a(ih.f, dnd.b, false, mm.a().a(mn.c, $$2))
               .a(ih.e, dnd.b, false, mm.a().a(mn.c, $$2))
               .a(ih.c, dnd.a, false, mm.a().a(mn.c, $$1))
               .a(ih.d, dnd.a, false, mm.a().a(mn.c, $$1))
               .a(ih.f, dnd.a, false, mm.a().a(mn.c, $$1))
               .a(ih.e, dnd.a, false, mm.a().a(mn.c, $$1))
               .a(ih.c, dnd.b, true, mm.a().a(mn.c, $$3))
               .a(ih.d, dnd.b, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.c))
               .a(ih.f, dnd.b, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.b))
               .a(ih.e, dnd.b, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.d))
               .a(ih.c, dnd.a, true, mm.a().a(mn.c, $$3))
               .a(ih.d, dnd.a, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.c))
               .a(ih.f, dnd.a, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.b))
               .a(ih.e, dnd.a, true, mm.a().a(mn.c, $$3).a(mn.b, mn.a.d))
         );
   }

   static mj c(czf $$0, ajc $$1) {
      return mj.a($$0, mm.a().a(mn.c, $$1));
   }

   private static mk f() {
      return mk.a(dmu.I).a(ih.a.b, mm.a()).a(ih.a.c, mm.a().a(mn.a, mn.a.b)).a(ih.a.a, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.b));
   }

   static mg a(czf $$0, mu $$1, BiConsumer<ajc, Supplier<JsonElement>> $$2) {
      ajc $$3 = mt.g.a($$0, $$1, $$2);
      ajc $$4 = mt.h.a($$0, $$1, $$2);
      ajc $$5 = mt.i.a($$0, $$1, $$2);
      ajc $$6 = mt.j.a($$0, $$1, $$2);
      return mj.a($$0, mm.a().a(mn.c, $$6)).a(mk.a(dmu.I).a(ih.a.a, mm.a().a(mn.c, $$3)).a(ih.a.b, mm.a().a(mn.c, $$4)).a(ih.a.c, mm.a().a(mn.c, $$5)));
   }

   static mg d(czf $$0, ajc $$1) {
      return mj.a($$0, mm.a().a(mn.c, $$1)).a(f());
   }

   private void e(czf $$0, ajc $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(czf $$0, mw.a $$1) {
      ajc $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(czf $$0, mw.a $$1) {
      ajc $$2 = $$1.create($$0, this.c);
      this.b.accept(mj.a($$0, mm.a().a(mn.c, $$2)).a(b()));
   }

   static mg d(czf $$0, ajc $$1, ajc $$2) {
      return mj.a($$0)
         .a(
            mk.a(dmu.I)
               .a(ih.a.b, mm.a().a(mn.c, $$1))
               .a(ih.a.c, mm.a().a(mn.c, $$2).a(mn.a, mn.a.b))
               .a(ih.a.a, mm.a().a(mn.c, $$2).a(mn.a, mn.a.b).a(mn.b, mn.a.b))
         );
   }

   private void a(czf $$0, mw.a $$1, mw.a $$2) {
      ajc $$3 = $$1.create($$0, this.c);
      ajc $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ajc a(czf $$0, String $$1, ms $$2, Function<ajc, mu> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mu.a($$0, $$1)), this.c);
   }

   static mg e(czf $$0, ajc $$1, ajc $$2) {
      return mj.a($$0).a(a(dmu.w, $$2, $$1));
   }

   static mg e(czf $$0, ajc $$1, ajc $$2, ajc $$3) {
      return mj.a($$0).a(mk.a(dmu.bh).a(dnm.b, mm.a().a(mn.c, $$1)).a(dnm.a, mm.a().a(mn.c, $$2)).a(dnm.c, mm.a().a(mn.c, $$3)));
   }

   public void a(czf $$0) {
      this.b($$0, mw.a);
   }

   public void b(czf $$0, mw.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(czf $$0, mu $$1, ms $$2) {
      ajc $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private md.b h(czf $$0) {
      mw $$1 = this.g.getOrDefault($$0, mw.a.get($$0));
      return new md.b($$1.b()).a($$0, $$1.a());
   }

   public void a(czf $$0, czf $$1, czf $$2) {
      mu $$3 = mu.u($$0);
      ajc $$4 = mt.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.l());
      this.c($$2);
   }

   void i(czf $$0) {
      mu $$1 = mu.t($$0);
      ajc $$2 = mt.v.a($$0, $$1, this.c);
      ajc $$3 = mt.w.a($$0, $$1, this.c);
      ajc $$4 = mt.x.a($$0, $$1, this.c);
      ajc $$5 = mt.y.a($$0, $$1, this.c);
      ajc $$6 = mt.z.a($$0, $$1, this.c);
      ajc $$7 = mt.A.a($$0, $$1, this.c);
      ajc $$8 = mt.B.a($$0, $$1, this.c);
      ajc $$9 = mt.C.a($$0, $$1, this.c);
      this.a($$0.l());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(czf $$0, czf $$1) {
      ajc $$2 = mt.v.a($$0);
      ajc $$3 = mt.w.a($$0);
      ajc $$4 = mt.x.a($$0);
      ajc $$5 = mt.y.a($$0);
      ajc $$6 = mt.z.a($$0);
      ajc $$7 = mt.A.a($$0);
      ajc $$8 = mt.B.a($$0);
      ajc $$9 = mt.C.a($$0);
      this.a($$1, mr.a($$0.l()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(czf $$0) {
      mu $$1 = mu.b($$0);
      ajc $$2 = mt.ak.a($$0, $$1, this.c);
      ajc $$3 = mt.al.a($$0, $$1, this.c);
      ajc $$4 = mt.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(czf $$0) {
      mu $$1 = mu.b($$0);
      ajc $$2 = mt.ah.a($$0, $$1, this.c);
      ajc $$3 = mt.ai.a($$0, $$1, this.c);
      ajc $$4 = mt.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(czf $$0, czf $$1) {
      ajc $$2 = mt.ah.a($$0);
      ajc $$3 = mt.ai.a($$0);
      ajc $$4 = mt.aj.a($$0);
      this.a($$1, mr.a($$0.l()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(czh.sD);
      ajc $$0 = mr.a(czh.sD);
      ajc $$1 = mr.a(czh.sD, "_partial_tilt");
      ajc $$2 = mr.a(czh.sD, "_full_tilt");
      this.b
         .accept(
            mj.a(czh.sD)
               .a(b())
               .a(mk.a(dmu.bl).a(dnp.a, mm.a().a(mn.c, $$0)).a(dnp.b, mm.a().a(mn.c, $$0)).a(dnp.c, mm.a().a(mn.c, $$1)).a(dnp.d, mm.a().a(mn.c, $$2)))
         );
   }

   private md.f l(czf $$0) {
      return new md.f(mu.n($$0));
   }

   private void m(czf $$0) {
      this.c($$0, $$0);
   }

   private void c(czf $$0, czf $$1) {
      this.b.accept(c($$0, mr.a($$1)));
   }

   private void a(czf $$0, md.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(czf $$0, md.e $$1, mu $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(czf $$0, md.e $$1) {
      mu $$2 = mu.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(czf $$0, md.e $$1, mu $$2) {
      ajc $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(czf $$0, md.e $$1, dnh<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         mk $$4 = mk.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mu $$5 = mu.c(mu.a($$0, $$4x));
            ajc $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return mm.a().a(mn.c, $$6);
         });
         this.a($$0.l());
         this.b.accept(mj.a($$0).a($$4));
      }
   }

   private void a(czf $$0, czf $$1, md.e $$2) {
      this.a($$0, $$2);
      mu $$3 = mu.d($$0);
      ajc $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(czf $$0, czf $$1) {
      mw $$2 = mw.p.get($$0);
      ajc $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ajc $$4 = mt.aC.a($$1, $$2.b(), this.c);
      this.b.accept(mj.a($$1, mm.a().a(mn.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(czf $$0, czf $$1) {
      this.a($$0.l());
      mu $$2 = mu.h($$0);
      mu $$3 = mu.a($$0, $$1);
      ajc $$4 = mt.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            mj.a($$1, mm.a().a(mn.c, $$4))
               .a(mk.a(dmu.R).a(ih.e, mm.a()).a(ih.d, mm.a().a(mn.b, mn.a.d)).a(ih.c, mm.a().a(mn.b, mn.a.b)).a(ih.f, mm.a().a(mn.b, mn.a.c)))
         );
      this.b.accept(mj.a($$0).a(mk.a(dmu.av).a($$2x -> mm.a().a(mn.c, mt.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      czf $$0 = czh.kC;
      this.a($$0.l());
      ajc $$1 = mr.a($$0, "_top");
      ajc $$2 = mr.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      czf $$0 = czh.kB;
      this.a($$0.l());
      mk $$1 = mk.a(det.d, dmu.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> mm.a().a(mn.c, mr.a($$0, "_top_stage_" + $$1x));
            case b -> mm.a().a(mn.c, mr.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mj.a($$0).a($$1));
   }

   private void a(czf $$0, czf $$1, czf $$2, czf $$3, czf $$4, czf $$5, czf $$6, czf $$7) {
      this.a($$0, md.e.b);
      this.a($$1, md.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(czf $$0, md.e $$1) {
      this.a($$0, "_top");
      ajc $$2 = this.a($$0, "_top", $$1.a(), mu::c);
      ajc $$3 = this.a($$0, "_bottom", $$1.a(), mu::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(czh.iD, "_front");
      ajc $$0 = mr.a(czh.iD, "_top");
      ajc $$1 = this.a(czh.iD, "_bottom", md.e.b.a(), mu::c);
      this.f(czh.iD, $$0, $$1);
   }

   private void k() {
      ajc $$0 = this.a(czh.bx, "_top", mt.bk, mu::a);
      ajc $$1 = this.a(czh.bx, "_bottom", mt.bk, mu::a);
      this.f(czh.bx, $$0, $$1);
   }

   private void l() {
      this.c(czh.sF);
      ajc $$0 = mr.a(czh.sF, "_top");
      ajc $$1 = mr.a(czh.sF, "_bottom");
      this.b.accept(mj.a(czh.sF).a(b()).a(mk.a(dmu.ae).a(dna.b, mm.a().a(mn.c, $$1)).a(dna.a, mm.a().a(mn.c, $$0))));
   }

   private void f(czf $$0, ajc $$1, ajc $$2) {
      this.b.accept(mj.a($$0).a(mk.a(dmu.ae).a(dna.b, mm.a().a(mn.c, $$2)).a(dna.a, mm.a().a(mn.c, $$1))));
   }

   private void n(czf $$0) {
      mu $$1 = mu.e($$0);
      mu $$2 = mu.e(mu.a($$0, "_corner"));
      ajc $$3 = mt.as.a($$0, $$1, this.c);
      ajc $$4 = mt.at.a($$0, $$2, this.c);
      ajc $$5 = mt.au.a($$0, $$1, this.c);
      ajc $$6 = mt.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            mj.a($$0)
               .a(
                  mk.a(dmu.ag)
                     .a(dni.a, mm.a().a(mn.c, $$3))
                     .a(dni.b, mm.a().a(mn.c, $$3).a(mn.b, mn.a.b))
                     .a(dni.c, mm.a().a(mn.c, $$5).a(mn.b, mn.a.b))
                     .a(dni.d, mm.a().a(mn.c, $$6).a(mn.b, mn.a.b))
                     .a(dni.e, mm.a().a(mn.c, $$5))
                     .a(dni.f, mm.a().a(mn.c, $$6))
                     .a(dni.g, mm.a().a(mn.c, $$4))
                     .a(dni.h, mm.a().a(mn.c, $$4).a(mn.b, mn.a.b))
                     .a(dni.i, mm.a().a(mn.c, $$4).a(mn.b, mn.a.c))
                     .a(dni.j, mm.a().a(mn.c, $$4).a(mn.b, mn.a.d))
               )
         );
   }

   private void o(czf $$0) {
      ajc $$1 = this.a($$0, "", mt.as, mu::e);
      ajc $$2 = this.a($$0, "", mt.au, mu::e);
      ajc $$3 = this.a($$0, "", mt.av, mu::e);
      ajc $$4 = this.a($$0, "_on", mt.as, mu::e);
      ajc $$5 = this.a($$0, "_on", mt.au, mu::e);
      ajc $$6 = this.a($$0, "_on", mt.av, mu::e);
      mk $$7 = mk.a(dmu.w, dmu.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return mm.a().a(mn.c, $$6x ? $$4 : $$1);
            case b:
               return mm.a().a(mn.c, $$6x ? $$4 : $$1).a(mn.b, mn.a.b);
            case c:
               return mm.a().a(mn.c, $$6x ? $$5 : $$2).a(mn.b, mn.a.b);
            case d:
               return mm.a().a(mn.c, $$6x ? $$6 : $$3).a(mn.b, mn.a.b);
            case e:
               return mm.a().a(mn.c, $$6x ? $$5 : $$2);
            case f:
               return mm.a().a(mn.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(mj.a($$0).a($$7));
   }

   private md.a a(ajc $$0, czf $$1) {
      return new md.a($$0, $$1);
   }

   private md.a f(czf $$0, czf $$1) {
      return new md.a(mr.a($$0), $$1);
   }

   private void a(czf $$0, cpl $$1) {
      ajc $$2 = mt.aa.a($$0, mu.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(czf $$0, ajc $$1) {
      ajc $$2 = mt.aa.a($$0, mu.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(czf $$0, czf $$1) {
      this.a($$0);
      ajc $$2 = mw.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(czf $$0) {
      this.a($$0.l());
      ajc $$1 = mw.k.create($$0, this.c);
      ajc $$2 = mw.l.create($$0, this.c);
      ajc $$3 = mw.m.create($$0, this.c);
      ajc $$4 = mw.n.create($$0, this.c);
      this.b
         .accept(
            mi.a($$0)
               .a(mh.a().a(dmu.S, 1, 2, 3, 4).a(dmu.R, ih.c), mm.a().a(mn.c, $$1))
               .a(mh.a().a(dmu.S, 1, 2, 3, 4).a(dmu.R, ih.f), mm.a().a(mn.c, $$1).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.S, 1, 2, 3, 4).a(dmu.R, ih.d), mm.a().a(mn.c, $$1).a(mn.b, mn.a.c))
               .a(mh.a().a(dmu.S, 1, 2, 3, 4).a(dmu.R, ih.e), mm.a().a(mn.c, $$1).a(mn.b, mn.a.d))
               .a(mh.a().a(dmu.S, 2, 3, 4).a(dmu.R, ih.c), mm.a().a(mn.c, $$2))
               .a(mh.a().a(dmu.S, 2, 3, 4).a(dmu.R, ih.f), mm.a().a(mn.c, $$2).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.S, 2, 3, 4).a(dmu.R, ih.d), mm.a().a(mn.c, $$2).a(mn.b, mn.a.c))
               .a(mh.a().a(dmu.S, 2, 3, 4).a(dmu.R, ih.e), mm.a().a(mn.c, $$2).a(mn.b, mn.a.d))
               .a(mh.a().a(dmu.S, 3, 4).a(dmu.R, ih.c), mm.a().a(mn.c, $$3))
               .a(mh.a().a(dmu.S, 3, 4).a(dmu.R, ih.f), mm.a().a(mn.c, $$3).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.S, 3, 4).a(dmu.R, ih.d), mm.a().a(mn.c, $$3).a(mn.b, mn.a.c))
               .a(mh.a().a(dmu.S, 3, 4).a(dmu.R, ih.e), mm.a().a(mn.c, $$3).a(mn.b, mn.a.d))
               .a(mh.a().a(dmu.S, 4).a(dmu.R, ih.c), mm.a().a(mn.c, $$4))
               .a(mh.a().a(dmu.S, 4).a(dmu.R, ih.f), mm.a().a(mn.c, $$4).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.S, 4).a(dmu.R, ih.d), mm.a().a(mn.c, $$4).a(mn.b, mn.a.c))
               .a(mh.a().a(dmu.S, 4).a(dmu.R, ih.e), mm.a().a(mn.c, $$4).a(mn.b, mn.a.d))
         );
   }

   private void a(mw.a $$0, czf... $$1) {
      for (czf $$2 : $$1) {
         ajc $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(mw.a $$0, czf... $$1) {
      for (czf $$2 : $$1) {
         ajc $$3 = $$0.create($$2, this.c);
         this.b.accept(mj.a($$2, mm.a().a(mn.c, $$3)).a(c()));
      }
   }

   private void h(czf $$0, czf $$1) {
      this.a($$0);
      mu $$2 = mu.b($$0, $$1);
      ajc $$3 = mt.aI.a($$1, $$2, this.c);
      ajc $$4 = mt.aJ.a($$1, $$2, this.c);
      ajc $$5 = mt.aK.a($$1, $$2, this.c);
      ajc $$6 = mt.aG.a($$1, $$2, this.c);
      ajc $$7 = mt.aH.a($$1, $$2, this.c);
      cpl $$8 = $$1.l();
      mt.bx.a(mr.a($$8), mu.F($$0), this.c);
      this.b
         .accept(
            mi.a($$1)
               .a(mm.a().a(mn.c, $$3))
               .a(mh.a().a(dmu.L, true), mm.a().a(mn.c, $$4))
               .a(mh.a().a(dmu.M, true), mm.a().a(mn.c, $$4).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.N, true), mm.a().a(mn.c, $$5))
               .a(mh.a().a(dmu.O, true), mm.a().a(mn.c, $$5).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.L, false), mm.a().a(mn.c, $$6))
               .a(mh.a().a(dmu.M, false), mm.a().a(mn.c, $$7))
               .a(mh.a().a(dmu.N, false), mm.a().a(mn.c, $$7).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.O, false), mm.a().a(mn.c, $$6).a(mn.b, mn.a.d))
         );
   }

   private void q(czf $$0) {
      mu $$1 = mu.z($$0);
      ajc $$2 = mt.aL.a($$0, $$1, this.c);
      ajc $$3 = this.a($$0, "_conditional", mt.aL, $$1x -> $$1.c(mv.i, $$1x));
      this.b.accept(mj.a($$0).a(a(dmu.c, $$3, $$2)).a(e()));
   }

   private void r(czf $$0) {
      ajc $$1 = mw.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<mm> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> mm.a().a(mn.c, mr.a(czh.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(czh.mZ);
      this.b
         .accept(
            mi.a(czh.mZ)
               .a(mh.a().a(dmu.aq, 0), this.a(0))
               .a(mh.a().a(dmu.aq, 1), this.a(1))
               .a(mh.a().a(dmu.bk, dmq.b), mm.a().a(mn.c, mr.a(czh.mZ, "_small_leaves")))
               .a(mh.a().a(dmu.bk, dmq.c), mm.a().a(mn.c, mr.a(czh.mZ, "_large_leaves")))
         );
   }

   private mk n() {
      return mk.a(dmu.P)
         .a(ih.a, mm.a().a(mn.a, mn.a.c))
         .a(ih.b, mm.a())
         .a(ih.c, mm.a().a(mn.a, mn.a.b))
         .a(ih.d, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.c))
         .a(ih.e, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.d))
         .a(ih.f, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.b));
   }

   private void o() {
      ajc $$0 = mu.a(czh.nU, "_top_open");
      this.b
         .accept(
            mj.a(czh.nU)
               .a(this.n())
               .a(
                  mk.a(dmu.u)
                     .a(false, mm.a().a(mn.c, mw.f.create(czh.nU, this.c)))
                     .a(true, mm.a().a(mn.c, mw.f.get(czh.nU).a($$1 -> $$1.a(mv.f, $$0)).a(czh.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> mk a(dnh<T> $$0, T $$1, ajc $$2, ajc $$3) {
      mm $$4 = mm.a().a(mn.c, $$2);
      mm $$5 = mm.a().a(mn.c, $$3);
      return mk.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(czf $$0, Function<czf, mu> $$1) {
      mu $$2 = $$1.apply($$0).b(mv.i, mv.c);
      mu $$3 = $$2.c(mv.g, mu.a($$0, "_front_honey"));
      ajc $$4 = mt.q.a($$0, $$2, this.c);
      ajc $$5 = mt.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(mj.a($$0).a(b()).a(a(dmu.aN, 5, $$5, $$4)));
   }

   private void a(czf $$0, dnh<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ajc> $$3 = new Int2ObjectOpenHashMap();
         mk $$4 = mk.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ajc $$5 = (ajc)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mt.aV, mu::g));
            return mm.a().a(mn.c, $$5);
         });
         this.a($$0.l());
         this.b.accept(mj.a($$0).a($$4));
      }
   }

   private void p() {
      ajc $$0 = mr.a(czh.od, "_floor");
      ajc $$1 = mr.a(czh.od, "_ceiling");
      ajc $$2 = mr.a(czh.od, "_wall");
      ajc $$3 = mr.a(czh.od, "_between_walls");
      this.a(cpt.wi);
      this.b
         .accept(
            mj.a(czh.od)
               .a(
                  mk.a(dmu.R, dmu.V)
                     .a(ih.c, dms.a, mm.a().a(mn.c, $$0))
                     .a(ih.d, dms.a, mm.a().a(mn.c, $$0).a(mn.b, mn.a.c))
                     .a(ih.f, dms.a, mm.a().a(mn.c, $$0).a(mn.b, mn.a.b))
                     .a(ih.e, dms.a, mm.a().a(mn.c, $$0).a(mn.b, mn.a.d))
                     .a(ih.c, dms.b, mm.a().a(mn.c, $$1))
                     .a(ih.d, dms.b, mm.a().a(mn.c, $$1).a(mn.b, mn.a.c))
                     .a(ih.f, dms.b, mm.a().a(mn.c, $$1).a(mn.b, mn.a.b))
                     .a(ih.e, dms.b, mm.a().a(mn.c, $$1).a(mn.b, mn.a.d))
                     .a(ih.c, dms.c, mm.a().a(mn.c, $$2).a(mn.b, mn.a.d))
                     .a(ih.d, dms.c, mm.a().a(mn.c, $$2).a(mn.b, mn.a.b))
                     .a(ih.f, dms.c, mm.a().a(mn.c, $$2))
                     .a(ih.e, dms.c, mm.a().a(mn.c, $$2).a(mn.b, mn.a.c))
                     .a(ih.d, dms.d, mm.a().a(mn.c, $$3).a(mn.b, mn.a.b))
                     .a(ih.c, dms.d, mm.a().a(mn.c, $$3).a(mn.b, mn.a.d))
                     .a(ih.f, dms.d, mm.a().a(mn.c, $$3))
                     .a(ih.e, dms.d, mm.a().a(mn.c, $$3).a(mn.b, mn.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mj.a(czh.nZ, mm.a().a(mn.c, mr.a(czh.nZ)))
               .a(
                  mk.a(dmu.U, dmu.R)
                     .a(dmp.a, ih.c, mm.a())
                     .a(dmp.a, ih.f, mm.a().a(mn.b, mn.a.b))
                     .a(dmp.a, ih.d, mm.a().a(mn.b, mn.a.c))
                     .a(dmp.a, ih.e, mm.a().a(mn.b, mn.a.d))
                     .a(dmp.b, ih.c, mm.a().a(mn.a, mn.a.b))
                     .a(dmp.b, ih.f, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.b))
                     .a(dmp.b, ih.d, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.c))
                     .a(dmp.b, ih.e, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.d))
                     .a(dmp.c, ih.d, mm.a().a(mn.a, mn.a.c))
                     .a(dmp.c, ih.e, mm.a().a(mn.a, mn.a.c).a(mn.b, mn.a.b))
                     .a(dmp.c, ih.c, mm.a().a(mn.a, mn.a.c).a(mn.b, mn.a.c))
                     .a(dmp.c, ih.f, mm.a().a(mn.a, mn.a.c).a(mn.b, mn.a.d))
               )
         );
   }

   private void d(czf $$0, mw.a $$1) {
      ajc $$2 = $$1.create($$0, this.c);
      ajc $$3 = mu.a($$0, "_front_on");
      ajc $$4 = $$1.get($$0).a($$1x -> $$1x.a(mv.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mj.a($$0).a(a(dmu.r, $$4, $$2)).a(b()));
   }

   private void a(czf... $$0) {
      ajc $$1 = mr.a("campfire_off");

      for (czf $$2 : $$0) {
         ajc $$3 = mt.bc.a($$2, mu.E($$2), this.c);
         this.a($$2.l());
         this.b.accept(mj.a($$2).a(a(dmu.r, $$3, $$1)).a(c()));
      }
   }

   private void s(czf $$0) {
      ajc $$1 = mt.bt.a($$0, mu.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(czf $$0) {
      ajc $$1;
      if ($$0 == czh.tj) {
         $$1 = mt.bv.a($$0, mu.m($$0), this.c);
      } else {
         $$1 = mt.bu.a($$0, mu.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mu $$0 = mu.a(mu.G(czh.cl), mu.G(czh.n));
      ajc $$1 = mt.j.a(czh.cl, $$0, this.c);
      this.b.accept(c(czh.cl, $$1));
   }

   private void s() {
      this.a(cpt.lG);
      this.b
         .accept(
            mi.a(czh.cw)
               .a(
                  mh.b(
                     mh.a().a(dmu.ab, dnj.c).a(dmu.aa, dnj.c).a(dmu.ac, dnj.c).a(dmu.ad, dnj.c),
                     mh.a().a(dmu.ab, dnj.b, dnj.a).a(dmu.aa, dnj.b, dnj.a),
                     mh.a().a(dmu.aa, dnj.b, dnj.a).a(dmu.ac, dnj.b, dnj.a),
                     mh.a().a(dmu.ac, dnj.b, dnj.a).a(dmu.ad, dnj.b, dnj.a),
                     mh.a().a(dmu.ad, dnj.b, dnj.a).a(dmu.ab, dnj.b, dnj.a)
                  ),
                  mm.a().a(mn.c, mr.a("redstone_dust_dot"))
               )
               .a(mh.a().a(dmu.ab, dnj.b, dnj.a), mm.a().a(mn.c, mr.a("redstone_dust_side0")))
               .a(mh.a().a(dmu.ac, dnj.b, dnj.a), mm.a().a(mn.c, mr.a("redstone_dust_side_alt0")))
               .a(mh.a().a(dmu.aa, dnj.b, dnj.a), mm.a().a(mn.c, mr.a("redstone_dust_side_alt1")).a(mn.b, mn.a.d))
               .a(mh.a().a(dmu.ad, dnj.b, dnj.a), mm.a().a(mn.c, mr.a("redstone_dust_side1")).a(mn.b, mn.a.d))
               .a(mh.a().a(dmu.ab, dnj.a), mm.a().a(mn.c, mr.a("redstone_dust_up")))
               .a(mh.a().a(dmu.aa, dnj.a), mm.a().a(mn.c, mr.a("redstone_dust_up")).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.ac, dnj.a), mm.a().a(mn.c, mr.a("redstone_dust_up")).a(mn.b, mn.a.c))
               .a(mh.a().a(dmu.ad, dnj.a), mm.a().a(mn.c, mr.a("redstone_dust_up")).a(mn.b, mn.a.d))
         );
   }

   private void t() {
      this.a(cpt.lK);
      this.b
         .accept(
            mj.a(czh.gY)
               .a(c())
               .a(
                  mk.a(dmu.bd, dmu.w)
                     .a(dmx.a, false, mm.a().a(mn.c, mr.a(czh.gY)))
                     .a(dmx.a, true, mm.a().a(mn.c, mr.a(czh.gY, "_on")))
                     .a(dmx.b, false, mm.a().a(mn.c, mr.a(czh.gY, "_subtract")))
                     .a(dmx.b, true, mm.a().a(mn.c, mr.a(czh.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mu $$0 = mu.a(czh.jR);
      mu $$1 = mu.a(mu.a(czh.jE, "_side"), $$0.a(mv.f));
      ajc $$2 = mt.ab.a(czh.jE, $$1, this.c);
      ajc $$3 = mt.ac.a(czh.jE, $$1, this.c);
      ajc $$4 = mt.j.b(czh.jE, "_double", $$1, this.c);
      this.b.accept(e(czh.jE, $$2, $$3, $$4));
      this.b.accept(c(czh.jR, mt.c.a(czh.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cpt.sp);
      this.b
         .accept(
            mi.a(czh.fs)
               .a(mm.a().a(mn.c, mu.G(czh.fs)))
               .a(mh.a().a(dmu.k, true), mm.a().a(mn.c, mu.a(czh.fs, "_bottle0")))
               .a(mh.a().a(dmu.l, true), mm.a().a(mn.c, mu.a(czh.fs, "_bottle1")))
               .a(mh.a().a(dmu.m, true), mm.a().a(mn.c, mu.a(czh.fs, "_bottle2")))
               .a(mh.a().a(dmu.k, false), mm.a().a(mn.c, mu.a(czh.fs, "_empty0")))
               .a(mh.a().a(dmu.l, false), mm.a().a(mn.c, mu.a(czh.fs, "_empty1")))
               .a(mh.a().a(dmu.m, false), mm.a().a(mn.c, mu.a(czh.fs, "_empty2")))
         );
   }

   private void u(czf $$0) {
      ajc $$1 = mt.bp.a($$0, mu.b($$0), this.c);
      ajc $$2 = mr.a("mushroom_block_inside");
      this.b
         .accept(
            mi.a($$0)
               .a(mh.a().a(dmu.L, true), mm.a().a(mn.c, $$1))
               .a(mh.a().a(dmu.M, true), mm.a().a(mn.c, $$1).a(mn.b, mn.a.b).a(mn.d, true))
               .a(mh.a().a(dmu.N, true), mm.a().a(mn.c, $$1).a(mn.b, mn.a.c).a(mn.d, true))
               .a(mh.a().a(dmu.O, true), mm.a().a(mn.c, $$1).a(mn.b, mn.a.d).a(mn.d, true))
               .a(mh.a().a(dmu.J, true), mm.a().a(mn.c, $$1).a(mn.a, mn.a.d).a(mn.d, true))
               .a(mh.a().a(dmu.K, true), mm.a().a(mn.c, $$1).a(mn.a, mn.a.b).a(mn.d, true))
               .a(mh.a().a(dmu.L, false), mm.a().a(mn.c, $$2))
               .a(mh.a().a(dmu.M, false), mm.a().a(mn.c, $$2).a(mn.b, mn.a.b).a(mn.d, false))
               .a(mh.a().a(dmu.N, false), mm.a().a(mn.c, $$2).a(mn.b, mn.a.c).a(mn.d, false))
               .a(mh.a().a(dmu.O, false), mm.a().a(mn.c, $$2).a(mn.b, mn.a.d).a(mn.d, false))
               .a(mh.a().a(dmu.J, false), mm.a().a(mn.c, $$2).a(mn.a, mn.a.d).a(mn.d, false))
               .a(mh.a().a(dmu.K, false), mm.a().a(mn.c, $$2).a(mn.a, mn.a.b).a(mn.d, false))
         );
      this.a($$0, mw.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cpt.rA);
      this.b
         .accept(
            mj.a(czh.eg)
               .a(
                  mk.a(dmu.ay)
                     .a(0, mm.a().a(mn.c, mr.a(czh.eg)))
                     .a(1, mm.a().a(mn.c, mr.a(czh.eg, "_slice1")))
                     .a(2, mm.a().a(mn.c, mr.a(czh.eg, "_slice2")))
                     .a(3, mm.a().a(mn.c, mr.a(czh.eg, "_slice3")))
                     .a(4, mm.a().a(mn.c, mr.a(czh.eg, "_slice4")))
                     .a(5, mm.a().a(mn.c, mr.a(czh.eg, "_slice5")))
                     .a(6, mm.a().a(mn.c, mr.a(czh.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mu $$0 = new mu()
         .a(mv.c, mu.a(czh.nX, "_side3"))
         .a(mv.o, mu.G(czh.t))
         .a(mv.n, mu.a(czh.nX, "_top"))
         .a(mv.j, mu.a(czh.nX, "_side3"))
         .a(mv.l, mu.a(czh.nX, "_side3"))
         .a(mv.k, mu.a(czh.nX, "_side1"))
         .a(mv.m, mu.a(czh.nX, "_side2"));
      this.b.accept(c(czh.nX, mt.a.a(czh.nX, $$0, this.c)));
   }

   private void y() {
      mu $$0 = new mu()
         .a(mv.c, mu.a(czh.ob, "_front"))
         .a(mv.o, mu.a(czh.ob, "_bottom"))
         .a(mv.n, mu.a(czh.ob, "_top"))
         .a(mv.j, mu.a(czh.ob, "_front"))
         .a(mv.k, mu.a(czh.ob, "_front"))
         .a(mv.l, mu.a(czh.ob, "_side"))
         .a(mv.m, mu.a(czh.ob, "_side"));
      this.b.accept(c(czh.ob, mt.a.a(czh.ob, $$0, this.c)));
   }

   private void a(czf $$0, czf $$1, BiFunction<czf, czf, mu> $$2) {
      mu $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mt.a.a($$0, $$3, this.c)));
   }

   public void b(czf $$0) {
      mu $$1 = new mu()
         .a(mv.c, mu.a($$0, "_particle"))
         .a(mv.o, mu.a($$0, "_down"))
         .a(mv.n, mu.a($$0, "_up"))
         .a(mv.j, mu.a($$0, "_north"))
         .a(mv.k, mu.a($$0, "_south"))
         .a(mv.l, mu.a($$0, "_east"))
         .a(mv.m, mu.a($$0, "_west"));
      this.b.accept(c($$0, mt.a.a($$0, $$1, this.c)));
   }

   private void z() {
      mu $$0 = mu.k(czh.eZ);
      this.b.accept(c(czh.eZ, mr.a(czh.eZ)));
      this.a(czh.ee, $$0);
      this.a(czh.ef, $$0);
   }

   private void a(czf $$0, mu $$1) {
      ajc $$2 = mt.p.a($$0, $$1.c(mv.g, mu.G($$0)), this.c);
      this.b.accept(mj.a($$0, mm.a().a(mn.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cpt.sq);
      this.m(czh.ft);
      this.b.accept(c(czh.fv, mt.bs.a(czh.fv, mu.j(mu.a(czh.H, "_still")), this.c)));
      this.b
         .accept(
            mj.a(czh.fu)
               .a(
                  mk.a(ddn.g)
                     .a(1, mm.a().a(mn.c, mt.bq.a(czh.fu, "_level1", mu.j(mu.a(czh.G, "_still")), this.c)))
                     .a(2, mm.a().a(mn.c, mt.br.a(czh.fu, "_level2", mu.j(mu.a(czh.G, "_still")), this.c)))
                     .a(3, mm.a().a(mn.c, mt.bs.a(czh.fu, "_full", mu.j(mu.a(czh.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mj.a(czh.fw)
               .a(
                  mk.a(ddn.g)
                     .a(1, mm.a().a(mn.c, mt.bq.a(czh.fw, "_level1", mu.j(mu.G(czh.qP)), this.c)))
                     .a(2, mm.a().a(mn.c, mt.br.a(czh.fw, "_level2", mu.j(mu.G(czh.qP)), this.c)))
                     .a(3, mm.a().a(mn.c, mt.bs.a(czh.fw, "_full", mu.j(mu.G(czh.qP)), this.c)))
               )
         );
   }

   private void B() {
      mu $$0 = mu.b(czh.kv);
      ajc $$1 = mt.aE.a(czh.kv, $$0, this.c);
      ajc $$2 = this.a(czh.kv, "_dead", mt.aE, $$1x -> $$0.c(mv.b, $$1x));
      this.b.accept(mj.a(czh.kv).a(a(dmu.au, 5, $$2, $$1)));
   }

   private void C() {
      ajc $$0 = mr.a(czh.tq);
      ajc $$1 = mr.a(czh.tq, "_triggered");
      ajc $$2 = mr.a(czh.tq, "_crafting");
      ajc $$3 = mr.a(czh.tq, "_crafting_triggered");
      this.b
         .accept(
            mj.a(czh.tq)
               .a(mk.a(dmu.T).a($$0x -> this.a($$0x, mm.a())))
               .a(
                  mk.a(dmu.A, day.b)
                     .a(false, false, mm.a().a(mn.c, $$0))
                     .a(true, true, mm.a().a(mn.c, $$3))
                     .a(true, false, mm.a().a(mn.c, $$1))
                     .a(false, true, mm.a().a(mn.c, $$2))
               )
         );
   }

   private void v(czf $$0) {
      mu $$1 = new mu().a(mv.f, mu.a(czh.cD, "_top")).a(mv.i, mu.a(czh.cD, "_side")).a(mv.g, mu.a($$0, "_front"));
      mu $$2 = new mu().a(mv.i, mu.a(czh.cD, "_top")).a(mv.g, mu.a($$0, "_front_vertical"));
      ajc $$3 = mt.p.a($$0, $$1, this.c);
      ajc $$4 = mt.r.a($$0, $$2, this.c);
      this.b
         .accept(
            mj.a($$0)
               .a(
                  mk.a(dmu.P)
                     .a(ih.a, mm.a().a(mn.c, $$4).a(mn.a, mn.a.c))
                     .a(ih.b, mm.a().a(mn.c, $$4))
                     .a(ih.c, mm.a().a(mn.c, $$3))
                     .a(ih.f, mm.a().a(mn.c, $$3).a(mn.b, mn.a.b))
                     .a(ih.d, mm.a().a(mn.c, $$3).a(mn.b, mn.a.c))
                     .a(ih.e, mm.a().a(mn.c, $$3).a(mn.b, mn.a.d))
               )
         );
   }

   private void D() {
      ajc $$0 = mr.a(czh.fy);
      ajc $$1 = mr.a(czh.fy, "_filled");
      this.b.accept(mj.a(czh.fy).a(mk.a(dmu.h).a(false, mm.a().a(mn.c, $$0)).a(true, mm.a().a(mn.c, $$1))).a(c()));
   }

   private void E() {
      ajc $$0 = mr.a(czh.ku, "_side");
      ajc $$1 = mr.a(czh.ku, "_noside");
      ajc $$2 = mr.a(czh.ku, "_noside1");
      ajc $$3 = mr.a(czh.ku, "_noside2");
      ajc $$4 = mr.a(czh.ku, "_noside3");
      this.b
         .accept(
            mi.a(czh.ku)
               .a(mh.a().a(dmu.L, true), mm.a().a(mn.c, $$0))
               .a(mh.a().a(dmu.M, true), mm.a().a(mn.c, $$0).a(mn.b, mn.a.b).a(mn.d, true))
               .a(mh.a().a(dmu.N, true), mm.a().a(mn.c, $$0).a(mn.b, mn.a.c).a(mn.d, true))
               .a(mh.a().a(dmu.O, true), mm.a().a(mn.c, $$0).a(mn.b, mn.a.d).a(mn.d, true))
               .a(mh.a().a(dmu.J, true), mm.a().a(mn.c, $$0).a(mn.a, mn.a.d).a(mn.d, true))
               .a(mh.a().a(dmu.K, true), mm.a().a(mn.c, $$0).a(mn.a, mn.a.b).a(mn.d, true))
               .a(mh.a().a(dmu.L, false), mm.a().a(mn.c, $$1).a(mn.e, 2), mm.a().a(mn.c, $$2), mm.a().a(mn.c, $$3), mm.a().a(mn.c, $$4))
               .a(
                  mh.a().a(dmu.M, false),
                  mm.a().a(mn.c, $$2).a(mn.b, mn.a.b).a(mn.d, true),
                  mm.a().a(mn.c, $$3).a(mn.b, mn.a.b).a(mn.d, true),
                  mm.a().a(mn.c, $$4).a(mn.b, mn.a.b).a(mn.d, true),
                  mm.a().a(mn.c, $$1).a(mn.e, 2).a(mn.b, mn.a.b).a(mn.d, true)
               )
               .a(
                  mh.a().a(dmu.N, false),
                  mm.a().a(mn.c, $$3).a(mn.b, mn.a.c).a(mn.d, true),
                  mm.a().a(mn.c, $$4).a(mn.b, mn.a.c).a(mn.d, true),
                  mm.a().a(mn.c, $$1).a(mn.e, 2).a(mn.b, mn.a.c).a(mn.d, true),
                  mm.a().a(mn.c, $$2).a(mn.b, mn.a.c).a(mn.d, true)
               )
               .a(
                  mh.a().a(dmu.O, false),
                  mm.a().a(mn.c, $$4).a(mn.b, mn.a.d).a(mn.d, true),
                  mm.a().a(mn.c, $$1).a(mn.e, 2).a(mn.b, mn.a.d).a(mn.d, true),
                  mm.a().a(mn.c, $$2).a(mn.b, mn.a.d).a(mn.d, true),
                  mm.a().a(mn.c, $$3).a(mn.b, mn.a.d).a(mn.d, true)
               )
               .a(
                  mh.a().a(dmu.J, false),
                  mm.a().a(mn.c, $$1).a(mn.e, 2).a(mn.a, mn.a.d).a(mn.d, true),
                  mm.a().a(mn.c, $$4).a(mn.a, mn.a.d).a(mn.d, true),
                  mm.a().a(mn.c, $$2).a(mn.a, mn.a.d).a(mn.d, true),
                  mm.a().a(mn.c, $$3).a(mn.a, mn.a.d).a(mn.d, true)
               )
               .a(
                  mh.a().a(dmu.K, false),
                  mm.a().a(mn.c, $$4).a(mn.a, mn.a.b).a(mn.d, true),
                  mm.a().a(mn.c, $$3).a(mn.a, mn.a.b).a(mn.d, true),
                  mm.a().a(mn.c, $$2).a(mn.a, mn.a.b).a(mn.d, true),
                  mm.a().a(mn.c, $$1).a(mn.e, 2).a(mn.a, mn.a.b).a(mn.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            mi.a(czh.pc)
               .a(mm.a().a(mn.c, mu.G(czh.pc)))
               .a(mh.a().a(dmu.aL, 1), mm.a().a(mn.c, mu.a(czh.pc, "_contents1")))
               .a(mh.a().a(dmu.aL, 2), mm.a().a(mn.c, mu.a(czh.pc, "_contents2")))
               .a(mh.a().a(dmu.aL, 3), mm.a().a(mn.c, mu.a(czh.pc, "_contents3")))
               .a(mh.a().a(dmu.aL, 4), mm.a().a(mn.c, mu.a(czh.pc, "_contents4")))
               .a(mh.a().a(dmu.aL, 5), mm.a().a(mn.c, mu.a(czh.pc, "_contents5")))
               .a(mh.a().a(dmu.aL, 6), mm.a().a(mn.c, mu.a(czh.pc, "_contents6")))
               .a(mh.a().a(dmu.aL, 7), mm.a().a(mn.c, mu.a(czh.pc, "_contents7")))
               .a(mh.a().a(dmu.aL, 8), mm.a().a(mn.c, mu.a(czh.pc, "_contents_ready")))
         );
   }

   private void w(czf $$0) {
      ajc $$1 = mt.c.a($$0, mu.a($$0), this.c);
      ajc $$2 = this.a($$0, "_powered", mt.c, mu::b);
      ajc $$3 = this.a($$0, "_lit", mt.c, mu::b);
      ajc $$4 = this.a($$0, "_lit_powered", mt.c, mu::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private mg a(czf $$0, ajc $$1, ajc $$2, ajc $$3, ajc $$4) {
      return mj.a($$0).a(mk.a(dmu.r, dmu.w).a(($$4x, $$5) -> $$4x ? mm.a().a(mn.c, $$5 ? $$4 : $$2) : mm.a().a(mn.c, $$5 ? $$3 : $$1)));
   }

   private void i(czf $$0, czf $$1) {
      ajc $$2 = mr.a($$0);
      ajc $$3 = mr.a($$0, "_powered");
      ajc $$4 = mr.a($$0, "_lit");
      ajc $$5 = mr.a($$0, "_lit_powered");
      this.a($$1, mr.a($$0.l()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(czf $$0) {
      this.c($$0);
      this.b.accept(mj.a($$0, mm.a().a(mn.c, mt.ao.a($$0, mu.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(czh.qy);
      this.x(czh.qx);
      this.x(czh.qw);
      this.x(czh.qv);
   }

   private void H() {
      this.c(czh.st);
      mk.b<ih, dnb> $$0 = mk.a(dmu.bm, dmu.bn);

      for (dnb $$1 : dnb.values()) {
         $$0.a(ih.b, $$1, this.a(ih.b, $$1));
      }

      for (dnb $$2 : dnb.values()) {
         $$0.a(ih.a, $$2, this.a(ih.a, $$2));
      }

      this.b.accept(mj.a(czh.st).a($$0));
   }

   private mm a(ih $$0, dnb $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mu $$3 = mu.c(mu.a(czh.st, $$2));
      return mm.a().a(mn.c, mt.an.a(czh.st, $$2, $$3, this.c));
   }

   private void y(czf $$0) {
      mu $$1 = new mu().a(mv.e, mu.G(czh.dV)).a(mv.f, mu.G($$0)).a(mv.i, mu.a($$0, "_side"));
      this.b.accept(c($$0, mt.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ajc $$0 = mu.a(czh.gZ, "_side");
      mu $$1 = new mu().a(mv.f, mu.a(czh.gZ, "_top")).a(mv.i, $$0);
      mu $$2 = new mu().a(mv.f, mu.a(czh.gZ, "_inverted_top")).a(mv.i, $$0);
      this.b
         .accept(
            mj.a(czh.gZ)
               .a(mk.a(dmu.p).a(false, mm.a().a(mn.c, mt.aF.a(czh.gZ, $$1, this.c))).a(true, mm.a().a(mn.c, mt.aF.a(mr.a(czh.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(czf $$0) {
      this.b.accept(mj.a($$0, mm.a().a(mn.c, mr.a($$0))).a(this.n()));
   }

   private void J() {
      czf $$0 = czh.ss;
      ajc $$1 = mr.a($$0, "_on");
      ajc $$2 = mr.a($$0);
      this.b.accept(mj.a($$0, mm.a().a(mn.c, mr.a($$0))).a(this.n()).a(a(dmu.w, $$1, $$2)));
   }

   private void K() {
      mu $$0 = new mu().a(mv.B, mu.G(czh.j)).a(mv.f, mu.G(czh.cC));
      mu $$1 = new mu().a(mv.B, mu.G(czh.j)).a(mv.f, mu.a(czh.cC, "_moist"));
      ajc $$2 = mt.aW.a(czh.cC, $$0, this.c);
      ajc $$3 = mt.aW.a(mu.a(czh.cC, "_moist"), $$1, this.c);
      this.b.accept(mj.a(czh.cC).a(a(dmu.aQ, 7, $$3, $$2)));
   }

   private List<ajc> A(czf $$0) {
      ajc $$1 = mt.aX.a(mr.a($$0, "_floor0"), mu.v($$0), this.c);
      ajc $$2 = mt.aX.a(mr.a($$0, "_floor1"), mu.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ajc> B(czf $$0) {
      ajc $$1 = mt.aY.a(mr.a($$0, "_side0"), mu.v($$0), this.c);
      ajc $$2 = mt.aY.a(mr.a($$0, "_side1"), mu.w($$0), this.c);
      ajc $$3 = mt.aZ.a(mr.a($$0, "_side_alt0"), mu.v($$0), this.c);
      ajc $$4 = mt.aZ.a(mr.a($$0, "_side_alt1"), mu.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ajc> C(czf $$0) {
      ajc $$1 = mt.ba.a(mr.a($$0, "_up0"), mu.v($$0), this.c);
      ajc $$2 = mt.ba.a(mr.a($$0, "_up1"), mu.w($$0), this.c);
      ajc $$3 = mt.bb.a(mr.a($$0, "_up_alt0"), mu.v($$0), this.c);
      ajc $$4 = mt.bb.a(mr.a($$0, "_up_alt1"), mu.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<mm> a(List<ajc> $$0, UnaryOperator<mm> $$1) {
      return $$0.stream().map($$0x -> mm.a().a(mn.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      mh $$0 = mh.a().a(dmu.L, false).a(dmu.M, false).a(dmu.N, false).a(dmu.O, false).a(dmu.J, false);
      List<ajc> $$1 = this.A(czh.cr);
      List<ajc> $$2 = this.B(czh.cr);
      List<ajc> $$3 = this.C(czh.cr);
      this.b
         .accept(
            mi.a(czh.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(mh.b(mh.a().a(dmu.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(mh.b(mh.a().a(dmu.M, true), $$0), a($$2, $$0x -> $$0x.a(mn.b, mn.a.b)))
               .a(mh.b(mh.a().a(dmu.N, true), $$0), a($$2, $$0x -> $$0x.a(mn.b, mn.a.c)))
               .a(mh.b(mh.a().a(dmu.O, true), $$0), a($$2, $$0x -> $$0x.a(mn.b, mn.a.d)))
               .a(mh.a().a(dmu.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ajc> $$0 = this.A(czh.cs);
      List<ajc> $$1 = this.B(czh.cs);
      this.b
         .accept(
            mi.a(czh.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mn.b, mn.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mn.b, mn.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mn.b, mn.a.d)))
         );
   }

   private void D(czf $$0) {
      ajc $$1 = mw.t.create($$0, this.c);
      ajc $$2 = mw.u.create($$0, this.c);
      this.a($$0.l());
      this.b.accept(mj.a($$0).a(a(dmu.j, $$2, $$1)));
   }

   private void N() {
      mu $$0 = mu.a(mu.a(czh.ad, "_side"), mu.a(czh.ad, "_top"));
      ajc $$1 = mt.j.a(czh.ad, $$0, this.c);
      this.b.accept(d(czh.ad, $$1));
   }

   private void O() {
      this.a(cpt.ad);
      czf $$0 = czh.E;
      mk.b<Boolean, Integer> $$1 = mk.a(ddz.d, ddz.b);
      ajc $$2 = mr.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ajc $$4 = mr.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, mm.a().a(mn.c, $$4));
         $$1.a(false, $$3, mm.a().a(mn.c, $$2));
      }

      this.b.accept(mj.a(czh.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mj.a(czh.kI)
               .a(
                  mk.a(dmu.as)
                     .a(0, mm.a().a(mn.c, this.a(czh.kI, "_0", mt.c, mu::b)))
                     .a(1, mm.a().a(mn.c, this.a(czh.kI, "_1", mt.c, mu::b)))
                     .a(2, mm.a().a(mn.c, this.a(czh.kI, "_2", mt.c, mu::b)))
                     .a(3, mm.a().a(mn.c, this.a(czh.kI, "_3", mt.c, mu::b)))
               )
         );
   }

   private void Q() {
      ajc $$0 = mu.G(czh.j);
      mu $$1 = new mu().a(mv.e, $$0).b(mv.e, mv.c).a(mv.f, mu.a(czh.i, "_top")).a(mv.i, mu.a(czh.i, "_snow"));
      mm $$2 = mm.a().a(mn.c, mt.n.a(czh.i, "_snow", $$1, this.c));
      this.a(czh.i, mr.a(czh.i), $$2);
      ajc $$3 = mw.f.get(czh.fl).a($$1x -> $$1x.a(mv.e, $$0)).a(czh.fl, this.c);
      this.a(czh.fl, $$3, $$2);
      ajc $$4 = mw.f.get(czh.l).a($$1x -> $$1x.a(mv.e, $$0)).a(czh.l, this.c);
      this.a(czh.l, $$4, $$2);
   }

   private void a(czf $$0, ajc $$1, mm $$2) {
      List<mm> $$3 = Arrays.asList(a($$1));
      this.b.accept(mj.a($$0).a(mk.a(dmu.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cpt.rg);
      this.b
         .accept(
            mj.a(czh.fC)
               .a(
                  mk.a(dmu.ar)
                     .a(0, mm.a().a(mn.c, mr.a(czh.fC, "_stage0")))
                     .a(1, mm.a().a(mn.c, mr.a(czh.fC, "_stage1")))
                     .a(2, mm.a().a(mn.c, mr.a(czh.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(czh.kE, mr.a(czh.kE)));
   }

   private void j(czf $$0, czf $$1) {
      mu $$2 = mu.b($$1);
      ajc $$3 = mt.Y.a($$0, $$2, this.c);
      ajc $$4 = mt.Z.a($$0, $$2, this.c);
      this.b.accept(mj.a($$0).a(a(dmu.aT, 1, $$4, $$3)));
   }

   private void T() {
      ajc $$0 = mr.a(czh.hc);
      ajc $$1 = mr.a(czh.hc, "_side");
      this.a(cpt.lQ);
      this.b
         .accept(
            mj.a(czh.hc)
               .a(
                  mk.a(dmu.Q)
                     .a(ih.a, mm.a().a(mn.c, $$0))
                     .a(ih.c, mm.a().a(mn.c, $$1))
                     .a(ih.f, mm.a().a(mn.c, $$1).a(mn.b, mn.a.b))
                     .a(ih.d, mm.a().a(mn.c, $$1).a(mn.b, mn.a.c))
                     .a(ih.e, mm.a().a(mn.c, $$1).a(mn.b, mn.a.d))
               )
         );
   }

   private void k(czf $$0, czf $$1) {
      ajc $$2 = mr.a($$0);
      this.b.accept(mj.a($$1, mm.a().a(mn.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ajc $$0 = mr.a(czh.eW, "_post_ends");
      ajc $$1 = mr.a(czh.eW, "_post");
      ajc $$2 = mr.a(czh.eW, "_cap");
      ajc $$3 = mr.a(czh.eW, "_cap_alt");
      ajc $$4 = mr.a(czh.eW, "_side");
      ajc $$5 = mr.a(czh.eW, "_side_alt");
      this.b
         .accept(
            mi.a(czh.eW)
               .a(mm.a().a(mn.c, $$0))
               .a(mh.a().a(dmu.L, false).a(dmu.M, false).a(dmu.N, false).a(dmu.O, false), mm.a().a(mn.c, $$1))
               .a(mh.a().a(dmu.L, true).a(dmu.M, false).a(dmu.N, false).a(dmu.O, false), mm.a().a(mn.c, $$2))
               .a(mh.a().a(dmu.L, false).a(dmu.M, true).a(dmu.N, false).a(dmu.O, false), mm.a().a(mn.c, $$2).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.L, false).a(dmu.M, false).a(dmu.N, true).a(dmu.O, false), mm.a().a(mn.c, $$3))
               .a(mh.a().a(dmu.L, false).a(dmu.M, false).a(dmu.N, false).a(dmu.O, true), mm.a().a(mn.c, $$3).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.L, true), mm.a().a(mn.c, $$4))
               .a(mh.a().a(dmu.M, true), mm.a().a(mn.c, $$4).a(mn.b, mn.a.b))
               .a(mh.a().a(dmu.N, true), mm.a().a(mn.c, $$5))
               .a(mh.a().a(dmu.O, true), mm.a().a(mn.c, $$5).a(mn.b, mn.a.b))
         );
      this.d(czh.eW);
   }

   private void E(czf $$0) {
      this.b.accept(mj.a($$0, mm.a().a(mn.c, mr.a($$0))).a(b()));
   }

   private void V() {
      ajc $$0 = mr.a(czh.dw);
      ajc $$1 = mr.a(czh.dw, "_on");
      this.d(czh.dw);
      this.b
         .accept(
            mj.a(czh.dw)
               .a(a(dmu.w, $$0, $$1))
               .a(
                  mk.a(dmu.U, dmu.R)
                     .a(dmp.c, ih.c, mm.a().a(mn.a, mn.a.c).a(mn.b, mn.a.c))
                     .a(dmp.c, ih.f, mm.a().a(mn.a, mn.a.c).a(mn.b, mn.a.d))
                     .a(dmp.c, ih.d, mm.a().a(mn.a, mn.a.c))
                     .a(dmp.c, ih.e, mm.a().a(mn.a, mn.a.c).a(mn.b, mn.a.b))
                     .a(dmp.a, ih.c, mm.a())
                     .a(dmp.a, ih.f, mm.a().a(mn.b, mn.a.b))
                     .a(dmp.a, ih.d, mm.a().a(mn.b, mn.a.c))
                     .a(dmp.a, ih.e, mm.a().a(mn.b, mn.a.d))
                     .a(dmp.b, ih.c, mm.a().a(mn.a, mn.a.b))
                     .a(dmp.b, ih.f, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.b))
                     .a(dmp.b, ih.d, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.c))
                     .a(dmp.b, ih.e, mm.a().a(mn.a, mn.a.b).a(mn.b, mn.a.d))
               )
         );
   }

   private void W() {
      this.d(czh.fm);
      this.b.accept(b(czh.fm, mr.a(czh.fm)));
   }

   private void X() {
      this.d(czh.tn);
      this.b.accept(c(czh.tn, mr.a(czh.tn)));
   }

   private void Y() {
      this.b.accept(mj.a(czh.ed).a(mk.a(dmu.H).a(ih.a.a, mm.a().a(mn.c, mr.a(czh.ed, "_ns"))).a(ih.a.c, mm.a().a(mn.c, mr.a(czh.ed, "_ew")))));
   }

   private void Z() {
      ajc $$0 = mw.a.create(czh.dV, this.c);
      this.b
         .accept(
            mj.a(
               czh.dV,
               mm.a().a(mn.c, $$0),
               mm.a().a(mn.c, $$0).a(mn.a, mn.a.b),
               mm.a().a(mn.c, $$0).a(mn.a, mn.a.c),
               mm.a().a(mn.c, $$0).a(mn.a, mn.a.d),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.b),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.b).a(mn.a, mn.a.b),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.b).a(mn.a, mn.a.c),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.b).a(mn.a, mn.a.d),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.c),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.c).a(mn.a, mn.a.b),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.c).a(mn.a, mn.a.c),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.c).a(mn.a, mn.a.d),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.d),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.d).a(mn.a, mn.a.b),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.d).a(mn.a, mn.a.c),
               mm.a().a(mn.c, $$0).a(mn.b, mn.a.d).a(mn.a, mn.a.d)
            )
         );
   }

   private void aa() {
      ajc $$0 = mr.a(czh.kO);
      ajc $$1 = mr.a(czh.kO, "_on");
      this.b.accept(mj.a(czh.kO).a(a(dmu.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mu $$0 = new mu().a(mv.e, mu.a(czh.by, "_bottom")).a(mv.i, mu.a(czh.by, "_side"));
      ajc $$1 = mu.a(czh.by, "_top_sticky");
      ajc $$2 = mu.a(czh.by, "_top");
      mu $$3 = $$0.c(mv.E, $$1);
      mu $$4 = $$0.c(mv.E, $$2);
      ajc $$5 = mr.a(czh.by, "_base");
      this.a(czh.by, $$5, $$4);
      this.a(czh.br, $$5, $$3);
      ajc $$6 = mt.n.a(czh.by, "_inventory", $$0.c(mv.f, $$2), this.c);
      ajc $$7 = mt.n.a(czh.br, "_inventory", $$0.c(mv.f, $$1), this.c);
      this.a(czh.by, $$6);
      this.a(czh.br, $$7);
   }

   private void a(czf $$0, ajc $$1, mu $$2) {
      ajc $$3 = mt.bh.a($$0, $$2, this.c);
      this.b.accept(mj.a($$0).a(a(dmu.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mu $$0 = new mu().a(mv.F, mu.a(czh.by, "_top")).a(mv.i, mu.a(czh.by, "_side"));
      mu $$1 = $$0.c(mv.E, mu.a(czh.by, "_top_sticky"));
      mu $$2 = $$0.c(mv.E, mu.a(czh.by, "_top"));
      this.b
         .accept(
            mj.a(czh.bz)
               .a(
                  mk.a(dmu.x, dmu.bg)
                     .a(false, dng.a, mm.a().a(mn.c, mt.bi.a(czh.by, "_head", $$2, this.c)))
                     .a(false, dng.b, mm.a().a(mn.c, mt.bi.a(czh.by, "_head_sticky", $$1, this.c)))
                     .a(true, dng.a, mm.a().a(mn.c, mt.bj.a(czh.by, "_head_short", $$2, this.c)))
                     .a(true, dng.b, mm.a().a(mn.c, mt.bj.a(czh.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      czf $$0 = czh.tr;
      mu $$1 = mu.a($$0, "_side_inactive", "_top_inactive");
      mu $$2 = mu.a($$0, "_side_active", "_top_active");
      mu $$3 = mu.a($$0, "_side_active", "_top_ejecting_reward");
      ajc $$4 = mt.o.a($$0, $$1, this.c);
      ajc $$5 = mt.o.a($$0, "_active", $$2, this.c);
      ajc $$6 = mt.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(mj.a($$0).a(mk.a(dmu.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> mm.a().a(mn.c, $$4);
            case b, c, d -> mm.a().a(mn.c, $$5);
            case e -> mm.a().a(mn.c, $$6);
         };
      })));
   }

   private void ae() {
      czf $$0 = czh.ts;
      mu $$1 = mu.a($$0, "_front_off", "_side_off", "_top_off", "_bottom");
      mu $$2 = mu.a($$0, "_front_on", "_side_on", "_top_on", "_bottom");
      mu $$3 = mu.a($$0, "_front_ejecting", "_side_on", "_top_on", "_bottom");
      mu $$4 = mu.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ajc $$5 = mt.bN.a($$0, $$1, this.c);
      ajc $$6 = mt.bN.a($$0, "_active", $$2, this.c);
      ajc $$7 = mt.bN.a($$0, "_unlocking", $$3, this.c);
      ajc $$8 = mt.bN.a($$0, "_ejecting_reward", $$4, this.c);
      this.a($$0, $$5);
      this.b.accept(mj.a($$0).a(b()).a(mk.a(dhz.b).a($$4x -> {
         return switch ($$4x) {
            case a -> mm.a().a(mn.c, $$5);
            case b -> mm.a().a(mn.c, $$6);
            case c -> mm.a().a(mn.c, $$7);
            case d -> mm.a().a(mn.c, $$8);
         };
      })));
   }

   private void af() {
      ajc $$0 = mr.a(czh.qQ, "_inactive");
      ajc $$1 = mr.a(czh.qQ, "_active");
      this.a(czh.qQ, $$0);
      this.b.accept(mj.a(czh.qQ).a(mk.a(dmu.bo).a($$2 -> mm.a().a(mn.c, $$2 != dnl.b && $$2 != dnl.c ? $$0 : $$1))));
   }

   private void ag() {
      ajc $$0 = mr.a(czh.qR, "_inactive");
      ajc $$1 = mr.a(czh.qR, "_active");
      this.a(czh.qR, $$0);
      this.b.accept(mj.a(czh.qR).a(mk.a(dmu.bo).a($$2 -> mm.a().a(mn.c, $$2 != dnl.b && $$2 != dnl.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      ajc $$0 = mt.bM.a(czh.qV, mu.a(false), this.c);
      ajc $$1 = mt.bM.a(czh.qV, "_can_summon", mu.a(true), this.c);
      this.a(czh.qV, $$0);
      this.b.accept(mj.a(czh.qV).a(a(dmu.G, $$1, $$0)));
   }

   private void ai() {
      ajc $$0 = mr.a(czh.nS, "_stable");
      ajc $$1 = mr.a(czh.nS, "_unstable");
      this.a(czh.nS, $$0);
      this.b.accept(mj.a(czh.nS).a(a(dmu.b, $$1, $$0)));
   }

   private void aj() {
      ajc $$0 = this.a(czh.sv, "", mt.ao, mu::c);
      ajc $$1 = this.a(czh.sv, "_lit", mt.ao, mu::c);
      this.b.accept(mj.a(czh.sv).a(a(dmu.D, $$1, $$0)));
      ajc $$2 = this.a(czh.sw, "", mt.ao, mu::c);
      ajc $$3 = this.a(czh.sw, "_lit", mt.ao, mu::c);
      this.b.accept(mj.a(czh.sw).a(a(dmu.D, $$3, $$2)));
   }

   private void ak() {
      ajc $$0 = mw.a.create(czh.fB, this.c);
      ajc $$1 = this.a(czh.fB, "_on", mt.c, mu::b);
      this.b.accept(mj.a(czh.fB).a(a(dmu.r, $$1, $$0)));
   }

   private void l(czf $$0, czf $$1) {
      mu $$2 = mu.y($$0);
      this.b.accept(c($$0, mt.bf.a($$0, $$2, this.c)));
      this.b.accept(mj.a($$1, mm.a().a(mn.c, mt.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      mu $$0 = mu.y(czh.dK);
      mu $$1 = mu.i(mu.a(czh.dK, "_off"));
      ajc $$2 = mt.bf.a(czh.dK, $$0, this.c);
      ajc $$3 = mt.bf.a(czh.dK, "_off", $$1, this.c);
      this.b.accept(mj.a(czh.dK).a(a(dmu.r, $$2, $$3)));
      ajc $$4 = mt.bg.a(czh.dL, $$0, this.c);
      ajc $$5 = mt.bg.a(czh.dL, "_off", $$1, this.c);
      this.b.accept(mj.a(czh.dL).a(a(dmu.r, $$4, $$5)).a(d()));
      this.d(czh.dK);
      this.c(czh.dL);
   }

   private void am() {
      this.a(cpt.lJ);
      this.b.accept(mj.a(czh.eh).a(mk.a(dmu.aA, dmu.s, dmu.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return mm.a().a(mn.c, mu.a(czh.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cpt.cS);
      this.b
         .accept(
            mj.a(czh.mV)
               .a(
                  mk.a(dmu.aS, dmu.C)
                     .a(1, false, Arrays.asList(a(mr.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(mr.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(mr.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(mr.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(mr.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(mr.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(mr.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(mr.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      mu $$0 = mu.a(czh.dN);
      ajc $$1 = mt.c.a(czh.dP, $$0, this.c);
      this.b.accept(mj.a(czh.dN).a(mk.a(dmu.aF).a($$1x -> mm.a().a(mn.c, $$1x < 8 ? mr.a(czh.dN, "_height" + $$1x * 2) : $$1))));
      this.a(czh.dN, mr.a(czh.dN, "_height2"));
      this.b.accept(c(czh.dP, $$1));
   }

   private void ap() {
      this.b.accept(mj.a(czh.oc, mm.a().a(mn.c, mr.a(czh.oc))).a(b()));
   }

   private void aq() {
      ajc $$0 = mw.a.create(czh.pa, this.c);
      this.a(czh.pa, $$0);
      this.b.accept(mj.a(czh.pa).a(mk.a(dmu.bj).a($$0x -> mm.a().a(mn.c, this.a(czh.pa, "_" + $$0x.c(), mt.c, mu::b)))));
   }

   private void ar() {
      this.a(cpt.wl);
      this.b.accept(mj.a(czh.oi).a(mk.a(dmu.as).a($$0 -> mm.a().a(mn.c, this.a(czh.oi, "_stage" + $$0, mt.ao, mu::c)))));
   }

   private void as() {
      this.a(cpt.pr);
      this.b
         .accept(
            mj.a(czh.fI)
               .a(
                  mk.a(dmu.a, dmu.M, dmu.L, dmu.N, dmu.O)
                     .a(false, false, false, false, false, mm.a().a(mn.c, mr.a(czh.fI, "_ns")))
                     .a(false, true, false, false, false, mm.a().a(mn.c, mr.a(czh.fI, "_n")).a(mn.b, mn.a.b))
                     .a(false, false, true, false, false, mm.a().a(mn.c, mr.a(czh.fI, "_n")))
                     .a(false, false, false, true, false, mm.a().a(mn.c, mr.a(czh.fI, "_n")).a(mn.b, mn.a.c))
                     .a(false, false, false, false, true, mm.a().a(mn.c, mr.a(czh.fI, "_n")).a(mn.b, mn.a.d))
                     .a(false, true, true, false, false, mm.a().a(mn.c, mr.a(czh.fI, "_ne")))
                     .a(false, true, false, true, false, mm.a().a(mn.c, mr.a(czh.fI, "_ne")).a(mn.b, mn.a.b))
                     .a(false, false, false, true, true, mm.a().a(mn.c, mr.a(czh.fI, "_ne")).a(mn.b, mn.a.c))
                     .a(false, false, true, false, true, mm.a().a(mn.c, mr.a(czh.fI, "_ne")).a(mn.b, mn.a.d))
                     .a(false, false, true, true, false, mm.a().a(mn.c, mr.a(czh.fI, "_ns")))
                     .a(false, true, false, false, true, mm.a().a(mn.c, mr.a(czh.fI, "_ns")).a(mn.b, mn.a.b))
                     .a(false, true, true, true, false, mm.a().a(mn.c, mr.a(czh.fI, "_nse")))
                     .a(false, true, false, true, true, mm.a().a(mn.c, mr.a(czh.fI, "_nse")).a(mn.b, mn.a.b))
                     .a(false, false, true, true, true, mm.a().a(mn.c, mr.a(czh.fI, "_nse")).a(mn.b, mn.a.c))
                     .a(false, true, true, false, true, mm.a().a(mn.c, mr.a(czh.fI, "_nse")).a(mn.b, mn.a.d))
                     .a(false, true, true, true, true, mm.a().a(mn.c, mr.a(czh.fI, "_nsew")))
                     .a(true, false, false, false, false, mm.a().a(mn.c, mr.a(czh.fI, "_attached_ns")))
                     .a(true, false, true, false, false, mm.a().a(mn.c, mr.a(czh.fI, "_attached_n")))
                     .a(true, false, false, true, false, mm.a().a(mn.c, mr.a(czh.fI, "_attached_n")).a(mn.b, mn.a.c))
                     .a(true, true, false, false, false, mm.a().a(mn.c, mr.a(czh.fI, "_attached_n")).a(mn.b, mn.a.b))
                     .a(true, false, false, false, true, mm.a().a(mn.c, mr.a(czh.fI, "_attached_n")).a(mn.b, mn.a.d))
                     .a(true, true, true, false, false, mm.a().a(mn.c, mr.a(czh.fI, "_attached_ne")))
                     .a(true, true, false, true, false, mm.a().a(mn.c, mr.a(czh.fI, "_attached_ne")).a(mn.b, mn.a.b))
                     .a(true, false, false, true, true, mm.a().a(mn.c, mr.a(czh.fI, "_attached_ne")).a(mn.b, mn.a.c))
                     .a(true, false, true, false, true, mm.a().a(mn.c, mr.a(czh.fI, "_attached_ne")).a(mn.b, mn.a.d))
                     .a(true, false, true, true, false, mm.a().a(mn.c, mr.a(czh.fI, "_attached_ns")))
                     .a(true, true, false, false, true, mm.a().a(mn.c, mr.a(czh.fI, "_attached_ns")).a(mn.b, mn.a.b))
                     .a(true, true, true, true, false, mm.a().a(mn.c, mr.a(czh.fI, "_attached_nse")))
                     .a(true, true, false, true, true, mm.a().a(mn.c, mr.a(czh.fI, "_attached_nse")).a(mn.b, mn.a.b))
                     .a(true, false, true, true, true, mm.a().a(mn.c, mr.a(czh.fI, "_attached_nse")).a(mn.b, mn.a.c))
                     .a(true, true, true, false, true, mm.a().a(mn.c, mr.a(czh.fI, "_attached_nse")).a(mn.b, mn.a.d))
                     .a(true, true, true, true, true, mm.a().a(mn.c, mr.a(czh.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(czh.fH);
      this.b.accept(mj.a(czh.fH).a(mk.a(dmu.a, dmu.w).a(($$0, $$1) -> mm.a().a(mn.c, mu.a(czh.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ajc a(int $$0, String $$1, mu $$2) {
      switch ($$0) {
         case 1:
            return mt.bl.a(mr.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return mt.bm.a(mr.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return mt.bn.a(mr.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return mt.bo.a(mr.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ajc a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mu.b(mu.G(czh.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mu.b(mu.a(czh.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mu.b(mu.a(czh.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cpt.ko);
      this.b.accept(mj.a(czh.mf).a(mk.a(dmu.aD, dmu.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cpt.kp);
      Function<Integer, ajc> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mu $$2 = mu.a($$1);
         return mt.bw.a(czh.mg, $$1, $$2, this.c);
      };
      this.b.accept(mj.a(czh.mg).a(mk.a(dgm.c).a($$1 -> mm.a().a(mn.c, $$0.apply($$1)))));
   }

   private void F(czf $$0) {
      this.d($$0);
      ajc $$1 = mr.a($$0);
      mi $$2 = mi.a($$0);
      mh.c $$3 = ac.a(mh.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dmv, Function<ajc, mm>> $$4 : a) {
         dmv $$5 = (dmv)$$4.getFirst();
         Function<ajc, mm> $$6 = (Function<ajc, mm>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(mh.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      ajc $$0 = mu.a(czh.qU, "_bottom");
      mu $$1 = new mu().a(mv.e, $$0).a(mv.f, mu.a(czh.qU, "_top")).a(mv.i, mu.a(czh.qU, "_side"));
      mu $$2 = new mu().a(mv.e, $$0).a(mv.f, mu.a(czh.qU, "_top_bloom")).a(mv.i, mu.a(czh.qU, "_side_bloom"));
      ajc $$3 = mt.n.a(czh.qU, "", $$1, this.c);
      ajc $$4 = mt.n.a(czh.qU, "_bloom", $$2, this.c);
      this.b.accept(mj.a(czh.qU).a(mk.a(dmu.E).a($$2x -> mm.a().a(mn.c, $$2x ? $$4 : $$3))));
      this.a(cpt.gi, $$3);
   }

   private void ax() {
      czf $$0 = czh.cm;
      ajc $$1 = mr.a($$0);
      mi $$2 = mi.a($$0);
      Map.of(ih.c, mn.a.a, ih.f, mn.a.b, ih.d, mn.a.c, ih.e, mn.a.d).forEach(($$2x, $$3) -> {
         mh.c $$4 = mh.a().a(dmu.R, $$2x);
         $$2.a($$4, mm.a().a(mn.c, $$1).a(mn.b, $$3).a(mn.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, mr.a($$0, "_inventory"));
      i.clear();
   }

   private void a(mi $$0, mh.c $$1, mn.a $$2) {
      List.of(Pair.of(dmu.bp, mt.aM), Pair.of(dmu.bq, mt.aN), Pair.of(dmu.br, mt.aO), Pair.of(dmu.bs, mt.aP), Pair.of(dmu.bt, mt.aQ), Pair.of(dmu.bu, mt.aR))
         .forEach($$3 -> {
            dmv $$4 = (dmv)$$3.getFirst();
            ms $$5 = (ms)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(mi $$0, mh.c $$1, mn.a $$2, dmv $$3, ms $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mu $$7 = new mu().a(mv.b, mu.a(czh.cm, $$6));
      md.d $$8 = new md.d($$4, $$6);
      ajc $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(czh.cm, $$6, $$7, this.c));
      $$0.a(mh.a($$1, mh.a().a($$3, $$5)), mm.a().a(mn.c, $$9).a(mn.b, $$2));
   }

   private void ay() {
      this.b.accept(c(czh.kJ, mt.c.a(czh.kJ, mu.b(mr.a("magma")), this.c)));
   }

   private void G(czf $$0) {
      this.b($$0, mw.q);
      mt.bD.a(mr.a($$0.l()), mu.u($$0), this.c);
   }

   private void b(czf $$0, czf $$1, md.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(czf $$0, czf $$1) {
      mt.bE.a(mr.a($$0.l()), mu.u($$1), this.c);
   }

   private void az() {
      ajc $$0 = mr.a(czh.b);
      ajc $$1 = mr.a(czh.b, "_mirrored");
      this.b.accept(a(czh.eN, $$0, $$1));
      this.a(czh.eN, $$0);
   }

   private void aA() {
      ajc $$0 = mr.a(czh.sJ);
      ajc $$1 = mr.a(czh.sJ, "_mirrored");
      this.b.accept(a(czh.td, $$0, $$1).a(f()));
      this.a(czh.td, $$0);
   }

   private void n(czf $$0, czf $$1) {
      this.a($$0, md.e.b);
      mu $$2 = mu.d(mu.a($$0, "_pot"));
      ajc $$3 = md.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      ajc $$0 = mu.a(czh.pl, "_bottom");
      ajc $$1 = mu.a(czh.pl, "_top_off");
      ajc $$2 = mu.a(czh.pl, "_top");
      ajc[] $$3 = new ajc[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mu $$5 = new mu().a(mv.e, $$0).a(mv.f, $$4 == 0 ? $$1 : $$2).a(mv.i, mu.a(czh.pl, "_side" + $$4));
         $$3[$$4] = mt.n.a(czh.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mj.a(czh.pl).a(mk.a(dmu.aZ).a($$1x -> mm.a().a(mn.c, $$3[$$1x]))));
      this.a(cpt.wJ, $$3[0]);
   }

   private mm a(ij $$0, mm $$1) {
      switch ($$0) {
         case b:
            return $$1.a(mn.a, mn.a.b);
         case c:
            return $$1.a(mn.a, mn.a.b).a(mn.b, mn.a.c);
         case d:
            return $$1.a(mn.a, mn.a.b).a(mn.b, mn.a.d);
         case a:
            return $$1.a(mn.a, mn.a.b).a(mn.b, mn.a.b);
         case f:
            return $$1.a(mn.a, mn.a.d).a(mn.b, mn.a.c);
         case g:
            return $$1.a(mn.a, mn.a.d);
         case h:
            return $$1.a(mn.a, mn.a.d).a(mn.b, mn.a.b);
         case e:
            return $$1.a(mn.a, mn.a.d).a(mn.b, mn.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(mn.b, mn.a.c);
         case i:
            return $$1.a(mn.b, mn.a.d);
         case j:
            return $$1.a(mn.b, mn.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      ajc $$0 = mu.a(czh.pb, "_top");
      ajc $$1 = mu.a(czh.pb, "_bottom");
      ajc $$2 = mu.a(czh.pb, "_side");
      ajc $$3 = mu.a(czh.pb, "_lock");
      mu $$4 = new mu().a(mv.o, $$2).a(mv.m, $$2).a(mv.l, $$2).a(mv.c, $$0).a(mv.j, $$0).a(mv.k, $$1).a(mv.n, $$3);
      ajc $$5 = mt.b.a(czh.pb, $$4, this.c);
      this.b.accept(mj.a(czh.pb, mm.a().a(mn.c, $$5)).a(mk.a(dmu.T).a($$0x -> this.a($$0x, mm.a()))));
   }

   private void aD() {
      czf $$0 = czh.n;
      ajc $$1 = mr.a($$0);
      mw $$2 = mw.a.get($$0);
      czf $$3 = czh.jH;
      ajc $$4 = mt.ab.a($$3, $$2.b(), this.c);
      ajc $$5 = mt.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kk.a().filter(kl::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(czh.rf).a(kk.w).a(czh.rf, czh.rD).a(czh.rj, czh.rn).a(kk.y);
      this.h(czh.re).a(kk.A).a(czh.re, czh.rC).a(czh.ri, czh.rm).a(kk.C);
      this.h(czh.rd).a(kk.E).a(czh.rd, czh.rB).a(czh.rh, czh.rl).a(kk.G);
      this.h(czh.rc).a(kk.I).a(czh.rc, czh.rA).a(czh.rg, czh.rk).a(kk.K);
      this.w(czh.sk);
      this.w(czh.sl);
      this.w(czh.sm);
      this.w(czh.sn);
      this.i(czh.sk, czh.so);
      this.i(czh.sl, czh.sp);
      this.i(czh.sm, czh.sq);
      this.i(czh.sn, czh.sr);
      this.m(czh.a);
      this.c(czh.nc, czh.a);
      this.c(czh.nb, czh.a);
      this.m(czh.fO);
      this.m(czh.dQ);
      this.c(czh.nd, czh.G);
      this.m(czh.fA);
      this.m(czh.me);
      this.m(czh.fr);
      this.m(czh.fR);
      this.a(cpt.ua);
      this.m(czh.pg);
      this.m(czh.G);
      this.m(czh.H);
      this.m(czh.hV);
      this.a(cpt.fR);
      this.o(czh.pM, czh.qd);
      this.o(czh.pN, czh.qe);
      this.o(czh.pO, czh.qf);
      this.o(czh.pP, czh.qg);
      this.o(czh.pQ, czh.qh);
      this.o(czh.pR, czh.qi);
      this.o(czh.pS, czh.qj);
      this.o(czh.pT, czh.qk);
      this.o(czh.pU, czh.ql);
      this.o(czh.pV, czh.qm);
      this.o(czh.pW, czh.qn);
      this.o(czh.pX, czh.qo);
      this.o(czh.pY, czh.qp);
      this.o(czh.pZ, czh.qq);
      this.o(czh.qa, czh.qr);
      this.o(czh.qb, czh.qs);
      this.o(czh.pL, czh.qc);
      this.m(czh.na);
      this.m(czh.gs);
      this.m(czh.qP);
      this.m(czh.sx);
      this.s(czh.sy);
      this.s(czh.sz);
      this.t(czh.ti);
      this.t(czh.tj);
      this.aj();
      this.g(czh.sC, czh.sA);
      this.p(czh.sB);
      this.a(czh.hW, cpt.hA);
      this.a(cpt.hA);
      this.aE();
      this.a(czh.kN, cpt.ja);
      this.a(cpt.ja);
      this.f(czh.bQ, mu.a(czh.by, "_side"));
      this.a(czh.R);
      this.a(czh.S);
      this.a(czh.iB);
      this.a(czh.cx);
      this.a(czh.cy);
      this.a(czh.cz);
      this.a(czh.fE);
      this.a(czh.fF);
      this.a(czh.fJ);
      this.a(czh.N);
      this.a(czh.T);
      this.a(czh.O);
      this.a(czh.ch);
      this.a(czh.P);
      this.a(czh.Q);
      this.a(czh.ci);
      this.b(czh.pj, mw.d);
      this.a(czh.pi);
      this.a(czh.aR);
      this.a(czh.aS);
      this.a(czh.aT);
      this.a(czh.hb);
      this.a(czh.dI);
      this.a(czh.dJ);
      this.a(czh.ha);
      this.a(czh.pC);
      this.a(czh.mW);
      this.a(czh.dR);
      this.a(czh.k);
      this.a(czh.pk);
      this.a(czh.fz);
      this.a(czh.ec);
      this.a(czh.L);
      this.a(czh.ph);
      this.a(czh.dO);
      this.b(czh.dT, mw.g);
      this.b(czh.pq, mw.d);
      this.b(czh.fa, mw.d);
      this.m(czh.ac);
      this.m(czh.ga);
      this.a(czh.kK);
      this.a(czh.aY);
      this.a(czh.iC);
      this.a(czh.co);
      this.a(czh.pK);
      this.a(czh.ii);
      this.a(czh.oy);
      this.a(czh.dW);
      this.a(czh.dX);
      this.b(czh.ct, mw.b);
      this.a(czh.aO);
      this.b(czh.bw, mw.v);
      this.a(cpt.cR);
      this.b(czh.ck, mw.f);
      this.b(czh.pd, mw.d);
      this.a(czh.op);
      this.a(czh.aP);
      this.a(czh.qt);
      this.a(czh.qu);
      this.a(czh.qN);
      this.a(czh.su);
      this.a(czh.tf);
      this.a(czh.tg);
      this.a(czh.th);
      this.e(czh.qS);
      this.aD();
      this.a(czh.ra);
      this.a(czh.rb);
      this.a(czh.qW);
      this.a(czh.qX);
      this.a(czh.qY);
      this.a(czh.qZ);
      this.k(czh.qW, czh.rw);
      this.k(czh.qX, czh.ry);
      this.k(czh.qY, czh.rx);
      this.k(czh.qZ, czh.rz);
      this.i(czh.rM);
      this.i(czh.rN);
      this.i(czh.rP);
      this.i(czh.rO);
      this.a(czh.rM, czh.rQ);
      this.a(czh.rN, czh.rR);
      this.a(czh.rP, czh.rT);
      this.a(czh.rO, czh.rS);
      this.k(czh.rU);
      this.k(czh.rV);
      this.k(czh.rX);
      this.k(czh.rW);
      this.b(czh.rU, czh.rY);
      this.b(czh.rV, czh.rZ);
      this.b(czh.rX, czh.sb);
      this.b(czh.rW, czh.sa);
      this.a(czh.sc);
      this.a(czh.sd);
      this.a(czh.se);
      this.a(czh.sf);
      this.k(czh.sc, czh.sg);
      this.k(czh.sd, czh.sh);
      this.k(czh.se, czh.si);
      this.k(czh.sf, czh.sj);
      this.j(czh.gW, czh.ch);
      this.j(czh.gX, czh.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(czh.og, czh.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(czh.kt);
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
      this.F(czh.ff);
      this.F(czh.fg);
      this.F(czh.qT);
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
      this.E(czh.cO);
      this.d(czh.cO);
      this.E(czh.oa);
      this.g();
      this.E(czh.sE);
      this.l(czh.cp, czh.cq);
      this.l(czh.ea, czh.eb);
      this.a(czh.cA, czh.n, mu::c);
      this.a(czh.nY, czh.p, mu::d);
      this.y(czh.ow);
      this.y(czh.on);
      this.v(czh.aU);
      this.v(czh.hi);
      this.C();
      this.D(czh.oe);
      this.D(czh.of);
      this.e(czh.eX, mr.a(czh.eX));
      this.a(czh.dY, mw.d);
      this.a(czh.dZ, mw.d);
      this.a(czh.te);
      this.a(czh.kM, mw.d);
      this.f(czh.j);
      this.f(czh.sH);
      this.f(czh.I);
      this.g(czh.J);
      this.g(czh.M);
      this.f(czh.K);
      this.e(czh.F);
      this.b(czh.to, mw.f);
      this.a(czh.ij, mw.d, mw.e);
      this.a(czh.kx, mw.w, mw.x);
      this.a(czh.hf, mw.w, mw.x);
      this.a(czh.tk, mw.d, mw.e);
      this.a(czh.tl, mw.d, mw.e);
      this.a(czh.tm, mw.d, mw.e);
      this.c(czh.nT, mw.i);
      this.z();
      this.a(czh.pe, mu::A);
      this.a(czh.pf, mu::C);
      this.a(czh.kD, dmu.as, 0, 1, 2, 3);
      this.a(czh.gt, dmu.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(czh.fq, dmu.as, 0, 1, 1, 2);
      this.a(czh.gu, dmu.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(czh.cB, dmu.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(czh.kA, md.e.b, dmu.aq, 0, 1);
      this.i();
      this.h();
      this.a(mr.a("decorated_pot"), czh.iA).b(czh.tp);
      this.a(mr.a("banner"), czh.n)
         .a(mt.bF, czh.iJ, czh.iK, czh.iL, czh.iM, czh.iN, czh.iO, czh.iP, czh.iQ, czh.iR, czh.iS, czh.iT, czh.iU, czh.iV, czh.iW, czh.iX, czh.iY)
         .b(czh.iZ, czh.ja, czh.jb, czh.jc, czh.jd, czh.je, czh.jf, czh.jg, czh.jh, czh.ji, czh.jj, czh.jk, czh.jl, czh.jm, czh.jn, czh.jo);
      this.a(mr.a("bed"), czh.n)
         .b(czh.aZ, czh.ba, czh.bb, czh.bc, czh.bd, czh.be, czh.bf, czh.bg, czh.bh, czh.bi, czh.bj, czh.bk, czh.bl, czh.bm, czh.bn, czh.bo);
      this.m(czh.aZ, czh.bA);
      this.m(czh.ba, czh.bB);
      this.m(czh.bb, czh.bC);
      this.m(czh.bc, czh.bD);
      this.m(czh.bd, czh.bE);
      this.m(czh.be, czh.bF);
      this.m(czh.bf, czh.bG);
      this.m(czh.bg, czh.bH);
      this.m(czh.bh, czh.bI);
      this.m(czh.bi, czh.bJ);
      this.m(czh.bj, czh.bK);
      this.m(czh.bk, czh.bL);
      this.m(czh.bl, czh.bM);
      this.m(czh.bm, czh.bN);
      this.m(czh.bn, czh.bO);
      this.m(czh.bo, czh.bP);
      this.a(mr.a("skull"), czh.dW)
         .a(mt.bG, czh.gM, czh.gK, czh.gI, czh.gE, czh.gG, czh.gQ)
         .a(czh.gO)
         .b(czh.gN, czh.gP, czh.gL, czh.gJ, czh.gF, czh.gH, czh.gR);
      this.G(czh.kP);
      this.G(czh.kQ);
      this.G(czh.kR);
      this.G(czh.kS);
      this.G(czh.kT);
      this.G(czh.kU);
      this.G(czh.kV);
      this.G(czh.kW);
      this.G(czh.kX);
      this.G(czh.kY);
      this.G(czh.kZ);
      this.G(czh.la);
      this.G(czh.lb);
      this.G(czh.lc);
      this.G(czh.ld);
      this.G(czh.le);
      this.G(czh.lf);
      this.b(czh.mX, mw.q);
      this.c(czh.mX);
      this.a(mr.a("chest"), czh.n).b(czh.cv, czh.gV);
      this.a(mr.a("ender_chest"), czh.co).b(czh.fG);
      this.f(czh.fx, czh.co).a(czh.fx, czh.kF);
      this.a(czh.aM);
      this.a(czh.aN);
      this.a(czh.lw);
      this.a(czh.lx);
      this.a(czh.ly);
      this.a(czh.lz);
      this.a(czh.lA);
      this.a(czh.lB);
      this.a(czh.lC);
      this.a(czh.lD);
      this.a(czh.lE);
      this.a(czh.lF);
      this.a(czh.lG);
      this.a(czh.lH);
      this.a(czh.lI);
      this.a(czh.lJ);
      this.a(czh.lK);
      this.a(czh.lL);
      this.a(mw.a, czh.lM, czh.lN, czh.lO, czh.lP, czh.lQ, czh.lR, czh.lS, czh.lT, czh.lU, czh.lV, czh.lW, czh.lX, czh.lY, czh.lZ, czh.ma, czh.mb);
      this.a(czh.iA);
      this.a(czh.hj);
      this.a(czh.hk);
      this.a(czh.hl);
      this.a(czh.hm);
      this.a(czh.hn);
      this.a(czh.ho);
      this.a(czh.hp);
      this.a(czh.hq);
      this.a(czh.hr);
      this.a(czh.hs);
      this.a(czh.ht);
      this.a(czh.hu);
      this.a(czh.hv);
      this.a(czh.hw);
      this.a(czh.hx);
      this.a(czh.hy);
      this.a(czh.qO);
      this.h(czh.aQ, czh.eY);
      this.h(czh.ei, czh.hz);
      this.h(czh.ej, czh.hA);
      this.h(czh.ek, czh.hB);
      this.h(czh.el, czh.hC);
      this.h(czh.em, czh.hD);
      this.h(czh.en, czh.hE);
      this.h(czh.eo, czh.hF);
      this.h(czh.ep, czh.hG);
      this.h(czh.eq, czh.hH);
      this.h(czh.er, czh.hI);
      this.h(czh.es, czh.hJ);
      this.h(czh.et, czh.hK);
      this.h(czh.eu, czh.hL);
      this.h(czh.ev, czh.hM);
      this.h(czh.ew, czh.hN);
      this.h(czh.ex, czh.hO);
      this.b(mw.o, czh.lg, czh.lh, czh.li, czh.lj, czh.lk, czh.ll, czh.lm, czh.ln, czh.lo, czh.lp, czh.lq, czh.lr, czh.ls, czh.lt, czh.lu, czh.lv);
      this.g(czh.bA, czh.ik);
      this.g(czh.bB, czh.il);
      this.g(czh.bC, czh.im);
      this.g(czh.bD, czh.in);
      this.g(czh.bE, czh.io);
      this.g(czh.bF, czh.ip);
      this.g(czh.bG, czh.iq);
      this.g(czh.bH, czh.ir);
      this.g(czh.bI, czh.is);
      this.g(czh.bJ, czh.it);
      this.g(czh.bK, czh.iu);
      this.g(czh.bL, czh.iv);
      this.g(czh.bM, czh.iw);
      this.g(czh.bN, czh.ix);
      this.g(czh.bO, czh.iy);
      this.g(czh.bP, czh.iz);
      this.a(czh.sI);
      this.a(czh.eL);
      this.a(czh.bu, czh.gb, md.e.a);
      this.a(czh.bR, czh.gc, md.e.b);
      this.a(czh.bT, czh.gd, md.e.b);
      this.a(czh.bU, czh.ge, md.e.b);
      this.a(czh.bV, czh.gf, md.e.b);
      this.a(czh.bW, czh.gg, md.e.b);
      this.a(czh.bX, czh.gh, md.e.b);
      this.a(czh.bY, czh.gi, md.e.b);
      this.a(czh.bZ, czh.gj, md.e.b);
      this.a(czh.ca, czh.gk, md.e.b);
      this.a(czh.cb, czh.gl, md.e.b);
      this.a(czh.cc, czh.gm, md.e.b);
      this.a(czh.ce, czh.gn, md.e.b);
      this.a(czh.cd, czh.go, md.e.b);
      this.a(czh.cg, czh.gp, md.e.b);
      this.a(czh.cf, czh.gq, md.e.b);
      this.a(czh.bv, czh.gr, md.e.b);
      this.a(czh.bS, czh.fS, md.e.b);
      this.H();
      this.u(czh.eT);
      this.u(czh.eU);
      this.u(czh.eV);
      this.a(czh.bt, md.e.a);
      this.b(czh.dS, md.e.a);
      this.a(cpt.dI);
      this.b(czh.mc, czh.md, md.e.b);
      this.a(cpt.dJ);
      this.c(czh.md);
      this.b(czh.sG, md.e.b);
      this.c(czh.sG);
      this.c(czh.sw);
      this.b(czh.oz, czh.oA, md.e.b);
      this.b(czh.oB, czh.oC, md.e.b);
      this.a(czh.oz, "_plant");
      this.c(czh.oA);
      this.a(czh.oB, "_plant");
      this.c(czh.oC);
      this.a(czh.mY, md.e.a, mu.c(mu.a(czh.mZ, "_stage0")));
      this.m();
      this.a(czh.bs, md.e.b);
      this.c(czh.iE, md.e.b);
      this.c(czh.iF, md.e.b);
      this.c(czh.iG, md.e.b);
      this.c(czh.iH, md.e.a);
      this.c(czh.iI, md.e.a);
      this.j();
      this.k();
      this.l();
      this.a(czh.mw, czh.mr, czh.mm, czh.mh, czh.mG, czh.mB, czh.mQ, czh.mL);
      this.a(czh.mx, czh.ms, czh.mn, czh.mi, czh.mH, czh.mC, czh.mR, czh.mM);
      this.a(czh.my, czh.mt, czh.mo, czh.mj, czh.mI, czh.mD, czh.mS, czh.mN);
      this.a(czh.mz, czh.mu, czh.mp, czh.mk, czh.mJ, czh.mE, czh.mT, czh.mO);
      this.a(czh.mA, czh.mv, czh.mq, czh.ml, czh.mK, czh.mF, czh.mU, czh.mP);
      this.e(czh.fe, czh.fc);
      this.e(czh.fd, czh.fb);
      this.l(czh.ab).c(czh.ab).a(czh.av);
      this.l(czh.am).c(czh.am).a(czh.aD);
      this.a(czh.am, czh.dj, czh.ds);
      this.b(czh.aL, mw.s);
      this.l(czh.Y).c(czh.Y).a(czh.as);
      this.l(czh.ai).c(czh.ai).a(czh.aA);
      this.a(czh.ai, czh.dd, czh.do);
      this.a(czh.B, czh.fX, md.e.b);
      this.b(czh.aI, mw.s);
      this.l(czh.Z).d(czh.Z).a(czh.at);
      this.l(czh.aj).d(czh.aj).a(czh.aB);
      this.a(czh.aj, czh.de, czh.dp);
      this.a(czh.C, czh.fY, md.e.b);
      this.b(czh.aJ, mw.s);
      this.l(czh.W).c(czh.W).a(czh.aq);
      this.l(czh.ag).c(czh.ag).a(czh.ay);
      this.a(czh.ag, czh.dc, czh.dn);
      this.a(czh.z, czh.fV, md.e.b);
      this.b(czh.aG, mw.s);
      this.l(czh.U).c(czh.U).a(czh.ao);
      this.l(czh.al).c(czh.al).a(czh.aw);
      this.a(czh.al, czh.da, czh.dl);
      this.a(czh.x, czh.fT, md.e.b);
      this.b(czh.aE, mw.s);
      this.l(czh.V).c(czh.V).a(czh.ap);
      this.l(czh.af).c(czh.af).a(czh.ax);
      this.a(czh.af, czh.db, czh.dm);
      this.a(czh.y, czh.fU, md.e.b);
      this.b(czh.aF, mw.s);
      this.l(czh.aa).c(czh.aa).a(czh.au);
      this.l(czh.ak).c(czh.ak).a(czh.aC);
      this.a(czh.ak, czh.dg, czh.dr);
      this.a(czh.D, czh.fZ, md.e.b);
      this.b(czh.aK, mw.s);
      this.l(czh.X).c(czh.X).a(czh.ar);
      this.l(czh.ah).c(czh.ah).a(czh.az);
      this.a(czh.ah, czh.df, czh.dq);
      this.a(czh.A, czh.fW, md.e.b);
      this.b(czh.aH, mw.s);
      this.l(czh.os).b(czh.os).a(czh.ou);
      this.l(czh.ot).b(czh.ot).a(czh.ov);
      this.a(czh.ot, czh.dh, czh.dt);
      this.a(czh.ox, czh.pm, md.e.b);
      this.n(czh.oD, czh.po);
      this.l(czh.oj).b(czh.oj).a(czh.ol);
      this.l(czh.ok).b(czh.ok).a(czh.om);
      this.a(czh.ok, czh.di, czh.du);
      this.a(czh.oo, czh.pn, md.e.b);
      this.n(czh.oq, czh.pp);
      this.l(czh.ae).d(czh.ae);
      this.l(czh.an).d(czh.an);
      this.a(czh.v, czh.dk, czh.dv);
      this.b(czh.or, md.e.b);
      this.a(cpt.dF);
      this.i(czh.dy);
      this.k(czh.hY);
      this.u();
      this.n(czh.cP);
      this.o(czh.bp);
      this.o(czh.bq);
      this.o(czh.hh);
      this.t();
      this.q(czh.fN);
      this.q(czh.kG);
      this.q(czh.kH);
      this.r(czh.gS);
      this.r(czh.gT);
      this.r(czh.gU);
      this.o();
      this.p();
      this.d(czh.cD, mw.h);
      this.d(czh.nW, mw.h);
      this.d(czh.nV, mw.i);
      this.s();
      this.aB();
      this.aw();
      this.k(czh.eK, czh.eS);
      this.k(czh.m, czh.eO);
      this.k(czh.eJ, czh.eR);
      this.k(czh.eI, czh.eQ);
      this.az();
      this.k(czh.eH, czh.eP);
      this.aA();
      cqv.h().forEach($$0 -> this.a($$0, mr.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(czh.hX);
      mk.a<Integer> $$0 = mk.a(dmu.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ajc $$3 = mu.a(cpt.hB, $$2);
         $$0.a($$1, mm.a().a(mn.c, mt.aa.a(czh.hX, $$2, mu.h($$3), this.c)));
         mt.bx.a(mr.a(cpt.hB, $$2), mu.k($$3), this.c);
      }

      this.b.accept(mj.a(czh.hX).a($$0));
   }

   private void o(czf $$0, czf $$1) {
      this.a($$0.l());
      mu $$2 = mu.b(mu.G($$0));
      mu $$3 = mu.b(mu.a($$0, "_lit"));
      ajc $$4 = mt.bH.a($$0, "_one_candle", $$2, this.c);
      ajc $$5 = mt.bI.a($$0, "_two_candles", $$2, this.c);
      ajc $$6 = mt.bJ.a($$0, "_three_candles", $$2, this.c);
      ajc $$7 = mt.bK.a($$0, "_four_candles", $$2, this.c);
      ajc $$8 = mt.bH.a($$0, "_one_candle_lit", $$3, this.c);
      ajc $$9 = mt.bI.a($$0, "_two_candles_lit", $$3, this.c);
      ajc $$10 = mt.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      ajc $$11 = mt.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            mj.a($$0)
               .a(
                  mk.a(dmu.az, dmu.r)
                     .a(1, false, mm.a().a(mn.c, $$4))
                     .a(2, false, mm.a().a(mn.c, $$5))
                     .a(3, false, mm.a().a(mn.c, $$6))
                     .a(4, false, mm.a().a(mn.c, $$7))
                     .a(1, true, mm.a().a(mn.c, $$8))
                     .a(2, true, mm.a().a(mn.c, $$9))
                     .a(3, true, mm.a().a(mn.c, $$10))
                     .a(4, true, mm.a().a(mn.c, $$11))
               )
         );
      ajc $$12 = mt.bL.a($$1, mu.a($$0, false), this.c);
      ajc $$13 = mt.bL.a($$1, "_lit", mu.a($$0, true), this.c);
      this.b.accept(mj.a($$1).a(a(dmu.r, $$13, $$12)));
   }

   class a {
      private final ajc b;

      public a(ajc $$0, czf $$1) {
         this.b = mt.aa.a($$0, mu.u($$1), md.this.c);
      }

      public md.a a(czf... $$0) {
         for (czf $$1 : $$0) {
            md.this.b.accept(md.c($$1, this.b));
         }

         return this;
      }

      public md.a b(czf... $$0) {
         for (czf $$1 : $$0) {
            md.this.c($$1);
         }

         return this.a($$0);
      }

      public md.a a(ms $$0, czf... $$1) {
         for (czf $$2 : $$1) {
            $$0.a(mr.a($$2.l()), mu.u($$2), md.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mu b;
      private final Map<ms, ajc> c = Maps.newHashMap();
      @Nullable
      private kl d;
      @Nullable
      private ajc e;
      private final Set<czf> f = new HashSet<>();

      public b(mu $$0) {
         this.b = $$0;
      }

      public md.b a(czf $$0, ms $$1) {
         this.e = $$1.a($$0, this.b, md.this.c);
         if (md.this.f.containsKey($$0)) {
            md.this.b.accept(md.this.f.get($$0).create($$0, this.e, this.b, md.this.c));
         } else {
            md.this.b.accept(md.c($$0, this.e));
         }

         return this;
      }

      public md.b a(czf $$0, czf $$1) {
         ajc $$2 = mr.a($$0);
         md.this.b.accept(md.c($$1, $$2));
         md.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public md.b a(czf $$0) {
         ajc $$1 = mt.s.a($$0, this.b, md.this.c);
         ajc $$2 = mt.t.a($$0, this.b, md.this.c);
         md.this.b.accept(md.b($$0, $$1, $$2));
         ajc $$3 = mt.u.a($$0, this.b, md.this.c);
         md.this.a($$0, $$3);
         return this;
      }

      public md.b b(czf $$0) {
         ajc $$1 = mt.M.a($$0, this.b, md.this.c);
         ajc $$2 = mt.N.a($$0, this.b, md.this.c);
         ajc $$3 = mt.O.a($$0, this.b, md.this.c);
         md.this.b.accept(md.a($$0, $$1, $$2, $$3));
         ajc $$4 = mt.P.a($$0, this.b, md.this.c);
         md.this.a($$0, $$4);
         return this;
      }

      public md.b c(czf $$0) {
         mu $$1 = mu.p($$0);
         ajc $$2 = mt.D.a($$0, $$1, md.this.c);
         ajc $$3 = mt.E.a($$0, $$1, md.this.c);
         ajc $$4 = mt.F.a($$0, $$1, md.this.c);
         ajc $$5 = mt.G.a($$0, $$1, md.this.c);
         ajc $$6 = mt.H.a($$0, $$1, md.this.c);
         md.this.b.accept(md.a($$0, $$2, $$3, $$4, $$5, $$6));
         ajc $$7 = mt.I.a($$0, $$1, md.this.c);
         md.this.a($$0, $$7);
         return this;
      }

      public md.b d(czf $$0) {
         ajc $$1 = mt.J.a($$0, this.b, md.this.c);
         ajc $$2 = mt.K.a($$0, this.b, md.this.c);
         md.this.b.accept(md.c($$0, $$1, $$2));
         ajc $$3 = mt.L.a($$0, this.b, md.this.c);
         md.this.a($$0, $$3);
         return this;
      }

      public md.b e(czf $$0) {
         mu $$1 = mu.p($$0);
         ajc $$2 = mt.R.a($$0, $$1, md.this.c);
         ajc $$3 = mt.Q.a($$0, $$1, md.this.c);
         ajc $$4 = mt.T.a($$0, $$1, md.this.c);
         ajc $$5 = mt.S.a($$0, $$1, md.this.c);
         md.this.b.accept(md.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public md.b f(czf $$0) {
         ajc $$1 = mt.V.a($$0, this.b, md.this.c);
         ajc $$2 = mt.U.a($$0, this.b, md.this.c);
         ajc $$3 = mt.X.a($$0, this.b, md.this.c);
         ajc $$4 = mt.W.a($$0, this.b, md.this.c);
         md.this.b.accept(md.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public md.b g(czf $$0) {
         ajc $$1 = mt.Y.a($$0, this.b, md.this.c);
         ajc $$2 = mt.Z.a($$0, this.b, md.this.c);
         md.this.b.accept(md.e($$0, $$1, $$2));
         return this;
      }

      public md.b h(czf $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            czf $$1 = this.d.b().get(kl.b.r);
            ajc $$2 = mt.aa.a($$0, this.b, md.this.c);
            md.this.b.accept(md.c($$0, $$2));
            md.this.b.accept(md.c($$1, $$2));
            md.this.a($$0.l());
            md.this.c($$1);
            return this;
         }
      }

      public md.b i(czf $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ajc $$1 = this.a(mt.ab, $$0);
            ajc $$2 = this.a(mt.ac, $$0);
            md.this.b.accept(md.e($$0, $$1, $$2, this.e));
            md.this.a($$0, $$1);
            return this;
         }
      }

      public md.b j(czf $$0) {
         ajc $$1 = this.a(mt.af, $$0);
         ajc $$2 = this.a(mt.ae, $$0);
         ajc $$3 = this.a(mt.ag, $$0);
         md.this.b.accept(md.b($$0, $$1, $$2, $$3));
         md.this.a($$0, $$2);
         return this;
      }

      private md.b k(czf $$0) {
         mw $$1 = md.this.g.getOrDefault($$0, mw.a.get($$0));
         ajc $$2 = $$1.a($$0, md.this.c);
         md.this.b.accept(md.c($$0, $$2));
         return this;
      }

      private md.b l(czf $$0) {
         md.this.i($$0);
         return this;
      }

      private void m(czf $$0) {
         if (md.this.e.contains($$0)) {
            md.this.k($$0);
         } else {
            md.this.j($$0);
         }
      }

      private ajc a(ms $$0, czf $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, md.this.c));
      }

      public md.b a(kl $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<md.b, czf> $$2 = md.h.get($$0x);
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
      mg create(czf var1, ajc var2, mu var3, BiConsumer<ajc, Supplier<JsonElement>> var4);
   }

   static record d(ms a, String b) {
   }

   static enum e {
      a,
      b;

      public ms a() {
         return this == a ? mt.ap : mt.ao;
      }

      public ms b() {
         return this == a ? mt.ar : mt.aq;
      }
   }

   class f {
      private final mu b;

      public f(mu $$0) {
         this.b = $$0;
      }

      public md.f a(czf $$0) {
         mu $$1 = this.b.c(mv.d, this.b.a(mv.i));
         ajc $$2 = mt.j.a($$0, $$1, md.this.c);
         md.this.b.accept(md.d($$0, $$2));
         return this;
      }

      public md.f b(czf $$0) {
         ajc $$1 = mt.j.a($$0, this.b, md.this.c);
         md.this.b.accept(md.d($$0, $$1));
         return this;
      }

      public md.f c(czf $$0) {
         ajc $$1 = mt.j.a($$0, this.b, md.this.c);
         ajc $$2 = mt.k.a($$0, this.b, md.this.c);
         md.this.b.accept(md.d($$0, $$1, $$2));
         return this;
      }

      public md.f d(czf $$0) {
         md.this.b.accept(md.a($$0, this.b, md.this.c));
         return this;
      }
   }
}
