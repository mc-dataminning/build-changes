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
   final BiConsumer<aeu, Supplier<JsonElement>> c;
   private final Consumer<civ> d;
   final List<csq> e = ImmutableList.of(csr.ez, csr.eF, csr.hY);
   final Map<csq, ks.c> f = ImmutableMap.builder().put(csr.b, ks::a).put(csr.rI, ks::c).put(csr.eN, ks::b).build();
   final Map<csq, ll> g = ImmutableMap.builder()
      .put(csr.aV, ll.x.get(csr.aV))
      .put(csr.jp, ll.x.get(csr.jp))
      .put(csr.jS, ll.a(lj.a(csr.aV, "_top")))
      .put(csr.jU, ll.a(lj.a(csr.jp, "_top")))
      .put(csr.aX, ll.c.get(csr.aV).a($$0x -> $$0x.a(lk.i, lj.G(csr.aX))))
      .put(csr.jr, ll.c.get(csr.jp).a($$0x -> $$0x.a(lk.i, lj.G(csr.jr))))
      .put(csr.hd, ll.c.get(csr.hd))
      .put(csr.jT, ll.a(lj.a(csr.hd, "_bottom")))
      .put(csr.pr, ll.y.get(csr.pr))
      .put(csr.rI, ll.y.get(csr.rI))
      .put(csr.he, ll.c.get(csr.he).a($$0x -> $$0x.a(lk.i, lj.G(csr.he))))
      .put(csr.aW, ll.c.get(csr.aW).a($$0x -> {
         $$0x.a(lk.d, lj.a(csr.aV, "_top"));
         $$0x.a(lk.i, lj.G(csr.aW));
      }))
      .put(csr.jq, ll.c.get(csr.jq).a($$0x -> {
         $$0x.a(lk.d, lj.a(csr.jp, "_top"));
         $$0x.a(lk.i, lj.G(csr.jq));
      }))
      .build();
   static final Map<jh.b, BiConsumer<ks.b, csq>> h = ImmutableMap.builder()
      .put(jh.b.a, ks.b::a)
      .put(jh.b.e, ks.b::l)
      .put(jh.b.b, ks.b::k)
      .put(jh.b.c, ks.b::k)
      .put(jh.b.f, ks.b::c)
      .put(jh.b.g, ks.b::d)
      .put(jh.b.h, ks.b::e)
      .put(jh.b.i, ks.b::f)
      .put(jh.b.k, ks.b::h)
      .put(jh.b.l, ks.b::i)
      .put(jh.b.m, ks.b::j)
      .put(jh.b.n, ks.b::g)
      .put(jh.b.p, ks.b::m)
      .put(jh.b.q, ks.b::b)
      .build();
   public static final List<Pair<dfv, Function<aeu, lb>>> a = List.of(
      Pair.of(dfu.L, (Function<aeu, lb>)$$0 -> lb.a().a(lc.c, $$0)),
      Pair.of(dfu.M, (Function<aeu, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.b, lc.a.b).a(lc.d, true)),
      Pair.of(dfu.N, (Function<aeu, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.b, lc.a.c).a(lc.d, true)),
      Pair.of(dfu.O, (Function<aeu, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.b, lc.a.d).a(lc.d, true)),
      Pair.of(dfu.J, (Function<aeu, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.a, lc.a.d).a(lc.d, true)),
      Pair.of(dfu.K, (Function<aeu, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.a, lc.a.b).a(lc.d, true))
   );
   private static final Map<ks.d, aeu> i = new HashMap<>();

   private static kv a(csq $$0, aeu $$1, lj $$2, BiConsumer<aeu, Supplier<JsonElement>> $$3) {
      aeu $$4 = li.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static kv b(csq $$0, aeu $$1, lj $$2, BiConsumer<aeu, Supplier<JsonElement>> $$3) {
      aeu $$4 = li.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static kv c(csq $$0, aeu $$1, lj $$2, BiConsumer<aeu, Supplier<JsonElement>> $$3) {
      aeu $$4 = li.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ks(Consumer<kv> $$0, BiConsumer<aeu, Supplier<JsonElement>> $$1, Consumer<civ> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(csq $$0) {
      this.d.accept($$0.k());
   }

   void a(csq $$0, aeu $$1) {
      this.c.accept(lg.a($$0.k()), new lf($$1));
   }

   private void a(civ $$0, aeu $$1) {
      this.c.accept(lg.a($$0), new lf($$1));
   }

   void a(civ $$0) {
      li.bv.a(lg.a($$0), lj.b($$0), this.c);
   }

   private void d(csq $$0) {
      civ $$1 = $$0.k();
      if ($$1 != cjd.a) {
         li.bv.a(lg.a($$1), lj.F($$0), this.c);
      }
   }

   private void a(csq $$0, String $$1) {
      civ $$2 = $$0.k();
      li.bv.a(lg.a($$2), lj.k(lj.a($$0, $$1)), this.c);
   }

   private static kz b() {
      return kz.a(dfu.R).a(hc.f, lb.a().a(lc.b, lc.a.b)).a(hc.d, lb.a().a(lc.b, lc.a.c)).a(hc.e, lb.a().a(lc.b, lc.a.d)).a(hc.c, lb.a());
   }

   private static kz c() {
      return kz.a(dfu.R).a(hc.d, lb.a()).a(hc.e, lb.a().a(lc.b, lc.a.b)).a(hc.c, lb.a().a(lc.b, lc.a.c)).a(hc.f, lb.a().a(lc.b, lc.a.d));
   }

   private static kz d() {
      return kz.a(dfu.R).a(hc.f, lb.a()).a(hc.d, lb.a().a(lc.b, lc.a.b)).a(hc.e, lb.a().a(lc.b, lc.a.c)).a(hc.c, lb.a().a(lc.b, lc.a.d));
   }

   private static kz e() {
      return kz.a(dfu.P)
         .a(hc.a, lb.a().a(lc.a, lc.a.b))
         .a(hc.b, lb.a().a(lc.a, lc.a.d))
         .a(hc.c, lb.a())
         .a(hc.d, lb.a().a(lc.b, lc.a.c))
         .a(hc.e, lb.a().a(lc.b, lc.a.d))
         .a(hc.f, lb.a().a(lc.b, lc.a.b));
   }

   private static ky b(csq $$0, aeu $$1) {
      return ky.a($$0, a($$1));
   }

   private static lb[] a(aeu $$0) {
      return new lb[]{lb.a().a(lc.c, $$0), lb.a().a(lc.c, $$0).a(lc.b, lc.a.b), lb.a().a(lc.c, $$0).a(lc.b, lc.a.c), lb.a().a(lc.c, $$0).a(lc.b, lc.a.d)};
   }

   private static ky a(csq $$0, aeu $$1, aeu $$2) {
      return ky.a($$0, lb.a().a(lc.c, $$1), lb.a().a(lc.c, $$2), lb.a().a(lc.c, $$1).a(lc.b, lc.a.c), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c));
   }

   private static kz a(dfv $$0, aeu $$1, aeu $$2) {
      return kz.a($$0).a(true, lb.a().a(lc.c, $$1)).a(false, lb.a().a(lc.c, $$2));
   }

   private void e(csq $$0) {
      aeu $$1 = ll.a.create($$0, this.c);
      aeu $$2 = ll.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(csq $$0) {
      aeu $$1 = ll.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(csq $$0) {
      this.b.accept(ky.a($$0).a(kz.a(dfu.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aeu $$3 = lj.a($$0, $$2);
         return lb.a().a(lc.c, li.c.a($$0, $$2, new lj().a(lk.a, $$3), this.c));
      })));
      this.a($$0, lj.a($$0, "_0"));
   }

   static kv b(csq $$0, aeu $$1, aeu $$2) {
      return ky.a($$0)
         .a(kz.a(dfu.w).a(false, lb.a().a(lc.c, $$1)).a(true, lb.a().a(lc.c, $$2)))
         .a(
            kz.a(dfu.U, dfu.R)
               .a(dfp.a, hc.f, lb.a().a(lc.b, lc.a.b))
               .a(dfp.a, hc.e, lb.a().a(lc.b, lc.a.d))
               .a(dfp.a, hc.d, lb.a().a(lc.b, lc.a.c))
               .a(dfp.a, hc.c, lb.a())
               .a(dfp.b, hc.f, lb.a().a(lc.b, lc.a.b).a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfp.b, hc.e, lb.a().a(lc.b, lc.a.d).a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfp.b, hc.d, lb.a().a(lc.b, lc.a.c).a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfp.b, hc.c, lb.a().a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfp.c, hc.f, lb.a().a(lc.b, lc.a.d).a(lc.a, lc.a.c))
               .a(dfp.c, hc.e, lb.a().a(lc.b, lc.a.b).a(lc.a, lc.a.c))
               .a(dfp.c, hc.d, lb.a().a(lc.a, lc.a.c))
               .a(dfp.c, hc.c, lb.a().a(lc.b, lc.a.c).a(lc.a, lc.a.c))
         );
   }

   private static kz.d<hc, dga, dfz, Boolean> a(kz.d<hc, dga, dfz, Boolean> $$0, dga $$1, aeu $$2, aeu $$3, aeu $$4, aeu $$5) {
      return $$0.a(hc.f, $$1, dfz.a, false, lb.a().a(lc.c, $$2))
         .a(hc.d, $$1, dfz.a, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
         .a(hc.e, $$1, dfz.a, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
         .a(hc.c, $$1, dfz.a, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
         .a(hc.f, $$1, dfz.b, false, lb.a().a(lc.c, $$4))
         .a(hc.d, $$1, dfz.b, false, lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
         .a(hc.e, $$1, dfz.b, false, lb.a().a(lc.c, $$4).a(lc.b, lc.a.c))
         .a(hc.c, $$1, dfz.b, false, lb.a().a(lc.c, $$4).a(lc.b, lc.a.d))
         .a(hc.f, $$1, dfz.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
         .a(hc.d, $$1, dfz.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
         .a(hc.e, $$1, dfz.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
         .a(hc.c, $$1, dfz.a, true, lb.a().a(lc.c, $$3))
         .a(hc.f, $$1, dfz.b, true, lb.a().a(lc.c, $$5).a(lc.b, lc.a.d))
         .a(hc.d, $$1, dfz.b, true, lb.a().a(lc.c, $$5))
         .a(hc.e, $$1, dfz.b, true, lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
         .a(hc.c, $$1, dfz.b, true, lb.a().a(lc.c, $$5).a(lc.b, lc.a.c));
   }

   private static kv a(csq $$0, aeu $$1, aeu $$2, aeu $$3, aeu $$4, aeu $$5, aeu $$6, aeu $$7, aeu $$8) {
      return ky.a($$0).a(a(a(kz.a(dfu.R, dfu.ae, dfu.be, dfu.u), dga.b, $$1, $$2, $$3, $$4), dga.a, $$5, $$6, $$7, $$8));
   }

   static kv a(csq $$0, aeu $$1, aeu $$2, aeu $$3, aeu $$4, aeu $$5) {
      return kx.a($$0)
         .a(lb.a().a(lc.c, $$1))
         .a(kw.a().a(dfu.L, true), lb.a().a(lc.c, $$2).a(lc.d, false))
         .a(kw.a().a(dfu.M, true), lb.a().a(lc.c, $$3).a(lc.d, false))
         .a(kw.a().a(dfu.N, true), lb.a().a(lc.c, $$4).a(lc.d, false))
         .a(kw.a().a(dfu.O, true), lb.a().a(lc.c, $$5).a(lc.d, false));
   }

   static kv c(csq $$0, aeu $$1, aeu $$2) {
      return kx.a($$0)
         .a(lb.a().a(lc.c, $$1))
         .a(kw.a().a(dfu.L, true), lb.a().a(lc.c, $$2).a(lc.d, true))
         .a(kw.a().a(dfu.M, true), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true))
         .a(kw.a().a(dfu.N, true), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true))
         .a(kw.a().a(dfu.O, true), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true));
   }

   static kv a(csq $$0, aeu $$1, aeu $$2, aeu $$3) {
      return kx.a($$0)
         .a(kw.a().a(dfu.J, true), lb.a().a(lc.c, $$1))
         .a(kw.a().a(dfu.X, dgq.b), lb.a().a(lc.c, $$2).a(lc.d, true))
         .a(kw.a().a(dfu.W, dgq.b), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true))
         .a(kw.a().a(dfu.Y, dgq.b), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true))
         .a(kw.a().a(dfu.Z, dgq.b), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true))
         .a(kw.a().a(dfu.X, dgq.c), lb.a().a(lc.c, $$3).a(lc.d, true))
         .a(kw.a().a(dfu.W, dgq.c), lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true))
         .a(kw.a().a(dfu.Y, dgq.c), lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true))
         .a(kw.a().a(dfu.Z, dgq.c), lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true));
   }

   static kv a(csq $$0, aeu $$1, aeu $$2, aeu $$3, aeu $$4, boolean $$5) {
      return ky.a($$0, lb.a().a(lc.d, $$5))
         .a(c())
         .a(
            kz.a(dfu.q, dfu.u)
               .a(false, false, lb.a().a(lc.c, $$2))
               .a(true, false, lb.a().a(lc.c, $$4))
               .a(false, true, lb.a().a(lc.c, $$1))
               .a(true, true, lb.a().a(lc.c, $$3))
         );
   }

   static kv b(csq $$0, aeu $$1, aeu $$2, aeu $$3) {
      return ky.a($$0)
         .a(
            kz.a(dfu.R, dfu.af, dfu.bi)
               .a(hc.f, dgd.b, dgn.a, lb.a().a(lc.c, $$2))
               .a(hc.e, dgd.b, dgn.a, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.d, dgd.b, dgn.a, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.c, dgd.b, dgn.a, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true))
               .a(hc.f, dgd.b, dgn.e, lb.a().a(lc.c, $$3))
               .a(hc.e, dgd.b, dgn.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.d, dgd.b, dgn.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.c, dgd.b, dgn.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true))
               .a(hc.f, dgd.b, dgn.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true))
               .a(hc.e, dgd.b, dgn.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.d, dgd.b, dgn.d, lb.a().a(lc.c, $$3))
               .a(hc.c, dgd.b, dgn.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.f, dgd.b, dgn.c, lb.a().a(lc.c, $$1))
               .a(hc.e, dgd.b, dgn.c, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.d, dgd.b, dgn.c, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.c, dgd.b, dgn.c, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d).a(lc.d, true))
               .a(hc.f, dgd.b, dgn.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d).a(lc.d, true))
               .a(hc.e, dgd.b, dgn.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.d, dgd.b, dgn.b, lb.a().a(lc.c, $$1))
               .a(hc.c, dgd.b, dgn.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.f, dgd.a, dgn.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.d, true))
               .a(hc.e, dgd.a, dgn.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.d, dgd.a, dgn.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.c, dgd.a, dgn.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(hc.f, dgd.a, dgn.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.e, dgd.a, dgn.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(hc.d, dgd.a, dgn.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.c, dgd.a, dgn.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.d, true))
               .a(hc.f, dgd.a, dgn.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.d, true))
               .a(hc.e, dgd.a, dgn.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.d, dgd.a, dgn.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.c, dgd.a, dgn.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(hc.f, dgd.a, dgn.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.e, dgd.a, dgn.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(hc.d, dgd.a, dgn.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.c, dgd.a, dgn.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.d, true))
               .a(hc.f, dgd.a, dgn.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.d, true))
               .a(hc.e, dgd.a, dgn.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(hc.d, dgd.a, dgn.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(hc.c, dgd.a, dgn.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
         );
   }

   private static kv c(csq $$0, aeu $$1, aeu $$2, aeu $$3) {
      return ky.a($$0)
         .a(
            kz.a(dfu.R, dfu.af, dfu.u)
               .a(hc.c, dgd.b, false, lb.a().a(lc.c, $$2))
               .a(hc.d, dgd.b, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
               .a(hc.f, dgd.b, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
               .a(hc.e, dgd.b, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
               .a(hc.c, dgd.a, false, lb.a().a(lc.c, $$1))
               .a(hc.d, dgd.a, false, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
               .a(hc.f, dgd.a, false, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
               .a(hc.e, dgd.a, false, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
               .a(hc.c, dgd.b, true, lb.a().a(lc.c, $$3))
               .a(hc.d, dgd.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(hc.f, dgd.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(hc.e, dgd.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               .a(hc.c, dgd.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.c))
               .a(hc.d, dgd.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.a))
               .a(hc.f, dgd.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.d))
               .a(hc.e, dgd.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.b))
         );
   }

   private static kv d(csq $$0, aeu $$1, aeu $$2, aeu $$3) {
      return ky.a($$0)
         .a(
            kz.a(dfu.R, dfu.af, dfu.u)
               .a(hc.c, dgd.b, false, lb.a().a(lc.c, $$2))
               .a(hc.d, dgd.b, false, lb.a().a(lc.c, $$2))
               .a(hc.f, dgd.b, false, lb.a().a(lc.c, $$2))
               .a(hc.e, dgd.b, false, lb.a().a(lc.c, $$2))
               .a(hc.c, dgd.a, false, lb.a().a(lc.c, $$1))
               .a(hc.d, dgd.a, false, lb.a().a(lc.c, $$1))
               .a(hc.f, dgd.a, false, lb.a().a(lc.c, $$1))
               .a(hc.e, dgd.a, false, lb.a().a(lc.c, $$1))
               .a(hc.c, dgd.b, true, lb.a().a(lc.c, $$3))
               .a(hc.d, dgd.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(hc.f, dgd.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(hc.e, dgd.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               .a(hc.c, dgd.a, true, lb.a().a(lc.c, $$3))
               .a(hc.d, dgd.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(hc.f, dgd.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(hc.e, dgd.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
         );
   }

   static ky c(csq $$0, aeu $$1) {
      return ky.a($$0, lb.a().a(lc.c, $$1));
   }

   private static kz f() {
      return kz.a(dfu.I).a(hc.a.b, lb.a()).a(hc.a.c, lb.a().a(lc.a, lc.a.b)).a(hc.a.a, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b));
   }

   static kv a(csq $$0, lj $$1, BiConsumer<aeu, Supplier<JsonElement>> $$2) {
      aeu $$3 = li.f.a($$0, $$1, $$2);
      aeu $$4 = li.g.a($$0, $$1, $$2);
      aeu $$5 = li.h.a($$0, $$1, $$2);
      aeu $$6 = li.i.a($$0, $$1, $$2);
      return ky.a($$0, lb.a().a(lc.c, $$6)).a(kz.a(dfu.I).a(hc.a.a, lb.a().a(lc.c, $$3)).a(hc.a.b, lb.a().a(lc.c, $$4)).a(hc.a.c, lb.a().a(lc.c, $$5)));
   }

   static kv d(csq $$0, aeu $$1) {
      return ky.a($$0, lb.a().a(lc.c, $$1)).a(f());
   }

   private void e(csq $$0, aeu $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(csq $$0, ll.a $$1) {
      aeu $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(csq $$0, ll.a $$1) {
      aeu $$2 = $$1.create($$0, this.c);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, $$2)).a(b()));
   }

   static kv d(csq $$0, aeu $$1, aeu $$2) {
      return ky.a($$0)
         .a(
            kz.a(dfu.I)
               .a(hc.a.b, lb.a().a(lc.c, $$1))
               .a(hc.a.c, lb.a().a(lc.c, $$2).a(lc.a, lc.a.b))
               .a(hc.a.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.b).a(lc.b, lc.a.b))
         );
   }

   private void a(csq $$0, ll.a $$1, ll.a $$2) {
      aeu $$3 = $$1.create($$0, this.c);
      aeu $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aeu a(csq $$0, String $$1, lh $$2, Function<aeu, lj> $$3) {
      return $$2.a($$0, $$1, $$3.apply(lj.a($$0, $$1)), this.c);
   }

   static kv e(csq $$0, aeu $$1, aeu $$2) {
      return ky.a($$0).a(a(dfu.w, $$2, $$1));
   }

   static kv e(csq $$0, aeu $$1, aeu $$2, aeu $$3) {
      return ky.a($$0).a(kz.a(dfu.bh).a(dgm.b, lb.a().a(lc.c, $$1)).a(dgm.a, lb.a().a(lc.c, $$2)).a(dgm.c, lb.a().a(lc.c, $$3)));
   }

   public void a(csq $$0) {
      this.b($$0, ll.a);
   }

   public void b(csq $$0, ll.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(csq $$0, lj $$1, lh $$2) {
      aeu $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ks.b h(csq $$0) {
      ll $$1 = this.g.getOrDefault($$0, ll.a.get($$0));
      return new ks.b($$1.b()).a($$0, $$1.a());
   }

   public void a(csq $$0, csq $$1, csq $$2) {
      lj $$3 = lj.u($$0);
      aeu $$4 = li.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(csq $$0) {
      lj $$1 = lj.t($$0);
      aeu $$2 = li.t.a($$0, $$1, this.c);
      aeu $$3 = li.u.a($$0, $$1, this.c);
      aeu $$4 = li.v.a($$0, $$1, this.c);
      aeu $$5 = li.w.a($$0, $$1, this.c);
      aeu $$6 = li.x.a($$0, $$1, this.c);
      aeu $$7 = li.y.a($$0, $$1, this.c);
      aeu $$8 = li.z.a($$0, $$1, this.c);
      aeu $$9 = li.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(csq $$0) {
      lj $$1 = lj.b($$0);
      aeu $$2 = li.ai.a($$0, $$1, this.c);
      aeu $$3 = li.aj.a($$0, $$1, this.c);
      aeu $$4 = li.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(csq $$0) {
      lj $$1 = lj.b($$0);
      aeu $$2 = li.af.a($$0, $$1, this.c);
      aeu $$3 = li.ag.a($$0, $$1, this.c);
      aeu $$4 = li.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(csr.rC);
      aeu $$0 = lg.a(csr.rC);
      aeu $$1 = lg.a(csr.rC, "_partial_tilt");
      aeu $$2 = lg.a(csr.rC, "_full_tilt");
      this.b
         .accept(
            ky.a(csr.rC)
               .a(b())
               .a(kz.a(dfu.bl).a(dgp.a, lb.a().a(lc.c, $$0)).a(dgp.b, lb.a().a(lc.c, $$0)).a(dgp.c, lb.a().a(lc.c, $$1)).a(dgp.d, lb.a().a(lc.c, $$2)))
         );
   }

   private ks.f l(csq $$0) {
      return new ks.f(lj.n($$0));
   }

   private void m(csq $$0) {
      this.a($$0, $$0);
   }

   private void a(csq $$0, csq $$1) {
      this.b.accept(c($$0, lg.a($$1)));
   }

   private void a(csq $$0, ks.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(csq $$0, ks.e $$1, lj $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csq $$0, ks.e $$1) {
      lj $$2 = lj.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(csq $$0, ks.e $$1, lj $$2) {
      aeu $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(csq $$0, ks.e $$1, dgh<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         kz $$4 = kz.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            lj $$5 = lj.c(lj.a($$0, $$4x));
            aeu $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return lb.a().a(lc.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(ky.a($$0).a($$4));
      }
   }

   private void a(csq $$0, csq $$1, ks.e $$2) {
      this.a($$0, $$2);
      lj $$3 = lj.d($$0);
      aeu $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(csq $$0, csq $$1) {
      ll $$2 = ll.o.get($$0);
      aeu $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aeu $$4 = li.aA.a($$1, $$2.b(), this.c);
      this.b.accept(ky.a($$1, lb.a().a(lc.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(csq $$0, csq $$1) {
      this.a($$0.k());
      lj $$2 = lj.h($$0);
      lj $$3 = lj.a($$0, $$1);
      aeu $$4 = li.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            ky.a($$1, lb.a().a(lc.c, $$4))
               .a(kz.a(dfu.R).a(hc.e, lb.a()).a(hc.d, lb.a().a(lc.b, lc.a.d)).a(hc.c, lb.a().a(lc.b, lc.a.b)).a(hc.f, lb.a().a(lc.b, lc.a.c)))
         );
      this.b.accept(ky.a($$0).a(kz.a(dfu.av).a($$2x -> lb.a().a(lc.c, li.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      csq $$0 = csr.kC;
      this.a($$0.k());
      aeu $$1 = lg.a($$0, "_top");
      aeu $$2 = lg.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      csq $$0 = csr.kB;
      this.a($$0.k());
      kz $$1 = kz.a(cyd.b, dfu.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> lb.a().a(lc.c, lg.a($$0, "_top_stage_" + $$1x));
            case b -> lb.a().a(lc.c, lg.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(ky.a($$0).a($$1));
   }

   private void a(csq $$0, csq $$1, csq $$2, csq $$3, csq $$4, csq $$5, csq $$6, csq $$7) {
      this.a($$0, ks.e.b);
      this.a($$1, ks.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(csq $$0, ks.e $$1) {
      this.a($$0, "_top");
      aeu $$2 = this.a($$0, "_top", $$1.a(), lj::c);
      aeu $$3 = this.a($$0, "_bottom", $$1.a(), lj::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(csr.iD, "_front");
      aeu $$0 = lg.a(csr.iD, "_top");
      aeu $$1 = this.a(csr.iD, "_bottom", ks.e.b.a(), lj::c);
      this.f(csr.iD, $$0, $$1);
   }

   private void k() {
      aeu $$0 = this.a(csr.bx, "_top", li.bi, lj::a);
      aeu $$1 = this.a(csr.bx, "_bottom", li.bi, lj::a);
      this.f(csr.bx, $$0, $$1);
   }

   private void l() {
      this.c(csr.rE);
      aeu $$0 = lg.a(csr.rE, "_top");
      aeu $$1 = lg.a(csr.rE, "_bottom");
      this.b.accept(ky.a(csr.rE).a(b()).a(kz.a(dfu.ae).a(dga.b, lb.a().a(lc.c, $$1)).a(dga.a, lb.a().a(lc.c, $$0))));
   }

   private void f(csq $$0, aeu $$1, aeu $$2) {
      this.b.accept(ky.a($$0).a(kz.a(dfu.ae).a(dga.b, lb.a().a(lc.c, $$2)).a(dga.a, lb.a().a(lc.c, $$1))));
   }

   private void n(csq $$0) {
      lj $$1 = lj.e($$0);
      lj $$2 = lj.e(lj.a($$0, "_corner"));
      aeu $$3 = li.aq.a($$0, $$1, this.c);
      aeu $$4 = li.ar.a($$0, $$2, this.c);
      aeu $$5 = li.as.a($$0, $$1, this.c);
      aeu $$6 = li.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            ky.a($$0)
               .a(
                  kz.a(dfu.ag)
                     .a(dgi.a, lb.a().a(lc.c, $$3))
                     .a(dgi.b, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
                     .a(dgi.c, lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
                     .a(dgi.d, lb.a().a(lc.c, $$6).a(lc.b, lc.a.b))
                     .a(dgi.e, lb.a().a(lc.c, $$5))
                     .a(dgi.f, lb.a().a(lc.c, $$6))
                     .a(dgi.g, lb.a().a(lc.c, $$4))
                     .a(dgi.h, lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
                     .a(dgi.i, lb.a().a(lc.c, $$4).a(lc.b, lc.a.c))
                     .a(dgi.j, lb.a().a(lc.c, $$4).a(lc.b, lc.a.d))
               )
         );
   }

   private void o(csq $$0) {
      aeu $$1 = this.a($$0, "", li.aq, lj::e);
      aeu $$2 = this.a($$0, "", li.as, lj::e);
      aeu $$3 = this.a($$0, "", li.at, lj::e);
      aeu $$4 = this.a($$0, "_on", li.aq, lj::e);
      aeu $$5 = this.a($$0, "_on", li.as, lj::e);
      aeu $$6 = this.a($$0, "_on", li.at, lj::e);
      kz $$7 = kz.a(dfu.w, dfu.ah).a(($$6x, $$7x) -> {
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

   private ks.a a(aeu $$0, csq $$1) {
      return new ks.a($$0, $$1);
   }

   private ks.a d(csq $$0, csq $$1) {
      return new ks.a(lg.a($$0), $$1);
   }

   private void a(csq $$0, civ $$1) {
      aeu $$2 = li.Y.a($$0, lj.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(csq $$0, aeu $$1) {
      aeu $$2 = li.Y.a($$0, lj.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(csq $$0, csq $$1) {
      this.a($$0);
      aeu $$2 = ll.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(csq $$0) {
      this.a($$0.k());
      aeu $$1 = ll.j.create($$0, this.c);
      aeu $$2 = ll.k.create($$0, this.c);
      aeu $$3 = ll.l.create($$0, this.c);
      aeu $$4 = ll.m.create($$0, this.c);
      this.b
         .accept(
            kx.a($$0)
               .a(kw.a().a(dfu.S, 1, 2, 3, 4).a(dfu.R, hc.c), lb.a().a(lc.c, $$1))
               .a(kw.a().a(dfu.S, 1, 2, 3, 4).a(dfu.R, hc.f), lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.S, 1, 2, 3, 4).a(dfu.R, hc.d), lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
               .a(kw.a().a(dfu.S, 1, 2, 3, 4).a(dfu.R, hc.e), lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
               .a(kw.a().a(dfu.S, 2, 3, 4).a(dfu.R, hc.c), lb.a().a(lc.c, $$2))
               .a(kw.a().a(dfu.S, 2, 3, 4).a(dfu.R, hc.f), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.S, 2, 3, 4).a(dfu.R, hc.d), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
               .a(kw.a().a(dfu.S, 2, 3, 4).a(dfu.R, hc.e), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
               .a(kw.a().a(dfu.S, 3, 4).a(dfu.R, hc.c), lb.a().a(lc.c, $$3))
               .a(kw.a().a(dfu.S, 3, 4).a(dfu.R, hc.f), lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.S, 3, 4).a(dfu.R, hc.d), lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(kw.a().a(dfu.S, 3, 4).a(dfu.R, hc.e), lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               .a(kw.a().a(dfu.S, 4).a(dfu.R, hc.c), lb.a().a(lc.c, $$4))
               .a(kw.a().a(dfu.S, 4).a(dfu.R, hc.f), lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.S, 4).a(dfu.R, hc.d), lb.a().a(lc.c, $$4).a(lc.b, lc.a.c))
               .a(kw.a().a(dfu.S, 4).a(dfu.R, hc.e), lb.a().a(lc.c, $$4).a(lc.b, lc.a.d))
         );
   }

   private void a(ll.a $$0, csq... $$1) {
      for (csq $$2 : $$1) {
         aeu $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ll.a $$0, csq... $$1) {
      for (csq $$2 : $$1) {
         aeu $$3 = $$0.create($$2, this.c);
         this.b.accept(ky.a($$2, lb.a().a(lc.c, $$3)).a(c()));
      }
   }

   private void f(csq $$0, csq $$1) {
      this.a($$0);
      lj $$2 = lj.b($$0, $$1);
      aeu $$3 = li.aG.a($$1, $$2, this.c);
      aeu $$4 = li.aH.a($$1, $$2, this.c);
      aeu $$5 = li.aI.a($$1, $$2, this.c);
      aeu $$6 = li.aE.a($$1, $$2, this.c);
      aeu $$7 = li.aF.a($$1, $$2, this.c);
      civ $$8 = $$1.k();
      li.bv.a(lg.a($$8), lj.F($$0), this.c);
      this.b
         .accept(
            kx.a($$1)
               .a(lb.a().a(lc.c, $$3))
               .a(kw.a().a(dfu.L, true), lb.a().a(lc.c, $$4))
               .a(kw.a().a(dfu.M, true), lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.N, true), lb.a().a(lc.c, $$5))
               .a(kw.a().a(dfu.O, true), lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.L, false), lb.a().a(lc.c, $$6))
               .a(kw.a().a(dfu.M, false), lb.a().a(lc.c, $$7))
               .a(kw.a().a(dfu.N, false), lb.a().a(lc.c, $$7).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.O, false), lb.a().a(lc.c, $$6).a(lc.b, lc.a.d))
         );
   }

   private void q(csq $$0) {
      lj $$1 = lj.z($$0);
      aeu $$2 = li.aJ.a($$0, $$1, this.c);
      aeu $$3 = this.a($$0, "_conditional", li.aJ, $$1x -> $$1.c(lk.i, $$1x));
      this.b.accept(ky.a($$0).a(a(dfu.c, $$3, $$2)).a(e()));
   }

   private void r(csq $$0) {
      aeu $$1 = ll.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<lb> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> lb.a().a(lc.c, lg.a(csr.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(csr.mZ);
      this.b
         .accept(
            kx.a(csr.mZ)
               .a(kw.a().a(dfu.aq, 0), this.a(0))
               .a(kw.a().a(dfu.aq, 1), this.a(1))
               .a(kw.a().a(dfu.bk, dfq.b), lb.a().a(lc.c, lg.a(csr.mZ, "_small_leaves")))
               .a(kw.a().a(dfu.bk, dfq.c), lb.a().a(lc.c, lg.a(csr.mZ, "_large_leaves")))
         );
   }

   private kz n() {
      return kz.a(dfu.P)
         .a(hc.a, lb.a().a(lc.a, lc.a.c))
         .a(hc.b, lb.a())
         .a(hc.c, lb.a().a(lc.a, lc.a.b))
         .a(hc.d, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.c))
         .a(hc.e, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.d))
         .a(hc.f, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b));
   }

   private void o() {
      aeu $$0 = lj.a(csr.nU, "_top_open");
      this.b
         .accept(
            ky.a(csr.nU)
               .a(this.n())
               .a(
                  kz.a(dfu.u)
                     .a(false, lb.a().a(lc.c, ll.e.create(csr.nU, this.c)))
                     .a(true, lb.a().a(lc.c, ll.e.get(csr.nU).a($$1 -> $$1.a(lk.f, $$0)).a(csr.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> kz a(dgh<T> $$0, T $$1, aeu $$2, aeu $$3) {
      lb $$4 = lb.a().a(lc.c, $$2);
      lb $$5 = lb.a().a(lc.c, $$3);
      return kz.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(csq $$0, Function<csq, lj> $$1) {
      lj $$2 = $$1.apply($$0).b(lk.i, lk.c);
      lj $$3 = $$2.c(lk.g, lj.a($$0, "_front_honey"));
      aeu $$4 = li.o.a($$0, $$2, this.c);
      aeu $$5 = li.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(ky.a($$0).a(b()).a(a(dfu.aN, 5, $$5, $$4)));
   }

   private void a(csq $$0, dgh<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aeu> $$3 = new Int2ObjectOpenHashMap();
         kz $$4 = kz.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aeu $$5 = (aeu)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, li.aT, lj::g));
            return lb.a().a(lc.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(ky.a($$0).a($$4));
      }
   }

   private void p() {
      aeu $$0 = lg.a(csr.od, "_floor");
      aeu $$1 = lg.a(csr.od, "_ceiling");
      aeu $$2 = lg.a(csr.od, "_wall");
      aeu $$3 = lg.a(csr.od, "_between_walls");
      this.a(cjd.vs);
      this.b
         .accept(
            ky.a(csr.od)
               .a(
                  kz.a(dfu.R, dfu.V)
                     .a(hc.c, dfs.a, lb.a().a(lc.c, $$0))
                     .a(hc.d, dfs.a, lb.a().a(lc.c, $$0).a(lc.b, lc.a.c))
                     .a(hc.f, dfs.a, lb.a().a(lc.c, $$0).a(lc.b, lc.a.b))
                     .a(hc.e, dfs.a, lb.a().a(lc.c, $$0).a(lc.b, lc.a.d))
                     .a(hc.c, dfs.b, lb.a().a(lc.c, $$1))
                     .a(hc.d, dfs.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
                     .a(hc.f, dfs.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
                     .a(hc.e, dfs.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
                     .a(hc.c, dfs.c, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
                     .a(hc.d, dfs.c, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
                     .a(hc.f, dfs.c, lb.a().a(lc.c, $$2))
                     .a(hc.e, dfs.c, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
                     .a(hc.d, dfs.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
                     .a(hc.c, dfs.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
                     .a(hc.f, dfs.d, lb.a().a(lc.c, $$3))
                     .a(hc.e, dfs.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            ky.a(csr.nZ, lb.a().a(lc.c, lg.a(csr.nZ)))
               .a(
                  kz.a(dfu.U, dfu.R)
                     .a(dfp.a, hc.c, lb.a())
                     .a(dfp.a, hc.f, lb.a().a(lc.b, lc.a.b))
                     .a(dfp.a, hc.d, lb.a().a(lc.b, lc.a.c))
                     .a(dfp.a, hc.e, lb.a().a(lc.b, lc.a.d))
                     .a(dfp.b, hc.c, lb.a().a(lc.a, lc.a.b))
                     .a(dfp.b, hc.f, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b))
                     .a(dfp.b, hc.d, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.c))
                     .a(dfp.b, hc.e, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.d))
                     .a(dfp.c, hc.d, lb.a().a(lc.a, lc.a.c))
                     .a(dfp.c, hc.e, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.b))
                     .a(dfp.c, hc.c, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.c))
                     .a(dfp.c, hc.f, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.d))
               )
         );
   }

   private void d(csq $$0, ll.a $$1) {
      aeu $$2 = $$1.create($$0, this.c);
      aeu $$3 = lj.a($$0, "_front_on");
      aeu $$4 = $$1.get($$0).a($$1x -> $$1x.a(lk.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(ky.a($$0).a(a(dfu.r, $$4, $$2)).a(b()));
   }

   private void a(csq... $$0) {
      aeu $$1 = lg.a("campfire_off");

      for (csq $$2 : $$0) {
         aeu $$3 = li.ba.a($$2, lj.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(ky.a($$2).a(a(dfu.r, $$3, $$1)).a(c()));
      }
   }

   private void s(csq $$0) {
      aeu $$1 = li.br.a($$0, lj.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(csq $$0) {
      aeu $$1;
      if ($$0 == csr.si) {
         $$1 = li.bt.a($$0, lj.m($$0), this.c);
      } else {
         $$1 = li.bs.a($$0, lj.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      lj $$0 = lj.a(lj.G(csr.cl), lj.G(csr.n));
      aeu $$1 = li.i.a(csr.cl, $$0, this.c);
      this.b.accept(c(csr.cl, $$1));
   }

   private void s() {
      this.a(cjd.ll);
      this.b
         .accept(
            kx.a(csr.cw)
               .a(
                  kw.b(
                     kw.a().a(dfu.ab, dgj.c).a(dfu.aa, dgj.c).a(dfu.ac, dgj.c).a(dfu.ad, dgj.c),
                     kw.a().a(dfu.ab, dgj.b, dgj.a).a(dfu.aa, dgj.b, dgj.a),
                     kw.a().a(dfu.aa, dgj.b, dgj.a).a(dfu.ac, dgj.b, dgj.a),
                     kw.a().a(dfu.ac, dgj.b, dgj.a).a(dfu.ad, dgj.b, dgj.a),
                     kw.a().a(dfu.ad, dgj.b, dgj.a).a(dfu.ab, dgj.b, dgj.a)
                  ),
                  lb.a().a(lc.c, lg.a("redstone_dust_dot"))
               )
               .a(kw.a().a(dfu.ab, dgj.b, dgj.a), lb.a().a(lc.c, lg.a("redstone_dust_side0")))
               .a(kw.a().a(dfu.ac, dgj.b, dgj.a), lb.a().a(lc.c, lg.a("redstone_dust_side_alt0")))
               .a(kw.a().a(dfu.aa, dgj.b, dgj.a), lb.a().a(lc.c, lg.a("redstone_dust_side_alt1")).a(lc.b, lc.a.d))
               .a(kw.a().a(dfu.ad, dgj.b, dgj.a), lb.a().a(lc.c, lg.a("redstone_dust_side1")).a(lc.b, lc.a.d))
               .a(kw.a().a(dfu.ab, dgj.a), lb.a().a(lc.c, lg.a("redstone_dust_up")))
               .a(kw.a().a(dfu.aa, dgj.a), lb.a().a(lc.c, lg.a("redstone_dust_up")).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.ac, dgj.a), lb.a().a(lc.c, lg.a("redstone_dust_up")).a(lc.b, lc.a.c))
               .a(kw.a().a(dfu.ad, dgj.a), lb.a().a(lc.c, lg.a("redstone_dust_up")).a(lc.b, lc.a.d))
         );
   }

   private void t() {
      this.a(cjd.lp);
      this.b
         .accept(
            ky.a(csr.gY)
               .a(c())
               .a(
                  kz.a(dfu.bd, dfu.w)
                     .a(dfx.a, false, lb.a().a(lc.c, lg.a(csr.gY)))
                     .a(dfx.a, true, lb.a().a(lc.c, lg.a(csr.gY, "_on")))
                     .a(dfx.b, false, lb.a().a(lc.c, lg.a(csr.gY, "_subtract")))
                     .a(dfx.b, true, lb.a().a(lc.c, lg.a(csr.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      lj $$0 = lj.a(csr.jR);
      lj $$1 = lj.a(lj.a(csr.jE, "_side"), $$0.a(lk.f));
      aeu $$2 = li.Z.a(csr.jE, $$1, this.c);
      aeu $$3 = li.aa.a(csr.jE, $$1, this.c);
      aeu $$4 = li.i.b(csr.jE, "_double", $$1, this.c);
      this.b.accept(e(csr.jE, $$2, $$3, $$4));
      this.b.accept(c(csr.jR, li.c.a(csr.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cjd.rB);
      this.b
         .accept(
            kx.a(csr.fs)
               .a(lb.a().a(lc.c, lj.G(csr.fs)))
               .a(kw.a().a(dfu.k, true), lb.a().a(lc.c, lj.a(csr.fs, "_bottle0")))
               .a(kw.a().a(dfu.l, true), lb.a().a(lc.c, lj.a(csr.fs, "_bottle1")))
               .a(kw.a().a(dfu.m, true), lb.a().a(lc.c, lj.a(csr.fs, "_bottle2")))
               .a(kw.a().a(dfu.k, false), lb.a().a(lc.c, lj.a(csr.fs, "_empty0")))
               .a(kw.a().a(dfu.l, false), lb.a().a(lc.c, lj.a(csr.fs, "_empty1")))
               .a(kw.a().a(dfu.m, false), lb.a().a(lc.c, lj.a(csr.fs, "_empty2")))
         );
   }

   private void u(csq $$0) {
      aeu $$1 = li.bn.a($$0, lj.b($$0), this.c);
      aeu $$2 = lg.a("mushroom_block_inside");
      this.b
         .accept(
            kx.a($$0)
               .a(kw.a().a(dfu.L, true), lb.a().a(lc.c, $$1))
               .a(kw.a().a(dfu.M, true), lb.a().a(lc.c, $$1).a(lc.b, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dfu.N, true), lb.a().a(lc.c, $$1).a(lc.b, lc.a.c).a(lc.d, true))
               .a(kw.a().a(dfu.O, true), lb.a().a(lc.c, $$1).a(lc.b, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dfu.J, true), lb.a().a(lc.c, $$1).a(lc.a, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dfu.K, true), lb.a().a(lc.c, $$1).a(lc.a, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dfu.L, false), lb.a().a(lc.c, $$2))
               .a(kw.a().a(dfu.M, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, false))
               .a(kw.a().a(dfu.N, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, false))
               .a(kw.a().a(dfu.O, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, false))
               .a(kw.a().a(dfu.J, false), lb.a().a(lc.c, $$2).a(lc.a, lc.a.d).a(lc.d, false))
               .a(kw.a().a(dfu.K, false), lb.a().a(lc.c, $$2).a(lc.a, lc.a.b).a(lc.d, false))
         );
      this.a($$0, ll.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cjd.qN);
      this.b
         .accept(
            ky.a(csr.eh)
               .a(
                  kz.a(dfu.ay)
                     .a(0, lb.a().a(lc.c, lg.a(csr.eh)))
                     .a(1, lb.a().a(lc.c, lg.a(csr.eh, "_slice1")))
                     .a(2, lb.a().a(lc.c, lg.a(csr.eh, "_slice2")))
                     .a(3, lb.a().a(lc.c, lg.a(csr.eh, "_slice3")))
                     .a(4, lb.a().a(lc.c, lg.a(csr.eh, "_slice4")))
                     .a(5, lb.a().a(lc.c, lg.a(csr.eh, "_slice5")))
                     .a(6, lb.a().a(lc.c, lg.a(csr.eh, "_slice6")))
               )
         );
   }

   private void x() {
      lj $$0 = new lj()
         .a(lk.c, lj.a(csr.nX, "_side3"))
         .a(lk.o, lj.G(csr.t))
         .a(lk.n, lj.a(csr.nX, "_top"))
         .a(lk.j, lj.a(csr.nX, "_side3"))
         .a(lk.l, lj.a(csr.nX, "_side3"))
         .a(lk.k, lj.a(csr.nX, "_side1"))
         .a(lk.m, lj.a(csr.nX, "_side2"));
      this.b.accept(c(csr.nX, li.a.a(csr.nX, $$0, this.c)));
   }

   private void y() {
      lj $$0 = new lj()
         .a(lk.c, lj.a(csr.ob, "_front"))
         .a(lk.o, lj.a(csr.ob, "_bottom"))
         .a(lk.n, lj.a(csr.ob, "_top"))
         .a(lk.j, lj.a(csr.ob, "_front"))
         .a(lk.k, lj.a(csr.ob, "_front"))
         .a(lk.l, lj.a(csr.ob, "_side"))
         .a(lk.m, lj.a(csr.ob, "_side"));
      this.b.accept(c(csr.ob, li.a.a(csr.ob, $$0, this.c)));
   }

   private void a(csq $$0, csq $$1, BiFunction<csq, csq, lj> $$2) {
      lj $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, li.a.a($$0, $$3, this.c)));
   }

   public void b(csq $$0) {
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
      lj $$0 = lj.k(csr.dV);
      this.b.accept(c(csr.dV, lg.a(csr.dV)));
      this.a(csr.ef, $$0);
      this.a(csr.eg, $$0);
   }

   private void a(csq $$0, lj $$1) {
      aeu $$2 = li.n.a($$0, $$1.c(lk.g, lj.G($$0)), this.c);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cjd.rC);
      this.m(csr.ft);
      this.b.accept(c(csr.fv, li.bq.a(csr.fv, lj.j(lj.a(csr.H, "_still")), this.c)));
      this.b
         .accept(
            ky.a(csr.fu)
               .a(
                  kz.a(cww.e)
                     .a(1, lb.a().a(lc.c, li.bo.a(csr.fu, "_level1", lj.j(lj.a(csr.G, "_still")), this.c)))
                     .a(2, lb.a().a(lc.c, li.bp.a(csr.fu, "_level2", lj.j(lj.a(csr.G, "_still")), this.c)))
                     .a(3, lb.a().a(lc.c, li.bq.a(csr.fu, "_full", lj.j(lj.a(csr.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            ky.a(csr.fw)
               .a(
                  kz.a(cww.e)
                     .a(1, lb.a().a(lc.c, li.bo.a(csr.fw, "_level1", lj.j(lj.G(csr.qC)), this.c)))
                     .a(2, lb.a().a(lc.c, li.bp.a(csr.fw, "_level2", lj.j(lj.G(csr.qC)), this.c)))
                     .a(3, lb.a().a(lc.c, li.bq.a(csr.fw, "_full", lj.j(lj.G(csr.qC)), this.c)))
               )
         );
   }

   private void B() {
      lj $$0 = lj.b(csr.kv);
      aeu $$1 = li.aC.a(csr.kv, $$0, this.c);
      aeu $$2 = this.a(csr.kv, "_dead", li.aC, $$1x -> $$0.c(lk.b, $$1x));
      this.b.accept(ky.a(csr.kv).a(a(dfu.au, 5, $$2, $$1)));
   }

   private void v(csq $$0) {
      lj $$1 = new lj().a(lk.f, lj.a(csr.cD, "_top")).a(lk.i, lj.a(csr.cD, "_side")).a(lk.g, lj.a($$0, "_front"));
      lj $$2 = new lj().a(lk.i, lj.a(csr.cD, "_top")).a(lk.g, lj.a($$0, "_front_vertical"));
      aeu $$3 = li.n.a($$0, $$1, this.c);
      aeu $$4 = li.p.a($$0, $$2, this.c);
      this.b
         .accept(
            ky.a($$0)
               .a(
                  kz.a(dfu.P)
                     .a(hc.a, lb.a().a(lc.c, $$4).a(lc.a, lc.a.c))
                     .a(hc.b, lb.a().a(lc.c, $$4))
                     .a(hc.c, lb.a().a(lc.c, $$3))
                     .a(hc.f, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
                     .a(hc.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
                     .a(hc.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               )
         );
   }

   private void C() {
      aeu $$0 = lg.a(csr.fy);
      aeu $$1 = lg.a(csr.fy, "_filled");
      this.b.accept(ky.a(csr.fy).a(kz.a(dfu.h).a(false, lb.a().a(lc.c, $$0)).a(true, lb.a().a(lc.c, $$1))).a(c()));
   }

   private void D() {
      aeu $$0 = lg.a(csr.ku, "_side");
      aeu $$1 = lg.a(csr.ku, "_noside");
      aeu $$2 = lg.a(csr.ku, "_noside1");
      aeu $$3 = lg.a(csr.ku, "_noside2");
      aeu $$4 = lg.a(csr.ku, "_noside3");
      this.b
         .accept(
            kx.a(csr.ku)
               .a(kw.a().a(dfu.L, true), lb.a().a(lc.c, $$0))
               .a(kw.a().a(dfu.M, true), lb.a().a(lc.c, $$0).a(lc.b, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dfu.N, true), lb.a().a(lc.c, $$0).a(lc.b, lc.a.c).a(lc.d, true))
               .a(kw.a().a(dfu.O, true), lb.a().a(lc.c, $$0).a(lc.b, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dfu.J, true), lb.a().a(lc.c, $$0).a(lc.a, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dfu.K, true), lb.a().a(lc.c, $$0).a(lc.a, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dfu.L, false), lb.a().a(lc.c, $$1).a(lc.e, 2), lb.a().a(lc.c, $$2), lb.a().a(lc.c, $$3), lb.a().a(lc.c, $$4))
               .a(
                  kw.a().a(dfu.M, false),
                  lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$4).a(lc.b, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.b, lc.a.b).a(lc.d, true)
               )
               .a(
                  kw.a().a(dfu.N, false),
                  lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true),
                  lb.a().a(lc.c, $$4).a(lc.b, lc.a.c).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.b, lc.a.c).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true)
               )
               .a(
                  kw.a().a(dfu.O, false),
                  lb.a().a(lc.c, $$4).a(lc.b, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.b, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true)
               )
               .a(
                  kw.a().a(dfu.J, false),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.a, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$4).a(lc.a, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.a, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.a, lc.a.d).a(lc.d, true)
               )
               .a(
                  kw.a().a(dfu.K, false),
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
            kx.a(csr.pc)
               .a(lb.a().a(lc.c, lj.G(csr.pc)))
               .a(kw.a().a(dfu.aL, 1), lb.a().a(lc.c, lj.a(csr.pc, "_contents1")))
               .a(kw.a().a(dfu.aL, 2), lb.a().a(lc.c, lj.a(csr.pc, "_contents2")))
               .a(kw.a().a(dfu.aL, 3), lb.a().a(lc.c, lj.a(csr.pc, "_contents3")))
               .a(kw.a().a(dfu.aL, 4), lb.a().a(lc.c, lj.a(csr.pc, "_contents4")))
               .a(kw.a().a(dfu.aL, 5), lb.a().a(lc.c, lj.a(csr.pc, "_contents5")))
               .a(kw.a().a(dfu.aL, 6), lb.a().a(lc.c, lj.a(csr.pc, "_contents6")))
               .a(kw.a().a(dfu.aL, 7), lb.a().a(lc.c, lj.a(csr.pc, "_contents7")))
               .a(kw.a().a(dfu.aL, 8), lb.a().a(lc.c, lj.a(csr.pc, "_contents_ready")))
         );
   }

   private void w(csq $$0) {
      this.c($$0);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, li.am.a($$0, lj.c($$0), this.c))).a(this.n()));
   }

   private void F() {
      this.w(csr.qy);
      this.w(csr.qx);
      this.w(csr.qw);
      this.w(csr.qv);
   }

   private void G() {
      this.c(csr.rs);
      kz.b<hc, dgb> $$0 = kz.a(dfu.bm, dfu.bn);

      for (dgb $$1 : dgb.values()) {
         $$0.a(hc.b, $$1, this.a(hc.b, $$1));
      }

      for (dgb $$2 : dgb.values()) {
         $$0.a(hc.a, $$2, this.a(hc.a, $$2));
      }

      this.b.accept(ky.a(csr.rs).a($$0));
   }

   private lb a(hc $$0, dgb $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      lj $$3 = lj.c(lj.a(csr.rs, $$2));
      return lb.a().a(lc.c, li.al.a(csr.rs, $$2, $$3, this.c));
   }

   private void x(csq $$0) {
      lj $$1 = new lj().a(lk.e, lj.G(csr.dW)).a(lk.f, lj.G($$0)).a(lk.i, lj.a($$0, "_side"));
      this.b.accept(c($$0, li.m.a($$0, $$1, this.c)));
   }

   private void H() {
      aeu $$0 = lj.a(csr.gZ, "_side");
      lj $$1 = new lj().a(lk.f, lj.a(csr.gZ, "_top")).a(lk.i, $$0);
      lj $$2 = new lj().a(lk.f, lj.a(csr.gZ, "_inverted_top")).a(lk.i, $$0);
      this.b
         .accept(
            ky.a(csr.gZ)
               .a(kz.a(dfu.p).a(false, lb.a().a(lc.c, li.aD.a(csr.gZ, $$1, this.c))).a(true, lb.a().a(lc.c, li.aD.a(lg.a(csr.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(csq $$0) {
      this.b.accept(ky.a($$0, lb.a().a(lc.c, lg.a($$0))).a(this.n()));
   }

   private void I() {
      csq $$0 = csr.rr;
      aeu $$1 = lg.a($$0, "_on");
      aeu $$2 = lg.a($$0);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, lg.a($$0))).a(this.n()).a(a(dfu.w, $$1, $$2)));
   }

   private void J() {
      lj $$0 = new lj().a(lk.B, lj.G(csr.j)).a(lk.f, lj.G(csr.cC));
      lj $$1 = new lj().a(lk.B, lj.G(csr.j)).a(lk.f, lj.a(csr.cC, "_moist"));
      aeu $$2 = li.aU.a(csr.cC, $$0, this.c);
      aeu $$3 = li.aU.a(lj.a(csr.cC, "_moist"), $$1, this.c);
      this.b.accept(ky.a(csr.cC).a(a(dfu.aQ, 7, $$3, $$2)));
   }

   private List<aeu> z(csq $$0) {
      aeu $$1 = li.aV.a(lg.a($$0, "_floor0"), lj.v($$0), this.c);
      aeu $$2 = li.aV.a(lg.a($$0, "_floor1"), lj.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aeu> A(csq $$0) {
      aeu $$1 = li.aW.a(lg.a($$0, "_side0"), lj.v($$0), this.c);
      aeu $$2 = li.aW.a(lg.a($$0, "_side1"), lj.w($$0), this.c);
      aeu $$3 = li.aX.a(lg.a($$0, "_side_alt0"), lj.v($$0), this.c);
      aeu $$4 = li.aX.a(lg.a($$0, "_side_alt1"), lj.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aeu> B(csq $$0) {
      aeu $$1 = li.aY.a(lg.a($$0, "_up0"), lj.v($$0), this.c);
      aeu $$2 = li.aY.a(lg.a($$0, "_up1"), lj.w($$0), this.c);
      aeu $$3 = li.aZ.a(lg.a($$0, "_up_alt0"), lj.v($$0), this.c);
      aeu $$4 = li.aZ.a(lg.a($$0, "_up_alt1"), lj.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<lb> a(List<aeu> $$0, UnaryOperator<lb> $$1) {
      return $$0.stream().map($$0x -> lb.a().a(lc.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void K() {
      kw $$0 = kw.a().a(dfu.L, false).a(dfu.M, false).a(dfu.N, false).a(dfu.O, false).a(dfu.J, false);
      List<aeu> $$1 = this.z(csr.cr);
      List<aeu> $$2 = this.A(csr.cr);
      List<aeu> $$3 = this.B(csr.cr);
      this.b
         .accept(
            kx.a(csr.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(kw.b(kw.a().a(dfu.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(kw.b(kw.a().a(dfu.M, true), $$0), a($$2, $$0x -> $$0x.a(lc.b, lc.a.b)))
               .a(kw.b(kw.a().a(dfu.N, true), $$0), a($$2, $$0x -> $$0x.a(lc.b, lc.a.c)))
               .a(kw.b(kw.a().a(dfu.O, true), $$0), a($$2, $$0x -> $$0x.a(lc.b, lc.a.d)))
               .a(kw.a().a(dfu.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void L() {
      List<aeu> $$0 = this.z(csr.cs);
      List<aeu> $$1 = this.A(csr.cs);
      this.b
         .accept(
            kx.a(csr.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(lc.b, lc.a.b)))
               .a(a($$1, $$0x -> $$0x.a(lc.b, lc.a.c)))
               .a(a($$1, $$0x -> $$0x.a(lc.b, lc.a.d)))
         );
   }

   private void C(csq $$0) {
      aeu $$1 = ll.s.create($$0, this.c);
      aeu $$2 = ll.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(ky.a($$0).a(a(dfu.j, $$2, $$1)));
   }

   private void M() {
      lj $$0 = lj.a(lj.a(csr.ad, "_side"), lj.a(csr.ad, "_top"));
      aeu $$1 = li.i.a(csr.ad, $$0, this.c);
      this.b.accept(d(csr.ad, $$1));
   }

   private void N() {
      this.a(cjd.Q);
      csq $$0 = csr.E;
      kz.b<Boolean, Integer> $$1 = kz.a(cxi.c, cxi.a);
      aeu $$2 = lg.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aeu $$4 = lg.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, lb.a().a(lc.c, $$4));
         $$1.a(false, $$3, lb.a().a(lc.c, $$2));
      }

      this.b.accept(ky.a(csr.E).a($$1));
   }

   private void O() {
      this.b
         .accept(
            ky.a(csr.kI)
               .a(
                  kz.a(dfu.as)
                     .a(0, lb.a().a(lc.c, this.a(csr.kI, "_0", li.c, lj::b)))
                     .a(1, lb.a().a(lc.c, this.a(csr.kI, "_1", li.c, lj::b)))
                     .a(2, lb.a().a(lc.c, this.a(csr.kI, "_2", li.c, lj::b)))
                     .a(3, lb.a().a(lc.c, this.a(csr.kI, "_3", li.c, lj::b)))
               )
         );
   }

   private void P() {
      aeu $$0 = lj.G(csr.j);
      lj $$1 = new lj().a(lk.e, $$0).b(lk.e, lk.c).a(lk.f, lj.a(csr.i, "_top")).a(lk.i, lj.a(csr.i, "_snow"));
      lb $$2 = lb.a().a(lc.c, li.m.a(csr.i, "_snow", $$1, this.c));
      this.a(csr.i, lg.a(csr.i), $$2);
      aeu $$3 = ll.e.get(csr.fl).a($$1x -> $$1x.a(lk.e, $$0)).a(csr.fl, this.c);
      this.a(csr.fl, $$3, $$2);
      aeu $$4 = ll.e.get(csr.l).a($$1x -> $$1x.a(lk.e, $$0)).a(csr.l, this.c);
      this.a(csr.l, $$4, $$2);
   }

   private void a(csq $$0, aeu $$1, lb $$2) {
      List<lb> $$3 = Arrays.asList(a($$1));
      this.b.accept(ky.a($$0).a(kz.a(dfu.z).a(true, $$2).a(false, $$3)));
   }

   private void Q() {
      this.a(cjd.qt);
      this.b
         .accept(
            ky.a(csr.fC)
               .a(
                  kz.a(dfu.ar)
                     .a(0, lb.a().a(lc.c, lg.a(csr.fC, "_stage0")))
                     .a(1, lb.a().a(lc.c, lg.a(csr.fC, "_stage1")))
                     .a(2, lb.a().a(lc.c, lg.a(csr.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void R() {
      this.b.accept(b(csr.kE, lg.a(csr.kE)));
   }

   private void g(csq $$0, csq $$1) {
      lj $$2 = lj.b($$1);
      aeu $$3 = li.W.a($$0, $$2, this.c);
      aeu $$4 = li.X.a($$0, $$2, this.c);
      this.b.accept(ky.a($$0).a(a(dfu.aT, 1, $$4, $$3)));
   }

   private void S() {
      aeu $$0 = lg.a(csr.hc);
      aeu $$1 = lg.a(csr.hc, "_side");
      this.a(cjd.lv);
      this.b
         .accept(
            ky.a(csr.hc)
               .a(
                  kz.a(dfu.Q)
                     .a(hc.a, lb.a().a(lc.c, $$0))
                     .a(hc.c, lb.a().a(lc.c, $$1))
                     .a(hc.f, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
                     .a(hc.d, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
                     .a(hc.e, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
               )
         );
   }

   private void h(csq $$0, csq $$1) {
      aeu $$2 = lg.a($$0);
      this.b.accept(ky.a($$1, lb.a().a(lc.c, $$2)));
      this.a($$1, $$2);
   }

   private void T() {
      aeu $$0 = lg.a(csr.eX, "_post_ends");
      aeu $$1 = lg.a(csr.eX, "_post");
      aeu $$2 = lg.a(csr.eX, "_cap");
      aeu $$3 = lg.a(csr.eX, "_cap_alt");
      aeu $$4 = lg.a(csr.eX, "_side");
      aeu $$5 = lg.a(csr.eX, "_side_alt");
      this.b
         .accept(
            kx.a(csr.eX)
               .a(lb.a().a(lc.c, $$0))
               .a(kw.a().a(dfu.L, false).a(dfu.M, false).a(dfu.N, false).a(dfu.O, false), lb.a().a(lc.c, $$1))
               .a(kw.a().a(dfu.L, true).a(dfu.M, false).a(dfu.N, false).a(dfu.O, false), lb.a().a(lc.c, $$2))
               .a(kw.a().a(dfu.L, false).a(dfu.M, true).a(dfu.N, false).a(dfu.O, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.L, false).a(dfu.M, false).a(dfu.N, true).a(dfu.O, false), lb.a().a(lc.c, $$3))
               .a(kw.a().a(dfu.L, false).a(dfu.M, false).a(dfu.N, false).a(dfu.O, true), lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.L, true), lb.a().a(lc.c, $$4))
               .a(kw.a().a(dfu.M, true), lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
               .a(kw.a().a(dfu.N, true), lb.a().a(lc.c, $$5))
               .a(kw.a().a(dfu.O, true), lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
         );
      this.d(csr.eX);
   }

   private void D(csq $$0) {
      this.b.accept(ky.a($$0, lb.a().a(lc.c, lg.a($$0))).a(b()));
   }

   private void U() {
      aeu $$0 = lg.a(csr.dw);
      aeu $$1 = lg.a(csr.dw, "_on");
      this.d(csr.dw);
      this.b
         .accept(
            ky.a(csr.dw)
               .a(a(dfu.w, $$0, $$1))
               .a(
                  kz.a(dfu.U, dfu.R)
                     .a(dfp.c, hc.c, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.c))
                     .a(dfp.c, hc.f, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.d))
                     .a(dfp.c, hc.d, lb.a().a(lc.a, lc.a.c))
                     .a(dfp.c, hc.e, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.b))
                     .a(dfp.a, hc.c, lb.a())
                     .a(dfp.a, hc.f, lb.a().a(lc.b, lc.a.b))
                     .a(dfp.a, hc.d, lb.a().a(lc.b, lc.a.c))
                     .a(dfp.a, hc.e, lb.a().a(lc.b, lc.a.d))
                     .a(dfp.b, hc.c, lb.a().a(lc.a, lc.a.b))
                     .a(dfp.b, hc.f, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b))
                     .a(dfp.b, hc.d, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.c))
                     .a(dfp.b, hc.e, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.d))
               )
         );
   }

   private void V() {
      this.d(csr.fm);
      this.b.accept(b(csr.fm, lg.a(csr.fm)));
   }

   private void W() {
      this.d(csr.sm);
      this.b.accept(c(csr.sm, lg.a(csr.sm)));
   }

   private void X() {
      this.b.accept(ky.a(csr.ee).a(kz.a(dfu.H).a(hc.a.a, lb.a().a(lc.c, lg.a(csr.ee, "_ns"))).a(hc.a.c, lb.a().a(lc.c, lg.a(csr.ee, "_ew")))));
   }

   private void Y() {
      aeu $$0 = ll.a.create(csr.dW, this.c);
      this.b
         .accept(
            ky.a(
               csr.dW,
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
      aeu $$0 = lg.a(csr.kO);
      aeu $$1 = lg.a(csr.kO, "_on");
      this.b.accept(ky.a(csr.kO).a(a(dfu.w, $$1, $$0)).a(e()));
   }

   private void aa() {
      lj $$0 = new lj().a(lk.e, lj.a(csr.by, "_bottom")).a(lk.i, lj.a(csr.by, "_side"));
      aeu $$1 = lj.a(csr.by, "_top_sticky");
      aeu $$2 = lj.a(csr.by, "_top");
      lj $$3 = $$0.c(lk.E, $$1);
      lj $$4 = $$0.c(lk.E, $$2);
      aeu $$5 = lg.a(csr.by, "_base");
      this.a(csr.by, $$5, $$4);
      this.a(csr.br, $$5, $$3);
      aeu $$6 = li.m.a(csr.by, "_inventory", $$0.c(lk.f, $$2), this.c);
      aeu $$7 = li.m.a(csr.br, "_inventory", $$0.c(lk.f, $$1), this.c);
      this.a(csr.by, $$6);
      this.a(csr.br, $$7);
   }

   private void a(csq $$0, aeu $$1, lj $$2) {
      aeu $$3 = li.bf.a($$0, $$2, this.c);
      this.b.accept(ky.a($$0).a(a(dfu.g, $$1, $$3)).a(e()));
   }

   private void ab() {
      lj $$0 = new lj().a(lk.F, lj.a(csr.by, "_top")).a(lk.i, lj.a(csr.by, "_side"));
      lj $$1 = $$0.c(lk.E, lj.a(csr.by, "_top_sticky"));
      lj $$2 = $$0.c(lk.E, lj.a(csr.by, "_top"));
      this.b
         .accept(
            ky.a(csr.bz)
               .a(
                  kz.a(dfu.x, dfu.bg)
                     .a(false, dgg.a, lb.a().a(lc.c, li.bg.a(csr.by, "_head", $$2, this.c)))
                     .a(false, dgg.b, lb.a().a(lc.c, li.bg.a(csr.by, "_head_sticky", $$1, this.c)))
                     .a(true, dgg.a, lb.a().a(lc.c, li.bh.a(csr.by, "_head_short", $$2, this.c)))
                     .a(true, dgg.b, lb.a().a(lc.c, li.bh.a(csr.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ac() {
      aeu $$0 = lg.a(csr.qD, "_inactive");
      aeu $$1 = lg.a(csr.qD, "_active");
      this.a(csr.qD, $$0);
      this.b.accept(ky.a(csr.qD).a(kz.a(dfu.bo).a($$2 -> lb.a().a(lc.c, $$2 != dgl.b && $$2 != dgl.c ? $$0 : $$1))));
   }

   private void ad() {
      aeu $$0 = lg.a(csr.qE, "_inactive");
      aeu $$1 = lg.a(csr.qE, "_active");
      this.a(csr.qE, $$0);
      this.b.accept(ky.a(csr.qE).a(kz.a(dfu.bo).a($$2 -> lb.a().a(lc.c, $$2 != dgl.b && $$2 != dgl.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      aeu $$0 = li.bK.a(csr.qI, lj.a(false), this.c);
      aeu $$1 = li.bK.a(csr.qI, "_can_summon", lj.a(true), this.c);
      this.a(csr.qI, $$0);
      this.b.accept(ky.a(csr.qI).a(a(dfu.G, $$1, $$0)));
   }

   private void af() {
      aeu $$0 = lg.a(csr.nS, "_stable");
      aeu $$1 = lg.a(csr.nS, "_unstable");
      this.a(csr.nS, $$0);
      this.b.accept(ky.a(csr.nS).a(a(dfu.b, $$1, $$0)));
   }

   private void ag() {
      aeu $$0 = this.a(csr.ru, "", li.am, lj::c);
      aeu $$1 = this.a(csr.ru, "_lit", li.am, lj::c);
      this.b.accept(ky.a(csr.ru).a(a(dfu.D, $$1, $$0)));
      aeu $$2 = this.a(csr.rv, "", li.am, lj::c);
      aeu $$3 = this.a(csr.rv, "_lit", li.am, lj::c);
      this.b.accept(ky.a(csr.rv).a(a(dfu.D, $$3, $$2)));
   }

   private void ah() {
      aeu $$0 = ll.a.create(csr.fB, this.c);
      aeu $$1 = this.a(csr.fB, "_on", li.c, lj::b);
      this.b.accept(ky.a(csr.fB).a(a(dfu.r, $$1, $$0)));
   }

   private void i(csq $$0, csq $$1) {
      lj $$2 = lj.y($$0);
      this.b.accept(c($$0, li.bd.a($$0, $$2, this.c)));
      this.b.accept(ky.a($$1, lb.a().a(lc.c, li.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      lj $$0 = lj.y(csr.dK);
      lj $$1 = lj.i(lj.a(csr.dK, "_off"));
      aeu $$2 = li.bd.a(csr.dK, $$0, this.c);
      aeu $$3 = li.bd.a(csr.dK, "_off", $$1, this.c);
      this.b.accept(ky.a(csr.dK).a(a(dfu.r, $$2, $$3)));
      aeu $$4 = li.be.a(csr.dL, $$0, this.c);
      aeu $$5 = li.be.a(csr.dL, "_off", $$1, this.c);
      this.b.accept(ky.a(csr.dL).a(a(dfu.r, $$4, $$5)).a(d()));
      this.d(csr.dK);
      this.c(csr.dL);
   }

   private void aj() {
      this.a(cjd.lo);
      this.b.accept(ky.a(csr.ei).a(kz.a(dfu.aA, dfu.s, dfu.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return lb.a().a(lc.c, lj.a(csr.ei, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(cjd.cx);
      this.b
         .accept(
            ky.a(csr.mV)
               .a(
                  kz.a(dfu.aS, dfu.C)
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
      lj $$0 = lj.a(csr.dN);
      aeu $$1 = li.c.a(csr.dP, $$0, this.c);
      this.b.accept(ky.a(csr.dN).a(kz.a(dfu.aF).a($$1x -> lb.a().a(lc.c, $$1x < 8 ? lg.a(csr.dN, "_height" + $$1x * 2) : $$1))));
      this.a(csr.dN, lg.a(csr.dN, "_height2"));
      this.b.accept(c(csr.dP, $$1));
   }

   private void am() {
      this.b.accept(ky.a(csr.oc, lb.a().a(lc.c, lg.a(csr.oc))).a(b()));
   }

   private void an() {
      aeu $$0 = ll.a.create(csr.pa, this.c);
      this.a(csr.pa, $$0);
      this.b.accept(ky.a(csr.pa).a(kz.a(dfu.bj).a($$0x -> lb.a().a(lc.c, this.a(csr.pa, "_" + $$0x.c(), li.c, lj::b)))));
   }

   private void ao() {
      this.a(cjd.vv);
      this.b.accept(ky.a(csr.oi).a(kz.a(dfu.as).a($$0 -> lb.a().a(lc.c, this.a(csr.oi, "_stage" + $$0, li.am, lj::c)))));
   }

   private void ap() {
      this.a(cjd.oE);
      this.b
         .accept(
            ky.a(csr.fI)
               .a(
                  kz.a(dfu.a, dfu.M, dfu.L, dfu.N, dfu.O)
                     .a(false, false, false, false, false, lb.a().a(lc.c, lg.a(csr.fI, "_ns")))
                     .a(false, true, false, false, false, lb.a().a(lc.c, lg.a(csr.fI, "_n")).a(lc.b, lc.a.b))
                     .a(false, false, true, false, false, lb.a().a(lc.c, lg.a(csr.fI, "_n")))
                     .a(false, false, false, true, false, lb.a().a(lc.c, lg.a(csr.fI, "_n")).a(lc.b, lc.a.c))
                     .a(false, false, false, false, true, lb.a().a(lc.c, lg.a(csr.fI, "_n")).a(lc.b, lc.a.d))
                     .a(false, true, true, false, false, lb.a().a(lc.c, lg.a(csr.fI, "_ne")))
                     .a(false, true, false, true, false, lb.a().a(lc.c, lg.a(csr.fI, "_ne")).a(lc.b, lc.a.b))
                     .a(false, false, false, true, true, lb.a().a(lc.c, lg.a(csr.fI, "_ne")).a(lc.b, lc.a.c))
                     .a(false, false, true, false, true, lb.a().a(lc.c, lg.a(csr.fI, "_ne")).a(lc.b, lc.a.d))
                     .a(false, false, true, true, false, lb.a().a(lc.c, lg.a(csr.fI, "_ns")))
                     .a(false, true, false, false, true, lb.a().a(lc.c, lg.a(csr.fI, "_ns")).a(lc.b, lc.a.b))
                     .a(false, true, true, true, false, lb.a().a(lc.c, lg.a(csr.fI, "_nse")))
                     .a(false, true, false, true, true, lb.a().a(lc.c, lg.a(csr.fI, "_nse")).a(lc.b, lc.a.b))
                     .a(false, false, true, true, true, lb.a().a(lc.c, lg.a(csr.fI, "_nse")).a(lc.b, lc.a.c))
                     .a(false, true, true, false, true, lb.a().a(lc.c, lg.a(csr.fI, "_nse")).a(lc.b, lc.a.d))
                     .a(false, true, true, true, true, lb.a().a(lc.c, lg.a(csr.fI, "_nsew")))
                     .a(true, false, false, false, false, lb.a().a(lc.c, lg.a(csr.fI, "_attached_ns")))
                     .a(true, false, true, false, false, lb.a().a(lc.c, lg.a(csr.fI, "_attached_n")))
                     .a(true, false, false, true, false, lb.a().a(lc.c, lg.a(csr.fI, "_attached_n")).a(lc.b, lc.a.c))
                     .a(true, true, false, false, false, lb.a().a(lc.c, lg.a(csr.fI, "_attached_n")).a(lc.b, lc.a.b))
                     .a(true, false, false, false, true, lb.a().a(lc.c, lg.a(csr.fI, "_attached_n")).a(lc.b, lc.a.d))
                     .a(true, true, true, false, false, lb.a().a(lc.c, lg.a(csr.fI, "_attached_ne")))
                     .a(true, true, false, true, false, lb.a().a(lc.c, lg.a(csr.fI, "_attached_ne")).a(lc.b, lc.a.b))
                     .a(true, false, false, true, true, lb.a().a(lc.c, lg.a(csr.fI, "_attached_ne")).a(lc.b, lc.a.c))
                     .a(true, false, true, false, true, lb.a().a(lc.c, lg.a(csr.fI, "_attached_ne")).a(lc.b, lc.a.d))
                     .a(true, false, true, true, false, lb.a().a(lc.c, lg.a(csr.fI, "_attached_ns")))
                     .a(true, true, false, false, true, lb.a().a(lc.c, lg.a(csr.fI, "_attached_ns")).a(lc.b, lc.a.b))
                     .a(true, true, true, true, false, lb.a().a(lc.c, lg.a(csr.fI, "_attached_nse")))
                     .a(true, true, false, true, true, lb.a().a(lc.c, lg.a(csr.fI, "_attached_nse")).a(lc.b, lc.a.b))
                     .a(true, false, true, true, true, lb.a().a(lc.c, lg.a(csr.fI, "_attached_nse")).a(lc.b, lc.a.c))
                     .a(true, true, true, false, true, lb.a().a(lc.c, lg.a(csr.fI, "_attached_nse")).a(lc.b, lc.a.d))
                     .a(true, true, true, true, true, lb.a().a(lc.c, lg.a(csr.fI, "_attached_nsew")))
               )
         );
   }

   private void aq() {
      this.d(csr.fH);
      this.b.accept(ky.a(csr.fH).a(kz.a(dfu.a, dfu.w).a(($$0, $$1) -> lb.a().a(lc.c, lj.a(csr.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aeu a(int $$0, String $$1, lj $$2) {
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

   private aeu a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", lj.b(lj.G(csr.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", lj.b(lj.a(csr.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", lj.b(lj.a(csr.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ar() {
      this.a(cjd.jT);
      this.b.accept(ky.a(csr.mf).a(kz.a(dfu.aD, dfu.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void as() {
      this.a(cjd.jU);
      Function<Integer, aeu> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         lj $$2 = lj.a($$1);
         return li.bu.a(csr.mg, $$1, $$2, this.c);
      };
      this.b.accept(ky.a(csr.mg).a(kz.a(czy.b).a($$1 -> lb.a().a(lc.c, $$0.apply($$1)))));
   }

   private void E(csq $$0) {
      this.d($$0);
      aeu $$1 = lg.a($$0);
      kx $$2 = kx.a($$0);
      kw.c $$3 = ac.a(kw.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dfv, Function<aeu, lb>> $$4 : a) {
         dfv $$5 = (dfv)$$4.getFirst();
         Function<aeu, lb> $$6 = (Function<aeu, lb>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(kw.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void at() {
      aeu $$0 = lj.a(csr.qH, "_bottom");
      lj $$1 = new lj().a(lk.e, $$0).a(lk.f, lj.a(csr.qH, "_top")).a(lk.i, lj.a(csr.qH, "_side"));
      lj $$2 = new lj().a(lk.e, $$0).a(lk.f, lj.a(csr.qH, "_top_bloom")).a(lk.i, lj.a(csr.qH, "_side_bloom"));
      aeu $$3 = li.m.a(csr.qH, "", $$1, this.c);
      aeu $$4 = li.m.a(csr.qH, "_bloom", $$2, this.c);
      this.b.accept(ky.a(csr.qH).a(kz.a(dfu.E).a($$2x -> lb.a().a(lc.c, $$2x ? $$4 : $$3))));
      this.a(cjd.fN, $$3);
   }

   private void au() {
      csq $$0 = csr.cm;
      aeu $$1 = lg.a($$0);
      kx $$2 = kx.a($$0);
      Map.of(hc.c, lc.a.a, hc.f, lc.a.b, hc.d, lc.a.c, hc.e, lc.a.d).forEach(($$2x, $$3) -> {
         kw.c $$4 = kw.a().a(dfu.R, $$2x);
         $$2.a($$4, lb.a().a(lc.c, $$1).a(lc.b, $$3).a(lc.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, lg.a($$0, "_inventory"));
      i.clear();
   }

   private void a(kx $$0, kw.c $$1, lc.a $$2) {
      Map.of(dfu.bp, li.aK, dfu.bq, li.aL, dfu.br, li.aM, dfu.bs, li.aN, dfu.bt, li.aO, dfu.bu, li.aP).forEach(($$3, $$4) -> {
         this.a($$0, $$1, $$2, $$3, $$4, true);
         this.a($$0, $$1, $$2, $$3, $$4, false);
      });
   }

   private void a(kx $$0, kw.c $$1, lc.a $$2, dfv $$3, lh $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      lj $$7 = new lj().a(lk.b, lj.a(csr.cm, $$6));
      ks.d $$8 = new ks.d($$4, $$6);
      aeu $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(csr.cm, $$6, $$7, this.c));
      $$0.a(kw.a($$1, kw.a().a($$3, $$5)), lb.a().a(lc.c, $$9).a(lc.b, $$2));
   }

   private void av() {
      this.b.accept(c(csr.kJ, li.c.a(csr.kJ, lj.b(lg.a("magma")), this.c)));
   }

   private void F(csq $$0) {
      this.b($$0, ll.p);
      li.bB.a(lg.a($$0.k()), lj.u($$0), this.c);
   }

   private void b(csq $$0, csq $$1, ks.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(csq $$0, csq $$1) {
      li.bC.a(lg.a($$0.k()), lj.u($$1), this.c);
   }

   private void aw() {
      aeu $$0 = lg.a(csr.b);
      aeu $$1 = lg.a(csr.b, "_mirrored");
      this.b.accept(a(csr.eO, $$0, $$1));
      this.a(csr.eO, $$0);
   }

   private void ax() {
      aeu $$0 = lg.a(csr.rI);
      aeu $$1 = lg.a(csr.rI, "_mirrored");
      this.b.accept(a(csr.sc, $$0, $$1).a(f()));
      this.a(csr.sc, $$0);
   }

   private void k(csq $$0, csq $$1) {
      this.a($$0, ks.e.b);
      lj $$2 = lj.d(lj.a($$0, "_pot"));
      aeu $$3 = ks.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void ay() {
      aeu $$0 = lj.a(csr.pl, "_bottom");
      aeu $$1 = lj.a(csr.pl, "_top_off");
      aeu $$2 = lj.a(csr.pl, "_top");
      aeu[] $$3 = new aeu[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         lj $$5 = new lj().a(lk.e, $$0).a(lk.f, $$4 == 0 ? $$1 : $$2).a(lk.i, lj.a(csr.pl, "_side" + $$4));
         $$3[$$4] = li.m.a(csr.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(ky.a(csr.pl).a(kz.a(dfu.aZ).a($$1x -> lb.a().a(lc.c, $$3[$$1x]))));
      this.a(cjd.vT, $$3[0]);
   }

   private lb a(he $$0, lb $$1) {
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
      aeu $$0 = lj.a(csr.pb, "_top");
      aeu $$1 = lj.a(csr.pb, "_bottom");
      aeu $$2 = lj.a(csr.pb, "_side");
      aeu $$3 = lj.a(csr.pb, "_lock");
      lj $$4 = new lj().a(lk.o, $$2).a(lk.m, $$2).a(lk.l, $$2).a(lk.c, $$0).a(lk.j, $$0).a(lk.k, $$1).a(lk.n, $$3);
      aeu $$5 = li.b.a(csr.pb, $$4, this.c);
      this.b.accept(ky.a(csr.pb, lb.a().a(lc.c, $$5)).a(kz.a(dfu.T).a($$0x -> this.a($$0x, lb.a()))));
   }

   private void aA() {
      csq $$0 = csr.n;
      aeu $$1 = lg.a($$0);
      ll $$2 = ll.a.get($$0);
      csq $$3 = csr.jH;
      aeu $$4 = li.Z.a($$3, $$2.b(), this.c);
      aeu $$5 = li.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      jg.a().filter(jh::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(csr.qS).a(jg.w).a(csr.ri).a(jg.y);
      this.h(csr.qR).a(jg.A).a(csr.rh).a(jg.C);
      this.h(csr.qQ).a(jg.E).a(csr.rg).a(jg.G);
      this.h(csr.qP).a(jg.I).a(csr.rf).a(jg.K);
      this.m(csr.a);
      this.a(csr.nc, csr.a);
      this.a(csr.nb, csr.a);
      this.m(csr.fO);
      this.m(csr.dQ);
      this.a(csr.nd, csr.G);
      this.m(csr.fA);
      this.m(csr.me);
      this.m(csr.fr);
      this.m(csr.fR);
      this.a(cjd.tk);
      this.m(csr.pg);
      this.m(csr.G);
      this.m(csr.H);
      this.m(csr.hV);
      this.a(cjd.fw);
      this.l(csr.pM, csr.qd);
      this.l(csr.pN, csr.qe);
      this.l(csr.pO, csr.qf);
      this.l(csr.pP, csr.qg);
      this.l(csr.pQ, csr.qh);
      this.l(csr.pR, csr.qi);
      this.l(csr.pS, csr.qj);
      this.l(csr.pT, csr.qk);
      this.l(csr.pU, csr.ql);
      this.l(csr.pV, csr.qm);
      this.l(csr.pW, csr.qn);
      this.l(csr.pX, csr.qo);
      this.l(csr.pY, csr.qp);
      this.l(csr.pZ, csr.qq);
      this.l(csr.qa, csr.qr);
      this.l(csr.qb, csr.qs);
      this.l(csr.pL, csr.qc);
      this.m(csr.na);
      this.m(csr.gs);
      this.m(csr.qC);
      this.m(csr.rw);
      this.s(csr.rx);
      this.s(csr.ry);
      this.t(csr.sh);
      this.t(csr.si);
      this.ag();
      this.e(csr.rB, csr.rz);
      this.p(csr.rA);
      this.a(csr.hW, cjd.hf);
      this.a(cjd.hf);
      this.aB();
      this.a(csr.kN, cjd.iF);
      this.a(cjd.iF);
      this.f(csr.bQ, lj.a(csr.by, "_side"));
      this.a(csr.R);
      this.a(csr.S);
      this.a(csr.iB);
      this.a(csr.cx);
      this.a(csr.cy);
      this.a(csr.cz);
      this.a(csr.fE);
      this.a(csr.fF);
      this.a(csr.fJ);
      this.a(csr.N);
      this.a(csr.T);
      this.a(csr.O);
      this.a(csr.ch);
      this.a(csr.P);
      this.a(csr.Q);
      this.a(csr.ci);
      this.b(csr.pj, ll.c);
      this.a(csr.pi);
      this.a(csr.aR);
      this.a(csr.aS);
      this.a(csr.aT);
      this.a(csr.hb);
      this.a(csr.dI);
      this.a(csr.dJ);
      this.a(csr.ha);
      this.a(csr.pC);
      this.a(csr.mW);
      this.a(csr.dR);
      this.a(csr.k);
      this.a(csr.pk);
      this.a(csr.fz);
      this.a(csr.ed);
      this.a(csr.L);
      this.a(csr.ph);
      this.a(csr.dO);
      this.b(csr.dT, ll.f);
      this.b(csr.pq, ll.c);
      this.b(csr.fa, ll.c);
      this.m(csr.ac);
      this.m(csr.ga);
      this.a(csr.kK);
      this.a(csr.aY);
      this.a(csr.iC);
      this.a(csr.co);
      this.a(csr.pK);
      this.a(csr.ii);
      this.a(csr.oy);
      this.a(csr.dX);
      this.a(csr.dY);
      this.a(csr.ct);
      this.a(csr.aO);
      this.b(csr.bw, ll.u);
      this.a(cjd.cw);
      this.b(csr.ck, ll.e);
      this.b(csr.pd, ll.c);
      this.a(csr.op);
      this.a(csr.aP);
      this.a(csr.qt);
      this.a(csr.qu);
      this.a(csr.qA);
      this.a(csr.qz);
      this.a(csr.rt);
      this.a(csr.se);
      this.a(csr.sf);
      this.a(csr.sg);
      this.e(csr.qF);
      this.aA();
      this.a(csr.qN);
      this.a(csr.qO);
      this.a(csr.qM);
      this.a(csr.qL);
      this.a(csr.qK);
      this.a(csr.qJ);
      this.h(csr.qM, csr.rb);
      this.h(csr.qL, csr.rd);
      this.h(csr.qK, csr.rc);
      this.h(csr.qJ, csr.re);
      this.g(csr.gW, csr.ch);
      this.g(csr.gX, csr.ci);
      this.F();
      this.r();
      this.au();
      this.v();
      this.w();
      this.a(csr.og, csr.oh);
      this.x();
      this.A();
      this.B();
      this.D();
      this.E();
      this.H();
      this.C();
      this.y(csr.kt);
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
      this.E(csr.ff);
      this.E(csr.fg);
      this.E(csr.qG);
      this.av();
      this.az();
      this.ac();
      this.ad();
      this.ae();
      this.W();
      this.N();
      this.M();
      this.D(csr.cO);
      this.d(csr.cO);
      this.D(csr.oa);
      this.g();
      this.D(csr.rD);
      this.i(csr.cp, csr.cq);
      this.i(csr.eb, csr.ec);
      this.a(csr.cA, csr.n, lj::c);
      this.a(csr.nY, csr.p, lj::d);
      this.x(csr.ow);
      this.x(csr.on);
      this.v(csr.aU);
      this.v(csr.hi);
      this.C(csr.oe);
      this.C(csr.of);
      this.e(csr.eY, lg.a(csr.eY));
      this.a(csr.dZ, ll.c);
      this.a(csr.ea, ll.c);
      this.a(csr.sd);
      this.a(csr.kM, ll.c);
      this.f(csr.j);
      this.f(csr.rG);
      this.f(csr.I);
      this.g(csr.J);
      this.g(csr.M);
      this.f(csr.K);
      this.e(csr.F);
      this.b(csr.sn, ll.e);
      this.a(csr.ij, ll.c, ll.d);
      this.a(csr.kx, ll.v, ll.w);
      this.a(csr.hf, ll.v, ll.w);
      this.a(csr.sj, ll.c, ll.d);
      this.a(csr.sk, ll.c, ll.d);
      this.a(csr.sl, ll.c, ll.d);
      this.c(csr.nT, ll.h);
      this.z();
      this.a(csr.pe, lj::A);
      this.a(csr.pf, lj::C);
      this.a(csr.kD, dfu.as, 0, 1, 2, 3);
      this.a(csr.gt, dfu.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csr.fq, dfu.as, 0, 1, 1, 2);
      this.a(csr.gu, dfu.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(csr.cB, dfu.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(csr.kA, ks.e.b, dfu.aq, 0, 1);
      this.i();
      this.h();
      this.a(lg.a("decorated_pot"), csr.iA).b(csr.so);
      this.a(lg.a("banner"), csr.n)
         .a(li.bD, csr.iJ, csr.iK, csr.iL, csr.iM, csr.iN, csr.iO, csr.iP, csr.iQ, csr.iR, csr.iS, csr.iT, csr.iU, csr.iV, csr.iW, csr.iX, csr.iY)
         .b(csr.iZ, csr.ja, csr.jb, csr.jc, csr.jd, csr.je, csr.jf, csr.jg, csr.jh, csr.ji, csr.jj, csr.jk, csr.jl, csr.jm, csr.jn, csr.jo);
      this.a(lg.a("bed"), csr.n)
         .b(csr.aZ, csr.ba, csr.bb, csr.bc, csr.bd, csr.be, csr.bf, csr.bg, csr.bh, csr.bi, csr.bj, csr.bk, csr.bl, csr.bm, csr.bn, csr.bo);
      this.j(csr.aZ, csr.bA);
      this.j(csr.ba, csr.bB);
      this.j(csr.bb, csr.bC);
      this.j(csr.bc, csr.bD);
      this.j(csr.bd, csr.bE);
      this.j(csr.be, csr.bF);
      this.j(csr.bf, csr.bG);
      this.j(csr.bg, csr.bH);
      this.j(csr.bh, csr.bI);
      this.j(csr.bi, csr.bJ);
      this.j(csr.bj, csr.bK);
      this.j(csr.bk, csr.bL);
      this.j(csr.bl, csr.bM);
      this.j(csr.bm, csr.bN);
      this.j(csr.bn, csr.bO);
      this.j(csr.bo, csr.bP);
      this.a(lg.a("skull"), csr.dX)
         .a(li.bE, csr.gM, csr.gK, csr.gI, csr.gE, csr.gG, csr.gQ)
         .a(csr.gO)
         .b(csr.gN, csr.gP, csr.gL, csr.gJ, csr.gF, csr.gH, csr.gR);
      this.F(csr.kP);
      this.F(csr.kQ);
      this.F(csr.kR);
      this.F(csr.kS);
      this.F(csr.kT);
      this.F(csr.kU);
      this.F(csr.kV);
      this.F(csr.kW);
      this.F(csr.kX);
      this.F(csr.kY);
      this.F(csr.kZ);
      this.F(csr.la);
      this.F(csr.lb);
      this.F(csr.lc);
      this.F(csr.ld);
      this.F(csr.le);
      this.F(csr.lf);
      this.b(csr.mX, ll.p);
      this.c(csr.mX);
      this.a(lg.a("chest"), csr.n).b(csr.cv, csr.gV);
      this.a(lg.a("ender_chest"), csr.co).b(csr.fG);
      this.d(csr.fx, csr.co).a(csr.fx, csr.kF);
      this.a(csr.aM);
      this.a(csr.aN);
      this.a(csr.lw);
      this.a(csr.lx);
      this.a(csr.ly);
      this.a(csr.lz);
      this.a(csr.lA);
      this.a(csr.lB);
      this.a(csr.lC);
      this.a(csr.lD);
      this.a(csr.lE);
      this.a(csr.lF);
      this.a(csr.lG);
      this.a(csr.lH);
      this.a(csr.lI);
      this.a(csr.lJ);
      this.a(csr.lK);
      this.a(csr.lL);
      this.a(ll.a, csr.lM, csr.lN, csr.lO, csr.lP, csr.lQ, csr.lR, csr.lS, csr.lT, csr.lU, csr.lV, csr.lW, csr.lX, csr.lY, csr.lZ, csr.ma, csr.mb);
      this.a(csr.iA);
      this.a(csr.hj);
      this.a(csr.hk);
      this.a(csr.hl);
      this.a(csr.hm);
      this.a(csr.hn);
      this.a(csr.ho);
      this.a(csr.hp);
      this.a(csr.hq);
      this.a(csr.hr);
      this.a(csr.hs);
      this.a(csr.ht);
      this.a(csr.hu);
      this.a(csr.hv);
      this.a(csr.hw);
      this.a(csr.hx);
      this.a(csr.hy);
      this.a(csr.qB);
      this.f(csr.aQ, csr.eZ);
      this.f(csr.ej, csr.hz);
      this.f(csr.ek, csr.hA);
      this.f(csr.el, csr.hB);
      this.f(csr.em, csr.hC);
      this.f(csr.en, csr.hD);
      this.f(csr.eo, csr.hE);
      this.f(csr.ep, csr.hF);
      this.f(csr.eq, csr.hG);
      this.f(csr.er, csr.hH);
      this.f(csr.es, csr.hI);
      this.f(csr.et, csr.hJ);
      this.f(csr.eu, csr.hK);
      this.f(csr.ev, csr.hL);
      this.f(csr.ew, csr.hM);
      this.f(csr.ex, csr.hN);
      this.f(csr.ey, csr.hO);
      this.b(ll.n, csr.lg, csr.lh, csr.li, csr.lj, csr.lk, csr.ll, csr.lm, csr.ln, csr.lo, csr.lp, csr.lq, csr.lr, csr.ls, csr.lt, csr.lu, csr.lv);
      this.e(csr.bA, csr.ik);
      this.e(csr.bB, csr.il);
      this.e(csr.bC, csr.im);
      this.e(csr.bD, csr.in);
      this.e(csr.bE, csr.io);
      this.e(csr.bF, csr.ip);
      this.e(csr.bG, csr.iq);
      this.e(csr.bH, csr.ir);
      this.e(csr.bI, csr.is);
      this.e(csr.bJ, csr.it);
      this.e(csr.bK, csr.iu);
      this.e(csr.bL, csr.iv);
      this.e(csr.bM, csr.iw);
      this.e(csr.bN, csr.ix);
      this.e(csr.bO, csr.iy);
      this.e(csr.bP, csr.iz);
      this.a(csr.rH);
      this.a(csr.eM);
      this.a(csr.bu, csr.gb, ks.e.a);
      this.a(csr.bR, csr.gc, ks.e.b);
      this.a(csr.bT, csr.gd, ks.e.b);
      this.a(csr.bU, csr.ge, ks.e.b);
      this.a(csr.bV, csr.gf, ks.e.b);
      this.a(csr.bW, csr.gg, ks.e.b);
      this.a(csr.bX, csr.gh, ks.e.b);
      this.a(csr.bY, csr.gi, ks.e.b);
      this.a(csr.bZ, csr.gj, ks.e.b);
      this.a(csr.ca, csr.gk, ks.e.b);
      this.a(csr.cb, csr.gl, ks.e.b);
      this.a(csr.cc, csr.gm, ks.e.b);
      this.a(csr.ce, csr.gn, ks.e.b);
      this.a(csr.cd, csr.go, ks.e.b);
      this.a(csr.cg, csr.gp, ks.e.b);
      this.a(csr.cf, csr.gq, ks.e.b);
      this.a(csr.bv, csr.gr, ks.e.b);
      this.a(csr.bS, csr.fS, ks.e.b);
      this.G();
      this.u(csr.eU);
      this.u(csr.eV);
      this.u(csr.eW);
      this.a(csr.bt, ks.e.a);
      this.b(csr.dS, ks.e.a);
      this.a(cjd.dn);
      this.b(csr.mc, csr.md, ks.e.b);
      this.a(cjd.do);
      this.c(csr.md);
      this.b(csr.rF, ks.e.b);
      this.c(csr.rF);
      this.c(csr.rv);
      this.b(csr.oz, csr.oA, ks.e.b);
      this.b(csr.oB, csr.oC, ks.e.b);
      this.a(csr.oz, "_plant");
      this.c(csr.oA);
      this.a(csr.oB, "_plant");
      this.c(csr.oC);
      this.a(csr.mY, ks.e.a, lj.c(lj.a(csr.mZ, "_stage0")));
      this.m();
      this.a(csr.bs, ks.e.b);
      this.c(csr.iE, ks.e.b);
      this.c(csr.iF, ks.e.b);
      this.c(csr.iG, ks.e.b);
      this.c(csr.iH, ks.e.a);
      this.c(csr.iI, ks.e.a);
      this.j();
      this.k();
      this.l();
      this.a(csr.mw, csr.mr, csr.mm, csr.mh, csr.mG, csr.mB, csr.mQ, csr.mL);
      this.a(csr.mx, csr.ms, csr.mn, csr.mi, csr.mH, csr.mC, csr.mR, csr.mM);
      this.a(csr.my, csr.mt, csr.mo, csr.mj, csr.mI, csr.mD, csr.mS, csr.mN);
      this.a(csr.mz, csr.mu, csr.mp, csr.mk, csr.mJ, csr.mE, csr.mT, csr.mO);
      this.a(csr.mA, csr.mv, csr.mq, csr.ml, csr.mK, csr.mF, csr.mU, csr.mP);
      this.c(csr.fe, csr.fc);
      this.c(csr.fd, csr.fb);
      this.l(csr.ab).c(csr.ab).a(csr.av);
      this.l(csr.am).c(csr.am).a(csr.aD);
      this.a(csr.am, csr.dj, csr.ds);
      this.b(csr.aL, ll.r);
      this.l(csr.Y).c(csr.Y).a(csr.as);
      this.l(csr.ai).c(csr.ai).a(csr.aA);
      this.a(csr.ai, csr.dd, csr.do);
      this.a(csr.B, csr.fX, ks.e.b);
      this.b(csr.aI, ll.r);
      this.l(csr.Z).d(csr.Z).a(csr.at);
      this.l(csr.aj).d(csr.aj).a(csr.aB);
      this.a(csr.aj, csr.de, csr.dp);
      this.a(csr.C, csr.fY, ks.e.b);
      this.b(csr.aJ, ll.r);
      this.l(csr.W).c(csr.W).a(csr.aq);
      this.l(csr.ag).c(csr.ag).a(csr.ay);
      this.a(csr.ag, csr.dc, csr.dn);
      this.a(csr.z, csr.fV, ks.e.b);
      this.b(csr.aG, ll.r);
      this.l(csr.U).c(csr.U).a(csr.ao);
      this.l(csr.al).c(csr.al).a(csr.aw);
      this.a(csr.al, csr.da, csr.dl);
      this.a(csr.x, csr.fT, ks.e.b);
      this.b(csr.aE, ll.r);
      this.l(csr.V).c(csr.V).a(csr.ap);
      this.l(csr.af).c(csr.af).a(csr.ax);
      this.a(csr.af, csr.db, csr.dm);
      this.a(csr.y, csr.fU, ks.e.b);
      this.b(csr.aF, ll.r);
      this.l(csr.aa).c(csr.aa).a(csr.au);
      this.l(csr.ak).c(csr.ak).a(csr.aC);
      this.a(csr.ak, csr.dg, csr.dr);
      this.a(csr.D, csr.fZ, ks.e.b);
      this.b(csr.aK, ll.r);
      this.l(csr.X).c(csr.X).a(csr.ar);
      this.l(csr.ah).c(csr.ah).a(csr.az);
      this.a(csr.ah, csr.df, csr.dq);
      this.a(csr.A, csr.fW, ks.e.b);
      this.b(csr.aH, ll.r);
      this.l(csr.os).b(csr.os).a(csr.ou);
      this.l(csr.ot).b(csr.ot).a(csr.ov);
      this.a(csr.ot, csr.dh, csr.dt);
      this.a(csr.ox, csr.pm, ks.e.b);
      this.k(csr.oD, csr.po);
      this.l(csr.oj).b(csr.oj).a(csr.ol);
      this.l(csr.ok).b(csr.ok).a(csr.om);
      this.a(csr.ok, csr.di, csr.du);
      this.a(csr.oo, csr.pn, ks.e.b);
      this.k(csr.oq, csr.pp);
      this.l(csr.ae).d(csr.ae);
      this.l(csr.an).d(csr.an);
      this.a(csr.v, csr.dk, csr.dv);
      this.b(csr.or, ks.e.b);
      this.a(cjd.dk);
      this.i(csr.dy);
      this.k(csr.hY);
      this.u();
      this.n(csr.cP);
      this.o(csr.bp);
      this.o(csr.bq);
      this.o(csr.hh);
      this.t();
      this.q(csr.fN);
      this.q(csr.kG);
      this.q(csr.kH);
      this.r(csr.gS);
      this.r(csr.gT);
      this.r(csr.gU);
      this.o();
      this.p();
      this.d(csr.cD, ll.g);
      this.d(csr.nW, ll.g);
      this.d(csr.nV, ll.h);
      this.s();
      this.ay();
      this.at();
      this.h(csr.eL, csr.eT);
      this.h(csr.m, csr.eP);
      this.h(csr.eK, csr.eS);
      this.h(csr.eJ, csr.eR);
      this.aw();
      this.h(csr.eI, csr.eQ);
      this.ax();
      ckf.h().forEach($$0 -> this.a($$0, lg.b("template_spawn_egg")));
   }

   private void aB() {
      this.c(csr.hX);
      kz.a<Integer> $$0 = kz.a(dfu.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aeu $$3 = lj.a(cjd.hg, $$2);
         $$0.a($$1, lb.a().a(lc.c, li.Y.a(csr.hX, $$2, lj.h($$3), this.c)));
         li.bv.a(lg.a(cjd.hg, $$2), lj.k($$3), this.c);
      }

      this.b.accept(ky.a(csr.hX).a($$0));
   }

   private void l(csq $$0, csq $$1) {
      this.a($$0.k());
      lj $$2 = lj.b(lj.G($$0));
      lj $$3 = lj.b(lj.a($$0, "_lit"));
      aeu $$4 = li.bF.a($$0, "_one_candle", $$2, this.c);
      aeu $$5 = li.bG.a($$0, "_two_candles", $$2, this.c);
      aeu $$6 = li.bH.a($$0, "_three_candles", $$2, this.c);
      aeu $$7 = li.bI.a($$0, "_four_candles", $$2, this.c);
      aeu $$8 = li.bF.a($$0, "_one_candle_lit", $$3, this.c);
      aeu $$9 = li.bG.a($$0, "_two_candles_lit", $$3, this.c);
      aeu $$10 = li.bH.a($$0, "_three_candles_lit", $$3, this.c);
      aeu $$11 = li.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            ky.a($$0)
               .a(
                  kz.a(dfu.az, dfu.r)
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
      aeu $$12 = li.bJ.a($$1, lj.a($$0, false), this.c);
      aeu $$13 = li.bJ.a($$1, "_lit", lj.a($$0, true), this.c);
      this.b.accept(ky.a($$1).a(a(dfu.r, $$13, $$12)));
   }

   class a {
      private final aeu b;

      public a(aeu $$0, csq $$1) {
         this.b = li.Y.a($$0, lj.u($$1), ks.this.c);
      }

      public ks.a a(csq... $$0) {
         for (csq $$1 : $$0) {
            ks.this.b.accept(ks.c($$1, this.b));
         }

         return this;
      }

      public ks.a b(csq... $$0) {
         for (csq $$1 : $$0) {
            ks.this.c($$1);
         }

         return this.a($$0);
      }

      public ks.a a(lh $$0, csq... $$1) {
         for (csq $$2 : $$1) {
            $$0.a(lg.a($$2.k()), lj.u($$2), ks.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final lj b;
      private final Map<lh, aeu> c = Maps.newHashMap();
      @Nullable
      private jh d;
      @Nullable
      private aeu e;

      public b(lj $$0) {
         this.b = $$0;
      }

      public ks.b a(csq $$0, lh $$1) {
         this.e = $$1.a($$0, this.b, ks.this.c);
         if (ks.this.f.containsKey($$0)) {
            ks.this.b.accept(ks.this.f.get($$0).create($$0, this.e, this.b, ks.this.c));
         } else {
            ks.this.b.accept(ks.c($$0, this.e));
         }

         return this;
      }

      public ks.b a(csq... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (csq $$1 : $$0) {
               ks.this.b.accept(ks.c($$1, this.e));
               ks.this.a($$1, this.e);
            }

            return this;
         }
      }

      public ks.b a(csq $$0) {
         aeu $$1 = li.q.a($$0, this.b, ks.this.c);
         aeu $$2 = li.r.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.b($$0, $$1, $$2));
         aeu $$3 = li.s.a($$0, this.b, ks.this.c);
         ks.this.a($$0, $$3);
         return this;
      }

      public ks.b b(csq $$0) {
         aeu $$1 = li.K.a($$0, this.b, ks.this.c);
         aeu $$2 = li.L.a($$0, this.b, ks.this.c);
         aeu $$3 = li.M.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$1, $$2, $$3));
         aeu $$4 = li.N.a($$0, this.b, ks.this.c);
         ks.this.a($$0, $$4);
         return this;
      }

      public ks.b c(csq $$0) {
         lj $$1 = lj.p($$0);
         aeu $$2 = li.B.a($$0, $$1, ks.this.c);
         aeu $$3 = li.C.a($$0, $$1, ks.this.c);
         aeu $$4 = li.D.a($$0, $$1, ks.this.c);
         aeu $$5 = li.E.a($$0, $$1, ks.this.c);
         aeu $$6 = li.F.a($$0, $$1, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$2, $$3, $$4, $$5, $$6));
         aeu $$7 = li.G.a($$0, $$1, ks.this.c);
         ks.this.a($$0, $$7);
         return this;
      }

      public ks.b d(csq $$0) {
         aeu $$1 = li.H.a($$0, this.b, ks.this.c);
         aeu $$2 = li.I.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.c($$0, $$1, $$2));
         aeu $$3 = li.J.a($$0, this.b, ks.this.c);
         ks.this.a($$0, $$3);
         return this;
      }

      public ks.b e(csq $$0) {
         lj $$1 = lj.p($$0);
         aeu $$2 = li.P.a($$0, $$1, ks.this.c);
         aeu $$3 = li.O.a($$0, $$1, ks.this.c);
         aeu $$4 = li.R.a($$0, $$1, ks.this.c);
         aeu $$5 = li.Q.a($$0, $$1, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ks.b f(csq $$0) {
         aeu $$1 = li.T.a($$0, this.b, ks.this.c);
         aeu $$2 = li.S.a($$0, this.b, ks.this.c);
         aeu $$3 = li.V.a($$0, this.b, ks.this.c);
         aeu $$4 = li.U.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ks.b g(csq $$0) {
         aeu $$1 = li.W.a($$0, this.b, ks.this.c);
         aeu $$2 = li.X.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.e($$0, $$1, $$2));
         return this;
      }

      public ks.b h(csq $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            csq $$1 = this.d.b().get(jh.b.r);
            aeu $$2 = li.Y.a($$0, this.b, ks.this.c);
            ks.this.b.accept(ks.c($$0, $$2));
            ks.this.b.accept(ks.c($$1, $$2));
            ks.this.a($$0.k());
            ks.this.c($$1);
            return this;
         }
      }

      public ks.b i(csq $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aeu $$1 = this.a(li.Z, $$0);
            aeu $$2 = this.a(li.aa, $$0);
            ks.this.b.accept(ks.e($$0, $$1, $$2, this.e));
            ks.this.a($$0, $$1);
            return this;
         }
      }

      public ks.b j(csq $$0) {
         aeu $$1 = this.a(li.ad, $$0);
         aeu $$2 = this.a(li.ac, $$0);
         aeu $$3 = this.a(li.ae, $$0);
         ks.this.b.accept(ks.b($$0, $$1, $$2, $$3));
         ks.this.a($$0, $$2);
         return this;
      }

      private ks.b k(csq $$0) {
         ll $$1 = ks.this.g.getOrDefault($$0, ll.a.get($$0));
         ks.this.b.accept(ks.c($$0, $$1.a($$0, ks.this.c)));
         return this;
      }

      private ks.b l(csq $$0) {
         ks.this.i($$0);
         return this;
      }

      private void m(csq $$0) {
         if (ks.this.e.contains($$0)) {
            ks.this.k($$0);
         } else {
            ks.this.j($$0);
         }
      }

      private aeu a(lh $$0, csq $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ks.this.c));
      }

      public ks.b a(jh $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<ks.b, csq> $$2 = ks.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      kv create(csq var1, aeu var2, lj var3, BiConsumer<aeu, Supplier<JsonElement>> var4);
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

      public ks.f a(csq $$0) {
         lj $$1 = this.b.c(lk.d, this.b.a(lk.i));
         aeu $$2 = li.i.a($$0, $$1, ks.this.c);
         ks.this.b.accept(ks.d($$0, $$2));
         return this;
      }

      public ks.f b(csq $$0) {
         aeu $$1 = li.i.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.d($$0, $$1));
         return this;
      }

      public ks.f c(csq $$0) {
         aeu $$1 = li.i.a($$0, this.b, ks.this.c);
         aeu $$2 = li.j.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.d($$0, $$1, $$2));
         return this;
      }

      public ks.f d(csq $$0) {
         ks.this.b.accept(ks.a($$0, this.b, ks.this.c));
         return this;
      }
   }
}
