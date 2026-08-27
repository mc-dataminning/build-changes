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

public class mr {
   final Consumer<mu> b;
   final BiConsumer<ajt, Supplier<JsonElement>> c;
   private final Consumer<cre> d;
   final List<dby> e = ImmutableList.of(dca.ey, dca.eE, dca.hY);
   final Map<dby, mr.c> f = ImmutableMap.builder().put(dca.b, mr::a).put(dca.sJ, mr::c).put(dca.eM, mr::b).build();
   final Map<dby, nk> g = ImmutableMap.builder()
      .put(dca.aV, nk.y.get(dca.aV))
      .put(dca.jp, nk.y.get(dca.jp))
      .put(dca.jS, nk.a(ni.a(dca.aV, "_top")))
      .put(dca.jU, nk.a(ni.a(dca.jp, "_top")))
      .put(dca.aX, nk.d.get(dca.aV).a($$0x -> $$0x.a(nj.i, ni.G(dca.aX))))
      .put(dca.jr, nk.d.get(dca.jp).a($$0x -> $$0x.a(nj.i, ni.G(dca.jr))))
      .put(dca.hd, nk.d.get(dca.hd))
      .put(dca.jT, nk.a(ni.a(dca.hd, "_bottom")))
      .put(dca.pr, nk.z.get(dca.pr))
      .put(dca.sJ, nk.z.get(dca.sJ))
      .put(dca.he, nk.d.get(dca.he).a($$0x -> $$0x.a(nj.i, ni.G(dca.he))))
      .put(dca.aW, nk.d.get(dca.aW).a($$0x -> {
         $$0x.a(nj.d, ni.a(dca.aV, "_top"));
         $$0x.a(nj.i, ni.G(dca.aW));
      }))
      .put(dca.jq, nk.d.get(dca.jq).a($$0x -> {
         $$0x.a(nj.d, ni.a(dca.jp, "_top"));
         $$0x.a(nj.i, ni.G(dca.jq));
      }))
      .put(dca.qM, nk.z.get(dca.qM))
      .put(dca.qH, nk.z.get(dca.qH))
      .build();
   static final Map<kv.b, BiConsumer<mr.b, dby>> h = ImmutableMap.builder()
      .put(kv.b.a, mr.b::a)
      .put(kv.b.e, mr.b::l)
      .put(kv.b.b, mr.b::k)
      .put(kv.b.c, mr.b::k)
      .put(kv.b.f, mr.b::c)
      .put(kv.b.g, mr.b::d)
      .put(kv.b.h, mr.b::e)
      .put(kv.b.i, mr.b::f)
      .put(kv.b.k, mr.b::h)
      .put(kv.b.l, mr.b::i)
      .put(kv.b.m, mr.b::j)
      .put(kv.b.n, mr.b::g)
      .put(kv.b.p, mr.b::m)
      .put(kv.b.q, mr.b::b)
      .build();
   public static final List<Pair<dpq, Function<ajt, na>>> a = List.of(
      Pair.of(dpp.L, (Function<ajt, na>)$$0 -> na.a().a(nb.c, $$0)),
      Pair.of(dpp.M, (Function<ajt, na>)$$0 -> na.a().a(nb.c, $$0).a(nb.b, nb.a.b).a(nb.d, true)),
      Pair.of(dpp.N, (Function<ajt, na>)$$0 -> na.a().a(nb.c, $$0).a(nb.b, nb.a.c).a(nb.d, true)),
      Pair.of(dpp.O, (Function<ajt, na>)$$0 -> na.a().a(nb.c, $$0).a(nb.b, nb.a.d).a(nb.d, true)),
      Pair.of(dpp.J, (Function<ajt, na>)$$0 -> na.a().a(nb.c, $$0).a(nb.a, nb.a.d).a(nb.d, true)),
      Pair.of(dpp.K, (Function<ajt, na>)$$0 -> na.a().a(nb.c, $$0).a(nb.a, nb.a.b).a(nb.d, true))
   );
   private static final Map<mr.d, ajt> i = new HashMap<>();

   private static mu a(dby $$0, ajt $$1, ni $$2, BiConsumer<ajt, Supplier<JsonElement>> $$3) {
      ajt $$4 = nh.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static mu b(dby $$0, ajt $$1, ni $$2, BiConsumer<ajt, Supplier<JsonElement>> $$3) {
      ajt $$4 = nh.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static mu c(dby $$0, ajt $$1, ni $$2, BiConsumer<ajt, Supplier<JsonElement>> $$3) {
      ajt $$4 = nh.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public mr(Consumer<mu> $$0, BiConsumer<ajt, Supplier<JsonElement>> $$1, Consumer<cre> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dby $$0) {
      this.d.accept($$0.p());
   }

   void a(dby $$0, ajt $$1) {
      this.c.accept(nf.a($$0.p()), new ne($$1));
   }

   private void a(cre $$0, ajt $$1) {
      this.c.accept(nf.a($$0), new ne($$1));
   }

   void a(cre $$0) {
      nh.bx.a(nf.a($$0), ni.b($$0), this.c);
   }

   private void d(dby $$0) {
      cre $$1 = $$0.p();
      if ($$1 != crm.a) {
         nh.bx.a(nf.a($$1), ni.F($$0), this.c);
      }
   }

   private void a(dby $$0, String $$1) {
      cre $$2 = $$0.p();
      nh.bx.a(nf.a($$2), ni.k(ni.a($$0, $$1)), this.c);
   }

   private static my b() {
      return my.a(dpp.R).a(ih.f, na.a().a(nb.b, nb.a.b)).a(ih.d, na.a().a(nb.b, nb.a.c)).a(ih.e, na.a().a(nb.b, nb.a.d)).a(ih.c, na.a());
   }

   private static my c() {
      return my.a(dpp.R).a(ih.d, na.a()).a(ih.e, na.a().a(nb.b, nb.a.b)).a(ih.c, na.a().a(nb.b, nb.a.c)).a(ih.f, na.a().a(nb.b, nb.a.d));
   }

   private static my d() {
      return my.a(dpp.R).a(ih.f, na.a()).a(ih.d, na.a().a(nb.b, nb.a.b)).a(ih.e, na.a().a(nb.b, nb.a.c)).a(ih.c, na.a().a(nb.b, nb.a.d));
   }

   private static my e() {
      return my.a(dpp.P)
         .a(ih.a, na.a().a(nb.a, nb.a.b))
         .a(ih.b, na.a().a(nb.a, nb.a.d))
         .a(ih.c, na.a())
         .a(ih.d, na.a().a(nb.b, nb.a.c))
         .a(ih.e, na.a().a(nb.b, nb.a.d))
         .a(ih.f, na.a().a(nb.b, nb.a.b));
   }

   private static mx b(dby $$0, ajt $$1) {
      return mx.a($$0, a($$1));
   }

   private static na[] a(ajt $$0) {
      return new na[]{na.a().a(nb.c, $$0), na.a().a(nb.c, $$0).a(nb.b, nb.a.b), na.a().a(nb.c, $$0).a(nb.b, nb.a.c), na.a().a(nb.c, $$0).a(nb.b, nb.a.d)};
   }

   private static mx a(dby $$0, ajt $$1, ajt $$2) {
      return mx.a($$0, na.a().a(nb.c, $$1), na.a().a(nb.c, $$2), na.a().a(nb.c, $$1).a(nb.b, nb.a.c), na.a().a(nb.c, $$2).a(nb.b, nb.a.c));
   }

   private static my a(dpq $$0, ajt $$1, ajt $$2) {
      return my.a($$0).a(true, na.a().a(nb.c, $$1)).a(false, na.a().a(nb.c, $$2));
   }

   private void e(dby $$0) {
      ajt $$1 = nk.a.create($$0, this.c);
      ajt $$2 = nk.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dby $$0) {
      ajt $$1 = nk.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dby $$0) {
      this.b.accept(mx.a($$0).a(my.a(dpp.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ajt $$3 = ni.a($$0, $$2);
         return na.a().a(nb.c, nh.c.a($$0, $$2, new ni().a(nj.a, $$3), this.c));
      })));
      this.a($$0, ni.a($$0, "_0"));
   }

   static mu b(dby $$0, ajt $$1, ajt $$2) {
      return mx.a($$0)
         .a(my.a(dpp.w).a(false, na.a().a(nb.c, $$1)).a(true, na.a().a(nb.c, $$2)))
         .a(
            my.a(dpp.U, dpp.R)
               .a(dpk.a, ih.f, na.a().a(nb.b, nb.a.b))
               .a(dpk.a, ih.e, na.a().a(nb.b, nb.a.d))
               .a(dpk.a, ih.d, na.a().a(nb.b, nb.a.c))
               .a(dpk.a, ih.c, na.a())
               .a(dpk.b, ih.f, na.a().a(nb.b, nb.a.b).a(nb.a, nb.a.b).a(nb.d, true))
               .a(dpk.b, ih.e, na.a().a(nb.b, nb.a.d).a(nb.a, nb.a.b).a(nb.d, true))
               .a(dpk.b, ih.d, na.a().a(nb.b, nb.a.c).a(nb.a, nb.a.b).a(nb.d, true))
               .a(dpk.b, ih.c, na.a().a(nb.a, nb.a.b).a(nb.d, true))
               .a(dpk.c, ih.f, na.a().a(nb.b, nb.a.d).a(nb.a, nb.a.c))
               .a(dpk.c, ih.e, na.a().a(nb.b, nb.a.b).a(nb.a, nb.a.c))
               .a(dpk.c, ih.d, na.a().a(nb.a, nb.a.c))
               .a(dpk.c, ih.c, na.a().a(nb.b, nb.a.c).a(nb.a, nb.a.c))
         );
   }

   private static my.d<ih, dpv, dpu, Boolean> a(my.d<ih, dpv, dpu, Boolean> $$0, dpv $$1, ajt $$2, ajt $$3, ajt $$4, ajt $$5) {
      return $$0.a(ih.f, $$1, dpu.a, false, na.a().a(nb.c, $$2))
         .a(ih.d, $$1, dpu.a, false, na.a().a(nb.c, $$2).a(nb.b, nb.a.b))
         .a(ih.e, $$1, dpu.a, false, na.a().a(nb.c, $$2).a(nb.b, nb.a.c))
         .a(ih.c, $$1, dpu.a, false, na.a().a(nb.c, $$2).a(nb.b, nb.a.d))
         .a(ih.f, $$1, dpu.b, false, na.a().a(nb.c, $$4))
         .a(ih.d, $$1, dpu.b, false, na.a().a(nb.c, $$4).a(nb.b, nb.a.b))
         .a(ih.e, $$1, dpu.b, false, na.a().a(nb.c, $$4).a(nb.b, nb.a.c))
         .a(ih.c, $$1, dpu.b, false, na.a().a(nb.c, $$4).a(nb.b, nb.a.d))
         .a(ih.f, $$1, dpu.a, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.b))
         .a(ih.d, $$1, dpu.a, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.c))
         .a(ih.e, $$1, dpu.a, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.d))
         .a(ih.c, $$1, dpu.a, true, na.a().a(nb.c, $$3))
         .a(ih.f, $$1, dpu.b, true, na.a().a(nb.c, $$5).a(nb.b, nb.a.d))
         .a(ih.d, $$1, dpu.b, true, na.a().a(nb.c, $$5))
         .a(ih.e, $$1, dpu.b, true, na.a().a(nb.c, $$5).a(nb.b, nb.a.b))
         .a(ih.c, $$1, dpu.b, true, na.a().a(nb.c, $$5).a(nb.b, nb.a.c));
   }

   private static mu a(dby $$0, ajt $$1, ajt $$2, ajt $$3, ajt $$4, ajt $$5, ajt $$6, ajt $$7, ajt $$8) {
      return mx.a($$0).a(a(a(my.a(dpp.R, dpp.ae, dpp.be, dpp.u), dpv.b, $$1, $$2, $$3, $$4), dpv.a, $$5, $$6, $$7, $$8));
   }

   static mu a(dby $$0, ajt $$1, ajt $$2, ajt $$3, ajt $$4, ajt $$5) {
      return mw.a($$0)
         .a(na.a().a(nb.c, $$1))
         .a(mv.a().a(dpp.L, true), na.a().a(nb.c, $$2).a(nb.d, false))
         .a(mv.a().a(dpp.M, true), na.a().a(nb.c, $$3).a(nb.d, false))
         .a(mv.a().a(dpp.N, true), na.a().a(nb.c, $$4).a(nb.d, false))
         .a(mv.a().a(dpp.O, true), na.a().a(nb.c, $$5).a(nb.d, false));
   }

   static mu c(dby $$0, ajt $$1, ajt $$2) {
      return mw.a($$0)
         .a(na.a().a(nb.c, $$1))
         .a(mv.a().a(dpp.L, true), na.a().a(nb.c, $$2).a(nb.d, true))
         .a(mv.a().a(dpp.M, true), na.a().a(nb.c, $$2).a(nb.b, nb.a.b).a(nb.d, true))
         .a(mv.a().a(dpp.N, true), na.a().a(nb.c, $$2).a(nb.b, nb.a.c).a(nb.d, true))
         .a(mv.a().a(dpp.O, true), na.a().a(nb.c, $$2).a(nb.b, nb.a.d).a(nb.d, true));
   }

   static mu a(dby $$0, ajt $$1, ajt $$2, ajt $$3) {
      return mw.a($$0)
         .a(mv.a().a(dpp.J, true), na.a().a(nb.c, $$1))
         .a(mv.a().a(dpp.X, dql.b), na.a().a(nb.c, $$2).a(nb.d, true))
         .a(mv.a().a(dpp.W, dql.b), na.a().a(nb.c, $$2).a(nb.b, nb.a.b).a(nb.d, true))
         .a(mv.a().a(dpp.Y, dql.b), na.a().a(nb.c, $$2).a(nb.b, nb.a.c).a(nb.d, true))
         .a(mv.a().a(dpp.Z, dql.b), na.a().a(nb.c, $$2).a(nb.b, nb.a.d).a(nb.d, true))
         .a(mv.a().a(dpp.X, dql.c), na.a().a(nb.c, $$3).a(nb.d, true))
         .a(mv.a().a(dpp.W, dql.c), na.a().a(nb.c, $$3).a(nb.b, nb.a.b).a(nb.d, true))
         .a(mv.a().a(dpp.Y, dql.c), na.a().a(nb.c, $$3).a(nb.b, nb.a.c).a(nb.d, true))
         .a(mv.a().a(dpp.Z, dql.c), na.a().a(nb.c, $$3).a(nb.b, nb.a.d).a(nb.d, true));
   }

   static mu a(dby $$0, ajt $$1, ajt $$2, ajt $$3, ajt $$4, boolean $$5) {
      return mx.a($$0, na.a().a(nb.d, $$5))
         .a(c())
         .a(
            my.a(dpp.q, dpp.u)
               .a(false, false, na.a().a(nb.c, $$2))
               .a(true, false, na.a().a(nb.c, $$4))
               .a(false, true, na.a().a(nb.c, $$1))
               .a(true, true, na.a().a(nb.c, $$3))
         );
   }

   static mu b(dby $$0, ajt $$1, ajt $$2, ajt $$3) {
      return mx.a($$0)
         .a(
            my.a(dpp.R, dpp.af, dpp.bi)
               .a(ih.f, dpy.b, dqi.a, na.a().a(nb.c, $$2))
               .a(ih.e, dpy.b, dqi.a, na.a().a(nb.c, $$2).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.d, dpy.b, dqi.a, na.a().a(nb.c, $$2).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.c, dpy.b, dqi.a, na.a().a(nb.c, $$2).a(nb.b, nb.a.d).a(nb.d, true))
               .a(ih.f, dpy.b, dqi.e, na.a().a(nb.c, $$3))
               .a(ih.e, dpy.b, dqi.e, na.a().a(nb.c, $$3).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.d, dpy.b, dqi.e, na.a().a(nb.c, $$3).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.c, dpy.b, dqi.e, na.a().a(nb.c, $$3).a(nb.b, nb.a.d).a(nb.d, true))
               .a(ih.f, dpy.b, dqi.d, na.a().a(nb.c, $$3).a(nb.b, nb.a.d).a(nb.d, true))
               .a(ih.e, dpy.b, dqi.d, na.a().a(nb.c, $$3).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.d, dpy.b, dqi.d, na.a().a(nb.c, $$3))
               .a(ih.c, dpy.b, dqi.d, na.a().a(nb.c, $$3).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.f, dpy.b, dqi.c, na.a().a(nb.c, $$1))
               .a(ih.e, dpy.b, dqi.c, na.a().a(nb.c, $$1).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.d, dpy.b, dqi.c, na.a().a(nb.c, $$1).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.c, dpy.b, dqi.c, na.a().a(nb.c, $$1).a(nb.b, nb.a.d).a(nb.d, true))
               .a(ih.f, dpy.b, dqi.b, na.a().a(nb.c, $$1).a(nb.b, nb.a.d).a(nb.d, true))
               .a(ih.e, dpy.b, dqi.b, na.a().a(nb.c, $$1).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.d, dpy.b, dqi.b, na.a().a(nb.c, $$1))
               .a(ih.c, dpy.b, dqi.b, na.a().a(nb.c, $$1).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.f, dpy.a, dqi.a, na.a().a(nb.c, $$2).a(nb.a, nb.a.c).a(nb.d, true))
               .a(ih.e, dpy.a, dqi.a, na.a().a(nb.c, $$2).a(nb.a, nb.a.c).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.d, dpy.a, dqi.a, na.a().a(nb.c, $$2).a(nb.a, nb.a.c).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.c, dpy.a, dqi.a, na.a().a(nb.c, $$2).a(nb.a, nb.a.c).a(nb.b, nb.a.d).a(nb.d, true))
               .a(ih.f, dpy.a, dqi.e, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.e, dpy.a, dqi.e, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.d).a(nb.d, true))
               .a(ih.d, dpy.a, dqi.e, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.c, dpy.a, dqi.e, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.d, true))
               .a(ih.f, dpy.a, dqi.d, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.d, true))
               .a(ih.e, dpy.a, dqi.d, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.d, dpy.a, dqi.d, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.c, dpy.a, dqi.d, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.d).a(nb.d, true))
               .a(ih.f, dpy.a, dqi.c, na.a().a(nb.c, $$1).a(nb.a, nb.a.c).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.e, dpy.a, dqi.c, na.a().a(nb.c, $$1).a(nb.a, nb.a.c).a(nb.b, nb.a.d).a(nb.d, true))
               .a(ih.d, dpy.a, dqi.c, na.a().a(nb.c, $$1).a(nb.a, nb.a.c).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.c, dpy.a, dqi.c, na.a().a(nb.c, $$1).a(nb.a, nb.a.c).a(nb.d, true))
               .a(ih.f, dpy.a, dqi.b, na.a().a(nb.c, $$1).a(nb.a, nb.a.c).a(nb.d, true))
               .a(ih.e, dpy.a, dqi.b, na.a().a(nb.c, $$1).a(nb.a, nb.a.c).a(nb.b, nb.a.c).a(nb.d, true))
               .a(ih.d, dpy.a, dqi.b, na.a().a(nb.c, $$1).a(nb.a, nb.a.c).a(nb.b, nb.a.b).a(nb.d, true))
               .a(ih.c, dpy.a, dqi.b, na.a().a(nb.c, $$1).a(nb.a, nb.a.c).a(nb.b, nb.a.d).a(nb.d, true))
         );
   }

   private static mu c(dby $$0, ajt $$1, ajt $$2, ajt $$3) {
      return mx.a($$0)
         .a(
            my.a(dpp.R, dpp.af, dpp.u)
               .a(ih.c, dpy.b, false, na.a().a(nb.c, $$2))
               .a(ih.d, dpy.b, false, na.a().a(nb.c, $$2).a(nb.b, nb.a.c))
               .a(ih.f, dpy.b, false, na.a().a(nb.c, $$2).a(nb.b, nb.a.b))
               .a(ih.e, dpy.b, false, na.a().a(nb.c, $$2).a(nb.b, nb.a.d))
               .a(ih.c, dpy.a, false, na.a().a(nb.c, $$1))
               .a(ih.d, dpy.a, false, na.a().a(nb.c, $$1).a(nb.b, nb.a.c))
               .a(ih.f, dpy.a, false, na.a().a(nb.c, $$1).a(nb.b, nb.a.b))
               .a(ih.e, dpy.a, false, na.a().a(nb.c, $$1).a(nb.b, nb.a.d))
               .a(ih.c, dpy.b, true, na.a().a(nb.c, $$3))
               .a(ih.d, dpy.b, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.c))
               .a(ih.f, dpy.b, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.b))
               .a(ih.e, dpy.b, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.d))
               .a(ih.c, dpy.a, true, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.c))
               .a(ih.d, dpy.a, true, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.a))
               .a(ih.f, dpy.a, true, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.d))
               .a(ih.e, dpy.a, true, na.a().a(nb.c, $$3).a(nb.a, nb.a.c).a(nb.b, nb.a.b))
         );
   }

   private static mu d(dby $$0, ajt $$1, ajt $$2, ajt $$3) {
      return mx.a($$0)
         .a(
            my.a(dpp.R, dpp.af, dpp.u)
               .a(ih.c, dpy.b, false, na.a().a(nb.c, $$2))
               .a(ih.d, dpy.b, false, na.a().a(nb.c, $$2))
               .a(ih.f, dpy.b, false, na.a().a(nb.c, $$2))
               .a(ih.e, dpy.b, false, na.a().a(nb.c, $$2))
               .a(ih.c, dpy.a, false, na.a().a(nb.c, $$1))
               .a(ih.d, dpy.a, false, na.a().a(nb.c, $$1))
               .a(ih.f, dpy.a, false, na.a().a(nb.c, $$1))
               .a(ih.e, dpy.a, false, na.a().a(nb.c, $$1))
               .a(ih.c, dpy.b, true, na.a().a(nb.c, $$3))
               .a(ih.d, dpy.b, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.c))
               .a(ih.f, dpy.b, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.b))
               .a(ih.e, dpy.b, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.d))
               .a(ih.c, dpy.a, true, na.a().a(nb.c, $$3))
               .a(ih.d, dpy.a, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.c))
               .a(ih.f, dpy.a, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.b))
               .a(ih.e, dpy.a, true, na.a().a(nb.c, $$3).a(nb.b, nb.a.d))
         );
   }

   static mx c(dby $$0, ajt $$1) {
      return mx.a($$0, na.a().a(nb.c, $$1));
   }

   private static my f() {
      return my.a(dpp.I).a(ih.a.b, na.a()).a(ih.a.c, na.a().a(nb.a, nb.a.b)).a(ih.a.a, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.b));
   }

   static mu a(dby $$0, ni $$1, BiConsumer<ajt, Supplier<JsonElement>> $$2) {
      ajt $$3 = nh.g.a($$0, $$1, $$2);
      ajt $$4 = nh.h.a($$0, $$1, $$2);
      ajt $$5 = nh.i.a($$0, $$1, $$2);
      ajt $$6 = nh.j.a($$0, $$1, $$2);
      return mx.a($$0, na.a().a(nb.c, $$6)).a(my.a(dpp.I).a(ih.a.a, na.a().a(nb.c, $$3)).a(ih.a.b, na.a().a(nb.c, $$4)).a(ih.a.c, na.a().a(nb.c, $$5)));
   }

   static mu d(dby $$0, ajt $$1) {
      return mx.a($$0, na.a().a(nb.c, $$1)).a(f());
   }

   private void e(dby $$0, ajt $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dby $$0, nk.a $$1) {
      ajt $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dby $$0, nk.a $$1) {
      ajt $$2 = $$1.create($$0, this.c);
      this.b.accept(mx.a($$0, na.a().a(nb.c, $$2)).a(b()));
   }

   static mu d(dby $$0, ajt $$1, ajt $$2) {
      return mx.a($$0)
         .a(
            my.a(dpp.I)
               .a(ih.a.b, na.a().a(nb.c, $$1))
               .a(ih.a.c, na.a().a(nb.c, $$2).a(nb.a, nb.a.b))
               .a(ih.a.a, na.a().a(nb.c, $$2).a(nb.a, nb.a.b).a(nb.b, nb.a.b))
         );
   }

   private void a(dby $$0, nk.a $$1, nk.a $$2) {
      ajt $$3 = $$1.create($$0, this.c);
      ajt $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ajt a(dby $$0, String $$1, ng $$2, Function<ajt, ni> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ni.a($$0, $$1)), this.c);
   }

   static mu e(dby $$0, ajt $$1, ajt $$2) {
      return mx.a($$0).a(a(dpp.w, $$2, $$1));
   }

   static mu e(dby $$0, ajt $$1, ajt $$2, ajt $$3) {
      return mx.a($$0).a(my.a(dpp.bh).a(dqh.b, na.a().a(nb.c, $$1)).a(dqh.a, na.a().a(nb.c, $$2)).a(dqh.c, na.a().a(nb.c, $$3)));
   }

   public void a(dby $$0) {
      this.b($$0, nk.a);
   }

   public void b(dby $$0, nk.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dby $$0, ni $$1, ng $$2) {
      ajt $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private mr.b h(dby $$0) {
      nk $$1 = this.g.getOrDefault($$0, nk.a.get($$0));
      return new mr.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dby $$0, dby $$1, dby $$2) {
      ni $$3 = ni.u($$0);
      ajt $$4 = nh.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.p());
      this.c($$2);
   }

   void i(dby $$0) {
      ni $$1 = ni.t($$0);
      ajt $$2 = nh.v.a($$0, $$1, this.c);
      ajt $$3 = nh.w.a($$0, $$1, this.c);
      ajt $$4 = nh.x.a($$0, $$1, this.c);
      ajt $$5 = nh.y.a($$0, $$1, this.c);
      ajt $$6 = nh.z.a($$0, $$1, this.c);
      ajt $$7 = nh.A.a($$0, $$1, this.c);
      ajt $$8 = nh.B.a($$0, $$1, this.c);
      ajt $$9 = nh.C.a($$0, $$1, this.c);
      this.a($$0.p());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dby $$0, dby $$1) {
      ajt $$2 = nh.v.a($$0);
      ajt $$3 = nh.w.a($$0);
      ajt $$4 = nh.x.a($$0);
      ajt $$5 = nh.y.a($$0);
      ajt $$6 = nh.z.a($$0);
      ajt $$7 = nh.A.a($$0);
      ajt $$8 = nh.B.a($$0);
      ajt $$9 = nh.C.a($$0);
      this.a($$1, nf.a($$0.p()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dby $$0) {
      ni $$1 = ni.b($$0);
      ajt $$2 = nh.ak.a($$0, $$1, this.c);
      ajt $$3 = nh.al.a($$0, $$1, this.c);
      ajt $$4 = nh.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dby $$0) {
      ni $$1 = ni.b($$0);
      ajt $$2 = nh.ah.a($$0, $$1, this.c);
      ajt $$3 = nh.ai.a($$0, $$1, this.c);
      ajt $$4 = nh.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dby $$0, dby $$1) {
      ajt $$2 = nh.ah.a($$0);
      ajt $$3 = nh.ai.a($$0);
      ajt $$4 = nh.aj.a($$0);
      this.a($$1, nf.a($$0.p()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dca.sD);
      ajt $$0 = nf.a(dca.sD);
      ajt $$1 = nf.a(dca.sD, "_partial_tilt");
      ajt $$2 = nf.a(dca.sD, "_full_tilt");
      this.b
         .accept(
            mx.a(dca.sD)
               .a(b())
               .a(my.a(dpp.bl).a(dqk.a, na.a().a(nb.c, $$0)).a(dqk.b, na.a().a(nb.c, $$0)).a(dqk.c, na.a().a(nb.c, $$1)).a(dqk.d, na.a().a(nb.c, $$2)))
         );
   }

   private mr.f l(dby $$0) {
      return new mr.f(ni.n($$0));
   }

   private void m(dby $$0) {
      this.c($$0, $$0);
   }

   private void c(dby $$0, dby $$1) {
      this.b.accept(c($$0, nf.a($$1)));
   }

   private void a(dby $$0, mr.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dby $$0, mr.e $$1, ni $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dby $$0, mr.e $$1) {
      ni $$2 = ni.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dby $$0, mr.e $$1, ni $$2) {
      ajt $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dby $$0, mr.e $$1, dqc<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         my $$4 = my.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            ni $$5 = ni.c(ni.a($$0, $$4x));
            ajt $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return na.a().a(nb.c, $$6);
         });
         this.a($$0.p());
         this.b.accept(mx.a($$0).a($$4));
      }
   }

   private void a(dby $$0, dby $$1, mr.e $$2) {
      this.a($$0, $$2);
      ni $$3 = ni.d($$0);
      ajt $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dby $$0, dby $$1) {
      nk $$2 = nk.p.get($$0);
      ajt $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ajt $$4 = nh.aC.a($$1, $$2.b(), this.c);
      this.b.accept(mx.a($$1, na.a().a(nb.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dby $$0, dby $$1) {
      this.a($$0.p());
      ni $$2 = ni.h($$0);
      ni $$3 = ni.a($$0, $$1);
      ajt $$4 = nh.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            mx.a($$1, na.a().a(nb.c, $$4))
               .a(my.a(dpp.R).a(ih.e, na.a()).a(ih.d, na.a().a(nb.b, nb.a.d)).a(ih.c, na.a().a(nb.b, nb.a.b)).a(ih.f, na.a().a(nb.b, nb.a.c)))
         );
      this.b.accept(mx.a($$0).a(my.a(dpp.av).a($$2x -> na.a().a(nb.c, nh.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dby $$0 = dca.kC;
      this.a($$0.p());
      ajt $$1 = nf.a($$0, "_top");
      ajt $$2 = nf.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dby $$0 = dca.kB;
      this.a($$0.p());
      my $$1 = my.a(dhm.d, dpp.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> na.a().a(nb.c, nf.a($$0, "_top_stage_" + $$1x));
            case b -> na.a().a(nb.c, nf.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(mx.a($$0).a($$1));
   }

   private void a(dby $$0, dby $$1, dby $$2, dby $$3, dby $$4, dby $$5, dby $$6, dby $$7) {
      this.a($$0, mr.e.b);
      this.a($$1, mr.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dby $$0, mr.e $$1) {
      this.a($$0, "_top");
      ajt $$2 = this.a($$0, "_top", $$1.a(), ni::c);
      ajt $$3 = this.a($$0, "_bottom", $$1.a(), ni::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dca.iD, "_front");
      ajt $$0 = nf.a(dca.iD, "_top");
      ajt $$1 = this.a(dca.iD, "_bottom", mr.e.b.a(), ni::c);
      this.f(dca.iD, $$0, $$1);
   }

   private void k() {
      ajt $$0 = this.a(dca.bx, "_top", nh.bk, ni::a);
      ajt $$1 = this.a(dca.bx, "_bottom", nh.bk, ni::a);
      this.f(dca.bx, $$0, $$1);
   }

   private void l() {
      this.c(dca.sF);
      ajt $$0 = nf.a(dca.sF, "_top");
      ajt $$1 = nf.a(dca.sF, "_bottom");
      this.b.accept(mx.a(dca.sF).a(b()).a(my.a(dpp.ae).a(dpv.b, na.a().a(nb.c, $$1)).a(dpv.a, na.a().a(nb.c, $$0))));
   }

   private void f(dby $$0, ajt $$1, ajt $$2) {
      this.b.accept(mx.a($$0).a(my.a(dpp.ae).a(dpv.b, na.a().a(nb.c, $$2)).a(dpv.a, na.a().a(nb.c, $$1))));
   }

   private void n(dby $$0) {
      ni $$1 = ni.e($$0);
      ni $$2 = ni.e(ni.a($$0, "_corner"));
      ajt $$3 = nh.as.a($$0, $$1, this.c);
      ajt $$4 = nh.at.a($$0, $$2, this.c);
      ajt $$5 = nh.au.a($$0, $$1, this.c);
      ajt $$6 = nh.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            mx.a($$0)
               .a(
                  my.a(dpp.ag)
                     .a(dqd.a, na.a().a(nb.c, $$3))
                     .a(dqd.b, na.a().a(nb.c, $$3).a(nb.b, nb.a.b))
                     .a(dqd.c, na.a().a(nb.c, $$5).a(nb.b, nb.a.b))
                     .a(dqd.d, na.a().a(nb.c, $$6).a(nb.b, nb.a.b))
                     .a(dqd.e, na.a().a(nb.c, $$5))
                     .a(dqd.f, na.a().a(nb.c, $$6))
                     .a(dqd.g, na.a().a(nb.c, $$4))
                     .a(dqd.h, na.a().a(nb.c, $$4).a(nb.b, nb.a.b))
                     .a(dqd.i, na.a().a(nb.c, $$4).a(nb.b, nb.a.c))
                     .a(dqd.j, na.a().a(nb.c, $$4).a(nb.b, nb.a.d))
               )
         );
   }

   private void o(dby $$0) {
      ajt $$1 = this.a($$0, "", nh.as, ni::e);
      ajt $$2 = this.a($$0, "", nh.au, ni::e);
      ajt $$3 = this.a($$0, "", nh.av, ni::e);
      ajt $$4 = this.a($$0, "_on", nh.as, ni::e);
      ajt $$5 = this.a($$0, "_on", nh.au, ni::e);
      ajt $$6 = this.a($$0, "_on", nh.av, ni::e);
      my $$7 = my.a(dpp.w, dpp.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return na.a().a(nb.c, $$6x ? $$4 : $$1);
            case b:
               return na.a().a(nb.c, $$6x ? $$4 : $$1).a(nb.b, nb.a.b);
            case c:
               return na.a().a(nb.c, $$6x ? $$5 : $$2).a(nb.b, nb.a.b);
            case d:
               return na.a().a(nb.c, $$6x ? $$6 : $$3).a(nb.b, nb.a.b);
            case e:
               return na.a().a(nb.c, $$6x ? $$5 : $$2);
            case f:
               return na.a().a(nb.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(mx.a($$0).a($$7));
   }

   private mr.a a(ajt $$0, dby $$1) {
      return new mr.a($$0, $$1);
   }

   private mr.a f(dby $$0, dby $$1) {
      return new mr.a(nf.a($$0), $$1);
   }

   private void a(dby $$0, cre $$1) {
      ajt $$2 = nh.aa.a($$0, ni.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dby $$0, ajt $$1) {
      ajt $$2 = nh.aa.a($$0, ni.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dby $$0, dby $$1) {
      this.a($$0);
      ajt $$2 = nk.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dby $$0) {
      this.a($$0.p());
      ajt $$1 = nk.k.create($$0, this.c);
      ajt $$2 = nk.l.create($$0, this.c);
      ajt $$3 = nk.m.create($$0, this.c);
      ajt $$4 = nk.n.create($$0, this.c);
      this.b
         .accept(
            mw.a($$0)
               .a(mv.a().a(dpp.S, 1, 2, 3, 4).a(dpp.R, ih.c), na.a().a(nb.c, $$1))
               .a(mv.a().a(dpp.S, 1, 2, 3, 4).a(dpp.R, ih.f), na.a().a(nb.c, $$1).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.S, 1, 2, 3, 4).a(dpp.R, ih.d), na.a().a(nb.c, $$1).a(nb.b, nb.a.c))
               .a(mv.a().a(dpp.S, 1, 2, 3, 4).a(dpp.R, ih.e), na.a().a(nb.c, $$1).a(nb.b, nb.a.d))
               .a(mv.a().a(dpp.S, 2, 3, 4).a(dpp.R, ih.c), na.a().a(nb.c, $$2))
               .a(mv.a().a(dpp.S, 2, 3, 4).a(dpp.R, ih.f), na.a().a(nb.c, $$2).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.S, 2, 3, 4).a(dpp.R, ih.d), na.a().a(nb.c, $$2).a(nb.b, nb.a.c))
               .a(mv.a().a(dpp.S, 2, 3, 4).a(dpp.R, ih.e), na.a().a(nb.c, $$2).a(nb.b, nb.a.d))
               .a(mv.a().a(dpp.S, 3, 4).a(dpp.R, ih.c), na.a().a(nb.c, $$3))
               .a(mv.a().a(dpp.S, 3, 4).a(dpp.R, ih.f), na.a().a(nb.c, $$3).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.S, 3, 4).a(dpp.R, ih.d), na.a().a(nb.c, $$3).a(nb.b, nb.a.c))
               .a(mv.a().a(dpp.S, 3, 4).a(dpp.R, ih.e), na.a().a(nb.c, $$3).a(nb.b, nb.a.d))
               .a(mv.a().a(dpp.S, 4).a(dpp.R, ih.c), na.a().a(nb.c, $$4))
               .a(mv.a().a(dpp.S, 4).a(dpp.R, ih.f), na.a().a(nb.c, $$4).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.S, 4).a(dpp.R, ih.d), na.a().a(nb.c, $$4).a(nb.b, nb.a.c))
               .a(mv.a().a(dpp.S, 4).a(dpp.R, ih.e), na.a().a(nb.c, $$4).a(nb.b, nb.a.d))
         );
   }

   private void a(nk.a $$0, dby... $$1) {
      for (dby $$2 : $$1) {
         ajt $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(nk.a $$0, dby... $$1) {
      for (dby $$2 : $$1) {
         ajt $$3 = $$0.create($$2, this.c);
         this.b.accept(mx.a($$2, na.a().a(nb.c, $$3)).a(c()));
      }
   }

   private void h(dby $$0, dby $$1) {
      this.a($$0);
      ni $$2 = ni.b($$0, $$1);
      ajt $$3 = nh.aI.a($$1, $$2, this.c);
      ajt $$4 = nh.aJ.a($$1, $$2, this.c);
      ajt $$5 = nh.aK.a($$1, $$2, this.c);
      ajt $$6 = nh.aG.a($$1, $$2, this.c);
      ajt $$7 = nh.aH.a($$1, $$2, this.c);
      cre $$8 = $$1.p();
      nh.bx.a(nf.a($$8), ni.F($$0), this.c);
      this.b
         .accept(
            mw.a($$1)
               .a(na.a().a(nb.c, $$3))
               .a(mv.a().a(dpp.L, true), na.a().a(nb.c, $$4))
               .a(mv.a().a(dpp.M, true), na.a().a(nb.c, $$4).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.N, true), na.a().a(nb.c, $$5))
               .a(mv.a().a(dpp.O, true), na.a().a(nb.c, $$5).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.L, false), na.a().a(nb.c, $$6))
               .a(mv.a().a(dpp.M, false), na.a().a(nb.c, $$7))
               .a(mv.a().a(dpp.N, false), na.a().a(nb.c, $$7).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.O, false), na.a().a(nb.c, $$6).a(nb.b, nb.a.d))
         );
   }

   private void q(dby $$0) {
      ni $$1 = ni.z($$0);
      ajt $$2 = nh.aL.a($$0, $$1, this.c);
      ajt $$3 = this.a($$0, "_conditional", nh.aL, $$1x -> $$1.c(nj.i, $$1x));
      this.b.accept(mx.a($$0).a(a(dpp.c, $$3, $$2)).a(e()));
   }

   private void r(dby $$0) {
      ajt $$1 = nk.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<na> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> na.a().a(nb.c, nf.a(dca.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dca.mZ);
      this.b
         .accept(
            mw.a(dca.mZ)
               .a(mv.a().a(dpp.aq, 0), this.a(0))
               .a(mv.a().a(dpp.aq, 1), this.a(1))
               .a(mv.a().a(dpp.bk, dpl.b), na.a().a(nb.c, nf.a(dca.mZ, "_small_leaves")))
               .a(mv.a().a(dpp.bk, dpl.c), na.a().a(nb.c, nf.a(dca.mZ, "_large_leaves")))
         );
   }

   private my n() {
      return my.a(dpp.P)
         .a(ih.a, na.a().a(nb.a, nb.a.c))
         .a(ih.b, na.a())
         .a(ih.c, na.a().a(nb.a, nb.a.b))
         .a(ih.d, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.c))
         .a(ih.e, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.d))
         .a(ih.f, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.b));
   }

   private void o() {
      ajt $$0 = ni.a(dca.nU, "_top_open");
      this.b
         .accept(
            mx.a(dca.nU)
               .a(this.n())
               .a(
                  my.a(dpp.u)
                     .a(false, na.a().a(nb.c, nk.f.create(dca.nU, this.c)))
                     .a(true, na.a().a(nb.c, nk.f.get(dca.nU).a($$1 -> $$1.a(nj.f, $$0)).a(dca.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> my a(dqc<T> $$0, T $$1, ajt $$2, ajt $$3) {
      na $$4 = na.a().a(nb.c, $$2);
      na $$5 = na.a().a(nb.c, $$3);
      return my.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dby $$0, Function<dby, ni> $$1) {
      ni $$2 = $$1.apply($$0).b(nj.i, nj.c);
      ni $$3 = $$2.c(nj.g, ni.a($$0, "_front_honey"));
      ajt $$4 = nh.q.a($$0, $$2, this.c);
      ajt $$5 = nh.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(mx.a($$0).a(b()).a(a(dpp.aN, 5, $$5, $$4)));
   }

   private void a(dby $$0, dqc<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ajt> $$3 = new Int2ObjectOpenHashMap();
         my $$4 = my.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ajt $$5 = (ajt)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, nh.aV, ni::g));
            return na.a().a(nb.c, $$5);
         });
         this.a($$0.p());
         this.b.accept(mx.a($$0).a($$4));
      }
   }

   private void p() {
      ajt $$0 = nf.a(dca.od, "_floor");
      ajt $$1 = nf.a(dca.od, "_ceiling");
      ajt $$2 = nf.a(dca.od, "_wall");
      ajt $$3 = nf.a(dca.od, "_between_walls");
      this.a(crm.wk);
      this.b
         .accept(
            mx.a(dca.od)
               .a(
                  my.a(dpp.R, dpp.V)
                     .a(ih.c, dpn.a, na.a().a(nb.c, $$0))
                     .a(ih.d, dpn.a, na.a().a(nb.c, $$0).a(nb.b, nb.a.c))
                     .a(ih.f, dpn.a, na.a().a(nb.c, $$0).a(nb.b, nb.a.b))
                     .a(ih.e, dpn.a, na.a().a(nb.c, $$0).a(nb.b, nb.a.d))
                     .a(ih.c, dpn.b, na.a().a(nb.c, $$1))
                     .a(ih.d, dpn.b, na.a().a(nb.c, $$1).a(nb.b, nb.a.c))
                     .a(ih.f, dpn.b, na.a().a(nb.c, $$1).a(nb.b, nb.a.b))
                     .a(ih.e, dpn.b, na.a().a(nb.c, $$1).a(nb.b, nb.a.d))
                     .a(ih.c, dpn.c, na.a().a(nb.c, $$2).a(nb.b, nb.a.d))
                     .a(ih.d, dpn.c, na.a().a(nb.c, $$2).a(nb.b, nb.a.b))
                     .a(ih.f, dpn.c, na.a().a(nb.c, $$2))
                     .a(ih.e, dpn.c, na.a().a(nb.c, $$2).a(nb.b, nb.a.c))
                     .a(ih.d, dpn.d, na.a().a(nb.c, $$3).a(nb.b, nb.a.b))
                     .a(ih.c, dpn.d, na.a().a(nb.c, $$3).a(nb.b, nb.a.d))
                     .a(ih.f, dpn.d, na.a().a(nb.c, $$3))
                     .a(ih.e, dpn.d, na.a().a(nb.c, $$3).a(nb.b, nb.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            mx.a(dca.nZ, na.a().a(nb.c, nf.a(dca.nZ)))
               .a(
                  my.a(dpp.U, dpp.R)
                     .a(dpk.a, ih.c, na.a())
                     .a(dpk.a, ih.f, na.a().a(nb.b, nb.a.b))
                     .a(dpk.a, ih.d, na.a().a(nb.b, nb.a.c))
                     .a(dpk.a, ih.e, na.a().a(nb.b, nb.a.d))
                     .a(dpk.b, ih.c, na.a().a(nb.a, nb.a.b))
                     .a(dpk.b, ih.f, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.b))
                     .a(dpk.b, ih.d, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.c))
                     .a(dpk.b, ih.e, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.d))
                     .a(dpk.c, ih.d, na.a().a(nb.a, nb.a.c))
                     .a(dpk.c, ih.e, na.a().a(nb.a, nb.a.c).a(nb.b, nb.a.b))
                     .a(dpk.c, ih.c, na.a().a(nb.a, nb.a.c).a(nb.b, nb.a.c))
                     .a(dpk.c, ih.f, na.a().a(nb.a, nb.a.c).a(nb.b, nb.a.d))
               )
         );
   }

   private void d(dby $$0, nk.a $$1) {
      ajt $$2 = $$1.create($$0, this.c);
      ajt $$3 = ni.a($$0, "_front_on");
      ajt $$4 = $$1.get($$0).a($$1x -> $$1x.a(nj.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(mx.a($$0).a(a(dpp.r, $$4, $$2)).a(b()));
   }

   private void a(dby... $$0) {
      ajt $$1 = nf.a("campfire_off");

      for (dby $$2 : $$0) {
         ajt $$3 = nh.bc.a($$2, ni.E($$2), this.c);
         this.a($$2.p());
         this.b.accept(mx.a($$2).a(a(dpp.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dby $$0) {
      ajt $$1 = nh.bt.a($$0, ni.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dby $$0) {
      ajt $$1;
      if ($$0 == dca.tj) {
         $$1 = nh.bv.a($$0, ni.m($$0), this.c);
      } else {
         $$1 = nh.bu.a($$0, ni.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      ni $$0 = ni.a(ni.G(dca.cl), ni.G(dca.n));
      ajt $$1 = nh.j.a(dca.cl, $$0, this.c);
      this.b.accept(c(dca.cl, $$1));
   }

   private void s() {
      this.a(crm.lG);
      this.b
         .accept(
            mw.a(dca.cw)
               .a(
                  mv.b(
                     mv.a().a(dpp.ab, dqe.c).a(dpp.aa, dqe.c).a(dpp.ac, dqe.c).a(dpp.ad, dqe.c),
                     mv.a().a(dpp.ab, dqe.b, dqe.a).a(dpp.aa, dqe.b, dqe.a),
                     mv.a().a(dpp.aa, dqe.b, dqe.a).a(dpp.ac, dqe.b, dqe.a),
                     mv.a().a(dpp.ac, dqe.b, dqe.a).a(dpp.ad, dqe.b, dqe.a),
                     mv.a().a(dpp.ad, dqe.b, dqe.a).a(dpp.ab, dqe.b, dqe.a)
                  ),
                  na.a().a(nb.c, nf.a("redstone_dust_dot"))
               )
               .a(mv.a().a(dpp.ab, dqe.b, dqe.a), na.a().a(nb.c, nf.a("redstone_dust_side0")))
               .a(mv.a().a(dpp.ac, dqe.b, dqe.a), na.a().a(nb.c, nf.a("redstone_dust_side_alt0")))
               .a(mv.a().a(dpp.aa, dqe.b, dqe.a), na.a().a(nb.c, nf.a("redstone_dust_side_alt1")).a(nb.b, nb.a.d))
               .a(mv.a().a(dpp.ad, dqe.b, dqe.a), na.a().a(nb.c, nf.a("redstone_dust_side1")).a(nb.b, nb.a.d))
               .a(mv.a().a(dpp.ab, dqe.a), na.a().a(nb.c, nf.a("redstone_dust_up")))
               .a(mv.a().a(dpp.aa, dqe.a), na.a().a(nb.c, nf.a("redstone_dust_up")).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.ac, dqe.a), na.a().a(nb.c, nf.a("redstone_dust_up")).a(nb.b, nb.a.c))
               .a(mv.a().a(dpp.ad, dqe.a), na.a().a(nb.c, nf.a("redstone_dust_up")).a(nb.b, nb.a.d))
         );
   }

   private void t() {
      this.a(crm.lK);
      this.b
         .accept(
            mx.a(dca.gY)
               .a(c())
               .a(
                  my.a(dpp.bd, dpp.w)
                     .a(dps.a, false, na.a().a(nb.c, nf.a(dca.gY)))
                     .a(dps.a, true, na.a().a(nb.c, nf.a(dca.gY, "_on")))
                     .a(dps.b, false, na.a().a(nb.c, nf.a(dca.gY, "_subtract")))
                     .a(dps.b, true, na.a().a(nb.c, nf.a(dca.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      ni $$0 = ni.a(dca.jR);
      ni $$1 = ni.a(ni.a(dca.jE, "_side"), $$0.a(nj.f));
      ajt $$2 = nh.ab.a(dca.jE, $$1, this.c);
      ajt $$3 = nh.ac.a(dca.jE, $$1, this.c);
      ajt $$4 = nh.j.b(dca.jE, "_double", $$1, this.c);
      this.b.accept(e(dca.jE, $$2, $$3, $$4));
      this.b.accept(c(dca.jR, nh.c.a(dca.jR, $$0, this.c)));
   }

   private void v() {
      this.a(crm.sp);
      this.b
         .accept(
            mw.a(dca.fs)
               .a(na.a().a(nb.c, ni.G(dca.fs)))
               .a(mv.a().a(dpp.k, true), na.a().a(nb.c, ni.a(dca.fs, "_bottle0")))
               .a(mv.a().a(dpp.l, true), na.a().a(nb.c, ni.a(dca.fs, "_bottle1")))
               .a(mv.a().a(dpp.m, true), na.a().a(nb.c, ni.a(dca.fs, "_bottle2")))
               .a(mv.a().a(dpp.k, false), na.a().a(nb.c, ni.a(dca.fs, "_empty0")))
               .a(mv.a().a(dpp.l, false), na.a().a(nb.c, ni.a(dca.fs, "_empty1")))
               .a(mv.a().a(dpp.m, false), na.a().a(nb.c, ni.a(dca.fs, "_empty2")))
         );
   }

   private void u(dby $$0) {
      ajt $$1 = nh.bp.a($$0, ni.b($$0), this.c);
      ajt $$2 = nf.a("mushroom_block_inside");
      this.b
         .accept(
            mw.a($$0)
               .a(mv.a().a(dpp.L, true), na.a().a(nb.c, $$1))
               .a(mv.a().a(dpp.M, true), na.a().a(nb.c, $$1).a(nb.b, nb.a.b).a(nb.d, true))
               .a(mv.a().a(dpp.N, true), na.a().a(nb.c, $$1).a(nb.b, nb.a.c).a(nb.d, true))
               .a(mv.a().a(dpp.O, true), na.a().a(nb.c, $$1).a(nb.b, nb.a.d).a(nb.d, true))
               .a(mv.a().a(dpp.J, true), na.a().a(nb.c, $$1).a(nb.a, nb.a.d).a(nb.d, true))
               .a(mv.a().a(dpp.K, true), na.a().a(nb.c, $$1).a(nb.a, nb.a.b).a(nb.d, true))
               .a(mv.a().a(dpp.L, false), na.a().a(nb.c, $$2))
               .a(mv.a().a(dpp.M, false), na.a().a(nb.c, $$2).a(nb.b, nb.a.b).a(nb.d, false))
               .a(mv.a().a(dpp.N, false), na.a().a(nb.c, $$2).a(nb.b, nb.a.c).a(nb.d, false))
               .a(mv.a().a(dpp.O, false), na.a().a(nb.c, $$2).a(nb.b, nb.a.d).a(nb.d, false))
               .a(mv.a().a(dpp.J, false), na.a().a(nb.c, $$2).a(nb.a, nb.a.d).a(nb.d, false))
               .a(mv.a().a(dpp.K, false), na.a().a(nb.c, $$2).a(nb.a, nb.a.b).a(nb.d, false))
         );
      this.a($$0, nk.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(crm.rA);
      this.b
         .accept(
            mx.a(dca.eg)
               .a(
                  my.a(dpp.ay)
                     .a(0, na.a().a(nb.c, nf.a(dca.eg)))
                     .a(1, na.a().a(nb.c, nf.a(dca.eg, "_slice1")))
                     .a(2, na.a().a(nb.c, nf.a(dca.eg, "_slice2")))
                     .a(3, na.a().a(nb.c, nf.a(dca.eg, "_slice3")))
                     .a(4, na.a().a(nb.c, nf.a(dca.eg, "_slice4")))
                     .a(5, na.a().a(nb.c, nf.a(dca.eg, "_slice5")))
                     .a(6, na.a().a(nb.c, nf.a(dca.eg, "_slice6")))
               )
         );
   }

   private void x() {
      ni $$0 = new ni()
         .a(nj.c, ni.a(dca.nX, "_side3"))
         .a(nj.o, ni.G(dca.t))
         .a(nj.n, ni.a(dca.nX, "_top"))
         .a(nj.j, ni.a(dca.nX, "_side3"))
         .a(nj.l, ni.a(dca.nX, "_side3"))
         .a(nj.k, ni.a(dca.nX, "_side1"))
         .a(nj.m, ni.a(dca.nX, "_side2"));
      this.b.accept(c(dca.nX, nh.a.a(dca.nX, $$0, this.c)));
   }

   private void y() {
      ni $$0 = new ni()
         .a(nj.c, ni.a(dca.ob, "_front"))
         .a(nj.o, ni.a(dca.ob, "_bottom"))
         .a(nj.n, ni.a(dca.ob, "_top"))
         .a(nj.j, ni.a(dca.ob, "_front"))
         .a(nj.k, ni.a(dca.ob, "_front"))
         .a(nj.l, ni.a(dca.ob, "_side"))
         .a(nj.m, ni.a(dca.ob, "_side"));
      this.b.accept(c(dca.ob, nh.a.a(dca.ob, $$0, this.c)));
   }

   private void a(dby $$0, dby $$1, BiFunction<dby, dby, ni> $$2) {
      ni $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, nh.a.a($$0, $$3, this.c)));
   }

   public void b(dby $$0) {
      ni $$1 = new ni()
         .a(nj.c, ni.a($$0, "_particle"))
         .a(nj.o, ni.a($$0, "_down"))
         .a(nj.n, ni.a($$0, "_up"))
         .a(nj.j, ni.a($$0, "_north"))
         .a(nj.k, ni.a($$0, "_south"))
         .a(nj.l, ni.a($$0, "_east"))
         .a(nj.m, ni.a($$0, "_west"));
      this.b.accept(c($$0, nh.a.a($$0, $$1, this.c)));
   }

   private void z() {
      ni $$0 = ni.k(dca.eZ);
      this.b.accept(c(dca.eZ, nf.a(dca.eZ)));
      this.a(dca.ee, $$0);
      this.a(dca.ef, $$0);
   }

   private void a(dby $$0, ni $$1) {
      ajt $$2 = nh.p.a($$0, $$1.c(nj.g, ni.G($$0)), this.c);
      this.b.accept(mx.a($$0, na.a().a(nb.c, $$2)).a(b()));
   }

   private void A() {
      this.a(crm.sq);
      this.m(dca.ft);
      this.b.accept(c(dca.fv, nh.bs.a(dca.fv, ni.j(ni.a(dca.H, "_still")), this.c)));
      this.b
         .accept(
            mx.a(dca.fu)
               .a(
                  my.a(dgg.g)
                     .a(1, na.a().a(nb.c, nh.bq.a(dca.fu, "_level1", ni.j(ni.a(dca.G, "_still")), this.c)))
                     .a(2, na.a().a(nb.c, nh.br.a(dca.fu, "_level2", ni.j(ni.a(dca.G, "_still")), this.c)))
                     .a(3, na.a().a(nb.c, nh.bs.a(dca.fu, "_full", ni.j(ni.a(dca.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            mx.a(dca.fw)
               .a(
                  my.a(dgg.g)
                     .a(1, na.a().a(nb.c, nh.bq.a(dca.fw, "_level1", ni.j(ni.G(dca.qP)), this.c)))
                     .a(2, na.a().a(nb.c, nh.br.a(dca.fw, "_level2", ni.j(ni.G(dca.qP)), this.c)))
                     .a(3, na.a().a(nb.c, nh.bs.a(dca.fw, "_full", ni.j(ni.G(dca.qP)), this.c)))
               )
         );
   }

   private void B() {
      ni $$0 = ni.b(dca.kv);
      ajt $$1 = nh.aE.a(dca.kv, $$0, this.c);
      ajt $$2 = this.a(dca.kv, "_dead", nh.aE, $$1x -> $$0.c(nj.b, $$1x));
      this.b.accept(mx.a(dca.kv).a(a(dpp.au, 5, $$2, $$1)));
   }

   private void C() {
      ajt $$0 = nf.a(dca.tq);
      ajt $$1 = nf.a(dca.tq, "_triggered");
      ajt $$2 = nf.a(dca.tq, "_crafting");
      ajt $$3 = nf.a(dca.tq, "_crafting_triggered");
      this.b
         .accept(
            mx.a(dca.tq)
               .a(my.a(dpp.T).a($$0x -> this.a($$0x, na.a())))
               .a(
                  my.a(dpp.A, ddr.b)
                     .a(false, false, na.a().a(nb.c, $$0))
                     .a(true, true, na.a().a(nb.c, $$3))
                     .a(true, false, na.a().a(nb.c, $$1))
                     .a(false, true, na.a().a(nb.c, $$2))
               )
         );
   }

   private void v(dby $$0) {
      ni $$1 = new ni().a(nj.f, ni.a(dca.cD, "_top")).a(nj.i, ni.a(dca.cD, "_side")).a(nj.g, ni.a($$0, "_front"));
      ni $$2 = new ni().a(nj.i, ni.a(dca.cD, "_top")).a(nj.g, ni.a($$0, "_front_vertical"));
      ajt $$3 = nh.p.a($$0, $$1, this.c);
      ajt $$4 = nh.r.a($$0, $$2, this.c);
      this.b
         .accept(
            mx.a($$0)
               .a(
                  my.a(dpp.P)
                     .a(ih.a, na.a().a(nb.c, $$4).a(nb.a, nb.a.c))
                     .a(ih.b, na.a().a(nb.c, $$4))
                     .a(ih.c, na.a().a(nb.c, $$3))
                     .a(ih.f, na.a().a(nb.c, $$3).a(nb.b, nb.a.b))
                     .a(ih.d, na.a().a(nb.c, $$3).a(nb.b, nb.a.c))
                     .a(ih.e, na.a().a(nb.c, $$3).a(nb.b, nb.a.d))
               )
         );
   }

   private void D() {
      ajt $$0 = nf.a(dca.fy);
      ajt $$1 = nf.a(dca.fy, "_filled");
      this.b.accept(mx.a(dca.fy).a(my.a(dpp.h).a(false, na.a().a(nb.c, $$0)).a(true, na.a().a(nb.c, $$1))).a(c()));
   }

   private void E() {
      ajt $$0 = nf.a(dca.ku, "_side");
      ajt $$1 = nf.a(dca.ku, "_noside");
      ajt $$2 = nf.a(dca.ku, "_noside1");
      ajt $$3 = nf.a(dca.ku, "_noside2");
      ajt $$4 = nf.a(dca.ku, "_noside3");
      this.b
         .accept(
            mw.a(dca.ku)
               .a(mv.a().a(dpp.L, true), na.a().a(nb.c, $$0))
               .a(mv.a().a(dpp.M, true), na.a().a(nb.c, $$0).a(nb.b, nb.a.b).a(nb.d, true))
               .a(mv.a().a(dpp.N, true), na.a().a(nb.c, $$0).a(nb.b, nb.a.c).a(nb.d, true))
               .a(mv.a().a(dpp.O, true), na.a().a(nb.c, $$0).a(nb.b, nb.a.d).a(nb.d, true))
               .a(mv.a().a(dpp.J, true), na.a().a(nb.c, $$0).a(nb.a, nb.a.d).a(nb.d, true))
               .a(mv.a().a(dpp.K, true), na.a().a(nb.c, $$0).a(nb.a, nb.a.b).a(nb.d, true))
               .a(mv.a().a(dpp.L, false), na.a().a(nb.c, $$1).a(nb.e, 2), na.a().a(nb.c, $$2), na.a().a(nb.c, $$3), na.a().a(nb.c, $$4))
               .a(
                  mv.a().a(dpp.M, false),
                  na.a().a(nb.c, $$2).a(nb.b, nb.a.b).a(nb.d, true),
                  na.a().a(nb.c, $$3).a(nb.b, nb.a.b).a(nb.d, true),
                  na.a().a(nb.c, $$4).a(nb.b, nb.a.b).a(nb.d, true),
                  na.a().a(nb.c, $$1).a(nb.e, 2).a(nb.b, nb.a.b).a(nb.d, true)
               )
               .a(
                  mv.a().a(dpp.N, false),
                  na.a().a(nb.c, $$3).a(nb.b, nb.a.c).a(nb.d, true),
                  na.a().a(nb.c, $$4).a(nb.b, nb.a.c).a(nb.d, true),
                  na.a().a(nb.c, $$1).a(nb.e, 2).a(nb.b, nb.a.c).a(nb.d, true),
                  na.a().a(nb.c, $$2).a(nb.b, nb.a.c).a(nb.d, true)
               )
               .a(
                  mv.a().a(dpp.O, false),
                  na.a().a(nb.c, $$4).a(nb.b, nb.a.d).a(nb.d, true),
                  na.a().a(nb.c, $$1).a(nb.e, 2).a(nb.b, nb.a.d).a(nb.d, true),
                  na.a().a(nb.c, $$2).a(nb.b, nb.a.d).a(nb.d, true),
                  na.a().a(nb.c, $$3).a(nb.b, nb.a.d).a(nb.d, true)
               )
               .a(
                  mv.a().a(dpp.J, false),
                  na.a().a(nb.c, $$1).a(nb.e, 2).a(nb.a, nb.a.d).a(nb.d, true),
                  na.a().a(nb.c, $$4).a(nb.a, nb.a.d).a(nb.d, true),
                  na.a().a(nb.c, $$2).a(nb.a, nb.a.d).a(nb.d, true),
                  na.a().a(nb.c, $$3).a(nb.a, nb.a.d).a(nb.d, true)
               )
               .a(
                  mv.a().a(dpp.K, false),
                  na.a().a(nb.c, $$4).a(nb.a, nb.a.b).a(nb.d, true),
                  na.a().a(nb.c, $$3).a(nb.a, nb.a.b).a(nb.d, true),
                  na.a().a(nb.c, $$2).a(nb.a, nb.a.b).a(nb.d, true),
                  na.a().a(nb.c, $$1).a(nb.e, 2).a(nb.a, nb.a.b).a(nb.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            mw.a(dca.pc)
               .a(na.a().a(nb.c, ni.G(dca.pc)))
               .a(mv.a().a(dpp.aL, 1), na.a().a(nb.c, ni.a(dca.pc, "_contents1")))
               .a(mv.a().a(dpp.aL, 2), na.a().a(nb.c, ni.a(dca.pc, "_contents2")))
               .a(mv.a().a(dpp.aL, 3), na.a().a(nb.c, ni.a(dca.pc, "_contents3")))
               .a(mv.a().a(dpp.aL, 4), na.a().a(nb.c, ni.a(dca.pc, "_contents4")))
               .a(mv.a().a(dpp.aL, 5), na.a().a(nb.c, ni.a(dca.pc, "_contents5")))
               .a(mv.a().a(dpp.aL, 6), na.a().a(nb.c, ni.a(dca.pc, "_contents6")))
               .a(mv.a().a(dpp.aL, 7), na.a().a(nb.c, ni.a(dca.pc, "_contents7")))
               .a(mv.a().a(dpp.aL, 8), na.a().a(nb.c, ni.a(dca.pc, "_contents_ready")))
         );
   }

   private void w(dby $$0) {
      ajt $$1 = nh.c.a($$0, ni.a($$0), this.c);
      ajt $$2 = this.a($$0, "_powered", nh.c, ni::b);
      ajt $$3 = this.a($$0, "_lit", nh.c, ni::b);
      ajt $$4 = this.a($$0, "_lit_powered", nh.c, ni::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private mu a(dby $$0, ajt $$1, ajt $$2, ajt $$3, ajt $$4) {
      return mx.a($$0).a(my.a(dpp.r, dpp.w).a(($$4x, $$5) -> $$4x ? na.a().a(nb.c, $$5 ? $$4 : $$2) : na.a().a(nb.c, $$5 ? $$3 : $$1)));
   }

   private void i(dby $$0, dby $$1) {
      ajt $$2 = nf.a($$0);
      ajt $$3 = nf.a($$0, "_powered");
      ajt $$4 = nf.a($$0, "_lit");
      ajt $$5 = nf.a($$0, "_lit_powered");
      this.a($$1, nf.a($$0.p()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dby $$0) {
      this.c($$0);
      this.b.accept(mx.a($$0, na.a().a(nb.c, nh.ao.a($$0, ni.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dca.qy);
      this.x(dca.qx);
      this.x(dca.qw);
      this.x(dca.qv);
   }

   private void H() {
      this.c(dca.st);
      my.b<ih, dpw> $$0 = my.a(dpp.bm, dpp.bn);

      for (dpw $$1 : dpw.values()) {
         $$0.a(ih.b, $$1, this.a(ih.b, $$1));
      }

      for (dpw $$2 : dpw.values()) {
         $$0.a(ih.a, $$2, this.a(ih.a, $$2));
      }

      this.b.accept(mx.a(dca.st).a($$0));
   }

   private na a(ih $$0, dpw $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ni $$3 = ni.c(ni.a(dca.st, $$2));
      return na.a().a(nb.c, nh.an.a(dca.st, $$2, $$3, this.c));
   }

   private void y(dby $$0) {
      ni $$1 = new ni().a(nj.e, ni.G(dca.dV)).a(nj.f, ni.G($$0)).a(nj.i, ni.a($$0, "_side"));
      this.b.accept(c($$0, nh.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ajt $$0 = ni.a(dca.gZ, "_side");
      ni $$1 = new ni().a(nj.f, ni.a(dca.gZ, "_top")).a(nj.i, $$0);
      ni $$2 = new ni().a(nj.f, ni.a(dca.gZ, "_inverted_top")).a(nj.i, $$0);
      this.b
         .accept(
            mx.a(dca.gZ)
               .a(my.a(dpp.p).a(false, na.a().a(nb.c, nh.aF.a(dca.gZ, $$1, this.c))).a(true, na.a().a(nb.c, nh.aF.a(nf.a(dca.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dby $$0) {
      this.b.accept(mx.a($$0, na.a().a(nb.c, nf.a($$0))).a(this.n()));
   }

   private void J() {
      dby $$0 = dca.ss;
      ajt $$1 = nf.a($$0, "_on");
      ajt $$2 = nf.a($$0);
      this.b.accept(mx.a($$0, na.a().a(nb.c, nf.a($$0))).a(this.n()).a(a(dpp.w, $$1, $$2)));
   }

   private void K() {
      ni $$0 = new ni().a(nj.B, ni.G(dca.j)).a(nj.f, ni.G(dca.cC));
      ni $$1 = new ni().a(nj.B, ni.G(dca.j)).a(nj.f, ni.a(dca.cC, "_moist"));
      ajt $$2 = nh.aW.a(dca.cC, $$0, this.c);
      ajt $$3 = nh.aW.a(ni.a(dca.cC, "_moist"), $$1, this.c);
      this.b.accept(mx.a(dca.cC).a(a(dpp.aQ, 7, $$3, $$2)));
   }

   private List<ajt> A(dby $$0) {
      ajt $$1 = nh.aX.a(nf.a($$0, "_floor0"), ni.v($$0), this.c);
      ajt $$2 = nh.aX.a(nf.a($$0, "_floor1"), ni.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ajt> B(dby $$0) {
      ajt $$1 = nh.aY.a(nf.a($$0, "_side0"), ni.v($$0), this.c);
      ajt $$2 = nh.aY.a(nf.a($$0, "_side1"), ni.w($$0), this.c);
      ajt $$3 = nh.aZ.a(nf.a($$0, "_side_alt0"), ni.v($$0), this.c);
      ajt $$4 = nh.aZ.a(nf.a($$0, "_side_alt1"), ni.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ajt> C(dby $$0) {
      ajt $$1 = nh.ba.a(nf.a($$0, "_up0"), ni.v($$0), this.c);
      ajt $$2 = nh.ba.a(nf.a($$0, "_up1"), ni.w($$0), this.c);
      ajt $$3 = nh.bb.a(nf.a($$0, "_up_alt0"), ni.v($$0), this.c);
      ajt $$4 = nh.bb.a(nf.a($$0, "_up_alt1"), ni.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<na> a(List<ajt> $$0, UnaryOperator<na> $$1) {
      return $$0.stream().map($$0x -> na.a().a(nb.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      mv $$0 = mv.a().a(dpp.L, false).a(dpp.M, false).a(dpp.N, false).a(dpp.O, false).a(dpp.J, false);
      List<ajt> $$1 = this.A(dca.cr);
      List<ajt> $$2 = this.B(dca.cr);
      List<ajt> $$3 = this.C(dca.cr);
      this.b
         .accept(
            mw.a(dca.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(mv.b(mv.a().a(dpp.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(mv.b(mv.a().a(dpp.M, true), $$0), a($$2, $$0x -> $$0x.a(nb.b, nb.a.b)))
               .a(mv.b(mv.a().a(dpp.N, true), $$0), a($$2, $$0x -> $$0x.a(nb.b, nb.a.c)))
               .a(mv.b(mv.a().a(dpp.O, true), $$0), a($$2, $$0x -> $$0x.a(nb.b, nb.a.d)))
               .a(mv.a().a(dpp.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ajt> $$0 = this.A(dca.cs);
      List<ajt> $$1 = this.B(dca.cs);
      this.b
         .accept(
            mw.a(dca.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nb.b, nb.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nb.b, nb.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nb.b, nb.a.d)))
         );
   }

   private void D(dby $$0) {
      ajt $$1 = nk.t.create($$0, this.c);
      ajt $$2 = nk.u.create($$0, this.c);
      this.a($$0.p());
      this.b.accept(mx.a($$0).a(a(dpp.j, $$2, $$1)));
   }

   private void N() {
      ni $$0 = ni.a(ni.a(dca.ad, "_side"), ni.a(dca.ad, "_top"));
      ajt $$1 = nh.j.a(dca.ad, $$0, this.c);
      this.b.accept(d(dca.ad, $$1));
   }

   private void O() {
      this.a(crm.ad);
      dby $$0 = dca.E;
      my.b<Boolean, Integer> $$1 = my.a(dgs.d, dgs.b);
      ajt $$2 = nf.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ajt $$4 = nf.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, na.a().a(nb.c, $$4));
         $$1.a(false, $$3, na.a().a(nb.c, $$2));
      }

      this.b.accept(mx.a(dca.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            mx.a(dca.kI)
               .a(
                  my.a(dpp.as)
                     .a(0, na.a().a(nb.c, this.a(dca.kI, "_0", nh.c, ni::b)))
                     .a(1, na.a().a(nb.c, this.a(dca.kI, "_1", nh.c, ni::b)))
                     .a(2, na.a().a(nb.c, this.a(dca.kI, "_2", nh.c, ni::b)))
                     .a(3, na.a().a(nb.c, this.a(dca.kI, "_3", nh.c, ni::b)))
               )
         );
   }

   private void Q() {
      ajt $$0 = ni.G(dca.j);
      ni $$1 = new ni().a(nj.e, $$0).b(nj.e, nj.c).a(nj.f, ni.a(dca.i, "_top")).a(nj.i, ni.a(dca.i, "_snow"));
      na $$2 = na.a().a(nb.c, nh.n.a(dca.i, "_snow", $$1, this.c));
      this.a(dca.i, nf.a(dca.i), $$2);
      ajt $$3 = nk.f.get(dca.fl).a($$1x -> $$1x.a(nj.e, $$0)).a(dca.fl, this.c);
      this.a(dca.fl, $$3, $$2);
      ajt $$4 = nk.f.get(dca.l).a($$1x -> $$1x.a(nj.e, $$0)).a(dca.l, this.c);
      this.a(dca.l, $$4, $$2);
   }

   private void a(dby $$0, ajt $$1, na $$2) {
      List<na> $$3 = Arrays.asList(a($$1));
      this.b.accept(mx.a($$0).a(my.a(dpp.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(crm.rg);
      this.b
         .accept(
            mx.a(dca.fC)
               .a(
                  my.a(dpp.ar)
                     .a(0, na.a().a(nb.c, nf.a(dca.fC, "_stage0")))
                     .a(1, na.a().a(nb.c, nf.a(dca.fC, "_stage1")))
                     .a(2, na.a().a(nb.c, nf.a(dca.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dca.kE, nf.a(dca.kE)));
   }

   private void j(dby $$0, dby $$1) {
      ni $$2 = ni.b($$1);
      ajt $$3 = nh.Y.a($$0, $$2, this.c);
      ajt $$4 = nh.Z.a($$0, $$2, this.c);
      this.b.accept(mx.a($$0).a(a(dpp.aT, 1, $$4, $$3)));
   }

   private void T() {
      ajt $$0 = nf.a(dca.hc);
      ajt $$1 = nf.a(dca.hc, "_side");
      this.a(crm.lQ);
      this.b
         .accept(
            mx.a(dca.hc)
               .a(
                  my.a(dpp.Q)
                     .a(ih.a, na.a().a(nb.c, $$0))
                     .a(ih.c, na.a().a(nb.c, $$1))
                     .a(ih.f, na.a().a(nb.c, $$1).a(nb.b, nb.a.b))
                     .a(ih.d, na.a().a(nb.c, $$1).a(nb.b, nb.a.c))
                     .a(ih.e, na.a().a(nb.c, $$1).a(nb.b, nb.a.d))
               )
         );
   }

   private void k(dby $$0, dby $$1) {
      ajt $$2 = nf.a($$0);
      this.b.accept(mx.a($$1, na.a().a(nb.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ajt $$0 = nf.a(dca.eW, "_post_ends");
      ajt $$1 = nf.a(dca.eW, "_post");
      ajt $$2 = nf.a(dca.eW, "_cap");
      ajt $$3 = nf.a(dca.eW, "_cap_alt");
      ajt $$4 = nf.a(dca.eW, "_side");
      ajt $$5 = nf.a(dca.eW, "_side_alt");
      this.b
         .accept(
            mw.a(dca.eW)
               .a(na.a().a(nb.c, $$0))
               .a(mv.a().a(dpp.L, false).a(dpp.M, false).a(dpp.N, false).a(dpp.O, false), na.a().a(nb.c, $$1))
               .a(mv.a().a(dpp.L, true).a(dpp.M, false).a(dpp.N, false).a(dpp.O, false), na.a().a(nb.c, $$2))
               .a(mv.a().a(dpp.L, false).a(dpp.M, true).a(dpp.N, false).a(dpp.O, false), na.a().a(nb.c, $$2).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.L, false).a(dpp.M, false).a(dpp.N, true).a(dpp.O, false), na.a().a(nb.c, $$3))
               .a(mv.a().a(dpp.L, false).a(dpp.M, false).a(dpp.N, false).a(dpp.O, true), na.a().a(nb.c, $$3).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.L, true), na.a().a(nb.c, $$4))
               .a(mv.a().a(dpp.M, true), na.a().a(nb.c, $$4).a(nb.b, nb.a.b))
               .a(mv.a().a(dpp.N, true), na.a().a(nb.c, $$5))
               .a(mv.a().a(dpp.O, true), na.a().a(nb.c, $$5).a(nb.b, nb.a.b))
         );
      this.d(dca.eW);
   }

   private void E(dby $$0) {
      this.b.accept(mx.a($$0, na.a().a(nb.c, nf.a($$0))).a(b()));
   }

   private void V() {
      ajt $$0 = nf.a(dca.dw);
      ajt $$1 = nf.a(dca.dw, "_on");
      this.d(dca.dw);
      this.b
         .accept(
            mx.a(dca.dw)
               .a(a(dpp.w, $$0, $$1))
               .a(
                  my.a(dpp.U, dpp.R)
                     .a(dpk.c, ih.c, na.a().a(nb.a, nb.a.c).a(nb.b, nb.a.c))
                     .a(dpk.c, ih.f, na.a().a(nb.a, nb.a.c).a(nb.b, nb.a.d))
                     .a(dpk.c, ih.d, na.a().a(nb.a, nb.a.c))
                     .a(dpk.c, ih.e, na.a().a(nb.a, nb.a.c).a(nb.b, nb.a.b))
                     .a(dpk.a, ih.c, na.a())
                     .a(dpk.a, ih.f, na.a().a(nb.b, nb.a.b))
                     .a(dpk.a, ih.d, na.a().a(nb.b, nb.a.c))
                     .a(dpk.a, ih.e, na.a().a(nb.b, nb.a.d))
                     .a(dpk.b, ih.c, na.a().a(nb.a, nb.a.b))
                     .a(dpk.b, ih.f, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.b))
                     .a(dpk.b, ih.d, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.c))
                     .a(dpk.b, ih.e, na.a().a(nb.a, nb.a.b).a(nb.b, nb.a.d))
               )
         );
   }

   private void W() {
      this.d(dca.fm);
      this.b.accept(b(dca.fm, nf.a(dca.fm)));
   }

   private void X() {
      this.d(dca.tn);
      this.b.accept(c(dca.tn, nf.a(dca.tn)));
   }

   private void Y() {
      this.b.accept(mx.a(dca.ed).a(my.a(dpp.H).a(ih.a.a, na.a().a(nb.c, nf.a(dca.ed, "_ns"))).a(ih.a.c, na.a().a(nb.c, nf.a(dca.ed, "_ew")))));
   }

   private void Z() {
      ajt $$0 = nk.a.create(dca.dV, this.c);
      this.b
         .accept(
            mx.a(
               dca.dV,
               na.a().a(nb.c, $$0),
               na.a().a(nb.c, $$0).a(nb.a, nb.a.b),
               na.a().a(nb.c, $$0).a(nb.a, nb.a.c),
               na.a().a(nb.c, $$0).a(nb.a, nb.a.d),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.b),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.b).a(nb.a, nb.a.b),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.b).a(nb.a, nb.a.c),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.b).a(nb.a, nb.a.d),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.c),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.c).a(nb.a, nb.a.b),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.c).a(nb.a, nb.a.c),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.c).a(nb.a, nb.a.d),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.d),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.d).a(nb.a, nb.a.b),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.d).a(nb.a, nb.a.c),
               na.a().a(nb.c, $$0).a(nb.b, nb.a.d).a(nb.a, nb.a.d)
            )
         );
   }

   private void aa() {
      ajt $$0 = nf.a(dca.kO);
      ajt $$1 = nf.a(dca.kO, "_on");
      this.b.accept(mx.a(dca.kO).a(a(dpp.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      ni $$0 = new ni().a(nj.e, ni.a(dca.by, "_bottom")).a(nj.i, ni.a(dca.by, "_side"));
      ajt $$1 = ni.a(dca.by, "_top_sticky");
      ajt $$2 = ni.a(dca.by, "_top");
      ni $$3 = $$0.c(nj.E, $$1);
      ni $$4 = $$0.c(nj.E, $$2);
      ajt $$5 = nf.a(dca.by, "_base");
      this.a(dca.by, $$5, $$4);
      this.a(dca.br, $$5, $$3);
      ajt $$6 = nh.n.a(dca.by, "_inventory", $$0.c(nj.f, $$2), this.c);
      ajt $$7 = nh.n.a(dca.br, "_inventory", $$0.c(nj.f, $$1), this.c);
      this.a(dca.by, $$6);
      this.a(dca.br, $$7);
   }

   private void a(dby $$0, ajt $$1, ni $$2) {
      ajt $$3 = nh.bh.a($$0, $$2, this.c);
      this.b.accept(mx.a($$0).a(a(dpp.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      ni $$0 = new ni().a(nj.F, ni.a(dca.by, "_top")).a(nj.i, ni.a(dca.by, "_side"));
      ni $$1 = $$0.c(nj.E, ni.a(dca.by, "_top_sticky"));
      ni $$2 = $$0.c(nj.E, ni.a(dca.by, "_top"));
      this.b
         .accept(
            mx.a(dca.bz)
               .a(
                  my.a(dpp.x, dpp.bg)
                     .a(false, dqb.a, na.a().a(nb.c, nh.bi.a(dca.by, "_head", $$2, this.c)))
                     .a(false, dqb.b, na.a().a(nb.c, nh.bi.a(dca.by, "_head_sticky", $$1, this.c)))
                     .a(true, dqb.a, na.a().a(nb.c, nh.bj.a(dca.by, "_head_short", $$2, this.c)))
                     .a(true, dqb.b, na.a().a(nb.c, nh.bj.a(dca.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dby $$0 = dca.tr;
      ni $$1 = ni.a($$0, "_side_inactive", "_top_inactive");
      ni $$2 = ni.a($$0, "_side_active", "_top_active");
      ni $$3 = ni.a($$0, "_side_active", "_top_ejecting_reward");
      ajt $$4 = nh.o.a($$0, $$1, this.c);
      ajt $$5 = nh.o.a($$0, "_active", $$2, this.c);
      ajt $$6 = nh.o.a($$0, "_ejecting_reward", $$3, this.c);
      this.a($$0, $$4);
      this.b.accept(mx.a($$0).a(my.a(dpp.by).a($$3x -> {
         return switch ($$3x) {
            case a, f -> na.a().a(nb.c, $$4);
            case b, c, d -> na.a().a(nb.c, $$5);
            case e -> na.a().a(nb.c, $$6);
         };
      })));
   }

   private void ae() {
      dby $$0 = dca.ts;
      ni $$1 = ni.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      ni $$2 = ni.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      ni $$3 = ni.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      ni $$4 = ni.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ajt $$5 = nh.bN.a($$0, $$1, this.c);
      ajt $$6 = nh.bN.a($$0, "_active", $$2, this.c);
      ajt $$7 = nh.bN.a($$0, "_unlocking", $$3, this.c);
      ajt $$8 = nh.bN.a($$0, "_ejecting_reward", $$4, this.c);
      this.a($$0, $$5);
      this.b.accept(mx.a($$0).a(b()).a(my.a(dks.b).a($$4x -> {
         return switch ($$4x) {
            case a -> na.a().a(nb.c, $$5);
            case b -> na.a().a(nb.c, $$6);
            case c -> na.a().a(nb.c, $$7);
            case d -> na.a().a(nb.c, $$8);
         };
      })));
   }

   private void af() {
      ajt $$0 = nf.a(dca.qQ, "_inactive");
      ajt $$1 = nf.a(dca.qQ, "_active");
      this.a(dca.qQ, $$0);
      this.b.accept(mx.a(dca.qQ).a(my.a(dpp.bo).a($$2 -> na.a().a(nb.c, $$2 != dqg.b && $$2 != dqg.c ? $$0 : $$1))));
   }

   private void ag() {
      ajt $$0 = nf.a(dca.qR, "_inactive");
      ajt $$1 = nf.a(dca.qR, "_active");
      this.a(dca.qR, $$0);
      this.b.accept(mx.a(dca.qR).a(my.a(dpp.bo).a($$2 -> na.a().a(nb.c, $$2 != dqg.b && $$2 != dqg.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      ajt $$0 = nh.bM.a(dca.qV, ni.a(false), this.c);
      ajt $$1 = nh.bM.a(dca.qV, "_can_summon", ni.a(true), this.c);
      this.a(dca.qV, $$0);
      this.b.accept(mx.a(dca.qV).a(a(dpp.G, $$1, $$0)));
   }

   private void ai() {
      ajt $$0 = nf.a(dca.nS, "_stable");
      ajt $$1 = nf.a(dca.nS, "_unstable");
      this.a(dca.nS, $$0);
      this.b.accept(mx.a(dca.nS).a(a(dpp.b, $$1, $$0)));
   }

   private void aj() {
      ajt $$0 = this.a(dca.sv, "", nh.ao, ni::c);
      ajt $$1 = this.a(dca.sv, "_lit", nh.ao, ni::c);
      this.b.accept(mx.a(dca.sv).a(a(dpp.D, $$1, $$0)));
      ajt $$2 = this.a(dca.sw, "", nh.ao, ni::c);
      ajt $$3 = this.a(dca.sw, "_lit", nh.ao, ni::c);
      this.b.accept(mx.a(dca.sw).a(a(dpp.D, $$3, $$2)));
   }

   private void ak() {
      ajt $$0 = nk.a.create(dca.fB, this.c);
      ajt $$1 = this.a(dca.fB, "_on", nh.c, ni::b);
      this.b.accept(mx.a(dca.fB).a(a(dpp.r, $$1, $$0)));
   }

   private void l(dby $$0, dby $$1) {
      ni $$2 = ni.y($$0);
      this.b.accept(c($$0, nh.bf.a($$0, $$2, this.c)));
      this.b.accept(mx.a($$1, na.a().a(nb.c, nh.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      ni $$0 = ni.y(dca.dK);
      ni $$1 = ni.i(ni.a(dca.dK, "_off"));
      ajt $$2 = nh.bf.a(dca.dK, $$0, this.c);
      ajt $$3 = nh.bf.a(dca.dK, "_off", $$1, this.c);
      this.b.accept(mx.a(dca.dK).a(a(dpp.r, $$2, $$3)));
      ajt $$4 = nh.bg.a(dca.dL, $$0, this.c);
      ajt $$5 = nh.bg.a(dca.dL, "_off", $$1, this.c);
      this.b.accept(mx.a(dca.dL).a(a(dpp.r, $$4, $$5)).a(d()));
      this.d(dca.dK);
      this.c(dca.dL);
   }

   private void am() {
      this.a(crm.lJ);
      this.b.accept(mx.a(dca.eh).a(my.a(dpp.aA, dpp.s, dpp.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return na.a().a(nb.c, ni.a(dca.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(crm.cS);
      this.b
         .accept(
            mx.a(dca.mV)
               .a(
                  my.a(dpp.aS, dpp.C)
                     .a(1, false, Arrays.asList(a(nf.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(nf.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(nf.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(nf.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(nf.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(nf.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(nf.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(nf.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      ni $$0 = ni.a(dca.dN);
      ajt $$1 = nh.c.a(dca.dP, $$0, this.c);
      this.b.accept(mx.a(dca.dN).a(my.a(dpp.aF).a($$1x -> na.a().a(nb.c, $$1x < 8 ? nf.a(dca.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dca.dN, nf.a(dca.dN, "_height2"));
      this.b.accept(c(dca.dP, $$1));
   }

   private void ap() {
      this.b.accept(mx.a(dca.oc, na.a().a(nb.c, nf.a(dca.oc))).a(b()));
   }

   private void aq() {
      ajt $$0 = nk.a.create(dca.pa, this.c);
      this.a(dca.pa, $$0);
      this.b.accept(mx.a(dca.pa).a(my.a(dpp.bj).a($$0x -> na.a().a(nb.c, this.a(dca.pa, "_" + $$0x.c(), nh.c, ni::b)))));
   }

   private void ar() {
      this.a(crm.wn);
      this.b.accept(mx.a(dca.oi).a(my.a(dpp.as).a($$0 -> na.a().a(nb.c, this.a(dca.oi, "_stage" + $$0, nh.ao, ni::c)))));
   }

   private void as() {
      this.a(crm.pr);
      this.b
         .accept(
            mx.a(dca.fI)
               .a(
                  my.a(dpp.a, dpp.M, dpp.L, dpp.N, dpp.O)
                     .a(false, false, false, false, false, na.a().a(nb.c, nf.a(dca.fI, "_ns")))
                     .a(false, true, false, false, false, na.a().a(nb.c, nf.a(dca.fI, "_n")).a(nb.b, nb.a.b))
                     .a(false, false, true, false, false, na.a().a(nb.c, nf.a(dca.fI, "_n")))
                     .a(false, false, false, true, false, na.a().a(nb.c, nf.a(dca.fI, "_n")).a(nb.b, nb.a.c))
                     .a(false, false, false, false, true, na.a().a(nb.c, nf.a(dca.fI, "_n")).a(nb.b, nb.a.d))
                     .a(false, true, true, false, false, na.a().a(nb.c, nf.a(dca.fI, "_ne")))
                     .a(false, true, false, true, false, na.a().a(nb.c, nf.a(dca.fI, "_ne")).a(nb.b, nb.a.b))
                     .a(false, false, false, true, true, na.a().a(nb.c, nf.a(dca.fI, "_ne")).a(nb.b, nb.a.c))
                     .a(false, false, true, false, true, na.a().a(nb.c, nf.a(dca.fI, "_ne")).a(nb.b, nb.a.d))
                     .a(false, false, true, true, false, na.a().a(nb.c, nf.a(dca.fI, "_ns")))
                     .a(false, true, false, false, true, na.a().a(nb.c, nf.a(dca.fI, "_ns")).a(nb.b, nb.a.b))
                     .a(false, true, true, true, false, na.a().a(nb.c, nf.a(dca.fI, "_nse")))
                     .a(false, true, false, true, true, na.a().a(nb.c, nf.a(dca.fI, "_nse")).a(nb.b, nb.a.b))
                     .a(false, false, true, true, true, na.a().a(nb.c, nf.a(dca.fI, "_nse")).a(nb.b, nb.a.c))
                     .a(false, true, true, false, true, na.a().a(nb.c, nf.a(dca.fI, "_nse")).a(nb.b, nb.a.d))
                     .a(false, true, true, true, true, na.a().a(nb.c, nf.a(dca.fI, "_nsew")))
                     .a(true, false, false, false, false, na.a().a(nb.c, nf.a(dca.fI, "_attached_ns")))
                     .a(true, false, true, false, false, na.a().a(nb.c, nf.a(dca.fI, "_attached_n")))
                     .a(true, false, false, true, false, na.a().a(nb.c, nf.a(dca.fI, "_attached_n")).a(nb.b, nb.a.c))
                     .a(true, true, false, false, false, na.a().a(nb.c, nf.a(dca.fI, "_attached_n")).a(nb.b, nb.a.b))
                     .a(true, false, false, false, true, na.a().a(nb.c, nf.a(dca.fI, "_attached_n")).a(nb.b, nb.a.d))
                     .a(true, true, true, false, false, na.a().a(nb.c, nf.a(dca.fI, "_attached_ne")))
                     .a(true, true, false, true, false, na.a().a(nb.c, nf.a(dca.fI, "_attached_ne")).a(nb.b, nb.a.b))
                     .a(true, false, false, true, true, na.a().a(nb.c, nf.a(dca.fI, "_attached_ne")).a(nb.b, nb.a.c))
                     .a(true, false, true, false, true, na.a().a(nb.c, nf.a(dca.fI, "_attached_ne")).a(nb.b, nb.a.d))
                     .a(true, false, true, true, false, na.a().a(nb.c, nf.a(dca.fI, "_attached_ns")))
                     .a(true, true, false, false, true, na.a().a(nb.c, nf.a(dca.fI, "_attached_ns")).a(nb.b, nb.a.b))
                     .a(true, true, true, true, false, na.a().a(nb.c, nf.a(dca.fI, "_attached_nse")))
                     .a(true, true, false, true, true, na.a().a(nb.c, nf.a(dca.fI, "_attached_nse")).a(nb.b, nb.a.b))
                     .a(true, false, true, true, true, na.a().a(nb.c, nf.a(dca.fI, "_attached_nse")).a(nb.b, nb.a.c))
                     .a(true, true, true, false, true, na.a().a(nb.c, nf.a(dca.fI, "_attached_nse")).a(nb.b, nb.a.d))
                     .a(true, true, true, true, true, na.a().a(nb.c, nf.a(dca.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dca.fH);
      this.b.accept(mx.a(dca.fH).a(my.a(dpp.a, dpp.w).a(($$0, $$1) -> na.a().a(nb.c, ni.a(dca.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ajt a(int $$0, String $$1, ni $$2) {
      switch ($$0) {
         case 1:
            return nh.bl.a(nf.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return nh.bm.a(nf.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return nh.bn.a(nf.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return nh.bo.a(nf.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ajt a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", ni.b(ni.G(dca.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", ni.b(ni.a(dca.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", ni.b(ni.a(dca.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(crm.ko);
      this.b.accept(mx.a(dca.mf).a(my.a(dpp.aD, dpp.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(crm.kp);
      Function<Integer, ajt> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ni $$2 = ni.a($$1);
         return nh.bw.a(dca.mg, $$1, $$2, this.c);
      };
      this.b.accept(mx.a(dca.mg).a(my.a(djf.c).a($$1 -> na.a().a(nb.c, $$0.apply($$1)))));
   }

   private void F(dby $$0) {
      this.d($$0);
      ajt $$1 = nf.a($$0);
      mw $$2 = mw.a($$0);
      mv.c $$3 = ac.a(mv.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dpq, Function<ajt, na>> $$4 : a) {
         dpq $$5 = (dpq)$$4.getFirst();
         Function<ajt, na> $$6 = (Function<ajt, na>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(mv.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      ajt $$0 = ni.a(dca.qU, "_bottom");
      ni $$1 = new ni().a(nj.e, $$0).a(nj.f, ni.a(dca.qU, "_top")).a(nj.i, ni.a(dca.qU, "_side"));
      ni $$2 = new ni().a(nj.e, $$0).a(nj.f, ni.a(dca.qU, "_top_bloom")).a(nj.i, ni.a(dca.qU, "_side_bloom"));
      ajt $$3 = nh.n.a(dca.qU, "", $$1, this.c);
      ajt $$4 = nh.n.a(dca.qU, "_bloom", $$2, this.c);
      this.b.accept(mx.a(dca.qU).a(my.a(dpp.E).a($$2x -> na.a().a(nb.c, $$2x ? $$4 : $$3))));
      this.a(crm.gi, $$3);
   }

   private void ax() {
      dby $$0 = dca.cm;
      ajt $$1 = nf.a($$0);
      mw $$2 = mw.a($$0);
      List.of(Pair.of(ih.c, nb.a.a), Pair.of(ih.f, nb.a.b), Pair.of(ih.d, nb.a.c), Pair.of(ih.e, nb.a.d)).forEach($$2x -> {
         ih $$3 = (ih)$$2x.getFirst();
         nb.a $$4 = (nb.a)$$2x.getSecond();
         mv.c $$5 = mv.a().a(dpp.R, $$3);
         $$2.a($$5, na.a().a(nb.c, $$1).a(nb.b, $$4).a(nb.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, nf.a($$0, "_inventory"));
      i.clear();
   }

   private void a(mw $$0, mv.c $$1, nb.a $$2) {
      List.of(Pair.of(dpp.bp, nh.aM), Pair.of(dpp.bq, nh.aN), Pair.of(dpp.br, nh.aO), Pair.of(dpp.bs, nh.aP), Pair.of(dpp.bt, nh.aQ), Pair.of(dpp.bu, nh.aR))
         .forEach($$3 -> {
            dpq $$4 = (dpq)$$3.getFirst();
            ng $$5 = (ng)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(mw $$0, mv.c $$1, nb.a $$2, dpq $$3, ng $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ni $$7 = new ni().a(nj.b, ni.a(dca.cm, $$6));
      mr.d $$8 = new mr.d($$4, $$6);
      ajt $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dca.cm, $$6, $$7, this.c));
      $$0.a(mv.a($$1, mv.a().a($$3, $$5)), na.a().a(nb.c, $$9).a(nb.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dca.kJ, nh.c.a(dca.kJ, ni.b(nf.a("magma")), this.c)));
   }

   private void G(dby $$0) {
      this.b($$0, nk.q);
      nh.bD.a(nf.a($$0.p()), ni.u($$0), this.c);
   }

   private void b(dby $$0, dby $$1, mr.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dby $$0, dby $$1) {
      nh.bE.a(nf.a($$0.p()), ni.u($$1), this.c);
   }

   private void az() {
      ajt $$0 = nf.a(dca.b);
      ajt $$1 = nf.a(dca.b, "_mirrored");
      this.b.accept(a(dca.eN, $$0, $$1));
      this.a(dca.eN, $$0);
   }

   private void aA() {
      ajt $$0 = nf.a(dca.sJ);
      ajt $$1 = nf.a(dca.sJ, "_mirrored");
      this.b.accept(a(dca.td, $$0, $$1).a(f()));
      this.a(dca.td, $$0);
   }

   private void n(dby $$0, dby $$1) {
      this.a($$0, mr.e.b);
      ni $$2 = ni.d(ni.a($$0, "_pot"));
      ajt $$3 = mr.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      ajt $$0 = ni.a(dca.pl, "_bottom");
      ajt $$1 = ni.a(dca.pl, "_top_off");
      ajt $$2 = ni.a(dca.pl, "_top");
      ajt[] $$3 = new ajt[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ni $$5 = new ni().a(nj.e, $$0).a(nj.f, $$4 == 0 ? $$1 : $$2).a(nj.i, ni.a(dca.pl, "_side" + $$4));
         $$3[$$4] = nh.n.a(dca.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(mx.a(dca.pl).a(my.a(dpp.aZ).a($$1x -> na.a().a(nb.c, $$3[$$1x]))));
      this.a(crm.wL, $$3[0]);
   }

   private na a(ij $$0, na $$1) {
      switch ($$0) {
         case b:
            return $$1.a(nb.a, nb.a.b);
         case c:
            return $$1.a(nb.a, nb.a.b).a(nb.b, nb.a.c);
         case d:
            return $$1.a(nb.a, nb.a.b).a(nb.b, nb.a.d);
         case a:
            return $$1.a(nb.a, nb.a.b).a(nb.b, nb.a.b);
         case f:
            return $$1.a(nb.a, nb.a.d).a(nb.b, nb.a.c);
         case g:
            return $$1.a(nb.a, nb.a.d);
         case h:
            return $$1.a(nb.a, nb.a.d).a(nb.b, nb.a.b);
         case e:
            return $$1.a(nb.a, nb.a.d).a(nb.b, nb.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(nb.b, nb.a.c);
         case i:
            return $$1.a(nb.b, nb.a.d);
         case j:
            return $$1.a(nb.b, nb.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      ajt $$0 = ni.a(dca.pb, "_top");
      ajt $$1 = ni.a(dca.pb, "_bottom");
      ajt $$2 = ni.a(dca.pb, "_side");
      ajt $$3 = ni.a(dca.pb, "_lock");
      ni $$4 = new ni().a(nj.o, $$2).a(nj.m, $$2).a(nj.l, $$2).a(nj.c, $$0).a(nj.j, $$0).a(nj.k, $$1).a(nj.n, $$3);
      ajt $$5 = nh.b.a(dca.pb, $$4, this.c);
      this.b.accept(mx.a(dca.pb, na.a().a(nb.c, $$5)).a(my.a(dpp.T).a($$0x -> this.a($$0x, na.a()))));
   }

   private void aD() {
      dby $$0 = dca.n;
      ajt $$1 = nf.a($$0);
      nk $$2 = nk.a.get($$0);
      dby $$3 = dca.jH;
      ajt $$4 = nh.ab.a($$3, $$2.b(), this.c);
      ajt $$5 = nh.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      ku.a().filter(kv::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dca.rf).a(ku.w).a(dca.rf, dca.rD).a(dca.rj, dca.rn).a(ku.y);
      this.h(dca.re).a(ku.A).a(dca.re, dca.rC).a(dca.ri, dca.rm).a(ku.C);
      this.h(dca.rd).a(ku.E).a(dca.rd, dca.rB).a(dca.rh, dca.rl).a(ku.G);
      this.h(dca.rc).a(ku.I).a(dca.rc, dca.rA).a(dca.rg, dca.rk).a(ku.K);
      this.w(dca.sk);
      this.w(dca.sl);
      this.w(dca.sm);
      this.w(dca.sn);
      this.i(dca.sk, dca.so);
      this.i(dca.sl, dca.sp);
      this.i(dca.sm, dca.sq);
      this.i(dca.sn, dca.sr);
      this.m(dca.a);
      this.c(dca.nc, dca.a);
      this.c(dca.nb, dca.a);
      this.m(dca.fO);
      this.m(dca.dQ);
      this.c(dca.nd, dca.G);
      this.m(dca.fA);
      this.m(dca.me);
      this.m(dca.fr);
      this.m(dca.fR);
      this.a(crm.uc);
      this.m(dca.pg);
      this.m(dca.G);
      this.m(dca.H);
      this.m(dca.hV);
      this.a(crm.fR);
      this.o(dca.pM, dca.qd);
      this.o(dca.pN, dca.qe);
      this.o(dca.pO, dca.qf);
      this.o(dca.pP, dca.qg);
      this.o(dca.pQ, dca.qh);
      this.o(dca.pR, dca.qi);
      this.o(dca.pS, dca.qj);
      this.o(dca.pT, dca.qk);
      this.o(dca.pU, dca.ql);
      this.o(dca.pV, dca.qm);
      this.o(dca.pW, dca.qn);
      this.o(dca.pX, dca.qo);
      this.o(dca.pY, dca.qp);
      this.o(dca.pZ, dca.qq);
      this.o(dca.qa, dca.qr);
      this.o(dca.qb, dca.qs);
      this.o(dca.pL, dca.qc);
      this.m(dca.na);
      this.m(dca.gs);
      this.m(dca.qP);
      this.m(dca.sx);
      this.s(dca.sy);
      this.s(dca.sz);
      this.t(dca.ti);
      this.t(dca.tj);
      this.aj();
      this.g(dca.sC, dca.sA);
      this.p(dca.sB);
      this.a(dca.hW, crm.hA);
      this.a(crm.hA);
      this.aE();
      this.a(dca.kN, crm.ja);
      this.a(crm.ja);
      this.f(dca.bQ, ni.a(dca.by, "_side"));
      this.a(dca.R);
      this.a(dca.S);
      this.a(dca.iB);
      this.a(dca.cx);
      this.a(dca.cy);
      this.a(dca.cz);
      this.a(dca.fE);
      this.a(dca.fF);
      this.a(dca.fJ);
      this.a(dca.N);
      this.a(dca.T);
      this.a(dca.O);
      this.a(dca.ch);
      this.a(dca.P);
      this.a(dca.Q);
      this.a(dca.ci);
      this.b(dca.pj, nk.d);
      this.a(dca.pi);
      this.a(dca.aR);
      this.a(dca.aS);
      this.a(dca.aT);
      this.a(dca.hb);
      this.a(dca.dI);
      this.a(dca.dJ);
      this.a(dca.ha);
      this.a(dca.pC);
      this.a(dca.mW);
      this.a(dca.dR);
      this.a(dca.k);
      this.a(dca.pk);
      this.a(dca.fz);
      this.a(dca.ec);
      this.a(dca.L);
      this.a(dca.ph);
      this.a(dca.dO);
      this.b(dca.dT, nk.g);
      this.b(dca.pq, nk.d);
      this.b(dca.fa, nk.d);
      this.m(dca.ac);
      this.m(dca.ga);
      this.a(dca.kK);
      this.a(dca.aY);
      this.a(dca.iC);
      this.a(dca.co);
      this.a(dca.pK);
      this.a(dca.ii);
      this.a(dca.oy);
      this.a(dca.dW);
      this.a(dca.dX);
      this.b(dca.ct, nk.b);
      this.a(dca.aO);
      this.b(dca.bw, nk.v);
      this.a(crm.cR);
      this.b(dca.ck, nk.f);
      this.b(dca.pd, nk.d);
      this.a(dca.op);
      this.a(dca.aP);
      this.a(dca.qt);
      this.a(dca.qu);
      this.a(dca.qN);
      this.a(dca.su);
      this.a(dca.tf);
      this.a(dca.tg);
      this.a(dca.th);
      this.e(dca.qS);
      this.aD();
      this.a(dca.ra);
      this.a(dca.rb);
      this.a(dca.qW);
      this.a(dca.qX);
      this.a(dca.qY);
      this.a(dca.qZ);
      this.k(dca.qW, dca.rw);
      this.k(dca.qX, dca.ry);
      this.k(dca.qY, dca.rx);
      this.k(dca.qZ, dca.rz);
      this.i(dca.rM);
      this.i(dca.rN);
      this.i(dca.rP);
      this.i(dca.rO);
      this.a(dca.rM, dca.rQ);
      this.a(dca.rN, dca.rR);
      this.a(dca.rP, dca.rT);
      this.a(dca.rO, dca.rS);
      this.k(dca.rU);
      this.k(dca.rV);
      this.k(dca.rX);
      this.k(dca.rW);
      this.b(dca.rU, dca.rY);
      this.b(dca.rV, dca.rZ);
      this.b(dca.rX, dca.sb);
      this.b(dca.rW, dca.sa);
      this.a(dca.sc);
      this.a(dca.sd);
      this.a(dca.se);
      this.a(dca.sf);
      this.k(dca.sc, dca.sg);
      this.k(dca.sd, dca.sh);
      this.k(dca.se, dca.si);
      this.k(dca.sf, dca.sj);
      this.j(dca.gW, dca.ch);
      this.j(dca.gX, dca.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dca.og, dca.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dca.kt);
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
      this.F(dca.ff);
      this.F(dca.fg);
      this.F(dca.qT);
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
      this.E(dca.cO);
      this.d(dca.cO);
      this.E(dca.oa);
      this.g();
      this.E(dca.sE);
      this.l(dca.cp, dca.cq);
      this.l(dca.ea, dca.eb);
      this.a(dca.cA, dca.n, ni::c);
      this.a(dca.nY, dca.p, ni::d);
      this.y(dca.ow);
      this.y(dca.on);
      this.v(dca.aU);
      this.v(dca.hi);
      this.C();
      this.D(dca.oe);
      this.D(dca.of);
      this.e(dca.eX, nf.a(dca.eX));
      this.a(dca.dY, nk.d);
      this.a(dca.dZ, nk.d);
      this.a(dca.te);
      this.a(dca.kM, nk.d);
      this.f(dca.j);
      this.f(dca.sH);
      this.f(dca.I);
      this.g(dca.J);
      this.g(dca.M);
      this.f(dca.K);
      this.e(dca.F);
      this.b(dca.to, nk.f);
      this.a(dca.ij, nk.d, nk.e);
      this.a(dca.kx, nk.w, nk.x);
      this.a(dca.hf, nk.w, nk.x);
      this.a(dca.tk, nk.d, nk.e);
      this.a(dca.tl, nk.d, nk.e);
      this.a(dca.tm, nk.d, nk.e);
      this.c(dca.nT, nk.i);
      this.z();
      this.a(dca.pe, ni::A);
      this.a(dca.pf, ni::C);
      this.a(dca.kD, dpp.as, 0, 1, 2, 3);
      this.a(dca.gt, dpp.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dca.fq, dpp.as, 0, 1, 1, 2);
      this.a(dca.gu, dpp.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dca.cB, dpp.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dca.kA, mr.e.b, dpp.aq, 0, 1);
      this.i();
      this.h();
      this.a(nf.a("decorated_pot"), dca.iA).b(dca.tp);
      this.a(nf.a("banner"), dca.n)
         .a(nh.bF, dca.iJ, dca.iK, dca.iL, dca.iM, dca.iN, dca.iO, dca.iP, dca.iQ, dca.iR, dca.iS, dca.iT, dca.iU, dca.iV, dca.iW, dca.iX, dca.iY)
         .b(dca.iZ, dca.ja, dca.jb, dca.jc, dca.jd, dca.je, dca.jf, dca.jg, dca.jh, dca.ji, dca.jj, dca.jk, dca.jl, dca.jm, dca.jn, dca.jo);
      this.a(nf.a("bed"), dca.n)
         .b(dca.aZ, dca.ba, dca.bb, dca.bc, dca.bd, dca.be, dca.bf, dca.bg, dca.bh, dca.bi, dca.bj, dca.bk, dca.bl, dca.bm, dca.bn, dca.bo);
      this.m(dca.aZ, dca.bA);
      this.m(dca.ba, dca.bB);
      this.m(dca.bb, dca.bC);
      this.m(dca.bc, dca.bD);
      this.m(dca.bd, dca.bE);
      this.m(dca.be, dca.bF);
      this.m(dca.bf, dca.bG);
      this.m(dca.bg, dca.bH);
      this.m(dca.bh, dca.bI);
      this.m(dca.bi, dca.bJ);
      this.m(dca.bj, dca.bK);
      this.m(dca.bk, dca.bL);
      this.m(dca.bl, dca.bM);
      this.m(dca.bm, dca.bN);
      this.m(dca.bn, dca.bO);
      this.m(dca.bo, dca.bP);
      this.a(nf.a("skull"), dca.dW)
         .a(nh.bG, dca.gM, dca.gK, dca.gI, dca.gE, dca.gG, dca.gQ)
         .a(dca.gO)
         .b(dca.gN, dca.gP, dca.gL, dca.gJ, dca.gF, dca.gH, dca.gR);
      this.G(dca.kP);
      this.G(dca.kQ);
      this.G(dca.kR);
      this.G(dca.kS);
      this.G(dca.kT);
      this.G(dca.kU);
      this.G(dca.kV);
      this.G(dca.kW);
      this.G(dca.kX);
      this.G(dca.kY);
      this.G(dca.kZ);
      this.G(dca.la);
      this.G(dca.lb);
      this.G(dca.lc);
      this.G(dca.ld);
      this.G(dca.le);
      this.G(dca.lf);
      this.b(dca.mX, nk.q);
      this.c(dca.mX);
      this.a(nf.a("chest"), dca.n).b(dca.cv, dca.gV);
      this.a(nf.a("ender_chest"), dca.co).b(dca.fG);
      this.f(dca.fx, dca.co).a(dca.fx, dca.kF);
      this.a(dca.aM);
      this.a(dca.aN);
      this.a(dca.lw);
      this.a(dca.lx);
      this.a(dca.ly);
      this.a(dca.lz);
      this.a(dca.lA);
      this.a(dca.lB);
      this.a(dca.lC);
      this.a(dca.lD);
      this.a(dca.lE);
      this.a(dca.lF);
      this.a(dca.lG);
      this.a(dca.lH);
      this.a(dca.lI);
      this.a(dca.lJ);
      this.a(dca.lK);
      this.a(dca.lL);
      this.a(nk.a, dca.lM, dca.lN, dca.lO, dca.lP, dca.lQ, dca.lR, dca.lS, dca.lT, dca.lU, dca.lV, dca.lW, dca.lX, dca.lY, dca.lZ, dca.ma, dca.mb);
      this.a(dca.iA);
      this.a(dca.hj);
      this.a(dca.hk);
      this.a(dca.hl);
      this.a(dca.hm);
      this.a(dca.hn);
      this.a(dca.ho);
      this.a(dca.hp);
      this.a(dca.hq);
      this.a(dca.hr);
      this.a(dca.hs);
      this.a(dca.ht);
      this.a(dca.hu);
      this.a(dca.hv);
      this.a(dca.hw);
      this.a(dca.hx);
      this.a(dca.hy);
      this.a(dca.qO);
      this.h(dca.aQ, dca.eY);
      this.h(dca.ei, dca.hz);
      this.h(dca.ej, dca.hA);
      this.h(dca.ek, dca.hB);
      this.h(dca.el, dca.hC);
      this.h(dca.em, dca.hD);
      this.h(dca.en, dca.hE);
      this.h(dca.eo, dca.hF);
      this.h(dca.ep, dca.hG);
      this.h(dca.eq, dca.hH);
      this.h(dca.er, dca.hI);
      this.h(dca.es, dca.hJ);
      this.h(dca.et, dca.hK);
      this.h(dca.eu, dca.hL);
      this.h(dca.ev, dca.hM);
      this.h(dca.ew, dca.hN);
      this.h(dca.ex, dca.hO);
      this.b(nk.o, dca.lg, dca.lh, dca.li, dca.lj, dca.lk, dca.ll, dca.lm, dca.ln, dca.lo, dca.lp, dca.lq, dca.lr, dca.ls, dca.lt, dca.lu, dca.lv);
      this.g(dca.bA, dca.ik);
      this.g(dca.bB, dca.il);
      this.g(dca.bC, dca.im);
      this.g(dca.bD, dca.in);
      this.g(dca.bE, dca.io);
      this.g(dca.bF, dca.ip);
      this.g(dca.bG, dca.iq);
      this.g(dca.bH, dca.ir);
      this.g(dca.bI, dca.is);
      this.g(dca.bJ, dca.it);
      this.g(dca.bK, dca.iu);
      this.g(dca.bL, dca.iv);
      this.g(dca.bM, dca.iw);
      this.g(dca.bN, dca.ix);
      this.g(dca.bO, dca.iy);
      this.g(dca.bP, dca.iz);
      this.a(dca.sI);
      this.a(dca.eL);
      this.a(dca.bu, dca.gb, mr.e.a);
      this.a(dca.bR, dca.gc, mr.e.b);
      this.a(dca.bT, dca.gd, mr.e.b);
      this.a(dca.bU, dca.ge, mr.e.b);
      this.a(dca.bV, dca.gf, mr.e.b);
      this.a(dca.bW, dca.gg, mr.e.b);
      this.a(dca.bX, dca.gh, mr.e.b);
      this.a(dca.bY, dca.gi, mr.e.b);
      this.a(dca.bZ, dca.gj, mr.e.b);
      this.a(dca.ca, dca.gk, mr.e.b);
      this.a(dca.cb, dca.gl, mr.e.b);
      this.a(dca.cc, dca.gm, mr.e.b);
      this.a(dca.ce, dca.gn, mr.e.b);
      this.a(dca.cd, dca.go, mr.e.b);
      this.a(dca.cg, dca.gp, mr.e.b);
      this.a(dca.cf, dca.gq, mr.e.b);
      this.a(dca.bv, dca.gr, mr.e.b);
      this.a(dca.bS, dca.fS, mr.e.b);
      this.H();
      this.u(dca.eT);
      this.u(dca.eU);
      this.u(dca.eV);
      this.a(dca.bt, mr.e.a);
      this.b(dca.dS, mr.e.a);
      this.a(crm.dI);
      this.b(dca.mc, dca.md, mr.e.b);
      this.a(crm.dJ);
      this.c(dca.md);
      this.b(dca.sG, mr.e.b);
      this.c(dca.sG);
      this.c(dca.sw);
      this.b(dca.oz, dca.oA, mr.e.b);
      this.b(dca.oB, dca.oC, mr.e.b);
      this.a(dca.oz, "_plant");
      this.c(dca.oA);
      this.a(dca.oB, "_plant");
      this.c(dca.oC);
      this.a(dca.mY, mr.e.a, ni.c(ni.a(dca.mZ, "_stage0")));
      this.m();
      this.a(dca.bs, mr.e.b);
      this.c(dca.iE, mr.e.b);
      this.c(dca.iF, mr.e.b);
      this.c(dca.iG, mr.e.b);
      this.c(dca.iH, mr.e.a);
      this.c(dca.iI, mr.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dca.mw, dca.mr, dca.mm, dca.mh, dca.mG, dca.mB, dca.mQ, dca.mL);
      this.a(dca.mx, dca.ms, dca.mn, dca.mi, dca.mH, dca.mC, dca.mR, dca.mM);
      this.a(dca.my, dca.mt, dca.mo, dca.mj, dca.mI, dca.mD, dca.mS, dca.mN);
      this.a(dca.mz, dca.mu, dca.mp, dca.mk, dca.mJ, dca.mE, dca.mT, dca.mO);
      this.a(dca.mA, dca.mv, dca.mq, dca.ml, dca.mK, dca.mF, dca.mU, dca.mP);
      this.e(dca.fe, dca.fc);
      this.e(dca.fd, dca.fb);
      this.l(dca.ab).c(dca.ab).a(dca.av);
      this.l(dca.am).c(dca.am).a(dca.aD);
      this.a(dca.am, dca.dj, dca.ds);
      this.b(dca.aL, nk.s);
      this.l(dca.Y).c(dca.Y).a(dca.as);
      this.l(dca.ai).c(dca.ai).a(dca.aA);
      this.a(dca.ai, dca.dd, dca.do);
      this.a(dca.B, dca.fX, mr.e.b);
      this.b(dca.aI, nk.s);
      this.l(dca.Z).d(dca.Z).a(dca.at);
      this.l(dca.aj).d(dca.aj).a(dca.aB);
      this.a(dca.aj, dca.de, dca.dp);
      this.a(dca.C, dca.fY, mr.e.b);
      this.b(dca.aJ, nk.s);
      this.l(dca.W).c(dca.W).a(dca.aq);
      this.l(dca.ag).c(dca.ag).a(dca.ay);
      this.a(dca.ag, dca.dc, dca.dn);
      this.a(dca.z, dca.fV, mr.e.b);
      this.b(dca.aG, nk.s);
      this.l(dca.U).c(dca.U).a(dca.ao);
      this.l(dca.al).c(dca.al).a(dca.aw);
      this.a(dca.al, dca.da, dca.dl);
      this.a(dca.x, dca.fT, mr.e.b);
      this.b(dca.aE, nk.s);
      this.l(dca.V).c(dca.V).a(dca.ap);
      this.l(dca.af).c(dca.af).a(dca.ax);
      this.a(dca.af, dca.db, dca.dm);
      this.a(dca.y, dca.fU, mr.e.b);
      this.b(dca.aF, nk.s);
      this.l(dca.aa).c(dca.aa).a(dca.au);
      this.l(dca.ak).c(dca.ak).a(dca.aC);
      this.a(dca.ak, dca.dg, dca.dr);
      this.a(dca.D, dca.fZ, mr.e.b);
      this.b(dca.aK, nk.s);
      this.l(dca.X).c(dca.X).a(dca.ar);
      this.l(dca.ah).c(dca.ah).a(dca.az);
      this.a(dca.ah, dca.df, dca.dq);
      this.a(dca.A, dca.fW, mr.e.b);
      this.b(dca.aH, nk.s);
      this.l(dca.os).b(dca.os).a(dca.ou);
      this.l(dca.ot).b(dca.ot).a(dca.ov);
      this.a(dca.ot, dca.dh, dca.dt);
      this.a(dca.ox, dca.pm, mr.e.b);
      this.n(dca.oD, dca.po);
      this.l(dca.oj).b(dca.oj).a(dca.ol);
      this.l(dca.ok).b(dca.ok).a(dca.om);
      this.a(dca.ok, dca.di, dca.du);
      this.a(dca.oo, dca.pn, mr.e.b);
      this.n(dca.oq, dca.pp);
      this.l(dca.ae).d(dca.ae);
      this.l(dca.an).d(dca.an);
      this.a(dca.v, dca.dk, dca.dv);
      this.b(dca.or, mr.e.b);
      this.a(crm.dF);
      this.i(dca.dy);
      this.k(dca.hY);
      this.u();
      this.n(dca.cP);
      this.o(dca.bp);
      this.o(dca.bq);
      this.o(dca.hh);
      this.t();
      this.q(dca.fN);
      this.q(dca.kG);
      this.q(dca.kH);
      this.r(dca.gS);
      this.r(dca.gT);
      this.r(dca.gU);
      this.o();
      this.p();
      this.d(dca.cD, nk.h);
      this.d(dca.nW, nk.h);
      this.d(dca.nV, nk.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dca.eK, dca.eS);
      this.k(dca.m, dca.eO);
      this.k(dca.eJ, dca.eR);
      this.k(dca.eI, dca.eQ);
      this.az();
      this.k(dca.eH, dca.eP);
      this.aA();
      csn.h().forEach($$0 -> this.a($$0, nf.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dca.hX);
      my.a<Integer> $$0 = my.a(dpp.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ajt $$3 = ni.a(crm.hB, $$2);
         $$0.a($$1, na.a().a(nb.c, nh.aa.a(dca.hX, $$2, ni.h($$3), this.c)));
         nh.bx.a(nf.a(crm.hB, $$2), ni.k($$3), this.c);
      }

      this.b.accept(mx.a(dca.hX).a($$0));
   }

   private void o(dby $$0, dby $$1) {
      this.a($$0.p());
      ni $$2 = ni.b(ni.G($$0));
      ni $$3 = ni.b(ni.a($$0, "_lit"));
      ajt $$4 = nh.bH.a($$0, "_one_candle", $$2, this.c);
      ajt $$5 = nh.bI.a($$0, "_two_candles", $$2, this.c);
      ajt $$6 = nh.bJ.a($$0, "_three_candles", $$2, this.c);
      ajt $$7 = nh.bK.a($$0, "_four_candles", $$2, this.c);
      ajt $$8 = nh.bH.a($$0, "_one_candle_lit", $$3, this.c);
      ajt $$9 = nh.bI.a($$0, "_two_candles_lit", $$3, this.c);
      ajt $$10 = nh.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      ajt $$11 = nh.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            mx.a($$0)
               .a(
                  my.a(dpp.az, dpp.r)
                     .a(1, false, na.a().a(nb.c, $$4))
                     .a(2, false, na.a().a(nb.c, $$5))
                     .a(3, false, na.a().a(nb.c, $$6))
                     .a(4, false, na.a().a(nb.c, $$7))
                     .a(1, true, na.a().a(nb.c, $$8))
                     .a(2, true, na.a().a(nb.c, $$9))
                     .a(3, true, na.a().a(nb.c, $$10))
                     .a(4, true, na.a().a(nb.c, $$11))
               )
         );
      ajt $$12 = nh.bL.a($$1, ni.a($$0, false), this.c);
      ajt $$13 = nh.bL.a($$1, "_lit", ni.a($$0, true), this.c);
      this.b.accept(mx.a($$1).a(a(dpp.r, $$13, $$12)));
   }

   class a {
      private final ajt b;

      public a(ajt $$0, dby $$1) {
         this.b = nh.aa.a($$0, ni.u($$1), mr.this.c);
      }

      public mr.a a(dby... $$0) {
         for (dby $$1 : $$0) {
            mr.this.b.accept(mr.c($$1, this.b));
         }

         return this;
      }

      public mr.a b(dby... $$0) {
         for (dby $$1 : $$0) {
            mr.this.c($$1);
         }

         return this.a($$0);
      }

      public mr.a a(ng $$0, dby... $$1) {
         for (dby $$2 : $$1) {
            $$0.a(nf.a($$2.p()), ni.u($$2), mr.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final ni b;
      private final Map<ng, ajt> c = Maps.newHashMap();
      @Nullable
      private kv d;
      @Nullable
      private ajt e;
      private final Set<dby> f = new HashSet<>();

      public b(ni $$0) {
         this.b = $$0;
      }

      public mr.b a(dby $$0, ng $$1) {
         this.e = $$1.a($$0, this.b, mr.this.c);
         if (mr.this.f.containsKey($$0)) {
            mr.this.b.accept(mr.this.f.get($$0).create($$0, this.e, this.b, mr.this.c));
         } else {
            mr.this.b.accept(mr.c($$0, this.e));
         }

         return this;
      }

      public mr.b a(dby $$0, dby $$1) {
         ajt $$2 = nf.a($$0);
         mr.this.b.accept(mr.c($$1, $$2));
         mr.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public mr.b a(dby $$0) {
         ajt $$1 = nh.s.a($$0, this.b, mr.this.c);
         ajt $$2 = nh.t.a($$0, this.b, mr.this.c);
         mr.this.b.accept(mr.b($$0, $$1, $$2));
         ajt $$3 = nh.u.a($$0, this.b, mr.this.c);
         mr.this.a($$0, $$3);
         return this;
      }

      public mr.b b(dby $$0) {
         ajt $$1 = nh.M.a($$0, this.b, mr.this.c);
         ajt $$2 = nh.N.a($$0, this.b, mr.this.c);
         ajt $$3 = nh.O.a($$0, this.b, mr.this.c);
         mr.this.b.accept(mr.a($$0, $$1, $$2, $$3));
         ajt $$4 = nh.P.a($$0, this.b, mr.this.c);
         mr.this.a($$0, $$4);
         return this;
      }

      public mr.b c(dby $$0) {
         ni $$1 = ni.p($$0);
         ajt $$2 = nh.D.a($$0, $$1, mr.this.c);
         ajt $$3 = nh.E.a($$0, $$1, mr.this.c);
         ajt $$4 = nh.F.a($$0, $$1, mr.this.c);
         ajt $$5 = nh.G.a($$0, $$1, mr.this.c);
         ajt $$6 = nh.H.a($$0, $$1, mr.this.c);
         mr.this.b.accept(mr.a($$0, $$2, $$3, $$4, $$5, $$6));
         ajt $$7 = nh.I.a($$0, $$1, mr.this.c);
         mr.this.a($$0, $$7);
         return this;
      }

      public mr.b d(dby $$0) {
         ajt $$1 = nh.J.a($$0, this.b, mr.this.c);
         ajt $$2 = nh.K.a($$0, this.b, mr.this.c);
         mr.this.b.accept(mr.c($$0, $$1, $$2));
         ajt $$3 = nh.L.a($$0, this.b, mr.this.c);
         mr.this.a($$0, $$3);
         return this;
      }

      public mr.b e(dby $$0) {
         ni $$1 = ni.p($$0);
         ajt $$2 = nh.R.a($$0, $$1, mr.this.c);
         ajt $$3 = nh.Q.a($$0, $$1, mr.this.c);
         ajt $$4 = nh.T.a($$0, $$1, mr.this.c);
         ajt $$5 = nh.S.a($$0, $$1, mr.this.c);
         mr.this.b.accept(mr.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public mr.b f(dby $$0) {
         ajt $$1 = nh.V.a($$0, this.b, mr.this.c);
         ajt $$2 = nh.U.a($$0, this.b, mr.this.c);
         ajt $$3 = nh.X.a($$0, this.b, mr.this.c);
         ajt $$4 = nh.W.a($$0, this.b, mr.this.c);
         mr.this.b.accept(mr.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public mr.b g(dby $$0) {
         ajt $$1 = nh.Y.a($$0, this.b, mr.this.c);
         ajt $$2 = nh.Z.a($$0, this.b, mr.this.c);
         mr.this.b.accept(mr.e($$0, $$1, $$2));
         return this;
      }

      public mr.b h(dby $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dby $$1 = this.d.b().get(kv.b.r);
            ajt $$2 = nh.aa.a($$0, this.b, mr.this.c);
            mr.this.b.accept(mr.c($$0, $$2));
            mr.this.b.accept(mr.c($$1, $$2));
            mr.this.a($$0.p());
            mr.this.c($$1);
            return this;
         }
      }

      public mr.b i(dby $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ajt $$1 = this.a(nh.ab, $$0);
            ajt $$2 = this.a(nh.ac, $$0);
            mr.this.b.accept(mr.e($$0, $$1, $$2, this.e));
            mr.this.a($$0, $$1);
            return this;
         }
      }

      public mr.b j(dby $$0) {
         ajt $$1 = this.a(nh.af, $$0);
         ajt $$2 = this.a(nh.ae, $$0);
         ajt $$3 = this.a(nh.ag, $$0);
         mr.this.b.accept(mr.b($$0, $$1, $$2, $$3));
         mr.this.a($$0, $$2);
         return this;
      }

      private mr.b k(dby $$0) {
         nk $$1 = mr.this.g.getOrDefault($$0, nk.a.get($$0));
         ajt $$2 = $$1.a($$0, mr.this.c);
         mr.this.b.accept(mr.c($$0, $$2));
         return this;
      }

      private mr.b l(dby $$0) {
         mr.this.i($$0);
         return this;
      }

      private void m(dby $$0) {
         if (mr.this.e.contains($$0)) {
            mr.this.k($$0);
         } else {
            mr.this.j($$0);
         }
      }

      private ajt a(ng $$0, dby $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, mr.this.c));
      }

      public mr.b a(kv $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<mr.b, dby> $$2 = mr.h.get($$0x);
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
      mu create(dby var1, ajt var2, ni var3, BiConsumer<ajt, Supplier<JsonElement>> var4);
   }

   static record d(ng a, String b) {
   }

   static enum e {
      a,
      b;

      public ng a() {
         return this == a ? nh.ap : nh.ao;
      }

      public ng b() {
         return this == a ? nh.ar : nh.aq;
      }
   }

   class f {
      private final ni b;

      public f(ni $$0) {
         this.b = $$0;
      }

      public mr.f a(dby $$0) {
         ni $$1 = this.b.c(nj.d, this.b.a(nj.i));
         ajt $$2 = nh.j.a($$0, $$1, mr.this.c);
         mr.this.b.accept(mr.d($$0, $$2));
         return this;
      }

      public mr.f b(dby $$0) {
         ajt $$1 = nh.j.a($$0, this.b, mr.this.c);
         mr.this.b.accept(mr.d($$0, $$1));
         return this;
      }

      public mr.f c(dby $$0) {
         ajt $$1 = nh.j.a($$0, this.b, mr.this.c);
         ajt $$2 = nh.k.a($$0, this.b, mr.this.c);
         mr.this.b.accept(mr.d($$0, $$1, $$2));
         return this;
      }

      public mr.f d(dby $$0) {
         mr.this.b.accept(mr.a($$0, this.b, mr.this.c));
         return this;
      }
   }
}
