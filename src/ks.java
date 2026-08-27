import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ks {
   final Consumer<kv> b;
   final BiConsumer<aew, Supplier<JsonElement>> c;
   private final Consumer<cja> d;
   final List<csv> e = ImmutableList.of(csw.ez, csw.eF, csw.hY);
   final Map<csv, ks.c> f = ImmutableMap.builder().put(csw.b, ks::a).put(csw.rI, ks::c).put(csw.eN, ks::b).build();
   final Map<csv, ll> g = ImmutableMap.builder()
      .put(csw.aV, ll.x.get(csw.aV))
      .put(csw.jp, ll.x.get(csw.jp))
      .put(csw.jS, ll.a(lj.a(csw.aV, "_top")))
      .put(csw.jU, ll.a(lj.a(csw.jp, "_top")))
      .put(csw.aX, ll.c.get(csw.aV).a($$0x -> $$0x.a(lk.i, lj.G(csw.aX))))
      .put(csw.jr, ll.c.get(csw.jp).a($$0x -> $$0x.a(lk.i, lj.G(csw.jr))))
      .put(csw.hd, ll.c.get(csw.hd))
      .put(csw.jT, ll.a(lj.a(csw.hd, "_bottom")))
      .put(csw.pr, ll.y.get(csw.pr))
      .put(csw.rI, ll.y.get(csw.rI))
      .put(csw.he, ll.c.get(csw.he).a($$0x -> $$0x.a(lk.i, lj.G(csw.he))))
      .put(csw.aW, ll.c.get(csw.aW).a($$0x -> {
         $$0x.a(lk.d, lj.a(csw.aV, "_top"));
         $$0x.a(lk.i, lj.G(csw.aW));
      }))
      .put(csw.jq, ll.c.get(csw.jq).a($$0x -> {
         $$0x.a(lk.d, lj.a(csw.jp, "_top"));
         $$0x.a(lk.i, lj.G(csw.jq));
      }))
      .build();
   static final Map<jf.b, BiConsumer<ks.b, csv>> h = ImmutableMap.builder()
      .put(jf.b.a, ks.b::a)
      .put(jf.b.e, ks.b::l)
      .put(jf.b.b, ks.b::k)
      .put(jf.b.c, ks.b::k)
      .put(jf.b.f, ks.b::c)
      .put(jf.b.g, ks.b::d)
      .put(jf.b.h, ks.b::e)
      .put(jf.b.i, ks.b::f)
      .put(jf.b.k, ks.b::h)
      .put(jf.b.l, ks.b::i)
      .put(jf.b.m, ks.b::j)
      .put(jf.b.n, ks.b::g)
      .put(jf.b.p, ks.b::m)
      .put(jf.b.q, ks.b::b)
      .build();
   public static final List<Pair<dga, Function<aew, lb>>> a = List.of(
      Pair.of(dfz.L, (Function<aew, lb>)$$0 -> lb.a().a(lc.c, $$0)),
      Pair.of(dfz.M, (Function<aew, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.b, lc.a.b).a(lc.d, true)),
      Pair.of(dfz.N, (Function<aew, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.b, lc.a.c).a(lc.d, true)),
      Pair.of(dfz.O, (Function<aew, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.b, lc.a.d).a(lc.d, true)),
      Pair.of(dfz.J, (Function<aew, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.a, lc.a.d).a(lc.d, true)),
      Pair.of(dfz.K, (Function<aew, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.a, lc.a.b).a(lc.d, true))
   );
   private static final Map<ks.d, aew> i = new HashMap<>();

   private static kv a(csv $$0, aew $$1, lj $$2, BiConsumer<aew, Supplier<JsonElement>> $$3) {
      aew $$4 = li.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static kv b(csv $$0, aew $$1, lj $$2, BiConsumer<aew, Supplier<JsonElement>> $$3) {
      aew $$4 = li.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static kv c(csv $$0, aew $$1, lj $$2, BiConsumer<aew, Supplier<JsonElement>> $$3) {
      aew $$4 = li.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ks(Consumer<kv> $$0, BiConsumer<aew, Supplier<JsonElement>> $$1, Consumer<cja> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(csv $$0) {
      this.d.accept($$0.k());
   }

   void a(csv $$0, aew $$1) {
      this.c.accept(lg.a($$0.k()), new lf($$1));
   }

   private void a(cja $$0, aew $$1) {
      this.c.accept(lg.a($$0), new lf($$1));
   }

   void a(cja $$0) {
      li.bv.a(lg.a($$0), lj.b($$0), this.c);
   }

   private void d(csv $$0) {
      cja $$1 = $$0.k();
      if ($$1 != cji.a) {
         li.bv.a(lg.a($$1), lj.F($$0), this.c);
      }
   }

   private void a(csv $$0, String $$1) {
      cja $$2 = $$0.k();
      li.bv.a(lg.a($$2), lj.k(lj.a($$0, $$1)), this.c);
   }

   private static kz b() {
      return kz.a(dfz.R).a(ha.f, lb.a().a(lc.b, lc.a.b)).a(ha.d, lb.a().a(lc.b, lc.a.c)).a(ha.e, lb.a().a(lc.b, lc.a.d)).a(ha.c, lb.a());
   }

   private static kz c() {
      return kz.a(dfz.R).a(ha.d, lb.a()).a(ha.e, lb.a().a(lc.b, lc.a.b)).a(ha.c, lb.a().a(lc.b, lc.a.c)).a(ha.f, lb.a().a(lc.b, lc.a.d));
   }

   private static kz d() {
      return kz.a(dfz.R).a(ha.f, lb.a()).a(ha.d, lb.a().a(lc.b, lc.a.b)).a(ha.e, lb.a().a(lc.b, lc.a.c)).a(ha.c, lb.a().a(lc.b, lc.a.d));
   }

   private static kz e() {
      return kz.a(dfz.P)
         .a(ha.a, lb.a().a(lc.a, lc.a.b))
         .a(ha.b, lb.a().a(lc.a, lc.a.d))
         .a(ha.c, lb.a())
         .a(ha.d, lb.a().a(lc.b, lc.a.c))
         .a(ha.e, lb.a().a(lc.b, lc.a.d))
         .a(ha.f, lb.a().a(lc.b, lc.a.b));
   }

   private static ky b(csv $$0, aew $$1) {
      return ky.a($$0, a($$1));
   }

   private static lb[] a(aew $$0) {
      return new lb[]{lb.a().a(lc.c, $$0), lb.a().a(lc.c, $$0).a(lc.b, lc.a.b), lb.a().a(lc.c, $$0).a(lc.b, lc.a.c), lb.a().a(lc.c, $$0).a(lc.b, lc.a.d)};
   }

   private static ky a(csv $$0, aew $$1, aew $$2) {
      return ky.a($$0, lb.a().a(lc.c, $$1), lb.a().a(lc.c, $$2), lb.a().a(lc.c, $$1).a(lc.b, lc.a.c), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c));
   }

   private static kz a(dga $$0, aew $$1, aew $$2) {
      return kz.a($$0).a(true, lb.a().a(lc.c, $$1)).a(false, lb.a().a(lc.c, $$2));
   }

   private void e(csv $$0) {
      aew $$1 = ll.a.create($$0, this.c);
      aew $$2 = ll.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(csv $$0) {
      aew $$1 = ll.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(csv $$0) {
      this.b.accept(ky.a($$0).a(kz.a(dfz.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aew $$3 = lj.a($$0, $$2);
         return lb.a().a(lc.c, li.c.a($$0, $$2, new lj().a(lk.a, $$3), this.c));
      })));
      this.a($$0, lj.a($$0, "_0"));
   }

   static kv b(csv $$0, aew $$1, aew $$2) {
      return ky.a($$0)
         .a(kz.a(dfz.w).a(false, lb.a().a(lc.c, $$1)).a(true, lb.a().a(lc.c, $$2)))
         .a(
            kz.a(dfz.U, dfz.R)
               .a(dfu.a, ha.f, lb.a().a(lc.b, lc.a.b))
               .a(dfu.a, ha.e, lb.a().a(lc.b, lc.a.d))
               .a(dfu.a, ha.d, lb.a().a(lc.b, lc.a.c))
               .a(dfu.a, ha.c, lb.a())
               .a(dfu.b, ha.f, lb.a().a(lc.b, lc.a.b).a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfu.b, ha.e, lb.a().a(lc.b, lc.a.d).a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfu.b, ha.d, lb.a().a(lc.b, lc.a.c).a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfu.b, ha.c, lb.a().a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfu.c, ha.f, lb.a().a(lc.b, lc.a.d).a(lc.a, lc.a.c))
               .a(dfu.c, ha.e, lb.a().a(lc.b, lc.a.b).a(lc.a, lc.a.c))
               .a(dfu.c, ha.d, lb.a().a(lc.a, lc.a.c))
               .a(dfu.c, ha.c, lb.a().a(lc.b, lc.a.c).a(lc.a, lc.a.c))
         );
   }

   private static kz.d<ha, dgf, dge, Boolean> a(kz.d<ha, dgf, dge, Boolean> $$0, dgf $$1, aew $$2, aew $$3, aew $$4, aew $$5) {
      return $$0.a(ha.f, $$1, dge.a, false, lb.a().a(lc.c, $$2))
         .a(ha.d, $$1, dge.a, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
         .a(ha.e, $$1, dge.a, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
         .a(ha.c, $$1, dge.a, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
         .a(ha.f, $$1, dge.b, false, lb.a().a(lc.c, $$4))
         .a(ha.d, $$1, dge.b, false, lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
         .a(ha.e, $$1, dge.b, false, lb.a().a(lc.c, $$4).a(lc.b, lc.a.c))
         .a(ha.c, $$1, dge.b, false, lb.a().a(lc.c, $$4).a(lc.b, lc.a.d))
         .a(ha.f, $$1, dge.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
         .a(ha.d, $$1, dge.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
         .a(ha.e, $$1, dge.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
         .a(ha.c, $$1, dge.a, true, lb.a().a(lc.c, $$3))
         .a(ha.f, $$1, dge.b, true, lb.a().a(lc.c, $$5).a(lc.b, lc.a.d))
         .a(ha.d, $$1, dge.b, true, lb.a().a(lc.c, $$5))
         .a(ha.e, $$1, dge.b, true, lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
         .a(ha.c, $$1, dge.b, true, lb.a().a(lc.c, $$5).a(lc.b, lc.a.c));
   }

   private static kv a(csv $$0, aew $$1, aew $$2, aew $$3, aew $$4, aew $$5, aew $$6, aew $$7, aew $$8) {
      return ky.a($$0).a(a(a(kz.a(dfz.R, dfz.ae, dfz.be, dfz.u), dgf.b, $$1, $$2, $$3, $$4), dgf.a, $$5, $$6, $$7, $$8));
   }

   static kv a(csv $$0, aew $$1, aew $$2, aew $$3, aew $$4, aew $$5) {
      return kx.a($$0)
         .a(lb.a().a(lc.c, $$1))
         .a(kw.a().a(dfz.L, true), lb.a().a(lc.c, $$2).a(lc.d, false))
         .a(kw.a().a(dfz.M, true), lb.a().a(lc.c, $$3).a(lc.d, false))
         .a(kw.a().a(dfz.N, true), lb.a().a(lc.c, $$4).a(lc.d, false))
         .a(kw.a().a(dfz.O, true), lb.a().a(lc.c, $$5).a(lc.d, false));
   }

   static kv c(csv $$0, aew $$1, aew $$2) {
      return kx.a($$0)
         .a(lb.a().a(lc.c, $$1))
         .a(kw.a().a(dfz.L, true), lb.a().a(lc.c, $$2).a(lc.d, true))
         .a(kw.a().a(dfz.M, true), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true))
         .a(kw.a().a(dfz.N, true), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true))
         .a(kw.a().a(dfz.O, true), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true));
   }

   static kv a(csv $$0, aew $$1, aew $$2, aew $$3) {
      return kx.a($$0)
         .a(kw.a().a(dfz.J, true), lb.a().a(lc.c, $$1))
         .a(kw.a().a(dfz.X, dgv.b), lb.a().a(lc.c, $$2).a(lc.d, true))
         .a(kw.a().a(dfz.W, dgv.b), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true))
         .a(kw.a().a(dfz.Y, dgv.b), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true))
         .a(kw.a().a(dfz.Z, dgv.b), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true))
         .a(kw.a().a(dfz.X, dgv.c), lb.a().a(lc.c, $$3).a(lc.d, true))
         .a(kw.a().a(dfz.W, dgv.c), lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true))
         .a(kw.a().a(dfz.Y, dgv.c), lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true))
         .a(kw.a().a(dfz.Z, dgv.c), lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true));
   }

   static kv a(csv $$0, aew $$1, aew $$2, aew $$3, aew $$4, boolean $$5) {
      return ky.a($$0, lb.a().a(lc.d, $$5))
         .a(c())
         .a(
            kz.a(dfz.q, dfz.u)
               .a(false, false, lb.a().a(lc.c, $$2))
               .a(true, false, lb.a().a(lc.c, $$4))
               .a(false, true, lb.a().a(lc.c, $$1))
               .a(true, true, lb.a().a(lc.c, $$3))
         );
   }

   static kv b(csv $$0, aew $$1, aew $$2, aew $$3) {
      return ky.a($$0)
         .a(
            kz.a(dfz.R, dfz.af, dfz.bi)
               .a(ha.f, dgi.b, dgs.a, lb.a().a(lc.c, $$2))
               .a(ha.e, dgi.b, dgs.a, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgi.b, dgs.a, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgi.b, dgs.a, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgi.b, dgs.e, lb.a().a(lc.c, $$3))
               .a(ha.e, dgi.b, dgs.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgi.b, dgs.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgi.b, dgs.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgi.b, dgs.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.e, dgi.b, dgs.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.d, dgi.b, dgs.d, lb.a().a(lc.c, $$3))
               .a(ha.c, dgi.b, dgs.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.f, dgi.b, dgs.c, lb.a().a(lc.c, $$1))
               .a(ha.e, dgi.b, dgs.c, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgi.b, dgs.c, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgi.b, dgs.c, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgi.b, dgs.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.e, dgi.b, dgs.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.d, dgi.b, dgs.b, lb.a().a(lc.c, $$1))
               .a(ha.c, dgi.b, dgs.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.f, dgi.a, dgs.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.e, dgi.a, dgs.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgi.a, dgs.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgi.a, dgs.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgi.a, dgs.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.e, dgi.a, dgs.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.d, dgi.a, dgs.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.c, dgi.a, dgs.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.f, dgi.a, dgs.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.e, dgi.a, dgs.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgi.a, dgs.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgi.a, dgs.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgi.a, dgs.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.e, dgi.a, dgs.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.d, dgi.a, dgs.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.c, dgi.a, dgs.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.f, dgi.a, dgs.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.e, dgi.a, dgs.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgi.a, dgs.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgi.a, dgs.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
         );
   }

   private static kv c(csv $$0, aew $$1, aew $$2, aew $$3) {
      return ky.a($$0)
         .a(
            kz.a(dfz.R, dfz.af, dfz.u)
               .a(ha.c, dgi.b, false, lb.a().a(lc.c, $$2))
               .a(ha.d, dgi.b, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
               .a(ha.f, dgi.b, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
               .a(ha.e, dgi.b, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
               .a(ha.c, dgi.a, false, lb.a().a(lc.c, $$1))
               .a(ha.d, dgi.a, false, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
               .a(ha.f, dgi.a, false, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
               .a(ha.e, dgi.a, false, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
               .a(ha.c, dgi.b, true, lb.a().a(lc.c, $$3))
               .a(ha.d, dgi.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(ha.f, dgi.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(ha.e, dgi.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               .a(ha.c, dgi.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.c))
               .a(ha.d, dgi.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.a))
               .a(ha.f, dgi.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.d))
               .a(ha.e, dgi.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.b))
         );
   }

   private static kv d(csv $$0, aew $$1, aew $$2, aew $$3) {
      return ky.a($$0)
         .a(
            kz.a(dfz.R, dfz.af, dfz.u)
               .a(ha.c, dgi.b, false, lb.a().a(lc.c, $$2))
               .a(ha.d, dgi.b, false, lb.a().a(lc.c, $$2))
               .a(ha.f, dgi.b, false, lb.a().a(lc.c, $$2))
               .a(ha.e, dgi.b, false, lb.a().a(lc.c, $$2))
               .a(ha.c, dgi.a, false, lb.a().a(lc.c, $$1))
               .a(ha.d, dgi.a, false, lb.a().a(lc.c, $$1))
               .a(ha.f, dgi.a, false, lb.a().a(lc.c, $$1))
               .a(ha.e, dgi.a, false, lb.a().a(lc.c, $$1))
               .a(ha.c, dgi.b, true, lb.a().a(lc.c, $$3))
               .a(ha.d, dgi.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(ha.f, dgi.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(ha.e, dgi.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               .a(ha.c, dgi.a, true, lb.a().a(lc.c, $$3))
               .a(ha.d, dgi.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(ha.f, dgi.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(ha.e, dgi.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
         );
   }

   static ky c(csv $$0, aew $$1) {
      return ky.a($$0, lb.a().a(lc.c, $$1));
   }

   private static kz f() {
      return kz.a(dfz.I).a(ha.a.b, lb.a()).a(ha.a.c, lb.a().a(lc.a, lc.a.b)).a(ha.a.a, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b));
   }

   static kv a(csv $$0, lj $$1, BiConsumer<aew, Supplier<JsonElement>> $$2) {
      aew $$3 = li.f.a($$0, $$1, $$2);
      aew $$4 = li.g.a($$0, $$1, $$2);
      aew $$5 = li.h.a($$0, $$1, $$2);
      aew $$6 = li.i.a($$0, $$1, $$2);
      return ky.a($$0, lb.a().a(lc.c, $$6)).a(kz.a(dfz.I).a(ha.a.a, lb.a().a(lc.c, $$3)).a(ha.a.b, lb.a().a(lc.c, $$4)).a(ha.a.c, lb.a().a(lc.c, $$5)));
   }

   static kv d(csv $$0, aew $$1) {
      return ky.a($$0, lb.a().a(lc.c, $$1)).a(f());
   }

   private void e(csv $$0, aew $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(csv $$0, ll.a $$1) {
      aew $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(csv $$0, ll.a $$1) {
      aew $$2 = $$1.create($$0, this.c);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, $$2)).a(b()));
   }

   static kv d(csv $$0, aew $$1, aew $$2) {
      return ky.a($$0)
         .a(
            kz.a(dfz.I)
               .a(ha.a.b, lb.a().a(lc.c, $$1))
               .a(ha.a.c, lb.a().a(lc.c, $$2).a(lc.a, lc.a.b))
               .a(ha.a.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.b).a(lc.b, lc.a.b))
         );
   }

   private void a(csv $$0, ll.a $$1, ll.a $$2) {
      aew $$3 = $$1.create($$0, this.c);
      aew $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aew a(csv $$0, String $$1, lh $$2, Function<aew, lj> $$3) {
      return $$2.a($$0, $$1, $$3.apply(lj.a($$0, $$1)), this.c);
   }

   static kv e(csv $$0, aew $$1, aew $$2) {
      return ky.a($$0).a(a(dfz.w, $$2, $$1));
   }

   static kv e(csv $$0, aew $$1, aew $$2, aew $$3) {
      return ky.a($$0).a(kz.a(dfz.bh).a(dgr.b, lb.a().a(lc.c, $$1)).a(dgr.a, lb.a().a(lc.c, $$2)).a(dgr.c, lb.a().a(lc.c, $$3)));
   }

   public void a(csv $$0) {
      this.b($$0, ll.a);
   }

   public void b(csv $$0, ll.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(csv $$0, lj $$1, lh $$2) {
      aew $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ks.b h(csv $$0) {
      ll $$1 = this.g.getOrDefault($$0, ll.a.get($$0));
      return new ks.b($$1.b()).a($$0, $$1.a());
   }

   public void a(csv $$0, csv $$1, csv $$2) {
      lj $$3 = lj.u($$0);
      aew $$4 = li.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(csv $$0) {
      lj $$1 = lj.t($$0);
      aew $$2 = li.t.a($$0, $$1, this.c);
      aew $$3 = li.u.a($$0, $$1, this.c);
      aew $$4 = li.v.a($$0, $$1, this.c);
      aew $$5 = li.w.a($$0, $$1, this.c);
      aew $$6 = li.x.a($$0, $$1, this.c);
      aew $$7 = li.y.a($$0, $$1, this.c);
      aew $$8 = li.z.a($$0, $$1, this.c);
      aew $$9 = li.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(csv $$0) {
      lj $$1 = lj.b($$0);
      aew $$2 = li.ai.a($$0, $$1, this.c);
      aew $$3 = li.aj.a($$0, $$1, this.c);
      aew $$4 = li.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(csv $$0) {
      lj $$1 = lj.b($$0);
      aew $$2 = li.af.a($$0, $$1, this.c);
      aew $$3 = li.ag.a($$0, $$1, this.c);
      aew $$4 = li.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(csw.rC);
      aew $$0 = lg.a(csw.rC);
      aew $$1 = lg.a(csw.rC, "_partial_tilt");
      aew $$2 = lg.a(csw.rC, "_full_tilt");
      this.b
         .accept(
            ky.a(csw.rC)
               .a(b())
               .a(kz.a(dfz.bl).a(dgu.a, lb.a().a(lc.c, $$0)).a(dgu.b, lb.a().a(lc.c, $$0)).a(dgu.c, lb.a().a(lc.c, $$1)).a(dgu.d, lb.a().a(lc.c, $$2)))
         );
   }

   private ks.f l(csv $$0) {
      return new ks.f(lj.n($$0));
   }

   private void m(csv $$0) {
      this.a($$0, $$0);
   }

   private void a(csv $$0, csv $$1) {
      this.b.accept(c($$0, lg.a($$1)));
   }

   private void a(csv $$0, ks.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(csv $$0, ks.e $$1, lj $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csv $$0, ks.e $$1) {
      lj $$2 = lj.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csv $$0, ks.e $$1, lj $$2) {
      aew $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(csv $$0, ks.e $$1, dgm<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         kz $$4 = kz.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            lj $$5 = lj.c(lj.a($$0, $$4x));
            aew $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return lb.a().a(lc.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(ky.a($$0).a($$4));
      }
   }

   private void a(csv $$0, csv $$1, ks.e $$2) {
      this.a($$0, $$2);
      lj $$3 = lj.d($$0);
      aew $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(csv $$0, csv $$1) {
      ll $$2 = ll.o.get($$0);
      aew $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aew $$4 = li.aA.a($$1, $$2.b(), this.c);
      this.b.accept(ky.a($$1, lb.a().a(lc.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(csv $$0, csv $$1) {
      this.a($$0.k());
      lj $$2 = lj.h($$0);
      lj $$3 = lj.a($$0, $$1);
      aew $$4 = li.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            ky.a($$1, lb.a().a(lc.c, $$4))
               .a(kz.a(dfz.R).a(ha.e, lb.a()).a(ha.d, lb.a().a(lc.b, lc.a.d)).a(ha.c, lb.a().a(lc.b, lc.a.b)).a(ha.f, lb.a().a(lc.b, lc.a.c)))
         );
      this.b.accept(ky.a($$0).a(kz.a(dfz.av).a($$2x -> lb.a().a(lc.c, li.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      csv $$0 = csw.kC;
      this.a($$0.k());
      aew $$1 = lg.a($$0, "_top");
      aew $$2 = lg.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      csv $$0 = csw.kB;
      this.a($$0.k());
      kz $$1 = kz.a(cyi.b, dfz.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> lb.a().a(lc.c, lg.a($$0, "_top_stage_" + $$1x));
            case b -> lb.a().a(lc.c, lg.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(ky.a($$0).a($$1));
   }

   private void a(csv $$0, csv $$1, csv $$2, csv $$3, csv $$4, csv $$5, csv $$6, csv $$7) {
      this.a($$0, ks.e.b);
      this.a($$1, ks.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(csv $$0, ks.e $$1) {
      this.a($$0, "_top");
      aew $$2 = this.a($$0, "_top", $$1.a(), lj::c);
      aew $$3 = this.a($$0, "_bottom", $$1.a(), lj::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(csw.iD, "_front");
      aew $$0 = lg.a(csw.iD, "_top");
      aew $$1 = this.a(csw.iD, "_bottom", ks.e.b.a(), lj::c);
      this.f(csw.iD, $$0, $$1);
   }

   private void k() {
      aew $$0 = this.a(csw.bx, "_top", li.bi, lj::a);
      aew $$1 = this.a(csw.bx, "_bottom", li.bi, lj::a);
      this.f(csw.bx, $$0, $$1);
   }

   private void l() {
      this.c(csw.rE);
      aew $$0 = lg.a(csw.rE, "_top");
      aew $$1 = lg.a(csw.rE, "_bottom");
      this.b.accept(ky.a(csw.rE).a(b()).a(kz.a(dfz.ae).a(dgf.b, lb.a().a(lc.c, $$1)).a(dgf.a, lb.a().a(lc.c, $$0))));
   }

   private void f(csv $$0, aew $$1, aew $$2) {
      this.b.accept(ky.a($$0).a(kz.a(dfz.ae).a(dgf.b, lb.a().a(lc.c, $$2)).a(dgf.a, lb.a().a(lc.c, $$1))));
   }

   private void n(csv $$0) {
      lj $$1 = lj.e($$0);
      lj $$2 = lj.e(lj.a($$0, "_corner"));
      aew $$3 = li.aq.a($$0, $$1, this.c);
      aew $$4 = li.ar.a($$0, $$2, this.c);
      aew $$5 = li.as.a($$0, $$1, this.c);
      aew $$6 = li.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            ky.a($$0)
               .a(
                  kz.a(dfz.ag)
                     .a(dgn.a, lb.a().a(lc.c, $$3))
                     .a(dgn.b, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
                     .a(dgn.c, lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
                     .a(dgn.d, lb.a().a(lc.c, $$6).a(lc.b, lc.a.b))
                     .a(dgn.e, lb.a().a(lc.c, $$5))
                     .a(dgn.f, lb.a().a(lc.c, $$6))
                     .a(dgn.g, lb.a().a(lc.c, $$4))
                     .a(dgn.h, lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
                     .a(dgn.i, lb.a().a(lc.c, $$4).a(lc.b, lc.a.c))
                     .a(dgn.j, lb.a().a(lc.c, $$4).a(lc.b, lc.a.d))
               )
         );
   }

   private void o(csv $$0) {
      aew $$1 = this.a($$0, "", li.aq, lj::e);
      aew $$2 = this.a($$0, "", li.as, lj::e);
      aew $$3 = this.a($$0, "", li.at, lj::e);
      aew $$4 = this.a($$0, "_on", li.aq, lj::e);
      aew $$5 = this.a($$0, "_on", li.as, lj::e);
      aew $$6 = this.a($$0, "_on", li.at, lj::e);
      kz $$7 = kz.a(dfz.w, dfz.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return lb.a().a(lc.c, $$6x ? $$4 : $$1);
            case b:
               return lb.a().a(lc.c, $$6x ? $$4 : $$1).a(lc.b, lc.a.b);
            case c:
               return lb.a().a(lc.c, $$6x ? $$5 : $$2).a(lc.b, lc.a.b);
            case d:
               return lb.a().a(lc.c, $$6x ? $$6 : $$3).a(lc.b, lc.a.b);
            case e:
               return lb.a().a(lc.c, $$6x ? $$5 : $$2);
            case f:
               return lb.a().a(lc.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(ky.a($$0).a($$7));
   }

   private ks.a a(aew $$0, csv $$1) {
      return new ks.a($$0, $$1);
   }

   private ks.a d(csv $$0, csv $$1) {
      return new ks.a(lg.a($$0), $$1);
   }

   private void a(csv $$0, cja $$1) {
      aew $$2 = li.Y.a($$0, lj.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(csv $$0, aew $$1) {
      aew $$2 = li.Y.a($$0, lj.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(csv $$0, csv $$1) {
      this.a($$0);
      aew $$2 = ll.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(csv $$0) {
      this.a($$0.k());
      aew $$1 = ll.j.create($$0, this.c);
      aew $$2 = ll.k.create($$0, this.c);
      aew $$3 = ll.l.create($$0, this.c);
      aew $$4 = ll.m.create($$0, this.c);
      this.b
         .accept(
            kx.a($$0)
               .a(kw.a().a(dfz.S, 1, 2, 3, 4).a(dfz.R, ha.c), lb.a().a(lc.c, $$1))
               .a(kw.a().a(dfz.S, 1, 2, 3, 4).a(dfz.R, ha.f), lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.S, 1, 2, 3, 4).a(dfz.R, ha.d), lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
               .a(kw.a().a(dfz.S, 1, 2, 3, 4).a(dfz.R, ha.e), lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
               .a(kw.a().a(dfz.S, 2, 3, 4).a(dfz.R, ha.c), lb.a().a(lc.c, $$2))
               .a(kw.a().a(dfz.S, 2, 3, 4).a(dfz.R, ha.f), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.S, 2, 3, 4).a(dfz.R, ha.d), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
               .a(kw.a().a(dfz.S, 2, 3, 4).a(dfz.R, ha.e), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
               .a(kw.a().a(dfz.S, 3, 4).a(dfz.R, ha.c), lb.a().a(lc.c, $$3))
               .a(kw.a().a(dfz.S, 3, 4).a(dfz.R, ha.f), lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.S, 3, 4).a(dfz.R, ha.d), lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(kw.a().a(dfz.S, 3, 4).a(dfz.R, ha.e), lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               .a(kw.a().a(dfz.S, 4).a(dfz.R, ha.c), lb.a().a(lc.c, $$4))
               .a(kw.a().a(dfz.S, 4).a(dfz.R, ha.f), lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.S, 4).a(dfz.R, ha.d), lb.a().a(lc.c, $$4).a(lc.b, lc.a.c))
               .a(kw.a().a(dfz.S, 4).a(dfz.R, ha.e), lb.a().a(lc.c, $$4).a(lc.b, lc.a.d))
         );
   }

   private void a(ll.a $$0, csv... $$1) {
      for (csv $$2 : $$1) {
         aew $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ll.a $$0, csv... $$1) {
      for (csv $$2 : $$1) {
         aew $$3 = $$0.create($$2, this.c);
         this.b.accept(ky.a($$2, lb.a().a(lc.c, $$3)).a(c()));
      }
   }

   private void f(csv $$0, csv $$1) {
      this.a($$0);
      lj $$2 = lj.b($$0, $$1);
      aew $$3 = li.aG.a($$1, $$2, this.c);
      aew $$4 = li.aH.a($$1, $$2, this.c);
      aew $$5 = li.aI.a($$1, $$2, this.c);
      aew $$6 = li.aE.a($$1, $$2, this.c);
      aew $$7 = li.aF.a($$1, $$2, this.c);
      cja $$8 = $$1.k();
      li.bv.a(lg.a($$8), lj.F($$0), this.c);
      this.b
         .accept(
            kx.a($$1)
               .a(lb.a().a(lc.c, $$3))
               .a(kw.a().a(dfz.L, true), lb.a().a(lc.c, $$4))
               .a(kw.a().a(dfz.M, true), lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.N, true), lb.a().a(lc.c, $$5))
               .a(kw.a().a(dfz.O, true), lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.L, false), lb.a().a(lc.c, $$6))
               .a(kw.a().a(dfz.M, false), lb.a().a(lc.c, $$7))
               .a(kw.a().a(dfz.N, false), lb.a().a(lc.c, $$7).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.O, false), lb.a().a(lc.c, $$6).a(lc.b, lc.a.d))
         );
   }

   private void q(csv $$0) {
      lj $$1 = lj.z($$0);
      aew $$2 = li.aJ.a($$0, $$1, this.c);
      aew $$3 = this.a($$0, "_conditional", li.aJ, $$1x -> $$1.c(lk.i, $$1x));
      this.b.accept(ky.a($$0).a(a(dfz.c, $$3, $$2)).a(e()));
   }

   private void r(csv $$0) {
      aew $$1 = ll.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<lb> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> lb.a().a(lc.c, lg.a(csw.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(csw.mZ);
      this.b
         .accept(
            kx.a(csw.mZ)
               .a(kw.a().a(dfz.aq, 0), this.a(0))
               .a(kw.a().a(dfz.aq, 1), this.a(1))
               .a(kw.a().a(dfz.bk, dfv.b), lb.a().a(lc.c, lg.a(csw.mZ, "_small_leaves")))
               .a(kw.a().a(dfz.bk, dfv.c), lb.a().a(lc.c, lg.a(csw.mZ, "_large_leaves")))
         );
   }

   private kz n() {
      return kz.a(dfz.P)
         .a(ha.a, lb.a().a(lc.a, lc.a.c))
         .a(ha.b, lb.a())
         .a(ha.c, lb.a().a(lc.a, lc.a.b))
         .a(ha.d, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.c))
         .a(ha.e, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.d))
         .a(ha.f, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b));
   }

   private void o() {
      aew $$0 = lj.a(csw.nU, "_top_open");
      this.b
         .accept(
            ky.a(csw.nU)
               .a(this.n())
               .a(
                  kz.a(dfz.u)
                     .a(false, lb.a().a(lc.c, ll.e.create(csw.nU, this.c)))
                     .a(true, lb.a().a(lc.c, ll.e.get(csw.nU).a($$1 -> $$1.a(lk.f, $$0)).a(csw.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> kz a(dgm<T> $$0, T $$1, aew $$2, aew $$3) {
      lb $$4 = lb.a().a(lc.c, $$2);
      lb $$5 = lb.a().a(lc.c, $$3);
      return kz.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(csv $$0, Function<csv, lj> $$1) {
      lj $$2 = $$1.apply($$0).b(lk.i, lk.c);
      lj $$3 = $$2.c(lk.g, lj.a($$0, "_front_honey"));
      aew $$4 = li.o.a($$0, $$2, this.c);
      aew $$5 = li.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(ky.a($$0).a(b()).a(a(dfz.aN, 5, $$5, $$4)));
   }

   private void a(csv $$0, dgm<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aew> $$3 = new Int2ObjectOpenHashMap();
         kz $$4 = kz.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aew $$5 = (aew)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, li.aT, lj::g));
            return lb.a().a(lc.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(ky.a($$0).a($$4));
      }
   }

   private void p() {
      aew $$0 = lg.a(csw.od, "_floor");
      aew $$1 = lg.a(csw.od, "_ceiling");
      aew $$2 = lg.a(csw.od, "_wall");
      aew $$3 = lg.a(csw.od, "_between_walls");
      this.a(cji.vs);
      this.b
         .accept(
            ky.a(csw.od)
               .a(
                  kz.a(dfz.R, dfz.V)
                     .a(ha.c, dfx.a, lb.a().a(lc.c, $$0))
                     .a(ha.d, dfx.a, lb.a().a(lc.c, $$0).a(lc.b, lc.a.c))
                     .a(ha.f, dfx.a, lb.a().a(lc.c, $$0).a(lc.b, lc.a.b))
                     .a(ha.e, dfx.a, lb.a().a(lc.c, $$0).a(lc.b, lc.a.d))
                     .a(ha.c, dfx.b, lb.a().a(lc.c, $$1))
                     .a(ha.d, dfx.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
                     .a(ha.f, dfx.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
                     .a(ha.e, dfx.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
                     .a(ha.c, dfx.c, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
                     .a(ha.d, dfx.c, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
                     .a(ha.f, dfx.c, lb.a().a(lc.c, $$2))
                     .a(ha.e, dfx.c, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
                     .a(ha.d, dfx.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
                     .a(ha.c, dfx.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
                     .a(ha.f, dfx.d, lb.a().a(lc.c, $$3))
                     .a(ha.e, dfx.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            ky.a(csw.nZ, lb.a().a(lc.c, lg.a(csw.nZ)))
               .a(
                  kz.a(dfz.U, dfz.R)
                     .a(dfu.a, ha.c, lb.a())
                     .a(dfu.a, ha.f, lb.a().a(lc.b, lc.a.b))
                     .a(dfu.a, ha.d, lb.a().a(lc.b, lc.a.c))
                     .a(dfu.a, ha.e, lb.a().a(lc.b, lc.a.d))
                     .a(dfu.b, ha.c, lb.a().a(lc.a, lc.a.b))
                     .a(dfu.b, ha.f, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b))
                     .a(dfu.b, ha.d, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.c))
                     .a(dfu.b, ha.e, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.d))
                     .a(dfu.c, ha.d, lb.a().a(lc.a, lc.a.c))
                     .a(dfu.c, ha.e, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.b))
                     .a(dfu.c, ha.c, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.c))
                     .a(dfu.c, ha.f, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.d))
               )
         );
   }

   private void d(csv $$0, ll.a $$1) {
      aew $$2 = $$1.create($$0, this.c);
      aew $$3 = lj.a($$0, "_front_on");
      aew $$4 = $$1.get($$0).a($$1x -> $$1x.a(lk.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(ky.a($$0).a(a(dfz.r, $$4, $$2)).a(b()));
   }

   private void a(csv... $$0) {
      aew $$1 = lg.a("campfire_off");

      for (csv $$2 : $$0) {
         aew $$3 = li.ba.a($$2, lj.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(ky.a($$2).a(a(dfz.r, $$3, $$1)).a(c()));
      }
   }

   private void s(csv $$0) {
      aew $$1 = li.br.a($$0, lj.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(csv $$0) {
      aew $$1;
      if ($$0 == csw.si) {
         $$1 = li.bt.a($$0, lj.m($$0), this.c);
      } else {
         $$1 = li.bs.a($$0, lj.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      lj $$0 = lj.a(lj.G(csw.cl), lj.G(csw.n));
      aew $$1 = li.i.a(csw.cl, $$0, this.c);
      this.b.accept(c(csw.cl, $$1));
   }

   private void s() {
      this.a(cji.ll);
      this.b
         .accept(
            kx.a(csw.cw)
               .a(
                  kw.b(
                     kw.a().a(dfz.ab, dgo.c).a(dfz.aa, dgo.c).a(dfz.ac, dgo.c).a(dfz.ad, dgo.c),
                     kw.a().a(dfz.ab, dgo.b, dgo.a).a(dfz.aa, dgo.b, dgo.a),
                     kw.a().a(dfz.aa, dgo.b, dgo.a).a(dfz.ac, dgo.b, dgo.a),
                     kw.a().a(dfz.ac, dgo.b, dgo.a).a(dfz.ad, dgo.b, dgo.a),
                     kw.a().a(dfz.ad, dgo.b, dgo.a).a(dfz.ab, dgo.b, dgo.a)
                  ),
                  lb.a().a(lc.c, lg.a("redstone_dust_dot"))
               )
               .a(kw.a().a(dfz.ab, dgo.b, dgo.a), lb.a().a(lc.c, lg.a("redstone_dust_side0")))
               .a(kw.a().a(dfz.ac, dgo.b, dgo.a), lb.a().a(lc.c, lg.a("redstone_dust_side_alt0")))
               .a(kw.a().a(dfz.aa, dgo.b, dgo.a), lb.a().a(lc.c, lg.a("redstone_dust_side_alt1")).a(lc.b, lc.a.d))
               .a(kw.a().a(dfz.ad, dgo.b, dgo.a), lb.a().a(lc.c, lg.a("redstone_dust_side1")).a(lc.b, lc.a.d))
               .a(kw.a().a(dfz.ab, dgo.a), lb.a().a(lc.c, lg.a("redstone_dust_up")))
               .a(kw.a().a(dfz.aa, dgo.a), lb.a().a(lc.c, lg.a("redstone_dust_up")).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.ac, dgo.a), lb.a().a(lc.c, lg.a("redstone_dust_up")).a(lc.b, lc.a.c))
               .a(kw.a().a(dfz.ad, dgo.a), lb.a().a(lc.c, lg.a("redstone_dust_up")).a(lc.b, lc.a.d))
         );
   }

   private void t() {
      this.a(cji.lp);
      this.b
         .accept(
            ky.a(csw.gY)
               .a(c())
               .a(
                  kz.a(dfz.bd, dfz.w)
                     .a(dgc.a, false, lb.a().a(lc.c, lg.a(csw.gY)))
                     .a(dgc.a, true, lb.a().a(lc.c, lg.a(csw.gY, "_on")))
                     .a(dgc.b, false, lb.a().a(lc.c, lg.a(csw.gY, "_subtract")))
                     .a(dgc.b, true, lb.a().a(lc.c, lg.a(csw.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      lj $$0 = lj.a(csw.jR);
      lj $$1 = lj.a(lj.a(csw.jE, "_side"), $$0.a(lk.f));
      aew $$2 = li.Z.a(csw.jE, $$1, this.c);
      aew $$3 = li.aa.a(csw.jE, $$1, this.c);
      aew $$4 = li.i.b(csw.jE, "_double", $$1, this.c);
      this.b.accept(e(csw.jE, $$2, $$3, $$4));
      this.b.accept(c(csw.jR, li.c.a(csw.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cji.rB);
      this.b
         .accept(
            kx.a(csw.fs)
               .a(lb.a().a(lc.c, lj.G(csw.fs)))
               .a(kw.a().a(dfz.k, true), lb.a().a(lc.c, lj.a(csw.fs, "_bottle0")))
               .a(kw.a().a(dfz.l, true), lb.a().a(lc.c, lj.a(csw.fs, "_bottle1")))
               .a(kw.a().a(dfz.m, true), lb.a().a(lc.c, lj.a(csw.fs, "_bottle2")))
               .a(kw.a().a(dfz.k, false), lb.a().a(lc.c, lj.a(csw.fs, "_empty0")))
               .a(kw.a().a(dfz.l, false), lb.a().a(lc.c, lj.a(csw.fs, "_empty1")))
               .a(kw.a().a(dfz.m, false), lb.a().a(lc.c, lj.a(csw.fs, "_empty2")))
         );
   }

   private void u(csv $$0) {
      aew $$1 = li.bn.a($$0, lj.b($$0), this.c);
      aew $$2 = lg.a("mushroom_block_inside");
      this.b
         .accept(
            kx.a($$0)
               .a(kw.a().a(dfz.L, true), lb.a().a(lc.c, $$1))
               .a(kw.a().a(dfz.M, true), lb.a().a(lc.c, $$1).a(lc.b, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dfz.N, true), lb.a().a(lc.c, $$1).a(lc.b, lc.a.c).a(lc.d, true))
               .a(kw.a().a(dfz.O, true), lb.a().a(lc.c, $$1).a(lc.b, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dfz.J, true), lb.a().a(lc.c, $$1).a(lc.a, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dfz.K, true), lb.a().a(lc.c, $$1).a(lc.a, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dfz.L, false), lb.a().a(lc.c, $$2))
               .a(kw.a().a(dfz.M, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, false))
               .a(kw.a().a(dfz.N, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, false))
               .a(kw.a().a(dfz.O, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, false))
               .a(kw.a().a(dfz.J, false), lb.a().a(lc.c, $$2).a(lc.a, lc.a.d).a(lc.d, false))
               .a(kw.a().a(dfz.K, false), lb.a().a(lc.c, $$2).a(lc.a, lc.a.b).a(lc.d, false))
         );
      this.a($$0, ll.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cji.qN);
      this.b
         .accept(
            ky.a(csw.eh)
               .a(
                  kz.a(dfz.ay)
                     .a(0, lb.a().a(lc.c, lg.a(csw.eh)))
                     .a(1, lb.a().a(lc.c, lg.a(csw.eh, "_slice1")))
                     .a(2, lb.a().a(lc.c, lg.a(csw.eh, "_slice2")))
                     .a(3, lb.a().a(lc.c, lg.a(csw.eh, "_slice3")))
                     .a(4, lb.a().a(lc.c, lg.a(csw.eh, "_slice4")))
                     .a(5, lb.a().a(lc.c, lg.a(csw.eh, "_slice5")))
                     .a(6, lb.a().a(lc.c, lg.a(csw.eh, "_slice6")))
               )
         );
   }

   private void x() {
      lj $$0 = new lj()
         .a(lk.c, lj.a(csw.nX, "_side3"))
         .a(lk.o, lj.G(csw.t))
         .a(lk.n, lj.a(csw.nX, "_top"))
         .a(lk.j, lj.a(csw.nX, "_side3"))
         .a(lk.l, lj.a(csw.nX, "_side3"))
         .a(lk.k, lj.a(csw.nX, "_side1"))
         .a(lk.m, lj.a(csw.nX, "_side2"));
      this.b.accept(c(csw.nX, li.a.a(csw.nX, $$0, this.c)));
   }

   private void y() {
      lj $$0 = new lj()
         .a(lk.c, lj.a(csw.ob, "_front"))
         .a(lk.o, lj.a(csw.ob, "_bottom"))
         .a(lk.n, lj.a(csw.ob, "_top"))
         .a(lk.j, lj.a(csw.ob, "_front"))
         .a(lk.k, lj.a(csw.ob, "_front"))
         .a(lk.l, lj.a(csw.ob, "_side"))
         .a(lk.m, lj.a(csw.ob, "_side"));
      this.b.accept(c(csw.ob, li.a.a(csw.ob, $$0, this.c)));
   }

   private void a(csv $$0, csv $$1, BiFunction<csv, csv, lj> $$2) {
      lj $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, li.a.a($$0, $$3, this.c)));
   }

   public void b(csv $$0) {
      lj $$1 = new lj()
         .a(lk.c, lj.a($$0, "_particle"))
         .a(lk.o, lj.a($$0, "_down"))
         .a(lk.n, lj.a($$0, "_up"))
         .a(lk.j, lj.a($$0, "_north"))
         .a(lk.k, lj.a($$0, "_south"))
         .a(lk.l, lj.a($$0, "_east"))
         .a(lk.m, lj.a($$0, "_west"));
      this.b.accept(c($$0, li.a.a($$0, $$1, this.c)));
   }

   private void z() {
      lj $$0 = lj.k(csw.dV);
      this.b.accept(c(csw.dV, lg.a(csw.dV)));
      this.a(csw.ef, $$0);
      this.a(csw.eg, $$0);
   }

   private void a(csv $$0, lj $$1) {
      aew $$2 = li.n.a($$0, $$1.c(lk.g, lj.G($$0)), this.c);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cji.rC);
      this.m(csw.ft);
      this.b.accept(c(csw.fv, li.bq.a(csw.fv, lj.j(lj.a(csw.H, "_still")), this.c)));
      this.b
         .accept(
            ky.a(csw.fu)
               .a(
                  kz.a(cxb.e)
                     .a(1, lb.a().a(lc.c, li.bo.a(csw.fu, "_level1", lj.j(lj.a(csw.G, "_still")), this.c)))
                     .a(2, lb.a().a(lc.c, li.bp.a(csw.fu, "_level2", lj.j(lj.a(csw.G, "_still")), this.c)))
                     .a(3, lb.a().a(lc.c, li.bq.a(csw.fu, "_full", lj.j(lj.a(csw.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            ky.a(csw.fw)
               .a(
                  kz.a(cxb.e)
                     .a(1, lb.a().a(lc.c, li.bo.a(csw.fw, "_level1", lj.j(lj.G(csw.qC)), this.c)))
                     .a(2, lb.a().a(lc.c, li.bp.a(csw.fw, "_level2", lj.j(lj.G(csw.qC)), this.c)))
                     .a(3, lb.a().a(lc.c, li.bq.a(csw.fw, "_full", lj.j(lj.G(csw.qC)), this.c)))
               )
         );
   }

   private void B() {
      lj $$0 = lj.b(csw.kv);
      aew $$1 = li.aC.a(csw.kv, $$0, this.c);
      aew $$2 = this.a(csw.kv, "_dead", li.aC, $$1x -> $$0.c(lk.b, $$1x));
      this.b.accept(ky.a(csw.kv).a(a(dfz.au, 5, $$2, $$1)));
   }

   private void v(csv $$0) {
      lj $$1 = new lj().a(lk.f, lj.a(csw.cD, "_top")).a(lk.i, lj.a(csw.cD, "_side")).a(lk.g, lj.a($$0, "_front"));
      lj $$2 = new lj().a(lk.i, lj.a(csw.cD, "_top")).a(lk.g, lj.a($$0, "_front_vertical"));
      aew $$3 = li.n.a($$0, $$1, this.c);
      aew $$4 = li.p.a($$0, $$2, this.c);
      this.b
         .accept(
            ky.a($$0)
               .a(
                  kz.a(dfz.P)
                     .a(ha.a, lb.a().a(lc.c, $$4).a(lc.a, lc.a.c))
                     .a(ha.b, lb.a().a(lc.c, $$4))
                     .a(ha.c, lb.a().a(lc.c, $$3))
                     .a(ha.f, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
                     .a(ha.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
                     .a(ha.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               )
         );
   }

   private void C() {
      aew $$0 = lg.a(csw.fy);
      aew $$1 = lg.a(csw.fy, "_filled");
      this.b.accept(ky.a(csw.fy).a(kz.a(dfz.h).a(false, lb.a().a(lc.c, $$0)).a(true, lb.a().a(lc.c, $$1))).a(c()));
   }

   private void D() {
      aew $$0 = lg.a(csw.ku, "_side");
      aew $$1 = lg.a(csw.ku, "_noside");
      aew $$2 = lg.a(csw.ku, "_noside1");
      aew $$3 = lg.a(csw.ku, "_noside2");
      aew $$4 = lg.a(csw.ku, "_noside3");
      this.b
         .accept(
            kx.a(csw.ku)
               .a(kw.a().a(dfz.L, true), lb.a().a(lc.c, $$0))
               .a(kw.a().a(dfz.M, true), lb.a().a(lc.c, $$0).a(lc.b, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dfz.N, true), lb.a().a(lc.c, $$0).a(lc.b, lc.a.c).a(lc.d, true))
               .a(kw.a().a(dfz.O, true), lb.a().a(lc.c, $$0).a(lc.b, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dfz.J, true), lb.a().a(lc.c, $$0).a(lc.a, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dfz.K, true), lb.a().a(lc.c, $$0).a(lc.a, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dfz.L, false), lb.a().a(lc.c, $$1).a(lc.e, 2), lb.a().a(lc.c, $$2), lb.a().a(lc.c, $$3), lb.a().a(lc.c, $$4))
               .a(
                  kw.a().a(dfz.M, false),
                  lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$4).a(lc.b, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.b, lc.a.b).a(lc.d, true)
               )
               .a(
                  kw.a().a(dfz.N, false),
                  lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true),
                  lb.a().a(lc.c, $$4).a(lc.b, lc.a.c).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.b, lc.a.c).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true)
               )
               .a(
                  kw.a().a(dfz.O, false),
                  lb.a().a(lc.c, $$4).a(lc.b, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.b, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true)
               )
               .a(
                  kw.a().a(dfz.J, false),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.a, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$4).a(lc.a, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.a, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.a, lc.a.d).a(lc.d, true)
               )
               .a(
                  kw.a().a(dfz.K, false),
                  lb.a().a(lc.c, $$4).a(lc.a, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.a, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.a, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.a, lc.a.b).a(lc.d, true)
               )
         );
   }

   private void E() {
      this.b
         .accept(
            kx.a(csw.pc)
               .a(lb.a().a(lc.c, lj.G(csw.pc)))
               .a(kw.a().a(dfz.aL, 1), lb.a().a(lc.c, lj.a(csw.pc, "_contents1")))
               .a(kw.a().a(dfz.aL, 2), lb.a().a(lc.c, lj.a(csw.pc, "_contents2")))
               .a(kw.a().a(dfz.aL, 3), lb.a().a(lc.c, lj.a(csw.pc, "_contents3")))
               .a(kw.a().a(dfz.aL, 4), lb.a().a(lc.c, lj.a(csw.pc, "_contents4")))
               .a(kw.a().a(dfz.aL, 5), lb.a().a(lc.c, lj.a(csw.pc, "_contents5")))
               .a(kw.a().a(dfz.aL, 6), lb.a().a(lc.c, lj.a(csw.pc, "_contents6")))
               .a(kw.a().a(dfz.aL, 7), lb.a().a(lc.c, lj.a(csw.pc, "_contents7")))
               .a(kw.a().a(dfz.aL, 8), lb.a().a(lc.c, lj.a(csw.pc, "_contents_ready")))
         );
   }

   private void w(csv $$0) {
      this.c($$0);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, li.am.a($$0, lj.c($$0), this.c))).a(this.n()));
   }

   private void F() {
      this.w(csw.qy);
      this.w(csw.qx);
      this.w(csw.qw);
      this.w(csw.qv);
   }

   private void G() {
      this.c(csw.rs);
      kz.b<ha, dgg> $$0 = kz.a(dfz.bm, dfz.bn);

      for (dgg $$1 : dgg.values()) {
         $$0.a(ha.b, $$1, this.a(ha.b, $$1));
      }

      for (dgg $$2 : dgg.values()) {
         $$0.a(ha.a, $$2, this.a(ha.a, $$2));
      }

      this.b.accept(ky.a(csw.rs).a($$0));
   }

   private lb a(ha $$0, dgg $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      lj $$3 = lj.c(lj.a(csw.rs, $$2));
      return lb.a().a(lc.c, li.al.a(csw.rs, $$2, $$3, this.c));
   }

   private void x(csv $$0) {
      lj $$1 = new lj().a(lk.e, lj.G(csw.dW)).a(lk.f, lj.G($$0)).a(lk.i, lj.a($$0, "_side"));
      this.b.accept(c($$0, li.m.a($$0, $$1, this.c)));
   }

   private void H() {
      aew $$0 = lj.a(csw.gZ, "_side");
      lj $$1 = new lj().a(lk.f, lj.a(csw.gZ, "_top")).a(lk.i, $$0);
      lj $$2 = new lj().a(lk.f, lj.a(csw.gZ, "_inverted_top")).a(lk.i, $$0);
      this.b
         .accept(
            ky.a(csw.gZ)
               .a(kz.a(dfz.p).a(false, lb.a().a(lc.c, li.aD.a(csw.gZ, $$1, this.c))).a(true, lb.a().a(lc.c, li.aD.a(lg.a(csw.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(csv $$0) {
      this.b.accept(ky.a($$0, lb.a().a(lc.c, lg.a($$0))).a(this.n()));
   }

   private void I() {
      csv $$0 = csw.rr;
      aew $$1 = lg.a($$0, "_on");
      aew $$2 = lg.a($$0);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, lg.a($$0))).a(this.n()).a(a(dfz.w, $$1, $$2)));
   }

   private void J() {
      lj $$0 = new lj().a(lk.B, lj.G(csw.j)).a(lk.f, lj.G(csw.cC));
      lj $$1 = new lj().a(lk.B, lj.G(csw.j)).a(lk.f, lj.a(csw.cC, "_moist"));
      aew $$2 = li.aU.a(csw.cC, $$0, this.c);
      aew $$3 = li.aU.a(lj.a(csw.cC, "_moist"), $$1, this.c);
      this.b.accept(ky.a(csw.cC).a(a(dfz.aQ, 7, $$3, $$2)));
   }

   private List<aew> z(csv $$0) {
      aew $$1 = li.aV.a(lg.a($$0, "_floor0"), lj.v($$0), this.c);
      aew $$2 = li.aV.a(lg.a($$0, "_floor1"), lj.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aew> A(csv $$0) {
      aew $$1 = li.aW.a(lg.a($$0, "_side0"), lj.v($$0), this.c);
      aew $$2 = li.aW.a(lg.a($$0, "_side1"), lj.w($$0), this.c);
      aew $$3 = li.aX.a(lg.a($$0, "_side_alt0"), lj.v($$0), this.c);
      aew $$4 = li.aX.a(lg.a($$0, "_side_alt1"), lj.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aew> B(csv $$0) {
      aew $$1 = li.aY.a(lg.a($$0, "_up0"), lj.v($$0), this.c);
      aew $$2 = li.aY.a(lg.a($$0, "_up1"), lj.w($$0), this.c);
      aew $$3 = li.aZ.a(lg.a($$0, "_up_alt0"), lj.v($$0), this.c);
      aew $$4 = li.aZ.a(lg.a($$0, "_up_alt1"), lj.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<lb> a(List<aew> $$0, UnaryOperator<lb> $$1) {
      return $$0.stream().map($$0x -> lb.a().a(lc.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void K() {
      kw $$0 = kw.a().a(dfz.L, false).a(dfz.M, false).a(dfz.N, false).a(dfz.O, false).a(dfz.J, false);
      List<aew> $$1 = this.z(csw.cr);
      List<aew> $$2 = this.A(csw.cr);
      List<aew> $$3 = this.B(csw.cr);
      this.b
         .accept(
            kx.a(csw.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(kw.b(kw.a().a(dfz.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(kw.b(kw.a().a(dfz.M, true), $$0), a($$2, $$0x -> $$0x.a(lc.b, lc.a.b)))
               .a(kw.b(kw.a().a(dfz.N, true), $$0), a($$2, $$0x -> $$0x.a(lc.b, lc.a.c)))
               .a(kw.b(kw.a().a(dfz.O, true), $$0), a($$2, $$0x -> $$0x.a(lc.b, lc.a.d)))
               .a(kw.a().a(dfz.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void L() {
      List<aew> $$0 = this.z(csw.cs);
      List<aew> $$1 = this.A(csw.cs);
      this.b
         .accept(
            kx.a(csw.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(lc.b, lc.a.b)))
               .a(a($$1, $$0x -> $$0x.a(lc.b, lc.a.c)))
               .a(a($$1, $$0x -> $$0x.a(lc.b, lc.a.d)))
         );
   }

   private void C(csv $$0) {
      aew $$1 = ll.s.create($$0, this.c);
      aew $$2 = ll.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(ky.a($$0).a(a(dfz.j, $$2, $$1)));
   }

   private void M() {
      lj $$0 = lj.a(lj.a(csw.ad, "_side"), lj.a(csw.ad, "_top"));
      aew $$1 = li.i.a(csw.ad, $$0, this.c);
      this.b.accept(d(csw.ad, $$1));
   }

   private void N() {
      this.a(cji.Q);
      csv $$0 = csw.E;
      kz.b<Boolean, Integer> $$1 = kz.a(cxn.c, cxn.a);
      aew $$2 = lg.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aew $$4 = lg.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, lb.a().a(lc.c, $$4));
         $$1.a(false, $$3, lb.a().a(lc.c, $$2));
      }

      this.b.accept(ky.a(csw.E).a($$1));
   }

   private void O() {
      this.b
         .accept(
            ky.a(csw.kI)
               .a(
                  kz.a(dfz.as)
                     .a(0, lb.a().a(lc.c, this.a(csw.kI, "_0", li.c, lj::b)))
                     .a(1, lb.a().a(lc.c, this.a(csw.kI, "_1", li.c, lj::b)))
                     .a(2, lb.a().a(lc.c, this.a(csw.kI, "_2", li.c, lj::b)))
                     .a(3, lb.a().a(lc.c, this.a(csw.kI, "_3", li.c, lj::b)))
               )
         );
   }

   private void P() {
      aew $$0 = lj.G(csw.j);
      lj $$1 = new lj().a(lk.e, $$0).b(lk.e, lk.c).a(lk.f, lj.a(csw.i, "_top")).a(lk.i, lj.a(csw.i, "_snow"));
      lb $$2 = lb.a().a(lc.c, li.m.a(csw.i, "_snow", $$1, this.c));
      this.a(csw.i, lg.a(csw.i), $$2);
      aew $$3 = ll.e.get(csw.fl).a($$1x -> $$1x.a(lk.e, $$0)).a(csw.fl, this.c);
      this.a(csw.fl, $$3, $$2);
      aew $$4 = ll.e.get(csw.l).a($$1x -> $$1x.a(lk.e, $$0)).a(csw.l, this.c);
      this.a(csw.l, $$4, $$2);
   }

   private void a(csv $$0, aew $$1, lb $$2) {
      List<lb> $$3 = Arrays.asList(a($$1));
      this.b.accept(ky.a($$0).a(kz.a(dfz.z).a(true, $$2).a(false, $$3)));
   }

   private void Q() {
      this.a(cji.qt);
      this.b
         .accept(
            ky.a(csw.fC)
               .a(
                  kz.a(dfz.ar)
                     .a(0, lb.a().a(lc.c, lg.a(csw.fC, "_stage0")))
                     .a(1, lb.a().a(lc.c, lg.a(csw.fC, "_stage1")))
                     .a(2, lb.a().a(lc.c, lg.a(csw.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void R() {
      this.b.accept(b(csw.kE, lg.a(csw.kE)));
   }

   private void g(csv $$0, csv $$1) {
      lj $$2 = lj.b($$1);
      aew $$3 = li.W.a($$0, $$2, this.c);
      aew $$4 = li.X.a($$0, $$2, this.c);
      this.b.accept(ky.a($$0).a(a(dfz.aT, 1, $$4, $$3)));
   }

   private void S() {
      aew $$0 = lg.a(csw.hc);
      aew $$1 = lg.a(csw.hc, "_side");
      this.a(cji.lv);
      this.b
         .accept(
            ky.a(csw.hc)
               .a(
                  kz.a(dfz.Q)
                     .a(ha.a, lb.a().a(lc.c, $$0))
                     .a(ha.c, lb.a().a(lc.c, $$1))
                     .a(ha.f, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
                     .a(ha.d, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
                     .a(ha.e, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
               )
         );
   }

   private void h(csv $$0, csv $$1) {
      aew $$2 = lg.a($$0);
      this.b.accept(ky.a($$1, lb.a().a(lc.c, $$2)));
      this.a($$1, $$2);
   }

   private void T() {
      aew $$0 = lg.a(csw.eX, "_post_ends");
      aew $$1 = lg.a(csw.eX, "_post");
      aew $$2 = lg.a(csw.eX, "_cap");
      aew $$3 = lg.a(csw.eX, "_cap_alt");
      aew $$4 = lg.a(csw.eX, "_side");
      aew $$5 = lg.a(csw.eX, "_side_alt");
      this.b
         .accept(
            kx.a(csw.eX)
               .a(lb.a().a(lc.c, $$0))
               .a(kw.a().a(dfz.L, false).a(dfz.M, false).a(dfz.N, false).a(dfz.O, false), lb.a().a(lc.c, $$1))
               .a(kw.a().a(dfz.L, true).a(dfz.M, false).a(dfz.N, false).a(dfz.O, false), lb.a().a(lc.c, $$2))
               .a(kw.a().a(dfz.L, false).a(dfz.M, true).a(dfz.N, false).a(dfz.O, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.L, false).a(dfz.M, false).a(dfz.N, true).a(dfz.O, false), lb.a().a(lc.c, $$3))
               .a(kw.a().a(dfz.L, false).a(dfz.M, false).a(dfz.N, false).a(dfz.O, true), lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.L, true), lb.a().a(lc.c, $$4))
               .a(kw.a().a(dfz.M, true), lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
               .a(kw.a().a(dfz.N, true), lb.a().a(lc.c, $$5))
               .a(kw.a().a(dfz.O, true), lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
         );
      this.d(csw.eX);
   }

   private void D(csv $$0) {
      this.b.accept(ky.a($$0, lb.a().a(lc.c, lg.a($$0))).a(b()));
   }

   private void U() {
      aew $$0 = lg.a(csw.dw);
      aew $$1 = lg.a(csw.dw, "_on");
      this.d(csw.dw);
      this.b
         .accept(
            ky.a(csw.dw)
               .a(a(dfz.w, $$0, $$1))
               .a(
                  kz.a(dfz.U, dfz.R)
                     .a(dfu.c, ha.c, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.c))
                     .a(dfu.c, ha.f, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.d))
                     .a(dfu.c, ha.d, lb.a().a(lc.a, lc.a.c))
                     .a(dfu.c, ha.e, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.b))
                     .a(dfu.a, ha.c, lb.a())
                     .a(dfu.a, ha.f, lb.a().a(lc.b, lc.a.b))
                     .a(dfu.a, ha.d, lb.a().a(lc.b, lc.a.c))
                     .a(dfu.a, ha.e, lb.a().a(lc.b, lc.a.d))
                     .a(dfu.b, ha.c, lb.a().a(lc.a, lc.a.b))
                     .a(dfu.b, ha.f, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b))
                     .a(dfu.b, ha.d, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.c))
                     .a(dfu.b, ha.e, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.d))
               )
         );
   }

   private void V() {
      this.d(csw.fm);
      this.b.accept(b(csw.fm, lg.a(csw.fm)));
   }

   private void W() {
      this.d(csw.sm);
      this.b.accept(c(csw.sm, lg.a(csw.sm)));
   }

   private void X() {
      this.b.accept(ky.a(csw.ee).a(kz.a(dfz.H).a(ha.a.a, lb.a().a(lc.c, lg.a(csw.ee, "_ns"))).a(ha.a.c, lb.a().a(lc.c, lg.a(csw.ee, "_ew")))));
   }

   private void Y() {
      aew $$0 = ll.a.create(csw.dW, this.c);
      this.b
         .accept(
            ky.a(
               csw.dW,
               lb.a().a(lc.c, $$0),
               lb.a().a(lc.c, $$0).a(lc.a, lc.a.b),
               lb.a().a(lc.c, $$0).a(lc.a, lc.a.c),
               lb.a().a(lc.c, $$0).a(lc.a, lc.a.d),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.b),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.b).a(lc.a, lc.a.b),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.b).a(lc.a, lc.a.c),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.b).a(lc.a, lc.a.d),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.c),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.c).a(lc.a, lc.a.b),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.c).a(lc.a, lc.a.c),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.c).a(lc.a, lc.a.d),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.d),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.d).a(lc.a, lc.a.b),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.d).a(lc.a, lc.a.c),
               lb.a().a(lc.c, $$0).a(lc.b, lc.a.d).a(lc.a, lc.a.d)
            )
         );
   }

   private void Z() {
      aew $$0 = lg.a(csw.kO);
      aew $$1 = lg.a(csw.kO, "_on");
      this.b.accept(ky.a(csw.kO).a(a(dfz.w, $$1, $$0)).a(e()));
   }

   private void aa() {
      lj $$0 = new lj().a(lk.e, lj.a(csw.by, "_bottom")).a(lk.i, lj.a(csw.by, "_side"));
      aew $$1 = lj.a(csw.by, "_top_sticky");
      aew $$2 = lj.a(csw.by, "_top");
      lj $$3 = $$0.c(lk.E, $$1);
      lj $$4 = $$0.c(lk.E, $$2);
      aew $$5 = lg.a(csw.by, "_base");
      this.a(csw.by, $$5, $$4);
      this.a(csw.br, $$5, $$3);
      aew $$6 = li.m.a(csw.by, "_inventory", $$0.c(lk.f, $$2), this.c);
      aew $$7 = li.m.a(csw.br, "_inventory", $$0.c(lk.f, $$1), this.c);
      this.a(csw.by, $$6);
      this.a(csw.br, $$7);
   }

   private void a(csv $$0, aew $$1, lj $$2) {
      aew $$3 = li.bf.a($$0, $$2, this.c);
      this.b.accept(ky.a($$0).a(a(dfz.g, $$1, $$3)).a(e()));
   }

   private void ab() {
      lj $$0 = new lj().a(lk.F, lj.a(csw.by, "_top")).a(lk.i, lj.a(csw.by, "_side"));
      lj $$1 = $$0.c(lk.E, lj.a(csw.by, "_top_sticky"));
      lj $$2 = $$0.c(lk.E, lj.a(csw.by, "_top"));
      this.b
         .accept(
            ky.a(csw.bz)
               .a(
                  kz.a(dfz.x, dfz.bg)
                     .a(false, dgl.a, lb.a().a(lc.c, li.bg.a(csw.by, "_head", $$2, this.c)))
                     .a(false, dgl.b, lb.a().a(lc.c, li.bg.a(csw.by, "_head_sticky", $$1, this.c)))
                     .a(true, dgl.a, lb.a().a(lc.c, li.bh.a(csw.by, "_head_short", $$2, this.c)))
                     .a(true, dgl.b, lb.a().a(lc.c, li.bh.a(csw.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ac() {
      aew $$0 = lg.a(csw.qD, "_inactive");
      aew $$1 = lg.a(csw.qD, "_active");
      this.a(csw.qD, $$0);
      this.b.accept(ky.a(csw.qD).a(kz.a(dfz.bo).a($$2 -> lb.a().a(lc.c, $$2 != dgq.b && $$2 != dgq.c ? $$0 : $$1))));
   }

   private void ad() {
      aew $$0 = lg.a(csw.qE, "_inactive");
      aew $$1 = lg.a(csw.qE, "_active");
      this.a(csw.qE, $$0);
      this.b.accept(ky.a(csw.qE).a(kz.a(dfz.bo).a($$2 -> lb.a().a(lc.c, $$2 != dgq.b && $$2 != dgq.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      aew $$0 = li.bK.a(csw.qI, lj.a(false), this.c);
      aew $$1 = li.bK.a(csw.qI, "_can_summon", lj.a(true), this.c);
      this.a(csw.qI, $$0);
      this.b.accept(ky.a(csw.qI).a(a(dfz.G, $$1, $$0)));
   }

   private void af() {
      aew $$0 = lg.a(csw.nS, "_stable");
      aew $$1 = lg.a(csw.nS, "_unstable");
      this.a(csw.nS, $$0);
      this.b.accept(ky.a(csw.nS).a(a(dfz.b, $$1, $$0)));
   }

   private void ag() {
      aew $$0 = this.a(csw.ru, "", li.am, lj::c);
      aew $$1 = this.a(csw.ru, "_lit", li.am, lj::c);
      this.b.accept(ky.a(csw.ru).a(a(dfz.D, $$1, $$0)));
      aew $$2 = this.a(csw.rv, "", li.am, lj::c);
      aew $$3 = this.a(csw.rv, "_lit", li.am, lj::c);
      this.b.accept(ky.a(csw.rv).a(a(dfz.D, $$3, $$2)));
   }

   private void ah() {
      aew $$0 = ll.a.create(csw.fB, this.c);
      aew $$1 = this.a(csw.fB, "_on", li.c, lj::b);
      this.b.accept(ky.a(csw.fB).a(a(dfz.r, $$1, $$0)));
   }

   private void i(csv $$0, csv $$1) {
      lj $$2 = lj.y($$0);
      this.b.accept(c($$0, li.bd.a($$0, $$2, this.c)));
      this.b.accept(ky.a($$1, lb.a().a(lc.c, li.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      lj $$0 = lj.y(csw.dK);
      lj $$1 = lj.i(lj.a(csw.dK, "_off"));
      aew $$2 = li.bd.a(csw.dK, $$0, this.c);
      aew $$3 = li.bd.a(csw.dK, "_off", $$1, this.c);
      this.b.accept(ky.a(csw.dK).a(a(dfz.r, $$2, $$3)));
      aew $$4 = li.be.a(csw.dL, $$0, this.c);
      aew $$5 = li.be.a(csw.dL, "_off", $$1, this.c);
      this.b.accept(ky.a(csw.dL).a(a(dfz.r, $$4, $$5)).a(d()));
      this.d(csw.dK);
      this.c(csw.dL);
   }

   private void aj() {
      this.a(cji.lo);
      this.b.accept(ky.a(csw.ei).a(kz.a(dfz.aA, dfz.s, dfz.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return lb.a().a(lc.c, lj.a(csw.ei, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(cji.cx);
      this.b
         .accept(
            ky.a(csw.mV)
               .a(
                  kz.a(dfz.aS, dfz.C)
                     .a(1, false, Arrays.asList(a(lg.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(lg.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(lg.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(lg.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(lg.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(lg.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(lg.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(lg.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      lj $$0 = lj.a(csw.dN);
      aew $$1 = li.c.a(csw.dP, $$0, this.c);
      this.b.accept(ky.a(csw.dN).a(kz.a(dfz.aF).a($$1x -> lb.a().a(lc.c, $$1x < 8 ? lg.a(csw.dN, "_height" + $$1x * 2) : $$1))));
      this.a(csw.dN, lg.a(csw.dN, "_height2"));
      this.b.accept(c(csw.dP, $$1));
   }

   private void am() {
      this.b.accept(ky.a(csw.oc, lb.a().a(lc.c, lg.a(csw.oc))).a(b()));
   }

   private void an() {
      aew $$0 = ll.a.create(csw.pa, this.c);
      this.a(csw.pa, $$0);
      this.b.accept(ky.a(csw.pa).a(kz.a(dfz.bj).a($$0x -> lb.a().a(lc.c, this.a(csw.pa, "_" + $$0x.c(), li.c, lj::b)))));
   }

   private void ao() {
      this.a(cji.vv);
      this.b.accept(ky.a(csw.oi).a(kz.a(dfz.as).a($$0 -> lb.a().a(lc.c, this.a(csw.oi, "_stage" + $$0, li.am, lj::c)))));
   }

   private void ap() {
      this.a(cji.oE);
      this.b
         .accept(
            ky.a(csw.fI)
               .a(
                  kz.a(dfz.a, dfz.M, dfz.L, dfz.N, dfz.O)
                     .a(false, false, false, false, false, lb.a().a(lc.c, lg.a(csw.fI, "_ns")))
                     .a(false, true, false, false, false, lb.a().a(lc.c, lg.a(csw.fI, "_n")).a(lc.b, lc.a.b))
                     .a(false, false, true, false, false, lb.a().a(lc.c, lg.a(csw.fI, "_n")))
                     .a(false, false, false, true, false, lb.a().a(lc.c, lg.a(csw.fI, "_n")).a(lc.b, lc.a.c))
                     .a(false, false, false, false, true, lb.a().a(lc.c, lg.a(csw.fI, "_n")).a(lc.b, lc.a.d))
                     .a(false, true, true, false, false, lb.a().a(lc.c, lg.a(csw.fI, "_ne")))
                     .a(false, true, false, true, false, lb.a().a(lc.c, lg.a(csw.fI, "_ne")).a(lc.b, lc.a.b))
                     .a(false, false, false, true, true, lb.a().a(lc.c, lg.a(csw.fI, "_ne")).a(lc.b, lc.a.c))
                     .a(false, false, true, false, true, lb.a().a(lc.c, lg.a(csw.fI, "_ne")).a(lc.b, lc.a.d))
                     .a(false, false, true, true, false, lb.a().a(lc.c, lg.a(csw.fI, "_ns")))
                     .a(false, true, false, false, true, lb.a().a(lc.c, lg.a(csw.fI, "_ns")).a(lc.b, lc.a.b))
                     .a(false, true, true, true, false, lb.a().a(lc.c, lg.a(csw.fI, "_nse")))
                     .a(false, true, false, true, true, lb.a().a(lc.c, lg.a(csw.fI, "_nse")).a(lc.b, lc.a.b))
                     .a(false, false, true, true, true, lb.a().a(lc.c, lg.a(csw.fI, "_nse")).a(lc.b, lc.a.c))
                     .a(false, true, true, false, true, lb.a().a(lc.c, lg.a(csw.fI, "_nse")).a(lc.b, lc.a.d))
                     .a(false, true, true, true, true, lb.a().a(lc.c, lg.a(csw.fI, "_nsew")))
                     .a(true, false, false, false, false, lb.a().a(lc.c, lg.a(csw.fI, "_attached_ns")))
                     .a(true, false, true, false, false, lb.a().a(lc.c, lg.a(csw.fI, "_attached_n")))
                     .a(true, false, false, true, false, lb.a().a(lc.c, lg.a(csw.fI, "_attached_n")).a(lc.b, lc.a.c))
                     .a(true, true, false, false, false, lb.a().a(lc.c, lg.a(csw.fI, "_attached_n")).a(lc.b, lc.a.b))
                     .a(true, false, false, false, true, lb.a().a(lc.c, lg.a(csw.fI, "_attached_n")).a(lc.b, lc.a.d))
                     .a(true, true, true, false, false, lb.a().a(lc.c, lg.a(csw.fI, "_attached_ne")))
                     .a(true, true, false, true, false, lb.a().a(lc.c, lg.a(csw.fI, "_attached_ne")).a(lc.b, lc.a.b))
                     .a(true, false, false, true, true, lb.a().a(lc.c, lg.a(csw.fI, "_attached_ne")).a(lc.b, lc.a.c))
                     .a(true, false, true, false, true, lb.a().a(lc.c, lg.a(csw.fI, "_attached_ne")).a(lc.b, lc.a.d))
                     .a(true, false, true, true, false, lb.a().a(lc.c, lg.a(csw.fI, "_attached_ns")))
                     .a(true, true, false, false, true, lb.a().a(lc.c, lg.a(csw.fI, "_attached_ns")).a(lc.b, lc.a.b))
                     .a(true, true, true, true, false, lb.a().a(lc.c, lg.a(csw.fI, "_attached_nse")))
                     .a(true, true, false, true, true, lb.a().a(lc.c, lg.a(csw.fI, "_attached_nse")).a(lc.b, lc.a.b))
                     .a(true, false, true, true, true, lb.a().a(lc.c, lg.a(csw.fI, "_attached_nse")).a(lc.b, lc.a.c))
                     .a(true, true, true, false, true, lb.a().a(lc.c, lg.a(csw.fI, "_attached_nse")).a(lc.b, lc.a.d))
                     .a(true, true, true, true, true, lb.a().a(lc.c, lg.a(csw.fI, "_attached_nsew")))
               )
         );
   }

   private void aq() {
      this.d(csw.fH);
      this.b.accept(ky.a(csw.fH).a(kz.a(dfz.a, dfz.w).a(($$0, $$1) -> lb.a().a(lc.c, lj.a(csw.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aew a(int $$0, String $$1, lj $$2) {
      switch ($$0) {
         case 1:
            return li.bj.a(lg.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return li.bk.a(lg.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return li.bl.a(lg.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return li.bm.a(lg.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private aew a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", lj.b(lj.G(csw.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", lj.b(lj.a(csw.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", lj.b(lj.a(csw.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ar() {
      this.a(cji.jT);
      this.b.accept(ky.a(csw.mf).a(kz.a(dfz.aD, dfz.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void as() {
      this.a(cji.jU);
      Function<Integer, aew> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         lj $$2 = lj.a($$1);
         return li.bu.a(csw.mg, $$1, $$2, this.c);
      };
      this.b.accept(ky.a(csw.mg).a(kz.a(dad.b).a($$1 -> lb.a().a(lc.c, $$0.apply($$1)))));
   }

   private void E(csv $$0) {
      this.d($$0);
      aew $$1 = lg.a($$0);
      kx $$2 = kx.a($$0);
      kw.c $$3 = ac.a(kw.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dga, Function<aew, lb>> $$4 : a) {
         dga $$5 = (dga)$$4.getFirst();
         Function<aew, lb> $$6 = (Function<aew, lb>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(kw.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void at() {
      aew $$0 = lj.a(csw.qH, "_bottom");
      lj $$1 = new lj().a(lk.e, $$0).a(lk.f, lj.a(csw.qH, "_top")).a(lk.i, lj.a(csw.qH, "_side"));
      lj $$2 = new lj().a(lk.e, $$0).a(lk.f, lj.a(csw.qH, "_top_bloom")).a(lk.i, lj.a(csw.qH, "_side_bloom"));
      aew $$3 = li.m.a(csw.qH, "", $$1, this.c);
      aew $$4 = li.m.a(csw.qH, "_bloom", $$2, this.c);
      this.b.accept(ky.a(csw.qH).a(kz.a(dfz.E).a($$2x -> lb.a().a(lc.c, $$2x ? $$4 : $$3))));
      this.a(cji.fN, $$3);
   }

   private void au() {
      csv $$0 = csw.cm;
      aew $$1 = lg.a($$0);
      kx $$2 = kx.a($$0);
      Map.of(ha.c, lc.a.a, ha.f, lc.a.b, ha.d, lc.a.c, ha.e, lc.a.d).forEach(($$2x, $$3) -> {
         kw.c $$4 = kw.a().a(dfz.R, $$2x);
         $$2.a($$4, lb.a().a(lc.c, $$1).a(lc.b, $$3).a(lc.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, lg.a($$0, "_inventory"));
      i.clear();
   }

   private void a(kx $$0, kw.c $$1, lc.a $$2) {
      Map.of(dfz.bp, li.aK, dfz.bq, li.aL, dfz.br, li.aM, dfz.bs, li.aN, dfz.bt, li.aO, dfz.bu, li.aP).forEach(($$3, $$4) -> {
         this.a($$0, $$1, $$2, $$3, $$4, true);
         this.a($$0, $$1, $$2, $$3, $$4, false);
      });
   }

   private void a(kx $$0, kw.c $$1, lc.a $$2, dga $$3, lh $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      lj $$7 = new lj().a(lk.b, lj.a(csw.cm, $$6));
      ks.d $$8 = new ks.d($$4, $$6);
      aew $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(csw.cm, $$6, $$7, this.c));
      $$0.a(kw.a($$1, kw.a().a($$3, $$5)), lb.a().a(lc.c, $$9).a(lc.b, $$2));
   }

   private void av() {
      this.b.accept(c(csw.kJ, li.c.a(csw.kJ, lj.b(lg.a("magma")), this.c)));
   }

   private void F(csv $$0) {
      this.b($$0, ll.p);
      li.bB.a(lg.a($$0.k()), lj.u($$0), this.c);
   }

   private void b(csv $$0, csv $$1, ks.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(csv $$0, csv $$1) {
      li.bC.a(lg.a($$0.k()), lj.u($$1), this.c);
   }

   private void aw() {
      aew $$0 = lg.a(csw.b);
      aew $$1 = lg.a(csw.b, "_mirrored");
      this.b.accept(a(csw.eO, $$0, $$1));
      this.a(csw.eO, $$0);
   }

   private void ax() {
      aew $$0 = lg.a(csw.rI);
      aew $$1 = lg.a(csw.rI, "_mirrored");
      this.b.accept(a(csw.sc, $$0, $$1).a(f()));
      this.a(csw.sc, $$0);
   }

   private void k(csv $$0, csv $$1) {
      this.a($$0, ks.e.b);
      lj $$2 = lj.d(lj.a($$0, "_pot"));
      aew $$3 = ks.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void ay() {
      aew $$0 = lj.a(csw.pl, "_bottom");
      aew $$1 = lj.a(csw.pl, "_top_off");
      aew $$2 = lj.a(csw.pl, "_top");
      aew[] $$3 = new aew[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         lj $$5 = new lj().a(lk.e, $$0).a(lk.f, $$4 == 0 ? $$1 : $$2).a(lk.i, lj.a(csw.pl, "_side" + $$4));
         $$3[$$4] = li.m.a(csw.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(ky.a(csw.pl).a(kz.a(dfz.aZ).a($$1x -> lb.a().a(lc.c, $$3[$$1x]))));
      this.a(cji.vT, $$3[0]);
   }

   private lb a(hc $$0, lb $$1) {
      switch ($$0) {
         case b:
            return $$1.a(lc.a, lc.a.b);
         case c:
            return $$1.a(lc.a, lc.a.b).a(lc.b, lc.a.c);
         case d:
            return $$1.a(lc.a, lc.a.b).a(lc.b, lc.a.d);
         case a:
            return $$1.a(lc.a, lc.a.b).a(lc.b, lc.a.b);
         case f:
            return $$1.a(lc.a, lc.a.d).a(lc.b, lc.a.c);
         case g:
            return $$1.a(lc.a, lc.a.d);
         case h:
            return $$1.a(lc.a, lc.a.d).a(lc.b, lc.a.b);
         case e:
            return $$1.a(lc.a, lc.a.d).a(lc.b, lc.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(lc.b, lc.a.c);
         case i:
            return $$1.a(lc.b, lc.a.d);
         case j:
            return $$1.a(lc.b, lc.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void az() {
      aew $$0 = lj.a(csw.pb, "_top");
      aew $$1 = lj.a(csw.pb, "_bottom");
      aew $$2 = lj.a(csw.pb, "_side");
      aew $$3 = lj.a(csw.pb, "_lock");
      lj $$4 = new lj().a(lk.o, $$2).a(lk.m, $$2).a(lk.l, $$2).a(lk.c, $$0).a(lk.j, $$0).a(lk.k, $$1).a(lk.n, $$3);
      aew $$5 = li.b.a(csw.pb, $$4, this.c);
      this.b.accept(ky.a(csw.pb, lb.a().a(lc.c, $$5)).a(kz.a(dfz.T).a($$0x -> this.a($$0x, lb.a()))));
   }

   private void aA() {
      csv $$0 = csw.n;
      aew $$1 = lg.a($$0);
      ll $$2 = ll.a.get($$0);
      csv $$3 = csw.jH;
      aew $$4 = li.Z.a($$3, $$2.b(), this.c);
      aew $$5 = li.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      je.a().filter(jf::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(csw.qS).a(je.w).a(csw.ri).a(je.y);
      this.h(csw.qR).a(je.A).a(csw.rh).a(je.C);
      this.h(csw.qQ).a(je.E).a(csw.rg).a(je.G);
      this.h(csw.qP).a(je.I).a(csw.rf).a(je.K);
      this.m(csw.a);
      this.a(csw.nc, csw.a);
      this.a(csw.nb, csw.a);
      this.m(csw.fO);
      this.m(csw.dQ);
      this.a(csw.nd, csw.G);
      this.m(csw.fA);
      this.m(csw.me);
      this.m(csw.fr);
      this.m(csw.fR);
      this.a(cji.tk);
      this.m(csw.pg);
      this.m(csw.G);
      this.m(csw.H);
      this.m(csw.hV);
      this.a(cji.fw);
      this.l(csw.pM, csw.qd);
      this.l(csw.pN, csw.qe);
      this.l(csw.pO, csw.qf);
      this.l(csw.pP, csw.qg);
      this.l(csw.pQ, csw.qh);
      this.l(csw.pR, csw.qi);
      this.l(csw.pS, csw.qj);
      this.l(csw.pT, csw.qk);
      this.l(csw.pU, csw.ql);
      this.l(csw.pV, csw.qm);
      this.l(csw.pW, csw.qn);
      this.l(csw.pX, csw.qo);
      this.l(csw.pY, csw.qp);
      this.l(csw.pZ, csw.qq);
      this.l(csw.qa, csw.qr);
      this.l(csw.qb, csw.qs);
      this.l(csw.pL, csw.qc);
      this.m(csw.na);
      this.m(csw.gs);
      this.m(csw.qC);
      this.m(csw.rw);
      this.s(csw.rx);
      this.s(csw.ry);
      this.t(csw.sh);
      this.t(csw.si);
      this.ag();
      this.e(csw.rB, csw.rz);
      this.p(csw.rA);
      this.a(csw.hW, cji.hf);
      this.a(cji.hf);
      this.aB();
      this.a(csw.kN, cji.iF);
      this.a(cji.iF);
      this.f(csw.bQ, lj.a(csw.by, "_side"));
      this.a(csw.R);
      this.a(csw.S);
      this.a(csw.iB);
      this.a(csw.cx);
      this.a(csw.cy);
      this.a(csw.cz);
      this.a(csw.fE);
      this.a(csw.fF);
      this.a(csw.fJ);
      this.a(csw.N);
      this.a(csw.T);
      this.a(csw.O);
      this.a(csw.ch);
      this.a(csw.P);
      this.a(csw.Q);
      this.a(csw.ci);
      this.b(csw.pj, ll.c);
      this.a(csw.pi);
      this.a(csw.aR);
      this.a(csw.aS);
      this.a(csw.aT);
      this.a(csw.hb);
      this.a(csw.dI);
      this.a(csw.dJ);
      this.a(csw.ha);
      this.a(csw.pC);
      this.a(csw.mW);
      this.a(csw.dR);
      this.a(csw.k);
      this.a(csw.pk);
      this.a(csw.fz);
      this.a(csw.ed);
      this.a(csw.L);
      this.a(csw.ph);
      this.a(csw.dO);
      this.b(csw.dT, ll.f);
      this.b(csw.pq, ll.c);
      this.b(csw.fa, ll.c);
      this.m(csw.ac);
      this.m(csw.ga);
      this.a(csw.kK);
      this.a(csw.aY);
      this.a(csw.iC);
      this.a(csw.co);
      this.a(csw.pK);
      this.a(csw.ii);
      this.a(csw.oy);
      this.a(csw.dX);
      this.a(csw.dY);
      this.a(csw.ct);
      this.a(csw.aO);
      this.b(csw.bw, ll.u);
      this.a(cji.cw);
      this.b(csw.ck, ll.e);
      this.b(csw.pd, ll.c);
      this.a(csw.op);
      this.a(csw.aP);
      this.a(csw.qt);
      this.a(csw.qu);
      this.a(csw.qA);
      this.a(csw.qz);
      this.a(csw.rt);
      this.a(csw.se);
      this.a(csw.sf);
      this.a(csw.sg);
      this.e(csw.qF);
      this.aA();
      this.a(csw.qN);
      this.a(csw.qO);
      this.a(csw.qM);
      this.a(csw.qL);
      this.a(csw.qK);
      this.a(csw.qJ);
      this.h(csw.qM, csw.rb);
      this.h(csw.qL, csw.rd);
      this.h(csw.qK, csw.rc);
      this.h(csw.qJ, csw.re);
      this.g(csw.gW, csw.ch);
      this.g(csw.gX, csw.ci);
      this.F();
      this.r();
      this.au();
      this.v();
      this.w();
      this.a(csw.og, csw.oh);
      this.x();
      this.A();
      this.B();
      this.D();
      this.E();
      this.H();
      this.C();
      this.y(csw.kt);
      this.I();
      this.J();
      this.K();
      this.L();
      this.O();
      this.P();
      this.Q();
      this.R();
      this.q();
      this.S();
      this.T();
      this.U();
      this.V();
      this.X();
      this.Y();
      this.Z();
      this.aa();
      this.ab();
      this.af();
      this.ai();
      this.ah();
      this.aj();
      this.ak();
      this.y();
      this.al();
      this.am();
      this.an();
      this.ao();
      this.ap();
      this.aq();
      this.ar();
      this.as();
      this.E(csw.ff);
      this.E(csw.fg);
      this.E(csw.qG);
      this.av();
      this.az();
      this.ac();
      this.ad();
      this.ae();
      this.W();
      this.N();
      this.M();
      this.D(csw.cO);
      this.d(csw.cO);
      this.D(csw.oa);
      this.g();
      this.D(csw.rD);
      this.i(csw.cp, csw.cq);
      this.i(csw.eb, csw.ec);
      this.a(csw.cA, csw.n, lj::c);
      this.a(csw.nY, csw.p, lj::d);
      this.x(csw.ow);
      this.x(csw.on);
      this.v(csw.aU);
      this.v(csw.hi);
      this.C(csw.oe);
      this.C(csw.of);
      this.e(csw.eY, lg.a(csw.eY));
      this.a(csw.dZ, ll.c);
      this.a(csw.ea, ll.c);
      this.a(csw.sd);
      this.a(csw.kM, ll.c);
      this.f(csw.j);
      this.f(csw.rG);
      this.f(csw.I);
      this.g(csw.J);
      this.g(csw.M);
      this.f(csw.K);
      this.e(csw.F);
      this.b(csw.sn, ll.e);
      this.a(csw.ij, ll.c, ll.d);
      this.a(csw.kx, ll.v, ll.w);
      this.a(csw.hf, ll.v, ll.w);
      this.a(csw.sj, ll.c, ll.d);
      this.a(csw.sk, ll.c, ll.d);
      this.a(csw.sl, ll.c, ll.d);
      this.c(csw.nT, ll.h);
      this.z();
      this.a(csw.pe, lj::A);
      this.a(csw.pf, lj::C);
      this.a(csw.kD, dfz.as, 0, 1, 2, 3);
      this.a(csw.gt, dfz.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csw.fq, dfz.as, 0, 1, 1, 2);
      this.a(csw.gu, dfz.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csw.cB, dfz.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(csw.kA, ks.e.b, dfz.aq, 0, 1);
      this.i();
      this.h();
      this.a(lg.a("decorated_pot"), csw.iA).b(csw.so);
      this.a(lg.a("banner"), csw.n)
         .a(li.bD, csw.iJ, csw.iK, csw.iL, csw.iM, csw.iN, csw.iO, csw.iP, csw.iQ, csw.iR, csw.iS, csw.iT, csw.iU, csw.iV, csw.iW, csw.iX, csw.iY)
         .b(csw.iZ, csw.ja, csw.jb, csw.jc, csw.jd, csw.je, csw.jf, csw.jg, csw.jh, csw.ji, csw.jj, csw.jk, csw.jl, csw.jm, csw.jn, csw.jo);
      this.a(lg.a("bed"), csw.n)
         .b(csw.aZ, csw.ba, csw.bb, csw.bc, csw.bd, csw.be, csw.bf, csw.bg, csw.bh, csw.bi, csw.bj, csw.bk, csw.bl, csw.bm, csw.bn, csw.bo);
      this.j(csw.aZ, csw.bA);
      this.j(csw.ba, csw.bB);
      this.j(csw.bb, csw.bC);
      this.j(csw.bc, csw.bD);
      this.j(csw.bd, csw.bE);
      this.j(csw.be, csw.bF);
      this.j(csw.bf, csw.bG);
      this.j(csw.bg, csw.bH);
      this.j(csw.bh, csw.bI);
      this.j(csw.bi, csw.bJ);
      this.j(csw.bj, csw.bK);
      this.j(csw.bk, csw.bL);
      this.j(csw.bl, csw.bM);
      this.j(csw.bm, csw.bN);
      this.j(csw.bn, csw.bO);
      this.j(csw.bo, csw.bP);
      this.a(lg.a("skull"), csw.dX)
         .a(li.bE, csw.gM, csw.gK, csw.gI, csw.gE, csw.gG, csw.gQ)
         .a(csw.gO)
         .b(csw.gN, csw.gP, csw.gL, csw.gJ, csw.gF, csw.gH, csw.gR);
      this.F(csw.kP);
      this.F(csw.kQ);
      this.F(csw.kR);
      this.F(csw.kS);
      this.F(csw.kT);
      this.F(csw.kU);
      this.F(csw.kV);
      this.F(csw.kW);
      this.F(csw.kX);
      this.F(csw.kY);
      this.F(csw.kZ);
      this.F(csw.la);
      this.F(csw.lb);
      this.F(csw.lc);
      this.F(csw.ld);
      this.F(csw.le);
      this.F(csw.lf);
      this.b(csw.mX, ll.p);
      this.c(csw.mX);
      this.a(lg.a("chest"), csw.n).b(csw.cv, csw.gV);
      this.a(lg.a("ender_chest"), csw.co).b(csw.fG);
      this.d(csw.fx, csw.co).a(csw.fx, csw.kF);
      this.a(csw.aM);
      this.a(csw.aN);
      this.a(csw.lw);
      this.a(csw.lx);
      this.a(csw.ly);
      this.a(csw.lz);
      this.a(csw.lA);
      this.a(csw.lB);
      this.a(csw.lC);
      this.a(csw.lD);
      this.a(csw.lE);
      this.a(csw.lF);
      this.a(csw.lG);
      this.a(csw.lH);
      this.a(csw.lI);
      this.a(csw.lJ);
      this.a(csw.lK);
      this.a(csw.lL);
      this.a(ll.a, csw.lM, csw.lN, csw.lO, csw.lP, csw.lQ, csw.lR, csw.lS, csw.lT, csw.lU, csw.lV, csw.lW, csw.lX, csw.lY, csw.lZ, csw.ma, csw.mb);
      this.a(csw.iA);
      this.a(csw.hj);
      this.a(csw.hk);
      this.a(csw.hl);
      this.a(csw.hm);
      this.a(csw.hn);
      this.a(csw.ho);
      this.a(csw.hp);
      this.a(csw.hq);
      this.a(csw.hr);
      this.a(csw.hs);
      this.a(csw.ht);
      this.a(csw.hu);
      this.a(csw.hv);
      this.a(csw.hw);
      this.a(csw.hx);
      this.a(csw.hy);
      this.a(csw.qB);
      this.f(csw.aQ, csw.eZ);
      this.f(csw.ej, csw.hz);
      this.f(csw.ek, csw.hA);
      this.f(csw.el, csw.hB);
      this.f(csw.em, csw.hC);
      this.f(csw.en, csw.hD);
      this.f(csw.eo, csw.hE);
      this.f(csw.ep, csw.hF);
      this.f(csw.eq, csw.hG);
      this.f(csw.er, csw.hH);
      this.f(csw.es, csw.hI);
      this.f(csw.et, csw.hJ);
      this.f(csw.eu, csw.hK);
      this.f(csw.ev, csw.hL);
      this.f(csw.ew, csw.hM);
      this.f(csw.ex, csw.hN);
      this.f(csw.ey, csw.hO);
      this.b(ll.n, csw.lg, csw.lh, csw.li, csw.lj, csw.lk, csw.ll, csw.lm, csw.ln, csw.lo, csw.lp, csw.lq, csw.lr, csw.ls, csw.lt, csw.lu, csw.lv);
      this.e(csw.bA, csw.ik);
      this.e(csw.bB, csw.il);
      this.e(csw.bC, csw.im);
      this.e(csw.bD, csw.in);
      this.e(csw.bE, csw.io);
      this.e(csw.bF, csw.ip);
      this.e(csw.bG, csw.iq);
      this.e(csw.bH, csw.ir);
      this.e(csw.bI, csw.is);
      this.e(csw.bJ, csw.it);
      this.e(csw.bK, csw.iu);
      this.e(csw.bL, csw.iv);
      this.e(csw.bM, csw.iw);
      this.e(csw.bN, csw.ix);
      this.e(csw.bO, csw.iy);
      this.e(csw.bP, csw.iz);
      this.a(csw.rH);
      this.a(csw.eM);
      this.a(csw.bu, csw.gb, ks.e.a);
      this.a(csw.bR, csw.gc, ks.e.b);
      this.a(csw.bT, csw.gd, ks.e.b);
      this.a(csw.bU, csw.ge, ks.e.b);
      this.a(csw.bV, csw.gf, ks.e.b);
      this.a(csw.bW, csw.gg, ks.e.b);
      this.a(csw.bX, csw.gh, ks.e.b);
      this.a(csw.bY, csw.gi, ks.e.b);
      this.a(csw.bZ, csw.gj, ks.e.b);
      this.a(csw.ca, csw.gk, ks.e.b);
      this.a(csw.cb, csw.gl, ks.e.b);
      this.a(csw.cc, csw.gm, ks.e.b);
      this.a(csw.ce, csw.gn, ks.e.b);
      this.a(csw.cd, csw.go, ks.e.b);
      this.a(csw.cg, csw.gp, ks.e.b);
      this.a(csw.cf, csw.gq, ks.e.b);
      this.a(csw.bv, csw.gr, ks.e.b);
      this.a(csw.bS, csw.fS, ks.e.b);
      this.G();
      this.u(csw.eU);
      this.u(csw.eV);
      this.u(csw.eW);
      this.a(csw.bt, ks.e.a);
      this.b(csw.dS, ks.e.a);
      this.a(cji.dn);
      this.b(csw.mc, csw.md, ks.e.b);
      this.a(cji.do);
      this.c(csw.md);
      this.b(csw.rF, ks.e.b);
      this.c(csw.rF);
      this.c(csw.rv);
      this.b(csw.oz, csw.oA, ks.e.b);
      this.b(csw.oB, csw.oC, ks.e.b);
      this.a(csw.oz, "_plant");
      this.c(csw.oA);
      this.a(csw.oB, "_plant");
      this.c(csw.oC);
      this.a(csw.mY, ks.e.a, lj.c(lj.a(csw.mZ, "_stage0")));
      this.m();
      this.a(csw.bs, ks.e.b);
      this.c(csw.iE, ks.e.b);
      this.c(csw.iF, ks.e.b);
      this.c(csw.iG, ks.e.b);
      this.c(csw.iH, ks.e.a);
      this.c(csw.iI, ks.e.a);
      this.j();
      this.k();
      this.l();
      this.a(csw.mw, csw.mr, csw.mm, csw.mh, csw.mG, csw.mB, csw.mQ, csw.mL);
      this.a(csw.mx, csw.ms, csw.mn, csw.mi, csw.mH, csw.mC, csw.mR, csw.mM);
      this.a(csw.my, csw.mt, csw.mo, csw.mj, csw.mI, csw.mD, csw.mS, csw.mN);
      this.a(csw.mz, csw.mu, csw.mp, csw.mk, csw.mJ, csw.mE, csw.mT, csw.mO);
      this.a(csw.mA, csw.mv, csw.mq, csw.ml, csw.mK, csw.mF, csw.mU, csw.mP);
      this.c(csw.fe, csw.fc);
      this.c(csw.fd, csw.fb);
      this.l(csw.ab).c(csw.ab).a(csw.av);
      this.l(csw.am).c(csw.am).a(csw.aD);
      this.a(csw.am, csw.dj, csw.ds);
      this.b(csw.aL, ll.r);
      this.l(csw.Y).c(csw.Y).a(csw.as);
      this.l(csw.ai).c(csw.ai).a(csw.aA);
      this.a(csw.ai, csw.dd, csw.do);
      this.a(csw.B, csw.fX, ks.e.b);
      this.b(csw.aI, ll.r);
      this.l(csw.Z).d(csw.Z).a(csw.at);
      this.l(csw.aj).d(csw.aj).a(csw.aB);
      this.a(csw.aj, csw.de, csw.dp);
      this.a(csw.C, csw.fY, ks.e.b);
      this.b(csw.aJ, ll.r);
      this.l(csw.W).c(csw.W).a(csw.aq);
      this.l(csw.ag).c(csw.ag).a(csw.ay);
      this.a(csw.ag, csw.dc, csw.dn);
      this.a(csw.z, csw.fV, ks.e.b);
      this.b(csw.aG, ll.r);
      this.l(csw.U).c(csw.U).a(csw.ao);
      this.l(csw.al).c(csw.al).a(csw.aw);
      this.a(csw.al, csw.da, csw.dl);
      this.a(csw.x, csw.fT, ks.e.b);
      this.b(csw.aE, ll.r);
      this.l(csw.V).c(csw.V).a(csw.ap);
      this.l(csw.af).c(csw.af).a(csw.ax);
      this.a(csw.af, csw.db, csw.dm);
      this.a(csw.y, csw.fU, ks.e.b);
      this.b(csw.aF, ll.r);
      this.l(csw.aa).c(csw.aa).a(csw.au);
      this.l(csw.ak).c(csw.ak).a(csw.aC);
      this.a(csw.ak, csw.dg, csw.dr);
      this.a(csw.D, csw.fZ, ks.e.b);
      this.b(csw.aK, ll.r);
      this.l(csw.X).c(csw.X).a(csw.ar);
      this.l(csw.ah).c(csw.ah).a(csw.az);
      this.a(csw.ah, csw.df, csw.dq);
      this.a(csw.A, csw.fW, ks.e.b);
      this.b(csw.aH, ll.r);
      this.l(csw.os).b(csw.os).a(csw.ou);
      this.l(csw.ot).b(csw.ot).a(csw.ov);
      this.a(csw.ot, csw.dh, csw.dt);
      this.a(csw.ox, csw.pm, ks.e.b);
      this.k(csw.oD, csw.po);
      this.l(csw.oj).b(csw.oj).a(csw.ol);
      this.l(csw.ok).b(csw.ok).a(csw.om);
      this.a(csw.ok, csw.di, csw.du);
      this.a(csw.oo, csw.pn, ks.e.b);
      this.k(csw.oq, csw.pp);
      this.l(csw.ae).d(csw.ae);
      this.l(csw.an).d(csw.an);
      this.a(csw.v, csw.dk, csw.dv);
      this.b(csw.or, ks.e.b);
      this.a(cji.dk);
      this.i(csw.dy);
      this.k(csw.hY);
      this.u();
      this.n(csw.cP);
      this.o(csw.bp);
      this.o(csw.bq);
      this.o(csw.hh);
      this.t();
      this.q(csw.fN);
      this.q(csw.kG);
      this.q(csw.kH);
      this.r(csw.gS);
      this.r(csw.gT);
      this.r(csw.gU);
      this.o();
      this.p();
      this.d(csw.cD, ll.g);
      this.d(csw.nW, ll.g);
      this.d(csw.nV, ll.h);
      this.s();
      this.ay();
      this.at();
      this.h(csw.eL, csw.eT);
      this.h(csw.m, csw.eP);
      this.h(csw.eK, csw.eS);
      this.h(csw.eJ, csw.eR);
      this.aw();
      this.h(csw.eI, csw.eQ);
      this.ax();
      ckk.h().forEach($$0 -> this.a($$0, lg.b("template_spawn_egg")));
   }

   private void aB() {
      this.c(csw.hX);
      kz.a<Integer> $$0 = kz.a(dfz.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aew $$3 = lj.a(cji.hg, $$2);
         $$0.a($$1, lb.a().a(lc.c, li.Y.a(csw.hX, $$2, lj.h($$3), this.c)));
         li.bv.a(lg.a(cji.hg, $$2), lj.k($$3), this.c);
      }

      this.b.accept(ky.a(csw.hX).a($$0));
   }

   private void l(csv $$0, csv $$1) {
      this.a($$0.k());
      lj $$2 = lj.b(lj.G($$0));
      lj $$3 = lj.b(lj.a($$0, "_lit"));
      aew $$4 = li.bF.a($$0, "_one_candle", $$2, this.c);
      aew $$5 = li.bG.a($$0, "_two_candles", $$2, this.c);
      aew $$6 = li.bH.a($$0, "_three_candles", $$2, this.c);
      aew $$7 = li.bI.a($$0, "_four_candles", $$2, this.c);
      aew $$8 = li.bF.a($$0, "_one_candle_lit", $$3, this.c);
      aew $$9 = li.bG.a($$0, "_two_candles_lit", $$3, this.c);
      aew $$10 = li.bH.a($$0, "_three_candles_lit", $$3, this.c);
      aew $$11 = li.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            ky.a($$0)
               .a(
                  kz.a(dfz.az, dfz.r)
                     .a(1, false, lb.a().a(lc.c, $$4))
                     .a(2, false, lb.a().a(lc.c, $$5))
                     .a(3, false, lb.a().a(lc.c, $$6))
                     .a(4, false, lb.a().a(lc.c, $$7))
                     .a(1, true, lb.a().a(lc.c, $$8))
                     .a(2, true, lb.a().a(lc.c, $$9))
                     .a(3, true, lb.a().a(lc.c, $$10))
                     .a(4, true, lb.a().a(lc.c, $$11))
               )
         );
      aew $$12 = li.bJ.a($$1, lj.a($$0, false), this.c);
      aew $$13 = li.bJ.a($$1, "_lit", lj.a($$0, true), this.c);
      this.b.accept(ky.a($$1).a(a(dfz.r, $$13, $$12)));
   }

   class a {
      private final aew b;

      public a(aew $$0, csv $$1) {
         this.b = li.Y.a($$0, lj.u($$1), ks.this.c);
      }

      public ks.a a(csv... $$0) {
         for (csv $$1 : $$0) {
            ks.this.b.accept(ks.c($$1, this.b));
         }

         return this;
      }

      public ks.a b(csv... $$0) {
         for (csv $$1 : $$0) {
            ks.this.c($$1);
         }

         return this.a($$0);
      }

      public ks.a a(lh $$0, csv... $$1) {
         for (csv $$2 : $$1) {
            $$0.a(lg.a($$2.k()), lj.u($$2), ks.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final lj b;
      private final Map<lh, aew> c = Maps.newHashMap();
      @Nullable
      private jf d;
      @Nullable
      private aew e;

      public b(lj $$0) {
         this.b = $$0;
      }

      public ks.b a(csv $$0, lh $$1) {
         this.e = $$1.a($$0, this.b, ks.this.c);
         if (ks.this.f.containsKey($$0)) {
            ks.this.b.accept(ks.this.f.get($$0).create($$0, this.e, this.b, ks.this.c));
         } else {
            ks.this.b.accept(ks.c($$0, this.e));
         }

         return this;
      }

      public ks.b a(csv... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (csv $$1 : $$0) {
               ks.this.b.accept(ks.c($$1, this.e));
               ks.this.a($$1, this.e);
            }

            return this;
         }
      }

      public ks.b a(csv $$0) {
         aew $$1 = li.q.a($$0, this.b, ks.this.c);
         aew $$2 = li.r.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.b($$0, $$1, $$2));
         aew $$3 = li.s.a($$0, this.b, ks.this.c);
         ks.this.a($$0, $$3);
         return this;
      }

      public ks.b b(csv $$0) {
         aew $$1 = li.K.a($$0, this.b, ks.this.c);
         aew $$2 = li.L.a($$0, this.b, ks.this.c);
         aew $$3 = li.M.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$1, $$2, $$3));
         aew $$4 = li.N.a($$0, this.b, ks.this.c);
         ks.this.a($$0, $$4);
         return this;
      }

      public ks.b c(csv $$0) {
         lj $$1 = lj.p($$0);
         aew $$2 = li.B.a($$0, $$1, ks.this.c);
         aew $$3 = li.C.a($$0, $$1, ks.this.c);
         aew $$4 = li.D.a($$0, $$1, ks.this.c);
         aew $$5 = li.E.a($$0, $$1, ks.this.c);
         aew $$6 = li.F.a($$0, $$1, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$2, $$3, $$4, $$5, $$6));
         aew $$7 = li.G.a($$0, $$1, ks.this.c);
         ks.this.a($$0, $$7);
         return this;
      }

      public ks.b d(csv $$0) {
         aew $$1 = li.H.a($$0, this.b, ks.this.c);
         aew $$2 = li.I.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.c($$0, $$1, $$2));
         aew $$3 = li.J.a($$0, this.b, ks.this.c);
         ks.this.a($$0, $$3);
         return this;
      }

      public ks.b e(csv $$0) {
         lj $$1 = lj.p($$0);
         aew $$2 = li.P.a($$0, $$1, ks.this.c);
         aew $$3 = li.O.a($$0, $$1, ks.this.c);
         aew $$4 = li.R.a($$0, $$1, ks.this.c);
         aew $$5 = li.Q.a($$0, $$1, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ks.b f(csv $$0) {
         aew $$1 = li.T.a($$0, this.b, ks.this.c);
         aew $$2 = li.S.a($$0, this.b, ks.this.c);
         aew $$3 = li.V.a($$0, this.b, ks.this.c);
         aew $$4 = li.U.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ks.b g(csv $$0) {
         aew $$1 = li.W.a($$0, this.b, ks.this.c);
         aew $$2 = li.X.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.e($$0, $$1, $$2));
         return this;
      }

      public ks.b h(csv $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            csv $$1 = this.d.b().get(jf.b.r);
            aew $$2 = li.Y.a($$0, this.b, ks.this.c);
            ks.this.b.accept(ks.c($$0, $$2));
            ks.this.b.accept(ks.c($$1, $$2));
            ks.this.a($$0.k());
            ks.this.c($$1);
            return this;
         }
      }

      public ks.b i(csv $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aew $$1 = this.a(li.Z, $$0);
            aew $$2 = this.a(li.aa, $$0);
            ks.this.b.accept(ks.e($$0, $$1, $$2, this.e));
            ks.this.a($$0, $$1);
            return this;
         }
      }

      public ks.b j(csv $$0) {
         aew $$1 = this.a(li.ad, $$0);
         aew $$2 = this.a(li.ac, $$0);
         aew $$3 = this.a(li.ae, $$0);
         ks.this.b.accept(ks.b($$0, $$1, $$2, $$3));
         ks.this.a($$0, $$2);
         return this;
      }

      private ks.b k(csv $$0) {
         ll $$1 = ks.this.g.getOrDefault($$0, ll.a.get($$0));
         ks.this.b.accept(ks.c($$0, $$1.a($$0, ks.this.c)));
         return this;
      }

      private ks.b l(csv $$0) {
         ks.this.i($$0);
         return this;
      }

      private void m(csv $$0) {
         if (ks.this.e.contains($$0)) {
            ks.this.k($$0);
         } else {
            ks.this.j($$0);
         }
      }

      private aew a(lh $$0, csv $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ks.this.c));
      }

      public ks.b a(jf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<ks.b, csv> $$2 = ks.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      kv create(csv var1, aew var2, lj var3, BiConsumer<aew, Supplier<JsonElement>> var4);
   }

   static record d(lh a, String b) {
   }

   static enum e {
      a,
      b;

      public lh a() {
         return this == a ? li.an : li.am;
      }

      public lh b() {
         return this == a ? li.ap : li.ao;
      }
   }

   class f {
      private final lj b;

      public f(lj $$0) {
         this.b = $$0;
      }

      public ks.f a(csv $$0) {
         lj $$1 = this.b.c(lk.d, this.b.a(lk.i));
         aew $$2 = li.i.a($$0, $$1, ks.this.c);
         ks.this.b.accept(ks.d($$0, $$2));
         return this;
      }

      public ks.f b(csv $$0) {
         aew $$1 = li.i.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.d($$0, $$1));
         return this;
      }

      public ks.f c(csv $$0) {
         aew $$1 = li.i.a($$0, this.b, ks.this.c);
         aew $$2 = li.j.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.d($$0, $$1, $$2));
         return this;
      }

      public ks.f d(csv $$0) {
         ks.this.b.accept(ks.a($$0, this.b, ks.this.c));
         return this;
      }
   }
}
