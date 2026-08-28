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
   private final Consumer<cuj> d;
   final List<dey> e = ImmutableList.of(dfa.ey, dfa.eE, dfa.hY);
   final Map<dey, nr.c> f = ImmutableMap.builder().put(dfa.b, nr::a).put(dfa.sJ, nr::c).put(dfa.eM, nr::b).build();
   final Map<dey, ok> g = ImmutableMap.builder()
      .put(dfa.aV, ok.y.get(dfa.aV))
      .put(dfa.jp, ok.y.get(dfa.jp))
      .put(dfa.jS, ok.a(oi.a(dfa.aV, "_top")))
      .put(dfa.jU, ok.a(oi.a(dfa.jp, "_top")))
      .put(dfa.aX, ok.d.get(dfa.aV).a($$0x -> $$0x.a(oj.i, oi.G(dfa.aX))))
      .put(dfa.jr, ok.d.get(dfa.jp).a($$0x -> $$0x.a(oj.i, oi.G(dfa.jr))))
      .put(dfa.hd, ok.d.get(dfa.hd))
      .put(dfa.jT, ok.a(oi.a(dfa.hd, "_bottom")))
      .put(dfa.pr, ok.z.get(dfa.pr))
      .put(dfa.sJ, ok.z.get(dfa.sJ))
      .put(dfa.he, ok.d.get(dfa.he).a($$0x -> $$0x.a(oj.i, oi.G(dfa.he))))
      .put(dfa.aW, ok.d.get(dfa.aW).a($$0x -> {
         $$0x.a(oj.d, oi.a(dfa.aV, "_top"));
         $$0x.a(oj.i, oi.G(dfa.aW));
      }))
      .put(dfa.jq, ok.d.get(dfa.jq).a($$0x -> {
         $$0x.a(oj.d, oi.a(dfa.jp, "_top"));
         $$0x.a(oj.i, oi.G(dfa.jq));
      }))
      .put(dfa.qM, ok.z.get(dfa.qM))
      .put(dfa.qH, ok.z.get(dfa.qH))
      .build();
   static final Map<lt.b, BiConsumer<nr.b, dey>> h = ImmutableMap.builder()
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
   public static final List<Pair<dss, Function<ale, oa>>> a = List.of(
      Pair.of(dsr.L, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0)),
      Pair.of(dsr.M, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true)),
      Pair.of(dsr.N, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true)),
      Pair.of(dsr.O, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true)),
      Pair.of(dsr.J, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true)),
      Pair.of(dsr.K, (Function<ale, oa>)$$0 -> oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
   );
   private static final Map<nr.d, ale> i = new HashMap<>();

   private static nu a(dey $$0, ale $$1, oi $$2, BiConsumer<ale, Supplier<JsonElement>> $$3) {
      ale $$4 = oh.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nu b(dey $$0, ale $$1, oi $$2, BiConsumer<ale, Supplier<JsonElement>> $$3) {
      ale $$4 = oh.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nu c(dey $$0, ale $$1, oi $$2, BiConsumer<ale, Supplier<JsonElement>> $$3) {
      ale $$4 = oh.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nr(Consumer<nu> $$0, BiConsumer<ale, Supplier<JsonElement>> $$1, Consumer<cuj> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dey $$0) {
      this.d.accept($$0.r());
   }

   void a(dey $$0, ale $$1) {
      this.c.accept(of.a($$0.r()), new oe($$1));
   }

   private void a(cuj $$0, ale $$1) {
      this.c.accept(of.a($$0), new oe($$1));
   }

   void a(cuj $$0) {
      oh.bx.a(of.a($$0), oi.b($$0), this.c);
   }

   private void d(dey $$0) {
      cuj $$1 = $$0.r();
      if ($$1 != cur.a) {
         oh.bx.a(of.a($$1), oi.F($$0), this.c);
      }
   }

   private void a(dey $$0, String $$1) {
      cuj $$2 = $$0.r();
      oh.bx.a(of.a($$2), oi.k(oi.a($$0, $$1)), this.c);
   }

   private static ny b() {
      return ny.a(dsr.R).a(je.f, oa.a().a(ob.b, ob.a.b)).a(je.d, oa.a().a(ob.b, ob.a.c)).a(je.e, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a());
   }

   private static ny c() {
      return ny.a(dsr.R).a(je.d, oa.a()).a(je.e, oa.a().a(ob.b, ob.a.b)).a(je.c, oa.a().a(ob.b, ob.a.c)).a(je.f, oa.a().a(ob.b, ob.a.d));
   }

   private static ny d() {
      return ny.a(dsr.R).a(je.f, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.b)).a(je.e, oa.a().a(ob.b, ob.a.c)).a(je.c, oa.a().a(ob.b, ob.a.d));
   }

   private static ny e() {
      return ny.a(dsr.P)
         .a(je.a, oa.a().a(ob.a, ob.a.b))
         .a(je.b, oa.a().a(ob.a, ob.a.d))
         .a(je.c, oa.a())
         .a(je.d, oa.a().a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.b, ob.a.b));
   }

   private static nx b(dey $$0, ale $$1) {
      return nx.a($$0, a($$1));
   }

   private static oa[] a(ale $$0) {
      return new oa[]{oa.a().a(ob.c, $$0), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d)};
   }

   private static nx a(dey $$0, ale $$1, ale $$2) {
      return nx.a($$0, oa.a().a(ob.c, $$1), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c));
   }

   private static ny a(dss $$0, ale $$1, ale $$2) {
      return ny.a($$0).a(true, oa.a().a(ob.c, $$1)).a(false, oa.a().a(ob.c, $$2));
   }

   private void e(dey $$0) {
      ale $$1 = ok.a.create($$0, this.c);
      ale $$2 = ok.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dey $$0) {
      ale $$1 = ok.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dey $$0) {
      this.b.accept(nx.a($$0).a(ny.a(dsr.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ale $$3 = oi.a($$0, $$2);
         return oa.a().a(ob.c, oh.c.a($$0, $$2, new oi().a(oj.a, $$3), this.c));
      })));
      this.a($$0, oi.a($$0, "_0"));
   }

   static nu b(dey $$0, ale $$1, ale $$2) {
      return nx.a($$0)
         .a(ny.a(dsr.w).a(false, oa.a().a(ob.c, $$1)).a(true, oa.a().a(ob.c, $$2)))
         .a(
            ny.a(dsr.U, dsr.R)
               .a(dsm.a, je.f, oa.a().a(ob.b, ob.a.b))
               .a(dsm.a, je.e, oa.a().a(ob.b, ob.a.d))
               .a(dsm.a, je.d, oa.a().a(ob.b, ob.a.c))
               .a(dsm.a, je.c, oa.a())
               .a(dsm.b, je.f, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsm.b, je.e, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsm.b, je.d, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsm.b, je.c, oa.a().a(ob.a, ob.a.b).a(ob.d, true))
               .a(dsm.c, je.f, oa.a().a(ob.b, ob.a.d).a(ob.a, ob.a.c))
               .a(dsm.c, je.e, oa.a().a(ob.b, ob.a.b).a(ob.a, ob.a.c))
               .a(dsm.c, je.d, oa.a().a(ob.a, ob.a.c))
               .a(dsm.c, je.c, oa.a().a(ob.b, ob.a.c).a(ob.a, ob.a.c))
         );
   }

   private static ny.d<je, dsx, dsw, Boolean> a(ny.d<je, dsx, dsw, Boolean> $$0, dsx $$1, ale $$2, ale $$3, ale $$4, ale $$5) {
      return $$0.a(je.f, $$1, dsw.a, false, oa.a().a(ob.c, $$2))
         .a(je.d, $$1, dsw.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsw.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsw.a, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsw.b, false, oa.a().a(ob.c, $$4))
         .a(je.d, $$1, dsw.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
         .a(je.e, $$1, dsw.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
         .a(je.c, $$1, dsw.b, false, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         .a(je.f, $$1, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
         .a(je.d, $$1, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
         .a(je.e, $$1, dsw.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         .a(je.c, $$1, dsw.a, true, oa.a().a(ob.c, $$3))
         .a(je.f, $$1, dsw.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.d))
         .a(je.d, $$1, dsw.b, true, oa.a().a(ob.c, $$5))
         .a(je.e, $$1, dsw.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         .a(je.c, $$1, dsw.b, true, oa.a().a(ob.c, $$5).a(ob.b, ob.a.c));
   }

   private static nu a(dey $$0, ale $$1, ale $$2, ale $$3, ale $$4, ale $$5, ale $$6, ale $$7, ale $$8) {
      return nx.a($$0).a(a(a(ny.a(dsr.R, dsr.ae, dsr.be, dsr.u), dsx.b, $$1, $$2, $$3, $$4), dsx.a, $$5, $$6, $$7, $$8));
   }

   static nu a(dey $$0, ale $$1, ale $$2, ale $$3, ale $$4, ale $$5) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsr.L, true), oa.a().a(ob.c, $$2).a(ob.d, false))
         .a(nv.a().a(dsr.M, true), oa.a().a(ob.c, $$3).a(ob.d, false))
         .a(nv.a().a(dsr.N, true), oa.a().a(ob.c, $$4).a(ob.d, false))
         .a(nv.a().a(dsr.O, true), oa.a().a(ob.c, $$5).a(ob.d, false));
   }

   static nu c(dey $$0, ale $$1, ale $$2) {
      return nw.a($$0)
         .a(oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsr.L, true), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dsr.M, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsr.N, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsr.O, true), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dey $$0, ale $$1, ale $$2, ale $$3) {
      return nw.a($$0)
         .a(nv.a().a(dsr.J, true), oa.a().a(ob.c, $$1))
         .a(nv.a().a(dsr.X, dtn.b), oa.a().a(ob.c, $$2).a(ob.d, true))
         .a(nv.a().a(dsr.W, dtn.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsr.Y, dtn.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsr.Z, dtn.b), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
         .a(nv.a().a(dsr.X, dtn.c), oa.a().a(ob.c, $$3).a(ob.d, true))
         .a(nv.a().a(dsr.W, dtn.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
         .a(nv.a().a(dsr.Y, dtn.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
         .a(nv.a().a(dsr.Z, dtn.c), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true));
   }

   static nu a(dey $$0, ale $$1, ale $$2, ale $$3, ale $$4, boolean $$5) {
      return nx.a($$0, oa.a().a(ob.d, $$5))
         .a(c())
         .a(
            ny.a(dsr.q, dsr.u)
               .a(false, false, oa.a().a(ob.c, $$2))
               .a(true, false, oa.a().a(ob.c, $$4))
               .a(false, true, oa.a().a(ob.c, $$1))
               .a(true, true, oa.a().a(ob.c, $$3))
         );
   }

   static nu b(dey $$0, ale $$1, ale $$2, ale $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsr.R, dsr.af, dsr.bi)
               .a(je.f, dta.b, dtk.a, oa.a().a(ob.c, $$2))
               .a(je.e, dta.b, dtk.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dta.b, dtk.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dta.b, dtk.a, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dta.b, dtk.e, oa.a().a(ob.c, $$3))
               .a(je.e, dta.b, dtk.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dta.b, dtk.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dta.b, dtk.e, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dta.b, dtk.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dta.b, dtk.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dta.b, dtk.d, oa.a().a(ob.c, $$3))
               .a(je.c, dta.b, dtk.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dta.b, dtk.c, oa.a().a(ob.c, $$1))
               .a(je.e, dta.b, dtk.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dta.b, dtk.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dta.b, dtk.c, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dta.b, dtk.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.e, dta.b, dtk.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.d, dta.b, dtk.b, oa.a().a(ob.c, $$1))
               .a(je.c, dta.b, dtk.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.f, dta.a, dtk.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dta.a, dtk.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dta.a, dtk.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dta.a, dtk.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dta.a, dtk.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dta.a, dtk.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dta.a, dtk.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dta.a, dtk.e, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dta.a, dtk.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dta.a, dtk.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dta.a, dtk.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dta.a, dtk.d, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.f, dta.a, dtk.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.e, dta.a, dtk.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
               .a(je.d, dta.a, dtk.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.c, dta.a, dtk.c, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.f, dta.a, dtk.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.d, true))
               .a(je.e, dta.a, dtk.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.c).a(ob.d, true))
               .a(je.d, dta.a, dtk.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.b).a(ob.d, true))
               .a(je.c, dta.a, dtk.b, oa.a().a(ob.c, $$1).a(ob.a, ob.a.c).a(ob.b, ob.a.d).a(ob.d, true))
         );
   }

   private static nu c(dey $$0, ale $$1, ale $$2, ale $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsr.R, dsr.af, dsr.u)
               .a(je.c, dta.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dta.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(je.f, dta.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(je.e, dta.b, false, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(je.c, dta.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dta.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(je.f, dta.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(je.e, dta.a, false, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(je.c, dta.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dta.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dta.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dta.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dta.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.c))
               .a(je.d, dta.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.a))
               .a(je.f, dta.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               .a(je.e, dta.a, true, oa.a().a(ob.c, $$3).a(ob.a, ob.a.c).a(ob.b, ob.a.b))
         );
   }

   private static nu d(dey $$0, ale $$1, ale $$2, ale $$3) {
      return nx.a($$0)
         .a(
            ny.a(dsr.R, dsr.af, dsr.u)
               .a(je.c, dta.b, false, oa.a().a(ob.c, $$2))
               .a(je.d, dta.b, false, oa.a().a(ob.c, $$2))
               .a(je.f, dta.b, false, oa.a().a(ob.c, $$2))
               .a(je.e, dta.b, false, oa.a().a(ob.c, $$2))
               .a(je.c, dta.a, false, oa.a().a(ob.c, $$1))
               .a(je.d, dta.a, false, oa.a().a(ob.c, $$1))
               .a(je.f, dta.a, false, oa.a().a(ob.c, $$1))
               .a(je.e, dta.a, false, oa.a().a(ob.c, $$1))
               .a(je.c, dta.b, true, oa.a().a(ob.c, $$3))
               .a(je.d, dta.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dta.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dta.b, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(je.c, dta.a, true, oa.a().a(ob.c, $$3))
               .a(je.d, dta.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(je.f, dta.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(je.e, dta.a, true, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
         );
   }

   static nx c(dey $$0, ale $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1));
   }

   private static ny f() {
      return ny.a(dsr.I).a(je.a.b, oa.a()).a(je.a.c, oa.a().a(ob.a, ob.a.b)).a(je.a.a, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   static nu a(dey $$0, oi $$1, BiConsumer<ale, Supplier<JsonElement>> $$2) {
      ale $$3 = oh.g.a($$0, $$1, $$2);
      ale $$4 = oh.h.a($$0, $$1, $$2);
      ale $$5 = oh.i.a($$0, $$1, $$2);
      ale $$6 = oh.j.a($$0, $$1, $$2);
      return nx.a($$0, oa.a().a(ob.c, $$6)).a(ny.a(dsr.I).a(je.a.a, oa.a().a(ob.c, $$3)).a(je.a.b, oa.a().a(ob.c, $$4)).a(je.a.c, oa.a().a(ob.c, $$5)));
   }

   static nu d(dey $$0, ale $$1) {
      return nx.a($$0, oa.a().a(ob.c, $$1)).a(f());
   }

   private void e(dey $$0, ale $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dey $$0, ok.a $$1) {
      ale $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dey $$0, ok.a $$1) {
      ale $$2 = $$1.create($$0, this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   static nu d(dey $$0, ale $$1, ale $$2) {
      return nx.a($$0)
         .a(
            ny.a(dsr.I)
               .a(je.a.b, oa.a().a(ob.c, $$1))
               .a(je.a.c, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b))
               .a(je.a.a, oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.b, ob.a.b))
         );
   }

   private void a(dey $$0, ok.a $$1, ok.a $$2) {
      ale $$3 = $$1.create($$0, this.c);
      ale $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ale a(dey $$0, String $$1, og $$2, Function<ale, oi> $$3) {
      return $$2.a($$0, $$1, $$3.apply(oi.a($$0, $$1)), this.c);
   }

   static nu e(dey $$0, ale $$1, ale $$2) {
      return nx.a($$0).a(a(dsr.w, $$2, $$1));
   }

   static nu e(dey $$0, ale $$1, ale $$2, ale $$3) {
      return nx.a($$0).a(ny.a(dsr.bh).a(dtj.b, oa.a().a(ob.c, $$1)).a(dtj.a, oa.a().a(ob.c, $$2)).a(dtj.c, oa.a().a(ob.c, $$3)));
   }

   public void a(dey $$0) {
      this.b($$0, ok.a);
   }

   public void b(dey $$0, ok.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dey $$0, oi $$1, og $$2) {
      ale $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nr.b h(dey $$0) {
      ok $$1 = this.g.getOrDefault($$0, ok.a.get($$0));
      return new nr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dey $$0, dey $$1, dey $$2) {
      oi $$3 = oi.u($$0);
      ale $$4 = oh.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dey $$0) {
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

   private void a(dey $$0, dey $$1) {
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

   void j(dey $$0) {
      oi $$1 = oi.b($$0);
      ale $$2 = oh.ak.a($$0, $$1, this.c);
      ale $$3 = oh.al.a($$0, $$1, this.c);
      ale $$4 = oh.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dey $$0) {
      oi $$1 = oi.b($$0);
      ale $$2 = oh.ah.a($$0, $$1, this.c);
      ale $$3 = oh.ai.a($$0, $$1, this.c);
      ale $$4 = oh.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dey $$0, dey $$1) {
      ale $$2 = oh.ah.a($$0);
      ale $$3 = oh.ai.a($$0);
      ale $$4 = oh.aj.a($$0);
      this.a($$1, of.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dfa.sD);
      ale $$0 = of.a(dfa.sD);
      ale $$1 = of.a(dfa.sD, "_partial_tilt");
      ale $$2 = of.a(dfa.sD, "_full_tilt");
      this.b
         .accept(
            nx.a(dfa.sD)
               .a(b())
               .a(ny.a(dsr.bl).a(dtm.a, oa.a().a(ob.c, $$0)).a(dtm.b, oa.a().a(ob.c, $$0)).a(dtm.c, oa.a().a(ob.c, $$1)).a(dtm.d, oa.a().a(ob.c, $$2)))
         );
   }

   private nr.f l(dey $$0) {
      return new nr.f(oi.n($$0));
   }

   private void m(dey $$0) {
      this.c($$0, $$0);
   }

   private void c(dey $$0, dey $$1) {
      this.b.accept(c($$0, of.a($$1)));
   }

   private void a(dey $$0, nr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dey $$0, nr.e $$1, oi $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dey $$0, nr.e $$1) {
      oi $$2 = oi.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dey $$0, nr.e $$1, oi $$2) {
      ale $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dey $$0, nr.e $$1, dte<Integer> $$2, int... $$3) {
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

   private void a(dey $$0, dey $$1, nr.e $$2) {
      this.a($$0, $$2);
      oi $$3 = oi.d($$0);
      ale $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dey $$0, dey $$1) {
      ok $$2 = ok.p.get($$0);
      ale $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ale $$4 = oh.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dey $$0, dey $$1) {
      this.a($$0.r());
      oi $$2 = oi.h($$0);
      oi $$3 = oi.a($$0, $$1);
      ale $$4 = oh.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nx.a($$1, oa.a().a(ob.c, $$4))
               .a(ny.a(dsr.R).a(je.e, oa.a()).a(je.d, oa.a().a(ob.b, ob.a.d)).a(je.c, oa.a().a(ob.b, ob.a.b)).a(je.f, oa.a().a(ob.b, ob.a.c)))
         );
      this.b.accept(nx.a($$0).a(ny.a(dsr.av).a($$2x -> oa.a().a(ob.c, oh.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dey $$0 = dfa.kC;
      this.a($$0.r());
      ale $$1 = of.a($$0, "_top");
      ale $$2 = of.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dey $$0 = dfa.kB;
      this.a($$0.r());
      ny $$1 = ny.a(dkn.d, dsr.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> oa.a().a(ob.c, of.a($$0, "_top_stage_" + $$1x));
            case b -> oa.a().a(ob.c, of.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nx.a($$0).a($$1));
   }

   private void a(dey $$0, dey $$1, dey $$2, dey $$3, dey $$4, dey $$5, dey $$6, dey $$7) {
      this.a($$0, nr.e.b);
      this.a($$1, nr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dey $$0, nr.e $$1) {
      this.a($$0, "_top");
      ale $$2 = this.a($$0, "_top", $$1.a(), oi::c);
      ale $$3 = this.a($$0, "_bottom", $$1.a(), oi::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dfa.iD, "_front");
      ale $$0 = of.a(dfa.iD, "_top");
      ale $$1 = this.a(dfa.iD, "_bottom", nr.e.b.a(), oi::c);
      this.f(dfa.iD, $$0, $$1);
   }

   private void k() {
      ale $$0 = this.a(dfa.bx, "_top", oh.bk, oi::a);
      ale $$1 = this.a(dfa.bx, "_bottom", oh.bk, oi::a);
      this.f(dfa.bx, $$0, $$1);
   }

   private void l() {
      this.c(dfa.sF);
      ale $$0 = of.a(dfa.sF, "_top");
      ale $$1 = of.a(dfa.sF, "_bottom");
      this.b.accept(nx.a(dfa.sF).a(b()).a(ny.a(dsr.ae).a(dsx.b, oa.a().a(ob.c, $$1)).a(dsx.a, oa.a().a(ob.c, $$0))));
   }

   private void f(dey $$0, ale $$1, ale $$2) {
      this.b.accept(nx.a($$0).a(ny.a(dsr.ae).a(dsx.b, oa.a().a(ob.c, $$2)).a(dsx.a, oa.a().a(ob.c, $$1))));
   }

   private void n(dey $$0) {
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
                  ny.a(dsr.ag)
                     .a(dtf.a, oa.a().a(ob.c, $$3))
                     .a(dtf.b, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(dtf.c, oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
                     .a(dtf.d, oa.a().a(ob.c, $$6).a(ob.b, ob.a.b))
                     .a(dtf.e, oa.a().a(ob.c, $$5))
                     .a(dtf.f, oa.a().a(ob.c, $$6))
                     .a(dtf.g, oa.a().a(ob.c, $$4))
                     .a(dtf.h, oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
                     .a(dtf.i, oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
                     .a(dtf.j, oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
               )
         );
   }

   private void o(dey $$0) {
      ale $$1 = this.a($$0, "", oh.as, oi::e);
      ale $$2 = this.a($$0, "", oh.au, oi::e);
      ale $$3 = this.a($$0, "", oh.av, oi::e);
      ale $$4 = this.a($$0, "_on", oh.as, oi::e);
      ale $$5 = this.a($$0, "_on", oh.au, oi::e);
      ale $$6 = this.a($$0, "_on", oh.av, oi::e);
      ny $$7 = ny.a(dsr.w, dsr.ah).a(($$6x, $$7x) -> {
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

   private nr.a a(ale $$0, dey $$1) {
      return new nr.a($$0, $$1);
   }

   private nr.a f(dey $$0, dey $$1) {
      return new nr.a(of.a($$0), $$1);
   }

   private void a(dey $$0, cuj $$1) {
      ale $$2 = oh.aa.a($$0, oi.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dey $$0, ale $$1) {
      ale $$2 = oh.aa.a($$0, oi.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dey $$0, dey $$1) {
      this.a($$0);
      ale $$2 = ok.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dey $$0) {
      this.a($$0.r());
      ale $$1 = ok.k.create($$0, this.c);
      ale $$2 = ok.l.create($$0, this.c);
      ale $$3 = ok.m.create($$0, this.c);
      ale $$4 = ok.n.create($$0, this.c);
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dsr.S, 1, 2, 3, 4).a(dsr.R, je.c), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsr.S, 1, 2, 3, 4).a(dsr.R, je.f), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.S, 1, 2, 3, 4).a(dsr.R, je.d), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
               .a(nv.a().a(dsr.S, 1, 2, 3, 4).a(dsr.R, je.e), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               .a(nv.a().a(dsr.S, 2, 3, 4).a(dsr.R, je.c), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsr.S, 2, 3, 4).a(dsr.R, je.f), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.S, 2, 3, 4).a(dsr.R, je.d), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
               .a(nv.a().a(dsr.S, 2, 3, 4).a(dsr.R, je.e), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
               .a(nv.a().a(dsr.S, 3, 4).a(dsr.R, je.c), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsr.S, 3, 4).a(dsr.R, je.f), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.S, 3, 4).a(dsr.R, je.d), oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               .a(nv.a().a(dsr.S, 3, 4).a(dsr.R, je.e), oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
               .a(nv.a().a(dsr.S, 4).a(dsr.R, je.c), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsr.S, 4).a(dsr.R, je.f), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.S, 4).a(dsr.R, je.d), oa.a().a(ob.c, $$4).a(ob.b, ob.a.c))
               .a(nv.a().a(dsr.S, 4).a(dsr.R, je.e), oa.a().a(ob.c, $$4).a(ob.b, ob.a.d))
         );
   }

   private void a(ok.a $$0, dey... $$1) {
      for (dey $$2 : $$1) {
         ale $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(ok.a $$0, dey... $$1) {
      for (dey $$2 : $$1) {
         ale $$3 = $$0.create($$2, this.c);
         this.b.accept(nx.a($$2, oa.a().a(ob.c, $$3)).a(c()));
      }
   }

   private void h(dey $$0, dey $$1) {
      this.a($$0);
      oi $$2 = oi.b($$0, $$1);
      ale $$3 = oh.aI.a($$1, $$2, this.c);
      ale $$4 = oh.aJ.a($$1, $$2, this.c);
      ale $$5 = oh.aK.a($$1, $$2, this.c);
      ale $$6 = oh.aG.a($$1, $$2, this.c);
      ale $$7 = oh.aH.a($$1, $$2, this.c);
      cuj $$8 = $$1.r();
      oh.bx.a(of.a($$8), oi.F($$0), this.c);
      this.b
         .accept(
            nw.a($$1)
               .a(oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsr.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsr.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dsr.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.L, false), oa.a().a(ob.c, $$6))
               .a(nv.a().a(dsr.M, false), oa.a().a(ob.c, $$7))
               .a(nv.a().a(dsr.N, false), oa.a().a(ob.c, $$7).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.O, false), oa.a().a(ob.c, $$6).a(ob.b, ob.a.d))
         );
   }

   private void q(dey $$0) {
      oi $$1 = oi.z($$0);
      ale $$2 = oh.aL.a($$0, $$1, this.c);
      ale $$3 = this.a($$0, "_conditional", oh.aL, $$1x -> $$1.c(oj.i, $$1x));
      this.b.accept(nx.a($$0).a(a(dsr.c, $$3, $$2)).a(e()));
   }

   private void r(dey $$0) {
      ale $$1 = ok.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<oa> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> oa.a().a(ob.c, of.a(dfa.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dfa.mZ);
      this.b
         .accept(
            nw.a(dfa.mZ)
               .a(nv.a().a(dsr.aq, 0), this.a(0))
               .a(nv.a().a(dsr.aq, 1), this.a(1))
               .a(nv.a().a(dsr.bk, dsn.b), oa.a().a(ob.c, of.a(dfa.mZ, "_small_leaves")))
               .a(nv.a().a(dsr.bk, dsn.c), oa.a().a(ob.c, of.a(dfa.mZ, "_large_leaves")))
         );
   }

   private ny n() {
      return ny.a(dsr.P)
         .a(je.a, oa.a().a(ob.a, ob.a.c))
         .a(je.b, oa.a())
         .a(je.c, oa.a().a(ob.a, ob.a.b))
         .a(je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
         .a(je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
         .a(je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b));
   }

   private void o() {
      ale $$0 = oi.a(dfa.nU, "_top_open");
      this.b
         .accept(
            nx.a(dfa.nU)
               .a(this.n())
               .a(
                  ny.a(dsr.u)
                     .a(false, oa.a().a(ob.c, ok.f.create(dfa.nU, this.c)))
                     .a(true, oa.a().a(ob.c, ok.f.get(dfa.nU).a($$1 -> $$1.a(oj.f, $$0)).a(dfa.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> ny a(dte<T> $$0, T $$1, ale $$2, ale $$3) {
      oa $$4 = oa.a().a(ob.c, $$2);
      oa $$5 = oa.a().a(ob.c, $$3);
      return ny.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dey $$0, Function<dey, oi> $$1) {
      oi $$2 = $$1.apply($$0).b(oj.i, oj.c);
      oi $$3 = $$2.c(oj.g, oi.a($$0, "_front_honey"));
      ale $$4 = oh.q.a($$0, $$2, this.c);
      ale $$5 = oh.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nx.a($$0).a(b()).a(a(dsr.aN, 5, $$5, $$4)));
   }

   private void a(dey $$0, dte<Integer> $$1, int... $$2) {
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
      ale $$0 = of.a(dfa.od, "_floor");
      ale $$1 = of.a(dfa.od, "_ceiling");
      ale $$2 = of.a(dfa.od, "_wall");
      ale $$3 = of.a(dfa.od, "_between_walls");
      this.a(cur.wo);
      this.b
         .accept(
            nx.a(dfa.od)
               .a(
                  ny.a(dsr.R, dsr.V)
                     .a(je.c, dsp.a, oa.a().a(ob.c, $$0))
                     .a(je.d, dsp.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.c))
                     .a(je.f, dsp.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.b))
                     .a(je.e, dsp.a, oa.a().a(ob.c, $$0).a(ob.b, ob.a.d))
                     .a(je.c, dsp.b, oa.a().a(ob.c, $$1))
                     .a(je.d, dsp.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.f, dsp.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.e, dsp.b, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
                     .a(je.c, dsp.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.d))
                     .a(je.d, dsp.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
                     .a(je.f, dsp.c, oa.a().a(ob.c, $$2))
                     .a(je.e, dsp.c, oa.a().a(ob.c, $$2).a(ob.b, ob.a.c))
                     .a(je.d, dsp.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
                     .a(je.c, dsp.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.d))
                     .a(je.f, dsp.d, oa.a().a(ob.c, $$3))
                     .a(je.e, dsp.d, oa.a().a(ob.c, $$3).a(ob.b, ob.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nx.a(dfa.nZ, oa.a().a(ob.c, of.a(dfa.nZ)))
               .a(
                  ny.a(dsr.U, dsr.R)
                     .a(dsm.a, je.c, oa.a())
                     .a(dsm.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsm.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsm.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsm.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsm.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsm.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsm.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
                     .a(dsm.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsm.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsm.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsm.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
               )
         );
   }

   private void d(dey $$0, ok.a $$1) {
      ale $$2 = $$1.create($$0, this.c);
      ale $$3 = oi.a($$0, "_front_on");
      ale $$4 = $$1.get($$0).a($$1x -> $$1x.a(oj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nx.a($$0).a(a(dsr.r, $$4, $$2)).a(b()));
   }

   private void a(dey... $$0) {
      ale $$1 = of.a("campfire_off");

      for (dey $$2 : $$0) {
         ale $$3 = oh.bc.a($$2, oi.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nx.a($$2).a(a(dsr.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dey $$0) {
      ale $$1 = oh.bt.a($$0, oi.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dey $$0) {
      ale $$1;
      if ($$0 == dfa.tj) {
         $$1 = oh.bv.a($$0, oi.m($$0), this.c);
      } else {
         $$1 = oh.bu.a($$0, oi.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      oi $$0 = oi.a(oi.G(dfa.cl), oi.G(dfa.n));
      ale $$1 = oh.j.a(dfa.cl, $$0, this.c);
      this.b.accept(c(dfa.cl, $$1));
   }

   private void s() {
      this.a(cur.lH);
      this.b
         .accept(
            nw.a(dfa.cw)
               .a(
                  nv.b(
                     nv.a().a(dsr.ab, dtg.c).a(dsr.aa, dtg.c).a(dsr.ac, dtg.c).a(dsr.ad, dtg.c),
                     nv.a().a(dsr.ab, dtg.b, dtg.a).a(dsr.aa, dtg.b, dtg.a),
                     nv.a().a(dsr.aa, dtg.b, dtg.a).a(dsr.ac, dtg.b, dtg.a),
                     nv.a().a(dsr.ac, dtg.b, dtg.a).a(dsr.ad, dtg.b, dtg.a),
                     nv.a().a(dsr.ad, dtg.b, dtg.a).a(dsr.ab, dtg.b, dtg.a)
                  ),
                  oa.a().a(ob.c, of.a("redstone_dust_dot"))
               )
               .a(nv.a().a(dsr.ab, dtg.b, dtg.a), oa.a().a(ob.c, of.a("redstone_dust_side0")))
               .a(nv.a().a(dsr.ac, dtg.b, dtg.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt0")))
               .a(nv.a().a(dsr.aa, dtg.b, dtg.a), oa.a().a(ob.c, of.a("redstone_dust_side_alt1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dsr.ad, dtg.b, dtg.a), oa.a().a(ob.c, of.a("redstone_dust_side1")).a(ob.b, ob.a.d))
               .a(nv.a().a(dsr.ab, dtg.a), oa.a().a(ob.c, of.a("redstone_dust_up")))
               .a(nv.a().a(dsr.aa, dtg.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.ac, dtg.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.c))
               .a(nv.a().a(dsr.ad, dtg.a), oa.a().a(ob.c, of.a("redstone_dust_up")).a(ob.b, ob.a.d))
         );
   }

   private void t() {
      this.a(cur.lL);
      this.b
         .accept(
            nx.a(dfa.gY)
               .a(c())
               .a(
                  ny.a(dsr.bd, dsr.w)
                     .a(dsu.a, false, oa.a().a(ob.c, of.a(dfa.gY)))
                     .a(dsu.a, true, oa.a().a(ob.c, of.a(dfa.gY, "_on")))
                     .a(dsu.b, false, oa.a().a(ob.c, of.a(dfa.gY, "_subtract")))
                     .a(dsu.b, true, oa.a().a(ob.c, of.a(dfa.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      oi $$0 = oi.a(dfa.jR);
      oi $$1 = oi.a(oi.a(dfa.jE, "_side"), $$0.a(oj.f));
      ale $$2 = oh.ab.a(dfa.jE, $$1, this.c);
      ale $$3 = oh.ac.a(dfa.jE, $$1, this.c);
      ale $$4 = oh.j.b(dfa.jE, "_double", $$1, this.c);
      this.b.accept(e(dfa.jE, $$2, $$3, $$4));
      this.b.accept(c(dfa.jR, oh.c.a(dfa.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cur.sq);
      this.b
         .accept(
            nw.a(dfa.fs)
               .a(oa.a().a(ob.c, oi.G(dfa.fs)))
               .a(nv.a().a(dsr.k, true), oa.a().a(ob.c, oi.a(dfa.fs, "_bottle0")))
               .a(nv.a().a(dsr.l, true), oa.a().a(ob.c, oi.a(dfa.fs, "_bottle1")))
               .a(nv.a().a(dsr.m, true), oa.a().a(ob.c, oi.a(dfa.fs, "_bottle2")))
               .a(nv.a().a(dsr.k, false), oa.a().a(ob.c, oi.a(dfa.fs, "_empty0")))
               .a(nv.a().a(dsr.l, false), oa.a().a(ob.c, oi.a(dfa.fs, "_empty1")))
               .a(nv.a().a(dsr.m, false), oa.a().a(ob.c, oi.a(dfa.fs, "_empty2")))
         );
   }

   private void u(dey $$0) {
      ale $$1 = oh.bp.a($$0, oi.b($$0), this.c);
      ale $$2 = of.a("mushroom_block_inside");
      this.b
         .accept(
            nw.a($$0)
               .a(nv.a().a(dsr.L, true), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsr.M, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsr.N, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dsr.O, true), oa.a().a(ob.c, $$1).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsr.J, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsr.K, true), oa.a().a(ob.c, $$1).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsr.L, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsr.M, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, false))
               .a(nv.a().a(dsr.N, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, false))
               .a(nv.a().a(dsr.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dsr.J, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, false))
               .a(nv.a().a(dsr.K, false), oa.a().a(ob.c, $$2).a(ob.a, ob.a.b).a(ob.d, false))
         );
      this.a($$0, ok.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cur.rB);
      this.b
         .accept(
            nx.a(dfa.eg)
               .a(
                  ny.a(dsr.ay)
                     .a(0, oa.a().a(ob.c, of.a(dfa.eg)))
                     .a(1, oa.a().a(ob.c, of.a(dfa.eg, "_slice1")))
                     .a(2, oa.a().a(ob.c, of.a(dfa.eg, "_slice2")))
                     .a(3, oa.a().a(ob.c, of.a(dfa.eg, "_slice3")))
                     .a(4, oa.a().a(ob.c, of.a(dfa.eg, "_slice4")))
                     .a(5, oa.a().a(ob.c, of.a(dfa.eg, "_slice5")))
                     .a(6, oa.a().a(ob.c, of.a(dfa.eg, "_slice6")))
               )
         );
   }

   private void x() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dfa.nX, "_side3"))
         .a(oj.o, oi.G(dfa.t))
         .a(oj.n, oi.a(dfa.nX, "_top"))
         .a(oj.j, oi.a(dfa.nX, "_side3"))
         .a(oj.l, oi.a(dfa.nX, "_side3"))
         .a(oj.k, oi.a(dfa.nX, "_side1"))
         .a(oj.m, oi.a(dfa.nX, "_side2"));
      this.b.accept(c(dfa.nX, oh.a.a(dfa.nX, $$0, this.c)));
   }

   private void y() {
      oi $$0 = new oi()
         .a(oj.c, oi.a(dfa.ob, "_front"))
         .a(oj.o, oi.a(dfa.ob, "_bottom"))
         .a(oj.n, oi.a(dfa.ob, "_top"))
         .a(oj.j, oi.a(dfa.ob, "_front"))
         .a(oj.k, oi.a(dfa.ob, "_front"))
         .a(oj.l, oi.a(dfa.ob, "_side"))
         .a(oj.m, oi.a(dfa.ob, "_side"));
      this.b.accept(c(dfa.ob, oh.a.a(dfa.ob, $$0, this.c)));
   }

   private void a(dey $$0, dey $$1, BiFunction<dey, dey, oi> $$2) {
      oi $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, oh.a.a($$0, $$3, this.c)));
   }

   public void b(dey $$0) {
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
      oi $$0 = oi.k(dfa.eZ);
      this.b.accept(c(dfa.eZ, of.a(dfa.eZ)));
      this.a(dfa.ee, $$0);
      this.a(dfa.ef, $$0);
   }

   private void a(dey $$0, oi $$1) {
      ale $$2 = oh.p.a($$0, $$1.c(oj.g, oi.G($$0)), this.c);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cur.sr);
      this.m(dfa.ft);
      this.b.accept(c(dfa.fv, oh.bs.a(dfa.fv, oi.j(oi.a(dfa.H, "_still")), this.c)));
      this.b
         .accept(
            nx.a(dfa.fu)
               .a(
                  ny.a(djh.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dfa.fu, "_level1", oi.j(oi.a(dfa.G, "_still")), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dfa.fu, "_level2", oi.j(oi.a(dfa.G, "_still")), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dfa.fu, "_full", oi.j(oi.a(dfa.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nx.a(dfa.fw)
               .a(
                  ny.a(djh.g)
                     .a(1, oa.a().a(ob.c, oh.bq.a(dfa.fw, "_level1", oi.j(oi.G(dfa.qP)), this.c)))
                     .a(2, oa.a().a(ob.c, oh.br.a(dfa.fw, "_level2", oi.j(oi.G(dfa.qP)), this.c)))
                     .a(3, oa.a().a(ob.c, oh.bs.a(dfa.fw, "_full", oi.j(oi.G(dfa.qP)), this.c)))
               )
         );
   }

   private void B() {
      oi $$0 = oi.b(dfa.kv);
      ale $$1 = oh.aE.a(dfa.kv, $$0, this.c);
      ale $$2 = this.a(dfa.kv, "_dead", oh.aE, $$1x -> $$0.c(oj.b, $$1x));
      this.b.accept(nx.a(dfa.kv).a(a(dsr.au, 5, $$2, $$1)));
   }

   private void C() {
      ale $$0 = of.a(dfa.tq);
      ale $$1 = of.a(dfa.tq, "_triggered");
      ale $$2 = of.a(dfa.tq, "_crafting");
      ale $$3 = of.a(dfa.tq, "_crafting_triggered");
      this.b
         .accept(
            nx.a(dfa.tq)
               .a(ny.a(dsr.T).a($$0x -> this.a($$0x, oa.a())))
               .a(
                  ny.a(dsr.A, dgr.b)
                     .a(false, false, oa.a().a(ob.c, $$0))
                     .a(true, true, oa.a().a(ob.c, $$3))
                     .a(true, false, oa.a().a(ob.c, $$1))
                     .a(false, true, oa.a().a(ob.c, $$2))
               )
         );
   }

   private void v(dey $$0) {
      oi $$1 = new oi().a(oj.f, oi.a(dfa.cD, "_top")).a(oj.i, oi.a(dfa.cD, "_side")).a(oj.g, oi.a($$0, "_front"));
      oi $$2 = new oi().a(oj.i, oi.a(dfa.cD, "_top")).a(oj.g, oi.a($$0, "_front_vertical"));
      ale $$3 = oh.p.a($$0, $$1, this.c);
      ale $$4 = oh.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nx.a($$0)
               .a(
                  ny.a(dsr.P)
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
      ale $$0 = of.a(dfa.fy);
      ale $$1 = of.a(dfa.fy, "_filled");
      this.b.accept(nx.a(dfa.fy).a(ny.a(dsr.h).a(false, oa.a().a(ob.c, $$0)).a(true, oa.a().a(ob.c, $$1))).a(c()));
   }

   private void E() {
      ale $$0 = of.a(dfa.ku, "_side");
      ale $$1 = of.a(dfa.ku, "_noside");
      ale $$2 = of.a(dfa.ku, "_noside1");
      ale $$3 = of.a(dfa.ku, "_noside2");
      ale $$4 = of.a(dfa.ku, "_noside3");
      this.b
         .accept(
            nw.a(dfa.ku)
               .a(nv.a().a(dsr.L, true), oa.a().a(ob.c, $$0))
               .a(nv.a().a(dsr.M, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsr.N, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.c).a(ob.d, true))
               .a(nv.a().a(dsr.O, true), oa.a().a(ob.c, $$0).a(ob.b, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsr.J, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.d).a(ob.d, true))
               .a(nv.a().a(dsr.K, true), oa.a().a(ob.c, $$0).a(ob.a, ob.a.b).a(ob.d, true))
               .a(nv.a().a(dsr.L, false), oa.a().a(ob.c, $$1).a(ob.e, 2), oa.a().a(ob.c, $$2), oa.a().a(ob.c, $$3), oa.a().a(ob.c, $$4))
               .a(
                  nv.a().a(dsr.M, false),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.b).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.b).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsr.N, false),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.c).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.c).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsr.O, false),
                  oa.a().a(ob.c, $$4).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.b, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.b, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsr.J, false),
                  oa.a().a(ob.c, $$1).a(ob.e, 2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$4).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$2).a(ob.a, ob.a.d).a(ob.d, true),
                  oa.a().a(ob.c, $$3).a(ob.a, ob.a.d).a(ob.d, true)
               )
               .a(
                  nv.a().a(dsr.K, false),
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
            nw.a(dfa.pc)
               .a(oa.a().a(ob.c, oi.G(dfa.pc)))
               .a(nv.a().a(dsr.aL, 1), oa.a().a(ob.c, oi.a(dfa.pc, "_contents1")))
               .a(nv.a().a(dsr.aL, 2), oa.a().a(ob.c, oi.a(dfa.pc, "_contents2")))
               .a(nv.a().a(dsr.aL, 3), oa.a().a(ob.c, oi.a(dfa.pc, "_contents3")))
               .a(nv.a().a(dsr.aL, 4), oa.a().a(ob.c, oi.a(dfa.pc, "_contents4")))
               .a(nv.a().a(dsr.aL, 5), oa.a().a(ob.c, oi.a(dfa.pc, "_contents5")))
               .a(nv.a().a(dsr.aL, 6), oa.a().a(ob.c, oi.a(dfa.pc, "_contents6")))
               .a(nv.a().a(dsr.aL, 7), oa.a().a(ob.c, oi.a(dfa.pc, "_contents7")))
               .a(nv.a().a(dsr.aL, 8), oa.a().a(ob.c, oi.a(dfa.pc, "_contents_ready")))
         );
   }

   private void w(dey $$0) {
      ale $$1 = oh.c.a($$0, oi.a($$0), this.c);
      ale $$2 = this.a($$0, "_powered", oh.c, oi::b);
      ale $$3 = this.a($$0, "_lit", oh.c, oi::b);
      ale $$4 = this.a($$0, "_lit_powered", oh.c, oi::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nu a(dey $$0, ale $$1, ale $$2, ale $$3, ale $$4) {
      return nx.a($$0).a(ny.a(dsr.r, dsr.w).a(($$4x, $$5) -> $$4x ? oa.a().a(ob.c, $$5 ? $$4 : $$2) : oa.a().a(ob.c, $$5 ? $$3 : $$1)));
   }

   private void i(dey $$0, dey $$1) {
      ale $$2 = of.a($$0);
      ale $$3 = of.a($$0, "_powered");
      ale $$4 = of.a($$0, "_lit");
      ale $$5 = of.a($$0, "_lit_powered");
      this.a($$1, of.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dey $$0) {
      this.c($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, oh.ao.a($$0, oi.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dfa.qy);
      this.x(dfa.qx);
      this.x(dfa.qw);
      this.x(dfa.qv);
   }

   private void H() {
      this.c(dfa.st);
      ny.b<je, dsy> $$0 = ny.a(dsr.bm, dsr.bn);

      for (dsy $$1 : dsy.values()) {
         $$0.a(je.b, $$1, this.a(je.b, $$1));
      }

      for (dsy $$2 : dsy.values()) {
         $$0.a(je.a, $$2, this.a(je.a, $$2));
      }

      this.b.accept(nx.a(dfa.st).a($$0));
   }

   private oa a(je $$0, dsy $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      oi $$3 = oi.c(oi.a(dfa.st, $$2));
      return oa.a().a(ob.c, oh.an.a(dfa.st, $$2, $$3, this.c));
   }

   private void y(dey $$0) {
      oi $$1 = new oi().a(oj.e, oi.G(dfa.dV)).a(oj.f, oi.G($$0)).a(oj.i, oi.a($$0, "_side"));
      this.b.accept(c($$0, oh.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ale $$0 = oi.a(dfa.gZ, "_side");
      oi $$1 = new oi().a(oj.f, oi.a(dfa.gZ, "_top")).a(oj.i, $$0);
      oi $$2 = new oi().a(oj.f, oi.a(dfa.gZ, "_inverted_top")).a(oj.i, $$0);
      this.b
         .accept(
            nx.a(dfa.gZ)
               .a(ny.a(dsr.p).a(false, oa.a().a(ob.c, oh.aF.a(dfa.gZ, $$1, this.c))).a(true, oa.a().a(ob.c, oh.aF.a(of.a(dfa.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dey $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()));
   }

   private void J() {
      dey $$0 = dfa.ss;
      ale $$1 = of.a($$0, "_on");
      ale $$2 = of.a($$0);
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(this.n()).a(a(dsr.w, $$1, $$2)));
   }

   private void K() {
      oi $$0 = new oi().a(oj.B, oi.G(dfa.j)).a(oj.f, oi.G(dfa.cC));
      oi $$1 = new oi().a(oj.B, oi.G(dfa.j)).a(oj.f, oi.a(dfa.cC, "_moist"));
      ale $$2 = oh.aW.a(dfa.cC, $$0, this.c);
      ale $$3 = oh.aW.a(oi.a(dfa.cC, "_moist"), $$1, this.c);
      this.b.accept(nx.a(dfa.cC).a(a(dsr.aQ, 7, $$3, $$2)));
   }

   private List<ale> A(dey $$0) {
      ale $$1 = oh.aX.a(of.a($$0, "_floor0"), oi.v($$0), this.c);
      ale $$2 = oh.aX.a(of.a($$0, "_floor1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ale> B(dey $$0) {
      ale $$1 = oh.aY.a(of.a($$0, "_side0"), oi.v($$0), this.c);
      ale $$2 = oh.aY.a(of.a($$0, "_side1"), oi.w($$0), this.c);
      ale $$3 = oh.aZ.a(of.a($$0, "_side_alt0"), oi.v($$0), this.c);
      ale $$4 = oh.aZ.a(of.a($$0, "_side_alt1"), oi.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ale> C(dey $$0) {
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
      nv $$0 = nv.a().a(dsr.L, false).a(dsr.M, false).a(dsr.N, false).a(dsr.O, false).a(dsr.J, false);
      List<ale> $$1 = this.A(dfa.cr);
      List<ale> $$2 = this.B(dfa.cr);
      List<ale> $$3 = this.C(dfa.cr);
      this.b
         .accept(
            nw.a(dfa.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dsr.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nv.b(nv.a().a(dsr.M, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(nv.b(nv.a().a(dsr.N, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(nv.b(nv.a().a(dsr.O, true), $$0), a($$2, $$0x -> $$0x.a(ob.b, ob.a.d)))
               .a(nv.a().a(dsr.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ale> $$0 = this.A(dfa.cs);
      List<ale> $$1 = this.B(dfa.cs);
      this.b
         .accept(
            nw.a(dfa.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.b)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.c)))
               .a(a($$1, $$0x -> $$0x.a(ob.b, ob.a.d)))
         );
   }

   private void D(dey $$0) {
      ale $$1 = ok.t.create($$0, this.c);
      ale $$2 = ok.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nx.a($$0).a(a(dsr.j, $$2, $$1)));
   }

   private void N() {
      oi $$0 = oi.a(oi.a(dfa.ad, "_side"), oi.a(dfa.ad, "_top"));
      ale $$1 = oh.j.a(dfa.ad, $$0, this.c);
      this.b.accept(d(dfa.ad, $$1));
   }

   private void O() {
      this.a(cur.ad);
      dey $$0 = dfa.E;
      ny.b<Boolean, Integer> $$1 = ny.a(djt.d, djt.b);
      ale $$2 = of.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ale $$4 = of.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, oa.a().a(ob.c, $$4));
         $$1.a(false, $$3, oa.a().a(ob.c, $$2));
      }

      this.b.accept(nx.a(dfa.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nx.a(dfa.kI)
               .a(
                  ny.a(dsr.as)
                     .a(0, oa.a().a(ob.c, this.a(dfa.kI, "_0", oh.c, oi::b)))
                     .a(1, oa.a().a(ob.c, this.a(dfa.kI, "_1", oh.c, oi::b)))
                     .a(2, oa.a().a(ob.c, this.a(dfa.kI, "_2", oh.c, oi::b)))
                     .a(3, oa.a().a(ob.c, this.a(dfa.kI, "_3", oh.c, oi::b)))
               )
         );
   }

   private void Q() {
      ale $$0 = oi.G(dfa.j);
      oi $$1 = new oi().a(oj.e, $$0).b(oj.e, oj.c).a(oj.f, oi.a(dfa.i, "_top")).a(oj.i, oi.a(dfa.i, "_snow"));
      oa $$2 = oa.a().a(ob.c, oh.n.a(dfa.i, "_snow", $$1, this.c));
      this.a(dfa.i, of.a(dfa.i), $$2);
      ale $$3 = ok.f.get(dfa.fl).a($$1x -> $$1x.a(oj.e, $$0)).a(dfa.fl, this.c);
      this.a(dfa.fl, $$3, $$2);
      ale $$4 = ok.f.get(dfa.l).a($$1x -> $$1x.a(oj.e, $$0)).a(dfa.l, this.c);
      this.a(dfa.l, $$4, $$2);
   }

   private void a(dey $$0, ale $$1, oa $$2) {
      List<oa> $$3 = Arrays.asList(a($$1));
      this.b.accept(nx.a($$0).a(ny.a(dsr.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cur.rh);
      this.b
         .accept(
            nx.a(dfa.fC)
               .a(
                  ny.a(dsr.ar)
                     .a(0, oa.a().a(ob.c, of.a(dfa.fC, "_stage0")))
                     .a(1, oa.a().a(ob.c, of.a(dfa.fC, "_stage1")))
                     .a(2, oa.a().a(ob.c, of.a(dfa.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dfa.kE, of.a(dfa.kE)));
   }

   private void j(dey $$0, dey $$1) {
      oi $$2 = oi.b($$1);
      ale $$3 = oh.Y.a($$0, $$2, this.c);
      ale $$4 = oh.Z.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dsr.aT, 1, $$4, $$3)));
   }

   private void T() {
      ale $$0 = of.a(dfa.hc);
      ale $$1 = of.a(dfa.hc, "_side");
      this.a(cur.lR);
      this.b
         .accept(
            nx.a(dfa.hc)
               .a(
                  ny.a(dsr.Q)
                     .a(je.a, oa.a().a(ob.c, $$0))
                     .a(je.c, oa.a().a(ob.c, $$1))
                     .a(je.f, oa.a().a(ob.c, $$1).a(ob.b, ob.a.b))
                     .a(je.d, oa.a().a(ob.c, $$1).a(ob.b, ob.a.c))
                     .a(je.e, oa.a().a(ob.c, $$1).a(ob.b, ob.a.d))
               )
         );
   }

   private void k(dey $$0, dey $$1) {
      ale $$2 = of.a($$0);
      this.b.accept(nx.a($$1, oa.a().a(ob.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ale $$0 = of.a(dfa.eW, "_post_ends");
      ale $$1 = of.a(dfa.eW, "_post");
      ale $$2 = of.a(dfa.eW, "_cap");
      ale $$3 = of.a(dfa.eW, "_cap_alt");
      ale $$4 = of.a(dfa.eW, "_side");
      ale $$5 = of.a(dfa.eW, "_side_alt");
      this.b
         .accept(
            nw.a(dfa.eW)
               .a(oa.a().a(ob.c, $$0))
               .a(nv.a().a(dsr.L, false).a(dsr.M, false).a(dsr.N, false).a(dsr.O, false), oa.a().a(ob.c, $$1))
               .a(nv.a().a(dsr.L, true).a(dsr.M, false).a(dsr.N, false).a(dsr.O, false), oa.a().a(ob.c, $$2))
               .a(nv.a().a(dsr.L, false).a(dsr.M, true).a(dsr.N, false).a(dsr.O, false), oa.a().a(ob.c, $$2).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.L, false).a(dsr.M, false).a(dsr.N, true).a(dsr.O, false), oa.a().a(ob.c, $$3))
               .a(nv.a().a(dsr.L, false).a(dsr.M, false).a(dsr.N, false).a(dsr.O, true), oa.a().a(ob.c, $$3).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.L, true), oa.a().a(ob.c, $$4))
               .a(nv.a().a(dsr.M, true), oa.a().a(ob.c, $$4).a(ob.b, ob.a.b))
               .a(nv.a().a(dsr.N, true), oa.a().a(ob.c, $$5))
               .a(nv.a().a(dsr.O, true), oa.a().a(ob.c, $$5).a(ob.b, ob.a.b))
         );
      this.d(dfa.eW);
   }

   private void E(dey $$0) {
      this.b.accept(nx.a($$0, oa.a().a(ob.c, of.a($$0))).a(b()));
   }

   private void V() {
      ale $$0 = of.a(dfa.dw);
      ale $$1 = of.a(dfa.dw, "_on");
      this.d(dfa.dw);
      this.b
         .accept(
            nx.a(dfa.dw)
               .a(a(dsr.w, $$0, $$1))
               .a(
                  ny.a(dsr.U, dsr.R)
                     .a(dsm.c, je.c, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.c))
                     .a(dsm.c, je.f, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.d))
                     .a(dsm.c, je.d, oa.a().a(ob.a, ob.a.c))
                     .a(dsm.c, je.e, oa.a().a(ob.a, ob.a.c).a(ob.b, ob.a.b))
                     .a(dsm.a, je.c, oa.a())
                     .a(dsm.a, je.f, oa.a().a(ob.b, ob.a.b))
                     .a(dsm.a, je.d, oa.a().a(ob.b, ob.a.c))
                     .a(dsm.a, je.e, oa.a().a(ob.b, ob.a.d))
                     .a(dsm.b, je.c, oa.a().a(ob.a, ob.a.b))
                     .a(dsm.b, je.f, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.b))
                     .a(dsm.b, je.d, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.c))
                     .a(dsm.b, je.e, oa.a().a(ob.a, ob.a.b).a(ob.b, ob.a.d))
               )
         );
   }

   private void W() {
      this.d(dfa.fm);
      this.b.accept(b(dfa.fm, of.a(dfa.fm)));
   }

   private void X() {
      this.d(dfa.tn);
      this.b.accept(c(dfa.tn, of.a(dfa.tn)));
   }

   private void Y() {
      this.b.accept(nx.a(dfa.ed).a(ny.a(dsr.H).a(je.a.a, oa.a().a(ob.c, of.a(dfa.ed, "_ns"))).a(je.a.c, oa.a().a(ob.c, of.a(dfa.ed, "_ew")))));
   }

   private void Z() {
      ale $$0 = ok.a.create(dfa.dV, this.c);
      this.b
         .accept(
            nx.a(
               dfa.dV,
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
      ale $$0 = of.a(dfa.kO);
      ale $$1 = of.a(dfa.kO, "_on");
      this.b.accept(nx.a(dfa.kO).a(a(dsr.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      oi $$0 = new oi().a(oj.e, oi.a(dfa.by, "_bottom")).a(oj.i, oi.a(dfa.by, "_side"));
      ale $$1 = oi.a(dfa.by, "_top_sticky");
      ale $$2 = oi.a(dfa.by, "_top");
      oi $$3 = $$0.c(oj.E, $$1);
      oi $$4 = $$0.c(oj.E, $$2);
      ale $$5 = of.a(dfa.by, "_base");
      this.a(dfa.by, $$5, $$4);
      this.a(dfa.br, $$5, $$3);
      ale $$6 = oh.n.a(dfa.by, "_inventory", $$0.c(oj.f, $$2), this.c);
      ale $$7 = oh.n.a(dfa.br, "_inventory", $$0.c(oj.f, $$1), this.c);
      this.a(dfa.by, $$6);
      this.a(dfa.br, $$7);
   }

   private void a(dey $$0, ale $$1, oi $$2) {
      ale $$3 = oh.bh.a($$0, $$2, this.c);
      this.b.accept(nx.a($$0).a(a(dsr.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      oi $$0 = new oi().a(oj.F, oi.a(dfa.by, "_top")).a(oj.i, oi.a(dfa.by, "_side"));
      oi $$1 = $$0.c(oj.E, oi.a(dfa.by, "_top_sticky"));
      oi $$2 = $$0.c(oj.E, oi.a(dfa.by, "_top"));
      this.b
         .accept(
            nx.a(dfa.bz)
               .a(
                  ny.a(dsr.x, dsr.bg)
                     .a(false, dtd.a, oa.a().a(ob.c, oh.bi.a(dfa.by, "_head", $$2, this.c)))
                     .a(false, dtd.b, oa.a().a(ob.c, oh.bi.a(dfa.by, "_head_sticky", $$1, this.c)))
                     .a(true, dtd.a, oa.a().a(ob.c, oh.bj.a(dfa.by, "_head_short", $$2, this.c)))
                     .a(true, dtd.b, oa.a().a(ob.c, oh.bj.a(dfa.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dey $$0 = dfa.tr;
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
      this.b.accept(nx.a($$0).a(ny.a(dsr.by, dsr.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> oa.a().a(ob.c, $$7x ? $$10 : $$7);
            case b, c, d -> oa.a().a(ob.c, $$7x ? $$11 : $$8);
            case e -> oa.a().a(ob.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dey $$0 = dfa.ts;
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
      this.b.accept(nx.a($$0).a(b()).a(ny.a(dnt.b, dnt.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> oa.a().a(ob.c, $$9x ? $$13 : $$5);
            case b -> oa.a().a(ob.c, $$9x ? $$14 : $$6);
            case c -> oa.a().a(ob.c, $$9x ? $$15 : $$7);
            case d -> oa.a().a(ob.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      ale $$0 = of.a(dfa.qQ, "_inactive");
      ale $$1 = of.a(dfa.qQ, "_active");
      this.a(dfa.qQ, $$0);
      this.b.accept(nx.a(dfa.qQ).a(ny.a(dsr.bo).a($$2 -> oa.a().a(ob.c, $$2 != dti.b && $$2 != dti.c ? $$0 : $$1))));
   }

   private void ag() {
      ale $$0 = of.a(dfa.qR, "_inactive");
      ale $$1 = of.a(dfa.qR, "_active");
      this.a(dfa.qR, $$0);
      this.b.accept(nx.a(dfa.qR).a(ny.a(dsr.bo).a($$2 -> oa.a().a(ob.c, $$2 != dti.b && $$2 != dti.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      ale $$0 = oh.bM.a(dfa.qV, oi.a(false), this.c);
      ale $$1 = oh.bM.a(dfa.qV, "_can_summon", oi.a(true), this.c);
      this.a(dfa.qV, $$0);
      this.b.accept(nx.a(dfa.qV).a(a(dsr.G, $$1, $$0)));
   }

   private void ai() {
      ale $$0 = of.a(dfa.nS, "_stable");
      ale $$1 = of.a(dfa.nS, "_unstable");
      this.a(dfa.nS, $$0);
      this.b.accept(nx.a(dfa.nS).a(a(dsr.b, $$1, $$0)));
   }

   private void aj() {
      ale $$0 = this.a(dfa.sv, "", oh.ao, oi::c);
      ale $$1 = this.a(dfa.sv, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dfa.sv).a(a(dsr.D, $$1, $$0)));
      ale $$2 = this.a(dfa.sw, "", oh.ao, oi::c);
      ale $$3 = this.a(dfa.sw, "_lit", oh.ao, oi::c);
      this.b.accept(nx.a(dfa.sw).a(a(dsr.D, $$3, $$2)));
   }

   private void ak() {
      ale $$0 = ok.a.create(dfa.fB, this.c);
      ale $$1 = this.a(dfa.fB, "_on", oh.c, oi::b);
      this.b.accept(nx.a(dfa.fB).a(a(dsr.r, $$1, $$0)));
   }

   private void l(dey $$0, dey $$1) {
      oi $$2 = oi.y($$0);
      this.b.accept(c($$0, oh.bf.a($$0, $$2, this.c)));
      this.b.accept(nx.a($$1, oa.a().a(ob.c, oh.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      oi $$0 = oi.y(dfa.dK);
      oi $$1 = oi.i(oi.a(dfa.dK, "_off"));
      ale $$2 = oh.bf.a(dfa.dK, $$0, this.c);
      ale $$3 = oh.bf.a(dfa.dK, "_off", $$1, this.c);
      this.b.accept(nx.a(dfa.dK).a(a(dsr.r, $$2, $$3)));
      ale $$4 = oh.bg.a(dfa.dL, $$0, this.c);
      ale $$5 = oh.bg.a(dfa.dL, "_off", $$1, this.c);
      this.b.accept(nx.a(dfa.dL).a(a(dsr.r, $$4, $$5)).a(d()));
      this.d(dfa.dK);
      this.c(dfa.dL);
   }

   private void am() {
      this.a(cur.lK);
      this.b.accept(nx.a(dfa.eh).a(ny.a(dsr.aA, dsr.s, dsr.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return oa.a().a(ob.c, oi.a(dfa.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cur.cT);
      this.b
         .accept(
            nx.a(dfa.mV)
               .a(
                  ny.a(dsr.aS, dsr.C)
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
      oi $$0 = oi.a(dfa.dN);
      ale $$1 = oh.c.a(dfa.dP, $$0, this.c);
      this.b.accept(nx.a(dfa.dN).a(ny.a(dsr.aF).a($$1x -> oa.a().a(ob.c, $$1x < 8 ? of.a(dfa.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dfa.dN, of.a(dfa.dN, "_height2"));
      this.b.accept(c(dfa.dP, $$1));
   }

   private void ap() {
      this.b.accept(nx.a(dfa.oc, oa.a().a(ob.c, of.a(dfa.oc))).a(b()));
   }

   private void aq() {
      ale $$0 = ok.a.create(dfa.pa, this.c);
      this.a(dfa.pa, $$0);
      this.b.accept(nx.a(dfa.pa).a(ny.a(dsr.bj).a($$0x -> oa.a().a(ob.c, this.a(dfa.pa, "_" + $$0x.c(), oh.c, oi::b)))));
   }

   private void ar() {
      this.a(cur.wr);
      this.b.accept(nx.a(dfa.oi).a(ny.a(dsr.as).a($$0 -> oa.a().a(ob.c, this.a(dfa.oi, "_stage" + $$0, oh.ao, oi::c)))));
   }

   private void as() {
      this.a(cur.ps);
      this.b
         .accept(
            nx.a(dfa.fI)
               .a(
                  ny.a(dsr.a, dsr.M, dsr.L, dsr.N, dsr.O)
                     .a(false, false, false, false, false, oa.a().a(ob.c, of.a(dfa.fI, "_ns")))
                     .a(false, true, false, false, false, oa.a().a(ob.c, of.a(dfa.fI, "_n")).a(ob.b, ob.a.b))
                     .a(false, false, true, false, false, oa.a().a(ob.c, of.a(dfa.fI, "_n")))
                     .a(false, false, false, true, false, oa.a().a(ob.c, of.a(dfa.fI, "_n")).a(ob.b, ob.a.c))
                     .a(false, false, false, false, true, oa.a().a(ob.c, of.a(dfa.fI, "_n")).a(ob.b, ob.a.d))
                     .a(false, true, true, false, false, oa.a().a(ob.c, of.a(dfa.fI, "_ne")))
                     .a(false, true, false, true, false, oa.a().a(ob.c, of.a(dfa.fI, "_ne")).a(ob.b, ob.a.b))
                     .a(false, false, false, true, true, oa.a().a(ob.c, of.a(dfa.fI, "_ne")).a(ob.b, ob.a.c))
                     .a(false, false, true, false, true, oa.a().a(ob.c, of.a(dfa.fI, "_ne")).a(ob.b, ob.a.d))
                     .a(false, false, true, true, false, oa.a().a(ob.c, of.a(dfa.fI, "_ns")))
                     .a(false, true, false, false, true, oa.a().a(ob.c, of.a(dfa.fI, "_ns")).a(ob.b, ob.a.b))
                     .a(false, true, true, true, false, oa.a().a(ob.c, of.a(dfa.fI, "_nse")))
                     .a(false, true, false, true, true, oa.a().a(ob.c, of.a(dfa.fI, "_nse")).a(ob.b, ob.a.b))
                     .a(false, false, true, true, true, oa.a().a(ob.c, of.a(dfa.fI, "_nse")).a(ob.b, ob.a.c))
                     .a(false, true, true, false, true, oa.a().a(ob.c, of.a(dfa.fI, "_nse")).a(ob.b, ob.a.d))
                     .a(false, true, true, true, true, oa.a().a(ob.c, of.a(dfa.fI, "_nsew")))
                     .a(true, false, false, false, false, oa.a().a(ob.c, of.a(dfa.fI, "_attached_ns")))
                     .a(true, false, true, false, false, oa.a().a(ob.c, of.a(dfa.fI, "_attached_n")))
                     .a(true, false, false, true, false, oa.a().a(ob.c, of.a(dfa.fI, "_attached_n")).a(ob.b, ob.a.c))
                     .a(true, true, false, false, false, oa.a().a(ob.c, of.a(dfa.fI, "_attached_n")).a(ob.b, ob.a.b))
                     .a(true, false, false, false, true, oa.a().a(ob.c, of.a(dfa.fI, "_attached_n")).a(ob.b, ob.a.d))
                     .a(true, true, true, false, false, oa.a().a(ob.c, of.a(dfa.fI, "_attached_ne")))
                     .a(true, true, false, true, false, oa.a().a(ob.c, of.a(dfa.fI, "_attached_ne")).a(ob.b, ob.a.b))
                     .a(true, false, false, true, true, oa.a().a(ob.c, of.a(dfa.fI, "_attached_ne")).a(ob.b, ob.a.c))
                     .a(true, false, true, false, true, oa.a().a(ob.c, of.a(dfa.fI, "_attached_ne")).a(ob.b, ob.a.d))
                     .a(true, false, true, true, false, oa.a().a(ob.c, of.a(dfa.fI, "_attached_ns")))
                     .a(true, true, false, false, true, oa.a().a(ob.c, of.a(dfa.fI, "_attached_ns")).a(ob.b, ob.a.b))
                     .a(true, true, true, true, false, oa.a().a(ob.c, of.a(dfa.fI, "_attached_nse")))
                     .a(true, true, false, true, true, oa.a().a(ob.c, of.a(dfa.fI, "_attached_nse")).a(ob.b, ob.a.b))
                     .a(true, false, true, true, true, oa.a().a(ob.c, of.a(dfa.fI, "_attached_nse")).a(ob.b, ob.a.c))
                     .a(true, true, true, false, true, oa.a().a(ob.c, of.a(dfa.fI, "_attached_nse")).a(ob.b, ob.a.d))
                     .a(true, true, true, true, true, oa.a().a(ob.c, of.a(dfa.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dfa.fH);
      this.b.accept(nx.a(dfa.fH).a(ny.a(dsr.a, dsr.w).a(($$0, $$1) -> oa.a().a(ob.c, oi.a(dfa.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
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
            return this.a($$0.intValue(), "", oi.b(oi.G(dfa.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", oi.b(oi.a(dfa.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", oi.b(oi.a(dfa.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cur.kp);
      this.b.accept(nx.a(dfa.mf).a(ny.a(dsr.aD, dsr.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cur.kq);
      Function<Integer, ale> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         oi $$2 = oi.a($$1);
         return oh.bw.a(dfa.mg, $$1, $$2, this.c);
      };
      this.b.accept(nx.a(dfa.mg).a(ny.a(dmg.c).a($$1 -> oa.a().a(ob.c, $$0.apply($$1)))));
   }

   private void F(dey $$0) {
      this.d($$0);
      ale $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      nv.c $$3 = ac.a(nv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.o().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dss, Function<ale, oa>> $$4 : a) {
         dss $$5 = (dss)$$4.getFirst();
         Function<ale, oa> $$6 = (Function<ale, oa>)$$4.getSecond();
         if ($$0.o().b($$5)) {
            $$2.a(nv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      ale $$0 = oi.a(dfa.qU, "_bottom");
      oi $$1 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dfa.qU, "_top")).a(oj.i, oi.a(dfa.qU, "_side"));
      oi $$2 = new oi().a(oj.e, $$0).a(oj.f, oi.a(dfa.qU, "_top_bloom")).a(oj.i, oi.a(dfa.qU, "_side_bloom"));
      ale $$3 = oh.n.a(dfa.qU, "", $$1, this.c);
      ale $$4 = oh.n.a(dfa.qU, "_bloom", $$2, this.c);
      this.b.accept(nx.a(dfa.qU).a(ny.a(dsr.E).a($$2x -> oa.a().a(ob.c, $$2x ? $$4 : $$3))));
      this.a(cur.gj, $$3);
   }

   private void ax() {
      dey $$0 = dfa.cm;
      ale $$1 = of.a($$0);
      nw $$2 = nw.a($$0);
      List.of(Pair.of(je.c, ob.a.a), Pair.of(je.f, ob.a.b), Pair.of(je.d, ob.a.c), Pair.of(je.e, ob.a.d)).forEach($$2x -> {
         je $$3 = (je)$$2x.getFirst();
         ob.a $$4 = (ob.a)$$2x.getSecond();
         nv.c $$5 = nv.a().a(dsr.R, $$3);
         $$2.a($$5, oa.a().a(ob.c, $$1).a(ob.b, $$4).a(ob.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, of.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2) {
      List.of(Pair.of(dsr.bp, oh.aM), Pair.of(dsr.bq, oh.aN), Pair.of(dsr.br, oh.aO), Pair.of(dsr.bs, oh.aP), Pair.of(dsr.bt, oh.aQ), Pair.of(dsr.bu, oh.aR))
         .forEach($$3 -> {
            dss $$4 = (dss)$$3.getFirst();
            og $$5 = (og)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nw $$0, nv.c $$1, ob.a $$2, dss $$3, og $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      oi $$7 = new oi().a(oj.b, oi.a(dfa.cm, $$6));
      nr.d $$8 = new nr.d($$4, $$6);
      ale $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dfa.cm, $$6, $$7, this.c));
      $$0.a(nv.a($$1, nv.a().a($$3, $$5)), oa.a().a(ob.c, $$9).a(ob.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dfa.kJ, oh.c.a(dfa.kJ, oi.b(of.a("magma")), this.c)));
   }

   private void G(dey $$0) {
      this.b($$0, ok.q);
      oh.bD.a(of.a($$0.r()), oi.u($$0), this.c);
   }

   private void b(dey $$0, dey $$1, nr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dey $$0, dey $$1) {
      oh.bE.a(of.a($$0.r()), oi.u($$1), this.c);
   }

   private void az() {
      ale $$0 = of.a(dfa.b);
      ale $$1 = of.a(dfa.b, "_mirrored");
      this.b.accept(a(dfa.eN, $$0, $$1));
      this.a(dfa.eN, $$0);
   }

   private void aA() {
      ale $$0 = of.a(dfa.sJ);
      ale $$1 = of.a(dfa.sJ, "_mirrored");
      this.b.accept(a(dfa.td, $$0, $$1).a(f()));
      this.a(dfa.td, $$0);
   }

   private void n(dey $$0, dey $$1) {
      this.a($$0, nr.e.b);
      oi $$2 = oi.d(oi.a($$0, "_pot"));
      ale $$3 = nr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      ale $$0 = oi.a(dfa.pl, "_bottom");
      ale $$1 = oi.a(dfa.pl, "_top_off");
      ale $$2 = oi.a(dfa.pl, "_top");
      ale[] $$3 = new ale[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         oi $$5 = new oi().a(oj.e, $$0).a(oj.f, $$4 == 0 ? $$1 : $$2).a(oj.i, oi.a(dfa.pl, "_side" + $$4));
         $$3[$$4] = oh.n.a(dfa.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nx.a(dfa.pl).a(ny.a(dsr.aZ).a($$1x -> oa.a().a(ob.c, $$3[$$1x]))));
      this.a(cur.wP, $$3[0]);
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
      ale $$0 = oi.a(dfa.pb, "_top");
      ale $$1 = oi.a(dfa.pb, "_bottom");
      ale $$2 = oi.a(dfa.pb, "_side");
      ale $$3 = oi.a(dfa.pb, "_lock");
      oi $$4 = new oi().a(oj.o, $$2).a(oj.m, $$2).a(oj.l, $$2).a(oj.c, $$0).a(oj.j, $$0).a(oj.k, $$1).a(oj.n, $$3);
      ale $$5 = oh.b.a(dfa.pb, $$4, this.c);
      this.b.accept(nx.a(dfa.pb, oa.a().a(ob.c, $$5)).a(ny.a(dsr.T).a($$0x -> this.a($$0x, oa.a()))));
   }

   private void aD() {
      dey $$0 = dfa.n;
      ale $$1 = of.a($$0);
      ok $$2 = ok.a.get($$0);
      dey $$3 = dfa.jH;
      ale $$4 = oh.ab.a($$3, $$2.b(), this.c);
      ale $$5 = oh.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ls.a().filter(lt::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dfa.rf).a(ls.w).a(dfa.rf, dfa.rD).a(dfa.rj, dfa.rn).a(ls.y);
      this.h(dfa.re).a(ls.A).a(dfa.re, dfa.rC).a(dfa.ri, dfa.rm).a(ls.C);
      this.h(dfa.rd).a(ls.E).a(dfa.rd, dfa.rB).a(dfa.rh, dfa.rl).a(ls.G);
      this.h(dfa.rc).a(ls.I).a(dfa.rc, dfa.rA).a(dfa.rg, dfa.rk).a(ls.K);
      this.w(dfa.sk);
      this.w(dfa.sl);
      this.w(dfa.sm);
      this.w(dfa.sn);
      this.i(dfa.sk, dfa.so);
      this.i(dfa.sl, dfa.sp);
      this.i(dfa.sm, dfa.sq);
      this.i(dfa.sn, dfa.sr);
      this.m(dfa.a);
      this.c(dfa.nc, dfa.a);
      this.c(dfa.nb, dfa.a);
      this.m(dfa.fO);
      this.m(dfa.dQ);
      this.c(dfa.nd, dfa.G);
      this.m(dfa.fA);
      this.m(dfa.me);
      this.m(dfa.fr);
      this.m(dfa.fR);
      this.a(cur.ue);
      this.m(dfa.pg);
      this.m(dfa.G);
      this.m(dfa.H);
      this.m(dfa.hV);
      this.a(cur.fS);
      this.o(dfa.pM, dfa.qd);
      this.o(dfa.pN, dfa.qe);
      this.o(dfa.pO, dfa.qf);
      this.o(dfa.pP, dfa.qg);
      this.o(dfa.pQ, dfa.qh);
      this.o(dfa.pR, dfa.qi);
      this.o(dfa.pS, dfa.qj);
      this.o(dfa.pT, dfa.qk);
      this.o(dfa.pU, dfa.ql);
      this.o(dfa.pV, dfa.qm);
      this.o(dfa.pW, dfa.qn);
      this.o(dfa.pX, dfa.qo);
      this.o(dfa.pY, dfa.qp);
      this.o(dfa.pZ, dfa.qq);
      this.o(dfa.qa, dfa.qr);
      this.o(dfa.qb, dfa.qs);
      this.o(dfa.pL, dfa.qc);
      this.m(dfa.na);
      this.m(dfa.gs);
      this.m(dfa.qP);
      this.m(dfa.sx);
      this.s(dfa.sy);
      this.s(dfa.sz);
      this.t(dfa.ti);
      this.t(dfa.tj);
      this.aj();
      this.g(dfa.sC, dfa.sA);
      this.p(dfa.sB);
      this.a(dfa.hW, cur.hB);
      this.a(cur.hB);
      this.aE();
      this.a(dfa.kN, cur.jb);
      this.a(cur.jb);
      this.f(dfa.bQ, oi.a(dfa.by, "_side"));
      this.a(dfa.R);
      this.a(dfa.S);
      this.a(dfa.iB);
      this.a(dfa.cx);
      this.a(dfa.cy);
      this.a(dfa.cz);
      this.a(dfa.fE);
      this.a(dfa.fF);
      this.a(dfa.fJ);
      this.a(dfa.N);
      this.a(dfa.T);
      this.a(dfa.O);
      this.a(dfa.ch);
      this.a(dfa.P);
      this.a(dfa.Q);
      this.a(dfa.ci);
      this.b(dfa.pj, ok.d);
      this.a(dfa.pi);
      this.a(dfa.aR);
      this.a(dfa.aS);
      this.a(dfa.aT);
      this.a(dfa.hb);
      this.a(dfa.dI);
      this.a(dfa.dJ);
      this.a(dfa.ha);
      this.a(dfa.pC);
      this.a(dfa.mW);
      this.a(dfa.dR);
      this.a(dfa.k);
      this.a(dfa.pk);
      this.a(dfa.fz);
      this.a(dfa.ec);
      this.a(dfa.L);
      this.a(dfa.ph);
      this.a(dfa.dO);
      this.b(dfa.dT, ok.g);
      this.b(dfa.pq, ok.d);
      this.b(dfa.fa, ok.d);
      this.m(dfa.ac);
      this.m(dfa.ga);
      this.a(dfa.kK);
      this.a(dfa.aY);
      this.a(dfa.iC);
      this.a(dfa.co);
      this.a(dfa.pK);
      this.a(dfa.ii);
      this.a(dfa.oy);
      this.a(dfa.dW);
      this.a(dfa.dX);
      this.b(dfa.ct, ok.b);
      this.a(dfa.aO);
      this.b(dfa.bw, ok.v);
      this.a(cur.cS);
      this.b(dfa.ck, ok.f);
      this.b(dfa.pd, ok.d);
      this.a(dfa.op);
      this.a(dfa.aP);
      this.a(dfa.qt);
      this.a(dfa.qu);
      this.a(dfa.qN);
      this.a(dfa.su);
      this.a(dfa.tf);
      this.a(dfa.tg);
      this.a(dfa.th);
      this.e(dfa.qS);
      this.m(dfa.tt);
      this.aD();
      this.a(dfa.ra);
      this.a(dfa.rb);
      this.a(dfa.qW);
      this.a(dfa.qX);
      this.a(dfa.qY);
      this.a(dfa.qZ);
      this.k(dfa.qW, dfa.rw);
      this.k(dfa.qX, dfa.ry);
      this.k(dfa.qY, dfa.rx);
      this.k(dfa.qZ, dfa.rz);
      this.i(dfa.rM);
      this.i(dfa.rN);
      this.i(dfa.rP);
      this.i(dfa.rO);
      this.a(dfa.rM, dfa.rQ);
      this.a(dfa.rN, dfa.rR);
      this.a(dfa.rP, dfa.rT);
      this.a(dfa.rO, dfa.rS);
      this.k(dfa.rU);
      this.k(dfa.rV);
      this.k(dfa.rX);
      this.k(dfa.rW);
      this.b(dfa.rU, dfa.rY);
      this.b(dfa.rV, dfa.rZ);
      this.b(dfa.rX, dfa.sb);
      this.b(dfa.rW, dfa.sa);
      this.a(dfa.sc);
      this.a(dfa.sd);
      this.a(dfa.se);
      this.a(dfa.sf);
      this.k(dfa.sc, dfa.sg);
      this.k(dfa.sd, dfa.sh);
      this.k(dfa.se, dfa.si);
      this.k(dfa.sf, dfa.sj);
      this.j(dfa.gW, dfa.ch);
      this.j(dfa.gX, dfa.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dfa.og, dfa.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dfa.kt);
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
      this.F(dfa.ff);
      this.F(dfa.fg);
      this.F(dfa.qT);
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
      this.E(dfa.cO);
      this.d(dfa.cO);
      this.E(dfa.oa);
      this.g();
      this.E(dfa.sE);
      this.l(dfa.cp, dfa.cq);
      this.l(dfa.ea, dfa.eb);
      this.a(dfa.cA, dfa.n, oi::c);
      this.a(dfa.nY, dfa.p, oi::d);
      this.y(dfa.ow);
      this.y(dfa.on);
      this.v(dfa.aU);
      this.v(dfa.hi);
      this.C();
      this.D(dfa.oe);
      this.D(dfa.of);
      this.e(dfa.eX, of.a(dfa.eX));
      this.a(dfa.dY, ok.d);
      this.a(dfa.dZ, ok.d);
      this.a(dfa.te);
      this.a(dfa.kM, ok.d);
      this.f(dfa.j);
      this.f(dfa.sH);
      this.f(dfa.I);
      this.g(dfa.J);
      this.g(dfa.M);
      this.f(dfa.K);
      this.e(dfa.F);
      this.b(dfa.to, ok.f);
      this.a(dfa.ij, ok.d, ok.e);
      this.a(dfa.kx, ok.w, ok.x);
      this.a(dfa.hf, ok.w, ok.x);
      this.a(dfa.tk, ok.d, ok.e);
      this.a(dfa.tl, ok.d, ok.e);
      this.a(dfa.tm, ok.d, ok.e);
      this.c(dfa.nT, ok.i);
      this.z();
      this.a(dfa.pe, oi::A);
      this.a(dfa.pf, oi::C);
      this.a(dfa.kD, dsr.as, 0, 1, 2, 3);
      this.a(dfa.gt, dsr.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfa.fq, dsr.as, 0, 1, 1, 2);
      this.a(dfa.gu, dsr.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dfa.cB, dsr.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dfa.kA, nr.e.b, dsr.aq, 0, 1);
      this.i();
      this.h();
      this.a(of.a("decorated_pot"), dfa.iA).b(dfa.tp);
      this.a(of.a("banner"), dfa.n)
         .a(oh.bF, dfa.iJ, dfa.iK, dfa.iL, dfa.iM, dfa.iN, dfa.iO, dfa.iP, dfa.iQ, dfa.iR, dfa.iS, dfa.iT, dfa.iU, dfa.iV, dfa.iW, dfa.iX, dfa.iY)
         .b(dfa.iZ, dfa.ja, dfa.jb, dfa.jc, dfa.jd, dfa.je, dfa.jf, dfa.jg, dfa.jh, dfa.ji, dfa.jj, dfa.jk, dfa.jl, dfa.jm, dfa.jn, dfa.jo);
      this.a(of.a("bed"), dfa.n)
         .b(dfa.aZ, dfa.ba, dfa.bb, dfa.bc, dfa.bd, dfa.be, dfa.bf, dfa.bg, dfa.bh, dfa.bi, dfa.bj, dfa.bk, dfa.bl, dfa.bm, dfa.bn, dfa.bo);
      this.m(dfa.aZ, dfa.bA);
      this.m(dfa.ba, dfa.bB);
      this.m(dfa.bb, dfa.bC);
      this.m(dfa.bc, dfa.bD);
      this.m(dfa.bd, dfa.bE);
      this.m(dfa.be, dfa.bF);
      this.m(dfa.bf, dfa.bG);
      this.m(dfa.bg, dfa.bH);
      this.m(dfa.bh, dfa.bI);
      this.m(dfa.bi, dfa.bJ);
      this.m(dfa.bj, dfa.bK);
      this.m(dfa.bk, dfa.bL);
      this.m(dfa.bl, dfa.bM);
      this.m(dfa.bm, dfa.bN);
      this.m(dfa.bn, dfa.bO);
      this.m(dfa.bo, dfa.bP);
      this.a(of.a("skull"), dfa.dW)
         .a(oh.bG, dfa.gM, dfa.gK, dfa.gI, dfa.gE, dfa.gG, dfa.gQ)
         .a(dfa.gO)
         .b(dfa.gN, dfa.gP, dfa.gL, dfa.gJ, dfa.gF, dfa.gH, dfa.gR);
      this.G(dfa.kP);
      this.G(dfa.kQ);
      this.G(dfa.kR);
      this.G(dfa.kS);
      this.G(dfa.kT);
      this.G(dfa.kU);
      this.G(dfa.kV);
      this.G(dfa.kW);
      this.G(dfa.kX);
      this.G(dfa.kY);
      this.G(dfa.kZ);
      this.G(dfa.la);
      this.G(dfa.lb);
      this.G(dfa.lc);
      this.G(dfa.ld);
      this.G(dfa.le);
      this.G(dfa.lf);
      this.b(dfa.mX, ok.q);
      this.c(dfa.mX);
      this.a(of.a("chest"), dfa.n).b(dfa.cv, dfa.gV);
      this.a(of.a("ender_chest"), dfa.co).b(dfa.fG);
      this.f(dfa.fx, dfa.co).a(dfa.fx, dfa.kF);
      this.a(dfa.aM);
      this.a(dfa.aN);
      this.a(dfa.lw);
      this.a(dfa.lx);
      this.a(dfa.ly);
      this.a(dfa.lz);
      this.a(dfa.lA);
      this.a(dfa.lB);
      this.a(dfa.lC);
      this.a(dfa.lD);
      this.a(dfa.lE);
      this.a(dfa.lF);
      this.a(dfa.lG);
      this.a(dfa.lH);
      this.a(dfa.lI);
      this.a(dfa.lJ);
      this.a(dfa.lK);
      this.a(dfa.lL);
      this.a(ok.a, dfa.lM, dfa.lN, dfa.lO, dfa.lP, dfa.lQ, dfa.lR, dfa.lS, dfa.lT, dfa.lU, dfa.lV, dfa.lW, dfa.lX, dfa.lY, dfa.lZ, dfa.ma, dfa.mb);
      this.a(dfa.iA);
      this.a(dfa.hj);
      this.a(dfa.hk);
      this.a(dfa.hl);
      this.a(dfa.hm);
      this.a(dfa.hn);
      this.a(dfa.ho);
      this.a(dfa.hp);
      this.a(dfa.hq);
      this.a(dfa.hr);
      this.a(dfa.hs);
      this.a(dfa.ht);
      this.a(dfa.hu);
      this.a(dfa.hv);
      this.a(dfa.hw);
      this.a(dfa.hx);
      this.a(dfa.hy);
      this.a(dfa.qO);
      this.h(dfa.aQ, dfa.eY);
      this.h(dfa.ei, dfa.hz);
      this.h(dfa.ej, dfa.hA);
      this.h(dfa.ek, dfa.hB);
      this.h(dfa.el, dfa.hC);
      this.h(dfa.em, dfa.hD);
      this.h(dfa.en, dfa.hE);
      this.h(dfa.eo, dfa.hF);
      this.h(dfa.ep, dfa.hG);
      this.h(dfa.eq, dfa.hH);
      this.h(dfa.er, dfa.hI);
      this.h(dfa.es, dfa.hJ);
      this.h(dfa.et, dfa.hK);
      this.h(dfa.eu, dfa.hL);
      this.h(dfa.ev, dfa.hM);
      this.h(dfa.ew, dfa.hN);
      this.h(dfa.ex, dfa.hO);
      this.b(ok.o, dfa.lg, dfa.lh, dfa.li, dfa.lj, dfa.lk, dfa.ll, dfa.lm, dfa.ln, dfa.lo, dfa.lp, dfa.lq, dfa.lr, dfa.ls, dfa.lt, dfa.lu, dfa.lv);
      this.g(dfa.bA, dfa.ik);
      this.g(dfa.bB, dfa.il);
      this.g(dfa.bC, dfa.im);
      this.g(dfa.bD, dfa.in);
      this.g(dfa.bE, dfa.io);
      this.g(dfa.bF, dfa.ip);
      this.g(dfa.bG, dfa.iq);
      this.g(dfa.bH, dfa.ir);
      this.g(dfa.bI, dfa.is);
      this.g(dfa.bJ, dfa.it);
      this.g(dfa.bK, dfa.iu);
      this.g(dfa.bL, dfa.iv);
      this.g(dfa.bM, dfa.iw);
      this.g(dfa.bN, dfa.ix);
      this.g(dfa.bO, dfa.iy);
      this.g(dfa.bP, dfa.iz);
      this.a(dfa.sI);
      this.a(dfa.eL);
      this.a(dfa.bu, dfa.gb, nr.e.a);
      this.a(dfa.bR, dfa.gc, nr.e.b);
      this.a(dfa.bT, dfa.gd, nr.e.b);
      this.a(dfa.bU, dfa.ge, nr.e.b);
      this.a(dfa.bV, dfa.gf, nr.e.b);
      this.a(dfa.bW, dfa.gg, nr.e.b);
      this.a(dfa.bX, dfa.gh, nr.e.b);
      this.a(dfa.bY, dfa.gi, nr.e.b);
      this.a(dfa.bZ, dfa.gj, nr.e.b);
      this.a(dfa.ca, dfa.gk, nr.e.b);
      this.a(dfa.cb, dfa.gl, nr.e.b);
      this.a(dfa.cc, dfa.gm, nr.e.b);
      this.a(dfa.ce, dfa.gn, nr.e.b);
      this.a(dfa.cd, dfa.go, nr.e.b);
      this.a(dfa.cg, dfa.gp, nr.e.b);
      this.a(dfa.cf, dfa.gq, nr.e.b);
      this.a(dfa.bv, dfa.gr, nr.e.b);
      this.a(dfa.bS, dfa.fS, nr.e.b);
      this.H();
      this.u(dfa.eT);
      this.u(dfa.eU);
      this.u(dfa.eV);
      this.a(dfa.bt, nr.e.a);
      this.b(dfa.dS, nr.e.a);
      this.a(cur.dJ);
      this.b(dfa.mc, dfa.md, nr.e.b);
      this.a(cur.dK);
      this.c(dfa.md);
      this.b(dfa.sG, nr.e.b);
      this.c(dfa.sG);
      this.c(dfa.sw);
      this.b(dfa.oz, dfa.oA, nr.e.b);
      this.b(dfa.oB, dfa.oC, nr.e.b);
      this.a(dfa.oz, "_plant");
      this.c(dfa.oA);
      this.a(dfa.oB, "_plant");
      this.c(dfa.oC);
      this.a(dfa.mY, nr.e.a, oi.c(oi.a(dfa.mZ, "_stage0")));
      this.m();
      this.a(dfa.bs, nr.e.b);
      this.c(dfa.iE, nr.e.b);
      this.c(dfa.iF, nr.e.b);
      this.c(dfa.iG, nr.e.b);
      this.c(dfa.iH, nr.e.a);
      this.c(dfa.iI, nr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dfa.mw, dfa.mr, dfa.mm, dfa.mh, dfa.mG, dfa.mB, dfa.mQ, dfa.mL);
      this.a(dfa.mx, dfa.ms, dfa.mn, dfa.mi, dfa.mH, dfa.mC, dfa.mR, dfa.mM);
      this.a(dfa.my, dfa.mt, dfa.mo, dfa.mj, dfa.mI, dfa.mD, dfa.mS, dfa.mN);
      this.a(dfa.mz, dfa.mu, dfa.mp, dfa.mk, dfa.mJ, dfa.mE, dfa.mT, dfa.mO);
      this.a(dfa.mA, dfa.mv, dfa.mq, dfa.ml, dfa.mK, dfa.mF, dfa.mU, dfa.mP);
      this.e(dfa.fe, dfa.fc);
      this.e(dfa.fd, dfa.fb);
      this.l(dfa.ab).c(dfa.ab).a(dfa.av);
      this.l(dfa.am).c(dfa.am).a(dfa.aD);
      this.a(dfa.am, dfa.dj, dfa.ds);
      this.b(dfa.aL, ok.s);
      this.l(dfa.Y).c(dfa.Y).a(dfa.as);
      this.l(dfa.ai).c(dfa.ai).a(dfa.aA);
      this.a(dfa.ai, dfa.dd, dfa.do);
      this.a(dfa.B, dfa.fX, nr.e.b);
      this.b(dfa.aI, ok.s);
      this.l(dfa.Z).d(dfa.Z).a(dfa.at);
      this.l(dfa.aj).d(dfa.aj).a(dfa.aB);
      this.a(dfa.aj, dfa.de, dfa.dp);
      this.a(dfa.C, dfa.fY, nr.e.b);
      this.b(dfa.aJ, ok.s);
      this.l(dfa.W).c(dfa.W).a(dfa.aq);
      this.l(dfa.ag).c(dfa.ag).a(dfa.ay);
      this.a(dfa.ag, dfa.dc, dfa.dn);
      this.a(dfa.z, dfa.fV, nr.e.b);
      this.b(dfa.aG, ok.s);
      this.l(dfa.U).c(dfa.U).a(dfa.ao);
      this.l(dfa.al).c(dfa.al).a(dfa.aw);
      this.a(dfa.al, dfa.da, dfa.dl);
      this.a(dfa.x, dfa.fT, nr.e.b);
      this.b(dfa.aE, ok.s);
      this.l(dfa.V).c(dfa.V).a(dfa.ap);
      this.l(dfa.af).c(dfa.af).a(dfa.ax);
      this.a(dfa.af, dfa.db, dfa.dm);
      this.a(dfa.y, dfa.fU, nr.e.b);
      this.b(dfa.aF, ok.s);
      this.l(dfa.aa).c(dfa.aa).a(dfa.au);
      this.l(dfa.ak).c(dfa.ak).a(dfa.aC);
      this.a(dfa.ak, dfa.dg, dfa.dr);
      this.a(dfa.D, dfa.fZ, nr.e.b);
      this.b(dfa.aK, ok.s);
      this.l(dfa.X).c(dfa.X).a(dfa.ar);
      this.l(dfa.ah).c(dfa.ah).a(dfa.az);
      this.a(dfa.ah, dfa.df, dfa.dq);
      this.a(dfa.A, dfa.fW, nr.e.b);
      this.b(dfa.aH, ok.s);
      this.l(dfa.os).b(dfa.os).a(dfa.ou);
      this.l(dfa.ot).b(dfa.ot).a(dfa.ov);
      this.a(dfa.ot, dfa.dh, dfa.dt);
      this.a(dfa.ox, dfa.pm, nr.e.b);
      this.n(dfa.oD, dfa.po);
      this.l(dfa.oj).b(dfa.oj).a(dfa.ol);
      this.l(dfa.ok).b(dfa.ok).a(dfa.om);
      this.a(dfa.ok, dfa.di, dfa.du);
      this.a(dfa.oo, dfa.pn, nr.e.b);
      this.n(dfa.oq, dfa.pp);
      this.l(dfa.ae).d(dfa.ae);
      this.l(dfa.an).d(dfa.an);
      this.a(dfa.v, dfa.dk, dfa.dv);
      this.b(dfa.or, nr.e.b);
      this.a(cur.dG);
      this.i(dfa.dy);
      this.k(dfa.hY);
      this.u();
      this.n(dfa.cP);
      this.o(dfa.bp);
      this.o(dfa.bq);
      this.o(dfa.hh);
      this.t();
      this.q(dfa.fN);
      this.q(dfa.kG);
      this.q(dfa.kH);
      this.r(dfa.gS);
      this.r(dfa.gT);
      this.r(dfa.gU);
      this.o();
      this.p();
      this.d(dfa.cD, ok.h);
      this.d(dfa.nW, ok.h);
      this.d(dfa.nV, ok.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dfa.eK, dfa.eS);
      this.k(dfa.m, dfa.eO);
      this.k(dfa.eJ, dfa.eR);
      this.k(dfa.eI, dfa.eQ);
      this.az();
      this.k(dfa.eH, dfa.eP);
      this.aA();
      cvv.h().forEach($$0 -> this.a($$0, of.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dfa.hX);
      ny.a<Integer> $$0 = ny.a(dsr.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ale $$3 = oi.a(cur.hC, $$2);
         $$0.a($$1, oa.a().a(ob.c, oh.aa.a(dfa.hX, $$2, oi.h($$3), this.c)));
         oh.bx.a(of.a(cur.hC, $$2), oi.k($$3), this.c);
      }

      this.b.accept(nx.a(dfa.hX).a($$0));
   }

   private void o(dey $$0, dey $$1) {
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
                  ny.a(dsr.az, dsr.r)
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
      this.b.accept(nx.a($$1).a(a(dsr.r, $$13, $$12)));
   }

   class a {
      private final ale b;

      public a(final ale $$0, final dey $$1) {
         this.b = oh.aa.a($$0, oi.u($$1), nr.this.c);
      }

      public nr.a a(dey... $$0) {
         for (dey $$1 : $$0) {
            nr.this.b.accept(nr.c($$1, this.b));
         }

         return this;
      }

      public nr.a b(dey... $$0) {
         for (dey $$1 : $$0) {
            nr.this.c($$1);
         }

         return this.a($$0);
      }

      public nr.a a(og $$0, dey... $$1) {
         for (dey $$2 : $$1) {
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
      private final Set<dey> f = new HashSet<>();

      public b(final oi $$0) {
         this.b = $$0;
      }

      public nr.b a(dey $$0, og $$1) {
         this.e = $$1.a($$0, this.b, nr.this.c);
         if (nr.this.f.containsKey($$0)) {
            nr.this.b.accept(nr.this.f.get($$0).create($$0, this.e, this.b, nr.this.c));
         } else {
            nr.this.b.accept(nr.c($$0, this.e));
         }

         return this;
      }

      public nr.b a(dey $$0, dey $$1) {
         ale $$2 = of.a($$0);
         nr.this.b.accept(nr.c($$1, $$2));
         nr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nr.b a(dey $$0) {
         ale $$1 = oh.s.a($$0, this.b, nr.this.c);
         ale $$2 = oh.t.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.b($$0, $$1, $$2));
         ale $$3 = oh.u.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b b(dey $$0) {
         ale $$1 = oh.M.a($$0, this.b, nr.this.c);
         ale $$2 = oh.N.a($$0, this.b, nr.this.c);
         ale $$3 = oh.O.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3));
         ale $$4 = oh.P.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$4);
         return this;
      }

      public nr.b c(dey $$0) {
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

      public nr.b d(dey $$0) {
         ale $$1 = oh.J.a($$0, this.b, nr.this.c);
         ale $$2 = oh.K.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$1, $$2));
         ale $$3 = oh.L.a($$0, this.b, nr.this.c);
         nr.this.a($$0, $$3);
         return this;
      }

      public nr.b e(dey $$0) {
         oi $$1 = oi.p($$0);
         ale $$2 = oh.R.a($$0, $$1, nr.this.c);
         ale $$3 = oh.Q.a($$0, $$1, nr.this.c);
         ale $$4 = oh.T.a($$0, $$1, nr.this.c);
         ale $$5 = oh.S.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nr.b f(dey $$0) {
         ale $$1 = oh.V.a($$0, this.b, nr.this.c);
         ale $$2 = oh.U.a($$0, this.b, nr.this.c);
         ale $$3 = oh.X.a($$0, this.b, nr.this.c);
         ale $$4 = oh.W.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nr.b g(dey $$0) {
         ale $$1 = oh.Y.a($$0, this.b, nr.this.c);
         ale $$2 = oh.Z.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.e($$0, $$1, $$2));
         return this;
      }

      public nr.b h(dey $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dey $$1 = this.d.b().get(lt.b.r);
            ale $$2 = oh.aa.a($$0, this.b, nr.this.c);
            nr.this.b.accept(nr.c($$0, $$2));
            nr.this.b.accept(nr.c($$1, $$2));
            nr.this.a($$0.r());
            nr.this.c($$1);
            return this;
         }
      }

      public nr.b i(dey $$0) {
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

      public nr.b j(dey $$0) {
         ale $$1 = this.a(oh.af, $$0);
         ale $$2 = this.a(oh.ae, $$0);
         ale $$3 = this.a(oh.ag, $$0);
         nr.this.b.accept(nr.b($$0, $$1, $$2, $$3));
         nr.this.a($$0, $$2);
         return this;
      }

      private nr.b k(dey $$0) {
         ok $$1 = nr.this.g.getOrDefault($$0, ok.a.get($$0));
         ale $$2 = $$1.a($$0, nr.this.c);
         nr.this.b.accept(nr.c($$0, $$2));
         return this;
      }

      private nr.b l(dey $$0) {
         nr.this.i($$0);
         return this;
      }

      private void m(dey $$0) {
         if (nr.this.e.contains($$0)) {
            nr.this.k($$0);
         } else {
            nr.this.j($$0);
         }
      }

      private ale a(og $$0, dey $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nr.this.c));
      }

      public nr.b a(lt $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nr.b, dey> $$2 = nr.h.get($$0x);
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
      nu create(dey var1, ale var2, oi var3, BiConsumer<ale, Supplier<JsonElement>> var4);
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

      public nr.f a(dey $$0) {
         oi $$1 = this.b.c(oj.d, this.b.a(oj.i));
         ale $$2 = oh.j.a($$0, $$1, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$2));
         return this;
      }

      public nr.f b(dey $$0) {
         ale $$1 = oh.j.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1));
         return this;
      }

      public nr.f c(dey $$0) {
         ale $$1 = oh.j.a($$0, this.b, nr.this.c);
         ale $$2 = oh.k.a($$0, this.b, nr.this.c);
         nr.this.b.accept(nr.d($$0, $$1, $$2));
         return this;
      }

      public nr.f d(dey $$0) {
         nr.this.b.accept(nr.a($$0, this.b, nr.this.c));
         return this;
      }
   }
}
