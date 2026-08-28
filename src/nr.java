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
   final BiConsumer<alb, Supplier<JsonElement>> c;
   private final Consumer<cuf> d;
   final List<deu> e = ImmutableList.of(dew.ey, dew.eE, dew.hY);
   final Map<deu, nr.c> f = ImmutableMap.builder().put(dew.b, nr::a).put(dew.sJ, nr::c).put(dew.eM, nr::b).build();
   final Map<deu, ok> g = ImmutableMap.builder()
      .put(dew.aV, ok.y.get(dew.aV))
      .put(dew.jp, ok.y.get(dew.jp))
      .put(dew.jS, ok.a(oi.a(dew.aV, "_top")))
      .put(dew.jU, ok.a(oi.a(dew.jp, "_top")))
      .put(dew.aX, ok.d.get(dew.aV).a($$0x -> $$0x.a(oj.i, oi.G(dew.aX))))
      .put(dew.jr, ok.d.get(dew.jp).a($$0x -> $$0x.a(oj.i, oi.G(dew.jr))))
      .put(dew.hd, ok.d.get(dew.hd))
      .put(dew.jT, ok.a(oi.a(dew.hd, "_bottom")))
      .put(dew.pr, ok.z.get(dew.pr))
      .put(dew.sJ, ok.z.get(dew.sJ))
      .put(dew.he, ok.d.get(dew.he).a($$0x -> $$0x.a(oj.i, oi.G(dew.he))))
      .put(dew.aW, ok.d.get(dew.aW).a($$0x -> {
         $$0x.a(oj.d, oi.a(dew.aV, "_top"));
         $$0x.a(oj.i, oi.G(dew.aW));
      }))
      .put(dew.jq, ok.d.get(dew.jq).a($$0x -> {
         $$0x.a(oj.d, oi.a(dew.jp, "_top"));
         $$0x.a(oj.i, oi.G(dew.jq));
      }))
      .put(dew.qM, ok.z.get(dew.qM))
      .put(dew.qH, ok.z.get(dew.qH))
      .build();
   static final Map<lt.b, BiConsumer<nr.b, deu>> h = ImmutableMap.builder()
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
   public static final List<Pair<dso, Function<alb, oa>>> a = List.of(
      Pair.of(dsn.L, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0)),
      Pair.of(dsn.M, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true)),
      Pair.of(dsn.N, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true)),
      Pair.of(dsn.O, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true)),
      Pair.of(dsn.J, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true)),
      Pair.of(dsn.K, (Function<alb, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
   );
   private static final Map<nr.d, alb> i = new HashMap<>();

   private static nu a(deu $$0, alb $$1, oi $$2, BiConsumer<alb, Supplier<JsonElement>> $$3) {
      alb $$4 = oh.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nu b(deu $$0, alb $$1, oi $$2, BiConsumer<alb, Supplier<JsonElement>> $$3) {
      alb $$4 = oh.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nu c(deu $$0, alb $$1, oi $$2, BiConsumer<alb, Supplier<JsonElement>> $$3) {
      alb $$4 = oh.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nr(Consumer<nu> $$0, BiConsumer<alb, Supplier<JsonElement>> $$1, Consumer<cuf> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(deu $$0) {
      this.d.accept($$0.r());
   }

   void a(deu $$0, alb $$1) {
      this.c.accept(of.a($$0.r()), new oe($$1));
   }

   private void a(cuf $$0, alb $$1) {
      this.c.accept(of.a($$0), new oe($$1));
   }

   void a(cuf $$0) {
      oh.bx.a(of.a($$0), oi.b($$0), this.c);
   }

   private void d(deu $$0) {
      cuf $$1 = $$0.r();
      if ($$1 != cun.a) {
         oh.bx.a(of.a($$1), oi.F($$0), this.c);
      }
   }

   private void a(deu $$0, String $$1) {
      cuf $$2 = $$0.r();
      oh.bx.a(of.a($$2), oi.k(oi.a($$0, $$1)), this.c);
   }

   private static ny b() {
      return ny.a(dsn.R).a(je.f, oa.a().a(ob.b, ob.a.b)).a(je.d, oa.a().a(ob.b, ob.a.c)).a(je.e, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a());
   }

   private static ny c() {
      return ny.a(dsn.R).a(je.d, oa.a()).a(je.e, oa.a().a(ob.b, ob.a.b)).a(je.c, oa.a().a(ob.b, ob.a.c)).a(je.f, oa.a().a(ob.b, ob.a.d));
   }

   private static ny d() {
      return ny.a(dsn.R).a(je.f, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.b)).a(je.e, oa.a().a(ob.b, ob.a.c)).a(je.c, oa.a().a(ob.b, ob.a.d));
   }

   private static ny e() {
      return ny.a(dsn.P)
         .a(je.a, oa.a().a(ob.a, ob.a.b))
         .a(je.b, oa.a().a(ob.a, ob.a.d))
         .a(je.c, oa.a())
         .a(je.d, oa.a().a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.b, ob.a.b));
   }

   private static nx b(deu $$0, alb $$1) {
      return nx.a($$0, a($$1));
   }

   private static oa[] a(alb $$0) {
      return new oa[]{oa.a().a(ob.c, $$0), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d)};
   }

   private static nx a(deu $$0, alb $$1, alb $$2) {
      return nx.a($$0, oa.a().a(ob.c, $$1), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c));
   }

   private static ny a(dso $$0, alb $$1, alb $$2) {
      return ny.a($$0).a(true, oa.a().a(ob.c, $$1)).a(false, oa.a().a(ob.c, $$2));
   }

   private void e(deu $$0) {
      alb $$1 = ok.a.create($$0, this.c);
      alb $$2 = ok.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(deu $$0) {
      alb $$1 = ok.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(deu $$0) {
      this.b.accept(nx.a($$0).a(ny.a(dsn.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         alb $$3 = oi.a($$0, $$2);
         return oa.a().a(ob.c, oh.c.a($$0, $$2, new oi().a(oj.a, $$3), this.c));
      })));
      this.a($$0, oi.a($$0, "_0"));
   }

   static nu b(deu $$0, alb $$1, alb $$2) {
      return nx.a($$0)
         .a(ny.a(dsn.w).a(false, oa.a().a(ob.c, $$1)).a(true, oa.a().a(ob.c, $$2)))
         .a(
            ny.a(dsn.U, dsn.R)
               .a(dsi.a, je.f, oa.a().a(ob.b, ob.a.b))
               .a(dsi.a, je.e, oa.a().a(ob.b, ob.a.d))
               .a(dsi.a, je.d, oa.a().a(ob.b, ob.a.c))
               .a(dsi.a, je.c, oa.a())
               .a(dsi.b, je.f, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsi.b, je.e, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsi.b, je.d, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsi.b, je.c, oa.a().a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsi.c, je.f, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.c))
               .a(dsi.c, je.e, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.c))
               .a(dsi.c, je.d, oa.a().a(ob.a, ob.a.c))
               .a(dsi.c, je.c, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.c))
         );
   }

   private static ny.d<je, dst, dss, Boolean> a(ny.d<je, dst, dss, Boolean> $$0, dst $$1, alb $$2, alb $$3, alb $$4, alb $$5) {
      return $$0.a(je.f, $$1, dss.a, false, oa.a().a(ob.c, $$2))
         .a(je.d, $$1, dss.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
         .a(je.e, $$1, dss.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
         .a(je.c, $$1, dss.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
         .a(je.f, $$1, dss.b, false, oa.a().a(ob.c, $$4))
         .a(je.d, $$1, dss.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
         .a(je.e, $$1, dss.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
         .a(je.c, $$1, dss.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         .a(je.f, $$1, dss.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
         .a(je.d, $$1, dss.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
         .a(je.e, $$1, dss.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         .a(je.c, $$1, dss.a, true, oa.a().a(ob.c, $$3))
         .a(je.f, $$1, dss.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.d))
         .a(je.d, $$1, dss.b, true, oa.a().a(ob.c, $$5))
         .a(je.e, $$1, dss.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         .a(je.c, $$1, dss.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.c));
   }

   private static nu a(deu $$0, alb $$1, alb $$2, alb $$3, alb $$4, alb $$5, alb $$6, alb $$7, alb $$8) {
      return nx.a($$0).a(a(a(ny.a(dsn.R, dsn.ae, dsn.be, dsn.u), dst.b, $$1, $$2, $$3, $$4), dst.a, $$5, $$6, $$7, $$8));
   }

   static nu a(deu $$0, alb $$1, alb $$2, alb $$3, alb $$4, alb $$5) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsn.L, true), oa.a().a(ob.c, $$2).a(ob.d, false))
         .a(nv.a().a(dsn.M, true), oa.a().a(ob.c, $$3).a(ob.d, false))
         .a(nv.a().a(dsn.N, true), oa.a().a(ob.c, $$4).a(ob.d, false))
         .a(nv.a().a(dsn.O, true), oa.a().a(ob.c, $$5).a(ob.d, false));
   }

   static nu c(deu $$0, alb $$1, alb $$2) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsn.L, true), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dsn.M, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsn.N, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsn.O, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(deu $$0, alb $$1, alb $$2, alb $$3) {
      return nw.a($$0)
         .a(nv.a().a(dsn.J, true), oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsn.X, dtj.b), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dsn.W, dtj.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsn.Y, dtj.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsn.Z, dtj.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
         .a(nv.a().a(dsn.X, dtj.c), oa.a().a(ob.c, $$3).a(ob.d, true))
         .a(nv.a().a(dsn.W, dtj.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsn.Y, dtj.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsn.Z, dtj.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(deu $$0, alb $$1, alb $$2, alb $$3, alb $$4, boolean $$5) {
      return nx.a($$0, oa.a().a(ob.d, $$5))
         .a(c())
         .a(
            ny.a(dsn.q, dsn.u)
               .a(false, false, oa.a().a(ob.c, $$2))
               .a(true, false, oa.a().a(ob.c, $$4))
               .a(false, true, oa.a().a(ob.c, $$1))
               .a(true, true, oa.a().a(ob.c, $$3))
         );
   }

   static nu b(deu $$0, alb $$1, alb $$2, alb $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsn.R, dsn.af, dsn.bi)
               .a(je.f, dsw.b, dtg.a, oa.a().a(ob.c, $$2))
               .a(je.e, dsw.b, dtg.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsw.b, dtg.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsw.b, dtg.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsw.b, dtg.e, oa.a().a(ob.c, $$3))
               .a(je.e, dsw.b, dtg.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsw.b, dtg.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsw.b, dtg.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsw.b, dtg.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dsw.b, dtg.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dsw.b, dtg.d, oa.a().a(ob.c, $$3))
               .a(je.c, dsw.b, dtg.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dsw.b, dtg.c, oa.a().a(ob.c, $$1))
               .a(je.e, dsw.b, dtg.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsw.b, dtg.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsw.b, dtg.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsw.b, dtg.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dsw.b, dtg.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dsw.b, dtg.b, oa.a().a(ob.c, $$1))
               .a(je.c, dsw.b, dtg.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dsw.a, dtg.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dsw.a, dtg.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsw.a, dtg.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsw.a, dtg.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsw.a, dtg.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dsw.a, dtg.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dsw.a, dtg.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dsw.a, dtg.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dsw.a, dtg.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dsw.a, dtg.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsw.a, dtg.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsw.a, dtg.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dsw.a, dtg.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dsw.a, dtg.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dsw.a, dtg.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dsw.a, dtg.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dsw.a, dtg.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dsw.a, dtg.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dsw.a, dtg.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dsw.a, dtg.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
         );
   }

   private static nu c(deu $$0, alb $$1, alb $$2, alb $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsn.R, dsn.af, dsn.u)
               .a(je.c, dsw.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dsw.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(je.f, dsw.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(je.e, dsw.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(je.c, dsw.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dsw.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(je.f, dsw.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(je.e, dsw.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(je.c, dsw.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dsw.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dsw.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dsw.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c))
               .a(je.d, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.a))
               .a(je.f, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               .a(je.e, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b))
         );
   }

   private static nu d(deu $$0, alb $$1, alb $$2, alb $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsn.R, dsn.af, dsn.u)
               .a(je.c, dsw.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dsw.b, false, oa.a().a(ob.c, $$2))
               .a(je.f, dsw.b, false, oa.a().a(ob.c, $$2))
               .a(je.e, dsw.b, false, oa.a().a(ob.c, $$2))
               .a(je.c, dsw.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dsw.a, false, oa.a().a(ob.c, $$1))
               .a(je.f, dsw.a, false, oa.a().a(ob.c, $$1))
               .a(je.e, dsw.a, false, oa.a().a(ob.c, $$1))
               .a(je.c, dsw.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dsw.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dsw.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dsw.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dsw.a, true, oa.a().a(ob.c, $$3))
               .a(je.d, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         );
   }

   static nx c(deu $$0, alb $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1));
   }

   private static ny f() {
      return ny.a(dsn.I).a(je.a.b, oa.a()).a(je.a.c, oa.a().a(ob.a, ob.a.b)).a(je.a.a, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   static nu a(deu $$0, oi $$1, BiConsumer<alb, Supplier<JsonElement>> $$2) {
      alb $$3 = oh.g.a($$0, $$1, $$2);
      alb $$4 = oh.h.a($$0, $$1, $$2);
      alb $$5 = oh.i.a($$0, $$1, $$2);
      alb $$6 = oh.j.a($$0, $$1, $$2);
      return nx.a($$0, oa.a().a(ob.c, $$6)).a(ny.a(dsn.I).a(je.a.a, oa.a().a(ob.c, $$3)).a(je.a.b, oa.a().a(ob.c, $$4)).a(je.a.c, oa.a().a(ob.c, $$5)));
   }

   static nu d(deu $$0, alb $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1)).a(f());
   }

   private void e(deu $$0, alb $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(deu $$0, ok.a $$1) {
      alb $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(deu $$0, ok.a $$1) {
      alb $$2 = $$1.create($$0, this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   static nu d(deu $$0, alb $$1, alb $$2) {
      return nx.a($$0)
         .a(
            ny.a(dsn.I)
               .a(je.a.b, oa.a().a(ob.c, $$1))
               .a(je.a.c, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b))
               .a(je.a.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.b, ob.a.b))
         );
   }

   private void a(deu $$0, ok.a $$1, ok.a $$2) {
      alb $$3 = $$1.create($$0, this.c);
      alb $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private alb a(deu $$0, String $$1, og $$2, Function<alb, oi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oi.a($$0, $$1)), this.c);
   }

   static nu e(deu $$0, alb $$1, alb $$2) {
      return nx.a($$0).a(a(dsn.w, $$2, $$1));
   }

   static nu e(deu $$0, alb $$1, alb $$2, alb $$3) {
      return nx.a($$0).a(ny.a(dsn.bh).a(dtf.b, oa.a().a(ob.c, $$1)).a(dtf.a, oa.a().a(ob.c, $$2)).a(dtf.c, oa.a().a(ob.c, $$3)));
   }

   public void a(deu $$0) {
      this.b($$0, ok.a);
   }

   public void b(deu $$0, ok.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(deu $$0, oi $$1, og $$2) {
      alb $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nr.b h(deu $$0) {
      ok $$1 = this.g.getOrDefault($$0, ok.a.get($$0));
      return new nr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(deu $$0, deu $$1, deu $$2) {
      oi $$3 = oi.u($$0);
      alb $$4 = oh.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(deu $$0) {
      oi $$1 = oi.t($$0);
      alb $$2 = oh.v.a($$0, $$1, this.c);
      alb $$3 = oh.w.a($$0, $$1, this.c);
      alb $$4 = oh.x.a($$0, $$1, this.c);
      alb $$5 = oh.y.a($$0, $$1, this.c);
      alb $$6 = oh.z.a($$0, $$1, this.c);
      alb $$7 = oh.A.a($$0, $$1, this.c);
      alb $$8 = oh.B.a($$0, $$1, this.c);
      alb $$9 = oh.C.a($$0, $$1, this.c);
      this.a($$0.r());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(deu $$0, deu $$1) {
      alb $$2 = oh.v.a($$0);
      alb $$3 = oh.w.a($$0);
      alb $$4 = oh.x.a($$0);
      alb $$5 = oh.y.a($$0);
      alb $$6 = oh.z.a($$0);
      alb $$7 = oh.A.a($$0);
      alb $$8 = oh.B.a($$0);
      alb $$9 = oh.C.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(deu $$0) {
      oi $$1 = oi.b($$0);
      alb $$2 = oh.ak.a($$0, $$1, this.c);
      alb $$3 = oh.al.a($$0, $$1, this.c);
      alb $$4 = oh.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(deu $$0) {
      oi $$1 = oi.b($$0);
      alb $$2 = oh.ah.a($$0, $$1, this.c);
      alb $$3 = oh.ai.a($$0, $$1, this.c);
      alb $$4 = oh.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(deu $$0, deu $$1) {
      alb $$2 = oh.ah.a($$0);
      alb $$3 = oh.ai.a($$0);
      alb $$4 = oh.aj.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dew.sD);
      alb $$0 = of.a(dew.sD);
      alb $$1 = of.a(dew.sD, "_partial_tilt");
      alb $$2 = of.a(dew.sD, "_full_tilt");
      this.b
         .accept(
            nx.a(dew.sD)
               .a(b())
               .a(ny.a(dsn.bl).a(dti.a, oa.a().a(ob.c, $$0)).a(dti.b, oa.a().a(ob.c, $$0)).a(dti.c, oa.a().a(ob.c, $$1)).a(dti.d, oa.a().a(ob.c, $$2)))
         );
   }

   private nr.f l(deu $$0) {
      return new nr.f(oi.n($$0));
   }

   private void m(deu $$0) {
      this.c($$0, $$0);
   }

   private void c(deu $$0, deu $$1) {
      this.b.accept(c($$0, of.a($$1)));
   }

   private void a(deu $$0, nr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(deu $$0, nr.e $$1, oi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(deu $$0, nr.e $$1) {
      oi $$2 = oi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(deu $$0, nr.e $$1, oi $$2) {
      alb $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(deu $$0, nr.e $$1, dta<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         ny $$4 = ny.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            oi $$5 = oi.c(oi.a($$0, $$4x));
            alb $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return oa.a().a(ob.c, $$6);
         });
         this.a($$0.r());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void a(deu $$0, deu $$1, nr.e $$2) {
      this.a($$0, $$2);
      oi $$3 = oi.d($$0);
      alb $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(deu $$0, deu $$1) {
      ok $$2 = ok.p.get($$0);
      alb $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      alb $$4 = oh.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(deu $$0, deu $$1) {
      this.a($$0.r());
      oi $$2 = oi.h($$0);
      oi $$3 = oi.a($$0, $$1);
      alb $$4 = oh.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nx.a($$1, oa.a().a(ob.c, $$4))
               .a(ny.a(dsn.R).a(je.e, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a().a(ob.b, ob.a.b)).a(je.f, oa.a().a(ob.b, ob.a.c)))
         );
      this.b.accept(nx.a($$0).a(ny.a(dsn.av).a($$2x -> oa.a().a(ob.c, oh.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      deu $$0 = dew.kC;
      this.a($$0.r());
      alb $$1 = of.a($$0, "_top");
      alb $$2 = of.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      deu $$0 = dew.kB;
      this.a($$0.r());
      ny $$1 = ny.a(dkj.d, dsn.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oa.a().a(ob.c, of.a($$0, "_top_stage_" + $$1x));
            case b -> oa.a().a(ob.c, of.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nx.a($$0).a($$1));
   }

   private void a(deu $$0, deu $$1, deu $$2, deu $$3, deu $$4, deu $$5, deu $$6, deu $$7) {
      this.a($$0, nr.e.b);
      this.a($$1, nr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(deu $$0, nr.e $$1) {
      this.a($$0, "_top");
      alb $$2 = this.a($$0, "_top", $$1.a(), oi::c);
      alb $$3 = this.a($$0, "_bottom", $$1.a(), oi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dew.iD, "_front");
      alb $$0 = of.a(dew.iD, "_top");
      alb $$1 = this.a(dew.iD, "_bottom", nr.e.b.a(), oi::c);
      this.f(dew.iD, $$0, $$1);
   }

   private void k() {
      alb $$0 = this.a(dew.bx, "_top", oh.bk, oi::a);
      alb $$1 = this.a(dew.bx, "_bottom", oh.bk, oi::a);
      this.f(dew.bx, $$0, $$1);
   }

   private void l() {
      this.c(dew.sF);
      alb $$0 = of.a(dew.sF, "_top");
      alb $$1 = of.a(dew.sF, "_bottom");
      this.b.accept(nx.a(dew.sF).a(b()).a(ny.a(dsn.ae).a(dst.b, oa.a().a(ob.c, $$1)).a(dst.a, oa.a().a(ob.c, $$0))));
   }

   private void f(deu $$0, alb $$1, alb $$2) {
      this.b.accept(nx.a($$0).a(ny.a(dsn.ae).a(dst.b, oa.a().a(ob.c, $$2)).a(dst.a, oa.a().a(ob.c, $$1))));
   }

   private void n(deu $$0) {
      oi $$1 = oi.e($$0);
      oi $$2 = oi.e(oi.a($$0, "_corner"));
      alb $$3 = oh.as.a($$0, $$1, this.c);
      alb $$4 = oh.at.a($$0, $$2, this.c);
      alb $$5 = oh.au.a($$0, $$1, this.c);
      alb $$6 = oh.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsn.ag)
                     .a(dtb.a, oa.a().a(ob.c, $$3))
                     .a(dtb.b, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(dtb.c, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
                     .a(dtb.d, oa.a().a(ob.c, $$6).a(ob.b, ob.a.b))
                     .a(dtb.e, oa.a().a(ob.c, $$5))
                     .a(dtb.f, oa.a().a(ob.c, $$6))
                     .a(dtb.g, oa.a().a(ob.c, $$4))
                     .a(dtb.h, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
                     .a(dtb.i, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
                     .a(dtb.j, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
               )
         );
   }

   private void o(deu $$0) {
      alb $$1 = this.a($$0, "", oh.as, oi::e);
      alb $$2 = this.a($$0, "", oh.au, oi::e);
      alb $$3 = this.a($$0, "", oh.av, oi::e);
      alb $$4 = this.a($$0, "_on", oh.as, oi::e);
      alb $$5 = this.a($$0, "_on", oh.au, oi::e);
      alb $$6 = this.a($$0, "_on", oh.av, oi::e);
      ny $$7 = ny.a(dsn.w, dsn.ah).a(($$6x, $$7x) -> {
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

   private nr.a a(alb $$0, deu $$1) {
      return new nr.a($$0, $$1);
   }

   private nr.a f(deu $$0, deu $$1) {
      return new nr.a(of.a($$0), $$1);
   }

   private void a(deu $$0, cuf $$1) {
      alb $$2 = oh.aa.a($$0, oi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(deu $$0, alb $$1) {
      alb $$2 = oh.aa.a($$0, oi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(deu $$0, deu $$1) {
      this.a($$0);
      alb $$2 = ok.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(deu $$0) {
      this.a($$0.r());
      alb $$1 = ok.k.create($$0, this.c);
      alb $$2 = ok.l.create($$0, this.c);
      alb $$3 = ok.m.create($$0, this.c);
      alb $$4 = ok.n.create($$0, this.c);
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dsn.S, 1, 2, 3, 4).a(dsn.R, je.c), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsn.S, 1, 2, 3, 4).a(dsn.R, je.f), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.S, 1, 2, 3, 4).a(dsn.R, je.d), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(nv.a().a(dsn.S, 1, 2, 3, 4).a(dsn.R, je.e), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(nv.a().a(dsn.S, 2, 3, 4).a(dsn.R, je.c), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsn.S, 2, 3, 4).a(dsn.R, je.f), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.S, 2, 3, 4).a(dsn.R, je.d), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(nv.a().a(dsn.S, 2, 3, 4).a(dsn.R, je.e), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(nv.a().a(dsn.S, 3, 4).a(dsn.R, je.c), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsn.S, 3, 4).a(dsn.R, je.f), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.S, 3, 4).a(dsn.R, je.d), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(nv.a().a(dsn.S, 3, 4).a(dsn.R, je.e), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(nv.a().a(dsn.S, 4).a(dsn.R, je.c), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsn.S, 4).a(dsn.R, je.f), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.S, 4).a(dsn.R, je.d), oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
               .a(nv.a().a(dsn.S, 4).a(dsn.R, je.e), oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         );
   }

   private void a(ok.a $$0, deu... $$1) {
      for (deu $$2 : $$1) {
         alb $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ok.a $$0, deu... $$1) {
      for (deu $$2 : $$1) {
         alb $$3 = $$0.create($$2, this.c);
         this.b.accept(nx.a($$2, oa.a().a(ob.c, $$3)).a(c()));
      }
   }

   private void h(deu $$0, deu $$1) {
      this.a($$0);
      oi $$2 = oi.b($$0, $$1);
      alb $$3 = oh.aI.a($$1, $$2, this.c);
      alb $$4 = oh.aJ.a($$1, $$2, this.c);
      alb $$5 = oh.aK.a($$1, $$2, this.c);
      alb $$6 = oh.aG.a($$1, $$2, this.c);
      alb $$7 = oh.aH.a($$1, $$2, this.c);
      cuf $$8 = $$1.r();
      oh.bx.a(of.a($$8), oi.F($$0), this.c);
      this.b
         .accept(
            nw.a($$1)
               .a(oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsn.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsn.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dsn.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.L, false), oa.a().a(ob.c, $$6))
               .a(nv.a().a(dsn.M, false), oa.a().a(ob.c, $$7))
               .a(nv.a().a(dsn.N, false), oa.a().a(ob.c, $$7).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.O, false), oa.a().a(ob.c, $$6).a(ob.b, ob.a.d))
         );
   }

   private void q(deu $$0) {
      oi $$1 = oi.z($$0);
      alb $$2 = oh.aL.a($$0, $$1, this.c);
      alb $$3 = this.a($$0, "_conditional", oh.aL, $$1x -> $$1.c(oj.i, $$1x));
      this.b.accept(nx.a($$0).a(a(dsn.c, $$3, $$2)).a(e()));
   }

   private void r(deu $$0) {
      alb $$1 = ok.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oa> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oa.a().a(ob.c, of.a(dew.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dew.mZ);
      this.b
         .accept(
            nw.a(dew.mZ)
               .a(nv.a().a(dsn.aq, 0), this.a(0))
               .a(nv.a().a(dsn.aq, 1), this.a(1))
               .a(nv.a().a(dsn.bk, dsj.b), oa.a().a(ob.c, of.a(dew.mZ, "_small_leaves")))
               .a(nv.a().a(dsn.bk, dsj.c), oa.a().a(ob.c, of.a(dew.mZ, "_large_leaves")))
         );
   }

   private ny n() {
      return ny.a(dsn.P)
         .a(je.a, oa.a().a(ob.a, ob.a.c))
         .a(je.b, oa.a())
         .a(je.c, oa.a().a(ob.a, ob.a.b))
         .a(je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   private void o() {
      alb $$0 = oi.a(dew.nU, "_top_open");
      this.b
         .accept(
            nx.a(dew.nU)
               .a(this.n())
               .a(
                  ny.a(dsn.u)
                     .a(false, oa.a().a(ob.c, ok.f.create(dew.nU, this.c)))
                     .a(true, oa.a().a(ob.c, ok.f.get(dew.nU).a($$1 -> $$1.a(oj.f, $$0)).a(dew.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ny a(dta<T> $$0, T $$1, alb $$2, alb $$3) {
      oa $$4 = oa.a().a(ob.c, $$2);
      oa $$5 = oa.a().a(ob.c, $$3);
      return ny.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(deu $$0, Function<deu, oi> $$1) {
      oi $$2 = $$1.apply($$0).b(oj.i, oj.c);
      oi $$3 = $$2.c(oj.g, oi.a($$0, "_front_honey"));
      alb $$4 = oh.q.a($$0, $$2, this.c);
      alb $$5 = oh.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nx.a($$0).a(b()).a(a(dsn.aN, 5, $$5, $$4)));
   }

   private void a(deu $$0, dta<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alb> $$3 = new Int2ObjectOpenHashMap();
         ny $$4 = ny.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alb $$5 = (alb)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, oh.aV, oi::g));
            return oa.a().a(ob.c, $$5);
         });
         this.a($$0.r());
         this.b.accept(nx.a($$0).a($$4));
      }
   }

   private void p() {
      alb $$0 = of.a(dew.od, "_floor");
      alb $$1 = of.a(dew.od, "_ceiling");
      alb $$2 = of.a(dew.od, "_wall");
      alb $$3 = of.a(dew.od, "_between_walls");
      this.a(cun.wo);
      this.b
         .accept(
            nx.a(dew.od)
               .a(
                  ny.a(dsn.R, dsn.V)
                     .a(je.c, dsl.a, oa.a().a(ob.c, $$0))
                     .a(je.d, dsl.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.c))
                     .a(je.f, dsl.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.b))
                     .a(je.e, dsl.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.d))
                     .a(je.c, dsl.b, oa.a().a(ob.c, $$1))
                     .a(je.d, dsl.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.f, dsl.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.e, dsl.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
                     .a(je.c, dsl.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
                     .a(je.d, dsl.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
                     .a(je.f, dsl.c, oa.a().a(ob.c, $$2))
                     .a(je.e, dsl.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
                     .a(je.d, dsl.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(je.c, dsl.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
                     .a(je.f, dsl.d, oa.a().a(ob.c, $$3))
                     .a(je.e, dsl.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nx.a(dew.nZ, oa.a().a(ob.c, of.a(dew.nZ)))
               .a(
                  ny.a(dsn.U, dsn.R)
                     .a(dsi.a, je.c, oa.a())
                     .a(dsi.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsi.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsi.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsi.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsi.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsi.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsi.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
                     .a(dsi.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsi.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsi.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsi.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               )
         );
   }

   private void d(deu $$0, ok.a $$1) {
      alb $$2 = $$1.create($$0, this.c);
      alb $$3 = oi.a($$0, "_front_on");
      alb $$4 = $$1.get($$0).a($$1x -> $$1x.a(oj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nx.a($$0).a(a(dsn.r, $$4, $$2)).a(b()));
   }

   private void a(deu... $$0) {
      alb $$1 = of.a("campfire_off");

      for (deu $$2 : $$0) {
         alb $$3 = oh.bc.a($$2, oi.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nx.a($$2).a(a(dsn.r, $$3, $$1)).a(c()));
      }
   }

   private void s(deu $$0) {
      alb $$1 = oh.bt.a($$0, oi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(deu $$0) {
      alb $$1;
      if ($$0 == dew.tj) {
         $$1 = oh.bv.a($$0, oi.m($$0), this.c);
      } else {
         $$1 = oh.bu.a($$0, oi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oi $$0 = oi.a(oi.G(dew.cl), oi.G(dew.n));
      alb $$1 = oh.j.a(dew.cl, $$0, this.c);
      this.b.accept(c(dew.cl, $$1));
   }

   private void s() {
      this.a(cun.lH);
      this.b
         .accept(
            nw.a(dew.cw)
               .a(
                  nv.b(
                     nv.a().a(dsn.ab, dtc.c).a(dsn.aa, dtc.c).a(dsn.ac, dtc.c).a(dsn.ad, dtc.c),
                     nv.a().a(dsn.ab, dtc.b, dtc.a).a(dsn.aa, dtc.b, dtc.a),
                     nv.a().a(dsn.aa, dtc.b, dtc.a).a(dsn.ac, dtc.b, dtc.a),
                     nv.a().a(dsn.ac, dtc.b, dtc.a).a(dsn.ad, dtc.b, dtc.a),
                     nv.a().a(dsn.ad, dtc.b, dtc.a).a(dsn.ab, dtc.b, dtc.a)
                  ),
                  oa.a().a(ob.c, of.a("redstone_dust_dot"))
               )
               .a(nv.a().a(dsn.ab, dtc.b, dtc.a), oa.a().a(ob.c, of.a("redstone_dust_side0")))
               .a(nv.a().a(dsn.ac, dtc.b, dtc.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt0")))
               .a(nv.a().a(dsn.aa, dtc.b, dtc.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dsn.ad, dtc.b, dtc.a), oa.a().a(ob.c, of.a("redstone_dust_side1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dsn.ab, dtc.a), oa.a().a(ob.c, of.a("redstone_dust_up")))
               .a(nv.a().a(dsn.aa, dtc.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.ac, dtc.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.c))
               .a(nv.a().a(dsn.ad, dtc.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.d))
         );
   }

   private void t() {
      this.a(cun.lL);
      this.b
         .accept(
            nx.a(dew.gY)
               .a(c())
               .a(
                  ny.a(dsn.bd, dsn.w)
                     .a(dsq.a, false, oa.a().a(ob.c, of.a(dew.gY)))
                     .a(dsq.a, true, oa.a().a(ob.c, of.a(dew.gY, "_on")))
                     .a(dsq.b, false, oa.a().a(ob.c, of.a(dew.gY, "_subtract")))
                     .a(dsq.b, true, oa.a().a(ob.c, of.a(dew.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oi $$0 = oi.a(dew.jR);
      oi $$1 = oi.a(oi.a(dew.jE, "_side"), $$0.a(oj.f));
      alb $$2 = oh.ab.a(dew.jE, $$1, this.c);
      alb $$3 = oh.ac.a(dew.jE, $$1, this.c);
      alb $$4 = oh.j.b(dew.jE, "_double", $$1, this.c);
      this.b.accept(e(dew.jE, $$2, $$3, $$4));
      this.b.accept(c(dew.jR, oh.c.a(dew.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cun.sq);
      this.b
         .accept(
            nw.a(dew.fs)
               .a(oa.a().a(ob.c, oi.G(dew.fs)))
               .a(nv.a().a(dsn.k, true), oa.a().a(ob.c, oi.a(dew.fs, "_bottle0")))
               .a(nv.a().a(dsn.l, true), oa.a().a(ob.c, oi.a(dew.fs, "_bottle1")))
               .a(nv.a().a(dsn.m, true), oa.a().a(ob.c, oi.a(dew.fs, "_bottle2")))
               .a(nv.a().a(dsn.k, false), oa.a().a(ob.c, oi.a(dew.fs, "_empty0")))
               .a(nv.a().a(dsn.l, false), oa.a().a(ob.c, oi.a(dew.fs, "_empty1")))
               .a(nv.a().a(dsn.m, false), oa.a().a(ob.c, oi.a(dew.fs, "_empty2")))
         );
   }

   private void u(deu $$0) {
      alb $$1 = oh.bp.a($$0, oi.b($$0), this.c);
      alb $$2 = of.a("mushroom_block_inside");
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dsn.L, true), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsn.M, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsn.N, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dsn.O, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsn.J, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsn.K, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsn.L, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsn.M, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, false))
               .a(nv.a().a(dsn.N, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, false))
               .a(nv.a().a(dsn.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dsn.J, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dsn.K, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, false))
         );
      this.a($$0, ok.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cun.rB);
      this.b
         .accept(
            nx.a(dew.eg)
               .a(
                  ny.a(dsn.ay)
                     .a(0, oa.a().a(ob.c, of.a(dew.eg)))
                     .a(1, oa.a().a(ob.c, of.a(dew.eg, "_slice1")))
                     .a(2, oa.a().a(ob.c, of.a(dew.eg, "_slice2")))
                     .a(3, oa.a().a(ob.c, of.a(dew.eg, "_slice3")))
                     .a(4, oa.a().a(ob.c, of.a(dew.eg, "_slice4")))
                     .a(5, oa.a().a(ob.c, of.a(dew.eg, "_slice5")))
                     .a(6, oa.a().a(ob.c, of.a(dew.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dew.nX, "_side3"))
         .a(oj.o, oi.G(dew.t))
         .a(oj.n, oi.a(dew.nX, "_top"))
         .a(oj.j, oi.a(dew.nX, "_side3"))
         .a(oj.l, oi.a(dew.nX, "_side3"))
         .a(oj.k, oi.a(dew.nX, "_side1"))
         .a(oj.m, oi.a(dew.nX, "_side2"));
      this.b.accept(c(dew.nX, oh.a.a(dew.nX, $$0, this.c)));
   }

   private void y() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dew.ob, "_front"))
         .a(oj.o, oi.a(dew.ob, "_bottom"))
         .a(oj.n, oi.a(dew.ob, "_top"))
         .a(oj.j, oi.a(dew.ob, "_front"))
         .a(oj.k, oi.a(dew.ob, "_front"))
         .a(oj.l, oi.a(dew.ob, "_side"))
         .a(oj.m, oi.a(dew.ob, "_side"));
      this.b.accept(c(dew.ob, oh.a.a(dew.ob, $$0, this.c)));
   }

   private void a(deu $$0, deu $$1, BiFunction<deu, deu, oi> $$2) {
      oi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oh.a.a($$0, $$3, this.c)));
   }

   public void b(deu $$0) {
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
      oi $$0 = oi.k(dew.eZ);
      this.b.accept(c(dew.eZ, of.a(dew.eZ)));
      this.a(dew.ee, $$0);
      this.a(dew.ef, $$0);
   }

   private void a(deu $$0, oi $$1) {
      alb $$2 = oh.p.a($$0, $$1.c(oj.g, oi.G($$0)), this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cun.sr);
      this.m(dew.ft);
      this.b.accept(c(dew.fv, oh.bs.a(dew.fv, oi.j(oi.a(dew.H, "_still")), this.c)));
      this.b
         .accept(
            nx.a(dew.fu)
               .a(
                  ny.a(djd.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dew.fu, "_level1", oi.j(oi.a(dew.G, "_still")), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dew.fu, "_level2", oi.j(oi.a(dew.G, "_still")), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dew.fu, "_full", oi.j(oi.a(dew.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nx.a(dew.fw)
               .a(
                  ny.a(djd.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dew.fw, "_level1", oi.j(oi.G(dew.qP)), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dew.fw, "_level2", oi.j(oi.G(dew.qP)), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dew.fw, "_full", oi.j(oi.G(dew.qP)), this.c)))
               )
         );
   }

   private void B() {
      oi $$0 = oi.b(dew.kv);
      alb $$1 = oh.aE.a(dew.kv, $$0, this.c);
      alb $$2 = this.a(dew.kv, "_dead", oh.aE, $$1x -> $$0.c(oj.b, $$1x));
      this.b.accept(nx.a(dew.kv).a(a(dsn.au, 5, $$2, $$1)));
   }

   private void C() {
      alb $$0 = of.a(dew.tq);
      alb $$1 = of.a(dew.tq, "_triggered");
      alb $$2 = of.a(dew.tq, "_crafting");
      alb $$3 = of.a(dew.tq, "_crafting_triggered");
      this.b
         .accept(
            nx.a(dew.tq)
               .a(ny.a(dsn.T).a($$0x -> this.a($$0x, oa.a())))
               .a(
                  ny.a(dsn.A, dgn.b)
                     .a(false, false, oa.a().a(ob.c, $$0))
                     .a(true, true, oa.a().a(ob.c, $$3))
                     .a(true, false, oa.a().a(ob.c, $$1))
                     .a(false, true, oa.a().a(ob.c, $$2))
               )
         );
   }

   private void v(deu $$0) {
      oi $$1 = new oi().a(oj.f, oi.a(dew.cD, "_top")).a(oj.i, oi.a(dew.cD, "_side")).a(oj.g, oi.a($$0, "_front"));
      oi $$2 = new oi().a(oj.i, oi.a(dew.cD, "_top")).a(oj.g, oi.a($$0, "_front_vertical"));
      alb $$3 = oh.p.a($$0, $$1, this.c);
      alb $$4 = oh.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsn.P)
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
      alb $$0 = of.a(dew.fy);
      alb $$1 = of.a(dew.fy, "_filled");
      this.b.accept(nx.a(dew.fy).a(ny.a(dsn.h).a(false, oa.a().a(ob.c, $$0)).a(true, oa.a().a(ob.c, $$1))).a(c()));
   }

   private void E() {
      alb $$0 = of.a(dew.ku, "_side");
      alb $$1 = of.a(dew.ku, "_noside");
      alb $$2 = of.a(dew.ku, "_noside1");
      alb $$3 = of.a(dew.ku, "_noside2");
      alb $$4 = of.a(dew.ku, "_noside3");
      this.b
         .accept(
            nw.a(dew.ku)
               .a(nv.a().a(dsn.L, true), oa.a().a(ob.c, $$0))
               .a(nv.a().a(dsn.M, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsn.N, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dsn.O, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsn.J, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsn.K, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsn.L, false), oa.a().a(ob.c, $$1).a(ob.e, 2), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$3), oa.a().a(ob.c, $$4))
               .a(
                  nv.a().a(dsn.M, false),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.b).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsn.N, false),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsn.O, false),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsn.J, false),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsn.K, false),
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
            nw.a(dew.pc)
               .a(oa.a().a(ob.c, oi.G(dew.pc)))
               .a(nv.a().a(dsn.aL, 1), oa.a().a(ob.c, oi.a(dew.pc, "_contents1")))
               .a(nv.a().a(dsn.aL, 2), oa.a().a(ob.c, oi.a(dew.pc, "_contents2")))
               .a(nv.a().a(dsn.aL, 3), oa.a().a(ob.c, oi.a(dew.pc, "_contents3")))
               .a(nv.a().a(dsn.aL, 4), oa.a().a(ob.c, oi.a(dew.pc, "_contents4")))
               .a(nv.a().a(dsn.aL, 5), oa.a().a(ob.c, oi.a(dew.pc, "_contents5")))
               .a(nv.a().a(dsn.aL, 6), oa.a().a(ob.c, oi.a(dew.pc, "_contents6")))
               .a(nv.a().a(dsn.aL, 7), oa.a().a(ob.c, oi.a(dew.pc, "_contents7")))
               .a(nv.a().a(dsn.aL, 8), oa.a().a(ob.c, oi.a(dew.pc, "_contents_ready")))
         );
   }

   private void w(deu $$0) {
      alb $$1 = oh.c.a($$0, oi.a($$0), this.c);
      alb $$2 = this.a($$0, "_powered", oh.c, oi::b);
      alb $$3 = this.a($$0, "_lit", oh.c, oi::b);
      alb $$4 = this.a($$0, "_lit_powered", oh.c, oi::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nu a(deu $$0, alb $$1, alb $$2, alb $$3, alb $$4) {
      return nx.a($$0).a(ny.a(dsn.r, dsn.w).a(($$4x, $$5) -> $$4x ? oa.a().a(ob.c, $$5 ? $$4 : $$2) : oa.a().a(ob.c, $$5 ? $$3 : $$1)));
   }

   private void i(deu $$0, deu $$1) {
      alb $$2 = of.a($$0);
      alb $$3 = of.a($$0, "_powered");
      alb $$4 = of.a($$0, "_lit");
      alb $$5 = of.a($$0, "_lit_powered");
      this.a($$1, of.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(deu $$0) {
      this.c($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, oh.ao.a($$0, oi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dew.qy);
      this.x(dew.qx);
      this.x(dew.qw);
      this.x(dew.qv);
   }

   private void H() {
      this.c(dew.st);
      ny.b<je, dsu> $$0 = ny.a(dsn.bm, dsn.bn);

      for (dsu $$1 : dsu.values()) {
         $$0.a(je.b, $$1, this.a(je.b, $$1));
      }

      for (dsu $$2 : dsu.values()) {
         $$0.a(je.a, $$2, this.a(je.a, $$2));
      }

      this.b.accept(nx.a(dew.st).a($$0));
   }

   private oa a(je $$0, dsu $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oi $$3 = oi.c(oi.a(dew.st, $$2));
      return oa.a().a(ob.c, oh.an.a(dew.st, $$2, $$3, this.c));
   }

   private void y(deu $$0) {
      oi $$1 = new oi().a(oj.e, oi.G(dew.dV)).a(oj.f, oi.G($$0)).a(oj.i, oi.a($$0, "_side"));
      this.b.accept(c($$0, oh.n.a($$0, $$1, this.c)));
   }

   private void I() {
      alb $$0 = oi.a(dew.gZ, "_side");
      oi $$1 = new oi().a(oj.f, oi.a(dew.gZ, "_top")).a(oj.i, $$0);
      oi $$2 = new oi().a(oj.f, oi.a(dew.gZ, "_inverted_top")).a(oj.i, $$0);
      this.b
         .accept(
            nx.a(dew.gZ)
               .a(ny.a(dsn.p).a(false, oa.a().a(ob.c, oh.aF.a(dew.gZ, $$1, this.c))).a(true, oa.a().a(ob.c, oh.aF.a(of.a(dew.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(deu $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()));
   }

   private void J() {
      deu $$0 = dew.ss;
      alb $$1 = of.a($$0, "_on");
      alb $$2 = of.a($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()).a(a(dsn.w, $$1, $$2)));
   }

   private void K() {
      oi $$0 = new oi().a(oj.B, oi.G(dew.j)).a(oj.f, oi.G(dew.cC));
      oi $$1 = new oi().a(oj.B, oi.G(dew.j)).a(oj.f, oi.a(dew.cC, "_moist"));
      alb $$2 = oh.aW.a(dew.cC, $$0, this.c);
      alb $$3 = oh.aW.a(oi.a(dew.cC, "_moist"), $$1, this.c);
      this.b.accept(nx.a(dew.cC).a(a(dsn.aQ, 7, $$3, $$2)));
   }

   private List<alb> A(deu $$0) {
      alb $$1 = oh.aX.a(of.a($$0, "_floor0"), oi.v($$0), this.c);
      alb $$2 = oh.aX.a(of.a($$0, "_floor1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<alb> B(deu $$0) {
      alb $$1 = oh.aY.a(of.a($$0, "_side0"), oi.v($$0), this.c);
      alb $$2 = oh.aY.a(of.a($$0, "_side1"), oi.w($$0), this.c);
      alb $$3 = oh.aZ.a(of.a($$0, "_side_alt0"), oi.v($$0), this.c);
      alb $$4 = oh.aZ.a(of.a($$0, "_side_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alb> C(deu $$0) {
      alb $$1 = oh.ba.a(of.a($$0, "_up0"), oi.v($$0), this.c);
      alb $$2 = oh.ba.a(of.a($$0, "_up1"), oi.w($$0), this.c);
      alb $$3 = oh.bb.a(of.a($$0, "_up_alt0"), oi.v($$0), this.c);
      alb $$4 = oh.bb.a(of.a($$0, "_up_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<oa> a(List<alb> $$0, UnaryOperator<oa> $$1) {
      return $$0.stream().map($$0x -> oa.a().a(ob.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nv $$0 = nv.a().a(dsn.L, false).a(dsn.M, false).a(dsn.N, false).a(dsn.O, false).a(dsn.J, false);
      List<alb> $$1 = this.A(dew.cr);
      List<alb> $$2 = this.B(dew.cr);
      List<alb> $$3 = this.C(dew.cr);
      this.b
         .accept(
            nw.a(dew.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dsn.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dsn.M, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(nv.b(nv.a().a(dsn.N, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(nv.b(nv.a().a(dsn.O, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.d)))
               .a(nv.a().a(dsn.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<alb> $$0 = this.A(dew.cs);
      List<alb> $$1 = this.B(dew.cs);
      this.b
         .accept(
            nw.a(dew.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.d)))
         );
   }

   private void D(deu $$0) {
      alb $$1 = ok.t.create($$0, this.c);
      alb $$2 = ok.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nx.a($$0).a(a(dsn.j, $$2, $$1)));
   }

   private void N() {
      oi $$0 = oi.a(oi.a(dew.ad, "_side"), oi.a(dew.ad, "_top"));
      alb $$1 = oh.j.a(dew.ad, $$0, this.c);
      this.b.accept(d(dew.ad, $$1));
   }

   private void O() {
      this.a(cun.ad);
      deu $$0 = dew.E;
      ny.b<Boolean, Integer> $$1 = ny.a(djp.d, djp.b);
      alb $$2 = of.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alb $$4 = of.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oa.a().a(ob.c, $$4));
         $$1.a(false, $$3, oa.a().a(ob.c, $$2));
      }

      this.b.accept(nx.a(dew.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nx.a(dew.kI)
               .a(
                  ny.a(dsn.as)
                     .a(0, oa.a().a(ob.c, this.a(dew.kI, "_0", oh.c, oi::b)))
                     .a(1, oa.a().a(ob.c, this.a(dew.kI, "_1", oh.c, oi::b)))
                     .a(2, oa.a().a(ob.c, this.a(dew.kI, "_2", oh.c, oi::b)))
                     .a(3, oa.a().a(ob.c, this.a(dew.kI, "_3", oh.c, oi::b)))
               )
         );
   }

   private void Q() {
      alb $$0 = oi.G(dew.j);
      oi $$1 = new oi().a(oj.e, $$0).b(oj.e, oj.c).a(oj.f, oi.a(dew.i, "_top")).a(oj.i, oi.a(dew.i, "_snow"));
      oa $$2 = oa.a().a(ob.c, oh.n.a(dew.i, "_snow", $$1, this.c));
      this.a(dew.i, of.a(dew.i), $$2);
      alb $$3 = ok.f.get(dew.fl).a($$1x -> $$1x.a(oj.e, $$0)).a(dew.fl, this.c);
      this.a(dew.fl, $$3, $$2);
      alb $$4 = ok.f.get(dew.l).a($$1x -> $$1x.a(oj.e, $$0)).a(dew.l, this.c);
      this.a(dew.l, $$4, $$2);
   }

   private void a(deu $$0, alb $$1, oa $$2) {
      List<oa> $$3 = Arrays.asList(a($$1));
      this.b.accept(nx.a($$0).a(ny.a(dsn.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cun.rh);
      this.b
         .accept(
            nx.a(dew.fC)
               .a(
                  ny.a(dsn.ar)
                     .a(0, oa.a().a(ob.c, of.a(dew.fC, "_stage0")))
                     .a(1, oa.a().a(ob.c, of.a(dew.fC, "_stage1")))
                     .a(2, oa.a().a(ob.c, of.a(dew.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dew.kE, of.a(dew.kE)));
   }

   private void j(deu $$0, deu $$1) {
      oi $$2 = oi.b($$1);
      alb $$3 = oh.Y.a($$0, $$2, this.c);
      alb $$4 = oh.Z.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dsn.aT, 1, $$4, $$3)));
   }

   private void T() {
      alb $$0 = of.a(dew.hc);
      alb $$1 = of.a(dew.hc, "_side");
      this.a(cun.lR);
      this.b
         .accept(
            nx.a(dew.hc)
               .a(
                  ny.a(dsn.Q)
                     .a(je.a, oa.a().a(ob.c, $$0))
                     .a(je.c, oa.a().a(ob.c, $$1))
                     .a(je.f, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.d, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.e, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               )
         );
   }

   private void k(deu $$0, deu $$1) {
      alb $$2 = of.a($$0);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      alb $$0 = of.a(dew.eW, "_post_ends");
      alb $$1 = of.a(dew.eW, "_post");
      alb $$2 = of.a(dew.eW, "_cap");
      alb $$3 = of.a(dew.eW, "_cap_alt");
      alb $$4 = of.a(dew.eW, "_side");
      alb $$5 = of.a(dew.eW, "_side_alt");
      this.b
         .accept(
            nw.a(dew.eW)
               .a(oa.a().a(ob.c, $$0))
               .a(nv.a().a(dsn.L, false).a(dsn.M, false).a(dsn.N, false).a(dsn.O, false), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsn.L, true).a(dsn.M, false).a(dsn.N, false).a(dsn.O, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsn.L, false).a(dsn.M, true).a(dsn.N, false).a(dsn.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.L, false).a(dsn.M, false).a(dsn.N, true).a(dsn.O, false), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsn.L, false).a(dsn.M, false).a(dsn.N, false).a(dsn.O, true), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsn.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsn.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dsn.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         );
      this.d(dew.eW);
   }

   private void E(deu $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(b()));
   }

   private void V() {
      alb $$0 = of.a(dew.dw);
      alb $$1 = of.a(dew.dw, "_on");
      this.d(dew.dw);
      this.b
         .accept(
            nx.a(dew.dw)
               .a(a(dsn.w, $$0, $$1))
               .a(
                  ny.a(dsn.U, dsn.R)
                     .a(dsi.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsi.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
                     .a(dsi.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsi.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsi.a, je.c, oa.a())
                     .a(dsi.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsi.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsi.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsi.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsi.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsi.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsi.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
               )
         );
   }

   private void W() {
      this.d(dew.fm);
      this.b.accept(b(dew.fm, of.a(dew.fm)));
   }

   private void X() {
      this.d(dew.tn);
      this.b.accept(c(dew.tn, of.a(dew.tn)));
   }

   private void Y() {
      this.b.accept(nx.a(dew.ed).a(ny.a(dsn.H).a(je.a.a, oa.a().a(ob.c, of.a(dew.ed, "_ns"))).a(je.a.c, oa.a().a(ob.c, of.a(dew.ed, "_ew")))));
   }

   private void Z() {
      alb $$0 = ok.a.create(dew.dV, this.c);
      this.b
         .accept(
            nx.a(
               dew.dV,
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
      alb $$0 = of.a(dew.kO);
      alb $$1 = of.a(dew.kO, "_on");
      this.b.accept(nx.a(dew.kO).a(a(dsn.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oi $$0 = new oi().a(oj.e, oi.a(dew.by, "_bottom")).a(oj.i, oi.a(dew.by, "_side"));
      alb $$1 = oi.a(dew.by, "_top_sticky");
      alb $$2 = oi.a(dew.by, "_top");
      oi $$3 = $$0.c(oj.E, $$1);
      oi $$4 = $$0.c(oj.E, $$2);
      alb $$5 = of.a(dew.by, "_base");
      this.a(dew.by, $$5, $$4);
      this.a(dew.br, $$5, $$3);
      alb $$6 = oh.n.a(dew.by, "_inventory", $$0.c(oj.f, $$2), this.c);
      alb $$7 = oh.n.a(dew.br, "_inventory", $$0.c(oj.f, $$1), this.c);
      this.a(dew.by, $$6);
      this.a(dew.br, $$7);
   }

   private void a(deu $$0, alb $$1, oi $$2) {
      alb $$3 = oh.bh.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dsn.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oi $$0 = new oi().a(oj.F, oi.a(dew.by, "_top")).a(oj.i, oi.a(dew.by, "_side"));
      oi $$1 = $$0.c(oj.E, oi.a(dew.by, "_top_sticky"));
      oi $$2 = $$0.c(oj.E, oi.a(dew.by, "_top"));
      this.b
         .accept(
            nx.a(dew.bz)
               .a(
                  ny.a(dsn.x, dsn.bg)
                     .a(false, dsz.a, oa.a().a(ob.c, oh.bi.a(dew.by, "_head", $$2, this.c)))
                     .a(false, dsz.b, oa.a().a(ob.c, oh.bi.a(dew.by, "_head_sticky", $$1, this.c)))
                     .a(true, dsz.a, oa.a().a(ob.c, oh.bj.a(dew.by, "_head_short", $$2, this.c)))
                     .a(true, dsz.b, oa.a().a(ob.c, oh.bj.a(dew.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      deu $$0 = dew.tr;
      oi $$1 = oi.a($$0, "_side_inactive", "_top_inactive");
      oi $$2 = oi.a($$0, "_side_active", "_top_active");
      oi $$3 = oi.a($$0, "_side_active", "_top_ejecting_reward");
      oi $$4 = oi.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      oi $$5 = oi.a($$0, "_side_active_ominous", "_top_active_ominous");
      oi $$6 = oi.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alb $$7 = oh.o.a($$0, $$1, this.c);
      alb $$8 = oh.o.a($$0, "_active", $$2, this.c);
      alb $$9 = oh.o.a($$0, "_ejecting_reward", $$3, this.c);
      alb $$10 = oh.o.a($$0, "_inactive_ominous", $$4, this.c);
      alb $$11 = oh.o.a($$0, "_active_ominous", $$5, this.c);
      alb $$12 = oh.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nx.a($$0).a(ny.a(dsn.by, dsn.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oa.a().a(ob.c, $$7x ? $$10 : $$7);
            case b, c, d -> oa.a().a(ob.c, $$7x ? $$11 : $$8);
            case e -> oa.a().a(ob.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      deu $$0 = dew.ts;
      oi $$1 = oi.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      oi $$2 = oi.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      oi $$3 = oi.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      oi $$4 = oi.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alb $$5 = oh.bN.a($$0, $$1, this.c);
      alb $$6 = oh.bN.a($$0, "_active", $$2, this.c);
      alb $$7 = oh.bN.a($$0, "_unlocking", $$3, this.c);
      alb $$8 = oh.bN.a($$0, "_ejecting_reward", $$4, this.c);
      oi $$9 = oi.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      oi $$10 = oi.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$11 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      oi $$12 = oi.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alb $$13 = oh.bN.a($$0, "_ominous", $$9, this.c);
      alb $$14 = oh.bN.a($$0, "_active_ominous", $$10, this.c);
      alb $$15 = oh.bN.a($$0, "_unlocking_ominous", $$11, this.c);
      alb $$16 = oh.bN.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nx.a($$0).a(b()).a(ny.a(dnp.b, dnp.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oa.a().a(ob.c, $$9x ? $$13 : $$5);
            case b -> oa.a().a(ob.c, $$9x ? $$14 : $$6);
            case c -> oa.a().a(ob.c, $$9x ? $$15 : $$7);
            case d -> oa.a().a(ob.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      alb $$0 = of.a(dew.qQ, "_inactive");
      alb $$1 = of.a(dew.qQ, "_active");
      this.a(dew.qQ, $$0);
      this.b.accept(nx.a(dew.qQ).a(ny.a(dsn.bo).a($$2 -> oa.a().a(ob.c, $$2 != dte.b && $$2 != dte.c ? $$0 : $$1))));
   }

   private void ag() {
      alb $$0 = of.a(dew.qR, "_inactive");
      alb $$1 = of.a(dew.qR, "_active");
      this.a(dew.qR, $$0);
      this.b.accept(nx.a(dew.qR).a(ny.a(dsn.bo).a($$2 -> oa.a().a(ob.c, $$2 != dte.b && $$2 != dte.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      alb $$0 = oh.bM.a(dew.qV, oi.a(false), this.c);
      alb $$1 = oh.bM.a(dew.qV, "_can_summon", oi.a(true), this.c);
      this.a(dew.qV, $$0);
      this.b.accept(nx.a(dew.qV).a(a(dsn.G, $$1, $$0)));
   }

   private void ai() {
      alb $$0 = of.a(dew.nS, "_stable");
      alb $$1 = of.a(dew.nS, "_unstable");
      this.a(dew.nS, $$0);
      this.b.accept(nx.a(dew.nS).a(a(dsn.b, $$1, $$0)));
   }

   private void aj() {
      alb $$0 = this.a(dew.sv, "", oh.ao, oi::c);
      alb $$1 = this.a(dew.sv, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dew.sv).a(a(dsn.D, $$1, $$0)));
      alb $$2 = this.a(dew.sw, "", oh.ao, oi::c);
      alb $$3 = this.a(dew.sw, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dew.sw).a(a(dsn.D, $$3, $$2)));
   }

   private void ak() {
      alb $$0 = ok.a.create(dew.fB, this.c);
      alb $$1 = this.a(dew.fB, "_on", oh.c, oi::b);
      this.b.accept(nx.a(dew.fB).a(a(dsn.r, $$1, $$0)));
   }

   private void l(deu $$0, deu $$1) {
      oi $$2 = oi.y($$0);
      this.b.accept(c($$0, oh.bf.a($$0, $$2, this.c)));
      this.b.accept(nx.a($$1, oa.a().a(ob.c, oh.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oi $$0 = oi.y(dew.dK);
      oi $$1 = oi.i(oi.a(dew.dK, "_off"));
      alb $$2 = oh.bf.a(dew.dK, $$0, this.c);
      alb $$3 = oh.bf.a(dew.dK, "_off", $$1, this.c);
      this.b.accept(nx.a(dew.dK).a(a(dsn.r, $$2, $$3)));
      alb $$4 = oh.bg.a(dew.dL, $$0, this.c);
      alb $$5 = oh.bg.a(dew.dL, "_off", $$1, this.c);
      this.b.accept(nx.a(dew.dL).a(a(dsn.r, $$4, $$5)).a(d()));
      this.d(dew.dK);
      this.c(dew.dL);
   }

   private void am() {
      this.a(cun.lK);
      this.b.accept(nx.a(dew.eh).a(ny.a(dsn.aA, dsn.s, dsn.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oa.a().a(ob.c, oi.a(dew.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cun.cT);
      this.b
         .accept(
            nx.a(dew.mV)
               .a(
                  ny.a(dsn.aS, dsn.C)
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
      oi $$0 = oi.a(dew.dN);
      alb $$1 = oh.c.a(dew.dP, $$0, this.c);
      this.b.accept(nx.a(dew.dN).a(ny.a(dsn.aF).a($$1x -> oa.a().a(ob.c, $$1x < 8 ? of.a(dew.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dew.dN, of.a(dew.dN, "_height2"));
      this.b.accept(c(dew.dP, $$1));
   }

   private void ap() {
      this.b.accept(nx.a(dew.oc, oa.a().a(ob.c, of.a(dew.oc))).a(b()));
   }

   private void aq() {
      alb $$0 = ok.a.create(dew.pa, this.c);
      this.a(dew.pa, $$0);
      this.b.accept(nx.a(dew.pa).a(ny.a(dsn.bj).a($$0x -> oa.a().a(ob.c, this.a(dew.pa, "_" + $$0x.c(), oh.c, oi::b)))));
   }

   private void ar() {
      this.a(cun.wr);
      this.b.accept(nx.a(dew.oi).a(ny.a(dsn.as).a($$0 -> oa.a().a(ob.c, this.a(dew.oi, "_stage" + $$0, oh.ao, oi::c)))));
   }

   private void as() {
      this.a(cun.ps);
      this.b
         .accept(
            nx.a(dew.fI)
               .a(
                  ny.a(dsn.a, dsn.M, dsn.L, dsn.N, dsn.O)
                     .a(false, false, false, false, false, oa.a().a(ob.c, of.a(dew.fI, "_ns")))
                     .a(false, true, false, false, false, oa.a().a(ob.c, of.a(dew.fI, "_n")).a(ob.b, ob.a.b))
                     .a(false, false, true, false, false, oa.a().a(ob.c, of.a(dew.fI, "_n")))
                     .a(false, false, false, true, false, oa.a().a(ob.c, of.a(dew.fI, "_n")).a(ob.b, ob.a.c))
                     .a(false, false, false, false, true, oa.a().a(ob.c, of.a(dew.fI, "_n")).a(ob.b, ob.a.d))
                     .a(false, true, true, false, false, oa.a().a(ob.c, of.a(dew.fI, "_ne")))
                     .a(false, true, false, true, false, oa.a().a(ob.c, of.a(dew.fI, "_ne")).a(ob.b, ob.a.b))
                     .a(false, false, false, true, true, oa.a().a(ob.c, of.a(dew.fI, "_ne")).a(ob.b, ob.a.c))
                     .a(false, false, true, false, true, oa.a().a(ob.c, of.a(dew.fI, "_ne")).a(ob.b, ob.a.d))
                     .a(false, false, true, true, false, oa.a().a(ob.c, of.a(dew.fI, "_ns")))
                     .a(false, true, false, false, true, oa.a().a(ob.c, of.a(dew.fI, "_ns")).a(ob.b, ob.a.b))
                     .a(false, true, true, true, false, oa.a().a(ob.c, of.a(dew.fI, "_nse")))
                     .a(false, true, false, true, true, oa.a().a(ob.c, of.a(dew.fI, "_nse")).a(ob.b, ob.a.b))
                     .a(false, false, true, true, true, oa.a().a(ob.c, of.a(dew.fI, "_nse")).a(ob.b, ob.a.c))
                     .a(false, true, true, false, true, oa.a().a(ob.c, of.a(dew.fI, "_nse")).a(ob.b, ob.a.d))
                     .a(false, true, true, true, true, oa.a().a(ob.c, of.a(dew.fI, "_nsew")))
                     .a(true, false, false, false, false, oa.a().a(ob.c, of.a(dew.fI, "_attached_ns")))
                     .a(true, false, true, false, false, oa.a().a(ob.c, of.a(dew.fI, "_attached_n")))
                     .a(true, false, false, true, false, oa.a().a(ob.c, of.a(dew.fI, "_attached_n")).a(ob.b, ob.a.c))
                     .a(true, true, false, false, false, oa.a().a(ob.c, of.a(dew.fI, "_attached_n")).a(ob.b, ob.a.b))
                     .a(true, false, false, false, true, oa.a().a(ob.c, of.a(dew.fI, "_attached_n")).a(ob.b, ob.a.d))
                     .a(true, true, true, false, false, oa.a().a(ob.c, of.a(dew.fI, "_attached_ne")))
                     .a(true, true, false, true, false, oa.a().a(ob.c, of.a(dew.fI, "_attached_ne")).a(ob.b, ob.a.b))
                     .a(true, false, false, true, true, oa.a().a(ob.c, of.a(dew.fI, "_attached_ne")).a(ob.b, ob.a.c))
                     .a(true, false, true, false, true, oa.a().a(ob.c, of.a(dew.fI, "_attached_ne")).a(ob.b, ob.a.d))
                     .a(true, false, true, true, false, oa.a().a(ob.c, of.a(dew.fI, "_attached_ns")))
                     .a(true, true, false, false, true, oa.a().a(ob.c, of.a(dew.fI, "_attached_ns")).a(ob.b, ob.a.b))
                     .a(true, true, true, true, false, oa.a().a(ob.c, of.a(dew.fI, "_attached_nse")))
                     .a(true, true, false, true, true, oa.a().a(ob.c, of.a(dew.fI, "_attached_nse")).a(ob.b, ob.a.b))
                     .a(true, false, true, true, true, oa.a().a(ob.c, of.a(dew.fI, "_attached_nse")).a(ob.b, ob.a.c))
                     .a(true, true, true, false, true, oa.a().a(ob.c, of.a(dew.fI, "_attached_nse")).a(ob.b, ob.a.d))
                     .a(true, true, true, true, true, oa.a().a(ob.c, of.a(dew.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dew.fH);
      this.b.accept(nx.a(dew.fH).a(ny.a(dsn.a, dsn.w).a(($$0, $$1) -> oa.a().a(ob.c, oi.a(dew.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alb a(int $$0, String $$1, oi $$2) {
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

   private alb a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", oi.b(oi.G(dew.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oi.b(oi.a(dew.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oi.b(oi.a(dew.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cun.kp);
      this.b.accept(nx.a(dew.mf).a(ny.a(dsn.aD, dsn.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cun.kq);
      Function<Integer, alb> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oi $$2 = oi.a($$1);
         return oh.bw.a(dew.mg, $$1, $$2, this.c);
      };
      this.b.accept(nx.a(dew.mg).a(ny.a(dmc.c).a($$1 -> oa.a().a(ob.c, $$0.apply($$1)))));
   }

   private void F(deu $$0) {
      this.d($$0);
      alb $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      nv.c $$3 = ac.a(nv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dso, Function<alb, oa>> $$4 : a) {
         dso $$5 = (dso)$$4.getFirst();
         Function<alb, oa> $$6 = (Function<alb, oa>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(nv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      alb $$0 = oi.a(dew.qU, "_bottom");
      oi $$1 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dew.qU, "_top")).a(oj.i, oi.a(dew.qU, "_side"));
      oi $$2 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dew.qU, "_top_bloom")).a(oj.i, oi.a(dew.qU, "_side_bloom"));
      alb $$3 = oh.n.a(dew.qU, "", $$1, this.c);
      alb $$4 = oh.n.a(dew.qU, "_bloom", $$2, this.c);
      this.b.accept(nx.a(dew.qU).a(ny.a(dsn.E).a($$2x -> oa.a().a(ob.c, $$2x ? $$4 : $$3))));
      this.a(cun.gj, $$3);
   }

   private void ax() {
      deu $$0 = dew.cm;
      alb $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      List.of(Pair.of(je.c, ob.a.a), Pair.of(je.f, ob.a.b), Pair.of(je.d, ob.a.c), Pair.of(je.e, ob.a.d)).forEach($$2x -> {
         je $$3 = (je)$$2x.getFirst();
         ob.a $$4 = (ob.a)$$2x.getSecond();
         nv.c $$5 = nv.a().a(dsn.R, $$3);
         $$2.a($$5, oa.a().a(ob.c, $$1).a(ob.b, $$4).a(ob.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, of.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2) {
      List.of(Pair.of(dsn.bp, oh.aM), Pair.of(dsn.bq, oh.aN), Pair.of(dsn.br, oh.aO), Pair.of(dsn.bs, oh.aP), Pair.of(dsn.bt, oh.aQ), Pair.of(dsn.bu, oh.aR))
         .forEach($$3 -> {
            dso $$4 = (dso)$$3.getFirst();
            og $$5 = (og)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2, dso $$3, og $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oi $$7 = new oi().a(oj.b, oi.a(dew.cm, $$6));
      nr.d $$8 = new nr.d($$4, $$6);
      alb $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dew.cm, $$6, $$7, this.c));
      $$0.a(nv.a($$1, nv.a().a($$3, $$5)), oa.a().a(ob.c, $$9).a(ob.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dew.kJ, oh.c.a(dew.kJ, oi.b(of.a("magma")), this.c)));
   }

   private void G(deu $$0) {
      this.b($$0, ok.q);
      oh.bD.a(of.a($$0.r()), oi.u($$0), this.c);
   }

   private void b(deu $$0, deu $$1, nr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(deu $$0, deu $$1) {
      oh.bE.a(of.a($$0.r()), oi.u($$1), this.c);
   }

   private void az() {
      alb $$0 = of.a(dew.b);
      alb $$1 = of.a(dew.b, "_mirrored");
      this.b.accept(a(dew.eN, $$0, $$1));
      this.a(dew.eN, $$0);
   }

   private void aA() {
      alb $$0 = of.a(dew.sJ);
      alb $$1 = of.a(dew.sJ, "_mirrored");
      this.b.accept(a(dew.td, $$0, $$1).a(f()));
      this.a(dew.td, $$0);
   }

   private void n(deu $$0, deu $$1) {
      this.a($$0, nr.e.b);
      oi $$2 = oi.d(oi.a($$0, "_pot"));
      alb $$3 = nr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      alb $$0 = oi.a(dew.pl, "_bottom");
      alb $$1 = oi.a(dew.pl, "_top_off");
      alb $$2 = oi.a(dew.pl, "_top");
      alb[] $$3 = new alb[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oi $$5 = new oi().a(oj.e, $$0).a(oj.f, $$4 == 0 ? $$1 : $$2).a(oj.i, oi.a(dew.pl, "_side" + $$4));
         $$3[$$4] = oh.n.a(dew.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nx.a(dew.pl).a(ny.a(dsn.aZ).a($$1x -> oa.a().a(ob.c, $$3[$$1x]))));
      this.a(cun.wP, $$3[0]);
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
      alb $$0 = oi.a(dew.pb, "_top");
      alb $$1 = oi.a(dew.pb, "_bottom");
      alb $$2 = oi.a(dew.pb, "_side");
      alb $$3 = oi.a(dew.pb, "_lock");
      oi $$4 = new oi().a(oj.o, $$2).a(oj.m, $$2).a(oj.l, $$2).a(oj.c, $$0).a(oj.j, $$0).a(oj.k, $$1).a(oj.n, $$3);
      alb $$5 = oh.b.a(dew.pb, $$4, this.c);
      this.b.accept(nx.a(dew.pb, oa.a().a(ob.c, $$5)).a(ny.a(dsn.T).a($$0x -> this.a($$0x, oa.a()))));
   }

   private void aD() {
      deu $$0 = dew.n;
      alb $$1 = of.a($$0);
      ok $$2 = ok.a.get($$0);
      deu $$3 = dew.jH;
      alb $$4 = oh.ab.a($$3, $$2.b(), this.c);
      alb $$5 = oh.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ls.a().filter(lt::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dew.rf).a(ls.w).a(dew.rf, dew.rD).a(dew.rj, dew.rn).a(ls.y);
      this.h(dew.re).a(ls.A).a(dew.re, dew.rC).a(dew.ri, dew.rm).a(ls.C);
      this.h(dew.rd).a(ls.E).a(dew.rd, dew.rB).a(dew.rh, dew.rl).a(ls.G);
      this.h(dew.rc).a(ls.I).a(dew.rc, dew.rA).a(dew.rg, dew.rk).a(ls.K);
      this.w(dew.sk);
      this.w(dew.sl);
      this.w(dew.sm);
      this.w(dew.sn);
      this.i(dew.sk, dew.so);
      this.i(dew.sl, dew.sp);
      this.i(dew.sm, dew.sq);
      this.i(dew.sn, dew.sr);
      this.m(dew.a);
      this.c(dew.nc, dew.a);
      this.c(dew.nb, dew.a);
      this.m(dew.fO);
      this.m(dew.dQ);
      this.c(dew.nd, dew.G);
      this.m(dew.fA);
      this.m(dew.me);
      this.m(dew.fr);
      this.m(dew.fR);
      this.a(cun.ue);
      this.m(dew.pg);
      this.m(dew.G);
      this.m(dew.H);
      this.m(dew.hV);
      this.a(cun.fS);
      this.o(dew.pM, dew.qd);
      this.o(dew.pN, dew.qe);
      this.o(dew.pO, dew.qf);
      this.o(dew.pP, dew.qg);
      this.o(dew.pQ, dew.qh);
      this.o(dew.pR, dew.qi);
      this.o(dew.pS, dew.qj);
      this.o(dew.pT, dew.qk);
      this.o(dew.pU, dew.ql);
      this.o(dew.pV, dew.qm);
      this.o(dew.pW, dew.qn);
      this.o(dew.pX, dew.qo);
      this.o(dew.pY, dew.qp);
      this.o(dew.pZ, dew.qq);
      this.o(dew.qa, dew.qr);
      this.o(dew.qb, dew.qs);
      this.o(dew.pL, dew.qc);
      this.m(dew.na);
      this.m(dew.gs);
      this.m(dew.qP);
      this.m(dew.sx);
      this.s(dew.sy);
      this.s(dew.sz);
      this.t(dew.ti);
      this.t(dew.tj);
      this.aj();
      this.g(dew.sC, dew.sA);
      this.p(dew.sB);
      this.a(dew.hW, cun.hB);
      this.a(cun.hB);
      this.aE();
      this.a(dew.kN, cun.jb);
      this.a(cun.jb);
      this.f(dew.bQ, oi.a(dew.by, "_side"));
      this.a(dew.R);
      this.a(dew.S);
      this.a(dew.iB);
      this.a(dew.cx);
      this.a(dew.cy);
      this.a(dew.cz);
      this.a(dew.fE);
      this.a(dew.fF);
      this.a(dew.fJ);
      this.a(dew.N);
      this.a(dew.T);
      this.a(dew.O);
      this.a(dew.ch);
      this.a(dew.P);
      this.a(dew.Q);
      this.a(dew.ci);
      this.b(dew.pj, ok.d);
      this.a(dew.pi);
      this.a(dew.aR);
      this.a(dew.aS);
      this.a(dew.aT);
      this.a(dew.hb);
      this.a(dew.dI);
      this.a(dew.dJ);
      this.a(dew.ha);
      this.a(dew.pC);
      this.a(dew.mW);
      this.a(dew.dR);
      this.a(dew.k);
      this.a(dew.pk);
      this.a(dew.fz);
      this.a(dew.ec);
      this.a(dew.L);
      this.a(dew.ph);
      this.a(dew.dO);
      this.b(dew.dT, ok.g);
      this.b(dew.pq, ok.d);
      this.b(dew.fa, ok.d);
      this.m(dew.ac);
      this.m(dew.ga);
      this.a(dew.kK);
      this.a(dew.aY);
      this.a(dew.iC);
      this.a(dew.co);
      this.a(dew.pK);
      this.a(dew.ii);
      this.a(dew.oy);
      this.a(dew.dW);
      this.a(dew.dX);
      this.b(dew.ct, ok.b);
      this.a(dew.aO);
      this.b(dew.bw, ok.v);
      this.a(cun.cS);
      this.b(dew.ck, ok.f);
      this.b(dew.pd, ok.d);
      this.a(dew.op);
      this.a(dew.aP);
      this.a(dew.qt);
      this.a(dew.qu);
      this.a(dew.qN);
      this.a(dew.su);
      this.a(dew.tf);
      this.a(dew.tg);
      this.a(dew.th);
      this.e(dew.qS);
      this.m(dew.tt);
      this.aD();
      this.a(dew.ra);
      this.a(dew.rb);
      this.a(dew.qW);
      this.a(dew.qX);
      this.a(dew.qY);
      this.a(dew.qZ);
      this.k(dew.qW, dew.rw);
      this.k(dew.qX, dew.ry);
      this.k(dew.qY, dew.rx);
      this.k(dew.qZ, dew.rz);
      this.i(dew.rM);
      this.i(dew.rN);
      this.i(dew.rP);
      this.i(dew.rO);
      this.a(dew.rM, dew.rQ);
      this.a(dew.rN, dew.rR);
      this.a(dew.rP, dew.rT);
      this.a(dew.rO, dew.rS);
      this.k(dew.rU);
      this.k(dew.rV);
      this.k(dew.rX);
      this.k(dew.rW);
      this.b(dew.rU, dew.rY);
      this.b(dew.rV, dew.rZ);
      this.b(dew.rX, dew.sb);
      this.b(dew.rW, dew.sa);
      this.a(dew.sc);
      this.a(dew.sd);
      this.a(dew.se);
      this.a(dew.sf);
      this.k(dew.sc, dew.sg);
      this.k(dew.sd, dew.sh);
      this.k(dew.se, dew.si);
      this.k(dew.sf, dew.sj);
      this.j(dew.gW, dew.ch);
      this.j(dew.gX, dew.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dew.og, dew.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dew.kt);
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
      this.F(dew.ff);
      this.F(dew.fg);
      this.F(dew.qT);
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
      this.E(dew.cO);
      this.d(dew.cO);
      this.E(dew.oa);
      this.g();
      this.E(dew.sE);
      this.l(dew.cp, dew.cq);
      this.l(dew.ea, dew.eb);
      this.a(dew.cA, dew.n, oi::c);
      this.a(dew.nY, dew.p, oi::d);
      this.y(dew.ow);
      this.y(dew.on);
      this.v(dew.aU);
      this.v(dew.hi);
      this.C();
      this.D(dew.oe);
      this.D(dew.of);
      this.e(dew.eX, of.a(dew.eX));
      this.a(dew.dY, ok.d);
      this.a(dew.dZ, ok.d);
      this.a(dew.te);
      this.a(dew.kM, ok.d);
      this.f(dew.j);
      this.f(dew.sH);
      this.f(dew.I);
      this.g(dew.J);
      this.g(dew.M);
      this.f(dew.K);
      this.e(dew.F);
      this.b(dew.to, ok.f);
      this.a(dew.ij, ok.d, ok.e);
      this.a(dew.kx, ok.w, ok.x);
      this.a(dew.hf, ok.w, ok.x);
      this.a(dew.tk, ok.d, ok.e);
      this.a(dew.tl, ok.d, ok.e);
      this.a(dew.tm, ok.d, ok.e);
      this.c(dew.nT, ok.i);
      this.z();
      this.a(dew.pe, oi::A);
      this.a(dew.pf, oi::C);
      this.a(dew.kD, dsn.as, 0, 1, 2, 3);
      this.a(dew.gt, dsn.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dew.fq, dsn.as, 0, 1, 1, 2);
      this.a(dew.gu, dsn.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dew.cB, dsn.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dew.kA, nr.e.b, dsn.aq, 0, 1);
      this.i();
      this.h();
      this.a(of.a("decorated_pot"), dew.iA).b(dew.tp);
      this.a(of.a("banner"), dew.n)
         .a(oh.bF, dew.iJ, dew.iK, dew.iL, dew.iM, dew.iN, dew.iO, dew.iP, dew.iQ, dew.iR, dew.iS, dew.iT, dew.iU, dew.iV, dew.iW, dew.iX, dew.iY)
         .b(dew.iZ, dew.ja, dew.jb, dew.jc, dew.jd, dew.je, dew.jf, dew.jg, dew.jh, dew.ji, dew.jj, dew.jk, dew.jl, dew.jm, dew.jn, dew.jo);
      this.a(of.a("bed"), dew.n)
         .b(dew.aZ, dew.ba, dew.bb, dew.bc, dew.bd, dew.be, dew.bf, dew.bg, dew.bh, dew.bi, dew.bj, dew.bk, dew.bl, dew.bm, dew.bn, dew.bo);
      this.m(dew.aZ, dew.bA);
      this.m(dew.ba, dew.bB);
      this.m(dew.bb, dew.bC);
      this.m(dew.bc, dew.bD);
      this.m(dew.bd, dew.bE);
      this.m(dew.be, dew.bF);
      this.m(dew.bf, dew.bG);
      this.m(dew.bg, dew.bH);
      this.m(dew.bh, dew.bI);
      this.m(dew.bi, dew.bJ);
      this.m(dew.bj, dew.bK);
      this.m(dew.bk, dew.bL);
      this.m(dew.bl, dew.bM);
      this.m(dew.bm, dew.bN);
      this.m(dew.bn, dew.bO);
      this.m(dew.bo, dew.bP);
      this.a(of.a("skull"), dew.dW)
         .a(oh.bG, dew.gM, dew.gK, dew.gI, dew.gE, dew.gG, dew.gQ)
         .a(dew.gO)
         .b(dew.gN, dew.gP, dew.gL, dew.gJ, dew.gF, dew.gH, dew.gR);
      this.G(dew.kP);
      this.G(dew.kQ);
      this.G(dew.kR);
      this.G(dew.kS);
      this.G(dew.kT);
      this.G(dew.kU);
      this.G(dew.kV);
      this.G(dew.kW);
      this.G(dew.kX);
      this.G(dew.kY);
      this.G(dew.kZ);
      this.G(dew.la);
      this.G(dew.lb);
      this.G(dew.lc);
      this.G(dew.ld);
      this.G(dew.le);
      this.G(dew.lf);
      this.b(dew.mX, ok.q);
      this.c(dew.mX);
      this.a(of.a("chest"), dew.n).b(dew.cv, dew.gV);
      this.a(of.a("ender_chest"), dew.co).b(dew.fG);
      this.f(dew.fx, dew.co).a(dew.fx, dew.kF);
      this.a(dew.aM);
      this.a(dew.aN);
      this.a(dew.lw);
      this.a(dew.lx);
      this.a(dew.ly);
      this.a(dew.lz);
      this.a(dew.lA);
      this.a(dew.lB);
      this.a(dew.lC);
      this.a(dew.lD);
      this.a(dew.lE);
      this.a(dew.lF);
      this.a(dew.lG);
      this.a(dew.lH);
      this.a(dew.lI);
      this.a(dew.lJ);
      this.a(dew.lK);
      this.a(dew.lL);
      this.a(ok.a, dew.lM, dew.lN, dew.lO, dew.lP, dew.lQ, dew.lR, dew.lS, dew.lT, dew.lU, dew.lV, dew.lW, dew.lX, dew.lY, dew.lZ, dew.ma, dew.mb);
      this.a(dew.iA);
      this.a(dew.hj);
      this.a(dew.hk);
      this.a(dew.hl);
      this.a(dew.hm);
      this.a(dew.hn);
      this.a(dew.ho);
      this.a(dew.hp);
      this.a(dew.hq);
      this.a(dew.hr);
      this.a(dew.hs);
      this.a(dew.ht);
      this.a(dew.hu);
      this.a(dew.hv);
      this.a(dew.hw);
      this.a(dew.hx);
      this.a(dew.hy);
      this.a(dew.qO);
      this.h(dew.aQ, dew.eY);
      this.h(dew.ei, dew.hz);
      this.h(dew.ej, dew.hA);
      this.h(dew.ek, dew.hB);
      this.h(dew.el, dew.hC);
      this.h(dew.em, dew.hD);
      this.h(dew.en, dew.hE);
      this.h(dew.eo, dew.hF);
      this.h(dew.ep, dew.hG);
      this.h(dew.eq, dew.hH);
      this.h(dew.er, dew.hI);
      this.h(dew.es, dew.hJ);
      this.h(dew.et, dew.hK);
      this.h(dew.eu, dew.hL);
      this.h(dew.ev, dew.hM);
      this.h(dew.ew, dew.hN);
      this.h(dew.ex, dew.hO);
      this.b(ok.o, dew.lg, dew.lh, dew.li, dew.lj, dew.lk, dew.ll, dew.lm, dew.ln, dew.lo, dew.lp, dew.lq, dew.lr, dew.ls, dew.lt, dew.lu, dew.lv);
      this.g(dew.bA, dew.ik);
      this.g(dew.bB, dew.il);
      this.g(dew.bC, dew.im);
      this.g(dew.bD, dew.in);
      this.g(dew.bE, dew.io);
      this.g(dew.bF, dew.ip);
      this.g(dew.bG, dew.iq);
      this.g(dew.bH, dew.ir);
      this.g(dew.bI, dew.is);
      this.g(dew.bJ, dew.it);
      this.g(dew.bK, dew.iu);
      this.g(dew.bL, dew.iv);
      this.g(dew.bM, dew.iw);
      this.g(dew.bN, dew.ix);
      this.g(dew.bO, dew.iy);
      this.g(dew.bP, dew.iz);
      this.a(dew.sI);
      this.a(dew.eL);
      this.a(dew.bu, dew.gb, nr.e.a);
      this.a(dew.bR, dew.gc, nr.e.b);
      this.a(dew.bT, dew.gd, nr.e.b);
      this.a(dew.bU, dew.ge, nr.e.b);
      this.a(dew.bV, dew.gf, nr.e.b);
      this.a(dew.bW, dew.gg, nr.e.b);
      this.a(dew.bX, dew.gh, nr.e.b);
      this.a(dew.bY, dew.gi, nr.e.b);
      this.a(dew.bZ, dew.gj, nr.e.b);
      this.a(dew.ca, dew.gk, nr.e.b);
      this.a(dew.cb, dew.gl, nr.e.b);
      this.a(dew.cc, dew.gm, nr.e.b);
      this.a(dew.ce, dew.gn, nr.e.b);
      this.a(dew.cd, dew.go, nr.e.b);
      this.a(dew.cg, dew.gp, nr.e.b);
      this.a(dew.cf, dew.gq, nr.e.b);
      this.a(dew.bv, dew.gr, nr.e.b);
      this.a(dew.bS, dew.fS, nr.e.b);
      this.H();
      this.u(dew.eT);
      this.u(dew.eU);
      this.u(dew.eV);
      this.a(dew.bt, nr.e.a);
      this.b(dew.dS, nr.e.a);
      this.a(cun.dJ);
      this.b(dew.mc, dew.md, nr.e.b);
      this.a(cun.dK);
      this.c(dew.md);
      this.b(dew.sG, nr.e.b);
      this.c(dew.sG);
      this.c(dew.sw);
      this.b(dew.oz, dew.oA, nr.e.b);
      this.b(dew.oB, dew.oC, nr.e.b);
      this.a(dew.oz, "_plant");
      this.c(dew.oA);
      this.a(dew.oB, "_plant");
      this.c(dew.oC);
      this.a(dew.mY, nr.e.a, oi.c(oi.a(dew.mZ, "_stage0")));
      this.m();
      this.a(dew.bs, nr.e.b);
      this.c(dew.iE, nr.e.b);
      this.c(dew.iF, nr.e.b);
      this.c(dew.iG, nr.e.b);
      this.c(dew.iH, nr.e.a);
      this.c(dew.iI, nr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dew.mw, dew.mr, dew.mm, dew.mh, dew.mG, dew.mB, dew.mQ, dew.mL);
      this.a(dew.mx, dew.ms, dew.mn, dew.mi, dew.mH, dew.mC, dew.mR, dew.mM);
      this.a(dew.my, dew.mt, dew.mo, dew.mj, dew.mI, dew.mD, dew.mS, dew.mN);
      this.a(dew.mz, dew.mu, dew.mp, dew.mk, dew.mJ, dew.mE, dew.mT, dew.mO);
      this.a(dew.mA, dew.mv, dew.mq, dew.ml, dew.mK, dew.mF, dew.mU, dew.mP);
      this.e(dew.fe, dew.fc);
      this.e(dew.fd, dew.fb);
      this.l(dew.ab).c(dew.ab).a(dew.av);
      this.l(dew.am).c(dew.am).a(dew.aD);
      this.a(dew.am, dew.dj, dew.ds);
      this.b(dew.aL, ok.s);
      this.l(dew.Y).c(dew.Y).a(dew.as);
      this.l(dew.ai).c(dew.ai).a(dew.aA);
      this.a(dew.ai, dew.dd, dew.do);
      this.a(dew.B, dew.fX, nr.e.b);
      this.b(dew.aI, ok.s);
      this.l(dew.Z).d(dew.Z).a(dew.at);
      this.l(dew.aj).d(dew.aj).a(dew.aB);
      this.a(dew.aj, dew.de, dew.dp);
      this.a(dew.C, dew.fY, nr.e.b);
      this.b(dew.aJ, ok.s);
      this.l(dew.W).c(dew.W).a(dew.aq);
      this.l(dew.ag).c(dew.ag).a(dew.ay);
      this.a(dew.ag, dew.dc, dew.dn);
      this.a(dew.z, dew.fV, nr.e.b);
      this.b(dew.aG, ok.s);
      this.l(dew.U).c(dew.U).a(dew.ao);
      this.l(dew.al).c(dew.al).a(dew.aw);
      this.a(dew.al, dew.da, dew.dl);
      this.a(dew.x, dew.fT, nr.e.b);
      this.b(dew.aE, ok.s);
      this.l(dew.V).c(dew.V).a(dew.ap);
      this.l(dew.af).c(dew.af).a(dew.ax);
      this.a(dew.af, dew.db, dew.dm);
      this.a(dew.y, dew.fU, nr.e.b);
      this.b(dew.aF, ok.s);
      this.l(dew.aa).c(dew.aa).a(dew.au);
      this.l(dew.ak).c(dew.ak).a(dew.aC);
      this.a(dew.ak, dew.dg, dew.dr);
      this.a(dew.D, dew.fZ, nr.e.b);
      this.b(dew.aK, ok.s);
      this.l(dew.X).c(dew.X).a(dew.ar);
      this.l(dew.ah).c(dew.ah).a(dew.az);
      this.a(dew.ah, dew.df, dew.dq);
      this.a(dew.A, dew.fW, nr.e.b);
      this.b(dew.aH, ok.s);
      this.l(dew.os).b(dew.os).a(dew.ou);
      this.l(dew.ot).b(dew.ot).a(dew.ov);
      this.a(dew.ot, dew.dh, dew.dt);
      this.a(dew.ox, dew.pm, nr.e.b);
      this.n(dew.oD, dew.po);
      this.l(dew.oj).b(dew.oj).a(dew.ol);
      this.l(dew.ok).b(dew.ok).a(dew.om);
      this.a(dew.ok, dew.di, dew.du);
      this.a(dew.oo, dew.pn, nr.e.b);
      this.n(dew.oq, dew.pp);
      this.l(dew.ae).d(dew.ae);
      this.l(dew.an).d(dew.an);
      this.a(dew.v, dew.dk, dew.dv);
      this.b(dew.or, nr.e.b);
      this.a(cun.dG);
      this.i(dew.dy);
      this.k(dew.hY);
      this.u();
      this.n(dew.cP);
      this.o(dew.bp);
      this.o(dew.bq);
      this.o(dew.hh);
      this.t();
      this.q(dew.fN);
      this.q(dew.kG);
      this.q(dew.kH);
      this.r(dew.gS);
      this.r(dew.gT);
      this.r(dew.gU);
      this.o();
      this.p();
      this.d(dew.cD, ok.h);
      this.d(dew.nW, ok.h);
      this.d(dew.nV, ok.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dew.eK, dew.eS);
      this.k(dew.m, dew.eO);
      this.k(dew.eJ, dew.eR);
      this.k(dew.eI, dew.eQ);
      this.az();
      this.k(dew.eH, dew.eP);
      this.aA();
      cvr.h().forEach($$0 -> this.a($$0, of.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dew.hX);
      ny.a<Integer> $$0 = ny.a(dsn.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         alb $$3 = oi.a(cun.hC, $$2);
         $$0.a($$1, oa.a().a(ob.c, oh.aa.a(dew.hX, $$2, oi.h($$3), this.c)));
         oh.bx.a(of.a(cun.hC, $$2), oi.k($$3), this.c);
      }

      this.b.accept(nx.a(dew.hX).a($$0));
   }

   private void o(deu $$0, deu $$1) {
      this.a($$0.r());
      oi $$2 = oi.b(oi.G($$0));
      oi $$3 = oi.b(oi.a($$0, "_lit"));
      alb $$4 = oh.bH.a($$0, "_one_candle", $$2, this.c);
      alb $$5 = oh.bI.a($$0, "_two_candles", $$2, this.c);
      alb $$6 = oh.bJ.a($$0, "_three_candles", $$2, this.c);
      alb $$7 = oh.bK.a($$0, "_four_candles", $$2, this.c);
      alb $$8 = oh.bH.a($$0, "_one_candle_lit", $$3, this.c);
      alb $$9 = oh.bI.a($$0, "_two_candles_lit", $$3, this.c);
      alb $$10 = oh.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      alb $$11 = oh.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsn.az, dsn.r)
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
      alb $$12 = oh.bL.a($$1, oi.a($$0, false), this.c);
      alb $$13 = oh.bL.a($$1, "_lit", oi.a($$0, true), this.c);
      this.b.accept(nx.a($$1).a(a(dsn.r, $$13, $$12)));
   }

   class a {
      private final alb b;

      public a(final alb $$0, final deu $$1) {
         this.b = oh.aa.a($$0, oi.u($$1), nr.this.c);
      }

      public nr.a a(deu... $$0) {
         for (deu $$1 : $$0) {
            nr.this.b.accept(nr.c($$1, this.b));
         }

         return this;
      }

      public nr.a b(deu... $$0) {
         for (deu $$1 : $$0) {
            nr.this.c($$1);
         }

         return this.a($$0);
      }

      public nr.a a(og $$0, deu... $$1) {
         for (deu $$2 : $$1) {
            $$0.a(of.a($$2.r()), oi.u($$2), nr.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final oi b;
      private final Map<og, alb> c = Maps.newHashMap();
      @Nullable
      private lt d;
      @Nullable
      private alb e;
      private final Set<deu> f = new HashSet<>();

      public b(final oi $$0) {
         this.b = $$0;
      }

      public nr.b a(deu $$0, og $$1) {
         this.e = $$1.a($$0, this.b, nr.this.c);
         if (nr.this.f.containsKey($$0)) {
            nr.this.b.accept(nr.this.f.get($$0).create($$0, this.e, this.b, nr.this.c));
         } else {
            nr.this.b.accept(nr.c($$0, this.e));
         }

         return this;
      }

      public nr.b a(deu $$0, deu $$1) {
         alb $$2 = of.a($$0);
         nr.this.b.accept(nr.c($$1, $$2));
         nr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nr.b a(deu $$0) {
         alb $$1 = oh.s.a($$0, this.b, nr.this.c);
         alb $$2 = oh.t.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.b($$0, $$1, $$2));
         alb $$3 = oh.u.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b b(deu $$0) {
         alb $$1 = oh.M.a($$0, this.b, nr.this.c);
         alb $$2 = oh.N.a($$0, this.b, nr.this.c);
         alb $$3 = oh.O.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3));
         alb $$4 = oh.P.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$4);
         return this;
      }

      public nr.b c(deu $$0) {
         oi $$1 = oi.p($$0);
         alb $$2 = oh.D.a($$0, $$1, nr.this.c);
         alb $$3 = oh.E.a($$0, $$1, nr.this.c);
         alb $$4 = oh.F.a($$0, $$1, nr.this.c);
         alb $$5 = oh.G.a($$0, $$1, nr.this.c);
         alb $$6 = oh.H.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, $$6));
         alb $$7 = oh.I.a($$0, $$1, nr.this.c);
         nr.this.a($$0, $$7);
         return this;
      }

      public nr.b d(deu $$0) {
         alb $$1 = oh.J.a($$0, this.b, nr.this.c);
         alb $$2 = oh.K.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$1, $$2));
         alb $$3 = oh.L.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b e(deu $$0) {
         oi $$1 = oi.p($$0);
         alb $$2 = oh.R.a($$0, $$1, nr.this.c);
         alb $$3 = oh.Q.a($$0, $$1, nr.this.c);
         alb $$4 = oh.T.a($$0, $$1, nr.this.c);
         alb $$5 = oh.S.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nr.b f(deu $$0) {
         alb $$1 = oh.V.a($$0, this.b, nr.this.c);
         alb $$2 = oh.U.a($$0, this.b, nr.this.c);
         alb $$3 = oh.X.a($$0, this.b, nr.this.c);
         alb $$4 = oh.W.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nr.b g(deu $$0) {
         alb $$1 = oh.Y.a($$0, this.b, nr.this.c);
         alb $$2 = oh.Z.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.e($$0, $$1, $$2));
         return this;
      }

      public nr.b h(deu $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            deu $$1 = this.d.b().get(lt.b.r);
            alb $$2 = oh.aa.a($$0, this.b, nr.this.c);
            nr.this.b.accept(nr.c($$0, $$2));
            nr.this.b.accept(nr.c($$1, $$2));
            nr.this.a($$0.r());
            nr.this.c($$1);
            return this;
         }
      }

      public nr.b i(deu $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alb $$1 = this.a(oh.ab, $$0);
            alb $$2 = this.a(oh.ac, $$0);
            nr.this.b.accept(nr.e($$0, $$1, $$2, this.e));
            nr.this.a($$0, $$1);
            return this;
         }
      }

      public nr.b j(deu $$0) {
         alb $$1 = this.a(oh.af, $$0);
         alb $$2 = this.a(oh.ae, $$0);
         alb $$3 = this.a(oh.ag, $$0);
         nr.this.b.accept(nr.b($$0, $$1, $$2, $$3));
         nr.this.a($$0, $$2);
         return this;
      }

      private nr.b k(deu $$0) {
         ok $$1 = nr.this.g.getOrDefault($$0, ok.a.get($$0));
         alb $$2 = $$1.a($$0, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$2));
         return this;
      }

      private nr.b l(deu $$0) {
         nr.this.i($$0);
         return this;
      }

      private void m(deu $$0) {
         if (nr.this.e.contains($$0)) {
            nr.this.k($$0);
         } else {
            nr.this.j($$0);
         }
      }

      private alb a(og $$0, deu $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nr.this.c));
      }

      public nr.b a(lt $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nr.b, deu> $$2 = nr.h.get($$0x);
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
      nu create(deu var1, alb var2, oi var3, BiConsumer<alb, Supplier<JsonElement>> var4);
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

      public nr.f a(deu $$0) {
         oi $$1 = this.b.c(oj.d, this.b.a(oj.i));
         alb $$2 = oh.j.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$2));
         return this;
      }

      public nr.f b(deu $$0) {
         alb $$1 = oh.j.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1));
         return this;
      }

      public nr.f c(deu $$0) {
         alb $$1 = oh.j.a($$0, this.b, nr.this.c);
         alb $$2 = oh.k.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1, $$2));
         return this;
      }

      public nr.f d(deu $$0) {
         nr.this.b.accept(nr.a($$0, this.b, nr.this.c));
         return this;
      }
   }
}
