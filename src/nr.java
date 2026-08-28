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

public class nr {
   final Consumer<nu> b;
   final BiConsumer<alf, Supplier<JsonElement>> c;
   private final Consumer<cum> d;
   final List<dfb> e = ImmutableList.of(dfd.ey, dfd.eE, dfd.hY);
   final Map<dfb, nr.c> f = ImmutableMap.builder().put(dfd.b, nr::a).put(dfd.sJ, nr::c).put(dfd.eM, nr::b).build();
   final Map<dfb, ok> g = ImmutableMap.builder()
      .put(dfd.aV, ok.y.get(dfd.aV))
      .put(dfd.jp, ok.y.get(dfd.jp))
      .put(dfd.jS, ok.a(oi.a(dfd.aV, "_top")))
      .put(dfd.jU, ok.a(oi.a(dfd.jp, "_top")))
      .put(dfd.aX, ok.d.get(dfd.aV).a($$0x -> $$0x.a(oj.i, oi.G(dfd.aX))))
      .put(dfd.jr, ok.d.get(dfd.jp).a($$0x -> $$0x.a(oj.i, oi.G(dfd.jr))))
      .put(dfd.hd, ok.d.get(dfd.hd))
      .put(dfd.jT, ok.a(oi.a(dfd.hd, "_bottom")))
      .put(dfd.pr, ok.z.get(dfd.pr))
      .put(dfd.sJ, ok.z.get(dfd.sJ))
      .put(dfd.he, ok.d.get(dfd.he).a($$0x -> $$0x.a(oj.i, oi.G(dfd.he))))
      .put(dfd.aW, ok.d.get(dfd.aW).a($$0x -> {
         $$0x.a(oj.d, oi.a(dfd.aV, "_top"));
         $$0x.a(oj.i, oi.G(dfd.aW));
      }))
      .put(dfd.jq, ok.d.get(dfd.jq).a($$0x -> {
         $$0x.a(oj.d, oi.a(dfd.jp, "_top"));
         $$0x.a(oj.i, oi.G(dfd.jq));
      }))
      .put(dfd.qM, ok.z.get(dfd.qM))
      .put(dfd.qH, ok.z.get(dfd.qH))
      .build();
   static final Map<lt.b, BiConsumer<nr.b, dfb>> h = ImmutableMap.builder()
      .put(lt.b.a, nr.b::a)
      .put(lt.b.e, nr.b::l)
      .put(lt.b.b, nr.b::k)
      .put(lt.b.c, nr.b::k)
      .put(lt.b.f, nr.b::c)
      .put(lt.b.g, nr.b::d)
      .put(lt.b.h, nr.b::e)
      .put(lt.b.i, nr.b::f)
      .put(lt.b.k, nr.b::h)
      .put(lt.b.l, nr.b::i)
      .put(lt.b.m, nr.b::j)
      .put(lt.b.n, nr.b::g)
      .put(lt.b.p, nr.b::m)
      .put(lt.b.q, nr.b::b)
      .build();
   public static final List<Pair<dsv, Function<alf, oa>>> a = List.of(
      Pair.of(dsu.L, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0)),
      Pair.of(dsu.M, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true)),
      Pair.of(dsu.N, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true)),
      Pair.of(dsu.O, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true)),
      Pair.of(dsu.J, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true)),
      Pair.of(dsu.K, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
   );
   private static final Map<nr.d, alf> i = new HashMap<>();

   private static nu a(dfb $$0, alf $$1, oi $$2, BiConsumer<alf, Supplier<JsonElement>> $$3) {
      alf $$4 = oh.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nu b(dfb $$0, alf $$1, oi $$2, BiConsumer<alf, Supplier<JsonElement>> $$3) {
      alf $$4 = oh.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nu c(dfb $$0, alf $$1, oi $$2, BiConsumer<alf, Supplier<JsonElement>> $$3) {
      alf $$4 = oh.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nr(Consumer<nu> $$0, BiConsumer<alf, Supplier<JsonElement>> $$1, Consumer<cum> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dfb $$0) {
      this.d.accept($$0.r());
   }

   void a(dfb $$0, alf $$1) {
      this.c.accept(of.a($$0.r()), new oe($$1));
   }

   private void a(cum $$0, alf $$1) {
      this.c.accept(of.a($$0), new oe($$1));
   }

   void a(cum $$0) {
      oh.bx.a(of.a($$0), oi.b($$0), this.c);
   }

   private void d(dfb $$0) {
      cum $$1 = $$0.r();
      if ($$1 != cuu.a) {
         oh.bx.a(of.a($$1), oi.F($$0), this.c);
      }
   }

   private void a(dfb $$0, String $$1) {
      cum $$2 = $$0.r();
      oh.bx.a(of.a($$2), oi.k(oi.a($$0, $$1)), this.c);
   }

   private static ny b() {
      return ny.a(dsu.R).a(je.f, oa.a().a(ob.b, ob.a.b)).a(je.d, oa.a().a(ob.b, ob.a.c)).a(je.e, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a());
   }

   private static ny c() {
      return ny.a(dsu.R).a(je.d, oa.a()).a(je.e, oa.a().a(ob.b, ob.a.b)).a(je.c, oa.a().a(ob.b, ob.a.c)).a(je.f, oa.a().a(ob.b, ob.a.d));
   }

   private static ny d() {
      return ny.a(dsu.R).a(je.f, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.b)).a(je.e, oa.a().a(ob.b, ob.a.c)).a(je.c, oa.a().a(ob.b, ob.a.d));
   }

   private static ny e() {
      return ny.a(dsu.P)
         .a(je.a, oa.a().a(ob.a, ob.a.b))
         .a(je.b, oa.a().a(ob.a, ob.a.d))
         .a(je.c, oa.a())
         .a(je.d, oa.a().a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.b, ob.a.b));
   }

   private static nx b(dfb $$0, alf $$1) {
      return nx.a($$0, a($$1));
   }

   private static oa[] a(alf $$0) {
      return new oa[]{oa.a().a(ob.c, $$0), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d)};
   }

   private static nx a(dfb $$0, alf $$1, alf $$2) {
      return nx.a($$0, oa.a().a(ob.c, $$1), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c));
   }

   private static ny a(dsv $$0, alf $$1, alf $$2) {
      return ny.a($$0).a(true, oa.a().a(ob.c, $$1)).a(false, oa.a().a(ob.c, $$2));
   }

   private void e(dfb $$0) {
      alf $$1 = ok.a.create($$0, this.c);
      alf $$2 = ok.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dfb $$0) {
      alf $$1 = ok.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dfb $$0) {
      this.b.accept(nx.a($$0).a(ny.a(dsu.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         alf $$3 = oi.a($$0, $$2);
         return oa.a().a(ob.c, oh.c.a($$0, $$2, new oi().a(oj.a, $$3), this.c));
      })));
      this.a($$0, oi.a($$0, "_0"));
   }

   static nu b(dfb $$0, alf $$1, alf $$2) {
      return nx.a($$0)
         .a(ny.a(dsu.w).a(false, oa.a().a(ob.c, $$1)).a(true, oa.a().a(ob.c, $$2)))
         .a(
            ny.a(dsu.U, dsu.R)
               .a(dsp.a, je.f, oa.a().a(ob.b, ob.a.b))
               .a(dsp.a, je.e, oa.a().a(ob.b, ob.a.d))
               .a(dsp.a, je.d, oa.a().a(ob.b, ob.a.c))
               .a(dsp.a, je.c, oa.a())
               .a(dsp.b, je.f, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsp.b, je.e, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsp.b, je.d, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsp.b, je.c, oa.a().a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsp.c, je.f, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.c))
               .a(dsp.c, je.e, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.c))
               .a(dsp.c, je.d, oa.a().a(ob.a, ob.a.c))
               .a(dsp.c, je.c, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.c))
         );
   }

   private static ny.d<je, dta, dsz, Boolean> a(ny.d<je, dta, dsz, Boolean> $$0, dta $$1, alf $$2, alf $$3, alf $$4, alf $$5) {
      return $$0.a(je.f, $$1, dsz.a, false, oa.a().a(ob.c, $$2))
         .a(je.d, $$1, dsz.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsz.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsz.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsz.b, false, oa.a().a(ob.c, $$4))
         .a(je.d, $$1, dsz.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsz.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsz.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
         .a(je.d, $$1, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
         .a(je.e, $$1, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         .a(je.c, $$1, dsz.a, true, oa.a().a(ob.c, $$3))
         .a(je.f, $$1, dsz.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.d))
         .a(je.d, $$1, dsz.b, true, oa.a().a(ob.c, $$5))
         .a(je.e, $$1, dsz.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         .a(je.c, $$1, dsz.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.c));
   }

   private static nu a(dfb $$0, alf $$1, alf $$2, alf $$3, alf $$4, alf $$5, alf $$6, alf $$7, alf $$8) {
      return nx.a($$0).a(a(a(ny.a(dsu.R, dsu.ae, dsu.be, dsu.u), dta.b, $$1, $$2, $$3, $$4), dta.a, $$5, $$6, $$7, $$8));
   }

   static nu a(dfb $$0, alf $$1, alf $$2, alf $$3, alf $$4, alf $$5) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsu.L, true), oa.a().a(ob.c, $$2).a(ob.d, false))
         .a(nv.a().a(dsu.M, true), oa.a().a(ob.c, $$3).a(ob.d, false))
         .a(nv.a().a(dsu.N, true), oa.a().a(ob.c, $$4).a(ob.d, false))
         .a(nv.a().a(dsu.O, true), oa.a().a(ob.c, $$5).a(ob.d, false));
   }

   static nu c(dfb $$0, alf $$1, alf $$2) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsu.L, true), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dsu.M, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsu.N, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsu.O, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dfb $$0, alf $$1, alf $$2, alf $$3) {
      return nw.a($$0)
         .a(nv.a().a(dsu.J, true), oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsu.X, dtq.b), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dsu.W, dtq.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsu.Y, dtq.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsu.Z, dtq.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
         .a(nv.a().a(dsu.X, dtq.c), oa.a().a(ob.c, $$3).a(ob.d, true))
         .a(nv.a().a(dsu.W, dtq.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsu.Y, dtq.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsu.Z, dtq.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dfb $$0, alf $$1, alf $$2, alf $$3, alf $$4, boolean $$5) {
      return nx.a($$0, oa.a().a(ob.d, $$5))
         .a(c())
         .a(
            ny.a(dsu.q, dsu.u)
               .a(false, false, oa.a().a(ob.c, $$2))
               .a(true, false, oa.a().a(ob.c, $$4))
               .a(false, true, oa.a().a(ob.c, $$1))
               .a(true, true, oa.a().a(ob.c, $$3))
         );
   }

   static nu b(dfb $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsu.R, dsu.af, dsu.bi)
               .a(je.f, dtd.b, dtn.a, oa.a().a(ob.c, $$2))
               .a(je.e, dtd.b, dtn.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtd.b, dtn.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtd.b, dtn.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtd.b, dtn.e, oa.a().a(ob.c, $$3))
               .a(je.e, dtd.b, dtn.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtd.b, dtn.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtd.b, dtn.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtd.b, dtn.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dtd.b, dtn.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dtd.b, dtn.d, oa.a().a(ob.c, $$3))
               .a(je.c, dtd.b, dtn.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dtd.b, dtn.c, oa.a().a(ob.c, $$1))
               .a(je.e, dtd.b, dtn.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtd.b, dtn.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtd.b, dtn.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtd.b, dtn.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dtd.b, dtn.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dtd.b, dtn.b, oa.a().a(ob.c, $$1))
               .a(je.c, dtd.b, dtn.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dtd.a, dtn.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dtd.a, dtn.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtd.a, dtn.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtd.a, dtn.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtd.a, dtn.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dtd.a, dtn.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dtd.a, dtn.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dtd.a, dtn.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dtd.a, dtn.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dtd.a, dtn.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtd.a, dtn.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtd.a, dtn.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtd.a, dtn.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dtd.a, dtn.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dtd.a, dtn.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dtd.a, dtn.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dtd.a, dtn.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dtd.a, dtn.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtd.a, dtn.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtd.a, dtn.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
         );
   }

   private static nu c(dfb $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsu.R, dsu.af, dsu.u)
               .a(je.c, dtd.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dtd.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(je.f, dtd.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(je.e, dtd.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(je.c, dtd.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dtd.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(je.f, dtd.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(je.e, dtd.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(je.c, dtd.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dtd.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dtd.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dtd.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dtd.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c))
               .a(je.d, dtd.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.a))
               .a(je.f, dtd.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               .a(je.e, dtd.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b))
         );
   }

   private static nu d(dfb $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsu.R, dsu.af, dsu.u)
               .a(je.c, dtd.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dtd.b, false, oa.a().a(ob.c, $$2))
               .a(je.f, dtd.b, false, oa.a().a(ob.c, $$2))
               .a(je.e, dtd.b, false, oa.a().a(ob.c, $$2))
               .a(je.c, dtd.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dtd.a, false, oa.a().a(ob.c, $$1))
               .a(je.f, dtd.a, false, oa.a().a(ob.c, $$1))
               .a(je.e, dtd.a, false, oa.a().a(ob.c, $$1))
               .a(je.c, dtd.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dtd.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dtd.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dtd.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dtd.a, true, oa.a().a(ob.c, $$3))
               .a(je.d, dtd.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dtd.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dtd.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         );
   }

   static nx c(dfb $$0, alf $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1));
   }

   private static ny f() {
      return ny.a(dsu.I).a(je.a.b, oa.a()).a(je.a.c, oa.a().a(ob.a, ob.a.b)).a(je.a.a, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   static nu a(dfb $$0, oi $$1, BiConsumer<alf, Supplier<JsonElement>> $$2) {
      alf $$3 = oh.g.a($$0, $$1, $$2);
      alf $$4 = oh.h.a($$0, $$1, $$2);
      alf $$5 = oh.i.a($$0, $$1, $$2);
      alf $$6 = oh.j.a($$0, $$1, $$2);
      return nx.a($$0, oa.a().a(ob.c, $$6)).a(ny.a(dsu.I).a(je.a.a, oa.a().a(ob.c, $$3)).a(je.a.b, oa.a().a(ob.c, $$4)).a(je.a.c, oa.a().a(ob.c, $$5)));
   }

   static nu d(dfb $$0, alf $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1)).a(f());
   }

   private void e(dfb $$0, alf $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dfb $$0, ok.a $$1) {
      alf $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dfb $$0, ok.a $$1) {
      alf $$2 = $$1.create($$0, this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   static nu d(dfb $$0, alf $$1, alf $$2) {
      return nx.a($$0)
         .a(
            ny.a(dsu.I)
               .a(je.a.b, oa.a().a(ob.c, $$1))
               .a(je.a.c, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b))
               .a(je.a.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.b, ob.a.b))
         );
   }

   private void a(dfb $$0, ok.a $$1, ok.a $$2) {
      alf $$3 = $$1.create($$0, this.c);
      alf $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private alf a(dfb $$0, String $$1, og $$2, Function<alf, oi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oi.a($$0, $$1)), this.c);
   }

   static nu e(dfb $$0, alf $$1, alf $$2) {
      return nx.a($$0).a(a(dsu.w, $$2, $$1));
   }

   static nu e(dfb $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0).a(ny.a(dsu.bh).a(dtm.b, oa.a().a(ob.c, $$1)).a(dtm.a, oa.a().a(ob.c, $$2)).a(dtm.c, oa.a().a(ob.c, $$3)));
   }

   public void a(dfb $$0) {
      this.b($$0, ok.a);
   }

   public void b(dfb $$0, ok.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dfb $$0, oi $$1, og $$2) {
      alf $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nr.b h(dfb $$0) {
      ok $$1 = this.g.getOrDefault($$0, ok.a.get($$0));
      return new nr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dfb $$0, dfb $$1, dfb $$2) {
      oi $$3 = oi.u($$0);
      alf $$4 = oh.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dfb $$0) {
      oi $$1 = oi.t($$0);
      alf $$2 = oh.v.a($$0, $$1, this.c);
      alf $$3 = oh.w.a($$0, $$1, this.c);
      alf $$4 = oh.x.a($$0, $$1, this.c);
      alf $$5 = oh.y.a($$0, $$1, this.c);
      alf $$6 = oh.z.a($$0, $$1, this.c);
      alf $$7 = oh.A.a($$0, $$1, this.c);
      alf $$8 = oh.B.a($$0, $$1, this.c);
      alf $$9 = oh.C.a($$0, $$1, this.c);
      this.a($$0.r());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dfb $$0, dfb $$1) {
      alf $$2 = oh.v.a($$0);
      alf $$3 = oh.w.a($$0);
      alf $$4 = oh.x.a($$0);
      alf $$5 = oh.y.a($$0);
      alf $$6 = oh.z.a($$0);
      alf $$7 = oh.A.a($$0);
      alf $$8 = oh.B.a($$0);
      alf $$9 = oh.C.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dfb $$0) {
      oi $$1 = oi.b($$0);
      alf $$2 = oh.ak.a($$0, $$1, this.c);
      alf $$3 = oh.al.a($$0, $$1, this.c);
      alf $$4 = oh.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dfb $$0) {
      oi $$1 = oi.b($$0);
      alf $$2 = oh.ah.a($$0, $$1, this.c);
      alf $$3 = oh.ai.a($$0, $$1, this.c);
      alf $$4 = oh.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dfb $$0, dfb $$1) {
      alf $$2 = oh.ah.a($$0);
      alf $$3 = oh.ai.a($$0);
      alf $$4 = oh.aj.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dfd.sD);
      alf $$0 = of.a(dfd.sD);
      alf $$1 = of.a(dfd.sD, "_partial_tilt");
      alf $$2 = of.a(dfd.sD, "_full_tilt");
      this.b
         .accept(
            nx.a(dfd.sD)
               .a(b())
               .a(ny.a(dsu.bl).a(dtp.a, oa.a().a(ob.c, $$0)).a(dtp.b, oa.a().a(ob.c, $$0)).a(dtp.c, oa.a().a(ob.c, $$1)).a(dtp.d, oa.a().a(ob.c, $$2)))
         );
   }

   private nr.f l(dfb $$0) {
      return new nr.f(oi.n($$0));
   }

   private void m(dfb $$0) {
      this.c($$0, $$0);
   }

   private void c(dfb $$0, dfb $$1) {
      this.b.accept(c($$0, of.a($$1)));
   }

   private void a(dfb $$0, nr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dfb $$0, nr.e $$1, oi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfb $$0, nr.e $$1) {
      oi $$2 = oi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfb $$0, nr.e $$1, oi $$2) {
      alf $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dfb $$0, nr.e $$1, dth<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         ny $$4 = ny.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            oi $$5 = oi.c(oi.a($$0, $$4x));
            alf $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return oa.a().a(ob.c, $$6);
         });
         this.a($$0.r());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void a(dfb $$0, dfb $$1, nr.e $$2) {
      this.a($$0, $$2);
      oi $$3 = oi.d($$0);
      alf $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dfb $$0, dfb $$1) {
      ok $$2 = ok.p.get($$0);
      alf $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alf $$4 = oh.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dfb $$0, dfb $$1) {
      this.a($$0.r());
      oi $$2 = oi.h($$0);
      oi $$3 = oi.a($$0, $$1);
      alf $$4 = oh.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nx.a($$1, oa.a().a(ob.c, $$4))
               .a(ny.a(dsu.R).a(je.e, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a().a(ob.b, ob.a.b)).a(je.f, oa.a().a(ob.b, ob.a.c)))
         );
      this.b.accept(nx.a($$0).a(ny.a(dsu.av).a($$2x -> oa.a().a(ob.c, oh.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dfb $$0 = dfd.kC;
      this.a($$0.r());
      alf $$1 = of.a($$0, "_top");
      alf $$2 = of.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dfb $$0 = dfd.kB;
      this.a($$0.r());
      ny $$1 = ny.a(dkq.d, dsu.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oa.a().a(ob.c, of.a($$0, "_top_stage_" + $$1x));
            case b -> oa.a().a(ob.c, of.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nx.a($$0).a($$1));
   }

   private void a(dfb $$0, dfb $$1, dfb $$2, dfb $$3, dfb $$4, dfb $$5, dfb $$6, dfb $$7) {
      this.a($$0, nr.e.b);
      this.a($$1, nr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dfb $$0, nr.e $$1) {
      this.a($$0, "_top");
      alf $$2 = this.a($$0, "_top", $$1.a(), oi::c);
      alf $$3 = this.a($$0, "_bottom", $$1.a(), oi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dfd.iD, "_front");
      alf $$0 = of.a(dfd.iD, "_top");
      alf $$1 = this.a(dfd.iD, "_bottom", nr.e.b.a(), oi::c);
      this.f(dfd.iD, $$0, $$1);
   }

   private void k() {
      alf $$0 = this.a(dfd.bx, "_top", oh.bk, oi::a);
      alf $$1 = this.a(dfd.bx, "_bottom", oh.bk, oi::a);
      this.f(dfd.bx, $$0, $$1);
   }

   private void l() {
      this.c(dfd.sF);
      alf $$0 = of.a(dfd.sF, "_top");
      alf $$1 = of.a(dfd.sF, "_bottom");
      this.b.accept(nx.a(dfd.sF).a(b()).a(ny.a(dsu.ae).a(dta.b, oa.a().a(ob.c, $$1)).a(dta.a, oa.a().a(ob.c, $$0))));
   }

   private void f(dfb $$0, alf $$1, alf $$2) {
      this.b.accept(nx.a($$0).a(ny.a(dsu.ae).a(dta.b, oa.a().a(ob.c, $$2)).a(dta.a, oa.a().a(ob.c, $$1))));
   }

   private void n(dfb $$0) {
      oi $$1 = oi.e($$0);
      oi $$2 = oi.e(oi.a($$0, "_corner"));
      alf $$3 = oh.as.a($$0, $$1, this.c);
      alf $$4 = oh.at.a($$0, $$2, this.c);
      alf $$5 = oh.au.a($$0, $$1, this.c);
      alf $$6 = oh.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsu.ag)
                     .a(dti.a, oa.a().a(ob.c, $$3))
                     .a(dti.b, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(dti.c, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
                     .a(dti.d, oa.a().a(ob.c, $$6).a(ob.b, ob.a.b))
                     .a(dti.e, oa.a().a(ob.c, $$5))
                     .a(dti.f, oa.a().a(ob.c, $$6))
                     .a(dti.g, oa.a().a(ob.c, $$4))
                     .a(dti.h, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
                     .a(dti.i, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
                     .a(dti.j, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
               )
         );
   }

   private void o(dfb $$0) {
      alf $$1 = this.a($$0, "", oh.as, oi::e);
      alf $$2 = this.a($$0, "", oh.au, oi::e);
      alf $$3 = this.a($$0, "", oh.av, oi::e);
      alf $$4 = this.a($$0, "_on", oh.as, oi::e);
      alf $$5 = this.a($$0, "_on", oh.au, oi::e);
      alf $$6 = this.a($$0, "_on", oh.av, oi::e);
      ny $$7 = ny.a(dsu.w, dsu.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return oa.a().a(ob.c, $$6x ? $$4 : $$1);
            case b:
               return oa.a().a(ob.c, $$6x ? $$4 : $$1).a(ob.b, ob.a.b);
            case c:
               return oa.a().a(ob.c, $$6x ? $$5 : $$2).a(ob.b, ob.a.b);
            case d:
               return oa.a().a(ob.c, $$6x ? $$6 : $$3).a(ob.b, ob.a.b);
            case e:
               return oa.a().a(ob.c, $$6x ? $$5 : $$2);
            case f:
               return oa.a().a(ob.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(nx.a($$0).a($$7));
   }

   private nr.a a(alf $$0, dfb $$1) {
      return new nr.a($$0, $$1);
   }

   private nr.a f(dfb $$0, dfb $$1) {
      return new nr.a(of.a($$0), $$1);
   }

   private void a(dfb $$0, cum $$1) {
      alf $$2 = oh.aa.a($$0, oi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dfb $$0, alf $$1) {
      alf $$2 = oh.aa.a($$0, oi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dfb $$0, dfb $$1) {
      this.a($$0);
      alf $$2 = ok.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dfb $$0) {
      this.a($$0.r());
      alf $$1 = ok.k.create($$0, this.c);
      alf $$2 = ok.l.create($$0, this.c);
      alf $$3 = ok.m.create($$0, this.c);
      alf $$4 = ok.n.create($$0, this.c);
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dsu.S, 1, 2, 3, 4).a(dsu.R, je.c), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsu.S, 1, 2, 3, 4).a(dsu.R, je.f), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.S, 1, 2, 3, 4).a(dsu.R, je.d), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(nv.a().a(dsu.S, 1, 2, 3, 4).a(dsu.R, je.e), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(nv.a().a(dsu.S, 2, 3, 4).a(dsu.R, je.c), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsu.S, 2, 3, 4).a(dsu.R, je.f), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.S, 2, 3, 4).a(dsu.R, je.d), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(nv.a().a(dsu.S, 2, 3, 4).a(dsu.R, je.e), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(nv.a().a(dsu.S, 3, 4).a(dsu.R, je.c), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsu.S, 3, 4).a(dsu.R, je.f), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.S, 3, 4).a(dsu.R, je.d), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(nv.a().a(dsu.S, 3, 4).a(dsu.R, je.e), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(nv.a().a(dsu.S, 4).a(dsu.R, je.c), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsu.S, 4).a(dsu.R, je.f), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.S, 4).a(dsu.R, je.d), oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
               .a(nv.a().a(dsu.S, 4).a(dsu.R, je.e), oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         );
   }

   private void a(ok.a $$0, dfb... $$1) {
      for (dfb $$2 : $$1) {
         alf $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ok.a $$0, dfb... $$1) {
      for (dfb $$2 : $$1) {
         alf $$3 = $$0.create($$2, this.c);
         this.b.accept(nx.a($$2, oa.a().a(ob.c, $$3)).a(c()));
      }
   }

   private void h(dfb $$0, dfb $$1) {
      this.a($$0);
      oi $$2 = oi.b($$0, $$1);
      alf $$3 = oh.aI.a($$1, $$2, this.c);
      alf $$4 = oh.aJ.a($$1, $$2, this.c);
      alf $$5 = oh.aK.a($$1, $$2, this.c);
      alf $$6 = oh.aG.a($$1, $$2, this.c);
      alf $$7 = oh.aH.a($$1, $$2, this.c);
      cum $$8 = $$1.r();
      oh.bx.a(of.a($$8), oi.F($$0), this.c);
      this.b
         .accept(
            nw.a($$1)
               .a(oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsu.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsu.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dsu.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.L, false), oa.a().a(ob.c, $$6))
               .a(nv.a().a(dsu.M, false), oa.a().a(ob.c, $$7))
               .a(nv.a().a(dsu.N, false), oa.a().a(ob.c, $$7).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.O, false), oa.a().a(ob.c, $$6).a(ob.b, ob.a.d))
         );
   }

   private void q(dfb $$0) {
      oi $$1 = oi.z($$0);
      alf $$2 = oh.aL.a($$0, $$1, this.c);
      alf $$3 = this.a($$0, "_conditional", oh.aL, $$1x -> $$1.c(oj.i, $$1x));
      this.b.accept(nx.a($$0).a(a(dsu.c, $$3, $$2)).a(e()));
   }

   private void r(dfb $$0) {
      alf $$1 = ok.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oa> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oa.a().a(ob.c, of.a(dfd.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dfd.mZ);
      this.b
         .accept(
            nw.a(dfd.mZ)
               .a(nv.a().a(dsu.aq, 0), this.a(0))
               .a(nv.a().a(dsu.aq, 1), this.a(1))
               .a(nv.a().a(dsu.bk, dsq.b), oa.a().a(ob.c, of.a(dfd.mZ, "_small_leaves")))
               .a(nv.a().a(dsu.bk, dsq.c), oa.a().a(ob.c, of.a(dfd.mZ, "_large_leaves")))
         );
   }

   private ny n() {
      return ny.a(dsu.P)
         .a(je.a, oa.a().a(ob.a, ob.a.c))
         .a(je.b, oa.a())
         .a(je.c, oa.a().a(ob.a, ob.a.b))
         .a(je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   private void o() {
      alf $$0 = oi.a(dfd.nU, "_top_open");
      this.b
         .accept(
            nx.a(dfd.nU)
               .a(this.n())
               .a(
                  ny.a(dsu.u)
                     .a(false, oa.a().a(ob.c, ok.f.create(dfd.nU, this.c)))
                     .a(true, oa.a().a(ob.c, ok.f.get(dfd.nU).a($$1 -> $$1.a(oj.f, $$0)).a(dfd.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ny a(dth<T> $$0, T $$1, alf $$2, alf $$3) {
      oa $$4 = oa.a().a(ob.c, $$2);
      oa $$5 = oa.a().a(ob.c, $$3);
      return ny.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dfb $$0, Function<dfb, oi> $$1) {
      oi $$2 = $$1.apply($$0).b(oj.i, oj.c);
      oi $$3 = $$2.c(oj.g, oi.a($$0, "_front_honey"));
      alf $$4 = oh.q.a($$0, $$2, this.c);
      alf $$5 = oh.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nx.a($$0).a(b()).a(a(dsu.aN, 5, $$5, $$4)));
   }

   private void a(dfb $$0, dth<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alf> $$3 = new Int2ObjectOpenHashMap();
         ny $$4 = ny.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alf $$5 = (alf)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, oh.aV, oi::g));
            return oa.a().a(ob.c, $$5);
         });
         this.a($$0.r());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void p() {
      alf $$0 = of.a(dfd.od, "_floor");
      alf $$1 = of.a(dfd.od, "_ceiling");
      alf $$2 = of.a(dfd.od, "_wall");
      alf $$3 = of.a(dfd.od, "_between_walls");
      this.a(cuu.wo);
      this.b
         .accept(
            nx.a(dfd.od)
               .a(
                  ny.a(dsu.R, dsu.V)
                     .a(je.c, dss.a, oa.a().a(ob.c, $$0))
                     .a(je.d, dss.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.c))
                     .a(je.f, dss.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.b))
                     .a(je.e, dss.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.d))
                     .a(je.c, dss.b, oa.a().a(ob.c, $$1))
                     .a(je.d, dss.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.f, dss.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.e, dss.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
                     .a(je.c, dss.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
                     .a(je.d, dss.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
                     .a(je.f, dss.c, oa.a().a(ob.c, $$2))
                     .a(je.e, dss.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
                     .a(je.d, dss.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(je.c, dss.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
                     .a(je.f, dss.d, oa.a().a(ob.c, $$3))
                     .a(je.e, dss.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nx.a(dfd.nZ, oa.a().a(ob.c, of.a(dfd.nZ)))
               .a(
                  ny.a(dsu.U, dsu.R)
                     .a(dsp.a, je.c, oa.a())
                     .a(dsp.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsp.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsp.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsp.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsp.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsp.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsp.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
                     .a(dsp.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsp.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsp.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsp.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               )
         );
   }

   private void d(dfb $$0, ok.a $$1) {
      alf $$2 = $$1.create($$0, this.c);
      alf $$3 = oi.a($$0, "_front_on");
      alf $$4 = $$1.get($$0).a($$1x -> $$1x.a(oj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nx.a($$0).a(a(dsu.r, $$4, $$2)).a(b()));
   }

   private void a(dfb... $$0) {
      alf $$1 = of.a("campfire_off");

      for (dfb $$2 : $$0) {
         alf $$3 = oh.bc.a($$2, oi.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nx.a($$2).a(a(dsu.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dfb $$0) {
      alf $$1 = oh.bt.a($$0, oi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dfb $$0) {
      alf $$1;
      if ($$0 == dfd.tj) {
         $$1 = oh.bv.a($$0, oi.m($$0), this.c);
      } else {
         $$1 = oh.bu.a($$0, oi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oi $$0 = oi.a(oi.G(dfd.cl), oi.G(dfd.n));
      alf $$1 = oh.j.a(dfd.cl, $$0, this.c);
      this.b.accept(c(dfd.cl, $$1));
   }

   private void s() {
      this.a(cuu.lH);
      this.b
         .accept(
            nw.a(dfd.cw)
               .a(
                  nv.b(
                     nv.a().a(dsu.ab, dtj.c).a(dsu.aa, dtj.c).a(dsu.ac, dtj.c).a(dsu.ad, dtj.c),
                     nv.a().a(dsu.ab, dtj.b, dtj.a).a(dsu.aa, dtj.b, dtj.a),
                     nv.a().a(dsu.aa, dtj.b, dtj.a).a(dsu.ac, dtj.b, dtj.a),
                     nv.a().a(dsu.ac, dtj.b, dtj.a).a(dsu.ad, dtj.b, dtj.a),
                     nv.a().a(dsu.ad, dtj.b, dtj.a).a(dsu.ab, dtj.b, dtj.a)
                  ),
                  oa.a().a(ob.c, of.a("redstone_dust_dot"))
               )
               .a(nv.a().a(dsu.ab, dtj.b, dtj.a), oa.a().a(ob.c, of.a("redstone_dust_side0")))
               .a(nv.a().a(dsu.ac, dtj.b, dtj.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt0")))
               .a(nv.a().a(dsu.aa, dtj.b, dtj.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dsu.ad, dtj.b, dtj.a), oa.a().a(ob.c, of.a("redstone_dust_side1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dsu.ab, dtj.a), oa.a().a(ob.c, of.a("redstone_dust_up")))
               .a(nv.a().a(dsu.aa, dtj.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.ac, dtj.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.c))
               .a(nv.a().a(dsu.ad, dtj.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.d))
         );
   }

   private void t() {
      this.a(cuu.lL);
      this.b
         .accept(
            nx.a(dfd.gY)
               .a(c())
               .a(
                  ny.a(dsu.bd, dsu.w)
                     .a(dsx.a, false, oa.a().a(ob.c, of.a(dfd.gY)))
                     .a(dsx.a, true, oa.a().a(ob.c, of.a(dfd.gY, "_on")))
                     .a(dsx.b, false, oa.a().a(ob.c, of.a(dfd.gY, "_subtract")))
                     .a(dsx.b, true, oa.a().a(ob.c, of.a(dfd.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oi $$0 = oi.a(dfd.jR);
      oi $$1 = oi.a(oi.a(dfd.jE, "_side"), $$0.a(oj.f));
      alf $$2 = oh.ab.a(dfd.jE, $$1, this.c);
      alf $$3 = oh.ac.a(dfd.jE, $$1, this.c);
      alf $$4 = oh.j.b(dfd.jE, "_double", $$1, this.c);
      this.b.accept(e(dfd.jE, $$2, $$3, $$4));
      this.b.accept(c(dfd.jR, oh.c.a(dfd.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cuu.sq);
      this.b
         .accept(
            nw.a(dfd.fs)
               .a(oa.a().a(ob.c, oi.G(dfd.fs)))
               .a(nv.a().a(dsu.k, true), oa.a().a(ob.c, oi.a(dfd.fs, "_bottle0")))
               .a(nv.a().a(dsu.l, true), oa.a().a(ob.c, oi.a(dfd.fs, "_bottle1")))
               .a(nv.a().a(dsu.m, true), oa.a().a(ob.c, oi.a(dfd.fs, "_bottle2")))
               .a(nv.a().a(dsu.k, false), oa.a().a(ob.c, oi.a(dfd.fs, "_empty0")))
               .a(nv.a().a(dsu.l, false), oa.a().a(ob.c, oi.a(dfd.fs, "_empty1")))
               .a(nv.a().a(dsu.m, false), oa.a().a(ob.c, oi.a(dfd.fs, "_empty2")))
         );
   }

   private void u(dfb $$0) {
      alf $$1 = oh.bp.a($$0, oi.b($$0), this.c);
      alf $$2 = of.a("mushroom_block_inside");
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dsu.L, true), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsu.M, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsu.N, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dsu.O, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsu.J, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsu.K, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsu.L, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsu.M, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, false))
               .a(nv.a().a(dsu.N, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, false))
               .a(nv.a().a(dsu.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dsu.J, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dsu.K, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, false))
         );
      this.a($$0, ok.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cuu.rB);
      this.b
         .accept(
            nx.a(dfd.eg)
               .a(
                  ny.a(dsu.ay)
                     .a(0, oa.a().a(ob.c, of.a(dfd.eg)))
                     .a(1, oa.a().a(ob.c, of.a(dfd.eg, "_slice1")))
                     .a(2, oa.a().a(ob.c, of.a(dfd.eg, "_slice2")))
                     .a(3, oa.a().a(ob.c, of.a(dfd.eg, "_slice3")))
                     .a(4, oa.a().a(ob.c, of.a(dfd.eg, "_slice4")))
                     .a(5, oa.a().a(ob.c, of.a(dfd.eg, "_slice5")))
                     .a(6, oa.a().a(ob.c, of.a(dfd.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dfd.nX, "_side3"))
         .a(oj.o, oi.G(dfd.t))
         .a(oj.n, oi.a(dfd.nX, "_top"))
         .a(oj.j, oi.a(dfd.nX, "_side3"))
         .a(oj.l, oi.a(dfd.nX, "_side3"))
         .a(oj.k, oi.a(dfd.nX, "_side1"))
         .a(oj.m, oi.a(dfd.nX, "_side2"));
      this.b.accept(c(dfd.nX, oh.a.a(dfd.nX, $$0, this.c)));
   }

   private void y() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dfd.ob, "_front"))
         .a(oj.o, oi.a(dfd.ob, "_bottom"))
         .a(oj.n, oi.a(dfd.ob, "_top"))
         .a(oj.j, oi.a(dfd.ob, "_front"))
         .a(oj.k, oi.a(dfd.ob, "_front"))
         .a(oj.l, oi.a(dfd.ob, "_side"))
         .a(oj.m, oi.a(dfd.ob, "_side"));
      this.b.accept(c(dfd.ob, oh.a.a(dfd.ob, $$0, this.c)));
   }

   private void a(dfb $$0, dfb $$1, BiFunction<dfb, dfb, oi> $$2) {
      oi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oh.a.a($$0, $$3, this.c)));
   }

   public void b(dfb $$0) {
      oi $$1 = new oi()
         .a(oj.c, oi.a($$0, "_particle"))
         .a(oj.o, oi.a($$0, "_down"))
         .a(oj.n, oi.a($$0, "_up"))
         .a(oj.j, oi.a($$0, "_north"))
         .a(oj.k, oi.a($$0, "_south"))
         .a(oj.l, oi.a($$0, "_east"))
         .a(oj.m, oi.a($$0, "_west"));
      this.b.accept(c($$0, oh.a.a($$0, $$1, this.c)));
   }

   private void z() {
      oi $$0 = oi.k(dfd.eZ);
      this.b.accept(c(dfd.eZ, of.a(dfd.eZ)));
      this.a(dfd.ee, $$0);
      this.a(dfd.ef, $$0);
   }

   private void a(dfb $$0, oi $$1) {
      alf $$2 = oh.p.a($$0, $$1.c(oj.g, oi.G($$0)), this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cuu.sr);
      this.m(dfd.ft);
      this.b.accept(c(dfd.fv, oh.bs.a(dfd.fv, oi.j(oi.a(dfd.H, "_still")), this.c)));
      this.b
         .accept(
            nx.a(dfd.fu)
               .a(
                  ny.a(djk.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dfd.fu, "_level1", oi.j(oi.a(dfd.G, "_still")), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dfd.fu, "_level2", oi.j(oi.a(dfd.G, "_still")), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dfd.fu, "_full", oi.j(oi.a(dfd.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nx.a(dfd.fw)
               .a(
                  ny.a(djk.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dfd.fw, "_level1", oi.j(oi.G(dfd.qP)), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dfd.fw, "_level2", oi.j(oi.G(dfd.qP)), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dfd.fw, "_full", oi.j(oi.G(dfd.qP)), this.c)))
               )
         );
   }

   private void B() {
      oi $$0 = oi.b(dfd.kv);
      alf $$1 = oh.aE.a(dfd.kv, $$0, this.c);
      alf $$2 = this.a(dfd.kv, "_dead", oh.aE, $$1x -> $$0.c(oj.b, $$1x));
      this.b.accept(nx.a(dfd.kv).a(a(dsu.au, 5, $$2, $$1)));
   }

   private void C() {
      alf $$0 = of.a(dfd.tq);
      alf $$1 = of.a(dfd.tq, "_triggered");
      alf $$2 = of.a(dfd.tq, "_crafting");
      alf $$3 = of.a(dfd.tq, "_crafting_triggered");
      this.b
         .accept(
            nx.a(dfd.tq)
               .a(ny.a(dsu.T).a($$0x -> this.a($$0x, oa.a())))
               .a(
                  ny.a(dsu.A, dgu.b)
                     .a(false, false, oa.a().a(ob.c, $$0))
                     .a(true, true, oa.a().a(ob.c, $$3))
                     .a(true, false, oa.a().a(ob.c, $$1))
                     .a(false, true, oa.a().a(ob.c, $$2))
               )
         );
   }

   private void v(dfb $$0) {
      oi $$1 = new oi().a(oj.f, oi.a(dfd.cD, "_top")).a(oj.i, oi.a(dfd.cD, "_side")).a(oj.g, oi.a($$0, "_front"));
      oi $$2 = new oi().a(oj.i, oi.a(dfd.cD, "_top")).a(oj.g, oi.a($$0, "_front_vertical"));
      alf $$3 = oh.p.a($$0, $$1, this.c);
      alf $$4 = oh.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsu.P)
                     .a(je.a, oa.a().a(ob.c, $$4).a(ob.a, ob.a.c))
                     .a(je.b, oa.a().a(ob.c, $$4))
                     .a(je.c, oa.a().a(ob.c, $$3))
                     .a(je.f, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(je.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
                     .a(je.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               )
         );
   }

   private void D() {
      alf $$0 = of.a(dfd.fy);
      alf $$1 = of.a(dfd.fy, "_filled");
      this.b.accept(nx.a(dfd.fy).a(ny.a(dsu.h).a(false, oa.a().a(ob.c, $$0)).a(true, oa.a().a(ob.c, $$1))).a(c()));
   }

   private void E() {
      alf $$0 = of.a(dfd.ku, "_side");
      alf $$1 = of.a(dfd.ku, "_noside");
      alf $$2 = of.a(dfd.ku, "_noside1");
      alf $$3 = of.a(dfd.ku, "_noside2");
      alf $$4 = of.a(dfd.ku, "_noside3");
      this.b
         .accept(
            nw.a(dfd.ku)
               .a(nv.a().a(dsu.L, true), oa.a().a(ob.c, $$0))
               .a(nv.a().a(dsu.M, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsu.N, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dsu.O, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsu.J, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsu.K, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsu.L, false), oa.a().a(ob.c, $$1).a(ob.e, 2), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$3), oa.a().a(ob.c, $$4))
               .a(
                  nv.a().a(dsu.M, false),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.b).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsu.N, false),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsu.O, false),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsu.J, false),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsu.K, false),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.b).a(ob.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            nw.a(dfd.pc)
               .a(oa.a().a(ob.c, oi.G(dfd.pc)))
               .a(nv.a().a(dsu.aL, 1), oa.a().a(ob.c, oi.a(dfd.pc, "_contents1")))
               .a(nv.a().a(dsu.aL, 2), oa.a().a(ob.c, oi.a(dfd.pc, "_contents2")))
               .a(nv.a().a(dsu.aL, 3), oa.a().a(ob.c, oi.a(dfd.pc, "_contents3")))
               .a(nv.a().a(dsu.aL, 4), oa.a().a(ob.c, oi.a(dfd.pc, "_contents4")))
               .a(nv.a().a(dsu.aL, 5), oa.a().a(ob.c, oi.a(dfd.pc, "_contents5")))
               .a(nv.a().a(dsu.aL, 6), oa.a().a(ob.c, oi.a(dfd.pc, "_contents6")))
               .a(nv.a().a(dsu.aL, 7), oa.a().a(ob.c, oi.a(dfd.pc, "_contents7")))
               .a(nv.a().a(dsu.aL, 8), oa.a().a(ob.c, oi.a(dfd.pc, "_contents_ready")))
         );
   }

   private void w(dfb $$0) {
      alf $$1 = oh.c.a($$0, oi.a($$0), this.c);
      alf $$2 = this.a($$0, "_powered", oh.c, oi::b);
      alf $$3 = this.a($$0, "_lit", oh.c, oi::b);
      alf $$4 = this.a($$0, "_lit_powered", oh.c, oi::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nu a(dfb $$0, alf $$1, alf $$2, alf $$3, alf $$4) {
      return nx.a($$0).a(ny.a(dsu.r, dsu.w).a(($$4x, $$5) -> $$4x ? oa.a().a(ob.c, $$5 ? $$4 : $$2) : oa.a().a(ob.c, $$5 ? $$3 : $$1)));
   }

   private void i(dfb $$0, dfb $$1) {
      alf $$2 = of.a($$0);
      alf $$3 = of.a($$0, "_powered");
      alf $$4 = of.a($$0, "_lit");
      alf $$5 = of.a($$0, "_lit_powered");
      this.a($$1, of.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dfb $$0) {
      this.c($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, oh.ao.a($$0, oi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dfd.qy);
      this.x(dfd.qx);
      this.x(dfd.qw);
      this.x(dfd.qv);
   }

   private void H() {
      this.c(dfd.st);
      ny.b<je, dtb> $$0 = ny.a(dsu.bm, dsu.bn);

      for (dtb $$1 : dtb.values()) {
         $$0.a(je.b, $$1, this.a(je.b, $$1));
      }

      for (dtb $$2 : dtb.values()) {
         $$0.a(je.a, $$2, this.a(je.a, $$2));
      }

      this.b.accept(nx.a(dfd.st).a($$0));
   }

   private oa a(je $$0, dtb $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oi $$3 = oi.c(oi.a(dfd.st, $$2));
      return oa.a().a(ob.c, oh.an.a(dfd.st, $$2, $$3, this.c));
   }

   private void y(dfb $$0) {
      oi $$1 = new oi().a(oj.e, oi.G(dfd.dV)).a(oj.f, oi.G($$0)).a(oj.i, oi.a($$0, "_side"));
      this.b.accept(c($$0, oh.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alf $$0 = oi.a(dfd.gZ, "_side");
      oi $$1 = new oi().a(oj.f, oi.a(dfd.gZ, "_top")).a(oj.i, $$0);
      oi $$2 = new oi().a(oj.f, oi.a(dfd.gZ, "_inverted_top")).a(oj.i, $$0);
      this.b
         .accept(
            nx.a(dfd.gZ)
               .a(ny.a(dsu.p).a(false, oa.a().a(ob.c, oh.aF.a(dfd.gZ, $$1, this.c))).a(true, oa.a().a(ob.c, oh.aF.a(of.a(dfd.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dfb $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()));
   }

   private void J() {
      dfb $$0 = dfd.ss;
      alf $$1 = of.a($$0, "_on");
      alf $$2 = of.a($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()).a(a(dsu.w, $$1, $$2)));
   }

   private void K() {
      oi $$0 = new oi().a(oj.B, oi.G(dfd.j)).a(oj.f, oi.G(dfd.cC));
      oi $$1 = new oi().a(oj.B, oi.G(dfd.j)).a(oj.f, oi.a(dfd.cC, "_moist"));
      alf $$2 = oh.aW.a(dfd.cC, $$0, this.c);
      alf $$3 = oh.aW.a(oi.a(dfd.cC, "_moist"), $$1, this.c);
      this.b.accept(nx.a(dfd.cC).a(a(dsu.aQ, 7, $$3, $$2)));
   }

   private List<alf> A(dfb $$0) {
      alf $$1 = oh.aX.a(of.a($$0, "_floor0"), oi.v($$0), this.c);
      alf $$2 = oh.aX.a(of.a($$0, "_floor1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alf> B(dfb $$0) {
      alf $$1 = oh.aY.a(of.a($$0, "_side0"), oi.v($$0), this.c);
      alf $$2 = oh.aY.a(of.a($$0, "_side1"), oi.w($$0), this.c);
      alf $$3 = oh.aZ.a(of.a($$0, "_side_alt0"), oi.v($$0), this.c);
      alf $$4 = oh.aZ.a(of.a($$0, "_side_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alf> C(dfb $$0) {
      alf $$1 = oh.ba.a(of.a($$0, "_up0"), oi.v($$0), this.c);
      alf $$2 = oh.ba.a(of.a($$0, "_up1"), oi.w($$0), this.c);
      alf $$3 = oh.bb.a(of.a($$0, "_up_alt0"), oi.v($$0), this.c);
      alf $$4 = oh.bb.a(of.a($$0, "_up_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<oa> a(List<alf> $$0, UnaryOperator<oa> $$1) {
      return $$0.stream().map($$0x -> oa.a().a(ob.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nv $$0 = nv.a().a(dsu.L, false).a(dsu.M, false).a(dsu.N, false).a(dsu.O, false).a(dsu.J, false);
      List<alf> $$1 = this.A(dfd.cr);
      List<alf> $$2 = this.B(dfd.cr);
      List<alf> $$3 = this.C(dfd.cr);
      this.b
         .accept(
            nw.a(dfd.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dsu.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dsu.M, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(nv.b(nv.a().a(dsu.N, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(nv.b(nv.a().a(dsu.O, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.d)))
               .a(nv.a().a(dsu.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alf> $$0 = this.A(dfd.cs);
      List<alf> $$1 = this.B(dfd.cs);
      this.b
         .accept(
            nw.a(dfd.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.d)))
         );
   }

   private void D(dfb $$0) {
      alf $$1 = ok.t.create($$0, this.c);
      alf $$2 = ok.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nx.a($$0).a(a(dsu.j, $$2, $$1)));
   }

   private void N() {
      oi $$0 = oi.a(oi.a(dfd.ad, "_side"), oi.a(dfd.ad, "_top"));
      alf $$1 = oh.j.a(dfd.ad, $$0, this.c);
      this.b.accept(d(dfd.ad, $$1));
   }

   private void O() {
      this.a(cuu.ad);
      dfb $$0 = dfd.E;
      ny.b<Boolean, Integer> $$1 = ny.a(djw.d, djw.b);
      alf $$2 = of.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alf $$4 = of.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oa.a().a(ob.c, $$4));
         $$1.a(false, $$3, oa.a().a(ob.c, $$2));
      }

      this.b.accept(nx.a(dfd.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nx.a(dfd.kI)
               .a(
                  ny.a(dsu.as)
                     .a(0, oa.a().a(ob.c, this.a(dfd.kI, "_0", oh.c, oi::b)))
                     .a(1, oa.a().a(ob.c, this.a(dfd.kI, "_1", oh.c, oi::b)))
                     .a(2, oa.a().a(ob.c, this.a(dfd.kI, "_2", oh.c, oi::b)))
                     .a(3, oa.a().a(ob.c, this.a(dfd.kI, "_3", oh.c, oi::b)))
               )
         );
   }

   private void Q() {
      alf $$0 = oi.G(dfd.j);
      oi $$1 = new oi().a(oj.e, $$0).b(oj.e, oj.c).a(oj.f, oi.a(dfd.i, "_top")).a(oj.i, oi.a(dfd.i, "_snow"));
      oa $$2 = oa.a().a(ob.c, oh.n.a(dfd.i, "_snow", $$1, this.c));
      this.a(dfd.i, of.a(dfd.i), $$2);
      alf $$3 = ok.f.get(dfd.fl).a($$1x -> $$1x.a(oj.e, $$0)).a(dfd.fl, this.c);
      this.a(dfd.fl, $$3, $$2);
      alf $$4 = ok.f.get(dfd.l).a($$1x -> $$1x.a(oj.e, $$0)).a(dfd.l, this.c);
      this.a(dfd.l, $$4, $$2);
   }

   private void a(dfb $$0, alf $$1, oa $$2) {
      List<oa> $$3 = Arrays.asList(a($$1));
      this.b.accept(nx.a($$0).a(ny.a(dsu.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cuu.rh);
      this.b
         .accept(
            nx.a(dfd.fC)
               .a(
                  ny.a(dsu.ar)
                     .a(0, oa.a().a(ob.c, of.a(dfd.fC, "_stage0")))
                     .a(1, oa.a().a(ob.c, of.a(dfd.fC, "_stage1")))
                     .a(2, oa.a().a(ob.c, of.a(dfd.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dfd.kE, of.a(dfd.kE)));
   }

   private void j(dfb $$0, dfb $$1) {
      oi $$2 = oi.b($$1);
      alf $$3 = oh.Y.a($$0, $$2, this.c);
      alf $$4 = oh.Z.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dsu.aT, 1, $$4, $$3)));
   }

   private void T() {
      alf $$0 = of.a(dfd.hc);
      alf $$1 = of.a(dfd.hc, "_side");
      this.a(cuu.lR);
      this.b
         .accept(
            nx.a(dfd.hc)
               .a(
                  ny.a(dsu.Q)
                     .a(je.a, oa.a().a(ob.c, $$0))
                     .a(je.c, oa.a().a(ob.c, $$1))
                     .a(je.f, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.d, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.e, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               )
         );
   }

   private void k(dfb $$0, dfb $$1) {
      alf $$2 = of.a($$0);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alf $$0 = of.a(dfd.eW, "_post_ends");
      alf $$1 = of.a(dfd.eW, "_post");
      alf $$2 = of.a(dfd.eW, "_cap");
      alf $$3 = of.a(dfd.eW, "_cap_alt");
      alf $$4 = of.a(dfd.eW, "_side");
      alf $$5 = of.a(dfd.eW, "_side_alt");
      this.b
         .accept(
            nw.a(dfd.eW)
               .a(oa.a().a(ob.c, $$0))
               .a(nv.a().a(dsu.L, false).a(dsu.M, false).a(dsu.N, false).a(dsu.O, false), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsu.L, true).a(dsu.M, false).a(dsu.N, false).a(dsu.O, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsu.L, false).a(dsu.M, true).a(dsu.N, false).a(dsu.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.L, false).a(dsu.M, false).a(dsu.N, true).a(dsu.O, false), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsu.L, false).a(dsu.M, false).a(dsu.N, false).a(dsu.O, true), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsu.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsu.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dsu.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         );
      this.d(dfd.eW);
   }

   private void E(dfb $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(b()));
   }

   private void V() {
      alf $$0 = of.a(dfd.dw);
      alf $$1 = of.a(dfd.dw, "_on");
      this.d(dfd.dw);
      this.b
         .accept(
            nx.a(dfd.dw)
               .a(a(dsu.w, $$0, $$1))
               .a(
                  ny.a(dsu.U, dsu.R)
                     .a(dsp.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsp.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
                     .a(dsp.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsp.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsp.a, je.c, oa.a())
                     .a(dsp.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsp.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsp.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsp.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsp.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsp.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsp.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
               )
         );
   }

   private void W() {
      this.d(dfd.fm);
      this.b.accept(b(dfd.fm, of.a(dfd.fm)));
   }

   private void X() {
      this.d(dfd.tn);
      this.b.accept(c(dfd.tn, of.a(dfd.tn)));
   }

   private void Y() {
      this.b.accept(nx.a(dfd.ed).a(ny.a(dsu.H).a(je.a.a, oa.a().a(ob.c, of.a(dfd.ed, "_ns"))).a(je.a.c, oa.a().a(ob.c, of.a(dfd.ed, "_ew")))));
   }

   private void Z() {
      alf $$0 = ok.a.create(dfd.dV, this.c);
      this.b
         .accept(
            nx.a(
               dfd.dV,
               oa.a().a(ob.c, $$0),
               oa.a().a(ob.c, $$0).a(ob.a, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.a, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.a, ob.a.d),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.a, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.a, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.a, ob.a.d),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.a, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.a, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.a, ob.a.d),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.d),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.a, ob.a.b),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.a, ob.a.c),
               oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.a, ob.a.d)
            )
         );
   }

   private void aa() {
      alf $$0 = of.a(dfd.kO);
      alf $$1 = of.a(dfd.kO, "_on");
      this.b.accept(nx.a(dfd.kO).a(a(dsu.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oi $$0 = new oi().a(oj.e, oi.a(dfd.by, "_bottom")).a(oj.i, oi.a(dfd.by, "_side"));
      alf $$1 = oi.a(dfd.by, "_top_sticky");
      alf $$2 = oi.a(dfd.by, "_top");
      oi $$3 = $$0.c(oj.E, $$1);
      oi $$4 = $$0.c(oj.E, $$2);
      alf $$5 = of.a(dfd.by, "_base");
      this.a(dfd.by, $$5, $$4);
      this.a(dfd.br, $$5, $$3);
      alf $$6 = oh.n.a(dfd.by, "_inventory", $$0.c(oj.f, $$2), this.c);
      alf $$7 = oh.n.a(dfd.br, "_inventory", $$0.c(oj.f, $$1), this.c);
      this.a(dfd.by, $$6);
      this.a(dfd.br, $$7);
   }

   private void a(dfb $$0, alf $$1, oi $$2) {
      alf $$3 = oh.bh.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dsu.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oi $$0 = new oi().a(oj.F, oi.a(dfd.by, "_top")).a(oj.i, oi.a(dfd.by, "_side"));
      oi $$1 = $$0.c(oj.E, oi.a(dfd.by, "_top_sticky"));
      oi $$2 = $$0.c(oj.E, oi.a(dfd.by, "_top"));
      this.b
         .accept(
            nx.a(dfd.bz)
               .a(
                  ny.a(dsu.x, dsu.bg)
                     .a(false, dtg.a, oa.a().a(ob.c, oh.bi.a(dfd.by, "_head", $$2, this.c)))
                     .a(false, dtg.b, oa.a().a(ob.c, oh.bi.a(dfd.by, "_head_sticky", $$1, this.c)))
                     .a(true, dtg.a, oa.a().a(ob.c, oh.bj.a(dfd.by, "_head_short", $$2, this.c)))
                     .a(true, dtg.b, oa.a().a(ob.c, oh.bj.a(dfd.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dfb $$0 = dfd.tr;
      oi $$1 = oi.a($$0, "_side_inactive", "_top_inactive");
      oi $$2 = oi.a($$0, "_side_active", "_top_active");
      oi $$3 = oi.a($$0, "_side_active", "_top_ejecting_reward");
      oi $$4 = oi.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      oi $$5 = oi.a($$0, "_side_active_ominous", "_top_active_ominous");
      oi $$6 = oi.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alf $$7 = oh.o.a($$0, $$1, this.c);
      alf $$8 = oh.o.a($$0, "_active", $$2, this.c);
      alf $$9 = oh.o.a($$0, "_ejecting_reward", $$3, this.c);
      alf $$10 = oh.o.a($$0, "_inactive_ominous", $$4, this.c);
      alf $$11 = oh.o.a($$0, "_active_ominous", $$5, this.c);
      alf $$12 = oh.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nx.a($$0).a(ny.a(dsu.by, dsu.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oa.a().a(ob.c, $$7x ? $$10 : $$7);
            case b, c, d -> oa.a().a(ob.c, $$7x ? $$11 : $$8);
            case e -> oa.a().a(ob.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dfb $$0 = dfd.ts;
      oi $$1 = oi.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      oi $$2 = oi.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      oi $$3 = oi.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      oi $$4 = oi.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alf $$5 = oh.bN.a($$0, $$1, this.c);
      alf $$6 = oh.bN.a($$0, "_active", $$2, this.c);
      alf $$7 = oh.bN.a($$0, "_unlocking", $$3, this.c);
      alf $$8 = oh.bN.a($$0, "_ejecting_reward", $$4, this.c);
      oi $$9 = oi.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      oi $$10 = oi.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$11 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$12 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alf $$13 = oh.bN.a($$0, "_ominous", $$9, this.c);
      alf $$14 = oh.bN.a($$0, "_active_ominous", $$10, this.c);
      alf $$15 = oh.bN.a($$0, "_unlocking_ominous", $$11, this.c);
      alf $$16 = oh.bN.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nx.a($$0).a(b()).a(ny.a(dnw.b, dnw.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oa.a().a(ob.c, $$9x ? $$13 : $$5);
            case b -> oa.a().a(ob.c, $$9x ? $$14 : $$6);
            case c -> oa.a().a(ob.c, $$9x ? $$15 : $$7);
            case d -> oa.a().a(ob.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alf $$0 = of.a(dfd.qQ, "_inactive");
      alf $$1 = of.a(dfd.qQ, "_active");
      this.a(dfd.qQ, $$0);
      this.b.accept(nx.a(dfd.qQ).a(ny.a(dsu.bo).a($$2 -> oa.a().a(ob.c, $$2 != dtl.b && $$2 != dtl.c ? $$0 : $$1))));
   }

   private void ag() {
      alf $$0 = of.a(dfd.qR, "_inactive");
      alf $$1 = of.a(dfd.qR, "_active");
      this.a(dfd.qR, $$0);
      this.b.accept(nx.a(dfd.qR).a(ny.a(dsu.bo).a($$2 -> oa.a().a(ob.c, $$2 != dtl.b && $$2 != dtl.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alf $$0 = oh.bM.a(dfd.qV, oi.a(false), this.c);
      alf $$1 = oh.bM.a(dfd.qV, "_can_summon", oi.a(true), this.c);
      this.a(dfd.qV, $$0);
      this.b.accept(nx.a(dfd.qV).a(a(dsu.G, $$1, $$0)));
   }

   private void ai() {
      alf $$0 = of.a(dfd.nS, "_stable");
      alf $$1 = of.a(dfd.nS, "_unstable");
      this.a(dfd.nS, $$0);
      this.b.accept(nx.a(dfd.nS).a(a(dsu.b, $$1, $$0)));
   }

   private void aj() {
      alf $$0 = this.a(dfd.sv, "", oh.ao, oi::c);
      alf $$1 = this.a(dfd.sv, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dfd.sv).a(a(dsu.D, $$1, $$0)));
      alf $$2 = this.a(dfd.sw, "", oh.ao, oi::c);
      alf $$3 = this.a(dfd.sw, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dfd.sw).a(a(dsu.D, $$3, $$2)));
   }

   private void ak() {
      alf $$0 = ok.a.create(dfd.fB, this.c);
      alf $$1 = this.a(dfd.fB, "_on", oh.c, oi::b);
      this.b.accept(nx.a(dfd.fB).a(a(dsu.r, $$1, $$0)));
   }

   private void l(dfb $$0, dfb $$1) {
      oi $$2 = oi.y($$0);
      this.b.accept(c($$0, oh.bf.a($$0, $$2, this.c)));
      this.b.accept(nx.a($$1, oa.a().a(ob.c, oh.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oi $$0 = oi.y(dfd.dK);
      oi $$1 = oi.i(oi.a(dfd.dK, "_off"));
      alf $$2 = oh.bf.a(dfd.dK, $$0, this.c);
      alf $$3 = oh.bf.a(dfd.dK, "_off", $$1, this.c);
      this.b.accept(nx.a(dfd.dK).a(a(dsu.r, $$2, $$3)));
      alf $$4 = oh.bg.a(dfd.dL, $$0, this.c);
      alf $$5 = oh.bg.a(dfd.dL, "_off", $$1, this.c);
      this.b.accept(nx.a(dfd.dL).a(a(dsu.r, $$4, $$5)).a(d()));
      this.d(dfd.dK);
      this.c(dfd.dL);
   }

   private void am() {
      this.a(cuu.lK);
      this.b.accept(nx.a(dfd.eh).a(ny.a(dsu.aA, dsu.s, dsu.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oa.a().a(ob.c, oi.a(dfd.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cuu.cT);
      this.b
         .accept(
            nx.a(dfd.mV)
               .a(
                  ny.a(dsu.aS, dsu.C)
                     .a(1, false, Arrays.asList(a(of.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(of.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(of.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(of.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(of.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(of.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(of.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(of.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      oi $$0 = oi.a(dfd.dN);
      alf $$1 = oh.c.a(dfd.dP, $$0, this.c);
      this.b.accept(nx.a(dfd.dN).a(ny.a(dsu.aF).a($$1x -> oa.a().a(ob.c, $$1x < 8 ? of.a(dfd.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dfd.dN, of.a(dfd.dN, "_height2"));
      this.b.accept(c(dfd.dP, $$1));
   }

   private void ap() {
      this.b.accept(nx.a(dfd.oc, oa.a().a(ob.c, of.a(dfd.oc))).a(b()));
   }

   private void aq() {
      alf $$0 = ok.a.create(dfd.pa, this.c);
      this.a(dfd.pa, $$0);
      this.b.accept(nx.a(dfd.pa).a(ny.a(dsu.bj).a($$0x -> oa.a().a(ob.c, this.a(dfd.pa, "_" + $$0x.c(), oh.c, oi::b)))));
   }

   private void ar() {
      this.a(cuu.wr);
      this.b.accept(nx.a(dfd.oi).a(ny.a(dsu.as).a($$0 -> oa.a().a(ob.c, this.a(dfd.oi, "_stage" + $$0, oh.ao, oi::c)))));
   }

   private void as() {
      this.a(cuu.ps);
      this.b
         .accept(
            nx.a(dfd.fI)
               .a(
                  ny.a(dsu.a, dsu.M, dsu.L, dsu.N, dsu.O)
                     .a(false, false, false, false, false, oa.a().a(ob.c, of.a(dfd.fI, "_ns")))
                     .a(false, true, false, false, false, oa.a().a(ob.c, of.a(dfd.fI, "_n")).a(ob.b, ob.a.b))
                     .a(false, false, true, false, false, oa.a().a(ob.c, of.a(dfd.fI, "_n")))
                     .a(false, false, false, true, false, oa.a().a(ob.c, of.a(dfd.fI, "_n")).a(ob.b, ob.a.c))
                     .a(false, false, false, false, true, oa.a().a(ob.c, of.a(dfd.fI, "_n")).a(ob.b, ob.a.d))
                     .a(false, true, true, false, false, oa.a().a(ob.c, of.a(dfd.fI, "_ne")))
                     .a(false, true, false, true, false, oa.a().a(ob.c, of.a(dfd.fI, "_ne")).a(ob.b, ob.a.b))
                     .a(false, false, false, true, true, oa.a().a(ob.c, of.a(dfd.fI, "_ne")).a(ob.b, ob.a.c))
                     .a(false, false, true, false, true, oa.a().a(ob.c, of.a(dfd.fI, "_ne")).a(ob.b, ob.a.d))
                     .a(false, false, true, true, false, oa.a().a(ob.c, of.a(dfd.fI, "_ns")))
                     .a(false, true, false, false, true, oa.a().a(ob.c, of.a(dfd.fI, "_ns")).a(ob.b, ob.a.b))
                     .a(false, true, true, true, false, oa.a().a(ob.c, of.a(dfd.fI, "_nse")))
                     .a(false, true, false, true, true, oa.a().a(ob.c, of.a(dfd.fI, "_nse")).a(ob.b, ob.a.b))
                     .a(false, false, true, true, true, oa.a().a(ob.c, of.a(dfd.fI, "_nse")).a(ob.b, ob.a.c))
                     .a(false, true, true, false, true, oa.a().a(ob.c, of.a(dfd.fI, "_nse")).a(ob.b, ob.a.d))
                     .a(false, true, true, true, true, oa.a().a(ob.c, of.a(dfd.fI, "_nsew")))
                     .a(true, false, false, false, false, oa.a().a(ob.c, of.a(dfd.fI, "_attached_ns")))
                     .a(true, false, true, false, false, oa.a().a(ob.c, of.a(dfd.fI, "_attached_n")))
                     .a(true, false, false, true, false, oa.a().a(ob.c, of.a(dfd.fI, "_attached_n")).a(ob.b, ob.a.c))
                     .a(true, true, false, false, false, oa.a().a(ob.c, of.a(dfd.fI, "_attached_n")).a(ob.b, ob.a.b))
                     .a(true, false, false, false, true, oa.a().a(ob.c, of.a(dfd.fI, "_attached_n")).a(ob.b, ob.a.d))
                     .a(true, true, true, false, false, oa.a().a(ob.c, of.a(dfd.fI, "_attached_ne")))
                     .a(true, true, false, true, false, oa.a().a(ob.c, of.a(dfd.fI, "_attached_ne")).a(ob.b, ob.a.b))
                     .a(true, false, false, true, true, oa.a().a(ob.c, of.a(dfd.fI, "_attached_ne")).a(ob.b, ob.a.c))
                     .a(true, false, true, false, true, oa.a().a(ob.c, of.a(dfd.fI, "_attached_ne")).a(ob.b, ob.a.d))
                     .a(true, false, true, true, false, oa.a().a(ob.c, of.a(dfd.fI, "_attached_ns")))
                     .a(true, true, false, false, true, oa.a().a(ob.c, of.a(dfd.fI, "_attached_ns")).a(ob.b, ob.a.b))
                     .a(true, true, true, true, false, oa.a().a(ob.c, of.a(dfd.fI, "_attached_nse")))
                     .a(true, true, false, true, true, oa.a().a(ob.c, of.a(dfd.fI, "_attached_nse")).a(ob.b, ob.a.b))
                     .a(true, false, true, true, true, oa.a().a(ob.c, of.a(dfd.fI, "_attached_nse")).a(ob.b, ob.a.c))
                     .a(true, true, true, false, true, oa.a().a(ob.c, of.a(dfd.fI, "_attached_nse")).a(ob.b, ob.a.d))
                     .a(true, true, true, true, true, oa.a().a(ob.c, of.a(dfd.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dfd.fH);
      this.b.accept(nx.a(dfd.fH).a(ny.a(dsu.a, dsu.w).a(($$0, $$1) -> oa.a().a(ob.c, oi.a(dfd.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alf a(int $$0, String $$1, oi $$2) {
      switch ($$0) {
         case 1:
            return oh.bl.a(of.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return oh.bm.a(of.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return oh.bn.a(of.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return oh.bo.a(of.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private alf a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", oi.b(oi.G(dfd.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oi.b(oi.a(dfd.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oi.b(oi.a(dfd.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cuu.kp);
      this.b.accept(nx.a(dfd.mf).a(ny.a(dsu.aD, dsu.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cuu.kq);
      Function<Integer, alf> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oi $$2 = oi.a($$1);
         return oh.bw.a(dfd.mg, $$1, $$2, this.c);
      };
      this.b.accept(nx.a(dfd.mg).a(ny.a(dmj.c).a($$1 -> oa.a().a(ob.c, $$0.apply($$1)))));
   }

   private void F(dfb $$0) {
      this.d($$0);
      alf $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      nv.c $$3 = ac.a(nv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dsv, Function<alf, oa>> $$4 : a) {
         dsv $$5 = (dsv)$$4.getFirst();
         Function<alf, oa> $$6 = (Function<alf, oa>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(nv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      alf $$0 = oi.a(dfd.qU, "_bottom");
      oi $$1 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dfd.qU, "_top")).a(oj.i, oi.a(dfd.qU, "_side"));
      oi $$2 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dfd.qU, "_top_bloom")).a(oj.i, oi.a(dfd.qU, "_side_bloom"));
      alf $$3 = oh.n.a(dfd.qU, "", $$1, this.c);
      alf $$4 = oh.n.a(dfd.qU, "_bloom", $$2, this.c);
      this.b.accept(nx.a(dfd.qU).a(ny.a(dsu.E).a($$2x -> oa.a().a(ob.c, $$2x ? $$4 : $$3))));
      this.a(cuu.gj, $$3);
   }

   private void ax() {
      dfb $$0 = dfd.cm;
      alf $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      List.of(Pair.of(je.c, ob.a.a), Pair.of(je.f, ob.a.b), Pair.of(je.d, ob.a.c), Pair.of(je.e, ob.a.d)).forEach($$2x -> {
         je $$3 = (je)$$2x.getFirst();
         ob.a $$4 = (ob.a)$$2x.getSecond();
         nv.c $$5 = nv.a().a(dsu.R, $$3);
         $$2.a($$5, oa.a().a(ob.c, $$1).a(ob.b, $$4).a(ob.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, of.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2) {
      List.of(Pair.of(dsu.bp, oh.aM), Pair.of(dsu.bq, oh.aN), Pair.of(dsu.br, oh.aO), Pair.of(dsu.bs, oh.aP), Pair.of(dsu.bt, oh.aQ), Pair.of(dsu.bu, oh.aR))
         .forEach($$3 -> {
            dsv $$4 = (dsv)$$3.getFirst();
            og $$5 = (og)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2, dsv $$3, og $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oi $$7 = new oi().a(oj.b, oi.a(dfd.cm, $$6));
      nr.d $$8 = new nr.d($$4, $$6);
      alf $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dfd.cm, $$6, $$7, this.c));
      $$0.a(nv.a($$1, nv.a().a($$3, $$5)), oa.a().a(ob.c, $$9).a(ob.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dfd.kJ, oh.c.a(dfd.kJ, oi.b(of.a("magma")), this.c)));
   }

   private void G(dfb $$0) {
      this.b($$0, ok.q);
      oh.bD.a(of.a($$0.r()), oi.u($$0), this.c);
   }

   private void b(dfb $$0, dfb $$1, nr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dfb $$0, dfb $$1) {
      oh.bE.a(of.a($$0.r()), oi.u($$1), this.c);
   }

   private void az() {
      alf $$0 = of.a(dfd.b);
      alf $$1 = of.a(dfd.b, "_mirrored");
      this.b.accept(a(dfd.eN, $$0, $$1));
      this.a(dfd.eN, $$0);
   }

   private void aA() {
      alf $$0 = of.a(dfd.sJ);
      alf $$1 = of.a(dfd.sJ, "_mirrored");
      this.b.accept(a(dfd.td, $$0, $$1).a(f()));
      this.a(dfd.td, $$0);
   }

   private void n(dfb $$0, dfb $$1) {
      this.a($$0, nr.e.b);
      oi $$2 = oi.d(oi.a($$0, "_pot"));
      alf $$3 = nr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alf $$0 = oi.a(dfd.pl, "_bottom");
      alf $$1 = oi.a(dfd.pl, "_top_off");
      alf $$2 = oi.a(dfd.pl, "_top");
      alf[] $$3 = new alf[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oi $$5 = new oi().a(oj.e, $$0).a(oj.f, $$4 == 0 ? $$1 : $$2).a(oj.i, oi.a(dfd.pl, "_side" + $$4));
         $$3[$$4] = oh.n.a(dfd.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nx.a(dfd.pl).a(ny.a(dsu.aZ).a($$1x -> oa.a().a(ob.c, $$3[$$1x]))));
      this.a(cuu.wP, $$3[0]);
   }

   private oa a(jg $$0, oa $$1) {
      switch ($$0) {
         case b:
            return $$1.a(ob.a, ob.a.b);
         case c:
            return $$1.a(ob.a, ob.a.b).a(ob.b, ob.a.c);
         case d:
            return $$1.a(ob.a, ob.a.b).a(ob.b, ob.a.d);
         case a:
            return $$1.a(ob.a, ob.a.b).a(ob.b, ob.a.b);
         case f:
            return $$1.a(ob.a, ob.a.d).a(ob.b, ob.a.c);
         case g:
            return $$1.a(ob.a, ob.a.d);
         case h:
            return $$1.a(ob.a, ob.a.d).a(ob.b, ob.a.b);
         case e:
            return $$1.a(ob.a, ob.a.d).a(ob.b, ob.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(ob.b, ob.a.c);
         case i:
            return $$1.a(ob.b, ob.a.d);
         case j:
            return $$1.a(ob.b, ob.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      alf $$0 = oi.a(dfd.pb, "_top");
      alf $$1 = oi.a(dfd.pb, "_bottom");
      alf $$2 = oi.a(dfd.pb, "_side");
      alf $$3 = oi.a(dfd.pb, "_lock");
      oi $$4 = new oi().a(oj.o, $$2).a(oj.m, $$2).a(oj.l, $$2).a(oj.c, $$0).a(oj.j, $$0).a(oj.k, $$1).a(oj.n, $$3);
      alf $$5 = oh.b.a(dfd.pb, $$4, this.c);
      this.b.accept(nx.a(dfd.pb, oa.a().a(ob.c, $$5)).a(ny.a(dsu.T).a($$0x -> this.a($$0x, oa.a()))));
   }

   private void aD() {
      dfb $$0 = dfd.n;
      alf $$1 = of.a($$0);
      ok $$2 = ok.a.get($$0);
      dfb $$3 = dfd.jH;
      alf $$4 = oh.ab.a($$3, $$2.b(), this.c);
      alf $$5 = oh.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ls.a().filter(lt::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dfd.rf).a(ls.w).a(dfd.rf, dfd.rD).a(dfd.rj, dfd.rn).a(ls.y);
      this.h(dfd.re).a(ls.A).a(dfd.re, dfd.rC).a(dfd.ri, dfd.rm).a(ls.C);
      this.h(dfd.rd).a(ls.E).a(dfd.rd, dfd.rB).a(dfd.rh, dfd.rl).a(ls.G);
      this.h(dfd.rc).a(ls.I).a(dfd.rc, dfd.rA).a(dfd.rg, dfd.rk).a(ls.K);
      this.w(dfd.sk);
      this.w(dfd.sl);
      this.w(dfd.sm);
      this.w(dfd.sn);
      this.i(dfd.sk, dfd.so);
      this.i(dfd.sl, dfd.sp);
      this.i(dfd.sm, dfd.sq);
      this.i(dfd.sn, dfd.sr);
      this.m(dfd.a);
      this.c(dfd.nc, dfd.a);
      this.c(dfd.nb, dfd.a);
      this.m(dfd.fO);
      this.m(dfd.dQ);
      this.c(dfd.nd, dfd.G);
      this.m(dfd.fA);
      this.m(dfd.me);
      this.m(dfd.fr);
      this.m(dfd.fR);
      this.a(cuu.ue);
      this.m(dfd.pg);
      this.m(dfd.G);
      this.m(dfd.H);
      this.m(dfd.hV);
      this.a(cuu.fS);
      this.o(dfd.pM, dfd.qd);
      this.o(dfd.pN, dfd.qe);
      this.o(dfd.pO, dfd.qf);
      this.o(dfd.pP, dfd.qg);
      this.o(dfd.pQ, dfd.qh);
      this.o(dfd.pR, dfd.qi);
      this.o(dfd.pS, dfd.qj);
      this.o(dfd.pT, dfd.qk);
      this.o(dfd.pU, dfd.ql);
      this.o(dfd.pV, dfd.qm);
      this.o(dfd.pW, dfd.qn);
      this.o(dfd.pX, dfd.qo);
      this.o(dfd.pY, dfd.qp);
      this.o(dfd.pZ, dfd.qq);
      this.o(dfd.qa, dfd.qr);
      this.o(dfd.qb, dfd.qs);
      this.o(dfd.pL, dfd.qc);
      this.m(dfd.na);
      this.m(dfd.gs);
      this.m(dfd.qP);
      this.m(dfd.sx);
      this.s(dfd.sy);
      this.s(dfd.sz);
      this.t(dfd.ti);
      this.t(dfd.tj);
      this.aj();
      this.g(dfd.sC, dfd.sA);
      this.p(dfd.sB);
      this.a(dfd.hW, cuu.hB);
      this.a(cuu.hB);
      this.aE();
      this.a(dfd.kN, cuu.jb);
      this.a(cuu.jb);
      this.f(dfd.bQ, oi.a(dfd.by, "_side"));
      this.a(dfd.R);
      this.a(dfd.S);
      this.a(dfd.iB);
      this.a(dfd.cx);
      this.a(dfd.cy);
      this.a(dfd.cz);
      this.a(dfd.fE);
      this.a(dfd.fF);
      this.a(dfd.fJ);
      this.a(dfd.N);
      this.a(dfd.T);
      this.a(dfd.O);
      this.a(dfd.ch);
      this.a(dfd.P);
      this.a(dfd.Q);
      this.a(dfd.ci);
      this.b(dfd.pj, ok.d);
      this.a(dfd.pi);
      this.a(dfd.aR);
      this.a(dfd.aS);
      this.a(dfd.aT);
      this.a(dfd.hb);
      this.a(dfd.dI);
      this.a(dfd.dJ);
      this.a(dfd.ha);
      this.a(dfd.pC);
      this.a(dfd.mW);
      this.a(dfd.dR);
      this.a(dfd.k);
      this.a(dfd.pk);
      this.a(dfd.fz);
      this.a(dfd.ec);
      this.a(dfd.L);
      this.a(dfd.ph);
      this.a(dfd.dO);
      this.b(dfd.dT, ok.g);
      this.b(dfd.pq, ok.d);
      this.b(dfd.fa, ok.d);
      this.m(dfd.ac);
      this.m(dfd.ga);
      this.a(dfd.kK);
      this.a(dfd.aY);
      this.a(dfd.iC);
      this.a(dfd.co);
      this.a(dfd.pK);
      this.a(dfd.ii);
      this.a(dfd.oy);
      this.a(dfd.dW);
      this.a(dfd.dX);
      this.b(dfd.ct, ok.b);
      this.a(dfd.aO);
      this.b(dfd.bw, ok.v);
      this.a(cuu.cS);
      this.b(dfd.ck, ok.f);
      this.b(dfd.pd, ok.d);
      this.a(dfd.op);
      this.a(dfd.aP);
      this.a(dfd.qt);
      this.a(dfd.qu);
      this.a(dfd.qN);
      this.a(dfd.su);
      this.a(dfd.tf);
      this.a(dfd.tg);
      this.a(dfd.th);
      this.e(dfd.qS);
      this.m(dfd.tt);
      this.aD();
      this.a(dfd.ra);
      this.a(dfd.rb);
      this.a(dfd.qW);
      this.a(dfd.qX);
      this.a(dfd.qY);
      this.a(dfd.qZ);
      this.k(dfd.qW, dfd.rw);
      this.k(dfd.qX, dfd.ry);
      this.k(dfd.qY, dfd.rx);
      this.k(dfd.qZ, dfd.rz);
      this.i(dfd.rM);
      this.i(dfd.rN);
      this.i(dfd.rP);
      this.i(dfd.rO);
      this.a(dfd.rM, dfd.rQ);
      this.a(dfd.rN, dfd.rR);
      this.a(dfd.rP, dfd.rT);
      this.a(dfd.rO, dfd.rS);
      this.k(dfd.rU);
      this.k(dfd.rV);
      this.k(dfd.rX);
      this.k(dfd.rW);
      this.b(dfd.rU, dfd.rY);
      this.b(dfd.rV, dfd.rZ);
      this.b(dfd.rX, dfd.sb);
      this.b(dfd.rW, dfd.sa);
      this.a(dfd.sc);
      this.a(dfd.sd);
      this.a(dfd.se);
      this.a(dfd.sf);
      this.k(dfd.sc, dfd.sg);
      this.k(dfd.sd, dfd.sh);
      this.k(dfd.se, dfd.si);
      this.k(dfd.sf, dfd.sj);
      this.j(dfd.gW, dfd.ch);
      this.j(dfd.gX, dfd.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dfd.og, dfd.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dfd.kt);
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
      this.F(dfd.ff);
      this.F(dfd.fg);
      this.F(dfd.qT);
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
      this.E(dfd.cO);
      this.d(dfd.cO);
      this.E(dfd.oa);
      this.g();
      this.E(dfd.sE);
      this.l(dfd.cp, dfd.cq);
      this.l(dfd.ea, dfd.eb);
      this.a(dfd.cA, dfd.n, oi::c);
      this.a(dfd.nY, dfd.p, oi::d);
      this.y(dfd.ow);
      this.y(dfd.on);
      this.v(dfd.aU);
      this.v(dfd.hi);
      this.C();
      this.D(dfd.oe);
      this.D(dfd.of);
      this.e(dfd.eX, of.a(dfd.eX));
      this.a(dfd.dY, ok.d);
      this.a(dfd.dZ, ok.d);
      this.a(dfd.te);
      this.a(dfd.kM, ok.d);
      this.f(dfd.j);
      this.f(dfd.sH);
      this.f(dfd.I);
      this.g(dfd.J);
      this.g(dfd.M);
      this.f(dfd.K);
      this.e(dfd.F);
      this.b(dfd.to, ok.f);
      this.a(dfd.ij, ok.d, ok.e);
      this.a(dfd.kx, ok.w, ok.x);
      this.a(dfd.hf, ok.w, ok.x);
      this.a(dfd.tk, ok.d, ok.e);
      this.a(dfd.tl, ok.d, ok.e);
      this.a(dfd.tm, ok.d, ok.e);
      this.c(dfd.nT, ok.i);
      this.z();
      this.a(dfd.pe, oi::A);
      this.a(dfd.pf, oi::C);
      this.a(dfd.kD, dsu.as, 0, 1, 2, 3);
      this.a(dfd.gt, dsu.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfd.fq, dsu.as, 0, 1, 1, 2);
      this.a(dfd.gu, dsu.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfd.cB, dsu.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dfd.kA, nr.e.b, dsu.aq, 0, 1);
      this.i();
      this.h();
      this.a(of.a("decorated_pot"), dfd.iA).b(dfd.tp);
      this.a(of.a("banner"), dfd.n)
         .a(oh.bF, dfd.iJ, dfd.iK, dfd.iL, dfd.iM, dfd.iN, dfd.iO, dfd.iP, dfd.iQ, dfd.iR, dfd.iS, dfd.iT, dfd.iU, dfd.iV, dfd.iW, dfd.iX, dfd.iY)
         .b(dfd.iZ, dfd.ja, dfd.jb, dfd.jc, dfd.jd, dfd.je, dfd.jf, dfd.jg, dfd.jh, dfd.ji, dfd.jj, dfd.jk, dfd.jl, dfd.jm, dfd.jn, dfd.jo);
      this.a(of.a("bed"), dfd.n)
         .b(dfd.aZ, dfd.ba, dfd.bb, dfd.bc, dfd.bd, dfd.be, dfd.bf, dfd.bg, dfd.bh, dfd.bi, dfd.bj, dfd.bk, dfd.bl, dfd.bm, dfd.bn, dfd.bo);
      this.m(dfd.aZ, dfd.bA);
      this.m(dfd.ba, dfd.bB);
      this.m(dfd.bb, dfd.bC);
      this.m(dfd.bc, dfd.bD);
      this.m(dfd.bd, dfd.bE);
      this.m(dfd.be, dfd.bF);
      this.m(dfd.bf, dfd.bG);
      this.m(dfd.bg, dfd.bH);
      this.m(dfd.bh, dfd.bI);
      this.m(dfd.bi, dfd.bJ);
      this.m(dfd.bj, dfd.bK);
      this.m(dfd.bk, dfd.bL);
      this.m(dfd.bl, dfd.bM);
      this.m(dfd.bm, dfd.bN);
      this.m(dfd.bn, dfd.bO);
      this.m(dfd.bo, dfd.bP);
      this.a(of.a("skull"), dfd.dW)
         .a(oh.bG, dfd.gM, dfd.gK, dfd.gI, dfd.gE, dfd.gG, dfd.gQ)
         .a(dfd.gO)
         .b(dfd.gN, dfd.gP, dfd.gL, dfd.gJ, dfd.gF, dfd.gH, dfd.gR);
      this.G(dfd.kP);
      this.G(dfd.kQ);
      this.G(dfd.kR);
      this.G(dfd.kS);
      this.G(dfd.kT);
      this.G(dfd.kU);
      this.G(dfd.kV);
      this.G(dfd.kW);
      this.G(dfd.kX);
      this.G(dfd.kY);
      this.G(dfd.kZ);
      this.G(dfd.la);
      this.G(dfd.lb);
      this.G(dfd.lc);
      this.G(dfd.ld);
      this.G(dfd.le);
      this.G(dfd.lf);
      this.b(dfd.mX, ok.q);
      this.c(dfd.mX);
      this.a(of.a("chest"), dfd.n).b(dfd.cv, dfd.gV);
      this.a(of.a("ender_chest"), dfd.co).b(dfd.fG);
      this.f(dfd.fx, dfd.co).a(dfd.fx, dfd.kF);
      this.a(dfd.aM);
      this.a(dfd.aN);
      this.a(dfd.lw);
      this.a(dfd.lx);
      this.a(dfd.ly);
      this.a(dfd.lz);
      this.a(dfd.lA);
      this.a(dfd.lB);
      this.a(dfd.lC);
      this.a(dfd.lD);
      this.a(dfd.lE);
      this.a(dfd.lF);
      this.a(dfd.lG);
      this.a(dfd.lH);
      this.a(dfd.lI);
      this.a(dfd.lJ);
      this.a(dfd.lK);
      this.a(dfd.lL);
      this.a(ok.a, dfd.lM, dfd.lN, dfd.lO, dfd.lP, dfd.lQ, dfd.lR, dfd.lS, dfd.lT, dfd.lU, dfd.lV, dfd.lW, dfd.lX, dfd.lY, dfd.lZ, dfd.ma, dfd.mb);
      this.a(dfd.iA);
      this.a(dfd.hj);
      this.a(dfd.hk);
      this.a(dfd.hl);
      this.a(dfd.hm);
      this.a(dfd.hn);
      this.a(dfd.ho);
      this.a(dfd.hp);
      this.a(dfd.hq);
      this.a(dfd.hr);
      this.a(dfd.hs);
      this.a(dfd.ht);
      this.a(dfd.hu);
      this.a(dfd.hv);
      this.a(dfd.hw);
      this.a(dfd.hx);
      this.a(dfd.hy);
      this.a(dfd.qO);
      this.h(dfd.aQ, dfd.eY);
      this.h(dfd.ei, dfd.hz);
      this.h(dfd.ej, dfd.hA);
      this.h(dfd.ek, dfd.hB);
      this.h(dfd.el, dfd.hC);
      this.h(dfd.em, dfd.hD);
      this.h(dfd.en, dfd.hE);
      this.h(dfd.eo, dfd.hF);
      this.h(dfd.ep, dfd.hG);
      this.h(dfd.eq, dfd.hH);
      this.h(dfd.er, dfd.hI);
      this.h(dfd.es, dfd.hJ);
      this.h(dfd.et, dfd.hK);
      this.h(dfd.eu, dfd.hL);
      this.h(dfd.ev, dfd.hM);
      this.h(dfd.ew, dfd.hN);
      this.h(dfd.ex, dfd.hO);
      this.b(ok.o, dfd.lg, dfd.lh, dfd.li, dfd.lj, dfd.lk, dfd.ll, dfd.lm, dfd.ln, dfd.lo, dfd.lp, dfd.lq, dfd.lr, dfd.ls, dfd.lt, dfd.lu, dfd.lv);
      this.g(dfd.bA, dfd.ik);
      this.g(dfd.bB, dfd.il);
      this.g(dfd.bC, dfd.im);
      this.g(dfd.bD, dfd.in);
      this.g(dfd.bE, dfd.io);
      this.g(dfd.bF, dfd.ip);
      this.g(dfd.bG, dfd.iq);
      this.g(dfd.bH, dfd.ir);
      this.g(dfd.bI, dfd.is);
      this.g(dfd.bJ, dfd.it);
      this.g(dfd.bK, dfd.iu);
      this.g(dfd.bL, dfd.iv);
      this.g(dfd.bM, dfd.iw);
      this.g(dfd.bN, dfd.ix);
      this.g(dfd.bO, dfd.iy);
      this.g(dfd.bP, dfd.iz);
      this.a(dfd.sI);
      this.a(dfd.eL);
      this.a(dfd.bu, dfd.gb, nr.e.a);
      this.a(dfd.bR, dfd.gc, nr.e.b);
      this.a(dfd.bT, dfd.gd, nr.e.b);
      this.a(dfd.bU, dfd.ge, nr.e.b);
      this.a(dfd.bV, dfd.gf, nr.e.b);
      this.a(dfd.bW, dfd.gg, nr.e.b);
      this.a(dfd.bX, dfd.gh, nr.e.b);
      this.a(dfd.bY, dfd.gi, nr.e.b);
      this.a(dfd.bZ, dfd.gj, nr.e.b);
      this.a(dfd.ca, dfd.gk, nr.e.b);
      this.a(dfd.cb, dfd.gl, nr.e.b);
      this.a(dfd.cc, dfd.gm, nr.e.b);
      this.a(dfd.ce, dfd.gn, nr.e.b);
      this.a(dfd.cd, dfd.go, nr.e.b);
      this.a(dfd.cg, dfd.gp, nr.e.b);
      this.a(dfd.cf, dfd.gq, nr.e.b);
      this.a(dfd.bv, dfd.gr, nr.e.b);
      this.a(dfd.bS, dfd.fS, nr.e.b);
      this.H();
      this.u(dfd.eT);
      this.u(dfd.eU);
      this.u(dfd.eV);
      this.a(dfd.bt, nr.e.a);
      this.b(dfd.dS, nr.e.a);
      this.a(cuu.dJ);
      this.b(dfd.mc, dfd.md, nr.e.b);
      this.a(cuu.dK);
      this.c(dfd.md);
      this.b(dfd.sG, nr.e.b);
      this.c(dfd.sG);
      this.c(dfd.sw);
      this.b(dfd.oz, dfd.oA, nr.e.b);
      this.b(dfd.oB, dfd.oC, nr.e.b);
      this.a(dfd.oz, "_plant");
      this.c(dfd.oA);
      this.a(dfd.oB, "_plant");
      this.c(dfd.oC);
      this.a(dfd.mY, nr.e.a, oi.c(oi.a(dfd.mZ, "_stage0")));
      this.m();
      this.a(dfd.bs, nr.e.b);
      this.c(dfd.iE, nr.e.b);
      this.c(dfd.iF, nr.e.b);
      this.c(dfd.iG, nr.e.b);
      this.c(dfd.iH, nr.e.a);
      this.c(dfd.iI, nr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dfd.mw, dfd.mr, dfd.mm, dfd.mh, dfd.mG, dfd.mB, dfd.mQ, dfd.mL);
      this.a(dfd.mx, dfd.ms, dfd.mn, dfd.mi, dfd.mH, dfd.mC, dfd.mR, dfd.mM);
      this.a(dfd.my, dfd.mt, dfd.mo, dfd.mj, dfd.mI, dfd.mD, dfd.mS, dfd.mN);
      this.a(dfd.mz, dfd.mu, dfd.mp, dfd.mk, dfd.mJ, dfd.mE, dfd.mT, dfd.mO);
      this.a(dfd.mA, dfd.mv, dfd.mq, dfd.ml, dfd.mK, dfd.mF, dfd.mU, dfd.mP);
      this.e(dfd.fe, dfd.fc);
      this.e(dfd.fd, dfd.fb);
      this.l(dfd.ab).c(dfd.ab).a(dfd.av);
      this.l(dfd.am).c(dfd.am).a(dfd.aD);
      this.a(dfd.am, dfd.dj, dfd.ds);
      this.b(dfd.aL, ok.s);
      this.l(dfd.Y).c(dfd.Y).a(dfd.as);
      this.l(dfd.ai).c(dfd.ai).a(dfd.aA);
      this.a(dfd.ai, dfd.dd, dfd.do);
      this.a(dfd.B, dfd.fX, nr.e.b);
      this.b(dfd.aI, ok.s);
      this.l(dfd.Z).d(dfd.Z).a(dfd.at);
      this.l(dfd.aj).d(dfd.aj).a(dfd.aB);
      this.a(dfd.aj, dfd.de, dfd.dp);
      this.a(dfd.C, dfd.fY, nr.e.b);
      this.b(dfd.aJ, ok.s);
      this.l(dfd.W).c(dfd.W).a(dfd.aq);
      this.l(dfd.ag).c(dfd.ag).a(dfd.ay);
      this.a(dfd.ag, dfd.dc, dfd.dn);
      this.a(dfd.z, dfd.fV, nr.e.b);
      this.b(dfd.aG, ok.s);
      this.l(dfd.U).c(dfd.U).a(dfd.ao);
      this.l(dfd.al).c(dfd.al).a(dfd.aw);
      this.a(dfd.al, dfd.da, dfd.dl);
      this.a(dfd.x, dfd.fT, nr.e.b);
      this.b(dfd.aE, ok.s);
      this.l(dfd.V).c(dfd.V).a(dfd.ap);
      this.l(dfd.af).c(dfd.af).a(dfd.ax);
      this.a(dfd.af, dfd.db, dfd.dm);
      this.a(dfd.y, dfd.fU, nr.e.b);
      this.b(dfd.aF, ok.s);
      this.l(dfd.aa).c(dfd.aa).a(dfd.au);
      this.l(dfd.ak).c(dfd.ak).a(dfd.aC);
      this.a(dfd.ak, dfd.dg, dfd.dr);
      this.a(dfd.D, dfd.fZ, nr.e.b);
      this.b(dfd.aK, ok.s);
      this.l(dfd.X).c(dfd.X).a(dfd.ar);
      this.l(dfd.ah).c(dfd.ah).a(dfd.az);
      this.a(dfd.ah, dfd.df, dfd.dq);
      this.a(dfd.A, dfd.fW, nr.e.b);
      this.b(dfd.aH, ok.s);
      this.l(dfd.os).b(dfd.os).a(dfd.ou);
      this.l(dfd.ot).b(dfd.ot).a(dfd.ov);
      this.a(dfd.ot, dfd.dh, dfd.dt);
      this.a(dfd.ox, dfd.pm, nr.e.b);
      this.n(dfd.oD, dfd.po);
      this.l(dfd.oj).b(dfd.oj).a(dfd.ol);
      this.l(dfd.ok).b(dfd.ok).a(dfd.om);
      this.a(dfd.ok, dfd.di, dfd.du);
      this.a(dfd.oo, dfd.pn, nr.e.b);
      this.n(dfd.oq, dfd.pp);
      this.l(dfd.ae).d(dfd.ae);
      this.l(dfd.an).d(dfd.an);
      this.a(dfd.v, dfd.dk, dfd.dv);
      this.b(dfd.or, nr.e.b);
      this.a(cuu.dG);
      this.i(dfd.dy);
      this.k(dfd.hY);
      this.u();
      this.n(dfd.cP);
      this.o(dfd.bp);
      this.o(dfd.bq);
      this.o(dfd.hh);
      this.t();
      this.q(dfd.fN);
      this.q(dfd.kG);
      this.q(dfd.kH);
      this.r(dfd.gS);
      this.r(dfd.gT);
      this.r(dfd.gU);
      this.o();
      this.p();
      this.d(dfd.cD, ok.h);
      this.d(dfd.nW, ok.h);
      this.d(dfd.nV, ok.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dfd.eK, dfd.eS);
      this.k(dfd.m, dfd.eO);
      this.k(dfd.eJ, dfd.eR);
      this.k(dfd.eI, dfd.eQ);
      this.az();
      this.k(dfd.eH, dfd.eP);
      this.aA();
      cvy.h().forEach($$0 -> this.a($$0, of.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dfd.hX);
      ny.a<Integer> $$0 = ny.a(dsu.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alf $$3 = oi.a(cuu.hC, $$2);
         $$0.a($$1, oa.a().a(ob.c, oh.aa.a(dfd.hX, $$2, oi.h($$3), this.c)));
         oh.bx.a(of.a(cuu.hC, $$2), oi.k($$3), this.c);
      }

      this.b.accept(nx.a(dfd.hX).a($$0));
   }

   private void o(dfb $$0, dfb $$1) {
      this.a($$0.r());
      oi $$2 = oi.b(oi.G($$0));
      oi $$3 = oi.b(oi.a($$0, "_lit"));
      alf $$4 = oh.bH.a($$0, "_one_candle", $$2, this.c);
      alf $$5 = oh.bI.a($$0, "_two_candles", $$2, this.c);
      alf $$6 = oh.bJ.a($$0, "_three_candles", $$2, this.c);
      alf $$7 = oh.bK.a($$0, "_four_candles", $$2, this.c);
      alf $$8 = oh.bH.a($$0, "_one_candle_lit", $$3, this.c);
      alf $$9 = oh.bI.a($$0, "_two_candles_lit", $$3, this.c);
      alf $$10 = oh.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      alf $$11 = oh.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsu.az, dsu.r)
                     .a(1, false, oa.a().a(ob.c, $$4))
                     .a(2, false, oa.a().a(ob.c, $$5))
                     .a(3, false, oa.a().a(ob.c, $$6))
                     .a(4, false, oa.a().a(ob.c, $$7))
                     .a(1, true, oa.a().a(ob.c, $$8))
                     .a(2, true, oa.a().a(ob.c, $$9))
                     .a(3, true, oa.a().a(ob.c, $$10))
                     .a(4, true, oa.a().a(ob.c, $$11))
               )
         );
      alf $$12 = oh.bL.a($$1, oi.a($$0, false), this.c);
      alf $$13 = oh.bL.a($$1, "_lit", oi.a($$0, true), this.c);
      this.b.accept(nx.a($$1).a(a(dsu.r, $$13, $$12)));
   }

   class a {
      private final alf b;

      public a(final alf $$0, final dfb $$1) {
         this.b = oh.aa.a($$0, oi.u($$1), nr.this.c);
      }

      public nr.a a(dfb... $$0) {
         for (dfb $$1 : $$0) {
            nr.this.b.accept(nr.c($$1, this.b));
         }

         return this;
      }

      public nr.a b(dfb... $$0) {
         for (dfb $$1 : $$0) {
            nr.this.c($$1);
         }

         return this.a($$0);
      }

      public nr.a a(og $$0, dfb... $$1) {
         for (dfb $$2 : $$1) {
            $$0.a(of.a($$2.r()), oi.u($$2), nr.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final oi b;
      private final Map<og, alf> c = Maps.newHashMap();
      @Nullable
      private lt d;
      @Nullable
      private alf e;
      private final Set<dfb> f = new HashSet<>();

      public b(final oi $$0) {
         this.b = $$0;
      }

      public nr.b a(dfb $$0, og $$1) {
         this.e = $$1.a($$0, this.b, nr.this.c);
         if (nr.this.f.containsKey($$0)) {
            nr.this.b.accept(nr.this.f.get($$0).create($$0, this.e, this.b, nr.this.c));
         } else {
            nr.this.b.accept(nr.c($$0, this.e));
         }

         return this;
      }

      public nr.b a(dfb $$0, dfb $$1) {
         alf $$2 = of.a($$0);
         nr.this.b.accept(nr.c($$1, $$2));
         nr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nr.b a(dfb $$0) {
         alf $$1 = oh.s.a($$0, this.b, nr.this.c);
         alf $$2 = oh.t.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.b($$0, $$1, $$2));
         alf $$3 = oh.u.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b b(dfb $$0) {
         alf $$1 = oh.M.a($$0, this.b, nr.this.c);
         alf $$2 = oh.N.a($$0, this.b, nr.this.c);
         alf $$3 = oh.O.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3));
         alf $$4 = oh.P.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$4);
         return this;
      }

      public nr.b c(dfb $$0) {
         oi $$1 = oi.p($$0);
         alf $$2 = oh.D.a($$0, $$1, nr.this.c);
         alf $$3 = oh.E.a($$0, $$1, nr.this.c);
         alf $$4 = oh.F.a($$0, $$1, nr.this.c);
         alf $$5 = oh.G.a($$0, $$1, nr.this.c);
         alf $$6 = oh.H.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, $$6));
         alf $$7 = oh.I.a($$0, $$1, nr.this.c);
         nr.this.a($$0, $$7);
         return this;
      }

      public nr.b d(dfb $$0) {
         alf $$1 = oh.J.a($$0, this.b, nr.this.c);
         alf $$2 = oh.K.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$1, $$2));
         alf $$3 = oh.L.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b e(dfb $$0) {
         oi $$1 = oi.p($$0);
         alf $$2 = oh.R.a($$0, $$1, nr.this.c);
         alf $$3 = oh.Q.a($$0, $$1, nr.this.c);
         alf $$4 = oh.T.a($$0, $$1, nr.this.c);
         alf $$5 = oh.S.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nr.b f(dfb $$0) {
         alf $$1 = oh.V.a($$0, this.b, nr.this.c);
         alf $$2 = oh.U.a($$0, this.b, nr.this.c);
         alf $$3 = oh.X.a($$0, this.b, nr.this.c);
         alf $$4 = oh.W.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nr.b g(dfb $$0) {
         alf $$1 = oh.Y.a($$0, this.b, nr.this.c);
         alf $$2 = oh.Z.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.e($$0, $$1, $$2));
         return this;
      }

      public nr.b h(dfb $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dfb $$1 = this.d.b().get(lt.b.r);
            alf $$2 = oh.aa.a($$0, this.b, nr.this.c);
            nr.this.b.accept(nr.c($$0, $$2));
            nr.this.b.accept(nr.c($$1, $$2));
            nr.this.a($$0.r());
            nr.this.c($$1);
            return this;
         }
      }

      public nr.b i(dfb $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alf $$1 = this.a(oh.ab, $$0);
            alf $$2 = this.a(oh.ac, $$0);
            nr.this.b.accept(nr.e($$0, $$1, $$2, this.e));
            nr.this.a($$0, $$1);
            return this;
         }
      }

      public nr.b j(dfb $$0) {
         alf $$1 = this.a(oh.af, $$0);
         alf $$2 = this.a(oh.ae, $$0);
         alf $$3 = this.a(oh.ag, $$0);
         nr.this.b.accept(nr.b($$0, $$1, $$2, $$3));
         nr.this.a($$0, $$2);
         return this;
      }

      private nr.b k(dfb $$0) {
         ok $$1 = nr.this.g.getOrDefault($$0, ok.a.get($$0));
         alf $$2 = $$1.a($$0, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$2));
         return this;
      }

      private nr.b l(dfb $$0) {
         nr.this.i($$0);
         return this;
      }

      private void m(dfb $$0) {
         if (nr.this.e.contains($$0)) {
            nr.this.k($$0);
         } else {
            nr.this.j($$0);
         }
      }

      private alf a(og $$0, dfb $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nr.this.c));
      }

      public nr.b a(lt $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nr.b, dfb> $$2 = nr.h.get($$0x);
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
      nu create(dfb var1, alf var2, oi var3, BiConsumer<alf, Supplier<JsonElement>> var4);
   }

   static record d(og a, String b) {
   }

   static enum e {
      a,
      b;

      public og a() {
         return this == a ? oh.ap : oh.ao;
      }

      public og b() {
         return this == a ? oh.ar : oh.aq;
      }
   }

   class f {
      private final oi b;

      public f(final oi $$0) {
         this.b = $$0;
      }

      public nr.f a(dfb $$0) {
         oi $$1 = this.b.c(oj.d, this.b.a(oj.i));
         alf $$2 = oh.j.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$2));
         return this;
      }

      public nr.f b(dfb $$0) {
         alf $$1 = oh.j.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1));
         return this;
      }

      public nr.f c(dfb $$0) {
         alf $$1 = oh.j.a($$0, this.b, nr.this.c);
         alf $$2 = oh.k.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1, $$2));
         return this;
      }

      public nr.f d(dfb $$0) {
         nr.this.b.accept(nr.a($$0, this.b, nr.this.c));
         return this;
      }
   }
}
