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
   final BiConsumer<aez, Supplier<JsonElement>> c;
   private final Consumer<cjg> d;
   final List<ctc> e = ImmutableList.of(cte.ey, cte.eE, cte.hY);
   final Map<ctc, ks.c> f = ImmutableMap.builder().put(cte.b, ks::a).put(cte.rI, ks::c).put(cte.eM, ks::b).build();
   final Map<ctc, ll> g = ImmutableMap.builder()
      .put(cte.aV, ll.x.get(cte.aV))
      .put(cte.jp, ll.x.get(cte.jp))
      .put(cte.jS, ll.a(lj.a(cte.aV, "_top")))
      .put(cte.jU, ll.a(lj.a(cte.jp, "_top")))
      .put(cte.aX, ll.c.get(cte.aV).a($$0x -> $$0x.a(lk.i, lj.G(cte.aX))))
      .put(cte.jr, ll.c.get(cte.jp).a($$0x -> $$0x.a(lk.i, lj.G(cte.jr))))
      .put(cte.hd, ll.c.get(cte.hd))
      .put(cte.jT, ll.a(lj.a(cte.hd, "_bottom")))
      .put(cte.pr, ll.y.get(cte.pr))
      .put(cte.rI, ll.y.get(cte.rI))
      .put(cte.he, ll.c.get(cte.he).a($$0x -> $$0x.a(lk.i, lj.G(cte.he))))
      .put(cte.aW, ll.c.get(cte.aW).a($$0x -> {
         $$0x.a(lk.d, lj.a(cte.aV, "_top"));
         $$0x.a(lk.i, lj.G(cte.aW));
      }))
      .put(cte.jq, ll.c.get(cte.jq).a($$0x -> {
         $$0x.a(lk.d, lj.a(cte.jp, "_top"));
         $$0x.a(lk.i, lj.G(cte.jq));
      }))
      .build();
   static final Map<jf.b, BiConsumer<ks.b, ctc>> h = ImmutableMap.builder()
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
   public static final List<Pair<dfu, Function<aez, lb>>> a = List.of(
      Pair.of(dft.L, (Function<aez, lb>)$$0 -> lb.a().a(lc.c, $$0)),
      Pair.of(dft.M, (Function<aez, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.b, lc.a.b).a(lc.d, true)),
      Pair.of(dft.N, (Function<aez, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.b, lc.a.c).a(lc.d, true)),
      Pair.of(dft.O, (Function<aez, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.b, lc.a.d).a(lc.d, true)),
      Pair.of(dft.J, (Function<aez, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.a, lc.a.d).a(lc.d, true)),
      Pair.of(dft.K, (Function<aez, lb>)$$0 -> lb.a().a(lc.c, $$0).a(lc.a, lc.a.b).a(lc.d, true))
   );
   private static final Map<ks.d, aez> i = new HashMap<>();

   private static kv a(ctc $$0, aez $$1, lj $$2, BiConsumer<aez, Supplier<JsonElement>> $$3) {
      aez $$4 = li.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static kv b(ctc $$0, aez $$1, lj $$2, BiConsumer<aez, Supplier<JsonElement>> $$3) {
      aez $$4 = li.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static kv c(ctc $$0, aez $$1, lj $$2, BiConsumer<aez, Supplier<JsonElement>> $$3) {
      aez $$4 = li.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ks(Consumer<kv> $$0, BiConsumer<aez, Supplier<JsonElement>> $$1, Consumer<cjg> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(ctc $$0) {
      this.d.accept($$0.k());
   }

   void a(ctc $$0, aez $$1) {
      this.c.accept(lg.a($$0.k()), new lf($$1));
   }

   private void a(cjg $$0, aez $$1) {
      this.c.accept(lg.a($$0), new lf($$1));
   }

   void a(cjg $$0) {
      li.bv.a(lg.a($$0), lj.b($$0), this.c);
   }

   private void d(ctc $$0) {
      cjg $$1 = $$0.k();
      if ($$1 != cjo.a) {
         li.bv.a(lg.a($$1), lj.F($$0), this.c);
      }
   }

   private void a(ctc $$0, String $$1) {
      cjg $$2 = $$0.k();
      li.bv.a(lg.a($$2), lj.k(lj.a($$0, $$1)), this.c);
   }

   private static kz b() {
      return kz.a(dft.R).a(ha.f, lb.a().a(lc.b, lc.a.b)).a(ha.d, lb.a().a(lc.b, lc.a.c)).a(ha.e, lb.a().a(lc.b, lc.a.d)).a(ha.c, lb.a());
   }

   private static kz c() {
      return kz.a(dft.R).a(ha.d, lb.a()).a(ha.e, lb.a().a(lc.b, lc.a.b)).a(ha.c, lb.a().a(lc.b, lc.a.c)).a(ha.f, lb.a().a(lc.b, lc.a.d));
   }

   private static kz d() {
      return kz.a(dft.R).a(ha.f, lb.a()).a(ha.d, lb.a().a(lc.b, lc.a.b)).a(ha.e, lb.a().a(lc.b, lc.a.c)).a(ha.c, lb.a().a(lc.b, lc.a.d));
   }

   private static kz e() {
      return kz.a(dft.P)
         .a(ha.a, lb.a().a(lc.a, lc.a.b))
         .a(ha.b, lb.a().a(lc.a, lc.a.d))
         .a(ha.c, lb.a())
         .a(ha.d, lb.a().a(lc.b, lc.a.c))
         .a(ha.e, lb.a().a(lc.b, lc.a.d))
         .a(ha.f, lb.a().a(lc.b, lc.a.b));
   }

   private static ky b(ctc $$0, aez $$1) {
      return ky.a($$0, a($$1));
   }

   private static lb[] a(aez $$0) {
      return new lb[]{lb.a().a(lc.c, $$0), lb.a().a(lc.c, $$0).a(lc.b, lc.a.b), lb.a().a(lc.c, $$0).a(lc.b, lc.a.c), lb.a().a(lc.c, $$0).a(lc.b, lc.a.d)};
   }

   private static ky a(ctc $$0, aez $$1, aez $$2) {
      return ky.a($$0, lb.a().a(lc.c, $$1), lb.a().a(lc.c, $$2), lb.a().a(lc.c, $$1).a(lc.b, lc.a.c), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c));
   }

   private static kz a(dfu $$0, aez $$1, aez $$2) {
      return kz.a($$0).a(true, lb.a().a(lc.c, $$1)).a(false, lb.a().a(lc.c, $$2));
   }

   private void e(ctc $$0) {
      aez $$1 = ll.a.create($$0, this.c);
      aez $$2 = ll.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(ctc $$0) {
      aez $$1 = ll.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(ctc $$0) {
      this.b.accept(ky.a($$0).a(kz.a(dft.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         aez $$3 = lj.a($$0, $$2);
         return lb.a().a(lc.c, li.c.a($$0, $$2, new lj().a(lk.a, $$3), this.c));
      })));
      this.a($$0, lj.a($$0, "_0"));
   }

   static kv b(ctc $$0, aez $$1, aez $$2) {
      return ky.a($$0)
         .a(kz.a(dft.w).a(false, lb.a().a(lc.c, $$1)).a(true, lb.a().a(lc.c, $$2)))
         .a(
            kz.a(dft.U, dft.R)
               .a(dfo.a, ha.f, lb.a().a(lc.b, lc.a.b))
               .a(dfo.a, ha.e, lb.a().a(lc.b, lc.a.d))
               .a(dfo.a, ha.d, lb.a().a(lc.b, lc.a.c))
               .a(dfo.a, ha.c, lb.a())
               .a(dfo.b, ha.f, lb.a().a(lc.b, lc.a.b).a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfo.b, ha.e, lb.a().a(lc.b, lc.a.d).a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfo.b, ha.d, lb.a().a(lc.b, lc.a.c).a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfo.b, ha.c, lb.a().a(lc.a, lc.a.b).a(lc.d, true))
               .a(dfo.c, ha.f, lb.a().a(lc.b, lc.a.d).a(lc.a, lc.a.c))
               .a(dfo.c, ha.e, lb.a().a(lc.b, lc.a.b).a(lc.a, lc.a.c))
               .a(dfo.c, ha.d, lb.a().a(lc.a, lc.a.c))
               .a(dfo.c, ha.c, lb.a().a(lc.b, lc.a.c).a(lc.a, lc.a.c))
         );
   }

   private static kz.d<ha, dfz, dfy, Boolean> a(kz.d<ha, dfz, dfy, Boolean> $$0, dfz $$1, aez $$2, aez $$3, aez $$4, aez $$5) {
      return $$0.a(ha.f, $$1, dfy.a, false, lb.a().a(lc.c, $$2))
         .a(ha.d, $$1, dfy.a, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
         .a(ha.e, $$1, dfy.a, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
         .a(ha.c, $$1, dfy.a, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
         .a(ha.f, $$1, dfy.b, false, lb.a().a(lc.c, $$4))
         .a(ha.d, $$1, dfy.b, false, lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
         .a(ha.e, $$1, dfy.b, false, lb.a().a(lc.c, $$4).a(lc.b, lc.a.c))
         .a(ha.c, $$1, dfy.b, false, lb.a().a(lc.c, $$4).a(lc.b, lc.a.d))
         .a(ha.f, $$1, dfy.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
         .a(ha.d, $$1, dfy.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
         .a(ha.e, $$1, dfy.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
         .a(ha.c, $$1, dfy.a, true, lb.a().a(lc.c, $$3))
         .a(ha.f, $$1, dfy.b, true, lb.a().a(lc.c, $$5).a(lc.b, lc.a.d))
         .a(ha.d, $$1, dfy.b, true, lb.a().a(lc.c, $$5))
         .a(ha.e, $$1, dfy.b, true, lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
         .a(ha.c, $$1, dfy.b, true, lb.a().a(lc.c, $$5).a(lc.b, lc.a.c));
   }

   private static kv a(ctc $$0, aez $$1, aez $$2, aez $$3, aez $$4, aez $$5, aez $$6, aez $$7, aez $$8) {
      return ky.a($$0).a(a(a(kz.a(dft.R, dft.ae, dft.be, dft.u), dfz.b, $$1, $$2, $$3, $$4), dfz.a, $$5, $$6, $$7, $$8));
   }

   static kv a(ctc $$0, aez $$1, aez $$2, aez $$3, aez $$4, aez $$5) {
      return kx.a($$0)
         .a(lb.a().a(lc.c, $$1))
         .a(kw.a().a(dft.L, true), lb.a().a(lc.c, $$2).a(lc.d, false))
         .a(kw.a().a(dft.M, true), lb.a().a(lc.c, $$3).a(lc.d, false))
         .a(kw.a().a(dft.N, true), lb.a().a(lc.c, $$4).a(lc.d, false))
         .a(kw.a().a(dft.O, true), lb.a().a(lc.c, $$5).a(lc.d, false));
   }

   static kv c(ctc $$0, aez $$1, aez $$2) {
      return kx.a($$0)
         .a(lb.a().a(lc.c, $$1))
         .a(kw.a().a(dft.L, true), lb.a().a(lc.c, $$2).a(lc.d, true))
         .a(kw.a().a(dft.M, true), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true))
         .a(kw.a().a(dft.N, true), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true))
         .a(kw.a().a(dft.O, true), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true));
   }

   static kv a(ctc $$0, aez $$1, aez $$2, aez $$3) {
      return kx.a($$0)
         .a(kw.a().a(dft.J, true), lb.a().a(lc.c, $$1))
         .a(kw.a().a(dft.X, dgp.b), lb.a().a(lc.c, $$2).a(lc.d, true))
         .a(kw.a().a(dft.W, dgp.b), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true))
         .a(kw.a().a(dft.Y, dgp.b), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true))
         .a(kw.a().a(dft.Z, dgp.b), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true))
         .a(kw.a().a(dft.X, dgp.c), lb.a().a(lc.c, $$3).a(lc.d, true))
         .a(kw.a().a(dft.W, dgp.c), lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true))
         .a(kw.a().a(dft.Y, dgp.c), lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true))
         .a(kw.a().a(dft.Z, dgp.c), lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true));
   }

   static kv a(ctc $$0, aez $$1, aez $$2, aez $$3, aez $$4, boolean $$5) {
      return ky.a($$0, lb.a().a(lc.d, $$5))
         .a(c())
         .a(
            kz.a(dft.q, dft.u)
               .a(false, false, lb.a().a(lc.c, $$2))
               .a(true, false, lb.a().a(lc.c, $$4))
               .a(false, true, lb.a().a(lc.c, $$1))
               .a(true, true, lb.a().a(lc.c, $$3))
         );
   }

   static kv b(ctc $$0, aez $$1, aez $$2, aez $$3) {
      return ky.a($$0)
         .a(
            kz.a(dft.R, dft.af, dft.bi)
               .a(ha.f, dgc.b, dgm.a, lb.a().a(lc.c, $$2))
               .a(ha.e, dgc.b, dgm.a, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgc.b, dgm.a, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgc.b, dgm.a, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgc.b, dgm.e, lb.a().a(lc.c, $$3))
               .a(ha.e, dgc.b, dgm.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgc.b, dgm.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgc.b, dgm.e, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgc.b, dgm.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.e, dgc.b, dgm.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.d, dgc.b, dgm.d, lb.a().a(lc.c, $$3))
               .a(ha.c, dgc.b, dgm.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.f, dgc.b, dgm.c, lb.a().a(lc.c, $$1))
               .a(ha.e, dgc.b, dgm.c, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgc.b, dgm.c, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgc.b, dgm.c, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgc.b, dgm.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.e, dgc.b, dgm.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.d, dgc.b, dgm.b, lb.a().a(lc.c, $$1))
               .a(ha.c, dgc.b, dgm.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.f, dgc.a, dgm.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.e, dgc.a, dgm.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgc.a, dgm.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgc.a, dgm.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgc.a, dgm.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.e, dgc.a, dgm.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.d, dgc.a, dgm.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.c, dgc.a, dgm.e, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.f, dgc.a, dgm.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.e, dgc.a, dgm.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgc.a, dgm.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgc.a, dgm.d, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.f, dgc.a, dgm.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.e, dgc.a, dgm.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
               .a(ha.d, dgc.a, dgm.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.c, dgc.a, dgm.c, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.f, dgc.a, dgm.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.d, true))
               .a(ha.e, dgc.a, dgm.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.c).a(lc.d, true))
               .a(ha.d, dgc.a, dgm.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.b).a(lc.d, true))
               .a(ha.c, dgc.a, dgm.b, lb.a().a(lc.c, $$1).a(lc.a, lc.a.c).a(lc.b, lc.a.d).a(lc.d, true))
         );
   }

   private static kv c(ctc $$0, aez $$1, aez $$2, aez $$3) {
      return ky.a($$0)
         .a(
            kz.a(dft.R, dft.af, dft.u)
               .a(ha.c, dgc.b, false, lb.a().a(lc.c, $$2))
               .a(ha.d, dgc.b, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
               .a(ha.f, dgc.b, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
               .a(ha.e, dgc.b, false, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
               .a(ha.c, dgc.a, false, lb.a().a(lc.c, $$1))
               .a(ha.d, dgc.a, false, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
               .a(ha.f, dgc.a, false, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
               .a(ha.e, dgc.a, false, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
               .a(ha.c, dgc.b, true, lb.a().a(lc.c, $$3))
               .a(ha.d, dgc.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(ha.f, dgc.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(ha.e, dgc.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               .a(ha.c, dgc.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.c))
               .a(ha.d, dgc.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.a))
               .a(ha.f, dgc.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.d))
               .a(ha.e, dgc.a, true, lb.a().a(lc.c, $$3).a(lc.a, lc.a.c).a(lc.b, lc.a.b))
         );
   }

   private static kv d(ctc $$0, aez $$1, aez $$2, aez $$3) {
      return ky.a($$0)
         .a(
            kz.a(dft.R, dft.af, dft.u)
               .a(ha.c, dgc.b, false, lb.a().a(lc.c, $$2))
               .a(ha.d, dgc.b, false, lb.a().a(lc.c, $$2))
               .a(ha.f, dgc.b, false, lb.a().a(lc.c, $$2))
               .a(ha.e, dgc.b, false, lb.a().a(lc.c, $$2))
               .a(ha.c, dgc.a, false, lb.a().a(lc.c, $$1))
               .a(ha.d, dgc.a, false, lb.a().a(lc.c, $$1))
               .a(ha.f, dgc.a, false, lb.a().a(lc.c, $$1))
               .a(ha.e, dgc.a, false, lb.a().a(lc.c, $$1))
               .a(ha.c, dgc.b, true, lb.a().a(lc.c, $$3))
               .a(ha.d, dgc.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(ha.f, dgc.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(ha.e, dgc.b, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               .a(ha.c, dgc.a, true, lb.a().a(lc.c, $$3))
               .a(ha.d, dgc.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(ha.f, dgc.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(ha.e, dgc.a, true, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
         );
   }

   static ky c(ctc $$0, aez $$1) {
      return ky.a($$0, lb.a().a(lc.c, $$1));
   }

   private static kz f() {
      return kz.a(dft.I).a(ha.a.b, lb.a()).a(ha.a.c, lb.a().a(lc.a, lc.a.b)).a(ha.a.a, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b));
   }

   static kv a(ctc $$0, lj $$1, BiConsumer<aez, Supplier<JsonElement>> $$2) {
      aez $$3 = li.f.a($$0, $$1, $$2);
      aez $$4 = li.g.a($$0, $$1, $$2);
      aez $$5 = li.h.a($$0, $$1, $$2);
      aez $$6 = li.i.a($$0, $$1, $$2);
      return ky.a($$0, lb.a().a(lc.c, $$6)).a(kz.a(dft.I).a(ha.a.a, lb.a().a(lc.c, $$3)).a(ha.a.b, lb.a().a(lc.c, $$4)).a(ha.a.c, lb.a().a(lc.c, $$5)));
   }

   static kv d(ctc $$0, aez $$1) {
      return ky.a($$0, lb.a().a(lc.c, $$1)).a(f());
   }

   private void e(ctc $$0, aez $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(ctc $$0, ll.a $$1) {
      aez $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(ctc $$0, ll.a $$1) {
      aez $$2 = $$1.create($$0, this.c);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, $$2)).a(b()));
   }

   static kv d(ctc $$0, aez $$1, aez $$2) {
      return ky.a($$0)
         .a(
            kz.a(dft.I)
               .a(ha.a.b, lb.a().a(lc.c, $$1))
               .a(ha.a.c, lb.a().a(lc.c, $$2).a(lc.a, lc.a.b))
               .a(ha.a.a, lb.a().a(lc.c, $$2).a(lc.a, lc.a.b).a(lc.b, lc.a.b))
         );
   }

   private void a(ctc $$0, ll.a $$1, ll.a $$2) {
      aez $$3 = $$1.create($$0, this.c);
      aez $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private aez a(ctc $$0, String $$1, lh $$2, Function<aez, lj> $$3) {
      return $$2.a($$0, $$1, $$3.apply(lj.a($$0, $$1)), this.c);
   }

   static kv e(ctc $$0, aez $$1, aez $$2) {
      return ky.a($$0).a(a(dft.w, $$2, $$1));
   }

   static kv e(ctc $$0, aez $$1, aez $$2, aez $$3) {
      return ky.a($$0).a(kz.a(dft.bh).a(dgl.b, lb.a().a(lc.c, $$1)).a(dgl.a, lb.a().a(lc.c, $$2)).a(dgl.c, lb.a().a(lc.c, $$3)));
   }

   public void a(ctc $$0) {
      this.b($$0, ll.a);
   }

   public void b(ctc $$0, ll.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(ctc $$0, lj $$1, lh $$2) {
      aez $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ks.b h(ctc $$0) {
      ll $$1 = this.g.getOrDefault($$0, ll.a.get($$0));
      return new ks.b($$1.b()).a($$0, $$1.a());
   }

   public void a(ctc $$0, ctc $$1, ctc $$2) {
      lj $$3 = lj.u($$0);
      aez $$4 = li.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(ctc $$0) {
      lj $$1 = lj.t($$0);
      aez $$2 = li.t.a($$0, $$1, this.c);
      aez $$3 = li.u.a($$0, $$1, this.c);
      aez $$4 = li.v.a($$0, $$1, this.c);
      aez $$5 = li.w.a($$0, $$1, this.c);
      aez $$6 = li.x.a($$0, $$1, this.c);
      aez $$7 = li.y.a($$0, $$1, this.c);
      aez $$8 = li.z.a($$0, $$1, this.c);
      aez $$9 = li.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(ctc $$0) {
      lj $$1 = lj.b($$0);
      aez $$2 = li.ai.a($$0, $$1, this.c);
      aez $$3 = li.aj.a($$0, $$1, this.c);
      aez $$4 = li.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(ctc $$0) {
      lj $$1 = lj.b($$0);
      aez $$2 = li.af.a($$0, $$1, this.c);
      aez $$3 = li.ag.a($$0, $$1, this.c);
      aez $$4 = li.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(cte.rC);
      aez $$0 = lg.a(cte.rC);
      aez $$1 = lg.a(cte.rC, "_partial_tilt");
      aez $$2 = lg.a(cte.rC, "_full_tilt");
      this.b
         .accept(
            ky.a(cte.rC)
               .a(b())
               .a(kz.a(dft.bl).a(dgo.a, lb.a().a(lc.c, $$0)).a(dgo.b, lb.a().a(lc.c, $$0)).a(dgo.c, lb.a().a(lc.c, $$1)).a(dgo.d, lb.a().a(lc.c, $$2)))
         );
   }

   private ks.f l(ctc $$0) {
      return new ks.f(lj.n($$0));
   }

   private void m(ctc $$0) {
      this.a($$0, $$0);
   }

   private void a(ctc $$0, ctc $$1) {
      this.b.accept(c($$0, lg.a($$1)));
   }

   private void a(ctc $$0, ks.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(ctc $$0, ks.e $$1, lj $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(ctc $$0, ks.e $$1) {
      lj $$2 = lj.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(ctc $$0, ks.e $$1, lj $$2) {
      aez $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(ctc $$0, ks.e $$1, dgg<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         kz $$4 = kz.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            lj $$5 = lj.c(lj.a($$0, $$4x));
            aez $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return lb.a().a(lc.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(ky.a($$0).a($$4));
      }
   }

   private void a(ctc $$0, ctc $$1, ks.e $$2) {
      this.a($$0, $$2);
      lj $$3 = lj.d($$0);
      aez $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(ctc $$0, ctc $$1) {
      ll $$2 = ll.o.get($$0);
      aez $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      aez $$4 = li.aA.a($$1, $$2.b(), this.c);
      this.b.accept(ky.a($$1, lb.a().a(lc.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(ctc $$0, ctc $$1) {
      this.a($$0.k());
      lj $$2 = lj.h($$0);
      lj $$3 = lj.a($$0, $$1);
      aez $$4 = li.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            ky.a($$1, lb.a().a(lc.c, $$4))
               .a(kz.a(dft.R).a(ha.e, lb.a()).a(ha.d, lb.a().a(lc.b, lc.a.d)).a(ha.c, lb.a().a(lc.b, lc.a.b)).a(ha.f, lb.a().a(lc.b, lc.a.c)))
         );
      this.b.accept(ky.a($$0).a(kz.a(dft.av).a($$2x -> lb.a().a(lc.c, li.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      ctc $$0 = cte.kC;
      this.a($$0.k());
      aez $$1 = lg.a($$0, "_top");
      aez $$2 = lg.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      ctc $$0 = cte.kB;
      this.a($$0.k());
      kz $$1 = kz.a(cyp.d, dft.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> lb.a().a(lc.c, lg.a($$0, "_top_stage_" + $$1x));
            case b -> lb.a().a(lc.c, lg.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(ky.a($$0).a($$1));
   }

   private void a(ctc $$0, ctc $$1, ctc $$2, ctc $$3, ctc $$4, ctc $$5, ctc $$6, ctc $$7) {
      this.a($$0, ks.e.b);
      this.a($$1, ks.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(ctc $$0, ks.e $$1) {
      this.a($$0, "_top");
      aez $$2 = this.a($$0, "_top", $$1.a(), lj::c);
      aez $$3 = this.a($$0, "_bottom", $$1.a(), lj::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cte.iD, "_front");
      aez $$0 = lg.a(cte.iD, "_top");
      aez $$1 = this.a(cte.iD, "_bottom", ks.e.b.a(), lj::c);
      this.f(cte.iD, $$0, $$1);
   }

   private void k() {
      aez $$0 = this.a(cte.bx, "_top", li.bi, lj::a);
      aez $$1 = this.a(cte.bx, "_bottom", li.bi, lj::a);
      this.f(cte.bx, $$0, $$1);
   }

   private void l() {
      this.c(cte.rE);
      aez $$0 = lg.a(cte.rE, "_top");
      aez $$1 = lg.a(cte.rE, "_bottom");
      this.b.accept(ky.a(cte.rE).a(b()).a(kz.a(dft.ae).a(dfz.b, lb.a().a(lc.c, $$1)).a(dfz.a, lb.a().a(lc.c, $$0))));
   }

   private void f(ctc $$0, aez $$1, aez $$2) {
      this.b.accept(ky.a($$0).a(kz.a(dft.ae).a(dfz.b, lb.a().a(lc.c, $$2)).a(dfz.a, lb.a().a(lc.c, $$1))));
   }

   private void n(ctc $$0) {
      lj $$1 = lj.e($$0);
      lj $$2 = lj.e(lj.a($$0, "_corner"));
      aez $$3 = li.aq.a($$0, $$1, this.c);
      aez $$4 = li.ar.a($$0, $$2, this.c);
      aez $$5 = li.as.a($$0, $$1, this.c);
      aez $$6 = li.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            ky.a($$0)
               .a(
                  kz.a(dft.ag)
                     .a(dgh.a, lb.a().a(lc.c, $$3))
                     .a(dgh.b, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
                     .a(dgh.c, lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
                     .a(dgh.d, lb.a().a(lc.c, $$6).a(lc.b, lc.a.b))
                     .a(dgh.e, lb.a().a(lc.c, $$5))
                     .a(dgh.f, lb.a().a(lc.c, $$6))
                     .a(dgh.g, lb.a().a(lc.c, $$4))
                     .a(dgh.h, lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
                     .a(dgh.i, lb.a().a(lc.c, $$4).a(lc.b, lc.a.c))
                     .a(dgh.j, lb.a().a(lc.c, $$4).a(lc.b, lc.a.d))
               )
         );
   }

   private void o(ctc $$0) {
      aez $$1 = this.a($$0, "", li.aq, lj::e);
      aez $$2 = this.a($$0, "", li.as, lj::e);
      aez $$3 = this.a($$0, "", li.at, lj::e);
      aez $$4 = this.a($$0, "_on", li.aq, lj::e);
      aez $$5 = this.a($$0, "_on", li.as, lj::e);
      aez $$6 = this.a($$0, "_on", li.at, lj::e);
      kz $$7 = kz.a(dft.w, dft.ah).a(($$6x, $$7x) -> {
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

   private ks.a a(aez $$0, ctc $$1) {
      return new ks.a($$0, $$1);
   }

   private ks.a d(ctc $$0, ctc $$1) {
      return new ks.a(lg.a($$0), $$1);
   }

   private void a(ctc $$0, cjg $$1) {
      aez $$2 = li.Y.a($$0, lj.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(ctc $$0, aez $$1) {
      aez $$2 = li.Y.a($$0, lj.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(ctc $$0, ctc $$1) {
      this.a($$0);
      aez $$2 = ll.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(ctc $$0) {
      this.a($$0.k());
      aez $$1 = ll.j.create($$0, this.c);
      aez $$2 = ll.k.create($$0, this.c);
      aez $$3 = ll.l.create($$0, this.c);
      aez $$4 = ll.m.create($$0, this.c);
      this.b
         .accept(
            kx.a($$0)
               .a(kw.a().a(dft.S, 1, 2, 3, 4).a(dft.R, ha.c), lb.a().a(lc.c, $$1))
               .a(kw.a().a(dft.S, 1, 2, 3, 4).a(dft.R, ha.f), lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.S, 1, 2, 3, 4).a(dft.R, ha.d), lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
               .a(kw.a().a(dft.S, 1, 2, 3, 4).a(dft.R, ha.e), lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
               .a(kw.a().a(dft.S, 2, 3, 4).a(dft.R, ha.c), lb.a().a(lc.c, $$2))
               .a(kw.a().a(dft.S, 2, 3, 4).a(dft.R, ha.f), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.S, 2, 3, 4).a(dft.R, ha.d), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
               .a(kw.a().a(dft.S, 2, 3, 4).a(dft.R, ha.e), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
               .a(kw.a().a(dft.S, 3, 4).a(dft.R, ha.c), lb.a().a(lc.c, $$3))
               .a(kw.a().a(dft.S, 3, 4).a(dft.R, ha.f), lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.S, 3, 4).a(dft.R, ha.d), lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               .a(kw.a().a(dft.S, 3, 4).a(dft.R, ha.e), lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
               .a(kw.a().a(dft.S, 4).a(dft.R, ha.c), lb.a().a(lc.c, $$4))
               .a(kw.a().a(dft.S, 4).a(dft.R, ha.f), lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.S, 4).a(dft.R, ha.d), lb.a().a(lc.c, $$4).a(lc.b, lc.a.c))
               .a(kw.a().a(dft.S, 4).a(dft.R, ha.e), lb.a().a(lc.c, $$4).a(lc.b, lc.a.d))
         );
   }

   private void a(ll.a $$0, ctc... $$1) {
      for (ctc $$2 : $$1) {
         aez $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ll.a $$0, ctc... $$1) {
      for (ctc $$2 : $$1) {
         aez $$3 = $$0.create($$2, this.c);
         this.b.accept(ky.a($$2, lb.a().a(lc.c, $$3)).a(c()));
      }
   }

   private void f(ctc $$0, ctc $$1) {
      this.a($$0);
      lj $$2 = lj.b($$0, $$1);
      aez $$3 = li.aG.a($$1, $$2, this.c);
      aez $$4 = li.aH.a($$1, $$2, this.c);
      aez $$5 = li.aI.a($$1, $$2, this.c);
      aez $$6 = li.aE.a($$1, $$2, this.c);
      aez $$7 = li.aF.a($$1, $$2, this.c);
      cjg $$8 = $$1.k();
      li.bv.a(lg.a($$8), lj.F($$0), this.c);
      this.b
         .accept(
            kx.a($$1)
               .a(lb.a().a(lc.c, $$3))
               .a(kw.a().a(dft.L, true), lb.a().a(lc.c, $$4))
               .a(kw.a().a(dft.M, true), lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.N, true), lb.a().a(lc.c, $$5))
               .a(kw.a().a(dft.O, true), lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.L, false), lb.a().a(lc.c, $$6))
               .a(kw.a().a(dft.M, false), lb.a().a(lc.c, $$7))
               .a(kw.a().a(dft.N, false), lb.a().a(lc.c, $$7).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.O, false), lb.a().a(lc.c, $$6).a(lc.b, lc.a.d))
         );
   }

   private void q(ctc $$0) {
      lj $$1 = lj.z($$0);
      aez $$2 = li.aJ.a($$0, $$1, this.c);
      aez $$3 = this.a($$0, "_conditional", li.aJ, $$1x -> $$1.c(lk.i, $$1x));
      this.b.accept(ky.a($$0).a(a(dft.c, $$3, $$2)).a(e()));
   }

   private void r(ctc $$0) {
      aez $$1 = ll.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<lb> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> lb.a().a(lc.c, lg.a(cte.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cte.mZ);
      this.b
         .accept(
            kx.a(cte.mZ)
               .a(kw.a().a(dft.aq, 0), this.a(0))
               .a(kw.a().a(dft.aq, 1), this.a(1))
               .a(kw.a().a(dft.bk, dfp.b), lb.a().a(lc.c, lg.a(cte.mZ, "_small_leaves")))
               .a(kw.a().a(dft.bk, dfp.c), lb.a().a(lc.c, lg.a(cte.mZ, "_large_leaves")))
         );
   }

   private kz n() {
      return kz.a(dft.P)
         .a(ha.a, lb.a().a(lc.a, lc.a.c))
         .a(ha.b, lb.a())
         .a(ha.c, lb.a().a(lc.a, lc.a.b))
         .a(ha.d, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.c))
         .a(ha.e, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.d))
         .a(ha.f, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b));
   }

   private void o() {
      aez $$0 = lj.a(cte.nU, "_top_open");
      this.b
         .accept(
            ky.a(cte.nU)
               .a(this.n())
               .a(
                  kz.a(dft.u)
                     .a(false, lb.a().a(lc.c, ll.e.create(cte.nU, this.c)))
                     .a(true, lb.a().a(lc.c, ll.e.get(cte.nU).a($$1 -> $$1.a(lk.f, $$0)).a(cte.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> kz a(dgg<T> $$0, T $$1, aez $$2, aez $$3) {
      lb $$4 = lb.a().a(lc.c, $$2);
      lb $$5 = lb.a().a(lc.c, $$3);
      return kz.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(ctc $$0, Function<ctc, lj> $$1) {
      lj $$2 = $$1.apply($$0).b(lk.i, lk.c);
      lj $$3 = $$2.c(lk.g, lj.a($$0, "_front_honey"));
      aez $$4 = li.o.a($$0, $$2, this.c);
      aez $$5 = li.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(ky.a($$0).a(b()).a(a(dft.aN, 5, $$5, $$4)));
   }

   private void a(ctc $$0, dgg<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aez> $$3 = new Int2ObjectOpenHashMap();
         kz $$4 = kz.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aez $$5 = (aez)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, li.aT, lj::g));
            return lb.a().a(lc.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(ky.a($$0).a($$4));
      }
   }

   private void p() {
      aez $$0 = lg.a(cte.od, "_floor");
      aez $$1 = lg.a(cte.od, "_ceiling");
      aez $$2 = lg.a(cte.od, "_wall");
      aez $$3 = lg.a(cte.od, "_between_walls");
      this.a(cjo.vs);
      this.b
         .accept(
            ky.a(cte.od)
               .a(
                  kz.a(dft.R, dft.V)
                     .a(ha.c, dfr.a, lb.a().a(lc.c, $$0))
                     .a(ha.d, dfr.a, lb.a().a(lc.c, $$0).a(lc.b, lc.a.c))
                     .a(ha.f, dfr.a, lb.a().a(lc.c, $$0).a(lc.b, lc.a.b))
                     .a(ha.e, dfr.a, lb.a().a(lc.c, $$0).a(lc.b, lc.a.d))
                     .a(ha.c, dfr.b, lb.a().a(lc.c, $$1))
                     .a(ha.d, dfr.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
                     .a(ha.f, dfr.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
                     .a(ha.e, dfr.b, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
                     .a(ha.c, dfr.c, lb.a().a(lc.c, $$2).a(lc.b, lc.a.d))
                     .a(ha.d, dfr.c, lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
                     .a(ha.f, dfr.c, lb.a().a(lc.c, $$2))
                     .a(ha.e, dfr.c, lb.a().a(lc.c, $$2).a(lc.b, lc.a.c))
                     .a(ha.d, dfr.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
                     .a(ha.c, dfr.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.d))
                     .a(ha.f, dfr.d, lb.a().a(lc.c, $$3))
                     .a(ha.e, dfr.d, lb.a().a(lc.c, $$3).a(lc.b, lc.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            ky.a(cte.nZ, lb.a().a(lc.c, lg.a(cte.nZ)))
               .a(
                  kz.a(dft.U, dft.R)
                     .a(dfo.a, ha.c, lb.a())
                     .a(dfo.a, ha.f, lb.a().a(lc.b, lc.a.b))
                     .a(dfo.a, ha.d, lb.a().a(lc.b, lc.a.c))
                     .a(dfo.a, ha.e, lb.a().a(lc.b, lc.a.d))
                     .a(dfo.b, ha.c, lb.a().a(lc.a, lc.a.b))
                     .a(dfo.b, ha.f, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b))
                     .a(dfo.b, ha.d, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.c))
                     .a(dfo.b, ha.e, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.d))
                     .a(dfo.c, ha.d, lb.a().a(lc.a, lc.a.c))
                     .a(dfo.c, ha.e, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.b))
                     .a(dfo.c, ha.c, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.c))
                     .a(dfo.c, ha.f, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.d))
               )
         );
   }

   private void d(ctc $$0, ll.a $$1) {
      aez $$2 = $$1.create($$0, this.c);
      aez $$3 = lj.a($$0, "_front_on");
      aez $$4 = $$1.get($$0).a($$1x -> $$1x.a(lk.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(ky.a($$0).a(a(dft.r, $$4, $$2)).a(b()));
   }

   private void a(ctc... $$0) {
      aez $$1 = lg.a("campfire_off");

      for (ctc $$2 : $$0) {
         aez $$3 = li.ba.a($$2, lj.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(ky.a($$2).a(a(dft.r, $$3, $$1)).a(c()));
      }
   }

   private void s(ctc $$0) {
      aez $$1 = li.br.a($$0, lj.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(ctc $$0) {
      aez $$1;
      if ($$0 == cte.si) {
         $$1 = li.bt.a($$0, lj.m($$0), this.c);
      } else {
         $$1 = li.bs.a($$0, lj.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      lj $$0 = lj.a(lj.G(cte.cl), lj.G(cte.n));
      aez $$1 = li.i.a(cte.cl, $$0, this.c);
      this.b.accept(c(cte.cl, $$1));
   }

   private void s() {
      this.a(cjo.ll);
      this.b
         .accept(
            kx.a(cte.cw)
               .a(
                  kw.b(
                     kw.a().a(dft.ab, dgi.c).a(dft.aa, dgi.c).a(dft.ac, dgi.c).a(dft.ad, dgi.c),
                     kw.a().a(dft.ab, dgi.b, dgi.a).a(dft.aa, dgi.b, dgi.a),
                     kw.a().a(dft.aa, dgi.b, dgi.a).a(dft.ac, dgi.b, dgi.a),
                     kw.a().a(dft.ac, dgi.b, dgi.a).a(dft.ad, dgi.b, dgi.a),
                     kw.a().a(dft.ad, dgi.b, dgi.a).a(dft.ab, dgi.b, dgi.a)
                  ),
                  lb.a().a(lc.c, lg.a("redstone_dust_dot"))
               )
               .a(kw.a().a(dft.ab, dgi.b, dgi.a), lb.a().a(lc.c, lg.a("redstone_dust_side0")))
               .a(kw.a().a(dft.ac, dgi.b, dgi.a), lb.a().a(lc.c, lg.a("redstone_dust_side_alt0")))
               .a(kw.a().a(dft.aa, dgi.b, dgi.a), lb.a().a(lc.c, lg.a("redstone_dust_side_alt1")).a(lc.b, lc.a.d))
               .a(kw.a().a(dft.ad, dgi.b, dgi.a), lb.a().a(lc.c, lg.a("redstone_dust_side1")).a(lc.b, lc.a.d))
               .a(kw.a().a(dft.ab, dgi.a), lb.a().a(lc.c, lg.a("redstone_dust_up")))
               .a(kw.a().a(dft.aa, dgi.a), lb.a().a(lc.c, lg.a("redstone_dust_up")).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.ac, dgi.a), lb.a().a(lc.c, lg.a("redstone_dust_up")).a(lc.b, lc.a.c))
               .a(kw.a().a(dft.ad, dgi.a), lb.a().a(lc.c, lg.a("redstone_dust_up")).a(lc.b, lc.a.d))
         );
   }

   private void t() {
      this.a(cjo.lp);
      this.b
         .accept(
            ky.a(cte.gY)
               .a(c())
               .a(
                  kz.a(dft.bd, dft.w)
                     .a(dfw.a, false, lb.a().a(lc.c, lg.a(cte.gY)))
                     .a(dfw.a, true, lb.a().a(lc.c, lg.a(cte.gY, "_on")))
                     .a(dfw.b, false, lb.a().a(lc.c, lg.a(cte.gY, "_subtract")))
                     .a(dfw.b, true, lb.a().a(lc.c, lg.a(cte.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      lj $$0 = lj.a(cte.jR);
      lj $$1 = lj.a(lj.a(cte.jE, "_side"), $$0.a(lk.f));
      aez $$2 = li.Z.a(cte.jE, $$1, this.c);
      aez $$3 = li.aa.a(cte.jE, $$1, this.c);
      aez $$4 = li.i.b(cte.jE, "_double", $$1, this.c);
      this.b.accept(e(cte.jE, $$2, $$3, $$4));
      this.b.accept(c(cte.jR, li.c.a(cte.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cjo.rB);
      this.b
         .accept(
            kx.a(cte.fs)
               .a(lb.a().a(lc.c, lj.G(cte.fs)))
               .a(kw.a().a(dft.k, true), lb.a().a(lc.c, lj.a(cte.fs, "_bottle0")))
               .a(kw.a().a(dft.l, true), lb.a().a(lc.c, lj.a(cte.fs, "_bottle1")))
               .a(kw.a().a(dft.m, true), lb.a().a(lc.c, lj.a(cte.fs, "_bottle2")))
               .a(kw.a().a(dft.k, false), lb.a().a(lc.c, lj.a(cte.fs, "_empty0")))
               .a(kw.a().a(dft.l, false), lb.a().a(lc.c, lj.a(cte.fs, "_empty1")))
               .a(kw.a().a(dft.m, false), lb.a().a(lc.c, lj.a(cte.fs, "_empty2")))
         );
   }

   private void u(ctc $$0) {
      aez $$1 = li.bn.a($$0, lj.b($$0), this.c);
      aez $$2 = lg.a("mushroom_block_inside");
      this.b
         .accept(
            kx.a($$0)
               .a(kw.a().a(dft.L, true), lb.a().a(lc.c, $$1))
               .a(kw.a().a(dft.M, true), lb.a().a(lc.c, $$1).a(lc.b, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dft.N, true), lb.a().a(lc.c, $$1).a(lc.b, lc.a.c).a(lc.d, true))
               .a(kw.a().a(dft.O, true), lb.a().a(lc.c, $$1).a(lc.b, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dft.J, true), lb.a().a(lc.c, $$1).a(lc.a, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dft.K, true), lb.a().a(lc.c, $$1).a(lc.a, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dft.L, false), lb.a().a(lc.c, $$2))
               .a(kw.a().a(dft.M, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, false))
               .a(kw.a().a(dft.N, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, false))
               .a(kw.a().a(dft.O, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, false))
               .a(kw.a().a(dft.J, false), lb.a().a(lc.c, $$2).a(lc.a, lc.a.d).a(lc.d, false))
               .a(kw.a().a(dft.K, false), lb.a().a(lc.c, $$2).a(lc.a, lc.a.b).a(lc.d, false))
         );
      this.a($$0, ll.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cjo.qN);
      this.b
         .accept(
            ky.a(cte.eg)
               .a(
                  kz.a(dft.ay)
                     .a(0, lb.a().a(lc.c, lg.a(cte.eg)))
                     .a(1, lb.a().a(lc.c, lg.a(cte.eg, "_slice1")))
                     .a(2, lb.a().a(lc.c, lg.a(cte.eg, "_slice2")))
                     .a(3, lb.a().a(lc.c, lg.a(cte.eg, "_slice3")))
                     .a(4, lb.a().a(lc.c, lg.a(cte.eg, "_slice4")))
                     .a(5, lb.a().a(lc.c, lg.a(cte.eg, "_slice5")))
                     .a(6, lb.a().a(lc.c, lg.a(cte.eg, "_slice6")))
               )
         );
   }

   private void x() {
      lj $$0 = new lj()
         .a(lk.c, lj.a(cte.nX, "_side3"))
         .a(lk.o, lj.G(cte.t))
         .a(lk.n, lj.a(cte.nX, "_top"))
         .a(lk.j, lj.a(cte.nX, "_side3"))
         .a(lk.l, lj.a(cte.nX, "_side3"))
         .a(lk.k, lj.a(cte.nX, "_side1"))
         .a(lk.m, lj.a(cte.nX, "_side2"));
      this.b.accept(c(cte.nX, li.a.a(cte.nX, $$0, this.c)));
   }

   private void y() {
      lj $$0 = new lj()
         .a(lk.c, lj.a(cte.ob, "_front"))
         .a(lk.o, lj.a(cte.ob, "_bottom"))
         .a(lk.n, lj.a(cte.ob, "_top"))
         .a(lk.j, lj.a(cte.ob, "_front"))
         .a(lk.k, lj.a(cte.ob, "_front"))
         .a(lk.l, lj.a(cte.ob, "_side"))
         .a(lk.m, lj.a(cte.ob, "_side"));
      this.b.accept(c(cte.ob, li.a.a(cte.ob, $$0, this.c)));
   }

   private void a(ctc $$0, ctc $$1, BiFunction<ctc, ctc, lj> $$2) {
      lj $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, li.a.a($$0, $$3, this.c)));
   }

   public void b(ctc $$0) {
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
      lj $$0 = lj.k(cte.eZ);
      this.b.accept(c(cte.eZ, lg.a(cte.eZ)));
      this.a(cte.ee, $$0);
      this.a(cte.ef, $$0);
   }

   private void a(ctc $$0, lj $$1) {
      aez $$2 = li.n.a($$0, $$1.c(lk.g, lj.G($$0)), this.c);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cjo.rC);
      this.m(cte.ft);
      this.b.accept(c(cte.fv, li.bq.a(cte.fv, lj.j(lj.a(cte.H, "_still")), this.c)));
      this.b
         .accept(
            ky.a(cte.fu)
               .a(
                  kz.a(cxj.g)
                     .a(1, lb.a().a(lc.c, li.bo.a(cte.fu, "_level1", lj.j(lj.a(cte.G, "_still")), this.c)))
                     .a(2, lb.a().a(lc.c, li.bp.a(cte.fu, "_level2", lj.j(lj.a(cte.G, "_still")), this.c)))
                     .a(3, lb.a().a(lc.c, li.bq.a(cte.fu, "_full", lj.j(lj.a(cte.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            ky.a(cte.fw)
               .a(
                  kz.a(cxj.g)
                     .a(1, lb.a().a(lc.c, li.bo.a(cte.fw, "_level1", lj.j(lj.G(cte.qC)), this.c)))
                     .a(2, lb.a().a(lc.c, li.bp.a(cte.fw, "_level2", lj.j(lj.G(cte.qC)), this.c)))
                     .a(3, lb.a().a(lc.c, li.bq.a(cte.fw, "_full", lj.j(lj.G(cte.qC)), this.c)))
               )
         );
   }

   private void B() {
      lj $$0 = lj.b(cte.kv);
      aez $$1 = li.aC.a(cte.kv, $$0, this.c);
      aez $$2 = this.a(cte.kv, "_dead", li.aC, $$1x -> $$0.c(lk.b, $$1x));
      this.b.accept(ky.a(cte.kv).a(a(dft.au, 5, $$2, $$1)));
   }

   private void v(ctc $$0) {
      lj $$1 = new lj().a(lk.f, lj.a(cte.cD, "_top")).a(lk.i, lj.a(cte.cD, "_side")).a(lk.g, lj.a($$0, "_front"));
      lj $$2 = new lj().a(lk.i, lj.a(cte.cD, "_top")).a(lk.g, lj.a($$0, "_front_vertical"));
      aez $$3 = li.n.a($$0, $$1, this.c);
      aez $$4 = li.p.a($$0, $$2, this.c);
      this.b
         .accept(
            ky.a($$0)
               .a(
                  kz.a(dft.P)
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
      aez $$0 = lg.a(cte.fy);
      aez $$1 = lg.a(cte.fy, "_filled");
      this.b.accept(ky.a(cte.fy).a(kz.a(dft.h).a(false, lb.a().a(lc.c, $$0)).a(true, lb.a().a(lc.c, $$1))).a(c()));
   }

   private void D() {
      aez $$0 = lg.a(cte.ku, "_side");
      aez $$1 = lg.a(cte.ku, "_noside");
      aez $$2 = lg.a(cte.ku, "_noside1");
      aez $$3 = lg.a(cte.ku, "_noside2");
      aez $$4 = lg.a(cte.ku, "_noside3");
      this.b
         .accept(
            kx.a(cte.ku)
               .a(kw.a().a(dft.L, true), lb.a().a(lc.c, $$0))
               .a(kw.a().a(dft.M, true), lb.a().a(lc.c, $$0).a(lc.b, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dft.N, true), lb.a().a(lc.c, $$0).a(lc.b, lc.a.c).a(lc.d, true))
               .a(kw.a().a(dft.O, true), lb.a().a(lc.c, $$0).a(lc.b, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dft.J, true), lb.a().a(lc.c, $$0).a(lc.a, lc.a.d).a(lc.d, true))
               .a(kw.a().a(dft.K, true), lb.a().a(lc.c, $$0).a(lc.a, lc.a.b).a(lc.d, true))
               .a(kw.a().a(dft.L, false), lb.a().a(lc.c, $$1).a(lc.e, 2), lb.a().a(lc.c, $$2), lb.a().a(lc.c, $$3), lb.a().a(lc.c, $$4))
               .a(
                  kw.a().a(dft.M, false),
                  lb.a().a(lc.c, $$2).a(lc.b, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.b, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$4).a(lc.b, lc.a.b).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.b, lc.a.b).a(lc.d, true)
               )
               .a(
                  kw.a().a(dft.N, false),
                  lb.a().a(lc.c, $$3).a(lc.b, lc.a.c).a(lc.d, true),
                  lb.a().a(lc.c, $$4).a(lc.b, lc.a.c).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.b, lc.a.c).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.b, lc.a.c).a(lc.d, true)
               )
               .a(
                  kw.a().a(dft.O, false),
                  lb.a().a(lc.c, $$4).a(lc.b, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.b, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.b, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.b, lc.a.d).a(lc.d, true)
               )
               .a(
                  kw.a().a(dft.J, false),
                  lb.a().a(lc.c, $$1).a(lc.e, 2).a(lc.a, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$4).a(lc.a, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$2).a(lc.a, lc.a.d).a(lc.d, true),
                  lb.a().a(lc.c, $$3).a(lc.a, lc.a.d).a(lc.d, true)
               )
               .a(
                  kw.a().a(dft.K, false),
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
            kx.a(cte.pc)
               .a(lb.a().a(lc.c, lj.G(cte.pc)))
               .a(kw.a().a(dft.aL, 1), lb.a().a(lc.c, lj.a(cte.pc, "_contents1")))
               .a(kw.a().a(dft.aL, 2), lb.a().a(lc.c, lj.a(cte.pc, "_contents2")))
               .a(kw.a().a(dft.aL, 3), lb.a().a(lc.c, lj.a(cte.pc, "_contents3")))
               .a(kw.a().a(dft.aL, 4), lb.a().a(lc.c, lj.a(cte.pc, "_contents4")))
               .a(kw.a().a(dft.aL, 5), lb.a().a(lc.c, lj.a(cte.pc, "_contents5")))
               .a(kw.a().a(dft.aL, 6), lb.a().a(lc.c, lj.a(cte.pc, "_contents6")))
               .a(kw.a().a(dft.aL, 7), lb.a().a(lc.c, lj.a(cte.pc, "_contents7")))
               .a(kw.a().a(dft.aL, 8), lb.a().a(lc.c, lj.a(cte.pc, "_contents_ready")))
         );
   }

   private void w(ctc $$0) {
      this.c($$0);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, li.am.a($$0, lj.c($$0), this.c))).a(this.n()));
   }

   private void F() {
      this.w(cte.qy);
      this.w(cte.qx);
      this.w(cte.qw);
      this.w(cte.qv);
   }

   private void G() {
      this.c(cte.rs);
      kz.b<ha, dga> $$0 = kz.a(dft.bm, dft.bn);

      for (dga $$1 : dga.values()) {
         $$0.a(ha.b, $$1, this.a(ha.b, $$1));
      }

      for (dga $$2 : dga.values()) {
         $$0.a(ha.a, $$2, this.a(ha.a, $$2));
      }

      this.b.accept(ky.a(cte.rs).a($$0));
   }

   private lb a(ha $$0, dga $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      lj $$3 = lj.c(lj.a(cte.rs, $$2));
      return lb.a().a(lc.c, li.al.a(cte.rs, $$2, $$3, this.c));
   }

   private void x(ctc $$0) {
      lj $$1 = new lj().a(lk.e, lj.G(cte.dV)).a(lk.f, lj.G($$0)).a(lk.i, lj.a($$0, "_side"));
      this.b.accept(c($$0, li.m.a($$0, $$1, this.c)));
   }

   private void H() {
      aez $$0 = lj.a(cte.gZ, "_side");
      lj $$1 = new lj().a(lk.f, lj.a(cte.gZ, "_top")).a(lk.i, $$0);
      lj $$2 = new lj().a(lk.f, lj.a(cte.gZ, "_inverted_top")).a(lk.i, $$0);
      this.b
         .accept(
            ky.a(cte.gZ)
               .a(kz.a(dft.p).a(false, lb.a().a(lc.c, li.aD.a(cte.gZ, $$1, this.c))).a(true, lb.a().a(lc.c, li.aD.a(lg.a(cte.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(ctc $$0) {
      this.b.accept(ky.a($$0, lb.a().a(lc.c, lg.a($$0))).a(this.n()));
   }

   private void I() {
      ctc $$0 = cte.rr;
      aez $$1 = lg.a($$0, "_on");
      aez $$2 = lg.a($$0);
      this.b.accept(ky.a($$0, lb.a().a(lc.c, lg.a($$0))).a(this.n()).a(a(dft.w, $$1, $$2)));
   }

   private void J() {
      lj $$0 = new lj().a(lk.B, lj.G(cte.j)).a(lk.f, lj.G(cte.cC));
      lj $$1 = new lj().a(lk.B, lj.G(cte.j)).a(lk.f, lj.a(cte.cC, "_moist"));
      aez $$2 = li.aU.a(cte.cC, $$0, this.c);
      aez $$3 = li.aU.a(lj.a(cte.cC, "_moist"), $$1, this.c);
      this.b.accept(ky.a(cte.cC).a(a(dft.aQ, 7, $$3, $$2)));
   }

   private List<aez> z(ctc $$0) {
      aez $$1 = li.aV.a(lg.a($$0, "_floor0"), lj.v($$0), this.c);
      aez $$2 = li.aV.a(lg.a($$0, "_floor1"), lj.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<aez> A(ctc $$0) {
      aez $$1 = li.aW.a(lg.a($$0, "_side0"), lj.v($$0), this.c);
      aez $$2 = li.aW.a(lg.a($$0, "_side1"), lj.w($$0), this.c);
      aez $$3 = li.aX.a(lg.a($$0, "_side_alt0"), lj.v($$0), this.c);
      aez $$4 = li.aX.a(lg.a($$0, "_side_alt1"), lj.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aez> B(ctc $$0) {
      aez $$1 = li.aY.a(lg.a($$0, "_up0"), lj.v($$0), this.c);
      aez $$2 = li.aY.a(lg.a($$0, "_up1"), lj.w($$0), this.c);
      aez $$3 = li.aZ.a(lg.a($$0, "_up_alt0"), lj.v($$0), this.c);
      aez $$4 = li.aZ.a(lg.a($$0, "_up_alt1"), lj.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<lb> a(List<aez> $$0, UnaryOperator<lb> $$1) {
      return $$0.stream().map($$0x -> lb.a().a(lc.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void K() {
      kw $$0 = kw.a().a(dft.L, false).a(dft.M, false).a(dft.N, false).a(dft.O, false).a(dft.J, false);
      List<aez> $$1 = this.z(cte.cr);
      List<aez> $$2 = this.A(cte.cr);
      List<aez> $$3 = this.B(cte.cr);
      this.b
         .accept(
            kx.a(cte.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(kw.b(kw.a().a(dft.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(kw.b(kw.a().a(dft.M, true), $$0), a($$2, $$0x -> $$0x.a(lc.b, lc.a.b)))
               .a(kw.b(kw.a().a(dft.N, true), $$0), a($$2, $$0x -> $$0x.a(lc.b, lc.a.c)))
               .a(kw.b(kw.a().a(dft.O, true), $$0), a($$2, $$0x -> $$0x.a(lc.b, lc.a.d)))
               .a(kw.a().a(dft.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void L() {
      List<aez> $$0 = this.z(cte.cs);
      List<aez> $$1 = this.A(cte.cs);
      this.b
         .accept(
            kx.a(cte.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(lc.b, lc.a.b)))
               .a(a($$1, $$0x -> $$0x.a(lc.b, lc.a.c)))
               .a(a($$1, $$0x -> $$0x.a(lc.b, lc.a.d)))
         );
   }

   private void C(ctc $$0) {
      aez $$1 = ll.s.create($$0, this.c);
      aez $$2 = ll.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(ky.a($$0).a(a(dft.j, $$2, $$1)));
   }

   private void M() {
      lj $$0 = lj.a(lj.a(cte.ad, "_side"), lj.a(cte.ad, "_top"));
      aez $$1 = li.i.a(cte.ad, $$0, this.c);
      this.b.accept(d(cte.ad, $$1));
   }

   private void N() {
      this.a(cjo.Q);
      ctc $$0 = cte.E;
      kz.b<Boolean, Integer> $$1 = kz.a(cxv.d, cxv.b);
      aez $$2 = lg.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aez $$4 = lg.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, lb.a().a(lc.c, $$4));
         $$1.a(false, $$3, lb.a().a(lc.c, $$2));
      }

      this.b.accept(ky.a(cte.E).a($$1));
   }

   private void O() {
      this.b
         .accept(
            ky.a(cte.kI)
               .a(
                  kz.a(dft.as)
                     .a(0, lb.a().a(lc.c, this.a(cte.kI, "_0", li.c, lj::b)))
                     .a(1, lb.a().a(lc.c, this.a(cte.kI, "_1", li.c, lj::b)))
                     .a(2, lb.a().a(lc.c, this.a(cte.kI, "_2", li.c, lj::b)))
                     .a(3, lb.a().a(lc.c, this.a(cte.kI, "_3", li.c, lj::b)))
               )
         );
   }

   private void P() {
      aez $$0 = lj.G(cte.j);
      lj $$1 = new lj().a(lk.e, $$0).b(lk.e, lk.c).a(lk.f, lj.a(cte.i, "_top")).a(lk.i, lj.a(cte.i, "_snow"));
      lb $$2 = lb.a().a(lc.c, li.m.a(cte.i, "_snow", $$1, this.c));
      this.a(cte.i, lg.a(cte.i), $$2);
      aez $$3 = ll.e.get(cte.fl).a($$1x -> $$1x.a(lk.e, $$0)).a(cte.fl, this.c);
      this.a(cte.fl, $$3, $$2);
      aez $$4 = ll.e.get(cte.l).a($$1x -> $$1x.a(lk.e, $$0)).a(cte.l, this.c);
      this.a(cte.l, $$4, $$2);
   }

   private void a(ctc $$0, aez $$1, lb $$2) {
      List<lb> $$3 = Arrays.asList(a($$1));
      this.b.accept(ky.a($$0).a(kz.a(dft.z).a(true, $$2).a(false, $$3)));
   }

   private void Q() {
      this.a(cjo.qt);
      this.b
         .accept(
            ky.a(cte.fC)
               .a(
                  kz.a(dft.ar)
                     .a(0, lb.a().a(lc.c, lg.a(cte.fC, "_stage0")))
                     .a(1, lb.a().a(lc.c, lg.a(cte.fC, "_stage1")))
                     .a(2, lb.a().a(lc.c, lg.a(cte.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void R() {
      this.b.accept(b(cte.kE, lg.a(cte.kE)));
   }

   private void g(ctc $$0, ctc $$1) {
      lj $$2 = lj.b($$1);
      aez $$3 = li.W.a($$0, $$2, this.c);
      aez $$4 = li.X.a($$0, $$2, this.c);
      this.b.accept(ky.a($$0).a(a(dft.aT, 1, $$4, $$3)));
   }

   private void S() {
      aez $$0 = lg.a(cte.hc);
      aez $$1 = lg.a(cte.hc, "_side");
      this.a(cjo.lv);
      this.b
         .accept(
            ky.a(cte.hc)
               .a(
                  kz.a(dft.Q)
                     .a(ha.a, lb.a().a(lc.c, $$0))
                     .a(ha.c, lb.a().a(lc.c, $$1))
                     .a(ha.f, lb.a().a(lc.c, $$1).a(lc.b, lc.a.b))
                     .a(ha.d, lb.a().a(lc.c, $$1).a(lc.b, lc.a.c))
                     .a(ha.e, lb.a().a(lc.c, $$1).a(lc.b, lc.a.d))
               )
         );
   }

   private void h(ctc $$0, ctc $$1) {
      aez $$2 = lg.a($$0);
      this.b.accept(ky.a($$1, lb.a().a(lc.c, $$2)));
      this.a($$1, $$2);
   }

   private void T() {
      aez $$0 = lg.a(cte.eW, "_post_ends");
      aez $$1 = lg.a(cte.eW, "_post");
      aez $$2 = lg.a(cte.eW, "_cap");
      aez $$3 = lg.a(cte.eW, "_cap_alt");
      aez $$4 = lg.a(cte.eW, "_side");
      aez $$5 = lg.a(cte.eW, "_side_alt");
      this.b
         .accept(
            kx.a(cte.eW)
               .a(lb.a().a(lc.c, $$0))
               .a(kw.a().a(dft.L, false).a(dft.M, false).a(dft.N, false).a(dft.O, false), lb.a().a(lc.c, $$1))
               .a(kw.a().a(dft.L, true).a(dft.M, false).a(dft.N, false).a(dft.O, false), lb.a().a(lc.c, $$2))
               .a(kw.a().a(dft.L, false).a(dft.M, true).a(dft.N, false).a(dft.O, false), lb.a().a(lc.c, $$2).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.L, false).a(dft.M, false).a(dft.N, true).a(dft.O, false), lb.a().a(lc.c, $$3))
               .a(kw.a().a(dft.L, false).a(dft.M, false).a(dft.N, false).a(dft.O, true), lb.a().a(lc.c, $$3).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.L, true), lb.a().a(lc.c, $$4))
               .a(kw.a().a(dft.M, true), lb.a().a(lc.c, $$4).a(lc.b, lc.a.b))
               .a(kw.a().a(dft.N, true), lb.a().a(lc.c, $$5))
               .a(kw.a().a(dft.O, true), lb.a().a(lc.c, $$5).a(lc.b, lc.a.b))
         );
      this.d(cte.eW);
   }

   private void D(ctc $$0) {
      this.b.accept(ky.a($$0, lb.a().a(lc.c, lg.a($$0))).a(b()));
   }

   private void U() {
      aez $$0 = lg.a(cte.dw);
      aez $$1 = lg.a(cte.dw, "_on");
      this.d(cte.dw);
      this.b
         .accept(
            ky.a(cte.dw)
               .a(a(dft.w, $$0, $$1))
               .a(
                  kz.a(dft.U, dft.R)
                     .a(dfo.c, ha.c, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.c))
                     .a(dfo.c, ha.f, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.d))
                     .a(dfo.c, ha.d, lb.a().a(lc.a, lc.a.c))
                     .a(dfo.c, ha.e, lb.a().a(lc.a, lc.a.c).a(lc.b, lc.a.b))
                     .a(dfo.a, ha.c, lb.a())
                     .a(dfo.a, ha.f, lb.a().a(lc.b, lc.a.b))
                     .a(dfo.a, ha.d, lb.a().a(lc.b, lc.a.c))
                     .a(dfo.a, ha.e, lb.a().a(lc.b, lc.a.d))
                     .a(dfo.b, ha.c, lb.a().a(lc.a, lc.a.b))
                     .a(dfo.b, ha.f, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.b))
                     .a(dfo.b, ha.d, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.c))
                     .a(dfo.b, ha.e, lb.a().a(lc.a, lc.a.b).a(lc.b, lc.a.d))
               )
         );
   }

   private void V() {
      this.d(cte.fm);
      this.b.accept(b(cte.fm, lg.a(cte.fm)));
   }

   private void W() {
      this.d(cte.sm);
      this.b.accept(c(cte.sm, lg.a(cte.sm)));
   }

   private void X() {
      this.b.accept(ky.a(cte.ed).a(kz.a(dft.H).a(ha.a.a, lb.a().a(lc.c, lg.a(cte.ed, "_ns"))).a(ha.a.c, lb.a().a(lc.c, lg.a(cte.ed, "_ew")))));
   }

   private void Y() {
      aez $$0 = ll.a.create(cte.dV, this.c);
      this.b
         .accept(
            ky.a(
               cte.dV,
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
      aez $$0 = lg.a(cte.kO);
      aez $$1 = lg.a(cte.kO, "_on");
      this.b.accept(ky.a(cte.kO).a(a(dft.w, $$1, $$0)).a(e()));
   }

   private void aa() {
      lj $$0 = new lj().a(lk.e, lj.a(cte.by, "_bottom")).a(lk.i, lj.a(cte.by, "_side"));
      aez $$1 = lj.a(cte.by, "_top_sticky");
      aez $$2 = lj.a(cte.by, "_top");
      lj $$3 = $$0.c(lk.E, $$1);
      lj $$4 = $$0.c(lk.E, $$2);
      aez $$5 = lg.a(cte.by, "_base");
      this.a(cte.by, $$5, $$4);
      this.a(cte.br, $$5, $$3);
      aez $$6 = li.m.a(cte.by, "_inventory", $$0.c(lk.f, $$2), this.c);
      aez $$7 = li.m.a(cte.br, "_inventory", $$0.c(lk.f, $$1), this.c);
      this.a(cte.by, $$6);
      this.a(cte.br, $$7);
   }

   private void a(ctc $$0, aez $$1, lj $$2) {
      aez $$3 = li.bf.a($$0, $$2, this.c);
      this.b.accept(ky.a($$0).a(a(dft.g, $$1, $$3)).a(e()));
   }

   private void ab() {
      lj $$0 = new lj().a(lk.F, lj.a(cte.by, "_top")).a(lk.i, lj.a(cte.by, "_side"));
      lj $$1 = $$0.c(lk.E, lj.a(cte.by, "_top_sticky"));
      lj $$2 = $$0.c(lk.E, lj.a(cte.by, "_top"));
      this.b
         .accept(
            ky.a(cte.bz)
               .a(
                  kz.a(dft.x, dft.bg)
                     .a(false, dgf.a, lb.a().a(lc.c, li.bg.a(cte.by, "_head", $$2, this.c)))
                     .a(false, dgf.b, lb.a().a(lc.c, li.bg.a(cte.by, "_head_sticky", $$1, this.c)))
                     .a(true, dgf.a, lb.a().a(lc.c, li.bh.a(cte.by, "_head_short", $$2, this.c)))
                     .a(true, dgf.b, lb.a().a(lc.c, li.bh.a(cte.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ac() {
      aez $$0 = lg.a(cte.qD, "_inactive");
      aez $$1 = lg.a(cte.qD, "_active");
      this.a(cte.qD, $$0);
      this.b.accept(ky.a(cte.qD).a(kz.a(dft.bo).a($$2 -> lb.a().a(lc.c, $$2 != dgk.b && $$2 != dgk.c ? $$0 : $$1))));
   }

   private void ad() {
      aez $$0 = lg.a(cte.qE, "_inactive");
      aez $$1 = lg.a(cte.qE, "_active");
      this.a(cte.qE, $$0);
      this.b.accept(ky.a(cte.qE).a(kz.a(dft.bo).a($$2 -> lb.a().a(lc.c, $$2 != dgk.b && $$2 != dgk.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      aez $$0 = li.bK.a(cte.qI, lj.a(false), this.c);
      aez $$1 = li.bK.a(cte.qI, "_can_summon", lj.a(true), this.c);
      this.a(cte.qI, $$0);
      this.b.accept(ky.a(cte.qI).a(a(dft.G, $$1, $$0)));
   }

   private void af() {
      aez $$0 = lg.a(cte.nS, "_stable");
      aez $$1 = lg.a(cte.nS, "_unstable");
      this.a(cte.nS, $$0);
      this.b.accept(ky.a(cte.nS).a(a(dft.b, $$1, $$0)));
   }

   private void ag() {
      aez $$0 = this.a(cte.ru, "", li.am, lj::c);
      aez $$1 = this.a(cte.ru, "_lit", li.am, lj::c);
      this.b.accept(ky.a(cte.ru).a(a(dft.D, $$1, $$0)));
      aez $$2 = this.a(cte.rv, "", li.am, lj::c);
      aez $$3 = this.a(cte.rv, "_lit", li.am, lj::c);
      this.b.accept(ky.a(cte.rv).a(a(dft.D, $$3, $$2)));
   }

   private void ah() {
      aez $$0 = ll.a.create(cte.fB, this.c);
      aez $$1 = this.a(cte.fB, "_on", li.c, lj::b);
      this.b.accept(ky.a(cte.fB).a(a(dft.r, $$1, $$0)));
   }

   private void i(ctc $$0, ctc $$1) {
      lj $$2 = lj.y($$0);
      this.b.accept(c($$0, li.bd.a($$0, $$2, this.c)));
      this.b.accept(ky.a($$1, lb.a().a(lc.c, li.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      lj $$0 = lj.y(cte.dK);
      lj $$1 = lj.i(lj.a(cte.dK, "_off"));
      aez $$2 = li.bd.a(cte.dK, $$0, this.c);
      aez $$3 = li.bd.a(cte.dK, "_off", $$1, this.c);
      this.b.accept(ky.a(cte.dK).a(a(dft.r, $$2, $$3)));
      aez $$4 = li.be.a(cte.dL, $$0, this.c);
      aez $$5 = li.be.a(cte.dL, "_off", $$1, this.c);
      this.b.accept(ky.a(cte.dL).a(a(dft.r, $$4, $$5)).a(d()));
      this.d(cte.dK);
      this.c(cte.dL);
   }

   private void aj() {
      this.a(cjo.lo);
      this.b.accept(ky.a(cte.eh).a(kz.a(dft.aA, dft.s, dft.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return lb.a().a(lc.c, lj.a(cte.eh, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(cjo.cx);
      this.b
         .accept(
            ky.a(cte.mV)
               .a(
                  kz.a(dft.aS, dft.C)
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
      lj $$0 = lj.a(cte.dN);
      aez $$1 = li.c.a(cte.dP, $$0, this.c);
      this.b.accept(ky.a(cte.dN).a(kz.a(dft.aF).a($$1x -> lb.a().a(lc.c, $$1x < 8 ? lg.a(cte.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cte.dN, lg.a(cte.dN, "_height2"));
      this.b.accept(c(cte.dP, $$1));
   }

   private void am() {
      this.b.accept(ky.a(cte.oc, lb.a().a(lc.c, lg.a(cte.oc))).a(b()));
   }

   private void an() {
      aez $$0 = ll.a.create(cte.pa, this.c);
      this.a(cte.pa, $$0);
      this.b.accept(ky.a(cte.pa).a(kz.a(dft.bj).a($$0x -> lb.a().a(lc.c, this.a(cte.pa, "_" + $$0x.c(), li.c, lj::b)))));
   }

   private void ao() {
      this.a(cjo.vv);
      this.b.accept(ky.a(cte.oi).a(kz.a(dft.as).a($$0 -> lb.a().a(lc.c, this.a(cte.oi, "_stage" + $$0, li.am, lj::c)))));
   }

   private void ap() {
      this.a(cjo.oE);
      this.b
         .accept(
            ky.a(cte.fI)
               .a(
                  kz.a(dft.a, dft.M, dft.L, dft.N, dft.O)
                     .a(false, false, false, false, false, lb.a().a(lc.c, lg.a(cte.fI, "_ns")))
                     .a(false, true, false, false, false, lb.a().a(lc.c, lg.a(cte.fI, "_n")).a(lc.b, lc.a.b))
                     .a(false, false, true, false, false, lb.a().a(lc.c, lg.a(cte.fI, "_n")))
                     .a(false, false, false, true, false, lb.a().a(lc.c, lg.a(cte.fI, "_n")).a(lc.b, lc.a.c))
                     .a(false, false, false, false, true, lb.a().a(lc.c, lg.a(cte.fI, "_n")).a(lc.b, lc.a.d))
                     .a(false, true, true, false, false, lb.a().a(lc.c, lg.a(cte.fI, "_ne")))
                     .a(false, true, false, true, false, lb.a().a(lc.c, lg.a(cte.fI, "_ne")).a(lc.b, lc.a.b))
                     .a(false, false, false, true, true, lb.a().a(lc.c, lg.a(cte.fI, "_ne")).a(lc.b, lc.a.c))
                     .a(false, false, true, false, true, lb.a().a(lc.c, lg.a(cte.fI, "_ne")).a(lc.b, lc.a.d))
                     .a(false, false, true, true, false, lb.a().a(lc.c, lg.a(cte.fI, "_ns")))
                     .a(false, true, false, false, true, lb.a().a(lc.c, lg.a(cte.fI, "_ns")).a(lc.b, lc.a.b))
                     .a(false, true, true, true, false, lb.a().a(lc.c, lg.a(cte.fI, "_nse")))
                     .a(false, true, false, true, true, lb.a().a(lc.c, lg.a(cte.fI, "_nse")).a(lc.b, lc.a.b))
                     .a(false, false, true, true, true, lb.a().a(lc.c, lg.a(cte.fI, "_nse")).a(lc.b, lc.a.c))
                     .a(false, true, true, false, true, lb.a().a(lc.c, lg.a(cte.fI, "_nse")).a(lc.b, lc.a.d))
                     .a(false, true, true, true, true, lb.a().a(lc.c, lg.a(cte.fI, "_nsew")))
                     .a(true, false, false, false, false, lb.a().a(lc.c, lg.a(cte.fI, "_attached_ns")))
                     .a(true, false, true, false, false, lb.a().a(lc.c, lg.a(cte.fI, "_attached_n")))
                     .a(true, false, false, true, false, lb.a().a(lc.c, lg.a(cte.fI, "_attached_n")).a(lc.b, lc.a.c))
                     .a(true, true, false, false, false, lb.a().a(lc.c, lg.a(cte.fI, "_attached_n")).a(lc.b, lc.a.b))
                     .a(true, false, false, false, true, lb.a().a(lc.c, lg.a(cte.fI, "_attached_n")).a(lc.b, lc.a.d))
                     .a(true, true, true, false, false, lb.a().a(lc.c, lg.a(cte.fI, "_attached_ne")))
                     .a(true, true, false, true, false, lb.a().a(lc.c, lg.a(cte.fI, "_attached_ne")).a(lc.b, lc.a.b))
                     .a(true, false, false, true, true, lb.a().a(lc.c, lg.a(cte.fI, "_attached_ne")).a(lc.b, lc.a.c))
                     .a(true, false, true, false, true, lb.a().a(lc.c, lg.a(cte.fI, "_attached_ne")).a(lc.b, lc.a.d))
                     .a(true, false, true, true, false, lb.a().a(lc.c, lg.a(cte.fI, "_attached_ns")))
                     .a(true, true, false, false, true, lb.a().a(lc.c, lg.a(cte.fI, "_attached_ns")).a(lc.b, lc.a.b))
                     .a(true, true, true, true, false, lb.a().a(lc.c, lg.a(cte.fI, "_attached_nse")))
                     .a(true, true, false, true, true, lb.a().a(lc.c, lg.a(cte.fI, "_attached_nse")).a(lc.b, lc.a.b))
                     .a(true, false, true, true, true, lb.a().a(lc.c, lg.a(cte.fI, "_attached_nse")).a(lc.b, lc.a.c))
                     .a(true, true, true, false, true, lb.a().a(lc.c, lg.a(cte.fI, "_attached_nse")).a(lc.b, lc.a.d))
                     .a(true, true, true, true, true, lb.a().a(lc.c, lg.a(cte.fI, "_attached_nsew")))
               )
         );
   }

   private void aq() {
      this.d(cte.fH);
      this.b.accept(ky.a(cte.fH).a(kz.a(dft.a, dft.w).a(($$0, $$1) -> lb.a().a(lc.c, lj.a(cte.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aez a(int $$0, String $$1, lj $$2) {
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

   private aez a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", lj.b(lj.G(cte.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", lj.b(lj.a(cte.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", lj.b(lj.a(cte.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ar() {
      this.a(cjo.jT);
      this.b.accept(ky.a(cte.mf).a(kz.a(dft.aD, dft.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void as() {
      this.a(cjo.jU);
      Function<Integer, aez> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         lj $$2 = lj.a($$1);
         return li.bu.a(cte.mg, $$1, $$2, this.c);
      };
      this.b.accept(ky.a(cte.mg).a(kz.a(dai.c).a($$1 -> lb.a().a(lc.c, $$0.apply($$1)))));
   }

   private void E(ctc $$0) {
      this.d($$0);
      aez $$1 = lg.a($$0);
      kx $$2 = kx.a($$0);
      kw.c $$3 = ac.a(kw.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dfu, Function<aez, lb>> $$4 : a) {
         dfu $$5 = (dfu)$$4.getFirst();
         Function<aez, lb> $$6 = (Function<aez, lb>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(kw.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void at() {
      aez $$0 = lj.a(cte.qH, "_bottom");
      lj $$1 = new lj().a(lk.e, $$0).a(lk.f, lj.a(cte.qH, "_top")).a(lk.i, lj.a(cte.qH, "_side"));
      lj $$2 = new lj().a(lk.e, $$0).a(lk.f, lj.a(cte.qH, "_top_bloom")).a(lk.i, lj.a(cte.qH, "_side_bloom"));
      aez $$3 = li.m.a(cte.qH, "", $$1, this.c);
      aez $$4 = li.m.a(cte.qH, "_bloom", $$2, this.c);
      this.b.accept(ky.a(cte.qH).a(kz.a(dft.E).a($$2x -> lb.a().a(lc.c, $$2x ? $$4 : $$3))));
      this.a(cjo.fN, $$3);
   }

   private void au() {
      ctc $$0 = cte.cm;
      aez $$1 = lg.a($$0);
      kx $$2 = kx.a($$0);
      Map.of(ha.c, lc.a.a, ha.f, lc.a.b, ha.d, lc.a.c, ha.e, lc.a.d).forEach(($$2x, $$3) -> {
         kw.c $$4 = kw.a().a(dft.R, $$2x);
         $$2.a($$4, lb.a().a(lc.c, $$1).a(lc.b, $$3).a(lc.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, lg.a($$0, "_inventory"));
      i.clear();
   }

   private void a(kx $$0, kw.c $$1, lc.a $$2) {
      Map.of(dft.bp, li.aK, dft.bq, li.aL, dft.br, li.aM, dft.bs, li.aN, dft.bt, li.aO, dft.bu, li.aP).forEach(($$3, $$4) -> {
         this.a($$0, $$1, $$2, $$3, $$4, true);
         this.a($$0, $$1, $$2, $$3, $$4, false);
      });
   }

   private void a(kx $$0, kw.c $$1, lc.a $$2, dfu $$3, lh $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      lj $$7 = new lj().a(lk.b, lj.a(cte.cm, $$6));
      ks.d $$8 = new ks.d($$4, $$6);
      aez $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cte.cm, $$6, $$7, this.c));
      $$0.a(kw.a($$1, kw.a().a($$3, $$5)), lb.a().a(lc.c, $$9).a(lc.b, $$2));
   }

   private void av() {
      this.b.accept(c(cte.kJ, li.c.a(cte.kJ, lj.b(lg.a("magma")), this.c)));
   }

   private void F(ctc $$0) {
      this.b($$0, ll.p);
      li.bB.a(lg.a($$0.k()), lj.u($$0), this.c);
   }

   private void b(ctc $$0, ctc $$1, ks.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(ctc $$0, ctc $$1) {
      li.bC.a(lg.a($$0.k()), lj.u($$1), this.c);
   }

   private void aw() {
      aez $$0 = lg.a(cte.b);
      aez $$1 = lg.a(cte.b, "_mirrored");
      this.b.accept(a(cte.eN, $$0, $$1));
      this.a(cte.eN, $$0);
   }

   private void ax() {
      aez $$0 = lg.a(cte.rI);
      aez $$1 = lg.a(cte.rI, "_mirrored");
      this.b.accept(a(cte.sc, $$0, $$1).a(f()));
      this.a(cte.sc, $$0);
   }

   private void k(ctc $$0, ctc $$1) {
      this.a($$0, ks.e.b);
      lj $$2 = lj.d(lj.a($$0, "_pot"));
      aez $$3 = ks.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void ay() {
      aez $$0 = lj.a(cte.pl, "_bottom");
      aez $$1 = lj.a(cte.pl, "_top_off");
      aez $$2 = lj.a(cte.pl, "_top");
      aez[] $$3 = new aez[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         lj $$5 = new lj().a(lk.e, $$0).a(lk.f, $$4 == 0 ? $$1 : $$2).a(lk.i, lj.a(cte.pl, "_side" + $$4));
         $$3[$$4] = li.m.a(cte.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(ky.a(cte.pl).a(kz.a(dft.aZ).a($$1x -> lb.a().a(lc.c, $$3[$$1x]))));
      this.a(cjo.vT, $$3[0]);
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
      aez $$0 = lj.a(cte.pb, "_top");
      aez $$1 = lj.a(cte.pb, "_bottom");
      aez $$2 = lj.a(cte.pb, "_side");
      aez $$3 = lj.a(cte.pb, "_lock");
      lj $$4 = new lj().a(lk.o, $$2).a(lk.m, $$2).a(lk.l, $$2).a(lk.c, $$0).a(lk.j, $$0).a(lk.k, $$1).a(lk.n, $$3);
      aez $$5 = li.b.a(cte.pb, $$4, this.c);
      this.b.accept(ky.a(cte.pb, lb.a().a(lc.c, $$5)).a(kz.a(dft.T).a($$0x -> this.a($$0x, lb.a()))));
   }

   private void aA() {
      ctc $$0 = cte.n;
      aez $$1 = lg.a($$0);
      ll $$2 = ll.a.get($$0);
      ctc $$3 = cte.jH;
      aez $$4 = li.Z.a($$3, $$2.b(), this.c);
      aez $$5 = li.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      je.a().filter(jf::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cte.qS).a(je.w).a(cte.ri).a(je.y);
      this.h(cte.qR).a(je.A).a(cte.rh).a(je.C);
      this.h(cte.qQ).a(je.E).a(cte.rg).a(je.G);
      this.h(cte.qP).a(je.I).a(cte.rf).a(je.K);
      this.m(cte.a);
      this.a(cte.nc, cte.a);
      this.a(cte.nb, cte.a);
      this.m(cte.fO);
      this.m(cte.dQ);
      this.a(cte.nd, cte.G);
      this.m(cte.fA);
      this.m(cte.me);
      this.m(cte.fr);
      this.m(cte.fR);
      this.a(cjo.tk);
      this.m(cte.pg);
      this.m(cte.G);
      this.m(cte.H);
      this.m(cte.hV);
      this.a(cjo.fw);
      this.l(cte.pM, cte.qd);
      this.l(cte.pN, cte.qe);
      this.l(cte.pO, cte.qf);
      this.l(cte.pP, cte.qg);
      this.l(cte.pQ, cte.qh);
      this.l(cte.pR, cte.qi);
      this.l(cte.pS, cte.qj);
      this.l(cte.pT, cte.qk);
      this.l(cte.pU, cte.ql);
      this.l(cte.pV, cte.qm);
      this.l(cte.pW, cte.qn);
      this.l(cte.pX, cte.qo);
      this.l(cte.pY, cte.qp);
      this.l(cte.pZ, cte.qq);
      this.l(cte.qa, cte.qr);
      this.l(cte.qb, cte.qs);
      this.l(cte.pL, cte.qc);
      this.m(cte.na);
      this.m(cte.gs);
      this.m(cte.qC);
      this.m(cte.rw);
      this.s(cte.rx);
      this.s(cte.ry);
      this.t(cte.sh);
      this.t(cte.si);
      this.ag();
      this.e(cte.rB, cte.rz);
      this.p(cte.rA);
      this.a(cte.hW, cjo.hf);
      this.a(cjo.hf);
      this.aB();
      this.a(cte.kN, cjo.iF);
      this.a(cjo.iF);
      this.f(cte.bQ, lj.a(cte.by, "_side"));
      this.a(cte.R);
      this.a(cte.S);
      this.a(cte.iB);
      this.a(cte.cx);
      this.a(cte.cy);
      this.a(cte.cz);
      this.a(cte.fE);
      this.a(cte.fF);
      this.a(cte.fJ);
      this.a(cte.N);
      this.a(cte.T);
      this.a(cte.O);
      this.a(cte.ch);
      this.a(cte.P);
      this.a(cte.Q);
      this.a(cte.ci);
      this.b(cte.pj, ll.c);
      this.a(cte.pi);
      this.a(cte.aR);
      this.a(cte.aS);
      this.a(cte.aT);
      this.a(cte.hb);
      this.a(cte.dI);
      this.a(cte.dJ);
      this.a(cte.ha);
      this.a(cte.pC);
      this.a(cte.mW);
      this.a(cte.dR);
      this.a(cte.k);
      this.a(cte.pk);
      this.a(cte.fz);
      this.a(cte.ec);
      this.a(cte.L);
      this.a(cte.ph);
      this.a(cte.dO);
      this.b(cte.dT, ll.f);
      this.b(cte.pq, ll.c);
      this.b(cte.fa, ll.c);
      this.m(cte.ac);
      this.m(cte.ga);
      this.a(cte.kK);
      this.a(cte.aY);
      this.a(cte.iC);
      this.a(cte.co);
      this.a(cte.pK);
      this.a(cte.ii);
      this.a(cte.oy);
      this.a(cte.dW);
      this.a(cte.dX);
      this.a(cte.ct);
      this.a(cte.aO);
      this.b(cte.bw, ll.u);
      this.a(cjo.cw);
      this.b(cte.ck, ll.e);
      this.b(cte.pd, ll.c);
      this.a(cte.op);
      this.a(cte.aP);
      this.a(cte.qt);
      this.a(cte.qu);
      this.a(cte.qA);
      this.a(cte.qz);
      this.a(cte.rt);
      this.a(cte.se);
      this.a(cte.sf);
      this.a(cte.sg);
      this.e(cte.qF);
      this.aA();
      this.a(cte.qN);
      this.a(cte.qO);
      this.a(cte.qM);
      this.a(cte.qL);
      this.a(cte.qK);
      this.a(cte.qJ);
      this.h(cte.qM, cte.rb);
      this.h(cte.qL, cte.rd);
      this.h(cte.qK, cte.rc);
      this.h(cte.qJ, cte.re);
      this.g(cte.gW, cte.ch);
      this.g(cte.gX, cte.ci);
      this.F();
      this.r();
      this.au();
      this.v();
      this.w();
      this.a(cte.og, cte.oh);
      this.x();
      this.A();
      this.B();
      this.D();
      this.E();
      this.H();
      this.C();
      this.y(cte.kt);
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
      this.E(cte.ff);
      this.E(cte.fg);
      this.E(cte.qG);
      this.av();
      this.az();
      this.ac();
      this.ad();
      this.ae();
      this.W();
      this.N();
      this.M();
      this.D(cte.cO);
      this.d(cte.cO);
      this.D(cte.oa);
      this.g();
      this.D(cte.rD);
      this.i(cte.cp, cte.cq);
      this.i(cte.ea, cte.eb);
      this.a(cte.cA, cte.n, lj::c);
      this.a(cte.nY, cte.p, lj::d);
      this.x(cte.ow);
      this.x(cte.on);
      this.v(cte.aU);
      this.v(cte.hi);
      this.C(cte.oe);
      this.C(cte.of);
      this.e(cte.eX, lg.a(cte.eX));
      this.a(cte.dY, ll.c);
      this.a(cte.dZ, ll.c);
      this.a(cte.sd);
      this.a(cte.kM, ll.c);
      this.f(cte.j);
      this.f(cte.rG);
      this.f(cte.I);
      this.g(cte.J);
      this.g(cte.M);
      this.f(cte.K);
      this.e(cte.F);
      this.b(cte.sn, ll.e);
      this.a(cte.ij, ll.c, ll.d);
      this.a(cte.kx, ll.v, ll.w);
      this.a(cte.hf, ll.v, ll.w);
      this.a(cte.sj, ll.c, ll.d);
      this.a(cte.sk, ll.c, ll.d);
      this.a(cte.sl, ll.c, ll.d);
      this.c(cte.nT, ll.h);
      this.z();
      this.a(cte.pe, lj::A);
      this.a(cte.pf, lj::C);
      this.a(cte.kD, dft.as, 0, 1, 2, 3);
      this.a(cte.gt, dft.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cte.fq, dft.as, 0, 1, 1, 2);
      this.a(cte.gu, dft.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cte.cB, dft.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cte.kA, ks.e.b, dft.aq, 0, 1);
      this.i();
      this.h();
      this.a(lg.a("decorated_pot"), cte.iA).b(cte.so);
      this.a(lg.a("banner"), cte.n)
         .a(li.bD, cte.iJ, cte.iK, cte.iL, cte.iM, cte.iN, cte.iO, cte.iP, cte.iQ, cte.iR, cte.iS, cte.iT, cte.iU, cte.iV, cte.iW, cte.iX, cte.iY)
         .b(cte.iZ, cte.ja, cte.jb, cte.jc, cte.jd, cte.je, cte.jf, cte.jg, cte.jh, cte.ji, cte.jj, cte.jk, cte.jl, cte.jm, cte.jn, cte.jo);
      this.a(lg.a("bed"), cte.n)
         .b(cte.aZ, cte.ba, cte.bb, cte.bc, cte.bd, cte.be, cte.bf, cte.bg, cte.bh, cte.bi, cte.bj, cte.bk, cte.bl, cte.bm, cte.bn, cte.bo);
      this.j(cte.aZ, cte.bA);
      this.j(cte.ba, cte.bB);
      this.j(cte.bb, cte.bC);
      this.j(cte.bc, cte.bD);
      this.j(cte.bd, cte.bE);
      this.j(cte.be, cte.bF);
      this.j(cte.bf, cte.bG);
      this.j(cte.bg, cte.bH);
      this.j(cte.bh, cte.bI);
      this.j(cte.bi, cte.bJ);
      this.j(cte.bj, cte.bK);
      this.j(cte.bk, cte.bL);
      this.j(cte.bl, cte.bM);
      this.j(cte.bm, cte.bN);
      this.j(cte.bn, cte.bO);
      this.j(cte.bo, cte.bP);
      this.a(lg.a("skull"), cte.dW)
         .a(li.bE, cte.gM, cte.gK, cte.gI, cte.gE, cte.gG, cte.gQ)
         .a(cte.gO)
         .b(cte.gN, cte.gP, cte.gL, cte.gJ, cte.gF, cte.gH, cte.gR);
      this.F(cte.kP);
      this.F(cte.kQ);
      this.F(cte.kR);
      this.F(cte.kS);
      this.F(cte.kT);
      this.F(cte.kU);
      this.F(cte.kV);
      this.F(cte.kW);
      this.F(cte.kX);
      this.F(cte.kY);
      this.F(cte.kZ);
      this.F(cte.la);
      this.F(cte.lb);
      this.F(cte.lc);
      this.F(cte.ld);
      this.F(cte.le);
      this.F(cte.lf);
      this.b(cte.mX, ll.p);
      this.c(cte.mX);
      this.a(lg.a("chest"), cte.n).b(cte.cv, cte.gV);
      this.a(lg.a("ender_chest"), cte.co).b(cte.fG);
      this.d(cte.fx, cte.co).a(cte.fx, cte.kF);
      this.a(cte.aM);
      this.a(cte.aN);
      this.a(cte.lw);
      this.a(cte.lx);
      this.a(cte.ly);
      this.a(cte.lz);
      this.a(cte.lA);
      this.a(cte.lB);
      this.a(cte.lC);
      this.a(cte.lD);
      this.a(cte.lE);
      this.a(cte.lF);
      this.a(cte.lG);
      this.a(cte.lH);
      this.a(cte.lI);
      this.a(cte.lJ);
      this.a(cte.lK);
      this.a(cte.lL);
      this.a(ll.a, cte.lM, cte.lN, cte.lO, cte.lP, cte.lQ, cte.lR, cte.lS, cte.lT, cte.lU, cte.lV, cte.lW, cte.lX, cte.lY, cte.lZ, cte.ma, cte.mb);
      this.a(cte.iA);
      this.a(cte.hj);
      this.a(cte.hk);
      this.a(cte.hl);
      this.a(cte.hm);
      this.a(cte.hn);
      this.a(cte.ho);
      this.a(cte.hp);
      this.a(cte.hq);
      this.a(cte.hr);
      this.a(cte.hs);
      this.a(cte.ht);
      this.a(cte.hu);
      this.a(cte.hv);
      this.a(cte.hw);
      this.a(cte.hx);
      this.a(cte.hy);
      this.a(cte.qB);
      this.f(cte.aQ, cte.eY);
      this.f(cte.ei, cte.hz);
      this.f(cte.ej, cte.hA);
      this.f(cte.ek, cte.hB);
      this.f(cte.el, cte.hC);
      this.f(cte.em, cte.hD);
      this.f(cte.en, cte.hE);
      this.f(cte.eo, cte.hF);
      this.f(cte.ep, cte.hG);
      this.f(cte.eq, cte.hH);
      this.f(cte.er, cte.hI);
      this.f(cte.es, cte.hJ);
      this.f(cte.et, cte.hK);
      this.f(cte.eu, cte.hL);
      this.f(cte.ev, cte.hM);
      this.f(cte.ew, cte.hN);
      this.f(cte.ex, cte.hO);
      this.b(ll.n, cte.lg, cte.lh, cte.li, cte.lj, cte.lk, cte.ll, cte.lm, cte.ln, cte.lo, cte.lp, cte.lq, cte.lr, cte.ls, cte.lt, cte.lu, cte.lv);
      this.e(cte.bA, cte.ik);
      this.e(cte.bB, cte.il);
      this.e(cte.bC, cte.im);
      this.e(cte.bD, cte.in);
      this.e(cte.bE, cte.io);
      this.e(cte.bF, cte.ip);
      this.e(cte.bG, cte.iq);
      this.e(cte.bH, cte.ir);
      this.e(cte.bI, cte.is);
      this.e(cte.bJ, cte.it);
      this.e(cte.bK, cte.iu);
      this.e(cte.bL, cte.iv);
      this.e(cte.bM, cte.iw);
      this.e(cte.bN, cte.ix);
      this.e(cte.bO, cte.iy);
      this.e(cte.bP, cte.iz);
      this.a(cte.rH);
      this.a(cte.eL);
      this.a(cte.bu, cte.gb, ks.e.a);
      this.a(cte.bR, cte.gc, ks.e.b);
      this.a(cte.bT, cte.gd, ks.e.b);
      this.a(cte.bU, cte.ge, ks.e.b);
      this.a(cte.bV, cte.gf, ks.e.b);
      this.a(cte.bW, cte.gg, ks.e.b);
      this.a(cte.bX, cte.gh, ks.e.b);
      this.a(cte.bY, cte.gi, ks.e.b);
      this.a(cte.bZ, cte.gj, ks.e.b);
      this.a(cte.ca, cte.gk, ks.e.b);
      this.a(cte.cb, cte.gl, ks.e.b);
      this.a(cte.cc, cte.gm, ks.e.b);
      this.a(cte.ce, cte.gn, ks.e.b);
      this.a(cte.cd, cte.go, ks.e.b);
      this.a(cte.cg, cte.gp, ks.e.b);
      this.a(cte.cf, cte.gq, ks.e.b);
      this.a(cte.bv, cte.gr, ks.e.b);
      this.a(cte.bS, cte.fS, ks.e.b);
      this.G();
      this.u(cte.eT);
      this.u(cte.eU);
      this.u(cte.eV);
      this.a(cte.bt, ks.e.a);
      this.b(cte.dS, ks.e.a);
      this.a(cjo.dn);
      this.b(cte.mc, cte.md, ks.e.b);
      this.a(cjo.do);
      this.c(cte.md);
      this.b(cte.rF, ks.e.b);
      this.c(cte.rF);
      this.c(cte.rv);
      this.b(cte.oz, cte.oA, ks.e.b);
      this.b(cte.oB, cte.oC, ks.e.b);
      this.a(cte.oz, "_plant");
      this.c(cte.oA);
      this.a(cte.oB, "_plant");
      this.c(cte.oC);
      this.a(cte.mY, ks.e.a, lj.c(lj.a(cte.mZ, "_stage0")));
      this.m();
      this.a(cte.bs, ks.e.b);
      this.c(cte.iE, ks.e.b);
      this.c(cte.iF, ks.e.b);
      this.c(cte.iG, ks.e.b);
      this.c(cte.iH, ks.e.a);
      this.c(cte.iI, ks.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cte.mw, cte.mr, cte.mm, cte.mh, cte.mG, cte.mB, cte.mQ, cte.mL);
      this.a(cte.mx, cte.ms, cte.mn, cte.mi, cte.mH, cte.mC, cte.mR, cte.mM);
      this.a(cte.my, cte.mt, cte.mo, cte.mj, cte.mI, cte.mD, cte.mS, cte.mN);
      this.a(cte.mz, cte.mu, cte.mp, cte.mk, cte.mJ, cte.mE, cte.mT, cte.mO);
      this.a(cte.mA, cte.mv, cte.mq, cte.ml, cte.mK, cte.mF, cte.mU, cte.mP);
      this.c(cte.fe, cte.fc);
      this.c(cte.fd, cte.fb);
      this.l(cte.ab).c(cte.ab).a(cte.av);
      this.l(cte.am).c(cte.am).a(cte.aD);
      this.a(cte.am, cte.dj, cte.ds);
      this.b(cte.aL, ll.r);
      this.l(cte.Y).c(cte.Y).a(cte.as);
      this.l(cte.ai).c(cte.ai).a(cte.aA);
      this.a(cte.ai, cte.dd, cte.do);
      this.a(cte.B, cte.fX, ks.e.b);
      this.b(cte.aI, ll.r);
      this.l(cte.Z).d(cte.Z).a(cte.at);
      this.l(cte.aj).d(cte.aj).a(cte.aB);
      this.a(cte.aj, cte.de, cte.dp);
      this.a(cte.C, cte.fY, ks.e.b);
      this.b(cte.aJ, ll.r);
      this.l(cte.W).c(cte.W).a(cte.aq);
      this.l(cte.ag).c(cte.ag).a(cte.ay);
      this.a(cte.ag, cte.dc, cte.dn);
      this.a(cte.z, cte.fV, ks.e.b);
      this.b(cte.aG, ll.r);
      this.l(cte.U).c(cte.U).a(cte.ao);
      this.l(cte.al).c(cte.al).a(cte.aw);
      this.a(cte.al, cte.da, cte.dl);
      this.a(cte.x, cte.fT, ks.e.b);
      this.b(cte.aE, ll.r);
      this.l(cte.V).c(cte.V).a(cte.ap);
      this.l(cte.af).c(cte.af).a(cte.ax);
      this.a(cte.af, cte.db, cte.dm);
      this.a(cte.y, cte.fU, ks.e.b);
      this.b(cte.aF, ll.r);
      this.l(cte.aa).c(cte.aa).a(cte.au);
      this.l(cte.ak).c(cte.ak).a(cte.aC);
      this.a(cte.ak, cte.dg, cte.dr);
      this.a(cte.D, cte.fZ, ks.e.b);
      this.b(cte.aK, ll.r);
      this.l(cte.X).c(cte.X).a(cte.ar);
      this.l(cte.ah).c(cte.ah).a(cte.az);
      this.a(cte.ah, cte.df, cte.dq);
      this.a(cte.A, cte.fW, ks.e.b);
      this.b(cte.aH, ll.r);
      this.l(cte.os).b(cte.os).a(cte.ou);
      this.l(cte.ot).b(cte.ot).a(cte.ov);
      this.a(cte.ot, cte.dh, cte.dt);
      this.a(cte.ox, cte.pm, ks.e.b);
      this.k(cte.oD, cte.po);
      this.l(cte.oj).b(cte.oj).a(cte.ol);
      this.l(cte.ok).b(cte.ok).a(cte.om);
      this.a(cte.ok, cte.di, cte.du);
      this.a(cte.oo, cte.pn, ks.e.b);
      this.k(cte.oq, cte.pp);
      this.l(cte.ae).d(cte.ae);
      this.l(cte.an).d(cte.an);
      this.a(cte.v, cte.dk, cte.dv);
      this.b(cte.or, ks.e.b);
      this.a(cjo.dk);
      this.i(cte.dy);
      this.k(cte.hY);
      this.u();
      this.n(cte.cP);
      this.o(cte.bp);
      this.o(cte.bq);
      this.o(cte.hh);
      this.t();
      this.q(cte.fN);
      this.q(cte.kG);
      this.q(cte.kH);
      this.r(cte.gS);
      this.r(cte.gT);
      this.r(cte.gU);
      this.o();
      this.p();
      this.d(cte.cD, ll.g);
      this.d(cte.nW, ll.g);
      this.d(cte.nV, ll.h);
      this.s();
      this.ay();
      this.at();
      this.h(cte.eK, cte.eS);
      this.h(cte.m, cte.eO);
      this.h(cte.eJ, cte.eR);
      this.h(cte.eI, cte.eQ);
      this.aw();
      this.h(cte.eH, cte.eP);
      this.ax();
      ckq.h().forEach($$0 -> this.a($$0, lg.b("template_spawn_egg")));
   }

   private void aB() {
      this.c(cte.hX);
      kz.a<Integer> $$0 = kz.a(dft.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         aez $$3 = lj.a(cjo.hg, $$2);
         $$0.a($$1, lb.a().a(lc.c, li.Y.a(cte.hX, $$2, lj.h($$3), this.c)));
         li.bv.a(lg.a(cjo.hg, $$2), lj.k($$3), this.c);
      }

      this.b.accept(ky.a(cte.hX).a($$0));
   }

   private void l(ctc $$0, ctc $$1) {
      this.a($$0.k());
      lj $$2 = lj.b(lj.G($$0));
      lj $$3 = lj.b(lj.a($$0, "_lit"));
      aez $$4 = li.bF.a($$0, "_one_candle", $$2, this.c);
      aez $$5 = li.bG.a($$0, "_two_candles", $$2, this.c);
      aez $$6 = li.bH.a($$0, "_three_candles", $$2, this.c);
      aez $$7 = li.bI.a($$0, "_four_candles", $$2, this.c);
      aez $$8 = li.bF.a($$0, "_one_candle_lit", $$3, this.c);
      aez $$9 = li.bG.a($$0, "_two_candles_lit", $$3, this.c);
      aez $$10 = li.bH.a($$0, "_three_candles_lit", $$3, this.c);
      aez $$11 = li.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            ky.a($$0)
               .a(
                  kz.a(dft.az, dft.r)
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
      aez $$12 = li.bJ.a($$1, lj.a($$0, false), this.c);
      aez $$13 = li.bJ.a($$1, "_lit", lj.a($$0, true), this.c);
      this.b.accept(ky.a($$1).a(a(dft.r, $$13, $$12)));
   }

   class a {
      private final aez b;

      public a(aez $$0, ctc $$1) {
         this.b = li.Y.a($$0, lj.u($$1), ks.this.c);
      }

      public ks.a a(ctc... $$0) {
         for (ctc $$1 : $$0) {
            ks.this.b.accept(ks.c($$1, this.b));
         }

         return this;
      }

      public ks.a b(ctc... $$0) {
         for (ctc $$1 : $$0) {
            ks.this.c($$1);
         }

         return this.a($$0);
      }

      public ks.a a(lh $$0, ctc... $$1) {
         for (ctc $$2 : $$1) {
            $$0.a(lg.a($$2.k()), lj.u($$2), ks.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final lj b;
      private final Map<lh, aez> c = Maps.newHashMap();
      @Nullable
      private jf d;
      @Nullable
      private aez e;

      public b(lj $$0) {
         this.b = $$0;
      }

      public ks.b a(ctc $$0, lh $$1) {
         this.e = $$1.a($$0, this.b, ks.this.c);
         if (ks.this.f.containsKey($$0)) {
            ks.this.b.accept(ks.this.f.get($$0).create($$0, this.e, this.b, ks.this.c));
         } else {
            ks.this.b.accept(ks.c($$0, this.e));
         }

         return this;
      }

      public ks.b a(ctc... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (ctc $$1 : $$0) {
               ks.this.b.accept(ks.c($$1, this.e));
               ks.this.a($$1, this.e);
            }

            return this;
         }
      }

      public ks.b a(ctc $$0) {
         aez $$1 = li.q.a($$0, this.b, ks.this.c);
         aez $$2 = li.r.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.b($$0, $$1, $$2));
         aez $$3 = li.s.a($$0, this.b, ks.this.c);
         ks.this.a($$0, $$3);
         return this;
      }

      public ks.b b(ctc $$0) {
         aez $$1 = li.K.a($$0, this.b, ks.this.c);
         aez $$2 = li.L.a($$0, this.b, ks.this.c);
         aez $$3 = li.M.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$1, $$2, $$3));
         aez $$4 = li.N.a($$0, this.b, ks.this.c);
         ks.this.a($$0, $$4);
         return this;
      }

      public ks.b c(ctc $$0) {
         lj $$1 = lj.p($$0);
         aez $$2 = li.B.a($$0, $$1, ks.this.c);
         aez $$3 = li.C.a($$0, $$1, ks.this.c);
         aez $$4 = li.D.a($$0, $$1, ks.this.c);
         aez $$5 = li.E.a($$0, $$1, ks.this.c);
         aez $$6 = li.F.a($$0, $$1, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$2, $$3, $$4, $$5, $$6));
         aez $$7 = li.G.a($$0, $$1, ks.this.c);
         ks.this.a($$0, $$7);
         return this;
      }

      public ks.b d(ctc $$0) {
         aez $$1 = li.H.a($$0, this.b, ks.this.c);
         aez $$2 = li.I.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.c($$0, $$1, $$2));
         aez $$3 = li.J.a($$0, this.b, ks.this.c);
         ks.this.a($$0, $$3);
         return this;
      }

      public ks.b e(ctc $$0) {
         lj $$1 = lj.p($$0);
         aez $$2 = li.P.a($$0, $$1, ks.this.c);
         aez $$3 = li.O.a($$0, $$1, ks.this.c);
         aez $$4 = li.R.a($$0, $$1, ks.this.c);
         aez $$5 = li.Q.a($$0, $$1, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ks.b f(ctc $$0) {
         aez $$1 = li.T.a($$0, this.b, ks.this.c);
         aez $$2 = li.S.a($$0, this.b, ks.this.c);
         aez $$3 = li.V.a($$0, this.b, ks.this.c);
         aez $$4 = li.U.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ks.b g(ctc $$0) {
         aez $$1 = li.W.a($$0, this.b, ks.this.c);
         aez $$2 = li.X.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.e($$0, $$1, $$2));
         return this;
      }

      public ks.b h(ctc $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            ctc $$1 = this.d.b().get(jf.b.r);
            aez $$2 = li.Y.a($$0, this.b, ks.this.c);
            ks.this.b.accept(ks.c($$0, $$2));
            ks.this.b.accept(ks.c($$1, $$2));
            ks.this.a($$0.k());
            ks.this.c($$1);
            return this;
         }
      }

      public ks.b i(ctc $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aez $$1 = this.a(li.Z, $$0);
            aez $$2 = this.a(li.aa, $$0);
            ks.this.b.accept(ks.e($$0, $$1, $$2, this.e));
            ks.this.a($$0, $$1);
            return this;
         }
      }

      public ks.b j(ctc $$0) {
         aez $$1 = this.a(li.ad, $$0);
         aez $$2 = this.a(li.ac, $$0);
         aez $$3 = this.a(li.ae, $$0);
         ks.this.b.accept(ks.b($$0, $$1, $$2, $$3));
         ks.this.a($$0, $$2);
         return this;
      }

      private ks.b k(ctc $$0) {
         ll $$1 = ks.this.g.getOrDefault($$0, ll.a.get($$0));
         ks.this.b.accept(ks.c($$0, $$1.a($$0, ks.this.c)));
         return this;
      }

      private ks.b l(ctc $$0) {
         ks.this.i($$0);
         return this;
      }

      private void m(ctc $$0) {
         if (ks.this.e.contains($$0)) {
            ks.this.k($$0);
         } else {
            ks.this.j($$0);
         }
      }

      private aez a(lh $$0, ctc $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ks.this.c));
      }

      public ks.b a(jf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<ks.b, ctc> $$2 = ks.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      kv create(ctc var1, aez var2, lj var3, BiConsumer<aez, Supplier<JsonElement>> var4);
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

      public ks.f a(ctc $$0) {
         lj $$1 = this.b.c(lk.d, this.b.a(lk.i));
         aez $$2 = li.i.a($$0, $$1, ks.this.c);
         ks.this.b.accept(ks.d($$0, $$2));
         return this;
      }

      public ks.f b(ctc $$0) {
         aez $$1 = li.i.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.d($$0, $$1));
         return this;
      }

      public ks.f c(ctc $$0) {
         aez $$1 = li.i.a($$0, this.b, ks.this.c);
         aez $$2 = li.j.a($$0, this.b, ks.this.c);
         ks.this.b.accept(ks.d($$0, $$1, $$2));
         return this;
      }

      public ks.f d(ctc $$0) {
         ks.this.b.accept(ks.a($$0, this.b, ks.this.c));
         return this;
      }
   }
}
