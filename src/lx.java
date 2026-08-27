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

public class lx {
   final Consumer<ma> b;
   final BiConsumer<ahd, Supplier<JsonElement>> c;
   private final Consumer<cmm> d;
   final List<cwj> e = ImmutableList.of(cwl.ey, cwl.eE, cwl.hY);
   final Map<cwj, lx.c> f = ImmutableMap.builder().put(cwl.b, lx::a).put(cwl.sJ, lx::c).put(cwl.eM, lx::b).build();
   final Map<cwj, mq> g = ImmutableMap.builder()
      .put(cwl.aV, mq.y.get(cwl.aV))
      .put(cwl.jp, mq.y.get(cwl.jp))
      .put(cwl.jS, mq.a(mo.a(cwl.aV, "_top")))
      .put(cwl.jU, mq.a(mo.a(cwl.jp, "_top")))
      .put(cwl.aX, mq.d.get(cwl.aV).a($$0x -> $$0x.a(mp.i, mo.G(cwl.aX))))
      .put(cwl.jr, mq.d.get(cwl.jp).a($$0x -> $$0x.a(mp.i, mo.G(cwl.jr))))
      .put(cwl.hd, mq.d.get(cwl.hd))
      .put(cwl.jT, mq.a(mo.a(cwl.hd, "_bottom")))
      .put(cwl.pr, mq.z.get(cwl.pr))
      .put(cwl.sJ, mq.z.get(cwl.sJ))
      .put(cwl.he, mq.d.get(cwl.he).a($$0x -> $$0x.a(mp.i, mo.G(cwl.he))))
      .put(cwl.aW, mq.d.get(cwl.aW).a($$0x -> {
         $$0x.a(mp.d, mo.a(cwl.aV, "_top"));
         $$0x.a(mp.i, mo.G(cwl.aW));
      }))
      .put(cwl.jq, mq.d.get(cwl.jq).a($$0x -> {
         $$0x.a(mp.d, mo.a(cwl.jp, "_top"));
         $$0x.a(mp.i, mo.G(cwl.jq));
      }))
      .put(cwl.qM, mq.z.get(cwl.qM))
      .put(cwl.qH, mq.z.get(cwl.qH))
      .build();
   static final Map<kh.b, BiConsumer<lx.b, cwj>> h = ImmutableMap.builder()
      .put(kh.b.a, lx.b::a)
      .put(kh.b.e, lx.b::l)
      .put(kh.b.b, lx.b::k)
      .put(kh.b.c, lx.b::k)
      .put(kh.b.f, lx.b::c)
      .put(kh.b.g, lx.b::d)
      .put(kh.b.h, lx.b::e)
      .put(kh.b.i, lx.b::f)
      .put(kh.b.k, lx.b::h)
      .put(kh.b.l, lx.b::i)
      .put(kh.b.m, lx.b::j)
      .put(kh.b.n, lx.b::g)
      .put(kh.b.p, lx.b::m)
      .put(kh.b.q, lx.b::b)
      .build();
   public static final List<Pair<djr, Function<ahd, mg>>> a = List.of(
      Pair.of(djq.L, (Function<ahd, mg>)$$0 -> mg.a().a(mh.c, $$0)),
      Pair.of(djq.M, (Function<ahd, mg>)$$0 -> mg.a().a(mh.c, $$0).a(mh.b, mh.a.b).a(mh.d, true)),
      Pair.of(djq.N, (Function<ahd, mg>)$$0 -> mg.a().a(mh.c, $$0).a(mh.b, mh.a.c).a(mh.d, true)),
      Pair.of(djq.O, (Function<ahd, mg>)$$0 -> mg.a().a(mh.c, $$0).a(mh.b, mh.a.d).a(mh.d, true)),
      Pair.of(djq.J, (Function<ahd, mg>)$$0 -> mg.a().a(mh.c, $$0).a(mh.a, mh.a.d).a(mh.d, true)),
      Pair.of(djq.K, (Function<ahd, mg>)$$0 -> mg.a().a(mh.c, $$0).a(mh.a, mh.a.b).a(mh.d, true))
   );
   private static final Map<lx.d, ahd> i = new HashMap<>();

   private static ma a(cwj $$0, ahd $$1, mo $$2, BiConsumer<ahd, Supplier<JsonElement>> $$3) {
      ahd $$4 = mn.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static ma b(cwj $$0, ahd $$1, mo $$2, BiConsumer<ahd, Supplier<JsonElement>> $$3) {
      ahd $$4 = mn.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static ma c(cwj $$0, ahd $$1, mo $$2, BiConsumer<ahd, Supplier<JsonElement>> $$3) {
      ahd $$4 = mn.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public lx(Consumer<ma> $$0, BiConsumer<ahd, Supplier<JsonElement>> $$1, Consumer<cmm> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cwj $$0) {
      this.d.accept($$0.k());
   }

   void a(cwj $$0, ahd $$1) {
      this.c.accept(ml.a($$0.k()), new mk($$1));
   }

   private void a(cmm $$0, ahd $$1) {
      this.c.accept(ml.a($$0), new mk($$1));
   }

   void a(cmm $$0) {
      mn.bx.a(ml.a($$0), mo.b($$0), this.c);
   }

   private void d(cwj $$0) {
      cmm $$1 = $$0.k();
      if ($$1 != cmu.a) {
         mn.bx.a(ml.a($$1), mo.F($$0), this.c);
      }
   }

   private void a(cwj $$0, String $$1) {
      cmm $$2 = $$0.k();
      mn.bx.a(ml.a($$2), mo.k(mo.a($$0, $$1)), this.c);
   }

   private static me b() {
      return me.a(djq.R).a(ic.f, mg.a().a(mh.b, mh.a.b)).a(ic.d, mg.a().a(mh.b, mh.a.c)).a(ic.e, mg.a().a(mh.b, mh.a.d)).a(ic.c, mg.a());
   }

   private static me c() {
      return me.a(djq.R).a(ic.d, mg.a()).a(ic.e, mg.a().a(mh.b, mh.a.b)).a(ic.c, mg.a().a(mh.b, mh.a.c)).a(ic.f, mg.a().a(mh.b, mh.a.d));
   }

   private static me d() {
      return me.a(djq.R).a(ic.f, mg.a()).a(ic.d, mg.a().a(mh.b, mh.a.b)).a(ic.e, mg.a().a(mh.b, mh.a.c)).a(ic.c, mg.a().a(mh.b, mh.a.d));
   }

   private static me e() {
      return me.a(djq.P)
         .a(ic.a, mg.a().a(mh.a, mh.a.b))
         .a(ic.b, mg.a().a(mh.a, mh.a.d))
         .a(ic.c, mg.a())
         .a(ic.d, mg.a().a(mh.b, mh.a.c))
         .a(ic.e, mg.a().a(mh.b, mh.a.d))
         .a(ic.f, mg.a().a(mh.b, mh.a.b));
   }

   private static md b(cwj $$0, ahd $$1) {
      return md.a($$0, a($$1));
   }

   private static mg[] a(ahd $$0) {
      return new mg[]{mg.a().a(mh.c, $$0), mg.a().a(mh.c, $$0).a(mh.b, mh.a.b), mg.a().a(mh.c, $$0).a(mh.b, mh.a.c), mg.a().a(mh.c, $$0).a(mh.b, mh.a.d)};
   }

   private static md a(cwj $$0, ahd $$1, ahd $$2) {
      return md.a($$0, mg.a().a(mh.c, $$1), mg.a().a(mh.c, $$2), mg.a().a(mh.c, $$1).a(mh.b, mh.a.c), mg.a().a(mh.c, $$2).a(mh.b, mh.a.c));
   }

   private static me a(djr $$0, ahd $$1, ahd $$2) {
      return me.a($$0).a(true, mg.a().a(mh.c, $$1)).a(false, mg.a().a(mh.c, $$2));
   }

   private void e(cwj $$0) {
      ahd $$1 = mq.a.create($$0, this.c);
      ahd $$2 = mq.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cwj $$0) {
      ahd $$1 = mq.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cwj $$0) {
      this.b.accept(md.a($$0).a(me.a(djq.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ahd $$3 = mo.a($$0, $$2);
         return mg.a().a(mh.c, mn.c.a($$0, $$2, new mo().a(mp.a, $$3), this.c));
      })));
      this.a($$0, mo.a($$0, "_0"));
   }

   static ma b(cwj $$0, ahd $$1, ahd $$2) {
      return md.a($$0)
         .a(me.a(djq.w).a(false, mg.a().a(mh.c, $$1)).a(true, mg.a().a(mh.c, $$2)))
         .a(
            me.a(djq.U, djq.R)
               .a(djl.a, ic.f, mg.a().a(mh.b, mh.a.b))
               .a(djl.a, ic.e, mg.a().a(mh.b, mh.a.d))
               .a(djl.a, ic.d, mg.a().a(mh.b, mh.a.c))
               .a(djl.a, ic.c, mg.a())
               .a(djl.b, ic.f, mg.a().a(mh.b, mh.a.b).a(mh.a, mh.a.b).a(mh.d, true))
               .a(djl.b, ic.e, mg.a().a(mh.b, mh.a.d).a(mh.a, mh.a.b).a(mh.d, true))
               .a(djl.b, ic.d, mg.a().a(mh.b, mh.a.c).a(mh.a, mh.a.b).a(mh.d, true))
               .a(djl.b, ic.c, mg.a().a(mh.a, mh.a.b).a(mh.d, true))
               .a(djl.c, ic.f, mg.a().a(mh.b, mh.a.d).a(mh.a, mh.a.c))
               .a(djl.c, ic.e, mg.a().a(mh.b, mh.a.b).a(mh.a, mh.a.c))
               .a(djl.c, ic.d, mg.a().a(mh.a, mh.a.c))
               .a(djl.c, ic.c, mg.a().a(mh.b, mh.a.c).a(mh.a, mh.a.c))
         );
   }

   private static me.d<ic, djw, djv, Boolean> a(me.d<ic, djw, djv, Boolean> $$0, djw $$1, ahd $$2, ahd $$3, ahd $$4, ahd $$5) {
      return $$0.a(ic.f, $$1, djv.a, false, mg.a().a(mh.c, $$2))
         .a(ic.d, $$1, djv.a, false, mg.a().a(mh.c, $$2).a(mh.b, mh.a.b))
         .a(ic.e, $$1, djv.a, false, mg.a().a(mh.c, $$2).a(mh.b, mh.a.c))
         .a(ic.c, $$1, djv.a, false, mg.a().a(mh.c, $$2).a(mh.b, mh.a.d))
         .a(ic.f, $$1, djv.b, false, mg.a().a(mh.c, $$4))
         .a(ic.d, $$1, djv.b, false, mg.a().a(mh.c, $$4).a(mh.b, mh.a.b))
         .a(ic.e, $$1, djv.b, false, mg.a().a(mh.c, $$4).a(mh.b, mh.a.c))
         .a(ic.c, $$1, djv.b, false, mg.a().a(mh.c, $$4).a(mh.b, mh.a.d))
         .a(ic.f, $$1, djv.a, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.b))
         .a(ic.d, $$1, djv.a, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.c))
         .a(ic.e, $$1, djv.a, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.d))
         .a(ic.c, $$1, djv.a, true, mg.a().a(mh.c, $$3))
         .a(ic.f, $$1, djv.b, true, mg.a().a(mh.c, $$5).a(mh.b, mh.a.d))
         .a(ic.d, $$1, djv.b, true, mg.a().a(mh.c, $$5))
         .a(ic.e, $$1, djv.b, true, mg.a().a(mh.c, $$5).a(mh.b, mh.a.b))
         .a(ic.c, $$1, djv.b, true, mg.a().a(mh.c, $$5).a(mh.b, mh.a.c));
   }

   private static ma a(cwj $$0, ahd $$1, ahd $$2, ahd $$3, ahd $$4, ahd $$5, ahd $$6, ahd $$7, ahd $$8) {
      return md.a($$0).a(a(a(me.a(djq.R, djq.ae, djq.be, djq.u), djw.b, $$1, $$2, $$3, $$4), djw.a, $$5, $$6, $$7, $$8));
   }

   static ma a(cwj $$0, ahd $$1, ahd $$2, ahd $$3, ahd $$4, ahd $$5) {
      return mc.a($$0)
         .a(mg.a().a(mh.c, $$1))
         .a(mb.a().a(djq.L, true), mg.a().a(mh.c, $$2).a(mh.d, false))
         .a(mb.a().a(djq.M, true), mg.a().a(mh.c, $$3).a(mh.d, false))
         .a(mb.a().a(djq.N, true), mg.a().a(mh.c, $$4).a(mh.d, false))
         .a(mb.a().a(djq.O, true), mg.a().a(mh.c, $$5).a(mh.d, false));
   }

   static ma c(cwj $$0, ahd $$1, ahd $$2) {
      return mc.a($$0)
         .a(mg.a().a(mh.c, $$1))
         .a(mb.a().a(djq.L, true), mg.a().a(mh.c, $$2).a(mh.d, true))
         .a(mb.a().a(djq.M, true), mg.a().a(mh.c, $$2).a(mh.b, mh.a.b).a(mh.d, true))
         .a(mb.a().a(djq.N, true), mg.a().a(mh.c, $$2).a(mh.b, mh.a.c).a(mh.d, true))
         .a(mb.a().a(djq.O, true), mg.a().a(mh.c, $$2).a(mh.b, mh.a.d).a(mh.d, true));
   }

   static ma a(cwj $$0, ahd $$1, ahd $$2, ahd $$3) {
      return mc.a($$0)
         .a(mb.a().a(djq.J, true), mg.a().a(mh.c, $$1))
         .a(mb.a().a(djq.X, dkm.b), mg.a().a(mh.c, $$2).a(mh.d, true))
         .a(mb.a().a(djq.W, dkm.b), mg.a().a(mh.c, $$2).a(mh.b, mh.a.b).a(mh.d, true))
         .a(mb.a().a(djq.Y, dkm.b), mg.a().a(mh.c, $$2).a(mh.b, mh.a.c).a(mh.d, true))
         .a(mb.a().a(djq.Z, dkm.b), mg.a().a(mh.c, $$2).a(mh.b, mh.a.d).a(mh.d, true))
         .a(mb.a().a(djq.X, dkm.c), mg.a().a(mh.c, $$3).a(mh.d, true))
         .a(mb.a().a(djq.W, dkm.c), mg.a().a(mh.c, $$3).a(mh.b, mh.a.b).a(mh.d, true))
         .a(mb.a().a(djq.Y, dkm.c), mg.a().a(mh.c, $$3).a(mh.b, mh.a.c).a(mh.d, true))
         .a(mb.a().a(djq.Z, dkm.c), mg.a().a(mh.c, $$3).a(mh.b, mh.a.d).a(mh.d, true));
   }

   static ma a(cwj $$0, ahd $$1, ahd $$2, ahd $$3, ahd $$4, boolean $$5) {
      return md.a($$0, mg.a().a(mh.d, $$5))
         .a(c())
         .a(
            me.a(djq.q, djq.u)
               .a(false, false, mg.a().a(mh.c, $$2))
               .a(true, false, mg.a().a(mh.c, $$4))
               .a(false, true, mg.a().a(mh.c, $$1))
               .a(true, true, mg.a().a(mh.c, $$3))
         );
   }

   static ma b(cwj $$0, ahd $$1, ahd $$2, ahd $$3) {
      return md.a($$0)
         .a(
            me.a(djq.R, djq.af, djq.bi)
               .a(ic.f, djz.b, dkj.a, mg.a().a(mh.c, $$2))
               .a(ic.e, djz.b, dkj.a, mg.a().a(mh.c, $$2).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.d, djz.b, dkj.a, mg.a().a(mh.c, $$2).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.c, djz.b, dkj.a, mg.a().a(mh.c, $$2).a(mh.b, mh.a.d).a(mh.d, true))
               .a(ic.f, djz.b, dkj.e, mg.a().a(mh.c, $$3))
               .a(ic.e, djz.b, dkj.e, mg.a().a(mh.c, $$3).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.d, djz.b, dkj.e, mg.a().a(mh.c, $$3).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.c, djz.b, dkj.e, mg.a().a(mh.c, $$3).a(mh.b, mh.a.d).a(mh.d, true))
               .a(ic.f, djz.b, dkj.d, mg.a().a(mh.c, $$3).a(mh.b, mh.a.d).a(mh.d, true))
               .a(ic.e, djz.b, dkj.d, mg.a().a(mh.c, $$3).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.d, djz.b, dkj.d, mg.a().a(mh.c, $$3))
               .a(ic.c, djz.b, dkj.d, mg.a().a(mh.c, $$3).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.f, djz.b, dkj.c, mg.a().a(mh.c, $$1))
               .a(ic.e, djz.b, dkj.c, mg.a().a(mh.c, $$1).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.d, djz.b, dkj.c, mg.a().a(mh.c, $$1).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.c, djz.b, dkj.c, mg.a().a(mh.c, $$1).a(mh.b, mh.a.d).a(mh.d, true))
               .a(ic.f, djz.b, dkj.b, mg.a().a(mh.c, $$1).a(mh.b, mh.a.d).a(mh.d, true))
               .a(ic.e, djz.b, dkj.b, mg.a().a(mh.c, $$1).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.d, djz.b, dkj.b, mg.a().a(mh.c, $$1))
               .a(ic.c, djz.b, dkj.b, mg.a().a(mh.c, $$1).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.f, djz.a, dkj.a, mg.a().a(mh.c, $$2).a(mh.a, mh.a.c).a(mh.d, true))
               .a(ic.e, djz.a, dkj.a, mg.a().a(mh.c, $$2).a(mh.a, mh.a.c).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.d, djz.a, dkj.a, mg.a().a(mh.c, $$2).a(mh.a, mh.a.c).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.c, djz.a, dkj.a, mg.a().a(mh.c, $$2).a(mh.a, mh.a.c).a(mh.b, mh.a.d).a(mh.d, true))
               .a(ic.f, djz.a, dkj.e, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.e, djz.a, dkj.e, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.d).a(mh.d, true))
               .a(ic.d, djz.a, dkj.e, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.c, djz.a, dkj.e, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.d, true))
               .a(ic.f, djz.a, dkj.d, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.d, true))
               .a(ic.e, djz.a, dkj.d, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.d, djz.a, dkj.d, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.c, djz.a, dkj.d, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.d).a(mh.d, true))
               .a(ic.f, djz.a, dkj.c, mg.a().a(mh.c, $$1).a(mh.a, mh.a.c).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.e, djz.a, dkj.c, mg.a().a(mh.c, $$1).a(mh.a, mh.a.c).a(mh.b, mh.a.d).a(mh.d, true))
               .a(ic.d, djz.a, dkj.c, mg.a().a(mh.c, $$1).a(mh.a, mh.a.c).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.c, djz.a, dkj.c, mg.a().a(mh.c, $$1).a(mh.a, mh.a.c).a(mh.d, true))
               .a(ic.f, djz.a, dkj.b, mg.a().a(mh.c, $$1).a(mh.a, mh.a.c).a(mh.d, true))
               .a(ic.e, djz.a, dkj.b, mg.a().a(mh.c, $$1).a(mh.a, mh.a.c).a(mh.b, mh.a.c).a(mh.d, true))
               .a(ic.d, djz.a, dkj.b, mg.a().a(mh.c, $$1).a(mh.a, mh.a.c).a(mh.b, mh.a.b).a(mh.d, true))
               .a(ic.c, djz.a, dkj.b, mg.a().a(mh.c, $$1).a(mh.a, mh.a.c).a(mh.b, mh.a.d).a(mh.d, true))
         );
   }

   private static ma c(cwj $$0, ahd $$1, ahd $$2, ahd $$3) {
      return md.a($$0)
         .a(
            me.a(djq.R, djq.af, djq.u)
               .a(ic.c, djz.b, false, mg.a().a(mh.c, $$2))
               .a(ic.d, djz.b, false, mg.a().a(mh.c, $$2).a(mh.b, mh.a.c))
               .a(ic.f, djz.b, false, mg.a().a(mh.c, $$2).a(mh.b, mh.a.b))
               .a(ic.e, djz.b, false, mg.a().a(mh.c, $$2).a(mh.b, mh.a.d))
               .a(ic.c, djz.a, false, mg.a().a(mh.c, $$1))
               .a(ic.d, djz.a, false, mg.a().a(mh.c, $$1).a(mh.b, mh.a.c))
               .a(ic.f, djz.a, false, mg.a().a(mh.c, $$1).a(mh.b, mh.a.b))
               .a(ic.e, djz.a, false, mg.a().a(mh.c, $$1).a(mh.b, mh.a.d))
               .a(ic.c, djz.b, true, mg.a().a(mh.c, $$3))
               .a(ic.d, djz.b, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.c))
               .a(ic.f, djz.b, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.b))
               .a(ic.e, djz.b, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.d))
               .a(ic.c, djz.a, true, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.c))
               .a(ic.d, djz.a, true, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.a))
               .a(ic.f, djz.a, true, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.d))
               .a(ic.e, djz.a, true, mg.a().a(mh.c, $$3).a(mh.a, mh.a.c).a(mh.b, mh.a.b))
         );
   }

   private static ma d(cwj $$0, ahd $$1, ahd $$2, ahd $$3) {
      return md.a($$0)
         .a(
            me.a(djq.R, djq.af, djq.u)
               .a(ic.c, djz.b, false, mg.a().a(mh.c, $$2))
               .a(ic.d, djz.b, false, mg.a().a(mh.c, $$2))
               .a(ic.f, djz.b, false, mg.a().a(mh.c, $$2))
               .a(ic.e, djz.b, false, mg.a().a(mh.c, $$2))
               .a(ic.c, djz.a, false, mg.a().a(mh.c, $$1))
               .a(ic.d, djz.a, false, mg.a().a(mh.c, $$1))
               .a(ic.f, djz.a, false, mg.a().a(mh.c, $$1))
               .a(ic.e, djz.a, false, mg.a().a(mh.c, $$1))
               .a(ic.c, djz.b, true, mg.a().a(mh.c, $$3))
               .a(ic.d, djz.b, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.c))
               .a(ic.f, djz.b, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.b))
               .a(ic.e, djz.b, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.d))
               .a(ic.c, djz.a, true, mg.a().a(mh.c, $$3))
               .a(ic.d, djz.a, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.c))
               .a(ic.f, djz.a, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.b))
               .a(ic.e, djz.a, true, mg.a().a(mh.c, $$3).a(mh.b, mh.a.d))
         );
   }

   static md c(cwj $$0, ahd $$1) {
      return md.a($$0, mg.a().a(mh.c, $$1));
   }

   private static me f() {
      return me.a(djq.I).a(ic.a.b, mg.a()).a(ic.a.c, mg.a().a(mh.a, mh.a.b)).a(ic.a.a, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.b));
   }

   static ma a(cwj $$0, mo $$1, BiConsumer<ahd, Supplier<JsonElement>> $$2) {
      ahd $$3 = mn.g.a($$0, $$1, $$2);
      ahd $$4 = mn.h.a($$0, $$1, $$2);
      ahd $$5 = mn.i.a($$0, $$1, $$2);
      ahd $$6 = mn.j.a($$0, $$1, $$2);
      return md.a($$0, mg.a().a(mh.c, $$6)).a(me.a(djq.I).a(ic.a.a, mg.a().a(mh.c, $$3)).a(ic.a.b, mg.a().a(mh.c, $$4)).a(ic.a.c, mg.a().a(mh.c, $$5)));
   }

   static ma d(cwj $$0, ahd $$1) {
      return md.a($$0, mg.a().a(mh.c, $$1)).a(f());
   }

   private void e(cwj $$0, ahd $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cwj $$0, mq.a $$1) {
      ahd $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cwj $$0, mq.a $$1) {
      ahd $$2 = $$1.create($$0, this.c);
      this.b.accept(md.a($$0, mg.a().a(mh.c, $$2)).a(b()));
   }

   static ma d(cwj $$0, ahd $$1, ahd $$2) {
      return md.a($$0)
         .a(
            me.a(djq.I)
               .a(ic.a.b, mg.a().a(mh.c, $$1))
               .a(ic.a.c, mg.a().a(mh.c, $$2).a(mh.a, mh.a.b))
               .a(ic.a.a, mg.a().a(mh.c, $$2).a(mh.a, mh.a.b).a(mh.b, mh.a.b))
         );
   }

   private void a(cwj $$0, mq.a $$1, mq.a $$2) {
      ahd $$3 = $$1.create($$0, this.c);
      ahd $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ahd a(cwj $$0, String $$1, mm $$2, Function<ahd, mo> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mo.a($$0, $$1)), this.c);
   }

   static ma e(cwj $$0, ahd $$1, ahd $$2) {
      return md.a($$0).a(a(djq.w, $$2, $$1));
   }

   static ma e(cwj $$0, ahd $$1, ahd $$2, ahd $$3) {
      return md.a($$0).a(me.a(djq.bh).a(dki.b, mg.a().a(mh.c, $$1)).a(dki.a, mg.a().a(mh.c, $$2)).a(dki.c, mg.a().a(mh.c, $$3)));
   }

   public void a(cwj $$0) {
      this.b($$0, mq.a);
   }

   public void b(cwj $$0, mq.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cwj $$0, mo $$1, mm $$2) {
      ahd $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private lx.b h(cwj $$0) {
      mq $$1 = this.g.getOrDefault($$0, mq.a.get($$0));
      return new lx.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cwj $$0, cwj $$1, cwj $$2) {
      mo $$3 = mo.u($$0);
      ahd $$4 = mn.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(cwj $$0) {
      mo $$1 = mo.t($$0);
      ahd $$2 = mn.v.a($$0, $$1, this.c);
      ahd $$3 = mn.w.a($$0, $$1, this.c);
      ahd $$4 = mn.x.a($$0, $$1, this.c);
      ahd $$5 = mn.y.a($$0, $$1, this.c);
      ahd $$6 = mn.z.a($$0, $$1, this.c);
      ahd $$7 = mn.A.a($$0, $$1, this.c);
      ahd $$8 = mn.B.a($$0, $$1, this.c);
      ahd $$9 = mn.C.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(cwj $$0, cwj $$1) {
      ahd $$2 = mn.v.a($$0);
      ahd $$3 = mn.w.a($$0);
      ahd $$4 = mn.x.a($$0);
      ahd $$5 = mn.y.a($$0);
      ahd $$6 = mn.z.a($$0);
      ahd $$7 = mn.A.a($$0);
      ahd $$8 = mn.B.a($$0);
      ahd $$9 = mn.C.a($$0);
      this.a($$1, ml.a($$0.k()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cwj $$0) {
      mo $$1 = mo.b($$0);
      ahd $$2 = mn.ak.a($$0, $$1, this.c);
      ahd $$3 = mn.al.a($$0, $$1, this.c);
      ahd $$4 = mn.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cwj $$0) {
      mo $$1 = mo.b($$0);
      ahd $$2 = mn.ah.a($$0, $$1, this.c);
      ahd $$3 = mn.ai.a($$0, $$1, this.c);
      ahd $$4 = mn.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(cwj $$0, cwj $$1) {
      ahd $$2 = mn.ah.a($$0);
      ahd $$3 = mn.ai.a($$0);
      ahd $$4 = mn.aj.a($$0);
      this.a($$1, ml.a($$0.k()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(cwl.sD);
      ahd $$0 = ml.a(cwl.sD);
      ahd $$1 = ml.a(cwl.sD, "_partial_tilt");
      ahd $$2 = ml.a(cwl.sD, "_full_tilt");
      this.b
         .accept(
            md.a(cwl.sD)
               .a(b())
               .a(me.a(djq.bl).a(dkl.a, mg.a().a(mh.c, $$0)).a(dkl.b, mg.a().a(mh.c, $$0)).a(dkl.c, mg.a().a(mh.c, $$1)).a(dkl.d, mg.a().a(mh.c, $$2)))
         );
   }

   private lx.f l(cwj $$0) {
      return new lx.f(mo.n($$0));
   }

   private void m(cwj $$0) {
      this.c($$0, $$0);
   }

   private void c(cwj $$0, cwj $$1) {
      this.b.accept(c($$0, ml.a($$1)));
   }

   private void a(cwj $$0, lx.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cwj $$0, lx.e $$1, mo $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cwj $$0, lx.e $$1) {
      mo $$2 = mo.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cwj $$0, lx.e $$1, mo $$2) {
      ahd $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cwj $$0, lx.e $$1, dkd<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         me $$4 = me.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mo $$5 = mo.c(mo.a($$0, $$4x));
            ahd $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return mg.a().a(mh.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(md.a($$0).a($$4));
      }
   }

   private void a(cwj $$0, cwj $$1, lx.e $$2) {
      this.a($$0, $$2);
      mo $$3 = mo.d($$0);
      ahd $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(cwj $$0, cwj $$1) {
      mq $$2 = mq.p.get($$0);
      ahd $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ahd $$4 = mn.aC.a($$1, $$2.b(), this.c);
      this.b.accept(md.a($$1, mg.a().a(mh.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(cwj $$0, cwj $$1) {
      this.a($$0.k());
      mo $$2 = mo.h($$0);
      mo $$3 = mo.a($$0, $$1);
      ahd $$4 = mn.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            md.a($$1, mg.a().a(mh.c, $$4))
               .a(me.a(djq.R).a(ic.e, mg.a()).a(ic.d, mg.a().a(mh.b, mh.a.d)).a(ic.c, mg.a().a(mh.b, mh.a.b)).a(ic.f, mg.a().a(mh.b, mh.a.c)))
         );
      this.b.accept(md.a($$0).a(me.a(djq.av).a($$2x -> mg.a().a(mh.c, mn.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cwj $$0 = cwl.kC;
      this.a($$0.k());
      ahd $$1 = ml.a($$0, "_top");
      ahd $$2 = ml.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cwj $$0 = cwl.kB;
      this.a($$0.k());
      me $$1 = me.a(dbx.d, djq.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> mg.a().a(mh.c, ml.a($$0, "_top_stage_" + $$1x));
            case b -> mg.a().a(mh.c, ml.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(md.a($$0).a($$1));
   }

   private void a(cwj $$0, cwj $$1, cwj $$2, cwj $$3, cwj $$4, cwj $$5, cwj $$6, cwj $$7) {
      this.a($$0, lx.e.b);
      this.a($$1, lx.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(cwj $$0, lx.e $$1) {
      this.a($$0, "_top");
      ahd $$2 = this.a($$0, "_top", $$1.a(), mo::c);
      ahd $$3 = this.a($$0, "_bottom", $$1.a(), mo::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cwl.iD, "_front");
      ahd $$0 = ml.a(cwl.iD, "_top");
      ahd $$1 = this.a(cwl.iD, "_bottom", lx.e.b.a(), mo::c);
      this.f(cwl.iD, $$0, $$1);
   }

   private void k() {
      ahd $$0 = this.a(cwl.bx, "_top", mn.bk, mo::a);
      ahd $$1 = this.a(cwl.bx, "_bottom", mn.bk, mo::a);
      this.f(cwl.bx, $$0, $$1);
   }

   private void l() {
      this.c(cwl.sF);
      ahd $$0 = ml.a(cwl.sF, "_top");
      ahd $$1 = ml.a(cwl.sF, "_bottom");
      this.b.accept(md.a(cwl.sF).a(b()).a(me.a(djq.ae).a(djw.b, mg.a().a(mh.c, $$1)).a(djw.a, mg.a().a(mh.c, $$0))));
   }

   private void f(cwj $$0, ahd $$1, ahd $$2) {
      this.b.accept(md.a($$0).a(me.a(djq.ae).a(djw.b, mg.a().a(mh.c, $$2)).a(djw.a, mg.a().a(mh.c, $$1))));
   }

   private void n(cwj $$0) {
      mo $$1 = mo.e($$0);
      mo $$2 = mo.e(mo.a($$0, "_corner"));
      ahd $$3 = mn.as.a($$0, $$1, this.c);
      ahd $$4 = mn.at.a($$0, $$2, this.c);
      ahd $$5 = mn.au.a($$0, $$1, this.c);
      ahd $$6 = mn.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            md.a($$0)
               .a(
                  me.a(djq.ag)
                     .a(dke.a, mg.a().a(mh.c, $$3))
                     .a(dke.b, mg.a().a(mh.c, $$3).a(mh.b, mh.a.b))
                     .a(dke.c, mg.a().a(mh.c, $$5).a(mh.b, mh.a.b))
                     .a(dke.d, mg.a().a(mh.c, $$6).a(mh.b, mh.a.b))
                     .a(dke.e, mg.a().a(mh.c, $$5))
                     .a(dke.f, mg.a().a(mh.c, $$6))
                     .a(dke.g, mg.a().a(mh.c, $$4))
                     .a(dke.h, mg.a().a(mh.c, $$4).a(mh.b, mh.a.b))
                     .a(dke.i, mg.a().a(mh.c, $$4).a(mh.b, mh.a.c))
                     .a(dke.j, mg.a().a(mh.c, $$4).a(mh.b, mh.a.d))
               )
         );
   }

   private void o(cwj $$0) {
      ahd $$1 = this.a($$0, "", mn.as, mo::e);
      ahd $$2 = this.a($$0, "", mn.au, mo::e);
      ahd $$3 = this.a($$0, "", mn.av, mo::e);
      ahd $$4 = this.a($$0, "_on", mn.as, mo::e);
      ahd $$5 = this.a($$0, "_on", mn.au, mo::e);
      ahd $$6 = this.a($$0, "_on", mn.av, mo::e);
      me $$7 = me.a(djq.w, djq.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return mg.a().a(mh.c, $$6x ? $$4 : $$1);
            case b:
               return mg.a().a(mh.c, $$6x ? $$4 : $$1).a(mh.b, mh.a.b);
            case c:
               return mg.a().a(mh.c, $$6x ? $$5 : $$2).a(mh.b, mh.a.b);
            case d:
               return mg.a().a(mh.c, $$6x ? $$6 : $$3).a(mh.b, mh.a.b);
            case e:
               return mg.a().a(mh.c, $$6x ? $$5 : $$2);
            case f:
               return mg.a().a(mh.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(md.a($$0).a($$7));
   }

   private lx.a a(ahd $$0, cwj $$1) {
      return new lx.a($$0, $$1);
   }

   private lx.a f(cwj $$0, cwj $$1) {
      return new lx.a(ml.a($$0), $$1);
   }

   private void a(cwj $$0, cmm $$1) {
      ahd $$2 = mn.aa.a($$0, mo.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cwj $$0, ahd $$1) {
      ahd $$2 = mn.aa.a($$0, mo.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(cwj $$0, cwj $$1) {
      this.a($$0);
      ahd $$2 = mq.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cwj $$0) {
      this.a($$0.k());
      ahd $$1 = mq.k.create($$0, this.c);
      ahd $$2 = mq.l.create($$0, this.c);
      ahd $$3 = mq.m.create($$0, this.c);
      ahd $$4 = mq.n.create($$0, this.c);
      this.b
         .accept(
            mc.a($$0)
               .a(mb.a().a(djq.S, 1, 2, 3, 4).a(djq.R, ic.c), mg.a().a(mh.c, $$1))
               .a(mb.a().a(djq.S, 1, 2, 3, 4).a(djq.R, ic.f), mg.a().a(mh.c, $$1).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.S, 1, 2, 3, 4).a(djq.R, ic.d), mg.a().a(mh.c, $$1).a(mh.b, mh.a.c))
               .a(mb.a().a(djq.S, 1, 2, 3, 4).a(djq.R, ic.e), mg.a().a(mh.c, $$1).a(mh.b, mh.a.d))
               .a(mb.a().a(djq.S, 2, 3, 4).a(djq.R, ic.c), mg.a().a(mh.c, $$2))
               .a(mb.a().a(djq.S, 2, 3, 4).a(djq.R, ic.f), mg.a().a(mh.c, $$2).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.S, 2, 3, 4).a(djq.R, ic.d), mg.a().a(mh.c, $$2).a(mh.b, mh.a.c))
               .a(mb.a().a(djq.S, 2, 3, 4).a(djq.R, ic.e), mg.a().a(mh.c, $$2).a(mh.b, mh.a.d))
               .a(mb.a().a(djq.S, 3, 4).a(djq.R, ic.c), mg.a().a(mh.c, $$3))
               .a(mb.a().a(djq.S, 3, 4).a(djq.R, ic.f), mg.a().a(mh.c, $$3).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.S, 3, 4).a(djq.R, ic.d), mg.a().a(mh.c, $$3).a(mh.b, mh.a.c))
               .a(mb.a().a(djq.S, 3, 4).a(djq.R, ic.e), mg.a().a(mh.c, $$3).a(mh.b, mh.a.d))
               .a(mb.a().a(djq.S, 4).a(djq.R, ic.c), mg.a().a(mh.c, $$4))
               .a(mb.a().a(djq.S, 4).a(djq.R, ic.f), mg.a().a(mh.c, $$4).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.S, 4).a(djq.R, ic.d), mg.a().a(mh.c, $$4).a(mh.b, mh.a.c))
               .a(mb.a().a(djq.S, 4).a(djq.R, ic.e), mg.a().a(mh.c, $$4).a(mh.b, mh.a.d))
         );
   }

   private void a(mq.a $$0, cwj... $$1) {
      for (cwj $$2 : $$1) {
         ahd $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(mq.a $$0, cwj... $$1) {
      for (cwj $$2 : $$1) {
         ahd $$3 = $$0.create($$2, this.c);
         this.b.accept(md.a($$2, mg.a().a(mh.c, $$3)).a(c()));
      }
   }

   private void h(cwj $$0, cwj $$1) {
      this.a($$0);
      mo $$2 = mo.b($$0, $$1);
      ahd $$3 = mn.aI.a($$1, $$2, this.c);
      ahd $$4 = mn.aJ.a($$1, $$2, this.c);
      ahd $$5 = mn.aK.a($$1, $$2, this.c);
      ahd $$6 = mn.aG.a($$1, $$2, this.c);
      ahd $$7 = mn.aH.a($$1, $$2, this.c);
      cmm $$8 = $$1.k();
      mn.bx.a(ml.a($$8), mo.F($$0), this.c);
      this.b
         .accept(
            mc.a($$1)
               .a(mg.a().a(mh.c, $$3))
               .a(mb.a().a(djq.L, true), mg.a().a(mh.c, $$4))
               .a(mb.a().a(djq.M, true), mg.a().a(mh.c, $$4).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.N, true), mg.a().a(mh.c, $$5))
               .a(mb.a().a(djq.O, true), mg.a().a(mh.c, $$5).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.L, false), mg.a().a(mh.c, $$6))
               .a(mb.a().a(djq.M, false), mg.a().a(mh.c, $$7))
               .a(mb.a().a(djq.N, false), mg.a().a(mh.c, $$7).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.O, false), mg.a().a(mh.c, $$6).a(mh.b, mh.a.d))
         );
   }

   private void q(cwj $$0) {
      mo $$1 = mo.z($$0);
      ahd $$2 = mn.aL.a($$0, $$1, this.c);
      ahd $$3 = this.a($$0, "_conditional", mn.aL, $$1x -> $$1.c(mp.i, $$1x));
      this.b.accept(md.a($$0).a(a(djq.c, $$3, $$2)).a(e()));
   }

   private void r(cwj $$0) {
      ahd $$1 = mq.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<mg> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> mg.a().a(mh.c, ml.a(cwl.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cwl.mZ);
      this.b
         .accept(
            mc.a(cwl.mZ)
               .a(mb.a().a(djq.aq, 0), this.a(0))
               .a(mb.a().a(djq.aq, 1), this.a(1))
               .a(mb.a().a(djq.bk, djm.b), mg.a().a(mh.c, ml.a(cwl.mZ, "_small_leaves")))
               .a(mb.a().a(djq.bk, djm.c), mg.a().a(mh.c, ml.a(cwl.mZ, "_large_leaves")))
         );
   }

   private me n() {
      return me.a(djq.P)
         .a(ic.a, mg.a().a(mh.a, mh.a.c))
         .a(ic.b, mg.a())
         .a(ic.c, mg.a().a(mh.a, mh.a.b))
         .a(ic.d, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.c))
         .a(ic.e, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.d))
         .a(ic.f, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.b));
   }

   private void o() {
      ahd $$0 = mo.a(cwl.nU, "_top_open");
      this.b
         .accept(
            md.a(cwl.nU)
               .a(this.n())
               .a(
                  me.a(djq.u)
                     .a(false, mg.a().a(mh.c, mq.f.create(cwl.nU, this.c)))
                     .a(true, mg.a().a(mh.c, mq.f.get(cwl.nU).a($$1 -> $$1.a(mp.f, $$0)).a(cwl.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> me a(dkd<T> $$0, T $$1, ahd $$2, ahd $$3) {
      mg $$4 = mg.a().a(mh.c, $$2);
      mg $$5 = mg.a().a(mh.c, $$3);
      return me.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cwj $$0, Function<cwj, mo> $$1) {
      mo $$2 = $$1.apply($$0).b(mp.i, mp.c);
      mo $$3 = $$2.c(mp.g, mo.a($$0, "_front_honey"));
      ahd $$4 = mn.q.a($$0, $$2, this.c);
      ahd $$5 = mn.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(md.a($$0).a(b()).a(a(djq.aN, 5, $$5, $$4)));
   }

   private void a(cwj $$0, dkd<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ahd> $$3 = new Int2ObjectOpenHashMap();
         me $$4 = me.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ahd $$5 = (ahd)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mn.aV, mo::g));
            return mg.a().a(mh.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(md.a($$0).a($$4));
      }
   }

   private void p() {
      ahd $$0 = ml.a(cwl.od, "_floor");
      ahd $$1 = ml.a(cwl.od, "_ceiling");
      ahd $$2 = ml.a(cwl.od, "_wall");
      ahd $$3 = ml.a(cwl.od, "_between_walls");
      this.a(cmu.wf);
      this.b
         .accept(
            md.a(cwl.od)
               .a(
                  me.a(djq.R, djq.V)
                     .a(ic.c, djo.a, mg.a().a(mh.c, $$0))
                     .a(ic.d, djo.a, mg.a().a(mh.c, $$0).a(mh.b, mh.a.c))
                     .a(ic.f, djo.a, mg.a().a(mh.c, $$0).a(mh.b, mh.a.b))
                     .a(ic.e, djo.a, mg.a().a(mh.c, $$0).a(mh.b, mh.a.d))
                     .a(ic.c, djo.b, mg.a().a(mh.c, $$1))
                     .a(ic.d, djo.b, mg.a().a(mh.c, $$1).a(mh.b, mh.a.c))
                     .a(ic.f, djo.b, mg.a().a(mh.c, $$1).a(mh.b, mh.a.b))
                     .a(ic.e, djo.b, mg.a().a(mh.c, $$1).a(mh.b, mh.a.d))
                     .a(ic.c, djo.c, mg.a().a(mh.c, $$2).a(mh.b, mh.a.d))
                     .a(ic.d, djo.c, mg.a().a(mh.c, $$2).a(mh.b, mh.a.b))
                     .a(ic.f, djo.c, mg.a().a(mh.c, $$2))
                     .a(ic.e, djo.c, mg.a().a(mh.c, $$2).a(mh.b, mh.a.c))
                     .a(ic.d, djo.d, mg.a().a(mh.c, $$3).a(mh.b, mh.a.b))
                     .a(ic.c, djo.d, mg.a().a(mh.c, $$3).a(mh.b, mh.a.d))
                     .a(ic.f, djo.d, mg.a().a(mh.c, $$3))
                     .a(ic.e, djo.d, mg.a().a(mh.c, $$3).a(mh.b, mh.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            md.a(cwl.nZ, mg.a().a(mh.c, ml.a(cwl.nZ)))
               .a(
                  me.a(djq.U, djq.R)
                     .a(djl.a, ic.c, mg.a())
                     .a(djl.a, ic.f, mg.a().a(mh.b, mh.a.b))
                     .a(djl.a, ic.d, mg.a().a(mh.b, mh.a.c))
                     .a(djl.a, ic.e, mg.a().a(mh.b, mh.a.d))
                     .a(djl.b, ic.c, mg.a().a(mh.a, mh.a.b))
                     .a(djl.b, ic.f, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.b))
                     .a(djl.b, ic.d, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.c))
                     .a(djl.b, ic.e, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.d))
                     .a(djl.c, ic.d, mg.a().a(mh.a, mh.a.c))
                     .a(djl.c, ic.e, mg.a().a(mh.a, mh.a.c).a(mh.b, mh.a.b))
                     .a(djl.c, ic.c, mg.a().a(mh.a, mh.a.c).a(mh.b, mh.a.c))
                     .a(djl.c, ic.f, mg.a().a(mh.a, mh.a.c).a(mh.b, mh.a.d))
               )
         );
   }

   private void d(cwj $$0, mq.a $$1) {
      ahd $$2 = $$1.create($$0, this.c);
      ahd $$3 = mo.a($$0, "_front_on");
      ahd $$4 = $$1.get($$0).a($$1x -> $$1x.a(mp.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(md.a($$0).a(a(djq.r, $$4, $$2)).a(b()));
   }

   private void a(cwj... $$0) {
      ahd $$1 = ml.a("campfire_off");

      for (cwj $$2 : $$0) {
         ahd $$3 = mn.bc.a($$2, mo.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(md.a($$2).a(a(djq.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cwj $$0) {
      ahd $$1 = mn.bt.a($$0, mo.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cwj $$0) {
      ahd $$1;
      if ($$0 == cwl.tj) {
         $$1 = mn.bv.a($$0, mo.m($$0), this.c);
      } else {
         $$1 = mn.bu.a($$0, mo.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mo $$0 = mo.a(mo.G(cwl.cl), mo.G(cwl.n));
      ahd $$1 = mn.j.a(cwl.cl, $$0, this.c);
      this.b.accept(c(cwl.cl, $$1));
   }

   private void s() {
      this.a(cmu.lG);
      this.b
         .accept(
            mc.a(cwl.cw)
               .a(
                  mb.b(
                     mb.a().a(djq.ab, dkf.c).a(djq.aa, dkf.c).a(djq.ac, dkf.c).a(djq.ad, dkf.c),
                     mb.a().a(djq.ab, dkf.b, dkf.a).a(djq.aa, dkf.b, dkf.a),
                     mb.a().a(djq.aa, dkf.b, dkf.a).a(djq.ac, dkf.b, dkf.a),
                     mb.a().a(djq.ac, dkf.b, dkf.a).a(djq.ad, dkf.b, dkf.a),
                     mb.a().a(djq.ad, dkf.b, dkf.a).a(djq.ab, dkf.b, dkf.a)
                  ),
                  mg.a().a(mh.c, ml.a("redstone_dust_dot"))
               )
               .a(mb.a().a(djq.ab, dkf.b, dkf.a), mg.a().a(mh.c, ml.a("redstone_dust_side0")))
               .a(mb.a().a(djq.ac, dkf.b, dkf.a), mg.a().a(mh.c, ml.a("redstone_dust_side_alt0")))
               .a(mb.a().a(djq.aa, dkf.b, dkf.a), mg.a().a(mh.c, ml.a("redstone_dust_side_alt1")).a(mh.b, mh.a.d))
               .a(mb.a().a(djq.ad, dkf.b, dkf.a), mg.a().a(mh.c, ml.a("redstone_dust_side1")).a(mh.b, mh.a.d))
               .a(mb.a().a(djq.ab, dkf.a), mg.a().a(mh.c, ml.a("redstone_dust_up")))
               .a(mb.a().a(djq.aa, dkf.a), mg.a().a(mh.c, ml.a("redstone_dust_up")).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.ac, dkf.a), mg.a().a(mh.c, ml.a("redstone_dust_up")).a(mh.b, mh.a.c))
               .a(mb.a().a(djq.ad, dkf.a), mg.a().a(mh.c, ml.a("redstone_dust_up")).a(mh.b, mh.a.d))
         );
   }

   private void t() {
      this.a(cmu.lK);
      this.b
         .accept(
            md.a(cwl.gY)
               .a(c())
               .a(
                  me.a(djq.bd, djq.w)
                     .a(djt.a, false, mg.a().a(mh.c, ml.a(cwl.gY)))
                     .a(djt.a, true, mg.a().a(mh.c, ml.a(cwl.gY, "_on")))
                     .a(djt.b, false, mg.a().a(mh.c, ml.a(cwl.gY, "_subtract")))
                     .a(djt.b, true, mg.a().a(mh.c, ml.a(cwl.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mo $$0 = mo.a(cwl.jR);
      mo $$1 = mo.a(mo.a(cwl.jE, "_side"), $$0.a(mp.f));
      ahd $$2 = mn.ab.a(cwl.jE, $$1, this.c);
      ahd $$3 = mn.ac.a(cwl.jE, $$1, this.c);
      ahd $$4 = mn.j.b(cwl.jE, "_double", $$1, this.c);
      this.b.accept(e(cwl.jE, $$2, $$3, $$4));
      this.b.accept(c(cwl.jR, mn.c.a(cwl.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cmu.sn);
      this.b
         .accept(
            mc.a(cwl.fs)
               .a(mg.a().a(mh.c, mo.G(cwl.fs)))
               .a(mb.a().a(djq.k, true), mg.a().a(mh.c, mo.a(cwl.fs, "_bottle0")))
               .a(mb.a().a(djq.l, true), mg.a().a(mh.c, mo.a(cwl.fs, "_bottle1")))
               .a(mb.a().a(djq.m, true), mg.a().a(mh.c, mo.a(cwl.fs, "_bottle2")))
               .a(mb.a().a(djq.k, false), mg.a().a(mh.c, mo.a(cwl.fs, "_empty0")))
               .a(mb.a().a(djq.l, false), mg.a().a(mh.c, mo.a(cwl.fs, "_empty1")))
               .a(mb.a().a(djq.m, false), mg.a().a(mh.c, mo.a(cwl.fs, "_empty2")))
         );
   }

   private void u(cwj $$0) {
      ahd $$1 = mn.bp.a($$0, mo.b($$0), this.c);
      ahd $$2 = ml.a("mushroom_block_inside");
      this.b
         .accept(
            mc.a($$0)
               .a(mb.a().a(djq.L, true), mg.a().a(mh.c, $$1))
               .a(mb.a().a(djq.M, true), mg.a().a(mh.c, $$1).a(mh.b, mh.a.b).a(mh.d, true))
               .a(mb.a().a(djq.N, true), mg.a().a(mh.c, $$1).a(mh.b, mh.a.c).a(mh.d, true))
               .a(mb.a().a(djq.O, true), mg.a().a(mh.c, $$1).a(mh.b, mh.a.d).a(mh.d, true))
               .a(mb.a().a(djq.J, true), mg.a().a(mh.c, $$1).a(mh.a, mh.a.d).a(mh.d, true))
               .a(mb.a().a(djq.K, true), mg.a().a(mh.c, $$1).a(mh.a, mh.a.b).a(mh.d, true))
               .a(mb.a().a(djq.L, false), mg.a().a(mh.c, $$2))
               .a(mb.a().a(djq.M, false), mg.a().a(mh.c, $$2).a(mh.b, mh.a.b).a(mh.d, false))
               .a(mb.a().a(djq.N, false), mg.a().a(mh.c, $$2).a(mh.b, mh.a.c).a(mh.d, false))
               .a(mb.a().a(djq.O, false), mg.a().a(mh.c, $$2).a(mh.b, mh.a.d).a(mh.d, false))
               .a(mb.a().a(djq.J, false), mg.a().a(mh.c, $$2).a(mh.a, mh.a.d).a(mh.d, false))
               .a(mb.a().a(djq.K, false), mg.a().a(mh.c, $$2).a(mh.a, mh.a.b).a(mh.d, false))
         );
      this.a($$0, mq.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cmu.ry);
      this.b
         .accept(
            md.a(cwl.eg)
               .a(
                  me.a(djq.ay)
                     .a(0, mg.a().a(mh.c, ml.a(cwl.eg)))
                     .a(1, mg.a().a(mh.c, ml.a(cwl.eg, "_slice1")))
                     .a(2, mg.a().a(mh.c, ml.a(cwl.eg, "_slice2")))
                     .a(3, mg.a().a(mh.c, ml.a(cwl.eg, "_slice3")))
                     .a(4, mg.a().a(mh.c, ml.a(cwl.eg, "_slice4")))
                     .a(5, mg.a().a(mh.c, ml.a(cwl.eg, "_slice5")))
                     .a(6, mg.a().a(mh.c, ml.a(cwl.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mo $$0 = new mo()
         .a(mp.c, mo.a(cwl.nX, "_side3"))
         .a(mp.o, mo.G(cwl.t))
         .a(mp.n, mo.a(cwl.nX, "_top"))
         .a(mp.j, mo.a(cwl.nX, "_side3"))
         .a(mp.l, mo.a(cwl.nX, "_side3"))
         .a(mp.k, mo.a(cwl.nX, "_side1"))
         .a(mp.m, mo.a(cwl.nX, "_side2"));
      this.b.accept(c(cwl.nX, mn.a.a(cwl.nX, $$0, this.c)));
   }

   private void y() {
      mo $$0 = new mo()
         .a(mp.c, mo.a(cwl.ob, "_front"))
         .a(mp.o, mo.a(cwl.ob, "_bottom"))
         .a(mp.n, mo.a(cwl.ob, "_top"))
         .a(mp.j, mo.a(cwl.ob, "_front"))
         .a(mp.k, mo.a(cwl.ob, "_front"))
         .a(mp.l, mo.a(cwl.ob, "_side"))
         .a(mp.m, mo.a(cwl.ob, "_side"));
      this.b.accept(c(cwl.ob, mn.a.a(cwl.ob, $$0, this.c)));
   }

   private void a(cwj $$0, cwj $$1, BiFunction<cwj, cwj, mo> $$2) {
      mo $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mn.a.a($$0, $$3, this.c)));
   }

   public void b(cwj $$0) {
      mo $$1 = new mo()
         .a(mp.c, mo.a($$0, "_particle"))
         .a(mp.o, mo.a($$0, "_down"))
         .a(mp.n, mo.a($$0, "_up"))
         .a(mp.j, mo.a($$0, "_north"))
         .a(mp.k, mo.a($$0, "_south"))
         .a(mp.l, mo.a($$0, "_east"))
         .a(mp.m, mo.a($$0, "_west"));
      this.b.accept(c($$0, mn.a.a($$0, $$1, this.c)));
   }

   private void z() {
      mo $$0 = mo.k(cwl.eZ);
      this.b.accept(c(cwl.eZ, ml.a(cwl.eZ)));
      this.a(cwl.ee, $$0);
      this.a(cwl.ef, $$0);
   }

   private void a(cwj $$0, mo $$1) {
      ahd $$2 = mn.p.a($$0, $$1.c(mp.g, mo.G($$0)), this.c);
      this.b.accept(md.a($$0, mg.a().a(mh.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cmu.so);
      this.m(cwl.ft);
      this.b.accept(c(cwl.fv, mn.bs.a(cwl.fv, mo.j(mo.a(cwl.H, "_still")), this.c)));
      this.b
         .accept(
            md.a(cwl.fu)
               .a(
                  me.a(dar.g)
                     .a(1, mg.a().a(mh.c, mn.bq.a(cwl.fu, "_level1", mo.j(mo.a(cwl.G, "_still")), this.c)))
                     .a(2, mg.a().a(mh.c, mn.br.a(cwl.fu, "_level2", mo.j(mo.a(cwl.G, "_still")), this.c)))
                     .a(3, mg.a().a(mh.c, mn.bs.a(cwl.fu, "_full", mo.j(mo.a(cwl.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            md.a(cwl.fw)
               .a(
                  me.a(dar.g)
                     .a(1, mg.a().a(mh.c, mn.bq.a(cwl.fw, "_level1", mo.j(mo.G(cwl.qP)), this.c)))
                     .a(2, mg.a().a(mh.c, mn.br.a(cwl.fw, "_level2", mo.j(mo.G(cwl.qP)), this.c)))
                     .a(3, mg.a().a(mh.c, mn.bs.a(cwl.fw, "_full", mo.j(mo.G(cwl.qP)), this.c)))
               )
         );
   }

   private void B() {
      mo $$0 = mo.b(cwl.kv);
      ahd $$1 = mn.aE.a(cwl.kv, $$0, this.c);
      ahd $$2 = this.a(cwl.kv, "_dead", mn.aE, $$1x -> $$0.c(mp.b, $$1x));
      this.b.accept(md.a(cwl.kv).a(a(djq.au, 5, $$2, $$1)));
   }

   private void C() {
      ahd $$0 = ml.a(cwl.tq);
      ahd $$1 = ml.a(cwl.tq, "_triggered");
      ahd $$2 = ml.a(cwl.tq, "_crafting");
      ahd $$3 = ml.a(cwl.tq, "_crafting_triggered");
      this.b
         .accept(
            md.a(cwl.tq)
               .a(me.a(djq.T).a($$0x -> this.a($$0x, mg.a())))
               .a(
                  me.a(djq.A, cyc.b)
                     .a(false, false, mg.a().a(mh.c, $$0))
                     .a(true, true, mg.a().a(mh.c, $$3))
                     .a(true, false, mg.a().a(mh.c, $$1))
                     .a(false, true, mg.a().a(mh.c, $$2))
               )
         );
   }

   private void v(cwj $$0) {
      mo $$1 = new mo().a(mp.f, mo.a(cwl.cD, "_top")).a(mp.i, mo.a(cwl.cD, "_side")).a(mp.g, mo.a($$0, "_front"));
      mo $$2 = new mo().a(mp.i, mo.a(cwl.cD, "_top")).a(mp.g, mo.a($$0, "_front_vertical"));
      ahd $$3 = mn.p.a($$0, $$1, this.c);
      ahd $$4 = mn.r.a($$0, $$2, this.c);
      this.b
         .accept(
            md.a($$0)
               .a(
                  me.a(djq.P)
                     .a(ic.a, mg.a().a(mh.c, $$4).a(mh.a, mh.a.c))
                     .a(ic.b, mg.a().a(mh.c, $$4))
                     .a(ic.c, mg.a().a(mh.c, $$3))
                     .a(ic.f, mg.a().a(mh.c, $$3).a(mh.b, mh.a.b))
                     .a(ic.d, mg.a().a(mh.c, $$3).a(mh.b, mh.a.c))
                     .a(ic.e, mg.a().a(mh.c, $$3).a(mh.b, mh.a.d))
               )
         );
   }

   private void D() {
      ahd $$0 = ml.a(cwl.fy);
      ahd $$1 = ml.a(cwl.fy, "_filled");
      this.b.accept(md.a(cwl.fy).a(me.a(djq.h).a(false, mg.a().a(mh.c, $$0)).a(true, mg.a().a(mh.c, $$1))).a(c()));
   }

   private void E() {
      ahd $$0 = ml.a(cwl.ku, "_side");
      ahd $$1 = ml.a(cwl.ku, "_noside");
      ahd $$2 = ml.a(cwl.ku, "_noside1");
      ahd $$3 = ml.a(cwl.ku, "_noside2");
      ahd $$4 = ml.a(cwl.ku, "_noside3");
      this.b
         .accept(
            mc.a(cwl.ku)
               .a(mb.a().a(djq.L, true), mg.a().a(mh.c, $$0))
               .a(mb.a().a(djq.M, true), mg.a().a(mh.c, $$0).a(mh.b, mh.a.b).a(mh.d, true))
               .a(mb.a().a(djq.N, true), mg.a().a(mh.c, $$0).a(mh.b, mh.a.c).a(mh.d, true))
               .a(mb.a().a(djq.O, true), mg.a().a(mh.c, $$0).a(mh.b, mh.a.d).a(mh.d, true))
               .a(mb.a().a(djq.J, true), mg.a().a(mh.c, $$0).a(mh.a, mh.a.d).a(mh.d, true))
               .a(mb.a().a(djq.K, true), mg.a().a(mh.c, $$0).a(mh.a, mh.a.b).a(mh.d, true))
               .a(mb.a().a(djq.L, false), mg.a().a(mh.c, $$1).a(mh.e, 2), mg.a().a(mh.c, $$2), mg.a().a(mh.c, $$3), mg.a().a(mh.c, $$4))
               .a(
                  mb.a().a(djq.M, false),
                  mg.a().a(mh.c, $$2).a(mh.b, mh.a.b).a(mh.d, true),
                  mg.a().a(mh.c, $$3).a(mh.b, mh.a.b).a(mh.d, true),
                  mg.a().a(mh.c, $$4).a(mh.b, mh.a.b).a(mh.d, true),
                  mg.a().a(mh.c, $$1).a(mh.e, 2).a(mh.b, mh.a.b).a(mh.d, true)
               )
               .a(
                  mb.a().a(djq.N, false),
                  mg.a().a(mh.c, $$3).a(mh.b, mh.a.c).a(mh.d, true),
                  mg.a().a(mh.c, $$4).a(mh.b, mh.a.c).a(mh.d, true),
                  mg.a().a(mh.c, $$1).a(mh.e, 2).a(mh.b, mh.a.c).a(mh.d, true),
                  mg.a().a(mh.c, $$2).a(mh.b, mh.a.c).a(mh.d, true)
               )
               .a(
                  mb.a().a(djq.O, false),
                  mg.a().a(mh.c, $$4).a(mh.b, mh.a.d).a(mh.d, true),
                  mg.a().a(mh.c, $$1).a(mh.e, 2).a(mh.b, mh.a.d).a(mh.d, true),
                  mg.a().a(mh.c, $$2).a(mh.b, mh.a.d).a(mh.d, true),
                  mg.a().a(mh.c, $$3).a(mh.b, mh.a.d).a(mh.d, true)
               )
               .a(
                  mb.a().a(djq.J, false),
                  mg.a().a(mh.c, $$1).a(mh.e, 2).a(mh.a, mh.a.d).a(mh.d, true),
                  mg.a().a(mh.c, $$4).a(mh.a, mh.a.d).a(mh.d, true),
                  mg.a().a(mh.c, $$2).a(mh.a, mh.a.d).a(mh.d, true),
                  mg.a().a(mh.c, $$3).a(mh.a, mh.a.d).a(mh.d, true)
               )
               .a(
                  mb.a().a(djq.K, false),
                  mg.a().a(mh.c, $$4).a(mh.a, mh.a.b).a(mh.d, true),
                  mg.a().a(mh.c, $$3).a(mh.a, mh.a.b).a(mh.d, true),
                  mg.a().a(mh.c, $$2).a(mh.a, mh.a.b).a(mh.d, true),
                  mg.a().a(mh.c, $$1).a(mh.e, 2).a(mh.a, mh.a.b).a(mh.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            mc.a(cwl.pc)
               .a(mg.a().a(mh.c, mo.G(cwl.pc)))
               .a(mb.a().a(djq.aL, 1), mg.a().a(mh.c, mo.a(cwl.pc, "_contents1")))
               .a(mb.a().a(djq.aL, 2), mg.a().a(mh.c, mo.a(cwl.pc, "_contents2")))
               .a(mb.a().a(djq.aL, 3), mg.a().a(mh.c, mo.a(cwl.pc, "_contents3")))
               .a(mb.a().a(djq.aL, 4), mg.a().a(mh.c, mo.a(cwl.pc, "_contents4")))
               .a(mb.a().a(djq.aL, 5), mg.a().a(mh.c, mo.a(cwl.pc, "_contents5")))
               .a(mb.a().a(djq.aL, 6), mg.a().a(mh.c, mo.a(cwl.pc, "_contents6")))
               .a(mb.a().a(djq.aL, 7), mg.a().a(mh.c, mo.a(cwl.pc, "_contents7")))
               .a(mb.a().a(djq.aL, 8), mg.a().a(mh.c, mo.a(cwl.pc, "_contents_ready")))
         );
   }

   private void w(cwj $$0) {
      ahd $$1 = mn.c.a($$0, mo.a($$0), this.c);
      ahd $$2 = this.a($$0, "_powered", mn.c, mo::b);
      ahd $$3 = this.a($$0, "_lit", mn.c, mo::b);
      ahd $$4 = this.a($$0, "_lit_powered", mn.c, mo::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private ma a(cwj $$0, ahd $$1, ahd $$2, ahd $$3, ahd $$4) {
      return md.a($$0).a(me.a(djq.r, djq.w).a(($$4x, $$5) -> $$4x ? mg.a().a(mh.c, $$5 ? $$4 : $$2) : mg.a().a(mh.c, $$5 ? $$3 : $$1)));
   }

   private void i(cwj $$0, cwj $$1) {
      ahd $$2 = ml.a($$0);
      ahd $$3 = ml.a($$0, "_powered");
      ahd $$4 = ml.a($$0, "_lit");
      ahd $$5 = ml.a($$0, "_lit_powered");
      this.a($$1, ml.a($$0.k()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(cwj $$0) {
      this.c($$0);
      this.b.accept(md.a($$0, mg.a().a(mh.c, mn.ao.a($$0, mo.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(cwl.qy);
      this.x(cwl.qx);
      this.x(cwl.qw);
      this.x(cwl.qv);
   }

   private void H() {
      this.c(cwl.st);
      me.b<ic, djx> $$0 = me.a(djq.bm, djq.bn);

      for (djx $$1 : djx.values()) {
         $$0.a(ic.b, $$1, this.a(ic.b, $$1));
      }

      for (djx $$2 : djx.values()) {
         $$0.a(ic.a, $$2, this.a(ic.a, $$2));
      }

      this.b.accept(md.a(cwl.st).a($$0));
   }

   private mg a(ic $$0, djx $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mo $$3 = mo.c(mo.a(cwl.st, $$2));
      return mg.a().a(mh.c, mn.an.a(cwl.st, $$2, $$3, this.c));
   }

   private void y(cwj $$0) {
      mo $$1 = new mo().a(mp.e, mo.G(cwl.dV)).a(mp.f, mo.G($$0)).a(mp.i, mo.a($$0, "_side"));
      this.b.accept(c($$0, mn.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ahd $$0 = mo.a(cwl.gZ, "_side");
      mo $$1 = new mo().a(mp.f, mo.a(cwl.gZ, "_top")).a(mp.i, $$0);
      mo $$2 = new mo().a(mp.f, mo.a(cwl.gZ, "_inverted_top")).a(mp.i, $$0);
      this.b
         .accept(
            md.a(cwl.gZ)
               .a(me.a(djq.p).a(false, mg.a().a(mh.c, mn.aF.a(cwl.gZ, $$1, this.c))).a(true, mg.a().a(mh.c, mn.aF.a(ml.a(cwl.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(cwj $$0) {
      this.b.accept(md.a($$0, mg.a().a(mh.c, ml.a($$0))).a(this.n()));
   }

   private void J() {
      cwj $$0 = cwl.ss;
      ahd $$1 = ml.a($$0, "_on");
      ahd $$2 = ml.a($$0);
      this.b.accept(md.a($$0, mg.a().a(mh.c, ml.a($$0))).a(this.n()).a(a(djq.w, $$1, $$2)));
   }

   private void K() {
      mo $$0 = new mo().a(mp.B, mo.G(cwl.j)).a(mp.f, mo.G(cwl.cC));
      mo $$1 = new mo().a(mp.B, mo.G(cwl.j)).a(mp.f, mo.a(cwl.cC, "_moist"));
      ahd $$2 = mn.aW.a(cwl.cC, $$0, this.c);
      ahd $$3 = mn.aW.a(mo.a(cwl.cC, "_moist"), $$1, this.c);
      this.b.accept(md.a(cwl.cC).a(a(djq.aQ, 7, $$3, $$2)));
   }

   private List<ahd> A(cwj $$0) {
      ahd $$1 = mn.aX.a(ml.a($$0, "_floor0"), mo.v($$0), this.c);
      ahd $$2 = mn.aX.a(ml.a($$0, "_floor1"), mo.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ahd> B(cwj $$0) {
      ahd $$1 = mn.aY.a(ml.a($$0, "_side0"), mo.v($$0), this.c);
      ahd $$2 = mn.aY.a(ml.a($$0, "_side1"), mo.w($$0), this.c);
      ahd $$3 = mn.aZ.a(ml.a($$0, "_side_alt0"), mo.v($$0), this.c);
      ahd $$4 = mn.aZ.a(ml.a($$0, "_side_alt1"), mo.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ahd> C(cwj $$0) {
      ahd $$1 = mn.ba.a(ml.a($$0, "_up0"), mo.v($$0), this.c);
      ahd $$2 = mn.ba.a(ml.a($$0, "_up1"), mo.w($$0), this.c);
      ahd $$3 = mn.bb.a(ml.a($$0, "_up_alt0"), mo.v($$0), this.c);
      ahd $$4 = mn.bb.a(ml.a($$0, "_up_alt1"), mo.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<mg> a(List<ahd> $$0, UnaryOperator<mg> $$1) {
      return $$0.stream().map($$0x -> mg.a().a(mh.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      mb $$0 = mb.a().a(djq.L, false).a(djq.M, false).a(djq.N, false).a(djq.O, false).a(djq.J, false);
      List<ahd> $$1 = this.A(cwl.cr);
      List<ahd> $$2 = this.B(cwl.cr);
      List<ahd> $$3 = this.C(cwl.cr);
      this.b
         .accept(
            mc.a(cwl.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(mb.b(mb.a().a(djq.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(mb.b(mb.a().a(djq.M, true), $$0), a($$2, $$0x -> $$0x.a(mh.b, mh.a.b)))
               .a(mb.b(mb.a().a(djq.N, true), $$0), a($$2, $$0x -> $$0x.a(mh.b, mh.a.c)))
               .a(mb.b(mb.a().a(djq.O, true), $$0), a($$2, $$0x -> $$0x.a(mh.b, mh.a.d)))
               .a(mb.a().a(djq.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ahd> $$0 = this.A(cwl.cs);
      List<ahd> $$1 = this.B(cwl.cs);
      this.b
         .accept(
            mc.a(cwl.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(mh.b, mh.a.b)))
               .a(a($$1, $$0x -> $$0x.a(mh.b, mh.a.c)))
               .a(a($$1, $$0x -> $$0x.a(mh.b, mh.a.d)))
         );
   }

   private void D(cwj $$0) {
      ahd $$1 = mq.t.create($$0, this.c);
      ahd $$2 = mq.u.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(md.a($$0).a(a(djq.j, $$2, $$1)));
   }

   private void N() {
      mo $$0 = mo.a(mo.a(cwl.ad, "_side"), mo.a(cwl.ad, "_top"));
      ahd $$1 = mn.j.a(cwl.ad, $$0, this.c);
      this.b.accept(d(cwl.ad, $$1));
   }

   private void O() {
      this.a(cmu.ad);
      cwj $$0 = cwl.E;
      me.b<Boolean, Integer> $$1 = me.a(dbd.d, dbd.b);
      ahd $$2 = ml.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ahd $$4 = ml.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, mg.a().a(mh.c, $$4));
         $$1.a(false, $$3, mg.a().a(mh.c, $$2));
      }

      this.b.accept(md.a(cwl.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            md.a(cwl.kI)
               .a(
                  me.a(djq.as)
                     .a(0, mg.a().a(mh.c, this.a(cwl.kI, "_0", mn.c, mo::b)))
                     .a(1, mg.a().a(mh.c, this.a(cwl.kI, "_1", mn.c, mo::b)))
                     .a(2, mg.a().a(mh.c, this.a(cwl.kI, "_2", mn.c, mo::b)))
                     .a(3, mg.a().a(mh.c, this.a(cwl.kI, "_3", mn.c, mo::b)))
               )
         );
   }

   private void Q() {
      ahd $$0 = mo.G(cwl.j);
      mo $$1 = new mo().a(mp.e, $$0).b(mp.e, mp.c).a(mp.f, mo.a(cwl.i, "_top")).a(mp.i, mo.a(cwl.i, "_snow"));
      mg $$2 = mg.a().a(mh.c, mn.n.a(cwl.i, "_snow", $$1, this.c));
      this.a(cwl.i, ml.a(cwl.i), $$2);
      ahd $$3 = mq.f.get(cwl.fl).a($$1x -> $$1x.a(mp.e, $$0)).a(cwl.fl, this.c);
      this.a(cwl.fl, $$3, $$2);
      ahd $$4 = mq.f.get(cwl.l).a($$1x -> $$1x.a(mp.e, $$0)).a(cwl.l, this.c);
      this.a(cwl.l, $$4, $$2);
   }

   private void a(cwj $$0, ahd $$1, mg $$2) {
      List<mg> $$3 = Arrays.asList(a($$1));
      this.b.accept(md.a($$0).a(me.a(djq.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cmu.re);
      this.b
         .accept(
            md.a(cwl.fC)
               .a(
                  me.a(djq.ar)
                     .a(0, mg.a().a(mh.c, ml.a(cwl.fC, "_stage0")))
                     .a(1, mg.a().a(mh.c, ml.a(cwl.fC, "_stage1")))
                     .a(2, mg.a().a(mh.c, ml.a(cwl.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(cwl.kE, ml.a(cwl.kE)));
   }

   private void j(cwj $$0, cwj $$1) {
      mo $$2 = mo.b($$1);
      ahd $$3 = mn.Y.a($$0, $$2, this.c);
      ahd $$4 = mn.Z.a($$0, $$2, this.c);
      this.b.accept(md.a($$0).a(a(djq.aT, 1, $$4, $$3)));
   }

   private void T() {
      ahd $$0 = ml.a(cwl.hc);
      ahd $$1 = ml.a(cwl.hc, "_side");
      this.a(cmu.lQ);
      this.b
         .accept(
            md.a(cwl.hc)
               .a(
                  me.a(djq.Q)
                     .a(ic.a, mg.a().a(mh.c, $$0))
                     .a(ic.c, mg.a().a(mh.c, $$1))
                     .a(ic.f, mg.a().a(mh.c, $$1).a(mh.b, mh.a.b))
                     .a(ic.d, mg.a().a(mh.c, $$1).a(mh.b, mh.a.c))
                     .a(ic.e, mg.a().a(mh.c, $$1).a(mh.b, mh.a.d))
               )
         );
   }

   private void k(cwj $$0, cwj $$1) {
      ahd $$2 = ml.a($$0);
      this.b.accept(md.a($$1, mg.a().a(mh.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ahd $$0 = ml.a(cwl.eW, "_post_ends");
      ahd $$1 = ml.a(cwl.eW, "_post");
      ahd $$2 = ml.a(cwl.eW, "_cap");
      ahd $$3 = ml.a(cwl.eW, "_cap_alt");
      ahd $$4 = ml.a(cwl.eW, "_side");
      ahd $$5 = ml.a(cwl.eW, "_side_alt");
      this.b
         .accept(
            mc.a(cwl.eW)
               .a(mg.a().a(mh.c, $$0))
               .a(mb.a().a(djq.L, false).a(djq.M, false).a(djq.N, false).a(djq.O, false), mg.a().a(mh.c, $$1))
               .a(mb.a().a(djq.L, true).a(djq.M, false).a(djq.N, false).a(djq.O, false), mg.a().a(mh.c, $$2))
               .a(mb.a().a(djq.L, false).a(djq.M, true).a(djq.N, false).a(djq.O, false), mg.a().a(mh.c, $$2).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.L, false).a(djq.M, false).a(djq.N, true).a(djq.O, false), mg.a().a(mh.c, $$3))
               .a(mb.a().a(djq.L, false).a(djq.M, false).a(djq.N, false).a(djq.O, true), mg.a().a(mh.c, $$3).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.L, true), mg.a().a(mh.c, $$4))
               .a(mb.a().a(djq.M, true), mg.a().a(mh.c, $$4).a(mh.b, mh.a.b))
               .a(mb.a().a(djq.N, true), mg.a().a(mh.c, $$5))
               .a(mb.a().a(djq.O, true), mg.a().a(mh.c, $$5).a(mh.b, mh.a.b))
         );
      this.d(cwl.eW);
   }

   private void E(cwj $$0) {
      this.b.accept(md.a($$0, mg.a().a(mh.c, ml.a($$0))).a(b()));
   }

   private void V() {
      ahd $$0 = ml.a(cwl.dw);
      ahd $$1 = ml.a(cwl.dw, "_on");
      this.d(cwl.dw);
      this.b
         .accept(
            md.a(cwl.dw)
               .a(a(djq.w, $$0, $$1))
               .a(
                  me.a(djq.U, djq.R)
                     .a(djl.c, ic.c, mg.a().a(mh.a, mh.a.c).a(mh.b, mh.a.c))
                     .a(djl.c, ic.f, mg.a().a(mh.a, mh.a.c).a(mh.b, mh.a.d))
                     .a(djl.c, ic.d, mg.a().a(mh.a, mh.a.c))
                     .a(djl.c, ic.e, mg.a().a(mh.a, mh.a.c).a(mh.b, mh.a.b))
                     .a(djl.a, ic.c, mg.a())
                     .a(djl.a, ic.f, mg.a().a(mh.b, mh.a.b))
                     .a(djl.a, ic.d, mg.a().a(mh.b, mh.a.c))
                     .a(djl.a, ic.e, mg.a().a(mh.b, mh.a.d))
                     .a(djl.b, ic.c, mg.a().a(mh.a, mh.a.b))
                     .a(djl.b, ic.f, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.b))
                     .a(djl.b, ic.d, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.c))
                     .a(djl.b, ic.e, mg.a().a(mh.a, mh.a.b).a(mh.b, mh.a.d))
               )
         );
   }

   private void W() {
      this.d(cwl.fm);
      this.b.accept(b(cwl.fm, ml.a(cwl.fm)));
   }

   private void X() {
      this.d(cwl.tn);
      this.b.accept(c(cwl.tn, ml.a(cwl.tn)));
   }

   private void Y() {
      this.b.accept(md.a(cwl.ed).a(me.a(djq.H).a(ic.a.a, mg.a().a(mh.c, ml.a(cwl.ed, "_ns"))).a(ic.a.c, mg.a().a(mh.c, ml.a(cwl.ed, "_ew")))));
   }

   private void Z() {
      ahd $$0 = mq.a.create(cwl.dV, this.c);
      this.b
         .accept(
            md.a(
               cwl.dV,
               mg.a().a(mh.c, $$0),
               mg.a().a(mh.c, $$0).a(mh.a, mh.a.b),
               mg.a().a(mh.c, $$0).a(mh.a, mh.a.c),
               mg.a().a(mh.c, $$0).a(mh.a, mh.a.d),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.b),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.b).a(mh.a, mh.a.b),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.b).a(mh.a, mh.a.c),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.b).a(mh.a, mh.a.d),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.c),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.c).a(mh.a, mh.a.b),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.c).a(mh.a, mh.a.c),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.c).a(mh.a, mh.a.d),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.d),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.d).a(mh.a, mh.a.b),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.d).a(mh.a, mh.a.c),
               mg.a().a(mh.c, $$0).a(mh.b, mh.a.d).a(mh.a, mh.a.d)
            )
         );
   }

   private void aa() {
      ahd $$0 = ml.a(cwl.kO);
      ahd $$1 = ml.a(cwl.kO, "_on");
      this.b.accept(md.a(cwl.kO).a(a(djq.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      mo $$0 = new mo().a(mp.e, mo.a(cwl.by, "_bottom")).a(mp.i, mo.a(cwl.by, "_side"));
      ahd $$1 = mo.a(cwl.by, "_top_sticky");
      ahd $$2 = mo.a(cwl.by, "_top");
      mo $$3 = $$0.c(mp.E, $$1);
      mo $$4 = $$0.c(mp.E, $$2);
      ahd $$5 = ml.a(cwl.by, "_base");
      this.a(cwl.by, $$5, $$4);
      this.a(cwl.br, $$5, $$3);
      ahd $$6 = mn.n.a(cwl.by, "_inventory", $$0.c(mp.f, $$2), this.c);
      ahd $$7 = mn.n.a(cwl.br, "_inventory", $$0.c(mp.f, $$1), this.c);
      this.a(cwl.by, $$6);
      this.a(cwl.br, $$7);
   }

   private void a(cwj $$0, ahd $$1, mo $$2) {
      ahd $$3 = mn.bh.a($$0, $$2, this.c);
      this.b.accept(md.a($$0).a(a(djq.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      mo $$0 = new mo().a(mp.F, mo.a(cwl.by, "_top")).a(mp.i, mo.a(cwl.by, "_side"));
      mo $$1 = $$0.c(mp.E, mo.a(cwl.by, "_top_sticky"));
      mo $$2 = $$0.c(mp.E, mo.a(cwl.by, "_top"));
      this.b
         .accept(
            md.a(cwl.bz)
               .a(
                  me.a(djq.x, djq.bg)
                     .a(false, dkc.a, mg.a().a(mh.c, mn.bi.a(cwl.by, "_head", $$2, this.c)))
                     .a(false, dkc.b, mg.a().a(mh.c, mn.bi.a(cwl.by, "_head_sticky", $$1, this.c)))
                     .a(true, dkc.a, mg.a().a(mh.c, mn.bj.a(cwl.by, "_head_short", $$2, this.c)))
                     .a(true, dkc.b, mg.a().a(mh.c, mn.bj.a(cwl.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      cwj $$0 = cwl.tr;
      mo $$1 = mo.a($$0, "_side_inactive", "_top_inactive");
      mo $$2 = mo.a($$0, "_side_active", "_top_active");
      mo $$3 = mo.a($$0, "_side_active", "_top_ejecting_reward");
      ahd $$4 = mn.o.a($$0, $$1, this.c);
      ahd $$5 = mn.o.a($$0, "_active", $$2, this.c);
      ahd $$6 = mn.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(md.a($$0).a(me.a(djq.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> mg.a().a(mh.c, $$4);
            case b, c, d -> mg.a().a(mh.c, $$5);
            case e -> mg.a().a(mh.c, $$6);
         };
      })));
   }

   private void ae() {
      ahd $$0 = ml.a(cwl.qQ, "_inactive");
      ahd $$1 = ml.a(cwl.qQ, "_active");
      this.a(cwl.qQ, $$0);
      this.b.accept(md.a(cwl.qQ).a(me.a(djq.bo).a($$2 -> mg.a().a(mh.c, $$2 != dkh.b && $$2 != dkh.c ? $$0 : $$1))));
   }

   private void af() {
      ahd $$0 = ml.a(cwl.qR, "_inactive");
      ahd $$1 = ml.a(cwl.qR, "_active");
      this.a(cwl.qR, $$0);
      this.b.accept(md.a(cwl.qR).a(me.a(djq.bo).a($$2 -> mg.a().a(mh.c, $$2 != dkh.b && $$2 != dkh.c ? $$0 : $$1))).a(b()));
   }

   private void ag() {
      ahd $$0 = mn.bM.a(cwl.qV, mo.a(false), this.c);
      ahd $$1 = mn.bM.a(cwl.qV, "_can_summon", mo.a(true), this.c);
      this.a(cwl.qV, $$0);
      this.b.accept(md.a(cwl.qV).a(a(djq.G, $$1, $$0)));
   }

   private void ah() {
      ahd $$0 = ml.a(cwl.nS, "_stable");
      ahd $$1 = ml.a(cwl.nS, "_unstable");
      this.a(cwl.nS, $$0);
      this.b.accept(md.a(cwl.nS).a(a(djq.b, $$1, $$0)));
   }

   private void ai() {
      ahd $$0 = this.a(cwl.sv, "", mn.ao, mo::c);
      ahd $$1 = this.a(cwl.sv, "_lit", mn.ao, mo::c);
      this.b.accept(md.a(cwl.sv).a(a(djq.D, $$1, $$0)));
      ahd $$2 = this.a(cwl.sw, "", mn.ao, mo::c);
      ahd $$3 = this.a(cwl.sw, "_lit", mn.ao, mo::c);
      this.b.accept(md.a(cwl.sw).a(a(djq.D, $$3, $$2)));
   }

   private void aj() {
      ahd $$0 = mq.a.create(cwl.fB, this.c);
      ahd $$1 = this.a(cwl.fB, "_on", mn.c, mo::b);
      this.b.accept(md.a(cwl.fB).a(a(djq.r, $$1, $$0)));
   }

   private void l(cwj $$0, cwj $$1) {
      mo $$2 = mo.y($$0);
      this.b.accept(c($$0, mn.bf.a($$0, $$2, this.c)));
      this.b.accept(md.a($$1, mg.a().a(mh.c, mn.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ak() {
      mo $$0 = mo.y(cwl.dK);
      mo $$1 = mo.i(mo.a(cwl.dK, "_off"));
      ahd $$2 = mn.bf.a(cwl.dK, $$0, this.c);
      ahd $$3 = mn.bf.a(cwl.dK, "_off", $$1, this.c);
      this.b.accept(md.a(cwl.dK).a(a(djq.r, $$2, $$3)));
      ahd $$4 = mn.bg.a(cwl.dL, $$0, this.c);
      ahd $$5 = mn.bg.a(cwl.dL, "_off", $$1, this.c);
      this.b.accept(md.a(cwl.dL).a(a(djq.r, $$4, $$5)).a(d()));
      this.d(cwl.dK);
      this.c(cwl.dL);
   }

   private void al() {
      this.a(cmu.lJ);
      this.b.accept(md.a(cwl.eh).a(me.a(djq.aA, djq.s, djq.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return mg.a().a(mh.c, mo.a(cwl.eh, $$3.toString()));
      })).a(c()));
   }

   private void am() {
      this.a(cmu.cS);
      this.b
         .accept(
            md.a(cwl.mV)
               .a(
                  me.a(djq.aS, djq.C)
                     .a(1, false, Arrays.asList(a(ml.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(ml.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(ml.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(ml.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(ml.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(ml.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(ml.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(ml.a("four_sea_pickles"))))
               )
         );
   }

   private void an() {
      mo $$0 = mo.a(cwl.dN);
      ahd $$1 = mn.c.a(cwl.dP, $$0, this.c);
      this.b.accept(md.a(cwl.dN).a(me.a(djq.aF).a($$1x -> mg.a().a(mh.c, $$1x < 8 ? ml.a(cwl.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cwl.dN, ml.a(cwl.dN, "_height2"));
      this.b.accept(c(cwl.dP, $$1));
   }

   private void ao() {
      this.b.accept(md.a(cwl.oc, mg.a().a(mh.c, ml.a(cwl.oc))).a(b()));
   }

   private void ap() {
      ahd $$0 = mq.a.create(cwl.pa, this.c);
      this.a(cwl.pa, $$0);
      this.b.accept(md.a(cwl.pa).a(me.a(djq.bj).a($$0x -> mg.a().a(mh.c, this.a(cwl.pa, "_" + $$0x.c(), mn.c, mo::b)))));
   }

   private void aq() {
      this.a(cmu.wi);
      this.b.accept(md.a(cwl.oi).a(me.a(djq.as).a($$0 -> mg.a().a(mh.c, this.a(cwl.oi, "_stage" + $$0, mn.ao, mo::c)))));
   }

   private void ar() {
      this.a(cmu.pp);
      this.b
         .accept(
            md.a(cwl.fI)
               .a(
                  me.a(djq.a, djq.M, djq.L, djq.N, djq.O)
                     .a(false, false, false, false, false, mg.a().a(mh.c, ml.a(cwl.fI, "_ns")))
                     .a(false, true, false, false, false, mg.a().a(mh.c, ml.a(cwl.fI, "_n")).a(mh.b, mh.a.b))
                     .a(false, false, true, false, false, mg.a().a(mh.c, ml.a(cwl.fI, "_n")))
                     .a(false, false, false, true, false, mg.a().a(mh.c, ml.a(cwl.fI, "_n")).a(mh.b, mh.a.c))
                     .a(false, false, false, false, true, mg.a().a(mh.c, ml.a(cwl.fI, "_n")).a(mh.b, mh.a.d))
                     .a(false, true, true, false, false, mg.a().a(mh.c, ml.a(cwl.fI, "_ne")))
                     .a(false, true, false, true, false, mg.a().a(mh.c, ml.a(cwl.fI, "_ne")).a(mh.b, mh.a.b))
                     .a(false, false, false, true, true, mg.a().a(mh.c, ml.a(cwl.fI, "_ne")).a(mh.b, mh.a.c))
                     .a(false, false, true, false, true, mg.a().a(mh.c, ml.a(cwl.fI, "_ne")).a(mh.b, mh.a.d))
                     .a(false, false, true, true, false, mg.a().a(mh.c, ml.a(cwl.fI, "_ns")))
                     .a(false, true, false, false, true, mg.a().a(mh.c, ml.a(cwl.fI, "_ns")).a(mh.b, mh.a.b))
                     .a(false, true, true, true, false, mg.a().a(mh.c, ml.a(cwl.fI, "_nse")))
                     .a(false, true, false, true, true, mg.a().a(mh.c, ml.a(cwl.fI, "_nse")).a(mh.b, mh.a.b))
                     .a(false, false, true, true, true, mg.a().a(mh.c, ml.a(cwl.fI, "_nse")).a(mh.b, mh.a.c))
                     .a(false, true, true, false, true, mg.a().a(mh.c, ml.a(cwl.fI, "_nse")).a(mh.b, mh.a.d))
                     .a(false, true, true, true, true, mg.a().a(mh.c, ml.a(cwl.fI, "_nsew")))
                     .a(true, false, false, false, false, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_ns")))
                     .a(true, false, true, false, false, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_n")))
                     .a(true, false, false, true, false, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_n")).a(mh.b, mh.a.c))
                     .a(true, true, false, false, false, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_n")).a(mh.b, mh.a.b))
                     .a(true, false, false, false, true, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_n")).a(mh.b, mh.a.d))
                     .a(true, true, true, false, false, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_ne")))
                     .a(true, true, false, true, false, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_ne")).a(mh.b, mh.a.b))
                     .a(true, false, false, true, true, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_ne")).a(mh.b, mh.a.c))
                     .a(true, false, true, false, true, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_ne")).a(mh.b, mh.a.d))
                     .a(true, false, true, true, false, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_ns")))
                     .a(true, true, false, false, true, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_ns")).a(mh.b, mh.a.b))
                     .a(true, true, true, true, false, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_nse")))
                     .a(true, true, false, true, true, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_nse")).a(mh.b, mh.a.b))
                     .a(true, false, true, true, true, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_nse")).a(mh.b, mh.a.c))
                     .a(true, true, true, false, true, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_nse")).a(mh.b, mh.a.d))
                     .a(true, true, true, true, true, mg.a().a(mh.c, ml.a(cwl.fI, "_attached_nsew")))
               )
         );
   }

   private void as() {
      this.d(cwl.fH);
      this.b.accept(md.a(cwl.fH).a(me.a(djq.a, djq.w).a(($$0, $$1) -> mg.a().a(mh.c, mo.a(cwl.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ahd a(int $$0, String $$1, mo $$2) {
      switch ($$0) {
         case 1:
            return mn.bl.a(ml.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return mn.bm.a(ml.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return mn.bn.a(ml.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return mn.bo.a(ml.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ahd a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mo.b(mo.G(cwl.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mo.b(mo.a(cwl.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mo.b(mo.a(cwl.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void at() {
      this.a(cmu.ko);
      this.b.accept(md.a(cwl.mf).a(me.a(djq.aD, djq.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void au() {
      this.a(cmu.kp);
      Function<Integer, ahd> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mo $$2 = mo.a($$1);
         return mn.bw.a(cwl.mg, $$1, $$2, this.c);
      };
      this.b.accept(md.a(cwl.mg).a(me.a(ddq.c).a($$1 -> mg.a().a(mh.c, $$0.apply($$1)))));
   }

   private void F(cwj $$0) {
      this.d($$0);
      ahd $$1 = ml.a($$0);
      mc $$2 = mc.a($$0);
      mb.c $$3 = ac.a(mb.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<djr, Function<ahd, mg>> $$4 : a) {
         djr $$5 = (djr)$$4.getFirst();
         Function<ahd, mg> $$6 = (Function<ahd, mg>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(mb.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void av() {
      ahd $$0 = mo.a(cwl.qU, "_bottom");
      mo $$1 = new mo().a(mp.e, $$0).a(mp.f, mo.a(cwl.qU, "_top")).a(mp.i, mo.a(cwl.qU, "_side"));
      mo $$2 = new mo().a(mp.e, $$0).a(mp.f, mo.a(cwl.qU, "_top_bloom")).a(mp.i, mo.a(cwl.qU, "_side_bloom"));
      ahd $$3 = mn.n.a(cwl.qU, "", $$1, this.c);
      ahd $$4 = mn.n.a(cwl.qU, "_bloom", $$2, this.c);
      this.b.accept(md.a(cwl.qU).a(me.a(djq.E).a($$2x -> mg.a().a(mh.c, $$2x ? $$4 : $$3))));
      this.a(cmu.gi, $$3);
   }

   private void aw() {
      cwj $$0 = cwl.cm;
      ahd $$1 = ml.a($$0);
      mc $$2 = mc.a($$0);
      Map.of(ic.c, mh.a.a, ic.f, mh.a.b, ic.d, mh.a.c, ic.e, mh.a.d).forEach(($$2x, $$3) -> {
         mb.c $$4 = mb.a().a(djq.R, $$2x);
         $$2.a($$4, mg.a().a(mh.c, $$1).a(mh.b, $$3).a(mh.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, ml.a($$0, "_inventory"));
      i.clear();
   }

   private void a(mc $$0, mb.c $$1, mh.a $$2) {
      List.of(Pair.of(djq.bp, mn.aM), Pair.of(djq.bq, mn.aN), Pair.of(djq.br, mn.aO), Pair.of(djq.bs, mn.aP), Pair.of(djq.bt, mn.aQ), Pair.of(djq.bu, mn.aR))
         .forEach($$3 -> {
            djr $$4 = (djr)$$3.getFirst();
            mm $$5 = (mm)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(mc $$0, mb.c $$1, mh.a $$2, djr $$3, mm $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mo $$7 = new mo().a(mp.b, mo.a(cwl.cm, $$6));
      lx.d $$8 = new lx.d($$4, $$6);
      ahd $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cwl.cm, $$6, $$7, this.c));
      $$0.a(mb.a($$1, mb.a().a($$3, $$5)), mg.a().a(mh.c, $$9).a(mh.b, $$2));
   }

   private void ax() {
      this.b.accept(c(cwl.kJ, mn.c.a(cwl.kJ, mo.b(ml.a("magma")), this.c)));
   }

   private void G(cwj $$0) {
      this.b($$0, mq.q);
      mn.bD.a(ml.a($$0.k()), mo.u($$0), this.c);
   }

   private void b(cwj $$0, cwj $$1, lx.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(cwj $$0, cwj $$1) {
      mn.bE.a(ml.a($$0.k()), mo.u($$1), this.c);
   }

   private void ay() {
      ahd $$0 = ml.a(cwl.b);
      ahd $$1 = ml.a(cwl.b, "_mirrored");
      this.b.accept(a(cwl.eN, $$0, $$1));
      this.a(cwl.eN, $$0);
   }

   private void az() {
      ahd $$0 = ml.a(cwl.sJ);
      ahd $$1 = ml.a(cwl.sJ, "_mirrored");
      this.b.accept(a(cwl.td, $$0, $$1).a(f()));
      this.a(cwl.td, $$0);
   }

   private void n(cwj $$0, cwj $$1) {
      this.a($$0, lx.e.b);
      mo $$2 = mo.d(mo.a($$0, "_pot"));
      ahd $$3 = lx.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aA() {
      ahd $$0 = mo.a(cwl.pl, "_bottom");
      ahd $$1 = mo.a(cwl.pl, "_top_off");
      ahd $$2 = mo.a(cwl.pl, "_top");
      ahd[] $$3 = new ahd[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mo $$5 = new mo().a(mp.e, $$0).a(mp.f, $$4 == 0 ? $$1 : $$2).a(mp.i, mo.a(cwl.pl, "_side" + $$4));
         $$3[$$4] = mn.n.a(cwl.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(md.a(cwl.pl).a(me.a(djq.aZ).a($$1x -> mg.a().a(mh.c, $$3[$$1x]))));
      this.a(cmu.wG, $$3[0]);
   }

   private mg a(ie $$0, mg $$1) {
      switch ($$0) {
         case b:
            return $$1.a(mh.a, mh.a.b);
         case c:
            return $$1.a(mh.a, mh.a.b).a(mh.b, mh.a.c);
         case d:
            return $$1.a(mh.a, mh.a.b).a(mh.b, mh.a.d);
         case a:
            return $$1.a(mh.a, mh.a.b).a(mh.b, mh.a.b);
         case f:
            return $$1.a(mh.a, mh.a.d).a(mh.b, mh.a.c);
         case g:
            return $$1.a(mh.a, mh.a.d);
         case h:
            return $$1.a(mh.a, mh.a.d).a(mh.b, mh.a.b);
         case e:
            return $$1.a(mh.a, mh.a.d).a(mh.b, mh.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(mh.b, mh.a.c);
         case i:
            return $$1.a(mh.b, mh.a.d);
         case j:
            return $$1.a(mh.b, mh.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aB() {
      ahd $$0 = mo.a(cwl.pb, "_top");
      ahd $$1 = mo.a(cwl.pb, "_bottom");
      ahd $$2 = mo.a(cwl.pb, "_side");
      ahd $$3 = mo.a(cwl.pb, "_lock");
      mo $$4 = new mo().a(mp.o, $$2).a(mp.m, $$2).a(mp.l, $$2).a(mp.c, $$0).a(mp.j, $$0).a(mp.k, $$1).a(mp.n, $$3);
      ahd $$5 = mn.b.a(cwl.pb, $$4, this.c);
      this.b.accept(md.a(cwl.pb, mg.a().a(mh.c, $$5)).a(me.a(djq.T).a($$0x -> this.a($$0x, mg.a()))));
   }

   private void aC() {
      cwj $$0 = cwl.n;
      ahd $$1 = ml.a($$0);
      mq $$2 = mq.a.get($$0);
      cwj $$3 = cwl.jH;
      ahd $$4 = mn.ab.a($$3, $$2.b(), this.c);
      ahd $$5 = mn.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kg.a().filter(kh::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cwl.rf).a(kg.w).a(cwl.rf, cwl.rD).a(cwl.rj, cwl.rn).a(kg.y);
      this.h(cwl.re).a(kg.A).a(cwl.re, cwl.rC).a(cwl.ri, cwl.rm).a(kg.C);
      this.h(cwl.rd).a(kg.E).a(cwl.rd, cwl.rB).a(cwl.rh, cwl.rl).a(kg.G);
      this.h(cwl.rc).a(kg.I).a(cwl.rc, cwl.rA).a(cwl.rg, cwl.rk).a(kg.K);
      this.w(cwl.sk);
      this.w(cwl.sl);
      this.w(cwl.sm);
      this.w(cwl.sn);
      this.i(cwl.sk, cwl.so);
      this.i(cwl.sl, cwl.sp);
      this.i(cwl.sm, cwl.sq);
      this.i(cwl.sn, cwl.sr);
      this.m(cwl.a);
      this.c(cwl.nc, cwl.a);
      this.c(cwl.nb, cwl.a);
      this.m(cwl.fO);
      this.m(cwl.dQ);
      this.c(cwl.nd, cwl.G);
      this.m(cwl.fA);
      this.m(cwl.me);
      this.m(cwl.fr);
      this.m(cwl.fR);
      this.a(cmu.tX);
      this.m(cwl.pg);
      this.m(cwl.G);
      this.m(cwl.H);
      this.m(cwl.hV);
      this.a(cmu.fR);
      this.o(cwl.pM, cwl.qd);
      this.o(cwl.pN, cwl.qe);
      this.o(cwl.pO, cwl.qf);
      this.o(cwl.pP, cwl.qg);
      this.o(cwl.pQ, cwl.qh);
      this.o(cwl.pR, cwl.qi);
      this.o(cwl.pS, cwl.qj);
      this.o(cwl.pT, cwl.qk);
      this.o(cwl.pU, cwl.ql);
      this.o(cwl.pV, cwl.qm);
      this.o(cwl.pW, cwl.qn);
      this.o(cwl.pX, cwl.qo);
      this.o(cwl.pY, cwl.qp);
      this.o(cwl.pZ, cwl.qq);
      this.o(cwl.qa, cwl.qr);
      this.o(cwl.qb, cwl.qs);
      this.o(cwl.pL, cwl.qc);
      this.m(cwl.na);
      this.m(cwl.gs);
      this.m(cwl.qP);
      this.m(cwl.sx);
      this.s(cwl.sy);
      this.s(cwl.sz);
      this.t(cwl.ti);
      this.t(cwl.tj);
      this.ai();
      this.g(cwl.sC, cwl.sA);
      this.p(cwl.sB);
      this.a(cwl.hW, cmu.hA);
      this.a(cmu.hA);
      this.aD();
      this.a(cwl.kN, cmu.ja);
      this.a(cmu.ja);
      this.f(cwl.bQ, mo.a(cwl.by, "_side"));
      this.a(cwl.R);
      this.a(cwl.S);
      this.a(cwl.iB);
      this.a(cwl.cx);
      this.a(cwl.cy);
      this.a(cwl.cz);
      this.a(cwl.fE);
      this.a(cwl.fF);
      this.a(cwl.fJ);
      this.a(cwl.N);
      this.a(cwl.T);
      this.a(cwl.O);
      this.a(cwl.ch);
      this.a(cwl.P);
      this.a(cwl.Q);
      this.a(cwl.ci);
      this.b(cwl.pj, mq.d);
      this.a(cwl.pi);
      this.a(cwl.aR);
      this.a(cwl.aS);
      this.a(cwl.aT);
      this.a(cwl.hb);
      this.a(cwl.dI);
      this.a(cwl.dJ);
      this.a(cwl.ha);
      this.a(cwl.pC);
      this.a(cwl.mW);
      this.a(cwl.dR);
      this.a(cwl.k);
      this.a(cwl.pk);
      this.a(cwl.fz);
      this.a(cwl.ec);
      this.a(cwl.L);
      this.a(cwl.ph);
      this.a(cwl.dO);
      this.b(cwl.dT, mq.g);
      this.b(cwl.pq, mq.d);
      this.b(cwl.fa, mq.d);
      this.m(cwl.ac);
      this.m(cwl.ga);
      this.a(cwl.kK);
      this.a(cwl.aY);
      this.a(cwl.iC);
      this.a(cwl.co);
      this.a(cwl.pK);
      this.a(cwl.ii);
      this.a(cwl.oy);
      this.a(cwl.dW);
      this.a(cwl.dX);
      this.b(cwl.ct, mq.b);
      this.a(cwl.aO);
      this.b(cwl.bw, mq.v);
      this.a(cmu.cR);
      this.b(cwl.ck, mq.f);
      this.b(cwl.pd, mq.d);
      this.a(cwl.op);
      this.a(cwl.aP);
      this.a(cwl.qt);
      this.a(cwl.qu);
      this.a(cwl.qN);
      this.a(cwl.su);
      this.a(cwl.tf);
      this.a(cwl.tg);
      this.a(cwl.th);
      this.e(cwl.qS);
      this.aC();
      this.a(cwl.ra);
      this.a(cwl.rb);
      this.a(cwl.qW);
      this.a(cwl.qX);
      this.a(cwl.qY);
      this.a(cwl.qZ);
      this.k(cwl.qW, cwl.rw);
      this.k(cwl.qX, cwl.ry);
      this.k(cwl.qY, cwl.rx);
      this.k(cwl.qZ, cwl.rz);
      this.i(cwl.rM);
      this.i(cwl.rN);
      this.i(cwl.rP);
      this.i(cwl.rO);
      this.a(cwl.rM, cwl.rQ);
      this.a(cwl.rN, cwl.rR);
      this.a(cwl.rP, cwl.rT);
      this.a(cwl.rO, cwl.rS);
      this.k(cwl.rU);
      this.k(cwl.rV);
      this.k(cwl.rX);
      this.k(cwl.rW);
      this.b(cwl.rU, cwl.rY);
      this.b(cwl.rV, cwl.rZ);
      this.b(cwl.rX, cwl.sb);
      this.b(cwl.rW, cwl.sa);
      this.a(cwl.sc);
      this.a(cwl.sd);
      this.a(cwl.se);
      this.a(cwl.sf);
      this.k(cwl.sc, cwl.sg);
      this.k(cwl.sd, cwl.sh);
      this.k(cwl.se, cwl.si);
      this.k(cwl.sf, cwl.sj);
      this.j(cwl.gW, cwl.ch);
      this.j(cwl.gX, cwl.ci);
      this.G();
      this.r();
      this.aw();
      this.v();
      this.w();
      this.a(cwl.og, cwl.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(cwl.kt);
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
      this.F(cwl.ff);
      this.F(cwl.fg);
      this.F(cwl.qT);
      this.ax();
      this.aB();
      this.ae();
      this.af();
      this.ag();
      this.X();
      this.O();
      this.N();
      this.ad();
      this.E(cwl.cO);
      this.d(cwl.cO);
      this.E(cwl.oa);
      this.g();
      this.E(cwl.sE);
      this.l(cwl.cp, cwl.cq);
      this.l(cwl.ea, cwl.eb);
      this.a(cwl.cA, cwl.n, mo::c);
      this.a(cwl.nY, cwl.p, mo::d);
      this.y(cwl.ow);
      this.y(cwl.on);
      this.v(cwl.aU);
      this.v(cwl.hi);
      this.C();
      this.D(cwl.oe);
      this.D(cwl.of);
      this.e(cwl.eX, ml.a(cwl.eX));
      this.a(cwl.dY, mq.d);
      this.a(cwl.dZ, mq.d);
      this.a(cwl.te);
      this.a(cwl.kM, mq.d);
      this.f(cwl.j);
      this.f(cwl.sH);
      this.f(cwl.I);
      this.g(cwl.J);
      this.g(cwl.M);
      this.f(cwl.K);
      this.e(cwl.F);
      this.b(cwl.to, mq.f);
      this.a(cwl.ij, mq.d, mq.e);
      this.a(cwl.kx, mq.w, mq.x);
      this.a(cwl.hf, mq.w, mq.x);
      this.a(cwl.tk, mq.d, mq.e);
      this.a(cwl.tl, mq.d, mq.e);
      this.a(cwl.tm, mq.d, mq.e);
      this.c(cwl.nT, mq.i);
      this.z();
      this.a(cwl.pe, mo::A);
      this.a(cwl.pf, mo::C);
      this.a(cwl.kD, djq.as, 0, 1, 2, 3);
      this.a(cwl.gt, djq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cwl.fq, djq.as, 0, 1, 1, 2);
      this.a(cwl.gu, djq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cwl.cB, djq.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cwl.kA, lx.e.b, djq.aq, 0, 1);
      this.i();
      this.h();
      this.a(ml.a("decorated_pot"), cwl.iA).b(cwl.tp);
      this.a(ml.a("banner"), cwl.n)
         .a(mn.bF, cwl.iJ, cwl.iK, cwl.iL, cwl.iM, cwl.iN, cwl.iO, cwl.iP, cwl.iQ, cwl.iR, cwl.iS, cwl.iT, cwl.iU, cwl.iV, cwl.iW, cwl.iX, cwl.iY)
         .b(cwl.iZ, cwl.ja, cwl.jb, cwl.jc, cwl.jd, cwl.je, cwl.jf, cwl.jg, cwl.jh, cwl.ji, cwl.jj, cwl.jk, cwl.jl, cwl.jm, cwl.jn, cwl.jo);
      this.a(ml.a("bed"), cwl.n)
         .b(cwl.aZ, cwl.ba, cwl.bb, cwl.bc, cwl.bd, cwl.be, cwl.bf, cwl.bg, cwl.bh, cwl.bi, cwl.bj, cwl.bk, cwl.bl, cwl.bm, cwl.bn, cwl.bo);
      this.m(cwl.aZ, cwl.bA);
      this.m(cwl.ba, cwl.bB);
      this.m(cwl.bb, cwl.bC);
      this.m(cwl.bc, cwl.bD);
      this.m(cwl.bd, cwl.bE);
      this.m(cwl.be, cwl.bF);
      this.m(cwl.bf, cwl.bG);
      this.m(cwl.bg, cwl.bH);
      this.m(cwl.bh, cwl.bI);
      this.m(cwl.bi, cwl.bJ);
      this.m(cwl.bj, cwl.bK);
      this.m(cwl.bk, cwl.bL);
      this.m(cwl.bl, cwl.bM);
      this.m(cwl.bm, cwl.bN);
      this.m(cwl.bn, cwl.bO);
      this.m(cwl.bo, cwl.bP);
      this.a(ml.a("skull"), cwl.dW)
         .a(mn.bG, cwl.gM, cwl.gK, cwl.gI, cwl.gE, cwl.gG, cwl.gQ)
         .a(cwl.gO)
         .b(cwl.gN, cwl.gP, cwl.gL, cwl.gJ, cwl.gF, cwl.gH, cwl.gR);
      this.G(cwl.kP);
      this.G(cwl.kQ);
      this.G(cwl.kR);
      this.G(cwl.kS);
      this.G(cwl.kT);
      this.G(cwl.kU);
      this.G(cwl.kV);
      this.G(cwl.kW);
      this.G(cwl.kX);
      this.G(cwl.kY);
      this.G(cwl.kZ);
      this.G(cwl.la);
      this.G(cwl.lb);
      this.G(cwl.lc);
      this.G(cwl.ld);
      this.G(cwl.le);
      this.G(cwl.lf);
      this.b(cwl.mX, mq.q);
      this.c(cwl.mX);
      this.a(ml.a("chest"), cwl.n).b(cwl.cv, cwl.gV);
      this.a(ml.a("ender_chest"), cwl.co).b(cwl.fG);
      this.f(cwl.fx, cwl.co).a(cwl.fx, cwl.kF);
      this.a(cwl.aM);
      this.a(cwl.aN);
      this.a(cwl.lw);
      this.a(cwl.lx);
      this.a(cwl.ly);
      this.a(cwl.lz);
      this.a(cwl.lA);
      this.a(cwl.lB);
      this.a(cwl.lC);
      this.a(cwl.lD);
      this.a(cwl.lE);
      this.a(cwl.lF);
      this.a(cwl.lG);
      this.a(cwl.lH);
      this.a(cwl.lI);
      this.a(cwl.lJ);
      this.a(cwl.lK);
      this.a(cwl.lL);
      this.a(mq.a, cwl.lM, cwl.lN, cwl.lO, cwl.lP, cwl.lQ, cwl.lR, cwl.lS, cwl.lT, cwl.lU, cwl.lV, cwl.lW, cwl.lX, cwl.lY, cwl.lZ, cwl.ma, cwl.mb);
      this.a(cwl.iA);
      this.a(cwl.hj);
      this.a(cwl.hk);
      this.a(cwl.hl);
      this.a(cwl.hm);
      this.a(cwl.hn);
      this.a(cwl.ho);
      this.a(cwl.hp);
      this.a(cwl.hq);
      this.a(cwl.hr);
      this.a(cwl.hs);
      this.a(cwl.ht);
      this.a(cwl.hu);
      this.a(cwl.hv);
      this.a(cwl.hw);
      this.a(cwl.hx);
      this.a(cwl.hy);
      this.a(cwl.qO);
      this.h(cwl.aQ, cwl.eY);
      this.h(cwl.ei, cwl.hz);
      this.h(cwl.ej, cwl.hA);
      this.h(cwl.ek, cwl.hB);
      this.h(cwl.el, cwl.hC);
      this.h(cwl.em, cwl.hD);
      this.h(cwl.en, cwl.hE);
      this.h(cwl.eo, cwl.hF);
      this.h(cwl.ep, cwl.hG);
      this.h(cwl.eq, cwl.hH);
      this.h(cwl.er, cwl.hI);
      this.h(cwl.es, cwl.hJ);
      this.h(cwl.et, cwl.hK);
      this.h(cwl.eu, cwl.hL);
      this.h(cwl.ev, cwl.hM);
      this.h(cwl.ew, cwl.hN);
      this.h(cwl.ex, cwl.hO);
      this.b(mq.o, cwl.lg, cwl.lh, cwl.li, cwl.lj, cwl.lk, cwl.ll, cwl.lm, cwl.ln, cwl.lo, cwl.lp, cwl.lq, cwl.lr, cwl.ls, cwl.lt, cwl.lu, cwl.lv);
      this.g(cwl.bA, cwl.ik);
      this.g(cwl.bB, cwl.il);
      this.g(cwl.bC, cwl.im);
      this.g(cwl.bD, cwl.in);
      this.g(cwl.bE, cwl.io);
      this.g(cwl.bF, cwl.ip);
      this.g(cwl.bG, cwl.iq);
      this.g(cwl.bH, cwl.ir);
      this.g(cwl.bI, cwl.is);
      this.g(cwl.bJ, cwl.it);
      this.g(cwl.bK, cwl.iu);
      this.g(cwl.bL, cwl.iv);
      this.g(cwl.bM, cwl.iw);
      this.g(cwl.bN, cwl.ix);
      this.g(cwl.bO, cwl.iy);
      this.g(cwl.bP, cwl.iz);
      this.a(cwl.sI);
      this.a(cwl.eL);
      this.a(cwl.bu, cwl.gb, lx.e.a);
      this.a(cwl.bR, cwl.gc, lx.e.b);
      this.a(cwl.bT, cwl.gd, lx.e.b);
      this.a(cwl.bU, cwl.ge, lx.e.b);
      this.a(cwl.bV, cwl.gf, lx.e.b);
      this.a(cwl.bW, cwl.gg, lx.e.b);
      this.a(cwl.bX, cwl.gh, lx.e.b);
      this.a(cwl.bY, cwl.gi, lx.e.b);
      this.a(cwl.bZ, cwl.gj, lx.e.b);
      this.a(cwl.ca, cwl.gk, lx.e.b);
      this.a(cwl.cb, cwl.gl, lx.e.b);
      this.a(cwl.cc, cwl.gm, lx.e.b);
      this.a(cwl.ce, cwl.gn, lx.e.b);
      this.a(cwl.cd, cwl.go, lx.e.b);
      this.a(cwl.cg, cwl.gp, lx.e.b);
      this.a(cwl.cf, cwl.gq, lx.e.b);
      this.a(cwl.bv, cwl.gr, lx.e.b);
      this.a(cwl.bS, cwl.fS, lx.e.b);
      this.H();
      this.u(cwl.eT);
      this.u(cwl.eU);
      this.u(cwl.eV);
      this.a(cwl.bt, lx.e.a);
      this.b(cwl.dS, lx.e.a);
      this.a(cmu.dI);
      this.b(cwl.mc, cwl.md, lx.e.b);
      this.a(cmu.dJ);
      this.c(cwl.md);
      this.b(cwl.sG, lx.e.b);
      this.c(cwl.sG);
      this.c(cwl.sw);
      this.b(cwl.oz, cwl.oA, lx.e.b);
      this.b(cwl.oB, cwl.oC, lx.e.b);
      this.a(cwl.oz, "_plant");
      this.c(cwl.oA);
      this.a(cwl.oB, "_plant");
      this.c(cwl.oC);
      this.a(cwl.mY, lx.e.a, mo.c(mo.a(cwl.mZ, "_stage0")));
      this.m();
      this.a(cwl.bs, lx.e.b);
      this.c(cwl.iE, lx.e.b);
      this.c(cwl.iF, lx.e.b);
      this.c(cwl.iG, lx.e.b);
      this.c(cwl.iH, lx.e.a);
      this.c(cwl.iI, lx.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cwl.mw, cwl.mr, cwl.mm, cwl.mh, cwl.mG, cwl.mB, cwl.mQ, cwl.mL);
      this.a(cwl.mx, cwl.ms, cwl.mn, cwl.mi, cwl.mH, cwl.mC, cwl.mR, cwl.mM);
      this.a(cwl.my, cwl.mt, cwl.mo, cwl.mj, cwl.mI, cwl.mD, cwl.mS, cwl.mN);
      this.a(cwl.mz, cwl.mu, cwl.mp, cwl.mk, cwl.mJ, cwl.mE, cwl.mT, cwl.mO);
      this.a(cwl.mA, cwl.mv, cwl.mq, cwl.ml, cwl.mK, cwl.mF, cwl.mU, cwl.mP);
      this.e(cwl.fe, cwl.fc);
      this.e(cwl.fd, cwl.fb);
      this.l(cwl.ab).c(cwl.ab).a(cwl.av);
      this.l(cwl.am).c(cwl.am).a(cwl.aD);
      this.a(cwl.am, cwl.dj, cwl.ds);
      this.b(cwl.aL, mq.s);
      this.l(cwl.Y).c(cwl.Y).a(cwl.as);
      this.l(cwl.ai).c(cwl.ai).a(cwl.aA);
      this.a(cwl.ai, cwl.dd, cwl.do);
      this.a(cwl.B, cwl.fX, lx.e.b);
      this.b(cwl.aI, mq.s);
      this.l(cwl.Z).d(cwl.Z).a(cwl.at);
      this.l(cwl.aj).d(cwl.aj).a(cwl.aB);
      this.a(cwl.aj, cwl.de, cwl.dp);
      this.a(cwl.C, cwl.fY, lx.e.b);
      this.b(cwl.aJ, mq.s);
      this.l(cwl.W).c(cwl.W).a(cwl.aq);
      this.l(cwl.ag).c(cwl.ag).a(cwl.ay);
      this.a(cwl.ag, cwl.dc, cwl.dn);
      this.a(cwl.z, cwl.fV, lx.e.b);
      this.b(cwl.aG, mq.s);
      this.l(cwl.U).c(cwl.U).a(cwl.ao);
      this.l(cwl.al).c(cwl.al).a(cwl.aw);
      this.a(cwl.al, cwl.da, cwl.dl);
      this.a(cwl.x, cwl.fT, lx.e.b);
      this.b(cwl.aE, mq.s);
      this.l(cwl.V).c(cwl.V).a(cwl.ap);
      this.l(cwl.af).c(cwl.af).a(cwl.ax);
      this.a(cwl.af, cwl.db, cwl.dm);
      this.a(cwl.y, cwl.fU, lx.e.b);
      this.b(cwl.aF, mq.s);
      this.l(cwl.aa).c(cwl.aa).a(cwl.au);
      this.l(cwl.ak).c(cwl.ak).a(cwl.aC);
      this.a(cwl.ak, cwl.dg, cwl.dr);
      this.a(cwl.D, cwl.fZ, lx.e.b);
      this.b(cwl.aK, mq.s);
      this.l(cwl.X).c(cwl.X).a(cwl.ar);
      this.l(cwl.ah).c(cwl.ah).a(cwl.az);
      this.a(cwl.ah, cwl.df, cwl.dq);
      this.a(cwl.A, cwl.fW, lx.e.b);
      this.b(cwl.aH, mq.s);
      this.l(cwl.os).b(cwl.os).a(cwl.ou);
      this.l(cwl.ot).b(cwl.ot).a(cwl.ov);
      this.a(cwl.ot, cwl.dh, cwl.dt);
      this.a(cwl.ox, cwl.pm, lx.e.b);
      this.n(cwl.oD, cwl.po);
      this.l(cwl.oj).b(cwl.oj).a(cwl.ol);
      this.l(cwl.ok).b(cwl.ok).a(cwl.om);
      this.a(cwl.ok, cwl.di, cwl.du);
      this.a(cwl.oo, cwl.pn, lx.e.b);
      this.n(cwl.oq, cwl.pp);
      this.l(cwl.ae).d(cwl.ae);
      this.l(cwl.an).d(cwl.an);
      this.a(cwl.v, cwl.dk, cwl.dv);
      this.b(cwl.or, lx.e.b);
      this.a(cmu.dF);
      this.i(cwl.dy);
      this.k(cwl.hY);
      this.u();
      this.n(cwl.cP);
      this.o(cwl.bp);
      this.o(cwl.bq);
      this.o(cwl.hh);
      this.t();
      this.q(cwl.fN);
      this.q(cwl.kG);
      this.q(cwl.kH);
      this.r(cwl.gS);
      this.r(cwl.gT);
      this.r(cwl.gU);
      this.o();
      this.p();
      this.d(cwl.cD, mq.h);
      this.d(cwl.nW, mq.h);
      this.d(cwl.nV, mq.i);
      this.s();
      this.aA();
      this.av();
      this.k(cwl.eK, cwl.eS);
      this.k(cwl.m, cwl.eO);
      this.k(cwl.eJ, cwl.eR);
      this.k(cwl.eI, cwl.eQ);
      this.ay();
      this.k(cwl.eH, cwl.eP);
      this.az();
      cnw.h().forEach($$0 -> this.a($$0, ml.b("template_spawn_egg")));
   }

   private void aD() {
      this.c(cwl.hX);
      me.a<Integer> $$0 = me.a(djq.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ahd $$3 = mo.a(cmu.hB, $$2);
         $$0.a($$1, mg.a().a(mh.c, mn.aa.a(cwl.hX, $$2, mo.h($$3), this.c)));
         mn.bx.a(ml.a(cmu.hB, $$2), mo.k($$3), this.c);
      }

      this.b.accept(md.a(cwl.hX).a($$0));
   }

   private void o(cwj $$0, cwj $$1) {
      this.a($$0.k());
      mo $$2 = mo.b(mo.G($$0));
      mo $$3 = mo.b(mo.a($$0, "_lit"));
      ahd $$4 = mn.bH.a($$0, "_one_candle", $$2, this.c);
      ahd $$5 = mn.bI.a($$0, "_two_candles", $$2, this.c);
      ahd $$6 = mn.bJ.a($$0, "_three_candles", $$2, this.c);
      ahd $$7 = mn.bK.a($$0, "_four_candles", $$2, this.c);
      ahd $$8 = mn.bH.a($$0, "_one_candle_lit", $$3, this.c);
      ahd $$9 = mn.bI.a($$0, "_two_candles_lit", $$3, this.c);
      ahd $$10 = mn.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      ahd $$11 = mn.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            md.a($$0)
               .a(
                  me.a(djq.az, djq.r)
                     .a(1, false, mg.a().a(mh.c, $$4))
                     .a(2, false, mg.a().a(mh.c, $$5))
                     .a(3, false, mg.a().a(mh.c, $$6))
                     .a(4, false, mg.a().a(mh.c, $$7))
                     .a(1, true, mg.a().a(mh.c, $$8))
                     .a(2, true, mg.a().a(mh.c, $$9))
                     .a(3, true, mg.a().a(mh.c, $$10))
                     .a(4, true, mg.a().a(mh.c, $$11))
               )
         );
      ahd $$12 = mn.bL.a($$1, mo.a($$0, false), this.c);
      ahd $$13 = mn.bL.a($$1, "_lit", mo.a($$0, true), this.c);
      this.b.accept(md.a($$1).a(a(djq.r, $$13, $$12)));
   }

   class a {
      private final ahd b;

      public a(ahd $$0, cwj $$1) {
         this.b = mn.aa.a($$0, mo.u($$1), lx.this.c);
      }

      public lx.a a(cwj... $$0) {
         for (cwj $$1 : $$0) {
            lx.this.b.accept(lx.c($$1, this.b));
         }

         return this;
      }

      public lx.a b(cwj... $$0) {
         for (cwj $$1 : $$0) {
            lx.this.c($$1);
         }

         return this.a($$0);
      }

      public lx.a a(mm $$0, cwj... $$1) {
         for (cwj $$2 : $$1) {
            $$0.a(ml.a($$2.k()), mo.u($$2), lx.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mo b;
      private final Map<mm, ahd> c = Maps.newHashMap();
      @Nullable
      private kh d;
      @Nullable
      private ahd e;
      private final Set<cwj> f = new HashSet<>();

      public b(mo $$0) {
         this.b = $$0;
      }

      public lx.b a(cwj $$0, mm $$1) {
         this.e = $$1.a($$0, this.b, lx.this.c);
         if (lx.this.f.containsKey($$0)) {
            lx.this.b.accept(lx.this.f.get($$0).create($$0, this.e, this.b, lx.this.c));
         } else {
            lx.this.b.accept(lx.c($$0, this.e));
         }

         return this;
      }

      public lx.b a(cwj $$0, cwj $$1) {
         ahd $$2 = ml.a($$0);
         lx.this.b.accept(lx.c($$1, $$2));
         lx.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public lx.b a(cwj $$0) {
         ahd $$1 = mn.s.a($$0, this.b, lx.this.c);
         ahd $$2 = mn.t.a($$0, this.b, lx.this.c);
         lx.this.b.accept(lx.b($$0, $$1, $$2));
         ahd $$3 = mn.u.a($$0, this.b, lx.this.c);
         lx.this.a($$0, $$3);
         return this;
      }

      public lx.b b(cwj $$0) {
         ahd $$1 = mn.M.a($$0, this.b, lx.this.c);
         ahd $$2 = mn.N.a($$0, this.b, lx.this.c);
         ahd $$3 = mn.O.a($$0, this.b, lx.this.c);
         lx.this.b.accept(lx.a($$0, $$1, $$2, $$3));
         ahd $$4 = mn.P.a($$0, this.b, lx.this.c);
         lx.this.a($$0, $$4);
         return this;
      }

      public lx.b c(cwj $$0) {
         mo $$1 = mo.p($$0);
         ahd $$2 = mn.D.a($$0, $$1, lx.this.c);
         ahd $$3 = mn.E.a($$0, $$1, lx.this.c);
         ahd $$4 = mn.F.a($$0, $$1, lx.this.c);
         ahd $$5 = mn.G.a($$0, $$1, lx.this.c);
         ahd $$6 = mn.H.a($$0, $$1, lx.this.c);
         lx.this.b.accept(lx.a($$0, $$2, $$3, $$4, $$5, $$6));
         ahd $$7 = mn.I.a($$0, $$1, lx.this.c);
         lx.this.a($$0, $$7);
         return this;
      }

      public lx.b d(cwj $$0) {
         ahd $$1 = mn.J.a($$0, this.b, lx.this.c);
         ahd $$2 = mn.K.a($$0, this.b, lx.this.c);
         lx.this.b.accept(lx.c($$0, $$1, $$2));
         ahd $$3 = mn.L.a($$0, this.b, lx.this.c);
         lx.this.a($$0, $$3);
         return this;
      }

      public lx.b e(cwj $$0) {
         mo $$1 = mo.p($$0);
         ahd $$2 = mn.R.a($$0, $$1, lx.this.c);
         ahd $$3 = mn.Q.a($$0, $$1, lx.this.c);
         ahd $$4 = mn.T.a($$0, $$1, lx.this.c);
         ahd $$5 = mn.S.a($$0, $$1, lx.this.c);
         lx.this.b.accept(lx.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public lx.b f(cwj $$0) {
         ahd $$1 = mn.V.a($$0, this.b, lx.this.c);
         ahd $$2 = mn.U.a($$0, this.b, lx.this.c);
         ahd $$3 = mn.X.a($$0, this.b, lx.this.c);
         ahd $$4 = mn.W.a($$0, this.b, lx.this.c);
         lx.this.b.accept(lx.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public lx.b g(cwj $$0) {
         ahd $$1 = mn.Y.a($$0, this.b, lx.this.c);
         ahd $$2 = mn.Z.a($$0, this.b, lx.this.c);
         lx.this.b.accept(lx.e($$0, $$1, $$2));
         return this;
      }

      public lx.b h(cwj $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cwj $$1 = this.d.b().get(kh.b.r);
            ahd $$2 = mn.aa.a($$0, this.b, lx.this.c);
            lx.this.b.accept(lx.c($$0, $$2));
            lx.this.b.accept(lx.c($$1, $$2));
            lx.this.a($$0.k());
            lx.this.c($$1);
            return this;
         }
      }

      public lx.b i(cwj $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ahd $$1 = this.a(mn.ab, $$0);
            ahd $$2 = this.a(mn.ac, $$0);
            lx.this.b.accept(lx.e($$0, $$1, $$2, this.e));
            lx.this.a($$0, $$1);
            return this;
         }
      }

      public lx.b j(cwj $$0) {
         ahd $$1 = this.a(mn.af, $$0);
         ahd $$2 = this.a(mn.ae, $$0);
         ahd $$3 = this.a(mn.ag, $$0);
         lx.this.b.accept(lx.b($$0, $$1, $$2, $$3));
         lx.this.a($$0, $$2);
         return this;
      }

      private lx.b k(cwj $$0) {
         mq $$1 = lx.this.g.getOrDefault($$0, mq.a.get($$0));
         ahd $$2 = $$1.a($$0, lx.this.c);
         lx.this.b.accept(lx.c($$0, $$2));
         return this;
      }

      private lx.b l(cwj $$0) {
         lx.this.i($$0);
         return this;
      }

      private void m(cwj $$0) {
         if (lx.this.e.contains($$0)) {
            lx.this.k($$0);
         } else {
            lx.this.j($$0);
         }
      }

      private ahd a(mm $$0, cwj $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, lx.this.c));
      }

      public lx.b a(kh $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<lx.b, cwj> $$2 = lx.h.get($$0x);
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
      ma create(cwj var1, ahd var2, mo var3, BiConsumer<ahd, Supplier<JsonElement>> var4);
   }

   static record d(mm a, String b) {
   }

   static enum e {
      a,
      b;

      public mm a() {
         return this == a ? mn.ap : mn.ao;
      }

      public mm b() {
         return this == a ? mn.ar : mn.aq;
      }
   }

   class f {
      private final mo b;

      public f(mo $$0) {
         this.b = $$0;
      }

      public lx.f a(cwj $$0) {
         mo $$1 = this.b.c(mp.d, this.b.a(mp.i));
         ahd $$2 = mn.j.a($$0, $$1, lx.this.c);
         lx.this.b.accept(lx.d($$0, $$2));
         return this;
      }

      public lx.f b(cwj $$0) {
         ahd $$1 = mn.j.a($$0, this.b, lx.this.c);
         lx.this.b.accept(lx.d($$0, $$1));
         return this;
      }

      public lx.f c(cwj $$0) {
         ahd $$1 = mn.j.a($$0, this.b, lx.this.c);
         ahd $$2 = mn.k.a($$0, this.b, lx.this.c);
         lx.this.b.accept(lx.d($$0, $$1, $$2));
         return this;
      }

      public lx.f d(cwj $$0) {
         lx.this.b.accept(lx.a($$0, this.b, lx.this.c));
         return this;
      }
   }
}
