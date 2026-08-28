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
   private final Consumer<cul> d;
   final List<dfa> e = ImmutableList.of(dfc.ey, dfc.eE, dfc.hY);
   final Map<dfa, nr.c> f = ImmutableMap.builder().put(dfc.b, nr::a).put(dfc.sJ, nr::c).put(dfc.eM, nr::b).build();
   final Map<dfa, ok> g = ImmutableMap.builder()
      .put(dfc.aV, ok.y.get(dfc.aV))
      .put(dfc.jp, ok.y.get(dfc.jp))
      .put(dfc.jS, ok.a(oi.a(dfc.aV, "_top")))
      .put(dfc.jU, ok.a(oi.a(dfc.jp, "_top")))
      .put(dfc.aX, ok.d.get(dfc.aV).a($$0x -> $$0x.a(oj.i, oi.G(dfc.aX))))
      .put(dfc.jr, ok.d.get(dfc.jp).a($$0x -> $$0x.a(oj.i, oi.G(dfc.jr))))
      .put(dfc.hd, ok.d.get(dfc.hd))
      .put(dfc.jT, ok.a(oi.a(dfc.hd, "_bottom")))
      .put(dfc.pr, ok.z.get(dfc.pr))
      .put(dfc.sJ, ok.z.get(dfc.sJ))
      .put(dfc.he, ok.d.get(dfc.he).a($$0x -> $$0x.a(oj.i, oi.G(dfc.he))))
      .put(dfc.aW, ok.d.get(dfc.aW).a($$0x -> {
         $$0x.a(oj.d, oi.a(dfc.aV, "_top"));
         $$0x.a(oj.i, oi.G(dfc.aW));
      }))
      .put(dfc.jq, ok.d.get(dfc.jq).a($$0x -> {
         $$0x.a(oj.d, oi.a(dfc.jp, "_top"));
         $$0x.a(oj.i, oi.G(dfc.jq));
      }))
      .put(dfc.qM, ok.z.get(dfc.qM))
      .put(dfc.qH, ok.z.get(dfc.qH))
      .build();
   static final Map<lt.b, BiConsumer<nr.b, dfa>> h = ImmutableMap.builder()
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
   public static final List<Pair<dsu, Function<alf, oa>>> a = List.of(
      Pair.of(dst.L, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0)),
      Pair.of(dst.M, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true)),
      Pair.of(dst.N, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true)),
      Pair.of(dst.O, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true)),
      Pair.of(dst.J, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true)),
      Pair.of(dst.K, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
   );
   private static final Map<nr.d, alf> i = new HashMap<>();

   private static nu a(dfa $$0, alf $$1, oi $$2, BiConsumer<alf, Supplier<JsonElement>> $$3) {
      alf $$4 = oh.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nu b(dfa $$0, alf $$1, oi $$2, BiConsumer<alf, Supplier<JsonElement>> $$3) {
      alf $$4 = oh.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nu c(dfa $$0, alf $$1, oi $$2, BiConsumer<alf, Supplier<JsonElement>> $$3) {
      alf $$4 = oh.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nr(Consumer<nu> $$0, BiConsumer<alf, Supplier<JsonElement>> $$1, Consumer<cul> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dfa $$0) {
      this.d.accept($$0.r());
   }

   void a(dfa $$0, alf $$1) {
      this.c.accept(of.a($$0.r()), new oe($$1));
   }

   private void a(cul $$0, alf $$1) {
      this.c.accept(of.a($$0), new oe($$1));
   }

   void a(cul $$0) {
      oh.bx.a(of.a($$0), oi.b($$0), this.c);
   }

   private void d(dfa $$0) {
      cul $$1 = $$0.r();
      if ($$1 != cut.a) {
         oh.bx.a(of.a($$1), oi.F($$0), this.c);
      }
   }

   private void a(dfa $$0, String $$1) {
      cul $$2 = $$0.r();
      oh.bx.a(of.a($$2), oi.k(oi.a($$0, $$1)), this.c);
   }

   private static ny b() {
      return ny.a(dst.R).a(je.f, oa.a().a(ob.b, ob.a.b)).a(je.d, oa.a().a(ob.b, ob.a.c)).a(je.e, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a());
   }

   private static ny c() {
      return ny.a(dst.R).a(je.d, oa.a()).a(je.e, oa.a().a(ob.b, ob.a.b)).a(je.c, oa.a().a(ob.b, ob.a.c)).a(je.f, oa.a().a(ob.b, ob.a.d));
   }

   private static ny d() {
      return ny.a(dst.R).a(je.f, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.b)).a(je.e, oa.a().a(ob.b, ob.a.c)).a(je.c, oa.a().a(ob.b, ob.a.d));
   }

   private static ny e() {
      return ny.a(dst.P)
         .a(je.a, oa.a().a(ob.a, ob.a.b))
         .a(je.b, oa.a().a(ob.a, ob.a.d))
         .a(je.c, oa.a())
         .a(je.d, oa.a().a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.b, ob.a.b));
   }

   private static nx b(dfa $$0, alf $$1) {
      return nx.a($$0, a($$1));
   }

   private static oa[] a(alf $$0) {
      return new oa[]{oa.a().a(ob.c, $$0), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d)};
   }

   private static nx a(dfa $$0, alf $$1, alf $$2) {
      return nx.a($$0, oa.a().a(ob.c, $$1), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c));
   }

   private static ny a(dsu $$0, alf $$1, alf $$2) {
      return ny.a($$0).a(true, oa.a().a(ob.c, $$1)).a(false, oa.a().a(ob.c, $$2));
   }

   private void e(dfa $$0) {
      alf $$1 = ok.a.create($$0, this.c);
      alf $$2 = ok.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dfa $$0) {
      alf $$1 = ok.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dfa $$0) {
      this.b.accept(nx.a($$0).a(ny.a(dst.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         alf $$3 = oi.a($$0, $$2);
         return oa.a().a(ob.c, oh.c.a($$0, $$2, new oi().a(oj.a, $$3), this.c));
      })));
      this.a($$0, oi.a($$0, "_0"));
   }

   static nu b(dfa $$0, alf $$1, alf $$2) {
      return nx.a($$0)
         .a(ny.a(dst.w).a(false, oa.a().a(ob.c, $$1)).a(true, oa.a().a(ob.c, $$2)))
         .a(
            ny.a(dst.U, dst.R)
               .a(dso.a, je.f, oa.a().a(ob.b, ob.a.b))
               .a(dso.a, je.e, oa.a().a(ob.b, ob.a.d))
               .a(dso.a, je.d, oa.a().a(ob.b, ob.a.c))
               .a(dso.a, je.c, oa.a())
               .a(dso.b, je.f, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dso.b, je.e, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dso.b, je.d, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dso.b, je.c, oa.a().a(ob.a, ob.a.b).a(ob.d, true))
               .a(dso.c, je.f, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.c))
               .a(dso.c, je.e, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.c))
               .a(dso.c, je.d, oa.a().a(ob.a, ob.a.c))
               .a(dso.c, je.c, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.c))
         );
   }

   private static ny.d<je, dsz, dsy, Boolean> a(ny.d<je, dsz, dsy, Boolean> $$0, dsz $$1, alf $$2, alf $$3, alf $$4, alf $$5) {
      return $$0.a(je.f, $$1, dsy.a, false, oa.a().a(ob.c, $$2))
         .a(je.d, $$1, dsy.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsy.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsy.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsy.b, false, oa.a().a(ob.c, $$4))
         .a(je.d, $$1, dsy.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsy.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsy.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsy.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
         .a(je.d, $$1, dsy.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
         .a(je.e, $$1, dsy.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         .a(je.c, $$1, dsy.a, true, oa.a().a(ob.c, $$3))
         .a(je.f, $$1, dsy.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.d))
         .a(je.d, $$1, dsy.b, true, oa.a().a(ob.c, $$5))
         .a(je.e, $$1, dsy.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         .a(je.c, $$1, dsy.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.c));
   }

   private static nu a(dfa $$0, alf $$1, alf $$2, alf $$3, alf $$4, alf $$5, alf $$6, alf $$7, alf $$8) {
      return nx.a($$0).a(a(a(ny.a(dst.R, dst.ae, dst.be, dst.u), dsz.b, $$1, $$2, $$3, $$4), dsz.a, $$5, $$6, $$7, $$8));
   }

   static nu a(dfa $$0, alf $$1, alf $$2, alf $$3, alf $$4, alf $$5) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dst.L, true), oa.a().a(ob.c, $$2).a(ob.d, false))
         .a(nv.a().a(dst.M, true), oa.a().a(ob.c, $$3).a(ob.d, false))
         .a(nv.a().a(dst.N, true), oa.a().a(ob.c, $$4).a(ob.d, false))
         .a(nv.a().a(dst.O, true), oa.a().a(ob.c, $$5).a(ob.d, false));
   }

   static nu c(dfa $$0, alf $$1, alf $$2) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dst.L, true), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dst.M, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dst.N, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dst.O, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dfa $$0, alf $$1, alf $$2, alf $$3) {
      return nw.a($$0)
         .a(nv.a().a(dst.J, true), oa.a().a(ob.c, $$1))
         .a(nv.a().a(dst.X, dtp.b), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dst.W, dtp.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dst.Y, dtp.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dst.Z, dtp.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
         .a(nv.a().a(dst.X, dtp.c), oa.a().a(ob.c, $$3).a(ob.d, true))
         .a(nv.a().a(dst.W, dtp.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dst.Y, dtp.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dst.Z, dtp.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dfa $$0, alf $$1, alf $$2, alf $$3, alf $$4, boolean $$5) {
      return nx.a($$0, oa.a().a(ob.d, $$5))
         .a(c())
         .a(
            ny.a(dst.q, dst.u)
               .a(false, false, oa.a().a(ob.c, $$2))
               .a(true, false, oa.a().a(ob.c, $$4))
               .a(false, true, oa.a().a(ob.c, $$1))
               .a(true, true, oa.a().a(ob.c, $$3))
         );
   }

   static nu b(dfa $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0)
         .a(
            ny.a(dst.R, dst.af, dst.bi)
               .a(je.f, dtc.b, dtm.a, oa.a().a(ob.c, $$2))
               .a(je.e, dtc.b, dtm.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtc.b, dtm.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtc.b, dtm.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtc.b, dtm.e, oa.a().a(ob.c, $$3))
               .a(je.e, dtc.b, dtm.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtc.b, dtm.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtc.b, dtm.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtc.b, dtm.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dtc.b, dtm.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dtc.b, dtm.d, oa.a().a(ob.c, $$3))
               .a(je.c, dtc.b, dtm.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dtc.b, dtm.c, oa.a().a(ob.c, $$1))
               .a(je.e, dtc.b, dtm.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtc.b, dtm.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtc.b, dtm.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtc.b, dtm.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dtc.b, dtm.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dtc.b, dtm.b, oa.a().a(ob.c, $$1))
               .a(je.c, dtc.b, dtm.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dtc.a, dtm.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dtc.a, dtm.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtc.a, dtm.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtc.a, dtm.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtc.a, dtm.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dtc.a, dtm.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dtc.a, dtm.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dtc.a, dtm.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dtc.a, dtm.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dtc.a, dtm.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtc.a, dtm.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtc.a, dtm.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtc.a, dtm.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dtc.a, dtm.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dtc.a, dtm.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dtc.a, dtm.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dtc.a, dtm.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dtc.a, dtm.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtc.a, dtm.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtc.a, dtm.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
         );
   }

   private static nu c(dfa $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0)
         .a(
            ny.a(dst.R, dst.af, dst.u)
               .a(je.c, dtc.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dtc.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(je.f, dtc.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(je.e, dtc.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(je.c, dtc.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dtc.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(je.f, dtc.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(je.e, dtc.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(je.c, dtc.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dtc.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dtc.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dtc.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dtc.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c))
               .a(je.d, dtc.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.a))
               .a(je.f, dtc.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               .a(je.e, dtc.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b))
         );
   }

   private static nu d(dfa $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0)
         .a(
            ny.a(dst.R, dst.af, dst.u)
               .a(je.c, dtc.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dtc.b, false, oa.a().a(ob.c, $$2))
               .a(je.f, dtc.b, false, oa.a().a(ob.c, $$2))
               .a(je.e, dtc.b, false, oa.a().a(ob.c, $$2))
               .a(je.c, dtc.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dtc.a, false, oa.a().a(ob.c, $$1))
               .a(je.f, dtc.a, false, oa.a().a(ob.c, $$1))
               .a(je.e, dtc.a, false, oa.a().a(ob.c, $$1))
               .a(je.c, dtc.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dtc.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dtc.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dtc.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dtc.a, true, oa.a().a(ob.c, $$3))
               .a(je.d, dtc.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dtc.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dtc.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         );
   }

   static nx c(dfa $$0, alf $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1));
   }

   private static ny f() {
      return ny.a(dst.I).a(je.a.b, oa.a()).a(je.a.c, oa.a().a(ob.a, ob.a.b)).a(je.a.a, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   static nu a(dfa $$0, oi $$1, BiConsumer<alf, Supplier<JsonElement>> $$2) {
      alf $$3 = oh.g.a($$0, $$1, $$2);
      alf $$4 = oh.h.a($$0, $$1, $$2);
      alf $$5 = oh.i.a($$0, $$1, $$2);
      alf $$6 = oh.j.a($$0, $$1, $$2);
      return nx.a($$0, oa.a().a(ob.c, $$6)).a(ny.a(dst.I).a(je.a.a, oa.a().a(ob.c, $$3)).a(je.a.b, oa.a().a(ob.c, $$4)).a(je.a.c, oa.a().a(ob.c, $$5)));
   }

   static nu d(dfa $$0, alf $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1)).a(f());
   }

   private void e(dfa $$0, alf $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dfa $$0, ok.a $$1) {
      alf $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dfa $$0, ok.a $$1) {
      alf $$2 = $$1.create($$0, this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   static nu d(dfa $$0, alf $$1, alf $$2) {
      return nx.a($$0)
         .a(
            ny.a(dst.I)
               .a(je.a.b, oa.a().a(ob.c, $$1))
               .a(je.a.c, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b))
               .a(je.a.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.b, ob.a.b))
         );
   }

   private void a(dfa $$0, ok.a $$1, ok.a $$2) {
      alf $$3 = $$1.create($$0, this.c);
      alf $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private alf a(dfa $$0, String $$1, og $$2, Function<alf, oi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oi.a($$0, $$1)), this.c);
   }

   static nu e(dfa $$0, alf $$1, alf $$2) {
      return nx.a($$0).a(a(dst.w, $$2, $$1));
   }

   static nu e(dfa $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0).a(ny.a(dst.bh).a(dtl.b, oa.a().a(ob.c, $$1)).a(dtl.a, oa.a().a(ob.c, $$2)).a(dtl.c, oa.a().a(ob.c, $$3)));
   }

   public void a(dfa $$0) {
      this.b($$0, ok.a);
   }

   public void b(dfa $$0, ok.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dfa $$0, oi $$1, og $$2) {
      alf $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nr.b h(dfa $$0) {
      ok $$1 = this.g.getOrDefault($$0, ok.a.get($$0));
      return new nr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dfa $$0, dfa $$1, dfa $$2) {
      oi $$3 = oi.u($$0);
      alf $$4 = oh.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dfa $$0) {
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

   private void a(dfa $$0, dfa $$1) {
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

   void j(dfa $$0) {
      oi $$1 = oi.b($$0);
      alf $$2 = oh.ak.a($$0, $$1, this.c);
      alf $$3 = oh.al.a($$0, $$1, this.c);
      alf $$4 = oh.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dfa $$0) {
      oi $$1 = oi.b($$0);
      alf $$2 = oh.ah.a($$0, $$1, this.c);
      alf $$3 = oh.ai.a($$0, $$1, this.c);
      alf $$4 = oh.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dfa $$0, dfa $$1) {
      alf $$2 = oh.ah.a($$0);
      alf $$3 = oh.ai.a($$0);
      alf $$4 = oh.aj.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dfc.sD);
      alf $$0 = of.a(dfc.sD);
      alf $$1 = of.a(dfc.sD, "_partial_tilt");
      alf $$2 = of.a(dfc.sD, "_full_tilt");
      this.b
         .accept(
            nx.a(dfc.sD)
               .a(b())
               .a(ny.a(dst.bl).a(dto.a, oa.a().a(ob.c, $$0)).a(dto.b, oa.a().a(ob.c, $$0)).a(dto.c, oa.a().a(ob.c, $$1)).a(dto.d, oa.a().a(ob.c, $$2)))
         );
   }

   private nr.f l(dfa $$0) {
      return new nr.f(oi.n($$0));
   }

   private void m(dfa $$0) {
      this.c($$0, $$0);
   }

   private void c(dfa $$0, dfa $$1) {
      this.b.accept(c($$0, of.a($$1)));
   }

   private void a(dfa $$0, nr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dfa $$0, nr.e $$1, oi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfa $$0, nr.e $$1) {
      oi $$2 = oi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dfa $$0, nr.e $$1, oi $$2) {
      alf $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dfa $$0, nr.e $$1, dtg<Integer> $$2, int... $$3) {
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

   private void a(dfa $$0, dfa $$1, nr.e $$2) {
      this.a($$0, $$2);
      oi $$3 = oi.d($$0);
      alf $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dfa $$0, dfa $$1) {
      ok $$2 = ok.p.get($$0);
      alf $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alf $$4 = oh.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dfa $$0, dfa $$1) {
      this.a($$0.r());
      oi $$2 = oi.h($$0);
      oi $$3 = oi.a($$0, $$1);
      alf $$4 = oh.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nx.a($$1, oa.a().a(ob.c, $$4))
               .a(ny.a(dst.R).a(je.e, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a().a(ob.b, ob.a.b)).a(je.f, oa.a().a(ob.b, ob.a.c)))
         );
      this.b.accept(nx.a($$0).a(ny.a(dst.av).a($$2x -> oa.a().a(ob.c, oh.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dfa $$0 = dfc.kC;
      this.a($$0.r());
      alf $$1 = of.a($$0, "_top");
      alf $$2 = of.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dfa $$0 = dfc.kB;
      this.a($$0.r());
      ny $$1 = ny.a(dkp.d, dst.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oa.a().a(ob.c, of.a($$0, "_top_stage_" + $$1x));
            case b -> oa.a().a(ob.c, of.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nx.a($$0).a($$1));
   }

   private void a(dfa $$0, dfa $$1, dfa $$2, dfa $$3, dfa $$4, dfa $$5, dfa $$6, dfa $$7) {
      this.a($$0, nr.e.b);
      this.a($$1, nr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dfa $$0, nr.e $$1) {
      this.a($$0, "_top");
      alf $$2 = this.a($$0, "_top", $$1.a(), oi::c);
      alf $$3 = this.a($$0, "_bottom", $$1.a(), oi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dfc.iD, "_front");
      alf $$0 = of.a(dfc.iD, "_top");
      alf $$1 = this.a(dfc.iD, "_bottom", nr.e.b.a(), oi::c);
      this.f(dfc.iD, $$0, $$1);
   }

   private void k() {
      alf $$0 = this.a(dfc.bx, "_top", oh.bk, oi::a);
      alf $$1 = this.a(dfc.bx, "_bottom", oh.bk, oi::a);
      this.f(dfc.bx, $$0, $$1);
   }

   private void l() {
      this.c(dfc.sF);
      alf $$0 = of.a(dfc.sF, "_top");
      alf $$1 = of.a(dfc.sF, "_bottom");
      this.b.accept(nx.a(dfc.sF).a(b()).a(ny.a(dst.ae).a(dsz.b, oa.a().a(ob.c, $$1)).a(dsz.a, oa.a().a(ob.c, $$0))));
   }

   private void f(dfa $$0, alf $$1, alf $$2) {
      this.b.accept(nx.a($$0).a(ny.a(dst.ae).a(dsz.b, oa.a().a(ob.c, $$2)).a(dsz.a, oa.a().a(ob.c, $$1))));
   }

   private void n(dfa $$0) {
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
                  ny.a(dst.ag)
                     .a(dth.a, oa.a().a(ob.c, $$3))
                     .a(dth.b, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(dth.c, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
                     .a(dth.d, oa.a().a(ob.c, $$6).a(ob.b, ob.a.b))
                     .a(dth.e, oa.a().a(ob.c, $$5))
                     .a(dth.f, oa.a().a(ob.c, $$6))
                     .a(dth.g, oa.a().a(ob.c, $$4))
                     .a(dth.h, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
                     .a(dth.i, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
                     .a(dth.j, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
               )
         );
   }

   private void o(dfa $$0) {
      alf $$1 = this.a($$0, "", oh.as, oi::e);
      alf $$2 = this.a($$0, "", oh.au, oi::e);
      alf $$3 = this.a($$0, "", oh.av, oi::e);
      alf $$4 = this.a($$0, "_on", oh.as, oi::e);
      alf $$5 = this.a($$0, "_on", oh.au, oi::e);
      alf $$6 = this.a($$0, "_on", oh.av, oi::e);
      ny $$7 = ny.a(dst.w, dst.ah).a(($$6x, $$7x) -> {
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

   private nr.a a(alf $$0, dfa $$1) {
      return new nr.a($$0, $$1);
   }

   private nr.a f(dfa $$0, dfa $$1) {
      return new nr.a(of.a($$0), $$1);
   }

   private void a(dfa $$0, cul $$1) {
      alf $$2 = oh.aa.a($$0, oi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dfa $$0, alf $$1) {
      alf $$2 = oh.aa.a($$0, oi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dfa $$0, dfa $$1) {
      this.a($$0);
      alf $$2 = ok.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dfa $$0) {
      this.a($$0.r());
      alf $$1 = ok.k.create($$0, this.c);
      alf $$2 = ok.l.create($$0, this.c);
      alf $$3 = ok.m.create($$0, this.c);
      alf $$4 = ok.n.create($$0, this.c);
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dst.S, 1, 2, 3, 4).a(dst.R, je.c), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dst.S, 1, 2, 3, 4).a(dst.R, je.f), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.S, 1, 2, 3, 4).a(dst.R, je.d), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(nv.a().a(dst.S, 1, 2, 3, 4).a(dst.R, je.e), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(nv.a().a(dst.S, 2, 3, 4).a(dst.R, je.c), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dst.S, 2, 3, 4).a(dst.R, je.f), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.S, 2, 3, 4).a(dst.R, je.d), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(nv.a().a(dst.S, 2, 3, 4).a(dst.R, je.e), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(nv.a().a(dst.S, 3, 4).a(dst.R, je.c), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dst.S, 3, 4).a(dst.R, je.f), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.S, 3, 4).a(dst.R, je.d), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(nv.a().a(dst.S, 3, 4).a(dst.R, je.e), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(nv.a().a(dst.S, 4).a(dst.R, je.c), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dst.S, 4).a(dst.R, je.f), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.S, 4).a(dst.R, je.d), oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
               .a(nv.a().a(dst.S, 4).a(dst.R, je.e), oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         );
   }

   private void a(ok.a $$0, dfa... $$1) {
      for (dfa $$2 : $$1) {
         alf $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ok.a $$0, dfa... $$1) {
      for (dfa $$2 : $$1) {
         alf $$3 = $$0.create($$2, this.c);
         this.b.accept(nx.a($$2, oa.a().a(ob.c, $$3)).a(c()));
      }
   }

   private void h(dfa $$0, dfa $$1) {
      this.a($$0);
      oi $$2 = oi.b($$0, $$1);
      alf $$3 = oh.aI.a($$1, $$2, this.c);
      alf $$4 = oh.aJ.a($$1, $$2, this.c);
      alf $$5 = oh.aK.a($$1, $$2, this.c);
      alf $$6 = oh.aG.a($$1, $$2, this.c);
      alf $$7 = oh.aH.a($$1, $$2, this.c);
      cul $$8 = $$1.r();
      oh.bx.a(of.a($$8), oi.F($$0), this.c);
      this.b
         .accept(
            nw.a($$1)
               .a(oa.a().a(ob.c, $$3))
               .a(nv.a().a(dst.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dst.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dst.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.L, false), oa.a().a(ob.c, $$6))
               .a(nv.a().a(dst.M, false), oa.a().a(ob.c, $$7))
               .a(nv.a().a(dst.N, false), oa.a().a(ob.c, $$7).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.O, false), oa.a().a(ob.c, $$6).a(ob.b, ob.a.d))
         );
   }

   private void q(dfa $$0) {
      oi $$1 = oi.z($$0);
      alf $$2 = oh.aL.a($$0, $$1, this.c);
      alf $$3 = this.a($$0, "_conditional", oh.aL, $$1x -> $$1.c(oj.i, $$1x));
      this.b.accept(nx.a($$0).a(a(dst.c, $$3, $$2)).a(e()));
   }

   private void r(dfa $$0) {
      alf $$1 = ok.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oa> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oa.a().a(ob.c, of.a(dfc.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dfc.mZ);
      this.b
         .accept(
            nw.a(dfc.mZ)
               .a(nv.a().a(dst.aq, 0), this.a(0))
               .a(nv.a().a(dst.aq, 1), this.a(1))
               .a(nv.a().a(dst.bk, dsp.b), oa.a().a(ob.c, of.a(dfc.mZ, "_small_leaves")))
               .a(nv.a().a(dst.bk, dsp.c), oa.a().a(ob.c, of.a(dfc.mZ, "_large_leaves")))
         );
   }

   private ny n() {
      return ny.a(dst.P)
         .a(je.a, oa.a().a(ob.a, ob.a.c))
         .a(je.b, oa.a())
         .a(je.c, oa.a().a(ob.a, ob.a.b))
         .a(je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   private void o() {
      alf $$0 = oi.a(dfc.nU, "_top_open");
      this.b
         .accept(
            nx.a(dfc.nU)
               .a(this.n())
               .a(
                  ny.a(dst.u)
                     .a(false, oa.a().a(ob.c, ok.f.create(dfc.nU, this.c)))
                     .a(true, oa.a().a(ob.c, ok.f.get(dfc.nU).a($$1 -> $$1.a(oj.f, $$0)).a(dfc.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ny a(dtg<T> $$0, T $$1, alf $$2, alf $$3) {
      oa $$4 = oa.a().a(ob.c, $$2);
      oa $$5 = oa.a().a(ob.c, $$3);
      return ny.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dfa $$0, Function<dfa, oi> $$1) {
      oi $$2 = $$1.apply($$0).b(oj.i, oj.c);
      oi $$3 = $$2.c(oj.g, oi.a($$0, "_front_honey"));
      alf $$4 = oh.q.a($$0, $$2, this.c);
      alf $$5 = oh.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nx.a($$0).a(b()).a(a(dst.aN, 5, $$5, $$4)));
   }

   private void a(dfa $$0, dtg<Integer> $$1, int... $$2) {
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
      alf $$0 = of.a(dfc.od, "_floor");
      alf $$1 = of.a(dfc.od, "_ceiling");
      alf $$2 = of.a(dfc.od, "_wall");
      alf $$3 = of.a(dfc.od, "_between_walls");
      this.a(cut.wo);
      this.b
         .accept(
            nx.a(dfc.od)
               .a(
                  ny.a(dst.R, dst.V)
                     .a(je.c, dsr.a, oa.a().a(ob.c, $$0))
                     .a(je.d, dsr.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.c))
                     .a(je.f, dsr.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.b))
                     .a(je.e, dsr.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.d))
                     .a(je.c, dsr.b, oa.a().a(ob.c, $$1))
                     .a(je.d, dsr.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.f, dsr.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.e, dsr.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
                     .a(je.c, dsr.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
                     .a(je.d, dsr.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
                     .a(je.f, dsr.c, oa.a().a(ob.c, $$2))
                     .a(je.e, dsr.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
                     .a(je.d, dsr.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(je.c, dsr.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
                     .a(je.f, dsr.d, oa.a().a(ob.c, $$3))
                     .a(je.e, dsr.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nx.a(dfc.nZ, oa.a().a(ob.c, of.a(dfc.nZ)))
               .a(
                  ny.a(dst.U, dst.R)
                     .a(dso.a, je.c, oa.a())
                     .a(dso.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dso.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dso.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dso.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dso.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dso.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dso.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
                     .a(dso.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dso.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dso.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dso.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               )
         );
   }

   private void d(dfa $$0, ok.a $$1) {
      alf $$2 = $$1.create($$0, this.c);
      alf $$3 = oi.a($$0, "_front_on");
      alf $$4 = $$1.get($$0).a($$1x -> $$1x.a(oj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nx.a($$0).a(a(dst.r, $$4, $$2)).a(b()));
   }

   private void a(dfa... $$0) {
      alf $$1 = of.a("campfire_off");

      for (dfa $$2 : $$0) {
         alf $$3 = oh.bc.a($$2, oi.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nx.a($$2).a(a(dst.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dfa $$0) {
      alf $$1 = oh.bt.a($$0, oi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dfa $$0) {
      alf $$1;
      if ($$0 == dfc.tj) {
         $$1 = oh.bv.a($$0, oi.m($$0), this.c);
      } else {
         $$1 = oh.bu.a($$0, oi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oi $$0 = oi.a(oi.G(dfc.cl), oi.G(dfc.n));
      alf $$1 = oh.j.a(dfc.cl, $$0, this.c);
      this.b.accept(c(dfc.cl, $$1));
   }

   private void s() {
      this.a(cut.lH);
      this.b
         .accept(
            nw.a(dfc.cw)
               .a(
                  nv.b(
                     nv.a().a(dst.ab, dti.c).a(dst.aa, dti.c).a(dst.ac, dti.c).a(dst.ad, dti.c),
                     nv.a().a(dst.ab, dti.b, dti.a).a(dst.aa, dti.b, dti.a),
                     nv.a().a(dst.aa, dti.b, dti.a).a(dst.ac, dti.b, dti.a),
                     nv.a().a(dst.ac, dti.b, dti.a).a(dst.ad, dti.b, dti.a),
                     nv.a().a(dst.ad, dti.b, dti.a).a(dst.ab, dti.b, dti.a)
                  ),
                  oa.a().a(ob.c, of.a("redstone_dust_dot"))
               )
               .a(nv.a().a(dst.ab, dti.b, dti.a), oa.a().a(ob.c, of.a("redstone_dust_side0")))
               .a(nv.a().a(dst.ac, dti.b, dti.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt0")))
               .a(nv.a().a(dst.aa, dti.b, dti.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dst.ad, dti.b, dti.a), oa.a().a(ob.c, of.a("redstone_dust_side1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dst.ab, dti.a), oa.a().a(ob.c, of.a("redstone_dust_up")))
               .a(nv.a().a(dst.aa, dti.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.ac, dti.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.c))
               .a(nv.a().a(dst.ad, dti.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.d))
         );
   }

   private void t() {
      this.a(cut.lL);
      this.b
         .accept(
            nx.a(dfc.gY)
               .a(c())
               .a(
                  ny.a(dst.bd, dst.w)
                     .a(dsw.a, false, oa.a().a(ob.c, of.a(dfc.gY)))
                     .a(dsw.a, true, oa.a().a(ob.c, of.a(dfc.gY, "_on")))
                     .a(dsw.b, false, oa.a().a(ob.c, of.a(dfc.gY, "_subtract")))
                     .a(dsw.b, true, oa.a().a(ob.c, of.a(dfc.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oi $$0 = oi.a(dfc.jR);
      oi $$1 = oi.a(oi.a(dfc.jE, "_side"), $$0.a(oj.f));
      alf $$2 = oh.ab.a(dfc.jE, $$1, this.c);
      alf $$3 = oh.ac.a(dfc.jE, $$1, this.c);
      alf $$4 = oh.j.b(dfc.jE, "_double", $$1, this.c);
      this.b.accept(e(dfc.jE, $$2, $$3, $$4));
      this.b.accept(c(dfc.jR, oh.c.a(dfc.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cut.sq);
      this.b
         .accept(
            nw.a(dfc.fs)
               .a(oa.a().a(ob.c, oi.G(dfc.fs)))
               .a(nv.a().a(dst.k, true), oa.a().a(ob.c, oi.a(dfc.fs, "_bottle0")))
               .a(nv.a().a(dst.l, true), oa.a().a(ob.c, oi.a(dfc.fs, "_bottle1")))
               .a(nv.a().a(dst.m, true), oa.a().a(ob.c, oi.a(dfc.fs, "_bottle2")))
               .a(nv.a().a(dst.k, false), oa.a().a(ob.c, oi.a(dfc.fs, "_empty0")))
               .a(nv.a().a(dst.l, false), oa.a().a(ob.c, oi.a(dfc.fs, "_empty1")))
               .a(nv.a().a(dst.m, false), oa.a().a(ob.c, oi.a(dfc.fs, "_empty2")))
         );
   }

   private void u(dfa $$0) {
      alf $$1 = oh.bp.a($$0, oi.b($$0), this.c);
      alf $$2 = of.a("mushroom_block_inside");
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dst.L, true), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dst.M, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dst.N, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dst.O, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dst.J, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dst.K, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dst.L, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dst.M, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, false))
               .a(nv.a().a(dst.N, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, false))
               .a(nv.a().a(dst.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dst.J, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dst.K, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, false))
         );
      this.a($$0, ok.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cut.rB);
      this.b
         .accept(
            nx.a(dfc.eg)
               .a(
                  ny.a(dst.ay)
                     .a(0, oa.a().a(ob.c, of.a(dfc.eg)))
                     .a(1, oa.a().a(ob.c, of.a(dfc.eg, "_slice1")))
                     .a(2, oa.a().a(ob.c, of.a(dfc.eg, "_slice2")))
                     .a(3, oa.a().a(ob.c, of.a(dfc.eg, "_slice3")))
                     .a(4, oa.a().a(ob.c, of.a(dfc.eg, "_slice4")))
                     .a(5, oa.a().a(ob.c, of.a(dfc.eg, "_slice5")))
                     .a(6, oa.a().a(ob.c, of.a(dfc.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dfc.nX, "_side3"))
         .a(oj.o, oi.G(dfc.t))
         .a(oj.n, oi.a(dfc.nX, "_top"))
         .a(oj.j, oi.a(dfc.nX, "_side3"))
         .a(oj.l, oi.a(dfc.nX, "_side3"))
         .a(oj.k, oi.a(dfc.nX, "_side1"))
         .a(oj.m, oi.a(dfc.nX, "_side2"));
      this.b.accept(c(dfc.nX, oh.a.a(dfc.nX, $$0, this.c)));
   }

   private void y() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dfc.ob, "_front"))
         .a(oj.o, oi.a(dfc.ob, "_bottom"))
         .a(oj.n, oi.a(dfc.ob, "_top"))
         .a(oj.j, oi.a(dfc.ob, "_front"))
         .a(oj.k, oi.a(dfc.ob, "_front"))
         .a(oj.l, oi.a(dfc.ob, "_side"))
         .a(oj.m, oi.a(dfc.ob, "_side"));
      this.b.accept(c(dfc.ob, oh.a.a(dfc.ob, $$0, this.c)));
   }

   private void a(dfa $$0, dfa $$1, BiFunction<dfa, dfa, oi> $$2) {
      oi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oh.a.a($$0, $$3, this.c)));
   }

   public void b(dfa $$0) {
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
      oi $$0 = oi.k(dfc.eZ);
      this.b.accept(c(dfc.eZ, of.a(dfc.eZ)));
      this.a(dfc.ee, $$0);
      this.a(dfc.ef, $$0);
   }

   private void a(dfa $$0, oi $$1) {
      alf $$2 = oh.p.a($$0, $$1.c(oj.g, oi.G($$0)), this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cut.sr);
      this.m(dfc.ft);
      this.b.accept(c(dfc.fv, oh.bs.a(dfc.fv, oi.j(oi.a(dfc.H, "_still")), this.c)));
      this.b
         .accept(
            nx.a(dfc.fu)
               .a(
                  ny.a(djj.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dfc.fu, "_level1", oi.j(oi.a(dfc.G, "_still")), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dfc.fu, "_level2", oi.j(oi.a(dfc.G, "_still")), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dfc.fu, "_full", oi.j(oi.a(dfc.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nx.a(dfc.fw)
               .a(
                  ny.a(djj.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dfc.fw, "_level1", oi.j(oi.G(dfc.qP)), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dfc.fw, "_level2", oi.j(oi.G(dfc.qP)), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dfc.fw, "_full", oi.j(oi.G(dfc.qP)), this.c)))
               )
         );
   }

   private void B() {
      oi $$0 = oi.b(dfc.kv);
      alf $$1 = oh.aE.a(dfc.kv, $$0, this.c);
      alf $$2 = this.a(dfc.kv, "_dead", oh.aE, $$1x -> $$0.c(oj.b, $$1x));
      this.b.accept(nx.a(dfc.kv).a(a(dst.au, 5, $$2, $$1)));
   }

   private void C() {
      alf $$0 = of.a(dfc.tq);
      alf $$1 = of.a(dfc.tq, "_triggered");
      alf $$2 = of.a(dfc.tq, "_crafting");
      alf $$3 = of.a(dfc.tq, "_crafting_triggered");
      this.b
         .accept(
            nx.a(dfc.tq)
               .a(ny.a(dst.T).a($$0x -> this.a($$0x, oa.a())))
               .a(
                  ny.a(dst.A, dgt.b)
                     .a(false, false, oa.a().a(ob.c, $$0))
                     .a(true, true, oa.a().a(ob.c, $$3))
                     .a(true, false, oa.a().a(ob.c, $$1))
                     .a(false, true, oa.a().a(ob.c, $$2))
               )
         );
   }

   private void v(dfa $$0) {
      oi $$1 = new oi().a(oj.f, oi.a(dfc.cD, "_top")).a(oj.i, oi.a(dfc.cD, "_side")).a(oj.g, oi.a($$0, "_front"));
      oi $$2 = new oi().a(oj.i, oi.a(dfc.cD, "_top")).a(oj.g, oi.a($$0, "_front_vertical"));
      alf $$3 = oh.p.a($$0, $$1, this.c);
      alf $$4 = oh.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dst.P)
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
      alf $$0 = of.a(dfc.fy);
      alf $$1 = of.a(dfc.fy, "_filled");
      this.b.accept(nx.a(dfc.fy).a(ny.a(dst.h).a(false, oa.a().a(ob.c, $$0)).a(true, oa.a().a(ob.c, $$1))).a(c()));
   }

   private void E() {
      alf $$0 = of.a(dfc.ku, "_side");
      alf $$1 = of.a(dfc.ku, "_noside");
      alf $$2 = of.a(dfc.ku, "_noside1");
      alf $$3 = of.a(dfc.ku, "_noside2");
      alf $$4 = of.a(dfc.ku, "_noside3");
      this.b
         .accept(
            nw.a(dfc.ku)
               .a(nv.a().a(dst.L, true), oa.a().a(ob.c, $$0))
               .a(nv.a().a(dst.M, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dst.N, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dst.O, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dst.J, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dst.K, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dst.L, false), oa.a().a(ob.c, $$1).a(ob.e, 2), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$3), oa.a().a(ob.c, $$4))
               .a(
                  nv.a().a(dst.M, false),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.b).a(ob.d, true)
               )
               .a(
                  nv.a().a(dst.N, false),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true)
               )
               .a(
                  nv.a().a(dst.O, false),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dst.J, false),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dst.K, false),
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
            nw.a(dfc.pc)
               .a(oa.a().a(ob.c, oi.G(dfc.pc)))
               .a(nv.a().a(dst.aL, 1), oa.a().a(ob.c, oi.a(dfc.pc, "_contents1")))
               .a(nv.a().a(dst.aL, 2), oa.a().a(ob.c, oi.a(dfc.pc, "_contents2")))
               .a(nv.a().a(dst.aL, 3), oa.a().a(ob.c, oi.a(dfc.pc, "_contents3")))
               .a(nv.a().a(dst.aL, 4), oa.a().a(ob.c, oi.a(dfc.pc, "_contents4")))
               .a(nv.a().a(dst.aL, 5), oa.a().a(ob.c, oi.a(dfc.pc, "_contents5")))
               .a(nv.a().a(dst.aL, 6), oa.a().a(ob.c, oi.a(dfc.pc, "_contents6")))
               .a(nv.a().a(dst.aL, 7), oa.a().a(ob.c, oi.a(dfc.pc, "_contents7")))
               .a(nv.a().a(dst.aL, 8), oa.a().a(ob.c, oi.a(dfc.pc, "_contents_ready")))
         );
   }

   private void w(dfa $$0) {
      alf $$1 = oh.c.a($$0, oi.a($$0), this.c);
      alf $$2 = this.a($$0, "_powered", oh.c, oi::b);
      alf $$3 = this.a($$0, "_lit", oh.c, oi::b);
      alf $$4 = this.a($$0, "_lit_powered", oh.c, oi::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nu a(dfa $$0, alf $$1, alf $$2, alf $$3, alf $$4) {
      return nx.a($$0).a(ny.a(dst.r, dst.w).a(($$4x, $$5) -> $$4x ? oa.a().a(ob.c, $$5 ? $$4 : $$2) : oa.a().a(ob.c, $$5 ? $$3 : $$1)));
   }

   private void i(dfa $$0, dfa $$1) {
      alf $$2 = of.a($$0);
      alf $$3 = of.a($$0, "_powered");
      alf $$4 = of.a($$0, "_lit");
      alf $$5 = of.a($$0, "_lit_powered");
      this.a($$1, of.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dfa $$0) {
      this.c($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, oh.ao.a($$0, oi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dfc.qy);
      this.x(dfc.qx);
      this.x(dfc.qw);
      this.x(dfc.qv);
   }

   private void H() {
      this.c(dfc.st);
      ny.b<je, dta> $$0 = ny.a(dst.bm, dst.bn);

      for (dta $$1 : dta.values()) {
         $$0.a(je.b, $$1, this.a(je.b, $$1));
      }

      for (dta $$2 : dta.values()) {
         $$0.a(je.a, $$2, this.a(je.a, $$2));
      }

      this.b.accept(nx.a(dfc.st).a($$0));
   }

   private oa a(je $$0, dta $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oi $$3 = oi.c(oi.a(dfc.st, $$2));
      return oa.a().a(ob.c, oh.an.a(dfc.st, $$2, $$3, this.c));
   }

   private void y(dfa $$0) {
      oi $$1 = new oi().a(oj.e, oi.G(dfc.dV)).a(oj.f, oi.G($$0)).a(oj.i, oi.a($$0, "_side"));
      this.b.accept(c($$0, oh.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alf $$0 = oi.a(dfc.gZ, "_side");
      oi $$1 = new oi().a(oj.f, oi.a(dfc.gZ, "_top")).a(oj.i, $$0);
      oi $$2 = new oi().a(oj.f, oi.a(dfc.gZ, "_inverted_top")).a(oj.i, $$0);
      this.b
         .accept(
            nx.a(dfc.gZ)
               .a(ny.a(dst.p).a(false, oa.a().a(ob.c, oh.aF.a(dfc.gZ, $$1, this.c))).a(true, oa.a().a(ob.c, oh.aF.a(of.a(dfc.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dfa $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()));
   }

   private void J() {
      dfa $$0 = dfc.ss;
      alf $$1 = of.a($$0, "_on");
      alf $$2 = of.a($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()).a(a(dst.w, $$1, $$2)));
   }

   private void K() {
      oi $$0 = new oi().a(oj.B, oi.G(dfc.j)).a(oj.f, oi.G(dfc.cC));
      oi $$1 = new oi().a(oj.B, oi.G(dfc.j)).a(oj.f, oi.a(dfc.cC, "_moist"));
      alf $$2 = oh.aW.a(dfc.cC, $$0, this.c);
      alf $$3 = oh.aW.a(oi.a(dfc.cC, "_moist"), $$1, this.c);
      this.b.accept(nx.a(dfc.cC).a(a(dst.aQ, 7, $$3, $$2)));
   }

   private List<alf> A(dfa $$0) {
      alf $$1 = oh.aX.a(of.a($$0, "_floor0"), oi.v($$0), this.c);
      alf $$2 = oh.aX.a(of.a($$0, "_floor1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alf> B(dfa $$0) {
      alf $$1 = oh.aY.a(of.a($$0, "_side0"), oi.v($$0), this.c);
      alf $$2 = oh.aY.a(of.a($$0, "_side1"), oi.w($$0), this.c);
      alf $$3 = oh.aZ.a(of.a($$0, "_side_alt0"), oi.v($$0), this.c);
      alf $$4 = oh.aZ.a(of.a($$0, "_side_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alf> C(dfa $$0) {
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
      nv $$0 = nv.a().a(dst.L, false).a(dst.M, false).a(dst.N, false).a(dst.O, false).a(dst.J, false);
      List<alf> $$1 = this.A(dfc.cr);
      List<alf> $$2 = this.B(dfc.cr);
      List<alf> $$3 = this.C(dfc.cr);
      this.b
         .accept(
            nw.a(dfc.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dst.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dst.M, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(nv.b(nv.a().a(dst.N, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(nv.b(nv.a().a(dst.O, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.d)))
               .a(nv.a().a(dst.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alf> $$0 = this.A(dfc.cs);
      List<alf> $$1 = this.B(dfc.cs);
      this.b
         .accept(
            nw.a(dfc.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.d)))
         );
   }

   private void D(dfa $$0) {
      alf $$1 = ok.t.create($$0, this.c);
      alf $$2 = ok.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nx.a($$0).a(a(dst.j, $$2, $$1)));
   }

   private void N() {
      oi $$0 = oi.a(oi.a(dfc.ad, "_side"), oi.a(dfc.ad, "_top"));
      alf $$1 = oh.j.a(dfc.ad, $$0, this.c);
      this.b.accept(d(dfc.ad, $$1));
   }

   private void O() {
      this.a(cut.ad);
      dfa $$0 = dfc.E;
      ny.b<Boolean, Integer> $$1 = ny.a(djv.d, djv.b);
      alf $$2 = of.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alf $$4 = of.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oa.a().a(ob.c, $$4));
         $$1.a(false, $$3, oa.a().a(ob.c, $$2));
      }

      this.b.accept(nx.a(dfc.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nx.a(dfc.kI)
               .a(
                  ny.a(dst.as)
                     .a(0, oa.a().a(ob.c, this.a(dfc.kI, "_0", oh.c, oi::b)))
                     .a(1, oa.a().a(ob.c, this.a(dfc.kI, "_1", oh.c, oi::b)))
                     .a(2, oa.a().a(ob.c, this.a(dfc.kI, "_2", oh.c, oi::b)))
                     .a(3, oa.a().a(ob.c, this.a(dfc.kI, "_3", oh.c, oi::b)))
               )
         );
   }

   private void Q() {
      alf $$0 = oi.G(dfc.j);
      oi $$1 = new oi().a(oj.e, $$0).b(oj.e, oj.c).a(oj.f, oi.a(dfc.i, "_top")).a(oj.i, oi.a(dfc.i, "_snow"));
      oa $$2 = oa.a().a(ob.c, oh.n.a(dfc.i, "_snow", $$1, this.c));
      this.a(dfc.i, of.a(dfc.i), $$2);
      alf $$3 = ok.f.get(dfc.fl).a($$1x -> $$1x.a(oj.e, $$0)).a(dfc.fl, this.c);
      this.a(dfc.fl, $$3, $$2);
      alf $$4 = ok.f.get(dfc.l).a($$1x -> $$1x.a(oj.e, $$0)).a(dfc.l, this.c);
      this.a(dfc.l, $$4, $$2);
   }

   private void a(dfa $$0, alf $$1, oa $$2) {
      List<oa> $$3 = Arrays.asList(a($$1));
      this.b.accept(nx.a($$0).a(ny.a(dst.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cut.rh);
      this.b
         .accept(
            nx.a(dfc.fC)
               .a(
                  ny.a(dst.ar)
                     .a(0, oa.a().a(ob.c, of.a(dfc.fC, "_stage0")))
                     .a(1, oa.a().a(ob.c, of.a(dfc.fC, "_stage1")))
                     .a(2, oa.a().a(ob.c, of.a(dfc.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dfc.kE, of.a(dfc.kE)));
   }

   private void j(dfa $$0, dfa $$1) {
      oi $$2 = oi.b($$1);
      alf $$3 = oh.Y.a($$0, $$2, this.c);
      alf $$4 = oh.Z.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dst.aT, 1, $$4, $$3)));
   }

   private void T() {
      alf $$0 = of.a(dfc.hc);
      alf $$1 = of.a(dfc.hc, "_side");
      this.a(cut.lR);
      this.b
         .accept(
            nx.a(dfc.hc)
               .a(
                  ny.a(dst.Q)
                     .a(je.a, oa.a().a(ob.c, $$0))
                     .a(je.c, oa.a().a(ob.c, $$1))
                     .a(je.f, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.d, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.e, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               )
         );
   }

   private void k(dfa $$0, dfa $$1) {
      alf $$2 = of.a($$0);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alf $$0 = of.a(dfc.eW, "_post_ends");
      alf $$1 = of.a(dfc.eW, "_post");
      alf $$2 = of.a(dfc.eW, "_cap");
      alf $$3 = of.a(dfc.eW, "_cap_alt");
      alf $$4 = of.a(dfc.eW, "_side");
      alf $$5 = of.a(dfc.eW, "_side_alt");
      this.b
         .accept(
            nw.a(dfc.eW)
               .a(oa.a().a(ob.c, $$0))
               .a(nv.a().a(dst.L, false).a(dst.M, false).a(dst.N, false).a(dst.O, false), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dst.L, true).a(dst.M, false).a(dst.N, false).a(dst.O, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dst.L, false).a(dst.M, true).a(dst.N, false).a(dst.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.L, false).a(dst.M, false).a(dst.N, true).a(dst.O, false), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dst.L, false).a(dst.M, false).a(dst.N, false).a(dst.O, true), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dst.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dst.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dst.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         );
      this.d(dfc.eW);
   }

   private void E(dfa $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(b()));
   }

   private void V() {
      alf $$0 = of.a(dfc.dw);
      alf $$1 = of.a(dfc.dw, "_on");
      this.d(dfc.dw);
      this.b
         .accept(
            nx.a(dfc.dw)
               .a(a(dst.w, $$0, $$1))
               .a(
                  ny.a(dst.U, dst.R)
                     .a(dso.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dso.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
                     .a(dso.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dso.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dso.a, je.c, oa.a())
                     .a(dso.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dso.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dso.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dso.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dso.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dso.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dso.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
               )
         );
   }

   private void W() {
      this.d(dfc.fm);
      this.b.accept(b(dfc.fm, of.a(dfc.fm)));
   }

   private void X() {
      this.d(dfc.tn);
      this.b.accept(c(dfc.tn, of.a(dfc.tn)));
   }

   private void Y() {
      this.b.accept(nx.a(dfc.ed).a(ny.a(dst.H).a(je.a.a, oa.a().a(ob.c, of.a(dfc.ed, "_ns"))).a(je.a.c, oa.a().a(ob.c, of.a(dfc.ed, "_ew")))));
   }

   private void Z() {
      alf $$0 = ok.a.create(dfc.dV, this.c);
      this.b
         .accept(
            nx.a(
               dfc.dV,
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
      alf $$0 = of.a(dfc.kO);
      alf $$1 = of.a(dfc.kO, "_on");
      this.b.accept(nx.a(dfc.kO).a(a(dst.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oi $$0 = new oi().a(oj.e, oi.a(dfc.by, "_bottom")).a(oj.i, oi.a(dfc.by, "_side"));
      alf $$1 = oi.a(dfc.by, "_top_sticky");
      alf $$2 = oi.a(dfc.by, "_top");
      oi $$3 = $$0.c(oj.E, $$1);
      oi $$4 = $$0.c(oj.E, $$2);
      alf $$5 = of.a(dfc.by, "_base");
      this.a(dfc.by, $$5, $$4);
      this.a(dfc.br, $$5, $$3);
      alf $$6 = oh.n.a(dfc.by, "_inventory", $$0.c(oj.f, $$2), this.c);
      alf $$7 = oh.n.a(dfc.br, "_inventory", $$0.c(oj.f, $$1), this.c);
      this.a(dfc.by, $$6);
      this.a(dfc.br, $$7);
   }

   private void a(dfa $$0, alf $$1, oi $$2) {
      alf $$3 = oh.bh.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dst.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oi $$0 = new oi().a(oj.F, oi.a(dfc.by, "_top")).a(oj.i, oi.a(dfc.by, "_side"));
      oi $$1 = $$0.c(oj.E, oi.a(dfc.by, "_top_sticky"));
      oi $$2 = $$0.c(oj.E, oi.a(dfc.by, "_top"));
      this.b
         .accept(
            nx.a(dfc.bz)
               .a(
                  ny.a(dst.x, dst.bg)
                     .a(false, dtf.a, oa.a().a(ob.c, oh.bi.a(dfc.by, "_head", $$2, this.c)))
                     .a(false, dtf.b, oa.a().a(ob.c, oh.bi.a(dfc.by, "_head_sticky", $$1, this.c)))
                     .a(true, dtf.a, oa.a().a(ob.c, oh.bj.a(dfc.by, "_head_short", $$2, this.c)))
                     .a(true, dtf.b, oa.a().a(ob.c, oh.bj.a(dfc.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dfa $$0 = dfc.tr;
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
      this.b.accept(nx.a($$0).a(ny.a(dst.by, dst.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oa.a().a(ob.c, $$7x ? $$10 : $$7);
            case b, c, d -> oa.a().a(ob.c, $$7x ? $$11 : $$8);
            case e -> oa.a().a(ob.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dfa $$0 = dfc.ts;
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
      this.b.accept(nx.a($$0).a(b()).a(ny.a(dnv.b, dnv.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oa.a().a(ob.c, $$9x ? $$13 : $$5);
            case b -> oa.a().a(ob.c, $$9x ? $$14 : $$6);
            case c -> oa.a().a(ob.c, $$9x ? $$15 : $$7);
            case d -> oa.a().a(ob.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alf $$0 = of.a(dfc.qQ, "_inactive");
      alf $$1 = of.a(dfc.qQ, "_active");
      this.a(dfc.qQ, $$0);
      this.b.accept(nx.a(dfc.qQ).a(ny.a(dst.bo).a($$2 -> oa.a().a(ob.c, $$2 != dtk.b && $$2 != dtk.c ? $$0 : $$1))));
   }

   private void ag() {
      alf $$0 = of.a(dfc.qR, "_inactive");
      alf $$1 = of.a(dfc.qR, "_active");
      this.a(dfc.qR, $$0);
      this.b.accept(nx.a(dfc.qR).a(ny.a(dst.bo).a($$2 -> oa.a().a(ob.c, $$2 != dtk.b && $$2 != dtk.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alf $$0 = oh.bM.a(dfc.qV, oi.a(false), this.c);
      alf $$1 = oh.bM.a(dfc.qV, "_can_summon", oi.a(true), this.c);
      this.a(dfc.qV, $$0);
      this.b.accept(nx.a(dfc.qV).a(a(dst.G, $$1, $$0)));
   }

   private void ai() {
      alf $$0 = of.a(dfc.nS, "_stable");
      alf $$1 = of.a(dfc.nS, "_unstable");
      this.a(dfc.nS, $$0);
      this.b.accept(nx.a(dfc.nS).a(a(dst.b, $$1, $$0)));
   }

   private void aj() {
      alf $$0 = this.a(dfc.sv, "", oh.ao, oi::c);
      alf $$1 = this.a(dfc.sv, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dfc.sv).a(a(dst.D, $$1, $$0)));
      alf $$2 = this.a(dfc.sw, "", oh.ao, oi::c);
      alf $$3 = this.a(dfc.sw, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dfc.sw).a(a(dst.D, $$3, $$2)));
   }

   private void ak() {
      alf $$0 = ok.a.create(dfc.fB, this.c);
      alf $$1 = this.a(dfc.fB, "_on", oh.c, oi::b);
      this.b.accept(nx.a(dfc.fB).a(a(dst.r, $$1, $$0)));
   }

   private void l(dfa $$0, dfa $$1) {
      oi $$2 = oi.y($$0);
      this.b.accept(c($$0, oh.bf.a($$0, $$2, this.c)));
      this.b.accept(nx.a($$1, oa.a().a(ob.c, oh.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oi $$0 = oi.y(dfc.dK);
      oi $$1 = oi.i(oi.a(dfc.dK, "_off"));
      alf $$2 = oh.bf.a(dfc.dK, $$0, this.c);
      alf $$3 = oh.bf.a(dfc.dK, "_off", $$1, this.c);
      this.b.accept(nx.a(dfc.dK).a(a(dst.r, $$2, $$3)));
      alf $$4 = oh.bg.a(dfc.dL, $$0, this.c);
      alf $$5 = oh.bg.a(dfc.dL, "_off", $$1, this.c);
      this.b.accept(nx.a(dfc.dL).a(a(dst.r, $$4, $$5)).a(d()));
      this.d(dfc.dK);
      this.c(dfc.dL);
   }

   private void am() {
      this.a(cut.lK);
      this.b.accept(nx.a(dfc.eh).a(ny.a(dst.aA, dst.s, dst.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oa.a().a(ob.c, oi.a(dfc.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cut.cT);
      this.b
         .accept(
            nx.a(dfc.mV)
               .a(
                  ny.a(dst.aS, dst.C)
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
      oi $$0 = oi.a(dfc.dN);
      alf $$1 = oh.c.a(dfc.dP, $$0, this.c);
      this.b.accept(nx.a(dfc.dN).a(ny.a(dst.aF).a($$1x -> oa.a().a(ob.c, $$1x < 8 ? of.a(dfc.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dfc.dN, of.a(dfc.dN, "_height2"));
      this.b.accept(c(dfc.dP, $$1));
   }

   private void ap() {
      this.b.accept(nx.a(dfc.oc, oa.a().a(ob.c, of.a(dfc.oc))).a(b()));
   }

   private void aq() {
      alf $$0 = ok.a.create(dfc.pa, this.c);
      this.a(dfc.pa, $$0);
      this.b.accept(nx.a(dfc.pa).a(ny.a(dst.bj).a($$0x -> oa.a().a(ob.c, this.a(dfc.pa, "_" + $$0x.c(), oh.c, oi::b)))));
   }

   private void ar() {
      this.a(cut.wr);
      this.b.accept(nx.a(dfc.oi).a(ny.a(dst.as).a($$0 -> oa.a().a(ob.c, this.a(dfc.oi, "_stage" + $$0, oh.ao, oi::c)))));
   }

   private void as() {
      this.a(cut.ps);
      this.b
         .accept(
            nx.a(dfc.fI)
               .a(
                  ny.a(dst.a, dst.M, dst.L, dst.N, dst.O)
                     .a(false, false, false, false, false, oa.a().a(ob.c, of.a(dfc.fI, "_ns")))
                     .a(false, true, false, false, false, oa.a().a(ob.c, of.a(dfc.fI, "_n")).a(ob.b, ob.a.b))
                     .a(false, false, true, false, false, oa.a().a(ob.c, of.a(dfc.fI, "_n")))
                     .a(false, false, false, true, false, oa.a().a(ob.c, of.a(dfc.fI, "_n")).a(ob.b, ob.a.c))
                     .a(false, false, false, false, true, oa.a().a(ob.c, of.a(dfc.fI, "_n")).a(ob.b, ob.a.d))
                     .a(false, true, true, false, false, oa.a().a(ob.c, of.a(dfc.fI, "_ne")))
                     .a(false, true, false, true, false, oa.a().a(ob.c, of.a(dfc.fI, "_ne")).a(ob.b, ob.a.b))
                     .a(false, false, false, true, true, oa.a().a(ob.c, of.a(dfc.fI, "_ne")).a(ob.b, ob.a.c))
                     .a(false, false, true, false, true, oa.a().a(ob.c, of.a(dfc.fI, "_ne")).a(ob.b, ob.a.d))
                     .a(false, false, true, true, false, oa.a().a(ob.c, of.a(dfc.fI, "_ns")))
                     .a(false, true, false, false, true, oa.a().a(ob.c, of.a(dfc.fI, "_ns")).a(ob.b, ob.a.b))
                     .a(false, true, true, true, false, oa.a().a(ob.c, of.a(dfc.fI, "_nse")))
                     .a(false, true, false, true, true, oa.a().a(ob.c, of.a(dfc.fI, "_nse")).a(ob.b, ob.a.b))
                     .a(false, false, true, true, true, oa.a().a(ob.c, of.a(dfc.fI, "_nse")).a(ob.b, ob.a.c))
                     .a(false, true, true, false, true, oa.a().a(ob.c, of.a(dfc.fI, "_nse")).a(ob.b, ob.a.d))
                     .a(false, true, true, true, true, oa.a().a(ob.c, of.a(dfc.fI, "_nsew")))
                     .a(true, false, false, false, false, oa.a().a(ob.c, of.a(dfc.fI, "_attached_ns")))
                     .a(true, false, true, false, false, oa.a().a(ob.c, of.a(dfc.fI, "_attached_n")))
                     .a(true, false, false, true, false, oa.a().a(ob.c, of.a(dfc.fI, "_attached_n")).a(ob.b, ob.a.c))
                     .a(true, true, false, false, false, oa.a().a(ob.c, of.a(dfc.fI, "_attached_n")).a(ob.b, ob.a.b))
                     .a(true, false, false, false, true, oa.a().a(ob.c, of.a(dfc.fI, "_attached_n")).a(ob.b, ob.a.d))
                     .a(true, true, true, false, false, oa.a().a(ob.c, of.a(dfc.fI, "_attached_ne")))
                     .a(true, true, false, true, false, oa.a().a(ob.c, of.a(dfc.fI, "_attached_ne")).a(ob.b, ob.a.b))
                     .a(true, false, false, true, true, oa.a().a(ob.c, of.a(dfc.fI, "_attached_ne")).a(ob.b, ob.a.c))
                     .a(true, false, true, false, true, oa.a().a(ob.c, of.a(dfc.fI, "_attached_ne")).a(ob.b, ob.a.d))
                     .a(true, false, true, true, false, oa.a().a(ob.c, of.a(dfc.fI, "_attached_ns")))
                     .a(true, true, false, false, true, oa.a().a(ob.c, of.a(dfc.fI, "_attached_ns")).a(ob.b, ob.a.b))
                     .a(true, true, true, true, false, oa.a().a(ob.c, of.a(dfc.fI, "_attached_nse")))
                     .a(true, true, false, true, true, oa.a().a(ob.c, of.a(dfc.fI, "_attached_nse")).a(ob.b, ob.a.b))
                     .a(true, false, true, true, true, oa.a().a(ob.c, of.a(dfc.fI, "_attached_nse")).a(ob.b, ob.a.c))
                     .a(true, true, true, false, true, oa.a().a(ob.c, of.a(dfc.fI, "_attached_nse")).a(ob.b, ob.a.d))
                     .a(true, true, true, true, true, oa.a().a(ob.c, of.a(dfc.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dfc.fH);
      this.b.accept(nx.a(dfc.fH).a(ny.a(dst.a, dst.w).a(($$0, $$1) -> oa.a().a(ob.c, oi.a(dfc.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
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
            return this.a($$0.intValue(), "", oi.b(oi.G(dfc.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oi.b(oi.a(dfc.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oi.b(oi.a(dfc.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cut.kp);
      this.b.accept(nx.a(dfc.mf).a(ny.a(dst.aD, dst.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cut.kq);
      Function<Integer, alf> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oi $$2 = oi.a($$1);
         return oh.bw.a(dfc.mg, $$1, $$2, this.c);
      };
      this.b.accept(nx.a(dfc.mg).a(ny.a(dmi.c).a($$1 -> oa.a().a(ob.c, $$0.apply($$1)))));
   }

   private void F(dfa $$0) {
      this.d($$0);
      alf $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      nv.c $$3 = ac.a(nv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dsu, Function<alf, oa>> $$4 : a) {
         dsu $$5 = (dsu)$$4.getFirst();
         Function<alf, oa> $$6 = (Function<alf, oa>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(nv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      alf $$0 = oi.a(dfc.qU, "_bottom");
      oi $$1 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dfc.qU, "_top")).a(oj.i, oi.a(dfc.qU, "_side"));
      oi $$2 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dfc.qU, "_top_bloom")).a(oj.i, oi.a(dfc.qU, "_side_bloom"));
      alf $$3 = oh.n.a(dfc.qU, "", $$1, this.c);
      alf $$4 = oh.n.a(dfc.qU, "_bloom", $$2, this.c);
      this.b.accept(nx.a(dfc.qU).a(ny.a(dst.E).a($$2x -> oa.a().a(ob.c, $$2x ? $$4 : $$3))));
      this.a(cut.gj, $$3);
   }

   private void ax() {
      dfa $$0 = dfc.cm;
      alf $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      List.of(Pair.of(je.c, ob.a.a), Pair.of(je.f, ob.a.b), Pair.of(je.d, ob.a.c), Pair.of(je.e, ob.a.d)).forEach($$2x -> {
         je $$3 = (je)$$2x.getFirst();
         ob.a $$4 = (ob.a)$$2x.getSecond();
         nv.c $$5 = nv.a().a(dst.R, $$3);
         $$2.a($$5, oa.a().a(ob.c, $$1).a(ob.b, $$4).a(ob.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, of.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2) {
      List.of(Pair.of(dst.bp, oh.aM), Pair.of(dst.bq, oh.aN), Pair.of(dst.br, oh.aO), Pair.of(dst.bs, oh.aP), Pair.of(dst.bt, oh.aQ), Pair.of(dst.bu, oh.aR))
         .forEach($$3 -> {
            dsu $$4 = (dsu)$$3.getFirst();
            og $$5 = (og)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2, dsu $$3, og $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oi $$7 = new oi().a(oj.b, oi.a(dfc.cm, $$6));
      nr.d $$8 = new nr.d($$4, $$6);
      alf $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dfc.cm, $$6, $$7, this.c));
      $$0.a(nv.a($$1, nv.a().a($$3, $$5)), oa.a().a(ob.c, $$9).a(ob.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dfc.kJ, oh.c.a(dfc.kJ, oi.b(of.a("magma")), this.c)));
   }

   private void G(dfa $$0) {
      this.b($$0, ok.q);
      oh.bD.a(of.a($$0.r()), oi.u($$0), this.c);
   }

   private void b(dfa $$0, dfa $$1, nr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dfa $$0, dfa $$1) {
      oh.bE.a(of.a($$0.r()), oi.u($$1), this.c);
   }

   private void az() {
      alf $$0 = of.a(dfc.b);
      alf $$1 = of.a(dfc.b, "_mirrored");
      this.b.accept(a(dfc.eN, $$0, $$1));
      this.a(dfc.eN, $$0);
   }

   private void aA() {
      alf $$0 = of.a(dfc.sJ);
      alf $$1 = of.a(dfc.sJ, "_mirrored");
      this.b.accept(a(dfc.td, $$0, $$1).a(f()));
      this.a(dfc.td, $$0);
   }

   private void n(dfa $$0, dfa $$1) {
      this.a($$0, nr.e.b);
      oi $$2 = oi.d(oi.a($$0, "_pot"));
      alf $$3 = nr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alf $$0 = oi.a(dfc.pl, "_bottom");
      alf $$1 = oi.a(dfc.pl, "_top_off");
      alf $$2 = oi.a(dfc.pl, "_top");
      alf[] $$3 = new alf[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oi $$5 = new oi().a(oj.e, $$0).a(oj.f, $$4 == 0 ? $$1 : $$2).a(oj.i, oi.a(dfc.pl, "_side" + $$4));
         $$3[$$4] = oh.n.a(dfc.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nx.a(dfc.pl).a(ny.a(dst.aZ).a($$1x -> oa.a().a(ob.c, $$3[$$1x]))));
      this.a(cut.wP, $$3[0]);
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
      alf $$0 = oi.a(dfc.pb, "_top");
      alf $$1 = oi.a(dfc.pb, "_bottom");
      alf $$2 = oi.a(dfc.pb, "_side");
      alf $$3 = oi.a(dfc.pb, "_lock");
      oi $$4 = new oi().a(oj.o, $$2).a(oj.m, $$2).a(oj.l, $$2).a(oj.c, $$0).a(oj.j, $$0).a(oj.k, $$1).a(oj.n, $$3);
      alf $$5 = oh.b.a(dfc.pb, $$4, this.c);
      this.b.accept(nx.a(dfc.pb, oa.a().a(ob.c, $$5)).a(ny.a(dst.T).a($$0x -> this.a($$0x, oa.a()))));
   }

   private void aD() {
      dfa $$0 = dfc.n;
      alf $$1 = of.a($$0);
      ok $$2 = ok.a.get($$0);
      dfa $$3 = dfc.jH;
      alf $$4 = oh.ab.a($$3, $$2.b(), this.c);
      alf $$5 = oh.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ls.a().filter(lt::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dfc.rf).a(ls.w).a(dfc.rf, dfc.rD).a(dfc.rj, dfc.rn).a(ls.y);
      this.h(dfc.re).a(ls.A).a(dfc.re, dfc.rC).a(dfc.ri, dfc.rm).a(ls.C);
      this.h(dfc.rd).a(ls.E).a(dfc.rd, dfc.rB).a(dfc.rh, dfc.rl).a(ls.G);
      this.h(dfc.rc).a(ls.I).a(dfc.rc, dfc.rA).a(dfc.rg, dfc.rk).a(ls.K);
      this.w(dfc.sk);
      this.w(dfc.sl);
      this.w(dfc.sm);
      this.w(dfc.sn);
      this.i(dfc.sk, dfc.so);
      this.i(dfc.sl, dfc.sp);
      this.i(dfc.sm, dfc.sq);
      this.i(dfc.sn, dfc.sr);
      this.m(dfc.a);
      this.c(dfc.nc, dfc.a);
      this.c(dfc.nb, dfc.a);
      this.m(dfc.fO);
      this.m(dfc.dQ);
      this.c(dfc.nd, dfc.G);
      this.m(dfc.fA);
      this.m(dfc.me);
      this.m(dfc.fr);
      this.m(dfc.fR);
      this.a(cut.ue);
      this.m(dfc.pg);
      this.m(dfc.G);
      this.m(dfc.H);
      this.m(dfc.hV);
      this.a(cut.fS);
      this.o(dfc.pM, dfc.qd);
      this.o(dfc.pN, dfc.qe);
      this.o(dfc.pO, dfc.qf);
      this.o(dfc.pP, dfc.qg);
      this.o(dfc.pQ, dfc.qh);
      this.o(dfc.pR, dfc.qi);
      this.o(dfc.pS, dfc.qj);
      this.o(dfc.pT, dfc.qk);
      this.o(dfc.pU, dfc.ql);
      this.o(dfc.pV, dfc.qm);
      this.o(dfc.pW, dfc.qn);
      this.o(dfc.pX, dfc.qo);
      this.o(dfc.pY, dfc.qp);
      this.o(dfc.pZ, dfc.qq);
      this.o(dfc.qa, dfc.qr);
      this.o(dfc.qb, dfc.qs);
      this.o(dfc.pL, dfc.qc);
      this.m(dfc.na);
      this.m(dfc.gs);
      this.m(dfc.qP);
      this.m(dfc.sx);
      this.s(dfc.sy);
      this.s(dfc.sz);
      this.t(dfc.ti);
      this.t(dfc.tj);
      this.aj();
      this.g(dfc.sC, dfc.sA);
      this.p(dfc.sB);
      this.a(dfc.hW, cut.hB);
      this.a(cut.hB);
      this.aE();
      this.a(dfc.kN, cut.jb);
      this.a(cut.jb);
      this.f(dfc.bQ, oi.a(dfc.by, "_side"));
      this.a(dfc.R);
      this.a(dfc.S);
      this.a(dfc.iB);
      this.a(dfc.cx);
      this.a(dfc.cy);
      this.a(dfc.cz);
      this.a(dfc.fE);
      this.a(dfc.fF);
      this.a(dfc.fJ);
      this.a(dfc.N);
      this.a(dfc.T);
      this.a(dfc.O);
      this.a(dfc.ch);
      this.a(dfc.P);
      this.a(dfc.Q);
      this.a(dfc.ci);
      this.b(dfc.pj, ok.d);
      this.a(dfc.pi);
      this.a(dfc.aR);
      this.a(dfc.aS);
      this.a(dfc.aT);
      this.a(dfc.hb);
      this.a(dfc.dI);
      this.a(dfc.dJ);
      this.a(dfc.ha);
      this.a(dfc.pC);
      this.a(dfc.mW);
      this.a(dfc.dR);
      this.a(dfc.k);
      this.a(dfc.pk);
      this.a(dfc.fz);
      this.a(dfc.ec);
      this.a(dfc.L);
      this.a(dfc.ph);
      this.a(dfc.dO);
      this.b(dfc.dT, ok.g);
      this.b(dfc.pq, ok.d);
      this.b(dfc.fa, ok.d);
      this.m(dfc.ac);
      this.m(dfc.ga);
      this.a(dfc.kK);
      this.a(dfc.aY);
      this.a(dfc.iC);
      this.a(dfc.co);
      this.a(dfc.pK);
      this.a(dfc.ii);
      this.a(dfc.oy);
      this.a(dfc.dW);
      this.a(dfc.dX);
      this.b(dfc.ct, ok.b);
      this.a(dfc.aO);
      this.b(dfc.bw, ok.v);
      this.a(cut.cS);
      this.b(dfc.ck, ok.f);
      this.b(dfc.pd, ok.d);
      this.a(dfc.op);
      this.a(dfc.aP);
      this.a(dfc.qt);
      this.a(dfc.qu);
      this.a(dfc.qN);
      this.a(dfc.su);
      this.a(dfc.tf);
      this.a(dfc.tg);
      this.a(dfc.th);
      this.e(dfc.qS);
      this.m(dfc.tt);
      this.aD();
      this.a(dfc.ra);
      this.a(dfc.rb);
      this.a(dfc.qW);
      this.a(dfc.qX);
      this.a(dfc.qY);
      this.a(dfc.qZ);
      this.k(dfc.qW, dfc.rw);
      this.k(dfc.qX, dfc.ry);
      this.k(dfc.qY, dfc.rx);
      this.k(dfc.qZ, dfc.rz);
      this.i(dfc.rM);
      this.i(dfc.rN);
      this.i(dfc.rP);
      this.i(dfc.rO);
      this.a(dfc.rM, dfc.rQ);
      this.a(dfc.rN, dfc.rR);
      this.a(dfc.rP, dfc.rT);
      this.a(dfc.rO, dfc.rS);
      this.k(dfc.rU);
      this.k(dfc.rV);
      this.k(dfc.rX);
      this.k(dfc.rW);
      this.b(dfc.rU, dfc.rY);
      this.b(dfc.rV, dfc.rZ);
      this.b(dfc.rX, dfc.sb);
      this.b(dfc.rW, dfc.sa);
      this.a(dfc.sc);
      this.a(dfc.sd);
      this.a(dfc.se);
      this.a(dfc.sf);
      this.k(dfc.sc, dfc.sg);
      this.k(dfc.sd, dfc.sh);
      this.k(dfc.se, dfc.si);
      this.k(dfc.sf, dfc.sj);
      this.j(dfc.gW, dfc.ch);
      this.j(dfc.gX, dfc.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dfc.og, dfc.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dfc.kt);
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
      this.F(dfc.ff);
      this.F(dfc.fg);
      this.F(dfc.qT);
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
      this.E(dfc.cO);
      this.d(dfc.cO);
      this.E(dfc.oa);
      this.g();
      this.E(dfc.sE);
      this.l(dfc.cp, dfc.cq);
      this.l(dfc.ea, dfc.eb);
      this.a(dfc.cA, dfc.n, oi::c);
      this.a(dfc.nY, dfc.p, oi::d);
      this.y(dfc.ow);
      this.y(dfc.on);
      this.v(dfc.aU);
      this.v(dfc.hi);
      this.C();
      this.D(dfc.oe);
      this.D(dfc.of);
      this.e(dfc.eX, of.a(dfc.eX));
      this.a(dfc.dY, ok.d);
      this.a(dfc.dZ, ok.d);
      this.a(dfc.te);
      this.a(dfc.kM, ok.d);
      this.f(dfc.j);
      this.f(dfc.sH);
      this.f(dfc.I);
      this.g(dfc.J);
      this.g(dfc.M);
      this.f(dfc.K);
      this.e(dfc.F);
      this.b(dfc.to, ok.f);
      this.a(dfc.ij, ok.d, ok.e);
      this.a(dfc.kx, ok.w, ok.x);
      this.a(dfc.hf, ok.w, ok.x);
      this.a(dfc.tk, ok.d, ok.e);
      this.a(dfc.tl, ok.d, ok.e);
      this.a(dfc.tm, ok.d, ok.e);
      this.c(dfc.nT, ok.i);
      this.z();
      this.a(dfc.pe, oi::A);
      this.a(dfc.pf, oi::C);
      this.a(dfc.kD, dst.as, 0, 1, 2, 3);
      this.a(dfc.gt, dst.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfc.fq, dst.as, 0, 1, 1, 2);
      this.a(dfc.gu, dst.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfc.cB, dst.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dfc.kA, nr.e.b, dst.aq, 0, 1);
      this.i();
      this.h();
      this.a(of.a("decorated_pot"), dfc.iA).b(dfc.tp);
      this.a(of.a("banner"), dfc.n)
         .a(oh.bF, dfc.iJ, dfc.iK, dfc.iL, dfc.iM, dfc.iN, dfc.iO, dfc.iP, dfc.iQ, dfc.iR, dfc.iS, dfc.iT, dfc.iU, dfc.iV, dfc.iW, dfc.iX, dfc.iY)
         .b(dfc.iZ, dfc.ja, dfc.jb, dfc.jc, dfc.jd, dfc.je, dfc.jf, dfc.jg, dfc.jh, dfc.ji, dfc.jj, dfc.jk, dfc.jl, dfc.jm, dfc.jn, dfc.jo);
      this.a(of.a("bed"), dfc.n)
         .b(dfc.aZ, dfc.ba, dfc.bb, dfc.bc, dfc.bd, dfc.be, dfc.bf, dfc.bg, dfc.bh, dfc.bi, dfc.bj, dfc.bk, dfc.bl, dfc.bm, dfc.bn, dfc.bo);
      this.m(dfc.aZ, dfc.bA);
      this.m(dfc.ba, dfc.bB);
      this.m(dfc.bb, dfc.bC);
      this.m(dfc.bc, dfc.bD);
      this.m(dfc.bd, dfc.bE);
      this.m(dfc.be, dfc.bF);
      this.m(dfc.bf, dfc.bG);
      this.m(dfc.bg, dfc.bH);
      this.m(dfc.bh, dfc.bI);
      this.m(dfc.bi, dfc.bJ);
      this.m(dfc.bj, dfc.bK);
      this.m(dfc.bk, dfc.bL);
      this.m(dfc.bl, dfc.bM);
      this.m(dfc.bm, dfc.bN);
      this.m(dfc.bn, dfc.bO);
      this.m(dfc.bo, dfc.bP);
      this.a(of.a("skull"), dfc.dW)
         .a(oh.bG, dfc.gM, dfc.gK, dfc.gI, dfc.gE, dfc.gG, dfc.gQ)
         .a(dfc.gO)
         .b(dfc.gN, dfc.gP, dfc.gL, dfc.gJ, dfc.gF, dfc.gH, dfc.gR);
      this.G(dfc.kP);
      this.G(dfc.kQ);
      this.G(dfc.kR);
      this.G(dfc.kS);
      this.G(dfc.kT);
      this.G(dfc.kU);
      this.G(dfc.kV);
      this.G(dfc.kW);
      this.G(dfc.kX);
      this.G(dfc.kY);
      this.G(dfc.kZ);
      this.G(dfc.la);
      this.G(dfc.lb);
      this.G(dfc.lc);
      this.G(dfc.ld);
      this.G(dfc.le);
      this.G(dfc.lf);
      this.b(dfc.mX, ok.q);
      this.c(dfc.mX);
      this.a(of.a("chest"), dfc.n).b(dfc.cv, dfc.gV);
      this.a(of.a("ender_chest"), dfc.co).b(dfc.fG);
      this.f(dfc.fx, dfc.co).a(dfc.fx, dfc.kF);
      this.a(dfc.aM);
      this.a(dfc.aN);
      this.a(dfc.lw);
      this.a(dfc.lx);
      this.a(dfc.ly);
      this.a(dfc.lz);
      this.a(dfc.lA);
      this.a(dfc.lB);
      this.a(dfc.lC);
      this.a(dfc.lD);
      this.a(dfc.lE);
      this.a(dfc.lF);
      this.a(dfc.lG);
      this.a(dfc.lH);
      this.a(dfc.lI);
      this.a(dfc.lJ);
      this.a(dfc.lK);
      this.a(dfc.lL);
      this.a(ok.a, dfc.lM, dfc.lN, dfc.lO, dfc.lP, dfc.lQ, dfc.lR, dfc.lS, dfc.lT, dfc.lU, dfc.lV, dfc.lW, dfc.lX, dfc.lY, dfc.lZ, dfc.ma, dfc.mb);
      this.a(dfc.iA);
      this.a(dfc.hj);
      this.a(dfc.hk);
      this.a(dfc.hl);
      this.a(dfc.hm);
      this.a(dfc.hn);
      this.a(dfc.ho);
      this.a(dfc.hp);
      this.a(dfc.hq);
      this.a(dfc.hr);
      this.a(dfc.hs);
      this.a(dfc.ht);
      this.a(dfc.hu);
      this.a(dfc.hv);
      this.a(dfc.hw);
      this.a(dfc.hx);
      this.a(dfc.hy);
      this.a(dfc.qO);
      this.h(dfc.aQ, dfc.eY);
      this.h(dfc.ei, dfc.hz);
      this.h(dfc.ej, dfc.hA);
      this.h(dfc.ek, dfc.hB);
      this.h(dfc.el, dfc.hC);
      this.h(dfc.em, dfc.hD);
      this.h(dfc.en, dfc.hE);
      this.h(dfc.eo, dfc.hF);
      this.h(dfc.ep, dfc.hG);
      this.h(dfc.eq, dfc.hH);
      this.h(dfc.er, dfc.hI);
      this.h(dfc.es, dfc.hJ);
      this.h(dfc.et, dfc.hK);
      this.h(dfc.eu, dfc.hL);
      this.h(dfc.ev, dfc.hM);
      this.h(dfc.ew, dfc.hN);
      this.h(dfc.ex, dfc.hO);
      this.b(ok.o, dfc.lg, dfc.lh, dfc.li, dfc.lj, dfc.lk, dfc.ll, dfc.lm, dfc.ln, dfc.lo, dfc.lp, dfc.lq, dfc.lr, dfc.ls, dfc.lt, dfc.lu, dfc.lv);
      this.g(dfc.bA, dfc.ik);
      this.g(dfc.bB, dfc.il);
      this.g(dfc.bC, dfc.im);
      this.g(dfc.bD, dfc.in);
      this.g(dfc.bE, dfc.io);
      this.g(dfc.bF, dfc.ip);
      this.g(dfc.bG, dfc.iq);
      this.g(dfc.bH, dfc.ir);
      this.g(dfc.bI, dfc.is);
      this.g(dfc.bJ, dfc.it);
      this.g(dfc.bK, dfc.iu);
      this.g(dfc.bL, dfc.iv);
      this.g(dfc.bM, dfc.iw);
      this.g(dfc.bN, dfc.ix);
      this.g(dfc.bO, dfc.iy);
      this.g(dfc.bP, dfc.iz);
      this.a(dfc.sI);
      this.a(dfc.eL);
      this.a(dfc.bu, dfc.gb, nr.e.a);
      this.a(dfc.bR, dfc.gc, nr.e.b);
      this.a(dfc.bT, dfc.gd, nr.e.b);
      this.a(dfc.bU, dfc.ge, nr.e.b);
      this.a(dfc.bV, dfc.gf, nr.e.b);
      this.a(dfc.bW, dfc.gg, nr.e.b);
      this.a(dfc.bX, dfc.gh, nr.e.b);
      this.a(dfc.bY, dfc.gi, nr.e.b);
      this.a(dfc.bZ, dfc.gj, nr.e.b);
      this.a(dfc.ca, dfc.gk, nr.e.b);
      this.a(dfc.cb, dfc.gl, nr.e.b);
      this.a(dfc.cc, dfc.gm, nr.e.b);
      this.a(dfc.ce, dfc.gn, nr.e.b);
      this.a(dfc.cd, dfc.go, nr.e.b);
      this.a(dfc.cg, dfc.gp, nr.e.b);
      this.a(dfc.cf, dfc.gq, nr.e.b);
      this.a(dfc.bv, dfc.gr, nr.e.b);
      this.a(dfc.bS, dfc.fS, nr.e.b);
      this.H();
      this.u(dfc.eT);
      this.u(dfc.eU);
      this.u(dfc.eV);
      this.a(dfc.bt, nr.e.a);
      this.b(dfc.dS, nr.e.a);
      this.a(cut.dJ);
      this.b(dfc.mc, dfc.md, nr.e.b);
      this.a(cut.dK);
      this.c(dfc.md);
      this.b(dfc.sG, nr.e.b);
      this.c(dfc.sG);
      this.c(dfc.sw);
      this.b(dfc.oz, dfc.oA, nr.e.b);
      this.b(dfc.oB, dfc.oC, nr.e.b);
      this.a(dfc.oz, "_plant");
      this.c(dfc.oA);
      this.a(dfc.oB, "_plant");
      this.c(dfc.oC);
      this.a(dfc.mY, nr.e.a, oi.c(oi.a(dfc.mZ, "_stage0")));
      this.m();
      this.a(dfc.bs, nr.e.b);
      this.c(dfc.iE, nr.e.b);
      this.c(dfc.iF, nr.e.b);
      this.c(dfc.iG, nr.e.b);
      this.c(dfc.iH, nr.e.a);
      this.c(dfc.iI, nr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dfc.mw, dfc.mr, dfc.mm, dfc.mh, dfc.mG, dfc.mB, dfc.mQ, dfc.mL);
      this.a(dfc.mx, dfc.ms, dfc.mn, dfc.mi, dfc.mH, dfc.mC, dfc.mR, dfc.mM);
      this.a(dfc.my, dfc.mt, dfc.mo, dfc.mj, dfc.mI, dfc.mD, dfc.mS, dfc.mN);
      this.a(dfc.mz, dfc.mu, dfc.mp, dfc.mk, dfc.mJ, dfc.mE, dfc.mT, dfc.mO);
      this.a(dfc.mA, dfc.mv, dfc.mq, dfc.ml, dfc.mK, dfc.mF, dfc.mU, dfc.mP);
      this.e(dfc.fe, dfc.fc);
      this.e(dfc.fd, dfc.fb);
      this.l(dfc.ab).c(dfc.ab).a(dfc.av);
      this.l(dfc.am).c(dfc.am).a(dfc.aD);
      this.a(dfc.am, dfc.dj, dfc.ds);
      this.b(dfc.aL, ok.s);
      this.l(dfc.Y).c(dfc.Y).a(dfc.as);
      this.l(dfc.ai).c(dfc.ai).a(dfc.aA);
      this.a(dfc.ai, dfc.dd, dfc.do);
      this.a(dfc.B, dfc.fX, nr.e.b);
      this.b(dfc.aI, ok.s);
      this.l(dfc.Z).d(dfc.Z).a(dfc.at);
      this.l(dfc.aj).d(dfc.aj).a(dfc.aB);
      this.a(dfc.aj, dfc.de, dfc.dp);
      this.a(dfc.C, dfc.fY, nr.e.b);
      this.b(dfc.aJ, ok.s);
      this.l(dfc.W).c(dfc.W).a(dfc.aq);
      this.l(dfc.ag).c(dfc.ag).a(dfc.ay);
      this.a(dfc.ag, dfc.dc, dfc.dn);
      this.a(dfc.z, dfc.fV, nr.e.b);
      this.b(dfc.aG, ok.s);
      this.l(dfc.U).c(dfc.U).a(dfc.ao);
      this.l(dfc.al).c(dfc.al).a(dfc.aw);
      this.a(dfc.al, dfc.da, dfc.dl);
      this.a(dfc.x, dfc.fT, nr.e.b);
      this.b(dfc.aE, ok.s);
      this.l(dfc.V).c(dfc.V).a(dfc.ap);
      this.l(dfc.af).c(dfc.af).a(dfc.ax);
      this.a(dfc.af, dfc.db, dfc.dm);
      this.a(dfc.y, dfc.fU, nr.e.b);
      this.b(dfc.aF, ok.s);
      this.l(dfc.aa).c(dfc.aa).a(dfc.au);
      this.l(dfc.ak).c(dfc.ak).a(dfc.aC);
      this.a(dfc.ak, dfc.dg, dfc.dr);
      this.a(dfc.D, dfc.fZ, nr.e.b);
      this.b(dfc.aK, ok.s);
      this.l(dfc.X).c(dfc.X).a(dfc.ar);
      this.l(dfc.ah).c(dfc.ah).a(dfc.az);
      this.a(dfc.ah, dfc.df, dfc.dq);
      this.a(dfc.A, dfc.fW, nr.e.b);
      this.b(dfc.aH, ok.s);
      this.l(dfc.os).b(dfc.os).a(dfc.ou);
      this.l(dfc.ot).b(dfc.ot).a(dfc.ov);
      this.a(dfc.ot, dfc.dh, dfc.dt);
      this.a(dfc.ox, dfc.pm, nr.e.b);
      this.n(dfc.oD, dfc.po);
      this.l(dfc.oj).b(dfc.oj).a(dfc.ol);
      this.l(dfc.ok).b(dfc.ok).a(dfc.om);
      this.a(dfc.ok, dfc.di, dfc.du);
      this.a(dfc.oo, dfc.pn, nr.e.b);
      this.n(dfc.oq, dfc.pp);
      this.l(dfc.ae).d(dfc.ae);
      this.l(dfc.an).d(dfc.an);
      this.a(dfc.v, dfc.dk, dfc.dv);
      this.b(dfc.or, nr.e.b);
      this.a(cut.dG);
      this.i(dfc.dy);
      this.k(dfc.hY);
      this.u();
      this.n(dfc.cP);
      this.o(dfc.bp);
      this.o(dfc.bq);
      this.o(dfc.hh);
      this.t();
      this.q(dfc.fN);
      this.q(dfc.kG);
      this.q(dfc.kH);
      this.r(dfc.gS);
      this.r(dfc.gT);
      this.r(dfc.gU);
      this.o();
      this.p();
      this.d(dfc.cD, ok.h);
      this.d(dfc.nW, ok.h);
      this.d(dfc.nV, ok.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dfc.eK, dfc.eS);
      this.k(dfc.m, dfc.eO);
      this.k(dfc.eJ, dfc.eR);
      this.k(dfc.eI, dfc.eQ);
      this.az();
      this.k(dfc.eH, dfc.eP);
      this.aA();
      cvx.h().forEach($$0 -> this.a($$0, of.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dfc.hX);
      ny.a<Integer> $$0 = ny.a(dst.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alf $$3 = oi.a(cut.hC, $$2);
         $$0.a($$1, oa.a().a(ob.c, oh.aa.a(dfc.hX, $$2, oi.h($$3), this.c)));
         oh.bx.a(of.a(cut.hC, $$2), oi.k($$3), this.c);
      }

      this.b.accept(nx.a(dfc.hX).a($$0));
   }

   private void o(dfa $$0, dfa $$1) {
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
                  ny.a(dst.az, dst.r)
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
      this.b.accept(nx.a($$1).a(a(dst.r, $$13, $$12)));
   }

   class a {
      private final alf b;

      public a(final alf $$0, final dfa $$1) {
         this.b = oh.aa.a($$0, oi.u($$1), nr.this.c);
      }

      public nr.a a(dfa... $$0) {
         for (dfa $$1 : $$0) {
            nr.this.b.accept(nr.c($$1, this.b));
         }

         return this;
      }

      public nr.a b(dfa... $$0) {
         for (dfa $$1 : $$0) {
            nr.this.c($$1);
         }

         return this.a($$0);
      }

      public nr.a a(og $$0, dfa... $$1) {
         for (dfa $$2 : $$1) {
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
      private final Set<dfa> f = new HashSet<>();

      public b(final oi $$0) {
         this.b = $$0;
      }

      public nr.b a(dfa $$0, og $$1) {
         this.e = $$1.a($$0, this.b, nr.this.c);
         if (nr.this.f.containsKey($$0)) {
            nr.this.b.accept(nr.this.f.get($$0).create($$0, this.e, this.b, nr.this.c));
         } else {
            nr.this.b.accept(nr.c($$0, this.e));
         }

         return this;
      }

      public nr.b a(dfa $$0, dfa $$1) {
         alf $$2 = of.a($$0);
         nr.this.b.accept(nr.c($$1, $$2));
         nr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nr.b a(dfa $$0) {
         alf $$1 = oh.s.a($$0, this.b, nr.this.c);
         alf $$2 = oh.t.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.b($$0, $$1, $$2));
         alf $$3 = oh.u.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b b(dfa $$0) {
         alf $$1 = oh.M.a($$0, this.b, nr.this.c);
         alf $$2 = oh.N.a($$0, this.b, nr.this.c);
         alf $$3 = oh.O.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3));
         alf $$4 = oh.P.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$4);
         return this;
      }

      public nr.b c(dfa $$0) {
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

      public nr.b d(dfa $$0) {
         alf $$1 = oh.J.a($$0, this.b, nr.this.c);
         alf $$2 = oh.K.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$1, $$2));
         alf $$3 = oh.L.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b e(dfa $$0) {
         oi $$1 = oi.p($$0);
         alf $$2 = oh.R.a($$0, $$1, nr.this.c);
         alf $$3 = oh.Q.a($$0, $$1, nr.this.c);
         alf $$4 = oh.T.a($$0, $$1, nr.this.c);
         alf $$5 = oh.S.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nr.b f(dfa $$0) {
         alf $$1 = oh.V.a($$0, this.b, nr.this.c);
         alf $$2 = oh.U.a($$0, this.b, nr.this.c);
         alf $$3 = oh.X.a($$0, this.b, nr.this.c);
         alf $$4 = oh.W.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nr.b g(dfa $$0) {
         alf $$1 = oh.Y.a($$0, this.b, nr.this.c);
         alf $$2 = oh.Z.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.e($$0, $$1, $$2));
         return this;
      }

      public nr.b h(dfa $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dfa $$1 = this.d.b().get(lt.b.r);
            alf $$2 = oh.aa.a($$0, this.b, nr.this.c);
            nr.this.b.accept(nr.c($$0, $$2));
            nr.this.b.accept(nr.c($$1, $$2));
            nr.this.a($$0.r());
            nr.this.c($$1);
            return this;
         }
      }

      public nr.b i(dfa $$0) {
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

      public nr.b j(dfa $$0) {
         alf $$1 = this.a(oh.af, $$0);
         alf $$2 = this.a(oh.ae, $$0);
         alf $$3 = this.a(oh.ag, $$0);
         nr.this.b.accept(nr.b($$0, $$1, $$2, $$3));
         nr.this.a($$0, $$2);
         return this;
      }

      private nr.b k(dfa $$0) {
         ok $$1 = nr.this.g.getOrDefault($$0, ok.a.get($$0));
         alf $$2 = $$1.a($$0, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$2));
         return this;
      }

      private nr.b l(dfa $$0) {
         nr.this.i($$0);
         return this;
      }

      private void m(dfa $$0) {
         if (nr.this.e.contains($$0)) {
            nr.this.k($$0);
         } else {
            nr.this.j($$0);
         }
      }

      private alf a(og $$0, dfa $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nr.this.c));
      }

      public nr.b a(lt $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nr.b, dfa> $$2 = nr.h.get($$0x);
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
      nu create(dfa var1, alf var2, oi var3, BiConsumer<alf, Supplier<JsonElement>> var4);
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

      public nr.f a(dfa $$0) {
         oi $$1 = this.b.c(oj.d, this.b.a(oj.i));
         alf $$2 = oh.j.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$2));
         return this;
      }

      public nr.f b(dfa $$0) {
         alf $$1 = oh.j.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1));
         return this;
      }

      public nr.f c(dfa $$0) {
         alf $$1 = oh.j.a($$0, this.b, nr.this.c);
         alf $$2 = oh.k.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1, $$2));
         return this;
      }

      public nr.f d(dfa $$0) {
         nr.this.b.accept(nr.a($$0, this.b, nr.this.c));
         return this;
      }
   }
}
