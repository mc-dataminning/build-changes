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
   private final Consumer<cuk> d;
   final List<dez> e = ImmutableList.of(dfb.ey, dfb.eE, dfb.hY);
   final Map<dez, nr.c> f = ImmutableMap.builder().put(dfb.b, nr::a).put(dfb.sJ, nr::c).put(dfb.eM, nr::b).build();
   final Map<dez, ok> g = ImmutableMap.builder()
      .put(dfb.aV, ok.y.get(dfb.aV))
      .put(dfb.jp, ok.y.get(dfb.jp))
      .put(dfb.jS, ok.a(oi.a(dfb.aV, "_top")))
      .put(dfb.jU, ok.a(oi.a(dfb.jp, "_top")))
      .put(dfb.aX, ok.d.get(dfb.aV).a($$0x -> $$0x.a(oj.i, oi.G(dfb.aX))))
      .put(dfb.jr, ok.d.get(dfb.jp).a($$0x -> $$0x.a(oj.i, oi.G(dfb.jr))))
      .put(dfb.hd, ok.d.get(dfb.hd))
      .put(dfb.jT, ok.a(oi.a(dfb.hd, "_bottom")))
      .put(dfb.pr, ok.z.get(dfb.pr))
      .put(dfb.sJ, ok.z.get(dfb.sJ))
      .put(dfb.he, ok.d.get(dfb.he).a($$0x -> $$0x.a(oj.i, oi.G(dfb.he))))
      .put(dfb.aW, ok.d.get(dfb.aW).a($$0x -> {
         $$0x.a(oj.d, oi.a(dfb.aV, "_top"));
         $$0x.a(oj.i, oi.G(dfb.aW));
      }))
      .put(dfb.jq, ok.d.get(dfb.jq).a($$0x -> {
         $$0x.a(oj.d, oi.a(dfb.jp, "_top"));
         $$0x.a(oj.i, oi.G(dfb.jq));
      }))
      .put(dfb.qM, ok.z.get(dfb.qM))
      .put(dfb.qH, ok.z.get(dfb.qH))
      .build();
   static final Map<lt.b, BiConsumer<nr.b, dez>> h = ImmutableMap.builder()
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
   public static final List<Pair<dst, Function<alf, oa>>> a = List.of(
      Pair.of(dss.L, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0)),
      Pair.of(dss.M, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true)),
      Pair.of(dss.N, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true)),
      Pair.of(dss.O, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true)),
      Pair.of(dss.J, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true)),
      Pair.of(dss.K, (Function<alf, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
   );
   private static final Map<nr.d, alf> i = new HashMap<>();

   private static nu a(dez $$0, alf $$1, oi $$2, BiConsumer<alf, Supplier<JsonElement>> $$3) {
      alf $$4 = oh.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nu b(dez $$0, alf $$1, oi $$2, BiConsumer<alf, Supplier<JsonElement>> $$3) {
      alf $$4 = oh.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nu c(dez $$0, alf $$1, oi $$2, BiConsumer<alf, Supplier<JsonElement>> $$3) {
      alf $$4 = oh.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nr(Consumer<nu> $$0, BiConsumer<alf, Supplier<JsonElement>> $$1, Consumer<cuk> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dez $$0) {
      this.d.accept($$0.r());
   }

   void a(dez $$0, alf $$1) {
      this.c.accept(of.a($$0.r()), new oe($$1));
   }

   private void a(cuk $$0, alf $$1) {
      this.c.accept(of.a($$0), new oe($$1));
   }

   void a(cuk $$0) {
      oh.bx.a(of.a($$0), oi.b($$0), this.c);
   }

   private void d(dez $$0) {
      cuk $$1 = $$0.r();
      if ($$1 != cus.a) {
         oh.bx.a(of.a($$1), oi.F($$0), this.c);
      }
   }

   private void a(dez $$0, String $$1) {
      cuk $$2 = $$0.r();
      oh.bx.a(of.a($$2), oi.k(oi.a($$0, $$1)), this.c);
   }

   private static ny b() {
      return ny.a(dss.R).a(je.f, oa.a().a(ob.b, ob.a.b)).a(je.d, oa.a().a(ob.b, ob.a.c)).a(je.e, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a());
   }

   private static ny c() {
      return ny.a(dss.R).a(je.d, oa.a()).a(je.e, oa.a().a(ob.b, ob.a.b)).a(je.c, oa.a().a(ob.b, ob.a.c)).a(je.f, oa.a().a(ob.b, ob.a.d));
   }

   private static ny d() {
      return ny.a(dss.R).a(je.f, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.b)).a(je.e, oa.a().a(ob.b, ob.a.c)).a(je.c, oa.a().a(ob.b, ob.a.d));
   }

   private static ny e() {
      return ny.a(dss.P)
         .a(je.a, oa.a().a(ob.a, ob.a.b))
         .a(je.b, oa.a().a(ob.a, ob.a.d))
         .a(je.c, oa.a())
         .a(je.d, oa.a().a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.b, ob.a.b));
   }

   private static nx b(dez $$0, alf $$1) {
      return nx.a($$0, a($$1));
   }

   private static oa[] a(alf $$0) {
      return new oa[]{oa.a().a(ob.c, $$0), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d)};
   }

   private static nx a(dez $$0, alf $$1, alf $$2) {
      return nx.a($$0, oa.a().a(ob.c, $$1), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c));
   }

   private static ny a(dst $$0, alf $$1, alf $$2) {
      return ny.a($$0).a(true, oa.a().a(ob.c, $$1)).a(false, oa.a().a(ob.c, $$2));
   }

   private void e(dez $$0) {
      alf $$1 = ok.a.create($$0, this.c);
      alf $$2 = ok.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dez $$0) {
      alf $$1 = ok.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dez $$0) {
      this.b.accept(nx.a($$0).a(ny.a(dss.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         alf $$3 = oi.a($$0, $$2);
         return oa.a().a(ob.c, oh.c.a($$0, $$2, new oi().a(oj.a, $$3), this.c));
      })));
      this.a($$0, oi.a($$0, "_0"));
   }

   static nu b(dez $$0, alf $$1, alf $$2) {
      return nx.a($$0)
         .a(ny.a(dss.w).a(false, oa.a().a(ob.c, $$1)).a(true, oa.a().a(ob.c, $$2)))
         .a(
            ny.a(dss.U, dss.R)
               .a(dsn.a, je.f, oa.a().a(ob.b, ob.a.b))
               .a(dsn.a, je.e, oa.a().a(ob.b, ob.a.d))
               .a(dsn.a, je.d, oa.a().a(ob.b, ob.a.c))
               .a(dsn.a, je.c, oa.a())
               .a(dsn.b, je.f, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsn.b, je.e, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsn.b, je.d, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsn.b, je.c, oa.a().a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsn.c, je.f, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.c))
               .a(dsn.c, je.e, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.c))
               .a(dsn.c, je.d, oa.a().a(ob.a, ob.a.c))
               .a(dsn.c, je.c, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.c))
         );
   }

   private static ny.d<je, dsy, dsx, Boolean> a(ny.d<je, dsy, dsx, Boolean> $$0, dsy $$1, alf $$2, alf $$3, alf $$4, alf $$5) {
      return $$0.a(je.f, $$1, dsx.a, false, oa.a().a(ob.c, $$2))
         .a(je.d, $$1, dsx.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsx.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsx.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsx.b, false, oa.a().a(ob.c, $$4))
         .a(je.d, $$1, dsx.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsx.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsx.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsx.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
         .a(je.d, $$1, dsx.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
         .a(je.e, $$1, dsx.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         .a(je.c, $$1, dsx.a, true, oa.a().a(ob.c, $$3))
         .a(je.f, $$1, dsx.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.d))
         .a(je.d, $$1, dsx.b, true, oa.a().a(ob.c, $$5))
         .a(je.e, $$1, dsx.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         .a(je.c, $$1, dsx.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.c));
   }

   private static nu a(dez $$0, alf $$1, alf $$2, alf $$3, alf $$4, alf $$5, alf $$6, alf $$7, alf $$8) {
      return nx.a($$0).a(a(a(ny.a(dss.R, dss.ae, dss.be, dss.u), dsy.b, $$1, $$2, $$3, $$4), dsy.a, $$5, $$6, $$7, $$8));
   }

   static nu a(dez $$0, alf $$1, alf $$2, alf $$3, alf $$4, alf $$5) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dss.L, true), oa.a().a(ob.c, $$2).a(ob.d, false))
         .a(nv.a().a(dss.M, true), oa.a().a(ob.c, $$3).a(ob.d, false))
         .a(nv.a().a(dss.N, true), oa.a().a(ob.c, $$4).a(ob.d, false))
         .a(nv.a().a(dss.O, true), oa.a().a(ob.c, $$5).a(ob.d, false));
   }

   static nu c(dez $$0, alf $$1, alf $$2) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dss.L, true), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dss.M, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dss.N, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dss.O, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dez $$0, alf $$1, alf $$2, alf $$3) {
      return nw.a($$0)
         .a(nv.a().a(dss.J, true), oa.a().a(ob.c, $$1))
         .a(nv.a().a(dss.X, dto.b), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dss.W, dto.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dss.Y, dto.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dss.Z, dto.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
         .a(nv.a().a(dss.X, dto.c), oa.a().a(ob.c, $$3).a(ob.d, true))
         .a(nv.a().a(dss.W, dto.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dss.Y, dto.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dss.Z, dto.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dez $$0, alf $$1, alf $$2, alf $$3, alf $$4, boolean $$5) {
      return nx.a($$0, oa.a().a(ob.d, $$5))
         .a(c())
         .a(
            ny.a(dss.q, dss.u)
               .a(false, false, oa.a().a(ob.c, $$2))
               .a(true, false, oa.a().a(ob.c, $$4))
               .a(false, true, oa.a().a(ob.c, $$1))
               .a(true, true, oa.a().a(ob.c, $$3))
         );
   }

   static nu b(dez $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0)
         .a(
            ny.a(dss.R, dss.af, dss.bi)
               .a(je.f, dtb.b, dtl.a, oa.a().a(ob.c, $$2))
               .a(je.e, dtb.b, dtl.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtb.b, dtl.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtb.b, dtl.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtb.b, dtl.e, oa.a().a(ob.c, $$3))
               .a(je.e, dtb.b, dtl.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtb.b, dtl.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtb.b, dtl.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtb.b, dtl.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dtb.b, dtl.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dtb.b, dtl.d, oa.a().a(ob.c, $$3))
               .a(je.c, dtb.b, dtl.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dtb.b, dtl.c, oa.a().a(ob.c, $$1))
               .a(je.e, dtb.b, dtl.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtb.b, dtl.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtb.b, dtl.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtb.b, dtl.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dtb.b, dtl.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dtb.b, dtl.b, oa.a().a(ob.c, $$1))
               .a(je.c, dtb.b, dtl.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dtb.a, dtl.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dtb.a, dtl.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtb.a, dtl.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtb.a, dtl.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtb.a, dtl.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dtb.a, dtl.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dtb.a, dtl.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dtb.a, dtl.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dtb.a, dtl.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dtb.a, dtl.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtb.a, dtl.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtb.a, dtl.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dtb.a, dtl.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dtb.a, dtl.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dtb.a, dtl.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dtb.a, dtl.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dtb.a, dtl.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dtb.a, dtl.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dtb.a, dtl.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dtb.a, dtl.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
         );
   }

   private static nu c(dez $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0)
         .a(
            ny.a(dss.R, dss.af, dss.u)
               .a(je.c, dtb.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dtb.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(je.f, dtb.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(je.e, dtb.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(je.c, dtb.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dtb.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(je.f, dtb.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(je.e, dtb.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(je.c, dtb.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dtb.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dtb.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dtb.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dtb.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c))
               .a(je.d, dtb.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.a))
               .a(je.f, dtb.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               .a(je.e, dtb.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b))
         );
   }

   private static nu d(dez $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0)
         .a(
            ny.a(dss.R, dss.af, dss.u)
               .a(je.c, dtb.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dtb.b, false, oa.a().a(ob.c, $$2))
               .a(je.f, dtb.b, false, oa.a().a(ob.c, $$2))
               .a(je.e, dtb.b, false, oa.a().a(ob.c, $$2))
               .a(je.c, dtb.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dtb.a, false, oa.a().a(ob.c, $$1))
               .a(je.f, dtb.a, false, oa.a().a(ob.c, $$1))
               .a(je.e, dtb.a, false, oa.a().a(ob.c, $$1))
               .a(je.c, dtb.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dtb.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dtb.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dtb.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dtb.a, true, oa.a().a(ob.c, $$3))
               .a(je.d, dtb.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dtb.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dtb.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         );
   }

   static nx c(dez $$0, alf $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1));
   }

   private static ny f() {
      return ny.a(dss.I).a(je.a.b, oa.a()).a(je.a.c, oa.a().a(ob.a, ob.a.b)).a(je.a.a, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   static nu a(dez $$0, oi $$1, BiConsumer<alf, Supplier<JsonElement>> $$2) {
      alf $$3 = oh.g.a($$0, $$1, $$2);
      alf $$4 = oh.h.a($$0, $$1, $$2);
      alf $$5 = oh.i.a($$0, $$1, $$2);
      alf $$6 = oh.j.a($$0, $$1, $$2);
      return nx.a($$0, oa.a().a(ob.c, $$6)).a(ny.a(dss.I).a(je.a.a, oa.a().a(ob.c, $$3)).a(je.a.b, oa.a().a(ob.c, $$4)).a(je.a.c, oa.a().a(ob.c, $$5)));
   }

   static nu d(dez $$0, alf $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1)).a(f());
   }

   private void e(dez $$0, alf $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dez $$0, ok.a $$1) {
      alf $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dez $$0, ok.a $$1) {
      alf $$2 = $$1.create($$0, this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   static nu d(dez $$0, alf $$1, alf $$2) {
      return nx.a($$0)
         .a(
            ny.a(dss.I)
               .a(je.a.b, oa.a().a(ob.c, $$1))
               .a(je.a.c, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b))
               .a(je.a.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.b, ob.a.b))
         );
   }

   private void a(dez $$0, ok.a $$1, ok.a $$2) {
      alf $$3 = $$1.create($$0, this.c);
      alf $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private alf a(dez $$0, String $$1, og $$2, Function<alf, oi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oi.a($$0, $$1)), this.c);
   }

   static nu e(dez $$0, alf $$1, alf $$2) {
      return nx.a($$0).a(a(dss.w, $$2, $$1));
   }

   static nu e(dez $$0, alf $$1, alf $$2, alf $$3) {
      return nx.a($$0).a(ny.a(dss.bh).a(dtk.b, oa.a().a(ob.c, $$1)).a(dtk.a, oa.a().a(ob.c, $$2)).a(dtk.c, oa.a().a(ob.c, $$3)));
   }

   public void a(dez $$0) {
      this.b($$0, ok.a);
   }

   public void b(dez $$0, ok.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dez $$0, oi $$1, og $$2) {
      alf $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nr.b h(dez $$0) {
      ok $$1 = this.g.getOrDefault($$0, ok.a.get($$0));
      return new nr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dez $$0, dez $$1, dez $$2) {
      oi $$3 = oi.u($$0);
      alf $$4 = oh.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dez $$0) {
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

   private void a(dez $$0, dez $$1) {
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

   void j(dez $$0) {
      oi $$1 = oi.b($$0);
      alf $$2 = oh.ak.a($$0, $$1, this.c);
      alf $$3 = oh.al.a($$0, $$1, this.c);
      alf $$4 = oh.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dez $$0) {
      oi $$1 = oi.b($$0);
      alf $$2 = oh.ah.a($$0, $$1, this.c);
      alf $$3 = oh.ai.a($$0, $$1, this.c);
      alf $$4 = oh.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dez $$0, dez $$1) {
      alf $$2 = oh.ah.a($$0);
      alf $$3 = oh.ai.a($$0);
      alf $$4 = oh.aj.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dfb.sD);
      alf $$0 = of.a(dfb.sD);
      alf $$1 = of.a(dfb.sD, "_partial_tilt");
      alf $$2 = of.a(dfb.sD, "_full_tilt");
      this.b
         .accept(
            nx.a(dfb.sD)
               .a(b())
               .a(ny.a(dss.bl).a(dtn.a, oa.a().a(ob.c, $$0)).a(dtn.b, oa.a().a(ob.c, $$0)).a(dtn.c, oa.a().a(ob.c, $$1)).a(dtn.d, oa.a().a(ob.c, $$2)))
         );
   }

   private nr.f l(dez $$0) {
      return new nr.f(oi.n($$0));
   }

   private void m(dez $$0) {
      this.c($$0, $$0);
   }

   private void c(dez $$0, dez $$1) {
      this.b.accept(c($$0, of.a($$1)));
   }

   private void a(dez $$0, nr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dez $$0, nr.e $$1, oi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dez $$0, nr.e $$1) {
      oi $$2 = oi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dez $$0, nr.e $$1, oi $$2) {
      alf $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dez $$0, nr.e $$1, dtf<Integer> $$2, int... $$3) {
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

   private void a(dez $$0, dez $$1, nr.e $$2) {
      this.a($$0, $$2);
      oi $$3 = oi.d($$0);
      alf $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dez $$0, dez $$1) {
      ok $$2 = ok.p.get($$0);
      alf $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alf $$4 = oh.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dez $$0, dez $$1) {
      this.a($$0.r());
      oi $$2 = oi.h($$0);
      oi $$3 = oi.a($$0, $$1);
      alf $$4 = oh.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nx.a($$1, oa.a().a(ob.c, $$4))
               .a(ny.a(dss.R).a(je.e, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a().a(ob.b, ob.a.b)).a(je.f, oa.a().a(ob.b, ob.a.c)))
         );
      this.b.accept(nx.a($$0).a(ny.a(dss.av).a($$2x -> oa.a().a(ob.c, oh.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dez $$0 = dfb.kC;
      this.a($$0.r());
      alf $$1 = of.a($$0, "_top");
      alf $$2 = of.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dez $$0 = dfb.kB;
      this.a($$0.r());
      ny $$1 = ny.a(dko.d, dss.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oa.a().a(ob.c, of.a($$0, "_top_stage_" + $$1x));
            case b -> oa.a().a(ob.c, of.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nx.a($$0).a($$1));
   }

   private void a(dez $$0, dez $$1, dez $$2, dez $$3, dez $$4, dez $$5, dez $$6, dez $$7) {
      this.a($$0, nr.e.b);
      this.a($$1, nr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dez $$0, nr.e $$1) {
      this.a($$0, "_top");
      alf $$2 = this.a($$0, "_top", $$1.a(), oi::c);
      alf $$3 = this.a($$0, "_bottom", $$1.a(), oi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dfb.iD, "_front");
      alf $$0 = of.a(dfb.iD, "_top");
      alf $$1 = this.a(dfb.iD, "_bottom", nr.e.b.a(), oi::c);
      this.f(dfb.iD, $$0, $$1);
   }

   private void k() {
      alf $$0 = this.a(dfb.bx, "_top", oh.bk, oi::a);
      alf $$1 = this.a(dfb.bx, "_bottom", oh.bk, oi::a);
      this.f(dfb.bx, $$0, $$1);
   }

   private void l() {
      this.c(dfb.sF);
      alf $$0 = of.a(dfb.sF, "_top");
      alf $$1 = of.a(dfb.sF, "_bottom");
      this.b.accept(nx.a(dfb.sF).a(b()).a(ny.a(dss.ae).a(dsy.b, oa.a().a(ob.c, $$1)).a(dsy.a, oa.a().a(ob.c, $$0))));
   }

   private void f(dez $$0, alf $$1, alf $$2) {
      this.b.accept(nx.a($$0).a(ny.a(dss.ae).a(dsy.b, oa.a().a(ob.c, $$2)).a(dsy.a, oa.a().a(ob.c, $$1))));
   }

   private void n(dez $$0) {
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
                  ny.a(dss.ag)
                     .a(dtg.a, oa.a().a(ob.c, $$3))
                     .a(dtg.b, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(dtg.c, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
                     .a(dtg.d, oa.a().a(ob.c, $$6).a(ob.b, ob.a.b))
                     .a(dtg.e, oa.a().a(ob.c, $$5))
                     .a(dtg.f, oa.a().a(ob.c, $$6))
                     .a(dtg.g, oa.a().a(ob.c, $$4))
                     .a(dtg.h, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
                     .a(dtg.i, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
                     .a(dtg.j, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
               )
         );
   }

   private void o(dez $$0) {
      alf $$1 = this.a($$0, "", oh.as, oi::e);
      alf $$2 = this.a($$0, "", oh.au, oi::e);
      alf $$3 = this.a($$0, "", oh.av, oi::e);
      alf $$4 = this.a($$0, "_on", oh.as, oi::e);
      alf $$5 = this.a($$0, "_on", oh.au, oi::e);
      alf $$6 = this.a($$0, "_on", oh.av, oi::e);
      ny $$7 = ny.a(dss.w, dss.ah).a(($$6x, $$7x) -> {
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

   private nr.a a(alf $$0, dez $$1) {
      return new nr.a($$0, $$1);
   }

   private nr.a f(dez $$0, dez $$1) {
      return new nr.a(of.a($$0), $$1);
   }

   private void a(dez $$0, cuk $$1) {
      alf $$2 = oh.aa.a($$0, oi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dez $$0, alf $$1) {
      alf $$2 = oh.aa.a($$0, oi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dez $$0, dez $$1) {
      this.a($$0);
      alf $$2 = ok.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dez $$0) {
      this.a($$0.r());
      alf $$1 = ok.k.create($$0, this.c);
      alf $$2 = ok.l.create($$0, this.c);
      alf $$3 = ok.m.create($$0, this.c);
      alf $$4 = ok.n.create($$0, this.c);
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dss.S, 1, 2, 3, 4).a(dss.R, je.c), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dss.S, 1, 2, 3, 4).a(dss.R, je.f), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.S, 1, 2, 3, 4).a(dss.R, je.d), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(nv.a().a(dss.S, 1, 2, 3, 4).a(dss.R, je.e), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(nv.a().a(dss.S, 2, 3, 4).a(dss.R, je.c), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dss.S, 2, 3, 4).a(dss.R, je.f), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.S, 2, 3, 4).a(dss.R, je.d), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(nv.a().a(dss.S, 2, 3, 4).a(dss.R, je.e), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(nv.a().a(dss.S, 3, 4).a(dss.R, je.c), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dss.S, 3, 4).a(dss.R, je.f), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.S, 3, 4).a(dss.R, je.d), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(nv.a().a(dss.S, 3, 4).a(dss.R, je.e), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(nv.a().a(dss.S, 4).a(dss.R, je.c), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dss.S, 4).a(dss.R, je.f), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.S, 4).a(dss.R, je.d), oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
               .a(nv.a().a(dss.S, 4).a(dss.R, je.e), oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         );
   }

   private void a(ok.a $$0, dez... $$1) {
      for (dez $$2 : $$1) {
         alf $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ok.a $$0, dez... $$1) {
      for (dez $$2 : $$1) {
         alf $$3 = $$0.create($$2, this.c);
         this.b.accept(nx.a($$2, oa.a().a(ob.c, $$3)).a(c()));
      }
   }

   private void h(dez $$0, dez $$1) {
      this.a($$0);
      oi $$2 = oi.b($$0, $$1);
      alf $$3 = oh.aI.a($$1, $$2, this.c);
      alf $$4 = oh.aJ.a($$1, $$2, this.c);
      alf $$5 = oh.aK.a($$1, $$2, this.c);
      alf $$6 = oh.aG.a($$1, $$2, this.c);
      alf $$7 = oh.aH.a($$1, $$2, this.c);
      cuk $$8 = $$1.r();
      oh.bx.a(of.a($$8), oi.F($$0), this.c);
      this.b
         .accept(
            nw.a($$1)
               .a(oa.a().a(ob.c, $$3))
               .a(nv.a().a(dss.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dss.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dss.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.L, false), oa.a().a(ob.c, $$6))
               .a(nv.a().a(dss.M, false), oa.a().a(ob.c, $$7))
               .a(nv.a().a(dss.N, false), oa.a().a(ob.c, $$7).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.O, false), oa.a().a(ob.c, $$6).a(ob.b, ob.a.d))
         );
   }

   private void q(dez $$0) {
      oi $$1 = oi.z($$0);
      alf $$2 = oh.aL.a($$0, $$1, this.c);
      alf $$3 = this.a($$0, "_conditional", oh.aL, $$1x -> $$1.c(oj.i, $$1x));
      this.b.accept(nx.a($$0).a(a(dss.c, $$3, $$2)).a(e()));
   }

   private void r(dez $$0) {
      alf $$1 = ok.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oa> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oa.a().a(ob.c, of.a(dfb.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dfb.mZ);
      this.b
         .accept(
            nw.a(dfb.mZ)
               .a(nv.a().a(dss.aq, 0), this.a(0))
               .a(nv.a().a(dss.aq, 1), this.a(1))
               .a(nv.a().a(dss.bk, dso.b), oa.a().a(ob.c, of.a(dfb.mZ, "_small_leaves")))
               .a(nv.a().a(dss.bk, dso.c), oa.a().a(ob.c, of.a(dfb.mZ, "_large_leaves")))
         );
   }

   private ny n() {
      return ny.a(dss.P)
         .a(je.a, oa.a().a(ob.a, ob.a.c))
         .a(je.b, oa.a())
         .a(je.c, oa.a().a(ob.a, ob.a.b))
         .a(je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   private void o() {
      alf $$0 = oi.a(dfb.nU, "_top_open");
      this.b
         .accept(
            nx.a(dfb.nU)
               .a(this.n())
               .a(
                  ny.a(dss.u)
                     .a(false, oa.a().a(ob.c, ok.f.create(dfb.nU, this.c)))
                     .a(true, oa.a().a(ob.c, ok.f.get(dfb.nU).a($$1 -> $$1.a(oj.f, $$0)).a(dfb.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ny a(dtf<T> $$0, T $$1, alf $$2, alf $$3) {
      oa $$4 = oa.a().a(ob.c, $$2);
      oa $$5 = oa.a().a(ob.c, $$3);
      return ny.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dez $$0, Function<dez, oi> $$1) {
      oi $$2 = $$1.apply($$0).b(oj.i, oj.c);
      oi $$3 = $$2.c(oj.g, oi.a($$0, "_front_honey"));
      alf $$4 = oh.q.a($$0, $$2, this.c);
      alf $$5 = oh.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nx.a($$0).a(b()).a(a(dss.aN, 5, $$5, $$4)));
   }

   private void a(dez $$0, dtf<Integer> $$1, int... $$2) {
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
      alf $$0 = of.a(dfb.od, "_floor");
      alf $$1 = of.a(dfb.od, "_ceiling");
      alf $$2 = of.a(dfb.od, "_wall");
      alf $$3 = of.a(dfb.od, "_between_walls");
      this.a(cus.wo);
      this.b
         .accept(
            nx.a(dfb.od)
               .a(
                  ny.a(dss.R, dss.V)
                     .a(je.c, dsq.a, oa.a().a(ob.c, $$0))
                     .a(je.d, dsq.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.c))
                     .a(je.f, dsq.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.b))
                     .a(je.e, dsq.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.d))
                     .a(je.c, dsq.b, oa.a().a(ob.c, $$1))
                     .a(je.d, dsq.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.f, dsq.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.e, dsq.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
                     .a(je.c, dsq.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
                     .a(je.d, dsq.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
                     .a(je.f, dsq.c, oa.a().a(ob.c, $$2))
                     .a(je.e, dsq.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
                     .a(je.d, dsq.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(je.c, dsq.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
                     .a(je.f, dsq.d, oa.a().a(ob.c, $$3))
                     .a(je.e, dsq.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nx.a(dfb.nZ, oa.a().a(ob.c, of.a(dfb.nZ)))
               .a(
                  ny.a(dss.U, dss.R)
                     .a(dsn.a, je.c, oa.a())
                     .a(dsn.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsn.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsn.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsn.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsn.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsn.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsn.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
                     .a(dsn.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsn.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsn.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsn.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               )
         );
   }

   private void d(dez $$0, ok.a $$1) {
      alf $$2 = $$1.create($$0, this.c);
      alf $$3 = oi.a($$0, "_front_on");
      alf $$4 = $$1.get($$0).a($$1x -> $$1x.a(oj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nx.a($$0).a(a(dss.r, $$4, $$2)).a(b()));
   }

   private void a(dez... $$0) {
      alf $$1 = of.a("campfire_off");

      for (dez $$2 : $$0) {
         alf $$3 = oh.bc.a($$2, oi.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nx.a($$2).a(a(dss.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dez $$0) {
      alf $$1 = oh.bt.a($$0, oi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dez $$0) {
      alf $$1;
      if ($$0 == dfb.tj) {
         $$1 = oh.bv.a($$0, oi.m($$0), this.c);
      } else {
         $$1 = oh.bu.a($$0, oi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oi $$0 = oi.a(oi.G(dfb.cl), oi.G(dfb.n));
      alf $$1 = oh.j.a(dfb.cl, $$0, this.c);
      this.b.accept(c(dfb.cl, $$1));
   }

   private void s() {
      this.a(cus.lH);
      this.b
         .accept(
            nw.a(dfb.cw)
               .a(
                  nv.b(
                     nv.a().a(dss.ab, dth.c).a(dss.aa, dth.c).a(dss.ac, dth.c).a(dss.ad, dth.c),
                     nv.a().a(dss.ab, dth.b, dth.a).a(dss.aa, dth.b, dth.a),
                     nv.a().a(dss.aa, dth.b, dth.a).a(dss.ac, dth.b, dth.a),
                     nv.a().a(dss.ac, dth.b, dth.a).a(dss.ad, dth.b, dth.a),
                     nv.a().a(dss.ad, dth.b, dth.a).a(dss.ab, dth.b, dth.a)
                  ),
                  oa.a().a(ob.c, of.a("redstone_dust_dot"))
               )
               .a(nv.a().a(dss.ab, dth.b, dth.a), oa.a().a(ob.c, of.a("redstone_dust_side0")))
               .a(nv.a().a(dss.ac, dth.b, dth.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt0")))
               .a(nv.a().a(dss.aa, dth.b, dth.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dss.ad, dth.b, dth.a), oa.a().a(ob.c, of.a("redstone_dust_side1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dss.ab, dth.a), oa.a().a(ob.c, of.a("redstone_dust_up")))
               .a(nv.a().a(dss.aa, dth.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.ac, dth.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.c))
               .a(nv.a().a(dss.ad, dth.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.d))
         );
   }

   private void t() {
      this.a(cus.lL);
      this.b
         .accept(
            nx.a(dfb.gY)
               .a(c())
               .a(
                  ny.a(dss.bd, dss.w)
                     .a(dsv.a, false, oa.a().a(ob.c, of.a(dfb.gY)))
                     .a(dsv.a, true, oa.a().a(ob.c, of.a(dfb.gY, "_on")))
                     .a(dsv.b, false, oa.a().a(ob.c, of.a(dfb.gY, "_subtract")))
                     .a(dsv.b, true, oa.a().a(ob.c, of.a(dfb.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oi $$0 = oi.a(dfb.jR);
      oi $$1 = oi.a(oi.a(dfb.jE, "_side"), $$0.a(oj.f));
      alf $$2 = oh.ab.a(dfb.jE, $$1, this.c);
      alf $$3 = oh.ac.a(dfb.jE, $$1, this.c);
      alf $$4 = oh.j.b(dfb.jE, "_double", $$1, this.c);
      this.b.accept(e(dfb.jE, $$2, $$3, $$4));
      this.b.accept(c(dfb.jR, oh.c.a(dfb.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cus.sq);
      this.b
         .accept(
            nw.a(dfb.fs)
               .a(oa.a().a(ob.c, oi.G(dfb.fs)))
               .a(nv.a().a(dss.k, true), oa.a().a(ob.c, oi.a(dfb.fs, "_bottle0")))
               .a(nv.a().a(dss.l, true), oa.a().a(ob.c, oi.a(dfb.fs, "_bottle1")))
               .a(nv.a().a(dss.m, true), oa.a().a(ob.c, oi.a(dfb.fs, "_bottle2")))
               .a(nv.a().a(dss.k, false), oa.a().a(ob.c, oi.a(dfb.fs, "_empty0")))
               .a(nv.a().a(dss.l, false), oa.a().a(ob.c, oi.a(dfb.fs, "_empty1")))
               .a(nv.a().a(dss.m, false), oa.a().a(ob.c, oi.a(dfb.fs, "_empty2")))
         );
   }

   private void u(dez $$0) {
      alf $$1 = oh.bp.a($$0, oi.b($$0), this.c);
      alf $$2 = of.a("mushroom_block_inside");
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dss.L, true), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dss.M, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dss.N, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dss.O, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dss.J, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dss.K, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dss.L, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dss.M, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, false))
               .a(nv.a().a(dss.N, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, false))
               .a(nv.a().a(dss.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dss.J, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dss.K, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, false))
         );
      this.a($$0, ok.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cus.rB);
      this.b
         .accept(
            nx.a(dfb.eg)
               .a(
                  ny.a(dss.ay)
                     .a(0, oa.a().a(ob.c, of.a(dfb.eg)))
                     .a(1, oa.a().a(ob.c, of.a(dfb.eg, "_slice1")))
                     .a(2, oa.a().a(ob.c, of.a(dfb.eg, "_slice2")))
                     .a(3, oa.a().a(ob.c, of.a(dfb.eg, "_slice3")))
                     .a(4, oa.a().a(ob.c, of.a(dfb.eg, "_slice4")))
                     .a(5, oa.a().a(ob.c, of.a(dfb.eg, "_slice5")))
                     .a(6, oa.a().a(ob.c, of.a(dfb.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dfb.nX, "_side3"))
         .a(oj.o, oi.G(dfb.t))
         .a(oj.n, oi.a(dfb.nX, "_top"))
         .a(oj.j, oi.a(dfb.nX, "_side3"))
         .a(oj.l, oi.a(dfb.nX, "_side3"))
         .a(oj.k, oi.a(dfb.nX, "_side1"))
         .a(oj.m, oi.a(dfb.nX, "_side2"));
      this.b.accept(c(dfb.nX, oh.a.a(dfb.nX, $$0, this.c)));
   }

   private void y() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dfb.ob, "_front"))
         .a(oj.o, oi.a(dfb.ob, "_bottom"))
         .a(oj.n, oi.a(dfb.ob, "_top"))
         .a(oj.j, oi.a(dfb.ob, "_front"))
         .a(oj.k, oi.a(dfb.ob, "_front"))
         .a(oj.l, oi.a(dfb.ob, "_side"))
         .a(oj.m, oi.a(dfb.ob, "_side"));
      this.b.accept(c(dfb.ob, oh.a.a(dfb.ob, $$0, this.c)));
   }

   private void a(dez $$0, dez $$1, BiFunction<dez, dez, oi> $$2) {
      oi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oh.a.a($$0, $$3, this.c)));
   }

   public void b(dez $$0) {
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
      oi $$0 = oi.k(dfb.eZ);
      this.b.accept(c(dfb.eZ, of.a(dfb.eZ)));
      this.a(dfb.ee, $$0);
      this.a(dfb.ef, $$0);
   }

   private void a(dez $$0, oi $$1) {
      alf $$2 = oh.p.a($$0, $$1.c(oj.g, oi.G($$0)), this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cus.sr);
      this.m(dfb.ft);
      this.b.accept(c(dfb.fv, oh.bs.a(dfb.fv, oi.j(oi.a(dfb.H, "_still")), this.c)));
      this.b
         .accept(
            nx.a(dfb.fu)
               .a(
                  ny.a(dji.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dfb.fu, "_level1", oi.j(oi.a(dfb.G, "_still")), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dfb.fu, "_level2", oi.j(oi.a(dfb.G, "_still")), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dfb.fu, "_full", oi.j(oi.a(dfb.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nx.a(dfb.fw)
               .a(
                  ny.a(dji.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dfb.fw, "_level1", oi.j(oi.G(dfb.qP)), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dfb.fw, "_level2", oi.j(oi.G(dfb.qP)), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dfb.fw, "_full", oi.j(oi.G(dfb.qP)), this.c)))
               )
         );
   }

   private void B() {
      oi $$0 = oi.b(dfb.kv);
      alf $$1 = oh.aE.a(dfb.kv, $$0, this.c);
      alf $$2 = this.a(dfb.kv, "_dead", oh.aE, $$1x -> $$0.c(oj.b, $$1x));
      this.b.accept(nx.a(dfb.kv).a(a(dss.au, 5, $$2, $$1)));
   }

   private void C() {
      alf $$0 = of.a(dfb.tq);
      alf $$1 = of.a(dfb.tq, "_triggered");
      alf $$2 = of.a(dfb.tq, "_crafting");
      alf $$3 = of.a(dfb.tq, "_crafting_triggered");
      this.b
         .accept(
            nx.a(dfb.tq)
               .a(ny.a(dss.T).a($$0x -> this.a($$0x, oa.a())))
               .a(
                  ny.a(dss.A, dgs.b)
                     .a(false, false, oa.a().a(ob.c, $$0))
                     .a(true, true, oa.a().a(ob.c, $$3))
                     .a(true, false, oa.a().a(ob.c, $$1))
                     .a(false, true, oa.a().a(ob.c, $$2))
               )
         );
   }

   private void v(dez $$0) {
      oi $$1 = new oi().a(oj.f, oi.a(dfb.cD, "_top")).a(oj.i, oi.a(dfb.cD, "_side")).a(oj.g, oi.a($$0, "_front"));
      oi $$2 = new oi().a(oj.i, oi.a(dfb.cD, "_top")).a(oj.g, oi.a($$0, "_front_vertical"));
      alf $$3 = oh.p.a($$0, $$1, this.c);
      alf $$4 = oh.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dss.P)
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
      alf $$0 = of.a(dfb.fy);
      alf $$1 = of.a(dfb.fy, "_filled");
      this.b.accept(nx.a(dfb.fy).a(ny.a(dss.h).a(false, oa.a().a(ob.c, $$0)).a(true, oa.a().a(ob.c, $$1))).a(c()));
   }

   private void E() {
      alf $$0 = of.a(dfb.ku, "_side");
      alf $$1 = of.a(dfb.ku, "_noside");
      alf $$2 = of.a(dfb.ku, "_noside1");
      alf $$3 = of.a(dfb.ku, "_noside2");
      alf $$4 = of.a(dfb.ku, "_noside3");
      this.b
         .accept(
            nw.a(dfb.ku)
               .a(nv.a().a(dss.L, true), oa.a().a(ob.c, $$0))
               .a(nv.a().a(dss.M, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dss.N, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dss.O, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dss.J, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dss.K, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dss.L, false), oa.a().a(ob.c, $$1).a(ob.e, 2), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$3), oa.a().a(ob.c, $$4))
               .a(
                  nv.a().a(dss.M, false),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.b).a(ob.d, true)
               )
               .a(
                  nv.a().a(dss.N, false),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true)
               )
               .a(
                  nv.a().a(dss.O, false),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dss.J, false),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dss.K, false),
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
            nw.a(dfb.pc)
               .a(oa.a().a(ob.c, oi.G(dfb.pc)))
               .a(nv.a().a(dss.aL, 1), oa.a().a(ob.c, oi.a(dfb.pc, "_contents1")))
               .a(nv.a().a(dss.aL, 2), oa.a().a(ob.c, oi.a(dfb.pc, "_contents2")))
               .a(nv.a().a(dss.aL, 3), oa.a().a(ob.c, oi.a(dfb.pc, "_contents3")))
               .a(nv.a().a(dss.aL, 4), oa.a().a(ob.c, oi.a(dfb.pc, "_contents4")))
               .a(nv.a().a(dss.aL, 5), oa.a().a(ob.c, oi.a(dfb.pc, "_contents5")))
               .a(nv.a().a(dss.aL, 6), oa.a().a(ob.c, oi.a(dfb.pc, "_contents6")))
               .a(nv.a().a(dss.aL, 7), oa.a().a(ob.c, oi.a(dfb.pc, "_contents7")))
               .a(nv.a().a(dss.aL, 8), oa.a().a(ob.c, oi.a(dfb.pc, "_contents_ready")))
         );
   }

   private void w(dez $$0) {
      alf $$1 = oh.c.a($$0, oi.a($$0), this.c);
      alf $$2 = this.a($$0, "_powered", oh.c, oi::b);
      alf $$3 = this.a($$0, "_lit", oh.c, oi::b);
      alf $$4 = this.a($$0, "_lit_powered", oh.c, oi::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nu a(dez $$0, alf $$1, alf $$2, alf $$3, alf $$4) {
      return nx.a($$0).a(ny.a(dss.r, dss.w).a(($$4x, $$5) -> $$4x ? oa.a().a(ob.c, $$5 ? $$4 : $$2) : oa.a().a(ob.c, $$5 ? $$3 : $$1)));
   }

   private void i(dez $$0, dez $$1) {
      alf $$2 = of.a($$0);
      alf $$3 = of.a($$0, "_powered");
      alf $$4 = of.a($$0, "_lit");
      alf $$5 = of.a($$0, "_lit_powered");
      this.a($$1, of.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dez $$0) {
      this.c($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, oh.ao.a($$0, oi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dfb.qy);
      this.x(dfb.qx);
      this.x(dfb.qw);
      this.x(dfb.qv);
   }

   private void H() {
      this.c(dfb.st);
      ny.b<je, dsz> $$0 = ny.a(dss.bm, dss.bn);

      for (dsz $$1 : dsz.values()) {
         $$0.a(je.b, $$1, this.a(je.b, $$1));
      }

      for (dsz $$2 : dsz.values()) {
         $$0.a(je.a, $$2, this.a(je.a, $$2));
      }

      this.b.accept(nx.a(dfb.st).a($$0));
   }

   private oa a(je $$0, dsz $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oi $$3 = oi.c(oi.a(dfb.st, $$2));
      return oa.a().a(ob.c, oh.an.a(dfb.st, $$2, $$3, this.c));
   }

   private void y(dez $$0) {
      oi $$1 = new oi().a(oj.e, oi.G(dfb.dV)).a(oj.f, oi.G($$0)).a(oj.i, oi.a($$0, "_side"));
      this.b.accept(c($$0, oh.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alf $$0 = oi.a(dfb.gZ, "_side");
      oi $$1 = new oi().a(oj.f, oi.a(dfb.gZ, "_top")).a(oj.i, $$0);
      oi $$2 = new oi().a(oj.f, oi.a(dfb.gZ, "_inverted_top")).a(oj.i, $$0);
      this.b
         .accept(
            nx.a(dfb.gZ)
               .a(ny.a(dss.p).a(false, oa.a().a(ob.c, oh.aF.a(dfb.gZ, $$1, this.c))).a(true, oa.a().a(ob.c, oh.aF.a(of.a(dfb.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dez $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()));
   }

   private void J() {
      dez $$0 = dfb.ss;
      alf $$1 = of.a($$0, "_on");
      alf $$2 = of.a($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()).a(a(dss.w, $$1, $$2)));
   }

   private void K() {
      oi $$0 = new oi().a(oj.B, oi.G(dfb.j)).a(oj.f, oi.G(dfb.cC));
      oi $$1 = new oi().a(oj.B, oi.G(dfb.j)).a(oj.f, oi.a(dfb.cC, "_moist"));
      alf $$2 = oh.aW.a(dfb.cC, $$0, this.c);
      alf $$3 = oh.aW.a(oi.a(dfb.cC, "_moist"), $$1, this.c);
      this.b.accept(nx.a(dfb.cC).a(a(dss.aQ, 7, $$3, $$2)));
   }

   private List<alf> A(dez $$0) {
      alf $$1 = oh.aX.a(of.a($$0, "_floor0"), oi.v($$0), this.c);
      alf $$2 = oh.aX.a(of.a($$0, "_floor1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alf> B(dez $$0) {
      alf $$1 = oh.aY.a(of.a($$0, "_side0"), oi.v($$0), this.c);
      alf $$2 = oh.aY.a(of.a($$0, "_side1"), oi.w($$0), this.c);
      alf $$3 = oh.aZ.a(of.a($$0, "_side_alt0"), oi.v($$0), this.c);
      alf $$4 = oh.aZ.a(of.a($$0, "_side_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alf> C(dez $$0) {
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
      nv $$0 = nv.a().a(dss.L, false).a(dss.M, false).a(dss.N, false).a(dss.O, false).a(dss.J, false);
      List<alf> $$1 = this.A(dfb.cr);
      List<alf> $$2 = this.B(dfb.cr);
      List<alf> $$3 = this.C(dfb.cr);
      this.b
         .accept(
            nw.a(dfb.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dss.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dss.M, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(nv.b(nv.a().a(dss.N, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(nv.b(nv.a().a(dss.O, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.d)))
               .a(nv.a().a(dss.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alf> $$0 = this.A(dfb.cs);
      List<alf> $$1 = this.B(dfb.cs);
      this.b
         .accept(
            nw.a(dfb.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.d)))
         );
   }

   private void D(dez $$0) {
      alf $$1 = ok.t.create($$0, this.c);
      alf $$2 = ok.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nx.a($$0).a(a(dss.j, $$2, $$1)));
   }

   private void N() {
      oi $$0 = oi.a(oi.a(dfb.ad, "_side"), oi.a(dfb.ad, "_top"));
      alf $$1 = oh.j.a(dfb.ad, $$0, this.c);
      this.b.accept(d(dfb.ad, $$1));
   }

   private void O() {
      this.a(cus.ad);
      dez $$0 = dfb.E;
      ny.b<Boolean, Integer> $$1 = ny.a(dju.d, dju.b);
      alf $$2 = of.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alf $$4 = of.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oa.a().a(ob.c, $$4));
         $$1.a(false, $$3, oa.a().a(ob.c, $$2));
      }

      this.b.accept(nx.a(dfb.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nx.a(dfb.kI)
               .a(
                  ny.a(dss.as)
                     .a(0, oa.a().a(ob.c, this.a(dfb.kI, "_0", oh.c, oi::b)))
                     .a(1, oa.a().a(ob.c, this.a(dfb.kI, "_1", oh.c, oi::b)))
                     .a(2, oa.a().a(ob.c, this.a(dfb.kI, "_2", oh.c, oi::b)))
                     .a(3, oa.a().a(ob.c, this.a(dfb.kI, "_3", oh.c, oi::b)))
               )
         );
   }

   private void Q() {
      alf $$0 = oi.G(dfb.j);
      oi $$1 = new oi().a(oj.e, $$0).b(oj.e, oj.c).a(oj.f, oi.a(dfb.i, "_top")).a(oj.i, oi.a(dfb.i, "_snow"));
      oa $$2 = oa.a().a(ob.c, oh.n.a(dfb.i, "_snow", $$1, this.c));
      this.a(dfb.i, of.a(dfb.i), $$2);
      alf $$3 = ok.f.get(dfb.fl).a($$1x -> $$1x.a(oj.e, $$0)).a(dfb.fl, this.c);
      this.a(dfb.fl, $$3, $$2);
      alf $$4 = ok.f.get(dfb.l).a($$1x -> $$1x.a(oj.e, $$0)).a(dfb.l, this.c);
      this.a(dfb.l, $$4, $$2);
   }

   private void a(dez $$0, alf $$1, oa $$2) {
      List<oa> $$3 = Arrays.asList(a($$1));
      this.b.accept(nx.a($$0).a(ny.a(dss.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cus.rh);
      this.b
         .accept(
            nx.a(dfb.fC)
               .a(
                  ny.a(dss.ar)
                     .a(0, oa.a().a(ob.c, of.a(dfb.fC, "_stage0")))
                     .a(1, oa.a().a(ob.c, of.a(dfb.fC, "_stage1")))
                     .a(2, oa.a().a(ob.c, of.a(dfb.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dfb.kE, of.a(dfb.kE)));
   }

   private void j(dez $$0, dez $$1) {
      oi $$2 = oi.b($$1);
      alf $$3 = oh.Y.a($$0, $$2, this.c);
      alf $$4 = oh.Z.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dss.aT, 1, $$4, $$3)));
   }

   private void T() {
      alf $$0 = of.a(dfb.hc);
      alf $$1 = of.a(dfb.hc, "_side");
      this.a(cus.lR);
      this.b
         .accept(
            nx.a(dfb.hc)
               .a(
                  ny.a(dss.Q)
                     .a(je.a, oa.a().a(ob.c, $$0))
                     .a(je.c, oa.a().a(ob.c, $$1))
                     .a(je.f, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.d, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.e, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               )
         );
   }

   private void k(dez $$0, dez $$1) {
      alf $$2 = of.a($$0);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alf $$0 = of.a(dfb.eW, "_post_ends");
      alf $$1 = of.a(dfb.eW, "_post");
      alf $$2 = of.a(dfb.eW, "_cap");
      alf $$3 = of.a(dfb.eW, "_cap_alt");
      alf $$4 = of.a(dfb.eW, "_side");
      alf $$5 = of.a(dfb.eW, "_side_alt");
      this.b
         .accept(
            nw.a(dfb.eW)
               .a(oa.a().a(ob.c, $$0))
               .a(nv.a().a(dss.L, false).a(dss.M, false).a(dss.N, false).a(dss.O, false), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dss.L, true).a(dss.M, false).a(dss.N, false).a(dss.O, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dss.L, false).a(dss.M, true).a(dss.N, false).a(dss.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.L, false).a(dss.M, false).a(dss.N, true).a(dss.O, false), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dss.L, false).a(dss.M, false).a(dss.N, false).a(dss.O, true), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dss.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dss.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dss.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         );
      this.d(dfb.eW);
   }

   private void E(dez $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(b()));
   }

   private void V() {
      alf $$0 = of.a(dfb.dw);
      alf $$1 = of.a(dfb.dw, "_on");
      this.d(dfb.dw);
      this.b
         .accept(
            nx.a(dfb.dw)
               .a(a(dss.w, $$0, $$1))
               .a(
                  ny.a(dss.U, dss.R)
                     .a(dsn.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsn.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
                     .a(dsn.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsn.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsn.a, je.c, oa.a())
                     .a(dsn.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsn.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsn.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsn.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsn.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsn.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsn.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
               )
         );
   }

   private void W() {
      this.d(dfb.fm);
      this.b.accept(b(dfb.fm, of.a(dfb.fm)));
   }

   private void X() {
      this.d(dfb.tn);
      this.b.accept(c(dfb.tn, of.a(dfb.tn)));
   }

   private void Y() {
      this.b.accept(nx.a(dfb.ed).a(ny.a(dss.H).a(je.a.a, oa.a().a(ob.c, of.a(dfb.ed, "_ns"))).a(je.a.c, oa.a().a(ob.c, of.a(dfb.ed, "_ew")))));
   }

   private void Z() {
      alf $$0 = ok.a.create(dfb.dV, this.c);
      this.b
         .accept(
            nx.a(
               dfb.dV,
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
      alf $$0 = of.a(dfb.kO);
      alf $$1 = of.a(dfb.kO, "_on");
      this.b.accept(nx.a(dfb.kO).a(a(dss.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oi $$0 = new oi().a(oj.e, oi.a(dfb.by, "_bottom")).a(oj.i, oi.a(dfb.by, "_side"));
      alf $$1 = oi.a(dfb.by, "_top_sticky");
      alf $$2 = oi.a(dfb.by, "_top");
      oi $$3 = $$0.c(oj.E, $$1);
      oi $$4 = $$0.c(oj.E, $$2);
      alf $$5 = of.a(dfb.by, "_base");
      this.a(dfb.by, $$5, $$4);
      this.a(dfb.br, $$5, $$3);
      alf $$6 = oh.n.a(dfb.by, "_inventory", $$0.c(oj.f, $$2), this.c);
      alf $$7 = oh.n.a(dfb.br, "_inventory", $$0.c(oj.f, $$1), this.c);
      this.a(dfb.by, $$6);
      this.a(dfb.br, $$7);
   }

   private void a(dez $$0, alf $$1, oi $$2) {
      alf $$3 = oh.bh.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dss.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oi $$0 = new oi().a(oj.F, oi.a(dfb.by, "_top")).a(oj.i, oi.a(dfb.by, "_side"));
      oi $$1 = $$0.c(oj.E, oi.a(dfb.by, "_top_sticky"));
      oi $$2 = $$0.c(oj.E, oi.a(dfb.by, "_top"));
      this.b
         .accept(
            nx.a(dfb.bz)
               .a(
                  ny.a(dss.x, dss.bg)
                     .a(false, dte.a, oa.a().a(ob.c, oh.bi.a(dfb.by, "_head", $$2, this.c)))
                     .a(false, dte.b, oa.a().a(ob.c, oh.bi.a(dfb.by, "_head_sticky", $$1, this.c)))
                     .a(true, dte.a, oa.a().a(ob.c, oh.bj.a(dfb.by, "_head_short", $$2, this.c)))
                     .a(true, dte.b, oa.a().a(ob.c, oh.bj.a(dfb.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dez $$0 = dfb.tr;
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
      this.b.accept(nx.a($$0).a(ny.a(dss.by, dss.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oa.a().a(ob.c, $$7x ? $$10 : $$7);
            case b, c, d -> oa.a().a(ob.c, $$7x ? $$11 : $$8);
            case e -> oa.a().a(ob.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dez $$0 = dfb.ts;
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
      this.b.accept(nx.a($$0).a(b()).a(ny.a(dnu.b, dnu.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oa.a().a(ob.c, $$9x ? $$13 : $$5);
            case b -> oa.a().a(ob.c, $$9x ? $$14 : $$6);
            case c -> oa.a().a(ob.c, $$9x ? $$15 : $$7);
            case d -> oa.a().a(ob.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alf $$0 = of.a(dfb.qQ, "_inactive");
      alf $$1 = of.a(dfb.qQ, "_active");
      this.a(dfb.qQ, $$0);
      this.b.accept(nx.a(dfb.qQ).a(ny.a(dss.bo).a($$2 -> oa.a().a(ob.c, $$2 != dtj.b && $$2 != dtj.c ? $$0 : $$1))));
   }

   private void ag() {
      alf $$0 = of.a(dfb.qR, "_inactive");
      alf $$1 = of.a(dfb.qR, "_active");
      this.a(dfb.qR, $$0);
      this.b.accept(nx.a(dfb.qR).a(ny.a(dss.bo).a($$2 -> oa.a().a(ob.c, $$2 != dtj.b && $$2 != dtj.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alf $$0 = oh.bM.a(dfb.qV, oi.a(false), this.c);
      alf $$1 = oh.bM.a(dfb.qV, "_can_summon", oi.a(true), this.c);
      this.a(dfb.qV, $$0);
      this.b.accept(nx.a(dfb.qV).a(a(dss.G, $$1, $$0)));
   }

   private void ai() {
      alf $$0 = of.a(dfb.nS, "_stable");
      alf $$1 = of.a(dfb.nS, "_unstable");
      this.a(dfb.nS, $$0);
      this.b.accept(nx.a(dfb.nS).a(a(dss.b, $$1, $$0)));
   }

   private void aj() {
      alf $$0 = this.a(dfb.sv, "", oh.ao, oi::c);
      alf $$1 = this.a(dfb.sv, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dfb.sv).a(a(dss.D, $$1, $$0)));
      alf $$2 = this.a(dfb.sw, "", oh.ao, oi::c);
      alf $$3 = this.a(dfb.sw, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dfb.sw).a(a(dss.D, $$3, $$2)));
   }

   private void ak() {
      alf $$0 = ok.a.create(dfb.fB, this.c);
      alf $$1 = this.a(dfb.fB, "_on", oh.c, oi::b);
      this.b.accept(nx.a(dfb.fB).a(a(dss.r, $$1, $$0)));
   }

   private void l(dez $$0, dez $$1) {
      oi $$2 = oi.y($$0);
      this.b.accept(c($$0, oh.bf.a($$0, $$2, this.c)));
      this.b.accept(nx.a($$1, oa.a().a(ob.c, oh.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oi $$0 = oi.y(dfb.dK);
      oi $$1 = oi.i(oi.a(dfb.dK, "_off"));
      alf $$2 = oh.bf.a(dfb.dK, $$0, this.c);
      alf $$3 = oh.bf.a(dfb.dK, "_off", $$1, this.c);
      this.b.accept(nx.a(dfb.dK).a(a(dss.r, $$2, $$3)));
      alf $$4 = oh.bg.a(dfb.dL, $$0, this.c);
      alf $$5 = oh.bg.a(dfb.dL, "_off", $$1, this.c);
      this.b.accept(nx.a(dfb.dL).a(a(dss.r, $$4, $$5)).a(d()));
      this.d(dfb.dK);
      this.c(dfb.dL);
   }

   private void am() {
      this.a(cus.lK);
      this.b.accept(nx.a(dfb.eh).a(ny.a(dss.aA, dss.s, dss.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oa.a().a(ob.c, oi.a(dfb.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cus.cT);
      this.b
         .accept(
            nx.a(dfb.mV)
               .a(
                  ny.a(dss.aS, dss.C)
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
      oi $$0 = oi.a(dfb.dN);
      alf $$1 = oh.c.a(dfb.dP, $$0, this.c);
      this.b.accept(nx.a(dfb.dN).a(ny.a(dss.aF).a($$1x -> oa.a().a(ob.c, $$1x < 8 ? of.a(dfb.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dfb.dN, of.a(dfb.dN, "_height2"));
      this.b.accept(c(dfb.dP, $$1));
   }

   private void ap() {
      this.b.accept(nx.a(dfb.oc, oa.a().a(ob.c, of.a(dfb.oc))).a(b()));
   }

   private void aq() {
      alf $$0 = ok.a.create(dfb.pa, this.c);
      this.a(dfb.pa, $$0);
      this.b.accept(nx.a(dfb.pa).a(ny.a(dss.bj).a($$0x -> oa.a().a(ob.c, this.a(dfb.pa, "_" + $$0x.c(), oh.c, oi::b)))));
   }

   private void ar() {
      this.a(cus.wr);
      this.b.accept(nx.a(dfb.oi).a(ny.a(dss.as).a($$0 -> oa.a().a(ob.c, this.a(dfb.oi, "_stage" + $$0, oh.ao, oi::c)))));
   }

   private void as() {
      this.a(cus.ps);
      this.b
         .accept(
            nx.a(dfb.fI)
               .a(
                  ny.a(dss.a, dss.M, dss.L, dss.N, dss.O)
                     .a(false, false, false, false, false, oa.a().a(ob.c, of.a(dfb.fI, "_ns")))
                     .a(false, true, false, false, false, oa.a().a(ob.c, of.a(dfb.fI, "_n")).a(ob.b, ob.a.b))
                     .a(false, false, true, false, false, oa.a().a(ob.c, of.a(dfb.fI, "_n")))
                     .a(false, false, false, true, false, oa.a().a(ob.c, of.a(dfb.fI, "_n")).a(ob.b, ob.a.c))
                     .a(false, false, false, false, true, oa.a().a(ob.c, of.a(dfb.fI, "_n")).a(ob.b, ob.a.d))
                     .a(false, true, true, false, false, oa.a().a(ob.c, of.a(dfb.fI, "_ne")))
                     .a(false, true, false, true, false, oa.a().a(ob.c, of.a(dfb.fI, "_ne")).a(ob.b, ob.a.b))
                     .a(false, false, false, true, true, oa.a().a(ob.c, of.a(dfb.fI, "_ne")).a(ob.b, ob.a.c))
                     .a(false, false, true, false, true, oa.a().a(ob.c, of.a(dfb.fI, "_ne")).a(ob.b, ob.a.d))
                     .a(false, false, true, true, false, oa.a().a(ob.c, of.a(dfb.fI, "_ns")))
                     .a(false, true, false, false, true, oa.a().a(ob.c, of.a(dfb.fI, "_ns")).a(ob.b, ob.a.b))
                     .a(false, true, true, true, false, oa.a().a(ob.c, of.a(dfb.fI, "_nse")))
                     .a(false, true, false, true, true, oa.a().a(ob.c, of.a(dfb.fI, "_nse")).a(ob.b, ob.a.b))
                     .a(false, false, true, true, true, oa.a().a(ob.c, of.a(dfb.fI, "_nse")).a(ob.b, ob.a.c))
                     .a(false, true, true, false, true, oa.a().a(ob.c, of.a(dfb.fI, "_nse")).a(ob.b, ob.a.d))
                     .a(false, true, true, true, true, oa.a().a(ob.c, of.a(dfb.fI, "_nsew")))
                     .a(true, false, false, false, false, oa.a().a(ob.c, of.a(dfb.fI, "_attached_ns")))
                     .a(true, false, true, false, false, oa.a().a(ob.c, of.a(dfb.fI, "_attached_n")))
                     .a(true, false, false, true, false, oa.a().a(ob.c, of.a(dfb.fI, "_attached_n")).a(ob.b, ob.a.c))
                     .a(true, true, false, false, false, oa.a().a(ob.c, of.a(dfb.fI, "_attached_n")).a(ob.b, ob.a.b))
                     .a(true, false, false, false, true, oa.a().a(ob.c, of.a(dfb.fI, "_attached_n")).a(ob.b, ob.a.d))
                     .a(true, true, true, false, false, oa.a().a(ob.c, of.a(dfb.fI, "_attached_ne")))
                     .a(true, true, false, true, false, oa.a().a(ob.c, of.a(dfb.fI, "_attached_ne")).a(ob.b, ob.a.b))
                     .a(true, false, false, true, true, oa.a().a(ob.c, of.a(dfb.fI, "_attached_ne")).a(ob.b, ob.a.c))
                     .a(true, false, true, false, true, oa.a().a(ob.c, of.a(dfb.fI, "_attached_ne")).a(ob.b, ob.a.d))
                     .a(true, false, true, true, false, oa.a().a(ob.c, of.a(dfb.fI, "_attached_ns")))
                     .a(true, true, false, false, true, oa.a().a(ob.c, of.a(dfb.fI, "_attached_ns")).a(ob.b, ob.a.b))
                     .a(true, true, true, true, false, oa.a().a(ob.c, of.a(dfb.fI, "_attached_nse")))
                     .a(true, true, false, true, true, oa.a().a(ob.c, of.a(dfb.fI, "_attached_nse")).a(ob.b, ob.a.b))
                     .a(true, false, true, true, true, oa.a().a(ob.c, of.a(dfb.fI, "_attached_nse")).a(ob.b, ob.a.c))
                     .a(true, true, true, false, true, oa.a().a(ob.c, of.a(dfb.fI, "_attached_nse")).a(ob.b, ob.a.d))
                     .a(true, true, true, true, true, oa.a().a(ob.c, of.a(dfb.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dfb.fH);
      this.b.accept(nx.a(dfb.fH).a(ny.a(dss.a, dss.w).a(($$0, $$1) -> oa.a().a(ob.c, oi.a(dfb.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
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
            return this.a($$0.intValue(), "", oi.b(oi.G(dfb.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oi.b(oi.a(dfb.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oi.b(oi.a(dfb.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cus.kp);
      this.b.accept(nx.a(dfb.mf).a(ny.a(dss.aD, dss.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cus.kq);
      Function<Integer, alf> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oi $$2 = oi.a($$1);
         return oh.bw.a(dfb.mg, $$1, $$2, this.c);
      };
      this.b.accept(nx.a(dfb.mg).a(ny.a(dmh.c).a($$1 -> oa.a().a(ob.c, $$0.apply($$1)))));
   }

   private void F(dez $$0) {
      this.d($$0);
      alf $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      nv.c $$3 = ac.a(nv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dst, Function<alf, oa>> $$4 : a) {
         dst $$5 = (dst)$$4.getFirst();
         Function<alf, oa> $$6 = (Function<alf, oa>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(nv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      alf $$0 = oi.a(dfb.qU, "_bottom");
      oi $$1 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dfb.qU, "_top")).a(oj.i, oi.a(dfb.qU, "_side"));
      oi $$2 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dfb.qU, "_top_bloom")).a(oj.i, oi.a(dfb.qU, "_side_bloom"));
      alf $$3 = oh.n.a(dfb.qU, "", $$1, this.c);
      alf $$4 = oh.n.a(dfb.qU, "_bloom", $$2, this.c);
      this.b.accept(nx.a(dfb.qU).a(ny.a(dss.E).a($$2x -> oa.a().a(ob.c, $$2x ? $$4 : $$3))));
      this.a(cus.gj, $$3);
   }

   private void ax() {
      dez $$0 = dfb.cm;
      alf $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      List.of(Pair.of(je.c, ob.a.a), Pair.of(je.f, ob.a.b), Pair.of(je.d, ob.a.c), Pair.of(je.e, ob.a.d)).forEach($$2x -> {
         je $$3 = (je)$$2x.getFirst();
         ob.a $$4 = (ob.a)$$2x.getSecond();
         nv.c $$5 = nv.a().a(dss.R, $$3);
         $$2.a($$5, oa.a().a(ob.c, $$1).a(ob.b, $$4).a(ob.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, of.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2) {
      List.of(Pair.of(dss.bp, oh.aM), Pair.of(dss.bq, oh.aN), Pair.of(dss.br, oh.aO), Pair.of(dss.bs, oh.aP), Pair.of(dss.bt, oh.aQ), Pair.of(dss.bu, oh.aR))
         .forEach($$3 -> {
            dst $$4 = (dst)$$3.getFirst();
            og $$5 = (og)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2, dst $$3, og $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oi $$7 = new oi().a(oj.b, oi.a(dfb.cm, $$6));
      nr.d $$8 = new nr.d($$4, $$6);
      alf $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dfb.cm, $$6, $$7, this.c));
      $$0.a(nv.a($$1, nv.a().a($$3, $$5)), oa.a().a(ob.c, $$9).a(ob.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dfb.kJ, oh.c.a(dfb.kJ, oi.b(of.a("magma")), this.c)));
   }

   private void G(dez $$0) {
      this.b($$0, ok.q);
      oh.bD.a(of.a($$0.r()), oi.u($$0), this.c);
   }

   private void b(dez $$0, dez $$1, nr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dez $$0, dez $$1) {
      oh.bE.a(of.a($$0.r()), oi.u($$1), this.c);
   }

   private void az() {
      alf $$0 = of.a(dfb.b);
      alf $$1 = of.a(dfb.b, "_mirrored");
      this.b.accept(a(dfb.eN, $$0, $$1));
      this.a(dfb.eN, $$0);
   }

   private void aA() {
      alf $$0 = of.a(dfb.sJ);
      alf $$1 = of.a(dfb.sJ, "_mirrored");
      this.b.accept(a(dfb.td, $$0, $$1).a(f()));
      this.a(dfb.td, $$0);
   }

   private void n(dez $$0, dez $$1) {
      this.a($$0, nr.e.b);
      oi $$2 = oi.d(oi.a($$0, "_pot"));
      alf $$3 = nr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alf $$0 = oi.a(dfb.pl, "_bottom");
      alf $$1 = oi.a(dfb.pl, "_top_off");
      alf $$2 = oi.a(dfb.pl, "_top");
      alf[] $$3 = new alf[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oi $$5 = new oi().a(oj.e, $$0).a(oj.f, $$4 == 0 ? $$1 : $$2).a(oj.i, oi.a(dfb.pl, "_side" + $$4));
         $$3[$$4] = oh.n.a(dfb.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nx.a(dfb.pl).a(ny.a(dss.aZ).a($$1x -> oa.a().a(ob.c, $$3[$$1x]))));
      this.a(cus.wP, $$3[0]);
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
      alf $$0 = oi.a(dfb.pb, "_top");
      alf $$1 = oi.a(dfb.pb, "_bottom");
      alf $$2 = oi.a(dfb.pb, "_side");
      alf $$3 = oi.a(dfb.pb, "_lock");
      oi $$4 = new oi().a(oj.o, $$2).a(oj.m, $$2).a(oj.l, $$2).a(oj.c, $$0).a(oj.j, $$0).a(oj.k, $$1).a(oj.n, $$3);
      alf $$5 = oh.b.a(dfb.pb, $$4, this.c);
      this.b.accept(nx.a(dfb.pb, oa.a().a(ob.c, $$5)).a(ny.a(dss.T).a($$0x -> this.a($$0x, oa.a()))));
   }

   private void aD() {
      dez $$0 = dfb.n;
      alf $$1 = of.a($$0);
      ok $$2 = ok.a.get($$0);
      dez $$3 = dfb.jH;
      alf $$4 = oh.ab.a($$3, $$2.b(), this.c);
      alf $$5 = oh.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ls.a().filter(lt::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dfb.rf).a(ls.w).a(dfb.rf, dfb.rD).a(dfb.rj, dfb.rn).a(ls.y);
      this.h(dfb.re).a(ls.A).a(dfb.re, dfb.rC).a(dfb.ri, dfb.rm).a(ls.C);
      this.h(dfb.rd).a(ls.E).a(dfb.rd, dfb.rB).a(dfb.rh, dfb.rl).a(ls.G);
      this.h(dfb.rc).a(ls.I).a(dfb.rc, dfb.rA).a(dfb.rg, dfb.rk).a(ls.K);
      this.w(dfb.sk);
      this.w(dfb.sl);
      this.w(dfb.sm);
      this.w(dfb.sn);
      this.i(dfb.sk, dfb.so);
      this.i(dfb.sl, dfb.sp);
      this.i(dfb.sm, dfb.sq);
      this.i(dfb.sn, dfb.sr);
      this.m(dfb.a);
      this.c(dfb.nc, dfb.a);
      this.c(dfb.nb, dfb.a);
      this.m(dfb.fO);
      this.m(dfb.dQ);
      this.c(dfb.nd, dfb.G);
      this.m(dfb.fA);
      this.m(dfb.me);
      this.m(dfb.fr);
      this.m(dfb.fR);
      this.a(cus.ue);
      this.m(dfb.pg);
      this.m(dfb.G);
      this.m(dfb.H);
      this.m(dfb.hV);
      this.a(cus.fS);
      this.o(dfb.pM, dfb.qd);
      this.o(dfb.pN, dfb.qe);
      this.o(dfb.pO, dfb.qf);
      this.o(dfb.pP, dfb.qg);
      this.o(dfb.pQ, dfb.qh);
      this.o(dfb.pR, dfb.qi);
      this.o(dfb.pS, dfb.qj);
      this.o(dfb.pT, dfb.qk);
      this.o(dfb.pU, dfb.ql);
      this.o(dfb.pV, dfb.qm);
      this.o(dfb.pW, dfb.qn);
      this.o(dfb.pX, dfb.qo);
      this.o(dfb.pY, dfb.qp);
      this.o(dfb.pZ, dfb.qq);
      this.o(dfb.qa, dfb.qr);
      this.o(dfb.qb, dfb.qs);
      this.o(dfb.pL, dfb.qc);
      this.m(dfb.na);
      this.m(dfb.gs);
      this.m(dfb.qP);
      this.m(dfb.sx);
      this.s(dfb.sy);
      this.s(dfb.sz);
      this.t(dfb.ti);
      this.t(dfb.tj);
      this.aj();
      this.g(dfb.sC, dfb.sA);
      this.p(dfb.sB);
      this.a(dfb.hW, cus.hB);
      this.a(cus.hB);
      this.aE();
      this.a(dfb.kN, cus.jb);
      this.a(cus.jb);
      this.f(dfb.bQ, oi.a(dfb.by, "_side"));
      this.a(dfb.R);
      this.a(dfb.S);
      this.a(dfb.iB);
      this.a(dfb.cx);
      this.a(dfb.cy);
      this.a(dfb.cz);
      this.a(dfb.fE);
      this.a(dfb.fF);
      this.a(dfb.fJ);
      this.a(dfb.N);
      this.a(dfb.T);
      this.a(dfb.O);
      this.a(dfb.ch);
      this.a(dfb.P);
      this.a(dfb.Q);
      this.a(dfb.ci);
      this.b(dfb.pj, ok.d);
      this.a(dfb.pi);
      this.a(dfb.aR);
      this.a(dfb.aS);
      this.a(dfb.aT);
      this.a(dfb.hb);
      this.a(dfb.dI);
      this.a(dfb.dJ);
      this.a(dfb.ha);
      this.a(dfb.pC);
      this.a(dfb.mW);
      this.a(dfb.dR);
      this.a(dfb.k);
      this.a(dfb.pk);
      this.a(dfb.fz);
      this.a(dfb.ec);
      this.a(dfb.L);
      this.a(dfb.ph);
      this.a(dfb.dO);
      this.b(dfb.dT, ok.g);
      this.b(dfb.pq, ok.d);
      this.b(dfb.fa, ok.d);
      this.m(dfb.ac);
      this.m(dfb.ga);
      this.a(dfb.kK);
      this.a(dfb.aY);
      this.a(dfb.iC);
      this.a(dfb.co);
      this.a(dfb.pK);
      this.a(dfb.ii);
      this.a(dfb.oy);
      this.a(dfb.dW);
      this.a(dfb.dX);
      this.b(dfb.ct, ok.b);
      this.a(dfb.aO);
      this.b(dfb.bw, ok.v);
      this.a(cus.cS);
      this.b(dfb.ck, ok.f);
      this.b(dfb.pd, ok.d);
      this.a(dfb.op);
      this.a(dfb.aP);
      this.a(dfb.qt);
      this.a(dfb.qu);
      this.a(dfb.qN);
      this.a(dfb.su);
      this.a(dfb.tf);
      this.a(dfb.tg);
      this.a(dfb.th);
      this.e(dfb.qS);
      this.m(dfb.tt);
      this.aD();
      this.a(dfb.ra);
      this.a(dfb.rb);
      this.a(dfb.qW);
      this.a(dfb.qX);
      this.a(dfb.qY);
      this.a(dfb.qZ);
      this.k(dfb.qW, dfb.rw);
      this.k(dfb.qX, dfb.ry);
      this.k(dfb.qY, dfb.rx);
      this.k(dfb.qZ, dfb.rz);
      this.i(dfb.rM);
      this.i(dfb.rN);
      this.i(dfb.rP);
      this.i(dfb.rO);
      this.a(dfb.rM, dfb.rQ);
      this.a(dfb.rN, dfb.rR);
      this.a(dfb.rP, dfb.rT);
      this.a(dfb.rO, dfb.rS);
      this.k(dfb.rU);
      this.k(dfb.rV);
      this.k(dfb.rX);
      this.k(dfb.rW);
      this.b(dfb.rU, dfb.rY);
      this.b(dfb.rV, dfb.rZ);
      this.b(dfb.rX, dfb.sb);
      this.b(dfb.rW, dfb.sa);
      this.a(dfb.sc);
      this.a(dfb.sd);
      this.a(dfb.se);
      this.a(dfb.sf);
      this.k(dfb.sc, dfb.sg);
      this.k(dfb.sd, dfb.sh);
      this.k(dfb.se, dfb.si);
      this.k(dfb.sf, dfb.sj);
      this.j(dfb.gW, dfb.ch);
      this.j(dfb.gX, dfb.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dfb.og, dfb.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dfb.kt);
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
      this.F(dfb.ff);
      this.F(dfb.fg);
      this.F(dfb.qT);
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
      this.E(dfb.cO);
      this.d(dfb.cO);
      this.E(dfb.oa);
      this.g();
      this.E(dfb.sE);
      this.l(dfb.cp, dfb.cq);
      this.l(dfb.ea, dfb.eb);
      this.a(dfb.cA, dfb.n, oi::c);
      this.a(dfb.nY, dfb.p, oi::d);
      this.y(dfb.ow);
      this.y(dfb.on);
      this.v(dfb.aU);
      this.v(dfb.hi);
      this.C();
      this.D(dfb.oe);
      this.D(dfb.of);
      this.e(dfb.eX, of.a(dfb.eX));
      this.a(dfb.dY, ok.d);
      this.a(dfb.dZ, ok.d);
      this.a(dfb.te);
      this.a(dfb.kM, ok.d);
      this.f(dfb.j);
      this.f(dfb.sH);
      this.f(dfb.I);
      this.g(dfb.J);
      this.g(dfb.M);
      this.f(dfb.K);
      this.e(dfb.F);
      this.b(dfb.to, ok.f);
      this.a(dfb.ij, ok.d, ok.e);
      this.a(dfb.kx, ok.w, ok.x);
      this.a(dfb.hf, ok.w, ok.x);
      this.a(dfb.tk, ok.d, ok.e);
      this.a(dfb.tl, ok.d, ok.e);
      this.a(dfb.tm, ok.d, ok.e);
      this.c(dfb.nT, ok.i);
      this.z();
      this.a(dfb.pe, oi::A);
      this.a(dfb.pf, oi::C);
      this.a(dfb.kD, dss.as, 0, 1, 2, 3);
      this.a(dfb.gt, dss.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfb.fq, dss.as, 0, 1, 1, 2);
      this.a(dfb.gu, dss.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfb.cB, dss.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dfb.kA, nr.e.b, dss.aq, 0, 1);
      this.i();
      this.h();
      this.a(of.a("decorated_pot"), dfb.iA).b(dfb.tp);
      this.a(of.a("banner"), dfb.n)
         .a(oh.bF, dfb.iJ, dfb.iK, dfb.iL, dfb.iM, dfb.iN, dfb.iO, dfb.iP, dfb.iQ, dfb.iR, dfb.iS, dfb.iT, dfb.iU, dfb.iV, dfb.iW, dfb.iX, dfb.iY)
         .b(dfb.iZ, dfb.ja, dfb.jb, dfb.jc, dfb.jd, dfb.je, dfb.jf, dfb.jg, dfb.jh, dfb.ji, dfb.jj, dfb.jk, dfb.jl, dfb.jm, dfb.jn, dfb.jo);
      this.a(of.a("bed"), dfb.n)
         .b(dfb.aZ, dfb.ba, dfb.bb, dfb.bc, dfb.bd, dfb.be, dfb.bf, dfb.bg, dfb.bh, dfb.bi, dfb.bj, dfb.bk, dfb.bl, dfb.bm, dfb.bn, dfb.bo);
      this.m(dfb.aZ, dfb.bA);
      this.m(dfb.ba, dfb.bB);
      this.m(dfb.bb, dfb.bC);
      this.m(dfb.bc, dfb.bD);
      this.m(dfb.bd, dfb.bE);
      this.m(dfb.be, dfb.bF);
      this.m(dfb.bf, dfb.bG);
      this.m(dfb.bg, dfb.bH);
      this.m(dfb.bh, dfb.bI);
      this.m(dfb.bi, dfb.bJ);
      this.m(dfb.bj, dfb.bK);
      this.m(dfb.bk, dfb.bL);
      this.m(dfb.bl, dfb.bM);
      this.m(dfb.bm, dfb.bN);
      this.m(dfb.bn, dfb.bO);
      this.m(dfb.bo, dfb.bP);
      this.a(of.a("skull"), dfb.dW)
         .a(oh.bG, dfb.gM, dfb.gK, dfb.gI, dfb.gE, dfb.gG, dfb.gQ)
         .a(dfb.gO)
         .b(dfb.gN, dfb.gP, dfb.gL, dfb.gJ, dfb.gF, dfb.gH, dfb.gR);
      this.G(dfb.kP);
      this.G(dfb.kQ);
      this.G(dfb.kR);
      this.G(dfb.kS);
      this.G(dfb.kT);
      this.G(dfb.kU);
      this.G(dfb.kV);
      this.G(dfb.kW);
      this.G(dfb.kX);
      this.G(dfb.kY);
      this.G(dfb.kZ);
      this.G(dfb.la);
      this.G(dfb.lb);
      this.G(dfb.lc);
      this.G(dfb.ld);
      this.G(dfb.le);
      this.G(dfb.lf);
      this.b(dfb.mX, ok.q);
      this.c(dfb.mX);
      this.a(of.a("chest"), dfb.n).b(dfb.cv, dfb.gV);
      this.a(of.a("ender_chest"), dfb.co).b(dfb.fG);
      this.f(dfb.fx, dfb.co).a(dfb.fx, dfb.kF);
      this.a(dfb.aM);
      this.a(dfb.aN);
      this.a(dfb.lw);
      this.a(dfb.lx);
      this.a(dfb.ly);
      this.a(dfb.lz);
      this.a(dfb.lA);
      this.a(dfb.lB);
      this.a(dfb.lC);
      this.a(dfb.lD);
      this.a(dfb.lE);
      this.a(dfb.lF);
      this.a(dfb.lG);
      this.a(dfb.lH);
      this.a(dfb.lI);
      this.a(dfb.lJ);
      this.a(dfb.lK);
      this.a(dfb.lL);
      this.a(ok.a, dfb.lM, dfb.lN, dfb.lO, dfb.lP, dfb.lQ, dfb.lR, dfb.lS, dfb.lT, dfb.lU, dfb.lV, dfb.lW, dfb.lX, dfb.lY, dfb.lZ, dfb.ma, dfb.mb);
      this.a(dfb.iA);
      this.a(dfb.hj);
      this.a(dfb.hk);
      this.a(dfb.hl);
      this.a(dfb.hm);
      this.a(dfb.hn);
      this.a(dfb.ho);
      this.a(dfb.hp);
      this.a(dfb.hq);
      this.a(dfb.hr);
      this.a(dfb.hs);
      this.a(dfb.ht);
      this.a(dfb.hu);
      this.a(dfb.hv);
      this.a(dfb.hw);
      this.a(dfb.hx);
      this.a(dfb.hy);
      this.a(dfb.qO);
      this.h(dfb.aQ, dfb.eY);
      this.h(dfb.ei, dfb.hz);
      this.h(dfb.ej, dfb.hA);
      this.h(dfb.ek, dfb.hB);
      this.h(dfb.el, dfb.hC);
      this.h(dfb.em, dfb.hD);
      this.h(dfb.en, dfb.hE);
      this.h(dfb.eo, dfb.hF);
      this.h(dfb.ep, dfb.hG);
      this.h(dfb.eq, dfb.hH);
      this.h(dfb.er, dfb.hI);
      this.h(dfb.es, dfb.hJ);
      this.h(dfb.et, dfb.hK);
      this.h(dfb.eu, dfb.hL);
      this.h(dfb.ev, dfb.hM);
      this.h(dfb.ew, dfb.hN);
      this.h(dfb.ex, dfb.hO);
      this.b(ok.o, dfb.lg, dfb.lh, dfb.li, dfb.lj, dfb.lk, dfb.ll, dfb.lm, dfb.ln, dfb.lo, dfb.lp, dfb.lq, dfb.lr, dfb.ls, dfb.lt, dfb.lu, dfb.lv);
      this.g(dfb.bA, dfb.ik);
      this.g(dfb.bB, dfb.il);
      this.g(dfb.bC, dfb.im);
      this.g(dfb.bD, dfb.in);
      this.g(dfb.bE, dfb.io);
      this.g(dfb.bF, dfb.ip);
      this.g(dfb.bG, dfb.iq);
      this.g(dfb.bH, dfb.ir);
      this.g(dfb.bI, dfb.is);
      this.g(dfb.bJ, dfb.it);
      this.g(dfb.bK, dfb.iu);
      this.g(dfb.bL, dfb.iv);
      this.g(dfb.bM, dfb.iw);
      this.g(dfb.bN, dfb.ix);
      this.g(dfb.bO, dfb.iy);
      this.g(dfb.bP, dfb.iz);
      this.a(dfb.sI);
      this.a(dfb.eL);
      this.a(dfb.bu, dfb.gb, nr.e.a);
      this.a(dfb.bR, dfb.gc, nr.e.b);
      this.a(dfb.bT, dfb.gd, nr.e.b);
      this.a(dfb.bU, dfb.ge, nr.e.b);
      this.a(dfb.bV, dfb.gf, nr.e.b);
      this.a(dfb.bW, dfb.gg, nr.e.b);
      this.a(dfb.bX, dfb.gh, nr.e.b);
      this.a(dfb.bY, dfb.gi, nr.e.b);
      this.a(dfb.bZ, dfb.gj, nr.e.b);
      this.a(dfb.ca, dfb.gk, nr.e.b);
      this.a(dfb.cb, dfb.gl, nr.e.b);
      this.a(dfb.cc, dfb.gm, nr.e.b);
      this.a(dfb.ce, dfb.gn, nr.e.b);
      this.a(dfb.cd, dfb.go, nr.e.b);
      this.a(dfb.cg, dfb.gp, nr.e.b);
      this.a(dfb.cf, dfb.gq, nr.e.b);
      this.a(dfb.bv, dfb.gr, nr.e.b);
      this.a(dfb.bS, dfb.fS, nr.e.b);
      this.H();
      this.u(dfb.eT);
      this.u(dfb.eU);
      this.u(dfb.eV);
      this.a(dfb.bt, nr.e.a);
      this.b(dfb.dS, nr.e.a);
      this.a(cus.dJ);
      this.b(dfb.mc, dfb.md, nr.e.b);
      this.a(cus.dK);
      this.c(dfb.md);
      this.b(dfb.sG, nr.e.b);
      this.c(dfb.sG);
      this.c(dfb.sw);
      this.b(dfb.oz, dfb.oA, nr.e.b);
      this.b(dfb.oB, dfb.oC, nr.e.b);
      this.a(dfb.oz, "_plant");
      this.c(dfb.oA);
      this.a(dfb.oB, "_plant");
      this.c(dfb.oC);
      this.a(dfb.mY, nr.e.a, oi.c(oi.a(dfb.mZ, "_stage0")));
      this.m();
      this.a(dfb.bs, nr.e.b);
      this.c(dfb.iE, nr.e.b);
      this.c(dfb.iF, nr.e.b);
      this.c(dfb.iG, nr.e.b);
      this.c(dfb.iH, nr.e.a);
      this.c(dfb.iI, nr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dfb.mw, dfb.mr, dfb.mm, dfb.mh, dfb.mG, dfb.mB, dfb.mQ, dfb.mL);
      this.a(dfb.mx, dfb.ms, dfb.mn, dfb.mi, dfb.mH, dfb.mC, dfb.mR, dfb.mM);
      this.a(dfb.my, dfb.mt, dfb.mo, dfb.mj, dfb.mI, dfb.mD, dfb.mS, dfb.mN);
      this.a(dfb.mz, dfb.mu, dfb.mp, dfb.mk, dfb.mJ, dfb.mE, dfb.mT, dfb.mO);
      this.a(dfb.mA, dfb.mv, dfb.mq, dfb.ml, dfb.mK, dfb.mF, dfb.mU, dfb.mP);
      this.e(dfb.fe, dfb.fc);
      this.e(dfb.fd, dfb.fb);
      this.l(dfb.ab).c(dfb.ab).a(dfb.av);
      this.l(dfb.am).c(dfb.am).a(dfb.aD);
      this.a(dfb.am, dfb.dj, dfb.ds);
      this.b(dfb.aL, ok.s);
      this.l(dfb.Y).c(dfb.Y).a(dfb.as);
      this.l(dfb.ai).c(dfb.ai).a(dfb.aA);
      this.a(dfb.ai, dfb.dd, dfb.do);
      this.a(dfb.B, dfb.fX, nr.e.b);
      this.b(dfb.aI, ok.s);
      this.l(dfb.Z).d(dfb.Z).a(dfb.at);
      this.l(dfb.aj).d(dfb.aj).a(dfb.aB);
      this.a(dfb.aj, dfb.de, dfb.dp);
      this.a(dfb.C, dfb.fY, nr.e.b);
      this.b(dfb.aJ, ok.s);
      this.l(dfb.W).c(dfb.W).a(dfb.aq);
      this.l(dfb.ag).c(dfb.ag).a(dfb.ay);
      this.a(dfb.ag, dfb.dc, dfb.dn);
      this.a(dfb.z, dfb.fV, nr.e.b);
      this.b(dfb.aG, ok.s);
      this.l(dfb.U).c(dfb.U).a(dfb.ao);
      this.l(dfb.al).c(dfb.al).a(dfb.aw);
      this.a(dfb.al, dfb.da, dfb.dl);
      this.a(dfb.x, dfb.fT, nr.e.b);
      this.b(dfb.aE, ok.s);
      this.l(dfb.V).c(dfb.V).a(dfb.ap);
      this.l(dfb.af).c(dfb.af).a(dfb.ax);
      this.a(dfb.af, dfb.db, dfb.dm);
      this.a(dfb.y, dfb.fU, nr.e.b);
      this.b(dfb.aF, ok.s);
      this.l(dfb.aa).c(dfb.aa).a(dfb.au);
      this.l(dfb.ak).c(dfb.ak).a(dfb.aC);
      this.a(dfb.ak, dfb.dg, dfb.dr);
      this.a(dfb.D, dfb.fZ, nr.e.b);
      this.b(dfb.aK, ok.s);
      this.l(dfb.X).c(dfb.X).a(dfb.ar);
      this.l(dfb.ah).c(dfb.ah).a(dfb.az);
      this.a(dfb.ah, dfb.df, dfb.dq);
      this.a(dfb.A, dfb.fW, nr.e.b);
      this.b(dfb.aH, ok.s);
      this.l(dfb.os).b(dfb.os).a(dfb.ou);
      this.l(dfb.ot).b(dfb.ot).a(dfb.ov);
      this.a(dfb.ot, dfb.dh, dfb.dt);
      this.a(dfb.ox, dfb.pm, nr.e.b);
      this.n(dfb.oD, dfb.po);
      this.l(dfb.oj).b(dfb.oj).a(dfb.ol);
      this.l(dfb.ok).b(dfb.ok).a(dfb.om);
      this.a(dfb.ok, dfb.di, dfb.du);
      this.a(dfb.oo, dfb.pn, nr.e.b);
      this.n(dfb.oq, dfb.pp);
      this.l(dfb.ae).d(dfb.ae);
      this.l(dfb.an).d(dfb.an);
      this.a(dfb.v, dfb.dk, dfb.dv);
      this.b(dfb.or, nr.e.b);
      this.a(cus.dG);
      this.i(dfb.dy);
      this.k(dfb.hY);
      this.u();
      this.n(dfb.cP);
      this.o(dfb.bp);
      this.o(dfb.bq);
      this.o(dfb.hh);
      this.t();
      this.q(dfb.fN);
      this.q(dfb.kG);
      this.q(dfb.kH);
      this.r(dfb.gS);
      this.r(dfb.gT);
      this.r(dfb.gU);
      this.o();
      this.p();
      this.d(dfb.cD, ok.h);
      this.d(dfb.nW, ok.h);
      this.d(dfb.nV, ok.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dfb.eK, dfb.eS);
      this.k(dfb.m, dfb.eO);
      this.k(dfb.eJ, dfb.eR);
      this.k(dfb.eI, dfb.eQ);
      this.az();
      this.k(dfb.eH, dfb.eP);
      this.aA();
      cvw.h().forEach($$0 -> this.a($$0, of.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dfb.hX);
      ny.a<Integer> $$0 = ny.a(dss.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alf $$3 = oi.a(cus.hC, $$2);
         $$0.a($$1, oa.a().a(ob.c, oh.aa.a(dfb.hX, $$2, oi.h($$3), this.c)));
         oh.bx.a(of.a(cus.hC, $$2), oi.k($$3), this.c);
      }

      this.b.accept(nx.a(dfb.hX).a($$0));
   }

   private void o(dez $$0, dez $$1) {
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
                  ny.a(dss.az, dss.r)
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
      this.b.accept(nx.a($$1).a(a(dss.r, $$13, $$12)));
   }

   class a {
      private final alf b;

      public a(final alf $$0, final dez $$1) {
         this.b = oh.aa.a($$0, oi.u($$1), nr.this.c);
      }

      public nr.a a(dez... $$0) {
         for (dez $$1 : $$0) {
            nr.this.b.accept(nr.c($$1, this.b));
         }

         return this;
      }

      public nr.a b(dez... $$0) {
         for (dez $$1 : $$0) {
            nr.this.c($$1);
         }

         return this.a($$0);
      }

      public nr.a a(og $$0, dez... $$1) {
         for (dez $$2 : $$1) {
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
      private final Set<dez> f = new HashSet<>();

      public b(final oi $$0) {
         this.b = $$0;
      }

      public nr.b a(dez $$0, og $$1) {
         this.e = $$1.a($$0, this.b, nr.this.c);
         if (nr.this.f.containsKey($$0)) {
            nr.this.b.accept(nr.this.f.get($$0).create($$0, this.e, this.b, nr.this.c));
         } else {
            nr.this.b.accept(nr.c($$0, this.e));
         }

         return this;
      }

      public nr.b a(dez $$0, dez $$1) {
         alf $$2 = of.a($$0);
         nr.this.b.accept(nr.c($$1, $$2));
         nr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nr.b a(dez $$0) {
         alf $$1 = oh.s.a($$0, this.b, nr.this.c);
         alf $$2 = oh.t.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.b($$0, $$1, $$2));
         alf $$3 = oh.u.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b b(dez $$0) {
         alf $$1 = oh.M.a($$0, this.b, nr.this.c);
         alf $$2 = oh.N.a($$0, this.b, nr.this.c);
         alf $$3 = oh.O.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3));
         alf $$4 = oh.P.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$4);
         return this;
      }

      public nr.b c(dez $$0) {
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

      public nr.b d(dez $$0) {
         alf $$1 = oh.J.a($$0, this.b, nr.this.c);
         alf $$2 = oh.K.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$1, $$2));
         alf $$3 = oh.L.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b e(dez $$0) {
         oi $$1 = oi.p($$0);
         alf $$2 = oh.R.a($$0, $$1, nr.this.c);
         alf $$3 = oh.Q.a($$0, $$1, nr.this.c);
         alf $$4 = oh.T.a($$0, $$1, nr.this.c);
         alf $$5 = oh.S.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nr.b f(dez $$0) {
         alf $$1 = oh.V.a($$0, this.b, nr.this.c);
         alf $$2 = oh.U.a($$0, this.b, nr.this.c);
         alf $$3 = oh.X.a($$0, this.b, nr.this.c);
         alf $$4 = oh.W.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nr.b g(dez $$0) {
         alf $$1 = oh.Y.a($$0, this.b, nr.this.c);
         alf $$2 = oh.Z.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.e($$0, $$1, $$2));
         return this;
      }

      public nr.b h(dez $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dez $$1 = this.d.b().get(lt.b.r);
            alf $$2 = oh.aa.a($$0, this.b, nr.this.c);
            nr.this.b.accept(nr.c($$0, $$2));
            nr.this.b.accept(nr.c($$1, $$2));
            nr.this.a($$0.r());
            nr.this.c($$1);
            return this;
         }
      }

      public nr.b i(dez $$0) {
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

      public nr.b j(dez $$0) {
         alf $$1 = this.a(oh.af, $$0);
         alf $$2 = this.a(oh.ae, $$0);
         alf $$3 = this.a(oh.ag, $$0);
         nr.this.b.accept(nr.b($$0, $$1, $$2, $$3));
         nr.this.a($$0, $$2);
         return this;
      }

      private nr.b k(dez $$0) {
         ok $$1 = nr.this.g.getOrDefault($$0, ok.a.get($$0));
         alf $$2 = $$1.a($$0, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$2));
         return this;
      }

      private nr.b l(dez $$0) {
         nr.this.i($$0);
         return this;
      }

      private void m(dez $$0) {
         if (nr.this.e.contains($$0)) {
            nr.this.k($$0);
         } else {
            nr.this.j($$0);
         }
      }

      private alf a(og $$0, dez $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nr.this.c));
      }

      public nr.b a(lt $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nr.b, dez> $$2 = nr.h.get($$0x);
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
      nu create(dez var1, alf var2, oi var3, BiConsumer<alf, Supplier<JsonElement>> var4);
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

      public nr.f a(dez $$0) {
         oi $$1 = this.b.c(oj.d, this.b.a(oj.i));
         alf $$2 = oh.j.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$2));
         return this;
      }

      public nr.f b(dez $$0) {
         alf $$1 = oh.j.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1));
         return this;
      }

      public nr.f c(dez $$0) {
         alf $$1 = oh.j.a($$0, this.b, nr.this.c);
         alf $$2 = oh.k.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1, $$2));
         return this;
      }

      public nr.f d(dez $$0) {
         nr.this.b.accept(nr.a($$0, this.b, nr.this.c));
         return this;
      }
   }
}
