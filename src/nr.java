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
   final BiConsumer<ale, Supplier<JsonElement>> c;
   private final Consumer<cui> d;
   final List<dex> e = ImmutableList.of(dez.ey, dez.eE, dez.hY);
   final Map<dex, nr.c> f = ImmutableMap.builder().put(dez.b, nr::a).put(dez.sJ, nr::c).put(dez.eM, nr::b).build();
   final Map<dex, ok> g = ImmutableMap.builder()
      .put(dez.aV, ok.y.get(dez.aV))
      .put(dez.jp, ok.y.get(dez.jp))
      .put(dez.jS, ok.a(oi.a(dez.aV, "_top")))
      .put(dez.jU, ok.a(oi.a(dez.jp, "_top")))
      .put(dez.aX, ok.d.get(dez.aV).a($$0x -> $$0x.a(oj.i, oi.G(dez.aX))))
      .put(dez.jr, ok.d.get(dez.jp).a($$0x -> $$0x.a(oj.i, oi.G(dez.jr))))
      .put(dez.hd, ok.d.get(dez.hd))
      .put(dez.jT, ok.a(oi.a(dez.hd, "_bottom")))
      .put(dez.pr, ok.z.get(dez.pr))
      .put(dez.sJ, ok.z.get(dez.sJ))
      .put(dez.he, ok.d.get(dez.he).a($$0x -> $$0x.a(oj.i, oi.G(dez.he))))
      .put(dez.aW, ok.d.get(dez.aW).a($$0x -> {
         $$0x.a(oj.d, oi.a(dez.aV, "_top"));
         $$0x.a(oj.i, oi.G(dez.aW));
      }))
      .put(dez.jq, ok.d.get(dez.jq).a($$0x -> {
         $$0x.a(oj.d, oi.a(dez.jp, "_top"));
         $$0x.a(oj.i, oi.G(dez.jq));
      }))
      .put(dez.qM, ok.z.get(dez.qM))
      .put(dez.qH, ok.z.get(dez.qH))
      .build();
   static final Map<lt.b, BiConsumer<nr.b, dex>> h = ImmutableMap.builder()
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
   public static final List<Pair<dsr, Function<ale, oa>>> a = List.of(
      Pair.of(dsq.L, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0)),
      Pair.of(dsq.M, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true)),
      Pair.of(dsq.N, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true)),
      Pair.of(dsq.O, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true)),
      Pair.of(dsq.J, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true)),
      Pair.of(dsq.K, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
   );
   private static final Map<nr.d, ale> i = new HashMap<>();

   private static nu a(dex $$0, ale $$1, oi $$2, BiConsumer<ale, Supplier<JsonElement>> $$3) {
      ale $$4 = oh.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nu b(dex $$0, ale $$1, oi $$2, BiConsumer<ale, Supplier<JsonElement>> $$3) {
      ale $$4 = oh.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nu c(dex $$0, ale $$1, oi $$2, BiConsumer<ale, Supplier<JsonElement>> $$3) {
      ale $$4 = oh.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nr(Consumer<nu> $$0, BiConsumer<ale, Supplier<JsonElement>> $$1, Consumer<cui> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dex $$0) {
      this.d.accept($$0.r());
   }

   void a(dex $$0, ale $$1) {
      this.c.accept(of.a($$0.r()), new oe($$1));
   }

   private void a(cui $$0, ale $$1) {
      this.c.accept(of.a($$0), new oe($$1));
   }

   void a(cui $$0) {
      oh.bx.a(of.a($$0), oi.b($$0), this.c);
   }

   private void d(dex $$0) {
      cui $$1 = $$0.r();
      if ($$1 != cuq.a) {
         oh.bx.a(of.a($$1), oi.F($$0), this.c);
      }
   }

   private void a(dex $$0, String $$1) {
      cui $$2 = $$0.r();
      oh.bx.a(of.a($$2), oi.k(oi.a($$0, $$1)), this.c);
   }

   private static ny b() {
      return ny.a(dsq.R).a(je.f, oa.a().a(ob.b, ob.a.b)).a(je.d, oa.a().a(ob.b, ob.a.c)).a(je.e, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a());
   }

   private static ny c() {
      return ny.a(dsq.R).a(je.d, oa.a()).a(je.e, oa.a().a(ob.b, ob.a.b)).a(je.c, oa.a().a(ob.b, ob.a.c)).a(je.f, oa.a().a(ob.b, ob.a.d));
   }

   private static ny d() {
      return ny.a(dsq.R).a(je.f, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.b)).a(je.e, oa.a().a(ob.b, ob.a.c)).a(je.c, oa.a().a(ob.b, ob.a.d));
   }

   private static ny e() {
      return ny.a(dsq.P)
         .a(je.a, oa.a().a(ob.a, ob.a.b))
         .a(je.b, oa.a().a(ob.a, ob.a.d))
         .a(je.c, oa.a())
         .a(je.d, oa.a().a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.b, ob.a.b));
   }

   private static nx b(dex $$0, ale $$1) {
      return nx.a($$0, a($$1));
   }

   private static oa[] a(ale $$0) {
      return new oa[]{oa.a().a(ob.c, $$0), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d)};
   }

   private static nx a(dex $$0, ale $$1, ale $$2) {
      return nx.a($$0, oa.a().a(ob.c, $$1), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c));
   }

   private static ny a(dsr $$0, ale $$1, ale $$2) {
      return ny.a($$0).a(true, oa.a().a(ob.c, $$1)).a(false, oa.a().a(ob.c, $$2));
   }

   private void e(dex $$0) {
      ale $$1 = ok.a.create($$0, this.c);
      ale $$2 = ok.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dex $$0) {
      ale $$1 = ok.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dex $$0) {
      this.b.accept(nx.a($$0).a(ny.a(dsq.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ale $$3 = oi.a($$0, $$2);
         return oa.a().a(ob.c, oh.c.a($$0, $$2, new oi().a(oj.a, $$3), this.c));
      })));
      this.a($$0, oi.a($$0, "_0"));
   }

   static nu b(dex $$0, ale $$1, ale $$2) {
      return nx.a($$0)
         .a(ny.a(dsq.w).a(false, oa.a().a(ob.c, $$1)).a(true, oa.a().a(ob.c, $$2)))
         .a(
            ny.a(dsq.U, dsq.R)
               .a(dsl.a, je.f, oa.a().a(ob.b, ob.a.b))
               .a(dsl.a, je.e, oa.a().a(ob.b, ob.a.d))
               .a(dsl.a, je.d, oa.a().a(ob.b, ob.a.c))
               .a(dsl.a, je.c, oa.a())
               .a(dsl.b, je.f, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsl.b, je.e, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsl.b, je.d, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsl.b, je.c, oa.a().a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsl.c, je.f, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.c))
               .a(dsl.c, je.e, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.c))
               .a(dsl.c, je.d, oa.a().a(ob.a, ob.a.c))
               .a(dsl.c, je.c, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.c))
         );
   }

   private static ny.d<je, dsw, dsv, Boolean> a(ny.d<je, dsw, dsv, Boolean> $$0, dsw $$1, ale $$2, ale $$3, ale $$4, ale $$5) {
      return $$0.a(je.f, $$1, dsv.a, false, oa.a().a(ob.c, $$2))
         .a(je.d, $$1, dsv.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsv.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsv.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsv.b, false, oa.a().a(ob.c, $$4))
         .a(je.d, $$1, dsv.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsv.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsv.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsv.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
         .a(je.d, $$1, dsv.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
         .a(je.e, $$1, dsv.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         .a(je.c, $$1, dsv.a, true, oa.a().a(ob.c, $$3))
         .a(je.f, $$1, dsv.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.d))
         .a(je.d, $$1, dsv.b, true, oa.a().a(ob.c, $$5))
         .a(je.e, $$1, dsv.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         .a(je.c, $$1, dsv.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.c));
   }

   private static nu a(dex $$0, ale $$1, ale $$2, ale $$3, ale $$4, ale $$5, ale $$6, ale $$7, ale $$8) {
      return nx.a($$0).a(a(a(ny.a(dsq.R, dsq.ae, dsq.be, dsq.u), dsw.b, $$1, $$2, $$3, $$4), dsw.a, $$5, $$6, $$7, $$8));
   }

   static nu a(dex $$0, ale $$1, ale $$2, ale $$3, ale $$4, ale $$5) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsq.L, true), oa.a().a(ob.c, $$2).a(ob.d, false))
         .a(nv.a().a(dsq.M, true), oa.a().a(ob.c, $$3).a(ob.d, false))
         .a(nv.a().a(dsq.N, true), oa.a().a(ob.c, $$4).a(ob.d, false))
         .a(nv.a().a(dsq.O, true), oa.a().a(ob.c, $$5).a(ob.d, false));
   }

   static nu c(dex $$0, ale $$1, ale $$2) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsq.L, true), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dsq.M, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsq.N, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsq.O, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dex $$0, ale $$1, ale $$2, ale $$3) {
      return nw.a($$0)
         .a(nv.a().a(dsq.J, true), oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsq.X, dtm.b), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dsq.W, dtm.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsq.Y, dtm.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsq.Z, dtm.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
         .a(nv.a().a(dsq.X, dtm.c), oa.a().a(ob.c, $$3).a(ob.d, true))
         .a(nv.a().a(dsq.W, dtm.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsq.Y, dtm.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsq.Z, dtm.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dex $$0, ale $$1, ale $$2, ale $$3, ale $$4, boolean $$5) {
      return nx.a($$0, oa.a().a(ob.d, $$5))
         .a(c())
         .a(
            ny.a(dsq.q, dsq.u)
               .a(false, false, oa.a().a(ob.c, $$2))
               .a(true, false, oa.a().a(ob.c, $$4))
               .a(false, true, oa.a().a(ob.c, $$1))
               .a(true, true, oa.a().a(ob.c, $$3))
         );
   }

   static nu b(dex $$0, ale $$1, ale $$2, ale $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsq.R, dsq.af, dsq.bi)
               .a(je.f, dsz.b, dtj.a, oa.a().a(ob.c, $$2))
               .a(je.e, dsz.b, dtj.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsz.b, dtj.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsz.b, dtj.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsz.b, dtj.e, oa.a().a(ob.c, $$3))
               .a(je.e, dsz.b, dtj.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsz.b, dtj.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsz.b, dtj.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsz.b, dtj.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dsz.b, dtj.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dsz.b, dtj.d, oa.a().a(ob.c, $$3))
               .a(je.c, dsz.b, dtj.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dsz.b, dtj.c, oa.a().a(ob.c, $$1))
               .a(je.e, dsz.b, dtj.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsz.b, dtj.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsz.b, dtj.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsz.b, dtj.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dsz.b, dtj.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dsz.b, dtj.b, oa.a().a(ob.c, $$1))
               .a(je.c, dsz.b, dtj.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dsz.a, dtj.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dsz.a, dtj.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsz.a, dtj.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsz.a, dtj.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsz.a, dtj.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dsz.a, dtj.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dsz.a, dtj.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dsz.a, dtj.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dsz.a, dtj.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dsz.a, dtj.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsz.a, dtj.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsz.a, dtj.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsz.a, dtj.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dsz.a, dtj.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dsz.a, dtj.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dsz.a, dtj.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dsz.a, dtj.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dsz.a, dtj.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsz.a, dtj.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsz.a, dtj.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
         );
   }

   private static nu c(dex $$0, ale $$1, ale $$2, ale $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsq.R, dsq.af, dsq.u)
               .a(je.c, dsz.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dsz.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(je.f, dsz.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(je.e, dsz.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(je.c, dsz.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dsz.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(je.f, dsz.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(je.e, dsz.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(je.c, dsz.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dsz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dsz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dsz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c))
               .a(je.d, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.a))
               .a(je.f, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               .a(je.e, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b))
         );
   }

   private static nu d(dex $$0, ale $$1, ale $$2, ale $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsq.R, dsq.af, dsq.u)
               .a(je.c, dsz.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dsz.b, false, oa.a().a(ob.c, $$2))
               .a(je.f, dsz.b, false, oa.a().a(ob.c, $$2))
               .a(je.e, dsz.b, false, oa.a().a(ob.c, $$2))
               .a(je.c, dsz.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dsz.a, false, oa.a().a(ob.c, $$1))
               .a(je.f, dsz.a, false, oa.a().a(ob.c, $$1))
               .a(je.e, dsz.a, false, oa.a().a(ob.c, $$1))
               .a(je.c, dsz.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dsz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dsz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dsz.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dsz.a, true, oa.a().a(ob.c, $$3))
               .a(je.d, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dsz.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         );
   }

   static nx c(dex $$0, ale $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1));
   }

   private static ny f() {
      return ny.a(dsq.I).a(je.a.b, oa.a()).a(je.a.c, oa.a().a(ob.a, ob.a.b)).a(je.a.a, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   static nu a(dex $$0, oi $$1, BiConsumer<ale, Supplier<JsonElement>> $$2) {
      ale $$3 = oh.g.a($$0, $$1, $$2);
      ale $$4 = oh.h.a($$0, $$1, $$2);
      ale $$5 = oh.i.a($$0, $$1, $$2);
      ale $$6 = oh.j.a($$0, $$1, $$2);
      return nx.a($$0, oa.a().a(ob.c, $$6)).a(ny.a(dsq.I).a(je.a.a, oa.a().a(ob.c, $$3)).a(je.a.b, oa.a().a(ob.c, $$4)).a(je.a.c, oa.a().a(ob.c, $$5)));
   }

   static nu d(dex $$0, ale $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1)).a(f());
   }

   private void e(dex $$0, ale $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dex $$0, ok.a $$1) {
      ale $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dex $$0, ok.a $$1) {
      ale $$2 = $$1.create($$0, this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   static nu d(dex $$0, ale $$1, ale $$2) {
      return nx.a($$0)
         .a(
            ny.a(dsq.I)
               .a(je.a.b, oa.a().a(ob.c, $$1))
               .a(je.a.c, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b))
               .a(je.a.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.b, ob.a.b))
         );
   }

   private void a(dex $$0, ok.a $$1, ok.a $$2) {
      ale $$3 = $$1.create($$0, this.c);
      ale $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ale a(dex $$0, String $$1, og $$2, Function<ale, oi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oi.a($$0, $$1)), this.c);
   }

   static nu e(dex $$0, ale $$1, ale $$2) {
      return nx.a($$0).a(a(dsq.w, $$2, $$1));
   }

   static nu e(dex $$0, ale $$1, ale $$2, ale $$3) {
      return nx.a($$0).a(ny.a(dsq.bh).a(dti.b, oa.a().a(ob.c, $$1)).a(dti.a, oa.a().a(ob.c, $$2)).a(dti.c, oa.a().a(ob.c, $$3)));
   }

   public void a(dex $$0) {
      this.b($$0, ok.a);
   }

   public void b(dex $$0, ok.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dex $$0, oi $$1, og $$2) {
      ale $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nr.b h(dex $$0) {
      ok $$1 = this.g.getOrDefault($$0, ok.a.get($$0));
      return new nr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dex $$0, dex $$1, dex $$2) {
      oi $$3 = oi.u($$0);
      ale $$4 = oh.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dex $$0) {
      oi $$1 = oi.t($$0);
      ale $$2 = oh.v.a($$0, $$1, this.c);
      ale $$3 = oh.w.a($$0, $$1, this.c);
      ale $$4 = oh.x.a($$0, $$1, this.c);
      ale $$5 = oh.y.a($$0, $$1, this.c);
      ale $$6 = oh.z.a($$0, $$1, this.c);
      ale $$7 = oh.A.a($$0, $$1, this.c);
      ale $$8 = oh.B.a($$0, $$1, this.c);
      ale $$9 = oh.C.a($$0, $$1, this.c);
      this.a($$0.r());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dex $$0, dex $$1) {
      ale $$2 = oh.v.a($$0);
      ale $$3 = oh.w.a($$0);
      ale $$4 = oh.x.a($$0);
      ale $$5 = oh.y.a($$0);
      ale $$6 = oh.z.a($$0);
      ale $$7 = oh.A.a($$0);
      ale $$8 = oh.B.a($$0);
      ale $$9 = oh.C.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dex $$0) {
      oi $$1 = oi.b($$0);
      ale $$2 = oh.ak.a($$0, $$1, this.c);
      ale $$3 = oh.al.a($$0, $$1, this.c);
      ale $$4 = oh.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dex $$0) {
      oi $$1 = oi.b($$0);
      ale $$2 = oh.ah.a($$0, $$1, this.c);
      ale $$3 = oh.ai.a($$0, $$1, this.c);
      ale $$4 = oh.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dex $$0, dex $$1) {
      ale $$2 = oh.ah.a($$0);
      ale $$3 = oh.ai.a($$0);
      ale $$4 = oh.aj.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dez.sD);
      ale $$0 = of.a(dez.sD);
      ale $$1 = of.a(dez.sD, "_partial_tilt");
      ale $$2 = of.a(dez.sD, "_full_tilt");
      this.b
         .accept(
            nx.a(dez.sD)
               .a(b())
               .a(ny.a(dsq.bl).a(dtl.a, oa.a().a(ob.c, $$0)).a(dtl.b, oa.a().a(ob.c, $$0)).a(dtl.c, oa.a().a(ob.c, $$1)).a(dtl.d, oa.a().a(ob.c, $$2)))
         );
   }

   private nr.f l(dex $$0) {
      return new nr.f(oi.n($$0));
   }

   private void m(dex $$0) {
      this.c($$0, $$0);
   }

   private void c(dex $$0, dex $$1) {
      this.b.accept(c($$0, of.a($$1)));
   }

   private void a(dex $$0, nr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dex $$0, nr.e $$1, oi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dex $$0, nr.e $$1) {
      oi $$2 = oi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dex $$0, nr.e $$1, oi $$2) {
      ale $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dex $$0, nr.e $$1, dtd<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         ny $$4 = ny.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            oi $$5 = oi.c(oi.a($$0, $$4x));
            ale $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return oa.a().a(ob.c, $$6);
         });
         this.a($$0.r());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void a(dex $$0, dex $$1, nr.e $$2) {
      this.a($$0, $$2);
      oi $$3 = oi.d($$0);
      ale $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dex $$0, dex $$1) {
      ok $$2 = ok.p.get($$0);
      ale $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ale $$4 = oh.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dex $$0, dex $$1) {
      this.a($$0.r());
      oi $$2 = oi.h($$0);
      oi $$3 = oi.a($$0, $$1);
      ale $$4 = oh.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nx.a($$1, oa.a().a(ob.c, $$4))
               .a(ny.a(dsq.R).a(je.e, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a().a(ob.b, ob.a.b)).a(je.f, oa.a().a(ob.b, ob.a.c)))
         );
      this.b.accept(nx.a($$0).a(ny.a(dsq.av).a($$2x -> oa.a().a(ob.c, oh.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dex $$0 = dez.kC;
      this.a($$0.r());
      ale $$1 = of.a($$0, "_top");
      ale $$2 = of.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dex $$0 = dez.kB;
      this.a($$0.r());
      ny $$1 = ny.a(dkm.d, dsq.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oa.a().a(ob.c, of.a($$0, "_top_stage_" + $$1x));
            case b -> oa.a().a(ob.c, of.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nx.a($$0).a($$1));
   }

   private void a(dex $$0, dex $$1, dex $$2, dex $$3, dex $$4, dex $$5, dex $$6, dex $$7) {
      this.a($$0, nr.e.b);
      this.a($$1, nr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dex $$0, nr.e $$1) {
      this.a($$0, "_top");
      ale $$2 = this.a($$0, "_top", $$1.a(), oi::c);
      ale $$3 = this.a($$0, "_bottom", $$1.a(), oi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dez.iD, "_front");
      ale $$0 = of.a(dez.iD, "_top");
      ale $$1 = this.a(dez.iD, "_bottom", nr.e.b.a(), oi::c);
      this.f(dez.iD, $$0, $$1);
   }

   private void k() {
      ale $$0 = this.a(dez.bx, "_top", oh.bk, oi::a);
      ale $$1 = this.a(dez.bx, "_bottom", oh.bk, oi::a);
      this.f(dez.bx, $$0, $$1);
   }

   private void l() {
      this.c(dez.sF);
      ale $$0 = of.a(dez.sF, "_top");
      ale $$1 = of.a(dez.sF, "_bottom");
      this.b.accept(nx.a(dez.sF).a(b()).a(ny.a(dsq.ae).a(dsw.b, oa.a().a(ob.c, $$1)).a(dsw.a, oa.a().a(ob.c, $$0))));
   }

   private void f(dex $$0, ale $$1, ale $$2) {
      this.b.accept(nx.a($$0).a(ny.a(dsq.ae).a(dsw.b, oa.a().a(ob.c, $$2)).a(dsw.a, oa.a().a(ob.c, $$1))));
   }

   private void n(dex $$0) {
      oi $$1 = oi.e($$0);
      oi $$2 = oi.e(oi.a($$0, "_corner"));
      ale $$3 = oh.as.a($$0, $$1, this.c);
      ale $$4 = oh.at.a($$0, $$2, this.c);
      ale $$5 = oh.au.a($$0, $$1, this.c);
      ale $$6 = oh.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsq.ag)
                     .a(dte.a, oa.a().a(ob.c, $$3))
                     .a(dte.b, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(dte.c, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
                     .a(dte.d, oa.a().a(ob.c, $$6).a(ob.b, ob.a.b))
                     .a(dte.e, oa.a().a(ob.c, $$5))
                     .a(dte.f, oa.a().a(ob.c, $$6))
                     .a(dte.g, oa.a().a(ob.c, $$4))
                     .a(dte.h, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
                     .a(dte.i, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
                     .a(dte.j, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
               )
         );
   }

   private void o(dex $$0) {
      ale $$1 = this.a($$0, "", oh.as, oi::e);
      ale $$2 = this.a($$0, "", oh.au, oi::e);
      ale $$3 = this.a($$0, "", oh.av, oi::e);
      ale $$4 = this.a($$0, "_on", oh.as, oi::e);
      ale $$5 = this.a($$0, "_on", oh.au, oi::e);
      ale $$6 = this.a($$0, "_on", oh.av, oi::e);
      ny $$7 = ny.a(dsq.w, dsq.ah).a(($$6x, $$7x) -> {
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

   private nr.a a(ale $$0, dex $$1) {
      return new nr.a($$0, $$1);
   }

   private nr.a f(dex $$0, dex $$1) {
      return new nr.a(of.a($$0), $$1);
   }

   private void a(dex $$0, cui $$1) {
      ale $$2 = oh.aa.a($$0, oi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dex $$0, ale $$1) {
      ale $$2 = oh.aa.a($$0, oi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dex $$0, dex $$1) {
      this.a($$0);
      ale $$2 = ok.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dex $$0) {
      this.a($$0.r());
      ale $$1 = ok.k.create($$0, this.c);
      ale $$2 = ok.l.create($$0, this.c);
      ale $$3 = ok.m.create($$0, this.c);
      ale $$4 = ok.n.create($$0, this.c);
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dsq.S, 1, 2, 3, 4).a(dsq.R, je.c), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsq.S, 1, 2, 3, 4).a(dsq.R, je.f), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.S, 1, 2, 3, 4).a(dsq.R, je.d), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(nv.a().a(dsq.S, 1, 2, 3, 4).a(dsq.R, je.e), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(nv.a().a(dsq.S, 2, 3, 4).a(dsq.R, je.c), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsq.S, 2, 3, 4).a(dsq.R, je.f), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.S, 2, 3, 4).a(dsq.R, je.d), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(nv.a().a(dsq.S, 2, 3, 4).a(dsq.R, je.e), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(nv.a().a(dsq.S, 3, 4).a(dsq.R, je.c), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsq.S, 3, 4).a(dsq.R, je.f), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.S, 3, 4).a(dsq.R, je.d), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(nv.a().a(dsq.S, 3, 4).a(dsq.R, je.e), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(nv.a().a(dsq.S, 4).a(dsq.R, je.c), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsq.S, 4).a(dsq.R, je.f), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.S, 4).a(dsq.R, je.d), oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
               .a(nv.a().a(dsq.S, 4).a(dsq.R, je.e), oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         );
   }

   private void a(ok.a $$0, dex... $$1) {
      for (dex $$2 : $$1) {
         ale $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ok.a $$0, dex... $$1) {
      for (dex $$2 : $$1) {
         ale $$3 = $$0.create($$2, this.c);
         this.b.accept(nx.a($$2, oa.a().a(ob.c, $$3)).a(c()));
      }
   }

   private void h(dex $$0, dex $$1) {
      this.a($$0);
      oi $$2 = oi.b($$0, $$1);
      ale $$3 = oh.aI.a($$1, $$2, this.c);
      ale $$4 = oh.aJ.a($$1, $$2, this.c);
      ale $$5 = oh.aK.a($$1, $$2, this.c);
      ale $$6 = oh.aG.a($$1, $$2, this.c);
      ale $$7 = oh.aH.a($$1, $$2, this.c);
      cui $$8 = $$1.r();
      oh.bx.a(of.a($$8), oi.F($$0), this.c);
      this.b
         .accept(
            nw.a($$1)
               .a(oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsq.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsq.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dsq.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.L, false), oa.a().a(ob.c, $$6))
               .a(nv.a().a(dsq.M, false), oa.a().a(ob.c, $$7))
               .a(nv.a().a(dsq.N, false), oa.a().a(ob.c, $$7).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.O, false), oa.a().a(ob.c, $$6).a(ob.b, ob.a.d))
         );
   }

   private void q(dex $$0) {
      oi $$1 = oi.z($$0);
      ale $$2 = oh.aL.a($$0, $$1, this.c);
      ale $$3 = this.a($$0, "_conditional", oh.aL, $$1x -> $$1.c(oj.i, $$1x));
      this.b.accept(nx.a($$0).a(a(dsq.c, $$3, $$2)).a(e()));
   }

   private void r(dex $$0) {
      ale $$1 = ok.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oa> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oa.a().a(ob.c, of.a(dez.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dez.mZ);
      this.b
         .accept(
            nw.a(dez.mZ)
               .a(nv.a().a(dsq.aq, 0), this.a(0))
               .a(nv.a().a(dsq.aq, 1), this.a(1))
               .a(nv.a().a(dsq.bk, dsm.b), oa.a().a(ob.c, of.a(dez.mZ, "_small_leaves")))
               .a(nv.a().a(dsq.bk, dsm.c), oa.a().a(ob.c, of.a(dez.mZ, "_large_leaves")))
         );
   }

   private ny n() {
      return ny.a(dsq.P)
         .a(je.a, oa.a().a(ob.a, ob.a.c))
         .a(je.b, oa.a())
         .a(je.c, oa.a().a(ob.a, ob.a.b))
         .a(je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   private void o() {
      ale $$0 = oi.a(dez.nU, "_top_open");
      this.b
         .accept(
            nx.a(dez.nU)
               .a(this.n())
               .a(
                  ny.a(dsq.u)
                     .a(false, oa.a().a(ob.c, ok.f.create(dez.nU, this.c)))
                     .a(true, oa.a().a(ob.c, ok.f.get(dez.nU).a($$1 -> $$1.a(oj.f, $$0)).a(dez.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ny a(dtd<T> $$0, T $$1, ale $$2, ale $$3) {
      oa $$4 = oa.a().a(ob.c, $$2);
      oa $$5 = oa.a().a(ob.c, $$3);
      return ny.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dex $$0, Function<dex, oi> $$1) {
      oi $$2 = $$1.apply($$0).b(oj.i, oj.c);
      oi $$3 = $$2.c(oj.g, oi.a($$0, "_front_honey"));
      ale $$4 = oh.q.a($$0, $$2, this.c);
      ale $$5 = oh.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nx.a($$0).a(b()).a(a(dsq.aN, 5, $$5, $$4)));
   }

   private void a(dex $$0, dtd<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ale> $$3 = new Int2ObjectOpenHashMap();
         ny $$4 = ny.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ale $$5 = (ale)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, oh.aV, oi::g));
            return oa.a().a(ob.c, $$5);
         });
         this.a($$0.r());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void p() {
      ale $$0 = of.a(dez.od, "_floor");
      ale $$1 = of.a(dez.od, "_ceiling");
      ale $$2 = of.a(dez.od, "_wall");
      ale $$3 = of.a(dez.od, "_between_walls");
      this.a(cuq.wo);
      this.b
         .accept(
            nx.a(dez.od)
               .a(
                  ny.a(dsq.R, dsq.V)
                     .a(je.c, dso.a, oa.a().a(ob.c, $$0))
                     .a(je.d, dso.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.c))
                     .a(je.f, dso.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.b))
                     .a(je.e, dso.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.d))
                     .a(je.c, dso.b, oa.a().a(ob.c, $$1))
                     .a(je.d, dso.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.f, dso.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.e, dso.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
                     .a(je.c, dso.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
                     .a(je.d, dso.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
                     .a(je.f, dso.c, oa.a().a(ob.c, $$2))
                     .a(je.e, dso.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
                     .a(je.d, dso.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(je.c, dso.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
                     .a(je.f, dso.d, oa.a().a(ob.c, $$3))
                     .a(je.e, dso.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nx.a(dez.nZ, oa.a().a(ob.c, of.a(dez.nZ)))
               .a(
                  ny.a(dsq.U, dsq.R)
                     .a(dsl.a, je.c, oa.a())
                     .a(dsl.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsl.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsl.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsl.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsl.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsl.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsl.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
                     .a(dsl.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsl.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsl.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsl.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               )
         );
   }

   private void d(dex $$0, ok.a $$1) {
      ale $$2 = $$1.create($$0, this.c);
      ale $$3 = oi.a($$0, "_front_on");
      ale $$4 = $$1.get($$0).a($$1x -> $$1x.a(oj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nx.a($$0).a(a(dsq.r, $$4, $$2)).a(b()));
   }

   private void a(dex... $$0) {
      ale $$1 = of.a("campfire_off");

      for (dex $$2 : $$0) {
         ale $$3 = oh.bc.a($$2, oi.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nx.a($$2).a(a(dsq.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dex $$0) {
      ale $$1 = oh.bt.a($$0, oi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dex $$0) {
      ale $$1;
      if ($$0 == dez.tj) {
         $$1 = oh.bv.a($$0, oi.m($$0), this.c);
      } else {
         $$1 = oh.bu.a($$0, oi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oi $$0 = oi.a(oi.G(dez.cl), oi.G(dez.n));
      ale $$1 = oh.j.a(dez.cl, $$0, this.c);
      this.b.accept(c(dez.cl, $$1));
   }

   private void s() {
      this.a(cuq.lH);
      this.b
         .accept(
            nw.a(dez.cw)
               .a(
                  nv.b(
                     nv.a().a(dsq.ab, dtf.c).a(dsq.aa, dtf.c).a(dsq.ac, dtf.c).a(dsq.ad, dtf.c),
                     nv.a().a(dsq.ab, dtf.b, dtf.a).a(dsq.aa, dtf.b, dtf.a),
                     nv.a().a(dsq.aa, dtf.b, dtf.a).a(dsq.ac, dtf.b, dtf.a),
                     nv.a().a(dsq.ac, dtf.b, dtf.a).a(dsq.ad, dtf.b, dtf.a),
                     nv.a().a(dsq.ad, dtf.b, dtf.a).a(dsq.ab, dtf.b, dtf.a)
                  ),
                  oa.a().a(ob.c, of.a("redstone_dust_dot"))
               )
               .a(nv.a().a(dsq.ab, dtf.b, dtf.a), oa.a().a(ob.c, of.a("redstone_dust_side0")))
               .a(nv.a().a(dsq.ac, dtf.b, dtf.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt0")))
               .a(nv.a().a(dsq.aa, dtf.b, dtf.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dsq.ad, dtf.b, dtf.a), oa.a().a(ob.c, of.a("redstone_dust_side1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dsq.ab, dtf.a), oa.a().a(ob.c, of.a("redstone_dust_up")))
               .a(nv.a().a(dsq.aa, dtf.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.ac, dtf.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.c))
               .a(nv.a().a(dsq.ad, dtf.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.d))
         );
   }

   private void t() {
      this.a(cuq.lL);
      this.b
         .accept(
            nx.a(dez.gY)
               .a(c())
               .a(
                  ny.a(dsq.bd, dsq.w)
                     .a(dst.a, false, oa.a().a(ob.c, of.a(dez.gY)))
                     .a(dst.a, true, oa.a().a(ob.c, of.a(dez.gY, "_on")))
                     .a(dst.b, false, oa.a().a(ob.c, of.a(dez.gY, "_subtract")))
                     .a(dst.b, true, oa.a().a(ob.c, of.a(dez.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oi $$0 = oi.a(dez.jR);
      oi $$1 = oi.a(oi.a(dez.jE, "_side"), $$0.a(oj.f));
      ale $$2 = oh.ab.a(dez.jE, $$1, this.c);
      ale $$3 = oh.ac.a(dez.jE, $$1, this.c);
      ale $$4 = oh.j.b(dez.jE, "_double", $$1, this.c);
      this.b.accept(e(dez.jE, $$2, $$3, $$4));
      this.b.accept(c(dez.jR, oh.c.a(dez.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cuq.sq);
      this.b
         .accept(
            nw.a(dez.fs)
               .a(oa.a().a(ob.c, oi.G(dez.fs)))
               .a(nv.a().a(dsq.k, true), oa.a().a(ob.c, oi.a(dez.fs, "_bottle0")))
               .a(nv.a().a(dsq.l, true), oa.a().a(ob.c, oi.a(dez.fs, "_bottle1")))
               .a(nv.a().a(dsq.m, true), oa.a().a(ob.c, oi.a(dez.fs, "_bottle2")))
               .a(nv.a().a(dsq.k, false), oa.a().a(ob.c, oi.a(dez.fs, "_empty0")))
               .a(nv.a().a(dsq.l, false), oa.a().a(ob.c, oi.a(dez.fs, "_empty1")))
               .a(nv.a().a(dsq.m, false), oa.a().a(ob.c, oi.a(dez.fs, "_empty2")))
         );
   }

   private void u(dex $$0) {
      ale $$1 = oh.bp.a($$0, oi.b($$0), this.c);
      ale $$2 = of.a("mushroom_block_inside");
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dsq.L, true), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsq.M, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsq.N, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dsq.O, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsq.J, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsq.K, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsq.L, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsq.M, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, false))
               .a(nv.a().a(dsq.N, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, false))
               .a(nv.a().a(dsq.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dsq.J, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dsq.K, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, false))
         );
      this.a($$0, ok.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cuq.rB);
      this.b
         .accept(
            nx.a(dez.eg)
               .a(
                  ny.a(dsq.ay)
                     .a(0, oa.a().a(ob.c, of.a(dez.eg)))
                     .a(1, oa.a().a(ob.c, of.a(dez.eg, "_slice1")))
                     .a(2, oa.a().a(ob.c, of.a(dez.eg, "_slice2")))
                     .a(3, oa.a().a(ob.c, of.a(dez.eg, "_slice3")))
                     .a(4, oa.a().a(ob.c, of.a(dez.eg, "_slice4")))
                     .a(5, oa.a().a(ob.c, of.a(dez.eg, "_slice5")))
                     .a(6, oa.a().a(ob.c, of.a(dez.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dez.nX, "_side3"))
         .a(oj.o, oi.G(dez.t))
         .a(oj.n, oi.a(dez.nX, "_top"))
         .a(oj.j, oi.a(dez.nX, "_side3"))
         .a(oj.l, oi.a(dez.nX, "_side3"))
         .a(oj.k, oi.a(dez.nX, "_side1"))
         .a(oj.m, oi.a(dez.nX, "_side2"));
      this.b.accept(c(dez.nX, oh.a.a(dez.nX, $$0, this.c)));
   }

   private void y() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dez.ob, "_front"))
         .a(oj.o, oi.a(dez.ob, "_bottom"))
         .a(oj.n, oi.a(dez.ob, "_top"))
         .a(oj.j, oi.a(dez.ob, "_front"))
         .a(oj.k, oi.a(dez.ob, "_front"))
         .a(oj.l, oi.a(dez.ob, "_side"))
         .a(oj.m, oi.a(dez.ob, "_side"));
      this.b.accept(c(dez.ob, oh.a.a(dez.ob, $$0, this.c)));
   }

   private void a(dex $$0, dex $$1, BiFunction<dex, dex, oi> $$2) {
      oi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oh.a.a($$0, $$3, this.c)));
   }

   public void b(dex $$0) {
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
      oi $$0 = oi.k(dez.eZ);
      this.b.accept(c(dez.eZ, of.a(dez.eZ)));
      this.a(dez.ee, $$0);
      this.a(dez.ef, $$0);
   }

   private void a(dex $$0, oi $$1) {
      ale $$2 = oh.p.a($$0, $$1.c(oj.g, oi.G($$0)), this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cuq.sr);
      this.m(dez.ft);
      this.b.accept(c(dez.fv, oh.bs.a(dez.fv, oi.j(oi.a(dez.H, "_still")), this.c)));
      this.b
         .accept(
            nx.a(dez.fu)
               .a(
                  ny.a(djg.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dez.fu, "_level1", oi.j(oi.a(dez.G, "_still")), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dez.fu, "_level2", oi.j(oi.a(dez.G, "_still")), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dez.fu, "_full", oi.j(oi.a(dez.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nx.a(dez.fw)
               .a(
                  ny.a(djg.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dez.fw, "_level1", oi.j(oi.G(dez.qP)), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dez.fw, "_level2", oi.j(oi.G(dez.qP)), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dez.fw, "_full", oi.j(oi.G(dez.qP)), this.c)))
               )
         );
   }

   private void B() {
      oi $$0 = oi.b(dez.kv);
      ale $$1 = oh.aE.a(dez.kv, $$0, this.c);
      ale $$2 = this.a(dez.kv, "_dead", oh.aE, $$1x -> $$0.c(oj.b, $$1x));
      this.b.accept(nx.a(dez.kv).a(a(dsq.au, 5, $$2, $$1)));
   }

   private void C() {
      ale $$0 = of.a(dez.tq);
      ale $$1 = of.a(dez.tq, "_triggered");
      ale $$2 = of.a(dez.tq, "_crafting");
      ale $$3 = of.a(dez.tq, "_crafting_triggered");
      this.b
         .accept(
            nx.a(dez.tq)
               .a(ny.a(dsq.T).a($$0x -> this.a($$0x, oa.a())))
               .a(
                  ny.a(dsq.A, dgq.b)
                     .a(false, false, oa.a().a(ob.c, $$0))
                     .a(true, true, oa.a().a(ob.c, $$3))
                     .a(true, false, oa.a().a(ob.c, $$1))
                     .a(false, true, oa.a().a(ob.c, $$2))
               )
         );
   }

   private void v(dex $$0) {
      oi $$1 = new oi().a(oj.f, oi.a(dez.cD, "_top")).a(oj.i, oi.a(dez.cD, "_side")).a(oj.g, oi.a($$0, "_front"));
      oi $$2 = new oi().a(oj.i, oi.a(dez.cD, "_top")).a(oj.g, oi.a($$0, "_front_vertical"));
      ale $$3 = oh.p.a($$0, $$1, this.c);
      ale $$4 = oh.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsq.P)
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
      ale $$0 = of.a(dez.fy);
      ale $$1 = of.a(dez.fy, "_filled");
      this.b.accept(nx.a(dez.fy).a(ny.a(dsq.h).a(false, oa.a().a(ob.c, $$0)).a(true, oa.a().a(ob.c, $$1))).a(c()));
   }

   private void E() {
      ale $$0 = of.a(dez.ku, "_side");
      ale $$1 = of.a(dez.ku, "_noside");
      ale $$2 = of.a(dez.ku, "_noside1");
      ale $$3 = of.a(dez.ku, "_noside2");
      ale $$4 = of.a(dez.ku, "_noside3");
      this.b
         .accept(
            nw.a(dez.ku)
               .a(nv.a().a(dsq.L, true), oa.a().a(ob.c, $$0))
               .a(nv.a().a(dsq.M, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsq.N, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dsq.O, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsq.J, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsq.K, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsq.L, false), oa.a().a(ob.c, $$1).a(ob.e, 2), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$3), oa.a().a(ob.c, $$4))
               .a(
                  nv.a().a(dsq.M, false),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.b).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsq.N, false),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsq.O, false),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsq.J, false),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsq.K, false),
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
            nw.a(dez.pc)
               .a(oa.a().a(ob.c, oi.G(dez.pc)))
               .a(nv.a().a(dsq.aL, 1), oa.a().a(ob.c, oi.a(dez.pc, "_contents1")))
               .a(nv.a().a(dsq.aL, 2), oa.a().a(ob.c, oi.a(dez.pc, "_contents2")))
               .a(nv.a().a(dsq.aL, 3), oa.a().a(ob.c, oi.a(dez.pc, "_contents3")))
               .a(nv.a().a(dsq.aL, 4), oa.a().a(ob.c, oi.a(dez.pc, "_contents4")))
               .a(nv.a().a(dsq.aL, 5), oa.a().a(ob.c, oi.a(dez.pc, "_contents5")))
               .a(nv.a().a(dsq.aL, 6), oa.a().a(ob.c, oi.a(dez.pc, "_contents6")))
               .a(nv.a().a(dsq.aL, 7), oa.a().a(ob.c, oi.a(dez.pc, "_contents7")))
               .a(nv.a().a(dsq.aL, 8), oa.a().a(ob.c, oi.a(dez.pc, "_contents_ready")))
         );
   }

   private void w(dex $$0) {
      ale $$1 = oh.c.a($$0, oi.a($$0), this.c);
      ale $$2 = this.a($$0, "_powered", oh.c, oi::b);
      ale $$3 = this.a($$0, "_lit", oh.c, oi::b);
      ale $$4 = this.a($$0, "_lit_powered", oh.c, oi::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nu a(dex $$0, ale $$1, ale $$2, ale $$3, ale $$4) {
      return nx.a($$0).a(ny.a(dsq.r, dsq.w).a(($$4x, $$5) -> $$4x ? oa.a().a(ob.c, $$5 ? $$4 : $$2) : oa.a().a(ob.c, $$5 ? $$3 : $$1)));
   }

   private void i(dex $$0, dex $$1) {
      ale $$2 = of.a($$0);
      ale $$3 = of.a($$0, "_powered");
      ale $$4 = of.a($$0, "_lit");
      ale $$5 = of.a($$0, "_lit_powered");
      this.a($$1, of.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dex $$0) {
      this.c($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, oh.ao.a($$0, oi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dez.qy);
      this.x(dez.qx);
      this.x(dez.qw);
      this.x(dez.qv);
   }

   private void H() {
      this.c(dez.st);
      ny.b<je, dsx> $$0 = ny.a(dsq.bm, dsq.bn);

      for (dsx $$1 : dsx.values()) {
         $$0.a(je.b, $$1, this.a(je.b, $$1));
      }

      for (dsx $$2 : dsx.values()) {
         $$0.a(je.a, $$2, this.a(je.a, $$2));
      }

      this.b.accept(nx.a(dez.st).a($$0));
   }

   private oa a(je $$0, dsx $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oi $$3 = oi.c(oi.a(dez.st, $$2));
      return oa.a().a(ob.c, oh.an.a(dez.st, $$2, $$3, this.c));
   }

   private void y(dex $$0) {
      oi $$1 = new oi().a(oj.e, oi.G(dez.dV)).a(oj.f, oi.G($$0)).a(oj.i, oi.a($$0, "_side"));
      this.b.accept(c($$0, oh.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ale $$0 = oi.a(dez.gZ, "_side");
      oi $$1 = new oi().a(oj.f, oi.a(dez.gZ, "_top")).a(oj.i, $$0);
      oi $$2 = new oi().a(oj.f, oi.a(dez.gZ, "_inverted_top")).a(oj.i, $$0);
      this.b
         .accept(
            nx.a(dez.gZ)
               .a(ny.a(dsq.p).a(false, oa.a().a(ob.c, oh.aF.a(dez.gZ, $$1, this.c))).a(true, oa.a().a(ob.c, oh.aF.a(of.a(dez.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dex $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()));
   }

   private void J() {
      dex $$0 = dez.ss;
      ale $$1 = of.a($$0, "_on");
      ale $$2 = of.a($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()).a(a(dsq.w, $$1, $$2)));
   }

   private void K() {
      oi $$0 = new oi().a(oj.B, oi.G(dez.j)).a(oj.f, oi.G(dez.cC));
      oi $$1 = new oi().a(oj.B, oi.G(dez.j)).a(oj.f, oi.a(dez.cC, "_moist"));
      ale $$2 = oh.aW.a(dez.cC, $$0, this.c);
      ale $$3 = oh.aW.a(oi.a(dez.cC, "_moist"), $$1, this.c);
      this.b.accept(nx.a(dez.cC).a(a(dsq.aQ, 7, $$3, $$2)));
   }

   private List<ale> A(dex $$0) {
      ale $$1 = oh.aX.a(of.a($$0, "_floor0"), oi.v($$0), this.c);
      ale $$2 = oh.aX.a(of.a($$0, "_floor1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ale> B(dex $$0) {
      ale $$1 = oh.aY.a(of.a($$0, "_side0"), oi.v($$0), this.c);
      ale $$2 = oh.aY.a(of.a($$0, "_side1"), oi.w($$0), this.c);
      ale $$3 = oh.aZ.a(of.a($$0, "_side_alt0"), oi.v($$0), this.c);
      ale $$4 = oh.aZ.a(of.a($$0, "_side_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ale> C(dex $$0) {
      ale $$1 = oh.ba.a(of.a($$0, "_up0"), oi.v($$0), this.c);
      ale $$2 = oh.ba.a(of.a($$0, "_up1"), oi.w($$0), this.c);
      ale $$3 = oh.bb.a(of.a($$0, "_up_alt0"), oi.v($$0), this.c);
      ale $$4 = oh.bb.a(of.a($$0, "_up_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<oa> a(List<ale> $$0, UnaryOperator<oa> $$1) {
      return $$0.stream().map($$0x -> oa.a().a(ob.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nv $$0 = nv.a().a(dsq.L, false).a(dsq.M, false).a(dsq.N, false).a(dsq.O, false).a(dsq.J, false);
      List<ale> $$1 = this.A(dez.cr);
      List<ale> $$2 = this.B(dez.cr);
      List<ale> $$3 = this.C(dez.cr);
      this.b
         .accept(
            nw.a(dez.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dsq.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dsq.M, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(nv.b(nv.a().a(dsq.N, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(nv.b(nv.a().a(dsq.O, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.d)))
               .a(nv.a().a(dsq.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ale> $$0 = this.A(dez.cs);
      List<ale> $$1 = this.B(dez.cs);
      this.b
         .accept(
            nw.a(dez.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.d)))
         );
   }

   private void D(dex $$0) {
      ale $$1 = ok.t.create($$0, this.c);
      ale $$2 = ok.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nx.a($$0).a(a(dsq.j, $$2, $$1)));
   }

   private void N() {
      oi $$0 = oi.a(oi.a(dez.ad, "_side"), oi.a(dez.ad, "_top"));
      ale $$1 = oh.j.a(dez.ad, $$0, this.c);
      this.b.accept(d(dez.ad, $$1));
   }

   private void O() {
      this.a(cuq.ad);
      dex $$0 = dez.E;
      ny.b<Boolean, Integer> $$1 = ny.a(djs.d, djs.b);
      ale $$2 = of.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ale $$4 = of.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oa.a().a(ob.c, $$4));
         $$1.a(false, $$3, oa.a().a(ob.c, $$2));
      }

      this.b.accept(nx.a(dez.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nx.a(dez.kI)
               .a(
                  ny.a(dsq.as)
                     .a(0, oa.a().a(ob.c, this.a(dez.kI, "_0", oh.c, oi::b)))
                     .a(1, oa.a().a(ob.c, this.a(dez.kI, "_1", oh.c, oi::b)))
                     .a(2, oa.a().a(ob.c, this.a(dez.kI, "_2", oh.c, oi::b)))
                     .a(3, oa.a().a(ob.c, this.a(dez.kI, "_3", oh.c, oi::b)))
               )
         );
   }

   private void Q() {
      ale $$0 = oi.G(dez.j);
      oi $$1 = new oi().a(oj.e, $$0).b(oj.e, oj.c).a(oj.f, oi.a(dez.i, "_top")).a(oj.i, oi.a(dez.i, "_snow"));
      oa $$2 = oa.a().a(ob.c, oh.n.a(dez.i, "_snow", $$1, this.c));
      this.a(dez.i, of.a(dez.i), $$2);
      ale $$3 = ok.f.get(dez.fl).a($$1x -> $$1x.a(oj.e, $$0)).a(dez.fl, this.c);
      this.a(dez.fl, $$3, $$2);
      ale $$4 = ok.f.get(dez.l).a($$1x -> $$1x.a(oj.e, $$0)).a(dez.l, this.c);
      this.a(dez.l, $$4, $$2);
   }

   private void a(dex $$0, ale $$1, oa $$2) {
      List<oa> $$3 = Arrays.asList(a($$1));
      this.b.accept(nx.a($$0).a(ny.a(dsq.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cuq.rh);
      this.b
         .accept(
            nx.a(dez.fC)
               .a(
                  ny.a(dsq.ar)
                     .a(0, oa.a().a(ob.c, of.a(dez.fC, "_stage0")))
                     .a(1, oa.a().a(ob.c, of.a(dez.fC, "_stage1")))
                     .a(2, oa.a().a(ob.c, of.a(dez.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dez.kE, of.a(dez.kE)));
   }

   private void j(dex $$0, dex $$1) {
      oi $$2 = oi.b($$1);
      ale $$3 = oh.Y.a($$0, $$2, this.c);
      ale $$4 = oh.Z.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dsq.aT, 1, $$4, $$3)));
   }

   private void T() {
      ale $$0 = of.a(dez.hc);
      ale $$1 = of.a(dez.hc, "_side");
      this.a(cuq.lR);
      this.b
         .accept(
            nx.a(dez.hc)
               .a(
                  ny.a(dsq.Q)
                     .a(je.a, oa.a().a(ob.c, $$0))
                     .a(je.c, oa.a().a(ob.c, $$1))
                     .a(je.f, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.d, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.e, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               )
         );
   }

   private void k(dex $$0, dex $$1) {
      ale $$2 = of.a($$0);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ale $$0 = of.a(dez.eW, "_post_ends");
      ale $$1 = of.a(dez.eW, "_post");
      ale $$2 = of.a(dez.eW, "_cap");
      ale $$3 = of.a(dez.eW, "_cap_alt");
      ale $$4 = of.a(dez.eW, "_side");
      ale $$5 = of.a(dez.eW, "_side_alt");
      this.b
         .accept(
            nw.a(dez.eW)
               .a(oa.a().a(ob.c, $$0))
               .a(nv.a().a(dsq.L, false).a(dsq.M, false).a(dsq.N, false).a(dsq.O, false), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsq.L, true).a(dsq.M, false).a(dsq.N, false).a(dsq.O, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsq.L, false).a(dsq.M, true).a(dsq.N, false).a(dsq.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.L, false).a(dsq.M, false).a(dsq.N, true).a(dsq.O, false), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsq.L, false).a(dsq.M, false).a(dsq.N, false).a(dsq.O, true), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsq.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsq.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dsq.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         );
      this.d(dez.eW);
   }

   private void E(dex $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(b()));
   }

   private void V() {
      ale $$0 = of.a(dez.dw);
      ale $$1 = of.a(dez.dw, "_on");
      this.d(dez.dw);
      this.b
         .accept(
            nx.a(dez.dw)
               .a(a(dsq.w, $$0, $$1))
               .a(
                  ny.a(dsq.U, dsq.R)
                     .a(dsl.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsl.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
                     .a(dsl.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsl.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsl.a, je.c, oa.a())
                     .a(dsl.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsl.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsl.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsl.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsl.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsl.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsl.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
               )
         );
   }

   private void W() {
      this.d(dez.fm);
      this.b.accept(b(dez.fm, of.a(dez.fm)));
   }

   private void X() {
      this.d(dez.tn);
      this.b.accept(c(dez.tn, of.a(dez.tn)));
   }

   private void Y() {
      this.b.accept(nx.a(dez.ed).a(ny.a(dsq.H).a(je.a.a, oa.a().a(ob.c, of.a(dez.ed, "_ns"))).a(je.a.c, oa.a().a(ob.c, of.a(dez.ed, "_ew")))));
   }

   private void Z() {
      ale $$0 = ok.a.create(dez.dV, this.c);
      this.b
         .accept(
            nx.a(
               dez.dV,
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
      ale $$0 = of.a(dez.kO);
      ale $$1 = of.a(dez.kO, "_on");
      this.b.accept(nx.a(dez.kO).a(a(dsq.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oi $$0 = new oi().a(oj.e, oi.a(dez.by, "_bottom")).a(oj.i, oi.a(dez.by, "_side"));
      ale $$1 = oi.a(dez.by, "_top_sticky");
      ale $$2 = oi.a(dez.by, "_top");
      oi $$3 = $$0.c(oj.E, $$1);
      oi $$4 = $$0.c(oj.E, $$2);
      ale $$5 = of.a(dez.by, "_base");
      this.a(dez.by, $$5, $$4);
      this.a(dez.br, $$5, $$3);
      ale $$6 = oh.n.a(dez.by, "_inventory", $$0.c(oj.f, $$2), this.c);
      ale $$7 = oh.n.a(dez.br, "_inventory", $$0.c(oj.f, $$1), this.c);
      this.a(dez.by, $$6);
      this.a(dez.br, $$7);
   }

   private void a(dex $$0, ale $$1, oi $$2) {
      ale $$3 = oh.bh.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dsq.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oi $$0 = new oi().a(oj.F, oi.a(dez.by, "_top")).a(oj.i, oi.a(dez.by, "_side"));
      oi $$1 = $$0.c(oj.E, oi.a(dez.by, "_top_sticky"));
      oi $$2 = $$0.c(oj.E, oi.a(dez.by, "_top"));
      this.b
         .accept(
            nx.a(dez.bz)
               .a(
                  ny.a(dsq.x, dsq.bg)
                     .a(false, dtc.a, oa.a().a(ob.c, oh.bi.a(dez.by, "_head", $$2, this.c)))
                     .a(false, dtc.b, oa.a().a(ob.c, oh.bi.a(dez.by, "_head_sticky", $$1, this.c)))
                     .a(true, dtc.a, oa.a().a(ob.c, oh.bj.a(dez.by, "_head_short", $$2, this.c)))
                     .a(true, dtc.b, oa.a().a(ob.c, oh.bj.a(dez.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dex $$0 = dez.tr;
      oi $$1 = oi.a($$0, "_side_inactive", "_top_inactive");
      oi $$2 = oi.a($$0, "_side_active", "_top_active");
      oi $$3 = oi.a($$0, "_side_active", "_top_ejecting_reward");
      oi $$4 = oi.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      oi $$5 = oi.a($$0, "_side_active_ominous", "_top_active_ominous");
      oi $$6 = oi.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      ale $$7 = oh.o.a($$0, $$1, this.c);
      ale $$8 = oh.o.a($$0, "_active", $$2, this.c);
      ale $$9 = oh.o.a($$0, "_ejecting_reward", $$3, this.c);
      ale $$10 = oh.o.a($$0, "_inactive_ominous", $$4, this.c);
      ale $$11 = oh.o.a($$0, "_active_ominous", $$5, this.c);
      ale $$12 = oh.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nx.a($$0).a(ny.a(dsq.by, dsq.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oa.a().a(ob.c, $$7x ? $$10 : $$7);
            case b, c, d -> oa.a().a(ob.c, $$7x ? $$11 : $$8);
            case e -> oa.a().a(ob.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dex $$0 = dez.ts;
      oi $$1 = oi.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      oi $$2 = oi.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      oi $$3 = oi.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      oi $$4 = oi.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ale $$5 = oh.bN.a($$0, $$1, this.c);
      ale $$6 = oh.bN.a($$0, "_active", $$2, this.c);
      ale $$7 = oh.bN.a($$0, "_unlocking", $$3, this.c);
      ale $$8 = oh.bN.a($$0, "_ejecting_reward", $$4, this.c);
      oi $$9 = oi.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      oi $$10 = oi.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$11 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$12 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      ale $$13 = oh.bN.a($$0, "_ominous", $$9, this.c);
      ale $$14 = oh.bN.a($$0, "_active_ominous", $$10, this.c);
      ale $$15 = oh.bN.a($$0, "_unlocking_ominous", $$11, this.c);
      ale $$16 = oh.bN.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nx.a($$0).a(b()).a(ny.a(dns.b, dns.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oa.a().a(ob.c, $$9x ? $$13 : $$5);
            case b -> oa.a().a(ob.c, $$9x ? $$14 : $$6);
            case c -> oa.a().a(ob.c, $$9x ? $$15 : $$7);
            case d -> oa.a().a(ob.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      ale $$0 = of.a(dez.qQ, "_inactive");
      ale $$1 = of.a(dez.qQ, "_active");
      this.a(dez.qQ, $$0);
      this.b.accept(nx.a(dez.qQ).a(ny.a(dsq.bo).a($$2 -> oa.a().a(ob.c, $$2 != dth.b && $$2 != dth.c ? $$0 : $$1))));
   }

   private void ag() {
      ale $$0 = of.a(dez.qR, "_inactive");
      ale $$1 = of.a(dez.qR, "_active");
      this.a(dez.qR, $$0);
      this.b.accept(nx.a(dez.qR).a(ny.a(dsq.bo).a($$2 -> oa.a().a(ob.c, $$2 != dth.b && $$2 != dth.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      ale $$0 = oh.bM.a(dez.qV, oi.a(false), this.c);
      ale $$1 = oh.bM.a(dez.qV, "_can_summon", oi.a(true), this.c);
      this.a(dez.qV, $$0);
      this.b.accept(nx.a(dez.qV).a(a(dsq.G, $$1, $$0)));
   }

   private void ai() {
      ale $$0 = of.a(dez.nS, "_stable");
      ale $$1 = of.a(dez.nS, "_unstable");
      this.a(dez.nS, $$0);
      this.b.accept(nx.a(dez.nS).a(a(dsq.b, $$1, $$0)));
   }

   private void aj() {
      ale $$0 = this.a(dez.sv, "", oh.ao, oi::c);
      ale $$1 = this.a(dez.sv, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dez.sv).a(a(dsq.D, $$1, $$0)));
      ale $$2 = this.a(dez.sw, "", oh.ao, oi::c);
      ale $$3 = this.a(dez.sw, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dez.sw).a(a(dsq.D, $$3, $$2)));
   }

   private void ak() {
      ale $$0 = ok.a.create(dez.fB, this.c);
      ale $$1 = this.a(dez.fB, "_on", oh.c, oi::b);
      this.b.accept(nx.a(dez.fB).a(a(dsq.r, $$1, $$0)));
   }

   private void l(dex $$0, dex $$1) {
      oi $$2 = oi.y($$0);
      this.b.accept(c($$0, oh.bf.a($$0, $$2, this.c)));
      this.b.accept(nx.a($$1, oa.a().a(ob.c, oh.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oi $$0 = oi.y(dez.dK);
      oi $$1 = oi.i(oi.a(dez.dK, "_off"));
      ale $$2 = oh.bf.a(dez.dK, $$0, this.c);
      ale $$3 = oh.bf.a(dez.dK, "_off", $$1, this.c);
      this.b.accept(nx.a(dez.dK).a(a(dsq.r, $$2, $$3)));
      ale $$4 = oh.bg.a(dez.dL, $$0, this.c);
      ale $$5 = oh.bg.a(dez.dL, "_off", $$1, this.c);
      this.b.accept(nx.a(dez.dL).a(a(dsq.r, $$4, $$5)).a(d()));
      this.d(dez.dK);
      this.c(dez.dL);
   }

   private void am() {
      this.a(cuq.lK);
      this.b.accept(nx.a(dez.eh).a(ny.a(dsq.aA, dsq.s, dsq.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oa.a().a(ob.c, oi.a(dez.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cuq.cT);
      this.b
         .accept(
            nx.a(dez.mV)
               .a(
                  ny.a(dsq.aS, dsq.C)
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
      oi $$0 = oi.a(dez.dN);
      ale $$1 = oh.c.a(dez.dP, $$0, this.c);
      this.b.accept(nx.a(dez.dN).a(ny.a(dsq.aF).a($$1x -> oa.a().a(ob.c, $$1x < 8 ? of.a(dez.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dez.dN, of.a(dez.dN, "_height2"));
      this.b.accept(c(dez.dP, $$1));
   }

   private void ap() {
      this.b.accept(nx.a(dez.oc, oa.a().a(ob.c, of.a(dez.oc))).a(b()));
   }

   private void aq() {
      ale $$0 = ok.a.create(dez.pa, this.c);
      this.a(dez.pa, $$0);
      this.b.accept(nx.a(dez.pa).a(ny.a(dsq.bj).a($$0x -> oa.a().a(ob.c, this.a(dez.pa, "_" + $$0x.c(), oh.c, oi::b)))));
   }

   private void ar() {
      this.a(cuq.wr);
      this.b.accept(nx.a(dez.oi).a(ny.a(dsq.as).a($$0 -> oa.a().a(ob.c, this.a(dez.oi, "_stage" + $$0, oh.ao, oi::c)))));
   }

   private void as() {
      this.a(cuq.ps);
      this.b
         .accept(
            nx.a(dez.fI)
               .a(
                  ny.a(dsq.a, dsq.M, dsq.L, dsq.N, dsq.O)
                     .a(false, false, false, false, false, oa.a().a(ob.c, of.a(dez.fI, "_ns")))
                     .a(false, true, false, false, false, oa.a().a(ob.c, of.a(dez.fI, "_n")).a(ob.b, ob.a.b))
                     .a(false, false, true, false, false, oa.a().a(ob.c, of.a(dez.fI, "_n")))
                     .a(false, false, false, true, false, oa.a().a(ob.c, of.a(dez.fI, "_n")).a(ob.b, ob.a.c))
                     .a(false, false, false, false, true, oa.a().a(ob.c, of.a(dez.fI, "_n")).a(ob.b, ob.a.d))
                     .a(false, true, true, false, false, oa.a().a(ob.c, of.a(dez.fI, "_ne")))
                     .a(false, true, false, true, false, oa.a().a(ob.c, of.a(dez.fI, "_ne")).a(ob.b, ob.a.b))
                     .a(false, false, false, true, true, oa.a().a(ob.c, of.a(dez.fI, "_ne")).a(ob.b, ob.a.c))
                     .a(false, false, true, false, true, oa.a().a(ob.c, of.a(dez.fI, "_ne")).a(ob.b, ob.a.d))
                     .a(false, false, true, true, false, oa.a().a(ob.c, of.a(dez.fI, "_ns")))
                     .a(false, true, false, false, true, oa.a().a(ob.c, of.a(dez.fI, "_ns")).a(ob.b, ob.a.b))
                     .a(false, true, true, true, false, oa.a().a(ob.c, of.a(dez.fI, "_nse")))
                     .a(false, true, false, true, true, oa.a().a(ob.c, of.a(dez.fI, "_nse")).a(ob.b, ob.a.b))
                     .a(false, false, true, true, true, oa.a().a(ob.c, of.a(dez.fI, "_nse")).a(ob.b, ob.a.c))
                     .a(false, true, true, false, true, oa.a().a(ob.c, of.a(dez.fI, "_nse")).a(ob.b, ob.a.d))
                     .a(false, true, true, true, true, oa.a().a(ob.c, of.a(dez.fI, "_nsew")))
                     .a(true, false, false, false, false, oa.a().a(ob.c, of.a(dez.fI, "_attached_ns")))
                     .a(true, false, true, false, false, oa.a().a(ob.c, of.a(dez.fI, "_attached_n")))
                     .a(true, false, false, true, false, oa.a().a(ob.c, of.a(dez.fI, "_attached_n")).a(ob.b, ob.a.c))
                     .a(true, true, false, false, false, oa.a().a(ob.c, of.a(dez.fI, "_attached_n")).a(ob.b, ob.a.b))
                     .a(true, false, false, false, true, oa.a().a(ob.c, of.a(dez.fI, "_attached_n")).a(ob.b, ob.a.d))
                     .a(true, true, true, false, false, oa.a().a(ob.c, of.a(dez.fI, "_attached_ne")))
                     .a(true, true, false, true, false, oa.a().a(ob.c, of.a(dez.fI, "_attached_ne")).a(ob.b, ob.a.b))
                     .a(true, false, false, true, true, oa.a().a(ob.c, of.a(dez.fI, "_attached_ne")).a(ob.b, ob.a.c))
                     .a(true, false, true, false, true, oa.a().a(ob.c, of.a(dez.fI, "_attached_ne")).a(ob.b, ob.a.d))
                     .a(true, false, true, true, false, oa.a().a(ob.c, of.a(dez.fI, "_attached_ns")))
                     .a(true, true, false, false, true, oa.a().a(ob.c, of.a(dez.fI, "_attached_ns")).a(ob.b, ob.a.b))
                     .a(true, true, true, true, false, oa.a().a(ob.c, of.a(dez.fI, "_attached_nse")))
                     .a(true, true, false, true, true, oa.a().a(ob.c, of.a(dez.fI, "_attached_nse")).a(ob.b, ob.a.b))
                     .a(true, false, true, true, true, oa.a().a(ob.c, of.a(dez.fI, "_attached_nse")).a(ob.b, ob.a.c))
                     .a(true, true, true, false, true, oa.a().a(ob.c, of.a(dez.fI, "_attached_nse")).a(ob.b, ob.a.d))
                     .a(true, true, true, true, true, oa.a().a(ob.c, of.a(dez.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dez.fH);
      this.b.accept(nx.a(dez.fH).a(ny.a(dsq.a, dsq.w).a(($$0, $$1) -> oa.a().a(ob.c, oi.a(dez.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ale a(int $$0, String $$1, oi $$2) {
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

   private ale a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", oi.b(oi.G(dez.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oi.b(oi.a(dez.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oi.b(oi.a(dez.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cuq.kp);
      this.b.accept(nx.a(dez.mf).a(ny.a(dsq.aD, dsq.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cuq.kq);
      Function<Integer, ale> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oi $$2 = oi.a($$1);
         return oh.bw.a(dez.mg, $$1, $$2, this.c);
      };
      this.b.accept(nx.a(dez.mg).a(ny.a(dmf.c).a($$1 -> oa.a().a(ob.c, $$0.apply($$1)))));
   }

   private void F(dex $$0) {
      this.d($$0);
      ale $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      nv.c $$3 = ac.a(nv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dsr, Function<ale, oa>> $$4 : a) {
         dsr $$5 = (dsr)$$4.getFirst();
         Function<ale, oa> $$6 = (Function<ale, oa>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(nv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      ale $$0 = oi.a(dez.qU, "_bottom");
      oi $$1 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dez.qU, "_top")).a(oj.i, oi.a(dez.qU, "_side"));
      oi $$2 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dez.qU, "_top_bloom")).a(oj.i, oi.a(dez.qU, "_side_bloom"));
      ale $$3 = oh.n.a(dez.qU, "", $$1, this.c);
      ale $$4 = oh.n.a(dez.qU, "_bloom", $$2, this.c);
      this.b.accept(nx.a(dez.qU).a(ny.a(dsq.E).a($$2x -> oa.a().a(ob.c, $$2x ? $$4 : $$3))));
      this.a(cuq.gj, $$3);
   }

   private void ax() {
      dex $$0 = dez.cm;
      ale $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      List.of(Pair.of(je.c, ob.a.a), Pair.of(je.f, ob.a.b), Pair.of(je.d, ob.a.c), Pair.of(je.e, ob.a.d)).forEach($$2x -> {
         je $$3 = (je)$$2x.getFirst();
         ob.a $$4 = (ob.a)$$2x.getSecond();
         nv.c $$5 = nv.a().a(dsq.R, $$3);
         $$2.a($$5, oa.a().a(ob.c, $$1).a(ob.b, $$4).a(ob.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, of.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2) {
      List.of(Pair.of(dsq.bp, oh.aM), Pair.of(dsq.bq, oh.aN), Pair.of(dsq.br, oh.aO), Pair.of(dsq.bs, oh.aP), Pair.of(dsq.bt, oh.aQ), Pair.of(dsq.bu, oh.aR))
         .forEach($$3 -> {
            dsr $$4 = (dsr)$$3.getFirst();
            og $$5 = (og)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2, dsr $$3, og $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oi $$7 = new oi().a(oj.b, oi.a(dez.cm, $$6));
      nr.d $$8 = new nr.d($$4, $$6);
      ale $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dez.cm, $$6, $$7, this.c));
      $$0.a(nv.a($$1, nv.a().a($$3, $$5)), oa.a().a(ob.c, $$9).a(ob.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dez.kJ, oh.c.a(dez.kJ, oi.b(of.a("magma")), this.c)));
   }

   private void G(dex $$0) {
      this.b($$0, ok.q);
      oh.bD.a(of.a($$0.r()), oi.u($$0), this.c);
   }

   private void b(dex $$0, dex $$1, nr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dex $$0, dex $$1) {
      oh.bE.a(of.a($$0.r()), oi.u($$1), this.c);
   }

   private void az() {
      ale $$0 = of.a(dez.b);
      ale $$1 = of.a(dez.b, "_mirrored");
      this.b.accept(a(dez.eN, $$0, $$1));
      this.a(dez.eN, $$0);
   }

   private void aA() {
      ale $$0 = of.a(dez.sJ);
      ale $$1 = of.a(dez.sJ, "_mirrored");
      this.b.accept(a(dez.td, $$0, $$1).a(f()));
      this.a(dez.td, $$0);
   }

   private void n(dex $$0, dex $$1) {
      this.a($$0, nr.e.b);
      oi $$2 = oi.d(oi.a($$0, "_pot"));
      ale $$3 = nr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      ale $$0 = oi.a(dez.pl, "_bottom");
      ale $$1 = oi.a(dez.pl, "_top_off");
      ale $$2 = oi.a(dez.pl, "_top");
      ale[] $$3 = new ale[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oi $$5 = new oi().a(oj.e, $$0).a(oj.f, $$4 == 0 ? $$1 : $$2).a(oj.i, oi.a(dez.pl, "_side" + $$4));
         $$3[$$4] = oh.n.a(dez.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nx.a(dez.pl).a(ny.a(dsq.aZ).a($$1x -> oa.a().a(ob.c, $$3[$$1x]))));
      this.a(cuq.wP, $$3[0]);
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
      ale $$0 = oi.a(dez.pb, "_top");
      ale $$1 = oi.a(dez.pb, "_bottom");
      ale $$2 = oi.a(dez.pb, "_side");
      ale $$3 = oi.a(dez.pb, "_lock");
      oi $$4 = new oi().a(oj.o, $$2).a(oj.m, $$2).a(oj.l, $$2).a(oj.c, $$0).a(oj.j, $$0).a(oj.k, $$1).a(oj.n, $$3);
      ale $$5 = oh.b.a(dez.pb, $$4, this.c);
      this.b.accept(nx.a(dez.pb, oa.a().a(ob.c, $$5)).a(ny.a(dsq.T).a($$0x -> this.a($$0x, oa.a()))));
   }

   private void aD() {
      dex $$0 = dez.n;
      ale $$1 = of.a($$0);
      ok $$2 = ok.a.get($$0);
      dex $$3 = dez.jH;
      ale $$4 = oh.ab.a($$3, $$2.b(), this.c);
      ale $$5 = oh.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ls.a().filter(lt::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dez.rf).a(ls.w).a(dez.rf, dez.rD).a(dez.rj, dez.rn).a(ls.y);
      this.h(dez.re).a(ls.A).a(dez.re, dez.rC).a(dez.ri, dez.rm).a(ls.C);
      this.h(dez.rd).a(ls.E).a(dez.rd, dez.rB).a(dez.rh, dez.rl).a(ls.G);
      this.h(dez.rc).a(ls.I).a(dez.rc, dez.rA).a(dez.rg, dez.rk).a(ls.K);
      this.w(dez.sk);
      this.w(dez.sl);
      this.w(dez.sm);
      this.w(dez.sn);
      this.i(dez.sk, dez.so);
      this.i(dez.sl, dez.sp);
      this.i(dez.sm, dez.sq);
      this.i(dez.sn, dez.sr);
      this.m(dez.a);
      this.c(dez.nc, dez.a);
      this.c(dez.nb, dez.a);
      this.m(dez.fO);
      this.m(dez.dQ);
      this.c(dez.nd, dez.G);
      this.m(dez.fA);
      this.m(dez.me);
      this.m(dez.fr);
      this.m(dez.fR);
      this.a(cuq.ue);
      this.m(dez.pg);
      this.m(dez.G);
      this.m(dez.H);
      this.m(dez.hV);
      this.a(cuq.fS);
      this.o(dez.pM, dez.qd);
      this.o(dez.pN, dez.qe);
      this.o(dez.pO, dez.qf);
      this.o(dez.pP, dez.qg);
      this.o(dez.pQ, dez.qh);
      this.o(dez.pR, dez.qi);
      this.o(dez.pS, dez.qj);
      this.o(dez.pT, dez.qk);
      this.o(dez.pU, dez.ql);
      this.o(dez.pV, dez.qm);
      this.o(dez.pW, dez.qn);
      this.o(dez.pX, dez.qo);
      this.o(dez.pY, dez.qp);
      this.o(dez.pZ, dez.qq);
      this.o(dez.qa, dez.qr);
      this.o(dez.qb, dez.qs);
      this.o(dez.pL, dez.qc);
      this.m(dez.na);
      this.m(dez.gs);
      this.m(dez.qP);
      this.m(dez.sx);
      this.s(dez.sy);
      this.s(dez.sz);
      this.t(dez.ti);
      this.t(dez.tj);
      this.aj();
      this.g(dez.sC, dez.sA);
      this.p(dez.sB);
      this.a(dez.hW, cuq.hB);
      this.a(cuq.hB);
      this.aE();
      this.a(dez.kN, cuq.jb);
      this.a(cuq.jb);
      this.f(dez.bQ, oi.a(dez.by, "_side"));
      this.a(dez.R);
      this.a(dez.S);
      this.a(dez.iB);
      this.a(dez.cx);
      this.a(dez.cy);
      this.a(dez.cz);
      this.a(dez.fE);
      this.a(dez.fF);
      this.a(dez.fJ);
      this.a(dez.N);
      this.a(dez.T);
      this.a(dez.O);
      this.a(dez.ch);
      this.a(dez.P);
      this.a(dez.Q);
      this.a(dez.ci);
      this.b(dez.pj, ok.d);
      this.a(dez.pi);
      this.a(dez.aR);
      this.a(dez.aS);
      this.a(dez.aT);
      this.a(dez.hb);
      this.a(dez.dI);
      this.a(dez.dJ);
      this.a(dez.ha);
      this.a(dez.pC);
      this.a(dez.mW);
      this.a(dez.dR);
      this.a(dez.k);
      this.a(dez.pk);
      this.a(dez.fz);
      this.a(dez.ec);
      this.a(dez.L);
      this.a(dez.ph);
      this.a(dez.dO);
      this.b(dez.dT, ok.g);
      this.b(dez.pq, ok.d);
      this.b(dez.fa, ok.d);
      this.m(dez.ac);
      this.m(dez.ga);
      this.a(dez.kK);
      this.a(dez.aY);
      this.a(dez.iC);
      this.a(dez.co);
      this.a(dez.pK);
      this.a(dez.ii);
      this.a(dez.oy);
      this.a(dez.dW);
      this.a(dez.dX);
      this.b(dez.ct, ok.b);
      this.a(dez.aO);
      this.b(dez.bw, ok.v);
      this.a(cuq.cS);
      this.b(dez.ck, ok.f);
      this.b(dez.pd, ok.d);
      this.a(dez.op);
      this.a(dez.aP);
      this.a(dez.qt);
      this.a(dez.qu);
      this.a(dez.qN);
      this.a(dez.su);
      this.a(dez.tf);
      this.a(dez.tg);
      this.a(dez.th);
      this.e(dez.qS);
      this.m(dez.tt);
      this.aD();
      this.a(dez.ra);
      this.a(dez.rb);
      this.a(dez.qW);
      this.a(dez.qX);
      this.a(dez.qY);
      this.a(dez.qZ);
      this.k(dez.qW, dez.rw);
      this.k(dez.qX, dez.ry);
      this.k(dez.qY, dez.rx);
      this.k(dez.qZ, dez.rz);
      this.i(dez.rM);
      this.i(dez.rN);
      this.i(dez.rP);
      this.i(dez.rO);
      this.a(dez.rM, dez.rQ);
      this.a(dez.rN, dez.rR);
      this.a(dez.rP, dez.rT);
      this.a(dez.rO, dez.rS);
      this.k(dez.rU);
      this.k(dez.rV);
      this.k(dez.rX);
      this.k(dez.rW);
      this.b(dez.rU, dez.rY);
      this.b(dez.rV, dez.rZ);
      this.b(dez.rX, dez.sb);
      this.b(dez.rW, dez.sa);
      this.a(dez.sc);
      this.a(dez.sd);
      this.a(dez.se);
      this.a(dez.sf);
      this.k(dez.sc, dez.sg);
      this.k(dez.sd, dez.sh);
      this.k(dez.se, dez.si);
      this.k(dez.sf, dez.sj);
      this.j(dez.gW, dez.ch);
      this.j(dez.gX, dez.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dez.og, dez.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dez.kt);
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
      this.F(dez.ff);
      this.F(dez.fg);
      this.F(dez.qT);
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
      this.E(dez.cO);
      this.d(dez.cO);
      this.E(dez.oa);
      this.g();
      this.E(dez.sE);
      this.l(dez.cp, dez.cq);
      this.l(dez.ea, dez.eb);
      this.a(dez.cA, dez.n, oi::c);
      this.a(dez.nY, dez.p, oi::d);
      this.y(dez.ow);
      this.y(dez.on);
      this.v(dez.aU);
      this.v(dez.hi);
      this.C();
      this.D(dez.oe);
      this.D(dez.of);
      this.e(dez.eX, of.a(dez.eX));
      this.a(dez.dY, ok.d);
      this.a(dez.dZ, ok.d);
      this.a(dez.te);
      this.a(dez.kM, ok.d);
      this.f(dez.j);
      this.f(dez.sH);
      this.f(dez.I);
      this.g(dez.J);
      this.g(dez.M);
      this.f(dez.K);
      this.e(dez.F);
      this.b(dez.to, ok.f);
      this.a(dez.ij, ok.d, ok.e);
      this.a(dez.kx, ok.w, ok.x);
      this.a(dez.hf, ok.w, ok.x);
      this.a(dez.tk, ok.d, ok.e);
      this.a(dez.tl, ok.d, ok.e);
      this.a(dez.tm, ok.d, ok.e);
      this.c(dez.nT, ok.i);
      this.z();
      this.a(dez.pe, oi::A);
      this.a(dez.pf, oi::C);
      this.a(dez.kD, dsq.as, 0, 1, 2, 3);
      this.a(dez.gt, dsq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dez.fq, dsq.as, 0, 1, 1, 2);
      this.a(dez.gu, dsq.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dez.cB, dsq.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dez.kA, nr.e.b, dsq.aq, 0, 1);
      this.i();
      this.h();
      this.a(of.a("decorated_pot"), dez.iA).b(dez.tp);
      this.a(of.a("banner"), dez.n)
         .a(oh.bF, dez.iJ, dez.iK, dez.iL, dez.iM, dez.iN, dez.iO, dez.iP, dez.iQ, dez.iR, dez.iS, dez.iT, dez.iU, dez.iV, dez.iW, dez.iX, dez.iY)
         .b(dez.iZ, dez.ja, dez.jb, dez.jc, dez.jd, dez.je, dez.jf, dez.jg, dez.jh, dez.ji, dez.jj, dez.jk, dez.jl, dez.jm, dez.jn, dez.jo);
      this.a(of.a("bed"), dez.n)
         .b(dez.aZ, dez.ba, dez.bb, dez.bc, dez.bd, dez.be, dez.bf, dez.bg, dez.bh, dez.bi, dez.bj, dez.bk, dez.bl, dez.bm, dez.bn, dez.bo);
      this.m(dez.aZ, dez.bA);
      this.m(dez.ba, dez.bB);
      this.m(dez.bb, dez.bC);
      this.m(dez.bc, dez.bD);
      this.m(dez.bd, dez.bE);
      this.m(dez.be, dez.bF);
      this.m(dez.bf, dez.bG);
      this.m(dez.bg, dez.bH);
      this.m(dez.bh, dez.bI);
      this.m(dez.bi, dez.bJ);
      this.m(dez.bj, dez.bK);
      this.m(dez.bk, dez.bL);
      this.m(dez.bl, dez.bM);
      this.m(dez.bm, dez.bN);
      this.m(dez.bn, dez.bO);
      this.m(dez.bo, dez.bP);
      this.a(of.a("skull"), dez.dW)
         .a(oh.bG, dez.gM, dez.gK, dez.gI, dez.gE, dez.gG, dez.gQ)
         .a(dez.gO)
         .b(dez.gN, dez.gP, dez.gL, dez.gJ, dez.gF, dez.gH, dez.gR);
      this.G(dez.kP);
      this.G(dez.kQ);
      this.G(dez.kR);
      this.G(dez.kS);
      this.G(dez.kT);
      this.G(dez.kU);
      this.G(dez.kV);
      this.G(dez.kW);
      this.G(dez.kX);
      this.G(dez.kY);
      this.G(dez.kZ);
      this.G(dez.la);
      this.G(dez.lb);
      this.G(dez.lc);
      this.G(dez.ld);
      this.G(dez.le);
      this.G(dez.lf);
      this.b(dez.mX, ok.q);
      this.c(dez.mX);
      this.a(of.a("chest"), dez.n).b(dez.cv, dez.gV);
      this.a(of.a("ender_chest"), dez.co).b(dez.fG);
      this.f(dez.fx, dez.co).a(dez.fx, dez.kF);
      this.a(dez.aM);
      this.a(dez.aN);
      this.a(dez.lw);
      this.a(dez.lx);
      this.a(dez.ly);
      this.a(dez.lz);
      this.a(dez.lA);
      this.a(dez.lB);
      this.a(dez.lC);
      this.a(dez.lD);
      this.a(dez.lE);
      this.a(dez.lF);
      this.a(dez.lG);
      this.a(dez.lH);
      this.a(dez.lI);
      this.a(dez.lJ);
      this.a(dez.lK);
      this.a(dez.lL);
      this.a(ok.a, dez.lM, dez.lN, dez.lO, dez.lP, dez.lQ, dez.lR, dez.lS, dez.lT, dez.lU, dez.lV, dez.lW, dez.lX, dez.lY, dez.lZ, dez.ma, dez.mb);
      this.a(dez.iA);
      this.a(dez.hj);
      this.a(dez.hk);
      this.a(dez.hl);
      this.a(dez.hm);
      this.a(dez.hn);
      this.a(dez.ho);
      this.a(dez.hp);
      this.a(dez.hq);
      this.a(dez.hr);
      this.a(dez.hs);
      this.a(dez.ht);
      this.a(dez.hu);
      this.a(dez.hv);
      this.a(dez.hw);
      this.a(dez.hx);
      this.a(dez.hy);
      this.a(dez.qO);
      this.h(dez.aQ, dez.eY);
      this.h(dez.ei, dez.hz);
      this.h(dez.ej, dez.hA);
      this.h(dez.ek, dez.hB);
      this.h(dez.el, dez.hC);
      this.h(dez.em, dez.hD);
      this.h(dez.en, dez.hE);
      this.h(dez.eo, dez.hF);
      this.h(dez.ep, dez.hG);
      this.h(dez.eq, dez.hH);
      this.h(dez.er, dez.hI);
      this.h(dez.es, dez.hJ);
      this.h(dez.et, dez.hK);
      this.h(dez.eu, dez.hL);
      this.h(dez.ev, dez.hM);
      this.h(dez.ew, dez.hN);
      this.h(dez.ex, dez.hO);
      this.b(ok.o, dez.lg, dez.lh, dez.li, dez.lj, dez.lk, dez.ll, dez.lm, dez.ln, dez.lo, dez.lp, dez.lq, dez.lr, dez.ls, dez.lt, dez.lu, dez.lv);
      this.g(dez.bA, dez.ik);
      this.g(dez.bB, dez.il);
      this.g(dez.bC, dez.im);
      this.g(dez.bD, dez.in);
      this.g(dez.bE, dez.io);
      this.g(dez.bF, dez.ip);
      this.g(dez.bG, dez.iq);
      this.g(dez.bH, dez.ir);
      this.g(dez.bI, dez.is);
      this.g(dez.bJ, dez.it);
      this.g(dez.bK, dez.iu);
      this.g(dez.bL, dez.iv);
      this.g(dez.bM, dez.iw);
      this.g(dez.bN, dez.ix);
      this.g(dez.bO, dez.iy);
      this.g(dez.bP, dez.iz);
      this.a(dez.sI);
      this.a(dez.eL);
      this.a(dez.bu, dez.gb, nr.e.a);
      this.a(dez.bR, dez.gc, nr.e.b);
      this.a(dez.bT, dez.gd, nr.e.b);
      this.a(dez.bU, dez.ge, nr.e.b);
      this.a(dez.bV, dez.gf, nr.e.b);
      this.a(dez.bW, dez.gg, nr.e.b);
      this.a(dez.bX, dez.gh, nr.e.b);
      this.a(dez.bY, dez.gi, nr.e.b);
      this.a(dez.bZ, dez.gj, nr.e.b);
      this.a(dez.ca, dez.gk, nr.e.b);
      this.a(dez.cb, dez.gl, nr.e.b);
      this.a(dez.cc, dez.gm, nr.e.b);
      this.a(dez.ce, dez.gn, nr.e.b);
      this.a(dez.cd, dez.go, nr.e.b);
      this.a(dez.cg, dez.gp, nr.e.b);
      this.a(dez.cf, dez.gq, nr.e.b);
      this.a(dez.bv, dez.gr, nr.e.b);
      this.a(dez.bS, dez.fS, nr.e.b);
      this.H();
      this.u(dez.eT);
      this.u(dez.eU);
      this.u(dez.eV);
      this.a(dez.bt, nr.e.a);
      this.b(dez.dS, nr.e.a);
      this.a(cuq.dJ);
      this.b(dez.mc, dez.md, nr.e.b);
      this.a(cuq.dK);
      this.c(dez.md);
      this.b(dez.sG, nr.e.b);
      this.c(dez.sG);
      this.c(dez.sw);
      this.b(dez.oz, dez.oA, nr.e.b);
      this.b(dez.oB, dez.oC, nr.e.b);
      this.a(dez.oz, "_plant");
      this.c(dez.oA);
      this.a(dez.oB, "_plant");
      this.c(dez.oC);
      this.a(dez.mY, nr.e.a, oi.c(oi.a(dez.mZ, "_stage0")));
      this.m();
      this.a(dez.bs, nr.e.b);
      this.c(dez.iE, nr.e.b);
      this.c(dez.iF, nr.e.b);
      this.c(dez.iG, nr.e.b);
      this.c(dez.iH, nr.e.a);
      this.c(dez.iI, nr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dez.mw, dez.mr, dez.mm, dez.mh, dez.mG, dez.mB, dez.mQ, dez.mL);
      this.a(dez.mx, dez.ms, dez.mn, dez.mi, dez.mH, dez.mC, dez.mR, dez.mM);
      this.a(dez.my, dez.mt, dez.mo, dez.mj, dez.mI, dez.mD, dez.mS, dez.mN);
      this.a(dez.mz, dez.mu, dez.mp, dez.mk, dez.mJ, dez.mE, dez.mT, dez.mO);
      this.a(dez.mA, dez.mv, dez.mq, dez.ml, dez.mK, dez.mF, dez.mU, dez.mP);
      this.e(dez.fe, dez.fc);
      this.e(dez.fd, dez.fb);
      this.l(dez.ab).c(dez.ab).a(dez.av);
      this.l(dez.am).c(dez.am).a(dez.aD);
      this.a(dez.am, dez.dj, dez.ds);
      this.b(dez.aL, ok.s);
      this.l(dez.Y).c(dez.Y).a(dez.as);
      this.l(dez.ai).c(dez.ai).a(dez.aA);
      this.a(dez.ai, dez.dd, dez.do);
      this.a(dez.B, dez.fX, nr.e.b);
      this.b(dez.aI, ok.s);
      this.l(dez.Z).d(dez.Z).a(dez.at);
      this.l(dez.aj).d(dez.aj).a(dez.aB);
      this.a(dez.aj, dez.de, dez.dp);
      this.a(dez.C, dez.fY, nr.e.b);
      this.b(dez.aJ, ok.s);
      this.l(dez.W).c(dez.W).a(dez.aq);
      this.l(dez.ag).c(dez.ag).a(dez.ay);
      this.a(dez.ag, dez.dc, dez.dn);
      this.a(dez.z, dez.fV, nr.e.b);
      this.b(dez.aG, ok.s);
      this.l(dez.U).c(dez.U).a(dez.ao);
      this.l(dez.al).c(dez.al).a(dez.aw);
      this.a(dez.al, dez.da, dez.dl);
      this.a(dez.x, dez.fT, nr.e.b);
      this.b(dez.aE, ok.s);
      this.l(dez.V).c(dez.V).a(dez.ap);
      this.l(dez.af).c(dez.af).a(dez.ax);
      this.a(dez.af, dez.db, dez.dm);
      this.a(dez.y, dez.fU, nr.e.b);
      this.b(dez.aF, ok.s);
      this.l(dez.aa).c(dez.aa).a(dez.au);
      this.l(dez.ak).c(dez.ak).a(dez.aC);
      this.a(dez.ak, dez.dg, dez.dr);
      this.a(dez.D, dez.fZ, nr.e.b);
      this.b(dez.aK, ok.s);
      this.l(dez.X).c(dez.X).a(dez.ar);
      this.l(dez.ah).c(dez.ah).a(dez.az);
      this.a(dez.ah, dez.df, dez.dq);
      this.a(dez.A, dez.fW, nr.e.b);
      this.b(dez.aH, ok.s);
      this.l(dez.os).b(dez.os).a(dez.ou);
      this.l(dez.ot).b(dez.ot).a(dez.ov);
      this.a(dez.ot, dez.dh, dez.dt);
      this.a(dez.ox, dez.pm, nr.e.b);
      this.n(dez.oD, dez.po);
      this.l(dez.oj).b(dez.oj).a(dez.ol);
      this.l(dez.ok).b(dez.ok).a(dez.om);
      this.a(dez.ok, dez.di, dez.du);
      this.a(dez.oo, dez.pn, nr.e.b);
      this.n(dez.oq, dez.pp);
      this.l(dez.ae).d(dez.ae);
      this.l(dez.an).d(dez.an);
      this.a(dez.v, dez.dk, dez.dv);
      this.b(dez.or, nr.e.b);
      this.a(cuq.dG);
      this.i(dez.dy);
      this.k(dez.hY);
      this.u();
      this.n(dez.cP);
      this.o(dez.bp);
      this.o(dez.bq);
      this.o(dez.hh);
      this.t();
      this.q(dez.fN);
      this.q(dez.kG);
      this.q(dez.kH);
      this.r(dez.gS);
      this.r(dez.gT);
      this.r(dez.gU);
      this.o();
      this.p();
      this.d(dez.cD, ok.h);
      this.d(dez.nW, ok.h);
      this.d(dez.nV, ok.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dez.eK, dez.eS);
      this.k(dez.m, dez.eO);
      this.k(dez.eJ, dez.eR);
      this.k(dez.eI, dez.eQ);
      this.az();
      this.k(dez.eH, dez.eP);
      this.aA();
      cvu.h().forEach($$0 -> this.a($$0, of.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dez.hX);
      ny.a<Integer> $$0 = ny.a(dsq.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ale $$3 = oi.a(cuq.hC, $$2);
         $$0.a($$1, oa.a().a(ob.c, oh.aa.a(dez.hX, $$2, oi.h($$3), this.c)));
         oh.bx.a(of.a(cuq.hC, $$2), oi.k($$3), this.c);
      }

      this.b.accept(nx.a(dez.hX).a($$0));
   }

   private void o(dex $$0, dex $$1) {
      this.a($$0.r());
      oi $$2 = oi.b(oi.G($$0));
      oi $$3 = oi.b(oi.a($$0, "_lit"));
      ale $$4 = oh.bH.a($$0, "_one_candle", $$2, this.c);
      ale $$5 = oh.bI.a($$0, "_two_candles", $$2, this.c);
      ale $$6 = oh.bJ.a($$0, "_three_candles", $$2, this.c);
      ale $$7 = oh.bK.a($$0, "_four_candles", $$2, this.c);
      ale $$8 = oh.bH.a($$0, "_one_candle_lit", $$3, this.c);
      ale $$9 = oh.bI.a($$0, "_two_candles_lit", $$3, this.c);
      ale $$10 = oh.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      ale $$11 = oh.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsq.az, dsq.r)
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
      ale $$12 = oh.bL.a($$1, oi.a($$0, false), this.c);
      ale $$13 = oh.bL.a($$1, "_lit", oi.a($$0, true), this.c);
      this.b.accept(nx.a($$1).a(a(dsq.r, $$13, $$12)));
   }

   class a {
      private final ale b;

      public a(final ale $$0, final dex $$1) {
         this.b = oh.aa.a($$0, oi.u($$1), nr.this.c);
      }

      public nr.a a(dex... $$0) {
         for (dex $$1 : $$0) {
            nr.this.b.accept(nr.c($$1, this.b));
         }

         return this;
      }

      public nr.a b(dex... $$0) {
         for (dex $$1 : $$0) {
            nr.this.c($$1);
         }

         return this.a($$0);
      }

      public nr.a a(og $$0, dex... $$1) {
         for (dex $$2 : $$1) {
            $$0.a(of.a($$2.r()), oi.u($$2), nr.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final oi b;
      private final Map<og, ale> c = Maps.newHashMap();
      @Nullable
      private lt d;
      @Nullable
      private ale e;
      private final Set<dex> f = new HashSet<>();

      public b(final oi $$0) {
         this.b = $$0;
      }

      public nr.b a(dex $$0, og $$1) {
         this.e = $$1.a($$0, this.b, nr.this.c);
         if (nr.this.f.containsKey($$0)) {
            nr.this.b.accept(nr.this.f.get($$0).create($$0, this.e, this.b, nr.this.c));
         } else {
            nr.this.b.accept(nr.c($$0, this.e));
         }

         return this;
      }

      public nr.b a(dex $$0, dex $$1) {
         ale $$2 = of.a($$0);
         nr.this.b.accept(nr.c($$1, $$2));
         nr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nr.b a(dex $$0) {
         ale $$1 = oh.s.a($$0, this.b, nr.this.c);
         ale $$2 = oh.t.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.b($$0, $$1, $$2));
         ale $$3 = oh.u.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b b(dex $$0) {
         ale $$1 = oh.M.a($$0, this.b, nr.this.c);
         ale $$2 = oh.N.a($$0, this.b, nr.this.c);
         ale $$3 = oh.O.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3));
         ale $$4 = oh.P.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$4);
         return this;
      }

      public nr.b c(dex $$0) {
         oi $$1 = oi.p($$0);
         ale $$2 = oh.D.a($$0, $$1, nr.this.c);
         ale $$3 = oh.E.a($$0, $$1, nr.this.c);
         ale $$4 = oh.F.a($$0, $$1, nr.this.c);
         ale $$5 = oh.G.a($$0, $$1, nr.this.c);
         ale $$6 = oh.H.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, $$6));
         ale $$7 = oh.I.a($$0, $$1, nr.this.c);
         nr.this.a($$0, $$7);
         return this;
      }

      public nr.b d(dex $$0) {
         ale $$1 = oh.J.a($$0, this.b, nr.this.c);
         ale $$2 = oh.K.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$1, $$2));
         ale $$3 = oh.L.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b e(dex $$0) {
         oi $$1 = oi.p($$0);
         ale $$2 = oh.R.a($$0, $$1, nr.this.c);
         ale $$3 = oh.Q.a($$0, $$1, nr.this.c);
         ale $$4 = oh.T.a($$0, $$1, nr.this.c);
         ale $$5 = oh.S.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nr.b f(dex $$0) {
         ale $$1 = oh.V.a($$0, this.b, nr.this.c);
         ale $$2 = oh.U.a($$0, this.b, nr.this.c);
         ale $$3 = oh.X.a($$0, this.b, nr.this.c);
         ale $$4 = oh.W.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nr.b g(dex $$0) {
         ale $$1 = oh.Y.a($$0, this.b, nr.this.c);
         ale $$2 = oh.Z.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.e($$0, $$1, $$2));
         return this;
      }

      public nr.b h(dex $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dex $$1 = this.d.b().get(lt.b.r);
            ale $$2 = oh.aa.a($$0, this.b, nr.this.c);
            nr.this.b.accept(nr.c($$0, $$2));
            nr.this.b.accept(nr.c($$1, $$2));
            nr.this.a($$0.r());
            nr.this.c($$1);
            return this;
         }
      }

      public nr.b i(dex $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ale $$1 = this.a(oh.ab, $$0);
            ale $$2 = this.a(oh.ac, $$0);
            nr.this.b.accept(nr.e($$0, $$1, $$2, this.e));
            nr.this.a($$0, $$1);
            return this;
         }
      }

      public nr.b j(dex $$0) {
         ale $$1 = this.a(oh.af, $$0);
         ale $$2 = this.a(oh.ae, $$0);
         ale $$3 = this.a(oh.ag, $$0);
         nr.this.b.accept(nr.b($$0, $$1, $$2, $$3));
         nr.this.a($$0, $$2);
         return this;
      }

      private nr.b k(dex $$0) {
         ok $$1 = nr.this.g.getOrDefault($$0, ok.a.get($$0));
         ale $$2 = $$1.a($$0, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$2));
         return this;
      }

      private nr.b l(dex $$0) {
         nr.this.i($$0);
         return this;
      }

      private void m(dex $$0) {
         if (nr.this.e.contains($$0)) {
            nr.this.k($$0);
         } else {
            nr.this.j($$0);
         }
      }

      private ale a(og $$0, dex $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nr.this.c));
      }

      public nr.b a(lt $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nr.b, dex> $$2 = nr.h.get($$0x);
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
      nu create(dex var1, ale var2, oi var3, BiConsumer<ale, Supplier<JsonElement>> var4);
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

      public nr.f a(dex $$0) {
         oi $$1 = this.b.c(oj.d, this.b.a(oj.i));
         ale $$2 = oh.j.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$2));
         return this;
      }

      public nr.f b(dex $$0) {
         ale $$1 = oh.j.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1));
         return this;
      }

      public nr.f c(dex $$0) {
         ale $$1 = oh.j.a($$0, this.b, nr.this.c);
         ale $$2 = oh.k.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1, $$2));
         return this;
      }

      public nr.f d(dex $$0) {
         nr.this.b.accept(nr.a($$0, this.b, nr.this.c));
         return this;
      }
   }
}
