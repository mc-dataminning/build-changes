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

public class nc {
   final Consumer<nf> b;
   final BiConsumer<akf, Supplier<JsonElement>> c;
   private final Consumer<cry> d;
   final List<dcv> e = ImmutableList.of(dcx.ey, dcx.eE, dcx.hY);
   final Map<dcv, nc.c> f = ImmutableMap.builder().put(dcx.b, nc::a).put(dcx.sJ, nc::c).put(dcx.eM, nc::b).build();
   final Map<dcv, nv> g = ImmutableMap.builder()
      .put(dcx.aV, nv.y.get(dcx.aV))
      .put(dcx.jp, nv.y.get(dcx.jp))
      .put(dcx.jS, nv.a(nt.a(dcx.aV, "_top")))
      .put(dcx.jU, nv.a(nt.a(dcx.jp, "_top")))
      .put(dcx.aX, nv.d.get(dcx.aV).a($$0x -> $$0x.a(nu.i, nt.G(dcx.aX))))
      .put(dcx.jr, nv.d.get(dcx.jp).a($$0x -> $$0x.a(nu.i, nt.G(dcx.jr))))
      .put(dcx.hd, nv.d.get(dcx.hd))
      .put(dcx.jT, nv.a(nt.a(dcx.hd, "_bottom")))
      .put(dcx.pr, nv.z.get(dcx.pr))
      .put(dcx.sJ, nv.z.get(dcx.sJ))
      .put(dcx.he, nv.d.get(dcx.he).a($$0x -> $$0x.a(nu.i, nt.G(dcx.he))))
      .put(dcx.aW, nv.d.get(dcx.aW).a($$0x -> {
         $$0x.a(nu.d, nt.a(dcx.aV, "_top"));
         $$0x.a(nu.i, nt.G(dcx.aW));
      }))
      .put(dcx.jq, nv.d.get(dcx.jq).a($$0x -> {
         $$0x.a(nu.d, nt.a(dcx.jp, "_top"));
         $$0x.a(nu.i, nt.G(dcx.jq));
      }))
      .put(dcx.qM, nv.z.get(dcx.qM))
      .put(dcx.qH, nv.z.get(dcx.qH))
      .build();
   static final Map<lg.b, BiConsumer<nc.b, dcv>> h = ImmutableMap.builder()
      .put(lg.b.a, nc.b::a)
      .put(lg.b.e, nc.b::l)
      .put(lg.b.b, nc.b::k)
      .put(lg.b.c, nc.b::k)
      .put(lg.b.f, nc.b::c)
      .put(lg.b.g, nc.b::d)
      .put(lg.b.h, nc.b::e)
      .put(lg.b.i, nc.b::f)
      .put(lg.b.k, nc.b::h)
      .put(lg.b.l, nc.b::i)
      .put(lg.b.m, nc.b::j)
      .put(lg.b.n, nc.b::g)
      .put(lg.b.p, nc.b::m)
      .put(lg.b.q, nc.b::b)
      .build();
   public static final List<Pair<dqp, Function<akf, nl>>> a = List.of(
      Pair.of(dqo.L, (Function<akf, nl>)$$0 -> nl.a().a(nm.c, $$0)),
      Pair.of(dqo.M, (Function<akf, nl>)$$0 -> nl.a().a(nm.c, $$0).a(nm.b, nm.a.b).a(nm.d, true)),
      Pair.of(dqo.N, (Function<akf, nl>)$$0 -> nl.a().a(nm.c, $$0).a(nm.b, nm.a.c).a(nm.d, true)),
      Pair.of(dqo.O, (Function<akf, nl>)$$0 -> nl.a().a(nm.c, $$0).a(nm.b, nm.a.d).a(nm.d, true)),
      Pair.of(dqo.J, (Function<akf, nl>)$$0 -> nl.a().a(nm.c, $$0).a(nm.a, nm.a.d).a(nm.d, true)),
      Pair.of(dqo.K, (Function<akf, nl>)$$0 -> nl.a().a(nm.c, $$0).a(nm.a, nm.a.b).a(nm.d, true))
   );
   private static final Map<nc.d, akf> i = new HashMap<>();

   private static nf a(dcv $$0, akf $$1, nt $$2, BiConsumer<akf, Supplier<JsonElement>> $$3) {
      akf $$4 = ns.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nf b(dcv $$0, akf $$1, nt $$2, BiConsumer<akf, Supplier<JsonElement>> $$3) {
      akf $$4 = ns.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nf c(dcv $$0, akf $$1, nt $$2, BiConsumer<akf, Supplier<JsonElement>> $$3) {
      akf $$4 = ns.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nc(Consumer<nf> $$0, BiConsumer<akf, Supplier<JsonElement>> $$1, Consumer<cry> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dcv $$0) {
      this.d.accept($$0.p());
   }

   void a(dcv $$0, akf $$1) {
      this.c.accept(nq.a($$0.p()), new np($$1));
   }

   private void a(cry $$0, akf $$1) {
      this.c.accept(nq.a($$0), new np($$1));
   }

   void a(cry $$0) {
      ns.bx.a(nq.a($$0), nt.b($$0), this.c);
   }

   private void d(dcv $$0) {
      cry $$1 = $$0.p();
      if ($$1 != csg.a) {
         ns.bx.a(nq.a($$1), nt.F($$0), this.c);
      }
   }

   private void a(dcv $$0, String $$1) {
      cry $$2 = $$0.p();
      ns.bx.a(nq.a($$2), nt.k(nt.a($$0, $$1)), this.c);
   }

   private static nj b() {
      return nj.a(dqo.R).a(ir.f, nl.a().a(nm.b, nm.a.b)).a(ir.d, nl.a().a(nm.b, nm.a.c)).a(ir.e, nl.a().a(nm.b, nm.a.d)).a(ir.c, nl.a());
   }

   private static nj c() {
      return nj.a(dqo.R).a(ir.d, nl.a()).a(ir.e, nl.a().a(nm.b, nm.a.b)).a(ir.c, nl.a().a(nm.b, nm.a.c)).a(ir.f, nl.a().a(nm.b, nm.a.d));
   }

   private static nj d() {
      return nj.a(dqo.R).a(ir.f, nl.a()).a(ir.d, nl.a().a(nm.b, nm.a.b)).a(ir.e, nl.a().a(nm.b, nm.a.c)).a(ir.c, nl.a().a(nm.b, nm.a.d));
   }

   private static nj e() {
      return nj.a(dqo.P)
         .a(ir.a, nl.a().a(nm.a, nm.a.b))
         .a(ir.b, nl.a().a(nm.a, nm.a.d))
         .a(ir.c, nl.a())
         .a(ir.d, nl.a().a(nm.b, nm.a.c))
         .a(ir.e, nl.a().a(nm.b, nm.a.d))
         .a(ir.f, nl.a().a(nm.b, nm.a.b));
   }

   private static ni b(dcv $$0, akf $$1) {
      return ni.a($$0, a($$1));
   }

   private static nl[] a(akf $$0) {
      return new nl[]{nl.a().a(nm.c, $$0), nl.a().a(nm.c, $$0).a(nm.b, nm.a.b), nl.a().a(nm.c, $$0).a(nm.b, nm.a.c), nl.a().a(nm.c, $$0).a(nm.b, nm.a.d)};
   }

   private static ni a(dcv $$0, akf $$1, akf $$2) {
      return ni.a($$0, nl.a().a(nm.c, $$1), nl.a().a(nm.c, $$2), nl.a().a(nm.c, $$1).a(nm.b, nm.a.c), nl.a().a(nm.c, $$2).a(nm.b, nm.a.c));
   }

   private static nj a(dqp $$0, akf $$1, akf $$2) {
      return nj.a($$0).a(true, nl.a().a(nm.c, $$1)).a(false, nl.a().a(nm.c, $$2));
   }

   private void e(dcv $$0) {
      akf $$1 = nv.a.create($$0, this.c);
      akf $$2 = nv.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dcv $$0) {
      akf $$1 = nv.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dcv $$0) {
      this.b.accept(ni.a($$0).a(nj.a(dqo.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akf $$3 = nt.a($$0, $$2);
         return nl.a().a(nm.c, ns.c.a($$0, $$2, new nt().a(nu.a, $$3), this.c));
      })));
      this.a($$0, nt.a($$0, "_0"));
   }

   static nf b(dcv $$0, akf $$1, akf $$2) {
      return ni.a($$0)
         .a(nj.a(dqo.w).a(false, nl.a().a(nm.c, $$1)).a(true, nl.a().a(nm.c, $$2)))
         .a(
            nj.a(dqo.U, dqo.R)
               .a(dqj.a, ir.f, nl.a().a(nm.b, nm.a.b))
               .a(dqj.a, ir.e, nl.a().a(nm.b, nm.a.d))
               .a(dqj.a, ir.d, nl.a().a(nm.b, nm.a.c))
               .a(dqj.a, ir.c, nl.a())
               .a(dqj.b, ir.f, nl.a().a(nm.b, nm.a.b).a(nm.a, nm.a.b).a(nm.d, true))
               .a(dqj.b, ir.e, nl.a().a(nm.b, nm.a.d).a(nm.a, nm.a.b).a(nm.d, true))
               .a(dqj.b, ir.d, nl.a().a(nm.b, nm.a.c).a(nm.a, nm.a.b).a(nm.d, true))
               .a(dqj.b, ir.c, nl.a().a(nm.a, nm.a.b).a(nm.d, true))
               .a(dqj.c, ir.f, nl.a().a(nm.b, nm.a.d).a(nm.a, nm.a.c))
               .a(dqj.c, ir.e, nl.a().a(nm.b, nm.a.b).a(nm.a, nm.a.c))
               .a(dqj.c, ir.d, nl.a().a(nm.a, nm.a.c))
               .a(dqj.c, ir.c, nl.a().a(nm.b, nm.a.c).a(nm.a, nm.a.c))
         );
   }

   private static nj.d<ir, dqu, dqt, Boolean> a(nj.d<ir, dqu, dqt, Boolean> $$0, dqu $$1, akf $$2, akf $$3, akf $$4, akf $$5) {
      return $$0.a(ir.f, $$1, dqt.a, false, nl.a().a(nm.c, $$2))
         .a(ir.d, $$1, dqt.a, false, nl.a().a(nm.c, $$2).a(nm.b, nm.a.b))
         .a(ir.e, $$1, dqt.a, false, nl.a().a(nm.c, $$2).a(nm.b, nm.a.c))
         .a(ir.c, $$1, dqt.a, false, nl.a().a(nm.c, $$2).a(nm.b, nm.a.d))
         .a(ir.f, $$1, dqt.b, false, nl.a().a(nm.c, $$4))
         .a(ir.d, $$1, dqt.b, false, nl.a().a(nm.c, $$4).a(nm.b, nm.a.b))
         .a(ir.e, $$1, dqt.b, false, nl.a().a(nm.c, $$4).a(nm.b, nm.a.c))
         .a(ir.c, $$1, dqt.b, false, nl.a().a(nm.c, $$4).a(nm.b, nm.a.d))
         .a(ir.f, $$1, dqt.a, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.b))
         .a(ir.d, $$1, dqt.a, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.c))
         .a(ir.e, $$1, dqt.a, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.d))
         .a(ir.c, $$1, dqt.a, true, nl.a().a(nm.c, $$3))
         .a(ir.f, $$1, dqt.b, true, nl.a().a(nm.c, $$5).a(nm.b, nm.a.d))
         .a(ir.d, $$1, dqt.b, true, nl.a().a(nm.c, $$5))
         .a(ir.e, $$1, dqt.b, true, nl.a().a(nm.c, $$5).a(nm.b, nm.a.b))
         .a(ir.c, $$1, dqt.b, true, nl.a().a(nm.c, $$5).a(nm.b, nm.a.c));
   }

   private static nf a(dcv $$0, akf $$1, akf $$2, akf $$3, akf $$4, akf $$5, akf $$6, akf $$7, akf $$8) {
      return ni.a($$0).a(a(a(nj.a(dqo.R, dqo.ae, dqo.be, dqo.u), dqu.b, $$1, $$2, $$3, $$4), dqu.a, $$5, $$6, $$7, $$8));
   }

   static nf a(dcv $$0, akf $$1, akf $$2, akf $$3, akf $$4, akf $$5) {
      return nh.a($$0)
         .a(nl.a().a(nm.c, $$1))
         .a(ng.a().a(dqo.L, true), nl.a().a(nm.c, $$2).a(nm.d, false))
         .a(ng.a().a(dqo.M, true), nl.a().a(nm.c, $$3).a(nm.d, false))
         .a(ng.a().a(dqo.N, true), nl.a().a(nm.c, $$4).a(nm.d, false))
         .a(ng.a().a(dqo.O, true), nl.a().a(nm.c, $$5).a(nm.d, false));
   }

   static nf c(dcv $$0, akf $$1, akf $$2) {
      return nh.a($$0)
         .a(nl.a().a(nm.c, $$1))
         .a(ng.a().a(dqo.L, true), nl.a().a(nm.c, $$2).a(nm.d, true))
         .a(ng.a().a(dqo.M, true), nl.a().a(nm.c, $$2).a(nm.b, nm.a.b).a(nm.d, true))
         .a(ng.a().a(dqo.N, true), nl.a().a(nm.c, $$2).a(nm.b, nm.a.c).a(nm.d, true))
         .a(ng.a().a(dqo.O, true), nl.a().a(nm.c, $$2).a(nm.b, nm.a.d).a(nm.d, true));
   }

   static nf a(dcv $$0, akf $$1, akf $$2, akf $$3) {
      return nh.a($$0)
         .a(ng.a().a(dqo.J, true), nl.a().a(nm.c, $$1))
         .a(ng.a().a(dqo.X, drk.b), nl.a().a(nm.c, $$2).a(nm.d, true))
         .a(ng.a().a(dqo.W, drk.b), nl.a().a(nm.c, $$2).a(nm.b, nm.a.b).a(nm.d, true))
         .a(ng.a().a(dqo.Y, drk.b), nl.a().a(nm.c, $$2).a(nm.b, nm.a.c).a(nm.d, true))
         .a(ng.a().a(dqo.Z, drk.b), nl.a().a(nm.c, $$2).a(nm.b, nm.a.d).a(nm.d, true))
         .a(ng.a().a(dqo.X, drk.c), nl.a().a(nm.c, $$3).a(nm.d, true))
         .a(ng.a().a(dqo.W, drk.c), nl.a().a(nm.c, $$3).a(nm.b, nm.a.b).a(nm.d, true))
         .a(ng.a().a(dqo.Y, drk.c), nl.a().a(nm.c, $$3).a(nm.b, nm.a.c).a(nm.d, true))
         .a(ng.a().a(dqo.Z, drk.c), nl.a().a(nm.c, $$3).a(nm.b, nm.a.d).a(nm.d, true));
   }

   static nf a(dcv $$0, akf $$1, akf $$2, akf $$3, akf $$4, boolean $$5) {
      return ni.a($$0, nl.a().a(nm.d, $$5))
         .a(c())
         .a(
            nj.a(dqo.q, dqo.u)
               .a(false, false, nl.a().a(nm.c, $$2))
               .a(true, false, nl.a().a(nm.c, $$4))
               .a(false, true, nl.a().a(nm.c, $$1))
               .a(true, true, nl.a().a(nm.c, $$3))
         );
   }

   static nf b(dcv $$0, akf $$1, akf $$2, akf $$3) {
      return ni.a($$0)
         .a(
            nj.a(dqo.R, dqo.af, dqo.bi)
               .a(ir.f, dqx.b, drh.a, nl.a().a(nm.c, $$2))
               .a(ir.e, dqx.b, drh.a, nl.a().a(nm.c, $$2).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.d, dqx.b, drh.a, nl.a().a(nm.c, $$2).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.c, dqx.b, drh.a, nl.a().a(nm.c, $$2).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ir.f, dqx.b, drh.e, nl.a().a(nm.c, $$3))
               .a(ir.e, dqx.b, drh.e, nl.a().a(nm.c, $$3).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.d, dqx.b, drh.e, nl.a().a(nm.c, $$3).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.c, dqx.b, drh.e, nl.a().a(nm.c, $$3).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ir.f, dqx.b, drh.d, nl.a().a(nm.c, $$3).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ir.e, dqx.b, drh.d, nl.a().a(nm.c, $$3).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.d, dqx.b, drh.d, nl.a().a(nm.c, $$3))
               .a(ir.c, dqx.b, drh.d, nl.a().a(nm.c, $$3).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.f, dqx.b, drh.c, nl.a().a(nm.c, $$1))
               .a(ir.e, dqx.b, drh.c, nl.a().a(nm.c, $$1).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.d, dqx.b, drh.c, nl.a().a(nm.c, $$1).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.c, dqx.b, drh.c, nl.a().a(nm.c, $$1).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ir.f, dqx.b, drh.b, nl.a().a(nm.c, $$1).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ir.e, dqx.b, drh.b, nl.a().a(nm.c, $$1).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.d, dqx.b, drh.b, nl.a().a(nm.c, $$1))
               .a(ir.c, dqx.b, drh.b, nl.a().a(nm.c, $$1).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.f, dqx.a, drh.a, nl.a().a(nm.c, $$2).a(nm.a, nm.a.c).a(nm.d, true))
               .a(ir.e, dqx.a, drh.a, nl.a().a(nm.c, $$2).a(nm.a, nm.a.c).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.d, dqx.a, drh.a, nl.a().a(nm.c, $$2).a(nm.a, nm.a.c).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.c, dqx.a, drh.a, nl.a().a(nm.c, $$2).a(nm.a, nm.a.c).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ir.f, dqx.a, drh.e, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.e, dqx.a, drh.e, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ir.d, dqx.a, drh.e, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.c, dqx.a, drh.e, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.d, true))
               .a(ir.f, dqx.a, drh.d, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.d, true))
               .a(ir.e, dqx.a, drh.d, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.d, dqx.a, drh.d, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.c, dqx.a, drh.d, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ir.f, dqx.a, drh.c, nl.a().a(nm.c, $$1).a(nm.a, nm.a.c).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.e, dqx.a, drh.c, nl.a().a(nm.c, $$1).a(nm.a, nm.a.c).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ir.d, dqx.a, drh.c, nl.a().a(nm.c, $$1).a(nm.a, nm.a.c).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.c, dqx.a, drh.c, nl.a().a(nm.c, $$1).a(nm.a, nm.a.c).a(nm.d, true))
               .a(ir.f, dqx.a, drh.b, nl.a().a(nm.c, $$1).a(nm.a, nm.a.c).a(nm.d, true))
               .a(ir.e, dqx.a, drh.b, nl.a().a(nm.c, $$1).a(nm.a, nm.a.c).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ir.d, dqx.a, drh.b, nl.a().a(nm.c, $$1).a(nm.a, nm.a.c).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ir.c, dqx.a, drh.b, nl.a().a(nm.c, $$1).a(nm.a, nm.a.c).a(nm.b, nm.a.d).a(nm.d, true))
         );
   }

   private static nf c(dcv $$0, akf $$1, akf $$2, akf $$3) {
      return ni.a($$0)
         .a(
            nj.a(dqo.R, dqo.af, dqo.u)
               .a(ir.c, dqx.b, false, nl.a().a(nm.c, $$2))
               .a(ir.d, dqx.b, false, nl.a().a(nm.c, $$2).a(nm.b, nm.a.c))
               .a(ir.f, dqx.b, false, nl.a().a(nm.c, $$2).a(nm.b, nm.a.b))
               .a(ir.e, dqx.b, false, nl.a().a(nm.c, $$2).a(nm.b, nm.a.d))
               .a(ir.c, dqx.a, false, nl.a().a(nm.c, $$1))
               .a(ir.d, dqx.a, false, nl.a().a(nm.c, $$1).a(nm.b, nm.a.c))
               .a(ir.f, dqx.a, false, nl.a().a(nm.c, $$1).a(nm.b, nm.a.b))
               .a(ir.e, dqx.a, false, nl.a().a(nm.c, $$1).a(nm.b, nm.a.d))
               .a(ir.c, dqx.b, true, nl.a().a(nm.c, $$3))
               .a(ir.d, dqx.b, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.c))
               .a(ir.f, dqx.b, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.b))
               .a(ir.e, dqx.b, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.d))
               .a(ir.c, dqx.a, true, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.c))
               .a(ir.d, dqx.a, true, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.a))
               .a(ir.f, dqx.a, true, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.d))
               .a(ir.e, dqx.a, true, nl.a().a(nm.c, $$3).a(nm.a, nm.a.c).a(nm.b, nm.a.b))
         );
   }

   private static nf d(dcv $$0, akf $$1, akf $$2, akf $$3) {
      return ni.a($$0)
         .a(
            nj.a(dqo.R, dqo.af, dqo.u)
               .a(ir.c, dqx.b, false, nl.a().a(nm.c, $$2))
               .a(ir.d, dqx.b, false, nl.a().a(nm.c, $$2))
               .a(ir.f, dqx.b, false, nl.a().a(nm.c, $$2))
               .a(ir.e, dqx.b, false, nl.a().a(nm.c, $$2))
               .a(ir.c, dqx.a, false, nl.a().a(nm.c, $$1))
               .a(ir.d, dqx.a, false, nl.a().a(nm.c, $$1))
               .a(ir.f, dqx.a, false, nl.a().a(nm.c, $$1))
               .a(ir.e, dqx.a, false, nl.a().a(nm.c, $$1))
               .a(ir.c, dqx.b, true, nl.a().a(nm.c, $$3))
               .a(ir.d, dqx.b, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.c))
               .a(ir.f, dqx.b, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.b))
               .a(ir.e, dqx.b, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.d))
               .a(ir.c, dqx.a, true, nl.a().a(nm.c, $$3))
               .a(ir.d, dqx.a, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.c))
               .a(ir.f, dqx.a, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.b))
               .a(ir.e, dqx.a, true, nl.a().a(nm.c, $$3).a(nm.b, nm.a.d))
         );
   }

   static ni c(dcv $$0, akf $$1) {
      return ni.a($$0, nl.a().a(nm.c, $$1));
   }

   private static nj f() {
      return nj.a(dqo.I).a(ir.a.b, nl.a()).a(ir.a.c, nl.a().a(nm.a, nm.a.b)).a(ir.a.a, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.b));
   }

   static nf a(dcv $$0, nt $$1, BiConsumer<akf, Supplier<JsonElement>> $$2) {
      akf $$3 = ns.g.a($$0, $$1, $$2);
      akf $$4 = ns.h.a($$0, $$1, $$2);
      akf $$5 = ns.i.a($$0, $$1, $$2);
      akf $$6 = ns.j.a($$0, $$1, $$2);
      return ni.a($$0, nl.a().a(nm.c, $$6)).a(nj.a(dqo.I).a(ir.a.a, nl.a().a(nm.c, $$3)).a(ir.a.b, nl.a().a(nm.c, $$4)).a(ir.a.c, nl.a().a(nm.c, $$5)));
   }

   static nf d(dcv $$0, akf $$1) {
      return ni.a($$0, nl.a().a(nm.c, $$1)).a(f());
   }

   private void e(dcv $$0, akf $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dcv $$0, nv.a $$1) {
      akf $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dcv $$0, nv.a $$1) {
      akf $$2 = $$1.create($$0, this.c);
      this.b.accept(ni.a($$0, nl.a().a(nm.c, $$2)).a(b()));
   }

   static nf d(dcv $$0, akf $$1, akf $$2) {
      return ni.a($$0)
         .a(
            nj.a(dqo.I)
               .a(ir.a.b, nl.a().a(nm.c, $$1))
               .a(ir.a.c, nl.a().a(nm.c, $$2).a(nm.a, nm.a.b))
               .a(ir.a.a, nl.a().a(nm.c, $$2).a(nm.a, nm.a.b).a(nm.b, nm.a.b))
         );
   }

   private void a(dcv $$0, nv.a $$1, nv.a $$2) {
      akf $$3 = $$1.create($$0, this.c);
      akf $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akf a(dcv $$0, String $$1, nr $$2, Function<akf, nt> $$3) {
      return $$2.a($$0, $$1, $$3.apply(nt.a($$0, $$1)), this.c);
   }

   static nf e(dcv $$0, akf $$1, akf $$2) {
      return ni.a($$0).a(a(dqo.w, $$2, $$1));
   }

   static nf e(dcv $$0, akf $$1, akf $$2, akf $$3) {
      return ni.a($$0).a(nj.a(dqo.bh).a(drg.b, nl.a().a(nm.c, $$1)).a(drg.a, nl.a().a(nm.c, $$2)).a(drg.c, nl.a().a(nm.c, $$3)));
   }

   public void a(dcv $$0) {
      this.b($$0, nv.a);
   }

   public void b(dcv $$0, nv.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dcv $$0, nt $$1, nr $$2) {
      akf $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nc.b h(dcv $$0) {
      nv $$1 = this.g.getOrDefault($$0, nv.a.get($$0));
      return new nc.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dcv $$0, dcv $$1, dcv $$2) {
      nt $$3 = nt.u($$0);
      akf $$4 = ns.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.p());
      this.c($$2);
   }

   void i(dcv $$0) {
      nt $$1 = nt.t($$0);
      akf $$2 = ns.v.a($$0, $$1, this.c);
      akf $$3 = ns.w.a($$0, $$1, this.c);
      akf $$4 = ns.x.a($$0, $$1, this.c);
      akf $$5 = ns.y.a($$0, $$1, this.c);
      akf $$6 = ns.z.a($$0, $$1, this.c);
      akf $$7 = ns.A.a($$0, $$1, this.c);
      akf $$8 = ns.B.a($$0, $$1, this.c);
      akf $$9 = ns.C.a($$0, $$1, this.c);
      this.a($$0.p());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dcv $$0, dcv $$1) {
      akf $$2 = ns.v.a($$0);
      akf $$3 = ns.w.a($$0);
      akf $$4 = ns.x.a($$0);
      akf $$5 = ns.y.a($$0);
      akf $$6 = ns.z.a($$0);
      akf $$7 = ns.A.a($$0);
      akf $$8 = ns.B.a($$0);
      akf $$9 = ns.C.a($$0);
      this.a($$1, nq.a($$0.p()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dcv $$0) {
      nt $$1 = nt.b($$0);
      akf $$2 = ns.ak.a($$0, $$1, this.c);
      akf $$3 = ns.al.a($$0, $$1, this.c);
      akf $$4 = ns.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dcv $$0) {
      nt $$1 = nt.b($$0);
      akf $$2 = ns.ah.a($$0, $$1, this.c);
      akf $$3 = ns.ai.a($$0, $$1, this.c);
      akf $$4 = ns.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dcv $$0, dcv $$1) {
      akf $$2 = ns.ah.a($$0);
      akf $$3 = ns.ai.a($$0);
      akf $$4 = ns.aj.a($$0);
      this.a($$1, nq.a($$0.p()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dcx.sD);
      akf $$0 = nq.a(dcx.sD);
      akf $$1 = nq.a(dcx.sD, "_partial_tilt");
      akf $$2 = nq.a(dcx.sD, "_full_tilt");
      this.b
         .accept(
            ni.a(dcx.sD)
               .a(b())
               .a(nj.a(dqo.bl).a(drj.a, nl.a().a(nm.c, $$0)).a(drj.b, nl.a().a(nm.c, $$0)).a(drj.c, nl.a().a(nm.c, $$1)).a(drj.d, nl.a().a(nm.c, $$2)))
         );
   }

   private nc.f l(dcv $$0) {
      return new nc.f(nt.n($$0));
   }

   private void m(dcv $$0) {
      this.c($$0, $$0);
   }

   private void c(dcv $$0, dcv $$1) {
      this.b.accept(c($$0, nq.a($$1)));
   }

   private void a(dcv $$0, nc.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dcv $$0, nc.e $$1, nt $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dcv $$0, nc.e $$1) {
      nt $$2 = nt.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dcv $$0, nc.e $$1, nt $$2) {
      akf $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dcv $$0, nc.e $$1, drb<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         nj $$4 = nj.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            nt $$5 = nt.c(nt.a($$0, $$4x));
            akf $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return nl.a().a(nm.c, $$6);
         });
         this.a($$0.p());
         this.b.accept(ni.a($$0).a($$4));
      }
   }

   private void a(dcv $$0, dcv $$1, nc.e $$2) {
      this.a($$0, $$2);
      nt $$3 = nt.d($$0);
      akf $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dcv $$0, dcv $$1) {
      nv $$2 = nv.p.get($$0);
      akf $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akf $$4 = ns.aC.a($$1, $$2.b(), this.c);
      this.b.accept(ni.a($$1, nl.a().a(nm.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dcv $$0, dcv $$1) {
      this.a($$0.p());
      nt $$2 = nt.h($$0);
      nt $$3 = nt.a($$0, $$1);
      akf $$4 = ns.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            ni.a($$1, nl.a().a(nm.c, $$4))
               .a(nj.a(dqo.R).a(ir.e, nl.a()).a(ir.d, nl.a().a(nm.b, nm.a.d)).a(ir.c, nl.a().a(nm.b, nm.a.b)).a(ir.f, nl.a().a(nm.b, nm.a.c)))
         );
      this.b.accept(ni.a($$0).a(nj.a(dqo.av).a($$2x -> nl.a().a(nm.c, ns.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dcv $$0 = dcx.kC;
      this.a($$0.p());
      akf $$1 = nq.a($$0, "_top");
      akf $$2 = nq.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dcv $$0 = dcx.kB;
      this.a($$0.p());
      nj $$1 = nj.a(dik.d, dqo.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> nl.a().a(nm.c, nq.a($$0, "_top_stage_" + $$1x));
            case b -> nl.a().a(nm.c, nq.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(ni.a($$0).a($$1));
   }

   private void a(dcv $$0, dcv $$1, dcv $$2, dcv $$3, dcv $$4, dcv $$5, dcv $$6, dcv $$7) {
      this.a($$0, nc.e.b);
      this.a($$1, nc.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dcv $$0, nc.e $$1) {
      this.a($$0, "_top");
      akf $$2 = this.a($$0, "_top", $$1.a(), nt::c);
      akf $$3 = this.a($$0, "_bottom", $$1.a(), nt::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dcx.iD, "_front");
      akf $$0 = nq.a(dcx.iD, "_top");
      akf $$1 = this.a(dcx.iD, "_bottom", nc.e.b.a(), nt::c);
      this.f(dcx.iD, $$0, $$1);
   }

   private void k() {
      akf $$0 = this.a(dcx.bx, "_top", ns.bk, nt::a);
      akf $$1 = this.a(dcx.bx, "_bottom", ns.bk, nt::a);
      this.f(dcx.bx, $$0, $$1);
   }

   private void l() {
      this.c(dcx.sF);
      akf $$0 = nq.a(dcx.sF, "_top");
      akf $$1 = nq.a(dcx.sF, "_bottom");
      this.b.accept(ni.a(dcx.sF).a(b()).a(nj.a(dqo.ae).a(dqu.b, nl.a().a(nm.c, $$1)).a(dqu.a, nl.a().a(nm.c, $$0))));
   }

   private void f(dcv $$0, akf $$1, akf $$2) {
      this.b.accept(ni.a($$0).a(nj.a(dqo.ae).a(dqu.b, nl.a().a(nm.c, $$2)).a(dqu.a, nl.a().a(nm.c, $$1))));
   }

   private void n(dcv $$0) {
      nt $$1 = nt.e($$0);
      nt $$2 = nt.e(nt.a($$0, "_corner"));
      akf $$3 = ns.as.a($$0, $$1, this.c);
      akf $$4 = ns.at.a($$0, $$2, this.c);
      akf $$5 = ns.au.a($$0, $$1, this.c);
      akf $$6 = ns.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            ni.a($$0)
               .a(
                  nj.a(dqo.ag)
                     .a(drc.a, nl.a().a(nm.c, $$3))
                     .a(drc.b, nl.a().a(nm.c, $$3).a(nm.b, nm.a.b))
                     .a(drc.c, nl.a().a(nm.c, $$5).a(nm.b, nm.a.b))
                     .a(drc.d, nl.a().a(nm.c, $$6).a(nm.b, nm.a.b))
                     .a(drc.e, nl.a().a(nm.c, $$5))
                     .a(drc.f, nl.a().a(nm.c, $$6))
                     .a(drc.g, nl.a().a(nm.c, $$4))
                     .a(drc.h, nl.a().a(nm.c, $$4).a(nm.b, nm.a.b))
                     .a(drc.i, nl.a().a(nm.c, $$4).a(nm.b, nm.a.c))
                     .a(drc.j, nl.a().a(nm.c, $$4).a(nm.b, nm.a.d))
               )
         );
   }

   private void o(dcv $$0) {
      akf $$1 = this.a($$0, "", ns.as, nt::e);
      akf $$2 = this.a($$0, "", ns.au, nt::e);
      akf $$3 = this.a($$0, "", ns.av, nt::e);
      akf $$4 = this.a($$0, "_on", ns.as, nt::e);
      akf $$5 = this.a($$0, "_on", ns.au, nt::e);
      akf $$6 = this.a($$0, "_on", ns.av, nt::e);
      nj $$7 = nj.a(dqo.w, dqo.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return nl.a().a(nm.c, $$6x ? $$4 : $$1);
            case b:
               return nl.a().a(nm.c, $$6x ? $$4 : $$1).a(nm.b, nm.a.b);
            case c:
               return nl.a().a(nm.c, $$6x ? $$5 : $$2).a(nm.b, nm.a.b);
            case d:
               return nl.a().a(nm.c, $$6x ? $$6 : $$3).a(nm.b, nm.a.b);
            case e:
               return nl.a().a(nm.c, $$6x ? $$5 : $$2);
            case f:
               return nl.a().a(nm.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(ni.a($$0).a($$7));
   }

   private nc.a a(akf $$0, dcv $$1) {
      return new nc.a($$0, $$1);
   }

   private nc.a f(dcv $$0, dcv $$1) {
      return new nc.a(nq.a($$0), $$1);
   }

   private void a(dcv $$0, cry $$1) {
      akf $$2 = ns.aa.a($$0, nt.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dcv $$0, akf $$1) {
      akf $$2 = ns.aa.a($$0, nt.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dcv $$0, dcv $$1) {
      this.a($$0);
      akf $$2 = nv.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dcv $$0) {
      this.a($$0.p());
      akf $$1 = nv.k.create($$0, this.c);
      akf $$2 = nv.l.create($$0, this.c);
      akf $$3 = nv.m.create($$0, this.c);
      akf $$4 = nv.n.create($$0, this.c);
      this.b
         .accept(
            nh.a($$0)
               .a(ng.a().a(dqo.S, 1, 2, 3, 4).a(dqo.R, ir.c), nl.a().a(nm.c, $$1))
               .a(ng.a().a(dqo.S, 1, 2, 3, 4).a(dqo.R, ir.f), nl.a().a(nm.c, $$1).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.S, 1, 2, 3, 4).a(dqo.R, ir.d), nl.a().a(nm.c, $$1).a(nm.b, nm.a.c))
               .a(ng.a().a(dqo.S, 1, 2, 3, 4).a(dqo.R, ir.e), nl.a().a(nm.c, $$1).a(nm.b, nm.a.d))
               .a(ng.a().a(dqo.S, 2, 3, 4).a(dqo.R, ir.c), nl.a().a(nm.c, $$2))
               .a(ng.a().a(dqo.S, 2, 3, 4).a(dqo.R, ir.f), nl.a().a(nm.c, $$2).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.S, 2, 3, 4).a(dqo.R, ir.d), nl.a().a(nm.c, $$2).a(nm.b, nm.a.c))
               .a(ng.a().a(dqo.S, 2, 3, 4).a(dqo.R, ir.e), nl.a().a(nm.c, $$2).a(nm.b, nm.a.d))
               .a(ng.a().a(dqo.S, 3, 4).a(dqo.R, ir.c), nl.a().a(nm.c, $$3))
               .a(ng.a().a(dqo.S, 3, 4).a(dqo.R, ir.f), nl.a().a(nm.c, $$3).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.S, 3, 4).a(dqo.R, ir.d), nl.a().a(nm.c, $$3).a(nm.b, nm.a.c))
               .a(ng.a().a(dqo.S, 3, 4).a(dqo.R, ir.e), nl.a().a(nm.c, $$3).a(nm.b, nm.a.d))
               .a(ng.a().a(dqo.S, 4).a(dqo.R, ir.c), nl.a().a(nm.c, $$4))
               .a(ng.a().a(dqo.S, 4).a(dqo.R, ir.f), nl.a().a(nm.c, $$4).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.S, 4).a(dqo.R, ir.d), nl.a().a(nm.c, $$4).a(nm.b, nm.a.c))
               .a(ng.a().a(dqo.S, 4).a(dqo.R, ir.e), nl.a().a(nm.c, $$4).a(nm.b, nm.a.d))
         );
   }

   private void a(nv.a $$0, dcv... $$1) {
      for (dcv $$2 : $$1) {
         akf $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(nv.a $$0, dcv... $$1) {
      for (dcv $$2 : $$1) {
         akf $$3 = $$0.create($$2, this.c);
         this.b.accept(ni.a($$2, nl.a().a(nm.c, $$3)).a(c()));
      }
   }

   private void h(dcv $$0, dcv $$1) {
      this.a($$0);
      nt $$2 = nt.b($$0, $$1);
      akf $$3 = ns.aI.a($$1, $$2, this.c);
      akf $$4 = ns.aJ.a($$1, $$2, this.c);
      akf $$5 = ns.aK.a($$1, $$2, this.c);
      akf $$6 = ns.aG.a($$1, $$2, this.c);
      akf $$7 = ns.aH.a($$1, $$2, this.c);
      cry $$8 = $$1.p();
      ns.bx.a(nq.a($$8), nt.F($$0), this.c);
      this.b
         .accept(
            nh.a($$1)
               .a(nl.a().a(nm.c, $$3))
               .a(ng.a().a(dqo.L, true), nl.a().a(nm.c, $$4))
               .a(ng.a().a(dqo.M, true), nl.a().a(nm.c, $$4).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.N, true), nl.a().a(nm.c, $$5))
               .a(ng.a().a(dqo.O, true), nl.a().a(nm.c, $$5).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.L, false), nl.a().a(nm.c, $$6))
               .a(ng.a().a(dqo.M, false), nl.a().a(nm.c, $$7))
               .a(ng.a().a(dqo.N, false), nl.a().a(nm.c, $$7).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.O, false), nl.a().a(nm.c, $$6).a(nm.b, nm.a.d))
         );
   }

   private void q(dcv $$0) {
      nt $$1 = nt.z($$0);
      akf $$2 = ns.aL.a($$0, $$1, this.c);
      akf $$3 = this.a($$0, "_conditional", ns.aL, $$1x -> $$1.c(nu.i, $$1x));
      this.b.accept(ni.a($$0).a(a(dqo.c, $$3, $$2)).a(e()));
   }

   private void r(dcv $$0) {
      akf $$1 = nv.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<nl> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> nl.a().a(nm.c, nq.a(dcx.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dcx.mZ);
      this.b
         .accept(
            nh.a(dcx.mZ)
               .a(ng.a().a(dqo.aq, 0), this.a(0))
               .a(ng.a().a(dqo.aq, 1), this.a(1))
               .a(ng.a().a(dqo.bk, dqk.b), nl.a().a(nm.c, nq.a(dcx.mZ, "_small_leaves")))
               .a(ng.a().a(dqo.bk, dqk.c), nl.a().a(nm.c, nq.a(dcx.mZ, "_large_leaves")))
         );
   }

   private nj n() {
      return nj.a(dqo.P)
         .a(ir.a, nl.a().a(nm.a, nm.a.c))
         .a(ir.b, nl.a())
         .a(ir.c, nl.a().a(nm.a, nm.a.b))
         .a(ir.d, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.c))
         .a(ir.e, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.d))
         .a(ir.f, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.b));
   }

   private void o() {
      akf $$0 = nt.a(dcx.nU, "_top_open");
      this.b
         .accept(
            ni.a(dcx.nU)
               .a(this.n())
               .a(
                  nj.a(dqo.u)
                     .a(false, nl.a().a(nm.c, nv.f.create(dcx.nU, this.c)))
                     .a(true, nl.a().a(nm.c, nv.f.get(dcx.nU).a($$1 -> $$1.a(nu.f, $$0)).a(dcx.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nj a(drb<T> $$0, T $$1, akf $$2, akf $$3) {
      nl $$4 = nl.a().a(nm.c, $$2);
      nl $$5 = nl.a().a(nm.c, $$3);
      return nj.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dcv $$0, Function<dcv, nt> $$1) {
      nt $$2 = $$1.apply($$0).b(nu.i, nu.c);
      nt $$3 = $$2.c(nu.g, nt.a($$0, "_front_honey"));
      akf $$4 = ns.q.a($$0, $$2, this.c);
      akf $$5 = ns.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(ni.a($$0).a(b()).a(a(dqo.aN, 5, $$5, $$4)));
   }

   private void a(dcv $$0, drb<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akf> $$3 = new Int2ObjectOpenHashMap();
         nj $$4 = nj.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akf $$5 = (akf)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, ns.aV, nt::g));
            return nl.a().a(nm.c, $$5);
         });
         this.a($$0.p());
         this.b.accept(ni.a($$0).a($$4));
      }
   }

   private void p() {
      akf $$0 = nq.a(dcx.od, "_floor");
      akf $$1 = nq.a(dcx.od, "_ceiling");
      akf $$2 = nq.a(dcx.od, "_wall");
      akf $$3 = nq.a(dcx.od, "_between_walls");
      this.a(csg.wo);
      this.b
         .accept(
            ni.a(dcx.od)
               .a(
                  nj.a(dqo.R, dqo.V)
                     .a(ir.c, dqm.a, nl.a().a(nm.c, $$0))
                     .a(ir.d, dqm.a, nl.a().a(nm.c, $$0).a(nm.b, nm.a.c))
                     .a(ir.f, dqm.a, nl.a().a(nm.c, $$0).a(nm.b, nm.a.b))
                     .a(ir.e, dqm.a, nl.a().a(nm.c, $$0).a(nm.b, nm.a.d))
                     .a(ir.c, dqm.b, nl.a().a(nm.c, $$1))
                     .a(ir.d, dqm.b, nl.a().a(nm.c, $$1).a(nm.b, nm.a.c))
                     .a(ir.f, dqm.b, nl.a().a(nm.c, $$1).a(nm.b, nm.a.b))
                     .a(ir.e, dqm.b, nl.a().a(nm.c, $$1).a(nm.b, nm.a.d))
                     .a(ir.c, dqm.c, nl.a().a(nm.c, $$2).a(nm.b, nm.a.d))
                     .a(ir.d, dqm.c, nl.a().a(nm.c, $$2).a(nm.b, nm.a.b))
                     .a(ir.f, dqm.c, nl.a().a(nm.c, $$2))
                     .a(ir.e, dqm.c, nl.a().a(nm.c, $$2).a(nm.b, nm.a.c))
                     .a(ir.d, dqm.d, nl.a().a(nm.c, $$3).a(nm.b, nm.a.b))
                     .a(ir.c, dqm.d, nl.a().a(nm.c, $$3).a(nm.b, nm.a.d))
                     .a(ir.f, dqm.d, nl.a().a(nm.c, $$3))
                     .a(ir.e, dqm.d, nl.a().a(nm.c, $$3).a(nm.b, nm.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            ni.a(dcx.nZ, nl.a().a(nm.c, nq.a(dcx.nZ)))
               .a(
                  nj.a(dqo.U, dqo.R)
                     .a(dqj.a, ir.c, nl.a())
                     .a(dqj.a, ir.f, nl.a().a(nm.b, nm.a.b))
                     .a(dqj.a, ir.d, nl.a().a(nm.b, nm.a.c))
                     .a(dqj.a, ir.e, nl.a().a(nm.b, nm.a.d))
                     .a(dqj.b, ir.c, nl.a().a(nm.a, nm.a.b))
                     .a(dqj.b, ir.f, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.b))
                     .a(dqj.b, ir.d, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.c))
                     .a(dqj.b, ir.e, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.d))
                     .a(dqj.c, ir.d, nl.a().a(nm.a, nm.a.c))
                     .a(dqj.c, ir.e, nl.a().a(nm.a, nm.a.c).a(nm.b, nm.a.b))
                     .a(dqj.c, ir.c, nl.a().a(nm.a, nm.a.c).a(nm.b, nm.a.c))
                     .a(dqj.c, ir.f, nl.a().a(nm.a, nm.a.c).a(nm.b, nm.a.d))
               )
         );
   }

   private void d(dcv $$0, nv.a $$1) {
      akf $$2 = $$1.create($$0, this.c);
      akf $$3 = nt.a($$0, "_front_on");
      akf $$4 = $$1.get($$0).a($$1x -> $$1x.a(nu.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(ni.a($$0).a(a(dqo.r, $$4, $$2)).a(b()));
   }

   private void a(dcv... $$0) {
      akf $$1 = nq.a("campfire_off");

      for (dcv $$2 : $$0) {
         akf $$3 = ns.bc.a($$2, nt.E($$2), this.c);
         this.a($$2.p());
         this.b.accept(ni.a($$2).a(a(dqo.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dcv $$0) {
      akf $$1 = ns.bt.a($$0, nt.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dcv $$0) {
      akf $$1;
      if ($$0 == dcx.tj) {
         $$1 = ns.bv.a($$0, nt.m($$0), this.c);
      } else {
         $$1 = ns.bu.a($$0, nt.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      nt $$0 = nt.a(nt.G(dcx.cl), nt.G(dcx.n));
      akf $$1 = ns.j.a(dcx.cl, $$0, this.c);
      this.b.accept(c(dcx.cl, $$1));
   }

   private void s() {
      this.a(csg.lH);
      this.b
         .accept(
            nh.a(dcx.cw)
               .a(
                  ng.b(
                     ng.a().a(dqo.ab, drd.c).a(dqo.aa, drd.c).a(dqo.ac, drd.c).a(dqo.ad, drd.c),
                     ng.a().a(dqo.ab, drd.b, drd.a).a(dqo.aa, drd.b, drd.a),
                     ng.a().a(dqo.aa, drd.b, drd.a).a(dqo.ac, drd.b, drd.a),
                     ng.a().a(dqo.ac, drd.b, drd.a).a(dqo.ad, drd.b, drd.a),
                     ng.a().a(dqo.ad, drd.b, drd.a).a(dqo.ab, drd.b, drd.a)
                  ),
                  nl.a().a(nm.c, nq.a("redstone_dust_dot"))
               )
               .a(ng.a().a(dqo.ab, drd.b, drd.a), nl.a().a(nm.c, nq.a("redstone_dust_side0")))
               .a(ng.a().a(dqo.ac, drd.b, drd.a), nl.a().a(nm.c, nq.a("redstone_dust_side_alt0")))
               .a(ng.a().a(dqo.aa, drd.b, drd.a), nl.a().a(nm.c, nq.a("redstone_dust_side_alt1")).a(nm.b, nm.a.d))
               .a(ng.a().a(dqo.ad, drd.b, drd.a), nl.a().a(nm.c, nq.a("redstone_dust_side1")).a(nm.b, nm.a.d))
               .a(ng.a().a(dqo.ab, drd.a), nl.a().a(nm.c, nq.a("redstone_dust_up")))
               .a(ng.a().a(dqo.aa, drd.a), nl.a().a(nm.c, nq.a("redstone_dust_up")).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.ac, drd.a), nl.a().a(nm.c, nq.a("redstone_dust_up")).a(nm.b, nm.a.c))
               .a(ng.a().a(dqo.ad, drd.a), nl.a().a(nm.c, nq.a("redstone_dust_up")).a(nm.b, nm.a.d))
         );
   }

   private void t() {
      this.a(csg.lL);
      this.b
         .accept(
            ni.a(dcx.gY)
               .a(c())
               .a(
                  nj.a(dqo.bd, dqo.w)
                     .a(dqr.a, false, nl.a().a(nm.c, nq.a(dcx.gY)))
                     .a(dqr.a, true, nl.a().a(nm.c, nq.a(dcx.gY, "_on")))
                     .a(dqr.b, false, nl.a().a(nm.c, nq.a(dcx.gY, "_subtract")))
                     .a(dqr.b, true, nl.a().a(nm.c, nq.a(dcx.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      nt $$0 = nt.a(dcx.jR);
      nt $$1 = nt.a(nt.a(dcx.jE, "_side"), $$0.a(nu.f));
      akf $$2 = ns.ab.a(dcx.jE, $$1, this.c);
      akf $$3 = ns.ac.a(dcx.jE, $$1, this.c);
      akf $$4 = ns.j.b(dcx.jE, "_double", $$1, this.c);
      this.b.accept(e(dcx.jE, $$2, $$3, $$4));
      this.b.accept(c(dcx.jR, ns.c.a(dcx.jR, $$0, this.c)));
   }

   private void v() {
      this.a(csg.sq);
      this.b
         .accept(
            nh.a(dcx.fs)
               .a(nl.a().a(nm.c, nt.G(dcx.fs)))
               .a(ng.a().a(dqo.k, true), nl.a().a(nm.c, nt.a(dcx.fs, "_bottle0")))
               .a(ng.a().a(dqo.l, true), nl.a().a(nm.c, nt.a(dcx.fs, "_bottle1")))
               .a(ng.a().a(dqo.m, true), nl.a().a(nm.c, nt.a(dcx.fs, "_bottle2")))
               .a(ng.a().a(dqo.k, false), nl.a().a(nm.c, nt.a(dcx.fs, "_empty0")))
               .a(ng.a().a(dqo.l, false), nl.a().a(nm.c, nt.a(dcx.fs, "_empty1")))
               .a(ng.a().a(dqo.m, false), nl.a().a(nm.c, nt.a(dcx.fs, "_empty2")))
         );
   }

   private void u(dcv $$0) {
      akf $$1 = ns.bp.a($$0, nt.b($$0), this.c);
      akf $$2 = nq.a("mushroom_block_inside");
      this.b
         .accept(
            nh.a($$0)
               .a(ng.a().a(dqo.L, true), nl.a().a(nm.c, $$1))
               .a(ng.a().a(dqo.M, true), nl.a().a(nm.c, $$1).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ng.a().a(dqo.N, true), nl.a().a(nm.c, $$1).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ng.a().a(dqo.O, true), nl.a().a(nm.c, $$1).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ng.a().a(dqo.J, true), nl.a().a(nm.c, $$1).a(nm.a, nm.a.d).a(nm.d, true))
               .a(ng.a().a(dqo.K, true), nl.a().a(nm.c, $$1).a(nm.a, nm.a.b).a(nm.d, true))
               .a(ng.a().a(dqo.L, false), nl.a().a(nm.c, $$2))
               .a(ng.a().a(dqo.M, false), nl.a().a(nm.c, $$2).a(nm.b, nm.a.b).a(nm.d, false))
               .a(ng.a().a(dqo.N, false), nl.a().a(nm.c, $$2).a(nm.b, nm.a.c).a(nm.d, false))
               .a(ng.a().a(dqo.O, false), nl.a().a(nm.c, $$2).a(nm.b, nm.a.d).a(nm.d, false))
               .a(ng.a().a(dqo.J, false), nl.a().a(nm.c, $$2).a(nm.a, nm.a.d).a(nm.d, false))
               .a(ng.a().a(dqo.K, false), nl.a().a(nm.c, $$2).a(nm.a, nm.a.b).a(nm.d, false))
         );
      this.a($$0, nv.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(csg.rB);
      this.b
         .accept(
            ni.a(dcx.eg)
               .a(
                  nj.a(dqo.ay)
                     .a(0, nl.a().a(nm.c, nq.a(dcx.eg)))
                     .a(1, nl.a().a(nm.c, nq.a(dcx.eg, "_slice1")))
                     .a(2, nl.a().a(nm.c, nq.a(dcx.eg, "_slice2")))
                     .a(3, nl.a().a(nm.c, nq.a(dcx.eg, "_slice3")))
                     .a(4, nl.a().a(nm.c, nq.a(dcx.eg, "_slice4")))
                     .a(5, nl.a().a(nm.c, nq.a(dcx.eg, "_slice5")))
                     .a(6, nl.a().a(nm.c, nq.a(dcx.eg, "_slice6")))
               )
         );
   }

   private void x() {
      nt $$0 = new nt()
         .a(nu.c, nt.a(dcx.nX, "_side3"))
         .a(nu.o, nt.G(dcx.t))
         .a(nu.n, nt.a(dcx.nX, "_top"))
         .a(nu.j, nt.a(dcx.nX, "_side3"))
         .a(nu.l, nt.a(dcx.nX, "_side3"))
         .a(nu.k, nt.a(dcx.nX, "_side1"))
         .a(nu.m, nt.a(dcx.nX, "_side2"));
      this.b.accept(c(dcx.nX, ns.a.a(dcx.nX, $$0, this.c)));
   }

   private void y() {
      nt $$0 = new nt()
         .a(nu.c, nt.a(dcx.ob, "_front"))
         .a(nu.o, nt.a(dcx.ob, "_bottom"))
         .a(nu.n, nt.a(dcx.ob, "_top"))
         .a(nu.j, nt.a(dcx.ob, "_front"))
         .a(nu.k, nt.a(dcx.ob, "_front"))
         .a(nu.l, nt.a(dcx.ob, "_side"))
         .a(nu.m, nt.a(dcx.ob, "_side"));
      this.b.accept(c(dcx.ob, ns.a.a(dcx.ob, $$0, this.c)));
   }

   private void a(dcv $$0, dcv $$1, BiFunction<dcv, dcv, nt> $$2) {
      nt $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, ns.a.a($$0, $$3, this.c)));
   }

   public void b(dcv $$0) {
      nt $$1 = new nt()
         .a(nu.c, nt.a($$0, "_particle"))
         .a(nu.o, nt.a($$0, "_down"))
         .a(nu.n, nt.a($$0, "_up"))
         .a(nu.j, nt.a($$0, "_north"))
         .a(nu.k, nt.a($$0, "_south"))
         .a(nu.l, nt.a($$0, "_east"))
         .a(nu.m, nt.a($$0, "_west"));
      this.b.accept(c($$0, ns.a.a($$0, $$1, this.c)));
   }

   private void z() {
      nt $$0 = nt.k(dcx.eZ);
      this.b.accept(c(dcx.eZ, nq.a(dcx.eZ)));
      this.a(dcx.ee, $$0);
      this.a(dcx.ef, $$0);
   }

   private void a(dcv $$0, nt $$1) {
      akf $$2 = ns.p.a($$0, $$1.c(nu.g, nt.G($$0)), this.c);
      this.b.accept(ni.a($$0, nl.a().a(nm.c, $$2)).a(b()));
   }

   private void A() {
      this.a(csg.sr);
      this.m(dcx.ft);
      this.b.accept(c(dcx.fv, ns.bs.a(dcx.fv, nt.j(nt.a(dcx.H, "_still")), this.c)));
      this.b
         .accept(
            ni.a(dcx.fu)
               .a(
                  nj.a(dhe.g)
                     .a(1, nl.a().a(nm.c, ns.bq.a(dcx.fu, "_level1", nt.j(nt.a(dcx.G, "_still")), this.c)))
                     .a(2, nl.a().a(nm.c, ns.br.a(dcx.fu, "_level2", nt.j(nt.a(dcx.G, "_still")), this.c)))
                     .a(3, nl.a().a(nm.c, ns.bs.a(dcx.fu, "_full", nt.j(nt.a(dcx.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            ni.a(dcx.fw)
               .a(
                  nj.a(dhe.g)
                     .a(1, nl.a().a(nm.c, ns.bq.a(dcx.fw, "_level1", nt.j(nt.G(dcx.qP)), this.c)))
                     .a(2, nl.a().a(nm.c, ns.br.a(dcx.fw, "_level2", nt.j(nt.G(dcx.qP)), this.c)))
                     .a(3, nl.a().a(nm.c, ns.bs.a(dcx.fw, "_full", nt.j(nt.G(dcx.qP)), this.c)))
               )
         );
   }

   private void B() {
      nt $$0 = nt.b(dcx.kv);
      akf $$1 = ns.aE.a(dcx.kv, $$0, this.c);
      akf $$2 = this.a(dcx.kv, "_dead", ns.aE, $$1x -> $$0.c(nu.b, $$1x));
      this.b.accept(ni.a(dcx.kv).a(a(dqo.au, 5, $$2, $$1)));
   }

   private void C() {
      akf $$0 = nq.a(dcx.tq);
      akf $$1 = nq.a(dcx.tq, "_triggered");
      akf $$2 = nq.a(dcx.tq, "_crafting");
      akf $$3 = nq.a(dcx.tq, "_crafting_triggered");
      this.b
         .accept(
            ni.a(dcx.tq)
               .a(nj.a(dqo.T).a($$0x -> this.a($$0x, nl.a())))
               .a(
                  nj.a(dqo.A, deo.b)
                     .a(false, false, nl.a().a(nm.c, $$0))
                     .a(true, true, nl.a().a(nm.c, $$3))
                     .a(true, false, nl.a().a(nm.c, $$1))
                     .a(false, true, nl.a().a(nm.c, $$2))
               )
         );
   }

   private void v(dcv $$0) {
      nt $$1 = new nt().a(nu.f, nt.a(dcx.cD, "_top")).a(nu.i, nt.a(dcx.cD, "_side")).a(nu.g, nt.a($$0, "_front"));
      nt $$2 = new nt().a(nu.i, nt.a(dcx.cD, "_top")).a(nu.g, nt.a($$0, "_front_vertical"));
      akf $$3 = ns.p.a($$0, $$1, this.c);
      akf $$4 = ns.r.a($$0, $$2, this.c);
      this.b
         .accept(
            ni.a($$0)
               .a(
                  nj.a(dqo.P)
                     .a(ir.a, nl.a().a(nm.c, $$4).a(nm.a, nm.a.c))
                     .a(ir.b, nl.a().a(nm.c, $$4))
                     .a(ir.c, nl.a().a(nm.c, $$3))
                     .a(ir.f, nl.a().a(nm.c, $$3).a(nm.b, nm.a.b))
                     .a(ir.d, nl.a().a(nm.c, $$3).a(nm.b, nm.a.c))
                     .a(ir.e, nl.a().a(nm.c, $$3).a(nm.b, nm.a.d))
               )
         );
   }

   private void D() {
      akf $$0 = nq.a(dcx.fy);
      akf $$1 = nq.a(dcx.fy, "_filled");
      this.b.accept(ni.a(dcx.fy).a(nj.a(dqo.h).a(false, nl.a().a(nm.c, $$0)).a(true, nl.a().a(nm.c, $$1))).a(c()));
   }

   private void E() {
      akf $$0 = nq.a(dcx.ku, "_side");
      akf $$1 = nq.a(dcx.ku, "_noside");
      akf $$2 = nq.a(dcx.ku, "_noside1");
      akf $$3 = nq.a(dcx.ku, "_noside2");
      akf $$4 = nq.a(dcx.ku, "_noside3");
      this.b
         .accept(
            nh.a(dcx.ku)
               .a(ng.a().a(dqo.L, true), nl.a().a(nm.c, $$0))
               .a(ng.a().a(dqo.M, true), nl.a().a(nm.c, $$0).a(nm.b, nm.a.b).a(nm.d, true))
               .a(ng.a().a(dqo.N, true), nl.a().a(nm.c, $$0).a(nm.b, nm.a.c).a(nm.d, true))
               .a(ng.a().a(dqo.O, true), nl.a().a(nm.c, $$0).a(nm.b, nm.a.d).a(nm.d, true))
               .a(ng.a().a(dqo.J, true), nl.a().a(nm.c, $$0).a(nm.a, nm.a.d).a(nm.d, true))
               .a(ng.a().a(dqo.K, true), nl.a().a(nm.c, $$0).a(nm.a, nm.a.b).a(nm.d, true))
               .a(ng.a().a(dqo.L, false), nl.a().a(nm.c, $$1).a(nm.e, 2), nl.a().a(nm.c, $$2), nl.a().a(nm.c, $$3), nl.a().a(nm.c, $$4))
               .a(
                  ng.a().a(dqo.M, false),
                  nl.a().a(nm.c, $$2).a(nm.b, nm.a.b).a(nm.d, true),
                  nl.a().a(nm.c, $$3).a(nm.b, nm.a.b).a(nm.d, true),
                  nl.a().a(nm.c, $$4).a(nm.b, nm.a.b).a(nm.d, true),
                  nl.a().a(nm.c, $$1).a(nm.e, 2).a(nm.b, nm.a.b).a(nm.d, true)
               )
               .a(
                  ng.a().a(dqo.N, false),
                  nl.a().a(nm.c, $$3).a(nm.b, nm.a.c).a(nm.d, true),
                  nl.a().a(nm.c, $$4).a(nm.b, nm.a.c).a(nm.d, true),
                  nl.a().a(nm.c, $$1).a(nm.e, 2).a(nm.b, nm.a.c).a(nm.d, true),
                  nl.a().a(nm.c, $$2).a(nm.b, nm.a.c).a(nm.d, true)
               )
               .a(
                  ng.a().a(dqo.O, false),
                  nl.a().a(nm.c, $$4).a(nm.b, nm.a.d).a(nm.d, true),
                  nl.a().a(nm.c, $$1).a(nm.e, 2).a(nm.b, nm.a.d).a(nm.d, true),
                  nl.a().a(nm.c, $$2).a(nm.b, nm.a.d).a(nm.d, true),
                  nl.a().a(nm.c, $$3).a(nm.b, nm.a.d).a(nm.d, true)
               )
               .a(
                  ng.a().a(dqo.J, false),
                  nl.a().a(nm.c, $$1).a(nm.e, 2).a(nm.a, nm.a.d).a(nm.d, true),
                  nl.a().a(nm.c, $$4).a(nm.a, nm.a.d).a(nm.d, true),
                  nl.a().a(nm.c, $$2).a(nm.a, nm.a.d).a(nm.d, true),
                  nl.a().a(nm.c, $$3).a(nm.a, nm.a.d).a(nm.d, true)
               )
               .a(
                  ng.a().a(dqo.K, false),
                  nl.a().a(nm.c, $$4).a(nm.a, nm.a.b).a(nm.d, true),
                  nl.a().a(nm.c, $$3).a(nm.a, nm.a.b).a(nm.d, true),
                  nl.a().a(nm.c, $$2).a(nm.a, nm.a.b).a(nm.d, true),
                  nl.a().a(nm.c, $$1).a(nm.e, 2).a(nm.a, nm.a.b).a(nm.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            nh.a(dcx.pc)
               .a(nl.a().a(nm.c, nt.G(dcx.pc)))
               .a(ng.a().a(dqo.aL, 1), nl.a().a(nm.c, nt.a(dcx.pc, "_contents1")))
               .a(ng.a().a(dqo.aL, 2), nl.a().a(nm.c, nt.a(dcx.pc, "_contents2")))
               .a(ng.a().a(dqo.aL, 3), nl.a().a(nm.c, nt.a(dcx.pc, "_contents3")))
               .a(ng.a().a(dqo.aL, 4), nl.a().a(nm.c, nt.a(dcx.pc, "_contents4")))
               .a(ng.a().a(dqo.aL, 5), nl.a().a(nm.c, nt.a(dcx.pc, "_contents5")))
               .a(ng.a().a(dqo.aL, 6), nl.a().a(nm.c, nt.a(dcx.pc, "_contents6")))
               .a(ng.a().a(dqo.aL, 7), nl.a().a(nm.c, nt.a(dcx.pc, "_contents7")))
               .a(ng.a().a(dqo.aL, 8), nl.a().a(nm.c, nt.a(dcx.pc, "_contents_ready")))
         );
   }

   private void w(dcv $$0) {
      akf $$1 = ns.c.a($$0, nt.a($$0), this.c);
      akf $$2 = this.a($$0, "_powered", ns.c, nt::b);
      akf $$3 = this.a($$0, "_lit", ns.c, nt::b);
      akf $$4 = this.a($$0, "_lit_powered", ns.c, nt::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nf a(dcv $$0, akf $$1, akf $$2, akf $$3, akf $$4) {
      return ni.a($$0).a(nj.a(dqo.r, dqo.w).a(($$4x, $$5) -> $$4x ? nl.a().a(nm.c, $$5 ? $$4 : $$2) : nl.a().a(nm.c, $$5 ? $$3 : $$1)));
   }

   private void i(dcv $$0, dcv $$1) {
      akf $$2 = nq.a($$0);
      akf $$3 = nq.a($$0, "_powered");
      akf $$4 = nq.a($$0, "_lit");
      akf $$5 = nq.a($$0, "_lit_powered");
      this.a($$1, nq.a($$0.p()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dcv $$0) {
      this.c($$0);
      this.b.accept(ni.a($$0, nl.a().a(nm.c, ns.ao.a($$0, nt.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dcx.qy);
      this.x(dcx.qx);
      this.x(dcx.qw);
      this.x(dcx.qv);
   }

   private void H() {
      this.c(dcx.st);
      nj.b<ir, dqv> $$0 = nj.a(dqo.bm, dqo.bn);

      for (dqv $$1 : dqv.values()) {
         $$0.a(ir.b, $$1, this.a(ir.b, $$1));
      }

      for (dqv $$2 : dqv.values()) {
         $$0.a(ir.a, $$2, this.a(ir.a, $$2));
      }

      this.b.accept(ni.a(dcx.st).a($$0));
   }

   private nl a(ir $$0, dqv $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      nt $$3 = nt.c(nt.a(dcx.st, $$2));
      return nl.a().a(nm.c, ns.an.a(dcx.st, $$2, $$3, this.c));
   }

   private void y(dcv $$0) {
      nt $$1 = new nt().a(nu.e, nt.G(dcx.dV)).a(nu.f, nt.G($$0)).a(nu.i, nt.a($$0, "_side"));
      this.b.accept(c($$0, ns.n.a($$0, $$1, this.c)));
   }

   private void I() {
      akf $$0 = nt.a(dcx.gZ, "_side");
      nt $$1 = new nt().a(nu.f, nt.a(dcx.gZ, "_top")).a(nu.i, $$0);
      nt $$2 = new nt().a(nu.f, nt.a(dcx.gZ, "_inverted_top")).a(nu.i, $$0);
      this.b
         .accept(
            ni.a(dcx.gZ)
               .a(nj.a(dqo.p).a(false, nl.a().a(nm.c, ns.aF.a(dcx.gZ, $$1, this.c))).a(true, nl.a().a(nm.c, ns.aF.a(nq.a(dcx.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dcv $$0) {
      this.b.accept(ni.a($$0, nl.a().a(nm.c, nq.a($$0))).a(this.n()));
   }

   private void J() {
      dcv $$0 = dcx.ss;
      akf $$1 = nq.a($$0, "_on");
      akf $$2 = nq.a($$0);
      this.b.accept(ni.a($$0, nl.a().a(nm.c, nq.a($$0))).a(this.n()).a(a(dqo.w, $$1, $$2)));
   }

   private void K() {
      nt $$0 = new nt().a(nu.B, nt.G(dcx.j)).a(nu.f, nt.G(dcx.cC));
      nt $$1 = new nt().a(nu.B, nt.G(dcx.j)).a(nu.f, nt.a(dcx.cC, "_moist"));
      akf $$2 = ns.aW.a(dcx.cC, $$0, this.c);
      akf $$3 = ns.aW.a(nt.a(dcx.cC, "_moist"), $$1, this.c);
      this.b.accept(ni.a(dcx.cC).a(a(dqo.aQ, 7, $$3, $$2)));
   }

   private List<akf> A(dcv $$0) {
      akf $$1 = ns.aX.a(nq.a($$0, "_floor0"), nt.v($$0), this.c);
      akf $$2 = ns.aX.a(nq.a($$0, "_floor1"), nt.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akf> B(dcv $$0) {
      akf $$1 = ns.aY.a(nq.a($$0, "_side0"), nt.v($$0), this.c);
      akf $$2 = ns.aY.a(nq.a($$0, "_side1"), nt.w($$0), this.c);
      akf $$3 = ns.aZ.a(nq.a($$0, "_side_alt0"), nt.v($$0), this.c);
      akf $$4 = ns.aZ.a(nq.a($$0, "_side_alt1"), nt.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akf> C(dcv $$0) {
      akf $$1 = ns.ba.a(nq.a($$0, "_up0"), nt.v($$0), this.c);
      akf $$2 = ns.ba.a(nq.a($$0, "_up1"), nt.w($$0), this.c);
      akf $$3 = ns.bb.a(nq.a($$0, "_up_alt0"), nt.v($$0), this.c);
      akf $$4 = ns.bb.a(nq.a($$0, "_up_alt1"), nt.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<nl> a(List<akf> $$0, UnaryOperator<nl> $$1) {
      return $$0.stream().map($$0x -> nl.a().a(nm.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      ng $$0 = ng.a().a(dqo.L, false).a(dqo.M, false).a(dqo.N, false).a(dqo.O, false).a(dqo.J, false);
      List<akf> $$1 = this.A(dcx.cr);
      List<akf> $$2 = this.B(dcx.cr);
      List<akf> $$3 = this.C(dcx.cr);
      this.b
         .accept(
            nh.a(dcx.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(ng.b(ng.a().a(dqo.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(ng.b(ng.a().a(dqo.M, true), $$0), a($$2, $$0x -> $$0x.a(nm.b, nm.a.b)))
               .a(ng.b(ng.a().a(dqo.N, true), $$0), a($$2, $$0x -> $$0x.a(nm.b, nm.a.c)))
               .a(ng.b(ng.a().a(dqo.O, true), $$0), a($$2, $$0x -> $$0x.a(nm.b, nm.a.d)))
               .a(ng.a().a(dqo.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<akf> $$0 = this.A(dcx.cs);
      List<akf> $$1 = this.B(dcx.cs);
      this.b
         .accept(
            nh.a(dcx.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nm.b, nm.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nm.b, nm.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nm.b, nm.a.d)))
         );
   }

   private void D(dcv $$0) {
      akf $$1 = nv.t.create($$0, this.c);
      akf $$2 = nv.u.create($$0, this.c);
      this.a($$0.p());
      this.b.accept(ni.a($$0).a(a(dqo.j, $$2, $$1)));
   }

   private void N() {
      nt $$0 = nt.a(nt.a(dcx.ad, "_side"), nt.a(dcx.ad, "_top"));
      akf $$1 = ns.j.a(dcx.ad, $$0, this.c);
      this.b.accept(d(dcx.ad, $$1));
   }

   private void O() {
      this.a(csg.ad);
      dcv $$0 = dcx.E;
      nj.b<Boolean, Integer> $$1 = nj.a(dhq.d, dhq.b);
      akf $$2 = nq.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akf $$4 = nq.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, nl.a().a(nm.c, $$4));
         $$1.a(false, $$3, nl.a().a(nm.c, $$2));
      }

      this.b.accept(ni.a(dcx.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            ni.a(dcx.kI)
               .a(
                  nj.a(dqo.as)
                     .a(0, nl.a().a(nm.c, this.a(dcx.kI, "_0", ns.c, nt::b)))
                     .a(1, nl.a().a(nm.c, this.a(dcx.kI, "_1", ns.c, nt::b)))
                     .a(2, nl.a().a(nm.c, this.a(dcx.kI, "_2", ns.c, nt::b)))
                     .a(3, nl.a().a(nm.c, this.a(dcx.kI, "_3", ns.c, nt::b)))
               )
         );
   }

   private void Q() {
      akf $$0 = nt.G(dcx.j);
      nt $$1 = new nt().a(nu.e, $$0).b(nu.e, nu.c).a(nu.f, nt.a(dcx.i, "_top")).a(nu.i, nt.a(dcx.i, "_snow"));
      nl $$2 = nl.a().a(nm.c, ns.n.a(dcx.i, "_snow", $$1, this.c));
      this.a(dcx.i, nq.a(dcx.i), $$2);
      akf $$3 = nv.f.get(dcx.fl).a($$1x -> $$1x.a(nu.e, $$0)).a(dcx.fl, this.c);
      this.a(dcx.fl, $$3, $$2);
      akf $$4 = nv.f.get(dcx.l).a($$1x -> $$1x.a(nu.e, $$0)).a(dcx.l, this.c);
      this.a(dcx.l, $$4, $$2);
   }

   private void a(dcv $$0, akf $$1, nl $$2) {
      List<nl> $$3 = Arrays.asList(a($$1));
      this.b.accept(ni.a($$0).a(nj.a(dqo.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(csg.rh);
      this.b
         .accept(
            ni.a(dcx.fC)
               .a(
                  nj.a(dqo.ar)
                     .a(0, nl.a().a(nm.c, nq.a(dcx.fC, "_stage0")))
                     .a(1, nl.a().a(nm.c, nq.a(dcx.fC, "_stage1")))
                     .a(2, nl.a().a(nm.c, nq.a(dcx.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dcx.kE, nq.a(dcx.kE)));
   }

   private void j(dcv $$0, dcv $$1) {
      nt $$2 = nt.b($$1);
      akf $$3 = ns.Y.a($$0, $$2, this.c);
      akf $$4 = ns.Z.a($$0, $$2, this.c);
      this.b.accept(ni.a($$0).a(a(dqo.aT, 1, $$4, $$3)));
   }

   private void T() {
      akf $$0 = nq.a(dcx.hc);
      akf $$1 = nq.a(dcx.hc, "_side");
      this.a(csg.lR);
      this.b
         .accept(
            ni.a(dcx.hc)
               .a(
                  nj.a(dqo.Q)
                     .a(ir.a, nl.a().a(nm.c, $$0))
                     .a(ir.c, nl.a().a(nm.c, $$1))
                     .a(ir.f, nl.a().a(nm.c, $$1).a(nm.b, nm.a.b))
                     .a(ir.d, nl.a().a(nm.c, $$1).a(nm.b, nm.a.c))
                     .a(ir.e, nl.a().a(nm.c, $$1).a(nm.b, nm.a.d))
               )
         );
   }

   private void k(dcv $$0, dcv $$1) {
      akf $$2 = nq.a($$0);
      this.b.accept(ni.a($$1, nl.a().a(nm.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      akf $$0 = nq.a(dcx.eW, "_post_ends");
      akf $$1 = nq.a(dcx.eW, "_post");
      akf $$2 = nq.a(dcx.eW, "_cap");
      akf $$3 = nq.a(dcx.eW, "_cap_alt");
      akf $$4 = nq.a(dcx.eW, "_side");
      akf $$5 = nq.a(dcx.eW, "_side_alt");
      this.b
         .accept(
            nh.a(dcx.eW)
               .a(nl.a().a(nm.c, $$0))
               .a(ng.a().a(dqo.L, false).a(dqo.M, false).a(dqo.N, false).a(dqo.O, false), nl.a().a(nm.c, $$1))
               .a(ng.a().a(dqo.L, true).a(dqo.M, false).a(dqo.N, false).a(dqo.O, false), nl.a().a(nm.c, $$2))
               .a(ng.a().a(dqo.L, false).a(dqo.M, true).a(dqo.N, false).a(dqo.O, false), nl.a().a(nm.c, $$2).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.L, false).a(dqo.M, false).a(dqo.N, true).a(dqo.O, false), nl.a().a(nm.c, $$3))
               .a(ng.a().a(dqo.L, false).a(dqo.M, false).a(dqo.N, false).a(dqo.O, true), nl.a().a(nm.c, $$3).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.L, true), nl.a().a(nm.c, $$4))
               .a(ng.a().a(dqo.M, true), nl.a().a(nm.c, $$4).a(nm.b, nm.a.b))
               .a(ng.a().a(dqo.N, true), nl.a().a(nm.c, $$5))
               .a(ng.a().a(dqo.O, true), nl.a().a(nm.c, $$5).a(nm.b, nm.a.b))
         );
      this.d(dcx.eW);
   }

   private void E(dcv $$0) {
      this.b.accept(ni.a($$0, nl.a().a(nm.c, nq.a($$0))).a(b()));
   }

   private void V() {
      akf $$0 = nq.a(dcx.dw);
      akf $$1 = nq.a(dcx.dw, "_on");
      this.d(dcx.dw);
      this.b
         .accept(
            ni.a(dcx.dw)
               .a(a(dqo.w, $$0, $$1))
               .a(
                  nj.a(dqo.U, dqo.R)
                     .a(dqj.c, ir.c, nl.a().a(nm.a, nm.a.c).a(nm.b, nm.a.c))
                     .a(dqj.c, ir.f, nl.a().a(nm.a, nm.a.c).a(nm.b, nm.a.d))
                     .a(dqj.c, ir.d, nl.a().a(nm.a, nm.a.c))
                     .a(dqj.c, ir.e, nl.a().a(nm.a, nm.a.c).a(nm.b, nm.a.b))
                     .a(dqj.a, ir.c, nl.a())
                     .a(dqj.a, ir.f, nl.a().a(nm.b, nm.a.b))
                     .a(dqj.a, ir.d, nl.a().a(nm.b, nm.a.c))
                     .a(dqj.a, ir.e, nl.a().a(nm.b, nm.a.d))
                     .a(dqj.b, ir.c, nl.a().a(nm.a, nm.a.b))
                     .a(dqj.b, ir.f, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.b))
                     .a(dqj.b, ir.d, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.c))
                     .a(dqj.b, ir.e, nl.a().a(nm.a, nm.a.b).a(nm.b, nm.a.d))
               )
         );
   }

   private void W() {
      this.d(dcx.fm);
      this.b.accept(b(dcx.fm, nq.a(dcx.fm)));
   }

   private void X() {
      this.d(dcx.tn);
      this.b.accept(c(dcx.tn, nq.a(dcx.tn)));
   }

   private void Y() {
      this.b.accept(ni.a(dcx.ed).a(nj.a(dqo.H).a(ir.a.a, nl.a().a(nm.c, nq.a(dcx.ed, "_ns"))).a(ir.a.c, nl.a().a(nm.c, nq.a(dcx.ed, "_ew")))));
   }

   private void Z() {
      akf $$0 = nv.a.create(dcx.dV, this.c);
      this.b
         .accept(
            ni.a(
               dcx.dV,
               nl.a().a(nm.c, $$0),
               nl.a().a(nm.c, $$0).a(nm.a, nm.a.b),
               nl.a().a(nm.c, $$0).a(nm.a, nm.a.c),
               nl.a().a(nm.c, $$0).a(nm.a, nm.a.d),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.b),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.b).a(nm.a, nm.a.b),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.b).a(nm.a, nm.a.c),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.b).a(nm.a, nm.a.d),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.c),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.c).a(nm.a, nm.a.b),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.c).a(nm.a, nm.a.c),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.c).a(nm.a, nm.a.d),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.d),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.d).a(nm.a, nm.a.b),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.d).a(nm.a, nm.a.c),
               nl.a().a(nm.c, $$0).a(nm.b, nm.a.d).a(nm.a, nm.a.d)
            )
         );
   }

   private void aa() {
      akf $$0 = nq.a(dcx.kO);
      akf $$1 = nq.a(dcx.kO, "_on");
      this.b.accept(ni.a(dcx.kO).a(a(dqo.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      nt $$0 = new nt().a(nu.e, nt.a(dcx.by, "_bottom")).a(nu.i, nt.a(dcx.by, "_side"));
      akf $$1 = nt.a(dcx.by, "_top_sticky");
      akf $$2 = nt.a(dcx.by, "_top");
      nt $$3 = $$0.c(nu.E, $$1);
      nt $$4 = $$0.c(nu.E, $$2);
      akf $$5 = nq.a(dcx.by, "_base");
      this.a(dcx.by, $$5, $$4);
      this.a(dcx.br, $$5, $$3);
      akf $$6 = ns.n.a(dcx.by, "_inventory", $$0.c(nu.f, $$2), this.c);
      akf $$7 = ns.n.a(dcx.br, "_inventory", $$0.c(nu.f, $$1), this.c);
      this.a(dcx.by, $$6);
      this.a(dcx.br, $$7);
   }

   private void a(dcv $$0, akf $$1, nt $$2) {
      akf $$3 = ns.bh.a($$0, $$2, this.c);
      this.b.accept(ni.a($$0).a(a(dqo.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      nt $$0 = new nt().a(nu.F, nt.a(dcx.by, "_top")).a(nu.i, nt.a(dcx.by, "_side"));
      nt $$1 = $$0.c(nu.E, nt.a(dcx.by, "_top_sticky"));
      nt $$2 = $$0.c(nu.E, nt.a(dcx.by, "_top"));
      this.b
         .accept(
            ni.a(dcx.bz)
               .a(
                  nj.a(dqo.x, dqo.bg)
                     .a(false, dra.a, nl.a().a(nm.c, ns.bi.a(dcx.by, "_head", $$2, this.c)))
                     .a(false, dra.b, nl.a().a(nm.c, ns.bi.a(dcx.by, "_head_sticky", $$1, this.c)))
                     .a(true, dra.a, nl.a().a(nm.c, ns.bj.a(dcx.by, "_head_short", $$2, this.c)))
                     .a(true, dra.b, nl.a().a(nm.c, ns.bj.a(dcx.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dcv $$0 = dcx.tr;
      nt $$1 = nt.a($$0, "_side_inactive", "_top_inactive");
      nt $$2 = nt.a($$0, "_side_active", "_top_active");
      nt $$3 = nt.a($$0, "_side_active", "_top_ejecting_reward");
      akf $$4 = ns.o.a($$0, $$1, this.c);
      akf $$5 = ns.o.a($$0, "_active", $$2, this.c);
      akf $$6 = ns.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(ni.a($$0).a(nj.a(dqo.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> nl.a().a(nm.c, $$4);
            case b, c, d -> nl.a().a(nm.c, $$5);
            case e -> nl.a().a(nm.c, $$6);
         };
      })));
   }

   private void ae() {
      dcv $$0 = dcx.ts;
      nt $$1 = nt.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      nt $$2 = nt.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      nt $$3 = nt.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      nt $$4 = nt.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akf $$5 = ns.bN.a($$0, $$1, this.c);
      akf $$6 = ns.bN.a($$0, "_active", $$2, this.c);
      akf $$7 = ns.bN.a($$0, "_unlocking", $$3, this.c);
      akf $$8 = ns.bN.a($$0, "_ejecting_reward", $$4, this.c);
      this.a($$0, $$5);
      this.b.accept(ni.a($$0).a(b()).a(nj.a(dlq.b).a($$4x -> {
         return switch ($$4x) {
            case a -> nl.a().a(nm.c, $$5);
            case b -> nl.a().a(nm.c, $$6);
            case c -> nl.a().a(nm.c, $$7);
            case d -> nl.a().a(nm.c, $$8);
         };
      })));
   }

   private void af() {
      akf $$0 = nq.a(dcx.qQ, "_inactive");
      akf $$1 = nq.a(dcx.qQ, "_active");
      this.a(dcx.qQ, $$0);
      this.b.accept(ni.a(dcx.qQ).a(nj.a(dqo.bo).a($$2 -> nl.a().a(nm.c, $$2 != drf.b && $$2 != drf.c ? $$0 : $$1))));
   }

   private void ag() {
      akf $$0 = nq.a(dcx.qR, "_inactive");
      akf $$1 = nq.a(dcx.qR, "_active");
      this.a(dcx.qR, $$0);
      this.b.accept(ni.a(dcx.qR).a(nj.a(dqo.bo).a($$2 -> nl.a().a(nm.c, $$2 != drf.b && $$2 != drf.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      akf $$0 = ns.bM.a(dcx.qV, nt.a(false), this.c);
      akf $$1 = ns.bM.a(dcx.qV, "_can_summon", nt.a(true), this.c);
      this.a(dcx.qV, $$0);
      this.b.accept(ni.a(dcx.qV).a(a(dqo.G, $$1, $$0)));
   }

   private void ai() {
      akf $$0 = nq.a(dcx.nS, "_stable");
      akf $$1 = nq.a(dcx.nS, "_unstable");
      this.a(dcx.nS, $$0);
      this.b.accept(ni.a(dcx.nS).a(a(dqo.b, $$1, $$0)));
   }

   private void aj() {
      akf $$0 = this.a(dcx.sv, "", ns.ao, nt::c);
      akf $$1 = this.a(dcx.sv, "_lit", ns.ao, nt::c);
      this.b.accept(ni.a(dcx.sv).a(a(dqo.D, $$1, $$0)));
      akf $$2 = this.a(dcx.sw, "", ns.ao, nt::c);
      akf $$3 = this.a(dcx.sw, "_lit", ns.ao, nt::c);
      this.b.accept(ni.a(dcx.sw).a(a(dqo.D, $$3, $$2)));
   }

   private void ak() {
      akf $$0 = nv.a.create(dcx.fB, this.c);
      akf $$1 = this.a(dcx.fB, "_on", ns.c, nt::b);
      this.b.accept(ni.a(dcx.fB).a(a(dqo.r, $$1, $$0)));
   }

   private void l(dcv $$0, dcv $$1) {
      nt $$2 = nt.y($$0);
      this.b.accept(c($$0, ns.bf.a($$0, $$2, this.c)));
      this.b.accept(ni.a($$1, nl.a().a(nm.c, ns.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      nt $$0 = nt.y(dcx.dK);
      nt $$1 = nt.i(nt.a(dcx.dK, "_off"));
      akf $$2 = ns.bf.a(dcx.dK, $$0, this.c);
      akf $$3 = ns.bf.a(dcx.dK, "_off", $$1, this.c);
      this.b.accept(ni.a(dcx.dK).a(a(dqo.r, $$2, $$3)));
      akf $$4 = ns.bg.a(dcx.dL, $$0, this.c);
      akf $$5 = ns.bg.a(dcx.dL, "_off", $$1, this.c);
      this.b.accept(ni.a(dcx.dL).a(a(dqo.r, $$4, $$5)).a(d()));
      this.d(dcx.dK);
      this.c(dcx.dL);
   }

   private void am() {
      this.a(csg.lK);
      this.b.accept(ni.a(dcx.eh).a(nj.a(dqo.aA, dqo.s, dqo.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return nl.a().a(nm.c, nt.a(dcx.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(csg.cT);
      this.b
         .accept(
            ni.a(dcx.mV)
               .a(
                  nj.a(dqo.aS, dqo.C)
                     .a(1, false, Arrays.asList(a(nq.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(nq.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(nq.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(nq.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(nq.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(nq.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(nq.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(nq.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      nt $$0 = nt.a(dcx.dN);
      akf $$1 = ns.c.a(dcx.dP, $$0, this.c);
      this.b.accept(ni.a(dcx.dN).a(nj.a(dqo.aF).a($$1x -> nl.a().a(nm.c, $$1x < 8 ? nq.a(dcx.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dcx.dN, nq.a(dcx.dN, "_height2"));
      this.b.accept(c(dcx.dP, $$1));
   }

   private void ap() {
      this.b.accept(ni.a(dcx.oc, nl.a().a(nm.c, nq.a(dcx.oc))).a(b()));
   }

   private void aq() {
      akf $$0 = nv.a.create(dcx.pa, this.c);
      this.a(dcx.pa, $$0);
      this.b.accept(ni.a(dcx.pa).a(nj.a(dqo.bj).a($$0x -> nl.a().a(nm.c, this.a(dcx.pa, "_" + $$0x.c(), ns.c, nt::b)))));
   }

   private void ar() {
      this.a(csg.wr);
      this.b.accept(ni.a(dcx.oi).a(nj.a(dqo.as).a($$0 -> nl.a().a(nm.c, this.a(dcx.oi, "_stage" + $$0, ns.ao, nt::c)))));
   }

   private void as() {
      this.a(csg.ps);
      this.b
         .accept(
            ni.a(dcx.fI)
               .a(
                  nj.a(dqo.a, dqo.M, dqo.L, dqo.N, dqo.O)
                     .a(false, false, false, false, false, nl.a().a(nm.c, nq.a(dcx.fI, "_ns")))
                     .a(false, true, false, false, false, nl.a().a(nm.c, nq.a(dcx.fI, "_n")).a(nm.b, nm.a.b))
                     .a(false, false, true, false, false, nl.a().a(nm.c, nq.a(dcx.fI, "_n")))
                     .a(false, false, false, true, false, nl.a().a(nm.c, nq.a(dcx.fI, "_n")).a(nm.b, nm.a.c))
                     .a(false, false, false, false, true, nl.a().a(nm.c, nq.a(dcx.fI, "_n")).a(nm.b, nm.a.d))
                     .a(false, true, true, false, false, nl.a().a(nm.c, nq.a(dcx.fI, "_ne")))
                     .a(false, true, false, true, false, nl.a().a(nm.c, nq.a(dcx.fI, "_ne")).a(nm.b, nm.a.b))
                     .a(false, false, false, true, true, nl.a().a(nm.c, nq.a(dcx.fI, "_ne")).a(nm.b, nm.a.c))
                     .a(false, false, true, false, true, nl.a().a(nm.c, nq.a(dcx.fI, "_ne")).a(nm.b, nm.a.d))
                     .a(false, false, true, true, false, nl.a().a(nm.c, nq.a(dcx.fI, "_ns")))
                     .a(false, true, false, false, true, nl.a().a(nm.c, nq.a(dcx.fI, "_ns")).a(nm.b, nm.a.b))
                     .a(false, true, true, true, false, nl.a().a(nm.c, nq.a(dcx.fI, "_nse")))
                     .a(false, true, false, true, true, nl.a().a(nm.c, nq.a(dcx.fI, "_nse")).a(nm.b, nm.a.b))
                     .a(false, false, true, true, true, nl.a().a(nm.c, nq.a(dcx.fI, "_nse")).a(nm.b, nm.a.c))
                     .a(false, true, true, false, true, nl.a().a(nm.c, nq.a(dcx.fI, "_nse")).a(nm.b, nm.a.d))
                     .a(false, true, true, true, true, nl.a().a(nm.c, nq.a(dcx.fI, "_nsew")))
                     .a(true, false, false, false, false, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_ns")))
                     .a(true, false, true, false, false, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_n")))
                     .a(true, false, false, true, false, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_n")).a(nm.b, nm.a.c))
                     .a(true, true, false, false, false, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_n")).a(nm.b, nm.a.b))
                     .a(true, false, false, false, true, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_n")).a(nm.b, nm.a.d))
                     .a(true, true, true, false, false, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_ne")))
                     .a(true, true, false, true, false, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_ne")).a(nm.b, nm.a.b))
                     .a(true, false, false, true, true, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_ne")).a(nm.b, nm.a.c))
                     .a(true, false, true, false, true, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_ne")).a(nm.b, nm.a.d))
                     .a(true, false, true, true, false, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_ns")))
                     .a(true, true, false, false, true, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_ns")).a(nm.b, nm.a.b))
                     .a(true, true, true, true, false, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_nse")))
                     .a(true, true, false, true, true, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_nse")).a(nm.b, nm.a.b))
                     .a(true, false, true, true, true, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_nse")).a(nm.b, nm.a.c))
                     .a(true, true, true, false, true, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_nse")).a(nm.b, nm.a.d))
                     .a(true, true, true, true, true, nl.a().a(nm.c, nq.a(dcx.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dcx.fH);
      this.b.accept(ni.a(dcx.fH).a(nj.a(dqo.a, dqo.w).a(($$0, $$1) -> nl.a().a(nm.c, nt.a(dcx.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akf a(int $$0, String $$1, nt $$2) {
      switch ($$0) {
         case 1:
            return ns.bl.a(nq.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return ns.bm.a(nq.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return ns.bn.a(nq.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return ns.bo.a(nq.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akf a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", nt.b(nt.G(dcx.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", nt.b(nt.a(dcx.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", nt.b(nt.a(dcx.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(csg.kp);
      this.b.accept(ni.a(dcx.mf).a(nj.a(dqo.aD, dqo.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(csg.kq);
      Function<Integer, akf> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         nt $$2 = nt.a($$1);
         return ns.bw.a(dcx.mg, $$1, $$2, this.c);
      };
      this.b.accept(ni.a(dcx.mg).a(nj.a(dkd.c).a($$1 -> nl.a().a(nm.c, $$0.apply($$1)))));
   }

   private void F(dcv $$0) {
      this.d($$0);
      akf $$1 = nq.a($$0);
      nh $$2 = nh.a($$0);
      ng.c $$3 = ac.a(ng.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dqp, Function<akf, nl>> $$4 : a) {
         dqp $$5 = (dqp)$$4.getFirst();
         Function<akf, nl> $$6 = (Function<akf, nl>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(ng.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      akf $$0 = nt.a(dcx.qU, "_bottom");
      nt $$1 = new nt().a(nu.e, $$0).a(nu.f, nt.a(dcx.qU, "_top")).a(nu.i, nt.a(dcx.qU, "_side"));
      nt $$2 = new nt().a(nu.e, $$0).a(nu.f, nt.a(dcx.qU, "_top_bloom")).a(nu.i, nt.a(dcx.qU, "_side_bloom"));
      akf $$3 = ns.n.a(dcx.qU, "", $$1, this.c);
      akf $$4 = ns.n.a(dcx.qU, "_bloom", $$2, this.c);
      this.b.accept(ni.a(dcx.qU).a(nj.a(dqo.E).a($$2x -> nl.a().a(nm.c, $$2x ? $$4 : $$3))));
      this.a(csg.gj, $$3);
   }

   private void ax() {
      dcv $$0 = dcx.cm;
      akf $$1 = nq.a($$0);
      nh $$2 = nh.a($$0);
      List.of(Pair.of(ir.c, nm.a.a), Pair.of(ir.f, nm.a.b), Pair.of(ir.d, nm.a.c), Pair.of(ir.e, nm.a.d)).forEach($$2x -> {
         ir $$3 = (ir)$$2x.getFirst();
         nm.a $$4 = (nm.a)$$2x.getSecond();
         ng.c $$5 = ng.a().a(dqo.R, $$3);
         $$2.a($$5, nl.a().a(nm.c, $$1).a(nm.b, $$4).a(nm.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, nq.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nh $$0, ng.c $$1, nm.a $$2) {
      List.of(Pair.of(dqo.bp, ns.aM), Pair.of(dqo.bq, ns.aN), Pair.of(dqo.br, ns.aO), Pair.of(dqo.bs, ns.aP), Pair.of(dqo.bt, ns.aQ), Pair.of(dqo.bu, ns.aR))
         .forEach($$3 -> {
            dqp $$4 = (dqp)$$3.getFirst();
            nr $$5 = (nr)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nh $$0, ng.c $$1, nm.a $$2, dqp $$3, nr $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      nt $$7 = new nt().a(nu.b, nt.a(dcx.cm, $$6));
      nc.d $$8 = new nc.d($$4, $$6);
      akf $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dcx.cm, $$6, $$7, this.c));
      $$0.a(ng.a($$1, ng.a().a($$3, $$5)), nl.a().a(nm.c, $$9).a(nm.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dcx.kJ, ns.c.a(dcx.kJ, nt.b(nq.a("magma")), this.c)));
   }

   private void G(dcv $$0) {
      this.b($$0, nv.q);
      ns.bD.a(nq.a($$0.p()), nt.u($$0), this.c);
   }

   private void b(dcv $$0, dcv $$1, nc.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dcv $$0, dcv $$1) {
      ns.bE.a(nq.a($$0.p()), nt.u($$1), this.c);
   }

   private void az() {
      akf $$0 = nq.a(dcx.b);
      akf $$1 = nq.a(dcx.b, "_mirrored");
      this.b.accept(a(dcx.eN, $$0, $$1));
      this.a(dcx.eN, $$0);
   }

   private void aA() {
      akf $$0 = nq.a(dcx.sJ);
      akf $$1 = nq.a(dcx.sJ, "_mirrored");
      this.b.accept(a(dcx.td, $$0, $$1).a(f()));
      this.a(dcx.td, $$0);
   }

   private void n(dcv $$0, dcv $$1) {
      this.a($$0, nc.e.b);
      nt $$2 = nt.d(nt.a($$0, "_pot"));
      akf $$3 = nc.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      akf $$0 = nt.a(dcx.pl, "_bottom");
      akf $$1 = nt.a(dcx.pl, "_top_off");
      akf $$2 = nt.a(dcx.pl, "_top");
      akf[] $$3 = new akf[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         nt $$5 = new nt().a(nu.e, $$0).a(nu.f, $$4 == 0 ? $$1 : $$2).a(nu.i, nt.a(dcx.pl, "_side" + $$4));
         $$3[$$4] = ns.n.a(dcx.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(ni.a(dcx.pl).a(nj.a(dqo.aZ).a($$1x -> nl.a().a(nm.c, $$3[$$1x]))));
      this.a(csg.wP, $$3[0]);
   }

   private nl a(it $$0, nl $$1) {
      switch ($$0) {
         case b:
            return $$1.a(nm.a, nm.a.b);
         case c:
            return $$1.a(nm.a, nm.a.b).a(nm.b, nm.a.c);
         case d:
            return $$1.a(nm.a, nm.a.b).a(nm.b, nm.a.d);
         case a:
            return $$1.a(nm.a, nm.a.b).a(nm.b, nm.a.b);
         case f:
            return $$1.a(nm.a, nm.a.d).a(nm.b, nm.a.c);
         case g:
            return $$1.a(nm.a, nm.a.d);
         case h:
            return $$1.a(nm.a, nm.a.d).a(nm.b, nm.a.b);
         case e:
            return $$1.a(nm.a, nm.a.d).a(nm.b, nm.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(nm.b, nm.a.c);
         case i:
            return $$1.a(nm.b, nm.a.d);
         case j:
            return $$1.a(nm.b, nm.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      akf $$0 = nt.a(dcx.pb, "_top");
      akf $$1 = nt.a(dcx.pb, "_bottom");
      akf $$2 = nt.a(dcx.pb, "_side");
      akf $$3 = nt.a(dcx.pb, "_lock");
      nt $$4 = new nt().a(nu.o, $$2).a(nu.m, $$2).a(nu.l, $$2).a(nu.c, $$0).a(nu.j, $$0).a(nu.k, $$1).a(nu.n, $$3);
      akf $$5 = ns.b.a(dcx.pb, $$4, this.c);
      this.b.accept(ni.a(dcx.pb, nl.a().a(nm.c, $$5)).a(nj.a(dqo.T).a($$0x -> this.a($$0x, nl.a()))));
   }

   private void aD() {
      dcv $$0 = dcx.n;
      akf $$1 = nq.a($$0);
      nv $$2 = nv.a.get($$0);
      dcv $$3 = dcx.jH;
      akf $$4 = ns.ab.a($$3, $$2.b(), this.c);
      akf $$5 = ns.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lf.a().filter(lg::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dcx.rf).a(lf.w).a(dcx.rf, dcx.rD).a(dcx.rj, dcx.rn).a(lf.y);
      this.h(dcx.re).a(lf.A).a(dcx.re, dcx.rC).a(dcx.ri, dcx.rm).a(lf.C);
      this.h(dcx.rd).a(lf.E).a(dcx.rd, dcx.rB).a(dcx.rh, dcx.rl).a(lf.G);
      this.h(dcx.rc).a(lf.I).a(dcx.rc, dcx.rA).a(dcx.rg, dcx.rk).a(lf.K);
      this.w(dcx.sk);
      this.w(dcx.sl);
      this.w(dcx.sm);
      this.w(dcx.sn);
      this.i(dcx.sk, dcx.so);
      this.i(dcx.sl, dcx.sp);
      this.i(dcx.sm, dcx.sq);
      this.i(dcx.sn, dcx.sr);
      this.m(dcx.a);
      this.c(dcx.nc, dcx.a);
      this.c(dcx.nb, dcx.a);
      this.m(dcx.fO);
      this.m(dcx.dQ);
      this.c(dcx.nd, dcx.G);
      this.m(dcx.fA);
      this.m(dcx.me);
      this.m(dcx.fr);
      this.m(dcx.fR);
      this.a(csg.ue);
      this.m(dcx.pg);
      this.m(dcx.G);
      this.m(dcx.H);
      this.m(dcx.hV);
      this.a(csg.fS);
      this.o(dcx.pM, dcx.qd);
      this.o(dcx.pN, dcx.qe);
      this.o(dcx.pO, dcx.qf);
      this.o(dcx.pP, dcx.qg);
      this.o(dcx.pQ, dcx.qh);
      this.o(dcx.pR, dcx.qi);
      this.o(dcx.pS, dcx.qj);
      this.o(dcx.pT, dcx.qk);
      this.o(dcx.pU, dcx.ql);
      this.o(dcx.pV, dcx.qm);
      this.o(dcx.pW, dcx.qn);
      this.o(dcx.pX, dcx.qo);
      this.o(dcx.pY, dcx.qp);
      this.o(dcx.pZ, dcx.qq);
      this.o(dcx.qa, dcx.qr);
      this.o(dcx.qb, dcx.qs);
      this.o(dcx.pL, dcx.qc);
      this.m(dcx.na);
      this.m(dcx.gs);
      this.m(dcx.qP);
      this.m(dcx.sx);
      this.s(dcx.sy);
      this.s(dcx.sz);
      this.t(dcx.ti);
      this.t(dcx.tj);
      this.aj();
      this.g(dcx.sC, dcx.sA);
      this.p(dcx.sB);
      this.a(dcx.hW, csg.hB);
      this.a(csg.hB);
      this.aE();
      this.a(dcx.kN, csg.jb);
      this.a(csg.jb);
      this.f(dcx.bQ, nt.a(dcx.by, "_side"));
      this.a(dcx.R);
      this.a(dcx.S);
      this.a(dcx.iB);
      this.a(dcx.cx);
      this.a(dcx.cy);
      this.a(dcx.cz);
      this.a(dcx.fE);
      this.a(dcx.fF);
      this.a(dcx.fJ);
      this.a(dcx.N);
      this.a(dcx.T);
      this.a(dcx.O);
      this.a(dcx.ch);
      this.a(dcx.P);
      this.a(dcx.Q);
      this.a(dcx.ci);
      this.b(dcx.pj, nv.d);
      this.a(dcx.pi);
      this.a(dcx.aR);
      this.a(dcx.aS);
      this.a(dcx.aT);
      this.a(dcx.hb);
      this.a(dcx.dI);
      this.a(dcx.dJ);
      this.a(dcx.ha);
      this.a(dcx.pC);
      this.a(dcx.mW);
      this.a(dcx.dR);
      this.a(dcx.k);
      this.a(dcx.pk);
      this.a(dcx.fz);
      this.a(dcx.ec);
      this.a(dcx.L);
      this.a(dcx.ph);
      this.a(dcx.dO);
      this.b(dcx.dT, nv.g);
      this.b(dcx.pq, nv.d);
      this.b(dcx.fa, nv.d);
      this.m(dcx.ac);
      this.m(dcx.ga);
      this.a(dcx.kK);
      this.a(dcx.aY);
      this.a(dcx.iC);
      this.a(dcx.co);
      this.a(dcx.pK);
      this.a(dcx.ii);
      this.a(dcx.oy);
      this.a(dcx.dW);
      this.a(dcx.dX);
      this.b(dcx.ct, nv.b);
      this.a(dcx.aO);
      this.b(dcx.bw, nv.v);
      this.a(csg.cS);
      this.b(dcx.ck, nv.f);
      this.b(dcx.pd, nv.d);
      this.a(dcx.op);
      this.a(dcx.aP);
      this.a(dcx.qt);
      this.a(dcx.qu);
      this.a(dcx.qN);
      this.a(dcx.su);
      this.a(dcx.tf);
      this.a(dcx.tg);
      this.a(dcx.th);
      this.e(dcx.qS);
      this.m(dcx.tt);
      this.aD();
      this.a(dcx.ra);
      this.a(dcx.rb);
      this.a(dcx.qW);
      this.a(dcx.qX);
      this.a(dcx.qY);
      this.a(dcx.qZ);
      this.k(dcx.qW, dcx.rw);
      this.k(dcx.qX, dcx.ry);
      this.k(dcx.qY, dcx.rx);
      this.k(dcx.qZ, dcx.rz);
      this.i(dcx.rM);
      this.i(dcx.rN);
      this.i(dcx.rP);
      this.i(dcx.rO);
      this.a(dcx.rM, dcx.rQ);
      this.a(dcx.rN, dcx.rR);
      this.a(dcx.rP, dcx.rT);
      this.a(dcx.rO, dcx.rS);
      this.k(dcx.rU);
      this.k(dcx.rV);
      this.k(dcx.rX);
      this.k(dcx.rW);
      this.b(dcx.rU, dcx.rY);
      this.b(dcx.rV, dcx.rZ);
      this.b(dcx.rX, dcx.sb);
      this.b(dcx.rW, dcx.sa);
      this.a(dcx.sc);
      this.a(dcx.sd);
      this.a(dcx.se);
      this.a(dcx.sf);
      this.k(dcx.sc, dcx.sg);
      this.k(dcx.sd, dcx.sh);
      this.k(dcx.se, dcx.si);
      this.k(dcx.sf, dcx.sj);
      this.j(dcx.gW, dcx.ch);
      this.j(dcx.gX, dcx.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dcx.og, dcx.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dcx.kt);
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
      this.F(dcx.ff);
      this.F(dcx.fg);
      this.F(dcx.qT);
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
      this.E(dcx.cO);
      this.d(dcx.cO);
      this.E(dcx.oa);
      this.g();
      this.E(dcx.sE);
      this.l(dcx.cp, dcx.cq);
      this.l(dcx.ea, dcx.eb);
      this.a(dcx.cA, dcx.n, nt::c);
      this.a(dcx.nY, dcx.p, nt::d);
      this.y(dcx.ow);
      this.y(dcx.on);
      this.v(dcx.aU);
      this.v(dcx.hi);
      this.C();
      this.D(dcx.oe);
      this.D(dcx.of);
      this.e(dcx.eX, nq.a(dcx.eX));
      this.a(dcx.dY, nv.d);
      this.a(dcx.dZ, nv.d);
      this.a(dcx.te);
      this.a(dcx.kM, nv.d);
      this.f(dcx.j);
      this.f(dcx.sH);
      this.f(dcx.I);
      this.g(dcx.J);
      this.g(dcx.M);
      this.f(dcx.K);
      this.e(dcx.F);
      this.b(dcx.to, nv.f);
      this.a(dcx.ij, nv.d, nv.e);
      this.a(dcx.kx, nv.w, nv.x);
      this.a(dcx.hf, nv.w, nv.x);
      this.a(dcx.tk, nv.d, nv.e);
      this.a(dcx.tl, nv.d, nv.e);
      this.a(dcx.tm, nv.d, nv.e);
      this.c(dcx.nT, nv.i);
      this.z();
      this.a(dcx.pe, nt::A);
      this.a(dcx.pf, nt::C);
      this.a(dcx.kD, dqo.as, 0, 1, 2, 3);
      this.a(dcx.gt, dqo.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dcx.fq, dqo.as, 0, 1, 1, 2);
      this.a(dcx.gu, dqo.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dcx.cB, dqo.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dcx.kA, nc.e.b, dqo.aq, 0, 1);
      this.i();
      this.h();
      this.a(nq.a("decorated_pot"), dcx.iA).b(dcx.tp);
      this.a(nq.a("banner"), dcx.n)
         .a(ns.bF, dcx.iJ, dcx.iK, dcx.iL, dcx.iM, dcx.iN, dcx.iO, dcx.iP, dcx.iQ, dcx.iR, dcx.iS, dcx.iT, dcx.iU, dcx.iV, dcx.iW, dcx.iX, dcx.iY)
         .b(dcx.iZ, dcx.ja, dcx.jb, dcx.jc, dcx.jd, dcx.je, dcx.jf, dcx.jg, dcx.jh, dcx.ji, dcx.jj, dcx.jk, dcx.jl, dcx.jm, dcx.jn, dcx.jo);
      this.a(nq.a("bed"), dcx.n)
         .b(dcx.aZ, dcx.ba, dcx.bb, dcx.bc, dcx.bd, dcx.be, dcx.bf, dcx.bg, dcx.bh, dcx.bi, dcx.bj, dcx.bk, dcx.bl, dcx.bm, dcx.bn, dcx.bo);
      this.m(dcx.aZ, dcx.bA);
      this.m(dcx.ba, dcx.bB);
      this.m(dcx.bb, dcx.bC);
      this.m(dcx.bc, dcx.bD);
      this.m(dcx.bd, dcx.bE);
      this.m(dcx.be, dcx.bF);
      this.m(dcx.bf, dcx.bG);
      this.m(dcx.bg, dcx.bH);
      this.m(dcx.bh, dcx.bI);
      this.m(dcx.bi, dcx.bJ);
      this.m(dcx.bj, dcx.bK);
      this.m(dcx.bk, dcx.bL);
      this.m(dcx.bl, dcx.bM);
      this.m(dcx.bm, dcx.bN);
      this.m(dcx.bn, dcx.bO);
      this.m(dcx.bo, dcx.bP);
      this.a(nq.a("skull"), dcx.dW)
         .a(ns.bG, dcx.gM, dcx.gK, dcx.gI, dcx.gE, dcx.gG, dcx.gQ)
         .a(dcx.gO)
         .b(dcx.gN, dcx.gP, dcx.gL, dcx.gJ, dcx.gF, dcx.gH, dcx.gR);
      this.G(dcx.kP);
      this.G(dcx.kQ);
      this.G(dcx.kR);
      this.G(dcx.kS);
      this.G(dcx.kT);
      this.G(dcx.kU);
      this.G(dcx.kV);
      this.G(dcx.kW);
      this.G(dcx.kX);
      this.G(dcx.kY);
      this.G(dcx.kZ);
      this.G(dcx.la);
      this.G(dcx.lb);
      this.G(dcx.lc);
      this.G(dcx.ld);
      this.G(dcx.le);
      this.G(dcx.lf);
      this.b(dcx.mX, nv.q);
      this.c(dcx.mX);
      this.a(nq.a("chest"), dcx.n).b(dcx.cv, dcx.gV);
      this.a(nq.a("ender_chest"), dcx.co).b(dcx.fG);
      this.f(dcx.fx, dcx.co).a(dcx.fx, dcx.kF);
      this.a(dcx.aM);
      this.a(dcx.aN);
      this.a(dcx.lw);
      this.a(dcx.lx);
      this.a(dcx.ly);
      this.a(dcx.lz);
      this.a(dcx.lA);
      this.a(dcx.lB);
      this.a(dcx.lC);
      this.a(dcx.lD);
      this.a(dcx.lE);
      this.a(dcx.lF);
      this.a(dcx.lG);
      this.a(dcx.lH);
      this.a(dcx.lI);
      this.a(dcx.lJ);
      this.a(dcx.lK);
      this.a(dcx.lL);
      this.a(nv.a, dcx.lM, dcx.lN, dcx.lO, dcx.lP, dcx.lQ, dcx.lR, dcx.lS, dcx.lT, dcx.lU, dcx.lV, dcx.lW, dcx.lX, dcx.lY, dcx.lZ, dcx.ma, dcx.mb);
      this.a(dcx.iA);
      this.a(dcx.hj);
      this.a(dcx.hk);
      this.a(dcx.hl);
      this.a(dcx.hm);
      this.a(dcx.hn);
      this.a(dcx.ho);
      this.a(dcx.hp);
      this.a(dcx.hq);
      this.a(dcx.hr);
      this.a(dcx.hs);
      this.a(dcx.ht);
      this.a(dcx.hu);
      this.a(dcx.hv);
      this.a(dcx.hw);
      this.a(dcx.hx);
      this.a(dcx.hy);
      this.a(dcx.qO);
      this.h(dcx.aQ, dcx.eY);
      this.h(dcx.ei, dcx.hz);
      this.h(dcx.ej, dcx.hA);
      this.h(dcx.ek, dcx.hB);
      this.h(dcx.el, dcx.hC);
      this.h(dcx.em, dcx.hD);
      this.h(dcx.en, dcx.hE);
      this.h(dcx.eo, dcx.hF);
      this.h(dcx.ep, dcx.hG);
      this.h(dcx.eq, dcx.hH);
      this.h(dcx.er, dcx.hI);
      this.h(dcx.es, dcx.hJ);
      this.h(dcx.et, dcx.hK);
      this.h(dcx.eu, dcx.hL);
      this.h(dcx.ev, dcx.hM);
      this.h(dcx.ew, dcx.hN);
      this.h(dcx.ex, dcx.hO);
      this.b(nv.o, dcx.lg, dcx.lh, dcx.li, dcx.lj, dcx.lk, dcx.ll, dcx.lm, dcx.ln, dcx.lo, dcx.lp, dcx.lq, dcx.lr, dcx.ls, dcx.lt, dcx.lu, dcx.lv);
      this.g(dcx.bA, dcx.ik);
      this.g(dcx.bB, dcx.il);
      this.g(dcx.bC, dcx.im);
      this.g(dcx.bD, dcx.in);
      this.g(dcx.bE, dcx.io);
      this.g(dcx.bF, dcx.ip);
      this.g(dcx.bG, dcx.iq);
      this.g(dcx.bH, dcx.ir);
      this.g(dcx.bI, dcx.is);
      this.g(dcx.bJ, dcx.it);
      this.g(dcx.bK, dcx.iu);
      this.g(dcx.bL, dcx.iv);
      this.g(dcx.bM, dcx.iw);
      this.g(dcx.bN, dcx.ix);
      this.g(dcx.bO, dcx.iy);
      this.g(dcx.bP, dcx.iz);
      this.a(dcx.sI);
      this.a(dcx.eL);
      this.a(dcx.bu, dcx.gb, nc.e.a);
      this.a(dcx.bR, dcx.gc, nc.e.b);
      this.a(dcx.bT, dcx.gd, nc.e.b);
      this.a(dcx.bU, dcx.ge, nc.e.b);
      this.a(dcx.bV, dcx.gf, nc.e.b);
      this.a(dcx.bW, dcx.gg, nc.e.b);
      this.a(dcx.bX, dcx.gh, nc.e.b);
      this.a(dcx.bY, dcx.gi, nc.e.b);
      this.a(dcx.bZ, dcx.gj, nc.e.b);
      this.a(dcx.ca, dcx.gk, nc.e.b);
      this.a(dcx.cb, dcx.gl, nc.e.b);
      this.a(dcx.cc, dcx.gm, nc.e.b);
      this.a(dcx.ce, dcx.gn, nc.e.b);
      this.a(dcx.cd, dcx.go, nc.e.b);
      this.a(dcx.cg, dcx.gp, nc.e.b);
      this.a(dcx.cf, dcx.gq, nc.e.b);
      this.a(dcx.bv, dcx.gr, nc.e.b);
      this.a(dcx.bS, dcx.fS, nc.e.b);
      this.H();
      this.u(dcx.eT);
      this.u(dcx.eU);
      this.u(dcx.eV);
      this.a(dcx.bt, nc.e.a);
      this.b(dcx.dS, nc.e.a);
      this.a(csg.dJ);
      this.b(dcx.mc, dcx.md, nc.e.b);
      this.a(csg.dK);
      this.c(dcx.md);
      this.b(dcx.sG, nc.e.b);
      this.c(dcx.sG);
      this.c(dcx.sw);
      this.b(dcx.oz, dcx.oA, nc.e.b);
      this.b(dcx.oB, dcx.oC, nc.e.b);
      this.a(dcx.oz, "_plant");
      this.c(dcx.oA);
      this.a(dcx.oB, "_plant");
      this.c(dcx.oC);
      this.a(dcx.mY, nc.e.a, nt.c(nt.a(dcx.mZ, "_stage0")));
      this.m();
      this.a(dcx.bs, nc.e.b);
      this.c(dcx.iE, nc.e.b);
      this.c(dcx.iF, nc.e.b);
      this.c(dcx.iG, nc.e.b);
      this.c(dcx.iH, nc.e.a);
      this.c(dcx.iI, nc.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dcx.mw, dcx.mr, dcx.mm, dcx.mh, dcx.mG, dcx.mB, dcx.mQ, dcx.mL);
      this.a(dcx.mx, dcx.ms, dcx.mn, dcx.mi, dcx.mH, dcx.mC, dcx.mR, dcx.mM);
      this.a(dcx.my, dcx.mt, dcx.mo, dcx.mj, dcx.mI, dcx.mD, dcx.mS, dcx.mN);
      this.a(dcx.mz, dcx.mu, dcx.mp, dcx.mk, dcx.mJ, dcx.mE, dcx.mT, dcx.mO);
      this.a(dcx.mA, dcx.mv, dcx.mq, dcx.ml, dcx.mK, dcx.mF, dcx.mU, dcx.mP);
      this.e(dcx.fe, dcx.fc);
      this.e(dcx.fd, dcx.fb);
      this.l(dcx.ab).c(dcx.ab).a(dcx.av);
      this.l(dcx.am).c(dcx.am).a(dcx.aD);
      this.a(dcx.am, dcx.dj, dcx.ds);
      this.b(dcx.aL, nv.s);
      this.l(dcx.Y).c(dcx.Y).a(dcx.as);
      this.l(dcx.ai).c(dcx.ai).a(dcx.aA);
      this.a(dcx.ai, dcx.dd, dcx.do);
      this.a(dcx.B, dcx.fX, nc.e.b);
      this.b(dcx.aI, nv.s);
      this.l(dcx.Z).d(dcx.Z).a(dcx.at);
      this.l(dcx.aj).d(dcx.aj).a(dcx.aB);
      this.a(dcx.aj, dcx.de, dcx.dp);
      this.a(dcx.C, dcx.fY, nc.e.b);
      this.b(dcx.aJ, nv.s);
      this.l(dcx.W).c(dcx.W).a(dcx.aq);
      this.l(dcx.ag).c(dcx.ag).a(dcx.ay);
      this.a(dcx.ag, dcx.dc, dcx.dn);
      this.a(dcx.z, dcx.fV, nc.e.b);
      this.b(dcx.aG, nv.s);
      this.l(dcx.U).c(dcx.U).a(dcx.ao);
      this.l(dcx.al).c(dcx.al).a(dcx.aw);
      this.a(dcx.al, dcx.da, dcx.dl);
      this.a(dcx.x, dcx.fT, nc.e.b);
      this.b(dcx.aE, nv.s);
      this.l(dcx.V).c(dcx.V).a(dcx.ap);
      this.l(dcx.af).c(dcx.af).a(dcx.ax);
      this.a(dcx.af, dcx.db, dcx.dm);
      this.a(dcx.y, dcx.fU, nc.e.b);
      this.b(dcx.aF, nv.s);
      this.l(dcx.aa).c(dcx.aa).a(dcx.au);
      this.l(dcx.ak).c(dcx.ak).a(dcx.aC);
      this.a(dcx.ak, dcx.dg, dcx.dr);
      this.a(dcx.D, dcx.fZ, nc.e.b);
      this.b(dcx.aK, nv.s);
      this.l(dcx.X).c(dcx.X).a(dcx.ar);
      this.l(dcx.ah).c(dcx.ah).a(dcx.az);
      this.a(dcx.ah, dcx.df, dcx.dq);
      this.a(dcx.A, dcx.fW, nc.e.b);
      this.b(dcx.aH, nv.s);
      this.l(dcx.os).b(dcx.os).a(dcx.ou);
      this.l(dcx.ot).b(dcx.ot).a(dcx.ov);
      this.a(dcx.ot, dcx.dh, dcx.dt);
      this.a(dcx.ox, dcx.pm, nc.e.b);
      this.n(dcx.oD, dcx.po);
      this.l(dcx.oj).b(dcx.oj).a(dcx.ol);
      this.l(dcx.ok).b(dcx.ok).a(dcx.om);
      this.a(dcx.ok, dcx.di, dcx.du);
      this.a(dcx.oo, dcx.pn, nc.e.b);
      this.n(dcx.oq, dcx.pp);
      this.l(dcx.ae).d(dcx.ae);
      this.l(dcx.an).d(dcx.an);
      this.a(dcx.v, dcx.dk, dcx.dv);
      this.b(dcx.or, nc.e.b);
      this.a(csg.dG);
      this.i(dcx.dy);
      this.k(dcx.hY);
      this.u();
      this.n(dcx.cP);
      this.o(dcx.bp);
      this.o(dcx.bq);
      this.o(dcx.hh);
      this.t();
      this.q(dcx.fN);
      this.q(dcx.kG);
      this.q(dcx.kH);
      this.r(dcx.gS);
      this.r(dcx.gT);
      this.r(dcx.gU);
      this.o();
      this.p();
      this.d(dcx.cD, nv.h);
      this.d(dcx.nW, nv.h);
      this.d(dcx.nV, nv.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dcx.eK, dcx.eS);
      this.k(dcx.m, dcx.eO);
      this.k(dcx.eJ, dcx.eR);
      this.k(dcx.eI, dcx.eQ);
      this.az();
      this.k(dcx.eH, dcx.eP);
      this.aA();
      cti.h().forEach($$0 -> this.a($$0, nq.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dcx.hX);
      nj.a<Integer> $$0 = nj.a(dqo.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akf $$3 = nt.a(csg.hC, $$2);
         $$0.a($$1, nl.a().a(nm.c, ns.aa.a(dcx.hX, $$2, nt.h($$3), this.c)));
         ns.bx.a(nq.a(csg.hC, $$2), nt.k($$3), this.c);
      }

      this.b.accept(ni.a(dcx.hX).a($$0));
   }

   private void o(dcv $$0, dcv $$1) {
      this.a($$0.p());
      nt $$2 = nt.b(nt.G($$0));
      nt $$3 = nt.b(nt.a($$0, "_lit"));
      akf $$4 = ns.bH.a($$0, "_one_candle", $$2, this.c);
      akf $$5 = ns.bI.a($$0, "_two_candles", $$2, this.c);
      akf $$6 = ns.bJ.a($$0, "_three_candles", $$2, this.c);
      akf $$7 = ns.bK.a($$0, "_four_candles", $$2, this.c);
      akf $$8 = ns.bH.a($$0, "_one_candle_lit", $$3, this.c);
      akf $$9 = ns.bI.a($$0, "_two_candles_lit", $$3, this.c);
      akf $$10 = ns.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      akf $$11 = ns.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            ni.a($$0)
               .a(
                  nj.a(dqo.az, dqo.r)
                     .a(1, false, nl.a().a(nm.c, $$4))
                     .a(2, false, nl.a().a(nm.c, $$5))
                     .a(3, false, nl.a().a(nm.c, $$6))
                     .a(4, false, nl.a().a(nm.c, $$7))
                     .a(1, true, nl.a().a(nm.c, $$8))
                     .a(2, true, nl.a().a(nm.c, $$9))
                     .a(3, true, nl.a().a(nm.c, $$10))
                     .a(4, true, nl.a().a(nm.c, $$11))
               )
         );
      akf $$12 = ns.bL.a($$1, nt.a($$0, false), this.c);
      akf $$13 = ns.bL.a($$1, "_lit", nt.a($$0, true), this.c);
      this.b.accept(ni.a($$1).a(a(dqo.r, $$13, $$12)));
   }

   class a {
      private final akf b;

      public a(akf $$0, dcv $$1) {
         this.b = ns.aa.a($$0, nt.u($$1), nc.this.c);
      }

      public nc.a a(dcv... $$0) {
         for (dcv $$1 : $$0) {
            nc.this.b.accept(nc.c($$1, this.b));
         }

         return this;
      }

      public nc.a b(dcv... $$0) {
         for (dcv $$1 : $$0) {
            nc.this.c($$1);
         }

         return this.a($$0);
      }

      public nc.a a(nr $$0, dcv... $$1) {
         for (dcv $$2 : $$1) {
            $$0.a(nq.a($$2.p()), nt.u($$2), nc.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final nt b;
      private final Map<nr, akf> c = Maps.newHashMap();
      @Nullable
      private lg d;
      @Nullable
      private akf e;
      private final Set<dcv> f = new HashSet<>();

      public b(nt $$0) {
         this.b = $$0;
      }

      public nc.b a(dcv $$0, nr $$1) {
         this.e = $$1.a($$0, this.b, nc.this.c);
         if (nc.this.f.containsKey($$0)) {
            nc.this.b.accept(nc.this.f.get($$0).create($$0, this.e, this.b, nc.this.c));
         } else {
            nc.this.b.accept(nc.c($$0, this.e));
         }

         return this;
      }

      public nc.b a(dcv $$0, dcv $$1) {
         akf $$2 = nq.a($$0);
         nc.this.b.accept(nc.c($$1, $$2));
         nc.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nc.b a(dcv $$0) {
         akf $$1 = ns.s.a($$0, this.b, nc.this.c);
         akf $$2 = ns.t.a($$0, this.b, nc.this.c);
         nc.this.b.accept(nc.b($$0, $$1, $$2));
         akf $$3 = ns.u.a($$0, this.b, nc.this.c);
         nc.this.a($$0, $$3);
         return this;
      }

      public nc.b b(dcv $$0) {
         akf $$1 = ns.M.a($$0, this.b, nc.this.c);
         akf $$2 = ns.N.a($$0, this.b, nc.this.c);
         akf $$3 = ns.O.a($$0, this.b, nc.this.c);
         nc.this.b.accept(nc.a($$0, $$1, $$2, $$3));
         akf $$4 = ns.P.a($$0, this.b, nc.this.c);
         nc.this.a($$0, $$4);
         return this;
      }

      public nc.b c(dcv $$0) {
         nt $$1 = nt.p($$0);
         akf $$2 = ns.D.a($$0, $$1, nc.this.c);
         akf $$3 = ns.E.a($$0, $$1, nc.this.c);
         akf $$4 = ns.F.a($$0, $$1, nc.this.c);
         akf $$5 = ns.G.a($$0, $$1, nc.this.c);
         akf $$6 = ns.H.a($$0, $$1, nc.this.c);
         nc.this.b.accept(nc.a($$0, $$2, $$3, $$4, $$5, $$6));
         akf $$7 = ns.I.a($$0, $$1, nc.this.c);
         nc.this.a($$0, $$7);
         return this;
      }

      public nc.b d(dcv $$0) {
         akf $$1 = ns.J.a($$0, this.b, nc.this.c);
         akf $$2 = ns.K.a($$0, this.b, nc.this.c);
         nc.this.b.accept(nc.c($$0, $$1, $$2));
         akf $$3 = ns.L.a($$0, this.b, nc.this.c);
         nc.this.a($$0, $$3);
         return this;
      }

      public nc.b e(dcv $$0) {
         nt $$1 = nt.p($$0);
         akf $$2 = ns.R.a($$0, $$1, nc.this.c);
         akf $$3 = ns.Q.a($$0, $$1, nc.this.c);
         akf $$4 = ns.T.a($$0, $$1, nc.this.c);
         akf $$5 = ns.S.a($$0, $$1, nc.this.c);
         nc.this.b.accept(nc.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nc.b f(dcv $$0) {
         akf $$1 = ns.V.a($$0, this.b, nc.this.c);
         akf $$2 = ns.U.a($$0, this.b, nc.this.c);
         akf $$3 = ns.X.a($$0, this.b, nc.this.c);
         akf $$4 = ns.W.a($$0, this.b, nc.this.c);
         nc.this.b.accept(nc.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nc.b g(dcv $$0) {
         akf $$1 = ns.Y.a($$0, this.b, nc.this.c);
         akf $$2 = ns.Z.a($$0, this.b, nc.this.c);
         nc.this.b.accept(nc.e($$0, $$1, $$2));
         return this;
      }

      public nc.b h(dcv $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dcv $$1 = this.d.b().get(lg.b.r);
            akf $$2 = ns.aa.a($$0, this.b, nc.this.c);
            nc.this.b.accept(nc.c($$0, $$2));
            nc.this.b.accept(nc.c($$1, $$2));
            nc.this.a($$0.p());
            nc.this.c($$1);
            return this;
         }
      }

      public nc.b i(dcv $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akf $$1 = this.a(ns.ab, $$0);
            akf $$2 = this.a(ns.ac, $$0);
            nc.this.b.accept(nc.e($$0, $$1, $$2, this.e));
            nc.this.a($$0, $$1);
            return this;
         }
      }

      public nc.b j(dcv $$0) {
         akf $$1 = this.a(ns.af, $$0);
         akf $$2 = this.a(ns.ae, $$0);
         akf $$3 = this.a(ns.ag, $$0);
         nc.this.b.accept(nc.b($$0, $$1, $$2, $$3));
         nc.this.a($$0, $$2);
         return this;
      }

      private nc.b k(dcv $$0) {
         nv $$1 = nc.this.g.getOrDefault($$0, nv.a.get($$0));
         akf $$2 = $$1.a($$0, nc.this.c);
         nc.this.b.accept(nc.c($$0, $$2));
         return this;
      }

      private nc.b l(dcv $$0) {
         nc.this.i($$0);
         return this;
      }

      private void m(dcv $$0) {
         if (nc.this.e.contains($$0)) {
            nc.this.k($$0);
         } else {
            nc.this.j($$0);
         }
      }

      private akf a(nr $$0, dcv $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nc.this.c));
      }

      public nc.b a(lg $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nc.b, dcv> $$2 = nc.h.get($$0x);
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
      nf create(dcv var1, akf var2, nt var3, BiConsumer<akf, Supplier<JsonElement>> var4);
   }

   static record d(nr a, String b) {
   }

   static enum e {
      a,
      b;

      public nr a() {
         return this == a ? ns.ap : ns.ao;
      }

      public nr b() {
         return this == a ? ns.ar : ns.aq;
      }
   }

   class f {
      private final nt b;

      public f(nt $$0) {
         this.b = $$0;
      }

      public nc.f a(dcv $$0) {
         nt $$1 = this.b.c(nu.d, this.b.a(nu.i));
         akf $$2 = ns.j.a($$0, $$1, nc.this.c);
         nc.this.b.accept(nc.d($$0, $$2));
         return this;
      }

      public nc.f b(dcv $$0) {
         akf $$1 = ns.j.a($$0, this.b, nc.this.c);
         nc.this.b.accept(nc.d($$0, $$1));
         return this;
      }

      public nc.f c(dcv $$0) {
         akf $$1 = ns.j.a($$0, this.b, nc.this.c);
         akf $$2 = ns.k.a($$0, this.b, nc.this.c);
         nc.this.b.accept(nc.d($$0, $$1, $$2));
         return this;
      }

      public nc.f d(dcv $$0) {
         nc.this.b.accept(nc.a($$0, this.b, nc.this.c));
         return this;
      }
   }
}
