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

public class lp {
   final Consumer<ls> b;
   final BiConsumer<afw, Supplier<JsonElement>> c;
   private final Consumer<cke> d;
   final List<cua> e = ImmutableList.of(cuc.ey, cuc.eE, cuc.hY);
   final Map<cua, lp.c> f = ImmutableMap.builder().put(cuc.b, lp::a).put(cuc.rI, lp::c).put(cuc.eM, lp::b).build();
   final Map<cua, mi> g = ImmutableMap.builder()
      .put(cuc.aV, mi.x.get(cuc.aV))
      .put(cuc.jp, mi.x.get(cuc.jp))
      .put(cuc.jS, mi.a(mg.a(cuc.aV, "_top")))
      .put(cuc.jU, mi.a(mg.a(cuc.jp, "_top")))
      .put(cuc.aX, mi.c.get(cuc.aV).a($$0x -> $$0x.a(mh.i, mg.G(cuc.aX))))
      .put(cuc.jr, mi.c.get(cuc.jp).a($$0x -> $$0x.a(mh.i, mg.G(cuc.jr))))
      .put(cuc.hd, mi.c.get(cuc.hd))
      .put(cuc.jT, mi.a(mg.a(cuc.hd, "_bottom")))
      .put(cuc.pr, mi.y.get(cuc.pr))
      .put(cuc.rI, mi.y.get(cuc.rI))
      .put(cuc.he, mi.c.get(cuc.he).a($$0x -> $$0x.a(mh.i, mg.G(cuc.he))))
      .put(cuc.aW, mi.c.get(cuc.aW).a($$0x -> {
         $$0x.a(mh.d, mg.a(cuc.aV, "_top"));
         $$0x.a(mh.i, mg.G(cuc.aW));
      }))
      .put(cuc.jq, mi.c.get(cuc.jq).a($$0x -> {
         $$0x.a(mh.d, mg.a(cuc.jp, "_top"));
         $$0x.a(mh.i, mg.G(cuc.jq));
      }))
      .build();
   static final Map<kc.b, BiConsumer<lp.b, cua>> h = ImmutableMap.builder()
      .put(kc.b.a, lp.b::a)
      .put(kc.b.e, lp.b::l)
      .put(kc.b.b, lp.b::k)
      .put(kc.b.c, lp.b::k)
      .put(kc.b.f, lp.b::c)
      .put(kc.b.g, lp.b::d)
      .put(kc.b.h, lp.b::e)
      .put(kc.b.i, lp.b::f)
      .put(kc.b.k, lp.b::h)
      .put(kc.b.l, lp.b::i)
      .put(kc.b.m, lp.b::j)
      .put(kc.b.n, lp.b::g)
      .put(kc.b.p, lp.b::m)
      .put(kc.b.q, lp.b::b)
      .build();
   public static final List<Pair<dgs, Function<afw, ly>>> a = List.of(
      Pair.of(dgr.L, (Function<afw, ly>)$$0 -> ly.a().a(lz.c, $$0)),
      Pair.of(dgr.M, (Function<afw, ly>)$$0 -> ly.a().a(lz.c, $$0).a(lz.b, lz.a.b).a(lz.d, true)),
      Pair.of(dgr.N, (Function<afw, ly>)$$0 -> ly.a().a(lz.c, $$0).a(lz.b, lz.a.c).a(lz.d, true)),
      Pair.of(dgr.O, (Function<afw, ly>)$$0 -> ly.a().a(lz.c, $$0).a(lz.b, lz.a.d).a(lz.d, true)),
      Pair.of(dgr.J, (Function<afw, ly>)$$0 -> ly.a().a(lz.c, $$0).a(lz.a, lz.a.d).a(lz.d, true)),
      Pair.of(dgr.K, (Function<afw, ly>)$$0 -> ly.a().a(lz.c, $$0).a(lz.a, lz.a.b).a(lz.d, true))
   );
   private static final Map<lp.d, afw> i = new HashMap<>();

   private static ls a(cua $$0, afw $$1, mg $$2, BiConsumer<afw, Supplier<JsonElement>> $$3) {
      afw $$4 = mf.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static ls b(cua $$0, afw $$1, mg $$2, BiConsumer<afw, Supplier<JsonElement>> $$3) {
      afw $$4 = mf.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static ls c(cua $$0, afw $$1, mg $$2, BiConsumer<afw, Supplier<JsonElement>> $$3) {
      afw $$4 = mf.k.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public lp(Consumer<ls> $$0, BiConsumer<afw, Supplier<JsonElement>> $$1, Consumer<cke> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(cua $$0) {
      this.d.accept($$0.k());
   }

   void a(cua $$0, afw $$1) {
      this.c.accept(md.a($$0.k()), new mc($$1));
   }

   private void a(cke $$0, afw $$1) {
      this.c.accept(md.a($$0), new mc($$1));
   }

   void a(cke $$0) {
      mf.bv.a(md.a($$0), mg.b($$0), this.c);
   }

   private void d(cua $$0) {
      cke $$1 = $$0.k();
      if ($$1 != ckm.a) {
         mf.bv.a(md.a($$1), mg.F($$0), this.c);
      }
   }

   private void a(cua $$0, String $$1) {
      cke $$2 = $$0.k();
      mf.bv.a(md.a($$2), mg.k(mg.a($$0, $$1)), this.c);
   }

   private static lw b() {
      return lw.a(dgr.R).a(hx.f, ly.a().a(lz.b, lz.a.b)).a(hx.d, ly.a().a(lz.b, lz.a.c)).a(hx.e, ly.a().a(lz.b, lz.a.d)).a(hx.c, ly.a());
   }

   private static lw c() {
      return lw.a(dgr.R).a(hx.d, ly.a()).a(hx.e, ly.a().a(lz.b, lz.a.b)).a(hx.c, ly.a().a(lz.b, lz.a.c)).a(hx.f, ly.a().a(lz.b, lz.a.d));
   }

   private static lw d() {
      return lw.a(dgr.R).a(hx.f, ly.a()).a(hx.d, ly.a().a(lz.b, lz.a.b)).a(hx.e, ly.a().a(lz.b, lz.a.c)).a(hx.c, ly.a().a(lz.b, lz.a.d));
   }

   private static lw e() {
      return lw.a(dgr.P)
         .a(hx.a, ly.a().a(lz.a, lz.a.b))
         .a(hx.b, ly.a().a(lz.a, lz.a.d))
         .a(hx.c, ly.a())
         .a(hx.d, ly.a().a(lz.b, lz.a.c))
         .a(hx.e, ly.a().a(lz.b, lz.a.d))
         .a(hx.f, ly.a().a(lz.b, lz.a.b));
   }

   private static lv b(cua $$0, afw $$1) {
      return lv.a($$0, a($$1));
   }

   private static ly[] a(afw $$0) {
      return new ly[]{ly.a().a(lz.c, $$0), ly.a().a(lz.c, $$0).a(lz.b, lz.a.b), ly.a().a(lz.c, $$0).a(lz.b, lz.a.c), ly.a().a(lz.c, $$0).a(lz.b, lz.a.d)};
   }

   private static lv a(cua $$0, afw $$1, afw $$2) {
      return lv.a($$0, ly.a().a(lz.c, $$1), ly.a().a(lz.c, $$2), ly.a().a(lz.c, $$1).a(lz.b, lz.a.c), ly.a().a(lz.c, $$2).a(lz.b, lz.a.c));
   }

   private static lw a(dgs $$0, afw $$1, afw $$2) {
      return lw.a($$0).a(true, ly.a().a(lz.c, $$1)).a(false, ly.a().a(lz.c, $$2));
   }

   private void e(cua $$0) {
      afw $$1 = mi.a.create($$0, this.c);
      afw $$2 = mi.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(cua $$0) {
      afw $$1 = mi.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(cua $$0) {
      this.b.accept(lv.a($$0).a(lw.a(dgr.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         afw $$3 = mg.a($$0, $$2);
         return ly.a().a(lz.c, mf.c.a($$0, $$2, new mg().a(mh.a, $$3), this.c));
      })));
      this.a($$0, mg.a($$0, "_0"));
   }

   static ls b(cua $$0, afw $$1, afw $$2) {
      return lv.a($$0)
         .a(lw.a(dgr.w).a(false, ly.a().a(lz.c, $$1)).a(true, ly.a().a(lz.c, $$2)))
         .a(
            lw.a(dgr.U, dgr.R)
               .a(dgm.a, hx.f, ly.a().a(lz.b, lz.a.b))
               .a(dgm.a, hx.e, ly.a().a(lz.b, lz.a.d))
               .a(dgm.a, hx.d, ly.a().a(lz.b, lz.a.c))
               .a(dgm.a, hx.c, ly.a())
               .a(dgm.b, hx.f, ly.a().a(lz.b, lz.a.b).a(lz.a, lz.a.b).a(lz.d, true))
               .a(dgm.b, hx.e, ly.a().a(lz.b, lz.a.d).a(lz.a, lz.a.b).a(lz.d, true))
               .a(dgm.b, hx.d, ly.a().a(lz.b, lz.a.c).a(lz.a, lz.a.b).a(lz.d, true))
               .a(dgm.b, hx.c, ly.a().a(lz.a, lz.a.b).a(lz.d, true))
               .a(dgm.c, hx.f, ly.a().a(lz.b, lz.a.d).a(lz.a, lz.a.c))
               .a(dgm.c, hx.e, ly.a().a(lz.b, lz.a.b).a(lz.a, lz.a.c))
               .a(dgm.c, hx.d, ly.a().a(lz.a, lz.a.c))
               .a(dgm.c, hx.c, ly.a().a(lz.b, lz.a.c).a(lz.a, lz.a.c))
         );
   }

   private static lw.d<hx, dgx, dgw, Boolean> a(lw.d<hx, dgx, dgw, Boolean> $$0, dgx $$1, afw $$2, afw $$3, afw $$4, afw $$5) {
      return $$0.a(hx.f, $$1, dgw.a, false, ly.a().a(lz.c, $$2))
         .a(hx.d, $$1, dgw.a, false, ly.a().a(lz.c, $$2).a(lz.b, lz.a.b))
         .a(hx.e, $$1, dgw.a, false, ly.a().a(lz.c, $$2).a(lz.b, lz.a.c))
         .a(hx.c, $$1, dgw.a, false, ly.a().a(lz.c, $$2).a(lz.b, lz.a.d))
         .a(hx.f, $$1, dgw.b, false, ly.a().a(lz.c, $$4))
         .a(hx.d, $$1, dgw.b, false, ly.a().a(lz.c, $$4).a(lz.b, lz.a.b))
         .a(hx.e, $$1, dgw.b, false, ly.a().a(lz.c, $$4).a(lz.b, lz.a.c))
         .a(hx.c, $$1, dgw.b, false, ly.a().a(lz.c, $$4).a(lz.b, lz.a.d))
         .a(hx.f, $$1, dgw.a, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.b))
         .a(hx.d, $$1, dgw.a, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.c))
         .a(hx.e, $$1, dgw.a, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.d))
         .a(hx.c, $$1, dgw.a, true, ly.a().a(lz.c, $$3))
         .a(hx.f, $$1, dgw.b, true, ly.a().a(lz.c, $$5).a(lz.b, lz.a.d))
         .a(hx.d, $$1, dgw.b, true, ly.a().a(lz.c, $$5))
         .a(hx.e, $$1, dgw.b, true, ly.a().a(lz.c, $$5).a(lz.b, lz.a.b))
         .a(hx.c, $$1, dgw.b, true, ly.a().a(lz.c, $$5).a(lz.b, lz.a.c));
   }

   private static ls a(cua $$0, afw $$1, afw $$2, afw $$3, afw $$4, afw $$5, afw $$6, afw $$7, afw $$8) {
      return lv.a($$0).a(a(a(lw.a(dgr.R, dgr.ae, dgr.be, dgr.u), dgx.b, $$1, $$2, $$3, $$4), dgx.a, $$5, $$6, $$7, $$8));
   }

   static ls a(cua $$0, afw $$1, afw $$2, afw $$3, afw $$4, afw $$5) {
      return lu.a($$0)
         .a(ly.a().a(lz.c, $$1))
         .a(lt.a().a(dgr.L, true), ly.a().a(lz.c, $$2).a(lz.d, false))
         .a(lt.a().a(dgr.M, true), ly.a().a(lz.c, $$3).a(lz.d, false))
         .a(lt.a().a(dgr.N, true), ly.a().a(lz.c, $$4).a(lz.d, false))
         .a(lt.a().a(dgr.O, true), ly.a().a(lz.c, $$5).a(lz.d, false));
   }

   static ls c(cua $$0, afw $$1, afw $$2) {
      return lu.a($$0)
         .a(ly.a().a(lz.c, $$1))
         .a(lt.a().a(dgr.L, true), ly.a().a(lz.c, $$2).a(lz.d, true))
         .a(lt.a().a(dgr.M, true), ly.a().a(lz.c, $$2).a(lz.b, lz.a.b).a(lz.d, true))
         .a(lt.a().a(dgr.N, true), ly.a().a(lz.c, $$2).a(lz.b, lz.a.c).a(lz.d, true))
         .a(lt.a().a(dgr.O, true), ly.a().a(lz.c, $$2).a(lz.b, lz.a.d).a(lz.d, true));
   }

   static ls a(cua $$0, afw $$1, afw $$2, afw $$3) {
      return lu.a($$0)
         .a(lt.a().a(dgr.J, true), ly.a().a(lz.c, $$1))
         .a(lt.a().a(dgr.X, dhn.b), ly.a().a(lz.c, $$2).a(lz.d, true))
         .a(lt.a().a(dgr.W, dhn.b), ly.a().a(lz.c, $$2).a(lz.b, lz.a.b).a(lz.d, true))
         .a(lt.a().a(dgr.Y, dhn.b), ly.a().a(lz.c, $$2).a(lz.b, lz.a.c).a(lz.d, true))
         .a(lt.a().a(dgr.Z, dhn.b), ly.a().a(lz.c, $$2).a(lz.b, lz.a.d).a(lz.d, true))
         .a(lt.a().a(dgr.X, dhn.c), ly.a().a(lz.c, $$3).a(lz.d, true))
         .a(lt.a().a(dgr.W, dhn.c), ly.a().a(lz.c, $$3).a(lz.b, lz.a.b).a(lz.d, true))
         .a(lt.a().a(dgr.Y, dhn.c), ly.a().a(lz.c, $$3).a(lz.b, lz.a.c).a(lz.d, true))
         .a(lt.a().a(dgr.Z, dhn.c), ly.a().a(lz.c, $$3).a(lz.b, lz.a.d).a(lz.d, true));
   }

   static ls a(cua $$0, afw $$1, afw $$2, afw $$3, afw $$4, boolean $$5) {
      return lv.a($$0, ly.a().a(lz.d, $$5))
         .a(c())
         .a(
            lw.a(dgr.q, dgr.u)
               .a(false, false, ly.a().a(lz.c, $$2))
               .a(true, false, ly.a().a(lz.c, $$4))
               .a(false, true, ly.a().a(lz.c, $$1))
               .a(true, true, ly.a().a(lz.c, $$3))
         );
   }

   static ls b(cua $$0, afw $$1, afw $$2, afw $$3) {
      return lv.a($$0)
         .a(
            lw.a(dgr.R, dgr.af, dgr.bi)
               .a(hx.f, dha.b, dhk.a, ly.a().a(lz.c, $$2))
               .a(hx.e, dha.b, dhk.a, ly.a().a(lz.c, $$2).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.d, dha.b, dhk.a, ly.a().a(lz.c, $$2).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.c, dha.b, dhk.a, ly.a().a(lz.c, $$2).a(lz.b, lz.a.d).a(lz.d, true))
               .a(hx.f, dha.b, dhk.e, ly.a().a(lz.c, $$3))
               .a(hx.e, dha.b, dhk.e, ly.a().a(lz.c, $$3).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.d, dha.b, dhk.e, ly.a().a(lz.c, $$3).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.c, dha.b, dhk.e, ly.a().a(lz.c, $$3).a(lz.b, lz.a.d).a(lz.d, true))
               .a(hx.f, dha.b, dhk.d, ly.a().a(lz.c, $$3).a(lz.b, lz.a.d).a(lz.d, true))
               .a(hx.e, dha.b, dhk.d, ly.a().a(lz.c, $$3).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.d, dha.b, dhk.d, ly.a().a(lz.c, $$3))
               .a(hx.c, dha.b, dhk.d, ly.a().a(lz.c, $$3).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.f, dha.b, dhk.c, ly.a().a(lz.c, $$1))
               .a(hx.e, dha.b, dhk.c, ly.a().a(lz.c, $$1).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.d, dha.b, dhk.c, ly.a().a(lz.c, $$1).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.c, dha.b, dhk.c, ly.a().a(lz.c, $$1).a(lz.b, lz.a.d).a(lz.d, true))
               .a(hx.f, dha.b, dhk.b, ly.a().a(lz.c, $$1).a(lz.b, lz.a.d).a(lz.d, true))
               .a(hx.e, dha.b, dhk.b, ly.a().a(lz.c, $$1).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.d, dha.b, dhk.b, ly.a().a(lz.c, $$1))
               .a(hx.c, dha.b, dhk.b, ly.a().a(lz.c, $$1).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.f, dha.a, dhk.a, ly.a().a(lz.c, $$2).a(lz.a, lz.a.c).a(lz.d, true))
               .a(hx.e, dha.a, dhk.a, ly.a().a(lz.c, $$2).a(lz.a, lz.a.c).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.d, dha.a, dhk.a, ly.a().a(lz.c, $$2).a(lz.a, lz.a.c).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.c, dha.a, dhk.a, ly.a().a(lz.c, $$2).a(lz.a, lz.a.c).a(lz.b, lz.a.d).a(lz.d, true))
               .a(hx.f, dha.a, dhk.e, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.e, dha.a, dhk.e, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.d).a(lz.d, true))
               .a(hx.d, dha.a, dhk.e, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.c, dha.a, dhk.e, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.d, true))
               .a(hx.f, dha.a, dhk.d, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.d, true))
               .a(hx.e, dha.a, dhk.d, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.d, dha.a, dhk.d, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.c, dha.a, dhk.d, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.d).a(lz.d, true))
               .a(hx.f, dha.a, dhk.c, ly.a().a(lz.c, $$1).a(lz.a, lz.a.c).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.e, dha.a, dhk.c, ly.a().a(lz.c, $$1).a(lz.a, lz.a.c).a(lz.b, lz.a.d).a(lz.d, true))
               .a(hx.d, dha.a, dhk.c, ly.a().a(lz.c, $$1).a(lz.a, lz.a.c).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.c, dha.a, dhk.c, ly.a().a(lz.c, $$1).a(lz.a, lz.a.c).a(lz.d, true))
               .a(hx.f, dha.a, dhk.b, ly.a().a(lz.c, $$1).a(lz.a, lz.a.c).a(lz.d, true))
               .a(hx.e, dha.a, dhk.b, ly.a().a(lz.c, $$1).a(lz.a, lz.a.c).a(lz.b, lz.a.c).a(lz.d, true))
               .a(hx.d, dha.a, dhk.b, ly.a().a(lz.c, $$1).a(lz.a, lz.a.c).a(lz.b, lz.a.b).a(lz.d, true))
               .a(hx.c, dha.a, dhk.b, ly.a().a(lz.c, $$1).a(lz.a, lz.a.c).a(lz.b, lz.a.d).a(lz.d, true))
         );
   }

   private static ls c(cua $$0, afw $$1, afw $$2, afw $$3) {
      return lv.a($$0)
         .a(
            lw.a(dgr.R, dgr.af, dgr.u)
               .a(hx.c, dha.b, false, ly.a().a(lz.c, $$2))
               .a(hx.d, dha.b, false, ly.a().a(lz.c, $$2).a(lz.b, lz.a.c))
               .a(hx.f, dha.b, false, ly.a().a(lz.c, $$2).a(lz.b, lz.a.b))
               .a(hx.e, dha.b, false, ly.a().a(lz.c, $$2).a(lz.b, lz.a.d))
               .a(hx.c, dha.a, false, ly.a().a(lz.c, $$1))
               .a(hx.d, dha.a, false, ly.a().a(lz.c, $$1).a(lz.b, lz.a.c))
               .a(hx.f, dha.a, false, ly.a().a(lz.c, $$1).a(lz.b, lz.a.b))
               .a(hx.e, dha.a, false, ly.a().a(lz.c, $$1).a(lz.b, lz.a.d))
               .a(hx.c, dha.b, true, ly.a().a(lz.c, $$3))
               .a(hx.d, dha.b, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.c))
               .a(hx.f, dha.b, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.b))
               .a(hx.e, dha.b, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.d))
               .a(hx.c, dha.a, true, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.c))
               .a(hx.d, dha.a, true, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.a))
               .a(hx.f, dha.a, true, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.d))
               .a(hx.e, dha.a, true, ly.a().a(lz.c, $$3).a(lz.a, lz.a.c).a(lz.b, lz.a.b))
         );
   }

   private static ls d(cua $$0, afw $$1, afw $$2, afw $$3) {
      return lv.a($$0)
         .a(
            lw.a(dgr.R, dgr.af, dgr.u)
               .a(hx.c, dha.b, false, ly.a().a(lz.c, $$2))
               .a(hx.d, dha.b, false, ly.a().a(lz.c, $$2))
               .a(hx.f, dha.b, false, ly.a().a(lz.c, $$2))
               .a(hx.e, dha.b, false, ly.a().a(lz.c, $$2))
               .a(hx.c, dha.a, false, ly.a().a(lz.c, $$1))
               .a(hx.d, dha.a, false, ly.a().a(lz.c, $$1))
               .a(hx.f, dha.a, false, ly.a().a(lz.c, $$1))
               .a(hx.e, dha.a, false, ly.a().a(lz.c, $$1))
               .a(hx.c, dha.b, true, ly.a().a(lz.c, $$3))
               .a(hx.d, dha.b, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.c))
               .a(hx.f, dha.b, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.b))
               .a(hx.e, dha.b, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.d))
               .a(hx.c, dha.a, true, ly.a().a(lz.c, $$3))
               .a(hx.d, dha.a, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.c))
               .a(hx.f, dha.a, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.b))
               .a(hx.e, dha.a, true, ly.a().a(lz.c, $$3).a(lz.b, lz.a.d))
         );
   }

   static lv c(cua $$0, afw $$1) {
      return lv.a($$0, ly.a().a(lz.c, $$1));
   }

   private static lw f() {
      return lw.a(dgr.I).a(hx.a.b, ly.a()).a(hx.a.c, ly.a().a(lz.a, lz.a.b)).a(hx.a.a, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.b));
   }

   static ls a(cua $$0, mg $$1, BiConsumer<afw, Supplier<JsonElement>> $$2) {
      afw $$3 = mf.f.a($$0, $$1, $$2);
      afw $$4 = mf.g.a($$0, $$1, $$2);
      afw $$5 = mf.h.a($$0, $$1, $$2);
      afw $$6 = mf.i.a($$0, $$1, $$2);
      return lv.a($$0, ly.a().a(lz.c, $$6)).a(lw.a(dgr.I).a(hx.a.a, ly.a().a(lz.c, $$3)).a(hx.a.b, ly.a().a(lz.c, $$4)).a(hx.a.c, ly.a().a(lz.c, $$5)));
   }

   static ls d(cua $$0, afw $$1) {
      return lv.a($$0, ly.a().a(lz.c, $$1)).a(f());
   }

   private void e(cua $$0, afw $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(cua $$0, mi.a $$1) {
      afw $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(cua $$0, mi.a $$1) {
      afw $$2 = $$1.create($$0, this.c);
      this.b.accept(lv.a($$0, ly.a().a(lz.c, $$2)).a(b()));
   }

   static ls d(cua $$0, afw $$1, afw $$2) {
      return lv.a($$0)
         .a(
            lw.a(dgr.I)
               .a(hx.a.b, ly.a().a(lz.c, $$1))
               .a(hx.a.c, ly.a().a(lz.c, $$2).a(lz.a, lz.a.b))
               .a(hx.a.a, ly.a().a(lz.c, $$2).a(lz.a, lz.a.b).a(lz.b, lz.a.b))
         );
   }

   private void a(cua $$0, mi.a $$1, mi.a $$2) {
      afw $$3 = $$1.create($$0, this.c);
      afw $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private afw a(cua $$0, String $$1, me $$2, Function<afw, mg> $$3) {
      return $$2.a($$0, $$1, $$3.apply(mg.a($$0, $$1)), this.c);
   }

   static ls e(cua $$0, afw $$1, afw $$2) {
      return lv.a($$0).a(a(dgr.w, $$2, $$1));
   }

   static ls e(cua $$0, afw $$1, afw $$2, afw $$3) {
      return lv.a($$0).a(lw.a(dgr.bh).a(dhj.b, ly.a().a(lz.c, $$1)).a(dhj.a, ly.a().a(lz.c, $$2)).a(dhj.c, ly.a().a(lz.c, $$3)));
   }

   public void a(cua $$0) {
      this.b($$0, mi.a);
   }

   public void b(cua $$0, mi.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cua $$0, mg $$1, me $$2) {
      afw $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private lp.b h(cua $$0) {
      mi $$1 = this.g.getOrDefault($$0, mi.a.get($$0));
      return new lp.b($$1.b()).a($$0, $$1.a());
   }

   public void a(cua $$0, cua $$1, cua $$2) {
      mg $$3 = mg.u($$0);
      afw $$4 = mf.Y.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.k());
      this.c($$2);
   }

   void i(cua $$0) {
      mg $$1 = mg.t($$0);
      afw $$2 = mf.t.a($$0, $$1, this.c);
      afw $$3 = mf.u.a($$0, $$1, this.c);
      afw $$4 = mf.v.a($$0, $$1, this.c);
      afw $$5 = mf.w.a($$0, $$1, this.c);
      afw $$6 = mf.x.a($$0, $$1, this.c);
      afw $$7 = mf.y.a($$0, $$1, this.c);
      afw $$8 = mf.z.a($$0, $$1, this.c);
      afw $$9 = mf.A.a($$0, $$1, this.c);
      this.a($$0.k());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(cua $$0) {
      mg $$1 = mg.b($$0);
      afw $$2 = mf.ai.a($$0, $$1, this.c);
      afw $$3 = mf.aj.a($$0, $$1, this.c);
      afw $$4 = mf.ak.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(cua $$0) {
      mg $$1 = mg.b($$0);
      afw $$2 = mf.af.a($$0, $$1, this.c);
      afw $$3 = mf.ag.a($$0, $$1, this.c);
      afw $$4 = mf.ah.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.c(cuc.rC);
      afw $$0 = md.a(cuc.rC);
      afw $$1 = md.a(cuc.rC, "_partial_tilt");
      afw $$2 = md.a(cuc.rC, "_full_tilt");
      this.b
         .accept(
            lv.a(cuc.rC)
               .a(b())
               .a(lw.a(dgr.bl).a(dhm.a, ly.a().a(lz.c, $$0)).a(dhm.b, ly.a().a(lz.c, $$0)).a(dhm.c, ly.a().a(lz.c, $$1)).a(dhm.d, ly.a().a(lz.c, $$2)))
         );
   }

   private lp.f l(cua $$0) {
      return new lp.f(mg.n($$0));
   }

   private void m(cua $$0) {
      this.a($$0, $$0);
   }

   private void a(cua $$0, cua $$1) {
      this.b.accept(c($$0, md.a($$1)));
   }

   private void a(cua $$0, lp.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(cua $$0, lp.e $$1, mg $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cua $$0, lp.e $$1) {
      mg $$2 = mg.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cua $$0, lp.e $$1, mg $$2) {
      afw $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cua $$0, lp.e $$1, dhe<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         lw $$4 = lw.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            mg $$5 = mg.c(mg.a($$0, $$4x));
            afw $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return ly.a().a(lz.c, $$6);
         });
         this.a($$0.k());
         this.b.accept(lv.a($$0).a($$4));
      }
   }

   private void a(cua $$0, cua $$1, lp.e $$2) {
      this.a($$0, $$2);
      mg $$3 = mg.d($$0);
      afw $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(cua $$0, cua $$1) {
      mi $$2 = mi.o.get($$0);
      afw $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      afw $$4 = mf.aA.a($$1, $$2.b(), this.c);
      this.b.accept(lv.a($$1, ly.a().a(lz.c, $$4)).a(b()));
      this.d($$0);
   }

   private void c(cua $$0, cua $$1) {
      this.a($$0.k());
      mg $$2 = mg.h($$0);
      mg $$3 = mg.a($$0, $$1);
      afw $$4 = mf.aS.a($$1, $$3, this.c);
      this.b
         .accept(
            lv.a($$1, ly.a().a(lz.c, $$4))
               .a(lw.a(dgr.R).a(hx.e, ly.a()).a(hx.d, ly.a().a(lz.b, lz.a.d)).a(hx.c, ly.a().a(lz.b, lz.a.b)).a(hx.f, ly.a().a(lz.b, lz.a.c)))
         );
      this.b.accept(lv.a($$0).a(lw.a(dgr.av).a($$2x -> ly.a().a(lz.c, mf.aR[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      cua $$0 = cuc.kC;
      this.a($$0.k());
      afw $$1 = md.a($$0, "_top");
      afw $$2 = md.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      cua $$0 = cuc.kB;
      this.a($$0.k());
      lw $$1 = lw.a(czn.d, dgr.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> ly.a().a(lz.c, md.a($$0, "_top_stage_" + $$1x));
            case b -> ly.a().a(lz.c, md.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(lv.a($$0).a($$1));
   }

   private void a(cua $$0, cua $$1, cua $$2, cua $$3, cua $$4, cua $$5, cua $$6, cua $$7) {
      this.a($$0, lp.e.b);
      this.a($$1, lp.e.b);
      this.a($$2);
      this.a($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(cua $$0, lp.e $$1) {
      this.a($$0, "_top");
      afw $$2 = this.a($$0, "_top", $$1.a(), mg::c);
      afw $$3 = this.a($$0, "_bottom", $$1.a(), mg::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(cuc.iD, "_front");
      afw $$0 = md.a(cuc.iD, "_top");
      afw $$1 = this.a(cuc.iD, "_bottom", lp.e.b.a(), mg::c);
      this.f(cuc.iD, $$0, $$1);
   }

   private void k() {
      afw $$0 = this.a(cuc.bx, "_top", mf.bi, mg::a);
      afw $$1 = this.a(cuc.bx, "_bottom", mf.bi, mg::a);
      this.f(cuc.bx, $$0, $$1);
   }

   private void l() {
      this.c(cuc.rE);
      afw $$0 = md.a(cuc.rE, "_top");
      afw $$1 = md.a(cuc.rE, "_bottom");
      this.b.accept(lv.a(cuc.rE).a(b()).a(lw.a(dgr.ae).a(dgx.b, ly.a().a(lz.c, $$1)).a(dgx.a, ly.a().a(lz.c, $$0))));
   }

   private void f(cua $$0, afw $$1, afw $$2) {
      this.b.accept(lv.a($$0).a(lw.a(dgr.ae).a(dgx.b, ly.a().a(lz.c, $$2)).a(dgx.a, ly.a().a(lz.c, $$1))));
   }

   private void n(cua $$0) {
      mg $$1 = mg.e($$0);
      mg $$2 = mg.e(mg.a($$0, "_corner"));
      afw $$3 = mf.aq.a($$0, $$1, this.c);
      afw $$4 = mf.ar.a($$0, $$2, this.c);
      afw $$5 = mf.as.a($$0, $$1, this.c);
      afw $$6 = mf.at.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            lv.a($$0)
               .a(
                  lw.a(dgr.ag)
                     .a(dhf.a, ly.a().a(lz.c, $$3))
                     .a(dhf.b, ly.a().a(lz.c, $$3).a(lz.b, lz.a.b))
                     .a(dhf.c, ly.a().a(lz.c, $$5).a(lz.b, lz.a.b))
                     .a(dhf.d, ly.a().a(lz.c, $$6).a(lz.b, lz.a.b))
                     .a(dhf.e, ly.a().a(lz.c, $$5))
                     .a(dhf.f, ly.a().a(lz.c, $$6))
                     .a(dhf.g, ly.a().a(lz.c, $$4))
                     .a(dhf.h, ly.a().a(lz.c, $$4).a(lz.b, lz.a.b))
                     .a(dhf.i, ly.a().a(lz.c, $$4).a(lz.b, lz.a.c))
                     .a(dhf.j, ly.a().a(lz.c, $$4).a(lz.b, lz.a.d))
               )
         );
   }

   private void o(cua $$0) {
      afw $$1 = this.a($$0, "", mf.aq, mg::e);
      afw $$2 = this.a($$0, "", mf.as, mg::e);
      afw $$3 = this.a($$0, "", mf.at, mg::e);
      afw $$4 = this.a($$0, "_on", mf.aq, mg::e);
      afw $$5 = this.a($$0, "_on", mf.as, mg::e);
      afw $$6 = this.a($$0, "_on", mf.at, mg::e);
      lw $$7 = lw.a(dgr.w, dgr.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return ly.a().a(lz.c, $$6x ? $$4 : $$1);
            case b:
               return ly.a().a(lz.c, $$6x ? $$4 : $$1).a(lz.b, lz.a.b);
            case c:
               return ly.a().a(lz.c, $$6x ? $$5 : $$2).a(lz.b, lz.a.b);
            case d:
               return ly.a().a(lz.c, $$6x ? $$6 : $$3).a(lz.b, lz.a.b);
            case e:
               return ly.a().a(lz.c, $$6x ? $$5 : $$2);
            case f:
               return ly.a().a(lz.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(lv.a($$0).a($$7));
   }

   private lp.a a(afw $$0, cua $$1) {
      return new lp.a($$0, $$1);
   }

   private lp.a d(cua $$0, cua $$1) {
      return new lp.a(md.a($$0), $$1);
   }

   private void a(cua $$0, cke $$1) {
      afw $$2 = mf.Y.a($$0, mg.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cua $$0, afw $$1) {
      afw $$2 = mf.Y.a($$0, mg.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(cua $$0, cua $$1) {
      this.a($$0);
      afw $$2 = mi.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(cua $$0) {
      this.a($$0.k());
      afw $$1 = mi.j.create($$0, this.c);
      afw $$2 = mi.k.create($$0, this.c);
      afw $$3 = mi.l.create($$0, this.c);
      afw $$4 = mi.m.create($$0, this.c);
      this.b
         .accept(
            lu.a($$0)
               .a(lt.a().a(dgr.S, 1, 2, 3, 4).a(dgr.R, hx.c), ly.a().a(lz.c, $$1))
               .a(lt.a().a(dgr.S, 1, 2, 3, 4).a(dgr.R, hx.f), ly.a().a(lz.c, $$1).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.S, 1, 2, 3, 4).a(dgr.R, hx.d), ly.a().a(lz.c, $$1).a(lz.b, lz.a.c))
               .a(lt.a().a(dgr.S, 1, 2, 3, 4).a(dgr.R, hx.e), ly.a().a(lz.c, $$1).a(lz.b, lz.a.d))
               .a(lt.a().a(dgr.S, 2, 3, 4).a(dgr.R, hx.c), ly.a().a(lz.c, $$2))
               .a(lt.a().a(dgr.S, 2, 3, 4).a(dgr.R, hx.f), ly.a().a(lz.c, $$2).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.S, 2, 3, 4).a(dgr.R, hx.d), ly.a().a(lz.c, $$2).a(lz.b, lz.a.c))
               .a(lt.a().a(dgr.S, 2, 3, 4).a(dgr.R, hx.e), ly.a().a(lz.c, $$2).a(lz.b, lz.a.d))
               .a(lt.a().a(dgr.S, 3, 4).a(dgr.R, hx.c), ly.a().a(lz.c, $$3))
               .a(lt.a().a(dgr.S, 3, 4).a(dgr.R, hx.f), ly.a().a(lz.c, $$3).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.S, 3, 4).a(dgr.R, hx.d), ly.a().a(lz.c, $$3).a(lz.b, lz.a.c))
               .a(lt.a().a(dgr.S, 3, 4).a(dgr.R, hx.e), ly.a().a(lz.c, $$3).a(lz.b, lz.a.d))
               .a(lt.a().a(dgr.S, 4).a(dgr.R, hx.c), ly.a().a(lz.c, $$4))
               .a(lt.a().a(dgr.S, 4).a(dgr.R, hx.f), ly.a().a(lz.c, $$4).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.S, 4).a(dgr.R, hx.d), ly.a().a(lz.c, $$4).a(lz.b, lz.a.c))
               .a(lt.a().a(dgr.S, 4).a(dgr.R, hx.e), ly.a().a(lz.c, $$4).a(lz.b, lz.a.d))
         );
   }

   private void a(mi.a $$0, cua... $$1) {
      for (cua $$2 : $$1) {
         afw $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(mi.a $$0, cua... $$1) {
      for (cua $$2 : $$1) {
         afw $$3 = $$0.create($$2, this.c);
         this.b.accept(lv.a($$2, ly.a().a(lz.c, $$3)).a(c()));
      }
   }

   private void f(cua $$0, cua $$1) {
      this.a($$0);
      mg $$2 = mg.b($$0, $$1);
      afw $$3 = mf.aG.a($$1, $$2, this.c);
      afw $$4 = mf.aH.a($$1, $$2, this.c);
      afw $$5 = mf.aI.a($$1, $$2, this.c);
      afw $$6 = mf.aE.a($$1, $$2, this.c);
      afw $$7 = mf.aF.a($$1, $$2, this.c);
      cke $$8 = $$1.k();
      mf.bv.a(md.a($$8), mg.F($$0), this.c);
      this.b
         .accept(
            lu.a($$1)
               .a(ly.a().a(lz.c, $$3))
               .a(lt.a().a(dgr.L, true), ly.a().a(lz.c, $$4))
               .a(lt.a().a(dgr.M, true), ly.a().a(lz.c, $$4).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.N, true), ly.a().a(lz.c, $$5))
               .a(lt.a().a(dgr.O, true), ly.a().a(lz.c, $$5).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.L, false), ly.a().a(lz.c, $$6))
               .a(lt.a().a(dgr.M, false), ly.a().a(lz.c, $$7))
               .a(lt.a().a(dgr.N, false), ly.a().a(lz.c, $$7).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.O, false), ly.a().a(lz.c, $$6).a(lz.b, lz.a.d))
         );
   }

   private void q(cua $$0) {
      mg $$1 = mg.z($$0);
      afw $$2 = mf.aJ.a($$0, $$1, this.c);
      afw $$3 = this.a($$0, "_conditional", mf.aJ, $$1x -> $$1.c(mh.i, $$1x));
      this.b.accept(lv.a($$0).a(a(dgr.c, $$3, $$2)).a(e()));
   }

   private void r(cua $$0) {
      afw $$1 = mi.q.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<ly> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> ly.a().a(lz.c, md.a(cuc.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(cuc.mZ);
      this.b
         .accept(
            lu.a(cuc.mZ)
               .a(lt.a().a(dgr.aq, 0), this.a(0))
               .a(lt.a().a(dgr.aq, 1), this.a(1))
               .a(lt.a().a(dgr.bk, dgn.b), ly.a().a(lz.c, md.a(cuc.mZ, "_small_leaves")))
               .a(lt.a().a(dgr.bk, dgn.c), ly.a().a(lz.c, md.a(cuc.mZ, "_large_leaves")))
         );
   }

   private lw n() {
      return lw.a(dgr.P)
         .a(hx.a, ly.a().a(lz.a, lz.a.c))
         .a(hx.b, ly.a())
         .a(hx.c, ly.a().a(lz.a, lz.a.b))
         .a(hx.d, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.c))
         .a(hx.e, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.d))
         .a(hx.f, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.b));
   }

   private void o() {
      afw $$0 = mg.a(cuc.nU, "_top_open");
      this.b
         .accept(
            lv.a(cuc.nU)
               .a(this.n())
               .a(
                  lw.a(dgr.u)
                     .a(false, ly.a().a(lz.c, mi.e.create(cuc.nU, this.c)))
                     .a(true, ly.a().a(lz.c, mi.e.get(cuc.nU).a($$1 -> $$1.a(mh.f, $$0)).a(cuc.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> lw a(dhe<T> $$0, T $$1, afw $$2, afw $$3) {
      ly $$4 = ly.a().a(lz.c, $$2);
      ly $$5 = ly.a().a(lz.c, $$3);
      return lw.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cua $$0, Function<cua, mg> $$1) {
      mg $$2 = $$1.apply($$0).b(mh.i, mh.c);
      mg $$3 = $$2.c(mh.g, mg.a($$0, "_front_honey"));
      afw $$4 = mf.o.a($$0, $$2, this.c);
      afw $$5 = mf.o.a($$0, "_honey", $$3, this.c);
      this.b.accept(lv.a($$0).a(b()).a(a(dgr.aN, 5, $$5, $$4)));
   }

   private void a(cua $$0, dhe<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<afw> $$3 = new Int2ObjectOpenHashMap();
         lw $$4 = lw.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            afw $$5 = (afw)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, mf.aT, mg::g));
            return ly.a().a(lz.c, $$5);
         });
         this.a($$0.k());
         this.b.accept(lv.a($$0).a($$4));
      }
   }

   private void p() {
      afw $$0 = md.a(cuc.od, "_floor");
      afw $$1 = md.a(cuc.od, "_ceiling");
      afw $$2 = md.a(cuc.od, "_wall");
      afw $$3 = md.a(cuc.od, "_between_walls");
      this.a(ckm.vs);
      this.b
         .accept(
            lv.a(cuc.od)
               .a(
                  lw.a(dgr.R, dgr.V)
                     .a(hx.c, dgp.a, ly.a().a(lz.c, $$0))
                     .a(hx.d, dgp.a, ly.a().a(lz.c, $$0).a(lz.b, lz.a.c))
                     .a(hx.f, dgp.a, ly.a().a(lz.c, $$0).a(lz.b, lz.a.b))
                     .a(hx.e, dgp.a, ly.a().a(lz.c, $$0).a(lz.b, lz.a.d))
                     .a(hx.c, dgp.b, ly.a().a(lz.c, $$1))
                     .a(hx.d, dgp.b, ly.a().a(lz.c, $$1).a(lz.b, lz.a.c))
                     .a(hx.f, dgp.b, ly.a().a(lz.c, $$1).a(lz.b, lz.a.b))
                     .a(hx.e, dgp.b, ly.a().a(lz.c, $$1).a(lz.b, lz.a.d))
                     .a(hx.c, dgp.c, ly.a().a(lz.c, $$2).a(lz.b, lz.a.d))
                     .a(hx.d, dgp.c, ly.a().a(lz.c, $$2).a(lz.b, lz.a.b))
                     .a(hx.f, dgp.c, ly.a().a(lz.c, $$2))
                     .a(hx.e, dgp.c, ly.a().a(lz.c, $$2).a(lz.b, lz.a.c))
                     .a(hx.d, dgp.d, ly.a().a(lz.c, $$3).a(lz.b, lz.a.b))
                     .a(hx.c, dgp.d, ly.a().a(lz.c, $$3).a(lz.b, lz.a.d))
                     .a(hx.f, dgp.d, ly.a().a(lz.c, $$3))
                     .a(hx.e, dgp.d, ly.a().a(lz.c, $$3).a(lz.b, lz.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            lv.a(cuc.nZ, ly.a().a(lz.c, md.a(cuc.nZ)))
               .a(
                  lw.a(dgr.U, dgr.R)
                     .a(dgm.a, hx.c, ly.a())
                     .a(dgm.a, hx.f, ly.a().a(lz.b, lz.a.b))
                     .a(dgm.a, hx.d, ly.a().a(lz.b, lz.a.c))
                     .a(dgm.a, hx.e, ly.a().a(lz.b, lz.a.d))
                     .a(dgm.b, hx.c, ly.a().a(lz.a, lz.a.b))
                     .a(dgm.b, hx.f, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.b))
                     .a(dgm.b, hx.d, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.c))
                     .a(dgm.b, hx.e, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.d))
                     .a(dgm.c, hx.d, ly.a().a(lz.a, lz.a.c))
                     .a(dgm.c, hx.e, ly.a().a(lz.a, lz.a.c).a(lz.b, lz.a.b))
                     .a(dgm.c, hx.c, ly.a().a(lz.a, lz.a.c).a(lz.b, lz.a.c))
                     .a(dgm.c, hx.f, ly.a().a(lz.a, lz.a.c).a(lz.b, lz.a.d))
               )
         );
   }

   private void d(cua $$0, mi.a $$1) {
      afw $$2 = $$1.create($$0, this.c);
      afw $$3 = mg.a($$0, "_front_on");
      afw $$4 = $$1.get($$0).a($$1x -> $$1x.a(mh.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(lv.a($$0).a(a(dgr.r, $$4, $$2)).a(b()));
   }

   private void a(cua... $$0) {
      afw $$1 = md.a("campfire_off");

      for (cua $$2 : $$0) {
         afw $$3 = mf.ba.a($$2, mg.E($$2), this.c);
         this.a($$2.k());
         this.b.accept(lv.a($$2).a(a(dgr.r, $$3, $$1)).a(c()));
      }
   }

   private void s(cua $$0) {
      afw $$1 = mf.br.a($$0, mg.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(cua $$0) {
      afw $$1;
      if ($$0 == cuc.si) {
         $$1 = mf.bt.a($$0, mg.m($$0), this.c);
      } else {
         $$1 = mf.bs.a($$0, mg.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      mg $$0 = mg.a(mg.G(cuc.cl), mg.G(cuc.n));
      afw $$1 = mf.i.a(cuc.cl, $$0, this.c);
      this.b.accept(c(cuc.cl, $$1));
   }

   private void s() {
      this.a(ckm.ll);
      this.b
         .accept(
            lu.a(cuc.cw)
               .a(
                  lt.b(
                     lt.a().a(dgr.ab, dhg.c).a(dgr.aa, dhg.c).a(dgr.ac, dhg.c).a(dgr.ad, dhg.c),
                     lt.a().a(dgr.ab, dhg.b, dhg.a).a(dgr.aa, dhg.b, dhg.a),
                     lt.a().a(dgr.aa, dhg.b, dhg.a).a(dgr.ac, dhg.b, dhg.a),
                     lt.a().a(dgr.ac, dhg.b, dhg.a).a(dgr.ad, dhg.b, dhg.a),
                     lt.a().a(dgr.ad, dhg.b, dhg.a).a(dgr.ab, dhg.b, dhg.a)
                  ),
                  ly.a().a(lz.c, md.a("redstone_dust_dot"))
               )
               .a(lt.a().a(dgr.ab, dhg.b, dhg.a), ly.a().a(lz.c, md.a("redstone_dust_side0")))
               .a(lt.a().a(dgr.ac, dhg.b, dhg.a), ly.a().a(lz.c, md.a("redstone_dust_side_alt0")))
               .a(lt.a().a(dgr.aa, dhg.b, dhg.a), ly.a().a(lz.c, md.a("redstone_dust_side_alt1")).a(lz.b, lz.a.d))
               .a(lt.a().a(dgr.ad, dhg.b, dhg.a), ly.a().a(lz.c, md.a("redstone_dust_side1")).a(lz.b, lz.a.d))
               .a(lt.a().a(dgr.ab, dhg.a), ly.a().a(lz.c, md.a("redstone_dust_up")))
               .a(lt.a().a(dgr.aa, dhg.a), ly.a().a(lz.c, md.a("redstone_dust_up")).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.ac, dhg.a), ly.a().a(lz.c, md.a("redstone_dust_up")).a(lz.b, lz.a.c))
               .a(lt.a().a(dgr.ad, dhg.a), ly.a().a(lz.c, md.a("redstone_dust_up")).a(lz.b, lz.a.d))
         );
   }

   private void t() {
      this.a(ckm.lp);
      this.b
         .accept(
            lv.a(cuc.gY)
               .a(c())
               .a(
                  lw.a(dgr.bd, dgr.w)
                     .a(dgu.a, false, ly.a().a(lz.c, md.a(cuc.gY)))
                     .a(dgu.a, true, ly.a().a(lz.c, md.a(cuc.gY, "_on")))
                     .a(dgu.b, false, ly.a().a(lz.c, md.a(cuc.gY, "_subtract")))
                     .a(dgu.b, true, ly.a().a(lz.c, md.a(cuc.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      mg $$0 = mg.a(cuc.jR);
      mg $$1 = mg.a(mg.a(cuc.jE, "_side"), $$0.a(mh.f));
      afw $$2 = mf.Z.a(cuc.jE, $$1, this.c);
      afw $$3 = mf.aa.a(cuc.jE, $$1, this.c);
      afw $$4 = mf.i.b(cuc.jE, "_double", $$1, this.c);
      this.b.accept(e(cuc.jE, $$2, $$3, $$4));
      this.b.accept(c(cuc.jR, mf.c.a(cuc.jR, $$0, this.c)));
   }

   private void v() {
      this.a(ckm.rB);
      this.b
         .accept(
            lu.a(cuc.fs)
               .a(ly.a().a(lz.c, mg.G(cuc.fs)))
               .a(lt.a().a(dgr.k, true), ly.a().a(lz.c, mg.a(cuc.fs, "_bottle0")))
               .a(lt.a().a(dgr.l, true), ly.a().a(lz.c, mg.a(cuc.fs, "_bottle1")))
               .a(lt.a().a(dgr.m, true), ly.a().a(lz.c, mg.a(cuc.fs, "_bottle2")))
               .a(lt.a().a(dgr.k, false), ly.a().a(lz.c, mg.a(cuc.fs, "_empty0")))
               .a(lt.a().a(dgr.l, false), ly.a().a(lz.c, mg.a(cuc.fs, "_empty1")))
               .a(lt.a().a(dgr.m, false), ly.a().a(lz.c, mg.a(cuc.fs, "_empty2")))
         );
   }

   private void u(cua $$0) {
      afw $$1 = mf.bn.a($$0, mg.b($$0), this.c);
      afw $$2 = md.a("mushroom_block_inside");
      this.b
         .accept(
            lu.a($$0)
               .a(lt.a().a(dgr.L, true), ly.a().a(lz.c, $$1))
               .a(lt.a().a(dgr.M, true), ly.a().a(lz.c, $$1).a(lz.b, lz.a.b).a(lz.d, true))
               .a(lt.a().a(dgr.N, true), ly.a().a(lz.c, $$1).a(lz.b, lz.a.c).a(lz.d, true))
               .a(lt.a().a(dgr.O, true), ly.a().a(lz.c, $$1).a(lz.b, lz.a.d).a(lz.d, true))
               .a(lt.a().a(dgr.J, true), ly.a().a(lz.c, $$1).a(lz.a, lz.a.d).a(lz.d, true))
               .a(lt.a().a(dgr.K, true), ly.a().a(lz.c, $$1).a(lz.a, lz.a.b).a(lz.d, true))
               .a(lt.a().a(dgr.L, false), ly.a().a(lz.c, $$2))
               .a(lt.a().a(dgr.M, false), ly.a().a(lz.c, $$2).a(lz.b, lz.a.b).a(lz.d, false))
               .a(lt.a().a(dgr.N, false), ly.a().a(lz.c, $$2).a(lz.b, lz.a.c).a(lz.d, false))
               .a(lt.a().a(dgr.O, false), ly.a().a(lz.c, $$2).a(lz.b, lz.a.d).a(lz.d, false))
               .a(lt.a().a(dgr.J, false), ly.a().a(lz.c, $$2).a(lz.a, lz.a.d).a(lz.d, false))
               .a(lt.a().a(dgr.K, false), ly.a().a(lz.c, $$2).a(lz.a, lz.a.b).a(lz.d, false))
         );
      this.a($$0, mi.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(ckm.qN);
      this.b
         .accept(
            lv.a(cuc.eg)
               .a(
                  lw.a(dgr.ay)
                     .a(0, ly.a().a(lz.c, md.a(cuc.eg)))
                     .a(1, ly.a().a(lz.c, md.a(cuc.eg, "_slice1")))
                     .a(2, ly.a().a(lz.c, md.a(cuc.eg, "_slice2")))
                     .a(3, ly.a().a(lz.c, md.a(cuc.eg, "_slice3")))
                     .a(4, ly.a().a(lz.c, md.a(cuc.eg, "_slice4")))
                     .a(5, ly.a().a(lz.c, md.a(cuc.eg, "_slice5")))
                     .a(6, ly.a().a(lz.c, md.a(cuc.eg, "_slice6")))
               )
         );
   }

   private void x() {
      mg $$0 = new mg()
         .a(mh.c, mg.a(cuc.nX, "_side3"))
         .a(mh.o, mg.G(cuc.t))
         .a(mh.n, mg.a(cuc.nX, "_top"))
         .a(mh.j, mg.a(cuc.nX, "_side3"))
         .a(mh.l, mg.a(cuc.nX, "_side3"))
         .a(mh.k, mg.a(cuc.nX, "_side1"))
         .a(mh.m, mg.a(cuc.nX, "_side2"));
      this.b.accept(c(cuc.nX, mf.a.a(cuc.nX, $$0, this.c)));
   }

   private void y() {
      mg $$0 = new mg()
         .a(mh.c, mg.a(cuc.ob, "_front"))
         .a(mh.o, mg.a(cuc.ob, "_bottom"))
         .a(mh.n, mg.a(cuc.ob, "_top"))
         .a(mh.j, mg.a(cuc.ob, "_front"))
         .a(mh.k, mg.a(cuc.ob, "_front"))
         .a(mh.l, mg.a(cuc.ob, "_side"))
         .a(mh.m, mg.a(cuc.ob, "_side"));
      this.b.accept(c(cuc.ob, mf.a.a(cuc.ob, $$0, this.c)));
   }

   private void a(cua $$0, cua $$1, BiFunction<cua, cua, mg> $$2) {
      mg $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, mf.a.a($$0, $$3, this.c)));
   }

   public void b(cua $$0) {
      mg $$1 = new mg()
         .a(mh.c, mg.a($$0, "_particle"))
         .a(mh.o, mg.a($$0, "_down"))
         .a(mh.n, mg.a($$0, "_up"))
         .a(mh.j, mg.a($$0, "_north"))
         .a(mh.k, mg.a($$0, "_south"))
         .a(mh.l, mg.a($$0, "_east"))
         .a(mh.m, mg.a($$0, "_west"));
      this.b.accept(c($$0, mf.a.a($$0, $$1, this.c)));
   }

   private void z() {
      mg $$0 = mg.k(cuc.eZ);
      this.b.accept(c(cuc.eZ, md.a(cuc.eZ)));
      this.a(cuc.ee, $$0);
      this.a(cuc.ef, $$0);
   }

   private void a(cua $$0, mg $$1) {
      afw $$2 = mf.n.a($$0, $$1.c(mh.g, mg.G($$0)), this.c);
      this.b.accept(lv.a($$0, ly.a().a(lz.c, $$2)).a(b()));
   }

   private void A() {
      this.a(ckm.rC);
      this.m(cuc.ft);
      this.b.accept(c(cuc.fv, mf.bq.a(cuc.fv, mg.j(mg.a(cuc.H, "_still")), this.c)));
      this.b
         .accept(
            lv.a(cuc.fu)
               .a(
                  lw.a(cyh.g)
                     .a(1, ly.a().a(lz.c, mf.bo.a(cuc.fu, "_level1", mg.j(mg.a(cuc.G, "_still")), this.c)))
                     .a(2, ly.a().a(lz.c, mf.bp.a(cuc.fu, "_level2", mg.j(mg.a(cuc.G, "_still")), this.c)))
                     .a(3, ly.a().a(lz.c, mf.bq.a(cuc.fu, "_full", mg.j(mg.a(cuc.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            lv.a(cuc.fw)
               .a(
                  lw.a(cyh.g)
                     .a(1, ly.a().a(lz.c, mf.bo.a(cuc.fw, "_level1", mg.j(mg.G(cuc.qC)), this.c)))
                     .a(2, ly.a().a(lz.c, mf.bp.a(cuc.fw, "_level2", mg.j(mg.G(cuc.qC)), this.c)))
                     .a(3, ly.a().a(lz.c, mf.bq.a(cuc.fw, "_full", mg.j(mg.G(cuc.qC)), this.c)))
               )
         );
   }

   private void B() {
      mg $$0 = mg.b(cuc.kv);
      afw $$1 = mf.aC.a(cuc.kv, $$0, this.c);
      afw $$2 = this.a(cuc.kv, "_dead", mf.aC, $$1x -> $$0.c(mh.b, $$1x));
      this.b.accept(lv.a(cuc.kv).a(a(dgr.au, 5, $$2, $$1)));
   }

   private void v(cua $$0) {
      mg $$1 = new mg().a(mh.f, mg.a(cuc.cD, "_top")).a(mh.i, mg.a(cuc.cD, "_side")).a(mh.g, mg.a($$0, "_front"));
      mg $$2 = new mg().a(mh.i, mg.a(cuc.cD, "_top")).a(mh.g, mg.a($$0, "_front_vertical"));
      afw $$3 = mf.n.a($$0, $$1, this.c);
      afw $$4 = mf.p.a($$0, $$2, this.c);
      this.b
         .accept(
            lv.a($$0)
               .a(
                  lw.a(dgr.P)
                     .a(hx.a, ly.a().a(lz.c, $$4).a(lz.a, lz.a.c))
                     .a(hx.b, ly.a().a(lz.c, $$4))
                     .a(hx.c, ly.a().a(lz.c, $$3))
                     .a(hx.f, ly.a().a(lz.c, $$3).a(lz.b, lz.a.b))
                     .a(hx.d, ly.a().a(lz.c, $$3).a(lz.b, lz.a.c))
                     .a(hx.e, ly.a().a(lz.c, $$3).a(lz.b, lz.a.d))
               )
         );
   }

   private void C() {
      afw $$0 = md.a(cuc.fy);
      afw $$1 = md.a(cuc.fy, "_filled");
      this.b.accept(lv.a(cuc.fy).a(lw.a(dgr.h).a(false, ly.a().a(lz.c, $$0)).a(true, ly.a().a(lz.c, $$1))).a(c()));
   }

   private void D() {
      afw $$0 = md.a(cuc.ku, "_side");
      afw $$1 = md.a(cuc.ku, "_noside");
      afw $$2 = md.a(cuc.ku, "_noside1");
      afw $$3 = md.a(cuc.ku, "_noside2");
      afw $$4 = md.a(cuc.ku, "_noside3");
      this.b
         .accept(
            lu.a(cuc.ku)
               .a(lt.a().a(dgr.L, true), ly.a().a(lz.c, $$0))
               .a(lt.a().a(dgr.M, true), ly.a().a(lz.c, $$0).a(lz.b, lz.a.b).a(lz.d, true))
               .a(lt.a().a(dgr.N, true), ly.a().a(lz.c, $$0).a(lz.b, lz.a.c).a(lz.d, true))
               .a(lt.a().a(dgr.O, true), ly.a().a(lz.c, $$0).a(lz.b, lz.a.d).a(lz.d, true))
               .a(lt.a().a(dgr.J, true), ly.a().a(lz.c, $$0).a(lz.a, lz.a.d).a(lz.d, true))
               .a(lt.a().a(dgr.K, true), ly.a().a(lz.c, $$0).a(lz.a, lz.a.b).a(lz.d, true))
               .a(lt.a().a(dgr.L, false), ly.a().a(lz.c, $$1).a(lz.e, 2), ly.a().a(lz.c, $$2), ly.a().a(lz.c, $$3), ly.a().a(lz.c, $$4))
               .a(
                  lt.a().a(dgr.M, false),
                  ly.a().a(lz.c, $$2).a(lz.b, lz.a.b).a(lz.d, true),
                  ly.a().a(lz.c, $$3).a(lz.b, lz.a.b).a(lz.d, true),
                  ly.a().a(lz.c, $$4).a(lz.b, lz.a.b).a(lz.d, true),
                  ly.a().a(lz.c, $$1).a(lz.e, 2).a(lz.b, lz.a.b).a(lz.d, true)
               )
               .a(
                  lt.a().a(dgr.N, false),
                  ly.a().a(lz.c, $$3).a(lz.b, lz.a.c).a(lz.d, true),
                  ly.a().a(lz.c, $$4).a(lz.b, lz.a.c).a(lz.d, true),
                  ly.a().a(lz.c, $$1).a(lz.e, 2).a(lz.b, lz.a.c).a(lz.d, true),
                  ly.a().a(lz.c, $$2).a(lz.b, lz.a.c).a(lz.d, true)
               )
               .a(
                  lt.a().a(dgr.O, false),
                  ly.a().a(lz.c, $$4).a(lz.b, lz.a.d).a(lz.d, true),
                  ly.a().a(lz.c, $$1).a(lz.e, 2).a(lz.b, lz.a.d).a(lz.d, true),
                  ly.a().a(lz.c, $$2).a(lz.b, lz.a.d).a(lz.d, true),
                  ly.a().a(lz.c, $$3).a(lz.b, lz.a.d).a(lz.d, true)
               )
               .a(
                  lt.a().a(dgr.J, false),
                  ly.a().a(lz.c, $$1).a(lz.e, 2).a(lz.a, lz.a.d).a(lz.d, true),
                  ly.a().a(lz.c, $$4).a(lz.a, lz.a.d).a(lz.d, true),
                  ly.a().a(lz.c, $$2).a(lz.a, lz.a.d).a(lz.d, true),
                  ly.a().a(lz.c, $$3).a(lz.a, lz.a.d).a(lz.d, true)
               )
               .a(
                  lt.a().a(dgr.K, false),
                  ly.a().a(lz.c, $$4).a(lz.a, lz.a.b).a(lz.d, true),
                  ly.a().a(lz.c, $$3).a(lz.a, lz.a.b).a(lz.d, true),
                  ly.a().a(lz.c, $$2).a(lz.a, lz.a.b).a(lz.d, true),
                  ly.a().a(lz.c, $$1).a(lz.e, 2).a(lz.a, lz.a.b).a(lz.d, true)
               )
         );
   }

   private void E() {
      this.b
         .accept(
            lu.a(cuc.pc)
               .a(ly.a().a(lz.c, mg.G(cuc.pc)))
               .a(lt.a().a(dgr.aL, 1), ly.a().a(lz.c, mg.a(cuc.pc, "_contents1")))
               .a(lt.a().a(dgr.aL, 2), ly.a().a(lz.c, mg.a(cuc.pc, "_contents2")))
               .a(lt.a().a(dgr.aL, 3), ly.a().a(lz.c, mg.a(cuc.pc, "_contents3")))
               .a(lt.a().a(dgr.aL, 4), ly.a().a(lz.c, mg.a(cuc.pc, "_contents4")))
               .a(lt.a().a(dgr.aL, 5), ly.a().a(lz.c, mg.a(cuc.pc, "_contents5")))
               .a(lt.a().a(dgr.aL, 6), ly.a().a(lz.c, mg.a(cuc.pc, "_contents6")))
               .a(lt.a().a(dgr.aL, 7), ly.a().a(lz.c, mg.a(cuc.pc, "_contents7")))
               .a(lt.a().a(dgr.aL, 8), ly.a().a(lz.c, mg.a(cuc.pc, "_contents_ready")))
         );
   }

   private void w(cua $$0) {
      this.c($$0);
      this.b.accept(lv.a($$0, ly.a().a(lz.c, mf.am.a($$0, mg.c($$0), this.c))).a(this.n()));
   }

   private void F() {
      this.w(cuc.qy);
      this.w(cuc.qx);
      this.w(cuc.qw);
      this.w(cuc.qv);
   }

   private void G() {
      this.c(cuc.rs);
      lw.b<hx, dgy> $$0 = lw.a(dgr.bm, dgr.bn);

      for (dgy $$1 : dgy.values()) {
         $$0.a(hx.b, $$1, this.a(hx.b, $$1));
      }

      for (dgy $$2 : dgy.values()) {
         $$0.a(hx.a, $$2, this.a(hx.a, $$2));
      }

      this.b.accept(lv.a(cuc.rs).a($$0));
   }

   private ly a(hx $$0, dgy $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      mg $$3 = mg.c(mg.a(cuc.rs, $$2));
      return ly.a().a(lz.c, mf.al.a(cuc.rs, $$2, $$3, this.c));
   }

   private void x(cua $$0) {
      mg $$1 = new mg().a(mh.e, mg.G(cuc.dV)).a(mh.f, mg.G($$0)).a(mh.i, mg.a($$0, "_side"));
      this.b.accept(c($$0, mf.m.a($$0, $$1, this.c)));
   }

   private void H() {
      afw $$0 = mg.a(cuc.gZ, "_side");
      mg $$1 = new mg().a(mh.f, mg.a(cuc.gZ, "_top")).a(mh.i, $$0);
      mg $$2 = new mg().a(mh.f, mg.a(cuc.gZ, "_inverted_top")).a(mh.i, $$0);
      this.b
         .accept(
            lv.a(cuc.gZ)
               .a(lw.a(dgr.p).a(false, ly.a().a(lz.c, mf.aD.a(cuc.gZ, $$1, this.c))).a(true, ly.a().a(lz.c, mf.aD.a(md.a(cuc.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void y(cua $$0) {
      this.b.accept(lv.a($$0, ly.a().a(lz.c, md.a($$0))).a(this.n()));
   }

   private void I() {
      cua $$0 = cuc.rr;
      afw $$1 = md.a($$0, "_on");
      afw $$2 = md.a($$0);
      this.b.accept(lv.a($$0, ly.a().a(lz.c, md.a($$0))).a(this.n()).a(a(dgr.w, $$1, $$2)));
   }

   private void J() {
      mg $$0 = new mg().a(mh.B, mg.G(cuc.j)).a(mh.f, mg.G(cuc.cC));
      mg $$1 = new mg().a(mh.B, mg.G(cuc.j)).a(mh.f, mg.a(cuc.cC, "_moist"));
      afw $$2 = mf.aU.a(cuc.cC, $$0, this.c);
      afw $$3 = mf.aU.a(mg.a(cuc.cC, "_moist"), $$1, this.c);
      this.b.accept(lv.a(cuc.cC).a(a(dgr.aQ, 7, $$3, $$2)));
   }

   private List<afw> z(cua $$0) {
      afw $$1 = mf.aV.a(md.a($$0, "_floor0"), mg.v($$0), this.c);
      afw $$2 = mf.aV.a(md.a($$0, "_floor1"), mg.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<afw> A(cua $$0) {
      afw $$1 = mf.aW.a(md.a($$0, "_side0"), mg.v($$0), this.c);
      afw $$2 = mf.aW.a(md.a($$0, "_side1"), mg.w($$0), this.c);
      afw $$3 = mf.aX.a(md.a($$0, "_side_alt0"), mg.v($$0), this.c);
      afw $$4 = mf.aX.a(md.a($$0, "_side_alt1"), mg.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<afw> B(cua $$0) {
      afw $$1 = mf.aY.a(md.a($$0, "_up0"), mg.v($$0), this.c);
      afw $$2 = mf.aY.a(md.a($$0, "_up1"), mg.w($$0), this.c);
      afw $$3 = mf.aZ.a(md.a($$0, "_up_alt0"), mg.v($$0), this.c);
      afw $$4 = mf.aZ.a(md.a($$0, "_up_alt1"), mg.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<ly> a(List<afw> $$0, UnaryOperator<ly> $$1) {
      return $$0.stream().map($$0x -> ly.a().a(lz.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void K() {
      lt $$0 = lt.a().a(dgr.L, false).a(dgr.M, false).a(dgr.N, false).a(dgr.O, false).a(dgr.J, false);
      List<afw> $$1 = this.z(cuc.cr);
      List<afw> $$2 = this.A(cuc.cr);
      List<afw> $$3 = this.B(cuc.cr);
      this.b
         .accept(
            lu.a(cuc.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(lt.b(lt.a().a(dgr.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(lt.b(lt.a().a(dgr.M, true), $$0), a($$2, $$0x -> $$0x.a(lz.b, lz.a.b)))
               .a(lt.b(lt.a().a(dgr.N, true), $$0), a($$2, $$0x -> $$0x.a(lz.b, lz.a.c)))
               .a(lt.b(lt.a().a(dgr.O, true), $$0), a($$2, $$0x -> $$0x.a(lz.b, lz.a.d)))
               .a(lt.a().a(dgr.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void L() {
      List<afw> $$0 = this.z(cuc.cs);
      List<afw> $$1 = this.A(cuc.cs);
      this.b
         .accept(
            lu.a(cuc.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(lz.b, lz.a.b)))
               .a(a($$1, $$0x -> $$0x.a(lz.b, lz.a.c)))
               .a(a($$1, $$0x -> $$0x.a(lz.b, lz.a.d)))
         );
   }

   private void C(cua $$0) {
      afw $$1 = mi.s.create($$0, this.c);
      afw $$2 = mi.t.create($$0, this.c);
      this.a($$0.k());
      this.b.accept(lv.a($$0).a(a(dgr.j, $$2, $$1)));
   }

   private void M() {
      mg $$0 = mg.a(mg.a(cuc.ad, "_side"), mg.a(cuc.ad, "_top"));
      afw $$1 = mf.i.a(cuc.ad, $$0, this.c);
      this.b.accept(d(cuc.ad, $$1));
   }

   private void N() {
      this.a(ckm.Q);
      cua $$0 = cuc.E;
      lw.b<Boolean, Integer> $$1 = lw.a(cyt.d, cyt.b);
      afw $$2 = md.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         afw $$4 = md.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, ly.a().a(lz.c, $$4));
         $$1.a(false, $$3, ly.a().a(lz.c, $$2));
      }

      this.b.accept(lv.a(cuc.E).a($$1));
   }

   private void O() {
      this.b
         .accept(
            lv.a(cuc.kI)
               .a(
                  lw.a(dgr.as)
                     .a(0, ly.a().a(lz.c, this.a(cuc.kI, "_0", mf.c, mg::b)))
                     .a(1, ly.a().a(lz.c, this.a(cuc.kI, "_1", mf.c, mg::b)))
                     .a(2, ly.a().a(lz.c, this.a(cuc.kI, "_2", mf.c, mg::b)))
                     .a(3, ly.a().a(lz.c, this.a(cuc.kI, "_3", mf.c, mg::b)))
               )
         );
   }

   private void P() {
      afw $$0 = mg.G(cuc.j);
      mg $$1 = new mg().a(mh.e, $$0).b(mh.e, mh.c).a(mh.f, mg.a(cuc.i, "_top")).a(mh.i, mg.a(cuc.i, "_snow"));
      ly $$2 = ly.a().a(lz.c, mf.m.a(cuc.i, "_snow", $$1, this.c));
      this.a(cuc.i, md.a(cuc.i), $$2);
      afw $$3 = mi.e.get(cuc.fl).a($$1x -> $$1x.a(mh.e, $$0)).a(cuc.fl, this.c);
      this.a(cuc.fl, $$3, $$2);
      afw $$4 = mi.e.get(cuc.l).a($$1x -> $$1x.a(mh.e, $$0)).a(cuc.l, this.c);
      this.a(cuc.l, $$4, $$2);
   }

   private void a(cua $$0, afw $$1, ly $$2) {
      List<ly> $$3 = Arrays.asList(a($$1));
      this.b.accept(lv.a($$0).a(lw.a(dgr.z).a(true, $$2).a(false, $$3)));
   }

   private void Q() {
      this.a(ckm.qt);
      this.b
         .accept(
            lv.a(cuc.fC)
               .a(
                  lw.a(dgr.ar)
                     .a(0, ly.a().a(lz.c, md.a(cuc.fC, "_stage0")))
                     .a(1, ly.a().a(lz.c, md.a(cuc.fC, "_stage1")))
                     .a(2, ly.a().a(lz.c, md.a(cuc.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void R() {
      this.b.accept(b(cuc.kE, md.a(cuc.kE)));
   }

   private void g(cua $$0, cua $$1) {
      mg $$2 = mg.b($$1);
      afw $$3 = mf.W.a($$0, $$2, this.c);
      afw $$4 = mf.X.a($$0, $$2, this.c);
      this.b.accept(lv.a($$0).a(a(dgr.aT, 1, $$4, $$3)));
   }

   private void S() {
      afw $$0 = md.a(cuc.hc);
      afw $$1 = md.a(cuc.hc, "_side");
      this.a(ckm.lv);
      this.b
         .accept(
            lv.a(cuc.hc)
               .a(
                  lw.a(dgr.Q)
                     .a(hx.a, ly.a().a(lz.c, $$0))
                     .a(hx.c, ly.a().a(lz.c, $$1))
                     .a(hx.f, ly.a().a(lz.c, $$1).a(lz.b, lz.a.b))
                     .a(hx.d, ly.a().a(lz.c, $$1).a(lz.b, lz.a.c))
                     .a(hx.e, ly.a().a(lz.c, $$1).a(lz.b, lz.a.d))
               )
         );
   }

   private void h(cua $$0, cua $$1) {
      afw $$2 = md.a($$0);
      this.b.accept(lv.a($$1, ly.a().a(lz.c, $$2)));
      this.a($$1, $$2);
   }

   private void T() {
      afw $$0 = md.a(cuc.eW, "_post_ends");
      afw $$1 = md.a(cuc.eW, "_post");
      afw $$2 = md.a(cuc.eW, "_cap");
      afw $$3 = md.a(cuc.eW, "_cap_alt");
      afw $$4 = md.a(cuc.eW, "_side");
      afw $$5 = md.a(cuc.eW, "_side_alt");
      this.b
         .accept(
            lu.a(cuc.eW)
               .a(ly.a().a(lz.c, $$0))
               .a(lt.a().a(dgr.L, false).a(dgr.M, false).a(dgr.N, false).a(dgr.O, false), ly.a().a(lz.c, $$1))
               .a(lt.a().a(dgr.L, true).a(dgr.M, false).a(dgr.N, false).a(dgr.O, false), ly.a().a(lz.c, $$2))
               .a(lt.a().a(dgr.L, false).a(dgr.M, true).a(dgr.N, false).a(dgr.O, false), ly.a().a(lz.c, $$2).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.L, false).a(dgr.M, false).a(dgr.N, true).a(dgr.O, false), ly.a().a(lz.c, $$3))
               .a(lt.a().a(dgr.L, false).a(dgr.M, false).a(dgr.N, false).a(dgr.O, true), ly.a().a(lz.c, $$3).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.L, true), ly.a().a(lz.c, $$4))
               .a(lt.a().a(dgr.M, true), ly.a().a(lz.c, $$4).a(lz.b, lz.a.b))
               .a(lt.a().a(dgr.N, true), ly.a().a(lz.c, $$5))
               .a(lt.a().a(dgr.O, true), ly.a().a(lz.c, $$5).a(lz.b, lz.a.b))
         );
      this.d(cuc.eW);
   }

   private void D(cua $$0) {
      this.b.accept(lv.a($$0, ly.a().a(lz.c, md.a($$0))).a(b()));
   }

   private void U() {
      afw $$0 = md.a(cuc.dw);
      afw $$1 = md.a(cuc.dw, "_on");
      this.d(cuc.dw);
      this.b
         .accept(
            lv.a(cuc.dw)
               .a(a(dgr.w, $$0, $$1))
               .a(
                  lw.a(dgr.U, dgr.R)
                     .a(dgm.c, hx.c, ly.a().a(lz.a, lz.a.c).a(lz.b, lz.a.c))
                     .a(dgm.c, hx.f, ly.a().a(lz.a, lz.a.c).a(lz.b, lz.a.d))
                     .a(dgm.c, hx.d, ly.a().a(lz.a, lz.a.c))
                     .a(dgm.c, hx.e, ly.a().a(lz.a, lz.a.c).a(lz.b, lz.a.b))
                     .a(dgm.a, hx.c, ly.a())
                     .a(dgm.a, hx.f, ly.a().a(lz.b, lz.a.b))
                     .a(dgm.a, hx.d, ly.a().a(lz.b, lz.a.c))
                     .a(dgm.a, hx.e, ly.a().a(lz.b, lz.a.d))
                     .a(dgm.b, hx.c, ly.a().a(lz.a, lz.a.b))
                     .a(dgm.b, hx.f, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.b))
                     .a(dgm.b, hx.d, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.c))
                     .a(dgm.b, hx.e, ly.a().a(lz.a, lz.a.b).a(lz.b, lz.a.d))
               )
         );
   }

   private void V() {
      this.d(cuc.fm);
      this.b.accept(b(cuc.fm, md.a(cuc.fm)));
   }

   private void W() {
      this.d(cuc.sm);
      this.b.accept(c(cuc.sm, md.a(cuc.sm)));
   }

   private void X() {
      this.b.accept(lv.a(cuc.ed).a(lw.a(dgr.H).a(hx.a.a, ly.a().a(lz.c, md.a(cuc.ed, "_ns"))).a(hx.a.c, ly.a().a(lz.c, md.a(cuc.ed, "_ew")))));
   }

   private void Y() {
      afw $$0 = mi.a.create(cuc.dV, this.c);
      this.b
         .accept(
            lv.a(
               cuc.dV,
               ly.a().a(lz.c, $$0),
               ly.a().a(lz.c, $$0).a(lz.a, lz.a.b),
               ly.a().a(lz.c, $$0).a(lz.a, lz.a.c),
               ly.a().a(lz.c, $$0).a(lz.a, lz.a.d),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.b),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.b).a(lz.a, lz.a.b),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.b).a(lz.a, lz.a.c),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.b).a(lz.a, lz.a.d),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.c),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.c).a(lz.a, lz.a.b),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.c).a(lz.a, lz.a.c),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.c).a(lz.a, lz.a.d),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.d),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.d).a(lz.a, lz.a.b),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.d).a(lz.a, lz.a.c),
               ly.a().a(lz.c, $$0).a(lz.b, lz.a.d).a(lz.a, lz.a.d)
            )
         );
   }

   private void Z() {
      afw $$0 = md.a(cuc.kO);
      afw $$1 = md.a(cuc.kO, "_on");
      this.b.accept(lv.a(cuc.kO).a(a(dgr.w, $$1, $$0)).a(e()));
   }

   private void aa() {
      mg $$0 = new mg().a(mh.e, mg.a(cuc.by, "_bottom")).a(mh.i, mg.a(cuc.by, "_side"));
      afw $$1 = mg.a(cuc.by, "_top_sticky");
      afw $$2 = mg.a(cuc.by, "_top");
      mg $$3 = $$0.c(mh.E, $$1);
      mg $$4 = $$0.c(mh.E, $$2);
      afw $$5 = md.a(cuc.by, "_base");
      this.a(cuc.by, $$5, $$4);
      this.a(cuc.br, $$5, $$3);
      afw $$6 = mf.m.a(cuc.by, "_inventory", $$0.c(mh.f, $$2), this.c);
      afw $$7 = mf.m.a(cuc.br, "_inventory", $$0.c(mh.f, $$1), this.c);
      this.a(cuc.by, $$6);
      this.a(cuc.br, $$7);
   }

   private void a(cua $$0, afw $$1, mg $$2) {
      afw $$3 = mf.bf.a($$0, $$2, this.c);
      this.b.accept(lv.a($$0).a(a(dgr.g, $$1, $$3)).a(e()));
   }

   private void ab() {
      mg $$0 = new mg().a(mh.F, mg.a(cuc.by, "_top")).a(mh.i, mg.a(cuc.by, "_side"));
      mg $$1 = $$0.c(mh.E, mg.a(cuc.by, "_top_sticky"));
      mg $$2 = $$0.c(mh.E, mg.a(cuc.by, "_top"));
      this.b
         .accept(
            lv.a(cuc.bz)
               .a(
                  lw.a(dgr.x, dgr.bg)
                     .a(false, dhd.a, ly.a().a(lz.c, mf.bg.a(cuc.by, "_head", $$2, this.c)))
                     .a(false, dhd.b, ly.a().a(lz.c, mf.bg.a(cuc.by, "_head_sticky", $$1, this.c)))
                     .a(true, dhd.a, ly.a().a(lz.c, mf.bh.a(cuc.by, "_head_short", $$2, this.c)))
                     .a(true, dhd.b, ly.a().a(lz.c, mf.bh.a(cuc.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ac() {
      afw $$0 = md.a(cuc.qD, "_inactive");
      afw $$1 = md.a(cuc.qD, "_active");
      this.a(cuc.qD, $$0);
      this.b.accept(lv.a(cuc.qD).a(lw.a(dgr.bo).a($$2 -> ly.a().a(lz.c, $$2 != dhi.b && $$2 != dhi.c ? $$0 : $$1))));
   }

   private void ad() {
      afw $$0 = md.a(cuc.qE, "_inactive");
      afw $$1 = md.a(cuc.qE, "_active");
      this.a(cuc.qE, $$0);
      this.b.accept(lv.a(cuc.qE).a(lw.a(dgr.bo).a($$2 -> ly.a().a(lz.c, $$2 != dhi.b && $$2 != dhi.c ? $$0 : $$1))).a(b()));
   }

   private void ae() {
      afw $$0 = mf.bK.a(cuc.qI, mg.a(false), this.c);
      afw $$1 = mf.bK.a(cuc.qI, "_can_summon", mg.a(true), this.c);
      this.a(cuc.qI, $$0);
      this.b.accept(lv.a(cuc.qI).a(a(dgr.G, $$1, $$0)));
   }

   private void af() {
      afw $$0 = md.a(cuc.nS, "_stable");
      afw $$1 = md.a(cuc.nS, "_unstable");
      this.a(cuc.nS, $$0);
      this.b.accept(lv.a(cuc.nS).a(a(dgr.b, $$1, $$0)));
   }

   private void ag() {
      afw $$0 = this.a(cuc.ru, "", mf.am, mg::c);
      afw $$1 = this.a(cuc.ru, "_lit", mf.am, mg::c);
      this.b.accept(lv.a(cuc.ru).a(a(dgr.D, $$1, $$0)));
      afw $$2 = this.a(cuc.rv, "", mf.am, mg::c);
      afw $$3 = this.a(cuc.rv, "_lit", mf.am, mg::c);
      this.b.accept(lv.a(cuc.rv).a(a(dgr.D, $$3, $$2)));
   }

   private void ah() {
      afw $$0 = mi.a.create(cuc.fB, this.c);
      afw $$1 = this.a(cuc.fB, "_on", mf.c, mg::b);
      this.b.accept(lv.a(cuc.fB).a(a(dgr.r, $$1, $$0)));
   }

   private void i(cua $$0, cua $$1) {
      mg $$2 = mg.y($$0);
      this.b.accept(c($$0, mf.bd.a($$0, $$2, this.c)));
      this.b.accept(lv.a($$1, ly.a().a(lz.c, mf.be.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void ai() {
      mg $$0 = mg.y(cuc.dK);
      mg $$1 = mg.i(mg.a(cuc.dK, "_off"));
      afw $$2 = mf.bd.a(cuc.dK, $$0, this.c);
      afw $$3 = mf.bd.a(cuc.dK, "_off", $$1, this.c);
      this.b.accept(lv.a(cuc.dK).a(a(dgr.r, $$2, $$3)));
      afw $$4 = mf.be.a(cuc.dL, $$0, this.c);
      afw $$5 = mf.be.a(cuc.dL, "_off", $$1, this.c);
      this.b.accept(lv.a(cuc.dL).a(a(dgr.r, $$4, $$5)).a(d()));
      this.d(cuc.dK);
      this.c(cuc.dL);
   }

   private void aj() {
      this.a(ckm.lo);
      this.b.accept(lv.a(cuc.eh).a(lw.a(dgr.aA, dgr.s, dgr.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return ly.a().a(lz.c, mg.a(cuc.eh, $$3.toString()));
      })).a(c()));
   }

   private void ak() {
      this.a(ckm.cx);
      this.b
         .accept(
            lv.a(cuc.mV)
               .a(
                  lw.a(dgr.aS, dgr.C)
                     .a(1, false, Arrays.asList(a(md.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(md.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(md.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(md.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(md.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(md.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(md.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(md.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      mg $$0 = mg.a(cuc.dN);
      afw $$1 = mf.c.a(cuc.dP, $$0, this.c);
      this.b.accept(lv.a(cuc.dN).a(lw.a(dgr.aF).a($$1x -> ly.a().a(lz.c, $$1x < 8 ? md.a(cuc.dN, "_height" + $$1x * 2) : $$1))));
      this.a(cuc.dN, md.a(cuc.dN, "_height2"));
      this.b.accept(c(cuc.dP, $$1));
   }

   private void am() {
      this.b.accept(lv.a(cuc.oc, ly.a().a(lz.c, md.a(cuc.oc))).a(b()));
   }

   private void an() {
      afw $$0 = mi.a.create(cuc.pa, this.c);
      this.a(cuc.pa, $$0);
      this.b.accept(lv.a(cuc.pa).a(lw.a(dgr.bj).a($$0x -> ly.a().a(lz.c, this.a(cuc.pa, "_" + $$0x.c(), mf.c, mg::b)))));
   }

   private void ao() {
      this.a(ckm.vv);
      this.b.accept(lv.a(cuc.oi).a(lw.a(dgr.as).a($$0 -> ly.a().a(lz.c, this.a(cuc.oi, "_stage" + $$0, mf.am, mg::c)))));
   }

   private void ap() {
      this.a(ckm.oE);
      this.b
         .accept(
            lv.a(cuc.fI)
               .a(
                  lw.a(dgr.a, dgr.M, dgr.L, dgr.N, dgr.O)
                     .a(false, false, false, false, false, ly.a().a(lz.c, md.a(cuc.fI, "_ns")))
                     .a(false, true, false, false, false, ly.a().a(lz.c, md.a(cuc.fI, "_n")).a(lz.b, lz.a.b))
                     .a(false, false, true, false, false, ly.a().a(lz.c, md.a(cuc.fI, "_n")))
                     .a(false, false, false, true, false, ly.a().a(lz.c, md.a(cuc.fI, "_n")).a(lz.b, lz.a.c))
                     .a(false, false, false, false, true, ly.a().a(lz.c, md.a(cuc.fI, "_n")).a(lz.b, lz.a.d))
                     .a(false, true, true, false, false, ly.a().a(lz.c, md.a(cuc.fI, "_ne")))
                     .a(false, true, false, true, false, ly.a().a(lz.c, md.a(cuc.fI, "_ne")).a(lz.b, lz.a.b))
                     .a(false, false, false, true, true, ly.a().a(lz.c, md.a(cuc.fI, "_ne")).a(lz.b, lz.a.c))
                     .a(false, false, true, false, true, ly.a().a(lz.c, md.a(cuc.fI, "_ne")).a(lz.b, lz.a.d))
                     .a(false, false, true, true, false, ly.a().a(lz.c, md.a(cuc.fI, "_ns")))
                     .a(false, true, false, false, true, ly.a().a(lz.c, md.a(cuc.fI, "_ns")).a(lz.b, lz.a.b))
                     .a(false, true, true, true, false, ly.a().a(lz.c, md.a(cuc.fI, "_nse")))
                     .a(false, true, false, true, true, ly.a().a(lz.c, md.a(cuc.fI, "_nse")).a(lz.b, lz.a.b))
                     .a(false, false, true, true, true, ly.a().a(lz.c, md.a(cuc.fI, "_nse")).a(lz.b, lz.a.c))
                     .a(false, true, true, false, true, ly.a().a(lz.c, md.a(cuc.fI, "_nse")).a(lz.b, lz.a.d))
                     .a(false, true, true, true, true, ly.a().a(lz.c, md.a(cuc.fI, "_nsew")))
                     .a(true, false, false, false, false, ly.a().a(lz.c, md.a(cuc.fI, "_attached_ns")))
                     .a(true, false, true, false, false, ly.a().a(lz.c, md.a(cuc.fI, "_attached_n")))
                     .a(true, false, false, true, false, ly.a().a(lz.c, md.a(cuc.fI, "_attached_n")).a(lz.b, lz.a.c))
                     .a(true, true, false, false, false, ly.a().a(lz.c, md.a(cuc.fI, "_attached_n")).a(lz.b, lz.a.b))
                     .a(true, false, false, false, true, ly.a().a(lz.c, md.a(cuc.fI, "_attached_n")).a(lz.b, lz.a.d))
                     .a(true, true, true, false, false, ly.a().a(lz.c, md.a(cuc.fI, "_attached_ne")))
                     .a(true, true, false, true, false, ly.a().a(lz.c, md.a(cuc.fI, "_attached_ne")).a(lz.b, lz.a.b))
                     .a(true, false, false, true, true, ly.a().a(lz.c, md.a(cuc.fI, "_attached_ne")).a(lz.b, lz.a.c))
                     .a(true, false, true, false, true, ly.a().a(lz.c, md.a(cuc.fI, "_attached_ne")).a(lz.b, lz.a.d))
                     .a(true, false, true, true, false, ly.a().a(lz.c, md.a(cuc.fI, "_attached_ns")))
                     .a(true, true, false, false, true, ly.a().a(lz.c, md.a(cuc.fI, "_attached_ns")).a(lz.b, lz.a.b))
                     .a(true, true, true, true, false, ly.a().a(lz.c, md.a(cuc.fI, "_attached_nse")))
                     .a(true, true, false, true, true, ly.a().a(lz.c, md.a(cuc.fI, "_attached_nse")).a(lz.b, lz.a.b))
                     .a(true, false, true, true, true, ly.a().a(lz.c, md.a(cuc.fI, "_attached_nse")).a(lz.b, lz.a.c))
                     .a(true, true, true, false, true, ly.a().a(lz.c, md.a(cuc.fI, "_attached_nse")).a(lz.b, lz.a.d))
                     .a(true, true, true, true, true, ly.a().a(lz.c, md.a(cuc.fI, "_attached_nsew")))
               )
         );
   }

   private void aq() {
      this.d(cuc.fH);
      this.b.accept(lv.a(cuc.fH).a(lw.a(dgr.a, dgr.w).a(($$0, $$1) -> ly.a().a(lz.c, mg.a(cuc.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private afw a(int $$0, String $$1, mg $$2) {
      switch ($$0) {
         case 1:
            return mf.bj.a(md.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return mf.bk.a(md.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return mf.bl.a(md.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return mf.bm.a(md.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private afw a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", mg.b(mg.G(cuc.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", mg.b(mg.a(cuc.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", mg.b(mg.a(cuc.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ar() {
      this.a(ckm.jT);
      this.b.accept(lv.a(cuc.mf).a(lw.a(dgr.aD, dgr.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void as() {
      this.a(ckm.jU);
      Function<Integer, afw> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         mg $$2 = mg.a($$1);
         return mf.bu.a(cuc.mg, $$1, $$2, this.c);
      };
      this.b.accept(lv.a(cuc.mg).a(lw.a(dbg.c).a($$1 -> ly.a().a(lz.c, $$0.apply($$1)))));
   }

   private void E(cua $$0) {
      this.d($$0);
      afw $$1 = md.a($$0);
      lu $$2 = lu.a($$0);
      lt.c $$3 = ac.a(lt.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dgs, Function<afw, ly>> $$4 : a) {
         dgs $$5 = (dgs)$$4.getFirst();
         Function<afw, ly> $$6 = (Function<afw, ly>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(lt.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void at() {
      afw $$0 = mg.a(cuc.qH, "_bottom");
      mg $$1 = new mg().a(mh.e, $$0).a(mh.f, mg.a(cuc.qH, "_top")).a(mh.i, mg.a(cuc.qH, "_side"));
      mg $$2 = new mg().a(mh.e, $$0).a(mh.f, mg.a(cuc.qH, "_top_bloom")).a(mh.i, mg.a(cuc.qH, "_side_bloom"));
      afw $$3 = mf.m.a(cuc.qH, "", $$1, this.c);
      afw $$4 = mf.m.a(cuc.qH, "_bloom", $$2, this.c);
      this.b.accept(lv.a(cuc.qH).a(lw.a(dgr.E).a($$2x -> ly.a().a(lz.c, $$2x ? $$4 : $$3))));
      this.a(ckm.fN, $$3);
   }

   private void au() {
      cua $$0 = cuc.cm;
      afw $$1 = md.a($$0);
      lu $$2 = lu.a($$0);
      Map.of(hx.c, lz.a.a, hx.f, lz.a.b, hx.d, lz.a.c, hx.e, lz.a.d).forEach(($$2x, $$3) -> {
         lt.c $$4 = lt.a().a(dgr.R, $$2x);
         $$2.a($$4, ly.a().a(lz.c, $$1).a(lz.b, $$3).a(lz.d, true));
         this.a($$2, $$4, $$3);
      });
      this.b.accept($$2);
      this.a($$0, md.a($$0, "_inventory"));
      i.clear();
   }

   private void a(lu $$0, lt.c $$1, lz.a $$2) {
      Map.of(dgr.bp, mf.aK, dgr.bq, mf.aL, dgr.br, mf.aM, dgr.bs, mf.aN, dgr.bt, mf.aO, dgr.bu, mf.aP).forEach(($$3, $$4) -> {
         this.a($$0, $$1, $$2, $$3, $$4, true);
         this.a($$0, $$1, $$2, $$3, $$4, false);
      });
   }

   private void a(lu $$0, lt.c $$1, lz.a $$2, dgs $$3, me $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      mg $$7 = new mg().a(mh.b, mg.a(cuc.cm, $$6));
      lp.d $$8 = new lp.d($$4, $$6);
      afw $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(cuc.cm, $$6, $$7, this.c));
      $$0.a(lt.a($$1, lt.a().a($$3, $$5)), ly.a().a(lz.c, $$9).a(lz.b, $$2));
   }

   private void av() {
      this.b.accept(c(cuc.kJ, mf.c.a(cuc.kJ, mg.b(md.a("magma")), this.c)));
   }

   private void F(cua $$0) {
      this.b($$0, mi.p);
      mf.bB.a(md.a($$0.k()), mg.u($$0), this.c);
   }

   private void b(cua $$0, cua $$1, lp.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(cua $$0, cua $$1) {
      mf.bC.a(md.a($$0.k()), mg.u($$1), this.c);
   }

   private void aw() {
      afw $$0 = md.a(cuc.b);
      afw $$1 = md.a(cuc.b, "_mirrored");
      this.b.accept(a(cuc.eN, $$0, $$1));
      this.a(cuc.eN, $$0);
   }

   private void ax() {
      afw $$0 = md.a(cuc.rI);
      afw $$1 = md.a(cuc.rI, "_mirrored");
      this.b.accept(a(cuc.sc, $$0, $$1).a(f()));
      this.a(cuc.sc, $$0);
   }

   private void k(cua $$0, cua $$1) {
      this.a($$0, lp.e.b);
      mg $$2 = mg.d(mg.a($$0, "_pot"));
      afw $$3 = lp.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void ay() {
      afw $$0 = mg.a(cuc.pl, "_bottom");
      afw $$1 = mg.a(cuc.pl, "_top_off");
      afw $$2 = mg.a(cuc.pl, "_top");
      afw[] $$3 = new afw[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         mg $$5 = new mg().a(mh.e, $$0).a(mh.f, $$4 == 0 ? $$1 : $$2).a(mh.i, mg.a(cuc.pl, "_side" + $$4));
         $$3[$$4] = mf.m.a(cuc.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(lv.a(cuc.pl).a(lw.a(dgr.aZ).a($$1x -> ly.a().a(lz.c, $$3[$$1x]))));
      this.a(ckm.vT, $$3[0]);
   }

   private ly a(hz $$0, ly $$1) {
      switch ($$0) {
         case b:
            return $$1.a(lz.a, lz.a.b);
         case c:
            return $$1.a(lz.a, lz.a.b).a(lz.b, lz.a.c);
         case d:
            return $$1.a(lz.a, lz.a.b).a(lz.b, lz.a.d);
         case a:
            return $$1.a(lz.a, lz.a.b).a(lz.b, lz.a.b);
         case f:
            return $$1.a(lz.a, lz.a.d).a(lz.b, lz.a.c);
         case g:
            return $$1.a(lz.a, lz.a.d);
         case h:
            return $$1.a(lz.a, lz.a.d).a(lz.b, lz.a.b);
         case e:
            return $$1.a(lz.a, lz.a.d).a(lz.b, lz.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(lz.b, lz.a.c);
         case i:
            return $$1.a(lz.b, lz.a.d);
         case j:
            return $$1.a(lz.b, lz.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void az() {
      afw $$0 = mg.a(cuc.pb, "_top");
      afw $$1 = mg.a(cuc.pb, "_bottom");
      afw $$2 = mg.a(cuc.pb, "_side");
      afw $$3 = mg.a(cuc.pb, "_lock");
      mg $$4 = new mg().a(mh.o, $$2).a(mh.m, $$2).a(mh.l, $$2).a(mh.c, $$0).a(mh.j, $$0).a(mh.k, $$1).a(mh.n, $$3);
      afw $$5 = mf.b.a(cuc.pb, $$4, this.c);
      this.b.accept(lv.a(cuc.pb, ly.a().a(lz.c, $$5)).a(lw.a(dgr.T).a($$0x -> this.a($$0x, ly.a()))));
   }

   private void aA() {
      cua $$0 = cuc.n;
      afw $$1 = md.a($$0);
      mi $$2 = mi.a.get($$0);
      cua $$3 = cuc.jH;
      afw $$4 = mf.Z.a($$3, $$2.b(), this.c);
      afw $$5 = mf.aa.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      kb.a().filter(kc::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(cuc.qS).a(kb.w).a(cuc.ri).a(kb.y);
      this.h(cuc.qR).a(kb.A).a(cuc.rh).a(kb.C);
      this.h(cuc.qQ).a(kb.E).a(cuc.rg).a(kb.G);
      this.h(cuc.qP).a(kb.I).a(cuc.rf).a(kb.K);
      this.m(cuc.a);
      this.a(cuc.nc, cuc.a);
      this.a(cuc.nb, cuc.a);
      this.m(cuc.fO);
      this.m(cuc.dQ);
      this.a(cuc.nd, cuc.G);
      this.m(cuc.fA);
      this.m(cuc.me);
      this.m(cuc.fr);
      this.m(cuc.fR);
      this.a(ckm.tk);
      this.m(cuc.pg);
      this.m(cuc.G);
      this.m(cuc.H);
      this.m(cuc.hV);
      this.a(ckm.fw);
      this.l(cuc.pM, cuc.qd);
      this.l(cuc.pN, cuc.qe);
      this.l(cuc.pO, cuc.qf);
      this.l(cuc.pP, cuc.qg);
      this.l(cuc.pQ, cuc.qh);
      this.l(cuc.pR, cuc.qi);
      this.l(cuc.pS, cuc.qj);
      this.l(cuc.pT, cuc.qk);
      this.l(cuc.pU, cuc.ql);
      this.l(cuc.pV, cuc.qm);
      this.l(cuc.pW, cuc.qn);
      this.l(cuc.pX, cuc.qo);
      this.l(cuc.pY, cuc.qp);
      this.l(cuc.pZ, cuc.qq);
      this.l(cuc.qa, cuc.qr);
      this.l(cuc.qb, cuc.qs);
      this.l(cuc.pL, cuc.qc);
      this.m(cuc.na);
      this.m(cuc.gs);
      this.m(cuc.qC);
      this.m(cuc.rw);
      this.s(cuc.rx);
      this.s(cuc.ry);
      this.t(cuc.sh);
      this.t(cuc.si);
      this.ag();
      this.e(cuc.rB, cuc.rz);
      this.p(cuc.rA);
      this.a(cuc.hW, ckm.hf);
      this.a(ckm.hf);
      this.aB();
      this.a(cuc.kN, ckm.iF);
      this.a(ckm.iF);
      this.f(cuc.bQ, mg.a(cuc.by, "_side"));
      this.a(cuc.R);
      this.a(cuc.S);
      this.a(cuc.iB);
      this.a(cuc.cx);
      this.a(cuc.cy);
      this.a(cuc.cz);
      this.a(cuc.fE);
      this.a(cuc.fF);
      this.a(cuc.fJ);
      this.a(cuc.N);
      this.a(cuc.T);
      this.a(cuc.O);
      this.a(cuc.ch);
      this.a(cuc.P);
      this.a(cuc.Q);
      this.a(cuc.ci);
      this.b(cuc.pj, mi.c);
      this.a(cuc.pi);
      this.a(cuc.aR);
      this.a(cuc.aS);
      this.a(cuc.aT);
      this.a(cuc.hb);
      this.a(cuc.dI);
      this.a(cuc.dJ);
      this.a(cuc.ha);
      this.a(cuc.pC);
      this.a(cuc.mW);
      this.a(cuc.dR);
      this.a(cuc.k);
      this.a(cuc.pk);
      this.a(cuc.fz);
      this.a(cuc.ec);
      this.a(cuc.L);
      this.a(cuc.ph);
      this.a(cuc.dO);
      this.b(cuc.dT, mi.f);
      this.b(cuc.pq, mi.c);
      this.b(cuc.fa, mi.c);
      this.m(cuc.ac);
      this.m(cuc.ga);
      this.a(cuc.kK);
      this.a(cuc.aY);
      this.a(cuc.iC);
      this.a(cuc.co);
      this.a(cuc.pK);
      this.a(cuc.ii);
      this.a(cuc.oy);
      this.a(cuc.dW);
      this.a(cuc.dX);
      this.a(cuc.ct);
      this.a(cuc.aO);
      this.b(cuc.bw, mi.u);
      this.a(ckm.cw);
      this.b(cuc.ck, mi.e);
      this.b(cuc.pd, mi.c);
      this.a(cuc.op);
      this.a(cuc.aP);
      this.a(cuc.qt);
      this.a(cuc.qu);
      this.a(cuc.qA);
      this.a(cuc.qz);
      this.a(cuc.rt);
      this.a(cuc.se);
      this.a(cuc.sf);
      this.a(cuc.sg);
      this.e(cuc.qF);
      this.aA();
      this.a(cuc.qN);
      this.a(cuc.qO);
      this.a(cuc.qM);
      this.a(cuc.qL);
      this.a(cuc.qK);
      this.a(cuc.qJ);
      this.h(cuc.qM, cuc.rb);
      this.h(cuc.qL, cuc.rd);
      this.h(cuc.qK, cuc.rc);
      this.h(cuc.qJ, cuc.re);
      this.g(cuc.gW, cuc.ch);
      this.g(cuc.gX, cuc.ci);
      this.F();
      this.r();
      this.au();
      this.v();
      this.w();
      this.a(cuc.og, cuc.oh);
      this.x();
      this.A();
      this.B();
      this.D();
      this.E();
      this.H();
      this.C();
      this.y(cuc.kt);
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
      this.E(cuc.ff);
      this.E(cuc.fg);
      this.E(cuc.qG);
      this.av();
      this.az();
      this.ac();
      this.ad();
      this.ae();
      this.W();
      this.N();
      this.M();
      this.D(cuc.cO);
      this.d(cuc.cO);
      this.D(cuc.oa);
      this.g();
      this.D(cuc.rD);
      this.i(cuc.cp, cuc.cq);
      this.i(cuc.ea, cuc.eb);
      this.a(cuc.cA, cuc.n, mg::c);
      this.a(cuc.nY, cuc.p, mg::d);
      this.x(cuc.ow);
      this.x(cuc.on);
      this.v(cuc.aU);
      this.v(cuc.hi);
      this.C(cuc.oe);
      this.C(cuc.of);
      this.e(cuc.eX, md.a(cuc.eX));
      this.a(cuc.dY, mi.c);
      this.a(cuc.dZ, mi.c);
      this.a(cuc.sd);
      this.a(cuc.kM, mi.c);
      this.f(cuc.j);
      this.f(cuc.rG);
      this.f(cuc.I);
      this.g(cuc.J);
      this.g(cuc.M);
      this.f(cuc.K);
      this.e(cuc.F);
      this.b(cuc.sn, mi.e);
      this.a(cuc.ij, mi.c, mi.d);
      this.a(cuc.kx, mi.v, mi.w);
      this.a(cuc.hf, mi.v, mi.w);
      this.a(cuc.sj, mi.c, mi.d);
      this.a(cuc.sk, mi.c, mi.d);
      this.a(cuc.sl, mi.c, mi.d);
      this.c(cuc.nT, mi.h);
      this.z();
      this.a(cuc.pe, mg::A);
      this.a(cuc.pf, mg::C);
      this.a(cuc.kD, dgr.as, 0, 1, 2, 3);
      this.a(cuc.gt, dgr.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cuc.fq, dgr.as, 0, 1, 1, 2);
      this.a(cuc.gu, dgr.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cuc.cB, dgr.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(cuc.kA, lp.e.b, dgr.aq, 0, 1);
      this.i();
      this.h();
      this.a(md.a("decorated_pot"), cuc.iA).b(cuc.so);
      this.a(md.a("banner"), cuc.n)
         .a(mf.bD, cuc.iJ, cuc.iK, cuc.iL, cuc.iM, cuc.iN, cuc.iO, cuc.iP, cuc.iQ, cuc.iR, cuc.iS, cuc.iT, cuc.iU, cuc.iV, cuc.iW, cuc.iX, cuc.iY)
         .b(cuc.iZ, cuc.ja, cuc.jb, cuc.jc, cuc.jd, cuc.je, cuc.jf, cuc.jg, cuc.jh, cuc.ji, cuc.jj, cuc.jk, cuc.jl, cuc.jm, cuc.jn, cuc.jo);
      this.a(md.a("bed"), cuc.n)
         .b(cuc.aZ, cuc.ba, cuc.bb, cuc.bc, cuc.bd, cuc.be, cuc.bf, cuc.bg, cuc.bh, cuc.bi, cuc.bj, cuc.bk, cuc.bl, cuc.bm, cuc.bn, cuc.bo);
      this.j(cuc.aZ, cuc.bA);
      this.j(cuc.ba, cuc.bB);
      this.j(cuc.bb, cuc.bC);
      this.j(cuc.bc, cuc.bD);
      this.j(cuc.bd, cuc.bE);
      this.j(cuc.be, cuc.bF);
      this.j(cuc.bf, cuc.bG);
      this.j(cuc.bg, cuc.bH);
      this.j(cuc.bh, cuc.bI);
      this.j(cuc.bi, cuc.bJ);
      this.j(cuc.bj, cuc.bK);
      this.j(cuc.bk, cuc.bL);
      this.j(cuc.bl, cuc.bM);
      this.j(cuc.bm, cuc.bN);
      this.j(cuc.bn, cuc.bO);
      this.j(cuc.bo, cuc.bP);
      this.a(md.a("skull"), cuc.dW)
         .a(mf.bE, cuc.gM, cuc.gK, cuc.gI, cuc.gE, cuc.gG, cuc.gQ)
         .a(cuc.gO)
         .b(cuc.gN, cuc.gP, cuc.gL, cuc.gJ, cuc.gF, cuc.gH, cuc.gR);
      this.F(cuc.kP);
      this.F(cuc.kQ);
      this.F(cuc.kR);
      this.F(cuc.kS);
      this.F(cuc.kT);
      this.F(cuc.kU);
      this.F(cuc.kV);
      this.F(cuc.kW);
      this.F(cuc.kX);
      this.F(cuc.kY);
      this.F(cuc.kZ);
      this.F(cuc.la);
      this.F(cuc.lb);
      this.F(cuc.lc);
      this.F(cuc.ld);
      this.F(cuc.le);
      this.F(cuc.lf);
      this.b(cuc.mX, mi.p);
      this.c(cuc.mX);
      this.a(md.a("chest"), cuc.n).b(cuc.cv, cuc.gV);
      this.a(md.a("ender_chest"), cuc.co).b(cuc.fG);
      this.d(cuc.fx, cuc.co).a(cuc.fx, cuc.kF);
      this.a(cuc.aM);
      this.a(cuc.aN);
      this.a(cuc.lw);
      this.a(cuc.lx);
      this.a(cuc.ly);
      this.a(cuc.lz);
      this.a(cuc.lA);
      this.a(cuc.lB);
      this.a(cuc.lC);
      this.a(cuc.lD);
      this.a(cuc.lE);
      this.a(cuc.lF);
      this.a(cuc.lG);
      this.a(cuc.lH);
      this.a(cuc.lI);
      this.a(cuc.lJ);
      this.a(cuc.lK);
      this.a(cuc.lL);
      this.a(mi.a, cuc.lM, cuc.lN, cuc.lO, cuc.lP, cuc.lQ, cuc.lR, cuc.lS, cuc.lT, cuc.lU, cuc.lV, cuc.lW, cuc.lX, cuc.lY, cuc.lZ, cuc.ma, cuc.mb);
      this.a(cuc.iA);
      this.a(cuc.hj);
      this.a(cuc.hk);
      this.a(cuc.hl);
      this.a(cuc.hm);
      this.a(cuc.hn);
      this.a(cuc.ho);
      this.a(cuc.hp);
      this.a(cuc.hq);
      this.a(cuc.hr);
      this.a(cuc.hs);
      this.a(cuc.ht);
      this.a(cuc.hu);
      this.a(cuc.hv);
      this.a(cuc.hw);
      this.a(cuc.hx);
      this.a(cuc.hy);
      this.a(cuc.qB);
      this.f(cuc.aQ, cuc.eY);
      this.f(cuc.ei, cuc.hz);
      this.f(cuc.ej, cuc.hA);
      this.f(cuc.ek, cuc.hB);
      this.f(cuc.el, cuc.hC);
      this.f(cuc.em, cuc.hD);
      this.f(cuc.en, cuc.hE);
      this.f(cuc.eo, cuc.hF);
      this.f(cuc.ep, cuc.hG);
      this.f(cuc.eq, cuc.hH);
      this.f(cuc.er, cuc.hI);
      this.f(cuc.es, cuc.hJ);
      this.f(cuc.et, cuc.hK);
      this.f(cuc.eu, cuc.hL);
      this.f(cuc.ev, cuc.hM);
      this.f(cuc.ew, cuc.hN);
      this.f(cuc.ex, cuc.hO);
      this.b(mi.n, cuc.lg, cuc.lh, cuc.li, cuc.lj, cuc.lk, cuc.ll, cuc.lm, cuc.ln, cuc.lo, cuc.lp, cuc.lq, cuc.lr, cuc.ls, cuc.lt, cuc.lu, cuc.lv);
      this.e(cuc.bA, cuc.ik);
      this.e(cuc.bB, cuc.il);
      this.e(cuc.bC, cuc.im);
      this.e(cuc.bD, cuc.in);
      this.e(cuc.bE, cuc.io);
      this.e(cuc.bF, cuc.ip);
      this.e(cuc.bG, cuc.iq);
      this.e(cuc.bH, cuc.ir);
      this.e(cuc.bI, cuc.is);
      this.e(cuc.bJ, cuc.it);
      this.e(cuc.bK, cuc.iu);
      this.e(cuc.bL, cuc.iv);
      this.e(cuc.bM, cuc.iw);
      this.e(cuc.bN, cuc.ix);
      this.e(cuc.bO, cuc.iy);
      this.e(cuc.bP, cuc.iz);
      this.a(cuc.rH);
      this.a(cuc.eL);
      this.a(cuc.bu, cuc.gb, lp.e.a);
      this.a(cuc.bR, cuc.gc, lp.e.b);
      this.a(cuc.bT, cuc.gd, lp.e.b);
      this.a(cuc.bU, cuc.ge, lp.e.b);
      this.a(cuc.bV, cuc.gf, lp.e.b);
      this.a(cuc.bW, cuc.gg, lp.e.b);
      this.a(cuc.bX, cuc.gh, lp.e.b);
      this.a(cuc.bY, cuc.gi, lp.e.b);
      this.a(cuc.bZ, cuc.gj, lp.e.b);
      this.a(cuc.ca, cuc.gk, lp.e.b);
      this.a(cuc.cb, cuc.gl, lp.e.b);
      this.a(cuc.cc, cuc.gm, lp.e.b);
      this.a(cuc.ce, cuc.gn, lp.e.b);
      this.a(cuc.cd, cuc.go, lp.e.b);
      this.a(cuc.cg, cuc.gp, lp.e.b);
      this.a(cuc.cf, cuc.gq, lp.e.b);
      this.a(cuc.bv, cuc.gr, lp.e.b);
      this.a(cuc.bS, cuc.fS, lp.e.b);
      this.G();
      this.u(cuc.eT);
      this.u(cuc.eU);
      this.u(cuc.eV);
      this.a(cuc.bt, lp.e.a);
      this.b(cuc.dS, lp.e.a);
      this.a(ckm.dn);
      this.b(cuc.mc, cuc.md, lp.e.b);
      this.a(ckm.do);
      this.c(cuc.md);
      this.b(cuc.rF, lp.e.b);
      this.c(cuc.rF);
      this.c(cuc.rv);
      this.b(cuc.oz, cuc.oA, lp.e.b);
      this.b(cuc.oB, cuc.oC, lp.e.b);
      this.a(cuc.oz, "_plant");
      this.c(cuc.oA);
      this.a(cuc.oB, "_plant");
      this.c(cuc.oC);
      this.a(cuc.mY, lp.e.a, mg.c(mg.a(cuc.mZ, "_stage0")));
      this.m();
      this.a(cuc.bs, lp.e.b);
      this.c(cuc.iE, lp.e.b);
      this.c(cuc.iF, lp.e.b);
      this.c(cuc.iG, lp.e.b);
      this.c(cuc.iH, lp.e.a);
      this.c(cuc.iI, lp.e.a);
      this.j();
      this.k();
      this.l();
      this.a(cuc.mw, cuc.mr, cuc.mm, cuc.mh, cuc.mG, cuc.mB, cuc.mQ, cuc.mL);
      this.a(cuc.mx, cuc.ms, cuc.mn, cuc.mi, cuc.mH, cuc.mC, cuc.mR, cuc.mM);
      this.a(cuc.my, cuc.mt, cuc.mo, cuc.mj, cuc.mI, cuc.mD, cuc.mS, cuc.mN);
      this.a(cuc.mz, cuc.mu, cuc.mp, cuc.mk, cuc.mJ, cuc.mE, cuc.mT, cuc.mO);
      this.a(cuc.mA, cuc.mv, cuc.mq, cuc.ml, cuc.mK, cuc.mF, cuc.mU, cuc.mP);
      this.c(cuc.fe, cuc.fc);
      this.c(cuc.fd, cuc.fb);
      this.l(cuc.ab).c(cuc.ab).a(cuc.av);
      this.l(cuc.am).c(cuc.am).a(cuc.aD);
      this.a(cuc.am, cuc.dj, cuc.ds);
      this.b(cuc.aL, mi.r);
      this.l(cuc.Y).c(cuc.Y).a(cuc.as);
      this.l(cuc.ai).c(cuc.ai).a(cuc.aA);
      this.a(cuc.ai, cuc.dd, cuc.do);
      this.a(cuc.B, cuc.fX, lp.e.b);
      this.b(cuc.aI, mi.r);
      this.l(cuc.Z).d(cuc.Z).a(cuc.at);
      this.l(cuc.aj).d(cuc.aj).a(cuc.aB);
      this.a(cuc.aj, cuc.de, cuc.dp);
      this.a(cuc.C, cuc.fY, lp.e.b);
      this.b(cuc.aJ, mi.r);
      this.l(cuc.W).c(cuc.W).a(cuc.aq);
      this.l(cuc.ag).c(cuc.ag).a(cuc.ay);
      this.a(cuc.ag, cuc.dc, cuc.dn);
      this.a(cuc.z, cuc.fV, lp.e.b);
      this.b(cuc.aG, mi.r);
      this.l(cuc.U).c(cuc.U).a(cuc.ao);
      this.l(cuc.al).c(cuc.al).a(cuc.aw);
      this.a(cuc.al, cuc.da, cuc.dl);
      this.a(cuc.x, cuc.fT, lp.e.b);
      this.b(cuc.aE, mi.r);
      this.l(cuc.V).c(cuc.V).a(cuc.ap);
      this.l(cuc.af).c(cuc.af).a(cuc.ax);
      this.a(cuc.af, cuc.db, cuc.dm);
      this.a(cuc.y, cuc.fU, lp.e.b);
      this.b(cuc.aF, mi.r);
      this.l(cuc.aa).c(cuc.aa).a(cuc.au);
      this.l(cuc.ak).c(cuc.ak).a(cuc.aC);
      this.a(cuc.ak, cuc.dg, cuc.dr);
      this.a(cuc.D, cuc.fZ, lp.e.b);
      this.b(cuc.aK, mi.r);
      this.l(cuc.X).c(cuc.X).a(cuc.ar);
      this.l(cuc.ah).c(cuc.ah).a(cuc.az);
      this.a(cuc.ah, cuc.df, cuc.dq);
      this.a(cuc.A, cuc.fW, lp.e.b);
      this.b(cuc.aH, mi.r);
      this.l(cuc.os).b(cuc.os).a(cuc.ou);
      this.l(cuc.ot).b(cuc.ot).a(cuc.ov);
      this.a(cuc.ot, cuc.dh, cuc.dt);
      this.a(cuc.ox, cuc.pm, lp.e.b);
      this.k(cuc.oD, cuc.po);
      this.l(cuc.oj).b(cuc.oj).a(cuc.ol);
      this.l(cuc.ok).b(cuc.ok).a(cuc.om);
      this.a(cuc.ok, cuc.di, cuc.du);
      this.a(cuc.oo, cuc.pn, lp.e.b);
      this.k(cuc.oq, cuc.pp);
      this.l(cuc.ae).d(cuc.ae);
      this.l(cuc.an).d(cuc.an);
      this.a(cuc.v, cuc.dk, cuc.dv);
      this.b(cuc.or, lp.e.b);
      this.a(ckm.dk);
      this.i(cuc.dy);
      this.k(cuc.hY);
      this.u();
      this.n(cuc.cP);
      this.o(cuc.bp);
      this.o(cuc.bq);
      this.o(cuc.hh);
      this.t();
      this.q(cuc.fN);
      this.q(cuc.kG);
      this.q(cuc.kH);
      this.r(cuc.gS);
      this.r(cuc.gT);
      this.r(cuc.gU);
      this.o();
      this.p();
      this.d(cuc.cD, mi.g);
      this.d(cuc.nW, mi.g);
      this.d(cuc.nV, mi.h);
      this.s();
      this.ay();
      this.at();
      this.h(cuc.eK, cuc.eS);
      this.h(cuc.m, cuc.eO);
      this.h(cuc.eJ, cuc.eR);
      this.h(cuc.eI, cuc.eQ);
      this.aw();
      this.h(cuc.eH, cuc.eP);
      this.ax();
      clo.h().forEach($$0 -> this.a($$0, md.b("template_spawn_egg")));
   }

   private void aB() {
      this.c(cuc.hX);
      lw.a<Integer> $$0 = lw.a(dgr.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         afw $$3 = mg.a(ckm.hg, $$2);
         $$0.a($$1, ly.a().a(lz.c, mf.Y.a(cuc.hX, $$2, mg.h($$3), this.c)));
         mf.bv.a(md.a(ckm.hg, $$2), mg.k($$3), this.c);
      }

      this.b.accept(lv.a(cuc.hX).a($$0));
   }

   private void l(cua $$0, cua $$1) {
      this.a($$0.k());
      mg $$2 = mg.b(mg.G($$0));
      mg $$3 = mg.b(mg.a($$0, "_lit"));
      afw $$4 = mf.bF.a($$0, "_one_candle", $$2, this.c);
      afw $$5 = mf.bG.a($$0, "_two_candles", $$2, this.c);
      afw $$6 = mf.bH.a($$0, "_three_candles", $$2, this.c);
      afw $$7 = mf.bI.a($$0, "_four_candles", $$2, this.c);
      afw $$8 = mf.bF.a($$0, "_one_candle_lit", $$3, this.c);
      afw $$9 = mf.bG.a($$0, "_two_candles_lit", $$3, this.c);
      afw $$10 = mf.bH.a($$0, "_three_candles_lit", $$3, this.c);
      afw $$11 = mf.bI.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            lv.a($$0)
               .a(
                  lw.a(dgr.az, dgr.r)
                     .a(1, false, ly.a().a(lz.c, $$4))
                     .a(2, false, ly.a().a(lz.c, $$5))
                     .a(3, false, ly.a().a(lz.c, $$6))
                     .a(4, false, ly.a().a(lz.c, $$7))
                     .a(1, true, ly.a().a(lz.c, $$8))
                     .a(2, true, ly.a().a(lz.c, $$9))
                     .a(3, true, ly.a().a(lz.c, $$10))
                     .a(4, true, ly.a().a(lz.c, $$11))
               )
         );
      afw $$12 = mf.bJ.a($$1, mg.a($$0, false), this.c);
      afw $$13 = mf.bJ.a($$1, "_lit", mg.a($$0, true), this.c);
      this.b.accept(lv.a($$1).a(a(dgr.r, $$13, $$12)));
   }

   class a {
      private final afw b;

      public a(afw $$0, cua $$1) {
         this.b = mf.Y.a($$0, mg.u($$1), lp.this.c);
      }

      public lp.a a(cua... $$0) {
         for (cua $$1 : $$0) {
            lp.this.b.accept(lp.c($$1, this.b));
         }

         return this;
      }

      public lp.a b(cua... $$0) {
         for (cua $$1 : $$0) {
            lp.this.c($$1);
         }

         return this.a($$0);
      }

      public lp.a a(me $$0, cua... $$1) {
         for (cua $$2 : $$1) {
            $$0.a(md.a($$2.k()), mg.u($$2), lp.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final mg b;
      private final Map<me, afw> c = Maps.newHashMap();
      @Nullable
      private kc d;
      @Nullable
      private afw e;

      public b(mg $$0) {
         this.b = $$0;
      }

      public lp.b a(cua $$0, me $$1) {
         this.e = $$1.a($$0, this.b, lp.this.c);
         if (lp.this.f.containsKey($$0)) {
            lp.this.b.accept(lp.this.f.get($$0).create($$0, this.e, this.b, lp.this.c));
         } else {
            lp.this.b.accept(lp.c($$0, this.e));
         }

         return this;
      }

      public lp.b a(cua... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for (cua $$1 : $$0) {
               lp.this.b.accept(lp.c($$1, this.e));
               lp.this.a($$1, this.e);
            }

            return this;
         }
      }

      public lp.b a(cua $$0) {
         afw $$1 = mf.q.a($$0, this.b, lp.this.c);
         afw $$2 = mf.r.a($$0, this.b, lp.this.c);
         lp.this.b.accept(lp.b($$0, $$1, $$2));
         afw $$3 = mf.s.a($$0, this.b, lp.this.c);
         lp.this.a($$0, $$3);
         return this;
      }

      public lp.b b(cua $$0) {
         afw $$1 = mf.K.a($$0, this.b, lp.this.c);
         afw $$2 = mf.L.a($$0, this.b, lp.this.c);
         afw $$3 = mf.M.a($$0, this.b, lp.this.c);
         lp.this.b.accept(lp.a($$0, $$1, $$2, $$3));
         afw $$4 = mf.N.a($$0, this.b, lp.this.c);
         lp.this.a($$0, $$4);
         return this;
      }

      public lp.b c(cua $$0) {
         mg $$1 = mg.p($$0);
         afw $$2 = mf.B.a($$0, $$1, lp.this.c);
         afw $$3 = mf.C.a($$0, $$1, lp.this.c);
         afw $$4 = mf.D.a($$0, $$1, lp.this.c);
         afw $$5 = mf.E.a($$0, $$1, lp.this.c);
         afw $$6 = mf.F.a($$0, $$1, lp.this.c);
         lp.this.b.accept(lp.a($$0, $$2, $$3, $$4, $$5, $$6));
         afw $$7 = mf.G.a($$0, $$1, lp.this.c);
         lp.this.a($$0, $$7);
         return this;
      }

      public lp.b d(cua $$0) {
         afw $$1 = mf.H.a($$0, this.b, lp.this.c);
         afw $$2 = mf.I.a($$0, this.b, lp.this.c);
         lp.this.b.accept(lp.c($$0, $$1, $$2));
         afw $$3 = mf.J.a($$0, this.b, lp.this.c);
         lp.this.a($$0, $$3);
         return this;
      }

      public lp.b e(cua $$0) {
         mg $$1 = mg.p($$0);
         afw $$2 = mf.P.a($$0, $$1, lp.this.c);
         afw $$3 = mf.O.a($$0, $$1, lp.this.c);
         afw $$4 = mf.R.a($$0, $$1, lp.this.c);
         afw $$5 = mf.Q.a($$0, $$1, lp.this.c);
         lp.this.b.accept(lp.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public lp.b f(cua $$0) {
         afw $$1 = mf.T.a($$0, this.b, lp.this.c);
         afw $$2 = mf.S.a($$0, this.b, lp.this.c);
         afw $$3 = mf.V.a($$0, this.b, lp.this.c);
         afw $$4 = mf.U.a($$0, this.b, lp.this.c);
         lp.this.b.accept(lp.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public lp.b g(cua $$0) {
         afw $$1 = mf.W.a($$0, this.b, lp.this.c);
         afw $$2 = mf.X.a($$0, this.b, lp.this.c);
         lp.this.b.accept(lp.e($$0, $$1, $$2));
         return this;
      }

      public lp.b h(cua $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cua $$1 = this.d.b().get(kc.b.r);
            afw $$2 = mf.Y.a($$0, this.b, lp.this.c);
            lp.this.b.accept(lp.c($$0, $$2));
            lp.this.b.accept(lp.c($$1, $$2));
            lp.this.a($$0.k());
            lp.this.c($$1);
            return this;
         }
      }

      public lp.b i(cua $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            afw $$1 = this.a(mf.Z, $$0);
            afw $$2 = this.a(mf.aa, $$0);
            lp.this.b.accept(lp.e($$0, $$1, $$2, this.e));
            lp.this.a($$0, $$1);
            return this;
         }
      }

      public lp.b j(cua $$0) {
         afw $$1 = this.a(mf.ad, $$0);
         afw $$2 = this.a(mf.ac, $$0);
         afw $$3 = this.a(mf.ae, $$0);
         lp.this.b.accept(lp.b($$0, $$1, $$2, $$3));
         lp.this.a($$0, $$2);
         return this;
      }

      private lp.b k(cua $$0) {
         mi $$1 = lp.this.g.getOrDefault($$0, mi.a.get($$0));
         lp.this.b.accept(lp.c($$0, $$1.a($$0, lp.this.c)));
         return this;
      }

      private lp.b l(cua $$0) {
         lp.this.i($$0);
         return this;
      }

      private void m(cua $$0) {
         if (lp.this.e.contains($$0)) {
            lp.this.k($$0);
         } else {
            lp.this.j($$0);
         }
      }

      private afw a(me $$0, cua $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, lp.this.c));
      }

      public lp.b a(kc $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<lp.b, cua> $$2 = lp.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      ls create(cua var1, afw var2, mg var3, BiConsumer<afw, Supplier<JsonElement>> var4);
   }

   static record d(me a, String b) {
   }

   static enum e {
      a,
      b;

      public me a() {
         return this == a ? mf.an : mf.am;
      }

      public me b() {
         return this == a ? mf.ap : mf.ao;
      }
   }

   class f {
      private final mg b;

      public f(mg $$0) {
         this.b = $$0;
      }

      public lp.f a(cua $$0) {
         mg $$1 = this.b.c(mh.d, this.b.a(mh.i));
         afw $$2 = mf.i.a($$0, $$1, lp.this.c);
         lp.this.b.accept(lp.d($$0, $$2));
         return this;
      }

      public lp.f b(cua $$0) {
         afw $$1 = mf.i.a($$0, this.b, lp.this.c);
         lp.this.b.accept(lp.d($$0, $$1));
         return this;
      }

      public lp.f c(cua $$0) {
         afw $$1 = mf.i.a($$0, this.b, lp.this.c);
         afw $$2 = mf.j.a($$0, this.b, lp.this.c);
         lp.this.b.accept(lp.d($$0, $$1, $$2));
         return this;
      }

      public lp.f d(cua $$0) {
         lp.this.b.accept(lp.a($$0, this.b, lp.this.c));
         return this;
      }
   }
}
